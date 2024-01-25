import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IF)V")
	@Override
	public void method8321(@OriginalArg(1) float arg0) {
		super.aFloat176 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt10002 = arg2;
		super.anInt9999 = arg1;
		super.anInt9992 = arg0;
	}
}
