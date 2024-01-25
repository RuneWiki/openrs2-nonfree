import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
	public static int anInt6395;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "[I")
	public static final int[] anIntArray591 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZLclient!cl;)V")
	public static void method5315(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class31_Sub2_Sub1_Sub1 arg1) {
		if (Static217.anInt4004 >= 400) {
			return;
		}
		if (Static452.aClass31_Sub2_Sub1_Sub1_2 != arg1) {
			@Pc(180) String local180;
			@Pc(112) int local112;
			if (arg1.anInt1322 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1309 != -1 && arg1.anInt1309 != -1) {
					@Pc(86) int local86 = arg1.anInt1289 >= Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289 ? arg1.anInt1289 : Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289;
					@Pc(101) int local101 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1309 < arg1.anInt1309 ? Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1309 : arg1.anInt1309;
					local112 = local101 + local86 * 10 / 100 + 5;
					@Pc(118) int local118 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289 - arg1.anInt1289;
					if (local118 < 0) {
						local118 = -local118;
					}
					if (local112 < local118) {
						local61 = false;
					}
				}
				@Pc(145) String local145 = Static337.aClass61_5 == Static147.aClass61_4 ? Static432.aClass7_152.method331(Static341.anInt5770) : Static46.aClass7_23.method331(Static341.anInt5770);
				if (arg1.anInt1304 <= arg1.anInt1289) {
					local180 = arg1.method1186() + (local61 ? Static75.method1501(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289, arg1.anInt1289) : "<col=ffffff>") + " (" + local145 + arg1.anInt1289 + ")";
				} else {
					local180 = arg1.method1186() + (local61 ? Static75.method1501(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289, arg1.anInt1289) : "<col=ffffff>") + " (" + local145 + arg1.anInt1289 + "+" + (arg1.anInt1304 - arg1.anInt1289) + ")";
				}
			} else {
				local180 = arg1.method1186() + " (" + Static161.aClass7_68.method331(Static341.anInt5770) + arg1.anInt1322 + ")";
			}
			if (Static355.aBoolean412) {
				if (!arg0 && (Static410.anInt6626 & 0x8) != 0) {
					Static373.method5165(-1, Static289.aString63 + " -> <col=ffffff>" + local180, 0, 0, true, 17, false, Static139.aString22, Static347.anInt5821, (long) arg1.anInt7301);
				}
			} else if (arg0) {
				Static373.method5165(0, "", 0, 0, false, -1, true, "<col=cccccc>" + local180, -1, 0L);
			} else {
				for (@Pc(251) int local251 = 7; local251 >= 0; local251--) {
					if (Static401.aStringArray41[local251] != null) {
						@Pc(259) short local259 = 0;
						if (Static337.aClass61_5 == Static444.aClass61_7 && Static401.aStringArray41[local251].equalsIgnoreCase(Static276.aClass7_114.method331(Static341.anInt5770))) {
							if (arg1.anInt1289 > Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289) {
								local259 = 2000;
							}
							if (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1302 != 0 && arg1.anInt1302 != 0) {
								if (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1302 == arg1.anInt1302) {
									local259 = 2000;
								} else {
									local259 = 0;
								}
							}
						} else if (Static286.aBooleanArray36[local251]) {
							local259 = 2000;
						}
						@Pc(316) short local316 = (short) (Static29.aShortArray70[local251] + local259);
						local112 = Static141.anIntArray212[local251] == -1 ? Static145.anInt2797 : Static141.anIntArray212[local251];
						Static373.method5165(-1, "<col=ffffff>" + local180, 0, 0, true, local316, false, Static401.aStringArray41[local251], local112, (long) arg1.anInt7301);
					}
				}
			}
			if (!arg0) {
				for (@Pc(425) Class1_Sub3 local425 = (Class1_Sub3) Static55.aClass181_63.method4112(); local425 != null; local425 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
					if (local425.anInt117 == 8) {
						local425.aString1 = "<col=ffffff>" + local180;
						return;
					}
				}
			}
		} else if (Static355.aBoolean412 && (Static410.anInt6626 & 0x10) != 0) {
			Static373.method5165(-1, Static289.aString63 + " -> <col=ffffff>" + Static374.aClass7_139.method331(Static341.anInt5770), 0, 0, true, 21, false, Static139.aString22, Static347.anInt5821, 0L);
		}
	}
}
