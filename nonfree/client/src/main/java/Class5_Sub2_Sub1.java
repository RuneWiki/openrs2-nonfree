import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	private int anInt3821 = 0;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public int anInt3820 = 0;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	private int anInt3822 = 0;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!vd;IIIII)V")
	public Class5_Sub2_Sub1(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method3583();
		arg0.method3578();
		this.anInt3820 = arg0.anInt4579;
		this.anIntArray251 = arg0.anIntArray355;
		this.anIntArray257 = arg0.anIntArray350;
		this.anIntArray256 = arg0.anIntArray348;
		this.anInt3821 = arg0.anInt4578;
		this.anIntArray248 = arg0.anIntArray353;
		this.anIntArray253 = arg0.anIntArray349;
		this.anIntArray259 = arg0.anIntArray354;
		this.aByteArray37 = arg0.aByteArray58;
		this.aByteArray38 = arg0.aByteArray59;
		this.aByte16 = arg0.aByte17;
		this.anIntArrayArray27 = arg0.anIntArrayArray38;
		this.anIntArrayArray28 = arg0.anIntArrayArray39;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray250 = new int[this.anInt3821];
		this.anIntArray255 = new int[this.anInt3821];
		this.anIntArray249 = new int[this.anInt3821];
		@Pc(118) int local118;
		if (arg0.aShortArray47 == null) {
			this.aShortArray33 = null;
		} else {
			this.aShortArray33 = new short[this.anInt3821];
			for (local118 = 0; local118 < this.anInt3821; local118++) {
				@Pc(124) short local124 = arg0.aShortArray47[local118];
				if (local124 != -1 && Static171.anInterface3_2.method123(local124)) {
					this.aShortArray33[local118] = local124;
				} else {
					this.aShortArray33[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt4581 > 0 && arg0.aByteArray51 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt4581];
			for (@Pc(164) int local164 = 0; local164 < this.anInt3821; local164++) {
				if (arg0.aByteArray51[local164] != -1) {
					local162[arg0.aByteArray51[local164] & 0xFF]++;
				}
			}
			this.anInt3822 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt4581; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray56[local193] == 0) {
					this.anInt3822++;
				}
			}
			this.anIntArray254 = new int[this.anInt3822];
			this.anIntArray252 = new int[this.anInt3822];
			this.anIntArray258 = new int[this.anInt3822];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt4581; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray56[local233] == 0) {
					this.anIntArray254[local231] = arg0.aShortArray48[local233] & 0xFFFF;
					this.anIntArray252[local231] = arg0.aShortArray53[local233] & 0xFFFF;
					this.anIntArray258[local231] = arg0.aShortArray54[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray36 = new byte[this.anInt3821];
			for (local295 = 0; local295 < this.anInt3821; local295++) {
				if (arg0.aByteArray51[local295] == -1) {
					this.aByteArray36[local295] = -1;
				} else {
					this.aByteArray36[local295] = (byte) local162[arg0.aByteArray51[local295] & 0xFF];
					if (this.aByteArray36[local295] == -1 && this.aShortArray33 != null) {
						this.aShortArray33[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt3821; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray52 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray52[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray59 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray59[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray33 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray33[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class101 local417;
			@Pc(578) Class16 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray50[local118] & 0xFFFF;
					if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray248[local118]] == null) {
						local417 = arg0.aClass101Array2[this.anIntArray248[local118]];
					} else {
						local417 = arg0.aClass101Array1[this.anIntArray248[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
					this.anIntArray250[local118] = Static170.method2936(local398, local295);
					if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray253[local118]] == null) {
						local417 = arg0.aClass101Array2[this.anIntArray253[local118]];
					} else {
						local417 = arg0.aClass101Array1[this.anIntArray253[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
					this.anIntArray255[local118] = Static170.method2936(local398, local295);
					if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray259[local118]] == null) {
						local417 = arg0.aClass101Array2[this.anIntArray259[local118]];
					} else {
						local417 = arg0.aClass101Array1[this.anIntArray259[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
					this.anIntArray249[local118] = Static170.method2936(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass16Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt585 + arg4 * local578.anInt586 + arg5 * local578.anInt588) / (local93 + local93 / 2);
					this.anIntArray250[local118] = Static170.method2936(arg0.aShortArray50[local118] & 0xFFFF, local295);
					this.anIntArray249[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray250[local118] = 128;
					this.anIntArray249[local118] = -1;
				} else {
					this.anIntArray249[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray248[local118]] == null) {
					local417 = arg0.aClass101Array2[this.anIntArray248[local118]];
				} else {
					local417 = arg0.aClass101Array1[this.anIntArray248[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
				this.anIntArray250[local118] = Static170.method2942(local295);
				if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray253[local118]] == null) {
					local417 = arg0.aClass101Array2[this.anIntArray253[local118]];
				} else {
					local417 = arg0.aClass101Array1[this.anIntArray253[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
				this.anIntArray255[local118] = Static170.method2942(local295);
				if (arg0.aClass101Array1 == null || arg0.aClass101Array1[this.anIntArray259[local118]] == null) {
					local417 = arg0.aClass101Array2[this.anIntArray259[local118]];
				} else {
					local417 = arg0.aClass101Array1[this.anIntArray259[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3937 + arg4 * local417.anInt3933 + arg5 * local417.anInt3941) / (local93 * local417.anInt3934);
				this.anIntArray249[local118] = Static170.method2942(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass16Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt585 + arg4 * local578.anInt586 + arg5 * local578.anInt588) / (local93 + local93 / 2);
				this.anIntArray250[local118] = Static170.method2942(local295);
				this.anIntArray249[local118] = -1;
			} else {
				this.anIntArray249[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([Lclient!ra;I)V")
	private Class5_Sub2_Sub1(@OriginalArg(0) Class5_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt3820 = 0;
		this.anInt3821 = 0;
		this.anInt3822 = 0;
		this.aByte16 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class5_Sub2_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt3820 += local43.anInt3820;
				this.anInt3821 += local43.anInt3821;
				this.anInt3822 += local43.anInt3822;
				if (local43.aByteArray37 == null) {
					if (this.aByte16 == -1) {
						this.aByte16 = local43.aByte16;
					}
					if (this.aByte16 != local43.aByte16) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray38 != null;
				local22 |= local43.aShortArray33 != null;
				local24 |= local43.aByteArray36 != null;
			}
		}
		this.anIntArray251 = new int[this.anInt3820];
		this.anIntArray257 = new int[this.anInt3820];
		this.anIntArray256 = new int[this.anInt3820];
		this.anIntArray248 = new int[this.anInt3821];
		this.anIntArray253 = new int[this.anInt3821];
		this.anIntArray259 = new int[this.anInt3821];
		this.anIntArray250 = new int[this.anInt3821];
		this.anIntArray255 = new int[this.anInt3821];
		this.anIntArray249 = new int[this.anInt3821];
		if (local18) {
			this.aByteArray37 = new byte[this.anInt3821];
		}
		if (local20) {
			this.aByteArray38 = new byte[this.anInt3821];
		}
		if (local22) {
			this.aShortArray33 = new short[this.anInt3821];
		}
		if (local24) {
			this.aByteArray36 = new byte[this.anInt3821];
		}
		if (this.anInt3822 > 0) {
			this.anIntArray254 = new int[this.anInt3822];
			this.anIntArray252 = new int[this.anInt3822];
			this.anIntArray258 = new int[this.anInt3822];
		}
		this.anInt3820 = 0;
		this.anInt3821 = 0;
		this.anInt3822 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class5_Sub2_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt3821; local229++) {
					this.anIntArray248[this.anInt3821] = local225.anIntArray248[local229] + this.anInt3820;
					this.anIntArray253[this.anInt3821] = local225.anIntArray253[local229] + this.anInt3820;
					this.anIntArray259[this.anInt3821] = local225.anIntArray259[local229] + this.anInt3820;
					this.anIntArray250[this.anInt3821] = local225.anIntArray250[local229];
					this.anIntArray255[this.anInt3821] = local225.anIntArray255[local229];
					this.anIntArray249[this.anInt3821] = local225.anIntArray249[local229];
					if (local18) {
						if (local225.aByteArray37 == null) {
							this.aByteArray37[this.anInt3821] = local225.aByte16;
						} else {
							this.aByteArray37[this.anInt3821] = local225.aByteArray37[local229];
						}
					}
					if (local20 && local225.aByteArray38 != null) {
						this.aByteArray38[this.anInt3821] = local225.aByteArray38[local229];
					}
					if (local22) {
						if (local225.aShortArray33 == null) {
							this.aShortArray33[this.anInt3821] = -1;
						} else {
							this.aShortArray33[this.anInt3821] = local225.aShortArray33[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray36 == null || local225.aByteArray36[local229] == -1) {
							this.aByteArray36[this.anInt3821] = -1;
						} else {
							this.aByteArray36[this.anInt3821] = (byte) (local225.aByteArray36[local229] + this.anInt3822);
						}
					}
					this.anInt3821++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt3822; local394++) {
					this.anIntArray254[this.anInt3822] = local225.anIntArray254[local394] + this.anInt3820;
					this.anIntArray252[this.anInt3822] = local225.anIntArray252[local394] + this.anInt3820;
					this.anIntArray258[this.anInt3822] = local225.anIntArray258[local394] + this.anInt3820;
					this.anInt3822++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt3820; local444++) {
					this.anIntArray251[this.anInt3820] = local225.anIntArray251[local444];
					this.anIntArray257[this.anInt3820] = local225.anIntArray257[local444];
					this.anIntArray256[this.anInt3820] = local225.anIntArray256[local444];
					this.anInt3820++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3820; local1++) {
			this.anIntArray251[local1] += arg0;
			this.anIntArray257[local1] += arg1;
			this.anIntArray256[local1] += arg2;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ei;)Lclient!ei;")
	public Class5_Sub2 method2934(@OriginalArg(0) Class5_Sub2 arg0) {
		return new Class5_Sub2_Sub1(new Class5_Sub2_Sub1[] { this, (Class5_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
	@Override
	public void method2922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3820; local1++) {
			this.anIntArray251[local1] = this.anIntArray251[local1] * arg0 / 128;
			this.anIntArray257[local1] = this.anIntArray257[local1] * arg1 / 128;
			this.anIntArray256[local1] = this.anIntArray256[local1] * arg2 / 128;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
	@Override
	public int method2915() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qh;I)V")
	@Override
	public void method2932(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray27 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class97 local12 = arg0.aClass97Array1[arg1];
		@Pc(15) Class1_Sub19 local15 = local12.aClass1_Sub19_1;
		Static170.anInt3825 = 0;
		Static170.anInt3824 = 0;
		Static170.anInt3823 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3863; local23++) {
			@Pc(29) short local29 = local12.aShortArray36[local23];
			if (local15.aBooleanArray16[local29]) {
				if (local12.aShortArray39[local23] != -1) {
					this.method2946(0, 0, 0, 0);
				}
				this.method2946(local15.anIntArray158[local29], local12.aShortArray38[local23], local12.aShortArray41[local23], local12.aShortArray43[local23]);
			}
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "()V")
	@Override
	public void method2928() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3820; local1++) {
			@Pc(7) int local7 = this.anIntArray251[local1];
			this.anIntArray251[local1] = this.anIntArray256[local1];
			this.anIntArray256[local1] = -local7;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	private void method2937(@OriginalArg(0) int arg0) {
		if (Static170.aBooleanArray22[arg0]) {
			this.method2947(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray248[arg0];
		@Pc(17) int local17 = this.anIntArray253[arg0];
		@Pc(22) int local22 = this.anIntArray259[arg0];
		Static171.aBoolean179 = Static170.aBooleanArray23[arg0];
		if (this.aByteArray38 == null) {
			Static171.anInt3830 = 0;
		} else {
			Static171.anInt3830 = this.aByteArray38[arg0] & 0xFF;
		}
		if (this.aShortArray33 != null && this.aShortArray33[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray36[arg0] & 0xFF;
				local133 = this.anIntArray254[local128];
				local138 = this.anIntArray252[local128];
				local143 = this.anIntArray258[local128];
			}
			if (this.anIntArray249[arg0] == -1) {
				Static171.method2964(Static170.anIntArray271[local12], Static170.anIntArray271[local17], Static170.anIntArray271[local22], Static170.anIntArray262[local12], Static170.anIntArray262[local17], Static170.anIntArray262[local22], this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static170.anIntArray272[local133], Static170.anIntArray272[local138], Static170.anIntArray272[local143], Static170.anIntArray260[local133], Static170.anIntArray260[local138], Static170.anIntArray260[local143], Static170.anIntArray267[local133], Static170.anIntArray267[local138], Static170.anIntArray267[local143], this.aShortArray33[arg0]);
			} else {
				Static171.method2964(Static170.anIntArray271[local12], Static170.anIntArray271[local17], Static170.anIntArray271[local22], Static170.anIntArray262[local12], Static170.anIntArray262[local17], Static170.anIntArray262[local22], this.anIntArray250[arg0], this.anIntArray255[arg0], this.anIntArray249[arg0], Static170.anIntArray272[local133], Static170.anIntArray272[local138], Static170.anIntArray272[local143], Static170.anIntArray260[local133], Static170.anIntArray260[local138], Static170.anIntArray260[local143], Static170.anIntArray267[local133], Static170.anIntArray267[local138], Static170.anIntArray267[local143], this.aShortArray33[arg0]);
			}
		} else if (this.anIntArray249[arg0] == -1) {
			Static171.method2954(Static170.anIntArray271[local12], Static170.anIntArray271[local17], Static170.anIntArray271[local22], Static170.anIntArray262[local12], Static170.anIntArray262[local17], Static170.anIntArray262[local22], Static171.anIntArray279[this.anIntArray250[arg0]]);
		} else {
			Static171.method2959(Static170.anIntArray271[local12], Static170.anIntArray271[local17], Static170.anIntArray271[local22], Static170.anIntArray262[local12], Static170.anIntArray262[local17], Static170.anIntArray262[local22], this.anIntArray250[arg0], this.anIntArray255[arg0], this.anIntArray249[arg0]);
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()V")
	@Override
	public void method2921() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3820; local1++) {
			this.anIntArray251[local1] = -this.anIntArray251[local1];
			this.anIntArray256[local1] = -this.anIntArray256[local1];
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()I")
	@Override
	public int method2920() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()I")
	@Override
	public int method2914() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "()V")
	private void method2939() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3820; local17++) {
			@Pc(23) int local23 = this.anIntArray251[local17];
			@Pc(28) int local28 = this.anIntArray257[local17];
			@Pc(33) int local33 = this.anIntArray256[local17];
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
		this.aShort17 = (short) local1;
		this.aShort19 = (short) local7;
		this.aShort15 = (short) local3;
		this.aShort20 = (short) local9;
		this.aShort21 = (short) local5;
		this.aShort18 = (short) local11;
		this.aShort14 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort16 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "()V")
	@Override
	public void method2924() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3820; local1++) {
			@Pc(7) int local7 = this.anIntArray256[local1];
			this.anIntArray256[local1] = this.anIntArray251[local1];
			this.anIntArray251[local1] = -local7;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method2930(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class94.anIntArray278[arg0];
		@Pc(7) int local7 = Class94.anIntArray277[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3820; local9++) {
			@Pc(26) int local26 = this.anIntArray256[local9] * local3 + this.anIntArray251[local9] * local7 >> 16;
			this.anIntArray256[local9] = this.anIntArray256[local9] * local7 - this.anIntArray251[local9] * local3 >> 16;
			this.anIntArray251[local9] = local26;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "()I")
	@Override
	public int method2923() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort18;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method2919(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class94.anIntArray278[arg0];
		@Pc(7) int local7 = Class94.anIntArray277[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3820; local9++) {
			@Pc(26) int local26 = this.anIntArray257[local9] * local7 - this.anIntArray256[local9] * local3 >> 16;
			this.anIntArray256[local9] = this.anIntArray257[local9] * local3 + this.anIntArray256[local9] * local7 >> 16;
			this.anIntArray257[local9] = local26;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	@Override
	public void method2927(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class94.anIntArray278[arg0];
		@Pc(7) int local7 = Class94.anIntArray277[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3820; local9++) {
			@Pc(26) int local26 = this.anIntArray257[local9] * local3 + this.anIntArray251[local9] * local7 >> 16;
			this.anIntArray257[local9] = this.anIntArray257[local9] * local7 - this.anIntArray251[local9] * local3 >> 16;
			this.anIntArray251[local9] = local26;
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!ra;")
	public Class5_Sub2_Sub1 method2940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean174) {
			this.method2939();
		}
		@Pc(9) int local9 = arg4 + this.aShort17;
		@Pc(14) int local14 = arg4 + this.aShort19;
		@Pc(19) int local19 = arg6 + this.aShort21;
		@Pc(24) int local24 = arg6 + this.aShort18;
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
		@Pc(150) Class5_Sub2_Sub1 local150;
		if (arg7) {
			local150 = new Class5_Sub2_Sub1();
			local150.anInt3820 = this.anInt3820;
			local150.anInt3821 = this.anInt3821;
			local150.anInt3822 = this.anInt3822;
			local150.anIntArray248 = this.anIntArray248;
			local150.anIntArray253 = this.anIntArray253;
			local150.anIntArray259 = this.anIntArray259;
			local150.anIntArray250 = this.anIntArray250;
			local150.anIntArray255 = this.anIntArray255;
			local150.anIntArray249 = this.anIntArray249;
			local150.aByteArray37 = this.aByteArray37;
			local150.aByteArray38 = this.aByteArray38;
			local150.aByteArray36 = this.aByteArray36;
			local150.aShortArray33 = this.aShortArray33;
			local150.aByte16 = this.aByte16;
			local150.anIntArray254 = this.anIntArray254;
			local150.anIntArray252 = this.anIntArray252;
			local150.anIntArray258 = this.anIntArray258;
			local150.anIntArrayArray27 = this.anIntArrayArray27;
			local150.anIntArrayArray28 = this.anIntArrayArray28;
			local150.aBoolean173 = super.aBoolean173;
			if (arg0 == 3) {
				local150.anIntArray251 = Static212.method3505(this.anIntArray251);
				local150.anIntArray257 = Static212.method3505(this.anIntArray257);
				local150.anIntArray256 = Static212.method3505(this.anIntArray256);
			} else {
				local150.anIntArray251 = this.anIntArray251;
				local150.anIntArray257 = new int[local150.anInt3820];
				local150.anIntArray256 = this.anIntArray256;
			}
		} else {
			local150 = this;
		}
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(288) int local288;
		@Pc(292) int local292;
		@Pc(296) int local296;
		@Pc(300) int local300;
		@Pc(304) int local304;
		@Pc(326) int local326;
		@Pc(352) int local352;
		@Pc(364) int local364;
		if (arg0 == 1) {
			for (local273 = 0; local273 < local150.anInt3820; local273++) {
				local281 = this.anIntArray251[local273] + arg4;
				local288 = this.anIntArray256[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray257[local273] = this.anIntArray257[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt3820; local273++) {
					local281 = (this.anIntArray257[local273] << 16) / this.aShort15;
					if (local281 < arg1) {
						local288 = this.anIntArray251[local273] + arg4;
						local292 = this.anIntArray256[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray257[local273] = this.anIntArray257[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray257[local273] = this.anIntArray257[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method2913(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort20 - this.aShort15;
				for (local281 = 0; local281 < this.anInt3820; local281++) {
					local288 = this.anIntArray251[local281] + arg4;
					local292 = this.anIntArray256[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray257[local281] = this.anIntArray257[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort20 - this.aShort15;
				for (local281 = 0; local281 < this.anInt3820; local281++) {
					local288 = this.anIntArray251[local281] + arg4;
					local292 = this.anIntArray256[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
					local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					@Pc(834) int local834 = local352 * (128 - local300) + local364 * local300 >> 7;
					@Pc(838) int local838 = local491 - local834;
					local150.anIntArray257[local281] = ((this.anIntArray257[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean174 = false;
		return local150;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIIIIII)V")
	public void method2941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean174) {
				this.method2939();
			}
			@Pc(6) int local6 = Static171.anInt3826;
			@Pc(8) int local8 = Static171.anInt3828;
			@Pc(12) int local12 = Class94.anIntArray278[0];
			@Pc(16) int local16 = Class94.anIntArray277[0];
			@Pc(20) int local20 = Class94.anIntArray278[arg0];
			@Pc(24) int local24 = Class94.anIntArray277[arg0];
			@Pc(28) int local28 = Class94.anIntArray278[arg1];
			@Pc(32) int local32 = Class94.anIntArray277[arg1];
			@Pc(36) int local36 = Class94.anIntArray278[arg2];
			@Pc(40) int local40 = Class94.anIntArray277[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3820; local52++) {
				@Pc(58) int local58 = this.anIntArray251[local52];
				@Pc(63) int local63 = this.anIntArray257[local52];
				@Pc(68) int local68 = this.anIntArray256[local52];
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
				Static170.anIntArray261[local52] = local68 - local50;
				Static170.anIntArray262[local52] = local6 + (local58 << 9) / arg6;
				Static170.anIntArray271[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt3822 > 0) {
					Static170.anIntArray272[local52] = local58;
					Static170.anIntArray260[local52] = local80;
					Static170.anIntArray267[local52] = local68;
				}
			}
			this.method2943(false, false, 0L, this.aShort16, this.aShort16 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qh;IZ)V")
	@Override
	public void method2926(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray27 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class97 local12 = arg0.aClass97Array1[arg1];
		@Pc(15) Class1_Sub19 local15 = local12.aClass1_Sub19_1;
		Static170.anInt3825 = 0;
		Static170.anInt3824 = 0;
		Static170.anInt3823 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3863; local23++) {
			@Pc(29) short local29 = local12.aShortArray36[local23];
			if (local12.aShortArray39[local23] != -1) {
				this.method2945(0, local15.anIntArrayArray12[local12.aShortArray39[local23]], 0, 0, 0);
			}
			this.method2945(local15.anIntArray158[local29], local15.anIntArrayArray12[local29], local12.aShortArray38[local23], local12.aShortArray41[local23], local12.aShortArray43[local23]);
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZJII)V")
	private void method2943(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static170.anIntArray265[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < this.anInt3821; local16++) {
			if (this.anIntArray249[local16] != -2) {
				local28 = this.anIntArray248[local16];
				local33 = this.anIntArray253[local16];
				local38 = this.anIntArray259[local16];
				local42 = Static170.anIntArray262[local28];
				local46 = Static170.anIntArray262[local33];
				local50 = Static170.anIntArray262[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static170.anIntArray272[local28];
					local69 = Static170.anIntArray272[local33];
					@Pc(73) int local73 = Static170.anIntArray272[local38];
					@Pc(77) int local77 = Static170.anIntArray260[local28];
					local81 = Static170.anIntArray260[local33];
					local85 = Static170.anIntArray260[local38];
					@Pc(89) int local89 = Static170.anIntArray267[local28];
					local93 = Static170.anIntArray267[local33];
					@Pc(97) int local97 = Static170.anIntArray267[local38];
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
						Static170.aBooleanArray22[local16] = true;
						@Pc(177) int local177 = (Static170.anIntArray261[local28] + Static170.anIntArray261[local33] + Static170.anIntArray261[local38]) / 3 + arg3;
						Static170.anIntArrayArray30[local177][Static170.anIntArray265[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2935(Static190.anInt4108 + Static171.anInt3826, Static207.anInt4439 + Static171.anInt3828, Static170.anIntArray271[local28], Static170.anIntArray271[local33], Static170.anIntArray271[local38], local42, local46, local50)) {
						Static103.aLongArray13[Static156.anInt3428++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static170.anIntArray271[local38] - Static170.anIntArray271[local33]) - (Static170.anIntArray271[local28] - Static170.anIntArray271[local33]) * (local50 - local46) > 0) {
						Static170.aBooleanArray22[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static171.anInt3827 && local46 <= Static171.anInt3827 && local50 <= Static171.anInt3827) {
							Static170.aBooleanArray23[local16] = false;
						} else {
							Static170.aBooleanArray23[local16] = true;
						}
						local65 = (Static170.anIntArray261[local28] + Static170.anIntArray261[local33] + Static170.anIntArray261[local38]) / 3 + arg3;
						Static170.anIntArrayArray30[local65][Static170.anIntArray265[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray37 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static170.anIntArray265[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static170.anIntArrayArray30[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2937(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static170.anIntArray269[local28] = 0;
			Static170.anIntArray273[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static170.anIntArray265[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static170.anIntArrayArray30[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray37[local50];
					local69 = Static170.anIntArray269[local386]++;
					Static170.anIntArrayArray29[local386][local69] = local50;
					if (local386 < 10) {
						Static170.anIntArray273[local386] += local33;
					} else if (local386 == 10) {
						Static170.anIntArray264[local69] = local33;
					} else {
						Static170.anIntArray263[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static170.anIntArray269[1] > 0 || Static170.anIntArray269[2] > 0) {
			local38 = (Static170.anIntArray273[1] + Static170.anIntArray273[2]) / (Static170.anIntArray269[1] + Static170.anIntArray269[2]);
		}
		local42 = 0;
		if (Static170.anIntArray269[3] > 0 || Static170.anIntArray269[4] > 0) {
			local42 = (Static170.anIntArray273[3] + Static170.anIntArray273[4]) / (Static170.anIntArray269[3] + Static170.anIntArray269[4]);
		}
		local46 = 0;
		if (Static170.anIntArray269[6] > 0 || Static170.anIntArray269[8] > 0) {
			local46 = (Static170.anIntArray273[6] + Static170.anIntArray273[8]) / (Static170.anIntArray269[6] + Static170.anIntArray269[8]);
		}
		local65 = 0;
		local69 = Static170.anIntArray269[10];
		@Pc(519) int[] local519 = Static170.anIntArrayArray29[10];
		@Pc(521) int[] local521 = Static170.anIntArray264;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static170.anIntArray269[11];
			local519 = Static170.anIntArrayArray29[11];
			local521 = Static170.anIntArray263;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2937(local519[local65++]);
				if (local65 == local69 && local519 != Static170.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static170.anIntArray269[11];
					local519 = Static170.anIntArrayArray29[11];
					local521 = Static170.anIntArray263;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2937(local519[local65++]);
				if (local65 == local69 && local519 != Static170.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static170.anIntArray269[11];
					local519 = Static170.anIntArrayArray29[11];
					local521 = Static170.anIntArray263;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2937(local519[local65++]);
				if (local65 == local69 && local519 != Static170.anIntArrayArray29[11]) {
					local65 = 0;
					local69 = Static170.anIntArray269[11];
					local519 = Static170.anIntArrayArray29[11];
					local521 = Static170.anIntArray263;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static170.anIntArray269[local81];
			@Pc(684) int[] local684 = Static170.anIntArrayArray29[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2937(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2937(local519[local65++]);
			if (local65 == local69 && local519 != Static170.anIntArrayArray29[11]) {
				local65 = 0;
				local519 = Static170.anIntArrayArray29[11];
				local69 = Static170.anIntArray269[11];
				local521 = Static170.anIntArray263;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean174) {
				this.method2939();
			}
			@Pc(6) int local6 = Static171.anInt3826;
			@Pc(8) int local8 = Static171.anInt3828;
			@Pc(12) int local12 = Class94.anIntArray278[0];
			@Pc(16) int local16 = Class94.anIntArray277[0];
			@Pc(20) int local20 = Class94.anIntArray278[arg0];
			@Pc(24) int local24 = Class94.anIntArray277[arg0];
			@Pc(28) int local28 = Class94.anIntArray278[arg1];
			@Pc(32) int local32 = Class94.anIntArray277[arg1];
			@Pc(36) int local36 = Class94.anIntArray278[arg2];
			@Pc(40) int local40 = Class94.anIntArray277[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3820; local52++) {
				@Pc(58) int local58 = this.anIntArray251[local52];
				@Pc(63) int local63 = this.anIntArray257[local52];
				@Pc(68) int local68 = this.anIntArray256[local52];
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
				Static170.anIntArray261[local52] = local68 - local50;
				Static170.anIntArray262[local52] = local6 + (local58 << 9) / local68;
				Static170.anIntArray271[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt3822 > 0) {
					Static170.anIntArray272[local52] = local58;
					Static170.anIntArray260[local52] = local80;
					Static170.anIntArray267[local52] = local68;
				}
			}
			this.method2943(false, false, 0L, this.aShort16, this.aShort16 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!ra;[B)Lclient!ei;")
	private Class5_Sub2 method2944(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3820 = this.anInt3820;
		arg1.anInt3821 = this.anInt3821;
		arg1.anInt3822 = this.anInt3822;
		if (arg1.anIntArray251 == null || arg1.anIntArray251.length < this.anInt3820) {
			arg1.anIntArray251 = new int[this.anInt3820 + 100];
			arg1.anIntArray257 = new int[this.anInt3820 + 100];
			arg1.anIntArray256 = new int[this.anInt3820 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt3820; local43++) {
			arg1.anIntArray251[local43] = this.anIntArray251[local43];
			arg1.anIntArray257[local43] = this.anIntArray257[local43];
			arg1.anIntArray256[local43] = this.anIntArray256[local43];
		}
		if (arg0) {
			arg1.aByteArray38 = this.aByteArray38;
		} else {
			arg1.aByteArray38 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray38 == null) {
				for (local88 = 0; local88 < this.anInt3821; local88++) {
					arg1.aByteArray38[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt3821; local88++) {
					arg1.aByteArray38[local88] = this.aByteArray38[local88];
				}
			}
		}
		arg1.anIntArray248 = this.anIntArray248;
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anIntArray259 = this.anIntArray259;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.anIntArray255 = this.anIntArray255;
		arg1.anIntArray249 = this.anIntArray249;
		arg1.aByteArray37 = this.aByteArray37;
		arg1.aByteArray36 = this.aByteArray36;
		arg1.aShortArray33 = this.aShortArray33;
		arg1.aByte16 = this.aByte16;
		arg1.anIntArray254 = this.anIntArray254;
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray258 = this.anIntArray258;
		arg1.anIntArrayArray27 = this.anIntArrayArray27;
		arg1.anIntArrayArray28 = this.anIntArrayArray28;
		arg1.aBoolean173 = super.aBoolean173;
		arg1.aBoolean174 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IIII)V")
	private void method2945(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static170.anInt3825 = 0;
			Static170.anInt3824 = 0;
			Static170.anInt3823 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray27.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray27[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static170.anInt3825 += this.anIntArray251[local36];
						Static170.anInt3824 += this.anIntArray257[local36];
						Static170.anInt3823 += this.anIntArray256[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static170.anInt3825 = Static170.anInt3825 / local6 + arg2;
				Static170.anInt3824 = Static170.anInt3824 / local6 + arg3;
				Static170.anInt3823 = Static170.anInt3823 / local6 + arg4;
			} else {
				Static170.anInt3825 = arg2;
				Static170.anInt3824 = arg3;
				Static170.anInt3823 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray251[local31] += arg2;
						this.anIntArray257[local31] += arg3;
						this.anIntArray256[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray251[local31] -= Static170.anInt3825;
						this.anIntArray257[local31] -= Static170.anInt3824;
						this.anIntArray256[local31] -= Static170.anInt3823;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class94.anIntArray278[arg4];
							local217 = Class94.anIntArray277[arg4];
							local235 = this.anIntArray257[local31] * local36 + this.anIntArray251[local31] * local217 + 32767 >> 16;
							this.anIntArray257[local31] = this.anIntArray257[local31] * local217 + 32767 - this.anIntArray251[local31] * local36 >> 16;
							this.anIntArray251[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class94.anIntArray278[arg2];
							local217 = Class94.anIntArray277[arg2];
							local235 = this.anIntArray257[local31] * local217 + 32767 - this.anIntArray256[local31] * local36 >> 16;
							this.anIntArray256[local31] = this.anIntArray257[local31] * local36 + this.anIntArray256[local31] * local217 + 32767 >> 16;
							this.anIntArray257[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class94.anIntArray278[arg3];
							local217 = Class94.anIntArray277[arg3];
							local235 = this.anIntArray256[local31] * local36 + this.anIntArray251[local31] * local217 + 32767 >> 16;
							this.anIntArray256[local31] = this.anIntArray256[local31] * local217 + 32767 - this.anIntArray251[local31] * local36 >> 16;
							this.anIntArray251[local31] = local235;
						}
						this.anIntArray251[local31] += Static170.anInt3825;
						this.anIntArray257[local31] += Static170.anInt3824;
						this.anIntArray256[local31] += Static170.anInt3823;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray27.length) {
					local115 = this.anIntArrayArray27[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray251[local31] -= Static170.anInt3825;
						this.anIntArray257[local31] -= Static170.anInt3824;
						this.anIntArray256[local31] -= Static170.anInt3823;
						this.anIntArray251[local31] = this.anIntArray251[local31] * arg2 / 128;
						this.anIntArray257[local31] = this.anIntArray257[local31] * arg3 / 128;
						this.anIntArray256[local31] = this.anIntArray256[local31] * arg4 / 128;
						this.anIntArray251[local31] += Static170.anInt3825;
						this.anIntArray257[local31] += Static170.anInt3824;
						this.anIntArray256[local31] += Static170.anInt3823;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray28 != null && this.aByteArray38 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray28.length) {
					local115 = this.anIntArrayArray28[local14];
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

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean174) {
			this.method2939();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort14 * arg2 + this.aShort20 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort14 * arg2 + this.aShort15 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort14 << 9;
		if (local78 / local38 <= Static161.anInt3476) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort14 << 9;
		if (local91 / local38 >= Static53.anInt1240) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort14 * arg1 + this.aShort20 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static192.anInt4156) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort14 * arg1 + this.aShort15 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static220.anInt4645) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3822 > 0;
		@Pc(172) int local172 = Static171.anInt3826;
		@Pc(174) int local174 = Static171.anInt3828;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class94.anIntArray278[arg0];
			local178 = Class94.anIntArray277[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static101.aBoolean93 && local57 > 0) {
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
			if (Static190.anInt4108 >= local204 && Static190.anInt4108 <= local208 && Static207.anInt4439 >= local223 && Static207.anInt4439 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort17, this.aShort19, this.aShort17, this.aShort19, this.aShort17, this.aShort19, this.aShort17, this.aShort19 };
				@Pc(342) int[] local342 = new int[] { this.aShort21, this.aShort21, this.aShort18, this.aShort18, this.aShort21, this.aShort21, this.aShort18, this.aShort18 };
				@Pc(385) int[] local385 = new int[] { this.aShort15, this.aShort15, this.aShort15, this.aShort15, this.aShort20, this.aShort20, this.aShort20, this.aShort20 };
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
				if (Static190.anInt4108 >= local204 && Static190.anInt4108 <= local208 && Static207.anInt4439 >= local223 && Static207.anInt4439 <= local227) {
					if (super.aBoolean173) {
						Static103.aLongArray13[Static156.anInt3428++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt3820; local204++) {
			local223 = this.anIntArray251[local204];
			local208 = this.anIntArray257[local204];
			local227 = this.anIntArray256[local204];
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
			Static170.anIntArray261[local204] = local227 - local24;
			if (local227 >= 50) {
				Static170.anIntArray262[local204] = local172 + (local223 << 9) / local227;
				Static170.anIntArray271[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static170.anIntArray262[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static170.anIntArray272[local204] = local223;
				Static170.anIntArray260[local204] = local574;
				Static170.anIntArray267[local204] = local227;
			}
		}
		try {
			this.method2943(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()I")
	@Override
	public int method2918() {
		if (!this.aBoolean174) {
			this.method2939();
		}
		return this.aShort17;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)Lclient!ei;")
	@Override
	public Class5_Sub2 method2916(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static170.aByteArray40.length < this.anInt3821) {
			Static170.aByteArray40 = new byte[this.anInt3821 + 100];
		}
		return this.method2944(arg0, Static170.aClass5_Sub2_Sub1_2, Static170.aByteArray40);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)V")
	private void method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static170.anInt3825 = 0;
			Static170.anInt3824 = 0;
			Static170.anInt3823 = 0;
			for (local11 = 0; local11 < this.anInt3820; local11++) {
				Static170.anInt3825 += this.anIntArray251[local11];
				Static170.anInt3824 += this.anIntArray257[local11];
				Static170.anInt3823 += this.anIntArray256[local11];
				local3++;
			}
			if (local3 > 0) {
				Static170.anInt3825 = Static170.anInt3825 / local3 + arg1;
				Static170.anInt3824 = Static170.anInt3824 / local3 + arg2;
				Static170.anInt3823 = Static170.anInt3823 / local3 + arg3;
			} else {
				Static170.anInt3825 = arg1;
				Static170.anInt3824 = arg2;
				Static170.anInt3823 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt3820; local3++) {
				this.anIntArray251[local3] += arg1;
				this.anIntArray257[local3] += arg2;
				this.anIntArray256[local3] += arg3;
			}
		} else if (arg0 == 2) {
			for (local3 = 0; local3 < this.anInt3820; local3++) {
				this.anIntArray251[local3] -= Static170.anInt3825;
				this.anIntArray257[local3] -= Static170.anInt3824;
				this.anIntArray256[local3] -= Static170.anInt3823;
				@Pc(143) int local143;
				@Pc(161) int local161;
				if (arg3 != 0) {
					local11 = Class94.anIntArray278[arg3];
					local143 = Class94.anIntArray277[arg3];
					local161 = this.anIntArray257[local3] * local11 + this.anIntArray251[local3] * local143 + 32767 >> 16;
					this.anIntArray257[local3] = this.anIntArray257[local3] * local143 + 32767 - this.anIntArray251[local3] * local11 >> 16;
					this.anIntArray251[local3] = local161;
				}
				if (arg1 != 0) {
					local11 = Class94.anIntArray278[arg1];
					local143 = Class94.anIntArray277[arg1];
					local161 = this.anIntArray257[local3] * local143 + 32767 - this.anIntArray256[local3] * local11 >> 16;
					this.anIntArray256[local3] = this.anIntArray257[local3] * local11 + this.anIntArray256[local3] * local143 + 32767 >> 16;
					this.anIntArray257[local3] = local161;
				}
				if (arg2 != 0) {
					local11 = Class94.anIntArray278[arg2];
					local143 = Class94.anIntArray277[arg2];
					local161 = this.anIntArray256[local3] * local11 + this.anIntArray251[local3] * local143 + 32767 >> 16;
					this.anIntArray256[local3] = this.anIntArray256[local3] * local143 + 32767 - this.anIntArray251[local3] * local11 >> 16;
					this.anIntArray251[local3] = local161;
				}
				this.anIntArray251[local3] += Static170.anInt3825;
				this.anIntArray257[local3] += Static170.anInt3824;
				this.anIntArray256[local3] += Static170.anInt3823;
			}
		} else if (arg0 == 3) {
			for (local3 = 0; local3 < this.anInt3820; local3++) {
				this.anIntArray251[local3] -= Static170.anInt3825;
				this.anIntArray257[local3] -= Static170.anInt3824;
				this.anIntArray256[local3] -= Static170.anInt3823;
				this.anIntArray251[local3] = this.anIntArray251[local3] * arg1 / 128;
				this.anIntArray257[local3] = this.anIntArray257[local3] * arg2 / 128;
				this.anIntArray256[local3] = this.anIntArray256[local3] * arg3 / 128;
				this.anIntArray251[local3] += Static170.anInt3825;
				this.anIntArray257[local3] += Static170.anInt3824;
				this.anIntArray256[local3] += Static170.anInt3823;
			}
		} else if (arg0 == 5) {
			for (local3 = 0; local3 < this.anInt3821; local3++) {
				local11 = (this.aByteArray38[local3] & 0xFF) + arg1 * 8;
				if (local11 < 0) {
					local11 = 0;
				} else if (local11 > 255) {
					local11 = 255;
				}
				this.aByteArray38[local3] = (byte) local11;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qh;ILclient!qh;I[IZ)V")
	@Override
	public void method2929(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2926(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class97 local19 = arg0.aClass97Array1[arg1];
		@Pc(24) Class97 local24 = arg2.aClass97Array1[arg3];
		@Pc(27) Class1_Sub19 local27 = local19.aClass1_Sub19_1;
		Static170.anInt3825 = 0;
		Static170.anInt3824 = 0;
		Static170.anInt3823 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt3863; local42++) {
			@Pc(48) short local48 = local19.aShortArray36[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray158[local48] == 0) {
				if (local19.aShortArray39[local42] != -1) {
					this.method2945(0, local27.anIntArrayArray12[local19.aShortArray39[local42]], 0, 0, 0);
				}
				this.method2945(local27.anIntArray158[local48], local27.anIntArrayArray12[local48], local19.aShortArray38[local42], local19.aShortArray41[local42], local19.aShortArray43[local42]);
			}
		}
		Static170.anInt3825 = 0;
		Static170.anInt3824 = 0;
		Static170.anInt3823 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt3863; local126++) {
			@Pc(132) short local132 = local24.aShortArray36[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray158[local132] == 0) {
				if (local24.aShortArray39[local126] != -1) {
					this.method2945(0, local27.anIntArrayArray12[local24.aShortArray39[local126]], 0, 0, 0);
				}
				this.method2945(local27.anIntArray158[local132], local27.anIntArrayArray12[local132], local24.aShortArray38[local126], local24.aShortArray41[local126], local24.aShortArray43[local126]);
			}
		}
		this.aBoolean174 = false;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(ZZ)Lclient!ei;")
	@Override
	public Class5_Sub2 method2931(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static170.aByteArray39.length < this.anInt3821) {
			Static170.aByteArray39 = new byte[this.anInt3821 + 100];
		}
		return this.method2944(arg0, Static170.aClass5_Sub2_Sub1_1, Static170.aByteArray39);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	private void method2947(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static171.anInt3826;
		@Pc(3) int local3 = Static171.anInt3828;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray248[arg0];
		@Pc(15) int local15 = this.anIntArray253[arg0];
		@Pc(20) int local20 = this.anIntArray259[arg0];
		@Pc(24) int local24 = Static170.anIntArray267[local10];
		@Pc(28) int local28 = Static170.anIntArray267[local15];
		@Pc(32) int local32 = Static170.anIntArray267[local20];
		if (this.aByteArray38 == null) {
			Static171.anInt3830 = 0;
		} else {
			Static171.anInt3830 = this.aByteArray38[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static170.anIntArray270[0] = Static170.anIntArray262[local10];
			Static170.anIntArray266[0] = Static170.anIntArray271[local10];
			local5++;
			Static170.anIntArray268[0] = this.anIntArray250[arg0];
		} else {
			local73 = Static170.anIntArray272[local10];
			local77 = Static170.anIntArray260[local10];
			local82 = this.anIntArray250[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class94.anIntArray276[local32 - local24];
				Static170.anIntArray270[0] = local1 + (local73 + ((Static170.anIntArray272[local20] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[0] = local3 + (local77 + ((Static170.anIntArray260[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static170.anIntArray268[0] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class94.anIntArray276[local28 - local24];
				Static170.anIntArray270[local5] = local1 + (local73 + ((Static170.anIntArray272[local15] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[local5] = local3 + (local77 + ((Static170.anIntArray260[local15] - local77) * local95 >> 16) << 9) / 50;
				Static170.anIntArray268[local5++] = local82 + ((this.anIntArray255[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static170.anIntArray270[local5] = Static170.anIntArray262[local15];
			Static170.anIntArray266[local5] = Static170.anIntArray271[local15];
			Static170.anIntArray268[local5++] = this.anIntArray255[arg0];
		} else {
			local73 = Static170.anIntArray272[local15];
			local77 = Static170.anIntArray260[local15];
			local82 = this.anIntArray255[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class94.anIntArray276[local24 - local28];
				Static170.anIntArray270[local5] = local1 + (local73 + ((Static170.anIntArray272[local10] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[local5] = local3 + (local77 + ((Static170.anIntArray260[local10] - local77) * local95 >> 16) << 9) / 50;
				Static170.anIntArray268[local5++] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class94.anIntArray276[local32 - local28];
				Static170.anIntArray270[local5] = local1 + (local73 + ((Static170.anIntArray272[local20] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[local5] = local3 + (local77 + ((Static170.anIntArray260[local20] - local77) * local95 >> 16) << 9) / 50;
				Static170.anIntArray268[local5++] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static170.anIntArray270[local5] = Static170.anIntArray262[local20];
			Static170.anIntArray266[local5] = Static170.anIntArray271[local20];
			Static170.anIntArray268[local5++] = this.anIntArray249[arg0];
		} else {
			local73 = Static170.anIntArray272[local20];
			local77 = Static170.anIntArray260[local20];
			local82 = this.anIntArray249[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class94.anIntArray276[local28 - local32];
				Static170.anIntArray270[local5] = local1 + (local73 + ((Static170.anIntArray272[local15] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[local5] = local3 + (local77 + ((Static170.anIntArray260[local15] - local77) * local95 >> 16) << 9) / 50;
				Static170.anIntArray268[local5++] = local82 + ((this.anIntArray255[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class94.anIntArray276[local24 - local32];
				Static170.anIntArray270[local5] = local1 + (local73 + ((Static170.anIntArray272[local10] - local73) * local95 >> 16) << 9) / 50;
				Static170.anIntArray266[local5] = local3 + (local77 + ((Static170.anIntArray260[local10] - local77) * local95 >> 16) << 9) / 50;
				Static170.anIntArray268[local5++] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static170.anIntArray270[0];
		local77 = Static170.anIntArray270[1];
		local82 = Static170.anIntArray270[2];
		local95 = Static170.anIntArray266[0];
		@Pc(590) int local590 = Static170.anIntArray266[1];
		@Pc(594) int local594 = Static170.anIntArray266[2];
		Static171.aBoolean179 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static171.anInt3827 || local77 > Static171.anInt3827 || local82 > Static171.anInt3827) {
				Static171.aBoolean179 = true;
			}
			if (this.aShortArray33 != null && this.aShortArray33[arg0] != -1) {
				if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray36[arg0] & 0xFF;
					local683 = this.anIntArray254[local678];
					local688 = this.anIntArray252[local678];
					local693 = this.anIntArray258[local678];
				}
				if (this.anIntArray249[arg0] == -1) {
					Static171.method2964(local95, local590, local594, local73, local77, local82, this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], this.aShortArray33[arg0]);
				} else {
					Static171.method2964(local95, local590, local594, local73, local77, local82, Static170.anIntArray268[0], Static170.anIntArray268[1], Static170.anIntArray268[2], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], this.aShortArray33[arg0]);
				}
			} else if (this.anIntArray249[arg0] == -1) {
				Static171.method2954(local95, local590, local594, local73, local77, local82, Static171.anIntArray279[this.anIntArray250[arg0]]);
			} else {
				Static171.method2959(local95, local590, local594, local73, local77, local82, Static170.anIntArray268[0], Static170.anIntArray268[1], Static170.anIntArray268[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static171.anInt3827 || local77 > Static171.anInt3827 || local82 > Static171.anInt3827 || Static170.anIntArray270[3] < 0 || Static170.anIntArray270[3] > Static171.anInt3827) {
			Static171.aBoolean179 = true;
		}
		if (this.aShortArray33 == null || this.aShortArray33[arg0] == -1) {
			if (this.anIntArray249[arg0] == -1) {
				local683 = Static171.anIntArray279[this.anIntArray250[arg0]];
				Static171.method2954(local95, local590, local594, local73, local77, local82, local683);
				Static171.method2954(local95, local594, Static170.anIntArray266[3], local73, local82, Static170.anIntArray270[3], local683);
				return;
			}
			Static171.method2959(local95, local590, local594, local73, local77, local82, Static170.anIntArray268[0], Static170.anIntArray268[1], Static170.anIntArray268[2]);
			Static171.method2959(local95, local594, Static170.anIntArray266[3], local73, local82, Static170.anIntArray270[3], Static170.anIntArray268[0], Static170.anIntArray268[2], Static170.anIntArray268[3]);
			return;
		}
		if (this.aByteArray36 == null || this.aByteArray36[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray36[arg0] & 0xFF;
			local683 = this.anIntArray254[local678];
			local688 = this.anIntArray252[local678];
			local693 = this.anIntArray258[local678];
		}
		@Pc(956) short local956 = this.aShortArray33[arg0];
		if (this.anIntArray249[arg0] == -1) {
			Static171.method2964(local95, local590, local594, local73, local77, local82, this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], local956);
			Static171.method2964(local95, local594, Static170.anIntArray266[3], local73, local82, Static170.anIntArray270[3], this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], local956);
			return;
		}
		Static171.method2964(local95, local590, local594, local73, local77, local82, Static170.anIntArray268[0], Static170.anIntArray268[1], Static170.anIntArray268[2], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], local956);
		Static171.method2964(local95, local594, Static170.anIntArray266[3], local73, local82, Static170.anIntArray270[3], Static170.anIntArray268[0], Static170.anIntArray268[2], Static170.anIntArray268[3], Static170.anIntArray272[local683], Static170.anIntArray272[local688], Static170.anIntArray272[local693], Static170.anIntArray260[local683], Static170.anIntArray260[local688], Static170.anIntArray260[local693], Static170.anIntArray267[local683], Static170.anIntArray267[local688], Static170.anIntArray267[local693], local956);
	}
}
