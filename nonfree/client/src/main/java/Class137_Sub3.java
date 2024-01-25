import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!iaa;)V")
	public Class137_Sub3(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class153_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7223(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7224() * super.aClass153_5.anInt9316 / 10000;
		Static417.aClass162_17.J(arg1, arg0 + 2, local13, super.aClass153_5.anInt9312 - 2, ((Class153_Sub1) super.aClass153_5).anInt3163, 0);
		Static417.aClass162_17.J(arg1 + local13, arg0 - -2, super.aClass153_5.anInt9316 - local13, super.aClass153_5.anInt9312 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7226(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static417.aClass162_17.method6827(arg0 - 2, arg1, super.aClass153_5.anInt9316 + 4, super.aClass153_5.anInt9312 + 2, ((Class153_Sub1) super.aClass153_5).anInt3165, 0);
		Static417.aClass162_17.method6827(arg0 - 1, arg1 + 1, super.aClass153_5.anInt9316 + 2, super.aClass153_5.anInt9312, 0, 0);
	}
}
