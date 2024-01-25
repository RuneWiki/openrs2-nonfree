import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "Lclient!hk;")
	public static Class155 aClass155_33;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "Lclient!wc;")
	public static final Class387 aClass387_7 = new Class387();

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!ha;B)V")
	public static void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		Static611.aClass283ArrayArray1 = new Class283[arg0][arg1];
		Static437.aClass100_10 = arg2;
		if (Static344.anIntArray330 != null) {
			Static512.aClass185_3 = Static263.method4284(Static344.anIntArray330[0], Static344.anIntArray330[1], Static344.anIntArray330[2], Static344.anIntArray330[3], Static344.anIntArray330[5], Static344.anIntArray330[4]);
		}
		Static39.aClass283_1 = new Class283();
		Static271.method4450();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method8248(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg1 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg1.startsWith("#")) {
			return arg0.equals(arg1);
		} else {
			return arg3.equals(arg2);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8250(@OriginalArg(0) Class100 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static377.aBoolean419) {
			local7 = Static194.method8971();
			local9 = Static5.method9220();
		}
		arg0.KA(local7, local9, Static85.anInt9921 + local7, local9 + 350);
		arg0.aa(local7, local9, Static85.anInt9921, 350, Static38.anInt631 << 24 | 0x332277, 1);
		Static395.method5811(local9, local7 + Static85.anInt9921, local9 + 350, local7);
		@Pc(61) int local61 = 350 / Static152.anInt2985;
		@Pc(70) int local70;
		if (Static356.anInt5849 > 0) {
			local70 = 346 - Static152.anInt2985 - 4;
			@Pc(80) int local80 = local70 * local61 / (Static356.anInt5849 + local61 - 1);
			@Pc(82) int local82 = 4;
			if (Static356.anInt5849 > 1) {
				local82 = (Static356.anInt5849 - Static165.anInt3245 - 1) * (-local80 + local70) / (Static356.anInt5849 - 1) + 4;
			}
			arg0.aa(local7 + Static85.anInt9921 - 16, local9 - -local82, 12, local80, Static38.anInt631 << 24 | 0x332277, 2);
			for (@Pc(125) int local125 = Static165.anInt3245; Static165.anInt3245 + local61 > local125 && Static356.anInt5849 > local125; local125++) {
				@Pc(134) String[] local134 = Static350.method5156('\b', Static464.aStringArray33[local125]);
				@Pc(143) int local143 = (Static85.anInt9921 - 8 - 16) / local134.length;
				for (@Pc(145) int local145 = 0; local145 < local134.length; local145++) {
					@Pc(153) int local153 = local145 * local143 + 8;
					arg0.KA(local153 + local7, local9, local143 + local7 + local153 - 8, local9 + 350);
					Static414.aClass70_6.method8433(local7 + local153, -16777216, -1, Static226.method3577(local134[local145]), local9 + 350 - Static85.aClass196_38.anInt5056 - Static137.anInt2739 - (local125 + -Static165.anInt3245) * Static152.anInt2985 - 2);
				}
			}
		}
		Static510.aClass70_11.method8428("Build: 656", -1, local9 + 350 - 20, -16777216, local7 + Static85.anInt9921 - 25);
		arg0.KA(local7, local9, local7 + Static85.anInt9921, local9 + 350);
		arg0.method8615(Static85.anInt9921, local7, local9 + 350 - Static137.anInt2739, -1);
		Static196.aClass70_3.method8433(local7 + 10, -16777216, -1, "--> " + Static226.method3577(Static220.aString35), local9 + 350 - Static73.aClass196_5.anInt5056 - 1);
		if (!Static645.aBoolean756) {
			return;
		}
		local70 = -1;
		if (Static565.anInt8921 % 30 > 15) {
			local70 = 16777215;
		}
		arg0.method8621(local70, 12, Static73.aClass196_5.method4556("--> " + Static226.method3577(Static220.aString35).substring(0, Static335.anInt8972)) + local7 + 10, -Static73.aClass196_5.anInt5056 + -11 + 350 + local9);
	}
}
