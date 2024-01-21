import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class29 {

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Z")
	public boolean aBoolean46;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	private void method622() {
		@Pc(2) long local2 = this.aLong24;
		@Pc(11) int local11 = this.anIntArray126[5];
		@Pc(16) int local16 = this.anIntArray126[9];
		this.anIntArray126[5] = local16;
		this.anIntArray126[9] = local11;
		this.aLong24 = 0L;
		for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
			this.aLong24 <<= 0x4;
			if (this.anIntArray126[local31] >= 256) {
				this.aLong24 += this.anIntArray126[local31] - 256;
			}
		}
		if (this.anIntArray126[0] >= 256) {
			this.aLong24 += this.anIntArray126[0] - 256 >> 4;
		}
		if (this.anIntArray126[1] >= 256) {
			this.aLong24 += this.anIntArray126[1] - 256 >> 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong24 <<= 0x3;
			this.aLong24 += this.anIntArray125[local114];
		}
		this.aLong24 <<= 0x1;
		this.aLong24 += this.aBoolean46 ? 1 : 0;
		this.anIntArray126[5] = local11;
		this.anIntArray126[9] = local16;
		if (local2 != 0L && this.aLong24 != local2) {
			Static89.aClass37_24.method978(local2);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V")
	public void method623(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean46) {
			this.method634(arg0, this.anIntArray125, null, -1);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I")
	public int method624() {
		return this.anInt916 == -1 ? this.anIntArray126[1] + (this.anIntArray126[11] << 5) + (this.anIntArray126[8] << 10) + (this.anIntArray126[0] << 15) + (this.anIntArray125[0] << 25) + (this.anIntArray125[4] << 20) : Static43.method771(this.anInt916).anInt771 + 305419896;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ka;)V")
	public void method626(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.method1185(this.aBoolean46 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray126[Static2.anIntArray13[local16]];
			if (local25 == 0) {
				arg0.method1185(-1);
			} else {
				arg0.method1185(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1185(this.anIntArray125[local25]);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZZ)V")
	public void method627(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean46) {
			return;
		}
		@Pc(17) int local17 = this.anIntArray126[Static2.anIntArray13[arg0]];
		if (local17 == 0) {
			return;
		}
		local17 -= 256;
		@Pc(52) Class1_Sub1_Sub10 local52;
		do {
			if (arg1) {
				local17++;
				if (local17 >= Static49.anInt1278) {
					local17 = 0;
				}
			} else {
				local17--;
				if (local17 < 0) {
					local17 = Static49.anInt1278 - 1;
				}
			}
			local52 = Static12.method272(local17);
		} while (local52 == null || local52.aBoolean81 || local52.anInt1375 != (this.aBoolean46 ? 7 : 0) + arg0);
		this.anIntArray126[Static2.anIntArray13[arg0]] = local17 + 256;
		this.method622();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZBI)V")
	public void method629(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray125[arg1];
		if (arg0) {
			local16++;
			if (local16 >= Static45.anIntArrayArray18[arg1].length) {
				local16 = 0;
			}
		} else {
			local16--;
			if (local16 < 0) {
				local16 = Static45.anIntArrayArray18[arg1].length - 1;
			}
		}
		this.anIntArray125[arg1] = local16;
		this.method622();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!s;Lclient!s;B)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub14 arg2, @OriginalArg(3) Class1_Sub1_Sub14 arg3) {
		if (this.anInt916 != -1) {
			return Static43.method771(this.anInt916).method549(arg2, arg1, arg0, arg3);
		}
		@Pc(23) long local23 = this.aLong24;
		@Pc(26) int[] local26 = this.anIntArray126;
		if (arg3 != null && (arg3.anInt2308 >= 0 || arg3.anInt2321 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray126[local42];
			}
			if (arg3.anInt2308 >= 0) {
				local23 += arg3.anInt2308 - this.anIntArray126[5] << 8;
				local26[5] = arg3.anInt2308;
			}
			if (arg3.anInt2321 >= 0) {
				local23 += arg3.anInt2321 - this.anIntArray126[3] << 16;
				local26[3] = arg3.anInt2321;
			}
		}
		@Pc(112) Class1_Sub1_Sub8_Sub3 local112 = (Class1_Sub1_Sub8_Sub3) Static89.aClass37_24.method982(local23);
		if (local112 == null) {
			@Pc(116) boolean local116 = false;
			for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
				@Pc(124) int local124 = local26[local118];
				if (local124 >= 256 && local124 < 512 && !Static12.method272(local124 - 256).method967()) {
					local116 = true;
				}
				if (local124 >= 512 && !Static36.method617(local124 - 512).method148(this.aBoolean46)) {
					local116 = true;
				}
			}
			if (local116) {
				if (this.aLong25 != -1L) {
					local112 = (Class1_Sub1_Sub8_Sub3) Static89.aClass37_24.method982(this.aLong25);
				}
				if (local112 == null) {
					return null;
				}
			}
			if (local112 == null) {
				@Pc(188) Class1_Sub1_Sub8_Sub3[] local188 = new Class1_Sub1_Sub8_Sub3[12];
				@Pc(190) int local190 = 0;
				@Pc(198) int local198;
				for (@Pc(192) int local192 = 0; local192 < 12; local192++) {
					local198 = local26[local192];
					@Pc(216) Class1_Sub1_Sub8_Sub3 local216;
					if (local198 >= 256 && local198 < 512) {
						local216 = Static12.method272(local198 - 256).method962();
						if (local216 != null) {
							local188[local190++] = local216;
						}
					}
					if (local198 >= 512) {
						local216 = Static36.method617(local198 - 512).method156(this.aBoolean46);
						if (local216 != null) {
							local188[local190++] = local216;
						}
					}
				}
				local112 = new Class1_Sub1_Sub8_Sub3(local188, local190);
				for (local198 = 0; local198 < 5; local198++) {
					if (this.anIntArray125[local198] != 0) {
						local112.method1383(Static45.anIntArrayArray18[local198][0], Static45.anIntArrayArray18[local198][this.anIntArray125[local198]]);
						if (local198 == 1) {
							local112.method1383(Static56.anIntArray213[0], Static56.anIntArray213[this.anIntArray125[local198]]);
						}
					}
				}
				local112.method1377();
				local112.method1394(64, 850, -30, -50, -30, true);
				Static89.aClass37_24.method981(local23, local112);
				this.aLong25 = local23;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local112;
		}
		@Pc(338) Class1_Sub1_Sub8_Sub3 local338;
		if (arg3 != null && arg2 != null) {
			local338 = arg3.method1620(arg2, arg1, local112, arg0);
		} else if (arg3 == null) {
			local338 = arg2.method1611(local112, arg1);
		} else {
			local338 = arg3.method1611(local112, arg0);
		}
		return local338;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method633() {
		if (this.anInt916 != -1) {
			return Static43.method771(this.anInt916).method540();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray126[local20];
			if (local27 >= 256 && local27 < 512 && !Static12.method272(local27 - 256).method968()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static36.method617(local27 - 512).method149(this.aBoolean46)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(73) Class1_Sub1_Sub8_Sub3[] local73 = new Class1_Sub1_Sub8_Sub3[12];
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
			@Pc(84) int local84 = this.anIntArray126[local77];
			@Pc(98) Class1_Sub1_Sub8_Sub3 local98;
			if (local84 >= 256 && local84 < 512) {
				local98 = Static12.method272(local84 - 256).method970();
				if (local98 != null) {
					local73[local75++] = local98;
				}
			}
			if (local84 >= 512) {
				local98 = Static36.method617(local84 - 512).method159(this.aBoolean46);
				if (local98 != null) {
					local73[local75++] = local98;
				}
			}
		}
		@Pc(135) Class1_Sub1_Sub8_Sub3 local135 = new Class1_Sub1_Sub8_Sub3(local73, local75);
		for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
			if (this.anIntArray125[local142] != 0) {
				local135.method1383(Static45.anIntArrayArray18[local142][0], Static45.anIntArrayArray18[local142][this.anIntArray125[local142]]);
				if (local142 == 1) {
					local135.method1383(Static56.anIntArray213[0], Static56.anIntArray213[this.anIntArray125[local142]]);
				}
			}
		}
		return local135;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[I[IBI)V")
	public void method634(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static49.anInt1278; local9++) {
					@Pc(14) Class1_Sub1_Sub10 local14 = Static12.method272(local9);
					if (local14 != null && !local14.aBoolean81 && local6 + (arg0 ? 7 : 0) == local14.anInt1375) {
						arg2[Static2.anIntArray13[local6]] = local9 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray126 = arg2;
		this.anIntArray125 = arg1;
		this.anInt916 = arg3;
		this.aBoolean46 = arg0;
		this.method622();
	}
}
