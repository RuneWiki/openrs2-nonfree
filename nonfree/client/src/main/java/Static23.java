import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)C")
	public static char method435(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ie;I)Ljava/lang/String;")
	public static String method436(@OriginalArg(0) Class3_Sub26 arg0) {
		return arg0.aString103 == null || arg0.aString103.length() <= 0 ? arg0.aString102 : arg0.aString102 + Static127.aString101 + arg0.aString103;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZILclient!tj;)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2) {
		Static58.aClass184ArrayArray1 = new Class184[arg0][arg1];
		Static235.aClass122_9 = arg2;
		if (Static29.anIntArray38 != null) {
			Static228.aClass113_2 = Static294.method5392(Static29.anIntArray38[5], Static29.anIntArray38[0], Static29.anIntArray38[3], Static29.anIntArray38[2], Static29.anIntArray38[4], Static29.anIntArray38[1]);
		}
		Static168.aClass184_1 = new Class184();
		Static1.method6();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static149.method2419(arg0)) {
			Static98.method1678(arg7, arg3, arg4, Static311.aClass181ArrayArray1[arg0], arg2, -1, arg5, arg1, arg6);
		} else if (arg2 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static159.aBooleanArray13[local24] = true;
			}
		} else {
			Static159.aBooleanArray13[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method439() {
		try {
			if (Static221.anInt4557 == 1) {
				@Pc(16) int local16 = Static348.aClass3_Sub2_Sub4_3.method5124();
				if (local16 > 0 && Static348.aClass3_Sub2_Sub4_3.method5133()) {
					local16 -= Static270.anInt5435;
					if (local16 < 0) {
						local16 = 0;
					}
					Static348.aClass3_Sub2_Sub4_3.method5117(local16);
				} else {
					Static348.aClass3_Sub2_Sub4_3.method5144();
					Static348.aClass3_Sub2_Sub4_3.method5138();
					Static336.aClass3_Sub23_2 = null;
					if (Static123.aClass100_57 == null) {
						Static221.anInt4557 = 0;
					} else {
						Static221.anInt4557 = 2;
					}
					Static333.aClass52_1 = null;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static348.aClass3_Sub2_Sub4_3.method5144();
			Static336.aClass3_Sub23_2 = null;
			Static221.anInt4557 = 0;
			Static333.aClass52_1 = null;
			Static123.aClass100_57 = null;
		}
	}
}
