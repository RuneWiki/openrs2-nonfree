import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!jt", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!jt", name = "W", descriptor = "I")
	private int anInt3682;

	@OriginalMember(owner = "client!jt", name = "bb", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!jt", name = "db", descriptor = "Lclient!ds;")
	public Class58 aClass58_3;

	@OriginalMember(owner = "client!jt", name = "fb", descriptor = "[Lclient!uv;")
	private Class1_Sub42[] aClass1_Sub42Array1;

	@OriginalMember(owner = "client!jt", name = "hb", descriptor = "Lclient!ds;")
	public Class58 aClass58_4;

	@OriginalMember(owner = "client!jt", name = "ib", descriptor = "Lclient!ds;")
	public Class58 aClass58_5;

	@OriginalMember(owner = "client!jt", name = "kb", descriptor = "Lclient!bm;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!jt", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!jt", name = "mb", descriptor = "I")
	private int anInt3685;

	@OriginalMember(owner = "client!jt", name = "ob", descriptor = "Lclient!ds;")
	private Class58 aClass58_6;

	@OriginalMember(owner = "client!jt", name = "R", descriptor = "Lclient!wo;")
	private final Class266 aClass266_31 = new Class266();

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "Lclient!ht;")
	public final Class109_Sub1 aClass109_Sub1_24;

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "[[I")
	private final int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
	private final int anInt3671;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "[[B")
	private final byte[][] aByteArrayArray67;

	@OriginalMember(owner = "client!jt", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
	public final int anInt3660;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!jt", name = "ab", descriptor = "[[[Lclient!uv;")
	private Class1_Sub42[][][] aClass1_Sub42ArrayArrayArray1;

	@OriginalMember(owner = "client!jt", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!jt", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
	private final int anInt3662;

	@OriginalMember(owner = "client!jt", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray68;

	@OriginalMember(owner = "client!jt", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!jt", name = "nb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!jt", name = "jb", descriptor = "Lclient!bj;")
	private Class27 aClass27_25;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "Lclient!ac;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ht;IIII[[I[[II)V")
	public Class136_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass109_Sub1_24 = arg0;
		this.anIntArrayArray101 = arg5;
		this.anInt3671 = super.anInt7660 - 2;
		this.aByteArrayArray67 = new byte[arg3][arg4];
		this.aFloatArrayArray4 = new float[super.anInt7662 + 1][super.anInt7664 + 1];
		this.anInt3660 = arg2;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aShortArrayArray5 = new short[arg4 * arg3][];
		this.aClass1_Sub42ArrayArrayArray1 = new Class1_Sub42[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt7662 + 1][super.anInt7664 + 1];
		this.anInt3662 = 0x1 << this.anInt3671;
		this.aByteArrayArray68 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt7662 + 1][super.anInt7664 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt7664; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt7662 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray4[local121][local117] = local177 * (float) local140;
				this.aFloatArrayArray5[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local121][local117] = (float) local157 * local177;
			}
		}
		this.aClass27_25 = new Class27(128);
		if ((this.anInt3660 & 0x10) != 0) {
			this.aClass4_1 = new Class4(this.aClass109_Sub1_24, this);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method5978(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass4_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass109_Sub1_24.anInt3002 * arg2 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			@Pc(40) int local40 = arg3 - (this.aClass109_Sub1_24.anInt2997 * arg2 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			return this.aClass4_1.method158(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!jt", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass4_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass109_Sub1_24.anInt3002 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			@Pc(39) int local39 = arg3 - (this.aClass109_Sub1_24.anInt2997 * arg2 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			this.aClass4_1.method157(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.JA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class1_Sub2_Sub11 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub11 arg2) {
		if ((this.aByteArrayArray67[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7661 >> this.aClass109_Sub1_24.anInt2976;
		@Pc(24) Class1_Sub2_Sub11_Sub1 local24 = (Class1_Sub2_Sub11_Sub1) arg2;
		@Pc(40) Class1_Sub2_Sub11_Sub1 local40;
		if (local24 != null && local24.method3999(local21, local21)) {
			local40 = local24;
			local24.method3997();
		} else {
			local40 = new Class1_Sub2_Sub11_Sub1(this.aClass109_Sub1_24, local21, local21);
		}
		local40.method4000(0, local21, 0, local21);
		this.method3065(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	@Override
	public void method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jt", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt7662][super.anInt7664][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt7662][super.anInt7664][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub42[] local88 = this.aClass1_Sub42ArrayArrayArray1[arg0][arg1] = new Class1_Sub42[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass27_25.method553(local119); local125 != null; local125 = this.aClass27_25.method565()) {
				@Pc(130) Class1_Sub42 local130 = (Class1_Sub42) local125;
				if (local130.anInt7230 == arg8[local90] && local130.aFloat92 == (float) arg9[local90] && arg10 == local130.anInt7226 && local130.anInt7227 == arg11 && arg12 == local130.anInt7225) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub42(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass27_25.method564(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub42) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray67[arg0][arg1] = (byte) (this.aByteArrayArray67[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3685) {
			this.anInt3685 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!pe;[I)V")
	@Override
	public void method5979(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass266_31.method5998(new Class1_Sub33(this.aClass109_Sub1_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3067(arg4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!jt", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray101[arg0][arg1];
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!nu;I)V")
	private void method3065(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub11_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray5[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray3[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static161.anIntArray259.length) {
			Static452.anIntArray687 = new int[local22];
			Static161.anIntArray259 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static161.anIntArray259[local34] = (local12[local34] & 0xFF) >> this.aClass109_Sub1_24.anInt2976;
			Static452.anIntArray687[local34] = (local19[local34] & 0xFF) >> this.aClass109_Sub1_24.anInt2976;
		}
		@Pc(74) int local74 = 0;
		while (local22 > local74) {
			@Pc(80) int local80 = Static161.anIntArray259[local74];
			@Pc(85) int local85 = Static452.anIntArray687[local74++];
			@Pc(89) int local89 = Static161.anIntArray259[local74];
			@Pc(94) int local94 = Static452.anIntArray687[local74++];
			@Pc(98) int local98 = Static161.anIntArray259[local74];
			@Pc(103) int local103 = Static452.anIntArray687[local74++];
			if (-((local94 - local85) * (-local89 + local98)) + (local94 - local103) * (local80 - local89) > 0) {
				arg1.method3996(local98, local85, local94, local80, local89, local103);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray68[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray68[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZII[[ZIII)V")
	private void method3067(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(6) int arg4) {
		if (this.aClass1_Sub42Array1 == null) {
			return;
		}
		@Pc(13) float local13 = this.aClass109_Sub1_24.aFloat60;
		@Pc(17) float local17 = this.aClass109_Sub1_24.aFloat54;
		@Pc(23) int local23 = arg2 + arg2 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (local27 > Static431.anIntArray643.length) {
			Static431.anIntArray643 = new int[local27];
		}
		if (Static406.aClass1_Sub1_7.aByteArray66.length < this.anInt3684 * 2) {
			Static406.aClass1_Sub1_7 = new Class1_Sub1(this.anInt3684 * 2);
		}
		@Pc(63) int local63 = arg1 - arg2;
		@Pc(65) int local65 = local63;
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(77) int local77 = arg4 - arg2;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(90) int local90 = arg2 + arg1;
		if (super.anInt7662 - 1 < local90) {
			local90 = super.anInt7662 - 1;
		}
		@Pc(105) int local105 = arg2 + arg4;
		Static360.anInt6300 = 0;
		if (super.anInt7664 - 1 < local105) {
			local105 = super.anInt7664 - 1;
		}
		@Pc(131) int local131;
		for (@Pc(120) int local120 = local63; local120 <= local90; local120++) {
			@Pc(129) boolean[] local129 = arg3[local120 - local65];
			for (local131 = local77; local131 <= local105; local131++) {
				if (local129[local131 - local79]) {
					Static431.anIntArray643[Static360.anInt6300++] = local131 * super.anInt7662 + local120;
				}
			}
		}
		this.aClass109_Sub1_24.method2554();
		this.aClass109_Sub1_24.method2599((this.anInt3660 & 0x7) != 0);
		for (@Pc(207) int local207 = 0; local207 < this.aClass1_Sub42Array1.length; local207++) {
			this.aClass1_Sub42Array1[local207].method5596(Static431.anIntArray643, Static360.anInt6300);
		}
		if (!this.aClass266_31.method5996()) {
			local131 = this.aClass109_Sub1_24.anInt3008;
			@Pc(238) int local238 = this.aClass109_Sub1_24.anInt3005;
			this.aClass109_Sub1_24.V(0, local238, this.aClass109_Sub1_24.anInt2988);
			this.aClass109_Sub1_24.o(local17, local13 - 4.0F);
			this.aClass109_Sub1_24.method2599(false);
			this.aClass109_Sub1_24.method2597(false);
			this.aClass109_Sub1_24.method2522(128);
			this.aClass109_Sub1_24.method2532(-2);
			this.aClass109_Sub1_24.method2578(this.aClass109_Sub1_24.aClass13_Sub1_4);
			this.aClass109_Sub1_24.method2549(8448, 7681);
			this.aClass109_Sub1_24.method2528(34166, 770, 0);
			this.aClass109_Sub1_24.method2545(34167, 0);
			for (@Pc(307) Class1 local307 = this.aClass266_31.method6000(); local307 != null; local307 = this.aClass266_31.method5994()) {
				@Pc(312) Class1_Sub33 local312 = (Class1_Sub33) local307;
				local312.method4035(arg4, arg2, arg3, arg1);
			}
			this.aClass109_Sub1_24.method2528(5890, 768, 0);
			this.aClass109_Sub1_24.method2545(5890, 0);
			this.aClass109_Sub1_24.method2578(null);
			this.aClass109_Sub1_24.V(local131, local238, this.aClass109_Sub1_24.anInt2988);
		}
		if (this.aClass4_1 != null) {
			this.aClass109_Sub1_24.o(local17, local13 - 8.0F);
			this.aClass109_Sub1_24.method2554();
			this.aClass109_Sub1_24.method2605(this.aClass58_3, this.aClass58_5, null, null);
			this.aClass4_1.method163(arg2, arg1, arg3, arg0, arg4);
		}
		this.aClass109_Sub1_24.o(local17, local13);
	}

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.lb <= 0) {
			this.aClass4_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt7662 + 1][super.anInt7664 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt7662; local21++) {
				for (local25 = 1; super.anInt7664 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray68[local21 + 1][local25] >> 3) + (this.aByteArrayArray68[local21 - 1][local25] >> 2) + (this.aByteArrayArray68[local21][local25 + -1] >> 2) + (this.aByteArrayArray68[local21][local25 + 1] >> 3) + (this.aByteArrayArray68[local21][local25] >> 1));
				}
			}
			this.aClass1_Sub42Array1 = new Class1_Sub42[this.aClass27_25.method561()];
			this.aClass27_25.method558(this.aClass1_Sub42Array1);
			for (local25 = 0; local25 < this.aClass1_Sub42Array1.length; local25++) {
				this.aClass1_Sub42Array1[local25].method5593(this.lb);
			}
			@Pc(129) int local129 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local129 += 4;
			}
			if ((this.anInt3660 & 0x7) != 0) {
				local129 += 12;
			}
			@Pc(151) NativeBuffer local151 = this.aClass109_Sub1_24.aNativeHeap1.a(this.lb * local129);
			@Pc(156) NativeStream local156 = new NativeStream(local151);
			@Pc(160) Class1_Sub42[] local160 = new Class1_Sub42[this.lb];
			@Pc(168) Class27 local168 = new Class27(Static296.method2396(this.lb));
			@Pc(172) Class1_Sub42[] local172 = new Class1_Sub42[this.anInt3685];
			@Pc(178) int local178;
			for (@Pc(174) int local174 = 0; super.anInt7662 > local174; local174++) {
				for (local178 = 0; super.anInt7664 > local178; local178++) {
					if (this.anIntArrayArrayArray7[local174][local178] != null) {
						@Pc(194) Class1_Sub42[] local194 = this.aClass1_Sub42ArrayArrayArray1[local174][local178];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray5[local174][local178];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray3[local174][local178];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray2[local174][local178];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray7[local174][local178];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local174][local178];
						if (local215 == null) {
							local215 = local222;
						}
						@Pc(250) int[] local250 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local174][local178];
						@Pc(257) float local257 = this.aFloatArrayArray4[local174][local178];
						@Pc(264) float local264 = this.aFloatArrayArray5[local174][local178];
						@Pc(271) float local271 = this.aFloatArrayArray3[local174][local178];
						@Pc(280) float local280 = this.aFloatArrayArray4[local174][local178 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray5[local174][local178 + 1];
						@Pc(298) float local298 = this.aFloatArrayArray3[local174][local178 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray4[local174 + 1][local178 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray5[local174 + 1][local178 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray3[local174 + 1][local178 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray4[local174 + 1][local178];
						@Pc(349) float local349 = this.aFloatArrayArray5[local174 + 1][local178];
						@Pc(358) float local358 = this.aFloatArrayArray3[local174 + 1][local178];
						@Pc(366) int local366 = local19[local174][local178] & 0xFF;
						@Pc(376) int local376 = local19[local174][local178 + 1] & 0xFF;
						@Pc(388) int local388 = local19[local174 + 1][local178 + 1] & 0xFF;
						@Pc(398) int local398 = local19[local174 + 1][local178] & 0xFF;
						@Pc(400) int local400 = 0;
						@Pc(410) int local410;
						label331: for (@Pc(402) int local402 = 0; local402 < local222.length; local402++) {
							@Pc(408) Class1_Sub42 local408 = local194[local402];
							for (local410 = 0; local410 < local400; local410++) {
								if (local408 == local172[local410]) {
									continue label331;
								}
							}
							local172[local400++] = local408;
						}
						@Pc(451) short[] local451 = this.aShortArrayArray5[local174 + super.anInt7662 * local178] = new short[local222.length];
						for (local410 = 0; local410 < local222.length; local410++) {
							@Pc(465) int local465 = (local174 << super.anInt7660) + local201[local410];
							@Pc(475) int local475 = (local178 << super.anInt7660) + local208[local410];
							@Pc(480) int local480 = local465 >> this.anInt3671;
							@Pc(485) int local485 = local475 >> this.anInt3671;
							@Pc(489) int local489 = local222[local410];
							@Pc(493) int local493 = local215[local410];
							@Pc(501) int local501 = local234 == null ? 0 : local234[local410];
							@Pc(519) long local519 = (long) local485 | (long) local489 << 32 | (long) local493 << 48 | (long) (local480 << 16);
							@Pc(523) int local523 = local201[local410];
							@Pc(527) int local527 = local208[local410];
							@Pc(529) byte local529 = 74;
							@Pc(531) int local531 = 0;
							@Pc(533) float local533 = 1.0F;
							@Pc(553) float local553;
							@Pc(545) float local545;
							@Pc(551) float local551;
							@Pc(623) float local623;
							@Pc(549) int local549;
							if (local523 == 0 && local527 == 0) {
								local549 = local529 - local366;
								local553 = local257;
								local545 = local264;
								local551 = local271;
							} else if (local523 == 0 && super.anInt7661 == local527) {
								local545 = local289;
								local549 = local529 - local376;
								local551 = local298;
								local553 = local280;
							} else if (super.anInt7661 == local523 && super.anInt7661 == local527) {
								local553 = local309;
								local551 = local331;
								local545 = local320;
								local549 = local529 - local388;
							} else if (local523 == super.anInt7661 && local527 == 0) {
								local545 = local349;
								local549 = local529 - local398;
								local551 = local358;
								local553 = local340;
							} else {
								@Pc(599) float local599 = (float) local523 / (float) super.anInt7661;
								@Pc(606) float local606 = (float) local527 / (float) super.anInt7661;
								@Pc(614) float local614 = (local340 - local257) * local599 + local257;
								local623 = local264 + (local349 - local264) * local599;
								@Pc(632) float local632 = local271 + (local358 - local271) * local599;
								@Pc(640) float local640 = local280 + local599 * (local309 - local280);
								@Pc(649) float local649 = (local320 - local289) * local599 + local289;
								local545 = (local649 - local623) * local606 + local623;
								local553 = local606 * (local640 - local614) + local614;
								@Pc(674) float local674 = (local331 - local298) * local599 + local298;
								local551 = (local674 - local632) * local606 + local632;
								@Pc(694) int local694 = ((local398 - local366) * local523 >> super.anInt7660) + local366;
								@Pc(707) int local707 = local376 + (local523 * (local388 - local376) >> super.anInt7660);
								local549 = local529 - ((local707 - local694) * local527 >> super.anInt7660) - local694;
							}
							if (local489 != -1) {
								@Pc(757) int local757 = (local489 & 0x7F) * local549 >> 7;
								if (local757 < 2) {
									local757 = 2;
								} else if (local757 > 126) {
									local757 = 126;
								}
								local531 = Static389.anIntArray561[local757 | local489 & 0xFF80];
								if ((this.anInt3660 & 0x7) == 0) {
									local533 = this.aClass109_Sub1_24.aFloatArray21[0] * local553 + this.aClass109_Sub1_24.aFloatArray21[1] * local545 + local551 * this.aClass109_Sub1_24.aFloatArray21[2];
									local533 = local533 * (local533 > 0.0F ? this.aClass109_Sub1_24.aFloat43 : this.aClass109_Sub1_24.aFloat50) + this.aClass109_Sub1_24.aFloat56;
								}
							}
							@Pc(831) Class1 local831 = null;
							if ((this.anInt3662 - 1 & local465) == 0 && (this.anInt3662 - 1 & local475) == 0) {
								local831 = local168.method553(local519);
							}
							@Pc(864) int local864;
							@Pc(894) int local894;
							if (local831 == null) {
								if (local493 == local489) {
									local894 = local531;
								} else {
									@Pc(904) int local904 = local549 * (local493 & 0x7F) >> 7;
									if (local904 < 2) {
										local904 = 2;
									} else if (local904 > 126) {
										local904 = 126;
									}
									local894 = Static389.anIntArray561[local904 | local493 & 0xFF80];
									if ((this.anInt3660 & 0x7) == 0) {
										local623 = this.aClass109_Sub1_24.aFloatArray21[2] * local551 + local545 * this.aClass109_Sub1_24.aFloatArray21[1] + local553 * this.aClass109_Sub1_24.aFloatArray21[0];
										local623 = local533 * (local533 > 0.0F ? this.aClass109_Sub1_24.aFloat43 : this.aClass109_Sub1_24.aFloat50) + this.aClass109_Sub1_24.aFloat56;
										@Pc(982) int local982 = local894 >> 16 & 0xFF;
										@Pc(988) int local988 = local894 >> 8 & 0xFF;
										@Pc(992) int local992 = local894 & 0xFF;
										local982 = (int) ((float) local982 * local623);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local988 = (int) ((float) local988 * local623);
										local992 = (int) ((float) local992 * local623);
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										if (local992 < 0) {
											local992 = 0;
										} else if (local992 > 255) {
											local992 = 255;
										}
										local894 = local982 << 16 | local988 << 8 | local992;
									}
								}
								if (this.aClass109_Sub1_24.aBoolean163) {
									local156.b((float) local465);
									local156.b((float) (local501 + this.va(local465, local475)));
									local156.b((float) local475);
									local156.a((byte) (local894 >> 16));
									local156.a((byte) (local894 >> 8));
									local156.a((byte) local894);
									local156.a(-1);
									local156.b((float) local465);
									local156.b((float) local475);
									if (this.anIntArrayArrayArray6 != null) {
										local156.b((float) (local250 == null ? 0 : local250[local410] - 1));
									}
									if ((this.anInt3660 & 0x7) != 0) {
										local156.b(local553);
										local156.b(local545);
										local156.b(local551);
									}
								} else {
									local156.a((float) local465);
									local156.a((float) (local501 + this.va(local465, local475)));
									local156.a((float) local475);
									local156.a((byte) (local894 >> 16));
									local156.a((byte) (local894 >> 8));
									local156.a((byte) local894);
									local156.a(-1);
									local156.a((float) local465);
									local156.a((float) local475);
									if (this.anIntArrayArrayArray6 != null) {
										local156.a((float) (local250 == null ? 0 : local250[local410] - 1));
									}
									if ((this.anInt3660 & 0x7) != 0) {
										local156.a(local553);
										local156.a(local545);
										local156.a(local551);
									}
								}
								local864 = this.anInt3682++;
								local451[local410] = (short) local864;
								if (local489 != -1) {
									local160[local864] = local194[local410];
								}
								local168.method564(local519, new Class1_Sub40(local451[local410]));
							} else {
								local451[local410] = ((Class1_Sub40) local831).aShort76;
								local864 = local451[local410] & 0xFFFF;
								if (local489 != -1 && local160[local864].aLong227 > local194[local410].aLong227) {
									local160[local864] = local194[local410];
								}
							}
							for (local894 = 0; local894 < local400; local894++) {
								local172[local894].method5598(local533, local864, local549, local531);
							}
							this.anInt3684++;
						}
					}
				}
			}
			for (local178 = 0; local178 < this.anInt3682; local178++) {
				@Pc(1300) Class1_Sub42 local1300 = local160[local178];
				if (local1300 != null) {
					local1300.method5594(local178);
				}
			}
			@Pc(1337) int local1337;
			for (@Pc(1317) int local1317 = 0; super.anInt7662 > local1317; local1317++) {
				for (@Pc(1321) int local1321 = 0; super.anInt7664 > local1321; local1321++) {
					@Pc(1333) short[] local1333 = this.aShortArrayArray5[super.anInt7662 * local1321 + local1317];
					if (local1333 != null) {
						local1337 = 0;
						@Pc(1339) int local1339 = 0;
						while (local1339 < local1333.length) {
							@Pc(1348) int local1348 = local1333[local1339++] & 0xFFFF;
							@Pc(1355) int local1355 = local1333[local1339++] & 0xFFFF;
							@Pc(1362) int local1362 = local1333[local1339++] & 0xFFFF;
							@Pc(1366) Class1_Sub42 local1366 = local160[local1348];
							@Pc(1370) Class1_Sub42 local1370 = local160[local1355];
							@Pc(1374) Class1_Sub42 local1374 = local160[local1362];
							@Pc(1376) Class1_Sub42 local1376 = null;
							if (local1366 != null) {
								local1366.method5600(local1317, local1321, local1337);
								local1376 = local1366;
							}
							if (local1370 != null) {
								local1370.method5600(local1317, local1321, local1337);
								if (local1376 == null || local1370.aLong227 < local1376.aLong227) {
									local1376 = local1370;
								}
							}
							if (local1374 != null) {
								local1374.method5600(local1317, local1321, local1337);
								if (local1376 == null || local1376.aLong227 > local1374.aLong227) {
									local1376 = local1374;
								}
							}
							if (local1376 != null) {
								if (local1366 != null) {
									local1376.method5594(local1348);
								}
								if (local1370 != null) {
									local1376.method5594(local1355);
								}
								if (local1374 != null) {
									local1376.method5594(local1362);
								}
								local1376.method5600(local1317, local1321, local1337);
							}
							local1337++;
						}
					}
				}
			}
			local156.c();
			this.anInterface1_4 = this.aClass109_Sub1_24.method2534(local129, local151, local156.a());
			this.aClass58_5 = new Class58(this.aClass109_Sub1_24, this.anInterface1_4, 5126, 3, 0);
			this.aClass58_6 = new Class58(this.aClass109_Sub1_24, this.anInterface1_4, 5121, 4, 12);
			@Pc(1509) byte local1509;
			if (this.anIntArrayArrayArray6 == null) {
				local1509 = 24;
				this.aClass58_3 = new Class58(this.aClass109_Sub1_24, this.anInterface1_4, 5126, 2, 16);
			} else {
				this.aClass58_3 = new Class58(this.aClass109_Sub1_24, this.anInterface1_4, 5126, 3, 16);
				local1509 = 28;
			}
			if ((this.anInt3660 & 0x7) != 0) {
				this.aClass58_4 = new Class58(this.aClass109_Sub1_24, this.anInterface1_4, 5126, 3, local1509);
			}
			@Pc(1562) long[] local1562 = new long[this.aClass1_Sub42Array1.length];
			for (local1337 = 0; local1337 < this.aClass1_Sub42Array1.length; local1337++) {
				@Pc(1571) Class1_Sub42 local1571 = this.aClass1_Sub42Array1[local1337];
				local1562[local1337] = local1571.aLong227;
				local1571.method5601(this.anInt3682);
			}
			Static438.method5870(local1562, this.aClass1_Sub42Array1);
			if (this.aClass4_1 != null) {
				this.aClass4_1.method159();
			}
		}
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass1_Sub42ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray2 = null;
		this.aByteArrayArray68 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass27_25 = null;
	}

	@OriginalMember(owner = "client!jt", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass4_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass109_Sub1_24.anInt3002 * arg2 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass109_Sub1_24.anInt2997 >> 8) >> this.aClass109_Sub1_24.anInt2976;
			this.aClass4_1.method165(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!jt", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7660;
		@Pc(13) int local13 = arg1 >> super.anInt7660;
		if (local8 < 0 || local13 < 0 || super.anInt7662 - 1 < local8 || super.anInt7664 - 1 < local13) {
			return 0;
		}
		@Pc(48) int local48 = super.anInt7661 - 1 & arg0;
		@Pc(55) int local55 = arg1 & super.anInt7661 - 1;
		@Pc(82) int local82 = local48 * this.anIntArrayArray101[local8 + 1][local13] + (super.anInt7661 - local48) * this.anIntArrayArray101[local8][local13] >> super.anInt7660;
		@Pc(113) int local113 = (super.anInt7661 - local48) * this.anIntArrayArray101[local8][local13 + 1] + this.anIntArrayArray101[local8 + 1][local13 + 1] * local48 >> super.anInt7660;
		return local82 * (super.anInt7661 - local55) + local55 * local113 >> super.anInt7660;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5976(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		this.aClass109_Sub1_24.method2570();
		this.aClass109_Sub1_24.method2561(false);
		this.aClass109_Sub1_24.method2599(false);
		this.aClass109_Sub1_24.method2577(false);
		this.aClass109_Sub1_24.method2597(false);
		this.aClass109_Sub1_24.method2522(0);
		this.aClass109_Sub1_24.method2532(-2);
		this.aClass109_Sub1_24.method2578(null);
		Static302.aFloatArray29[9] = 0.0F;
		Static302.aFloatArray29[6] = 0.0F;
		Static302.aFloatArray29[4] = 0.0F;
		Static302.aFloatArray29[10] = 0.0F;
		Static302.aFloatArray29[2] = 0.0F;
		Static302.aFloatArray29[7] = 0.0F;
		Static302.aFloatArray29[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass109_Sub1_24.anInt2856) - 1.0F;
		Static302.aFloatArray29[1] = 0.0F;
		Static302.aFloatArray29[14] = 0.0F;
		Static302.aFloatArray29[8] = 0.0F;
		Static302.aFloatArray29[3] = 0.0F;
		Static302.aFloatArray29[11] = 0.0F;
		Static302.aFloatArray29[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass109_Sub1_24.anInt2808;
		Static302.aFloatArray29[5] = (float) 1024 / ((float) this.aClass109_Sub1_24.anInt2808 * (float) super.anInt7661 * 128.0F);
		Static302.aFloatArray29[0] = (float) 1024 / ((float) super.anInt7661 * 128.0F * (float) this.aClass109_Sub1_24.anInt2856);
		Static302.aFloatArray29[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static302.aFloatArray29, 0);
		Static302.aFloatArray29[1] = 0.0F;
		Static302.aFloatArray29[6] = 1.0F;
		Static302.aFloatArray29[7] = 0.0F;
		Static302.aFloatArray29[9] = 1.0F;
		Static302.aFloatArray29[15] = 1.0F;
		Static302.aFloatArray29[13] = 0.0F;
		Static302.aFloatArray29[12] = 0.0F;
		Static302.aFloatArray29[4] = 0.0F;
		Static302.aFloatArray29[14] = 0.0F;
		Static302.aFloatArray29[3] = 0.0F;
		Static302.aFloatArray29[11] = 0.0F;
		Static302.aFloatArray29[5] = 0.0F;
		Static302.aFloatArray29[10] = 0.0F;
		Static302.aFloatArray29[8] = 0.0F;
		Static302.aFloatArray29[0] = 1.0F;
		Static302.aFloatArray29[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static302.aFloatArray29, 0);
		if ((this.anInt3660 & 0x7) == 0) {
			this.aClass109_Sub1_24.method2599(false);
		} else {
			this.aClass109_Sub1_24.method2599(true);
			this.aClass109_Sub1_24.method2603();
		}
		this.aClass109_Sub1_24.method2605(this.aClass58_3, this.aClass58_5, this.aClass58_6, this.aClass58_4);
		if (Static406.aClass1_Sub1_7.aByteArray66.length >= this.anInt3684 * 2) {
			Static406.aClass1_Sub1_7.anInt5056 = 0;
		} else {
			Static406.aClass1_Sub1_7 = new Class1_Sub1(this.anInt3684 * 2);
		}
		@Pc(306) int local306 = 0;
		@Pc(312) int local312;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(342) short[] local342;
		@Pc(346) int local346;
		if (this.aClass109_Sub1_24.aBoolean163) {
			for (local312 = arg1; local312 < arg3; local312++) {
				local321 = arg0 + super.anInt7662 * local312;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local312 - arg1]) {
						local342 = this.aShortArrayArray5[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								Static406.aClass1_Sub1_7.method4101(local342[local346] & 0xFFFF);
								local306++;
							}
						}
					}
					local321++;
				}
			}
		} else {
			for (local312 = arg1; local312 < arg3; local312++) {
				local321 = super.anInt7662 * local312 + arg0;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local312 - arg1]) {
						local342 = this.aShortArrayArray5[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								local306++;
								Static406.aClass1_Sub1_7.method4146(local342[local346] & 0xFFFF);
							}
						}
					}
					local321++;
				}
			}
		}
		if (local306 > 0) {
			@Pc(468) Class59_Sub2 local468 = new Class59_Sub2(this.aClass109_Sub1_24, 5123, Static406.aClass1_Sub1_7.aByteArray66, Static406.aClass1_Sub1_7.anInt5056);
			this.aClass109_Sub1_24.method2586(0, local306, local468);
		}
	}
}
