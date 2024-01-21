import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!qf;")
	public static Class66 aClass66_13 = null;

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1344 = Static146.method2172("Loaded fonts");

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1343 = aClass77_1344;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "Z")
	public static volatile boolean aBoolean160 = true;

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
	public static int anInt3916 = 0;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "[Lclient!oa;")
	public static Class2_Sub18[] aClass2_Sub18Array1 = new Class2_Sub18[2048];

	@OriginalMember(owner = "client!u", name = "ob", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1345 = Static146.method2172("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1346 = Static146.method2172("Login");

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1347 = aClass77_1346;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)I")
	public static int method2686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return (arg1 / 32 << 7) + (arg2 / 4 << 10) + arg0 / 2;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Lclient!i;")
	public static Class2_Sub2_Sub9 method2689(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub9 local10 = (Class2_Sub2_Sub9) Static75.aClass82_31.method2699((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static166.aClass43_42.method2205(arg0, 10);
		local10 = new Class2_Sub2_Sub9();
		local10.anInt1783 = arg0;
		if (local20 != null) {
			local10.method1307(new Class2_Sub18(local20));
		}
		local10.method1302();
		if (local10.anInt1799 != -1) {
			local10.method1300(method2689(local10.anInt1799), method2689(local10.anInt1779));
		}
		if (!Static20.aBoolean31 && local10.aBoolean81) {
			local10.anInt1806 = 0;
			local10.aClass77Array14 = null;
			local10.aBoolean82 = false;
			local10.aClass77Array15 = null;
			local10.aClass77_717 = Static42.aClass77_473;
		}
		Static75.aClass82_31.method2701((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	public static void method2692() {
		aBigInteger2 = null;
		aClass77_1347 = null;
		aClass77_1344 = null;
		aByteArrayArray9 = null;
		aClass66_13 = null;
		aClass77_1346 = null;
		aClass2_Sub18Array1 = null;
		aClass77_1343 = null;
		aClass77_1345 = null;
	}
}
