import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "[I")
	private final int[] anIntArray264;

	@OriginalMember(owner = "client!kv", name = "N", descriptor = "[I")
	private final int[] anIntArray265;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "Lclient!oc;")
	private final Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!kv", name = "L", descriptor = "Lclient!oc;")
	private final Class4_Sub6 aClass4_Sub6_2;

	@OriginalMember(owner = "client!kv", name = "Q", descriptor = "Lclient!oc;")
	private final Class4_Sub6 aClass4_Sub6_3;

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "[Lclient!oc;")
	private final Class4_Sub6[] aClass4_Sub6Array23;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub14() {
		this.anIntArray264 = new int[0];
		this.anIntArray265 = new int[0];
		this.aClass4_Sub6_1 = new Class4_Sub6_Sub21(0);
		this.aClass4_Sub6_1.anInt7106 = 1;
		this.aClass4_Sub6_2 = new Class4_Sub6_Sub21();
		this.aClass4_Sub6_2.anInt7106 = 1;
		this.aClass4_Sub6_3 = new Class4_Sub6_Sub21();
		this.aClass4_Sub6_3.anInt7106 = 1;
		this.aClass4_Sub6Array23 = new Class4_Sub6[] { this.aClass4_Sub6_2, this.aClass4_Sub6_3, this.aClass4_Sub6_1 };
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!iv;)V")
	public Class4_Sub1_Sub14(@OriginalArg(0) Class4_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method2490();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub6Array23 = new Class4_Sub6[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub6 local26 = Static158.method2680(arg0);
			if (local26.method5511() >= 0) {
				local9++;
			}
			if (local26.method5512() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass4_Sub6Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method2490();
			}
			this.aClass4_Sub6Array23[local20] = local26;
		}
		this.anIntArray264 = new int[local9];
		local9 = 0;
		this.anIntArray265 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class4_Sub6 local98 = this.aClass4_Sub6Array23[local91];
			local50 = local98.aClass4_Sub6Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass4_Sub6Array42[local104] = this.aClass4_Sub6Array23[local14[local91][local104]];
			}
			@Pc(126) int local126 = local98.method5511();
			@Pc(130) int local130 = local98.method5512();
			if (local126 > 0) {
				this.anIntArray264[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray265[local11++] = local130;
			}
			local14[local91] = null;
		}
		this.aClass4_Sub6_2 = this.aClass4_Sub6Array23[arg0.method2490()];
		this.aClass4_Sub6_3 = this.aClass4_Sub6Array23[arg0.method2490()];
		this.aClass4_Sub6_1 = this.aClass4_Sub6Array23[arg0.method2490()];
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLclient!fs;Lclient!ga;)Z")
	public boolean method3276(@OriginalArg(1) Class76 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(9) int local9;
		if (Static182.anInt3496 < 0) {
			for (local9 = 0; local9 < this.anIntArray264.length; local9++) {
				if (!arg0.method2125(this.anIntArray264[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray264.length; local9++) {
				if (!arg0.method2098(this.anIntArray264[local9], Static182.anInt3496)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray265.length; local9++) {
			if (!arg1.method2392(this.anIntArray265[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ga;IZZLclient!fs;DII)[I")
	public int[] method3277(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class76 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static40.aClass76_9 = arg3;
		Static331.anInterface7_7 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub6Array23.length; local11++) {
			this.aClass4_Sub6Array23[local11].method5513(arg5, arg6);
		}
		Static407.method5254(arg4);
		Static286.method3974(arg5, arg6);
		@Pc(39) int[] local39 = new int[arg6 * arg5];
		@Pc(47) int local47;
		@Pc(43) int local43;
		@Pc(49) byte local49;
		if (arg1) {
			local43 = -1;
			local47 = arg6 - 1;
			local49 = -1;
		} else {
			local49 = 1;
			local43 = arg6;
			local47 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			if (this.aClass4_Sub6_2.aBoolean665) {
				@Pc(93) int[] local93 = this.aClass4_Sub6_2.method5510(local61);
				local77 = local93;
				local85 = local93;
				local81 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass4_Sub6_2.method5514(local61);
				local77 = local73[0];
				local81 = local73[2];
				local85 = local73[1];
			}
			if (arg2) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local47; local105 != local43; local105 += local49) {
				@Pc(113) int local113 = local77[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(133) int local133 = local85[local105] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(150) int local150 = local81[local105] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				local113 = Static397.anIntArray45[local113];
				if (local150 < 0) {
					local150 = 0;
				}
				local133 = Static397.anIntArray45[local133];
				local150 = Static397.anIntArray45[local150];
				@Pc(181) int local181 = local150 + (local113 << 16) + (local133 << 8);
				if (local181 != 0) {
					local181 |= 0xFF000000;
				}
				local39[local59++] = local181;
				if (arg2) {
					local59 += arg6 - 1;
				}
			}
		}
		for (@Pc(213) int local213 = 0; local213 < this.aClass4_Sub6Array23.length; local213++) {
			this.aClass4_Sub6Array23[local213].method5517();
		}
		return local39;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IBLclient!fs;Lclient!ga;IDZ)[I")
	public int[] method3282(@OriginalArg(0) int arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) boolean arg5) {
		Static331.anInterface7_7 = arg2;
		Static40.aClass76_9 = arg1;
		for (@Pc(23) int local23 = 0; local23 < this.aClass4_Sub6Array23.length; local23++) {
			this.aClass4_Sub6Array23[local23].method5513(arg3, arg0);
		}
		Static407.method5254(arg4);
		Static286.method3974(arg3, arg0);
		@Pc(57) int[] local57 = new int[arg3 * arg0 * 4];
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
			@Pc(81) int[] local81;
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			@Pc(75) int[] local75;
			if (this.aClass4_Sub6_2.aBoolean665) {
				local75 = this.aClass4_Sub6_2.method5510(local61);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass4_Sub6_2.method5514(local61);
				local81 = local89[0];
				local79 = local89[1];
				local77 = local89[2];
			}
			if (arg5) {
				local59 = local61;
			}
			if (this.aClass4_Sub6_3.aBoolean665) {
				local75 = this.aClass4_Sub6_3.method5510(local61);
			} else {
				local75 = this.aClass4_Sub6_3.method5514(local61)[0];
			}
			for (@Pc(129) int local129 = arg0 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local81[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(152) int local152 = local79[local129] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				@Pc(170) int local170 = local77[local129] >> 4;
				if (local170 > 255) {
					local170 = 255;
				}
				if (local170 < 0) {
					local170 = 0;
				}
				local137 = Static397.anIntArray45[local137];
				local152 = Static397.anIntArray45[local152];
				local170 = Static397.anIntArray45[local170];
				@Pc(210) int local210;
				if (local137 == 0 && local152 == 0 && local170 == 0) {
					local210 = 0;
				} else {
					local210 = local75[local129] >> 4;
					if (local210 > 255) {
						local210 = 255;
					}
					if (local210 < 0) {
						local210 = 0;
					}
				}
				local57[local59++] = local170 + (local152 << 8) + (local210 << 24) + (local137 << 16);
				if (arg5) {
					local59 += arg0 - 1;
				}
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.aClass4_Sub6Array23.length; local262++) {
			this.aClass4_Sub6Array23[local262].method5517();
		}
		return local57;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZLclient!ga;Lclient!fs;IZI)[F")
	public float[] method3283(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static40.aClass76_9 = arg1;
		Static331.anInterface7_7 = arg0;
		for (@Pc(18) int local18 = 0; local18 < this.aClass4_Sub6Array23.length; local18++) {
			this.aClass4_Sub6Array23[local18].method5513(arg4, arg2);
		}
		Static286.method3974(arg4, arg2);
		@Pc(49) float[] local49 = new float[arg2 * 4 * arg4];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg4; local53++) {
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(69) int[] local69;
			if (this.aClass4_Sub6_2.aBoolean665) {
				@Pc(85) int[] local85 = this.aClass4_Sub6_2.method5510(local53);
				local69 = local85;
				local77 = local85;
				local73 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass4_Sub6_2.method5514(local53);
				local69 = local65[2];
				local73 = local65[0];
				local77 = local65[1];
			}
			@Pc(101) int[] local101;
			if (this.aClass4_Sub6_3.aBoolean665) {
				local101 = this.aClass4_Sub6_3.method5510(local53);
			} else {
				local101 = this.aClass4_Sub6_3.method5514(local53)[0];
			}
			if (arg3) {
				local51 = local53 << 2;
			}
			@Pc(127) int[] local127;
			if (this.aClass4_Sub6_1.aBoolean665) {
				local127 = this.aClass4_Sub6_1.method5510(local53);
			} else {
				local127 = this.aClass4_Sub6_1.method5514(local53)[0];
			}
			for (@Pc(141) int local141 = arg2 - 1; local141 >= 0; local141--) {
				@Pc(150) float local150 = (float) local101[local141] / 4096.0F;
				@Pc(163) float local163 = ((float) local127[local141] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local150 < 0.0F) {
					local150 = 0.0F;
				} else if (local150 > 1.0F) {
					local150 = 1.0F;
				}
				local49[local51++] = (float) local73[local141] * local163;
				local49[local51++] = local163 * (float) local77[local141];
				local49[local51++] = local163 * (float) local69[local141];
				local49[local51++] = local150;
				if (arg3) {
					local51 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass4_Sub6Array23.length; local231++) {
			this.aClass4_Sub6Array23[local231].method5517();
		}
		return local49;
	}
}
