import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "I")
	private int anInt8928;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "I")
	private int anInt8930;

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!ei;")
	public Class91 aClass91_10;

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "Lclient!ei;")
	public Class91 aClass91_11;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!ei;")
	public Class91 aClass91_12;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	private int anInt8932;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "[Lclient!mt;")
	private Class14_Sub36[] aClass14_Sub36Array1;

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "Lclient!gda;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "Lclient!ei;")
	private Class91 aClass91_13;

	@OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
	private int anInt8933;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Lclient!ok;")
	private final Class262 aClass262_61 = new Class262();

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!qfa;")
	public final Class137_Sub3 aClass137_Sub3_37;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "I")
	private final int anInt8923;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "[[B")
	private final byte[][] aByteArrayArray39;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt8913;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "[[[Lclient!mt;")
	private Class14_Sub36[][][] aClass14_Sub36ArrayArrayArray1;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "I")
	public final int anInt8924;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "[[B")
	private byte[][] aByteArrayArray40;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!jo;")
	private Class187 aClass187_67;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!lea;")
	private Class210 aClass210_2;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!qfa;IIII[[I[[II)V")
	public Class51_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass137_Sub3_37 = arg0;
		this.anInt8923 = super.anInt9507 - 2;
		this.aByteArrayArray39 = new byte[arg3][arg4];
		this.anInt8913 = 0x1 << this.anInt8923;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aClass14_Sub36ArrayArrayArray1 = new Class14_Sub36[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.aFloatArrayArray14 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.aShortArrayArray17 = new short[arg3 * arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt8924 = arg2;
		this.aByteArrayArray40 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt9512 > local115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9511; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray14[local119][local115] = local174 * (float) local138;
				this.aFloatArrayArray16[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray15[local119][local115] = local174 * (float) local155;
			}
		}
		this.aClass187_67 = new Class187(128);
		if ((this.anInt8924 & 0x10) != 0) {
			this.aClass210_2 = new Class210(this.aClass137_Sub3_37, this);
		}
	}

	@OriginalMember(owner = "client!re", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class14_Sub3_Sub14 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub3_Sub14 arg2) {
		if ((this.aByteArrayArray39[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9506 >> this.aClass137_Sub3_37.anInt8545;
		@Pc(24) Class14_Sub3_Sub14_Sub2 local24 = (Class14_Sub3_Sub14_Sub2) arg2;
		@Pc(40) Class14_Sub3_Sub14_Sub2 local40;
		if (local24 != null && local24.method8719(local21, local21)) {
			local40 = local24;
			local24.method8716();
		} else {
			local40 = new Class14_Sub3_Sub14_Sub2(this.aClass137_Sub3_37, local21, local21);
		}
		local40.method8718(local21, 0, 0, local21);
		this.method7388(local40, arg0, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!re", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass210_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass137_Sub3_37.anInt8585 * arg2 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass137_Sub3_37.anInt8564 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			this.aClass210_2.method5129(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7389(arg3, arg4, arg6, arg5, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	@Override
	public void method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!vba;II)V")
	private void method7388(@OriginalArg(1) Class14_Sub3_Sub14_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray13[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray14[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass137_Sub3_37.anIntArray632.length) {
			this.aClass137_Sub3_37.anIntArray633 = new int[local22];
			this.aClass137_Sub3_37.anIntArray632 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass137_Sub3_37.anIntArray632;
		@Pc(46) int[] local46 = this.aClass137_Sub3_37.anIntArray633;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass137_Sub3_37.anInt8545;
			local46[local48] = local19[local48] >> this.aClass137_Sub3_37.anInt8545;
		}
		@Pc(76) int local76 = 0;
		while (local76 < local22) {
			@Pc(82) int local82 = local42[local76];
			@Pc(87) int local87 = local46[local76++];
			@Pc(91) int local91 = local42[local76];
			@Pc(96) int local96 = local46[local76++];
			@Pc(100) int local100 = local42[local76];
			@Pc(105) int local105 = local46[local76++];
			if (-((local100 - local91) * (-local87 + local96)) + (local96 - local105) * (local82 + -local91) > 0) {
				arg0.method8717(local82, local87, local100, local105, local96, local91);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([[ZZIIIIII)V")
	private void method7389(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass14_Sub36Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg6 + arg6 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass137_Sub3_37.anIntArray634.length < local14) {
			this.aClass137_Sub3_37.anIntArray634 = new int[local14];
		}
		if (this.anInt8928 * 2 > this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2.aByteArray84.length) {
			this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2 = new Class14_Sub29_Sub2(this.anInt8928 * 2);
		}
		@Pc(54) int local54 = arg5 - arg6;
		@Pc(56) int local56 = local54;
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(68) int local68 = arg4 - arg6;
		@Pc(70) int local70 = local68;
		if (local68 < 0) {
			local68 = 0;
		}
		@Pc(78) int local78 = arg6 + arg5;
		if (super.anInt9511 - 1 < local78) {
			local78 = super.anInt9511 - 1;
		}
		@Pc(93) int local93 = arg6 + arg4;
		if (super.anInt9512 - 1 < local93) {
			local93 = super.anInt9512 - 1;
		}
		@Pc(110) int local110 = 0;
		@Pc(114) int[] local114 = this.aClass137_Sub3_37.anIntArray634;
		@Pc(127) int local127;
		for (@Pc(116) int local116 = local54; local116 <= local78; local116++) {
			@Pc(125) boolean[] local125 = arg0[local116 - local56];
			for (local127 = local68; local127 <= local93; local127++) {
				if (local125[local127 - local70]) {
					local114[local110++] = local116 + local127 * super.anInt9511;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass137_Sub3_37.method7049();
		} else {
			this.aClass137_Sub3_37.method7101((float) arg3);
			this.aClass137_Sub3_37.method7059();
		}
		this.aClass137_Sub3_37.method7038((this.anInt8924 & 0x7) != 0);
		for (@Pc(193) int local193 = 0; local193 < this.aClass14_Sub36Array1.length; local193++) {
			this.aClass14_Sub36Array1[local193].method5623(local114, local110);
		}
		if (!this.aClass262_61.method6324()) {
			local127 = this.aClass137_Sub3_37.anInt8569;
			@Pc(222) int local222 = this.aClass137_Sub3_37.anInt8587;
			this.aClass137_Sub3_37.L(0, local222, this.aClass137_Sub3_37.anInt8562);
			this.aClass137_Sub3_37.method7038(false);
			this.aClass137_Sub3_37.method7073(false);
			this.aClass137_Sub3_37.method7082(128);
			this.aClass137_Sub3_37.method7029(-2);
			this.aClass137_Sub3_37.method7090(this.aClass137_Sub3_37.aClass66_Sub1_6);
			this.aClass137_Sub3_37.method7084(7681, 8448);
			this.aClass137_Sub3_37.method7071(34166, 770, 0);
			this.aClass137_Sub3_37.method7027(34167, 0);
			for (@Pc(286) Class14 local286 = this.aClass262_61.method6318(); local286 != null; local286 = this.aClass262_61.method6311()) {
				@Pc(291) Class14_Sub38 local291 = (Class14_Sub38) local286;
				local291.method6214(arg4, arg5, arg6, arg0);
			}
			this.aClass137_Sub3_37.method7071(5890, 768, 0);
			this.aClass137_Sub3_37.method7027(5890, 0);
			this.aClass137_Sub3_37.method7090((Class66) null);
			this.aClass137_Sub3_37.L(local127, local222, this.aClass137_Sub3_37.anInt8562);
		}
		if (this.aClass210_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass137_Sub3_37.method7036((Class91) null, this.aClass91_10, this.aClass91_12, (Class91) null);
		this.aClass210_2.method5131(arg0, arg4, arg5, arg1, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!qm;[I)V")
	@Override
	public void method7859(@OriginalArg(0) Class14_Sub37 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass262_61.method6314(new Class14_Sub38(this.aClass137_Sub3_37, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!re", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray40[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray40[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7863(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8933 <= 0) {
			return;
		}
		this.aClass137_Sub3_37.method7087();
		this.aClass137_Sub3_37.method7079(false);
		this.aClass137_Sub3_37.method7038(false);
		this.aClass137_Sub3_37.method7067(false);
		this.aClass137_Sub3_37.method7073(false);
		this.aClass137_Sub3_37.method7082(0);
		this.aClass137_Sub3_37.method7029(-2);
		this.aClass137_Sub3_37.method7090((Class66) null);
		Static6.aFloatArray3[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass137_Sub3_37.anInt8349;
		Static6.aFloatArray3[14] = 0.0F;
		Static6.aFloatArray3[15] = 1.0F;
		Static6.aFloatArray3[9] = 0.0F;
		Static6.aFloatArray3[11] = 0.0F;
		Static6.aFloatArray3[2] = 0.0F;
		Static6.aFloatArray3[5] = (float) 1024 / ((float) this.aClass137_Sub3_37.anInt8349 * 128.0F * (float) super.anInt9506);
		Static6.aFloatArray3[6] = 0.0F;
		Static6.aFloatArray3[7] = 0.0F;
		Static6.aFloatArray3[3] = 0.0F;
		Static6.aFloatArray3[4] = 0.0F;
		Static6.aFloatArray3[10] = 0.0F;
		Static6.aFloatArray3[8] = 0.0F;
		Static6.aFloatArray3[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass137_Sub3_37.anInt8404) - 1.0F;
		Static6.aFloatArray3[1] = 0.0F;
		Static6.aFloatArray3[0] = (float) 1024 / ((float) super.anInt9506 * 128.0F * (float) this.aClass137_Sub3_37.anInt8404);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static6.aFloatArray3, 0);
		Static6.aFloatArray3[5] = 0.0F;
		Static6.aFloatArray3[4] = 0.0F;
		Static6.aFloatArray3[7] = 0.0F;
		Static6.aFloatArray3[8] = 0.0F;
		Static6.aFloatArray3[12] = 0.0F;
		Static6.aFloatArray3[13] = 0.0F;
		Static6.aFloatArray3[10] = 0.0F;
		Static6.aFloatArray3[14] = 0.0F;
		Static6.aFloatArray3[2] = 0.0F;
		Static6.aFloatArray3[9] = 1.0F;
		Static6.aFloatArray3[15] = 1.0F;
		Static6.aFloatArray3[0] = 1.0F;
		Static6.aFloatArray3[1] = 0.0F;
		Static6.aFloatArray3[6] = 1.0F;
		Static6.aFloatArray3[11] = 0.0F;
		Static6.aFloatArray3[3] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static6.aFloatArray3, 0);
		if ((this.anInt8924 & 0x7) == 0) {
			this.aClass137_Sub3_37.method7038(false);
		} else {
			this.aClass137_Sub3_37.method7038(true);
			this.aClass137_Sub3_37.method7035();
		}
		this.aClass137_Sub3_37.method7036(this.aClass91_13, this.aClass91_10, this.aClass91_12, this.aClass91_11);
		if (this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2.aByteArray84.length < this.anInt8928 * 2) {
			this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2 = new Class14_Sub29_Sub2(this.anInt8928 * 2);
		} else {
			this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2.anInt7264 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class14_Sub29_Sub2 local318 = this.aClass137_Sub3_37.aClass14_Sub29_Sub2_2;
		@Pc(324) int local324;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass137_Sub3_37.aBoolean594) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local334 = super.anInt9511 * local324 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray17[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method5859(local354[local358] & 0xFFFF);
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local334 = local324 * super.anInt9511 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray17[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local318.method5867(local354[local358] & 0xFFFF);
								local314++;
							}
						}
					}
					local334++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(471) Class40_Sub2 local471 = new Class40_Sub2(this.aClass137_Sub3_37, 5123, local318.aByteArray84, local318.anInt7264);
			this.aClass137_Sub3_37.method7063(0, local471, local314);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7858(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass210_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass137_Sub3_37.anInt8585 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			@Pc(40) int local40 = arg3 - (this.aClass137_Sub3_37.anInt8564 * arg2 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			return this.aClass210_2.method5130(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!re", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8933 <= 0) {
			this.aClass210_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt9511 + 1][super.anInt9512 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; super.anInt9511 > local28; local28++) {
				for (local32 = 1; local32 < super.anInt9512; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray40[local28][local32] >> 1) + (this.aByteArrayArray40[local28][local32 - 1] >> 2) + (this.aByteArrayArray40[local28 + -1][local32] >> 2) + (this.aByteArrayArray40[local28 + 1][local32] >> 3) + (this.aByteArrayArray40[local28][local32 + 1] >> 3));
				}
			}
			this.aClass14_Sub36Array1 = new Class14_Sub36[this.aClass187_67.method4080()];
			this.aClass187_67.method4087(this.aClass14_Sub36Array1);
			for (local32 = 0; local32 < this.aClass14_Sub36Array1.length; local32++) {
				this.aClass14_Sub36Array1[local32].method5620(this.anInt8933);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray17 != null) {
				local140 += 4;
			}
			if ((this.anInt8924 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass137_Sub3_37.aNativeHeap5.a(this.anInt8933 * local140, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class14_Sub36[] local169 = new Class14_Sub36[this.anInt8933];
			@Pc(176) int local176 = Static133.method2141(this.anInt8933 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class187 local186 = new Class187(local176);
			@Pc(190) Class14_Sub36[] local190 = new Class14_Sub36[this.anInt8932];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; local192 < super.anInt9511; local192++) {
				for (local196 = 0; local196 < super.anInt9512; local196++) {
					if (this.anIntArrayArrayArray16[local192][local196] != null) {
						@Pc(212) Class14_Sub36[] local212 = this.aClass14_Sub36ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray13[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray14[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray15[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray16[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local192][local196];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(275) float local275 = this.aFloatArrayArray14[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray16[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray15[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray14[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray16[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray15[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray14[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray16[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray15[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray14[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray16[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray15[local192 + 1][local196];
						@Pc(384) int local384 = local26[local192][local196] & 0xFF;
						@Pc(394) int local394 = local26[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local26[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local26[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label335: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class14_Sub36 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local426 == local190[local428]) {
									continue label335;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray17[local192 + super.anInt9511 * local196] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(482) int local482 = (local192 << super.anInt9507) + local219[local428];
							@Pc(492) int local492 = (local196 << super.anInt9507) + local226[local428];
							@Pc(497) int local497 = local482 >> this.anInt8923;
							@Pc(502) int local502 = local492 >> this.anInt8923;
							@Pc(506) int local506 = local240[local428];
							@Pc(510) int local510 = local233[local428];
							@Pc(518) int local518 = local252 == null ? 0 : local252[local428];
							@Pc(536) long local536 = (long) local510 << 48 | (long) local506 << 32 | (long) (local497 << 16) | (long) local502;
							@Pc(540) int local540 = local219[local428];
							@Pc(544) int local544 = local226[local428];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(550) float local550 = 1.0F;
							@Pc(580) float local580;
							@Pc(578) float local578;
							@Pc(582) float local582;
							@Pc(628) float local628;
							@Pc(586) int local586;
							if (local540 == 0 && local544 == 0) {
								local578 = local282;
								local586 = local546 - local384;
								local582 = local289;
								local580 = local275;
							} else if (local540 == 0 && super.anInt9506 == local544) {
								local578 = local307;
								local582 = local316;
								local580 = local298;
								local586 = local546 - local394;
							} else if (local540 == super.anInt9506 && super.anInt9506 == local544) {
								local578 = local338;
								local580 = local327;
								local582 = local349;
								local586 = local546 - local406;
							} else if (super.anInt9506 == local540 && local544 == 0) {
								local586 = local546 - local416;
								local582 = local376;
								local578 = local367;
								local580 = local358;
							} else {
								@Pc(605) float local605 = (float) local540 / (float) super.anInt9506;
								@Pc(612) float local612 = (float) local544 / (float) super.anInt9506;
								@Pc(620) float local620 = local275 + local605 * (local358 - local275);
								local628 = (local367 - local282) * local605 + local282;
								@Pc(637) float local637 = local605 * (local376 - local289) + local289;
								@Pc(645) float local645 = local298 + (local327 - local298) * local605;
								@Pc(653) float local653 = local307 + (local338 - local307) * local605;
								local580 = (local645 - local620) * local612 + local620;
								local578 = local628 + local612 * (local653 - local628);
								@Pc(679) float local679 = (local349 - local316) * local605 + local316;
								local582 = local612 * (local679 - local637) + local637;
								@Pc(699) int local699 = local384 + ((local416 - local384) * local540 >> super.anInt9507);
								@Pc(712) int local712 = local394 + ((local406 - local394) * local540 >> super.anInt9507);
								local586 = local546 - local699 - (local544 * (local712 - local699) >> super.anInt9507);
							}
							if (local506 != -1) {
								@Pc(775) int local775 = local586 * (local506 & 0x7F) >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								local548 = Static659.anIntArray816[local506 & 0xFF80 | local775];
								if ((this.anInt8924 & 0x7) == 0) {
									local550 = this.aClass137_Sub3_37.aFloatArray65[2] * local582 + this.aClass137_Sub3_37.aFloatArray65[1] * local578 + local580 * this.aClass137_Sub3_37.aFloatArray65[0];
									local550 = (local550 > 0.0F ? this.aClass137_Sub3_37.aFloat207 : this.aClass137_Sub3_37.aFloat204) * local550 + this.aClass137_Sub3_37.aFloat206;
								}
							}
							@Pc(848) Class14 local848 = null;
							if ((local482 & this.anInt8913 - 1) == 0 && (this.anInt8913 - 1 & local492) == 0) {
								local848 = local186.method4078(local536);
							}
							@Pc(1204) int local1204;
							@Pc(874) int local874;
							if (local848 == null) {
								if (local510 == local506) {
									local874 = local548;
								} else {
									@Pc(884) int local884 = (local510 & 0x7F) * local586 >> 7;
									if (local884 < 2) {
										local884 = 2;
									} else if (local884 > 126) {
										local884 = 126;
									}
									local874 = Static659.anIntArray816[local510 & 0xFF80 | local884];
									if ((this.anInt8924 & 0x7) == 0) {
										local628 = local582 * this.aClass137_Sub3_37.aFloatArray65[2] + local578 * this.aClass137_Sub3_37.aFloatArray65[1] + this.aClass137_Sub3_37.aFloatArray65[0] * local580;
										local628 = this.aClass137_Sub3_37.aFloat206 + local550 * (local550 > 0.0F ? this.aClass137_Sub3_37.aFloat207 : this.aClass137_Sub3_37.aFloat204);
										@Pc(959) int local959 = local874 >> 16 & 0xFF;
										@Pc(965) int local965 = local874 >> 8 & 0xFF;
										@Pc(969) int local969 = local874 & 0xFF;
										local959 = (int) ((float) local959 * local628);
										local965 = (int) ((float) local965 * local628);
										if (local959 < 0) {
											local959 = 0;
										} else if (local959 > 255) {
											local959 = 255;
										}
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local969 = (int) ((float) local969 * local628);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local874 = local969 | local965 << 8 | local959 << 16;
									}
								}
								if (this.aClass137_Sub3_37.aBoolean594) {
									local165.b((float) local482);
									local165.b((float) (local518 + this.method7866(local482, local492)));
									local165.b((float) local492);
									local165.f((byte) (local874 >> 16));
									local165.f((byte) (local874 >> 8));
									local165.f((byte) local874);
									local165.f(-1);
									local165.b((float) local482);
									local165.b((float) local492);
									if (this.anIntArrayArrayArray17 != null) {
										local165.b((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt8924 & 0x7) != 0) {
										local165.b(local580);
										local165.b(local578);
										local165.b(local582);
									}
								} else {
									local165.a((float) local482);
									local165.a((float) (this.method7866(local482, local492) + local518));
									local165.a((float) local492);
									local165.f((byte) (local874 >> 16));
									local165.f((byte) (local874 >> 8));
									local165.f((byte) local874);
									local165.f(-1);
									local165.a((float) local482);
									local165.a((float) local492);
									if (this.anIntArrayArrayArray17 != null) {
										local165.a((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt8924 & 0x7) != 0) {
										local165.a(local580);
										local165.a(local578);
										local165.a(local582);
									}
								}
								local1204 = this.anInt8930++;
								local469[local428] = (short) local1204;
								if (local506 != -1) {
									local169[local1204] = local212[local428];
								}
								local186.method4077(local536, new Class14_Sub49(local469[local428]));
							} else {
								local469[local428] = ((Class14_Sub49) local848).aShort95;
								local1204 = local469[local428] & 0xFFFF;
								if (local506 != -1 && local169[local1204].aLong305 > local212[local428].aLong305) {
									local169[local1204] = local212[local428];
								}
							}
							for (local874 = 0; local874 < local418; local874++) {
								local190[local874].method5617(local586, local1204, local550, local548);
							}
							this.anInt8928++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt8930; local196++) {
				@Pc(1316) Class14_Sub36 local1316 = local169[local196];
				if (local1316 != null) {
					local1316.method5619(local196);
				}
			}
			@Pc(1349) int local1349;
			for (@Pc(1329) int local1329 = 0; local1329 < super.anInt9511; local1329++) {
				for (@Pc(1333) int local1333 = 0; local1333 < super.anInt9512; local1333++) {
					@Pc(1345) short[] local1345 = this.aShortArrayArray17[local1329 + local1333 * super.anInt9511];
					if (local1345 != null) {
						local1349 = 0;
						@Pc(1351) int local1351 = 0;
						while (local1351 < local1345.length) {
							@Pc(1360) int local1360 = local1345[local1351++] & 0xFFFF;
							@Pc(1367) int local1367 = local1345[local1351++] & 0xFFFF;
							@Pc(1374) int local1374 = local1345[local1351++] & 0xFFFF;
							@Pc(1378) Class14_Sub36 local1378 = local169[local1360];
							@Pc(1382) Class14_Sub36 local1382 = local169[local1367];
							@Pc(1386) Class14_Sub36 local1386 = local169[local1374];
							@Pc(1388) Class14_Sub36 local1388 = null;
							if (local1378 != null) {
								local1388 = local1378;
								local1378.method5616(local1349, local1329, local1333);
							}
							if (local1382 != null) {
								local1382.method5616(local1349, local1329, local1333);
								if (local1388 == null || local1388.aLong305 > local1382.aLong305) {
									local1388 = local1382;
								}
							}
							if (local1386 != null) {
								local1386.method5616(local1349, local1329, local1333);
								if (local1388 == null || local1386.aLong305 < local1388.aLong305) {
									local1388 = local1386;
								}
							}
							if (local1388 != null) {
								if (local1378 != null) {
									local1388.method5619(local1360);
								}
								if (local1382 != null) {
									local1388.method5619(local1367);
								}
								if (local1386 != null) {
									local1388.method5619(local1374);
								}
								local1388.method5616(local1349, local1329, local1333);
							}
							local1349++;
						}
					}
				}
			}
			local165.b();
			this.anInterface8_6 = this.aClass137_Sub3_37.method7060(local160, local165.a(), local140);
			this.aClass91_12 = new Class91(this.anInterface8_6, 5126, 3, 0);
			this.aClass91_13 = new Class91(this.anInterface8_6, 5121, 4, 12);
			@Pc(1517) byte local1517;
			if (this.anIntArrayArrayArray17 == null) {
				local1517 = 24;
				this.aClass91_10 = new Class91(this.anInterface8_6, 5126, 2, 16);
			} else {
				this.aClass91_10 = new Class91(this.anInterface8_6, 5126, 3, 16);
				local1517 = 28;
			}
			if ((this.anInt8924 & 0x7) != 0) {
				this.aClass91_11 = new Class91(this.anInterface8_6, 5126, 3, local1517);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass14_Sub36Array1.length];
			for (local1349 = 0; local1349 < this.aClass14_Sub36Array1.length; local1349++) {
				@Pc(1573) Class14_Sub36 local1573 = this.aClass14_Sub36Array1[local1349];
				local1564[local1349] = local1573.aLong305;
				local1573.method5622(this.anInt8930);
			}
			Static184.method2920(local1564, this.aClass14_Sub36Array1);
			if (this.aClass210_2 != null) {
				this.aClass210_2.method5127();
			}
		}
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray17 = null;
		this.aByteArrayArray40 = null;
		this.aClass14_Sub36ArrayArrayArray1 = null;
		this.aClass187_67 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray16 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray13 = this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!re", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9511][super.anInt9512][];
		}
		@Pc(21) Interface3 local21 = this.aClass137_Sub3_37.anInterface3_11;
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt9511][super.anInt9512][];
		}
		this.anIntArrayArrayArray13[arg0][arg1] = arg2;
		this.anIntArrayArrayArray14[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(92) Class14_Sub36[] local92 = this.aClass14_Sub36ArrayArrayArray1[arg0][arg1] = new Class14_Sub36[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8924 & 0x20) != 0 && local100 != -1 && local21.method6177(local100).aBoolean453) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(154) Class14 local154;
			for (local154 = this.aClass187_67.method4078(local148); local154 != null; local154 = this.aClass187_67.method4086()) {
				@Pc(159) Class14_Sub36 local159 = (Class14_Sub36) local154;
				if (local159.anInt6936 == local100 && local159.aFloat159 == (float) local104 && arg10 == local159.anInt6933 && local159.anInt6939 == arg11 && arg12 == local159.anInt6932) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class14_Sub36(this, local100, local104, arg10, arg11, arg12);
				this.aClass187_67.method4077(local148, local92[local94]);
			} else {
				local92[local94] = (Class14_Sub36) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray39[arg0][arg1] = (byte) (this.aByteArrayArray39[arg0][arg1] | 0x1);
		}
		if (this.anInt8932 < arg6.length) {
			this.anInt8932 = arg6.length;
		}
		this.anInt8933 += arg6.length;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!re", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass210_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass137_Sub3_37.anInt8585 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			@Pc(39) int local39 = arg3 - (this.aClass137_Sub3_37.anInt8564 * arg2 >> 8) >> this.aClass137_Sub3_37.anInt8545;
			this.aClass210_2.method5132(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7389(arg3, arg4, arg5, -1, arg1, arg0, arg2);
	}
}
