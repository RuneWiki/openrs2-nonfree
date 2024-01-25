import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
	public static int anInt1958 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIZ)V")
	public static void method1705(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class1_Sub19 local12 = Static274.method4804(arg0, arg1);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray247.length; local22++) {
				local12.anIntArray247[local22] = -1;
				local12.anIntArray248[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method1706(@OriginalArg(2) String arg0) {
		return Static270.method4743(arg0, 16);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!qk;)V")
	public static void method1708(@OriginalArg(0) Class1_Sub30_Sub1 arg0) {
		if (Static305.anInt6023 >= 255) {
			return;
		}
		Static309.aClass1_Sub30_Sub1Array2[Static305.anInt6023] = arg0;
		Static295.aBooleanArray26[Static305.anInt6023] = false;
		Static305.anInt6023++;
		@Pc(18) int local18 = arg0.anInt5311;
		if (arg0.aBoolean511) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt5311;
		if (arg0.aBoolean512) {
			local26 = Static113.anInt2651 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt5297 + 64 - arg0.anInt5300 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt5297 + arg0.anInt5300 - 64 >> 7;
			if (local66 >= Static315.anInt6124) {
				local66 = Static315.anInt6124 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray104[local38++];
				@Pc(96) int local96 = (arg0.anInt5299 + 64 - arg0.anInt5300 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static242.anInt6744) {
					local104 = Static242.anInt6744 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static150.anIntArrayArrayArray9[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static150.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static305.anInt6023;
					} else if ((local126 & 0xFF00) == 0) {
						Static150.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static305.anInt6023 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static150.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static305.anInt6023 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static150.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static305.anInt6023 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)V")
	public static void method1709() {
		Static103.aClass87_20.method2485();
	}
}
