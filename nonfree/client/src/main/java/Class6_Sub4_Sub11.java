import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class6_Sub4_Sub11 extends Class6_Sub4 {

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "[I")
	private final int[] anIntArray483;

	@OriginalMember(owner = "client!nv", name = "I", descriptor = "[I")
	private final int[] anIntArray484;

	@OriginalMember(owner = "client!nv", name = "G", descriptor = "Lclient!cc;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "Lclient!cc;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "Lclient!cc;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!nv", name = "x", descriptor = "[Lclient!cc;")
	private final Class6_Sub1[] aClass6_Sub1Array22;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
	private Class6_Sub4_Sub11() {
		this.anIntArray483 = new int[0];
		this.anIntArray484 = new int[0];
		this.aClass6_Sub1_2 = new Class6_Sub1_Sub12(0);
		this.aClass6_Sub1_2.anInt9808 = 1;
		this.aClass6_Sub1_3 = new Class6_Sub1_Sub12();
		this.aClass6_Sub1_3.anInt9808 = 1;
		this.aClass6_Sub1_1 = new Class6_Sub1_Sub12();
		this.aClass6_Sub1_1.anInt9808 = 1;
		this.aClass6_Sub1Array22 = new Class6_Sub1[] { this.aClass6_Sub1_3, this.aClass6_Sub1_1, this.aClass6_Sub1_2 };
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class6_Sub4_Sub11(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method4966();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub1Array22 = new Class6_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub1 local26 = Static445.method6831(arg0);
			if (local26.method8163() >= 0) {
				local9++;
			}
			if (local26.method8169() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method4966();
			}
			this.aClass6_Sub1Array22[local20] = local26;
		}
		this.anIntArray484 = new int[local9];
		this.anIntArray483 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class6_Sub1 local94 = this.aClass6_Sub1Array22[local87];
			local50 = local94.aClass6_Sub1Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass6_Sub1Array42[local100] = this.aClass6_Sub1Array22[local14[local87][local100]];
			}
			@Pc(122) int local122 = local94.method8163();
			@Pc(126) int local126 = local94.method8169();
			if (local122 > 0) {
				this.anIntArray484[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray483[local11++] = local126;
			}
			local14[local87] = null;
		}
		this.aClass6_Sub1_3 = this.aClass6_Sub1Array22[arg0.method4966()];
		this.aClass6_Sub1_1 = this.aClass6_Sub1Array22[arg0.method4966()];
		this.aClass6_Sub1_2 = this.aClass6_Sub1Array22[arg0.method4966()];
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!e;Lclient!jo;)Z")
	public boolean method5765(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class168 arg1) {
		@Pc(12) int local12;
		if (Static15.anInt599 >= 0) {
			for (local12 = 0; local12 < this.anIntArray484.length; local12++) {
				if (!arg1.method4455(Static15.anInt599, this.anIntArray484[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray484.length; local12++) {
				if (!arg1.method4427(this.anIntArray484[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray483.length; local12++) {
			if (!arg0.method3583(this.anIntArray483[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIILclient!e;Lclient!jo;I)[F")
	public float[] method5766(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) Class168 arg4) {
		Static49.anInterface2_5 = arg3;
		Static142.aClass168_36 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array22.length; local11++) {
			this.aClass6_Sub1Array22[local11].method8166(arg2, arg1);
		}
		Static8.method612(arg1, arg2);
		@Pc(44) float[] local44 = new float[arg1 * 4 * arg2];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			@Pc(72) int[] local72;
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			if (this.aClass6_Sub1_3.aBoolean719) {
				@Pc(80) int[] local80 = this.aClass6_Sub1_3.method8159(local48);
				local64 = local80;
				local68 = local80;
				local72 = local80;
			} else {
				@Pc(60) int[][] local60 = this.aClass6_Sub1_3.method8158(local48);
				local64 = local60[2];
				local68 = local60[1];
				local72 = local60[0];
			}
			@Pc(96) int[] local96;
			if (this.aClass6_Sub1_1.aBoolean719) {
				local96 = this.aClass6_Sub1_1.method8159(local48);
			} else {
				local96 = this.aClass6_Sub1_1.method8158(local48)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass6_Sub1_2.aBoolean719) {
				local118 = this.aClass6_Sub1_2.method8159(local48);
			} else {
				local118 = this.aClass6_Sub1_2.method8158(local48)[0];
			}
			if (arg0) {
				local46 = local48 << 2;
			}
			for (@Pc(136) int local136 = arg1 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local118[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local44[local46++] = (float) local72[local136] * local158;
				local44[local46++] = local158 * (float) local68[local136];
				local44[local46++] = local158 * (float) local64[local136];
				local44[local46++] = local145;
				if (arg0) {
					local46 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass6_Sub1Array22.length; local234++) {
			this.aClass6_Sub1Array22[local234].method8168();
		}
		return local44;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(DZILclient!e;ILclient!jo;IZ)[I")
	public int[] method5767(@OriginalArg(0) double arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class168 arg5, @OriginalArg(7) boolean arg6) {
		Static142.aClass168_36 = arg5;
		Static49.anInterface2_5 = arg3;
		for (@Pc(16) int local16 = 0; local16 < this.aClass6_Sub1Array22.length; local16++) {
			this.aClass6_Sub1Array22[local16].method8166(arg2, arg4);
		}
		Static231.method4102(arg0);
		Static8.method612(arg4, arg2);
		@Pc(44) int[] local44 = new int[arg2 * arg4];
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(48) byte local48;
		if (arg1) {
			local48 = -1;
			local52 = arg4 - 1;
			local54 = -1;
		} else {
			local52 = 0;
			local48 = 1;
			local54 = arg4;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg2; local66++) {
			if (arg6) {
				local64 = local66;
			}
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			if (this.aClass6_Sub1_3.aBoolean719) {
				@Pc(102) int[] local102 = this.aClass6_Sub1_3.method8159(local66);
				local86 = local102;
				local90 = local102;
				local94 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass6_Sub1_3.method8158(local66);
				local86 = local82[2];
				local90 = local82[1];
				local94 = local82[0];
			}
			for (@Pc(110) int local110 = local52; local110 != local54; local110 += local48) {
				@Pc(118) int local118 = local94[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(136) int local136 = local90[local110] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(156) int local156 = local86[local110] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local136 = Static52.anIntArray94[local136];
				if (local156 < 0) {
					local156 = 0;
				}
				local118 = Static52.anIntArray94[local118];
				local156 = Static52.anIntArray94[local156];
				@Pc(194) int local194 = (local118 << 16) + (local136 << 8) + local156;
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local44[local64++] = local194;
				if (arg6) {
					local64 += arg4 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass6_Sub1Array22.length; local230++) {
			this.aClass6_Sub1Array22[local230].method8168();
		}
		return local44;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(DZLclient!jo;IBLclient!e;I)[I")
	public int[] method5770(@OriginalArg(0) double arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) int arg5) {
		Static49.anInterface2_5 = arg4;
		Static142.aClass168_36 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array22.length; local11++) {
			this.aClass6_Sub1Array22[local11].method8166(arg3, arg5);
		}
		Static231.method4102(arg0);
		Static8.method612(arg5, arg3);
		@Pc(50) int[] local50 = new int[arg3 * 4 * arg5];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg3; local54++) {
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			if (this.aClass6_Sub1_3.aBoolean719) {
				local66 = this.aClass6_Sub1_3.method8159(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass6_Sub1_3.method8158(local54);
				local68 = local80[0];
				local70 = local80[2];
				local72 = local80[1];
			}
			if (this.aClass6_Sub1_1.aBoolean719) {
				local66 = this.aClass6_Sub1_1.method8159(local54);
			} else {
				local66 = this.aClass6_Sub1_1.method8158(local54)[0];
			}
			if (arg1) {
				local52 = local54;
			}
			for (@Pc(120) int local120 = arg5 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local68[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(146) int local146 = local72[local120] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				@Pc(166) int local166 = local70[local120] >> 4;
				if (local166 > 255) {
					local166 = 255;
				}
				local146 = Static52.anIntArray94[local146];
				if (local166 < 0) {
					local166 = 0;
				}
				local128 = Static52.anIntArray94[local128];
				local166 = Static52.anIntArray94[local166];
				@Pc(197) int local197;
				if (local128 == 0 && local146 == 0 && local166 == 0) {
					local197 = 0;
				} else {
					local197 = local66[local120] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local50[local52++] = local166 + (local146 << 8) + (local197 << 24) + (local128 << 16);
				if (arg1) {
					local52 += arg5 - 1;
				}
			}
		}
		for (@Pc(257) int local257 = 0; local257 < this.aClass6_Sub1Array22.length; local257++) {
			this.aClass6_Sub1Array22[local257].method8168();
		}
		return local50;
	}
}
