import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_30;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_538 = Static2.method59("Side panel redrawn");

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	public static int[] anIntArray191 = new int[50];

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!wd;")
	private static Class80 aClass80_539 = Static2.method59("Friends");

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_540 = aClass80_539;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_541 = Static2.method59("The server is being updated)3");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_542 = Static2.method59("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_543 = Static2.method59("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_544 = aClass80_541;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!qa;BI)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt2374 == arg2 && arg2 != -1) {
			@Pc(63) int local63 = Static93.method1443(arg2).anInt1346;
			if (local63 == 1) {
				arg1.anInt2361 = 0;
				arg1.anInt2339 = 0;
				arg1.anInt2358 = 0;
				arg1.anInt2353 = arg0;
			}
			if (local63 == 2) {
				arg1.anInt2361 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2374 == -1 || Static93.method1443(arg2).anInt1356 >= Static93.method1443(arg1.anInt2374).anInt1356) {
			arg1.anInt2361 = 0;
			arg1.anInt2365 = arg1.anInt2382;
			arg1.anInt2339 = 0;
			arg1.anInt2358 = 0;
			arg1.anInt2353 = arg0;
			arg1.anInt2374 = arg2;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method876() {
		aClass2_Sub1_Sub9_Sub3_30 = null;
		aClass80_543 = null;
		anObject1 = null;
		anIntArray191 = null;
		aClass80_542 = null;
		aClass80_538 = null;
		aClass80_540 = null;
		aClass80_544 = null;
		aClass80_539 = null;
		aClass80_541 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)J")
	public static synchronized long method877() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static124.aLong92 > local5) {
			Static55.aLong36 += Static124.aLong92 - local5;
		}
		Static124.aLong92 = local5;
		return local5 + Static55.aLong36;
	}
}
