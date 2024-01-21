import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "Z")
	public static boolean aBoolean167;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1487 = Static177.method3050("<col=ff0000>");

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1488 = Static177.method3050("Spieler");

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "[Lclient!bb;")
	public static final Class8[] aClass8Array1 = new Class8[500];

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1489 = Static177.method3050("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
	public static int anInt4074 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!jd;ZI)V")
	public static void method3119(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class46 local9 = arg0.method1669();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static95.anInt3015; local16++) {
			@Pc(22) Class4_Sub1_Sub12 local22 = Static83.method1663(local16);
			if ((!arg1 || local22.aBoolean108) && local22.aClass46_895.method1669().method1652(local9) != -1) {
				if (local14 >= 250) {
					Static61.anInt1637 = -1;
					Static28.aShortArray6 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(54) short[] local54 = new short[local12.length * 2];
					for (@Pc(56) int local56 = 0; local56 < local14; local56++) {
						local54[local56] = local12[local56];
					}
					local12 = local54;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static19.anInt543 = 0;
		Static28.aShortArray6 = local12;
		Static61.anInt1637 = local14;
		@Pc(93) Class46[] local93 = new Class46[Static61.anInt1637];
		for (@Pc(95) int local95 = 0; local95 < Static61.anInt1637; local95++) {
			local93[local95] = Static83.method1663(local12[local95]).aClass46_895;
		}
		Static179.method3068(local93, Static28.aShortArray6);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIII)V")
	public static void method3120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static112.anIntArrayArrayArray42[arg0][arg2 + local8][arg1 + local12] = 0;
			}
		}
		if (arg2 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static112.anIntArrayArrayArray42[arg0][arg2][local12 + arg1] = Static112.anIntArrayArrayArray42[arg0][arg2 - 1][local12 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static112.anIntArrayArrayArray42[arg0][arg2 + local12][arg1] = Static112.anIntArrayArrayArray42[arg0][arg2 + local12][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static112.anIntArrayArrayArray42[arg0][arg2 - 1][arg1] != 0) {
			Static112.anIntArrayArrayArray42[arg0][arg2][arg1] = Static112.anIntArrayArrayArray42[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static112.anIntArrayArrayArray42[arg0][arg2][arg1 - 1] != 0) {
			Static112.anIntArrayArrayArray42[arg0][arg2][arg1] = Static112.anIntArrayArrayArray42[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static112.anIntArrayArrayArray42[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static112.anIntArrayArrayArray42[arg0][arg2][arg1] = Static112.anIntArrayArrayArray42[arg0][arg2 - 1][arg1 - 1];
		}
	}
}
