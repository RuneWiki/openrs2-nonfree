import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class82 implements Runnable {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!jo;")
	private Class86 aClass86_7 = new Class86();

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public int anInt2529 = 0;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class82() {
		@Pc(20) Class119 local20 = Static95.aClass184_3.method4621(this, 5);
		while (local20.anInt3695 == 0) {
			Static193.method3169(10L);
		}
		if (local20.anInt3695 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!g;IB)Lclient!aj;")
	public Class4_Sub2_Sub1_Sub1 method2049(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class4_Sub2_Sub1_Sub1 local9 = new Class4_Sub2_Sub1_Sub1();
		local9.anInt252 = 1;
		@Pc(16) Class86 local16 = this.aClass86_7;
		synchronized (this.aClass86_7) {
			@Pc(23) Class4_Sub2_Sub1_Sub1 local23 = (Class4_Sub2_Sub1_Sub1) this.aClass86_7.method2183();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong212 && local23.aClass55_1 == arg0 && local23.anInt252 == 2) {
					local9.aByteArray2 = local23.aByteArray2;
					local9.aBoolean388 = false;
					return local9;
				}
				local23 = (Class4_Sub2_Sub1_Sub1) this.aClass86_7.method2184();
			}
		}
		local9.aByteArray2 = arg0.method1429(arg1);
		local9.aBoolean388 = false;
		local9.aBoolean389 = true;
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!aj;)V")
	private void method2050(@OriginalArg(1) Class4_Sub2_Sub1_Sub1 arg0) {
		@Pc(7) Class86 local7 = this.aClass86_7;
		synchronized (this.aClass86_7) {
			this.aClass86_7.method2185(arg0);
			this.anInt2529++;
			this.aClass86_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean162) {
			@Pc(8) Class86 local8 = this.aClass86_7;
			@Pc(15) Class4_Sub2_Sub1_Sub1 local15;
			synchronized (this.aClass86_7) {
				local15 = (Class4_Sub2_Sub1_Sub1) this.aClass86_7.method2186();
				if (local15 == null) {
					try {
						this.aClass86_7.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
					continue;
				}
				this.anInt2529--;
			}
			try {
				if (local15.anInt252 == 2) {
					local15.aClass55_1.method1430(local15.aByteArray2, local15.aByteArray2.length, (int) local15.aLong212);
				} else if (local15.anInt252 == 3) {
					local15.aByteArray2 = local15.aClass55_1.method1429((int) local15.aLong212);
				}
			} catch (@Pc(82) Exception local82) {
				Static204.method3269(local82, null);
			}
			local15.aBoolean388 = false;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BLclient!g;I)Lclient!aj;")
	public Class4_Sub2_Sub1_Sub1 method2053(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class55 arg2) {
		@Pc(7) Class4_Sub2_Sub1_Sub1 local7 = new Class4_Sub2_Sub1_Sub1();
		local7.aLong212 = arg0;
		local7.aClass55_1 = arg2;
		local7.anInt252 = 2;
		local7.aByteArray2 = arg1;
		local7.aBoolean389 = false;
		this.method2050(local7);
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!g;I)Lclient!aj;")
	public Class4_Sub2_Sub1_Sub1 method2054(@OriginalArg(1) Class55 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub2_Sub1_Sub1 local7 = new Class4_Sub2_Sub1_Sub1();
		local7.aBoolean389 = false;
		local7.anInt252 = 3;
		local7.aLong212 = arg1;
		local7.aClass55_1 = arg0;
		this.method2050(local7);
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public void method2055() {
		this.aBoolean162 = true;
		@Pc(6) Class86 local6 = this.aClass86_7;
		synchronized (this.aClass86_7) {
			this.aClass86_7.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread1 = null;
	}
}
