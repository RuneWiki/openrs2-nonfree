import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class36_Sub2_Sub2 extends Class36_Sub2 {

	@OriginalMember(owner = "client!u", name = "Ab", descriptor = "[I")
	public static int[] anIntArray444;

	@OriginalMember(owner = "client!u", name = "Pb", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!u", name = "Jb", descriptor = "[I")
	public static int[] anIntArray450;

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "[I")
	private int[] anIntArray421;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "[I")
	private int[] anIntArray422;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "[I")
	private int[] anIntArray423;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "[I")
	private int[] anIntArray425;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!u", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!u", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "I")
	private int anInt5252 = 0;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "I")
	private int anInt5251 = 0;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	private int anInt5250 = 0;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "I")
	public int anInt5253 = 0;

	static {
		if (Static262.aBoolean439) {
			anIntArray444 = new int[4096];
			anIntArray454 = new int[4096];
		} else {
			anIntArray450 = new int[1600];
			anIntArrayArray40 = new int[1600][64];
			anIntArray437 = new int[32];
			anIntArrayArray38 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class36_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!vi;IIIII)V")
	public Class36_Sub2_Sub2(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method4207();
		arg0.method4198();
		this.anInt5253 = arg0.anInt5548;
		this.anInt5252 = arg0.anInt5545;
		this.anIntArray430 = arg0.anIntArray486;
		this.anIntArray427 = arg0.anIntArray483;
		this.anIntArray426 = arg0.anIntArray482;
		this.anInt5250 = arg0.anInt5547;
		this.anIntArray421 = arg0.anIntArray479;
		this.anIntArray424 = arg0.anIntArray488;
		this.anIntArray425 = arg0.anIntArray477;
		this.aByteArray54 = arg0.aByteArray69;
		this.aByteArray52 = arg0.aByteArray71;
		this.aByte20 = arg0.aByte21;
		this.aShortArray59 = arg0.aShortArray75;
		this.anIntArrayArray36 = arg0.anIntArrayArray42;
		this.anIntArrayArray37 = arg0.anIntArrayArray43;
		this.aShortArray58 = arg0.aShortArray74;
		this.aShortArray57 = arg0.aShortArray76;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray419 = new int[this.anInt5250];
		this.anIntArray429 = new int[this.anInt5250];
		this.anIntArray422 = new int[this.anInt5250];
		@Pc(140) int local140;
		if (arg0.aShortArray78 == null) {
			this.aShortArray60 = null;
		} else {
			this.aShortArray60 = new short[this.anInt5250];
			for (local140 = 0; local140 < this.anInt5250; local140++) {
				@Pc(149) short local149 = arg0.aShortArray78[local140];
				if (local149 != -1 && Static96.anInterface4_1.method1271(local149)) {
					this.aShortArray60[local140] = local149;
				} else {
					this.aShortArray60[local140] = -1;
				}
			}
		}
		if (arg0.anInt5546 > 0 && arg0.aByteArray72 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt5546];
			@Pc(186) int local186;
			for (local186 = 0; local186 < this.anInt5250; local186++) {
				if (arg0.aByteArray72[local186] != -1) {
					local184[arg0.aByteArray72[local186] & 0xFF]++;
				}
			}
			this.anInt5251 = 0;
			for (local186 = 0; local186 < arg0.anInt5546; local186++) {
				if (local184[local186] > 0 && arg0.aByteArray67[local186] == 0) {
					this.anInt5251++;
				}
			}
			this.anIntArray420 = new int[this.anInt5251];
			this.anIntArray428 = new int[this.anInt5251];
			this.anIntArray423 = new int[this.anInt5251];
			local186 = 0;
			@Pc(255) int local255;
			for (local255 = 0; local255 < arg0.anInt5546; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray67[local255] == 0) {
					this.anIntArray420[local186] = arg0.aShortArray72[local255] & 0xFFFF;
					this.anIntArray428[local186] = arg0.aShortArray77[local255] & 0xFFFF;
					this.anIntArray423[local186] = arg0.aShortArray79[local255] & 0xFFFF;
					local184[local255] = local186++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray53 = new byte[this.anInt5250];
			for (local255 = 0; local255 < this.anInt5250; local255++) {
				if (arg0.aByteArray72[local255] == -1) {
					this.aByteArray53[local255] = -1;
				} else {
					this.aByteArray53[local255] = (byte) local184[arg0.aByteArray72[local255] & 0xFF];
					if (this.aByteArray53[local255] == -1 && this.aShortArray60 != null) {
						this.aShortArray60[local255] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt5250; local140++) {
			@Pc(373) byte local373;
			if (arg0.aByteArray64 == null) {
				local373 = 0;
			} else {
				local373 = arg0.aByteArray64[local140];
			}
			@Pc(384) byte local384;
			if (arg0.aByteArray71 == null) {
				local384 = 0;
			} else {
				local384 = arg0.aByteArray71[local140];
			}
			@Pc(395) short local395;
			if (this.aShortArray60 == null) {
				local395 = -1;
			} else {
				local395 = this.aShortArray60[local140];
			}
			if (local384 == -2) {
				local373 = 3;
			}
			if (local384 == -1) {
				local373 = 2;
			}
			@Pc(442) Class137 local442;
			@Pc(475) int local475;
			@Pc(621) Class180 local621;
			if (local395 == -1) {
				if (local373 == 0) {
					@Pc(423) int local423 = arg0.aShortArray75[local140] & 0xFFFF;
					if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray421[local140]] == null) {
						local442 = arg0.aClass137Array2[this.anIntArray421[local140]];
					} else {
						local442 = arg0.aClass137Array1[this.anIntArray421[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383) << 17;
					this.anIntArray419[local140] = local475 | Static262.method3966(local423, local475 >> 17);
					if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray424[local140]] == null) {
						local442 = arg0.aClass137Array2[this.anIntArray424[local140]];
					} else {
						local442 = arg0.aClass137Array1[this.anIntArray424[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383) << 17;
					this.anIntArray429[local140] = local475 | Static262.method3966(local423, local475 >> 17);
					if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray425[local140]] == null) {
						local442 = arg0.aClass137Array2[this.anIntArray425[local140]];
					} else {
						local442 = arg0.aClass137Array1[this.anIntArray425[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383) << 17;
					this.anIntArray422[local140] = local475 | Static262.method3966(local423, local475 >> 17);
				} else if (local373 == 1) {
					local621 = arg0.aClass180Array1[local140];
					local475 = arg1 + (arg3 * local621.anInt5702 + arg4 * local621.anInt5703 + arg5 * local621.anInt5698) / (local115 + local115 / 2) << 17;
					this.anIntArray419[local140] = local475 | Static262.method3966(arg0.aShortArray75[local140] & 0xFFFF, local475 >> 17);
					this.anIntArray422[local140] = -1;
				} else if (local373 == 3) {
					this.anIntArray419[local140] = 128;
					this.anIntArray422[local140] = -1;
				} else {
					this.anIntArray422[local140] = -2;
				}
			} else if (local373 == 0) {
				if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray421[local140]] == null) {
					local442 = arg0.aClass137Array2[this.anIntArray421[local140]];
				} else {
					local442 = arg0.aClass137Array1[this.anIntArray421[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383);
				this.anIntArray419[local140] = Static262.method3969(local475);
				if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray424[local140]] == null) {
					local442 = arg0.aClass137Array2[this.anIntArray424[local140]];
				} else {
					local442 = arg0.aClass137Array1[this.anIntArray424[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383);
				this.anIntArray429[local140] = Static262.method3969(local475);
				if (arg0.aClass137Array1 == null || arg0.aClass137Array1[this.anIntArray425[local140]] == null) {
					local442 = arg0.aClass137Array2[this.anIntArray425[local140]];
				} else {
					local442 = arg0.aClass137Array1[this.anIntArray425[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt4382 + arg4 * local442.anInt4384 + arg5 * local442.anInt4385) / (local115 * local442.anInt4383);
				this.anIntArray422[local140] = Static262.method3969(local475);
			} else if (local373 == 1) {
				local621 = arg0.aClass180Array1[local140];
				local475 = arg1 + (arg3 * local621.anInt5702 + arg4 * local621.anInt5703 + arg5 * local621.anInt5698) / (local115 + local115 / 2);
				this.anIntArray419[local140] = Static262.method3969(local475);
				this.anIntArray422[local140] = -1;
			} else {
				this.anIntArray422[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([Lclient!u;I)V")
	private Class36_Sub2_Sub2(@OriginalArg(0) Class36_Sub2_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt5253 = 0;
		this.anInt5250 = 0;
		this.anInt5251 = 0;
		this.aByte20 = -1;
		@Pc(48) int local48;
		@Pc(55) Class36_Sub2_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt5253 += local55.anInt5253;
				this.anInt5250 += local55.anInt5250;
				this.anInt5251 += local55.anInt5251;
				if (local55.aByteArray54 == null) {
					if (this.aByte20 == -1) {
						this.aByte20 = local55.aByte20;
					}
					if (this.aByte20 != local55.aByte20) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray52 != null;
				local28 |= local55.aShortArray60 != null;
				local30 |= local55.aByteArray53 != null;
			}
		}
		this.anIntArray430 = new int[this.anInt5253];
		this.anIntArray427 = new int[this.anInt5253];
		this.anIntArray426 = new int[this.anInt5253];
		this.anIntArray421 = new int[this.anInt5250];
		this.anIntArray424 = new int[this.anInt5250];
		this.anIntArray425 = new int[this.anInt5250];
		this.anIntArray419 = new int[this.anInt5250];
		this.anIntArray429 = new int[this.anInt5250];
		this.anIntArray422 = new int[this.anInt5250];
		if (local24) {
			this.aByteArray54 = new byte[this.anInt5250];
		}
		if (local26) {
			this.aByteArray52 = new byte[this.anInt5250];
		}
		if (local28) {
			this.aShortArray60 = new short[this.anInt5250];
		}
		if (local30) {
			this.aByteArray53 = new byte[this.anInt5250];
		}
		if (this.anInt5251 > 0) {
			this.anIntArray420 = new int[this.anInt5251];
			this.anIntArray428 = new int[this.anInt5251];
			this.anIntArray423 = new int[this.anInt5251];
		}
		this.aShortArray59 = new short[this.anInt5250];
		this.anInt5253 = 0;
		this.anInt5250 = 0;
		this.anInt5251 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(254) int local254;
				for (local254 = 0; local254 < local55.anInt5250; local254++) {
					this.anIntArray421[this.anInt5250] = local55.anIntArray421[local254] + this.anInt5253;
					this.anIntArray424[this.anInt5250] = local55.anIntArray424[local254] + this.anInt5253;
					this.anIntArray425[this.anInt5250] = local55.anIntArray425[local254] + this.anInt5253;
					this.anIntArray419[this.anInt5250] = local55.anIntArray419[local254];
					this.anIntArray429[this.anInt5250] = local55.anIntArray429[local254];
					this.anIntArray422[this.anInt5250] = local55.anIntArray422[local254];
					this.aShortArray59[this.anInt5250] = local55.aShortArray59[local254];
					if (local24) {
						if (local55.aByteArray54 == null) {
							this.aByteArray54[this.anInt5250] = local55.aByte20;
						} else {
							this.aByteArray54[this.anInt5250] = local55.aByteArray54[local254];
						}
					}
					if (local26 && local55.aByteArray52 != null) {
						this.aByteArray52[this.anInt5250] = local55.aByteArray52[local254];
					}
					if (local28) {
						if (local55.aShortArray60 == null) {
							this.aShortArray60[this.anInt5250] = -1;
						} else {
							this.aShortArray60[this.anInt5250] = local55.aShortArray60[local254];
						}
					}
					if (local30) {
						this.aByteArray53[this.anInt5250] = (byte) (local55.aByteArray53 == null || local55.aByteArray53[local254] == -1 ? -1 : local55.aByteArray53[local254] + this.anInt5251);
					}
					this.anInt5250++;
				}
				for (local254 = 0; local254 < local55.anInt5251; local254++) {
					if (local55.anIntArray420[local254] < local55.anInt5252) {
						this.anIntArray420[this.anInt5251] = local55.anIntArray420[local254] + this.anInt5253;
					}
					if (local55.anIntArray428[local254] < local55.anInt5252) {
						this.anIntArray428[this.anInt5251] = local55.anIntArray428[local254] + this.anInt5253;
					}
					if (local55.anIntArray423[local254] < local55.anInt5252) {
						this.anIntArray423[this.anInt5251] = local55.anIntArray423[local254] + this.anInt5253;
					}
					this.anInt5251++;
				}
				for (local254 = 0; local254 < local55.anInt5252; local254++) {
					this.anIntArray430[this.anInt5253] = local55.anIntArray430[local254];
					this.anIntArray427[this.anInt5253] = local55.anIntArray427[local254];
					this.anIntArray426[this.anInt5253] = local55.anIntArray426[local254];
					this.anInt5253++;
				}
			}
		}
		local48 = 0;
		this.anInt5252 = this.anInt5253;
		for (@Pc(543) int local543 = 0; local543 < arg1; local543++) {
			@Pc(550) Class36_Sub2_Sub2 local550 = arg0[local543];
			if (local550 != null) {
				@Pc(554) int local554;
				for (local554 = 0; local554 < local550.anInt5251; local554++) {
					if (local550.anIntArray420[local554] >= local550.anInt5252) {
						this.anIntArray420[local48] = local550.anIntArray420[local554] + this.anInt5253 - local550.anInt5252;
					}
					if (local550.anIntArray428[local554] >= local550.anInt5252) {
						this.anIntArray428[local48] = local550.anIntArray428[local554] + this.anInt5253 - local550.anInt5252;
					}
					if (local550.anIntArray423[local554] >= local550.anInt5252) {
						this.anIntArray423[local48] = local550.anIntArray423[local554] + this.anInt5253 - local550.anInt5252;
					}
					local48++;
				}
				for (local554 = local550.anInt5252; local554 < local550.anInt5253; local554++) {
					this.anIntArray430[this.anInt5253] = local550.anIntArray430[local554];
					this.anIntArray427[this.anInt5253] = local550.anIntArray427[local554];
					this.anIntArray426[this.anInt5253] = local550.anIntArray426[local554];
					this.anInt5253++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "l", descriptor = "()Z")
	@Override
	protected boolean method3960() {
		if (this.anIntArrayArray36 == null) {
			return false;
		} else {
			Static262.anInt5254 = 0;
			Static262.anInt5255 = 0;
			Static262.anInt5257 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZJIILclient!rb;)V")
	private void method3967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static262.aBoolean439) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray450[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray437[local11] = 0;
			}
			Static262.anInt5256 = 0;
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
		for (local11 = 0; local11 < this.anInt5250; local11++) {
			if (this.anIntArray422[local11] != -2) {
				local51 = this.anIntArray421[local11];
				local56 = this.anIntArray424[local11];
				local61 = this.anIntArray425[local11];
				local65 = Static262.anIntArray451[local51];
				local69 = Static262.anIntArray451[local56];
				@Pc(73) int local73 = Static262.anIntArray451[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static262.anIntArray455[local51];
					local92 = Static262.anIntArray455[local56];
					local96 = Static262.anIntArray455[local61];
					@Pc(100) int local100 = Static262.anIntArray452[local51];
					local104 = Static262.anIntArray452[local56];
					@Pc(108) int local108 = Static262.anIntArray452[local61];
					@Pc(112) int local112 = Static262.anIntArray441[local51];
					@Pc(116) int local116 = Static262.anIntArray441[local56];
					@Pc(120) int local120 = Static262.anIntArray441[local61];
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
						Static262.aBooleanArray25[local11] = true;
						if (Static262.aBoolean439) {
							anIntArray444[local5] = (Static262.anIntArray440[local51] + Static262.anIntArray440[local56] + Static262.anIntArray440[local61]) / 3;
							anIntArray454[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static262.anIntArray440[local51] + Static262.anIntArray440[local56] + Static262.anIntArray440[local61]) / 3 + arg3;
							if (anIntArray450[local224] < 64) {
								anIntArrayArray40[local224][anIntArray450[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray450[local224];
								if (local247 == 64) {
									if (Static262.anInt5256 == 512) {
										continue;
									}
									anIntArray450[local224] = local247 = Static262.anInt5256++ + 65;
								}
								local247 -= 65;
								anIntArrayArray38[local247][anIntArray437[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method3978(Static198.anInt3919 + Static96.anInt1997, Static31.anInt746 + Static96.anInt1995, Static262.anIntArray453[local51], Static262.anIntArray453[local56], Static262.anIntArray453[local61], local65, local69, local73)) {
						Static79.aLongArray4[Static88.anInt1896++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static262.anIntArray453[local61] - Static262.anIntArray453[local56]) - (Static262.anIntArray453[local51] - Static262.anIntArray453[local56]) * (local73 - local69) > 0) {
						Static262.aBooleanArray25[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static96.anInt1996 && local69 <= Static96.anInt1996 && local73 <= Static96.anInt1996) {
							Static262.aBooleanArray24[local11] = false;
						} else {
							Static262.aBooleanArray24[local11] = true;
						}
						if (Static262.aBoolean439) {
							anIntArray444[local5] = (Static262.anIntArray440[local51] + Static262.anIntArray440[local56] + Static262.anIntArray440[local61]) / 3;
							anIntArray454[local5++] = local11;
						} else {
							local88 = (Static262.anIntArray440[local51] + Static262.anIntArray440[local56] + Static262.anIntArray440[local61]) / 3 + arg3;
							if (anIntArray450[local88] < 64) {
								anIntArrayArray40[local88][anIntArray450[local88]++] = local11;
							} else {
								local92 = anIntArray450[local88];
								if (local92 == 64) {
									if (Static262.anInt5256 == 512) {
										continue;
									}
									anIntArray450[local88] = local92 = Static262.anInt5256++ + 65;
								}
								local92 -= 65;
								anIntArrayArray38[local92][anIntArray437[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static262.aBoolean439) {
			Static139.method2218(anIntArray444, local5 - 1, 0, anIntArray454);
			if (this.aByteArray54 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method3979(anIntArray454[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static262.anIntArray442[local11] = 0;
				Static262.anIntArray447[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray454[local11];
				local56 = anIntArray444[local11];
				@Pc(523) byte local523 = this.aByteArray54[local51];
				local65 = Static262.anIntArray442[local523]++;
				Static262.anIntArrayArray39[local523][local65] = local51;
				if (local523 < 10) {
					Static262.anIntArray447[local523] += local56;
				} else if (local523 == 10) {
					Static262.anIntArray457[local65] = local56;
				} else {
					Static262.anIntArray448[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray54 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray450[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = anIntArrayArray40[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method3979(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray450[local11] - 64 - 1;
						local590 = anIntArrayArray38[local56];
						for (local65 = 0; local65 < anIntArray437[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method3979(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static262.anIntArray442[local11] = 0;
				Static262.anIntArray447[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray450[local11];
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
							local704 = this.aByteArray54[local69];
							local88 = Static262.anIntArray442[local704]++;
							Static262.anIntArrayArray39[local704][local88] = local69;
							if (local704 < 10) {
								Static262.anIntArray447[local704] += local11;
							} else if (local704 == 10) {
								Static262.anIntArray457[local88] = local11;
							} else {
								Static262.anIntArray448[local88] = local11;
							}
						} else {
							Static262.anIntArray446[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray450[local11] - 64 - 1;
					local590 = anIntArrayArray38[local56];
					for (local65 = 0; local65 < anIntArray437[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray54[local69];
							local88 = Static262.anIntArray442[local704]++;
							Static262.anIntArrayArray39[local704][local88] = local69;
							if (local704 < 10) {
								Static262.anIntArray447[local704] += local11;
							} else if (local704 == 10) {
								Static262.anIntArray457[local88] = local11;
							} else {
								Static262.anIntArray448[local88] = local11;
							}
						} else {
							Static262.anIntArray446[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static262.anIntArray442[1] > 0 || Static262.anIntArray442[2] > 0) {
			local11 = (Static262.anIntArray447[1] + Static262.anIntArray447[2]) / (Static262.anIntArray442[1] + Static262.anIntArray442[2]);
		}
		local51 = 0;
		if (Static262.anIntArray442[3] > 0 || Static262.anIntArray442[4] > 0) {
			local51 = (Static262.anIntArray447[3] + Static262.anIntArray447[4]) / (Static262.anIntArray442[3] + Static262.anIntArray442[4]);
		}
		local56 = 0;
		if (Static262.anIntArray442[6] > 0 || Static262.anIntArray442[8] > 0) {
			local56 = (Static262.anIntArray447[6] + Static262.anIntArray447[8]) / (Static262.anIntArray442[6] + Static262.anIntArray442[8]);
		}
		local65 = 0;
		local69 = Static262.anIntArray442[10];
		@Pc(928) int[] local928 = Static262.anIntArrayArray39[10];
		@Pc(930) int[] local930 = Static262.anIntArray457;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static262.anIntArray442[11];
			local928 = Static262.anIntArrayArray39[11];
			local930 = Static262.anIntArray448;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method3979(local928[local65++]);
				if (local65 == local69 && local928 != Static262.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static262.anIntArray442[11];
					local928 = Static262.anIntArrayArray39[11];
					local930 = Static262.anIntArray448;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method3979(local928[local65++]);
				if (local65 == local69 && local928 != Static262.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static262.anIntArray442[11];
					local928 = Static262.anIntArrayArray39[11];
					local930 = Static262.anIntArray448;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method3979(local928[local65++]);
				if (local65 == local69 && local928 != Static262.anIntArrayArray39[11]) {
					local65 = 0;
					local69 = Static262.anIntArray442[11];
					local928 = Static262.anIntArrayArray39[11];
					local930 = Static262.anIntArray448;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static262.anIntArray442[local92];
			@Pc(1096) int[] local1096 = Static262.anIntArrayArray39[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method3979(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method3979(local928[local65++]);
			if (local65 == local69 && local928 != Static262.anIntArrayArray39[11]) {
				local65 = 0;
				local928 = Static262.anIntArrayArray39[11];
				local69 = Static262.anIntArray442[11];
				local930 = Static262.anIntArray448;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()V")
	@Override
	public void method3940() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5253; local1++) {
			@Pc(10) int local10 = this.anIntArray426[local1];
			this.anIntArray426[local1] = this.anIntArray430[local1];
			this.anIntArray430[local1] = -local10;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static262.anInt5254 = 0;
			Static262.anInt5255 = 0;
			Static262.anInt5257 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray36.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray36[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static262.anInt5254 += this.anIntArray430[local41];
						Static262.anInt5255 += this.anIntArray427[local41];
						Static262.anInt5257 += this.anIntArray426[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static262.anInt5254 = Static262.anInt5254 / local6 + arg2;
				Static262.anInt5255 = Static262.anInt5255 / local6 + arg3;
				Static262.anInt5257 = Static262.anInt5257 / local6 + arg4;
			} else {
				Static262.anInt5254 = arg2;
				Static262.anInt5255 = arg3;
				Static262.anInt5257 = arg4;
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
						this.anIntArray430[local33] += arg2;
						this.anIntArray427[local33] += arg3;
						this.anIntArray426[local33] += arg4;
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
						this.anIntArray430[local33] -= Static262.anInt5254;
						this.anIntArray427[local33] -= Static262.anInt5255;
						this.anIntArray426[local33] -= Static262.anInt5257;
						if (arg4 != 0) {
							local41 = Class68.anIntArray137[arg4];
							local222 = Class68.anIntArray139[arg4];
							local240 = this.anIntArray427[local33] * local41 + this.anIntArray430[local33] * local222 + 32767 >> 16;
							this.anIntArray427[local33] = this.anIntArray427[local33] * local222 + 32767 - this.anIntArray430[local33] * local41 >> 16;
							this.anIntArray430[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class68.anIntArray137[arg2];
							local222 = Class68.anIntArray139[arg2];
							local240 = this.anIntArray427[local33] * local222 + 32767 - this.anIntArray426[local33] * local41 >> 16;
							this.anIntArray426[local33] = this.anIntArray427[local33] * local41 + this.anIntArray426[local33] * local222 + 32767 >> 16;
							this.anIntArray427[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class68.anIntArray137[arg3];
							local222 = Class68.anIntArray139[arg3];
							local240 = this.anIntArray426[local33] * local41 + this.anIntArray430[local33] * local222 + 32767 >> 16;
							this.anIntArray426[local33] = this.anIntArray426[local33] * local222 + 32767 - this.anIntArray430[local33] * local41 >> 16;
							this.anIntArray430[local33] = local240;
						}
						this.anIntArray430[local33] += Static262.anInt5254;
						this.anIntArray427[local33] += Static262.anInt5255;
						this.anIntArray426[local33] += Static262.anInt5257;
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
						this.anIntArray430[local33] -= Static262.anInt5254;
						this.anIntArray427[local33] -= Static262.anInt5255;
						this.anIntArray426[local33] -= Static262.anInt5257;
						this.anIntArray430[local33] = this.anIntArray430[local33] * arg2 / 128;
						this.anIntArray427[local33] = this.anIntArray427[local33] * arg3 / 128;
						this.anIntArray426[local33] = this.anIntArray426[local33] * arg4 / 128;
						this.anIntArray430[local33] += Static262.anInt5254;
						this.anIntArray427[local33] += Static262.anInt5255;
						this.anIntArray426[local33] += Static262.anInt5257;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray52 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray37.length) {
						local117 = this.anIntArrayArray37[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray52[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray52[local33] = (byte) local41;
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
						local41 = this.aShortArray59[local33] & 0xFFFF;
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
						this.aShortArray59[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean436 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "o", descriptor = "()V")
	private void method3970() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5250; local1++) {
			@Pc(15) short local15 = this.aShortArray60 == null ? -1 : this.aShortArray60[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray59[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray422[local1] == -1) {
					local38 = this.anIntArray419[local1] & 0xFFFE0000;
					this.anIntArray419[local1] = local38 | Static262.method3966(local25, local38 >> 17);
				} else if (this.anIntArray422[local1] != -2) {
					local38 = this.anIntArray419[local1] & 0xFFFE0000;
					this.anIntArray419[local1] = local38 | Static262.method3966(local25, local38 >> 17);
					local38 = this.anIntArray429[local1] & 0xFFFE0000;
					this.anIntArray429[local1] = local38 | Static262.method3966(local25, local38 >> 17);
					local38 = this.anIntArray422[local1] & 0xFFFE0000;
					this.anIntArray422[local1] = local38 | Static262.method3966(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	@Override
	public void method3965(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5253; local9++) {
			@Pc(29) int local29 = this.anIntArray426[local9] * local3 + this.anIntArray430[local9] * local7 >> 16;
			this.anIntArray426[local9] = this.anIntArray426[local9] * local7 - this.anIntArray430[local9] * local3 >> 16;
			this.anIntArray430[local9] = local29;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static262.anInt5254 = 0;
			Static262.anInt5255 = 0;
			Static262.anInt5257 = 0;
			for (local11 = 0; local11 < this.anInt5253; local11++) {
				Static262.anInt5254 += this.anIntArray430[local11];
				Static262.anInt5255 += this.anIntArray427[local11];
				Static262.anInt5257 += this.anIntArray426[local11];
				local3++;
			}
			if (local3 > 0) {
				Static262.anInt5254 = Static262.anInt5254 / local3 + arg1;
				Static262.anInt5255 = Static262.anInt5255 / local3 + arg2;
				Static262.anInt5257 = Static262.anInt5257 / local3 + arg3;
			} else {
				Static262.anInt5254 = arg1;
				Static262.anInt5255 = arg2;
				Static262.anInt5257 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt5253; local3++) {
				this.anIntArray430[local3] += arg1;
				this.anIntArray427[local3] += arg2;
				this.anIntArray426[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt5253; local3++) {
					this.anIntArray430[local3] -= Static262.anInt5254;
					this.anIntArray427[local3] -= Static262.anInt5255;
					this.anIntArray426[local3] -= Static262.anInt5257;
					if (arg3 != 0) {
						local11 = Class68.anIntArray137[arg3];
						local146 = Class68.anIntArray139[arg3];
						local164 = this.anIntArray427[local3] * local11 + this.anIntArray430[local3] * local146 + 32767 >> 16;
						this.anIntArray427[local3] = this.anIntArray427[local3] * local146 + 32767 - this.anIntArray430[local3] * local11 >> 16;
						this.anIntArray430[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class68.anIntArray137[arg1];
						local146 = Class68.anIntArray139[arg1];
						local164 = this.anIntArray427[local3] * local146 + 32767 - this.anIntArray426[local3] * local11 >> 16;
						this.anIntArray426[local3] = this.anIntArray427[local3] * local11 + this.anIntArray426[local3] * local146 + 32767 >> 16;
						this.anIntArray427[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class68.anIntArray137[arg2];
						local146 = Class68.anIntArray139[arg2];
						local164 = this.anIntArray426[local3] * local11 + this.anIntArray430[local3] * local146 + 32767 >> 16;
						this.anIntArray426[local3] = this.anIntArray426[local3] * local146 + 32767 - this.anIntArray430[local3] * local11 >> 16;
						this.anIntArray430[local3] = local164;
					}
					this.anIntArray430[local3] += Static262.anInt5254;
					this.anIntArray427[local3] += Static262.anInt5255;
					this.anIntArray426[local3] += Static262.anInt5257;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt5253; local3++) {
					this.anIntArray430[local3] -= Static262.anInt5254;
					this.anIntArray427[local3] -= Static262.anInt5255;
					this.anIntArray426[local3] -= Static262.anInt5257;
					this.anIntArray430[local3] = this.anIntArray430[local3] * arg1 / 128;
					this.anIntArray427[local3] = this.anIntArray427[local3] * arg2 / 128;
					this.anIntArray426[local3] = this.anIntArray426[local3] * arg3 / 128;
					this.anIntArray430[local3] += Static262.anInt5254;
					this.anIntArray427[local3] += Static262.anInt5255;
					this.anIntArray426[local3] += Static262.anInt5257;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt5250; local3++) {
					local11 = (this.aByteArray52[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray52[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt5250; local3++) {
					local11 = this.aShortArray59[local3] & 0xFFFF;
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
					this.aShortArray59[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean436 = true;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static262.aByteArray57.length < this.anInt5250) {
			Static262.aByteArray57 = new byte[this.anInt5250 + 100];
		}
		if (!arg1 && Static262.aShortArray63.length < this.anInt5250) {
			Static262.anIntArray439 = new int[this.anInt5250 + 100];
			Static262.anIntArray443 = new int[this.anInt5250 + 100];
			Static262.anIntArray456 = new int[this.anInt5250 + 100];
			Static262.aShortArray63 = new short[this.anInt5250 + 100];
		}
		return this.method3975(arg0, arg1, Static262.aClass36_Sub2_Sub2_3, Static262.aByteArray57, Static262.aShortArray63, Static262.anIntArray439, Static262.anIntArray443, Static262.anIntArray456);
	}

	@OriginalMember(owner = "client!u", name = "j", descriptor = "()I")
	@Override
	public int method3948() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!u", name = "i", descriptor = "()I")
	@Override
	public int method3947() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	private void method3972(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static96.anInt1997;
		@Pc(3) int local3 = Static96.anInt1995;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray421[arg0];
		@Pc(15) int local15 = this.anIntArray424[arg0];
		@Pc(20) int local20 = this.anIntArray425[arg0];
		@Pc(24) int local24 = Static262.anIntArray441[local10];
		@Pc(28) int local28 = Static262.anIntArray441[local15];
		@Pc(32) int local32 = Static262.anIntArray441[local20];
		if (this.aByteArray52 == null) {
			Static96.anInt1994 = 0;
		} else {
			Static96.anInt1994 = this.aByteArray52[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static262.anIntArray445[0] = Static262.anIntArray451[local10];
			Static262.anIntArray438[0] = Static262.anIntArray453[local10];
			local5++;
			Static262.anIntArray449[0] = this.anIntArray419[arg0] & 0xFFFF;
		} else {
			local75 = Static262.anIntArray455[local10];
			local79 = Static262.anIntArray452[local10];
			local86 = this.anIntArray419[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class68.anIntArray134[local32 - local24];
				Static262.anIntArray445[0] = local1 + (local75 + ((Static262.anIntArray455[local20] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[0] = local3 + (local79 + ((Static262.anIntArray452[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static262.anIntArray449[0] = local86 + (((this.anIntArray422[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class68.anIntArray134[local28 - local24];
				Static262.anIntArray445[local5] = local1 + (local75 + ((Static262.anIntArray455[local15] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[local5] = local3 + (local79 + ((Static262.anIntArray452[local15] - local79) * local99 >> 16) << 9) / 50;
				Static262.anIntArray449[local5++] = local86 + (((this.anIntArray429[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static262.anIntArray445[local5] = Static262.anIntArray451[local15];
			Static262.anIntArray438[local5] = Static262.anIntArray453[local15];
			Static262.anIntArray449[local5++] = this.anIntArray429[arg0] & 0xFFFF;
		} else {
			local75 = Static262.anIntArray455[local15];
			local79 = Static262.anIntArray452[local15];
			local86 = this.anIntArray429[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class68.anIntArray134[local24 - local28];
				Static262.anIntArray445[local5] = local1 + (local75 + ((Static262.anIntArray455[local10] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[local5] = local3 + (local79 + ((Static262.anIntArray452[local10] - local79) * local99 >> 16) << 9) / 50;
				Static262.anIntArray449[local5++] = local86 + (((this.anIntArray419[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class68.anIntArray134[local32 - local28];
				Static262.anIntArray445[local5] = local1 + (local75 + ((Static262.anIntArray455[local20] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[local5] = local3 + (local79 + ((Static262.anIntArray452[local20] - local79) * local99 >> 16) << 9) / 50;
				Static262.anIntArray449[local5++] = local86 + (((this.anIntArray422[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static262.anIntArray445[local5] = Static262.anIntArray451[local20];
			Static262.anIntArray438[local5] = Static262.anIntArray453[local20];
			Static262.anIntArray449[local5++] = this.anIntArray422[arg0] & 0xFFFF;
		} else {
			local75 = Static262.anIntArray455[local20];
			local79 = Static262.anIntArray452[local20];
			local86 = this.anIntArray422[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class68.anIntArray134[local28 - local32];
				Static262.anIntArray445[local5] = local1 + (local75 + ((Static262.anIntArray455[local15] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[local5] = local3 + (local79 + ((Static262.anIntArray452[local15] - local79) * local99 >> 16) << 9) / 50;
				Static262.anIntArray449[local5++] = local86 + (((this.anIntArray429[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class68.anIntArray134[local24 - local32];
				Static262.anIntArray445[local5] = local1 + (local75 + ((Static262.anIntArray455[local10] - local75) * local99 >> 16) << 9) / 50;
				Static262.anIntArray438[local5] = local3 + (local79 + ((Static262.anIntArray452[local10] - local79) * local99 >> 16) << 9) / 50;
				Static262.anIntArray449[local5++] = local86 + (((this.anIntArray419[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static262.anIntArray445[0];
		local79 = Static262.anIntArray445[1];
		local86 = Static262.anIntArray445[2];
		local99 = Static262.anIntArray438[0];
		@Pc(614) int local614 = Static262.anIntArray438[1];
		@Pc(618) int local618 = Static262.anIntArray438[2];
		Static96.aBoolean142 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static96.anInt1996 || local79 > Static96.anInt1996 || local86 > Static96.anInt1996) {
				Static96.aBoolean142 = true;
			}
			if (this.aShortArray60 != null && this.aShortArray60[arg0] != -1) {
				if (this.aByteArray53 == null || this.aByteArray53[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray53[arg0] & 0xFF;
					local709 = this.anIntArray420[local704];
					local714 = this.anIntArray428[local704];
					local719 = this.anIntArray423[local704];
				}
				if (this.anIntArray422[arg0] == -1) {
					Static96.method1522(local99, local614, local618, local75, local79, local86, this.anIntArray419[arg0], this.anIntArray419[arg0], this.anIntArray419[arg0], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], this.aShortArray60[arg0]);
				} else {
					Static96.method1522(local99, local614, local618, local75, local79, local86, Static262.anIntArray449[0], Static262.anIntArray449[1], Static262.anIntArray449[2], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], this.aShortArray60[arg0]);
				}
			} else if (this.anIntArray422[arg0] == -1) {
				Static96.method1519(local99, local614, local618, local75, local79, local86, Static96.anIntArray135[this.anIntArray419[arg0] & 0xFFFF]);
			} else {
				Static96.method1532(local99, local614, local618, local75, local79, local86, Static262.anIntArray449[0], Static262.anIntArray449[1], Static262.anIntArray449[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static96.anInt1996 || local79 > Static96.anInt1996 || local86 > Static96.anInt1996 || Static262.anIntArray445[3] < 0 || Static262.anIntArray445[3] > Static96.anInt1996) {
			Static96.aBoolean142 = true;
		}
		if (this.aShortArray60 != null && this.aShortArray60[arg0] != -1) {
			if (this.aByteArray53 == null || this.aByteArray53[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray53[arg0] & 0xFF;
				local709 = this.anIntArray420[local704];
				local714 = this.anIntArray428[local704];
				local719 = this.anIntArray423[local704];
			}
			@Pc(984) short local984 = this.aShortArray60[arg0];
			if (this.anIntArray422[arg0] == -1) {
				Static96.method1522(local99, local614, local618, local75, local79, local86, this.anIntArray419[arg0], this.anIntArray419[arg0], this.anIntArray419[arg0], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], local984);
				Static96.method1522(local99, local618, Static262.anIntArray438[3], local75, local86, Static262.anIntArray445[3], this.anIntArray419[arg0], this.anIntArray419[arg0], this.anIntArray419[arg0], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], local984);
			} else {
				Static96.method1522(local99, local614, local618, local75, local79, local86, Static262.anIntArray449[0], Static262.anIntArray449[1], Static262.anIntArray449[2], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], local984);
				Static96.method1522(local99, local618, Static262.anIntArray438[3], local75, local86, Static262.anIntArray445[3], Static262.anIntArray449[0], Static262.anIntArray449[2], Static262.anIntArray449[3], Static262.anIntArray455[local709], Static262.anIntArray455[local714], Static262.anIntArray455[local719], Static262.anIntArray452[local709], Static262.anIntArray452[local714], Static262.anIntArray452[local719], Static262.anIntArray441[local709], Static262.anIntArray441[local714], Static262.anIntArray441[local719], local984);
			}
		} else if (this.anIntArray422[arg0] == -1) {
			local709 = Static96.anIntArray135[this.anIntArray419[arg0] & 0xFFFF];
			Static96.method1519(local99, local614, local618, local75, local79, local86, local709);
			Static96.method1519(local99, local618, Static262.anIntArray438[3], local75, local86, Static262.anIntArray445[3], local709);
		} else {
			Static96.method1532(local99, local614, local618, local75, local79, local86, Static262.anIntArray449[0], Static262.anIntArray449[1], Static262.anIntArray449[2]);
			Static96.method1532(local99, local618, Static262.anIntArray438[3], local75, local86, Static262.anIntArray445[3], Static262.anIntArray449[0], Static262.anIntArray449[2], Static262.anIntArray449[3]);
		}
	}

	@OriginalMember(owner = "client!u", name = "k", descriptor = "()I")
	@Override
	public int method3951() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)V")
	public void method3973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean437) {
				this.method3976();
			}
			@Pc(6) int local6 = Static96.anInt1997;
			@Pc(8) int local8 = Static96.anInt1995;
			@Pc(12) int local12 = Class68.anIntArray137[0];
			@Pc(16) int local16 = Class68.anIntArray139[0];
			@Pc(20) int local20 = Class68.anIntArray137[arg0];
			@Pc(24) int local24 = Class68.anIntArray139[arg0];
			@Pc(28) int local28 = Class68.anIntArray137[arg1];
			@Pc(32) int local32 = Class68.anIntArray139[arg1];
			@Pc(36) int local36 = Class68.anIntArray137[arg2];
			@Pc(40) int local40 = Class68.anIntArray139[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5253; local52++) {
				@Pc(61) int local61 = this.anIntArray430[local52];
				@Pc(66) int local66 = this.anIntArray427[local52];
				@Pc(71) int local71 = this.anIntArray426[local52];
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
				Static262.anIntArray440[local52] = local71 - local50;
				Static262.anIntArray451[local52] = local6 + (local61 << 9) / arg6;
				Static262.anIntArray453[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt5251 > 0) {
					Static262.anIntArray455[local52] = local61;
					Static262.anIntArray452[local52] = local83;
					Static262.anIntArray441[local52] = local71;
				}
			}
			this.method3967(false, false, 0L, this.aShort22, this.aShort22 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "()V")
	@Override
	public void method3941() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5253; local1++) {
			@Pc(10) int local10 = this.anIntArray430[local1];
			this.anIntArray430[local1] = this.anIntArray426[local1];
			this.anIntArray426[local1] = -local10;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean437) {
				this.method3976();
			}
			@Pc(6) int local6 = Static96.anInt1997;
			@Pc(8) int local8 = Static96.anInt1995;
			@Pc(12) int local12 = Class68.anIntArray137[0];
			@Pc(16) int local16 = Class68.anIntArray139[0];
			@Pc(20) int local20 = Class68.anIntArray137[arg0];
			@Pc(24) int local24 = Class68.anIntArray139[arg0];
			@Pc(28) int local28 = Class68.anIntArray137[arg1];
			@Pc(32) int local32 = Class68.anIntArray139[arg1];
			@Pc(36) int local36 = Class68.anIntArray137[arg2];
			@Pc(40) int local40 = Class68.anIntArray139[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt5253; local52++) {
				@Pc(61) int local61 = this.anIntArray430[local52];
				@Pc(66) int local66 = this.anIntArray427[local52];
				@Pc(71) int local71 = this.anIntArray426[local52];
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
				Static262.anIntArray440[local52] = local71 - local50;
				Static262.anIntArray451[local52] = local6 + (local61 << 9) / local71;
				Static262.anIntArray453[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt5251 > 0) {
					Static262.anIntArray455[local52] = local61;
					Static262.anIntArray452[local52] = local83;
					Static262.anIntArray441[local52] = local71;
				}
			}
			this.method3967(false, arg6 >= 0L, arg6, this.aShort22, this.aShort22 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5253; local9++) {
			@Pc(29) int local29 = this.anIntArray427[local9] * local7 - this.anIntArray426[local9] * local3 >> 16;
			this.anIntArray426[local9] = this.anIntArray427[local9] * local3 + this.anIntArray426[local9] * local7 >> 16;
			this.anIntArray427[local9] = local29;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZLclient!u;[B[S[I[I[I)Lclient!ie;")
	private Class36_Sub2 method3975(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class36_Sub2_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt5253 = this.anInt5253;
		arg2.anInt5252 = this.anInt5252;
		arg2.anInt5250 = this.anInt5250;
		arg2.anInt5251 = this.anInt5251;
		if (arg2.anIntArray430 == null || arg2.anIntArray430.length < this.anInt5253) {
			arg2.anIntArray430 = new int[this.anInt5253 + 100];
			arg2.anIntArray427 = new int[this.anInt5253 + 100];
			arg2.anIntArray426 = new int[this.anInt5253 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt5253; local47++) {
			arg2.anIntArray430[local47] = this.anIntArray430[local47];
			arg2.anIntArray427[local47] = this.anIntArray427[local47];
			arg2.anIntArray426[local47] = this.anIntArray426[local47];
		}
		if (arg0) {
			arg2.aByteArray52 = this.aByteArray52;
		} else {
			arg2.aByteArray52 = arg3;
			if (this.aByteArray52 == null) {
				for (local47 = 0; local47 < this.anInt5250; local47++) {
					arg2.aByteArray52[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt5250; local47++) {
					arg2.aByteArray52[local47] = this.aByteArray52[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray59 = this.aShortArray59;
			arg2.anIntArray419 = this.anIntArray419;
			arg2.anIntArray429 = this.anIntArray429;
			arg2.anIntArray422 = this.anIntArray422;
		} else {
			arg2.aShortArray59 = arg4;
			arg2.anIntArray419 = arg5;
			arg2.anIntArray429 = arg6;
			arg2.anIntArray422 = arg7;
			for (local47 = 0; local47 < this.anInt5250; local47++) {
				arg2.aShortArray59[local47] = this.aShortArray59[local47];
				arg2.anIntArray419[local47] = this.anIntArray419[local47];
				arg2.anIntArray429[local47] = this.anIntArray429[local47];
				arg2.anIntArray422[local47] = this.anIntArray422[local47];
			}
		}
		arg2.anIntArray421 = this.anIntArray421;
		arg2.anIntArray424 = this.anIntArray424;
		arg2.anIntArray425 = this.anIntArray425;
		arg2.aByteArray54 = this.aByteArray54;
		arg2.aByteArray53 = this.aByteArray53;
		arg2.aShortArray60 = this.aShortArray60;
		arg2.aByte20 = this.aByte20;
		arg2.anIntArray420 = this.anIntArray420;
		arg2.anIntArray428 = this.anIntArray428;
		arg2.anIntArray423 = this.anIntArray423;
		arg2.anIntArrayArray36 = this.anIntArrayArray36;
		arg2.anIntArrayArray37 = this.anIntArrayArray37;
		arg2.aShortArray57 = this.aShortArray57;
		arg2.aShortArray58 = this.aShortArray58;
		arg2.aBoolean435 = this.aBoolean435;
		arg2.aBoolean437 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(III)V")
	@Override
	public void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5253; local1++) {
			this.anIntArray430[local1] = this.anIntArray430[local1] * arg0 / 128;
			this.anIntArray427[local1] = this.anIntArray427[local1] * arg1 / 128;
			this.anIntArray426[local1] = this.anIntArray426[local1] * arg2 / 128;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "()V")
	@Override
	public void method3942() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5253; local1++) {
			this.anIntArray430[local1] = -this.anIntArray430[local1];
			this.anIntArray426[local1] = -this.anIntArray426[local1];
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3936(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static262.aByteArray55.length < this.anInt5250) {
			Static262.aByteArray55 = new byte[this.anInt5250 + 100];
		}
		if (!arg1 && Static262.aShortArray61.length < this.anInt5250) {
			Static262.anIntArray431 = new int[this.anInt5250 + 100];
			Static262.anIntArray433 = new int[this.anInt5250 + 100];
			Static262.anIntArray432 = new int[this.anInt5250 + 100];
			Static262.aShortArray61 = new short[this.anInt5250 + 100];
		}
		return this.method3975(arg0, arg1, Static262.aClass36_Sub2_Sub2_1, Static262.aByteArray55, Static262.aShortArray61, Static262.anIntArray431, Static262.anIntArray433, Static262.anIntArray432);
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "()I")
	@Override
	public int method3946() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static262.anInt5254 = 0;
			Static262.anInt5255 = 0;
			Static262.anInt5257 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray36.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray36[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local41]) != 0) {
							Static262.anInt5254 += this.anIntArray430[local41];
							Static262.anInt5255 += this.anIntArray427[local41];
							Static262.anInt5257 += this.anIntArray426[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static262.anInt5254 = Static262.anInt5254 / local6 + arg2;
				Static262.anInt5255 = Static262.anInt5255 / local6 + arg3;
				Static262.anInt5257 = Static262.anInt5257 / local6 + arg4;
				Static262.aBoolean438 = true;
			} else {
				Static262.anInt5254 = arg2;
				Static262.anInt5255 = arg3;
				Static262.anInt5257 = arg4;
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
						if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local33]) != 0) {
							this.anIntArray430[local33] += arg2;
							this.anIntArray427[local33] += arg3;
							this.anIntArray426[local33] += arg4;
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
							if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local33]) != 0) {
								this.anIntArray430[local33] -= Static262.anInt5254;
								this.anIntArray427[local33] -= Static262.anInt5255;
								this.anIntArray426[local33] -= Static262.anInt5257;
								if (arg4 != 0) {
									local41 = Class68.anIntArray137[arg4];
									local307 = Class68.anIntArray139[arg4];
									local329 = this.anIntArray427[local33] * local41 + this.anIntArray430[local33] * local307 + 32767 >> 16;
									this.anIntArray427[local33] = this.anIntArray427[local33] * local307 + 32767 - this.anIntArray430[local33] * local41 >> 16;
									this.anIntArray430[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class68.anIntArray137[arg2];
									local307 = Class68.anIntArray139[arg2];
									local329 = this.anIntArray427[local33] * local307 + 32767 - this.anIntArray426[local33] * local41 >> 16;
									this.anIntArray426[local33] = this.anIntArray427[local33] * local41 + this.anIntArray426[local33] * local307 + 32767 >> 16;
									this.anIntArray427[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class68.anIntArray137[arg3];
									local307 = Class68.anIntArray139[arg3];
									local329 = this.anIntArray426[local33] * local41 + this.anIntArray430[local33] * local307 + 32767 >> 16;
									this.anIntArray426[local33] = this.anIntArray426[local33] * local307 + 32767 - this.anIntArray430[local33] * local41 >> 16;
									this.anIntArray430[local33] = local329;
								}
								this.anIntArray430[local33] += Static262.anInt5254;
								this.anIntArray427[local33] += Static262.anInt5255;
								this.anIntArray426[local33] += Static262.anInt5257;
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
				if (Static262.aBoolean438) {
					local307 = arg7[0] * Static262.anInt5254 + arg7[3] * Static262.anInt5255 + arg7[6] * Static262.anInt5257 + 16384 >> 15;
					local329 = arg7[1] * Static262.anInt5254 + arg7[4] * Static262.anInt5255 + arg7[7] * Static262.anInt5257 + 16384 >> 15;
					local351 = arg7[2] * Static262.anInt5254 + arg7[5] * Static262.anInt5255 + arg7[8] * Static262.anInt5257 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static262.anInt5254 = local307;
					Static262.anInt5255 = local329;
					Static262.anInt5257 = local351;
					Static262.aBoolean438 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class68.anIntArray139[arg2] >> 1;
				local351 = Class68.anIntArray137[arg2] >> 1;
				local392 = Class68.anIntArray139[arg3] >> 1;
				local398 = Class68.anIntArray137[arg3] >> 1;
				local404 = Class68.anIntArray139[arg4] >> 1;
				local410 = Class68.anIntArray137[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static262.anInt5254 + local374[1] * -Static262.anInt5255 + local374[2] * -Static262.anInt5257 + 16384 >> 15;
				local579 = local374[3] * -Static262.anInt5254 + local374[4] * -Static262.anInt5255 + local374[5] * -Static262.anInt5257 + 16384 >> 15;
				local604 = local374[6] * -Static262.anInt5254 + local374[7] * -Static262.anInt5255 + local374[8] * -Static262.anInt5257 + 16384 >> 15;
				local608 = local554 + Static262.anInt5254;
				@Pc(612) int local612 = local579 + Static262.anInt5255;
				local616 = local604 + Static262.anInt5257;
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
							if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray430[local913] + local753[1] * this.anIntArray427[local913] + local753[2] * this.anIntArray426[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray430[local913] + local753[4] * this.anIntArray427[local913] + local753[5] * this.anIntArray426[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray430[local913] + local753[7] * this.anIntArray427[local913] + local753[8] * this.anIntArray426[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray430[local913] = local1021;
								this.anIntArray427[local913] = local1025;
								this.anIntArray426[local913] = local1029;
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
							if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local33]) != 0) {
								this.anIntArray430[local33] -= Static262.anInt5254;
								this.anIntArray427[local33] -= Static262.anInt5255;
								this.anIntArray426[local33] -= Static262.anInt5257;
								this.anIntArray430[local33] = this.anIntArray430[local33] * arg2 / 128;
								this.anIntArray427[local33] = this.anIntArray427[local33] * arg3 / 128;
								this.anIntArray426[local33] = this.anIntArray426[local33] * arg4 / 128;
								this.anIntArray430[local33] += Static262.anInt5254;
								this.anIntArray427[local33] += Static262.anInt5255;
								this.anIntArray426[local33] += Static262.anInt5257;
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
				if (Static262.aBoolean438) {
					local307 = arg7[0] * Static262.anInt5254 + arg7[3] * Static262.anInt5255 + arg7[6] * Static262.anInt5257 + 16384 >> 15;
					local329 = arg7[1] * Static262.anInt5254 + arg7[4] * Static262.anInt5255 + arg7[7] * Static262.anInt5257 + 16384 >> 15;
					local351 = arg7[2] * Static262.anInt5254 + arg7[5] * Static262.anInt5255 + arg7[8] * Static262.anInt5257 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static262.anInt5254 = local307;
					Static262.anInt5255 = local329;
					Static262.anInt5257 = local351;
					Static262.aBoolean438 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static262.anInt5254 + 16384 >> 15;
				local398 = local329 * -Static262.anInt5255 + 16384 >> 15;
				local404 = local351 * -Static262.anInt5257 + 16384 >> 15;
				local410 = local392 + Static262.anInt5254;
				local418 = local398 + Static262.anInt5255;
				local426 = local404 + Static262.anInt5257;
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
							if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray430[local760] + local1628[1] * this.anIntArray427[local760] + local1628[2] * this.anIntArray426[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray430[local760] + local1628[4] * this.anIntArray427[local760] + local1628[5] * this.anIntArray426[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray430[local760] + local1628[7] * this.anIntArray427[local760] + local1628[8] * this.anIntArray426[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray430[local760] = local1896;
								this.anIntArray427[local760] = local1900;
								this.anIntArray426[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray37 != null && this.aByteArray52 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray37.length) {
						local204 = this.anIntArrayArray37[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local33]) != 0) {
								local41 = (this.aByteArray52[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray52[local33] = (byte) local41;
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
						if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local33]) != 0) {
							local41 = this.aShortArray59[local33] & 0xFFFF;
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
							this.aShortArray59[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean436 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)V")
	@Override
	public void method3950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5253; local1++) {
			this.anIntArray430[local1] += arg0;
			this.anIntArray427[local1] += arg1;
			this.anIntArray426[local1] += arg2;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method3938(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5253; local9++) {
			@Pc(29) int local29 = this.anIntArray427[local9] * local3 + this.anIntArray430[local9] * local7 >> 16;
			this.anIntArray427[local9] = this.anIntArray427[local9] * local7 - this.anIntArray430[local9] * local3 >> 16;
			this.anIntArray430[local9] = local29;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!u", name = "r", descriptor = "()V")
	private void method3976() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5252; local17++) {
			@Pc(26) int local26 = this.anIntArray430[local17];
			@Pc(31) int local31 = this.anIntArray427[local17];
			@Pc(36) int local36 = this.anIntArray426[local17];
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
		this.aShort29 = (short) local1;
		this.aShort23 = (short) local7;
		this.aShort27 = (short) local3;
		this.aShort25 = (short) local9;
		this.aShort28 = (short) local5;
		this.aShort24 = (short) local11;
		this.aShort26 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort22 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean437 = true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		if (!this.aBoolean437) {
			this.method3976();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort26 * arg2 + this.aShort25 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort26 * arg2 + this.aShort27 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort26 << 9;
		if (local78 / local38 <= Static90.anInt1920) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort26 << 9;
		if (local91 / local38 >= Static65.anInt5541) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort26 * arg1 + this.aShort25 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static37.anInt3864) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort26 * arg1 + this.aShort27 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static19.anInt523) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt5251 > 0;
		@Pc(172) int local172 = Static96.anInt1997;
		@Pc(174) int local174 = Static96.anInt1995;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class68.anIntArray137[arg0];
			local178 = Class68.anIntArray139[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static224.aBoolean368 && local53 > 0) {
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
			if (Static198.anInt3919 >= local204 && Static198.anInt3919 <= local208 && Static31.anInt746 >= local223 && Static31.anInt746 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort29, this.aShort23, this.aShort29, this.aShort23, this.aShort29, this.aShort23, this.aShort29, this.aShort23 };
				@Pc(342) int[] local342 = new int[] { this.aShort28, this.aShort28, this.aShort24, this.aShort24, this.aShort28, this.aShort28, this.aShort24, this.aShort24 };
				@Pc(385) int[] local385 = new int[] { this.aShort27, this.aShort27, this.aShort27, this.aShort27, this.aShort25, this.aShort25, this.aShort25, this.aShort25 };
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
				if (Static198.anInt3919 >= local204 && Static198.anInt3919 <= local208 && Static31.anInt746 >= local223 && Static31.anInt746 <= local227) {
					if (this.aBoolean435) {
						Static79.aLongArray4[Static88.anInt1896++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt5253; local204++) {
			local223 = this.anIntArray430[local204];
			local208 = this.anIntArray427[local204];
			local227 = this.anIntArray426[local204];
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
			Static262.anIntArray440[local204] = local227 - local24;
			if (local227 >= 50) {
				Static262.anIntArray451[local204] = local172 + (local223 << 9) / local227;
				Static262.anIntArray453[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static262.anIntArray451[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static262.anIntArray455[local204] = local223;
				Static262.anIntArray452[local204] = local577;
				Static262.anIntArray441[local204] = local227;
			}
		}
		try {
			this.method3967(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!u;")
	public Class36_Sub2_Sub2 method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean437) {
			this.method3976();
		}
		@Pc(9) int local9 = arg4 + this.aShort29;
		@Pc(14) int local14 = arg4 + this.aShort23;
		@Pc(19) int local19 = arg6 + this.aShort28;
		@Pc(24) int local24 = arg6 + this.aShort24;
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
		@Pc(150) Class36_Sub2_Sub2 local150;
		if (arg7) {
			local150 = new Class36_Sub2_Sub2();
			local150.anInt5253 = this.anInt5253;
			local150.anInt5252 = this.anInt5252;
			local150.anInt5250 = this.anInt5250;
			local150.anInt5251 = this.anInt5251;
			local150.anIntArray421 = this.anIntArray421;
			local150.anIntArray424 = this.anIntArray424;
			local150.anIntArray425 = this.anIntArray425;
			local150.anIntArray419 = this.anIntArray419;
			local150.anIntArray429 = this.anIntArray429;
			local150.anIntArray422 = this.anIntArray422;
			local150.aByteArray54 = this.aByteArray54;
			local150.aByteArray53 = this.aByteArray53;
			local150.aShortArray60 = this.aShortArray60;
			local150.aShortArray59 = this.aShortArray59;
			local150.aByteArray52 = this.aByteArray52;
			local150.aByte20 = this.aByte20;
			local150.anIntArray420 = this.anIntArray420;
			local150.anIntArray428 = this.anIntArray428;
			local150.anIntArray423 = this.anIntArray423;
			local150.anIntArrayArray36 = this.anIntArrayArray36;
			local150.anIntArrayArray37 = this.anIntArrayArray37;
			local150.aShortArray57 = this.aShortArray57;
			local150.aShortArray58 = this.aShortArray58;
			local150.aBoolean435 = this.aBoolean435;
			if (arg0 == 3) {
				local150.anIntArray430 = Static98.method1570(this.anIntArray430);
				local150.anIntArray427 = Static98.method1570(this.anIntArray427);
				local150.anIntArray426 = Static98.method1570(this.anIntArray426);
			} else {
				local150.anIntArray430 = this.anIntArray430;
				local150.anIntArray427 = new int[local150.anInt5253];
				local150.anIntArray426 = this.anIntArray426;
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
			for (local289 = 0; local289 < local150.anInt5252; local289++) {
				local300 = this.anIntArray430[local289] + arg4;
				local307 = this.anIntArray426[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray427[local289] = this.anIntArray427[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt5252; local289 < local150.anInt5253; local289++) {
				local300 = this.anIntArray430[local289] + arg4;
				local307 = this.anIntArray426[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray427[local289] = this.anIntArray427[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt5252; local289++) {
					local300 = (this.anIntArray427[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray430[local289] + arg4;
						local311 = this.anIntArray426[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray427[local289] = this.anIntArray427[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray427[local289] = this.anIntArray427[local289];
					}
				}
				for (local289 = local150.anInt5252; local289 < local150.anInt5253; local289++) {
					local300 = (this.anIntArray427[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray430[local289] + arg4;
						local311 = this.anIntArray426[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray427[local289] = this.anIntArray427[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray427[local289] = this.anIntArray427[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3955(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort25 - this.aShort27;
				for (local300 = 0; local300 < this.anInt5252; local300++) {
					local307 = this.anIntArray430[local300] + arg4;
					local311 = this.anIntArray426[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray427[local300] = this.anIntArray427[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt5252; local300 < local150.anInt5253; local300++) {
					local307 = this.anIntArray430[local300] + arg4;
					local311 = this.anIntArray426[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray427[local300] = this.anIntArray427[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort25 - this.aShort27;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt5252; local300++) {
					local307 = this.anIntArray430[local300] + arg4;
					local311 = this.anIntArray426[local300] + arg6;
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
					local150.anIntArray427[local300] = ((this.anIntArray427[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt5252; local300 < local150.anInt5253; local300++) {
					local307 = this.anIntArray430[local300] + arg4;
					local311 = this.anIntArray426[local300] + arg6;
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
						local150.anIntArray427[local300] = ((this.anIntArray427[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean437 = false;
		return local150;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3957(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static262.aByteArray56.length < this.anInt5250) {
			Static262.aByteArray56 = new byte[this.anInt5250 + 100];
		}
		if (!arg1 && Static262.aShortArray62.length < this.anInt5250) {
			Static262.anIntArray434 = new int[this.anInt5250 + 100];
			Static262.anIntArray436 = new int[this.anInt5250 + 100];
			Static262.anIntArray435 = new int[this.anInt5250 + 100];
			Static262.aShortArray62 = new short[this.anInt5250 + 100];
		}
		return this.method3975(arg0, arg1, Static262.aClass36_Sub2_Sub2_2, Static262.aByteArray56, Static262.aShortArray62, Static262.anIntArray434, Static262.anIntArray436, Static262.anIntArray435);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method3978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()I")
	@Override
	public int method3939() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	private void method3979(@OriginalArg(0) int arg0) {
		if (Static262.aBooleanArray25[arg0]) {
			this.method3972(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray421[arg0];
		@Pc(17) int local17 = this.anIntArray424[arg0];
		@Pc(22) int local22 = this.anIntArray425[arg0];
		Static96.aBoolean142 = Static262.aBooleanArray24[arg0];
		if (this.aByteArray52 == null) {
			Static96.anInt1994 = 0;
		} else {
			Static96.anInt1994 = this.aByteArray52[arg0] & 0xFF;
		}
		if (this.aShortArray60 != null && this.aShortArray60[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray53 == null || this.aByteArray53[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray53[arg0] & 0xFF;
				local141 = this.anIntArray420[local136];
				local146 = this.anIntArray428[local136];
				local151 = this.anIntArray423[local136];
			}
			if (this.anIntArray422[arg0] == -1) {
				Static96.method1522(Static262.anIntArray453[local12], Static262.anIntArray453[local17], Static262.anIntArray453[local22], Static262.anIntArray451[local12], Static262.anIntArray451[local17], Static262.anIntArray451[local22], this.anIntArray419[arg0], this.anIntArray419[arg0], this.anIntArray419[arg0], Static262.anIntArray455[local141], Static262.anIntArray455[local146], Static262.anIntArray455[local151], Static262.anIntArray452[local141], Static262.anIntArray452[local146], Static262.anIntArray452[local151], Static262.anIntArray441[local141], Static262.anIntArray441[local146], Static262.anIntArray441[local151], this.aShortArray60[arg0]);
			} else {
				Static96.method1522(Static262.anIntArray453[local12], Static262.anIntArray453[local17], Static262.anIntArray453[local22], Static262.anIntArray451[local12], Static262.anIntArray451[local17], Static262.anIntArray451[local22], this.anIntArray419[arg0], this.anIntArray429[arg0], this.anIntArray422[arg0], Static262.anIntArray455[local141], Static262.anIntArray455[local146], Static262.anIntArray455[local151], Static262.anIntArray452[local141], Static262.anIntArray452[local146], Static262.anIntArray452[local151], Static262.anIntArray441[local141], Static262.anIntArray441[local146], Static262.anIntArray441[local151], this.aShortArray60[arg0]);
			}
		} else if (this.anIntArray422[arg0] == -1) {
			Static96.method1519(Static262.anIntArray453[local12], Static262.anIntArray453[local17], Static262.anIntArray453[local22], Static262.anIntArray451[local12], Static262.anIntArray451[local17], Static262.anIntArray451[local22], Static96.anIntArray135[this.anIntArray419[arg0] & 0xFFFF]);
		} else {
			Static96.method1532(Static262.anIntArray453[local12], Static262.anIntArray453[local17], Static262.anIntArray453[local22], Static262.anIntArray451[local12], Static262.anIntArray451[local17], Static262.anIntArray451[local22], this.anIntArray419[arg0] & 0xFFFF, this.anIntArray429[arg0] & 0xFFFF, this.anIntArray422[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ie;)Lclient!ie;")
	public Class36_Sub2 method3980(@OriginalArg(0) Class36_Sub2 arg0) {
		return new Class36_Sub2_Sub2(new Class36_Sub2_Sub2[] { this, (Class36_Sub2_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!u", name = "m", descriptor = "()I")
	@Override
	public int method3964() {
		if (!this.aBoolean437) {
			this.method3976();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
	@Override
	protected void method3937() {
		if (this.aBoolean436) {
			this.method3970();
			this.aBoolean436 = false;
		}
		this.aBoolean437 = false;
	}
}
