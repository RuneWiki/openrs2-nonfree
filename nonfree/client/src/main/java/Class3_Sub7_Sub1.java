import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BF)V")
	@Override
	public void method2482(@OriginalArg(1) float arg0) {
		super.aFloat50 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt2901 = arg0;
		super.anInt2906 = arg1;
		super.anInt2902 = arg2;
	}
}
