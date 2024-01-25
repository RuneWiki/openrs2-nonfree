import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(FZ)V")
	@Override
	public void method4401(@OriginalArg(0) float arg0) {
		super.aFloat63 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBII)V")
	@Override
	public void method4405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5610 = arg1;
		super.anInt5612 = arg2;
		super.anInt5617 = arg0;
	}
}
