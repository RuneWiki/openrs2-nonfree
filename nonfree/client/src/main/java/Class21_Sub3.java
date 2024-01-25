import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
	private int anInt2982;

	@OriginalMember(owner = "client!ew", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ew", name = "Q", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!ew", name = "Y", descriptor = "[Lclient!hda;")
	private Class3_Sub29[] aClass3_Sub29Array1;

	@OriginalMember(owner = "client!ew", name = "ab", descriptor = "Lclient!id;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!ew", name = "cb", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ew", name = "eb", descriptor = "I")
	private int anInt2999;

	@OriginalMember(owner = "client!ew", name = "fb", descriptor = "Lclient!nc;")
	public Class233 aClass233_8;

	@OriginalMember(owner = "client!ew", name = "gb", descriptor = "Lclient!id;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!ew", name = "A", descriptor = "F")
	private float aFloat76 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ew", name = "U", descriptor = "F")
	private float aFloat77 = -3.4028235E38F;

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "Lclient!tm;")
	private final Class338 aClass338_75 = new Class338();

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Lclient!ai;")
	public final Class13_Sub1 aClass13_Sub1_8;

	@OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!ew", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ew", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ew", name = "V", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ew", name = "H", descriptor = "[[[Lclient!hda;")
	private Class3_Sub29[][][] aClass3_Sub29ArrayArrayArray1;

	@OriginalMember(owner = "client!ew", name = "J", descriptor = "I")
	private final int anInt2988;

	@OriginalMember(owner = "client!ew", name = "D", descriptor = "[[B")
	private final byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!ew", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ew", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
	public final int anInt2981;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ew", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ew", name = "F", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!ew", name = "hb", descriptor = "Lclient!ee;")
	private Class83 aClass83_8;

	@OriginalMember(owner = "client!ew", name = "B", descriptor = "Lclient!nt;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!ai;IIII[[I[[II)V")
	public Class21_Sub3(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass13_Sub1_8 = arg0;
		this.anInt2996 = super.anInt9125 - 2;
		this.aFloatArrayArray7 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aClass3_Sub29ArrayArrayArray1 = new Class3_Sub29[arg3][arg4][];
		this.anInt2988 = 0x1 << this.anInt2996;
		this.aByteArrayArray11 = new byte[arg3][arg4];
		this.aFloatArrayArray6 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anInt2981 = arg2;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.aShortArrayArray13 = new short[arg4 * arg3][];
		for (@Pc(121) int local121 = 0; super.anInt9128 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9129 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray51[local125][local121];
				if (this.aFloat76 > (float) local134) {
					this.aFloat76 = (float) local134;
				}
				if (this.aFloat77 < (float) local134) {
					this.aFloat77 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9129 && local121 < super.anInt9128) {
					@Pc(182) int local182 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(198) int local198 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(217) float local217 = (float) (1.0D / Math.sqrt((double) (local198 * local198 + arg7 * 4 * arg7 + local182 * local182)));
					this.aFloatArrayArray5[local125][local121] = (float) local182 * local217;
					this.aFloatArrayArray6[local125][local121] = local217 * (float) (-arg7 * 2);
					this.aFloatArrayArray7[local125][local121] = (float) local198 * local217;
				}
			}
		}
		this.aFloat77++;
		this.aFloat76--;
		this.aClass83_8 = new Class83(128);
		if ((this.anInt2981 & 0x10) != 0) {
			this.aClass244_1 = new Class244(this.aClass13_Sub1_8, this);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7981(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass13_Sub1_8.anInt8597 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass13_Sub1_8.anInt8596 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			return this.aClass244_1.method5905(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([[ZIZIIIII)V")
	private void method2768(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub29Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg2 + arg2 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static93.anIntArray961.length) {
			Static93.anIntArray961 = new int[local14];
		}
		@Pc(30) int local30 = arg6 - arg2;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(40) int local40 = arg4 - arg2;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(53) int local53 = arg2 + arg6;
		if (super.anInt9129 - 1 < local53) {
			local53 = super.anInt9129 - 1;
		}
		@Pc(73) int local73 = arg4 + arg2;
		Static323.anInt4545 = 0;
		if (super.anInt9128 - 1 < local73) {
			local73 = super.anInt9128 - 1;
		}
		for (@Pc(92) int local92 = local30; local92 <= local53; local92++) {
			@Pc(101) boolean[] local101 = arg0[local92 - local32];
			for (@Pc(103) int local103 = local40; local103 <= local73; local103++) {
				if (local101[local103 - local42]) {
					Static93.anIntArray961[Static323.anInt4545++] = local103 * super.anInt9129 + local92;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass13_Sub1_8.method7493();
		} else {
			this.aClass13_Sub1_8.method7417((float) arg3);
			this.aClass13_Sub1_8.method7519();
		}
		this.aClass13_Sub1_8.method7459();
		this.aClass13_Sub1_8.method7465((this.anInt2981 & 0x7) != 0);
		this.aClass13_Sub1_8.method7508(false, -1, false);
		this.aClass13_Sub1_8.method7423(this.anInterface15_5, 0);
		for (@Pc(198) int local198 = 0; local198 < this.aClass3_Sub29Array1.length; local198++) {
			this.aClass3_Sub29Array1[local198].method3769(Static93.anIntArray961, Static323.anInt4545);
		}
		@Pc(223) Class239_Sub3 local223 = this.aClass13_Sub1_8.method7480();
		local223.method9234(0, -1, 0);
		this.aClass13_Sub1_8.method7515();
		if (!this.aClass338_75.method8166()) {
			@Pc(241) int local241 = this.aClass13_Sub1_8.anInt8598;
			@Pc(245) int local245 = this.aClass13_Sub1_8.anInt8627;
			this.aClass13_Sub1_8.L(0, local245, this.aClass13_Sub1_8.anInt8621);
			this.aClass13_Sub1_8.method7465(false);
			this.aClass13_Sub1_8.method7505(false);
			this.aClass13_Sub1_8.method7440(128);
			this.aClass13_Sub1_8.method7508(false, -2, false);
			this.aClass13_Sub1_8.method7530(this.aClass13_Sub1_8.anInterface3_3);
			this.aClass13_Sub1_8.method7521(Static265.aClass203_3, Static580.aClass203_4);
			this.aClass13_Sub1_8.method7522(Static125.aClass326_1, 0);
			this.aClass13_Sub1_8.method7517(0, Static206.aClass326_3);
			for (@Pc(305) Class3 local305 = this.aClass338_75.method8177(); local305 != null; local305 = this.aClass338_75.method8168()) {
				@Pc(310) Class3_Sub38 local310 = (Class3_Sub38) local305;
				local310.method5212(arg0, arg2, arg6, arg4);
			}
			this.aClass13_Sub1_8.method7522(Static523.aClass326_5, 0);
			this.aClass13_Sub1_8.method7517(0, Static523.aClass326_5);
			this.aClass13_Sub1_8.method7530((Interface3) null);
			this.aClass13_Sub1_8.L(local241, local245, this.aClass13_Sub1_8.anInt8621);
		}
		if (this.aClass244_1 != null) {
			this.aClass13_Sub1_8.method7423(this.anInterface15_5, 0);
			this.aClass13_Sub1_8.method7423(this.anInterface15_4, 1);
			this.aClass13_Sub1_8.method7472(this.aClass233_8);
			this.aClass244_1.method5902(arg1, arg4, arg6, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ew", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray12[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray12[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2768(arg3, arg4, arg2, -1, arg1, arg5, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7974(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2999 <= 0) {
			return;
		}
		@Pc(19) Interface20 local19 = this.aClass13_Sub1_8.method7492(this.anInt2982);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7828();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass13_Sub1_8.method7409(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt9129 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray13[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local25 < local90) {
											local25 = local90;
										}
										local21++;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.b(local90);
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt9129 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray13[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local21++;
										if (local23 > local90) {
											local23 = local90;
										}
										if (local90 > local25) {
											local25 = local90;
										}
										local44.c(local90);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method7826()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass13_Sub1_8.method7500();
		this.aClass13_Sub1_8.method7536(false);
		this.aClass13_Sub1_8.method7465(false);
		this.aClass13_Sub1_8.method7482(false);
		this.aClass13_Sub1_8.method7505(false);
		this.aClass13_Sub1_8.method7440(0);
		this.aClass13_Sub1_8.method7508(false, -2, false);
		this.aClass13_Sub1_8.method7530((Interface3) null);
		@Pc(269) Class239_Sub3 local269 = this.aClass13_Sub1_8.method7480();
		@Pc(274) float[] local274 = this.aClass13_Sub1_8.method7469();
		local274[11] = 0.0F;
		local274[0] = (float) 1024 / ((float) super.anInt9123 * 128.0F * (float) this.aClass13_Sub1_8.anInt8516);
		local274[15] = 1.0F;
		local274[14] = -this.aFloat76 / (this.aFloat77 - this.aFloat76);
		local274[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass13_Sub1_8.anInt8556;
		local274[7] = 0.0F;
		local274[4] = 0.0F;
		local274[10] = 1.0F / (this.aFloat77 - this.aFloat76);
		local274[2] = 0.0F;
		local274[3] = 0.0F;
		local274[9] = 0.0F;
		local274[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass13_Sub1_8.anInt8516) - 1.0F;
		local274[5] = (float) 1024 / ((float) this.aClass13_Sub1_8.anInt8556 * (float) super.anInt9123 * 128.0F);
		local274[6] = 0.0F;
		local274[1] = 0.0F;
		local274[8] = 0.0F;
		local269.method9267(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass13_Sub1_8.method7444();
		this.aClass13_Sub1_8.method7515();
		if ((this.anInt2981 & 0x7) == 0) {
			this.aClass13_Sub1_8.method7465(false);
		} else {
			this.aClass13_Sub1_8.method7465(true);
			this.aClass13_Sub1_8.method7490();
		}
		this.aClass13_Sub1_8.method7531(false);
		this.aClass13_Sub1_8.method7423(this.anInterface15_5, 0);
		this.aClass13_Sub1_8.method7423(this.anInterface15_4, 1);
		this.aClass13_Sub1_8.method7472(this.aClass233_8);
		this.aClass13_Sub1_8.method7424(local21 / 3, 0, local19, local23, local25 + 1 - local23, Static413.aClass393_4);
		this.aClass13_Sub1_8.method7531(true);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
	@Override
	public void method7979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2768(arg3, arg4, arg2, arg5, arg1, arg6, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt2999 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9129 + 1][super.anInt9128 + 1];
			for (@Pc(19) int local19 = 1; local19 < super.anInt9129; local19++) {
				for (@Pc(23) int local23 = 1; local23 < super.anInt9128; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray12[local19][local23 + 1] >> 3) + (this.aByteArrayArray12[local19][local23 - 1] >> 2) + (this.aByteArrayArray12[local19 - -1][local23] >> 3) + (this.aByteArrayArray12[local19 - 1][local23] >> 2) + (this.aByteArrayArray12[local19][local23] >> 1));
				}
			}
			@Pc(99) Class3_Sub29[] local99 = new Class3_Sub29[this.aClass83_8.method2378()];
			this.aClass83_8.method2367(local99);
			for (@Pc(107) int local107 = 0; local107 < local99.length; local107++) {
				local99[local107].method3772(this.anInt2999);
			}
			@Pc(123) int local123 = 20;
			if (this.anIntArrayArrayArray12 != null) {
				local123 += 4;
			}
			if ((this.anInt2981 & 0x7) != 0) {
				local123 += 12;
			}
			@Pc(143) NativeHeapBuffer local143 = this.aClass13_Sub1_8.aNativeHeap5.a(this.anInt2999 * 4, false);
			@Pc(153) NativeHeapBuffer local153 = this.aClass13_Sub1_8.aNativeHeap5.a(local123 * this.anInt2999, false);
			@Pc(158) Stream local158 = new Stream(local153);
			@Pc(163) Stream local163 = new Stream(local143);
			@Pc(167) Class3_Sub29[] local167 = new Class3_Sub29[this.anInt2999];
			@Pc(174) int local174 = Static677.method9371(this.anInt2999 / 4);
			if (local174 < 1) {
				local174 = 1;
			}
			@Pc(186) Class83 local186 = new Class83(local174);
			@Pc(190) Class3_Sub29[] local190 = new Class3_Sub29[this.anInt2998];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; super.anInt9129 > local192; local192++) {
				for (local196 = 0; super.anInt9128 > local196; local196++) {
					if (this.anIntArrayArrayArray14[local192][local196] != null) {
						@Pc(212) Class3_Sub29[] local212 = this.aClass3_Sub29ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray9[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray13[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray10[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray14[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local192][local196];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(275) float local275 = this.aFloatArrayArray5[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray6[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray7[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray5[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray6[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray7[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray5[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray6[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray7[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray5[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray6[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray7[local192 + 1][local196];
						@Pc(384) int local384 = local17[local192][local196] & 0xFF;
						@Pc(394) int local394 = local17[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local17[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local17[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label357: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class3_Sub29 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local190[local428] == local426) {
									continue label357;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray13[super.anInt9129 * local196 + local192] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(486) int local486 = (local192 << super.anInt9125) + local219[local428];
							@Pc(496) int local496 = (local196 << super.anInt9125) + local226[local428];
							@Pc(501) int local501 = local486 >> this.anInt2996;
							@Pc(506) int local506 = local496 >> this.anInt2996;
							@Pc(510) int local510 = local240[local428];
							@Pc(514) int local514 = local233[local428];
							@Pc(522) int local522 = local252 == null ? 0 : local252[local428];
							@Pc(540) long local540 = (long) local514 << 48 | (long) local510 << 32 | (long) (local501 << 16) | (long) local506;
							@Pc(544) int local544 = local219[local428];
							@Pc(548) int local548 = local226[local428];
							@Pc(550) byte local550 = 74;
							@Pc(552) int local552 = 0;
							@Pc(564) float local564;
							@Pc(566) float local566;
							@Pc(568) float local568;
							@Pc(652) float local652;
							@Pc(572) int local572;
							if (local544 == 0 && local548 == 0) {
								local564 = local275;
								local566 = local282;
								local568 = local289;
								local572 = local550 - local384;
							} else if (local544 == 0 && super.anInt9123 == local548) {
								local568 = local316;
								local564 = local298;
								local572 = local550 - local394;
								local566 = local307;
							} else if (local544 == super.anInt9123 && local548 == super.anInt9123) {
								local566 = local338;
								local572 = local550 - local406;
								local564 = local327;
								local568 = local349;
							} else if (local544 == super.anInt9123 && local548 == 0) {
								local572 = local550 - local416;
								local566 = local367;
								local568 = local376;
								local564 = local358;
							} else {
								@Pc(628) float local628 = (float) local544 / (float) super.anInt9123;
								@Pc(635) float local635 = (float) local548 / (float) super.anInt9123;
								@Pc(643) float local643 = local275 + local628 * (local358 - local275);
								local652 = local282 + (local367 - local282) * local628;
								@Pc(660) float local660 = local289 + (local376 - local289) * local628;
								@Pc(668) float local668 = (local327 - local298) * local628 + local298;
								@Pc(676) float local676 = (local338 - local307) * local628 + local307;
								local566 = local635 * (local676 - local652) + local652;
								@Pc(692) float local692 = local628 * (local349 - local316) + local316;
								local564 = (local668 - local643) * local635 + local643;
								local568 = local635 * (local692 - local660) + local660;
								@Pc(721) int local721 = local384 + ((local416 - local384) * local544 >> super.anInt9125);
								@Pc(732) int local732 = local394 + ((local406 - local394) * local544 >> super.anInt9125);
								local572 = local550 - ((local732 - local721) * local548 >> super.anInt9125) - local721;
							}
							@Pc(772) float local772 = 1.0F;
							if (local510 != -1) {
								@Pc(784) int local784 = local572 * (local510 & 0x7F) >> 7;
								if (local784 < 2) {
									local784 = 2;
								} else if (local784 > 126) {
									local784 = 126;
								}
								if ((this.anInt2981 & 0x7) == 0) {
									local772 = this.aClass13_Sub1_8.aFloatArray72[2] * local568 + this.aClass13_Sub1_8.aFloatArray72[1] * local566 + local564 * this.aClass13_Sub1_8.aFloatArray72[0];
									local772 = local772 * (local772 > 0.0F ? this.aClass13_Sub1_8.aFloat183 : this.aClass13_Sub1_8.aFloat179) + this.aClass13_Sub1_8.aFloat172;
								}
								local552 = Static363.anIntArray518[local784 | local510 & 0xFF80];
							}
							@Pc(858) Class3 local858 = null;
							if ((this.anInt2988 - 1 & local486) == 0 && (local496 & this.anInt2988 - 1) == 0) {
								local858 = local186.method2368(local540);
							}
							@Pc(897) int local897;
							@Pc(955) int local955;
							if (local858 == null) {
								if (local510 == local514) {
									local955 = local552;
								} else {
									@Pc(933) int local933 = local572 * (local514 & 0x7F) >> 7;
									if (local933 < 2) {
										local933 = 2;
									} else if (local933 > 126) {
										local933 = 126;
									}
									local955 = Static363.anIntArray518[local933 | local514 & 0xFF80];
									if ((this.anInt2981 & 0x7) == 0) {
										@Pc(986) float local986 = this.aClass13_Sub1_8.aFloatArray72[1] * local566 + this.aClass13_Sub1_8.aFloatArray72[0] * local564 + this.aClass13_Sub1_8.aFloatArray72[2] * local568;
										local652 = this.aClass13_Sub1_8.aFloat172 + local772 * (local772 > 0.0F ? this.aClass13_Sub1_8.aFloat183 : this.aClass13_Sub1_8.aFloat179);
										@Pc(1011) int local1011 = local955 >> 16 & 0xFF;
										@Pc(1017) int local1017 = local955 >> 8 & 0xFF;
										local1011 = (int) ((float) local1011 * local652);
										@Pc(1027) int local1027 = local955 & 0xFF;
										local1017 = (int) ((float) local1017 * local652);
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										if (local1017 < 0) {
											local1017 = 0;
										} else if (local1017 > 255) {
											local1017 = 255;
										}
										local1027 = (int) ((float) local1027 * local652);
										if (local1027 < 0) {
											local1027 = 0;
										} else if (local1027 > 255) {
											local1027 = 255;
										}
										local955 = local1027 | local1017 << 8 | local1011 << 16;
									}
								}
								if (Stream.c()) {
									local158.b((float) local486);
									local158.b((float) (this.method7980(local496, local486) + local522));
									local158.b((float) local496);
									local158.b((float) local486);
									local158.b((float) local496);
									if (this.anIntArrayArrayArray12 != null) {
										local158.b((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt2981 & 0x7) != 0) {
										local158.b(local564);
										local158.b(local566);
										local158.b(local568);
									}
								} else {
									local158.a((float) local486);
									local158.a((float) (local522 + this.method7980(local496, local486)));
									local158.a((float) local496);
									local158.a((float) local486);
									local158.a((float) local496);
									if (this.anIntArrayArrayArray12 != null) {
										local158.a((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt2981 & 0x7) != 0) {
										local158.a(local564);
										local158.a(local566);
										local158.a(local568);
									}
								}
								if (this.aClass13_Sub1_8.anInt8623 == 0) {
									local163.f(local955 | 0xFF000000);
								} else {
									local163.d(local955 | 0xFF000000);
								}
								local897 = this.anInt2994++;
								local473[local428] = (short) local897;
								if (local510 != -1) {
									local167[local897] = local212[local428];
								}
								local186.method2377(local540, new Class3_Sub53(local473[local428]));
							} else {
								local473[local428] = ((Class3_Sub53) local858).aShort112;
								local897 = local473[local428] & 0xFFFF;
								if (local510 != -1 && local212[local428].aLong311 < local167[local897].aLong311) {
									local167[local897] = local212[local428];
								}
							}
							for (local955 = 0; local955 < local418; local955++) {
								local190[local955].method3777(local772, local572, local552, local897);
							}
							this.anInt2982++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt2994; local196++) {
				@Pc(1321) Class3_Sub29 local1321 = local167[local196];
				if (local1321 != null) {
					local1321.method3774(local196);
				}
			}
			@Pc(1342) int local1342;
			@Pc(1361) int local1361;
			for (@Pc(1338) int local1338 = 0; local1338 < super.anInt9129; local1338++) {
				for (local1342 = 0; super.anInt9128 > local1342; local1342++) {
					@Pc(1355) short[] local1355 = this.aShortArrayArray13[super.anInt9129 * local1342 + local1338];
					if (local1355 != null) {
						@Pc(1359) int local1359 = 0;
						local1361 = 0;
						while (local1355.length > local1361) {
							@Pc(1370) int local1370 = local1355[local1361++] & 0xFFFF;
							@Pc(1377) int local1377 = local1355[local1361++] & 0xFFFF;
							@Pc(1384) int local1384 = local1355[local1361++] & 0xFFFF;
							@Pc(1388) Class3_Sub29 local1388 = local167[local1370];
							@Pc(1392) Class3_Sub29 local1392 = local167[local1377];
							@Pc(1396) Class3_Sub29 local1396 = local167[local1384];
							@Pc(1398) Class3_Sub29 local1398 = null;
							if (local1388 != null) {
								local1398 = local1388;
								local1388.method3775(local1342, local1359, local1338);
							}
							if (local1392 != null) {
								local1392.method3775(local1342, local1359, local1338);
								if (local1398 == null || local1392.aLong311 < local1398.aLong311) {
									local1398 = local1392;
								}
							}
							if (local1396 != null) {
								local1396.method3775(local1342, local1359, local1338);
								if (local1398 == null || local1396.aLong311 < local1398.aLong311) {
									local1398 = local1396;
								}
							}
							if (local1398 != null) {
								if (local1388 != null) {
									local1398.method3774(local1370);
								}
								if (local1392 != null) {
									local1398.method3774(local1377);
								}
								if (local1396 != null) {
									local1398.method3774(local1384);
								}
								local1398.method3775(local1342, local1359, local1338);
							}
							local1359++;
						}
					}
				}
			}
			local158.a();
			local163.a();
			this.anInterface15_4 = this.aClass13_Sub1_8.method7541(false);
			this.anInterface15_4.method8745(this.anInt2994 * 4, 4, local143);
			this.anInterface15_5 = this.aClass13_Sub1_8.method7541(false);
			this.anInterface15_5.method8745(local123 * this.anInt2994, local123, local153);
			if ((this.anInt2981 & 0x7) == 0) {
				if (this.anIntArrayArrayArray12 == null) {
					this.aClass233_8 = this.aClass13_Sub1_8.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5 }), new Class298(Static205.aClass124_3) });
				} else {
					this.aClass233_8 = this.aClass13_Sub1_8.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5, Static205.aClass124_4 }), new Class298(Static205.aClass124_3) });
				}
			} else if (this.anIntArrayArrayArray12 == null) {
				this.aClass233_8 = this.aClass13_Sub1_8.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5, Static205.aClass124_2 }), new Class298(Static205.aClass124_3) });
			} else {
				this.aClass233_8 = this.aClass13_Sub1_8.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_5, Static205.aClass124_4, Static205.aClass124_2 }), new Class298(Static205.aClass124_3) });
			}
			local1342 = 0;
			for (@Pc(1693) int local1693 = 0; local1693 < local99.length; local1693++) {
				if (local99[local1693].anInt4145 > 0) {
					local99[local1342++] = local99[local1693];
				}
			}
			this.aClass3_Sub29Array1 = new Class3_Sub29[local1342];
			@Pc(1726) long[] local1726 = new long[local1342];
			for (local1361 = 0; local1361 < local1342; local1361++) {
				@Pc(1734) Class3_Sub29 local1734 = local99[local1361];
				local1726[local1361] = local1734.aLong311;
				this.aClass3_Sub29Array1[local1361] = local1734;
				local1734.method3773(this.anInt2994);
			}
			Static476.method6889(this.aClass3_Sub29Array1, local1726);
			if (this.aClass244_1 != null) {
				this.aClass244_1.method5897();
			}
		} else {
			this.aClass244_1 = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass83_8 = null;
		this.anIntArrayArrayArray14 = null;
		this.aByteArrayArray12 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass3_Sub29ArrayArrayArray1 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!ew", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub11_Sub3 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub11_Sub3 arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9123 >> this.aClass13_Sub1_8.anInt8595;
		@Pc(24) Class3_Sub11_Sub3_Sub1 local24 = (Class3_Sub11_Sub3_Sub1) arg2;
		@Pc(34) Class3_Sub11_Sub3_Sub1 local34;
		if (local24 != null && local24.method1751(local21, local21)) {
			local34 = local24;
			local24.method1748();
		} else {
			local34 = new Class3_Sub11_Sub3_Sub1(this.aClass13_Sub1_8, local21, local21);
		}
		local34.method1749(local21, 0, 0, local21);
		this.method2771(arg0, local34, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ew", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass13_Sub1_8.anInt8597 * arg2 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub1_8.anInt8596 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			this.aClass244_1.method5900(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!uca;[I)V")
	@Override
	public void method7975(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass338_75.method8171(new Class3_Sub38(this.aClass13_Sub1_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ew", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass13_Sub1_8.anInt8597 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub1_8.anInt8596 >> 8) >> this.aClass13_Sub1_8.anInt8595;
			this.aClass244_1.method5903(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILclient!de;I)V")
	private void method2771(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static22.anIntArray217.length) {
			Static22.anIntArray217 = new int[local22];
			Static550.anIntArray762 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static22.anIntArray217[local34] = local12[local34] >> this.aClass13_Sub1_8.anInt8595;
			Static550.anIntArray762[local34] = local19[local34] >> this.aClass13_Sub1_8.anInt8595;
		}
		@Pc(66) int local66 = 0;
		while (local22 > local66) {
			@Pc(72) int local72 = Static22.anIntArray217[local66];
			@Pc(77) int local77 = Static550.anIntArray762[local66++];
			@Pc(81) int local81 = Static22.anIntArray217[local66];
			@Pc(86) int local86 = Static550.anIntArray762[local66++];
			@Pc(90) int local90 = Static22.anIntArray217[local66];
			@Pc(95) int local95 = Static550.anIntArray762[local66++];
			if ((local86 - local95) * (local72 - local81) - (local86 - local77) * (-local81 + local90) > 0) {
				arg1.method1745(local90, local72, local86, local77, local81, local95);
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface4 local9 = this.aClass13_Sub1_8.anInterface4_14;
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt9129][super.anInt9128][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9129][super.anInt9128][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray14[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub29[] local92 = this.aClass3_Sub29ArrayArrayArray1[arg0][arg1] = new Class3_Sub29[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt2981 & 0x20) != 0 && local100 != -1 && local9.method4673(local100).aBoolean291) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local104 << 14) | (long) local100;
			@Pc(154) Class3 local154;
			for (local154 = this.aClass83_8.method2368(local148); local154 != null; local154 = this.aClass83_8.method2373()) {
				@Pc(159) Class3_Sub29 local159 = (Class3_Sub29) local154;
				if (local100 == local159.anInt4137 && (float) local104 == local159.aFloat90 && arg10 == local159.anInt4140 && local159.anInt4147 == arg11 && local159.anInt4135 == arg12) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class3_Sub29(this, local100, local104, arg10, arg11, arg12);
				this.aClass83_8.method2377(local148, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub29) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray11[arg0][arg1] = (byte) (this.aByteArrayArray11[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2998) {
			this.anInt2998 = arg6.length;
		}
		this.anInt2999 += arg6.length;
	}
}
