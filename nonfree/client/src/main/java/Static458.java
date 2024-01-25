import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_66 = new Class181(8, -1);

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Z")
	public static boolean aBoolean638 = false;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
	public static int anInt7755 = 0;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_156 = new Class136(62, 1);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!vfa;IIIIILclient!aa;ILclient!ha;)V")
	public static void method6815(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class126 arg7) {
		@Pc(10) Class72 local10 = Static40.aClass273_3.method6529(arg4);
		if (local10 == null || !local10.aBoolean121 || !local10.method1445(Static564.aClass304_1)) {
			return;
		}
		@Pc(38) int local38;
		if (local10.anIntArray130 != null) {
			@Pc(36) int[] local36 = new int[local10.anIntArray130.length];
			@Pc(50) int local50;
			@Pc(63) int local63;
			@Pc(67) int local67;
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				if (Static584.anInt9543 == 4) {
					local50 = (int) Static112.aFloat22 & 0x3FFF;
				} else {
					local50 = Static402.anInt9327 + (int) Static112.aFloat22 & 0x3FFF;
				}
				local63 = Class5_Sub12_Sub1.anIntArray748[local50];
				local67 = Class5_Sub12_Sub1.anIntArray749[local50];
				if (Static584.anInt9543 != 4) {
					local63 = local63 * 256 / (Static425.anInt7212 + 256);
					local67 = local67 * 256 / (Static425.anInt7212 + 256);
				}
				local36[local38 * 2] = arg0.anInt9852 / 2 + arg3 + (local67 * (arg6 - -(local10.anIntArray130[local38 * 2] * 4)) + (local10.anIntArray130[local38 * 2 + 1] * 4 + arg1) * local63 >> 14);
				local36[local38 * 2 + 1] = arg0.anInt9797 / 2 + arg2 - ((local10.anIntArray130[local38 * 2 + 1] * 4 + arg1) * local67 - (local10.anIntArray130[local38 * 2] * 4 + arg6) * local63 >> 14);
			}
			Static105.method1529(arg7, local36, local10.anInt1512, arg0.anIntArray793, arg0.anIntArray799);
			if (local10.anInt1540 <= 0) {
				for (local50 = 0; local50 < local36.length / 2 - 1; local50++) {
					arg7.method6990(local36[local50 * 2], local36[local50 * 2 + 1], local36[(local50 + 1) * 2], local36[local50 * 2 + 3], local10.anIntArray129[local10.aByteArray21[local50] & 0xFF], arg5, arg3, arg2);
				}
				arg7.method6990(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local10.anIntArray129[local10.aByteArray21[local10.aByteArray21.length - 1] & 0xFF], arg5, arg3, arg2);
			} else {
				@Pc(314) int local314;
				@Pc(324) int local324;
				@Pc(335) int local335;
				@Pc(347) int local347;
				for (local50 = 0; local50 < local36.length / 2 - 1; local50++) {
					local63 = local36[local50 * 2];
					local67 = local36[local50 * 2 + 1];
					local314 = local36[local50 * 2 + 2];
					local324 = local36[(local50 + 1) * 2 + 1];
					if (local314 < local63) {
						local335 = local63;
						local63 = local314;
						local347 = local67;
						local67 = local324;
						local314 = local335;
						local324 = local347;
					} else if (local314 == local63 && local67 > local324) {
						local335 = local67;
						local67 = local324;
						local324 = local335;
					}
					arg7.method7015(local63, local67, local314, local324, local10.anIntArray129[local10.aByteArray21[local50] & 0xFF], arg5, arg3, arg2, local10.anInt1540, local10.anInt1531, local10.anInt1526);
				}
				local63 = local36[local36.length - 2];
				local67 = local36[local36.length - 1];
				local314 = local36[0];
				local324 = local36[1];
				if (local314 < local63) {
					local335 = local63;
					local347 = local67;
					local63 = local314;
					local67 = local324;
					local314 = local335;
					local324 = local347;
				} else if (local314 == local63 && local67 > local324) {
					local335 = local67;
					local67 = local324;
					local324 = local335;
				}
				arg7.method7015(local63, local67, local314, local324, local10.anIntArray129[local10.aByteArray21[local10.aByteArray21.length - 1] & 0xFF], arg5, arg3, arg2, local10.anInt1540, local10.anInt1531, local10.anInt1526);
			}
		}
		@Pc(473) Class44 local473 = null;
		if (local10.anInt1509 != -1) {
			local473 = local10.method1448(false, arg7);
			if (local473 != null) {
				Static554.method7808(arg5, arg3, local473, arg1, arg6, arg2, arg0);
			}
		}
		if (local10.aString22 == null) {
			return;
		}
		local38 = 0;
		if (local473 != null) {
			local38 = local473.method5320();
		}
		@Pc(506) Class6 local506 = Static288.aClass6_8;
		@Pc(508) Class298 local508 = Static363.aClass298_7;
		if (local10.anInt1523 == 1) {
			local508 = Static530.aClass298_13;
			local506 = Static437.aClass6_11;
		}
		if (local10.anInt1523 == 2) {
			local508 = Static457.aClass298_11;
			local506 = Static471.aClass6_12;
		}
		Static145.method6156(arg0, arg1, local10.anInt1536, local508, local10.aString22, arg2, arg3, arg6, local38, local506, arg5);
		return;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method6816() {
		Static407.aClass293_46.method6922(50);
	}
}
