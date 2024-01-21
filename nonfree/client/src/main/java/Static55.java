import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 aClass2_Sub1_Sub7_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
	public static final int[] anIntArray169 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_400 = Static158.method3034("glow3:");

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Lclient!ob;")
	public static Class60 aClass60_399 = aClass60_400;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_401 = aClass60_400;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_402 = Static158.method3034("headicons_prayer");

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_403 = Static158.method3034("Benutzen");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ob;Z)V")
	public static void method1324(@OriginalArg(1) Class60 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(3) int local3 = 0;
		@Pc(7) Class60 local7 = arg0.method2679();
		@Pc(10) short[] local10 = new short[16];
		for (@Pc(16) int local16 = 0; local16 < Static62.anInt1918; local16++) {
			@Pc(22) Class2_Sub1_Sub8 local22 = Static88.method2046(local16);
			if ((!arg1 || local22.aBoolean57) && local22.aClass60_363.method2679().method2675(local7) != -1) {
				if (local3 >= 250) {
					Static87.anInt2586 = -1;
					Static81.aShortArray45 = null;
					return;
				}
				if (local3 >= local10.length) {
					@Pc(57) short[] local57 = new short[local10.length * 2];
					for (@Pc(59) int local59 = 0; local59 < local3; local59++) {
						local57[local59] = local10[local59];
					}
					local10 = local57;
				}
				local10[local3++] = (short) local16;
			}
		}
		Static188.anInt4489 = 0;
		Static81.aShortArray45 = local10;
		Static87.anInt2586 = local3;
		@Pc(100) Class60[] local100 = new Class60[Static87.anInt2586];
		for (@Pc(102) int local102 = 0; local102 < Static87.anInt2586; local102++) {
			local100[local102] = Static88.method2046(local10[local102]).aClass60_363;
		}
		Static98.method2270(local100, Static81.aShortArray45);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z[BI)I")
	public static int method1325(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static25.method619(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	public static void method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z")
	public static boolean method1328(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static140.aShortArray53[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1003;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static7.aClass2_Sub3_Sub1_43.method244(131);
		Static7.aClass2_Sub3_Sub1_43.method236(arg0);
		Static7.aClass2_Sub3_Sub1_43.method213(arg1);
	}
}
