import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[[Lclient!rl;")
	private Class210[][] aClass210ArrayArray1;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "[[Lclient!fw;")
	private Class81[][] aClass81ArrayArray1;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	private int anInt4617;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	private int anInt4620;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "[[Lclient!hs;")
	private Class104[][] aClass104ArrayArray1;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private int anInt4622;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	private int anInt4623;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	private int anInt4624;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
	private int anInt4625;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "[[Lclient!rq;")
	private Class214[][] aClass214ArrayArray1;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
	private int anInt4626;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
	private int anInt4627;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
	private int anInt4628;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt4629;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	private int anInt4621 = -1;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "Lclient!vq;")
	private final Class167_Sub2 aClass167_Sub2_7;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private final int anInt4616;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!vq;IIII[[I[[II)V")
	public Class55_Sub2(@OriginalArg(0) Class167_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass167_Sub2_7 = arg0;
		this.anInt4616 = arg2;
		this.anIntArrayArray39 = arg5;
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass167_Sub2_7.anInt7377 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass167_Sub2_7.anInt7397 * local92 + this.aClass167_Sub2_7.anInt7395 * local98 + this.aClass167_Sub2_7.anInt7389 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray18[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!no;[I[I[I)V")
	private void method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class104 local6 = this.aClass104ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class210 local1022 = this.aClass210ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt4621 == -1) {
					for (local362 = 0; local362 < local1022.aShort86; local362++) {
						local24 = local1022.aShortArray94[local362] + (arg0 << super.anInt4615);
						local1046 = local1022.aShortArray89[local362];
						local34 = local1022.aShortArray97[local362] + (arg1 << super.anInt4615);
						local306 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local1046 + this.anInt4625 * local34 >> 15);
						if (local306 <= this.aClass167_Sub2_7.anInt7392) {
							return;
						}
						local194 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local1046 + this.anInt4619 * local34 >> 15);
						local250 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local1046 + this.anInt4627 * local34 >> 15);
						arg3[local362] = arg2.anInt4674 + local194 * this.aClass167_Sub2_7.anInt7402 / local306;
						arg4[local362] = arg2.anInt4673 + local250 * this.aClass167_Sub2_7.anInt7386 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort86; local362++) {
						local24 = local1022.aShortArray94[local362] + (arg0 << super.anInt4615);
						local1046 = local1022.aShortArray89[local362];
						local34 = local1022.aShortArray97[local362] + (arg1 << super.anInt4615);
						local194 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local1046 + this.anInt4619 * local34 >> 15);
						local250 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local1046 + this.anInt4627 * local34 >> 15);
						arg3[local362] = arg2.anInt4674 + local194 * this.aClass167_Sub2_7.anInt7402 / this.anInt4621;
						arg4[local362] = arg2.anInt4673 + local250 * this.aClass167_Sub2_7.anInt7386 / this.anInt4621;
					}
				}
				if (local1022.aShortArray96 != null) {
					local362 = this.anIntArrayArray39[arg0][arg1];
					local222 = this.anIntArrayArray39[arg0 + 1][arg1];
					local278 = this.anIntArrayArray39[arg0][arg1 + 1];
					local334 = arg0 * super.anInt4610;
					local390 = local334 + super.anInt4610;
					local183 = arg1 * super.anInt4610;
					local239 = local183 + super.anInt4610;
					local295 = this.anInt4618 + (this.anInt4626 * local334 + this.anInt4623 * local362 + this.anInt4619 * local183 >> 15);
					local351 = this.anInt4622 + (this.anInt4617 * local334 + this.anInt4628 * local362 + this.anInt4627 * local183 >> 15);
					local211 = this.anInt4624 + (this.anInt4620 * local334 + this.anInt4629 * local362 + this.anInt4625 * local183 >> 15);
					local267 = this.anInt4618 + (this.anInt4626 * local390 + this.anInt4623 * local222 + this.anInt4619 * local183 >> 15);
					local323 = this.anInt4622 + (this.anInt4617 * local390 + this.anInt4628 * local222 + this.anInt4627 * local183 >> 15);
					local379 = this.anInt4624 + (this.anInt4620 * local390 + this.anInt4629 * local222 + this.anInt4625 * local183 >> 15);
					local72 = this.anInt4618 + (this.anInt4626 * local334 + this.anInt4623 * local278 + this.anInt4619 * local239 >> 15);
					local95 = this.anInt4622 + (this.anInt4617 * local334 + this.anInt4628 * local278 + this.anInt4627 * local239 >> 15);
					local118 = this.anInt4624 + (this.anInt4620 * local334 + this.anInt4629 * local278 + this.anInt4625 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort85; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray92[local141];
						@Pc(1496) short local1496 = local1022.aShortArray93[local141];
						@Pc(1501) short local1501 = local1022.aShortArray90[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean334 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt4671 || local1509 > arg2.anInt4671 || local1513 > arg2.anInt4671;
							@Pc(1569) short local1569 = local1022.aShortArray96[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray369[local141];
								if (local1624 != -1) {
									arg2.method3866(local1517, local1521, local1525, local427, local1509, local1513, Static382.method5291(local1624, local1022.aShortArray95[local1491]), Static382.method5291(local1624, local1022.aShortArray95[local1496]), Static382.method5291(local1624, local1022.aShortArray95[local1501]));
								}
							} else {
								if (this.method3826(this.aClass167_Sub2_7.anInterface7_8.method4417(local1569).aByte37)) {
									arg2.anInt4670 = 100;
								}
								arg2.method3873(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray95[local1491], local1022.aShortArray95[local1496], local1022.aShortArray95[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt4670 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort85; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray92[local362];
					@Pc(1675) short local1675 = local1022.aShortArray93[local362];
					@Pc(1680) short local1680 = local1022.aShortArray90[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray369[local362];
						if (local267 != -1) {
							arg2.aBoolean334 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt4671 || local183 > arg2.anInt4671 || local239 > arg2.anInt4671;
							arg2.method3866(local295, local351, local211, local390, local183, local239, Static382.method5291(local267, local1022.aShortArray95[local1670]), Static382.method5291(local267, local1022.aShortArray95[local1675]), Static382.method5291(local267, local1022.aShortArray95[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte34 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4610;
			local24 = local19 + super.anInt4610;
			@Pc(29) int local29 = arg1 * super.anInt4610;
			local34 = local29 + super.anInt4610;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte34 & 0x1) == 0) {
				local46 = this.anIntArrayArray39[arg0][arg1];
				local55 = this.anIntArrayArray39[arg0 + 1][arg1];
				local166 = this.anIntArrayArray39[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray39[arg0][arg1 + 1];
				if (this.anInt4621 == -1) {
					local72 = this.anInt4624 + (this.anInt4620 * local19 + this.anInt4629 * local46 + this.anInt4625 * local29 >> 15);
					if (local72 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local95 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local55 + this.anInt4625 * local29 >> 15);
					if (local95 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local118 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local166 + this.anInt4625 * local34 >> 15);
					if (local118 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local141 = this.anInt4624 + (this.anInt4620 * local19 + this.anInt4629 * local427 + this.anInt4625 * local34 >> 15);
					if (local141 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
				} else {
					local141 = this.anInt4621;
					local118 = this.anInt4621;
					local95 = this.anInt4621;
					local72 = this.anInt4621;
				}
				local183 = this.anInt4618 + (this.anInt4626 * local19 + this.anInt4623 * local46 + this.anInt4619 * local29 >> 15);
				local194 = arg2.anInt4674 + local183 * this.aClass167_Sub2_7.anInt7402 / local72;
				local211 = this.anInt4622 + (this.anInt4617 * local19 + this.anInt4628 * local46 + this.anInt4627 * local29 >> 15);
				local222 = arg2.anInt4673 + local211 * this.aClass167_Sub2_7.anInt7386 / local72;
				local239 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local55 + this.anInt4619 * local29 >> 15);
				local250 = arg2.anInt4674 + local239 * this.aClass167_Sub2_7.anInt7402 / local95;
				local267 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local55 + this.anInt4627 * local29 >> 15);
				local278 = arg2.anInt4673 + local267 * this.aClass167_Sub2_7.anInt7386 / local95;
				local295 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local166 + this.anInt4619 * local34 >> 15);
				local306 = arg2.anInt4674 + local295 * this.aClass167_Sub2_7.anInt7402 / local118;
				local323 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local166 + this.anInt4627 * local34 >> 15);
				local334 = arg2.anInt4673 + local323 * this.aClass167_Sub2_7.anInt7386 / local118;
				local351 = this.anInt4618 + (this.anInt4626 * local19 + this.anInt4623 * local427 + this.anInt4619 * local34 >> 15);
				local362 = arg2.anInt4674 + local351 * this.aClass167_Sub2_7.anInt7402 / local141;
				local379 = this.anInt4622 + (this.anInt4617 * local19 + this.anInt4628 * local427 + this.anInt4627 * local34 >> 15);
				local390 = arg2.anInt4673 + local379 * this.aClass167_Sub2_7.anInt7386 / local141;
			} else {
				local46 = this.anIntArrayArray39[arg0][arg1];
				if (this.anInt4621 == -1) {
					local55 = this.anInt4629 * local46;
					local72 = this.anInt4624 + (this.anInt4620 * local19 + local55 + this.anInt4625 * local29 >> 15);
					if (local72 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local95 = this.anInt4624 + (this.anInt4620 * local24 + local55 + this.anInt4625 * local29 >> 15);
					if (local95 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local118 = this.anInt4624 + (this.anInt4620 * local24 + local55 + this.anInt4625 * local34 >> 15);
					if (local118 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local141 = this.anInt4624 + (this.anInt4620 * local19 + local55 + this.anInt4625 * local34 >> 15);
					if (local141 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
				} else {
					local141 = this.anInt4621;
					local118 = this.anInt4621;
					local95 = this.anInt4621;
					local72 = this.anInt4621;
				}
				local55 = this.anInt4623 * local46;
				local166 = this.anInt4628 * local46;
				local183 = this.anInt4618 + (this.anInt4626 * local19 + local55 + this.anInt4619 * local29 >> 15);
				local194 = arg2.anInt4674 + local183 * this.aClass167_Sub2_7.anInt7402 / local72;
				local211 = this.anInt4622 + (this.anInt4617 * local19 + local166 + this.anInt4627 * local29 >> 15);
				local222 = arg2.anInt4673 + local211 * this.aClass167_Sub2_7.anInt7386 / local72;
				local239 = this.anInt4618 + (this.anInt4626 * local24 + local55 + this.anInt4619 * local29 >> 15);
				local250 = arg2.anInt4674 + local239 * this.aClass167_Sub2_7.anInt7402 / local95;
				local267 = this.anInt4622 + (this.anInt4617 * local24 + local166 + this.anInt4627 * local29 >> 15);
				local278 = arg2.anInt4673 + local267 * this.aClass167_Sub2_7.anInt7386 / local95;
				local295 = this.anInt4618 + (this.anInt4626 * local24 + local55 + this.anInt4619 * local34 >> 15);
				local306 = arg2.anInt4674 + local295 * this.aClass167_Sub2_7.anInt7402 / local118;
				local323 = this.anInt4622 + (this.anInt4617 * local24 + local166 + this.anInt4627 * local34 >> 15);
				local334 = arg2.anInt4673 + local323 * this.aClass167_Sub2_7.anInt7386 / local118;
				local351 = this.anInt4618 + (this.anInt4626 * local19 + local55 + this.anInt4619 * local34 >> 15);
				local362 = arg2.anInt4674 + local351 * this.aClass167_Sub2_7.anInt7402 / local141;
				local379 = this.anInt4622 + (this.anInt4617 * local19 + local166 + this.anInt4627 * local34 >> 15);
				local390 = arg2.anInt4673 + local379 * this.aClass167_Sub2_7.anInt7386 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean334 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt4671 || local362 > arg2.anInt4671 || local250 > arg2.anInt4671;
				if (local6.aShort39 >= 0) {
					if (this.method3826(this.aClass167_Sub2_7.anInterface7_8.method4417(local6.aShort39).aByte37)) {
						arg2.anInt4670 = 100;
					}
					arg2.method3873(local334, local390, local278, local306, local362, local250, local6.aShort36 & 0xFFFF, local6.aShort38 & 0xFFFF, local6.aShort37 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort39);
					arg2.anInt4670 = 0;
				} else {
					arg2.method3866(local334, local390, local278, local306, local362, local250, local6.aShort36 & 0xFFFF, local6.aShort38 & 0xFFFF, local6.aShort37 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean334 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt4671 || local250 > arg2.anInt4671 || local362 > arg2.anInt4671;
				if (local6.aShort39 >= 0) {
					if (this.method3826(this.aClass167_Sub2_7.anInterface7_8.method4417(local6.aShort39).aByte37)) {
						arg2.anInt4670 = 100;
					}
					arg2.method3873(local222, local278, local390, local194, local250, local362, local6.aShort35 & 0xFFFF, local6.aShort37 & 0xFFFF, local6.aShort38 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort39);
					arg2.anInt4670 = 0;
					return;
				}
				arg2.method3866(local222, local278, local390, local194, local250, local362, local6.aShort35 & 0xFFFF, local6.aShort37 & 0xFFFF, local6.aShort38 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass81ArrayArray1 == null) {
			this.aClass81ArrayArray1 = new Class81[super.anInt4614][super.anInt4611];
			this.aClass214ArrayArray1 = new Class214[super.anInt4614][super.anInt4611];
		} else if (this.aClass104ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static225.anIntArray253[Static332.method4597(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static225.anIntArray253[Static332.method4597(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt4610 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt4610 && arg4[local116] == super.anInt4610) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt4610) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt4610 && arg2[local244] != arg2[0] - super.anInt4610) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt4610 && arg4[local244] != arg4[0] - super.anInt4610) {
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
			@Pc(334) Class81 local334 = new Class81();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt2182 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte19 = (byte) (local334.aByte19 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0 + 1][arg1] && this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0 + 1][arg1 + 1] && this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0][arg1 + 1]) {
				local334.aByte19 = (byte) (local334.aByte19 | 0x1);
			}
			if (local342 == -1 || (local334.aByte19 & 0x2) != 0 || this.aClass167_Sub2_7.anInterface7_8.method4417(local342).aBoolean231) {
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
				local334.anInt2185 = Static349.method4872(arg10, local527, Static468.method3824(arg6[local104] >> 8, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]));
				if (local334.anInt2182 != 0) {
					local334.anInt2185 |= this.aByteArrayArray19[arg0][arg1] + 255 - this.aByteArrayArray18[arg0][arg1] << 25;
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
				local334.anInt2183 = Static349.method4872(arg10, local527, Static468.method3824(arg6[local106] >> 8, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]));
				if (local334.anInt2182 != 0) {
					local334.anInt2183 |= this.aByteArrayArray19[arg0 + 1][arg1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1] << 25;
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
				local334.anInt2184 = Static349.method4872(arg10, local527, Static468.method3824(arg6[local108] >> 8, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]));
				if (local334.anInt2182 != 0) {
					local334.anInt2184 |= this.aByteArrayArray19[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray18[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt2186 = Static349.method4872(arg10, local527, Static468.method3824(arg6[local110] >> 8, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]));
				if (local334.anInt2182 != 0) {
					local334.anInt2186 |= this.aByteArrayArray19[arg0][arg1 + 1] + 255 - this.aByteArrayArray18[arg0][arg1 + 1] << 25;
				}
				local334.aShort24 = -1;
			} else {
				local334.anInt2185 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
				local334.anInt2183 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
				local334.anInt2184 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
				local334.anInt2186 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
				local334.aShort24 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort23 = (short) arg5[local108];
				local334.aShort26 = (short) arg5[local110];
				local334.aShort25 = (short) arg5[local106];
				local334.aShort22 = (short) arg5[local104];
			}
			this.aClass81ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class214 local888 = new Class214();
		local888.aShort88 = (short) arg2.length;
		local888.aShort87 = (short) (arg2.length / 3);
		local888.aShortArray99 = new short[local888.aShort88];
		local888.aShortArray103 = new short[local888.aShort88];
		local888.aShortArray100 = new short[local888.aShort88];
		local888.anIntArray379 = new int[local888.aShort88];
		if (arg5 != null) {
			local888.aShortArray102 = new short[local888.aShort88];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort88; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt4610) {
				local958 = this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1];
			} else if (local342 == super.anInt4610 && local527 == super.anInt4610) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt4610 && local527 == 0) {
				local958 = this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt4610 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt4610 - local342) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt4610 - local527) + local1126 * local527 >> super.anInt4615 * 2;
			}
			local1079 = (arg0 << super.anInt4615) + local342;
			local1126 = (arg1 << super.anInt4615) + local527;
			local888.aShortArray99[local244] = (short) local342;
			local888.aShortArray100[local244] = (short) local527;
			local888.aShortArray103[local244] = (short) (this.R(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(arg8[local244]).aBoolean231) {
				local888.anIntArray379[local244] = local958;
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
				local888.anIntArray379[local244] = Static349.method4872(arg10, local1226, Static468.method3824(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray379[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray379[local244] = 0;
			} else {
				local888.anIntArray379[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort87; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(arg8[local527 * 3]).aBoolean231) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray380 = new int[local888.aShort87];
		}
		if (local1296) {
			local888.aShortArray98 = new short[local888.aShort87];
			local888.aShortArray101 = new short[local888.aShort87];
		}
		for (local958 = 0; local958 < local888.aShort87; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray380[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray98[local958] = (short) local1384;
					local888.aShortArray101[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
							local888.anIntArray379[local1079] = Static225.anIntArray253[Static332.method4597(this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aShort40 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
							local888.anIntArray379[local1126] = Static225.anIntArray253[Static332.method4597(this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aShort40 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aBoolean231) {
							local888.anIntArray379[local1226] = Static225.anIntArray253[Static332.method4597(this.aClass167_Sub2_7.anInterface7_8.method4417(local1384).aShort40 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray98[local958] = -1;
				}
			}
		}
		this.aClass214ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[ZLclient!no;[I[I)V")
	private void method3822(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class166 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean337 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass104ArrayArray1[local22][local25] != null) {
						@Pc(50) Class104 local50 = this.aClass104ArrayArray1[local22][local25];
						if (local50.aShort39 != -1 && (local50.aByte34 & 0x2) == 0 && local50.anInt2969 == -1) {
							local69 = this.aClass167_Sub2_7.method6029(local50.aShort39);
							arg5.method3866(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static382.method5291(local69, local50.aShort36 & 0xFFFF), Static382.method5291(local69, local50.aShort38 & 0xFFFF), Static382.method5291(local69, local50.aShort37 & 0xFFFF));
							arg5.method3866(local20, local20, local20 - 4, local16, local16 + 4, local16, Static382.method5291(local69, local50.aShort35 & 0xFFFF), Static382.method5291(local69, local50.aShort37 & 0xFFFF), Static382.method5291(local69, local50.aShort38 & 0xFFFF));
						} else if (local50.anInt2969 == -1) {
							arg5.method3866(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort36 & 0xFFFF, local50.aShort38 & 0xFFFF, local50.aShort37 & 0xFFFF);
							arg5.method3866(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort35 & 0xFFFF, local50.aShort37 & 0xFFFF, local50.aShort38 & 0xFFFF);
						} else {
							local69 = local50.anInt2969;
							arg5.method3866(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method3866(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass210ArrayArray1[local22][local25] != null) {
						@Pc(249) Class210 local249 = this.aClass210ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort86; local69++) {
							arg6[local69] = local16 + local249.aShortArray94[local69] * 4 / super.anInt4610;
							arg7[local69] = local20 - local249.aShortArray97[local69] * 4 / super.anInt4610;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort85; local287++) {
							@Pc(293) short local293 = local249.aShortArray92[local287];
							@Pc(298) short local298 = local249.aShortArray93[local287];
							@Pc(303) short local303 = local249.aShortArray90[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray370 != null && local249.anIntArray370[local287] != -1) {
								local341 = local249.anIntArray370[local287];
								arg5.method3866(local319, local323, local327, local307, local311, local315, Static382.method5291(local341, local249.aShortArray95[local293]), Static382.method5291(local341, local249.aShortArray95[local298]), Static382.method5291(local341, local249.aShortArray95[local303]));
							} else if (local249.aShortArray96 == null || local249.aShortArray96[local287] == -1) {
								local341 = local249.anIntArray369[local287];
								arg5.method3866(local319, local323, local327, local307, local311, local315, Static382.method5291(local341, local249.aShortArray95[local293]), Static382.method5291(local341, local249.aShortArray95[local298]), Static382.method5291(local341, local249.aShortArray95[local303]));
							} else {
								local341 = this.aClass167_Sub2_7.method6029(local249.aShortArray96[local287]);
								arg5.method3866(local319, local323, local327, local307, local311, local315, Static382.method5291(local341, local249.aShortArray95[local293]), Static382.method5291(local341, local249.aShortArray95[local298]), Static382.method5291(local341, local249.aShortArray95[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean337 = true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass104ArrayArray1 == null) {
			this.aClass104ArrayArray1 = new Class104[super.anInt4614][super.anInt4611];
			this.aClass210ArrayArray1 = new Class210[super.anInt4614][super.anInt4611];
		} else if (this.aClass81ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt4610 || local70 != 0 && local70 != super.anInt4610) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class210 local95 = new Class210();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort86 = local99;
			local95.aShortArray95 = new short[local99];
			local95.aShortArray94 = new short[local99];
			local95.aShortArray89 = new short[local99];
			local95.aShortArray97 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray95[local124] = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt4610) {
					local95.aShortArray95[local124] = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				} else if (local129 == super.anInt4610 && local133 == super.anInt4610) {
					local95.aShortArray95[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt4610 && local133 == 0) {
					local95.aShortArray95[local124] = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]) * (super.anInt4610 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]) * (super.anInt4610 - local129) + (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray95[local124] = (short) (local288 * (super.anInt4610 - local133) + local335 * local133 >> super.anInt4615 * 2);
				}
				local288 = (arg0 << super.anInt4615) + local129;
				local335 = (arg1 << super.anInt4615) + local133;
				local95.aShortArray94[local124] = (short) local129;
				local95.aShortArray97[local124] = (short) local133;
				local95.aShortArray89[local124] = (short) (this.R(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray95[local124] < 2) {
					local95.aShortArray95[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass167_Sub2_7.anInterface7_8.method4417(arg11[local288]).aBoolean231) {
					local415 = true;
				}
			}
			local95.anIntArray369 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray370 = new int[local133];
			}
			local95.aShortArray92 = new short[local133];
			local95.aShortArray93 = new short[local133];
			local95.aShortArray90 = new short[local133];
			if (local415) {
				local95.aShortArray96 = new short[local133];
				local95.aShortArray91 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray369[local95.aShort85] = Static332.method4597(arg9[local335]);
					} else {
						local95.anIntArray369[local95.aShort85] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray370[local95.aShort85] = -1;
						} else {
							local95.anIntArray370[local95.aShort85] = Static332.method4597(arg10[local335]);
						}
					}
					local95.aShortArray92[local95.aShort85] = (short) arg6[local335];
					local95.aShortArray93[local95.aShort85] = (short) arg7[local335];
					local95.aShortArray90[local95.aShort85] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass167_Sub2_7.anInterface7_8.method4417(arg11[local335]).aBoolean231) {
							local95.aShortArray96[local95.aShort85] = -1;
						} else {
							local95.aShortArray96[local95.aShort85] = (short) arg11[local335];
							local95.aShortArray91[local95.aShort85] = (short) arg12[local335];
						}
					}
					local95.aShort85++;
				}
			}
			this.aClass210ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class104 local644 = new Class104();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt2969 = Static382.method5291(Static332.method4597(arg10[0]), this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte34 = (byte) (local644.aByte34 | 0x2);
				}
			}
			if (this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0 + 1][arg1] && this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0 + 1][arg1 + 1] && this.anIntArrayArray39[arg0][arg1] == this.anIntArrayArray39[arg0][arg1 + 1]) {
				local644.aByte34 = (byte) (local644.aByte34 | 0x1);
			}
			if (local70 == -1 || (local644.aByte34 & 0x2) != 0 || this.aClass167_Sub2_7.anInterface7_8.method4417(local70).aBoolean231) {
				@Pc(845) short local845 = Static332.method4597(local64);
				local644.aShort35 = (short) Static382.method5291(local845, this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local644.aShort37 = (short) Static382.method5291(local845, this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local644.aShort36 = (short) Static382.method5291(local845, this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local644.aShort38 = (short) Static382.method5291(local845, this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local644.aShort39 = -1;
			} else {
				local644.aShort35 = (short) (this.aByteArrayArray18[arg0][arg1] - this.aByteArrayArray19[arg0][arg1]);
				local644.aShort37 = (short) (this.aByteArrayArray18[arg0 + 1][arg1] - this.aByteArrayArray19[arg0 + 1][arg1]);
				local644.aShort36 = (short) (this.aByteArrayArray18[arg0 + 1][arg1 + 1] - this.aByteArrayArray19[arg0 + 1][arg1 + 1]);
				local644.aShort38 = (short) (this.aByteArrayArray18[arg0][arg1 + 1] - this.aByteArrayArray19[arg0][arg1 + 1]);
				local644.aShort39 = (short) local70;
			}
			this.aClass104ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!nk", name = "U", descriptor = "()V")
	@Override
	public void U() {
		this.aByteArrayArray18 = null;
		this.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	@Override
	public Class3_Sub3_Sub9 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub9 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIIIII[[ZLclient!no;[I[I)V")
	private void method3823(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class166 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean337 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass81ArrayArray1[local22][local25] != null) {
						@Pc(50) Class81 local50 = this.aClass81ArrayArray1[local22][local25];
						if (local50.aShort24 != -1 && (local50.aByte19 & 0x2) == 0 && local50.anInt2182 == 0) {
							local68 = this.aClass167_Sub2_7.method6029(local50.aShort24);
							arg5.method3866(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static382.method5291(local68, local50.anInt2184), Static382.method5291(local68, local50.anInt2186), Static382.method5291(local68, local50.anInt2183));
							arg5.method3866(local20, local20, local20 - 4, local16, local16 + 4, local16, Static382.method5291(local68, local50.anInt2185), Static382.method5291(local68, local50.anInt2183), Static382.method5291(local68, local50.anInt2186));
						} else if (local50.anInt2182 == 0) {
							arg5.method3862(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt2184, local50.anInt2186, local50.anInt2183);
							arg5.method3862(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt2185, local50.anInt2183, local50.anInt2186);
						} else {
							local68 = local50.anInt2182;
							arg5.method3862(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static282.method3970(local50.anInt2184 & 0xFF000000, local68), Static282.method3970(local50.anInt2186 & 0xFF000000, local68), Static282.method3970(local50.anInt2183 & 0xFF000000, local68));
							arg5.method3862(local20, local20, local20 - 4, local16, local16 + 4, local16, Static282.method3970(local50.anInt2185 & 0xFF000000, local68), Static282.method3970(local50.anInt2183 & 0xFF000000, local68), Static282.method3970(local50.anInt2186 & 0xFF000000, local68));
						}
					} else if (this.aClass214ArrayArray1[local22][local25] != null) {
						@Pc(259) Class214 local259 = this.aClass214ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort88; local68++) {
							arg6[local68] = local16 + local259.aShortArray99[local68] * 4 / super.anInt4610;
							arg7[local68] = local20 - local259.aShortArray100[local68] * 4 / super.anInt4610;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort87; local297++) {
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
							if (local259.anIntArray380 != null && local259.anIntArray380[local297] != 0 && (local259.aShortArray98 == null || local259.aShortArray98 != null && local259.aShortArray98[local297] == -1)) {
								local359 = local259.anIntArray380[local297];
								arg5.method3862(local326, local330, local334, local314, local318, local322, Static282.method3970(-(local259.anIntArray379[local302] & -16777216) - 16777216, local359), Static282.method3970(-(local259.anIntArray379[local306] & -16777216) - 16777216, local359), Static282.method3970(-(local259.anIntArray379[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray98 == null || local259.aShortArray98[local297] == -1) {
								arg5.method3862(local326, local330, local334, local314, local318, local322, local259.anIntArray379[local302], local259.anIntArray379[local306], local259.anIntArray379[local310]);
							} else {
								local359 = this.aClass167_Sub2_7.method6029(local259.aShortArray98[local297]);
								arg5.method3866(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean337 = true;
	}

	@OriginalMember(owner = "client!nk", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void ia(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray19[arg0][arg1] < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "(II)I")
	@Override
	public int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt4615;
		@Pc(9) int local9 = arg1 >> super.anInt4615;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4614 - 1 || local9 > super.anInt4611 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt4610 - 1;
		@Pc(41) int local41 = arg1 & super.anInt4610 - 1;
		@Pc(67) int local67 = this.anIntArrayArray39[local4][local9] * (super.anInt4610 - local34) + this.anIntArrayArray39[local4 + 1][local9] * local34 >> super.anInt4615;
		@Pc(97) int local97 = this.anIntArrayArray39[local4][local9 + 1] * (super.anInt4610 - local34) + this.anIntArrayArray39[local4 + 1][local9 + 1] * local34 >> super.anInt4615;
		return local67 * (super.anInt4610 - local41) + local97 * local41 >> super.anInt4615;
	}

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!nk", name = "oa", descriptor = "(II)I")
	@Override
	public int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray39[arg0][arg1];
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZLclient!no;[I[I[I)V")
	private void method3825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class166 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class81 local6 = this.aClass81ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class214 local1452 = this.aClass214ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt4621 == -1) {
					for (local436 = 0; local436 < local1452.aShort88; local436++) {
						local24 = local1452.aShortArray99[local436] + (arg0 << super.anInt4615);
						local29 = local1452.aShortArray103[local436];
						local34 = local1452.aShortArray100[local436] + (arg1 << super.anInt4615);
						local380 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local29 + this.anInt4625 * local34 >> 15);
						if (local380 <= this.aClass167_Sub2_7.anInt7392) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass167_Sub2_7.anInt7398;
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
						} else if (this.aClass167_Sub2_7.aBoolean499) {
							local296 = local380 - this.aClass167_Sub2_7.anInt7398;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local29 + this.anInt4619 * local34 >> 15);
						local324 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local29 + this.anInt4627 * local34 >> 15);
						arg4[local436] = arg3.anInt4674 + local268 * this.aClass167_Sub2_7.anInt7402 / local380;
						arg5[local436] = arg3.anInt4673 + local324 * this.aClass167_Sub2_7.anInt7386 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort88; local436++) {
						local24 = local1452.aShortArray99[local436] + (arg0 << super.anInt4615);
						local29 = local1452.aShortArray103[local436];
						local34 = local1452.aShortArray100[local436] + (arg1 << super.anInt4615);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt4621 - this.aClass167_Sub2_7.anInt7398;
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
						} else if (this.aClass167_Sub2_7.aBoolean499) {
							local296 = this.anInt4621 - this.aClass167_Sub2_7.anInt7398;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local29 + this.anInt4619 * local34 >> 15);
						local324 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local29 + this.anInt4627 * local34 >> 15);
						arg4[local436] = arg3.anInt4674 + local268 * this.aClass167_Sub2_7.anInt7402 / this.anInt4621;
						arg5[local436] = arg3.anInt4673 + local324 * this.aClass167_Sub2_7.anInt7386 / this.anInt4621;
					}
				}
				if (local1452.aShortArray98 != null) {
					local436 = this.anIntArrayArray39[arg0][arg1];
					local296 = this.anIntArrayArray39[arg0 + 1][arg1];
					local352 = this.anIntArrayArray39[arg0][arg1 + 1];
					local408 = arg0 * super.anInt4610;
					local464 = local408 + super.anInt4610;
					local257 = arg1 * super.anInt4610;
					local313 = local257 + super.anInt4610;
					local369 = this.anInt4618 + (this.anInt4626 * local408 + this.anInt4623 * local436 + this.anInt4619 * local257 >> 15);
					local425 = this.anInt4622 + (this.anInt4617 * local408 + this.anInt4628 * local436 + this.anInt4627 * local257 >> 15);
					local285 = this.anInt4624 + (this.anInt4620 * local408 + this.anInt4629 * local436 + this.anInt4625 * local257 >> 15);
					local341 = this.anInt4618 + (this.anInt4626 * local464 + this.anInt4623 * local296 + this.anInt4619 * local257 >> 15);
					local397 = this.anInt4622 + (this.anInt4617 * local464 + this.anInt4628 * local296 + this.anInt4627 * local257 >> 15);
					local453 = this.anInt4624 + (this.anInt4620 * local464 + this.anInt4629 * local296 + this.anInt4625 * local257 >> 15);
					local82 = this.anInt4618 + (this.anInt4626 * local408 + this.anInt4623 * local352 + this.anInt4619 * local313 >> 15);
					local105 = this.anInt4622 + (this.anInt4617 * local408 + this.anInt4628 * local352 + this.anInt4627 * local313 >> 15);
					local128 = this.anInt4624 + (this.anInt4620 * local408 + this.anInt4629 * local352 + this.anInt4625 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort87; local151++) {
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
							arg3.aBoolean334 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt4671 || local176 > arg3.anInt4671 || local56 > arg3.anInt4671;
							@Pc(2138) short local2138 = local1452.aShortArray98[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method3826(this.aClass167_Sub2_7.anInterface7_8.method4417(local2138).aByte37)) {
									arg3.anInt4670 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method3875(local65, local240, local501, local42, local176, local56, this.aClass167_Sub2_7.anInt7393, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray379[local36], local1452.anIntArray379[local38], local1452.anIntArray379[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray379[local36] & 0xFFFFFF) != 0) {
										arg3.method3862(local65, local240, local501, local42, local176, local56, Static282.method3970(arg6[local36] << 24 | this.aClass167_Sub2_7.anInt7393, local1452.anIntArray379[local36]), Static282.method3970(arg6[local38] << 24 | this.aClass167_Sub2_7.anInt7393, local1452.anIntArray379[local38]), Static282.method3970(arg6[local40] << 24 | this.aClass167_Sub2_7.anInt7393, local1452.anIntArray379[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method3873(local65, local240, local501, local42, local176, local56, local1452.anIntArray379[local36], local1452.anIntArray379[local38], local1452.anIntArray379[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray379[local36] & 0xFFFFFF) != 0) {
									arg3.method3862(local65, local240, local501, local42, local176, local56, local1452.anIntArray379[local36], local1452.anIntArray379[local38], local1452.anIntArray379[local40]);
								}
								arg3.anInt4670 = 0;
							} else {
								arg3.method3864(local65, local240, local501, local42, local176, local56, this.aClass167_Sub2_7.anInt7393);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort87; local436++) {
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
						arg3.aBoolean334 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt4671 || local257 > arg3.anInt4671 || local313 > arg3.anInt4671;
						if (local341 >= 765) {
							arg3.method3864(local369, local425, local285, local464, local257, local313, this.aClass167_Sub2_7.anInt7393);
						} else if (local341 > 0) {
							if ((local1452.anIntArray379[local296] & 0xFFFFFF) != 0) {
								arg3.method3862(local369, local425, local285, local464, local257, local313, Static349.method4872(this.aClass167_Sub2_7.anInt7393, arg6[local296], local1452.anIntArray379[local296]), Static349.method4872(this.aClass167_Sub2_7.anInt7393, arg6[local352], local1452.anIntArray379[local352]), Static349.method4872(this.aClass167_Sub2_7.anInt7393, arg6[local408], local1452.anIntArray379[local408]));
							}
						} else if ((local1452.anIntArray379[local296] & 0xFFFFFF) != 0) {
							arg3.method3862(local369, local425, local285, local464, local257, local313, local1452.anIntArray379[local296], local1452.anIntArray379[local352], local1452.anIntArray379[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte19 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4610;
			local24 = local19 + super.anInt4610;
			local29 = arg1 * super.anInt4610;
			local34 = local29 + super.anInt4610;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte19 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray39[arg0][arg1];
				local65 = this.anIntArrayArray39[arg0 + 1][arg1];
				local240 = this.anIntArrayArray39[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray39[arg0][arg1 + 1];
				if (this.anInt4621 == -1) {
					local82 = this.anInt4624 + (this.anInt4620 * local19 + this.anInt4629 * local56 + this.anInt4625 * local29 >> 15);
					if (local82 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local105 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local65 + this.anInt4625 * local29 >> 15);
					if (local105 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local128 = this.anInt4624 + (this.anInt4620 * local24 + this.anInt4629 * local240 + this.anInt4625 * local34 >> 15);
					if (local128 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local151 = this.anInt4624 + (this.anInt4620 * local19 + this.anInt4629 * local501 + this.anInt4625 * local34 >> 15);
					if (local151 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
				} else {
					local151 = this.anInt4621;
					local128 = this.anInt4621;
					local105 = this.anInt4621;
					local82 = this.anInt4621;
				}
				if (arg2) {
					local176 = local82 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort22 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort25 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort23 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort26 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass167_Sub2_7.aBoolean499) {
					local176 = local82 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt4618 + (this.anInt4626 * local19 + this.anInt4623 * local56 + this.anInt4619 * local29 >> 15);
				local268 = arg3.anInt4674 + local257 * this.aClass167_Sub2_7.anInt7402 / local82;
				local285 = this.anInt4622 + (this.anInt4617 * local19 + this.anInt4628 * local56 + this.anInt4627 * local29 >> 15);
				local296 = arg3.anInt4673 + local285 * this.aClass167_Sub2_7.anInt7386 / local82;
				local313 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local65 + this.anInt4619 * local29 >> 15);
				local324 = arg3.anInt4674 + local313 * this.aClass167_Sub2_7.anInt7402 / local105;
				local341 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local65 + this.anInt4627 * local29 >> 15);
				local352 = arg3.anInt4673 + local341 * this.aClass167_Sub2_7.anInt7386 / local105;
				local369 = this.anInt4618 + (this.anInt4626 * local24 + this.anInt4623 * local240 + this.anInt4619 * local34 >> 15);
				local380 = arg3.anInt4674 + local369 * this.aClass167_Sub2_7.anInt7402 / local128;
				local397 = this.anInt4622 + (this.anInt4617 * local24 + this.anInt4628 * local240 + this.anInt4627 * local34 >> 15);
				local408 = arg3.anInt4673 + local397 * this.aClass167_Sub2_7.anInt7386 / local128;
				local425 = this.anInt4618 + (this.anInt4626 * local19 + this.anInt4623 * local501 + this.anInt4619 * local34 >> 15);
				local436 = arg3.anInt4674 + local425 * this.aClass167_Sub2_7.anInt7402 / local151;
				local453 = this.anInt4622 + (this.anInt4617 * local19 + this.anInt4628 * local501 + this.anInt4627 * local34 >> 15);
				local464 = arg3.anInt4673 + local453 * this.aClass167_Sub2_7.anInt7386 / local151;
			} else {
				local56 = this.anIntArrayArray39[arg0][arg1];
				if (this.anInt4621 == -1) {
					local65 = this.anInt4629 * local56;
					local82 = this.anInt4624 + (this.anInt4620 * local19 + local65 + this.anInt4625 * local29 >> 15);
					if (local82 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local105 = this.anInt4624 + (this.anInt4620 * local24 + local65 + this.anInt4625 * local29 >> 15);
					if (local105 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local128 = this.anInt4624 + (this.anInt4620 * local24 + local65 + this.anInt4625 * local34 >> 15);
					if (local128 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
					local151 = this.anInt4624 + (this.anInt4620 * local19 + local65 + this.anInt4625 * local34 >> 15);
					if (local151 <= this.aClass167_Sub2_7.anInt7392) {
						return;
					}
				} else {
					local151 = this.anInt4621;
					local128 = this.anInt4621;
					local105 = this.anInt4621;
					local82 = this.anInt4621;
				}
				if (this.aClass167_Sub2_7.aBoolean499) {
					local176 = local82 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass167_Sub2_7.anInt7398;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt4623 * local56;
				local240 = this.anInt4628 * local56;
				local257 = this.anInt4618 + (this.anInt4626 * local19 + local65 + this.anInt4619 * local29 >> 15);
				local268 = arg3.anInt4674 + local257 * this.aClass167_Sub2_7.anInt7402 / local82;
				local285 = this.anInt4622 + (this.anInt4617 * local19 + local240 + this.anInt4627 * local29 >> 15);
				local296 = arg3.anInt4673 + local285 * this.aClass167_Sub2_7.anInt7386 / local82;
				local313 = this.anInt4618 + (this.anInt4626 * local24 + local65 + this.anInt4619 * local29 >> 15);
				local324 = arg3.anInt4674 + local313 * this.aClass167_Sub2_7.anInt7402 / local105;
				local341 = this.anInt4622 + (this.anInt4617 * local24 + local240 + this.anInt4627 * local29 >> 15);
				local352 = arg3.anInt4673 + local341 * this.aClass167_Sub2_7.anInt7386 / local105;
				local369 = this.anInt4618 + (this.anInt4626 * local24 + local65 + this.anInt4619 * local34 >> 15);
				local380 = arg3.anInt4674 + local369 * this.aClass167_Sub2_7.anInt7402 / local128;
				local397 = this.anInt4622 + (this.anInt4617 * local24 + local240 + this.anInt4627 * local34 >> 15);
				local408 = arg3.anInt4673 + local397 * this.aClass167_Sub2_7.anInt7386 / local128;
				local425 = this.anInt4618 + (this.anInt4626 * local19 + local65 + this.anInt4619 * local34 >> 15);
				local436 = arg3.anInt4674 + local425 * this.aClass167_Sub2_7.anInt7402 / local151;
				local453 = this.anInt4622 + (this.anInt4617 * local19 + local240 + this.anInt4627 * local34 >> 15);
				local464 = arg3.anInt4673 + local453 * this.aClass167_Sub2_7.anInt7386 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort24 != -1 && this.method3826(this.aClass167_Sub2_7.anInterface7_8.method4417(local6.aShort24).aByte37);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean334 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt4671 || local436 > arg3.anInt4671 || local324 > arg3.anInt4671;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4670 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort24 >= 0) {
							arg3.method3875(local408, local464, local352, local380, local436, local324, this.aClass167_Sub2_7.anInt7393, local40, local42, local38, local6.anInt2184, local6.anInt2186, local6.anInt2183, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort24);
						} else {
							arg3.method3862(local408, local464, local352, local380, local436, local324, Static282.method3970(local40 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2184), Static282.method3970(local42 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2186), Static282.method3970(local38 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2183));
						}
					} else if (local6.aShort24 >= 0) {
						arg3.method3873(local408, local464, local352, local380, local436, local324, local6.anInt2184, local6.anInt2186, local6.anInt2183, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort24);
					} else {
						arg3.method3862(local408, local464, local352, local380, local436, local324, local6.anInt2184, local6.anInt2186, local6.anInt2183);
					}
					arg3.anInt4670 = 0;
				} else {
					arg3.method3864(local408, local464, local352, local380, local436, local324, this.aClass167_Sub2_7.anInt7393);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean334 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt4671 || local324 > arg3.anInt4671 || local436 > arg3.anInt4671;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4670 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort24 >= 0) {
							arg3.method3875(local296, local352, local464, local268, local324, local436, this.aClass167_Sub2_7.anInt7393, local36, local38, local42, local6.anInt2185, local6.anInt2183, local6.anInt2186, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort24);
						} else {
							arg3.method3862(local296, local352, local464, local268, local324, local436, Static282.method3970(local36 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2185), Static282.method3970(local38 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2183), Static282.method3970(local42 << 24 | this.aClass167_Sub2_7.anInt7393, local6.anInt2186));
						}
					} else if (local6.aShort24 >= 0) {
						arg3.method3873(local296, local352, local464, local268, local324, local436, local6.anInt2185, local6.anInt2183, local6.anInt2186, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort24);
					} else {
						arg3.method3862(local296, local352, local464, local268, local324, local436, local6.anInt2185, local6.anInt2183, local6.anInt2186);
					}
					arg3.anInt4670 = 0;
					return;
				}
				arg3.method3864(local296, local352, local464, local268, local324, local436, this.aClass167_Sub2_7.anInt7393);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class11_Sub1 local3 = this.aClass167_Sub2_7.aClass11_Sub1_3;
		this.anInt4621 = -1;
		this.anInt4626 = local3.anInt193;
		this.anInt4623 = local3.anInt196;
		this.anInt4619 = local3.anInt192;
		this.anInt4618 = local3.anInt190;
		this.anInt4617 = local3.anInt189;
		this.anInt4628 = local3.anInt194;
		this.anInt4627 = local3.anInt195;
		this.anInt4622 = local3.anInt186;
		this.anInt4620 = local3.anInt191;
		this.anInt4629 = local3.anInt188;
		this.anInt4625 = local3.anInt197;
		this.anInt4624 = local3.anInt187;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z")
	private boolean method3826(@OriginalArg(0) int arg0) {
		if ((this.anInt4616 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!be;[I)V")
	@Override
	public void method3818(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3813(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class259 local4 = this.aClass167_Sub2_7.method6038(Thread.currentThread());
		@Pc(7) Class166 local7 = local4.aClass166_2;
		local7.anInt4670 = 0;
		local7.aBoolean334 = false;
		if (this.aClass81ArrayArray1 != null) {
			this.method3823(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray465, local4.anIntArray477);
		} else if (this.aClass104ArrayArray1 != null) {
			this.method3822(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray465, local4.anIntArray477);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	@Override
	public boolean method3815(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	@Override
	public void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class259 local4 = this.aClass167_Sub2_7.method6038(Thread.currentThread());
		local4.aClass166_2.anInt4670 = 0;
		if (this.aClass81ArrayArray1 != null) {
			this.method3825(arg0, arg1, this.aClass167_Sub2_7.aBoolean498, local4.aClass166_2, local4.anIntArray465, local4.anIntArray477, local4.anIntArray472);
		} else if (this.aClass104ArrayArray1 != null) {
			this.method3821(arg0, arg1, local4.aClass166_2, local4.anIntArray465, local4.anIntArray477, local4.anIntArray472);
		}
	}
}
