import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!e;")
	public static Class16 aClass16_26 = new Class16(20);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt672 = 0;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt675 = 0;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_528 = Static72.method1077("Cancel");

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_529 = Static72.method1077("redstone1");

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_530 = aClass74_528;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!e;")
	public static Class16 aClass16_27 = new Class16(260);

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_531 = Static72.method1077("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method508() {
		aClass74_531 = null;
		aClass2_Sub2_Sub1_Sub2Array4 = null;
		aClass74_528 = null;
		aClass74_530 = null;
		aClass74_529 = null;
		anIntArrayArray7 = null;
		aClass16_27 = null;
		aClass16_26 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!ve;)Lclient!u;")
	public static Class74 method509(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub17 arg1) {
		if (!Static63.method998(Static19.method429(arg1), arg0)) {
			return null;
		} else if (arg1.aClass74Array18 == null || arg1.aClass74Array18.length <= arg0 || arg1.aClass74Array18[arg0] == null || arg1.aClass74Array18[arg0].method1718().method1695() == 0) {
			return Static67.aBoolean58 ? Static91.method1340(new Class74[] { Static114.aClass74_1554, Static56.method940(arg0) }) : null;
		} else {
			return arg1.aClass74Array18[arg0];
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method510(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static120.anInt2564 > 0) {
			local21 = Static1.aByteArrayArray7[--Static120.anInt2564];
			Static1.aByteArrayArray7[Static120.anInt2564] = null;
			return local21;
		} else if (arg0 == 5000 && Static3.anInt51 > 0) {
			local21 = Static112.aByteArrayArray8[--Static3.anInt51];
			Static112.aByteArrayArray8[Static3.anInt51] = null;
			return local21;
		} else if (arg0 == 30000 && Static10.anInt323 > 0) {
			local21 = Static81.aByteArrayArray6[--Static10.anInt323];
			Static81.aByteArrayArray6[Static10.anInt323] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZILclient!u;Lclient!g;Lclient!u;II)V")
	public static void method511(@OriginalArg(2) Class74 arg0, @OriginalArg(3) Class26 arg1, @OriginalArg(4) Class74 arg2) {
		@Pc(8) int local8 = arg1.method1351(arg2);
		@Pc(14) int local14 = arg1.method1374(local8, arg0);
		Static47.method775(arg1, local14, local8, 255);
	}
}
