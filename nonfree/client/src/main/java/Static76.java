import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array8;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!cb;")
	public static Class12 aClass12_14 = new Class12(64);

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_765 = Static41.method597(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_766 = Static41.method597("Drop");

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt1840 = 0;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_767 = Static41.method597("Die Verbindung konnte");

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_768 = aClass60_766;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	public static volatile int anInt1843 = 0;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[Lclient!be;")
	public static Class4_Sub3_Sub1_Sub2_Sub1[] aClass4_Sub3_Sub1_Sub2_Sub1Array1 = new Class4_Sub3_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method1243() {
		aClass12_14 = null;
		aClass60_768 = null;
		aClass60_766 = null;
		aClass4_Sub3_Sub1_Sub2_Sub1Array1 = null;
		aClass60_767 = null;
		aClass4_Sub3_Sub6_Sub3Array8 = null;
		aClass60_765 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!db;")
	public static Class4_Sub3_Sub3 method1244(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub3 local10 = (Class4_Sub3_Sub3) Static49.aClass12_9.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static117.aClass10_30.method1774(6, arg0);
		local10 = new Class4_Sub3_Sub3();
		local10.anInt766 = arg0;
		if (local20 != null) {
			local10.method405(new Class4_Sub9(local20));
		}
		local10.method398();
		if (local10.aBoolean26) {
			local10.anInt732 = 0;
			local10.aBoolean28 = false;
		}
		Static49.aClass12_9.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1245() {
		Static109.anInt2594 = 0;
		@Pc(13) int local13 = (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7) + Static49.anInt1207;
		@Pc(25) int local25 = Static60.anInt2956 + (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static109.anInt2594 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static109.anInt2594 = 1;
		}
		if (Static109.anInt2594 == 1 && local13 >= 3139 && local13 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static109.anInt2594 = 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1248() {
		Static96.aClass12_21.method284();
		Static80.aClass12_15.method284();
	}
}
