import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
	public final int anInt1776;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	public final int anInt1780;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
	public final int anInt1783;

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	public final int anInt1779;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
	public final int anInt1778;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
	public final int anInt1777;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!ada;Lclient!oe;IIIIIIIIIIIII)V")
	public Class63_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1776 = arg14;
		this.anInt1780 = arg13;
		this.anInt1783 = arg12;
		this.anInt1779 = arg11;
		this.anInt1778 = arg9;
		this.anInt1777 = arg10;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static200.aClass251_1;
	}
}
