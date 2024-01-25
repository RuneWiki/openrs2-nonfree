import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!ic;")
	public static Class113 aClass113_117;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!ic;")
	public static Class113 aClass113_118;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray44;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[Lclient!vb;")
	public static final Class247[] aClass247Array1 = new Class247[4];

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt6367 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!ic;Lclient!ic;Lclient!s;Lclient!ic;)Z")
	public static boolean method4894(@OriginalArg(1) Class113 arg0, @OriginalArg(2) Class113 arg1, @OriginalArg(3) Class1_Sub9_Sub4 arg2, @OriginalArg(4) Class113 arg3) {
		Static394.aClass113_123 = arg3;
		Static16.aClass113_66 = arg1;
		Static284.aClass113_88 = arg0;
		Static312.aClass1_Sub9_Sub4_3 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLclient!dh;)V")
	public static void method4895(@OriginalArg(1) Class1_Sub11 arg0) {
		if (arg0.aByteArray64.length - arg0.anInt5766 < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method4463();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray64.length - arg0.anInt5766 < 2) {
			return;
		}
		@Pc(54) int local54 = arg0.method4485();
		if (local54 * 6 != arg0.aByteArray64.length - arg0.anInt5766) {
			return;
		}
		while (true) {
			@Pc(70) int local70;
			@Pc(74) int local74;
			do {
				do {
					do {
						if (arg0.aByteArray64.length <= arg0.anInt5766) {
							return;
						}
						local70 = arg0.method4485();
						local74 = arg0.method4487();
					} while (Static156.anIntArray134.length <= local70);
				} while (!Static389.aBooleanArray12[local70]);
			} while (Static368.aClass94_1.method1816(local70).aChar5 == '1' && (local74 < -1 || local74 > 1));
			Static156.anIntArray134[local70] = local74;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!dh;)Lclient!qb;")
	public static Class1_Sub1 method4896(@OriginalArg(1) Class1_Sub11 arg0) {
		arg0.method4463();
		@Pc(13) int local13 = arg0.method4463();
		@Pc(17) Class1_Sub1 local17 = Static169.method2130(local13);
		local17.anInt7441 = arg0.method4463();
		@Pc(26) int local26 = arg0.method4463();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(42) int local42 = arg0.method4463();
			local17.method5619(local42, arg0);
		}
		local17.method5627();
		return local17;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)I")
	public static int method4897() {
		return 6;
	}
}
