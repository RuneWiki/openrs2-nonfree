import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class5_Sub2_Sub2_Sub6 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
	public int[] anIntArray408;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
	private int anInt3318;

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!wb", name = "ib", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!wb", name = "lb", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
	private int anInt3320;

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "[I")
	public int[] anIntArray414;

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
	private int anInt3322;

	@OriginalMember(owner = "client!wb", name = "sb", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!wb", name = "vb", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!wb", name = "wb", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!wb", name = "yb", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!wb", name = "Ab", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!wb", name = "Cb", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!wb", name = "tb", descriptor = "I")
	public int anInt3323 = 0;

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "I")
	public int anInt3321 = 0;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
	public int anInt3319 = 0;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2_Sub6() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([Lclient!wb;I)V")
	public Class5_Sub2_Sub2_Sub6(@OriginalArg(0) Class5_Sub2_Sub2_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt3321 = 0;
		this.anInt3323 = 0;
		this.anInt3319 = 0;
		this.aByte7 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class5_Sub2_Sub2_Sub6 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt3321 += local43.anInt3321;
				this.anInt3323 += local43.anInt3323;
				this.anInt3319 += local43.anInt3319;
				if (local43.aByteArray40 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local43.aByte7;
					}
					if (this.aByte7 != local43.aByte7) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray41 != null;
				local22 |= local43.aShortArray39 != null;
				local24 |= local43.aByteArray42 != null;
			}
		}
		this.anIntArray417 = new int[this.anInt3321];
		this.anIntArray415 = new int[this.anInt3321];
		this.anIntArray411 = new int[this.anInt3321];
		this.anIntArray416 = new int[this.anInt3323];
		this.anIntArray409 = new int[this.anInt3323];
		this.anIntArray418 = new int[this.anInt3323];
		this.anIntArray408 = new int[this.anInt3323];
		this.anIntArray413 = new int[this.anInt3323];
		this.anIntArray414 = new int[this.anInt3323];
		if (local18) {
			this.aByteArray40 = new byte[this.anInt3323];
		}
		if (local20) {
			this.aByteArray41 = new byte[this.anInt3323];
		}
		if (local22) {
			this.aShortArray39 = new short[this.anInt3323];
		}
		if (local24) {
			this.aByteArray42 = new byte[this.anInt3323];
		}
		if (this.anInt3319 > 0) {
			this.anIntArray412 = new int[this.anInt3319];
			this.anIntArray410 = new int[this.anInt3319];
			this.anIntArray419 = new int[this.anInt3319];
		}
		this.anInt3321 = 0;
		this.anInt3323 = 0;
		this.anInt3319 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class5_Sub2_Sub2_Sub6 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt3323; local229++) {
					this.anIntArray416[this.anInt3323] = local225.anIntArray416[local229] + this.anInt3321;
					this.anIntArray409[this.anInt3323] = local225.anIntArray409[local229] + this.anInt3321;
					this.anIntArray418[this.anInt3323] = local225.anIntArray418[local229] + this.anInt3321;
					this.anIntArray408[this.anInt3323] = local225.anIntArray408[local229];
					this.anIntArray413[this.anInt3323] = local225.anIntArray413[local229];
					this.anIntArray414[this.anInt3323] = local225.anIntArray414[local229];
					if (local18) {
						if (local225.aByteArray40 == null) {
							this.aByteArray40[this.anInt3323] = local225.aByte7;
						} else {
							this.aByteArray40[this.anInt3323] = local225.aByteArray40[local229];
						}
					}
					if (local20 && local225.aByteArray41 != null) {
						this.aByteArray41[this.anInt3323] = local225.aByteArray41[local229];
					}
					if (local22) {
						if (local225.aShortArray39 == null) {
							this.aShortArray39[this.anInt3323] = -1;
						} else {
							this.aShortArray39[this.anInt3323] = local225.aShortArray39[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray42 == null || local225.aByteArray42[local229] == -1) {
							this.aByteArray42[this.anInt3323] = -1;
						} else {
							this.aByteArray42[this.anInt3323] = (byte) (local225.aByteArray42[local229] + this.anInt3319);
						}
					}
					this.anInt3323++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt3319; local394++) {
					this.anIntArray412[this.anInt3319] = local225.anIntArray412[local394] + this.anInt3321;
					this.anIntArray410[this.anInt3319] = local225.anIntArray410[local394] + this.anInt3321;
					this.anIntArray419[this.anInt3319] = local225.anIntArray419[local394] + this.anInt3321;
					this.anInt3319++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt3321; local444++) {
					this.anIntArray417[this.anInt3321] = local225.anIntArray417[local444];
					this.anIntArray415[this.anInt3321] = local225.anIntArray415[local444];
					this.anIntArray411[this.anInt3321] = local225.anIntArray411[local444];
					this.anInt3321++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)V")
	private void method2138(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3318 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt3318; local6++) {
			Static131.anIntArray427[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt3323; local18++) {
			if (this.anIntArray414[local18] != -2) {
				local30 = this.anIntArray416[local18];
				local35 = this.anIntArray409[local18];
				local40 = this.anIntArray418[local18];
				local44 = Static131.anIntArray437[local30];
				local48 = Static131.anIntArray437[local35];
				local52 = Static131.anIntArray437[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static131.anIntArray433[local30];
					local71 = Static131.anIntArray433[local35];
					@Pc(75) int local75 = Static131.anIntArray433[local40];
					@Pc(79) int local79 = Static131.anIntArray426[local30];
					local83 = Static131.anIntArray426[local35];
					local87 = Static131.anIntArray426[local40];
					@Pc(91) int local91 = Static131.anIntArray430[local30];
					local95 = Static131.anIntArray430[local35];
					@Pc(99) int local99 = Static131.anIntArray430[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static131.aBooleanArray16[local18] = true;
						@Pc(180) int local180 = (Static131.anIntArray422[local30] + Static131.anIntArray422[local35] + Static131.anIntArray422[local40]) / 3 + this.anInt3317;
						Static131.anIntArrayArray29[local180][Static131.anIntArray427[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method2139(Static131.anInt3328, Static131.anInt3330, Static131.anIntArray420[local30], Static131.anIntArray420[local35], Static131.anIntArray420[local40], local44, local48, local52)) {
						Static131.anIntArray434[Static131.anInt3327++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static131.anIntArray420[local40] - Static131.anIntArray420[local35]) - (Static131.anIntArray420[local30] - Static131.anIntArray420[local35]) * (local52 - local48) > 0) {
						Static131.aBooleanArray16[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static51.anInt1304 && local48 <= Static51.anInt1304 && local52 <= Static51.anInt1304) {
							Static131.aBooleanArray17[local18] = false;
						} else {
							Static131.aBooleanArray17[local18] = true;
						}
						local67 = (Static131.anIntArray422[local30] + Static131.anIntArray422[local35] + Static131.anIntArray422[local40]) / 3 + this.anInt3317;
						Static131.anIntArrayArray29[local67][Static131.anIntArray427[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray40 == null) {
			for (local30 = this.anInt3318 - 1; local30 >= 0; local30--) {
				local35 = Static131.anIntArray427[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static131.anIntArrayArray29[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method2155(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static131.anIntArray435[local30] = 0;
			Static131.anIntArray431[local30] = 0;
		}
		for (local35 = this.anInt3318 - 1; local35 >= 0; local35--) {
			local40 = Static131.anIntArray427[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static131.anIntArrayArray29[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray40[local52];
					local71 = Static131.anIntArray435[local388]++;
					Static131.anIntArrayArray28[local388][local71] = local52;
					if (local388 < 10) {
						Static131.anIntArray431[local388] += local35;
					} else if (local388 == 10) {
						Static131.anIntArray438[local71] = local35;
					} else {
						Static131.anIntArray423[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static131.anIntArray435[1] > 0 || Static131.anIntArray435[2] > 0) {
			local40 = (Static131.anIntArray431[1] + Static131.anIntArray431[2]) / (Static131.anIntArray435[1] + Static131.anIntArray435[2]);
		}
		local44 = 0;
		if (Static131.anIntArray435[3] > 0 || Static131.anIntArray435[4] > 0) {
			local44 = (Static131.anIntArray431[3] + Static131.anIntArray431[4]) / (Static131.anIntArray435[3] + Static131.anIntArray435[4]);
		}
		local48 = 0;
		if (Static131.anIntArray435[6] > 0 || Static131.anIntArray435[8] > 0) {
			local48 = (Static131.anIntArray431[6] + Static131.anIntArray431[8]) / (Static131.anIntArray435[6] + Static131.anIntArray435[8]);
		}
		local67 = 0;
		local71 = Static131.anIntArray435[10];
		@Pc(521) int[] local521 = Static131.anIntArrayArray28[10];
		@Pc(523) int[] local523 = Static131.anIntArray438;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static131.anIntArray435[11];
			local521 = Static131.anIntArrayArray28[11];
			local523 = Static131.anIntArray423;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method2155(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray435[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray423;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method2155(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray435[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray423;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method2155(local521[local67++]);
				if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
					local67 = 0;
					local71 = Static131.anIntArray435[11];
					local521 = Static131.anIntArrayArray28[11];
					local523 = Static131.anIntArray423;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static131.anIntArray435[local83];
			@Pc(686) int[] local686 = Static131.anIntArrayArray28[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method2155(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method2155(local521[local67++]);
			if (local67 == local71 && local521 != Static131.anIntArrayArray28[11]) {
				local67 = 0;
				local521 = Static131.anIntArrayArray28[11];
				local71 = Static131.anIntArray435[11];
				local523 = Static131.anIntArray423;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method2140() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3321; local1++) {
			@Pc(7) int local7 = this.anIntArray417[local1];
			this.anIntArray417[local1] = this.anIntArray411[local1];
			this.anIntArray411[local1] = -local7;
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	public void method2141() {
		if (this.anInt3320 == 1) {
			return;
		}
		this.anInt3320 = 1;
		super.anInt3358 = 0;
		this.anInt3322 = 0;
		this.anInt3324 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt3321; local18++) {
			@Pc(24) int local24 = this.anIntArray417[local18];
			@Pc(29) int local29 = this.anIntArray415[local18];
			@Pc(34) int local34 = this.anIntArray411[local18];
			if (-local29 > super.anInt3358) {
				super.anInt3358 = -local29;
			}
			if (local29 > this.anInt3322) {
				this.anInt3322 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt3324) {
				this.anInt3324 = local58;
			}
		}
		this.anInt3324 = (int) (Math.sqrt((double) this.anInt3324) + 0.99D);
		this.anInt3317 = (int) (Math.sqrt((double) (this.anInt3324 * this.anInt3324 + super.anInt3358 * super.anInt3358)) + 0.99D);
		this.anInt3318 = this.anInt3317 + (int) (Math.sqrt((double) (this.anInt3324 * this.anInt3324 + this.anInt3322 * this.anInt3322)) + 0.99D);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	public void method2142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static131.anIntArray427[0] = -1;
		if (this.anInt3320 != 2 && this.anInt3320 != 1) {
			this.method2153();
		}
		@Pc(15) int local15 = Static51.anInt1302;
		@Pc(17) int local17 = Static51.anInt1301;
		@Pc(21) int local21 = Static131.anIntArray432[0];
		@Pc(25) int local25 = Static131.anIntArray425[0];
		@Pc(29) int local29 = Static131.anIntArray432[arg0];
		@Pc(33) int local33 = Static131.anIntArray425[arg0];
		@Pc(37) int local37 = Static131.anIntArray432[arg1];
		@Pc(41) int local41 = Static131.anIntArray425[arg1];
		@Pc(45) int local45 = Static131.anIntArray432[arg2];
		@Pc(49) int local49 = Static131.anIntArray425[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt3321; local61++) {
			@Pc(67) int local67 = this.anIntArray417[local61];
			@Pc(72) int local72 = this.anIntArray415[local61];
			@Pc(77) int local77 = this.anIntArray411[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static131.anIntArray422[local61] = local77 - local59;
			Static131.anIntArray437[local61] = local15 + (local67 << 9) / local77;
			Static131.anIntArray420[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt3319 > 0) {
				Static131.anIntArray433[local61] = local67;
				Static131.anIntArray426[local61] = local89;
				Static131.anIntArray430[local61] = local77;
			}
		}
		try {
			this.method2138(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kc;ILclient!kc;I[I)V")
	public void method2143(@OriginalArg(0) Class5_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2147(arg0, arg1);
			return;
		}
		@Pc(18) Class3 local18 = arg0.aClass3Array1[arg1];
		@Pc(23) Class3 local23 = arg2.aClass3Array1[arg3];
		@Pc(26) Class5_Sub24 local26 = local18.aClass5_Sub24_1;
		Static131.anInt3325 = 0;
		Static131.anInt3326 = 0;
		Static131.anInt3329 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt24; local41++) {
			local47 = local18.anIntArray9[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray447[local47] == 0) {
				this.method2150(local26.anIntArray447[local47], local26.anIntArrayArray30[local47], local18.anIntArray8[local41], local18.anIntArray4[local41], local18.anIntArray11[local41]);
			}
		}
		Static131.anInt3325 = 0;
		Static131.anInt3326 = 0;
		Static131.anInt3329 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt24; local47++) {
			@Pc(112) int local112 = local23.anIntArray9[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray447[local112] == 0) {
				this.method2150(local26.anIntArray447[local112], local26.anIntArrayArray30[local112], local23.anIntArray8[local47], local23.anIntArray4[local47], local23.anIntArray11[local47]);
			}
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	private void method2144(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static51.anInt1302;
		@Pc(3) int local3 = Static51.anInt1301;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray416[arg0];
		@Pc(15) int local15 = this.anIntArray409[arg0];
		@Pc(20) int local20 = this.anIntArray418[arg0];
		@Pc(24) int local24 = Static131.anIntArray430[local10];
		@Pc(28) int local28 = Static131.anIntArray430[local15];
		@Pc(32) int local32 = Static131.anIntArray430[local20];
		if (this.aByteArray41 == null) {
			Static51.anInt1305 = 0;
		} else {
			Static51.anInt1305 = this.aByteArray41[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static131.anIntArray428[0] = Static131.anIntArray437[local10];
			Static131.anIntArray436[0] = Static131.anIntArray420[local10];
			local5++;
			Static131.anIntArray424[0] = this.anIntArray408[arg0];
		} else {
			local73 = Static131.anIntArray433[local10];
			local77 = Static131.anIntArray426[local10];
			local82 = this.anIntArray408[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static131.anIntArray421[local32 - local24];
				Static131.anIntArray428[0] = local1 + (local73 + ((Static131.anIntArray433[local20] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[0] = local3 + (local77 + ((Static131.anIntArray426[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static131.anIntArray424[0] = local82 + ((this.anIntArray414[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static131.anIntArray421[local28 - local24];
				Static131.anIntArray428[local5] = local1 + (local73 + ((Static131.anIntArray433[local15] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[local5] = local3 + (local77 + ((Static131.anIntArray426[local15] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray424[local5++] = local82 + ((this.anIntArray413[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static131.anIntArray428[local5] = Static131.anIntArray437[local15];
			Static131.anIntArray436[local5] = Static131.anIntArray420[local15];
			Static131.anIntArray424[local5++] = this.anIntArray413[arg0];
		} else {
			local73 = Static131.anIntArray433[local15];
			local77 = Static131.anIntArray426[local15];
			local82 = this.anIntArray413[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static131.anIntArray421[local24 - local28];
				Static131.anIntArray428[local5] = local1 + (local73 + ((Static131.anIntArray433[local10] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[local5] = local3 + (local77 + ((Static131.anIntArray426[local10] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray424[local5++] = local82 + ((this.anIntArray408[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static131.anIntArray421[local32 - local28];
				Static131.anIntArray428[local5] = local1 + (local73 + ((Static131.anIntArray433[local20] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[local5] = local3 + (local77 + ((Static131.anIntArray426[local20] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray424[local5++] = local82 + ((this.anIntArray414[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static131.anIntArray428[local5] = Static131.anIntArray437[local20];
			Static131.anIntArray436[local5] = Static131.anIntArray420[local20];
			Static131.anIntArray424[local5++] = this.anIntArray414[arg0];
		} else {
			local73 = Static131.anIntArray433[local20];
			local77 = Static131.anIntArray426[local20];
			local82 = this.anIntArray414[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static131.anIntArray421[local28 - local32];
				Static131.anIntArray428[local5] = local1 + (local73 + ((Static131.anIntArray433[local15] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[local5] = local3 + (local77 + ((Static131.anIntArray426[local15] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray424[local5++] = local82 + ((this.anIntArray413[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static131.anIntArray421[local24 - local32];
				Static131.anIntArray428[local5] = local1 + (local73 + ((Static131.anIntArray433[local10] - local73) * local95 >> 16) << 9) / 50;
				Static131.anIntArray436[local5] = local3 + (local77 + ((Static131.anIntArray426[local10] - local77) * local95 >> 16) << 9) / 50;
				Static131.anIntArray424[local5++] = local82 + ((this.anIntArray408[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static131.anIntArray428[0];
		local77 = Static131.anIntArray428[1];
		local82 = Static131.anIntArray428[2];
		local95 = Static131.anIntArray436[0];
		@Pc(590) int local590 = Static131.anIntArray436[1];
		@Pc(594) int local594 = Static131.anIntArray436[2];
		Static51.aBoolean41 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static51.anInt1304 || local77 > Static51.anInt1304 || local82 > Static51.anInt1304) {
				Static51.aBoolean41 = true;
			}
			if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
				if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray42[arg0] & 0xFF;
					local683 = this.anIntArray412[local678];
					local688 = this.anIntArray410[local678];
					local693 = this.anIntArray419[local678];
				}
				if (this.anIntArray414[arg0] == -1) {
					Static51.method941(local95, local590, local594, local73, local77, local82, this.anIntArray408[arg0], this.anIntArray408[arg0], this.anIntArray408[arg0], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], this.aShortArray39[arg0]);
				} else {
					Static51.method941(local95, local590, local594, local73, local77, local82, Static131.anIntArray424[0], Static131.anIntArray424[1], Static131.anIntArray424[2], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], this.aShortArray39[arg0]);
				}
			} else if (this.anIntArray414[arg0] == -1) {
				Static51.method936(local95, local590, local594, local73, local77, local82, Static131.anIntArray429[this.anIntArray408[arg0]]);
			} else {
				Static51.method942(local95, local590, local594, local73, local77, local82, Static131.anIntArray424[0], Static131.anIntArray424[1], Static131.anIntArray424[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static51.anInt1304 || local77 > Static51.anInt1304 || local82 > Static51.anInt1304 || Static131.anIntArray428[3] < 0 || Static131.anIntArray428[3] > Static51.anInt1304) {
			Static51.aBoolean41 = true;
		}
		if (this.aShortArray39 == null || this.aShortArray39[arg0] == -1) {
			if (this.anIntArray414[arg0] == -1) {
				local683 = Static131.anIntArray429[this.anIntArray408[arg0]];
				Static51.method936(local95, local590, local594, local73, local77, local82, local683);
				Static51.method936(local95, local594, Static131.anIntArray436[3], local73, local82, Static131.anIntArray428[3], local683);
				return;
			}
			Static51.method942(local95, local590, local594, local73, local77, local82, Static131.anIntArray424[0], Static131.anIntArray424[1], Static131.anIntArray424[2]);
			Static51.method942(local95, local594, Static131.anIntArray436[3], local73, local82, Static131.anIntArray428[3], Static131.anIntArray424[0], Static131.anIntArray424[2], Static131.anIntArray424[3]);
			return;
		}
		if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray42[arg0] & 0xFF;
			local683 = this.anIntArray412[local678];
			local688 = this.anIntArray410[local678];
			local693 = this.anIntArray419[local678];
		}
		@Pc(956) short local956 = this.aShortArray39[arg0];
		if (this.anIntArray414[arg0] == -1) {
			Static51.method941(local95, local590, local594, local73, local77, local82, this.anIntArray408[arg0], this.anIntArray408[arg0], this.anIntArray408[arg0], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], local956);
			Static51.method941(local95, local594, Static131.anIntArray436[3], local73, local82, Static131.anIntArray428[3], this.anIntArray408[arg0], this.anIntArray408[arg0], this.anIntArray408[arg0], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], local956);
			return;
		}
		Static51.method941(local95, local590, local594, local73, local77, local82, Static131.anIntArray424[0], Static131.anIntArray424[1], Static131.anIntArray424[2], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], local956);
		Static51.method941(local95, local594, Static131.anIntArray436[3], local73, local82, Static131.anIntArray428[3], Static131.anIntArray424[0], Static131.anIntArray424[2], Static131.anIntArray424[3], Static131.anIntArray433[local683], Static131.anIntArray433[local688], Static131.anIntArray433[local693], Static131.anIntArray426[local683], Static131.anIntArray426[local688], Static131.anIntArray426[local693], Static131.anIntArray430[local683], Static131.anIntArray430[local688], Static131.anIntArray430[local693], local956);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method2145() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3321; local1++) {
			this.anIntArray417[local1] = -this.anIntArray417[local1];
			this.anIntArray411[local1] = -this.anIntArray411[local1];
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static131.anIntArray427[0] = -1;
		if (this.anInt3320 != 1) {
			this.method2141();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt3324 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt3324 << 9;
		if (local64 / local40 >= Static51.anInt1307) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt3324 << 9;
		if (local77 / local40 <= Static51.anInt1303) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt3324 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static51.anInt1299) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3358 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static51.anInt1300) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3358 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt3319 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static131.aBoolean121) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static131.anInt3328 - Static51.anInt1302;
			local223 = Static131.anInt3330 - Static51.anInt1301;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean120) {
					Static131.anIntArray434[Static131.anInt3327++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static51.anInt1302;
		local219 = Static51.anInt1301;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static131.anIntArray432[arg0];
			local257 = Static131.anIntArray425[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt3321; local269++) {
			@Pc(275) int local275 = this.anIntArray417[local269];
			@Pc(280) int local280 = this.anIntArray415[local269];
			@Pc(285) int local285 = this.anIntArray411[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static131.anIntArray422[local269] = local285 - local29;
			if (local285 >= 50) {
				Static131.anIntArray437[local269] = local172 + (local275 << 9) / local285;
				Static131.anIntArray420[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static131.anIntArray437[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static131.anIntArray433[local269] = local275;
				Static131.anIntArray426[local269] = local297;
				Static131.anIntArray430[local269] = local285;
			}
		}
		try {
			this.method2138(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!wb;[B)Lclient!wb;")
	private Class5_Sub2_Sub2_Sub6 method2146(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub2_Sub2_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3321 = this.anInt3321;
		arg1.anInt3323 = this.anInt3323;
		arg1.anInt3319 = this.anInt3319;
		if (arg1.anIntArray417 == null || arg1.anIntArray417.length < this.anInt3321) {
			arg1.anIntArray417 = new int[this.anInt3321 + 100];
			arg1.anIntArray415 = new int[this.anInt3321 + 100];
			arg1.anIntArray411 = new int[this.anInt3321 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt3321; local43++) {
			arg1.anIntArray417[local43] = this.anIntArray417[local43];
			arg1.anIntArray415[local43] = this.anIntArray415[local43];
			arg1.anIntArray411[local43] = this.anIntArray411[local43];
		}
		if (arg0) {
			arg1.aByteArray41 = this.aByteArray41;
		} else {
			arg1.aByteArray41 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray41 == null) {
				for (local88 = 0; local88 < this.anInt3323; local88++) {
					arg1.aByteArray41[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt3323; local88++) {
					arg1.aByteArray41[local88] = this.aByteArray41[local88];
				}
			}
		}
		arg1.anIntArray416 = this.anIntArray416;
		arg1.anIntArray409 = this.anIntArray409;
		arg1.anIntArray418 = this.anIntArray418;
		arg1.anIntArray408 = this.anIntArray408;
		arg1.anIntArray413 = this.anIntArray413;
		arg1.anIntArray414 = this.anIntArray414;
		arg1.aByteArray40 = this.aByteArray40;
		arg1.aByteArray42 = this.aByteArray42;
		arg1.aShortArray39 = this.aShortArray39;
		arg1.aByte7 = this.aByte7;
		arg1.anIntArray412 = this.anIntArray412;
		arg1.anIntArray410 = this.anIntArray410;
		arg1.anIntArray419 = this.anIntArray419;
		arg1.anIntArrayArray26 = this.anIntArrayArray26;
		arg1.anIntArrayArray27 = this.anIntArrayArray27;
		arg1.aBoolean120 = this.aBoolean120;
		arg1.anInt3320 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kc;I)V")
	public void method2147(@OriginalArg(0) Class5_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray26 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class3 local12 = arg0.aClass3Array1[arg1];
		@Pc(15) Class5_Sub24 local15 = local12.aClass5_Sub24_1;
		Static131.anInt3325 = 0;
		Static131.anInt3326 = 0;
		Static131.anInt3329 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt24; local23++) {
			@Pc(29) int local29 = local12.anIntArray9[local23];
			this.method2150(local15.anIntArray447[local29], local15.anIntArrayArray30[local29], local12.anIntArray8[local23], local12.anIntArray4[local23], local12.anIntArray11[local23]);
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3321; local1++) {
			this.anIntArray417[local1] = this.anIntArray417[local1] * arg0 / 128;
			this.anIntArray415[local1] = this.anIntArray415[local1] * arg1 / 128;
			this.anIntArray411[local1] = this.anIntArray411[local1] * arg2 / 128;
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	public int method2149() {
		this.method2141();
		return this.anInt3324;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[IIII)V")
	private void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static131.anInt3325 = 0;
			Static131.anInt3326 = 0;
			Static131.anInt3329 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray26.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray26[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static131.anInt3325 += this.anIntArray417[local36];
						Static131.anInt3326 += this.anIntArray415[local36];
						Static131.anInt3329 += this.anIntArray411[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static131.anInt3325 = Static131.anInt3325 / local6 + arg2;
				Static131.anInt3326 = Static131.anInt3326 / local6 + arg3;
				Static131.anInt3329 = Static131.anInt3329 / local6 + arg4;
			} else {
				Static131.anInt3325 = arg2;
				Static131.anInt3326 = arg3;
				Static131.anInt3329 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray417[local31] += arg2;
						this.anIntArray415[local31] += arg3;
						this.anIntArray411[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray417[local31] -= Static131.anInt3325;
						this.anIntArray415[local31] -= Static131.anInt3326;
						this.anIntArray411[local31] -= Static131.anInt3329;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static131.anIntArray432[local225];
							local235 = Static131.anIntArray425[local225];
							local251 = this.anIntArray415[local31] * local231 + this.anIntArray417[local31] * local235 >> 16;
							this.anIntArray415[local31] = this.anIntArray415[local31] * local235 - this.anIntArray417[local31] * local231 >> 16;
							this.anIntArray417[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static131.anIntArray432[local36];
							local235 = Static131.anIntArray425[local36];
							local251 = this.anIntArray415[local31] * local235 - this.anIntArray411[local31] * local231 >> 16;
							this.anIntArray411[local31] = this.anIntArray415[local31] * local231 + this.anIntArray411[local31] * local235 >> 16;
							this.anIntArray415[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static131.anIntArray432[local219];
							local235 = Static131.anIntArray425[local219];
							local251 = this.anIntArray411[local31] * local231 + this.anIntArray417[local31] * local235 >> 16;
							this.anIntArray411[local31] = this.anIntArray411[local31] * local235 - this.anIntArray417[local31] * local231 >> 16;
							this.anIntArray417[local31] = local251;
						}
						this.anIntArray417[local31] += Static131.anInt3325;
						this.anIntArray415[local31] += Static131.anInt3326;
						this.anIntArray411[local31] += Static131.anInt3329;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray26.length) {
					local115 = this.anIntArrayArray26[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray417[local31] -= Static131.anInt3325;
						this.anIntArray415[local31] -= Static131.anInt3326;
						this.anIntArray411[local31] -= Static131.anInt3329;
						this.anIntArray417[local31] = this.anIntArray417[local31] * arg2 / 128;
						this.anIntArray415[local31] = this.anIntArray415[local31] * arg3 / 128;
						this.anIntArray411[local31] = this.anIntArray411[local31] * arg4 / 128;
						this.anIntArray417[local31] += Static131.anInt3325;
						this.anIntArray415[local31] += Static131.anInt3326;
						this.anIntArray411[local31] += Static131.anInt3329;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray27 != null && this.aByteArray41 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray41[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray41[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2152(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static131.aByteArray44.length < this.anInt3323) {
			Static131.aByteArray44 = new byte[this.anInt3323 + 100];
		}
		return this.method2146(arg0, Static131.aClass5_Sub2_Sub2_Sub6_3, Static131.aByteArray44);
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
	private void method2153() {
		if (this.anInt3320 == 2) {
			return;
		}
		this.anInt3320 = 2;
		this.anInt3324 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3321; local12++) {
			@Pc(18) int local18 = this.anIntArray417[local12];
			@Pc(23) int local23 = this.anIntArray415[local12];
			@Pc(28) int local28 = this.anIntArray411[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt3324) {
				this.anInt3324 = local40;
			}
		}
		this.anInt3324 = (int) (Math.sqrt((double) this.anInt3324) + 0.99D);
		this.anInt3317 = this.anInt3324;
		this.anInt3318 = this.anInt3324 + this.anInt3324;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIIIII)V")
	public void method2154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static131.anIntArray427[0] = -1;
		if (this.anInt3320 != 2 && this.anInt3320 != 1) {
			this.method2153();
		}
		@Pc(15) int local15 = Static51.anInt1302;
		@Pc(17) int local17 = Static51.anInt1301;
		@Pc(21) int local21 = Static131.anIntArray432[0];
		@Pc(25) int local25 = Static131.anIntArray425[0];
		@Pc(29) int local29 = Static131.anIntArray432[arg0];
		@Pc(33) int local33 = Static131.anIntArray425[arg0];
		@Pc(37) int local37 = Static131.anIntArray432[arg1];
		@Pc(41) int local41 = Static131.anIntArray425[arg1];
		@Pc(45) int local45 = Static131.anIntArray432[arg2];
		@Pc(49) int local49 = Static131.anIntArray425[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt3321; local61++) {
			@Pc(67) int local67 = this.anIntArray417[local61];
			@Pc(72) int local72 = this.anIntArray415[local61];
			@Pc(77) int local77 = this.anIntArray411[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static131.anIntArray422[local61] = local77 - local59;
			Static131.anIntArray437[local61] = local15 + (local67 << 9) / arg6;
			Static131.anIntArray420[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt3319 > 0) {
				Static131.anIntArray433[local61] = local67;
				Static131.anIntArray426[local61] = local89;
				Static131.anIntArray430[local61] = local77;
			}
		}
		try {
			this.method2138(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
	private void method2155(@OriginalArg(0) int arg0) {
		if (Static131.aBooleanArray16[arg0]) {
			this.method2144(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray416[arg0];
		@Pc(17) int local17 = this.anIntArray409[arg0];
		@Pc(22) int local22 = this.anIntArray418[arg0];
		Static51.aBoolean41 = Static131.aBooleanArray17[arg0];
		if (this.aByteArray41 == null) {
			Static51.anInt1305 = 0;
		} else {
			Static51.anInt1305 = this.aByteArray41[arg0] & 0xFF;
		}
		if (this.aShortArray39 != null && this.aShortArray39[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray42 == null || this.aByteArray42[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray42[arg0] & 0xFF;
				local133 = this.anIntArray412[local128];
				local138 = this.anIntArray410[local128];
				local143 = this.anIntArray419[local128];
			}
			if (this.anIntArray414[arg0] == -1) {
				Static51.method941(Static131.anIntArray420[local12], Static131.anIntArray420[local17], Static131.anIntArray420[local22], Static131.anIntArray437[local12], Static131.anIntArray437[local17], Static131.anIntArray437[local22], this.anIntArray408[arg0], this.anIntArray408[arg0], this.anIntArray408[arg0], Static131.anIntArray433[local133], Static131.anIntArray433[local138], Static131.anIntArray433[local143], Static131.anIntArray426[local133], Static131.anIntArray426[local138], Static131.anIntArray426[local143], Static131.anIntArray430[local133], Static131.anIntArray430[local138], Static131.anIntArray430[local143], this.aShortArray39[arg0]);
			} else {
				Static51.method941(Static131.anIntArray420[local12], Static131.anIntArray420[local17], Static131.anIntArray420[local22], Static131.anIntArray437[local12], Static131.anIntArray437[local17], Static131.anIntArray437[local22], this.anIntArray408[arg0], this.anIntArray413[arg0], this.anIntArray414[arg0], Static131.anIntArray433[local133], Static131.anIntArray433[local138], Static131.anIntArray433[local143], Static131.anIntArray426[local133], Static131.anIntArray426[local138], Static131.anIntArray426[local143], Static131.anIntArray430[local133], Static131.anIntArray430[local138], Static131.anIntArray430[local143], this.aShortArray39[arg0]);
			}
		} else if (this.anIntArray414[arg0] == -1) {
			Static51.method936(Static131.anIntArray420[local12], Static131.anIntArray420[local17], Static131.anIntArray420[local22], Static131.anIntArray437[local12], Static131.anIntArray437[local17], Static131.anIntArray437[local22], Static131.anIntArray429[this.anIntArray408[arg0]]);
		} else {
			Static51.method942(Static131.anIntArray420[local12], Static131.anIntArray420[local17], Static131.anIntArray420[local22], Static131.anIntArray437[local12], Static131.anIntArray437[local17], Static131.anIntArray437[local22], this.anIntArray408[arg0], this.anIntArray413[arg0], this.anIntArray414[arg0]);
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2156(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static131.aByteArray43.length < this.anInt3323) {
			Static131.aByteArray43 = new byte[this.anInt3323 + 100];
		}
		return this.method2146(arg0, Static131.aClass5_Sub2_Sub2_Sub6_2, Static131.aByteArray43);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
	public void method2157() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3321; local1++) {
			@Pc(7) int local7 = this.anIntArray411[local1];
			this.anIntArray411[local1] = this.anIntArray417[local1];
			this.anIntArray417[local1] = -local7;
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public void method2158(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static131.anIntArray432[arg0];
		@Pc(7) int local7 = Static131.anIntArray425[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3321; local9++) {
			@Pc(26) int local26 = this.anIntArray415[local9] * local7 - this.anIntArray411[local9] * local3 >> 16;
			this.anIntArray411[local9] = this.anIntArray415[local9] * local3 + this.anIntArray411[local9] * local7 >> 16;
			this.anIntArray415[local9] = local26;
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
	public void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3321; local1++) {
			this.anIntArray417[local1] += arg0;
			this.anIntArray415[local1] += arg1;
			this.anIntArray411[local1] += arg2;
		}
		this.anInt3320 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([[IIIIZI)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2160(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2141();
		@Pc(6) int local6 = arg1 - this.anInt3324;
		@Pc(11) int local11 = arg1 + this.anInt3324;
		@Pc(16) int local16 = arg3 - this.anInt3324;
		@Pc(21) int local21 = arg3 + this.anInt3324;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class5_Sub2_Sub2_Sub6 local101;
		if (arg4) {
			local101 = new Class5_Sub2_Sub2_Sub6();
			local101.anInt3321 = this.anInt3321;
			local101.anInt3323 = this.anInt3323;
			local101.anInt3319 = this.anInt3319;
			local101.anIntArray417 = this.anIntArray417;
			local101.anIntArray411 = this.anIntArray411;
			local101.anIntArray416 = this.anIntArray416;
			local101.anIntArray409 = this.anIntArray409;
			local101.anIntArray418 = this.anIntArray418;
			local101.anIntArray408 = this.anIntArray408;
			local101.anIntArray413 = this.anIntArray413;
			local101.anIntArray414 = this.anIntArray414;
			local101.aByteArray40 = this.aByteArray40;
			local101.aByteArray41 = this.aByteArray41;
			local101.aByteArray42 = this.aByteArray42;
			local101.aShortArray39 = this.aShortArray39;
			local101.aByte7 = this.aByte7;
			local101.anIntArray412 = this.anIntArray412;
			local101.anIntArray410 = this.anIntArray410;
			local101.anIntArray419 = this.anIntArray419;
			local101.anIntArrayArray26 = this.anIntArrayArray26;
			local101.anIntArrayArray27 = this.anIntArrayArray27;
			local101.aBoolean120 = this.aBoolean120;
			local101.anIntArray415 = new int[local101.anInt3321];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt3321; local201++) {
				local209 = this.anIntArray417[local201] + arg1;
				local216 = this.anIntArray411[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray415[local201] = this.anIntArray415[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt3321; local201++) {
				local209 = (-this.anIntArray415[local201] << 16) / super.anInt3358;
				if (local209 < arg5) {
					local216 = this.anIntArray417[local201] + arg1;
					local220 = this.anIntArray411[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray415[local201] = this.anIntArray415[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt3320 = 0;
		return local101;
	}
}
