import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_65 = new Class144(10, -1);

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_99 = new Class397(45, 0);

	@OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
	public static int anInt6490 = -1;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)I")
	public static int method5632() {
		if (Static530.aBoolean556) {
			return 6;
		} else if (Static585.aClass3_Sub7_Sub10_3 == null) {
			return 0;
		} else {
			@Pc(16) int local16 = Static585.aClass3_Sub7_Sub10_3.anInt3913;
			if (Static348.method4922(local16)) {
				return 1;
			} else if (Static594.method6761(local16)) {
				return 2;
			} else if (Static485.method6599(local16)) {
				return 3;
			} else if (Static496.method6774(local16)) {
				return 4;
			} else if (Static646.method8499(local16)) {
				return 7;
			} else if (local16 == 45) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5633(@OriginalArg(0) Class22 arg0) {
		if (Static716.anInt11158 < 2 && !Static474.aBoolean505 || Static334.aClass270_10 != null) {
			return;
		}
		@Pc(63) String local63;
		if (Static474.aBoolean505 && Static716.anInt11158 < 2) {
			local63 = Static261.aString59 + Static430.aClass257_31.method5699(Static456.anInt7118) + Static96.aString130 + " ->";
		} else if (Static182.aBoolean199 && Static43.aClass50_1.method7394(81) && Static716.anInt11158 > 2) {
			local63 = Static489.method9236(Static585.aClass3_Sub7_Sub10_3);
		} else {
			@Pc(55) Class3_Sub7_Sub10 local55 = Static585.aClass3_Sub7_Sub10_3;
			if (local55 == null) {
				return;
			}
			local63 = Static489.method9236(local55);
			@Pc(65) int[] local65 = null;
			if (Static594.method6761(local55.anInt3913)) {
				local65 = Static606.aClass62_2.method1887((int) local55.aLong145).lb;
			} else if (local55.anInt3912 != -1) {
				local65 = Static606.aClass62_2.method1887(local55.anInt3912).lb;
			} else if (Static496.method6774(local55.anInt3913)) {
				@Pc(99) Class3_Sub52 local99 = (Class3_Sub52) Static94.aClass313_8.method7104((long) (int) local55.aLong145);
				if (local99 != null) {
					@Pc(104) Class9_Sub1_Sub1_Sub2_Sub2 local104 = local99.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					@Pc(107) Class219 local107 = local104.aClass219_1;
					if (local107.anIntArray405 != null) {
						local107 = local107.method5035(Static380.aClass127_1);
					}
					if (local107 != null) {
						local65 = local107.anIntArray407;
					}
				}
			} else if (Static485.method6599(local55.anInt3913)) {
				@Pc(137) Class247 local137 = Static216.aClass53_3.method1523((int) (local55.aLong145 >>> 32 & 0x7FFFFFFFL));
				if (local137.anIntArray477 != null) {
					local137 = local137.method5442(Static380.aClass127_1);
				}
				if (local137 != null) {
					local65 = local137.anIntArray480;
				}
			}
			if (local65 != null) {
				local63 = local63 + Static343.method4887(local65);
			}
		}
		if (Static716.anInt11158 > 2) {
			local63 = local63 + "<col=ffffff> / " + (Static716.anInt11158 - 2) + Class257.lb.method5699(Static456.anInt7118);
		}
		if (Static712.aClass270_5 != null) {
			@Pc(229) Class57 local229 = Static712.aClass270_5.method6028(arg0);
			if (local229 == null) {
				local229 = Static561.aClass57_10;
			}
			local229.method9137(Static305.anIntArray362, Static712.aClass270_5.anInt6963, Static712.aClass270_5.anInt6971, Static548.anInt8967, Static712.aClass270_5.anInt7045, Static712.aClass270_5.anInt6968, Static712.aClass270_5.anInt6972, Static658.anInt10096, Static261.anInt4046, Static218.anIntArray249, Static342.aRandom1, local63, Static712.aClass270_5.anInt7015, Static413.aClass178Array13);
			Static216.method3227(Static305.anIntArray362[1], Static305.anIntArray362[2], Static305.anIntArray362[3], Static305.anIntArray362[0]);
		} else if (Static561.aClass270_18 != null && Static346.aClass309_6 == Static326.aClass309_5) {
			@Pc(296) int local296 = Static561.aClass57_10.method9144(Static477.anInt7514 + 4, Static413.aClass178Array13, local63, Static218.anIntArray249, Static548.anInt8967, Static655.anInt10078 + 16, Static342.aRandom1);
			Static216.method3227(Static655.anInt10078, local296 + Static677.aClass169_12.method3653(local63), 16, Static477.anInt7514 + 4);
		}
	}
}
