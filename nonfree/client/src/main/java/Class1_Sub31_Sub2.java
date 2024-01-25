import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class1_Sub31_Sub2 extends Class1_Sub31 {

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZII)V")
	@Override
	public void method5908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7219 = arg1;
		super.anInt7226 = arg0;
		super.anInt7221 = arg2;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IF)V")
	@Override
	public void method5903(@OriginalArg(1) float arg0) {
		super.aFloat101 = arg0;
	}
}
