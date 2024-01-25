import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Lclient!ap;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_28 = new Class198("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[Lclient!fg;")
	public static Class75[] aClass75Array1 = new Class75[50];

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_26 = new Class194(19, 4);

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	public static int anInt1916 = 2;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
	public static boolean method1560() {
		return Static289.aClass170_8 != Static350.aClass170_10 || Static189.anInt3178 >= 2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!sj;Z)V")
	public static void method1562(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static18.anInt395 >= 400) {
			return;
		}
		if (Static220.aClass2_Sub1_Sub3_Sub2_1 != arg0) {
			@Pc(80) String local80;
			@Pc(125) int local125;
			if (arg0.anInt6212 == 0) {
				@Pc(84) boolean local84 = true;
				if (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6222 != -1 && arg0.anInt6222 != -1) {
					@Pc(104) int local104 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228 <= arg0.anInt6228 ? arg0.anInt6228 : Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228;
					@Pc(115) int local115 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6222 >= arg0.anInt6222 ? arg0.anInt6222 : Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6222;
					local125 = local104 * 10 / 100 + local115 + 5;
					@Pc(132) int local132 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228 - arg0.anInt6228;
					if (local132 < 0) {
						local132 = -local132;
					}
					if (local132 > local125) {
						local84 = false;
					}
				}
				@Pc(159) String local159 = Static217.aClass197_2 == Static369.aClass197_4 ? Static435.aClass198_124.method4012(Static38.anInt4834) : Static218.aClass198_80.method4012(Static38.anInt4834);
				if (arg0.anInt6200 > arg0.anInt6228) {
					local80 = arg0.method4927() + (local84 ? Static431.method5697(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228, arg0.anInt6228) : "<col=ffffff>") + " (" + local159 + arg0.anInt6228 + "+" + (arg0.anInt6200 - arg0.anInt6228) + ")";
				} else {
					local80 = arg0.method4927() + (local84 ? Static431.method5697(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228, arg0.anInt6228) : "<col=ffffff>") + " (" + local159 + arg0.anInt6228 + ")";
				}
			} else {
				local80 = arg0.method4927() + " (" + Static53.aClass198_17.method4012(Static38.anInt4834) + arg0.anInt6212 + ")";
			}
			if (Static423.aBoolean478) {
				if (!arg1 && (Static277.anInt4336 & 0x8) != 0) {
					Static450.method5939((long) arg0.anInt6126, -1, 0, true, 12, Static240.aString73, Static360.anInt5869, false, 0, Static21.aString3 + " -> <col=ffffff>" + local80);
				}
			} else if (arg1) {
				Static450.method5939(0L, 0, 0, false, -1, "<col=cccccc>" + local80, -1, true, 0, "");
			} else {
				for (@Pc(267) int local267 = 7; local267 >= 0; local267--) {
					if (Static33.aStringArray4[local267] != null) {
						@Pc(275) short local275 = 0;
						if (Static60.aClass197_1 == Static217.aClass197_2 && Static33.aStringArray4[local267].equalsIgnoreCase(Static381.aClass198_66.method4012(Static38.anInt4834))) {
							if (arg0.anInt6228 > Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228) {
								local275 = 2000;
							}
							if (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6219 != 0 && arg0.anInt6219 != 0) {
								if (arg0.anInt6219 == Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6219) {
									local275 = 2000;
								} else {
									local275 = 0;
								}
							}
						} else if (Static422.aBooleanArray26[local267]) {
							local275 = 2000;
						}
						@Pc(332) short local332 = (short) (Static111.aShortArray16[local267] + local275);
						local125 = Static326.anIntArray374[local267] == -1 ? Static307.anInt4786 : Static326.anIntArray374[local267];
						Static450.method5939((long) arg0.anInt6126, -1, 0, true, local332, Static33.aStringArray4[local267], local125, false, 0, "<col=ffffff>" + local80);
					}
				}
			}
			if (!arg1) {
				for (@Pc(422) Class5_Sub41 local422 = (Class5_Sub41) Static122.aClass177_13.method3618(); local422 != null; local422 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
					if (local422.anInt6815 == 6) {
						local422.aString72 = "<col=ffffff>" + local80;
						return;
					}
				}
			}
		} else if (Static423.aBoolean478 && (Static277.anInt4336 & 0x10) != 0) {
			Static450.method5939(0L, -1, 0, true, 13, Static240.aString73, Static360.anInt5869, false, 0, Static21.aString3 + " -> <col=ffffff>" + Static86.aClass198_23.method4012(Static38.anInt4834));
		}
	}
}
