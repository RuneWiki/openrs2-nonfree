import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class3_Sub15_Sub2 extends Class3_Sub15 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBII)V")
	@Override
	public void method8379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9578 = arg1;
		super.anInt9576 = arg2;
		super.anInt9575 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(FB)V")
	@Override
	public void method8382(@OriginalArg(0) float arg0) {
		super.aFloat203 = arg0;
	}
}
