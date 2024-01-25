import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class83_Sub3 extends Class83 {

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
	private int anInt8842;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
	private int anInt8844;

	@OriginalMember(owner = "client!sm", name = "ab", descriptor = "Lclient!rba;")
	public Class284 aClass284_12;

	@OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
	private int anInt8853;

	@OriginalMember(owner = "client!sm", name = "cb", descriptor = "[Lclient!ut;")
	private Class4_Sub48[] aClass4_Sub48Array1;

	@OriginalMember(owner = "client!sm", name = "db", descriptor = "Lclient!ew;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!sm", name = "eb", descriptor = "Lclient!rba;")
	public Class284 aClass284_13;

	@OriginalMember(owner = "client!sm", name = "fb", descriptor = "Lclient!rba;")
	private Class284 aClass284_14;

	@OriginalMember(owner = "client!sm", name = "hb", descriptor = "Lclient!rba;")
	public Class284 aClass284_15;

	@OriginalMember(owner = "client!sm", name = "kb", descriptor = "I")
	private int anInt8854;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "Lclient!oe;")
	private final Class244 aClass244_56 = new Class244();

	@OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
	private final int anInt8848 = this.anInt8825 - 2;

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "Lclient!kga;")
	public final Class44_Sub3 aClass44_Sub3_38;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
	private final int anInt8847;

	@OriginalMember(owner = "client!sm", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sm", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!sm", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
	public final int anInt8852;

	@OriginalMember(owner = "client!sm", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!sm", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!sm", name = "Z", descriptor = "[[[Lclient!ut;")
	private Class4_Sub48[][][] aClass4_Sub48ArrayArrayArray1;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!sm", name = "mb", descriptor = "Lclient!waa;")
	private Class350 aClass350_38;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!cu;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!kga;IIII[[I[[II)V")
	public Class83_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass44_Sub3_38 = arg0;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anInt8847 = 0x1 << this.anInt8848;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.aFloatArrayArray13 = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.anInt8852 = arg2;
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		this.lb = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.aClass4_Sub48ArrayArrayArray1 = new Class4_Sub48[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aByteArrayArray21 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; super.anInt8830 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt8829 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * 4 * arg7 + local138 * local138)));
				this.aFloatArrayArray12[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray13[local119][local115] = local174 * (float) (-arg7 * 2);
				this.lb[local119][local115] = local174 * (float) local155;
			}
		}
		this.aClass350_38 = new Class350(128);
		if ((this.anInt8852 & 0x10) != 0) {
			this.aClass55_2 = new Class55(this.aClass44_Sub3_38, this);
		}
	}

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub5_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub6 arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8824 >> this.aClass44_Sub3_38.anInt5470;
		@Pc(24) Class4_Sub5_Sub6_Sub2 local24 = (Class4_Sub5_Sub6_Sub2) arg2;
		@Pc(34) Class4_Sub5_Sub6_Sub2 local34;
		if (local24 != null && local24.method7482(local21, local21)) {
			local34 = local24;
			local24.method7484();
		} else {
			local34 = new Class4_Sub5_Sub6_Sub2(this.aClass44_Sub3_38, local21, local21);
		}
		local34.method7486(0, local21, 0, local21);
		this.method7222(arg1, arg0, local34);
		return local34;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7219(arg5, arg4, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ul;[I)V")
	@Override
	public void method7211(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_56.method5960(new Class4_Sub29(this.aClass44_Sub3_38, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7207(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8853 <= 0) {
			return;
		}
		this.aClass44_Sub3_38.method4646();
		this.aClass44_Sub3_38.method4616(false);
		this.aClass44_Sub3_38.method4642(false);
		this.aClass44_Sub3_38.method4625(false);
		this.aClass44_Sub3_38.method4604(false);
		this.aClass44_Sub3_38.method4669(0);
		this.aClass44_Sub3_38.method4661(-2);
		this.aClass44_Sub3_38.method4605(null);
		Static431.aFloatArray57[14] = 0.0F;
		Static431.aFloatArray57[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass44_Sub3_38.anInt5313) - 1.0F;
		Static431.aFloatArray57[2] = 0.0F;
		Static431.aFloatArray57[4] = 0.0F;
		Static431.aFloatArray57[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass44_Sub3_38.anInt5285;
		Static431.aFloatArray57[3] = 0.0F;
		Static431.aFloatArray57[9] = 0.0F;
		Static431.aFloatArray57[5] = (float) 1024 / ((float) super.anInt8824 * 128.0F * (float) this.aClass44_Sub3_38.anInt5285);
		Static431.aFloatArray57[7] = 0.0F;
		Static431.aFloatArray57[8] = 0.0F;
		Static431.aFloatArray57[0] = (float) 1024 / ((float) super.anInt8824 * 128.0F * (float) this.aClass44_Sub3_38.anInt5313);
		Static431.aFloatArray57[11] = 0.0F;
		Static431.aFloatArray57[15] = 1.0F;
		Static431.aFloatArray57[6] = 0.0F;
		Static431.aFloatArray57[1] = 0.0F;
		Static431.aFloatArray57[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static431.aFloatArray57, 0);
		Static431.aFloatArray57[14] = 0.0F;
		Static431.aFloatArray57[3] = 0.0F;
		Static431.aFloatArray57[15] = 1.0F;
		Static431.aFloatArray57[5] = 0.0F;
		Static431.aFloatArray57[9] = 1.0F;
		Static431.aFloatArray57[12] = 0.0F;
		Static431.aFloatArray57[11] = 0.0F;
		Static431.aFloatArray57[0] = 1.0F;
		Static431.aFloatArray57[1] = 0.0F;
		Static431.aFloatArray57[4] = 0.0F;
		Static431.aFloatArray57[7] = 0.0F;
		Static431.aFloatArray57[10] = 0.0F;
		Static431.aFloatArray57[13] = 0.0F;
		Static431.aFloatArray57[8] = 0.0F;
		Static431.aFloatArray57[2] = 0.0F;
		Static431.aFloatArray57[6] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static431.aFloatArray57, 0);
		if ((this.anInt8852 & 0x7) == 0) {
			this.aClass44_Sub3_38.method4642(false);
		} else {
			this.aClass44_Sub3_38.method4642(true);
			this.aClass44_Sub3_38.method4613();
		}
		this.aClass44_Sub3_38.method4633(this.aClass284_13, this.aClass284_15, this.aClass284_12, this.aClass284_14);
		if (this.anInt8842 * 2 <= this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2.aByteArray68.length) {
			this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2.anInt5831 = 0;
		} else {
			this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(this.anInt8842 * 2);
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class4_Sub11_Sub2 local318 = this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass44_Sub3_38.aBoolean399) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + super.anInt8829 * local324;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local318.method4937(local354[local358] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + local324 * super.anInt8829;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method4912(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(462) Class21_Sub2 local462 = new Class21_Sub2(this.aClass44_Sub3_38, 5123, local318.aByteArray68, local318.anInt5831);
			this.aClass44_Sub3_38.method4657(local314, 0, local462);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7212(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass55_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass44_Sub3_38.anInt5515 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			@Pc(39) int local39 = arg3 - (this.aClass44_Sub3_38.anInt5512 * arg2 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			return this.aClass55_2.method1243(local39, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZB[[ZIII)V")
	private void method7219(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass4_Sub48Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg4 + arg4 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > this.aClass44_Sub3_38.anIntArray267.length) {
			this.aClass44_Sub3_38.anIntArray267 = new int[local15];
		}
		if (this.anInt8842 * 2 > this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2.aByteArray68.length) {
			this.aClass44_Sub3_38.aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(this.anInt8842 * 2);
		}
		@Pc(59) int local59 = arg5 - arg4;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(70) int local70 = arg3 - arg4;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(83) int local83 = arg4 + arg5;
		if (local83 > super.anInt8829 - 1) {
			local83 = super.anInt8829 - 1;
		}
		@Pc(98) int local98 = arg3 + arg4;
		if (local98 > super.anInt8830 - 1) {
			local98 = super.anInt8830 - 1;
		}
		@Pc(111) int local111 = 0;
		@Pc(115) int[] local115 = this.aClass44_Sub3_38.anIntArray267;
		@Pc(128) int local128;
		for (@Pc(117) int local117 = local59; local117 <= local83; local117++) {
			@Pc(126) boolean[] local126 = arg2[local117 - local61];
			for (local128 = local70; local128 <= local98; local128++) {
				if (local126[local128 - local72]) {
					local115[local111++] = local117 + super.anInt8829 * local128;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass44_Sub3_38.method4615();
		} else {
			this.aClass44_Sub3_38.method4629((float) arg0);
			this.aClass44_Sub3_38.method4644();
		}
		this.aClass44_Sub3_38.method4642((this.anInt8852 & 0x7) != 0);
		for (@Pc(189) int local189 = 0; local189 < this.aClass4_Sub48Array1.length; local189++) {
			this.aClass4_Sub48Array1[local189].method7888(local115, local111);
		}
		if (!this.aClass244_56.method5961()) {
			local128 = this.aClass44_Sub3_38.anInt5505;
			@Pc(222) int local222 = this.aClass44_Sub3_38.anInt5503;
			this.aClass44_Sub3_38.pa(0, local222, this.aClass44_Sub3_38.anInt5509);
			this.aClass44_Sub3_38.method4642(false);
			this.aClass44_Sub3_38.method4604(false);
			this.aClass44_Sub3_38.method4669(128);
			this.aClass44_Sub3_38.method4661(-2);
			this.aClass44_Sub3_38.method4605(this.aClass44_Sub3_38.aClass77_Sub1_2);
			this.aClass44_Sub3_38.method4621(8448, 7681);
			this.aClass44_Sub3_38.method4641(770, 0, 34166);
			this.aClass44_Sub3_38.method4611(34167, 0);
			for (@Pc(282) Class4 local282 = this.aClass244_56.method5963(); local282 != null; local282 = this.aClass244_56.method5965()) {
				@Pc(287) Class4_Sub29 local287 = (Class4_Sub29) local282;
				local287.method5760(arg2, arg4, arg5, arg3);
			}
			this.aClass44_Sub3_38.method4641(768, 0, 5890);
			this.aClass44_Sub3_38.method4611(5890, 0);
			this.aClass44_Sub3_38.method4605(null);
			this.aClass44_Sub3_38.pa(local128, local222, this.aClass44_Sub3_38.anInt5509);
		}
		if (this.aClass55_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass44_Sub3_38.method4633(null, this.aClass284_15, this.aClass284_12, null);
		this.aClass55_2.method1245(arg3, arg1, arg2, arg5, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!sm", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass55_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass44_Sub3_38.anInt5515 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			@Pc(39) int local39 = arg3 - (this.aClass44_Sub3_38.anInt5512 * arg2 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			this.aClass55_2.method1244(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass55_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass44_Sub3_38.anInt5515 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass44_Sub3_38.anInt5512 >> 8) >> this.aClass44_Sub3_38.anInt5470;
			this.aClass55_2.method1240(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!sm", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt8853 <= 0) {
			this.aClass55_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt8829 + 1][super.anInt8830 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; super.anInt8829 > local25; local25++) {
				for (local29 = 1; local29 < super.anInt8830; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray22[local25][local29 - 1] >> 2) + (this.aByteArrayArray22[local25 + 1][local29] >> 3) + (this.aByteArrayArray22[local25 + -1][local29] >> 2) + (this.aByteArrayArray22[local25][local29 + 1] >> 3) + (this.aByteArrayArray22[local25][local29] >> 1));
				}
			}
			this.aClass4_Sub48Array1 = new Class4_Sub48[this.aClass350_38.method8202()];
			this.aClass350_38.method8204(this.aClass4_Sub48Array1);
			for (local29 = 0; local29 < this.aClass4_Sub48Array1.length; local29++) {
				this.aClass4_Sub48Array1[local29].method7889(this.anInt8853);
			}
			@Pc(141) int local141 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local141 += 4;
			}
			if ((this.anInt8852 & 0x7) != 0) {
				local141 += 12;
			}
			@Pc(164) NativeHeapBuffer local164 = this.aClass44_Sub3_38.aNativeHeap6.a(local141 * this.anInt8853, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(173) Class4_Sub48[] local173 = new Class4_Sub48[this.anInt8853];
			@Pc(180) int local180 = Static563.method8072(this.anInt8853 / 4);
			if (local180 < 1) {
				local180 = 1;
			}
			@Pc(192) Class350 local192 = new Class350(local180);
			@Pc(196) Class4_Sub48[] local196 = new Class4_Sub48[this.anInt8854];
			@Pc(202) int local202;
			for (@Pc(198) int local198 = 0; local198 < super.anInt8829; local198++) {
				for (local202 = 0; super.anInt8830 > local202; local202++) {
					if (this.anIntArrayArrayArray15[local198][local202] != null) {
						@Pc(218) Class4_Sub48[] local218 = this.aClass4_Sub48ArrayArrayArray1[local198][local202];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray17[local198][local202];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray18[local198][local202];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray16[local198][local202];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray15[local198][local202];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local198][local202];
						if (local239 == null) {
							local239 = local246;
						}
						@Pc(274) int[] local274 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local198][local202];
						@Pc(281) float local281 = this.aFloatArrayArray12[local198][local202];
						@Pc(288) float local288 = this.aFloatArrayArray13[local198][local202];
						@Pc(295) float local295 = this.lb[local198][local202];
						@Pc(304) float local304 = this.aFloatArrayArray12[local198][local202 + 1];
						@Pc(313) float local313 = this.aFloatArrayArray13[local198][local202 + 1];
						@Pc(322) float local322 = this.lb[local198][local202 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray12[local198 + 1][local202 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray13[local198 + 1][local202 + 1];
						@Pc(355) float local355 = this.lb[local198 + 1][local202 + 1];
						@Pc(364) float local364 = this.aFloatArrayArray12[local198 + 1][local202];
						@Pc(373) float local373 = this.aFloatArrayArray13[local198 + 1][local202];
						@Pc(382) float local382 = this.lb[local198 + 1][local202];
						@Pc(390) int local390 = local23[local198][local202] & 0xFF;
						@Pc(400) int local400 = local23[local198][local202 + 1] & 0xFF;
						@Pc(412) int local412 = local23[local198 + 1][local202 + 1] & 0xFF;
						@Pc(422) int local422 = local23[local198 + 1][local202] & 0xFF;
						@Pc(424) int local424 = 0;
						@Pc(434) int local434;
						label335: for (@Pc(426) int local426 = 0; local426 < local246.length; local426++) {
							@Pc(432) Class4_Sub48 local432 = local218[local426];
							for (local434 = 0; local434 < local424; local434++) {
								if (local432 == local196[local434]) {
									continue label335;
								}
							}
							local196[local424++] = local432;
						}
						@Pc(475) short[] local475 = this.aShortArrayArray10[local198 + local202 * super.anInt8829] = new short[local246.length];
						for (local434 = 0; local434 < local246.length; local434++) {
							@Pc(488) int local488 = (local198 << super.anInt8825) + local225[local434];
							@Pc(498) int local498 = (local202 << super.anInt8825) + local232[local434];
							@Pc(503) int local503 = local488 >> this.anInt8848;
							@Pc(508) int local508 = local498 >> this.anInt8848;
							@Pc(512) int local512 = local246[local434];
							@Pc(516) int local516 = local239[local434];
							@Pc(524) int local524 = local258 == null ? 0 : local258[local434];
							@Pc(542) long local542 = (long) (local503 << 16) | (long) local516 << 48 | (long) local512 << 32 | (long) local508;
							@Pc(546) int local546 = local225[local434];
							@Pc(550) int local550 = local232[local434];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(581) float local581;
							@Pc(587) float local587;
							@Pc(589) float local589;
							@Pc(631) float local631;
							@Pc(585) int local585;
							if (local546 == 0 && local550 == 0) {
								local581 = local281;
								local585 = local552 - local390;
								local589 = local295;
								local587 = local288;
							} else if (local546 == 0 && super.anInt8824 == local550) {
								local587 = local313;
								local585 = local552 - local400;
								local589 = local322;
								local581 = local304;
							} else if (local546 == super.anInt8824 && local550 == super.anInt8824) {
								local581 = local333;
								local585 = local552 - local412;
								local587 = local344;
								local589 = local355;
							} else if (super.anInt8824 == local546 && local550 == 0) {
								local587 = local373;
								local581 = local364;
								local589 = local382;
								local585 = local552 - local422;
							} else {
								@Pc(608) float local608 = (float) local546 / (float) super.anInt8824;
								@Pc(615) float local615 = (float) local550 / (float) super.anInt8824;
								@Pc(623) float local623 = local281 + (local364 - local281) * local608;
								local631 = local288 + (local373 - local288) * local608;
								@Pc(639) float local639 = local295 + local608 * (local382 - local295);
								@Pc(648) float local648 = local304 + local608 * (local333 - local304);
								@Pc(656) float local656 = local313 + (local344 - local313) * local608;
								@Pc(665) float local665 = local608 * (local355 - local322) + local322;
								local587 = local631 + local615 * (local656 - local631);
								local581 = local623 + local615 * (local648 - local623);
								local589 = local639 + local615 * (local665 - local639);
								@Pc(703) int local703 = local390 + (local546 * (local422 - local390) >> super.anInt8825);
								@Pc(714) int local714 = (local546 * (local412 - local400) >> super.anInt8825) + local400;
								local585 = local552 - local703 - ((local714 - local703) * local550 >> super.anInt8825);
							}
							@Pc(766) float local766 = 1.0F;
							if (local512 != -1) {
								@Pc(777) int local777 = (local512 & 0x7F) * local585 >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								local554 = Static15.anIntArray11[local512 & 0xFF80 | local777];
								if ((this.anInt8852 & 0x7) == 0) {
									local766 = local589 * this.aClass44_Sub3_38.aFloatArray41[2] + local581 * this.aClass44_Sub3_38.aFloatArray41[0] + this.aClass44_Sub3_38.aFloatArray41[1] * local587;
									local766 = this.aClass44_Sub3_38.aFloat163 + (local766 > 0.0F ? this.aClass44_Sub3_38.aFloat181 : this.aClass44_Sub3_38.aFloat166) * local766;
								}
							}
							@Pc(853) Class4 local853 = null;
							if ((this.anInt8847 - 1 & local488) == 0 && (this.anInt8847 - 1 & local498) == 0) {
								local853 = local192.method8207(local542);
							}
							@Pc(889) int local889;
							@Pc(946) int local946;
							if (local853 == null) {
								if (local512 == local516) {
									local946 = local554;
								} else {
									@Pc(922) int local922 = local585 * (local516 & 0x7F) >> 7;
									if (local922 < 2) {
										local922 = 2;
									} else if (local922 > 126) {
										local922 = 126;
									}
									local946 = Static15.anIntArray11[local516 & 0xFF80 | local922];
									if ((this.anInt8852 & 0x7) == 0) {
										local631 = this.aClass44_Sub3_38.aFloatArray41[2] * local589 + this.aClass44_Sub3_38.aFloatArray41[0] * local581 + this.aClass44_Sub3_38.aFloatArray41[1] * local587;
										local631 = this.aClass44_Sub3_38.aFloat163 + local766 * (local766 > 0.0F ? this.aClass44_Sub3_38.aFloat181 : this.aClass44_Sub3_38.aFloat166);
										@Pc(1002) int local1002 = local946 >> 16 & 0xFF;
										@Pc(1008) int local1008 = local946 >> 8 & 0xFF;
										local1002 = (int) ((float) local1002 * local631);
										@Pc(1018) int local1018 = local946 & 0xFF;
										local1008 = (int) ((float) local1008 * local631);
										if (local1002 < 0) {
											local1002 = 0;
										} else if (local1002 > 255) {
											local1002 = 255;
										}
										if (local1008 < 0) {
											local1008 = 0;
										} else if (local1008 > 255) {
											local1008 = 255;
										}
										local1018 = (int) ((float) local1018 * local631);
										if (local1018 < 0) {
											local1018 = 0;
										} else if (local1018 > 255) {
											local1018 = 255;
										}
										local946 = local1018 | local1002 << 16 | local1008 << 8;
									}
								}
								if (this.aClass44_Sub3_38.aBoolean399) {
									local169.b((float) local488);
									local169.b((float) (this.method7213(local488, local498) + local524));
									local169.b((float) local498);
									local169.d((byte) (local946 >> 16));
									local169.d((byte) (local946 >> 8));
									local169.d((byte) local946);
									local169.d(-1);
									local169.b((float) local488);
									local169.b((float) local498);
									if (this.anIntArrayArrayArray14 != null) {
										local169.b((float) (local274 == null ? 0 : local274[local434] - 1));
									}
									if ((this.anInt8852 & 0x7) != 0) {
										local169.b(local581);
										local169.b(local587);
										local169.b(local589);
									}
								} else {
									local169.a((float) local488);
									local169.a((float) (local524 + this.method7213(local488, local498)));
									local169.a((float) local498);
									local169.d((byte) (local946 >> 16));
									local169.d((byte) (local946 >> 8));
									local169.d((byte) local946);
									local169.d(-1);
									local169.a((float) local488);
									local169.a((float) local498);
									if (this.anIntArrayArrayArray14 != null) {
										local169.a((float) (local274 == null ? 0 : local274[local434] - 1));
									}
									if ((this.anInt8852 & 0x7) != 0) {
										local169.a(local581);
										local169.a(local587);
										local169.a(local589);
									}
								}
								local889 = this.anInt8844++;
								local475[local434] = (short) local889;
								if (local512 != -1) {
									local173[local889] = local218[local434];
								}
								local192.method8199(local542, new Class4_Sub30(local475[local434]));
							} else {
								local475[local434] = ((Class4_Sub30) local853).aShort82;
								local889 = local475[local434] & 0xFFFF;
								if (local512 != -1 && local173[local889].aLong268 > local218[local434].aLong268) {
									local173[local889] = local218[local434];
								}
							}
							for (local946 = 0; local946 < local424; local946++) {
								local196[local946].method7886(local585, local889, local766, local554);
							}
							this.anInt8842++;
						}
					}
				}
			}
			for (local202 = 0; local202 < this.anInt8844; local202++) {
				@Pc(1327) Class4_Sub48 local1327 = local173[local202];
				if (local1327 != null) {
					local1327.method7884(local202);
				}
			}
			@Pc(1360) int local1360;
			for (@Pc(1340) int local1340 = 0; local1340 < super.anInt8829; local1340++) {
				for (@Pc(1344) int local1344 = 0; super.anInt8830 > local1344; local1344++) {
					@Pc(1356) short[] local1356 = this.aShortArrayArray10[local1340 + super.anInt8829 * local1344];
					if (local1356 != null) {
						local1360 = 0;
						@Pc(1362) int local1362 = 0;
						while (local1362 < local1356.length) {
							@Pc(1371) int local1371 = local1356[local1362++] & 0xFFFF;
							@Pc(1378) int local1378 = local1356[local1362++] & 0xFFFF;
							@Pc(1385) int local1385 = local1356[local1362++] & 0xFFFF;
							@Pc(1389) Class4_Sub48 local1389 = local173[local1371];
							@Pc(1393) Class4_Sub48 local1393 = local173[local1378];
							@Pc(1397) Class4_Sub48 local1397 = local173[local1385];
							@Pc(1399) Class4_Sub48 local1399 = null;
							if (local1389 != null) {
								local1399 = local1389;
								local1389.method7885(local1360, local1344, local1340);
							}
							if (local1393 != null) {
								local1393.method7885(local1360, local1344, local1340);
								if (local1399 == null || local1393.aLong268 < local1399.aLong268) {
									local1399 = local1393;
								}
							}
							if (local1397 != null) {
								local1397.method7885(local1360, local1344, local1340);
								if (local1399 == null || local1399.aLong268 > local1397.aLong268) {
									local1399 = local1397;
								}
							}
							if (local1399 != null) {
								if (local1389 != null) {
									local1399.method7884(local1371);
								}
								if (local1393 != null) {
									local1399.method7884(local1378);
								}
								if (local1397 != null) {
									local1399.method7884(local1385);
								}
								local1399.method7885(local1360, local1344, local1340);
							}
							local1360++;
						}
					}
				}
			}
			local169.a();
			this.anInterface10_7 = this.aClass44_Sub3_38.method4607(local169.c(), local141, local164);
			this.aClass284_15 = new Class284(this.anInterface10_7, 5126, 3, 0);
			this.aClass284_14 = new Class284(this.anInterface10_7, 5121, 4, 12);
			@Pc(1540) byte local1540;
			if (this.anIntArrayArrayArray14 == null) {
				local1540 = 24;
				this.aClass284_12 = new Class284(this.anInterface10_7, 5126, 2, 16);
			} else {
				this.aClass284_12 = new Class284(this.anInterface10_7, 5126, 3, 16);
				local1540 = 28;
			}
			if ((this.anInt8852 & 0x7) != 0) {
				this.aClass284_13 = new Class284(this.anInterface10_7, 5126, 3, local1540);
			}
			@Pc(1584) long[] local1584 = new long[this.aClass4_Sub48Array1.length];
			for (local1360 = 0; local1360 < this.aClass4_Sub48Array1.length; local1360++) {
				@Pc(1593) Class4_Sub48 local1593 = this.aClass4_Sub48Array1[local1360];
				local1584[local1360] = local1593.aLong268;
				local1593.method7891(this.anInt8844);
			}
			Static553.method8012(this.aClass4_Sub48Array1, local1584);
			if (this.aClass55_2 != null) {
				this.aClass55_2.method1239();
			}
		}
		this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.lb = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass350_38 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass4_Sub48ArrayArrayArray1 = null;
		this.aByteArrayArray22 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray18 = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7219(-1, arg4, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	@Override
	public void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt8829][super.anInt8830][];
		}
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt8829][super.anInt8830][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray16[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub48[] local88 = this.aClass4_Sub48ArrayArrayArray1[arg0][arg1] = new Class4_Sub48[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass350_38.method8207(local119); local125 != null; local125 = this.aClass350_38.method8200()) {
				@Pc(130) Class4_Sub48 local130 = (Class4_Sub48) local125;
				if (local130.anInt9652 == arg8[local90] && (float) arg9[local90] == local130.aFloat222 && arg10 == local130.anInt9654 && arg11 == local130.anInt9655 && arg12 == local130.anInt9649) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub48(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass350_38.method8199(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub48) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray21[arg0][arg1] = (byte) (this.aByteArrayArray21[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8854) {
			this.anInt8854 = arg6.length;
		}
		this.anInt8853 += arg6.length;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILclient!tm;)V")
	private void method7222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub6_Sub2 arg2) {
		@Pc(16) int[] local16 = this.anIntArrayArrayArray17[arg1][arg0];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(26) int local26 = local16.length;
		if (local26 > this.aClass44_Sub3_38.anIntArray266.length) {
			this.aClass44_Sub3_38.anIntArray265 = new int[local26];
			this.aClass44_Sub3_38.anIntArray266 = new int[local26];
		}
		@Pc(50) int[] local50 = this.aClass44_Sub3_38.anIntArray266;
		@Pc(54) int[] local54 = this.aClass44_Sub3_38.anIntArray265;
		for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
			local50[local56] = local16[local56] >> this.aClass44_Sub3_38.anInt5470;
			local54[local56] = local23[local56] >> this.aClass44_Sub3_38.anInt5470;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local26) {
			@Pc(90) int local90 = local50[local84];
			@Pc(95) int local95 = local54[local84++];
			@Pc(99) int local99 = local50[local84];
			@Pc(104) int local104 = local54[local84++];
			@Pc(108) int local108 = local50[local84];
			@Pc(113) int local113 = local54[local84++];
			if (-((local104 - local95) * (-local99 + local108)) + (local90 - local99) * (local104 + -local113) > 0) {
				arg2.method7481(local99, local95, local108, local90, local104, local113);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray22[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}
}
