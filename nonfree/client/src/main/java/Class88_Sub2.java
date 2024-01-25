import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!qo;)V")
	public Class88_Sub2(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class260_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8280(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method8279() * super.aClass260_5.anInt9475 / 10000;
		Static546.aClass15_16.C(arg1, arg0 + 2, local13, super.aClass260_5.anInt9476 - 2, ((Class260_Sub2) super.aClass260_5).anInt8347, 0);
		Static546.aClass15_16.C(arg1 + local13, arg0 + 2, super.aClass260_5.anInt9475 - local13, super.aClass260_5.anInt9476 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIB)V")
	@Override
	protected void method8282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static546.aClass15_16.method5334(arg1 - 2, arg0, super.aClass260_5.anInt9475 + 4, super.aClass260_5.anInt9476 - -2, ((Class260_Sub2) super.aClass260_5).anInt8345, 0);
		Static546.aClass15_16.method5334(arg1 - 1, arg0 + 1, super.aClass260_5.anInt9475 + 2, super.aClass260_5.anInt9476, 0, 0);
	}
}
