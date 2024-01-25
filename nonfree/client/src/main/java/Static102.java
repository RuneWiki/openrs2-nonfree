import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dka", name = "n", descriptor = "Lclient!kfa;")
	public static Class192 aClass192_3;

	@OriginalMember(owner = "client!dka", name = "i", descriptor = "I")
	public static int anInt10343 = 0;

	@OriginalMember(owner = "client!dka", name = "l", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_223 = new Class151(30, 10);

	@OriginalMember(owner = "client!dka", name = "m", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!es;B)Lclient!gw;")
	public static Class71_Sub2 method8743(@OriginalArg(0) Class4_Sub11 arg0) {
		return new Class71_Sub2(arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8827(), arg0.method8827(), arg0.method8865());
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(III)I")
	public static int method8744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
