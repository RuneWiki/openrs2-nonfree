import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!dm;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!in;")
	public static final Class169 aClass169_14 = new Class169(2, 5);

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public static int anInt454 = 0;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method454(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static365.method6187(arg0, arg1) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(FFZFIFFF)F")
	public static float method455(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg6 - arg5;
		@Pc(17) float local17 = arg0 - arg4;
		@Pc(21) float local21 = arg2 - arg1;
		@Pc(23) float local23 = 0.0F;
		@Pc(25) float local25 = 0.0F;
		@Pc(27) float local27 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(40) float local40 = local12 * local7 + arg5;
			@Pc(46) float local46 = local17 * local7 + arg4;
			@Pc(52) float local52 = arg1 + local7 * local21;
			@Pc(57) int local57 = (int) local40 >> 9;
			@Pc(62) int local62 = (int) local52 >> 9;
			if (local57 > 0 && local62 > 0 && Static222.anInt4533 > local57 && local62 < Static668.anInt11370) {
				@Pc(86) int local86 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142;
				if (local86 < 3 && (Static96.aByteArrayArrayArray10[1][local57][local62] & 0x2) != 0) {
					local86++;
				}
				@Pc(114) int local114 = Static549.aClass18Array30[local86].method8542((int) local52, (int) local40);
				if (local46 > (float) local114) {
					if (arg3 < 2) {
						return local7;
					}
					return local7 + method455(local46, local27, local52, arg3 - 1, local25, local23, local40) * 0.1F - 0.1F;
				}
			}
			local23 = local40;
			local7 += 0.1F;
			local27 = local52;
			local25 = local46;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method456() {
		if (Static451.aClass34_2 != null) {
			Static451.aClass34_2.method6328();
		}
		if (Static330.aClass34_1 != null) {
			Static330.aClass34_1.method6328();
		}
	}
}
