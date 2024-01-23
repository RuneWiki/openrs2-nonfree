import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!ll;")
	private Class114 aClass114_15 = new Class114();

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!ll;")
	private Class114 aClass114_16 = new Class114();

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private int anInt3269 = 0;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	private int anInt3270 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3361(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3270 < 0) {
				this.method2686(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3269 + arg2 < this.anInt3270) {
				this.anInt3269 += arg2;
				this.method2686(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3270 - this.anInt3269;
			this.method2686(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3269 += local33;
			this.method2682();
			@Pc(60) Class4_Sub33 local60 = (Class4_Sub33) this.aClass114_16.method2623();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4848(this);
				if (local68 < 0) {
					local60.anInt6075 = 0;
					this.method2681(local60);
				} else {
					local60.anInt6075 = local68;
					this.method2685(local60.aClass4_235, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!wm;)V")
	private void method2681(@OriginalArg(0) Class4_Sub33 arg0) {
		arg0.method4854();
		arg0.method4847();
		@Pc(9) Class4 local9 = this.aClass114_16.aClass4_117.aClass4_235;
		if (local9 == this.aClass114_16.aClass4_117) {
			this.anInt3270 = -1;
		} else {
			this.anInt3270 = ((Class4_Sub33) local9).anInt6075;
		}
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "()V")
	private void method2682() {
		if (this.anInt3269 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub33 local8 = (Class4_Sub33) this.aClass114_16.method2623(); local8 != null; local8 = (Class4_Sub33) this.aClass114_16.method2629()) {
			local8.anInt6075 -= this.anInt3269;
		}
		this.anInt3270 -= this.anInt3269;
		this.anInt3269 = 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tf;)V")
	public synchronized void method2683(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.method4854();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3358(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3270 < 0) {
				this.method2684(arg0);
				return;
			}
			if (this.anInt3269 + arg0 < this.anInt3270) {
				this.anInt3269 += arg0;
				this.method2684(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3270 - this.anInt3269;
			this.method2684(local29);
			arg0 -= local29;
			this.anInt3269 += local29;
			this.method2682();
			@Pc(50) Class4_Sub33 local50 = (Class4_Sub33) this.aClass114_16.method2623();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4848(this);
				if (local58 < 0) {
					local50.anInt6075 = 0;
					this.method2681(local50);
				} else {
					local50.anInt6075 = local58;
					this.method2685(local50.aClass4_235, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	private void method2684(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass114_15.method2623(); local5 != null; local5 = (Class4_Sub6) this.aClass114_15.method2629()) {
			local5.method3358(arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3362() {
		return (Class4_Sub6) this.aClass114_15.method2629();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ni;Lclient!wm;)V")
	private void method2685(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub33 arg1) {
		while (arg0 != this.aClass114_16.aClass4_117 && ((Class4_Sub33) arg0).anInt6075 <= arg1.anInt6075) {
			arg0 = arg0.aClass4_235;
		}
		Static205.method3280(arg0, arg1);
		this.anInt3270 = ((Class4_Sub33) this.aClass114_16.aClass4_117.aClass4_235).anInt6075;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "()I")
	@Override
	public int method3359() {
		return 0;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "([III)V")
	private void method2686(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub6 local5 = (Class4_Sub6) this.aClass114_15.method2623(); local5 != null; local5 = (Class4_Sub6) this.aClass114_15.method2629()) {
			local5.method3364(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3363() {
		return (Class4_Sub6) this.aClass114_15.method2623();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lclient!tf;)V")
	public synchronized void method2687(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aClass114_15.method2620(arg0);
	}
}
