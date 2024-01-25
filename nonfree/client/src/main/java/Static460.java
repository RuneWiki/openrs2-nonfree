import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_166 = new Class359(126, 12);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
	public static boolean method6582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(JI)V")
	public static void method6583(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 + Static390.anInt6937;
		@Pc(17) int local17 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 + Static110.anInt2345;
		if (Static40.anInt662 - local11 < -2000 || Static40.anInt662 - local11 > 2000 || Static541.anInt8929 - local17 < -2000 || Static541.anInt8929 - local17 > 2000) {
			Static40.anInt662 = local11;
			Static541.anInt8929 = local17;
		}
		@Pc(55) int local55;
		@Pc(63) int local63;
		if (local11 != Static40.anInt662) {
			local55 = local11 - Static40.anInt662;
			local63 = (int) (arg0 * (long) local55 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local63 > local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local63 < local55) {
				local63 = local55;
			}
			Static40.anInt662 += local63;
		}
		Static298.aFloat116 += (float) arg0 * Static601.aFloat206 / 6.0F;
		Static157.aFloat83 += (float) arg0 * Static235.aFloat91 / 6.0F;
		if (Static541.anInt8929 != local17) {
			local55 = local17 - Static541.anInt8929;
			local63 = (int) ((long) local55 * arg0 / 320L);
			if (local55 > 0) {
				if (local63 == 0) {
					local63 = 1;
				} else if (local63 > local55) {
					local63 = local55;
				}
			} else if (local63 == 0) {
				local63 = -1;
			} else if (local55 > local63) {
				local63 = local55;
			}
			Static541.anInt8929 += local63;
		}
		Static167.method2915();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(CZ)Z")
	public static boolean method6584(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(30) char[] local30 = Static528.aCharArray14;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(38) char local38 = local30[local32];
				if (arg0 == local38) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BBI)[B")
	public static byte[] method6585(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static686.method4972(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
