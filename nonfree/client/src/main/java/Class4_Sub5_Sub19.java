import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class4_Sub5_Sub19 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
	private final int[] anIntArray525;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
	private final int[] anIntArray527;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!mba;")
	private final Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!mba;")
	private final Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "Lclient!mba;")
	private final Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[Lclient!mba;")
	private final Class4_Sub1[] aClass4_Sub1Array38;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	private Class4_Sub5_Sub19() {
		this.anIntArray525 = new int[0];
		this.anIntArray527 = new int[0];
		this.aClass4_Sub1_1 = new Class4_Sub1_Sub31(0);
		this.aClass4_Sub1_1.anInt10269 = 1;
		this.aClass4_Sub1_3 = new Class4_Sub1_Sub31();
		this.aClass4_Sub1_3.anInt10269 = 1;
		this.aClass4_Sub1_2 = new Class4_Sub1_Sub31();
		this.aClass4_Sub1_2.anInt10269 = 1;
		this.aClass4_Sub1Array38 = new Class4_Sub1[] { this.aClass4_Sub1_3, this.aClass4_Sub1_2, this.aClass4_Sub1_1 };
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!un;)V")
	public Class4_Sub5_Sub19(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method4905();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub1Array38 = new Class4_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub1 local26 = Static209.method3504(arg0);
			if (local26.method8390() >= 0) {
				local9++;
			}
			if (local26.method8383() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass4_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method4905();
			}
			this.aClass4_Sub1Array38[local20] = local26;
		}
		this.anIntArray525 = new int[local9];
		this.anIntArray527 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class4_Sub1 local98 = this.aClass4_Sub1Array38[local91];
			local50 = local98.aClass4_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass4_Sub1Array42[local104] = this.aClass4_Sub1Array38[local14[local91][local104]];
			}
			@Pc(126) int local126 = local98.method8390();
			@Pc(130) int local130 = local98.method8383();
			if (local126 > 0) {
				this.anIntArray525[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray527[local11++] = local130;
			}
			local14[local91] = null;
		}
		this.aClass4_Sub1_3 = this.aClass4_Sub1Array38[arg0.method4905()];
		this.aClass4_Sub1_2 = this.aClass4_Sub1Array38[arg0.method4905()];
		this.aClass4_Sub1_1 = this.aClass4_Sub1Array38[arg0.method4905()];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!fa;Lclient!jn;)Z")
	public boolean method8018(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) Class176 arg1) {
		@Pc(18) int local18;
		if (Static117.anInt2698 >= 0) {
			for (local18 = 0; local18 < this.anIntArray525.length; local18++) {
				if (!arg1.method3977(Static117.anInt2698, this.anIntArray525[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray525.length; local18++) {
				if (!arg1.method3996(this.anIntArray525[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray527.length; local18++) {
			if (!arg0.method7407(this.anIntArray527[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fa;ILclient!jn;IIZ)[F")
	public float[] method8021(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static334.anInterface11_12 = arg0;
		Static12.aClass176_7 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub1Array38.length; local11++) {
			this.aClass4_Sub1Array38[local11].method8387(arg1, arg3);
		}
		Static419.method6557(arg1, arg3);
		@Pc(42) float[] local42 = new float[arg3 * arg1 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(70) int[] local70;
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			if (this.aClass4_Sub1_3.aBoolean726) {
				@Pc(78) int[] local78 = this.aClass4_Sub1_3.method8384(local46);
				local66 = local78;
				local62 = local78;
				local70 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass4_Sub1_3.method8388(local46);
				local62 = local58[1];
				local66 = local58[2];
				local70 = local58[0];
			}
			@Pc(94) int[] local94;
			if (this.aClass4_Sub1_2.aBoolean726) {
				local94 = this.aClass4_Sub1_2.method8384(local46);
			} else {
				local94 = this.aClass4_Sub1_2.method8388(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			@Pc(120) int[] local120;
			if (this.aClass4_Sub1_1.aBoolean726) {
				local120 = this.aClass4_Sub1_1.method8384(local46);
			} else {
				local120 = this.aClass4_Sub1_1.method8388(local46)[0];
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local120[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local42[local44++] = (float) local70[local134] * local156;
				local42[local44++] = local156 * (float) local62[local134];
				local42[local44++] = (float) local66[local134] * local156;
				local42[local44++] = local143;
				if (arg4) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass4_Sub1Array38.length; local233++) {
			this.aClass4_Sub1Array38[local233].method8386();
		}
		return local42;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(DLclient!fa;ZILclient!jn;ZI)[I")
	public int[] method8023(@OriginalArg(0) double arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class176 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static334.anInterface11_12 = arg1;
		Static12.aClass176_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub1Array38.length; local11++) {
			this.aClass4_Sub1Array38[local11].method8387(arg2, arg5);
		}
		Static464.method7048(arg0);
		Static419.method6557(arg2, arg5);
		@Pc(41) int[] local41 = new int[arg2 * 4 * arg5];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg5; local45++) {
			@Pc(61) int[] local61;
			@Pc(69) int[] local69;
			@Pc(65) int[] local65;
			@Pc(77) int[] local77;
			if (this.aClass4_Sub1_3.aBoolean726) {
				local77 = this.aClass4_Sub1_3.method8384(local45);
				local61 = local77;
				local65 = local77;
				local69 = local77;
			} else {
				@Pc(57) int[][] local57 = this.aClass4_Sub1_3.method8388(local45);
				local61 = local57[0];
				local65 = local57[2];
				local69 = local57[1];
			}
			if (arg4) {
				local43 = local45;
			}
			if (this.aClass4_Sub1_2.aBoolean726) {
				local77 = this.aClass4_Sub1_2.method8384(local45);
			} else {
				local77 = this.aClass4_Sub1_2.method8388(local45)[0];
			}
			for (@Pc(111) int local111 = arg2 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local61[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local69[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(152) int local152 = local65[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				local137 = Static429.anIntArray422[local137];
				local119 = Static429.anIntArray422[local119];
				local152 = Static429.anIntArray422[local152];
				@Pc(186) int local186;
				if (local119 == 0 && local137 == 0 && local152 == 0) {
					local186 = 0;
				} else {
					local186 = local77[local111] >> 4;
					if (local186 > 255) {
						local186 = 255;
					}
					if (local186 < 0) {
						local186 = 0;
					}
				}
				local41[local43++] = local152 + (local186 << 24) + (local119 << 16) + (local137 << 8);
				if (arg4) {
					local43 += arg2 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass4_Sub1Array38.length; local249++) {
			this.aClass4_Sub1Array38[local249].method8386();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!jn;ZDZLclient!fa;II)[I")
	public int[] method8024(@OriginalArg(1) Class176 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface11 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static12.aClass176_7 = arg0;
		Static334.anInterface11_12 = arg4;
		for (@Pc(16) int local16 = 0; local16 < this.aClass4_Sub1Array38.length; local16++) {
			this.aClass4_Sub1Array38[local16].method8387(arg6, arg5);
		}
		Static464.method7048(arg2);
		Static419.method6557(arg6, arg5);
		@Pc(44) int[] local44 = new int[arg6 * arg5];
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(54) byte local54;
		if (arg3) {
			local48 = -1;
			local52 = arg6 - 1;
			local54 = -1;
		} else {
			local52 = 0;
			local48 = arg6;
			local54 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
			if (arg1) {
				local64 = local66;
			}
			@Pc(88) int[] local88;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass4_Sub1_3.aBoolean726) {
				@Pc(104) int[] local104 = this.aClass4_Sub1_3.method8384(local66);
				local92 = local104;
				local88 = local104;
				local96 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass4_Sub1_3.method8388(local66);
				local88 = local84[0];
				local92 = local84[2];
				local96 = local84[1];
			}
			for (@Pc(112) int local112 = local52; local112 != local48; local112 += local54) {
				@Pc(120) int local120 = local88[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(138) int local138 = local96[local112] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(158) int local158 = local92[local112] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local120 = Static429.anIntArray422[local120];
				local138 = Static429.anIntArray422[local138];
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static429.anIntArray422[local158];
				@Pc(189) int local189 = (local138 << 8) + (local120 << 16) + local158;
				if (local189 != 0) {
					local189 |= 0xFF000000;
				}
				local44[local64++] = local189;
				if (arg1) {
					local64 += arg6 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass4_Sub1Array38.length; local224++) {
			this.aClass4_Sub1Array38[local224].method8386();
		}
		return local44;
	}
}
