import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!sf;")
	public static Class105 aClass105_20 = new Class105();

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1448 = Static64.method1101("wave:");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1447 = aClass51_1448;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1449 = aClass51_1448;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt4210 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I")
	public static int method3256(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mi;I)V")
	public static void method3257(@OriginalArg(0) Class72 arg0) {
		@Pc(7) Class35 local7 = null;
		try {
			@Pc(18) Class38 local18 = arg0.method2247("runescape");
			while (local18.anInt1236 == 0) {
				Static186.method3115(1L);
			}
			if (local18.anInt1236 == 1) {
				local7 = (Class35) local18.anObject3;
				@Pc(37) Class1_Sub16 local37 = Static157.method2681();
				local7.method918(local37.anInt4860, local37.aByteArray62, 0);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local7 != null) {
				local7.method921();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILclient!ia;I)V")
	public static void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class71 local4 = Static29.method527(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray30 != null) {
			@Pc(18) Class1_Sub21 local18 = new Class1_Sub21();
			local18.aClass51_1095 = arg2;
			local18.anInt3101 = arg3;
			local18.anObjectArray32 = local4.anObjectArray30;
			local18.aClass71_25 = local4;
			Static65.method1119(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt2815 > 0) {
			local36 = Static159.method2693(local4);
		}
		if (!local36 || !Static209.method3452(Static33.method587(local4), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static167.aClass1_Sub16_Sub1_2.method3823(163);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 2) {
			Static167.aClass1_Sub16_Sub1_2.method3823(125);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 3) {
			Static167.aClass1_Sub16_Sub1_2.method3823(45);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 4) {
			Static167.aClass1_Sub16_Sub1_2.method3823(252);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 5) {
			Static167.aClass1_Sub16_Sub1_2.method3823(39);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 6) {
			Static167.aClass1_Sub16_Sub1_2.method3823(114);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 7) {
			Static167.aClass1_Sub16_Sub1_2.method3823(28);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 8) {
			Static167.aClass1_Sub16_Sub1_2.method3823(161);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 9) {
			Static167.aClass1_Sub16_Sub1_2.method3823(190);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
		if (arg3 == 10) {
			Static167.aClass1_Sub16_Sub1_2.method3823(199);
			Static167.aClass1_Sub16_Sub1_2.method3808(arg0);
			Static167.aClass1_Sub16_Sub1_2.method3807(arg1);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIBZLclient!vb;II)V")
	public static void method3260(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) Class70_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) ((arg4 << 16) + arg1);
		@Pc(17) Class1_Sub2_Sub8 local17 = (Class1_Sub2_Sub8) Static146.aClass102_5.method3093(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub2_Sub8) Static113.aClass102_13.method3093(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class1_Sub2_Sub8) Static207.aClass102_21.method3093(local11);
		if (local17 == null) {
			if (!arg0) {
				local17 = (Class1_Sub2_Sub8) Static50.aClass102_7.method3093(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class1_Sub2_Sub8();
			local17.aByte5 = arg2;
			local17.aClass70_Sub1_19 = arg3;
			local17.anInt1664 = arg5;
			if (arg0) {
				Static146.aClass102_5.method3083(local17, local11);
				Static144.anInt3150++;
			} else {
				Static2.aClass116_1.method3454(local17);
				Static207.aClass102_21.method3083(local17, local11);
				Static201.anInt4257++;
			}
		} else if (arg0) {
			local17.method3318();
			Static146.aClass102_5.method3083(local17, local11);
			Static144.anInt3150++;
			Static201.anInt4257--;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!mi;ZI)V")
	public static void method3261(@OriginalArg(0) Class72 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static42.anInt4800 = 3;
			Static107.method1834(false);
			Static19.aBoolean195 = false;
			Static84.anInt1961 = 127;
			Static103.aBoolean214 = false;
			Static142.aBoolean140 = false;
			Static16.anInt387 = 0;
			Static51.aBoolean60 = false;
			Static68.aBoolean73 = false;
			Static184.aBoolean185 = false;
			Static216.anInt4587 = 0;
			Static6.aBoolean6 = false;
			Static155.anInt3424 = 255;
			Static18.aBoolean16 = false;
			Static123.anInt2717 = 127;
			Static161.anInt3478 = 0;
			Static107.aBoolean98 = false;
			Static21.aBoolean22 = false;
			Static216.anInt4593 = 0;
			Static18.aBoolean17 = false;
			method3257(arg0);
			return;
		}
		Static42.anInt4800 = 3;
		Static107.method1834(true);
		Static68.aBoolean73 = true;
		Static216.anInt4593 = 0;
		Static84.anInt1961 = 127;
		Static155.anInt3424 = 255;
		Static161.anInt3478 = 0;
		Static18.aBoolean16 = true;
		Static123.anInt2717 = 127;
		Static103.aBoolean214 = true;
		Static216.anInt4587 = 0;
		Static184.aBoolean185 = true;
		Static142.aBoolean140 = true;
		Static18.aBoolean17 = true;
		Static19.aBoolean195 = true;
		Static21.aBoolean22 = true;
		Static6.aBoolean6 = true;
		Static51.aBoolean60 = true;
		Static16.anInt387 = 2;
		Static107.aBoolean98 = true;
		@Pc(99) Class35 local99 = null;
		try {
			@Pc(104) Class38 local104 = arg0.method2247("runescape");
			while (local104.anInt1236 == 0) {
				Static186.method3115(1L);
			}
			if (local104.anInt1236 == 1) {
				@Pc(121) int local121 = 0;
				local99 = (Class35) local104.anObject3;
				@Pc(131) byte[] local131 = new byte[(int) local99.method920()];
				while (local131.length > local121) {
					@Pc(143) int local143 = local99.method919(local121, local131.length - local121, local131);
					if (local143 == -1) {
						throw new IOException("EOF");
					}
					local121 += local143;
				}
				Static109.method1859(new Class1_Sub16(local131));
			}
		} catch (@Pc(171) Exception local171) {
		}
		try {
			if (local99 != null) {
				local99.method921();
			}
		} catch (@Pc(178) Exception local178) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static71.method1261(Static113.anIntArrayArray10[arg0], arg2 - arg3, arg1, arg3 + arg2);
		@Pc(18) int local18 = arg3 * arg3;
		@Pc(20) int local20 = arg4;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = arg4 * arg4;
		@Pc(39) int local39 = local18 << 1;
		@Pc(43) int local43 = local26 << 1;
		@Pc(47) int local47 = arg4 << 1;
		@Pc(56) int local56 = local26 - local39 * (local47 - 1);
		@Pc(66) int local66 = local18 * (1 - local47) + local43;
		@Pc(70) int local70 = local18 << 2;
		@Pc(74) int local74 = local26 << 2;
		@Pc(82) int local82 = local43 * 3;
		@Pc(90) int local90 = ((arg4 << 1) - 3) * local39;
		@Pc(96) int local96 = local74;
		@Pc(102) int local102 = local70 * (arg4 - 1);
		while (local20 > 0) {
			if (local66 < 0) {
				while (local66 < 0) {
					local22++;
					local66 += local82;
					local82 += local74;
					local56 += local96;
					local96 += local74;
				}
			}
			local20--;
			if (local56 < 0) {
				local22++;
				local56 += local96;
				local66 += local82;
				local96 += local74;
				local82 += local74;
			}
			@Pc(154) int local154 = arg0 - local20;
			local66 += -local102;
			local56 += -local90;
			local90 -= local70;
			local102 -= local70;
			@Pc(177) int local177 = arg2 - local22;
			@Pc(181) int local181 = local22 + arg2;
			@Pc(185) int local185 = arg0 + local20;
			Static71.method1261(Static113.anIntArrayArray10[local154], local177, arg1, local181);
			Static71.method1261(Static113.anIntArrayArray10[local185], local177, arg1, local181);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Lclient!aj;")
	public static Class10 method3265(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = (Class10) Static192.aClass53_25.method1501((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static161.aClass70_34.method3509(arg0, 16);
		local6 = new Class10();
		if (local20 != null) {
			local6.method168(new Class1_Sub16(local20));
		}
		Static192.aClass53_25.method1497(local6, (long) arg0);
		return local6;
	}
}
