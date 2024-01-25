import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	public static int anInt1494 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZLclient!ib;)V")
	public static void method1361(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub3_Sub1 arg1) {
		if (Static183.anInt3155 >= 400) {
			return;
		}
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 != arg1) {
			@Pc(89) String local89;
			if (arg1.anInt4199 == 0) {
				@Pc(100) boolean local100 = true;
				if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4206 != -1 && arg1.anInt4206 != -1) {
					@Pc(121) int local121 = arg1.anInt4206 > Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4206 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4206 : arg1.anInt4206;
					@Pc(128) int local128 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182 - arg1.anInt4182;
					if (local128 < 0) {
						local128 = -local128;
					}
					if (local128 > local121) {
						local100 = false;
					}
				}
				@Pc(158) String local158 = Static457.aClass176_6 == Static427.aClass176_5 ? Static52.aClass41_30.method1007(Static616.anInt10077) : Static52.aClass41_28.method1007(Static616.anInt10077);
				if (arg1.anInt4182 >= arg1.anInt4201) {
					local89 = arg1.method3519() + (local100 ? Static148.method2140(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182, arg1.anInt4182) : "<col=ffffff>") + " (" + local158 + arg1.anInt4182 + ")";
				} else {
					local89 = arg1.method3519() + (local100 ? Static148.method2140(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182, arg1.anInt4182) : "<col=ffffff>") + " (" + local158 + arg1.anInt4182 + "+" + (arg1.anInt4201 - arg1.anInt4182) + ")";
				}
			} else if (arg1.anInt4199 == -1) {
				local89 = arg1.method3519();
			} else {
				local89 = arg1.method3519() + " (" + Static52.aClass41_29.method1007(Static616.anInt10077) + arg1.anInt4199 + ")";
			}
			if (Static291.aBoolean314 && !arg0 && (Static255.anInt5389 & 0x8) != 0) {
				Static200.method2916((long) arg1.anInt5103, Static355.aString75, 0, false, (long) arg1.anInt5103, Static172.aString32 + " -> <col=ffffff>" + local89, 8, Static478.anInt8213, -1, true, 0, false);
			}
			if (arg0) {
				Static200.method2916((long) arg1.anInt5103, "<col=cccccc>" + local89, 0, true, 0L, "", -1, -1, 0, false, 0, false);
			} else {
				for (@Pc(308) int local308 = 7; local308 >= 0; local308--) {
					if (Static82.aStringArray16[local308] != null) {
						@Pc(316) short local316 = 0;
						if (Static615.aClass176_7 == Static457.aClass176_6 && Static82.aStringArray16[local308].equalsIgnoreCase(Static52.aClass41_23.method1007(Static616.anInt10077))) {
							if (Static63.aBoolean723 && arg1.anInt4182 > Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182) {
								local316 = 2000;
							}
							if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4178 == 0 || arg1.anInt4178 == 0) {
								if (arg1.aBoolean258) {
									local316 = 2000;
								}
							} else if (arg1.anInt4178 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4178) {
								local316 = 2000;
							} else {
								local316 = 0;
							}
						} else if (Static40.aBooleanArray25[local308]) {
							local316 = 2000;
						}
						@Pc(379) short local379 = (short) (local316 + Static548.aShortArray138[local308]);
						@Pc(391) int local391 = Static380.anIntArray400[local308] == -1 ? Static80.anInt1521 : Static380.anIntArray400[local308];
						Static200.method2916((long) arg1.anInt5103, Static82.aStringArray16[local308], 0, false, (long) arg1.anInt5103, "<col=ffffff>" + local89, local379, local391, -1, true, 0, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(436) Class6_Sub4_Sub12 local436 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local436 != null; local436 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
					if (local436.anInt7577 == 45) {
						local436.aString99 = "<col=ffffff>" + local89;
						return;
					}
				}
			}
		} else if (Static291.aBoolean314 && (Static255.anInt5389 & 0x10) != 0) {
			Static200.method2916((long) arg1.anInt5103, Static355.aString75, 0, false, 0L, Static172.aString32 + " -> <col=ffffff>" + Static52.aClass41_37.method1007(Static616.anInt10077), 6, Static478.anInt8213, -1, true, 0, false);
		}
	}
}
