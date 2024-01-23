import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!cj", name = "zb", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!cj", name = "kb", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!cj", name = "mb", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!cj", name = "Cb", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!cj", name = "Bb", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!cj", name = "Nb", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
	private int anInt731 = 0;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	private int anInt730 = 0;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
	public int anInt732 = 0;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
	private int anInt733 = 0;

	static {
		if (Static37.aBoolean59) {
			anIntArray103 = new int[4096];
			anIntArray95 = new int[4096];
		} else {
			anIntArray96 = new int[1600];
			anIntArrayArray13 = new int[1600][64];
			anIntArray105 = new int[32];
			anIntArrayArray14 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!pn;IIIII)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method3336();
		arg0.method3321();
		this.anInt732 = arg0.anInt4094;
		this.anInt733 = arg0.anInt4097;
		this.anIntArray84 = arg0.anIntArray371;
		this.anIntArray81 = arg0.anIntArray369;
		this.anIntArray77 = arg0.anIntArray363;
		this.anInt731 = arg0.anInt4096;
		this.anIntArray75 = arg0.anIntArray372;
		this.anIntArray79 = arg0.anIntArray365;
		this.anIntArray80 = arg0.anIntArray367;
		this.aByteArray16 = arg0.aByteArray53;
		this.aByteArray15 = arg0.aByteArray52;
		this.aByte7 = arg0.aByte17;
		this.aShortArray5 = arg0.aShortArray63;
		this.anIntArrayArray10 = arg0.anIntArrayArray32;
		this.anIntArrayArray11 = arg0.anIntArrayArray33;
		this.aShortArray4 = arg0.aShortArray69;
		this.aShortArray7 = arg0.aShortArray65;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray74 = new int[this.anInt731];
		this.anIntArray76 = new int[this.anInt731];
		this.anIntArray85 = new int[this.anInt731];
		@Pc(140) int local140;
		if (arg0.aShortArray68 == null) {
			this.aShortArray8 = null;
		} else {
			this.aShortArray8 = new short[this.anInt731];
			for (local140 = 0; local140 < this.anInt731; local140++) {
				@Pc(149) short local149 = arg0.aShortArray68[local140];
				if (local149 != -1 && Static204.anInterface2_1.method1976(local149)) {
					this.aShortArray8[local140] = local149;
				} else {
					this.aShortArray8[local140] = -1;
				}
			}
		}
		if (arg0.anInt4095 > 0 && arg0.aByteArray55 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt4095];
			@Pc(186) int local186;
			for (local186 = 0; local186 < this.anInt731; local186++) {
				if (arg0.aByteArray55[local186] != -1) {
					local184[arg0.aByteArray55[local186] & 0xFF]++;
				}
			}
			this.anInt730 = 0;
			for (local186 = 0; local186 < arg0.anInt4095; local186++) {
				if (local184[local186] > 0 && arg0.aByteArray57[local186] == 0) {
					this.anInt730++;
				}
			}
			this.anIntArray78 = new int[this.anInt730];
			this.anIntArray83 = new int[this.anInt730];
			this.anIntArray88 = new int[this.anInt730];
			local186 = 0;
			@Pc(255) int local255;
			for (local255 = 0; local255 < arg0.anInt4095; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray57[local255] == 0) {
					this.anIntArray78[local186] = arg0.aShortArray67[local255] & 0xFFFF;
					this.anIntArray83[local186] = arg0.aShortArray64[local255] & 0xFFFF;
					this.anIntArray88[local186] = arg0.aShortArray71[local255] & 0xFFFF;
					local184[local255] = local186++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray14 = new byte[this.anInt731];
			for (local255 = 0; local255 < this.anInt731; local255++) {
				if (arg0.aByteArray55[local255] == -1) {
					this.aByteArray14[local255] = -1;
				} else {
					this.aByteArray14[local255] = (byte) local184[arg0.aByteArray55[local255] & 0xFF];
					if (this.aByteArray14[local255] == -1 && this.aShortArray8 != null) {
						this.aShortArray8[local255] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt731; local140++) {
			@Pc(373) byte local373;
			if (arg0.aByteArray50 == null) {
				local373 = 0;
			} else {
				local373 = arg0.aByteArray50[local140];
			}
			@Pc(384) byte local384;
			if (arg0.aByteArray52 == null) {
				local384 = 0;
			} else {
				local384 = arg0.aByteArray52[local140];
			}
			@Pc(395) short local395;
			if (this.aShortArray8 == null) {
				local395 = -1;
			} else {
				local395 = this.aShortArray8[local140];
			}
			if (local384 == -2) {
				local373 = 3;
			}
			if (local384 == -1) {
				local373 = 2;
			}
			@Pc(442) Class124 local442;
			@Pc(475) int local475;
			@Pc(621) Class36 local621;
			if (local395 == -1) {
				if (local373 == 0) {
					@Pc(423) int local423 = arg0.aShortArray63[local140] & 0xFFFF;
					if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray75[local140]] == null) {
						local442 = arg0.aClass124Array2[this.anIntArray75[local140]];
					} else {
						local442 = arg0.aClass124Array1[this.anIntArray75[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797) << 17;
					this.anIntArray74[local140] = local475 | Static37.method612(local423, local475 >> 17);
					if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray79[local140]] == null) {
						local442 = arg0.aClass124Array2[this.anIntArray79[local140]];
					} else {
						local442 = arg0.aClass124Array1[this.anIntArray79[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797) << 17;
					this.anIntArray76[local140] = local475 | Static37.method612(local423, local475 >> 17);
					if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray80[local140]] == null) {
						local442 = arg0.aClass124Array2[this.anIntArray80[local140]];
					} else {
						local442 = arg0.aClass124Array1[this.anIntArray80[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797) << 17;
					this.anIntArray85[local140] = local475 | Static37.method612(local423, local475 >> 17);
				} else if (local373 == 1) {
					local621 = arg0.aClass36Array1[local140];
					local475 = arg1 + (arg3 * local621.anInt1080 + arg4 * local621.anInt1081 + arg5 * local621.anInt1086) / (local115 + local115 / 2) << 17;
					this.anIntArray74[local140] = local475 | Static37.method612(arg0.aShortArray63[local140] & 0xFFFF, local475 >> 17);
					this.anIntArray85[local140] = -1;
				} else if (local373 == 3) {
					this.anIntArray74[local140] = 128;
					this.anIntArray85[local140] = -1;
				} else {
					this.anIntArray85[local140] = -2;
				}
			} else if (local373 == 0) {
				if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray75[local140]] == null) {
					local442 = arg0.aClass124Array2[this.anIntArray75[local140]];
				} else {
					local442 = arg0.aClass124Array1[this.anIntArray75[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797);
				this.anIntArray74[local140] = Static37.method608(local475);
				if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray79[local140]] == null) {
					local442 = arg0.aClass124Array2[this.anIntArray79[local140]];
				} else {
					local442 = arg0.aClass124Array1[this.anIntArray79[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797);
				this.anIntArray76[local140] = Static37.method608(local475);
				if (arg0.aClass124Array1 == null || arg0.aClass124Array1[this.anIntArray80[local140]] == null) {
					local442 = arg0.aClass124Array2[this.anIntArray80[local140]];
				} else {
					local442 = arg0.aClass124Array1[this.anIntArray80[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3795 + arg4 * local442.anInt3798 + arg5 * local442.anInt3799) / (local115 * local442.anInt3797);
				this.anIntArray85[local140] = Static37.method608(local475);
			} else if (local373 == 1) {
				local621 = arg0.aClass36Array1[local140];
				local475 = arg1 + (arg3 * local621.anInt1080 + arg4 * local621.anInt1081 + arg5 * local621.anInt1086) / (local115 + local115 / 2);
				this.anIntArray74[local140] = Static37.method608(local475);
				this.anIntArray85[local140] = -1;
			} else {
				this.anIntArray85[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([Lclient!cj;I)V")
	private Class12_Sub2_Sub1(@OriginalArg(0) Class12_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt732 = 0;
		this.anInt731 = 0;
		this.anInt730 = 0;
		this.aByte7 = -1;
		@Pc(48) int local48;
		@Pc(55) Class12_Sub2_Sub1 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt732 += local55.anInt732;
				this.anInt731 += local55.anInt731;
				this.anInt730 += local55.anInt730;
				if (local55.aByteArray16 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local55.aByte7;
					}
					if (this.aByte7 != local55.aByte7) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray15 != null;
				local28 |= local55.aShortArray8 != null;
				local30 |= local55.aByteArray14 != null;
			}
		}
		this.anIntArray84 = new int[this.anInt732];
		this.anIntArray81 = new int[this.anInt732];
		this.anIntArray77 = new int[this.anInt732];
		this.anIntArray75 = new int[this.anInt731];
		this.anIntArray79 = new int[this.anInt731];
		this.anIntArray80 = new int[this.anInt731];
		this.anIntArray74 = new int[this.anInt731];
		this.anIntArray76 = new int[this.anInt731];
		this.anIntArray85 = new int[this.anInt731];
		if (local24) {
			this.aByteArray16 = new byte[this.anInt731];
		}
		if (local26) {
			this.aByteArray15 = new byte[this.anInt731];
		}
		if (local28) {
			this.aShortArray8 = new short[this.anInt731];
		}
		if (local30) {
			this.aByteArray14 = new byte[this.anInt731];
		}
		if (this.anInt730 > 0) {
			this.anIntArray78 = new int[this.anInt730];
			this.anIntArray83 = new int[this.anInt730];
			this.anIntArray88 = new int[this.anInt730];
		}
		this.aShortArray5 = new short[this.anInt731];
		this.anInt732 = 0;
		this.anInt731 = 0;
		this.anInt730 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(254) int local254;
				for (local254 = 0; local254 < local55.anInt731; local254++) {
					this.anIntArray75[this.anInt731] = local55.anIntArray75[local254] + this.anInt732;
					this.anIntArray79[this.anInt731] = local55.anIntArray79[local254] + this.anInt732;
					this.anIntArray80[this.anInt731] = local55.anIntArray80[local254] + this.anInt732;
					this.anIntArray74[this.anInt731] = local55.anIntArray74[local254];
					this.anIntArray76[this.anInt731] = local55.anIntArray76[local254];
					this.anIntArray85[this.anInt731] = local55.anIntArray85[local254];
					this.aShortArray5[this.anInt731] = local55.aShortArray5[local254];
					if (local24) {
						if (local55.aByteArray16 == null) {
							this.aByteArray16[this.anInt731] = local55.aByte7;
						} else {
							this.aByteArray16[this.anInt731] = local55.aByteArray16[local254];
						}
					}
					if (local26 && local55.aByteArray15 != null) {
						this.aByteArray15[this.anInt731] = local55.aByteArray15[local254];
					}
					if (local28) {
						if (local55.aShortArray8 == null) {
							this.aShortArray8[this.anInt731] = -1;
						} else {
							this.aShortArray8[this.anInt731] = local55.aShortArray8[local254];
						}
					}
					if (local30) {
						this.aByteArray14[this.anInt731] = (byte) (local55.aByteArray14 == null || local55.aByteArray14[local254] == -1 ? -1 : local55.aByteArray14[local254] + this.anInt730);
					}
					this.anInt731++;
				}
				for (local254 = 0; local254 < local55.anInt730; local254++) {
					if (local55.anIntArray78[local254] < local55.anInt733) {
						this.anIntArray78[this.anInt730] = local55.anIntArray78[local254] + this.anInt732;
					}
					if (local55.anIntArray83[local254] < local55.anInt733) {
						this.anIntArray83[this.anInt730] = local55.anIntArray83[local254] + this.anInt732;
					}
					if (local55.anIntArray88[local254] < local55.anInt733) {
						this.anIntArray88[this.anInt730] = local55.anIntArray88[local254] + this.anInt732;
					}
					this.anInt730++;
				}
				for (local254 = 0; local254 < local55.anInt733; local254++) {
					this.anIntArray84[this.anInt732] = local55.anIntArray84[local254];
					this.anIntArray81[this.anInt732] = local55.anIntArray81[local254];
					this.anIntArray77[this.anInt732] = local55.anIntArray77[local254];
					this.anInt732++;
				}
			}
		}
		local48 = 0;
		this.anInt733 = this.anInt732;
		for (@Pc(543) int local543 = 0; local543 < arg1; local543++) {
			@Pc(550) Class12_Sub2_Sub1 local550 = arg0[local543];
			if (local550 != null) {
				@Pc(554) int local554;
				for (local554 = 0; local554 < local550.anInt730; local554++) {
					if (local550.anIntArray78[local554] >= local550.anInt733) {
						this.anIntArray78[local48] = local550.anIntArray78[local554] + this.anInt732 - local550.anInt733;
					}
					if (local550.anIntArray83[local554] >= local550.anInt733) {
						this.anIntArray83[local48] = local550.anIntArray83[local554] + this.anInt732 - local550.anInt733;
					}
					if (local550.anIntArray88[local554] >= local550.anInt733) {
						this.anIntArray88[local48] = local550.anIntArray88[local554] + this.anInt732 - local550.anInt733;
					}
					local48++;
				}
				for (local554 = local550.anInt733; local554 < local550.anInt732; local554++) {
					this.anIntArray84[this.anInt732] = local550.anIntArray84[local554];
					this.anIntArray81[this.anInt732] = local550.anIntArray81[local554];
					this.anIntArray77[this.anInt732] = local550.anIntArray77[local554];
					this.anInt732++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZLclient!cj;[B[S[I[I[I)Lclient!uc;")
	private Class12_Sub2 method600(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class12_Sub2_Sub1 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt732 = this.anInt732;
		arg2.anInt733 = this.anInt733;
		arg2.anInt731 = this.anInt731;
		arg2.anInt730 = this.anInt730;
		if (arg2.anIntArray84 == null || arg2.anIntArray84.length < this.anInt732) {
			arg2.anIntArray84 = new int[this.anInt732 + 100];
			arg2.anIntArray81 = new int[this.anInt732 + 100];
			arg2.anIntArray77 = new int[this.anInt732 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt732; local47++) {
			arg2.anIntArray84[local47] = this.anIntArray84[local47];
			arg2.anIntArray81[local47] = this.anIntArray81[local47];
			arg2.anIntArray77[local47] = this.anIntArray77[local47];
		}
		if (arg0) {
			arg2.aByteArray15 = this.aByteArray15;
		} else {
			arg2.aByteArray15 = arg3;
			if (this.aByteArray15 == null) {
				for (local47 = 0; local47 < this.anInt731; local47++) {
					arg2.aByteArray15[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt731; local47++) {
					arg2.aByteArray15[local47] = this.aByteArray15[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray5 = this.aShortArray5;
			arg2.anIntArray74 = this.anIntArray74;
			arg2.anIntArray76 = this.anIntArray76;
			arg2.anIntArray85 = this.anIntArray85;
		} else {
			arg2.aShortArray5 = arg4;
			arg2.anIntArray74 = arg5;
			arg2.anIntArray76 = arg6;
			arg2.anIntArray85 = arg7;
			for (local47 = 0; local47 < this.anInt731; local47++) {
				arg2.aShortArray5[local47] = this.aShortArray5[local47];
				arg2.anIntArray74[local47] = this.anIntArray74[local47];
				arg2.anIntArray76[local47] = this.anIntArray76[local47];
				arg2.anIntArray85[local47] = this.anIntArray85[local47];
			}
		}
		arg2.anIntArray75 = this.anIntArray75;
		arg2.anIntArray79 = this.anIntArray79;
		arg2.anIntArray80 = this.anIntArray80;
		arg2.aByteArray16 = this.aByteArray16;
		arg2.aByteArray14 = this.aByteArray14;
		arg2.aShortArray8 = this.aShortArray8;
		arg2.aByte7 = this.aByte7;
		arg2.anIntArray78 = this.anIntArray78;
		arg2.anIntArray83 = this.anIntArray83;
		arg2.anIntArray88 = this.anIntArray88;
		arg2.anIntArrayArray10 = this.anIntArrayArray10;
		arg2.anIntArrayArray11 = this.anIntArrayArray11;
		arg2.aShortArray7 = this.aShortArray7;
		arg2.aShortArray4 = this.aShortArray4;
		arg2.aBoolean255 = this.aBoolean255;
		arg2.aBoolean56 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "()V")
	private void method601() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt731; local1++) {
			@Pc(15) short local15 = this.aShortArray8 == null ? -1 : this.aShortArray8[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray5[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray85[local1] == -1) {
					local38 = this.anIntArray74[local1] & 0xFFFE0000;
					this.anIntArray74[local1] = local38 | Static37.method612(local25, local38 >> 17);
				} else if (this.anIntArray85[local1] != -2) {
					local38 = this.anIntArray74[local1] & 0xFFFE0000;
					this.anIntArray74[local1] = local38 | Static37.method612(local25, local38 >> 17);
					local38 = this.anIntArray76[local1] & 0xFFFE0000;
					this.anIntArray76[local1] = local38 | Static37.method612(local25, local38 >> 17);
					local38 = this.anIntArray85[local1] & 0xFFFE0000;
					this.anIntArray85[local1] = local38 | Static37.method612(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	@Override
	public void method3162(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt732; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local3 + this.anIntArray84[local9] * local7 >> 16;
			this.anIntArray81[local9] = this.anIntArray81[local9] * local7 - this.anIntArray84[local9] * local3 >> 16;
			this.anIntArray84[local9] = local29;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		if (!this.aBoolean56) {
			this.method609();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort4 * arg2 + this.aShort9 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort4 * arg2 + this.aShort8 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort4 << 9;
		if (local78 / local38 <= Static61.anInt1159) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort4 << 9;
		if (local91 / local38 >= Static60.anInt1151) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort4 * arg1 + this.aShort9 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static93.anInt1922) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort4 * arg1 + this.aShort8 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static26.anInt481) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt730 > 0;
		@Pc(172) int local172 = Static204.anInt3986;
		@Pc(174) int local174 = Static204.anInt3985;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class131.anIntArray355[arg0];
			local178 = Class131.anIntArray353[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static241.aBoolean301 && local53 > 0) {
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
			if (Static202.anInt3932 >= local204 && Static202.anInt3932 <= local208 && Static238.anInt4596 >= local223 && Static238.anInt4596 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort10, this.aShort6, this.aShort10, this.aShort6, this.aShort10, this.aShort6, this.aShort10, this.aShort6 };
				@Pc(342) int[] local342 = new int[] { this.aShort7, this.aShort7, this.aShort5, this.aShort5, this.aShort7, this.aShort7, this.aShort5, this.aShort5 };
				@Pc(385) int[] local385 = new int[] { this.aShort8, this.aShort8, this.aShort8, this.aShort8, this.aShort9, this.aShort9, this.aShort9, this.aShort9 };
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
				if (Static202.anInt3932 >= local204 && Static202.anInt3932 <= local208 && Static238.anInt4596 >= local223 && Static238.anInt4596 <= local227) {
					if (this.aBoolean255) {
						Static110.aLongArray5[Static81.anInt4025++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt732; local204++) {
			local223 = this.anIntArray84[local204];
			local208 = this.anIntArray81[local204];
			local227 = this.anIntArray77[local204];
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
			Static37.anIntArray99[local204] = local227 - local24;
			if (local227 >= 50) {
				Static37.anIntArray106[local204] = local172 + (local223 << 9) / local227;
				Static37.anIntArray111[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static37.anIntArray106[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static37.anIntArray92[local204] = local223;
				Static37.anIntArray100[local204] = local577;
				Static37.anIntArray109[local204] = local227;
			}
		}
		try {
			this.method613(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(III)V")
	@Override
	public void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray84[local1] += arg0;
			this.anIntArray81[local1] += arg1;
			this.anIntArray77[local1] += arg2;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "()V")
	@Override
	public void method3164() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray84[local1] = -this.anIntArray84[local1];
			this.anIntArray77[local1] = -this.anIntArray77[local1];
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "()Z")
	@Override
	protected boolean method3143() {
		if (this.anIntArrayArray10 == null) {
			return false;
		} else {
			Static37.anInt737 = 0;
			Static37.anInt735 = 0;
			Static37.anInt734 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3154(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static37.aByteArray17.length < this.anInt731) {
			Static37.aByteArray17 = new byte[this.anInt731 + 100];
		}
		if (!arg1 && Static37.aShortArray6.length < this.anInt731) {
			Static37.anIntArray82 = new int[this.anInt731 + 100];
			Static37.anIntArray87 = new int[this.anInt731 + 100];
			Static37.anIntArray86 = new int[this.anInt731 + 100];
			Static37.aShortArray6 = new short[this.anInt731 + 100];
		}
		return this.method600(arg0, arg1, Static37.aClass12_Sub2_Sub1_1, Static37.aByteArray17, Static37.aShortArray6, Static37.anIntArray82, Static37.anIntArray87, Static37.anIntArray86);
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private void method602(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static204.anInt3986;
		@Pc(3) int local3 = Static204.anInt3985;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray75[arg0];
		@Pc(15) int local15 = this.anIntArray79[arg0];
		@Pc(20) int local20 = this.anIntArray80[arg0];
		@Pc(24) int local24 = Static37.anIntArray109[local10];
		@Pc(28) int local28 = Static37.anIntArray109[local15];
		@Pc(32) int local32 = Static37.anIntArray109[local20];
		if (this.aByteArray15 == null) {
			Static204.anInt3983 = 0;
		} else {
			Static204.anInt3983 = this.aByteArray15[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static37.anIntArray94[0] = Static37.anIntArray106[local10];
			Static37.anIntArray104[0] = Static37.anIntArray111[local10];
			local5++;
			Static37.anIntArray102[0] = this.anIntArray74[arg0] & 0xFFFF;
		} else {
			local75 = Static37.anIntArray92[local10];
			local79 = Static37.anIntArray100[local10];
			local86 = this.anIntArray74[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class131.anIntArray351[local32 - local24];
				Static37.anIntArray94[0] = local1 + (local75 + ((Static37.anIntArray92[local20] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[0] = local3 + (local79 + ((Static37.anIntArray100[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static37.anIntArray102[0] = local86 + (((this.anIntArray85[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class131.anIntArray351[local28 - local24];
				Static37.anIntArray94[local5] = local1 + (local75 + ((Static37.anIntArray92[local15] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[local5] = local3 + (local79 + ((Static37.anIntArray100[local15] - local79) * local99 >> 16) << 9) / 50;
				Static37.anIntArray102[local5++] = local86 + (((this.anIntArray76[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static37.anIntArray94[local5] = Static37.anIntArray106[local15];
			Static37.anIntArray104[local5] = Static37.anIntArray111[local15];
			Static37.anIntArray102[local5++] = this.anIntArray76[arg0] & 0xFFFF;
		} else {
			local75 = Static37.anIntArray92[local15];
			local79 = Static37.anIntArray100[local15];
			local86 = this.anIntArray76[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class131.anIntArray351[local24 - local28];
				Static37.anIntArray94[local5] = local1 + (local75 + ((Static37.anIntArray92[local10] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[local5] = local3 + (local79 + ((Static37.anIntArray100[local10] - local79) * local99 >> 16) << 9) / 50;
				Static37.anIntArray102[local5++] = local86 + (((this.anIntArray74[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class131.anIntArray351[local32 - local28];
				Static37.anIntArray94[local5] = local1 + (local75 + ((Static37.anIntArray92[local20] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[local5] = local3 + (local79 + ((Static37.anIntArray100[local20] - local79) * local99 >> 16) << 9) / 50;
				Static37.anIntArray102[local5++] = local86 + (((this.anIntArray85[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static37.anIntArray94[local5] = Static37.anIntArray106[local20];
			Static37.anIntArray104[local5] = Static37.anIntArray111[local20];
			Static37.anIntArray102[local5++] = this.anIntArray85[arg0] & 0xFFFF;
		} else {
			local75 = Static37.anIntArray92[local20];
			local79 = Static37.anIntArray100[local20];
			local86 = this.anIntArray85[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class131.anIntArray351[local28 - local32];
				Static37.anIntArray94[local5] = local1 + (local75 + ((Static37.anIntArray92[local15] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[local5] = local3 + (local79 + ((Static37.anIntArray100[local15] - local79) * local99 >> 16) << 9) / 50;
				Static37.anIntArray102[local5++] = local86 + (((this.anIntArray76[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class131.anIntArray351[local24 - local32];
				Static37.anIntArray94[local5] = local1 + (local75 + ((Static37.anIntArray92[local10] - local75) * local99 >> 16) << 9) / 50;
				Static37.anIntArray104[local5] = local3 + (local79 + ((Static37.anIntArray100[local10] - local79) * local99 >> 16) << 9) / 50;
				Static37.anIntArray102[local5++] = local86 + (((this.anIntArray74[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static37.anIntArray94[0];
		local79 = Static37.anIntArray94[1];
		local86 = Static37.anIntArray94[2];
		local99 = Static37.anIntArray104[0];
		@Pc(614) int local614 = Static37.anIntArray104[1];
		@Pc(618) int local618 = Static37.anIntArray104[2];
		Static204.aBoolean258 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static204.anInt3984 || local79 > Static204.anInt3984 || local86 > Static204.anInt3984) {
				Static204.aBoolean258 = true;
			}
			if (this.aShortArray8 != null && this.aShortArray8[arg0] != -1) {
				if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray14[arg0] & 0xFF;
					local709 = this.anIntArray78[local704];
					local714 = this.anIntArray83[local704];
					local719 = this.anIntArray88[local704];
				}
				if (this.anIntArray85[arg0] == -1) {
					Static204.method3230(local99, local614, local618, local75, local79, local86, this.anIntArray74[arg0], this.anIntArray74[arg0], this.anIntArray74[arg0], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], this.aShortArray8[arg0]);
				} else {
					Static204.method3230(local99, local614, local618, local75, local79, local86, Static37.anIntArray102[0], Static37.anIntArray102[1], Static37.anIntArray102[2], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], this.aShortArray8[arg0]);
				}
			} else if (this.anIntArray85[arg0] == -1) {
				Static204.method3227(local99, local614, local618, local75, local79, local86, Static204.anIntArray354[this.anIntArray74[arg0] & 0xFFFF]);
			} else {
				Static204.method3221(local99, local614, local618, local75, local79, local86, Static37.anIntArray102[0], Static37.anIntArray102[1], Static37.anIntArray102[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static204.anInt3984 || local79 > Static204.anInt3984 || local86 > Static204.anInt3984 || Static37.anIntArray94[3] < 0 || Static37.anIntArray94[3] > Static204.anInt3984) {
			Static204.aBoolean258 = true;
		}
		if (this.aShortArray8 != null && this.aShortArray8[arg0] != -1) {
			if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray14[arg0] & 0xFF;
				local709 = this.anIntArray78[local704];
				local714 = this.anIntArray83[local704];
				local719 = this.anIntArray88[local704];
			}
			@Pc(984) short local984 = this.aShortArray8[arg0];
			if (this.anIntArray85[arg0] == -1) {
				Static204.method3230(local99, local614, local618, local75, local79, local86, this.anIntArray74[arg0], this.anIntArray74[arg0], this.anIntArray74[arg0], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], local984);
				Static204.method3230(local99, local618, Static37.anIntArray104[3], local75, local86, Static37.anIntArray94[3], this.anIntArray74[arg0], this.anIntArray74[arg0], this.anIntArray74[arg0], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], local984);
			} else {
				Static204.method3230(local99, local614, local618, local75, local79, local86, Static37.anIntArray102[0], Static37.anIntArray102[1], Static37.anIntArray102[2], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], local984);
				Static204.method3230(local99, local618, Static37.anIntArray104[3], local75, local86, Static37.anIntArray94[3], Static37.anIntArray102[0], Static37.anIntArray102[2], Static37.anIntArray102[3], Static37.anIntArray92[local709], Static37.anIntArray92[local714], Static37.anIntArray92[local719], Static37.anIntArray100[local709], Static37.anIntArray100[local714], Static37.anIntArray100[local719], Static37.anIntArray109[local709], Static37.anIntArray109[local714], Static37.anIntArray109[local719], local984);
			}
		} else if (this.anIntArray85[arg0] == -1) {
			local709 = Static204.anIntArray354[this.anIntArray74[arg0] & 0xFFFF];
			Static204.method3227(local99, local614, local618, local75, local79, local86, local709);
			Static204.method3227(local99, local618, Static37.anIntArray104[3], local75, local86, Static37.anIntArray94[3], local709);
		} else {
			Static204.method3221(local99, local614, local618, local75, local79, local86, Static37.anIntArray102[0], Static37.anIntArray102[1], Static37.anIntArray102[2]);
			Static204.method3221(local99, local618, Static37.anIntArray104[3], local75, local86, Static37.anIntArray94[3], Static37.anIntArray102[0], Static37.anIntArray102[2], Static37.anIntArray102[3]);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static37.anInt737 = 0;
			Static37.anInt735 = 0;
			Static37.anInt734 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray10.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray10[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static37.anInt737 += this.anIntArray84[local41];
						Static37.anInt735 += this.anIntArray81[local41];
						Static37.anInt734 += this.anIntArray77[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static37.anInt737 = Static37.anInt737 / local6 + arg2;
				Static37.anInt735 = Static37.anInt735 / local6 + arg3;
				Static37.anInt734 = Static37.anInt734 / local6 + arg4;
			} else {
				Static37.anInt737 = arg2;
				Static37.anInt735 = arg3;
				Static37.anInt734 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray84[local33] += arg2;
						this.anIntArray81[local33] += arg3;
						this.anIntArray77[local33] += arg4;
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
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray84[local33] -= Static37.anInt737;
						this.anIntArray81[local33] -= Static37.anInt735;
						this.anIntArray77[local33] -= Static37.anInt734;
						if (arg4 != 0) {
							local41 = Class131.anIntArray355[arg4];
							local222 = Class131.anIntArray353[arg4];
							local240 = this.anIntArray81[local33] * local41 + this.anIntArray84[local33] * local222 + 32767 >> 16;
							this.anIntArray81[local33] = this.anIntArray81[local33] * local222 + 32767 - this.anIntArray84[local33] * local41 >> 16;
							this.anIntArray84[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class131.anIntArray355[arg2];
							local222 = Class131.anIntArray353[arg2];
							local240 = this.anIntArray81[local33] * local222 + 32767 - this.anIntArray77[local33] * local41 >> 16;
							this.anIntArray77[local33] = this.anIntArray81[local33] * local41 + this.anIntArray77[local33] * local222 + 32767 >> 16;
							this.anIntArray81[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class131.anIntArray355[arg3];
							local222 = Class131.anIntArray353[arg3];
							local240 = this.anIntArray77[local33] * local41 + this.anIntArray84[local33] * local222 + 32767 >> 16;
							this.anIntArray77[local33] = this.anIntArray77[local33] * local222 + 32767 - this.anIntArray84[local33] * local41 >> 16;
							this.anIntArray84[local33] = local240;
						}
						this.anIntArray84[local33] += Static37.anInt737;
						this.anIntArray81[local33] += Static37.anInt735;
						this.anIntArray77[local33] += Static37.anInt734;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray84[local33] -= Static37.anInt737;
						this.anIntArray81[local33] -= Static37.anInt735;
						this.anIntArray77[local33] -= Static37.anInt734;
						this.anIntArray84[local33] = this.anIntArray84[local33] * arg2 / 128;
						this.anIntArray81[local33] = this.anIntArray81[local33] * arg3 / 128;
						this.anIntArray77[local33] = this.anIntArray77[local33] * arg4 / 128;
						this.anIntArray84[local33] += Static37.anInt737;
						this.anIntArray81[local33] += Static37.anInt735;
						this.anIntArray77[local33] += Static37.anInt734;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray11 != null && this.aByteArray15 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray11.length) {
						local117 = this.anIntArrayArray11[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray15[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray15[local33] = (byte) local41;
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
						local41 = this.aShortArray5[local33] & 0xFFFF;
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
						this.aShortArray5[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean57 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static37.anInt737 = 0;
			Static37.anInt735 = 0;
			Static37.anInt734 = 0;
			for (local11 = 0; local11 < this.anInt732; local11++) {
				Static37.anInt737 += this.anIntArray84[local11];
				Static37.anInt735 += this.anIntArray81[local11];
				Static37.anInt734 += this.anIntArray77[local11];
				local3++;
			}
			if (local3 > 0) {
				Static37.anInt737 = Static37.anInt737 / local3 + arg1;
				Static37.anInt735 = Static37.anInt735 / local3 + arg2;
				Static37.anInt734 = Static37.anInt734 / local3 + arg3;
			} else {
				Static37.anInt737 = arg1;
				Static37.anInt735 = arg2;
				Static37.anInt734 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt732; local3++) {
				this.anIntArray84[local3] += arg1;
				this.anIntArray81[local3] += arg2;
				this.anIntArray77[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt732; local3++) {
					this.anIntArray84[local3] -= Static37.anInt737;
					this.anIntArray81[local3] -= Static37.anInt735;
					this.anIntArray77[local3] -= Static37.anInt734;
					if (arg3 != 0) {
						local11 = Class131.anIntArray355[arg3];
						local146 = Class131.anIntArray353[arg3];
						local164 = this.anIntArray81[local3] * local11 + this.anIntArray84[local3] * local146 + 32767 >> 16;
						this.anIntArray81[local3] = this.anIntArray81[local3] * local146 + 32767 - this.anIntArray84[local3] * local11 >> 16;
						this.anIntArray84[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class131.anIntArray355[arg1];
						local146 = Class131.anIntArray353[arg1];
						local164 = this.anIntArray81[local3] * local146 + 32767 - this.anIntArray77[local3] * local11 >> 16;
						this.anIntArray77[local3] = this.anIntArray81[local3] * local11 + this.anIntArray77[local3] * local146 + 32767 >> 16;
						this.anIntArray81[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class131.anIntArray355[arg2];
						local146 = Class131.anIntArray353[arg2];
						local164 = this.anIntArray77[local3] * local11 + this.anIntArray84[local3] * local146 + 32767 >> 16;
						this.anIntArray77[local3] = this.anIntArray77[local3] * local146 + 32767 - this.anIntArray84[local3] * local11 >> 16;
						this.anIntArray84[local3] = local164;
					}
					this.anIntArray84[local3] += Static37.anInt737;
					this.anIntArray81[local3] += Static37.anInt735;
					this.anIntArray77[local3] += Static37.anInt734;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt732; local3++) {
					this.anIntArray84[local3] -= Static37.anInt737;
					this.anIntArray81[local3] -= Static37.anInt735;
					this.anIntArray77[local3] -= Static37.anInt734;
					this.anIntArray84[local3] = this.anIntArray84[local3] * arg1 / 128;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg2 / 128;
					this.anIntArray77[local3] = this.anIntArray77[local3] * arg3 / 128;
					this.anIntArray84[local3] += Static37.anInt737;
					this.anIntArray81[local3] += Static37.anInt735;
					this.anIntArray77[local3] += Static37.anInt734;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt731; local3++) {
					local11 = (this.aByteArray15[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray15[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt731; local3++) {
					local11 = this.aShortArray5[local3] & 0xFFFF;
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
					this.aShortArray5[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean57 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean56) {
				this.method609();
			}
			@Pc(6) int local6 = Static204.anInt3986;
			@Pc(8) int local8 = Static204.anInt3985;
			@Pc(12) int local12 = Class131.anIntArray355[0];
			@Pc(16) int local16 = Class131.anIntArray353[0];
			@Pc(20) int local20 = Class131.anIntArray355[arg0];
			@Pc(24) int local24 = Class131.anIntArray353[arg0];
			@Pc(28) int local28 = Class131.anIntArray355[arg1];
			@Pc(32) int local32 = Class131.anIntArray353[arg1];
			@Pc(36) int local36 = Class131.anIntArray355[arg2];
			@Pc(40) int local40 = Class131.anIntArray353[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt732; local52++) {
				@Pc(61) int local61 = this.anIntArray84[local52];
				@Pc(66) int local66 = this.anIntArray81[local52];
				@Pc(71) int local71 = this.anIntArray77[local52];
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
				Static37.anIntArray99[local52] = local71 - local50;
				Static37.anIntArray106[local52] = local6 + (local61 << 9) / local71;
				Static37.anIntArray111[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt730 > 0) {
					Static37.anIntArray92[local52] = local61;
					Static37.anIntArray100[local52] = local83;
					Static37.anIntArray109[local52] = local71;
				}
			}
			this.method613(false, arg6 >= 0L, arg6, this.aShort3, this.aShort3 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIIII)V")
	public void method604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean56) {
				this.method609();
			}
			@Pc(6) int local6 = Static204.anInt3986;
			@Pc(8) int local8 = Static204.anInt3985;
			@Pc(12) int local12 = Class131.anIntArray355[0];
			@Pc(16) int local16 = Class131.anIntArray353[0];
			@Pc(20) int local20 = Class131.anIntArray355[arg0];
			@Pc(24) int local24 = Class131.anIntArray353[arg0];
			@Pc(28) int local28 = Class131.anIntArray355[arg1];
			@Pc(32) int local32 = Class131.anIntArray353[arg1];
			@Pc(36) int local36 = Class131.anIntArray355[arg2];
			@Pc(40) int local40 = Class131.anIntArray353[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt732; local52++) {
				@Pc(61) int local61 = this.anIntArray84[local52];
				@Pc(66) int local66 = this.anIntArray81[local52];
				@Pc(71) int local71 = this.anIntArray77[local52];
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
				Static37.anIntArray99[local52] = local71 - local50;
				Static37.anIntArray106[local52] = local6 + (local61 << 9) / arg6;
				Static37.anIntArray111[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt730 > 0) {
					Static37.anIntArray92[local52] = local61;
					Static37.anIntArray100[local52] = local83;
					Static37.anIntArray109[local52] = local71;
				}
			}
			this.method613(false, false, 0L, this.aShort3, this.aShort3 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	@Override
	public void method3158(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt732; local9++) {
			@Pc(29) int local29 = this.anIntArray81[local9] * local7 - this.anIntArray77[local9] * local3 >> 16;
			this.anIntArray77[local9] = this.anIntArray81[local9] * local3 + this.anIntArray77[local9] * local7 >> 16;
			this.anIntArray81[local9] = local29;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!cj;")
	public Class12_Sub2_Sub1 method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean56) {
			this.method609();
		}
		@Pc(9) int local9 = arg4 + this.aShort10;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort7;
		@Pc(24) int local24 = arg6 + this.aShort5;
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
		@Pc(150) Class12_Sub2_Sub1 local150;
		if (arg7) {
			local150 = new Class12_Sub2_Sub1();
			local150.anInt732 = this.anInt732;
			local150.anInt733 = this.anInt733;
			local150.anInt731 = this.anInt731;
			local150.anInt730 = this.anInt730;
			local150.anIntArray75 = this.anIntArray75;
			local150.anIntArray79 = this.anIntArray79;
			local150.anIntArray80 = this.anIntArray80;
			local150.anIntArray74 = this.anIntArray74;
			local150.anIntArray76 = this.anIntArray76;
			local150.anIntArray85 = this.anIntArray85;
			local150.aByteArray16 = this.aByteArray16;
			local150.aByteArray14 = this.aByteArray14;
			local150.aShortArray8 = this.aShortArray8;
			local150.aShortArray5 = this.aShortArray5;
			local150.aByteArray15 = this.aByteArray15;
			local150.aByte7 = this.aByte7;
			local150.anIntArray78 = this.anIntArray78;
			local150.anIntArray83 = this.anIntArray83;
			local150.anIntArray88 = this.anIntArray88;
			local150.anIntArrayArray10 = this.anIntArrayArray10;
			local150.anIntArrayArray11 = this.anIntArrayArray11;
			local150.aShortArray7 = this.aShortArray7;
			local150.aShortArray4 = this.aShortArray4;
			local150.aBoolean255 = this.aBoolean255;
			if (arg0 == 3) {
				local150.anIntArray84 = Static10.method176(this.anIntArray84);
				local150.anIntArray81 = Static10.method176(this.anIntArray81);
				local150.anIntArray77 = Static10.method176(this.anIntArray77);
			} else {
				local150.anIntArray84 = this.anIntArray84;
				local150.anIntArray81 = new int[local150.anInt732];
				local150.anIntArray77 = this.anIntArray77;
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
			for (local289 = 0; local289 < local150.anInt733; local289++) {
				local300 = this.anIntArray84[local289] + arg4;
				local307 = this.anIntArray77[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray81[local289] = this.anIntArray81[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt733; local289 < local150.anInt732; local289++) {
				local300 = this.anIntArray84[local289] + arg4;
				local307 = this.anIntArray77[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray81[local289] = this.anIntArray81[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt733; local289++) {
					local300 = (this.anIntArray81[local289] << 16) / this.aShort8;
					if (local300 < arg1) {
						local307 = this.anIntArray84[local289] + arg4;
						local311 = this.anIntArray77[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray81[local289] = this.anIntArray81[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray81[local289] = this.anIntArray81[local289];
					}
				}
				for (local289 = local150.anInt733; local289 < local150.anInt732; local289++) {
					local300 = (this.anIntArray81[local289] << 16) / this.aShort8;
					if (local300 < arg1) {
						local307 = this.anIntArray84[local289] + arg4;
						local311 = this.anIntArray77[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray81[local289] = this.anIntArray81[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray81[local289] = this.anIntArray81[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3168(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort9 - this.aShort8;
				for (local300 = 0; local300 < this.anInt733; local300++) {
					local307 = this.anIntArray84[local300] + arg4;
					local311 = this.anIntArray77[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray81[local300] = this.anIntArray81[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt733; local300 < local150.anInt732; local300++) {
					local307 = this.anIntArray84[local300] + arg4;
					local311 = this.anIntArray77[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray81[local300] = this.anIntArray81[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort9 - this.aShort8;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt733; local300++) {
					local307 = this.anIntArray84[local300] + arg4;
					local311 = this.anIntArray77[local300] + arg6;
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
					local150.anIntArray81[local300] = ((this.anIntArray81[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt733; local300 < local150.anInt732; local300++) {
					local307 = this.anIntArray84[local300] + arg4;
					local311 = this.anIntArray77[local300] + arg6;
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
						local150.anIntArray81[local300] = ((this.anIntArray81[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean56 = false;
		return local150;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3156(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static37.aByteArray18.length < this.anInt731) {
			Static37.aByteArray18 = new byte[this.anInt731 + 100];
		}
		if (!arg1 && Static37.aShortArray9.length < this.anInt731) {
			Static37.anIntArray90 = new int[this.anInt731 + 100];
			Static37.anIntArray89 = new int[this.anInt731 + 100];
			Static37.anIntArray91 = new int[this.anInt731 + 100];
			Static37.aShortArray9 = new short[this.anInt731 + 100];
		}
		return this.method600(arg0, arg1, Static37.aClass12_Sub2_Sub1_2, Static37.aByteArray18, Static37.aShortArray9, Static37.anIntArray90, Static37.anIntArray89, Static37.anIntArray91);
	}

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "()I")
	@Override
	public int method3146() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "()I")
	@Override
	public int method3160() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static37.anInt737 = 0;
			Static37.anInt735 = 0;
			Static37.anInt734 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray10.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray10[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local41]) != 0) {
							Static37.anInt737 += this.anIntArray84[local41];
							Static37.anInt735 += this.anIntArray81[local41];
							Static37.anInt734 += this.anIntArray77[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static37.anInt737 = Static37.anInt737 / local6 + arg2;
				Static37.anInt735 = Static37.anInt735 / local6 + arg3;
				Static37.anInt734 = Static37.anInt734 / local6 + arg4;
				Static37.aBoolean58 = true;
			} else {
				Static37.anInt737 = arg2;
				Static37.anInt735 = arg3;
				Static37.anInt734 = arg4;
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
				if (local14 < this.anIntArrayArray10.length) {
					local204 = this.anIntArrayArray10[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local33]) != 0) {
							this.anIntArray84[local33] += arg2;
							this.anIntArray81[local33] += arg3;
							this.anIntArray77[local33] += arg4;
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
					if (local14 < this.anIntArrayArray10.length) {
						local204 = this.anIntArrayArray10[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local33]) != 0) {
								this.anIntArray84[local33] -= Static37.anInt737;
								this.anIntArray81[local33] -= Static37.anInt735;
								this.anIntArray77[local33] -= Static37.anInt734;
								if (arg4 != 0) {
									local41 = Class131.anIntArray355[arg4];
									local307 = Class131.anIntArray353[arg4];
									local329 = this.anIntArray81[local33] * local41 + this.anIntArray84[local33] * local307 + 32767 >> 16;
									this.anIntArray81[local33] = this.anIntArray81[local33] * local307 + 32767 - this.anIntArray84[local33] * local41 >> 16;
									this.anIntArray84[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class131.anIntArray355[arg2];
									local307 = Class131.anIntArray353[arg2];
									local329 = this.anIntArray81[local33] * local307 + 32767 - this.anIntArray77[local33] * local41 >> 16;
									this.anIntArray77[local33] = this.anIntArray81[local33] * local41 + this.anIntArray77[local33] * local307 + 32767 >> 16;
									this.anIntArray81[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class131.anIntArray355[arg3];
									local307 = Class131.anIntArray353[arg3];
									local329 = this.anIntArray77[local33] * local41 + this.anIntArray84[local33] * local307 + 32767 >> 16;
									this.anIntArray77[local33] = this.anIntArray77[local33] * local307 + 32767 - this.anIntArray84[local33] * local41 >> 16;
									this.anIntArray84[local33] = local329;
								}
								this.anIntArray84[local33] += Static37.anInt737;
								this.anIntArray81[local33] += Static37.anInt735;
								this.anIntArray77[local33] += Static37.anInt734;
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
				if (Static37.aBoolean58) {
					local307 = arg7[0] * Static37.anInt737 + arg7[3] * Static37.anInt735 + arg7[6] * Static37.anInt734 + 16384 >> 15;
					local329 = arg7[1] * Static37.anInt737 + arg7[4] * Static37.anInt735 + arg7[7] * Static37.anInt734 + 16384 >> 15;
					local351 = arg7[2] * Static37.anInt737 + arg7[5] * Static37.anInt735 + arg7[8] * Static37.anInt734 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static37.anInt737 = local307;
					Static37.anInt735 = local329;
					Static37.anInt734 = local351;
					Static37.aBoolean58 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class131.anIntArray353[arg2] >> 1;
				local351 = Class131.anIntArray355[arg2] >> 1;
				local392 = Class131.anIntArray353[arg3] >> 1;
				local398 = Class131.anIntArray355[arg3] >> 1;
				local404 = Class131.anIntArray353[arg4] >> 1;
				local410 = Class131.anIntArray355[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static37.anInt737 + local374[1] * -Static37.anInt735 + local374[2] * -Static37.anInt734 + 16384 >> 15;
				local579 = local374[3] * -Static37.anInt737 + local374[4] * -Static37.anInt735 + local374[5] * -Static37.anInt734 + 16384 >> 15;
				local604 = local374[6] * -Static37.anInt737 + local374[7] * -Static37.anInt735 + local374[8] * -Static37.anInt734 + 16384 >> 15;
				local608 = local554 + Static37.anInt737;
				@Pc(612) int local612 = local579 + Static37.anInt735;
				local616 = local604 + Static37.anInt734;
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
					if (local893 < this.anIntArrayArray10.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray10[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray84[local913] + local753[1] * this.anIntArray81[local913] + local753[2] * this.anIntArray77[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray84[local913] + local753[4] * this.anIntArray81[local913] + local753[5] * this.anIntArray77[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray84[local913] + local753[7] * this.anIntArray81[local913] + local753[8] * this.anIntArray77[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray84[local913] = local1021;
								this.anIntArray81[local913] = local1025;
								this.anIntArray77[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray10.length) {
						local204 = this.anIntArrayArray10[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local33]) != 0) {
								this.anIntArray84[local33] -= Static37.anInt737;
								this.anIntArray81[local33] -= Static37.anInt735;
								this.anIntArray77[local33] -= Static37.anInt734;
								this.anIntArray84[local33] = this.anIntArray84[local33] * arg2 / 128;
								this.anIntArray81[local33] = this.anIntArray81[local33] * arg3 / 128;
								this.anIntArray77[local33] = this.anIntArray77[local33] * arg4 / 128;
								this.anIntArray84[local33] += Static37.anInt737;
								this.anIntArray81[local33] += Static37.anInt735;
								this.anIntArray77[local33] += Static37.anInt734;
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
				if (Static37.aBoolean58) {
					local307 = arg7[0] * Static37.anInt737 + arg7[3] * Static37.anInt735 + arg7[6] * Static37.anInt734 + 16384 >> 15;
					local329 = arg7[1] * Static37.anInt737 + arg7[4] * Static37.anInt735 + arg7[7] * Static37.anInt734 + 16384 >> 15;
					local351 = arg7[2] * Static37.anInt737 + arg7[5] * Static37.anInt735 + arg7[8] * Static37.anInt734 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static37.anInt737 = local307;
					Static37.anInt735 = local329;
					Static37.anInt734 = local351;
					Static37.aBoolean58 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static37.anInt737 + 16384 >> 15;
				local398 = local329 * -Static37.anInt735 + 16384 >> 15;
				local404 = local351 * -Static37.anInt734 + 16384 >> 15;
				local410 = local392 + Static37.anInt737;
				local418 = local398 + Static37.anInt735;
				local426 = local404 + Static37.anInt734;
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
					if (local631 < this.anIntArrayArray10.length) {
						local753 = this.anIntArrayArray10[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray84[local760] + local1628[1] * this.anIntArray81[local760] + local1628[2] * this.anIntArray77[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray84[local760] + local1628[4] * this.anIntArray81[local760] + local1628[5] * this.anIntArray77[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray84[local760] + local1628[7] * this.anIntArray81[local760] + local1628[8] * this.anIntArray77[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray84[local760] = local1896;
								this.anIntArray81[local760] = local1900;
								this.anIntArray77[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray11 != null && this.aByteArray15 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray11.length) {
						local204 = this.anIntArrayArray11[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray4 == null || (arg6 & this.aShortArray4[local33]) != 0) {
								local41 = (this.aByteArray15[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray15[local33] = (byte) local41;
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
						if (this.aShortArray4 == null || (arg6 & this.aShortArray4[local33]) != 0) {
							local41 = this.aShortArray5[local33] & 0xFFFF;
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
							this.aShortArray5[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean57 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "()V")
	private void method609() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt733; local17++) {
			@Pc(26) int local26 = this.anIntArray84[local17];
			@Pc(31) int local31 = this.anIntArray81[local17];
			@Pc(36) int local36 = this.anIntArray77[local17];
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
		this.aShort10 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort8 = (short) local3;
		this.aShort9 = (short) local9;
		this.aShort7 = (short) local5;
		this.aShort5 = (short) local11;
		this.aShort4 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort3 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean56 = true;
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "()V")
	@Override
	public void method3141() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			@Pc(10) int local10 = this.anIntArray84[local1];
			this.anIntArray84[local1] = this.anIntArray77[local1];
			this.anIntArray77[local1] = -local10;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)V")
	@Override
	public void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray84[local1] = this.anIntArray84[local1] * arg0 / 128;
			this.anIntArray81[local1] = this.anIntArray81[local1] * arg1 / 128;
			this.anIntArray77[local1] = this.anIntArray77[local1] * arg2 / 128;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	private void method611(@OriginalArg(0) int arg0) {
		if (Static37.aBooleanArray7[arg0]) {
			this.method602(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray75[arg0];
		@Pc(17) int local17 = this.anIntArray79[arg0];
		@Pc(22) int local22 = this.anIntArray80[arg0];
		Static204.aBoolean258 = Static37.aBooleanArray8[arg0];
		if (this.aByteArray15 == null) {
			Static204.anInt3983 = 0;
		} else {
			Static204.anInt3983 = this.aByteArray15[arg0] & 0xFF;
		}
		if (this.aShortArray8 != null && this.aShortArray8[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray14[arg0] & 0xFF;
				local141 = this.anIntArray78[local136];
				local146 = this.anIntArray83[local136];
				local151 = this.anIntArray88[local136];
			}
			if (this.anIntArray85[arg0] == -1) {
				Static204.method3230(Static37.anIntArray111[local12], Static37.anIntArray111[local17], Static37.anIntArray111[local22], Static37.anIntArray106[local12], Static37.anIntArray106[local17], Static37.anIntArray106[local22], this.anIntArray74[arg0], this.anIntArray74[arg0], this.anIntArray74[arg0], Static37.anIntArray92[local141], Static37.anIntArray92[local146], Static37.anIntArray92[local151], Static37.anIntArray100[local141], Static37.anIntArray100[local146], Static37.anIntArray100[local151], Static37.anIntArray109[local141], Static37.anIntArray109[local146], Static37.anIntArray109[local151], this.aShortArray8[arg0]);
			} else {
				Static204.method3230(Static37.anIntArray111[local12], Static37.anIntArray111[local17], Static37.anIntArray111[local22], Static37.anIntArray106[local12], Static37.anIntArray106[local17], Static37.anIntArray106[local22], this.anIntArray74[arg0], this.anIntArray76[arg0], this.anIntArray85[arg0], Static37.anIntArray92[local141], Static37.anIntArray92[local146], Static37.anIntArray92[local151], Static37.anIntArray100[local141], Static37.anIntArray100[local146], Static37.anIntArray100[local151], Static37.anIntArray109[local141], Static37.anIntArray109[local146], Static37.anIntArray109[local151], this.aShortArray8[arg0]);
			}
		} else if (this.anIntArray85[arg0] == -1) {
			Static204.method3227(Static37.anIntArray111[local12], Static37.anIntArray111[local17], Static37.anIntArray111[local22], Static37.anIntArray106[local12], Static37.anIntArray106[local17], Static37.anIntArray106[local22], Static204.anIntArray354[this.anIntArray74[arg0] & 0xFFFF]);
		} else {
			Static204.method3221(Static37.anIntArray111[local12], Static37.anIntArray111[local17], Static37.anIntArray111[local22], Static37.anIntArray106[local12], Static37.anIntArray106[local17], Static37.anIntArray106[local22], this.anIntArray74[arg0] & 0xFFFF, this.anIntArray76[arg0] & 0xFFFF, this.anIntArray85[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3167(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static37.aByteArray19.length < this.anInt731) {
			Static37.aByteArray19 = new byte[this.anInt731 + 100];
		}
		if (!arg1 && Static37.aShortArray10.length < this.anInt731) {
			Static37.anIntArray97 = new int[this.anInt731 + 100];
			Static37.anIntArray110 = new int[this.anInt731 + 100];
			Static37.anIntArray101 = new int[this.anInt731 + 100];
			Static37.aShortArray10 = new short[this.anInt731 + 100];
		}
		return this.method600(arg0, arg1, Static37.aClass12_Sub2_Sub1_3, Static37.aByteArray19, Static37.aShortArray10, Static37.anIntArray97, Static37.anIntArray110, Static37.anIntArray101);
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "()V")
	@Override
	public void method3140() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			@Pc(10) int local10 = this.anIntArray77[local1];
			this.anIntArray77[local1] = this.anIntArray84[local1];
			this.anIntArray84[local1] = -local10;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "()I")
	@Override
	public int method3153() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()V")
	@Override
	protected void method3139() {
		if (this.aBoolean57) {
			this.method601();
			this.aBoolean57 = false;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZJIILclient!id;)V")
	private void method613(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class67_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static37.aBoolean59) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray96[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray105[local11] = 0;
			}
			Static37.anInt736 = 0;
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
		for (local11 = 0; local11 < this.anInt731; local11++) {
			if (this.anIntArray85[local11] != -2) {
				local51 = this.anIntArray75[local11];
				local56 = this.anIntArray79[local11];
				local61 = this.anIntArray80[local11];
				local65 = Static37.anIntArray106[local51];
				local69 = Static37.anIntArray106[local56];
				@Pc(73) int local73 = Static37.anIntArray106[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static37.anIntArray92[local51];
					local92 = Static37.anIntArray92[local56];
					local96 = Static37.anIntArray92[local61];
					@Pc(100) int local100 = Static37.anIntArray100[local51];
					local104 = Static37.anIntArray100[local56];
					@Pc(108) int local108 = Static37.anIntArray100[local61];
					@Pc(112) int local112 = Static37.anIntArray109[local51];
					@Pc(116) int local116 = Static37.anIntArray109[local56];
					@Pc(120) int local120 = Static37.anIntArray109[local61];
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
						Static37.aBooleanArray7[local11] = true;
						if (Static37.aBoolean59) {
							anIntArray103[local5] = (Static37.anIntArray99[local51] + Static37.anIntArray99[local56] + Static37.anIntArray99[local61]) / 3;
							anIntArray95[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static37.anIntArray99[local51] + Static37.anIntArray99[local56] + Static37.anIntArray99[local61]) / 3 + arg3;
							if (anIntArray96[local224] < 64) {
								anIntArrayArray13[local224][anIntArray96[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray96[local224];
								if (local247 == 64) {
									if (Static37.anInt736 == 512) {
										continue;
									}
									anIntArray96[local224] = local247 = Static37.anInt736++ + 65;
								}
								local247 -= 65;
								anIntArrayArray14[local247][anIntArray105[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method603(Static202.anInt3932 + Static204.anInt3986, Static238.anInt4596 + Static204.anInt3985, Static37.anIntArray111[local51], Static37.anIntArray111[local56], Static37.anIntArray111[local61], local65, local69, local73)) {
						Static110.aLongArray5[Static81.anInt4025++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static37.anIntArray111[local61] - Static37.anIntArray111[local56]) - (Static37.anIntArray111[local51] - Static37.anIntArray111[local56]) * (local73 - local69) > 0) {
						Static37.aBooleanArray7[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static204.anInt3984 && local69 <= Static204.anInt3984 && local73 <= Static204.anInt3984) {
							Static37.aBooleanArray8[local11] = false;
						} else {
							Static37.aBooleanArray8[local11] = true;
						}
						if (Static37.aBoolean59) {
							anIntArray103[local5] = (Static37.anIntArray99[local51] + Static37.anIntArray99[local56] + Static37.anIntArray99[local61]) / 3;
							anIntArray95[local5++] = local11;
						} else {
							local88 = (Static37.anIntArray99[local51] + Static37.anIntArray99[local56] + Static37.anIntArray99[local61]) / 3 + arg3;
							if (anIntArray96[local88] < 64) {
								anIntArrayArray13[local88][anIntArray96[local88]++] = local11;
							} else {
								local92 = anIntArray96[local88];
								if (local92 == 64) {
									if (Static37.anInt736 == 512) {
										continue;
									}
									anIntArray96[local88] = local92 = Static37.anInt736++ + 65;
								}
								local92 -= 65;
								anIntArrayArray14[local92][anIntArray105[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static37.aBoolean59) {
			Static232.method3631(anIntArray103, anIntArray95, 0, local5 - 1);
			if (this.aByteArray16 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method611(anIntArray95[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static37.anIntArray93[local11] = 0;
				Static37.anIntArray107[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray95[local11];
				local56 = anIntArray103[local11];
				@Pc(523) byte local523 = this.aByteArray16[local51];
				local65 = Static37.anIntArray93[local523]++;
				Static37.anIntArrayArray12[local523][local65] = local51;
				if (local523 < 10) {
					Static37.anIntArray107[local523] += local56;
				} else if (local523 == 10) {
					Static37.anIntArray112[local65] = local56;
				} else {
					Static37.anIntArray98[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray16 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray96[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = anIntArrayArray13[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method611(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray96[local11] - 64 - 1;
						local590 = anIntArrayArray14[local56];
						for (local65 = 0; local65 < anIntArray105[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method611(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static37.anIntArray93[local11] = 0;
				Static37.anIntArray107[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray96[local11];
				@Pc(704) byte local704;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local590 = anIntArrayArray13[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray16[local69];
							local88 = Static37.anIntArray93[local704]++;
							Static37.anIntArrayArray12[local704][local88] = local69;
							if (local704 < 10) {
								Static37.anIntArray107[local704] += local11;
							} else if (local704 == 10) {
								Static37.anIntArray112[local88] = local11;
							} else {
								Static37.anIntArray98[local88] = local11;
							}
						} else {
							Static37.anIntArray108[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray96[local11] - 64 - 1;
					local590 = anIntArrayArray14[local56];
					for (local65 = 0; local65 < anIntArray105[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray16[local69];
							local88 = Static37.anIntArray93[local704]++;
							Static37.anIntArrayArray12[local704][local88] = local69;
							if (local704 < 10) {
								Static37.anIntArray107[local704] += local11;
							} else if (local704 == 10) {
								Static37.anIntArray112[local88] = local11;
							} else {
								Static37.anIntArray98[local88] = local11;
							}
						} else {
							Static37.anIntArray108[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static37.anIntArray93[1] > 0 || Static37.anIntArray93[2] > 0) {
			local11 = (Static37.anIntArray107[1] + Static37.anIntArray107[2]) / (Static37.anIntArray93[1] + Static37.anIntArray93[2]);
		}
		local51 = 0;
		if (Static37.anIntArray93[3] > 0 || Static37.anIntArray93[4] > 0) {
			local51 = (Static37.anIntArray107[3] + Static37.anIntArray107[4]) / (Static37.anIntArray93[3] + Static37.anIntArray93[4]);
		}
		local56 = 0;
		if (Static37.anIntArray93[6] > 0 || Static37.anIntArray93[8] > 0) {
			local56 = (Static37.anIntArray107[6] + Static37.anIntArray107[8]) / (Static37.anIntArray93[6] + Static37.anIntArray93[8]);
		}
		local65 = 0;
		local69 = Static37.anIntArray93[10];
		@Pc(928) int[] local928 = Static37.anIntArrayArray12[10];
		@Pc(930) int[] local930 = Static37.anIntArray112;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static37.anIntArray93[11];
			local928 = Static37.anIntArrayArray12[11];
			local930 = Static37.anIntArray98;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method611(local928[local65++]);
				if (local65 == local69 && local928 != Static37.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static37.anIntArray93[11];
					local928 = Static37.anIntArrayArray12[11];
					local930 = Static37.anIntArray98;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method611(local928[local65++]);
				if (local65 == local69 && local928 != Static37.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static37.anIntArray93[11];
					local928 = Static37.anIntArrayArray12[11];
					local930 = Static37.anIntArray98;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method611(local928[local65++]);
				if (local65 == local69 && local928 != Static37.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static37.anIntArray93[11];
					local928 = Static37.anIntArrayArray12[11];
					local930 = Static37.anIntArray98;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static37.anIntArray93[local92];
			@Pc(1096) int[] local1096 = Static37.anIntArrayArray12[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method611(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method611(local928[local65++]);
			if (local65 == local69 && local928 != Static37.anIntArrayArray12[11]) {
				local65 = 0;
				local928 = Static37.anIntArrayArray12[11];
				local69 = Static37.anIntArray93[11];
				local930 = Static37.anIntArray98;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method3144(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt732; local9++) {
			@Pc(29) int local29 = this.anIntArray77[local9] * local3 + this.anIntArray84[local9] * local7 >> 16;
			this.anIntArray77[local9] = this.anIntArray77[local9] * local7 - this.anIntArray84[local9] * local3 >> 16;
			this.anIntArray84[local9] = local29;
		}
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "()I")
	@Override
	public int method3148() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "()I")
	@Override
	public int method3147() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "()I")
	@Override
	public int method3142() {
		if (!this.aBoolean56) {
			this.method609();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!uc;)Lclient!uc;")
	public Class12_Sub2 method614(@OriginalArg(0) Class12_Sub2 arg0) {
		return new Class12_Sub2_Sub1(new Class12_Sub2_Sub1[] { this, (Class12_Sub2_Sub1) arg0 }, 2);
	}
}
