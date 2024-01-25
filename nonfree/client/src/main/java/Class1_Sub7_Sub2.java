import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IF)V")
	@Override
	public void method5116(@OriginalArg(1) float arg0) {
		super.aFloat76 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIZ)V")
	@Override
	public void method5115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt6546 = arg1;
		super.anInt6545 = arg0;
		super.anInt6540 = arg2;
	}
}
