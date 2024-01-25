import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Z")
	public static boolean aBoolean431;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_109 = new Class211(16, 6);

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	public static int anInt4355 = 0;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_150 = new Class48(3, -1);

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public static int anInt4357 = -1;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_110 = new Class211(75, 10);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([[[Lclient!ke;I)V")
	public static void method3867(@OriginalArg(0) Class132[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class132[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class132 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass25_Sub4_2 instanceof Interface6) {
							((Interface6) local32.aClass25_Sub4_2).method5249();
						}
						if (local32.aClass25_Sub3_2 instanceof Interface6) {
							((Interface6) local32.aClass25_Sub3_2).method5249();
						}
						if (local32.aClass25_Sub3_1 instanceof Interface6) {
							((Interface6) local32.aClass25_Sub3_1).method5249();
						}
						if (local32.aClass25_Sub5_1 instanceof Interface6) {
							((Interface6) local32.aClass25_Sub5_1).method5249();
						}
						if (local32.aClass25_Sub5_2 instanceof Interface6) {
							((Interface6) local32.aClass25_Sub5_2).method5249();
						}
						for (@Pc(82) Class116 local82 = local32.aClass116_3; local82 != null; local82 = local82.aClass116_2) {
							@Pc(87) Class25_Sub1 local87 = local82.aClass25_Sub1_1;
							if (local87 instanceof Interface6) {
								((Interface6) local87).method5249();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V")
	public static void method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static177.method1119(Static334.aClass48_198);
		}
		if (arg0 == 1) {
			Static177.method1119(Static261.aClass48_160);
		}
		Static209.aClass1_Sub33_Sub2_2.method5170(arg2 + Static256.anInt4410);
		Static209.aClass1_Sub33_Sub2_2.method5153(Static264.aClass154_1.method3994(82) ? 1 : 0);
		Static209.aClass1_Sub33_Sub2_2.method5170(Static293.anInt5053 + arg1);
		Static46.aBoolean78 = false;
		Static76.anInt5658 = arg1;
		Static190.anInt3337 = arg2;
		Static308.method4585();
	}

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)[Lclient!j;")
	public static Class113[] method3870() {
		return new Class113[] { Static348.aClass113_17, Static345.aClass113_16, Static247.aClass113_11, Static391.aClass113_19, Static289.aClass113_12, Static13.aClass113_1, Static84.aClass113_2, Static374.aClass113_18, Static196.aClass113_8, Static139.aClass113_4, Static327.aClass113_15, Static138.aClass113_3, Static314.aClass113_14, Static292.aClass113_13, Static172.aClass113_5 };
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)V")
	public static void method3872(@OriginalArg(0) int arg0) {
		Static384.anInt6255 = arg0;
		@Pc(7) Class227 local7 = Static329.aClass227_30;
		synchronized (Static329.aClass227_30) {
			Static329.aClass227_30.method4871();
		}
	}
}
