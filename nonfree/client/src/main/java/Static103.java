import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lclient!rf;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_1;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "Lclient!b;")
	public static Class7 aClass7_16 = new Class7(50);

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1329 = Static122.method531("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
	public static int anInt2327 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!f;Lclient!f;I)V")
	public static void method1796(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		Static75.aClass13_15 = arg0;
		Static90.aClass13_16 = arg1;
		Static38.anInt3122 = Static90.aClass13_16.method353(3);
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	public static void method1797() {
		aShortArray25 = null;
		aClass3_Sub1_Sub16_1 = null;
		aClass73_1329 = null;
		aClass7_16 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIILclient!gg;I)V")
	public static void method1798(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub8 arg3, @OriginalArg(5) int arg4) {
		if (Static34.anInt835 >= 50 || (arg3.anIntArray140 == null || arg1 >= arg3.anIntArray140.length)) {
			return;
		}
		@Pc(25) int local25 = arg3.anIntArray140[arg1];
		if (local25 == 0) {
			return;
		}
		@Pc(35) int local35 = local25 >> 8;
		@Pc(41) int local41 = local25 >> 4 & 0x7;
		@Pc(45) int local45 = local25 & 0xF;
		if (local45 == 0) {
			if (arg0) {
				Static88.method1534(0, local35, local41);
			}
		} else if (Static51.anInt1201 != 0) {
			@Pc(67) int local67 = (arg4 - 64) / 128;
			Static176.anIntArray420[Static34.anInt835] = local35;
			@Pc(77) int local77 = (arg2 - 64) / 128;
			Static138.anIntArray331[Static34.anInt835] = local41;
			Static41.anIntArray94[Static34.anInt835] = 0;
			Static117.aClass66Array1[Static34.anInt835] = null;
			Static166.anIntArray382[Static34.anInt835] = local45 + (local77 << 8) + (local67 << 16);
			Static34.anInt835++;
		}
	}
}
