import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "[Lclient!co;")
	public static Class33[] aClass33Array2;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!fh;")
	public static Class58 aClass58_74;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_75;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString202 = "Choose Option";

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt3315 = 127;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString203 = "glow1:";

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString204 = "cyan:";

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method2715(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static202.anInt3897 += arg0 * 128;
		@Pc(41) int local41;
		if (Static86.anIntArray159.length < Static202.anInt3897) {
			Static202.anInt3897 -= Static86.anIntArray159.length;
			local41 = (int) (Math.random() * 12.0D);
			Static145.method2291(Static71.aClass56_Sub1Array1[local41]);
		}
		local41 = 0;
		@Pc(52) int local52 = arg0 * 128;
		@Pc(59) int local59 = (256 - arg0) * 128;
		@Pc(61) int local61;
		@Pc(94) int local94;
		for (local61 = 0; local61 < local59; local61++) {
			local94 = Static69.anIntArray100[local52 + local41] - arg0 * Static86.anIntArray159[Static202.anInt3897 + local41 & Static86.anIntArray159.length + -1] / 6;
			if (local94 < 0) {
				local94 = 0;
			}
			Static69.anIntArray100[local41++] = local94;
		}
		@Pc(127) int local127;
		@Pc(135) int local135;
		for (local61 = 256 - arg0; local61 < 256; local61++) {
			local94 = local61 * 128;
			for (local127 = 0; local127 < 128; local127++) {
				local135 = (int) (Math.random() * 100.0D);
				if (local135 < 50 && local127 > 10 && local127 < 118) {
					Static69.anIntArray100[local94 + local127] = 255;
				} else {
					Static69.anIntArray100[local94 + local127] = 0;
				}
			}
		}
		for (local61 = 0; local61 < 256 - arg0; local61++) {
			Static168.anIntArray314[local61] = Static168.anIntArray314[local61 + arg0];
		}
		for (local61 = 256 - arg0; local61 < 256; local61++) {
			Static168.anIntArray314[local61] = (int) (Math.sin((double) Static140.anInt2665 / 14.0D) * 16.0D + Math.sin((double) Static140.anInt2665 / 15.0D) * 14.0D + Math.sin((double) Static140.anInt2665 / 16.0D) * 12.0D);
			Static140.anInt2665++;
		}
		Static114.anInt2297 += arg0;
		local61 = (arg0 + (Static50.anInt954 & 0x1)) / 2;
		if (local61 <= 0) {
			return;
		}
		for (local94 = 0; local94 < Static114.anInt2297; local94++) {
			local127 = (int) (Math.random() * 124.0D) + 2;
			local135 = (int) (Math.random() * 128.0D) + 128;
			Static69.anIntArray100[(local135 << 7) + local127] = 192;
		}
		Static114.anInt2297 = 0;
		@Pc(295) int local295;
		for (local94 = 0; local94 < 256; local94++) {
			local127 = 0;
			local135 = local94 * 128;
			for (local295 = -local61; local295 < 128; local295++) {
				if (local295 + local61 < 128) {
					local127 += Static69.anIntArray100[local61 + local295 + local135];
				}
				if (local295 - local61 - 1 >= 0) {
					local127 -= Static69.anIntArray100[local135 + local295 - local61 - 1];
				}
				if (local295 >= 0) {
					Static261.anIntArray541[local295 + local135] = local127 / (local61 * 2 + 1);
				}
			}
		}
		for (local94 = 0; local94 < 128; local94++) {
			local127 = 0;
			for (local135 = -local61; local135 < 256; local135++) {
				local295 = local135 * 128;
				if (local135 + local61 < 256) {
					local127 += Static261.anIntArray541[local295 + local94 + local61 * 128];
				}
				if (local135 - local61 - 1 >= 0) {
					local127 -= Static261.anIntArray541[local295 + local94 - local61 * 128 - 128];
				}
				if (local135 >= 0) {
					Static69.anIntArray100[local295 + local94] = local127 / (local61 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method2716(@OriginalArg(2) String arg0) {
		return Static229.method3651(16, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method2718(@OriginalArg(0) Class53_Sub1 arg0) {
		if (Static50.anInt954 == arg0.anInt3966 || arg0.anInt4007 == -1 || arg0.anInt3996 != 0 || arg0.anInt4044 + 1 > Static156.method2501(arg0.anInt4007).anIntArray94[arg0.anInt3970]) {
			@Pc(41) int local41 = arg0.anInt3966 - arg0.anInt4034;
			@Pc(46) int local46 = Static50.anInt954 - arg0.anInt4034;
			@Pc(57) int local57 = arg0.anInt3973 * 128 + arg0.method3324() * 64;
			@Pc(71) int local71 = arg0.anInt4033 * 128 + arg0.method3324() * 64;
			@Pc(82) int local82 = arg0.anInt4013 * 128 + arg0.method3324() * 64;
			@Pc(95) int local95 = arg0.anInt4025 * 128 + arg0.method3324() * 64;
			arg0.anInt4002 = ((local41 - local46) * local71 + local46 * local95) / local41;
			arg0.anInt3974 = (local57 * (local41 - local46) + local82 * local46) / local41;
		}
		if (arg0.anInt4008 == 0) {
			arg0.anInt4017 = 1024;
		}
		if (arg0.anInt4008 == 1) {
			arg0.anInt4017 = 1536;
		}
		if (arg0.anInt4008 == 2) {
			arg0.anInt4017 = 0;
		}
		arg0.anInt4037 = 0;
		if (arg0.anInt4008 == 3) {
			arg0.anInt4017 = 512;
		}
		arg0.anInt4031 = arg0.anInt4017;
	}
}
