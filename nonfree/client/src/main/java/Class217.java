import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Lclient!th;")
	private final Class325 aClass325_4 = new Class325();

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
	public int anInt6010 = 0;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "Z")
	private boolean aBoolean448 = false;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class217(@OriginalArg(0) Class258 arg0) {
		@Pc(20) Class39 local20 = arg0.method5881(this, 5);
		while (local20.anInt894 == 0) {
			Static589.method7892(10L);
		}
		if (local20.anInt894 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!at;II)Lclient!bb;")
	public Class3_Sub7_Sub1_Sub1 method5074(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7_Sub1_Sub1 local12 = new Class3_Sub7_Sub1_Sub1();
		local12.aBoolean460 = false;
		local12.aClass22_1 = arg0;
		local12.aLong263 = arg1;
		local12.anInt603 = 3;
		this.method5078(local12);
		return local12;
	}

	@OriginalMember(owner = "client!mv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean448) {
			@Pc(10) Class325 local10 = this.aClass325_4;
			@Pc(18) Class3_Sub7_Sub1_Sub1 local18;
			synchronized (this.aClass325_4) {
				local18 = (Class3_Sub7_Sub1_Sub1) this.aClass325_4.method6860();
				if (local18 == null) {
					try {
						this.aClass325_4.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt6010--;
			}
			try {
				if (local18.anInt603 == 2) {
					local18.aClass22_1.method438(local18.aByteArray4, (int) local18.aLong263, local18.aByteArray4.length);
				} else if (local18.anInt603 == 3) {
					local18.aByteArray4 = local18.aClass22_1.method440((int) local18.aLong263);
				}
			} catch (@Pc(76) Exception local76) {
				Static172.method7826(local76, null);
			}
			local18.aBoolean458 = false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public void method5076() {
		this.aBoolean448 = true;
		@Pc(9) Class325 local9 = this.aClass325_4;
		synchronized (this.aClass325_4) {
			this.aClass325_4.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!bb;I)V")
	private void method5078(@OriginalArg(0) Class3_Sub7_Sub1_Sub1 arg0) {
		@Pc(6) Class325 local6 = this.aClass325_4;
		synchronized (this.aClass325_4) {
			this.aClass325_4.method6862(arg0);
			this.anInt6010++;
			this.aClass325_4.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILclient!at;[B)Lclient!bb;")
	public Class3_Sub7_Sub1_Sub1 method5079(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class3_Sub7_Sub1_Sub1 local7 = new Class3_Sub7_Sub1_Sub1();
		local7.aByteArray4 = arg2;
		local7.aClass22_1 = arg1;
		local7.anInt603 = 2;
		local7.aLong263 = arg0;
		local7.aBoolean460 = false;
		this.method5078(local7);
		return local7;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!at;)Lclient!bb;")
	public Class3_Sub7_Sub1_Sub1 method5080(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(9) Class3_Sub7_Sub1_Sub1 local9 = new Class3_Sub7_Sub1_Sub1();
		local9.anInt603 = 1;
		@Pc(15) Class325 local15 = this.aClass325_4;
		synchronized (this.aClass325_4) {
			@Pc(23) Class3_Sub7_Sub1_Sub1 local23 = (Class3_Sub7_Sub1_Sub1) this.aClass325_4.method6859();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong263 == (long) arg0 && local23.aClass22_1 == arg1 && local23.anInt603 == 2) {
					local9.aBoolean458 = false;
					local9.aByteArray4 = local23.aByteArray4;
					return local9;
				}
				local23 = (Class3_Sub7_Sub1_Sub1) this.aClass325_4.method6863();
			}
		}
		local9.aByteArray4 = arg1.method440(arg0);
		local9.aBoolean458 = false;
		local9.aBoolean460 = true;
		return local9;
	}
}
