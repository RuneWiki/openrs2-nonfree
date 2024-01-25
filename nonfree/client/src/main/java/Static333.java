import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "S")
	public static short aShort65 = 32767;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!r;I)Lclient!vn;")
	public static Class352 method4906(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class144 local9 = Static57.method964(arg1, true, arg0);
		return local9 == null ? null : local9.aClass352_14;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
	public static boolean method4913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BJ)V")
	public static void method4914(@OriginalArg(1) long arg0) {
		if (Static568.aClass360ArrayArrayArray22 != null) {
			if (Static358.anInt9363 == 1 || Static358.anInt9363 == 5) {
				Static486.method6702(arg0);
			} else if (Static358.anInt9363 == 4) {
				Static420.method5961(arg0);
			}
		}
		Static557.method7542((long) Static518.anInt9331, Static31.aClass78_18);
		if (Static165.anInt3165 != -1) {
			Static18.method441(Static165.anInt3165);
		}
		for (@Pc(40) int local40 = 0; local40 < Static231.anInt4302; local40++) {
			if (Static73.aBooleanArray6[local40]) {
				Static102.aBooleanArray7[local40] = true;
			}
			Static529.aBooleanArray31[local40] = Static73.aBooleanArray6[local40];
			Static73.aBooleanArray6[local40] = false;
		}
		Static43.anInt868 = Static518.anInt9331;
		if (Static165.anInt3165 != -1) {
			Static231.anInt4302 = 0;
			Static2.method68();
		}
		Static31.aClass78_18.JA();
		Static550.method7495(Static31.aClass78_18);
		@Pc(85) int local85 = Static347.method5188();
		if (local85 == -1) {
			local85 = Static422.anInt7430;
		}
		if (local85 == -1) {
			local85 = Static533.anInt8981;
		}
		Static399.method5767(local85);
		@Pc(113) int local113 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() << 8;
		Static268.method3923(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, local113 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902, local113 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906, Static175.anInt3258);
		Static175.anInt3258 = 0;
	}
}
