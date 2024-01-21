import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!r;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!ad;")
	public static Class4 aClass4_917 = Static75.method1216("@gr1@");

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Lclient!ad;")
	private static Class4 aClass4_922 = Static75.method1216(" million");

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ad;")
	public static Class4 aClass4_918 = aClass4_922;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	public static int anInt1738 = 500;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Lclient!ad;")
	public static Class4 aClass4_919 = Static75.method1216("::hiddenbuttontest");

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!ad;")
	private static Class4 aClass4_923 = Static75.method1216("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_920 = aClass4_923;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
	public static int anInt1740 = -1;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "Lclient!ad;")
	public static Class4 aClass4_921 = Static75.method1216("Sprites geladen)3");

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!ad;")
	public static Class4 aClass4_924 = Static75.method1216("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZLclient!r;I)V")
	public static void method1168(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub6 local8 = new Class3_Sub6();
		local8.aByteArray15 = arg0;
		local8.anInt1199 = 0;
		local8.aClass62_1 = arg1;
		local8.aLong88 = arg2;
		@Pc(27) Class20 local27 = Static88.aClass20_10;
		synchronized (Static88.aClass20_10) {
			Static88.aClass20_10.method304(local8);
		}
		Static51.method870();
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public static void method1170() {
		aClass4_921 = null;
		aClass4_917 = null;
		aClass4_919 = null;
		aClass62_2 = null;
		aClass4_923 = null;
		aClass4_920 = null;
		aClass4_918 = null;
		aClass4_924 = null;
		aClass4_922 = null;
	}
}
