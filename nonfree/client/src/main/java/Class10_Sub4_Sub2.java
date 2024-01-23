import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class10_Sub4_Sub2 extends Class10_Sub4 {

	@OriginalMember(owner = "client!ii", name = "Rb", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!ii", name = "Db", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!ii", name = "Mb", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!ii", name = "Nb", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ii", name = "bc", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!ii", name = "vb", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "[Lclient!go;")
	public Class67[] aClass67Array3;

	@OriginalMember(owner = "client!ii", name = "M", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!ii", name = "X", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!ii", name = "Y", descriptor = "[Lclient!wb;")
	public Class190[] aClass190Array3;

	@OriginalMember(owner = "client!ii", name = "Z", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ii", name = "ab", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!ii", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ii", name = "gb", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!ii", name = "jb", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!ii", name = "kb", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
	private int anInt2223 = 0;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	private int anInt2222 = 0;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt2224 = 0;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	private int anInt2225 = 0;

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Z")
	public boolean aBoolean172 = false;

	static {
		if (Static119.aBoolean175) {
			anIntArray266 = new int[4096];
			anIntArray256 = new int[4096];
		} else {
			anIntArray263 = new int[1600];
			anIntArrayArray37 = new int[1600][64];
			anIntArray273 = new int[32];
			anIntArrayArray35 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class10_Sub4_Sub2() {
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!d;IIIII)V")
	public Class10_Sub4_Sub2(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method723();
		arg0.method729();
		this.anInt2224 = arg0.anInt856;
		this.anInt2225 = arg0.anInt860;
		this.anIntArray239 = arg0.anIntArray71;
		this.anIntArray233 = arg0.anIntArray79;
		this.anIntArray245 = arg0.anIntArray74;
		this.anInt2222 = arg0.anInt857;
		this.anIntArray243 = arg0.anIntArray81;
		this.anIntArray232 = arg0.anIntArray77;
		this.anIntArray237 = arg0.anIntArray75;
		this.aByteArray27 = arg0.aByteArray9;
		this.aByteArray28 = arg0.aByteArray5;
		this.aByte12 = arg0.aByte2;
		this.aShortArray47 = arg0.aShortArray15;
		this.anIntArrayArray34 = arg0.anIntArrayArray9;
		this.anIntArrayArray33 = arg0.anIntArrayArray8;
		this.aShortArray45 = arg0.aShortArray17;
		this.aClass190Array3 = arg0.aClass190Array1;
		this.aClass67Array3 = arg0.aClass67Array1;
		this.aShortArray44 = arg0.aShortArray21;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray235 = new int[this.anInt2222];
		this.anIntArray238 = new int[this.anInt2222];
		this.anIntArray240 = new int[this.anInt2222];
		@Pc(148) int local148;
		if (arg0.aShortArray22 == null) {
			this.aShortArray46 = null;
		} else {
			this.aShortArray46 = new short[this.anInt2222];
			for (local148 = 0; local148 < this.anInt2222; local148++) {
				@Pc(157) short local157 = arg0.aShortArray22[local148];
				if (local157 != -1 && Static16.anInterface4_1.method2909(local157)) {
					this.aShortArray46[local148] = local157;
				} else {
					this.aShortArray46[local148] = -1;
				}
			}
		}
		if (arg0.anInt858 > 0 && arg0.aByteArray4 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt858];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt2222; local194++) {
				if (arg0.aByteArray4[local194] != -1) {
					local192[arg0.aByteArray4[local194] & 0xFF]++;
				}
			}
			this.anInt2223 = 0;
			for (local194 = 0; local194 < arg0.anInt858; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray8[local194] == 0) {
					this.anInt2223++;
				}
			}
			this.anIntArray234 = new int[this.anInt2223];
			this.anIntArray236 = new int[this.anInt2223];
			this.anIntArray246 = new int[this.anInt2223];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt858; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray8[local263] == 0) {
					this.anIntArray234[local194] = arg0.aShortArray19[local263] & 0xFFFF;
					this.anIntArray236[local194] = arg0.aShortArray14[local263] & 0xFFFF;
					this.anIntArray246[local194] = arg0.aShortArray18[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray29 = new byte[this.anInt2222];
			for (local263 = 0; local263 < this.anInt2222; local263++) {
				if (arg0.aByteArray4[local263] == -1) {
					this.aByteArray29[local263] = -1;
				} else {
					this.aByteArray29[local263] = (byte) local192[arg0.aByteArray4[local263] & 0xFF];
					if (this.aByteArray29[local263] == -1 && this.aShortArray46 != null) {
						this.aShortArray46[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt2222; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray12 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray12[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray5 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray5[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray46 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray46[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class86 local450;
			@Pc(483) int local483;
			@Pc(629) Class64 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray15[local148] & 0xFFFF;
					if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray243[local148]] == null) {
						local450 = arg0.aClass86Array2[this.anIntArray243[local148]];
					} else {
						local450 = arg0.aClass86Array1[this.anIntArray243[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486) << 17;
					this.anIntArray235[local148] = local483 | Static119.method1972(local431, local483 >> 17);
					if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray232[local148]] == null) {
						local450 = arg0.aClass86Array2[this.anIntArray232[local148]];
					} else {
						local450 = arg0.aClass86Array1[this.anIntArray232[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486) << 17;
					this.anIntArray238[local148] = local483 | Static119.method1972(local431, local483 >> 17);
					if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray237[local148]] == null) {
						local450 = arg0.aClass86Array2[this.anIntArray237[local148]];
					} else {
						local450 = arg0.aClass86Array1[this.anIntArray237[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486) << 17;
					this.anIntArray240[local148] = local483 | Static119.method1972(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass64Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt1709 + arg4 * local629.anInt1716 + arg5 * local629.anInt1710) / (local123 + local123 / 2) << 17;
					this.anIntArray235[local148] = local483 | Static119.method1972(arg0.aShortArray15[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray240[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray235[local148] = 128;
					this.anIntArray240[local148] = -1;
				} else {
					this.anIntArray240[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray243[local148]] == null) {
					local450 = arg0.aClass86Array2[this.anIntArray243[local148]];
				} else {
					local450 = arg0.aClass86Array1[this.anIntArray243[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486);
				this.anIntArray235[local148] = Static119.method1970(local483);
				if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray232[local148]] == null) {
					local450 = arg0.aClass86Array2[this.anIntArray232[local148]];
				} else {
					local450 = arg0.aClass86Array1[this.anIntArray232[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486);
				this.anIntArray238[local148] = Static119.method1970(local483);
				if (arg0.aClass86Array1 == null || arg0.aClass86Array1[this.anIntArray237[local148]] == null) {
					local450 = arg0.aClass86Array2[this.anIntArray237[local148]];
				} else {
					local450 = arg0.aClass86Array1[this.anIntArray237[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2489 + arg4 * local450.anInt2490 + arg5 * local450.anInt2485) / (local123 * local450.anInt2486);
				this.anIntArray240[local148] = Static119.method1970(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass64Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt1709 + arg4 * local629.anInt1716 + arg5 * local629.anInt1710) / (local123 + local123 / 2);
				this.anIntArray235[local148] = Static119.method1970(local483);
				this.anIntArray240[local148] = -1;
			} else {
				this.anIntArray240[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([Lclient!ii;I)V")
	private Class10_Sub4_Sub2(@OriginalArg(0) Class10_Sub4_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt2224 = 0;
		this.anInt2222 = 0;
		this.anInt2223 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte12 = -1;
		@Pc(48) int local48;
		@Pc(55) Class10_Sub4_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt2224 += local55.anInt2224;
				this.anInt2222 += local55.anInt2222;
				this.anInt2223 += local55.anInt2223;
				if (local55.aByteArray27 == null) {
					if (this.aByte12 == -1) {
						this.aByte12 = local55.aByte12;
					}
					if (this.aByte12 != local55.aByte12) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray28 != null;
				local28 |= local55.aShortArray46 != null;
				local30 |= local55.aByteArray29 != null;
				if (local55.aClass190Array3 != null) {
					local41 += local55.aClass190Array3.length;
				}
				if (local55.aClass67Array3 != null) {
					local43 += local55.aClass67Array3.length;
				}
			}
		}
		this.anIntArray239 = new int[this.anInt2224];
		this.anIntArray233 = new int[this.anInt2224];
		this.anIntArray245 = new int[this.anInt2224];
		this.anIntArray243 = new int[this.anInt2222];
		this.anIntArray232 = new int[this.anInt2222];
		this.anIntArray237 = new int[this.anInt2222];
		this.anIntArray235 = new int[this.anInt2222];
		this.anIntArray238 = new int[this.anInt2222];
		this.anIntArray240 = new int[this.anInt2222];
		if (local24) {
			this.aByteArray27 = new byte[this.anInt2222];
		}
		if (local26) {
			this.aByteArray28 = new byte[this.anInt2222];
		}
		if (local28) {
			this.aShortArray46 = new short[this.anInt2222];
		}
		if (local30) {
			this.aByteArray29 = new byte[this.anInt2222];
		}
		if (this.anInt2223 > 0) {
			this.anIntArray234 = new int[this.anInt2223];
			this.anIntArray236 = new int[this.anInt2223];
			this.anIntArray246 = new int[this.anInt2223];
		}
		if (local41 > 0) {
			this.aClass190Array3 = new Class190[local41];
		}
		if (local43 > 0) {
			this.aClass67Array3 = new Class67[local43];
		}
		this.aShortArray47 = new short[this.anInt2222];
		this.anInt2224 = 0;
		this.anInt2222 = 0;
		this.anInt2223 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt2222; local280++) {
					this.anIntArray243[this.anInt2222] = local55.anIntArray243[local280] + this.anInt2224;
					this.anIntArray232[this.anInt2222] = local55.anIntArray232[local280] + this.anInt2224;
					this.anIntArray237[this.anInt2222] = local55.anIntArray237[local280] + this.anInt2224;
					this.anIntArray235[this.anInt2222] = local55.anIntArray235[local280];
					this.anIntArray238[this.anInt2222] = local55.anIntArray238[local280];
					this.anIntArray240[this.anInt2222] = local55.anIntArray240[local280];
					this.aShortArray47[this.anInt2222] = local55.aShortArray47[local280];
					if (local24) {
						if (local55.aByteArray27 == null) {
							this.aByteArray27[this.anInt2222] = local55.aByte12;
						} else {
							this.aByteArray27[this.anInt2222] = local55.aByteArray27[local280];
						}
					}
					if (local26 && local55.aByteArray28 != null) {
						this.aByteArray28[this.anInt2222] = local55.aByteArray28[local280];
					}
					if (local28) {
						if (local55.aShortArray46 == null) {
							this.aShortArray46[this.anInt2222] = -1;
						} else {
							this.aShortArray46[this.anInt2222] = local55.aShortArray46[local280];
						}
					}
					if (local30) {
						this.aByteArray29[this.anInt2222] = (byte) (local55.aByteArray29 == null || local55.aByteArray29[local280] == -1 ? -1 : local55.aByteArray29[local280] + this.anInt2223);
					}
					this.anInt2222++;
				}
				if (local55.aClass190Array3 != null) {
					for (local280 = 0; local280 < local55.aClass190Array3.length; local280++) {
						this.aClass190Array3[local41] = new Class190(local55.aClass190Array3[local280].aClass164_2, local55.aClass190Array3[local280].anInt6005 + this.anInt2224, local55.aClass190Array3[local280].anInt6000 + this.anInt2224, local55.aClass190Array3[local280].anInt6001 + this.anInt2224);
						local41++;
					}
				}
				if (local55.aClass67Array3 != null) {
					for (local280 = 0; local280 < local55.aClass67Array3.length; local280++) {
						this.aClass67Array3[local43] = new Class67(local55.aClass67Array3[local280].aClass181_1, local55.aClass67Array3[local280].anInt1836 + this.anInt2224);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt2223; local280++) {
					if (local55.anIntArray234[local280] < local55.anInt2225) {
						this.anIntArray234[this.anInt2223] = local55.anIntArray234[local280] + this.anInt2224;
					}
					if (local55.anIntArray236[local280] < local55.anInt2225) {
						this.anIntArray236[this.anInt2223] = local55.anIntArray236[local280] + this.anInt2224;
					}
					if (local55.anIntArray246[local280] < local55.anInt2225) {
						this.anIntArray246[this.anInt2223] = local55.anIntArray246[local280] + this.anInt2224;
					}
					this.anInt2223++;
				}
				for (local280 = 0; local280 < local55.anInt2225; local280++) {
					this.anIntArray239[this.anInt2224] = local55.anIntArray239[local280];
					this.anIntArray233[this.anInt2224] = local55.anIntArray233[local280];
					this.anIntArray245[this.anInt2224] = local55.anIntArray245[local280];
					this.anInt2224++;
				}
			}
		}
		local48 = 0;
		this.anInt2225 = this.anInt2224;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class10_Sub4_Sub2 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt2223; local662++) {
					if (local658.anIntArray234[local662] >= local658.anInt2225) {
						this.anIntArray234[local48] = local658.anIntArray234[local662] + this.anInt2224 - local658.anInt2225;
					}
					if (local658.anIntArray236[local662] >= local658.anInt2225) {
						this.anIntArray236[local48] = local658.anIntArray236[local662] + this.anInt2224 - local658.anInt2225;
					}
					if (local658.anIntArray246[local662] >= local658.anInt2225) {
						this.anIntArray246[local48] = local658.anIntArray246[local662] + this.anInt2224 - local658.anInt2225;
					}
					local48++;
				}
				for (local662 = local658.anInt2225; local662 < local658.anInt2224; local662++) {
					this.anIntArray239[this.anInt2224] = local658.anIntArray239[local662];
					this.anIntArray233[this.anInt2224] = local658.anIntArray233[local662];
					this.anIntArray245[this.anInt2224] = local658.anIntArray245[local662];
					this.anInt2224++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZZLclient!ii;[B[S[I[I[I)Lclient!hm;")
	private Class10_Sub4 method1967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class10_Sub4_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt2224 = this.anInt2224;
		arg2.anInt2225 = this.anInt2225;
		arg2.anInt2222 = this.anInt2222;
		arg2.anInt2223 = this.anInt2223;
		if (arg2.anIntArray239 == null || arg2.anIntArray239.length < this.anInt2224) {
			arg2.anIntArray239 = new int[this.anInt2224 + 100];
			arg2.anIntArray233 = new int[this.anInt2224 + 100];
			arg2.anIntArray245 = new int[this.anInt2224 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt2224; local47++) {
			arg2.anIntArray239[local47] = this.anIntArray239[local47];
			arg2.anIntArray233[local47] = this.anIntArray233[local47];
			arg2.anIntArray245[local47] = this.anIntArray245[local47];
		}
		if (arg0) {
			arg2.aByteArray28 = this.aByteArray28;
		} else {
			arg2.aByteArray28 = arg3;
			if (this.aByteArray28 == null) {
				for (local47 = 0; local47 < this.anInt2222; local47++) {
					arg2.aByteArray28[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt2222; local47++) {
					arg2.aByteArray28[local47] = this.aByteArray28[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray47 = this.aShortArray47;
			arg2.anIntArray235 = this.anIntArray235;
			arg2.anIntArray238 = this.anIntArray238;
			arg2.anIntArray240 = this.anIntArray240;
		} else {
			arg2.aShortArray47 = arg4;
			arg2.anIntArray235 = arg5;
			arg2.anIntArray238 = arg6;
			arg2.anIntArray240 = arg7;
			for (local47 = 0; local47 < this.anInt2222; local47++) {
				arg2.aShortArray47[local47] = this.aShortArray47[local47];
				arg2.anIntArray235[local47] = this.anIntArray235[local47];
				arg2.anIntArray238[local47] = this.anIntArray238[local47];
				arg2.anIntArray240[local47] = this.anIntArray240[local47];
			}
		}
		arg2.anIntArray243 = this.anIntArray243;
		arg2.anIntArray232 = this.anIntArray232;
		arg2.anIntArray237 = this.anIntArray237;
		arg2.aByteArray27 = this.aByteArray27;
		arg2.aByteArray29 = this.aByteArray29;
		arg2.aShortArray46 = this.aShortArray46;
		arg2.aByte12 = this.aByte12;
		arg2.anIntArray234 = this.anIntArray234;
		arg2.anIntArray236 = this.anIntArray236;
		arg2.anIntArray246 = this.anIntArray246;
		arg2.anIntArrayArray34 = this.anIntArrayArray34;
		arg2.anIntArrayArray33 = this.anIntArrayArray33;
		arg2.aShortArray44 = this.aShortArray44;
		arg2.aShortArray45 = this.aShortArray45;
		arg2.aBoolean171 = this.aBoolean171;
		arg2.aBoolean172 = false;
		arg2.aClass190Array3 = this.aClass190Array3;
		arg2.aClass67Array3 = this.aClass67Array3;
		return arg2;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	private void method1968(@OriginalArg(0) int arg0) {
		if (Static119.aBooleanArray54[arg0]) {
			this.method1974(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray243[arg0];
		@Pc(17) int local17 = this.anIntArray232[arg0];
		@Pc(22) int local22 = this.anIntArray237[arg0];
		Static16.aBoolean26 = Static119.aBooleanArray55[arg0];
		if (this.aByteArray28 == null) {
			Static16.anInt321 = 0;
		} else {
			Static16.anInt321 = this.aByteArray28[arg0] & 0xFF;
		}
		if (this.aShortArray46 != null && this.aShortArray46[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray29 == null || this.aByteArray29[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray29[arg0] & 0xFF;
				local141 = this.anIntArray234[local136];
				local146 = this.anIntArray236[local136];
				local151 = this.anIntArray246[local136];
			}
			if (this.anIntArray240[arg0] == -1) {
				Static16.method277(Static119.anIntArray260[local12], Static119.anIntArray260[local17], Static119.anIntArray260[local22], Static119.anIntArray258[local12], Static119.anIntArray258[local17], Static119.anIntArray258[local22], this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static119.anIntArray269[local141], Static119.anIntArray269[local146], Static119.anIntArray269[local151], Static119.anIntArray252[local141], Static119.anIntArray252[local146], Static119.anIntArray252[local151], Static119.anIntArray270[local141], Static119.anIntArray270[local146], Static119.anIntArray270[local151], this.aShortArray46[arg0]);
			} else {
				Static16.method277(Static119.anIntArray260[local12], Static119.anIntArray260[local17], Static119.anIntArray260[local22], Static119.anIntArray258[local12], Static119.anIntArray258[local17], Static119.anIntArray258[local22], this.anIntArray235[arg0], this.anIntArray238[arg0], this.anIntArray240[arg0], Static119.anIntArray269[local141], Static119.anIntArray269[local146], Static119.anIntArray269[local151], Static119.anIntArray252[local141], Static119.anIntArray252[local146], Static119.anIntArray252[local151], Static119.anIntArray270[local141], Static119.anIntArray270[local146], Static119.anIntArray270[local151], this.aShortArray46[arg0]);
			}
		} else if (this.anIntArray240[arg0] == -1) {
			Static16.method273(Static119.anIntArray260[local12], Static119.anIntArray260[local17], Static119.anIntArray260[local22], Static119.anIntArray258[local12], Static119.anIntArray258[local17], Static119.anIntArray258[local22], Static16.anIntArray25[this.anIntArray235[arg0] & 0xFFFF]);
		} else {
			Static16.method283(Static119.anIntArray260[local12], Static119.anIntArray260[local17], Static119.anIntArray260[local22], Static119.anIntArray258[local12], Static119.anIntArray258[local17], Static119.anIntArray258[local22], this.anIntArray235[arg0] & 0xFFFF, this.anIntArray238[arg0] & 0xFFFF, this.anIntArray240[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "()V")
	private void method1969() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2225; local17++) {
			@Pc(26) int local26 = this.anIntArray239[local17];
			@Pc(31) int local31 = this.anIntArray233[local17];
			@Pc(36) int local36 = this.anIntArray245[local17];
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
		this.aShort31 = (short) local7;
		this.aShort32 = (short) local3;
		this.aShort27 = (short) local9;
		this.aShort28 = (short) local5;
		this.aShort30 = (short) local11;
		this.aShort25 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort26 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()Z")
	@Override
	protected boolean method1941() {
		if (this.anIntArrayArray34 == null) {
			return false;
		} else {
			Static119.anInt2228 = 0;
			Static119.anInt2229 = 0;
			Static119.anInt2227 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "()V")
	@Override
	public void method1950() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2224; local1++) {
			@Pc(10) int local10 = this.anIntArray239[local1];
			this.anIntArray239[local1] = this.anIntArray245[local1];
			this.anIntArray245[local1] = -local10;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static119.anInt2228 = 0;
			Static119.anInt2229 = 0;
			Static119.anInt2227 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray34.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray34[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local41]) != 0) {
							Static119.anInt2228 += this.anIntArray239[local41];
							Static119.anInt2229 += this.anIntArray233[local41];
							Static119.anInt2227 += this.anIntArray245[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static119.anInt2228 = Static119.anInt2228 / local6 + arg2;
				Static119.anInt2229 = Static119.anInt2229 / local6 + arg3;
				Static119.anInt2227 = Static119.anInt2227 / local6 + arg4;
				Static119.aBoolean174 = true;
			} else {
				Static119.anInt2228 = arg2;
				Static119.anInt2229 = arg3;
				Static119.anInt2227 = arg4;
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
				if (local14 < this.anIntArrayArray34.length) {
					local204 = this.anIntArrayArray34[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local33]) != 0) {
							this.anIntArray239[local33] += arg2;
							this.anIntArray233[local33] += arg3;
							this.anIntArray245[local33] += arg4;
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
					if (local14 < this.anIntArrayArray34.length) {
						local204 = this.anIntArrayArray34[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local33]) != 0) {
								this.anIntArray239[local33] -= Static119.anInt2228;
								this.anIntArray233[local33] -= Static119.anInt2229;
								this.anIntArray245[local33] -= Static119.anInt2227;
								if (arg4 != 0) {
									local41 = Class11.anIntArray26[arg4];
									local307 = Class11.anIntArray27[arg4];
									local329 = this.anIntArray233[local33] * local41 + this.anIntArray239[local33] * local307 + 32767 >> 16;
									this.anIntArray233[local33] = this.anIntArray233[local33] * local307 + 32767 - this.anIntArray239[local33] * local41 >> 16;
									this.anIntArray239[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class11.anIntArray26[arg2];
									local307 = Class11.anIntArray27[arg2];
									local329 = this.anIntArray233[local33] * local307 + 32767 - this.anIntArray245[local33] * local41 >> 16;
									this.anIntArray245[local33] = this.anIntArray233[local33] * local41 + this.anIntArray245[local33] * local307 + 32767 >> 16;
									this.anIntArray233[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class11.anIntArray26[arg3];
									local307 = Class11.anIntArray27[arg3];
									local329 = this.anIntArray245[local33] * local41 + this.anIntArray239[local33] * local307 + 32767 >> 16;
									this.anIntArray245[local33] = this.anIntArray245[local33] * local307 + 32767 - this.anIntArray239[local33] * local41 >> 16;
									this.anIntArray239[local33] = local329;
								}
								this.anIntArray239[local33] += Static119.anInt2228;
								this.anIntArray233[local33] += Static119.anInt2229;
								this.anIntArray245[local33] += Static119.anInt2227;
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
				if (Static119.aBoolean174) {
					local307 = arg7[0] * Static119.anInt2228 + arg7[3] * Static119.anInt2229 + arg7[6] * Static119.anInt2227 + 16384 >> 15;
					local329 = arg7[1] * Static119.anInt2228 + arg7[4] * Static119.anInt2229 + arg7[7] * Static119.anInt2227 + 16384 >> 15;
					local351 = arg7[2] * Static119.anInt2228 + arg7[5] * Static119.anInt2229 + arg7[8] * Static119.anInt2227 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static119.anInt2228 = local307;
					Static119.anInt2229 = local329;
					Static119.anInt2227 = local351;
					Static119.aBoolean174 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class11.anIntArray27[arg2] >> 1;
				local351 = Class11.anIntArray26[arg2] >> 1;
				local392 = Class11.anIntArray27[arg3] >> 1;
				local398 = Class11.anIntArray26[arg3] >> 1;
				local404 = Class11.anIntArray27[arg4] >> 1;
				local410 = Class11.anIntArray26[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static119.anInt2228 + local374[1] * -Static119.anInt2229 + local374[2] * -Static119.anInt2227 + 16384 >> 15;
				local579 = local374[3] * -Static119.anInt2228 + local374[4] * -Static119.anInt2229 + local374[5] * -Static119.anInt2227 + 16384 >> 15;
				local604 = local374[6] * -Static119.anInt2228 + local374[7] * -Static119.anInt2229 + local374[8] * -Static119.anInt2227 + 16384 >> 15;
				local608 = local554 + Static119.anInt2228;
				@Pc(612) int local612 = local579 + Static119.anInt2229;
				local616 = local604 + Static119.anInt2227;
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
					if (local893 < this.anIntArrayArray34.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray34[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray239[local913] + local753[1] * this.anIntArray233[local913] + local753[2] * this.anIntArray245[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray239[local913] + local753[4] * this.anIntArray233[local913] + local753[5] * this.anIntArray245[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray239[local913] + local753[7] * this.anIntArray233[local913] + local753[8] * this.anIntArray245[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray239[local913] = local1021;
								this.anIntArray233[local913] = local1025;
								this.anIntArray245[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray34.length) {
						local204 = this.anIntArrayArray34[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local33]) != 0) {
								this.anIntArray239[local33] -= Static119.anInt2228;
								this.anIntArray233[local33] -= Static119.anInt2229;
								this.anIntArray245[local33] -= Static119.anInt2227;
								this.anIntArray239[local33] = this.anIntArray239[local33] * arg2 / 128;
								this.anIntArray233[local33] = this.anIntArray233[local33] * arg3 / 128;
								this.anIntArray245[local33] = this.anIntArray245[local33] * arg4 / 128;
								this.anIntArray239[local33] += Static119.anInt2228;
								this.anIntArray233[local33] += Static119.anInt2229;
								this.anIntArray245[local33] += Static119.anInt2227;
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
				if (Static119.aBoolean174) {
					local307 = arg7[0] * Static119.anInt2228 + arg7[3] * Static119.anInt2229 + arg7[6] * Static119.anInt2227 + 16384 >> 15;
					local329 = arg7[1] * Static119.anInt2228 + arg7[4] * Static119.anInt2229 + arg7[7] * Static119.anInt2227 + 16384 >> 15;
					local351 = arg7[2] * Static119.anInt2228 + arg7[5] * Static119.anInt2229 + arg7[8] * Static119.anInt2227 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static119.anInt2228 = local307;
					Static119.anInt2229 = local329;
					Static119.anInt2227 = local351;
					Static119.aBoolean174 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static119.anInt2228 + 16384 >> 15;
				local398 = local329 * -Static119.anInt2229 + 16384 >> 15;
				local404 = local351 * -Static119.anInt2227 + 16384 >> 15;
				local410 = local392 + Static119.anInt2228;
				local418 = local398 + Static119.anInt2229;
				local426 = local404 + Static119.anInt2227;
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
					if (local631 < this.anIntArrayArray34.length) {
						local753 = this.anIntArrayArray34[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray239[local760] + local1628[1] * this.anIntArray233[local760] + local1628[2] * this.anIntArray245[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray239[local760] + local1628[4] * this.anIntArray233[local760] + local1628[5] * this.anIntArray245[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray239[local760] + local1628[7] * this.anIntArray233[local760] + local1628[8] * this.anIntArray245[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray239[local760] = local1896;
								this.anIntArray233[local760] = local1900;
								this.anIntArray245[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray33 != null && this.aByteArray28 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray33.length) {
						local204 = this.anIntArrayArray33[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray45 == null || (arg6 & this.aShortArray45[local33]) != 0) {
								local41 = (this.aByteArray28[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray28[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray33 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray33.length) {
					local204 = this.anIntArrayArray33[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray45 == null || (arg6 & this.aShortArray45[local33]) != 0) {
							local41 = this.aShortArray47[local33] & 0xFFFF;
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
							this.aShortArray47[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean173 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)V")
	@Override
	public void method1964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2224; local1++) {
			this.anIntArray239[local1] += arg0;
			this.anIntArray233[local1] += arg1;
			this.anIntArray245[local1] += arg2;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "()I")
	@Override
	public int method1952() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		if (!this.aBoolean172) {
			this.method1969();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort25 * arg2 + this.aShort27 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort25 * arg2 + this.aShort32 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method1090();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt1311 - arg10.anInt1312) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method1094(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort25 << 9;
		if (local70 / local38 <= Static152.anInt2870) {
			return;
		}
		local87 = local58 - this.aShort25 << 9;
		if (local87 / local38 >= Static136.anInt2620) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort25 * arg1 + this.aShort27 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static183.anInt3645) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort25 * arg1 + this.aShort32 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static181.anInt3567) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt2223 > 0;
		@Pc(223) int local223 = Static16.anInt325;
		@Pc(225) int local225 = Static16.anInt324;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class11.anIntArray26[arg0];
			local229 = Class11.anIntArray27[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static217.aBoolean302 && local53 > 0) {
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
			if (Static177.anInt3290 >= local255 && Static177.anInt3290 <= local259 && Static186.anInt3681 >= local274 && Static186.anInt3681 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31 };
				@Pc(393) int[] local393 = new int[] { this.aShort28, this.aShort28, this.aShort30, this.aShort30, this.aShort28, this.aShort28, this.aShort30, this.aShort30 };
				@Pc(436) int[] local436 = new int[] { this.aShort32, this.aShort32, this.aShort32, this.aShort32, this.aShort27, this.aShort27, this.aShort27, this.aShort27 };
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
				if (Static177.anInt3290 >= local255 && Static177.anInt3290 <= local259 && Static186.anInt3681 >= local274 && Static186.anInt3681 <= local278) {
					if (this.aBoolean171) {
						Static88.aLongArray4[Static120.anInt2259++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt2224; local255++) {
			local274 = this.anIntArray239[local255];
			local259 = this.anIntArray233[local255];
			local278 = this.anIntArray245[local255];
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
			Static119.anIntArray259[local255] = local278 - local24;
			if (local278 >= 50) {
				Static119.anIntArray258[local255] = local223 + (local274 << 9) / local278;
				Static119.anIntArray260[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static119.anIntArray258[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static119.anIntArray269[local255] = local274;
				Static119.anIntArray252[local255] = local628;
				Static119.anIntArray270[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static71.anInt1297 + local223;
			local274 = Static71.anInt1295 + local225;
			for (local259 = 0; local259 < arg10.aClass47_Sub2_Sub1Array1.length; local259++) {
				@Pc(770) Class47_Sub2_Sub1 local770 = arg10.aClass47_Sub2_Sub1Array1[local259];
				if (local770 == null || local770.aBoolean384) {
					Static119.anIntArray255[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt5552 >> 12) - Static282.anInt5668;
					@Pc(789) int local789 = (local770.anInt5550 >> 12) - Static112.anInt5733;
					@Pc(796) int local796 = (local770.anInt5547 >> 12) - Static104.anInt1924;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static119.anIntArray257[local259] = local255 + (local628 << 9) / local838;
						Static119.anIntArray264[local259] = local274 + (local438 << 9) / local838;
						Static119.anIntArray272[local259] = local838;
						Static119.anIntArray255[local259] = local838 - local24;
					} else {
						Static119.anIntArray255[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method1978(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hm;)Lclient!hm;")
	public Class10_Sub4 method1973(@OriginalArg(0) Class10_Sub4 arg0) {
		return new Class10_Sub4_Sub2(new Class10_Sub4_Sub2[] { this, (Class10_Sub4_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	private void method1974(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static16.anInt325;
		@Pc(3) int local3 = Static16.anInt324;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray243[arg0];
		@Pc(15) int local15 = this.anIntArray232[arg0];
		@Pc(20) int local20 = this.anIntArray237[arg0];
		@Pc(24) int local24 = Static119.anIntArray270[local10];
		@Pc(28) int local28 = Static119.anIntArray270[local15];
		@Pc(32) int local32 = Static119.anIntArray270[local20];
		if (this.aByteArray28 == null) {
			Static16.anInt321 = 0;
		} else {
			Static16.anInt321 = this.aByteArray28[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static119.anIntArray250[0] = Static119.anIntArray258[local10];
			Static119.anIntArray253[0] = Static119.anIntArray260[local10];
			local5++;
			Static119.anIntArray262[0] = this.anIntArray235[arg0] & 0xFFFF;
		} else {
			local75 = Static119.anIntArray269[local10];
			local79 = Static119.anIntArray252[local10];
			local86 = this.anIntArray235[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class11.anIntArray28[local32 - local24];
				Static119.anIntArray250[0] = local1 + (local75 + ((Static119.anIntArray269[local20] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[0] = local3 + (local79 + ((Static119.anIntArray252[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static119.anIntArray262[0] = local86 + (((this.anIntArray240[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class11.anIntArray28[local28 - local24];
				Static119.anIntArray250[local5] = local1 + (local75 + ((Static119.anIntArray269[local15] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[local5] = local3 + (local79 + ((Static119.anIntArray252[local15] - local79) * local99 >> 16) << 9) / 50;
				Static119.anIntArray262[local5++] = local86 + (((this.anIntArray238[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static119.anIntArray250[local5] = Static119.anIntArray258[local15];
			Static119.anIntArray253[local5] = Static119.anIntArray260[local15];
			Static119.anIntArray262[local5++] = this.anIntArray238[arg0] & 0xFFFF;
		} else {
			local75 = Static119.anIntArray269[local15];
			local79 = Static119.anIntArray252[local15];
			local86 = this.anIntArray238[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class11.anIntArray28[local24 - local28];
				Static119.anIntArray250[local5] = local1 + (local75 + ((Static119.anIntArray269[local10] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[local5] = local3 + (local79 + ((Static119.anIntArray252[local10] - local79) * local99 >> 16) << 9) / 50;
				Static119.anIntArray262[local5++] = local86 + (((this.anIntArray235[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class11.anIntArray28[local32 - local28];
				Static119.anIntArray250[local5] = local1 + (local75 + ((Static119.anIntArray269[local20] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[local5] = local3 + (local79 + ((Static119.anIntArray252[local20] - local79) * local99 >> 16) << 9) / 50;
				Static119.anIntArray262[local5++] = local86 + (((this.anIntArray240[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static119.anIntArray250[local5] = Static119.anIntArray258[local20];
			Static119.anIntArray253[local5] = Static119.anIntArray260[local20];
			Static119.anIntArray262[local5++] = this.anIntArray240[arg0] & 0xFFFF;
		} else {
			local75 = Static119.anIntArray269[local20];
			local79 = Static119.anIntArray252[local20];
			local86 = this.anIntArray240[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class11.anIntArray28[local28 - local32];
				Static119.anIntArray250[local5] = local1 + (local75 + ((Static119.anIntArray269[local15] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[local5] = local3 + (local79 + ((Static119.anIntArray252[local15] - local79) * local99 >> 16) << 9) / 50;
				Static119.anIntArray262[local5++] = local86 + (((this.anIntArray238[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class11.anIntArray28[local24 - local32];
				Static119.anIntArray250[local5] = local1 + (local75 + ((Static119.anIntArray269[local10] - local75) * local99 >> 16) << 9) / 50;
				Static119.anIntArray253[local5] = local3 + (local79 + ((Static119.anIntArray252[local10] - local79) * local99 >> 16) << 9) / 50;
				Static119.anIntArray262[local5++] = local86 + (((this.anIntArray235[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static119.anIntArray250[0];
		local79 = Static119.anIntArray250[1];
		local86 = Static119.anIntArray250[2];
		local99 = Static119.anIntArray253[0];
		@Pc(614) int local614 = Static119.anIntArray253[1];
		@Pc(618) int local618 = Static119.anIntArray253[2];
		Static16.aBoolean26 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static16.anInt322 || local79 > Static16.anInt322 || local86 > Static16.anInt322) {
				Static16.aBoolean26 = true;
			}
			if (this.aShortArray46 != null && this.aShortArray46[arg0] != -1) {
				if (this.aByteArray29 == null || this.aByteArray29[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray29[arg0] & 0xFF;
					local709 = this.anIntArray234[local704];
					local714 = this.anIntArray236[local704];
					local719 = this.anIntArray246[local704];
				}
				if (this.anIntArray240[arg0] == -1) {
					Static16.method277(local99, local614, local618, local75, local79, local86, this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], this.aShortArray46[arg0]);
				} else {
					Static16.method277(local99, local614, local618, local75, local79, local86, Static119.anIntArray262[0], Static119.anIntArray262[1], Static119.anIntArray262[2], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], this.aShortArray46[arg0]);
				}
			} else if (this.anIntArray240[arg0] == -1) {
				Static16.method273(local99, local614, local618, local75, local79, local86, Static16.anIntArray25[this.anIntArray235[arg0] & 0xFFFF]);
			} else {
				Static16.method283(local99, local614, local618, local75, local79, local86, Static119.anIntArray262[0], Static119.anIntArray262[1], Static119.anIntArray262[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static16.anInt322 || local79 > Static16.anInt322 || local86 > Static16.anInt322 || Static119.anIntArray250[3] < 0 || Static119.anIntArray250[3] > Static16.anInt322) {
			Static16.aBoolean26 = true;
		}
		if (this.aShortArray46 != null && this.aShortArray46[arg0] != -1) {
			if (this.aByteArray29 == null || this.aByteArray29[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray29[arg0] & 0xFF;
				local709 = this.anIntArray234[local704];
				local714 = this.anIntArray236[local704];
				local719 = this.anIntArray246[local704];
			}
			@Pc(984) short local984 = this.aShortArray46[arg0];
			if (this.anIntArray240[arg0] == -1) {
				Static16.method277(local99, local614, local618, local75, local79, local86, this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], local984);
				Static16.method277(local99, local618, Static119.anIntArray253[3], local75, local86, Static119.anIntArray250[3], this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], local984);
			} else {
				Static16.method277(local99, local614, local618, local75, local79, local86, Static119.anIntArray262[0], Static119.anIntArray262[1], Static119.anIntArray262[2], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], local984);
				Static16.method277(local99, local618, Static119.anIntArray253[3], local75, local86, Static119.anIntArray250[3], Static119.anIntArray262[0], Static119.anIntArray262[2], Static119.anIntArray262[3], Static119.anIntArray269[local709], Static119.anIntArray269[local714], Static119.anIntArray269[local719], Static119.anIntArray252[local709], Static119.anIntArray252[local714], Static119.anIntArray252[local719], Static119.anIntArray270[local709], Static119.anIntArray270[local714], Static119.anIntArray270[local719], local984);
			}
		} else if (this.anIntArray240[arg0] == -1) {
			local709 = Static16.anIntArray25[this.anIntArray235[arg0] & 0xFFFF];
			Static16.method273(local99, local614, local618, local75, local79, local86, local709);
			Static16.method273(local99, local618, Static119.anIntArray253[3], local75, local86, Static119.anIntArray250[3], local709);
		} else {
			Static16.method283(local99, local614, local618, local75, local79, local86, Static119.anIntArray262[0], Static119.anIntArray262[1], Static119.anIntArray262[2]);
			Static16.method283(local99, local618, Static119.anIntArray253[3], local75, local86, Static119.anIntArray250[3], Static119.anIntArray262[0], Static119.anIntArray262[2], Static119.anIntArray262[3]);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!ii;")
	public Class10_Sub4_Sub2 method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean172) {
			this.method1969();
		}
		@Pc(9) int local9 = arg4 + this.aShort29;
		@Pc(14) int local14 = arg4 + this.aShort31;
		@Pc(19) int local19 = arg6 + this.aShort28;
		@Pc(24) int local24 = arg6 + this.aShort30;
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
		@Pc(150) Class10_Sub4_Sub2 local150;
		if (arg7) {
			local150 = new Class10_Sub4_Sub2();
			local150.anInt2224 = this.anInt2224;
			local150.anInt2225 = this.anInt2225;
			local150.anInt2222 = this.anInt2222;
			local150.anInt2223 = this.anInt2223;
			local150.anIntArray243 = this.anIntArray243;
			local150.anIntArray232 = this.anIntArray232;
			local150.anIntArray237 = this.anIntArray237;
			local150.anIntArray235 = this.anIntArray235;
			local150.anIntArray238 = this.anIntArray238;
			local150.anIntArray240 = this.anIntArray240;
			local150.aByteArray27 = this.aByteArray27;
			local150.aByteArray29 = this.aByteArray29;
			local150.aShortArray46 = this.aShortArray46;
			local150.aShortArray47 = this.aShortArray47;
			local150.aByteArray28 = this.aByteArray28;
			local150.aByte12 = this.aByte12;
			local150.anIntArray234 = this.anIntArray234;
			local150.anIntArray236 = this.anIntArray236;
			local150.anIntArray246 = this.anIntArray246;
			local150.anIntArrayArray34 = this.anIntArrayArray34;
			local150.anIntArrayArray33 = this.anIntArrayArray33;
			local150.aShortArray44 = this.aShortArray44;
			local150.aShortArray45 = this.aShortArray45;
			local150.aBoolean171 = this.aBoolean171;
			if (arg0 == 3) {
				local150.anIntArray239 = Static296.method4813(this.anIntArray239);
				local150.anIntArray233 = Static296.method4813(this.anIntArray233);
				local150.anIntArray245 = Static296.method4813(this.anIntArray245);
			} else {
				local150.anIntArray239 = this.anIntArray239;
				local150.anIntArray233 = new int[local150.anInt2224];
				local150.anIntArray245 = this.anIntArray245;
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
			for (local289 = 0; local289 < local150.anInt2225; local289++) {
				local300 = this.anIntArray239[local289] + arg4;
				local307 = this.anIntArray245[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray233[local289] = this.anIntArray233[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt2225; local289 < local150.anInt2224; local289++) {
				local300 = this.anIntArray239[local289] + arg4;
				local307 = this.anIntArray245[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray233[local289] = this.anIntArray233[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt2225; local289++) {
					local300 = (this.anIntArray233[local289] << 16) / this.aShort32;
					if (local300 < arg1) {
						local307 = this.anIntArray239[local289] + arg4;
						local311 = this.anIntArray245[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray233[local289] = this.anIntArray233[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray233[local289] = this.anIntArray233[local289];
					}
				}
				for (local289 = local150.anInt2225; local289 < local150.anInt2224; local289++) {
					local300 = (this.anIntArray233[local289] << 16) / this.aShort32;
					if (local300 < arg1) {
						local307 = this.anIntArray239[local289] + arg4;
						local311 = this.anIntArray245[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray233[local289] = this.anIntArray233[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray233[local289] = this.anIntArray233[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method1948(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort27 - this.aShort32;
				for (local300 = 0; local300 < this.anInt2225; local300++) {
					local307 = this.anIntArray239[local300] + arg4;
					local311 = this.anIntArray245[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray233[local300] = this.anIntArray233[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt2225; local300 < local150.anInt2224; local300++) {
					local307 = this.anIntArray239[local300] + arg4;
					local311 = this.anIntArray245[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray233[local300] = this.anIntArray233[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort27 - this.aShort32;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt2225; local300++) {
					local307 = this.anIntArray239[local300] + arg4;
					local311 = this.anIntArray245[local300] + arg6;
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
					local150.anIntArray233[local300] = ((this.anIntArray233[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt2225; local300 < local150.anInt2224; local300++) {
					local307 = this.anIntArray239[local300] + arg4;
					local311 = this.anIntArray245[local300] + arg6;
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
						local150.anIntArray233[local300] = ((this.anIntArray233[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean172 = false;
		return local150;
	}

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "()V")
	@Override
	protected void method1961() {
		if (this.aBoolean173) {
			this.method1980();
			this.aBoolean173 = false;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZZJIILclient!em;)V")
	private void method1978(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static119.aBoolean175) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray263[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray273[local11] = 0;
			}
			Static119.anInt2226 = 0;
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
		for (local11 = 0; local11 < this.anInt2222; local11++) {
			if (this.anIntArray240[local11] != -2) {
				local51 = this.anIntArray243[local11];
				local56 = this.anIntArray232[local11];
				local61 = this.anIntArray237[local11];
				local65 = Static119.anIntArray258[local51];
				local69 = Static119.anIntArray258[local56];
				local73 = Static119.anIntArray258[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static119.anIntArray269[local51];
					local92 = Static119.anIntArray269[local56];
					local96 = Static119.anIntArray269[local61];
					local100 = Static119.anIntArray252[local51];
					local104 = Static119.anIntArray252[local56];
					local108 = Static119.anIntArray252[local61];
					local112 = Static119.anIntArray270[local51];
					@Pc(116) int local116 = Static119.anIntArray270[local56];
					local120 = Static119.anIntArray270[local61];
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
						Static119.aBooleanArray54[local11] = true;
						if (Static119.aBoolean175) {
							anIntArray266[local5] = (Static119.anIntArray259[local51] + Static119.anIntArray259[local56] + Static119.anIntArray259[local61]) / 3;
							anIntArray256[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static119.anIntArray259[local51] + Static119.anIntArray259[local56] + Static119.anIntArray259[local61]) / 3 + arg3;
							if (anIntArray263[local224] < 64) {
								anIntArrayArray37[local224][anIntArray263[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray263[local224];
								if (local247 == 64) {
									if (Static119.anInt2226 == 512) {
										continue;
									}
									anIntArray263[local224] = local247 = Static119.anInt2226++ + 65;
								}
								local247 -= 65;
								anIntArrayArray35[local247][anIntArray273[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method1977(Static177.anInt3290 + Static16.anInt325, Static186.anInt3681 + Static16.anInt324, Static119.anIntArray260[local51], Static119.anIntArray260[local56], Static119.anIntArray260[local61], local65, local69, local73)) {
						Static88.aLongArray4[Static120.anInt2259++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static119.anIntArray260[local61] - Static119.anIntArray260[local56]) - (Static119.anIntArray260[local51] - Static119.anIntArray260[local56]) * (local73 - local69) > 0) {
						Static119.aBooleanArray54[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static16.anInt322 && local69 <= Static16.anInt322 && local73 <= Static16.anInt322) {
							Static119.aBooleanArray55[local11] = false;
						} else {
							Static119.aBooleanArray55[local11] = true;
						}
						if (Static119.aBoolean175) {
							anIntArray266[local5] = (Static119.anIntArray259[local51] + Static119.anIntArray259[local56] + Static119.anIntArray259[local61]) / 3;
							anIntArray256[local5++] = local11;
						} else {
							local88 = (Static119.anIntArray259[local51] + Static119.anIntArray259[local56] + Static119.anIntArray259[local61]) / 3 + arg3;
							if (anIntArray263[local88] < 64) {
								anIntArrayArray37[local88][anIntArray263[local88]++] = local11;
							} else {
								local92 = anIntArray263[local88];
								if (local92 == 64) {
									if (Static119.anInt2226 == 512) {
										continue;
									}
									anIntArray263[local88] = local92 = Static119.anInt2226++ + 65;
								}
								local92 -= 65;
								anIntArrayArray35[local92][anIntArray273[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static119.aBoolean175) {
			for (local11 = 0; local11 < Static119.anIntArray255.length; local11++) {
				local51 = Static119.anIntArray255[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray263[local51] < 64) {
						anIntArrayArray37[local51][anIntArray263[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray263[local51];
						if (local56 == 64) {
							if (Static119.anInt2226 == 512) {
								continue;
							}
							anIntArray263[local51] = local56 = Static119.anInt2226++ + 65;
						}
						local56 -= 65;
						anIntArrayArray35[local56][anIntArray273[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static119.aBoolean175) {
			Static81.method1253(0, local5 - 1, anIntArray256, anIntArray266);
			if (this.aByteArray27 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method1968(anIntArray256[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static119.anIntArray251[local11] = 0;
				Static119.anIntArray267[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray256[local11];
				local56 = anIntArray266[local11];
				@Pc(610) byte local610 = this.aByteArray27[local51];
				local65 = Static119.anIntArray251[local610]++;
				Static119.anIntArrayArray36[local610][local65] = local51;
				if (local610 < 10) {
					Static119.anIntArray267[local610] += local56;
				} else if (local610 == 10) {
					Static119.anIntArray254[local65] = local56;
				} else {
					Static119.anIntArray271[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray27 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray263[local11];
					@Pc(706) Class47_Sub2_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray37[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method1968(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass47_Sub2_Sub1Array1[local73];
								local92 = Static119.anIntArray272[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static143.method2450(Static119.anIntArray257[local73], Static119.anIntArray264[local73], (local706.aClass47_Sub3_1.aClass164_1.anInt5303 << 16) / local92, local706.anInt5553, local706.anInt5553 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray263[local11] - 64 - 1;
						local677 = anIntArrayArray35[local56];
						for (local65 = 0; local65 < anIntArray273[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method1968(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass47_Sub2_Sub1Array1[local73];
								local92 = Static119.anIntArray272[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static143.method2450(Static119.anIntArray257[local73], Static119.anIntArray264[local73], (local706.aClass47_Sub3_1.aClass164_1.anInt5303 << 16) / local92, local706.anInt5553, local706.anInt5553 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static119.anIntArray251[local11] = 0;
				Static119.anIntArray267[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray263[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray37[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray27[local69];
							local88 = Static119.anIntArray251[local881]++;
							Static119.anIntArrayArray36[local881][local88] = local69;
							if (local881 < 10) {
								Static119.anIntArray267[local881] += local11;
							} else if (local881 == 10) {
								Static119.anIntArray254[local88] = local11;
							} else {
								Static119.anIntArray271[local88] = local11;
							}
						} else {
							Static119.anIntArray261[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray263[local11] - 64 - 1;
					local677 = anIntArrayArray35[local56];
					for (local65 = 0; local65 < anIntArray273[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray27[local69];
							local88 = Static119.anIntArray251[local881]++;
							Static119.anIntArrayArray36[local881][local88] = local69;
							if (local881 < 10) {
								Static119.anIntArray267[local881] += local11;
							} else if (local881 == 10) {
								Static119.anIntArray254[local88] = local11;
							} else {
								Static119.anIntArray271[local88] = local11;
							}
						} else {
							Static119.anIntArray261[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static119.anIntArray251[1] > 0 || Static119.anIntArray251[2] > 0) {
			local11 = (Static119.anIntArray267[1] + Static119.anIntArray267[2]) / (Static119.anIntArray251[1] + Static119.anIntArray251[2]);
		}
		local51 = 0;
		if (Static119.anIntArray251[3] > 0 || Static119.anIntArray251[4] > 0) {
			local51 = (Static119.anIntArray267[3] + Static119.anIntArray267[4]) / (Static119.anIntArray251[3] + Static119.anIntArray251[4]);
		}
		local56 = 0;
		if (Static119.anIntArray251[6] > 0 || Static119.anIntArray251[8] > 0) {
			local56 = (Static119.anIntArray267[6] + Static119.anIntArray267[8]) / (Static119.anIntArray251[6] + Static119.anIntArray251[8]);
		}
		local65 = 0;
		local69 = Static119.anIntArray251[10];
		@Pc(1105) int[] local1105 = Static119.anIntArrayArray36[10];
		@Pc(1107) int[] local1107 = Static119.anIntArray254;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static119.anIntArray251[11];
			local1105 = Static119.anIntArrayArray36[11];
			local1107 = Static119.anIntArray271;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method1968(local1105[local65++]);
				if (local65 == local69 && local1105 != Static119.anIntArrayArray36[11]) {
					local65 = 0;
					local69 = Static119.anIntArray251[11];
					local1105 = Static119.anIntArrayArray36[11];
					local1107 = Static119.anIntArray271;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method1968(local1105[local65++]);
				if (local65 == local69 && local1105 != Static119.anIntArrayArray36[11]) {
					local65 = 0;
					local69 = Static119.anIntArray251[11];
					local1105 = Static119.anIntArrayArray36[11];
					local1107 = Static119.anIntArray271;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method1968(local1105[local65++]);
				if (local65 == local69 && local1105 != Static119.anIntArrayArray36[11]) {
					local65 = 0;
					local69 = Static119.anIntArray251[11];
					local1105 = Static119.anIntArrayArray36[11];
					local1107 = Static119.anIntArray271;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static119.anIntArray251[local96];
			@Pc(1275) int[] local1275 = Static119.anIntArrayArray36[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static119.anIntArray267[local96] / local100;
				}
				for (local112 = Static119.anIntArray261[local92]; Static119.anIntArray255[local112] + arg3 > local108; local112 = Static119.anIntArray261[local92++]) {
					@Pc(1303) Class47_Sub2_Sub1 local1303 = arg5.aClass47_Sub2_Sub1Array1[local112];
					local120 = Static119.anIntArray272[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static143.method2450(Static119.anIntArray257[local112], Static119.anIntArray264[local112], (local1303.aClass47_Sub3_1.aClass164_1.anInt5303 << 16) / local120, local1303.anInt5553, local1303.anInt5553 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method1968(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method1968(local1105[local65++]);
			if (local65 == local69 && local1105 != Static119.anIntArrayArray36[11]) {
				local65 = 0;
				local1105 = Static119.anIntArrayArray36[11];
				local69 = Static119.anIntArray251[11];
				local1107 = Static119.anIntArray271;
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
		local96 = Static119.anIntArray261[local92];
		while (local92 < local7) {
			@Pc(1413) Class47_Sub2_Sub1 local1413 = arg5.aClass47_Sub2_Sub1Array1[local96];
			local104 = Static119.anIntArray272[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static143.method2450(Static119.anIntArray257[local96], Static119.anIntArray264[local96], (local1413.aClass47_Sub3_1.aClass164_1.anInt5303 << 16) / local104, local1413.anInt5553, local1413.anInt5553 >> 24 & 0xFF);
			local96 = Static119.anIntArray261[local92++];
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()I")
	@Override
	public int method1937() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method1939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean172) {
				this.method1969();
			}
			@Pc(6) int local6 = Static16.anInt325;
			@Pc(8) int local8 = Static16.anInt324;
			@Pc(12) int local12 = Class11.anIntArray26[0];
			@Pc(16) int local16 = Class11.anIntArray27[0];
			@Pc(20) int local20 = Class11.anIntArray26[arg0];
			@Pc(24) int local24 = Class11.anIntArray27[arg0];
			@Pc(28) int local28 = Class11.anIntArray26[arg1];
			@Pc(32) int local32 = Class11.anIntArray27[arg1];
			@Pc(36) int local36 = Class11.anIntArray26[arg2];
			@Pc(40) int local40 = Class11.anIntArray27[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2224; local52++) {
				@Pc(61) int local61 = this.anIntArray239[local52];
				@Pc(66) int local66 = this.anIntArray233[local52];
				@Pc(71) int local71 = this.anIntArray245[local52];
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
				Static119.anIntArray259[local52] = local71 - local50;
				Static119.anIntArray258[local52] = local6 + (local61 << 9) / local71;
				Static119.anIntArray260[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt2223 > 0) {
					Static119.anIntArray269[local52] = local61;
					Static119.anIntArray252[local52] = local83;
					Static119.anIntArray270[local52] = local71;
				}
			}
			this.method1978(false, arg6 >= 0L, arg6, this.aShort26, this.aShort26 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "()I")
	@Override
	public int method1955() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "()I")
	@Override
	public int method1943() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZZZ)Lclient!hm;")
	@Override
	public Class10_Sub4 method1953(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static119.aByteArray32.length < this.anInt2222) {
			Static119.aByteArray32 = new byte[this.anInt2222 + 100];
		}
		if (!arg1 && Static119.aShortArray50.length < this.anInt2222) {
			Static119.anIntArray265 = new int[this.anInt2222 + 100];
			Static119.anIntArray268 = new int[this.anInt2222 + 100];
			Static119.anIntArray274 = new int[this.anInt2222 + 100];
			Static119.aShortArray50 = new short[this.anInt2222 + 100];
		}
		return this.method1967(arg0, arg1, Static119.aClass10_Sub4_Sub2_3, Static119.aByteArray32, Static119.aShortArray50, Static119.anIntArray265, Static119.anIntArray268, Static119.anIntArray274);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()I")
	@Override
	public int method1938() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "()V")
	private void method1980() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2222; local1++) {
			@Pc(15) short local15 = this.aShortArray46 == null ? -1 : this.aShortArray46[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray47[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray240[local1] == -1) {
					local38 = this.anIntArray235[local1] & 0xFFFE0000;
					this.anIntArray235[local1] = local38 | Static119.method1972(local25, local38 >> 17);
				} else if (this.anIntArray240[local1] != -2) {
					local38 = this.anIntArray235[local1] & 0xFFFE0000;
					this.anIntArray235[local1] = local38 | Static119.method1972(local25, local38 >> 17);
					local38 = this.anIntArray238[local1] & 0xFFFE0000;
					this.anIntArray238[local1] = local38 | Static119.method1972(local25, local38 >> 17);
					local38 = this.anIntArray240[local1] & 0xFFFE0000;
					this.anIntArray240[local1] = local38 | Static119.method1972(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "()V")
	@Override
	public void method1956() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2224; local1++) {
			@Pc(10) int local10 = this.anIntArray245[local1];
			this.anIntArray245[local1] = this.anIntArray239[local1];
			this.anIntArray239[local1] = -local10;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(ZZZ)Lclient!hm;")
	@Override
	public Class10_Sub4 method1962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static119.aByteArray31.length < this.anInt2222) {
			Static119.aByteArray31 = new byte[this.anInt2222 + 100];
		}
		if (!arg1 && Static119.aShortArray49.length < this.anInt2222) {
			Static119.anIntArray248 = new int[this.anInt2222 + 100];
			Static119.anIntArray247 = new int[this.anInt2222 + 100];
			Static119.anIntArray249 = new int[this.anInt2222 + 100];
			Static119.aShortArray49 = new short[this.anInt2222 + 100];
		}
		return this.method1967(arg0, arg1, Static119.aClass10_Sub4_Sub2_2, Static119.aByteArray31, Static119.aShortArray49, Static119.anIntArray248, Static119.anIntArray247, Static119.anIntArray249);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(ZZZ)Lclient!hm;")
	@Override
	public Class10_Sub4 method1965(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static119.aByteArray30.length < this.anInt2222) {
			Static119.aByteArray30 = new byte[this.anInt2222 + 100];
		}
		if (!arg1 && Static119.aShortArray48.length < this.anInt2222) {
			Static119.anIntArray244 = new int[this.anInt2222 + 100];
			Static119.anIntArray242 = new int[this.anInt2222 + 100];
			Static119.anIntArray241 = new int[this.anInt2222 + 100];
			Static119.aShortArray48 = new short[this.anInt2222 + 100];
		}
		return this.method1967(arg0, arg1, Static119.aClass10_Sub4_Sub2_1, Static119.aByteArray30, Static119.aShortArray48, Static119.anIntArray244, Static119.anIntArray242, Static119.anIntArray241);
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	@Override
	public void method1958(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class11.anIntArray26[arg0];
		@Pc(7) int local7 = Class11.anIntArray27[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2224; local9++) {
			@Pc(29) int local29 = this.anIntArray233[local9] * local7 - this.anIntArray245[local9] * local3 >> 16;
			this.anIntArray245[local9] = this.anIntArray233[local9] * local3 + this.anIntArray245[local9] * local7 >> 16;
			this.anIntArray233[local9] = local29;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "()I")
	@Override
	public int method1951() {
		if (!this.aBoolean172) {
			this.method1969();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "()V")
	@Override
	public void method1942() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2224; local1++) {
			this.anIntArray239[local1] = -this.anIntArray239[local1];
			this.anIntArray245[local1] = -this.anIntArray245[local1];
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	@Override
	public void method1940(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class11.anIntArray26[arg0];
		@Pc(7) int local7 = Class11.anIntArray27[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2224; local9++) {
			@Pc(29) int local29 = this.anIntArray245[local9] * local3 + this.anIntArray239[local9] * local7 >> 16;
			this.anIntArray245[local9] = this.anIntArray245[local9] * local7 - this.anIntArray239[local9] * local3 >> 16;
			this.anIntArray239[local9] = local29;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
	@Override
	protected void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static119.anInt2228 = 0;
			Static119.anInt2229 = 0;
			Static119.anInt2227 = 0;
			for (local11 = 0; local11 < this.anInt2224; local11++) {
				Static119.anInt2228 += this.anIntArray239[local11];
				Static119.anInt2229 += this.anIntArray233[local11];
				Static119.anInt2227 += this.anIntArray245[local11];
				local3++;
			}
			if (local3 > 0) {
				Static119.anInt2228 = Static119.anInt2228 / local3 + arg1;
				Static119.anInt2229 = Static119.anInt2229 / local3 + arg2;
				Static119.anInt2227 = Static119.anInt2227 / local3 + arg3;
			} else {
				Static119.anInt2228 = arg1;
				Static119.anInt2229 = arg2;
				Static119.anInt2227 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt2224; local3++) {
				this.anIntArray239[local3] += arg1;
				this.anIntArray233[local3] += arg2;
				this.anIntArray245[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt2224; local3++) {
					this.anIntArray239[local3] -= Static119.anInt2228;
					this.anIntArray233[local3] -= Static119.anInt2229;
					this.anIntArray245[local3] -= Static119.anInt2227;
					if (arg3 != 0) {
						local11 = Class11.anIntArray26[arg3];
						local146 = Class11.anIntArray27[arg3];
						local164 = this.anIntArray233[local3] * local11 + this.anIntArray239[local3] * local146 + 32767 >> 16;
						this.anIntArray233[local3] = this.anIntArray233[local3] * local146 + 32767 - this.anIntArray239[local3] * local11 >> 16;
						this.anIntArray239[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class11.anIntArray26[arg1];
						local146 = Class11.anIntArray27[arg1];
						local164 = this.anIntArray233[local3] * local146 + 32767 - this.anIntArray245[local3] * local11 >> 16;
						this.anIntArray245[local3] = this.anIntArray233[local3] * local11 + this.anIntArray245[local3] * local146 + 32767 >> 16;
						this.anIntArray233[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class11.anIntArray26[arg2];
						local146 = Class11.anIntArray27[arg2];
						local164 = this.anIntArray245[local3] * local11 + this.anIntArray239[local3] * local146 + 32767 >> 16;
						this.anIntArray245[local3] = this.anIntArray245[local3] * local146 + 32767 - this.anIntArray239[local3] * local11 >> 16;
						this.anIntArray239[local3] = local164;
					}
					this.anIntArray239[local3] += Static119.anInt2228;
					this.anIntArray233[local3] += Static119.anInt2229;
					this.anIntArray245[local3] += Static119.anInt2227;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt2224; local3++) {
					this.anIntArray239[local3] -= Static119.anInt2228;
					this.anIntArray233[local3] -= Static119.anInt2229;
					this.anIntArray245[local3] -= Static119.anInt2227;
					this.anIntArray239[local3] = this.anIntArray239[local3] * arg1 / 128;
					this.anIntArray233[local3] = this.anIntArray233[local3] * arg2 / 128;
					this.anIntArray245[local3] = this.anIntArray245[local3] * arg3 / 128;
					this.anIntArray239[local3] += Static119.anInt2228;
					this.anIntArray233[local3] += Static119.anInt2229;
					this.anIntArray245[local3] += Static119.anInt2227;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt2222; local3++) {
					local11 = (this.aByteArray28[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray28[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt2222; local3++) {
					local11 = this.aShortArray47[local3] & 0xFFFF;
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
					this.aShortArray47[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean173 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	@Override
	public void method1947(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class11.anIntArray26[arg0];
		@Pc(7) int local7 = Class11.anIntArray27[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2224; local9++) {
			@Pc(29) int local29 = this.anIntArray233[local9] * local3 + this.anIntArray239[local9] * local7 >> 16;
			this.anIntArray233[local9] = this.anIntArray233[local9] * local7 - this.anIntArray239[local9] * local3 >> 16;
			this.anIntArray239[local9] = local29;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	@Override
	public void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2224; local1++) {
			this.anIntArray239[local1] = this.anIntArray239[local1] * arg0 / 128;
			this.anIntArray233[local1] = this.anIntArray233[local1] * arg1 / 128;
			this.anIntArray245[local1] = this.anIntArray245[local1] * arg2 / 128;
		}
		this.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static119.anInt2228 = 0;
			Static119.anInt2229 = 0;
			Static119.anInt2227 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray34.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray34[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static119.anInt2228 += this.anIntArray239[local41];
						Static119.anInt2229 += this.anIntArray233[local41];
						Static119.anInt2227 += this.anIntArray245[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static119.anInt2228 = Static119.anInt2228 / local6 + arg2;
				Static119.anInt2229 = Static119.anInt2229 / local6 + arg3;
				Static119.anInt2227 = Static119.anInt2227 / local6 + arg4;
			} else {
				Static119.anInt2228 = arg2;
				Static119.anInt2229 = arg3;
				Static119.anInt2227 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray34.length) {
					local117 = this.anIntArrayArray34[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray239[local33] += arg2;
						this.anIntArray233[local33] += arg3;
						this.anIntArray245[local33] += arg4;
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
				if (local14 < this.anIntArrayArray34.length) {
					local117 = this.anIntArrayArray34[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray239[local33] -= Static119.anInt2228;
						this.anIntArray233[local33] -= Static119.anInt2229;
						this.anIntArray245[local33] -= Static119.anInt2227;
						if (arg4 != 0) {
							local41 = Class11.anIntArray26[arg4];
							local222 = Class11.anIntArray27[arg4];
							local240 = this.anIntArray233[local33] * local41 + this.anIntArray239[local33] * local222 + 32767 >> 16;
							this.anIntArray233[local33] = this.anIntArray233[local33] * local222 + 32767 - this.anIntArray239[local33] * local41 >> 16;
							this.anIntArray239[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class11.anIntArray26[arg2];
							local222 = Class11.anIntArray27[arg2];
							local240 = this.anIntArray233[local33] * local222 + 32767 - this.anIntArray245[local33] * local41 >> 16;
							this.anIntArray245[local33] = this.anIntArray233[local33] * local41 + this.anIntArray245[local33] * local222 + 32767 >> 16;
							this.anIntArray233[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class11.anIntArray26[arg3];
							local222 = Class11.anIntArray27[arg3];
							local240 = this.anIntArray245[local33] * local41 + this.anIntArray239[local33] * local222 + 32767 >> 16;
							this.anIntArray245[local33] = this.anIntArray245[local33] * local222 + 32767 - this.anIntArray239[local33] * local41 >> 16;
							this.anIntArray239[local33] = local240;
						}
						this.anIntArray239[local33] += Static119.anInt2228;
						this.anIntArray233[local33] += Static119.anInt2229;
						this.anIntArray245[local33] += Static119.anInt2227;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray34.length) {
					local117 = this.anIntArrayArray34[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray239[local33] -= Static119.anInt2228;
						this.anIntArray233[local33] -= Static119.anInt2229;
						this.anIntArray245[local33] -= Static119.anInt2227;
						this.anIntArray239[local33] = this.anIntArray239[local33] * arg2 / 128;
						this.anIntArray233[local33] = this.anIntArray233[local33] * arg3 / 128;
						this.anIntArray245[local33] = this.anIntArray245[local33] * arg4 / 128;
						this.anIntArray239[local33] += Static119.anInt2228;
						this.anIntArray233[local33] += Static119.anInt2229;
						this.anIntArray245[local33] += Static119.anInt2227;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray33 != null && this.aByteArray28 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray33.length) {
						local117 = this.anIntArrayArray33[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray28[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray28[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray33 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray33.length) {
					local117 = this.anIntArrayArray33[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray47[local33] & 0xFFFF;
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
						this.aShortArray47[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean173 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIIIII)V")
	public void method1981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean172) {
				this.method1969();
			}
			@Pc(6) int local6 = Static16.anInt325;
			@Pc(8) int local8 = Static16.anInt324;
			@Pc(12) int local12 = Class11.anIntArray26[0];
			@Pc(16) int local16 = Class11.anIntArray27[0];
			@Pc(20) int local20 = Class11.anIntArray26[arg0];
			@Pc(24) int local24 = Class11.anIntArray27[arg0];
			@Pc(28) int local28 = Class11.anIntArray26[arg1];
			@Pc(32) int local32 = Class11.anIntArray27[arg1];
			@Pc(36) int local36 = Class11.anIntArray26[arg2];
			@Pc(40) int local40 = Class11.anIntArray27[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2224; local52++) {
				@Pc(61) int local61 = this.anIntArray239[local52];
				@Pc(66) int local66 = this.anIntArray233[local52];
				@Pc(71) int local71 = this.anIntArray245[local52];
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
				Static119.anIntArray259[local52] = local71 - local50;
				Static119.anIntArray258[local52] = local6 + (local61 << 9) / arg6;
				Static119.anIntArray260[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt2223 > 0) {
					Static119.anIntArray269[local52] = local61;
					Static119.anIntArray252[local52] = local83;
					Static119.anIntArray270[local52] = local71;
				}
			}
			this.method1978(false, false, 0L, this.aShort26, this.aShort26 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}
}
