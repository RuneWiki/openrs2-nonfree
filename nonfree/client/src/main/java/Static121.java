import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	public static int anInt2871;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!n;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "Lclient!ie;")
	public static Class35 aClass35_32;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
	public static int[] anIntArray355 = new int[128];

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_1481 = Static9.method266("VOLL");

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!ef;I)V")
	public static void method1919(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static73.anInt1947 < arg0.anInt1425) {
			Static69.method1196(arg0);
		} else if (Static73.anInt1947 > arg0.anInt1419) {
			Static14.method350(arg0);
		} else {
			Static115.method1847(arg0);
		}
		if (arg0.anInt1428 < 128 || arg0.anInt1405 < 128 || arg0.anInt1428 >= 13184 || arg0.anInt1405 >= 13184) {
			arg0.anInt1419 = 0;
			arg0.anInt1405 = arg0.anIntArray147[0] * 128 + arg0.anInt1443 * 64;
			arg0.anInt1388 = -1;
			arg0.anInt1425 = 0;
			arg0.anInt1428 = arg0.anInt1443 * 64 + arg0.anIntArray149[0] * 128;
			arg0.anInt1414 = -1;
			arg0.method899();
		}
		if (arg0 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt1428 < 1536 || arg0.anInt1405 < 1536 || arg0.anInt1428 >= 11776 || arg0.anInt1405 >= 11776)) {
			arg0.anInt1388 = -1;
			arg0.anInt1419 = 0;
			arg0.anInt1405 = arg0.anInt1443 * 64 + arg0.anIntArray147[0] * 128;
			arg0.anInt1425 = 0;
			arg0.anInt1428 = arg0.anIntArray149[0] * 128 + arg0.anInt1443 * 64;
			arg0.anInt1414 = -1;
			arg0.method899();
		}
		Static114.method1823(arg0);
		Static105.method1724(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
	public static boolean method1920(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method1921() {
		aBigInteger2 = null;
		aClass35_32 = null;
		anIntArray355 = null;
		aClass34_1481 = null;
		aClass51_3 = null;
	}
}
