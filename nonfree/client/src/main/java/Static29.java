import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array2;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!kh;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public static int anInt782 = -2;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Z")
	public static boolean aBoolean56 = true;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method721(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(20) int local20 = local8.length() - 3; local20 > 0; local20 -= 3) {
			local8 = local8.substring(0, local20) + "," + local8.substring(local20);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static135.aString175 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static57.aString81 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V")
	public static void method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static111.anInt2405 * arg1 >> 8;
		if (arg0 == -1 && !Static46.aBoolean84) {
			Static253.method4417();
		} else if (arg0 != -1 && (Static100.anInt2201 != arg0 || !Static256.method4450()) && local9 != 0 && !Static46.aBoolean84) {
			Static46.method1043(local9, Static305.aClass170_102, arg0);
		}
		Static100.anInt2201 = arg0;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V")
	public static void method724() {
		@Pc(1) Class66 local1 = Static207.aClass66_71;
		synchronized (Static207.aClass66_71) {
			Static207.aClass66_71.method1944(5);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I")
	public static int method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V")
	public static void method726() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static161.anInt3258; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static220.anIntArray311[local3];
			}
			@Pc(20) Class25_Sub1_Sub1_Sub1 local20 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local12];
			if (local20 != null && local20.anInt5303 > 0) {
				local20.anInt5303--;
				if (local20.anInt5303 == 0) {
					local20.aString304 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static63.anInt1486; local12++) {
			@Pc(59) int local59 = Static331.anIntArray535[local12];
			@Pc(63) Class25_Sub1_Sub1_Sub2 local63 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local59];
			if (local63 != null && local63.anInt5303 > 0) {
				local63.anInt5303--;
				if (local63.anInt5303 == 0) {
					local63.aString304 = null;
				}
			}
		}
	}
}
