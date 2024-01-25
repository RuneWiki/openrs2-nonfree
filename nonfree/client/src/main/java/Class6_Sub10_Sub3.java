import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class6_Sub10_Sub3 extends Class6_Sub10 {

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9555 = arg1;
		super.anInt9544 = arg0;
		super.anInt9547 = arg2;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FI)V")
	@Override
	public void method8335(@OriginalArg(0) float arg0) {
		super.aFloat194 = arg0;
	}
}
