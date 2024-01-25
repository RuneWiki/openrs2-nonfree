import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gv", name = "G", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!gv", name = "N", descriptor = "Lclient!ek;")
	public static Class85 aClass85_4;

	@OriginalMember(owner = "client!gv", name = "I", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_75 = new Class40(32, -1);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z")
	public static boolean method2672(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIILclient!oa;)V")
	public static void method2673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121 arg4) {
		arg4.ca(arg3, arg2, arg1 + arg3, arg0 + arg2);
		arg4.method7109(arg2, arg1, arg0, arg3, -16777216);
		if (Static142.anInt2546 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static349.anInt7463 / (float) Static349.anInt7466;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg1 * local35);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg2 + (arg0 - local39) / 2;
		@Pc(74) int local74 = arg3 + (arg1 - local37) / 2;
		if (Static510.aClass4_33 == null || Static510.aClass4_33.QA() != arg1 || arg0 != Static510.aClass4_33.b()) {
			Static349.method6181(Static349.anInt7457, Static349.anInt7463 + Static349.anInt7465, Static349.anInt7466 + Static349.anInt7457, Static349.anInt7465, local74, local66, local74 + local37, local39 + local66);
			Static349.method6191(arg4);
			Static510.aClass4_33 = arg4.method7091(local74, local66, local37, local39, false);
		}
		Static510.aClass4_33.method6514(local74, local66);
		@Pc(126) int local126 = local37 * Static505.anInt8396 / Static349.anInt7466;
		@Pc(137) int local137 = Static360.anInt6288 * local39 / Static349.anInt7463;
		@Pc(145) int local145 = Static165.anInt3010 * local37 / Static349.anInt7466 + local74;
		@Pc(159) int local159 = local66 + local39 - local137 - Static411.anInt7201 * local39 / Static349.anInt7463;
		@Pc(161) int local161 = -1996554240;
		if (Static533.aClass314_4 == Static57.aClass314_1) {
			local161 = -1996488705;
		}
		arg4.C(local145, local159, local126, local137, local161, 1);
		arg4.method7127(local145, local159, local126, local137, local161, 0);
		if (Static102.anInt1883 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static104.anInt1939 <= 50) {
			local193 = Static104.anInt1939 * 5;
		} else {
			local193 = 500 - Static104.anInt1939 * 5;
		}
		for (@Pc(207) Class6_Sub34 local207 = (Class6_Sub34) Static349.aClass275_155.method6366(); local207 != null; local207 = (Class6_Sub34) Static349.aClass275_155.method6364()) {
			@Pc(215) Class179 local215 = Static349.aClass276_3.method6396(local207.anInt4907);
			if (Static317.method4929(local215)) {
				@Pc(232) int local232;
				@Pc(244) int local244;
				if (local207.anInt4907 == Static492.anInt8232) {
					local232 = local207.anInt4906 * local37 / Static349.anInt7466 + local74;
					local244 = local39 * (Static349.anInt7463 - local207.anInt4905) / Static349.anInt7463 + local66;
					arg4.method7109(local244 - 2, 4, 4, local232 - 2, local193 << 24 | 0xFFFF00);
				} else if (Static20.anInt364 != -1 && local215.anInt4584 == Static20.anInt364) {
					local232 = local74 + local37 * local207.anInt4906 / Static349.anInt7466;
					local244 = local66 + (Static349.anInt7463 - local207.anInt4905) * local39 / Static349.anInt7463;
					arg4.method7109(local244 - 2, 4, 4, local232 - 2, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
