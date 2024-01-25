import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	private int anInt2967;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	private int anInt2970;

	@OriginalMember(owner = "client!gk", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!gk", name = "ab", descriptor = "Lclient!nn;")
	public Class179 aClass179_7;

	@OriginalMember(owner = "client!gk", name = "db", descriptor = "Lclient!nn;")
	private Class179 aClass179_8;

	@OriginalMember(owner = "client!gk", name = "eb", descriptor = "I")
	private int anInt2992;

	@OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
	private int anInt2993;

	@OriginalMember(owner = "client!gk", name = "hb", descriptor = "Lclient!nn;")
	public Class179 aClass179_9;

	@OriginalMember(owner = "client!gk", name = "jb", descriptor = "Lclient!nn;")
	public Class179 aClass179_10;

	@OriginalMember(owner = "client!gk", name = "kb", descriptor = "Lclient!ig;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!gk", name = "mb", descriptor = "[Lclient!pg;")
	private Class1_Sub34[] aClass1_Sub34Array1;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Lclient!pu;")
	private final Class203 aClass203_18 = new Class203();

	@OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
	private final int anInt2986 = this.anInt5779 - 2;

	@OriginalMember(owner = "client!gk", name = "X", descriptor = "[[I")
	private final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "Lclient!ih;")
	public final Class106_Sub2 aClass106_Sub2_15;

	@OriginalMember(owner = "client!gk", name = "Z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!gk", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "[[[Lclient!pg;")
	private Class1_Sub34[][][] aClass1_Sub34ArrayArrayArray1;

	@OriginalMember(owner = "client!gk", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!gk", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!gk", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	private final int anInt2971;

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
	public final int anInt2973;

	@OriginalMember(owner = "client!gk", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gk", name = "O", descriptor = "[[B")
	private final byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!gk", name = "lb", descriptor = "Lclient!bu;")
	private Class38 lb;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "Lclient!qj;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ih;IIII[[I[[II)V")
	public Class96_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray30 = arg5;
		this.aClass106_Sub2_15 = arg0;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt5777 + 1][super.anInt5775 + 1];
		this.aClass1_Sub34ArrayArrayArray1 = new Class1_Sub34[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt5777 + 1][super.anInt5775 + 1];
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray1 = new short[arg4 * arg3][];
		this.anInt2971 = 0x1 << this.anInt2986;
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt2973 = arg2;
		this.aFloatArrayArray4 = new float[super.anInt5777 + 1][super.anInt5775 + 1];
		this.aByteArrayArray11 = new byte[arg3][arg4];
		for (@Pc(117) int local117 = 1; local117 < super.anInt5775; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt5777; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + arg7 * arg7 * 4 + local140 * local140)));
				this.aFloatArrayArray4[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray5[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray6[local121][local117] = local176 * (float) local157;
			}
		}
		this.lb = new Class38(128);
		if ((this.anInt2973 & 0x10) != 0) {
			this.aClass207_1 = new Class207(this.aClass106_Sub2_15, this);
		}
	}

	@OriginalMember(owner = "client!gk", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class1_Sub1_Sub10 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub10 arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt5778 >> this.aClass106_Sub2_15.anInt3734;
		@Pc(27) Class1_Sub1_Sub10_Sub1 local27 = (Class1_Sub1_Sub10_Sub1) arg2;
		@Pc(43) Class1_Sub1_Sub10_Sub1 local43;
		if (local27 != null && local27.method3401(local24, local24)) {
			local43 = local27;
			local27.method3403();
		} else {
			local43 = new Class1_Sub1_Sub10_Sub1(this.aClass106_Sub2_15, local24, local24);
		}
		local43.method3404(0, local24, local24, 0);
		this.method2183(arg0, local43, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!gk", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt5779;
		@Pc(13) int local13 = arg1 >> super.anInt5779;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt5777 - 1 || super.anInt5775 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt5778 - 1 & arg0;
		@Pc(48) int local48 = super.anInt5778 - 1 & arg1;
		@Pc(75) int local75 = this.anIntArrayArray30[local8 + 1][local13] * local41 + this.anIntArrayArray30[local8][local13] * (super.anInt5778 - local41) >> super.anInt5779;
		@Pc(106) int local106 = this.anIntArrayArray30[local8][local13 + 1] * (super.anInt5778 - local41) + this.anIntArrayArray30[local8 + 1][local13 + 1] * local41 >> super.anInt5779;
		return (super.anInt5778 - local48) * local75 + local48 * local106 >> super.anInt5779;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4431(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2992 <= 0) {
			return;
		}
		this.aClass106_Sub2_15.method2849();
		this.aClass106_Sub2_15.method2846(false);
		this.aClass106_Sub2_15.method2858(false);
		this.aClass106_Sub2_15.method2922(false);
		this.aClass106_Sub2_15.method2914(false);
		this.aClass106_Sub2_15.method2927(0);
		this.aClass106_Sub2_15.method2904(-2);
		this.aClass106_Sub2_15.method2912(null);
		Static303.aFloatArray23[5] = (float) 1024 / ((float) super.anInt5778 * 128.0F * (float) this.aClass106_Sub2_15.anInt3713);
		Static303.aFloatArray23[10] = 0.0F;
		Static303.aFloatArray23[8] = 0.0F;
		Static303.aFloatArray23[4] = 0.0F;
		Static303.aFloatArray23[11] = 0.0F;
		Static303.aFloatArray23[1] = 0.0F;
		Static303.aFloatArray23[15] = 1.0F;
		Static303.aFloatArray23[2] = 0.0F;
		Static303.aFloatArray23[7] = 0.0F;
		Static303.aFloatArray23[9] = 0.0F;
		Static303.aFloatArray23[14] = 0.0F;
		Static303.aFloatArray23[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass106_Sub2_15.anInt3589;
		Static303.aFloatArray23[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass106_Sub2_15.anInt3713;
		Static303.aFloatArray23[3] = 0.0F;
		Static303.aFloatArray23[0] = (float) 1024 / ((float) this.aClass106_Sub2_15.anInt3589 * 128.0F * (float) super.anInt5778);
		Static303.aFloatArray23[6] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static303.aFloatArray23, 0);
		Static303.aFloatArray23[8] = 0.0F;
		Static303.aFloatArray23[7] = 0.0F;
		Static303.aFloatArray23[9] = 1.0F;
		Static303.aFloatArray23[10] = 0.0F;
		Static303.aFloatArray23[1] = 0.0F;
		Static303.aFloatArray23[14] = 0.0F;
		Static303.aFloatArray23[12] = 0.0F;
		Static303.aFloatArray23[0] = 1.0F;
		Static303.aFloatArray23[6] = 1.0F;
		Static303.aFloatArray23[5] = 0.0F;
		Static303.aFloatArray23[3] = 0.0F;
		Static303.aFloatArray23[4] = 0.0F;
		Static303.aFloatArray23[15] = 1.0F;
		Static303.aFloatArray23[2] = 0.0F;
		Static303.aFloatArray23[13] = 0.0F;
		Static303.aFloatArray23[11] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static303.aFloatArray23, 0);
		if ((this.anInt2973 & 0x7) == 0) {
			this.aClass106_Sub2_15.method2858(false);
		} else {
			this.aClass106_Sub2_15.method2858(true);
			this.aClass106_Sub2_15.method2863();
		}
		this.aClass106_Sub2_15.method2847(this.aClass179_10, this.aClass179_9, this.aClass179_8, this.aClass179_7);
		if (this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2.aByteArray14.length >= this.anInt2970 * 2) {
			this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2.anInt1710 = 0;
		} else {
			this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2(this.anInt2970 * 2);
		}
		@Pc(309) int local309 = 0;
		@Pc(313) Class1_Sub3_Sub2 local313 = this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2;
		@Pc(319) int local319;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(350) short[] local350;
		@Pc(354) int local354;
		if (this.aClass106_Sub2_15.aBoolean227) {
			for (local319 = arg1; local319 < arg3; local319++) {
				local329 = arg0 + super.anInt5777 * local319;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local319 - arg1]) {
						local350 = this.aShortArrayArray1[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local313.method1227(local350[local354] & 0xFFFF);
								local309++;
							}
						}
					}
					local329++;
				}
			}
		} else {
			for (local319 = arg1; local319 < arg3; local319++) {
				local329 = super.anInt5777 * local319 + arg0;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local319 - arg1]) {
						local350 = this.aShortArrayArray1[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local313.method1199(local350[local354] & 0xFFFF);
								local309++;
							}
						}
					}
					local329++;
				}
			}
		}
		if (local309 > 0) {
			@Pc(473) Class4_Sub1 local473 = new Class4_Sub1(this.aClass106_Sub2_15, 5123, local313.aByteArray14, local313.anInt1710);
			this.aClass106_Sub2_15.method2848(local309, local473, 0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray12[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray12[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!kp;BI)V")
	private void method2183(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub10_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray4[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray9[arg0][arg2];
		@Pc(28) int local28 = local12.length;
		if (this.aClass106_Sub2_15.anIntArray362.length < local28) {
			this.aClass106_Sub2_15.anIntArray362 = new int[local28];
			this.aClass106_Sub2_15.anIntArray363 = new int[local28];
		}
		@Pc(48) int[] local48 = this.aClass106_Sub2_15.anIntArray362;
		@Pc(52) int[] local52 = this.aClass106_Sub2_15.anIntArray363;
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			local48[local54] = (local12[local54] & 0xFF) >> this.aClass106_Sub2_15.anInt3734;
			local52[local54] = (local19[local54] & 0xFF) >> this.aClass106_Sub2_15.anInt3734;
		}
		@Pc(90) int local90 = 0;
		while (local28 > local90) {
			@Pc(96) int local96 = local48[local90];
			@Pc(101) int local101 = local52[local90++];
			@Pc(105) int local105 = local48[local90];
			@Pc(110) int local110 = local52[local90++];
			@Pc(114) int local114 = local48[local90];
			@Pc(119) int local119 = local52[local90++];
			if ((local96 - local105) * (local110 - local119) - (local110 - local101) * (-local105 + local114) > 0) {
				arg1.method3405(local105, local114, local96, local119, local110, local101);
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ja;[I)V")
	@Override
	public void method4430(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass203_18.method4551(new Class1_Sub5(this.aClass106_Sub2_15, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI[[ZIIII)V")
	private void method2184(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass1_Sub34Array1 == null) {
			return;
		}
		@Pc(22) float local22 = this.aClass106_Sub2_15.aFloat46;
		@Pc(26) float local26 = this.aClass106_Sub2_15.aFloat43;
		@Pc(32) int local32 = arg2 + arg2 + 1;
		@Pc(36) int local36 = local32 * local32;
		if (this.aClass106_Sub2_15.anIntArray364.length < local36) {
			this.aClass106_Sub2_15.anIntArray364 = new int[local36];
		}
		if (this.anInt2970 * 2 > this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2.aByteArray14.length) {
			this.aClass106_Sub2_15.aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2(this.anInt2970 * 2);
		}
		@Pc(72) int local72 = arg4 - arg2;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(86) int local86 = arg3 - arg2;
		@Pc(88) int local88 = local86;
		if (local86 < 0) {
			local86 = 0;
		}
		@Pc(96) int local96 = arg4 + arg2;
		if (super.anInt5777 - 1 < local96) {
			local96 = super.anInt5777 - 1;
		}
		@Pc(115) int local115 = arg2 + arg3;
		if (super.anInt5775 - 1 < local115) {
			local115 = super.anInt5775 - 1;
		}
		@Pc(132) int local132 = 0;
		@Pc(136) int[] local136 = this.aClass106_Sub2_15.anIntArray364;
		@Pc(148) int local148;
		for (@Pc(138) int local138 = local72; local138 <= local96; local138++) {
			@Pc(146) boolean[] local146 = arg1[local138 - local74];
			for (local148 = local86; local148 <= local115; local148++) {
				if (local146[local148 - local88]) {
					local136[local132++] = local148 * super.anInt5777 + local138;
				}
			}
		}
		this.aClass106_Sub2_15.method2886();
		this.aClass106_Sub2_15.method2858((this.anInt2973 & 0x7) != 0);
		for (@Pc(219) int local219 = 0; local219 < this.aClass1_Sub34Array1.length; local219++) {
			this.aClass1_Sub34Array1[local219].method4424(local132, local136);
		}
		if (!this.aClass203_18.method4554()) {
			local148 = this.aClass106_Sub2_15.anInt3753;
			@Pc(252) int local252 = this.aClass106_Sub2_15.anInt3773;
			this.aClass106_Sub2_15.Q(0, local252, this.aClass106_Sub2_15.anInt3776);
			this.aClass106_Sub2_15.da(local26, local22 - 4.0F);
			this.aClass106_Sub2_15.method2858(false);
			this.aClass106_Sub2_15.method2914(false);
			this.aClass106_Sub2_15.method2927(128);
			this.aClass106_Sub2_15.method2904(-2);
			this.aClass106_Sub2_15.method2912(this.aClass106_Sub2_15.aClass8_Sub1_1);
			this.aClass106_Sub2_15.method2923(8448, 7681);
			this.aClass106_Sub2_15.method2915(0, 34166, 770);
			this.aClass106_Sub2_15.method2925(34167, 0);
			for (@Pc(323) Class1 local323 = this.aClass203_18.method4548(); local323 != null; local323 = this.aClass203_18.method4545()) {
				@Pc(328) Class1_Sub5 local328 = (Class1_Sub5) local323;
				local328.method494(arg3, arg4, arg2, arg1);
			}
			this.aClass106_Sub2_15.method2915(0, 5890, 768);
			this.aClass106_Sub2_15.method2925(5890, 0);
			this.aClass106_Sub2_15.method2912(null);
			this.aClass106_Sub2_15.Q(local148, local252, this.aClass106_Sub2_15.anInt3776);
		}
		if (this.aClass207_1 != null) {
			this.aClass106_Sub2_15.da(local26, local22 - 8.0F);
			this.aClass106_Sub2_15.method2886();
			this.aClass106_Sub2_15.method2847(this.aClass179_10, null, null, this.aClass179_7);
			this.aClass207_1.method4671(arg4, arg1, arg0, arg2, arg3);
		}
		this.aClass106_Sub2_15.da(local26, local22);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2184(arg4, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass207_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass106_Sub2_15.anInt3766 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			@Pc(39) int local39 = arg3 - (this.aClass106_Sub2_15.anInt3754 * arg2 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			this.aClass207_1.method4666(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	@Override
	public void method4432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!gk", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass207_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass106_Sub2_15.anInt3766 * arg2 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			@Pc(38) int local38 = arg3 - (this.aClass106_Sub2_15.anInt3754 * arg2 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			this.aClass207_1.method4667(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt2992 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt5777 + 1][super.anInt5775 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; local19 < super.anInt5777; local19++) {
				for (local23 = 1; super.anInt5775 > local23; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray12[local19][local23 - 1] >> 2) + (this.aByteArrayArray12[local19 - 1][local23] >> 2) + (this.aByteArrayArray12[local19 + 1][local23] >> 3) + (this.aByteArrayArray12[local19][local23 - -1] >> 3) + (this.aByteArrayArray12[local19][local23] >> 1));
				}
			}
			this.aClass1_Sub34Array1 = new Class1_Sub34[this.lb.method770()];
			this.lb.method772(this.aClass1_Sub34Array1);
			for (local23 = 0; local23 < this.aClass1_Sub34Array1.length; local23++) {
				this.aClass1_Sub34Array1[local23].method4420(this.anInt2992);
			}
			@Pc(131) int local131 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local131 += 4;
			}
			if ((this.anInt2973 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(153) NativeBuffer local153 = this.aClass106_Sub2_15.aNativeHeap2.a(this.anInt2992 * local131);
			@Pc(158) NativeStream local158 = new NativeStream(local153);
			@Pc(162) Class1_Sub34[] local162 = new Class1_Sub34[this.anInt2992];
			@Pc(169) int local169 = Static417.method5678(this.anInt2992 / 4);
			if (local169 < 1) {
				local169 = 1;
			}
			@Pc(181) Class38 local181 = new Class38(local169);
			@Pc(185) Class1_Sub34[] local185 = new Class1_Sub34[this.anInt2993];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; super.anInt5777 > local187; local187++) {
				for (local191 = 0; local191 < super.anInt5775; local191++) {
					if (this.anIntArrayArrayArray8[local187][local191] != null) {
						@Pc(207) Class1_Sub34[] local207 = this.aClass1_Sub34ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray4[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray9[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray5[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray8[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(263) int[] local263 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local187][local191];
						@Pc(270) float local270 = this.aFloatArrayArray4[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray5[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray6[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray4[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray5[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray6[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray4[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray5[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray6[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray4[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray5[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray6[local187 + 1][local191];
						@Pc(379) int local379 = local17[local187][local191] & 0xFF;
						@Pc(389) int local389 = local17[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local17[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local17[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label337: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class1_Sub34 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local421 == local185[local423]) {
									continue label337;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray1[local187 + local191 * super.anInt5777] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(482) int local482 = (local187 << super.anInt5779) + local214[local423];
							@Pc(491) int local491 = (local191 << super.anInt5779) + local221[local423];
							@Pc(496) int local496 = local482 >> this.anInt2986;
							@Pc(501) int local501 = local491 >> this.anInt2986;
							@Pc(505) int local505 = local235[local423];
							@Pc(509) int local509 = local228[local423];
							@Pc(517) int local517 = local247 == null ? 0 : local247[local423];
							@Pc(535) long local535 = (long) local501 | (long) (local496 << 16) | (long) local509 << 48 | (long) local505 << 32;
							@Pc(539) int local539 = local214[local423];
							@Pc(543) int local543 = local221[local423];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(549) float local549 = 1.0F;
							@Pc(664) float local664;
							@Pc(656) float local656;
							@Pc(673) float local673;
							@Pc(614) float local614;
							@Pc(709) int local709;
							if (local539 == 0 && local543 == 0) {
								local664 = local270;
								local709 = local545 - local379;
								local673 = local284;
								local656 = local277;
							} else if (local539 == 0 && super.anInt5778 == local543) {
								local673 = local311;
								local709 = local545 - local389;
								local664 = local293;
								local656 = local302;
							} else if (super.anInt5778 == local539 && local543 == super.anInt5778) {
								local709 = local545 - local401;
								local673 = local344;
								local656 = local333;
								local664 = local322;
							} else if (local539 == super.anInt5778 && local543 == 0) {
								local709 = local545 - local411;
								local673 = local371;
								local664 = local353;
								local656 = local362;
							} else {
								@Pc(589) float local589 = (float) local539 / (float) super.anInt5778;
								@Pc(596) float local596 = (float) local543 / (float) super.anInt5778;
								@Pc(605) float local605 = (local353 - local270) * local589 + local270;
								local614 = local277 + local589 * (local362 - local277);
								@Pc(623) float local623 = local284 + (local371 - local284) * local589;
								@Pc(631) float local631 = local293 + local589 * (local322 - local293);
								@Pc(639) float local639 = local302 + (local333 - local302) * local589;
								@Pc(647) float local647 = local589 * (local344 - local311) + local311;
								local656 = local614 + (local639 - local614) * local596;
								local664 = (local631 - local605) * local596 + local605;
								local673 = (local647 - local623) * local596 + local623;
								@Pc(684) int local684 = local379 + (local539 * (local411 - local379) >> super.anInt5779);
								@Pc(696) int local696 = local389 + ((local401 - local389) * local539 >> super.anInt5779);
								local709 = local545 - (local543 * (local696 - local684) >> super.anInt5779) - local684;
							}
							if (local505 != -1) {
								@Pc(768) int local768 = (local505 & 0x7F) * local709 >> 7;
								if (local768 < 2) {
									local768 = 2;
								} else if (local768 > 126) {
									local768 = 126;
								}
								if ((this.anInt2973 & 0x7) == 0) {
									local549 = this.aClass106_Sub2_15.aFloatArray18[2] * local673 + this.aClass106_Sub2_15.aFloatArray18[1] * local656 + local664 * this.aClass106_Sub2_15.aFloatArray18[0];
									local549 = this.aClass106_Sub2_15.aFloat56 + local549 * (local549 > 0.0F ? this.aClass106_Sub2_15.aFloat58 : this.aClass106_Sub2_15.aFloat42);
								}
								local547 = Static404.anIntArray530[local768 | local505 & 0xFF80];
							}
							@Pc(839) Class1 local839 = null;
							if ((local482 & this.anInt2971 - 1) == 0 && (this.anInt2971 - 1 & local491) == 0) {
								local839 = local181.method765(local535);
							}
							@Pc(1194) int local1194;
							@Pc(897) int local897;
							if (local839 == null) {
								if (local509 == local505) {
									local897 = local547;
								} else {
									@Pc(877) int local877 = (local509 & 0x7F) * local709 >> 7;
									if (local877 < 2) {
										local877 = 2;
									} else if (local877 > 126) {
										local877 = 126;
									}
									local897 = Static404.anIntArray530[local509 & 0xFF80 | local877];
									if ((this.anInt2973 & 0x7) == 0) {
										@Pc(928) float local928 = this.aClass106_Sub2_15.aFloatArray18[0] * local664 + local656 * this.aClass106_Sub2_15.aFloatArray18[1] + this.aClass106_Sub2_15.aFloatArray18[2] * local673;
										local614 = local549 * (local549 > 0.0F ? this.aClass106_Sub2_15.aFloat58 : this.aClass106_Sub2_15.aFloat42) + this.aClass106_Sub2_15.aFloat56;
										@Pc(953) int local953 = local897 >> 16 & 0xFF;
										@Pc(959) int local959 = local897 >> 8 & 0xFF;
										local953 = (int) ((float) local953 * local614);
										@Pc(969) int local969 = local897 & 0xFF;
										local959 = (int) ((float) local959 * local614);
										if (local953 < 0) {
											local953 = 0;
										} else if (local953 > 255) {
											local953 = 255;
										}
										if (local959 < 0) {
											local959 = 0;
										} else if (local959 > 255) {
											local959 = 255;
										}
										local969 = (int) ((float) local969 * local614);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local897 = local969 | local953 << 16 | local959 << 8;
									}
								}
								if (this.aClass106_Sub2_15.aBoolean227) {
									local158.a((float) local482);
									local158.a((float) (local517 + this.ca(local482, local491)));
									local158.a((float) local491);
									local158.b((byte) (local897 >> 16));
									local158.b((byte) (local897 >> 8));
									local158.b((byte) local897);
									local158.b(-1);
									local158.a((float) local482);
									local158.a((float) local491);
									if (this.anIntArrayArrayArray6 != null) {
										local158.a((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt2973 & 0x7) != 0) {
										local158.a(local664);
										local158.a(local656);
										local158.a(local673);
									}
								} else {
									local158.b((float) local482);
									local158.b((float) (this.ca(local482, local491) + local517));
									local158.b((float) local491);
									local158.b((byte) (local897 >> 16));
									local158.b((byte) (local897 >> 8));
									local158.b((byte) local897);
									local158.b(-1);
									local158.b((float) local482);
									local158.b((float) local491);
									if (this.anIntArrayArrayArray6 != null) {
										local158.b((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt2973 & 0x7) != 0) {
										local158.b(local664);
										local158.b(local656);
										local158.b(local673);
									}
								}
								local1194 = this.anInt2967++;
								local468[local423] = (short) local1194;
								if (local505 != -1) {
									local162[local1194] = local207[local423];
								}
								local181.method766(new Class1_Sub32(local468[local423]), local535);
							} else {
								local468[local423] = ((Class1_Sub32) local839).aShort78;
								local1194 = local468[local423] & 0xFFFF;
								if (local505 != -1 && local162[local1194].aLong228 > local207[local423].aLong228) {
									local162[local1194] = local207[local423];
								}
							}
							for (local897 = 0; local897 < local413; local897++) {
								local185[local897].method4419(local709, local547, local549, local1194);
							}
							this.anInt2970++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt2967; local191++) {
				@Pc(1314) Class1_Sub34 local1314 = local162[local191];
				if (local1314 != null) {
					local1314.method4421(local191);
				}
			}
			@Pc(1351) int local1351;
			for (@Pc(1331) int local1331 = 0; super.anInt5777 > local1331; local1331++) {
				for (@Pc(1335) int local1335 = 0; super.anInt5775 > local1335; local1335++) {
					@Pc(1347) short[] local1347 = this.aShortArrayArray1[local1335 * super.anInt5777 + local1331];
					if (local1347 != null) {
						local1351 = 0;
						@Pc(1353) int local1353 = 0;
						while (local1353 < local1347.length) {
							@Pc(1362) int local1362 = local1347[local1353++] & 0xFFFF;
							@Pc(1369) int local1369 = local1347[local1353++] & 0xFFFF;
							@Pc(1376) int local1376 = local1347[local1353++] & 0xFFFF;
							@Pc(1380) Class1_Sub34 local1380 = local162[local1362];
							@Pc(1384) Class1_Sub34 local1384 = local162[local1369];
							@Pc(1388) Class1_Sub34 local1388 = local162[local1376];
							@Pc(1390) Class1_Sub34 local1390 = null;
							if (local1380 != null) {
								local1390 = local1380;
								local1380.method4423(local1331, local1351, local1335);
							}
							if (local1384 != null) {
								local1384.method4423(local1331, local1351, local1335);
								if (local1390 == null || local1390.aLong228 > local1384.aLong228) {
									local1390 = local1384;
								}
							}
							if (local1388 != null) {
								local1388.method4423(local1331, local1351, local1335);
								if (local1390 == null || local1388.aLong228 < local1390.aLong228) {
									local1390 = local1388;
								}
							}
							if (local1390 != null) {
								if (local1380 != null) {
									local1390.method4421(local1362);
								}
								if (local1384 != null) {
									local1390.method4421(local1369);
								}
								if (local1388 != null) {
									local1390.method4421(local1376);
								}
								local1390.method4423(local1331, local1351, local1335);
							}
							local1351++;
						}
					}
				}
			}
			local158.b();
			this.anInterface3_3 = this.aClass106_Sub2_15.method2864(local131, local158.c(), local153);
			this.aClass179_7 = new Class179(this.anInterface3_3, 5126, 3, 0);
			this.aClass179_8 = new Class179(this.anInterface3_3, 5121, 4, 12);
			@Pc(1537) byte local1537;
			if (this.anIntArrayArrayArray6 == null) {
				this.aClass179_10 = new Class179(this.anInterface3_3, 5126, 2, 16);
				local1537 = 24;
			} else {
				local1537 = 28;
				this.aClass179_10 = new Class179(this.anInterface3_3, 5126, 3, 16);
			}
			if ((this.anInt2973 & 0x7) != 0) {
				this.aClass179_9 = new Class179(this.anInterface3_3, 5126, 3, local1537);
			}
			@Pc(1571) long[] local1571 = new long[this.aClass1_Sub34Array1.length];
			for (local1351 = 0; local1351 < this.aClass1_Sub34Array1.length; local1351++) {
				@Pc(1580) Class1_Sub34 local1580 = this.aClass1_Sub34Array1[local1351];
				local1571[local1351] = local1580.aLong228;
				local1580.method4422(this.anInt2967);
			}
			Static124.method2027(local1571, this.aClass1_Sub34Array1);
			if (this.aClass207_1 != null) {
				this.aClass207_1.method4668();
			}
		} else {
			this.aClass207_1 = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.aByteArrayArray12 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass1_Sub34ArrayArrayArray1 = null;
		this.lb = null;
		this.anIntArrayArrayArray4 = this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method4435(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass207_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass106_Sub2_15.anInt3766 * arg2 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			@Pc(39) int local39 = arg3 - (this.aClass106_Sub2_15.anInt3754 * arg2 >> 8) >> this.aClass106_Sub2_15.anInt3734;
			return this.aClass207_1.method4669(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt5777][super.anInt5775][];
		}
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt5777][super.anInt5775][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub34[] local88 = this.aClass1_Sub34ArrayArrayArray1[arg0][arg1] = new Class1_Sub34[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.lb.method765(local119); local125 != null; local125 = this.lb.method775()) {
				@Pc(130) Class1_Sub34 local130 = (Class1_Sub34) local125;
				if (local130.anInt5766 == arg8[local90] && local130.aFloat89 == (float) arg9[local90] && local130.anInt5767 == arg10 && arg11 == local130.anInt5761 && arg12 == local130.anInt5765) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub34(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.lb.method766(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub34) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray11[arg0][arg1] = (byte) (this.aByteArrayArray11[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2993) {
			this.anInt2993 = arg6.length;
		}
		this.anInt2992 += arg6.length;
	}

	@OriginalMember(owner = "client!gk", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray30[arg0][arg1];
	}
}
