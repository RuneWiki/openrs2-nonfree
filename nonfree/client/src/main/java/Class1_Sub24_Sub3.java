import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class1_Sub24_Sub3 extends Class1_Sub24 {

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub24_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FB)V")
	@Override
	public void method7611(@OriginalArg(0) float arg0) {
		super.aFloat235 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9334 = arg0;
		super.anInt9332 = arg2;
		super.anInt9340 = arg1;
	}
}
