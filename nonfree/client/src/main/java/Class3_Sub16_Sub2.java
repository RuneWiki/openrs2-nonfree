import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 {

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub16_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBII)V")
	@Override
	public void method6327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7551 = arg2;
		super.anInt7550 = arg1;
		super.anInt7559 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FB)V")
	@Override
	public void method6321(@OriginalArg(0) float arg0) {
		super.aFloat142 = arg0;
	}
}
