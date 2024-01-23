import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class14_Sub6_Sub2 extends Class14_Sub6 {

	@OriginalMember(owner = "client!um", name = "wb", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!um", name = "Ib", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!um", name = "Hb", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!um", name = "Fb", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!um", name = "Ab", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!um", name = "ob", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!um", name = "H", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "[I")
	private int[] anIntArray472;

	@OriginalMember(owner = "client!um", name = "O", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!um", name = "R", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!um", name = "S", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!um", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!um", name = "U", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!um", name = "V", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!um", name = "W", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!um", name = "X", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!um", name = "Y", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!um", name = "Z", descriptor = "[I")
	private int[] anIntArray476;

	@OriginalMember(owner = "client!um", name = "db", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!um", name = "M", descriptor = "I")
	private int anInt5292 = 0;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	public int anInt5291 = 0;

	@OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
	private int anInt5294 = 0;

	@OriginalMember(owner = "client!um", name = "N", descriptor = "I")
	private int anInt5293 = 0;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "Z")
	private boolean aBoolean394 = false;

	static {
		if (Static271.aBoolean396) {
			anIntArray488 = new int[4096];
			anIntArray496 = new int[4096];
		} else {
			anIntArray495 = new int[1600];
			anIntArrayArray40 = new int[1600][64];
			anIntArray491 = new int[32];
			anIntArrayArray38 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class14_Sub6_Sub2() {
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!dl;IIIII)V")
	public Class14_Sub6_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1002();
		arg0.method975();
		this.anInt5291 = arg0.anInt1156;
		this.anInt5294 = arg0.anInt1157;
		this.anIntArray473 = arg0.anIntArray116;
		this.anIntArray475 = arg0.anIntArray115;
		this.anIntArray466 = arg0.anIntArray121;
		this.anInt5292 = arg0.anInt1154;
		this.anIntArray472 = arg0.anIntArray111;
		this.anIntArray479 = arg0.anIntArray112;
		this.anIntArray476 = arg0.anIntArray113;
		this.aByteArray69 = arg0.aByteArray17;
		this.aByteArray70 = arg0.aByteArray26;
		this.aByte23 = arg0.aByte2;
		this.aShortArray83 = arg0.aShortArray18;
		this.anIntArrayArray36 = arg0.anIntArrayArray4;
		this.anIntArrayArray37 = arg0.anIntArrayArray5;
		this.aShortArray84 = arg0.aShortArray15;
		this.aShortArray82 = arg0.aShortArray20;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray474 = new int[this.anInt5292];
		this.anIntArray470 = new int[this.anInt5292];
		this.anIntArray468 = new int[this.anInt5292];
		@Pc(140) int local140;
		if (arg0.aShortArray19 == null) {
			this.aShortArray81 = null;
		} else {
			this.aShortArray81 = new short[this.anInt5292];
			for (local140 = 0; local140 < this.anInt5292; local140++) {
				@Pc(149) short local149 = arg0.aShortArray19[local140];
				if (local149 != -1 && Static110.anInterface2_1.method2275(local149)) {
					this.aShortArray81[local140] = local149;
				} else {
					this.aShortArray81[local140] = -1;
				}
			}
		}
		if (arg0.anInt1153 > 0 && arg0.aByteArray22 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt1153];
			@Pc(186) int local186;
			for (local186 = 0; local186 < this.anInt5292; local186++) {
				if (arg0.aByteArray22[local186] != -1) {
					local184[arg0.aByteArray22[local186] & 0xFF]++;
				}
			}
			this.anInt5293 = 0;
			for (local186 = 0; local186 < arg0.anInt1153; local186++) {
				if (local184[local186] > 0 && arg0.aByteArray24[local186] == 0) {
					this.anInt5293++;
				}
			}
			this.anIntArray467 = new int[this.anInt5293];
			this.anIntArray469 = new int[this.anInt5293];
			this.anIntArray471 = new int[this.anInt5293];
			local186 = 0;
			@Pc(255) int local255;
			for (local255 = 0; local255 < arg0.anInt1153; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray24[local255] == 0) {
					this.anIntArray467[local186] = arg0.aShortArray16[local255] & 0xFFFF;
					this.anIntArray469[local186] = arg0.aShortArray21[local255] & 0xFFFF;
					this.anIntArray471[local186] = arg0.aShortArray22[local255] & 0xFFFF;
					local184[local255] = local186++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray68 = new byte[this.anInt5292];
			for (local255 = 0; local255 < this.anInt5292; local255++) {
				if (arg0.aByteArray22[local255] == -1) {
					this.aByteArray68[local255] = -1;
				} else {
					this.aByteArray68[local255] = (byte) local184[arg0.aByteArray22[local255] & 0xFF];
					if (this.aByteArray68[local255] == -1 && this.aShortArray81 != null) {
						this.aShortArray81[local255] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt5292; local140++) {
			@Pc(373) byte local373;
			if (arg0.aByteArray21 == null) {
				local373 = 0;
			} else {
				local373 = arg0.aByteArray21[local140];
			}
			@Pc(384) byte local384;
			if (arg0.aByteArray26 == null) {
				local384 = 0;
			} else {
				local384 = arg0.aByteArray26[local140];
			}
			@Pc(395) short local395;
			if (this.aShortArray81 == null) {
				local395 = -1;
			} else {
				local395 = this.aShortArray81[local140];
			}
			if (local384 == -2) {
				local373 = 3;
			}
			if (local384 == -1) {
				local373 = 2;
			}
			@Pc(442) Class151 local442;
			@Pc(475) int local475;
			@Pc(621) Class123 local621;
			if (local395 == -1) {
				if (local373 == 0) {
					@Pc(423) int local423 = arg0.aShortArray18[local140] & 0xFFFF;
					if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray472[local140]] == null) {
						local442 = arg0.aClass151Array1[this.anIntArray472[local140]];
					} else {
						local442 = arg0.aClass151Array2[this.anIntArray472[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774) << 17;
					this.anIntArray474[local140] = local475 | Static271.method4128(local423, local475 >> 17);
					if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray479[local140]] == null) {
						local442 = arg0.aClass151Array1[this.anIntArray479[local140]];
					} else {
						local442 = arg0.aClass151Array2[this.anIntArray479[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774) << 17;
					this.anIntArray470[local140] = local475 | Static271.method4128(local423, local475 >> 17);
					if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray476[local140]] == null) {
						local442 = arg0.aClass151Array1[this.anIntArray476[local140]];
					} else {
						local442 = arg0.aClass151Array2[this.anIntArray476[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774) << 17;
					this.anIntArray468[local140] = local475 | Static271.method4128(local423, local475 >> 17);
				} else if (local373 == 1) {
					local621 = arg0.aClass123Array1[local140];
					local475 = arg1 + (arg3 * local621.anInt3930 + arg4 * local621.anInt3928 + arg5 * local621.anInt3926) / (local115 + local115 / 2) << 17;
					this.anIntArray474[local140] = local475 | Static271.method4128(arg0.aShortArray18[local140] & 0xFFFF, local475 >> 17);
					this.anIntArray468[local140] = -1;
				} else if (local373 == 3) {
					this.anIntArray474[local140] = 128;
					this.anIntArray468[local140] = -1;
				} else {
					this.anIntArray468[local140] = -2;
				}
			} else if (local373 == 0) {
				if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray472[local140]] == null) {
					local442 = arg0.aClass151Array1[this.anIntArray472[local140]];
				} else {
					local442 = arg0.aClass151Array2[this.anIntArray472[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774);
				this.anIntArray474[local140] = Static271.method4141(local475);
				if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray479[local140]] == null) {
					local442 = arg0.aClass151Array1[this.anIntArray479[local140]];
				} else {
					local442 = arg0.aClass151Array2[this.anIntArray479[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774);
				this.anIntArray470[local140] = Static271.method4141(local475);
				if (arg0.aClass151Array2 == null || arg0.aClass151Array2[this.anIntArray476[local140]] == null) {
					local442 = arg0.aClass151Array1[this.anIntArray476[local140]];
				} else {
					local442 = arg0.aClass151Array2[this.anIntArray476[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4775 + arg4 * local442.anInt4776 + arg5 * local442.anInt4770) / (local115 * local442.anInt4774);
				this.anIntArray468[local140] = Static271.method4141(local475);
			} else if (local373 == 1) {
				local621 = arg0.aClass123Array1[local140];
				local475 = arg1 + (arg3 * local621.anInt3930 + arg4 * local621.anInt3928 + arg5 * local621.anInt3926) / (local115 + local115 / 2);
				this.anIntArray474[local140] = Static271.method4141(local475);
				this.anIntArray468[local140] = -1;
			} else {
				this.anIntArray468[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "([Lclient!um;I)V")
	private Class14_Sub6_Sub2(@OriginalArg(0) Class14_Sub6_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt5291 = 0;
		this.anInt5292 = 0;
		this.anInt5293 = 0;
		this.aByte23 = -1;
		@Pc(48) int local48;
		@Pc(55) Class14_Sub6_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt5291 += local55.anInt5291;
				this.anInt5292 += local55.anInt5292;
				this.anInt5293 += local55.anInt5293;
				if (local55.aByteArray69 == null) {
					if (this.aByte23 == -1) {
						this.aByte23 = local55.aByte23;
					}
					if (this.aByte23 != local55.aByte23) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray70 != null;
				local28 |= local55.aShortArray81 != null;
				local30 |= local55.aByteArray68 != null;
			}
		}
		this.anIntArray473 = new int[this.anInt5291];
		this.anIntArray475 = new int[this.anInt5291];
		this.anIntArray466 = new int[this.anInt5291];
		this.anIntArray472 = new int[this.anInt5292];
		this.anIntArray479 = new int[this.anInt5292];
		this.anIntArray476 = new int[this.anInt5292];
		this.anIntArray474 = new int[this.anInt5292];
		this.anIntArray470 = new int[this.anInt5292];
		this.anIntArray468 = new int[this.anInt5292];
		if (local24) {
			this.aByteArray69 = new byte[this.anInt5292];
		}
		if (local26) {
			this.aByteArray70 = new byte[this.anInt5292];
		}
		if (local28) {
			this.aShortArray81 = new short[this.anInt5292];
		}
		if (local30) {
			this.aByteArray68 = new byte[this.anInt5292];
		}
		if (this.anInt5293 > 0) {
			this.anIntArray467 = new int[this.anInt5293];
			this.anIntArray469 = new int[this.anInt5293];
			this.anIntArray471 = new int[this.anInt5293];
		}
		this.aShortArray83 = new short[this.anInt5292];
		this.anInt5291 = 0;
		this.anInt5292 = 0;
		this.anInt5293 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(254) int local254;
				for (local254 = 0; local254 < local55.anInt5292; local254++) {
					this.anIntArray472[this.anInt5292] = local55.anIntArray472[local254] + this.anInt5291;
					this.anIntArray479[this.anInt5292] = local55.anIntArray479[local254] + this.anInt5291;
					this.anIntArray476[this.anInt5292] = local55.anIntArray476[local254] + this.anInt5291;
					this.anIntArray474[this.anInt5292] = local55.anIntArray474[local254];
					this.anIntArray470[this.anInt5292] = local55.anIntArray470[local254];
					this.anIntArray468[this.anInt5292] = local55.anIntArray468[local254];
					this.aShortArray83[this.anInt5292] = local55.aShortArray83[local254];
					if (local24) {
						if (local55.aByteArray69 == null) {
							this.aByteArray69[this.anInt5292] = local55.aByte23;
						} else {
							this.aByteArray69[this.anInt5292] = local55.aByteArray69[local254];
						}
					}
					if (local26 && local55.aByteArray70 != null) {
						this.aByteArray70[this.anInt5292] = local55.aByteArray70[local254];
					}
					if (local28) {
						if (local55.aShortArray81 == null) {
							this.aShortArray81[this.anInt5292] = -1;
						} else {
							this.aShortArray81[this.anInt5292] = local55.aShortArray81[local254];
						}
					}
					if (local30) {
						this.aByteArray68[this.anInt5292] = (byte) (local55.aByteArray68 == null || local55.aByteArray68[local254] == -1 ? -1 : local55.aByteArray68[local254] + this.anInt5293);
					}
					this.anInt5292++;
				}
				for (local254 = 0; local254 < local55.anInt5293; local254++) {
					if (local55.anIntArray467[local254] < local55.anInt5294) {
						this.anIntArray467[this.anInt5293] = local55.anIntArray467[local254] + this.anInt5291;
					}
					if (local55.anIntArray469[local254] < local55.anInt5294) {
						this.anIntArray469[this.anInt5293] = local55.anIntArray469[local254] + this.anInt5291;
					}
					if (local55.anIntArray471[local254] < local55.anInt5294) {
						this.anIntArray471[this.anInt5293] = local55.anIntArray471[local254] + this.anInt5291;
					}
					this.anInt5293++;
				}
				for (local254 = 0; local254 < local55.anInt5294; local254++) {
					this.anIntArray473[this.anInt5291] = local55.anIntArray473[local254];
					this.anIntArray475[this.anInt5291] = local55.anIntArray475[local254];
					this.anIntArray466[this.anInt5291] = local55.anIntArray466[local254];
					this.anInt5291++;
				}
			}
		}
		local48 = 0;
		this.anInt5294 = this.anInt5291;
		for (@Pc(543) int local543 = 0; local543 < arg1; local543++) {
			@Pc(550) Class14_Sub6_Sub2 local550 = arg0[local543];
			if (local550 != null) {
				@Pc(554) int local554;
				for (local554 = 0; local554 < local550.anInt5293; local554++) {
					if (local550.anIntArray467[local554] >= local550.anInt5294) {
						this.anIntArray467[local48] = local550.anIntArray467[local554] + this.anInt5291 - local550.anInt5294;
					}
					if (local550.anIntArray469[local554] >= local550.anInt5294) {
						this.anIntArray469[local48] = local550.anIntArray469[local554] + this.anInt5291 - local550.anInt5294;
					}
					if (local550.anIntArray471[local554] >= local550.anInt5294) {
						this.anIntArray471[local48] = local550.anIntArray471[local554] + this.anInt5291 - local550.anInt5294;
					}
					local48++;
				}
				for (local554 = local550.anInt5294; local554 < local550.anInt5291; local554++) {
					this.anIntArray473[this.anInt5291] = local550.anIntArray473[local554];
					this.anIntArray475[this.anInt5291] = local550.anIntArray475[local554];
					this.anIntArray466[this.anInt5291] = local550.anIntArray466[local554];
					this.anInt5291++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "()I")
	@Override
	public int method4123() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "()I")
	@Override
	public int method4102() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "()V")
	@Override
	public void method4106() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5291; local1++) {
			@Pc(10) int local10 = this.anIntArray466[local1];
			this.anIntArray466[local1] = this.anIntArray473[local1];
			this.anIntArray473[local1] = -local10;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "()I")
	@Override
	public int method4122() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	private void method4130(@OriginalArg(0) int arg0) {
		if (Static271.aBooleanArray49[arg0]) {
			this.method4132(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray472[arg0];
		@Pc(17) int local17 = this.anIntArray479[arg0];
		@Pc(22) int local22 = this.anIntArray476[arg0];
		Static110.aBoolean181 = Static271.aBooleanArray48[arg0];
		if (this.aByteArray70 == null) {
			Static110.anInt2555 = 0;
		} else {
			Static110.anInt2555 = this.aByteArray70[arg0] & 0xFF;
		}
		if (this.aShortArray81 != null && this.aShortArray81[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray68 == null || this.aByteArray68[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray68[arg0] & 0xFF;
				local141 = this.anIntArray467[local136];
				local146 = this.anIntArray469[local136];
				local151 = this.anIntArray471[local136];
			}
			if (this.anIntArray468[arg0] == -1) {
				Static110.method2037(Static271.anIntArray500[local12], Static271.anIntArray500[local17], Static271.anIntArray500[local22], Static271.anIntArray498[local12], Static271.anIntArray498[local17], Static271.anIntArray498[local22], this.anIntArray474[arg0], this.anIntArray474[arg0], this.anIntArray474[arg0], Static271.anIntArray489[local141], Static271.anIntArray489[local146], Static271.anIntArray489[local151], Static271.anIntArray493[local141], Static271.anIntArray493[local146], Static271.anIntArray493[local151], Static271.anIntArray503[local141], Static271.anIntArray503[local146], Static271.anIntArray503[local151], this.aShortArray81[arg0]);
			} else {
				Static110.method2037(Static271.anIntArray500[local12], Static271.anIntArray500[local17], Static271.anIntArray500[local22], Static271.anIntArray498[local12], Static271.anIntArray498[local17], Static271.anIntArray498[local22], this.anIntArray474[arg0], this.anIntArray470[arg0], this.anIntArray468[arg0], Static271.anIntArray489[local141], Static271.anIntArray489[local146], Static271.anIntArray489[local151], Static271.anIntArray493[local141], Static271.anIntArray493[local146], Static271.anIntArray493[local151], Static271.anIntArray503[local141], Static271.anIntArray503[local146], Static271.anIntArray503[local151], this.aShortArray81[arg0]);
			}
		} else if (this.anIntArray468[arg0] == -1) {
			Static110.method2023(Static271.anIntArray500[local12], Static271.anIntArray500[local17], Static271.anIntArray500[local22], Static271.anIntArray498[local12], Static271.anIntArray498[local17], Static271.anIntArray498[local22], Static110.anIntArray224[this.anIntArray474[arg0] & 0xFFFF]);
		} else {
			Static110.method2029(Static271.anIntArray500[local12], Static271.anIntArray500[local17], Static271.anIntArray500[local22], Static271.anIntArray498[local12], Static271.anIntArray498[local17], Static271.anIntArray498[local22], this.anIntArray474[arg0] & 0xFFFF, this.anIntArray470[arg0] & 0xFFFF, this.anIntArray468[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "()V")
	@Override
	protected void method4101() {
		if (this.aBoolean394) {
			this.method4142();
			this.aBoolean394 = false;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "()I")
	@Override
	public int method4114() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZLclient!um;[B[S[I[I[I)Lclient!q;")
	private Class14_Sub6 method4131(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class14_Sub6_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt5291 = this.anInt5291;
		arg2.anInt5294 = this.anInt5294;
		arg2.anInt5292 = this.anInt5292;
		arg2.anInt5293 = this.anInt5293;
		if (arg2.anIntArray473 == null || arg2.anIntArray473.length < this.anInt5291) {
			arg2.anIntArray473 = new int[this.anInt5291 + 100];
			arg2.anIntArray475 = new int[this.anInt5291 + 100];
			arg2.anIntArray466 = new int[this.anInt5291 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt5291; local47++) {
			arg2.anIntArray473[local47] = this.anIntArray473[local47];
			arg2.anIntArray475[local47] = this.anIntArray475[local47];
			arg2.anIntArray466[local47] = this.anIntArray466[local47];
		}
		if (arg0) {
			arg2.aByteArray70 = this.aByteArray70;
		} else {
			arg2.aByteArray70 = arg3;
			if (this.aByteArray70 == null) {
				for (local47 = 0; local47 < this.anInt5292; local47++) {
					arg2.aByteArray70[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt5292; local47++) {
					arg2.aByteArray70[local47] = this.aByteArray70[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray83 = this.aShortArray83;
			arg2.anIntArray474 = this.anIntArray474;
			arg2.anIntArray470 = this.anIntArray470;
			arg2.anIntArray468 = this.anIntArray468;
		} else {
			arg2.aShortArray83 = arg4;
			arg2.anIntArray474 = arg5;
			arg2.anIntArray470 = arg6;
			arg2.anIntArray468 = arg7;
			for (local47 = 0; local47 < this.anInt5292; local47++) {
				arg2.aShortArray83[local47] = this.aShortArray83[local47];
				arg2.anIntArray474[local47] = this.anIntArray474[local47];
				arg2.anIntArray470[local47] = this.anIntArray470[local47];
				arg2.anIntArray468[local47] = this.anIntArray468[local47];
			}
		}
		arg2.anIntArray472 = this.anIntArray472;
		arg2.anIntArray479 = this.anIntArray479;
		arg2.anIntArray476 = this.anIntArray476;
		arg2.aByteArray69 = this.aByteArray69;
		arg2.aByteArray68 = this.aByteArray68;
		arg2.aShortArray81 = this.aShortArray81;
		arg2.aByte23 = this.aByte23;
		arg2.anIntArray467 = this.anIntArray467;
		arg2.anIntArray469 = this.anIntArray469;
		arg2.anIntArray471 = this.anIntArray471;
		arg2.anIntArrayArray36 = this.anIntArrayArray36;
		arg2.anIntArrayArray37 = this.anIntArrayArray37;
		arg2.aShortArray82 = this.aShortArray82;
		arg2.aShortArray84 = this.aShortArray84;
		arg2.aBoolean393 = this.aBoolean393;
		arg2.aBoolean395 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static271.anInt5297 = 0;
			Static271.anInt5295 = 0;
			Static271.anInt5296 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray36.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray36[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local41]) != 0) {
							Static271.anInt5297 += this.anIntArray473[local41];
							Static271.anInt5295 += this.anIntArray475[local41];
							Static271.anInt5296 += this.anIntArray466[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static271.anInt5297 = Static271.anInt5297 / local6 + arg2;
				Static271.anInt5295 = Static271.anInt5295 / local6 + arg3;
				Static271.anInt5296 = Static271.anInt5296 / local6 + arg4;
				Static271.aBoolean397 = true;
			} else {
				Static271.anInt5297 = arg2;
				Static271.anInt5295 = arg3;
				Static271.anInt5296 = arg4;
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
				if (local14 < this.anIntArrayArray36.length) {
					local204 = this.anIntArrayArray36[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local33]) != 0) {
							this.anIntArray473[local33] += arg2;
							this.anIntArray475[local33] += arg3;
							this.anIntArray466[local33] += arg4;
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
					if (local14 < this.anIntArrayArray36.length) {
						local204 = this.anIntArrayArray36[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local33]) != 0) {
								this.anIntArray473[local33] -= Static271.anInt5297;
								this.anIntArray475[local33] -= Static271.anInt5295;
								this.anIntArray466[local33] -= Static271.anInt5296;
								if (arg4 != 0) {
									local41 = Class68.anIntArray229[arg4];
									local307 = Class68.anIntArray226[arg4];
									local329 = this.anIntArray475[local33] * local41 + this.anIntArray473[local33] * local307 + 32767 >> 16;
									this.anIntArray475[local33] = this.anIntArray475[local33] * local307 + 32767 - this.anIntArray473[local33] * local41 >> 16;
									this.anIntArray473[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class68.anIntArray229[arg2];
									local307 = Class68.anIntArray226[arg2];
									local329 = this.anIntArray475[local33] * local307 + 32767 - this.anIntArray466[local33] * local41 >> 16;
									this.anIntArray466[local33] = this.anIntArray475[local33] * local41 + this.anIntArray466[local33] * local307 + 32767 >> 16;
									this.anIntArray475[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class68.anIntArray229[arg3];
									local307 = Class68.anIntArray226[arg3];
									local329 = this.anIntArray466[local33] * local41 + this.anIntArray473[local33] * local307 + 32767 >> 16;
									this.anIntArray466[local33] = this.anIntArray466[local33] * local307 + 32767 - this.anIntArray473[local33] * local41 >> 16;
									this.anIntArray473[local33] = local329;
								}
								this.anIntArray473[local33] += Static271.anInt5297;
								this.anIntArray475[local33] += Static271.anInt5295;
								this.anIntArray466[local33] += Static271.anInt5296;
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
				if (Static271.aBoolean397) {
					local307 = arg7[0] * Static271.anInt5297 + arg7[3] * Static271.anInt5295 + arg7[6] * Static271.anInt5296 + 16384 >> 15;
					local329 = arg7[1] * Static271.anInt5297 + arg7[4] * Static271.anInt5295 + arg7[7] * Static271.anInt5296 + 16384 >> 15;
					local351 = arg7[2] * Static271.anInt5297 + arg7[5] * Static271.anInt5295 + arg7[8] * Static271.anInt5296 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static271.anInt5297 = local307;
					Static271.anInt5295 = local329;
					Static271.anInt5296 = local351;
					Static271.aBoolean397 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class68.anIntArray226[arg2] >> 1;
				local351 = Class68.anIntArray229[arg2] >> 1;
				local392 = Class68.anIntArray226[arg3] >> 1;
				local398 = Class68.anIntArray229[arg3] >> 1;
				local404 = Class68.anIntArray226[arg4] >> 1;
				local410 = Class68.anIntArray229[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static271.anInt5297 + local374[1] * -Static271.anInt5295 + local374[2] * -Static271.anInt5296 + 16384 >> 15;
				local579 = local374[3] * -Static271.anInt5297 + local374[4] * -Static271.anInt5295 + local374[5] * -Static271.anInt5296 + 16384 >> 15;
				local604 = local374[6] * -Static271.anInt5297 + local374[7] * -Static271.anInt5295 + local374[8] * -Static271.anInt5296 + 16384 >> 15;
				local608 = local554 + Static271.anInt5297;
				@Pc(612) int local612 = local579 + Static271.anInt5295;
				local616 = local604 + Static271.anInt5296;
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
					if (local893 < this.anIntArrayArray36.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray36[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray473[local913] + local753[1] * this.anIntArray475[local913] + local753[2] * this.anIntArray466[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray473[local913] + local753[4] * this.anIntArray475[local913] + local753[5] * this.anIntArray466[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray473[local913] + local753[7] * this.anIntArray475[local913] + local753[8] * this.anIntArray466[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray473[local913] = local1021;
								this.anIntArray475[local913] = local1025;
								this.anIntArray466[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray36.length) {
						local204 = this.anIntArrayArray36[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local33]) != 0) {
								this.anIntArray473[local33] -= Static271.anInt5297;
								this.anIntArray475[local33] -= Static271.anInt5295;
								this.anIntArray466[local33] -= Static271.anInt5296;
								this.anIntArray473[local33] = this.anIntArray473[local33] * arg2 / 128;
								this.anIntArray475[local33] = this.anIntArray475[local33] * arg3 / 128;
								this.anIntArray466[local33] = this.anIntArray466[local33] * arg4 / 128;
								this.anIntArray473[local33] += Static271.anInt5297;
								this.anIntArray475[local33] += Static271.anInt5295;
								this.anIntArray466[local33] += Static271.anInt5296;
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
				if (Static271.aBoolean397) {
					local307 = arg7[0] * Static271.anInt5297 + arg7[3] * Static271.anInt5295 + arg7[6] * Static271.anInt5296 + 16384 >> 15;
					local329 = arg7[1] * Static271.anInt5297 + arg7[4] * Static271.anInt5295 + arg7[7] * Static271.anInt5296 + 16384 >> 15;
					local351 = arg7[2] * Static271.anInt5297 + arg7[5] * Static271.anInt5295 + arg7[8] * Static271.anInt5296 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static271.anInt5297 = local307;
					Static271.anInt5295 = local329;
					Static271.anInt5296 = local351;
					Static271.aBoolean397 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static271.anInt5297 + 16384 >> 15;
				local398 = local329 * -Static271.anInt5295 + 16384 >> 15;
				local404 = local351 * -Static271.anInt5296 + 16384 >> 15;
				local410 = local392 + Static271.anInt5297;
				local418 = local398 + Static271.anInt5295;
				local426 = local404 + Static271.anInt5296;
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
					if (local631 < this.anIntArrayArray36.length) {
						local753 = this.anIntArrayArray36[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray473[local760] + local1628[1] * this.anIntArray475[local760] + local1628[2] * this.anIntArray466[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray473[local760] + local1628[4] * this.anIntArray475[local760] + local1628[5] * this.anIntArray466[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray473[local760] + local1628[7] * this.anIntArray475[local760] + local1628[8] * this.anIntArray466[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray473[local760] = local1896;
								this.anIntArray475[local760] = local1900;
								this.anIntArray466[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray70 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray37.length) {
						local204 = this.anIntArrayArray37[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local33]) != 0) {
								local41 = (this.aByteArray70[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray70[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray37 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray37.length) {
					local204 = this.anIntArrayArray37[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray84 == null || (arg6 & this.aShortArray84[local33]) != 0) {
							local41 = this.aShortArray83[local33] & 0xFFFF;
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
							this.aShortArray83[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean394 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method4117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static271.anInt5297 = 0;
			Static271.anInt5295 = 0;
			Static271.anInt5296 = 0;
			for (local11 = 0; local11 < this.anInt5291; local11++) {
				Static271.anInt5297 += this.anIntArray473[local11];
				Static271.anInt5295 += this.anIntArray475[local11];
				Static271.anInt5296 += this.anIntArray466[local11];
				local3++;
			}
			if (local3 > 0) {
				Static271.anInt5297 = Static271.anInt5297 / local3 + arg1;
				Static271.anInt5295 = Static271.anInt5295 / local3 + arg2;
				Static271.anInt5296 = Static271.anInt5296 / local3 + arg3;
			} else {
				Static271.anInt5297 = arg1;
				Static271.anInt5295 = arg2;
				Static271.anInt5296 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt5291; local3++) {
				this.anIntArray473[local3] += arg1;
				this.anIntArray475[local3] += arg2;
				this.anIntArray466[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt5291; local3++) {
					this.anIntArray473[local3] -= Static271.anInt5297;
					this.anIntArray475[local3] -= Static271.anInt5295;
					this.anIntArray466[local3] -= Static271.anInt5296;
					if (arg3 != 0) {
						local11 = Class68.anIntArray229[arg3];
						local146 = Class68.anIntArray226[arg3];
						local164 = this.anIntArray475[local3] * local11 + this.anIntArray473[local3] * local146 + 32767 >> 16;
						this.anIntArray475[local3] = this.anIntArray475[local3] * local146 + 32767 - this.anIntArray473[local3] * local11 >> 16;
						this.anIntArray473[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class68.anIntArray229[arg1];
						local146 = Class68.anIntArray226[arg1];
						local164 = this.anIntArray475[local3] * local146 + 32767 - this.anIntArray466[local3] * local11 >> 16;
						this.anIntArray466[local3] = this.anIntArray475[local3] * local11 + this.anIntArray466[local3] * local146 + 32767 >> 16;
						this.anIntArray475[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class68.anIntArray229[arg2];
						local146 = Class68.anIntArray226[arg2];
						local164 = this.anIntArray466[local3] * local11 + this.anIntArray473[local3] * local146 + 32767 >> 16;
						this.anIntArray466[local3] = this.anIntArray466[local3] * local146 + 32767 - this.anIntArray473[local3] * local11 >> 16;
						this.anIntArray473[local3] = local164;
					}
					this.anIntArray473[local3] += Static271.anInt5297;
					this.anIntArray475[local3] += Static271.anInt5295;
					this.anIntArray466[local3] += Static271.anInt5296;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt5291; local3++) {
					this.anIntArray473[local3] -= Static271.anInt5297;
					this.anIntArray475[local3] -= Static271.anInt5295;
					this.anIntArray466[local3] -= Static271.anInt5296;
					this.anIntArray473[local3] = this.anIntArray473[local3] * arg1 / 128;
					this.anIntArray475[local3] = this.anIntArray475[local3] * arg2 / 128;
					this.anIntArray466[local3] = this.anIntArray466[local3] * arg3 / 128;
					this.anIntArray473[local3] += Static271.anInt5297;
					this.anIntArray475[local3] += Static271.anInt5295;
					this.anIntArray466[local3] += Static271.anInt5296;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt5292; local3++) {
					local11 = (this.aByteArray70[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray70[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt5292; local3++) {
					local11 = this.aShortArray83[local3] & 0xFFFF;
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
					this.aShortArray83[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean394 = true;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(ZZZ)Lclient!q;")
	@Override
	public Class14_Sub6 method4118(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static271.aByteArray72.length < this.anInt5292) {
			Static271.aByteArray72 = new byte[this.anInt5292 + 100];
		}
		if (!arg1 && Static271.aShortArray86.length < this.anInt5292) {
			Static271.anIntArray482 = new int[this.anInt5292 + 100];
			Static271.anIntArray481 = new int[this.anInt5292 + 100];
			Static271.anIntArray483 = new int[this.anInt5292 + 100];
			Static271.aShortArray86 = new short[this.anInt5292 + 100];
		}
		return this.method4131(arg0, arg1, Static271.aClass14_Sub6_Sub2_2, Static271.aByteArray72, Static271.aShortArray86, Static271.anIntArray482, Static271.anIntArray481, Static271.anIntArray483);
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "()V")
	@Override
	public void method4111() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5291; local1++) {
			@Pc(10) int local10 = this.anIntArray473[local1];
			this.anIntArray473[local1] = this.anIntArray466[local1];
			this.anIntArray466[local1] = -local10;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static271.anInt5297 = 0;
			Static271.anInt5295 = 0;
			Static271.anInt5296 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray36.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray36[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static271.anInt5297 += this.anIntArray473[local41];
						Static271.anInt5295 += this.anIntArray475[local41];
						Static271.anInt5296 += this.anIntArray466[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static271.anInt5297 = Static271.anInt5297 / local6 + arg2;
				Static271.anInt5295 = Static271.anInt5295 / local6 + arg3;
				Static271.anInt5296 = Static271.anInt5296 / local6 + arg4;
			} else {
				Static271.anInt5297 = arg2;
				Static271.anInt5295 = arg3;
				Static271.anInt5296 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray36.length) {
					local117 = this.anIntArrayArray36[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray473[local33] += arg2;
						this.anIntArray475[local33] += arg3;
						this.anIntArray466[local33] += arg4;
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
				if (local14 < this.anIntArrayArray36.length) {
					local117 = this.anIntArrayArray36[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray473[local33] -= Static271.anInt5297;
						this.anIntArray475[local33] -= Static271.anInt5295;
						this.anIntArray466[local33] -= Static271.anInt5296;
						if (arg4 != 0) {
							local41 = Class68.anIntArray229[arg4];
							local222 = Class68.anIntArray226[arg4];
							local240 = this.anIntArray475[local33] * local41 + this.anIntArray473[local33] * local222 + 32767 >> 16;
							this.anIntArray475[local33] = this.anIntArray475[local33] * local222 + 32767 - this.anIntArray473[local33] * local41 >> 16;
							this.anIntArray473[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class68.anIntArray229[arg2];
							local222 = Class68.anIntArray226[arg2];
							local240 = this.anIntArray475[local33] * local222 + 32767 - this.anIntArray466[local33] * local41 >> 16;
							this.anIntArray466[local33] = this.anIntArray475[local33] * local41 + this.anIntArray466[local33] * local222 + 32767 >> 16;
							this.anIntArray475[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class68.anIntArray229[arg3];
							local222 = Class68.anIntArray226[arg3];
							local240 = this.anIntArray466[local33] * local41 + this.anIntArray473[local33] * local222 + 32767 >> 16;
							this.anIntArray466[local33] = this.anIntArray466[local33] * local222 + 32767 - this.anIntArray473[local33] * local41 >> 16;
							this.anIntArray473[local33] = local240;
						}
						this.anIntArray473[local33] += Static271.anInt5297;
						this.anIntArray475[local33] += Static271.anInt5295;
						this.anIntArray466[local33] += Static271.anInt5296;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray36.length) {
					local117 = this.anIntArrayArray36[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray473[local33] -= Static271.anInt5297;
						this.anIntArray475[local33] -= Static271.anInt5295;
						this.anIntArray466[local33] -= Static271.anInt5296;
						this.anIntArray473[local33] = this.anIntArray473[local33] * arg2 / 128;
						this.anIntArray475[local33] = this.anIntArray475[local33] * arg3 / 128;
						this.anIntArray466[local33] = this.anIntArray466[local33] * arg4 / 128;
						this.anIntArray473[local33] += Static271.anInt5297;
						this.anIntArray475[local33] += Static271.anInt5295;
						this.anIntArray466[local33] += Static271.anInt5296;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray70 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray37.length) {
						local117 = this.anIntArrayArray37[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray70[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray70[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray37 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray37.length) {
					local117 = this.anIntArrayArray37[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray83[local33] & 0xFFFF;
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
						this.aShortArray83[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean394 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
	private void method4132(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static110.anInt2551;
		@Pc(3) int local3 = Static110.anInt2554;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray472[arg0];
		@Pc(15) int local15 = this.anIntArray479[arg0];
		@Pc(20) int local20 = this.anIntArray476[arg0];
		@Pc(24) int local24 = Static271.anIntArray503[local10];
		@Pc(28) int local28 = Static271.anIntArray503[local15];
		@Pc(32) int local32 = Static271.anIntArray503[local20];
		if (this.aByteArray70 == null) {
			Static110.anInt2555 = 0;
		} else {
			Static110.anInt2555 = this.aByteArray70[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static271.anIntArray501[0] = Static271.anIntArray498[local10];
			Static271.anIntArray485[0] = Static271.anIntArray500[local10];
			local5++;
			Static271.anIntArray499[0] = this.anIntArray474[arg0] & 0xFFFF;
		} else {
			local75 = Static271.anIntArray489[local10];
			local79 = Static271.anIntArray493[local10];
			local86 = this.anIntArray474[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class68.anIntArray228[local32 - local24];
				Static271.anIntArray501[0] = local1 + (local75 + ((Static271.anIntArray489[local20] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[0] = local3 + (local79 + ((Static271.anIntArray493[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static271.anIntArray499[0] = local86 + (((this.anIntArray468[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class68.anIntArray228[local28 - local24];
				Static271.anIntArray501[local5] = local1 + (local75 + ((Static271.anIntArray489[local15] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[local5] = local3 + (local79 + ((Static271.anIntArray493[local15] - local79) * local99 >> 16) << 9) / 50;
				Static271.anIntArray499[local5++] = local86 + (((this.anIntArray470[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static271.anIntArray501[local5] = Static271.anIntArray498[local15];
			Static271.anIntArray485[local5] = Static271.anIntArray500[local15];
			Static271.anIntArray499[local5++] = this.anIntArray470[arg0] & 0xFFFF;
		} else {
			local75 = Static271.anIntArray489[local15];
			local79 = Static271.anIntArray493[local15];
			local86 = this.anIntArray470[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class68.anIntArray228[local24 - local28];
				Static271.anIntArray501[local5] = local1 + (local75 + ((Static271.anIntArray489[local10] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[local5] = local3 + (local79 + ((Static271.anIntArray493[local10] - local79) * local99 >> 16) << 9) / 50;
				Static271.anIntArray499[local5++] = local86 + (((this.anIntArray474[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class68.anIntArray228[local32 - local28];
				Static271.anIntArray501[local5] = local1 + (local75 + ((Static271.anIntArray489[local20] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[local5] = local3 + (local79 + ((Static271.anIntArray493[local20] - local79) * local99 >> 16) << 9) / 50;
				Static271.anIntArray499[local5++] = local86 + (((this.anIntArray468[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static271.anIntArray501[local5] = Static271.anIntArray498[local20];
			Static271.anIntArray485[local5] = Static271.anIntArray500[local20];
			Static271.anIntArray499[local5++] = this.anIntArray468[arg0] & 0xFFFF;
		} else {
			local75 = Static271.anIntArray489[local20];
			local79 = Static271.anIntArray493[local20];
			local86 = this.anIntArray468[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class68.anIntArray228[local28 - local32];
				Static271.anIntArray501[local5] = local1 + (local75 + ((Static271.anIntArray489[local15] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[local5] = local3 + (local79 + ((Static271.anIntArray493[local15] - local79) * local99 >> 16) << 9) / 50;
				Static271.anIntArray499[local5++] = local86 + (((this.anIntArray470[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class68.anIntArray228[local24 - local32];
				Static271.anIntArray501[local5] = local1 + (local75 + ((Static271.anIntArray489[local10] - local75) * local99 >> 16) << 9) / 50;
				Static271.anIntArray485[local5] = local3 + (local79 + ((Static271.anIntArray493[local10] - local79) * local99 >> 16) << 9) / 50;
				Static271.anIntArray499[local5++] = local86 + (((this.anIntArray474[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static271.anIntArray501[0];
		local79 = Static271.anIntArray501[1];
		local86 = Static271.anIntArray501[2];
		local99 = Static271.anIntArray485[0];
		@Pc(614) int local614 = Static271.anIntArray485[1];
		@Pc(618) int local618 = Static271.anIntArray485[2];
		Static110.aBoolean181 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static110.anInt2553 || local79 > Static110.anInt2553 || local86 > Static110.anInt2553) {
				Static110.aBoolean181 = true;
			}
			if (this.aShortArray81 != null && this.aShortArray81[arg0] != -1) {
				if (this.aByteArray68 == null || this.aByteArray68[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray68[arg0] & 0xFF;
					local709 = this.anIntArray467[local704];
					local714 = this.anIntArray469[local704];
					local719 = this.anIntArray471[local704];
				}
				if (this.anIntArray468[arg0] == -1) {
					Static110.method2037(local99, local614, local618, local75, local79, local86, this.anIntArray474[arg0], this.anIntArray474[arg0], this.anIntArray474[arg0], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], this.aShortArray81[arg0]);
				} else {
					Static110.method2037(local99, local614, local618, local75, local79, local86, Static271.anIntArray499[0], Static271.anIntArray499[1], Static271.anIntArray499[2], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], this.aShortArray81[arg0]);
				}
			} else if (this.anIntArray468[arg0] == -1) {
				Static110.method2023(local99, local614, local618, local75, local79, local86, Static110.anIntArray224[this.anIntArray474[arg0] & 0xFFFF]);
			} else {
				Static110.method2029(local99, local614, local618, local75, local79, local86, Static271.anIntArray499[0], Static271.anIntArray499[1], Static271.anIntArray499[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static110.anInt2553 || local79 > Static110.anInt2553 || local86 > Static110.anInt2553 || Static271.anIntArray501[3] < 0 || Static271.anIntArray501[3] > Static110.anInt2553) {
			Static110.aBoolean181 = true;
		}
		if (this.aShortArray81 != null && this.aShortArray81[arg0] != -1) {
			if (this.aByteArray68 == null || this.aByteArray68[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray68[arg0] & 0xFF;
				local709 = this.anIntArray467[local704];
				local714 = this.anIntArray469[local704];
				local719 = this.anIntArray471[local704];
			}
			@Pc(984) short local984 = this.aShortArray81[arg0];
			if (this.anIntArray468[arg0] == -1) {
				Static110.method2037(local99, local614, local618, local75, local79, local86, this.anIntArray474[arg0], this.anIntArray474[arg0], this.anIntArray474[arg0], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], local984);
				Static110.method2037(local99, local618, Static271.anIntArray485[3], local75, local86, Static271.anIntArray501[3], this.anIntArray474[arg0], this.anIntArray474[arg0], this.anIntArray474[arg0], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], local984);
			} else {
				Static110.method2037(local99, local614, local618, local75, local79, local86, Static271.anIntArray499[0], Static271.anIntArray499[1], Static271.anIntArray499[2], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], local984);
				Static110.method2037(local99, local618, Static271.anIntArray485[3], local75, local86, Static271.anIntArray501[3], Static271.anIntArray499[0], Static271.anIntArray499[2], Static271.anIntArray499[3], Static271.anIntArray489[local709], Static271.anIntArray489[local714], Static271.anIntArray489[local719], Static271.anIntArray493[local709], Static271.anIntArray493[local714], Static271.anIntArray493[local719], Static271.anIntArray503[local709], Static271.anIntArray503[local714], Static271.anIntArray503[local719], local984);
			}
		} else if (this.anIntArray468[arg0] == -1) {
			local709 = Static110.anIntArray224[this.anIntArray474[arg0] & 0xFFFF];
			Static110.method2023(local99, local614, local618, local75, local79, local86, local709);
			Static110.method2023(local99, local618, Static271.anIntArray485[3], local75, local86, Static271.anIntArray501[3], local709);
		} else {
			Static110.method2029(local99, local614, local618, local75, local79, local86, Static271.anIntArray499[0], Static271.anIntArray499[1], Static271.anIntArray499[2]);
			Static110.method2029(local99, local618, Static271.anIntArray485[3], local75, local86, Static271.anIntArray501[3], Static271.anIntArray499[0], Static271.anIntArray499[2], Static271.anIntArray499[3]);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method4133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZZ)Lclient!q;")
	@Override
	public Class14_Sub6 method4099(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static271.aByteArray73.length < this.anInt5292) {
			Static271.aByteArray73 = new byte[this.anInt5292 + 100];
		}
		if (!arg1 && Static271.aShortArray87.length < this.anInt5292) {
			Static271.anIntArray497 = new int[this.anInt5292 + 100];
			Static271.anIntArray486 = new int[this.anInt5292 + 100];
			Static271.anIntArray490 = new int[this.anInt5292 + 100];
			Static271.aShortArray87 = new short[this.anInt5292 + 100];
		}
		return this.method4131(arg0, arg1, Static271.aClass14_Sub6_Sub2_3, Static271.aByteArray73, Static271.aShortArray87, Static271.anIntArray497, Static271.anIntArray486, Static271.anIntArray490);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method4113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean395) {
				this.method4137();
			}
			@Pc(6) int local6 = Static110.anInt2551;
			@Pc(8) int local8 = Static110.anInt2554;
			@Pc(12) int local12 = Class68.anIntArray229[0];
			@Pc(16) int local16 = Class68.anIntArray226[0];
			@Pc(20) int local20 = Class68.anIntArray229[arg0];
			@Pc(24) int local24 = Class68.anIntArray226[arg0];
			@Pc(28) int local28 = Class68.anIntArray229[arg1];
			@Pc(32) int local32 = Class68.anIntArray226[arg1];
			@Pc(36) int local36 = Class68.anIntArray229[arg2];
			@Pc(40) int local40 = Class68.anIntArray226[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5291; local52++) {
				@Pc(61) int local61 = this.anIntArray473[local52];
				@Pc(66) int local66 = this.anIntArray475[local52];
				@Pc(71) int local71 = this.anIntArray466[local52];
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
				Static271.anIntArray494[local52] = local71 - local50;
				Static271.anIntArray498[local52] = local6 + (local61 << 9) / local71;
				Static271.anIntArray500[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt5293 > 0) {
					Static271.anIntArray489[local52] = local61;
					Static271.anIntArray493[local52] = local83;
					Static271.anIntArray503[local52] = local71;
				}
			}
			this.method4138(false, arg6 >= 0L, arg6, this.aShort36, this.aShort36 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!q;)Lclient!q;")
	public Class14_Sub6 method4135(@OriginalArg(0) Class14_Sub6 arg0) {
		return new Class14_Sub6_Sub2(new Class14_Sub6_Sub2[] { this, (Class14_Sub6_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(III)V")
	@Override
	public void method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5291; local1++) {
			this.anIntArray473[local1] = this.anIntArray473[local1] * arg0 / 128;
			this.anIntArray475[local1] = this.anIntArray475[local1] * arg1 / 128;
			this.anIntArray466[local1] = this.anIntArray466[local1] * arg2 / 128;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		if (!this.aBoolean395) {
			this.method4137();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort31 * arg2 + this.aShort33 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort31 * arg2 + this.aShort32 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort31 << 9;
		if (local78 / local38 <= Static169.anInt3630) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort31 << 9;
		if (local91 / local38 >= Static128.anInt2846) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort31 * arg1 + this.aShort33 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static209.anInt4169) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort31 * arg1 + this.aShort32 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static23.anInt474) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt5293 > 0;
		@Pc(172) int local172 = Static110.anInt2551;
		@Pc(174) int local174 = Static110.anInt2554;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class68.anIntArray229[arg0];
			local178 = Class68.anIntArray226[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static114.aBoolean186 && local53 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local53;
			} else {
				local204 = local91 / local53;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local53;
			} else {
				local223 = local146 / local53;
				local227 = local123 / local38;
			}
			if (Static298.anInt5620 >= local204 && Static298.anInt5620 <= local208 && Static264.anInt5179 >= local223 && Static264.anInt5179 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort37, this.aShort34, this.aShort37, this.aShort34, this.aShort37, this.aShort34, this.aShort37, this.aShort34 };
				@Pc(342) int[] local342 = new int[] { this.aShort38, this.aShort38, this.aShort35, this.aShort35, this.aShort38, this.aShort38, this.aShort35, this.aShort35 };
				@Pc(385) int[] local385 = new int[] { this.aShort32, this.aShort32, this.aShort32, this.aShort32, this.aShort33, this.aShort33, this.aShort33, this.aShort33 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(394) int local394 = local299[local387];
					@Pc(398) int local398 = local385[local387];
					@Pc(402) int local402 = local342[local387];
					@Pc(414) int local414;
					if (arg0 != 0) {
						local414 = local402 * local176 + local394 * local178 >> 16;
						local402 = local402 * local178 - local394 * local176 >> 16;
						local394 = local414;
					}
					local394 += arg5;
					local398 += arg6;
					local402 += arg7;
					local414 = local402 * arg3 + local394 * arg4 >> 16;
					local402 = local402 * arg4 - local394 * arg3 >> 16;
					local394 = local414;
					local414 = local398 * arg2 - local402 * arg1 >> 16;
					local402 = local398 * arg1 + local402 * arg2 >> 16;
					if (local402 > 0) {
						@Pc(490) int local490 = (local394 << 9) / local402;
						@Pc(496) int local496 = (local414 << 9) / local402;
						if (local490 < local204) {
							local204 = local490;
						}
						if (local490 > local208) {
							local208 = local490;
						}
						if (local496 < local223) {
							local223 = local496;
						}
						if (local496 > local227) {
							local227 = local496;
						}
					}
				}
				if (Static298.anInt5620 >= local204 && Static298.anInt5620 <= local208 && Static264.anInt5179 >= local223 && Static264.anInt5179 <= local227) {
					if (this.aBoolean393) {
						Static263.aLongArray10[Static139.anInt3026++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt5291; local204++) {
			local223 = this.anIntArray473[local204];
			local208 = this.anIntArray475[local204];
			local227 = this.anIntArray466[local204];
			@Pc(577) int local577;
			if (arg0 != 0) {
				local577 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local577;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local577 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local577;
			local577 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static271.anIntArray494[local204] = local227 - local24;
			if (local227 >= 50) {
				Static271.anIntArray498[local204] = local172 + (local223 << 9) / local227;
				Static271.anIntArray500[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static271.anIntArray498[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static271.anIntArray489[local204] = local223;
				Static271.anIntArray493[local204] = local577;
				Static271.anIntArray503[local204] = local227;
			}
		}
		try {
			this.method4138(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!um;")
	public Class14_Sub6_Sub2 method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean395) {
			this.method4137();
		}
		@Pc(9) int local9 = arg4 + this.aShort37;
		@Pc(14) int local14 = arg4 + this.aShort34;
		@Pc(19) int local19 = arg6 + this.aShort38;
		@Pc(24) int local24 = arg6 + this.aShort35;
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
		@Pc(150) Class14_Sub6_Sub2 local150;
		if (arg7) {
			local150 = new Class14_Sub6_Sub2();
			local150.anInt5291 = this.anInt5291;
			local150.anInt5294 = this.anInt5294;
			local150.anInt5292 = this.anInt5292;
			local150.anInt5293 = this.anInt5293;
			local150.anIntArray472 = this.anIntArray472;
			local150.anIntArray479 = this.anIntArray479;
			local150.anIntArray476 = this.anIntArray476;
			local150.anIntArray474 = this.anIntArray474;
			local150.anIntArray470 = this.anIntArray470;
			local150.anIntArray468 = this.anIntArray468;
			local150.aByteArray69 = this.aByteArray69;
			local150.aByteArray68 = this.aByteArray68;
			local150.aShortArray81 = this.aShortArray81;
			local150.aShortArray83 = this.aShortArray83;
			local150.aByteArray70 = this.aByteArray70;
			local150.aByte23 = this.aByte23;
			local150.anIntArray467 = this.anIntArray467;
			local150.anIntArray469 = this.anIntArray469;
			local150.anIntArray471 = this.anIntArray471;
			local150.anIntArrayArray36 = this.anIntArrayArray36;
			local150.anIntArrayArray37 = this.anIntArrayArray37;
			local150.aShortArray82 = this.aShortArray82;
			local150.aShortArray84 = this.aShortArray84;
			local150.aBoolean393 = this.aBoolean393;
			if (arg0 == 3) {
				local150.anIntArray473 = Static139.method2337(this.anIntArray473);
				local150.anIntArray475 = Static139.method2337(this.anIntArray475);
				local150.anIntArray466 = Static139.method2337(this.anIntArray466);
			} else {
				local150.anIntArray473 = this.anIntArray473;
				local150.anIntArray475 = new int[local150.anInt5291];
				local150.anIntArray466 = this.anIntArray466;
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
			for (local289 = 0; local289 < local150.anInt5294; local289++) {
				local300 = this.anIntArray473[local289] + arg4;
				local307 = this.anIntArray466[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray475[local289] = this.anIntArray475[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt5294; local289 < local150.anInt5291; local289++) {
				local300 = this.anIntArray473[local289] + arg4;
				local307 = this.anIntArray466[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray475[local289] = this.anIntArray475[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt5294; local289++) {
					local300 = (this.anIntArray475[local289] << 16) / this.aShort32;
					if (local300 < arg1) {
						local307 = this.anIntArray473[local289] + arg4;
						local311 = this.anIntArray466[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray475[local289] = this.anIntArray475[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray475[local289] = this.anIntArray475[local289];
					}
				}
				for (local289 = local150.anInt5294; local289 < local150.anInt5291; local289++) {
					local300 = (this.anIntArray475[local289] << 16) / this.aShort32;
					if (local300 < arg1) {
						local307 = this.anIntArray473[local289] + arg4;
						local311 = this.anIntArray466[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray475[local289] = this.anIntArray475[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray475[local289] = this.anIntArray475[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method4103(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort33 - this.aShort32;
				for (local300 = 0; local300 < this.anInt5294; local300++) {
					local307 = this.anIntArray473[local300] + arg4;
					local311 = this.anIntArray466[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray475[local300] = this.anIntArray475[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt5294; local300 < local150.anInt5291; local300++) {
					local307 = this.anIntArray473[local300] + arg4;
					local311 = this.anIntArray466[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray475[local300] = this.anIntArray475[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort33 - this.aShort32;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt5294; local300++) {
					local307 = this.anIntArray473[local300] + arg4;
					local311 = this.anIntArray466[local300] + arg6;
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
					local150.anIntArray475[local300] = ((this.anIntArray475[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt5294; local300 < local150.anInt5291; local300++) {
					local307 = this.anIntArray473[local300] + arg4;
					local311 = this.anIntArray466[local300] + arg6;
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
						local150.anIntArray475[local300] = ((this.anIntArray475[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean395 = false;
		return local150;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(III)V")
	@Override
	public void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5291; local1++) {
			this.anIntArray473[local1] += arg0;
			this.anIntArray475[local1] += arg1;
			this.anIntArray466[local1] += arg2;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	@Override
	public void method4115(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray229[arg0];
		@Pc(7) int local7 = Class68.anIntArray226[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5291; local9++) {
			@Pc(29) int local29 = this.anIntArray466[local9] * local3 + this.anIntArray473[local9] * local7 >> 16;
			this.anIntArray466[local9] = this.anIntArray466[local9] * local7 - this.anIntArray473[local9] * local3 >> 16;
			this.anIntArray473[local9] = local29;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "()V")
	private void method4137() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5294; local17++) {
			@Pc(26) int local26 = this.anIntArray473[local17];
			@Pc(31) int local31 = this.anIntArray475[local17];
			@Pc(36) int local36 = this.anIntArray466[local17];
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
		this.aShort37 = (short) local1;
		this.aShort34 = (short) local7;
		this.aShort32 = (short) local3;
		this.aShort33 = (short) local9;
		this.aShort38 = (short) local5;
		this.aShort35 = (short) local11;
		this.aShort31 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort36 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
	@Override
	public void method4126(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray229[arg0];
		@Pc(7) int local7 = Class68.anIntArray226[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5291; local9++) {
			@Pc(29) int local29 = this.anIntArray475[local9] * local3 + this.anIntArray473[local9] * local7 >> 16;
			this.anIntArray475[local9] = this.anIntArray475[local9] * local7 - this.anIntArray473[local9] * local3 >> 16;
			this.anIntArray473[local9] = local29;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ZZZ)Lclient!q;")
	@Override
	public Class14_Sub6 method4104(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static271.aByteArray71.length < this.anInt5292) {
			Static271.aByteArray71 = new byte[this.anInt5292 + 100];
		}
		if (!arg1 && Static271.aShortArray85.length < this.anInt5292) {
			Static271.anIntArray480 = new int[this.anInt5292 + 100];
			Static271.anIntArray478 = new int[this.anInt5292 + 100];
			Static271.anIntArray477 = new int[this.anInt5292 + 100];
			Static271.aShortArray85 = new short[this.anInt5292 + 100];
		}
		return this.method4131(arg0, arg1, Static271.aClass14_Sub6_Sub2_1, Static271.aByteArray71, Static271.aShortArray85, Static271.anIntArray480, Static271.anIntArray478, Static271.anIntArray477);
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "()Z")
	@Override
	protected boolean method4112() {
		if (this.anIntArrayArray36 == null) {
			return false;
		} else {
			Static271.anInt5297 = 0;
			Static271.anInt5295 = 0;
			Static271.anInt5296 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZJIILclient!sa;)V")
	private void method4138(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class86_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static271.aBoolean396) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray495[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray491[local11] = 0;
			}
			Static271.anInt5298 = 0;
		}
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(104) int local104;
		for (local11 = 0; local11 < this.anInt5292; local11++) {
			if (this.anIntArray468[local11] != -2) {
				local51 = this.anIntArray472[local11];
				local56 = this.anIntArray479[local11];
				local61 = this.anIntArray476[local11];
				local65 = Static271.anIntArray498[local51];
				local69 = Static271.anIntArray498[local56];
				@Pc(73) int local73 = Static271.anIntArray498[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static271.anIntArray489[local51];
					local92 = Static271.anIntArray489[local56];
					local96 = Static271.anIntArray489[local61];
					@Pc(100) int local100 = Static271.anIntArray493[local51];
					local104 = Static271.anIntArray493[local56];
					@Pc(108) int local108 = Static271.anIntArray493[local61];
					@Pc(112) int local112 = Static271.anIntArray503[local51];
					@Pc(116) int local116 = Static271.anIntArray503[local56];
					@Pc(120) int local120 = Static271.anIntArray503[local61];
					local88 -= local92;
					@Pc(128) int local128 = local96 - local92;
					@Pc(132) int local132 = local100 - local104;
					@Pc(136) int local136 = local108 - local104;
					@Pc(140) int local140 = local112 - local116;
					@Pc(144) int local144 = local120 - local116;
					@Pc(152) int local152 = local132 * local144 - local140 * local136;
					@Pc(160) int local160 = local140 * local128 - local88 * local144;
					@Pc(168) int local168 = local88 * local136 - local132 * local128;
					if (local92 * local152 + local104 * local160 + local116 * local168 > 0) {
						Static271.aBooleanArray49[local11] = true;
						if (Static271.aBoolean396) {
							anIntArray488[local5] = (Static271.anIntArray494[local51] + Static271.anIntArray494[local56] + Static271.anIntArray494[local61]) / 3;
							anIntArray496[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static271.anIntArray494[local51] + Static271.anIntArray494[local56] + Static271.anIntArray494[local61]) / 3 + arg3;
							if (anIntArray495[local224] < 64) {
								anIntArrayArray40[local224][anIntArray495[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray495[local224];
								if (local247 == 64) {
									if (Static271.anInt5298 == 512) {
										continue;
									}
									anIntArray495[local224] = local247 = Static271.anInt5298++ + 65;
								}
								local247 -= 65;
								anIntArrayArray38[local247][anIntArray491[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method4133(Static298.anInt5620 + Static110.anInt2551, Static264.anInt5179 + Static110.anInt2554, Static271.anIntArray500[local51], Static271.anIntArray500[local56], Static271.anIntArray500[local61], local65, local69, local73)) {
						Static263.aLongArray10[Static139.anInt3026++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static271.anIntArray500[local61] - Static271.anIntArray500[local56]) - (Static271.anIntArray500[local51] - Static271.anIntArray500[local56]) * (local73 - local69) > 0) {
						Static271.aBooleanArray49[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static110.anInt2553 && local69 <= Static110.anInt2553 && local73 <= Static110.anInt2553) {
							Static271.aBooleanArray48[local11] = false;
						} else {
							Static271.aBooleanArray48[local11] = true;
						}
						if (Static271.aBoolean396) {
							anIntArray488[local5] = (Static271.anIntArray494[local51] + Static271.anIntArray494[local56] + Static271.anIntArray494[local61]) / 3;
							anIntArray496[local5++] = local11;
						} else {
							local88 = (Static271.anIntArray494[local51] + Static271.anIntArray494[local56] + Static271.anIntArray494[local61]) / 3 + arg3;
							if (anIntArray495[local88] < 64) {
								anIntArrayArray40[local88][anIntArray495[local88]++] = local11;
							} else {
								local92 = anIntArray495[local88];
								if (local92 == 64) {
									if (Static271.anInt5298 == 512) {
										continue;
									}
									anIntArray495[local88] = local92 = Static271.anInt5298++ + 65;
								}
								local92 -= 65;
								anIntArrayArray38[local92][anIntArray491[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static271.aBoolean396) {
			Static118.method2114(local5 - 1, anIntArray488, anIntArray496, 0);
			if (this.aByteArray69 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method4130(anIntArray496[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static271.anIntArray502[local11] = 0;
				Static271.anIntArray492[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray496[local11];
				local56 = anIntArray488[local11];
				@Pc(523) byte local523 = this.aByteArray69[local51];
				local65 = Static271.anIntArray502[local523]++;
				Static271.anIntArrayArray39[local523][local65] = local51;
				if (local523 < 10) {
					Static271.anIntArray492[local523] += local56;
				} else if (local523 == 10) {
					Static271.anIntArray487[local65] = local56;
				} else {
					Static271.anIntArray484[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray69 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray495[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = anIntArrayArray40[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method4130(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray495[local11] - 64 - 1;
						local590 = anIntArrayArray38[local56];
						for (local65 = 0; local65 < anIntArray491[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method4130(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static271.anIntArray502[local11] = 0;
				Static271.anIntArray492[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray495[local11];
				@Pc(704) byte local704;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local590 = anIntArrayArray40[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray69[local69];
							local88 = Static271.anIntArray502[local704]++;
							Static271.anIntArrayArray39[local704][local88] = local69;
							if (local704 < 10) {
								Static271.anIntArray492[local704] += local11;
							} else if (local704 == 10) {
								Static271.anIntArray487[local88] = local11;
							} else {
								Static271.anIntArray484[local88] = local11;
							}
						} else {
							Static271.anIntArray504[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray495[local11] - 64 - 1;
					local590 = anIntArrayArray38[local56];
					for (local65 = 0; local65 < anIntArray491[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray69[local69];
							local88 = Static271.anIntArray502[local704]++;
							Static271.anIntArrayArray39[local704][local88] = local69;
							if (local704 < 10) {
								Static271.anIntArray492[local704] += local11;
							} else if (local704 == 10) {
								Static271.anIntArray487[local88] = local11;
							} else {
								Static271.anIntArray484[local88] = local11;
							}
						} else {
							Static271.anIntArray504[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static271.anIntArray502[1] > 0 || Static271.anIntArray502[2] > 0) {
			local11 = (Static271.anIntArray492[1] + Static271.anIntArray492[2]) / (Static271.anIntArray502[1] + Static271.anIntArray502[2]);
		}
		local51 = 0;
		if (Static271.anIntArray502[3] > 0 || Static271.anIntArray502[4] > 0) {
			local51 = (Static271.anIntArray492[3] + Static271.anIntArray492[4]) / (Static271.anIntArray502[3] + Static271.anIntArray502[4]);
		}
		local56 = 0;
		if (Static271.anIntArray502[6] > 0 || Static271.anIntArray502[8] > 0) {
			local56 = (Static271.anIntArray492[6] + Static271.anIntArray492[8]) / (Static271.anIntArray502[6] + Static271.anIntArray502[8]);
		}
		local65 = 0;
		local69 = Static271.anIntArray502[10];
		@Pc(928) int[] local928 = Static271.anIntArrayArray39[10];
		@Pc(930) int[] local930 = Static271.anIntArray487;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static271.anIntArray502[11];
			local928 = Static271.anIntArrayArray39[11];
			local930 = Static271.anIntArray484;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method4130(local928[local65++]);
				if (local65 == local69 && local928 != Static271.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static271.anIntArray502[11];
					local928 = Static271.anIntArrayArray39[11];
					local930 = Static271.anIntArray484;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method4130(local928[local65++]);
				if (local65 == local69 && local928 != Static271.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static271.anIntArray502[11];
					local928 = Static271.anIntArrayArray39[11];
					local930 = Static271.anIntArray484;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method4130(local928[local65++]);
				if (local65 == local69 && local928 != Static271.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static271.anIntArray502[11];
					local928 = Static271.anIntArrayArray39[11];
					local930 = Static271.anIntArray484;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static271.anIntArray502[local92];
			@Pc(1096) int[] local1096 = Static271.anIntArrayArray39[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method4130(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method4130(local928[local65++]);
			if (local65 == local69 && local928 != Static271.anIntArrayArray39[11]) {
				local65 = 0;
				local928 = Static271.anIntArrayArray39[11];
				local69 = Static271.anIntArray502[11];
				local930 = Static271.anIntArray484;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IIIIIIII)V")
	public void method4139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean395) {
				this.method4137();
			}
			@Pc(6) int local6 = Static110.anInt2551;
			@Pc(8) int local8 = Static110.anInt2554;
			@Pc(12) int local12 = Class68.anIntArray229[0];
			@Pc(16) int local16 = Class68.anIntArray226[0];
			@Pc(20) int local20 = Class68.anIntArray229[arg0];
			@Pc(24) int local24 = Class68.anIntArray226[arg0];
			@Pc(28) int local28 = Class68.anIntArray229[arg1];
			@Pc(32) int local32 = Class68.anIntArray226[arg1];
			@Pc(36) int local36 = Class68.anIntArray229[arg2];
			@Pc(40) int local40 = Class68.anIntArray226[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5291; local52++) {
				@Pc(61) int local61 = this.anIntArray473[local52];
				@Pc(66) int local66 = this.anIntArray475[local52];
				@Pc(71) int local71 = this.anIntArray466[local52];
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
				Static271.anIntArray494[local52] = local71 - local50;
				Static271.anIntArray498[local52] = local6 + (local61 << 9) / arg6;
				Static271.anIntArray500[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt5293 > 0) {
					Static271.anIntArray489[local52] = local61;
					Static271.anIntArray493[local52] = local83;
					Static271.anIntArray503[local52] = local71;
				}
			}
			this.method4138(false, false, 0L, this.aShort36, this.aShort36 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!um", name = "k", descriptor = "()I")
	@Override
	public int method4119() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray229[arg0];
		@Pc(7) int local7 = Class68.anIntArray226[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5291; local9++) {
			@Pc(29) int local29 = this.anIntArray475[local9] * local7 - this.anIntArray466[local9] * local3 >> 16;
			this.anIntArray466[local9] = this.anIntArray475[local9] * local3 + this.anIntArray466[local9] * local7 >> 16;
			this.anIntArray475[local9] = local29;
		}
		this.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "()V")
	private void method4142() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5292; local1++) {
			@Pc(15) short local15 = this.aShortArray81 == null ? -1 : this.aShortArray81[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray83[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray468[local1] == -1) {
					local38 = this.anIntArray474[local1] & 0xFFFE0000;
					this.anIntArray474[local1] = local38 | Static271.method4128(local25, local38 >> 17);
				} else if (this.anIntArray468[local1] != -2) {
					local38 = this.anIntArray474[local1] & 0xFFFE0000;
					this.anIntArray474[local1] = local38 | Static271.method4128(local25, local38 >> 17);
					local38 = this.anIntArray470[local1] & 0xFFFE0000;
					this.anIntArray470[local1] = local38 | Static271.method4128(local25, local38 >> 17);
					local38 = this.anIntArray468[local1] & 0xFFFE0000;
					this.anIntArray468[local1] = local38 | Static271.method4128(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "()I")
	@Override
	public int method4098() {
		if (!this.aBoolean395) {
			this.method4137();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "()V")
	@Override
	public void method4116() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5291; local1++) {
			this.anIntArray473[local1] = -this.anIntArray473[local1];
			this.anIntArray466[local1] = -this.anIntArray466[local1];
		}
		this.aBoolean395 = false;
	}
}
