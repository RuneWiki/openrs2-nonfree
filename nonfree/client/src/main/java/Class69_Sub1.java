import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	public final int anInt1776;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public final int anInt1771;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public final int anInt1775;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
	public final int anInt1779;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	public final int anInt1777;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	public final int anInt1774;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!vfa;Lclient!rq;IIIIIIIIIIIII)V")
	public Class69_Sub1(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1776 = arg14;
		this.anInt1771 = arg10;
		this.anInt1775 = arg12;
		this.anInt1779 = arg13;
		this.anInt1777 = arg11;
		this.anInt1774 = arg9;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static31.aClass8_1;
	}
}
