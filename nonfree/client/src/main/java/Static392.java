import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!ts", name = "P", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_130 = new Class254(60, 3);

	@OriginalMember(owner = "client!ts", name = "Z", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_47 = new Class142();

	@OriginalMember(owner = "client!ts", name = "ab", descriptor = "I")
	public static int anInt7048 = 0;

	@OriginalMember(owner = "client!ts", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString83 = "";

	@OriginalMember(owner = "client!ts", name = "cb", descriptor = "Lclient!mt;")
	public static final Class169 aClass169_3 = new Class169("runescape", 0);

	@OriginalMember(owner = "client!ts", name = "db", descriptor = "I")
	public static int anInt7049 = -1;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(B)V")
	public static void method5429() {
		@Pc(9) int[] local9 = new int[Static388.aClass193_3.anInt5241];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static388.aClass193_3.anInt5241; local13++) {
			@Pc(20) Class206 local20 = Static388.aClass193_3.method4249(local13);
			if (local20.anInt6283 >= 0 || local20.anInt6318 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static141.anIntArray202 = new int[local11];
		for (@Pc(51) int local51 = 0; local51 < local11; local51++) {
			Static141.anIntArray202[local51] = local9[local51];
		}
	}
}
