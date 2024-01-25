import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_5 = new Class254(39, -1);

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_2 = new Class96("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!cr;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString2 = null;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
	public static final int[] anIntArray7 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method144(@OriginalArg(1) int arg0) {
		Static309.anInt5223 = 3;
		Static203.anInt2040 = 100;
		Static347.anInt6360 = -1;
		Static131.anInt2418 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)I")
	public static int method146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}
}
