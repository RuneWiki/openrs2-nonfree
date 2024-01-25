import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class6_Sub11_Sub1 extends Class6_Sub11 {

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)V")
	@Override
	public void method6397(@OriginalArg(0) float arg0) {
		super.aFloat100 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7828 = arg1;
		super.anInt7821 = arg0;
		super.anInt7827 = arg2;
	}
}
