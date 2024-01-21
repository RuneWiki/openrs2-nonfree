import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_6;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public static int anInt350;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!v;")
	private static Class76 aClass76_148 = Static134.method2017("No response from server)3");

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Z")
	public static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_149 = aClass76_148;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!v;")
	private static Class76 aClass76_150 = Static134.method2017("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
	public static int[] anIntArray46 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!v;")
	private static Class76 aClass76_151 = Static134.method2017("glow1:");

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!v;")
	private static Class76 aClass76_157 = Static134.method2017("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_152 = aClass76_157;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_153 = Static134.method2017("Fallen lassen");

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_154 = Static134.method2017("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_155 = aClass76_150;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_156 = aClass76_151;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!v;")
	public static Class76 aClass76_158 = aClass76_151;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method238() {
		aClass76_153 = null;
		aClass76_156 = null;
		aClass76_154 = null;
		aClass76_157 = null;
		aClass76_155 = null;
		anIntArray45 = null;
		aClass76_149 = null;
		aClass76_150 = null;
		aClass76_152 = null;
		aClass76_151 = null;
		anIntArray46 = null;
		aClass17_Sub1_6 = null;
		aClass76_158 = null;
		Class15.anIntArray44 = null;
		aClass76_148 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ue;B)V")
	public static void method239(@OriginalArg(0) Class4_Sub4_Sub5_Sub4 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static56.anIntArray187.length; local3++) {
			Static56.anIntArray187[local3] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static56.anIntArray187[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(70) int local70;
		for (local32 = 0; local32 < 20; local32++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local70 = local62 + (local58 << 7);
					Static8.anIntArray22[local70] = (Static56.anIntArray187[local70 + 128] + Static56.anIntArray187[local70 - 1] + Static56.anIntArray187[local70 + 1] + Static56.anIntArray187[local70 + -128]) / 4;
				}
			}
			@Pc(111) int[] local111 = Static56.anIntArray187;
			Static56.anIntArray187 = Static8.anIntArray22;
			Static8.anIntArray22 = local111;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt2612; local62++) {
			for (local70 = 0; local70 < arg0.anInt2607; local70++) {
				if (arg0.aByteArray69[local58++] != 0) {
					@Pc(147) int local147 = arg0.anInt2609 + local62 + 16;
					@Pc(154) int local154 = arg0.anInt2610 + local70 + 16;
					@Pc(160) int local160 = local154 + (local147 << 7);
					Static56.anIntArray187[local160] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method240() {
		if (Static1.aClass75_1 != null) {
			Static1.aClass75_1.method1842();
		}
	}
}
