import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dja", name = "H", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!dja", name = "z", descriptor = "[[Lclient!fda;")
	public static Class120[][] aClass120ArrayArray1;

	@OriginalMember(owner = "client!dja", name = "v", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!dja", name = "q", descriptor = "Lclient!el;")
	public static final Class109 aClass109_45 = new Class109(68, 4);

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
	public static int anInt1784 = 2;

	@OriginalMember(owner = "client!dja", name = "p", descriptor = "[I")
	public static final int[] anIntArray100 = new int[1];

	@OriginalMember(owner = "client!dja", name = "o", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Lclient!ha;IIIII)V")
	public static void method1574(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.KA(arg4, arg2, arg4 + arg1, arg3 + arg2);
		arg0.method7731(-16777216, arg4, arg3, arg1, arg2);
		if (Static270.anInt4694 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static629.anInt9766 / (float) Static629.anInt9767;
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg3;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg1);
		} else {
			local37 = (int) ((float) arg3 / local35);
		}
		@Pc(66) int local66 = arg2 + (arg3 - local39) / 2;
		@Pc(75) int local75 = arg4 + (arg1 - local37) / 2;
		if (Static446.aClass134_30 == null || Static446.aClass134_30.method9236() != arg1 || arg3 != Static446.aClass134_30.method9219()) {
			Static629.method8375(Static629.anInt9765, Static629.anInt9763 + Static629.anInt9766, Static629.anInt9767 + Static629.anInt9765, Static629.anInt9763, local75, local66, local75 + local37, local39 + local66);
			Static629.method8393(arg0);
			Static446.aClass134_30 = arg0.method7712(local75, local66, local37, local39, false);
		}
		Static446.aClass134_30.method9235(local75, local66);
		@Pc(136) int local136 = local37 * Static267.anInt4662 / Static629.anInt9767;
		@Pc(142) int local142 = Static645.anInt10500 * local39 / Static629.anInt9766;
		@Pc(150) int local150 = local37 * Static242.anInt4082 / Static629.anInt9767 + local75;
		@Pc(164) int local164 = local66 + local39 - local142 - local39 * Static72.anInt1150 / Static629.anInt9766;
		@Pc(166) int local166 = -1996554240;
		if (Static521.aClass333_6 == Static256.aClass333_3) {
			local166 = -1996488705;
		}
		arg0.aa(local150, local164, local136, local142, local166, 1);
		arg0.method7681(local150, local164, local136, local142, local166, 0);
		if (Static31.anInt506 <= 0) {
			return;
		}
		@Pc(204) int local204;
		if (Static333.anInt5936 > 50) {
			local204 = (100 - Static333.anInt5936) * 5;
		} else {
			local204 = Static333.anInt5936 * 5;
		}
		for (@Pc(215) Class5_Sub8 local215 = (Class5_Sub8) Static629.aClass102_69.method1916(); local215 != null; local215 = (Class5_Sub8) Static629.aClass102_69.method1915()) {
			@Pc(223) Class315 local223 = Static629.aClass33_4.method657(local215.anInt1429);
			if (Static484.method7007(local223)) {
				@Pc(246) int local246;
				@Pc(258) int local258;
				if (Static496.anInt8292 == local215.anInt1429) {
					local246 = local37 * local215.anInt1430 / Static629.anInt9767 + local75;
					local258 = (Static629.anInt9766 - local215.anInt1432) * local39 / Static629.anInt9766 + local66;
					arg0.method7731(local204 << 24 | 0xFFFF00, local246 - 2, 4, 4, local258 - 2);
				} else if (Static87.anInt1456 != -1 && local223.anInt8900 == Static87.anInt1456) {
					local246 = local75 + local37 * local215.anInt1430 / Static629.anInt9767;
					local258 = (Static629.anInt9766 - local215.anInt1432) * local39 / Static629.anInt9766 + local66;
					arg0.method7731(local204 << 24 | 0xFFFF00, local246 - 2, 4, 4, local258 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)Z")
	public static boolean method1580() {
		return Static563.aBoolean729;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(III)V")
	public static void method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class5_Sub5_Sub6 local14 = Static478.method6972((long) arg0, 12);
		local14.method2687();
		local14.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(III)V")
	public static void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 14);
		local16.method2687();
		local16.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)V")
	public static void method1585() {
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			Static261.aBooleanArray7[local14] = false;
		}
		Static635.anInt10332 = 0;
		Static79.anInt1216 = 1;
		Static342.anInt6068 = -1;
		Static393.anInt7347 = 0;
		Static658.anInt10595 = -1;
		Static272.anInt4763 = -1;
		Static651.anInt10529 = -1;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
	public static void method1589() {
		for (@Pc(15) Class5_Sub5_Sub13 local15 = (Class5_Sub5_Sub13) Static366.aClass102_43.method1916(); local15 != null; local15 = (Class5_Sub5_Sub13) Static366.aClass102_43.method1915()) {
			@Pc(20) Class8_Sub1_Sub3_Sub1 local20 = local15.aClass8_Sub1_Sub3_Sub1_1;
			if (local20.anInt1677 < Static44.anInt740) {
				local15.method9327(1);
				local20.method1529();
			} else if (local20.anInt1684 <= Static44.anInt740) {
				local20.method1525();
				if (local20.anInt1709 > 0) {
					@Pc(55) Class5_Sub35 local55 = (Class5_Sub35) Static623.aClass291_43.method6993((long) (local20.anInt1709 - 1), 1);
					if (local55 != null) {
						@Pc(60) Class8_Sub1_Sub3_Sub2_Sub2 local60 = local55.aClass8_Sub1_Sub3_Sub2_Sub2_2;
						if (local60.anInt10355 >= 0 && Static544.anInt9261 * 512 > local60.anInt10355 && local60.anInt10363 >= 0 && local60.anInt10363 < Static282.anInt4887 * 512) {
							local20.method1523(Static380.method5559(local60.anInt10355, local20.aByte145, local60.anInt10363, 0) - local20.anInt1692, Static44.anInt740, local60.anInt10355, local60.anInt10363);
						}
					}
				}
				if (local20.anInt1709 < 0) {
					@Pc(124) int local124 = -local20.anInt1709 - 1;
					@Pc(133) Class8_Sub1_Sub3_Sub2_Sub1 local133;
					if (local124 == Static279.anInt4838) {
						local133 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1;
					} else {
						local133 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local124];
					}
					if (local133 != null && local133.anInt10355 >= 0 && Static544.anInt9261 * 512 > local133.anInt10355 && local133.anInt10363 >= 0 && local133.anInt10363 < Static282.anInt4887 * 512) {
						local20.method1523(Static380.method5559(local133.anInt10355, local20.aByte145, local133.anInt10363, 0) - local20.anInt1692, Static44.anInt740, local133.anInt10355, local133.anInt10363);
					}
				}
				local20.method1527(-25877, Static315.anInt5591);
				Static270.method4024(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(JIIIIIILclient!aa;Lclient!cn;)V")
	public static void method1592(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) Class73 arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg4 * arg4;
		if (arg0 < (long) local11) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg7.anInt1384 / 2, arg7.anInt1394 / 2);
		if (local11 <= local37 * local37) {
			Static27.method453(arg2, arg7, Static131.aClass134Array4[arg1], arg5, arg6, arg4, arg3);
			return;
		}
		local37 -= 10;
		@Pc(57) int local57;
		if (Static79.anInt1216 == 4) {
			local57 = (int) Static429.aFloat132 & 0x3FFF;
		} else {
			local57 = (int) Static429.aFloat132 + Static609.anInt10107 & 0x3FFF;
		}
		@Pc(70) int local70 = Class5_Sub12.anIntArray544[local57];
		@Pc(74) int local74 = Class5_Sub12.anIntArray543[local57];
		if (Static79.anInt1216 != 4) {
			local70 = local70 * 256 / (Static438.anInt7509 + 256);
			local74 = local74 * 256 / (Static438.anInt7509 + 256);
		}
		@Pc(105) int local105 = arg4 * local70 + local74 * arg3 >> 14;
		@Pc(115) int local115 = local74 * arg4 - arg3 * local70 >> 14;
		@Pc(121) double local121 = Math.atan2((double) local105, (double) local115);
		@Pc(128) int local128 = (int) (Math.sin(local121) * (double) local37);
		@Pc(135) int local135 = (int) ((double) local37 * Math.cos(local121));
		Static271.aClass134Array6[arg1].method9221((float) local128 + (float) arg7.anInt1384 / 2.0F + (float) arg5, (float) -local135 + (float) arg2 + (float) arg7.anInt1394 / 2.0F, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1593(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static682.method799(arg0, 0, local16, 0, local6);
		return local16;
	}
}
