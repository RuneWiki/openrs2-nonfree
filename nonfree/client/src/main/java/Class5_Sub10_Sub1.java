import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt6245 = arg1;
		super.anInt6244 = arg2;
		super.anInt6242 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)V")
	@Override
	public void method5187(@OriginalArg(1) float arg0) {
		super.aFloat266 = arg0;
	}
}
