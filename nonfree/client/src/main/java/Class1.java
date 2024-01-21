import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "J")
	private long aLong2;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[II[IZ)V")
	public void method1(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(15) int local15 = 0; local15 < 7; local15++) {
				for (@Pc(18) int local18 = 0; local18 < Static11.anInt309; local18++) {
					@Pc(23) Class2_Sub2_Sub17 local23 = Static171.method2868(local18);
					if (local23 != null && !local23.aBoolean161 && local15 + (arg3 ? 7 : 0) == local23.anInt3908) {
						arg2[Static52.anIntArray222[local15]] = local18 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray2 = arg2;
		this.anInt1 = arg1;
		this.anIntArray4 = arg0;
		this.aBoolean1 = arg3;
		this.method3();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	public int method2() {
		return this.anInt1 == -1 ? this.anIntArray2[1] + (this.anIntArray2[11] << 5) + (this.anIntArray2[0] << 15) + (this.anIntArray4[0] << 25) + (this.anIntArray4[4] << 20) + (this.anIntArray2[8] << 10) : Static131.method2901(this.anInt1).anInt3771 + 305419896;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	private void method3() {
		@Pc(6) long local6 = this.aLong2;
		@Pc(11) int local11 = this.anIntArray2[5];
		this.aLong2 = 0L;
		@Pc(19) int local19 = this.anIntArray2[9];
		this.anIntArray2[9] = local11;
		this.anIntArray2[5] = local19;
		for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
			this.aLong2 <<= 0x4;
			if (this.anIntArray2[local38] >= 256) {
				this.aLong2 += this.anIntArray2[local38] - 256;
			}
		}
		if (this.anIntArray2[0] >= 256) {
			this.aLong2 += this.anIntArray2[0] - 256 >> 4;
		}
		if (this.anIntArray2[1] >= 256) {
			this.aLong2 += this.anIntArray2[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong2 <<= 0x3;
			this.aLong2 += this.anIntArray4[local113];
		}
		this.aLong2 <<= 0x1;
		this.anIntArray2[9] = local19;
		this.aLong2 += this.aBoolean1 ? 1 : 0;
		this.anIntArray2[5] = local11;
		if (local6 != 0L && local6 != this.aLong2) {
			Static144.aClass82_52.method2697(local6);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZB)V")
	public void method5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean1) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray2[Static52.anIntArray222[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(56) Class2_Sub2_Sub17 local56;
		do {
			if (arg1) {
				local21++;
				if (local21 >= Static11.anInt309) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static11.anInt309 - 1;
				}
			}
			local56 = Static171.method2868(local21);
		} while (local56 == null || local56.aBoolean161 || local56.anInt3908 != arg0 + (this.aBoolean1 ? 7 : 0));
		this.anIntArray2[Static52.anIntArray222[arg0]] = local21 + 256;
		this.method3();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!tc;IB)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method6(@OriginalArg(0) Class2_Sub2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1 != -1) {
			return Static131.method2901(this.anInt1).method2617(arg1, arg0);
		}
		@Pc(26) Class2_Sub2_Sub1_Sub2 local26 = (Class2_Sub2_Sub1_Sub2) Static133.aClass82_48.method2699(this.aLong2);
		if (local26 == null) {
			@Pc(30) boolean local30 = false;
			for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
				@Pc(39) int local39 = this.anIntArray2[local32];
				if (local39 >= 256 && local39 < 512 && !Static171.method2868(local39 - 256).method2688()) {
					local30 = true;
				}
				if (local39 >= 512 && !Static158.method2689(local39 - 512).method1305(this.aBoolean1)) {
					local30 = true;
				}
			}
			if (local30) {
				return null;
			}
			@Pc(85) Class2_Sub2_Sub1_Sub3[] local85 = new Class2_Sub2_Sub1_Sub3[12];
			@Pc(87) int local87 = 0;
			for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
				@Pc(96) int local96 = this.anIntArray2[local89];
				@Pc(110) Class2_Sub2_Sub1_Sub3 local110;
				if (local96 >= 256 && local96 < 512) {
					local110 = Static171.method2868(local96 - 256).method2690();
					if (local110 != null) {
						local85[local87++] = local110;
					}
				}
				if (local96 >= 512) {
					local110 = Static158.method2689(local96 - 512).method1301(this.aBoolean1);
					if (local110 != null) {
						local85[local87++] = local110;
					}
				}
			}
			@Pc(149) Class2_Sub2_Sub1_Sub3 local149 = new Class2_Sub2_Sub1_Sub3(local85, local87);
			for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
				if (Static63.aShortArrayArray6[local151].length > this.anIntArray4[local151]) {
					local149.method864(Static142.aShortArray106[local151], Static63.aShortArrayArray6[local151][this.anIntArray4[local151]]);
				}
				if (this.anIntArray4[local151] < Static70.aShortArrayArray7[local151].length) {
					local149.method864(Static6.aShortArray7[local151], Static70.aShortArrayArray7[local151][this.anIntArray4[local151]]);
				}
			}
			local26 = local149.method865(64, 768, -50, -10, -50, true);
			Static133.aClass82_48.method2701(this.aLong2, local26);
		}
		if (arg0 != null) {
			local26 = arg0.method2587(arg1, local26);
		}
		return local26;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method7(@OriginalArg(0) Class2_Sub18 arg0) {
		arg0.method2389(this.aBoolean1 ? 1 : 0);
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < 7; local25++) {
			local33 = this.anIntArray2[Static52.anIntArray222[local25]];
			if (local33 == 0) {
				arg0.method2389(-1);
			} else {
				arg0.method2389(local33 - 256);
			}
		}
		for (local33 = 0; local33 < 5; local33++) {
			arg0.method2389(this.anIntArray4[local33]);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BILclient!tc;Lclient!tc;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method9(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub15 arg1, @OriginalArg(3) Class2_Sub2_Sub15 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1 != -1) {
			return Static131.method2901(this.anInt1).method2612(arg2, arg0, arg3, arg1);
		}
		@Pc(22) long local22 = this.aLong2;
		@Pc(25) int[] local25 = this.anIntArray2;
		if (arg2 != null && (arg2.anInt3742 >= 0 || arg2.anInt3743 >= 0)) {
			local25 = new int[12];
			for (@Pc(44) int local44 = 0; local44 < 12; local44++) {
				local25[local44] = this.anIntArray2[local44];
			}
			if (arg2.anInt3742 >= 0) {
				local22 += arg2.anInt3742 - this.anIntArray2[5] << 8;
				local25[5] = arg2.anInt3742;
			}
			if (arg2.anInt3743 >= 0) {
				local22 += arg2.anInt3743 - this.anIntArray2[3] << 16;
				local25[3] = arg2.anInt3743;
			}
		}
		@Pc(113) Class2_Sub2_Sub1_Sub2 local113 = (Class2_Sub2_Sub1_Sub2) Static144.aClass82_52.method2699(local22);
		if (local113 == null) {
			@Pc(117) boolean local117 = false;
			for (@Pc(119) int local119 = 0; local119 < 12; local119++) {
				@Pc(124) int local124 = local25[local119];
				if (local124 >= 256 && local124 < 512 && !Static171.method2868(local124 - 256).method2693()) {
					local117 = true;
				}
				if (local124 >= 512 && !Static158.method2689(local124 - 512).method1304(this.aBoolean1)) {
					local117 = true;
				}
			}
			if (local117) {
				if (this.aLong3 != -1L) {
					local113 = (Class2_Sub2_Sub1_Sub2) Static144.aClass82_52.method2699(this.aLong3);
				}
				if (local113 == null) {
					return null;
				}
			}
			if (local113 == null) {
				@Pc(190) Class2_Sub2_Sub1_Sub3[] local190 = new Class2_Sub2_Sub1_Sub3[12];
				@Pc(192) int local192 = 0;
				for (@Pc(194) int local194 = 0; local194 < 12; local194++) {
					@Pc(199) int local199 = local25[local194];
					@Pc(215) Class2_Sub2_Sub1_Sub3 local215;
					if (local199 >= 256 && local199 < 512) {
						local215 = Static171.method2868(local199 - 256).method2694();
						if (local215 != null) {
							local190[local192++] = local215;
						}
					}
					if (local199 >= 512) {
						local215 = Static158.method2689(local199 - 512).method1303(this.aBoolean1);
						if (local215 != null) {
							local190[local192++] = local215;
						}
					}
				}
				@Pc(256) Class2_Sub2_Sub1_Sub3 local256 = new Class2_Sub2_Sub1_Sub3(local190, local192);
				for (@Pc(258) int local258 = 0; local258 < 5; local258++) {
					if (Static63.aShortArrayArray6[local258].length > this.anIntArray4[local258]) {
						local256.method864(Static142.aShortArray106[local258], Static63.aShortArrayArray6[local258][this.anIntArray4[local258]]);
					}
					if (this.anIntArray4[local258] < Static70.aShortArrayArray7[local258].length) {
						local256.method864(Static6.aShortArray7[local258], Static70.aShortArrayArray7[local258][this.anIntArray4[local258]]);
					}
				}
				local113 = local256.method865(64, 850, -30, -50, -30, true);
				Static144.aClass82_52.method2701(local22, local113);
				this.aLong3 = local22;
			}
		}
		if (arg2 == null && arg1 == null) {
			return local113;
		}
		@Pc(347) Class2_Sub2_Sub1_Sub2 local347;
		if (arg2 != null && arg1 != null) {
			local347 = arg2.method2589(local113, arg3, arg1, arg0);
		} else if (arg2 == null) {
			local347 = arg1.method2596(arg3, local113);
		} else {
			local347 = arg2.method2596(arg0, local113);
		}
		return local347;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZI)V")
	public void method10(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anIntArray4[arg1];
		if (arg0) {
			local15++;
			if (Static63.aShortArrayArray6[arg1].length <= local15) {
				local15 = 0;
			}
		} else {
			local15--;
			if (local15 < 0) {
				local15 = Static63.aShortArrayArray6[arg1].length - 1;
			}
		}
		this.anIntArray4[arg1] = local15;
		this.method3();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
	public void method11(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean1) {
			this.method1(this.anIntArray4, -1, null, arg0);
		}
	}
}
