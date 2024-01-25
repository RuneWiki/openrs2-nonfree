import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class3_Sub30_Sub2 extends Class3_Sub30 {

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIII)V")
	@Override
	public void method5385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6384 = arg0;
		super.anInt6389 = arg2;
		super.anInt6382 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(FI)V")
	@Override
	public void method5383(@OriginalArg(0) float arg0) {
		super.aFloat194 = arg0;
	}
}
