import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array13;

	@OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!tn", name = "Z", descriptor = "Lclient!nm;")
	public static Class119 aClass119_85;

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "[J")
	public static long[] aLongArray11 = new long[1000];

	@OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
	public static int anInt5034 = 0;

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "Lclient!ui;")
	public static Class175 aClass175_40 = new Class175(64);

	@OriginalMember(owner = "client!tn", name = "U", descriptor = "Lclient!ui;")
	public static Class175 aClass175_41 = new Class175(4);

	@OriginalMember(owner = "client!tn", name = "W", descriptor = "F")
	public static float aFloat91 = 0.0F;

	@OriginalMember(owner = "client!tn", name = "X", descriptor = "Lclient!jo;")
	public static Class96 aClass96_27 = new Class96();

	@OriginalMember(owner = "client!tn", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString193 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!tn", name = "ab", descriptor = "Lclient!si;")
	public static Class157 aClass157_18 = null;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)Lclient!nf;")
	public static Class1_Sub5_Sub14 method4200() {
		return Static249.aClass1_Sub5_Sub14_3;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public static void method4201(@OriginalArg(1) int arg0) {
		Static268.anInt4955 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!rc;III)V")
	public static void method4202(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt4420 == -1 && arg1.anIntArray495 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		if (arg1.anInt4418 < arg0) {
			local18 = arg0 - arg1.anInt4418;
		} else if (arg1.anInt4430 > arg0) {
			local18 = arg1.anInt4430 - arg0;
		}
		if (arg3 > arg1.anInt4424) {
			local18 += arg3 - arg1.anInt4424;
		} else if (arg1.anInt4431 > arg3) {
			local18 += arg1.anInt4431 - arg3;
		}
		@Pc(84) int local84 = arg1.anInt4421 * Static167.anInt638 >> 8;
		if (arg1.anInt4427 == 0 || local18 - 64 > arg1.anInt4427 || Static167.anInt638 == 0 || arg4 != arg1.anInt4425) {
			if (arg1.aClass1_Sub7_Sub1_2 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(arg1.aClass1_Sub7_Sub1_2);
				arg1.aClass1_Sub7_Sub1_2 = null;
			}
			if (arg1.aClass1_Sub7_Sub1_3 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(arg1.aClass1_Sub7_Sub1_3);
				arg1.aClass1_Sub7_Sub1_3 = null;
			}
			return;
		}
		local18 -= 64;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(152) int local152 = local84 * (arg1.anInt4427 - local18) / arg1.anInt4427;
		if (arg1.aClass1_Sub7_Sub1_2 != null) {
			arg1.aClass1_Sub7_Sub1_2.method822(local152);
		} else if (arg1.anInt4420 >= 0) {
			@Pc(171) Class101 local171 = Static321.method2528(Static125.aClass119_46, arg1.anInt4420, 0);
			if (local171 != null) {
				@Pc(179) Class1_Sub23_Sub1 local179 = local171.method2529().method3466(Static250.aClass55_1);
				@Pc(184) Class1_Sub7_Sub1 local184 = Static316.method817(local179, local152);
				local184.method825(-1);
				Static173.aClass1_Sub7_Sub3_1.method3615(local184);
				arg1.aClass1_Sub7_Sub1_2 = local184;
			}
		}
		if (arg1.aClass1_Sub7_Sub1_3 != null) {
			arg1.aClass1_Sub7_Sub1_3.method822(local152);
			if (!arg1.aClass1_Sub7_Sub1_3.method4574()) {
				arg1.aClass1_Sub7_Sub1_3 = null;
			}
		} else if (arg1.anIntArray495 != null && (arg1.anInt4419 -= arg2) <= 0) {
			@Pc(234) int local234 = (int) (Math.random() * (double) arg1.anIntArray495.length);
			@Pc(242) Class101 local242 = Static321.method2528(Static125.aClass119_46, arg1.anIntArray495[local234], 0);
			if (local242 != null) {
				@Pc(251) Class1_Sub23_Sub1 local251 = local242.method2529().method3466(Static250.aClass55_1);
				@Pc(256) Class1_Sub7_Sub1 local256 = Static316.method817(local251, local152);
				local256.method825(0);
				Static173.aClass1_Sub7_Sub3_1.method3615(local256);
				arg1.aClass1_Sub7_Sub1_3 = local256;
				arg1.anInt4419 = arg1.anInt4428 + (int) ((double) (arg1.anInt4436 - arg1.anInt4428) * Math.random());
			}
		}
	}
}
