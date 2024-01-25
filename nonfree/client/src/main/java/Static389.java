import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!st;")
	public static Class236 aClass236_14;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	public static int anInt7108;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_45 = new Class203();

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString61 = "";

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZIZ)V")
	public static void method5419(@OriginalArg(3) boolean arg0) {
		Static446.anInt7813 = 2;
		Static84.anInt2035 = 22050;
		Static344.aBoolean402 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIIILclient!e;Lclient!sq;Lclient!za;II)Lclient!e;")
	public static Class17 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class17 arg9, @OriginalArg(11) Class235 arg10, @OriginalArg(12) Class106 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == null) {
			return null;
		}
		@Pc(19) int local19 = 2055;
		if (arg10 != null) {
			local19 = arg10.method5209(false, -1, arg8) | 0x807;
			local19 &= 0xFFFFFDFF;
		}
		@Pc(61) long local61 = (long) (arg4 + (arg1 << 16) + (arg3 << 24)) + ((long) arg13 << 32) + ((long) arg0 << 48);
		@Pc(63) Class91 local63 = Static429.aClass91_97;
		@Pc(71) Class17 local71;
		synchronized (Static429.aClass91_97) {
			local71 = (Class17) Static429.aClass91_97.method1988(local61);
		}
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(174) int local174;
		@Pc(178) int local178;
		if (local71 == null || arg11.method5913(local71.RA(), local19) != 0) {
			if (local71 != null) {
				local19 = arg11.method5954(local19, local71.RA());
			}
			@Pc(98) byte local98;
			if (arg4 == 1) {
				local98 = 9;
			} else if (arg4 == 2) {
				local98 = 12;
			} else if (arg4 == 3) {
				local98 = 15;
			} else if (arg4 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(138) int[] local138 = new int[] { 64, 96, 128 };
			@Pc(155) Class147 local155 = new Class147(local98 * 3 + 1, local98 * 3 * 2 - local98, 0);
			local162 = local155.method3374(0, 0, 0);
			@Pc(166) int[][] local166 = new int[3][local98];
			@Pc(180) int local180;
			@Pc(204) int local204;
			for (local168 = 0; local168 < 3; local168++) {
				local174 = local138[local168];
				local178 = local138[local168];
				for (local180 = 0; local180 < local98; local180++) {
					@Pc(188) int local188 = (local180 << 14) / local98;
					@Pc(196) int local196 = Class90_Sub1.anIntArray304[local188] * local174 >> 15;
					local204 = local178 * Class90_Sub1.anIntArray303[local188] >> 15;
					local166[local168][local180] = local155.method3374(local196, local204, 0);
				}
			}
			for (local174 = 0; local174 < 3; local174++) {
				local178 = (local174 * 256 + 128) / 3;
				local180 = 256 - local178;
				@Pc(255) byte local255 = (byte) (arg1 * local180 + arg3 * local178 >> 8);
				@Pc(300) short local300 = (short) (((arg0 & 0x7F) * local178 + (arg13 & 0x7F) * local180 & 0x7F00) + ((arg0 & 0x380) * local178 + (arg13 & 0x380) * local180 & 0x38000) + (local180 * (arg13 & 0xFC00) + local178 * (arg0 & 0xFC00) & 0xFC0000) >> 8);
				for (local204 = 0; local204 < local98; local204++) {
					if (local174 == 0) {
						local155.method3378((byte) 1, (short) -1, local162, local300, (byte) -1, local166[0][(local204 + 1) % local98], local166[0][local204], local255);
					} else {
						local155.method3378((byte) 1, (short) -1, local166[local174 - 1][local204], local300, (byte) -1, local166[local174 - 1][(local204 + 1) % local98], local166[local174][(local204 + 1) % local98], local255);
						local155.method3378((byte) 1, (short) -1, local166[local174 - 1][local204], local300, (byte) -1, local166[local174][(local204 + 1) % local98], local166[local174][local204], local255);
					}
				}
			}
			local71 = arg11.method5922(local155, local19, Static117.anInt2632, 64, 768);
			@Pc(423) Class91 local423 = Static429.aClass91_97;
			synchronized (Static429.aClass91_97) {
				Static429.aClass91_97.method1990(local71, local61);
			}
		}
		@Pc(442) int local442 = (arg4 << 6) - 1;
		@Pc(445) int local445 = -local442;
		@Pc(448) int local448 = -local442;
		@Pc(450) int local450 = local442;
		local162 = local442;
		if (arg5 != 0) {
			if ((arg5 & 0x4) != 0) {
				local450 = local442 + 128;
			}
			if ((arg5 & 0x1) != 0) {
				local162 = local442 + 128;
			}
			if ((arg5 & 0x8) != 0) {
				local445 -= 128;
			}
			if ((arg5 & 0x2) != 0) {
				local448 -= 128;
			}
		}
		@Pc(483) int local483 = arg9.ta();
		local168 = arg9.MA();
		local174 = arg9.Z();
		if (local168 > local450) {
			local168 = local450;
		}
		if (local483 < local445) {
			local483 = local445;
		}
		local178 = arg9.S();
		if (local174 < local448) {
			local174 = local448;
		}
		if (local178 > local162) {
			local178 = local162;
		}
		@Pc(530) Class1_Sub1_Sub8 local530 = null;
		if (arg10 != null) {
			@Pc(537) int local537 = arg10.anIntArray633[arg8];
			local530 = Static107.aClass239_1.method5423(local537 >> 16);
			arg8 = local537 & 0xFFFF;
		}
		if (local530 == null) {
			local71 = local71.method6202((byte) 3, local19, true);
			local71.n(local168 - local483 >> 1, 128, local178 - local174 >> 1);
			local71.a(local168 + local483 >> 1, 0, local174 + local178 >> 1);
		} else {
			local71 = local71.method6202((byte) 3, local19, true);
			local71.n(local168 - local483 >> 1, 128, local178 - local174 >> 1);
			local71.a(local483 + local168 >> 1, 0, local178 + local174 >> 1);
			local71.method6196(arg8, local530);
		}
		if (arg7 != 0) {
			local71.W(arg7);
		}
		if (arg6 != 0) {
			local71.K(arg6);
		}
		if (arg12 != 0) {
			local71.a(0, arg12, 0);
		}
		return local71;
	}
}
