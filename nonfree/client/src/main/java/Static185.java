import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gba", name = "db", descriptor = "I")
	public static int anInt3761 = 0;

	@OriginalMember(owner = "client!gba", name = "ob", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!gba", name = "sb", descriptor = "Z")
	public static final boolean aBoolean284 = false;

	@OriginalMember(owner = "client!gba", name = "wb", descriptor = "[B")
	public static final byte[] aByteArray28 = new byte[2048];

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3443(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static393.anInt6147;
		@Pc(9) int[] local9 = Static430.anIntArray612;
		@Pc(11) boolean local11 = false;
		for (@Pc(21) int local21 = 0; local21 < local7; local21++) {
			@Pc(29) Class28_Sub1_Sub1_Sub1_Sub1 local29 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9[local21]];
			if (local29 != null && local29 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 && local29.aString123 != null && local29.aString123.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(56) Class3_Sub34 local56;
				if (arg0 == 1) {
					local56 = Static172.method3123(Static163.aClass375_1, Static600.aClass218_143);
					local56.aClass3_Sub25_Sub1_2.method8597(local9[local21]);
					local56.aClass3_Sub25_Sub1_2.method8608(0);
					Static441.method6275(local56);
				} else if (arg0 == 4) {
					local56 = Static172.method3123(Static163.aClass375_1, Static498.aClass218_151);
					local56.aClass3_Sub25_Sub1_2.method8649(local9[local21]);
					local56.aClass3_Sub25_Sub1_2.method8586(0);
					Static441.method6275(local56);
				} else if (arg0 == 5) {
					local56 = Static172.method3123(Static163.aClass375_1, Static427.aClass218_104);
					local56.aClass3_Sub25_Sub1_2.method8614(0);
					local56.aClass3_Sub25_Sub1_2.method8649(local9[local21]);
					Static441.method6275(local56);
				} else if (arg0 == 6) {
					local56 = Static172.method3123(Static163.aClass375_1, Static202.aClass218_45);
					local56.aClass3_Sub25_Sub1_2.method8614(0);
					local56.aClass3_Sub25_Sub1_2.method8597(local9[local21]);
					Static441.method6275(local56);
				} else if (arg0 == 7) {
					local56 = Static172.method3123(Static163.aClass375_1, Static457.aClass218_110);
					local56.aClass3_Sub25_Sub1_2.method8614(0);
					local56.aClass3_Sub25_Sub1_2.method8597(local9[local21]);
					Static441.method6275(local56);
				} else if (arg0 == 9) {
					local56 = Static172.method3123(Static163.aClass375_1, Static566.aClass218_132);
					local56.aClass3_Sub25_Sub1_2.method8649(local9[local21]);
					local56.aClass3_Sub25_Sub1_2.method8586(0);
					Static441.method6275(local56);
				}
				break;
			}
		}
		if (!local11) {
			Static381.method5445(Static601.aClass346_23.method8440(Static609.anInt9834) + arg1);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Z")
	public static boolean method3447(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)I")
	public static int method3448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 255 - arg2;
		@Pc(25) int local25 = (arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00 | arg2 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return local25 + ((local7 * (arg1 & 0xFF00) & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "(I)V")
	public static void method3449() {
		if (!Static218.method3770()) {
			return;
		}
		if (Static605.aStringArray33 == null) {
			Static662.method9143();
		}
		Static57.aBoolean88 = true;
		Static165.anInt10047 = 0;
	}
}
