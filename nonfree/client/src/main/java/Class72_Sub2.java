import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!ih;)V")
	public Class72_Sub2(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class54_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static16.aClass134_1.method6958(arg0 - 2, arg1, super.aClass54_5.anInt4145 + 4, super.aClass54_5.anInt4141 + 2, ((Class54_Sub3) super.aClass54_5).anInt4151, 0);
		Static16.aClass134_1.method6958(arg0 - 1, arg1 + 1, super.aClass54_5.anInt4145 + 2, super.aClass54_5.anInt4141, 0, 0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method4321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method4318() * super.aClass54_5.anInt4145 / 10000;
		Static16.aClass134_1.J(arg1, arg0 + 2, local13, super.aClass54_5.anInt4141 - 2, ((Class54_Sub3) super.aClass54_5).anInt4150, 0);
		Static16.aClass134_1.J(local13 + arg1, arg0 - -2, super.aClass54_5.anInt4145 - local13, super.aClass54_5.anInt4141 + -2, 0, 0);
	}
}
