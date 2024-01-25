import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class2_Sub5_Sub13 extends Class2_Sub5 {

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "[I")
	private final int[] anIntArray443;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "[I")
	private final int[] anIntArray442;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!eg;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!eg;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "Lclient!eg;")
	private final Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "[Lclient!eg;")
	private final Class2_Sub2[] aClass2_Sub2Array28;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	private Class2_Sub5_Sub13() {
		this.anIntArray443 = new int[0];
		this.anIntArray442 = new int[0];
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub4(0);
		this.aClass2_Sub2_1.anInt7025 = 1;
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub4();
		this.aClass2_Sub2_2.anInt7025 = 1;
		this.aClass2_Sub2_3 = new Class2_Sub2_Sub4();
		this.aClass2_Sub2_3.anInt7025 = 1;
		this.aClass2_Sub2Array28 = new Class2_Sub2[] { this.aClass2_Sub2_2, this.aClass2_Sub2_3, this.aClass2_Sub2_1 };
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class2_Sub5_Sub13(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method3580();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub2Array28 = new Class2_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static72.method1078(arg0);
			if (local26.method5468() >= 0) {
				local9++;
			}
			if (local26.method5469() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass2_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method3580();
			}
			this.aClass2_Sub2Array28[local20] = local26;
		}
		this.anIntArray443 = new int[local9];
		local9 = 0;
		this.anIntArray442 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class2_Sub2 local95 = this.aClass2_Sub2Array28[local88];
			local47 = local95.aClass2_Sub2Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass2_Sub2Array42[local101] = this.aClass2_Sub2Array28[local14[local88][local101]];
			}
			@Pc(127) int local127 = local95.method5468();
			@Pc(131) int local131 = local95.method5469();
			if (local127 > 0) {
				this.anIntArray443[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray442[local11++] = local131;
			}
			local14[local88] = null;
		}
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array28[arg0.method3580()];
		this.aClass2_Sub2_3 = this.aClass2_Sub2Array28[arg0.method3580()];
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array28[arg0.method3580()];
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!l;Lclient!dk;B)Z")
	public boolean method4283(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(18) int local18;
		if (Static5.anInt74 >= 0) {
			for (local18 = 0; local18 < this.anIntArray443.length; local18++) {
				if (!arg1.method1112(Static5.anInt74, this.anIntArray443[local18])) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray443.length; local18++) {
				if (!arg1.method1131(this.anIntArray443[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray442.length; local18++) {
			if (!arg0.method1773(this.anIntArray442[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!dk;ZIIILclient!l;D)[I")
	public int[] method4286(@OriginalArg(0) Class54 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface9 arg4, @OriginalArg(6) double arg5) {
		Static316.aClass54_86 = arg0;
		Static243.anInterface9_5 = arg4;
		for (@Pc(19) int local19 = 0; local19 < this.aClass2_Sub2Array28.length; local19++) {
			this.aClass2_Sub2Array28[local19].method5466(arg3, arg2);
		}
		Static400.method5072(arg5);
		Static427.method5592(arg2, arg3);
		@Pc(49) int[] local49 = new int[arg2 * 4 * arg3];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg3; local53++) {
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub2_2.aBoolean509) {
				local85 = this.aClass2_Sub2_2.method5465(local53);
				local77 = local85;
				local73 = local85;
				local69 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass2_Sub2_2.method5471(local53);
				local69 = local65[2];
				local73 = local65[1];
				local77 = local65[0];
			}
			if (arg1) {
				local51 = local53;
			}
			if (this.aClass2_Sub2_3.aBoolean509) {
				local85 = this.aClass2_Sub2_3.method5465(local53);
			} else {
				local85 = this.aClass2_Sub2_3.method5471(local53)[0];
			}
			for (@Pc(119) int local119 = arg2 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local77[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(144) int local144 = local73[local119] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(162) int local162 = local69[local119] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				if (local162 < 0) {
					local162 = 0;
				}
				local127 = Static102.anIntArray150[local127];
				local144 = Static102.anIntArray150[local144];
				local162 = Static102.anIntArray150[local162];
				@Pc(201) int local201;
				if (local127 == 0 && local144 == 0 && local162 == 0) {
					local201 = 0;
				} else {
					local201 = local85[local119] >> 4;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 < 0) {
						local201 = 0;
					}
				}
				local49[local51++] = (local144 << 8) + (local127 << 16) + (local201 << 24) + local162;
				if (arg1) {
					local51 += arg2 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass2_Sub2Array28.length; local258++) {
			this.aClass2_Sub2Array28[local258].method5467();
		}
		return local49;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZIILclient!l;ILclient!dk;)[F")
	public float[] method4287(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface9 arg3, @OriginalArg(5) Class54 arg4) {
		Static316.aClass54_86 = arg4;
		Static243.anInterface9_5 = arg3;
		for (@Pc(19) int local19 = 0; local19 < this.aClass2_Sub2Array28.length; local19++) {
			this.aClass2_Sub2Array28[local19].method5466(arg2, arg1);
		}
		Static427.method5592(arg1, arg2);
		@Pc(46) float[] local46 = new float[arg1 * 4 * arg2];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg2; local50++) {
			@Pc(66) int[] local66;
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			if (this.aClass2_Sub2_2.aBoolean509) {
				@Pc(62) int[] local62 = this.aClass2_Sub2_2.method5465(local50);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass2_Sub2_2.method5471(local50);
				local64 = local76[2];
				local68 = local76[1];
				local66 = local76[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass2_Sub2_3.aBoolean509) {
				local98 = this.aClass2_Sub2_3.method5465(local50);
			} else {
				local98 = this.aClass2_Sub2_3.method5471(local50)[0];
			}
			if (arg0) {
				local48 = local50 << 2;
			}
			@Pc(124) int[] local124;
			if (this.aClass2_Sub2_1.aBoolean509) {
				local124 = this.aClass2_Sub2_1.method5465(local50);
			} else {
				local124 = this.aClass2_Sub2_1.method5471(local50)[0];
			}
			for (@Pc(138) int local138 = arg1 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local124[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local46[local48++] = local174 * (float) local66[local138];
				local46[local48++] = (float) local68[local138] * local174;
				local46[local48++] = (float) local64[local138] * local174;
				local46[local48++] = local147;
				if (arg0) {
					local48 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass2_Sub2Array28.length; local235++) {
			this.aClass2_Sub2Array28[local235].method5467();
		}
		return local46;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!l;IDLclient!dk;IZI)[I")
	public int[] method4288(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) Class54 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static243.anInterface9_5 = arg1;
		Static316.aClass54_86 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub2Array28.length; local11++) {
			this.aClass2_Sub2Array28[local11].method5466(arg6, arg2);
		}
		Static400.method5072(arg3);
		Static427.method5592(arg2, arg6);
		@Pc(43) int[] local43 = new int[arg6 * arg2];
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg0) {
			local47 = -1;
			local49 = -1;
			local53 = arg2 - 1;
		} else {
			local47 = arg2;
			local49 = 1;
			local53 = 0;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg6; local65++) {
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub2_2.aBoolean509) {
				@Pc(97) int[] local97 = this.aClass2_Sub2_2.method5465(local65);
				local85 = local97;
				local81 = local97;
				local89 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub2_2.method5471(local65);
				local81 = local77[0];
				local85 = local77[2];
				local89 = local77[1];
			}
			if (arg5) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local53; local109 != local47; local109 += local49) {
				@Pc(117) int local117 = local81[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local89[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(155) int local155 = local85[local109] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				local117 = Static102.anIntArray150[local117];
				local135 = Static102.anIntArray150[local135];
				local155 = Static102.anIntArray150[local155];
				@Pc(192) int local192 = local155 + (local117 << 16) + (local135 << 8);
				if (local192 != 0) {
					local192 |= 0xFF000000;
				}
				local43[local63++] = local192;
				if (arg5) {
					local63 += arg2 - 1;
				}
			}
		}
		for (@Pc(240) int local240 = 0; local240 < this.aClass2_Sub2Array28.length; local240++) {
			this.aClass2_Sub2Array28[local240].method5467();
		}
		return local43;
	}
}
