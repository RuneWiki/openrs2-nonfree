import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class53_Sub4_Sub1 extends Class53_Sub4 {

	@OriginalMember(owner = "client!na", name = "Gb", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!na", name = "qb", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!na", name = "Mb", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[Lclient!u;")
	public Class170[] aClass170Array2;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!na", name = "T", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!na", name = "U", descriptor = "[Lclient!sk;")
	public Class161[] aClass161Array2;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	private int anInt3437 = 0;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
	private int anInt3439 = 0;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "I")
	private int anInt3438 = 0;

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
	public int anInt3440 = 0;

	static {
		if (Static180.aBoolean246) {
			anIntArray369 = new int[4096];
			anIntArray360 = new int[4096];
		} else {
			anIntArray374 = new int[1600];
			anIntArrayArray32 = new int[1600][64];
			anIntArray363 = new int[32];
			anIntArrayArray31 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class53_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!ml;IIIII)V")
	public Class53_Sub4_Sub1(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2777();
		arg0.method2757();
		this.anInt3440 = arg0.anInt3356;
		this.anInt3438 = arg0.anInt3355;
		this.anIntArray347 = arg0.anIntArray329;
		this.anIntArray344 = arg0.anIntArray324;
		this.anIntArray340 = arg0.anIntArray326;
		this.anInt3439 = arg0.anInt3353;
		this.anIntArray343 = arg0.anIntArray331;
		this.anIntArray348 = arg0.anIntArray330;
		this.anIntArray339 = arg0.anIntArray332;
		this.aByteArray41 = arg0.aByteArray37;
		this.aByteArray42 = arg0.aByteArray33;
		this.aByte12 = arg0.aByte11;
		this.aShortArray63 = arg0.aShortArray53;
		this.anIntArrayArray29 = arg0.anIntArrayArray27;
		this.anIntArrayArray30 = arg0.anIntArrayArray26;
		this.aShortArray62 = arg0.aShortArray54;
		this.aClass161Array2 = arg0.aClass161Array1;
		this.aClass170Array2 = arg0.aClass170Array1;
		this.aShortArray64 = arg0.aShortArray52;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray345 = new int[this.anInt3439];
		this.anIntArray346 = new int[this.anInt3439];
		this.anIntArray342 = new int[this.anInt3439];
		@Pc(148) int local148;
		if (arg0.aShortArray51 == null) {
			this.aShortArray61 = null;
		} else {
			this.aShortArray61 = new short[this.anInt3439];
			for (local148 = 0; local148 < this.anInt3439; local148++) {
				@Pc(157) short local157 = arg0.aShortArray51[local148];
				if (local157 != -1 && Static158.anInterface5_1.method441(local157)) {
					this.aShortArray61[local148] = local157;
				} else {
					this.aShortArray61[local148] = -1;
				}
			}
		}
		if (arg0.anInt3352 > 0 && arg0.aByteArray35 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt3352];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt3439; local194++) {
				if (arg0.aByteArray35[local194] != -1) {
					local192[arg0.aByteArray35[local194] & 0xFF]++;
				}
			}
			this.anInt3437 = 0;
			for (local194 = 0; local194 < arg0.anInt3352; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray38[local194] == 0) {
					this.anInt3437++;
				}
			}
			this.anIntArray351 = new int[this.anInt3437];
			this.anIntArray353 = new int[this.anInt3437];
			this.anIntArray341 = new int[this.anInt3437];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt3352; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray38[local263] == 0) {
					this.anIntArray351[local194] = arg0.aShortArray59[local263] & 0xFFFF;
					this.anIntArray353[local194] = arg0.aShortArray56[local263] & 0xFFFF;
					this.anIntArray341[local194] = arg0.aShortArray57[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray43 = new byte[this.anInt3439];
			for (local263 = 0; local263 < this.anInt3439; local263++) {
				if (arg0.aByteArray35[local263] == -1) {
					this.aByteArray43[local263] = -1;
				} else {
					this.aByteArray43[local263] = (byte) local192[arg0.aByteArray35[local263] & 0xFF];
					if (this.aByteArray43[local263] == -1 && this.aShortArray61 != null) {
						this.aShortArray61[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt3439; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray40 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray40[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray33 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray33[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray61 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray61[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class31 local450;
			@Pc(483) int local483;
			@Pc(629) Class122 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray53[local148] & 0xFFFF;
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray343[local148]] == null) {
						local450 = arg0.aClass31Array1[this.anIntArray343[local148]];
					} else {
						local450 = arg0.aClass31Array2[this.anIntArray343[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620) << 17;
					this.anIntArray345[local148] = local483 | Static180.method2925(local431, local483 >> 17);
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray348[local148]] == null) {
						local450 = arg0.aClass31Array1[this.anIntArray348[local148]];
					} else {
						local450 = arg0.aClass31Array2[this.anIntArray348[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620) << 17;
					this.anIntArray346[local148] = local483 | Static180.method2925(local431, local483 >> 17);
					if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray339[local148]] == null) {
						local450 = arg0.aClass31Array1[this.anIntArray339[local148]];
					} else {
						local450 = arg0.aClass31Array2[this.anIntArray339[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620) << 17;
					this.anIntArray342[local148] = local483 | Static180.method2925(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass122Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt3342 + arg4 * local629.anInt3339 + arg5 * local629.anInt3343) / (local123 + local123 / 2) << 17;
					this.anIntArray345[local148] = local483 | Static180.method2925(arg0.aShortArray53[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray342[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray345[local148] = 128;
					this.anIntArray342[local148] = -1;
				} else {
					this.anIntArray342[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray343[local148]] == null) {
					local450 = arg0.aClass31Array1[this.anIntArray343[local148]];
				} else {
					local450 = arg0.aClass31Array2[this.anIntArray343[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620);
				this.anIntArray345[local148] = Static180.method2927(local483);
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray348[local148]] == null) {
					local450 = arg0.aClass31Array1[this.anIntArray348[local148]];
				} else {
					local450 = arg0.aClass31Array2[this.anIntArray348[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620);
				this.anIntArray346[local148] = Static180.method2927(local483);
				if (arg0.aClass31Array2 == null || arg0.aClass31Array2[this.anIntArray339[local148]] == null) {
					local450 = arg0.aClass31Array1[this.anIntArray339[local148]];
				} else {
					local450 = arg0.aClass31Array2[this.anIntArray339[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt621 + arg4 * local450.anInt619 + arg5 * local450.anInt625) / (local123 * local450.anInt620);
				this.anIntArray342[local148] = Static180.method2927(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass122Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt3342 + arg4 * local629.anInt3339 + arg5 * local629.anInt3343) / (local123 + local123 / 2);
				this.anIntArray345[local148] = Static180.method2927(local483);
				this.anIntArray342[local148] = -1;
			} else {
				this.anIntArray342[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([Lclient!na;I)V")
	private Class53_Sub4_Sub1(@OriginalArg(0) Class53_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt3440 = 0;
		this.anInt3439 = 0;
		this.anInt3437 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte12 = -1;
		@Pc(48) int local48;
		@Pc(55) Class53_Sub4_Sub1 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt3440 += local55.anInt3440;
				this.anInt3439 += local55.anInt3439;
				this.anInt3437 += local55.anInt3437;
				if (local55.aByteArray41 == null) {
					if (this.aByte12 == -1) {
						this.aByte12 = local55.aByte12;
					}
					if (this.aByte12 != local55.aByte12) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray42 != null;
				local28 |= local55.aShortArray61 != null;
				local30 |= local55.aByteArray43 != null;
				if (local55.aClass161Array2 != null) {
					local41 += local55.aClass161Array2.length;
				}
				if (local55.aClass170Array2 != null) {
					local43 += local55.aClass170Array2.length;
				}
			}
		}
		this.anIntArray347 = new int[this.anInt3440];
		this.anIntArray344 = new int[this.anInt3440];
		this.anIntArray340 = new int[this.anInt3440];
		this.anIntArray343 = new int[this.anInt3439];
		this.anIntArray348 = new int[this.anInt3439];
		this.anIntArray339 = new int[this.anInt3439];
		this.anIntArray345 = new int[this.anInt3439];
		this.anIntArray346 = new int[this.anInt3439];
		this.anIntArray342 = new int[this.anInt3439];
		if (local24) {
			this.aByteArray41 = new byte[this.anInt3439];
		}
		if (local26) {
			this.aByteArray42 = new byte[this.anInt3439];
		}
		if (local28) {
			this.aShortArray61 = new short[this.anInt3439];
		}
		if (local30) {
			this.aByteArray43 = new byte[this.anInt3439];
		}
		if (this.anInt3437 > 0) {
			this.anIntArray351 = new int[this.anInt3437];
			this.anIntArray353 = new int[this.anInt3437];
			this.anIntArray341 = new int[this.anInt3437];
		}
		if (local41 > 0) {
			this.aClass161Array2 = new Class161[local41];
		}
		if (local43 > 0) {
			this.aClass170Array2 = new Class170[local43];
		}
		this.aShortArray63 = new short[this.anInt3439];
		this.anInt3440 = 0;
		this.anInt3439 = 0;
		this.anInt3437 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt3439; local280++) {
					this.anIntArray343[this.anInt3439] = local55.anIntArray343[local280] + this.anInt3440;
					this.anIntArray348[this.anInt3439] = local55.anIntArray348[local280] + this.anInt3440;
					this.anIntArray339[this.anInt3439] = local55.anIntArray339[local280] + this.anInt3440;
					this.anIntArray345[this.anInt3439] = local55.anIntArray345[local280];
					this.anIntArray346[this.anInt3439] = local55.anIntArray346[local280];
					this.anIntArray342[this.anInt3439] = local55.anIntArray342[local280];
					this.aShortArray63[this.anInt3439] = local55.aShortArray63[local280];
					if (local24) {
						if (local55.aByteArray41 == null) {
							this.aByteArray41[this.anInt3439] = local55.aByte12;
						} else {
							this.aByteArray41[this.anInt3439] = local55.aByteArray41[local280];
						}
					}
					if (local26 && local55.aByteArray42 != null) {
						this.aByteArray42[this.anInt3439] = local55.aByteArray42[local280];
					}
					if (local28) {
						if (local55.aShortArray61 == null) {
							this.aShortArray61[this.anInt3439] = -1;
						} else {
							this.aShortArray61[this.anInt3439] = local55.aShortArray61[local280];
						}
					}
					if (local30) {
						this.aByteArray43[this.anInt3439] = (byte) (local55.aByteArray43 == null || local55.aByteArray43[local280] == -1 ? -1 : local55.aByteArray43[local280] + this.anInt3437);
					}
					this.anInt3439++;
				}
				if (local55.aClass161Array2 != null) {
					for (local280 = 0; local280 < local55.aClass161Array2.length; local280++) {
						this.aClass161Array2[local41] = new Class161(local55.aClass161Array2[local280].aClass90_2, local55.aClass161Array2[local280].anInt4870 + this.anInt3440, local55.aClass161Array2[local280].anInt4869 + this.anInt3440, local55.aClass161Array2[local280].anInt4865 + this.anInt3440);
						local41++;
					}
				}
				if (local55.aClass170Array2 != null) {
					for (local280 = 0; local280 < local55.aClass170Array2.length; local280++) {
						this.aClass170Array2[local43] = new Class170(local55.aClass170Array2[local280].aClass37_1, local55.aClass170Array2[local280].anInt5233 + this.anInt3440);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt3437; local280++) {
					if (local55.anIntArray351[local280] < local55.anInt3438) {
						this.anIntArray351[this.anInt3437] = local55.anIntArray351[local280] + this.anInt3440;
					}
					if (local55.anIntArray353[local280] < local55.anInt3438) {
						this.anIntArray353[this.anInt3437] = local55.anIntArray353[local280] + this.anInt3440;
					}
					if (local55.anIntArray341[local280] < local55.anInt3438) {
						this.anIntArray341[this.anInt3437] = local55.anIntArray341[local280] + this.anInt3440;
					}
					this.anInt3437++;
				}
				for (local280 = 0; local280 < local55.anInt3438; local280++) {
					this.anIntArray347[this.anInt3440] = local55.anIntArray347[local280];
					this.anIntArray344[this.anInt3440] = local55.anIntArray344[local280];
					this.anIntArray340[this.anInt3440] = local55.anIntArray340[local280];
					this.anInt3440++;
				}
			}
		}
		local48 = 0;
		this.anInt3438 = this.anInt3440;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class53_Sub4_Sub1 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt3437; local662++) {
					if (local658.anIntArray351[local662] >= local658.anInt3438) {
						this.anIntArray351[local48] = local658.anIntArray351[local662] + this.anInt3440 - local658.anInt3438;
					}
					if (local658.anIntArray353[local662] >= local658.anInt3438) {
						this.anIntArray353[local48] = local658.anIntArray353[local662] + this.anInt3440 - local658.anInt3438;
					}
					if (local658.anIntArray341[local662] >= local658.anInt3438) {
						this.anIntArray341[local48] = local658.anIntArray341[local662] + this.anInt3440 - local658.anInt3438;
					}
					local48++;
				}
				for (local662 = local658.anInt3438; local662 < local658.anInt3440; local662++) {
					this.anIntArray347[this.anInt3440] = local658.anIntArray347[local662];
					this.anIntArray344[this.anInt3440] = local658.anIntArray344[local662];
					this.anIntArray340[this.anInt3440] = local658.anIntArray340[local662];
					this.anInt3440++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "()V")
	@Override
	public void method3865() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			this.anIntArray347[local1] = -this.anIntArray347[local1];
			this.anIntArray340[local1] = -this.anIntArray340[local1];
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "m", descriptor = "()I")
	@Override
	public int method3879() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort39;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3868(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static180.aByteArray44.length < this.anInt3439) {
			Static180.aByteArray44 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static180.aShortArray65.length < this.anInt3439) {
			Static180.anIntArray350 = new int[this.anInt3439 + 100];
			Static180.anIntArray349 = new int[this.anInt3439 + 100];
			Static180.anIntArray352 = new int[this.anInt3439 + 100];
			Static180.aShortArray65 = new short[this.anInt3439 + 100];
		}
		return this.method2921(arg0, arg1, Static180.aClass53_Sub4_Sub1_1, Static180.aByteArray44, Static180.aShortArray65, Static180.anIntArray350, Static180.anIntArray349, Static180.anIntArray352);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!na", name = "k", descriptor = "()I")
	@Override
	public int method3875() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort36;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZJIILclient!ne;)V")
	private void method2915(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20_Sub3 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static180.aBoolean246) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray374[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray363[local11] = 0;
			}
			Static180.anInt3441 = 0;
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
		for (local11 = 0; local11 < this.anInt3439; local11++) {
			if (this.anIntArray342[local11] != -2) {
				local51 = this.anIntArray343[local11];
				local56 = this.anIntArray348[local11];
				local61 = this.anIntArray339[local11];
				local65 = Static180.anIntArray379[local51];
				local69 = Static180.anIntArray379[local56];
				local73 = Static180.anIntArray379[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static180.anIntArray370[local51];
					local92 = Static180.anIntArray370[local56];
					local96 = Static180.anIntArray370[local61];
					local100 = Static180.anIntArray367[local51];
					local104 = Static180.anIntArray367[local56];
					local108 = Static180.anIntArray367[local61];
					local112 = Static180.anIntArray372[local51];
					@Pc(116) int local116 = Static180.anIntArray372[local56];
					local120 = Static180.anIntArray372[local61];
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
						Static180.aBooleanArray17[local11] = true;
						if (Static180.aBoolean246) {
							anIntArray369[local5] = (Static180.anIntArray376[local51] + Static180.anIntArray376[local56] + Static180.anIntArray376[local61]) / 3;
							anIntArray360[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static180.anIntArray376[local51] + Static180.anIntArray376[local56] + Static180.anIntArray376[local61]) / 3 + arg3;
							if (anIntArray374[local224] < 64) {
								anIntArrayArray32[local224][anIntArray374[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray374[local224];
								if (local247 == 64) {
									if (Static180.anInt3441 == 512) {
										continue;
									}
									anIntArray374[local224] = local247 = Static180.anInt3441++ + 65;
								}
								local247 -= 65;
								anIntArrayArray31[local247][anIntArray363[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method2914(Static281.anInt5334 + Static158.anInt3125, Static2.anInt3 + Static158.anInt3126, Static180.anIntArray361[local51], Static180.anIntArray361[local56], Static180.anIntArray361[local61], local65, local69, local73)) {
						Static198.aLongArray57[Static300.anInt5627++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static180.anIntArray361[local61] - Static180.anIntArray361[local56]) - (Static180.anIntArray361[local51] - Static180.anIntArray361[local56]) * (local73 - local69) > 0) {
						Static180.aBooleanArray17[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static158.anInt3129 && local69 <= Static158.anInt3129 && local73 <= Static158.anInt3129) {
							Static180.aBooleanArray16[local11] = false;
						} else {
							Static180.aBooleanArray16[local11] = true;
						}
						if (Static180.aBoolean246) {
							anIntArray369[local5] = (Static180.anIntArray376[local51] + Static180.anIntArray376[local56] + Static180.anIntArray376[local61]) / 3;
							anIntArray360[local5++] = local11;
						} else {
							local88 = (Static180.anIntArray376[local51] + Static180.anIntArray376[local56] + Static180.anIntArray376[local61]) / 3 + arg3;
							if (anIntArray374[local88] < 64) {
								anIntArrayArray32[local88][anIntArray374[local88]++] = local11;
							} else {
								local92 = anIntArray374[local88];
								if (local92 == 64) {
									if (Static180.anInt3441 == 512) {
										continue;
									}
									anIntArray374[local88] = local92 = Static180.anInt3441++ + 65;
								}
								local92 -= 65;
								anIntArrayArray31[local92][anIntArray363[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static180.aBoolean246) {
			for (local11 = 0; local11 < Static180.anIntArray368.length; local11++) {
				local51 = Static180.anIntArray368[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray374[local51] < 64) {
						anIntArrayArray32[local51][anIntArray374[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray374[local51];
						if (local56 == 64) {
							if (Static180.anInt3441 == 512) {
								continue;
							}
							anIntArray374[local51] = local56 = Static180.anInt3441++ + 65;
						}
						local56 -= 65;
						anIntArrayArray31[local56][anIntArray363[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static180.aBoolean246) {
			Static154.method2466(local5 - 1, anIntArray360, anIntArray369, 0);
			if (this.aByteArray41 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method2917(anIntArray360[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static180.anIntArray366[local11] = 0;
				Static180.anIntArray358[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray360[local11];
				local56 = anIntArray369[local11];
				@Pc(610) byte local610 = this.aByteArray41[local51];
				local65 = Static180.anIntArray366[local610]++;
				Static180.anIntArrayArray33[local610][local65] = local51;
				if (local610 < 10) {
					Static180.anIntArray358[local610] += local56;
				} else if (local610 == 10) {
					Static180.anIntArray371[local65] = local56;
				} else {
					Static180.anIntArray378[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray41 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray374[local11];
					@Pc(706) Class20_Sub2_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray32[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method2917(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass20_Sub2_Sub1Array2[local73];
								local92 = Static180.anIntArray375[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static270.method4243(Static180.anIntArray362[local73], Static180.anIntArray357[local73], (local706.aClass20_Sub1_1.aClass90_1.anInt2399 << 16) / local92, local706.anInt3231, local706.anInt3231 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray374[local11] - 64 - 1;
						local677 = anIntArrayArray31[local56];
						for (local65 = 0; local65 < anIntArray363[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method2917(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass20_Sub2_Sub1Array2[local73];
								local92 = Static180.anIntArray375[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static270.method4243(Static180.anIntArray362[local73], Static180.anIntArray357[local73], (local706.aClass20_Sub1_1.aClass90_1.anInt2399 << 16) / local92, local706.anInt3231, local706.anInt3231 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static180.anIntArray366[local11] = 0;
				Static180.anIntArray358[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray374[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray32[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray41[local69];
							local88 = Static180.anIntArray366[local881]++;
							Static180.anIntArrayArray33[local881][local88] = local69;
							if (local881 < 10) {
								Static180.anIntArray358[local881] += local11;
							} else if (local881 == 10) {
								Static180.anIntArray371[local88] = local11;
							} else {
								Static180.anIntArray378[local88] = local11;
							}
						} else {
							Static180.anIntArray365[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray374[local11] - 64 - 1;
					local677 = anIntArrayArray31[local56];
					for (local65 = 0; local65 < anIntArray363[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray41[local69];
							local88 = Static180.anIntArray366[local881]++;
							Static180.anIntArrayArray33[local881][local88] = local69;
							if (local881 < 10) {
								Static180.anIntArray358[local881] += local11;
							} else if (local881 == 10) {
								Static180.anIntArray371[local88] = local11;
							} else {
								Static180.anIntArray378[local88] = local11;
							}
						} else {
							Static180.anIntArray365[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static180.anIntArray366[1] > 0 || Static180.anIntArray366[2] > 0) {
			local11 = (Static180.anIntArray358[1] + Static180.anIntArray358[2]) / (Static180.anIntArray366[1] + Static180.anIntArray366[2]);
		}
		local51 = 0;
		if (Static180.anIntArray366[3] > 0 || Static180.anIntArray366[4] > 0) {
			local51 = (Static180.anIntArray358[3] + Static180.anIntArray358[4]) / (Static180.anIntArray366[3] + Static180.anIntArray366[4]);
		}
		local56 = 0;
		if (Static180.anIntArray366[6] > 0 || Static180.anIntArray366[8] > 0) {
			local56 = (Static180.anIntArray358[6] + Static180.anIntArray358[8]) / (Static180.anIntArray366[6] + Static180.anIntArray366[8]);
		}
		local65 = 0;
		local69 = Static180.anIntArray366[10];
		@Pc(1105) int[] local1105 = Static180.anIntArrayArray33[10];
		@Pc(1107) int[] local1107 = Static180.anIntArray371;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static180.anIntArray366[11];
			local1105 = Static180.anIntArrayArray33[11];
			local1107 = Static180.anIntArray378;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method2917(local1105[local65++]);
				if (local65 == local69 && local1105 != Static180.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static180.anIntArray366[11];
					local1105 = Static180.anIntArrayArray33[11];
					local1107 = Static180.anIntArray378;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method2917(local1105[local65++]);
				if (local65 == local69 && local1105 != Static180.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static180.anIntArray366[11];
					local1105 = Static180.anIntArrayArray33[11];
					local1107 = Static180.anIntArray378;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method2917(local1105[local65++]);
				if (local65 == local69 && local1105 != Static180.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static180.anIntArray366[11];
					local1105 = Static180.anIntArrayArray33[11];
					local1107 = Static180.anIntArray378;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static180.anIntArray366[local96];
			@Pc(1275) int[] local1275 = Static180.anIntArrayArray33[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static180.anIntArray358[local96] / local100;
				}
				for (local112 = Static180.anIntArray365[local92]; Static180.anIntArray368[local112] + arg3 > local108; local112 = Static180.anIntArray365[local92++]) {
					@Pc(1303) Class20_Sub2_Sub1 local1303 = arg5.aClass20_Sub2_Sub1Array2[local112];
					local120 = Static180.anIntArray375[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static270.method4243(Static180.anIntArray362[local112], Static180.anIntArray357[local112], (local1303.aClass20_Sub1_1.aClass90_1.anInt2399 << 16) / local120, local1303.anInt3231, local1303.anInt3231 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method2917(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method2917(local1105[local65++]);
			if (local65 == local69 && local1105 != Static180.anIntArrayArray33[11]) {
				local65 = 0;
				local1105 = Static180.anIntArrayArray33[11];
				local69 = Static180.anIntArray366[11];
				local1107 = Static180.anIntArray378;
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
		local96 = Static180.anIntArray365[local92];
		while (local92 < local7) {
			@Pc(1413) Class20_Sub2_Sub1 local1413 = arg5.aClass20_Sub2_Sub1Array2[local96];
			local104 = Static180.anIntArray375[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static270.method4243(Static180.anIntArray362[local96], Static180.anIntArray357[local96], (local1413.aClass20_Sub1_1.aClass90_1.anInt2399 << 16) / local104, local1413.anInt3231, local1413.anInt3231 >> 24 & 0xFF);
			local96 = Static180.anIntArray365[local92++];
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	@Override
	public void method3852(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray340[local9] * local3 + this.anIntArray347[local9] * local7 >> 16;
			this.anIntArray340[local9] = this.anIntArray340[local9] * local7 - this.anIntArray347[local9] * local3 >> 16;
			this.anIntArray347[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
	@Override
	public void method3857() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			@Pc(10) int local10 = this.anIntArray347[local1];
			this.anIntArray347[local1] = this.anIntArray340[local1];
			this.anIntArray340[local1] = -local10;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	@Override
	public void method3869(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray344[local9] * local7 - this.anIntArray340[local9] * local3 >> 16;
			this.anIntArray340[local9] = this.anIntArray344[local9] * local3 + this.anIntArray340[local9] * local7 >> 16;
			this.anIntArray344[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "()I")
	@Override
	public int method3866() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort40;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!vg;)Lclient!vg;")
	public Class53_Sub4 method2916(@OriginalArg(0) Class53_Sub4 arg0) {
		return new Class53_Sub4_Sub1(new Class53_Sub4_Sub1[] { this, (Class53_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (!this.aBoolean244) {
			this.method2922();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort37 * arg2 + this.aShort39 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort37 * arg2 + this.aShort42 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method2972();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt3510 - arg10.anInt3520) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method2983(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort37 << 9;
		if (local70 / local38 <= Static291.anInt5438) {
			return;
		}
		local87 = local58 - this.aShort37 << 9;
		if (local87 / local38 >= Static157.anInt3123) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort37 * arg1 + this.aShort39 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static311.anInt6034) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort37 * arg1 + this.aShort42 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static27.anInt403) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt3437 > 0;
		@Pc(223) int local223 = Static158.anInt3125;
		@Pc(225) int local225 = Static158.anInt3126;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class111.anIntArray299[arg0];
			local229 = Class111.anIntArray298[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static5.aBoolean8 && local53 > 0) {
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
			if (Static281.anInt5334 >= local255 && Static281.anInt5334 <= local259 && Static2.anInt3 >= local274 && Static2.anInt3 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort40, this.aShort36, this.aShort40, this.aShort36, this.aShort40, this.aShort36, this.aShort40, this.aShort36 };
				@Pc(393) int[] local393 = new int[] { this.aShort35, this.aShort35, this.aShort38, this.aShort38, this.aShort35, this.aShort35, this.aShort38, this.aShort38 };
				@Pc(436) int[] local436 = new int[] { this.aShort42, this.aShort42, this.aShort42, this.aShort42, this.aShort39, this.aShort39, this.aShort39, this.aShort39 };
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
				if (Static281.anInt5334 >= local255 && Static281.anInt5334 <= local259 && Static2.anInt3 >= local274 && Static2.anInt3 <= local278) {
					if (this.aBoolean325) {
						Static198.aLongArray57[Static300.anInt5627++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt3440; local255++) {
			local274 = this.anIntArray347[local255];
			local259 = this.anIntArray344[local255];
			local278 = this.anIntArray340[local255];
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
			Static180.anIntArray376[local255] = local278 - local24;
			if (local278 >= 50) {
				Static180.anIntArray379[local255] = local223 + (local274 << 9) / local278;
				Static180.anIntArray361[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static180.anIntArray379[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static180.anIntArray370[local255] = local274;
				Static180.anIntArray367[local255] = local628;
				Static180.anIntArray372[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static184.anInt3506 + local223;
			local274 = Static184.anInt3503 + local225;
			for (local259 = 0; local259 < arg10.aClass20_Sub2_Sub1Array2.length; local259++) {
				@Pc(770) Class20_Sub2_Sub1 local770 = arg10.aClass20_Sub2_Sub1Array2[local259];
				if (local770 == null || local770.aBoolean228) {
					Static180.anIntArray368[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt3228 >> 12) - Static277.anInt5282;
					@Pc(789) int local789 = (local770.anInt3229 >> 12) - Static228.anInt4376;
					@Pc(796) int local796 = (local770.anInt3230 >> 12) - Static230.anInt4401;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static180.anIntArray362[local259] = local255 + (local628 << 9) / local838;
						Static180.anIntArray357[local259] = local274 + (local438 << 9) / local838;
						Static180.anIntArray375[local259] = local838;
						Static180.anIntArray368[local259] = local838 - local24;
					} else {
						Static180.anIntArray368[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method2915(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	@Override
	public void method3854(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3440; local9++) {
			@Pc(29) int local29 = this.anIntArray344[local9] * local3 + this.anIntArray347[local9] * local7 >> 16;
			this.anIntArray344[local9] = this.anIntArray344[local9] * local7 - this.anIntArray347[local9] * local3 >> 16;
			this.anIntArray347[local9] = local29;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "()Z")
	@Override
	protected boolean method3867() {
		if (this.anIntArrayArray29 == null) {
			return false;
		} else {
			Static180.anInt3443 = 0;
			Static180.anInt3444 = 0;
			Static180.anInt3442 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "()V")
	@Override
	public void method3864() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			@Pc(10) int local10 = this.anIntArray340[local1];
			this.anIntArray340[local1] = this.anIntArray347[local1];
			this.anIntArray347[local1] = -local10;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	@Override
	public void method3860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			this.anIntArray347[local1] += arg0;
			this.anIntArray344[local1] += arg1;
			this.anIntArray340[local1] += arg2;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	private void method2917(@OriginalArg(0) int arg0) {
		if (Static180.aBooleanArray17[arg0]) {
			this.method2920(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray343[arg0];
		@Pc(17) int local17 = this.anIntArray348[arg0];
		@Pc(22) int local22 = this.anIntArray339[arg0];
		Static158.aBoolean217 = Static180.aBooleanArray16[arg0];
		if (this.aByteArray42 == null) {
			Static158.anInt3127 = 0;
		} else {
			Static158.anInt3127 = this.aByteArray42[arg0] & 0xFF;
		}
		if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray43[arg0] & 0xFF;
				local141 = this.anIntArray351[local136];
				local146 = this.anIntArray353[local136];
				local151 = this.anIntArray341[local136];
			}
			if (this.anIntArray342[arg0] == -1) {
				Static158.method2562(Static180.anIntArray361[local12], Static180.anIntArray361[local17], Static180.anIntArray361[local22], Static180.anIntArray379[local12], Static180.anIntArray379[local17], Static180.anIntArray379[local22], this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static180.anIntArray370[local141], Static180.anIntArray370[local146], Static180.anIntArray370[local151], Static180.anIntArray367[local141], Static180.anIntArray367[local146], Static180.anIntArray367[local151], Static180.anIntArray372[local141], Static180.anIntArray372[local146], Static180.anIntArray372[local151], this.aShortArray61[arg0]);
			} else {
				Static158.method2562(Static180.anIntArray361[local12], Static180.anIntArray361[local17], Static180.anIntArray361[local22], Static180.anIntArray379[local12], Static180.anIntArray379[local17], Static180.anIntArray379[local22], this.anIntArray345[arg0], this.anIntArray346[arg0], this.anIntArray342[arg0], Static180.anIntArray370[local141], Static180.anIntArray370[local146], Static180.anIntArray370[local151], Static180.anIntArray367[local141], Static180.anIntArray367[local146], Static180.anIntArray367[local151], Static180.anIntArray372[local141], Static180.anIntArray372[local146], Static180.anIntArray372[local151], this.aShortArray61[arg0]);
			}
		} else if (this.anIntArray342[arg0] == -1) {
			Static158.method2563(Static180.anIntArray361[local12], Static180.anIntArray361[local17], Static180.anIntArray361[local22], Static180.anIntArray379[local12], Static180.anIntArray379[local17], Static180.anIntArray379[local22], Static158.anIntArray295[this.anIntArray345[arg0] & 0xFFFF]);
		} else {
			Static158.method2556(Static180.anIntArray361[local12], Static180.anIntArray361[local17], Static180.anIntArray361[local22], Static180.anIntArray379[local12], Static180.anIntArray379[local17], Static180.anIntArray379[local22], this.anIntArray345[arg0] & 0xFFFF, this.anIntArray346[arg0] & 0xFFFF, this.anIntArray342[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()I")
	@Override
	public int method3863() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()I")
	@Override
	public int method3855() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean244) {
				this.method2922();
			}
			@Pc(6) int local6 = Static158.anInt3125;
			@Pc(8) int local8 = Static158.anInt3126;
			@Pc(12) int local12 = Class111.anIntArray299[0];
			@Pc(16) int local16 = Class111.anIntArray298[0];
			@Pc(20) int local20 = Class111.anIntArray299[arg0];
			@Pc(24) int local24 = Class111.anIntArray298[arg0];
			@Pc(28) int local28 = Class111.anIntArray299[arg1];
			@Pc(32) int local32 = Class111.anIntArray298[arg1];
			@Pc(36) int local36 = Class111.anIntArray299[arg2];
			@Pc(40) int local40 = Class111.anIntArray298[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3440; local52++) {
				@Pc(61) int local61 = this.anIntArray347[local52];
				@Pc(66) int local66 = this.anIntArray344[local52];
				@Pc(71) int local71 = this.anIntArray340[local52];
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
				Static180.anIntArray376[local52] = local71 - local50;
				Static180.anIntArray379[local52] = local6 + (local61 << 9) / local71;
				Static180.anIntArray361[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt3437 > 0) {
					Static180.anIntArray370[local52] = local61;
					Static180.anIntArray367[local52] = local83;
					Static180.anIntArray372[local52] = local71;
				}
			}
			this.method2915(false, arg6 >= 0L, arg6, this.aShort41, this.aShort41 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3870(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static180.aByteArray46.length < this.anInt3439) {
			Static180.aByteArray46 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static180.aShortArray67.length < this.anInt3439) {
			Static180.anIntArray373 = new int[this.anInt3439 + 100];
			Static180.anIntArray364 = new int[this.anInt3439 + 100];
			Static180.anIntArray359 = new int[this.anInt3439 + 100];
			Static180.aShortArray67 = new short[this.anInt3439 + 100];
		}
		return this.method2921(arg0, arg1, Static180.aClass53_Sub4_Sub1_3, Static180.aByteArray46, Static180.aShortArray67, Static180.anIntArray373, Static180.anIntArray364, Static180.anIntArray359);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	@Override
	protected void method3856() {
		if (this.aBoolean245) {
			this.method2926();
			this.aBoolean245 = false;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3873(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static180.aByteArray45.length < this.anInt3439) {
			Static180.aByteArray45 = new byte[this.anInt3439 + 100];
		}
		if (!arg1 && Static180.aShortArray66.length < this.anInt3439) {
			Static180.anIntArray355 = new int[this.anInt3439 + 100];
			Static180.anIntArray356 = new int[this.anInt3439 + 100];
			Static180.anIntArray354 = new int[this.anInt3439 + 100];
			Static180.aShortArray66 = new short[this.anInt3439 + 100];
		}
		return this.method2921(arg0, arg1, Static180.aClass53_Sub4_Sub1_2, Static180.aByteArray45, Static180.aShortArray66, Static180.anIntArray355, Static180.anIntArray356, Static180.anIntArray354);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	private void method2920(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static158.anInt3125;
		@Pc(3) int local3 = Static158.anInt3126;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray343[arg0];
		@Pc(15) int local15 = this.anIntArray348[arg0];
		@Pc(20) int local20 = this.anIntArray339[arg0];
		@Pc(24) int local24 = Static180.anIntArray372[local10];
		@Pc(28) int local28 = Static180.anIntArray372[local15];
		@Pc(32) int local32 = Static180.anIntArray372[local20];
		if (this.aByteArray42 == null) {
			Static158.anInt3127 = 0;
		} else {
			Static158.anInt3127 = this.aByteArray42[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static180.anIntArray381[0] = Static180.anIntArray379[local10];
			Static180.anIntArray377[0] = Static180.anIntArray361[local10];
			local5++;
			Static180.anIntArray380[0] = this.anIntArray345[arg0] & 0xFFFF;
		} else {
			local75 = Static180.anIntArray370[local10];
			local79 = Static180.anIntArray367[local10];
			local86 = this.anIntArray345[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class111.anIntArray300[local32 - local24];
				Static180.anIntArray381[0] = local1 + (local75 + ((Static180.anIntArray370[local20] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[0] = local3 + (local79 + ((Static180.anIntArray367[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static180.anIntArray380[0] = local86 + (((this.anIntArray342[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class111.anIntArray300[local28 - local24];
				Static180.anIntArray381[local5] = local1 + (local75 + ((Static180.anIntArray370[local15] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[local5] = local3 + (local79 + ((Static180.anIntArray367[local15] - local79) * local99 >> 16) << 9) / 50;
				Static180.anIntArray380[local5++] = local86 + (((this.anIntArray346[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static180.anIntArray381[local5] = Static180.anIntArray379[local15];
			Static180.anIntArray377[local5] = Static180.anIntArray361[local15];
			Static180.anIntArray380[local5++] = this.anIntArray346[arg0] & 0xFFFF;
		} else {
			local75 = Static180.anIntArray370[local15];
			local79 = Static180.anIntArray367[local15];
			local86 = this.anIntArray346[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class111.anIntArray300[local24 - local28];
				Static180.anIntArray381[local5] = local1 + (local75 + ((Static180.anIntArray370[local10] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[local5] = local3 + (local79 + ((Static180.anIntArray367[local10] - local79) * local99 >> 16) << 9) / 50;
				Static180.anIntArray380[local5++] = local86 + (((this.anIntArray345[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class111.anIntArray300[local32 - local28];
				Static180.anIntArray381[local5] = local1 + (local75 + ((Static180.anIntArray370[local20] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[local5] = local3 + (local79 + ((Static180.anIntArray367[local20] - local79) * local99 >> 16) << 9) / 50;
				Static180.anIntArray380[local5++] = local86 + (((this.anIntArray342[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static180.anIntArray381[local5] = Static180.anIntArray379[local20];
			Static180.anIntArray377[local5] = Static180.anIntArray361[local20];
			Static180.anIntArray380[local5++] = this.anIntArray342[arg0] & 0xFFFF;
		} else {
			local75 = Static180.anIntArray370[local20];
			local79 = Static180.anIntArray367[local20];
			local86 = this.anIntArray342[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class111.anIntArray300[local28 - local32];
				Static180.anIntArray381[local5] = local1 + (local75 + ((Static180.anIntArray370[local15] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[local5] = local3 + (local79 + ((Static180.anIntArray367[local15] - local79) * local99 >> 16) << 9) / 50;
				Static180.anIntArray380[local5++] = local86 + (((this.anIntArray346[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class111.anIntArray300[local24 - local32];
				Static180.anIntArray381[local5] = local1 + (local75 + ((Static180.anIntArray370[local10] - local75) * local99 >> 16) << 9) / 50;
				Static180.anIntArray377[local5] = local3 + (local79 + ((Static180.anIntArray367[local10] - local79) * local99 >> 16) << 9) / 50;
				Static180.anIntArray380[local5++] = local86 + (((this.anIntArray345[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static180.anIntArray381[0];
		local79 = Static180.anIntArray381[1];
		local86 = Static180.anIntArray381[2];
		local99 = Static180.anIntArray377[0];
		@Pc(614) int local614 = Static180.anIntArray377[1];
		@Pc(618) int local618 = Static180.anIntArray377[2];
		Static158.aBoolean217 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static158.anInt3129 || local79 > Static158.anInt3129 || local86 > Static158.anInt3129) {
				Static158.aBoolean217 = true;
			}
			if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
				if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray43[arg0] & 0xFF;
					local709 = this.anIntArray351[local704];
					local714 = this.anIntArray353[local704];
					local719 = this.anIntArray341[local704];
				}
				if (this.anIntArray342[arg0] == -1) {
					Static158.method2562(local99, local614, local618, local75, local79, local86, this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], this.aShortArray61[arg0]);
				} else {
					Static158.method2562(local99, local614, local618, local75, local79, local86, Static180.anIntArray380[0], Static180.anIntArray380[1], Static180.anIntArray380[2], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], this.aShortArray61[arg0]);
				}
			} else if (this.anIntArray342[arg0] == -1) {
				Static158.method2563(local99, local614, local618, local75, local79, local86, Static158.anIntArray295[this.anIntArray345[arg0] & 0xFFFF]);
			} else {
				Static158.method2556(local99, local614, local618, local75, local79, local86, Static180.anIntArray380[0], Static180.anIntArray380[1], Static180.anIntArray380[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static158.anInt3129 || local79 > Static158.anInt3129 || local86 > Static158.anInt3129 || Static180.anIntArray381[3] < 0 || Static180.anIntArray381[3] > Static158.anInt3129) {
			Static158.aBoolean217 = true;
		}
		if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray43[arg0] & 0xFF;
				local709 = this.anIntArray351[local704];
				local714 = this.anIntArray353[local704];
				local719 = this.anIntArray341[local704];
			}
			@Pc(984) short local984 = this.aShortArray61[arg0];
			if (this.anIntArray342[arg0] == -1) {
				Static158.method2562(local99, local614, local618, local75, local79, local86, this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], local984);
				Static158.method2562(local99, local618, Static180.anIntArray377[3], local75, local86, Static180.anIntArray381[3], this.anIntArray345[arg0], this.anIntArray345[arg0], this.anIntArray345[arg0], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], local984);
			} else {
				Static158.method2562(local99, local614, local618, local75, local79, local86, Static180.anIntArray380[0], Static180.anIntArray380[1], Static180.anIntArray380[2], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], local984);
				Static158.method2562(local99, local618, Static180.anIntArray377[3], local75, local86, Static180.anIntArray381[3], Static180.anIntArray380[0], Static180.anIntArray380[2], Static180.anIntArray380[3], Static180.anIntArray370[local709], Static180.anIntArray370[local714], Static180.anIntArray370[local719], Static180.anIntArray367[local709], Static180.anIntArray367[local714], Static180.anIntArray367[local719], Static180.anIntArray372[local709], Static180.anIntArray372[local714], Static180.anIntArray372[local719], local984);
			}
		} else if (this.anIntArray342[arg0] == -1) {
			local709 = Static158.anIntArray295[this.anIntArray345[arg0] & 0xFFFF];
			Static158.method2563(local99, local614, local618, local75, local79, local86, local709);
			Static158.method2563(local99, local618, Static180.anIntArray377[3], local75, local86, Static180.anIntArray381[3], local709);
		} else {
			Static158.method2556(local99, local614, local618, local75, local79, local86, Static180.anIntArray380[0], Static180.anIntArray380[1], Static180.anIntArray380[2]);
			Static158.method2556(local99, local618, Static180.anIntArray377[3], local75, local86, Static180.anIntArray381[3], Static180.anIntArray380[0], Static180.anIntArray380[2], Static180.anIntArray380[3]);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZLclient!na;[B[S[I[I[I)Lclient!vg;")
	private Class53_Sub4 method2921(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class53_Sub4_Sub1 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt3440 = this.anInt3440;
		arg2.anInt3438 = this.anInt3438;
		arg2.anInt3439 = this.anInt3439;
		arg2.anInt3437 = this.anInt3437;
		if (arg2.anIntArray347 == null || arg2.anIntArray347.length < this.anInt3440) {
			arg2.anIntArray347 = new int[this.anInt3440 + 100];
			arg2.anIntArray344 = new int[this.anInt3440 + 100];
			arg2.anIntArray340 = new int[this.anInt3440 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt3440; local47++) {
			arg2.anIntArray347[local47] = this.anIntArray347[local47];
			arg2.anIntArray344[local47] = this.anIntArray344[local47];
			arg2.anIntArray340[local47] = this.anIntArray340[local47];
		}
		if (arg0) {
			arg2.aByteArray42 = this.aByteArray42;
		} else {
			arg2.aByteArray42 = arg3;
			if (this.aByteArray42 == null) {
				for (local47 = 0; local47 < this.anInt3439; local47++) {
					arg2.aByteArray42[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt3439; local47++) {
					arg2.aByteArray42[local47] = this.aByteArray42[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray63 = this.aShortArray63;
			arg2.anIntArray345 = this.anIntArray345;
			arg2.anIntArray346 = this.anIntArray346;
			arg2.anIntArray342 = this.anIntArray342;
		} else {
			arg2.aShortArray63 = arg4;
			arg2.anIntArray345 = arg5;
			arg2.anIntArray346 = arg6;
			arg2.anIntArray342 = arg7;
			for (local47 = 0; local47 < this.anInt3439; local47++) {
				arg2.aShortArray63[local47] = this.aShortArray63[local47];
				arg2.anIntArray345[local47] = this.anIntArray345[local47];
				arg2.anIntArray346[local47] = this.anIntArray346[local47];
				arg2.anIntArray342[local47] = this.anIntArray342[local47];
			}
		}
		arg2.anIntArray343 = this.anIntArray343;
		arg2.anIntArray348 = this.anIntArray348;
		arg2.anIntArray339 = this.anIntArray339;
		arg2.aByteArray41 = this.aByteArray41;
		arg2.aByteArray43 = this.aByteArray43;
		arg2.aShortArray61 = this.aShortArray61;
		arg2.aByte12 = this.aByte12;
		arg2.anIntArray351 = this.anIntArray351;
		arg2.anIntArray353 = this.anIntArray353;
		arg2.anIntArray341 = this.anIntArray341;
		arg2.anIntArrayArray29 = this.anIntArrayArray29;
		arg2.anIntArrayArray30 = this.anIntArrayArray30;
		arg2.aShortArray64 = this.aShortArray64;
		arg2.aShortArray62 = this.aShortArray62;
		arg2.aBoolean325 = this.aBoolean325;
		arg2.aBoolean244 = false;
		arg2.aClass161Array2 = this.aClass161Array2;
		arg2.aClass170Array2 = this.aClass170Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "()V")
	private void method2922() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3438; local17++) {
			@Pc(26) int local26 = this.anIntArray347[local17];
			@Pc(31) int local31 = this.anIntArray344[local17];
			@Pc(36) int local36 = this.anIntArray340[local17];
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
		this.aShort40 = (short) local1;
		this.aShort36 = (short) local7;
		this.aShort42 = (short) local3;
		this.aShort39 = (short) local9;
		this.aShort35 = (short) local5;
		this.aShort38 = (short) local11;
		this.aShort37 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort41 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean244 = true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!na;")
	public Class53_Sub4_Sub1 method2923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean244) {
			this.method2922();
		}
		@Pc(9) int local9 = arg4 + this.aShort40;
		@Pc(14) int local14 = arg4 + this.aShort36;
		@Pc(19) int local19 = arg6 + this.aShort35;
		@Pc(24) int local24 = arg6 + this.aShort38;
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
		@Pc(150) Class53_Sub4_Sub1 local150;
		if (arg7) {
			local150 = new Class53_Sub4_Sub1();
			local150.anInt3440 = this.anInt3440;
			local150.anInt3438 = this.anInt3438;
			local150.anInt3439 = this.anInt3439;
			local150.anInt3437 = this.anInt3437;
			local150.anIntArray343 = this.anIntArray343;
			local150.anIntArray348 = this.anIntArray348;
			local150.anIntArray339 = this.anIntArray339;
			local150.anIntArray345 = this.anIntArray345;
			local150.anIntArray346 = this.anIntArray346;
			local150.anIntArray342 = this.anIntArray342;
			local150.aByteArray41 = this.aByteArray41;
			local150.aByteArray43 = this.aByteArray43;
			local150.aShortArray61 = this.aShortArray61;
			local150.aShortArray63 = this.aShortArray63;
			local150.aByteArray42 = this.aByteArray42;
			local150.aByte12 = this.aByte12;
			local150.anIntArray351 = this.anIntArray351;
			local150.anIntArray353 = this.anIntArray353;
			local150.anIntArray341 = this.anIntArray341;
			local150.anIntArrayArray29 = this.anIntArrayArray29;
			local150.anIntArrayArray30 = this.anIntArrayArray30;
			local150.aShortArray64 = this.aShortArray64;
			local150.aShortArray62 = this.aShortArray62;
			local150.aBoolean325 = this.aBoolean325;
			if (arg0 == 3) {
				local150.anIntArray347 = Static160.method2579(this.anIntArray347);
				local150.anIntArray344 = Static160.method2579(this.anIntArray344);
				local150.anIntArray340 = Static160.method2579(this.anIntArray340);
			} else {
				local150.anIntArray347 = this.anIntArray347;
				local150.anIntArray344 = new int[local150.anInt3440];
				local150.anIntArray340 = this.anIntArray340;
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
			for (local289 = 0; local289 < local150.anInt3438; local289++) {
				local300 = this.anIntArray347[local289] + arg4;
				local307 = this.anIntArray340[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray344[local289] = this.anIntArray344[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt3438; local289 < local150.anInt3440; local289++) {
				local300 = this.anIntArray347[local289] + arg4;
				local307 = this.anIntArray340[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray344[local289] = this.anIntArray344[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt3438; local289++) {
					local300 = (this.anIntArray344[local289] << 16) / this.aShort42;
					if (local300 < arg1) {
						local307 = this.anIntArray347[local289] + arg4;
						local311 = this.anIntArray340[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray344[local289] = this.anIntArray344[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray344[local289] = this.anIntArray344[local289];
					}
				}
				for (local289 = local150.anInt3438; local289 < local150.anInt3440; local289++) {
					local300 = (this.anIntArray344[local289] << 16) / this.aShort42;
					if (local300 < arg1) {
						local307 = this.anIntArray347[local289] + arg4;
						local311 = this.anIntArray340[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray344[local289] = this.anIntArray344[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray344[local289] = this.anIntArray344[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3877(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort39 - this.aShort42;
				for (local300 = 0; local300 < this.anInt3438; local300++) {
					local307 = this.anIntArray347[local300] + arg4;
					local311 = this.anIntArray340[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray344[local300] = this.anIntArray344[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt3438; local300 < local150.anInt3440; local300++) {
					local307 = this.anIntArray347[local300] + arg4;
					local311 = this.anIntArray340[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray344[local300] = this.anIntArray344[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort39 - this.aShort42;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt3438; local300++) {
					local307 = this.anIntArray347[local300] + arg4;
					local311 = this.anIntArray340[local300] + arg6;
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
					local150.anIntArray344[local300] = ((this.anIntArray344[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt3438; local300 < local150.anInt3440; local300++) {
					local307 = this.anIntArray347[local300] + arg4;
					local311 = this.anIntArray340[local300] + arg6;
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
						local150.anIntArray344[local300] = ((this.anIntArray344[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean244 = false;
		return local150;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3880(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static180.anInt3443 = 0;
			Static180.anInt3444 = 0;
			Static180.anInt3442 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray29.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray29[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static180.anInt3443 += this.anIntArray347[local41];
						Static180.anInt3444 += this.anIntArray344[local41];
						Static180.anInt3442 += this.anIntArray340[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static180.anInt3443 = Static180.anInt3443 / local6 + arg2;
				Static180.anInt3444 = Static180.anInt3444 / local6 + arg3;
				Static180.anInt3442 = Static180.anInt3442 / local6 + arg4;
			} else {
				Static180.anInt3443 = arg2;
				Static180.anInt3444 = arg3;
				Static180.anInt3442 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray29.length) {
					local117 = this.anIntArrayArray29[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray347[local33] += arg2;
						this.anIntArray344[local33] += arg3;
						this.anIntArray340[local33] += arg4;
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
				if (local14 < this.anIntArrayArray29.length) {
					local117 = this.anIntArrayArray29[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray347[local33] -= Static180.anInt3443;
						this.anIntArray344[local33] -= Static180.anInt3444;
						this.anIntArray340[local33] -= Static180.anInt3442;
						if (arg4 != 0) {
							local41 = Class111.anIntArray299[arg4];
							local222 = Class111.anIntArray298[arg4];
							local240 = this.anIntArray344[local33] * local41 + this.anIntArray347[local33] * local222 + 32767 >> 16;
							this.anIntArray344[local33] = this.anIntArray344[local33] * local222 + 32767 - this.anIntArray347[local33] * local41 >> 16;
							this.anIntArray347[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class111.anIntArray299[arg2];
							local222 = Class111.anIntArray298[arg2];
							local240 = this.anIntArray344[local33] * local222 + 32767 - this.anIntArray340[local33] * local41 >> 16;
							this.anIntArray340[local33] = this.anIntArray344[local33] * local41 + this.anIntArray340[local33] * local222 + 32767 >> 16;
							this.anIntArray344[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class111.anIntArray299[arg3];
							local222 = Class111.anIntArray298[arg3];
							local240 = this.anIntArray340[local33] * local41 + this.anIntArray347[local33] * local222 + 32767 >> 16;
							this.anIntArray340[local33] = this.anIntArray340[local33] * local222 + 32767 - this.anIntArray347[local33] * local41 >> 16;
							this.anIntArray347[local33] = local240;
						}
						this.anIntArray347[local33] += Static180.anInt3443;
						this.anIntArray344[local33] += Static180.anInt3444;
						this.anIntArray340[local33] += Static180.anInt3442;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray29.length) {
					local117 = this.anIntArrayArray29[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray347[local33] -= Static180.anInt3443;
						this.anIntArray344[local33] -= Static180.anInt3444;
						this.anIntArray340[local33] -= Static180.anInt3442;
						this.anIntArray347[local33] = this.anIntArray347[local33] * arg2 / 128;
						this.anIntArray344[local33] = this.anIntArray344[local33] * arg3 / 128;
						this.anIntArray340[local33] = this.anIntArray340[local33] * arg4 / 128;
						this.anIntArray347[local33] += Static180.anInt3443;
						this.anIntArray344[local33] += Static180.anInt3444;
						this.anIntArray340[local33] += Static180.anInt3442;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray42 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray30.length) {
						local117 = this.anIntArrayArray30[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray42[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray42[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray30.length) {
					local117 = this.anIntArrayArray30[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray63[local33] & 0xFFFF;
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
						this.aShortArray63[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean245 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort42;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
	@Override
	public void method3861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3440; local1++) {
			this.anIntArray347[local1] = this.anIntArray347[local1] * arg0 / 128;
			this.anIntArray344[local1] = this.anIntArray344[local1] * arg1 / 128;
			this.anIntArray340[local1] = this.anIntArray340[local1] * arg2 / 128;
		}
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)V")
	public void method2924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean244) {
				this.method2922();
			}
			@Pc(6) int local6 = Static158.anInt3125;
			@Pc(8) int local8 = Static158.anInt3126;
			@Pc(12) int local12 = Class111.anIntArray299[0];
			@Pc(16) int local16 = Class111.anIntArray298[0];
			@Pc(20) int local20 = Class111.anIntArray299[arg0];
			@Pc(24) int local24 = Class111.anIntArray298[arg0];
			@Pc(28) int local28 = Class111.anIntArray299[arg1];
			@Pc(32) int local32 = Class111.anIntArray298[arg1];
			@Pc(36) int local36 = Class111.anIntArray299[arg2];
			@Pc(40) int local40 = Class111.anIntArray298[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3440; local52++) {
				@Pc(61) int local61 = this.anIntArray347[local52];
				@Pc(66) int local66 = this.anIntArray344[local52];
				@Pc(71) int local71 = this.anIntArray340[local52];
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
				Static180.anIntArray376[local52] = local71 - local50;
				Static180.anIntArray379[local52] = local6 + (local61 << 9) / arg6;
				Static180.anIntArray361[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt3437 > 0) {
					Static180.anIntArray370[local52] = local61;
					Static180.anIntArray367[local52] = local83;
					Static180.anIntArray372[local52] = local71;
				}
			}
			this.method2915(false, false, 0L, this.aShort41, this.aShort41 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static180.anInt3443 = 0;
			Static180.anInt3444 = 0;
			Static180.anInt3442 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray29.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray29[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local41]) != 0) {
							Static180.anInt3443 += this.anIntArray347[local41];
							Static180.anInt3444 += this.anIntArray344[local41];
							Static180.anInt3442 += this.anIntArray340[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static180.anInt3443 = Static180.anInt3443 / local6 + arg2;
				Static180.anInt3444 = Static180.anInt3444 / local6 + arg3;
				Static180.anInt3442 = Static180.anInt3442 / local6 + arg4;
				Static180.aBoolean247 = true;
			} else {
				Static180.anInt3443 = arg2;
				Static180.anInt3444 = arg3;
				Static180.anInt3442 = arg4;
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
				if (local14 < this.anIntArrayArray29.length) {
					local204 = this.anIntArrayArray29[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local33]) != 0) {
							this.anIntArray347[local33] += arg2;
							this.anIntArray344[local33] += arg3;
							this.anIntArray340[local33] += arg4;
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
					if (local14 < this.anIntArrayArray29.length) {
						local204 = this.anIntArrayArray29[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local33]) != 0) {
								this.anIntArray347[local33] -= Static180.anInt3443;
								this.anIntArray344[local33] -= Static180.anInt3444;
								this.anIntArray340[local33] -= Static180.anInt3442;
								if (arg4 != 0) {
									local41 = Class111.anIntArray299[arg4];
									local307 = Class111.anIntArray298[arg4];
									local329 = this.anIntArray344[local33] * local41 + this.anIntArray347[local33] * local307 + 32767 >> 16;
									this.anIntArray344[local33] = this.anIntArray344[local33] * local307 + 32767 - this.anIntArray347[local33] * local41 >> 16;
									this.anIntArray347[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class111.anIntArray299[arg2];
									local307 = Class111.anIntArray298[arg2];
									local329 = this.anIntArray344[local33] * local307 + 32767 - this.anIntArray340[local33] * local41 >> 16;
									this.anIntArray340[local33] = this.anIntArray344[local33] * local41 + this.anIntArray340[local33] * local307 + 32767 >> 16;
									this.anIntArray344[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class111.anIntArray299[arg3];
									local307 = Class111.anIntArray298[arg3];
									local329 = this.anIntArray340[local33] * local41 + this.anIntArray347[local33] * local307 + 32767 >> 16;
									this.anIntArray340[local33] = this.anIntArray340[local33] * local307 + 32767 - this.anIntArray347[local33] * local41 >> 16;
									this.anIntArray347[local33] = local329;
								}
								this.anIntArray347[local33] += Static180.anInt3443;
								this.anIntArray344[local33] += Static180.anInt3444;
								this.anIntArray340[local33] += Static180.anInt3442;
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
				if (Static180.aBoolean247) {
					local307 = arg7[0] * Static180.anInt3443 + arg7[3] * Static180.anInt3444 + arg7[6] * Static180.anInt3442 + 16384 >> 15;
					local329 = arg7[1] * Static180.anInt3443 + arg7[4] * Static180.anInt3444 + arg7[7] * Static180.anInt3442 + 16384 >> 15;
					local351 = arg7[2] * Static180.anInt3443 + arg7[5] * Static180.anInt3444 + arg7[8] * Static180.anInt3442 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static180.anInt3443 = local307;
					Static180.anInt3444 = local329;
					Static180.anInt3442 = local351;
					Static180.aBoolean247 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class111.anIntArray298[arg2] >> 1;
				local351 = Class111.anIntArray299[arg2] >> 1;
				local392 = Class111.anIntArray298[arg3] >> 1;
				local398 = Class111.anIntArray299[arg3] >> 1;
				local404 = Class111.anIntArray298[arg4] >> 1;
				local410 = Class111.anIntArray299[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static180.anInt3443 + local374[1] * -Static180.anInt3444 + local374[2] * -Static180.anInt3442 + 16384 >> 15;
				local579 = local374[3] * -Static180.anInt3443 + local374[4] * -Static180.anInt3444 + local374[5] * -Static180.anInt3442 + 16384 >> 15;
				local604 = local374[6] * -Static180.anInt3443 + local374[7] * -Static180.anInt3444 + local374[8] * -Static180.anInt3442 + 16384 >> 15;
				local608 = local554 + Static180.anInt3443;
				@Pc(612) int local612 = local579 + Static180.anInt3444;
				local616 = local604 + Static180.anInt3442;
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
					if (local893 < this.anIntArrayArray29.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray29[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray347[local913] + local753[1] * this.anIntArray344[local913] + local753[2] * this.anIntArray340[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray347[local913] + local753[4] * this.anIntArray344[local913] + local753[5] * this.anIntArray340[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray347[local913] + local753[7] * this.anIntArray344[local913] + local753[8] * this.anIntArray340[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray347[local913] = local1021;
								this.anIntArray344[local913] = local1025;
								this.anIntArray340[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray29.length) {
						local204 = this.anIntArrayArray29[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local33]) != 0) {
								this.anIntArray347[local33] -= Static180.anInt3443;
								this.anIntArray344[local33] -= Static180.anInt3444;
								this.anIntArray340[local33] -= Static180.anInt3442;
								this.anIntArray347[local33] = this.anIntArray347[local33] * arg2 / 128;
								this.anIntArray344[local33] = this.anIntArray344[local33] * arg3 / 128;
								this.anIntArray340[local33] = this.anIntArray340[local33] * arg4 / 128;
								this.anIntArray347[local33] += Static180.anInt3443;
								this.anIntArray344[local33] += Static180.anInt3444;
								this.anIntArray340[local33] += Static180.anInt3442;
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
				if (Static180.aBoolean247) {
					local307 = arg7[0] * Static180.anInt3443 + arg7[3] * Static180.anInt3444 + arg7[6] * Static180.anInt3442 + 16384 >> 15;
					local329 = arg7[1] * Static180.anInt3443 + arg7[4] * Static180.anInt3444 + arg7[7] * Static180.anInt3442 + 16384 >> 15;
					local351 = arg7[2] * Static180.anInt3443 + arg7[5] * Static180.anInt3444 + arg7[8] * Static180.anInt3442 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static180.anInt3443 = local307;
					Static180.anInt3444 = local329;
					Static180.anInt3442 = local351;
					Static180.aBoolean247 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static180.anInt3443 + 16384 >> 15;
				local398 = local329 * -Static180.anInt3444 + 16384 >> 15;
				local404 = local351 * -Static180.anInt3442 + 16384 >> 15;
				local410 = local392 + Static180.anInt3443;
				local418 = local398 + Static180.anInt3444;
				local426 = local404 + Static180.anInt3442;
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
					if (local631 < this.anIntArrayArray29.length) {
						local753 = this.anIntArrayArray29[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray347[local760] + local1628[1] * this.anIntArray344[local760] + local1628[2] * this.anIntArray340[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray347[local760] + local1628[4] * this.anIntArray344[local760] + local1628[5] * this.anIntArray340[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray347[local760] + local1628[7] * this.anIntArray344[local760] + local1628[8] * this.anIntArray340[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray347[local760] = local1896;
								this.anIntArray344[local760] = local1900;
								this.anIntArray340[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray42 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray30.length) {
						local204 = this.anIntArrayArray30[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local33]) != 0) {
								local41 = (this.aByteArray42[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray42[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray30.length) {
					local204 = this.anIntArrayArray30[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local33]) != 0) {
							local41 = this.aShortArray63[local33] & 0xFFFF;
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
							this.aShortArray63[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean245 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "l", descriptor = "()I")
	@Override
	public int method3878() {
		if (!this.aBoolean244) {
			this.method2922();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "()V")
	private void method2926() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3439; local1++) {
			@Pc(15) short local15 = this.aShortArray61 == null ? -1 : this.aShortArray61[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray63[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray342[local1] == -1) {
					local38 = this.anIntArray345[local1] & 0xFFFE0000;
					this.anIntArray345[local1] = local38 | Static180.method2925(local25, local38 >> 17);
				} else if (this.anIntArray342[local1] != -2) {
					local38 = this.anIntArray345[local1] & 0xFFFE0000;
					this.anIntArray345[local1] = local38 | Static180.method2925(local25, local38 >> 17);
					local38 = this.anIntArray346[local1] & 0xFFFE0000;
					this.anIntArray346[local1] = local38 | Static180.method2925(local25, local38 >> 17);
					local38 = this.anIntArray342[local1] & 0xFFFE0000;
					this.anIntArray342[local1] = local38 | Static180.method2925(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static180.anInt3443 = 0;
			Static180.anInt3444 = 0;
			Static180.anInt3442 = 0;
			for (local11 = 0; local11 < this.anInt3440; local11++) {
				Static180.anInt3443 += this.anIntArray347[local11];
				Static180.anInt3444 += this.anIntArray344[local11];
				Static180.anInt3442 += this.anIntArray340[local11];
				local3++;
			}
			if (local3 > 0) {
				Static180.anInt3443 = Static180.anInt3443 / local3 + arg1;
				Static180.anInt3444 = Static180.anInt3444 / local3 + arg2;
				Static180.anInt3442 = Static180.anInt3442 / local3 + arg3;
			} else {
				Static180.anInt3443 = arg1;
				Static180.anInt3444 = arg2;
				Static180.anInt3442 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt3440; local3++) {
				this.anIntArray347[local3] += arg1;
				this.anIntArray344[local3] += arg2;
				this.anIntArray340[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt3440; local3++) {
					this.anIntArray347[local3] -= Static180.anInt3443;
					this.anIntArray344[local3] -= Static180.anInt3444;
					this.anIntArray340[local3] -= Static180.anInt3442;
					if (arg3 != 0) {
						local11 = Class111.anIntArray299[arg3];
						local146 = Class111.anIntArray298[arg3];
						local164 = this.anIntArray344[local3] * local11 + this.anIntArray347[local3] * local146 + 32767 >> 16;
						this.anIntArray344[local3] = this.anIntArray344[local3] * local146 + 32767 - this.anIntArray347[local3] * local11 >> 16;
						this.anIntArray347[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class111.anIntArray299[arg1];
						local146 = Class111.anIntArray298[arg1];
						local164 = this.anIntArray344[local3] * local146 + 32767 - this.anIntArray340[local3] * local11 >> 16;
						this.anIntArray340[local3] = this.anIntArray344[local3] * local11 + this.anIntArray340[local3] * local146 + 32767 >> 16;
						this.anIntArray344[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class111.anIntArray299[arg2];
						local146 = Class111.anIntArray298[arg2];
						local164 = this.anIntArray340[local3] * local11 + this.anIntArray347[local3] * local146 + 32767 >> 16;
						this.anIntArray340[local3] = this.anIntArray340[local3] * local146 + 32767 - this.anIntArray347[local3] * local11 >> 16;
						this.anIntArray347[local3] = local164;
					}
					this.anIntArray347[local3] += Static180.anInt3443;
					this.anIntArray344[local3] += Static180.anInt3444;
					this.anIntArray340[local3] += Static180.anInt3442;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt3440; local3++) {
					this.anIntArray347[local3] -= Static180.anInt3443;
					this.anIntArray344[local3] -= Static180.anInt3444;
					this.anIntArray340[local3] -= Static180.anInt3442;
					this.anIntArray347[local3] = this.anIntArray347[local3] * arg1 / 128;
					this.anIntArray344[local3] = this.anIntArray344[local3] * arg2 / 128;
					this.anIntArray340[local3] = this.anIntArray340[local3] * arg3 / 128;
					this.anIntArray347[local3] += Static180.anInt3443;
					this.anIntArray344[local3] += Static180.anInt3444;
					this.anIntArray340[local3] += Static180.anInt3442;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt3439; local3++) {
					local11 = (this.aByteArray42[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray42[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt3439; local3++) {
					local11 = this.aShortArray63[local3] & 0xFFFF;
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
					this.aShortArray63[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean245 = true;
			}
		}
	}
}
