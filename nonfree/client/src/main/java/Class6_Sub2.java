import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
	public final int anInt1642;

	@OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
	public final int anInt1641;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
	public final int anInt1636;

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "I")
	public final int anInt1644;

	@OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
	public final int anInt1638;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!eda;Lclient!cga;IIIIIIIIIIIII)V")
	public Class6_Sub2(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1642 = arg12;
		this.anInt1641 = arg14;
		this.anInt1636 = arg10;
		this.anInt1640 = arg9;
		this.anInt1644 = arg13;
		this.anInt1638 = arg11;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static47.aClass146_1;
	}
}
