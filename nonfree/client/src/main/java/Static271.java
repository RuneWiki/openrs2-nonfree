import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!ir;")
	public static Class100 aClass100_106;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!ir;")
	public static Class100 aClass100_107;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt5444;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array18;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt5440 = 0;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Z")
	public static boolean aBoolean338 = true;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IBJII)V")
	public static void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static168.aBoolean192 && Static170.anInt6279 < 500) {
			@Pc(23) int local23 = arg3 == -1 ? Static164.anInt6256 : arg3;
			@Pc(34) Class3_Sub26 local34 = new Class3_Sub26(arg1, arg2, local23, arg6, arg4, arg5, arg0);
			Static116.aClass127_12.method3387(local34);
			Static170.anInt6279++;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public static void method4581() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static80.aBooleanArray7[local3] = false;
		}
		Static147.anInt2903 = -1;
		Static335.anInt6512 = 0;
		Static261.anInt5200 = 1;
		Static119.anInt2573 = 0;
		Static104.anInt2186 = -1;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public static void method4582() {
		Static348.aClass3_Sub2_Sub4_3.method5144();
		Static123.aClass100_57 = null;
		Static221.anInt4557 = 1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!wc;)V")
	public static void method4583(@OriginalArg(0) Class3_Sub13_Sub1 arg0) {
		if (Static321.anInt6217 >= 255) {
			return;
		}
		Static13.aClass3_Sub13_Sub1Array3[Static321.anInt6217] = arg0;
		Static33.aBooleanArray4[Static321.anInt6217] = false;
		Static321.anInt6217++;
		@Pc(18) int local18 = arg0.anInt6672;
		if (arg0.aBoolean446) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt6672;
		if (arg0.aBoolean447) {
			local26 = Static131.anInt2754 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt6666 + 64 - arg0.anInt6661 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt6666 + arg0.anInt6661 - 64 >> 7;
			if (local66 >= Static116.anInt2499) {
				local66 = Static116.anInt2499 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray112[local38++];
				@Pc(96) int local96 = (arg0.anInt6662 + 64 - arg0.anInt6661 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static103.anInt2156) {
					local104 = Static103.anInt2156 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static145.anIntArrayArrayArray4[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static145.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static321.anInt6217;
					} else if ((local126 & 0xFF00) == 0) {
						Static145.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static321.anInt6217 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static145.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static321.anInt6217 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static145.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static321.anInt6217 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public static void method4584() {
		Static346.aClass198_62.method5243(5);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLclient!sj;)Ljava/lang/String;")
	public static String method4585(@OriginalArg(0) int arg0, @OriginalArg(2) Class181 arg1) {
		if (!Static47.method819(arg1).method1145(arg0) && arg1.anObjectArray12 == null) {
			return null;
		} else if (arg1.aStringArray37 == null || arg0 >= arg1.aStringArray37.length || arg1.aStringArray37[arg0] == null || arg1.aStringArray37[arg0].trim().length() == 0) {
			return Static212.aBoolean98 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray37[arg0];
		}
	}
}
