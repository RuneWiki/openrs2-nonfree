import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
	public static int anInt4523 = 0;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIILclient!nf;Lclient!nf;)V")
	public static void method3988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub3 arg3, @OriginalArg(4) Class4_Sub1_Sub3 arg4) {
		@Pc(4) Class77 local4 = Static323.method5276(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub3_2 = arg3;
		local4.aClass4_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static364.aClass51Array3 == Static2.aClass51Array1 ? 1 : 0;
		if (!arg3.method7693()) {
			Static491.aClass4_Sub1ArrayArray3[local19][Static582.anIntArray612[local19]++] = arg3;
		} else if (arg3.method7702()) {
			Static368.aClass4_Sub1ArrayArray2[local19][Static62.anIntArray650[local19]++] = arg3;
		} else {
			Static276.aClass4_Sub1ArrayArray1[local19][Static93.anIntArray83[local19]++] = arg3;
			Static585.aBoolean690 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7693()) {
			if (arg4.method7702()) {
				Static368.aClass4_Sub1ArrayArray2[local19][Static62.anIntArray650[local19]++] = arg4;
				return;
			}
			Static276.aClass4_Sub1ArrayArray1[local19][Static93.anIntArray83[local19]++] = arg4;
			Static585.aBoolean690 = true;
			return;
		}
		Static491.aClass4_Sub1ArrayArray3[local19][Static582.anIntArray612[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V")
	public static void method3991() {
		Static361.aClass309Array3 = new Class309[1000];
		Static287.aClass309Array1 = new Class309[500];
		Static280.anInt5017 = 0;
		Static199.anInt3923 = 0;
		Static118.anInt2566 = Static384.anInt7200;
		Static479.aBoolean284 = false;
		Static346.anInt6729 = 0;
		Static402.anInt7434 = 0;
		Static403.anIntArrayArrayArray21 = new int[Static442.anInt7929][Static569.anInt9425 + 1][Static293.anInt5181 + 1];
		Static513.aClass309Array4 = new Class309[500];
		Static529.anInt9061 = Static384.anInt7200;
		Static342.aClass309Array2 = new Class309[2000];
		if (Static232.aClass5_8 instanceof oa) {
			Static500.aBoolean598 = false;
		} else {
			Static500.aBoolean598 = true;
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIII)V")
	public static void method3993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(91) Class77 local91 = Static330.aClass77ArrayArrayArray2[arg3][arg0][arg1];
			if (local91 != null) {
				if (arg2 == 1) {
					local91.aShort29 = 0;
				} else if (arg2 == 2) {
					local91.aShort30 = 0;
				}
			}
			Static490.method7292();
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static346.anInt6729; local18++) {
			@Pc(24) Class309 local24 = Static361.aClass309Array3[local18];
			if (arg2 == local24.aByte126 && arg0 == local24.aShort120 && local24.aShort122 == arg1 || local24.aShort121 == arg0 && arg1 == local24.aShort122) {
				if (local18 != Static346.anInt6729) {
					Static653.method6855(Static361.aClass309Array3, local18 + 1, Static361.aClass309Array3, local18, Static361.aClass309Array3.length - local18 - 1);
				}
				Static346.anInt6729--;
				return;
			}
		}
	}
}
