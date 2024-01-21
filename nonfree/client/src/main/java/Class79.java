import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class79 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Z")
	public boolean aBoolean243;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!h;IILclient!h;I)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method1981(@OriginalArg(0) Class2_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3146 != -1) {
			return Static23.method462(this.anInt3146).method1575(arg0, arg3, arg1, arg2);
		}
		@Pc(31) long local31 = this.aLong94;
		@Pc(34) int[] local34 = this.anIntArray409;
		if (arg0 != null && (arg0.anInt1357 >= 0 || arg0.anInt1338 >= 0)) {
			local34 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local34[local50] = this.anIntArray409[local50];
			}
			if (arg0.anInt1357 >= 0) {
				local31 += arg0.anInt1357 - this.anIntArray409[5] << 8;
				local34[5] = arg0.anInt1357;
			}
			if (arg0.anInt1338 >= 0) {
				local31 += arg0.anInt1338 - this.anIntArray409[3] << 16;
				local34[3] = arg0.anInt1338;
			}
		}
		@Pc(118) Class2_Sub1_Sub1_Sub2 local118 = (Class2_Sub1_Sub1_Sub2) Static40.aClass32_23.method887(local31);
		if (local118 == null) {
			@Pc(122) boolean local122 = false;
			for (@Pc(124) int local124 = 0; local124 < 12; local124++) {
				@Pc(130) int local130 = local34[local124];
				if (local130 >= 256 && local130 < 512 && !Static118.method1943(local130 - 256).method176()) {
					local122 = true;
				}
				if (local130 >= 512 && !Static4.method95(local130 - 512).method437(this.aBoolean243)) {
					local122 = true;
				}
			}
			if (local122) {
				if (this.aLong93 != -1L) {
					local118 = (Class2_Sub1_Sub1_Sub2) Static40.aClass32_23.method887(this.aLong93);
				}
				if (local118 == null) {
					return null;
				}
			}
			if (local118 == null) {
				@Pc(194) Class2_Sub1_Sub1_Sub6[] local194 = new Class2_Sub1_Sub1_Sub6[12];
				@Pc(196) int local196 = 0;
				for (@Pc(198) int local198 = 0; local198 < 12; local198++) {
					@Pc(204) int local204 = local34[local198];
					@Pc(220) Class2_Sub1_Sub1_Sub6 local220;
					if (local204 >= 256 && local204 < 512) {
						local220 = Static118.method1943(local204 - 256).method172();
						if (local220 != null) {
							local194[local196++] = local220;
						}
					}
					if (local204 >= 512) {
						local220 = Static4.method95(local204 - 512).method435(this.aBoolean243);
						if (local220 != null) {
							local194[local196++] = local220;
						}
					}
				}
				@Pc(259) Class2_Sub1_Sub1_Sub6 local259 = new Class2_Sub1_Sub1_Sub6(local194, local196);
				for (@Pc(261) int local261 = 0; local261 < 5; local261++) {
					if (this.anIntArray408[local261] != 0) {
						local259.method559(Static57.aShortArrayArray1[local261][0], Static57.aShortArrayArray1[local261][this.anIntArray408[local261]]);
						if (local261 == 1) {
							local259.method559(Static20.aShortArray6[0], Static20.aShortArray6[this.anIntArray408[local261]]);
						}
					}
				}
				local118 = local259.method548(64, 850, -30, -50, -30);
				Static40.aClass32_23.method880(local118, local31);
				this.aLong93 = local31;
			}
		}
		if (arg0 == null && arg2 == null) {
			return local118;
		}
		@Pc(337) Class2_Sub1_Sub1_Sub2 local337;
		if (arg0 != null && arg2 != null) {
			local337 = arg0.method741(arg1, local118, arg3, arg2);
		} else if (arg0 == null) {
			local337 = arg2.method737(local118, arg1);
		} else {
			local337 = arg0.method737(local118, arg3);
		}
		return local337;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIB)V")
	public void method1982(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray408[arg1];
		if (arg0) {
			local8++;
			if (Static57.aShortArrayArray1[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static57.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray408[arg1] = local8;
		this.method1991();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V")
	public void method1984(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean243) {
			this.method1988(arg0, null, this.anIntArray408, -1);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
	public void method1985(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean243) {
			return;
		}
		@Pc(25) int local25 = this.anIntArray409[Static86.anIntArray281[arg1]];
		if (local25 == 0) {
			return;
		}
		local25 -= 256;
		@Pc(56) Class2_Sub1_Sub4 local56;
		do {
			if (arg0) {
				local25++;
				if (local25 >= Static30.anInt1079) {
					local25 = 0;
				}
			} else {
				local25--;
				if (local25 < 0) {
					local25 = Static30.anInt1079 - 1;
				}
			}
			local56 = Static118.method1943(local25);
		} while (local56 == null || local56.aBoolean27 || (this.aBoolean243 ? 7 : 0) + arg1 != local56.anInt290);
		this.anIntArray409[Static86.anIntArray281[arg1]] = local25 + 256;
		this.method1991();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
	public int method1987() {
		return this.anInt3146 == -1 ? (this.anIntArray409[11] << 5) + (this.anIntArray409[0] << 15) + (this.anIntArray408[0] << 25) + (this.anIntArray408[4] << 20) + (this.anIntArray409[8] << 10) + this.anIntArray409[1] : 305419896 - -Static23.method462(this.anInt3146).anInt2570;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[IZ[II)V")
	public void method1988(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(15) int local15 = 0; local15 < 7; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static30.anInt1079; local19++) {
					@Pc(25) Class2_Sub1_Sub4 local25 = Static118.method1943(local19);
					if (local25 != null && !local25.aBoolean27 && local25.anInt290 == (arg0 ? 7 : 0) + local15) {
						arg1[Static86.anIntArray281[local15]] = local19 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray408 = arg2;
		this.anInt3146 = arg3;
		this.anIntArray409 = arg1;
		this.aBoolean243 = arg0;
		this.method1991();
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!de;")
	public Class2_Sub1_Sub1_Sub6 method1990() {
		if (this.anInt3146 != -1) {
			return Static23.method462(this.anInt3146).method1579();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray409[local21];
			if (local28 >= 256 && local28 < 512 && !Static118.method1943(local28 - 256).method171()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static4.method95(local28 - 512).method424(this.aBoolean243)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(81) Class2_Sub1_Sub1_Sub6[] local81 = new Class2_Sub1_Sub1_Sub6[12];
		@Pc(83) int local83 = 0;
		for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
			@Pc(92) int local92 = this.anIntArray409[local85];
			@Pc(108) Class2_Sub1_Sub1_Sub6 local108;
			if (local92 >= 256 && local92 < 512) {
				local108 = Static118.method1943(local92 - 256).method169();
				if (local108 != null) {
					local81[local83++] = local108;
				}
			}
			if (local92 >= 512) {
				local108 = Static4.method95(local92 - 512).method425(this.aBoolean243);
				if (local108 != null) {
					local81[local83++] = local108;
				}
			}
		}
		@Pc(149) Class2_Sub1_Sub1_Sub6 local149 = new Class2_Sub1_Sub1_Sub6(local81, local83);
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			if (this.anIntArray408[local151] != 0) {
				local149.method559(Static57.aShortArrayArray1[local151][0], Static57.aShortArrayArray1[local151][this.anIntArray408[local151]]);
				if (local151 == 1) {
					local149.method559(Static20.aShortArray6[0], Static20.aShortArray6[this.anIntArray408[local151]]);
				}
			}
		}
		return local149;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	private void method1991() {
		@Pc(8) long local8 = this.aLong94;
		@Pc(13) int local13 = this.anIntArray409[5];
		@Pc(18) int local18 = this.anIntArray409[9];
		this.anIntArray409[5] = local18;
		this.aLong94 = 0L;
		this.anIntArray409[9] = local13;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong94 <<= 0x4;
			if (this.anIntArray409[local33] >= 256) {
				this.aLong94 += this.anIntArray409[local33] - 256;
			}
		}
		if (this.anIntArray409[0] >= 256) {
			this.aLong94 += this.anIntArray409[0] - 256 >> 4;
		}
		if (this.anIntArray409[1] >= 256) {
			this.aLong94 += this.anIntArray409[1] - 256 >> 8;
		}
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			this.aLong94 <<= 0x3;
			this.aLong94 += this.anIntArray408[local107];
		}
		this.anIntArray409[5] = local13;
		this.anIntArray409[9] = local18;
		this.aLong94 <<= 0x1;
		this.aLong94 += this.aBoolean243 ? 1 : 0;
		if (local8 != 0L && this.aLong94 != local8) {
			Static40.aClass32_23.method885(local8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!wb;)V")
	public void method1994(@OriginalArg(1) Class2_Sub17 arg0) {
		arg0.method1769(this.aBoolean243 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray409[Static86.anIntArray281[local16]];
			if (local25 == 0) {
				arg0.method1769(-1);
			} else {
				arg0.method1769(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1769(this.anIntArray408[local25]);
		}
	}
}
