import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "[C")
	public static final char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	private final int anInt2136;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	private final int anInt2129;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	private final int anInt2134;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	private final int anInt2131;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	private final int anInt2126;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
	private final int anInt2127;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	private final int anInt2133;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	private final int anInt2132;

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray4[local7] = (char) (local7 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray4[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray4[local39] = (char) (local39 - 4);
		}
		aCharArray4[63] = '-';
		aCharArray4[62] = '*';
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2136 = arg6;
		this.anInt2129 = arg1;
		this.anInt2134 = arg0;
		this.anInt2131 = arg2;
		this.anInt2126 = arg5;
		this.anInt2127 = arg3;
		this.anInt2133 = arg4;
		this.anInt2132 = arg7;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BII)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2134 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2129 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt2131 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2127 * arg0 >> 12;
		@Pc(46) int local46 = this.anInt2133 * arg1 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt2126 >> 12;
		@Pc(60) int local60 = arg1 * this.anInt2136 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt2132 >> 12;
		Static464.method6583(local60, local32, super.anInt7670, local10, local39, local46, local17, local67, local53);
	}
}
