import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub9_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7674 = arg0;
		super.anInt7667 = arg2;
		super.anInt7671 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IF)V")
	@Override
	public void method6001(@OriginalArg(1) float arg0) {
		super.aFloat167 = arg0;
	}
}
