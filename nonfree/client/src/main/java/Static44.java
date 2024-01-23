import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "I", descriptor = "Lclient!lg;")
	public static Class97 aClass97_6 = null;

	@OriginalMember(owner = "client!co", name = "pb", descriptor = "Ljava/lang/String;")
	public static String aString33 = "red:";

	@OriginalMember(owner = "client!co", name = "wb", descriptor = "Ljava/lang/String;")
	public static String aString34 = " from your ignore list first.";

	@OriginalMember(owner = "client!co", name = "xb", descriptor = "[I")
	public static int[] anIntArray108 = new int[5];

	@OriginalMember(owner = "client!co", name = "Eb", descriptor = "I")
	public static int anInt922 = -1;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IBII)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static279.anInt5471 * arg1 >> 8;
		if (local11 != 0 && arg0 != -1) {
			Static94.method1557(arg0, local11, Static140.aClass22_48);
			Static64.aBoolean80 = true;
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(III)V")
	public static void method846(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class17 local13 = Static216.aClass17ArrayArrayArray1[Static222.anInt4467][arg1][arg0];
		if (local13 == null) {
			Static110.method1856(Static222.anInt4467, arg1, arg0);
			return;
		}
		@Pc(25) Class4_Sub2_Sub3 local25 = null;
		@Pc(30) Class4_Sub2_Sub3 local30 = (Class4_Sub2_Sub3) local13.method613();
		@Pc(32) int local32 = -99999999;
		while (local30 != null) {
			@Pc(42) Class29 local42 = Static187.method3128(local30.aClass13_Sub6_1.anInt4615);
			@Pc(45) int local45 = local42.anInt1023;
			if (local42.anInt1033 == 1) {
				local45 *= local30.aClass13_Sub6_1.anInt4616 + 1;
			}
			if (local45 > local32) {
				local32 = local45;
				local25 = local30;
			}
			local30 = (Class4_Sub2_Sub3) local13.method607();
		}
		if (local25 == null) {
			Static110.method1856(Static222.anInt4467, arg1, arg0);
			return;
		}
		local13.method611(local25);
		local30 = (Class4_Sub2_Sub3) local13.method613();
		@Pc(101) Class13_Sub6 local101 = null;
		@Pc(103) Class13_Sub6 local103 = null;
		while (local30 != null) {
			@Pc(108) Class13_Sub6 local108 = local30.aClass13_Sub6_1;
			if (local108.anInt4615 != local25.aClass13_Sub6_1.anInt4615) {
				if (local101 == null) {
					local101 = local108;
				}
				if (local108.anInt4615 != local101.anInt4615 && local103 == null) {
					local103 = local108;
				}
			}
			local30 = (Class4_Sub2_Sub3) local13.method607();
		}
		@Pc(149) long local149 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static88.method1486(Static222.anInt4467, arg1, arg0, Static58.method2504(arg0 * 128 + 64, arg1 * 128 + 64, Static222.anInt4467), local25.aClass13_Sub6_1, local149, local101, local103);
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(II)V")
	public static void method847() {
		Static266.anInt5231 = -1;
		Static55.anInt1252 = 1;
		Static287.aBoolean385 = false;
		Static8.anInt148 = 0;
		Static156.anInt3218 = -1;
		Static99.anInt1951 = 2;
		Static127.aClass22_43 = null;
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
	public static void method848() {
		Static242.method3716();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static223.aClass12Array1[local12].method270();
		}
		System.gc();
	}
}
