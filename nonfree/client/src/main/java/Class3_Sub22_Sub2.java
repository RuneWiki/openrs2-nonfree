import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class3_Sub22_Sub2 extends Class3_Sub22 {

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(FB)V")
	@Override
	public void method8389(@OriginalArg(0) float arg0) {
		super.aFloat197 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9869 = arg2;
		super.anInt9868 = arg1;
		super.anInt9871 = arg0;
	}
}
