import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
	private int anInt3202;

	@OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
	private int anInt3204;

	@OriginalMember(owner = "client!gba", name = "bb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Lclient!ib;")
	public Class170 aClass170_7;

	@OriginalMember(owner = "client!gba", name = "X", descriptor = "Lclient!ib;")
	public Class170 aClass170_8;

	@OriginalMember(owner = "client!gba", name = "db", descriptor = "I")
	private int anInt3219;

	@OriginalMember(owner = "client!gba", name = "V", descriptor = "Lclient!ib;")
	public Class170 aClass170_9;

	@OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
	private int anInt3220;

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_3;

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "[Lclient!gka;")
	private Class2_Sub29[] aClass2_Sub29Array1;

	@OriginalMember(owner = "client!gba", name = "cb", descriptor = "Lclient!ib;")
	private Class170 aClass170_10;

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "Lclient!cga;")
	private final Class60 aClass60_60 = new Class60();

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "Lclient!uja;")
	public final Class145_Sub3 aClass145_Sub3_14;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
	private final int anInt3213;

	@OriginalMember(owner = "client!gba", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
	private final int anInt3209;

	@OriginalMember(owner = "client!gba", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!gba", name = "gb", descriptor = "[[B")
	private final byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!gba", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
	public final int anInt3208;

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!gba", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!gba", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!gba", name = "ab", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!gba", name = "C", descriptor = "[[[Lclient!gka;")
	private Class2_Sub29[][][] aClass2_Sub29ArrayArrayArray1;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "Lclient!lba;")
	private Class218 aClass218_15;

	@OriginalMember(owner = "client!gba", name = "eb", descriptor = "Lclient!li;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!uja;IIII[[I[[II)V")
	public Class133_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass145_Sub3_14 = arg0;
		this.anInt3213 = super.anInt9317 - 2;
		this.aFloatArrayArray9 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.anInt3209 = 0x1 << this.anInt3213;
		this.aFloatArrayArray10 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.aByteArrayArray3 = new byte[arg3][arg4];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt3208 = arg2;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass2_Sub29ArrayArrayArray1 = new Class2_Sub29[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt9315 > local115; local115++) {
			for (@Pc(121) int local121 = 1; super.anInt9318 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(156) int local156 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * arg7 * 4)));
				this.aFloatArrayArray9[local121][local115] = (float) local139 * local175;
				this.aFloatArrayArray11[local121][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray10[local121][local115] = (float) local156 * local175;
			}
		}
		this.aClass218_15 = new Class218(128);
		if ((this.anInt3208 & 0x10) != 0) {
			this.aClass223_1 = new Class223(this.aClass145_Sub3_14, this);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2788(-1, arg2, arg3, arg1, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2788(arg5, arg2, arg3, arg1, arg6, arg0, arg4);
	}

	@OriginalMember(owner = "client!gba", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass223_1 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (arg2 * this.aClass145_Sub3_14.anInt10171 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			@Pc(41) int local41 = arg3 - (arg2 * this.aClass145_Sub3_14.anInt10170 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			this.aClass223_1.method5225(local26, local41, arg0);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!kja;I)V")
	private void method2787(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6_Sub9_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass145_Sub3_14.anIntArray716.length < local22) {
			this.aClass145_Sub3_14.anIntArray715 = new int[local22];
			this.aClass145_Sub3_14.anIntArray716 = new int[local22];
		}
		@Pc(44) int[] local44 = this.aClass145_Sub3_14.anIntArray716;
		@Pc(48) int[] local48 = this.aClass145_Sub3_14.anIntArray715;
		for (@Pc(55) int local55 = 0; local55 < local22; local55++) {
			local44[local55] = local12[local55] >> this.aClass145_Sub3_14.anInt10144;
			local48[local55] = local19[local55] >> this.aClass145_Sub3_14.anInt10144;
		}
		@Pc(89) int local89 = 0;
		while (local22 > local89) {
			@Pc(97) int local97 = local44[local89];
			@Pc(102) int local102 = local48[local89++];
			@Pc(106) int local106 = local44[local89];
			@Pc(111) int local111 = local48[local89++];
			@Pc(115) int local115 = local44[local89];
			@Pc(120) int local120 = local48[local89++];
			if (-((local115 - local106) * (-local102 + local111)) + (local111 - local120) * (local97 - local106) > 0) {
				arg1.method4633(local102, local120, local106, local115, local97, local111);
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass223_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass145_Sub3_14.anInt10171 * arg2 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			@Pc(42) int local42 = arg3 - (this.aClass145_Sub3_14.anInt10170 * arg2 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			this.aClass223_1.method5224(local42, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!gba", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub9 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9321 >> this.aClass145_Sub3_14.anInt10144;
		@Pc(25) Class2_Sub6_Sub9_Sub1 local25 = (Class2_Sub6_Sub9_Sub1) arg2;
		@Pc(43) Class2_Sub6_Sub9_Sub1 local43;
		if (local25 != null && local25.method4629(local22, local22)) {
			local43 = local25;
			local25.method4631();
		} else {
			local43 = new Class2_Sub6_Sub9_Sub1(this.aClass145_Sub3_14, local22, local22);
		}
		local43.method4634(0, 0, local22, local22);
		this.method2787(arg0, local43, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!bba;[I)V")
	@Override
	public void method8215(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass60_60.method1233(new Class2_Sub15(this.aClass145_Sub3_14, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!gba", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray4[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8213(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass223_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(27) int local27 = arg1 - (this.aClass145_Sub3_14.anInt10171 * arg2 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			@Pc(41) int local41 = arg3 - (this.aClass145_Sub3_14.anInt10170 * arg2 >> 8) >> this.aClass145_Sub3_14.anInt10144;
			return this.aClass223_1.method5220(local41, arg0, local27);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III[[ZIIIZ)V")
	private void method2788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass2_Sub29Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg1 + arg1 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (this.aClass145_Sub3_14.anIntArray714.length < local18) {
			this.aClass145_Sub3_14.anIntArray714 = new int[local18];
		}
		if (this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3.aByteArray111.length < this.anInt3202 * 2) {
			this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3 = new Class2_Sub20_Sub1(this.anInt3202 * 2);
		}
		@Pc(61) int local61 = arg5 - arg1;
		@Pc(63) int local63 = local61;
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(74) int local74 = arg3 - arg1;
		@Pc(76) int local76 = local74;
		if (local74 < 0) {
			local74 = 0;
		}
		@Pc(87) int local87 = arg5 + arg1;
		if (local87 > super.anInt9318 - 1) {
			local87 = super.anInt9318 - 1;
		}
		@Pc(103) int local103 = arg3 + arg1;
		if (local103 > super.anInt9315 - 1) {
			local103 = super.anInt9315 - 1;
		}
		@Pc(116) int local116 = 0;
		@Pc(120) int[] local120 = this.aClass145_Sub3_14.anIntArray714;
		@Pc(133) int local133;
		for (@Pc(122) int local122 = local61; local122 <= local87; local122++) {
			@Pc(131) boolean[] local131 = arg2[local122 - local63];
			for (local133 = local74; local133 <= local103; local133++) {
				if (local131[local133 - local76]) {
					local120[local116++] = local122 + local133 * super.anInt9318;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass145_Sub3_14.method8888();
		} else {
			this.aClass145_Sub3_14.method8862((float) arg0);
			this.aClass145_Sub3_14.method8868();
		}
		this.aClass145_Sub3_14.method8907((this.anInt3208 & 0x7) != 0);
		for (@Pc(214) int local214 = 0; local214 < this.aClass2_Sub29Array1.length; local214++) {
			this.aClass2_Sub29Array1[local214].method2969(local116, local120);
		}
		if (!this.aClass60_60.method1221()) {
			local133 = this.aClass145_Sub3_14.anInt10167;
			@Pc(253) int local253 = this.aClass145_Sub3_14.anInt10187;
			this.aClass145_Sub3_14.L(0, local253, this.aClass145_Sub3_14.anInt10179);
			this.aClass145_Sub3_14.method8907(false);
			this.aClass145_Sub3_14.method8905(false);
			this.aClass145_Sub3_14.method8847(128);
			this.aClass145_Sub3_14.method8881(-2);
			this.aClass145_Sub3_14.method8872(this.aClass145_Sub3_14.aClass64_Sub4_6);
			this.aClass145_Sub3_14.method8897(7681, 8448);
			this.aClass145_Sub3_14.method8854(0, 34166, 770);
			this.aClass145_Sub3_14.method8857(34167, 0);
			for (@Pc(313) Class2 local313 = this.aClass60_60.method1226(7); local313 != null; local313 = this.aClass60_60.method1228()) {
				@Pc(318) Class2_Sub15 local318 = (Class2_Sub15) local313;
				local318.method1289(arg1, arg3, arg5, arg2);
			}
			this.aClass145_Sub3_14.method8854(0, 5890, 768);
			this.aClass145_Sub3_14.method8857(5890, 0);
			this.aClass145_Sub3_14.method8872((Class64) null);
			this.aClass145_Sub3_14.L(local133, local253, this.aClass145_Sub3_14.anInt10179);
		}
		if (this.aClass223_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass145_Sub3_14.method8874((Class170) null, this.aClass170_9, (Class170) null, this.aClass170_8);
		this.aClass223_1.method5221(arg2, arg1, arg3, arg6, arg5);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gba", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9318][super.anInt9315][];
		}
		@Pc(25) Interface3 local25 = this.aClass145_Sub3_14.anInterface3_12;
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt9318][super.anInt9315][];
		}
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(104) Class2_Sub29[] local104 = this.aClass2_Sub29ArrayArrayArray1[arg0][arg1] = new Class2_Sub29[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt3208 & 0x20) != 0 && local114 != -1 && local25.method2857(local114).aBoolean32) {
				local114 = -1;
				local118 = 128;
			}
			@Pc(164) long local164 = (long) local114 | (long) (local118 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(170) Class2 local170;
			for (local170 = this.aClass218_15.method5095(local164, 0); local170 != null; local170 = this.aClass218_15.method5100((byte) 67)) {
				@Pc(177) Class2_Sub29 local177 = (Class2_Sub29) local170;
				if (local177.anInt3391 == local114 && local177.aFloat45 == (float) local118 && local177.anInt3399 == arg10 && local177.anInt3392 == arg11 && local177.anInt3394 == arg12) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class2_Sub29(this, local114, local118, arg10, arg11, arg12);
				this.aClass218_15.method5099(local104[local106], local164);
			} else {
				local104[local106] = (Class2_Sub29) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (this.anInt3220 < arg6.length) {
			this.anInt3220 = arg6.length;
		}
		this.anInt3219 += arg6.length;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8219(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3219 <= 0) {
			return;
		}
		this.aClass145_Sub3_14.method8855();
		this.aClass145_Sub3_14.method8885(false);
		this.aClass145_Sub3_14.method8907(false);
		this.aClass145_Sub3_14.method8844(false);
		this.aClass145_Sub3_14.method8905(false);
		this.aClass145_Sub3_14.method8847(0);
		this.aClass145_Sub3_14.method8881(-2);
		this.aClass145_Sub3_14.method8872((Class64) null);
		Static636.aFloatArray61[7] = 0.0F;
		Static636.aFloatArray61[11] = 0.0F;
		Static636.aFloatArray61[4] = 0.0F;
		Static636.aFloatArray61[5] = (float) 1024 / ((float) super.anInt9321 * 128.0F * (float) this.aClass145_Sub3_14.anInt10030);
		Static636.aFloatArray61[3] = 0.0F;
		Static636.aFloatArray61[15] = 1.0F;
		Static636.aFloatArray61[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass145_Sub3_14.anInt10030;
		Static636.aFloatArray61[2] = 0.0F;
		Static636.aFloatArray61[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass145_Sub3_14.anInt10039) - 1.0F;
		Static636.aFloatArray61[14] = 0.0F;
		Static636.aFloatArray61[8] = 0.0F;
		Static636.aFloatArray61[10] = 0.0F;
		Static636.aFloatArray61[1] = 0.0F;
		Static636.aFloatArray61[6] = 0.0F;
		Static636.aFloatArray61[9] = 0.0F;
		Static636.aFloatArray61[0] = (float) 1024 / ((float) this.aClass145_Sub3_14.anInt10039 * 128.0F * (float) super.anInt9321);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static636.aFloatArray61, 0);
		Static636.aFloatArray61[12] = 0.0F;
		Static636.aFloatArray61[5] = 0.0F;
		Static636.aFloatArray61[13] = 0.0F;
		Static636.aFloatArray61[4] = 0.0F;
		Static636.aFloatArray61[6] = 1.0F;
		Static636.aFloatArray61[11] = 0.0F;
		Static636.aFloatArray61[14] = 0.0F;
		Static636.aFloatArray61[2] = 0.0F;
		Static636.aFloatArray61[7] = 0.0F;
		Static636.aFloatArray61[0] = 1.0F;
		Static636.aFloatArray61[1] = 0.0F;
		Static636.aFloatArray61[15] = 1.0F;
		Static636.aFloatArray61[3] = 0.0F;
		Static636.aFloatArray61[10] = 0.0F;
		Static636.aFloatArray61[9] = 1.0F;
		Static636.aFloatArray61[8] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static636.aFloatArray61, 0);
		if ((this.anInt3208 & 0x7) == 0) {
			this.aClass145_Sub3_14.method8907(false);
		} else {
			this.aClass145_Sub3_14.method8907(true);
			this.aClass145_Sub3_14.method8853();
		}
		this.aClass145_Sub3_14.method8874(this.aClass170_10, this.aClass170_9, this.aClass170_7, this.aClass170_8);
		if (this.anInt3202 * 2 > this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3.aByteArray111.length) {
			this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3 = new Class2_Sub20_Sub1(this.anInt3202 * 2);
		} else {
			this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3.anInt9723 = 0;
		}
		@Pc(318) int local318 = 0;
		@Pc(322) Class2_Sub20_Sub1 local322 = this.aClass145_Sub3_14.aClass2_Sub20_Sub1_3;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(340) int local340;
		@Pc(360) short[] local360;
		@Pc(364) int local364;
		if (this.aClass145_Sub3_14.aBoolean872) {
			for (local328 = arg1; local328 < arg3; local328++) {
				local338 = super.anInt9318 * local328 + arg0;
				for (local340 = arg0; local340 < arg2; local340++) {
					if (arg4[local340 - arg0][local328 - arg1]) {
						local360 = this.aShortArrayArray3[local338];
						if (local360 != null) {
							for (local364 = 0; local364 < local360.length; local364++) {
								local318++;
								local322.method8551(local360[local364] & 0xFFFF);
							}
						}
					}
					local338++;
				}
			}
		} else {
			for (local328 = arg1; local328 < arg3; local328++) {
				local338 = super.anInt9318 * local328 + arg0;
				for (local340 = arg0; local340 < arg2; local340++) {
					if (arg4[local340 - arg0][local328 - arg1]) {
						local360 = this.aShortArrayArray3[local338];
						if (local360 != null) {
							for (local364 = 0; local364 < local360.length; local364++) {
								local322.method8589(local360[local364] & 0xFFFF);
								local318++;
							}
						}
					}
					local338++;
				}
			}
		}
		if (local318 > 0) {
			@Pc(503) Class172_Sub1 local503 = new Class172_Sub1(this.aClass145_Sub3_14, 5123, local322.aByteArray111, local322.anInt9723);
			this.aClass145_Sub3_14.method8921(local318, 0, local503);
		}
	}

	@OriginalMember(owner = "client!gba", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt3219 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt9318 + 1][super.anInt9315 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt9318 > local16; local16++) {
				for (local20 = 1; super.anInt9315 > local20; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray4[local16][local20] >> 1) + (this.aByteArrayArray4[local16][local20 - 1] >> 2) + (this.aByteArrayArray4[local16 - -1][local20] >> 3) + (this.aByteArrayArray4[local16 + -1][local20] >> 2) + (this.aByteArrayArray4[local16][local20 - -1] >> 3));
				}
			}
			this.aClass2_Sub29Array1 = new Class2_Sub29[this.aClass218_15.method5094()];
			this.aClass218_15.method5091(this.aClass2_Sub29Array1);
			for (local20 = 0; local20 < this.aClass2_Sub29Array1.length; local20++) {
				this.aClass2_Sub29Array1[local20].method2970(this.anInt3219);
			}
			@Pc(138) int local138 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local138 += 4;
			}
			if ((this.anInt3208 & 0x7) != 0) {
				local138 += 12;
			}
			@Pc(167) NativeHeapBuffer local167 = this.aClass145_Sub3_14.aNativeHeap5.a(this.anInt3219 * local138, false);
			@Pc(172) Stream local172 = new Stream(local167);
			@Pc(176) Class2_Sub29[] local176 = new Class2_Sub29[this.anInt3219];
			@Pc(183) int local183 = Static457.method6640(this.anInt3219 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(195) Class218 local195 = new Class218(local183);
			@Pc(199) Class2_Sub29[] local199 = new Class2_Sub29[this.anInt3220];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; super.anInt9318 > local201; local201++) {
				for (local205 = 0; local205 < super.anInt9315; local205++) {
					if (this.anIntArrayArrayArray10[local201][local205] != null) {
						@Pc(223) Class2_Sub29[] local223 = this.aClass2_Sub29ArrayArrayArray1[local201][local205];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray12[local201][local205];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray13[local201][local205];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray11[local201][local205];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray10[local201][local205];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local201][local205];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(281) int[] local281 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local201][local205];
						@Pc(288) float local288 = this.aFloatArrayArray9[local201][local205];
						@Pc(295) float local295 = this.aFloatArrayArray11[local201][local205];
						@Pc(302) float local302 = this.aFloatArrayArray10[local201][local205];
						@Pc(311) float local311 = this.aFloatArrayArray9[local201][local205 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray11[local201][local205 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray10[local201][local205 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray9[local201 + 1][local205 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray11[local201 + 1][local205 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray10[local201 + 1][local205 + 1];
						@Pc(371) float local371 = this.aFloatArrayArray9[local201 + 1][local205];
						@Pc(380) float local380 = this.aFloatArrayArray11[local201 + 1][local205];
						@Pc(389) float local389 = this.aFloatArrayArray10[local201 + 1][local205];
						@Pc(397) int local397 = local14[local201][local205] & 0xFF;
						@Pc(407) int local407 = local14[local201][local205 + 1] & 0xFF;
						@Pc(419) int local419 = local14[local201 + 1][local205 + 1] & 0xFF;
						@Pc(429) int local429 = local14[local201 + 1][local205] & 0xFF;
						@Pc(431) int local431 = 0;
						@Pc(441) int local441;
						label335: for (@Pc(433) int local433 = 0; local433 < local251.length; local433++) {
							@Pc(439) Class2_Sub29 local439 = local223[local433];
							for (local441 = 0; local441 < local431; local441++) {
								if (local199[local441] == local439) {
									continue label335;
								}
							}
							local199[local431++] = local439;
						}
						@Pc(493) short[] local493 = this.aShortArrayArray3[super.anInt9318 * local205 + local201] = new short[local251.length];
						for (local441 = 0; local441 < local251.length; local441++) {
							@Pc(507) int local507 = (local201 << super.anInt9317) + local230[local441];
							@Pc(517) int local517 = (local205 << super.anInt9317) + local237[local441];
							@Pc(522) int local522 = local507 >> this.anInt3213;
							@Pc(527) int local527 = local517 >> this.anInt3213;
							@Pc(531) int local531 = local251[local441];
							@Pc(535) int local535 = local244[local441];
							@Pc(544) int local544 = local264 == null ? 0 : local264[local441];
							@Pc(562) long local562 = (long) local527 | (long) local535 << 48 | (long) local531 << 32 | (long) (local522 << 16);
							@Pc(566) int local566 = local230[local441];
							@Pc(570) int local570 = local237[local441];
							@Pc(572) byte local572 = 74;
							@Pc(574) int local574 = 0;
							@Pc(576) float local576 = 1.0F;
							@Pc(604) float local604;
							@Pc(608) float local608;
							@Pc(606) float local606;
							@Pc(683) float local683;
							@Pc(602) int local602;
							if (local566 == 0 && local570 == 0) {
								local602 = local572 - local397;
								local606 = local302;
								local604 = local288;
								local608 = local295;
							} else if (local566 == 0 && super.anInt9321 == local570) {
								local602 = local572 - local407;
								local604 = local311;
								local606 = local329;
								local608 = local320;
							} else if (super.anInt9321 == local566 && local570 == super.anInt9321) {
								local602 = local572 - local419;
								local608 = local351;
								local606 = local362;
								local604 = local340;
							} else if (local566 == super.anInt9321 && local570 == 0) {
								local606 = local389;
								local608 = local380;
								local604 = local371;
								local602 = local572 - local429;
							} else {
								@Pc(658) float local658 = (float) local566 / (float) super.anInt9321;
								@Pc(665) float local665 = (float) local570 / (float) super.anInt9321;
								@Pc(674) float local674 = local288 + (local371 - local288) * local658;
								local683 = local295 + local658 * (local380 - local295);
								@Pc(692) float local692 = local302 + (local389 - local302) * local658;
								@Pc(700) float local700 = (local340 - local311) * local658 + local311;
								@Pc(708) float local708 = local658 * (local351 - local320) + local320;
								@Pc(717) float local717 = local329 + (local362 - local329) * local658;
								local604 = local674 + local665 * (local700 - local674);
								local608 = local683 + local665 * (local708 - local683);
								local606 = (local717 - local692) * local665 + local692;
								@Pc(753) int local753 = ((local429 - local397) * local566 >> super.anInt9317) + local397;
								@Pc(765) int local765 = (local566 * (local419 - local407) >> super.anInt9317) + local407;
								local602 = local572 - (local570 * (local765 - local753) >> super.anInt9317) - local753;
							}
							if (local531 != -1) {
								@Pc(814) int local814 = (local531 & 0x7F) * local602 >> 7;
								if (local814 < 2) {
									local814 = 2;
								} else if (local814 > 126) {
									local814 = 126;
								}
								local574 = Static555.anIntArray633[local531 & 0xFF80 | local814];
								if ((this.anInt3208 & 0x7) == 0) {
									local576 = this.aClass145_Sub3_14.aFloatArray62[0] * local604 + local608 * this.aClass145_Sub3_14.aFloatArray62[1] + this.aClass145_Sub3_14.aFloatArray62[2] * local606;
									local576 = (local576 > 0.0F ? this.aClass145_Sub3_14.aFloat170 : this.aClass145_Sub3_14.aFloat165) * local576 + this.aClass145_Sub3_14.aFloat158;
								}
							}
							@Pc(891) Class2 local891 = null;
							if ((this.anInt3209 - 1 & local507) == 0 && (local517 & this.anInt3209 - 1) == 0) {
								local891 = local195.method5095(local562, 0);
							}
							@Pc(1274) int local1274;
							@Pc(925) int local925;
							if (local891 == null) {
								if (local531 == local535) {
									local925 = local574;
								} else {
									@Pc(935) int local935 = local602 * (local535 & 0x7F) >> 7;
									if (local935 < 2) {
										local935 = 2;
									} else if (local935 > 126) {
										local935 = 126;
									}
									local925 = Static555.anIntArray633[local535 & 0xFF80 | local935];
									if ((this.anInt3208 & 0x7) == 0) {
										local683 = this.aClass145_Sub3_14.aFloatArray62[1] * local608 + local604 * this.aClass145_Sub3_14.aFloatArray62[0] + local606 * this.aClass145_Sub3_14.aFloatArray62[2];
										local683 = (local576 > 0.0F ? this.aClass145_Sub3_14.aFloat170 : this.aClass145_Sub3_14.aFloat165) * local576 + this.aClass145_Sub3_14.aFloat158;
										@Pc(1016) int local1016 = local925 >> 16 & 0xFF;
										@Pc(1022) int local1022 = local925 >> 8 & 0xFF;
										local1016 = (int) ((float) local1016 * local683);
										@Pc(1032) int local1032 = local925 & 0xFF;
										local1022 = (int) ((float) local1022 * local683);
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										if (local1022 < 0) {
											local1022 = 0;
										} else if (local1022 > 255) {
											local1022 = 255;
										}
										local1032 = (int) ((float) local1032 * local683);
										if (local1032 < 0) {
											local1032 = 0;
										} else if (local1032 > 255) {
											local1032 = 255;
										}
										local925 = local1032 | local1022 << 8 | local1016 << 16;
									}
								}
								if (this.aClass145_Sub3_14.aBoolean872) {
									local172.b((float) local507);
									local172.b((float) (local544 + this.method8214(local507, local517)));
									local172.b((float) local517);
									local172.c((byte) (local925 >> 16));
									local172.c((byte) (local925 >> 8));
									local172.c((byte) local925);
									local172.c(-1);
									local172.b((float) local507);
									local172.b((float) local517);
									if (this.anIntArrayArrayArray14 != null) {
										local172.b((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt3208 & 0x7) != 0) {
										local172.b(local604);
										local172.b(local608);
										local172.b(local606);
									}
								} else {
									local172.a((float) local507);
									local172.a((float) (local544 + this.method8214(local507, local517)));
									local172.a((float) local517);
									local172.c((byte) (local925 >> 16));
									local172.c((byte) (local925 >> 8));
									local172.c((byte) local925);
									local172.c(-1);
									local172.a((float) local507);
									local172.a((float) local517);
									if (this.anIntArrayArrayArray14 != null) {
										local172.a((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt3208 & 0x7) != 0) {
										local172.a(local604);
										local172.a(local608);
										local172.a(local606);
									}
								}
								local1274 = this.anInt3204++;
								local493[local441] = (short) local1274;
								if (local531 != -1) {
									local176[local1274] = local223[local441];
								}
								local195.method5099(new Class2_Sub16(local493[local441]), local562);
							} else {
								local493[local441] = ((Class2_Sub16) local891).aShort38;
								local1274 = local493[local441] & 0xFFFF;
								if (local531 != -1 && local223[local441].aLong352 < local176[local1274].aLong352) {
									local176[local1274] = local223[local441];
								}
							}
							for (local925 = 0; local925 < local431; local925++) {
								local199[local925].method2971(local574, local602, local1274, local576);
							}
							this.anInt3202++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt3204; local205++) {
				@Pc(1408) Class2_Sub29 local1408 = local176[local205];
				if (local1408 != null) {
					local1408.method2968(local205);
				}
			}
			@Pc(1448) int local1448;
			for (@Pc(1427) int local1427 = 0; super.anInt9318 > local1427; local1427++) {
				for (@Pc(1431) int local1431 = 0; local1431 < super.anInt9315; local1431++) {
					@Pc(1444) short[] local1444 = this.aShortArrayArray3[super.anInt9318 * local1431 + local1427];
					if (local1444 != null) {
						local1448 = 0;
						@Pc(1450) int local1450 = 0;
						while (local1450 < local1444.length) {
							@Pc(1459) int local1459 = local1444[local1450++] & 0xFFFF;
							@Pc(1466) int local1466 = local1444[local1450++] & 0xFFFF;
							@Pc(1473) int local1473 = local1444[local1450++] & 0xFFFF;
							@Pc(1477) Class2_Sub29 local1477 = local176[local1459];
							@Pc(1481) Class2_Sub29 local1481 = local176[local1466];
							@Pc(1485) Class2_Sub29 local1485 = local176[local1473];
							@Pc(1487) Class2_Sub29 local1487 = null;
							if (local1477 != null) {
								local1487 = local1477;
								local1477.method2972(local1427, local1448, local1431);
							}
							if (local1481 != null) {
								local1481.method2972(local1427, local1448, local1431);
								if (local1487 == null || local1481.aLong352 < local1487.aLong352) {
									local1487 = local1481;
								}
							}
							if (local1485 != null) {
								local1485.method2972(local1427, local1448, local1431);
								if (local1487 == null || local1487.aLong352 > local1485.aLong352) {
									local1487 = local1485;
								}
							}
							if (local1487 != null) {
								if (local1477 != null) {
									local1487.method2968(local1459);
								}
								if (local1481 != null) {
									local1487.method2968(local1466);
								}
								if (local1485 != null) {
									local1487.method2968(local1473);
								}
								local1487.method2972(local1427, local1448, local1431);
							}
							local1448++;
						}
					}
				}
			}
			local172.a();
			this.anInterface13_3 = this.aClass145_Sub3_14.method8895(local172.c(), local167, local138);
			this.aClass170_9 = new Class170(this.anInterface13_3, 5126, 3, 0);
			this.aClass170_10 = new Class170(this.anInterface13_3, 5121, 4, 12);
			@Pc(1642) byte local1642;
			if (this.anIntArrayArrayArray14 == null) {
				local1642 = 24;
				this.aClass170_8 = new Class170(this.anInterface13_3, 5126, 2, 16);
			} else {
				this.aClass170_8 = new Class170(this.anInterface13_3, 5126, 3, 16);
				local1642 = 28;
			}
			if ((this.anInt3208 & 0x7) != 0) {
				this.aClass170_7 = new Class170(this.anInterface13_3, 5126, 3, local1642);
			}
			@Pc(1688) long[] local1688 = new long[this.aClass2_Sub29Array1.length];
			for (local1448 = 0; local1448 < this.aClass2_Sub29Array1.length; local1448++) {
				@Pc(1699) Class2_Sub29 local1699 = this.aClass2_Sub29Array1[local1448];
				local1688[local1448] = local1699.aLong352;
				local1699.method2967(this.anInt3204);
			}
			Static118.method1732(local1688, this.aClass2_Sub29Array1);
			if (this.aClass223_1 != null) {
				this.aClass223_1.method5217();
			}
		} else {
			this.aClass223_1 = null;
		}
		this.aClass2_Sub29ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray11 = this.aFloatArrayArray10 = null;
		this.anIntArrayArrayArray14 = null;
		this.aByteArrayArray4 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass218_15 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
	@Override
	public void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
