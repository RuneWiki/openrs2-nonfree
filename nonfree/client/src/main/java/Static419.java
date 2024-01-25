import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "Lclient!cd;")
	public static Class53 aClass53_12;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "Lclient!dfa;")
	public static final Class74 aClass74_45 = new Class74(64);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	public static int anInt7216 = -1;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)V")
	public static void method6415() {
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub6_2);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub6_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub24_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub24_2);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.lb);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub20_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub27_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub29_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub14_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub3_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub2_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub4_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub28_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_2);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub12_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub7_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub17_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub11_1);
		Static363.method5535();
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub10_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub1_1);
		Static423.method6439();
		Static433.method6599();
		Static513.aBoolean649 = true;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = (Static73.aShort43 - Static582.aShort117) * local7 / 100 + Static582.aShort117;
		Static377.anInt6468 = local33 * Static377.anInt6464 >> 8;
		@Pc(45) int local45 = arg0 * local33 >> 8;
		@Pc(51) int local51 = 16384 - arg3 & 0x3FFF;
		@Pc(58) int local58 = 16384 - arg2 & 0x3FFF;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = local45;
		if (local51 != 0) {
			local62 = -local45 * Class6_Sub2_Sub12.anIntArray293[local51] >> 14;
			local64 = local45 * Class6_Sub2_Sub12.anIntArray292[local51] >> 14;
		}
		if (local58 != 0) {
			local60 = Class6_Sub2_Sub12.anIntArray293[local58] * local64 >> 14;
			local64 = local64 * Class6_Sub2_Sub12.anIntArray292[local58] >> 14;
		}
		Static21.anInt279 = arg2;
		Static365.anInt6155 = arg5 - local64;
		Static200.anInt4059 = 0;
		Static406.anInt7076 = arg6 - local62;
		Static337.anInt5759 = arg3;
		Static475.anInt8090 = arg1 - local60;
	}
}
