import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class230 implements Runnable {

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!su;")
	private final Class227 aClass227_9 = new Class227();

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "Z")
	private boolean aBoolean438 = false;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
	public int anInt6264 = 0;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	static {
		new Class7(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class230(@OriginalArg(0) Class180 arg0) {
		@Pc(20) Class9 local20 = arg0.method4084(5, this);
		while (local20.anInt368 == 0) {
			Static224.method3441(10L);
		}
		if (local20.anInt368 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method5211() {
		this.aBoolean438 = true;
		@Pc(9) Class227 local9 = this.aClass227_9;
		synchronized (this.aClass227_9) {
			this.aClass227_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!eo;BI)Lclient!io;")
	public Class1_Sub2_Sub8_Sub1 method5212(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub8_Sub1 local9 = new Class1_Sub2_Sub8_Sub1();
		local9.anInt3174 = 1;
		@Pc(15) Class227 local15 = this.aClass227_9;
		synchronized (this.aClass227_9) {
			@Pc(23) Class1_Sub2_Sub8_Sub1 local23 = (Class1_Sub2_Sub8_Sub1) this.aClass227_9.method5109();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong213 && local23.aClass65_4 == arg0 && local23.anInt3174 == 2) {
					local9.aByteArray55 = local23.aByteArray55;
					local9.aBoolean385 = false;
					return local9;
				}
				local23 = (Class1_Sub2_Sub8_Sub1) this.aClass227_9.method5107();
			}
		}
		local9.aByteArray55 = arg0.method1787(arg1);
		local9.aBoolean384 = true;
		local9.aBoolean385 = false;
		return local9;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!io;)V")
	private void method5213(@OriginalArg(1) Class1_Sub2_Sub8_Sub1 arg0) {
		@Pc(2) Class227 local2 = this.aClass227_9;
		synchronized (this.aClass227_9) {
			this.aClass227_9.method5106(arg0);
			this.anInt6264++;
			this.aClass227_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([BLclient!eo;IZ)Lclient!io;")
	public Class1_Sub2_Sub8_Sub1 method5215(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2_Sub8_Sub1 local7 = new Class1_Sub2_Sub8_Sub1();
		local7.anInt3174 = 2;
		local7.aLong213 = arg2;
		local7.aBoolean384 = false;
		local7.aClass65_4 = arg1;
		local7.aByteArray55 = arg0;
		this.method5213(local7);
		return local7;
	}

	@OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean438) {
			@Pc(10) Class227 local10 = this.aClass227_9;
			@Pc(18) Class1_Sub2_Sub8_Sub1 local18;
			synchronized (this.aClass227_9) {
				local18 = (Class1_Sub2_Sub8_Sub1) this.aClass227_9.method5104();
				if (local18 == null) {
					try {
						this.aClass227_9.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6264--;
			}
			try {
				if (local18.anInt3174 == 2) {
					local18.aClass65_4.method1785(local18.aByteArray55.length, local18.aByteArray55, (int) local18.aLong213);
				} else if (local18.anInt3174 == 3) {
					local18.aByteArray55 = local18.aClass65_4.method1787((int) local18.aLong213);
				}
			} catch (@Pc(78) Exception local78) {
				Static158.method2570(local78, null);
			}
			local18.aBoolean385 = false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!eo;B)Lclient!io;")
	public Class1_Sub2_Sub8_Sub1 method5218(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(7) Class1_Sub2_Sub8_Sub1 local7 = new Class1_Sub2_Sub8_Sub1();
		local7.aBoolean384 = false;
		local7.anInt3174 = 3;
		local7.aClass65_4 = arg1;
		local7.aLong213 = arg0;
		this.method5213(local7);
		return local7;
	}
}
