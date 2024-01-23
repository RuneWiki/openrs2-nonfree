import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class25_Sub2_Sub2 extends Class25_Sub2 {

	@OriginalMember(owner = "client!om", name = "mb", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!om", name = "Mb", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!om", name = "zb", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!om", name = "Eb", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!om", name = "Ab", descriptor = "[I")
	public static int[] anIntArray436;

	@OriginalMember(owner = "client!om", name = "yb", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "[I")
	public int[] anIntArray414;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!om", name = "V", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!om", name = "Z", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public int anInt4409 = 0;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	private int anInt4412 = 0;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	private int anInt4410 = 0;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	private int anInt4411 = 0;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
	private boolean aBoolean234 = false;

	static {
		if (Static195.aBoolean235) {
			anIntArray425 = new int[4096];
			anIntArray443 = new int[4096];
		} else {
			anIntArray435 = new int[1600];
			anIntArrayArray35 = new int[1600][64];
			anIntArray436 = new int[32];
			anIntArrayArray33 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class25_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!le;IIIII)V")
	public Class25_Sub2_Sub2(@OriginalArg(0) Class25_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2809();
		arg0.method2812();
		this.anInt4409 = arg0.anInt3517;
		this.anInt4411 = arg0.anInt3520;
		this.anIntArray409 = arg0.anIntArray308;
		this.anIntArray421 = arg0.anIntArray307;
		this.anIntArray414 = arg0.anIntArray314;
		this.anInt4410 = arg0.anInt3521;
		this.anIntArray407 = arg0.anIntArray316;
		this.anIntArray413 = arg0.anIntArray313;
		this.anIntArray415 = arg0.anIntArray312;
		this.aByteArray58 = arg0.aByteArray42;
		this.aByteArray60 = arg0.aByteArray43;
		this.aByte16 = arg0.aByte11;
		this.aShortArray64 = arg0.aShortArray60;
		this.anIntArrayArray32 = arg0.anIntArrayArray21;
		this.anIntArrayArray31 = arg0.anIntArrayArray22;
		this.aShortArray66 = arg0.aShortArray55;
		this.aShortArray67 = arg0.aShortArray53;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray417 = new int[this.anInt4410];
		this.anIntArray408 = new int[this.anInt4410];
		this.anIntArray416 = new int[this.anInt4410];
		@Pc(140) int local140;
		if (arg0.aShortArray58 == null) {
			this.aShortArray65 = null;
		} else {
			this.aShortArray65 = new short[this.anInt4410];
			for (local140 = 0; local140 < this.anInt4410; local140++) {
				@Pc(149) short local149 = arg0.aShortArray58[local140];
				if (local149 != -1 && Static151.anInterface2_1.method4414(local149)) {
					this.aShortArray65[local140] = local149;
				} else {
					this.aShortArray65[local140] = -1;
				}
			}
		}
		if (arg0.anInt3518 > 0 && arg0.aByteArray45 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt3518];
			@Pc(186) int local186;
			for (local186 = 0; local186 < this.anInt4410; local186++) {
				if (arg0.aByteArray45[local186] != -1) {
					local184[arg0.aByteArray45[local186] & 0xFF]++;
				}
			}
			this.anInt4412 = 0;
			for (local186 = 0; local186 < arg0.anInt3518; local186++) {
				if (local184[local186] > 0 && arg0.aByteArray49[local186] == 0) {
					this.anInt4412++;
				}
			}
			this.anIntArray411 = new int[this.anInt4412];
			this.anIntArray412 = new int[this.anInt4412];
			this.anIntArray410 = new int[this.anInt4412];
			local186 = 0;
			@Pc(255) int local255;
			for (local255 = 0; local255 < arg0.anInt3518; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray49[local255] == 0) {
					this.anIntArray411[local186] = arg0.aShortArray57[local255] & 0xFFFF;
					this.anIntArray412[local186] = arg0.aShortArray59[local255] & 0xFFFF;
					this.anIntArray410[local186] = arg0.aShortArray56[local255] & 0xFFFF;
					local184[local255] = local186++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray57 = new byte[this.anInt4410];
			for (local255 = 0; local255 < this.anInt4410; local255++) {
				if (arg0.aByteArray45[local255] == -1) {
					this.aByteArray57[local255] = -1;
				} else {
					this.aByteArray57[local255] = (byte) local184[arg0.aByteArray45[local255] & 0xFF];
					if (this.aByteArray57[local255] == -1 && this.aShortArray65 != null) {
						this.aShortArray65[local255] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt4410; local140++) {
			@Pc(373) byte local373;
			if (arg0.aByteArray40 == null) {
				local373 = 0;
			} else {
				local373 = arg0.aByteArray40[local140];
			}
			@Pc(384) byte local384;
			if (arg0.aByteArray43 == null) {
				local384 = 0;
			} else {
				local384 = arg0.aByteArray43[local140];
			}
			@Pc(395) short local395;
			if (this.aShortArray65 == null) {
				local395 = -1;
			} else {
				local395 = this.aShortArray65[local140];
			}
			if (local384 == -2) {
				local373 = 3;
			}
			if (local384 == -1) {
				local373 = 2;
			}
			@Pc(442) Class106 local442;
			@Pc(475) int local475;
			@Pc(621) Class110 local621;
			if (local395 == -1) {
				if (local373 == 0) {
					@Pc(423) int local423 = arg0.aShortArray60[local140] & 0xFFFF;
					if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray407[local140]] == null) {
						local442 = arg0.aClass106Array1[this.anIntArray407[local140]];
					} else {
						local442 = arg0.aClass106Array2[this.anIntArray407[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977) << 17;
					this.anIntArray417[local140] = local475 | Static195.method3494(local423, local475 >> 17);
					if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray413[local140]] == null) {
						local442 = arg0.aClass106Array1[this.anIntArray413[local140]];
					} else {
						local442 = arg0.aClass106Array2[this.anIntArray413[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977) << 17;
					this.anIntArray408[local140] = local475 | Static195.method3494(local423, local475 >> 17);
					if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray415[local140]] == null) {
						local442 = arg0.aClass106Array1[this.anIntArray415[local140]];
					} else {
						local442 = arg0.aClass106Array2[this.anIntArray415[local140]];
					}
					local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977) << 17;
					this.anIntArray416[local140] = local475 | Static195.method3494(local423, local475 >> 17);
				} else if (local373 == 1) {
					local621 = arg0.aClass110Array1[local140];
					local475 = arg1 + (arg3 * local621.anInt4081 + arg4 * local621.anInt4082 + arg5 * local621.anInt4083) / (local115 + local115 / 2) << 17;
					this.anIntArray417[local140] = local475 | Static195.method3494(arg0.aShortArray60[local140] & 0xFFFF, local475 >> 17);
					this.anIntArray416[local140] = -1;
				} else if (local373 == 3) {
					this.anIntArray417[local140] = 128;
					this.anIntArray416[local140] = -1;
				} else {
					this.anIntArray416[local140] = -2;
				}
			} else if (local373 == 0) {
				if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray407[local140]] == null) {
					local442 = arg0.aClass106Array1[this.anIntArray407[local140]];
				} else {
					local442 = arg0.aClass106Array2[this.anIntArray407[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977);
				this.anIntArray417[local140] = Static195.method3491(local475);
				if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray413[local140]] == null) {
					local442 = arg0.aClass106Array1[this.anIntArray413[local140]];
				} else {
					local442 = arg0.aClass106Array2[this.anIntArray413[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977);
				this.anIntArray408[local140] = Static195.method3491(local475);
				if (arg0.aClass106Array2 == null || arg0.aClass106Array2[this.anIntArray415[local140]] == null) {
					local442 = arg0.aClass106Array1[this.anIntArray415[local140]];
				} else {
					local442 = arg0.aClass106Array2[this.anIntArray415[local140]];
				}
				local475 = arg1 + (arg3 * local442.anInt3979 + arg4 * local442.anInt3980 + arg5 * local442.anInt3973) / (local115 * local442.anInt3977);
				this.anIntArray416[local140] = Static195.method3491(local475);
			} else if (local373 == 1) {
				local621 = arg0.aClass110Array1[local140];
				local475 = arg1 + (arg3 * local621.anInt4081 + arg4 * local621.anInt4082 + arg5 * local621.anInt4083) / (local115 + local115 / 2);
				this.anIntArray417[local140] = Static195.method3491(local475);
				this.anIntArray416[local140] = -1;
			} else {
				this.anIntArray416[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "([Lclient!om;I)V")
	private Class25_Sub2_Sub2(@OriginalArg(0) Class25_Sub2_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt4409 = 0;
		this.anInt4410 = 0;
		this.anInt4412 = 0;
		this.aByte16 = -1;
		@Pc(48) int local48;
		@Pc(55) Class25_Sub2_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt4409 += local55.anInt4409;
				this.anInt4410 += local55.anInt4410;
				this.anInt4412 += local55.anInt4412;
				if (local55.aByteArray58 == null) {
					if (this.aByte16 == -1) {
						this.aByte16 = local55.aByte16;
					}
					if (this.aByte16 != local55.aByte16) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray60 != null;
				local28 |= local55.aShortArray65 != null;
				local30 |= local55.aByteArray57 != null;
			}
		}
		this.anIntArray409 = new int[this.anInt4409];
		this.anIntArray421 = new int[this.anInt4409];
		this.anIntArray414 = new int[this.anInt4409];
		this.anIntArray407 = new int[this.anInt4410];
		this.anIntArray413 = new int[this.anInt4410];
		this.anIntArray415 = new int[this.anInt4410];
		this.anIntArray417 = new int[this.anInt4410];
		this.anIntArray408 = new int[this.anInt4410];
		this.anIntArray416 = new int[this.anInt4410];
		if (local24) {
			this.aByteArray58 = new byte[this.anInt4410];
		}
		if (local26) {
			this.aByteArray60 = new byte[this.anInt4410];
		}
		if (local28) {
			this.aShortArray65 = new short[this.anInt4410];
		}
		if (local30) {
			this.aByteArray57 = new byte[this.anInt4410];
		}
		if (this.anInt4412 > 0) {
			this.anIntArray411 = new int[this.anInt4412];
			this.anIntArray412 = new int[this.anInt4412];
			this.anIntArray410 = new int[this.anInt4412];
		}
		this.aShortArray64 = new short[this.anInt4410];
		this.anInt4409 = 0;
		this.anInt4410 = 0;
		this.anInt4412 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(254) int local254;
				for (local254 = 0; local254 < local55.anInt4410; local254++) {
					this.anIntArray407[this.anInt4410] = local55.anIntArray407[local254] + this.anInt4409;
					this.anIntArray413[this.anInt4410] = local55.anIntArray413[local254] + this.anInt4409;
					this.anIntArray415[this.anInt4410] = local55.anIntArray415[local254] + this.anInt4409;
					this.anIntArray417[this.anInt4410] = local55.anIntArray417[local254];
					this.anIntArray408[this.anInt4410] = local55.anIntArray408[local254];
					this.anIntArray416[this.anInt4410] = local55.anIntArray416[local254];
					this.aShortArray64[this.anInt4410] = local55.aShortArray64[local254];
					if (local24) {
						if (local55.aByteArray58 == null) {
							this.aByteArray58[this.anInt4410] = local55.aByte16;
						} else {
							this.aByteArray58[this.anInt4410] = local55.aByteArray58[local254];
						}
					}
					if (local26 && local55.aByteArray60 != null) {
						this.aByteArray60[this.anInt4410] = local55.aByteArray60[local254];
					}
					if (local28) {
						if (local55.aShortArray65 == null) {
							this.aShortArray65[this.anInt4410] = -1;
						} else {
							this.aShortArray65[this.anInt4410] = local55.aShortArray65[local254];
						}
					}
					if (local30) {
						this.aByteArray57[this.anInt4410] = (byte) (local55.aByteArray57 == null || local55.aByteArray57[local254] == -1 ? -1 : local55.aByteArray57[local254] + this.anInt4412);
					}
					this.anInt4410++;
				}
				for (local254 = 0; local254 < local55.anInt4412; local254++) {
					if (local55.anIntArray411[local254] < local55.anInt4411) {
						this.anIntArray411[this.anInt4412] = local55.anIntArray411[local254] + this.anInt4409;
					}
					if (local55.anIntArray412[local254] < local55.anInt4411) {
						this.anIntArray412[this.anInt4412] = local55.anIntArray412[local254] + this.anInt4409;
					}
					if (local55.anIntArray410[local254] < local55.anInt4411) {
						this.anIntArray410[this.anInt4412] = local55.anIntArray410[local254] + this.anInt4409;
					}
					this.anInt4412++;
				}
				for (local254 = 0; local254 < local55.anInt4411; local254++) {
					this.anIntArray409[this.anInt4409] = local55.anIntArray409[local254];
					this.anIntArray421[this.anInt4409] = local55.anIntArray421[local254];
					this.anIntArray414[this.anInt4409] = local55.anIntArray414[local254];
					this.anInt4409++;
				}
			}
		}
		local48 = 0;
		this.anInt4411 = this.anInt4409;
		for (@Pc(543) int local543 = 0; local543 < arg1; local543++) {
			@Pc(550) Class25_Sub2_Sub2 local550 = arg0[local543];
			if (local550 != null) {
				@Pc(554) int local554;
				for (local554 = 0; local554 < local550.anInt4412; local554++) {
					if (local550.anIntArray411[local554] >= local550.anInt4411) {
						this.anIntArray411[local48] = local550.anIntArray411[local554] + this.anInt4409 - local550.anInt4411;
					}
					if (local550.anIntArray412[local554] >= local550.anInt4411) {
						this.anIntArray412[local48] = local550.anIntArray412[local554] + this.anInt4409 - local550.anInt4411;
					}
					if (local550.anIntArray410[local554] >= local550.anInt4411) {
						this.anIntArray410[local48] = local550.anIntArray410[local554] + this.anInt4409 - local550.anInt4411;
					}
					local48++;
				}
				for (local554 = local550.anInt4411; local554 < local550.anInt4409; local554++) {
					this.anIntArray409[this.anInt4409] = local550.anIntArray409[local554];
					this.anIntArray421[this.anInt4409] = local550.anIntArray421[local554];
					this.anIntArray414[this.anInt4409] = local550.anIntArray414[local554];
					this.anInt4409++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "()I")
	@Override
	public int method3475() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!om", name = "m", descriptor = "()V")
	@Override
	public void method3490() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4409; local1++) {
			this.anIntArray409[local1] = -this.anIntArray409[local1];
			this.anIntArray414[local1] = -this.anIntArray414[local1];
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "()V")
	@Override
	public void method3483() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4409; local1++) {
			@Pc(10) int local10 = this.anIntArray414[local1];
			this.anIntArray414[local1] = this.anIntArray409[local1];
			this.anIntArray409[local1] = -local10;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "()I")
	@Override
	public int method3476() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZLclient!om;[B[S[I[I[I)Lclient!lf;")
	private Class25_Sub2 method3492(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class25_Sub2_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt4409 = this.anInt4409;
		arg2.anInt4411 = this.anInt4411;
		arg2.anInt4410 = this.anInt4410;
		arg2.anInt4412 = this.anInt4412;
		if (arg2.anIntArray409 == null || arg2.anIntArray409.length < this.anInt4409) {
			arg2.anIntArray409 = new int[this.anInt4409 + 100];
			arg2.anIntArray421 = new int[this.anInt4409 + 100];
			arg2.anIntArray414 = new int[this.anInt4409 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt4409; local47++) {
			arg2.anIntArray409[local47] = this.anIntArray409[local47];
			arg2.anIntArray421[local47] = this.anIntArray421[local47];
			arg2.anIntArray414[local47] = this.anIntArray414[local47];
		}
		if (arg0) {
			arg2.aByteArray60 = this.aByteArray60;
		} else {
			arg2.aByteArray60 = arg3;
			if (this.aByteArray60 == null) {
				for (local47 = 0; local47 < this.anInt4410; local47++) {
					arg2.aByteArray60[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt4410; local47++) {
					arg2.aByteArray60[local47] = this.aByteArray60[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray64 = this.aShortArray64;
			arg2.anIntArray417 = this.anIntArray417;
			arg2.anIntArray408 = this.anIntArray408;
			arg2.anIntArray416 = this.anIntArray416;
		} else {
			arg2.aShortArray64 = arg4;
			arg2.anIntArray417 = arg5;
			arg2.anIntArray408 = arg6;
			arg2.anIntArray416 = arg7;
			for (local47 = 0; local47 < this.anInt4410; local47++) {
				arg2.aShortArray64[local47] = this.aShortArray64[local47];
				arg2.anIntArray417[local47] = this.anIntArray417[local47];
				arg2.anIntArray408[local47] = this.anIntArray408[local47];
				arg2.anIntArray416[local47] = this.anIntArray416[local47];
			}
		}
		arg2.anIntArray407 = this.anIntArray407;
		arg2.anIntArray413 = this.anIntArray413;
		arg2.anIntArray415 = this.anIntArray415;
		arg2.aByteArray58 = this.aByteArray58;
		arg2.aByteArray57 = this.aByteArray57;
		arg2.aShortArray65 = this.aShortArray65;
		arg2.aByte16 = this.aByte16;
		arg2.anIntArray411 = this.anIntArray411;
		arg2.anIntArray412 = this.anIntArray412;
		arg2.anIntArray410 = this.anIntArray410;
		arg2.anIntArrayArray32 = this.anIntArrayArray32;
		arg2.anIntArrayArray31 = this.anIntArrayArray31;
		arg2.aShortArray67 = this.aShortArray67;
		arg2.aShortArray66 = this.aShortArray66;
		arg2.aBoolean232 = this.aBoolean232;
		arg2.aBoolean233 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static195.anInt4414 = 0;
			Static195.anInt4416 = 0;
			Static195.anInt4413 = 0;
			for (local11 = 0; local11 < this.anInt4409; local11++) {
				Static195.anInt4414 += this.anIntArray409[local11];
				Static195.anInt4416 += this.anIntArray421[local11];
				Static195.anInt4413 += this.anIntArray414[local11];
				local3++;
			}
			if (local3 > 0) {
				Static195.anInt4414 = Static195.anInt4414 / local3 + arg1;
				Static195.anInt4416 = Static195.anInt4416 / local3 + arg2;
				Static195.anInt4413 = Static195.anInt4413 / local3 + arg3;
			} else {
				Static195.anInt4414 = arg1;
				Static195.anInt4416 = arg2;
				Static195.anInt4413 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt4409; local3++) {
				this.anIntArray409[local3] += arg1;
				this.anIntArray421[local3] += arg2;
				this.anIntArray414[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt4409; local3++) {
					this.anIntArray409[local3] -= Static195.anInt4414;
					this.anIntArray421[local3] -= Static195.anInt4416;
					this.anIntArray414[local3] -= Static195.anInt4413;
					if (arg3 != 0) {
						local11 = Class91.anIntArray319[arg3];
						local146 = Class91.anIntArray320[arg3];
						local164 = this.anIntArray421[local3] * local11 + this.anIntArray409[local3] * local146 + 32767 >> 16;
						this.anIntArray421[local3] = this.anIntArray421[local3] * local146 + 32767 - this.anIntArray409[local3] * local11 >> 16;
						this.anIntArray409[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class91.anIntArray319[arg1];
						local146 = Class91.anIntArray320[arg1];
						local164 = this.anIntArray421[local3] * local146 + 32767 - this.anIntArray414[local3] * local11 >> 16;
						this.anIntArray414[local3] = this.anIntArray421[local3] * local11 + this.anIntArray414[local3] * local146 + 32767 >> 16;
						this.anIntArray421[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class91.anIntArray319[arg2];
						local146 = Class91.anIntArray320[arg2];
						local164 = this.anIntArray414[local3] * local11 + this.anIntArray409[local3] * local146 + 32767 >> 16;
						this.anIntArray414[local3] = this.anIntArray414[local3] * local146 + 32767 - this.anIntArray409[local3] * local11 >> 16;
						this.anIntArray409[local3] = local164;
					}
					this.anIntArray409[local3] += Static195.anInt4414;
					this.anIntArray421[local3] += Static195.anInt4416;
					this.anIntArray414[local3] += Static195.anInt4413;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt4409; local3++) {
					this.anIntArray409[local3] -= Static195.anInt4414;
					this.anIntArray421[local3] -= Static195.anInt4416;
					this.anIntArray414[local3] -= Static195.anInt4413;
					this.anIntArray409[local3] = this.anIntArray409[local3] * arg1 / 128;
					this.anIntArray421[local3] = this.anIntArray421[local3] * arg2 / 128;
					this.anIntArray414[local3] = this.anIntArray414[local3] * arg3 / 128;
					this.anIntArray409[local3] += Static195.anInt4414;
					this.anIntArray421[local3] += Static195.anInt4416;
					this.anIntArray414[local3] += Static195.anInt4413;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt4410; local3++) {
					local11 = (this.aByteArray60[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray60[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt4410; local3++) {
					local11 = this.aShortArray64[local3] & 0xFFFF;
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
					this.aShortArray64[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean234 = true;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	private void method3493(@OriginalArg(0) int arg0) {
		if (Static195.aBooleanArray19[arg0]) {
			this.method3501(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray407[arg0];
		@Pc(17) int local17 = this.anIntArray413[arg0];
		@Pc(22) int local22 = this.anIntArray415[arg0];
		Static151.aBoolean181 = Static195.aBooleanArray18[arg0];
		if (this.aByteArray60 == null) {
			Static151.anInt3526 = 0;
		} else {
			Static151.anInt3526 = this.aByteArray60[arg0] & 0xFF;
		}
		if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray57 == null || this.aByteArray57[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray57[arg0] & 0xFF;
				local141 = this.anIntArray411[local136];
				local146 = this.anIntArray412[local136];
				local151 = this.anIntArray410[local136];
			}
			if (this.anIntArray416[arg0] == -1) {
				Static151.method2834(Static195.anIntArray442[local12], Static195.anIntArray442[local17], Static195.anIntArray442[local22], Static195.anIntArray444[local12], Static195.anIntArray444[local17], Static195.anIntArray444[local22], this.anIntArray417[arg0], this.anIntArray417[arg0], this.anIntArray417[arg0], Static195.anIntArray445[local141], Static195.anIntArray445[local146], Static195.anIntArray445[local151], Static195.anIntArray431[local141], Static195.anIntArray431[local146], Static195.anIntArray431[local151], Static195.anIntArray433[local141], Static195.anIntArray433[local146], Static195.anIntArray433[local151], this.aShortArray65[arg0]);
			} else {
				Static151.method2834(Static195.anIntArray442[local12], Static195.anIntArray442[local17], Static195.anIntArray442[local22], Static195.anIntArray444[local12], Static195.anIntArray444[local17], Static195.anIntArray444[local22], this.anIntArray417[arg0], this.anIntArray408[arg0], this.anIntArray416[arg0], Static195.anIntArray445[local141], Static195.anIntArray445[local146], Static195.anIntArray445[local151], Static195.anIntArray431[local141], Static195.anIntArray431[local146], Static195.anIntArray431[local151], Static195.anIntArray433[local141], Static195.anIntArray433[local146], Static195.anIntArray433[local151], this.aShortArray65[arg0]);
			}
		} else if (this.anIntArray416[arg0] == -1) {
			Static151.method2844(Static195.anIntArray442[local12], Static195.anIntArray442[local17], Static195.anIntArray442[local22], Static195.anIntArray444[local12], Static195.anIntArray444[local17], Static195.anIntArray444[local22], Static151.anIntArray324[this.anIntArray417[arg0] & 0xFFFF]);
		} else {
			Static151.method2847(Static195.anIntArray442[local12], Static195.anIntArray442[local17], Static195.anIntArray442[local22], Static195.anIntArray444[local12], Static195.anIntArray444[local17], Static195.anIntArray444[local22], this.anIntArray417[arg0] & 0xFFFF, this.anIntArray408[arg0] & 0xFFFF, this.anIntArray416[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3482(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static195.aByteArray62.length < this.anInt4410) {
			Static195.aByteArray62 = new byte[this.anInt4410 + 100];
		}
		if (!arg1 && Static195.aShortArray70.length < this.anInt4410) {
			Static195.anIntArray427 = new int[this.anInt4410 + 100];
			Static195.anIntArray430 = new int[this.anInt4410 + 100];
			Static195.anIntArray437 = new int[this.anInt4410 + 100];
			Static195.aShortArray70 = new short[this.anInt4410 + 100];
		}
		return this.method3492(arg0, arg1, Static195.aClass25_Sub2_Sub2_3, Static195.aByteArray62, Static195.aShortArray70, Static195.anIntArray427, Static195.anIntArray430, Static195.anIntArray437);
	}

	@OriginalMember(owner = "client!om", name = "n", descriptor = "()V")
	private void method3495() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4411; local17++) {
			@Pc(26) int local26 = this.anIntArray409[local17];
			@Pc(31) int local31 = this.anIntArray421[local17];
			@Pc(36) int local36 = this.anIntArray414[local17];
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
		this.aShort31 = (short) local1;
		this.aShort29 = (short) local7;
		this.aShort28 = (short) local3;
		this.aShort34 = (short) local9;
		this.aShort35 = (short) local5;
		this.aShort32 = (short) local11;
		this.aShort33 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort30 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean233 = true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZJIILclient!ll;)V")
	private void method3496(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class95_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static195.aBoolean235) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray435[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray436[local11] = 0;
			}
			Static195.anInt4415 = 0;
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
		for (local11 = 0; local11 < this.anInt4410; local11++) {
			if (this.anIntArray416[local11] != -2) {
				local51 = this.anIntArray407[local11];
				local56 = this.anIntArray413[local11];
				local61 = this.anIntArray415[local11];
				local65 = Static195.anIntArray444[local51];
				local69 = Static195.anIntArray444[local56];
				@Pc(73) int local73 = Static195.anIntArray444[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static195.anIntArray445[local51];
					local92 = Static195.anIntArray445[local56];
					local96 = Static195.anIntArray445[local61];
					@Pc(100) int local100 = Static195.anIntArray431[local51];
					local104 = Static195.anIntArray431[local56];
					@Pc(108) int local108 = Static195.anIntArray431[local61];
					@Pc(112) int local112 = Static195.anIntArray433[local51];
					@Pc(116) int local116 = Static195.anIntArray433[local56];
					@Pc(120) int local120 = Static195.anIntArray433[local61];
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
						Static195.aBooleanArray19[local11] = true;
						if (Static195.aBoolean235) {
							anIntArray425[local5] = (Static195.anIntArray441[local51] + Static195.anIntArray441[local56] + Static195.anIntArray441[local61]) / 3;
							anIntArray443[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static195.anIntArray441[local51] + Static195.anIntArray441[local56] + Static195.anIntArray441[local61]) / 3 + arg3;
							if (anIntArray435[local224] < 64) {
								anIntArrayArray35[local224][anIntArray435[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray435[local224];
								if (local247 == 64) {
									if (Static195.anInt4415 == 512) {
										continue;
									}
									anIntArray435[local224] = local247 = Static195.anInt4415++ + 65;
								}
								local247 -= 65;
								anIntArrayArray33[local247][anIntArray436[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method3497(Static24.anInt490 + Static151.anInt3525, Static45.anInt1287 + Static151.anInt3522, Static195.anIntArray442[local51], Static195.anIntArray442[local56], Static195.anIntArray442[local61], local65, local69, local73)) {
						Static174.aLongArray9[Static129.anInt2873++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static195.anIntArray442[local61] - Static195.anIntArray442[local56]) - (Static195.anIntArray442[local51] - Static195.anIntArray442[local56]) * (local73 - local69) > 0) {
						Static195.aBooleanArray19[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static151.anInt3523 && local69 <= Static151.anInt3523 && local73 <= Static151.anInt3523) {
							Static195.aBooleanArray18[local11] = false;
						} else {
							Static195.aBooleanArray18[local11] = true;
						}
						if (Static195.aBoolean235) {
							anIntArray425[local5] = (Static195.anIntArray441[local51] + Static195.anIntArray441[local56] + Static195.anIntArray441[local61]) / 3;
							anIntArray443[local5++] = local11;
						} else {
							local88 = (Static195.anIntArray441[local51] + Static195.anIntArray441[local56] + Static195.anIntArray441[local61]) / 3 + arg3;
							if (anIntArray435[local88] < 64) {
								anIntArrayArray35[local88][anIntArray435[local88]++] = local11;
							} else {
								local92 = anIntArray435[local88];
								if (local92 == 64) {
									if (Static195.anInt4415 == 512) {
										continue;
									}
									anIntArray435[local88] = local92 = Static195.anInt4415++ + 65;
								}
								local92 -= 65;
								anIntArrayArray33[local92][anIntArray436[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static195.aBoolean235) {
			Static183.method3314(0, anIntArray443, local5 - 1, anIntArray425);
			if (this.aByteArray58 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method3493(anIntArray443[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static195.anIntArray432[local11] = 0;
				Static195.anIntArray428[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray443[local11];
				local56 = anIntArray425[local11];
				@Pc(523) byte local523 = this.aByteArray58[local51];
				local65 = Static195.anIntArray432[local523]++;
				Static195.anIntArrayArray34[local523][local65] = local51;
				if (local523 < 10) {
					Static195.anIntArray428[local523] += local56;
				} else if (local523 == 10) {
					Static195.anIntArray439[local65] = local56;
				} else {
					Static195.anIntArray434[local65] = local56;
				}
			}
		} else {
			@Pc(590) int[] local590;
			if (this.aByteArray58 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray435[local11];
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local590 = anIntArrayArray35[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method3493(local590[local65]);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray435[local11] - 64 - 1;
						local590 = anIntArrayArray33[local56];
						for (local65 = 0; local65 < anIntArray436[local56]; local65++) {
							local69 = local590[local65];
							if (local69 < 65536) {
								this.method3493(local590[local65]);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static195.anIntArray432[local11] = 0;
				Static195.anIntArray428[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray435[local11];
				@Pc(704) byte local704;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local590 = anIntArrayArray35[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray58[local69];
							local88 = Static195.anIntArray432[local704]++;
							Static195.anIntArrayArray34[local704][local88] = local69;
							if (local704 < 10) {
								Static195.anIntArray428[local704] += local11;
							} else if (local704 == 10) {
								Static195.anIntArray439[local88] = local11;
							} else {
								Static195.anIntArray434[local88] = local11;
							}
						} else {
							Static195.anIntArray440[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray435[local11] - 64 - 1;
					local590 = anIntArrayArray33[local56];
					for (local65 = 0; local65 < anIntArray436[local56]; local65++) {
						local69 = local590[local65];
						if (local69 < 65536) {
							local704 = this.aByteArray58[local69];
							local88 = Static195.anIntArray432[local704]++;
							Static195.anIntArrayArray34[local704][local88] = local69;
							if (local704 < 10) {
								Static195.anIntArray428[local704] += local11;
							} else if (local704 == 10) {
								Static195.anIntArray439[local88] = local11;
							} else {
								Static195.anIntArray434[local88] = local11;
							}
						} else {
							Static195.anIntArray440[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static195.anIntArray432[1] > 0 || Static195.anIntArray432[2] > 0) {
			local11 = (Static195.anIntArray428[1] + Static195.anIntArray428[2]) / (Static195.anIntArray432[1] + Static195.anIntArray432[2]);
		}
		local51 = 0;
		if (Static195.anIntArray432[3] > 0 || Static195.anIntArray432[4] > 0) {
			local51 = (Static195.anIntArray428[3] + Static195.anIntArray428[4]) / (Static195.anIntArray432[3] + Static195.anIntArray432[4]);
		}
		local56 = 0;
		if (Static195.anIntArray432[6] > 0 || Static195.anIntArray432[8] > 0) {
			local56 = (Static195.anIntArray428[6] + Static195.anIntArray428[8]) / (Static195.anIntArray432[6] + Static195.anIntArray432[8]);
		}
		local65 = 0;
		local69 = Static195.anIntArray432[10];
		@Pc(928) int[] local928 = Static195.anIntArrayArray34[10];
		@Pc(930) int[] local930 = Static195.anIntArray439;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static195.anIntArray432[11];
			local928 = Static195.anIntArrayArray34[11];
			local930 = Static195.anIntArray434;
		}
		if (local69 > 0) {
			local61 = local930[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local11) {
				this.method3493(local928[local65++]);
				if (local65 == local69 && local928 != Static195.anIntArrayArray34[11]) {
					local65 = 0;
					local69 = Static195.anIntArray432[11];
					local928 = Static195.anIntArrayArray34[11];
					local930 = Static195.anIntArray434;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local51) {
				this.method3493(local928[local65++]);
				if (local65 == local69 && local928 != Static195.anIntArrayArray34[11]) {
					local65 = 0;
					local69 = Static195.anIntArray432[11];
					local928 = Static195.anIntArrayArray34[11];
					local930 = Static195.anIntArray434;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local56) {
				this.method3493(local928[local65++]);
				if (local65 == local69 && local928 != Static195.anIntArrayArray34[11]) {
					local65 = 0;
					local69 = Static195.anIntArray432[11];
					local928 = Static195.anIntArrayArray34[11];
					local930 = Static195.anIntArray434;
				}
				if (local65 < local69) {
					local61 = local930[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static195.anIntArray432[local92];
			@Pc(1096) int[] local1096 = Static195.anIntArrayArray34[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method3493(local1096[local104]);
			}
		}
		while (local61 != -1000) {
			this.method3493(local928[local65++]);
			if (local65 == local69 && local928 != Static195.anIntArrayArray34[11]) {
				local65 = 0;
				local928 = Static195.anIntArrayArray34[11];
				local69 = Static195.anIntArray432[11];
				local930 = Static195.anIntArray434;
			}
			if (local65 < local69) {
				local61 = local930[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()I")
	@Override
	public int method3466() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean233) {
				this.method3495();
			}
			@Pc(6) int local6 = Static151.anInt3525;
			@Pc(8) int local8 = Static151.anInt3522;
			@Pc(12) int local12 = Class91.anIntArray319[0];
			@Pc(16) int local16 = Class91.anIntArray320[0];
			@Pc(20) int local20 = Class91.anIntArray319[arg0];
			@Pc(24) int local24 = Class91.anIntArray320[arg0];
			@Pc(28) int local28 = Class91.anIntArray319[arg1];
			@Pc(32) int local32 = Class91.anIntArray320[arg1];
			@Pc(36) int local36 = Class91.anIntArray319[arg2];
			@Pc(40) int local40 = Class91.anIntArray320[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4409; local52++) {
				@Pc(61) int local61 = this.anIntArray409[local52];
				@Pc(66) int local66 = this.anIntArray421[local52];
				@Pc(71) int local71 = this.anIntArray414[local52];
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
				Static195.anIntArray441[local52] = local71 - local50;
				Static195.anIntArray444[local52] = local6 + (local61 << 9) / local71;
				Static195.anIntArray442[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt4412 > 0) {
					Static195.anIntArray445[local52] = local61;
					Static195.anIntArray431[local52] = local83;
					Static195.anIntArray433[local52] = local71;
				}
			}
			this.method3496(false, arg6 >= 0L, arg6, this.aShort30, this.aShort30 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static195.anInt4414 = 0;
			Static195.anInt4416 = 0;
			Static195.anInt4413 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray32.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray32[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local41]) != 0) {
							Static195.anInt4414 += this.anIntArray409[local41];
							Static195.anInt4416 += this.anIntArray421[local41];
							Static195.anInt4413 += this.anIntArray414[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static195.anInt4414 = Static195.anInt4414 / local6 + arg2;
				Static195.anInt4416 = Static195.anInt4416 / local6 + arg3;
				Static195.anInt4413 = Static195.anInt4413 / local6 + arg4;
				Static195.aBoolean236 = true;
			} else {
				Static195.anInt4414 = arg2;
				Static195.anInt4416 = arg3;
				Static195.anInt4413 = arg4;
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
				if (local14 < this.anIntArrayArray32.length) {
					local204 = this.anIntArrayArray32[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local33]) != 0) {
							this.anIntArray409[local33] += arg2;
							this.anIntArray421[local33] += arg3;
							this.anIntArray414[local33] += arg4;
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
					if (local14 < this.anIntArrayArray32.length) {
						local204 = this.anIntArrayArray32[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local33]) != 0) {
								this.anIntArray409[local33] -= Static195.anInt4414;
								this.anIntArray421[local33] -= Static195.anInt4416;
								this.anIntArray414[local33] -= Static195.anInt4413;
								if (arg4 != 0) {
									local41 = Class91.anIntArray319[arg4];
									local307 = Class91.anIntArray320[arg4];
									local329 = this.anIntArray421[local33] * local41 + this.anIntArray409[local33] * local307 + 32767 >> 16;
									this.anIntArray421[local33] = this.anIntArray421[local33] * local307 + 32767 - this.anIntArray409[local33] * local41 >> 16;
									this.anIntArray409[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class91.anIntArray319[arg2];
									local307 = Class91.anIntArray320[arg2];
									local329 = this.anIntArray421[local33] * local307 + 32767 - this.anIntArray414[local33] * local41 >> 16;
									this.anIntArray414[local33] = this.anIntArray421[local33] * local41 + this.anIntArray414[local33] * local307 + 32767 >> 16;
									this.anIntArray421[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class91.anIntArray319[arg3];
									local307 = Class91.anIntArray320[arg3];
									local329 = this.anIntArray414[local33] * local41 + this.anIntArray409[local33] * local307 + 32767 >> 16;
									this.anIntArray414[local33] = this.anIntArray414[local33] * local307 + 32767 - this.anIntArray409[local33] * local41 >> 16;
									this.anIntArray409[local33] = local329;
								}
								this.anIntArray409[local33] += Static195.anInt4414;
								this.anIntArray421[local33] += Static195.anInt4416;
								this.anIntArray414[local33] += Static195.anInt4413;
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
				if (Static195.aBoolean236) {
					local307 = arg7[0] * Static195.anInt4414 + arg7[3] * Static195.anInt4416 + arg7[6] * Static195.anInt4413 + 16384 >> 15;
					local329 = arg7[1] * Static195.anInt4414 + arg7[4] * Static195.anInt4416 + arg7[7] * Static195.anInt4413 + 16384 >> 15;
					local351 = arg7[2] * Static195.anInt4414 + arg7[5] * Static195.anInt4416 + arg7[8] * Static195.anInt4413 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static195.anInt4414 = local307;
					Static195.anInt4416 = local329;
					Static195.anInt4413 = local351;
					Static195.aBoolean236 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class91.anIntArray320[arg2] >> 1;
				local351 = Class91.anIntArray319[arg2] >> 1;
				local392 = Class91.anIntArray320[arg3] >> 1;
				local398 = Class91.anIntArray319[arg3] >> 1;
				local404 = Class91.anIntArray320[arg4] >> 1;
				local410 = Class91.anIntArray319[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static195.anInt4414 + local374[1] * -Static195.anInt4416 + local374[2] * -Static195.anInt4413 + 16384 >> 15;
				local579 = local374[3] * -Static195.anInt4414 + local374[4] * -Static195.anInt4416 + local374[5] * -Static195.anInt4413 + 16384 >> 15;
				local604 = local374[6] * -Static195.anInt4414 + local374[7] * -Static195.anInt4416 + local374[8] * -Static195.anInt4413 + 16384 >> 15;
				local608 = local554 + Static195.anInt4414;
				@Pc(612) int local612 = local579 + Static195.anInt4416;
				local616 = local604 + Static195.anInt4413;
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
					if (local893 < this.anIntArrayArray32.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray32[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray409[local913] + local753[1] * this.anIntArray421[local913] + local753[2] * this.anIntArray414[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray409[local913] + local753[4] * this.anIntArray421[local913] + local753[5] * this.anIntArray414[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray409[local913] + local753[7] * this.anIntArray421[local913] + local753[8] * this.anIntArray414[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray409[local913] = local1021;
								this.anIntArray421[local913] = local1025;
								this.anIntArray414[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray32.length) {
						local204 = this.anIntArrayArray32[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local33]) != 0) {
								this.anIntArray409[local33] -= Static195.anInt4414;
								this.anIntArray421[local33] -= Static195.anInt4416;
								this.anIntArray414[local33] -= Static195.anInt4413;
								this.anIntArray409[local33] = this.anIntArray409[local33] * arg2 / 128;
								this.anIntArray421[local33] = this.anIntArray421[local33] * arg3 / 128;
								this.anIntArray414[local33] = this.anIntArray414[local33] * arg4 / 128;
								this.anIntArray409[local33] += Static195.anInt4414;
								this.anIntArray421[local33] += Static195.anInt4416;
								this.anIntArray414[local33] += Static195.anInt4413;
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
				if (Static195.aBoolean236) {
					local307 = arg7[0] * Static195.anInt4414 + arg7[3] * Static195.anInt4416 + arg7[6] * Static195.anInt4413 + 16384 >> 15;
					local329 = arg7[1] * Static195.anInt4414 + arg7[4] * Static195.anInt4416 + arg7[7] * Static195.anInt4413 + 16384 >> 15;
					local351 = arg7[2] * Static195.anInt4414 + arg7[5] * Static195.anInt4416 + arg7[8] * Static195.anInt4413 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static195.anInt4414 = local307;
					Static195.anInt4416 = local329;
					Static195.anInt4413 = local351;
					Static195.aBoolean236 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static195.anInt4414 + 16384 >> 15;
				local398 = local329 * -Static195.anInt4416 + 16384 >> 15;
				local404 = local351 * -Static195.anInt4413 + 16384 >> 15;
				local410 = local392 + Static195.anInt4414;
				local418 = local398 + Static195.anInt4416;
				local426 = local404 + Static195.anInt4413;
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
					if (local631 < this.anIntArrayArray32.length) {
						local753 = this.anIntArrayArray32[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray409[local760] + local1628[1] * this.anIntArray421[local760] + local1628[2] * this.anIntArray414[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray409[local760] + local1628[4] * this.anIntArray421[local760] + local1628[5] * this.anIntArray414[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray409[local760] + local1628[7] * this.anIntArray421[local760] + local1628[8] * this.anIntArray414[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray409[local760] = local1896;
								this.anIntArray421[local760] = local1900;
								this.anIntArray414[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray60 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local204 = this.anIntArrayArray31[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local33]) != 0) {
								local41 = (this.aByteArray60[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray60[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray31 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray31.length) {
					local204 = this.anIntArrayArray31[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local33]) != 0) {
							local41 = this.aShortArray64[local33] & 0xFFFF;
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
							this.aShortArray64[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean234 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		if (!this.aBoolean233) {
			this.method3495();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort33 * arg2 + this.aShort34 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort33 * arg2 + this.aShort28 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort33 << 9;
		if (local78 / local38 <= Static9.anInt271) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort33 << 9;
		if (local91 / local38 >= Static148.anInt3502) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort33 * arg1 + this.aShort34 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static91.anInt2137) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort33 * arg1 + this.aShort28 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static234.anInt5157) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt4412 > 0;
		@Pc(172) int local172 = Static151.anInt3525;
		@Pc(174) int local174 = Static151.anInt3522;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class91.anIntArray319[arg0];
			local178 = Class91.anIntArray320[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static212.aBoolean252 && local53 > 0) {
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
			if (Static24.anInt490 >= local204 && Static24.anInt490 <= local208 && Static45.anInt1287 >= local223 && Static45.anInt1287 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29 };
				@Pc(342) int[] local342 = new int[] { this.aShort35, this.aShort35, this.aShort32, this.aShort32, this.aShort35, this.aShort35, this.aShort32, this.aShort32 };
				@Pc(385) int[] local385 = new int[] { this.aShort28, this.aShort28, this.aShort28, this.aShort28, this.aShort34, this.aShort34, this.aShort34, this.aShort34 };
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
				if (Static24.anInt490 >= local204 && Static24.anInt490 <= local208 && Static45.anInt1287 >= local223 && Static45.anInt1287 <= local227) {
					if (this.aBoolean232) {
						Static174.aLongArray9[Static129.anInt2873++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt4409; local204++) {
			local223 = this.anIntArray409[local204];
			local208 = this.anIntArray421[local204];
			local227 = this.anIntArray414[local204];
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
			Static195.anIntArray441[local204] = local227 - local24;
			if (local227 >= 50) {
				Static195.anIntArray444[local204] = local172 + (local223 << 9) / local227;
				Static195.anIntArray442[local204] = local174 + (local577 << 9) / local227;
			} else {
				Static195.anIntArray444[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static195.anIntArray445[local204] = local223;
				Static195.anIntArray431[local204] = local577;
				Static195.anIntArray433[local204] = local227;
			}
		}
		try {
			this.method3496(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!lf;)Lclient!lf;")
	public Class25_Sub2 method3499(@OriginalArg(0) Class25_Sub2 arg0) {
		return new Class25_Sub2_Sub2(new Class25_Sub2_Sub2[] { this, (Class25_Sub2_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!om", name = "l", descriptor = "()I")
	@Override
	public int method3489() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	@Override
	public void method3480(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4409; local9++) {
			@Pc(29) int local29 = this.anIntArray414[local9] * local3 + this.anIntArray409[local9] * local7 >> 16;
			this.anIntArray414[local9] = this.anIntArray414[local9] * local7 - this.anIntArray409[local9] * local3 >> 16;
			this.anIntArray409[local9] = local29;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3468(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static195.aByteArray59.length < this.anInt4410) {
			Static195.aByteArray59 = new byte[this.anInt4410 + 100];
		}
		if (!arg1 && Static195.aShortArray68.length < this.anInt4410) {
			Static195.anIntArray418 = new int[this.anInt4410 + 100];
			Static195.anIntArray420 = new int[this.anInt4410 + 100];
			Static195.anIntArray419 = new int[this.anInt4410 + 100];
			Static195.aShortArray68 = new short[this.anInt4410 + 100];
		}
		return this.method3492(arg0, arg1, Static195.aClass25_Sub2_Sub2_1, Static195.aByteArray59, Static195.aShortArray68, Static195.anIntArray418, Static195.anIntArray420, Static195.anIntArray419);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	private void method3501(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static151.anInt3525;
		@Pc(3) int local3 = Static151.anInt3522;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray407[arg0];
		@Pc(15) int local15 = this.anIntArray413[arg0];
		@Pc(20) int local20 = this.anIntArray415[arg0];
		@Pc(24) int local24 = Static195.anIntArray433[local10];
		@Pc(28) int local28 = Static195.anIntArray433[local15];
		@Pc(32) int local32 = Static195.anIntArray433[local20];
		if (this.aByteArray60 == null) {
			Static151.anInt3526 = 0;
		} else {
			Static151.anInt3526 = this.aByteArray60[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static195.anIntArray438[0] = Static195.anIntArray444[local10];
			Static195.anIntArray429[0] = Static195.anIntArray442[local10];
			local5++;
			Static195.anIntArray426[0] = this.anIntArray417[arg0] & 0xFFFF;
		} else {
			local75 = Static195.anIntArray445[local10];
			local79 = Static195.anIntArray431[local10];
			local86 = this.anIntArray417[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class91.anIntArray321[local32 - local24];
				Static195.anIntArray438[0] = local1 + (local75 + ((Static195.anIntArray445[local20] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[0] = local3 + (local79 + ((Static195.anIntArray431[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static195.anIntArray426[0] = local86 + (((this.anIntArray416[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class91.anIntArray321[local28 - local24];
				Static195.anIntArray438[local5] = local1 + (local75 + ((Static195.anIntArray445[local15] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[local5] = local3 + (local79 + ((Static195.anIntArray431[local15] - local79) * local99 >> 16) << 9) / 50;
				Static195.anIntArray426[local5++] = local86 + (((this.anIntArray408[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static195.anIntArray438[local5] = Static195.anIntArray444[local15];
			Static195.anIntArray429[local5] = Static195.anIntArray442[local15];
			Static195.anIntArray426[local5++] = this.anIntArray408[arg0] & 0xFFFF;
		} else {
			local75 = Static195.anIntArray445[local15];
			local79 = Static195.anIntArray431[local15];
			local86 = this.anIntArray408[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class91.anIntArray321[local24 - local28];
				Static195.anIntArray438[local5] = local1 + (local75 + ((Static195.anIntArray445[local10] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[local5] = local3 + (local79 + ((Static195.anIntArray431[local10] - local79) * local99 >> 16) << 9) / 50;
				Static195.anIntArray426[local5++] = local86 + (((this.anIntArray417[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class91.anIntArray321[local32 - local28];
				Static195.anIntArray438[local5] = local1 + (local75 + ((Static195.anIntArray445[local20] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[local5] = local3 + (local79 + ((Static195.anIntArray431[local20] - local79) * local99 >> 16) << 9) / 50;
				Static195.anIntArray426[local5++] = local86 + (((this.anIntArray416[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static195.anIntArray438[local5] = Static195.anIntArray444[local20];
			Static195.anIntArray429[local5] = Static195.anIntArray442[local20];
			Static195.anIntArray426[local5++] = this.anIntArray416[arg0] & 0xFFFF;
		} else {
			local75 = Static195.anIntArray445[local20];
			local79 = Static195.anIntArray431[local20];
			local86 = this.anIntArray416[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class91.anIntArray321[local28 - local32];
				Static195.anIntArray438[local5] = local1 + (local75 + ((Static195.anIntArray445[local15] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[local5] = local3 + (local79 + ((Static195.anIntArray431[local15] - local79) * local99 >> 16) << 9) / 50;
				Static195.anIntArray426[local5++] = local86 + (((this.anIntArray408[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class91.anIntArray321[local24 - local32];
				Static195.anIntArray438[local5] = local1 + (local75 + ((Static195.anIntArray445[local10] - local75) * local99 >> 16) << 9) / 50;
				Static195.anIntArray429[local5] = local3 + (local79 + ((Static195.anIntArray431[local10] - local79) * local99 >> 16) << 9) / 50;
				Static195.anIntArray426[local5++] = local86 + (((this.anIntArray417[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static195.anIntArray438[0];
		local79 = Static195.anIntArray438[1];
		local86 = Static195.anIntArray438[2];
		local99 = Static195.anIntArray429[0];
		@Pc(614) int local614 = Static195.anIntArray429[1];
		@Pc(618) int local618 = Static195.anIntArray429[2];
		Static151.aBoolean181 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static151.anInt3523 || local79 > Static151.anInt3523 || local86 > Static151.anInt3523) {
				Static151.aBoolean181 = true;
			}
			if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
				if (this.aByteArray57 == null || this.aByteArray57[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray57[arg0] & 0xFF;
					local709 = this.anIntArray411[local704];
					local714 = this.anIntArray412[local704];
					local719 = this.anIntArray410[local704];
				}
				if (this.anIntArray416[arg0] == -1) {
					Static151.method2834(local99, local614, local618, local75, local79, local86, this.anIntArray417[arg0], this.anIntArray417[arg0], this.anIntArray417[arg0], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], this.aShortArray65[arg0]);
				} else {
					Static151.method2834(local99, local614, local618, local75, local79, local86, Static195.anIntArray426[0], Static195.anIntArray426[1], Static195.anIntArray426[2], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], this.aShortArray65[arg0]);
				}
			} else if (this.anIntArray416[arg0] == -1) {
				Static151.method2844(local99, local614, local618, local75, local79, local86, Static151.anIntArray324[this.anIntArray417[arg0] & 0xFFFF]);
			} else {
				Static151.method2847(local99, local614, local618, local75, local79, local86, Static195.anIntArray426[0], Static195.anIntArray426[1], Static195.anIntArray426[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static151.anInt3523 || local79 > Static151.anInt3523 || local86 > Static151.anInt3523 || Static195.anIntArray438[3] < 0 || Static195.anIntArray438[3] > Static151.anInt3523) {
			Static151.aBoolean181 = true;
		}
		if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
			if (this.aByteArray57 == null || this.aByteArray57[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray57[arg0] & 0xFF;
				local709 = this.anIntArray411[local704];
				local714 = this.anIntArray412[local704];
				local719 = this.anIntArray410[local704];
			}
			@Pc(984) short local984 = this.aShortArray65[arg0];
			if (this.anIntArray416[arg0] == -1) {
				Static151.method2834(local99, local614, local618, local75, local79, local86, this.anIntArray417[arg0], this.anIntArray417[arg0], this.anIntArray417[arg0], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], local984);
				Static151.method2834(local99, local618, Static195.anIntArray429[3], local75, local86, Static195.anIntArray438[3], this.anIntArray417[arg0], this.anIntArray417[arg0], this.anIntArray417[arg0], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], local984);
			} else {
				Static151.method2834(local99, local614, local618, local75, local79, local86, Static195.anIntArray426[0], Static195.anIntArray426[1], Static195.anIntArray426[2], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], local984);
				Static151.method2834(local99, local618, Static195.anIntArray429[3], local75, local86, Static195.anIntArray438[3], Static195.anIntArray426[0], Static195.anIntArray426[2], Static195.anIntArray426[3], Static195.anIntArray445[local709], Static195.anIntArray445[local714], Static195.anIntArray445[local719], Static195.anIntArray431[local709], Static195.anIntArray431[local714], Static195.anIntArray431[local719], Static195.anIntArray433[local709], Static195.anIntArray433[local714], Static195.anIntArray433[local719], local984);
			}
		} else if (this.anIntArray416[arg0] == -1) {
			local709 = Static151.anIntArray324[this.anIntArray417[arg0] & 0xFFFF];
			Static151.method2844(local99, local614, local618, local75, local79, local86, local709);
			Static151.method2844(local99, local618, Static195.anIntArray429[3], local75, local86, Static195.anIntArray438[3], local709);
		} else {
			Static151.method2847(local99, local614, local618, local75, local79, local86, Static195.anIntArray426[0], Static195.anIntArray426[1], Static195.anIntArray426[2]);
			Static151.method2847(local99, local618, Static195.anIntArray429[3], local75, local86, Static195.anIntArray438[3], Static195.anIntArray426[0], Static195.anIntArray426[2], Static195.anIntArray426[3]);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "()I")
	@Override
	public int method3462() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	@Override
	public void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4409; local1++) {
			this.anIntArray409[local1] += arg0;
			this.anIntArray421[local1] += arg1;
			this.anIntArray414[local1] += arg2;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "k", descriptor = "()Z")
	@Override
	protected boolean method3488() {
		if (this.anIntArrayArray32 == null) {
			return false;
		} else {
			Static195.anInt4414 = 0;
			Static195.anInt4416 = 0;
			Static195.anInt4413 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3463(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static195.aByteArray61.length < this.anInt4410) {
			Static195.aByteArray61 = new byte[this.anInt4410 + 100];
		}
		if (!arg1 && Static195.aShortArray69.length < this.anInt4410) {
			Static195.anIntArray422 = new int[this.anInt4410 + 100];
			Static195.anIntArray423 = new int[this.anInt4410 + 100];
			Static195.anIntArray424 = new int[this.anInt4410 + 100];
			Static195.aShortArray69 = new short[this.anInt4410 + 100];
		}
		return this.method3492(arg0, arg1, Static195.aClass25_Sub2_Sub2_2, Static195.aByteArray61, Static195.aShortArray69, Static195.anIntArray422, Static195.anIntArray423, Static195.anIntArray424);
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "()I")
	@Override
	public int method3470() {
		if (!this.aBoolean233) {
			this.method3495();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "()V")
	@Override
	public void method3467() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4409; local1++) {
			@Pc(10) int local10 = this.anIntArray409[local1];
			this.anIntArray409[local1] = this.anIntArray414[local1];
			this.anIntArray414[local1] = -local10;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IIIIIIII)V")
	public void method3503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean233) {
				this.method3495();
			}
			@Pc(6) int local6 = Static151.anInt3525;
			@Pc(8) int local8 = Static151.anInt3522;
			@Pc(12) int local12 = Class91.anIntArray319[0];
			@Pc(16) int local16 = Class91.anIntArray320[0];
			@Pc(20) int local20 = Class91.anIntArray319[arg0];
			@Pc(24) int local24 = Class91.anIntArray320[arg0];
			@Pc(28) int local28 = Class91.anIntArray319[arg1];
			@Pc(32) int local32 = Class91.anIntArray320[arg1];
			@Pc(36) int local36 = Class91.anIntArray319[arg2];
			@Pc(40) int local40 = Class91.anIntArray320[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4409; local52++) {
				@Pc(61) int local61 = this.anIntArray409[local52];
				@Pc(66) int local66 = this.anIntArray421[local52];
				@Pc(71) int local71 = this.anIntArray414[local52];
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
				Static195.anIntArray441[local52] = local71 - local50;
				Static195.anIntArray444[local52] = local6 + (local61 << 9) / arg6;
				Static195.anIntArray442[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt4412 > 0) {
					Static195.anIntArray445[local52] = local61;
					Static195.anIntArray431[local52] = local83;
					Static195.anIntArray433[local52] = local71;
				}
			}
			this.method3496(false, false, 0L, this.aShort30, this.aShort30 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(III)V")
	@Override
	public void method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4409; local1++) {
			this.anIntArray409[local1] = this.anIntArray409[local1] * arg0 / 128;
			this.anIntArray421[local1] = this.anIntArray421[local1] * arg1 / 128;
			this.anIntArray414[local1] = this.anIntArray414[local1] * arg2 / 128;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "r", descriptor = "()V")
	private void method3504() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4410; local1++) {
			@Pc(15) short local15 = this.aShortArray65 == null ? -1 : this.aShortArray65[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray64[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray416[local1] == -1) {
					local38 = this.anIntArray417[local1] & 0xFFFE0000;
					this.anIntArray417[local1] = local38 | Static195.method3494(local25, local38 >> 17);
				} else if (this.anIntArray416[local1] != -2) {
					local38 = this.anIntArray417[local1] & 0xFFFE0000;
					this.anIntArray417[local1] = local38 | Static195.method3494(local25, local38 >> 17);
					local38 = this.anIntArray408[local1] & 0xFFFE0000;
					this.anIntArray408[local1] = local38 | Static195.method3494(local25, local38 >> 17);
					local38 = this.anIntArray416[local1] & 0xFFFE0000;
					this.anIntArray416[local1] = local38 | Static195.method3494(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "()V")
	@Override
	protected void method3469() {
		if (this.aBoolean234) {
			this.method3504();
			this.aBoolean234 = false;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static195.anInt4414 = 0;
			Static195.anInt4416 = 0;
			Static195.anInt4413 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray32.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray32[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static195.anInt4414 += this.anIntArray409[local41];
						Static195.anInt4416 += this.anIntArray421[local41];
						Static195.anInt4413 += this.anIntArray414[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static195.anInt4414 = Static195.anInt4414 / local6 + arg2;
				Static195.anInt4416 = Static195.anInt4416 / local6 + arg3;
				Static195.anInt4413 = Static195.anInt4413 / local6 + arg4;
			} else {
				Static195.anInt4414 = arg2;
				Static195.anInt4416 = arg3;
				Static195.anInt4413 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local117 = this.anIntArrayArray32[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray409[local33] += arg2;
						this.anIntArray421[local33] += arg3;
						this.anIntArray414[local33] += arg4;
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
				if (local14 < this.anIntArrayArray32.length) {
					local117 = this.anIntArrayArray32[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray409[local33] -= Static195.anInt4414;
						this.anIntArray421[local33] -= Static195.anInt4416;
						this.anIntArray414[local33] -= Static195.anInt4413;
						if (arg4 != 0) {
							local41 = Class91.anIntArray319[arg4];
							local222 = Class91.anIntArray320[arg4];
							local240 = this.anIntArray421[local33] * local41 + this.anIntArray409[local33] * local222 + 32767 >> 16;
							this.anIntArray421[local33] = this.anIntArray421[local33] * local222 + 32767 - this.anIntArray409[local33] * local41 >> 16;
							this.anIntArray409[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class91.anIntArray319[arg2];
							local222 = Class91.anIntArray320[arg2];
							local240 = this.anIntArray421[local33] * local222 + 32767 - this.anIntArray414[local33] * local41 >> 16;
							this.anIntArray414[local33] = this.anIntArray421[local33] * local41 + this.anIntArray414[local33] * local222 + 32767 >> 16;
							this.anIntArray421[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class91.anIntArray319[arg3];
							local222 = Class91.anIntArray320[arg3];
							local240 = this.anIntArray414[local33] * local41 + this.anIntArray409[local33] * local222 + 32767 >> 16;
							this.anIntArray414[local33] = this.anIntArray414[local33] * local222 + 32767 - this.anIntArray409[local33] * local41 >> 16;
							this.anIntArray409[local33] = local240;
						}
						this.anIntArray409[local33] += Static195.anInt4414;
						this.anIntArray421[local33] += Static195.anInt4416;
						this.anIntArray414[local33] += Static195.anInt4413;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local117 = this.anIntArrayArray32[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray409[local33] -= Static195.anInt4414;
						this.anIntArray421[local33] -= Static195.anInt4416;
						this.anIntArray414[local33] -= Static195.anInt4413;
						this.anIntArray409[local33] = this.anIntArray409[local33] * arg2 / 128;
						this.anIntArray421[local33] = this.anIntArray421[local33] * arg3 / 128;
						this.anIntArray414[local33] = this.anIntArray414[local33] * arg4 / 128;
						this.anIntArray409[local33] += Static195.anInt4414;
						this.anIntArray421[local33] += Static195.anInt4416;
						this.anIntArray414[local33] += Static195.anInt4413;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray60 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local117 = this.anIntArrayArray31[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray60[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray60[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray31 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray31.length) {
					local117 = this.anIntArrayArray31[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray64[local33] & 0xFFFF;
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
						this.aShortArray64[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean234 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!om;")
	public Class25_Sub2_Sub2 method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean233) {
			this.method3495();
		}
		@Pc(9) int local9 = arg4 + this.aShort31;
		@Pc(14) int local14 = arg4 + this.aShort29;
		@Pc(19) int local19 = arg6 + this.aShort35;
		@Pc(24) int local24 = arg6 + this.aShort32;
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
		@Pc(150) Class25_Sub2_Sub2 local150;
		if (arg7) {
			local150 = new Class25_Sub2_Sub2();
			local150.anInt4409 = this.anInt4409;
			local150.anInt4411 = this.anInt4411;
			local150.anInt4410 = this.anInt4410;
			local150.anInt4412 = this.anInt4412;
			local150.anIntArray407 = this.anIntArray407;
			local150.anIntArray413 = this.anIntArray413;
			local150.anIntArray415 = this.anIntArray415;
			local150.anIntArray417 = this.anIntArray417;
			local150.anIntArray408 = this.anIntArray408;
			local150.anIntArray416 = this.anIntArray416;
			local150.aByteArray58 = this.aByteArray58;
			local150.aByteArray57 = this.aByteArray57;
			local150.aShortArray65 = this.aShortArray65;
			local150.aShortArray64 = this.aShortArray64;
			local150.aByteArray60 = this.aByteArray60;
			local150.aByte16 = this.aByte16;
			local150.anIntArray411 = this.anIntArray411;
			local150.anIntArray412 = this.anIntArray412;
			local150.anIntArray410 = this.anIntArray410;
			local150.anIntArrayArray32 = this.anIntArrayArray32;
			local150.anIntArrayArray31 = this.anIntArrayArray31;
			local150.aShortArray67 = this.aShortArray67;
			local150.aShortArray66 = this.aShortArray66;
			local150.aBoolean232 = this.aBoolean232;
			if (arg0 == 3) {
				local150.anIntArray409 = Static261.method4462(this.anIntArray409);
				local150.anIntArray421 = Static261.method4462(this.anIntArray421);
				local150.anIntArray414 = Static261.method4462(this.anIntArray414);
			} else {
				local150.anIntArray409 = this.anIntArray409;
				local150.anIntArray421 = new int[local150.anInt4409];
				local150.anIntArray414 = this.anIntArray414;
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
			for (local289 = 0; local289 < local150.anInt4411; local289++) {
				local300 = this.anIntArray409[local289] + arg4;
				local307 = this.anIntArray414[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray421[local289] = this.anIntArray421[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt4411; local289 < local150.anInt4409; local289++) {
				local300 = this.anIntArray409[local289] + arg4;
				local307 = this.anIntArray414[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray421[local289] = this.anIntArray421[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt4411; local289++) {
					local300 = (this.anIntArray421[local289] << 16) / this.aShort28;
					if (local300 < arg1) {
						local307 = this.anIntArray409[local289] + arg4;
						local311 = this.anIntArray414[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray421[local289] = this.anIntArray421[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray421[local289] = this.anIntArray421[local289];
					}
				}
				for (local289 = local150.anInt4411; local289 < local150.anInt4409; local289++) {
					local300 = (this.anIntArray421[local289] << 16) / this.aShort28;
					if (local300 < arg1) {
						local307 = this.anIntArray409[local289] + arg4;
						local311 = this.anIntArray414[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray421[local289] = this.anIntArray421[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray421[local289] = this.anIntArray421[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3481(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort34 - this.aShort28;
				for (local300 = 0; local300 < this.anInt4411; local300++) {
					local307 = this.anIntArray409[local300] + arg4;
					local311 = this.anIntArray414[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray421[local300] = this.anIntArray421[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt4411; local300 < local150.anInt4409; local300++) {
					local307 = this.anIntArray409[local300] + arg4;
					local311 = this.anIntArray414[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray421[local300] = this.anIntArray421[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort34 - this.aShort28;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt4411; local300++) {
					local307 = this.anIntArray409[local300] + arg4;
					local311 = this.anIntArray414[local300] + arg6;
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
					local150.anIntArray421[local300] = ((this.anIntArray421[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt4411; local300 < local150.anInt4409; local300++) {
					local307 = this.anIntArray409[local300] + arg4;
					local311 = this.anIntArray414[local300] + arg6;
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
						local150.anIntArray421[local300] = ((this.anIntArray421[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean233 = false;
		return local150;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public void method3471(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4409; local9++) {
			@Pc(29) int local29 = this.anIntArray421[local9] * local7 - this.anIntArray414[local9] * local3 >> 16;
			this.anIntArray414[local9] = this.anIntArray421[local9] * local3 + this.anIntArray414[local9] * local7 >> 16;
			this.anIntArray421[local9] = local29;
		}
		this.aBoolean233 = false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	@Override
	public void method3464(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4409; local9++) {
			@Pc(29) int local29 = this.anIntArray421[local9] * local3 + this.anIntArray409[local9] * local7 >> 16;
			this.anIntArray421[local9] = this.anIntArray421[local9] * local7 - this.anIntArray409[local9] * local3 >> 16;
			this.anIntArray409[local9] = local29;
		}
		this.aBoolean233 = false;
	}
}
