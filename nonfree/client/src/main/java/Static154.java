import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "J")
	public static long aLong127;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt3506 = 0;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1262 = Static120.method2057("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
	public static volatile int anInt3513 = 0;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
	public static int anInt3515 = 0;

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1263 = Static120.method2057("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "Lclient!nd;")
	public static Class59 aClass59_24 = new Class59(30);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method2677(@OriginalArg(1) Class1_Sub2_Sub2_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static71.anIntArray150.length; local7++) {
			Static71.anIntArray150[local7] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) (Math.random() * 128.0D * (double) 256);
			Static71.anIntArray150[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(71) int local71;
		for (local36 = 0; local36 < 20; local36++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local71 = local62 + (local58 << 7);
					Static6.anIntArray7[local71] = (Static71.anIntArray150[local71 + 128] + Static71.anIntArray150[local71 + 1] + Static71.anIntArray150[local71 - 1] + Static71.anIntArray150[local71 - 128]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static71.anIntArray150;
			Static71.anIntArray150 = Static6.anIntArray7;
			Static6.anIntArray7 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt3361; local62++) {
			for (local71 = 0; local71 < arg0.anInt3358; local71++) {
				if (arg0.aByteArray24[local58++] != 0) {
					@Pc(148) int local148 = local71 + arg0.anInt3362 + 16;
					@Pc(155) int local155 = arg0.anInt3363 + local62 + 16;
					@Pc(161) int local161 = local148 + (local155 << 7);
					Static71.anIntArray150[local161] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method2678() {
		aClass81_1263 = null;
		aClass81_1262 = null;
		aBooleanArrayArray1 = null;
		aClass59_24 = null;
	}
}
