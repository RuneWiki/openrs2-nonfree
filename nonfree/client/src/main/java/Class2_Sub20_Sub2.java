import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class2_Sub20_Sub2 extends Class2_Sub20 {

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IF)V")
	@Override
	public void method5738(@OriginalArg(1) float arg0) {
		super.aFloat104 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt7282 = arg2;
		super.anInt7279 = arg0;
		super.anInt7272 = arg1;
	}
}
