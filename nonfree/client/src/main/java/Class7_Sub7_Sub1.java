import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class7_Sub7_Sub1 extends Class7_Sub7 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "[S")
	private short[] aShortArray159;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!wh", name = "lb", descriptor = "[I")
	public int[] anIntArray420;

	@OriginalMember(owner = "client!wh", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	private int anInt4491 = 0;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "B")
	private byte aByte13 = 0;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
	private int anInt4493 = 0;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
	public int anInt4492 = 0;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class7_Sub7_Sub1() {
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!gj;IIIII)V")
	public Class7_Sub7_Sub1(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method965();
		arg0.method962();
		this.anInt4492 = arg0.anInt1448;
		this.anIntArray410 = arg0.anIntArray122;
		this.anIntArray404 = arg0.anIntArray118;
		this.anIntArray420 = arg0.anIntArray121;
		this.anInt4493 = arg0.anInt1449;
		this.anIntArray412 = arg0.anIntArray112;
		this.anIntArray405 = arg0.anIntArray113;
		this.anIntArray406 = arg0.anIntArray111;
		this.aByteArray53 = arg0.aByteArray17;
		this.aByteArray52 = arg0.aByteArray18;
		this.aByte13 = arg0.aByte1;
		this.anIntArrayArray40 = arg0.anIntArrayArray10;
		this.anIntArrayArray37 = arg0.anIntArrayArray11;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray403 = new int[this.anInt4493];
		this.anIntArray413 = new int[this.anInt4493];
		this.anIntArray411 = new int[this.anInt4493];
		@Pc(118) int local118;
		if (arg0.aShortArray46 == null) {
			this.aShortArray159 = null;
		} else {
			this.aShortArray159 = new short[this.anInt4493];
			for (local118 = 0; local118 < this.anInt4493; local118++) {
				@Pc(124) short local124 = arg0.aShortArray46[local118];
				if (local124 != -1 && Static45.anInterface3_1.method2300(local124)) {
					this.aShortArray159[local118] = local124;
				} else {
					this.aShortArray159[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt1451 > 0 && arg0.aByteArray11 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt1451];
			for (@Pc(164) int local164 = 0; local164 < this.anInt4493; local164++) {
				if (arg0.aByteArray11[local164] != -1) {
					local162[arg0.aByteArray11[local164] & 0xFF]++;
				}
			}
			this.anInt4491 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt1451; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray16[local193] == 0) {
					this.anInt4491++;
				}
			}
			this.anIntArray407 = new int[this.anInt4491];
			this.anIntArray408 = new int[this.anInt4491];
			this.anIntArray409 = new int[this.anInt4491];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt1451; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray16[local233] == 0) {
					this.anIntArray407[local231] = arg0.aShortArray48[local233] & 0xFFFF;
					this.anIntArray408[local231] = arg0.aShortArray45[local233] & 0xFFFF;
					this.anIntArray409[local231] = arg0.aShortArray47[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray54 = new byte[this.anInt4493];
			for (local295 = 0; local295 < this.anInt4493; local295++) {
				if (arg0.aByteArray11[local295] == -1) {
					this.aByteArray54[local295] = -1;
				} else {
					this.aByteArray54[local295] = (byte) local162[arg0.aByteArray11[local295] & 0xFF];
					if (this.aByteArray54[local295] == -1 && this.aShortArray159 != null) {
						this.aShortArray159[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt4493; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray13 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray13[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray18 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray18[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray159 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray159[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class69 local417;
			@Pc(578) Class4 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray52[local118] & 0xFFFF;
					if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray412[local118]] == null) {
						local417 = arg0.aClass69Array2[this.anIntArray412[local118]];
					} else {
						local417 = arg0.aClass69Array1[this.anIntArray412[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
					this.anIntArray403[local118] = Static215.method3175(local398, local295);
					if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray405[local118]] == null) {
						local417 = arg0.aClass69Array2[this.anIntArray405[local118]];
					} else {
						local417 = arg0.aClass69Array1[this.anIntArray405[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
					this.anIntArray413[local118] = Static215.method3175(local398, local295);
					if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray406[local118]] == null) {
						local417 = arg0.aClass69Array2[this.anIntArray406[local118]];
					} else {
						local417 = arg0.aClass69Array1[this.anIntArray406[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
					this.anIntArray411[local118] = Static215.method3175(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass4Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt140 + arg4 * local578.anInt135 + arg5 * local578.anInt141) / (local93 + local93 / 2);
					this.anIntArray403[local118] = Static215.method3175(arg0.aShortArray52[local118] & 0xFFFF, local295);
					this.anIntArray411[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray403[local118] = 128;
					this.anIntArray411[local118] = -1;
				} else {
					this.anIntArray411[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray412[local118]] == null) {
					local417 = arg0.aClass69Array2[this.anIntArray412[local118]];
				} else {
					local417 = arg0.aClass69Array1[this.anIntArray412[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
				this.anIntArray403[local118] = Static215.method3172(local295);
				if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray405[local118]] == null) {
					local417 = arg0.aClass69Array2[this.anIntArray405[local118]];
				} else {
					local417 = arg0.aClass69Array1[this.anIntArray405[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
				this.anIntArray413[local118] = Static215.method3172(local295);
				if (arg0.aClass69Array1 == null || arg0.aClass69Array1[this.anIntArray406[local118]] == null) {
					local417 = arg0.aClass69Array2[this.anIntArray406[local118]];
				} else {
					local417 = arg0.aClass69Array1[this.anIntArray406[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt2879 + arg4 * local417.anInt2880 + arg5 * local417.anInt2875) / (local93 * local417.anInt2882);
				this.anIntArray411[local118] = Static215.method3172(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass4Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt140 + arg4 * local578.anInt135 + arg5 * local578.anInt141) / (local93 + local93 / 2);
				this.anIntArray403[local118] = Static215.method3172(local295);
				this.anIntArray411[local118] = -1;
			} else {
				this.anIntArray411[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([Lclient!wh;I)V")
	private Class7_Sub7_Sub1(@OriginalArg(0) Class7_Sub7_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt4492 = 0;
		this.anInt4493 = 0;
		this.anInt4491 = 0;
		this.aByte13 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class7_Sub7_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt4492 += local43.anInt4492;
				this.anInt4493 += local43.anInt4493;
				this.anInt4491 += local43.anInt4491;
				if (local43.aByteArray53 == null) {
					if (this.aByte13 == -1) {
						this.aByte13 = local43.aByte13;
					}
					if (this.aByte13 != local43.aByte13) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray52 != null;
				local22 |= local43.aShortArray159 != null;
				local24 |= local43.aByteArray54 != null;
			}
		}
		this.anIntArray410 = new int[this.anInt4492];
		this.anIntArray404 = new int[this.anInt4492];
		this.anIntArray420 = new int[this.anInt4492];
		this.anIntArray412 = new int[this.anInt4493];
		this.anIntArray405 = new int[this.anInt4493];
		this.anIntArray406 = new int[this.anInt4493];
		this.anIntArray403 = new int[this.anInt4493];
		this.anIntArray413 = new int[this.anInt4493];
		this.anIntArray411 = new int[this.anInt4493];
		if (local18) {
			this.aByteArray53 = new byte[this.anInt4493];
		}
		if (local20) {
			this.aByteArray52 = new byte[this.anInt4493];
		}
		if (local22) {
			this.aShortArray159 = new short[this.anInt4493];
		}
		if (local24) {
			this.aByteArray54 = new byte[this.anInt4493];
		}
		if (this.anInt4491 > 0) {
			this.anIntArray407 = new int[this.anInt4491];
			this.anIntArray408 = new int[this.anInt4491];
			this.anIntArray409 = new int[this.anInt4491];
		}
		this.anInt4492 = 0;
		this.anInt4493 = 0;
		this.anInt4491 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class7_Sub7_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt4493; local229++) {
					this.anIntArray412[this.anInt4493] = local225.anIntArray412[local229] + this.anInt4492;
					this.anIntArray405[this.anInt4493] = local225.anIntArray405[local229] + this.anInt4492;
					this.anIntArray406[this.anInt4493] = local225.anIntArray406[local229] + this.anInt4492;
					this.anIntArray403[this.anInt4493] = local225.anIntArray403[local229];
					this.anIntArray413[this.anInt4493] = local225.anIntArray413[local229];
					this.anIntArray411[this.anInt4493] = local225.anIntArray411[local229];
					if (local18) {
						if (local225.aByteArray53 == null) {
							this.aByteArray53[this.anInt4493] = local225.aByte13;
						} else {
							this.aByteArray53[this.anInt4493] = local225.aByteArray53[local229];
						}
					}
					if (local20 && local225.aByteArray52 != null) {
						this.aByteArray52[this.anInt4493] = local225.aByteArray52[local229];
					}
					if (local22) {
						if (local225.aShortArray159 == null) {
							this.aShortArray159[this.anInt4493] = -1;
						} else {
							this.aShortArray159[this.anInt4493] = local225.aShortArray159[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray54 == null || local225.aByteArray54[local229] == -1) {
							this.aByteArray54[this.anInt4493] = -1;
						} else {
							this.aByteArray54[this.anInt4493] = (byte) (local225.aByteArray54[local229] + this.anInt4491);
						}
					}
					this.anInt4493++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt4491; local394++) {
					this.anIntArray407[this.anInt4491] = local225.anIntArray407[local394] + this.anInt4492;
					this.anIntArray408[this.anInt4491] = local225.anIntArray408[local394] + this.anInt4492;
					this.anIntArray409[this.anInt4491] = local225.anIntArray409[local394] + this.anInt4492;
					this.anInt4491++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt4492; local444++) {
					this.anIntArray410[this.anInt4492] = local225.anIntArray410[local444];
					this.anIntArray404[this.anInt4492] = local225.anIntArray404[local444];
					this.anIntArray420[this.anInt4492] = local225.anIntArray420[local444];
					this.anInt4492++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "()I")
	@Override
	public int method3162() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ug;)Lclient!ug;")
	public Class7_Sub7 method3169(@OriginalArg(0) Class7_Sub7 arg0) {
		return new Class7_Sub7_Sub1(new Class7_Sub7_Sub1[] { this, (Class7_Sub7_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "()V")
	@Override
	public void method3165() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4492; local1++) {
			@Pc(7) int local7 = this.anIntArray410[local1];
			this.anIntArray410[local1] = this.anIntArray420[local1];
			this.anIntArray420[local1] = -local7;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "()V")
	private void method3170() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4492; local17++) {
			@Pc(23) int local23 = this.anIntArray410[local17];
			@Pc(28) int local28 = this.anIntArray404[local17];
			@Pc(33) int local33 = this.anIntArray420[local17];
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
		this.aShort17 = (short) local7;
		this.aShort15 = (short) local3;
		this.aShort14 = (short) local9;
		this.aShort19 = (short) local5;
		this.aShort20 = (short) local11;
		this.aShort18 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort13 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean192 = true;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	private void method3171(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static45.anInt1015;
		@Pc(3) int local3 = Static45.anInt1014;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray412[arg0];
		@Pc(15) int local15 = this.anIntArray405[arg0];
		@Pc(20) int local20 = this.anIntArray406[arg0];
		@Pc(24) int local24 = Static215.anIntArray419[local10];
		@Pc(28) int local28 = Static215.anIntArray419[local15];
		@Pc(32) int local32 = Static215.anIntArray419[local20];
		if (this.aByteArray52 == null) {
			Static45.anInt1013 = 0;
		} else {
			Static45.anInt1013 = this.aByteArray52[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static215.anIntArray425[0] = Static215.anIntArray414[local10];
			Static215.anIntArray418[0] = Static215.anIntArray416[local10];
			local5++;
			Static215.anIntArray428[0] = this.anIntArray403[arg0];
		} else {
			local73 = Static215.anIntArray417[local10];
			local77 = Static215.anIntArray427[local10];
			local82 = this.anIntArray403[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class26.anIntArray80[local32 - local24];
				Static215.anIntArray425[0] = local1 + (local73 + ((Static215.anIntArray417[local20] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[0] = local3 + (local77 + ((Static215.anIntArray427[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static215.anIntArray428[0] = local82 + ((this.anIntArray411[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class26.anIntArray80[local28 - local24];
				Static215.anIntArray425[local5] = local1 + (local73 + ((Static215.anIntArray417[local15] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[local5] = local3 + (local77 + ((Static215.anIntArray427[local15] - local77) * local95 >> 16) << 9) / 50;
				Static215.anIntArray428[local5++] = local82 + ((this.anIntArray413[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static215.anIntArray425[local5] = Static215.anIntArray414[local15];
			Static215.anIntArray418[local5] = Static215.anIntArray416[local15];
			Static215.anIntArray428[local5++] = this.anIntArray413[arg0];
		} else {
			local73 = Static215.anIntArray417[local15];
			local77 = Static215.anIntArray427[local15];
			local82 = this.anIntArray413[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class26.anIntArray80[local24 - local28];
				Static215.anIntArray425[local5] = local1 + (local73 + ((Static215.anIntArray417[local10] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[local5] = local3 + (local77 + ((Static215.anIntArray427[local10] - local77) * local95 >> 16) << 9) / 50;
				Static215.anIntArray428[local5++] = local82 + ((this.anIntArray403[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class26.anIntArray80[local32 - local28];
				Static215.anIntArray425[local5] = local1 + (local73 + ((Static215.anIntArray417[local20] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[local5] = local3 + (local77 + ((Static215.anIntArray427[local20] - local77) * local95 >> 16) << 9) / 50;
				Static215.anIntArray428[local5++] = local82 + ((this.anIntArray411[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static215.anIntArray425[local5] = Static215.anIntArray414[local20];
			Static215.anIntArray418[local5] = Static215.anIntArray416[local20];
			Static215.anIntArray428[local5++] = this.anIntArray411[arg0];
		} else {
			local73 = Static215.anIntArray417[local20];
			local77 = Static215.anIntArray427[local20];
			local82 = this.anIntArray411[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class26.anIntArray80[local28 - local32];
				Static215.anIntArray425[local5] = local1 + (local73 + ((Static215.anIntArray417[local15] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[local5] = local3 + (local77 + ((Static215.anIntArray427[local15] - local77) * local95 >> 16) << 9) / 50;
				Static215.anIntArray428[local5++] = local82 + ((this.anIntArray413[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class26.anIntArray80[local24 - local32];
				Static215.anIntArray425[local5] = local1 + (local73 + ((Static215.anIntArray417[local10] - local73) * local95 >> 16) << 9) / 50;
				Static215.anIntArray418[local5] = local3 + (local77 + ((Static215.anIntArray427[local10] - local77) * local95 >> 16) << 9) / 50;
				Static215.anIntArray428[local5++] = local82 + ((this.anIntArray403[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static215.anIntArray425[0];
		local77 = Static215.anIntArray425[1];
		local82 = Static215.anIntArray425[2];
		local95 = Static215.anIntArray418[0];
		@Pc(590) int local590 = Static215.anIntArray418[1];
		@Pc(594) int local594 = Static215.anIntArray418[2];
		Static45.aBoolean44 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static45.anInt1016 || local77 > Static45.anInt1016 || local82 > Static45.anInt1016) {
				Static45.aBoolean44 = true;
			}
			if (this.aShortArray159 != null && this.aShortArray159[arg0] != -1) {
				if (this.aByteArray54 == null || this.aByteArray54[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray54[arg0] & 0xFF;
					local683 = this.anIntArray407[local678];
					local688 = this.anIntArray408[local678];
					local693 = this.anIntArray409[local678];
				}
				if (this.anIntArray411[arg0] == -1) {
					Static45.method704(local95, local590, local594, local73, local77, local82, this.anIntArray403[arg0], this.anIntArray403[arg0], this.anIntArray403[arg0], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], this.aShortArray159[arg0]);
				} else {
					Static45.method704(local95, local590, local594, local73, local77, local82, Static215.anIntArray428[0], Static215.anIntArray428[1], Static215.anIntArray428[2], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], this.aShortArray159[arg0]);
				}
			} else if (this.anIntArray411[arg0] == -1) {
				Static45.method709(local95, local590, local594, local73, local77, local82, Static45.anIntArray79[this.anIntArray403[arg0]]);
			} else {
				Static45.method699(local95, local590, local594, local73, local77, local82, Static215.anIntArray428[0], Static215.anIntArray428[1], Static215.anIntArray428[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static45.anInt1016 || local77 > Static45.anInt1016 || local82 > Static45.anInt1016 || Static215.anIntArray425[3] < 0 || Static215.anIntArray425[3] > Static45.anInt1016) {
			Static45.aBoolean44 = true;
		}
		if (this.aShortArray159 == null || this.aShortArray159[arg0] == -1) {
			if (this.anIntArray411[arg0] == -1) {
				local683 = Static45.anIntArray79[this.anIntArray403[arg0]];
				Static45.method709(local95, local590, local594, local73, local77, local82, local683);
				Static45.method709(local95, local594, Static215.anIntArray418[3], local73, local82, Static215.anIntArray425[3], local683);
				return;
			}
			Static45.method699(local95, local590, local594, local73, local77, local82, Static215.anIntArray428[0], Static215.anIntArray428[1], Static215.anIntArray428[2]);
			Static45.method699(local95, local594, Static215.anIntArray418[3], local73, local82, Static215.anIntArray425[3], Static215.anIntArray428[0], Static215.anIntArray428[2], Static215.anIntArray428[3]);
			return;
		}
		if (this.aByteArray54 == null || this.aByteArray54[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray54[arg0] & 0xFF;
			local683 = this.anIntArray407[local678];
			local688 = this.anIntArray408[local678];
			local693 = this.anIntArray409[local678];
		}
		@Pc(956) short local956 = this.aShortArray159[arg0];
		if (this.anIntArray411[arg0] == -1) {
			Static45.method704(local95, local590, local594, local73, local77, local82, this.anIntArray403[arg0], this.anIntArray403[arg0], this.anIntArray403[arg0], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], local956);
			Static45.method704(local95, local594, Static215.anIntArray418[3], local73, local82, Static215.anIntArray425[3], this.anIntArray403[arg0], this.anIntArray403[arg0], this.anIntArray403[arg0], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], local956);
			return;
		}
		Static45.method704(local95, local590, local594, local73, local77, local82, Static215.anIntArray428[0], Static215.anIntArray428[1], Static215.anIntArray428[2], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], local956);
		Static45.method704(local95, local594, Static215.anIntArray418[3], local73, local82, Static215.anIntArray425[3], Static215.anIntArray428[0], Static215.anIntArray428[2], Static215.anIntArray428[3], Static215.anIntArray417[local683], Static215.anIntArray417[local688], Static215.anIntArray417[local693], Static215.anIntArray427[local683], Static215.anIntArray427[local688], Static215.anIntArray427[local693], Static215.anIntArray419[local683], Static215.anIntArray419[local688], Static215.anIntArray419[local693], local956);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(III)V")
	@Override
	public void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4492; local1++) {
			this.anIntArray410[local1] = this.anIntArray410[local1] * arg0 / 128;
			this.anIntArray404[local1] = this.anIntArray404[local1] * arg1 / 128;
			this.anIntArray420[local1] = this.anIntArray420[local1] * arg2 / 128;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)V")
	@Override
	public void method3154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4492; local1++) {
			this.anIntArray410[local1] += arg0;
			this.anIntArray404[local1] += arg1;
			this.anIntArray420[local1] += arg2;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Lclient!ug;")
	@Override
	public Class7_Sub7 method3156(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static215.aByteArray55.length < this.anInt4493) {
			Static215.aByteArray55 = new byte[this.anInt4493 + 100];
		}
		return this.method3178(arg0, Static215.aClass7_Sub7_Sub1_1, Static215.aByteArray55);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ud;I)V")
	@Override
	public void method3160(@OriginalArg(0) Class2_Sub1_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray40 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class51 local12 = arg0.aClass51Array1[arg1];
		@Pc(15) Class2_Sub12 local15 = local12.aClass2_Sub12_1;
		Static215.anInt4495 = 0;
		Static215.anInt4496 = 0;
		Static215.anInt4494 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2297; local23++) {
			@Pc(29) short local29 = local12.aShortArray83[local23];
			if (local12.aShortArray79[local23] != -1) {
				this.method3177(0, local15.anIntArrayArray18[local12.aShortArray79[local23]], 0, 0, 0);
			}
			this.method3177(local15.anIntArray216[local29], local15.anIntArrayArray18[local29], local12.aShortArray82[local23], local12.aShortArray87[local23], local12.aShortArray78[local23]);
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "()I")
	@Override
	public int method3155() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean192) {
			this.method3170();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort18 * arg2 + this.aShort14 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort18 * arg2 + this.aShort15 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort18 << 9;
		if (local78 / local38 <= Static14.anInt340) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort18 << 9;
		if (local91 / local38 >= Static34.anInt822) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort18 * arg1 + this.aShort14 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static131.anInt1516) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort18 * arg1 + this.aShort15 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static143.anInt3031) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt4491 > 0;
		@Pc(172) int local172 = Static45.anInt1015;
		@Pc(174) int local174 = Static45.anInt1014;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class26.anIntArray77[arg0];
			local178 = Class26.anIntArray76[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static131.aBoolean65 && local57 > 0) {
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
			if (Static73.anInt1498 >= local204 && Static73.anInt1498 <= local208 && Static5.anInt168 >= local223 && Static5.anInt168 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort16, this.aShort17, this.aShort16, this.aShort17, this.aShort16, this.aShort17, this.aShort16, this.aShort17 };
				@Pc(342) int[] local342 = new int[] { this.aShort19, this.aShort19, this.aShort20, this.aShort20, this.aShort19, this.aShort19, this.aShort20, this.aShort20 };
				@Pc(385) int[] local385 = new int[] { this.aShort15, this.aShort15, this.aShort15, this.aShort15, this.aShort14, this.aShort14, this.aShort14, this.aShort14 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(392) int local392 = local299[local387];
					@Pc(396) int local396 = local385[local387];
					@Pc(400) int local400 = local342[local387];
					@Pc(412) int local412;
					if (arg0 != 0) {
						local412 = local400 * local176 + local392 * local178 >> 16;
						local400 = local400 * local178 - local392 * local176 >> 16;
						local392 = local412;
					}
					local392 += arg5;
					local396 += arg6;
					local400 += arg7;
					local412 = local400 * arg3 + local392 * arg4 >> 16;
					local400 = local400 * arg4 - local392 * arg3 >> 16;
					local392 = local412;
					local412 = local396 * arg2 - local400 * arg1 >> 16;
					local400 = local396 * arg1 + local400 * arg2 >> 16;
					if (local400 > 0) {
						@Pc(488) int local488 = (local392 << 9) / local400;
						@Pc(494) int local494 = (local412 << 9) / local400;
						if (local488 < local204) {
							local204 = local488;
						}
						if (local488 > local208) {
							local208 = local488;
						}
						if (local494 < local223) {
							local223 = local494;
						}
						if (local494 > local227) {
							local227 = local494;
						}
					}
				}
				if (Static73.anInt1498 >= local204 && Static73.anInt1498 <= local208 && Static5.anInt168 >= local223 && Static5.anInt168 <= local227) {
					if (super.aBoolean191) {
						Static211.aLongArray12[Static125.anInt2768++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt4492; local204++) {
			local223 = this.anIntArray410[local204];
			local208 = this.anIntArray404[local204];
			local227 = this.anIntArray420[local204];
			@Pc(574) int local574;
			if (arg0 != 0) {
				local574 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local574;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local574 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local574;
			local574 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static215.anIntArray421[local204] = local227 - local24;
			if (local227 >= 50) {
				Static215.anIntArray414[local204] = local172 + (local223 << 9) / local227;
				Static215.anIntArray416[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static215.anIntArray414[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static215.anIntArray417[local204] = local223;
				Static215.anIntArray427[local204] = local574;
				Static215.anIntArray419[local204] = local227;
			}
		}
		try {
			this.method3173(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean192) {
				this.method3170();
			}
			@Pc(6) int local6 = Static45.anInt1015;
			@Pc(8) int local8 = Static45.anInt1014;
			@Pc(12) int local12 = Class26.anIntArray77[0];
			@Pc(16) int local16 = Class26.anIntArray76[0];
			@Pc(20) int local20 = Class26.anIntArray77[arg0];
			@Pc(24) int local24 = Class26.anIntArray76[arg0];
			@Pc(28) int local28 = Class26.anIntArray77[arg1];
			@Pc(32) int local32 = Class26.anIntArray76[arg1];
			@Pc(36) int local36 = Class26.anIntArray77[arg2];
			@Pc(40) int local40 = Class26.anIntArray76[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4492; local52++) {
				@Pc(58) int local58 = this.anIntArray410[local52];
				@Pc(63) int local63 = this.anIntArray404[local52];
				@Pc(68) int local68 = this.anIntArray420[local52];
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
				Static215.anIntArray421[local52] = local68 - local50;
				Static215.anIntArray414[local52] = local6 + (local58 << 9) / local68;
				Static215.anIntArray416[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt4491 > 0) {
					Static215.anIntArray417[local52] = local58;
					Static215.anIntArray427[local52] = local80;
					Static215.anIntArray419[local52] = local68;
				}
			}
			this.method3173(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "()I")
	@Override
	public int method3168() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "()I")
	@Override
	public int method3157() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZJII)V")
	private void method3173(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static215.anIntArray423[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt4493; local16++) {
			if (this.anIntArray411[local16] != -2) {
				local28 = this.anIntArray412[local16];
				local33 = this.anIntArray405[local16];
				local38 = this.anIntArray406[local16];
				local42 = Static215.anIntArray414[local28];
				local46 = Static215.anIntArray414[local33];
				local50 = Static215.anIntArray414[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static215.anIntArray417[local28];
					local69 = Static215.anIntArray417[local33];
					@Pc(73) int local73 = Static215.anIntArray417[local38];
					@Pc(77) int local77 = Static215.anIntArray427[local28];
					local81 = Static215.anIntArray427[local33];
					local85 = Static215.anIntArray427[local38];
					@Pc(89) int local89 = Static215.anIntArray419[local28];
					local93 = Static215.anIntArray419[local33];
					@Pc(97) int local97 = Static215.anIntArray419[local38];
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
						Static215.aBooleanArray26[local16] = true;
						@Pc(177) int local177 = (Static215.anIntArray421[local28] + Static215.anIntArray421[local33] + Static215.anIntArray421[local38]) / 3 + arg3;
						Static215.anIntArrayArray39[local177][Static215.anIntArray423[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method3176(Static73.anInt1498 + Static45.anInt1015, Static5.anInt168 + Static45.anInt1014, Static215.anIntArray416[local28], Static215.anIntArray416[local33], Static215.anIntArray416[local38], local42, local46, local50)) {
						Static211.aLongArray12[Static125.anInt2768++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static215.anIntArray416[local38] - Static215.anIntArray416[local33]) - (Static215.anIntArray416[local28] - Static215.anIntArray416[local33]) * (local50 - local46) > 0) {
						Static215.aBooleanArray26[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static45.anInt1016 && local46 <= Static45.anInt1016 && local50 <= Static45.anInt1016) {
							Static215.aBooleanArray25[local16] = false;
						} else {
							Static215.aBooleanArray25[local16] = true;
						}
						local65 = (Static215.anIntArray421[local28] + Static215.anIntArray421[local33] + Static215.anIntArray421[local38]) / 3 + arg3;
						Static215.anIntArrayArray39[local65][Static215.anIntArray423[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray53 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static215.anIntArray423[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static215.anIntArrayArray39[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method3179(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static215.anIntArray415[local28] = 0;
			Static215.anIntArray424[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static215.anIntArray423[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static215.anIntArrayArray39[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray53[local50];
					local69 = Static215.anIntArray415[local386]++;
					Static215.anIntArrayArray38[local386][local69] = local50;
					if (local386 < 10) {
						Static215.anIntArray424[local386] += local33;
					} else if (local386 == 10) {
						Static215.anIntArray426[local69] = local33;
					} else {
						Static215.anIntArray422[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static215.anIntArray415[1] > 0 || Static215.anIntArray415[2] > 0) {
			local38 = (Static215.anIntArray424[1] + Static215.anIntArray424[2]) / (Static215.anIntArray415[1] + Static215.anIntArray415[2]);
		}
		local42 = 0;
		if (Static215.anIntArray415[3] > 0 || Static215.anIntArray415[4] > 0) {
			local42 = (Static215.anIntArray424[3] + Static215.anIntArray424[4]) / (Static215.anIntArray415[3] + Static215.anIntArray415[4]);
		}
		local46 = 0;
		if (Static215.anIntArray415[6] > 0 || Static215.anIntArray415[8] > 0) {
			local46 = (Static215.anIntArray424[6] + Static215.anIntArray424[8]) / (Static215.anIntArray415[6] + Static215.anIntArray415[8]);
		}
		local65 = 0;
		local69 = Static215.anIntArray415[10];
		@Pc(519) int[] local519 = Static215.anIntArrayArray38[10];
		@Pc(521) int[] local521 = Static215.anIntArray426;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static215.anIntArray415[11];
			local519 = Static215.anIntArrayArray38[11];
			local521 = Static215.anIntArray422;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method3179(local519[local65++]);
				if (local65 == local69 && local519 != Static215.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static215.anIntArray415[11];
					local519 = Static215.anIntArrayArray38[11];
					local521 = Static215.anIntArray422;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method3179(local519[local65++]);
				if (local65 == local69 && local519 != Static215.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static215.anIntArray415[11];
					local519 = Static215.anIntArrayArray38[11];
					local521 = Static215.anIntArray422;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method3179(local519[local65++]);
				if (local65 == local69 && local519 != Static215.anIntArrayArray38[11]) {
					local65 = 0;
					local69 = Static215.anIntArray415[11];
					local519 = Static215.anIntArrayArray38[11];
					local521 = Static215.anIntArray422;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static215.anIntArray415[local81];
			@Pc(684) int[] local684 = Static215.anIntArrayArray38[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method3179(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method3179(local519[local65++]);
			if (local65 == local69 && local519 != Static215.anIntArrayArray38[11]) {
				local65 = 0;
				local519 = Static215.anIntArrayArray38[11];
				local69 = Static215.anIntArray415[11];
				local521 = Static215.anIntArray422;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)Lclient!ug;")
	@Override
	public Class7_Sub7 method3164(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static215.aByteArray56.length < this.anInt4493) {
			Static215.aByteArray56 = new byte[this.anInt4493 + 100];
		}
		return this.method3178(arg0, Static215.aClass7_Sub7_Sub1_2, Static215.aByteArray56);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([[IIIIZI)Lclient!wh;")
	public Class7_Sub7_Sub1 method3174(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (!this.aBoolean192) {
			this.method3170();
		}
		@Pc(9) int local9 = arg1 + this.aShort16;
		@Pc(14) int local14 = arg1 + this.aShort17;
		@Pc(19) int local19 = arg3 + this.aShort19;
		@Pc(24) int local24 = arg3 + this.aShort20;
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
		@Pc(104) Class7_Sub7_Sub1 local104;
		if (arg4) {
			local104 = new Class7_Sub7_Sub1();
			local104.anInt4492 = this.anInt4492;
			local104.anInt4493 = this.anInt4493;
			local104.anInt4491 = this.anInt4491;
			local104.anIntArray410 = this.anIntArray410;
			local104.anIntArray420 = this.anIntArray420;
			local104.anIntArray412 = this.anIntArray412;
			local104.anIntArray405 = this.anIntArray405;
			local104.anIntArray406 = this.anIntArray406;
			local104.anIntArray403 = this.anIntArray403;
			local104.anIntArray413 = this.anIntArray413;
			local104.anIntArray411 = this.anIntArray411;
			local104.aByteArray53 = this.aByteArray53;
			local104.aByteArray52 = this.aByteArray52;
			local104.aByteArray54 = this.aByteArray54;
			local104.aShortArray159 = this.aShortArray159;
			local104.aByte13 = this.aByte13;
			local104.anIntArray407 = this.anIntArray407;
			local104.anIntArray408 = this.anIntArray408;
			local104.anIntArray409 = this.anIntArray409;
			local104.anIntArrayArray40 = this.anIntArrayArray40;
			local104.anIntArrayArray37 = this.anIntArrayArray37;
			local104.aBoolean191 = super.aBoolean191;
			local104.anIntArray404 = new int[local104.anInt4492];
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
			for (local204 = 0; local204 < local104.anInt4492; local204++) {
				local212 = this.anIntArray410[local204] + arg1;
				local219 = this.anIntArray420[local204] + arg3;
				local223 = local212 & 0x7F;
				local227 = local219 & 0x7F;
				local231 = local212 >> 7;
				local235 = local219 >> 7;
				local257 = arg0[local231][local235] * (128 - local223) + arg0[local231 + 1][local235] * local223 >> 7;
				local283 = arg0[local231][local235 + 1] * (128 - local223) + arg0[local231 + 1][local235 + 1] * local223 >> 7;
				local295 = local257 * (128 - local227) + local283 * local227 >> 7;
				local104.anIntArray404[local204] = this.anIntArray404[local204] + local295 - arg2;
			}
		} else {
			for (local204 = 0; local204 < local104.anInt4492; local204++) {
				local212 = (this.anIntArray404[local204] << 16) / this.aShort15;
				if (local212 < arg5) {
					local219 = this.anIntArray410[local204] + arg1;
					local223 = this.anIntArray420[local204] + arg3;
					local227 = local219 & 0x7F;
					local231 = local223 & 0x7F;
					local235 = local219 >> 7;
					local257 = local223 >> 7;
					local283 = arg0[local235][local257] * (128 - local227) + arg0[local235 + 1][local257] * local227 >> 7;
					local295 = arg0[local235][local257 + 1] * (128 - local227) + arg0[local235 + 1][local257 + 1] * local227 >> 7;
					@Pc(419) int local419 = local283 * (128 - local231) + local295 * local231 >> 7;
					local104.anIntArray404[local204] = this.anIntArray404[local204] + (local419 - arg2) * (arg5 - local212) / arg5;
				} else {
					local104.anIntArray404[local204] = this.anIntArray404[local204];
				}
			}
		}
		local104.aBoolean192 = false;
		return local104;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[IIII)V")
	private void method3177(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static215.anInt4495 = 0;
			Static215.anInt4496 = 0;
			Static215.anInt4494 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray40.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray40[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static215.anInt4495 += this.anIntArray410[local36];
						Static215.anInt4496 += this.anIntArray404[local36];
						Static215.anInt4494 += this.anIntArray420[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static215.anInt4495 = Static215.anInt4495 / local6 + arg2;
				Static215.anInt4496 = Static215.anInt4496 / local6 + arg3;
				Static215.anInt4494 = Static215.anInt4494 / local6 + arg4;
			} else {
				Static215.anInt4495 = arg2;
				Static215.anInt4496 = arg3;
				Static215.anInt4494 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray410[local31] += arg2;
						this.anIntArray404[local31] += arg3;
						this.anIntArray420[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray410[local31] -= Static215.anInt4495;
						this.anIntArray404[local31] -= Static215.anInt4496;
						this.anIntArray420[local31] -= Static215.anInt4494;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class26.anIntArray77[arg4];
							local217 = Class26.anIntArray76[arg4];
							local235 = this.anIntArray404[local31] * local36 + this.anIntArray410[local31] * local217 + 32767 >> 16;
							this.anIntArray404[local31] = this.anIntArray404[local31] * local217 + 32767 - this.anIntArray410[local31] * local36 >> 16;
							this.anIntArray410[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class26.anIntArray77[arg2];
							local217 = Class26.anIntArray76[arg2];
							local235 = this.anIntArray404[local31] * local217 + 32767 - this.anIntArray420[local31] * local36 >> 16;
							this.anIntArray420[local31] = this.anIntArray404[local31] * local36 + this.anIntArray420[local31] * local217 + 32767 >> 16;
							this.anIntArray404[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class26.anIntArray77[arg3];
							local217 = Class26.anIntArray76[arg3];
							local235 = this.anIntArray420[local31] * local36 + this.anIntArray410[local31] * local217 + 32767 >> 16;
							this.anIntArray420[local31] = this.anIntArray420[local31] * local217 + 32767 - this.anIntArray410[local31] * local36 >> 16;
							this.anIntArray410[local31] = local235;
						}
						this.anIntArray410[local31] += Static215.anInt4495;
						this.anIntArray404[local31] += Static215.anInt4496;
						this.anIntArray420[local31] += Static215.anInt4494;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray40.length) {
					local115 = this.anIntArrayArray40[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray410[local31] -= Static215.anInt4495;
						this.anIntArray404[local31] -= Static215.anInt4496;
						this.anIntArray420[local31] -= Static215.anInt4494;
						this.anIntArray410[local31] = this.anIntArray410[local31] * arg2 / 128;
						this.anIntArray404[local31] = this.anIntArray404[local31] * arg3 / 128;
						this.anIntArray420[local31] = this.anIntArray420[local31] * arg4 / 128;
						this.anIntArray410[local31] += Static215.anInt4495;
						this.anIntArray404[local31] += Static215.anInt4496;
						this.anIntArray420[local31] += Static215.anInt4494;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray37 != null && this.aByteArray52 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray37.length) {
					local115 = this.anIntArrayArray37[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray52[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray52[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()I")
	@Override
	public int method3152() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		if (!this.aBoolean192) {
			this.method3170();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!wh;[B)Lclient!ug;")
	private Class7_Sub7 method3178(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7_Sub7_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt4492 = this.anInt4492;
		arg1.anInt4493 = this.anInt4493;
		arg1.anInt4491 = this.anInt4491;
		if (arg1.anIntArray410 == null || arg1.anIntArray410.length < this.anInt4492) {
			arg1.anIntArray410 = new int[this.anInt4492 + 100];
			arg1.anIntArray404 = new int[this.anInt4492 + 100];
			arg1.anIntArray420 = new int[this.anInt4492 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt4492; local43++) {
			arg1.anIntArray410[local43] = this.anIntArray410[local43];
			arg1.anIntArray404[local43] = this.anIntArray404[local43];
			arg1.anIntArray420[local43] = this.anIntArray420[local43];
		}
		if (arg0) {
			arg1.aByteArray52 = this.aByteArray52;
		} else {
			arg1.aByteArray52 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray52 == null) {
				for (local88 = 0; local88 < this.anInt4493; local88++) {
					arg1.aByteArray52[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt4493; local88++) {
					arg1.aByteArray52[local88] = this.aByteArray52[local88];
				}
			}
		}
		arg1.anIntArray412 = this.anIntArray412;
		arg1.anIntArray405 = this.anIntArray405;
		arg1.anIntArray406 = this.anIntArray406;
		arg1.anIntArray403 = this.anIntArray403;
		arg1.anIntArray413 = this.anIntArray413;
		arg1.anIntArray411 = this.anIntArray411;
		arg1.aByteArray53 = this.aByteArray53;
		arg1.aByteArray54 = this.aByteArray54;
		arg1.aShortArray159 = this.aShortArray159;
		arg1.aByte13 = this.aByte13;
		arg1.anIntArray407 = this.anIntArray407;
		arg1.anIntArray408 = this.anIntArray408;
		arg1.anIntArray409 = this.anIntArray409;
		arg1.anIntArrayArray40 = this.anIntArrayArray40;
		arg1.anIntArrayArray37 = this.anIntArrayArray37;
		arg1.aBoolean191 = super.aBoolean191;
		arg1.aBoolean192 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "()V")
	@Override
	public void method3158() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4492; local1++) {
			this.anIntArray410[local1] = -this.anIntArray410[local1];
			this.anIntArray420[local1] = -this.anIntArray420[local1];
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	private void method3179(@OriginalArg(0) int arg0) {
		if (Static215.aBooleanArray26[arg0]) {
			this.method3171(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray412[arg0];
		@Pc(17) int local17 = this.anIntArray405[arg0];
		@Pc(22) int local22 = this.anIntArray406[arg0];
		Static45.aBoolean44 = Static215.aBooleanArray25[arg0];
		if (this.aByteArray52 == null) {
			Static45.anInt1013 = 0;
		} else {
			Static45.anInt1013 = this.aByteArray52[arg0] & 0xFF;
		}
		if (this.aShortArray159 != null && this.aShortArray159[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray54 == null || this.aByteArray54[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray54[arg0] & 0xFF;
				local133 = this.anIntArray407[local128];
				local138 = this.anIntArray408[local128];
				local143 = this.anIntArray409[local128];
			}
			if (this.anIntArray411[arg0] == -1) {
				Static45.method704(Static215.anIntArray416[local12], Static215.anIntArray416[local17], Static215.anIntArray416[local22], Static215.anIntArray414[local12], Static215.anIntArray414[local17], Static215.anIntArray414[local22], this.anIntArray403[arg0], this.anIntArray403[arg0], this.anIntArray403[arg0], Static215.anIntArray417[local133], Static215.anIntArray417[local138], Static215.anIntArray417[local143], Static215.anIntArray427[local133], Static215.anIntArray427[local138], Static215.anIntArray427[local143], Static215.anIntArray419[local133], Static215.anIntArray419[local138], Static215.anIntArray419[local143], this.aShortArray159[arg0]);
			} else {
				Static45.method704(Static215.anIntArray416[local12], Static215.anIntArray416[local17], Static215.anIntArray416[local22], Static215.anIntArray414[local12], Static215.anIntArray414[local17], Static215.anIntArray414[local22], this.anIntArray403[arg0], this.anIntArray413[arg0], this.anIntArray411[arg0], Static215.anIntArray417[local133], Static215.anIntArray417[local138], Static215.anIntArray417[local143], Static215.anIntArray427[local133], Static215.anIntArray427[local138], Static215.anIntArray427[local143], Static215.anIntArray419[local133], Static215.anIntArray419[local138], Static215.anIntArray419[local143], this.aShortArray159[arg0]);
			}
		} else if (this.anIntArray411[arg0] == -1) {
			Static45.method709(Static215.anIntArray416[local12], Static215.anIntArray416[local17], Static215.anIntArray416[local22], Static215.anIntArray414[local12], Static215.anIntArray414[local17], Static215.anIntArray414[local22], Static45.anIntArray79[this.anIntArray403[arg0]]);
		} else {
			Static45.method699(Static215.anIntArray416[local12], Static215.anIntArray416[local17], Static215.anIntArray416[local22], Static215.anIntArray414[local12], Static215.anIntArray414[local17], Static215.anIntArray414[local22], this.anIntArray403[arg0], this.anIntArray413[arg0], this.anIntArray411[arg0]);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	@Override
	public void method3153(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class26.anIntArray77[arg0];
		@Pc(7) int local7 = Class26.anIntArray76[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4492; local9++) {
			@Pc(26) int local26 = this.anIntArray404[local9] * local3 + this.anIntArray410[local9] * local7 >> 16;
			this.anIntArray404[local9] = this.anIntArray404[local9] * local7 - this.anIntArray410[local9] * local3 >> 16;
			this.anIntArray410[local9] = local26;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ud;ILclient!ud;I[I)V")
	@Override
	public void method3159(@OriginalArg(0) Class2_Sub1_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method3160(arg0, arg1);
			return;
		}
		@Pc(18) Class51 local18 = arg0.aClass51Array1[arg1];
		@Pc(23) Class51 local23 = arg2.aClass51Array1[arg3];
		@Pc(26) Class2_Sub12 local26 = local18.aClass2_Sub12_1;
		Static215.anInt4495 = 0;
		Static215.anInt4496 = 0;
		Static215.anInt4494 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2297; local41++) {
			@Pc(47) short local47 = local18.aShortArray83[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray216[local47] == 0) {
				if (local18.aShortArray79[local41] != -1) {
					this.method3177(0, local26.anIntArrayArray18[local18.aShortArray79[local41]], 0, 0, 0);
				}
				this.method3177(local26.anIntArray216[local47], local26.anIntArrayArray18[local47], local18.aShortArray82[local41], local18.aShortArray87[local41], local18.aShortArray78[local41]);
			}
		}
		Static215.anInt4495 = 0;
		Static215.anInt4496 = 0;
		Static215.anInt4494 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2297; local125++) {
			@Pc(131) short local131 = local23.aShortArray83[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray216[local131] == 0) {
				if (local23.aShortArray79[local125] != -1) {
					this.method3177(0, local26.anIntArrayArray18[local23.aShortArray79[local125]], 0, 0, 0);
				}
				this.method3177(local26.anIntArray216[local131], local26.anIntArrayArray18[local131], local23.aShortArray82[local125], local23.aShortArray87[local125], local23.aShortArray78[local125]);
			}
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method3151(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class26.anIntArray77[arg0];
		@Pc(7) int local7 = Class26.anIntArray76[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4492; local9++) {
			@Pc(26) int local26 = this.anIntArray420[local9] * local3 + this.anIntArray410[local9] * local7 >> 16;
			this.anIntArray420[local9] = this.anIntArray420[local9] * local7 - this.anIntArray410[local9] * local3 >> 16;
			this.anIntArray410[local9] = local26;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "()V")
	@Override
	public void method3163() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4492; local1++) {
			@Pc(7) int local7 = this.anIntArray420[local1];
			this.anIntArray420[local1] = this.anIntArray410[local1];
			this.anIntArray410[local1] = -local7;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	public void method3167(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class26.anIntArray77[arg0];
		@Pc(7) int local7 = Class26.anIntArray76[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4492; local9++) {
			@Pc(26) int local26 = this.anIntArray404[local9] * local7 - this.anIntArray420[local9] * local3 >> 16;
			this.anIntArray420[local9] = this.anIntArray404[local9] * local3 + this.anIntArray420[local9] * local7 >> 16;
			this.anIntArray404[local9] = local26;
		}
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIIIIII)V")
	public void method3180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean192) {
				this.method3170();
			}
			@Pc(6) int local6 = Static45.anInt1015;
			@Pc(8) int local8 = Static45.anInt1014;
			@Pc(12) int local12 = Class26.anIntArray77[0];
			@Pc(16) int local16 = Class26.anIntArray76[0];
			@Pc(20) int local20 = Class26.anIntArray77[arg0];
			@Pc(24) int local24 = Class26.anIntArray76[arg0];
			@Pc(28) int local28 = Class26.anIntArray77[arg1];
			@Pc(32) int local32 = Class26.anIntArray76[arg1];
			@Pc(36) int local36 = Class26.anIntArray77[arg2];
			@Pc(40) int local40 = Class26.anIntArray76[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4492; local52++) {
				@Pc(58) int local58 = this.anIntArray410[local52];
				@Pc(63) int local63 = this.anIntArray404[local52];
				@Pc(68) int local68 = this.anIntArray420[local52];
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
				Static215.anIntArray421[local52] = local68 - local50;
				Static215.anIntArray414[local52] = local6 + (local58 << 9) / arg6;
				Static215.anIntArray416[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt4491 > 0) {
					Static215.anIntArray417[local52] = local58;
					Static215.anIntArray427[local52] = local80;
					Static215.anIntArray419[local52] = local68;
				}
			}
			this.method3173(false, false, 0L, this.aShort13, this.aShort13 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}
}
