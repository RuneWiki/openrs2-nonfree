import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public static int anInt1617;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!gd;")
	public static Class22 aClass22_24 = new Class22(64);

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!kc;")
	private static Class36 aClass36_780 = Static14.method2017("To");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_772 = aClass36_780;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!kc;")
	private static Class36 aClass36_783 = Static14.method2017("flash1:");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_773 = aClass36_783;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_774 = Static14.method2017("scrollbar");

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public static int anInt1615 = 0;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_775 = Static14.method2017("Entfernen");

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!kc;")
	private static Class36 aClass36_776 = Static14.method2017("Connection lost");

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!kc;")
	private static Class36 aClass36_779 = Static14.method2017("Loaded update list");

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_777 = aClass36_779;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt1618 = 0;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_778 = aClass36_776;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt1619 = 0;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_781 = Static14.method2017("backbase1");

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!kc;")
	public static Class36 aClass36_782 = Static14.method2017("scrollen:");

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
	public static int anInt1620 = 1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ib;)V")
	public static void method1118(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt1117 == 0) {
			local1 = Static85.aClass61_1.method1710(arg0.anInt1124, arg0.anInt1109, arg0.anInt1114);
		}
		@Pc(24) int local24 = -1;
		if (arg0.anInt1117 == 1) {
			local1 = Static85.aClass61_1.method1737(arg0.anInt1124, arg0.anInt1109, arg0.anInt1114);
		}
		if (arg0.anInt1117 == 2) {
			local1 = Static85.aClass61_1.method1702(arg0.anInt1124, arg0.anInt1109, arg0.anInt1114);
		}
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		if (arg0.anInt1117 == 3) {
			local1 = Static85.aClass61_1.method1713(arg0.anInt1124, arg0.anInt1109, arg0.anInt1114);
		}
		if (local1 != 0) {
			local24 = local1 >> 14 & 0x7FFF;
			@Pc(92) int local92 = Static85.aClass61_1.method1699(arg0.anInt1124, arg0.anInt1109, arg0.anInt1114, local1);
			local54 = local92 & 0x1F;
			local56 = local92 >> 6 & 0x3;
		}
		arg0.anInt1115 = local54;
		arg0.anInt1120 = local56;
		arg0.anInt1123 = local24;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1119() {
		aClass36_781 = null;
		aClass36_783 = null;
		aClass36_772 = null;
		aClass36_777 = null;
		aClass36_780 = null;
		aClass36_779 = null;
		aClass36_773 = null;
		aClass36_775 = null;
		aClass36_782 = null;
		aClass36_778 = null;
		aClass36_774 = null;
		aClass22_24 = null;
		anIntArray199 = null;
		aClass36_776 = null;
	}
}
