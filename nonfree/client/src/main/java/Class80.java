import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!ea;")
	private Class37 aClass37_8 = new Class37();

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public int anInt2644 = 0;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class80() {
		@Pc(20) Class111 local20 = Static164.aClass102_2.method2893(5, this);
		while (local20.anInt3788 == 0) {
			Static138.method2475(10L);
		}
		if (local20.anInt3788 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ma;BI)Lclient!nc;")
	public Class2_Sub8_Sub2_Sub2 method1999(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub8_Sub2_Sub2 local9 = new Class2_Sub8_Sub2_Sub2();
		local9.anInt3961 = 1;
		@Pc(16) Class37 local16 = this.aClass37_8;
		synchronized (this.aClass37_8) {
			@Pc(23) Class2_Sub8_Sub2_Sub2 local23 = (Class2_Sub8_Sub2_Sub2) this.aClass37_8.method1139();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong212 && local23.aClass108_3 == arg0 && local23.anInt3961 == 2) {
					local9.aBoolean272 = false;
					local9.aByteArray42 = local23.aByteArray42;
					return local9;
				}
				local23 = (Class2_Sub8_Sub2_Sub2) this.aClass37_8.method1145();
			}
		}
		local9.aByteArray42 = arg0.method3085(arg1);
		local9.aBoolean271 = true;
		local9.aBoolean272 = false;
		return local9;
	}

	@OriginalMember(owner = "client!id", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean195) {
			@Pc(12) Class37 local12 = this.aClass37_8;
			@Pc(19) Class2_Sub8_Sub2_Sub2 local19;
			synchronized (this.aClass37_8) {
				local19 = (Class2_Sub8_Sub2_Sub2) this.aClass37_8.method1146();
				if (local19 == null) {
					try {
						this.aClass37_8.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
					continue;
				}
				this.anInt2644--;
			}
			try {
				if (local19.anInt3961 == 2) {
					local19.aClass108_3.method3086(local19.aByteArray42.length, local19.aByteArray42, (int) local19.aLong212);
				} else if (local19.anInt3961 == 3) {
					local19.aByteArray42 = local19.aClass108_3.method3085((int) local19.aLong212);
				}
			} catch (@Pc(83) Exception local83) {
				Static183.method3240(local83, null);
			}
			local19.aBoolean272 = false;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BLclient!ma;I)Lclient!nc;")
	public Class2_Sub8_Sub2_Sub2 method2002(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class108 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub8_Sub2_Sub2 local7 = new Class2_Sub8_Sub2_Sub2();
		local7.anInt3961 = 2;
		local7.aClass108_3 = arg1;
		local7.aBoolean271 = false;
		local7.aByteArray42 = arg0;
		local7.aLong212 = arg2;
		this.method2006(local7);
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public void method2004() {
		this.aBoolean195 = true;
		@Pc(6) Class37 local6 = this.aClass37_8;
		synchronized (this.aClass37_8) {
			this.aClass37_8.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ma;Z)Lclient!nc;")
	public Class2_Sub8_Sub2_Sub2 method2005(@OriginalArg(0) int arg0, @OriginalArg(1) Class108 arg1) {
		@Pc(7) Class2_Sub8_Sub2_Sub2 local7 = new Class2_Sub8_Sub2_Sub2();
		local7.aClass108_3 = arg1;
		local7.aBoolean271 = false;
		local7.aLong212 = arg0;
		local7.anInt3961 = 3;
		this.method2006(local7);
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!nc;)V")
	private void method2006(@OriginalArg(1) Class2_Sub8_Sub2_Sub2 arg0) {
		@Pc(15) Class37 local15 = this.aClass37_8;
		synchronized (this.aClass37_8) {
			this.aClass37_8.method1144(arg0);
			this.anInt2644++;
			this.aClass37_8.notifyAll();
		}
	}
}
