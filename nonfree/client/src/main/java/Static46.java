import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!ud;")
	public static Class75 aClass75_7;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
	public static int[] anIntArray116 = new int[200];

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static int anInt1139 = 0;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!od;")
	private static Class60 aClass60_422 = Static41.method597("Type");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_423 = Static41.method597("gr-Un:");

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_424 = aClass60_422;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { 24, 37, 11, 57, 7, 46, 28, 5 };

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!od;")
	private static Class60 aClass60_426 = Static41.method597("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_425 = aClass60_426;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public static int anInt1147 = 127;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_427 = Static41.method597("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method639() {
		aClass60_425 = null;
		aClass75_7 = null;
		anIntArray117 = null;
		aClass60_426 = null;
		aClass60_423 = null;
		aClass60_424 = null;
		anIntArray116 = null;
		aClass60_422 = null;
		aClass60_427 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!t;ILclient!nf;)V")
	public static void method640(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(7) Class4_Sub12 local7 = new Class4_Sub12();
		local7.aClass56_31 = arg2;
		local7.anInt1660 = 1;
		local7.aLong100 = arg1;
		local7.aClass10_Sub1_10 = arg0;
		@Pc(22) Class45 local22 = Static37.aClass45_7;
		synchronized (Static37.aClass45_7) {
			Static37.aClass45_7.method988(local7);
		}
		Static22.method421();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method641() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static48.anInt1184 - 1; local17++) {
				if (Static82.anIntArray226[local17] < 1000 && Static82.anIntArray226[local17 + 1] > 1000) {
					local11 = false;
					@Pc(41) Class60 local41 = Static128.aClass60Array20[local17];
					Static128.aClass60Array20[local17] = Static128.aClass60Array20[local17 + 1];
					Static128.aClass60Array20[local17 + 1] = local41;
					@Pc(59) Class60 local59 = Static80.aClass60Array14[local17];
					Static80.aClass60Array14[local17] = Static80.aClass60Array14[local17 + 1];
					Static80.aClass60Array14[local17 + 1] = local59;
					@Pc(77) int local77 = Static82.anIntArray226[local17];
					Static82.anIntArray226[local17] = Static82.anIntArray226[local17 + 1];
					Static82.anIntArray226[local17 + 1] = local77;
					@Pc(95) int local95 = Static25.anIntArray87[local17];
					Static25.anIntArray87[local17] = Static25.anIntArray87[local17 + 1];
					Static25.anIntArray87[local17 + 1] = local95;
					@Pc(113) int local113 = Static61.anIntArray178[local17];
					Static61.anIntArray178[local17] = Static61.anIntArray178[local17 + 1];
					Static61.anIntArray178[local17 + 1] = local113;
					@Pc(131) int local131 = Static130.anIntArray342[local17];
					Static130.anIntArray342[local17] = Static130.anIntArray342[local17 + 1];
					Static130.anIntArray342[local17 + 1] = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Lclient!dc;")
	public static Class4_Sub3_Sub4 method642(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub4 local10 = (Class4_Sub3_Sub4) Static22.aClass12_7.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static25.aClass10_10.method1774(13, arg0);
		local10 = new Class4_Sub3_Sub4();
		local10.anInt794 = arg0;
		if (local20 != null) {
			local10.method418(new Class4_Sub9(local20));
		}
		Static22.aClass12_7.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBILclient!ne;)V")
	public static void method643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub3_Sub10 arg3) {
		if (Static118.anInt2731 >= 50 || Static120.anInt2754 == 0 || (arg3.anIntArray213 == null || arg1 >= arg3.anIntArray213.length)) {
			return;
		}
		@Pc(37) int local37 = arg3.anIntArray213[arg1];
		if (local37 == 0) {
			return;
		}
		@Pc(44) int local44 = local37 >> 8;
		Static98.anIntArray295[Static118.anInt2731] = local44;
		@Pc(54) int local54 = local37 >> 4 & 0x7;
		Static11.anIntArray40[Static118.anInt2731] = local54;
		Static123.anIntArray339[Static118.anInt2731] = 0;
		Static40.aClass9Array1[Static118.anInt2731] = null;
		@Pc(72) int local72 = (arg2 - 64) / 128;
		@Pc(78) int local78 = (arg0 - 64) / 128;
		@Pc(82) int local82 = local37 & 0xF;
		Static67.anIntArray191[Static118.anInt2731] = (local78 << 8) + ((local72 << 16) + local82);
		Static118.anInt2731++;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;IB)Lclient!nc;")
	public static Class14 method645(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class14_Sub2");
			@Pc(15) Class14 local15 = (Class14) local6.getDeclaredConstructor().newInstance();
			local15.method692(arg2, arg0, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class14_Sub1 local28 = new Class14_Sub1();
			local28.method692(arg2, arg0, arg1);
			return local28;
		}
	}
}
