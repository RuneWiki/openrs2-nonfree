import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class181 implements Runnable {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!oga;")
	private final Class253 aClass253_3 = new Class253();

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt4295 = 0;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ew;)V")
	public Class181(@OriginalArg(0) Class99 arg0) {
		@Pc(20) Class5 local20 = arg0.method1787(this, 5);
		while (local20.anInt151 == 0) {
			Static263.method3671(10L);
		}
		if (local20.anInt151 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject1;
	}

	@OriginalMember(owner = "client!jq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean320) {
			@Pc(10) Class253 local10 = this.aClass253_3;
			@Pc(18) Class2_Sub2_Sub2_Sub1 local18;
			synchronized (this.aClass253_3) {
				local18 = (Class2_Sub2_Sub2_Sub1) this.aClass253_3.method5327();
				if (local18 == null) {
					try {
						this.aClass253_3.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt4295--;
			}
			try {
				if (local18.anInt3292 == 2) {
					local18.aClass245_1.method5159(local18.aByteArray44, local18.aByteArray44.length, (int) local18.aLong269);
				} else if (local18.anInt3292 == 3) {
					local18.aByteArray44 = local18.aClass245_1.method5154((int) local18.aLong269);
				}
			} catch (@Pc(78) Exception local78) {
				Static357.method5094(local78, null);
			}
			local18.aBoolean390 = false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public void method3657() {
		this.aBoolean320 = true;
		@Pc(9) Class253 local9 = this.aClass253_3;
		synchronized (this.aClass253_3) {
			this.aClass253_3.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II[BLclient!nr;)Lclient!ie;")
	public Class2_Sub2_Sub2_Sub1 method3658(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class245 arg2) {
		@Pc(12) Class2_Sub2_Sub2_Sub1 local12 = new Class2_Sub2_Sub2_Sub1();
		local12.aLong269 = arg0;
		local12.aByteArray44 = arg1;
		local12.aClass245_1 = arg2;
		local12.aBoolean391 = false;
		local12.anInt3292 = 2;
		this.method3661(local12);
		return local12;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!nr;II)Lclient!ie;")
	public Class2_Sub2_Sub2_Sub1 method3659(@OriginalArg(0) Class245 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub2_Sub2_Sub1 local7 = new Class2_Sub2_Sub2_Sub1();
		local7.aBoolean391 = false;
		local7.aLong269 = arg1;
		local7.aClass245_1 = arg0;
		local7.anInt3292 = 3;
		this.method3661(local7);
		return local7;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!nr;BI)Lclient!ie;")
	public Class2_Sub2_Sub2_Sub1 method3660(@OriginalArg(0) Class245 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub2_Sub2_Sub1 local9 = new Class2_Sub2_Sub2_Sub1();
		local9.anInt3292 = 1;
		@Pc(15) Class253 local15 = this.aClass253_3;
		synchronized (this.aClass253_3) {
			@Pc(31) Class2_Sub2_Sub2_Sub1 local31 = (Class2_Sub2_Sub2_Sub1) this.aClass253_3.method5321();
			while (true) {
				if (local31 == null) {
					break;
				}
				if (local31.aLong269 == (long) arg1 && arg0 == local31.aClass245_1 && local31.anInt3292 == 2) {
					local9.aBoolean390 = false;
					local9.aByteArray44 = local31.aByteArray44;
					return local9;
				}
				local31 = (Class2_Sub2_Sub2_Sub1) this.aClass253_3.method5323();
			}
		}
		local9.aByteArray44 = arg0.method5154(arg1);
		local9.aBoolean390 = false;
		local9.aBoolean391 = true;
		return local9;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!ie;)V")
	private void method3661(@OriginalArg(1) Class2_Sub2_Sub2_Sub1 arg0) {
		@Pc(2) Class253 local2 = this.aClass253_3;
		synchronized (this.aClass253_3) {
			this.aClass253_3.method5329(arg0);
			this.anInt4295++;
			this.aClass253_3.notifyAll();
		}
	}
}
