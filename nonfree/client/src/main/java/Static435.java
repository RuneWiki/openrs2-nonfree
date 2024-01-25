import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_179 = new Class251(62, 4);

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "[I")
	public static int[] anIntArray388 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "[I")
	public static final int[] anIntArray389 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILclient!qga;B)V")
	public static void method6487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299 arg2) {
		if (Static546.aBoolean727) {
			@Pc(21) Class108 local21 = Static365.anInt6221 == -1 ? null : Static653.aClass104_2.method2173(Static365.anInt6221);
			if (Static80.method1360(arg2).method481() && (Static655.anInt10731 & 0x20) != 0 && (local21 == null || arg2.method7434(local21.anInt2348, Static365.anInt6221) != local21.anInt2348)) {
				Static258.method4326(Static621.aString117 + " -> " + arg2.aString95, Static529.aString102, false, Static217.anInt4240, 0L, arg2.anInt8590, false, true, 47, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8526 | arg2.anInt8590 << 0));
			}
		}
		@Pc(104) String local104;
		for (@Pc(95) int local95 = 9; local95 >= 5; local95--) {
			local104 = Static408.method6137(local95, arg2);
			if (local104 != null) {
				Static258.method4326(arg2.aString95, local104, false, Static7.method103(arg2, local95), (long) (local95 + 1), arg2.anInt8590, false, true, 1011, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8590 << 0 | arg2.anInt8526));
			}
		}
		if (-116 < -121) {
			anIntArray388 = null;
		}
		local104 = Static380.method5856(arg2);
		if (local104 != null) {
			Static258.method4326(arg2.aString95, local104, false, arg2.anInt8533, 0L, arg2.anInt8590, false, true, 30, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8526 | arg2.anInt8590 << 0));
		}
		for (@Pc(198) int local198 = 4; local198 >= 0; local198--) {
			@Pc(207) String local207 = Static408.method6137(local198, arg2);
			if (local207 != null) {
				Static258.method4326(arg2.aString95, local207, false, Static7.method103(arg2, local198), (long) (local198 + 1), arg2.anInt8590, false, true, 6, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8590 << 0 | arg2.anInt8526));
			}
		}
		if (!Static80.method1360(arg2).method476()) {
			return;
		}
		if (arg2.aString98 == null) {
			Static258.method4326("", Static21.aClass21_9.method324(Static26.anInt352), false, -1, 0L, arg2.anInt8590, false, true, 18, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8526 | arg2.anInt8590 << 0));
		} else {
			Static258.method4326("", arg2.aString98, false, -1, 0L, arg2.anInt8590, false, true, 18, arg2.anInt8621, arg2.anInt8526, (long) (arg2.anInt8590 << 0 | arg2.anInt8526));
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!haa;IZLclient!nw;)V")
	public static void method6488(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class259 arg2) {
		if (Static208.anInt7849 >= 50 || (arg2 == null || arg2.anIntArrayArray51 == null || arg2.anIntArrayArray51.length <= arg1 || arg2.anIntArrayArray51[arg1] == null)) {
			return;
		}
		@Pc(40) int local40 = arg2.anIntArrayArray51[arg1][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(54) int local54 = local40 & 0x1F;
		@Pc(71) int local71;
		if (arg2.anIntArrayArray51[arg1].length > 1) {
			local71 = (int) (Math.random() * (double) arg2.anIntArrayArray51[arg1].length);
			if (local71 > 0) {
				local44 = arg2.anIntArrayArray51[arg1][local71];
			}
		}
		local71 = 256;
		if (arg2.anIntArray375 != null && arg2.anIntArray374 != null) {
			local71 = arg2.anIntArray375[arg1] + (int) (Math.random() * (double) (arg2.anIntArray374[arg1] - arg2.anIntArray375[arg1]));
		}
		@Pc(123) int local123 = arg2.anIntArray372 == null ? 255 : arg2.anIntArray372[arg1];
		if (local54 == 0) {
			if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == arg0) {
				if (arg2.aBoolean505) {
					Static676.method9511(local50, local123, false, local44, local71, 0);
					return;
				}
				Static400.method968(local123, local44, 0, local71, local50);
			}
		} else if (Static181.aClass14_Sub26_9.aClass43_Sub11_5.method3829() != 0) {
			@Pc(178) int local178 = arg0.anInt11184 - 256 >> 9;
			@Pc(185) int local185 = arg0.anInt11178 - 256 >> 9;
			@Pc(207) int local207 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 == arg0 ? 0 : (arg0.aByte146 << 24) - (-(local178 << 16) - ((local185 << 8) + local54));
			Static314.aClass106Array1[Static208.anInt7849++] = new Class106((byte) (arg2.aBoolean505 ? 2 : 1), local44, local50, 0, local123, local207, local71, arg0);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)Lclient!tga;")
	public static Class347 method6495() {
		return Static232.method3903(Static387.anInt9114) ? Static277.aClass347_1 : Static277.aClass347_2;
	}
}
