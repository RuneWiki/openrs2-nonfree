import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!xa;")
	public static Class66 aClass66_17;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!ba;III)Lclient!gr;")
	public static Class122 method1560(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class122(arg0, arg3, arg2, arg1.ZA(), arg1.ha(), arg1.M(), arg1.DA(), arg1.EA(), arg1.LA(), arg1.K());
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!jo;Ljava/awt/Canvas;BLclient!e;)Lclient!oa;")
	public static Class9 method1561(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Interface2 arg3) {
		if (!Static453.method6919()) {
			throw new RuntimeException("");
		} else if (Static234.method4121("jaggl")) {
			@Pc(31) OpenGL local31 = new OpenGL();
			@Pc(41) long local41 = local31.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local41 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(62) Class9_Sub3_Sub2 local62 = new Class9_Sub3_Sub2(local31, arg2, local41, arg3, arg1, arg0);
			local62.method5588();
			return local62;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIILclient!oa;ILclient!ba;IILclient!am;IIII)Lclient!ba;")
	public static Class23 method1562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class23 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class16 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(31) int local31 = 2055;
		if (arg10 != null) {
			local31 = arg10.method645(arg6, false, -1) | 0x807;
			local31 &= 0xFFFFFDFF;
		}
		@Pc(68) long local68 = (long) ((arg4 << 16) + arg3 + (arg12 << 24)) + ((long) arg1 << 32) + ((long) arg8 << 48);
		@Pc(70) Class245 local70 = Static551.aClass245_66;
		@Pc(78) Class23 local78;
		synchronized (Static551.aClass245_66) {
			local78 = (Class23) Static551.aClass245_66.method6082(local68);
		}
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(182) int local182;
		@Pc(186) int local186;
		if (local78 == null || arg5.method5468(local78.h(), local31) != 0) {
			if (local78 != null) {
				local31 = arg5.method5416(local31, local78.h());
			}
			@Pc(114) byte local114;
			if (arg3 == 1) {
				local114 = 9;
			} else if (arg3 == 2) {
				local114 = 12;
			} else if (arg3 == 3) {
				local114 = 15;
			} else if (arg3 == 4) {
				local114 = 18;
			} else {
				local114 = 21;
			}
			@Pc(146) int[] local146 = new int[] { 64, 96, 128 };
			@Pc(163) Class260 local163 = new Class260(local114 * 3 + 1, local114 * 2 * 3 - local114, 0);
			local170 = local163.method6431(0, 0, 0);
			@Pc(174) int[][] local174 = new int[3][local114];
			@Pc(188) int local188;
			@Pc(212) int local212;
			for (local176 = 0; local176 < 3; local176++) {
				local182 = local146[local176];
				local186 = local146[local176];
				for (local188 = 0; local188 < local114; local188++) {
					@Pc(196) int local196 = (local188 << 14) / local114;
					@Pc(204) int local204 = Class179.anIntArray756[local196] * local182 >> 14;
					local212 = local186 * Class179.anIntArray757[local196] >> 14;
					local174[local176][local188] = local163.method6431(local212, 0, local204);
				}
			}
			for (local182 = 0; local182 < 3; local182++) {
				local186 = (local182 * 256 + 128) / 3;
				local188 = 256 - local186;
				@Pc(258) byte local258 = (byte) (local186 * arg12 + local188 * arg4 >> 8);
				@Pc(303) short local303 = (short) ((local186 * (arg8 & 0x7F) + (arg1 & 0x7F) * local188 & 0x7F00) + (local186 * (arg8 & 0xFC00) + (arg1 & 0xFC00) * local188 & 0xFC0000) + (local188 * (arg1 & 0x380) + local186 * (arg8 & 0x380) & 0x38000) >> 8);
				for (local212 = 0; local212 < local114; local212++) {
					if (local182 == 0) {
						local163.method6428(local174[0][local212], (short) -1, (byte) -1, local174[0][(local212 + 1) % local114], local303, local258, local170, (byte) 1);
					} else {
						local163.method6428(local174[local182][(local212 + 1) % local114], (short) -1, (byte) -1, local174[local182 - 1][(local212 + 1) % local114], local303, local258, local174[local182 - 1][local212], (byte) 1);
						local163.method6428(local174[local182][local212], (short) -1, (byte) -1, local174[local182][(local212 + 1) % local114], local303, local258, local174[local182 - 1][local212], (byte) 1);
					}
				}
			}
			local78 = arg5.method5404(local163, local31, Static64.anInt1536, 64, 768);
			@Pc(426) Class245 local426 = Static551.aClass245_66;
			synchronized (Static551.aClass245_66) {
				Static551.aClass245_66.method6075(local78, local68);
			}
		}
		@Pc(445) int local445 = (arg3 << 8) - 1;
		@Pc(448) int local448 = -local445;
		@Pc(451) int local451 = -local445;
		@Pc(453) int local453 = local445;
		local170 = local445;
		if (arg13 != 0) {
			if ((arg13 & 0x4) != 0) {
				local453 = local445 + 512;
			}
			if ((arg13 & 0x2) != 0) {
				local451 -= 512;
			}
			if ((arg13 & 0x1) != 0) {
				local170 = local445 + 512;
			}
			if ((arg13 & 0x8) != 0) {
				local448 -= 512;
			}
		}
		@Pc(486) int local486 = arg7.ha();
		local176 = arg7.M();
		local182 = arg7.LA();
		if (local448 > local486) {
			local486 = local448;
		}
		if (local451 > local182) {
			local182 = local451;
		}
		if (local453 < local176) {
			local176 = local453;
		}
		local186 = arg7.K();
		if (local186 > local170) {
			local186 = local170;
		}
		@Pc(525) Class6_Sub4_Sub15 local525 = null;
		if (arg10 != null) {
			@Pc(532) int local532 = arg10.anIntArray47[arg6];
			local525 = Static114.aClass156_2.method4108(local532 >> 16);
			arg6 = local532 & 0xFFFF;
		}
		if (local525 == null) {
			local78 = local78.method7068((byte) 3, local31, true);
			local78.l(local176 - local486 >> 1, 128, local186 - local182 >> 1);
			local78.m(local176 + local486 >> 1, 0, local186 + local182 >> 1);
		} else {
			local78 = local78.method7068((byte) 3, local31, true);
			local78.l(local176 - local486 >> 1, 128, local186 - local182 >> 1);
			local78.m(local176 + local486 >> 1, 0, local186 + local182 >> 1);
			local78.method7079(local525, arg6);
		}
		if (arg2 != 0) {
			local78.AA(arg2);
		}
		if (arg11 != 0) {
			local78.v(arg11);
		}
		if (arg0 != 0) {
			local78.m(0, arg0, 0);
		}
		return local78;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public static void method1563() {
		Static342.method5387(false);
		if (Static92.anInt9035 >= 0 && Static92.anInt9035 != 0) {
			Static419.method6517(Static92.anInt9035);
			Static92.anInt9035 = -1;
		}
	}
}
