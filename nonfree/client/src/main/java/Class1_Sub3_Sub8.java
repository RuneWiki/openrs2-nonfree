import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dv", name = "A", descriptor = "[I")
	private final int[] anIntArray127;

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "[I")
	private final int[] anIntArray128;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "Lclient!lm;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!dv", name = "G", descriptor = "Lclient!lm;")
	private final Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!dv", name = "E", descriptor = "Lclient!lm;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "[Lclient!lm;")
	private final Class1_Sub1[] aClass1_Sub1Array9;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	private Class1_Sub3_Sub8() {
		this.anIntArray127 = new int[0];
		this.anIntArray128 = new int[0];
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub19(0);
		this.aClass1_Sub1_1.anInt9545 = 1;
		this.aClass1_Sub1_3 = new Class1_Sub1_Sub19();
		this.aClass1_Sub1_3.anInt9545 = 1;
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub19();
		this.aClass1_Sub1_2.anInt9545 = 1;
		this.aClass1_Sub1Array9 = new Class1_Sub1[] { this.aClass1_Sub1_3, this.aClass1_Sub1_2, this.aClass1_Sub1_1 };
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class1_Sub3_Sub8(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method4393();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub1Array9 = new Class1_Sub1[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static312.method4781(arg0);
			if (local26.method7889() >= 0) {
				local9++;
			}
			if (local26.method7884() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub1Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method4393();
			}
			this.aClass1_Sub1Array9[local20] = local26;
		}
		this.anIntArray127 = new int[local9];
		local9 = 0;
		this.anIntArray128 = new int[local11];
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class1_Sub1 local99 = this.aClass1_Sub1Array9[local92];
			local47 = local99.aClass1_Sub1Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass1_Sub1Array42[local105] = this.aClass1_Sub1Array9[local14[local92][local105]];
			}
			@Pc(131) int local131 = local99.method7889();
			@Pc(135) int local135 = local99.method7884();
			if (local131 > 0) {
				this.anIntArray127[local9++] = local131;
			}
			if (local135 > 0) {
				this.anIntArray128[local11++] = local135;
			}
			local14[local92] = null;
		}
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array9[arg0.method4393()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array9[arg0.method4393()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array9[arg0.method4393()];
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!fa;Lclient!ga;I)Z")
	public boolean method1890(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class111 arg1) {
		@Pc(9) int local9;
		if (Static164.anInt2987 < 0) {
			for (local9 = 0; local9 < this.anIntArray127.length; local9++) {
				if (!arg1.method2434(this.anIntArray127[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray127.length; local9++) {
				if (!arg1.method2465(this.anIntArray127[local9], Static164.anInt2987)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray128.length; local9++) {
			if (!arg0.method4045(this.anIntArray128[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIZILclient!fa;Lclient!ga;D)[I")
	public int[] method1892(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface5 arg4, @OriginalArg(6) Class111 arg5, @OriginalArg(7) double arg6) {
		Static264.anInterface5_5 = arg4;
		Static134.aClass111_128 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array9.length; local11++) {
			this.aClass1_Sub1Array9[local11].method7891(arg1, arg3);
		}
		Static296.method4676(arg6);
		Static94.method1795(arg1, arg3);
		@Pc(41) int[] local41 = new int[arg3 * arg1];
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg0) {
			local45 = arg3 - 1;
			local49 = -1;
			local47 = -1;
		} else {
			local45 = 0;
			local47 = arg3;
			local49 = 1;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			if (this.aClass1_Sub1_3.aBoolean696) {
				@Pc(75) int[] local75 = this.aClass1_Sub1_3.method7888(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub1_3.method7883(local63);
				local77 = local89[1];
				local81 = local89[0];
				local79 = local89[2];
			}
			if (arg2) {
				local61 = local63;
			}
			for (@Pc(107) int local107 = local45; local107 != local47; local107 += local49) {
				@Pc(115) int local115 = local81[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(133) int local133 = local77[local107] >> 4;
				if (local133 > 255) {
					local133 = 255;
				}
				if (local133 < 0) {
					local133 = 0;
				}
				@Pc(151) int local151 = local79[local107] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				if (local151 < 0) {
					local151 = 0;
				}
				local133 = Static485.anIntArray542[local133];
				local115 = Static485.anIntArray542[local115];
				local151 = Static485.anIntArray542[local151];
				@Pc(187) int local187 = (local115 << 16) + (local133 << 8) + local151;
				if (local187 != 0) {
					local187 |= 0xFF000000;
				}
				local41[local61++] = local187;
				if (arg2) {
					local61 += arg3 - 1;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass1_Sub1Array9.length; local232++) {
			this.aClass1_Sub1Array9[local232].method7890();
		}
		return local41;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIILclient!fa;Lclient!ga;)[F")
	public float[] method1894(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) Class111 arg4) {
		Static134.aClass111_128 = arg4;
		Static264.anInterface5_5 = arg3;
		for (@Pc(25) int local25 = 0; local25 < this.aClass1_Sub1Array9.length; local25++) {
			this.aClass1_Sub1Array9[local25].method7891(arg0, arg2);
		}
		Static94.method1795(arg0, arg2);
		@Pc(52) float[] local52 = new float[arg2 * arg0 * 4];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
			@Pc(72) int[] local72;
			@Pc(76) int[] local76;
			@Pc(80) int[] local80;
			if (this.aClass1_Sub1_3.aBoolean696) {
				@Pc(88) int[] local88 = this.aClass1_Sub1_3.method7888(local56);
				local72 = local88;
				local80 = local88;
				local76 = local88;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub1_3.method7883(local56);
				local72 = local68[0];
				local76 = local68[1];
				local80 = local68[2];
			}
			@Pc(106) int[] local106;
			if (this.aClass1_Sub1_2.aBoolean696) {
				local106 = this.aClass1_Sub1_2.method7888(local56);
			} else {
				local106 = this.aClass1_Sub1_2.method7883(local56)[0];
			}
			if (arg1) {
				local54 = local56 << 2;
			}
			@Pc(132) int[] local132;
			if (this.aClass1_Sub1_1.aBoolean696) {
				local132 = this.aClass1_Sub1_1.method7888(local56);
			} else {
				local132 = this.aClass1_Sub1_1.method7883(local56)[0];
			}
			for (@Pc(144) int local144 = arg2 - 1; local144 >= 0; local144--) {
				@Pc(153) float local153 = (float) local106[local144] / 4096.0F;
				@Pc(166) float local166 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local153 < 0.0F) {
					local153 = 0.0F;
				} else if (local153 > 1.0F) {
					local153 = 1.0F;
				}
				local52[local54++] = local166 * (float) local72[local144];
				local52[local54++] = local166 * (float) local76[local144];
				local52[local54++] = (float) local80[local144] * local166;
				local52[local54++] = local153;
				if (arg1) {
					local54 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass1_Sub1Array9.length; local234++) {
			this.aClass1_Sub1Array9[local234].method7890();
		}
		return local52;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!ga;ZILclient!fa;D)[I")
	public int[] method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Interface5 arg4, @OriginalArg(6) double arg5) {
		Static264.anInterface5_5 = arg4;
		Static134.aClass111_128 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub1Array9.length; local16++) {
			this.aClass1_Sub1Array9[local16].method7891(arg1, arg0);
		}
		Static296.method4676(arg5);
		Static94.method1795(arg1, arg0);
		@Pc(50) int[] local50 = new int[arg1 * 4 * arg0];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			@Pc(70) int[] local70;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub1_3.aBoolean696) {
				local86 = this.aClass1_Sub1_3.method7888(local54);
				local70 = local86;
				local78 = local86;
				local74 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass1_Sub1_3.method7883(local54);
				local70 = local66[2];
				local74 = local66[0];
				local78 = local66[1];
			}
			if (this.aClass1_Sub1_2.aBoolean696) {
				local86 = this.aClass1_Sub1_2.method7888(local54);
			} else {
				local86 = this.aClass1_Sub1_2.method7883(local54)[0];
			}
			if (arg3) {
				local52 = local54;
			}
			for (@Pc(120) int local120 = arg0 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local74[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(145) int local145 = local78[local120] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(163) int local163 = local70[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				if (local163 < 0) {
					local163 = 0;
				}
				local145 = Static485.anIntArray542[local145];
				local128 = Static485.anIntArray542[local128];
				local163 = Static485.anIntArray542[local163];
				@Pc(210) int local210;
				if (local128 == 0 && local145 == 0 && local163 == 0) {
					local210 = 0;
				} else {
					local210 = local86[local120] >> 4;
					if (local210 > 255) {
						local210 = 255;
					}
					if (local210 < 0) {
						local210 = 0;
					}
				}
				local50[local52++] = local163 + (local145 << 8) + (local128 << 16) + (local210 << 24);
				if (arg3) {
					local52 += arg0 - 1;
				}
			}
		}
		for (@Pc(262) int local262 = 0; local262 < this.aClass1_Sub1Array9.length; local262++) {
			this.aClass1_Sub1Array9[local262].method7890();
		}
		return local50;
	}
}
