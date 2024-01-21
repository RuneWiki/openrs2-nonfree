import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_724 = Static65.method1172("sch-Utteln:");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!kb;")
	private static Class46 aClass46_726 = Static65.method1172("Members only world");

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_725 = aClass46_726;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_727 = Static65.method1172("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_728 = Static65.method1172("");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1442() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method1443() {
		aClass46_724 = null;
		anIntArray218 = null;
		aShortArray13 = null;
		aClass46_727 = null;
		Class49.anIntArray217 = null;
		aClass46_725 = null;
		aClass46_726 = null;
		aClass46_728 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!kb;Lclient!kb;Lclient!jg;)Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 method1444(@OriginalArg(1) Class46 arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) Class44 arg2) {
		@Pc(8) int local8 = arg2.method1617(arg1);
		@Pc(18) int local18 = arg2.method1631(arg0, local8);
		return Static149.method2586(local18, arg2, local8);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	public static boolean method1447(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] method1448() {
		@Pc(13) Class3_Sub2_Sub3_Sub2[] local13 = new Class3_Sub2_Sub3_Sub2[Static8.anInt276];
		for (@Pc(15) int local15 = 0; local15 < Static8.anInt276; local15++) {
			@Pc(21) Class3_Sub2_Sub3_Sub2 local21 = new Class3_Sub2_Sub3_Sub2();
			local21.anInt2492 = Static116.anInt2760;
			local21.anInt2496 = Static168.anInt3719;
			local21.anInt2497 = Static135.anIntArray363[local15];
			local21.anInt2493 = Static71.anIntArray172[local15];
			local21.anInt2494 = Static54.anIntArray131[local15];
			local21.anInt2495 = Static87.anIntArray219[local15];
			local21.anIntArray250 = Static90.anIntArray226;
			local21.aByteArray20 = Static32.aByteArrayArray4[local15];
			local13[local15] = local21;
		}
		Static181.method2896();
		return local13;
	}
}
