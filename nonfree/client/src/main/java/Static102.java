import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
	public static int[] anIntArray151 = new int[50];

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
	public static int[] anIntArray152 = new int[14];

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "S")
	public static short aShort16 = 1;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString79 = "Loaded textures";

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method1660() {
		Static114.aClass61_18.method1378();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	public static void method1661() {
		Static299.aClass61_54.method1378();
		Static239.aClass61_45.method1378();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public static void method1662() {
		if (Static248.anInt4917 != -1) {
			Static70.method1136(Static248.anInt4917);
		}
		for (@Pc(18) int local18 = 0; local18 < Static235.anInt4759; local18++) {
			if (Static128.aBooleanArray7[local18]) {
				Static44.aBooleanArray3[local18] = true;
			}
			Static161.aBooleanArray14[local18] = Static128.aBooleanArray7[local18];
			Static128.aBooleanArray7[local18] = false;
		}
		Static293.anInt5687 = -1;
		if (Static116.aBoolean188) {
			Static175.aBoolean288 = true;
		}
		Static34.anInt771 = Static183.anInt3590;
		Static192.anInt3876 = -1;
		Static177.aClass159_8 = null;
		if (Static248.anInt4917 != -1) {
			Static235.anInt4759 = 0;
			Static158.method2552();
		}
		if (Static116.aBoolean188) {
			Static126.method1999();
		} else {
			Static103.method1684();
		}
		Static185.anInt3691 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	public static void method1663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class8_Sub1_Sub6 local10 = Static181.method2779(4, arg3);
		local10.method931();
		local10.anInt1284 = arg2;
		local10.anInt1286 = arg1;
		local10.anInt1289 = arg0;
	}
}
