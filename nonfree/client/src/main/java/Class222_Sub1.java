import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!ms;)V")
	public Class222_Sub1(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class94_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method6786() * super.aClass94_5.anInt8263 / 10000;
		Static4.aClass43_1.J(arg0, arg1 + 2, local13, super.aClass94_5.anInt8262 - 2, ((Class94_Sub2) super.aClass94_5).anInt5986, 0);
		Static4.aClass43_1.J(arg0 + local13, arg1 + 2, super.aClass94_5.anInt8263 - local13, super.aClass94_5.anInt8262 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method6781(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static4.aClass43_1.method7170(arg0 - 2, arg1, super.aClass94_5.anInt8263 + 4, super.aClass94_5.anInt8262 + 2, ((Class94_Sub2) super.aClass94_5).anInt5985, 0);
		Static4.aClass43_1.method7170(arg0 - 1, arg1 + 1, super.aClass94_5.anInt8263 + 2, super.aClass94_5.anInt8262, 0, 0);
	}
}
