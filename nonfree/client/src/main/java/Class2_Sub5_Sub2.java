import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt1751 = arg0;
		super.anInt1745 = arg1;
		super.anInt1758 = arg2;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IF)V")
	@Override
	public void method1663(@OriginalArg(1) float arg0) {
		super.aFloat30 = arg0;
	}
}
