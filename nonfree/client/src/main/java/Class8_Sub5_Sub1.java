import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class8_Sub5_Sub1 extends Class8_Sub5 {

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	private int anInt2787 = 0;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	public int anInt2786 = 0;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	private int anInt2788 = 0;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "B")
	private byte aByte10 = 0;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class8_Sub5_Sub1() {
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!o;IIIII)V")
	public Class8_Sub5_Sub1(@OriginalArg(0) Class8_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1998();
		arg0.method2005();
		this.anInt2786 = arg0.anInt2760;
		this.anIntArray235 = arg0.anIntArray218;
		this.anIntArray236 = arg0.anIntArray221;
		this.anIntArray234 = arg0.anIntArray215;
		this.anInt2787 = arg0.anInt2759;
		this.anIntArray231 = arg0.anIntArray217;
		this.anIntArray229 = arg0.anIntArray214;
		this.anIntArray227 = arg0.anIntArray219;
		this.aByteArray37 = arg0.aByteArray36;
		this.aByteArray38 = arg0.aByteArray27;
		this.aByte10 = arg0.aByte9;
		this.anIntArrayArray21 = arg0.anIntArrayArray19;
		this.anIntArrayArray22 = arg0.anIntArrayArray20;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray225 = new int[this.anInt2787];
		this.anIntArray228 = new int[this.anInt2787];
		this.anIntArray230 = new int[this.anInt2787];
		@Pc(118) int local118;
		if (arg0.aShortArray28 == null) {
			this.aShortArray35 = null;
		} else {
			this.aShortArray35 = new short[this.anInt2787];
			for (local118 = 0; local118 < this.anInt2787; local118++) {
				@Pc(124) short local124 = arg0.aShortArray28[local118];
				if (local124 != -1 && Static174.anInterface3_2.method2593(local124)) {
					this.aShortArray35[local118] = local124;
				} else {
					this.aShortArray35[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt2762 > 0 && arg0.aByteArray31 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt2762];
			for (@Pc(164) int local164 = 0; local164 < this.anInt2787; local164++) {
				if (arg0.aByteArray31[local164] != -1) {
					local162[arg0.aByteArray31[local164] & 0xFF]++;
				}
			}
			this.anInt2788 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt2762; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray34[local193] == 0) {
					this.anInt2788++;
				}
			}
			this.anIntArray233 = new int[this.anInt2788];
			this.anIntArray232 = new int[this.anInt2788];
			this.anIntArray226 = new int[this.anInt2788];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt2762; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray34[local233] == 0) {
					this.anIntArray233[local231] = arg0.aShortArray27[local233] & 0xFFFF;
					this.anIntArray232[local231] = arg0.aShortArray34[local233] & 0xFFFF;
					this.anIntArray226[local231] = arg0.aShortArray31[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray39 = new byte[this.anInt2787];
			for (local295 = 0; local295 < this.anInt2787; local295++) {
				if (arg0.aByteArray31[local295] == -1) {
					this.aByteArray39[local295] = -1;
				} else {
					this.aByteArray39[local295] = (byte) local162[arg0.aByteArray31[local295] & 0xFF];
					if (this.aByteArray39[local295] == -1 && this.aShortArray35 != null) {
						this.aShortArray35[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt2787; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray33 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray33[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray27 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray27[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray35 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray35[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class40 local417;
			@Pc(578) Class84 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray33[local118] & 0xFFFF;
					if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray231[local118]] == null) {
						local417 = arg0.aClass40Array2[this.anIntArray231[local118]];
					} else {
						local417 = arg0.aClass40Array1[this.anIntArray231[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
					this.anIntArray225[local118] = Static137.method2061(local398, local295);
					if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray229[local118]] == null) {
						local417 = arg0.aClass40Array2[this.anIntArray229[local118]];
					} else {
						local417 = arg0.aClass40Array1[this.anIntArray229[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
					this.anIntArray228[local118] = Static137.method2061(local398, local295);
					if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray227[local118]] == null) {
						local417 = arg0.aClass40Array2[this.anIntArray227[local118]];
					} else {
						local417 = arg0.aClass40Array1[this.anIntArray227[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
					this.anIntArray230[local118] = Static137.method2061(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass84Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt3500 + arg4 * local578.anInt3498 + arg5 * local578.anInt3496) / (local93 + local93 / 2);
					this.anIntArray225[local118] = Static137.method2061(arg0.aShortArray33[local118] & 0xFFFF, local295);
					this.anIntArray230[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray225[local118] = 128;
					this.anIntArray230[local118] = -1;
				} else {
					this.anIntArray230[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray231[local118]] == null) {
					local417 = arg0.aClass40Array2[this.anIntArray231[local118]];
				} else {
					local417 = arg0.aClass40Array1[this.anIntArray231[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
				this.anIntArray225[local118] = Static137.method2062(local295);
				if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray229[local118]] == null) {
					local417 = arg0.aClass40Array2[this.anIntArray229[local118]];
				} else {
					local417 = arg0.aClass40Array1[this.anIntArray229[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
				this.anIntArray228[local118] = Static137.method2062(local295);
				if (arg0.aClass40Array1 == null || arg0.aClass40Array1[this.anIntArray227[local118]] == null) {
					local417 = arg0.aClass40Array2[this.anIntArray227[local118]];
				} else {
					local417 = arg0.aClass40Array1[this.anIntArray227[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt1622 + arg4 * local417.anInt1626 + arg5 * local417.anInt1625) / (local93 * local417.anInt1624);
				this.anIntArray230[local118] = Static137.method2062(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass84Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt3500 + arg4 * local578.anInt3498 + arg5 * local578.anInt3496) / (local93 + local93 / 2);
				this.anIntArray225[local118] = Static137.method2062(local295);
				this.anIntArray230[local118] = -1;
			} else {
				this.anIntArray230[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([Lclient!ob;I)V")
	private Class8_Sub5_Sub1(@OriginalArg(0) Class8_Sub5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2786 = 0;
		this.anInt2787 = 0;
		this.anInt2788 = 0;
		this.aByte10 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class8_Sub5_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2786 += local43.anInt2786;
				this.anInt2787 += local43.anInt2787;
				this.anInt2788 += local43.anInt2788;
				if (local43.aByteArray37 == null) {
					if (this.aByte10 == -1) {
						this.aByte10 = local43.aByte10;
					}
					if (this.aByte10 != local43.aByte10) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray38 != null;
				local22 |= local43.aShortArray35 != null;
				local24 |= local43.aByteArray39 != null;
			}
		}
		this.anIntArray235 = new int[this.anInt2786];
		this.anIntArray236 = new int[this.anInt2786];
		this.anIntArray234 = new int[this.anInt2786];
		this.anIntArray231 = new int[this.anInt2787];
		this.anIntArray229 = new int[this.anInt2787];
		this.anIntArray227 = new int[this.anInt2787];
		this.anIntArray225 = new int[this.anInt2787];
		this.anIntArray228 = new int[this.anInt2787];
		this.anIntArray230 = new int[this.anInt2787];
		if (local18) {
			this.aByteArray37 = new byte[this.anInt2787];
		}
		if (local20) {
			this.aByteArray38 = new byte[this.anInt2787];
		}
		if (local22) {
			this.aShortArray35 = new short[this.anInt2787];
		}
		if (local24) {
			this.aByteArray39 = new byte[this.anInt2787];
		}
		if (this.anInt2788 > 0) {
			this.anIntArray233 = new int[this.anInt2788];
			this.anIntArray232 = new int[this.anInt2788];
			this.anIntArray226 = new int[this.anInt2788];
		}
		this.anInt2786 = 0;
		this.anInt2787 = 0;
		this.anInt2788 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class8_Sub5_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2787; local229++) {
					this.anIntArray231[this.anInt2787] = local225.anIntArray231[local229] + this.anInt2786;
					this.anIntArray229[this.anInt2787] = local225.anIntArray229[local229] + this.anInt2786;
					this.anIntArray227[this.anInt2787] = local225.anIntArray227[local229] + this.anInt2786;
					this.anIntArray225[this.anInt2787] = local225.anIntArray225[local229];
					this.anIntArray228[this.anInt2787] = local225.anIntArray228[local229];
					this.anIntArray230[this.anInt2787] = local225.anIntArray230[local229];
					if (local18) {
						if (local225.aByteArray37 == null) {
							this.aByteArray37[this.anInt2787] = local225.aByte10;
						} else {
							this.aByteArray37[this.anInt2787] = local225.aByteArray37[local229];
						}
					}
					if (local20 && local225.aByteArray38 != null) {
						this.aByteArray38[this.anInt2787] = local225.aByteArray38[local229];
					}
					if (local22) {
						if (local225.aShortArray35 == null) {
							this.aShortArray35[this.anInt2787] = -1;
						} else {
							this.aShortArray35[this.anInt2787] = local225.aShortArray35[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray39 == null || local225.aByteArray39[local229] == -1) {
							this.aByteArray39[this.anInt2787] = -1;
						} else {
							this.aByteArray39[this.anInt2787] = (byte) (local225.aByteArray39[local229] + this.anInt2788);
						}
					}
					this.anInt2787++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2788; local394++) {
					this.anIntArray233[this.anInt2788] = local225.anIntArray233[local394] + this.anInt2786;
					this.anIntArray232[this.anInt2788] = local225.anIntArray232[local394] + this.anInt2786;
					this.anIntArray226[this.anInt2788] = local225.anIntArray226[local394] + this.anInt2786;
					this.anInt2788++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2786; local444++) {
					this.anIntArray235[this.anInt2786] = local225.anIntArray235[local444];
					this.anIntArray236[this.anInt2786] = local225.anIntArray236[local444];
					this.anIntArray234[this.anInt2786] = local225.anIntArray234[local444];
					this.anInt2786++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "()V")
	private void method2054() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2786; local17++) {
			@Pc(23) int local23 = this.anIntArray235[local17];
			@Pc(28) int local28 = this.anIntArray236[local17];
			@Pc(33) int local33 = this.anIntArray234[local17];
			if (local23 < local1) {
				local1 = local23;
			}
			if (local23 > local7) {
				local7 = local23;
			}
			if (local28 < local3) {
				local3 = local28;
			}
			if (local28 > local9) {
				local9 = local28;
			}
			if (local33 < local5) {
				local5 = local33;
			}
			if (local33 > local11) {
				local11 = local33;
			}
			@Pc(71) int local71 = local23 * local23 + local33 * local33;
			if (local71 > local13) {
				local13 = local71;
			}
			local71 = local23 * local23 + local33 * local33 + local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort16 = (short) local1;
		this.aShort15 = (short) local7;
		this.aShort17 = (short) local3;
		this.aShort18 = (short) local9;
		this.aShort20 = (short) local5;
		this.aShort14 = (short) local11;
		this.aShort19 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort13 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
	public void method2055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean164) {
				this.method2054();
			}
			@Pc(6) int local6 = Static174.anInt3748;
			@Pc(8) int local8 = Static174.anInt3747;
			@Pc(12) int local12 = Class1_Sub3_Sub1_Sub4.anIntArray320[0];
			@Pc(16) int local16 = Class1_Sub3_Sub1_Sub4.anIntArray317[0];
			@Pc(20) int local20 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
			@Pc(24) int local24 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
			@Pc(28) int local28 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg1];
			@Pc(32) int local32 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg1];
			@Pc(36) int local36 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg2];
			@Pc(40) int local40 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2786; local52++) {
				@Pc(58) int local58 = this.anIntArray235[local52];
				@Pc(63) int local63 = this.anIntArray236[local52];
				@Pc(68) int local68 = this.anIntArray234[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static137.anIntArray249[local52] = local68 - local50;
				Static137.anIntArray248[local52] = local6 + (local58 << 9) / arg6;
				Static137.anIntArray241[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt2788 > 0) {
					Static137.anIntArray239[local52] = local58;
					Static137.anIntArray250[local52] = local80;
					Static137.anIntArray244[local52] = local68;
				}
			}
			this.method2060(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	@Override
	public void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2786; local1++) {
			this.anIntArray235[local1] = this.anIntArray235[local1] * arg0 / 128;
			this.anIntArray236[local1] = this.anIntArray236[local1] * arg1 / 128;
			this.anIntArray234[local1] = this.anIntArray234[local1] * arg2 / 128;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()I")
	@Override
	public int method2042() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "()I")
	@Override
	public int method2046() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ee;)Lclient!ee;")
	public Class8_Sub5 method2057(@OriginalArg(0) Class8_Sub5 arg0) {
		return new Class8_Sub5_Sub1(new Class8_Sub5_Sub1[] { this, (Class8_Sub5_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "()V")
	@Override
	public void method2051() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2786; local1++) {
			@Pc(7) int local7 = this.anIntArray234[local1];
			this.anIntArray234[local1] = this.anIntArray235[local1];
			this.anIntArray235[local1] = -local7;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method2045(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
		@Pc(7) int local7 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2786; local9++) {
			@Pc(26) int local26 = this.anIntArray236[local9] * local7 - this.anIntArray234[local9] * local3 >> 16;
			this.anIntArray234[local9] = this.anIntArray236[local9] * local3 + this.anIntArray234[local9] * local7 >> 16;
			this.anIntArray236[local9] = local26;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
	@Override
	public void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2786; local1++) {
			this.anIntArray235[local1] += arg0;
			this.anIntArray236[local1] += arg1;
			this.anIntArray234[local1] += arg2;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	@Override
	public void method2050(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
		@Pc(7) int local7 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2786; local9++) {
			@Pc(26) int local26 = this.anIntArray236[local9] * local3 + this.anIntArray235[local9] * local7 >> 16;
			this.anIntArray236[local9] = this.anIntArray236[local9] * local7 - this.anIntArray235[local9] * local3 >> 16;
			this.anIntArray235[local9] = local26;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[IIIIZI)Lclient!ob;")
	public Class8_Sub5_Sub1 method2058(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean164) {
			this.method2054();
		}
		@Pc(9) int local9 = arg1 + this.aShort16;
		@Pc(14) int local14 = arg1 + this.aShort15;
		@Pc(19) int local19 = arg3 + this.aShort20;
		@Pc(24) int local24 = arg3 + this.aShort14;
		if (local9 < 0 || local14 + 128 >> 7 >= arg0.length || local19 < 0 || local24 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local9 >>= 0x7;
		local14 = local14 + 127 >> 7;
		local19 >>= 0x7;
		local24 = local24 + 127 >> 7;
		if (arg0[local9][local19] == arg2 && arg0[local14][local19] == arg2 && arg0[local9][local24] == arg2 && arg0[local14][local24] == arg2) {
			return this;
		}
		@Pc(104) Class8_Sub5_Sub1 local104;
		if (arg4) {
			local104 = new Class8_Sub5_Sub1();
			local104.anInt2786 = this.anInt2786;
			local104.anInt2787 = this.anInt2787;
			local104.anInt2788 = this.anInt2788;
			local104.anIntArray235 = this.anIntArray235;
			local104.anIntArray234 = this.anIntArray234;
			local104.anIntArray231 = this.anIntArray231;
			local104.anIntArray229 = this.anIntArray229;
			local104.anIntArray227 = this.anIntArray227;
			local104.anIntArray225 = this.anIntArray225;
			local104.anIntArray228 = this.anIntArray228;
			local104.anIntArray230 = this.anIntArray230;
			local104.aByteArray37 = this.aByteArray37;
			local104.aByteArray38 = this.aByteArray38;
			local104.aByteArray39 = this.aByteArray39;
			local104.aShortArray35 = this.aShortArray35;
			local104.aByte10 = this.aByte10;
			local104.anIntArray233 = this.anIntArray233;
			local104.anIntArray232 = this.anIntArray232;
			local104.anIntArray226 = this.anIntArray226;
			local104.anIntArrayArray21 = this.anIntArrayArray21;
			local104.anIntArrayArray22 = this.anIntArrayArray22;
			local104.aBoolean163 = super.aBoolean163;
			local104.anIntArray236 = new int[local104.anInt2786];
		} else {
			local104 = this;
		}
		@Pc(204) int local204;
		@Pc(212) int local212;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(257) int local257;
		@Pc(283) int local283;
		@Pc(295) int local295;
		if (arg5 == 0) {
			for (local204 = 0; local204 < local104.anInt2786; local204++) {
				local212 = this.anIntArray235[local204] + arg1;
				local219 = this.anIntArray234[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray236[local204] = this.anIntArray236[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt2786; local204++) {
				local212 = (this.anIntArray236[local204] << 16) / this.aShort17;
				if (local212 < arg5) {
					local219 = this.anIntArray235[local204] + arg1;
					local223 = this.anIntArray234[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray236[local204] = this.anIntArray236[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray236[local204] = this.anIntArray236[local204];
				}
			}
		}
		local104.aBoolean164 = false;
		return local104;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[IIII)V")
	private void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static137.anInt2789 = 0;
			Static137.anInt2790 = 0;
			Static137.anInt2791 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray21.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray21[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static137.anInt2789 += this.anIntArray235[local36];
						Static137.anInt2790 += this.anIntArray236[local36];
						Static137.anInt2791 += this.anIntArray234[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static137.anInt2789 = Static137.anInt2789 / local6 + arg2;
				Static137.anInt2790 = Static137.anInt2790 / local6 + arg3;
				Static137.anInt2791 = Static137.anInt2791 / local6 + arg4;
			} else {
				Static137.anInt2789 = arg2;
				Static137.anInt2790 = arg3;
				Static137.anInt2791 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] += arg2;
						this.anIntArray236[local31] += arg3;
						this.anIntArray234[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] -= Static137.anInt2789;
						this.anIntArray236[local31] -= Static137.anInt2790;
						this.anIntArray234[local31] -= Static137.anInt2791;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg4];
							local217 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg4];
							local235 = this.anIntArray236[local31] * local36 + this.anIntArray235[local31] * local217 + 32767 >> 16;
							this.anIntArray236[local31] = this.anIntArray236[local31] * local217 + 32767 - this.anIntArray235[local31] * local36 >> 16;
							this.anIntArray235[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg2];
							local217 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg2];
							local235 = this.anIntArray236[local31] * local217 + 32767 - this.anIntArray234[local31] * local36 >> 16;
							this.anIntArray234[local31] = this.anIntArray236[local31] * local36 + this.anIntArray234[local31] * local217 + 32767 >> 16;
							this.anIntArray236[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg3];
							local217 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg3];
							local235 = this.anIntArray234[local31] * local36 + this.anIntArray235[local31] * local217 + 32767 >> 16;
							this.anIntArray234[local31] = this.anIntArray234[local31] * local217 + 32767 - this.anIntArray235[local31] * local36 >> 16;
							this.anIntArray235[local31] = local235;
						}
						this.anIntArray235[local31] += Static137.anInt2789;
						this.anIntArray236[local31] += Static137.anInt2790;
						this.anIntArray234[local31] += Static137.anInt2791;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray235[local31] -= Static137.anInt2789;
						this.anIntArray236[local31] -= Static137.anInt2790;
						this.anIntArray234[local31] -= Static137.anInt2791;
						this.anIntArray235[local31] = this.anIntArray235[local31] * arg2 / 128;
						this.anIntArray236[local31] = this.anIntArray236[local31] * arg3 / 128;
						this.anIntArray234[local31] = this.anIntArray234[local31] * arg4 / 128;
						this.anIntArray235[local31] += Static137.anInt2789;
						this.anIntArray236[local31] += Static137.anInt2790;
						this.anIntArray234[local31] += Static137.anInt2791;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray22 != null && this.aByteArray38 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray38[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray38[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZJII)V")
	private void method2060(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static137.anIntArray238[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < this.anInt2787; local16++) {
			if (this.anIntArray230[local16] != -2) {
				local28 = this.anIntArray231[local16];
				local33 = this.anIntArray229[local16];
				local38 = this.anIntArray227[local16];
				local42 = Static137.anIntArray248[local28];
				local46 = Static137.anIntArray248[local33];
				local50 = Static137.anIntArray248[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static137.anIntArray239[local28];
					local69 = Static137.anIntArray239[local33];
					@Pc(73) int local73 = Static137.anIntArray239[local38];
					@Pc(77) int local77 = Static137.anIntArray250[local28];
					local81 = Static137.anIntArray250[local33];
					local85 = Static137.anIntArray250[local38];
					@Pc(89) int local89 = Static137.anIntArray244[local28];
					local93 = Static137.anIntArray244[local33];
					@Pc(97) int local97 = Static137.anIntArray244[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static137.aBooleanArray12[local16] = true;
						@Pc(177) int local177 = (Static137.anIntArray249[local28] + Static137.anIntArray249[local33] + Static137.anIntArray249[local38]) / 3 + arg3;
						Static137.anIntArrayArray24[local177][Static137.anIntArray238[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2056(Static184.anInt3959, Static56.anInt1344, Static137.anIntArray241[local28], Static137.anIntArray241[local33], Static137.anIntArray241[local38], local42, local46, local50)) {
						Static36.aLongArray2[Static180.anInt4483++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static137.anIntArray241[local38] - Static137.anIntArray241[local33]) - (Static137.anIntArray241[local28] - Static137.anIntArray241[local33]) * (local50 - local46) > 0) {
						Static137.aBooleanArray12[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static174.anInt3750 && local46 <= Static174.anInt3750 && local50 <= Static174.anInt3750) {
							Static137.aBooleanArray11[local16] = false;
						} else {
							Static137.aBooleanArray11[local16] = true;
						}
						local65 = (Static137.anIntArray249[local28] + Static137.anIntArray249[local33] + Static137.anIntArray249[local38]) / 3 + arg3;
						Static137.anIntArrayArray24[local65][Static137.anIntArray238[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray37 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static137.anIntArray238[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static137.anIntArrayArray24[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2066(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static137.anIntArray246[local28] = 0;
			Static137.anIntArray245[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static137.anIntArray238[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static137.anIntArrayArray24[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray37[local50];
					local69 = Static137.anIntArray246[local382]++;
					Static137.anIntArrayArray23[local382][local69] = local50;
					if (local382 < 10) {
						Static137.anIntArray245[local382] += local33;
					} else if (local382 == 10) {
						Static137.anIntArray243[local69] = local33;
					} else {
						Static137.anIntArray247[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static137.anIntArray246[1] > 0 || Static137.anIntArray246[2] > 0) {
			local38 = (Static137.anIntArray245[1] + Static137.anIntArray245[2]) / (Static137.anIntArray246[1] + Static137.anIntArray246[2]);
		}
		local42 = 0;
		if (Static137.anIntArray246[3] > 0 || Static137.anIntArray246[4] > 0) {
			local42 = (Static137.anIntArray245[3] + Static137.anIntArray245[4]) / (Static137.anIntArray246[3] + Static137.anIntArray246[4]);
		}
		local46 = 0;
		if (Static137.anIntArray246[6] > 0 || Static137.anIntArray246[8] > 0) {
			local46 = (Static137.anIntArray245[6] + Static137.anIntArray245[8]) / (Static137.anIntArray246[6] + Static137.anIntArray246[8]);
		}
		local65 = 0;
		local69 = Static137.anIntArray246[10];
		@Pc(515) int[] local515 = Static137.anIntArrayArray23[10];
		@Pc(517) int[] local517 = Static137.anIntArray243;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static137.anIntArray246[11];
			local515 = Static137.anIntArrayArray23[11];
			local517 = Static137.anIntArray247;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2066(local515[local65++]);
				if (local65 == local69 && local515 != Static137.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static137.anIntArray246[11];
					local515 = Static137.anIntArrayArray23[11];
					local517 = Static137.anIntArray247;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2066(local515[local65++]);
				if (local65 == local69 && local515 != Static137.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static137.anIntArray246[11];
					local515 = Static137.anIntArrayArray23[11];
					local517 = Static137.anIntArray247;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2066(local515[local65++]);
				if (local65 == local69 && local515 != Static137.anIntArrayArray23[11]) {
					local65 = 0;
					local69 = Static137.anIntArray246[11];
					local515 = Static137.anIntArrayArray23[11];
					local517 = Static137.anIntArray247;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static137.anIntArray246[local81];
			@Pc(680) int[] local680 = Static137.anIntArrayArray23[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2066(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2066(local515[local65++]);
			if (local65 == local69 && local515 != Static137.anIntArrayArray23[11]) {
				local65 = 0;
				local515 = Static137.anIntArrayArray23[11];
				local69 = Static137.anIntArray246[11];
				local517 = Static137.anIntArray247;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!j;I)V")
	@Override
	public void method2040(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray21 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class88 local12 = arg0.aClass88Array1[arg1];
		@Pc(15) Class1_Sub26 local15 = local12.aClass1_Sub26_1;
		Static137.anInt2789 = 0;
		Static137.anInt2790 = 0;
		Static137.anInt2791 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3918; local23++) {
			@Pc(29) short local29 = local12.aShortArray47[local23];
			if (local12.aShortArray50[local23] != -1) {
				this.method2059(0, local15.anIntArrayArray33[local12.aShortArray50[local23]], 0, 0, 0);
			}
			this.method2059(local15.anIntArray360[local29], local15.anIntArrayArray33[local29], local12.aShortArray49[local23], local12.aShortArray43[local23], local12.aShortArray48[local23]);
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Lclient!ee;")
	@Override
	public Class8_Sub5 method2052(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static137.aByteArray40.length < this.anInt2787) {
			Static137.aByteArray40 = new byte[this.anInt2787 + 100];
		}
		return this.method2064(arg0, Static137.aClass8_Sub5_Sub1_1, Static137.aByteArray40);
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "()V")
	@Override
	public void method2053() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2786; local1++) {
			this.anIntArray235[local1] = -this.anIntArray235[local1];
			this.anIntArray234[local1] = -this.anIntArray234[local1];
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	@Override
	public void method2048(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
		@Pc(7) int local7 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2786; local9++) {
			@Pc(26) int local26 = this.anIntArray234[local9] * local3 + this.anIntArray235[local9] * local7 >> 16;
			this.anIntArray234[local9] = this.anIntArray234[local9] * local7 - this.anIntArray235[local9] * local3 >> 16;
			this.anIntArray235[local9] = local26;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	private void method2063(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static174.anInt3748;
		@Pc(3) int local3 = Static174.anInt3747;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray231[arg0];
		@Pc(15) int local15 = this.anIntArray229[arg0];
		@Pc(20) int local20 = this.anIntArray227[arg0];
		@Pc(24) int local24 = Static137.anIntArray244[local10];
		@Pc(28) int local28 = Static137.anIntArray244[local15];
		@Pc(32) int local32 = Static137.anIntArray244[local20];
		if (this.aByteArray38 == null) {
			Static174.anInt3751 = 0;
		} else {
			Static174.anInt3751 = this.aByteArray38[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static137.anIntArray237[0] = Static137.anIntArray248[local10];
			Static137.anIntArray242[0] = Static137.anIntArray241[local10];
			local5++;
			Static137.anIntArray240[0] = this.anIntArray225[arg0];
		} else {
			local73 = Static137.anIntArray239[local10];
			local77 = Static137.anIntArray250[local10];
			local82 = this.anIntArray225[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class1_Sub3_Sub1_Sub4.anIntArray321[local32 - local24];
				Static137.anIntArray237[0] = local1 + (local73 + ((Static137.anIntArray239[local20] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[0] = local3 + (local77 + ((Static137.anIntArray250[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static137.anIntArray240[0] = local82 + ((this.anIntArray230[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class1_Sub3_Sub1_Sub4.anIntArray321[local28 - local24];
				Static137.anIntArray237[local5] = local1 + (local73 + ((Static137.anIntArray239[local15] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[local5] = local3 + (local77 + ((Static137.anIntArray250[local15] - local77) * local95 >> 16) << 9) / 50;
				Static137.anIntArray240[local5++] = local82 + ((this.anIntArray228[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static137.anIntArray237[local5] = Static137.anIntArray248[local15];
			Static137.anIntArray242[local5] = Static137.anIntArray241[local15];
			Static137.anIntArray240[local5++] = this.anIntArray228[arg0];
		} else {
			local73 = Static137.anIntArray239[local15];
			local77 = Static137.anIntArray250[local15];
			local82 = this.anIntArray228[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class1_Sub3_Sub1_Sub4.anIntArray321[local24 - local28];
				Static137.anIntArray237[local5] = local1 + (local73 + ((Static137.anIntArray239[local10] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[local5] = local3 + (local77 + ((Static137.anIntArray250[local10] - local77) * local95 >> 16) << 9) / 50;
				Static137.anIntArray240[local5++] = local82 + ((this.anIntArray225[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class1_Sub3_Sub1_Sub4.anIntArray321[local32 - local28];
				Static137.anIntArray237[local5] = local1 + (local73 + ((Static137.anIntArray239[local20] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[local5] = local3 + (local77 + ((Static137.anIntArray250[local20] - local77) * local95 >> 16) << 9) / 50;
				Static137.anIntArray240[local5++] = local82 + ((this.anIntArray230[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static137.anIntArray237[local5] = Static137.anIntArray248[local20];
			Static137.anIntArray242[local5] = Static137.anIntArray241[local20];
			Static137.anIntArray240[local5++] = this.anIntArray230[arg0];
		} else {
			local73 = Static137.anIntArray239[local20];
			local77 = Static137.anIntArray250[local20];
			local82 = this.anIntArray230[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class1_Sub3_Sub1_Sub4.anIntArray321[local28 - local32];
				Static137.anIntArray237[local5] = local1 + (local73 + ((Static137.anIntArray239[local15] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[local5] = local3 + (local77 + ((Static137.anIntArray250[local15] - local77) * local95 >> 16) << 9) / 50;
				Static137.anIntArray240[local5++] = local82 + ((this.anIntArray228[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class1_Sub3_Sub1_Sub4.anIntArray321[local24 - local32];
				Static137.anIntArray237[local5] = local1 + (local73 + ((Static137.anIntArray239[local10] - local73) * local95 >> 16) << 9) / 50;
				Static137.anIntArray242[local5] = local3 + (local77 + ((Static137.anIntArray250[local10] - local77) * local95 >> 16) << 9) / 50;
				Static137.anIntArray240[local5++] = local82 + ((this.anIntArray225[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static137.anIntArray237[0];
		local77 = Static137.anIntArray237[1];
		local82 = Static137.anIntArray237[2];
		local95 = Static137.anIntArray242[0];
		@Pc(590) int local590 = Static137.anIntArray242[1];
		@Pc(594) int local594 = Static137.anIntArray242[2];
		Static174.aBoolean209 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static174.anInt3750 || local77 > Static174.anInt3750 || local82 > Static174.anInt3750) {
				Static174.aBoolean209 = true;
			}
			if (this.aShortArray35 != null && this.aShortArray35[arg0] != -1) {
				if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray39[arg0] & 0xFF;
					local683 = this.anIntArray233[local678];
					local688 = this.anIntArray232[local678];
					local693 = this.anIntArray226[local678];
				}
				if (this.anIntArray230[arg0] == -1) {
					Static174.method2836(local95, local590, local594, local73, local77, local82, this.anIntArray225[arg0], this.anIntArray225[arg0], this.anIntArray225[arg0], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], this.aShortArray35[arg0]);
				} else {
					Static174.method2836(local95, local590, local594, local73, local77, local82, Static137.anIntArray240[0], Static137.anIntArray240[1], Static137.anIntArray240[2], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], this.aShortArray35[arg0]);
				}
			} else if (this.anIntArray230[arg0] == -1) {
				Static174.method2847(local95, local590, local594, local73, local77, local82, Static174.anIntArray319[this.anIntArray225[arg0]]);
			} else {
				Static174.method2848(local95, local590, local594, local73, local77, local82, Static137.anIntArray240[0], Static137.anIntArray240[1], Static137.anIntArray240[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static174.anInt3750 || local77 > Static174.anInt3750 || local82 > Static174.anInt3750 || Static137.anIntArray237[3] < 0 || Static137.anIntArray237[3] > Static174.anInt3750) {
			Static174.aBoolean209 = true;
		}
		if (this.aShortArray35 == null || this.aShortArray35[arg0] == -1) {
			if (this.anIntArray230[arg0] == -1) {
				local683 = Static174.anIntArray319[this.anIntArray225[arg0]];
				Static174.method2847(local95, local590, local594, local73, local77, local82, local683);
				Static174.method2847(local95, local594, Static137.anIntArray242[3], local73, local82, Static137.anIntArray237[3], local683);
				return;
			}
			Static174.method2848(local95, local590, local594, local73, local77, local82, Static137.anIntArray240[0], Static137.anIntArray240[1], Static137.anIntArray240[2]);
			Static174.method2848(local95, local594, Static137.anIntArray242[3], local73, local82, Static137.anIntArray237[3], Static137.anIntArray240[0], Static137.anIntArray240[2], Static137.anIntArray240[3]);
			return;
		}
		if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray39[arg0] & 0xFF;
			local683 = this.anIntArray233[local678];
			local688 = this.anIntArray232[local678];
			local693 = this.anIntArray226[local678];
		}
		@Pc(956) short local956 = this.aShortArray35[arg0];
		if (this.anIntArray230[arg0] == -1) {
			Static174.method2836(local95, local590, local594, local73, local77, local82, this.anIntArray225[arg0], this.anIntArray225[arg0], this.anIntArray225[arg0], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], local956);
			Static174.method2836(local95, local594, Static137.anIntArray242[3], local73, local82, Static137.anIntArray237[3], this.anIntArray225[arg0], this.anIntArray225[arg0], this.anIntArray225[arg0], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], local956);
			return;
		}
		Static174.method2836(local95, local590, local594, local73, local77, local82, Static137.anIntArray240[0], Static137.anIntArray240[1], Static137.anIntArray240[2], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], local956);
		Static174.method2836(local95, local594, Static137.anIntArray242[3], local73, local82, Static137.anIntArray237[3], Static137.anIntArray240[0], Static137.anIntArray240[2], Static137.anIntArray240[3], Static137.anIntArray239[local683], Static137.anIntArray239[local688], Static137.anIntArray239[local693], Static137.anIntArray250[local683], Static137.anIntArray250[local688], Static137.anIntArray250[local693], Static137.anIntArray244[local683], Static137.anIntArray244[local688], Static137.anIntArray244[local693], local956);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean164) {
				this.method2054();
			}
			@Pc(6) int local6 = Static174.anInt3748;
			@Pc(8) int local8 = Static174.anInt3747;
			@Pc(12) int local12 = Class1_Sub3_Sub1_Sub4.anIntArray320[0];
			@Pc(16) int local16 = Class1_Sub3_Sub1_Sub4.anIntArray317[0];
			@Pc(20) int local20 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
			@Pc(24) int local24 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
			@Pc(28) int local28 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg1];
			@Pc(32) int local32 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg1];
			@Pc(36) int local36 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg2];
			@Pc(40) int local40 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt2786; local52++) {
				@Pc(58) int local58 = this.anIntArray235[local52];
				@Pc(63) int local63 = this.anIntArray236[local52];
				@Pc(68) int local68 = this.anIntArray234[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static137.anIntArray249[local52] = local68 - local50;
				Static137.anIntArray248[local52] = local6 + (local58 << 9) / local68;
				Static137.anIntArray241[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt2788 > 0) {
					Static137.anIntArray239[local52] = local58;
					Static137.anIntArray250[local52] = local80;
					Static137.anIntArray244[local52] = local68;
				}
			}
			this.method2060(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!ob;[B)Lclient!ee;")
	private Class8_Sub5 method2064(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub5_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2786 = this.anInt2786;
		arg1.anInt2787 = this.anInt2787;
		arg1.anInt2788 = this.anInt2788;
		if (arg1.anIntArray235 == null || arg1.anIntArray235.length < this.anInt2786) {
			arg1.anIntArray235 = new int[this.anInt2786 + 100];
			arg1.anIntArray236 = new int[this.anInt2786 + 100];
			arg1.anIntArray234 = new int[this.anInt2786 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2786; local43++) {
			arg1.anIntArray235[local43] = this.anIntArray235[local43];
			arg1.anIntArray236[local43] = this.anIntArray236[local43];
			arg1.anIntArray234[local43] = this.anIntArray234[local43];
		}
		if (arg0) {
			arg1.aByteArray38 = this.aByteArray38;
		} else {
			arg1.aByteArray38 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray38 == null) {
				for (local88 = 0; local88 < this.anInt2787; local88++) {
					arg1.aByteArray38[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2787; local88++) {
					arg1.aByteArray38[local88] = this.aByteArray38[local88];
				}
			}
		}
		arg1.anIntArray231 = this.anIntArray231;
		arg1.anIntArray229 = this.anIntArray229;
		arg1.anIntArray227 = this.anIntArray227;
		arg1.anIntArray225 = this.anIntArray225;
		arg1.anIntArray228 = this.anIntArray228;
		arg1.anIntArray230 = this.anIntArray230;
		arg1.aByteArray37 = this.aByteArray37;
		arg1.aByteArray39 = this.aByteArray39;
		arg1.aShortArray35 = this.aShortArray35;
		arg1.aByte10 = this.aByte10;
		arg1.anIntArray233 = this.anIntArray233;
		arg1.anIntArray232 = this.anIntArray232;
		arg1.anIntArray226 = this.anIntArray226;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.aBoolean163 = super.aBoolean163;
		arg1.aBoolean164 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "()V")
	@Override
	public void method2047() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2786; local1++) {
			@Pc(7) int local7 = this.anIntArray235[local1];
			this.anIntArray235[local1] = this.anIntArray234[local1];
			this.anIntArray234[local1] = -local7;
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!j;ILclient!j;I[I)V")
	@Override
	public void method2037(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2040(arg0, arg1);
			return;
		}
		@Pc(18) Class88 local18 = arg0.aClass88Array1[arg1];
		@Pc(23) Class88 local23 = arg2.aClass88Array1[arg3];
		@Pc(26) Class1_Sub26 local26 = local18.aClass1_Sub26_1;
		Static137.anInt2789 = 0;
		Static137.anInt2790 = 0;
		Static137.anInt2791 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3918; local41++) {
			@Pc(47) short local47 = local18.aShortArray47[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray360[local47] == 0) {
				if (local18.aShortArray50[local41] != -1) {
					this.method2059(0, local26.anIntArrayArray33[local18.aShortArray50[local41]], 0, 0, 0);
				}
				this.method2059(local26.anIntArray360[local47], local26.anIntArrayArray33[local47], local18.aShortArray49[local41], local18.aShortArray43[local41], local18.aShortArray48[local41]);
			}
		}
		Static137.anInt2789 = 0;
		Static137.anInt2790 = 0;
		Static137.anInt2791 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt3918; local125++) {
			@Pc(131) short local131 = local23.aShortArray47[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray360[local131] == 0) {
				if (local23.aShortArray50[local125] != -1) {
					this.method2059(0, local26.anIntArrayArray33[local23.aShortArray50[local125]], 0, 0, 0);
				}
				this.method2059(local26.anIntArray360[local131], local26.anIntArrayArray33[local131], local23.aShortArray49[local125], local23.aShortArray43[local125], local23.aShortArray48[local125]);
			}
		}
		this.aBoolean164 = false;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "()I")
	@Override
	public int method2044() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "()I")
	@Override
	public int method2049() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean164) {
			this.method2054();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort19 * arg2 + this.aShort18 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort19 * arg2 + this.aShort17 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort19 << 9;
		if (local78 / local38 <= Static174.anInt3752) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort19 << 9;
		if (local91 / local38 >= Static174.anInt3745) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort19 * arg1 + this.aShort18 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static174.anInt3749) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort19 * arg1 + this.aShort17 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static174.anInt3744) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2788 > 0;
		@Pc(172) int local172 = Static174.anInt3748;
		@Pc(174) int local174 = Static174.anInt3747;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
			local178 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static101.aBoolean126 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static184.anInt3959 - Static174.anInt3748;
			@Pc(244) int local244 = Static56.anInt1344 - Static174.anInt3747;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { this.aShort16, this.aShort15, this.aShort16, this.aShort15, this.aShort16, this.aShort15, this.aShort16, this.aShort15 };
				@Pc(350) int[] local350 = new int[] { this.aShort20, this.aShort20, this.aShort14, this.aShort14, this.aShort20, this.aShort20, this.aShort14, this.aShort14 };
				@Pc(393) int[] local393 = new int[] { this.aShort17, this.aShort17, this.aShort17, this.aShort17, this.aShort18, this.aShort18, this.aShort18, this.aShort18 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean163) {
						Static36.aLongArray2[Static180.anInt4483++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt2786; local204++) {
			local223 = this.anIntArray235[local204];
			local208 = this.anIntArray236[local204];
			local227 = this.anIntArray234[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static137.anIntArray249[local204] = local227 - local24;
			if (local227 >= 50) {
				Static137.anIntArray248[local204] = local172 + (local223 << 9) / local227;
				Static137.anIntArray241[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static137.anIntArray248[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static137.anIntArray239[local204] = local223;
				Static137.anIntArray250[local204] = local240;
				Static137.anIntArray244[local204] = local227;
			}
		}
		try {
			this.method2060(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lclient!ee;")
	@Override
	public Class8_Sub5 method2043(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static137.aByteArray41.length < this.anInt2787) {
			Static137.aByteArray41 = new byte[this.anInt2787 + 100];
		}
		return this.method2064(arg0, Static137.aClass8_Sub5_Sub1_2, Static137.aByteArray41);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()I")
	@Override
	public int method2041() {
		if (!this.aBoolean164) {
			this.method2054();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	private void method2066(@OriginalArg(0) int arg0) {
		if (Static137.aBooleanArray12[arg0]) {
			this.method2063(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray231[arg0];
		@Pc(17) int local17 = this.anIntArray229[arg0];
		@Pc(22) int local22 = this.anIntArray227[arg0];
		Static174.aBoolean209 = Static137.aBooleanArray11[arg0];
		if (this.aByteArray38 == null) {
			Static174.anInt3751 = 0;
		} else {
			Static174.anInt3751 = this.aByteArray38[arg0] & 0xFF;
		}
		if (this.aShortArray35 != null && this.aShortArray35[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray39 == null || this.aByteArray39[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray39[arg0] & 0xFF;
				local133 = this.anIntArray233[local128];
				local138 = this.anIntArray232[local128];
				local143 = this.anIntArray226[local128];
			}
			if (this.anIntArray230[arg0] == -1) {
				Static174.method2836(Static137.anIntArray241[local12], Static137.anIntArray241[local17], Static137.anIntArray241[local22], Static137.anIntArray248[local12], Static137.anIntArray248[local17], Static137.anIntArray248[local22], this.anIntArray225[arg0], this.anIntArray225[arg0], this.anIntArray225[arg0], Static137.anIntArray239[local133], Static137.anIntArray239[local138], Static137.anIntArray239[local143], Static137.anIntArray250[local133], Static137.anIntArray250[local138], Static137.anIntArray250[local143], Static137.anIntArray244[local133], Static137.anIntArray244[local138], Static137.anIntArray244[local143], this.aShortArray35[arg0]);
			} else {
				Static174.method2836(Static137.anIntArray241[local12], Static137.anIntArray241[local17], Static137.anIntArray241[local22], Static137.anIntArray248[local12], Static137.anIntArray248[local17], Static137.anIntArray248[local22], this.anIntArray225[arg0], this.anIntArray228[arg0], this.anIntArray230[arg0], Static137.anIntArray239[local133], Static137.anIntArray239[local138], Static137.anIntArray239[local143], Static137.anIntArray250[local133], Static137.anIntArray250[local138], Static137.anIntArray250[local143], Static137.anIntArray244[local133], Static137.anIntArray244[local138], Static137.anIntArray244[local143], this.aShortArray35[arg0]);
			}
		} else if (this.anIntArray230[arg0] == -1) {
			Static174.method2847(Static137.anIntArray241[local12], Static137.anIntArray241[local17], Static137.anIntArray241[local22], Static137.anIntArray248[local12], Static137.anIntArray248[local17], Static137.anIntArray248[local22], Static174.anIntArray319[this.anIntArray225[arg0]]);
		} else {
			Static174.method2848(Static137.anIntArray241[local12], Static137.anIntArray241[local17], Static137.anIntArray241[local22], Static137.anIntArray248[local12], Static137.anIntArray248[local17], Static137.anIntArray248[local22], this.anIntArray225[arg0], this.anIntArray228[arg0], this.anIntArray230[arg0]);
		}
	}
}
