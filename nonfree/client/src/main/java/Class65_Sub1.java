import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
	public final int anInt2132;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public final int anInt2128;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	public final int anInt2131;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public final int anInt2126;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public final int anInt2124;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public final int anInt2127;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!dba;Lclient!pa;IIIIIIIIIIIII)V")
	public Class65_Sub1(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2132 = arg10;
		this.anInt2128 = arg13;
		this.anInt2131 = arg9;
		this.anInt2126 = arg11;
		this.anInt2124 = arg12;
		this.anInt2127 = arg14;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static351.aClass140_16;
	}
}
