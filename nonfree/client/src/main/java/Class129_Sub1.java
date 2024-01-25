import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	private int anInt3661;

	@OriginalMember(owner = "client!hca", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!hca", name = "N", descriptor = "I")
	private int anInt3674;

	@OriginalMember(owner = "client!hca", name = "U", descriptor = "Lclient!mq;")
	public Class226 aClass226_2;

	@OriginalMember(owner = "client!hca", name = "V", descriptor = "Lclient!eq;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!hca", name = "W", descriptor = "Lclient!mq;")
	public Class226 aClass226_3;

	@OriginalMember(owner = "client!hca", name = "X", descriptor = "Lclient!mq;")
	private Class226 aClass226_4;

	@OriginalMember(owner = "client!hca", name = "Y", descriptor = "[Lclient!gn;")
	private Class1_Sub26[] aClass1_Sub26Array1;

	@OriginalMember(owner = "client!hca", name = "db", descriptor = "Lclient!mq;")
	public Class226 aClass226_5;

	@OriginalMember(owner = "client!hca", name = "eb", descriptor = "I")
	private int anInt3680;

	@OriginalMember(owner = "client!hca", name = "fb", descriptor = "I")
	private int anInt3681;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Lclient!gca;")
	private final Class111 aClass111_16 = new Class111();

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "Lclient!lj;")
	public final Class78_Sub3 aClass78_Sub3_16;

	@OriginalMember(owner = "client!hca", name = "M", descriptor = "I")
	private final int anInt3673;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!hca", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hca", name = "D", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!hca", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
	public final int anInt3662;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	private final int anInt3658;

	@OriginalMember(owner = "client!hca", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!hca", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "[[[Lclient!gn;")
	private Class1_Sub26[][][] aClass1_Sub26ArrayArrayArray1;

	@OriginalMember(owner = "client!hca", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!hca", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hca", name = "bb", descriptor = "Lclient!faa;")
	private Class91 aClass91_8;

	@OriginalMember(owner = "client!hca", name = "J", descriptor = "Lclient!lg;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!lj;IIII[[I[[II)V")
	public Class129_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass78_Sub3_16 = arg0;
		this.anInt3673 = super.anInt8066 - 2;
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.aShortArrayArray2 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt3662 = arg2;
		this.anInt3658 = 0x1 << this.anInt3673;
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.aClass1_Sub26ArrayArrayArray1 = new Class1_Sub26[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt8065 + 1][super.anInt8058 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt8058; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt8065; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray1[local119][local115] = local175 * (float) local138;
				this.aFloatArrayArray2[local119][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local119][local115] = local175 * (float) local155;
			}
		}
		this.aClass91_8 = new Class91(128);
		if ((this.anInt3662 & 0x10) != 0) {
			this.aClass206_1 = new Class206(this.aClass78_Sub3_16, this);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[[ZZIBII)V")
	private void method3001(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass1_Sub26Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg0 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (this.aClass78_Sub3_16.anIntArray311.length < local22) {
			this.aClass78_Sub3_16.anIntArray311 = new int[local22];
		}
		if (this.anInt3661 * 2 > this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1.aByteArray104.length) {
			this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(this.anInt3661 * 2);
		}
		@Pc(66) int local66 = arg5 - arg0;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(76) int local76 = arg4 - arg0;
		@Pc(78) int local78 = local76;
		if (local76 < 0) {
			local76 = 0;
		}
		@Pc(89) int local89 = arg5 + arg0;
		if (local89 > super.anInt8065 - 1) {
			local89 = super.anInt8065 - 1;
		}
		@Pc(104) int local104 = arg4 + arg0;
		if (super.anInt8058 - 1 < local104) {
			local104 = super.anInt8058 - 1;
		}
		@Pc(117) int local117 = 0;
		@Pc(121) int[] local121 = this.aClass78_Sub3_16.anIntArray311;
		@Pc(134) int local134;
		for (@Pc(123) int local123 = local66; local123 <= local89; local123++) {
			@Pc(132) boolean[] local132 = arg1[local123 - local68];
			for (local134 = local76; local134 <= local104; local134++) {
				if (local132[local134 - local78]) {
					local121[local117++] = super.anInt8065 * local134 + local123;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass78_Sub3_16.method4538();
		} else {
			this.aClass78_Sub3_16.method4536((float) arg3);
			this.aClass78_Sub3_16.method4498();
		}
		this.aClass78_Sub3_16.method4524((this.anInt3662 & 0x7) != 0);
		for (@Pc(198) int local198 = 0; local198 < this.aClass1_Sub26Array1.length; local198++) {
			this.aClass1_Sub26Array1[local198].method2742(local121, local117);
		}
		if (!this.aClass111_16.method2546()) {
			local134 = this.aClass78_Sub3_16.anInt5600;
			@Pc(227) int local227 = this.aClass78_Sub3_16.anInt5578;
			this.aClass78_Sub3_16.pa(0, local227, this.aClass78_Sub3_16.anInt5574);
			this.aClass78_Sub3_16.method4524(false);
			this.aClass78_Sub3_16.method4542(false);
			this.aClass78_Sub3_16.method4566(128);
			this.aClass78_Sub3_16.method4567(-2);
			this.aClass78_Sub3_16.method4535(this.aClass78_Sub3_16.aClass46_Sub2_4);
			this.aClass78_Sub3_16.method4539(8448, 7681);
			this.aClass78_Sub3_16.method4493(34166, 0, 770);
			this.aClass78_Sub3_16.method4527(0, 34167);
			for (@Pc(287) Class1 local287 = this.aClass111_16.method2547(); local287 != null; local287 = this.aClass111_16.method2554()) {
				@Pc(292) Class1_Sub41 local292 = (Class1_Sub41) local287;
				local292.method6248(arg5, arg0, arg4, arg1);
			}
			this.aClass78_Sub3_16.method4493(5890, 0, 768);
			this.aClass78_Sub3_16.method4527(0, 5890);
			this.aClass78_Sub3_16.method4535(null);
			this.aClass78_Sub3_16.pa(local134, local227, this.aClass78_Sub3_16.anInt5574);
		}
		if (this.aClass206_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass78_Sub3_16.method4537(this.aClass226_3, null, this.aClass226_5, null);
		this.aClass206_1.method4378(arg5, arg4, arg2, arg0, arg1);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!gd;I)V")
	private void method3002(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray3[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray2[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass78_Sub3_16.anIntArray312.length) {
			this.aClass78_Sub3_16.anIntArray312 = new int[local22];
			this.aClass78_Sub3_16.anIntArray310 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass78_Sub3_16.anIntArray312;
		@Pc(50) int[] local50 = this.aClass78_Sub3_16.anIntArray310;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass78_Sub3_16.anInt5557;
			local50[local52] = local19[local52] >> this.aClass78_Sub3_16.anInt5557;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if ((local104 - local113) * (local90 - local99) - (local104 - local95) * (local108 - local99) > 0) {
				arg1.method2587(local104, local99, local95, local113, local108, local90);
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt8065][super.anInt8058][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt8065][super.anInt8058][];
		}
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray2[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub26[] local88 = this.aClass1_Sub26ArrayArrayArray1[arg0][arg1] = new Class1_Sub26[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass91_8.method2271(local119); local125 != null; local125 = this.aClass91_8.method2277()) {
				@Pc(130) Class1_Sub26 local130 = (Class1_Sub26) local125;
				if (arg8[local90] == local130.anInt3201 && local130.aFloat90 == (float) arg9[local90] && arg10 == local130.anInt3206 && arg11 == local130.anInt3199 && local130.anInt3210 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub26(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass91_8.method2269(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub26) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (this.anInt3681 < arg6.length) {
			this.anInt3681 = arg6.length;
		}
		this.anInt3680 += arg6.length;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
	@Override
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hca", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt3680 <= 0) {
			this.aClass206_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt8065 + 1][super.anInt8058 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; super.anInt8065 > local21; local21++) {
				for (local25 = 1; super.anInt8058 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray7[local21][local25] >> 1) + (this.aByteArrayArray7[local21][local25 + 1] >> 3) + (this.aByteArrayArray7[local21][local25 + -1] >> 2) + (this.aByteArrayArray7[local21 - 1][local25] >> 2) + (this.aByteArrayArray7[local21 + 1][local25] >> 3));
				}
			}
			this.aClass1_Sub26Array1 = new Class1_Sub26[this.aClass91_8.method2273()];
			this.aClass91_8.method2272(this.aClass1_Sub26Array1);
			for (local25 = 0; local25 < this.aClass1_Sub26Array1.length; local25++) {
				this.aClass1_Sub26Array1[local25].method2737(this.anInt3680);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray4 != null) {
				local137 += 4;
			}
			if ((this.anInt3662 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(157) NativeHeapBuffer local157 = this.aClass78_Sub3_16.aNativeHeap4.a(local137 * this.anInt3680, false);
			@Pc(162) Stream local162 = new Stream(local157);
			@Pc(166) Class1_Sub26[] local166 = new Class1_Sub26[this.anInt3680];
			@Pc(173) int local173 = Static505.method7085(this.anInt3680 / 4);
			if (local173 < 1) {
				local173 = 1;
			}
			@Pc(185) Class91 local185 = new Class91(local173);
			@Pc(189) Class1_Sub26[] local189 = new Class1_Sub26[this.anInt3681];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; super.anInt8065 > local191; local191++) {
				for (local195 = 0; super.anInt8058 > local195; local195++) {
					if (this.anIntArrayArrayArray1[local191][local195] != null) {
						@Pc(211) Class1_Sub26[] local211 = this.aClass1_Sub26ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray3[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray2[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray5[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray1[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local191][local195];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(274) float local274 = this.aFloatArrayArray1[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray2[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray3[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray1[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray2[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray3[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray1[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray2[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray3[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray1[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray2[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray3[local191 + 1][local195];
						@Pc(383) int local383 = local19[local191][local195] & 0xFF;
						@Pc(393) int local393 = local19[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local19[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local19[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label335: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class1_Sub26 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local425 == local189[local427]) {
									continue label335;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray2[local195 * super.anInt8065 + local191] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(483) int local483 = (local191 << super.anInt8066) + local218[local427];
							@Pc(493) int local493 = (local195 << super.anInt8066) + local225[local427];
							@Pc(498) int local498 = local483 >> this.anInt3673;
							@Pc(503) int local503 = local493 >> this.anInt3673;
							@Pc(507) int local507 = local239[local427];
							@Pc(511) int local511 = local232[local427];
							@Pc(519) int local519 = local251 == null ? 0 : local251[local427];
							@Pc(537) long local537 = (long) local503 | (long) (local498 << 16) | (long) local511 << 48 | (long) local507 << 32;
							@Pc(541) int local541 = local218[local427];
							@Pc(545) int local545 = local225[local427];
							@Pc(547) byte local547 = 74;
							@Pc(549) int local549 = 0;
							@Pc(581) float local581;
							@Pc(583) float local583;
							@Pc(579) float local579;
							@Pc(642) float local642;
							@Pc(587) int local587;
							if (local541 == 0 && local545 == 0) {
								local587 = local547 - local383;
								local579 = local288;
								local581 = local274;
								local583 = local281;
							} else if (local541 == 0 && super.anInt8060 == local545) {
								local581 = local297;
								local579 = local315;
								local587 = local547 - local393;
								local583 = local306;
							} else if (local541 == super.anInt8060 && local545 == super.anInt8060) {
								local579 = local348;
								local581 = local326;
								local583 = local337;
								local587 = local547 - local405;
							} else if (local541 == super.anInt8060 && local545 == 0) {
								local587 = local547 - local415;
								local579 = local375;
								local581 = local357;
								local583 = local366;
							} else {
								@Pc(617) float local617 = (float) local541 / (float) super.anInt8060;
								@Pc(624) float local624 = (float) local545 / (float) super.anInt8060;
								@Pc(633) float local633 = local274 + local617 * (local357 - local274);
								local642 = local281 + local617 * (local366 - local281);
								@Pc(651) float local651 = local288 + local617 * (local375 - local288);
								@Pc(660) float local660 = (local326 - local297) * local617 + local297;
								@Pc(668) float local668 = local617 * (local337 - local306) + local306;
								local581 = local633 + (local660 - local633) * local624;
								@Pc(686) float local686 = (local348 - local315) * local617 + local315;
								local583 = local642 + (local668 - local642) * local624;
								local579 = local651 + (local686 - local651) * local624;
								@Pc(716) int local716 = local383 + (local541 * (local415 - local383) >> super.anInt8066);
								@Pc(728) int local728 = ((local405 - local393) * local541 >> super.anInt8066) + local393;
								local587 = local547 - ((local728 - local716) * local545 >> super.anInt8066) - local716;
							}
							@Pc(768) float local768 = 1.0F;
							if (local507 != -1) {
								@Pc(780) int local780 = (local507 & 0x7F) * local587 >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								local549 = Static226.anIntArray212[local507 & 0xFF80 | local780];
								if ((this.anInt3662 & 0x7) == 0) {
									local768 = this.aClass78_Sub3_16.aFloatArray49[0] * local581 + local583 * this.aClass78_Sub3_16.aFloatArray49[1] + local579 * this.aClass78_Sub3_16.aFloatArray49[2];
									local768 = (local768 > 0.0F ? this.aClass78_Sub3_16.aFloat140 : this.aClass78_Sub3_16.aFloat141) * local768 + this.aClass78_Sub3_16.aFloat145;
								}
							}
							@Pc(851) Class1 local851 = null;
							if ((local483 & this.anInt3658 - 1) == 0 && (this.anInt3658 - 1 & local493) == 0) {
								local851 = local185.method2271(local537);
							}
							@Pc(890) int local890;
							@Pc(948) int local948;
							if (local851 == null) {
								if (local511 == local507) {
									local948 = local549;
								} else {
									@Pc(926) int local926 = (local511 & 0x7F) * local587 >> 7;
									if (local926 < 2) {
										local926 = 2;
									} else if (local926 > 126) {
										local926 = 126;
									}
									local948 = Static226.anIntArray212[local511 & 0xFF80 | local926];
									if ((this.anInt3662 & 0x7) == 0) {
										local642 = this.aClass78_Sub3_16.aFloatArray49[2] * local579 + local583 * this.aClass78_Sub3_16.aFloatArray49[1] + this.aClass78_Sub3_16.aFloatArray49[0] * local581;
										local642 = (local768 > 0.0F ? this.aClass78_Sub3_16.aFloat140 : this.aClass78_Sub3_16.aFloat141) * local768 + this.aClass78_Sub3_16.aFloat145;
										@Pc(1004) int local1004 = local948 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local948 >> 8 & 0xFF;
										@Pc(1014) int local1014 = local948 & 0xFF;
										local1004 = (int) ((float) local1004 * local642);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local1010 = (int) ((float) local1010 * local642);
										local1014 = (int) ((float) local1014 * local642);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										if (local1014 < 0) {
											local1014 = 0;
										} else if (local1014 > 255) {
											local1014 = 255;
										}
										local948 = local1004 << 16 | local1010 << 8 | local1014;
									}
								}
								if (this.aClass78_Sub3_16.aBoolean425) {
									local162.b((float) local483);
									local162.b((float) (local519 + this.method6480(local493, local483)));
									local162.b((float) local493);
									local162.e((byte) (local948 >> 16));
									local162.e((byte) (local948 >> 8));
									local162.e((byte) local948);
									local162.e(-1);
									local162.b((float) local483);
									local162.b((float) local493);
									if (this.anIntArrayArrayArray4 != null) {
										local162.b((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt3662 & 0x7) != 0) {
										local162.b(local581);
										local162.b(local583);
										local162.b(local579);
									}
								} else {
									local162.a((float) local483);
									local162.a((float) (local519 + this.method6480(local493, local483)));
									local162.a((float) local493);
									local162.e((byte) (local948 >> 16));
									local162.e((byte) (local948 >> 8));
									local162.e((byte) local948);
									local162.e(-1);
									local162.a((float) local483);
									local162.a((float) local493);
									if (this.anIntArrayArrayArray4 != null) {
										local162.a((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt3662 & 0x7) != 0) {
										local162.a(local581);
										local162.a(local583);
										local162.a(local579);
									}
								}
								local890 = this.anInt3674++;
								local469[local427] = (short) local890;
								if (local507 != -1) {
									local166[local890] = local211[local427];
								}
								local185.method2269(local537, new Class1_Sub47(local469[local427]));
							} else {
								local469[local427] = ((Class1_Sub47) local851).aShort114;
								local890 = local469[local427] & 0xFFFF;
								if (local507 != -1 && local166[local890].aLong268 > local211[local427].aLong268) {
									local166[local890] = local211[local427];
								}
							}
							for (local948 = 0; local948 < local417; local948++) {
								local189[local948].method2738(local587, local768, local890, local549);
							}
							this.anInt3661++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt3674; local195++) {
				@Pc(1330) Class1_Sub26 local1330 = local166[local195];
				if (local1330 != null) {
					local1330.method2739(local195);
				}
			}
			@Pc(1363) int local1363;
			for (@Pc(1343) int local1343 = 0; super.anInt8065 > local1343; local1343++) {
				for (@Pc(1347) int local1347 = 0; super.anInt8058 > local1347; local1347++) {
					@Pc(1359) short[] local1359 = this.aShortArrayArray2[local1343 + super.anInt8065 * local1347];
					if (local1359 != null) {
						local1363 = 0;
						@Pc(1365) int local1365 = 0;
						while (local1365 < local1359.length) {
							@Pc(1374) int local1374 = local1359[local1365++] & 0xFFFF;
							@Pc(1381) int local1381 = local1359[local1365++] & 0xFFFF;
							@Pc(1388) int local1388 = local1359[local1365++] & 0xFFFF;
							@Pc(1392) Class1_Sub26 local1392 = local166[local1374];
							@Pc(1396) Class1_Sub26 local1396 = local166[local1381];
							@Pc(1400) Class1_Sub26 local1400 = local166[local1388];
							@Pc(1402) Class1_Sub26 local1402 = null;
							if (local1392 != null) {
								local1402 = local1392;
								local1392.method2745(local1343, local1363, local1347);
							}
							if (local1396 != null) {
								local1396.method2745(local1343, local1363, local1347);
								if (local1402 == null || local1396.aLong268 < local1402.aLong268) {
									local1402 = local1396;
								}
							}
							if (local1400 != null) {
								local1400.method2745(local1343, local1363, local1347);
								if (local1402 == null || local1402.aLong268 > local1400.aLong268) {
									local1402 = local1400;
								}
							}
							if (local1402 != null) {
								if (local1392 != null) {
									local1402.method2739(local1374);
								}
								if (local1396 != null) {
									local1402.method2739(local1381);
								}
								if (local1400 != null) {
									local1402.method2739(local1388);
								}
								local1402.method2745(local1343, local1363, local1347);
							}
							local1363++;
						}
					}
				}
			}
			local162.a();
			this.anInterface8_1 = this.aClass78_Sub3_16.method4568(local137, local162.c(), local157);
			this.aClass226_5 = new Class226(this.anInterface8_1, 5126, 3, 0);
			this.aClass226_4 = new Class226(this.anInterface8_1, 5121, 4, 12);
			@Pc(1553) byte local1553;
			if (this.anIntArrayArrayArray4 == null) {
				this.aClass226_3 = new Class226(this.anInterface8_1, 5126, 2, 16);
				local1553 = 24;
			} else {
				this.aClass226_3 = new Class226(this.anInterface8_1, 5126, 3, 16);
				local1553 = 28;
			}
			if ((this.anInt3662 & 0x7) != 0) {
				this.aClass226_2 = new Class226(this.anInterface8_1, 5126, 3, local1553);
			}
			@Pc(1590) long[] local1590 = new long[this.aClass1_Sub26Array1.length];
			for (local1363 = 0; local1363 < this.aClass1_Sub26Array1.length; local1363++) {
				@Pc(1599) Class1_Sub26 local1599 = this.aClass1_Sub26Array1[local1363];
				local1590[local1363] = local1599.aLong268;
				local1599.method2743(this.anInt3674);
			}
			Static222.method3326(this.aClass1_Sub26Array1, local1590);
			if (this.aClass206_1 != null) {
				this.aClass206_1.method4379();
			}
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray2 = null;
		this.aClass91_8 = null;
		this.aClass1_Sub26ArrayArrayArray1 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aByteArrayArray7 = null;
		this.anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!hca", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass206_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass78_Sub3_16.anInt5603 * arg2 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass78_Sub3_16.anInt5575 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			this.aClass206_1.method4383(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3001(arg2, arg3, arg4, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!tw;[I)V")
	@Override
	public void method6482(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass111_16.method2552(new Class1_Sub41(this.aClass78_Sub3_16, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6476(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3680 <= 0) {
			return;
		}
		this.aClass78_Sub3_16.method4553();
		this.aClass78_Sub3_16.method4506(false);
		this.aClass78_Sub3_16.method4524(false);
		this.aClass78_Sub3_16.method4547(false);
		this.aClass78_Sub3_16.method4542(false);
		this.aClass78_Sub3_16.method4566(0);
		this.aClass78_Sub3_16.method4567(-2);
		this.aClass78_Sub3_16.method4535(null);
		Static568.aFloatArray78[11] = 0.0F;
		Static568.aFloatArray78[3] = 0.0F;
		Static568.aFloatArray78[7] = 0.0F;
		Static568.aFloatArray78[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass78_Sub3_16.anInt5405;
		Static568.aFloatArray78[15] = 1.0F;
		Static568.aFloatArray78[0] = (float) 1024 / ((float) this.aClass78_Sub3_16.anInt5405 * (float) super.anInt8060 * 128.0F);
		Static568.aFloatArray78[1] = 0.0F;
		Static568.aFloatArray78[5] = (float) 1024 / ((float) super.anInt8060 * 128.0F * (float) this.aClass78_Sub3_16.anInt5524);
		Static568.aFloatArray78[8] = 0.0F;
		Static568.aFloatArray78[14] = 0.0F;
		Static568.aFloatArray78[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass78_Sub3_16.anInt5524;
		Static568.aFloatArray78[2] = 0.0F;
		Static568.aFloatArray78[4] = 0.0F;
		Static568.aFloatArray78[6] = 0.0F;
		Static568.aFloatArray78[9] = 0.0F;
		Static568.aFloatArray78[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static568.aFloatArray78, 0);
		Static568.aFloatArray78[10] = 0.0F;
		Static568.aFloatArray78[6] = 1.0F;
		Static568.aFloatArray78[5] = 0.0F;
		Static568.aFloatArray78[7] = 0.0F;
		Static568.aFloatArray78[12] = 0.0F;
		Static568.aFloatArray78[0] = 1.0F;
		Static568.aFloatArray78[2] = 0.0F;
		Static568.aFloatArray78[3] = 0.0F;
		Static568.aFloatArray78[15] = 1.0F;
		Static568.aFloatArray78[9] = 1.0F;
		Static568.aFloatArray78[4] = 0.0F;
		Static568.aFloatArray78[14] = 0.0F;
		Static568.aFloatArray78[1] = 0.0F;
		Static568.aFloatArray78[8] = 0.0F;
		Static568.aFloatArray78[11] = 0.0F;
		Static568.aFloatArray78[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static568.aFloatArray78, 0);
		if ((this.anInt3662 & 0x7) == 0) {
			this.aClass78_Sub3_16.method4524(false);
		} else {
			this.aClass78_Sub3_16.method4524(true);
			this.aClass78_Sub3_16.method4517();
		}
		this.aClass78_Sub3_16.method4537(this.aClass226_3, this.aClass226_2, this.aClass226_5, this.aClass226_4);
		if (this.anInt3661 * 2 > this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1.aByteArray104.length) {
			this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(this.anInt3661 * 2);
		} else {
			this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1.anInt9802 = 0;
		}
		@Pc(317) int local317 = 0;
		@Pc(321) Class1_Sub3_Sub2 local321 = this.aClass78_Sub3_16.aClass1_Sub3_Sub2_1;
		@Pc(327) int local327;
		@Pc(336) int local336;
		@Pc(338) int local338;
		@Pc(357) short[] local357;
		@Pc(361) int local361;
		if (this.aClass78_Sub3_16.aBoolean425) {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = super.anInt8065 * local327 + arg0;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local357 = this.aShortArrayArray2[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local321.method7937(local357[local361] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		} else {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + super.anInt8065 * local327;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local357 = this.aShortArrayArray2[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local321.method7948(local357[local361] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		}
		if (local317 > 0) {
			@Pc(474) Class86_Sub1 local474 = new Class86_Sub1(this.aClass78_Sub3_16, 5123, local321.aByteArray104, local321.anInt9802);
			this.aClass78_Sub3_16.method4564(local317, 0, local474);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6474(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass206_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass78_Sub3_16.anInt5603 * arg2 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			@Pc(40) int local40 = arg3 - (this.aClass78_Sub3_16.anInt5575 * arg2 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			return this.aClass206_1.method4382(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub8_Sub4 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8_Sub4 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8060 >> this.aClass78_Sub3_16.anInt5557;
		@Pc(27) Class1_Sub8_Sub4_Sub1 local27 = (Class1_Sub8_Sub4_Sub1) arg2;
		@Pc(37) Class1_Sub8_Sub4_Sub1 local37;
		if (local27 != null && local27.method2583(local24, local24)) {
			local37 = local27;
			local27.method2586();
		} else {
			local37 = new Class1_Sub8_Sub4_Sub1(this.aClass78_Sub3_16, local24, local24);
		}
		local37.method2585(local24, 0, local24, 0);
		this.method3002(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!hca", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass206_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass78_Sub3_16.anInt5603 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			@Pc(39) int local39 = arg3 - (this.aClass78_Sub3_16.anInt5575 * arg2 >> 8) >> this.aClass78_Sub3_16.anInt5557;
			this.aClass206_1.method4377(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3001(arg2, arg3, arg4, arg5, arg1, arg0);
	}
}
