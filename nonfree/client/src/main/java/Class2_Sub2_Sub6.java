import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
	private final int[] anIntArray101;

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "[I")
	private final int[] anIntArray102;

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "Lclient!qk;")
	private final Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!dn", name = "L", descriptor = "Lclient!qk;")
	private final Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "Lclient!qk;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[Lclient!qk;")
	private final Class2_Sub1[] aClass2_Sub1Array9;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub6() {
		this.anIntArray101 = new int[0];
		this.anIntArray102 = new int[0];
		this.aClass2_Sub1_2 = new Class2_Sub1_Sub12(0);
		this.aClass2_Sub1_2.anInt7781 = 1;
		this.aClass2_Sub1_3 = new Class2_Sub1_Sub12();
		this.aClass2_Sub1_3.anInt7781 = 1;
		this.aClass2_Sub1_1 = new Class2_Sub1_Sub12();
		this.aClass2_Sub1Array9 = new Class2_Sub1[] { this.aClass2_Sub1_3, this.aClass2_Sub1_1, this.aClass2_Sub1_2 };
		this.aClass2_Sub1_1.anInt7781 = 1;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class2_Sub2_Sub6(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method3737();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub1Array9 = new Class2_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub1 local26 = Static211.method3262(arg0);
			if (local26.method6028() >= 0) {
				local9++;
			}
			if (local26.method6029() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3737();
			}
			this.aClass2_Sub1Array9[local20] = local26;
		}
		this.anIntArray102 = new int[local9];
		local9 = 0;
		this.anIntArray101 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub1 local102 = this.aClass2_Sub1Array9[local95];
			local50 = local102.aClass2_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub1Array42[local108] = this.aClass2_Sub1Array9[local18[local95][local108]];
			}
			@Pc(134) int local134 = local102.method6028();
			@Pc(138) int local138 = local102.method6029();
			if (local134 > 0) {
				this.anIntArray102[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray101[local11++] = local138;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub1_3 = this.aClass2_Sub1Array9[arg0.method3737()];
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array9[arg0.method3737()];
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array9[arg0.method3737()];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!pc;Lclient!m;I)Z")
	public boolean method1380(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(14) int local14;
		if (Static313.anInt5470 >= 0) {
			for (local14 = 0; local14 < this.anIntArray102.length; local14++) {
				if (!arg0.method4298(this.anIntArray102[local14], Static313.anInt5470)) {
					return false;
				}
			}
		} else {
			for (local14 = 0; local14 < this.anIntArray102.length; local14++) {
				if (!arg0.method4296(this.anIntArray102[local14])) {
					return false;
				}
			}
		}
		for (local14 = 0; local14 < this.anIntArray101.length; local14++) {
			if (!arg1.method3835(this.anIntArray101[local14])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!pc;IZLclient!m;IZBD)[I")
	public int[] method1384(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) double arg6) {
		Static156.aClass188_44 = arg0;
		Static204.anInterface8_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub1Array9.length; local11++) {
			this.aClass2_Sub1Array9[local11].method6030(arg1, arg4);
		}
		Static447.method3799(arg6);
		Static447.method3797(arg4, arg1);
		@Pc(43) int[] local43 = new int[arg4 * arg1];
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg2) {
			local47 = -1;
			local49 = -1;
			local53 = arg4 - 1;
		} else {
			local53 = 0;
			local47 = 1;
			local49 = arg4;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg1; local65++) {
			if (arg5) {
				local63 = local65;
			}
			@Pc(89) int[] local89;
			@Pc(93) int[] local93;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub1_3.aBoolean665) {
				@Pc(101) int[] local101 = this.aClass2_Sub1_3.method6032(local65);
				local93 = local101;
				local85 = local101;
				local89 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass2_Sub1_3.method6033(local65);
				local85 = local81[2];
				local89 = local81[0];
				local93 = local81[1];
			}
			for (@Pc(109) int local109 = local53; local109 != local49; local109 += local47) {
				@Pc(117) int local117 = local89[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local93[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(149) int local149 = local85[local109] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				local132 = Static379.anIntArray449[local132];
				if (local149 < 0) {
					local149 = 0;
				}
				local117 = Static379.anIntArray449[local117];
				local149 = Static379.anIntArray449[local149];
				@Pc(185) int local185 = (local132 << 8) + (local117 << 16) + local149;
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local43[local63++] = local185;
				if (arg5) {
					local63 += arg4 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass2_Sub1Array9.length; local225++) {
			this.aClass2_Sub1Array9[local225].method6038();
		}
		return local43;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(DBLclient!pc;IZLclient!m;I)[I")
	public int[] method1385(@OriginalArg(0) double arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface8 arg4, @OriginalArg(6) int arg5) {
		Static204.anInterface8_7 = arg4;
		Static156.aClass188_44 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub1Array9.length; local11++) {
			this.aClass2_Sub1Array9[local11].method6030(arg2, arg5);
		}
		Static447.method3799(arg0);
		Static447.method3797(arg5, arg2);
		@Pc(45) int[] local45 = new int[arg5 * 4 * arg2];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg2; local49++) {
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(81) int[] local81;
			if (this.aClass2_Sub1_3.aBoolean665) {
				local81 = this.aClass2_Sub1_3.method6032(local49);
				local73 = local81;
				local69 = local81;
				local65 = local81;
			} else {
				@Pc(61) int[][] local61 = this.aClass2_Sub1_3.method6033(local49);
				local65 = local61[0];
				local69 = local61[1];
				local73 = local61[2];
			}
			if (arg3) {
				local47 = local49;
			}
			if (this.aClass2_Sub1_1.aBoolean665) {
				local81 = this.aClass2_Sub1_1.method6032(local49);
			} else {
				local81 = this.aClass2_Sub1_1.method6033(local49)[0];
			}
			for (@Pc(115) int local115 = arg5 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local65[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(140) int local140 = local69[local115] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(155) int local155 = local73[local115] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				local140 = Static379.anIntArray449[local140];
				local123 = Static379.anIntArray449[local123];
				local155 = Static379.anIntArray449[local155];
				@Pc(194) int local194;
				if (local123 == 0 && local140 == 0 && local155 == 0) {
					local194 = 0;
				} else {
					local194 = local81[local115] >> 4;
					if (local194 > 255) {
						local194 = 255;
					}
					if (local194 < 0) {
						local194 = 0;
					}
				}
				local45[local47++] = (local123 << 16) + ((local194 << 24) - (-(local140 << 8) - local155));
				if (arg3) {
					local47 += arg5 - 1;
				}
			}
		}
		for (@Pc(255) int local255 = 0; local255 < this.aClass2_Sub1Array9.length; local255++) {
			this.aClass2_Sub1Array9[local255].method6038();
		}
		return local45;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZILclient!pc;ILclient!m;I)[F")
	public float[] method1386(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface8 arg4) {
		Static156.aClass188_44 = arg2;
		Static204.anInterface8_7 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub1Array9.length; local11++) {
			this.aClass2_Sub1Array9[local11].method6030(arg3, arg1);
		}
		Static447.method3797(arg1, arg3);
		@Pc(40) float[] local40 = new float[arg3 * arg1 * 4];
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
			@Pc(58) int[] local58;
			@Pc(62) int[] local62;
			@Pc(60) int[] local60;
			if (this.aClass2_Sub1_3.aBoolean665) {
				@Pc(56) int[] local56 = this.aClass2_Sub1_3.method6032(local44);
				local58 = local56;
				local60 = local56;
				local62 = local56;
			} else {
				@Pc(70) int[][] local70 = this.aClass2_Sub1_3.method6033(local44);
				local62 = local70[1];
				local60 = local70[2];
				local58 = local70[0];
			}
			@Pc(92) int[] local92;
			if (this.aClass2_Sub1_1.aBoolean665) {
				local92 = this.aClass2_Sub1_1.method6032(local44);
			} else {
				local92 = this.aClass2_Sub1_1.method6033(local44)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass2_Sub1_2.aBoolean665) {
				local116 = this.aClass2_Sub1_2.method6032(local44);
			} else {
				local116 = this.aClass2_Sub1_2.method6033(local44)[0];
			}
			if (arg0) {
				local42 = local44 << 2;
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local92[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local116[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local40[local42++] = (float) local58[local134] * local170;
				local40[local42++] = local170 * (float) local62[local134];
				local40[local42++] = (float) local60[local134] * local170;
				local40[local42++] = local143;
				if (arg0) {
					local42 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass2_Sub1Array9.length; local231++) {
			this.aClass2_Sub1Array9[local231].method6038();
		}
		return local40;
	}
}
