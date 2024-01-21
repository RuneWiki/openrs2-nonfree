import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!c;")
	public static Class10 aClass10_19;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_569 = Static41.method597("0(U");

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!od;")
	private static Class60 aClass60_571 = Static41.method597("cyan:");

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_570 = aClass60_571;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	public static int[] anIntArray177 = new int[200];

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_572 = aClass60_571;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_573 = Static41.method597("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_574 = aClass60_573;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_575 = Static41.method597(":assistreq:");

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_576 = aClass60_573;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
	public static int[] anIntArray178 = new int[500];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_577 = Static41.method597("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method981() {
		Static75.aClass12_10.method284();
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V")
	public static void method987() {
		aClass60_577 = null;
		anIntArray178 = null;
		aClass60_569 = null;
		aClass60_574 = null;
		aClass60_573 = null;
		aClass60_571 = null;
		aBooleanArray10 = null;
		aClass60_570 = null;
		aClass10_19 = null;
		anIntArray177 = null;
		aClass60_576 = null;
		aClass60_575 = null;
		aClass60_572 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lclient!sa;")
	public static Class4_Sub14 method991(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static82.aClass4_Sub14ArrayArray1[local16] == null || Static82.aClass4_Sub14ArrayArray1[local16][local7] == null) {
			@Pc(30) boolean local30 = Static118.method1894(local16);
			if (!local30) {
				return null;
			}
		}
		return Static82.aClass4_Sub14ArrayArray1[local16][local7];
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
	public static int method992() {
		@Pc(7) int local7 = 3;
		if (Static23.anInt806 < 310) {
			@Pc(16) int local16 = Static109.anInt2592 >> 7;
			@Pc(20) int local20 = Static98.anInt2286 >> 7;
			if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][local20][local16] & 0x4) != 0) {
				local7 = Static77.anInt1866;
			}
			@Pc(37) int local37 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7;
			@Pc(45) int local45;
			if (local16 < local37) {
				local45 = local37 - local16;
			} else {
				local45 = local16 - local37;
			}
			@Pc(56) int local56 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7;
			@Pc(63) int local63;
			if (local20 >= local56) {
				local63 = local20 - local56;
			} else {
				local63 = local56 - local20;
			}
			@Pc(80) int local80;
			@Pc(74) int local74;
			if (local63 > local45) {
				local74 = 32768;
				local80 = local45 * 65536 / local63;
				while (local20 != local56) {
					if (local20 < local56) {
						local20++;
					} else if (local56 < local20) {
						local20--;
					}
					local74 += local80;
					if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][local20][local16] & 0x4) != 0) {
						local7 = Static77.anInt1866;
					}
					if (local74 >= 65536) {
						local74 -= 65536;
						if (local16 < local37) {
							local16++;
						} else if (local16 > local37) {
							local16--;
						}
						if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][local20][local16] & 0x4) != 0) {
							local7 = Static77.anInt1866;
						}
					}
				}
			} else {
				local80 = local63 * 65536 / local45;
				local74 = 32768;
				while (local16 != local37) {
					if (local37 > local16) {
						local16++;
					} else if (local37 < local16) {
						local16--;
					}
					if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][local20][local16] & 0x4) != 0) {
						local7 = Static77.anInt1866;
					}
					local74 += local80;
					if (local74 >= 65536) {
						local74 -= 65536;
						if (local56 > local20) {
							local20++;
						} else if (local20 > local56) {
							local20--;
						}
						if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][local20][local16] & 0x4) != 0) {
							local7 = Static77.anInt1866;
						}
					}
				}
			}
		}
		if ((Static69.aByteArrayArrayArray5[Static77.anInt1866][Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7][Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7] & 0x4) != 0) {
			local7 = Static77.anInt1866;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lclient!ge;IIIIILclient!le;I[BI)V")
	public static void method994(@OriginalArg(0) int arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class48 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg8);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method770();
			if (local16 == 0) {
				return;
			}
			@Pc(23) int local23 = 0;
			local12 += local16;
			while (true) {
				@Pc(31) int local31 = local10.method770();
				if (local31 == 0) {
					break;
				}
				local23 += local31 - 1;
				@Pc(45) int local45 = local23 >> 6 & 0x3F;
				@Pc(49) int local49 = local23 >> 12;
				@Pc(53) int local53 = local23 & 0x3F;
				@Pc(57) int local57 = local10.method773();
				@Pc(61) int local61 = local57 & 0x3;
				@Pc(65) int local65 = local57 >> 2;
				if (local49 == arg3 && local45 >= arg0 && arg0 + 8 > local45 && arg7 <= local53 && local53 < arg7 + 8) {
					@Pc(100) Class4_Sub3_Sub3 local100 = Static76.method1244(local12);
					@Pc(118) int local118 = arg9 + Static55.method881(arg4, local45 & 0x7, local61, local100.anInt760, local100.anInt750, local53 & 0x7);
					@Pc(136) int local136 = arg5 + Static117.method1888(local100.anInt760, local100.anInt750, arg4, local53 & 0x7, local61, local45 & 0x7);
					if (local118 > 0 && local136 > 0 && local118 < 103 && local136 < 103) {
						@Pc(153) int local153 = arg2;
						@Pc(155) Class28 local155 = null;
						if ((Static69.aByteArrayArrayArray5[1][local118][local136] & 0x2) == 2) {
							local153 = arg2 - 1;
						}
						if (local153 >= 0) {
							local155 = arg1[local153];
						}
						Static69.method1104(local155, arg2, local61 + arg4 & 0x3, local12, local136, local118, arg6, local65);
					}
				}
			}
		}
	}
}
