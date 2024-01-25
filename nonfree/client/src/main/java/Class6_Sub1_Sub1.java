import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIZ)V")
	@Override
	public void method8262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9791 = arg2;
		super.anInt9792 = arg1;
		super.anInt9789 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(FI)V")
	@Override
	public void method8261(@OriginalArg(0) float arg0) {
		super.aFloat194 = arg0;
	}
}
