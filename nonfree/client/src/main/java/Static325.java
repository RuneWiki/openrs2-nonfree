import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_7 = new Class26(10);

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_14 = new Class16();

	@OriginalMember(owner = "client!un", name = "l", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIB)I")
	public static int method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIZI)V")
	public static void method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(21) int local21 = arg2 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(42) int local42 = (Static111.aShort11 - Static184.aShort60) * local21 / 100 + Static184.aShort60;
		if (local42 < Static348.aShort95) {
			local42 = Static348.aShort95;
		} else if (Static180.aShort67 < local42) {
			local42 = Static180.aShort67;
		}
		@Pc(68) int local68 = local42 * arg2 * 512 / (arg3 * 334);
		@Pc(113) int local113;
		@Pc(120) int local120;
		@Pc(84) short local84;
		if (local68 < Static285.aShort77) {
			local84 = Static285.aShort77;
			local42 = arg3 * local84 * 334 / (arg2 * 512);
			if (Static180.aShort67 < local42) {
				local42 = Static180.aShort67;
				local113 = local42 * 512 * arg2 / (local84 * 334);
				local120 = (arg3 - local113) / 2;
				if (arg4) {
					Static107.aClass129_4.method4966();
					Static107.aClass129_4.method4941(arg0, arg1, local120, -16777216, arg2);
					Static107.aClass129_4.method4941(arg0 + arg3 - local120, arg1, local120, -16777216, arg2);
				}
				arg0 += local120;
				arg3 -= local120 * 2;
			}
		} else if (Static252.aShort83 < local68) {
			local84 = Static252.aShort83;
			local42 = local84 * arg3 * 334 / (arg2 * 512);
			if (Static348.aShort95 > local42) {
				local42 = Static348.aShort95;
				local113 = local84 * 334 * arg3 / (local42 * 512);
				local120 = (arg2 - local113) / 2;
				if (arg4) {
					Static107.aClass129_4.method4966();
					Static107.aClass129_4.method4941(arg0, arg1, arg3, -16777216, local120);
					Static107.aClass129_4.method4941(arg0, arg2 + arg1 - local120, arg3, -16777216, local120);
				}
				arg1 += local120;
				arg2 -= local120 * 2;
			}
		}
		Static272.anInt5169 = arg1;
		Static279.anInt5584 = arg0;
		Static289.anInt5731 = (short) arg2;
		Static135.anInt2530 = local42 * arg2 / 334;
		Static169.anInt6315 = (short) arg3;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILclient!uo;[Lclient!hh;II[B)V")
	public static void method1027(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class92[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(15) Class11_Sub25 local15 = new Class11_Sub25(arg5);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method5193();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method5188();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local15.method5185();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(78) int local78 = local57 + arg4;
				@Pc(82) int local82 = arg1 + local51;
				if (local78 > 0 && local82 > 0 && local78 < Static24.anInt454 - 1 && Static240.anInt4832 - 1 > local82) {
					@Pc(106) Class92 local106 = null;
					if (!arg0) {
						@Pc(110) int local110 = local61;
						if ((Static1.aByteArrayArrayArray1[1][local78][local82] & 0x2) == 2) {
							local110 = local61 - 1;
						}
						if (local110 >= 0) {
							local106 = arg3[local110];
						}
					}
					Static262.method4547(-1, local69, arg0, local17, true, local61, local61, local73, arg2, local78, local82, local106);
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I")
	public static int method1028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static305.anIntArray490[arg1 & 0x3] : Static15.anIntArray419[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!co;ILclient!be;Lclient!uo;)V")
	public static void method1029(@OriginalArg(0) Class11_Sub8 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class129 arg2) {
		@Pc(10) Class97 local10 = arg1.method244(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5558();
		if (local10.method5543() > local16) {
			local16 = local10.method5543();
		}
		@Pc(28) int local28 = arg0.anInt861;
		@Pc(31) int local31 = arg0.anInt862;
		@Pc(33) int local33 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(83) int local83;
		if (arg1.aString7 != null) {
			local33 = Static275.aClass114_7.method2469(null, arg1.aString7, Static288.aStringArray47, null);
			for (local56 = 0; local56 < local33; local56++) {
				@Pc(62) String local62 = Static288.aStringArray47[local56];
				if (local56 < local33 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local83 = Static16.aClass30_1.method397(local62);
				if (local83 > local40) {
					local40 = local83;
				}
			}
			local42 = local33 * Static16.aClass30_1.method400() + Static16.aClass30_1.method398() / 2;
		}
		local56 = arg0.anInt861 + local16 / 2;
		@Pc(114) int local114 = arg0.anInt862;
		if (local16 + Static271.anInt4336 > local28) {
			local28 = Static271.anInt4336;
			local56 = local40 / 2 + Static271.anInt4336 + local16 / 2 + 5 + 10;
		} else if (Static271.anInt4334 - local16 < local28) {
			local56 = Static271.anInt4334 - local16 / 2 - local40 / 2 - 5 - 10;
			local28 = Static271.anInt4334 - local16;
		}
		if (Static271.anInt4340 + local16 > local31) {
			local114 = local16 / 2 + Static271.anInt4340 + 10;
			local31 = Static271.anInt4340;
		} else if (Static271.anInt4333 - local16 < local31) {
			local31 = Static271.anInt4333 - local16;
			local114 = Static271.anInt4333 - local42 - local16 / 2 - 10;
		}
		local83 = (int) (Math.atan2((double) (local28 - arg0.anInt861), (double) (local31 - arg0.anInt862)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5553((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local83);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg1.aString7 != null) {
			local255 = local56 - local40 / 2 - 5;
			local257 = local114;
			local259 = local40 + local255 + 10;
			local261 = local114 + Static16.aClass30_1.method400() * local33 + 3;
			if (arg1.anInt295 != 0) {
				arg2.method4941(local255, local114, local259 - local255, arg1.anInt295, local261 - local114);
			}
			if (arg1.anInt315 != 0) {
				arg2.method4993(local259 - local255, -local114 + local261, local255, local114, arg1.anInt315);
			}
			for (@Pc(328) int local328 = 0; local328 < local33; local328++) {
				@Pc(334) String local334 = Static288.aStringArray47[local328];
				if (local33 - 1 > local328) {
					local334 = local334.substring(0, local334.length() - 4);
				}
				Static16.aClass30_1.method395(arg2, local334, local56, local114, arg1.anInt305);
				local114 += Static16.aClass30_1.method400();
			}
		}
		if (arg1.anInt303 == -1 && arg1.aString7 == null) {
			return;
		}
		@Pc(377) Class11_Sub37 local377 = new Class11_Sub37(arg0);
		local16 >>= 0x1;
		local377.anInt5833 = local28 + local16;
		local377.anInt5834 = local16 + local31;
		local377.anInt5832 = local259;
		local377.anInt5828 = local255;
		local377.anInt5838 = local261;
		local377.anInt5836 = local257;
		local377.anInt5830 = local31 - local16;
		local377.anInt5827 = local28 - local16;
		Static4.aClass16_1.method190(local377);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V")
	public static void method1031() {
		Static210.aClass26_39.method329(5);
	}
}
