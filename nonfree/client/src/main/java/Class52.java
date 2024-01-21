import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class52 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
	public boolean aBoolean75;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt1965;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V")
	public void method1192(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean75) {
			this.method1196(null, this.anIntArray254, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1195(@OriginalArg(1) Class8_Sub20 arg0) {
		arg0.method1883(this.aBoolean75 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray256[Static48.anIntArray392[local16]];
			if (local25 == 0) {
				arg0.method1883(-1);
			} else {
				arg0.method1883(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1883(this.anIntArray254[local25]);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[IIZI)V")
	public void method1196(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static48.anInt2954; local16++) {
					@Pc(22) Class8_Sub1_Sub7 local22 = Static14.method234(local16);
					if (local22 != null && !local22.aBoolean40 && local22.anInt833 == (arg2 ? 7 : 0) + local12) {
						arg0[Static48.anIntArray392[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray254 = arg1;
		this.anInt1965 = arg3;
		this.aBoolean75 = arg2;
		this.anIntArray256 = arg0;
		this.method1199();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	private void method1199() {
		@Pc(12) long local12 = this.aLong66;
		this.aLong66 = 0L;
		@Pc(24) int local24 = this.anIntArray256[9];
		@Pc(29) int local29 = this.anIntArray256[5];
		this.anIntArray256[9] = local29;
		this.anIntArray256[5] = local24;
		for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
			this.aLong66 <<= 0x4;
			if (this.anIntArray256[local41] >= 256) {
				this.aLong66 += this.anIntArray256[local41] - 256;
			}
		}
		if (this.anIntArray256[0] >= 256) {
			this.aLong66 += this.anIntArray256[0] - 256 >> 4;
		}
		if (this.anIntArray256[1] >= 256) {
			this.aLong66 += this.anIntArray256[1] - 256 >> 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			this.aLong66 <<= 0x3;
			this.aLong66 += this.anIntArray254[local117];
		}
		this.anIntArray256[9] = local24;
		this.anIntArray256[5] = local29;
		this.aLong66 <<= 0x1;
		this.aLong66 += this.aBoolean75 ? 1 : 0;
		if (local12 != 0L && local12 != this.aLong66) {
			Static130.aClass48_58.method1096(local12);
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method1202() {
		if (this.anInt1965 != -1) {
			return Static18.method308(this.anInt1965).method1500();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(28) int local28 = 0; local28 < 12; local28++) {
			@Pc(35) int local35 = this.anIntArray256[local28];
			if (local35 >= 256 && local35 < 512 && !Static14.method234(local35 - 256).method520()) {
				local19 = true;
			}
			if (local35 >= 512 && !Static7.method49(local35 - 512).method1069(this.aBoolean75)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(84) int local84 = 0;
		@Pc(87) Class8_Sub1_Sub1_Sub3[] local87 = new Class8_Sub1_Sub1_Sub3[12];
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(96) int local96 = this.anIntArray256[local89];
			@Pc(114) Class8_Sub1_Sub1_Sub3 local114;
			if (local96 >= 256 && local96 < 512) {
				local114 = Static14.method234(local96 - 256).method522();
				if (local114 != null) {
					local87[local84++] = local114;
				}
			}
			if (local96 >= 512) {
				local114 = Static7.method49(local96 - 512).method1071(this.aBoolean75);
				if (local114 != null) {
					local87[local84++] = local114;
				}
			}
		}
		@Pc(151) Class8_Sub1_Sub1_Sub3 local151 = new Class8_Sub1_Sub1_Sub3(local87, local84);
		for (@Pc(153) int local153 = 0; local153 < 5; local153++) {
			if (this.anIntArray254[local153] < Static47.aShortArrayArray4[local153].length) {
				local151.method490(Static79.aShortArray32[local153], Static47.aShortArrayArray4[local153][this.anIntArray254[local153]]);
			}
			if (this.anIntArray254[local153] < Static27.aShortArrayArray1[local153].length) {
				local151.method490(Static47.aShortArray27[local153], Static27.aShortArrayArray1[local153][this.anIntArray254[local153]]);
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBLclient!dc;Lclient!dc;)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub1_Sub6 arg2, @OriginalArg(4) Class8_Sub1_Sub6 arg3) {
		if (this.anInt1965 != -1) {
			return Static18.method308(this.anInt1965).method1508(arg2, arg0, arg3, arg1);
		}
		@Pc(24) long local24 = this.aLong66;
		@Pc(27) int[] local27 = this.anIntArray256;
		if (arg2 != null && (arg2.anInt707 >= 0 || arg2.anInt719 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray256[local43];
			}
			if (arg2.anInt707 >= 0) {
				local24 += arg2.anInt707 - this.anIntArray256[5] << 8;
				local27[5] = arg2.anInt707;
			}
			if (arg2.anInt719 >= 0) {
				local24 += arg2.anInt719 - this.anIntArray256[3] << 16;
				local27[3] = arg2.anInt719;
			}
		}
		@Pc(112) Class8_Sub1_Sub1_Sub6 local112 = (Class8_Sub1_Sub1_Sub6) Static130.aClass48_58.method1100(local24);
		if (local112 == null) {
			@Pc(116) boolean local116 = false;
			for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
				@Pc(124) int local124 = local27[local118];
				if (local124 >= 256 && local124 < 512 && !Static14.method234(local124 - 256).method514()) {
					local116 = true;
				}
				if (local124 >= 512 && !Static7.method49(local124 - 512).method1073(this.aBoolean75)) {
					local116 = true;
				}
			}
			if (local116) {
				if (this.aLong67 != -1L) {
					local112 = (Class8_Sub1_Sub1_Sub6) Static130.aClass48_58.method1100(this.aLong67);
				}
				if (local112 == null) {
					return null;
				}
			}
			if (local112 == null) {
				@Pc(186) Class8_Sub1_Sub1_Sub3[] local186 = new Class8_Sub1_Sub1_Sub3[12];
				@Pc(188) int local188 = 0;
				for (@Pc(190) int local190 = 0; local190 < 12; local190++) {
					@Pc(196) int local196 = local27[local190];
					@Pc(212) Class8_Sub1_Sub1_Sub3 local212;
					if (local196 >= 256 && local196 < 512) {
						local212 = Static14.method234(local196 - 256).method516();
						if (local212 != null) {
							local186[local188++] = local212;
						}
					}
					if (local196 >= 512) {
						local212 = Static7.method49(local196 - 512).method1080(this.aBoolean75);
						if (local212 != null) {
							local186[local188++] = local212;
						}
					}
				}
				@Pc(249) Class8_Sub1_Sub1_Sub3 local249 = new Class8_Sub1_Sub1_Sub3(local186, local188);
				for (@Pc(251) int local251 = 0; local251 < 5; local251++) {
					if (Static47.aShortArrayArray4[local251].length > this.anIntArray254[local251]) {
						local249.method490(Static79.aShortArray32[local251], Static47.aShortArrayArray4[local251][this.anIntArray254[local251]]);
					}
					if (Static27.aShortArrayArray1[local251].length > this.anIntArray254[local251]) {
						local249.method490(Static47.aShortArray27[local251], Static27.aShortArrayArray1[local251][this.anIntArray254[local251]]);
					}
				}
				local112 = local249.method479(64, 850, -30, -50, -30);
				Static130.aClass48_58.method1097(local112, local24);
				this.aLong67 = local24;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local112;
		}
		@Pc(345) Class8_Sub1_Sub1_Sub6 local345;
		if (arg2 != null && arg3 != null) {
			local345 = arg2.method425(arg0, arg3, arg1, local112);
		} else if (arg2 == null) {
			local345 = arg3.method421(arg0, local112);
		} else {
			local345 = arg2.method421(arg1, local112);
		}
		return local345;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZB)V")
	public void method1204(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean75) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray256[Static48.anIntArray392[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(55) Class8_Sub1_Sub7 local55;
		do {
			if (arg1) {
				local19++;
				if (Static48.anInt2954 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static48.anInt2954 - 1;
				}
			}
			local55 = Static14.method234(local19);
		} while (local55 == null || local55.aBoolean40 || local55.anInt833 != (this.aBoolean75 ? 7 : 0) + arg0);
		this.anIntArray256[Static48.anIntArray392[arg0]] = local19 + 256;
		this.method1199();
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
	public int method1205() {
		return this.anInt1965 == -1 ? this.anIntArray256[1] + (this.anIntArray256[0] << 15) + (this.anIntArray254[0] << 25) - (-(this.anIntArray254[4] << 20) + (-(this.anIntArray256[8] << 10) - (this.anIntArray256[11] << 5))) : Static18.method308(this.anInt1965).anInt2428 + 305419896;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)V")
	public void method1206(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray254[arg1];
		if (arg0) {
			local16++;
			if (local16 >= Static47.aShortArrayArray4[arg1].length) {
				local16 = 0;
			}
		} else {
			local16--;
			if (local16 < 0) {
				local16 = Static47.aShortArrayArray4[arg1].length - 1;
			}
		}
		this.anIntArray254[arg1] = local16;
		this.method1199();
	}
}
