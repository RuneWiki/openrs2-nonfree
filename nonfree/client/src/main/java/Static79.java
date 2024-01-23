import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 aClass1_Sub3_Sub13_Sub2_1;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public static int anInt1828;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public static int anInt1831;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
	public static int[] anIntArray191 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIILclient!hd;IZJ)Z")
	public static boolean method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static46.anIntArrayArrayArray1 == Static222.anIntArrayArrayArray12;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static90.anInt2091 || local17 >= Static77.anInt1766) {
					return false;
				}
				@Pc(42) Class1_Sub2 local42 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][local10][local17];
				if (local42 != null && local42.anInt45 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class7 local58 = new Class7();
		local58.aLong7 = arg11;
		local58.anInt222 = arg0;
		local58.anInt217 = arg5;
		local58.anInt219 = arg6;
		local58.anInt216 = arg7;
		local58.aClass2_1 = arg8;
		local58.anInt223 = arg9;
		local58.anInt214 = arg1;
		local58.anInt220 = arg2;
		local58.anInt218 = arg1 + arg3 - 1;
		local58.anInt212 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static7.aClass1_Sub2ArrayArrayArray1[local141][local17][local108] == null) {
						Static7.aClass1_Sub2ArrayArrayArray1[local141][local17][local108] = new Class1_Sub2(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub2 local174 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][local17][local108];
				local174.aClass7Array1[local174.anInt45] = local58;
				local174.anIntArray2[local174.anInt45] = local115;
				local174.anInt54 |= local115;
				local174.anInt45++;
				if (local6 && Static142.anIntArrayArray40[local17][local108] != 0) {
					local8 = Static142.anIntArrayArray40[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static142.anIntArrayArray40[local17][local108] == 0) {
						Static142.anIntArrayArray40[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static259.aClass7Array3[Static165.anInt3670++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method1343() {
		Static242.anInt5012 = 0;
		Static81.anInt1887 = 0;
		Static203.method4327();
		Static168.method2747();
		Static53.method1009();
		Static298.method4558();
		@Pc(24) int local24;
		for (local24 = 0; local24 < Static81.anInt1887; local24++) {
			@Pc(35) int local35 = Static20.anIntArray49[local24];
			if (Static155.aClass2_Sub4_Sub2Array1[local35].anInt2824 != Static133.anInt3061) {
				if (Static155.aClass2_Sub4_Sub2Array1[local35].anInt2882 > 0) {
					Static83.method1428(Static155.aClass2_Sub4_Sub2Array1[local35], local35);
				}
				Static155.aClass2_Sub4_Sub2Array1[local35] = null;
			}
		}
		if (Static140.aClass1_Sub14_Sub1_2.anInt3000 != Static188.anInt4164) {
			throw new RuntimeException("gpp1 pos:" + Static140.aClass1_Sub14_Sub1_2.anInt3000 + " psize:" + Static188.anInt4164);
		}
		for (local24 = 0; local24 < Static16.anInt461; local24++) {
			if (Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local24]] == null) {
				throw new RuntimeException("gpp2 pos:" + local24 + " size:" + Static16.anInt461);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1345(@OriginalArg(0) String arg0) {
		return Static190.method3076(10, arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Lclient!bh;")
	public static Class18 method1346(@OriginalArg(0) int arg0) {
		@Pc(10) Class18 local10 = (Class18) Static14.aClass89_3.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static46.aClass168_36.method4058(arg0, 0);
		local10 = new Class18();
		if (local21 != null) {
			local10.method418(new Class1_Sub14(local21));
		}
		local10.method422();
		Static14.aClass89_3.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!th;Z)V")
	public static void method1347(@OriginalArg(0) Class168 arg0) {
		Static48.aClass46_Sub1Array1 = Static232.method3681(Static257.anInt5233, arg0);
		Static194.anIntArray370 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(29) float local29 = (float) (Static200.anIntArray390[local15] >> 16 & 0xFF);
			@Pc(39) int local39 = Static200.anIntArray390[local15 + 1] >> 16 & 0xFF;
			@Pc(49) int local49 = Static200.anIntArray390[local15 + 1] >> 8 & 0xFF;
			@Pc(57) float local57 = ((float) local39 - local29) / 64.0F;
			@Pc(66) float local66 = (float) (Static200.anIntArray390[local15] >> 8 & 0xFF);
			@Pc(73) float local73 = (float) (Static200.anIntArray390[local15] & 0xFF);
			@Pc(81) int local81 = Static200.anIntArray390[local15 + 1] & 0xFF;
			@Pc(88) float local88 = ((float) local49 - local66) / 64.0F;
			@Pc(95) float local95 = ((float) local81 - local73) / 64.0F;
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				Static194.anIntArray370[local97 + local15 * 64] = (int) local29 << 16 | (int) local66 << 8 | (int) local73;
				local66 += local88;
				local29 += local57;
				local73 += local95;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static194.anIntArray370[local15] = Static200.anIntArray390[3];
		}
		Static107.anIntArray183 = new int[32768];
		Static234.anIntArray458 = new int[32768];
		Static7.method243(null);
		Static109.anIntArray240 = new int[32768];
		Static188.anIntArray362 = new int[32768];
		aClass1_Sub3_Sub13_Sub2_1 = new Class1_Sub3_Sub13_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	public static void method1348() {
		Static97.method1629();
		Static246.anInterface4Array1 = new Interface4[8];
		Static246.anInterface4Array1[1] = new Class143();
		Static246.anInterface4Array1[2] = new Class65();
		Static246.anInterface4Array1[3] = new Class148();
		Static246.anInterface4Array1[4] = new Class152();
		Static246.anInterface4Array1[5] = new Class149();
		Static246.anInterface4Array1[6] = new Class25();
		Static246.anInterface4Array1[7] = new Class49();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1349(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method2199();
		@Pc(16) int local16 = local8.method2194();
		if (local16 < 0 || Static297.anInt5912 != 0 && local16 > Static297.anInt5912) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(91) byte[] local91 = new byte[local16];
			local8.method2232(local16, local91);
			return local91;
		} else {
			@Pc(47) int local47 = local8.method2194();
			if (local47 < 0 || Static297.anInt5912 != 0 && Static297.anInt5912 < local47) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local47];
			if (local12 == 1) {
				Static227.method3590(local67, local47, arg0, local16);
			} else {
				Static31.aClass170_1.method4104(local67, local8);
			}
			return local67;
		}
	}
}
