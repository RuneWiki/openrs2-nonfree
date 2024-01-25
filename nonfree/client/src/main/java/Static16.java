import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!al", name = "C", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array86;

	@OriginalMember(owner = "client!al", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray125;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt9498 = 0;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "Lclient!mf;")
	public static final Class184 aClass184_50 = new Class184();

	@OriginalMember(owner = "client!al", name = "H", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_462 = new Class305(79, 12);

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	public static int anInt9513 = -1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!fk;")
	public static Class1_Sub13 method8191(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub13_Sub2");
			@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) local11.getDeclaredConstructor().newInstance();
			local15.method8181(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub13_Sub1 local26 = new Class1_Sub13_Sub1();
			local26.method8181(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method8192(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static281.aClass4_9 = arg0;
		Static18.anInt348 = arg1;
		Static170.aClass128_4 = arg3;
		Static402.aBoolean543 = Static281.aClass4_9.method7163() > 0;
		Static539.anInt9517 = arg4 >> Static275.anInt5260;
		Static421.anInt7325 = arg6 >> Static275.anInt5260;
		Static107.anInt2259 = arg4;
		Static478.anInt8519 = arg6;
		Static343.anInt9291 = arg5;
		Static395.anInt6943 = Static539.anInt9517 - Static466.anInt8044;
		if (Static395.anInt6943 < 0) {
			Static221.anInt4328 = -Static395.anInt6943;
			Static395.anInt6943 = 0;
		} else {
			Static221.anInt4328 = 0;
		}
		Static301.anInt5882 = Static421.anInt7325 - Static466.anInt8044;
		if (Static301.anInt5882 < 0) {
			Static189.anInt3921 = -Static301.anInt5882;
			Static301.anInt5882 = 0;
		} else {
			Static189.anInt3921 = 0;
		}
		Static332.anInt6223 = Static539.anInt9517 + Static466.anInt8044;
		if (Static332.anInt6223 > Static501.anInt9458) {
			Static332.anInt6223 = Static501.anInt9458;
		}
		Static287.anInt7764 = Static421.anInt7325 + Static466.anInt8044;
		if (Static287.anInt7764 > Static420.anInt7323) {
			Static287.anInt7764 = Static420.anInt7323;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static466.anInt8044 + Static466.anInt8044 + 2; local74++) {
			for (local77 = 0; local77 < Static466.anInt8044 + Static466.anInt8044 + 2; local77++) {
				local84 = Static539.anInt9517 + local74 - Static466.anInt8044;
				local90 = Static421.anInt7325 + local77 - Static466.anInt8044;
				if (local84 >= 0 && local90 >= 0 && local84 < Static501.anInt9458 && local90 < Static420.anInt7323) {
					@Pc(104) int local104 = local84 << Static275.anInt5260;
					@Pc(108) int local108 = local90 << Static275.anInt5260;
					@Pc(124) int local124 = Static411.aClass7Array12[Static411.aClass7Array12.length - 1].ba(local84, local90) - (0x3E8 << Static275.anInt5260 - 7);
					@Pc(144) int local144 = Static207.aClass7Array7 == null ? Static411.aClass7Array12[0].ba(local84, local90) + Static382.anInt6794 : Static207.aClass7Array7[0].ba(local84, local90) + Static382.anInt6794;
					Static442.aBooleanArrayArray10[local74][local77] = Static281.aClass4_9.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static442.aBooleanArrayArray10[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static466.anInt8044 + Static466.anInt8044 + 1; local77++) {
			for (local84 = 0; local84 < Static466.anInt8044 + Static466.anInt8044 + 1; local84++) {
				Static38.aBooleanArrayArray1[local77][local84] = Static442.aBooleanArrayArray10[local77][local84] || Static442.aBooleanArrayArray10[local77 + 1][local84] || Static442.aBooleanArrayArray10[local77][local84 + 1] || Static442.aBooleanArrayArray10[local77 + 1][local84 + 1];
			}
		}
		Static90.anIntArray143 = arg8;
		Static238.anIntArray354 = arg9;
		Static132.anIntArray233 = arg10;
		Static511.anIntArray782 = arg11;
		Static485.anIntArray684 = arg12;
		Static217.method4010();
		Static30.method810(Static281.aClass4_9);
		for (@Pc(261) Class46_Sub6 local261 = (Class46_Sub6) Static191.aClass184_49.method5138(); local261 != null; local261 = (Class46_Sub6) Static191.aClass184_49.method5145()) {
			local261.method8227();
			Static504.method7720(local261);
		}
		if (Static402.aBoolean543) {
			for (local90 = 0; local90 < Static5.anInt146; local90++) {
				Static102.aClass108Array1[local90].method2647(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static281.aClass4_9.method7213(0);
			if (Static164.aClass40_1 == null || Static164.aClass40_1 instanceof Class40_Sub1) {
				Static164.aClass40_1 = new Class40_Sub2();
			}
		} else if (Static164.aClass40_1 == null || Static164.aClass40_1 instanceof Class40_Sub2) {
			Static164.aClass40_1 = new Class40_Sub1();
		}
		Static164.aClass40_1.method8210(arg2);
		Static164.aClass40_1.method8209();
		if (Static15.aClass64ArrayArrayArray1 != null) {
			Static355.method5829(true);
			Static164.aClass40_1.method8219(22);
			Static529.method8237(arg2, null, 0, (byte) 0, arg15, arg16);
			Static164.aClass40_1.method8209();
			Static164.aClass40_1.method8219(23);
			Static355.method5829(false);
		}
		Static529.method8237(arg2, arg7, arg13, arg14, arg15, arg16);
		Static164.aClass40_1.method8209();
		Static164.aClass40_1.method8215();
		Static164.aClass40_1.method8209();
		if (arg2 > 1) {
			Static281.aClass4_9.method7196(0);
		}
		Static281.aClass4_9.method7222(0, null);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(III)B")
	public static byte method8194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg2[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg1 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg1; local33 < local29; local33++) {
				@Pc(39) String local39 = arg2[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(64) int local64 = arg1; local64 < local29; local64++) {
				@Pc(70) String local70 = arg2[local64];
				if (local70 == null) {
					local62.append("null");
				} else {
					local62.append(local70);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!dn;B)I")
	public static int method8203(@OriginalArg(0) Class69 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1896(Static301.anInt5880)) {
			local5++;
		}
		if (arg0.method1896(Static309.anInt5934)) {
			local5++;
		}
		return local5;
	}
}
