import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class6_Sub17_Sub2 extends Class6_Sub17 {

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IF)V")
	@Override
	public void method8523(@OriginalArg(1) float arg0) {
		super.aFloat195 = arg0;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt10089 = arg1;
		super.anInt10088 = arg2;
		super.anInt10094 = arg0;
	}
}
