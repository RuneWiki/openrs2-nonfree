import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIZ)V")
	public static void method9200(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static347.method5937(arg1, 0, Static281.aClass206_Sub1Array1.length - 1, arg0, arg2, arg3);
		Static498.anInt9231 = 0;
		Static439.aClass2_Sub36_2 = null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BJ)V")
	public static void method9201(@OriginalArg(1) long arg0) {
		if (Static395.aClass100ArrayArrayArray3 != null) {
			if (Static496.anInt9165 == 1 || Static496.anInt9165 == 5) {
				Static599.method8792(arg0);
			} else if (Static496.anInt9165 == 4) {
				Static313.method5483(arg0);
			}
		}
		Static634.method9194(Static186.aClass20_4, (long) Static407.anInt7704);
		if (Static475.anInt10143 != -1) {
			Static6.method166(Static475.anInt10143);
		}
		for (@Pc(39) int local39 = 0; local39 < Static511.anInt9364; local39++) {
			if (Static403.aBooleanArray18[local39]) {
				Static60.aBooleanArray9[local39] = true;
			}
			Static437.aBooleanArray20[local39] = Static403.aBooleanArray18[local39];
			Static403.aBooleanArray18[local39] = false;
		}
		Static267.anInt5681 = Static407.anInt7704;
		Static327.method5626(null, -1, -1);
		Static437.method6921(-1, null, -1);
		if (Static475.anInt10143 != -1) {
			Static511.anInt9364 = 0;
			Static323.method5594();
		}
		Static186.aClass20_4.la();
		Static270.method4966(Static186.aClass20_4);
		@Pc(94) int local94 = Static4.method112();
		if (local94 == -1) {
			local94 = Static151.anInt3895;
		}
		if (local94 == -1) {
			local94 = Static338.anInt6830;
		}
		Static231.method4405(local94);
		@Pc(117) int local117 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() << 8;
		Static110.method2806(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, Static99.anInt2781, local117 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 - -local117);
		Static99.anInt2781 = 0;
	}
}
