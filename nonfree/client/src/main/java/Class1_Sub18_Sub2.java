import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class1_Sub18_Sub2 extends Class1_Sub18 {

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt5041 = arg1;
		super.anInt5030 = arg2;
		super.anInt5037 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BF)V")
	@Override
	public void method4100(@OriginalArg(1) float arg0) {
		super.aFloat119 = arg0;
	}
}
