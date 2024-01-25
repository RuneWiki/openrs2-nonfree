import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lclient!ut;")
	private Class253[][] aClass253ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "[[Lclient!vf;")
	private Class256[][] aClass256ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "[[Lclient!es;")
	private Class73[][] aClass73ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "[[Lclient!rq;")
	private Class224[][] aClass224ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	private int anInt987 = -1;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "Lclient!ji;")
	private final Class135_Sub1 aClass135_Sub1_2;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	private final int anInt979;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!ji;IIII[[I[[II)V")
	public Class41_Sub1(@OriginalArg(0) Class135_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass135_Sub1_2 = arg0;
		this.anInt979 = arg2;
		this.anIntArrayArray13 = arg5;
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass135_Sub1_2.anInt3425 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass135_Sub1_2.anInt3402 * local92 + this.aClass135_Sub1_2.anInt3403 * local98 + this.aClass135_Sub1_2.anInt3414 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray4[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!nf;[I[I[I)V")
	private void method802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class73 local6 = this.aClass73ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(194) int local194;
		@Pc(250) int local250;
		@Pc(306) int local306;
		@Pc(362) int local362;
		@Pc(390) int local390;
		@Pc(183) int local183;
		@Pc(239) int local239;
		@Pc(295) int local295;
		@Pc(351) int local351;
		@Pc(211) int local211;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(379) int local379;
		@Pc(72) int local72;
		@Pc(95) int local95;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(427) int local427;
		@Pc(222) int local222;
		@Pc(278) int local278;
		@Pc(334) int local334;
		if (local6 == null) {
			@Pc(1022) Class256 local1022 = this.aClass256ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt987 == -1) {
					for (local362 = 0; local362 < local1022.aShort97; local362++) {
						local24 = local1022.aShortArray119[local362] + (arg0 << super.anInt6907);
						local1046 = local1022.aShortArray123[local362];
						local34 = local1022.aShortArray120[local362] + (arg1 << super.anInt6907);
						local306 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local1046 + this.anInt983 * local34 >> 15);
						if (local306 <= this.aClass135_Sub1_2.anInt3429) {
							return;
						}
						local194 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local1046 + this.anInt981 * local34 >> 15);
						local250 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local1046 + this.anInt990 * local34 >> 15);
						arg3[local362] = arg2.anInt4352 + local194 * this.aClass135_Sub1_2.anInt3406 / local306;
						arg4[local362] = arg2.anInt4350 + local250 * this.aClass135_Sub1_2.anInt3410 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort97; local362++) {
						local24 = local1022.aShortArray119[local362] + (arg0 << super.anInt6907);
						local1046 = local1022.aShortArray123[local362];
						local34 = local1022.aShortArray120[local362] + (arg1 << super.anInt6907);
						local194 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local1046 + this.anInt981 * local34 >> 15);
						local250 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local1046 + this.anInt990 * local34 >> 15);
						arg3[local362] = arg2.anInt4352 + local194 * this.aClass135_Sub1_2.anInt3406 / this.anInt987;
						arg4[local362] = arg2.anInt4350 + local250 * this.aClass135_Sub1_2.anInt3410 / this.anInt987;
					}
				}
				if (local1022.aShortArray115 != null) {
					local362 = this.anIntArrayArray13[arg0][arg1];
					local222 = this.anIntArrayArray13[arg0 + 1][arg1];
					local278 = this.anIntArrayArray13[arg0][arg1 + 1];
					local334 = arg0 * super.anInt6905;
					local390 = local334 + super.anInt6905;
					local183 = arg1 * super.anInt6905;
					local239 = local183 + super.anInt6905;
					local295 = this.anInt980 + (this.anInt985 * local334 + this.anInt984 * local362 + this.anInt981 * local183 >> 15);
					local351 = this.anInt992 + (this.anInt982 * local334 + this.anInt986 * local362 + this.anInt990 * local183 >> 15);
					local211 = this.anInt988 + (this.anInt991 * local334 + this.anInt989 * local362 + this.anInt983 * local183 >> 15);
					local267 = this.anInt980 + (this.anInt985 * local390 + this.anInt984 * local222 + this.anInt981 * local183 >> 15);
					local323 = this.anInt992 + (this.anInt982 * local390 + this.anInt986 * local222 + this.anInt990 * local183 >> 15);
					local379 = this.anInt988 + (this.anInt991 * local390 + this.anInt989 * local222 + this.anInt983 * local183 >> 15);
					local72 = this.anInt980 + (this.anInt985 * local334 + this.anInt984 * local278 + this.anInt981 * local239 >> 15);
					local95 = this.anInt992 + (this.anInt982 * local334 + this.anInt986 * local278 + this.anInt990 * local239 >> 15);
					local118 = this.anInt988 + (this.anInt991 * local334 + this.anInt989 * local278 + this.anInt983 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort96; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray121[local141];
						@Pc(1496) short local1496 = local1022.aShortArray116[local141];
						@Pc(1501) short local1501 = local1022.aShortArray122[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean321 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt4348 || local1509 > arg2.anInt4348 || local1513 > arg2.anInt4348;
							@Pc(1569) short local1569 = local1022.aShortArray115[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray540[local141];
								if (local1624 != -1) {
									arg2.method3475(local1517, local1521, local1525, local427, local1509, local1513, Static402.method5297(local1624, local1022.aShortArray118[local1491]), Static402.method5297(local1624, local1022.aShortArray118[local1496]), Static402.method5297(local1624, local1022.aShortArray118[local1501]));
								}
							} else {
								if (this.method807(this.aClass135_Sub1_2.anInterface5_7.method4079(local1569).aByte57)) {
									arg2.anInt4353 = 100;
								}
								arg2.method3476(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray118[local1491], local1022.aShortArray118[local1496], local1022.aShortArray118[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt4353 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort96; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray121[local362];
					@Pc(1675) short local1675 = local1022.aShortArray116[local362];
					@Pc(1680) short local1680 = local1022.aShortArray122[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray540[local362];
						if (local267 != -1) {
							arg2.aBoolean321 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt4348 || local183 > arg2.anInt4348 || local239 > arg2.anInt4348;
							arg2.method3475(local295, local351, local211, local390, local183, local239, Static402.method5297(local267, local1022.aShortArray118[local1670]), Static402.method5297(local267, local1022.aShortArray118[local1675]), Static402.method5297(local267, local1022.aShortArray118[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte24 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6905;
			local24 = local19 + super.anInt6905;
			@Pc(29) int local29 = arg1 * super.anInt6905;
			local34 = local29 + super.anInt6905;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte24 & 0x1) == 0) {
				local46 = this.anIntArrayArray13[arg0][arg1];
				local55 = this.anIntArrayArray13[arg0 + 1][arg1];
				local166 = this.anIntArrayArray13[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray13[arg0][arg1 + 1];
				if (this.anInt987 == -1) {
					local72 = this.anInt988 + (this.anInt991 * local19 + this.anInt989 * local46 + this.anInt983 * local29 >> 15);
					if (local72 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local95 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local55 + this.anInt983 * local29 >> 15);
					if (local95 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local118 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local166 + this.anInt983 * local34 >> 15);
					if (local118 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local141 = this.anInt988 + (this.anInt991 * local19 + this.anInt989 * local427 + this.anInt983 * local34 >> 15);
					if (local141 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
				} else {
					local141 = this.anInt987;
					local118 = this.anInt987;
					local95 = this.anInt987;
					local72 = this.anInt987;
				}
				local183 = this.anInt980 + (this.anInt985 * local19 + this.anInt984 * local46 + this.anInt981 * local29 >> 15);
				local194 = arg2.anInt4352 + local183 * this.aClass135_Sub1_2.anInt3406 / local72;
				local211 = this.anInt992 + (this.anInt982 * local19 + this.anInt986 * local46 + this.anInt990 * local29 >> 15);
				local222 = arg2.anInt4350 + local211 * this.aClass135_Sub1_2.anInt3410 / local72;
				local239 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local55 + this.anInt981 * local29 >> 15);
				local250 = arg2.anInt4352 + local239 * this.aClass135_Sub1_2.anInt3406 / local95;
				local267 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local55 + this.anInt990 * local29 >> 15);
				local278 = arg2.anInt4350 + local267 * this.aClass135_Sub1_2.anInt3410 / local95;
				local295 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local166 + this.anInt981 * local34 >> 15);
				local306 = arg2.anInt4352 + local295 * this.aClass135_Sub1_2.anInt3406 / local118;
				local323 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local166 + this.anInt990 * local34 >> 15);
				local334 = arg2.anInt4350 + local323 * this.aClass135_Sub1_2.anInt3410 / local118;
				local351 = this.anInt980 + (this.anInt985 * local19 + this.anInt984 * local427 + this.anInt981 * local34 >> 15);
				local362 = arg2.anInt4352 + local351 * this.aClass135_Sub1_2.anInt3406 / local141;
				local379 = this.anInt992 + (this.anInt982 * local19 + this.anInt986 * local427 + this.anInt990 * local34 >> 15);
				local390 = arg2.anInt4350 + local379 * this.aClass135_Sub1_2.anInt3410 / local141;
			} else {
				local46 = this.anIntArrayArray13[arg0][arg1];
				if (this.anInt987 == -1) {
					local55 = this.anInt989 * local46;
					local72 = this.anInt988 + (this.anInt991 * local19 + local55 + this.anInt983 * local29 >> 15);
					if (local72 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local95 = this.anInt988 + (this.anInt991 * local24 + local55 + this.anInt983 * local29 >> 15);
					if (local95 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local118 = this.anInt988 + (this.anInt991 * local24 + local55 + this.anInt983 * local34 >> 15);
					if (local118 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local141 = this.anInt988 + (this.anInt991 * local19 + local55 + this.anInt983 * local34 >> 15);
					if (local141 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
				} else {
					local141 = this.anInt987;
					local118 = this.anInt987;
					local95 = this.anInt987;
					local72 = this.anInt987;
				}
				local55 = this.anInt984 * local46;
				local166 = this.anInt986 * local46;
				local183 = this.anInt980 + (this.anInt985 * local19 + local55 + this.anInt981 * local29 >> 15);
				local194 = arg2.anInt4352 + local183 * this.aClass135_Sub1_2.anInt3406 / local72;
				local211 = this.anInt992 + (this.anInt982 * local19 + local166 + this.anInt990 * local29 >> 15);
				local222 = arg2.anInt4350 + local211 * this.aClass135_Sub1_2.anInt3410 / local72;
				local239 = this.anInt980 + (this.anInt985 * local24 + local55 + this.anInt981 * local29 >> 15);
				local250 = arg2.anInt4352 + local239 * this.aClass135_Sub1_2.anInt3406 / local95;
				local267 = this.anInt992 + (this.anInt982 * local24 + local166 + this.anInt990 * local29 >> 15);
				local278 = arg2.anInt4350 + local267 * this.aClass135_Sub1_2.anInt3410 / local95;
				local295 = this.anInt980 + (this.anInt985 * local24 + local55 + this.anInt981 * local34 >> 15);
				local306 = arg2.anInt4352 + local295 * this.aClass135_Sub1_2.anInt3406 / local118;
				local323 = this.anInt992 + (this.anInt982 * local24 + local166 + this.anInt990 * local34 >> 15);
				local334 = arg2.anInt4350 + local323 * this.aClass135_Sub1_2.anInt3410 / local118;
				local351 = this.anInt980 + (this.anInt985 * local19 + local55 + this.anInt981 * local34 >> 15);
				local362 = arg2.anInt4352 + local351 * this.aClass135_Sub1_2.anInt3406 / local141;
				local379 = this.anInt992 + (this.anInt982 * local19 + local166 + this.anInt990 * local34 >> 15);
				local390 = arg2.anInt4350 + local379 * this.aClass135_Sub1_2.anInt3410 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean321 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt4348 || local362 > arg2.anInt4348 || local250 > arg2.anInt4348;
				if (local6.aShort28 >= 0) {
					if (this.method807(this.aClass135_Sub1_2.anInterface5_7.method4079(local6.aShort28).aByte57)) {
						arg2.anInt4353 = 100;
					}
					arg2.method3476(local334, local390, local278, local306, local362, local250, local6.aShort29 & 0xFFFF, local6.aShort25 & 0xFFFF, local6.aShort27 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort28);
					arg2.anInt4353 = 0;
				} else {
					arg2.method3475(local334, local390, local278, local306, local362, local250, local6.aShort29 & 0xFFFF, local6.aShort25 & 0xFFFF, local6.aShort27 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean321 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt4348 || local250 > arg2.anInt4348 || local362 > arg2.anInt4348;
				if (local6.aShort28 >= 0) {
					if (this.method807(this.aClass135_Sub1_2.anInterface5_7.method4079(local6.aShort28).aByte57)) {
						arg2.anInt4353 = 100;
					}
					arg2.method3476(local222, local278, local390, local194, local250, local362, local6.aShort26 & 0xFFFF, local6.aShort27 & 0xFFFF, local6.aShort25 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort28);
					arg2.anInt4353 = 0;
					return;
				}
				arg2.method3475(local222, local278, local390, local194, local250, local362, local6.aShort26 & 0xFFFF, local6.aShort27 & 0xFFFF, local6.aShort25 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZLclient!nf;[I[I[I)V")
	private void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class177 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class253 local6 = this.aClass253ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(268) int local268;
		@Pc(324) int local324;
		@Pc(380) int local380;
		@Pc(436) int local436;
		@Pc(296) int local296;
		@Pc(352) int local352;
		@Pc(408) int local408;
		@Pc(464) int local464;
		@Pc(257) int local257;
		@Pc(313) int local313;
		@Pc(369) int local369;
		@Pc(425) int local425;
		@Pc(285) int local285;
		@Pc(341) int local341;
		@Pc(397) int local397;
		@Pc(453) int local453;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(176) int local176;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(240) int local240;
		@Pc(501) int local501;
		@Pc(642) int local642;
		if (local6 == null) {
			@Pc(1452) Class224 local1452 = this.aClass224ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt987 == -1) {
					for (local436 = 0; local436 < local1452.aShort85; local436++) {
						local24 = local1452.aShortArray103[local436] + (arg0 << super.anInt6907);
						local29 = local1452.aShortArray100[local436];
						local34 = local1452.aShortArray101[local436] + (arg1 << super.anInt6907);
						local380 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local29 + this.anInt983 * local34 >> 15);
						if (local380 <= this.aClass135_Sub1_2.anInt3429) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass135_Sub1_2.anInt3404;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray102[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass135_Sub1_2.aBoolean262) {
							local296 = local380 - this.aClass135_Sub1_2.anInt3404;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local29 + this.anInt981 * local34 >> 15);
						local324 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local29 + this.anInt990 * local34 >> 15);
						arg4[local436] = arg3.anInt4352 + local268 * this.aClass135_Sub1_2.anInt3406 / local380;
						arg5[local436] = arg3.anInt4350 + local324 * this.aClass135_Sub1_2.anInt3410 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort85; local436++) {
						local24 = local1452.aShortArray103[local436] + (arg0 << super.anInt6907);
						local29 = local1452.aShortArray100[local436];
						local34 = local1452.aShortArray101[local436] + (arg1 << super.anInt6907);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt987 - this.aClass135_Sub1_2.anInt3404;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray102[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass135_Sub1_2.aBoolean262) {
							local296 = this.anInt987 - this.aClass135_Sub1_2.anInt3404;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local29 + this.anInt981 * local34 >> 15);
						local324 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local29 + this.anInt990 * local34 >> 15);
						arg4[local436] = arg3.anInt4352 + local268 * this.aClass135_Sub1_2.anInt3406 / this.anInt987;
						arg5[local436] = arg3.anInt4350 + local324 * this.aClass135_Sub1_2.anInt3410 / this.anInt987;
					}
				}
				if (local1452.aShortArray99 != null) {
					local436 = this.anIntArrayArray13[arg0][arg1];
					local296 = this.anIntArrayArray13[arg0 + 1][arg1];
					local352 = this.anIntArrayArray13[arg0][arg1 + 1];
					local408 = arg0 * super.anInt6905;
					local464 = local408 + super.anInt6905;
					local257 = arg1 * super.anInt6905;
					local313 = local257 + super.anInt6905;
					local369 = this.anInt980 + (this.anInt985 * local408 + this.anInt984 * local436 + this.anInt981 * local257 >> 15);
					local425 = this.anInt992 + (this.anInt982 * local408 + this.anInt986 * local436 + this.anInt990 * local257 >> 15);
					local285 = this.anInt988 + (this.anInt991 * local408 + this.anInt989 * local436 + this.anInt983 * local257 >> 15);
					local341 = this.anInt980 + (this.anInt985 * local464 + this.anInt984 * local296 + this.anInt981 * local257 >> 15);
					local397 = this.anInt992 + (this.anInt982 * local464 + this.anInt986 * local296 + this.anInt990 * local257 >> 15);
					local453 = this.anInt988 + (this.anInt991 * local464 + this.anInt989 * local296 + this.anInt983 * local257 >> 15);
					local82 = this.anInt980 + (this.anInt985 * local408 + this.anInt984 * local352 + this.anInt981 * local313 >> 15);
					local105 = this.anInt992 + (this.anInt982 * local408 + this.anInt986 * local352 + this.anInt990 * local313 >> 15);
					local128 = this.anInt988 + (this.anInt991 * local408 + this.anInt989 * local352 + this.anInt983 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort84; local151++) {
						local36 = local151 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg4[local36];
						local176 = arg4[local38];
						local56 = arg4[local40];
						local65 = arg5[local36];
						local240 = arg5[local38];
						local501 = arg5[local40];
						local642 = arg6[local36] + arg6[local38] + arg6[local40];
						if ((local42 - local176) * (local501 - local240) - (local65 - local240) * (local56 - local176) > 0) {
							arg3.aBoolean321 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt4348 || local176 > arg3.anInt4348 || local56 > arg3.anInt4348;
							@Pc(2138) short local2138 = local1452.aShortArray99[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method807(this.aClass135_Sub1_2.anInterface5_7.method4079(local2138).aByte57)) {
									arg3.anInt4353 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method3470(local65, local240, local501, local42, local176, local56, this.aClass135_Sub1_2.anInt3416, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray464[local36], local1452.anIntArray464[local38], local1452.anIntArray464[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray464[local36] & 0xFFFFFF) != 0) {
										arg3.method3473(local65, local240, local501, local42, local176, local56, Static60.method850(local1452.anIntArray464[local36], arg6[local36] << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local1452.anIntArray464[local38], arg6[local38] << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local1452.anIntArray464[local40], arg6[local40] << 24 | this.aClass135_Sub1_2.anInt3416));
									}
								} else if (local2138 != -1) {
									arg3.method3476(local65, local240, local501, local42, local176, local56, local1452.anIntArray464[local36], local1452.anIntArray464[local38], local1452.anIntArray464[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray464[local36] & 0xFFFFFF) != 0) {
									arg3.method3473(local65, local240, local501, local42, local176, local56, local1452.anIntArray464[local36], local1452.anIntArray464[local38], local1452.anIntArray464[local40]);
								}
								arg3.anInt4353 = 0;
							} else {
								arg3.method3466(local65, local240, local501, local42, local176, local56, this.aClass135_Sub1_2.anInt3416);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort84; local436++) {
					local296 = local436 * 3;
					local352 = local296 + 1;
					local408 = local352 + 1;
					local464 = arg4[local296];
					local257 = arg4[local352];
					local313 = arg4[local408];
					local369 = arg5[local296];
					local425 = arg5[local352];
					local285 = arg5[local408];
					local341 = arg6[local296] + arg6[local352] + arg6[local408];
					if ((local464 - local257) * (local285 - local425) - (local369 - local425) * (local313 - local257) > 0) {
						arg3.aBoolean321 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt4348 || local257 > arg3.anInt4348 || local313 > arg3.anInt4348;
						if (local341 >= 765) {
							arg3.method3466(local369, local425, local285, local464, local257, local313, this.aClass135_Sub1_2.anInt3416);
						} else if (local341 > 0) {
							if ((local1452.anIntArray464[local296] & 0xFFFFFF) != 0) {
								arg3.method3473(local369, local425, local285, local464, local257, local313, Static237.method4733(this.aClass135_Sub1_2.anInt3416, arg6[local296], local1452.anIntArray464[local296]), Static237.method4733(this.aClass135_Sub1_2.anInt3416, arg6[local352], local1452.anIntArray464[local352]), Static237.method4733(this.aClass135_Sub1_2.anInt3416, arg6[local408], local1452.anIntArray464[local408]));
							}
						} else if ((local1452.anIntArray464[local296] & 0xFFFFFF) != 0) {
							arg3.method3473(local369, local425, local285, local464, local257, local313, local1452.anIntArray464[local296], local1452.anIntArray464[local352], local1452.anIntArray464[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte97 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6905;
			local24 = local19 + super.anInt6905;
			local29 = arg1 * super.anInt6905;
			local34 = local29 + super.anInt6905;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte97 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray13[arg0][arg1];
				local65 = this.anIntArrayArray13[arg0 + 1][arg1];
				local240 = this.anIntArrayArray13[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray13[arg0][arg1 + 1];
				if (this.anInt987 == -1) {
					local82 = this.anInt988 + (this.anInt991 * local19 + this.anInt989 * local56 + this.anInt983 * local29 >> 15);
					if (local82 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local105 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local65 + this.anInt983 * local29 >> 15);
					if (local105 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local128 = this.anInt988 + (this.anInt991 * local24 + this.anInt989 * local240 + this.anInt983 * local34 >> 15);
					if (local128 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local151 = this.anInt988 + (this.anInt991 * local19 + this.anInt989 * local501 + this.anInt983 * local34 >> 15);
					if (local151 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
				} else {
					local151 = this.anInt987;
					local128 = this.anInt987;
					local105 = this.anInt987;
					local82 = this.anInt987;
				}
				if (arg2) {
					local176 = local82 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort93 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort90 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort94 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort92 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass135_Sub1_2.aBoolean262) {
					local176 = local82 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt980 + (this.anInt985 * local19 + this.anInt984 * local56 + this.anInt981 * local29 >> 15);
				local268 = arg3.anInt4352 + local257 * this.aClass135_Sub1_2.anInt3406 / local82;
				local285 = this.anInt992 + (this.anInt982 * local19 + this.anInt986 * local56 + this.anInt990 * local29 >> 15);
				local296 = arg3.anInt4350 + local285 * this.aClass135_Sub1_2.anInt3410 / local82;
				local313 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local65 + this.anInt981 * local29 >> 15);
				local324 = arg3.anInt4352 + local313 * this.aClass135_Sub1_2.anInt3406 / local105;
				local341 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local65 + this.anInt990 * local29 >> 15);
				local352 = arg3.anInt4350 + local341 * this.aClass135_Sub1_2.anInt3410 / local105;
				local369 = this.anInt980 + (this.anInt985 * local24 + this.anInt984 * local240 + this.anInt981 * local34 >> 15);
				local380 = arg3.anInt4352 + local369 * this.aClass135_Sub1_2.anInt3406 / local128;
				local397 = this.anInt992 + (this.anInt982 * local24 + this.anInt986 * local240 + this.anInt990 * local34 >> 15);
				local408 = arg3.anInt4350 + local397 * this.aClass135_Sub1_2.anInt3410 / local128;
				local425 = this.anInt980 + (this.anInt985 * local19 + this.anInt984 * local501 + this.anInt981 * local34 >> 15);
				local436 = arg3.anInt4352 + local425 * this.aClass135_Sub1_2.anInt3406 / local151;
				local453 = this.anInt992 + (this.anInt982 * local19 + this.anInt986 * local501 + this.anInt990 * local34 >> 15);
				local464 = arg3.anInt4350 + local453 * this.aClass135_Sub1_2.anInt3410 / local151;
			} else {
				local56 = this.anIntArrayArray13[arg0][arg1];
				if (this.anInt987 == -1) {
					local65 = this.anInt989 * local56;
					local82 = this.anInt988 + (this.anInt991 * local19 + local65 + this.anInt983 * local29 >> 15);
					if (local82 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local105 = this.anInt988 + (this.anInt991 * local24 + local65 + this.anInt983 * local29 >> 15);
					if (local105 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local128 = this.anInt988 + (this.anInt991 * local24 + local65 + this.anInt983 * local34 >> 15);
					if (local128 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
					local151 = this.anInt988 + (this.anInt991 * local19 + local65 + this.anInt983 * local34 >> 15);
					if (local151 <= this.aClass135_Sub1_2.anInt3429) {
						return;
					}
				} else {
					local151 = this.anInt987;
					local128 = this.anInt987;
					local105 = this.anInt987;
					local82 = this.anInt987;
				}
				if (this.aClass135_Sub1_2.aBoolean262) {
					local176 = local82 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass135_Sub1_2.anInt3404;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt984 * local56;
				local240 = this.anInt986 * local56;
				local257 = this.anInt980 + (this.anInt985 * local19 + local65 + this.anInt981 * local29 >> 15);
				local268 = arg3.anInt4352 + local257 * this.aClass135_Sub1_2.anInt3406 / local82;
				local285 = this.anInt992 + (this.anInt982 * local19 + local240 + this.anInt990 * local29 >> 15);
				local296 = arg3.anInt4350 + local285 * this.aClass135_Sub1_2.anInt3410 / local82;
				local313 = this.anInt980 + (this.anInt985 * local24 + local65 + this.anInt981 * local29 >> 15);
				local324 = arg3.anInt4352 + local313 * this.aClass135_Sub1_2.anInt3406 / local105;
				local341 = this.anInt992 + (this.anInt982 * local24 + local240 + this.anInt990 * local29 >> 15);
				local352 = arg3.anInt4350 + local341 * this.aClass135_Sub1_2.anInt3410 / local105;
				local369 = this.anInt980 + (this.anInt985 * local24 + local65 + this.anInt981 * local34 >> 15);
				local380 = arg3.anInt4352 + local369 * this.aClass135_Sub1_2.anInt3406 / local128;
				local397 = this.anInt992 + (this.anInt982 * local24 + local240 + this.anInt990 * local34 >> 15);
				local408 = arg3.anInt4350 + local397 * this.aClass135_Sub1_2.anInt3410 / local128;
				local425 = this.anInt980 + (this.anInt985 * local19 + local65 + this.anInt981 * local34 >> 15);
				local436 = arg3.anInt4352 + local425 * this.aClass135_Sub1_2.anInt3406 / local151;
				local453 = this.anInt992 + (this.anInt982 * local19 + local240 + this.anInt990 * local34 >> 15);
				local464 = arg3.anInt4350 + local453 * this.aClass135_Sub1_2.anInt3410 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort91 != -1 && this.method807(this.aClass135_Sub1_2.anInterface5_7.method4079(local6.aShort91).aByte57);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean321 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt4348 || local436 > arg3.anInt4348 || local324 > arg3.anInt4348;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4353 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort91 >= 0) {
							arg3.method3470(local408, local464, local352, local380, local436, local324, this.aClass135_Sub1_2.anInt3416, local40, local42, local38, local6.anInt7026, local6.anInt7029, local6.anInt7027, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort91);
						} else {
							arg3.method3473(local408, local464, local352, local380, local436, local324, Static60.method850(local6.anInt7026, local40 << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local6.anInt7029, local42 << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local6.anInt7027, local38 << 24 | this.aClass135_Sub1_2.anInt3416));
						}
					} else if (local6.aShort91 >= 0) {
						arg3.method3476(local408, local464, local352, local380, local436, local324, local6.anInt7026, local6.anInt7029, local6.anInt7027, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort91);
					} else {
						arg3.method3473(local408, local464, local352, local380, local436, local324, local6.anInt7026, local6.anInt7029, local6.anInt7027);
					}
					arg3.anInt4353 = 0;
				} else {
					arg3.method3466(local408, local464, local352, local380, local436, local324, this.aClass135_Sub1_2.anInt3416);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean321 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt4348 || local324 > arg3.anInt4348 || local436 > arg3.anInt4348;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4353 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort91 >= 0) {
							arg3.method3470(local296, local352, local464, local268, local324, local436, this.aClass135_Sub1_2.anInt3416, local36, local38, local42, local6.anInt7028, local6.anInt7027, local6.anInt7029, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort91);
						} else {
							arg3.method3473(local296, local352, local464, local268, local324, local436, Static60.method850(local6.anInt7028, local36 << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local6.anInt7027, local38 << 24 | this.aClass135_Sub1_2.anInt3416), Static60.method850(local6.anInt7029, local42 << 24 | this.aClass135_Sub1_2.anInt3416));
						}
					} else if (local6.aShort91 >= 0) {
						arg3.method3476(local296, local352, local464, local268, local324, local436, local6.anInt7028, local6.anInt7027, local6.anInt7029, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort91);
					} else {
						arg3.method3473(local296, local352, local464, local268, local324, local436, local6.anInt7028, local6.anInt7027, local6.anInt7029);
					}
					arg3.anInt4353 = 0;
					return;
				}
				arg3.method3466(local296, local352, local464, local268, local324, local436, this.aClass135_Sub1_2.anInt3416);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5563(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class37 local4 = this.aClass135_Sub1_2.method2719(Thread.currentThread());
		@Pc(7) Class177 local7 = local4.aClass177_1;
		local7.anInt4353 = 0;
		local7.aBoolean321 = false;
		if (this.aClass253ArrayArray1 != null) {
			this.method805(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray72, local4.anIntArray71);
		} else if (this.aClass73ArrayArray1 != null) {
			this.method806(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray72, local4.anIntArray71);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
	@Override
	public void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class37 local4 = this.aClass135_Sub1_2.method2719(Thread.currentThread());
		local4.aClass177_1.anInt4353 = 0;
		if (this.aClass253ArrayArray1 != null) {
			this.method803(arg0, arg1, this.aClass135_Sub1_2.aBoolean263, local4.aClass177_1, local4.anIntArray72, local4.anIntArray71, local4.anIntArray84);
		} else if (this.aClass73ArrayArray1 != null) {
			this.method802(arg0, arg1, local4.aClass177_1, local4.anIntArray72, local4.anIntArray71, local4.anIntArray84);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method5562(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray13[arg0][arg1];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII[[ZLclient!nf;[I[I)V")
	private void method805(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class177 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean322 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass253ArrayArray1[local22][local25] != null) {
						@Pc(50) Class253 local50 = this.aClass253ArrayArray1[local22][local25];
						if (local50.aShort91 != -1 && (local50.aByte97 & 0x2) == 0 && local50.anInt7025 == 0) {
							local68 = this.aClass135_Sub1_2.method2718(local50.aShort91);
							arg5.method3475(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static402.method5297(local68, local50.anInt7026), Static402.method5297(local68, local50.anInt7029), Static402.method5297(local68, local50.anInt7027));
							arg5.method3475(local20, local20, local20 - 4, local16, local16 + 4, local16, Static402.method5297(local68, local50.anInt7028), Static402.method5297(local68, local50.anInt7027), Static402.method5297(local68, local50.anInt7029));
						} else if (local50.anInt7025 == 0) {
							arg5.method3473(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt7026, local50.anInt7029, local50.anInt7027);
							arg5.method3473(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt7028, local50.anInt7027, local50.anInt7029);
						} else {
							local68 = local50.anInt7025;
							arg5.method3473(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static60.method850(local68, local50.anInt7026 & 0xFF000000), Static60.method850(local68, local50.anInt7029 & 0xFF000000), Static60.method850(local68, local50.anInt7027 & 0xFF000000));
							arg5.method3473(local20, local20, local20 - 4, local16, local16 + 4, local16, Static60.method850(local68, local50.anInt7028 & 0xFF000000), Static60.method850(local68, local50.anInt7027 & 0xFF000000), Static60.method850(local68, local50.anInt7029 & 0xFF000000));
						}
					} else if (this.aClass224ArrayArray1[local22][local25] != null) {
						@Pc(259) Class224 local259 = this.aClass224ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort85; local68++) {
							arg6[local68] = local16 + local259.aShortArray103[local68] * 4 / super.anInt6905;
							arg7[local68] = local20 - local259.aShortArray101[local68] * 4 / super.anInt6905;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort84; local297++) {
							@Pc(302) int local302 = local297 * 3;
							@Pc(306) int local306 = local302 + 1;
							@Pc(310) int local310 = local306 + 1;
							@Pc(314) int local314 = arg6[local302];
							@Pc(318) int local318 = arg6[local306];
							@Pc(322) int local322 = arg6[local310];
							@Pc(326) int local326 = arg7[local302];
							@Pc(330) int local330 = arg7[local306];
							@Pc(334) int local334 = arg7[local310];
							@Pc(359) int local359;
							if (local259.anIntArray463 != null && local259.anIntArray463[local297] != 0 && (local259.aShortArray99 == null || local259.aShortArray99 != null && local259.aShortArray99[local297] == -1)) {
								local359 = local259.anIntArray463[local297];
								arg5.method3473(local326, local330, local334, local314, local318, local322, Static60.method850(local359, -(local259.anIntArray464[local302] & -16777216) - 16777216), Static60.method850(local359, -(local259.anIntArray464[local306] & -16777216) - 16777216), Static60.method850(local359, -(local259.anIntArray464[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray99 == null || local259.aShortArray99[local297] == -1) {
								arg5.method3473(local326, local330, local334, local314, local318, local322, local259.anIntArray464[local302], local259.anIntArray464[local306], local259.anIntArray464[local310]);
							} else {
								local359 = this.aClass135_Sub1_2.method2718(local259.aShortArray99[local297]);
								arg5.method3475(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub2_Sub3 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIIIIII[[ZLclient!nf;[I[I)V")
	private void method806(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class177 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean322 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass73ArrayArray1[local22][local25] != null) {
						@Pc(50) Class73 local50 = this.aClass73ArrayArray1[local22][local25];
						if (local50.aShort28 != -1 && (local50.aByte24 & 0x2) == 0 && local50.anInt1824 == -1) {
							local69 = this.aClass135_Sub1_2.method2718(local50.aShort28);
							arg5.method3475(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static402.method5297(local69, local50.aShort29 & 0xFFFF), Static402.method5297(local69, local50.aShort25 & 0xFFFF), Static402.method5297(local69, local50.aShort27 & 0xFFFF));
							arg5.method3475(local20, local20, local20 - 4, local16, local16 + 4, local16, Static402.method5297(local69, local50.aShort26 & 0xFFFF), Static402.method5297(local69, local50.aShort27 & 0xFFFF), Static402.method5297(local69, local50.aShort25 & 0xFFFF));
						} else if (local50.anInt1824 == -1) {
							arg5.method3475(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort29 & 0xFFFF, local50.aShort25 & 0xFFFF, local50.aShort27 & 0xFFFF);
							arg5.method3475(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort26 & 0xFFFF, local50.aShort27 & 0xFFFF, local50.aShort25 & 0xFFFF);
						} else {
							local69 = local50.anInt1824;
							arg5.method3475(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method3475(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass256ArrayArray1[local22][local25] != null) {
						@Pc(249) Class256 local249 = this.aClass256ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort97; local69++) {
							arg6[local69] = local16 + local249.aShortArray119[local69] * 4 / super.anInt6905;
							arg7[local69] = local20 - local249.aShortArray120[local69] * 4 / super.anInt6905;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort96; local287++) {
							@Pc(293) short local293 = local249.aShortArray121[local287];
							@Pc(298) short local298 = local249.aShortArray116[local287];
							@Pc(303) short local303 = local249.aShortArray122[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray539 != null && local249.anIntArray539[local287] != -1) {
								local341 = local249.anIntArray539[local287];
								arg5.method3475(local319, local323, local327, local307, local311, local315, Static402.method5297(local341, local249.aShortArray118[local293]), Static402.method5297(local341, local249.aShortArray118[local298]), Static402.method5297(local341, local249.aShortArray118[local303]));
							} else if (local249.aShortArray115 == null || local249.aShortArray115[local287] == -1) {
								local341 = local249.anIntArray540[local287];
								arg5.method3475(local319, local323, local327, local307, local311, local315, Static402.method5297(local341, local249.aShortArray118[local293]), Static402.method5297(local341, local249.aShortArray118[local298]), Static402.method5297(local341, local249.aShortArray118[local303]));
							} else {
								local341 = this.aClass135_Sub1_2.method2718(local249.aShortArray115[local287]);
								arg5.method3475(local319, local323, local327, local307, local311, local315, Static402.method5297(local341, local249.aShortArray118[local293]), Static402.method5297(local341, local249.aShortArray118[local298]), Static402.method5297(local341, local249.aShortArray118[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean322 = true;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class35_Sub1 local3 = this.aClass135_Sub1_2.aClass35_Sub1_2;
		this.anInt987 = -1;
		this.anInt985 = local3.anInt1001;
		this.anInt984 = local3.anInt1002;
		this.anInt981 = local3.anInt994;
		this.anInt980 = local3.anInt1003;
		this.anInt982 = local3.anInt996;
		this.anInt986 = local3.anInt998;
		this.anInt990 = local3.anInt1004;
		this.anInt992 = local3.anInt1000;
		this.anInt991 = local3.anInt997;
		this.anInt989 = local3.anInt1005;
		this.anInt983 = local3.anInt999;
		this.anInt988 = local3.anInt995;
	}

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
	private boolean method807(@OriginalArg(0) int arg0) {
		if ((this.anInt979 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!cn", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass253ArrayArray1 == null) {
			this.aClass253ArrayArray1 = new Class253[super.anInt6908][super.anInt6909];
			this.aClass224ArrayArray1 = new Class224[super.anInt6908][super.anInt6909];
		} else if (this.aClass73ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static212.anIntArray274[Static408.method5551(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static212.anIntArray274[Static408.method5551(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt6905 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt6905 && arg4[local116] == super.anInt6905) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt6905) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt6905 && arg2[local244] != arg2[0] - super.anInt6905) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt6905 && arg4[local244] != arg4[0] - super.anInt6905) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class253 local334 = new Class253();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt7025 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte97 = (byte) (local334.aByte97 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0 + 1][arg1] && this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0 + 1][arg1 + 1] && this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0][arg1 + 1]) {
				local334.aByte97 = (byte) (local334.aByte97 | 0x1);
			}
			if (local342 == -1 || (local334.aByte97 & 0x2) != 0 || this.aClass135_Sub1_2.anInterface5_7.method4079(local342).aBoolean189) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7028 = Static237.method4733(arg10, local527, Static460.method804(arg6[local104] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]));
				if (local334.anInt7025 != 0) {
					local334.anInt7028 |= this.aByteArrayArray3[arg0][arg1] + 255 - this.aByteArrayArray4[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7027 = Static237.method4733(arg10, local527, Static460.method804(arg6[local106] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]));
				if (local334.anInt7025 != 0) {
					local334.anInt7027 |= this.aByteArrayArray3[arg0 + 1][arg1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7026 = Static237.method4733(arg10, local527, Static460.method804(arg6[local108] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]));
				if (local334.anInt7025 != 0) {
					local334.anInt7026 |= this.aByteArrayArray3[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt7029 = Static237.method4733(arg10, local527, Static460.method804(arg6[local110] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]));
				if (local334.anInt7025 != 0) {
					local334.anInt7029 |= this.aByteArrayArray3[arg0][arg1 + 1] + 255 - this.aByteArrayArray4[arg0][arg1 + 1] << 25;
				}
				local334.aShort91 = -1;
			} else {
				local334.anInt7028 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
				local334.anInt7027 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
				local334.anInt7026 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
				local334.anInt7029 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
				local334.aShort91 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort94 = (short) arg5[local108];
				local334.aShort92 = (short) arg5[local110];
				local334.aShort90 = (short) arg5[local106];
				local334.aShort93 = (short) arg5[local104];
			}
			this.aClass253ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class224 local888 = new Class224();
		local888.aShort85 = (short) arg2.length;
		local888.aShort84 = (short) (arg2.length / 3);
		local888.aShortArray103 = new short[local888.aShort85];
		local888.aShortArray100 = new short[local888.aShort85];
		local888.aShortArray101 = new short[local888.aShort85];
		local888.anIntArray464 = new int[local888.aShort85];
		if (arg5 != null) {
			local888.aShortArray102 = new short[local888.aShort85];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort85; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt6905) {
				local958 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
			} else if (local342 == super.anInt6905 && local527 == super.anInt6905) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt6905 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt6905 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt6905 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt6905 - local527) + local1126 * local527 >> super.anInt6907 * 2;
			}
			local1079 = (arg0 << super.anInt6907) + local342;
			local1126 = (arg1 << super.anInt6907) + local527;
			local888.aShortArray103[local244] = (short) local342;
			local888.aShortArray101[local244] = (short) local527;
			local888.aShortArray100[local244] = (short) (this.a(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(arg8[local244]).aBoolean189) {
				local888.anIntArray464[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray102[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray464[local244] = Static237.method4733(arg10, local1226, Static460.method804(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray464[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray464[local244] = 0;
			} else {
				local888.anIntArray464[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort84; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(arg8[local527 * 3]).aBoolean189) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray463 = new int[local888.aShort84];
		}
		if (local1296) {
			local888.aShortArray99 = new short[local888.aShort84];
			local888.aShortArray104 = new short[local888.aShort84];
		}
		for (local958 = 0; local958 < local888.aShort84; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray463[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray99[local958] = (short) local1384;
					local888.aShortArray104[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
							local888.anIntArray464[local1079] = Static212.anIntArray274[Static408.method5551(this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aShort41 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
							local888.anIntArray464[local1126] = Static212.anIntArray274[Static408.method5551(this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aShort41 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aBoolean189) {
							local888.anIntArray464[local1226] = Static212.anIntArray274[Static408.method5551(this.aClass135_Sub1_2.anInterface5_7.method4079(local1384).aShort41 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray99[local958] = -1;
				}
			}
		}
		this.aClass224ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!cn", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass73ArrayArray1 == null) {
			this.aClass73ArrayArray1 = new Class73[super.anInt6908][super.anInt6909];
			this.aClass256ArrayArray1 = new Class256[super.anInt6908][super.anInt6909];
		} else if (this.aClass253ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt6905 || local70 != 0 && local70 != super.anInt6905) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class256 local95 = new Class256();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort97 = local99;
			local95.aShortArray118 = new short[local99];
			local95.aShortArray119 = new short[local99];
			local95.aShortArray123 = new short[local99];
			local95.aShortArray120 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray118[local124] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt6905) {
					local95.aShortArray118[local124] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				} else if (local129 == super.anInt6905 && local133 == super.anInt6905) {
					local95.aShortArray118[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt6905 && local133 == 0) {
					local95.aShortArray118[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt6905 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt6905 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray118[local124] = (short) (local288 * (super.anInt6905 - local133) + local335 * local133 >> super.anInt6907 * 2);
				}
				local288 = (arg0 << super.anInt6907) + local129;
				local335 = (arg1 << super.anInt6907) + local133;
				local95.aShortArray119[local124] = (short) local129;
				local95.aShortArray120[local124] = (short) local133;
				local95.aShortArray123[local124] = (short) (this.a(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray118[local124] < 2) {
					local95.aShortArray118[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass135_Sub1_2.anInterface5_7.method4079(arg11[local288]).aBoolean189) {
					local415 = true;
				}
			}
			local95.anIntArray540 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray539 = new int[local133];
			}
			local95.aShortArray121 = new short[local133];
			local95.aShortArray116 = new short[local133];
			local95.aShortArray122 = new short[local133];
			if (local415) {
				local95.aShortArray115 = new short[local133];
				local95.aShortArray117 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray540[local95.aShort96] = Static408.method5551(arg9[local335]);
					} else {
						local95.anIntArray540[local95.aShort96] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray539[local95.aShort96] = -1;
						} else {
							local95.anIntArray539[local95.aShort96] = Static408.method5551(arg10[local335]);
						}
					}
					local95.aShortArray121[local95.aShort96] = (short) arg6[local335];
					local95.aShortArray116[local95.aShort96] = (short) arg7[local335];
					local95.aShortArray122[local95.aShort96] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass135_Sub1_2.anInterface5_7.method4079(arg11[local335]).aBoolean189) {
							local95.aShortArray115[local95.aShort96] = -1;
						} else {
							local95.aShortArray115[local95.aShort96] = (short) arg11[local335];
							local95.aShortArray117[local95.aShort96] = (short) arg12[local335];
						}
					}
					local95.aShort96++;
				}
			}
			this.aClass256ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class73 local644 = new Class73();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt1824 = Static402.method5297(Static408.method5551(arg10[0]), this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte24 = (byte) (local644.aByte24 | 0x2);
				}
			}
			if (this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0 + 1][arg1] && this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0 + 1][arg1 + 1] && this.anIntArrayArray13[arg0][arg1] == this.anIntArrayArray13[arg0][arg1 + 1]) {
				local644.aByte24 = (byte) (local644.aByte24 | 0x1);
			}
			if (local70 == -1 || (local644.aByte24 & 0x2) != 0 || this.aClass135_Sub1_2.anInterface5_7.method4079(local70).aBoolean189) {
				@Pc(845) short local845 = Static408.method5551(local64);
				local644.aShort26 = (short) Static402.method5297(local845, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				local644.aShort27 = (short) Static402.method5297(local845, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				local644.aShort29 = (short) Static402.method5297(local845, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				local644.aShort25 = (short) Static402.method5297(local845, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				local644.aShort28 = -1;
			} else {
				local644.aShort26 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				local644.aShort27 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				local644.aShort29 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				local644.aShort25 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				local644.aShort28 = (short) local70;
			}
			this.aClass73ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!ku;[I)V")
	@Override
	public void method5561(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray3[arg0][arg1] < arg2) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt6907;
		@Pc(9) int local9 = arg1 >> super.anInt6907;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6908 - 1 || local9 > super.anInt6909 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt6905 - 1;
		@Pc(41) int local41 = arg1 & super.anInt6905 - 1;
		@Pc(67) int local67 = this.anIntArrayArray13[local4][local9] * (super.anInt6905 - local34) + this.anIntArrayArray13[local4 + 1][local9] * local34 >> super.anInt6907;
		@Pc(97) int local97 = this.anIntArrayArray13[local4][local9 + 1] * (super.anInt6905 - local34) + this.anIntArrayArray13[local4 + 1][local9 + 1] * local34 >> super.anInt6907;
		return local67 * (super.anInt6905 - local41) + local97 * local41 >> super.anInt6907;
	}
}
