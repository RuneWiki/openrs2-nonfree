import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!ml;")
	public static Class199 aClass199_4;

	@OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
	public static int anInt2778;

	@OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
	public static int anInt2782;

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "J")
	public static long aLong96 = 0L;

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "Lclient!id;")
	public static final Class142 aClass142_6 = new Class142("", 10);

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
	public static int anInt2779 = -1;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLclient!bda;)V")
	public static void method2520(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub2_Sub1_Sub1 arg1) {
		if (Static257.anInt5147 >= 400) {
			return;
		}
		if (arg1 != Static35.aClass15_Sub2_Sub1_Sub1_1) {
			@Pc(78) String local78;
			@Pc(129) int local129;
			if (arg1.anInt836 == 0) {
				@Pc(82) boolean local82 = true;
				if (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt856 != -1 && arg1.anInt856 != -1) {
					@Pc(103) int local103 = arg1.anInt852 < Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852 ? Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852 : arg1.anInt852;
					@Pc(118) int local118 = arg1.anInt856 <= Static35.aClass15_Sub2_Sub1_Sub1_1.anInt856 ? arg1.anInt856 : Static35.aClass15_Sub2_Sub1_Sub1_1.anInt856;
					local129 = local118 + local103 * 10 / 100 + 5;
					@Pc(136) int local136 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852 - arg1.anInt852;
					if (local136 < 0) {
						local136 = -local136;
					}
					if (local136 > local129) {
						local82 = false;
					}
				}
				@Pc(162) String local162 = Static525.aClass155_4 == Static53.aClass155_1 ? Static165.aClass40_53.method1063(Static194.anInt3737) : Static6.aClass40_1.method1063(Static194.anInt3737);
				if (arg1.anInt851 > arg1.anInt852) {
					local78 = arg1.method806() + (local82 ? Static137.method1264(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852, arg1.anInt852) : "<col=ffffff>") + " (" + local162 + arg1.anInt852 + "+" + (arg1.anInt851 - arg1.anInt852) + ")";
				} else {
					local78 = arg1.method806() + (local82 ? Static137.method1264(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852, arg1.anInt852) : "<col=ffffff>") + " (" + local162 + arg1.anInt852 + ")";
				}
			} else {
				local78 = arg1.method806() + " (" + Static420.aClass40_154.method1063(Static194.anInt3737) + arg1.anInt836 + ")";
			}
			if (Static479.aBoolean594) {
				if (!arg0 && (Static354.anInt6690 & 0x8) != 0) {
					Static371.method5606(Static186.anInt3582, 0, 10, -1, true, (long) arg1.anInt4745, 0, Static150.aString37, false, Static516.aString81 + " -> <col=ffffff>" + local78);
				}
			} else if (arg0) {
				Static371.method5606(-1, 0, -1, 0, false, 0L, 0, "<col=cccccc>" + local78, true, "");
			} else {
				for (@Pc(244) int local244 = 7; local244 >= 0; local244--) {
					if (Static409.aStringArray33[local244] != null) {
						@Pc(252) short local252 = 0;
						if (Static300.aClass155_2 == Static525.aClass155_4 && Static409.aStringArray33[local244].equalsIgnoreCase(Static296.aClass40_89.method1063(Static194.anInt3737))) {
							if (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt852 < arg1.anInt852) {
								local252 = 2000;
							}
							if (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt829 != 0 && arg1.anInt829 != 0) {
								if (arg1.anInt829 == Static35.aClass15_Sub2_Sub1_Sub1_1.anInt829) {
									local252 = 2000;
								} else {
									local252 = 0;
								}
							}
						} else if (Static257.aBooleanArray16[local244]) {
							local252 = 2000;
						}
						@Pc(307) short local307 = (short) (Static140.aShortArray33[local244] + local252);
						local129 = Static236.anIntArray308[local244] == -1 ? Static37.anInt895 : Static236.anIntArray308[local244];
						Static371.method5606(local129, 0, local307, -1, true, (long) arg1.anInt4745, 0, Static409.aStringArray33[local244], false, "<col=ffffff>" + local78);
					}
				}
			}
			if (!arg0) {
				for (@Pc(409) Class5_Sub47 local409 = (Class5_Sub47) Static521.aClass99_78.method2526(); local409 != null; local409 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
					if (local409.anInt8474 == 46) {
						local409.aString77 = "<col=ffffff>" + local78;
						return;
					}
				}
			}
		} else if (Static479.aBoolean594 && (Static354.anInt6690 & 0x10) != 0) {
			Static371.method5606(Static186.anInt3582, 0, 2, -1, true, 0L, 0, Static150.aString37, false, Static516.aString81 + " -> <col=ffffff>" + Static248.aClass40_83.method1063(Static194.anInt3737));
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method2522(@OriginalArg(0) Class62 arg0) {
		for (@Pc(12) Class30_Sub7 local12 = (Class30_Sub7) Static84.aClass77_5.method2157(); local12 != null; local12 = (Class30_Sub7) Static84.aClass77_5.method2160()) {
			local12.method5904(arg0);
		}
	}
}
