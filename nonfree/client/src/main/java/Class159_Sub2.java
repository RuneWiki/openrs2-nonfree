import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class159_Sub2 extends Class159 {

	@OriginalMember(owner = "client!lja", name = "M", descriptor = "I")
	private int anInt5998;

	@OriginalMember(owner = "client!lja", name = "z", descriptor = "I")
	private int anInt6003;

	@OriginalMember(owner = "client!lja", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!lja", name = "kb", descriptor = "Lclient!ku;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!lja", name = "F", descriptor = "Lclient!vm;")
	public Class380 aClass380_5;

	@OriginalMember(owner = "client!lja", name = "V", descriptor = "Lclient!vm;")
	public Class380 aClass380_6;

	@OriginalMember(owner = "client!lja", name = "G", descriptor = "Lclient!vm;")
	private Class380 aClass380_7;

	@OriginalMember(owner = "client!lja", name = "ab", descriptor = "[Lclient!vn;")
	private Class14_Sub52[] aClass14_Sub52Array1;

	@OriginalMember(owner = "client!lja", name = "v", descriptor = "I")
	private int anInt6017;

	@OriginalMember(owner = "client!lja", name = "P", descriptor = "I")
	private int anInt6018;

	@OriginalMember(owner = "client!lja", name = "I", descriptor = "Lclient!vm;")
	public Class380 aClass380_8;

	@OriginalMember(owner = "client!lja", name = "K", descriptor = "Lclient!bd;")
	private final Class32 aClass32_30 = new Class32();

	@OriginalMember(owner = "client!lja", name = "fb", descriptor = "Lclient!pi;")
	public final Class144_Sub3 aClass144_Sub3_22;

	@OriginalMember(owner = "client!lja", name = "L", descriptor = "I")
	private final int anInt5993;

	@OriginalMember(owner = "client!lja", name = "ib", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!lja", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!lja", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!lja", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!lja", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!lja", name = "t", descriptor = "I")
	private final int anInt5997;

	@OriginalMember(owner = "client!lja", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!lja", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!lja", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lja", name = "O", descriptor = "I")
	public final int anInt6008;

	@OriginalMember(owner = "client!lja", name = "cb", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!lja", name = "jb", descriptor = "[[[Lclient!vn;")
	private Class14_Sub52[][][] aClass14_Sub52ArrayArrayArray1;

	@OriginalMember(owner = "client!lja", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!lja", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!lja", name = "bb", descriptor = "Lclient!fw;")
	private Class125 aClass125_21;

	@OriginalMember(owner = "client!lja", name = "T", descriptor = "Lclient!hha;")
	private Class154 aClass154_1;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!pi;IIII[[I[[II)V")
	public Class159_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass144_Sub3_22 = arg0;
		this.anInt5993 = super.anInt9501 - 2;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray14 = new byte[arg3][arg4];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anInt5997 = 0x1 << this.anInt5993;
		this.aFloatArrayArray9 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		this.aFloatArrayArray10 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		this.anInt6008 = arg2;
		this.aShortArrayArray2 = new short[arg4 * arg3][];
		this.aClass14_Sub52ArrayArrayArray1 = new Class14_Sub52[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9504 + 1][super.anInt9506 + 1];
		for (@Pc(115) int local115 = 1; super.anInt9506 > local115; local115++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9504; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(156) int local156 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local139 * local139 + local156 * local156)));
				this.aFloatArrayArray9[local121][local115] = local175 * (float) local139;
				this.aFloatArrayArray11[local121][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray10[local121][local115] = local175 * (float) local156;
			}
		}
		this.aClass125_21 = new Class125(128);
		if ((this.anInt6008 & 0x10) != 0) {
			this.aClass154_1 = new Class154(this.aClass144_Sub3_22, this);
		}
	}

	@OriginalMember(owner = "client!lja", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface4 local9 = this.aClass144_Sub3_22.anInterface4_12;
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9504][super.anInt9506][];
		}
		if (arg3 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt9504][super.anInt9506][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray11[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg3;
		}
		@Pc(104) Class14_Sub52[] local104 = this.aClass14_Sub52ArrayArrayArray1[arg0][arg1] = new Class14_Sub52[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt6008 & 0x20) != 0 && local114 != -1 && local9.method8975(local114).aBoolean110) {
				local114 = -1;
				local118 = 128;
			}
			@Pc(166) long local166 = (long) local114 | (long) (local118 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(172) Class14 local172;
			for (local172 = this.aClass125_21.method2630(local166); local172 != null; local172 = this.aClass125_21.method2635()) {
				@Pc(179) Class14_Sub52 local179 = (Class14_Sub52) local172;
				if (local179.anInt10704 == local114 && local179.aFloat208 == (float) local118 && local179.anInt10699 == arg10 && arg11 == local179.anInt10707 && arg12 == local179.anInt10708) {
					break;
				}
			}
			if (local172 == null) {
				local104[local106] = new Class14_Sub52(this, local114, local118, arg10, arg11, arg12);
				this.aClass125_21.method2626(local104[local106], local166);
			} else {
				local104[local106] = (Class14_Sub52) local172;
			}
		}
		if (arg13) {
			this.aByteArrayArray14[arg0][arg1] = (byte) (this.aByteArrayArray14[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6017) {
			this.anInt6017 = arg6.length;
		}
		this.anInt6018 += arg6.length;
	}

	@OriginalMember(owner = "client!lja", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray15[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZIIIII[[ZI)V")
	private void method5348(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[][] arg5, @OriginalArg(7) int arg6) {
		if (this.aClass14_Sub52Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg6 + arg6 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > this.aClass144_Sub3_22.anIntArray417.length) {
			this.aClass144_Sub3_22.anIntArray417 = new int[local26];
		}
		if (this.anInt5998 * 2 > this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2.aByteArray99.length) {
			this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2 = new Class14_Sub21_Sub1(this.anInt5998 * 2);
		}
		@Pc(73) int local73 = arg3 - arg6;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(87) int local87 = arg2 - arg6;
		@Pc(89) int local89 = local87;
		if (local87 < 0) {
			local87 = 0;
		}
		@Pc(97) int local97 = arg3 + arg6;
		if (local97 > super.anInt9504 - 1) {
			local97 = super.anInt9504 - 1;
		}
		@Pc(116) int local116 = arg6 + arg2;
		if (super.anInt9506 - 1 < local116) {
			local116 = super.anInt9506 - 1;
		}
		@Pc(133) int local133 = 0;
		@Pc(137) int[] local137 = this.aClass144_Sub3_22.anIntArray417;
		@Pc(150) int local150;
		for (@Pc(139) int local139 = local73; local139 <= local97; local139++) {
			@Pc(148) boolean[] local148 = arg5[local139 - local75];
			for (local150 = local87; local150 <= local116; local150++) {
				if (local148[local150 - local89]) {
					local137[local133++] = local139 + super.anInt9504 * local150;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass144_Sub3_22.method6976();
		} else {
			this.aClass144_Sub3_22.method7003((float) arg1);
			this.aClass144_Sub3_22.method6989();
		}
		this.aClass144_Sub3_22.method7015((this.anInt6008 & 0x7) != 0);
		for (@Pc(229) int local229 = 0; local229 < this.aClass14_Sub52Array1.length; local229++) {
			this.aClass14_Sub52Array1[local229].method9142(local133, local137);
		}
		if (!this.aClass32_30.method591()) {
			local150 = this.aClass144_Sub3_22.anInt8095;
			@Pc(264) int local264 = this.aClass144_Sub3_22.anInt8081;
			this.aClass144_Sub3_22.L(0, local264, this.aClass144_Sub3_22.anInt8082);
			this.aClass144_Sub3_22.method7015(false);
			this.aClass144_Sub3_22.method7040(false);
			this.aClass144_Sub3_22.method7054(128);
			this.aClass144_Sub3_22.method7053(-2);
			this.aClass144_Sub3_22.method6982(this.aClass144_Sub3_22.aClass161_Sub1_5);
			this.aClass144_Sub3_22.method7025(8448, 7681);
			this.aClass144_Sub3_22.method6979(0, 770, 34166);
			this.aClass144_Sub3_22.method7021(34167, 0);
			for (@Pc(326) Class14 local326 = this.aClass32_30.method584(); local326 != null; local326 = this.aClass32_30.method577()) {
				@Pc(331) Class14_Sub31 local331 = (Class14_Sub31) local326;
				local331.method6259(arg6, arg5, arg2, arg3);
			}
			this.aClass144_Sub3_22.method6979(0, 768, 5890);
			this.aClass144_Sub3_22.method7021(5890, 0);
			this.aClass144_Sub3_22.method6982((Class161) null);
			this.aClass144_Sub3_22.L(local150, local264, this.aClass144_Sub3_22.anInt8082);
		}
		if (this.aClass154_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass144_Sub3_22.method6978(this.aClass380_5, this.aClass380_8, (Class380) null, (Class380) null);
		this.aClass154_1.method3813(arg2, arg6, arg0, arg5, arg3);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5348(arg4, -1, arg1, arg0, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8198(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass154_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass144_Sub3_22.anInt8086 * arg2 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			@Pc(43) int local43 = arg3 - (arg2 * this.aClass144_Sub3_22.anInt8090 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			return this.aClass154_1.method3820(local28, local43, arg0);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5348(arg4, arg5, arg1, arg0, arg6, arg3, arg2);
	}

	@OriginalMember(owner = "client!lja", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6018 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9504 + 1][super.anInt9506 + 1];
			@Pc(24) int local24;
			for (@Pc(20) int local20 = 1; local20 < super.anInt9504; local20++) {
				for (local24 = 1; super.anInt9506 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray15[local20][local24 + 1] >> 3) + (this.aByteArrayArray15[local20 + 1][local24] >> 3) + (this.aByteArrayArray15[local20 - 1][local24] >> 2) + (this.aByteArrayArray15[local20][local24 - 1] >> 2) + (this.aByteArrayArray15[local20][local24] >> 1));
				}
			}
			this.aClass14_Sub52Array1 = new Class14_Sub52[this.aClass125_21.method2624()];
			this.aClass125_21.method2629(this.aClass14_Sub52Array1);
			for (local24 = 0; local24 < this.aClass14_Sub52Array1.length; local24++) {
				this.aClass14_Sub52Array1[local24].method9140(this.anInt6018);
			}
			@Pc(150) int local150 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local150 += 4;
			}
			if ((this.anInt6008 & 0x7) != 0) {
				local150 += 12;
			}
			@Pc(176) NativeHeapBuffer local176 = this.aClass144_Sub3_22.aNativeHeap6.a(this.anInt6018 * local150, false);
			@Pc(181) Stream local181 = new Stream(local176);
			@Pc(185) Class14_Sub52[] local185 = new Class14_Sub52[this.anInt6018];
			@Pc(192) int local192 = Static64.method1041(this.anInt6018 / 4);
			if (local192 < 1) {
				local192 = 1;
			}
			@Pc(202) Class125 local202 = new Class125(local192);
			@Pc(206) Class14_Sub52[] local206 = new Class14_Sub52[this.anInt6017];
			@Pc(212) int local212;
			for (@Pc(208) int local208 = 0; local208 < super.anInt9504; local208++) {
				for (local212 = 0; local212 < super.anInt9506; local212++) {
					if (this.anIntArrayArrayArray11[local208][local212] != null) {
						@Pc(230) Class14_Sub52[] local230 = this.aClass14_Sub52ArrayArrayArray1[local208][local212];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray10[local208][local212];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray15[local208][local212];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray13[local208][local212];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray11[local208][local212];
						@Pc(271) int[] local271 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local208][local212];
						@Pc(284) int[] local284 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local208][local212];
						if (local251 == null) {
							local251 = local258;
						}
						@Pc(295) float local295 = this.aFloatArrayArray9[local208][local212];
						@Pc(302) float local302 = this.aFloatArrayArray11[local208][local212];
						@Pc(309) float local309 = this.aFloatArrayArray10[local208][local212];
						@Pc(318) float local318 = this.aFloatArrayArray9[local208][local212 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray11[local208][local212 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray10[local208][local212 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray9[local208 + 1][local212 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray11[local208 + 1][local212 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray10[local208 + 1][local212 + 1];
						@Pc(378) float local378 = this.aFloatArrayArray9[local208 + 1][local212];
						@Pc(387) float local387 = this.aFloatArrayArray11[local208 + 1][local212];
						@Pc(396) float local396 = this.aFloatArrayArray10[local208 + 1][local212];
						@Pc(404) int local404 = local18[local208][local212] & 0xFF;
						@Pc(414) int local414 = local18[local208][local212 + 1] & 0xFF;
						@Pc(426) int local426 = local18[local208 + 1][local212 + 1] & 0xFF;
						@Pc(436) int local436 = local18[local208 + 1][local212] & 0xFF;
						@Pc(438) int local438 = 0;
						@Pc(450) int local450;
						label337: for (@Pc(440) int local440 = 0; local440 < local258.length; local440++) {
							@Pc(448) Class14_Sub52 local448 = local230[local440];
							for (local450 = 0; local450 < local438; local450++) {
								if (local448 == local206[local450]) {
									continue label337;
								}
							}
							local206[local438++] = local448;
						}
						@Pc(500) short[] local500 = this.aShortArrayArray2[super.anInt9504 * local212 + local208] = new short[local258.length];
						for (local450 = 0; local450 < local258.length; local450++) {
							@Pc(514) int local514 = (local208 << super.anInt9501) + local237[local450];
							@Pc(523) int local523 = (local212 << super.anInt9501) + local244[local450];
							@Pc(528) int local528 = local514 >> this.anInt5993;
							@Pc(533) int local533 = local523 >> this.anInt5993;
							@Pc(537) int local537 = local258[local450];
							@Pc(541) int local541 = local251[local450];
							@Pc(550) int local550 = local271 == null ? 0 : local271[local450];
							@Pc(568) long local568 = (long) (local528 << 16) | (long) local537 << 32 | (long) local541 << 48 | (long) local533;
							@Pc(572) int local572 = local237[local450];
							@Pc(576) int local576 = local244[local450];
							@Pc(578) byte local578 = 74;
							@Pc(580) int local580 = 0;
							@Pc(600) float local600;
							@Pc(602) float local602;
							@Pc(598) float local598;
							@Pc(684) float local684;
							@Pc(596) int local596;
							if (local572 == 0 && local576 == 0) {
								local596 = local578 - local404;
								local598 = local309;
								local600 = local295;
								local602 = local302;
							} else if (local572 == 0 && local576 == super.anInt9502) {
								local598 = local336;
								local596 = local578 - local414;
								local602 = local327;
								local600 = local318;
							} else if (super.anInt9502 == local572 && super.anInt9502 == local576) {
								local596 = local578 - local426;
								local602 = local358;
								local598 = local369;
								local600 = local347;
							} else if (super.anInt9502 == local572 && local576 == 0) {
								local602 = local387;
								local600 = local378;
								local598 = local396;
								local596 = local578 - local436;
							} else {
								@Pc(661) float local661 = (float) local572 / (float) super.anInt9502;
								@Pc(668) float local668 = (float) local576 / (float) super.anInt9502;
								@Pc(676) float local676 = local661 * (local378 - local295) + local295;
								local684 = local302 + local661 * (local387 - local302);
								@Pc(693) float local693 = local661 * (local396 - local309) + local309;
								@Pc(702) float local702 = local318 + (local347 - local318) * local661;
								@Pc(710) float local710 = local327 + (local358 - local327) * local661;
								local600 = local676 + (local702 - local676) * local668;
								@Pc(727) float local727 = (local369 - local336) * local661 + local336;
								local602 = local684 + local668 * (local710 - local684);
								local598 = (local727 - local693) * local668 + local693;
								@Pc(756) int local756 = ((local436 - local404) * local572 >> super.anInt9501) + local404;
								@Pc(768) int local768 = (local572 * (local426 - local414) >> super.anInt9501) + local414;
								local596 = local578 - (local576 * (local768 - local756) >> super.anInt9501) - local756;
							}
							@Pc(820) float local820 = 1.0F;
							if (local537 != -1) {
								@Pc(832) int local832 = local596 * (local537 & 0x7F) >> 7;
								if (local832 < 2) {
									local832 = 2;
								} else if (local832 > 126) {
									local832 = 126;
								}
								if ((this.anInt6008 & 0x7) == 0) {
									local820 = this.aClass144_Sub3_22.aFloatArray65[2] * local598 + this.aClass144_Sub3_22.aFloatArray65[0] * local600 + local602 * this.aClass144_Sub3_22.aFloatArray65[1];
									local820 = this.aClass144_Sub3_22.lb + local820 * (local820 > 0.0F ? this.aClass144_Sub3_22.aFloat149 : this.aClass144_Sub3_22.aFloat154);
								}
								local580 = Static302.anIntArray299[local832 | local537 & 0xFF80];
							}
							@Pc(907) Class14 local907 = null;
							if ((local514 & this.anInt5997 - 1) == 0 && (local523 & this.anInt5997 - 1) == 0) {
								local907 = local202.method2630(local568);
							}
							@Pc(1288) int local1288;
							@Pc(937) int local937;
							if (local907 == null) {
								if (local541 == local537) {
									local937 = local580;
								} else {
									@Pc(947) int local947 = (local541 & 0x7F) * local596 >> 7;
									if (local947 < 2) {
										local947 = 2;
									} else if (local947 > 126) {
										local947 = 126;
									}
									local937 = Static302.anIntArray299[local947 | local541 & 0xFF80];
									if ((this.anInt6008 & 0x7) == 0) {
										local684 = local598 * this.aClass144_Sub3_22.aFloatArray65[2] + this.aClass144_Sub3_22.aFloatArray65[1] * local602 + local600 * this.aClass144_Sub3_22.aFloatArray65[0];
										local684 = this.aClass144_Sub3_22.lb + local820 * (local820 > 0.0F ? this.aClass144_Sub3_22.aFloat149 : this.aClass144_Sub3_22.aFloat154);
										@Pc(1025) int local1025 = local937 >> 16 & 0xFF;
										@Pc(1031) int local1031 = local937 >> 8 & 0xFF;
										local1025 = (int) ((float) local1025 * local684);
										@Pc(1041) int local1041 = local937 & 0xFF;
										local1031 = (int) ((float) local1031 * local684);
										if (local1025 < 0) {
											local1025 = 0;
										} else if (local1025 > 255) {
											local1025 = 255;
										}
										if (local1031 < 0) {
											local1031 = 0;
										} else if (local1031 > 255) {
											local1031 = 255;
										}
										local1041 = (int) ((float) local1041 * local684);
										if (local1041 < 0) {
											local1041 = 0;
										} else if (local1041 > 255) {
											local1041 = 255;
										}
										local937 = local1041 | local1031 << 8 | local1025 << 16;
									}
								}
								if (this.aClass144_Sub3_22.aBoolean557) {
									local181.b((float) local514);
									local181.b((float) (local550 + this.method8209(local514, local523)));
									local181.b((float) local523);
									local181.f((byte) (local937 >> 16));
									local181.f((byte) (local937 >> 8));
									local181.f((byte) local937);
									local181.f(-1);
									local181.b((float) local514);
									local181.b((float) local523);
									if (this.anIntArrayArrayArray14 != null) {
										local181.b((float) (local284 == null ? 0 : local284[local450] - 1));
									}
									if ((this.anInt6008 & 0x7) != 0) {
										local181.b(local600);
										local181.b(local602);
										local181.b(local598);
									}
								} else {
									local181.a((float) local514);
									local181.a((float) (this.method8209(local514, local523) + local550));
									local181.a((float) local523);
									local181.f((byte) (local937 >> 16));
									local181.f((byte) (local937 >> 8));
									local181.f((byte) local937);
									local181.f(-1);
									local181.a((float) local514);
									local181.a((float) local523);
									if (this.anIntArrayArrayArray14 != null) {
										local181.a((float) (local284 == null ? 0 : local284[local450] - 1));
									}
									if ((this.anInt6008 & 0x7) != 0) {
										local181.a(local600);
										local181.a(local602);
										local181.a(local598);
									}
								}
								local1288 = this.anInt6003++;
								local500[local450] = (short) local1288;
								if (local537 != -1) {
									local185[local1288] = local230[local450];
								}
								local202.method2626(new Class14_Sub33(local500[local450]), local568);
							} else {
								local500[local450] = ((Class14_Sub33) local907).aShort72;
								local1288 = local500[local450] & 0xFFFF;
								if (local537 != -1 && local185[local1288].aLong324 > local230[local450].aLong324) {
									local185[local1288] = local230[local450];
								}
							}
							for (local937 = 0; local937 < local438; local937++) {
								local206[local937].method9139(local820, local596, local1288, local580);
							}
							this.anInt5998++;
						}
					}
				}
			}
			for (local212 = 0; local212 < this.anInt6003; local212++) {
				@Pc(1423) Class14_Sub52 local1423 = local185[local212];
				if (local1423 != null) {
					local1423.method9145(local212);
				}
			}
			@Pc(1458) int local1458;
			for (@Pc(1438) int local1438 = 0; local1438 < super.anInt9504; local1438++) {
				for (@Pc(1442) int local1442 = 0; local1442 < super.anInt9506; local1442++) {
					@Pc(1454) short[] local1454 = this.aShortArrayArray2[local1438 + super.anInt9504 * local1442];
					if (local1454 != null) {
						local1458 = 0;
						@Pc(1460) int local1460 = 0;
						while (local1460 < local1454.length) {
							@Pc(1469) int local1469 = local1454[local1460++] & 0xFFFF;
							@Pc(1476) int local1476 = local1454[local1460++] & 0xFFFF;
							@Pc(1483) int local1483 = local1454[local1460++] & 0xFFFF;
							@Pc(1487) Class14_Sub52 local1487 = local185[local1469];
							@Pc(1491) Class14_Sub52 local1491 = local185[local1476];
							@Pc(1495) Class14_Sub52 local1495 = local185[local1483];
							@Pc(1497) Class14_Sub52 local1497 = null;
							if (local1487 != null) {
								local1487.method9138(local1458, local1438, local1442);
								local1497 = local1487;
							}
							if (local1491 != null) {
								local1491.method9138(local1458, local1438, local1442);
								if (local1497 == null || local1497.aLong324 > local1491.aLong324) {
									local1497 = local1491;
								}
							}
							if (local1495 != null) {
								local1495.method9138(local1458, local1438, local1442);
								if (local1497 == null || local1497.aLong324 > local1495.aLong324) {
									local1497 = local1495;
								}
							}
							if (local1497 != null) {
								if (local1487 != null) {
									local1497.method9145(local1469);
								}
								if (local1491 != null) {
									local1497.method9145(local1476);
								}
								if (local1495 != null) {
									local1497.method9145(local1483);
								}
								local1497.method9138(local1458, local1438, local1442);
							}
							local1458++;
						}
					}
				}
			}
			local181.b();
			this.anInterface12_2 = this.aClass144_Sub3_22.method6995(local150, local176, local181.a());
			this.aClass380_8 = new Class380(this.anInterface12_2, 5126, 3, 0);
			this.aClass380_7 = new Class380(this.anInterface12_2, 5121, 4, 12);
			@Pc(1648) byte local1648;
			if (this.anIntArrayArrayArray14 == null) {
				local1648 = 24;
				this.aClass380_5 = new Class380(this.anInterface12_2, 5126, 2, 16);
			} else {
				local1648 = 28;
				this.aClass380_5 = new Class380(this.anInterface12_2, 5126, 3, 16);
			}
			if ((this.anInt6008 & 0x7) != 0) {
				this.aClass380_6 = new Class380(this.anInterface12_2, 5126, 3, local1648);
			}
			@Pc(1694) long[] local1694 = new long[this.aClass14_Sub52Array1.length];
			for (local1458 = 0; local1458 < this.aClass14_Sub52Array1.length; local1458++) {
				@Pc(1705) Class14_Sub52 local1705 = this.aClass14_Sub52Array1[local1458];
				local1694[local1458] = local1705.aLong324;
				local1705.method9143(this.anInt6003);
			}
			Static589.method8392(this.aClass14_Sub52Array1, local1694);
			if (this.aClass154_1 != null) {
				this.aClass154_1.method3817();
			}
		} else {
			this.aClass154_1 = null;
		}
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray11 = this.aFloatArrayArray10 = null;
		this.aByteArrayArray15 = null;
		this.aClass125_21 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass14_Sub52ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!lja", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass154_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass144_Sub3_22.anInt8086 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass144_Sub3_22.anInt8090 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			this.aClass154_1.method3818(arg0, local42, local27);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Lclient!rfa;[I)V")
	@Override
	public void method8208(@OriginalArg(0) Class14_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass32_30.method582(new Class14_Sub31(this.aClass144_Sub3_22, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lja", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass154_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass144_Sub3_22.anInt8086 * arg2 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			@Pc(41) int local41 = arg3 - (arg2 * this.aClass144_Sub3_22.anInt8090 >> 8) >> this.aClass144_Sub3_22.anInt8053;
			this.aClass154_1.method3819(local41, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IILclient!vja;I)V")
	private void method5350(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub2_Sub5_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int[] local17 = this.anIntArrayArrayArray10[arg2][arg0];
		@Pc(24) int[] local24 = this.anIntArrayArrayArray15[arg2][arg0];
		@Pc(27) int local27 = local17.length;
		if (this.aClass144_Sub3_22.anIntArray419.length < local27) {
			this.aClass144_Sub3_22.anIntArray418 = new int[local27];
			this.aClass144_Sub3_22.anIntArray419 = new int[local27];
		}
		@Pc(49) int[] local49 = this.aClass144_Sub3_22.anIntArray419;
		@Pc(53) int[] local53 = this.aClass144_Sub3_22.anIntArray418;
		for (@Pc(55) int local55 = 0; local55 < local27; local55++) {
			local49[local55] = local17[local55] >> this.aClass144_Sub3_22.anInt8053;
			local53[local55] = local24[local55] >> this.aClass144_Sub3_22.anInt8053;
		}
		@Pc(85) int local85 = 0;
		while (local85 < local27) {
			@Pc(93) int local93 = local49[local85];
			@Pc(98) int local98 = local53[local85++];
			@Pc(102) int local102 = local49[local85];
			@Pc(107) int local107 = local53[local85++];
			@Pc(111) int local111 = local49[local85];
			@Pc(116) int local116 = local53[local85++];
			if (-((local111 - local102) * (-local98 + local107)) + (local93 - local102) * (local107 - local116) > 0) {
				arg1.method9102(local98, local116, local107, local111, local102, local93);
			}
		}
	}

	@OriginalMember(owner = "client!lja", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class14_Sub2_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub5 arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9502 >> this.aClass144_Sub3_22.anInt8053;
		@Pc(25) Class14_Sub2_Sub5_Sub2 local25 = (Class14_Sub2_Sub5_Sub2) arg2;
		@Pc(43) Class14_Sub2_Sub5_Sub2 local43;
		if (local25 != null && local25.method9103(local22, local22)) {
			local43 = local25;
			local25.method9107();
		} else {
			local43 = new Class14_Sub2_Sub5_Sub2(this.aClass144_Sub3_22, local22, local22);
		}
		local43.method9106(local22, 0, 0, local22);
		this.method5350(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6018 <= 0) {
			return;
		}
		this.aClass144_Sub3_22.method7020();
		this.aClass144_Sub3_22.method6977(false);
		this.aClass144_Sub3_22.method7015(false);
		this.aClass144_Sub3_22.method7050(false);
		this.aClass144_Sub3_22.method7040(false);
		this.aClass144_Sub3_22.method7054(0);
		this.aClass144_Sub3_22.method7053(-2);
		this.aClass144_Sub3_22.method6982((Class161) null);
		Static276.aFloatArray42[8] = 0.0F;
		Static276.aFloatArray42[0] = (float) 1024 / ((float) this.aClass144_Sub3_22.anInt7855 * 128.0F * (float) super.anInt9502);
		Static276.aFloatArray42[7] = 0.0F;
		Static276.aFloatArray42[1] = 0.0F;
		Static276.aFloatArray42[6] = 0.0F;
		Static276.aFloatArray42[4] = 0.0F;
		Static276.aFloatArray42[15] = 1.0F;
		Static276.aFloatArray42[14] = 0.0F;
		Static276.aFloatArray42[5] = (float) 1024 / ((float) super.anInt9502 * 128.0F * (float) this.aClass144_Sub3_22.anInt7942);
		Static276.aFloatArray42[9] = 0.0F;
		Static276.aFloatArray42[2] = 0.0F;
		Static276.aFloatArray42[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass144_Sub3_22.anInt7942;
		Static276.aFloatArray42[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass144_Sub3_22.anInt7855) - 1.0F;
		Static276.aFloatArray42[11] = 0.0F;
		Static276.aFloatArray42[3] = 0.0F;
		Static276.aFloatArray42[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static276.aFloatArray42, 0);
		Static276.aFloatArray42[0] = 1.0F;
		Static276.aFloatArray42[8] = 0.0F;
		Static276.aFloatArray42[3] = 0.0F;
		Static276.aFloatArray42[6] = 1.0F;
		Static276.aFloatArray42[11] = 0.0F;
		Static276.aFloatArray42[12] = 0.0F;
		Static276.aFloatArray42[2] = 0.0F;
		Static276.aFloatArray42[13] = 0.0F;
		Static276.aFloatArray42[5] = 0.0F;
		Static276.aFloatArray42[1] = 0.0F;
		Static276.aFloatArray42[7] = 0.0F;
		Static276.aFloatArray42[4] = 0.0F;
		Static276.aFloatArray42[14] = 0.0F;
		Static276.aFloatArray42[9] = 1.0F;
		Static276.aFloatArray42[10] = 0.0F;
		Static276.aFloatArray42[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static276.aFloatArray42, 0);
		if ((this.anInt6008 & 0x7) == 0) {
			this.aClass144_Sub3_22.method7015(false);
		} else {
			this.aClass144_Sub3_22.method7015(true);
			this.aClass144_Sub3_22.method7023();
		}
		this.aClass144_Sub3_22.method6978(this.aClass380_5, this.aClass380_8, this.aClass380_6, this.aClass380_7);
		if (this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2.aByteArray99.length >= this.anInt5998 * 2) {
			this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2.anInt8936 = 0;
		} else {
			this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2 = new Class14_Sub21_Sub1(this.anInt5998 * 2);
		}
		@Pc(323) int local323 = 0;
		@Pc(327) Class14_Sub21_Sub1 local327 = this.aClass144_Sub3_22.aClass14_Sub21_Sub1_2;
		@Pc(333) int local333;
		@Pc(342) int local342;
		@Pc(344) int local344;
		@Pc(365) short[] local365;
		@Pc(369) int local369;
		if (this.aClass144_Sub3_22.aBoolean557) {
			for (local333 = arg1; local333 < arg3; local333++) {
				local342 = local333 * super.anInt9504 + arg0;
				for (local344 = arg0; local344 < arg2; local344++) {
					if (arg4[local344 - arg0][local333 - arg1]) {
						local365 = this.aShortArrayArray2[local342];
						if (local365 != null) {
							for (local369 = 0; local369 < local365.length; local369++) {
								local323++;
								local327.method7751(local365[local369] & 0xFFFF);
							}
						}
					}
					local342++;
				}
			}
		} else {
			for (local333 = arg1; local333 < arg3; local333++) {
				local342 = arg0 + super.anInt9504 * local333;
				for (local344 = arg0; local344 < arg2; local344++) {
					if (arg4[local344 - arg0][local333 - arg1]) {
						local365 = this.aShortArrayArray2[local342];
						if (local365 != null) {
							for (local369 = 0; local369 < local365.length; local369++) {
								local327.method7722(local365[local369] & 0xFFFF);
								local323++;
							}
						}
					}
					local342++;
				}
			}
		}
		if (local323 > 0) {
			@Pc(507) Class86_Sub2 local507 = new Class86_Sub2(this.aClass144_Sub3_22, 5123, local327.aByteArray99, local327.anInt8936);
			this.aClass144_Sub3_22.method7029(local507, local323, 0);
		}
	}
}
