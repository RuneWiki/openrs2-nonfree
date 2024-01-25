import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!wl", name = "L", descriptor = "Lclient!kv;")
	public static Class41 aClass41_6;

	@OriginalMember(owner = "client!wl", name = "O", descriptor = "Lclient!ci;")
	public static Class38 aClass38_90;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "[B")
	public static final byte[] aByteArray93 = new byte[520];

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[128][128];

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "[S")
	public static final short[] aShortArray106 = new short[] { 59, 9, 30, 60, 17, 58, 22, 50 };

	@OriginalMember(owner = "client!wl", name = "F", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_113 = new Class21("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!wl", name = "K", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_53 = new Class91();

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_223 = new Class214(66, 2);

	@OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
	public static int anInt7451 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	public static void method5986() {
		Static87.aBoolean142 = false;
		Static227.method3863(Static22.anInt426, Static177.anInt3637, Static153.anInt3164, Static223.anInt4455);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
	public static void method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static28.method410(arg1, arg3, arg2, arg0);
			}
		} else if (local15 == 0) {
			Static196.method6084(arg4, arg1, arg3, arg0);
		} else {
			@Pc(54) int local54 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg0 - (arg3 * local54 >> 12);
			@Pc(74) int local74;
			@Pc(76) int local76;
			if (arg3 < Static176.anInt3462) {
				local74 = Static176.anInt3462;
				local76 = local62 + (local54 * Static176.anInt3462 >> 12);
			} else if (arg3 <= Static418.anInt3023) {
				local74 = arg3;
				local76 = arg0;
			} else {
				local74 = Static418.anInt3023;
				local76 = local62 + (Static418.anInt3023 * local54 >> 12);
			}
			@Pc(108) int local108;
			@Pc(117) int local117;
			if (arg4 < Static176.anInt3462) {
				local117 = (local54 * Static176.anInt3462 >> 12) + local62;
				local108 = Static176.anInt3462;
			} else if (Static418.anInt3023 < arg4) {
				local108 = Static418.anInt3023;
				local117 = local62 + (Static418.anInt3023 * local54 >> 12);
			} else {
				local117 = arg2;
				local108 = arg4;
			}
			if (Static162.anInt1715 > local76) {
				local74 = (Static162.anInt1715 - local62 << 12) / local54;
				local76 = Static162.anInt1715;
			} else if (local76 > Static55.anInt1319) {
				local74 = (Static55.anInt1319 - local62 << 12) / local54;
				local76 = Static55.anInt1319;
			}
			if (local117 < Static162.anInt1715) {
				local117 = Static162.anInt1715;
				local108 = (Static162.anInt1715 - local62 << 12) / local54;
			} else if (local117 > Static55.anInt1319) {
				local117 = Static55.anInt1319;
				local108 = (Static55.anInt1319 - local62 << 12) / local54;
			}
			Static105.method2009(local76, local108, local117, arg1, local74);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!jk;")
	public static Class122 method5990(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static425.aFloat64 == 3.0D) {
				return Static259.aClass122_4;
			}
			if ((double) Static425.aFloat64 == 4.0D) {
				return Static291.aClass122_6;
			}
			if ((double) Static425.aFloat64 == 6.0D) {
				return Static171.aClass122_2;
			}
			if ((double) Static425.aFloat64 >= 8.0D) {
				return Static381.aClass122_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static425.aFloat64 == 3.0D) {
				return Static171.aClass122_2;
			}
			if ((double) Static425.aFloat64 == 4.0D) {
				return Static381.aClass122_7;
			}
			if ((double) Static425.aFloat64 == 6.0D) {
				return Static262.aClass122_5;
			}
			if ((double) Static425.aFloat64 >= 8.0D) {
				return Static10.aClass122_1;
			}
		} else if (arg0 == 2) {
			if ((double) Static425.aFloat64 == 3.0D) {
				return Static262.aClass122_5;
			}
			if ((double) Static425.aFloat64 == 4.0D) {
				return Static10.aClass122_1;
			}
			if ((double) Static425.aFloat64 == 6.0D) {
				return Static416.aClass122_8;
			}
			if ((double) Static425.aFloat64 >= 8.0D) {
				return Static237.aClass122_3;
			}
		}
		return null;
	}
}
