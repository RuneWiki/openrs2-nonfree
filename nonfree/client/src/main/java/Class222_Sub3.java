import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class222_Sub3 extends Class222 {

	@OriginalMember(owner = "client!tda", name = "n", descriptor = "Lclient!f;")
	private Class46 aClass46_31;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!u;)V")
	public Class222_Sub3(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class94_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method6781(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static4.aClass43_1.method7170(arg0 - 2, arg1, super.aClass94_5.anInt8263 + 4, super.aClass94_5.anInt8262 - -2, ((Class94_Sub3) super.aClass94_5).anInt8273, 0);
		Static4.aClass43_1.method7170(arg0 - 1, arg1 + 1, super.aClass94_5.anInt8263 + 2, super.aClass94_5.anInt8262, 0, 0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.method6786() * super.aClass94_5.anInt8263 / 10000;
		@Pc(23) int[] local23 = new int[4];
		Static4.aClass43_1.oa(local23);
		Static4.aClass43_1.da(arg0, arg1 + 2, arg0 - -local20, arg1 + super.aClass94_5.anInt8262);
		this.aClass46_31.method7612(arg0, arg1 + 2, super.aClass94_5.anInt8263, super.aClass94_5.anInt8262);
		Static4.aClass43_1.da(local23[0], local23[1], local23[2], local23[3]);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		return super.method7790() ? super.aClass246_236.method5667(((Class94_Sub3) super.aClass94_5).anInt8276) : false;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
		super.method7789();
		this.aClass46_31 = Static292.method4651(super.aClass246_236, ((Class94_Sub3) super.aClass94_5).anInt8276);
	}
}
