import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public static int anInt1337 = -1;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[128][128];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public static void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static323.method5433(arg1)) {
			Static35.method849(Static348.aClass96ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!bq;)Ljava/lang/String;")
	public static String method1184(@OriginalArg(1) Class5_Sub4 arg0) {
		return arg0.aString48 == null || arg0.aString48.length() <= 0 ? arg0.aString47 : arg0.aString47 + Static216.aString250 + arg0.aString48;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	public static void method1185() {
		Static328.aClass66_103.method1944(5);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!ra;)V")
	public static void method1186(@OriginalArg(1) Class170 arg0) {
		Static318.aClass170_105 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	public static void method1187() {
		if (Static169.anIntArray252 != null) {
			return;
		}
		Static169.anIntArray252 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = local57 * (local50 + 1.0D);
				} else {
					local80 = local57 + local50 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local80;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local98 * 6.0D * (local80 - local94) + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = local94 + (0.6666666666666666D - local98) * (local80 - local94) * 6.0D;
				} else {
					local59 = local94;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + (local80 - local94) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (local80 - local94) * 6.0D * (0.6666666666666666D - local39) + local94;
				} else {
					local61 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = (local80 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = local94 + (local80 - local94) * 6.0D * (0.6666666666666666D - local112);
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(292) int local292 = (int) (local59 * 256.0D);
			@Pc(297) int local297 = (int) (local61 * 256.0D);
			@Pc(302) int local302 = (int) (local63 * 256.0D);
			@Pc(313) int local313 = (local297 << 8) + ((local292 << 16) + local302);
			Static169.anIntArray252[local26] = local313;
		}
	}
}
