import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "B")
	public static byte aByte99;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_13 = new Class111("", 14);

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBJ)V")
	public static void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static39.method636(local21, arg1, 0, local10, 0, 0, true, arg0);
			return;
		}
		@Pc(60) Class31 local60 = Static9.aClass149_1.method3573(local28);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local21 == 0 || local21 == 2) {
			local70 = local60.anInt784;
			local73 = local60.anInt786;
		} else {
			local73 = local60.anInt784;
			local70 = local60.anInt786;
		}
		@Pc(84) int local84 = local60.anInt760;
		if (local21 != 0) {
			local84 = (local84 << local21 & 0xF) + (local84 >> 4 - local21);
		}
		Static39.method636(0, arg1, local70, 0, local84, local73, true, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!hi;)V")
	public static void method5842(@OriginalArg(0) Class1_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort108; local2 <= arg0.aShort109; local2++) {
			for (@Pc(6) int local6 = arg0.aShort107; local6 <= arg0.aShort110; local6++) {
				@Pc(16) Class227 local16 = Static389.aClass227ArrayArrayArray3[arg0.aByte101][local2][local6];
				if (local16 != null) {
					@Pc(21) Class114 local21 = local16.aClass114_2;
					@Pc(23) Class114 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass114_2 = local21.aClass114_1;
							} else {
								local23.aClass114_1 = local21.aClass114_1;
							}
							local21.method2898();
							break;
						}
						local23 = local21;
						local21 = local21.aClass114_1;
					}
					local16.aByte77 = 0;
					for (@Pc(56) Class114 local56 = local16.aClass114_2; local56 != null; local56 = local56.aClass114_1) {
						local16.aByte77 = (byte) (local16.aByte77 | local56.anInt3395);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method5844() {
		if (Static444.aBoolean429) {
			Static444.aBoolean429 = false;
			Static400.aClass2_17 = null;
			Static322.aClass2_11 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method5845() {
		Static337.anInt5635 = 0;
		@Pc(11) int local11 = Static176.aClass3_Sub25_Sub1_1.method4066();
		@Pc(20) boolean local20 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
		@Pc(24) int local24 = Static176.aClass3_Sub25_Sub1_1.method4088();
		@Pc(28) int local28 = Static176.aClass3_Sub25_Sub1_1.method4083();
		Static4.method64();
		Static32.method580(local11);
		@Pc(40) int local40 = (Static102.anInt1839 - Static176.aClass3_Sub25_Sub1_1.anInt4974) / 16;
		Static60.anIntArrayArray8 = new int[local40][4];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < local40; local50++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static60.anIntArrayArray8[local50][local54] = Static176.aClass3_Sub25_Sub1_1.method4108();
			}
		}
		Static127.aByteArrayArray11 = new byte[local40][];
		Static73.anIntArray70 = new int[local40];
		Static95.anIntArray81 = new int[local40];
		Static127.anIntArray115 = new int[local40];
		Static417.anIntArray447 = new int[local40];
		Static194.aByteArrayArray14 = new byte[local40][];
		Static165.anIntArray116 = new int[local40];
		Static298.aByteArrayArray20 = null;
		Static457.aByteArrayArray34 = new byte[local40][];
		Static152.aByteArrayArray33 = new byte[local40][];
		Static192.anIntArray217 = null;
		local40 = 0;
		for (local54 = (local28 - (Static373.anInt6324 >> 4)) / 8; local54 <= (local28 + (Static373.anInt6324 >> 4)) / 8; local54++) {
			for (@Pc(124) int local124 = (local24 - (Static291.anInt5062 >> 4)) / 8; local124 <= ((Static291.anInt5062 >> 4) + local24) / 8; local124++) {
				Static127.anIntArray115[local40] = (local54 << 8) + local124;
				Static95.anIntArray81[local40] = Static92.aClass250_31.method5790("m" + local54 + "_" + local124);
				Static417.anIntArray447[local40] = Static92.aClass250_31.method5790("l" + local54 + "_" + local124);
				Static165.anIntArray116[local40] = Static92.aClass250_31.method5790("um" + local54 + "_" + local124);
				Static73.anIntArray70[local40] = Static92.aClass250_31.method5790("ul" + local54 + "_" + local124);
				local40++;
			}
		}
		Static251.method5279(local24, 10, local28, local20);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
	public static int method5847() {
		@Pc(7) Class167 local7 = Static413.aClass167_11;
		@Pc(9) boolean local9 = false;
		if (Static402.anInt6656 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static331.method6026(null, 0, local18, null, 0);
		}
		@Pc(35) long local35 = Static354.method4966();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method6002();
		}
		@Pc(61) int local61 = (int) (Static354.method4966() - local35);
		local7.method5951(100, 0, -16777216, 0, 100);
		if (local9) {
			local7.method5958();
		}
		return local61;
	}
}
