import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class63 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZZ)V")
	public void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean113) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray251[Static45.anIntArray123[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(61) Class4_Sub2_Sub14 local61;
		do {
			if (arg1) {
				local21++;
				if (Static72.anInt801 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static72.anInt801 - 1;
				}
			}
			local61 = Static78.method1301(local21);
		} while (local61 == null || local61.aBoolean137 || local61.anInt2752 != arg0 + (this.aBoolean113 ? 7 : 0));
		this.anIntArray251[Static45.anIntArray123[arg0]] = local21 + 256;
		this.method1695();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZI)V")
	public void method1694(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray250[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static65.aShortArrayArray1[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static65.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray250[arg1] = local8;
		this.method1695();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	private void method1695() {
		@Pc(8) long local8 = this.aLong111;
		this.aLong111 = 0L;
		@Pc(16) int local16 = this.anIntArray251[5];
		@Pc(21) int local21 = this.anIntArray251[9];
		this.anIntArray251[5] = local21;
		this.anIntArray251[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong111 <<= 0x4;
			if (this.anIntArray251[local33] >= 256) {
				this.aLong111 += this.anIntArray251[local33] - 256;
			}
		}
		if (this.anIntArray251[0] >= 256) {
			this.aLong111 += this.anIntArray251[0] - 256 >> 4;
		}
		if (this.anIntArray251[1] >= 256) {
			this.aLong111 += this.anIntArray251[1] - 256 >> 8;
		}
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			this.aLong111 <<= 0x3;
			this.aLong111 += this.anIntArray250[local107];
		}
		this.anIntArray251[9] = local21;
		this.anIntArray251[5] = local16;
		this.aLong111 <<= 0x1;
		this.aLong111 += this.aBoolean113 ? 1 : 0;
		if (local8 != 0L && this.aLong111 != local8) {
			Static5.aClass12_73.method229(local8);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I")
	public int method1696() {
		return this.anInt2284 == -1 ? (this.anIntArray251[8] << 10) + (this.anIntArray251[0] << 15) + (this.anIntArray250[4] << 20) + (this.anIntArray250[0] << 25) + (this.anIntArray251[11] << 5) + this.anIntArray251[1] : Static91.method1636(this.anInt2284).anInt2936 + 305419896;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!bd;Lclient!bd;II)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method1698(@OriginalArg(1) Class4_Sub2_Sub2 arg0, @OriginalArg(2) Class4_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2284 != -1) {
			return Static91.method1636(this.anInt2284).method2046(arg1, arg3, arg2, arg0);
		}
		@Pc(23) int[] local23 = this.anIntArray251;
		@Pc(26) long local26 = this.aLong111;
		if (arg1 != null && (arg1.anInt316 >= 0 || arg1.anInt327 >= 0)) {
			local23 = new int[12];
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				local23[local39] = this.anIntArray251[local39];
			}
			if (arg1.anInt316 >= 0) {
				local26 += arg1.anInt316 - this.anIntArray251[5] << 8;
				local23[5] = arg1.anInt316;
			}
			if (arg1.anInt327 >= 0) {
				local26 += arg1.anInt327 - this.anIntArray251[3] << 16;
				local23[3] = arg1.anInt327;
			}
		}
		@Pc(112) Class4_Sub2_Sub1_Sub6 local112 = (Class4_Sub2_Sub1_Sub6) Static5.aClass12_73.method235(local26);
		if (local112 == null) {
			@Pc(116) boolean local116 = false;
			for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
				@Pc(124) int local124 = local23[local118];
				if (local124 >= 256 && local124 < 512 && !Static78.method1301(local124 - 256).method1955()) {
					local116 = true;
				}
				if (local124 >= 512 && !Static119.method2166(local124 - 512).method408(this.aBoolean113)) {
					local116 = true;
				}
			}
			if (local116) {
				if (this.aLong112 != -1L) {
					local112 = (Class4_Sub2_Sub1_Sub6) Static5.aClass12_73.method235(this.aLong112);
				}
				if (local112 == null) {
					return null;
				}
			}
			if (local112 == null) {
				@Pc(186) Class4_Sub2_Sub1_Sub4[] local186 = new Class4_Sub2_Sub1_Sub4[12];
				@Pc(188) int local188 = 0;
				for (@Pc(190) int local190 = 0; local190 < 12; local190++) {
					@Pc(196) int local196 = local23[local190];
					@Pc(210) Class4_Sub2_Sub1_Sub4 local210;
					if (local196 >= 256 && local196 < 512) {
						local210 = Static78.method1301(local196 - 256).method1960();
						if (local210 != null) {
							local186[local188++] = local210;
						}
					}
					if (local196 >= 512) {
						local210 = Static119.method2166(local196 - 512).method410(this.aBoolean113);
						if (local210 != null) {
							local186[local188++] = local210;
						}
					}
				}
				@Pc(251) Class4_Sub2_Sub1_Sub4 local251 = new Class4_Sub2_Sub1_Sub4(local186, local188);
				for (@Pc(253) int local253 = 0; local253 < 5; local253++) {
					if (this.anIntArray250[local253] != 0) {
						local251.method1731(Static65.aShortArrayArray1[local253][0], Static65.aShortArrayArray1[local253][this.anIntArray250[local253]]);
						if (local253 == 1) {
							local251.method1731(Static30.aShortArray3[0], Static30.aShortArray3[this.anIntArray250[local253]]);
						}
					}
				}
				local112 = local251.method1743(64, 850, -30, -50, -30);
				Static5.aClass12_73.method234(local112, local26);
				this.aLong112 = local26;
			}
		}
		if (arg1 == null && arg0 == null) {
			return local112;
		}
		@Pc(329) Class4_Sub2_Sub1_Sub6 local329;
		if (arg1 != null && arg0 != null) {
			local329 = arg1.method214(arg2, local112, arg3, arg0);
		} else if (arg1 == null) {
			local329 = arg0.method215(local112, arg2);
		} else {
			local329 = arg1.method215(local112, arg3);
		}
		return local329;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)V")
	public void method1702(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean113 != arg0) {
			this.method1703(null, this.anIntArray250, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([I[IZII)V")
	public void method1703(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static72.anInt801; local16++) {
					@Pc(22) Class4_Sub2_Sub14 local22 = Static78.method1301(local16);
					if (local22 != null && !local22.aBoolean137 && local22.anInt2752 == (arg2 ? 7 : 0) + local12) {
						arg0[Static45.anIntArray123[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt2284 = arg3;
		this.anIntArray250 = arg1;
		this.anIntArray251 = arg0;
		this.aBoolean113 = arg2;
		this.method1695();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method1704() {
		if (this.anInt2284 != -1) {
			return Static91.method1636(this.anInt2284).method2036();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray251[local21];
			if (local28 >= 256 && local28 < 512 && !Static78.method1301(local28 - 256).method1953()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static119.method2166(local28 - 512).method409(this.aBoolean113)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(72) Class4_Sub2_Sub1_Sub4[] local72 = new Class4_Sub2_Sub1_Sub4[12];
		@Pc(74) int local74 = 0;
		for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
			@Pc(83) int local83 = this.anIntArray251[local76];
			@Pc(99) Class4_Sub2_Sub1_Sub4 local99;
			if (local83 >= 256 && local83 < 512) {
				local99 = Static78.method1301(local83 - 256).method1951();
				if (local99 != null) {
					local72[local74++] = local99;
				}
			}
			if (local83 >= 512) {
				local99 = Static119.method2166(local83 - 512).method412(this.aBoolean113);
				if (local99 != null) {
					local72[local74++] = local99;
				}
			}
		}
		@Pc(140) Class4_Sub2_Sub1_Sub4 local140 = new Class4_Sub2_Sub1_Sub4(local72, local74);
		for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
			if (this.anIntArray250[local142] != 0) {
				local140.method1731(Static65.aShortArrayArray1[local142][0], Static65.aShortArrayArray1[local142][this.anIntArray250[local142]]);
				if (local142 == 1) {
					local140.method1731(Static30.aShortArray3[0], Static30.aShortArray3[this.anIntArray250[local142]]);
				}
			}
		}
		return local140;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!s;I)V")
	public void method1705(@OriginalArg(0) Class4_Sub16 arg0) {
		arg0.method1459(this.aBoolean113 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray251[Static45.anIntArray123[local12]];
			if (local21 == 0) {
				arg0.method1459(-1);
			} else {
				arg0.method1459(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method1459(this.anIntArray250[local21]);
		}
	}
}
