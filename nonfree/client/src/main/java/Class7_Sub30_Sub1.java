import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class7_Sub30_Sub1 extends Class7_Sub30 {

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class7_Sub30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6325 = arg0;
		super.anInt6330 = arg2;
		super.anInt6323 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(FI)V")
	@Override
	public void method5026(@OriginalArg(0) float arg0) {
		super.aFloat183 = arg0;
	}
}
