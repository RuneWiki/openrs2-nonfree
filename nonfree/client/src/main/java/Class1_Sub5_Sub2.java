import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)V")
	@Override
	public void method4312(@OriginalArg(1) float arg0) {
		super.aFloat88 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt4664 = arg2;
		super.anInt4667 = arg1;
		super.anInt4666 = arg0;
	}
}
