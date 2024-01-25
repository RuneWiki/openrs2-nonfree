import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array19;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	public static int anInt5647 = 0;

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
	public static int anInt5651 = 0;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4881(@OriginalArg(1) String arg0) {
		Static310.method5136("", "", 0, 0, arg0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIILclient!lp;I)Ljava/awt/Frame;")
	public static Frame method4882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class182 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4800()) {
			return null;
		}
		@Pc(18) Class294[] local18 = Static163.method3253(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (local18[local26].anInt8420 == arg1 && arg3 == local18[local26].anInt8416 && (!local24 || local18[local26].anInt8412 > arg0)) {
				arg0 = local18[local26].anInt8412;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(103) Class243 local103 = arg2.method4812(arg1, arg3, arg0);
		while (local103.anInt6905 == 0) {
			Static505.method7295(10L);
		}
		@Pc(114) Frame local114 = (Frame) local103.anObject12;
		if (local114 == null) {
			return null;
		} else if (local103.anInt6905 == 2) {
			Static488.method7067(local114, arg2);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(FFIIIIIF[FIIII)V")
	public static void method4883(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg5;
		@Pc(14) int local14 = arg10 - arg2;
		@Pc(18) int local18 = arg4 - arg8;
		@Pc(43) float local43 = (float) local14 * arg7[2] + arg7[0] * (float) local5 + arg7[1] * (float) local18;
		@Pc(64) float local64 = (float) local14 * arg7[5] + arg7[4] * (float) local18 + arg7[3] * (float) local5;
		@Pc(85) float local85 = (float) local5 * arg7[6] + arg7[7] * (float) local18 + arg7[8] * (float) local14;
		@Pc(96) float local96;
		@Pc(102) float local102;
		if (arg11 == 0) {
			local96 = arg0 + local43 + 0.5F;
			local102 = arg6 + 0.5F - local85;
		} else if (arg11 == 1) {
			local96 = local43 + arg0 + 0.5F;
			local102 = local85 + arg6 + 0.5F;
		} else if (arg11 == 2) {
			local96 = arg0 + 0.5F - local43;
			local102 = arg1 + 0.5F - local64;
		} else if (arg11 == 3) {
			local102 = arg1 + 0.5F - local64;
			local96 = local43 + arg0 + 0.5F;
		} else if (arg11 == 4) {
			local96 = arg6 + local85 + 0.5F;
			local102 = arg1 + 0.5F - local64;
		} else {
			local96 = arg6 + 0.5F - local85;
			local102 = arg1 + 0.5F - local64;
		}
		@Pc(205) float local205;
		if (arg9 == 1) {
			local205 = local96;
			local96 = -local102;
			local102 = local205;
		} else if (arg9 == 2) {
			local96 = -local96;
			local102 = -local102;
		} else if (arg9 == 3) {
			local205 = local96;
			local96 = local102;
			local102 = -local205;
		}
		Static30.aFloat51 = local96;
		Static356.aFloat127 = local102;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!gba;I)V")
	public static void method4884(@OriginalArg(0) Class1_Sub13_Sub2 arg0) {
		arg0.method3086();
		@Pc(8) int local8 = Static150.anInt3353;
		@Pc(18) Class47_Sub2_Sub3_Sub2 local18 = Static16.aClass47_Sub2_Sub3_Sub2_1 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local8] = new Class47_Sub2_Sub3_Sub2();
		local18.anInt5045 = local8;
		@Pc(26) int local26 = arg0.method3087(30);
		@Pc(31) byte local31 = (byte) (local26 >> 28);
		@Pc(37) int local37 = local26 >> 14 & 0x3FFF;
		@Pc(41) int local41 = local26 & 0x3FFF;
		local18.anIntArray362[0] = local37 - Static324.anInt6132;
		local18.anInt8189 = (local18.anIntArray362[0] << 7) + (local18.method4350() << 6);
		local18.anIntArray361[0] = local41 - Static517.anInt8716;
		local18.anInt8191 = (local18.anIntArray361[0] << 7) + (local18.method4350() << 6);
		Static245.anInt4747 = local18.aByte94 = local31;
		if (Static133.aClass1_Sub13Array1[local8] != null) {
			local18.method4376(Static133.aClass1_Sub13Array1[local8]);
		}
		Static412.anInt7191 = 0;
		Static349.anIntArray479[Static412.anInt7191++] = local8;
		Static38.aByteArray14[local8] = 0;
		Static457.anInt7806 = 0;
		for (@Pc(118) int local118 = 1; local118 < 2048; local118++) {
			if (local118 != local8) {
				@Pc(127) int local127 = arg0.method3087(18);
				@Pc(131) int local131 = local127 >> 16;
				@Pc(137) int local137 = local127 >> 8 & 0xFF;
				@Pc(141) int local141 = local127 & 0xFF;
				@Pc(149) Class159 local149 = Static351.aClass159Array1[local118] = new Class159();
				local149.aBoolean289 = false;
				local149.anInt4751 = -1;
				local149.anInt4753 = 0;
				local149.anInt4756 = (local131 << 28) + (local137 << 14) + local141;
				Static430.anIntArray587[Static457.anInt7806++] = local118;
				Static38.aByteArray14[local118] = 0;
			}
		}
		arg0.method3091();
	}
}
