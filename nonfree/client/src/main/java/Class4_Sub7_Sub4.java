import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class4_Sub7_Sub4 extends Class4_Sub7 {

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "[I")
	private final int[] anIntArray229;

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "[I")
	private final int[] anIntArray230;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "Lclient!qp;")
	private final Class4_Sub4 aClass4_Sub4_2;

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "Lclient!qp;")
	private final Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Lclient!qp;")
	private final Class4_Sub4 aClass4_Sub4_3;

	@OriginalMember(owner = "client!dga", name = "A", descriptor = "[Lclient!qp;")
	private final Class4_Sub4[] aClass4_Sub4Array7;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	private Class4_Sub7_Sub4() {
		this.anIntArray229 = new int[0];
		this.anIntArray230 = new int[0];
		this.aClass4_Sub4_2 = new Class4_Sub4_Sub38(0);
		this.aClass4_Sub4_2.anInt9616 = 1;
		this.aClass4_Sub4_1 = new Class4_Sub4_Sub38();
		this.aClass4_Sub4_1.anInt9616 = 1;
		this.aClass4_Sub4_3 = new Class4_Sub4_Sub38();
		this.aClass4_Sub4Array7 = new Class4_Sub4[] { this.aClass4_Sub4_1, this.aClass4_Sub4_3, this.aClass4_Sub4_2 };
		this.aClass4_Sub4_3.anInt9616 = 1;
	}

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!eh;)V")
	public Class4_Sub7_Sub4(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method6015();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub4Array7 = new Class4_Sub4[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub4 local26 = Static119.method2426(arg0);
			if (local26.method7888() >= 0) {
				local9++;
			}
			if (local26.method7889() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass4_Sub4Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6015();
			}
			this.aClass4_Sub4Array7[local20] = local26;
		}
		this.anIntArray229 = new int[local9];
		local9 = 0;
		this.anIntArray230 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class4_Sub4 local98 = this.aClass4_Sub4Array7[local91];
			local50 = local98.aClass4_Sub4Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass4_Sub4Array42[local104] = this.aClass4_Sub4Array7[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7888();
			@Pc(134) int local134 = local98.method7889();
			if (local130 > 0) {
				this.anIntArray229[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray230[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass4_Sub4_1 = this.aClass4_Sub4Array7[arg0.method6015()];
		this.aClass4_Sub4_3 = this.aClass4_Sub4Array7[arg0.method6015()];
		this.aClass4_Sub4_2 = this.aClass4_Sub4Array7[arg0.method6015()];
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!bi;Lclient!e;)Z")
	public boolean method2147(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(12) int local12;
		if (Static210.anInt4324 >= 0) {
			for (local12 = 0; local12 < this.anIntArray229.length; local12++) {
				if (!arg0.method668(this.anIntArray229[local12], Static210.anInt4324)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray229.length; local12++) {
				if (!arg0.method679(this.anIntArray229[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray230.length; local12++) {
			if (!arg1.method7248(this.anIntArray230[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!e;ZDIILclient!bi;IZ)[I")
	public int[] method2149(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class31 arg5, @OriginalArg(7) boolean arg6) {
		Static230.aClass31_52 = arg5;
		Static301.anInterface3_10 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array7.length; local11++) {
			this.aClass4_Sub4Array7[local11].method7885(arg3, arg4);
		}
		Static280.method4440(arg2);
		Static162.method3175(arg3, arg4);
		@Pc(41) int[] local41 = new int[arg3 * arg4];
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(49) byte local49;
		if (arg6) {
			local47 = arg3 - 1;
			local49 = -1;
			local51 = -1;
		} else {
			local49 = 1;
			local47 = 0;
			local51 = arg3;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg4; local63++) {
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			@Pc(79) int[] local79;
			if (this.aClass4_Sub4_1.aBoolean679) {
				@Pc(95) int[] local95 = this.aClass4_Sub4_1.method7883(local63);
				local83 = local95;
				local79 = local95;
				local87 = local95;
			} else {
				@Pc(75) int[][] local75 = this.aClass4_Sub4_1.method7887(local63);
				local79 = local75[2];
				local83 = local75[0];
				local87 = local75[1];
			}
			if (arg1) {
				local61 = local63;
			}
			for (@Pc(107) int local107 = local47; local107 != local51; local107 += local49) {
				@Pc(115) int local115 = local83[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(132) int local132 = local87[local107] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(149) int local149 = local79[local107] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				local132 = Static354.anIntArray512[local132];
				local115 = Static354.anIntArray512[local115];
				local149 = Static354.anIntArray512[local149];
				@Pc(182) int local182 = (local115 << 16) + (local132 << 8) + local149;
				if (local182 != 0) {
					local182 |= 0xFF000000;
				}
				local41[local61++] = local182;
				if (arg1) {
					local61 += arg3 - 1;
				}
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.aClass4_Sub4Array7.length; local218++) {
			this.aClass4_Sub4Array7[local218].method7882();
		}
		return local41;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!bi;DZILclient!e;II)[I")
	public int[] method2150(@OriginalArg(0) Class31 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static301.anInterface3_10 = arg3;
		Static230.aClass31_52 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array7.length; local11++) {
			this.aClass4_Sub4Array7[local11].method7885(arg5, arg4);
		}
		Static280.method4440(arg1);
		Static162.method3175(arg5, arg4);
		@Pc(51) int[] local51 = new int[arg4 * 4 * arg5];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg4; local55++) {
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			if (this.aClass4_Sub4_1.aBoolean679) {
				local67 = this.aClass4_Sub4_1.method7883(local55);
				local69 = local67;
				local71 = local67;
				local73 = local67;
			} else {
				@Pc(81) int[][] local81 = this.aClass4_Sub4_1.method7887(local55);
				local69 = local81[0];
				local73 = local81[1];
				local71 = local81[2];
			}
			if (arg2) {
				local53 = local55;
			}
			if (this.aClass4_Sub4_3.aBoolean679) {
				local67 = this.aClass4_Sub4_3.method7883(local55);
			} else {
				local67 = this.aClass4_Sub4_3.method7887(local55)[0];
			}
			for (@Pc(121) int local121 = arg5 - 1; local121 >= 0; local121--) {
				@Pc(129) int local129 = local69[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(147) int local147 = local73[local121] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(162) int local162 = local71[local121] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local147 = Static354.anIntArray512[local147];
				local129 = Static354.anIntArray512[local129];
				if (local162 < 0) {
					local162 = 0;
				}
				local162 = Static354.anIntArray512[local162];
				@Pc(201) int local201;
				if (local129 == 0 && local147 == 0 && local162 == 0) {
					local201 = 0;
				} else {
					local201 = local67[local121] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local51[local53++] = local162 + (local147 << 8) + (local129 << 16) + (local201 << 24);
				if (arg2) {
					local53 += arg5 - 1;
				}
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.aClass4_Sub4Array7.length; local260++) {
			this.aClass4_Sub4Array7[local260].method7882();
		}
		return local51;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZIIILclient!e;Lclient!bi;)[F")
	public float[] method2151(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) Class31 arg4) {
		Static301.anInterface3_10 = arg3;
		Static230.aClass31_52 = arg4;
		for (@Pc(24) int local24 = 0; local24 < this.aClass4_Sub4Array7.length; local24++) {
			this.aClass4_Sub4Array7[local24].method7885(arg2, arg1);
		}
		Static162.method3175(arg2, arg1);
		@Pc(51) float[] local51 = new float[arg2 * 4 * arg1];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
			@Pc(71) int[] local71;
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			if (this.aClass4_Sub4_1.aBoolean679) {
				@Pc(67) int[] local67 = this.aClass4_Sub4_1.method7883(local55);
				local69 = local67;
				local71 = local67;
				local73 = local67;
			} else {
				@Pc(81) int[][] local81 = this.aClass4_Sub4_1.method7887(local55);
				local69 = local81[1];
				local71 = local81[0];
				local73 = local81[2];
			}
			@Pc(105) int[] local105;
			if (this.aClass4_Sub4_3.aBoolean679) {
				local105 = this.aClass4_Sub4_3.method7883(local55);
			} else {
				local105 = this.aClass4_Sub4_3.method7887(local55)[0];
			}
			if (arg0) {
				local53 = local55 << 2;
			}
			@Pc(129) int[] local129;
			if (this.aClass4_Sub4_2.aBoolean679) {
				local129 = this.aClass4_Sub4_2.method7883(local55);
			} else {
				local129 = this.aClass4_Sub4_2.method7887(local55)[0];
			}
			for (@Pc(145) int local145 = arg2 - 1; local145 >= 0; local145--) {
				@Pc(154) float local154 = (float) local105[local145] / 4096.0F;
				if (local154 < 0.0F) {
					local154 = 0.0F;
				} else if (local154 > 1.0F) {
					local154 = 1.0F;
				}
				@Pc(181) float local181 = ((float) local129[local145] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local51[local53++] = local181 * (float) local71[local145];
				local51[local53++] = (float) local69[local145] * local181;
				local51[local53++] = local181 * (float) local73[local145];
				local51[local53++] = local154;
				if (arg0) {
					local53 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.aClass4_Sub4Array7.length; local239++) {
			this.aClass4_Sub4Array7[local239].method7882();
		}
		return local51;
	}
}
