import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class49 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
	private int anInt2463;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1486() {
		if (this.anInt2463 != -1) {
			return Static75.method1301(this.anInt2463).method1261();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray321[local21];
			if (local28 >= 256 && local28 < 512 && !Static100.method1707(local28 - 256).method148()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static70.method1263(local28 - 512).method1068(this.aBoolean124)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class2_Sub1_Sub1_Sub6[] local74 = new Class2_Sub1_Sub1_Sub6[12];
		@Pc(81) int local81 = 0;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(90) int local90 = this.anIntArray321[local83];
			@Pc(104) Class2_Sub1_Sub1_Sub6 local104;
			if (local90 >= 256 && local90 < 512) {
				local104 = Static100.method1707(local90 - 256).method155();
				if (local104 != null) {
					local74[local81++] = local104;
				}
			}
			if (local90 >= 512) {
				local104 = Static70.method1263(local90 - 512).method1078(this.aBoolean124);
				if (local104 != null) {
					local74[local81++] = local104;
				}
			}
		}
		@Pc(143) Class2_Sub1_Sub1_Sub6 local143 = new Class2_Sub1_Sub1_Sub6(local74, local81);
		for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
			if (this.anIntArray319[local145] != 0) {
				local143.method1515(Static2.anIntArrayArray1[local145][0], Static2.anIntArrayArray1[local145][this.anIntArray319[local145]]);
				if (local145 == 1) {
					local143.method1515(Static21.anIntArray325[0], Static21.anIntArray325[this.anIntArray319[local145]]);
				}
			}
		}
		return local143;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZI)V")
	public void method1487(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean124) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray321[Static62.anIntArray252[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(56) Class2_Sub1_Sub3 local56;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static45.anInt1369) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static45.anInt1369 - 1;
				}
			}
			local56 = Static100.method1707(local21);
		} while (local56 == null || local56.aBoolean22 || arg1 + (this.aBoolean124 ? 7 : 0) != local56.anInt292);
		this.anIntArray321[Static62.anIntArray252[arg1]] = local21 + 256;
		this.method1491();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!fe;)V")
	public void method1489(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.method1375(this.aBoolean124 ? 1 : 0);
		@Pc(30) int local30;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local30 = this.anIntArray321[Static62.anIntArray252[local16]];
			if (local30 == 0) {
				arg0.method1375(-1);
			} else {
				arg0.method1375(local30 - 256);
			}
		}
		for (local30 = 0; local30 < 5; local30++) {
			arg0.method1375(this.anIntArray319[local30]);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V")
	public void method1490(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray319[arg1];
		if (arg0) {
			local4++;
			if (local4 >= Static2.anIntArrayArray1[arg1].length) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static2.anIntArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray319[arg1] = local4;
		this.method1491();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	private void method1491() {
		@Pc(4) long local4 = this.aLong72;
		@Pc(13) int local13 = this.anIntArray321[5];
		@Pc(18) int local18 = this.anIntArray321[9];
		this.anIntArray321[5] = local18;
		this.anIntArray321[9] = local13;
		this.aLong72 = 0L;
		for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
			this.aLong72 <<= 0x4;
			if (this.anIntArray321[local41] >= 256) {
				this.aLong72 += this.anIntArray321[local41] - 256;
			}
		}
		if (this.anIntArray321[0] >= 256) {
			this.aLong72 += this.anIntArray321[0] - 256 >> 4;
		}
		if (this.anIntArray321[1] >= 256) {
			this.aLong72 += this.anIntArray321[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong72 <<= 0x3;
			this.aLong72 += this.anIntArray319[local115];
		}
		this.aLong72 <<= 0x1;
		this.aLong72 += this.aBoolean124 ? 1 : 0;
		this.anIntArray321[5] = local13;
		this.anIntArray321[9] = local18;
		if (local4 != 0L && this.aLong72 != local4) {
			Static95.aClass21_29.method747(local4);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!gd;IZILclient!gd;)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1492(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub6 arg3) {
		if (this.anInt2463 != -1) {
			return Static75.method1301(this.anInt2463).method1270(arg1, arg0, arg2, arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray321;
		@Pc(31) long local31 = this.aLong72;
		if (arg0 != null && (arg0.anInt1193 >= 0 || arg0.anInt1207 >= 0)) {
			local23 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local23[local47] = this.anIntArray321[local47];
			}
			if (arg0.anInt1193 >= 0) {
				local31 += arg0.anInt1193 - this.anIntArray321[5] << 8;
				local23[5] = arg0.anInt1193;
			}
			if (arg0.anInt1207 >= 0) {
				local31 += arg0.anInt1207 - this.anIntArray321[3] << 16;
				local23[3] = arg0.anInt1207;
			}
		}
		@Pc(111) Class2_Sub1_Sub1_Sub6 local111 = (Class2_Sub1_Sub1_Sub6) Static95.aClass21_29.method744(local31);
		if (local111 == null) {
			@Pc(115) boolean local115 = false;
			for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
				@Pc(123) int local123 = local23[local117];
				if (local123 >= 256 && local123 < 512 && !Static100.method1707(local123 - 256).method147()) {
					local115 = true;
				}
				if (local123 >= 512 && !Static70.method1263(local123 - 512).method1076(this.aBoolean124)) {
					local115 = true;
				}
			}
			if (local115) {
				if (this.aLong73 != -1L) {
					local111 = (Class2_Sub1_Sub1_Sub6) Static95.aClass21_29.method744(this.aLong73);
				}
				if (local111 == null) {
					return null;
				}
			}
			if (local111 == null) {
				@Pc(187) Class2_Sub1_Sub1_Sub6[] local187 = new Class2_Sub1_Sub1_Sub6[12];
				@Pc(189) int local189 = 0;
				@Pc(197) int local197;
				for (@Pc(191) int local191 = 0; local191 < 12; local191++) {
					local197 = local23[local191];
					@Pc(213) Class2_Sub1_Sub1_Sub6 local213;
					if (local197 >= 256 && local197 < 512) {
						local213 = Static100.method1707(local197 - 256).method157();
						if (local213 != null) {
							local187[local189++] = local213;
						}
					}
					if (local197 >= 512) {
						local213 = Static70.method1263(local197 - 512).method1077(this.aBoolean124);
						if (local213 != null) {
							local187[local189++] = local213;
						}
					}
				}
				local111 = new Class2_Sub1_Sub1_Sub6(local187, local189);
				for (local197 = 0; local197 < 5; local197++) {
					if (this.anIntArray319[local197] != 0) {
						local111.method1515(Static2.anIntArrayArray1[local197][0], Static2.anIntArrayArray1[local197][this.anIntArray319[local197]]);
						if (local197 == 1) {
							local111.method1515(Static21.anIntArray325[0], Static21.anIntArray325[this.anIntArray319[local197]]);
						}
					}
				}
				local111.method1524();
				local111.method1535(64, 850, -30, -50, -30, true);
				Static95.aClass21_29.method745(local31, local111);
				this.aLong73 = local31;
			}
		}
		if (arg0 == null && arg3 == null) {
			return local111;
		}
		@Pc(339) Class2_Sub1_Sub1_Sub6 local339;
		if (arg0 != null && arg3 != null) {
			local339 = arg0.method736(arg2, arg3, arg1, local111);
		} else if (arg0 == null) {
			local339 = arg3.method733(local111, arg2);
		} else {
			local339 = arg0.method733(local111, arg1);
		}
		return local339;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[IBI[I)V")
	public void method1493(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static45.anInt1369; local12++) {
					@Pc(18) Class2_Sub1_Sub3 local18 = Static100.method1707(local12);
					if (local18 != null && !local18.aBoolean22 && local8 + (arg0 ? 7 : 0) == local18.anInt292) {
						arg3[Static62.anIntArray252[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean124 = arg0;
		this.anIntArray321 = arg3;
		this.anIntArray319 = arg1;
		this.anInt2463 = arg2;
		this.method1491();
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
	public int method1495() {
		return this.anInt2463 == -1 ? (this.anIntArray321[8] << 10) + (this.anIntArray321[0] << 15) + (this.anIntArray319[4] << 20) + (this.anIntArray319[0] << 25) + (this.anIntArray321[11] << 5) + this.anIntArray321[1] : Static75.method1301(this.anInt2463).anInt2122 + 305419896;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	public void method1496(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean124) {
			this.method1493(arg0, this.anIntArray319, -1, null);
		}
	}
}
