import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
	private int anInt4414;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
	private int anInt4418;

	@OriginalMember(owner = "client!hn", name = "ib", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!ok;")
	public Class119 aClass119_16;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_9;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Lclient!fea;")
	private Interface7 anInterface7_10;

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "[Lclient!pp;")
	private Class14_Sub37[] aClass14_Sub37Array1;

	@OriginalMember(owner = "client!hn", name = "fb", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!hn", name = "nb", descriptor = "F")
	private float aFloat67 = -3.4028235E38F;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "F")
	private float aFloat68 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!hn", name = "bb", descriptor = "Lclient!bd;")
	private final Class32 aClass32_23 = new Class32();

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "Lclient!he;")
	public final Class144_Sub1 aClass144_Sub1_8;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	private final int anInt4433;

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	public final int anInt4423;

	@OriginalMember(owner = "client!hn", name = "eb", descriptor = "I")
	private final int anInt4415;

	@OriginalMember(owner = "client!hn", name = "cb", descriptor = "[[B")
	private final byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "[[[Lclient!pp;")
	private Class14_Sub37[][][] aClass14_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!hn", name = "hb", descriptor = "Lclient!fw;")
	private Class125 aClass125_14;

	@OriginalMember(owner = "client!hn", name = "X", descriptor = "Lclient!jga;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!he;IIII[[I[[II)V")
	public Class159_Sub1(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass144_Sub1_8 = arg0;
		this.anInt4433 = super.anInt9501 - 2;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt4423 = arg2;
		this.anInt4415 = 0x1 << this.anInt4433;
		this.aByteArrayArray7 = new byte[arg3][arg4];
		this.aFloatArrayArray4 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass14_Sub37ArrayArrayArray1 = new Class14_Sub37[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9506; local121++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt9504; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray56[local127][local121];
				if ((float) local136 > this.aFloat67) {
					this.aFloat67 = (float) local136;
				}
				if (this.aFloat68 > (float) local136) {
					this.aFloat68 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && super.anInt9504 > local127 && local121 < super.anInt9506) {
					@Pc(209) int local209 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(226) int local226 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(245) float local245 = (float) (1.0D / Math.sqrt((double) (local226 * local226 + arg7 * arg7 * 4 + local209 * local209)));
					this.aFloatArrayArray2[local127][local121] = local245 * (float) local209;
					this.aFloatArrayArray4[local127][local121] = (float) (-arg7 * 2) * local245;
					this.aFloatArrayArray3[local127][local121] = local245 * (float) local226;
				}
			}
		}
		this.aFloat68--;
		this.aFloat67++;
		this.aClass125_14 = new Class125(128);
		if ((this.anInt4423 & 0x10) != 0) {
			this.aClass187_1 = new Class187(this.aClass144_Sub1_8, this);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8198(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass187_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass144_Sub1_8.anInt6515 * arg2 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			@Pc(43) int local43 = arg3 - (this.aClass144_Sub1_8.anInt6529 * arg2 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			return this.aClass187_1.method4696(local28, arg0, local43);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([[ZIIIIIZI)V")
	private void method3882(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (this.aClass14_Sub37Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg1 + arg1 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static496.anIntArray425.length) {
			Static496.anIntArray425 = new int[local14];
		}
		@Pc(28) int local28 = arg2 - arg1;
		@Pc(30) int local30 = local28;
		if (local28 < 0) {
			local28 = 0;
		}
		@Pc(42) int local42 = arg4 - arg1;
		@Pc(44) int local44 = local42;
		if (local42 < 0) {
			local42 = 0;
		}
		@Pc(52) int local52 = arg1 + arg2;
		if (super.anInt9504 - 1 < local52) {
			local52 = super.anInt9504 - 1;
		}
		@Pc(71) int local71 = arg4 + arg1;
		if (local71 > super.anInt9506 - 1) {
			local71 = super.anInt9506 - 1;
		}
		Static323.anInt5596 = 0;
		for (@Pc(90) int local90 = local28; local90 <= local52; local90++) {
			@Pc(98) boolean[] local98 = arg0[local90 - local30];
			for (@Pc(100) int local100 = local42; local100 <= local71; local100++) {
				if (local98[local100 - local44]) {
					Static496.anIntArray425[Static323.anInt5596++] = local90 + super.anInt9504 * local100;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass144_Sub1_8.method5650();
		} else {
			this.aClass144_Sub1_8.method5766((float) arg5);
			this.aClass144_Sub1_8.method5657();
		}
		this.aClass144_Sub1_8.method5662();
		this.aClass144_Sub1_8.method5745((this.anInt4423 & 0x7) != 0);
		this.aClass144_Sub1_8.method5769(false, -1, false);
		this.aClass144_Sub1_8.method5696(0, this.anInterface7_9);
		for (@Pc(200) int local200 = 0; local200 < this.aClass14_Sub37Array1.length; local200++) {
			this.aClass14_Sub37Array1[local200].method7148(Static496.anIntArray425, Static323.anInt5596);
		}
		@Pc(223) Class263_Sub2 local223 = this.aClass144_Sub1_8.method5729();
		local223.method8444(0, -1, 0);
		this.aClass144_Sub1_8.method5645();
		if (!this.aClass32_23.method591()) {
			@Pc(243) int local243 = this.aClass144_Sub1_8.anInt6507;
			@Pc(247) int local247 = this.aClass144_Sub1_8.anInt6499;
			this.aClass144_Sub1_8.L(0, local247, this.aClass144_Sub1_8.anInt6517);
			this.aClass144_Sub1_8.method5745(false);
			this.aClass144_Sub1_8.method5694(false);
			this.aClass144_Sub1_8.method5685(128);
			this.aClass144_Sub1_8.method5769(false, -2, false);
			this.aClass144_Sub1_8.method5643(this.aClass144_Sub1_8.anInterface25_3);
			this.aClass144_Sub1_8.method5653(Static284.aClass287_1, Static345.aClass287_2);
			this.aClass144_Sub1_8.method5740(Static216.aClass138_5, 0);
			this.aClass144_Sub1_8.method5779(0, Static627.aClass138_6);
			for (@Pc(307) Class14 local307 = this.aClass32_23.method584(); local307 != null; local307 = this.aClass32_23.method577()) {
				@Pc(312) Class14_Sub41 local312 = (Class14_Sub41) local307;
				local312.method7967(arg0, arg2, arg4, arg1);
			}
			this.aClass144_Sub1_8.method5740(Static308.aClass138_4, 0);
			this.aClass144_Sub1_8.method5779(0, Static308.aClass138_4);
			this.aClass144_Sub1_8.method5643((Interface25) null);
			this.aClass144_Sub1_8.L(local243, local247, this.aClass144_Sub1_8.anInt6517);
		}
		if (this.aClass187_1 != null) {
			this.aClass144_Sub1_8.method5696(0, this.anInterface7_9);
			this.aClass144_Sub1_8.method5696(1, this.anInterface7_10);
			this.aClass144_Sub1_8.method5707(this.aClass119_16);
			this.aClass187_1.method4697(arg6, arg4, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt9504][super.anInt9506][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9504][super.anInt9506][];
		}
		@Pc(41) Interface4 local41 = this.aClass144_Sub1_8.anInterface4_12;
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray6[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(104) Class14_Sub37[] local104 = this.aClass14_Sub37ArrayArrayArray1[arg0][arg1] = new Class14_Sub37[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt4423 & 0x20) != 0 && local114 != -1 && local41.method8975(local114).aBoolean110) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(167) long local167 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local118 << 14) | (long) local114;
			@Pc(173) Class14 local173;
			for (local173 = this.aClass125_14.method2630(local167); local173 != null; local173 = this.aClass125_14.method2635()) {
				@Pc(180) Class14_Sub37 local180 = (Class14_Sub37) local173;
				if (local114 == local180.anInt8216 && local180.aFloat164 == (float) local118 && local180.anInt8217 == arg10 && local180.anInt8213 == arg11 && local180.anInt8212 == arg12) {
					break;
				}
			}
			if (local173 == null) {
				local104[local106] = new Class14_Sub37(this, local114, local118, arg10, arg11, arg12);
				this.aClass125_14.method2626(local104[local106], local167);
			} else {
				local104[local106] = (Class14_Sub37) local173;
			}
		}
		if (arg13) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (this.anInt4434 < arg6.length) {
			this.anInt4434 = arg6.length;
		}
		this.anInt4435 += arg6.length;
	}

	@OriginalMember(owner = "client!hn", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class14_Sub2_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub5 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(25) int local25 = super.anInt9502 >> this.aClass144_Sub1_8.anInt6523;
		@Pc(28) Class14_Sub2_Sub5_Sub1 local28 = (Class14_Sub2_Sub5_Sub1) arg2;
		@Pc(40) Class14_Sub2_Sub5_Sub1 local40;
		if (local28 != null && local28.method1271(local25, local25)) {
			local40 = local28;
			local28.method1270();
		} else {
			local40 = new Class14_Sub2_Sub5_Sub1(this.aClass144_Sub1_8, local25, local25);
		}
		local40.method1269(local25, 0, local25, 0);
		this.method3883(local40, arg0, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!cka;III)V")
	private void method3883(@OriginalArg(0) Class14_Sub2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(30) int local30 = local20.length;
		if (local30 > Static244.anIntArray234.length) {
			Static106.anIntArray105 = new int[local30];
			Static244.anIntArray234 = new int[local30];
		}
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			Static244.anIntArray234[local44] = local20[local44] >> this.aClass144_Sub1_8.anInt6523;
			Static106.anIntArray105[local44] = local27[local44] >> this.aClass144_Sub1_8.anInt6523;
		}
		@Pc(74) int local74 = 0;
		while (local74 < local30) {
			@Pc(82) int local82 = Static244.anIntArray234[local74];
			@Pc(87) int local87 = Static106.anIntArray105[local74++];
			@Pc(91) int local91 = Static244.anIntArray234[local74];
			@Pc(96) int local96 = Static106.anIntArray105[local74++];
			@Pc(100) int local100 = Static244.anIntArray234[local74];
			@Pc(105) int local105 = Static106.anIntArray105[local74++];
			if ((local82 - local91) * (local96 - local105) - (local100 - local91) * (-local87 + local96) > 0) {
				arg0.method1272(local100, local82, local105, local96, local91, local87);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4435 <= 0) {
			return;
		}
		@Pc(17) Interface8 local17 = this.aClass144_Sub1_8.method5681(this.anInt4418);
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 32767;
		@Pc(23) int local23 = -32768;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			local19 = 0;
			@Pc(36) Buffer local36 = local17.method5085();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass144_Sub1_8.method5747(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt9504 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray1[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local21) {
											local21 = local90;
										}
										local44.a(local90);
										if (local23 < local90) {
											local23 = local90;
										}
										local19++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt9504 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray1[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local21 > local90) {
											local21 = local90;
										}
										local19++;
										if (local23 < local90) {
											local23 = local90;
										}
										local44.d(local90);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.b();
				if (local17.method5081()) {
					break;
				}
			}
		}
		if (local19 <= 0) {
			return;
		}
		this.aClass144_Sub1_8.method5722();
		this.aClass144_Sub1_8.method5764(false);
		this.aClass144_Sub1_8.method5745(false);
		this.aClass144_Sub1_8.method5664(false);
		this.aClass144_Sub1_8.method5694(false);
		this.aClass144_Sub1_8.method5685(0);
		this.aClass144_Sub1_8.method5769(false, -2, false);
		this.aClass144_Sub1_8.method5643((Interface25) null);
		@Pc(312) Class263_Sub2 local312 = this.aClass144_Sub1_8.method5729();
		@Pc(317) float[] local317 = this.aClass144_Sub1_8.method5690();
		local317[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass144_Sub1_8.anInt6368;
		local317[4] = 0.0F;
		local317[0] = (float) 1024 / ((float) super.anInt9502 * 128.0F * (float) this.aClass144_Sub1_8.anInt6409);
		local317[3] = 0.0F;
		local317[6] = 0.0F;
		local317[15] = 1.0F;
		local317[14] = -this.aFloat68 / (this.aFloat67 - this.aFloat68);
		local317[11] = 0.0F;
		local317[9] = 0.0F;
		local317[8] = 0.0F;
		local317[7] = 0.0F;
		local317[10] = 1.0F / (this.aFloat67 - this.aFloat68);
		local317[2] = 0.0F;
		local317[5] = (float) 1024 / ((float) this.aClass144_Sub1_8.anInt6368 * (float) super.anInt9502 * 128.0F);
		local317[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass144_Sub1_8.anInt6409;
		local317[1] = 0.0F;
		local312.method7297(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
		this.aClass144_Sub1_8.method5734();
		this.aClass144_Sub1_8.method5645();
		if ((this.anInt4423 & 0x7) == 0) {
			this.aClass144_Sub1_8.method5745(false);
		} else {
			this.aClass144_Sub1_8.method5745(true);
			this.aClass144_Sub1_8.method5673();
		}
		this.aClass144_Sub1_8.method5652(false);
		this.aClass144_Sub1_8.method5696(0, this.anInterface7_9);
		this.aClass144_Sub1_8.method5696(1, this.anInterface7_10);
		this.aClass144_Sub1_8.method5707(this.aClass119_16);
		this.aClass144_Sub1_8.method5746(local19 / 3, local21, local17, local23 + 1 - local21, Static469.aClass213_46, 0);
		this.aClass144_Sub1_8.method5652(true);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!rfa;[I)V")
	@Override
	public void method8208(@OriginalArg(0) Class14_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass32_23.method582(new Class14_Sub41(this.aClass144_Sub1_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hn", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass187_1 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (this.aClass144_Sub1_8.anInt6515 * arg2 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			@Pc(41) int local41 = arg3 - (arg2 * this.aClass144_Sub1_8.anInt6529 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			this.aClass187_1.method4698(local41, local26, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hn", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass187_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass144_Sub1_8.anInt6515 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass144_Sub1_8.anInt6529 >> 8) >> this.aClass144_Sub1_8.anInt6523;
			this.aClass187_1.method4701(local42, arg0, local27);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3882(arg3, arg2, arg0, arg5, arg1, -1, arg4);
	}

	@OriginalMember(owner = "client!hn", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt4435 <= 0) {
			this.aClass187_1 = null;
		} else {
			@Pc(21) byte[][] local21 = new byte[super.anInt9504 + 1][super.anInt9506 + 1];
			for (@Pc(23) int local23 = 1; local23 < super.anInt9504; local23++) {
				for (@Pc(29) int local29 = 1; local29 < super.anInt9506; local29++) {
					local21[local23][local29] = (byte) ((this.aByteArrayArray8[local23][local29] >> 1) + (this.aByteArrayArray8[local23 + 1][local29] >> 3) + (this.aByteArrayArray8[local23 + -1][local29] >> 2) + (this.aByteArrayArray8[local23][local29 + -1] >> 2) + (this.aByteArrayArray8[local23][local29 + 1] >> 3));
				}
			}
			@Pc(119) Class14_Sub37[] local119 = new Class14_Sub37[this.aClass125_14.method2624()];
			this.aClass125_14.method2629(local119);
			for (@Pc(129) int local129 = 0; local129 < local119.length; local129++) {
				local119[local129].method7155(this.anInt4435);
			}
			@Pc(147) int local147 = 20;
			if (this.anIntArrayArrayArray7 != null) {
				local147 += 4;
			}
			if ((this.anInt4423 & 0x7) != 0) {
				local147 += 12;
			}
			@Pc(176) NativeHeapBuffer local176 = this.aClass144_Sub1_8.aNativeHeap5.a(this.anInt4435 * 4, false);
			@Pc(186) NativeHeapBuffer local186 = this.aClass144_Sub1_8.aNativeHeap5.a(local147 * this.anInt4435, false);
			@Pc(191) Stream local191 = new Stream(local186);
			@Pc(196) Stream local196 = new Stream(local176);
			@Pc(200) Class14_Sub37[] local200 = new Class14_Sub37[this.anInt4435];
			@Pc(207) int local207 = Static64.method1041(this.anInt4435 / 4);
			if (local207 < 1) {
				local207 = 1;
			}
			@Pc(217) Class125 local217 = new Class125(local207);
			@Pc(221) Class14_Sub37[] local221 = new Class14_Sub37[this.anInt4434];
			@Pc(227) int local227;
			for (@Pc(223) int local223 = 0; super.anInt9504 > local223; local223++) {
				for (local227 = 0; local227 < super.anInt9506; local227++) {
					if (this.anIntArrayArrayArray4[local223][local227] != null) {
						@Pc(245) Class14_Sub37[] local245 = this.aClass14_Sub37ArrayArrayArray1[local223][local227];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray5[local223][local227];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray6[local223][local227];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray2[local223][local227];
						@Pc(273) int[] local273 = this.anIntArrayArrayArray4[local223][local227];
						@Pc(286) int[] local286 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local223][local227];
						@Pc(299) int[] local299 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local223][local227];
						if (local266 == null) {
							local266 = local273;
						}
						@Pc(310) float local310 = this.aFloatArrayArray2[local223][local227];
						@Pc(317) float local317 = this.aFloatArrayArray4[local223][local227];
						@Pc(324) float local324 = this.aFloatArrayArray3[local223][local227];
						@Pc(333) float local333 = this.aFloatArrayArray2[local223][local227 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray4[local223][local227 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray3[local223][local227 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray2[local223 + 1][local227 + 1];
						@Pc(373) float local373 = this.aFloatArrayArray4[local223 + 1][local227 + 1];
						@Pc(384) float local384 = this.aFloatArrayArray3[local223 + 1][local227 + 1];
						@Pc(393) float local393 = this.aFloatArrayArray2[local223 + 1][local227];
						@Pc(402) float local402 = this.aFloatArrayArray4[local223 + 1][local227];
						@Pc(411) float local411 = this.aFloatArrayArray3[local223 + 1][local227];
						@Pc(419) int local419 = local21[local223][local227] & 0xFF;
						@Pc(429) int local429 = local21[local223][local227 + 1] & 0xFF;
						@Pc(441) int local441 = local21[local223 + 1][local227 + 1] & 0xFF;
						@Pc(451) int local451 = local21[local223 + 1][local227] & 0xFF;
						@Pc(453) int local453 = 0;
						@Pc(465) int local465;
						label355: for (@Pc(455) int local455 = 0; local455 < local273.length; local455++) {
							@Pc(463) Class14_Sub37 local463 = local245[local455];
							for (local465 = 0; local465 < local453; local465++) {
								if (local463 == local221[local465]) {
									continue label355;
								}
							}
							local221[local453++] = local463;
						}
						@Pc(511) short[] local511 = this.aShortArrayArray1[local227 * super.anInt9504 + local223] = new short[local273.length];
						for (local465 = 0; local465 < local273.length; local465++) {
							@Pc(524) int local524 = (local223 << super.anInt9501) + local252[local465];
							@Pc(534) int local534 = (local227 << super.anInt9501) + local259[local465];
							@Pc(539) int local539 = local524 >> this.anInt4433;
							@Pc(544) int local544 = local534 >> this.anInt4433;
							@Pc(548) int local548 = local273[local465];
							@Pc(552) int local552 = local266[local465];
							@Pc(561) int local561 = local286 == null ? 0 : local286[local465];
							@Pc(579) long local579 = (long) local544 | (long) local548 << 32 | (long) local552 << 48 | (long) (local539 << 16);
							@Pc(583) int local583 = local252[local465];
							@Pc(587) int local587 = local259[local465];
							@Pc(589) byte local589 = 74;
							@Pc(591) int local591 = 0;
							@Pc(593) float local593 = 1.0F;
							@Pc(610) float local610;
							@Pc(604) float local604;
							@Pc(612) float local612;
							@Pc(708) float local708;
							@Pc(608) int local608;
							if (local583 == 0 && local587 == 0) {
								local604 = local317;
								local608 = local589 - local419;
								local610 = local310;
								local612 = local324;
							} else if (local583 == 0 && local587 == super.anInt9502) {
								local604 = local342;
								local610 = local333;
								local612 = local351;
								local608 = local589 - local429;
							} else if (super.anInt9502 == local583 && local587 == super.anInt9502) {
								local608 = local589 - local441;
								local612 = local384;
								local610 = local362;
								local604 = local373;
							} else if (super.anInt9502 == local583 && local587 == 0) {
								local610 = local393;
								local604 = local402;
								local612 = local411;
								local608 = local589 - local451;
							} else {
								@Pc(684) float local684 = (float) local583 / (float) super.anInt9502;
								@Pc(691) float local691 = (float) local587 / (float) super.anInt9502;
								@Pc(700) float local700 = (local393 - local310) * local684 + local310;
								local708 = local317 + (local402 - local317) * local684;
								@Pc(717) float local717 = (local411 - local324) * local684 + local324;
								@Pc(725) float local725 = local333 + (local362 - local333) * local684;
								@Pc(734) float local734 = local342 + (local373 - local342) * local684;
								local610 = local700 + (local725 - local700) * local691;
								@Pc(750) float local750 = local351 + (local384 - local351) * local684;
								local604 = local691 * (local734 - local708) + local708;
								local612 = local691 * (local750 - local717) + local717;
								@Pc(780) int local780 = local419 + (local583 * (local451 - local419) >> super.anInt9501);
								@Pc(793) int local793 = local429 + (local583 * (local441 - local429) >> super.anInt9501);
								local608 = local589 - (local587 * (local793 - local780) >> super.anInt9501) - local780;
							}
							if (local548 != -1) {
								@Pc(830) int local830 = (local548 & 0x7F) * local608 >> 7;
								if (local830 < 2) {
									local830 = 2;
								} else if (local830 > 126) {
									local830 = 126;
								}
								local591 = Static302.anIntArray299[local548 & 0xFF80 | local830];
								if ((this.anInt4423 & 0x7) == 0) {
									local593 = local604 * this.aClass144_Sub1_8.aFloatArray51[1] + this.aClass144_Sub1_8.aFloatArray51[0] * local610 + local612 * this.aClass144_Sub1_8.aFloatArray51[2];
									local593 = (local593 > 0.0F ? this.aClass144_Sub1_8.aFloat102 : this.aClass144_Sub1_8.aFloat91) * local593 + this.aClass144_Sub1_8.aFloat95;
								}
							}
							@Pc(904) Class14 local904 = null;
							if ((local524 & this.anInt4415 - 1) == 0 && (local534 & this.anInt4415 - 1) == 0) {
								local904 = local217.method2630(local579);
							}
							@Pc(942) int local942;
							@Pc(979) int local979;
							if (local904 == null) {
								if (local552 == local548) {
									local979 = local591;
								} else {
									@Pc(989) int local989 = local608 * (local552 & 0x7F) >> 7;
									if (local989 < 2) {
										local989 = 2;
									} else if (local989 > 126) {
										local989 = 126;
									}
									local979 = Static302.anIntArray299[local552 & 0xFF80 | local989];
									if ((this.anInt4423 & 0x7) == 0) {
										local708 = local604 * this.aClass144_Sub1_8.aFloatArray51[1] + this.aClass144_Sub1_8.aFloatArray51[0] * local610 + local612 * this.aClass144_Sub1_8.aFloatArray51[2];
										local708 = this.aClass144_Sub1_8.aFloat95 + local593 * (local593 > 0.0F ? this.aClass144_Sub1_8.aFloat102 : this.aClass144_Sub1_8.aFloat91);
										@Pc(1072) int local1072 = local979 >> 16 & 0xFF;
										@Pc(1078) int local1078 = local979 >> 8 & 0xFF;
										local1072 = (int) ((float) local1072 * local708);
										@Pc(1088) int local1088 = local979 & 0xFF;
										if (local1072 < 0) {
											local1072 = 0;
										} else if (local1072 > 255) {
											local1072 = 255;
										}
										local1078 = (int) ((float) local1078 * local708);
										local1088 = (int) ((float) local1088 * local708);
										if (local1078 < 0) {
											local1078 = 0;
										} else if (local1078 > 255) {
											local1078 = 255;
										}
										if (local1088 < 0) {
											local1088 = 0;
										} else if (local1088 > 255) {
											local1088 = 255;
										}
										local979 = local1088 | local1072 << 16 | local1078 << 8;
									}
								}
								if (Stream.c()) {
									local191.b((float) local524);
									local191.b((float) (local561 + this.method8209(local524, local534)));
									local191.b((float) local534);
									local191.b((float) local524);
									local191.b((float) local534);
									if (this.anIntArrayArrayArray7 != null) {
										local191.b((float) (local299 == null ? 0 : local299[local465] - 1));
									}
									if ((this.anInt4423 & 0x7) != 0) {
										local191.b(local610);
										local191.b(local604);
										local191.b(local612);
									}
								} else {
									local191.a((float) local524);
									local191.a((float) (this.method8209(local524, local534) + local561));
									local191.a((float) local534);
									local191.a((float) local524);
									local191.a((float) local534);
									if (this.anIntArrayArrayArray7 != null) {
										local191.a((float) (local299 == null ? 0 : local299[local465] - 1));
									}
									if ((this.anInt4423 & 0x7) != 0) {
										local191.a(local610);
										local191.a(local604);
										local191.a(local612);
									}
								}
								if (this.aClass144_Sub1_8.anInt6500 == 0) {
									local196.b(local979 | 0xFF000000);
								} else {
									local196.c(local979 | 0xFF000000);
								}
								local942 = this.anInt4414++;
								local511[local465] = (short) local942;
								if (local548 != -1) {
									local200[local942] = local245[local465];
								}
								local217.method2626(new Class14_Sub33(local511[local465]), local579);
							} else {
								local511[local465] = ((Class14_Sub33) local904).aShort72;
								local942 = local511[local465] & 0xFFFF;
								if (local548 != -1 && local200[local942].aLong324 > local245[local465].aLong324) {
									local200[local942] = local245[local465];
								}
							}
							for (local979 = 0; local979 < local453; local979++) {
								local221[local979].method7153(local593, local942, local608, local591);
							}
							this.anInt4418++;
						}
					}
				}
			}
			for (local227 = 0; local227 < this.anInt4414; local227++) {
				@Pc(1420) Class14_Sub37 local1420 = local200[local227];
				if (local1420 != null) {
					local1420.method7154(local227);
				}
			}
			@Pc(1441) int local1441;
			@Pc(1459) int local1459;
			for (@Pc(1435) int local1435 = 0; local1435 < super.anInt9504; local1435++) {
				for (local1441 = 0; local1441 < super.anInt9506; local1441++) {
					@Pc(1453) short[] local1453 = this.aShortArrayArray1[local1435 + local1441 * super.anInt9504];
					if (local1453 != null) {
						@Pc(1457) int local1457 = 0;
						local1459 = 0;
						while (local1459 < local1453.length) {
							@Pc(1468) int local1468 = local1453[local1459++] & 0xFFFF;
							@Pc(1475) int local1475 = local1453[local1459++] & 0xFFFF;
							@Pc(1482) int local1482 = local1453[local1459++] & 0xFFFF;
							@Pc(1486) Class14_Sub37 local1486 = local200[local1468];
							@Pc(1490) Class14_Sub37 local1490 = local200[local1475];
							@Pc(1494) Class14_Sub37 local1494 = local200[local1482];
							@Pc(1496) Class14_Sub37 local1496 = null;
							if (local1486 != null) {
								local1486.method7152(local1441, local1435, local1457);
								local1496 = local1486;
							}
							if (local1490 != null) {
								local1490.method7152(local1441, local1435, local1457);
								if (local1496 == null || local1496.aLong324 > local1490.aLong324) {
									local1496 = local1490;
								}
							}
							if (local1494 != null) {
								local1494.method7152(local1441, local1435, local1457);
								if (local1496 == null || local1496.aLong324 > local1494.aLong324) {
									local1496 = local1494;
								}
							}
							if (local1496 != null) {
								if (local1486 != null) {
									local1496.method7154(local1468);
								}
								if (local1490 != null) {
									local1496.method7154(local1475);
								}
								if (local1494 != null) {
									local1496.method7154(local1482);
								}
								local1496.method7152(local1441, local1435, local1457);
							}
							local1457++;
						}
					}
				}
			}
			local191.b();
			local196.b();
			this.anInterface7_10 = this.aClass144_Sub1_8.method5780(false);
			this.anInterface7_10.method5844(local176, this.anInt4414 * 4, 4);
			this.anInterface7_9 = this.aClass144_Sub1_8.method5780(false);
			this.anInterface7_9.method5844(local186, local147 * this.anInt4414, local147);
			if ((this.anInt4423 & 0x7) == 0) {
				if (this.anIntArrayArrayArray7 == null) {
					this.aClass119_16 = this.aClass144_Sub1_8.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5 }), new Class127(Static102.aClass73_3) });
				} else {
					this.aClass119_16 = this.aClass144_Sub1_8.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5, Static102.aClass73_4 }), new Class127(Static102.aClass73_3) });
				}
			} else if (this.anIntArrayArrayArray7 == null) {
				this.aClass119_16 = this.aClass144_Sub1_8.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5, Static102.aClass73_2 }), new Class127(Static102.aClass73_3) });
			} else {
				this.aClass119_16 = this.aClass144_Sub1_8.method5689(new Class127[] { new Class127(new Class73[] { Static102.aClass73_1, Static102.aClass73_5, Static102.aClass73_4, Static102.aClass73_2 }), new Class127(Static102.aClass73_3) });
			}
			local1441 = 0;
			for (@Pc(1839) int local1839 = 0; local1839 < local119.length; local1839++) {
				if (local119[local1839].anInt8220 > 0) {
					local119[local1441++] = local119[local1839];
				}
			}
			this.aClass14_Sub37Array1 = new Class14_Sub37[local1441];
			@Pc(1872) long[] local1872 = new long[local1441];
			for (local1459 = 0; local1459 < local1441; local1459++) {
				@Pc(1884) Class14_Sub37 local1884 = local119[local1459];
				local1872[local1459] = local1884.aLong324;
				this.aClass14_Sub37Array1[local1459] = local1884;
				local1884.method7147(this.anInt4414);
			}
			Static589.method8392(this.aClass14_Sub37Array1, local1872);
			if (this.aClass187_1 != null) {
				this.aClass187_1.method4695();
			}
		}
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray2 = null;
		this.aByteArrayArray8 = null;
		this.anIntArrayArrayArray3 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.aClass14_Sub37ArrayArrayArray1 = null;
		this.aClass125_14 = null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3882(arg3, arg2, arg0, arg6, arg1, arg5, arg4);
	}
}
