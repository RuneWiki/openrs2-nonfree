import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	public static int anInt4096;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	public static int anInt4103;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString143 = "Continue";

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!nm;)V")
	public static void method3543(@OriginalArg(1) Class119 arg0) {
		Static210.anInt4012 = arg0.method3241("titlebg");
		Static188.anInt3604 = arg0.method3241("logo");
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZIII)V")
	public static void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static261.method4039(false);
		Static107.anInt2250 = arg0;
		Static301.anInt5415 = arg2;
		Static62.aBoolean129 = arg1;
		Static249.method4628(arg3);
		Static242.aClass86_29 = new Class86(8);
		Static260.aClass86_34 = new Class86(8);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public static void method3545() {
		Static31.method537(Static19.anInt422);
		@Pc(18) int local18 = (Static87.anInt1875 >> 10) + (Static135.anInt2659 >> 3);
		@Pc(28) int local28 = (Static38.anInt714 >> 3) + (Static273.anInt5035 >> 10);
		Static135.anIntArray209 = new int[18];
		Static172.aByteArrayArray11 = new byte[18][];
		Static246.anIntArray501 = new int[18];
		Static53.anIntArray91 = new int[18];
		Static186.aByteArrayArray13 = new byte[18][];
		Static110.aByteArrayArray7 = new byte[18][];
		Static16.anIntArrayArray1 = new int[18][4];
		Static8.anIntArray20 = new int[18];
		Static295.aByteArrayArray21 = new byte[18][];
		Static120.aByteArrayArray8 = new byte[18][];
		Static98.anIntArray146 = new int[18];
		Static44.anIntArray78 = new int[18];
		@Pc(73) int local73 = 0;
		@Pc(79) int local79;
		for (local79 = (local28 - 6) / 8; local79 <= (local28 + 6) / 8; local79++) {
			for (@Pc(96) int local96 = (local18 - 6) / 8; local96 <= (local18 + 6) / 8; local96++) {
				@Pc(109) int local109 = local96 + (local79 << 8);
				Static135.anIntArray209[local73] = local109;
				Static8.anIntArray20[local73] = Static67.aClass119_20.method3241("m" + local79 + "_" + local96);
				Static98.anIntArray146[local73] = Static67.aClass119_20.method3241("l" + local79 + "_" + local96);
				Static246.anIntArray501[local73] = Static67.aClass119_20.method3241("n" + local79 + "_" + local96);
				Static53.anIntArray91[local73] = Static67.aClass119_20.method3241("um" + local79 + "_" + local96);
				Static44.anIntArray78[local73] = Static67.aClass119_20.method3241("ul" + local79 + "_" + local96);
				if (Static246.anIntArray501[local73] == -1) {
					Static8.anIntArray20[local73] = -1;
					Static98.anIntArray146[local73] = -1;
					Static53.anIntArray91[local73] = -1;
					Static44.anIntArray78[local73] = -1;
				}
				local73++;
			}
		}
		for (local79 = local73; local79 < Static246.anIntArray501.length; local79++) {
			Static246.anIntArray501[local79] = -1;
			Static8.anIntArray20[local79] = -1;
			Static98.anIntArray146[local79] = -1;
			Static53.anIntArray91[local79] = -1;
			Static44.anIntArray78[local79] = -1;
		}
		Static131.method2287(0, local28, true, 8, false, local18, 8);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method3546(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static18.anIntArray38[local3] = Static18.anIntArray38[local3 - 1];
			Static247.aStringArray8[local3] = Static247.aStringArray8[local3 - 1];
			Static269.aStringArray33[local3] = Static269.aStringArray33[local3 - 1];
			Static234.aStringArray27[local3] = Static234.aStringArray27[local3 - 1];
			Static302.anIntArray595[local3] = Static302.anIntArray595[local3 - 1];
		}
		Static247.aStringArray8[0] = arg2;
		Static18.anIntArray38[0] = arg4;
		Static302.anIntArray595[0] = arg1;
		Static121.anInt2465++;
		Static269.aStringArray33[0] = arg3;
		Static234.aStringArray27[0] = arg0;
		Static28.anInt552 = Static149.anInt950;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIILclient!od;IILclient!kl;Lclient!s;)V")
	public static void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11_Sub4_Sub1 arg5, @OriginalArg(7) Class150 arg6) {
		@Pc(10) Class1_Sub28 local10 = new Class1_Sub28();
		local10.anInt4430 = arg1 * 128;
		local10.anInt4425 = arg3;
		local10.anInt4431 = arg0 * 128;
		if (arg6 != null) {
			local10.anIntArray495 = arg6.anIntArray506;
			local10.anInt4420 = arg6.anInt4561;
			local10.anInt4436 = arg6.anInt4545;
			local10.anInt4428 = arg6.anInt4555;
			local10.anInt4421 = arg6.anInt4572;
			local10.aClass150_1 = arg6;
			@Pc(55) int local55 = arg6.anInt4532;
			@Pc(58) int local58 = arg6.anInt4562;
			if (arg4 == 1 || arg4 == 3) {
				local58 = arg6.anInt4532;
				local55 = arg6.anInt4562;
			}
			local10.anInt4424 = (arg0 + local58) * 128;
			local10.anInt4418 = (local55 + arg1) * 128;
			local10.anInt4427 = arg6.anInt4547 * 128;
			if (arg6.anIntArray507 != null) {
				local10.aBoolean401 = true;
				local10.method3798();
			}
			if (local10.anIntArray495 != null) {
				local10.anInt4419 = local10.anInt4428 + (int) ((double) (local10.anInt4436 - local10.anInt4428) * Math.random());
			}
			Static236.aClass96_22.method2336(local10);
		} else if (arg2 != null) {
			@Pc(133) Class183 local133 = arg2.aClass183_1;
			local10.aClass11_Sub4_Sub2_1 = arg2;
			if (local133.anIntArray596 != null) {
				local10.aBoolean401 = true;
				local133 = local133.method4526();
			}
			if (local133 != null) {
				local10.anInt4424 = (local133.anInt5436 + arg0) * 128;
				local10.anInt4418 = (arg1 + local133.anInt5436) * 128;
				local10.anInt4420 = Static294.method945(arg2);
				local10.anInt4427 = local133.anInt5418 * 128;
				local10.anInt4421 = local133.anInt5420;
			}
			Static28.aClass96_2.method2336(local10);
		} else if (arg5 != null) {
			local10.aClass11_Sub4_Sub1_2 = arg5;
			local10.anInt4418 = (arg1 + arg5.method3347()) * 128;
			local10.anInt4424 = (arg0 + arg5.method3347()) * 128;
			local10.anInt4420 = Static107.method2017(arg5);
			local10.anInt4427 = arg5.anInt3005 * 128;
			local10.anInt4421 = arg5.anInt3011;
			Static4.aClass86_3.method2144(local10, Static282.method4276(arg5.aString99));
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!nm;I)Z")
	public static boolean method3548(@OriginalArg(1) Class119 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte[] local17 = arg0.method3244(arg1);
		if (local17 == null) {
			return false;
		} else {
			Static56.method1017(local17);
			return true;
		}
	}
}
