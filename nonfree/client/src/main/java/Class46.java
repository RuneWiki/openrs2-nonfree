import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "Lclient!pf;")
	private final Class279 aClass279_4 = new Class279();

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
	public int anInt1357 = 0;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class46(@OriginalArg(0) Class48 arg0) {
		@Pc(20) Class268 local20 = arg0.method1317(5, this);
		while (local20.anInt8008 == 0) {
			Static650.method9565(10L);
		}
		if (local20.anInt8008 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject19;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public void method1294() {
		this.aBoolean74 = true;
		@Pc(9) Class279 local9 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILclient!ce;)Lclient!nq;")
	public Class2_Sub1_Sub6_Sub2 method1295(@OriginalArg(0) int arg0, @OriginalArg(2) Class47 arg1) {
		@Pc(15) Class2_Sub1_Sub6_Sub2 local15 = new Class2_Sub1_Sub6_Sub2();
		local15.aBoolean567 = false;
		local15.aClass47_2 = arg1;
		local15.aLong296 = (long) arg0;
		local15.anInt7651 = 3;
		this.method1299(local15);
		return local15;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLclient!ce;[BI)Lclient!nq;")
	public Class2_Sub1_Sub6_Sub2 method1296(@OriginalArg(1) Class47 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub1_Sub6_Sub2 local7 = new Class2_Sub1_Sub6_Sub2();
		local7.aByteArray68 = arg1;
		local7.anInt7651 = 2;
		local7.aLong296 = (long) arg2;
		local7.aClass47_2 = arg0;
		local7.aBoolean567 = false;
		this.method1299(local7);
		return local7;
	}

	@OriginalMember(owner = "client!cda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean74) {
			@Pc(6) Class279 local6 = this.aClass279_4;
			@Pc(14) Class2_Sub1_Sub6_Sub2 local14;
			synchronized (this.aClass279_4) {
				local14 = (Class2_Sub1_Sub6_Sub2) this.aClass279_4.method7291();
				if (local14 == null) {
					try {
						this.aClass279_4.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt1357--;
			}
			try {
				if (local14.anInt7651 == 2) {
					local14.aClass47_2.method1303(local14.aByteArray68, (int) local14.aLong296, local14.aByteArray68.length);
				} else if (local14.anInt7651 == 3) {
					local14.aByteArray68 = local14.aClass47_2.method1301((int) local14.aLong296);
				}
			} catch (@Pc(72) Exception local72) {
				Static165.method3319(local72, (String) null);
			}
			local14.aBoolean566 = false;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!ce;BI)Lclient!nq;")
	public Class2_Sub1_Sub6_Sub2 method1298(@OriginalArg(0) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub1_Sub6_Sub2 local14 = new Class2_Sub1_Sub6_Sub2();
		local14.anInt7651 = 1;
		@Pc(20) Class279 local20 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			@Pc(28) Class2_Sub1_Sub6_Sub2 local28 = (Class2_Sub1_Sub6_Sub2) this.aClass279_4.method7293();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg1 == local28.aLong296 && local28.aClass47_2 == arg0 && local28.anInt7651 == 2) {
					local14.aBoolean566 = false;
					local14.aByteArray68 = local28.aByteArray68;
					return local14;
				}
				local28 = (Class2_Sub1_Sub6_Sub2) this.aClass279_4.method7298();
			}
		}
		local14.aByteArray68 = arg0.method1301(arg1);
		local14.aBoolean566 = false;
		local14.aBoolean567 = true;
		return local14;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!nq;I)V")
	private void method1299(@OriginalArg(0) Class2_Sub1_Sub6_Sub2 arg0) {
		@Pc(2) Class279 local2 = this.aClass279_4;
		synchronized (this.aClass279_4) {
			this.aClass279_4.method7292(arg0);
			this.anInt1357++;
			this.aClass279_4.notifyAll();
		}
	}
}
