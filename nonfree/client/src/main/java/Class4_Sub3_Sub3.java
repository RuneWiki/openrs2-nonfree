import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(FB)V")
	@Override
	public void method4956(@OriginalArg(0) float arg0) {
		super.aFloat154 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)V")
	@Override
	public void method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6300 = arg2;
		super.anInt6301 = arg1;
		super.anInt6292 = arg0;
	}
}
