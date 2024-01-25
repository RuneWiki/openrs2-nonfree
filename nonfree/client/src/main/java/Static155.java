import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hq", name = "R", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "[Lclient!uq;")
	public static Class251[] aClass251Array1;

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "Z")
	public static volatile boolean aBoolean179 = true;

	@OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!hq", name = "T", descriptor = "[I")
	public static final int[] anIntArray268 = new int[256];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZIIILclient!sm;Lclient!ya;IIILclient!t;IZI)Lclient!t;")
	public static Class105 method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class223 arg6, @OriginalArg(7) Class39 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class105 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg6 != null) {
			local11 = arg6.method5050(arg8, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg12 << 32) + (long) ((arg3 << 16) + (arg0 + (arg4 << 24))) + ((long) arg13 << 48);
		@Pc(50) Class134 local50 = Static223.aClass134_33;
		@Pc(58) Class105 local58;
		synchronized (Static223.aClass134_33) {
			local58 = (Class105) Static223.aClass134_33.method3266(local48);
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (local58 == null || arg7.method4528(local58.P(), local11) != 0) {
			if (local58 != null) {
				local11 = arg7.method4530(local11, local58.P());
			}
			@Pc(96) byte local96;
			if (arg0 == 1) {
				local96 = 9;
			} else if (arg0 == 2) {
				local96 = 12;
			} else if (arg0 == 3) {
				local96 = 15;
			} else if (arg0 == 4) {
				local96 = 18;
			} else {
				local96 = 21;
			}
			@Pc(125) int[] local125 = new int[] { 64, 96, 128 };
			@Pc(143) Class236 local143 = new Class236(local96 * 3 + 1, -local96 + local96 * 2 * 3, 0);
			local150 = local143.method5245(0, 0, 0);
			@Pc(154) int[][] local154 = new int[3][local96];
			@Pc(168) int local168;
			@Pc(192) int local192;
			for (local156 = 0; local156 < 3; local156++) {
				local162 = local125[local156];
				local166 = local125[local156];
				for (local168 = 0; local168 < local96; local168++) {
					@Pc(176) int local176 = (local168 << 14) / local96;
					@Pc(184) int local184 = local162 * Class183.anIntArray433[local176] >> 15;
					local192 = local166 * Class183.anIntArray434[local176] >> 15;
					local154[local156][local168] = local143.method5245(0, local192, local184);
				}
			}
			for (local162 = 0; local162 < 3; local162++) {
				local166 = (local162 * 256 + 128) / 3;
				local168 = 256 - local166;
				@Pc(246) byte local246 = (byte) (local168 * arg3 + arg4 * local166 >> 8);
				@Pc(291) short local291 = (short) (((arg13 & 0xFC00) * local166 + (arg12 & 0xFC00) * local168 & 0xFC0000) + (local168 * (arg12 & 0x380) + local166 * (arg13 & 0x380) & 0x38000) + ((arg13 & 0x7F) * local166 + local168 * (arg12 & 0x7F) & 0x7F00) >> 8);
				for (local192 = 0; local192 < local96; local192++) {
					if (local162 == 0) {
						local143.method5241(local150, local246, local154[0][local192], local291, local154[0][(local192 + 1) % local96], (byte) -1, (short) -1, (byte) 1);
					} else {
						local143.method5241(local154[local162 - 1][local192], local246, local154[local162][(local192 + 1) % local96], local291, local154[local162 - 1][(local192 + 1) % local96], (byte) -1, (short) -1, (byte) 1);
						local143.method5241(local154[local162 - 1][local192], local246, local154[local162][local192], local291, local154[local162][(local192 + 1) % local96], (byte) -1, (short) -1, (byte) 1);
					}
				}
			}
			local58 = arg7.method4540(local143, local11, Static218.anInt4008, 64, 768);
			@Pc(415) Class134 local415 = Static223.aClass134_33;
			synchronized (Static223.aClass134_33) {
				Static223.aClass134_33.method3263(local48, local58);
			}
		}
		@Pc(434) int local434 = (arg0 << 6) - 1;
		@Pc(437) int local437 = -local434;
		@Pc(440) int local440 = -local434;
		@Pc(442) int local442 = local434;
		local150 = local434;
		if (arg2) {
			if (arg9 > 9216 && arg9 < 15360) {
				local442 = local434 + 128;
			}
			if (arg9 > 13312 || arg9 < 3072) {
				local440 -= 128;
			}
			if (arg9 > 5120 && arg9 < 11264) {
				local150 = local434 + 128;
			}
			if (arg9 > 1024 && arg9 < 7168) {
				local437 -= 128;
			}
		}
		@Pc(483) int local483 = arg11.HA();
		local156 = arg11.NA();
		local162 = arg11.PA();
		if (local483 < local437) {
			local483 = local437;
		}
		if (local156 > local442) {
			local156 = local442;
		}
		local166 = arg11.m();
		if (local440 > local162) {
			local162 = local440;
		}
		if (local166 > local150) {
			local166 = local150;
		}
		@Pc(526) Class1_Sub2_Sub9 local526 = null;
		if (arg6 != null) {
			@Pc(533) int local533 = arg6.anIntArray557[arg8];
			local526 = Static293.aClass127_1.method2976(local533 >> 16);
			arg8 = local533 & 0xFFFF;
		}
		if (local526 == null) {
			local58 = local58.method3548((byte) 3, local11, true);
			local58.H(local156 - local483 >> 1, 128, local166 - local162 >> 1);
			local58.JA(local483 + local156 >> 1, 0, local162 + local166 >> 1);
		} else {
			local58 = local58.method3548((byte) 3, local11, true);
			local58.H(local156 - local483 >> 1, 128, local166 - local162 >> 1);
			local58.JA(local483 + local156 >> 1, 0, local166 + local162 >> 1);
			local58.method3536(arg8, local526);
		}
		if (arg5 != 0) {
			local58.Z(arg5);
		}
		if (arg10 != 0) {
			local58.R(arg10);
		}
		if (arg1 != 0) {
			local58.JA(0, arg1, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!ul;)V")
	public static void method2551(@OriginalArg(1) Class246 arg0) {
		Static16.anInt471 = 0;
		Static399.anInt7267 = 0;
		Static356.aClass141_8 = new Class141();
		Static432.aClass4_Sub2_Sub1_Sub1Array2 = new Class4_Sub2_Sub1_Sub1[1024];
		Static190.method2971(arg0);
		Static345.method4839(arg0);
	}
}
