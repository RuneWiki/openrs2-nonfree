import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt6155;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!s;")
	public static final Class217 aClass217_134 = new Class217(69, 0);

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lclient!ee;")
	public static final Class65[] aClass65Array1 = new Class65[8];

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_135 = new Class217(96, -1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method4862(@OriginalArg(0) int arg0) {
		Static92.anInt1932 = arg0;
		@Pc(7) Class267 local7 = Static284.aClass267_51;
		synchronized (Static284.aClass267_51) {
			Static284.aClass267_51.method6011();
		}
		local7 = Static416.aClass267_78;
		synchronized (Static416.aClass267_78) {
			Static416.aClass267_78.method6011();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method4863() {
		Static56.method993(Static412.aClass50_8, (long) Static400.anInt6752);
		if (Static189.anInt3826 != -1) {
			Static298.method4150(Static189.anInt3826);
		}
		for (@Pc(27) int local27 = 0; local27 < Static167.anInt3304; local27++) {
			if (Static432.aBooleanArray24[local27]) {
				Static373.aBooleanArray19[local27] = true;
			}
			Static301.aBooleanArray15[local27] = Static432.aBooleanArray24[local27];
			Static432.aBooleanArray24[local27] = false;
		}
		Static361.anInt6149 = Static400.anInt6752;
		if (Static412.aClass50_8.method5830()) {
			Static97.aBoolean74 = true;
		}
		if (Static189.anInt3826 != -1) {
			Static167.anInt3304 = 0;
			Static111.method4688();
		}
		Static412.aClass50_8.va();
		Static295.method3635(Static412.aClass50_8);
		@Pc(74) int local74 = Static296.method4131();
		if (local74 == -1) {
			local74 = Static40.anInt656;
		}
		if (local74 == -1) {
			local74 = Static78.anInt1647;
		}
		Static45.method5779(local74);
		Static68.anInt1469 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method4864() {
		for (@Pc(3) int local3 = 0; local3 < Static216.anInt4132; local3++) {
			@Pc(9) int local9 = Static64.anIntArray97[local3];
			@Pc(17) Class24_Sub3_Sub2_Sub1 local17 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) local9)).aClass24_Sub3_Sub2_Sub1_2;
			@Pc(21) int local21 = Static203.aClass10_Sub8_Sub2_1.method2502();
			if ((local21 & 0x40) != 0) {
				local21 += Static203.aClass10_Sub8_Sub2_1.method2502() << 8;
			}
			@Pc(41) int local41;
			if ((local21 & 0x1000) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2486();
				@Pc(44) int[] local44 = new int[local41];
				@Pc(47) int[] local47 = new int[local41];
				@Pc(50) int[] local50 = new int[local41];
				for (@Pc(52) int local52 = 0; local52 < local41; local52++) {
					@Pc(60) int local60 = Static203.aClass10_Sub8_Sub2_1.method2471();
					if (local60 == 65535) {
						local60 = -1;
					}
					local44[local52] = local60;
					local47[local52] = Static203.aClass10_Sub8_Sub2_1.method2483();
					local50[local52] = Static203.aClass10_Sub8_Sub2_1.method2498();
				}
				Static53.method916(local50, local44, local17, local47);
			}
			@Pc(109) int local109;
			@Pc(122) int local122;
			if ((local21 & 0x400) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2471();
				local109 = Static203.aClass10_Sub8_Sub2_1.method2459();
				if (local41 == 65535) {
					local41 = -1;
				}
				local122 = Static203.aClass10_Sub8_Sub2_1.method2503();
				local17.method4914(local41, local122, local109, true);
			}
			if ((local21 & 0x4) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2520();
				if (local41 == 65535) {
					local41 = -1;
				}
				local109 = Static203.aClass10_Sub8_Sub2_1.method2486();
				Static200.method3159(local41, local17, local109);
			}
			if ((local21 & 0x1) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2469();
				local109 = Static203.aClass10_Sub8_Sub2_1.method2503();
				local17.method4911(Static400.anInt6752, local41, local109);
				local17.anInt6253 = Static400.anInt6752 + 300;
				local17.anInt6215 = Static203.aClass10_Sub8_Sub2_1.method2483();
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt6241 = Static203.aClass10_Sub8_Sub2_1.method2520();
				if (local17.anInt6241 == 65535) {
					local17.anInt6241 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local17.aString56 = Static203.aClass10_Sub8_Sub2_1.method2478();
				local17.anInt6209 = 100;
			}
			if ((local21 & 0x20) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2520();
				if (local41 == 65535) {
					local41 = -1;
				}
				local109 = Static203.aClass10_Sub8_Sub2_1.method2487();
				local122 = Static203.aClass10_Sub8_Sub2_1.method2486();
				local17.method4914(local41, local122, local109, false);
			}
			if ((local21 & 0x100) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2520();
				local17.anInt6236 = Static203.aClass10_Sub8_Sub2_1.method2486();
				local17.anInt6267 = Static203.aClass10_Sub8_Sub2_1.method2503();
				local17.lb = (local41 & 0x8000) != 0;
				local17.anInt6239 = local41 & 0x7FFF;
				local17.anInt6252 = Static400.anInt6752 + local17.anInt6239 + local17.anInt6236;
			}
			if ((local21 & 0x80) != 0) {
				local41 = Static203.aClass10_Sub8_Sub2_1.method2469();
				local109 = Static203.aClass10_Sub8_Sub2_1.method2483();
				local17.method4911(Static400.anInt6752, local41, local109);
			}
			if ((local21 & 0x2) != 0) {
				if (local17.aClass222_1.method4945()) {
					Static50.method853(local17);
				}
				local17.method2892(Static448.aClass38_4.method866(Static203.aClass10_Sub8_Sub2_1.method2520()));
				local17.method4917(local17.aClass222_1.anInt6351);
				local17.anInt6219 = local17.aClass222_1.anInt6358 << 3;
				if (local17.aClass222_1.method4945()) {
					Static129.method2264(local17.anIntArray611[0], null, null, local17.anIntArray610[0], 0, local17.aByte98, local17);
				}
			}
			if ((local21 & 0x800) != 0) {
				local17.aByte72 = Static203.aClass10_Sub8_Sub2_1.method2476();
				local17.aByte71 = Static203.aClass10_Sub8_Sub2_1.method2481();
				local17.aByte70 = Static203.aClass10_Sub8_Sub2_1.method2476();
				local17.aByte73 = (byte) Static203.aClass10_Sub8_Sub2_1.method2486();
				local17.anInt6218 = Static400.anInt6752 + Static203.aClass10_Sub8_Sub2_1.method2471();
				local17.anInt6262 = Static400.anInt6752 + Static203.aClass10_Sub8_Sub2_1.method2485();
			}
			if ((local21 & 0x200) != 0) {
				local17.anInt6283 = Static203.aClass10_Sub8_Sub2_1.method2476();
				local17.anInt6246 = Static203.aClass10_Sub8_Sub2_1.method2460();
				local17.anInt6258 = Static203.aClass10_Sub8_Sub2_1.method2476();
				local17.anInt6254 = Static203.aClass10_Sub8_Sub2_1.method2481();
				local17.anInt6285 = Static203.aClass10_Sub8_Sub2_1.method2485() + Static400.anInt6752;
				local17.anInt6261 = Static203.aClass10_Sub8_Sub2_1.method2471() + Static400.anInt6752;
				local17.anInt6255 = Static203.aClass10_Sub8_Sub2_1.method2503();
				local17.anInt6291 = 0;
				local17.anInt6258 += local17.anIntArray610[0];
				local17.anInt6288 = 1;
				local17.anInt6246 += local17.anIntArray611[0];
				local17.anInt6254 += local17.anIntArray611[0];
				local17.anInt6283 += local17.anIntArray610[0];
			}
			if ((local21 & 0x2000) != 0) {
				local17.anInt3575 = Static203.aClass10_Sub8_Sub2_1.method2471();
				local17.anInt3585 = Static203.aClass10_Sub8_Sub2_1.method2498();
			}
		}
	}
}
