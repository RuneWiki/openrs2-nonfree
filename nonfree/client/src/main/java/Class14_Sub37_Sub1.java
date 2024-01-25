import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class14_Sub37_Sub1 extends Class14_Sub37 {

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIIF)V")
	public Class14_Sub37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method7821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9457 = arg0;
		super.anInt9452 = arg2;
		super.anInt9465 = arg1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(FI)V")
	@Override
	public void method7829(@OriginalArg(0) float arg0) {
		super.aFloat234 = arg0;
	}
}
