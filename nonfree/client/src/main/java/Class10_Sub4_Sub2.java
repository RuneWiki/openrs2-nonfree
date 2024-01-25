import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class10_Sub4_Sub2 extends Class10_Sub4 {

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class10_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IF)V")
	@Override
	public void method5363(@OriginalArg(1) float arg0) {
		super.aFloat115 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6835 = arg1;
		super.anInt6834 = arg2;
		super.anInt6833 = arg0;
	}
}
