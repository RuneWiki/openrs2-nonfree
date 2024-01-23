import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!c", name = "Lb", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!c", name = "Cb", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!c", name = "T", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!c", name = "V", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public int anInt690 = 0;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "I")
	private int anInt692 = 0;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	private int anInt691 = 0;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "I")
	private int anInt693 = 0;

	static {
		if (Static31.aBoolean69) {
			anIntArray93 = new int[4096];
			anIntArray104 = new int[4096];
		} else {
			anIntArray91 = new int[1600];
			anIntArrayArray9 = new int[1600][64];
			anIntArray99 = new int[32];
			anIntArrayArray7 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!gd;IIIII)V")
	public Class6_Sub2_Sub1(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1436();
		arg0.method1428();
		this.anInt690 = arg0.anInt1644;
		this.anInt691 = arg0.anInt1642;
		this.anIntArray76 = arg0.anIntArray216;
		this.anIntArray70 = arg0.anIntArray209;
		this.anIntArray74 = arg0.anIntArray217;
		this.anInt693 = arg0.anInt1640;
		this.anIntArray75 = arg0.anIntArray211;
		this.anIntArray78 = arg0.anIntArray213;
		this.anIntArray69 = arg0.anIntArray215;
		this.aByteArray8 = arg0.aByteArray28;
		this.aByteArray7 = arg0.aByteArray32;
		this.aByte6 = arg0.aByte8;
		this.aShortArray8 = arg0.aShortArray34;
		this.anIntArrayArray6 = arg0.anIntArrayArray15;
		this.anIntArrayArray5 = arg0.anIntArrayArray14;
		this.aShortArray9 = arg0.aShortArray26;
		this.aShortArray12 = arg0.aShortArray28;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray72 = new int[this.anInt693];
		this.anIntArray79 = new int[this.anInt693];
		this.anIntArray71 = new int[this.anInt693];
		@Pc(140) int local140;
		if (arg0.aShortArray32 == null) {
			this.aShortArray10 = null;
		} else {
			this.aShortArray10 = new short[this.anInt693];
			for (local140 = 0; local140 < this.anInt693; local140++) {
				@Pc(149) short local149 = arg0.aShortArray32[local140];
				if (local149 != -1 && Static208.anInterface4_1.method990(local149)) {
					this.aShortArray10[local140] = local149;
				} else {
					this.aShortArray10[local140] = -1;
				}
			}
		}
		if (arg0.anInt1643 > 0 && arg0.aByteArray27 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt1643];
			@Pc(186) int local186;
			for (local186 = 0; local186 < this.anInt693; local186++) {
				if (arg0.aByteArray27[local186] != -1) {
					local184[arg0.aByteArray27[local186] & 0xFF]++;
				}
			}
			this.anInt692 = 0;
			for (local186 = 0; local186 < arg0.anInt1643; local186++) {
				if (local184[local186] > 0 && arg0.aByteArray33[local186] == 0) {
					this.anInt692++;
				}
			}
			this.anIntArray81 = new int[this.anInt692];
			this.anIntArray77 = new int[this.anInt692];
			this.anIntArray73 = new int[this.anInt692];
			local186 = 0;
			@Pc(255) int local255;
			for (local255 = 0; local255 < arg0.anInt1643; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray33[local255] == 0) {
					this.anIntArray81[local186] = arg0.aShortArray27[local255] & 0xFFFF;
					this.anIntArray77[local186] = arg0.aShortArray33[local255] & 0xFFFF;
					this.anIntArray73[local186] = arg0.aShortArray29[local255] & 0xFFFF;
					local184[local255] = local186++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray9 = new byte[this.anInt693];
			for (local255 = 0; local255 < this.anInt693; local255++) {
				if (arg0.aByteArray27[local255] == -1) {
					this.aByteArray9[local255] = -1;
				} else {
					this.aByteArray9[local255] = (byte) local184[arg0.aByteArray27[local255] & 0xFF];
					if (this.aByteArray9[local255] == -1 && this.aShortArray10 != null) {
						this.aShortArray10[local255] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt693; local140++) {
			@Pc(373) byte local373;
			if (arg0.aByteArray34 == null) {
				local373 = 0;
			} else {
				local373 = arg0.aByteArray34[local140];
			}
			@Pc(384) byte local384;
			if (arg0.aByteArray32 == null) {
				local384 = 0;
			} else {
				local384 = arg0.aByteArray32[local140];
			}
			@Pc(395) short local395;
			if (this.aShortArray10 == null) {
				local395 = -1;
			} else {
				local395 = this.aShortArray10[local140];
			}
			if (local384 == -2) {
				local373 = 3;
			}
			if (local384 == -1) {
				local373 = 2;
			}
			@Pc(442) Class12 local442;
			@Pc(475) int local475;
			@Pc(621) Class134 local621;
			if (local395 == -1) {
				if (local373 == 0) {
					@Pc(423) int local423 = arg0.aShortArray34[local140] & 0xFFFF;
					if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray75[local140]] == null) {
						local442 = arg0.aClass12Array1[this.anIntArray75[local140]];
					} else {
						local442 = arg0.aClass12Array2[this.anIntArray75[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423) << 17;
					this.anIntArray72[local140] = local475 | Static31.method589(local423, local475 >> 17);
					if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray78[local140]] == null) {
						local442 = arg0.aClass12Array1[this.anIntArray78[local140]];
					} else {
						local442 = arg0.aClass12Array2[this.anIntArray78[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423) << 17;
					this.anIntArray79[local140] = local475 | Static31.method589(local423, local475 >> 17);
					if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray69[local140]] == null) {
						local442 = arg0.aClass12Array1[this.anIntArray69[local140]];
					} else {
						local442 = arg0.aClass12Array2[this.anIntArray69[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423) << 17;
					this.anIntArray71[local140] = local475 | Static31.method589(local423, local475 >> 17);
				} else if (local373 == 1) {
					local621 = arg0.aClass134Array1[local140];
					local475 = arg1 + (arg3 * local621.anInt4124 + arg4 * local621.anInt4119 + arg5 * local621.anInt4121) / (local115 + local115 / 2) << 17;
					this.anIntArray72[local140] = local475 | Static31.method589(arg0.aShortArray34[local140] & 0xFFFF, local475 >> 17);
					this.anIntArray71[local140] = -1;
				} else if (local373 == 3) {
					this.anIntArray72[local140] = 128;
					this.anIntArray71[local140] = -1;
				} else {
					this.anIntArray71[local140] = -2;
				}
			} else if (local373 == 0) {
				if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray75[local140]] == null) {
					local442 = arg0.aClass12Array1[this.anIntArray75[local140]];
				} else {
					local442 = arg0.aClass12Array2[this.anIntArray75[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423);
				this.anIntArray72[local140] = Static31.method593(local475);
				if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray78[local140]] == null) {
					local442 = arg0.aClass12Array1[this.anIntArray78[local140]];
				} else {
					local442 = arg0.aClass12Array2[this.anIntArray78[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423);
				this.anIntArray79[local140] = Static31.method593(local475);
				if (arg0.aClass12Array2 == null || arg0.aClass12Array2[this.anIntArray69[local140]] == null) {
					local442 = arg0.aClass12Array1[this.anIntArray69[local140]];
				} else {
					local442 = arg0.aClass12Array2[this.anIntArray69[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt422 + arg4 * local442.anInt419 + arg5 * local442.anInt421) / (local115 * local442.anInt423);
				this.anIntArray71[local140] = Static31.method593(local475);
			} else if (local373 == 1) {
				local621 = arg0.aClass134Array1[local140];
				local475 = arg1 + (arg3 * local621.anInt4124 + arg4 * local621.anInt4119 + arg5 * local621.anInt4121) / (local115 + local115 / 2);
				this.anIntArray72[local140] = Static31.method593(local475);
				this.anIntArray71[local140] = -1;
			} else {
				this.anIntArray71[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([Lclient!c;I)V")
	private Class6_Sub2_Sub1(@OriginalArg(0) Class6_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt690 = 0;
		this.anInt693 = 0;
		this.anInt692 = 0;
		this.aByte6 = -1;
		@Pc(48) int local48;
		@Pc(55) Class6_Sub2_Sub1 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt690 += local55.anInt690;
				this.anInt693 += local55.anInt693;
				this.anInt692 += local55.anInt692;
				if (local55.aByteArray8 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local55.aByte6;
					}
					if (this.aByte6 != local55.aByte6) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray7 != null;
				local28 |= local55.aShortArray10 != null;
				local30 |= local55.aByteArray9 != null;
			}
		}
		this.anIntArray76 = new int[this.anInt690];
		this.anIntArray70 = new int[this.anInt690];
		this.anIntArray74 = new int[this.anInt690];
		this.anIntArray75 = new int[this.anInt693];
		this.anIntArray78 = new int[this.anInt693];
		this.anIntArray69 = new int[this.anInt693];
		this.anIntArray72 = new int[this.anInt693];
		this.anIntArray79 = new int[this.anInt693];
		this.anIntArray71 = new int[this.anInt693];
		if (local24) {
			this.aByteArray8 = new byte[this.anInt693];
		}
		if (local26) {
			this.aByteArray7 = new byte[this.anInt693];
		}
		if (local28) {
			this.aShortArray10 = new short[this.anInt693];
		}
		if (local30) {
			this.aByteArray9 = new byte[this.anInt693];
		}
		if (this.anInt692 > 0) {
			this.anIntArray81 = new int[this.anInt692];
			this.anIntArray77 = new int[this.anInt692];
			this.anIntArray73 = new int[this.anInt692];
		}
		this.aShortArray8 = new short[this.anInt693];
		this.anInt690 = 0;
		this.anInt693 = 0;
		this.anInt692 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(254) int local254;
				for (local254 = 0; local254 < local55.anInt693; local254++) {
					this.anIntArray75[this.anInt693] = local55.anIntArray75[local254] + this.anInt690;
					this.anIntArray78[this.anInt693] = local55.anIntArray78[local254] + this.anInt690;
					this.anIntArray69[this.anInt693] = local55.anIntArray69[local254] + this.anInt690;
					this.anIntArray72[this.anInt693] = local55.anIntArray72[local254];
					this.anIntArray79[this.anInt693] = local55.anIntArray79[local254];
					this.anIntArray71[this.anInt693] = local55.anIntArray71[local254];
					this.aShortArray8[this.anInt693] = local55.aShortArray8[local254];
					if (local24) {
						if (local55.aByteArray8 == null) {
							this.aByteArray8[this.anInt693] = local55.aByte6;
						} else {
							this.aByteArray8[this.anInt693] = local55.aByteArray8[local254];
						}
					}
					if (local26 && local55.aByteArray7 != null) {
						this.aByteArray7[this.anInt693] = local55.aByteArray7[local254];
					}
					if (local28) {
						if (local55.aShortArray10 == null) {
							this.aShortArray10[this.anInt693] = -1;
						} else {
							this.aShortArray10[this.anInt693] = local55.aShortArray10[local254];
						}
					}
					if (local30) {
						this.aByteArray9[this.anInt693] = (byte) (local55.aByteArray9 == null || local55.aByteArray9[local254] == -1 ? -1 : local55.aByteArray9[local254] + this.anInt692);
					}
					this.anInt693++;
				}
				for (local254 = 0; local254 < local55.anInt692; local254++) {
					if (local55.anIntArray81[local254] < local55.anInt691) {
						this.anIntArray81[this.anInt692] = local55.anIntArray81[local254] + this.anInt690;
					}
					if (local55.anIntArray77[local254] < local55.anInt691) {
						this.anIntArray77[this.anInt692] = local55.anIntArray77[local254] + this.anInt690;
					}
					if (local55.anIntArray73[local254] < local55.anInt691) {
						this.anIntArray73[this.anInt692] = local55.anIntArray73[local254] + this.anInt690;
					}
					this.anInt692++;
				}
				for (local254 = 0; local254 < local55.anInt691; local254++) {
					this.anIntArray76[this.anInt690] = local55.anIntArray76[local254];
					this.anIntArray70[this.anInt690] = local55.anIntArray70[local254];
					this.anIntArray74[this.anInt690] = local55.anIntArray74[local254];
					this.anInt690++;
				}
			}
		}
		local48 = 0;
		this.anInt691 = this.anInt690;
		for (@Pc(543) int local543 = 0; local543 < arg1; local543++) {
			@Pc(550) Class6_Sub2_Sub1 local550 = arg0[local543];
			if (local550 != null) {
				@Pc(554) int local554;
				for (local554 = 0; local554 < local550.anInt692; local554++) {
					if (local550.anIntArray81[local554] >= local550.anInt691) {
						this.anIntArray81[local48] = local550.anIntArray81[local554] + this.anInt690 - local550.anInt691;
					}
					if (local550.anIntArray77[local554] >= local550.anInt691) {
						this.anIntArray77[local48] = local550.anIntArray77[local554] + this.anInt690 - local550.anInt691;
					}
					if (local550.anIntArray73[local554] >= local550.anInt691) {
						this.anIntArray73[local48] = local550.anIntArray73[local554] + this.anInt690 - local550.anInt691;
					}
					local48++;
				}
				for (local554 = local550.anInt691; local554 < local550.anInt690; local554++) {
					this.anIntArray76[this.anInt690] = local550.anIntArray76[local554];
					this.anIntArray70[this.anInt690] = local550.anIntArray70[local554];
					this.anIntArray74[this.anInt690] = local550.anIntArray74[local554];
					this.anInt690++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static31.anInt696 = 0;
			Static31.anInt694 = 0;
			Static31.anInt695 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray6.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray6[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local41]) != 0) {
							Static31.anInt696 += this.anIntArray76[local41];
							Static31.anInt694 += this.anIntArray70[local41];
							Static31.anInt695 += this.anIntArray74[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static31.anInt696 = Static31.anInt696 / local6 + arg2;
				Static31.anInt694 = Static31.anInt694 / local6 + arg3;
				Static31.anInt695 = Static31.anInt695 / local6 + arg4;
				Static31.aBoolean68 = true;
			} else {
				Static31.anInt696 = arg2;
				Static31.anInt694 = arg3;
				Static31.anInt695 = arg4;
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
				if (local14 < this.anIntArrayArray6.length) {
					local204 = this.anIntArrayArray6[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local33]) != 0) {
							this.anIntArray76[local33] += arg2;
							this.anIntArray70[local33] += arg3;
							this.anIntArray74[local33] += arg4;
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
					if (local14 < this.anIntArrayArray6.length) {
						local204 = this.anIntArrayArray6[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local33]) != 0) {
								this.anIntArray76[local33] -= Static31.anInt696;
								this.anIntArray70[local33] -= Static31.anInt694;
								this.anIntArray74[local33] -= Static31.anInt695;
								if (arg4 != 0) {
									local41 = Class135.anIntArray472[arg4];
									local307 = Class135.anIntArray474[arg4];
									local329 = this.anIntArray70[local33] * local41 + this.anIntArray76[local33] * local307 + 32767 >> 16;
									this.anIntArray70[local33] = this.anIntArray70[local33] * local307 + 32767 - this.anIntArray76[local33] * local41 >> 16;
									this.anIntArray76[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class135.anIntArray472[arg2];
									local307 = Class135.anIntArray474[arg2];
									local329 = this.anIntArray70[local33] * local307 + 32767 - this.anIntArray74[local33] * local41 >> 16;
									this.anIntArray74[local33] = this.anIntArray70[local33] * local41 + this.anIntArray74[local33] * local307 + 32767 >> 16;
									this.anIntArray70[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class135.anIntArray472[arg3];
									local307 = Class135.anIntArray474[arg3];
									local329 = this.anIntArray74[local33] * local41 + this.anIntArray76[local33] * local307 + 32767 >> 16;
									this.anIntArray74[local33] = this.anIntArray74[local33] * local307 + 32767 - this.anIntArray76[local33] * local41 >> 16;
									this.anIntArray76[local33] = local329;
								}
								this.anIntArray76[local33] += Static31.anInt696;
								this.anIntArray70[local33] += Static31.anInt694;
								this.anIntArray74[local33] += Static31.anInt695;
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
				if (Static31.aBoolean68) {
					local307 = arg7[0] * Static31.anInt696 + arg7[3] * Static31.anInt694 + arg7[6] * Static31.anInt695 + 16384 >> 15;
					local329 = arg7[1] * Static31.anInt696 + arg7[4] * Static31.anInt694 + arg7[7] * Static31.anInt695 + 16384 >> 15;
					local351 = arg7[2] * Static31.anInt696 + arg7[5] * Static31.anInt694 + arg7[8] * Static31.anInt695 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static31.anInt696 = local307;
					Static31.anInt694 = local329;
					Static31.anInt695 = local351;
					Static31.aBoolean68 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class135.anIntArray474[arg2] >> 1;
				local351 = Class135.anIntArray472[arg2] >> 1;
				local392 = Class135.anIntArray474[arg3] >> 1;
				local398 = Class135.anIntArray472[arg3] >> 1;
				local404 = Class135.anIntArray474[arg4] >> 1;
				local410 = Class135.anIntArray472[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static31.anInt696 + local374[1] * -Static31.anInt694 + local374[2] * -Static31.anInt695 + 16384 >> 15;
				local579 = local374[3] * -Static31.anInt696 + local374[4] * -Static31.anInt694 + local374[5] * -Static31.anInt695 + 16384 >> 15;
				local604 = local374[6] * -Static31.anInt696 + local374[7] * -Static31.anInt694 + local374[8] * -Static31.anInt695 + 16384 >> 15;
				local608 = local554 + Static31.anInt696;
				@Pc(612) int local612 = local579 + Static31.anInt694;
				local616 = local604 + Static31.anInt695;
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
					if (local893 < this.anIntArrayArray6.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray6[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray76[local913] + local753[1] * this.anIntArray70[local913] + local753[2] * this.anIntArray74[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray76[local913] + local753[4] * this.anIntArray70[local913] + local753[5] * this.anIntArray74[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray76[local913] + local753[7] * this.anIntArray70[local913] + local753[8] * this.anIntArray74[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray76[local913] = local1021;
								this.anIntArray70[local913] = local1025;
								this.anIntArray74[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray6.length) {
						local204 = this.anIntArrayArray6[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local33]) != 0) {
								this.anIntArray76[local33] -= Static31.anInt696;
								this.anIntArray70[local33] -= Static31.anInt694;
								this.anIntArray74[local33] -= Static31.anInt695;
								this.anIntArray76[local33] = this.anIntArray76[local33] * arg2 / 128;
								this.anIntArray70[local33] = this.anIntArray70[local33] * arg3 / 128;
								this.anIntArray74[local33] = this.anIntArray74[local33] * arg4 / 128;
								this.anIntArray76[local33] += Static31.anInt696;
								this.anIntArray70[local33] += Static31.anInt694;
								this.anIntArray74[local33] += Static31.anInt695;
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
				if (Static31.aBoolean68) {
					local307 = arg7[0] * Static31.anInt696 + arg7[3] * Static31.anInt694 + arg7[6] * Static31.anInt695 + 16384 >> 15;
					local329 = arg7[1] * Static31.anInt696 + arg7[4] * Static31.anInt694 + arg7[7] * Static31.anInt695 + 16384 >> 15;
					local351 = arg7[2] * Static31.anInt696 + arg7[5] * Static31.anInt694 + arg7[8] * Static31.anInt695 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static31.anInt696 = local307;
					Static31.anInt694 = local329;
					Static31.anInt695 = local351;
					Static31.aBoolean68 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static31.anInt696 + 16384 >> 15;
				local398 = local329 * -Static31.anInt694 + 16384 >> 15;
				local404 = local351 * -Static31.anInt695 + 16384 >> 15;
				local410 = local392 + Static31.anInt696;
				local418 = local398 + Static31.anInt694;
				local426 = local404 + Static31.anInt695;
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
					if (local631 < this.anIntArrayArray6.length) {
						local753 = this.anIntArrayArray6[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray76[local760] + local1628[1] * this.anIntArray70[local760] + local1628[2] * this.anIntArray74[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray76[local760] + local1628[4] * this.anIntArray70[local760] + local1628[5] * this.anIntArray74[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray76[local760] + local1628[7] * this.anIntArray70[local760] + local1628[8] * this.anIntArray74[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray76[local760] = local1896;
								this.anIntArray70[local760] = local1900;
								this.anIntArray74[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray5 != null && this.aByteArray7 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray5.length) {
						local204 = this.anIntArrayArray5[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray9 == null || (arg6 & this.aShortArray9[local33]) != 0) {
								local41 = (this.aByteArray7[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray7[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray5 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray5.length) {
					local204 = this.anIntArrayArray5[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray9 == null || (arg6 & this.aShortArray9[local33]) != 0) {
							local41 = this.aShortArray8[local33] & 0xFFFF;
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
							this.aShortArray8[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean67 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "m", descriptor = "()I")
	@Override
	public int method2097() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean66) {
				this.method597();
			}
			@Pc(6) int local6 = Static208.anInt4133;
			@Pc(8) int local8 = Static208.anInt4134;
			@Pc(12) int local12 = Class135.anIntArray472[0];
			@Pc(16) int local16 = Class135.anIntArray474[0];
			@Pc(20) int local20 = Class135.anIntArray472[arg0];
			@Pc(24) int local24 = Class135.anIntArray474[arg0];
			@Pc(28) int local28 = Class135.anIntArray472[arg1];
			@Pc(32) int local32 = Class135.anIntArray474[arg1];
			@Pc(36) int local36 = Class135.anIntArray472[arg2];
			@Pc(40) int local40 = Class135.anIntArray474[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt690; local52++) {
				@Pc(61) int local61 = this.anIntArray76[local52];
				@Pc(66) int local66 = this.anIntArray70[local52];
				@Pc(71) int local71 = this.anIntArray74[local52];
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
				Static31.anIntArray95[local52] = local71 - local50;
				Static31.anIntArray88[local52] = local6 + (local61 << 9) / local71;
				Static31.anIntArray87[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt692 > 0) {
					Static31.anIntArray97[local52] = local61;
					Static31.anIntArray106[local52] = local83;
					Static31.anIntArray103[local52] = local71;
				}
			}
			this.method598(false, arg6 >= 0L, arg6, this.aShort11, this.aShort11 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
	@Override
	public void method2089() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt690; local1++) {
			this.anIntArray76[local1] = -this.anIntArray76[local1];
			this.anIntArray74[local1] = -this.anIntArray74[local1];
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()I")
	@Override
	public int method2082() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!c", name = "l", descriptor = "()I")
	@Override
	public int method2096() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	@Override
	public void method2073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt690; local1++) {
			this.anIntArray76[local1] += arg0;
			this.anIntArray70[local1] += arg1;
			this.anIntArray74[local1] += arg2;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2077(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static31.aByteArray12.length < this.anInt693) {
			Static31.aByteArray12 = new byte[this.anInt693 + 100];
		}
		if (!arg1 && Static31.aShortArray14.length < this.anInt693) {
			Static31.anIntArray90 = new int[this.anInt693 + 100];
			Static31.anIntArray94 = new int[this.anInt693 + 100];
			Static31.anIntArray107 = new int[this.anInt693 + 100];
			Static31.aShortArray14 = new short[this.anInt693 + 100];
		}
		return this.method591(arg0, arg1, Static31.aClass6_Sub2_Sub1_3, Static31.aByteArray12, Static31.aShortArray14, Static31.anIntArray90, Static31.anIntArray94, Static31.anIntArray107);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	private void method587(@OriginalArg(0) int arg0) {
		if (Static31.aBooleanArray4[arg0]) {
			this.method594(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray75[arg0];
		@Pc(17) int local17 = this.anIntArray78[arg0];
		@Pc(22) int local22 = this.anIntArray69[arg0];
		Static208.aBoolean313 = Static31.aBooleanArray3[arg0];
		if (this.aByteArray7 == null) {
			Static208.anInt4131 = 0;
		} else {
			Static208.anInt4131 = this.aByteArray7[arg0] & 0xFF;
		}
		if (this.aShortArray10 != null && this.aShortArray10[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray9[arg0] & 0xFF;
				local141 = this.anIntArray81[local136];
				local146 = this.anIntArray77[local136];
				local151 = this.anIntArray73[local136];
			}
			if (this.anIntArray71[arg0] == -1) {
				Static208.method3239(Static31.anIntArray87[local12], Static31.anIntArray87[local17], Static31.anIntArray87[local22], Static31.anIntArray88[local12], Static31.anIntArray88[local17], Static31.anIntArray88[local22], this.anIntArray72[arg0], this.anIntArray72[arg0], this.anIntArray72[arg0], Static31.anIntArray97[local141], Static31.anIntArray97[local146], Static31.anIntArray97[local151], Static31.anIntArray106[local141], Static31.anIntArray106[local146], Static31.anIntArray106[local151], Static31.anIntArray103[local141], Static31.anIntArray103[local146], Static31.anIntArray103[local151], this.aShortArray10[arg0]);
			} else {
				Static208.method3239(Static31.anIntArray87[local12], Static31.anIntArray87[local17], Static31.anIntArray87[local22], Static31.anIntArray88[local12], Static31.anIntArray88[local17], Static31.anIntArray88[local22], this.anIntArray72[arg0], this.anIntArray79[arg0], this.anIntArray71[arg0], Static31.anIntArray97[local141], Static31.anIntArray97[local146], Static31.anIntArray97[local151], Static31.anIntArray106[local141], Static31.anIntArray106[local146], Static31.anIntArray106[local151], Static31.anIntArray103[local141], Static31.anIntArray103[local146], Static31.anIntArray103[local151], this.aShortArray10[arg0]);
			}
		} else if (this.anIntArray71[arg0] == -1) {
			Static208.method3240(Static31.anIntArray87[local12], Static31.anIntArray87[local17], Static31.anIntArray87[local22], Static31.anIntArray88[local12], Static31.anIntArray88[local17], Static31.anIntArray88[local22], Static208.anIntArray476[this.anIntArray72[arg0] & 0xFFFF]);
		} else {
			Static208.method3254(Static31.anIntArray87[local12], Static31.anIntArray87[local17], Static31.anIntArray87[local22], Static31.anIntArray88[local12], Static31.anIntArray88[local17], Static31.anIntArray88[local22], this.anIntArray72[arg0] & 0xFFFF, this.anIntArray79[arg0] & 0xFFFF, this.anIntArray71[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
	@Override
	public void method2069() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt690; local1++) {
			@Pc(10) int local10 = this.anIntArray74[local1];
			this.anIntArray74[local1] = this.anIntArray76[local1];
			this.anIntArray76[local1] = -local10;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		if (!this.aBoolean66) {
			this.method597();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort4 * arg2 + this.aShort9 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort4 * arg2 + this.aShort5 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort4 << 9;
		if (local78 / local38 <= Static77.anInt1560) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort4 << 9;
		if (local91 / local38 >= Static211.anInt958) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort4 * arg1 + this.aShort9 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static17.anInt409) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort4 * arg1 + this.aShort5 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static150.anInt2786) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt692 > 0;
		@Pc(172) int local172 = Static208.anInt4133;
		@Pc(174) int local174 = Static208.anInt4134;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class135.anIntArray472[arg0];
			local178 = Class135.anIntArray474[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static14.aBoolean29 && local53 > 0) {
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
			if (Static134.anInt2546 >= local204 && Static134.anInt2546 <= local208 && Static67.anInt1387 >= local223 && Static67.anInt1387 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort8, this.aShort6, this.aShort8, this.aShort6, this.aShort8, this.aShort6, this.aShort8, this.aShort6 };
				@Pc(342) int[] local342 = new int[] { this.aShort10, this.aShort10, this.aShort7, this.aShort7, this.aShort10, this.aShort10, this.aShort7, this.aShort7 };
				@Pc(385) int[] local385 = new int[] { this.aShort5, this.aShort5, this.aShort5, this.aShort5, this.aShort9, this.aShort9, this.aShort9, this.aShort9 };
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
				if (Static134.anInt2546 >= local204 && Static134.anInt2546 <= local208 && Static67.anInt1387 >= local223 && Static67.anInt1387 <= local227) {
					if (this.aBoolean176) {
						Static158.aLongArray8[Static270.anInt5412++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt690; local204++) {
			local223 = this.anIntArray76[local204];
			local208 = this.anIntArray70[local204];
			local227 = this.anIntArray74[local204];
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
			Static31.anIntArray95[local204] = local227 - local24;
			if (local227 >= 50) {
				Static31.anIntArray88[local204] = local172 + (local223 << 9) / local227;
				Static31.anIntArray87[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static31.anIntArray88[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static31.anIntArray97[local204] = local223;
				Static31.anIntArray106[local204] = local577;
				Static31.anIntArray103[local204] = local227;
			}
		}
		try {
			this.method598(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
	@Override
	public void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt690; local1++) {
			this.anIntArray76[local1] = this.anIntArray76[local1] * arg0 / 128;
			this.anIntArray70[local1] = this.anIntArray70[local1] * arg1 / 128;
			this.anIntArray74[local1] = this.anIntArray74[local1] * arg2 / 128;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method2085(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt690; local9++) {
			@Pc(29) int local29 = this.anIntArray70[local9] * local3 + this.anIntArray76[local9] * local7 >> 16;
			this.anIntArray70[local9] = this.anIntArray70[local9] * local7 - this.anIntArray76[local9] * local3 >> 16;
			this.anIntArray76[local9] = local29;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "()I")
	@Override
	public int method2092() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public void method2072(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt690; local9++) {
			@Pc(29) int local29 = this.anIntArray74[local9] * local3 + this.anIntArray76[local9] * local7 >> 16;
			this.anIntArray74[local9] = this.anIntArray74[local9] * local7 - this.anIntArray76[local9] * local3 >> 16;
			this.anIntArray76[local9] = local29;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2094(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static31.aByteArray11.length < this.anInt693) {
			Static31.aByteArray11 = new byte[this.anInt693 + 100];
		}
		if (!arg1 && Static31.aShortArray13.length < this.anInt693) {
			Static31.anIntArray84 = new int[this.anInt693 + 100];
			Static31.anIntArray85 = new int[this.anInt693 + 100];
			Static31.anIntArray86 = new int[this.anInt693 + 100];
			Static31.aShortArray13 = new short[this.anInt693 + 100];
		}
		return this.method591(arg0, arg1, Static31.aClass6_Sub2_Sub1_2, Static31.aByteArray11, Static31.aShortArray13, Static31.anIntArray84, Static31.anIntArray85, Static31.anIntArray86);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIIII)V")
	public void method588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean66) {
				this.method597();
			}
			@Pc(6) int local6 = Static208.anInt4133;
			@Pc(8) int local8 = Static208.anInt4134;
			@Pc(12) int local12 = Class135.anIntArray472[0];
			@Pc(16) int local16 = Class135.anIntArray474[0];
			@Pc(20) int local20 = Class135.anIntArray472[arg0];
			@Pc(24) int local24 = Class135.anIntArray474[arg0];
			@Pc(28) int local28 = Class135.anIntArray472[arg1];
			@Pc(32) int local32 = Class135.anIntArray474[arg1];
			@Pc(36) int local36 = Class135.anIntArray472[arg2];
			@Pc(40) int local40 = Class135.anIntArray474[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt690; local52++) {
				@Pc(61) int local61 = this.anIntArray76[local52];
				@Pc(66) int local66 = this.anIntArray70[local52];
				@Pc(71) int local71 = this.anIntArray74[local52];
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
				Static31.anIntArray95[local52] = local71 - local50;
				Static31.anIntArray88[local52] = local6 + (local61 << 9) / arg6;
				Static31.anIntArray87[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt692 > 0) {
					Static31.anIntArray97[local52] = local61;
					Static31.anIntArray106[local52] = local83;
					Static31.anIntArray103[local52] = local71;
				}
			}
			this.method598(false, false, 0L, this.aShort11, this.aShort11 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static31.anInt696 = 0;
			Static31.anInt694 = 0;
			Static31.anInt695 = 0;
			for (local11 = 0; local11 < this.anInt690; local11++) {
				Static31.anInt696 += this.anIntArray76[local11];
				Static31.anInt694 += this.anIntArray70[local11];
				Static31.anInt695 += this.anIntArray74[local11];
				local3++;
			}
			if (local3 > 0) {
				Static31.anInt696 = Static31.anInt696 / local3 + arg1;
				Static31.anInt694 = Static31.anInt694 / local3 + arg2;
				Static31.anInt695 = Static31.anInt695 / local3 + arg3;
			} else {
				Static31.anInt696 = arg1;
				Static31.anInt694 = arg2;
				Static31.anInt695 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt690; local3++) {
				this.anIntArray76[local3] += arg1;
				this.anIntArray70[local3] += arg2;
				this.anIntArray74[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt690; local3++) {
					this.anIntArray76[local3] -= Static31.anInt696;
					this.anIntArray70[local3] -= Static31.anInt694;
					this.anIntArray74[local3] -= Static31.anInt695;
					if (arg3 != 0) {
						local11 = Class135.anIntArray472[arg3];
						local146 = Class135.anIntArray474[arg3];
						local164 = this.anIntArray70[local3] * local11 + this.anIntArray76[local3] * local146 + 32767 >> 16;
						this.anIntArray70[local3] = this.anIntArray70[local3] * local146 + 32767 - this.anIntArray76[local3] * local11 >> 16;
						this.anIntArray76[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class135.anIntArray472[arg1];
						local146 = Class135.anIntArray474[arg1];
						local164 = this.anIntArray70[local3] * local146 + 32767 - this.anIntArray74[local3] * local11 >> 16;
						this.anIntArray74[local3] = this.anIntArray70[local3] * local11 + this.anIntArray74[local3] * local146 + 32767 >> 16;
						this.anIntArray70[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class135.anIntArray472[arg2];
						local146 = Class135.anIntArray474[arg2];
						local164 = this.anIntArray74[local3] * local11 + this.anIntArray76[local3] * local146 + 32767 >> 16;
						this.anIntArray74[local3] = this.anIntArray74[local3] * local146 + 32767 - this.anIntArray76[local3] * local11 >> 16;
						this.anIntArray76[local3] = local164;
					}
					this.anIntArray76[local3] += Static31.anInt696;
					this.anIntArray70[local3] += Static31.anInt694;
					this.anIntArray74[local3] += Static31.anInt695;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt690; local3++) {
					this.anIntArray76[local3] -= Static31.anInt696;
					this.anIntArray70[local3] -= Static31.anInt694;
					this.anIntArray74[local3] -= Static31.anInt695;
					this.anIntArray76[local3] = this.anIntArray76[local3] * arg1 / 128;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg2 / 128;
					this.anIntArray74[local3] = this.anIntArray74[local3] * arg3 / 128;
					this.anIntArray76[local3] += Static31.anInt696;
					this.anIntArray70[local3] += Static31.anInt694;
					this.anIntArray74[local3] += Static31.anInt695;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt693; local3++) {
					local11 = (this.aByteArray7[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray7[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt693; local3++) {
					local11 = this.aShortArray8[local3] & 0xFFFF;
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
					this.aShortArray8[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean67 = true;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ei;)Lclient!ei;")
	public Class6_Sub2 method590(@OriginalArg(0) Class6_Sub2 arg0) {
		return new Class6_Sub2_Sub1(new Class6_Sub2_Sub1[] { this, (Class6_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZLclient!c;[B[S[I[I[I)Lclient!ei;")
	private Class6_Sub2 method591(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub2_Sub1 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt690 = this.anInt690;
		arg2.anInt691 = this.anInt691;
		arg2.anInt693 = this.anInt693;
		arg2.anInt692 = this.anInt692;
		if (arg2.anIntArray76 == null || arg2.anIntArray76.length < this.anInt690) {
			arg2.anIntArray76 = new int[this.anInt690 + 100];
			arg2.anIntArray70 = new int[this.anInt690 + 100];
			arg2.anIntArray74 = new int[this.anInt690 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt690; local47++) {
			arg2.anIntArray76[local47] = this.anIntArray76[local47];
			arg2.anIntArray70[local47] = this.anIntArray70[local47];
			arg2.anIntArray74[local47] = this.anIntArray74[local47];
		}
		if (arg0) {
			arg2.aByteArray7 = this.aByteArray7;
		} else {
			arg2.aByteArray7 = arg3;
			if (this.aByteArray7 == null) {
				for (local47 = 0; local47 < this.anInt693; local47++) {
					arg2.aByteArray7[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt693; local47++) {
					arg2.aByteArray7[local47] = this.aByteArray7[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray8 = this.aShortArray8;
			arg2.anIntArray72 = this.anIntArray72;
			arg2.anIntArray79 = this.anIntArray79;
			arg2.anIntArray71 = this.anIntArray71;
		} else {
			arg2.aShortArray8 = arg4;
			arg2.anIntArray72 = arg5;
			arg2.anIntArray79 = arg6;
			arg2.anIntArray71 = arg7;
			for (local47 = 0; local47 < this.anInt693; local47++) {
				arg2.aShortArray8[local47] = this.aShortArray8[local47];
				arg2.anIntArray72[local47] = this.anIntArray72[local47];
				arg2.anIntArray79[local47] = this.anIntArray79[local47];
				arg2.anIntArray71[local47] = this.anIntArray71[local47];
			}
		}
		arg2.anIntArray75 = this.anIntArray75;
		arg2.anIntArray78 = this.anIntArray78;
		arg2.anIntArray69 = this.anIntArray69;
		arg2.aByteArray8 = this.aByteArray8;
		arg2.aByteArray9 = this.aByteArray9;
		arg2.aShortArray10 = this.aShortArray10;
		arg2.aByte6 = this.aByte6;
		arg2.anIntArray81 = this.anIntArray81;
		arg2.anIntArray77 = this.anIntArray77;
		arg2.anIntArray73 = this.anIntArray73;
		arg2.anIntArrayArray6 = this.anIntArrayArray6;
		arg2.anIntArrayArray5 = this.anIntArrayArray5;
		arg2.aShortArray12 = this.aShortArray12;
		arg2.aShortArray9 = this.aShortArray9;
		arg2.aBoolean176 = this.aBoolean176;
		arg2.aBoolean66 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static31.anInt696 = 0;
			Static31.anInt694 = 0;
			Static31.anInt695 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray6.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray6[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static31.anInt696 += this.anIntArray76[local41];
						Static31.anInt694 += this.anIntArray70[local41];
						Static31.anInt695 += this.anIntArray74[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static31.anInt696 = Static31.anInt696 / local6 + arg2;
				Static31.anInt694 = Static31.anInt694 / local6 + arg3;
				Static31.anInt695 = Static31.anInt695 / local6 + arg4;
			} else {
				Static31.anInt696 = arg2;
				Static31.anInt694 = arg3;
				Static31.anInt695 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local117 = this.anIntArrayArray6[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray76[local33] += arg2;
						this.anIntArray70[local33] += arg3;
						this.anIntArray74[local33] += arg4;
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
				if (local14 < this.anIntArrayArray6.length) {
					local117 = this.anIntArrayArray6[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray76[local33] -= Static31.anInt696;
						this.anIntArray70[local33] -= Static31.anInt694;
						this.anIntArray74[local33] -= Static31.anInt695;
						if (arg4 != 0) {
							local41 = Class135.anIntArray472[arg4];
							local222 = Class135.anIntArray474[arg4];
							local240 = this.anIntArray70[local33] * local41 + this.anIntArray76[local33] * local222 + 32767 >> 16;
							this.anIntArray70[local33] = this.anIntArray70[local33] * local222 + 32767 - this.anIntArray76[local33] * local41 >> 16;
							this.anIntArray76[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class135.anIntArray472[arg2];
							local222 = Class135.anIntArray474[arg2];
							local240 = this.anIntArray70[local33] * local222 + 32767 - this.anIntArray74[local33] * local41 >> 16;
							this.anIntArray74[local33] = this.anIntArray70[local33] * local41 + this.anIntArray74[local33] * local222 + 32767 >> 16;
							this.anIntArray70[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class135.anIntArray472[arg3];
							local222 = Class135.anIntArray474[arg3];
							local240 = this.anIntArray74[local33] * local41 + this.anIntArray76[local33] * local222 + 32767 >> 16;
							this.anIntArray74[local33] = this.anIntArray74[local33] * local222 + 32767 - this.anIntArray76[local33] * local41 >> 16;
							this.anIntArray76[local33] = local240;
						}
						this.anIntArray76[local33] += Static31.anInt696;
						this.anIntArray70[local33] += Static31.anInt694;
						this.anIntArray74[local33] += Static31.anInt695;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local117 = this.anIntArrayArray6[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray76[local33] -= Static31.anInt696;
						this.anIntArray70[local33] -= Static31.anInt694;
						this.anIntArray74[local33] -= Static31.anInt695;
						this.anIntArray76[local33] = this.anIntArray76[local33] * arg2 / 128;
						this.anIntArray70[local33] = this.anIntArray70[local33] * arg3 / 128;
						this.anIntArray74[local33] = this.anIntArray74[local33] * arg4 / 128;
						this.anIntArray76[local33] += Static31.anInt696;
						this.anIntArray70[local33] += Static31.anInt694;
						this.anIntArray74[local33] += Static31.anInt695;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray5 != null && this.aByteArray7 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray5.length) {
						local117 = this.anIntArrayArray5[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray7[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray7[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray5 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray5.length) {
					local117 = this.anIntArrayArray5[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray8[local33] & 0xFFFF;
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
						this.aShortArray8[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean67 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "k", descriptor = "()I")
	@Override
	public int method2093() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	private void method594(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static208.anInt4133;
		@Pc(3) int local3 = Static208.anInt4134;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray75[arg0];
		@Pc(15) int local15 = this.anIntArray78[arg0];
		@Pc(20) int local20 = this.anIntArray69[arg0];
		@Pc(24) int local24 = Static31.anIntArray103[local10];
		@Pc(28) int local28 = Static31.anIntArray103[local15];
		@Pc(32) int local32 = Static31.anIntArray103[local20];
		if (this.aByteArray7 == null) {
			Static208.anInt4131 = 0;
		} else {
			Static208.anInt4131 = this.aByteArray7[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static31.anIntArray92[0] = Static31.anIntArray88[local10];
			Static31.anIntArray98[0] = Static31.anIntArray87[local10];
			local5++;
			Static31.anIntArray105[0] = this.anIntArray72[arg0] & 0xFFFF;
		} else {
			local75 = Static31.anIntArray97[local10];
			local79 = Static31.anIntArray106[local10];
			local86 = this.anIntArray72[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class135.anIntArray473[local32 - local24];
				Static31.anIntArray92[0] = local1 + (local75 + ((Static31.anIntArray97[local20] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[0] = local3 + (local79 + ((Static31.anIntArray106[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static31.anIntArray105[0] = local86 + (((this.anIntArray71[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class135.anIntArray473[local28 - local24];
				Static31.anIntArray92[local5] = local1 + (local75 + ((Static31.anIntArray97[local15] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[local5] = local3 + (local79 + ((Static31.anIntArray106[local15] - local79) * local99 >> 16) << 9) / 50;
				Static31.anIntArray105[local5++] = local86 + (((this.anIntArray79[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static31.anIntArray92[local5] = Static31.anIntArray88[local15];
			Static31.anIntArray98[local5] = Static31.anIntArray87[local15];
			Static31.anIntArray105[local5++] = this.anIntArray79[arg0] & 0xFFFF;
		} else {
			local75 = Static31.anIntArray97[local15];
			local79 = Static31.anIntArray106[local15];
			local86 = this.anIntArray79[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class135.anIntArray473[local24 - local28];
				Static31.anIntArray92[local5] = local1 + (local75 + ((Static31.anIntArray97[local10] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[local5] = local3 + (local79 + ((Static31.anIntArray106[local10] - local79) * local99 >> 16) << 9) / 50;
				Static31.anIntArray105[local5++] = local86 + (((this.anIntArray72[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class135.anIntArray473[local32 - local28];
				Static31.anIntArray92[local5] = local1 + (local75 + ((Static31.anIntArray97[local20] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[local5] = local3 + (local79 + ((Static31.anIntArray106[local20] - local79) * local99 >> 16) << 9) / 50;
				Static31.anIntArray105[local5++] = local86 + (((this.anIntArray71[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static31.anIntArray92[local5] = Static31.anIntArray88[local20];
			Static31.anIntArray98[local5] = Static31.anIntArray87[local20];
			Static31.anIntArray105[local5++] = this.anIntArray71[arg0] & 0xFFFF;
		} else {
			local75 = Static31.anIntArray97[local20];
			local79 = Static31.anIntArray106[local20];
			local86 = this.anIntArray71[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class135.anIntArray473[local28 - local32];
				Static31.anIntArray92[local5] = local1 + (local75 + ((Static31.anIntArray97[local15] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[local5] = local3 + (local79 + ((Static31.anIntArray106[local15] - local79) * local99 >> 16) << 9) / 50;
				Static31.anIntArray105[local5++] = local86 + (((this.anIntArray79[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class135.anIntArray473[local24 - local32];
				Static31.anIntArray92[local5] = local1 + (local75 + ((Static31.anIntArray97[local10] - local75) * local99 >> 16) << 9) / 50;
				Static31.anIntArray98[local5] = local3 + (local79 + ((Static31.anIntArray106[local10] - local79) * local99 >> 16) << 9) / 50;
				Static31.anIntArray105[local5++] = local86 + (((this.anIntArray72[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static31.anIntArray92[0];
		local79 = Static31.anIntArray92[1];
		local86 = Static31.anIntArray92[2];
		local99 = Static31.anIntArray98[0];
		@Pc(614) int local614 = Static31.anIntArray98[1];
		@Pc(618) int local618 = Static31.anIntArray98[2];
		Static208.aBoolean313 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static208.anInt4132 || local79 > Static208.anInt4132 || local86 > Static208.anInt4132) {
				Static208.aBoolean313 = true;
			}
			if (this.aShortArray10 != null && this.aShortArray10[arg0] != -1) {
				if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray9[arg0] & 0xFF;
					local709 = this.anIntArray81[local704];
					local714 = this.anIntArray77[local704];
					local719 = this.anIntArray73[local704];
				}
				if (this.anIntArray71[arg0] == -1) {
					Static208.method3239(local99, local614, local618, local75, local79, local86, this.anIntArray72[arg0], this.anIntArray72[arg0], this.anIntArray72[arg0], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], this.aShortArray10[arg0]);
				} else {
					Static208.method3239(local99, local614, local618, local75, local79, local86, Static31.anIntArray105[0], Static31.anIntArray105[1], Static31.anIntArray105[2], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], this.aShortArray10[arg0]);
				}
			} else if (this.anIntArray71[arg0] == -1) {
				Static208.method3240(local99, local614, local618, local75, local79, local86, Static208.anIntArray476[this.anIntArray72[arg0] & 0xFFFF]);
			} else {
				Static208.method3254(local99, local614, local618, local75, local79, local86, Static31.anIntArray105[0], Static31.anIntArray105[1], Static31.anIntArray105[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static208.anInt4132 || local79 > Static208.anInt4132 || local86 > Static208.anInt4132 || Static31.anIntArray92[3] < 0 || Static31.anIntArray92[3] > Static208.anInt4132) {
			Static208.aBoolean313 = true;
		}
		if (this.aShortArray10 != null && this.aShortArray10[arg0] != -1) {
			if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray9[arg0] & 0xFF;
				local709 = this.anIntArray81[local704];
				local714 = this.anIntArray77[local704];
				local719 = this.anIntArray73[local704];
			}
			@Pc(984) short local984 = this.aShortArray10[arg0];
			if (this.anIntArray71[arg0] == -1) {
				Static208.method3239(local99, local614, local618, local75, local79, local86, this.anIntArray72[arg0], this.anIntArray72[arg0], this.anIntArray72[arg0], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], local984);
				Static208.method3239(local99, local618, Static31.anIntArray98[3], local75, local86, Static31.anIntArray92[3], this.anIntArray72[arg0], this.anIntArray72[arg0], this.anIntArray72[arg0], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], local984);
			} else {
				Static208.method3239(local99, local614, local618, local75, local79, local86, Static31.anIntArray105[0], Static31.anIntArray105[1], Static31.anIntArray105[2], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], local984);
				Static208.method3239(local99, local618, Static31.anIntArray98[3], local75, local86, Static31.anIntArray92[3], Static31.anIntArray105[0], Static31.anIntArray105[2], Static31.anIntArray105[3], Static31.anIntArray97[local709], Static31.anIntArray97[local714], Static31.anIntArray97[local719], Static31.anIntArray106[local709], Static31.anIntArray106[local714], Static31.anIntArray106[local719], Static31.anIntArray103[local709], Static31.anIntArray103[local714], Static31.anIntArray103[local719], local984);
			}
		} else if (this.anIntArray71[arg0] == -1) {
			local709 = Static208.anIntArray476[this.anIntArray72[arg0] & 0xFFFF];
			Static208.method3240(local99, local614, local618, local75, local79, local86, local709);
			Static208.method3240(local99, local618, Static31.anIntArray98[3], local75, local86, Static31.anIntArray92[3], local709);
		} else {
			Static208.method3254(local99, local614, local618, local75, local79, local86, Static31.anIntArray105[0], Static31.anIntArray105[1], Static31.anIntArray105[2]);
			Static208.method3254(local99, local618, Static31.anIntArray98[3], local75, local86, Static31.anIntArray92[3], Static31.anIntArray105[0], Static31.anIntArray105[2], Static31.anIntArray105[3]);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2068(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static31.aByteArray10.length < this.anInt693) {
			Static31.aByteArray10 = new byte[this.anInt693 + 100];
		}
		if (!arg1 && Static31.aShortArray11.length < this.anInt693) {
			Static31.anIntArray83 = new int[this.anInt693 + 100];
			Static31.anIntArray80 = new int[this.anInt693 + 100];
			Static31.anIntArray82 = new int[this.anInt693 + 100];
			Static31.aShortArray11 = new short[this.anInt693 + 100];
		}
		return this.method591(arg0, arg1, Static31.aClass6_Sub2_Sub1_1, Static31.aByteArray10, Static31.aShortArray11, Static31.anIntArray83, Static31.anIntArray80, Static31.anIntArray82);
	}

	@OriginalMember(owner = "client!c", name = "o", descriptor = "()V")
	private void method595() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt693; local1++) {
			@Pc(15) short local15 = this.aShortArray10 == null ? -1 : this.aShortArray10[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray8[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray71[local1] == -1) {
					local38 = this.anIntArray72[local1] & 0xFFFE0000;
					this.anIntArray72[local1] = local38 | Static31.method589(local25, local38 >> 17);
				} else if (this.anIntArray71[local1] != -2) {
					local38 = this.anIntArray72[local1] & 0xFFFE0000;
					this.anIntArray72[local1] = local38 | Static31.method589(local25, local38 >> 17);
					local38 = this.anIntArray79[local1] & 0xFFFE0000;
					this.anIntArray79[local1] = local38 | Static31.method589(local25, local38 >> 17);
					local38 = this.anIntArray71[local1] & 0xFFFE0000;
					this.anIntArray71[local1] = local38 | Static31.method589(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "q", descriptor = "()V")
	private void method597() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt691; local17++) {
			@Pc(26) int local26 = this.anIntArray76[local17];
			@Pc(31) int local31 = this.anIntArray70[local17];
			@Pc(36) int local36 = this.anIntArray74[local17];
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
		this.aShort8 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort5 = (short) local3;
		this.aShort9 = (short) local9;
		this.aShort10 = (short) local5;
		this.aShort7 = (short) local11;
		this.aShort4 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort11 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
	@Override
	protected void method2080() {
		if (this.aBoolean67) {
			this.method595();
			this.aBoolean67 = false;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZJIILclient!pe;)V")
	private void method598(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class91_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static31.aBoolean69) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray91[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray99[local11] = 0;
			}
			Static31.anInt697 = 0;
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
		for (local11 = 0; local11 < this.anInt693; local11++) {
			if (this.anIntArray71[local11] != -2) {
				local51 = this.anIntArray75[local11];
				local56 = this.anIntArray78[local11];
				local61 = this.anIntArray69[local11];
				local65 = Static31.anIntArray88[local51];
				local69 = Static31.anIntArray88[local56];
				@Pc(73) int local73 = Static31.anIntArray88[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static31.anIntArray97[local51];
					local92 = Static31.anIntArray97[local56];
					local96 = Static31.anIntArray97[local61];
					@Pc(100) int local100 = Static31.anIntArray106[local51];
					local104 = Static31.anIntArray106[local56];
					@Pc(108) int local108 = Static31.anIntArray106[local61];
					@Pc(112) int local112 = Static31.anIntArray103[local51];
					@Pc(116) int local116 = Static31.anIntArray103[local56];
					@Pc(120) int local120 = Static31.anIntArray103[local61];
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
						Static31.aBooleanArray4[local11] = true;
						if (Static31.aBoolean69) {
							anIntArray93[local5] = (Static31.anIntArray95[local51] + Static31.anIntArray95[local56] + Static31.anIntArray95[local61]) / 3;
							anIntArray104[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static31.anIntArray95[local51] + Static31.anIntArray95[local56] + Static31.anIntArray95[local61]) / 3 + arg3;
							if (anIntArray91[local224] < 64) {
								anIntArrayArray9[local224][anIntArray91[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray91[local224];
								if (local247 == 64) {
									if (Static31.anInt697 == 512) {
										continue;
									}
									anIntArray91[local224] = local247 = Static31.anInt697++ + 65;
								}
								local247 -= 65;
								anIntArrayArray7[local247][anIntArray99[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method586(Static134.anInt2546 + Static208.anInt4133, Static67.anInt1387 + Static208.anInt4134, Static31.anIntArray87[local51], Static31.anIntArray87[local56], Static31.anIntArray87[local61], local65, local69, local73)) {
						Static158.aLongArray8[Static270.anInt5412++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static31.anIntArray87[local61] - Static31.anIntArray87[local56]) - (Static31.anIntArray87[local51] - Static31.anIntArray87[local56]) * (local73 - local69) > 0) {
						Static31.aBooleanArray4[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static208.anInt4132 && local69 <= Static208.anInt4132 && local73 <= Static208.anInt4132) {
							Static31.aBooleanArray3[local11] = false;
						} else {
							Static31.aBooleanArray3[local11] = true;
						}
						if (Static31.aBoolean69) {
							anIntArray93[local5] = (Static31.anIntArray95[local51] + Static31.anIntArray95[local56] + Static31.anIntArray95[local61]) / 3;
							anIntArray104[local5++] = local11;
						} else {
							local88 = (Static31.anIntArray95[local51] + Static31.anIntArray95[local56] + Static31.anIntArray95[local61]) / 3 + arg3;
							if (anIntArray91[local88] < 64) {
								anIntArrayArray9[local88][anIntArray91[local88]++] = local11;
							} else {
								local92 = anIntArray91[local88];
								if (local92 == 64) {
									if (Static31.anInt697 == 512) {
										continue;
									}
									anIntArray91[local88] = local92 = Static31.anInt697++ + 65;
								}
								local92 -= 65;
								anIntArrayArray7[local92][anIntArray99[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static31.aBoolean69) {
			Static58.method1007(local5 - 1, anIntArray93, anIntArray104, 0);
			if (this.aByteArray8 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method587(anIntArray104[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static31.anIntArray89[local11] = 0;
				Static31.anIntArray101[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray104[local11];
				local56 = anIntArray93[local11];
				@Pc(523) byte local523 = this.aByteArray8[local51];
				local65 = Static31.anIntArray89[local523]++;
				Static31.anIntArrayArray8[local523][local65] = local51;
				if (local523 < 10) {
					Static31.anIntArray101[local523] += local56;
				} else if (local523 == 10) {
					Static31.anIntArray102[local65] = local56;
				} else {
					Static31.anIntArray100[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray8 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray91[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = anIntArrayArray9[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method587(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray91[local11] - 64 - 1;
						local590 = anIntArrayArray7[local56];
						for (local65 = 0; local65 < anIntArray99[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method587(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static31.anIntArray89[local11] = 0;
				Static31.anIntArray101[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray91[local11];
				@Pc(704) byte local704;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local590 = anIntArrayArray9[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray8[local69];
							local88 = Static31.anIntArray89[local704]++;
							Static31.anIntArrayArray8[local704][local88] = local69;
							if (local704 < 10) {
								Static31.anIntArray101[local704] += local11;
							} else if (local704 == 10) {
								Static31.anIntArray102[local88] = local11;
							} else {
								Static31.anIntArray100[local88] = local11;
							}
						} else {
							Static31.anIntArray96[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray91[local11] - 64 - 1;
					local590 = anIntArrayArray7[local56];
					for (local65 = 0; local65 < anIntArray99[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray8[local69];
							local88 = Static31.anIntArray89[local704]++;
							Static31.anIntArrayArray8[local704][local88] = local69;
							if (local704 < 10) {
								Static31.anIntArray101[local704] += local11;
							} else if (local704 == 10) {
								Static31.anIntArray102[local88] = local11;
							} else {
								Static31.anIntArray100[local88] = local11;
							}
						} else {
							Static31.anIntArray96[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static31.anIntArray89[1] > 0 || Static31.anIntArray89[2] > 0) {
			local11 = (Static31.anIntArray101[1] + Static31.anIntArray101[2]) / (Static31.anIntArray89[1] + Static31.anIntArray89[2]);
		}
		local51 = 0;
		if (Static31.anIntArray89[3] > 0 || Static31.anIntArray89[4] > 0) {
			local51 = (Static31.anIntArray101[3] + Static31.anIntArray101[4]) / (Static31.anIntArray89[3] + Static31.anIntArray89[4]);
		}
		local56 = 0;
		if (Static31.anIntArray89[6] > 0 || Static31.anIntArray89[8] > 0) {
			local56 = (Static31.anIntArray101[6] + Static31.anIntArray101[8]) / (Static31.anIntArray89[6] + Static31.anIntArray89[8]);
		}
		local65 = 0;
		local69 = Static31.anIntArray89[10];
		@Pc(928) int[] local928 = Static31.anIntArrayArray8[10];
		@Pc(930) int[] local930 = Static31.anIntArray102;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static31.anIntArray89[11];
			local928 = Static31.anIntArrayArray8[11];
			local930 = Static31.anIntArray100;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method587(local928[local65++]);
				if (local65 == local69 && local928 != Static31.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static31.anIntArray89[11];
					local928 = Static31.anIntArrayArray8[11];
					local930 = Static31.anIntArray100;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method587(local928[local65++]);
				if (local65 == local69 && local928 != Static31.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static31.anIntArray89[11];
					local928 = Static31.anIntArrayArray8[11];
					local930 = Static31.anIntArray100;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method587(local928[local65++]);
				if (local65 == local69 && local928 != Static31.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static31.anIntArray89[11];
					local928 = Static31.anIntArrayArray8[11];
					local930 = Static31.anIntArray100;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static31.anIntArray89[local92];
			@Pc(1096) int[] local1096 = Static31.anIntArrayArray8[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method587(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method587(local928[local65++]);
			if (local65 == local69 && local928 != Static31.anIntArrayArray8[11]) {
				local65 = 0;
				local928 = Static31.anIntArrayArray8[11];
				local69 = Static31.anIntArray89[11];
				local930 = Static31.anIntArray100;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
	@Override
	public void method2071() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt690; local1++) {
			@Pc(10) int local10 = this.anIntArray76[local1];
			this.anIntArray76[local1] = this.anIntArray74[local1];
			this.anIntArray74[local1] = -local10;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()I")
	@Override
	public int method2083() {
		if (!this.aBoolean66) {
			this.method597();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!c;")
	public Class6_Sub2_Sub1 method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean66) {
			this.method597();
		}
		@Pc(9) int local9 = arg4 + this.aShort8;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort10;
		@Pc(24) int local24 = arg6 + this.aShort7;
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
		@Pc(150) Class6_Sub2_Sub1 local150;
		if (arg7) {
			local150 = new Class6_Sub2_Sub1();
			local150.anInt690 = this.anInt690;
			local150.anInt691 = this.anInt691;
			local150.anInt693 = this.anInt693;
			local150.anInt692 = this.anInt692;
			local150.anIntArray75 = this.anIntArray75;
			local150.anIntArray78 = this.anIntArray78;
			local150.anIntArray69 = this.anIntArray69;
			local150.anIntArray72 = this.anIntArray72;
			local150.anIntArray79 = this.anIntArray79;
			local150.anIntArray71 = this.anIntArray71;
			local150.aByteArray8 = this.aByteArray8;
			local150.aByteArray9 = this.aByteArray9;
			local150.aShortArray10 = this.aShortArray10;
			local150.aShortArray8 = this.aShortArray8;
			local150.aByteArray7 = this.aByteArray7;
			local150.aByte6 = this.aByte6;
			local150.anIntArray81 = this.anIntArray81;
			local150.anIntArray77 = this.anIntArray77;
			local150.anIntArray73 = this.anIntArray73;
			local150.anIntArrayArray6 = this.anIntArrayArray6;
			local150.anIntArrayArray5 = this.anIntArrayArray5;
			local150.aShortArray12 = this.aShortArray12;
			local150.aShortArray9 = this.aShortArray9;
			local150.aBoolean176 = this.aBoolean176;
			if (arg0 == 3) {
				local150.anIntArray76 = Static188.method2836(this.anIntArray76);
				local150.anIntArray70 = Static188.method2836(this.anIntArray70);
				local150.anIntArray74 = Static188.method2836(this.anIntArray74);
			} else {
				local150.anIntArray76 = this.anIntArray76;
				local150.anIntArray70 = new int[local150.anInt690];
				local150.anIntArray74 = this.anIntArray74;
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
			for (local289 = 0; local289 < local150.anInt691; local289++) {
				local300 = this.anIntArray76[local289] + arg4;
				local307 = this.anIntArray74[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray70[local289] = this.anIntArray70[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt691; local289 < local150.anInt690; local289++) {
				local300 = this.anIntArray76[local289] + arg4;
				local307 = this.anIntArray74[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray70[local289] = this.anIntArray70[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt691; local289++) {
					local300 = (this.anIntArray70[local289] << 16) / this.aShort5;
					if (local300 < arg1) {
						local307 = this.anIntArray76[local289] + arg4;
						local311 = this.anIntArray74[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray70[local289] = this.anIntArray70[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray70[local289] = this.anIntArray70[local289];
					}
				}
				for (local289 = local150.anInt691; local289 < local150.anInt690; local289++) {
					local300 = (this.anIntArray70[local289] << 16) / this.aShort5;
					if (local300 < arg1) {
						local307 = this.anIntArray76[local289] + arg4;
						local311 = this.anIntArray74[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray70[local289] = this.anIntArray70[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray70[local289] = this.anIntArray70[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method2095(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort9 - this.aShort5;
				for (local300 = 0; local300 < this.anInt691; local300++) {
					local307 = this.anIntArray76[local300] + arg4;
					local311 = this.anIntArray74[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray70[local300] = this.anIntArray70[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt691; local300 < local150.anInt690; local300++) {
					local307 = this.anIntArray76[local300] + arg4;
					local311 = this.anIntArray74[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray70[local300] = this.anIntArray70[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort9 - this.aShort5;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt691; local300++) {
					local307 = this.anIntArray76[local300] + arg4;
					local311 = this.anIntArray74[local300] + arg6;
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
					local150.anIntArray70[local300] = ((this.anIntArray70[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt691; local300 < local150.anInt690; local300++) {
					local307 = this.anIntArray76[local300] + arg4;
					local311 = this.anIntArray74[local300] + arg6;
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
						local150.anIntArray70[local300] = ((this.anIntArray70[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean66 = false;
		return local150;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	@Override
	public void method2070(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt690; local9++) {
			@Pc(29) int local29 = this.anIntArray70[local9] * local7 - this.anIntArray74[local9] * local3 >> 16;
			this.anIntArray74[local9] = this.anIntArray70[local9] * local3 + this.anIntArray74[local9] * local7 >> 16;
			this.anIntArray70[local9] = local29;
		}
		this.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "()Z")
	@Override
	protected boolean method2088() {
		if (this.anIntArrayArray6 == null) {
			return false;
		} else {
			Static31.anInt696 = 0;
			Static31.anInt694 = 0;
			Static31.anInt695 = 0;
			return true;
		}
	}
}
