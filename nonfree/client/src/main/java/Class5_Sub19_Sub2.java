import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class5_Sub19_Sub2 extends Class5_Sub19 {

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub19_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6291 = arg2;
		super.anInt6293 = arg1;
		super.anInt6285 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BF)V")
	@Override
	public void method4980(@OriginalArg(1) float arg0) {
		super.aFloat148 = arg0;
	}
}
