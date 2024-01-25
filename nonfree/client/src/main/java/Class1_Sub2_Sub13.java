import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
	private final int[] anIntArray527;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "[I")
	private final int[] anIntArray528;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!eu;")
	private final Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!eu;")
	private final Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!eu;")
	private final Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "[Lclient!eu;")
	private final Class1_Sub4[] aClass1_Sub4Array33;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub13() {
		this.anIntArray527 = new int[0];
		this.anIntArray528 = new int[0];
		this.aClass1_Sub4_3 = new Class1_Sub4_Sub21(0);
		this.aClass1_Sub4_3.anInt7279 = 1;
		this.aClass1_Sub4_2 = new Class1_Sub4_Sub21();
		this.aClass1_Sub4_2.anInt7279 = 1;
		this.aClass1_Sub4_1 = new Class1_Sub4_Sub21();
		this.aClass1_Sub4_1.anInt7279 = 1;
		this.aClass1_Sub4Array33 = new Class1_Sub4[] { this.aClass1_Sub4_2, this.aClass1_Sub4_1, this.aClass1_Sub4_3 };
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!hp;)V")
	public Class1_Sub2_Sub13(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(7) int local7 = arg0.method5366();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub4Array33 = new Class1_Sub4[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub4 local26 = Static401.method5344(arg0);
			if (local26.method5955() >= 0) {
				local9++;
			}
			if (local26.method5952() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub4Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method5366();
			}
			this.aClass1_Sub4Array33[local20] = local26;
		}
		this.anIntArray528 = new int[local9];
		local9 = 0;
		this.anIntArray527 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class1_Sub4 local95 = this.aClass1_Sub4Array33[local88];
			local47 = local95.aClass1_Sub4Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass1_Sub4Array42[local101] = this.aClass1_Sub4Array33[local14[local88][local101]];
			}
			@Pc(127) int local127 = local95.method5955();
			@Pc(131) int local131 = local95.method5952();
			if (local127 > 0) {
				this.anIntArray528[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray527[local11++] = local131;
			}
			local14[local88] = null;
		}
		this.aClass1_Sub4_2 = this.aClass1_Sub4Array33[arg0.method5366()];
		this.aClass1_Sub4_1 = this.aClass1_Sub4Array33[arg0.method5366()];
		this.aClass1_Sub4_3 = this.aClass1_Sub4Array33[arg0.method5366()];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ul;ILclient!ga;)Z")
	public boolean method4782(@OriginalArg(0) Class246 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(12) int local12;
		if (Static68.anInt1557 < 0) {
			for (local12 = 0; local12 < this.anIntArray528.length; local12++) {
				if (!arg0.method5497(this.anIntArray528[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray528.length; local12++) {
				if (!arg0.method5490(this.anIntArray528[local12], Static68.anInt1557)) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray527.length; local12++) {
			if (!arg1.method2454(this.anIntArray527[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZDLclient!ga;IILclient!ul;IZ)[I")
	public int[] method4783(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class246 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static124.anInterface4_15 = arg2;
		Static301.aClass246_162 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub4Array33.length; local11++) {
			this.aClass1_Sub4Array33[local11].method5954(arg5, arg3);
		}
		Static81.method1567(arg1);
		Static179.method2848(arg3, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg3];
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(43) byte local43;
		if (arg6) {
			local45 = arg3 - 1;
			local47 = -1;
			local43 = -1;
		} else {
			local43 = 1;
			local45 = 0;
			local47 = arg3;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg5; local61++) {
			@Pc(75) int[] local75;
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			if (this.aClass1_Sub4_2.aBoolean501) {
				@Pc(73) int[] local73 = this.aClass1_Sub4_2.method5957(local61);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass1_Sub4_2.method5951(local61);
				local77 = local87[2];
				local75 = local87[0];
				local79 = local87[1];
			}
			if (arg0) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local45; local105 != local47; local105 += local43) {
				@Pc(113) int local113 = local75[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(131) int local131 = local79[local105] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(149) int local149 = local77[local105] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				local113 = Static155.anIntArray268[local113];
				if (local149 < 0) {
					local149 = 0;
				}
				local131 = Static155.anIntArray268[local131];
				local149 = Static155.anIntArray268[local149];
				@Pc(183) int local183 = (local113 << 16) + (local131 << 8) + local149;
				if (local183 != 0) {
					local183 |= 0xFF000000;
				}
				local39[local59++] = local183;
				if (arg0) {
					local59 += arg3 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub4Array33.length; local224++) {
			this.aClass1_Sub4Array33[local224].method5953();
		}
		return local39;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(DILclient!ga;Lclient!ul;IZI)[I")
	public int[] method4784(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static124.anInterface4_15 = arg2;
		Static301.aClass246_162 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub4Array33.length; local11++) {
			this.aClass1_Sub4Array33[local11].method5954(arg1, arg5);
		}
		Static81.method1567(arg0);
		Static179.method2848(arg5, arg1);
		@Pc(41) int[] local41 = new int[arg1 * 4 * arg5];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(59) int[] local59;
			@Pc(57) int[] local57;
			if (this.aClass1_Sub4_2.aBoolean501) {
				local57 = this.aClass1_Sub4_2.method5957(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass1_Sub4_2.method5951(local45);
				local61 = local71[0];
				local63 = local71[1];
				local59 = local71[2];
			}
			if (arg4) {
				local43 = local45;
			}
			if (this.aClass1_Sub4_1.aBoolean501) {
				local57 = this.aClass1_Sub4_1.method5957(local45);
			} else {
				local57 = this.aClass1_Sub4_1.method5951(local45)[0];
			}
			for (@Pc(111) int local111 = arg5 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local61[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(134) int local134 = local63[local111] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(152) int local152 = local59[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local119 = Static155.anIntArray268[local119];
				if (local152 < 0) {
					local152 = 0;
				}
				local134 = Static155.anIntArray268[local134];
				local152 = Static155.anIntArray268[local152];
				@Pc(195) int local195;
				if (local119 == 0 && local134 == 0 && local152 == 0) {
					local195 = 0;
				} else {
					local195 = local57[local111] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local41[local43++] = (local195 << 24) + (local119 << 16) + (local134 << 8) + local152;
				if (arg4) {
					local43 += arg5 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass1_Sub4Array33.length; local261++) {
			this.aClass1_Sub4Array33[local261].method5953();
		}
		return local41;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZBLclient!ga;Lclient!ul;)[F")
	public float[] method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Class246 arg4) {
		Static124.anInterface4_15 = arg3;
		Static301.aClass246_162 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub4Array33.length; local11++) {
			this.aClass1_Sub4Array33[local11].method5954(arg0, arg1);
		}
		Static179.method2848(arg1, arg0);
		@Pc(50) float[] local50 = new float[arg0 * 4 * arg1];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg0; local54++) {
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			if (this.aClass1_Sub4_2.aBoolean501) {
				@Pc(86) int[] local86 = this.aClass1_Sub4_2.method5957(local54);
				local74 = local86;
				local70 = local86;
				local78 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass1_Sub4_2.method5951(local54);
				local70 = local66[0];
				local74 = local66[1];
				local78 = local66[2];
			}
			@Pc(102) int[] local102;
			if (this.aClass1_Sub4_1.aBoolean501) {
				local102 = this.aClass1_Sub4_1.method5957(local54);
			} else {
				local102 = this.aClass1_Sub4_1.method5951(local54)[0];
			}
			if (arg2) {
				local52 = local54 << 2;
			}
			@Pc(132) int[] local132;
			if (this.aClass1_Sub4_3.aBoolean501) {
				local132 = this.aClass1_Sub4_3.method5957(local54);
			} else {
				local132 = this.aClass1_Sub4_3.method5951(local54)[0];
			}
			for (@Pc(144) int local144 = arg1 - 1; local144 >= 0; local144--) {
				@Pc(153) float local153 = (float) local102[local144] / 4096.0F;
				@Pc(166) float local166 = ((float) local132[local144] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local153 < 0.0F) {
					local153 = 0.0F;
				} else if (local153 > 1.0F) {
					local153 = 1.0F;
				}
				local50[local52++] = (float) local70[local144] * local166;
				local50[local52++] = local166 * (float) local74[local144];
				local50[local52++] = (float) local78[local144] * local166;
				local50[local52++] = local153;
				if (arg2) {
					local52 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass1_Sub4Array33.length; local238++) {
			this.aClass1_Sub4Array33[local238].method5953();
		}
		return local50;
	}
}
