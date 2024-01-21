import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!j", name = "B", descriptor = "Lclient!ge;")
	public static Class21 aClass21_17 = new Class21(64);

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_633 = Static24.method441("Welt");

	@OriginalMember(owner = "client!j", name = "R", descriptor = "Lclient!ge;")
	public static Class21 aClass21_18 = new Class21(64);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!fe;Lclient!sb;)V")
	public static void method841(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(9) Class2_Sub11 local9 = new Class2_Sub11();
		local9.anInt1243 = arg1.method1410();
		local9.anInt1241 = arg1.method1406();
		local9.anIntArray162 = new int[local9.anInt1243];
		local9.anIntArray165 = new int[local9.anInt1243];
		local9.aByteArrayArrayArray5 = new byte[local9.anInt1243][][];
		local9.anIntArray163 = new int[local9.anInt1243];
		local9.aClass20Array1 = new Class20[local9.anInt1243];
		local9.aClass20Array2 = new Class20[local9.anInt1243];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt1243; local51++) {
			try {
				@Pc(57) int local57 = arg1.method1410();
				@Pc(91) String local91;
				@Pc(100) String local100;
				@Pc(104) int local104;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local91 = new String(arg1.method1400().method1765());
					local100 = new String(arg1.method1400().method1765());
					local104 = 0;
					if (local57 == 1) {
						local104 = arg1.method1406();
					}
					local9.anIntArray163[local51] = local57;
					local9.anIntArray162[local51] = local104;
					local9.aClass20Array2[local51] = arg2.method1634(local100, Static90.method840(local91));
				} else if (local57 == 3 || local57 == 4) {
					local91 = new String(arg1.method1400().method1765());
					local100 = new String(arg1.method1400().method1765());
					local104 = arg1.method1410();
					@Pc(107) String[] local107 = new String[local104];
					for (@Pc(109) int local109 = 0; local109 < local104; local109++) {
						local107[local109] = new String(arg1.method1400().method1765());
					}
					@Pc(129) byte[][] local129 = new byte[local104][];
					@Pc(142) int local142;
					if (local57 == 3) {
						for (@Pc(136) int local136 = 0; local136 < local104; local136++) {
							local142 = arg1.method1406();
							local129[local136] = new byte[local142];
							arg1.method1373(local142, local129[local136]);
						}
					}
					local9.anIntArray163[local51] = local57;
					@Pc(167) Class[] local167 = new Class[local104];
					for (local142 = 0; local142 < local104; local142++) {
						local167[local142] = Static90.method840(local107[local142]);
					}
					local9.aClass20Array1[local51] = arg2.method1631(Static90.method840(local91), local100, local167);
					local9.aByteArrayArrayArray5[local51] = local129;
				}
			} catch (@Pc(252) ClassNotFoundException local252) {
				local9.anIntArray165[local51] = -1;
			} catch (@Pc(259) SecurityException local259) {
				local9.anIntArray165[local51] = -2;
			} catch (@Pc(266) NullPointerException local266) {
				local9.anIntArray165[local51] = -3;
			} catch (@Pc(273) Exception local273) {
				local9.anIntArray165[local51] = -4;
			} catch (@Pc(280) Throwable local280) {
				local9.anIntArray165[local51] = -5;
			}
		}
		Static76.aClass52_9.method1593(local9);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
	public static void method842() {
		Static108.method1757(10, 0, null, false);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIILclient!sa;II)V")
	public static void method843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub3 local7 = new Class2_Sub3();
		local7.anInt664 = arg2.anInt2640;
		local7.anInt650 = arg4;
		local7.anInt655 = arg1 * 128;
		local7.anInt663 = arg2.anInt2622 * 128;
		local7.anInt656 = arg2.anInt2652;
		local7.anIntArray88 = arg2.anIntArray386;
		local7.anInt657 = arg2.anInt2645;
		local7.anInt653 = arg0 * 128;
		@Pc(50) int local50 = arg2.anInt2621;
		@Pc(53) int local53 = arg2.anInt2634;
		if (arg3 == 1 || arg3 == 3) {
			local53 = arg2.anInt2621;
			local50 = arg2.anInt2634;
		}
		local7.anInt652 = (arg0 + local50) * 128;
		local7.anInt662 = (arg1 + local53) * 128;
		if (arg2.anIntArray384 != null) {
			local7.aClass2_Sub1_Sub14_1 = arg2;
			local7.method417();
		}
		Static22.aClass52_4.method1593(local7);
		if (local7.anIntArray88 != null) {
			local7.anInt649 = local7.anInt664 + (int) ((double) (local7.anInt656 - local7.anInt664) * Math.random());
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
	public static void method844() {
		aClass21_18 = null;
		aClass65_633 = null;
		aClass21_17 = null;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Z")
	public static boolean method845() {
		return Static78.aClass14_2 != null;
	}
}
