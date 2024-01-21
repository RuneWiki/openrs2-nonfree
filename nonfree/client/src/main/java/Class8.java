import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class8 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZZ)V")
	public void method325(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = this.anIntArray26[arg0];
		if (arg1) {
			local14++;
			if (Static72.anIntArrayArray16[arg0].length <= local14) {
				local14 = 0;
			}
		} else {
			local14--;
			if (local14 < 0) {
				local14 = Static72.anIntArrayArray16[arg0].length - 1;
			}
		}
		this.anIntArray26[arg0] = local14;
		this.method336();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!b;I)V")
	public void method328(@OriginalArg(0) Class6_Sub1 arg0) {
		arg0.method1501(this.aBoolean21 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray25[Static107.anIntArray292[local12]];
			if (local21 == 0) {
				arg0.method1501(-1);
			} else {
				arg0.method1501(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method1501(this.anIntArray26[local21]);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	public int method329() {
		return this.anInt372 == -1 ? (this.anIntArray25[11] << 5) + (this.anIntArray26[4] << 20) + (this.anIntArray26[0] << 25) + (this.anIntArray25[0] << 15) + (this.anIntArray25[8] << 10) + this.anIntArray25[1] : Static8.method326(this.anInt372).anInt858 + 305419896;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[I[III)V")
	public void method330(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static33.anInt1274; local16++) {
					@Pc(22) Class6_Sub2_Sub10 local22 = Static58.method1194(local16);
					if (local22 != null && !local22.aBoolean117 && local22.anInt2516 == (arg0 ? 7 : 0) + local12) {
						arg2[Static107.anIntArray292[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt372 = arg3;
		this.aBoolean21 = arg0;
		this.anIntArray25 = arg2;
		this.anIntArray26 = arg1;
		this.method336();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!tb;Lclient!tb;I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub13 arg2, @OriginalArg(3) Class6_Sub2_Sub13 arg3) {
		if (this.anInt372 != -1) {
			return Static8.method326(this.anInt372).method537(arg0, arg3, arg1, arg2);
		}
		@Pc(27) int[] local27 = this.anIntArray25;
		@Pc(30) long local30 = this.aLong20;
		if (arg2 != null && (arg2.anInt2815 >= 0 || arg2.anInt2821 >= 0)) {
			local27 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local27[local49] = this.anIntArray25[local49];
			}
			if (arg2.anInt2815 >= 0) {
				local30 += arg2.anInt2815 - this.anIntArray25[5] << 8;
				local27[5] = arg2.anInt2815;
			}
			if (arg2.anInt2821 >= 0) {
				local30 += arg2.anInt2821 - this.anIntArray25[3] << 16;
				local27[3] = arg2.anInt2821;
			}
		}
		@Pc(119) Class6_Sub2_Sub3_Sub3 local119 = (Class6_Sub2_Sub3_Sub3) Static9.aClass36_6.method1154(local30);
		if (local119 == null) {
			@Pc(123) boolean local123 = false;
			for (@Pc(125) int local125 = 0; local125 < 12; local125++) {
				@Pc(131) int local131 = local27[local125];
				if (local131 >= 256 && local131 < 512 && !Static58.method1194(local131 - 256).method1722()) {
					local123 = true;
				}
				if (local131 >= 512 && !Static58.method1195(local131 - 512).method695(this.aBoolean21)) {
					local123 = true;
				}
			}
			if (local123) {
				if (this.aLong19 != -1L) {
					local119 = (Class6_Sub2_Sub3_Sub3) Static9.aClass36_6.method1154(this.aLong19);
				}
				if (local119 == null) {
					return null;
				}
			}
			if (local119 == null) {
				@Pc(193) Class6_Sub2_Sub3_Sub3[] local193 = new Class6_Sub2_Sub3_Sub3[12];
				@Pc(195) int local195 = 0;
				@Pc(203) int local203;
				for (@Pc(197) int local197 = 0; local197 < 12; local197++) {
					local203 = local27[local197];
					@Pc(221) Class6_Sub2_Sub3_Sub3 local221;
					if (local203 >= 256 && local203 < 512) {
						local221 = Static58.method1194(local203 - 256).method1723();
						if (local221 != null) {
							local193[local195++] = local221;
						}
					}
					if (local203 >= 512) {
						local221 = Static58.method1195(local203 - 512).method691(this.aBoolean21);
						if (local221 != null) {
							local193[local195++] = local221;
						}
					}
				}
				local119 = new Class6_Sub2_Sub3_Sub3(local193, local195);
				for (local203 = 0; local203 < 5; local203++) {
					if (this.anIntArray26[local203] != 0) {
						local119.method961(Static72.anIntArrayArray16[local203][0], Static72.anIntArrayArray16[local203][this.anIntArray26[local203]]);
						if (local203 == 1) {
							local119.method961(Static7.anIntArray19[0], Static7.anIntArray19[this.anIntArray26[local203]]);
						}
					}
				}
				local119.method978();
				local119.method965(64, 850, -30, -50, -30, true);
				Static9.aClass36_6.method1161(local30, local119);
				this.aLong19 = local30;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local119;
		}
		@Pc(339) Class6_Sub2_Sub3_Sub3 local339;
		if (arg2 != null && arg3 != null) {
			local339 = arg2.method1862(arg1, arg3, local119, arg0);
		} else if (arg2 == null) {
			local339 = arg3.method1857(arg0, local119);
		} else {
			local339 = arg2.method1857(arg1, local119);
		}
		return local339;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method332() {
		if (this.anInt372 != -1) {
			return Static8.method326(this.anInt372).method543();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray25[local21];
			if (local28 >= 256 && local28 < 512 && !Static58.method1194(local28 - 256).method1719()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static58.method1195(local28 - 512).method694(this.aBoolean21)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class6_Sub2_Sub3_Sub3[] local74 = new Class6_Sub2_Sub3_Sub3[12];
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
			@Pc(92) int local92 = this.anIntArray25[local78];
			@Pc(112) Class6_Sub2_Sub3_Sub3 local112;
			if (local92 >= 256 && local92 < 512) {
				local112 = Static58.method1194(local92 - 256).method1720();
				if (local112 != null) {
					local74[local76++] = local112;
				}
			}
			if (local92 >= 512) {
				local112 = Static58.method1195(local92 - 512).method700(this.aBoolean21);
				if (local112 != null) {
					local74[local76++] = local112;
				}
			}
		}
		@Pc(149) Class6_Sub2_Sub3_Sub3 local149 = new Class6_Sub2_Sub3_Sub3(local74, local76);
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			if (this.anIntArray26[local151] != 0) {
				local149.method961(Static72.anIntArrayArray16[local151][0], Static72.anIntArrayArray16[local151][this.anIntArray26[local151]]);
				if (local151 == 1) {
					local149.method961(Static7.anIntArray19[0], Static7.anIntArray19[this.anIntArray26[local151]]);
				}
			}
		}
		return local149;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public void method334(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean21 != arg0) {
			this.method330(arg0, this.anIntArray26, null, -1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V")
	public void method335(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean21) {
			return;
		}
		@Pc(28) int local28 = this.anIntArray25[Static107.anIntArray292[arg1]];
		if (local28 == 0) {
			return;
		}
		local28 -= 256;
		@Pc(57) Class6_Sub2_Sub10 local57;
		do {
			if (arg0) {
				local28++;
				if (Static33.anInt1274 <= local28) {
					local28 = 0;
				}
			} else {
				local28--;
				if (local28 < 0) {
					local28 = Static33.anInt1274 - 1;
				}
			}
			local57 = Static58.method1194(local28);
		} while (local57 == null || local57.aBoolean117 || arg1 + (this.aBoolean21 ? 7 : 0) != local57.anInt2516);
		this.anIntArray25[Static107.anIntArray292[arg1]] = local28 + 256;
		this.method336();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	private void method336() {
		@Pc(8) long local8 = this.aLong20;
		@Pc(13) int local13 = this.anIntArray25[5];
		@Pc(18) int local18 = this.anIntArray25[9];
		this.anIntArray25[5] = local18;
		this.anIntArray25[9] = local13;
		this.aLong20 = 0;
		for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
			this.aLong20 <<= 0x4;
			if (this.anIntArray25[local34] >= 256) {
				this.aLong20 += this.anIntArray25[local34] - 256;
			}
		}
		if (this.anIntArray25[0] >= 256) {
			this.aLong20 += this.anIntArray25[0] - 256 >> 4;
		}
		if (this.anIntArray25[1] >= 256) {
			this.aLong20 += this.anIntArray25[1] - 256 >> 8;
		}
		for (@Pc(108) int local108 = 0; local108 < 5; local108++) {
			this.aLong20 <<= 0x3;
			this.aLong20 += this.anIntArray26[local108];
		}
		this.aLong20 <<= 0x1;
		this.aLong20 += this.aBoolean21 ? 1 : 0;
		this.anIntArray25[5] = local13;
		this.anIntArray25[9] = local18;
		if (local8 != 0L && this.aLong20 != local8) {
			Static9.aClass36_6.method1162(local8);
		}
	}
}
