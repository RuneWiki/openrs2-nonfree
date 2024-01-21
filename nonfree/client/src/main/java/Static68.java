import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!kc;")
	public static Class11 aClass11_12;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_13;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!lc;")
	private static Class31 aClass31_767 = Static56.method1206("Take");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_766 = aClass31_767;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public static int anInt2206 = 0;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_768 = Static56.method1206("*6n*6nYou have @gre@");

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_769 = Static56.method1206("backbase1");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!kc;Lclient!kc;IZ)V")
	public static void method1371(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) boolean arg2) {
		Static91.aClass11_23 = arg1;
		Static3.aBoolean9 = arg2;
		Static77.aClass11_15 = arg0;
		Static39.anInt1457 = Static77.aClass11_15.method325(10);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!kc;B)V")
	public static void method1372(@OriginalArg(0) Class11 arg0) {
		Static28.aClass11_7 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)I")
	public static int method1373(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub1 local8 = Static48.method1116(arg0);
		@Pc(11) int local11 = local8.anInt98;
		@Pc(14) int local14 = local8.anInt97;
		@Pc(17) int local17 = local8.anInt104;
		@Pc(28) int local28 = Class1_Sub1.anIntArray143[local17 - local14];
		return local28 & Static8.anIntArray46[local11] >> local14;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1374() {
		if (Static8.anInt288 != 0 || Static49.anInt2693 != 1) {
			return;
		}
		@Pc(17) int local17 = Static15.anInt649 - 4 - 5;
		@Pc(23) int local23 = Static105.anInt2783 - 25 - 550;
		if (local23 < 0 || local17 < 0 || local23 >= 146 || local17 >= 151) {
			return;
		}
		local17 -= 75;
		local23 -= 73;
		@Pc(41) int local41 = Static106.anInt2795 + Static12.anInt542 & 0x7FF;
		@Pc(45) int local45 = Class2_Sub1_Sub3_Sub4.anIntArray379[local41];
		@Pc(53) int local53 = (Static57.anInt2681 + 256) * local45 >> 8;
		@Pc(57) int local57 = Class2_Sub1_Sub3_Sub4.anIntArray376[local41];
		@Pc(65) int local65 = (Static57.anInt2681 + 256) * local57 >> 8;
		@Pc(75) int local75 = local17 * local65 - local53 * local23 >> 11;
		@Pc(85) int local85 = local53 * local17 + local23 * local65 >> 11;
		@Pc(92) int local92 = local85 + Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006 >> 7;
		@Pc(100) int local100 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011 - local75 >> 7;
		@Pc(120) boolean local120 = Static72.method865(0, 0, true, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local100, 1, local92);
		if (!local120) {
			return;
		}
		Static20.aClass2_Sub6_Sub1_11.method637(local23);
		Static20.aClass2_Sub6_Sub1_11.method637(local17);
		Static20.aClass2_Sub6_Sub1_11.method648(Static12.anInt542);
		Static20.aClass2_Sub6_Sub1_11.method637(57);
		Static20.aClass2_Sub6_Sub1_11.method637(Static106.anInt2795);
		Static20.aClass2_Sub6_Sub1_11.method637(Static57.anInt2681);
		Static20.aClass2_Sub6_Sub1_11.method637(89);
		Static20.aClass2_Sub6_Sub1_11.method648(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2006);
		Static20.aClass2_Sub6_Sub1_11.method648(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt2011);
		Static20.aClass2_Sub6_Sub1_11.method637(Static34.anInt1316);
		Static20.aClass2_Sub6_Sub1_11.method637(63);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1376() {
		anIntArray302 = null;
		aClass31_769 = null;
		aClass11_12 = null;
		aClass2_Sub1_Sub3_Sub1_11 = null;
		aClass31_766 = null;
		aClass31_768 = null;
		aClass11_Sub1_13 = null;
		aClass31_767 = null;
	}
}
