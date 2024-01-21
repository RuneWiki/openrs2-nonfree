import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_9;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public static int[] anIntArray152 = new int[256];

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!qc;")
	public static Class47 aClass47_8 = new Class47(200);

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public static int anInt785 = 0;

	@OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_239 = Static13.method257("Walk here");

	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!gb", name = "Hb", descriptor = "Lclient!o;")
	private static Class40 aClass40_240 = Static13.method257("Remove @whi@");

	@OriginalMember(owner = "client!gb", name = "Ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_241 = Static13.method257("Yesterday");

	@OriginalMember(owner = "client!gb", name = "Jb", descriptor = "I")
	public static int anInt786 = 0;

	@OriginalMember(owner = "client!gb", name = "Lb", descriptor = "I")
	public static int anInt788 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!mc;B)Z")
	public static boolean method607(@OriginalArg(0) Class2_Sub2_Sub13 arg0) {
		@Pc(13) int local13 = arg0.anInt1610;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 >= 101) {
				local13 -= 101;
			} else {
				local13--;
			}
			Static21.method402(Static80.method1334(new Class40[] { aClass40_240, Static51.aClass40Array23[local13] }), 2, 0, 0, 0);
			Static21.method402(Static80.method1334(new Class40[] { Static68.aClass40_108, Static51.aClass40Array23[local13] }), 20, 0, 0, 0);
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static21.method402(Static80.method1334(new Class40[] { aClass40_240, arg0.aClass40_466 }), 45, 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static91.anIntArrayArrayArray8[arg1][arg0 + local3][arg2 + local7] = 0;
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static91.anIntArrayArrayArray8[arg1][arg0][local7 + arg2] = Static91.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static91.anIntArrayArrayArray8[arg1][local7 + arg0][arg2] = Static91.anIntArrayArrayArray8[arg1][arg0 + local7][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static91.anIntArrayArrayArray8[arg1][arg0 - 1][arg2] != 0) {
			Static91.anIntArrayArrayArray8[arg1][arg0][arg2] = Static91.anIntArrayArrayArray8[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static91.anIntArrayArrayArray8[arg1][arg0][arg2 - 1] != 0) {
			Static91.anIntArrayArrayArray8[arg1][arg0][arg2] = Static91.anIntArrayArrayArray8[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static91.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static91.anIntArrayArrayArray8[arg1][arg0][arg2] = Static91.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method613() {
		anIntArray158 = null;
		aClass40_239 = null;
		aClass2_Sub2_Sub2_Sub3_9 = null;
		aClass47_8 = null;
		aClass40_241 = null;
		aClass40_240 = null;
		anIntArray152 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)Z")
	public static boolean method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static30.anInt721 == arg1) {
			return true;
		} else if (arg0 == 1 && Static58.anInt1496 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static102.anInt2466;
		}
	}
}
