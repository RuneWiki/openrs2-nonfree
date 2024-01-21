import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class37 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
	public boolean aBoolean48;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method989() {
		if (this.anInt1387 != -1) {
			return Static29.method626(this.anInt1387).method1640();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray206[local21];
			if (local28 >= 256 && local28 < 512 && !Static8.method165(local28 - 256).method1786()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static111.method1830(local28 - 512).method1271(this.aBoolean48)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class5_Sub2_Sub2_Sub1[] local74 = new Class5_Sub2_Sub2_Sub1[12];
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
			@Pc(85) int local85 = this.anIntArray206[local78];
			@Pc(103) Class5_Sub2_Sub2_Sub1 local103;
			if (local85 >= 256 && local85 < 512) {
				local103 = Static8.method165(local85 - 256).method1790();
				if (local103 != null) {
					local74[local76++] = local103;
				}
			}
			if (local85 >= 512) {
				local103 = Static111.method1830(local85 - 512).method1270(this.aBoolean48);
				if (local103 != null) {
					local74[local76++] = local103;
				}
			}
		}
		@Pc(148) Class5_Sub2_Sub2_Sub1 local148 = new Class5_Sub2_Sub2_Sub1(local74, local76);
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			if (Static116.aShortArrayArray6[local150].length > this.anIntArray205[local150]) {
				local148.method329(Static17.aShortArray12[local150], Static116.aShortArrayArray6[local150][this.anIntArray205[local150]]);
			}
			if (Static102.aShortArrayArray5[local150].length > this.anIntArray205[local150]) {
				local148.method329(Static34.aShortArray13[local150], Static102.aShortArrayArray5[local150][this.anIntArray205[local150]]);
			}
		}
		return local148;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZI)V")
	public void method990(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray205[arg1];
		if (arg0) {
			local8++;
			if (Static116.aShortArrayArray6[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static116.aShortArrayArray6[arg1].length - 1;
			}
		}
		this.anIntArray205[arg1] = local8;
		this.method992();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	private void method992() {
		@Pc(8) long local8 = this.aLong49;
		this.aLong49 = 0L;
		@Pc(16) int local16 = this.anIntArray206[5];
		@Pc(21) int local21 = this.anIntArray206[9];
		this.anIntArray206[9] = local16;
		this.anIntArray206[5] = local21;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong49 <<= 0x4;
			if (this.anIntArray206[local33] >= 256) {
				this.aLong49 += this.anIntArray206[local33] - 256;
			}
		}
		if (this.anIntArray206[0] >= 256) {
			this.aLong49 += this.anIntArray206[0] - 256 >> 4;
		}
		if (this.anIntArray206[1] >= 256) {
			this.aLong49 += this.anIntArray206[1] - 256 >> 8;
		}
		for (@Pc(105) int local105 = 0; local105 < 5; local105++) {
			this.aLong49 <<= 0x3;
			this.aLong49 += this.anIntArray205[local105];
		}
		this.anIntArray206[5] = local16;
		this.aLong49 <<= 0x1;
		this.aLong49 += this.aBoolean48 ? 1 : 0;
		this.anIntArray206[9] = local21;
		if (local8 != 0L && local8 != this.aLong49) {
			Static21.aClass29_6.method761(local8);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZI)V")
	public void method995(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean48) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray206[Static107.anIntArray337[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(49) Class5_Sub2_Sub13 local49;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static111.anInt2832) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static111.anInt2832 - 1;
				}
			}
			local49 = Static8.method165(local19);
		} while (local49 == null || local49.aBoolean100 || local49.anInt2768 != arg0 + (this.aBoolean48 ? 7 : 0));
		this.anIntArray206[Static107.anIntArray337[arg0]] = local19 + 256;
		this.method992();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!pa;I)V")
	public void method996(@OriginalArg(0) Class5_Sub14 arg0) {
		arg0.method1440(this.aBoolean48 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray206[Static107.anIntArray337[local16]];
			if (local25 == 0) {
				arg0.method1440(-1);
			} else {
				arg0.method1440(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1440(this.anIntArray205[local25]);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!w;ZILclient!w;)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method997(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub2_Sub17 arg3) {
		if (this.anInt1387 != -1) {
			return Static29.method626(this.anInt1387).method1636(arg0, arg1, arg3, arg2);
		}
		@Pc(23) long local23 = this.aLong49;
		@Pc(26) int[] local26 = this.anIntArray206;
		if (arg1 != null && (arg1.anInt3231 >= 0 || arg1.anInt3253 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray206[local42];
			}
			if (arg1.anInt3231 >= 0) {
				local23 += arg1.anInt3231 - this.anIntArray206[5] << 8;
				local26[5] = arg1.anInt3231;
			}
			if (arg1.anInt3253 >= 0) {
				local23 += arg1.anInt3253 - this.anIntArray206[3] << 16;
				local26[3] = arg1.anInt3253;
			}
		}
		@Pc(105) Class5_Sub2_Sub2_Sub6 local105 = (Class5_Sub2_Sub2_Sub6) Static21.aClass29_6.method766(local23);
		if (local105 == null) {
			@Pc(109) boolean local109 = false;
			for (@Pc(111) int local111 = 0; local111 < 12; local111++) {
				@Pc(117) int local117 = local26[local111];
				if (local117 >= 256 && local117 < 512 && !Static8.method165(local117 - 256).method1788()) {
					local109 = true;
				}
				if (local117 >= 512 && !Static111.method1830(local117 - 512).method1275(this.aBoolean48)) {
					local109 = true;
				}
			}
			if (local109) {
				if (this.aLong48 != -1L) {
					local105 = (Class5_Sub2_Sub2_Sub6) Static21.aClass29_6.method766(this.aLong48);
				}
				if (local105 == null) {
					return null;
				}
			}
			if (local105 == null) {
				@Pc(181) Class5_Sub2_Sub2_Sub1[] local181 = new Class5_Sub2_Sub2_Sub1[12];
				@Pc(183) int local183 = 0;
				for (@Pc(185) int local185 = 0; local185 < 12; local185++) {
					@Pc(191) int local191 = local26[local185];
					@Pc(205) Class5_Sub2_Sub2_Sub1 local205;
					if (local191 >= 256 && local191 < 512) {
						local205 = Static8.method165(local191 - 256).method1792();
						if (local205 != null) {
							local181[local183++] = local205;
						}
					}
					if (local191 >= 512) {
						local205 = Static111.method1830(local191 - 512).method1272(this.aBoolean48);
						if (local205 != null) {
							local181[local183++] = local205;
						}
					}
				}
				@Pc(244) Class5_Sub2_Sub2_Sub1 local244 = new Class5_Sub2_Sub2_Sub1(local181, local183);
				for (@Pc(246) int local246 = 0; local246 < 5; local246++) {
					if (Static116.aShortArrayArray6[local246].length > this.anIntArray205[local246]) {
						local244.method329(Static17.aShortArray12[local246], Static116.aShortArrayArray6[local246][this.anIntArray205[local246]]);
					}
					if (this.anIntArray205[local246] < Static102.aShortArrayArray5[local246].length) {
						local244.method329(Static34.aShortArray13[local246], Static102.aShortArrayArray5[local246][this.anIntArray205[local246]]);
					}
				}
				local105 = local244.method342(64, 850, -30, -50, -30);
				Static21.aClass29_6.method762(local105, local23);
				this.aLong48 = local23;
			}
		}
		if (arg1 == null && arg3 == null) {
			return local105;
		}
		@Pc(339) Class5_Sub2_Sub2_Sub6 local339;
		if (arg1 != null && arg3 != null) {
			local339 = arg1.method2067(local105, arg0, arg2, arg3);
		} else if (arg1 == null) {
			local339 = arg3.method2061(local105, arg0);
		} else {
			local339 = arg1.method2061(local105, arg2);
		}
		return local339;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public int method998() {
		return this.anInt1387 == -1 ? (this.anIntArray205[0] << 25) + ((this.anIntArray205[4] << 20) + (this.anIntArray206[0] << 15)) + (this.anIntArray206[8] << 10) + (this.anIntArray206[11] << 5) + this.anIntArray206[1] : 305419896 - -Static29.method626(this.anInt1387).anInt2509;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([II[IIZ)V")
	public void method999(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static111.anInt2832; local12++) {
					@Pc(18) Class5_Sub2_Sub13 local18 = Static8.method165(local12);
					if (local18 != null && !local18.aBoolean100 && (arg3 ? 7 : 0) + local8 == local18.anInt2768) {
						arg0[Static107.anIntArray337[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anInt1387 = arg2;
		this.anIntArray206 = arg0;
		this.aBoolean48 = arg3;
		this.anIntArray205 = arg1;
		this.method992();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public void method1000(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean48) {
			this.method999(null, this.anIntArray205, -1, arg0);
		}
	}
}
