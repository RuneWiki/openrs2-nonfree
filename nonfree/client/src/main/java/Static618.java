import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B)[B")
	public static byte[] method8504(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static695.method5648(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
	public static void method8506() {
		if (Static174.aString38.toLowerCase().indexOf("microsoft") != -1) {
			Static614.anIntArray637[187] = 27;
			Static614.anIntArray637[222] = 59;
			Static614.anIntArray637[191] = 73;
			Static614.anIntArray637[221] = 43;
			Static614.anIntArray637[220] = 74;
			Static614.anIntArray637[219] = 42;
			Static614.anIntArray637[223] = 28;
			Static614.anIntArray637[192] = 58;
			Static614.anIntArray637[186] = 57;
			Static614.anIntArray637[188] = 71;
			Static614.anIntArray637[189] = 26;
			Static614.anIntArray637[190] = 72;
			return;
		}
		Static614.anIntArray637[47] = 73;
		Static614.anIntArray637[45] = 26;
		Static614.anIntArray637[93] = 43;
		Static614.anIntArray637[46] = 72;
		Static614.anIntArray637[92] = 74;
		if (Static174.aMethod1 == null) {
			Static614.anIntArray637[222] = 59;
			Static614.anIntArray637[192] = 58;
		} else {
			Static614.anIntArray637[520] = 59;
			Static614.anIntArray637[192] = 28;
			Static614.anIntArray637[222] = 58;
		}
		Static614.anIntArray637[59] = 57;
		Static614.anIntArray637[91] = 42;
		Static614.anIntArray637[61] = 27;
		Static614.anIntArray637[44] = 71;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
	public static void method8508() {
		Static533.method7640();
		Static194.method3669(Static687.aClass6_Sub44_33.aClass7_Sub15_1.method4771() == 1);
		Static240.aClass150_2 = Static620.method8526(Static651.aClass122_38, Static4.aCanvas1, 22050, 0);
		Static638.method8616(Static462.method7026((Class6_Sub17_Sub4) null));
		Static35.aClass150_1 = Static620.method8526(Static651.aClass122_38, Static4.aCanvas1, 2048, 1);
		Static35.aClass150_1.method5493(Static544.aClass6_Sub17_Sub3_2);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;IB)V")
	public static void method8509(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (!Static519.aBoolean664 || !Static26.aBoolean26) {
			Static141.anInt8738 = 0;
			return;
		}
		if (Static271.aBoolean382) {
			Static53.aLong34 = Static123.aClass114_1.method6117();
		}
		Static512.anInt8472 = 0;
		Static407.anInt7099 = 0;
		Static188.anInt3782 = 0;
		@Pc(37) int[] local37 = arg0.Y();
		Static547.anInt8867 = (int) ((float) local37[3] / 3.0F);
		Static591.anInt9401 = (int) ((float) local37[2] / 3.0F);
		arg0.method6669(Static74.anIntArray75);
		if (Static3.anInt17 != (int) ((float) Static74.anIntArray75[0] / 3.0F) || (int) ((float) Static74.anIntArray75[1] / 3.0F) != Static487.anInt10362) {
			Static3.anInt17 = (int) ((float) Static74.anIntArray75[0] / 3.0F);
			Static487.anInt10362 = (int) ((float) Static74.anIntArray75[1] / 3.0F);
			Static243.anInt4674 = Static3.anInt17 >> 1;
			Static173.anInt3556 = Static487.anInt10362 >> 1;
			Static251.anIntArray252 = new int[Static487.anInt10362 * Static3.anInt17];
		}
		Static399.aClass109_6 = arg0.method6636();
		Static141.anInt8738 = 0;
		for (@Pc(118) int local118 = 0; local118 < Static318.anInt5491; local118++) {
			Static42.method534(Static15.aClass230Array1[local118], arg1, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < Static496.anInt8367; local139++) {
			Static42.method534(Static91.aClass230Array2[local139], arg1, arg0);
		}
		for (@Pc(160) int local160 = 0; local160 < Static373.anInt6284; local160++) {
			Static42.method534(Static329.aClass230Array4[local160], arg1, arg0);
		}
		Static14.anInt211 = 0;
		if (Static141.anInt8738 > 0) {
			@Pc(190) int local190 = Static251.anIntArray252.length;
			@Pc(197) int local197 = local190 - local190 & 0x7;
			@Pc(199) int local199 = 0;
			while (local197 > local199) {
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
			}
			while (local199 < local190) {
				Static251.anIntArray252[local199++] = Integer.MAX_VALUE;
			}
			Static559.anInt9035 = 1;
			for (@Pc(274) int local274 = 0; local274 < Static141.anInt8738; local274++) {
				@Pc(280) Class230 local280 = Static322.aClass230Array3[local274];
				Static425.method6506(local280.aShortArray57[3], local280.aShortArray57[0], local280.aShortArray58[0], local280.aShortArray58[3], local280.aShortArray56[3], local280.aShortArray58[1], local280.aShortArray57[1], local280.aShortArray56[1], local280.aShortArray56[0]);
				Static425.method6506(local280.aShortArray57[3], local280.aShortArray57[1], local280.aShortArray58[1], local280.aShortArray58[3], local280.aShortArray56[3], local280.aShortArray58[2], local280.aShortArray57[2], local280.aShortArray56[2], local280.aShortArray56[1]);
			}
			Static559.anInt9035 = 2;
		}
		if (Static271.aBoolean382) {
			Static258.aLong155 = Static123.aClass114_1.method6117() - Static53.aLong34;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public static void method8512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static165.method3262(local7.aClass60_Sub1_Sub2_1);
			if (local7.aClass60_Sub1_Sub2_1 != null) {
				local7.aClass60_Sub1_Sub2_1 = null;
			}
		}
	}
}
