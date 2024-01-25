import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class14_Sub18_Sub2 extends Class14_Sub18 {

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIF)V")
	public Class14_Sub18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9684 = arg1;
		super.anInt9679 = arg2;
		super.anInt9677 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(FI)V")
	@Override
	public void method8340(@OriginalArg(0) float arg0) {
		super.aFloat189 = arg0;
	}
}
