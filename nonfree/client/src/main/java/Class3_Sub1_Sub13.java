import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "[I")
	private final int[] anIntArray361;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "[I")
	private final int[] anIntArray360;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "Lclient!uu;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "Lclient!uu;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Lclient!uu;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "[Lclient!uu;")
	private final Class3_Sub2[] aClass3_Sub2Array21;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub13() {
		this.anIntArray361 = new int[0];
		this.anIntArray360 = new int[0];
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub14(0);
		this.aClass3_Sub2_2.anInt10146 = 1;
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub14();
		this.aClass3_Sub2_3.anInt10146 = 1;
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub14();
		this.aClass3_Sub2_1.anInt10146 = 1;
		this.aClass3_Sub2Array21 = new Class3_Sub2[] { this.aClass3_Sub2_3, this.aClass3_Sub2_1, this.aClass3_Sub2_2 };
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!tn;)V")
	public Class3_Sub1_Sub13(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method8401();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub2Array21 = new Class3_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static567.method7979(arg0);
			if (local26.method8338() >= 0) {
				local9++;
			}
			if (local26.method8329() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass3_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method8401();
			}
			this.aClass3_Sub2Array21[local20] = local26;
		}
		this.anIntArray360 = new int[local9];
		local9 = 0;
		this.anIntArray361 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class3_Sub2 local95 = this.aClass3_Sub2Array21[local88];
			local47 = local95.aClass3_Sub2Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass3_Sub2Array42[local101] = this.aClass3_Sub2Array21[local14[local88][local101]];
			}
			@Pc(123) int local123 = local95.method8338();
			@Pc(127) int local127 = local95.method8329();
			if (local123 > 0) {
				this.anIntArray360[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray361[local11++] = local127;
			}
			local14[local88] = null;
		}
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array21[arg0.method8401()];
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array21[arg0.method8401()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array21[arg0.method8401()];
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZIILclient!d;DILclient!kha;)[I")
	public int[] method5170(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class181 arg5) {
		Static506.aClass181_103 = arg5;
		Static226.anInterface5_8 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array21.length; local11++) {
			this.aClass3_Sub2Array21[local11].method8333(arg4, arg1);
		}
		Static427.method6574(arg3);
		Static262.method4869(arg1, arg4);
		@Pc(45) int[] local45 = new int[arg1 * arg4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg4; local49++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			if (this.aClass3_Sub2_3.aBoolean855) {
				local93 = this.aClass3_Sub2_3.method8336(local49);
				local85 = local93;
				local77 = local93;
				local81 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass3_Sub2_3.method8331(local49);
				local77 = local73[1];
				local81 = local73[0];
				local85 = local73[2];
			}
			if (this.aClass3_Sub2_1.aBoolean855) {
				local93 = this.aClass3_Sub2_1.method8336(local49);
			} else {
				local93 = this.aClass3_Sub2_1.method8331(local49)[0];
			}
			if (arg0) {
				local47 = local49;
			}
			for (@Pc(127) int local127 = arg1 - 1; local127 >= 0; local127--) {
				@Pc(135) int local135 = local81[local127] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(153) int local153 = local77[local127] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				@Pc(168) int local168 = local85[local127] >> 4;
				if (local168 > 255) {
					local168 = 255;
				}
				local135 = Static285.anIntArray345[local135];
				if (local168 < 0) {
					local168 = 0;
				}
				local153 = Static285.anIntArray345[local153];
				local168 = Static285.anIntArray345[local168];
				@Pc(202) int local202;
				if (local135 == 0 && local153 == 0 && local168 == 0) {
					local202 = 0;
				} else {
					local202 = local93[local127] >> 4;
					if (local202 > 255) {
						local202 = 255;
					}
					if (local202 < 0) {
						local202 = 0;
					}
				}
				local45[local47++] = local168 + (local135 << 16) + (local202 << 24) + (local153 << 8);
				if (arg0) {
					local47 += arg1 - 1;
				}
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.aClass3_Sub2Array21.length; local263++) {
			this.aClass3_Sub2Array21[local263].method8339();
		}
		return local45;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!d;Lclient!kha;)Z")
	public boolean method5172(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(9) int local9;
		if (Static274.anInt5832 < 0) {
			for (local9 = 0; local9 < this.anIntArray360.length; local9++) {
				if (!arg1.method5040(this.anIntArray360[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray360.length; local9++) {
				if (!arg1.method5024(this.anIntArray360[local9], Static274.anInt5832)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray361.length; local9++) {
			if (!arg0.method6867(this.anIntArray361[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZIBLclient!d;Lclient!kha;ID)[I")
	public int[] method5173(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) Class181 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) double arg6) {
		Static506.aClass181_103 = arg4;
		Static226.anInterface5_8 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array21.length; local11++) {
			this.aClass3_Sub2Array21[local11].method8333(arg5, arg2);
		}
		Static427.method6574(arg6);
		Static262.method4869(arg2, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg2];
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(43) byte local43;
		if (arg0) {
			local43 = -1;
			local47 = arg2 - 1;
			local49 = -1;
		} else {
			local49 = arg2;
			local43 = 1;
			local47 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
			@Pc(75) int[] local75;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			if (this.aClass3_Sub2_3.aBoolean855) {
				@Pc(73) int[] local73 = this.aClass3_Sub2_3.method8336(local61);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass3_Sub2_3.method8331(local61);
				local77 = local87[1];
				local79 = local87[2];
				local75 = local87[0];
			}
			if (arg1) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local47; local105 != local49; local105 += local43) {
				@Pc(113) int local113 = local75[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(130) int local130 = local77[local105] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(145) int local145 = local79[local105] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				local130 = Static285.anIntArray345[local130];
				if (local145 < 0) {
					local145 = 0;
				}
				local113 = Static285.anIntArray345[local113];
				local145 = Static285.anIntArray345[local145];
				@Pc(180) int local180 = (local113 << 16) + (local130 << 8) + local145;
				if (local180 != 0) {
					local180 |= 0xFF000000;
				}
				local39[local59++] = local180;
				if (arg1) {
					local59 += arg2 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass3_Sub2Array21.length; local229++) {
			this.aClass3_Sub2Array21[local229].method8339();
		}
		return local39;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!d;IZILclient!kha;Z)[F")
	public float[] method5174(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) boolean arg4) {
		Static226.anInterface5_8 = arg0;
		Static506.aClass181_103 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array21.length; local11++) {
			this.aClass3_Sub2Array21[local11].method8333(arg2, arg1);
		}
		Static262.method4869(arg1, arg2);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg1];
		@Pc(44) int local44 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
			@Pc(65) int[] local65;
			@Pc(67) int[] local67;
			@Pc(69) int[] local69;
			if (this.aClass3_Sub2_3.aBoolean855) {
				@Pc(63) int[] local63 = this.aClass3_Sub2_3.method8336(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass3_Sub2_3.method8331(local51);
				local69 = local77[2];
				local65 = local77[0];
				local67 = local77[1];
			}
			@Pc(99) int[] local99;
			if (this.aClass3_Sub2_1.aBoolean855) {
				local99 = this.aClass3_Sub2_1.method8336(local51);
			} else {
				local99 = this.aClass3_Sub2_1.method8331(local51)[0];
			}
			@Pc(119) int[] local119;
			if (this.aClass3_Sub2_2.aBoolean855) {
				local119 = this.aClass3_Sub2_2.method8336(local51);
			} else {
				local119 = this.aClass3_Sub2_2.method8331(local51)[0];
			}
			if (arg4) {
				local44 = local51 << 2;
			}
			for (@Pc(139) int local139 = arg1 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local119[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local42[local44++] = (float) local65[local139] * local161;
				local42[local44++] = (float) local67[local139] * local161;
				local42[local44++] = local161 * (float) local69[local139];
				local42[local44++] = local148;
				if (arg4) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass3_Sub2Array21.length; local233++) {
			this.aClass3_Sub2Array21[local233].method8339();
		}
		return local42;
	}
}
