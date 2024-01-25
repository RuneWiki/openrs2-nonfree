import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "F")
	public static float aFloat221;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "[I")
	public static final int[] anIntArray683 = new int[16];

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_255 = new Class202("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public static int anInt8955 = -1;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!wu;")
	public static final Class320 aClass320_18 = new Class320("WTRC", 1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!hca;BILclient!ih;IILclient!lk;)V")
	public static void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub1_Sub2_Sub2 arg6) {
		@Pc(12) Class2_Sub46 local12 = new Class2_Sub46();
		local12.anInt8990 = arg0 << 7;
		local12.anInt8984 = arg5 << 7;
		local12.anInt8978 = arg4;
		if (arg3 != null) {
			local12.aClass129_1 = arg3;
			@Pc(33) int local33 = arg3.anInt3653;
			@Pc(36) int local36 = arg3.anInt3650;
			if (arg2 == 1 || arg2 == 3) {
				local36 = arg3.anInt3653;
				local33 = arg3.anInt3650;
			}
			local12.anInt8979 = local33 + arg5 << 7;
			local12.anInt8977 = arg3.anInt3691;
			local12.anInt8980 = arg3.anInt3681;
			local12.anInt8988 = arg3.anInt3683 << 7;
			local12.anInt8976 = arg0 + local36 << 7;
			local12.anIntArray690 = arg3.anIntArray395;
			local12.anInt8975 = arg3.anInt3667;
			local12.anInt8987 = arg3.anInt3698;
			if (arg3.anIntArray392 != null) {
				local12.aBoolean645 = true;
				local12.method7509();
			}
			if (local12.anIntArray690 != null) {
				local12.anInt8991 = (int) ((double) (local12.anInt8987 - local12.anInt8975) * Math.random()) + local12.anInt8975;
			}
			Static160.aClass249_18.method6523(local12);
		} else if (arg6 != null) {
			local12.aClass1_Sub1_Sub2_Sub2_2 = arg6;
			@Pc(184) Class12 local184 = arg6.aClass12_1;
			if (local184.anIntArray21 != null) {
				local12.aBoolean645 = true;
				local184 = local184.method455(Static84.aClass302_1);
			}
			if (local184 != null) {
				local12.anInt8976 = arg0 + local184.anInt313 << 7;
				local12.anInt8979 = local184.anInt313 + arg5 << 7;
				local12.anInt8977 = Static148.method2582(arg6);
				local12.anInt8988 = local184.anInt328 << 7;
				local12.anInt8980 = local184.anInt343;
			}
			Static286.aClass249_25.method6523(local12);
		} else if (arg1 != null) {
			local12.aClass1_Sub1_Sub2_Sub1_2 = arg1;
			local12.anInt8979 = arg1.method4394() + arg5 << 7;
			local12.anInt8976 = arg0 + arg1.method4394() << 7;
			local12.anInt8977 = Static215.method6796(arg1);
			local12.anInt8980 = arg1.anInt3269;
			local12.anInt8988 = arg1.anInt3255 << 7;
			Static92.aClass127_16.method3213(local12, (long) arg1.anInt5076);
			return;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method7497(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static452.aClass39_10 = arg0;
		Static169.anInt3088 = arg1;
		Static88.aClass181_7 = arg3;
		Static101.aBoolean612 = Static452.aClass39_10.method6053() > 0;
		Static364.anInt6864 = arg4 >> Static175.anInt3259;
		Static113.anInt2306 = arg6 >> Static175.anInt3259;
		Static2.anInt66 = arg4;
		Static412.anInt7685 = arg6;
		Static152.anInt8131 = arg5;
		Static75.anInt1567 = Static364.anInt6864 - Static207.anInt3723;
		if (Static75.anInt1567 < 0) {
			Static448.anInt8164 = -Static75.anInt1567;
			Static75.anInt1567 = 0;
		} else {
			Static448.anInt8164 = 0;
		}
		Static469.anInt8451 = Static113.anInt2306 - Static207.anInt3723;
		if (Static469.anInt8451 < 0) {
			Static244.anInt4329 = -Static469.anInt8451;
			Static469.anInt8451 = 0;
		} else {
			Static244.anInt4329 = 0;
		}
		Static466.anInt8396 = Static364.anInt6864 + Static207.anInt3723;
		if (Static466.anInt8396 > Static515.anInt3809) {
			Static466.anInt8396 = Static515.anInt3809;
		}
		Static392.anInt7448 = Static113.anInt2306 + Static207.anInt3723;
		if (Static392.anInt7448 > Static315.anInt5693) {
			Static392.anInt7448 = Static315.anInt5693;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static207.anInt3723 + Static207.anInt3723 + 2; local74++) {
			for (local77 = 0; local77 < Static207.anInt3723 + Static207.anInt3723 + 2; local77++) {
				local84 = Static364.anInt6864 + local74 - Static207.anInt3723;
				local90 = Static113.anInt2306 + local77 - Static207.anInt3723;
				if (local84 >= 0 && local90 >= 0 && local84 < Static515.anInt3809 && local90 < Static315.anInt5693) {
					@Pc(104) int local104 = local84 << Static175.anInt3259;
					@Pc(108) int local108 = local90 << Static175.anInt3259;
					@Pc(124) int local124 = Static164.aClass75Array1[Static164.aClass75Array1.length - 1].ba(local84, local90) - (0x3E8 << Static175.anInt3259 - 7);
					@Pc(144) int local144 = Static427.aClass75Array2 == null ? Static164.aClass75Array1[0].ba(local84, local90) + Static136.anInt2574 : Static427.aClass75Array2[0].ba(local84, local90) + Static136.anInt2574;
					Static138.aBooleanArrayArray1[local74][local77] = Static452.aClass39_10.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static138.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static207.anInt3723 + Static207.anInt3723 + 1; local77++) {
			for (local84 = 0; local84 < Static207.anInt3723 + Static207.anInt3723 + 1; local84++) {
				Static533.aBooleanArrayArray6[local77][local84] = Static138.aBooleanArrayArray1[local77][local84] || Static138.aBooleanArrayArray1[local77 + 1][local84] || Static138.aBooleanArrayArray1[local77][local84 + 1] || Static138.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static110.anIntArray229 = arg8;
		Static519.anIntArray693 = arg9;
		Static217.anIntArray401 = arg10;
		Static361.anIntArray522 = arg11;
		Static538.anIntArray760 = arg12;
		Static514.method7502();
		Static62.method1149(Static452.aClass39_10);
		for (@Pc(261) Class6_Sub5 local261 = (Class6_Sub5) Static64.aClass107_1.method2832(); local261 != null; local261 = (Class6_Sub5) Static64.aClass107_1.method2835()) {
			local261.method7058();
			Static68.method1441(local261);
		}
		if (Static101.aBoolean612) {
			for (local90 = 0; local90 < Static361.anInt6824; local90++) {
				Static410.aClass83Array1[local90].method2364(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static452.aClass39_10.method6027(0);
			if (Static41.aClass137_1 == null || Static41.aClass137_1 instanceof Class137_Sub2) {
				Static41.aClass137_1 = new Class137_Sub1();
			}
		} else if (Static41.aClass137_1 == null || Static41.aClass137_1 instanceof Class137_Sub1) {
			Static41.aClass137_1 = new Class137_Sub2();
		}
		Static41.aClass137_1.method6553(arg2);
		Static41.aClass137_1.method6552();
		if (Static274.aClass262ArrayArrayArray3 != null) {
			Static202.method3263(true);
			Static41.aClass137_1.method6550(22);
			Static295.method4664(arg2, null, 0, (byte) 0, arg15, arg16);
			Static41.aClass137_1.method6552();
			Static41.aClass137_1.method6550(23);
			Static202.method3263(false);
		}
		Static295.method4664(arg2, arg7, arg13, arg14, arg15, arg16);
		Static41.aClass137_1.method6552();
		Static41.aClass137_1.method6547();
		Static41.aClass137_1.method6552();
		if (arg2 > 1) {
			Static452.aClass39_10.method6047(0);
		}
		Static452.aClass39_10.method6063(0, null);
	}
}
