import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_17;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!jd;")
	public static Class11 aClass11_39;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!ia;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_2;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_401 = Static63.method1251("This world is full)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!mb;")
	public static Class45 aClass45_395 = aClass45_401;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!mb;")
	private static Class45 aClass45_396 = Static63.method1251("Loaded input handler");

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_397 = Static63.method1251("@gr1@");

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_398 = aClass45_396;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_399 = Static63.method1251("@yel@*V");

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_400 = Static63.method1251("Registrierter Benutzer");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method567() {
		aClass45_397 = null;
		anIntArray133 = null;
		aClass5_Sub2_Sub8_2 = null;
		aClass45_396 = null;
		aClass5_Sub2_Sub6_Sub4_17 = null;
		aClass45_400 = null;
		aClass45_401 = null;
		aClass45_399 = null;
		aFontMetrics2 = null;
		aClass11_39 = null;
		aClass45_395 = null;
		aClass45_398 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!ia;)[I")
	public static int[] method570(@OriginalArg(1) Class5_Sub2_Sub8 arg0) {
		@Pc(6) int local6 = arg0.anInt1262 >> 16;
		if (!Static36.method768(local6)) {
			return null;
		}
		@Pc(19) int local19 = arg0.anInt1294;
		@Pc(27) int local27 = arg0.anInt1252;
		@Pc(30) int local30 = arg0.anInt1301;
		while (local30 != -1) {
			@Pc(40) Class5_Sub2_Sub8 local40 = Static19.aClass5_Sub2_Sub8ArrayArray1[local6][local30 & 0xFFFF];
			local30 = local40.anInt1301;
			local27 += local40.anInt1252 - local40.anInt1265;
			local19 += local40.anInt1294 - local40.anInt1244;
		}
		return new int[] { local27, local19 };
	}
}
