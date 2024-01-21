import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!pb;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!ii;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
	public static final int[] anIntArray16 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_47 = Static151.method2243("Nehmen");

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_48 = Static151.method2243(": ");

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_49 = Static151.method2243("");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array5 = new Class62[500];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	public static void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2].anInt3301 = arg3;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method126() {
		for (@Pc(6) Class2_Sub8 local6 = (Class2_Sub8) Static82.aClass13_4.method303(); local6 != null; local6 = (Class2_Sub8) Static82.aClass13_4.method309()) {
			if (local6.aClass2_Sub1_Sub11_1 != null) {
				local6.method993();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!mb;Lclient!pb;Lclient!mb;I)[Lclient!hh;")
	public static Class42[] method127(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class62 arg2) {
		@Pc(13) int local13 = arg1.method2114(arg2);
		@Pc(19) int local19 = arg1.method2142(arg0, local13);
		return Static94.method1429(arg1, local13, local19);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!mb;B)Z")
	public static boolean method128(@OriginalArg(0) Class62 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static29.anInt714; local11++) {
			if (arg0.method1858(Static62.aClass62Array33[local11])) {
				return true;
			}
		}
		return arg0.method1858(Static186.aClass7_Sub2_Sub2_1.aClass62_1072);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method129() {
		Static109.aClass53_11.method1649();
		Static60.aClass79_5.method2351();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public static void method131() {
		while (true) {
			@Pc(10) Class13 local10 = Static115.aClass13_7;
			@Pc(17) Class2_Sub26 local17;
			synchronized (Static115.aClass13_7) {
				local17 = (Class2_Sub26) Static148.aClass13_9.method301();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass71_Sub1_28.method2146(false, (int) local17.aLong148, local17.aByteArray50, local17.aClass98_4);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public static int method132(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
