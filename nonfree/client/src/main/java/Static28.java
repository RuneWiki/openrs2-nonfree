import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!pg;")
	public static Class2_Sub6_Sub3 aClass2_Sub6_Sub3_1;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1[] aClass2_Sub2_Sub16_Sub1Array1;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!nb;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!ob;")
	public static Class70 aClass70_1 = new Class70(512);

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!ae;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_189 = Static184.method2923("<col=ffb000>");

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!i;")
	private static Class41 aClass41_190 = Static184.method2923("Prepared sound engine");

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_191 = aClass41_190;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_192 = Static184.method2923("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_193 = Static184.method2923("<br>(X");

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
	public static boolean method539(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)I")
	public static int method540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
