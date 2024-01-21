import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_15;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1292 = Static65.method1172("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
	public static volatile int anInt3569 = 0;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	public static void method2575() {
		if (Static178.aClass85_1 != null) {
			@Pc(8) Class85 local8 = Static178.aClass85_1;
			synchronized (Static178.aClass85_1) {
				Static178.aClass85_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	public static void method2576() {
		Static152.anIntArray395 = new int[104];
		Static161.anIntArray407 = new int[104];
		Static156.anIntArray401 = new int[104];
		Static174.aByteArrayArrayArray6 = new byte[4][104][104];
		Static94.anIntArray232 = new int[104];
		Static83.anIntArrayArrayArray5 = new int[4][105][105];
		Static58.aByteArrayArrayArray3 = new byte[4][104][104];
		Static148.anInt3558 = 99;
		Static179.anIntArray439 = new int[104];
		Static60.aByteArrayArrayArray4 = new byte[4][104][104];
		Static32.aByteArrayArrayArray2 = new byte[4][104][104];
		Static175.aByteArrayArrayArray7 = new byte[4][105][105];
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZLclient!kb;)V")
	public static void method2577(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(9) Class46 local9 = arg1.method1353();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static139.anInt3222; local16++) {
			@Pc(22) Class3_Sub2_Sub14 local22 = Static146.method2432(local16);
			if ((!arg0 || local22.aBoolean139) && local22.aClass46_1163.method1353().method1355(local9) != -1) {
				if (local14 >= 250) {
					Static140.anInt229 = -1;
					Static120.aShortArray25 = null;
					return;
				}
				if (local12.length <= local14) {
					@Pc(60) short[] local60 = new short[local12.length * 2];
					for (@Pc(62) int local62 = 0; local62 < local14; local62++) {
						local60[local62] = local12[local62];
					}
					local12 = local60;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static140.anInt229 = local14;
		Static120.aShortArray25 = local12;
		Static178.anInt3929 = 0;
		@Pc(103) Class46[] local103 = new Class46[Static140.anInt229];
		for (@Pc(105) int local105 = 0; local105 < Static140.anInt229; local105++) {
			local103[local105] = Static146.method2432(local12[local105]).aClass46_1163;
		}
		Static74.method1251(Static120.aShortArray25, local103);
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
	public static void method2578() {
		aClass46_1292 = null;
		aClass44_Sub1_15 = null;
	}
}
