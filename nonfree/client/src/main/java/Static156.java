import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public static int anInt2955;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_98 = new Class107(79, 9);

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "[I")
	public static final int[] anIntArray269 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!hp;)Ljava/lang/String;")
	public static String method2555(@OriginalArg(2) Class1_Sub5 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5361();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt6475 += Static390.aClass215_1.method4890(arg0.aByteArray89, arg0.anInt6475, local7, 0, local19);
			return Static98.method1759(0, local7, local19);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ya;B)V")
	public static void method2556(@OriginalArg(0) Class39 arg0) {
		arg0.OA(0, 0, Static95.anInt1971, 350);
		arg0.O(0, 0, Static95.anInt1971, 350, Static52.anInt5266 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static361.anInt5957;
		@Pc(46) int local46;
		if (Static242.anInt4434 > 0) {
			@Pc(35) int local35 = 346 - Static361.anInt5957 - 4;
			local46 = local27 * local35 / (local27 + Static242.anInt4434 - 1);
			@Pc(48) int local48 = 4;
			if (Static242.anInt4434 > 1) {
				local48 = (Static242.anInt4434 - Static49.anInt956 - 1) * (-local46 + local35) / (Static242.anInt4434 - 1) + 4;
			}
			arg0.O(Static95.anInt1971 - 16, local48, 12, local46, Static52.anInt5266 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static49.anInt956; local86 < local27 + Static49.anInt956 && local86 < Static242.anInt4434; local86++) {
				@Pc(95) String[] local95 = Static402.method5419('\b', Static206.aStringArray25[local86]);
				@Pc(104) int local104 = (Static95.anInt1971 - 8 - 16) / local95.length;
				for (@Pc(106) int local106 = 0; local106 < local95.length; local106++) {
					@Pc(114) int local114 = local104 * local106 + 8;
					arg0.OA(local114, 0, local104 + local114 - 8, 350);
					Static312.aClass71_7.method5454(local114, -16777216, -1, 348 - Static361.anInt5957 * (local86 - Static49.anInt956) - Static194.anInt3473 - Static325.aClass151_103.anInt4125, local95[local106]);
				}
			}
		}
		arg0.OA(0, 0, Static95.anInt1971, 350);
		arg0.method4501(0, Static95.anInt1971, -1, 350 - Static194.anInt3473);
		Static178.aClass71_5.method5454(10, -16777216, -1, 350 - Static3.aClass151_6.anInt4125 - 1, "--> " + Static94.aString17);
		local46 = -1;
		if (Static378.anInt4244 % 30 > 15) {
			local46 = 16777215;
		}
		arg0.method4500(339 - Static3.aClass151_6.anInt4125, 12, Static3.aClass151_6.method3475("--> " + Static94.aString17.substring(0, Static7.anInt193)) + 10, local46);
	}
}
