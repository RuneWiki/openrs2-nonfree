import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class9_Sub5_Sub1 extends Class9_Sub5 {

	@OriginalMember(owner = "client!sl", name = "wb", descriptor = "[I")
	private static int[] anIntArray411;

	@OriginalMember(owner = "client!sl", name = "Hb", descriptor = "[I")
	private static int[] anIntArray420;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "[I")
	private int[] anIntArray387;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!sl", name = "H", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!sl", name = "X", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!sl", name = "Z", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	private int anInt4808 = 0;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
	public int anInt4809 = 0;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	private int anInt4810 = 0;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
	private int anInt4811 = 0;

	@OriginalMember(owner = "client!sl", name = "ab", descriptor = "B")
	private byte aByte19 = 0;

	static {
		if (Static220.aBoolean250) {
			anIntArray411 = new int[4096];
			anIntArray420 = new int[4096];
		}
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class9_Sub5_Sub1() {
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ca;IIIII)V")
	public Class9_Sub5_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method541();
		arg0.method525();
		this.anInt4809 = arg0.anInt857;
		this.anInt4810 = arg0.anInt860;
		this.anIntArray397 = arg0.anIntArray64;
		this.anIntArray398 = arg0.anIntArray69;
		this.anIntArray393 = arg0.anIntArray68;
		this.anInt4811 = arg0.anInt859;
		this.anIntArray387 = arg0.anIntArray72;
		this.anIntArray392 = arg0.anIntArray75;
		this.anIntArray396 = arg0.anIntArray71;
		this.aByteArray54 = arg0.aByteArray16;
		this.aByteArray55 = arg0.aByteArray9;
		this.aByte19 = arg0.aByte3;
		this.aShortArray58 = arg0.aShortArray15;
		this.anIntArrayArray32 = arg0.anIntArrayArray8;
		this.anIntArrayArray31 = arg0.anIntArrayArray9;
		this.aShortArray60 = arg0.aShortArray18;
		this.aShortArray59 = arg0.aShortArray14;
		@Pc(109) int local109 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(115) int local115 = arg2 * local109 >> 8;
		this.anIntArray391 = new int[this.anInt4811];
		this.anIntArray389 = new int[this.anInt4811];
		this.anIntArray388 = new int[this.anInt4811];
		@Pc(140) int local140;
		if (arg0.aShortArray9 == null) {
			this.aShortArray61 = null;
		} else {
			this.aShortArray61 = new short[this.anInt4811];
			for (local140 = 0; local140 < this.anInt4811; local140++) {
				@Pc(146) short local146 = arg0.aShortArray9[local140];
				if (local146 != -1 && Static235.anInterface1_1.method392(local146)) {
					this.aShortArray61[local140] = local146;
				} else {
					this.aShortArray61[local140] = -1;
				}
			}
		}
		@Pc(317) int local317;
		if (arg0.anInt858 > 0 && arg0.aByteArray11 != null) {
			@Pc(184) int[] local184 = new int[arg0.anInt858];
			for (@Pc(186) int local186 = 0; local186 < this.anInt4811; local186++) {
				if (arg0.aByteArray11[local186] != -1) {
					local184[arg0.aByteArray11[local186] & 0xFF]++;
				}
			}
			this.anInt4808 = 0;
			for (@Pc(215) int local215 = 0; local215 < arg0.anInt858; local215++) {
				if (local184[local215] > 0 && arg0.aByteArray17[local215] == 0) {
					this.anInt4808++;
				}
			}
			this.anIntArray394 = new int[this.anInt4808];
			this.anIntArray395 = new int[this.anInt4808];
			this.anIntArray390 = new int[this.anInt4808];
			@Pc(253) int local253 = 0;
			for (@Pc(255) int local255 = 0; local255 < arg0.anInt858; local255++) {
				if (local184[local255] > 0 && arg0.aByteArray17[local255] == 0) {
					this.anIntArray394[local253] = arg0.aShortArray13[local255] & 0xFFFF;
					this.anIntArray395[local253] = arg0.aShortArray10[local255] & 0xFFFF;
					this.anIntArray390[local253] = arg0.aShortArray16[local255] & 0xFFFF;
					local184[local255] = local253++;
				} else {
					local184[local255] = -1;
				}
			}
			this.aByteArray56 = new byte[this.anInt4811];
			for (local317 = 0; local317 < this.anInt4811; local317++) {
				if (arg0.aByteArray11[local317] == -1) {
					this.aByteArray56[local317] = -1;
				} else {
					this.aByteArray56[local317] = (byte) local184[arg0.aByteArray11[local317] & 0xFF];
					if (this.aByteArray56[local317] == -1 && this.aShortArray61 != null) {
						this.aShortArray61[local317] = -1;
					}
				}
			}
		}
		for (local140 = 0; local140 < this.anInt4811; local140++) {
			@Pc(370) byte local370;
			if (arg0.aByteArray13 == null) {
				local370 = 0;
			} else {
				local370 = arg0.aByteArray13[local140];
			}
			@Pc(381) byte local381;
			if (arg0.aByteArray9 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray9[local140];
			}
			@Pc(392) short local392;
			if (this.aShortArray61 == null) {
				local392 = -1;
			} else {
				local392 = this.aShortArray61[local140];
			}
			if (local381 == -2) {
				local370 = 3;
			}
			if (local381 == -1) {
				local370 = 2;
			}
			@Pc(439) Class48 local439;
			@Pc(618) Class93 local618;
			if (local392 == -1) {
				if (local370 == 0) {
					@Pc(420) int local420 = arg0.aShortArray15[local140] & 0xFFFF;
					if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray387[local140]] == null) {
						local439 = arg0.aClass48Array1[this.anIntArray387[local140]];
					} else {
						local439 = arg0.aClass48Array2[this.anIntArray387[local140]];
					}
					local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178) << 17;
					this.anIntArray391[local140] = local317 | Static220.method3631(local420, local317 >> 17);
					if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray392[local140]] == null) {
						local439 = arg0.aClass48Array1[this.anIntArray392[local140]];
					} else {
						local439 = arg0.aClass48Array2[this.anIntArray392[local140]];
					}
					local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178) << 17;
					this.anIntArray389[local140] = local317 | Static220.method3631(local420, local317 >> 17);
					if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray396[local140]] == null) {
						local439 = arg0.aClass48Array1[this.anIntArray396[local140]];
					} else {
						local439 = arg0.aClass48Array2[this.anIntArray396[local140]];
					}
					local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178) << 17;
					this.anIntArray388[local140] = local317 | Static220.method3631(local420, local317 >> 17);
				} else if (local370 == 1) {
					local618 = arg0.aClass93Array1[local140];
					local317 = arg1 + (arg3 * local618.anInt3794 + arg4 * local618.anInt3792 + arg5 * local618.anInt3793) / (local115 + local115 / 2) << 17;
					this.anIntArray391[local140] = local317 | Static220.method3631(arg0.aShortArray15[local140] & 0xFFFF, local317 >> 17);
					this.anIntArray388[local140] = -1;
				} else if (local370 == 3) {
					this.anIntArray391[local140] = 128;
					this.anIntArray388[local140] = -1;
				} else {
					this.anIntArray388[local140] = -2;
				}
			} else if (local370 == 0) {
				if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray387[local140]] == null) {
					local439 = arg0.aClass48Array1[this.anIntArray387[local140]];
				} else {
					local439 = arg0.aClass48Array2[this.anIntArray387[local140]];
				}
				local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178);
				this.anIntArray391[local140] = Static220.method3632(local317);
				if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray392[local140]] == null) {
					local439 = arg0.aClass48Array1[this.anIntArray392[local140]];
				} else {
					local439 = arg0.aClass48Array2[this.anIntArray392[local140]];
				}
				local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178);
				this.anIntArray389[local140] = Static220.method3632(local317);
				if (arg0.aClass48Array2 == null || arg0.aClass48Array2[this.anIntArray396[local140]] == null) {
					local439 = arg0.aClass48Array1[this.anIntArray396[local140]];
				} else {
					local439 = arg0.aClass48Array2[this.anIntArray396[local140]];
				}
				local317 = arg1 + (arg3 * local439.anInt2173 + arg4 * local439.anInt2177 + arg5 * local439.anInt2176) / (local115 * local439.anInt2178);
				this.anIntArray388[local140] = Static220.method3632(local317);
			} else if (local370 == 1) {
				local618 = arg0.aClass93Array1[local140];
				local317 = arg1 + (arg3 * local618.anInt3794 + arg4 * local618.anInt3792 + arg5 * local618.anInt3793) / (local115 + local115 / 2);
				this.anIntArray391[local140] = Static220.method3632(local317);
				this.anIntArray388[local140] = -1;
			} else {
				this.anIntArray388[local140] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([Lclient!sl;I)V")
	private Class9_Sub5_Sub1(@OriginalArg(0) Class9_Sub5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt4809 = 0;
		this.anInt4811 = 0;
		this.anInt4808 = 0;
		this.aByte19 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(53) Class9_Sub5_Sub1 local53 = arg0[local48];
			if (local53 != null) {
				this.anInt4809 += local53.anInt4809;
				this.anInt4811 += local53.anInt4811;
				this.anInt4808 += local53.anInt4808;
				if (local53.aByteArray54 == null) {
					if (this.aByte19 == -1) {
						this.aByte19 = local53.aByte19;
					}
					if (this.aByte19 != local53.aByte19) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local53.aByteArray55 != null;
				local28 |= local53.aShortArray61 != null;
				local30 |= local53.aByteArray56 != null;
			}
		}
		this.anIntArray397 = new int[this.anInt4809];
		this.anIntArray398 = new int[this.anInt4809];
		this.anIntArray393 = new int[this.anInt4809];
		this.anIntArray387 = new int[this.anInt4811];
		this.anIntArray392 = new int[this.anInt4811];
		this.anIntArray396 = new int[this.anInt4811];
		this.anIntArray391 = new int[this.anInt4811];
		this.anIntArray389 = new int[this.anInt4811];
		this.anIntArray388 = new int[this.anInt4811];
		if (local24) {
			this.aByteArray54 = new byte[this.anInt4811];
		}
		if (local26) {
			this.aByteArray55 = new byte[this.anInt4811];
		}
		if (local28) {
			this.aShortArray61 = new short[this.anInt4811];
		}
		if (local30) {
			this.aByteArray56 = new byte[this.anInt4811];
		}
		if (this.anInt4808 > 0) {
			this.anIntArray394 = new int[this.anInt4808];
			this.anIntArray395 = new int[this.anInt4808];
			this.anIntArray390 = new int[this.anInt4808];
		}
		this.aShortArray58 = new short[this.anInt4811];
		this.anInt4809 = 0;
		this.anInt4811 = 0;
		this.anInt4808 = 0;
		@Pc(248) int local248;
		for (@Pc(239) int local239 = 0; local239 < arg1; local239++) {
			@Pc(244) Class9_Sub5_Sub1 local244 = arg0[local239];
			if (local244 != null) {
				for (local248 = 0; local248 < local244.anInt4811; local248++) {
					this.anIntArray387[this.anInt4811] = local244.anIntArray387[local248] + this.anInt4809;
					this.anIntArray392[this.anInt4811] = local244.anIntArray392[local248] + this.anInt4809;
					this.anIntArray396[this.anInt4811] = local244.anIntArray396[local248] + this.anInt4809;
					this.anIntArray391[this.anInt4811] = local244.anIntArray391[local248];
					this.anIntArray389[this.anInt4811] = local244.anIntArray389[local248];
					this.anIntArray388[this.anInt4811] = local244.anIntArray388[local248];
					this.aShortArray58[this.anInt4811] = local244.aShortArray58[local248];
					if (local24) {
						if (local244.aByteArray54 == null) {
							this.aByteArray54[this.anInt4811] = local244.aByte19;
						} else {
							this.aByteArray54[this.anInt4811] = local244.aByteArray54[local248];
						}
					}
					if (local26 && local244.aByteArray55 != null) {
						this.aByteArray55[this.anInt4811] = local244.aByteArray55[local248];
					}
					if (local28) {
						if (local244.aShortArray61 == null) {
							this.aShortArray61[this.anInt4811] = -1;
						} else {
							this.aShortArray61[this.anInt4811] = local244.aShortArray61[local248];
						}
					}
					this.anInt4811++;
				}
				for (@Pc(391) int local391 = 0; local391 < local244.anInt4810; local391++) {
					this.anIntArray397[this.anInt4809] = local244.anIntArray397[local391];
					this.anIntArray398[this.anInt4809] = local244.anIntArray398[local391];
					this.anIntArray393[this.anInt4809] = local244.anIntArray393[local391];
					this.anInt4809++;
				}
			}
		}
		@Pc(436) int local436 = 0;
		this.anInt4810 = this.anInt4809;
		for (local248 = 0; local248 < arg1; local248++) {
			@Pc(447) Class9_Sub5_Sub1 local447 = arg0[local248];
			if (local447 != null) {
				for (@Pc(451) int local451 = 0; local451 < local447.anInt4811; local451++) {
					if (local30) {
						this.aByteArray56[local436++] = (byte) (local447.aByteArray56 == null || local447.aByteArray56[local451] == -1 ? -1 : local447.aByteArray56[local451] + this.anInt4808);
					}
				}
				for (@Pc(485) int local485 = 0; local485 < local447.anInt4808; local485++) {
					this.anIntArray394[this.anInt4808] = local447.anIntArray394[local485] + this.anInt4809;
					this.anIntArray395[this.anInt4808] = local447.anIntArray395[local485] + this.anInt4809;
					this.anIntArray390[this.anInt4808] = local447.anIntArray390[local485] + this.anInt4809;
					this.anInt4808++;
				}
				for (@Pc(536) int local536 = local447.anInt4810; local536 < local447.anInt4809; local536++) {
					this.anIntArray397[this.anInt4809] = local447.anIntArray397[local536];
					this.anIntArray398[this.anInt4809] = local447.anIntArray398[local536];
					this.anIntArray393[this.anInt4809] = local447.anIntArray393[local536];
					this.anInt4809++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "()V")
	@Override
	protected void method3615() {
		if (this.aBoolean249) {
			this.method3627();
			this.aBoolean249 = false;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "()I")
	@Override
	public int method3608() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	@Override
	public void method3619(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class132.anIntArray440[arg0];
		@Pc(7) int local7 = Class132.anIntArray439[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4809; local9++) {
			@Pc(26) int local26 = this.anIntArray398[local9] * local7 - this.anIntArray393[local9] * local3 >> 16;
			this.anIntArray393[local9] = this.anIntArray398[local9] * local3 + this.anIntArray393[local9] * local7 >> 16;
			this.anIntArray398[local9] = local26;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "()I")
	@Override
	public int method3602() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort22;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(ZZZ)Lclient!gh;")
	@Override
	public Class9_Sub5 method3610(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static220.aByteArray57.length < this.anInt4811) {
			Static220.aByteArray57 = new byte[this.anInt4811 + 100];
		}
		if (!arg1 && Static220.aShortArray62.length < this.anInt4811) {
			Static220.anIntArray400 = new int[this.anInt4811 + 100];
			Static220.anIntArray401 = new int[this.anInt4811 + 100];
			Static220.anIntArray399 = new int[this.anInt4811 + 100];
			Static220.aShortArray62 = new short[this.anInt4811 + 100];
		}
		return this.method3636(arg0, arg1, Static220.aClass9_Sub5_Sub1_1, Static220.aByteArray57, Static220.aShortArray62, Static220.anIntArray400, Static220.anIntArray401, Static220.anIntArray399);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static220.anInt4813 = 0;
			Static220.anInt4814 = 0;
			Static220.anInt4812 = 0;
			for (local11 = 0; local11 < this.anInt4809; local11++) {
				Static220.anInt4813 += this.anIntArray397[local11];
				Static220.anInt4814 += this.anIntArray398[local11];
				Static220.anInt4812 += this.anIntArray393[local11];
				local3++;
			}
			if (local3 > 0) {
				Static220.anInt4813 = Static220.anInt4813 / local3 + arg1;
				Static220.anInt4814 = Static220.anInt4814 / local3 + arg2;
				Static220.anInt4812 = Static220.anInt4812 / local3 + arg3;
			} else {
				Static220.anInt4813 = arg1;
				Static220.anInt4814 = arg2;
				Static220.anInt4812 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt4809; local3++) {
				this.anIntArray397[local3] += arg1;
				this.anIntArray398[local3] += arg2;
				this.anIntArray393[local3] += arg3;
			}
		} else {
			@Pc(143) int local143;
			@Pc(161) int local161;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt4809; local3++) {
					this.anIntArray397[local3] -= Static220.anInt4813;
					this.anIntArray398[local3] -= Static220.anInt4814;
					this.anIntArray393[local3] -= Static220.anInt4812;
					if (arg3 != 0) {
						local11 = Class132.anIntArray440[arg3];
						local143 = Class132.anIntArray439[arg3];
						local161 = this.anIntArray398[local3] * local11 + this.anIntArray397[local3] * local143 + 32767 >> 16;
						this.anIntArray398[local3] = this.anIntArray398[local3] * local143 + 32767 - this.anIntArray397[local3] * local11 >> 16;
						this.anIntArray397[local3] = local161;
					}
					if (arg1 != 0) {
						local11 = Class132.anIntArray440[arg1];
						local143 = Class132.anIntArray439[arg1];
						local161 = this.anIntArray398[local3] * local143 + 32767 - this.anIntArray393[local3] * local11 >> 16;
						this.anIntArray393[local3] = this.anIntArray398[local3] * local11 + this.anIntArray393[local3] * local143 + 32767 >> 16;
						this.anIntArray398[local3] = local161;
					}
					if (arg2 != 0) {
						local11 = Class132.anIntArray440[arg2];
						local143 = Class132.anIntArray439[arg2];
						local161 = this.anIntArray393[local3] * local11 + this.anIntArray397[local3] * local143 + 32767 >> 16;
						this.anIntArray393[local3] = this.anIntArray393[local3] * local143 + 32767 - this.anIntArray397[local3] * local11 >> 16;
						this.anIntArray397[local3] = local161;
					}
					this.anIntArray397[local3] += Static220.anInt4813;
					this.anIntArray398[local3] += Static220.anInt4814;
					this.anIntArray393[local3] += Static220.anInt4812;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt4809; local3++) {
					this.anIntArray397[local3] -= Static220.anInt4813;
					this.anIntArray398[local3] -= Static220.anInt4814;
					this.anIntArray393[local3] -= Static220.anInt4812;
					this.anIntArray397[local3] = this.anIntArray397[local3] * arg1 / 128;
					this.anIntArray398[local3] = this.anIntArray398[local3] * arg2 / 128;
					this.anIntArray393[local3] = this.anIntArray393[local3] * arg3 / 128;
					this.anIntArray397[local3] += Static220.anInt4813;
					this.anIntArray398[local3] += Static220.anInt4814;
					this.anIntArray393[local3] += Static220.anInt4812;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt4811; local3++) {
					local11 = (this.aByteArray55[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray55[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt4811; local3++) {
					local11 = this.aShortArray58[local3] & 0xFFFF;
					local143 = local11 >> 10 & 0x3F;
					local161 = local11 >> 7 & 0x7;
					@Pc(489) int local489 = local11 & 0x7F;
					@Pc(495) int local495 = local143 + arg1 & 0x3F;
					local161 += arg2;
					if (local161 < 0) {
						local161 = 0;
					} else if (local161 > 7) {
						local161 = 7;
					}
					local489 += arg3;
					if (local489 < 0) {
						local489 = 0;
					} else if (local489 > 127) {
						local489 = 127;
					}
					this.aShortArray58[local3] = (short) (local495 << 10 | local161 << 7 | local489);
				}
				this.aBoolean249 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "()V")
	private void method3627() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4811; local1++) {
			@Pc(12) short local12 = this.aShortArray61 == null ? -1 : this.aShortArray61[local1];
			if (local12 == -1) {
				@Pc(22) int local22 = this.aShortArray58[local1] & 0xFFFF;
				@Pc(35) int local35;
				if (this.anIntArray388[local1] == -1) {
					local35 = this.anIntArray391[local1] & 0xFFFE0000;
					this.anIntArray391[local1] = local35 | Static220.method3631(local22, local35 >> 17);
				} else if (this.anIntArray388[local1] != -2) {
					local35 = this.anIntArray391[local1] & 0xFFFE0000;
					this.anIntArray391[local1] = local35 | Static220.method3631(local22, local35 >> 17);
					local35 = this.anIntArray389[local1] & 0xFFFE0000;
					this.anIntArray389[local1] = local35 | Static220.method3631(local22, local35 >> 17);
					local35 = this.anIntArray388[local1] & 0xFFFE0000;
					this.anIntArray388[local1] = local35 | Static220.method3631(local22, local35 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "()V")
	@Override
	public void method3626() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4809; local1++) {
			@Pc(7) int local7 = this.anIntArray397[local1];
			this.anIntArray397[local1] = this.anIntArray393[local1];
			this.anIntArray393[local1] = -local7;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V")
	private void method3628(@OriginalArg(0) int arg0) {
		if (Static220.aBooleanArray21[arg0]) {
			this.method3630(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray387[arg0];
		@Pc(17) int local17 = this.anIntArray392[arg0];
		@Pc(22) int local22 = this.anIntArray396[arg0];
		Static235.aBoolean258 = Static220.aBooleanArray20[arg0];
		if (this.aByteArray55 == null) {
			Static235.anInt5120 = 0;
		} else {
			Static235.anInt5120 = this.aByteArray55[arg0] & 0xFF;
		}
		if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray56 == null || this.aByteArray56[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray56[arg0] & 0xFF;
				local141 = this.anIntArray394[local136];
				local146 = this.anIntArray395[local136];
				local151 = this.anIntArray390[local136];
			}
			if (this.anIntArray388[arg0] == -1) {
				Static235.method3910(Static220.anIntArray419[local12], Static220.anIntArray419[local17], Static220.anIntArray419[local22], Static220.anIntArray410[local12], Static220.anIntArray410[local17], Static220.anIntArray410[local22], this.anIntArray391[arg0], this.anIntArray391[arg0], this.anIntArray391[arg0], Static220.anIntArray408[local141], Static220.anIntArray408[local146], Static220.anIntArray408[local151], Static220.anIntArray421[local141], Static220.anIntArray421[local146], Static220.anIntArray421[local151], Static220.anIntArray418[local141], Static220.anIntArray418[local146], Static220.anIntArray418[local151], this.aShortArray61[arg0]);
			} else {
				Static235.method3910(Static220.anIntArray419[local12], Static220.anIntArray419[local17], Static220.anIntArray419[local22], Static220.anIntArray410[local12], Static220.anIntArray410[local17], Static220.anIntArray410[local22], this.anIntArray391[arg0], this.anIntArray389[arg0], this.anIntArray388[arg0], Static220.anIntArray408[local141], Static220.anIntArray408[local146], Static220.anIntArray408[local151], Static220.anIntArray421[local141], Static220.anIntArray421[local146], Static220.anIntArray421[local151], Static220.anIntArray418[local141], Static220.anIntArray418[local146], Static220.anIntArray418[local151], this.aShortArray61[arg0]);
			}
		} else if (this.anIntArray388[arg0] == -1) {
			Static235.method3912(Static220.anIntArray419[local12], Static220.anIntArray419[local17], Static220.anIntArray419[local22], Static220.anIntArray410[local12], Static220.anIntArray410[local17], Static220.anIntArray410[local22], Static235.anIntArray443[this.anIntArray391[arg0] & 0xFFFF]);
		} else {
			Static235.method3896(Static220.anIntArray419[local12], Static220.anIntArray419[local17], Static220.anIntArray419[local22], Static220.anIntArray410[local12], Static220.anIntArray410[local17], Static220.anIntArray410[local22], this.anIntArray391[arg0] & 0xFFFF, this.anIntArray389[arg0] & 0xFFFF, this.anIntArray388[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZJIILclient!nl;)V")
	private void method3629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class96_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		@Pc(22) int local22;
		if (!Static220.aBoolean250) {
			for (local11 = 0; local11 < 1600; local11++) {
				Static220.anIntArray425[local11] = 0;
			}
			for (local22 = 0; local22 < 32; local22++) {
				Static220.anIntArray412[local22] = 0;
			}
			Static220.anInt4815 = 0;
		}
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(84) int local84;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(104) int local104;
		for (local11 = 0; local11 < this.anInt4811; local11++) {
			if (this.anIntArray388[local11] != -2) {
				local22 = this.anIntArray387[local11];
				local52 = this.anIntArray392[local11];
				local57 = this.anIntArray396[local11];
				local61 = Static220.anIntArray410[local22];
				local65 = Static220.anIntArray410[local52];
				local69 = Static220.anIntArray410[local57];
				@Pc(88) int local88;
				if (arg0 && (local61 == -5000 || local65 == -5000 || local69 == -5000)) {
					local84 = Static220.anIntArray408[local22];
					local88 = Static220.anIntArray408[local52];
					local92 = Static220.anIntArray408[local57];
					local96 = Static220.anIntArray421[local22];
					@Pc(100) int local100 = Static220.anIntArray421[local52];
					local104 = Static220.anIntArray421[local57];
					@Pc(108) int local108 = Static220.anIntArray418[local22];
					@Pc(112) int local112 = Static220.anIntArray418[local52];
					@Pc(116) int local116 = Static220.anIntArray418[local57];
					local84 -= local88;
					@Pc(124) int local124 = local92 - local88;
					@Pc(128) int local128 = local96 - local100;
					@Pc(132) int local132 = local104 - local100;
					@Pc(136) int local136 = local108 - local112;
					@Pc(140) int local140 = local116 - local112;
					@Pc(148) int local148 = local128 * local140 - local136 * local132;
					@Pc(156) int local156 = local136 * local124 - local84 * local140;
					@Pc(164) int local164 = local84 * local132 - local128 * local124;
					if (local88 * local148 + local100 * local156 + local112 * local164 > 0) {
						Static220.aBooleanArray21[local11] = true;
						if (Static220.aBoolean250) {
							anIntArray411[local5] = (Static220.anIntArray413[local22] + Static220.anIntArray413[local52] + Static220.anIntArray413[local57]) / 3;
							anIntArray420[local5++] = local11;
						} else {
							@Pc(220) int local220 = (Static220.anIntArray413[local22] + Static220.anIntArray413[local52] + Static220.anIntArray413[local57]) / 3 + arg3;
							if (Static220.anIntArray425[local220] < 64) {
								Static220.anIntArrayArray34[local220][Static220.anIntArray425[local220]++] = local11;
							} else {
								@Pc(243) int local243 = Static220.anIntArray425[local220];
								if (local243 == 64) {
									if (Static220.anInt4815 == 512) {
										continue;
									}
									Static220.anIntArray425[local220] = local243 = Static220.anInt4815++ + 65;
								}
								local243 -= 65;
								Static220.anIntArrayArray35[local243][Static220.anIntArray412[local243]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method3637(Static12.anInt504 + Static235.anInt5119, Static136.anInt3372 + Static235.anInt5117, Static220.anIntArray419[local22], Static220.anIntArray419[local52], Static220.anIntArray419[local57], local61, local65, local69)) {
						Static166.aLongArray24[Static109.anInt2895++] = arg2;
						arg1 = false;
					}
					if ((local61 - local65) * (Static220.anIntArray419[local57] - Static220.anIntArray419[local52]) - (Static220.anIntArray419[local22] - Static220.anIntArray419[local52]) * (local69 - local65) > 0) {
						Static220.aBooleanArray21[local11] = false;
						if (local61 >= 0 && local65 >= 0 && local69 >= 0 && local61 <= Static235.anInt5116 && local65 <= Static235.anInt5116 && local69 <= Static235.anInt5116) {
							Static220.aBooleanArray20[local11] = false;
						} else {
							Static220.aBooleanArray20[local11] = true;
						}
						if (Static220.aBoolean250) {
							anIntArray411[local5] = (Static220.anIntArray413[local22] + Static220.anIntArray413[local52] + Static220.anIntArray413[local57]) / 3;
							anIntArray420[local5++] = local11;
						} else {
							local84 = (Static220.anIntArray413[local22] + Static220.anIntArray413[local52] + Static220.anIntArray413[local57]) / 3 + arg3;
							if (Static220.anIntArray425[local84] < 64) {
								Static220.anIntArrayArray34[local84][Static220.anIntArray425[local84]++] = local11;
							} else {
								local88 = Static220.anIntArray425[local84];
								if (local88 == 64) {
									if (Static220.anInt4815 == 512) {
										continue;
									}
									Static220.anIntArray425[local84] = local88 = Static220.anInt4815++ + 65;
								}
								local88 -= 65;
								Static220.anIntArrayArray35[local88][Static220.anIntArray412[local88]++] = local11;
							}
						}
					}
				}
			}
		}
		if (Static220.aBoolean250) {
			Static229.method3837(anIntArray420, local5 - 1, anIntArray411, 0);
			if (this.aByteArray54 == null) {
				for (local22 = 0; local22 < local5; local22++) {
					this.method3628(anIntArray420[local22]);
				}
				return;
			}
			for (local22 = 0; local22 < 12; local22++) {
				Static220.anIntArray414[local22] = 0;
				Static220.anIntArray424[local22] = 0;
			}
			for (local52 = 0; local52 < local5; local52++) {
				local57 = anIntArray420[local52];
				local61 = anIntArray411[local52];
				@Pc(520) byte local520 = this.aByteArray54[local57];
				local69 = Static220.anIntArray414[local520]++;
				Static220.anIntArrayArray33[local520][local69] = local57;
				if (local520 < 10) {
					Static220.anIntArray424[local520] += local61;
				} else if (local520 == 10) {
					Static220.anIntArray422[local69] = local61;
				} else {
					Static220.anIntArray406[local69] = local61;
				}
			}
		} else if (this.aByteArray54 == null) {
			for (local22 = arg4 - 1; local22 >= 0; local22--) {
				local52 = Static220.anIntArray425[local22];
				@Pc(588) int[] local588;
				if (local52 > 0) {
					local57 = local52 > 64 ? 64 : local52;
					local588 = Static220.anIntArrayArray34[local22];
					for (local65 = 0; local65 < local57; local65++) {
						local69 = local588[local65];
						if (local69 < 65536) {
							this.method3628(local588[local65]);
						}
					}
				}
				if (local52 > 64) {
					local57 = Static220.anIntArray425[local22] - 64 - 1;
					local588 = Static220.anIntArrayArray35[local57];
					for (local65 = 0; local65 < Static220.anIntArray412[local57]; local65++) {
						local69 = local588[local65];
						if (local69 < 65536) {
							this.method3628(local588[local65]);
						}
					}
				}
			}
			return;
		} else {
			for (local22 = 0; local22 < 12; local22++) {
				Static220.anIntArray414[local22] = 0;
				Static220.anIntArray424[local22] = 0;
			}
			for (local52 = arg4 - 1; local52 >= 0; local52--) {
				local57 = Static220.anIntArray425[local52];
				@Pc(685) int[] local685;
				@Pc(700) byte local700;
				if (local57 > 0) {
					if (local57 > 64) {
						local61 = 64;
					} else {
						local61 = local57;
					}
					local685 = Static220.anIntArrayArray34[local52];
					for (local69 = 0; local69 < local61; local69++) {
						local84 = local685[local69];
						if (local84 < 65536) {
							local700 = this.aByteArray54[local84];
							local92 = Static220.anIntArray414[local700]++;
							Static220.anIntArrayArray33[local700][local92] = local84;
							if (local700 < 10) {
								Static220.anIntArray424[local700] += local52;
							} else if (local700 == 10) {
								Static220.anIntArray422[local92] = local52;
							} else {
								Static220.anIntArray406[local92] = local52;
							}
						} else {
							Static220.anIntArray407[local7++] = (local84 >> 16) - 1;
						}
					}
				}
				if (local57 > 64) {
					local61 = Static220.anIntArray425[local52] - 64 - 1;
					local685 = Static220.anIntArrayArray35[local61];
					for (local69 = 0; local69 < Static220.anIntArray412[local61]; local69++) {
						local84 = local685[local69];
						if (local84 < 65536) {
							local700 = this.aByteArray54[local84];
							local92 = Static220.anIntArray414[local700]++;
							Static220.anIntArrayArray33[local700][local92] = local84;
							if (local700 < 10) {
								Static220.anIntArray424[local700] += local52;
							} else if (local700 == 10) {
								Static220.anIntArray422[local92] = local52;
							} else {
								Static220.anIntArray406[local92] = local52;
							}
						} else {
							Static220.anIntArray407[local7++] = (local84 >> 16) - 1;
						}
					}
				}
			}
		}
		local22 = 0;
		if (Static220.anIntArray414[1] > 0 || Static220.anIntArray414[2] > 0) {
			local22 = (Static220.anIntArray424[1] + Static220.anIntArray424[2]) / (Static220.anIntArray414[1] + Static220.anIntArray414[2]);
		}
		local52 = 0;
		if (Static220.anIntArray414[3] > 0 || Static220.anIntArray414[4] > 0) {
			local52 = (Static220.anIntArray424[3] + Static220.anIntArray424[4]) / (Static220.anIntArray414[3] + Static220.anIntArray414[4]);
		}
		local57 = 0;
		if (Static220.anIntArray414[6] > 0 || Static220.anIntArray414[8] > 0) {
			local57 = (Static220.anIntArray424[6] + Static220.anIntArray424[8]) / (Static220.anIntArray414[6] + Static220.anIntArray414[8]);
		}
		local65 = 0;
		local69 = Static220.anIntArray414[10];
		@Pc(927) int[] local927 = Static220.anIntArrayArray33[10];
		@Pc(929) int[] local929 = Static220.anIntArray422;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static220.anIntArray414[11];
			local927 = Static220.anIntArrayArray33[11];
			local929 = Static220.anIntArray406;
		}
		if (local69 > 0) {
			local61 = local929[0];
		} else {
			local61 = -1000;
		}
		for (local92 = 0; local92 < 10; local92++) {
			while (local92 == 0 && local61 > local22) {
				this.method3628(local927[local65++]);
				if (local65 == local69 && local927 != Static220.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static220.anIntArray414[11];
					local927 = Static220.anIntArrayArray33[11];
					local929 = Static220.anIntArray406;
				}
				if (local65 < local69) {
					local61 = local929[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 3 && local61 > local52) {
				this.method3628(local927[local65++]);
				if (local65 == local69 && local927 != Static220.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static220.anIntArray414[11];
					local927 = Static220.anIntArrayArray33[11];
					local929 = Static220.anIntArray406;
				}
				if (local65 < local69) {
					local61 = local929[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local92 == 5 && local61 > local57) {
				this.method3628(local927[local65++]);
				if (local65 == local69 && local927 != Static220.anIntArrayArray33[11]) {
					local65 = 0;
					local69 = Static220.anIntArray414[11];
					local927 = Static220.anIntArrayArray33[11];
					local929 = Static220.anIntArray406;
				}
				if (local65 < local69) {
					local61 = local929[local65];
				} else {
					local61 = -1000;
				}
			}
			local96 = Static220.anIntArray414[local92];
			@Pc(1092) int[] local1092 = Static220.anIntArrayArray33[local92];
			for (local104 = 0; local104 < local96; local104++) {
				this.method3628(local1092[local104]);
			}
		}
		while (local61 != -1000) {
			this.method3628(local927[local65++]);
			if (local65 == local69 && local927 != Static220.anIntArrayArray33[11]) {
				local65 = 0;
				local927 = Static220.anIntArrayArray33[11];
				local69 = Static220.anIntArray414[11];
				local929 = Static220.anIntArray406;
			}
			if (local65 < local69) {
				local61 = local929[local65];
			} else {
				local61 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZZ)Lclient!gh;")
	@Override
	public Class9_Sub5 method3603(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static220.aByteArray59.length < this.anInt4811) {
			Static220.aByteArray59 = new byte[this.anInt4811 + 100];
		}
		if (!arg1 && Static220.aShortArray64.length < this.anInt4811) {
			Static220.anIntArray405 = new int[this.anInt4811 + 100];
			Static220.anIntArray415 = new int[this.anInt4811 + 100];
			Static220.anIntArray409 = new int[this.anInt4811 + 100];
			Static220.aShortArray64 = new short[this.anInt4811 + 100];
		}
		return this.method3636(arg0, arg1, Static220.aClass9_Sub5_Sub1_3, Static220.aByteArray59, Static220.aShortArray64, Static220.anIntArray405, Static220.anIntArray415, Static220.anIntArray409);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
	private void method3630(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static235.anInt5119;
		@Pc(3) int local3 = Static235.anInt5117;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray387[arg0];
		@Pc(15) int local15 = this.anIntArray392[arg0];
		@Pc(20) int local20 = this.anIntArray396[arg0];
		@Pc(24) int local24 = Static220.anIntArray418[local10];
		@Pc(28) int local28 = Static220.anIntArray418[local15];
		@Pc(32) int local32 = Static220.anIntArray418[local20];
		if (this.aByteArray55 == null) {
			Static235.anInt5120 = 0;
		} else {
			Static235.anInt5120 = this.aByteArray55[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static220.anIntArray416[0] = Static220.anIntArray410[local10];
			Static220.anIntArray423[0] = Static220.anIntArray419[local10];
			local5++;
			Static220.anIntArray417[0] = this.anIntArray391[arg0] & 0xFFFF;
		} else {
			local75 = Static220.anIntArray408[local10];
			local79 = Static220.anIntArray421[local10];
			local86 = this.anIntArray391[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class132.anIntArray442[local32 - local24];
				Static220.anIntArray416[0] = local1 + (local75 + ((Static220.anIntArray408[local20] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[0] = local3 + (local79 + ((Static220.anIntArray421[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static220.anIntArray417[0] = local86 + (((this.anIntArray388[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class132.anIntArray442[local28 - local24];
				Static220.anIntArray416[local5] = local1 + (local75 + ((Static220.anIntArray408[local15] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[local5] = local3 + (local79 + ((Static220.anIntArray421[local15] - local79) * local99 >> 16) << 9) / 50;
				Static220.anIntArray417[local5++] = local86 + (((this.anIntArray389[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static220.anIntArray416[local5] = Static220.anIntArray410[local15];
			Static220.anIntArray423[local5] = Static220.anIntArray419[local15];
			Static220.anIntArray417[local5++] = this.anIntArray389[arg0] & 0xFFFF;
		} else {
			local75 = Static220.anIntArray408[local15];
			local79 = Static220.anIntArray421[local15];
			local86 = this.anIntArray389[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class132.anIntArray442[local24 - local28];
				Static220.anIntArray416[local5] = local1 + (local75 + ((Static220.anIntArray408[local10] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[local5] = local3 + (local79 + ((Static220.anIntArray421[local10] - local79) * local99 >> 16) << 9) / 50;
				Static220.anIntArray417[local5++] = local86 + (((this.anIntArray391[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class132.anIntArray442[local32 - local28];
				Static220.anIntArray416[local5] = local1 + (local75 + ((Static220.anIntArray408[local20] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[local5] = local3 + (local79 + ((Static220.anIntArray421[local20] - local79) * local99 >> 16) << 9) / 50;
				Static220.anIntArray417[local5++] = local86 + (((this.anIntArray388[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static220.anIntArray416[local5] = Static220.anIntArray410[local20];
			Static220.anIntArray423[local5] = Static220.anIntArray419[local20];
			Static220.anIntArray417[local5++] = this.anIntArray388[arg0] & 0xFFFF;
		} else {
			local75 = Static220.anIntArray408[local20];
			local79 = Static220.anIntArray421[local20];
			local86 = this.anIntArray388[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class132.anIntArray442[local28 - local32];
				Static220.anIntArray416[local5] = local1 + (local75 + ((Static220.anIntArray408[local15] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[local5] = local3 + (local79 + ((Static220.anIntArray421[local15] - local79) * local99 >> 16) << 9) / 50;
				Static220.anIntArray417[local5++] = local86 + (((this.anIntArray389[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class132.anIntArray442[local24 - local32];
				Static220.anIntArray416[local5] = local1 + (local75 + ((Static220.anIntArray408[local10] - local75) * local99 >> 16) << 9) / 50;
				Static220.anIntArray423[local5] = local3 + (local79 + ((Static220.anIntArray421[local10] - local79) * local99 >> 16) << 9) / 50;
				Static220.anIntArray417[local5++] = local86 + (((this.anIntArray391[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static220.anIntArray416[0];
		local79 = Static220.anIntArray416[1];
		local86 = Static220.anIntArray416[2];
		local99 = Static220.anIntArray423[0];
		@Pc(614) int local614 = Static220.anIntArray423[1];
		@Pc(618) int local618 = Static220.anIntArray423[2];
		Static235.aBoolean258 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static235.anInt5116 || local79 > Static235.anInt5116 || local86 > Static235.anInt5116) {
				Static235.aBoolean258 = true;
			}
			if (this.aShortArray61 != null && this.aShortArray61[arg0] != -1) {
				if (this.aByteArray56 == null || this.aByteArray56[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray56[arg0] & 0xFF;
					local709 = this.anIntArray394[local704];
					local714 = this.anIntArray395[local704];
					local719 = this.anIntArray390[local704];
				}
				if (this.anIntArray388[arg0] == -1) {
					Static235.method3910(local99, local614, local618, local75, local79, local86, this.anIntArray391[arg0], this.anIntArray391[arg0], this.anIntArray391[arg0], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], this.aShortArray61[arg0]);
				} else {
					Static235.method3910(local99, local614, local618, local75, local79, local86, Static220.anIntArray417[0], Static220.anIntArray417[1], Static220.anIntArray417[2], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], this.aShortArray61[arg0]);
				}
			} else if (this.anIntArray388[arg0] == -1) {
				Static235.method3912(local99, local614, local618, local75, local79, local86, Static235.anIntArray443[this.anIntArray391[arg0] & 0xFFFF]);
			} else {
				Static235.method3896(local99, local614, local618, local75, local79, local86, Static220.anIntArray417[0], Static220.anIntArray417[1], Static220.anIntArray417[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static235.anInt5116 || local79 > Static235.anInt5116 || local86 > Static235.anInt5116 || Static220.anIntArray416[3] < 0 || Static220.anIntArray416[3] > Static235.anInt5116) {
			Static235.aBoolean258 = true;
		}
		if (this.aShortArray61 == null || this.aShortArray61[arg0] == -1) {
			if (this.anIntArray388[arg0] == -1) {
				local709 = Static235.anIntArray443[this.anIntArray391[arg0] & 0xFFFF];
				Static235.method3912(local99, local614, local618, local75, local79, local86, local709);
				Static235.method3912(local99, local618, Static220.anIntArray423[3], local75, local86, Static220.anIntArray416[3], local709);
				return;
			}
			Static235.method3896(local99, local614, local618, local75, local79, local86, Static220.anIntArray417[0], Static220.anIntArray417[1], Static220.anIntArray417[2]);
			Static235.method3896(local99, local618, Static220.anIntArray423[3], local75, local86, Static220.anIntArray416[3], Static220.anIntArray417[0], Static220.anIntArray417[2], Static220.anIntArray417[3]);
			return;
		}
		if (this.aByteArray56 == null || this.aByteArray56[arg0] == -1) {
			local709 = local10;
			local714 = local15;
			local719 = local20;
		} else {
			local704 = this.aByteArray56[arg0] & 0xFF;
			local709 = this.anIntArray394[local704];
			local714 = this.anIntArray395[local704];
			local719 = this.anIntArray390[local704];
		}
		@Pc(984) short local984 = this.aShortArray61[arg0];
		if (this.anIntArray388[arg0] == -1) {
			Static235.method3910(local99, local614, local618, local75, local79, local86, this.anIntArray391[arg0], this.anIntArray391[arg0], this.anIntArray391[arg0], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], local984);
			Static235.method3910(local99, local618, Static220.anIntArray423[3], local75, local86, Static220.anIntArray416[3], this.anIntArray391[arg0], this.anIntArray391[arg0], this.anIntArray391[arg0], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], local984);
			return;
		}
		Static235.method3910(local99, local614, local618, local75, local79, local86, Static220.anIntArray417[0], Static220.anIntArray417[1], Static220.anIntArray417[2], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], local984);
		Static235.method3910(local99, local618, Static220.anIntArray423[3], local75, local86, Static220.anIntArray416[3], Static220.anIntArray417[0], Static220.anIntArray417[2], Static220.anIntArray417[3], Static220.anIntArray408[local709], Static220.anIntArray408[local714], Static220.anIntArray408[local719], Static220.anIntArray421[local709], Static220.anIntArray421[local714], Static220.anIntArray421[local719], Static220.anIntArray418[local709], Static220.anIntArray418[local714], Static220.anIntArray418[local719], local984);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "()I")
	@Override
	public int method3599() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	@Override
	public void method3614(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class132.anIntArray440[arg0];
		@Pc(7) int local7 = Class132.anIntArray439[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4809; local9++) {
			@Pc(26) int local26 = this.anIntArray398[local9] * local3 + this.anIntArray397[local9] * local7 >> 16;
			this.anIntArray398[local9] = this.anIntArray398[local9] * local7 - this.anIntArray397[local9] * local3 >> 16;
			this.anIntArray397[local9] = local26;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)V")
	@Override
	public void method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4809; local1++) {
			this.anIntArray397[local1] += arg0;
			this.anIntArray398[local1] += arg1;
			this.anIntArray393[local1] += arg2;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		if (!this.aBoolean248) {
			this.method3634();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort21 * arg2 + this.aShort23 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort21 * arg2 + this.aShort24 * arg1 >> 16);
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort21 << 9;
		if (local78 / local38 <= Static174.anInt4002) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort21 << 9;
		if (local91 / local38 >= Static180.anInt4132) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort21 * arg1 + this.aShort23 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static48.anInt1415) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort21 * arg1 + this.aShort24 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static132.anInt3289) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local53 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt4808 > 0;
		@Pc(172) int local172 = Static235.anInt5119;
		@Pc(174) int local174 = Static235.anInt5117;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class132.anIntArray440[arg0];
			local178 = Class132.anIntArray439[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static36.aBoolean42 && local53 > 0) {
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
			if (Static12.anInt504 >= local204 && Static12.anInt504 <= local208 && Static136.anInt3372 >= local223 && Static136.anInt3372 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort20, this.aShort25, this.aShort20, this.aShort25, this.aShort20, this.aShort25, this.aShort20, this.aShort25 };
				@Pc(342) int[] local342 = new int[] { this.aShort27, this.aShort27, this.aShort22, this.aShort22, this.aShort27, this.aShort27, this.aShort22, this.aShort22 };
				@Pc(385) int[] local385 = new int[] { this.aShort24, this.aShort24, this.aShort24, this.aShort24, this.aShort23, this.aShort23, this.aShort23, this.aShort23 };
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
				if (Static12.anInt504 >= local204 && Static12.anInt504 <= local208 && Static136.anInt3372 >= local223 && Static136.anInt3372 <= local227) {
					if (super.aBoolean247) {
						Static166.aLongArray24[Static109.anInt2895++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt4809; local204++) {
			local223 = this.anIntArray397[local204];
			local208 = this.anIntArray398[local204];
			local227 = this.anIntArray393[local204];
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
			Static220.anIntArray413[local204] = local227 - local24;
			if (local227 >= 50) {
				Static220.anIntArray410[local204] = local172 + (local223 << 9) / local227;
				Static220.anIntArray419[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static220.anIntArray410[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static220.anIntArray408[local204] = local223;
				Static220.anIntArray421[local204] = local574;
				Static220.anIntArray418[local204] = local227;
			}
		}
		try {
			this.method3629(local154, local190, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(713) Exception local713) {
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean248) {
				this.method3634();
			}
			@Pc(6) int local6 = Static235.anInt5119;
			@Pc(8) int local8 = Static235.anInt5117;
			@Pc(12) int local12 = Class132.anIntArray440[0];
			@Pc(16) int local16 = Class132.anIntArray439[0];
			@Pc(20) int local20 = Class132.anIntArray440[arg0];
			@Pc(24) int local24 = Class132.anIntArray439[arg0];
			@Pc(28) int local28 = Class132.anIntArray440[arg1];
			@Pc(32) int local32 = Class132.anIntArray439[arg1];
			@Pc(36) int local36 = Class132.anIntArray440[arg2];
			@Pc(40) int local40 = Class132.anIntArray439[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4809; local52++) {
				@Pc(58) int local58 = this.anIntArray397[local52];
				@Pc(63) int local63 = this.anIntArray398[local52];
				@Pc(68) int local68 = this.anIntArray393[local52];
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
				Static220.anIntArray413[local52] = local68 - local50;
				Static220.anIntArray410[local52] = local6 + (local58 << 9) / local68;
				Static220.anIntArray419[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt4808 > 0) {
					Static220.anIntArray408[local52] = local58;
					Static220.anIntArray421[local52] = local80;
					Static220.anIntArray418[local52] = local68;
				}
			}
			this.method3629(false, arg6 >= 0L, arg6, this.aShort26, this.aShort26 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "()V")
	@Override
	public void method3618() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4809; local1++) {
			this.anIntArray397[local1] = -this.anIntArray397[local1];
			this.anIntArray393[local1] = -this.anIntArray393[local1];
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(19) int local19;
		if (arg0 == 0) {
			local6 = 0;
			Static220.anInt4813 = 0;
			Static220.anInt4814 = 0;
			Static220.anInt4812 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local19 = arg1[local14];
				if (local19 < this.anIntArrayArray32.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray32[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local36]) != 0) {
							Static220.anInt4813 += this.anIntArray397[local36];
							Static220.anInt4814 += this.anIntArray398[local36];
							Static220.anInt4812 += this.anIntArray393[local36];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static220.anInt4813 = Static220.anInt4813 / local6 + arg2;
				Static220.anInt4814 = Static220.anInt4814 / local6 + arg3;
				Static220.anInt4812 = Static220.anInt4812 / local6 + arg4;
				Static220.aBoolean251 = true;
			} else {
				Static220.anInt4813 = arg2;
				Static220.anInt4814 = arg3;
				Static220.anInt4812 = arg4;
			}
			return;
		}
		@Pc(201) int[] local201;
		@Pc(203) int local203;
		if (arg0 == 1) {
			if (arg7 != null) {
				local6 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local14 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local19 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local6;
				arg3 = local14;
				arg4 = local19;
			}
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local201 = this.anIntArrayArray32[local14];
					for (local203 = 0; local203 < local201.length; local203++) {
						local31 = local201[local203];
						if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local31]) != 0) {
							this.anIntArray397[local31] += arg2;
							this.anIntArray398[local31] += arg3;
							this.anIntArray393[local31] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(305) int local305;
		@Pc(327) int local327;
		@Pc(349) int local349;
		@Pc(390) int local390;
		@Pc(396) int local396;
		@Pc(402) int local402;
		@Pc(408) int local408;
		@Pc(416) int local416;
		@Pc(424) int local424;
		@Pc(577) int local577;
		@Pc(602) int local602;
		@Pc(606) int local606;
		@Pc(614) int local614;
		@Pc(619) int local619;
		@Pc(622) int local622;
		@Pc(625) int local625;
		@Pc(627) int local627;
		@Pc(751) int[] local751;
		@Pc(753) int local753;
		@Pc(756) int local756;
		@Pc(759) int local759;
		@Pc(761) int local761;
		@Pc(884) int local884;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray32.length) {
						local201 = this.anIntArrayArray32[local14];
						for (local203 = 0; local203 < local201.length; local203++) {
							local31 = local201[local203];
							if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local31]) != 0) {
								this.anIntArray397[local31] -= Static220.anInt4813;
								this.anIntArray398[local31] -= Static220.anInt4814;
								this.anIntArray393[local31] -= Static220.anInt4812;
								if (arg4 != 0) {
									local36 = Class132.anIntArray440[arg4];
									local305 = Class132.anIntArray439[arg4];
									local327 = this.anIntArray398[local31] * local36 + this.anIntArray397[local31] * local305 + 32767 >> 16;
									this.anIntArray398[local31] = this.anIntArray398[local31] * local305 + 32767 - this.anIntArray397[local31] * local36 >> 16;
									this.anIntArray397[local31] = local327;
								}
								if (arg2 != 0) {
									local36 = Class132.anIntArray440[arg2];
									local305 = Class132.anIntArray439[arg2];
									local327 = this.anIntArray398[local31] * local305 + 32767 - this.anIntArray393[local31] * local36 >> 16;
									this.anIntArray393[local31] = this.anIntArray398[local31] * local36 + this.anIntArray393[local31] * local305 + 32767 >> 16;
									this.anIntArray398[local31] = local327;
								}
								if (arg3 != 0) {
									local36 = Class132.anIntArray440[arg3];
									local305 = Class132.anIntArray439[arg3];
									local327 = this.anIntArray393[local31] * local36 + this.anIntArray397[local31] * local305 + 32767 >> 16;
									this.anIntArray393[local31] = this.anIntArray393[local31] * local305 + 32767 - this.anIntArray397[local31] * local36 >> 16;
									this.anIntArray397[local31] = local327;
								}
								this.anIntArray397[local31] += Static220.anInt4813;
								this.anIntArray398[local31] += Static220.anInt4814;
								this.anIntArray393[local31] += Static220.anInt4812;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local19 = arg7[11];
				local203 = arg7[12];
				local31 = arg7[13];
				local36 = arg7[14];
				if (Static220.aBoolean251) {
					local305 = arg7[0] * Static220.anInt4813 + arg7[3] * Static220.anInt4814 + arg7[6] * Static220.anInt4812 + 16384 >> 15;
					local327 = arg7[1] * Static220.anInt4813 + arg7[4] * Static220.anInt4814 + arg7[7] * Static220.anInt4812 + 16384 >> 15;
					local349 = arg7[2] * Static220.anInt4813 + arg7[5] * Static220.anInt4814 + arg7[8] * Static220.anInt4812 + 16384 >> 15;
					local305 += local203;
					local327 += local31;
					local349 += local36;
					Static220.anInt4813 = local305;
					Static220.anInt4814 = local327;
					Static220.anInt4812 = local349;
					Static220.aBoolean251 = false;
				}
				@Pc(372) int[] local372 = new int[9];
				local327 = Class132.anIntArray439[arg2] >> 1;
				local349 = Class132.anIntArray440[arg2] >> 1;
				local390 = Class132.anIntArray439[arg3] >> 1;
				local396 = Class132.anIntArray440[arg3] >> 1;
				local402 = Class132.anIntArray439[arg4] >> 1;
				local408 = Class132.anIntArray440[arg4] >> 1;
				local416 = local349 * local402 + 16384 >> 15;
				local424 = local349 * local408 + 16384 >> 15;
				local372[0] = local390 * local402 + local396 * local424 + 16384 >> 15;
				local372[1] = -local390 * local408 + local396 * local416 + 16384 >> 15;
				local372[2] = local396 * local327 + 16384 >> 15;
				local372[3] = local327 * local408 + 16384 >> 15;
				local372[4] = local327 * local402 + 16384 >> 15;
				local372[5] = -local349;
				local372[6] = -local396 * local402 + local390 * local424 + 16384 >> 15;
				local372[7] = local396 * local408 + local390 * local416 + 16384 >> 15;
				local372[8] = local390 * local327 + 16384 >> 15;
				@Pc(552) int local552 = local372[0] * -Static220.anInt4813 + local372[1] * -Static220.anInt4814 + local372[2] * -Static220.anInt4812 + 16384 >> 15;
				local577 = local372[3] * -Static220.anInt4813 + local372[4] * -Static220.anInt4814 + local372[5] * -Static220.anInt4812 + 16384 >> 15;
				local602 = local372[6] * -Static220.anInt4813 + local372[7] * -Static220.anInt4814 + local372[8] * -Static220.anInt4812 + 16384 >> 15;
				local606 = local552 + Static220.anInt4813;
				@Pc(610) int local610 = local577 + Static220.anInt4814;
				local614 = local602 + Static220.anInt4812;
				@Pc(617) int[] local617 = new int[9];
				for (local619 = 0; local619 < 3; local619++) {
					for (local622 = 0; local622 < 3; local622++) {
						local625 = 0;
						for (local627 = 0; local627 < 3; local627++) {
							local625 += local372[local619 * 3 + local627] * arg7[local622 * 3 + local627];
						}
						local617[local619 * 3 + local622] = local625 + 16384 >> 15;
					}
				}
				local622 = local372[0] * local203 + local372[1] * local31 + local372[2] * local36 + 16384 >> 15;
				local625 = local372[3] * local203 + local372[4] * local31 + local372[5] * local36 + 16384 >> 15;
				local627 = local372[6] * local203 + local372[7] * local31 + local372[8] * local36 + 16384 >> 15;
				local622 += local606;
				local625 += local610;
				local627 += local614;
				local751 = new int[9];
				for (local753 = 0; local753 < 3; local753++) {
					for (local756 = 0; local756 < 3; local756++) {
						local759 = 0;
						for (local761 = 0; local761 < 3; local761++) {
							local759 += arg7[local753 * 3 + local761] * local617[local756 + local761 * 3];
						}
						local751[local753 * 3 + local756] = local759 + 16384 >> 15;
					}
				}
				local756 = arg7[0] * local622 + arg7[1] * local625 + arg7[2] * local627 + 16384 >> 15;
				local759 = arg7[3] * local622 + arg7[4] * local625 + arg7[5] * local627 + 16384 >> 15;
				local761 = arg7[6] * local622 + arg7[7] * local625 + arg7[8] * local627 + 16384 >> 15;
				local756 += local6;
				local759 += local14;
				local761 += local19;
				for (local884 = 0; local884 < local2; local884++) {
					@Pc(889) int local889 = arg1[local884];
					if (local889 < this.anIntArrayArray32.length) {
						@Pc(899) int[] local899 = this.anIntArrayArray32[local889];
						for (@Pc(901) int local901 = 0; local901 < local899.length; local901++) {
							@Pc(906) int local906 = local899[local901];
							if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local906]) != 0) {
								@Pc(947) int local947 = local751[0] * this.anIntArray397[local906] + local751[1] * this.anIntArray398[local906] + local751[2] * this.anIntArray393[local906] + 16384 >> 15;
								@Pc(978) int local978 = local751[3] * this.anIntArray397[local906] + local751[4] * this.anIntArray398[local906] + local751[5] * this.anIntArray393[local906] + 16384 >> 15;
								@Pc(1009) int local1009 = local751[6] * this.anIntArray397[local906] + local751[7] * this.anIntArray398[local906] + local751[8] * this.anIntArray393[local906] + 16384 >> 15;
								@Pc(1013) int local1013 = local947 + local756;
								@Pc(1017) int local1017 = local978 + local759;
								@Pc(1021) int local1021 = local1009 + local761;
								this.anIntArray397[local906] = local1013;
								this.anIntArray398[local906] = local1017;
								this.anIntArray393[local906] = local1021;
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
						local201 = this.anIntArrayArray32[local14];
						for (local203 = 0; local203 < local201.length; local203++) {
							local31 = local201[local203];
							if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local31]) != 0) {
								this.anIntArray397[local31] -= Static220.anInt4813;
								this.anIntArray398[local31] -= Static220.anInt4814;
								this.anIntArray393[local31] -= Static220.anInt4812;
								this.anIntArray397[local31] = this.anIntArray397[local31] * arg2 / 128;
								this.anIntArray398[local31] = this.anIntArray398[local31] * arg3 / 128;
								this.anIntArray393[local31] = this.anIntArray393[local31] * arg4 / 128;
								this.anIntArray397[local31] += Static220.anInt4813;
								this.anIntArray398[local31] += Static220.anInt4814;
								this.anIntArray393[local31] += Static220.anInt4812;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local19 = arg7[11];
				local203 = arg7[12];
				local31 = arg7[13];
				local36 = arg7[14];
				if (Static220.aBoolean251) {
					local305 = arg7[0] * Static220.anInt4813 + arg7[3] * Static220.anInt4814 + arg7[6] * Static220.anInt4812 + 16384 >> 15;
					local327 = arg7[1] * Static220.anInt4813 + arg7[4] * Static220.anInt4814 + arg7[7] * Static220.anInt4812 + 16384 >> 15;
					local349 = arg7[2] * Static220.anInt4813 + arg7[5] * Static220.anInt4814 + arg7[8] * Static220.anInt4812 + 16384 >> 15;
					local305 += local203;
					local327 += local31;
					local349 += local36;
					Static220.anInt4813 = local305;
					Static220.anInt4814 = local327;
					Static220.anInt4812 = local349;
					Static220.aBoolean251 = false;
				}
				local305 = arg2 << 15 >> 7;
				local327 = arg3 << 15 >> 7;
				local349 = arg4 << 15 >> 7;
				local390 = local305 * -Static220.anInt4813 + 16384 >> 15;
				local396 = local327 * -Static220.anInt4814 + 16384 >> 15;
				local402 = local349 * -Static220.anInt4812 + 16384 >> 15;
				local408 = local390 + Static220.anInt4813;
				local416 = local396 + Static220.anInt4814;
				local424 = local402 + Static220.anInt4812;
				@Pc(1477) int[] local1477 = new int[] { local305 * arg7[0] + 16384 >> 15, local305 * arg7[3] + 16384 >> 15, local305 * arg7[6] + 16384 >> 15, local327 * arg7[1] + 16384 >> 15, local327 * arg7[4] + 16384 >> 15, local327 * arg7[7] + 16384 >> 15, local349 * arg7[2] + 16384 >> 15, local349 * arg7[5] + 16384 >> 15, local349 * arg7[8] + 16384 >> 15 };
				local577 = local305 * local203 + 16384 >> 15;
				local602 = local327 * local31 + 16384 >> 15;
				local606 = local349 * local36 + 16384 >> 15;
				@Pc(1613) int local1613 = local577 + local408;
				@Pc(1617) int local1617 = local602 + local416;
				@Pc(1621) int local1621 = local606 + local424;
				@Pc(1624) int[] local1624 = new int[9];
				@Pc(1629) int local1629;
				for (local614 = 0; local614 < 3; local614++) {
					for (local1629 = 0; local1629 < 3; local1629++) {
						local619 = 0;
						for (local622 = 0; local622 < 3; local622++) {
							local619 += arg7[local614 * 3 + local622] * local1477[local1629 + local622 * 3];
						}
						local1624[local614 * 3 + local1629] = local619 + 16384 >> 15;
					}
				}
				local1629 = arg7[0] * local1613 + arg7[1] * local1617 + arg7[2] * local1621 + 16384 >> 15;
				local619 = arg7[3] * local1613 + arg7[4] * local1617 + arg7[5] * local1621 + 16384 >> 15;
				local622 = arg7[6] * local1613 + arg7[7] * local1617 + arg7[8] * local1621 + 16384 >> 15;
				local1629 += local6;
				local619 += local14;
				local622 += local19;
				for (local625 = 0; local625 < local2; local625++) {
					local627 = arg1[local625];
					if (local627 < this.anIntArrayArray32.length) {
						local751 = this.anIntArrayArray32[local627];
						for (local753 = 0; local753 < local751.length; local753++) {
							local756 = local751[local753];
							if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local756]) != 0) {
								local759 = local1624[0] * this.anIntArray397[local756] + local1624[1] * this.anIntArray398[local756] + local1624[2] * this.anIntArray393[local756] + 16384 >> 15;
								local761 = local1624[3] * this.anIntArray397[local756] + local1624[4] * this.anIntArray398[local756] + local1624[5] * this.anIntArray393[local756] + 16384 >> 15;
								local884 = local1624[6] * this.anIntArray397[local756] + local1624[7] * this.anIntArray398[local756] + local1624[8] * this.anIntArray393[local756] + 16384 >> 15;
								@Pc(1886) int local1886 = local759 + local1629;
								@Pc(1890) int local1890 = local761 + local619;
								@Pc(1894) int local1894 = local884 + local622;
								this.anIntArray397[local756] = local1886;
								this.anIntArray398[local756] = local1890;
								this.anIntArray393[local756] = local1894;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray55 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local201 = this.anIntArrayArray31[local14];
						for (local203 = 0; local203 < local201.length; local203++) {
							local31 = local201[local203];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local31]) != 0) {
								local36 = (this.aByteArray55[local31] & 0xFF) + arg2 * 8;
								if (local36 < 0) {
									local36 = 0;
								} else if (local36 > 255) {
									local36 = 255;
								}
								this.aByteArray55[local31] = (byte) local36;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray31 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray31.length) {
					local201 = this.anIntArrayArray31[local14];
					for (local203 = 0; local203 < local201.length; local203++) {
						local31 = local201[local203];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local31]) != 0) {
							local36 = this.aShortArray58[local31] & 0xFFFF;
							local305 = local36 >> 10 & 0x3F;
							local327 = local36 >> 7 & 0x7;
							local349 = local36 & 0x7F;
							@Pc(2196) int local2196 = local305 + arg2 & 0x3F;
							local327 += arg3;
							if (local327 < 0) {
								local327 = 0;
							} else if (local327 > 7) {
								local327 = 7;
							}
							local349 += arg4;
							if (local349 < 0) {
								local349 = 0;
							} else if (local349 > 127) {
								local349 = 127;
							}
							this.aShortArray58[local31] = (short) (local2196 << 10 | local327 << 7 | local349);
						}
					}
					this.aBoolean249 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!gh;)Lclient!gh;")
	public Class9_Sub5 method3633(@OriginalArg(0) Class9_Sub5 arg0) {
		return new Class9_Sub5_Sub1(new Class9_Sub5_Sub1[] { this, (Class9_Sub5_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "()I")
	@Override
	public int method3616() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "()V")
	@Override
	public void method3612() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4809; local1++) {
			@Pc(7) int local7 = this.anIntArray393[local1];
			this.anIntArray393[local1] = this.anIntArray397[local1];
			this.anIntArray397[local1] = -local7;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "()V")
	private void method3634() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4810; local17++) {
			@Pc(23) int local23 = this.anIntArray397[local17];
			@Pc(28) int local28 = this.anIntArray398[local17];
			@Pc(33) int local33 = this.anIntArray393[local17];
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
			local71 += local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort20 = (short) local1;
		this.aShort25 = (short) local7;
		this.aShort24 = (short) local3;
		this.aShort23 = (short) local9;
		this.aShort27 = (short) local5;
		this.aShort22 = (short) local11;
		this.aShort21 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort26 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V")
	public void method3635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean248) {
				this.method3634();
			}
			@Pc(6) int local6 = Static235.anInt5119;
			@Pc(8) int local8 = Static235.anInt5117;
			@Pc(12) int local12 = Class132.anIntArray440[0];
			@Pc(16) int local16 = Class132.anIntArray439[0];
			@Pc(20) int local20 = Class132.anIntArray440[arg0];
			@Pc(24) int local24 = Class132.anIntArray439[arg0];
			@Pc(28) int local28 = Class132.anIntArray440[arg1];
			@Pc(32) int local32 = Class132.anIntArray439[arg1];
			@Pc(36) int local36 = Class132.anIntArray440[arg2];
			@Pc(40) int local40 = Class132.anIntArray439[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt4809; local52++) {
				@Pc(58) int local58 = this.anIntArray397[local52];
				@Pc(63) int local63 = this.anIntArray398[local52];
				@Pc(68) int local68 = this.anIntArray393[local52];
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
				Static220.anIntArray413[local52] = local68 - local50;
				Static220.anIntArray410[local52] = local6 + (local58 << 9) / arg6;
				Static220.anIntArray419[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt4808 > 0) {
					Static220.anIntArray408[local52] = local58;
					Static220.anIntArray421[local52] = local80;
					Static220.anIntArray418[local52] = local68;
				}
			}
			this.method3629(false, false, 0L, this.aShort26, this.aShort26 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
	@Override
	public void method3622(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class132.anIntArray440[arg0];
		@Pc(7) int local7 = Class132.anIntArray439[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4809; local9++) {
			@Pc(26) int local26 = this.anIntArray393[local9] * local3 + this.anIntArray397[local9] * local7 >> 16;
			this.anIntArray393[local9] = this.anIntArray393[local9] * local7 - this.anIntArray397[local9] * local3 >> 16;
			this.anIntArray397[local9] = local26;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "()Z")
	@Override
	protected boolean method3600() {
		if (this.anIntArrayArray32 == null) {
			return false;
		} else {
			Static220.anInt4813 = 0;
			Static220.anInt4814 = 0;
			Static220.anInt4812 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZLclient!sl;[B[S[I[I[I)Lclient!gh;")
	private Class9_Sub5 method3636(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class9_Sub5_Sub1 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt4809 = this.anInt4809;
		arg2.anInt4810 = this.anInt4810;
		arg2.anInt4811 = this.anInt4811;
		arg2.anInt4808 = this.anInt4808;
		if (arg2.anIntArray397 == null || arg2.anIntArray397.length < this.anInt4809) {
			arg2.anIntArray397 = new int[this.anInt4809 + 100];
			arg2.anIntArray398 = new int[this.anInt4809 + 100];
			arg2.anIntArray393 = new int[this.anInt4809 + 100];
		}
		for (@Pc(47) int local47 = 0; local47 < this.anInt4809; local47++) {
			arg2.anIntArray397[local47] = this.anIntArray397[local47];
			arg2.anIntArray398[local47] = this.anIntArray398[local47];
			arg2.anIntArray393[local47] = this.anIntArray393[local47];
		}
		@Pc(92) int local92;
		if (arg0) {
			arg2.aByteArray55 = this.aByteArray55;
		} else {
			arg2.aByteArray55 = arg3;
			if (this.aByteArray55 == null) {
				for (local92 = 0; local92 < this.anInt4811; local92++) {
					arg2.aByteArray55[local92] = 0;
				}
			} else {
				for (local92 = 0; local92 < this.anInt4811; local92++) {
					arg2.aByteArray55[local92] = this.aByteArray55[local92];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray58 = this.aShortArray58;
			arg2.anIntArray391 = this.anIntArray391;
			arg2.anIntArray389 = this.anIntArray389;
			arg2.anIntArray388 = this.anIntArray388;
		} else {
			arg2.aShortArray58 = arg4;
			arg2.anIntArray391 = arg5;
			arg2.anIntArray389 = arg6;
			arg2.anIntArray388 = arg7;
			for (local92 = 0; local92 < this.anInt4811; local92++) {
				arg2.aShortArray58[local92] = this.aShortArray58[local92];
				arg2.anIntArray391[local92] = this.anIntArray391[local92];
				arg2.anIntArray389[local92] = this.anIntArray389[local92];
				arg2.anIntArray388[local92] = this.anIntArray388[local92];
			}
		}
		arg2.anIntArray387 = this.anIntArray387;
		arg2.anIntArray392 = this.anIntArray392;
		arg2.anIntArray396 = this.anIntArray396;
		arg2.aByteArray54 = this.aByteArray54;
		arg2.aByteArray56 = this.aByteArray56;
		arg2.aShortArray61 = this.aShortArray61;
		arg2.aByte19 = this.aByte19;
		arg2.anIntArray394 = this.anIntArray394;
		arg2.anIntArray395 = this.anIntArray395;
		arg2.anIntArray390 = this.anIntArray390;
		arg2.anIntArrayArray32 = this.anIntArrayArray32;
		arg2.anIntArrayArray31 = this.anIntArrayArray31;
		arg2.aShortArray59 = this.aShortArray59;
		arg2.aShortArray60 = this.aShortArray60;
		arg2.aBoolean247 = super.aBoolean247;
		arg2.aBoolean248 = false;
		return arg2;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method3637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4809; local1++) {
			this.anIntArray397[local1] = this.anIntArray397[local1] * arg0 / 128;
			this.anIntArray398[local1] = this.anIntArray398[local1] * arg1 / 128;
			this.anIntArray393[local1] = this.anIntArray393[local1] * arg2 / 128;
		}
		this.aBoolean248 = false;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(ZZZ)Lclient!gh;")
	@Override
	public Class9_Sub5 method3625(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static220.aByteArray58.length < this.anInt4811) {
			Static220.aByteArray58 = new byte[this.anInt4811 + 100];
		}
		if (!arg1 && Static220.aShortArray63.length < this.anInt4811) {
			Static220.anIntArray404 = new int[this.anInt4811 + 100];
			Static220.anIntArray403 = new int[this.anInt4811 + 100];
			Static220.anIntArray402 = new int[this.anInt4811 + 100];
			Static220.aShortArray63 = new short[this.anInt4811 + 100];
		}
		return this.method3636(arg0, arg1, Static220.aClass9_Sub5_Sub1_2, Static220.aByteArray58, Static220.aShortArray63, Static220.anIntArray404, Static220.anIntArray403, Static220.anIntArray402);
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "()I")
	@Override
	public int method3605() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!sl;")
	public Class9_Sub5_Sub1 method3639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean248) {
			this.method3634();
		}
		@Pc(9) int local9 = arg4 + this.aShort20;
		@Pc(14) int local14 = arg4 + this.aShort25;
		@Pc(19) int local19 = arg6 + this.aShort27;
		@Pc(24) int local24 = arg6 + this.aShort22;
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
		@Pc(150) Class9_Sub5_Sub1 local150;
		if (arg7) {
			local150 = new Class9_Sub5_Sub1();
			local150.anInt4809 = this.anInt4809;
			local150.anInt4810 = this.anInt4810;
			local150.anInt4811 = this.anInt4811;
			local150.anInt4808 = this.anInt4808;
			local150.anIntArray387 = this.anIntArray387;
			local150.anIntArray392 = this.anIntArray392;
			local150.anIntArray396 = this.anIntArray396;
			local150.anIntArray391 = this.anIntArray391;
			local150.anIntArray389 = this.anIntArray389;
			local150.anIntArray388 = this.anIntArray388;
			local150.aByteArray54 = this.aByteArray54;
			local150.aByteArray56 = this.aByteArray56;
			local150.aShortArray61 = this.aShortArray61;
			local150.aShortArray58 = this.aShortArray58;
			local150.aByteArray55 = this.aByteArray55;
			local150.aByte19 = this.aByte19;
			local150.anIntArray394 = this.anIntArray394;
			local150.anIntArray395 = this.anIntArray395;
			local150.anIntArray390 = this.anIntArray390;
			local150.anIntArrayArray32 = this.anIntArrayArray32;
			local150.anIntArrayArray31 = this.anIntArrayArray31;
			local150.aShortArray59 = this.aShortArray59;
			local150.aShortArray60 = this.aShortArray60;
			local150.aBoolean247 = super.aBoolean247;
			if (arg0 == 3) {
				local150.anIntArray397 = Static188.method3171(this.anIntArray397);
				local150.anIntArray398 = Static188.method3171(this.anIntArray398);
				local150.anIntArray393 = Static188.method3171(this.anIntArray393);
			} else {
				local150.anIntArray397 = this.anIntArray397;
				local150.anIntArray398 = new int[local150.anInt4809];
				local150.anIntArray393 = this.anIntArray393;
			}
		} else {
			local150 = this;
		}
		@Pc(289) int local289;
		@Pc(297) int local297;
		@Pc(304) int local304;
		@Pc(308) int local308;
		@Pc(312) int local312;
		@Pc(316) int local316;
		@Pc(320) int local320;
		@Pc(342) int local342;
		@Pc(368) int local368;
		@Pc(380) int local380;
		@Pc(510) int local510;
		if (arg0 == 1) {
			for (local289 = 0; local289 < local150.anInt4810; local289++) {
				local297 = this.anIntArray397[local289] + arg4;
				local304 = this.anIntArray393[local289] + arg6;
				local308 = local297 & 0x7F;
				local312 = local304 & 0x7F;
				local316 = local297 >> 7;
				local320 = local304 >> 7;
				local342 = arg2[local316][local320] * (128 - local308) + arg2[local316 + 1][local320] * local308 >> 7;
				local368 = arg2[local316][local320 + 1] * (128 - local308) + arg2[local316 + 1][local320 + 1] * local308 >> 7;
				local380 = local342 * (128 - local312) + local368 * local312 >> 7;
				local150.anIntArray398[local289] = this.anIntArray398[local289] + local380 - arg5;
			}
			for (local297 = local150.anInt4810; local297 < local150.anInt4809; local297++) {
				local304 = this.anIntArray397[local297] + arg4;
				local308 = this.anIntArray393[local297] + arg6;
				local312 = local304 & 0x7F;
				local316 = local308 & 0x7F;
				local320 = local304 >> 7;
				local342 = local308 >> 7;
				if (local320 >= 0 && local320 < arg2.length - 1 && local342 >= 0 && local342 < arg2[0].length - 1) {
					local368 = arg2[local320][local342] * (128 - local312) + arg2[local320 + 1][local342] * local312 >> 7;
					local380 = arg2[local320][local342 + 1] * (128 - local312) + arg2[local320 + 1][local342 + 1] * local312 >> 7;
					local510 = local368 * (128 - local316) + local380 * local316 >> 7;
					local150.anIntArray398[local297] = this.anIntArray398[local297] + local510 - arg5;
				}
			}
		} else {
			@Pc(795) int local795;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt4810; local289++) {
					local297 = (this.anIntArray398[local289] << 16) / this.aShort24;
					if (local297 < arg1) {
						local304 = this.anIntArray397[local289] + arg4;
						local308 = this.anIntArray393[local289] + arg6;
						local312 = local304 & 0x7F;
						local316 = local308 & 0x7F;
						local320 = local304 >> 7;
						local342 = local308 >> 7;
						local368 = arg2[local320][local342] * (128 - local312) + arg2[local320 + 1][local342] * local312 >> 7;
						local380 = arg2[local320][local342 + 1] * (128 - local312) + arg2[local320 + 1][local342 + 1] * local312 >> 7;
						local510 = local368 * (128 - local316) + local380 * local316 >> 7;
						local150.anIntArray398[local289] = this.anIntArray398[local289] + (local510 - arg5) * (arg1 - local297) / arg1;
					} else {
						local150.anIntArray398[local289] = this.anIntArray398[local289];
					}
				}
				for (local297 = local150.anInt4810; local297 < local150.anInt4809; local297++) {
					local304 = (this.anIntArray398[local297] << 16) / this.aShort24;
					if (local304 < arg1) {
						local308 = this.anIntArray397[local297] + arg4;
						local312 = this.anIntArray393[local297] + arg6;
						local316 = local308 & 0x7F;
						local320 = local312 & 0x7F;
						local342 = local308 >> 7;
						local368 = local312 >> 7;
						if (local342 >= 0 && local342 < arg2.length - 1 && local368 >= 0 && local368 < arg2[0].length - 1) {
							local380 = arg2[local342][local368] * (128 - local316) + arg2[local342 + 1][local368] * local316 >> 7;
							local510 = arg2[local342][local368 + 1] * (128 - local316) + arg2[local342 + 1][local368 + 1] * local316 >> 7;
							local795 = local380 * (128 - local320) + local510 * local320 >> 7;
							local150.anIntArray398[local297] = this.anIntArray398[local297] + (local795 - arg5) * (arg1 - local304) / arg1;
						}
					} else {
						local150.anIntArray398[local297] = this.anIntArray398[local297];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local297 = (arg1 >> 8 & 0xFF) * 4;
				local150.method3623(arg2, arg4, arg5, arg6, local289, local297);
			} else if (arg0 == 4) {
				local289 = this.aShort23 - this.aShort24;
				for (local297 = 0; local297 < this.anInt4810; local297++) {
					local304 = this.anIntArray397[local297] + arg4;
					local308 = this.anIntArray393[local297] + arg6;
					local312 = local304 & 0x7F;
					local316 = local308 & 0x7F;
					local320 = local304 >> 7;
					local342 = local308 >> 7;
					local368 = arg3[local320][local342] * (128 - local312) + arg3[local320 + 1][local342] * local312 >> 7;
					local380 = arg3[local320][local342 + 1] * (128 - local312) + arg3[local320 + 1][local342 + 1] * local312 >> 7;
					local510 = local368 * (128 - local316) + local380 * local316 >> 7;
					local150.anIntArray398[local297] = this.anIntArray398[local297] + local510 + local289 - arg5;
				}
				for (local304 = local150.anInt4810; local304 < local150.anInt4809; local304++) {
					local308 = this.anIntArray397[local304] + arg4;
					local312 = this.anIntArray393[local304] + arg6;
					local316 = local308 & 0x7F;
					local320 = local312 & 0x7F;
					local342 = local308 >> 7;
					local368 = local312 >> 7;
					if (local342 >= 0 && local342 < arg3.length - 1 && local368 >= 0 && local368 < arg3[0].length - 1) {
						local380 = arg3[local342][local368] * (128 - local316) + arg3[local342 + 1][local368] * local316 >> 7;
						local510 = arg3[local342][local368 + 1] * (128 - local316) + arg3[local342 + 1][local368 + 1] * local316 >> 7;
						local795 = local380 * (128 - local320) + local510 * local320 >> 7;
						local150.anIntArray398[local304] = this.anIntArray398[local304] + local795 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort23 - this.aShort24;
				@Pc(1274) int local1274;
				for (local297 = 0; local297 < this.anInt4810; local297++) {
					local304 = this.anIntArray397[local297] + arg4;
					local308 = this.anIntArray393[local297] + arg6;
					local312 = local304 & 0x7F;
					local316 = local308 & 0x7F;
					local320 = local304 >> 7;
					local342 = local308 >> 7;
					local368 = arg2[local320][local342] * (128 - local312) + arg2[local320 + 1][local342] * local312 >> 7;
					local380 = arg2[local320][local342 + 1] * (128 - local312) + arg2[local320 + 1][local342 + 1] * local312 >> 7;
					local510 = local368 * (128 - local316) + local380 * local316 >> 7;
					local368 = arg3[local320][local342] * (128 - local312) + arg3[local320 + 1][local342] * local312 >> 7;
					local380 = arg3[local320][local342 + 1] * (128 - local312) + arg3[local320 + 1][local342 + 1] * local312 >> 7;
					local795 = local368 * (128 - local316) + local380 * local316 >> 7;
					local1274 = local510 - local795;
					local150.anIntArray398[local297] = ((this.anIntArray398[local297] << 8) / local289 * local1274 >> 8) - (arg5 - local510);
				}
				for (local304 = local150.anInt4810; local304 < local150.anInt4809; local304++) {
					local308 = this.anIntArray397[local304] + arg4;
					local312 = this.anIntArray393[local304] + arg6;
					local316 = local308 & 0x7F;
					local320 = local312 & 0x7F;
					local342 = local308 >> 7;
					local368 = local312 >> 7;
					if (local342 >= 0 && local342 < arg2.length - 1 && local342 < arg3.length - 1 && local368 >= 0 && local368 < arg2[0].length - 1 && local368 < arg3[0].length - 1) {
						local380 = arg2[local342][local368] * (128 - local316) + arg2[local342 + 1][local368] * local316 >> 7;
						local510 = arg2[local342][local368 + 1] * (128 - local316) + arg2[local342 + 1][local368 + 1] * local316 >> 7;
						local795 = local380 * (128 - local320) + local510 * local320 >> 7;
						local380 = arg3[local342][local368] * (128 - local316) + arg3[local342 + 1][local368] * local316 >> 7;
						local510 = arg3[local342][local368 + 1] * (128 - local316) + arg3[local342 + 1][local368 + 1] * local316 >> 7;
						local1274 = local380 * (128 - local320) + local510 * local320 >> 7;
						@Pc(1490) int local1490 = local795 - local1274;
						local150.anIntArray398[local304] = ((this.anIntArray398[local304] << 8) / local289 * local1490 >> 8) - (arg5 - local795);
					}
				}
			}
		}
		local150.aBoolean248 = false;
		return local150;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static220.anInt4813 = 0;
			Static220.anInt4814 = 0;
			Static220.anInt4812 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray32.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray32[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static220.anInt4813 += this.anIntArray397[local36];
						Static220.anInt4814 += this.anIntArray398[local36];
						Static220.anInt4812 += this.anIntArray393[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static220.anInt4813 = Static220.anInt4813 / local6 + arg2;
				Static220.anInt4814 = Static220.anInt4814 / local6 + arg3;
				Static220.anInt4812 = Static220.anInt4812 / local6 + arg4;
			} else {
				Static220.anInt4813 = arg2;
				Static220.anInt4814 = arg3;
				Static220.anInt4812 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local115 = this.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray397[local31] += arg2;
						this.anIntArray398[local31] += arg3;
						this.anIntArray393[local31] += arg4;
					}
				}
			}
			return;
		}
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local115 = this.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray397[local31] -= Static220.anInt4813;
						this.anIntArray398[local31] -= Static220.anInt4814;
						this.anIntArray393[local31] -= Static220.anInt4812;
						if (arg4 != 0) {
							local36 = Class132.anIntArray440[arg4];
							local217 = Class132.anIntArray439[arg4];
							local235 = this.anIntArray398[local31] * local36 + this.anIntArray397[local31] * local217 + 32767 >> 16;
							this.anIntArray398[local31] = this.anIntArray398[local31] * local217 + 32767 - this.anIntArray397[local31] * local36 >> 16;
							this.anIntArray397[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class132.anIntArray440[arg2];
							local217 = Class132.anIntArray439[arg2];
							local235 = this.anIntArray398[local31] * local217 + 32767 - this.anIntArray393[local31] * local36 >> 16;
							this.anIntArray393[local31] = this.anIntArray398[local31] * local36 + this.anIntArray393[local31] * local217 + 32767 >> 16;
							this.anIntArray398[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class132.anIntArray440[arg3];
							local217 = Class132.anIntArray439[arg3];
							local235 = this.anIntArray393[local31] * local36 + this.anIntArray397[local31] * local217 + 32767 >> 16;
							this.anIntArray393[local31] = this.anIntArray393[local31] * local217 + 32767 - this.anIntArray397[local31] * local36 >> 16;
							this.anIntArray397[local31] = local235;
						}
						this.anIntArray397[local31] += Static220.anInt4813;
						this.anIntArray398[local31] += Static220.anInt4814;
						this.anIntArray393[local31] += Static220.anInt4812;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray32.length) {
					local115 = this.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray397[local31] -= Static220.anInt4813;
						this.anIntArray398[local31] -= Static220.anInt4814;
						this.anIntArray393[local31] -= Static220.anInt4812;
						this.anIntArray397[local31] = this.anIntArray397[local31] * arg2 / 128;
						this.anIntArray398[local31] = this.anIntArray398[local31] * arg3 / 128;
						this.anIntArray393[local31] = this.anIntArray393[local31] * arg4 / 128;
						this.anIntArray397[local31] += Static220.anInt4813;
						this.anIntArray398[local31] += Static220.anInt4814;
						this.anIntArray393[local31] += Static220.anInt4812;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray31 != null && this.aByteArray55 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray31.length) {
						local115 = this.anIntArrayArray31[local14];
						for (local117 = 0; local117 < local115.length; local117++) {
							local31 = local115[local117];
							local36 = (this.aByteArray55[local31] & 0xFF) + arg2 * 8;
							if (local36 < 0) {
								local36 = 0;
							} else if (local36 > 255) {
								local36 = 255;
							}
							this.aByteArray55[local31] = (byte) local36;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray31 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray31.length) {
					local115 = this.anIntArrayArray31[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = this.aShortArray58[local31] & 0xFFFF;
						local217 = local36 >> 10 & 0x3F;
						local235 = local36 >> 7 & 0x7;
						@Pc(647) int local647 = local36 & 0x7F;
						@Pc(653) int local653 = local217 + arg2 & 0x3F;
						local235 += arg3;
						if (local235 < 0) {
							local235 = 0;
						} else if (local235 > 7) {
							local235 = 7;
						}
						local647 += arg4;
						if (local647 < 0) {
							local647 = 0;
						} else if (local647 > 127) {
							local647 = 127;
						}
						this.aShortArray58[local31] = (short) (local653 << 10 | local235 << 7 | local647);
					}
					this.aBoolean249 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "()I")
	public int method3640() {
		if (!this.aBoolean248) {
			this.method3634();
		}
		return this.aShort23;
	}
}
