import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class15 implements Runnable {

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!vi;")
	private final Class248 aClass248_2 = new Class248();

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public int anInt610 = 0;

	@OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Class175("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class15(@OriginalArg(0) Class103 arg0) {
		@Pc(20) Class190 local20 = arg0.method2832(this, 5);
		while (local20.anInt5799 == 0) {
			Static135.method2458(10L);
		}
		if (local20.anInt5799 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!jb;IB)Lclient!hu;")
	public Class3_Sub3_Sub3_Sub2 method566(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub3_Sub3_Sub2 local7 = new Class3_Sub3_Sub3_Sub2();
		local7.aClass117_13 = arg0;
		local7.anInt3510 = 3;
		local7.aBoolean273 = false;
		local7.aLong175 = arg1;
		this.method571(local7);
		return local7;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public void method567() {
		this.aBoolean27 = true;
		@Pc(9) Class248 local9 = this.aClass248_2;
		synchronized (this.aClass248_2) {
			this.aClass248_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!jb;B)Lclient!hu;")
	public Class3_Sub3_Sub3_Sub2 method569(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(9) Class3_Sub3_Sub3_Sub2 local9 = new Class3_Sub3_Sub3_Sub2();
		local9.anInt3510 = 1;
		@Pc(15) Class248 local15 = this.aClass248_2;
		synchronized (this.aClass248_2) {
			@Pc(28) Class3_Sub3_Sub3_Sub2 local28 = (Class3_Sub3_Sub3_Sub2) this.aClass248_2.method5661();
			while (true) {
				if (local28 == null) {
					break;
				}
				if ((long) arg0 == local28.aLong175 && arg1 == local28.aClass117_13 && local28.anInt3510 == 2) {
					local9.aByteArray39 = local28.aByteArray39;
					local9.aBoolean272 = false;
					return local9;
				}
				local28 = (Class3_Sub3_Sub3_Sub2) this.aClass248_2.method5657();
			}
		}
		local9.aByteArray39 = arg1.method3107(arg0);
		local9.aBoolean272 = false;
		local9.aBoolean273 = true;
		return local9;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([BIBLclient!jb;)Lclient!hu;")
	public Class3_Sub3_Sub3_Sub2 method570(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class117 arg2) {
		@Pc(12) Class3_Sub3_Sub3_Sub2 local12 = new Class3_Sub3_Sub3_Sub2();
		local12.aClass117_13 = arg2;
		local12.aBoolean273 = false;
		local12.aLong175 = arg1;
		local12.anInt3510 = 2;
		local12.aByteArray39 = arg0;
		this.method571(local12);
		return local12;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!hu;B)V")
	private void method571(@OriginalArg(0) Class3_Sub3_Sub3_Sub2 arg0) {
		@Pc(2) Class248 local2 = this.aClass248_2;
		synchronized (this.aClass248_2) {
			this.aClass248_2.method5659(arg0);
			this.anInt610++;
			this.aClass248_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!au", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean27) {
			@Pc(6) Class248 local6 = this.aClass248_2;
			@Pc(14) Class3_Sub3_Sub3_Sub2 local14;
			synchronized (this.aClass248_2) {
				local14 = (Class3_Sub3_Sub3_Sub2) this.aClass248_2.method5662();
				if (local14 == null) {
					try {
						this.aClass248_2.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt610--;
			}
			try {
				if (local14.anInt3510 == 2) {
					local14.aClass117_13.method3108((int) local14.aLong175, local14.aByteArray39, local14.aByteArray39.length);
				} else if (local14.anInt3510 == 3) {
					local14.aByteArray39 = local14.aClass117_13.method3107((int) local14.aLong175);
				}
			} catch (@Pc(72) Exception local72) {
				Static379.method1671(local72, null);
			}
			local14.aBoolean272 = false;
		}
	}
}
