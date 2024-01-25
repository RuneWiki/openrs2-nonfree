import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
	private int anInt7611;

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
	private int anInt7615;

	@OriginalMember(owner = "client!ov", name = "X", descriptor = "I")
	private int anInt7621;

	@OriginalMember(owner = "client!ov", name = "bb", descriptor = "[Lclient!be;")
	private Class2_Sub7[] aClass2_Sub7Array1;

	@OriginalMember(owner = "client!ov", name = "eb", descriptor = "I")
	private int anInt7623;

	@OriginalMember(owner = "client!ov", name = "fb", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_15;

	@OriginalMember(owner = "client!ov", name = "gb", descriptor = "Lclient!caa;")
	private Interface3 anInterface3_16;

	@OriginalMember(owner = "client!ov", name = "mb", descriptor = "Lclient!hi;")
	public Class147 aClass147_23;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "F")
	private float aFloat188 = -3.4028235E38F;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "F")
	private float aFloat189 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!nt;")
	private final Class238 aClass238_52 = new Class238();

	@OriginalMember(owner = "client!ov", name = "J", descriptor = "Lclient!gt;")
	public final Class87_Sub1 aClass87_Sub1_18;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
	private final int anInt7608;

	@OriginalMember(owner = "client!ov", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!ov", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "[[B")
	private final byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ov", name = "T", descriptor = "I")
	private final int anInt7619;

	@OriginalMember(owner = "client!ov", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "[[[Lclient!be;")
	private Class2_Sub7[][][] aClass2_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
	public final int anInt7605;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ov", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ov", name = "kb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ov", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!ov", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ov", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ov", name = "db", descriptor = "Lclient!mp;")
	private Class222 aClass222_31;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!ica;")
	private Class156 aClass156_2;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!gt;IIII[[I[[II)V")
	public Class112_Sub2(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass87_Sub1_18 = arg0;
		this.anInt7608 = super.anInt9341 - 2;
		this.aFloatArrayArray11 = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray14 = new byte[arg3][arg4];
		this.anInt7619 = 0x1 << this.anInt7608;
		this.aShortArrayArray19 = new short[arg3 * arg4][];
		this.aClass2_Sub7ArrayArrayArray1 = new Class2_Sub7[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt7605 = arg2;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.lb = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9340 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9348 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray89[local125][local121];
				if (this.aFloat189 > (float) local134) {
					this.aFloat189 = local134;
				}
				if ((float) local134 > this.aFloat188) {
					this.aFloat188 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9348 && local121 < super.anInt9340) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + arg7 * arg7 * 4 + local207 * local207)));
					this.lb[local125][local121] = (float) local190 * local226;
					this.aFloatArrayArray11[local125][local121] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray12[local125][local121] = (float) local207 * local226;
				}
			}
		}
		this.aFloat189--;
		this.aFloat188++;
		this.aClass222_31 = new Class222(128);
		if ((this.anInt7605 & 0x10) != 0) {
			this.aClass156_2 = new Class156(this.aClass87_Sub1_18, this);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII[[ZZI)V")
	private void method6374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub7Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg3 + arg3 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > Static210.anIntArray299.length) {
			Static210.anIntArray299 = new int[local18];
		}
		@Pc(30) int local30 = arg0 - arg3;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(41) int local41 = arg1 - arg3;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(52) int local52 = arg0 + arg3;
		if (super.anInt9348 - 1 < local52) {
			local52 = super.anInt9348 - 1;
		}
		@Pc(71) int local71 = arg3 + arg1;
		if (super.anInt9340 - 1 < local71) {
			local71 = super.anInt9340 - 1;
		}
		Static128.anInt2970 = 0;
		for (@Pc(86) int local86 = local30; local86 <= local52; local86++) {
			@Pc(94) boolean[] local94 = arg4[local86 - local32];
			for (@Pc(96) int local96 = local41; local96 <= local71; local96++) {
				if (local94[local96 - local43]) {
					Static210.anIntArray299[Static128.anInt2970++] = local86 + local96 * super.anInt9348;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass87_Sub1_18.method5124();
		} else {
			this.aClass87_Sub1_18.method5020((float) arg2);
			this.aClass87_Sub1_18.method5041();
		}
		this.aClass87_Sub1_18.method5047();
		this.aClass87_Sub1_18.method5108((this.anInt7605 & 0x7) != 0);
		this.aClass87_Sub1_18.method5071(false, false, -1);
		this.aClass87_Sub1_18.method5148(this.anInterface3_16, 0);
		for (@Pc(185) int local185 = 0; local185 < this.aClass2_Sub7Array1.length; local185++) {
			this.aClass2_Sub7Array1[local185].method775(Static128.anInt2970, Static210.anIntArray299);
		}
		@Pc(206) Class6_Sub2 local206 = this.aClass87_Sub1_18.method5129();
		local206.method6701(0, -1, 0);
		this.aClass87_Sub1_18.method5022();
		if (!this.aClass238_52.method5839()) {
			@Pc(224) int local224 = this.aClass87_Sub1_18.anInt6149;
			@Pc(228) int local228 = this.aClass87_Sub1_18.anInt6122;
			this.aClass87_Sub1_18.L(0, local228, this.aClass87_Sub1_18.anInt6137);
			this.aClass87_Sub1_18.method5108(false);
			this.aClass87_Sub1_18.method5053(false);
			this.aClass87_Sub1_18.method5093(128);
			this.aClass87_Sub1_18.method5071(false, false, -2);
			this.aClass87_Sub1_18.method5079(this.aClass87_Sub1_18.anInterface7_3);
			this.aClass87_Sub1_18.method5133(Static148.aClass300_3, Static40.aClass300_1);
			this.aClass87_Sub1_18.method5131(0, Static358.aClass315_1);
			this.aClass87_Sub1_18.method5118(0, Static572.aClass315_4);
			for (@Pc(288) Class2 local288 = this.aClass238_52.method5833(); local288 != null; local288 = this.aClass238_52.method5838()) {
				@Pc(293) Class2_Sub18 local293 = (Class2_Sub18) local288;
				local293.method1764(arg0, arg3, arg1, arg4);
			}
			this.aClass87_Sub1_18.method5131(0, Static516.aClass315_3);
			this.aClass87_Sub1_18.method5118(0, Static516.aClass315_3);
			this.aClass87_Sub1_18.method5079(null);
			this.aClass87_Sub1_18.L(local224, local228, this.aClass87_Sub1_18.anInt6137);
		}
		if (this.aClass156_2 != null) {
			this.aClass87_Sub1_18.method5148(this.anInterface3_16, 0);
			this.aClass87_Sub1_18.method5148(this.anInterface3_15, 1);
			this.aClass87_Sub1_18.method5110(this.aClass147_23);
			this.aClass156_2.method3865(arg1, arg3, arg4, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.U(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ov", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub5_Sub12 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub12 arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9344 >> this.aClass87_Sub1_18.anInt6129;
		@Pc(27) Class2_Sub5_Sub12_Sub1 local27 = (Class2_Sub5_Sub12_Sub1) arg2;
		@Pc(43) Class2_Sub5_Sub12_Sub1 local43;
		if (local27 != null && local27.method4440(local24, local24)) {
			local43 = local27;
			local27.method4439();
		} else {
			local43 = new Class2_Sub5_Sub12_Sub1(this.aClass87_Sub1_18, local24, local24);
		}
		local43.method4438(0, 0, local24, local24);
		this.method6375(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILclient!jt;)V")
	private void method6375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub5_Sub12_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg1][arg0];
		@Pc(24) int[] local24 = this.anIntArrayArrayArray5[arg1][arg0];
		@Pc(27) int local27 = local12.length;
		if (Static10.anIntArray27.length < local27) {
			Static10.anIntArray27 = new int[local27];
			Static92.anIntArray167 = new int[local27];
		}
		for (@Pc(43) int local43 = 0; local43 < local27; local43++) {
			Static10.anIntArray27[local43] = local12[local43] >> this.aClass87_Sub1_18.anInt6129;
			Static92.anIntArray167[local43] = local24[local43] >> this.aClass87_Sub1_18.anInt6129;
		}
		@Pc(75) int local75 = 0;
		while (local27 > local75) {
			@Pc(81) int local81 = Static10.anIntArray27[local75];
			@Pc(86) int local86 = Static92.anIntArray167[local75++];
			@Pc(90) int local90 = Static10.anIntArray27[local75];
			@Pc(95) int local95 = Static92.anIntArray167[local75++];
			@Pc(99) int local99 = Static10.anIntArray27[local75];
			@Pc(104) int local104 = Static92.anIntArray167[local75++];
			if (-((local99 - local90) * (-local86 + local95)) + (local95 - local104) * (-local90 + local81) > 0) {
				arg2.method4441(local90, local81, local99, local86, local104, local95);
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass156_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass87_Sub1_18.anInt6126 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass87_Sub1_18.anInt6118 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			this.aClass156_2.method3870(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!ov", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass156_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass87_Sub1_18.anInt6126 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass87_Sub1_18.anInt6118 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			this.aClass156_2.method3868(arg0, local38, local24);
		}
	}

	@OriginalMember(owner = "client!ov", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt9348][super.anInt9340][];
		}
		@Pc(21) Interface6 local21 = this.aClass87_Sub1_18.anInterface6_11;
		if (arg5 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9348][super.anInt9340][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub7[] local92 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1] = new Class2_Sub7[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt7605 & 0x20) != 0 && local100 != -1 && local21.method6357(local100).aBoolean427) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(155) Class2 local155;
			for (local155 = this.aClass222_31.method5468(local149); local155 != null; local155 = this.aClass222_31.method5475()) {
				@Pc(160) Class2_Sub7 local160 = (Class2_Sub7) local155;
				if (local160.anInt882 == local100 && local160.aFloat23 == (float) local104 && local160.anInt880 == arg10 && arg11 == local160.anInt884 && local160.anInt876 == arg12) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class2_Sub7(this, local100, local104, arg10, arg11, arg12);
				this.aClass222_31.method5476(local92[local94], local149);
			} else {
				local92[local94] = (Class2_Sub7) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray14[arg0][arg1] = (byte) (this.aByteArrayArray14[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt7623) {
			this.anInt7623 = arg6.length;
		}
		this.anInt7621 += arg6.length;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method6374(arg0, arg1, -1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6374(arg0, arg1, arg5, arg2, arg3, arg4, arg6);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
	@Override
	public void method7815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ov", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray15[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!bh;[I)V")
	@Override
	public void method7820(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass238_52.method5837(new Class2_Sub18(this.aClass87_Sub1_18, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7821(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7621 <= 0) {
			return;
		}
		@Pc(19) Interface10 local19 = this.aClass87_Sub1_18.method5051(this.anInt7615);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7682();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass87_Sub1_18.method5128(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9348 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray19[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local44.c(local90);
										if (local90 > local25) {
											local25 = local90;
										}
										if (local23 > local90) {
											local23 = local90;
										}
										local21++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9348 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray19[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local21++;
										if (local23 > local90) {
											local23 = local90;
										}
										if (local25 < local90) {
											local25 = local90;
										}
										local44.d(local90);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method7683()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass87_Sub1_18.method5024();
		this.aClass87_Sub1_18.method5112(false);
		this.aClass87_Sub1_18.method5108(false);
		this.aClass87_Sub1_18.method5088(false);
		this.aClass87_Sub1_18.method5053(false);
		this.aClass87_Sub1_18.method5093(0);
		this.aClass87_Sub1_18.method5071(false, false, -2);
		this.aClass87_Sub1_18.method5079(null);
		@Pc(267) Class6_Sub2 local267 = this.aClass87_Sub1_18.method5129();
		@Pc(272) float[] local272 = this.aClass87_Sub1_18.method5068();
		local272[11] = 0.0F;
		local272[1] = 0.0F;
		local272[2] = 0.0F;
		local272[8] = 0.0F;
		local272[6] = 0.0F;
		local272[9] = 0.0F;
		local272[7] = 0.0F;
		local272[15] = 1.0F;
		local272[0] = (float) 1024 / ((float) this.aClass87_Sub1_18.anInt5936 * 128.0F * (float) super.anInt9344);
		local272[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass87_Sub1_18.anInt5936) - 1.0F;
		local272[5] = (float) 1024 / ((float) super.anInt9344 * 128.0F * (float) this.aClass87_Sub1_18.anInt6075);
		local272[10] = 1.0F / (this.aFloat188 - this.aFloat189);
		local272[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass87_Sub1_18.anInt6075;
		local272[14] = -this.aFloat189 / (this.aFloat188 - this.aFloat189);
		local272[4] = 0.0F;
		local272[3] = 0.0F;
		local267.method2708(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F);
		this.aClass87_Sub1_18.method5054();
		this.aClass87_Sub1_18.method5022();
		if ((this.anInt7605 & 0x7) == 0) {
			this.aClass87_Sub1_18.method5108(false);
		} else {
			this.aClass87_Sub1_18.method5108(true);
			this.aClass87_Sub1_18.method5018();
		}
		this.aClass87_Sub1_18.method5078(false);
		this.aClass87_Sub1_18.method5148(this.anInterface3_16, 0);
		this.aClass87_Sub1_18.method5148(this.anInterface3_15, 1);
		this.aClass87_Sub1_18.method5110(this.aClass147_23);
		this.aClass87_Sub1_18.method5136(0, local25 + 1 - local23, local19, local21 / 3, Static562.aClass334_7, local23);
		this.aClass87_Sub1_18.method5078(true);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7824(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass156_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass87_Sub1_18.anInt6126 * arg2 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass87_Sub1_18.anInt6118 >> 8) >> this.aClass87_Sub1_18.anInt6129;
			return this.aClass156_2.method3864(local39, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ov", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt7621 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9348 + 1][super.anInt9340 + 1];
			for (@Pc(23) int local23 = 1; super.anInt9348 > local23; local23++) {
				for (@Pc(27) int local27 = 1; local27 < super.anInt9340; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray15[local23][local27] >> 1) + (this.aByteArrayArray15[local23][local27 - 1] >> 2) + (this.aByteArrayArray15[local23 + -1][local27] >> 2) + (this.aByteArrayArray15[local23 + 1][local27] >> 3) + (this.aByteArrayArray15[local23][local27 + 1] >> 3));
				}
			}
			@Pc(107) Class2_Sub7[] local107 = new Class2_Sub7[this.aClass222_31.method5473()];
			this.aClass222_31.method5466(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method770(this.anInt7621);
			}
			@Pc(135) int local135 = 20;
			if (this.anIntArrayArrayArray3 != null) {
				local135 += 4;
			}
			if ((this.anInt7605 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass87_Sub1_18.aNativeHeap4.a(this.anInt7621 * 4, false);
			@Pc(165) NativeHeapBuffer local165 = this.aClass87_Sub1_18.aNativeHeap4.a(local135 * this.anInt7621, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(175) Stream local175 = new Stream(local155);
			@Pc(179) Class2_Sub7[] local179 = new Class2_Sub7[this.anInt7621];
			@Pc(186) int local186 = Static291.method4549(this.anInt7621 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(196) Class222 local196 = new Class222(local186);
			@Pc(200) Class2_Sub7[] local200 = new Class2_Sub7[this.anInt7623];
			@Pc(206) int local206;
			for (@Pc(202) int local202 = 0; super.anInt9348 > local202; local202++) {
				for (local206 = 0; super.anInt9340 > local206; local206++) {
					if (this.anIntArrayArrayArray6[local202][local206] != null) {
						@Pc(222) Class2_Sub7[] local222 = this.aClass2_Sub7ArrayArrayArray1[local202][local206];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray7[local202][local206];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray5[local202][local206];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray4[local202][local206];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray6[local202][local206];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local202][local206];
						if (local243 == null) {
							local243 = local250;
						}
						@Pc(278) int[] local278 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local202][local206];
						@Pc(285) float local285 = this.lb[local202][local206];
						@Pc(292) float local292 = this.aFloatArrayArray11[local202][local206];
						@Pc(299) float local299 = this.aFloatArrayArray12[local202][local206];
						@Pc(308) float local308 = this.lb[local202][local206 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray11[local202][local206 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray12[local202][local206 + 1];
						@Pc(337) float local337 = this.lb[local202 + 1][local206 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray11[local202 + 1][local206 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray12[local202 + 1][local206 + 1];
						@Pc(368) float local368 = this.lb[local202 + 1][local206];
						@Pc(377) float local377 = this.aFloatArrayArray11[local202 + 1][local206];
						@Pc(386) float local386 = this.aFloatArrayArray12[local202 + 1][local206];
						@Pc(394) int local394 = local21[local202][local206] & 0xFF;
						@Pc(404) int local404 = local21[local202][local206 + 1] & 0xFF;
						@Pc(416) int local416 = local21[local202 + 1][local206 + 1] & 0xFF;
						@Pc(426) int local426 = local21[local202 + 1][local206] & 0xFF;
						@Pc(428) int local428 = 0;
						@Pc(438) int local438;
						label355: for (@Pc(430) int local430 = 0; local430 < local250.length; local430++) {
							@Pc(436) Class2_Sub7 local436 = local222[local430];
							for (local438 = 0; local438 < local428; local438++) {
								if (local200[local438] == local436) {
									continue label355;
								}
							}
							local200[local428++] = local436;
						}
						@Pc(480) short[] local480 = this.aShortArrayArray19[super.anInt9348 * local206 + local202] = new short[local250.length];
						for (local438 = 0; local438 < local250.length; local438++) {
							@Pc(493) int local493 = (local202 << super.anInt9341) + local229[local438];
							@Pc(503) int local503 = (local206 << super.anInt9341) + local236[local438];
							@Pc(508) int local508 = local493 >> this.anInt7608;
							@Pc(513) int local513 = local503 >> this.anInt7608;
							@Pc(517) int local517 = local250[local438];
							@Pc(521) int local521 = local243[local438];
							@Pc(529) int local529 = local262 == null ? 0 : local262[local438];
							@Pc(547) long local547 = (long) local513 | (long) local521 << 48 | (long) local517 << 32 | (long) (local508 << 16);
							@Pc(551) int local551 = local229[local438];
							@Pc(555) int local555 = local236[local438];
							@Pc(557) byte local557 = 74;
							@Pc(559) int local559 = 0;
							@Pc(583) float local583;
							@Pc(581) float local581;
							@Pc(585) float local585;
							@Pc(659) float local659;
							@Pc(589) int local589;
							if (local551 == 0 && local555 == 0) {
								local589 = local557 - local394;
								local583 = local285;
								local581 = local292;
								local585 = local299;
							} else if (local551 == 0 && super.anInt9344 == local555) {
								local581 = local317;
								local583 = local308;
								local585 = local326;
								local589 = local557 - local404;
							} else if (super.anInt9344 == local551 && local555 == super.anInt9344) {
								local583 = local337;
								local589 = local557 - local416;
								local581 = local348;
								local585 = local359;
							} else if (local551 == super.anInt9344 && local555 == 0) {
								local583 = local368;
								local589 = local557 - local426;
								local581 = local377;
								local585 = local386;
							} else {
								@Pc(635) float local635 = (float) local551 / (float) super.anInt9344;
								@Pc(642) float local642 = (float) local555 / (float) super.anInt9344;
								@Pc(651) float local651 = local285 + local635 * (local368 - local285);
								local659 = local292 + local635 * (local377 - local292);
								@Pc(667) float local667 = local299 + local635 * (local386 - local299);
								@Pc(676) float local676 = local308 + (local337 - local308) * local635;
								@Pc(685) float local685 = local317 + local635 * (local348 - local317);
								local583 = (local676 - local651) * local642 + local651;
								@Pc(703) float local703 = local635 * (local359 - local326) + local326;
								local581 = local659 + (local685 - local659) * local642;
								local585 = local642 * (local703 - local667) + local667;
								@Pc(733) int local733 = ((local426 - local394) * local551 >> super.anInt9341) + local394;
								@Pc(744) int local744 = (local551 * (local416 - local404) >> super.anInt9341) + local404;
								local589 = local557 - local733 - (local555 * (local744 - local733) >> super.anInt9341);
							}
							@Pc(784) float local784 = 1.0F;
							if (local517 != -1) {
								@Pc(795) int local795 = (local517 & 0x7F) * local589 >> 7;
								if (local795 < 2) {
									local795 = 2;
								} else if (local795 > 126) {
									local795 = 126;
								}
								local559 = Static349.anIntArray394[local795 | local517 & 0xFF80];
								if ((this.anInt7605 & 0x7) == 0) {
									local784 = this.aClass87_Sub1_18.aFloatArray52[2] * local585 + local581 * this.aClass87_Sub1_18.aFloatArray52[1] + local583 * this.aClass87_Sub1_18.aFloatArray52[0];
									local784 = this.aClass87_Sub1_18.aFloat140 + local784 * (local784 > 0.0F ? this.aClass87_Sub1_18.aFloat144 : this.aClass87_Sub1_18.aFloat134);
								}
							}
							@Pc(866) Class2 local866 = null;
							if ((this.anInt7619 - 1 & local493) == 0 && (local503 & this.anInt7619 - 1) == 0) {
								local866 = local196.method5468(local547);
							}
							@Pc(902) int local902;
							@Pc(933) int local933;
							if (local866 == null) {
								if (local521 == local517) {
									local933 = local559;
								} else {
									@Pc(943) int local943 = (local521 & 0x7F) * local589 >> 7;
									if (local943 < 2) {
										local943 = 2;
									} else if (local943 > 126) {
										local943 = 126;
									}
									local933 = Static349.anIntArray394[local521 & 0xFF80 | local943];
									if ((this.anInt7605 & 0x7) == 0) {
										local659 = local585 * this.aClass87_Sub1_18.aFloatArray52[2] + this.aClass87_Sub1_18.aFloatArray52[1] * local581 + this.aClass87_Sub1_18.aFloatArray52[0] * local583;
										local659 = this.aClass87_Sub1_18.aFloat140 + local784 * (local784 > 0.0F ? this.aClass87_Sub1_18.aFloat144 : this.aClass87_Sub1_18.aFloat134);
										@Pc(1020) int local1020 = local933 >> 16 & 0xFF;
										@Pc(1026) int local1026 = local933 >> 8 & 0xFF;
										local1020 = (int) ((float) local1020 * local659);
										@Pc(1036) int local1036 = local933 & 0xFF;
										local1026 = (int) ((float) local1026 * local659);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										local1036 = (int) ((float) local1036 * local659);
										if (local1026 < 0) {
											local1026 = 0;
										} else if (local1026 > 255) {
											local1026 = 255;
										}
										if (local1036 < 0) {
											local1036 = 0;
										} else if (local1036 > 255) {
											local1036 = 255;
										}
										local933 = local1036 | local1020 << 16 | local1026 << 8;
									}
								}
								if (Stream.b()) {
									local170.b((float) local493);
									local170.b((float) (local529 + this.method7826(local493, local503)));
									local170.b((float) local503);
									local170.b((float) local493);
									local170.b((float) local503);
									if (this.anIntArrayArrayArray3 != null) {
										local170.b((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt7605 & 0x7) != 0) {
										local170.b(local583);
										local170.b(local581);
										local170.b(local585);
									}
								} else {
									local170.a((float) local493);
									local170.a((float) (this.method7826(local493, local503) + local529));
									local170.a((float) local503);
									local170.a((float) local493);
									local170.a((float) local503);
									if (this.anIntArrayArrayArray3 != null) {
										local170.a((float) (local278 == null ? 0 : local278[local438] - 1));
									}
									if ((this.anInt7605 & 0x7) != 0) {
										local170.a(local583);
										local170.a(local581);
										local170.a(local585);
									}
								}
								if (this.aClass87_Sub1_18.anInt6133 == 0) {
									local175.b(local933 | 0xFF000000);
								} else {
									local175.a(local933 | 0xFF000000);
								}
								local902 = this.anInt7611++;
								local480[local438] = (short) local902;
								if (local517 != -1) {
									local179[local902] = local222[local438];
								}
								local196.method5476(new Class2_Sub19(local480[local438]), local547);
							} else {
								local480[local438] = ((Class2_Sub19) local866).aShort41;
								local902 = local480[local438] & 0xFFFF;
								if (local517 != -1 && local222[local438].aLong287 < local179[local902].aLong287) {
									local179[local902] = local222[local438];
								}
							}
							for (local933 = 0; local933 < local428; local933++) {
								local200[local933].method765(local784, local589, local559, local902);
							}
							this.anInt7615++;
						}
					}
				}
			}
			for (local206 = 0; local206 < this.anInt7611; local206++) {
				@Pc(1320) Class2_Sub7 local1320 = local179[local206];
				if (local1320 != null) {
					local1320.method774(local206);
				}
			}
			@Pc(1337) int local1337;
			@Pc(1356) int local1356;
			for (@Pc(1333) int local1333 = 0; local1333 < super.anInt9348; local1333++) {
				for (local1337 = 0; local1337 < super.anInt9340; local1337++) {
					@Pc(1350) short[] local1350 = this.aShortArrayArray19[super.anInt9348 * local1337 + local1333];
					if (local1350 != null) {
						@Pc(1354) int local1354 = 0;
						local1356 = 0;
						while (local1350.length > local1356) {
							@Pc(1365) int local1365 = local1350[local1356++] & 0xFFFF;
							@Pc(1372) int local1372 = local1350[local1356++] & 0xFFFF;
							@Pc(1379) int local1379 = local1350[local1356++] & 0xFFFF;
							@Pc(1383) Class2_Sub7 local1383 = local179[local1365];
							@Pc(1387) Class2_Sub7 local1387 = local179[local1372];
							@Pc(1391) Class2_Sub7 local1391 = local179[local1379];
							@Pc(1393) Class2_Sub7 local1393 = null;
							if (local1383 != null) {
								local1393 = local1383;
								local1383.method766(local1333, local1354, local1337);
							}
							if (local1387 != null) {
								local1387.method766(local1333, local1354, local1337);
								if (local1393 == null || local1387.aLong287 < local1393.aLong287) {
									local1393 = local1387;
								}
							}
							if (local1391 != null) {
								local1391.method766(local1333, local1354, local1337);
								if (local1393 == null || local1393.aLong287 > local1391.aLong287) {
									local1393 = local1391;
								}
							}
							if (local1393 != null) {
								if (local1383 != null) {
									local1393.method774(local1365);
								}
								if (local1387 != null) {
									local1393.method774(local1372);
								}
								if (local1391 != null) {
									local1393.method774(local1379);
								}
								local1393.method766(local1333, local1354, local1337);
							}
							local1354++;
						}
					}
				}
			}
			local170.a();
			local175.a();
			this.anInterface3_15 = this.aClass87_Sub1_18.method5043(false);
			this.anInterface3_15.method7188(local155, 4, this.anInt7611 * 4);
			this.anInterface3_16 = this.aClass87_Sub1_18.method5043(false);
			this.anInterface3_16.method7188(local165, local135, this.anInt7611 * local135);
			if ((this.anInt7605 & 0x7) == 0) {
				if (this.anIntArrayArrayArray3 == null) {
					this.aClass147_23 = this.aClass87_Sub1_18.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5 }), new Class241(Static620.aClass365_3) });
				} else {
					this.aClass147_23 = this.aClass87_Sub1_18.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5, Static620.aClass365_4 }), new Class241(Static620.aClass365_3) });
				}
			} else if (this.anIntArrayArrayArray3 == null) {
				this.aClass147_23 = this.aClass87_Sub1_18.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5, Static620.aClass365_2 }), new Class241(Static620.aClass365_3) });
			} else {
				this.aClass147_23 = this.aClass87_Sub1_18.method5083(new Class241[] { new Class241(new Class365[] { Static620.aClass365_1, Static620.aClass365_5, Static620.aClass365_4, Static620.aClass365_2 }), new Class241(Static620.aClass365_3) });
			}
			local1337 = 0;
			for (@Pc(1692) int local1692 = 0; local1692 < local107.length; local1692++) {
				if (local107[local1692].anInt875 > 0) {
					local107[local1337++] = local107[local1692];
				}
			}
			this.aClass2_Sub7Array1 = new Class2_Sub7[local1337];
			@Pc(1722) long[] local1722 = new long[local1337];
			for (local1356 = 0; local1356 < local1337; local1356++) {
				@Pc(1730) Class2_Sub7 local1730 = local107[local1356];
				local1722[local1356] = local1730.aLong287;
				this.aClass2_Sub7Array1[local1356] = local1730;
				local1730.method773(this.anInt7611);
			}
			Static14.method292(local1722, this.aClass2_Sub7Array1);
			if (this.aClass156_2 != null) {
				this.aClass156_2.method3867();
			}
		} else {
			this.aClass156_2 = null;
		}
		this.aByteArrayArray15 = null;
		this.lb = this.aFloatArrayArray11 = this.aFloatArrayArray12 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray5 = null;
		this.aClass2_Sub7ArrayArrayArray1 = null;
		this.aClass222_31 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray6 = null;
	}
}
