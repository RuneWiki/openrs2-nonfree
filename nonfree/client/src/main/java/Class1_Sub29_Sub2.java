import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class1_Sub29_Sub2 extends Class1_Sub29 {

	static {
		new Class265("", 76);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub29_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7209 = arg2;
		super.anInt7210 = arg1;
		super.anInt7202 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)V")
	@Override
	public void method5842(@OriginalArg(0) float arg0) {
		super.aFloat90 = arg0;
	}
}
