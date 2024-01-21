import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array10;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!nd;")
	public static Class59 aClass59_15 = new Class59();

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1397 = Static65.method1172("green:");

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1392 = aClass46_1397;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1393 = Static65.method1172(")1p");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
	public static int[] anIntArray435 = new int[4000];

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1394 = aClass46_1397;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1395 = Static65.method1172("titlebox");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1396 = Static65.method1172("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1398 = Static65.method1172("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method2829() {
		aClass46_1395 = null;
		anIntArray435 = null;
		aClass46_1392 = null;
		anImage4 = null;
		aClass3_Sub2_Sub3_Sub2Array10 = null;
		aClass46_1394 = null;
		aClass46_1397 = null;
		aClass59_15 = null;
		aClass46_1396 = null;
		aClass46_1393 = null;
		aClass46_1398 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!kb;Lclient!kb;Lclient!kb;I)V")
	public static void method2830(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class46 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static71.anIntArray173[local7] = Static71.anIntArray173[local7 - 1];
			Static31.aClass46Array4[local7] = Static31.aClass46Array4[local7 - 1];
			Static143.aClass46Array19[local7] = Static143.aClass46Array19[local7 - 1];
			Static181.aClass46Array26[local7] = Static181.aClass46Array26[local7 - 1];
		}
		Static31.aClass46Array4[0] = arg1;
		Static69.anInt1777++;
		Static71.anIntArray173[0] = arg0;
		Static181.anInt3977 = Static178.anInt3928;
		Static143.aClass46Array19[0] = arg2;
		Static181.aClass46Array26[0] = arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method2831() {
		if (Static127.aClass12_1 != null) {
			Static127.aClass12_1.method2667();
		}
		if (Static139.aClass12_2 != null) {
			Static139.aClass12_2.method2667();
		}
	}
}
