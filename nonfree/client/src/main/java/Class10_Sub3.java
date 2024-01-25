import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	private int anInt7429;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
	private int anInt7431;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!maa;")
	public Class188 aClass188_11;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!maa;")
	private Class188 aClass188_12;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "[Lclient!hr;")
	private Class1_Sub21[] aClass1_Sub21Array1;

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_5;

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lclient!maa;")
	public Class188 aClass188_13;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lclient!maa;")
	public Class188 aClass188_14;

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
	private int anInt7436;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
	private int anInt7437;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!bu;")
	private final Class38 aClass38_56 = new Class38();

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!te;")
	public final Class9_Sub3 aClass9_Sub3_37;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[[I")
	private final int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	private final int anInt7420;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[[[Lclient!hr;")
	private Class1_Sub21[][][] aClass1_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
	private final int anInt7430;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[[S")
	public final short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	public final int anInt7418;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "Lclient!lb;")
	private Class174 aClass174_29;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!ku;")
	private Class170 aClass170_2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!te;IIII[[I[[II)V")
	public Class10_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass9_Sub3_37 = arg0;
		this.anIntArrayArray73 = arg5;
		this.anInt7420 = super.anInt7411 - 2;
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray29 = new byte[arg3][arg4];
		this.aClass1_Sub21ArrayArrayArray1 = new Class1_Sub21[arg3][arg4][];
		this.anInt7430 = 0x1 << this.anInt7420;
		this.aByteArrayArray30 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray11 = new short[arg4 * arg3][];
		this.aFloatArrayArray13 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.anInt7418 = arg2;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt7412 + 1][super.anInt7409 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt7409 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt7412; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local140 * local140)));
				this.aFloatArrayArray14[local121][local117] = (float) local140 * local175;
				this.aFloatArrayArray13[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray15[local121][local117] = local175 * (float) local156;
			}
		}
		this.aClass174_29 = new Class174(128);
		if ((this.anInt7418 & 0x10) != 0) {
			this.aClass170_2 = new Class170(this.aClass9_Sub3_37, this);
		}
	}

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub4 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray29[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7410 >> this.aClass9_Sub3_37.anInt7874;
		@Pc(24) Class1_Sub1_Sub4_Sub2 local24 = (Class1_Sub1_Sub4_Sub2) arg2;
		@Pc(40) Class1_Sub1_Sub4_Sub2 local40;
		if (local24 != null && local24.method2715(local21, local21)) {
			local40 = local24;
			local24.method2713();
		} else {
			local40 = new Class1_Sub1_Sub4_Sub2(this.aClass9_Sub3_37, local21, local21);
		}
		local40.method2716(0, 0, local21, local21);
		this.method6342(arg0, local40, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIZI[[ZI)V")
	private void method6338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) int arg4) {
		if (this.aClass1_Sub21Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass9_Sub3_37.aFloat162;
		@Pc(12) float local12 = this.aClass9_Sub3_37.aFloat163;
		@Pc(18) int local18 = arg0 + arg0 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (this.aClass9_Sub3_37.anIntArray618.length < local22) {
			this.aClass9_Sub3_37.anIntArray618 = new int[local22];
		}
		if (this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3.aByteArray45.length < this.anInt7431 * 2) {
			this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(this.anInt7431 * 2);
		}
		@Pc(58) int local58 = arg4 - arg0;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(72) int local72 = arg1 - arg0;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(85) int local85 = arg4 + arg0;
		if (local85 > super.anInt7412 - 1) {
			local85 = super.anInt7412 - 1;
		}
		@Pc(104) int local104 = arg0 + arg1;
		if (local104 > super.anInt7409 - 1) {
			local104 = super.anInt7409 - 1;
		}
		@Pc(121) int local121 = 0;
		@Pc(125) int[] local125 = this.aClass9_Sub3_37.anIntArray618;
		@Pc(138) int local138;
		for (@Pc(127) int local127 = local58; local127 <= local85; local127++) {
			@Pc(136) boolean[] local136 = arg3[local127 - local60];
			for (local138 = local72; local138 <= local104; local138++) {
				if (local136[local138 - local74]) {
					local125[local121++] = super.anInt7412 * local138 + local127;
				}
			}
		}
		this.aClass9_Sub3_37.method6679();
		this.aClass9_Sub3_37.method6733((this.anInt7418 & 0x7) != 0);
		for (@Pc(199) int local199 = 0; local199 < this.aClass1_Sub21Array1.length; local199++) {
			this.aClass1_Sub21Array1[local199].method3550(local121, local125);
		}
		if (!this.aClass38_56.method1414()) {
			local138 = this.aClass9_Sub3_37.anInt7908;
			@Pc(232) int local232 = this.aClass9_Sub3_37.anInt7887;
			this.aClass9_Sub3_37.E(0, local232, this.aClass9_Sub3_37.anInt7886);
			this.aClass9_Sub3_37.la(local12, local8 - 4.0F);
			this.aClass9_Sub3_37.method6733(false);
			this.aClass9_Sub3_37.method6691(false);
			this.aClass9_Sub3_37.method6654(128);
			this.aClass9_Sub3_37.method6672(-2);
			this.aClass9_Sub3_37.method6701(this.aClass9_Sub3_37.aClass20_Sub3_5);
			this.aClass9_Sub3_37.method6732(8448, 7681);
			this.aClass9_Sub3_37.method6706(34166, 0, 770);
			this.aClass9_Sub3_37.method6656(34167, 0);
			for (@Pc(299) Class1 local299 = this.aClass38_56.method1419(); local299 != null; local299 = this.aClass38_56.method1415()) {
				@Pc(304) Class1_Sub34 local304 = (Class1_Sub34) local299;
				local304.method5635(arg0, arg3, arg1, arg4);
			}
			this.aClass9_Sub3_37.method6706(5890, 0, 768);
			this.aClass9_Sub3_37.method6656(5890, 0);
			this.aClass9_Sub3_37.method6701(null);
			this.aClass9_Sub3_37.E(local138, local232, this.aClass9_Sub3_37.anInt7886);
		}
		if (this.aClass170_2 != null) {
			this.aClass9_Sub3_37.la(local12, local8 - 8.0F);
			this.aClass9_Sub3_37.method6679();
			this.aClass9_Sub3_37.method6713(this.aClass188_13, this.aClass188_11, null, null);
			this.aClass170_2.method4383(arg3, arg4, arg1, arg0, arg2);
		}
		this.aClass9_Sub3_37.la(local12, local8);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nm;[I)V")
	@Override
	public void method6335(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass38_56.method1426(new Class1_Sub34(this.aClass9_Sub3_37, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6336(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass170_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass9_Sub3_37.anInt7915 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass9_Sub3_37.anInt7912 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			return this.aClass170_2.method4384(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6337(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7436 <= 0) {
			return;
		}
		this.aClass9_Sub3_37.method6690();
		this.aClass9_Sub3_37.method6655(false);
		this.aClass9_Sub3_37.method6733(false);
		this.aClass9_Sub3_37.method6705(false);
		this.aClass9_Sub3_37.method6691(false);
		this.aClass9_Sub3_37.method6654(0);
		this.aClass9_Sub3_37.method6672(-2);
		this.aClass9_Sub3_37.method6701(null);
		Static493.aFloatArray69[0] = (float) 1024 / ((float) super.anInt7410 * 128.0F * (float) this.aClass9_Sub3_37.anInt7756);
		Static493.aFloatArray69[10] = 0.0F;
		Static493.aFloatArray69[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass9_Sub3_37.anInt7756) - 1.0F;
		Static493.aFloatArray69[15] = 1.0F;
		Static493.aFloatArray69[2] = 0.0F;
		Static493.aFloatArray69[9] = 0.0F;
		Static493.aFloatArray69[4] = 0.0F;
		Static493.aFloatArray69[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass9_Sub3_37.anInt7712;
		Static493.aFloatArray69[11] = 0.0F;
		Static493.aFloatArray69[6] = 0.0F;
		Static493.aFloatArray69[14] = 0.0F;
		Static493.aFloatArray69[3] = 0.0F;
		Static493.aFloatArray69[1] = 0.0F;
		Static493.aFloatArray69[7] = 0.0F;
		Static493.aFloatArray69[5] = (float) 1024 / ((float) super.anInt7410 * 128.0F * (float) this.aClass9_Sub3_37.anInt7712);
		Static493.aFloatArray69[8] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static493.aFloatArray69, 0);
		Static493.aFloatArray69[6] = 1.0F;
		Static493.aFloatArray69[5] = 0.0F;
		Static493.aFloatArray69[0] = 1.0F;
		Static493.aFloatArray69[12] = 0.0F;
		Static493.aFloatArray69[10] = 0.0F;
		Static493.aFloatArray69[8] = 0.0F;
		Static493.aFloatArray69[9] = 1.0F;
		Static493.aFloatArray69[2] = 0.0F;
		Static493.aFloatArray69[15] = 1.0F;
		Static493.aFloatArray69[1] = 0.0F;
		Static493.aFloatArray69[3] = 0.0F;
		Static493.aFloatArray69[14] = 0.0F;
		Static493.aFloatArray69[4] = 0.0F;
		Static493.aFloatArray69[13] = 0.0F;
		Static493.aFloatArray69[11] = 0.0F;
		Static493.aFloatArray69[7] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static493.aFloatArray69, 0);
		if ((this.anInt7418 & 0x7) == 0) {
			this.aClass9_Sub3_37.method6733(false);
		} else {
			this.aClass9_Sub3_37.method6733(true);
			this.aClass9_Sub3_37.method6731();
		}
		this.aClass9_Sub3_37.method6713(this.aClass188_13, this.aClass188_11, this.aClass188_14, this.aClass188_12);
		if (this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3.aByteArray45.length >= this.anInt7431 * 2) {
			this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3.anInt3400 = 0;
		} else {
			this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(this.anInt7431 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class1_Sub13_Sub1 local317 = this.aClass9_Sub3_37.aClass1_Sub13_Sub1_3;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass9_Sub3_37.aBoolean523) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = local323 * super.anInt7412 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray11[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local313++;
								local317.method3038(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = local323 * super.anInt7412 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray11[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local317.method3068(local354[local358] & 0xFFFF);
								local313++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(470) Class92_Sub2 local470 = new Class92_Sub2(this.aClass9_Sub3_37, 5123, local317.aByteArray45, local317.anInt3400);
			this.aClass9_Sub3_37.method6719(0, local313, local470);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	@Override
	public void method6333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6338(arg2, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt7412][super.anInt7409][];
		}
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt7412][super.anInt7409][];
		}
		this.anIntArrayArrayArray19[arg0][arg1] = arg2;
		this.anIntArrayArrayArray16[arg0][arg1] = arg4;
		this.anIntArrayArrayArray17[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub21[] local88 = this.aClass1_Sub21ArrayArrayArray1[arg0][arg1] = new Class1_Sub21[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class1 local125;
			for (local125 = this.aClass174_29.method4422(local119); local125 != null; local125 = this.aClass174_29.method4424()) {
				@Pc(130) Class1_Sub21 local130 = (Class1_Sub21) local125;
				if (arg8[local90] == local130.anInt3992 && (float) arg9[local90] == local130.aFloat88 && arg10 == local130.anInt3995 && local130.anInt3998 == arg11 && arg12 == local130.anInt3990) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub21(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass174_29.method4420(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub21) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray29[arg0][arg1] = (byte) (this.aByteArrayArray29[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt7437) {
			this.anInt7437 = arg6.length;
		}
		this.anInt7436 += arg6.length;
	}

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray30[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray30[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!fa;II)V")
	private void method6342(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray19[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray16[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass9_Sub3_37.anIntArray617.length < local22) {
			this.aClass9_Sub3_37.anIntArray617 = new int[local22];
			this.aClass9_Sub3_37.anIntArray619 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass9_Sub3_37.anIntArray617;
		@Pc(46) int[] local46 = this.aClass9_Sub3_37.anIntArray619;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass9_Sub3_37.anInt7874;
			local46[local48] = local19[local48] >> this.aClass9_Sub3_37.anInt7874;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(90) int local90 = local42[local84];
			@Pc(95) int local95 = local46[local84++];
			@Pc(99) int local99 = local42[local84];
			@Pc(104) int local104 = local46[local84++];
			@Pc(108) int local108 = local42[local84];
			@Pc(113) int local113 = local46[local84++];
			if (-((local108 - local99) * (-local95 + local104)) + (local104 - local113) * (local90 - local99) > 0) {
				arg1.method2712(local113, local104, local108, local90, local99, local95);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt7436 <= 0) {
			this.aClass170_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt7412 + 1][super.anInt7409 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; super.anInt7412 > local24; local24++) {
				for (local28 = 1; super.anInt7409 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray30[local24][local28] >> 1) + (this.aByteArrayArray30[local24 + 1][local28] >> 3) + (this.aByteArrayArray30[local24 - 1][local28] >> 2) + (this.aByteArrayArray30[local24][local28 - 1] >> 2) + (this.aByteArrayArray30[local24][local28 + 1] >> 3));
				}
			}
			this.aClass1_Sub21Array1 = new Class1_Sub21[this.aClass174_29.method4426()];
			this.aClass174_29.method4427(this.aClass1_Sub21Array1);
			for (local28 = 0; local28 < this.aClass1_Sub21Array1.length; local28++) {
				this.aClass1_Sub21Array1[local28].method3552(this.anInt7436);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local136 += 4;
			}
			if ((this.anInt7418 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass9_Sub3_37.aNativeHeap5.a(this.anInt7436 * local136, false);
			@Pc(164) Stream local164 = new Stream(local159);
			@Pc(168) Class1_Sub21[] local168 = new Class1_Sub21[this.anInt7436];
			@Pc(175) int local175 = Static216.method3865(this.anInt7436 / 4);
			if (local175 < 1) {
				local175 = 1;
			}
			@Pc(185) Class174 local185 = new Class174(local175);
			@Pc(189) Class1_Sub21[] local189 = new Class1_Sub21[this.anInt7437];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; super.anInt7412 > local191; local191++) {
				for (local195 = 0; super.anInt7409 > local195; local195++) {
					if (this.anIntArrayArrayArray17[local191][local195] != null) {
						@Pc(211) Class1_Sub21[] local211 = this.aClass1_Sub21ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray19[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray16[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray15[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray17[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local191][local195];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(274) float local274 = this.aFloatArrayArray14[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray13[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray15[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray14[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray13[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray15[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray14[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray13[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray15[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray14[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray13[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray15[local191 + 1][local195];
						@Pc(383) int local383 = local22[local191][local195] & 0xFF;
						@Pc(393) int local393 = local22[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local22[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local22[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label337: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class1_Sub21 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local425 == local189[local427]) {
									continue label337;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray11[local191 + super.anInt7412 * local195] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(482) int local482 = (local191 << super.anInt7411) + local218[local427];
							@Pc(491) int local491 = (local195 << super.anInt7411) + local225[local427];
							@Pc(496) int local496 = local482 >> this.anInt7420;
							@Pc(501) int local501 = local491 >> this.anInt7420;
							@Pc(505) int local505 = local239[local427];
							@Pc(509) int local509 = local232[local427];
							@Pc(517) int local517 = local251 == null ? 0 : local251[local427];
							@Pc(535) long local535 = (long) local501 | (long) (local496 << 16) | (long) local505 << 32 | (long) local509 << 48;
							@Pc(539) int local539 = local218[local427];
							@Pc(543) int local543 = local225[local427];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(559) float local559;
							@Pc(563) float local563;
							@Pc(561) float local561;
							@Pc(671) float local671;
							@Pc(567) int local567;
							if (local539 == 0 && local543 == 0) {
								local559 = local274;
								local561 = local288;
								local563 = local281;
								local567 = local545 - local383;
							} else if (local539 == 0 && super.anInt7410 == local543) {
								local567 = local545 - local393;
								local559 = local297;
								local563 = local306;
								local561 = local315;
							} else if (super.anInt7410 == local539 && local543 == super.anInt7410) {
								local561 = local348;
								local567 = local545 - local405;
								local563 = local337;
								local559 = local326;
							} else if (local539 == super.anInt7410 && local543 == 0) {
								local559 = local357;
								local567 = local545 - local415;
								local561 = local375;
								local563 = local366;
							} else {
								@Pc(646) float local646 = (float) local539 / (float) super.anInt7410;
								@Pc(653) float local653 = (float) local543 / (float) super.anInt7410;
								@Pc(662) float local662 = local274 + local646 * (local357 - local274);
								local671 = (local366 - local281) * local646 + local281;
								@Pc(679) float local679 = local288 + local646 * (local375 - local288);
								@Pc(688) float local688 = local297 + local646 * (local326 - local297);
								@Pc(697) float local697 = local306 + local646 * (local337 - local306);
								@Pc(705) float local705 = local646 * (local348 - local315) + local315;
								local559 = local662 + local653 * (local688 - local662);
								local563 = local671 + (local697 - local671) * local653;
								local561 = local679 + (local705 - local679) * local653;
								@Pc(742) int local742 = ((local415 - local383) * local539 >> super.anInt7411) + local383;
								@Pc(754) int local754 = local393 + (local539 * (local405 - local393) >> super.anInt7411);
								local567 = local545 - local742 - ((local754 - local742) * local543 >> super.anInt7411);
							}
							@Pc(770) float local770 = 1.0F;
							if (local505 != -1) {
								@Pc(782) int local782 = local567 * (local505 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								if ((this.anInt7418 & 0x7) == 0) {
									local770 = this.aClass9_Sub3_37.aFloatArray65[1] * local563 + local559 * this.aClass9_Sub3_37.aFloatArray65[0] + local561 * this.aClass9_Sub3_37.aFloatArray65[2];
									local770 = this.aClass9_Sub3_37.aFloat157 + (local770 > 0.0F ? this.aClass9_Sub3_37.aFloat170 : this.aClass9_Sub3_37.aFloat174) * local770;
								}
								local547 = Static392.anIntArray516[local505 & 0xFF80 | local782];
							}
							@Pc(851) Class1 local851 = null;
							if ((local482 & this.anInt7430 - 1) == 0 && (this.anInt7430 - 1 & local491) == 0) {
								local851 = local185.method4422(local535);
							}
							@Pc(1210) int local1210;
							@Pc(911) int local911;
							if (local851 == null) {
								if (local505 == local509) {
									local911 = local547;
								} else {
									@Pc(889) int local889 = local567 * (local509 & 0x7F) >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local911 = Static392.anIntArray516[local509 & 0xFF80 | local889];
									if ((this.anInt7418 & 0x7) == 0) {
										local671 = local563 * this.aClass9_Sub3_37.aFloatArray65[1] + this.aClass9_Sub3_37.aFloatArray65[0] * local559 + local561 * this.aClass9_Sub3_37.aFloatArray65[2];
										local671 = local770 * (local770 > 0.0F ? this.aClass9_Sub3_37.aFloat170 : this.aClass9_Sub3_37.aFloat174) + this.aClass9_Sub3_37.aFloat157;
										@Pc(964) int local964 = local911 >> 16 & 0xFF;
										@Pc(970) int local970 = local911 >> 8 & 0xFF;
										local964 = (int) ((float) local964 * local671);
										@Pc(980) int local980 = local911 & 0xFF;
										local970 = (int) ((float) local970 * local671);
										if (local964 < 0) {
											local964 = 0;
										} else if (local964 > 255) {
											local964 = 255;
										}
										local980 = (int) ((float) local980 * local671);
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										if (local980 < 0) {
											local980 = 0;
										} else if (local980 > 255) {
											local980 = 255;
										}
										local911 = local980 | local964 << 16 | local970 << 8;
									}
								}
								if (this.aClass9_Sub3_37.aBoolean523) {
									local164.a((float) local482);
									local164.a((float) (local517 + this.aa(local482, local491)));
									local164.a((float) local491);
									local164.b((byte) (local911 >> 16));
									local164.b((byte) (local911 >> 8));
									local164.b((byte) local911);
									local164.b(-1);
									local164.a((float) local482);
									local164.a((float) local491);
									if (this.anIntArrayArrayArray14 != null) {
										local164.a((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt7418 & 0x7) != 0) {
										local164.a(local559);
										local164.a(local563);
										local164.a(local561);
									}
								} else {
									local164.b((float) local482);
									local164.b((float) (this.aa(local482, local491) + local517));
									local164.b((float) local491);
									local164.b((byte) (local911 >> 16));
									local164.b((byte) (local911 >> 8));
									local164.b((byte) local911);
									local164.b(-1);
									local164.b((float) local482);
									local164.b((float) local491);
									if (this.anIntArrayArrayArray14 != null) {
										local164.b((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt7418 & 0x7) != 0) {
										local164.b(local559);
										local164.b(local563);
										local164.b(local561);
									}
								}
								local1210 = this.anInt7429++;
								local468[local427] = (short) local1210;
								if (local505 != -1) {
									local168[local1210] = local211[local427];
								}
								local185.method4420(new Class1_Sub7(local468[local427]), local535);
							} else {
								local468[local427] = ((Class1_Sub7) local851).aShort16;
								local1210 = local468[local427] & 0xFFFF;
								if (local505 != -1 && local211[local427].aLong244 < local168[local1210].aLong244) {
									local168[local1210] = local211[local427];
								}
							}
							for (local911 = 0; local911 < local417; local911++) {
								local189[local911].method3545(local567, local770, local547, local1210);
							}
							this.anInt7431++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt7429; local195++) {
				@Pc(1326) Class1_Sub21 local1326 = local168[local195];
				if (local1326 != null) {
					local1326.method3547(local195);
				}
			}
			@Pc(1360) int local1360;
			for (@Pc(1339) int local1339 = 0; local1339 < super.anInt7412; local1339++) {
				for (@Pc(1343) int local1343 = 0; super.anInt7409 > local1343; local1343++) {
					@Pc(1356) short[] local1356 = this.aShortArrayArray11[super.anInt7412 * local1343 + local1339];
					if (local1356 != null) {
						local1360 = 0;
						@Pc(1362) int local1362 = 0;
						while (local1362 < local1356.length) {
							@Pc(1371) int local1371 = local1356[local1362++] & 0xFFFF;
							@Pc(1378) int local1378 = local1356[local1362++] & 0xFFFF;
							@Pc(1385) int local1385 = local1356[local1362++] & 0xFFFF;
							@Pc(1389) Class1_Sub21 local1389 = local168[local1371];
							@Pc(1393) Class1_Sub21 local1393 = local168[local1378];
							@Pc(1397) Class1_Sub21 local1397 = local168[local1385];
							@Pc(1399) Class1_Sub21 local1399 = null;
							if (local1389 != null) {
								local1399 = local1389;
								local1389.method3548(local1343, local1360, local1339);
							}
							if (local1393 != null) {
								local1393.method3548(local1343, local1360, local1339);
								if (local1399 == null || local1393.aLong244 < local1399.aLong244) {
									local1399 = local1393;
								}
							}
							if (local1397 != null) {
								local1397.method3548(local1343, local1360, local1339);
								if (local1399 == null || local1397.aLong244 < local1399.aLong244) {
									local1399 = local1397;
								}
							}
							if (local1399 != null) {
								if (local1389 != null) {
									local1399.method3547(local1371);
								}
								if (local1393 != null) {
									local1399.method3547(local1378);
								}
								if (local1397 != null) {
									local1399.method3547(local1385);
								}
								local1399.method3548(local1343, local1360, local1339);
							}
							local1360++;
						}
					}
				}
			}
			local164.b();
			this.anInterface16_5 = this.aClass9_Sub3_37.method6721(local164.a(), local136, local159);
			this.aClass188_11 = new Class188(this.anInterface16_5, 5126, 3, 0);
			this.aClass188_12 = new Class188(this.anInterface16_5, 5121, 4, 12);
			@Pc(1540) byte local1540;
			if (this.anIntArrayArrayArray14 == null) {
				this.aClass188_13 = new Class188(this.anInterface16_5, 5126, 2, 16);
				local1540 = 24;
			} else {
				local1540 = 28;
				this.aClass188_13 = new Class188(this.anInterface16_5, 5126, 3, 16);
			}
			if ((this.anInt7418 & 0x7) != 0) {
				this.aClass188_14 = new Class188(this.anInterface16_5, 5126, 3, local1540);
			}
			@Pc(1587) long[] local1587 = new long[this.aClass1_Sub21Array1.length];
			for (local1360 = 0; local1360 < this.aClass1_Sub21Array1.length; local1360++) {
				@Pc(1596) Class1_Sub21 local1596 = this.aClass1_Sub21Array1[local1360];
				local1587[local1360] = local1596.aLong244;
				local1596.method3551(this.anInt7429);
			}
			Static46.method1411(local1587, this.aClass1_Sub21Array1);
			if (this.aClass170_2 != null) {
				this.aClass170_2.method4381();
			}
		}
		this.aClass174_29 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray13 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray17 = null;
		this.aByteArrayArray30 = null;
		this.anIntArrayArrayArray18 = null;
		this.aClass1_Sub21ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray19 = this.anIntArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!sb", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass170_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass9_Sub3_37.anInt7915 * arg2 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass9_Sub3_37.anInt7912 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			this.aClass170_2.method4387(local38, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!sb", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7411;
		@Pc(13) int local13 = arg1 >> super.anInt7411;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt7412 - 1 || super.anInt7409 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = arg0 & super.anInt7410 - 1;
		@Pc(48) int local48 = super.anInt7410 - 1 & arg1;
		@Pc(75) int local75 = this.anIntArrayArray73[local8][local13] * (super.anInt7410 - local41) + local41 * this.anIntArrayArray73[local8 + 1][local13] >> super.anInt7411;
		@Pc(106) int local106 = local41 * this.anIntArrayArray73[local8 + 1][local13 + 1] + this.anIntArrayArray73[local8][local13 + 1] * (super.anInt7410 - local41) >> super.anInt7411;
		return (super.anInt7410 - local48) * local75 + local106 * local48 >> super.anInt7411;
	}

	@OriginalMember(owner = "client!sb", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray73[arg0][arg1];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass170_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass9_Sub3_37.anInt7915 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass9_Sub3_37.anInt7912 >> 8) >> this.aClass9_Sub3_37.anInt7874;
			this.aClass170_2.method4382(local24, local39, arg0);
		}
	}
}
