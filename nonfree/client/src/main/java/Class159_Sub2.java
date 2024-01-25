import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class159_Sub2 extends Class159 {

	@OriginalMember(owner = "client!si", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "I")
	private int anInt6213;

	@OriginalMember(owner = "client!si", name = "V", descriptor = "[Lclient!jo;")
	private Class3_Sub25[] aClass3_Sub25Array1;

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "Lclient!kd;")
	public Class127 aClass127_7;

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
	private int anInt6217;

	@OriginalMember(owner = "client!si", name = "bb", descriptor = "Lclient!kd;")
	public Class127 aClass127_8;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "Lclient!nh;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!si", name = "db", descriptor = "Lclient!kd;")
	public Class127 aClass127_9;

	@OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
	private int anInt6218;

	@OriginalMember(owner = "client!si", name = "gb", descriptor = "Lclient!kd;")
	private Class127 aClass127_10;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "Lclient!ug;")
	private final Class243 aClass243_39 = new Class243();

	@OriginalMember(owner = "client!si", name = "v", descriptor = "[[I")
	private final int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private final int anInt6200;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "Lclient!vj;")
	public final Class172_Sub2 aClass172_Sub2_34;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "I")
	public final int anInt6205;

	@OriginalMember(owner = "client!si", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!si", name = "C", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!si", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "[[[Lclient!jo;")
	private Class3_Sub25[][][] aClass3_Sub25ArrayArrayArray1;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!si", name = "X", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "Lclient!an;")
	private Class11 aClass11_37;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!lv;")
	private Class146 aClass146_2;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!vj;IIII[[I[[II)V")
	public Class159_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray43 = arg5;
		this.anInt6200 = super.anInt6193 - 2;
		this.aClass172_Sub2_34 = arg0;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anInt6205 = arg2;
		this.aFloatArrayArray5 = new float[super.anInt6189 + 1][super.anInt6192 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt6208 = 0x1 << this.anInt6200;
		this.aFloatArrayArray7 = new float[super.anInt6189 + 1][super.anInt6192 + 1];
		this.aFloatArrayArray6 = new float[super.anInt6189 + 1][super.anInt6192 + 1];
		this.aClass3_Sub25ArrayArrayArray1 = new Class3_Sub25[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt6192 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6189 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * 4 * arg7)));
				this.aFloatArrayArray6[local121][local117] = (float) local139 * local175;
				this.aFloatArrayArray7[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray5[local121][local117] = local175 * (float) local156;
			}
		}
		this.aClass11_37 = new Class11(128);
		if ((this.anInt6205 & 0x10) != 0) {
			this.aClass146_2 = new Class146(this.aClass172_Sub2_34, this);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	@Override
	public void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4838(arg3, arg0, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!si", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass146_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass172_Sub2_34.anInt7183 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			@Pc(38) int local38 = arg3 - (this.aClass172_Sub2_34.anInt7191 * arg2 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			this.aClass146_2.method3617(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!co;IB)V")
	private void method4837(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub4_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray12[arg2][arg0];
		@Pc(26) int local26 = local12.length;
		if (Static421.anIntArray501.length < local26) {
			Static124.anIntArray532 = new int[local26];
			Static421.anIntArray501 = new int[local26];
		}
		for (@Pc(42) int local42 = 0; local42 < local26; local42++) {
			Static421.anIntArray501[local42] = (local12[local42] & 0xFF) >> this.aClass172_Sub2_34.anInt7162;
			Static124.anIntArray532[local42] = (local19[local42] & 0xFF) >> this.aClass172_Sub2_34.anInt7162;
		}
		@Pc(78) int local78 = 0;
		while (local78 < local26) {
			@Pc(84) int local84 = Static421.anIntArray501[local78];
			@Pc(89) int local89 = Static124.anIntArray532[local78++];
			@Pc(93) int local93 = Static421.anIntArray501[local78];
			@Pc(98) int local98 = Static124.anIntArray532[local78++];
			@Pc(102) int local102 = Static421.anIntArray501[local78];
			@Pc(107) int local107 = Static124.anIntArray532[local78++];
			if (-((local98 - local89) * (local102 + -local93)) + (local98 - local107) * (local84 - local93) > 0) {
				arg1.method1171(local107, local98, local102, local89, local93, local84);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method4831(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass146_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass172_Sub2_34.anInt7183 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass172_Sub2_34.anInt7191 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			return this.aClass146_2.method3612(arg0, local39, local25);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4832(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6217 <= 0) {
			return;
		}
		this.aClass172_Sub2_34.method5577();
		this.aClass172_Sub2_34.method5583(false);
		this.aClass172_Sub2_34.method5581(false);
		this.aClass172_Sub2_34.method5623(false);
		this.aClass172_Sub2_34.method5624(false);
		this.aClass172_Sub2_34.method5574(0);
		this.aClass172_Sub2_34.method5610(-2);
		this.aClass172_Sub2_34.method5630(null);
		Static429.aFloatArray31[10] = 0.0F;
		Static429.aFloatArray31[14] = 0.0F;
		Static429.aFloatArray31[0] = (float) 1024 / ((float) super.anInt6190 * 128.0F * (float) this.aClass172_Sub2_34.anInt7054);
		Static429.aFloatArray31[4] = 0.0F;
		Static429.aFloatArray31[11] = 0.0F;
		Static429.aFloatArray31[9] = 0.0F;
		Static429.aFloatArray31[8] = 0.0F;
		Static429.aFloatArray31[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass172_Sub2_34.anInt7068;
		Static429.aFloatArray31[15] = 1.0F;
		Static429.aFloatArray31[1] = 0.0F;
		Static429.aFloatArray31[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass172_Sub2_34.anInt7054) - 1.0F;
		Static429.aFloatArray31[5] = (float) 1024 / ((float) this.aClass172_Sub2_34.anInt7068 * 128.0F * (float) super.anInt6190);
		Static429.aFloatArray31[6] = 0.0F;
		Static429.aFloatArray31[2] = 0.0F;
		Static429.aFloatArray31[7] = 0.0F;
		Static429.aFloatArray31[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static429.aFloatArray31, 0);
		Static429.aFloatArray31[8] = 0.0F;
		Static429.aFloatArray31[6] = 1.0F;
		Static429.aFloatArray31[14] = 0.0F;
		Static429.aFloatArray31[5] = 0.0F;
		Static429.aFloatArray31[13] = 0.0F;
		Static429.aFloatArray31[15] = 1.0F;
		Static429.aFloatArray31[11] = 0.0F;
		Static429.aFloatArray31[2] = 0.0F;
		Static429.aFloatArray31[4] = 0.0F;
		Static429.aFloatArray31[0] = 1.0F;
		Static429.aFloatArray31[12] = 0.0F;
		Static429.aFloatArray31[7] = 0.0F;
		Static429.aFloatArray31[9] = 1.0F;
		Static429.aFloatArray31[10] = 0.0F;
		Static429.aFloatArray31[3] = 0.0F;
		Static429.aFloatArray31[1] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static429.aFloatArray31, 0);
		if ((this.anInt6205 & 0x7) == 0) {
			this.aClass172_Sub2_34.method5581(false);
		} else {
			this.aClass172_Sub2_34.method5581(true);
			this.aClass172_Sub2_34.method5609();
		}
		this.aClass172_Sub2_34.method5622(this.aClass127_10, this.aClass127_7, this.aClass127_8, this.aClass127_9);
		if (this.anInt6213 * 2 > Static273.aClass3_Sub7_2.aByteArray46.length) {
			Static273.aClass3_Sub7_2 = new Class3_Sub7(this.anInt6213 * 2);
		} else {
			Static273.aClass3_Sub7_2.anInt3235 = 0;
		}
		@Pc(309) int local309 = 0;
		@Pc(315) int local315;
		@Pc(324) int local324;
		@Pc(326) int local326;
		@Pc(345) short[] local345;
		@Pc(349) int local349;
		if (this.aClass172_Sub2_34.aBoolean621) {
			for (local315 = arg1; local315 < arg3; local315++) {
				local324 = local315 * super.anInt6189 + arg0;
				for (local326 = arg0; local326 < arg2; local326++) {
					if (arg4[local326 - arg0][local315 - arg1]) {
						local345 = this.aShortArrayArray5[local324];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								local309++;
								Static273.aClass3_Sub7_2.method2613(local345[local349] & 0xFFFF);
							}
						}
					}
					local324++;
				}
			}
		} else {
			for (local315 = arg1; local315 < arg3; local315++) {
				local324 = arg0 + local315 * super.anInt6189;
				for (local326 = arg0; local326 < arg2; local326++) {
					if (arg4[local326 - arg0][local315 - arg1]) {
						local345 = this.aShortArrayArray5[local324];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								Static273.aClass3_Sub7_2.method2585(local345[local349] & 0xFFFF);
								local309++;
							}
						}
					}
					local324++;
				}
			}
		}
		if (local309 > 0) {
			@Pc(466) Class121_Sub2 local466 = new Class121_Sub2(this.aClass172_Sub2_34, 5123, Static273.aClass3_Sub7_2.aByteArray46, Static273.aClass3_Sub7_2.anInt3235);
			this.aClass172_Sub2_34.method5628(local309, local466, 0);
		}
	}

	@OriginalMember(owner = "client!si", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class3_Sub4_Sub4 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub4 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt6190 >> this.aClass172_Sub2_34.anInt7162;
		@Pc(27) Class3_Sub4_Sub4_Sub1 local27 = (Class3_Sub4_Sub4_Sub1) arg2;
		@Pc(43) Class3_Sub4_Sub4_Sub1 local43;
		if (local27 != null && local27.method1168(local24, local24)) {
			local43 = local27;
			local27.method1170();
		} else {
			local43 = new Class3_Sub4_Sub4_Sub1(this.aClass172_Sub2_34, local24, local24);
		}
		local43.method1167(0, 0, local24, local24);
		this.method4837(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fk;[I)V")
	@Override
	public void method4835(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass243_39.method5198(new Class3_Sub20(this.aClass172_Sub2_34, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!si", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray43[arg0][arg1];
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt6217 <= 0) {
			this.aClass146_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt6189 + 1][super.anInt6192 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; super.anInt6189 > local28; local28++) {
				for (local32 = 1; super.anInt6192 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray20[local28][local32 + 1] >> 3) + (this.aByteArrayArray20[local28][local32 - 1] >> 2) + (this.aByteArrayArray20[local28 + 1][local32] >> 3) + (this.aByteArrayArray20[local28 + -1][local32] >> 2) + (this.aByteArrayArray20[local28][local32] >> 1));
				}
			}
			this.aClass3_Sub25Array1 = new Class3_Sub25[this.aClass11_37.method322()];
			this.aClass11_37.method314(this.aClass3_Sub25Array1);
			for (local32 = 0; local32 < this.aClass3_Sub25Array1.length; local32++) {
				this.aClass3_Sub25Array1[local32].method3091(this.anInt6217);
			}
			@Pc(148) int local148 = 24;
			if (this.anIntArrayArrayArray7 != null) {
				local148 += 4;
			}
			if ((this.anInt6205 & 0x7) != 0) {
				local148 += 12;
			}
			@Pc(170) NativeBuffer local170 = this.aClass172_Sub2_34.aNativeHeap2.a(local148 * this.anInt6217);
			@Pc(175) NativeStream local175 = new NativeStream(local170);
			@Pc(179) Class3_Sub25[] local179 = new Class3_Sub25[this.anInt6217];
			@Pc(186) int local186 = Static102.method1790(this.anInt6217 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(196) Class11 local196 = new Class11(local186);
			@Pc(200) Class3_Sub25[] local200 = new Class3_Sub25[this.anInt6218];
			@Pc(206) int local206;
			for (@Pc(202) int local202 = 0; super.anInt6189 > local202; local202++) {
				for (local206 = 0; super.anInt6192 > local206; local206++) {
					if (this.anIntArrayArrayArray10[local202][local206] != null) {
						@Pc(222) Class3_Sub25[] local222 = this.aClass3_Sub25ArrayArrayArray1[local202][local206];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray9[local202][local206];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray12[local202][local206];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray8[local202][local206];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray10[local202][local206];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local202][local206];
						if (local243 == null) {
							local243 = local250;
						}
						@Pc(278) int[] local278 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local202][local206];
						@Pc(285) float local285 = this.aFloatArrayArray6[local202][local206];
						@Pc(292) float local292 = this.aFloatArrayArray7[local202][local206];
						@Pc(299) float local299 = this.aFloatArrayArray5[local202][local206];
						@Pc(308) float local308 = this.aFloatArrayArray6[local202][local206 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray7[local202][local206 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray5[local202][local206 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray6[local202 + 1][local206 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray7[local202 + 1][local206 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray5[local202 + 1][local206 + 1];
						@Pc(368) float local368 = this.aFloatArrayArray6[local202 + 1][local206];
						@Pc(377) float local377 = this.aFloatArrayArray7[local202 + 1][local206];
						@Pc(386) float local386 = this.aFloatArrayArray5[local202 + 1][local206];
						@Pc(394) int local394 = local26[local202][local206] & 0xFF;
						@Pc(404) int local404 = local26[local202][local206 + 1] & 0xFF;
						@Pc(416) int local416 = local26[local202 + 1][local206 + 1] & 0xFF;
						@Pc(426) int local426 = local26[local202 + 1][local206] & 0xFF;
						@Pc(428) int local428 = 0;
						@Pc(438) int local438;
						label337: for (@Pc(430) int local430 = 0; local430 < local250.length; local430++) {
							@Pc(436) Class3_Sub25 local436 = local222[local430];
							for (local438 = 0; local438 < local428; local438++) {
								if (local200[local438] == local436) {
									continue label337;
								}
							}
							local200[local428++] = local436;
						}
						@Pc(483) short[] local483 = this.aShortArrayArray5[local206 * super.anInt6189 + local202] = new short[local250.length];
						for (local438 = 0; local438 < local250.length; local438++) {
							@Pc(497) int local497 = (local202 << super.anInt6193) + local229[local438];
							@Pc(507) int local507 = (local206 << super.anInt6193) + local236[local438];
							@Pc(512) int local512 = local497 >> this.anInt6200;
							@Pc(517) int local517 = local507 >> this.anInt6200;
							@Pc(521) int local521 = local250[local438];
							@Pc(525) int local525 = local243[local438];
							@Pc(533) int local533 = local262 == null ? 0 : local262[local438];
							@Pc(551) long local551 = (long) (local512 << 16) | (long) local525 << 48 | (long) local521 << 32 | (long) local517;
							@Pc(555) int local555 = local229[local438];
							@Pc(559) int local559 = local236[local438];
							@Pc(561) byte local561 = 74;
							@Pc(563) int local563 = 0;
							@Pc(565) float local565 = 1.0F;
							@Pc(585) float local585;
							@Pc(581) float local581;
							@Pc(583) float local583;
							@Pc(664) float local664;
							@Pc(579) int local579;
							if (local555 == 0 && local559 == 0) {
								local579 = local561 - local394;
								local581 = local292;
								local583 = local299;
								local585 = local285;
							} else if (local555 == 0 && super.anInt6190 == local559) {
								local583 = local326;
								local581 = local317;
								local585 = local308;
								local579 = local561 - local404;
							} else if (local555 == super.anInt6190 && super.anInt6190 == local559) {
								local581 = local348;
								local585 = local337;
								local579 = local561 - local416;
								local583 = local359;
							} else if (super.anInt6190 == local555 && local559 == 0) {
								local583 = local386;
								local581 = local377;
								local579 = local561 - local426;
								local585 = local368;
							} else {
								@Pc(641) float local641 = (float) local555 / (float) super.anInt6190;
								@Pc(648) float local648 = (float) local559 / (float) super.anInt6190;
								@Pc(656) float local656 = (local368 - local285) * local641 + local285;
								local664 = local292 + (local377 - local292) * local641;
								@Pc(673) float local673 = local299 + local641 * (local386 - local299);
								@Pc(681) float local681 = local308 + (local337 - local308) * local641;
								@Pc(690) float local690 = local317 + local641 * (local348 - local317);
								local581 = (local690 - local664) * local648 + local664;
								local585 = local656 + (local681 - local656) * local648;
								@Pc(716) float local716 = local326 + local641 * (local359 - local326);
								local583 = (local716 - local673) * local648 + local673;
								@Pc(736) int local736 = ((local426 - local394) * local555 >> super.anInt6193) + local394;
								@Pc(747) int local747 = ((local416 - local404) * local555 >> super.anInt6193) + local404;
								local579 = local561 - ((local747 - local736) * local559 >> super.anInt6193) - local736;
							}
							if (local521 != -1) {
								@Pc(797) int local797 = (local521 & 0x7F) * local579 >> 7;
								if (local797 < 2) {
									local797 = 2;
								} else if (local797 > 126) {
									local797 = 126;
								}
								if ((this.anInt6205 & 0x7) == 0) {
									local565 = this.aClass172_Sub2_34.aFloatArray26[1] * local581 + local585 * this.aClass172_Sub2_34.aFloatArray26[0] + this.aClass172_Sub2_34.aFloatArray26[2] * local583;
									local565 = this.aClass172_Sub2_34.aFloat77 + (local565 > 0.0F ? this.aClass172_Sub2_34.aFloat78 : this.aClass172_Sub2_34.aFloat95) * local565;
								}
								local563 = Static135.anIntArray174[local521 & 0xFF80 | local797];
							}
							@Pc(871) Class3 local871 = null;
							if ((local497 & this.anInt6208 - 1) == 0 && (this.anInt6208 - 1 & local507) == 0) {
								local871 = local196.method324(local551);
							}
							@Pc(904) int local904;
							@Pc(958) int local958;
							if (local871 == null) {
								if (local525 == local521) {
									local958 = local563;
								} else {
									@Pc(936) int local936 = (local525 & 0x7F) * local579 >> 7;
									if (local936 < 2) {
										local936 = 2;
									} else if (local936 > 126) {
										local936 = 126;
									}
									local958 = Static135.anIntArray174[local936 | local525 & 0xFF80];
									if ((this.anInt6205 & 0x7) == 0) {
										@Pc(986) float local986 = this.aClass172_Sub2_34.aFloatArray26[1] * local581 + local585 * this.aClass172_Sub2_34.aFloatArray26[0] + this.aClass172_Sub2_34.aFloatArray26[2] * local583;
										local664 = local565 * (local565 > 0.0F ? this.aClass172_Sub2_34.aFloat78 : this.aClass172_Sub2_34.aFloat95) + this.aClass172_Sub2_34.aFloat77;
										@Pc(1011) int local1011 = local958 >> 16 & 0xFF;
										@Pc(1017) int local1017 = local958 >> 8 & 0xFF;
										@Pc(1021) int local1021 = local958 & 0xFF;
										local1011 = (int) ((float) local1011 * local664);
										local1017 = (int) ((float) local1017 * local664);
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										local1021 = (int) ((float) local1021 * local664);
										if (local1017 < 0) {
											local1017 = 0;
										} else if (local1017 > 255) {
											local1017 = 255;
										}
										if (local1021 < 0) {
											local1021 = 0;
										} else if (local1021 > 255) {
											local1021 = 255;
										}
										local958 = local1021 | local1017 << 8 | local1011 << 16;
									}
								}
								if (this.aClass172_Sub2_34.aBoolean621) {
									local175.a((float) local497);
									local175.a((float) (this.va(local497, local507) + local533));
									local175.a((float) local507);
									local175.a((byte) (local958 >> 16));
									local175.a((byte) (local958 >> 8));
									local175.a((byte) local958);
									local175.a(-1);
									local175.a((float) local497);
									local175.a((float) local507);
									if (this.anIntArrayArrayArray7 != null) {
										local175.a((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt6205 & 0x7) != 0) {
										local175.a(local585);
										local175.a(local581);
										local175.a(local583);
									}
								} else {
									local175.b((float) local497);
									local175.b((float) (local533 + this.va(local497, local507)));
									local175.b((float) local507);
									local175.a((byte) (local958 >> 16));
									local175.a((byte) (local958 >> 8));
									local175.a((byte) local958);
									local175.a(-1);
									local175.b((float) local497);
									local175.b((float) local507);
									if (this.anIntArrayArrayArray7 != null) {
										local175.b((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt6205 & 0x7) != 0) {
										local175.b(local585);
										local175.b(local581);
										local175.b(local583);
									}
								}
								local904 = this.anInt6207++;
								local483[local438] = (short) local904;
								if (local521 != -1) {
									local179[local904] = local222[local438];
								}
								local196.method319(new Class3_Sub37(local483[local438]), local551);
							} else {
								local483[local438] = ((Class3_Sub37) local871).aShort87;
								local904 = local483[local438] & 0xFFFF;
								if (local521 != -1 && local179[local904].aLong234 > local222[local438].aLong234) {
									local179[local904] = local222[local438];
								}
							}
							for (local958 = 0; local958 < local428; local958++) {
								local200[local958].method3086(local565, local579, local904, local563);
							}
							this.anInt6213++;
						}
					}
				}
			}
			for (local206 = 0; local206 < this.anInt6207; local206++) {
				@Pc(1333) Class3_Sub25 local1333 = local179[local206];
				if (local1333 != null) {
					local1333.method3092(local206);
				}
			}
			@Pc(1370) int local1370;
			for (@Pc(1350) int local1350 = 0; local1350 < super.anInt6189; local1350++) {
				for (@Pc(1354) int local1354 = 0; super.anInt6192 > local1354; local1354++) {
					@Pc(1366) short[] local1366 = this.aShortArrayArray5[local1350 + super.anInt6189 * local1354];
					if (local1366 != null) {
						local1370 = 0;
						@Pc(1372) int local1372 = 0;
						while (local1372 < local1366.length) {
							@Pc(1381) int local1381 = local1366[local1372++] & 0xFFFF;
							@Pc(1388) int local1388 = local1366[local1372++] & 0xFFFF;
							@Pc(1395) int local1395 = local1366[local1372++] & 0xFFFF;
							@Pc(1399) Class3_Sub25 local1399 = local179[local1381];
							@Pc(1403) Class3_Sub25 local1403 = local179[local1388];
							@Pc(1407) Class3_Sub25 local1407 = local179[local1395];
							@Pc(1409) Class3_Sub25 local1409 = null;
							if (local1399 != null) {
								local1409 = local1399;
								local1399.method3093(local1350, local1354, local1370);
							}
							if (local1403 != null) {
								local1403.method3093(local1350, local1354, local1370);
								if (local1409 == null || local1409.aLong234 > local1403.aLong234) {
									local1409 = local1403;
								}
							}
							if (local1407 != null) {
								local1407.method3093(local1350, local1354, local1370);
								if (local1409 == null || local1409.aLong234 > local1407.aLong234) {
									local1409 = local1407;
								}
							}
							if (local1409 != null) {
								if (local1399 != null) {
									local1409.method3092(local1381);
								}
								if (local1403 != null) {
									local1409.method3092(local1388);
								}
								if (local1407 != null) {
									local1409.method3092(local1395);
								}
								local1409.method3093(local1350, local1354, local1370);
							}
							local1370++;
						}
					}
				}
			}
			local175.b();
			this.anInterface6_4 = this.aClass172_Sub2_34.method5597(local175.c(), local170, local148);
			this.aClass127_8 = new Class127(this.anInterface6_4, 5126, 3, 0);
			this.aClass127_10 = new Class127(this.anInterface6_4, 5121, 4, 12);
			@Pc(1534) byte local1534;
			if (this.anIntArrayArrayArray7 == null) {
				local1534 = 24;
				this.aClass127_7 = new Class127(this.anInterface6_4, 5126, 2, 16);
			} else {
				local1534 = 28;
				this.aClass127_7 = new Class127(this.anInterface6_4, 5126, 3, 16);
			}
			if ((this.anInt6205 & 0x7) != 0) {
				this.aClass127_9 = new Class127(this.anInterface6_4, 5126, 3, local1534);
			}
			@Pc(1578) long[] local1578 = new long[this.aClass3_Sub25Array1.length];
			for (local1370 = 0; local1370 < this.aClass3_Sub25Array1.length; local1370++) {
				@Pc(1587) Class3_Sub25 local1587 = this.aClass3_Sub25Array1[local1370];
				local1578[local1370] = local1587.aLong234;
				local1587.method3087(this.anInt6207);
			}
			Static19.method380(local1578, this.aClass3_Sub25Array1);
			if (this.aClass146_2 != null) {
				this.aClass146_2.method3616();
			}
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass3_Sub25ArrayArrayArray1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass11_37 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray12 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray5 = null;
		this.aByteArrayArray20 = null;
	}

	@OriginalMember(owner = "client!si", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!si", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt6189][super.anInt6192][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt6189][super.anInt6192][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub25[] local88 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1] = new Class3_Sub25[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(125) Class3 local125;
			for (local125 = this.aClass11_37.method324(local119); local125 != null; local125 = this.aClass11_37.method318()) {
				@Pc(130) Class3_Sub25 local130 = (Class3_Sub25) local125;
				if (arg8[local90] == local130.anInt3859 && (float) arg9[local90] == local130.aFloat29 && arg10 == local130.anInt3866 && arg11 == local130.anInt3869 && arg12 == local130.anInt3862) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub25(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass11_37.method319(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub25) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (this.anInt6218 < arg6.length) {
			this.anInt6218 = arg6.length;
		}
		this.anInt6217 += arg6.length;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([[ZIIBIZI)V")
	private void method4838(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (this.aClass3_Sub25Array1 == null) {
			return;
		}
		@Pc(23) float local23 = this.aClass172_Sub2_34.aFloat75;
		@Pc(27) float local27 = this.aClass172_Sub2_34.aFloat86;
		@Pc(34) int local34 = arg2 + arg2 + 1;
		@Pc(38) int local38 = local34 * local34;
		if (Static226.anIntArray278.length < local38) {
			Static226.anIntArray278 = new int[local38];
		}
		if (Static273.aClass3_Sub7_2.aByteArray46.length < this.anInt6213 * 2) {
			Static273.aClass3_Sub7_2 = new Class3_Sub7(this.anInt6213 * 2);
		}
		@Pc(69) int local69 = arg1 - arg2;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(80) int local80 = arg3 - arg2;
		@Pc(82) int local82 = local80;
		if (local80 < 0) {
			local80 = 0;
		}
		@Pc(91) int local91 = arg1 + arg2;
		if (local91 > super.anInt6189 - 1) {
			local91 = super.anInt6189 - 1;
		}
		@Pc(107) int local107 = arg3 + arg2;
		Static198.anInt3911 = 0;
		if (local107 > super.anInt6192 - 1) {
			local107 = super.anInt6192 - 1;
		}
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local69; local126 <= local91; local126++) {
			@Pc(135) boolean[] local135 = arg0[local126 - local71];
			for (local137 = local80; local137 <= local107; local137++) {
				if (local135[local137 - local82]) {
					Static226.anIntArray278[Static198.anInt3911++] = local126 + local137 * super.anInt6189;
				}
			}
		}
		this.aClass172_Sub2_34.method5627();
		this.aClass172_Sub2_34.method5581((this.anInt6205 & 0x7) != 0);
		for (@Pc(205) int local205 = 0; local205 < this.aClass3_Sub25Array1.length; local205++) {
			this.aClass3_Sub25Array1[local205].method3089(Static226.anIntArray278, Static198.anInt3911);
		}
		if (!this.aClass243_39.method5211()) {
			local137 = this.aClass172_Sub2_34.anInt7188;
			@Pc(242) int local242 = this.aClass172_Sub2_34.anInt7173;
			this.aClass172_Sub2_34.V(0, local242, this.aClass172_Sub2_34.anInt7203);
			this.aClass172_Sub2_34.o(local27, local23 - 4.0F);
			this.aClass172_Sub2_34.method5581(false);
			this.aClass172_Sub2_34.method5624(false);
			this.aClass172_Sub2_34.method5574(128);
			this.aClass172_Sub2_34.method5610(-2);
			this.aClass172_Sub2_34.method5630(this.aClass172_Sub2_34.aClass112_Sub2_5);
			this.aClass172_Sub2_34.method5591(8448, 7681);
			this.aClass172_Sub2_34.method5561(770, 34166, 0);
			this.aClass172_Sub2_34.method5592(34167, 0);
			for (@Pc(313) Class3 local313 = this.aClass243_39.method5208(); local313 != null; local313 = this.aClass243_39.method5203()) {
				@Pc(318) Class3_Sub20 local318 = (Class3_Sub20) local313;
				local318.method2833(arg0, arg1, arg2, arg3);
			}
			this.aClass172_Sub2_34.method5561(768, 5890, 0);
			this.aClass172_Sub2_34.method5592(5890, 0);
			this.aClass172_Sub2_34.method5630(null);
			this.aClass172_Sub2_34.V(local137, local242, this.aClass172_Sub2_34.anInt7203);
		}
		if (this.aClass146_2 != null) {
			this.aClass172_Sub2_34.o(local27, local23 - 8.0F);
			this.aClass172_Sub2_34.method5627();
			this.aClass172_Sub2_34.method5622(null, this.aClass127_7, this.aClass127_8, null);
			this.aClass146_2.method3613(arg3, arg2, arg4, arg0, arg1);
		}
		this.aClass172_Sub2_34.o(local27, local23);
	}

	@OriginalMember(owner = "client!si", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass146_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass172_Sub2_34.anInt7183 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			@Pc(38) int local38 = arg3 - (this.aClass172_Sub2_34.anInt7191 * arg2 >> 8) >> this.aClass172_Sub2_34.anInt7162;
			this.aClass146_2.method3615(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!si", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6193;
		@Pc(13) int local13 = arg1 >> super.anInt6193;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt6189 - 1 || local13 > super.anInt6192 - 1) {
			return 0;
		}
		@Pc(52) int local52 = arg0 & super.anInt6190 - 1;
		@Pc(59) int local59 = arg1 & super.anInt6190 - 1;
		@Pc(86) int local86 = this.anIntArrayArray43[local8][local13] * (super.anInt6190 - local52) + local52 * this.anIntArrayArray43[local8 + 1][local13] >> super.anInt6193;
		@Pc(116) int local116 = local52 * this.anIntArrayArray43[local8 + 1][local13 + 1] + this.anIntArrayArray43[local8][local13 + 1] * (super.anInt6190 - local52) >> super.anInt6193;
		return (super.anInt6190 - local59) * local86 + local59 * local116 >> super.anInt6193;
	}
}
