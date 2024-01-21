import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!h;")
	public static Class33 aClass33_8;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_648 = Static65.method1172("runes");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public static int anInt1883 = 0;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public static int anInt1886 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[Lclient!qf;IIB[B)V")
	public static void method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(20) int local20;
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
				for (local20 = 0; local20 < 64; local20++) {
					if (local16 + arg3 > 0 && arg3 + local16 < 103 && local20 + arg1 > 0 && local20 + arg1 < 103) {
						arg2[local12].anIntArrayArray35[local16 + arg3][local20 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(85) Class3_Sub4 local85 = new Class3_Sub4(arg5);
		for (local20 = 0; local20 < 4; local20++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static69.method1189(local85, arg1 + local95, arg3 + local91, local20, 0, arg0, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method1243() {
		aClass33_8 = null;
		aClass46_648 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
	public static boolean method1246() {
		return Static22.anInt527 == 0 ? Static125.aClass3_Sub5_Sub2_2.method2287() : true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1247(@OriginalArg(1) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
	public static int method1248() {
		@Pc(8) int local8 = 3;
		if (Static163.anInt3624 < 310) {
			@Pc(19) int local19 = Static134.anInt3130 >> 7;
			@Pc(23) int local23 = Static70.anInt1833 >> 7;
			@Pc(28) int local28 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7;
			if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][local19][local23] & 0x4) != 0) {
				local8 = Static99.anInt2422;
			}
			@Pc(48) int local48 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7;
			@Pc(56) int local56;
			if (local19 >= local28) {
				local56 = local19 - local28;
			} else {
				local56 = local28 - local19;
			}
			@Pc(70) int local70;
			if (local23 < local48) {
				local70 = local48 - local23;
			} else {
				local70 = local23 - local48;
			}
			@Pc(90) int local90;
			@Pc(92) int local92;
			if (local56 > local70) {
				local90 = local70 * 65536 / local56;
				local92 = 32768;
				while (local19 != local28) {
					local92 += local90;
					if (local28 > local19) {
						local19++;
					} else if (local19 > local28) {
						local19--;
					}
					if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][local19][local23] & 0x4) != 0) {
						local8 = Static99.anInt2422;
					}
					if (local92 >= 65536) {
						if (local48 > local23) {
							local23++;
						} else if (local48 < local23) {
							local23--;
						}
						local92 -= 65536;
						if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][local19][local23] & 0x4) != 0) {
							local8 = Static99.anInt2422;
						}
					}
				}
			} else {
				local90 = local56 * 65536 / local70;
				local92 = 32768;
				while (local23 != local48) {
					if (local23 < local48) {
						local23++;
					} else if (local48 < local23) {
						local23--;
					}
					if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][local19][local23] & 0x4) != 0) {
						local8 = Static99.anInt2422;
					}
					local92 += local90;
					if (local92 >= 65536) {
						local92 -= 65536;
						if (local28 > local19) {
							local19++;
						} else if (local19 > local28) {
							local19--;
						}
						if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][local19][local23] & 0x4) != 0) {
							local8 = Static99.anInt2422;
						}
					}
				}
			}
		}
		if ((Static119.aByteArrayArrayArray5[Static99.anInt2422][Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7][Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7] & 0x4) != 0) {
			local8 = Static99.anInt2422;
		}
		return local8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIIII)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static119.aClass3_Sub2_Sub3_Sub2Array4[0].method1713(arg3, arg2);
		@Pc(17) int local17 = (arg0 - 32) * arg0 / arg4;
		if (local17 < 8) {
			local17 = 8;
		}
		Static119.aClass3_Sub2_Sub3_Sub2Array4[1].method1713(arg3, arg2 + arg0 - 16);
		@Pc(52) int local52 = arg1 * (arg0 - local17 - 32) / (arg4 - arg0);
		Static103.method2210(arg3, arg2 + 16, 16, arg0 - 32, Static24.anInt555);
		Static103.method2210(arg3, local52 + arg2 + 16, 16, local17, Static118.anInt2811);
		Static103.method2219(arg3, local52 + arg2 + 16, local17, Static77.anInt1928);
		Static103.method2219(arg3 + 1, arg2 + 16 + local52, local17, Static77.anInt1928);
		Static103.method2223(arg3, arg2 + local52 + 16, 16, Static77.anInt1928);
		Static103.method2223(arg3, arg2 + local52 + 17, 16, Static77.anInt1928);
		Static103.method2219(arg3 + 15, arg2 - -local52 + 16, local17, Static30.anInt729);
		Static103.method2219(arg3 + 14, arg2 + 17 + local52, local17 - 1, Static30.anInt729);
		Static103.method2223(arg3, local52 + arg2 + local17 + 15, 16, Static30.anInt729);
		Static103.method2223(arg3 + 1, local17 + local52 + (arg2 - -14), 15, Static30.anInt729);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[S[Lclient!kb;)V")
	public static void method1251(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class46[] arg1) {
		Static137.method2326(arg0, arg1.length - 1, 0, arg1);
	}
}
