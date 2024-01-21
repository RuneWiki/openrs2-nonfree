import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!eb;")
	public static Class17 aClass17_7 = new Class17(20);

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean12 = false;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_128 = Static59.method1195("Lade Texturen )2 ");

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!qf;")
	private static Class60 aClass60_130 = Static59.method1195("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_129 = aClass60_130;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!qf;")
	private static Class60 aClass60_133 = Static59.method1195("Use");

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_131 = aClass60_133;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_132 = Static59.method1195("Mitteilung");

	@OriginalMember(owner = "client!be", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_134 = Static59.method1195(": ");

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[B")
	public static byte[] aByteArray10 = new byte[520];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 method288() {
		@Pc(5) Class3_Sub1_Sub2_Sub3 local5 = new Class3_Sub1_Sub2_Sub3();
		local5.anInt2187 = Static15.anIntArray74[0];
		local5.anInt2188 = Static32.anIntArray133[0];
		local5.anInt2192 = Static111.anInt3100;
		local5.anInt2191 = Static33.anIntArray138[0];
		@Pc(33) int local33 = local5.anInt2187 * local5.anInt2191;
		local5.anIntArray222 = new int[local33];
		local5.anInt2190 = Static81.anInt2533;
		local5.anInt2189 = Static97.anIntArray302[0];
		@Pc(49) byte[] local49 = Static2.aByteArrayArray3[0];
		for (@Pc(56) int local56 = 0; local56 < local33; local56++) {
			local5.anIntArray222[local56] = Static123.anIntArray378[local49[local56] & 0xFF];
		}
		Static60.method1206();
		return local5;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method289() {
		@Pc(7) Class81 local7 = Static97.aClass81_1;
		synchronized (Static97.aClass81_1) {
			Static55.anInt1759 = Static53.anInt1739;
			@Pc(18) int local18;
			if (Static36.anInt1210 < 0) {
				for (local18 = 0; local18 < 112; local18++) {
					Static109.aBooleanArray65[local18] = false;
				}
				Static36.anInt1210 = Static78.anInt2435;
			} else {
				while (Static78.anInt2435 != Static36.anInt1210) {
					local18 = Static34.anIntArray141[Static78.anInt2435];
					Static78.anInt2435 = Static78.anInt2435 + 1 & 0x7F;
					if (local18 < 0) {
						Static109.aBooleanArray65[~local18] = false;
					} else {
						Static109.aBooleanArray65[local18] = true;
					}
				}
			}
			Static53.anInt1739 = Static115.anInt3205;
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method290() {
		aClass60_129 = null;
		aClass60_128 = null;
		aClass60_132 = null;
		aClass17_7 = null;
		aByteArray10 = null;
		aClass60_134 = null;
		aClass60_130 = null;
		aClass60_131 = null;
		aClass60_133 = null;
		aByteArrayArray5 = null;
	}
}
