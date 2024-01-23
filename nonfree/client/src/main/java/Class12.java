import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!qi;")
	private Class144 aClass144_2 = new Class144();

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt350 = 0;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class12() {
		@Pc(20) Class28 local20 = Static299.aClass177_5.method4678(this, 5);
		while (local20.anInt726 == 0) {
			Static134.method2329(10L);
		}
		if (local20.anInt726 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!co;)Lclient!ni;")
	public Class2_Sub3_Sub14_Sub2 method306(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(7) Class2_Sub3_Sub14_Sub2 local7 = new Class2_Sub3_Sub14_Sub2();
		local7.aLong295 = arg0;
		local7.anInt3793 = 3;
		local7.aClass35_2 = arg1;
		local7.aBoolean322 = false;
		this.method311(local7);
		return local7;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLclient!co;[B)Lclient!ni;")
	public Class2_Sub3_Sub14_Sub2 method307(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class2_Sub3_Sub14_Sub2 local7 = new Class2_Sub3_Sub14_Sub2();
		local7.aLong295 = arg0;
		local7.aClass35_2 = arg1;
		local7.aByteArray32 = arg2;
		local7.anInt3793 = 2;
		local7.aBoolean322 = false;
		this.method311(local7);
		return local7;
	}

	@OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean28) {
			@Pc(12) Class144 local12 = this.aClass144_2;
			@Pc(19) Class2_Sub3_Sub14_Sub2 local19;
			synchronized (this.aClass144_2) {
				local19 = (Class2_Sub3_Sub14_Sub2) this.aClass144_2.method3665();
				if (local19 == null) {
					try {
						this.aClass144_2.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt350--;
			}
			try {
				if (local19.anInt3793 == 2) {
					local19.aClass35_2.method728((int) local19.aLong295, local19.aByteArray32, local19.aByteArray32.length);
				} else if (local19.anInt3793 == 3) {
					local19.aByteArray32 = local19.aClass35_2.method727((int) local19.aLong295);
				}
			} catch (@Pc(79) Exception local79) {
				Static108.method2009(local79, null);
			}
			local19.aBoolean320 = false;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!ni;)V")
	private void method311(@OriginalArg(1) Class2_Sub3_Sub14_Sub2 arg0) {
		@Pc(7) Class144 local7 = this.aClass144_2;
		synchronized (this.aClass144_2) {
			this.aClass144_2.method3662(arg0);
			this.anInt350++;
			this.aClass144_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public void method312() {
		this.aBoolean28 = true;
		@Pc(10) Class144 local10 = this.aClass144_2;
		synchronized (this.aClass144_2) {
			this.aClass144_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IILclient!co;)Lclient!ni;")
	public Class2_Sub3_Sub14_Sub2 method314(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(9) Class2_Sub3_Sub14_Sub2 local9 = new Class2_Sub3_Sub14_Sub2();
		local9.anInt3793 = 1;
		@Pc(16) Class144 local16 = this.aClass144_2;
		synchronized (this.aClass144_2) {
			@Pc(25) Class2_Sub3_Sub14_Sub2 local25 = (Class2_Sub3_Sub14_Sub2) this.aClass144_2.method3663();
			while (true) {
				if (local25 == null) {
					break;
				}
				if (local25.aLong295 == (long) arg0 && local25.aClass35_2 == arg1 && local25.anInt3793 == 2) {
					local9.aByteArray32 = local25.aByteArray32;
					local9.aBoolean320 = false;
					return local9;
				}
				local25 = (Class2_Sub3_Sub14_Sub2) this.aClass144_2.method3659();
			}
		}
		local9.aByteArray32 = arg1.method727(arg0);
		local9.aBoolean320 = false;
		local9.aBoolean322 = true;
		return local9;
	}
}
