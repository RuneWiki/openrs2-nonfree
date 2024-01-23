import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ca", name = "lb", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!ca", name = "Bb", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!ca", name = "Db", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ca", name = "mb", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!ca", name = "tb", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "[Lclient!je;")
	public Class86[] aClass86Array2;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "[Lclient!q;")
	public Class135[] aClass135Array2;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	private int anInt706 = 0;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	private int anInt705 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public int anInt704 = 0;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
	private int anInt707 = 0;

	static {
		if (Static26.aBoolean43) {
			anIntArray80 = new int[4096];
			anIntArray76 = new int[4096];
		} else {
			anIntArray92 = new int[1600];
			anIntArrayArray14 = new int[1600][64];
			anIntArray81 = new int[32];
			anIntArrayArray13 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ch;IIIII)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method660();
		arg0.method645();
		this.anInt704 = arg0.anInt762;
		this.anInt707 = arg0.anInt761;
		this.anIntArray61 = arg0.anIntArray106;
		this.anIntArray60 = arg0.anIntArray116;
		this.anIntArray67 = arg0.anIntArray115;
		this.anInt705 = arg0.anInt764;
		this.anIntArray68 = arg0.anIntArray107;
		this.anIntArray69 = arg0.anIntArray108;
		this.anIntArray58 = arg0.anIntArray112;
		this.aByteArray18 = arg0.aByteArray29;
		this.aByteArray19 = arg0.aByteArray33;
		this.aByte5 = arg0.aByte6;
		this.aShortArray25 = arg0.aShortArray34;
		this.anIntArrayArray12 = arg0.anIntArrayArray18;
		this.anIntArrayArray11 = arg0.anIntArrayArray17;
		this.aShortArray27 = arg0.aShortArray32;
		this.aClass135Array2 = arg0.aClass135Array3;
		this.aClass86Array2 = arg0.aClass86Array3;
		this.aShortArray28 = arg0.aShortArray41;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray62 = new int[this.anInt705];
		this.anIntArray65 = new int[this.anInt705];
		this.anIntArray63 = new int[this.anInt705];
		@Pc(148) int local148;
		if (arg0.aShortArray33 == null) {
			this.aShortArray26 = null;
		} else {
			this.aShortArray26 = new short[this.anInt705];
			for (local148 = 0; local148 < this.anInt705; local148++) {
				@Pc(157) short local157 = arg0.aShortArray33[local148];
				if (local157 != -1 && Static237.anInterface1_1.method4603(local157)) {
					this.aShortArray26[local148] = local157;
				} else {
					this.aShortArray26[local148] = -1;
				}
			}
		}
		if (arg0.anInt760 > 0 && arg0.aByteArray25 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt760];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt705; local194++) {
				if (arg0.aByteArray25[local194] != -1) {
					local192[arg0.aByteArray25[local194] & 0xFF]++;
				}
			}
			this.anInt706 = 0;
			for (local194 = 0; local194 < arg0.anInt760; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray30[local194] == 0) {
					this.anInt706++;
				}
			}
			this.anIntArray66 = new int[this.anInt706];
			this.anIntArray59 = new int[this.anInt706];
			this.anIntArray64 = new int[this.anInt706];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt760; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray30[local263] == 0) {
					this.anIntArray66[local194] = arg0.aShortArray35[local263] & 0xFFFF;
					this.anIntArray59[local194] = arg0.aShortArray39[local263] & 0xFFFF;
					this.anIntArray64[local194] = arg0.aShortArray36[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray20 = new byte[this.anInt705];
			for (local263 = 0; local263 < this.anInt705; local263++) {
				if (arg0.aByteArray25[local263] == -1) {
					this.aByteArray20[local263] = -1;
				} else {
					this.aByteArray20[local263] = (byte) local192[arg0.aByteArray25[local263] & 0xFF];
					if (this.aByteArray20[local263] == -1 && this.aShortArray26 != null) {
						this.aShortArray26[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt705; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray27 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray27[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray33 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray33[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray26 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray26[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class17 local450;
			@Pc(483) int local483;
			@Pc(629) Class29 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray34[local148] & 0xFFFF;
					if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray68[local148]] == null) {
						local450 = arg0.aClass17Array1[this.anIntArray68[local148]];
					} else {
						local450 = arg0.aClass17Array2[this.anIntArray68[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473) << 17;
					this.anIntArray62[local148] = local483 | Static26.method590(local431, local483 >> 17);
					if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray69[local148]] == null) {
						local450 = arg0.aClass17Array1[this.anIntArray69[local148]];
					} else {
						local450 = arg0.aClass17Array2[this.anIntArray69[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473) << 17;
					this.anIntArray65[local148] = local483 | Static26.method590(local431, local483 >> 17);
					if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray58[local148]] == null) {
						local450 = arg0.aClass17Array1[this.anIntArray58[local148]];
					} else {
						local450 = arg0.aClass17Array2[this.anIntArray58[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473) << 17;
					this.anIntArray63[local148] = local483 | Static26.method590(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass29Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt787 + arg4 * local629.anInt788 + arg5 * local629.anInt793) / (local123 + local123 / 2) << 17;
					this.anIntArray62[local148] = local483 | Static26.method590(arg0.aShortArray34[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray63[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray62[local148] = 128;
					this.anIntArray63[local148] = -1;
				} else {
					this.anIntArray63[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray68[local148]] == null) {
					local450 = arg0.aClass17Array1[this.anIntArray68[local148]];
				} else {
					local450 = arg0.aClass17Array2[this.anIntArray68[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473);
				this.anIntArray62[local148] = Static26.method580(local483);
				if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray69[local148]] == null) {
					local450 = arg0.aClass17Array1[this.anIntArray69[local148]];
				} else {
					local450 = arg0.aClass17Array2[this.anIntArray69[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473);
				this.anIntArray65[local148] = Static26.method580(local483);
				if (arg0.aClass17Array2 == null || arg0.aClass17Array2[this.anIntArray58[local148]] == null) {
					local450 = arg0.aClass17Array1[this.anIntArray58[local148]];
				} else {
					local450 = arg0.aClass17Array2[this.anIntArray58[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt469 + arg4 * local450.anInt476 + arg5 * local450.anInt475) / (local123 * local450.anInt473);
				this.anIntArray63[local148] = Static26.method580(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass29Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt787 + arg4 * local629.anInt788 + arg5 * local629.anInt793) / (local123 + local123 / 2);
				this.anIntArray62[local148] = Static26.method580(local483);
				this.anIntArray63[local148] = -1;
			} else {
				this.anIntArray63[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([Lclient!ca;I)V")
	private Class2_Sub1_Sub2(@OriginalArg(0) Class2_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt704 = 0;
		this.anInt705 = 0;
		this.anInt706 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte5 = -1;
		@Pc(48) int local48;
		@Pc(55) Class2_Sub1_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt704 += local55.anInt704;
				this.anInt705 += local55.anInt705;
				this.anInt706 += local55.anInt706;
				if (local55.aByteArray18 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local55.aByte5;
					}
					if (this.aByte5 != local55.aByte5) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray19 != null;
				local28 |= local55.aShortArray26 != null;
				local30 |= local55.aByteArray20 != null;
				if (local55.aClass135Array2 != null) {
					local41 += local55.aClass135Array2.length;
				}
				if (local55.aClass86Array2 != null) {
					local43 += local55.aClass86Array2.length;
				}
			}
		}
		this.anIntArray61 = new int[this.anInt704];
		this.anIntArray60 = new int[this.anInt704];
		this.anIntArray67 = new int[this.anInt704];
		this.anIntArray68 = new int[this.anInt705];
		this.anIntArray69 = new int[this.anInt705];
		this.anIntArray58 = new int[this.anInt705];
		this.anIntArray62 = new int[this.anInt705];
		this.anIntArray65 = new int[this.anInt705];
		this.anIntArray63 = new int[this.anInt705];
		if (local24) {
			this.aByteArray18 = new byte[this.anInt705];
		}
		if (local26) {
			this.aByteArray19 = new byte[this.anInt705];
		}
		if (local28) {
			this.aShortArray26 = new short[this.anInt705];
		}
		if (local30) {
			this.aByteArray20 = new byte[this.anInt705];
		}
		if (this.anInt706 > 0) {
			this.anIntArray66 = new int[this.anInt706];
			this.anIntArray59 = new int[this.anInt706];
			this.anIntArray64 = new int[this.anInt706];
		}
		if (local41 > 0) {
			this.aClass135Array2 = new Class135[local41];
		}
		if (local43 > 0) {
			this.aClass86Array2 = new Class86[local43];
		}
		this.aShortArray25 = new short[this.anInt705];
		this.anInt704 = 0;
		this.anInt705 = 0;
		this.anInt706 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt705; local280++) {
					this.anIntArray68[this.anInt705] = local55.anIntArray68[local280] + this.anInt704;
					this.anIntArray69[this.anInt705] = local55.anIntArray69[local280] + this.anInt704;
					this.anIntArray58[this.anInt705] = local55.anIntArray58[local280] + this.anInt704;
					this.anIntArray62[this.anInt705] = local55.anIntArray62[local280];
					this.anIntArray65[this.anInt705] = local55.anIntArray65[local280];
					this.anIntArray63[this.anInt705] = local55.anIntArray63[local280];
					this.aShortArray25[this.anInt705] = local55.aShortArray25[local280];
					if (local24) {
						if (local55.aByteArray18 == null) {
							this.aByteArray18[this.anInt705] = local55.aByte5;
						} else {
							this.aByteArray18[this.anInt705] = local55.aByteArray18[local280];
						}
					}
					if (local26 && local55.aByteArray19 != null) {
						this.aByteArray19[this.anInt705] = local55.aByteArray19[local280];
					}
					if (local28) {
						if (local55.aShortArray26 == null) {
							this.aShortArray26[this.anInt705] = -1;
						} else {
							this.aShortArray26[this.anInt705] = local55.aShortArray26[local280];
						}
					}
					if (local30) {
						this.aByteArray20[this.anInt705] = (byte) (local55.aByteArray20 == null || local55.aByteArray20[local280] == -1 ? -1 : local55.aByteArray20[local280] + this.anInt706);
					}
					this.anInt705++;
				}
				if (local55.aClass135Array2 != null) {
					for (local280 = 0; local280 < local55.aClass135Array2.length; local280++) {
						this.aClass135Array2[local41] = new Class135(local55.aClass135Array2[local280].aClass18_1, local55.aClass135Array2[local280].anInt4685 + this.anInt704, local55.aClass135Array2[local280].anInt4690 + this.anInt704, local55.aClass135Array2[local280].anInt4686 + this.anInt704);
						local41++;
					}
				}
				if (local55.aClass86Array2 != null) {
					for (local280 = 0; local280 < local55.aClass86Array2.length; local280++) {
						this.aClass86Array2[local43] = new Class86(local55.aClass86Array2[local280].aClass98_1, local55.aClass86Array2[local280].anInt2719 + this.anInt704);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt706; local280++) {
					if (local55.anIntArray66[local280] < local55.anInt707) {
						this.anIntArray66[this.anInt706] = local55.anIntArray66[local280] + this.anInt704;
					}
					if (local55.anIntArray59[local280] < local55.anInt707) {
						this.anIntArray59[this.anInt706] = local55.anIntArray59[local280] + this.anInt704;
					}
					if (local55.anIntArray64[local280] < local55.anInt707) {
						this.anIntArray64[this.anInt706] = local55.anIntArray64[local280] + this.anInt704;
					}
					this.anInt706++;
				}
				for (local280 = 0; local280 < local55.anInt707; local280++) {
					this.anIntArray61[this.anInt704] = local55.anIntArray61[local280];
					this.anIntArray60[this.anInt704] = local55.anIntArray60[local280];
					this.anIntArray67[this.anInt704] = local55.anIntArray67[local280];
					this.anInt704++;
				}
			}
		}
		local48 = 0;
		this.anInt707 = this.anInt704;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class2_Sub1_Sub2 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt706; local662++) {
					if (local658.anIntArray66[local662] >= local658.anInt707) {
						this.anIntArray66[local48] = local658.anIntArray66[local662] + this.anInt704 - local658.anInt707;
					}
					if (local658.anIntArray59[local662] >= local658.anInt707) {
						this.anIntArray59[local48] = local658.anIntArray59[local662] + this.anInt704 - local658.anInt707;
					}
					if (local658.anIntArray64[local662] >= local658.anInt707) {
						this.anIntArray64[local48] = local658.anIntArray64[local662] + this.anInt704 - local658.anInt707;
					}
					local48++;
				}
				for (local662 = local658.anInt707; local662 < local658.anInt704; local662++) {
					this.anIntArray61[this.anInt704] = local658.anIntArray61[local662];
					this.anIntArray60[this.anInt704] = local658.anIntArray60[local662];
					this.anIntArray67[this.anInt704] = local658.anIntArray67[local662];
					this.anInt704++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	private void method578(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static237.anInt4974;
		@Pc(3) int local3 = Static237.anInt4975;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray68[arg0];
		@Pc(15) int local15 = this.anIntArray69[arg0];
		@Pc(20) int local20 = this.anIntArray58[arg0];
		@Pc(24) int local24 = Static26.anIntArray83[local10];
		@Pc(28) int local28 = Static26.anIntArray83[local15];
		@Pc(32) int local32 = Static26.anIntArray83[local20];
		if (this.aByteArray19 == null) {
			Static237.anInt4973 = 0;
		} else {
			Static237.anInt4973 = this.aByteArray19[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static26.anIntArray86[0] = Static26.anIntArray88[local10];
			Static26.anIntArray93[0] = Static26.anIntArray78[local10];
			local5++;
			Static26.anIntArray87[0] = this.anIntArray62[arg0] & 0xFFFF;
		} else {
			local75 = Static26.anIntArray79[local10];
			local79 = Static26.anIntArray91[local10];
			local86 = this.anIntArray62[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class146.anIntArray459[local32 - local24];
				Static26.anIntArray86[0] = local1 + (local75 + ((Static26.anIntArray79[local20] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[0] = local3 + (local79 + ((Static26.anIntArray91[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static26.anIntArray87[0] = local86 + (((this.anIntArray63[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class146.anIntArray459[local28 - local24];
				Static26.anIntArray86[local5] = local1 + (local75 + ((Static26.anIntArray79[local15] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[local5] = local3 + (local79 + ((Static26.anIntArray91[local15] - local79) * local99 >> 16) << 9) / 50;
				Static26.anIntArray87[local5++] = local86 + (((this.anIntArray65[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static26.anIntArray86[local5] = Static26.anIntArray88[local15];
			Static26.anIntArray93[local5] = Static26.anIntArray78[local15];
			Static26.anIntArray87[local5++] = this.anIntArray65[arg0] & 0xFFFF;
		} else {
			local75 = Static26.anIntArray79[local15];
			local79 = Static26.anIntArray91[local15];
			local86 = this.anIntArray65[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class146.anIntArray459[local24 - local28];
				Static26.anIntArray86[local5] = local1 + (local75 + ((Static26.anIntArray79[local10] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[local5] = local3 + (local79 + ((Static26.anIntArray91[local10] - local79) * local99 >> 16) << 9) / 50;
				Static26.anIntArray87[local5++] = local86 + (((this.anIntArray62[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class146.anIntArray459[local32 - local28];
				Static26.anIntArray86[local5] = local1 + (local75 + ((Static26.anIntArray79[local20] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[local5] = local3 + (local79 + ((Static26.anIntArray91[local20] - local79) * local99 >> 16) << 9) / 50;
				Static26.anIntArray87[local5++] = local86 + (((this.anIntArray63[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static26.anIntArray86[local5] = Static26.anIntArray88[local20];
			Static26.anIntArray93[local5] = Static26.anIntArray78[local20];
			Static26.anIntArray87[local5++] = this.anIntArray63[arg0] & 0xFFFF;
		} else {
			local75 = Static26.anIntArray79[local20];
			local79 = Static26.anIntArray91[local20];
			local86 = this.anIntArray63[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class146.anIntArray459[local28 - local32];
				Static26.anIntArray86[local5] = local1 + (local75 + ((Static26.anIntArray79[local15] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[local5] = local3 + (local79 + ((Static26.anIntArray91[local15] - local79) * local99 >> 16) << 9) / 50;
				Static26.anIntArray87[local5++] = local86 + (((this.anIntArray65[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class146.anIntArray459[local24 - local32];
				Static26.anIntArray86[local5] = local1 + (local75 + ((Static26.anIntArray79[local10] - local75) * local99 >> 16) << 9) / 50;
				Static26.anIntArray93[local5] = local3 + (local79 + ((Static26.anIntArray91[local10] - local79) * local99 >> 16) << 9) / 50;
				Static26.anIntArray87[local5++] = local86 + (((this.anIntArray62[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static26.anIntArray86[0];
		local79 = Static26.anIntArray86[1];
		local86 = Static26.anIntArray86[2];
		local99 = Static26.anIntArray93[0];
		@Pc(614) int local614 = Static26.anIntArray93[1];
		@Pc(618) int local618 = Static26.anIntArray93[2];
		Static237.aBoolean307 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static237.anInt4976 || local79 > Static237.anInt4976 || local86 > Static237.anInt4976) {
				Static237.aBoolean307 = true;
			}
			if (this.aShortArray26 != null && this.aShortArray26[arg0] != -1) {
				if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray20[arg0] & 0xFF;
					local709 = this.anIntArray66[local704];
					local714 = this.anIntArray59[local704];
					local719 = this.anIntArray64[local704];
				}
				if (this.anIntArray63[arg0] == -1) {
					Static237.method3735(local99, local614, local618, local75, local79, local86, this.anIntArray62[arg0], this.anIntArray62[arg0], this.anIntArray62[arg0], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], this.aShortArray26[arg0]);
				} else {
					Static237.method3735(local99, local614, local618, local75, local79, local86, Static26.anIntArray87[0], Static26.anIntArray87[1], Static26.anIntArray87[2], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], this.aShortArray26[arg0]);
				}
			} else if (this.anIntArray63[arg0] == -1) {
				Static237.method3744(local99, local614, local618, local75, local79, local86, Static237.anIntArray462[this.anIntArray62[arg0] & 0xFFFF]);
			} else {
				Static237.method3751(local99, local614, local618, local75, local79, local86, Static26.anIntArray87[0], Static26.anIntArray87[1], Static26.anIntArray87[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static237.anInt4976 || local79 > Static237.anInt4976 || local86 > Static237.anInt4976 || Static26.anIntArray86[3] < 0 || Static26.anIntArray86[3] > Static237.anInt4976) {
			Static237.aBoolean307 = true;
		}
		if (this.aShortArray26 != null && this.aShortArray26[arg0] != -1) {
			if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray20[arg0] & 0xFF;
				local709 = this.anIntArray66[local704];
				local714 = this.anIntArray59[local704];
				local719 = this.anIntArray64[local704];
			}
			@Pc(984) short local984 = this.aShortArray26[arg0];
			if (this.anIntArray63[arg0] == -1) {
				Static237.method3735(local99, local614, local618, local75, local79, local86, this.anIntArray62[arg0], this.anIntArray62[arg0], this.anIntArray62[arg0], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], local984);
				Static237.method3735(local99, local618, Static26.anIntArray93[3], local75, local86, Static26.anIntArray86[3], this.anIntArray62[arg0], this.anIntArray62[arg0], this.anIntArray62[arg0], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], local984);
			} else {
				Static237.method3735(local99, local614, local618, local75, local79, local86, Static26.anIntArray87[0], Static26.anIntArray87[1], Static26.anIntArray87[2], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], local984);
				Static237.method3735(local99, local618, Static26.anIntArray93[3], local75, local86, Static26.anIntArray86[3], Static26.anIntArray87[0], Static26.anIntArray87[2], Static26.anIntArray87[3], Static26.anIntArray79[local709], Static26.anIntArray79[local714], Static26.anIntArray79[local719], Static26.anIntArray91[local709], Static26.anIntArray91[local714], Static26.anIntArray91[local719], Static26.anIntArray83[local709], Static26.anIntArray83[local714], Static26.anIntArray83[local719], local984);
			}
		} else if (this.anIntArray63[arg0] == -1) {
			local709 = Static237.anIntArray462[this.anIntArray62[arg0] & 0xFFFF];
			Static237.method3744(local99, local614, local618, local75, local79, local86, local709);
			Static237.method3744(local99, local618, Static26.anIntArray93[3], local75, local86, Static26.anIntArray86[3], local709);
		} else {
			Static237.method3751(local99, local614, local618, local75, local79, local86, Static26.anIntArray87[0], Static26.anIntArray87[1], Static26.anIntArray87[2]);
			Static237.method3751(local99, local618, Static26.anIntArray93[3], local75, local86, Static26.anIntArray86[3], Static26.anIntArray87[0], Static26.anIntArray87[2], Static26.anIntArray87[3]);
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)V")
	@Override
	public void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt704; local1++) {
			this.anIntArray61[local1] += arg0;
			this.anIntArray60[local1] += arg1;
			this.anIntArray67[local1] += arg2;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZLclient!ca;[B[S[I[I[I)Lclient!o;")
	private Class2_Sub1 method579(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt704 = this.anInt704;
		arg2.anInt707 = this.anInt707;
		arg2.anInt705 = this.anInt705;
		arg2.anInt706 = this.anInt706;
		if (arg2.anIntArray61 == null || arg2.anIntArray61.length < this.anInt704) {
			arg2.anIntArray61 = new int[this.anInt704 + 100];
			arg2.anIntArray60 = new int[this.anInt704 + 100];
			arg2.anIntArray67 = new int[this.anInt704 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt704; local47++) {
			arg2.anIntArray61[local47] = this.anIntArray61[local47];
			arg2.anIntArray60[local47] = this.anIntArray60[local47];
			arg2.anIntArray67[local47] = this.anIntArray67[local47];
		}
		if (arg0) {
			arg2.aByteArray19 = this.aByteArray19;
		} else {
			arg2.aByteArray19 = arg3;
			if (this.aByteArray19 == null) {
				for (local47 = 0; local47 < this.anInt705; local47++) {
					arg2.aByteArray19[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt705; local47++) {
					arg2.aByteArray19[local47] = this.aByteArray19[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray25 = this.aShortArray25;
			arg2.anIntArray62 = this.anIntArray62;
			arg2.anIntArray65 = this.anIntArray65;
			arg2.anIntArray63 = this.anIntArray63;
		} else {
			arg2.aShortArray25 = arg4;
			arg2.anIntArray62 = arg5;
			arg2.anIntArray65 = arg6;
			arg2.anIntArray63 = arg7;
			for (local47 = 0; local47 < this.anInt705; local47++) {
				arg2.aShortArray25[local47] = this.aShortArray25[local47];
				arg2.anIntArray62[local47] = this.anIntArray62[local47];
				arg2.anIntArray65[local47] = this.anIntArray65[local47];
				arg2.anIntArray63[local47] = this.anIntArray63[local47];
			}
		}
		arg2.anIntArray68 = this.anIntArray68;
		arg2.anIntArray69 = this.anIntArray69;
		arg2.anIntArray58 = this.anIntArray58;
		arg2.aByteArray18 = this.aByteArray18;
		arg2.aByteArray20 = this.aByteArray20;
		arg2.aShortArray26 = this.aShortArray26;
		arg2.aByte5 = this.aByte5;
		arg2.anIntArray66 = this.anIntArray66;
		arg2.anIntArray59 = this.anIntArray59;
		arg2.anIntArray64 = this.anIntArray64;
		arg2.anIntArrayArray12 = this.anIntArrayArray12;
		arg2.anIntArrayArray11 = this.anIntArrayArray11;
		arg2.aShortArray28 = this.aShortArray28;
		arg2.aShortArray27 = this.aShortArray27;
		arg2.aBoolean39 = this.aBoolean39;
		arg2.aBoolean41 = false;
		arg2.aClass135Array2 = this.aClass135Array2;
		arg2.aClass86Array2 = this.aClass86Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "()V")
	@Override
	public void method567() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt704; local1++) {
			this.anIntArray61[local1] = -this.anIntArray61[local1];
			this.anIntArray67[local1] = -this.anIntArray67[local1];
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZZ)Lclient!o;")
	@Override
	public Class2_Sub1 method560(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static26.aByteArray21.length < this.anInt705) {
			Static26.aByteArray21 = new byte[this.anInt705 + 100];
		}
		if (!arg1 && Static26.aShortArray29.length < this.anInt705) {
			Static26.anIntArray70 = new int[this.anInt705 + 100];
			Static26.anIntArray71 = new int[this.anInt705 + 100];
			Static26.anIntArray72 = new int[this.anInt705 + 100];
			Static26.aShortArray29 = new short[this.anInt705 + 100];
		}
		return this.method579(arg0, arg1, Static26.aClass2_Sub1_Sub2_1, Static26.aByteArray21, Static26.aShortArray29, Static26.anIntArray70, Static26.anIntArray71, Static26.anIntArray72);
	}

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "()V")
	private void method581() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt707; local17++) {
			@Pc(26) int local26 = this.anIntArray61[local17];
			@Pc(31) int local31 = this.anIntArray60[local17];
			@Pc(36) int local36 = this.anIntArray67[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 += local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort19 = (short) local1;
		this.aShort12 = (short) local7;
		this.aShort14 = (short) local3;
		this.aShort18 = (short) local9;
		this.aShort15 = (short) local5;
		this.aShort13 = (short) local11;
		this.aShort16 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort17 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean41 = true;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(ZZZ)Lclient!o;")
	@Override
	public Class2_Sub1 method569(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static26.aByteArray23.length < this.anInt705) {
			Static26.aByteArray23 = new byte[this.anInt705 + 100];
		}
		if (!arg1 && Static26.aShortArray31.length < this.anInt705) {
			Static26.anIntArray90 = new int[this.anInt705 + 100];
			Static26.anIntArray96 = new int[this.anInt705 + 100];
			Static26.anIntArray94 = new int[this.anInt705 + 100];
			Static26.aShortArray31 = new short[this.anInt705 + 100];
		}
		return this.method579(arg0, arg1, Static26.aClass2_Sub1_Sub2_3, Static26.aByteArray23, Static26.aShortArray31, Static26.anIntArray90, Static26.anIntArray96, Static26.anIntArray94);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!ca;")
	public Class2_Sub1_Sub2 method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean41) {
			this.method581();
		}
		@Pc(9) int local9 = arg4 + this.aShort19;
		@Pc(14) int local14 = arg4 + this.aShort12;
		@Pc(19) int local19 = arg6 + this.aShort15;
		@Pc(24) int local24 = arg6 + this.aShort13;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) Class2_Sub1_Sub2 local150;
		if (arg7) {
			local150 = new Class2_Sub1_Sub2();
			local150.anInt704 = this.anInt704;
			local150.anInt707 = this.anInt707;
			local150.anInt705 = this.anInt705;
			local150.anInt706 = this.anInt706;
			local150.anIntArray68 = this.anIntArray68;
			local150.anIntArray69 = this.anIntArray69;
			local150.anIntArray58 = this.anIntArray58;
			local150.anIntArray62 = this.anIntArray62;
			local150.anIntArray65 = this.anIntArray65;
			local150.anIntArray63 = this.anIntArray63;
			local150.aByteArray18 = this.aByteArray18;
			local150.aByteArray20 = this.aByteArray20;
			local150.aShortArray26 = this.aShortArray26;
			local150.aShortArray25 = this.aShortArray25;
			local150.aByteArray19 = this.aByteArray19;
			local150.aByte5 = this.aByte5;
			local150.anIntArray66 = this.anIntArray66;
			local150.anIntArray59 = this.anIntArray59;
			local150.anIntArray64 = this.anIntArray64;
			local150.anIntArrayArray12 = this.anIntArrayArray12;
			local150.anIntArrayArray11 = this.anIntArrayArray11;
			local150.aShortArray28 = this.aShortArray28;
			local150.aShortArray27 = this.aShortArray27;
			local150.aBoolean39 = this.aBoolean39;
			if (arg0 == 3) {
				local150.anIntArray61 = Static112.method1811(this.anIntArray61);
				local150.anIntArray60 = Static112.method1811(this.anIntArray60);
				local150.anIntArray67 = Static112.method1811(this.anIntArray67);
			} else {
				local150.anIntArray61 = this.anIntArray61;
				local150.anIntArray60 = new int[local150.anInt704];
				local150.anIntArray67 = this.anIntArray67;
			}
		} else {
			local150 = this;
		}
		@Pc(289) int local289;
		@Pc(300) int local300;
		@Pc(307) int local307;
		@Pc(311) int local311;
		@Pc(315) int local315;
		@Pc(319) int local319;
		@Pc(323) int local323;
		@Pc(345) int local345;
		@Pc(371) int local371;
		@Pc(383) int local383;
		if (arg0 == 1) {
			for (local289 = 0; local289 < local150.anInt707; local289++) {
				local300 = this.anIntArray61[local289] + arg4;
				local307 = this.anIntArray67[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray60[local289] = this.anIntArray60[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt707; local289 < local150.anInt704; local289++) {
				local300 = this.anIntArray61[local289] + arg4;
				local307 = this.anIntArray67[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray60[local289] = this.anIntArray60[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt707; local289++) {
					local300 = (this.anIntArray60[local289] << 16) / this.aShort14;
					if (local300 < arg1) {
						local307 = this.anIntArray61[local289] + arg4;
						local311 = this.anIntArray67[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray60[local289] = this.anIntArray60[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray60[local289] = this.anIntArray60[local289];
					}
				}
				for (local289 = local150.anInt707; local289 < local150.anInt704; local289++) {
					local300 = (this.anIntArray60[local289] << 16) / this.aShort14;
					if (local300 < arg1) {
						local307 = this.anIntArray61[local289] + arg4;
						local311 = this.anIntArray67[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray60[local289] = this.anIntArray60[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray60[local289] = this.anIntArray60[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method563(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort18 - this.aShort14;
				for (local300 = 0; local300 < this.anInt707; local300++) {
					local307 = this.anIntArray61[local300] + arg4;
					local311 = this.anIntArray67[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray60[local300] = this.anIntArray60[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt707; local300 < local150.anInt704; local300++) {
					local307 = this.anIntArray61[local300] + arg4;
					local311 = this.anIntArray67[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray60[local300] = this.anIntArray60[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort18 - this.aShort14;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt707; local300++) {
					local307 = this.anIntArray61[local300] + arg4;
					local311 = this.anIntArray67[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
					local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local1273 = local371 * (128 - local319) + local383 * local319 >> 7;
					local1277 = local640 - local1273;
					local150.anIntArray60[local300] = ((this.anIntArray60[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt707; local300 < local150.anInt704; local300++) {
					local307 = this.anIntArray61[local300] + arg4;
					local311 = this.anIntArray67[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg2.length - 1 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1 && local345 < arg3[0].length - 1) {
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local1273 = local371 * (128 - local319) + local383 * local319 >> 7;
						local1277 = local640 - local1273;
						local150.anIntArray60[local300] = ((this.anIntArray60[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean41 = false;
		return local150;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
	@Override
	public int method549() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
	@Override
	public void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt704; local1++) {
			this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 / 128;
			this.anIntArray60[local1] = this.anIntArray60[local1] * arg1 / 128;
			this.anIntArray67[local1] = this.anIntArray67[local1] * arg2 / 128;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "()V")
	@Override
	public void method565() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt704; local1++) {
			@Pc(10) int local10 = this.anIntArray61[local1];
			this.anIntArray61[local1] = this.anIntArray67[local1];
			this.anIntArray67[local1] = -local10;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZJIILclient!dc;)V")
	private void method583(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class34_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static26.aBoolean43) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray92[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray81[local11] = 0;
			}
			Static26.anInt709 = 0;
		}
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(120) int local120;
		for (local11 = 0; local11 < this.anInt705; local11++) {
			if (this.anIntArray63[local11] != -2) {
				local51 = this.anIntArray68[local11];
				local56 = this.anIntArray69[local11];
				local61 = this.anIntArray58[local11];
				local65 = Static26.anIntArray88[local51];
				local69 = Static26.anIntArray88[local56];
				local73 = Static26.anIntArray88[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static26.anIntArray79[local51];
					local92 = Static26.anIntArray79[local56];
					local96 = Static26.anIntArray79[local61];
					local100 = Static26.anIntArray91[local51];
					local104 = Static26.anIntArray91[local56];
					local108 = Static26.anIntArray91[local61];
					local112 = Static26.anIntArray83[local51];
					@Pc(116) int local116 = Static26.anIntArray83[local56];
					local120 = Static26.anIntArray83[local61];
					@Pc(124) int local124 = local88 - local92;
					@Pc(128) int local128 = local96 - local92;
					@Pc(132) int local132 = local100 - local104;
					@Pc(136) int local136 = local108 - local104;
					@Pc(140) int local140 = local112 - local116;
					@Pc(144) int local144 = local120 - local116;
					@Pc(152) int local152 = local132 * local144 - local140 * local136;
					@Pc(160) int local160 = local140 * local128 - local124 * local144;
					@Pc(168) int local168 = local124 * local136 - local132 * local128;
					if (local92 * local152 + local104 * local160 + local116 * local168 > 0) {
						Static26.aBooleanArray4[local11] = true;
						if (Static26.aBoolean43) {
							anIntArray80[local5] = (Static26.anIntArray98[local51] + Static26.anIntArray98[local56] + Static26.anIntArray98[local61]) / 3;
							anIntArray76[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static26.anIntArray98[local51] + Static26.anIntArray98[local56] + Static26.anIntArray98[local61]) / 3 + arg3;
							if (anIntArray92[local224] < 64) {
								anIntArrayArray14[local224][anIntArray92[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray92[local224];
								if (local247 == 64) {
									if (Static26.anInt709 == 512) {
										continue;
									}
									anIntArray92[local224] = local247 = Static26.anInt709++ + 65;
								}
								local247 -= 65;
								anIntArrayArray13[local247][anIntArray81[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method589(Static302.anInt5999 + Static237.anInt4974, Static93.anInt2128 + Static237.anInt4975, Static26.anIntArray78[local51], Static26.anIntArray78[local56], Static26.anIntArray78[local61], local65, local69, local73)) {
						Static95.aLongArray4[Static38.anInt947++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static26.anIntArray78[local61] - Static26.anIntArray78[local56]) - (Static26.anIntArray78[local51] - Static26.anIntArray78[local56]) * (local73 - local69) > 0) {
						Static26.aBooleanArray4[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static237.anInt4976 && local69 <= Static237.anInt4976 && local73 <= Static237.anInt4976) {
							Static26.aBooleanArray5[local11] = false;
						} else {
							Static26.aBooleanArray5[local11] = true;
						}
						if (Static26.aBoolean43) {
							anIntArray80[local5] = (Static26.anIntArray98[local51] + Static26.anIntArray98[local56] + Static26.anIntArray98[local61]) / 3;
							anIntArray76[local5++] = local11;
						} else {
							local88 = (Static26.anIntArray98[local51] + Static26.anIntArray98[local56] + Static26.anIntArray98[local61]) / 3 + arg3;
							if (anIntArray92[local88] < 64) {
								anIntArrayArray14[local88][anIntArray92[local88]++] = local11;
							} else {
								local92 = anIntArray92[local88];
								if (local92 == 64) {
									if (Static26.anInt709 == 512) {
										continue;
									}
									anIntArray92[local88] = local92 = Static26.anInt709++ + 65;
								}
								local92 -= 65;
								anIntArrayArray13[local92][anIntArray81[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static26.aBoolean43) {
			for (local11 = 0; local11 < Static26.anIntArray82.length; local11++) {
				local51 = Static26.anIntArray82[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray92[local51] < 64) {
						anIntArrayArray14[local51][anIntArray92[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray92[local51];
						if (local56 == 64) {
							if (Static26.anInt709 == 512) {
								continue;
							}
							anIntArray92[local51] = local56 = Static26.anInt709++ + 65;
						}
						local56 -= 65;
						anIntArrayArray13[local56][anIntArray81[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static26.aBoolean43) {
			Static171.method2788(local5 - 1, 0, anIntArray80, anIntArray76);
			if (this.aByteArray18 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method586(anIntArray76[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static26.anIntArray84[local11] = 0;
				Static26.anIntArray95[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray76[local11];
				local56 = anIntArray80[local11];
				@Pc(610) byte local610 = this.aByteArray18[local51];
				local65 = Static26.anIntArray84[local610]++;
				Static26.anIntArrayArray15[local610][local65] = local51;
				if (local610 < 10) {
					Static26.anIntArray95[local610] += local56;
				} else if (local610 == 10) {
					Static26.anIntArray100[local65] = local56;
				} else {
					Static26.anIntArray89[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray18 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray92[local11];
					@Pc(706) Class34_Sub2_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray14[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method586(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass34_Sub2_Sub1Array1[local73];
								local92 = Static26.anIntArray97[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static231.method3635(Static26.anIntArray99[local73], Static26.anIntArray77[local73], (local706.aClass34_Sub3_1.aClass18_2.anInt479 << 16) / local92, local706.anInt2123, local706.anInt2123 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray92[local11] - 64 - 1;
						local677 = anIntArrayArray13[local56];
						for (local65 = 0; local65 < anIntArray81[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method586(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass34_Sub2_Sub1Array1[local73];
								local92 = Static26.anIntArray97[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static231.method3635(Static26.anIntArray99[local73], Static26.anIntArray77[local73], (local706.aClass34_Sub3_1.aClass18_2.anInt479 << 16) / local92, local706.anInt2123, local706.anInt2123 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static26.anIntArray84[local11] = 0;
				Static26.anIntArray95[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray92[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray14[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray18[local69];
							local88 = Static26.anIntArray84[local881]++;
							Static26.anIntArrayArray15[local881][local88] = local69;
							if (local881 < 10) {
								Static26.anIntArray95[local881] += local11;
							} else if (local881 == 10) {
								Static26.anIntArray100[local88] = local11;
							} else {
								Static26.anIntArray89[local88] = local11;
							}
						} else {
							Static26.anIntArray85[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray92[local11] - 64 - 1;
					local677 = anIntArrayArray13[local56];
					for (local65 = 0; local65 < anIntArray81[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray18[local69];
							local88 = Static26.anIntArray84[local881]++;
							Static26.anIntArrayArray15[local881][local88] = local69;
							if (local881 < 10) {
								Static26.anIntArray95[local881] += local11;
							} else if (local881 == 10) {
								Static26.anIntArray100[local88] = local11;
							} else {
								Static26.anIntArray89[local88] = local11;
							}
						} else {
							Static26.anIntArray85[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static26.anIntArray84[1] > 0 || Static26.anIntArray84[2] > 0) {
			local11 = (Static26.anIntArray95[1] + Static26.anIntArray95[2]) / (Static26.anIntArray84[1] + Static26.anIntArray84[2]);
		}
		local51 = 0;
		if (Static26.anIntArray84[3] > 0 || Static26.anIntArray84[4] > 0) {
			local51 = (Static26.anIntArray95[3] + Static26.anIntArray95[4]) / (Static26.anIntArray84[3] + Static26.anIntArray84[4]);
		}
		local56 = 0;
		if (Static26.anIntArray84[6] > 0 || Static26.anIntArray84[8] > 0) {
			local56 = (Static26.anIntArray95[6] + Static26.anIntArray95[8]) / (Static26.anIntArray84[6] + Static26.anIntArray84[8]);
		}
		local65 = 0;
		local69 = Static26.anIntArray84[10];
		@Pc(1105) int[] local1105 = Static26.anIntArrayArray15[10];
		@Pc(1107) int[] local1107 = Static26.anIntArray100;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static26.anIntArray84[11];
			local1105 = Static26.anIntArrayArray15[11];
			local1107 = Static26.anIntArray89;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method586(local1105[local65++]);
				if (local65 == local69 && local1105 != Static26.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static26.anIntArray84[11];
					local1105 = Static26.anIntArrayArray15[11];
					local1107 = Static26.anIntArray89;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method586(local1105[local65++]);
				if (local65 == local69 && local1105 != Static26.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static26.anIntArray84[11];
					local1105 = Static26.anIntArrayArray15[11];
					local1107 = Static26.anIntArray89;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method586(local1105[local65++]);
				if (local65 == local69 && local1105 != Static26.anIntArrayArray15[11]) {
					local65 = 0;
					local69 = Static26.anIntArray84[11];
					local1105 = Static26.anIntArrayArray15[11];
					local1107 = Static26.anIntArray89;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static26.anIntArray84[local96];
			@Pc(1275) int[] local1275 = Static26.anIntArrayArray15[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static26.anIntArray95[local96] / local100;
				}
				for (local112 = Static26.anIntArray85[local92]; Static26.anIntArray82[local112] + arg3 > local108; local112 = Static26.anIntArray85[local92++]) {
					@Pc(1303) Class34_Sub2_Sub1 local1303 = arg5.aClass34_Sub2_Sub1Array1[local112];
					local120 = Static26.anIntArray97[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static231.method3635(Static26.anIntArray99[local112], Static26.anIntArray77[local112], (local1303.aClass34_Sub3_1.aClass18_2.anInt479 << 16) / local120, local1303.anInt2123, local1303.anInt2123 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method586(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method586(local1105[local65++]);
			if (local65 == local69 && local1105 != Static26.anIntArrayArray15[11]) {
				local65 = 0;
				local1105 = Static26.anIntArrayArray15[11];
				local69 = Static26.anIntArray84[11];
				local1107 = Static26.anIntArray89;
			}
			if (local65 < local69) {
				local61 = local1107[local65];
			} else {
				local61 = -1000;
			}
		}
		if (arg5 == null) {
			return;
		}
		local96 = Static26.anIntArray85[local92];
		while (local92 < local7) {
			@Pc(1413) Class34_Sub2_Sub1 local1413 = arg5.aClass34_Sub2_Sub1Array1[local96];
			local104 = Static26.anIntArray97[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static231.method3635(Static26.anIntArray99[local96], Static26.anIntArray77[local96], (local1413.aClass34_Sub3_1.aClass18_2.anInt479 << 16) / local104, local1413.anInt2123, local1413.anInt2123 >> 24 & 0xFF);
			local96 = Static26.anIntArray85[local92++];
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!o;)Lclient!o;")
	public Class2_Sub1 method584(@OriginalArg(0) Class2_Sub1 arg0) {
		return new Class2_Sub1_Sub2(new Class2_Sub1_Sub2[] { this, (Class2_Sub1_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "()V")
	private void method585() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt705; local1++) {
			@Pc(15) short local15 = this.aShortArray26 == null ? -1 : this.aShortArray26[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray25[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray63[local1] == -1) {
					local38 = this.anIntArray62[local1] & 0xFFFE0000;
					this.anIntArray62[local1] = local38 | Static26.method590(local25, local38 >> 17);
				} else if (this.anIntArray63[local1] != -2) {
					local38 = this.anIntArray62[local1] & 0xFFFE0000;
					this.anIntArray62[local1] = local38 | Static26.method590(local25, local38 >> 17);
					local38 = this.anIntArray65[local1] & 0xFFFE0000;
					this.anIntArray65[local1] = local38 | Static26.method590(local25, local38 >> 17);
					local38 = this.anIntArray63[local1] & 0xFFFE0000;
					this.anIntArray63[local1] = local38 | Static26.method590(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "()V")
	@Override
	public void method562() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt704; local1++) {
			@Pc(10) int local10 = this.anIntArray67[local1];
			this.anIntArray67[local1] = this.anIntArray61[local1];
			this.anIntArray61[local1] = -local10;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method576(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static26.anInt710 = 0;
			Static26.anInt711 = 0;
			Static26.anInt708 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray12.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray12[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local41]) != 0) {
							Static26.anInt710 += this.anIntArray61[local41];
							Static26.anInt711 += this.anIntArray60[local41];
							Static26.anInt708 += this.anIntArray67[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static26.anInt710 = Static26.anInt710 / local6 + arg2;
				Static26.anInt711 = Static26.anInt711 / local6 + arg3;
				Static26.anInt708 = Static26.anInt708 / local6 + arg4;
				Static26.aBoolean42 = true;
			} else {
				Static26.anInt710 = arg2;
				Static26.anInt711 = arg3;
				Static26.anInt708 = arg4;
			}
			return;
		}
		@Pc(204) int[] local204;
		@Pc(206) int local206;
		if (arg0 == 1) {
			if (arg7 != null) {
				local6 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local14 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local6;
				arg3 = local14;
				arg4 = local21;
			}
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local204 = this.anIntArrayArray12[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local33]) != 0) {
							this.anIntArray61[local33] += arg2;
							this.anIntArray60[local33] += arg3;
							this.anIntArray67[local33] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(307) int local307;
		@Pc(329) int local329;
		@Pc(351) int local351;
		@Pc(392) int local392;
		@Pc(398) int local398;
		@Pc(404) int local404;
		@Pc(410) int local410;
		@Pc(418) int local418;
		@Pc(426) int local426;
		@Pc(579) int local579;
		@Pc(604) int local604;
		@Pc(608) int local608;
		@Pc(616) int local616;
		@Pc(621) int local621;
		@Pc(626) int local626;
		@Pc(631) int local631;
		@Pc(753) int[] local753;
		@Pc(755) int local755;
		@Pc(760) int local760;
		@Pc(765) int local765;
		@Pc(767) int local767;
		@Pc(893) int local893;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray12.length) {
						local204 = this.anIntArrayArray12[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local33]) != 0) {
								this.anIntArray61[local33] -= Static26.anInt710;
								this.anIntArray60[local33] -= Static26.anInt711;
								this.anIntArray67[local33] -= Static26.anInt708;
								if (arg4 != 0) {
									local41 = Class146.anIntArray461[arg4];
									local307 = Class146.anIntArray463[arg4];
									local329 = this.anIntArray60[local33] * local41 + this.anIntArray61[local33] * local307 + 32767 >> 16;
									this.anIntArray60[local33] = this.anIntArray60[local33] * local307 + 32767 - this.anIntArray61[local33] * local41 >> 16;
									this.anIntArray61[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class146.anIntArray461[arg2];
									local307 = Class146.anIntArray463[arg2];
									local329 = this.anIntArray60[local33] * local307 + 32767 - this.anIntArray67[local33] * local41 >> 16;
									this.anIntArray67[local33] = this.anIntArray60[local33] * local41 + this.anIntArray67[local33] * local307 + 32767 >> 16;
									this.anIntArray60[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class146.anIntArray461[arg3];
									local307 = Class146.anIntArray463[arg3];
									local329 = this.anIntArray67[local33] * local41 + this.anIntArray61[local33] * local307 + 32767 >> 16;
									this.anIntArray67[local33] = this.anIntArray67[local33] * local307 + 32767 - this.anIntArray61[local33] * local41 >> 16;
									this.anIntArray61[local33] = local329;
								}
								this.anIntArray61[local33] += Static26.anInt710;
								this.anIntArray60[local33] += Static26.anInt711;
								this.anIntArray67[local33] += Static26.anInt708;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static26.aBoolean42) {
					local307 = arg7[0] * Static26.anInt710 + arg7[3] * Static26.anInt711 + arg7[6] * Static26.anInt708 + 16384 >> 15;
					local329 = arg7[1] * Static26.anInt710 + arg7[4] * Static26.anInt711 + arg7[7] * Static26.anInt708 + 16384 >> 15;
					local351 = arg7[2] * Static26.anInt710 + arg7[5] * Static26.anInt711 + arg7[8] * Static26.anInt708 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static26.anInt710 = local307;
					Static26.anInt711 = local329;
					Static26.anInt708 = local351;
					Static26.aBoolean42 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class146.anIntArray463[arg2] >> 1;
				local351 = Class146.anIntArray461[arg2] >> 1;
				local392 = Class146.anIntArray463[arg3] >> 1;
				local398 = Class146.anIntArray461[arg3] >> 1;
				local404 = Class146.anIntArray463[arg4] >> 1;
				local410 = Class146.anIntArray461[arg4] >> 1;
				local418 = local351 * local404 + 16384 >> 15;
				local426 = local351 * local410 + 16384 >> 15;
				local374[0] = local392 * local404 + local398 * local426 + 16384 >> 15;
				local374[1] = -local392 * local410 + local398 * local418 + 16384 >> 15;
				local374[2] = local398 * local329 + 16384 >> 15;
				local374[3] = local329 * local410 + 16384 >> 15;
				local374[4] = local329 * local404 + 16384 >> 15;
				local374[5] = -local351;
				local374[6] = -local398 * local404 + local392 * local426 + 16384 >> 15;
				local374[7] = local398 * local410 + local392 * local418 + 16384 >> 15;
				local374[8] = local392 * local329 + 16384 >> 15;
				@Pc(554) int local554 = local374[0] * -Static26.anInt710 + local374[1] * -Static26.anInt711 + local374[2] * -Static26.anInt708 + 16384 >> 15;
				local579 = local374[3] * -Static26.anInt710 + local374[4] * -Static26.anInt711 + local374[5] * -Static26.anInt708 + 16384 >> 15;
				local604 = local374[6] * -Static26.anInt710 + local374[7] * -Static26.anInt711 + local374[8] * -Static26.anInt708 + 16384 >> 15;
				local608 = local554 + Static26.anInt710;
				@Pc(612) int local612 = local579 + Static26.anInt711;
				local616 = local604 + Static26.anInt708;
				@Pc(619) int[] local619 = new int[9];
				for (local621 = 0; local621 < 3; local621++) {
					for (local626 = 0; local626 < 3; local626++) {
						local631 = 0;
						for (@Pc(633) int local633 = 0; local633 < 3; local633++) {
							local631 += local374[local621 * 3 + local633] * arg7[local626 * 3 + local633];
						}
						local619[local621 * 3 + local626] = local631 + 16384 >> 15;
					}
				}
				local621 = local374[0] * local206 + local374[1] * local33 + local374[2] * local41 + 16384 >> 15;
				local626 = local374[3] * local206 + local374[4] * local33 + local374[5] * local41 + 16384 >> 15;
				local631 = local374[6] * local206 + local374[7] * local33 + local374[8] * local41 + 16384 >> 15;
				local621 += local608;
				local626 += local612;
				local631 += local616;
				local753 = new int[9];
				for (local755 = 0; local755 < 3; local755++) {
					for (local760 = 0; local760 < 3; local760++) {
						local765 = 0;
						for (local767 = 0; local767 < 3; local767++) {
							local765 += arg7[local755 * 3 + local767] * local619[local760 + local767 * 3];
						}
						local753[local755 * 3 + local760] = local765 + 16384 >> 15;
					}
				}
				local755 = arg7[0] * local621 + arg7[1] * local626 + arg7[2] * local631 + 16384 >> 15;
				local760 = arg7[3] * local621 + arg7[4] * local626 + arg7[5] * local631 + 16384 >> 15;
				local765 = arg7[6] * local621 + arg7[7] * local626 + arg7[8] * local631 + 16384 >> 15;
				local755 += local6;
				local760 += local14;
				local765 += local21;
				for (local767 = 0; local767 < local2; local767++) {
					local893 = arg1[local767];
					if (local893 < this.anIntArrayArray12.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray12[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray61[local913] + local753[1] * this.anIntArray60[local913] + local753[2] * this.anIntArray67[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray61[local913] + local753[4] * this.anIntArray60[local913] + local753[5] * this.anIntArray67[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray61[local913] + local753[7] * this.anIntArray60[local913] + local753[8] * this.anIntArray67[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray61[local913] = local1021;
								this.anIntArray60[local913] = local1025;
								this.anIntArray67[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray12.length) {
						local204 = this.anIntArrayArray12[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local33]) != 0) {
								this.anIntArray61[local33] -= Static26.anInt710;
								this.anIntArray60[local33] -= Static26.anInt711;
								this.anIntArray67[local33] -= Static26.anInt708;
								this.anIntArray61[local33] = this.anIntArray61[local33] * arg2 / 128;
								this.anIntArray60[local33] = this.anIntArray60[local33] * arg3 / 128;
								this.anIntArray67[local33] = this.anIntArray67[local33] * arg4 / 128;
								this.anIntArray61[local33] += Static26.anInt710;
								this.anIntArray60[local33] += Static26.anInt711;
								this.anIntArray67[local33] += Static26.anInt708;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static26.aBoolean42) {
					local307 = arg7[0] * Static26.anInt710 + arg7[3] * Static26.anInt711 + arg7[6] * Static26.anInt708 + 16384 >> 15;
					local329 = arg7[1] * Static26.anInt710 + arg7[4] * Static26.anInt711 + arg7[7] * Static26.anInt708 + 16384 >> 15;
					local351 = arg7[2] * Static26.anInt710 + arg7[5] * Static26.anInt711 + arg7[8] * Static26.anInt708 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static26.anInt710 = local307;
					Static26.anInt711 = local329;
					Static26.anInt708 = local351;
					Static26.aBoolean42 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static26.anInt710 + 16384 >> 15;
				local398 = local329 * -Static26.anInt711 + 16384 >> 15;
				local404 = local351 * -Static26.anInt708 + 16384 >> 15;
				local410 = local392 + Static26.anInt710;
				local418 = local398 + Static26.anInt711;
				local426 = local404 + Static26.anInt708;
				@Pc(1481) int[] local1481 = new int[] { local307 * arg7[0] + 16384 >> 15, local307 * arg7[3] + 16384 >> 15, local307 * arg7[6] + 16384 >> 15, local329 * arg7[1] + 16384 >> 15, local329 * arg7[4] + 16384 >> 15, local329 * arg7[7] + 16384 >> 15, local351 * arg7[2] + 16384 >> 15, local351 * arg7[5] + 16384 >> 15, local351 * arg7[8] + 16384 >> 15 };
				local579 = local307 * local206 + 16384 >> 15;
				local604 = local329 * local33 + 16384 >> 15;
				local608 = local351 * local41 + 16384 >> 15;
				@Pc(1617) int local1617 = local579 + local410;
				@Pc(1621) int local1621 = local604 + local418;
				@Pc(1625) int local1625 = local608 + local426;
				@Pc(1628) int[] local1628 = new int[9];
				@Pc(1635) int local1635;
				for (local616 = 0; local616 < 3; local616++) {
					for (local1635 = 0; local1635 < 3; local1635++) {
						local621 = 0;
						for (local626 = 0; local626 < 3; local626++) {
							local621 += arg7[local616 * 3 + local626] * local1481[local1635 + local626 * 3];
						}
						local1628[local616 * 3 + local1635] = local621 + 16384 >> 15;
					}
				}
				local616 = arg7[0] * local1617 + arg7[1] * local1621 + arg7[2] * local1625 + 16384 >> 15;
				local1635 = arg7[3] * local1617 + arg7[4] * local1621 + arg7[5] * local1625 + 16384 >> 15;
				local621 = arg7[6] * local1617 + arg7[7] * local1621 + arg7[8] * local1625 + 16384 >> 15;
				local616 += local6;
				local1635 += local14;
				local621 += local21;
				for (local626 = 0; local626 < local2; local626++) {
					local631 = arg1[local626];
					if (local631 < this.anIntArrayArray12.length) {
						local753 = this.anIntArrayArray12[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray61[local760] + local1628[1] * this.anIntArray60[local760] + local1628[2] * this.anIntArray67[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray61[local760] + local1628[4] * this.anIntArray60[local760] + local1628[5] * this.anIntArray67[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray61[local760] + local1628[7] * this.anIntArray60[local760] + local1628[8] * this.anIntArray67[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray61[local760] = local1896;
								this.anIntArray60[local760] = local1900;
								this.anIntArray67[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray11 != null && this.aByteArray19 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray11.length) {
						local204 = this.anIntArrayArray11[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray27 == null || (arg6 & this.aShortArray27[local33]) != 0) {
								local41 = (this.aByteArray19[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray19[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray11 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray11.length) {
					local204 = this.anIntArrayArray11[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray27 == null || (arg6 & this.aShortArray27[local33]) != 0) {
							local41 = this.aShortArray25[local33] & 0xFFFF;
							local307 = local41 >> 10 & 0x3F;
							local329 = local41 >> 7 & 0x7;
							local351 = local41 & 0x7F;
							@Pc(2209) int local2209 = local307 + arg2 & 0x3F;
							local329 += arg3;
							if (local329 < 0) {
								local329 = 0;
							} else if (local329 > 7) {
								local329 = 7;
							}
							local351 += arg4;
							if (local351 < 0) {
								local351 = 0;
							} else if (local351 > 127) {
								local351 = 127;
							}
							this.aShortArray25[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean40 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	private void method586(@OriginalArg(0) int arg0) {
		if (Static26.aBooleanArray4[arg0]) {
			this.method578(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray68[arg0];
		@Pc(17) int local17 = this.anIntArray69[arg0];
		@Pc(22) int local22 = this.anIntArray58[arg0];
		Static237.aBoolean307 = Static26.aBooleanArray5[arg0];
		if (this.aByteArray19 == null) {
			Static237.anInt4973 = 0;
		} else {
			Static237.anInt4973 = this.aByteArray19[arg0] & 0xFF;
		}
		if (this.aShortArray26 != null && this.aShortArray26[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray20 == null || this.aByteArray20[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray20[arg0] & 0xFF;
				local141 = this.anIntArray66[local136];
				local146 = this.anIntArray59[local136];
				local151 = this.anIntArray64[local136];
			}
			if (this.anIntArray63[arg0] == -1) {
				Static237.method3735(Static26.anIntArray78[local12], Static26.anIntArray78[local17], Static26.anIntArray78[local22], Static26.anIntArray88[local12], Static26.anIntArray88[local17], Static26.anIntArray88[local22], this.anIntArray62[arg0], this.anIntArray62[arg0], this.anIntArray62[arg0], Static26.anIntArray79[local141], Static26.anIntArray79[local146], Static26.anIntArray79[local151], Static26.anIntArray91[local141], Static26.anIntArray91[local146], Static26.anIntArray91[local151], Static26.anIntArray83[local141], Static26.anIntArray83[local146], Static26.anIntArray83[local151], this.aShortArray26[arg0]);
			} else {
				Static237.method3735(Static26.anIntArray78[local12], Static26.anIntArray78[local17], Static26.anIntArray78[local22], Static26.anIntArray88[local12], Static26.anIntArray88[local17], Static26.anIntArray88[local22], this.anIntArray62[arg0], this.anIntArray65[arg0], this.anIntArray63[arg0], Static26.anIntArray79[local141], Static26.anIntArray79[local146], Static26.anIntArray79[local151], Static26.anIntArray91[local141], Static26.anIntArray91[local146], Static26.anIntArray91[local151], Static26.anIntArray83[local141], Static26.anIntArray83[local146], Static26.anIntArray83[local151], this.aShortArray26[arg0]);
			}
		} else if (this.anIntArray63[arg0] == -1) {
			Static237.method3744(Static26.anIntArray78[local12], Static26.anIntArray78[local17], Static26.anIntArray78[local22], Static26.anIntArray88[local12], Static26.anIntArray88[local17], Static26.anIntArray88[local22], Static237.anIntArray462[this.anIntArray62[arg0] & 0xFFFF]);
		} else {
			Static237.method3751(Static26.anIntArray78[local12], Static26.anIntArray78[local17], Static26.anIntArray78[local22], Static26.anIntArray88[local12], Static26.anIntArray88[local17], Static26.anIntArray88[local22], this.anIntArray62[arg0] & 0xFFFF, this.anIntArray65[arg0] & 0xFFFF, this.anIntArray63[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static26.anInt710 = 0;
			Static26.anInt711 = 0;
			Static26.anInt708 = 0;
			for (local11 = 0; local11 < this.anInt704; local11++) {
				Static26.anInt710 += this.anIntArray61[local11];
				Static26.anInt711 += this.anIntArray60[local11];
				Static26.anInt708 += this.anIntArray67[local11];
				local3++;
			}
			if (local3 > 0) {
				Static26.anInt710 = Static26.anInt710 / local3 + arg1;
				Static26.anInt711 = Static26.anInt711 / local3 + arg2;
				Static26.anInt708 = Static26.anInt708 / local3 + arg3;
			} else {
				Static26.anInt710 = arg1;
				Static26.anInt711 = arg2;
				Static26.anInt708 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt704; local3++) {
				this.anIntArray61[local3] += arg1;
				this.anIntArray60[local3] += arg2;
				this.anIntArray67[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt704; local3++) {
					this.anIntArray61[local3] -= Static26.anInt710;
					this.anIntArray60[local3] -= Static26.anInt711;
					this.anIntArray67[local3] -= Static26.anInt708;
					if (arg3 != 0) {
						local11 = Class146.anIntArray461[arg3];
						local146 = Class146.anIntArray463[arg3];
						local164 = this.anIntArray60[local3] * local11 + this.anIntArray61[local3] * local146 + 32767 >> 16;
						this.anIntArray60[local3] = this.anIntArray60[local3] * local146 + 32767 - this.anIntArray61[local3] * local11 >> 16;
						this.anIntArray61[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class146.anIntArray461[arg1];
						local146 = Class146.anIntArray463[arg1];
						local164 = this.anIntArray60[local3] * local146 + 32767 - this.anIntArray67[local3] * local11 >> 16;
						this.anIntArray67[local3] = this.anIntArray60[local3] * local11 + this.anIntArray67[local3] * local146 + 32767 >> 16;
						this.anIntArray60[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class146.anIntArray461[arg2];
						local146 = Class146.anIntArray463[arg2];
						local164 = this.anIntArray67[local3] * local11 + this.anIntArray61[local3] * local146 + 32767 >> 16;
						this.anIntArray67[local3] = this.anIntArray67[local3] * local146 + 32767 - this.anIntArray61[local3] * local11 >> 16;
						this.anIntArray61[local3] = local164;
					}
					this.anIntArray61[local3] += Static26.anInt710;
					this.anIntArray60[local3] += Static26.anInt711;
					this.anIntArray67[local3] += Static26.anInt708;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt704; local3++) {
					this.anIntArray61[local3] -= Static26.anInt710;
					this.anIntArray60[local3] -= Static26.anInt711;
					this.anIntArray67[local3] -= Static26.anInt708;
					this.anIntArray61[local3] = this.anIntArray61[local3] * arg1 / 128;
					this.anIntArray60[local3] = this.anIntArray60[local3] * arg2 / 128;
					this.anIntArray67[local3] = this.anIntArray67[local3] * arg3 / 128;
					this.anIntArray61[local3] += Static26.anInt710;
					this.anIntArray60[local3] += Static26.anInt711;
					this.anIntArray67[local3] += Static26.anInt708;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt705; local3++) {
					local11 = (this.aByteArray19[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray19[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt705; local3++) {
					local11 = this.aShortArray25[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(492) int local492 = local11 & 0x7F;
					@Pc(498) int local498 = local146 + arg1 & 0x3F;
					local164 += arg2;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local492 += arg3;
					if (local492 < 0) {
						local492 = 0;
					} else if (local492 > 127) {
						local492 = 127;
					}
					this.aShortArray25[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean40 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	@Override
	public void method554(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class146.anIntArray461[arg0];
		@Pc(7) int local7 = Class146.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt704; local9++) {
			@Pc(29) int local29 = this.anIntArray60[local9] * local7 - this.anIntArray67[local9] * local3 >> 16;
			this.anIntArray67[local9] = this.anIntArray60[local9] * local3 + this.anIntArray67[local9] * local7 >> 16;
			this.anIntArray60[local9] = local29;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(ZZZ)Lclient!o;")
	@Override
	public Class2_Sub1 method564(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static26.aByteArray22.length < this.anInt705) {
			Static26.aByteArray22 = new byte[this.anInt705 + 100];
		}
		if (!arg1 && Static26.aShortArray30.length < this.anInt705) {
			Static26.anIntArray73 = new int[this.anInt705 + 100];
			Static26.anIntArray74 = new int[this.anInt705 + 100];
			Static26.anIntArray75 = new int[this.anInt705 + 100];
			Static26.aShortArray30 = new short[this.anInt705 + 100];
		}
		return this.method579(arg0, arg1, Static26.aClass2_Sub1_Sub2_2, Static26.aByteArray22, Static26.aShortArray30, Static26.anIntArray73, Static26.anIntArray74, Static26.anIntArray75);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean41) {
				this.method581();
			}
			@Pc(6) int local6 = Static237.anInt4974;
			@Pc(8) int local8 = Static237.anInt4975;
			@Pc(12) int local12 = Class146.anIntArray461[0];
			@Pc(16) int local16 = Class146.anIntArray463[0];
			@Pc(20) int local20 = Class146.anIntArray461[arg0];
			@Pc(24) int local24 = Class146.anIntArray463[arg0];
			@Pc(28) int local28 = Class146.anIntArray461[arg1];
			@Pc(32) int local32 = Class146.anIntArray463[arg1];
			@Pc(36) int local36 = Class146.anIntArray461[arg2];
			@Pc(40) int local40 = Class146.anIntArray463[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt704; local52++) {
				@Pc(61) int local61 = this.anIntArray61[local52];
				@Pc(66) int local66 = this.anIntArray60[local52];
				@Pc(71) int local71 = this.anIntArray67[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static26.anIntArray98[local52] = local71 - local50;
				Static26.anIntArray88[local52] = local6 + (local61 << 9) / local71;
				Static26.anIntArray78[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt706 > 0) {
					Static26.anIntArray79[local52] = local61;
					Static26.anIntArray91[local52] = local83;
					Static26.anIntArray83[local52] = local71;
				}
			}
			this.method583(false, arg6 >= 0L, arg6, this.aShort17, this.aShort17 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()Z")
	@Override
	protected boolean method550() {
		if (this.anIntArrayArray12 == null) {
			return false;
		} else {
			Static26.anInt710 = 0;
			Static26.anInt711 = 0;
			Static26.anInt708 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIIII)V")
	public void method591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean41) {
				this.method581();
			}
			@Pc(6) int local6 = Static237.anInt4974;
			@Pc(8) int local8 = Static237.anInt4975;
			@Pc(12) int local12 = Class146.anIntArray461[0];
			@Pc(16) int local16 = Class146.anIntArray463[0];
			@Pc(20) int local20 = Class146.anIntArray461[arg0];
			@Pc(24) int local24 = Class146.anIntArray463[arg0];
			@Pc(28) int local28 = Class146.anIntArray461[arg1];
			@Pc(32) int local32 = Class146.anIntArray463[arg1];
			@Pc(36) int local36 = Class146.anIntArray461[arg2];
			@Pc(40) int local40 = Class146.anIntArray463[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt704; local52++) {
				@Pc(61) int local61 = this.anIntArray61[local52];
				@Pc(66) int local66 = this.anIntArray60[local52];
				@Pc(71) int local71 = this.anIntArray67[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static26.anIntArray98[local52] = local71 - local50;
				Static26.anIntArray88[local52] = local6 + (local61 << 9) / arg6;
				Static26.anIntArray78[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt706 > 0) {
					Static26.anIntArray79[local52] = local61;
					Static26.anIntArray91[local52] = local83;
					Static26.anIntArray83[local52] = local71;
				}
			}
			this.method583(false, false, 0L, this.aShort17, this.aShort17 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "()I")
	@Override
	public int method561() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "()I")
	@Override
	public int method575() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "()I")
	@Override
	public int method568() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "()I")
	@Override
	public int method573() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	@Override
	public void method552(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class146.anIntArray461[arg0];
		@Pc(7) int local7 = Class146.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt704; local9++) {
			@Pc(29) int local29 = this.anIntArray60[local9] * local3 + this.anIntArray61[local9] * local7 >> 16;
			this.anIntArray60[local9] = this.anIntArray60[local9] * local7 - this.anIntArray61[local9] * local3 >> 16;
			this.anIntArray61[local9] = local29;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	@Override
	public void method556(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class146.anIntArray461[arg0];
		@Pc(7) int local7 = Class146.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt704; local9++) {
			@Pc(29) int local29 = this.anIntArray67[local9] * local3 + this.anIntArray61[local9] * local7 >> 16;
			this.anIntArray67[local9] = this.anIntArray67[local9] * local7 - this.anIntArray61[local9] * local3 >> 16;
			this.anIntArray61[local9] = local29;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	@Override
	protected void method553() {
		if (this.aBoolean40) {
			this.method585();
			this.aBoolean40 = false;
		}
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static26.anInt710 = 0;
			Static26.anInt711 = 0;
			Static26.anInt708 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray12.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray12[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static26.anInt710 += this.anIntArray61[local41];
						Static26.anInt711 += this.anIntArray60[local41];
						Static26.anInt708 += this.anIntArray67[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static26.anInt710 = Static26.anInt710 / local6 + arg2;
				Static26.anInt711 = Static26.anInt711 / local6 + arg3;
				Static26.anInt708 = Static26.anInt708 / local6 + arg4;
			} else {
				Static26.anInt710 = arg2;
				Static26.anInt711 = arg3;
				Static26.anInt708 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local117 = this.anIntArrayArray12[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray61[local33] += arg2;
						this.anIntArray60[local33] += arg3;
						this.anIntArray67[local33] += arg4;
					}
				}
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(240) int local240;
		if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local117 = this.anIntArrayArray12[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray61[local33] -= Static26.anInt710;
						this.anIntArray60[local33] -= Static26.anInt711;
						this.anIntArray67[local33] -= Static26.anInt708;
						if (arg4 != 0) {
							local41 = Class146.anIntArray461[arg4];
							local222 = Class146.anIntArray463[arg4];
							local240 = this.anIntArray60[local33] * local41 + this.anIntArray61[local33] * local222 + 32767 >> 16;
							this.anIntArray60[local33] = this.anIntArray60[local33] * local222 + 32767 - this.anIntArray61[local33] * local41 >> 16;
							this.anIntArray61[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class146.anIntArray461[arg2];
							local222 = Class146.anIntArray463[arg2];
							local240 = this.anIntArray60[local33] * local222 + 32767 - this.anIntArray67[local33] * local41 >> 16;
							this.anIntArray67[local33] = this.anIntArray60[local33] * local41 + this.anIntArray67[local33] * local222 + 32767 >> 16;
							this.anIntArray60[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class146.anIntArray461[arg3];
							local222 = Class146.anIntArray463[arg3];
							local240 = this.anIntArray67[local33] * local41 + this.anIntArray61[local33] * local222 + 32767 >> 16;
							this.anIntArray67[local33] = this.anIntArray67[local33] * local222 + 32767 - this.anIntArray61[local33] * local41 >> 16;
							this.anIntArray61[local33] = local240;
						}
						this.anIntArray61[local33] += Static26.anInt710;
						this.anIntArray60[local33] += Static26.anInt711;
						this.anIntArray67[local33] += Static26.anInt708;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray12.length) {
					local117 = this.anIntArrayArray12[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray61[local33] -= Static26.anInt710;
						this.anIntArray60[local33] -= Static26.anInt711;
						this.anIntArray67[local33] -= Static26.anInt708;
						this.anIntArray61[local33] = this.anIntArray61[local33] * arg2 / 128;
						this.anIntArray60[local33] = this.anIntArray60[local33] * arg3 / 128;
						this.anIntArray67[local33] = this.anIntArray67[local33] * arg4 / 128;
						this.anIntArray61[local33] += Static26.anInt710;
						this.anIntArray60[local33] += Static26.anInt711;
						this.anIntArray67[local33] += Static26.anInt708;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray11 != null && this.aByteArray19 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray11.length) {
						local117 = this.anIntArrayArray11[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray19[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray19[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray11 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray11.length) {
					local117 = this.anIntArrayArray11[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray25[local33] & 0xFFFF;
						local222 = local41 >> 10 & 0x3F;
						local240 = local41 >> 7 & 0x7;
						@Pc(652) int local652 = local41 & 0x7F;
						@Pc(658) int local658 = local222 + arg2 & 0x3F;
						local240 += arg3;
						if (local240 < 0) {
							local240 = 0;
						} else if (local240 > 7) {
							local240 = 7;
						}
						local652 += arg4;
						if (local652 < 0) {
							local652 = 0;
						} else if (local652 > 127) {
							local652 = 127;
						}
						this.aShortArray25[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean40 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		if (!this.aBoolean41) {
			this.method581();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort16 * arg2 + this.aShort18 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort16 * arg2 + this.aShort14 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method856();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt1043 - arg10.anInt1049) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method861(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort16 << 9;
		if (local70 / local38 <= Static57.anInt6308) {
			return;
		}
		local87 = local58 - this.aShort16 << 9;
		if (local87 / local38 >= Static221.anInt4698) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort16 * arg1 + this.aShort18 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static280.anInt5623) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort16 * arg1 + this.aShort14 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static221.anInt4693) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt706 > 0;
		@Pc(223) int local223 = Static237.anInt4974;
		@Pc(225) int local225 = Static237.anInt4975;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class146.anIntArray461[arg0];
			local229 = Class146.anIntArray463[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static217.aBoolean292 && local53 > 0) {
			if (local58 > 0) {
				local255 = local87 / local38;
				local259 = local70 / local53;
			} else {
				local255 = local87 / local53;
				local259 = local70 / local38;
			}
			if (local158 > 0) {
				local274 = local197 / local38;
				local278 = local174 / local53;
			} else {
				local274 = local197 / local53;
				local278 = local174 / local38;
			}
			if (Static302.anInt5999 >= local255 && Static302.anInt5999 <= local259 && Static93.anInt2128 >= local274 && Static93.anInt2128 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort19, this.aShort12, this.aShort19, this.aShort12, this.aShort19, this.aShort12, this.aShort19, this.aShort12 };
				@Pc(393) int[] local393 = new int[] { this.aShort15, this.aShort15, this.aShort13, this.aShort13, this.aShort15, this.aShort15, this.aShort13, this.aShort13 };
				@Pc(436) int[] local436 = new int[] { this.aShort14, this.aShort14, this.aShort14, this.aShort14, this.aShort18, this.aShort18, this.aShort18, this.aShort18 };
				for (local438 = 0; local438 < 8; local438++) {
					@Pc(445) int local445 = local350[local438];
					@Pc(449) int local449 = local436[local438];
					@Pc(453) int local453 = local393[local438];
					@Pc(465) int local465;
					if (arg0 != 0) {
						local465 = local453 * local227 + local445 * local229 >> 16;
						local453 = local453 * local229 - local445 * local227 >> 16;
						local445 = local465;
					}
					local445 += arg5;
					local449 += arg6;
					local453 += arg7;
					local465 = local453 * arg3 + local445 * arg4 >> 16;
					local453 = local453 * arg4 - local445 * arg3 >> 16;
					local445 = local465;
					local465 = local449 * arg2 - local453 * arg1 >> 16;
					local453 = local449 * arg1 + local453 * arg2 >> 16;
					if (local453 > 0) {
						@Pc(541) int local541 = (local445 << 9) / local453;
						@Pc(547) int local547 = (local465 << 9) / local453;
						if (local541 < local255) {
							local255 = local541;
						}
						if (local541 > local259) {
							local259 = local541;
						}
						if (local547 < local274) {
							local274 = local547;
						}
						if (local547 > local278) {
							local278 = local547;
						}
					}
				}
				if (Static302.anInt5999 >= local255 && Static302.anInt5999 <= local259 && Static93.anInt2128 >= local274 && Static93.anInt2128 <= local278) {
					if (this.aBoolean39) {
						Static95.aLongArray4[Static38.anInt947++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt704; local255++) {
			local274 = this.anIntArray61[local255];
			local259 = this.anIntArray60[local255];
			local278 = this.anIntArray67[local255];
			if (arg0 != 0) {
				local628 = local278 * local227 + local274 * local229 >> 16;
				local278 = local278 * local229 - local274 * local227 >> 16;
				local274 = local628;
			}
			local274 += arg5;
			local259 += arg6;
			local278 += arg7;
			local628 = local278 * arg3 + local274 * arg4 >> 16;
			local278 = local278 * arg4 - local274 * arg3 >> 16;
			local274 = local628;
			local628 = local259 * arg2 - local278 * arg1 >> 16;
			local278 = local259 * arg1 + local278 * arg2 >> 16;
			Static26.anIntArray98[local255] = local278 - local24;
			if (local278 >= 50) {
				Static26.anIntArray88[local255] = local223 + (local274 << 9) / local278;
				Static26.anIntArray78[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static26.anIntArray88[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static26.anIntArray79[local255] = local274;
				Static26.anIntArray91[local255] = local628;
				Static26.anIntArray83[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static42.anInt1040 + local223;
			local274 = Static42.anInt1035 + local225;
			for (local259 = 0; local259 < arg10.aClass34_Sub2_Sub1Array1.length; local259++) {
				@Pc(770) Class34_Sub2_Sub1 local770 = arg10.aClass34_Sub2_Sub1Array1[local259];
				if (local770 == null || local770.aBoolean142) {
					Static26.anIntArray82[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt2120 >> 12) - Static215.anInt4665;
					@Pc(789) int local789 = (local770.anInt2122 >> 12) - Static296.anInt5905;
					@Pc(796) int local796 = (local770.anInt2124 >> 12) - Static2.anInt53;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static26.anIntArray99[local259] = local255 + (local628 << 9) / local838;
						Static26.anIntArray77[local259] = local274 + (local438 << 9) / local838;
						Static26.anIntArray97[local259] = local838;
						Static26.anIntArray82[local259] = local838 - local24;
					} else {
						Static26.anIntArray82[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method583(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()I")
	@Override
	public int method558() {
		if (!this.aBoolean41) {
			this.method581();
		}
		return this.aShort12;
	}
}
