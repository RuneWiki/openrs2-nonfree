import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!bg;")
	private final Class13 aClass13_14 = new Class13();

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!bg;")
	private final Class13 aClass13_15 = new Class13();

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	private int anInt3771 = -1;

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	private int anInt3772 = 0;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "([III)V")
	private void method2607(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass13_14.method303(); local5 != null; local5 = (Class2_Sub2) this.aClass13_14.method309()) {
			local5.method2851(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3771 < 0) {
				this.method2607(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3772 + arg2 < this.anInt3771) {
				this.anInt3772 += arg2;
				this.method2607(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3771 - this.anInt3772;
			this.method2607(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3772 += local33;
			this.method2613();
			@Pc(60) Class2_Sub23 local60 = (Class2_Sub23) this.aClass13_15.method303();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2630(this);
				if (local68 < 0) {
					local60.anInt3798 = 0;
					this.method2612(local60);
				} else {
					local60.anInt3798 = local68;
					this.method2611(local60.aClass2_209, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!af;)V")
	public synchronized void method2608(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass13_14.method306(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lclient!af;)V")
	public synchronized void method2609(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method3183();
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()I")
	@Override
	public int method2849() {
		return 0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2848() {
		return (Class2_Sub2) this.aClass13_14.method303();
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2850(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3771 < 0) {
				this.method2610(arg0);
				return;
			}
			if (this.anInt3772 + arg0 < this.anInt3771) {
				this.anInt3772 += arg0;
				this.method2610(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3771 - this.anInt3772;
			this.method2610(local29);
			arg0 -= local29;
			this.anInt3772 += local29;
			this.method2613();
			@Pc(50) Class2_Sub23 local50 = (Class2_Sub23) this.aClass13_15.method303();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2630(this);
				if (local58 < 0) {
					local50.anInt3798 = 0;
					this.method2612(local50);
				} else {
					local50.anInt3798 = local58;
					this.method2611(local50.aClass2_209, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	private void method2610(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass13_14.method303(); local5 != null; local5 = (Class2_Sub2) this.aClass13_14.method309()) {
			local5.method2850(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!nj;Lclient!t;)V")
	private void method2611(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		while (arg0 != this.aClass13_15.aClass2_19 && ((Class2_Sub23) arg0).anInt3798 <= arg1.anInt3798) {
			arg0 = arg0.aClass2_209;
		}
		this.aClass13_15.method305(arg0, arg1);
		this.anInt3771 = ((Class2_Sub23) this.aClass13_15.aClass2_19.aClass2_209).anInt3798;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!t;)V")
	private void method2612(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.method3183();
		arg0.method2629();
		@Pc(9) Class2 local9 = this.aClass13_15.aClass2_19.aClass2_209;
		if (local9 == this.aClass13_15.aClass2_19) {
			this.anInt3771 = -1;
		} else {
			this.anInt3771 = ((Class2_Sub23) local9).anInt3798;
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "()V")
	private void method2613() {
		if (this.anInt3772 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub23 local8 = (Class2_Sub23) this.aClass13_15.method303(); local8 != null; local8 = (Class2_Sub23) this.aClass13_15.method309()) {
			local8.anInt3798 -= this.anInt3772;
		}
		this.anInt3771 -= this.anInt3772;
		this.anInt3772 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class2_Sub2 method2847() {
		return (Class2_Sub2) this.aClass13_14.method309();
	}
}
