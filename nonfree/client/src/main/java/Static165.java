import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!km", name = "Ec", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!km", name = "Lc", descriptor = "I")
	public static int anInt3296;

	@OriginalMember(owner = "client!km", name = "Bc", descriptor = "I")
	public static int anInt3287 = 0;

	@OriginalMember(owner = "client!km", name = "Vc", descriptor = "[Lclient!pg;")
	public static Class157_Sub1[] aClass157_Sub1Array5 = new Class157_Sub1[0];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIILclient!uo;)V")
	public static void method2678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class129 arg4) {
		arg4.method4952(arg0, arg2, arg0 + arg3, arg2 + arg1);
		arg4.method4941(arg0, arg2, arg3, -16777216, arg1);
		if (Static145.anInt2660 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static271.anInt4338 / (float) Static271.anInt4331;
		@Pc(38) int local38 = arg3;
		@Pc(40) int local40 = arg1;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg3 * local36);
		} else {
			local38 = (int) ((float) arg1 / local36);
		}
		@Pc(67) int local67 = arg0 + (arg3 - local38) / 2;
		@Pc(76) int local76 = arg2 + (arg1 - local40) / 2;
		if (Static89.aClass97_12 == null || Static89.aClass97_12.method5558() != arg3 || Static89.aClass97_12.method5543() != arg1) {
			Static271.method3805(Static271.anInt4332, Static271.anInt4338 + Static271.anInt4339, Static271.anInt4332 + Static271.anInt4331, Static271.anInt4339, local67, local76, local38 + local67, local40 + local76);
			Static271.method3818(arg4);
			Static89.aClass97_12 = arg4.method4960(local67, local76, local38, local40, false);
		}
		Static89.aClass97_12.method5555(local67, local76);
		@Pc(127) int local127 = Static153.anInt2895 * local38 / Static271.anInt4331;
		@Pc(133) int local133 = local40 * Static195.anInt4518 / Static271.anInt4338;
		@Pc(141) int local141 = local38 * Static112.anInt2071 / Static271.anInt4331 + local67;
		@Pc(154) int local154 = local40 + local76 - local133 - local40 * Static175.anInt3454 / Static271.anInt4338;
		@Pc(156) int local156 = -1996554240;
		if (Static68.anInt1264 == 1) {
			local156 = -1996488705;
		}
		arg4.method4945(local141, local154, local127, local133, local156, 1);
		arg4.method5015(local141, local154, local127, local133, local156, 0);
		if (Static247.anInt4961 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static292.anInt5791 > 50) {
			local194 = (100 - Static292.anInt5791) * 5;
		} else {
			local194 = Static292.anInt5791 * 5;
		}
		for (@Pc(205) Class11_Sub8 local205 = (Class11_Sub8) Static271.aClass16_37.method193(); local205 != null; local205 = (Class11_Sub8) Static271.aClass16_37.method188()) {
			@Pc(212) Class23 local212 = Static212.method3827(local205.anInt863);
			if (Static4.method19(local212)) {
				@Pc(238) int local238;
				@Pc(251) int local251;
				if (Static124.anInt2296 == local205.anInt863) {
					local238 = local205.anInt864 * local38 / Static271.anInt4331 + local67;
					local251 = local76 + (Static271.anInt4338 - local205.anInt868) * local40 / Static271.anInt4338;
					arg4.method4941(local238 - 2, local251 + -2, 4, local194 << 24 | 0xFFFF00, 4);
				} else if (Static31.anInt550 != -1 && local212.anInt297 == Static31.anInt550) {
					local238 = local67 + local38 * local205.anInt864 / Static271.anInt4331;
					local251 = local76 + local40 * (Static271.anInt4338 - local205.anInt868) / Static271.anInt4338;
					arg4.method4941(local238 - 2, local251 + -2, 4, local194 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!kh;B)V")
	public static void method2679(@OriginalArg(0) Class11_Sub25 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt6076 < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method5185();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray93.length - arg0.anInt6076 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method5187();
		if (local46 * 6 != arg0.aByteArray93.length - arg0.anInt6076) {
			return;
		}
		while (true) {
			@Pc(66) int local66;
			@Pc(70) int local70;
			do {
				do {
					do {
						if (arg0.aByteArray93.length <= arg0.anInt6076) {
							return;
						}
						local66 = arg0.method5187();
						local70 = arg0.method5198();
					} while (Static25.anIntArray516.length <= local66);
				} while (!Static315.aBooleanArray25[local66]);
			} while (Static297.method4916(local66).aChar3 == '1' && (local70 < -1 || local70 > 1));
			Static25.anIntArray516[local66] = local70;
		}
	}

	@OriginalMember(owner = "client!km", name = "h", descriptor = "(B)V")
	public static void method2682() {
		Static276.anInt5528 = -1;
		Static132.anInt2474 = -1;
		Static9.anInt153 = 0;
	}

	@OriginalMember(owner = "client!km", name = "k", descriptor = "(I)V")
	public static void method2683() {
		if (Static167.anInt3322 == 2) {
			Static355.anInt6753 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static355.anInt6753 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}
}
