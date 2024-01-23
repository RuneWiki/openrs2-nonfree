import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!tl", name = "X", descriptor = "Lclient!km;")
	public static Class91 aClass91_186;

	@OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
	public static int anInt5076;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "Lclient!qc;")
	public static Class135 aClass135_35 = new Class135(4);

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public static int anInt5067 = -1;

	@OriginalMember(owner = "client!tl", name = "U", descriptor = "Lclient!qc;")
	public static Class135 aClass135_36 = new Class135(200);

	@OriginalMember(owner = "client!tl", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53 = new String[8];

	@OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
	public static int anInt5075 = 0;

	@OriginalMember(owner = "client!tl", name = "Y", descriptor = "S")
	public static short aShort30 = 205;

	@OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
	public static int anInt5077 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!km;Lclient!km;Lclient!km;ILclient!km;)V")
	public static void method3972(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(4) Class91 arg3) {
		Static265.aClass91_190 = arg1;
		Static150.aClass91_119 = arg3;
		Static39.aClass91_39 = arg0;
		Static298.aClass91_206 = arg2;
		Static77.aClass71ArrayArray1 = new Class71[Static298.aClass91_206.method2492()][];
		Static187.aBooleanArray38 = new boolean[Static298.aClass91_206.method2492()];
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3973(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg1 ? 32768 : 0;
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(27) int local27 = (arg1 ? Static232.anInt4573 : Static147.anInt3197) + local13;
		for (@Pc(29) int local29 = local13; local29 < local27; local29++) {
			@Pc(36) Class1_Sub2_Sub13 local36 = Static74.method1304(local29);
			if (local36.aBoolean214 && local36.method2217().toLowerCase().indexOf(local16) != -1) {
				if (local7 >= 50) {
					Static191.aShortArray70 = null;
					Static183.anInt4432 = -1;
					return;
				}
				if (local19.length <= local7) {
					@Pc(76) short[] local76 = new short[local19.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local7; local78++) {
						local76[local78] = local19[local78];
					}
					local19 = local76;
				}
				local19[local7++] = (short) local29;
			}
		}
		Static289.anInt5496 = 0;
		Static191.aShortArray70 = local19;
		Static183.anInt4432 = local7;
		@Pc(114) String[] local114 = new String[Static183.anInt4432];
		for (@Pc(122) int local122 = 0; local122 < Static183.anInt4432; local122++) {
			local114[local122] = Static74.method1304(local19[local122]).method2217();
		}
		Static295.method4419(Static191.aShortArray70, local114);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
	public static void method3974() {
		if (Static13.aFloat3 < Static220.aFloat43) {
			Static13.aFloat3 = (float) ((double) Static13.aFloat3 + (double) Static13.aFloat3 / 30.0D);
			if (Static13.aFloat3 > Static220.aFloat43) {
				Static13.aFloat3 = Static220.aFloat43;
			}
			Static196.method1928();
		} else if (Static13.aFloat3 > Static220.aFloat43) {
			Static13.aFloat3 = (float) ((double) Static13.aFloat3 - (double) Static13.aFloat3 / 30.0D);
			if (Static13.aFloat3 < Static220.aFloat43) {
				Static13.aFloat3 = Static220.aFloat43;
			}
			Static196.method1928();
		}
		if (Static22.anInt448 == -1 || anInt5077 == -1) {
			return;
		}
		@Pc(62) int local62 = anInt5077 - Static207.anInt4867;
		if (local62 < 2 || local62 > 2) {
			local62 >>= 0x4;
		}
		Static207.anInt4867 += local62;
		@Pc(83) int local83 = Static22.anInt448 - Static88.anInt1962;
		if (local83 < 2 || local83 > 2) {
			local83 >>= 0x4;
		}
		Static88.anInt1962 += local83;
		if (local83 == 0 && local62 == 0) {
			anInt5077 = -1;
			Static22.anInt448 = -1;
		}
		Static196.method1928();
	}
}
