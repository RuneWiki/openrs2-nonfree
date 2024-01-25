import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub5_Sub8 extends Class3_Sub5 {

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "[I")
	private final int[] anIntArray153;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "[I")
	private final int[] anIntArray152;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Lclient!pha;")
	private final Class3_Sub8 aClass3_Sub8_3;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!pha;")
	private final Class3_Sub8 aClass3_Sub8_2;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!pha;")
	private final Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lclient!pha;")
	private final Class3_Sub8[] aClass3_Sub8Array7;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class3_Sub5_Sub8() {
		this.anIntArray153 = new int[0];
		this.anIntArray152 = new int[0];
		this.aClass3_Sub8_3 = new Class3_Sub8_Sub32(0);
		this.aClass3_Sub8_3.anInt10703 = 1;
		this.aClass3_Sub8_2 = new Class3_Sub8_Sub32();
		this.aClass3_Sub8_2.anInt10703 = 1;
		this.aClass3_Sub8_1 = new Class3_Sub8_Sub32();
		this.aClass3_Sub8Array7 = new Class3_Sub8[] { this.aClass3_Sub8_2, this.aClass3_Sub8_1, this.aClass3_Sub8_3 };
		this.aClass3_Sub8_1.anInt10703 = 1;
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class3_Sub5_Sub8(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method7954();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub8Array7 = new Class3_Sub8[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub8 local26 = Static414.method5649(arg0);
			if (local26.method8782() >= 0) {
				local9++;
			}
			if (local26.method8775() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass3_Sub8Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method7954();
			}
			this.aClass3_Sub8Array7[local20] = local26;
		}
		this.anIntArray152 = new int[local9];
		local9 = 0;
		this.anIntArray153 = new int[local11];
		local11 = 0;
		for (@Pc(84) int local84 = 0; local84 < local7; local84++) {
			@Pc(91) Class3_Sub8 local91 = this.aClass3_Sub8Array7[local84];
			local47 = local91.aClass3_Sub8Array42.length;
			for (@Pc(97) int local97 = 0; local97 < local47; local97++) {
				local91.aClass3_Sub8Array42[local97] = this.aClass3_Sub8Array7[local14[local84][local97]];
			}
			@Pc(123) int local123 = local91.method8782();
			@Pc(127) int local127 = local91.method8775();
			if (local123 > 0) {
				this.anIntArray152[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray153[local11++] = local127;
			}
			local14[local84] = null;
		}
		this.aClass3_Sub8_2 = this.aClass3_Sub8Array7[arg0.method7954()];
		this.aClass3_Sub8_1 = this.aClass3_Sub8Array7[arg0.method7954()];
		this.aClass3_Sub8_3 = this.aClass3_Sub8Array7[arg0.method7954()];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIBILclient!uq;Lclient!d;)[F")
	public float[] method2495(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class362 arg3, @OriginalArg(5) Interface2 arg4) {
		Static473.anInterface2_9 = arg4;
		Static169.aClass362_36 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub8Array7.length; local11++) {
			this.aClass3_Sub8Array7[local11].method8778(arg1, arg2);
		}
		Static565.method7440(arg2, arg1);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg1];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			if (this.aClass3_Sub8_2.aBoolean737) {
				@Pc(78) int[] local78 = this.aClass3_Sub8_2.method8784(local46);
				local70 = local78;
				local66 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass3_Sub8_2.method8774(local46);
				local62 = local58[1];
				local66 = local58[0];
				local70 = local58[2];
			}
			@Pc(96) int[] local96;
			if (this.aClass3_Sub8_1.aBoolean737) {
				local96 = this.aClass3_Sub8_1.method8784(local46);
			} else {
				local96 = this.aClass3_Sub8_1.method8774(local46)[0];
			}
			@Pc(114) int[] local114;
			if (this.aClass3_Sub8_3.aBoolean737) {
				local114 = this.aClass3_Sub8_3.method8784(local46);
			} else {
				local114 = this.aClass3_Sub8_3.method8774(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg2 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local96[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local114[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local66[local134] * local170;
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = (float) local70[local134] * local170;
				local42[local44++] = local143;
				if (arg0) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass3_Sub8Array7.length; local231++) {
			this.aClass3_Sub8Array7[local231].method8777();
		}
		return local42;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!d;Lclient!uq;DZIZ)[I")
	public int[] method2496(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) double arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		Static169.aClass362_36 = arg2;
		Static473.anInterface2_9 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub8Array7.length; local11++) {
			this.aClass3_Sub8Array7[local11].method8778(arg5, arg0);
		}
		Static213.method3146(arg3);
		Static565.method7440(arg0, arg5);
		@Pc(43) int[] local43 = new int[arg0 * arg5];
		@Pc(45) int local45 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg5; local53++) {
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(69) int[] local69;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub8_2.aBoolean737) {
				local85 = this.aClass3_Sub8_2.method8784(local53);
				local73 = local85;
				local69 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass3_Sub8_2.method8774(local53);
				local69 = local65[2];
				local73 = local65[0];
				local77 = local65[1];
			}
			if (arg4) {
				local45 = local53;
			}
			if (this.aClass3_Sub8_1.aBoolean737) {
				local85 = this.aClass3_Sub8_1.method8784(local53);
			} else {
				local85 = this.aClass3_Sub8_1.method8774(local53)[0];
			}
			for (@Pc(119) int local119 = arg0 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local73[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(142) int local142 = local77[local119] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(159) int local159 = local69[local119] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local142 = Static356.anIntArray330[local142];
				if (local159 < 0) {
					local159 = 0;
				}
				local127 = Static356.anIntArray330[local127];
				local159 = Static356.anIntArray330[local159];
				@Pc(194) int local194;
				if (local127 == 0 && local142 == 0 && local159 == 0) {
					local194 = 0;
				} else {
					local194 = local85[local119] >> 4;
					if (local194 > 255) {
						local194 = 255;
					}
					if (local194 < 0) {
						local194 = 0;
					}
				}
				local43[local45++] = local159 + (local142 << 8) + (local194 << 24) + (local127 << 16);
				if (arg4) {
					local45 += arg0 - 1;
				}
			}
		}
		for (@Pc(250) int local250 = 0; local250 < this.aClass3_Sub8Array7.length; local250++) {
			this.aClass3_Sub8Array7[local250].method8777();
		}
		return local43;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!d;Lclient!uq;)Z")
	public boolean method2497(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class362 arg1) {
		@Pc(10) int local10;
		if (Static56.anInt1176 < 0) {
			for (local10 = 0; local10 < this.anIntArray152.length; local10++) {
				if (!arg1.method8365(this.anIntArray152[local10])) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray152.length; local10++) {
				if (!arg1.method8354(Static56.anInt1176, this.anIntArray152[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray153.length; local10++) {
			if (!arg0.method8328(this.anIntArray153[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZLclient!uq;IDLclient!d;Z)[I")
	public int[] method2498(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class362 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface2 arg5, @OriginalArg(7) boolean arg6) {
		Static473.anInterface2_9 = arg5;
		Static169.aClass362_36 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub8Array7.length; local11++) {
			this.aClass3_Sub8Array7[local11].method8778(arg0, arg3);
		}
		Static213.method3146(arg4);
		Static565.method7440(arg3, arg0);
		@Pc(39) int[] local39 = new int[arg0 * arg3];
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg1) {
			local45 = arg3 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local45 = 0;
			local49 = arg3;
			local47 = 1;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg0; local61++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub8_2.aBoolean737) {
				@Pc(93) int[] local93 = this.aClass3_Sub8_2.method8784(local61);
				local77 = local93;
				local81 = local93;
				local85 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass3_Sub8_2.method8774(local61);
				local77 = local73[1];
				local81 = local73[0];
				local85 = local73[2];
			}
			if (arg6) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local45; local105 != local49; local105 += local47) {
				@Pc(113) int local113 = local81[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(133) int local133 = local77[local105] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(151) int local151 = local85[local105] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				local133 = Static356.anIntArray330[local133];
				if (local151 < 0) {
					local151 = 0;
				}
				local113 = Static356.anIntArray330[local113];
				local151 = Static356.anIntArray330[local151];
				@Pc(188) int local188 = (local133 << 8) + ((local113 << 16) + local151);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local39[local59++] = local188;
				if (arg6) {
					local59 += arg3 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass3_Sub8Array7.length; local227++) {
			this.aClass3_Sub8Array7[local227].method8777();
		}
		return local39;
	}
}
