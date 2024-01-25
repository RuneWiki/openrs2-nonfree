import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "[I")
	private final int[] anIntArray315;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "[I")
	private final int[] anIntArray313;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "Lclient!mr;")
	private final Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Lclient!mr;")
	private final Class4_Sub4 aClass4_Sub4_2;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "Lclient!mr;")
	private final Class4_Sub4 aClass4_Sub4_3;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "[Lclient!mr;")
	private final Class4_Sub4[] aClass4_Sub4Array19;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub12() {
		this.anIntArray315 = new int[0];
		this.anIntArray313 = new int[0];
		this.aClass4_Sub4_1 = new Class4_Sub4_Sub10(0);
		this.aClass4_Sub4_1.anInt6436 = 1;
		this.aClass4_Sub4_2 = new Class4_Sub4_Sub10();
		this.aClass4_Sub4_2.anInt6436 = 1;
		this.aClass4_Sub4_3 = new Class4_Sub4_Sub10();
		this.aClass4_Sub4Array19 = new Class4_Sub4[] { this.aClass4_Sub4_2, this.aClass4_Sub4_3, this.aClass4_Sub4_1 };
		this.aClass4_Sub4_3.anInt6436 = 1;
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class4_Sub1_Sub12(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method2380();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass4_Sub4Array19 = new Class4_Sub4[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub4 local26 = Static211.method3685(arg0);
			if (local26.method5382() >= 0) {
				local9++;
			}
			if (local26.method5379() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass4_Sub4Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method2380();
			}
			this.aClass4_Sub4Array19[local20] = local26;
		}
		this.anIntArray313 = new int[local9];
		local9 = 0;
		this.anIntArray315 = new int[local11];
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class4_Sub4 local99 = this.aClass4_Sub4Array19[local92];
			local47 = local99.aClass4_Sub4Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass4_Sub4Array42[local105] = this.aClass4_Sub4Array19[local14[local92][local105]];
			}
			@Pc(127) int local127 = local99.method5382();
			@Pc(131) int local131 = local99.method5379();
			if (local127 > 0) {
				this.anIntArray313[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray315[local11++] = local131;
			}
			local14[local92] = null;
		}
		this.aClass4_Sub4_2 = this.aClass4_Sub4Array19[arg0.method2380()];
		this.aClass4_Sub4_3 = this.aClass4_Sub4Array19[arg0.method2380()];
		this.aClass4_Sub4_1 = this.aClass4_Sub4Array19[arg0.method2380()];
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!al;IZLclient!am;ZIID)[I")
	public int[] method3124(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) double arg6) {
		Static317.aClass11_142 = arg3;
		Static219.anInterface1_5 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array19.length; local11++) {
			this.aClass4_Sub4Array19[local11].method5381(arg5, arg1);
		}
		Static156.method3017(arg6);
		Static39.method744(arg5, arg1);
		@Pc(45) int[] local45 = new int[arg5 * arg1];
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) byte local53;
		if (arg4) {
			local49 = arg5 - 1;
			local53 = -1;
			local51 = -1;
		} else {
			local49 = 0;
			local51 = arg5;
			local53 = 1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
			if (arg2) {
				local65 = local73;
			}
			@Pc(93) int[] local93;
			@Pc(101) int[] local101;
			@Pc(97) int[] local97;
			if (this.aClass4_Sub4_2.aBoolean563) {
				@Pc(109) int[] local109 = this.aClass4_Sub4_2.method5380(local73);
				local93 = local109;
				local97 = local109;
				local101 = local109;
			} else {
				@Pc(89) int[][] local89 = this.aClass4_Sub4_2.method5383(local73);
				local93 = local89[0];
				local97 = local89[2];
				local101 = local89[1];
			}
			for (@Pc(117) int local117 = local49; local117 != local51; local117 += local53) {
				@Pc(125) int local125 = local93[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(145) int local145 = local101[local117] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(160) int local160 = local97[local117] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local145 = Static122.anIntArray257[local145];
				if (local160 < 0) {
					local160 = 0;
				}
				local125 = Static122.anIntArray257[local125];
				local160 = Static122.anIntArray257[local160];
				@Pc(194) int local194 = (local145 << 8) + (local125 << 16) + local160;
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local45[local65++] = local194;
				if (arg2) {
					local65 += arg5 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass4_Sub4Array19.length; local229++) {
			this.aClass4_Sub4Array19[local229].method5390();
		}
		return local45;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!al;ILclient!am;)Z")
	public boolean method3126(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(12) int local12;
		if (Static302.anInt6103 <= 0) {
			for (local12 = 0; local12 < this.anIntArray313.length; local12++) {
				if (!arg1.method274(this.anIntArray313[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray313.length; local12++) {
				if (!arg1.method276(this.anIntArray313[local12], Static302.anInt6103)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray315.length; local12++) {
			if (!arg0.method5637(this.anIntArray315[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!am;IZIILclient!al;)[F")
	public float[] method3127(@OriginalArg(0) Class11 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface1 arg4) {
		Static219.anInterface1_5 = arg4;
		Static317.aClass11_142 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array19.length; local11++) {
			this.aClass4_Sub4Array19[local11].method5381(arg2, arg3);
		}
		Static39.method744(arg2, arg3);
		@Pc(44) float[] local44 = new float[arg3 * 4 * arg2];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg3; local48++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(64) int[] local64;
			if (this.aClass4_Sub4_2.aBoolean563) {
				@Pc(60) int[] local60 = this.aClass4_Sub4_2.method5380(local48);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass4_Sub4_2.method5383(local48);
				local64 = local74[2];
				local66 = local74[1];
				local62 = local74[0];
			}
			@Pc(96) int[] local96;
			if (this.aClass4_Sub4_3.aBoolean563) {
				local96 = this.aClass4_Sub4_3.method5380(local48);
			} else {
				local96 = this.aClass4_Sub4_3.method5383(local48)[0];
			}
			@Pc(116) int[] local116;
			if (this.aClass4_Sub4_1.aBoolean563) {
				local116 = this.aClass4_Sub4_1.method5380(local48);
			} else {
				local116 = this.aClass4_Sub4_1.method5383(local48)[0];
			}
			if (arg1) {
				local46 = local48 << 2;
			}
			for (@Pc(136) int local136 = arg2 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local116[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local44[local46++] = (float) local62[local136] * local172;
				local44[local46++] = local172 * (float) local66[local136];
				local44[local46++] = (float) local64[local136] * local172;
				local44[local46++] = local145;
				if (arg1) {
					local46 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass4_Sub4Array19.length; local229++) {
			this.aClass4_Sub4Array19[local229].method5390();
		}
		return local44;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!am;IZBILclient!al;D)[I")
	public int[] method3128(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface1 arg4, @OriginalArg(6) double arg5) {
		Static219.anInterface1_5 = arg4;
		Static317.aClass11_142 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub4Array19.length; local11++) {
			this.aClass4_Sub4Array19[local11].method5381(arg3, arg1);
		}
		Static156.method3017(arg5);
		Static39.method744(arg3, arg1);
		@Pc(45) int[] local45 = new int[arg1 * 4 * arg3];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg1; local49++) {
			@Pc(73) int[] local73;
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(81) int[] local81;
			if (this.aClass4_Sub4_2.aBoolean563) {
				local81 = this.aClass4_Sub4_2.method5380(local49);
				local73 = local81;
				local69 = local81;
				local65 = local81;
			} else {
				@Pc(61) int[][] local61 = this.aClass4_Sub4_2.method5383(local49);
				local65 = local61[1];
				local69 = local61[2];
				local73 = local61[0];
			}
			if (this.aClass4_Sub4_3.aBoolean563) {
				local81 = this.aClass4_Sub4_3.method5380(local49);
			} else {
				local81 = this.aClass4_Sub4_3.method5383(local49)[0];
			}
			if (arg2) {
				local47 = local49;
			}
			for (@Pc(115) int local115 = arg3 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local73[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(140) int local140 = local65[local115] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(155) int local155 = local69[local115] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local140 = Static122.anIntArray257[local140];
				local123 = Static122.anIntArray257[local123];
				if (local155 < 0) {
					local155 = 0;
				}
				local155 = Static122.anIntArray257[local155];
				@Pc(197) int local197;
				if (local123 == 0 && local140 == 0 && local155 == 0) {
					local197 = 0;
				} else {
					local197 = local81[local115] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local45[local47++] = local155 + (local197 << 24) + (local123 << 16) + (local140 << 8);
				if (arg2) {
					local47 += arg3 - 1;
				}
			}
		}
		for (@Pc(246) int local246 = 0; local246 < this.aClass4_Sub4Array19.length; local246++) {
			this.aClass4_Sub4Array19[local246].method5390();
		}
		return local45;
	}
}
