import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!tq;")
	public static Interface9 anInterface9_4;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	public static int anInt3381 = -1;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_5 = new Class62(13, 3);

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_57 = new Class11(59, -1);

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_73 = new Class205(40, 5);

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
	public static final int[] anIntArray656 = new int[8];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
	public static void method3100(@OriginalArg(0) boolean arg0) {
		for (@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) Static161.aClass30_18.method694(); local18 != null; local18 = (Class2_Sub29) Static161.aClass30_18.method682()) {
			if (local18.aClass2_Sub2_Sub2_3 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(local18.aClass2_Sub2_Sub2_3);
				local18.aClass2_Sub2_Sub2_3 = null;
			}
			if (local18.aClass2_Sub2_Sub2_2 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(local18.aClass2_Sub2_Sub2_2);
				local18.aClass2_Sub2_Sub2_2 = null;
			}
			local18.method5617();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(59) Class2_Sub29 local59 = (Class2_Sub29) Static386.aClass30_44.method694(); local59 != null; local59 = (Class2_Sub29) Static386.aClass30_44.method682()) {
			if (local59.aClass2_Sub2_Sub2_3 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(local59.aClass2_Sub2_Sub2_3);
				local59.aClass2_Sub2_Sub2_3 = null;
			}
			local59.method5617();
		}
		for (@Pc(86) Class2_Sub29 local86 = (Class2_Sub29) Static367.aClass246_32.method5606(); local86 != null; local86 = (Class2_Sub29) Static367.aClass246_32.method5614()) {
			if (local86.aClass2_Sub2_Sub2_3 != null) {
				Static324.aClass2_Sub2_Sub1_2.method58(local86.aClass2_Sub2_Sub2_3);
				local86.aClass2_Sub2_Sub2_3 = null;
			}
			local86.method5617();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V")
	public static void method3101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15;
		if (arg0 != Static76.anInt1458) {
			Static40.anIntArray173 = new int[arg0];
			for (local15 = 0; local15 < arg0; local15++) {
				Static40.anIntArray173[local15] = (local15 << 12) / arg0;
			}
			Static76.anInt1458 = arg0;
			Static16.anInt386 = arg0 * 32;
			Static269.anInt4657 = arg0 - 1;
		}
		if (arg1 == Static193.anInt3629) {
			return;
		}
		if (arg1 == Static76.anInt1458) {
			Static347.anIntArray1193 = Static40.anIntArray173;
		} else {
			Static347.anIntArray1193 = new int[arg1];
			for (local15 = 0; local15 < arg1; local15++) {
				Static347.anIntArray1193[local15] = (local15 << 12) / arg1;
			}
		}
		Static193.anInt3629 = arg1;
		Static283.anInt4900 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method3102() {
		if (Static334.anInt5726 == -1 || Class2_Sub4_Sub22.lb == -1) {
			return;
		}
		@Pc(25) int local25 = (Static384.anInt6554 * (Static224.anInt4005 - Static381.anInt6501) >> 16) + Static381.anInt6501;
		Static384.anInt6554 += local25;
		if (Static384.anInt6554 < 65535) {
			Static243.aBoolean331 = false;
			Static30.aBoolean54 = false;
		} else {
			if (Static30.aBoolean54) {
				Static243.aBoolean331 = false;
			} else {
				Static243.aBoolean331 = true;
			}
			Static384.anInt6554 = 65535;
			Static30.aBoolean54 = true;
		}
		@Pc(55) float local55 = (float) Static384.anInt6554 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static75.anInt1443 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static221.anIntArrayArrayArray16[Static334.anInt5726][local62][local64] * 3;
			local88 = Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 1][local64] * 3;
			local121 = (Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 2][local64] + Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 2][local64] - Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 3][local64]) * 3;
			@Pc(129) int local129 = Static221.anIntArrayArrayArray16[Static334.anInt5726][local62][local64];
			local133 = local88 - local76;
			local141 = local121 + local76 - local88 * 2;
			local159 = Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 2][local64] + local88 - local129 - local121;
			local58[local64] = (float) local129 + local55 * (local55 * ((float) local141 + (float) local159 * local55) + (float) local133);
		}
		Static51.anInt1057 = (int) local58[2] - Static319.anInt5425 * 128;
		Static285.anInt4940 = (int) local58[1] * -1;
		Static224.anInt4006 = (int) local58[0] - Static28.anInt606 * 128;
		@Pc(214) float[] local214 = new float[3];
		local88 = Static381.anInt6498 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local133 = Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88][local121] * 3;
			local141 = Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88 + 1][local121] * 3;
			local159 = (Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88 + 2][local121] + Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88 + 2][local121] - Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88 + 3][local121]) * 3;
			@Pc(293) int local293 = Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88][local121];
			@Pc(298) int local298 = local141 - local133;
			@Pc(307) int local307 = local133 + local159 - local141 * 2;
			@Pc(324) int local324 = Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb][local88 + 2][local121] + local141 - local293 - local159;
			local214[local121] = (float) local293 + local55 * (((float) local307 + local55 * (float) local324) * local55 + (float) local298);
		}
		@Pc(359) float local359 = local214[0] - local58[0];
		@Pc(370) float local370 = (local214[1] - local58[1]) * -1.0F;
		@Pc(378) float local378 = local214[2] - local58[2];
		@Pc(388) double local388 = Math.sqrt((double) (local378 * local378 + local359 * local359));
		Static14.anInt360 = (int) (Math.atan2((double) local370, local388) * 2607.5945876176133D) & 0x3FFF;
		Static235.anInt4191 = (int) (-Math.atan2((double) local359, (double) local378) * 2607.5945876176133D) & 0x3FFF;
		Static288.anInt5007 = ((Static221.anIntArrayArrayArray16[Static334.anInt5726][local62 + 2][3] - Static221.anIntArrayArrayArray16[Static334.anInt5726][local62][3]) * Static384.anInt6554 >> 16) + Static221.anIntArrayArrayArray16[Static334.anInt5726][local62][3];
	}
}
