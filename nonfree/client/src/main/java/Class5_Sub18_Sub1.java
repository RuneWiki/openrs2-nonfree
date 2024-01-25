import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class5_Sub18_Sub1 extends Class5_Sub18 {

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)V")
	@Override
	public void method8047(@OriginalArg(0) float arg0) {
		super.aFloat195 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method8048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9556 = arg1;
		super.anInt9570 = arg0;
		super.anInt9559 = arg2;
	}
}
