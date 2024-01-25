import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class2_Sub5_Sub18 extends Class2_Sub5 {

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "[I")
	private final int[] anIntArray558;

	@OriginalMember(owner = "client!rba", name = "F", descriptor = "[I")
	private final int[] anIntArray559;

	@OriginalMember(owner = "client!rba", name = "E", descriptor = "Lclient!pc;")
	private final Class2_Sub10 aClass2_Sub10_2;

	@OriginalMember(owner = "client!rba", name = "H", descriptor = "Lclient!pc;")
	private final Class2_Sub10 aClass2_Sub10_3;

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "Lclient!pc;")
	private final Class2_Sub10 aClass2_Sub10_1;

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "[Lclient!pc;")
	private final Class2_Sub10[] aClass2_Sub10Array29;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V")
	private Class2_Sub5_Sub18() {
		this.anIntArray558 = new int[0];
		this.anIntArray559 = new int[0];
		this.aClass2_Sub10_2 = new Class2_Sub10_Sub4(0);
		this.aClass2_Sub10_2.anInt10042 = 1;
		this.aClass2_Sub10_3 = new Class2_Sub10_Sub4();
		this.aClass2_Sub10_3.anInt10042 = 1;
		this.aClass2_Sub10_1 = new Class2_Sub10_Sub4();
		this.aClass2_Sub10Array29 = new Class2_Sub10[] { this.aClass2_Sub10_3, this.aClass2_Sub10_1, this.aClass2_Sub10_2 };
		this.aClass2_Sub10_1.anInt10042 = 1;
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class2_Sub5_Sub18(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(7) int local7 = arg0.method6904();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub10Array29 = new Class2_Sub10[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub10 local26 = Static142.method2707(arg0);
			if (local26.method8409() >= 0) {
				local9++;
			}
			if (local26.method8405() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass2_Sub10Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method6904();
			}
			this.aClass2_Sub10Array29[local20] = local26;
		}
		this.anIntArray559 = new int[local9];
		local9 = 0;
		this.anIntArray558 = new int[local11];
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class2_Sub10 local97 = this.aClass2_Sub10Array29[local90];
			local53 = local97.aClass2_Sub10Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass2_Sub10Array42[local103] = this.aClass2_Sub10Array29[local14[local90][local103]];
			}
			@Pc(125) int local125 = local97.method8409();
			@Pc(129) int local129 = local97.method8405();
			if (local125 > 0) {
				this.anIntArray559[local9++] = local125;
			}
			if (local129 > 0) {
				this.anIntArray558[local11++] = local129;
			}
			local14[local90] = null;
		}
		this.aClass2_Sub10_3 = this.aClass2_Sub10Array29[arg0.method6904()];
		this.aClass2_Sub10_1 = this.aClass2_Sub10Array29[arg0.method6904()];
		this.aClass2_Sub10_2 = this.aClass2_Sub10Array29[arg0.method6904()];
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!eq;ZDLclient!d;IIZ)[I")
	public int[] method6845(@OriginalArg(1) Class97 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) double arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static150.anInterface6_5 = arg3;
		Static240.aClass97_62 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub10Array29.length; local11++) {
			this.aClass2_Sub10Array29[local11].method8400(arg5, arg4);
		}
		Static442.method6556(arg2);
		Static385.method5797(arg4, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg4];
		@Pc(45) int local45;
		@Pc(43) int local43;
		@Pc(47) byte local47;
		if (arg6) {
			local45 = arg5 - 1;
			local47 = -1;
			local43 = -1;
		} else {
			local43 = arg5;
			local45 = 0;
			local47 = 1;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg4; local61++) {
			if (arg1) {
				local59 = local61;
			}
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(89) int[] local89;
			if (this.aClass2_Sub10_3.aBoolean741) {
				@Pc(97) int[] local97 = this.aClass2_Sub10_3.method8403(local61);
				local85 = local97;
				local81 = local97;
				local89 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub10_3.method8411(local61);
				local81 = local77[0];
				local85 = local77[1];
				local89 = local77[2];
			}
			for (@Pc(105) int local105 = local45; local105 != local43; local105 += local47) {
				@Pc(113) int local113 = local81[local105] >> 4;
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
				@Pc(153) int local153 = local89[local105] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local113 = Static503.anIntArray586[local113];
				if (local153 < 0) {
					local153 = 0;
				}
				local133 = Static503.anIntArray586[local133];
				local153 = Static503.anIntArray586[local153];
				@Pc(188) int local188 = (local113 << 16) - (-(local133 << 8) - local153);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local39[local59++] = local188;
				if (arg1) {
					local59 += arg5 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass2_Sub10Array29.length; local227++) {
			this.aClass2_Sub10Array29[local227].method8404();
		}
		return local39;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IBLclient!d;DZLclient!eq;I)[I")
	public int[] method6846(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) int arg5) {
		Static240.aClass97_62 = arg4;
		Static150.anInterface6_5 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub10Array29.length; local11++) {
			this.aClass2_Sub10Array29[local11].method8400(arg5, arg0);
		}
		Static442.method6556(arg2);
		Static385.method5797(arg0, arg5);
		@Pc(43) int[] local43 = new int[arg5 * arg0];
		@Pc(45) int local45 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			if (this.aClass2_Sub10_3.aBoolean741) {
				local64 = this.aClass2_Sub10_3.method8403(local52);
				local66 = local64;
				local68 = local64;
				local70 = local64;
			} else {
				@Pc(78) int[][] local78 = this.aClass2_Sub10_3.method8411(local52);
				local66 = local78[1];
				local70 = local78[0];
				local68 = local78[2];
			}
			if (arg3) {
				local45 = local52;
			}
			if (this.aClass2_Sub10_1.aBoolean741) {
				local64 = this.aClass2_Sub10_1.method8403(local52);
			} else {
				local64 = this.aClass2_Sub10_1.method8411(local52)[0];
			}
			for (@Pc(118) int local118 = arg5 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local70[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(144) int local144 = local66[local118] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(164) int local164 = local68[local118] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local144 = Static503.anIntArray586[local144];
				local126 = Static503.anIntArray586[local126];
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static503.anIntArray586[local164];
				@Pc(208) int local208;
				if (local126 == 0 && local144 == 0 && local164 == 0) {
					local208 = 0;
				} else {
					local208 = local64[local118] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local43[local45++] = (local208 << 24) + ((local126 << 16) + (local144 << 8)) + local164;
				if (arg3) {
					local45 += arg5 - 1;
				}
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.aClass2_Sub10Array29.length; local260++) {
			this.aClass2_Sub10Array29[local260].method8404();
		}
		return local43;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZILclient!eq;ILclient!d;I)[F")
	public float[] method6847(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) int arg4) {
		Static150.anInterface6_5 = arg3;
		Static240.aClass97_62 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub10Array29.length; local11++) {
			this.aClass2_Sub10Array29[local11].method8400(arg4, arg2);
		}
		Static385.method5797(arg2, arg4);
		@Pc(42) float[] local42 = new float[arg2 * 4 * arg4];
		@Pc(44) int local44 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			if (this.aClass2_Sub10_3.aBoolean741) {
				@Pc(83) int[] local83 = this.aClass2_Sub10_3.method8403(local51);
				local71 = local83;
				local67 = local83;
				local75 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass2_Sub10_3.method8411(local51);
				local67 = local63[2];
				local71 = local63[1];
				local75 = local63[0];
			}
			@Pc(99) int[] local99;
			if (this.aClass2_Sub10_1.aBoolean741) {
				local99 = this.aClass2_Sub10_1.method8403(local51);
			} else {
				local99 = this.aClass2_Sub10_1.method8411(local51)[0];
			}
			if (arg0) {
				local44 = local51 << 2;
			}
			@Pc(125) int[] local125;
			if (this.aClass2_Sub10_2.aBoolean741) {
				local125 = this.aClass2_Sub10_2.method8403(local51);
			} else {
				local125 = this.aClass2_Sub10_2.method8411(local51)[0];
			}
			for (@Pc(139) int local139 = arg4 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local125[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local42[local44++] = (float) local75[local139] * local161;
				local42[local44++] = local161 * (float) local71[local139];
				local42[local44++] = local161 * (float) local67[local139];
				local42[local44++] = local148;
				if (arg0) {
					local44 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass2_Sub10Array29.length; local229++) {
			this.aClass2_Sub10Array29[local229].method8404();
		}
		return local42;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!d;ILclient!eq;)Z")
	public boolean method6848(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(9) int local9;
		if (Static255.anInt5049 < 0) {
			for (local9 = 0; local9 < this.anIntArray559.length; local9++) {
				if (!arg1.method2564(this.anIntArray559[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray559.length; local9++) {
				if (!arg1.method2561(Static255.anInt5049, this.anIntArray559[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray558.length; local9++) {
			if (!arg0.method6355(this.anIntArray558[local9])) {
				return false;
			}
		}
		return true;
	}
}
