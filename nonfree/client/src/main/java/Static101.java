import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt2466;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
	public static int[] anIntArray276 = new int[100];

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
	public static int[] anIntArray277 = new int[100];

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_998 = Static121.method2047("Hier wechseln");

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public static int anInt2467 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1805() {
		anIntArray278 = null;
		aClass60_998 = null;
		aBooleanArray16 = null;
		anIntArray277 = null;
		anIntArray276 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static7.aClass28_3.method760(Static129.anInt3003, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(37) int local37 = local18 & 0x1F;
		@Pc(43) int local43 = local18 >> 6 & 0x3;
		if (local37 == 10 || local37 == 11 || local37 == 22) {
			@Pc(82) Class4_Sub4_Sub5 local82 = Static24.method477(local7);
			@Pc(93) int local93;
			@Pc(90) int local90;
			if (local43 == 0 || local43 == 2) {
				local90 = local82.anInt1085;
				local93 = local82.anInt1075;
			} else {
				local90 = local82.anInt1075;
				local93 = local82.anInt1085;
			}
			@Pc(104) int local104 = local82.anInt1082;
			if (local43 != 0) {
				local104 = (local104 << local43 & 0xF) + (local104 >> 4 - local43);
			}
			Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, local104, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], local93, arg0, local90, 0, arg1, true);
		} else {
			Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], local37 + 1, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, arg0, 0, local43, arg1, true);
		}
		Static14.anInt3005 = 2;
		Static35.anInt914 = 0;
		Static120.anInt1936 = Static128.anInt2648;
		Static94.anInt2308 = Static22.anInt652;
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1807(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static110.anInt2674 > 0) {
			local24 = Static17.aByteArrayArray3[--Static110.anInt2674];
			Static17.aByteArrayArray3[Static110.anInt2674] = null;
			return local24;
		} else if (arg0 == 5000 && Static107.anInt2533 > 0) {
			local24 = Static1.aByteArrayArray1[--Static107.anInt2533];
			Static1.aByteArrayArray1[Static107.anInt2533] = null;
			return local24;
		} else if (arg0 == 30000 && Static27.anInt754 > 0) {
			local24 = Static88.aByteArrayArray5[--Static27.anInt754];
			Static88.aByteArrayArray5[Static27.anInt754] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}
}
