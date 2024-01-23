import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class22_Sub4_Sub2 extends Class22_Sub4 {

	@OriginalMember(owner = "client!qi", name = "nb", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!qi", name = "Fb", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!qi", name = "Ab", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!qi", name = "Ub", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!qi", name = "Lb", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!qi", name = "Ob", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[Lclient!fd;")
	public Class49[] aClass49Array2;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "[Lclient!bb;")
	public Class15[] aClass15Array2;

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!qi", name = "W", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!qi", name = "ab", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!qi", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
	private int anInt4460 = 0;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	private int anInt4459 = 0;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
	private int anInt4461 = 0;

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "Z")
	private boolean aBoolean317 = false;

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
	public int anInt4462 = 0;

	static {
		if (Static227.aBoolean319) {
			anIntArray394 = new int[4096];
			anIntArray407 = new int[4096];
		} else {
			anIntArray402 = new int[1600];
			anIntArrayArray35 = new int[1600][64];
			anIntArray411 = new int[32];
			anIntArrayArray34 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class22_Sub4_Sub2() {
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!tk;IIIII)V")
	public Class22_Sub4_Sub2(@OriginalArg(0) Class22_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method4089();
		arg0.method4086();
		this.anInt4462 = arg0.anInt5254;
		this.anInt4459 = arg0.anInt5258;
		this.anIntArray385 = arg0.anIntArray483;
		this.anIntArray382 = arg0.anIntArray486;
		this.anIntArray379 = arg0.anIntArray475;
		this.anInt4460 = arg0.anInt5257;
		this.anIntArray381 = arg0.anIntArray478;
		this.anIntArray383 = arg0.anIntArray482;
		this.anIntArray376 = arg0.anIntArray480;
		this.aByteArray50 = arg0.aByteArray59;
		this.aByteArray49 = arg0.aByteArray58;
		this.aByte25 = arg0.aByte28;
		this.aShortArray63 = arg0.aShortArray83;
		this.anIntArrayArray32 = arg0.anIntArrayArray43;
		this.anIntArrayArray31 = arg0.anIntArrayArray42;
		this.aShortArray64 = arg0.aShortArray85;
		this.aClass49Array2 = arg0.aClass49Array3;
		this.aClass15Array2 = arg0.aClass15Array3;
		this.aShortArray67 = arg0.aShortArray88;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray378 = new int[this.anInt4460];
		this.anIntArray374 = new int[this.anInt4460];
		this.anIntArray375 = new int[this.anInt4460];
		@Pc(148) int local148;
		if (arg0.aShortArray82 == null) {
			this.aShortArray65 = null;
		} else {
			this.aShortArray65 = new short[this.anInt4460];
			for (local148 = 0; local148 < this.anInt4460; local148++) {
				@Pc(157) short local157 = arg0.aShortArray82[local148];
				if (local157 != -1 && Static18.anInterface1_1.method1629(local157)) {
					this.aShortArray65[local148] = local157;
				} else {
					this.aShortArray65[local148] = -1;
				}
			}
		}
		if (arg0.anInt5255 > 0 && arg0.aByteArray62 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt5255];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt4460; local194++) {
				if (arg0.aByteArray62[local194] != -1) {
					local192[arg0.aByteArray62[local194] & 0xFF]++;
				}
			}
			this.anInt4461 = 0;
			for (local194 = 0; local194 < arg0.anInt5255; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray64[local194] == 0) {
					this.anInt4461++;
				}
			}
			this.anIntArray384 = new int[this.anInt4461];
			this.anIntArray377 = new int[this.anInt4461];
			this.anIntArray380 = new int[this.anInt4461];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt5255; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray64[local263] == 0) {
					this.anIntArray384[local194] = arg0.aShortArray89[local263] & 0xFFFF;
					this.anIntArray377[local194] = arg0.aShortArray84[local263] & 0xFFFF;
					this.anIntArray380[local194] = arg0.aShortArray80[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray48 = new byte[this.anInt4460];
			for (local263 = 0; local263 < this.anInt4460; local263++) {
				if (arg0.aByteArray62[local263] == -1) {
					this.aByteArray48[local263] = -1;
				} else {
					this.aByteArray48[local263] = (byte) local192[arg0.aByteArray62[local263] & 0xFF];
					if (this.aByteArray48[local263] == -1 && this.aShortArray65 != null) {
						this.aShortArray65[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt4460; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray60 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray60[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray58 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray58[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray65 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray65[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class98 local450;
			@Pc(483) int local483;
			@Pc(629) Class25 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray83[local148] & 0xFFFF;
					if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray381[local148]] == null) {
						local450 = arg0.aClass98Array2[this.anIntArray381[local148]];
					} else {
						local450 = arg0.aClass98Array1[this.anIntArray381[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721) << 17;
					this.anIntArray378[local148] = local483 | Static227.method3595(local431, local483 >> 17);
					if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray383[local148]] == null) {
						local450 = arg0.aClass98Array2[this.anIntArray383[local148]];
					} else {
						local450 = arg0.aClass98Array1[this.anIntArray383[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721) << 17;
					this.anIntArray374[local148] = local483 | Static227.method3595(local431, local483 >> 17);
					if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray376[local148]] == null) {
						local450 = arg0.aClass98Array2[this.anIntArray376[local148]];
					} else {
						local450 = arg0.aClass98Array1[this.anIntArray376[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721) << 17;
					this.anIntArray375[local148] = local483 | Static227.method3595(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass25Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt507 + arg4 * local629.anInt504 + arg5 * local629.anInt501) / (local123 + local123 / 2) << 17;
					this.anIntArray378[local148] = local483 | Static227.method3595(arg0.aShortArray83[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray375[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray378[local148] = 128;
					this.anIntArray375[local148] = -1;
				} else {
					this.anIntArray375[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray381[local148]] == null) {
					local450 = arg0.aClass98Array2[this.anIntArray381[local148]];
				} else {
					local450 = arg0.aClass98Array1[this.anIntArray381[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721);
				this.anIntArray378[local148] = Static227.method3583(local483);
				if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray383[local148]] == null) {
					local450 = arg0.aClass98Array2[this.anIntArray383[local148]];
				} else {
					local450 = arg0.aClass98Array1[this.anIntArray383[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721);
				this.anIntArray374[local148] = Static227.method3583(local483);
				if (arg0.aClass98Array1 == null || arg0.aClass98Array1[this.anIntArray376[local148]] == null) {
					local450 = arg0.aClass98Array2[this.anIntArray376[local148]];
				} else {
					local450 = arg0.aClass98Array1[this.anIntArray376[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt2727 + arg4 * local450.anInt2723 + arg5 * local450.anInt2728) / (local123 * local450.anInt2721);
				this.anIntArray375[local148] = Static227.method3583(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass25Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt507 + arg4 * local629.anInt504 + arg5 * local629.anInt501) / (local123 + local123 / 2);
				this.anIntArray378[local148] = Static227.method3583(local483);
				this.anIntArray375[local148] = -1;
			} else {
				this.anIntArray375[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([Lclient!qi;I)V")
	private Class22_Sub4_Sub2(@OriginalArg(0) Class22_Sub4_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt4462 = 0;
		this.anInt4460 = 0;
		this.anInt4461 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte25 = -1;
		@Pc(48) int local48;
		@Pc(55) Class22_Sub4_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt4462 += local55.anInt4462;
				this.anInt4460 += local55.anInt4460;
				this.anInt4461 += local55.anInt4461;
				if (local55.aByteArray50 == null) {
					if (this.aByte25 == -1) {
						this.aByte25 = local55.aByte25;
					}
					if (this.aByte25 != local55.aByte25) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray49 != null;
				local28 |= local55.aShortArray65 != null;
				local30 |= local55.aByteArray48 != null;
				if (local55.aClass49Array2 != null) {
					local41 += local55.aClass49Array2.length;
				}
				if (local55.aClass15Array2 != null) {
					local43 += local55.aClass15Array2.length;
				}
			}
		}
		this.anIntArray385 = new int[this.anInt4462];
		this.anIntArray382 = new int[this.anInt4462];
		this.anIntArray379 = new int[this.anInt4462];
		this.anIntArray381 = new int[this.anInt4460];
		this.anIntArray383 = new int[this.anInt4460];
		this.anIntArray376 = new int[this.anInt4460];
		this.anIntArray378 = new int[this.anInt4460];
		this.anIntArray374 = new int[this.anInt4460];
		this.anIntArray375 = new int[this.anInt4460];
		if (local24) {
			this.aByteArray50 = new byte[this.anInt4460];
		}
		if (local26) {
			this.aByteArray49 = new byte[this.anInt4460];
		}
		if (local28) {
			this.aShortArray65 = new short[this.anInt4460];
		}
		if (local30) {
			this.aByteArray48 = new byte[this.anInt4460];
		}
		if (this.anInt4461 > 0) {
			this.anIntArray384 = new int[this.anInt4461];
			this.anIntArray377 = new int[this.anInt4461];
			this.anIntArray380 = new int[this.anInt4461];
		}
		if (local41 > 0) {
			this.aClass49Array2 = new Class49[local41];
		}
		if (local43 > 0) {
			this.aClass15Array2 = new Class15[local43];
		}
		this.aShortArray63 = new short[this.anInt4460];
		this.anInt4462 = 0;
		this.anInt4460 = 0;
		this.anInt4461 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt4460; local280++) {
					this.anIntArray381[this.anInt4460] = local55.anIntArray381[local280] + this.anInt4462;
					this.anIntArray383[this.anInt4460] = local55.anIntArray383[local280] + this.anInt4462;
					this.anIntArray376[this.anInt4460] = local55.anIntArray376[local280] + this.anInt4462;
					this.anIntArray378[this.anInt4460] = local55.anIntArray378[local280];
					this.anIntArray374[this.anInt4460] = local55.anIntArray374[local280];
					this.anIntArray375[this.anInt4460] = local55.anIntArray375[local280];
					this.aShortArray63[this.anInt4460] = local55.aShortArray63[local280];
					if (local24) {
						if (local55.aByteArray50 == null) {
							this.aByteArray50[this.anInt4460] = local55.aByte25;
						} else {
							this.aByteArray50[this.anInt4460] = local55.aByteArray50[local280];
						}
					}
					if (local26 && local55.aByteArray49 != null) {
						this.aByteArray49[this.anInt4460] = local55.aByteArray49[local280];
					}
					if (local28) {
						if (local55.aShortArray65 == null) {
							this.aShortArray65[this.anInt4460] = -1;
						} else {
							this.aShortArray65[this.anInt4460] = local55.aShortArray65[local280];
						}
					}
					if (local30) {
						this.aByteArray48[this.anInt4460] = (byte) (local55.aByteArray48 == null || local55.aByteArray48[local280] == -1 ? -1 : local55.aByteArray48[local280] + this.anInt4461);
					}
					this.anInt4460++;
				}
				if (local55.aClass49Array2 != null) {
					for (local280 = 0; local280 < local55.aClass49Array2.length; local280++) {
						this.aClass49Array2[local41] = new Class49(local55.aClass49Array2[local280].aClass148_1, local55.aClass49Array2[local280].anInt1368 + this.anInt4462, local55.aClass49Array2[local280].anInt1367 + this.anInt4462, local55.aClass49Array2[local280].anInt1370 + this.anInt4462);
						local41++;
					}
				}
				if (local55.aClass15Array2 != null) {
					for (local280 = 0; local280 < local55.aClass15Array2.length; local280++) {
						this.aClass15Array2[local43] = new Class15(local55.aClass15Array2[local280].aClass23_1, local55.aClass15Array2[local280].anInt237 + this.anInt4462);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt4461; local280++) {
					if (local55.anIntArray384[local280] < local55.anInt4459) {
						this.anIntArray384[this.anInt4461] = local55.anIntArray384[local280] + this.anInt4462;
					}
					if (local55.anIntArray377[local280] < local55.anInt4459) {
						this.anIntArray377[this.anInt4461] = local55.anIntArray377[local280] + this.anInt4462;
					}
					if (local55.anIntArray380[local280] < local55.anInt4459) {
						this.anIntArray380[this.anInt4461] = local55.anIntArray380[local280] + this.anInt4462;
					}
					this.anInt4461++;
				}
				for (local280 = 0; local280 < local55.anInt4459; local280++) {
					this.anIntArray385[this.anInt4462] = local55.anIntArray385[local280];
					this.anIntArray382[this.anInt4462] = local55.anIntArray382[local280];
					this.anIntArray379[this.anInt4462] = local55.anIntArray379[local280];
					this.anInt4462++;
				}
			}
		}
		local48 = 0;
		this.anInt4459 = this.anInt4462;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class22_Sub4_Sub2 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt4461; local662++) {
					if (local658.anIntArray384[local662] >= local658.anInt4459) {
						this.anIntArray384[local48] = local658.anIntArray384[local662] + this.anInt4462 - local658.anInt4459;
					}
					if (local658.anIntArray377[local662] >= local658.anInt4459) {
						this.anIntArray377[local48] = local658.anIntArray377[local662] + this.anInt4462 - local658.anInt4459;
					}
					if (local658.anIntArray380[local662] >= local658.anInt4459) {
						this.anIntArray380[local48] = local658.anIntArray380[local662] + this.anInt4462 - local658.anInt4459;
					}
					local48++;
				}
				for (local662 = local658.anInt4459; local662 < local658.anInt4462; local662++) {
					this.anIntArray385[this.anInt4462] = local658.anIntArray385[local662];
					this.anIntArray382[this.anInt4462] = local658.anIntArray382[local662];
					this.anIntArray379[this.anInt4462] = local658.anIntArray379[local662];
					this.anInt4462++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	private void method3581(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static18.anInt303;
		@Pc(3) int local3 = Static18.anInt302;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray381[arg0];
		@Pc(15) int local15 = this.anIntArray383[arg0];
		@Pc(20) int local20 = this.anIntArray376[arg0];
		@Pc(24) int local24 = Static227.anIntArray414[local10];
		@Pc(28) int local28 = Static227.anIntArray414[local15];
		@Pc(32) int local32 = Static227.anIntArray414[local20];
		if (this.aByteArray49 == null) {
			Static18.anInt301 = 0;
		} else {
			Static18.anInt301 = this.aByteArray49[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static227.anIntArray396[0] = Static227.anIntArray399[local10];
			Static227.anIntArray401[0] = Static227.anIntArray406[local10];
			local5++;
			Static227.anIntArray395[0] = this.anIntArray378[arg0] & 0xFFFF;
		} else {
			local75 = Static227.anIntArray393[local10];
			local79 = Static227.anIntArray416[local10];
			local86 = this.anIntArray378[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class17.anIntArray23[local32 - local24];
				Static227.anIntArray396[0] = local1 + (local75 + ((Static227.anIntArray393[local20] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[0] = local3 + (local79 + ((Static227.anIntArray416[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static227.anIntArray395[0] = local86 + (((this.anIntArray375[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class17.anIntArray23[local28 - local24];
				Static227.anIntArray396[local5] = local1 + (local75 + ((Static227.anIntArray393[local15] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[local5] = local3 + (local79 + ((Static227.anIntArray416[local15] - local79) * local99 >> 16) << 9) / 50;
				Static227.anIntArray395[local5++] = local86 + (((this.anIntArray374[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static227.anIntArray396[local5] = Static227.anIntArray399[local15];
			Static227.anIntArray401[local5] = Static227.anIntArray406[local15];
			Static227.anIntArray395[local5++] = this.anIntArray374[arg0] & 0xFFFF;
		} else {
			local75 = Static227.anIntArray393[local15];
			local79 = Static227.anIntArray416[local15];
			local86 = this.anIntArray374[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class17.anIntArray23[local24 - local28];
				Static227.anIntArray396[local5] = local1 + (local75 + ((Static227.anIntArray393[local10] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[local5] = local3 + (local79 + ((Static227.anIntArray416[local10] - local79) * local99 >> 16) << 9) / 50;
				Static227.anIntArray395[local5++] = local86 + (((this.anIntArray378[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class17.anIntArray23[local32 - local28];
				Static227.anIntArray396[local5] = local1 + (local75 + ((Static227.anIntArray393[local20] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[local5] = local3 + (local79 + ((Static227.anIntArray416[local20] - local79) * local99 >> 16) << 9) / 50;
				Static227.anIntArray395[local5++] = local86 + (((this.anIntArray375[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static227.anIntArray396[local5] = Static227.anIntArray399[local20];
			Static227.anIntArray401[local5] = Static227.anIntArray406[local20];
			Static227.anIntArray395[local5++] = this.anIntArray375[arg0] & 0xFFFF;
		} else {
			local75 = Static227.anIntArray393[local20];
			local79 = Static227.anIntArray416[local20];
			local86 = this.anIntArray375[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class17.anIntArray23[local28 - local32];
				Static227.anIntArray396[local5] = local1 + (local75 + ((Static227.anIntArray393[local15] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[local5] = local3 + (local79 + ((Static227.anIntArray416[local15] - local79) * local99 >> 16) << 9) / 50;
				Static227.anIntArray395[local5++] = local86 + (((this.anIntArray374[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class17.anIntArray23[local24 - local32];
				Static227.anIntArray396[local5] = local1 + (local75 + ((Static227.anIntArray393[local10] - local75) * local99 >> 16) << 9) / 50;
				Static227.anIntArray401[local5] = local3 + (local79 + ((Static227.anIntArray416[local10] - local79) * local99 >> 16) << 9) / 50;
				Static227.anIntArray395[local5++] = local86 + (((this.anIntArray378[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static227.anIntArray396[0];
		local79 = Static227.anIntArray396[1];
		local86 = Static227.anIntArray396[2];
		local99 = Static227.anIntArray401[0];
		@Pc(614) int local614 = Static227.anIntArray401[1];
		@Pc(618) int local618 = Static227.anIntArray401[2];
		Static18.aBoolean18 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static18.anInt305 || local79 > Static18.anInt305 || local86 > Static18.anInt305) {
				Static18.aBoolean18 = true;
			}
			if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
				if (this.aByteArray48 == null || this.aByteArray48[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray48[arg0] & 0xFF;
					local709 = this.anIntArray384[local704];
					local714 = this.anIntArray377[local704];
					local719 = this.anIntArray380[local704];
				}
				if (this.anIntArray375[arg0] == -1) {
					Static18.method301(local99, local614, local618, local75, local79, local86, this.anIntArray378[arg0], this.anIntArray378[arg0], this.anIntArray378[arg0], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], this.aShortArray65[arg0]);
				} else {
					Static18.method301(local99, local614, local618, local75, local79, local86, Static227.anIntArray395[0], Static227.anIntArray395[1], Static227.anIntArray395[2], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], this.aShortArray65[arg0]);
				}
			} else if (this.anIntArray375[arg0] == -1) {
				Static18.method321(local99, local614, local618, local75, local79, local86, Static18.anIntArray26[this.anIntArray378[arg0] & 0xFFFF]);
			} else {
				Static18.method308(local99, local614, local618, local75, local79, local86, Static227.anIntArray395[0], Static227.anIntArray395[1], Static227.anIntArray395[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static18.anInt305 || local79 > Static18.anInt305 || local86 > Static18.anInt305 || Static227.anIntArray396[3] < 0 || Static227.anIntArray396[3] > Static18.anInt305) {
			Static18.aBoolean18 = true;
		}
		if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
			if (this.aByteArray48 == null || this.aByteArray48[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray48[arg0] & 0xFF;
				local709 = this.anIntArray384[local704];
				local714 = this.anIntArray377[local704];
				local719 = this.anIntArray380[local704];
			}
			@Pc(984) short local984 = this.aShortArray65[arg0];
			if (this.anIntArray375[arg0] == -1) {
				Static18.method301(local99, local614, local618, local75, local79, local86, this.anIntArray378[arg0], this.anIntArray378[arg0], this.anIntArray378[arg0], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], local984);
				Static18.method301(local99, local618, Static227.anIntArray401[3], local75, local86, Static227.anIntArray396[3], this.anIntArray378[arg0], this.anIntArray378[arg0], this.anIntArray378[arg0], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], local984);
			} else {
				Static18.method301(local99, local614, local618, local75, local79, local86, Static227.anIntArray395[0], Static227.anIntArray395[1], Static227.anIntArray395[2], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], local984);
				Static18.method301(local99, local618, Static227.anIntArray401[3], local75, local86, Static227.anIntArray396[3], Static227.anIntArray395[0], Static227.anIntArray395[2], Static227.anIntArray395[3], Static227.anIntArray393[local709], Static227.anIntArray393[local714], Static227.anIntArray393[local719], Static227.anIntArray416[local709], Static227.anIntArray416[local714], Static227.anIntArray416[local719], Static227.anIntArray414[local709], Static227.anIntArray414[local714], Static227.anIntArray414[local719], local984);
			}
		} else if (this.anIntArray375[arg0] == -1) {
			local709 = Static18.anIntArray26[this.anIntArray378[arg0] & 0xFFFF];
			Static18.method321(local99, local614, local618, local75, local79, local86, local709);
			Static18.method321(local99, local618, Static227.anIntArray401[3], local75, local86, Static227.anIntArray396[3], local709);
		} else {
			Static18.method308(local99, local614, local618, local75, local79, local86, Static227.anIntArray395[0], Static227.anIntArray395[1], Static227.anIntArray395[2]);
			Static18.method308(local99, local618, Static227.anIntArray401[3], local75, local86, Static227.anIntArray396[3], Static227.anIntArray395[0], Static227.anIntArray395[2], Static227.anIntArray395[3]);
		}
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "()V")
	private void method3582() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4459; local17++) {
			@Pc(26) int local26 = this.anIntArray385[local17];
			@Pc(31) int local31 = this.anIntArray382[local17];
			@Pc(36) int local36 = this.anIntArray379[local17];
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
		this.aShort33 = (short) local7;
		this.aShort27 = (short) local3;
		this.aShort26 = (short) local9;
		this.aShort32 = (short) local5;
		this.aShort29 = (short) local11;
		this.aShort30 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort28 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean316 = true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	@Override
	public void method3554(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4462; local9++) {
			@Pc(29) int local29 = this.anIntArray379[local9] * local3 + this.anIntArray385[local9] * local7 >> 16;
			this.anIntArray379[local9] = this.anIntArray379[local9] * local7 - this.anIntArray385[local9] * local3 >> 16;
			this.anIntArray385[local9] = local29;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3563(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static227.aByteArray53.length < this.anInt4460) {
			Static227.aByteArray53 = new byte[this.anInt4460 + 100];
		}
		if (!arg1 && Static227.aShortArray69.length < this.anInt4460) {
			Static227.anIntArray415 = new int[this.anInt4460 + 100];
			Static227.anIntArray409 = new int[this.anInt4460 + 100];
			Static227.anIntArray397 = new int[this.anInt4460 + 100];
			Static227.aShortArray69 = new short[this.anInt4460 + 100];
		}
		return this.method3594(arg0, arg1, Static227.aClass22_Sub4_Sub2_3, Static227.aByteArray53, Static227.aShortArray69, Static227.anIntArray415, Static227.anIntArray409, Static227.anIntArray397);
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "()I")
	@Override
	public int method3560() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3569(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static227.aByteArray51.length < this.anInt4460) {
			Static227.aByteArray51 = new byte[this.anInt4460 + 100];
		}
		if (!arg1 && Static227.aShortArray66.length < this.anInt4460) {
			Static227.anIntArray387 = new int[this.anInt4460 + 100];
			Static227.anIntArray386 = new int[this.anInt4460 + 100];
			Static227.anIntArray388 = new int[this.anInt4460 + 100];
			Static227.aShortArray66 = new short[this.anInt4460 + 100];
		}
		return this.method3594(arg0, arg1, Static227.aClass22_Sub4_Sub2_1, Static227.aByteArray51, Static227.aShortArray66, Static227.anIntArray387, Static227.anIntArray386, Static227.anIntArray388);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static227.anInt4466 = 0;
			Static227.anInt4463 = 0;
			Static227.anInt4465 = 0;
			for (local11 = 0; local11 < this.anInt4462; local11++) {
				Static227.anInt4466 += this.anIntArray385[local11];
				Static227.anInt4463 += this.anIntArray382[local11];
				Static227.anInt4465 += this.anIntArray379[local11];
				local3++;
			}
			if (local3 > 0) {
				Static227.anInt4466 = Static227.anInt4466 / local3 + arg1;
				Static227.anInt4463 = Static227.anInt4463 / local3 + arg2;
				Static227.anInt4465 = Static227.anInt4465 / local3 + arg3;
			} else {
				Static227.anInt4466 = arg1;
				Static227.anInt4463 = arg2;
				Static227.anInt4465 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt4462; local3++) {
				this.anIntArray385[local3] += arg1;
				this.anIntArray382[local3] += arg2;
				this.anIntArray379[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt4462; local3++) {
					this.anIntArray385[local3] -= Static227.anInt4466;
					this.anIntArray382[local3] -= Static227.anInt4463;
					this.anIntArray379[local3] -= Static227.anInt4465;
					if (arg3 != 0) {
						local11 = Class17.anIntArray22[arg3];
						local146 = Class17.anIntArray24[arg3];
						local164 = this.anIntArray382[local3] * local11 + this.anIntArray385[local3] * local146 + 32767 >> 16;
						this.anIntArray382[local3] = this.anIntArray382[local3] * local146 + 32767 - this.anIntArray385[local3] * local11 >> 16;
						this.anIntArray385[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class17.anIntArray22[arg1];
						local146 = Class17.anIntArray24[arg1];
						local164 = this.anIntArray382[local3] * local146 + 32767 - this.anIntArray379[local3] * local11 >> 16;
						this.anIntArray379[local3] = this.anIntArray382[local3] * local11 + this.anIntArray379[local3] * local146 + 32767 >> 16;
						this.anIntArray382[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class17.anIntArray22[arg2];
						local146 = Class17.anIntArray24[arg2];
						local164 = this.anIntArray379[local3] * local11 + this.anIntArray385[local3] * local146 + 32767 >> 16;
						this.anIntArray379[local3] = this.anIntArray379[local3] * local146 + 32767 - this.anIntArray385[local3] * local11 >> 16;
						this.anIntArray385[local3] = local164;
					}
					this.anIntArray385[local3] += Static227.anInt4466;
					this.anIntArray382[local3] += Static227.anInt4463;
					this.anIntArray379[local3] += Static227.anInt4465;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt4462; local3++) {
					this.anIntArray385[local3] -= Static227.anInt4466;
					this.anIntArray382[local3] -= Static227.anInt4463;
					this.anIntArray379[local3] -= Static227.anInt4465;
					this.anIntArray385[local3] = this.anIntArray385[local3] * arg1 / 128;
					this.anIntArray382[local3] = this.anIntArray382[local3] * arg2 / 128;
					this.anIntArray379[local3] = this.anIntArray379[local3] * arg3 / 128;
					this.anIntArray385[local3] += Static227.anInt4466;
					this.anIntArray382[local3] += Static227.anInt4463;
					this.anIntArray379[local3] += Static227.anInt4465;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt4460; local3++) {
					local11 = (this.aByteArray49[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray49[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt4460; local3++) {
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
				this.aBoolean317 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "()I")
	@Override
	public int method3572() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "()I")
	@Override
	public int method3566() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!qi;")
	public Class22_Sub4_Sub2 method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean316) {
			this.method3582();
		}
		@Pc(9) int local9 = arg4 + this.aShort31;
		@Pc(14) int local14 = arg4 + this.aShort33;
		@Pc(19) int local19 = arg6 + this.aShort32;
		@Pc(24) int local24 = arg6 + this.aShort29;
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
		@Pc(150) Class22_Sub4_Sub2 local150;
		if (arg7) {
			local150 = new Class22_Sub4_Sub2();
			local150.anInt4462 = this.anInt4462;
			local150.anInt4459 = this.anInt4459;
			local150.anInt4460 = this.anInt4460;
			local150.anInt4461 = this.anInt4461;
			local150.anIntArray381 = this.anIntArray381;
			local150.anIntArray383 = this.anIntArray383;
			local150.anIntArray376 = this.anIntArray376;
			local150.anIntArray378 = this.anIntArray378;
			local150.anIntArray374 = this.anIntArray374;
			local150.anIntArray375 = this.anIntArray375;
			local150.aByteArray50 = this.aByteArray50;
			local150.aByteArray48 = this.aByteArray48;
			local150.aShortArray65 = this.aShortArray65;
			local150.aShortArray63 = this.aShortArray63;
			local150.aByteArray49 = this.aByteArray49;
			local150.aByte25 = this.aByte25;
			local150.anIntArray384 = this.anIntArray384;
			local150.anIntArray377 = this.anIntArray377;
			local150.anIntArray380 = this.anIntArray380;
			local150.anIntArrayArray32 = this.anIntArrayArray32;
			local150.anIntArrayArray31 = this.anIntArrayArray31;
			local150.aShortArray67 = this.aShortArray67;
			local150.aShortArray64 = this.aShortArray64;
			local150.aBoolean315 = this.aBoolean315;
			if (arg0 == 3) {
				local150.anIntArray385 = Static162.method2752(this.anIntArray385);
				local150.anIntArray382 = Static162.method2752(this.anIntArray382);
				local150.anIntArray379 = Static162.method2752(this.anIntArray379);
			} else {
				local150.anIntArray385 = this.anIntArray385;
				local150.anIntArray382 = new int[local150.anInt4462];
				local150.anIntArray379 = this.anIntArray379;
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
			for (local289 = 0; local289 < local150.anInt4459; local289++) {
				local300 = this.anIntArray385[local289] + arg4;
				local307 = this.anIntArray379[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray382[local289] = this.anIntArray382[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt4459; local289 < local150.anInt4462; local289++) {
				local300 = this.anIntArray385[local289] + arg4;
				local307 = this.anIntArray379[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray382[local289] = this.anIntArray382[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt4459; local289++) {
					local300 = (this.anIntArray382[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray385[local289] + arg4;
						local311 = this.anIntArray379[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray382[local289] = this.anIntArray382[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray382[local289] = this.anIntArray382[local289];
					}
				}
				for (local289 = local150.anInt4459; local289 < local150.anInt4462; local289++) {
					local300 = (this.anIntArray382[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray385[local289] + arg4;
						local311 = this.anIntArray379[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray382[local289] = this.anIntArray382[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray382[local289] = this.anIntArray382[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3551(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort26 - this.aShort27;
				for (local300 = 0; local300 < this.anInt4459; local300++) {
					local307 = this.anIntArray385[local300] + arg4;
					local311 = this.anIntArray379[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray382[local300] = this.anIntArray382[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt4459; local300 < local150.anInt4462; local300++) {
					local307 = this.anIntArray385[local300] + arg4;
					local311 = this.anIntArray379[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray382[local300] = this.anIntArray382[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort26 - this.aShort27;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt4459; local300++) {
					local307 = this.anIntArray385[local300] + arg4;
					local311 = this.anIntArray379[local300] + arg6;
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
					local150.anIntArray382[local300] = ((this.anIntArray382[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt4459; local300 < local150.anInt4462; local300++) {
					local307 = this.anIntArray385[local300] + arg4;
					local311 = this.anIntArray379[local300] + arg6;
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
						local150.anIntArray382[local300] = ((this.anIntArray382[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean316 = false;
		return local150;
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "()V")
	private void method3585() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4460; local1++) {
			@Pc(15) short local15 = this.aShortArray65 == null ? -1 : this.aShortArray65[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray63[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray375[local1] == -1) {
					local38 = this.anIntArray378[local1] & 0xFFFE0000;
					this.anIntArray378[local1] = local38 | Static227.method3595(local25, local38 >> 17);
				} else if (this.anIntArray375[local1] != -2) {
					local38 = this.anIntArray378[local1] & 0xFFFE0000;
					this.anIntArray378[local1] = local38 | Static227.method3595(local25, local38 >> 17);
					local38 = this.anIntArray374[local1] & 0xFFFE0000;
					this.anIntArray374[local1] = local38 | Static227.method3595(local25, local38 >> 17);
					local38 = this.anIntArray375[local1] & 0xFFFE0000;
					this.anIntArray375[local1] = local38 | Static227.method3595(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZJIILclient!ko;)V")
	private void method3586(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class45_Sub2 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static227.aBoolean319) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray402[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray411[local11] = 0;
			}
			Static227.anInt4464 = 0;
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
		for (local11 = 0; local11 < this.anInt4460; local11++) {
			if (this.anIntArray375[local11] != -2) {
				local51 = this.anIntArray381[local11];
				local56 = this.anIntArray383[local11];
				local61 = this.anIntArray376[local11];
				local65 = Static227.anIntArray399[local51];
				local69 = Static227.anIntArray399[local56];
				local73 = Static227.anIntArray399[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static227.anIntArray393[local51];
					local92 = Static227.anIntArray393[local56];
					local96 = Static227.anIntArray393[local61];
					local100 = Static227.anIntArray416[local51];
					local104 = Static227.anIntArray416[local56];
					local108 = Static227.anIntArray416[local61];
					local112 = Static227.anIntArray414[local51];
					@Pc(116) int local116 = Static227.anIntArray414[local56];
					local120 = Static227.anIntArray414[local61];
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
						Static227.aBooleanArray47[local11] = true;
						if (Static227.aBoolean319) {
							anIntArray394[local5] = (Static227.anIntArray410[local51] + Static227.anIntArray410[local56] + Static227.anIntArray410[local61]) / 3;
							anIntArray407[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static227.anIntArray410[local51] + Static227.anIntArray410[local56] + Static227.anIntArray410[local61]) / 3 + arg3;
							if (anIntArray402[local224] < 64) {
								anIntArrayArray35[local224][anIntArray402[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray402[local224];
								if (local247 == 64) {
									if (Static227.anInt4464 == 512) {
										continue;
									}
									anIntArray402[local224] = local247 = Static227.anInt4464++ + 65;
								}
								local247 -= 65;
								anIntArrayArray34[local247][anIntArray411[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method3590(Static34.anInt613 + Static18.anInt303, Static152.anInt3139 + Static18.anInt302, Static227.anIntArray406[local51], Static227.anIntArray406[local56], Static227.anIntArray406[local61], local65, local69, local73)) {
						Static17.aLongArray11[Static57.anInt1123++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static227.anIntArray406[local61] - Static227.anIntArray406[local56]) - (Static227.anIntArray406[local51] - Static227.anIntArray406[local56]) * (local73 - local69) > 0) {
						Static227.aBooleanArray47[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static18.anInt305 && local69 <= Static18.anInt305 && local73 <= Static18.anInt305) {
							Static227.aBooleanArray46[local11] = false;
						} else {
							Static227.aBooleanArray46[local11] = true;
						}
						if (Static227.aBoolean319) {
							anIntArray394[local5] = (Static227.anIntArray410[local51] + Static227.anIntArray410[local56] + Static227.anIntArray410[local61]) / 3;
							anIntArray407[local5++] = local11;
						} else {
							local88 = (Static227.anIntArray410[local51] + Static227.anIntArray410[local56] + Static227.anIntArray410[local61]) / 3 + arg3;
							if (anIntArray402[local88] < 64) {
								anIntArrayArray35[local88][anIntArray402[local88]++] = local11;
							} else {
								local92 = anIntArray402[local88];
								if (local92 == 64) {
									if (Static227.anInt4464 == 512) {
										continue;
									}
									anIntArray402[local88] = local92 = Static227.anInt4464++ + 65;
								}
								local92 -= 65;
								anIntArrayArray34[local92][anIntArray411[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static227.aBoolean319) {
			for (local11 = 0; local11 < Static227.anIntArray392.length; local11++) {
				local51 = Static227.anIntArray392[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray402[local51] < 64) {
						anIntArrayArray35[local51][anIntArray402[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray402[local51];
						if (local56 == 64) {
							if (Static227.anInt4464 == 512) {
								continue;
							}
							anIntArray402[local51] = local56 = Static227.anInt4464++ + 65;
						}
						local56 -= 65;
						anIntArrayArray34[local56][anIntArray411[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static227.aBoolean319) {
			Static279.method4127(anIntArray394, local5 - 1, 0, anIntArray407);
			if (this.aByteArray50 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method3589(anIntArray407[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static227.anIntArray403[local11] = 0;
				Static227.anIntArray413[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray407[local11];
				local56 = anIntArray394[local11];
				@Pc(610) byte local610 = this.aByteArray50[local51];
				local65 = Static227.anIntArray403[local610]++;
				Static227.anIntArrayArray33[local610][local65] = local51;
				if (local610 < 10) {
					Static227.anIntArray413[local610] += local56;
				} else if (local610 == 10) {
					Static227.anIntArray408[local65] = local56;
				} else {
					Static227.anIntArray404[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray50 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray402[local11];
					@Pc(706) Class45_Sub3_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray35[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method3589(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass45_Sub3_Sub1Array2[local73];
								local92 = Static227.anIntArray412[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static41.method749(Static227.anIntArray405[local73], Static227.anIntArray400[local73], (local706.aClass45_Sub1_1.aClass148_2.anInt4470 << 16) / local92, local706.anInt3071, local706.anInt3071 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray402[local11] - 64 - 1;
						local677 = anIntArrayArray34[local56];
						for (local65 = 0; local65 < anIntArray411[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method3589(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass45_Sub3_Sub1Array2[local73];
								local92 = Static227.anIntArray412[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static41.method749(Static227.anIntArray405[local73], Static227.anIntArray400[local73], (local706.aClass45_Sub1_1.aClass148_2.anInt4470 << 16) / local92, local706.anInt3071, local706.anInt3071 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static227.anIntArray403[local11] = 0;
				Static227.anIntArray413[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray402[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray35[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray50[local69];
							local88 = Static227.anIntArray403[local881]++;
							Static227.anIntArrayArray33[local881][local88] = local69;
							if (local881 < 10) {
								Static227.anIntArray413[local881] += local11;
							} else if (local881 == 10) {
								Static227.anIntArray408[local88] = local11;
							} else {
								Static227.anIntArray404[local88] = local11;
							}
						} else {
							Static227.anIntArray398[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray402[local11] - 64 - 1;
					local677 = anIntArrayArray34[local56];
					for (local65 = 0; local65 < anIntArray411[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray50[local69];
							local88 = Static227.anIntArray403[local881]++;
							Static227.anIntArrayArray33[local881][local88] = local69;
							if (local881 < 10) {
								Static227.anIntArray413[local881] += local11;
							} else if (local881 == 10) {
								Static227.anIntArray408[local88] = local11;
							} else {
								Static227.anIntArray404[local88] = local11;
							}
						} else {
							Static227.anIntArray398[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static227.anIntArray403[1] > 0 || Static227.anIntArray403[2] > 0) {
			local11 = (Static227.anIntArray413[1] + Static227.anIntArray413[2]) / (Static227.anIntArray403[1] + Static227.anIntArray403[2]);
		}
		local51 = 0;
		if (Static227.anIntArray403[3] > 0 || Static227.anIntArray403[4] > 0) {
			local51 = (Static227.anIntArray413[3] + Static227.anIntArray413[4]) / (Static227.anIntArray403[3] + Static227.anIntArray403[4]);
		}
		local56 = 0;
		if (Static227.anIntArray403[6] > 0 || Static227.anIntArray403[8] > 0) {
			local56 = (Static227.anIntArray413[6] + Static227.anIntArray413[8]) / (Static227.anIntArray403[6] + Static227.anIntArray403[8]);
		}
		local65 = 0;
		local69 = Static227.anIntArray403[10];
		@Pc(1105) int[] local1105 = Static227.anIntArrayArray33[10];
		@Pc(1107) int[] local1107 = Static227.anIntArray408;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static227.anIntArray403[11];
			local1105 = Static227.anIntArrayArray33[11];
			local1107 = Static227.anIntArray404;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method3589(local1105[local65++]);
				if (local65 == local69 && local1105 != Static227.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static227.anIntArray403[11];
					local1105 = Static227.anIntArrayArray33[11];
					local1107 = Static227.anIntArray404;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method3589(local1105[local65++]);
				if (local65 == local69 && local1105 != Static227.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static227.anIntArray403[11];
					local1105 = Static227.anIntArrayArray33[11];
					local1107 = Static227.anIntArray404;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method3589(local1105[local65++]);
				if (local65 == local69 && local1105 != Static227.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static227.anIntArray403[11];
					local1105 = Static227.anIntArrayArray33[11];
					local1107 = Static227.anIntArray404;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static227.anIntArray403[local96];
			@Pc(1275) int[] local1275 = Static227.anIntArrayArray33[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static227.anIntArray413[local96] / local100;
				}
				for (local112 = Static227.anIntArray398[local92]; Static227.anIntArray392[local112] + arg3 > local108; local112 = Static227.anIntArray398[local92++]) {
					@Pc(1303) Class45_Sub3_Sub1 local1303 = arg5.aClass45_Sub3_Sub1Array2[local112];
					local120 = Static227.anIntArray412[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static41.method749(Static227.anIntArray405[local112], Static227.anIntArray400[local112], (local1303.aClass45_Sub1_1.aClass148_2.anInt4470 << 16) / local120, local1303.anInt3071, local1303.anInt3071 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method3589(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method3589(local1105[local65++]);
			if (local65 == local69 && local1105 != Static227.anIntArrayArray33[11]) {
				local65 = 0;
				local1105 = Static227.anIntArrayArray33[11];
				local69 = Static227.anIntArray403[11];
				local1107 = Static227.anIntArray404;
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
		local96 = Static227.anIntArray398[local92];
		while (local92 < local7) {
			@Pc(1413) Class45_Sub3_Sub1 local1413 = arg5.aClass45_Sub3_Sub1Array2[local96];
			local104 = Static227.anIntArray412[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static41.method749(Static227.anIntArray405[local96], Static227.anIntArray400[local96], (local1413.aClass45_Sub1_1.aClass148_2.anInt4470 << 16) / local104, local1413.anInt3071, local1413.anInt3071 >> 24 & 0xFF);
			local96 = Static227.anIntArray398[local92++];
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "()V")
	@Override
	public void method3555() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4462; local1++) {
			this.anIntArray385[local1] = -this.anIntArray385[local1];
			this.anIntArray379[local1] = -this.anIntArray379[local1];
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "()V")
	@Override
	public void method3578() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4462; local1++) {
			@Pc(10) int local10 = this.anIntArray385[local1];
			this.anIntArray385[local1] = this.anIntArray379[local1];
			this.anIntArray379[local1] = -local10;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean316) {
				this.method3582();
			}
			@Pc(6) int local6 = Static18.anInt303;
			@Pc(8) int local8 = Static18.anInt302;
			@Pc(12) int local12 = Class17.anIntArray22[0];
			@Pc(16) int local16 = Class17.anIntArray24[0];
			@Pc(20) int local20 = Class17.anIntArray22[arg0];
			@Pc(24) int local24 = Class17.anIntArray24[arg0];
			@Pc(28) int local28 = Class17.anIntArray22[arg1];
			@Pc(32) int local32 = Class17.anIntArray24[arg1];
			@Pc(36) int local36 = Class17.anIntArray22[arg2];
			@Pc(40) int local40 = Class17.anIntArray24[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4462; local52++) {
				@Pc(61) int local61 = this.anIntArray385[local52];
				@Pc(66) int local66 = this.anIntArray382[local52];
				@Pc(71) int local71 = this.anIntArray379[local52];
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
				Static227.anIntArray410[local52] = local71 - local50;
				Static227.anIntArray399[local52] = local6 + (local61 << 9) / local71;
				Static227.anIntArray406[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt4461 > 0) {
					Static227.anIntArray393[local52] = local61;
					Static227.anIntArray416[local52] = local83;
					Static227.anIntArray414[local52] = local71;
				}
			}
			this.method3586(false, arg6 >= 0L, arg6, this.aShort28, this.aShort28 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		if (!this.aBoolean316) {
			this.method3582();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort30 * arg2 + this.aShort26 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort30 * arg2 + this.aShort27 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method2409();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt2999 - arg10.anInt3004) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method2402(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort30 << 9;
		if (local70 / local38 <= Static25.anInt487) {
			return;
		}
		local87 = local58 - this.aShort30 << 9;
		if (local87 / local38 >= Static187.anInt3768) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort30 * arg1 + this.aShort26 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static56.anInt1120) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort30 * arg1 + this.aShort27 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static38.anInt768) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt4461 > 0;
		@Pc(223) int local223 = Static18.anInt303;
		@Pc(225) int local225 = Static18.anInt302;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class17.anIntArray22[arg0];
			local229 = Class17.anIntArray24[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static281.aBoolean384 && local53 > 0) {
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
			if (Static34.anInt613 >= local255 && Static34.anInt613 <= local259 && Static152.anInt3139 >= local274 && Static152.anInt3139 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort31, this.aShort33, this.aShort31, this.aShort33, this.aShort31, this.aShort33, this.aShort31, this.aShort33 };
				@Pc(393) int[] local393 = new int[] { this.aShort32, this.aShort32, this.aShort29, this.aShort29, this.aShort32, this.aShort32, this.aShort29, this.aShort29 };
				@Pc(436) int[] local436 = new int[] { this.aShort27, this.aShort27, this.aShort27, this.aShort27, this.aShort26, this.aShort26, this.aShort26, this.aShort26 };
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
				if (Static34.anInt613 >= local255 && Static34.anInt613 <= local259 && Static152.anInt3139 >= local274 && Static152.anInt3139 <= local278) {
					if (this.aBoolean315) {
						Static17.aLongArray11[Static57.anInt1123++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt4462; local255++) {
			local274 = this.anIntArray385[local255];
			local259 = this.anIntArray382[local255];
			local278 = this.anIntArray379[local255];
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
			Static227.anIntArray410[local255] = local278 - local24;
			if (local278 >= 50) {
				Static227.anIntArray399[local255] = local223 + (local274 << 9) / local278;
				Static227.anIntArray406[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static227.anIntArray399[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static227.anIntArray393[local255] = local274;
				Static227.anIntArray416[local255] = local628;
				Static227.anIntArray414[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static149.anInt2993 + local223;
			local274 = Static149.anInt2995 + local225;
			for (local259 = 0; local259 < arg10.aClass45_Sub3_Sub1Array2.length; local259++) {
				@Pc(770) Class45_Sub3_Sub1 local770 = arg10.aClass45_Sub3_Sub1Array2[local259];
				if (local770 == null || local770.aBoolean223) {
					Static227.anIntArray392[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt3067 >> 12) - Static16.anInt247;
					@Pc(789) int local789 = (local770.anInt3066 >> 12) - Static273.anInt5205;
					@Pc(796) int local796 = (local770.anInt3068 >> 12) - Static245.anInt2378;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static227.anIntArray405[local259] = local255 + (local628 << 9) / local838;
						Static227.anIntArray400[local259] = local274 + (local438 << 9) / local838;
						Static227.anIntArray412[local259] = local838;
						Static227.anIntArray392[local259] = local838 - local24;
					} else {
						Static227.anIntArray392[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method3586(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!hc;)Lclient!hc;")
	public Class22_Sub4 method3588(@OriginalArg(0) Class22_Sub4 arg0) {
		return new Class22_Sub4_Sub2(new Class22_Sub4_Sub2[] { this, (Class22_Sub4_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "()I")
	@Override
	public int method3564() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "()V")
	@Override
	public void method3556() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4462; local1++) {
			@Pc(10) int local10 = this.anIntArray379[local1];
			this.anIntArray379[local1] = this.anIntArray385[local1];
			this.anIntArray385[local1] = -local10;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)V")
	@Override
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4462; local1++) {
			this.anIntArray385[local1] = this.anIntArray385[local1] * arg0 / 128;
			this.anIntArray382[local1] = this.anIntArray382[local1] * arg1 / 128;
			this.anIntArray379[local1] = this.anIntArray379[local1] * arg2 / 128;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	private void method3589(@OriginalArg(0) int arg0) {
		if (Static227.aBooleanArray47[arg0]) {
			this.method3581(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray381[arg0];
		@Pc(17) int local17 = this.anIntArray383[arg0];
		@Pc(22) int local22 = this.anIntArray376[arg0];
		Static18.aBoolean18 = Static227.aBooleanArray46[arg0];
		if (this.aByteArray49 == null) {
			Static18.anInt301 = 0;
		} else {
			Static18.anInt301 = this.aByteArray49[arg0] & 0xFF;
		}
		if (this.aShortArray65 != null && this.aShortArray65[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray48 == null || this.aByteArray48[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray48[arg0] & 0xFF;
				local141 = this.anIntArray384[local136];
				local146 = this.anIntArray377[local136];
				local151 = this.anIntArray380[local136];
			}
			if (this.anIntArray375[arg0] == -1) {
				Static18.method301(Static227.anIntArray406[local12], Static227.anIntArray406[local17], Static227.anIntArray406[local22], Static227.anIntArray399[local12], Static227.anIntArray399[local17], Static227.anIntArray399[local22], this.anIntArray378[arg0], this.anIntArray378[arg0], this.anIntArray378[arg0], Static227.anIntArray393[local141], Static227.anIntArray393[local146], Static227.anIntArray393[local151], Static227.anIntArray416[local141], Static227.anIntArray416[local146], Static227.anIntArray416[local151], Static227.anIntArray414[local141], Static227.anIntArray414[local146], Static227.anIntArray414[local151], this.aShortArray65[arg0]);
			} else {
				Static18.method301(Static227.anIntArray406[local12], Static227.anIntArray406[local17], Static227.anIntArray406[local22], Static227.anIntArray399[local12], Static227.anIntArray399[local17], Static227.anIntArray399[local22], this.anIntArray378[arg0], this.anIntArray374[arg0], this.anIntArray375[arg0], Static227.anIntArray393[local141], Static227.anIntArray393[local146], Static227.anIntArray393[local151], Static227.anIntArray416[local141], Static227.anIntArray416[local146], Static227.anIntArray416[local151], Static227.anIntArray414[local141], Static227.anIntArray414[local146], Static227.anIntArray414[local151], this.aShortArray65[arg0]);
			}
		} else if (this.anIntArray375[arg0] == -1) {
			Static18.method321(Static227.anIntArray406[local12], Static227.anIntArray406[local17], Static227.anIntArray406[local22], Static227.anIntArray399[local12], Static227.anIntArray399[local17], Static227.anIntArray399[local22], Static18.anIntArray26[this.anIntArray378[arg0] & 0xFFFF]);
		} else {
			Static18.method308(Static227.anIntArray406[local12], Static227.anIntArray406[local17], Static227.anIntArray406[local22], Static227.anIntArray399[local12], Static227.anIntArray399[local17], Static227.anIntArray399[local22], this.anIntArray378[arg0] & 0xFFFF, this.anIntArray374[arg0] & 0xFFFF, this.anIntArray375[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "()I")
	@Override
	public int method3574() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	@Override
	public void method3576(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4462; local9++) {
			@Pc(29) int local29 = this.anIntArray382[local9] * local3 + this.anIntArray385[local9] * local7 >> 16;
			this.anIntArray382[local9] = this.anIntArray382[local9] * local7 - this.anIntArray385[local9] * local3 >> 16;
			this.anIntArray385[local9] = local29;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "()I")
	@Override
	public int method3553() {
		if (!this.aBoolean316) {
			this.method3582();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4462; local9++) {
			@Pc(29) int local29 = this.anIntArray382[local9] * local7 - this.anIntArray379[local9] * local3 >> 16;
			this.anIntArray379[local9] = this.anIntArray382[local9] * local3 + this.anIntArray379[local9] * local7 >> 16;
			this.anIntArray382[local9] = local29;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static227.aByteArray52.length < this.anInt4460) {
			Static227.aByteArray52 = new byte[this.anInt4460 + 100];
		}
		if (!arg1 && Static227.aShortArray68.length < this.anInt4460) {
			Static227.anIntArray389 = new int[this.anInt4460 + 100];
			Static227.anIntArray391 = new int[this.anInt4460 + 100];
			Static227.anIntArray390 = new int[this.anInt4460 + 100];
			Static227.aShortArray68 = new short[this.anInt4460 + 100];
		}
		return this.method3594(arg0, arg1, Static227.aClass22_Sub4_Sub2_2, Static227.aByteArray52, Static227.aShortArray68, Static227.anIntArray389, Static227.anIntArray391, Static227.anIntArray390);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IIIIIIII)V")
	public void method3593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean316) {
				this.method3582();
			}
			@Pc(6) int local6 = Static18.anInt303;
			@Pc(8) int local8 = Static18.anInt302;
			@Pc(12) int local12 = Class17.anIntArray22[0];
			@Pc(16) int local16 = Class17.anIntArray24[0];
			@Pc(20) int local20 = Class17.anIntArray22[arg0];
			@Pc(24) int local24 = Class17.anIntArray24[arg0];
			@Pc(28) int local28 = Class17.anIntArray22[arg1];
			@Pc(32) int local32 = Class17.anIntArray24[arg1];
			@Pc(36) int local36 = Class17.anIntArray22[arg2];
			@Pc(40) int local40 = Class17.anIntArray24[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4462; local52++) {
				@Pc(61) int local61 = this.anIntArray385[local52];
				@Pc(66) int local66 = this.anIntArray382[local52];
				@Pc(71) int local71 = this.anIntArray379[local52];
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
				Static227.anIntArray410[local52] = local71 - local50;
				Static227.anIntArray399[local52] = local6 + (local61 << 9) / arg6;
				Static227.anIntArray406[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt4461 > 0) {
					Static227.anIntArray393[local52] = local61;
					Static227.anIntArray416[local52] = local83;
					Static227.anIntArray414[local52] = local71;
				}
			}
			this.method3586(false, false, 0L, this.aShort28, this.aShort28 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZLclient!qi;[B[S[I[I[I)Lclient!hc;")
	private Class22_Sub4 method3594(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class22_Sub4_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt4462 = this.anInt4462;
		arg2.anInt4459 = this.anInt4459;
		arg2.anInt4460 = this.anInt4460;
		arg2.anInt4461 = this.anInt4461;
		if (arg2.anIntArray385 == null || arg2.anIntArray385.length < this.anInt4462) {
			arg2.anIntArray385 = new int[this.anInt4462 + 100];
			arg2.anIntArray382 = new int[this.anInt4462 + 100];
			arg2.anIntArray379 = new int[this.anInt4462 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt4462; local47++) {
			arg2.anIntArray385[local47] = this.anIntArray385[local47];
			arg2.anIntArray382[local47] = this.anIntArray382[local47];
			arg2.anIntArray379[local47] = this.anIntArray379[local47];
		}
		if (arg0) {
			arg2.aByteArray49 = this.aByteArray49;
		} else {
			arg2.aByteArray49 = arg3;
			if (this.aByteArray49 == null) {
				for (local47 = 0; local47 < this.anInt4460; local47++) {
					arg2.aByteArray49[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt4460; local47++) {
					arg2.aByteArray49[local47] = this.aByteArray49[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray63 = this.aShortArray63;
			arg2.anIntArray378 = this.anIntArray378;
			arg2.anIntArray374 = this.anIntArray374;
			arg2.anIntArray375 = this.anIntArray375;
		} else {
			arg2.aShortArray63 = arg4;
			arg2.anIntArray378 = arg5;
			arg2.anIntArray374 = arg6;
			arg2.anIntArray375 = arg7;
			for (local47 = 0; local47 < this.anInt4460; local47++) {
				arg2.aShortArray63[local47] = this.aShortArray63[local47];
				arg2.anIntArray378[local47] = this.anIntArray378[local47];
				arg2.anIntArray374[local47] = this.anIntArray374[local47];
				arg2.anIntArray375[local47] = this.anIntArray375[local47];
			}
		}
		arg2.anIntArray381 = this.anIntArray381;
		arg2.anIntArray383 = this.anIntArray383;
		arg2.anIntArray376 = this.anIntArray376;
		arg2.aByteArray50 = this.aByteArray50;
		arg2.aByteArray48 = this.aByteArray48;
		arg2.aShortArray65 = this.aShortArray65;
		arg2.aByte25 = this.aByte25;
		arg2.anIntArray384 = this.anIntArray384;
		arg2.anIntArray377 = this.anIntArray377;
		arg2.anIntArray380 = this.anIntArray380;
		arg2.anIntArrayArray32 = this.anIntArrayArray32;
		arg2.anIntArrayArray31 = this.anIntArrayArray31;
		arg2.aShortArray67 = this.aShortArray67;
		arg2.aShortArray64 = this.aShortArray64;
		arg2.aBoolean315 = this.aBoolean315;
		arg2.aBoolean316 = false;
		arg2.aClass49Array2 = this.aClass49Array2;
		arg2.aClass15Array2 = this.aClass15Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static227.anInt4466 = 0;
			Static227.anInt4463 = 0;
			Static227.anInt4465 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray32.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray32[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static227.anInt4466 += this.anIntArray385[local41];
						Static227.anInt4463 += this.anIntArray382[local41];
						Static227.anInt4465 += this.anIntArray379[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static227.anInt4466 = Static227.anInt4466 / local6 + arg2;
				Static227.anInt4463 = Static227.anInt4463 / local6 + arg3;
				Static227.anInt4465 = Static227.anInt4465 / local6 + arg4;
			} else {
				Static227.anInt4466 = arg2;
				Static227.anInt4463 = arg3;
				Static227.anInt4465 = arg4;
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
						this.anIntArray385[local33] += arg2;
						this.anIntArray382[local33] += arg3;
						this.anIntArray379[local33] += arg4;
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
						this.anIntArray385[local33] -= Static227.anInt4466;
						this.anIntArray382[local33] -= Static227.anInt4463;
						this.anIntArray379[local33] -= Static227.anInt4465;
						if (arg4 != 0) {
							local41 = Class17.anIntArray22[arg4];
							local222 = Class17.anIntArray24[arg4];
							local240 = this.anIntArray382[local33] * local41 + this.anIntArray385[local33] * local222 + 32767 >> 16;
							this.anIntArray382[local33] = this.anIntArray382[local33] * local222 + 32767 - this.anIntArray385[local33] * local41 >> 16;
							this.anIntArray385[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class17.anIntArray22[arg2];
							local222 = Class17.anIntArray24[arg2];
							local240 = this.anIntArray382[local33] * local222 + 32767 - this.anIntArray379[local33] * local41 >> 16;
							this.anIntArray379[local33] = this.anIntArray382[local33] * local41 + this.anIntArray379[local33] * local222 + 32767 >> 16;
							this.anIntArray382[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class17.anIntArray22[arg3];
							local222 = Class17.anIntArray24[arg3];
							local240 = this.anIntArray379[local33] * local41 + this.anIntArray385[local33] * local222 + 32767 >> 16;
							this.anIntArray379[local33] = this.anIntArray379[local33] * local222 + 32767 - this.anIntArray385[local33] * local41 >> 16;
							this.anIntArray385[local33] = local240;
						}
						this.anIntArray385[local33] += Static227.anInt4466;
						this.anIntArray382[local33] += Static227.anInt4463;
						this.anIntArray379[local33] += Static227.anInt4465;
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
						this.anIntArray385[local33] -= Static227.anInt4466;
						this.anIntArray382[local33] -= Static227.anInt4463;
						this.anIntArray379[local33] -= Static227.anInt4465;
						this.anIntArray385[local33] = this.anIntArray385[local33] * arg2 / 128;
						this.anIntArray382[local33] = this.anIntArray382[local33] * arg3 / 128;
						this.anIntArray379[local33] = this.anIntArray379[local33] * arg4 / 128;
						this.anIntArray385[local33] += Static227.anInt4466;
						this.anIntArray382[local33] += Static227.anInt4463;
						this.anIntArray379[local33] += Static227.anInt4465;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray49 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local117 = this.anIntArrayArray31[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray49[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray49[local33] = (byte) local41;
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
					this.aBoolean317 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)V")
	@Override
	public void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4462; local1++) {
			this.anIntArray385[local1] += arg0;
			this.anIntArray382[local1] += arg1;
			this.anIntArray379[local1] += arg2;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static227.anInt4466 = 0;
			Static227.anInt4463 = 0;
			Static227.anInt4465 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray32.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray32[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local41]) != 0) {
							Static227.anInt4466 += this.anIntArray385[local41];
							Static227.anInt4463 += this.anIntArray382[local41];
							Static227.anInt4465 += this.anIntArray379[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static227.anInt4466 = Static227.anInt4466 / local6 + arg2;
				Static227.anInt4463 = Static227.anInt4463 / local6 + arg3;
				Static227.anInt4465 = Static227.anInt4465 / local6 + arg4;
				Static227.aBoolean318 = true;
			} else {
				Static227.anInt4466 = arg2;
				Static227.anInt4463 = arg3;
				Static227.anInt4465 = arg4;
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
							this.anIntArray385[local33] += arg2;
							this.anIntArray382[local33] += arg3;
							this.anIntArray379[local33] += arg4;
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
								this.anIntArray385[local33] -= Static227.anInt4466;
								this.anIntArray382[local33] -= Static227.anInt4463;
								this.anIntArray379[local33] -= Static227.anInt4465;
								if (arg4 != 0) {
									local41 = Class17.anIntArray22[arg4];
									local307 = Class17.anIntArray24[arg4];
									local329 = this.anIntArray382[local33] * local41 + this.anIntArray385[local33] * local307 + 32767 >> 16;
									this.anIntArray382[local33] = this.anIntArray382[local33] * local307 + 32767 - this.anIntArray385[local33] * local41 >> 16;
									this.anIntArray385[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class17.anIntArray22[arg2];
									local307 = Class17.anIntArray24[arg2];
									local329 = this.anIntArray382[local33] * local307 + 32767 - this.anIntArray379[local33] * local41 >> 16;
									this.anIntArray379[local33] = this.anIntArray382[local33] * local41 + this.anIntArray379[local33] * local307 + 32767 >> 16;
									this.anIntArray382[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class17.anIntArray22[arg3];
									local307 = Class17.anIntArray24[arg3];
									local329 = this.anIntArray379[local33] * local41 + this.anIntArray385[local33] * local307 + 32767 >> 16;
									this.anIntArray379[local33] = this.anIntArray379[local33] * local307 + 32767 - this.anIntArray385[local33] * local41 >> 16;
									this.anIntArray385[local33] = local329;
								}
								this.anIntArray385[local33] += Static227.anInt4466;
								this.anIntArray382[local33] += Static227.anInt4463;
								this.anIntArray379[local33] += Static227.anInt4465;
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
				if (Static227.aBoolean318) {
					local307 = arg7[0] * Static227.anInt4466 + arg7[3] * Static227.anInt4463 + arg7[6] * Static227.anInt4465 + 16384 >> 15;
					local329 = arg7[1] * Static227.anInt4466 + arg7[4] * Static227.anInt4463 + arg7[7] * Static227.anInt4465 + 16384 >> 15;
					local351 = arg7[2] * Static227.anInt4466 + arg7[5] * Static227.anInt4463 + arg7[8] * Static227.anInt4465 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static227.anInt4466 = local307;
					Static227.anInt4463 = local329;
					Static227.anInt4465 = local351;
					Static227.aBoolean318 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class17.anIntArray24[arg2] >> 1;
				local351 = Class17.anIntArray22[arg2] >> 1;
				local392 = Class17.anIntArray24[arg3] >> 1;
				local398 = Class17.anIntArray22[arg3] >> 1;
				local404 = Class17.anIntArray24[arg4] >> 1;
				local410 = Class17.anIntArray22[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static227.anInt4466 + local374[1] * -Static227.anInt4463 + local374[2] * -Static227.anInt4465 + 16384 >> 15;
				local579 = local374[3] * -Static227.anInt4466 + local374[4] * -Static227.anInt4463 + local374[5] * -Static227.anInt4465 + 16384 >> 15;
				local604 = local374[6] * -Static227.anInt4466 + local374[7] * -Static227.anInt4463 + local374[8] * -Static227.anInt4465 + 16384 >> 15;
				local608 = local554 + Static227.anInt4466;
				@Pc(612) int local612 = local579 + Static227.anInt4463;
				local616 = local604 + Static227.anInt4465;
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
								@Pc(955) int local955 = local753[0] * this.anIntArray385[local913] + local753[1] * this.anIntArray382[local913] + local753[2] * this.anIntArray379[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray385[local913] + local753[4] * this.anIntArray382[local913] + local753[5] * this.anIntArray379[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray385[local913] + local753[7] * this.anIntArray382[local913] + local753[8] * this.anIntArray379[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray385[local913] = local1021;
								this.anIntArray382[local913] = local1025;
								this.anIntArray379[local913] = local1029;
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
								this.anIntArray385[local33] -= Static227.anInt4466;
								this.anIntArray382[local33] -= Static227.anInt4463;
								this.anIntArray379[local33] -= Static227.anInt4465;
								this.anIntArray385[local33] = this.anIntArray385[local33] * arg2 / 128;
								this.anIntArray382[local33] = this.anIntArray382[local33] * arg3 / 128;
								this.anIntArray379[local33] = this.anIntArray379[local33] * arg4 / 128;
								this.anIntArray385[local33] += Static227.anInt4466;
								this.anIntArray382[local33] += Static227.anInt4463;
								this.anIntArray379[local33] += Static227.anInt4465;
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
				if (Static227.aBoolean318) {
					local307 = arg7[0] * Static227.anInt4466 + arg7[3] * Static227.anInt4463 + arg7[6] * Static227.anInt4465 + 16384 >> 15;
					local329 = arg7[1] * Static227.anInt4466 + arg7[4] * Static227.anInt4463 + arg7[7] * Static227.anInt4465 + 16384 >> 15;
					local351 = arg7[2] * Static227.anInt4466 + arg7[5] * Static227.anInt4463 + arg7[8] * Static227.anInt4465 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static227.anInt4466 = local307;
					Static227.anInt4463 = local329;
					Static227.anInt4465 = local351;
					Static227.aBoolean318 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static227.anInt4466 + 16384 >> 15;
				local398 = local329 * -Static227.anInt4463 + 16384 >> 15;
				local404 = local351 * -Static227.anInt4465 + 16384 >> 15;
				local410 = local392 + Static227.anInt4466;
				local418 = local398 + Static227.anInt4463;
				local426 = local404 + Static227.anInt4465;
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
								local765 = local1628[0] * this.anIntArray385[local760] + local1628[1] * this.anIntArray382[local760] + local1628[2] * this.anIntArray379[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray385[local760] + local1628[4] * this.anIntArray382[local760] + local1628[5] * this.anIntArray379[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray385[local760] + local1628[7] * this.anIntArray382[local760] + local1628[8] * this.anIntArray379[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray385[local760] = local1896;
								this.anIntArray382[local760] = local1900;
								this.anIntArray379[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray49 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local204 = this.anIntArrayArray31[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local33]) != 0) {
								local41 = (this.aByteArray49[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray49[local33] = (byte) local41;
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
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local33]) != 0) {
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
					this.aBoolean317 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "()V")
	@Override
	protected void method3557() {
		if (this.aBoolean317) {
			this.method3585();
			this.aBoolean317 = false;
		}
		this.aBoolean316 = false;
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "()Z")
	@Override
	protected boolean method3567() {
		if (this.anIntArrayArray32 == null) {
			return false;
		} else {
			Static227.anInt4466 = 0;
			Static227.anInt4463 = 0;
			Static227.anInt4465 = 0;
			return true;
		}
	}
}
