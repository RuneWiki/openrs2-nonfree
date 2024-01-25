import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBII)V")
	@Override
	public void method3970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt4535 = arg1;
		super.anInt4541 = arg0;
		super.anInt4531 = arg2;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IF)V")
	@Override
	public void method3961(@OriginalArg(1) float arg0) {
		super.aFloat118 = arg0;
	}
}
