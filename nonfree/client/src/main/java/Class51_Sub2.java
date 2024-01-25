import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	private int anInt6752;

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
	private int anInt6760;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	private int anInt6764;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
	private int anInt6765;

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_9;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "[Lclient!qd;")
	private Class14_Sub45[] aClass14_Sub45Array1;

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_10;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lclient!kq;")
	public Class201 aClass201_16;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "F")
	private float aFloat155 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "F")
	private float aFloat156 = -3.4028235E38F;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!ok;")
	private final Class262 aClass262_38 = new Class262();

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "Lclient!pj;")
	public final Class137_Sub1 aClass137_Sub1_9;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
	private final int anInt6762;

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[[B")
	private final byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "[[S")
	public final short[][] aShortArrayArray15;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
	private final int anInt6746;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	public final int anInt6747;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "[[[Lclient!qd;")
	private Class14_Sub45[][][] aClass14_Sub45ArrayArrayArray1;

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "Lclient!jo;")
	private Class187 aClass187_45;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "Lclient!ve;")
	private Class362 aClass362_1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!pj;IIII[[I[[II)V")
	public Class51_Sub2(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass137_Sub1_9 = arg0;
		this.anInt6762 = super.anInt9507 - 2;
		this.aFloatArrayArray4 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aByteArrayArray34 = new byte[arg3][arg4];
		this.aShortArrayArray15 = new short[arg3 * arg4][];
		this.anInt6746 = 0x1 << this.anInt6762;
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anInt6747 = arg2;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass14_Sub45ArrayArrayArray1 = new Class14_Sub45[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.aByteArrayArray35 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[super.anInt9511 + 1][super.anInt9512 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9512 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9511; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray52[local125][local121];
				if (this.aFloat156 < (float) local134) {
					this.aFloat156 = (float) local134;
				}
				if ((float) local134 < this.aFloat155) {
					this.aFloat155 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9511 > local125 && local121 < super.anInt9512) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(227) float local227 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local190 * local190 + local207 * local207)));
					this.aFloatArrayArray4[local125][local121] = (float) local190 * local227;
					this.aFloatArrayArray3[local125][local121] = local227 * (float) (-arg7 * 2);
					this.aFloatArrayArray5[local125][local121] = (float) local207 * local227;
				}
			}
		}
		this.aFloat156++;
		this.aFloat155--;
		this.aClass187_45 = new Class187(128);
		if ((this.anInt6747 & 0x10) != 0) {
			this.aClass362_1 = new Class362(this.aClass137_Sub1_9, this);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	@Override
	public void method7865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mf", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray35[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray35[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!pn;II)V")
	private void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub3_Sub14_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray9[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static125.anIntArray210.length) {
			Static2.anIntArray3 = new int[local22];
			Static125.anIntArray210 = new int[local22];
		}
		for (@Pc(40) int local40 = 0; local40 < local22; local40++) {
			Static125.anIntArray210[local40] = local12[local40] >> this.aClass137_Sub1_9.anInt9731;
			Static2.anIntArray3[local40] = local19[local40] >> this.aClass137_Sub1_9.anInt9731;
		}
		@Pc(72) int local72 = 0;
		while (local72 < local22) {
			@Pc(78) int local78 = Static125.anIntArray210[local72];
			@Pc(83) int local83 = Static2.anIntArray3[local72++];
			@Pc(87) int local87 = Static125.anIntArray210[local72];
			@Pc(92) int local92 = Static2.anIntArray3[local72++];
			@Pc(96) int local96 = Static125.anIntArray210[local72];
			@Pc(101) int local101 = Static2.anIntArray3[local72++];
			if ((local78 - local87) * (-local101 + local92) - (local96 - local87) * (-local83 + local92) > 0) {
				arg1.method6747(local83, local101, local78, local87, local96, local92);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass362_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass137_Sub1_9.anInt9740 * arg2 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass137_Sub1_9.anInt9717 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			this.aClass362_1.method8801(local23, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIZII[[Z)V")
	private void method5486(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass14_Sub45Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg1 + arg1 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > Static313.anIntArray664.length) {
			Static313.anIntArray664 = new int[local18];
		}
		@Pc(33) int local33 = arg2 - arg1;
		@Pc(35) int local35 = local33;
		if (local33 < 0) {
			local33 = 0;
		}
		@Pc(44) int local44 = arg3 - arg1;
		@Pc(46) int local46 = local44;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(57) int local57 = arg1 + arg2;
		if (super.anInt9511 - 1 < local57) {
			local57 = super.anInt9511 - 1;
		}
		@Pc(72) int local72 = arg1 + arg3;
		if (super.anInt9512 - 1 < local72) {
			local72 = super.anInt9512 - 1;
		}
		Static520.anInt9070 = 0;
		for (@Pc(87) int local87 = local33; local87 <= local57; local87++) {
			@Pc(96) boolean[] local96 = arg6[local87 - local35];
			for (@Pc(98) int local98 = local44; local98 <= local72; local98++) {
				if (local96[local98 - local46]) {
					Static313.anIntArray664[Static520.anInt9070++] = local87 + local98 * super.anInt9511;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass137_Sub1_9.method7955();
		} else {
			this.aClass137_Sub1_9.method7993((float) arg5);
			this.aClass137_Sub1_9.method7966();
		}
		this.aClass137_Sub1_9.method7977();
		this.aClass137_Sub1_9.method8077((this.anInt6747 & 0x7) != 0);
		this.aClass137_Sub1_9.method7962(false, -1, false);
		this.aClass137_Sub1_9.method8067(0, this.anInterface10_9);
		for (@Pc(187) int local187 = 0; local187 < this.aClass14_Sub45Array1.length; local187++) {
			this.aClass14_Sub45Array1[local187].method6871(Static313.anIntArray664, Static520.anInt9070);
		}
		@Pc(212) Class26_Sub1 local212 = this.aClass137_Sub1_9.method8006();
		local212.method6457(0, -1, 0);
		this.aClass137_Sub1_9.method8036();
		if (!this.aClass262_38.method6324()) {
			@Pc(230) int local230 = this.aClass137_Sub1_9.anInt9723;
			@Pc(234) int local234 = this.aClass137_Sub1_9.anInt9727;
			this.aClass137_Sub1_9.L(0, local234, this.aClass137_Sub1_9.anInt9734);
			this.aClass137_Sub1_9.method8077(false);
			this.aClass137_Sub1_9.method8022(false);
			this.aClass137_Sub1_9.method7990(128);
			this.aClass137_Sub1_9.method7962(false, -2, false);
			this.aClass137_Sub1_9.method8007(this.aClass137_Sub1_9.anInterface15_3);
			this.aClass137_Sub1_9.method7969(Static575.aClass87_7, Static461.aClass87_5);
			this.aClass137_Sub1_9.method8069(0, Static490.aClass169_6);
			this.aClass137_Sub1_9.method7971(0, Static370.aClass169_8);
			for (@Pc(294) Class14 local294 = this.aClass262_38.method6318(); local294 != null; local294 = this.aClass262_38.method6311()) {
				@Pc(299) Class14_Sub39 local299 = (Class14_Sub39) local294;
				local299.method6231(arg6, arg3, arg1, arg2);
			}
			this.aClass137_Sub1_9.method8069(0, Static201.aClass169_3);
			this.aClass137_Sub1_9.method7971(0, Static201.aClass169_3);
			this.aClass137_Sub1_9.method8007((Interface15) null);
			this.aClass137_Sub1_9.L(local230, local234, this.aClass137_Sub1_9.anInt9734);
		}
		if (this.aClass362_1 != null) {
			this.aClass137_Sub1_9.method8067(0, this.anInterface10_9);
			this.aClass137_Sub1_9.method8067(1, this.anInterface10_10);
			this.aClass137_Sub1_9.method8000(this.aClass201_16);
			this.aClass362_1.method8798(arg0, arg6, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class14_Sub3_Sub14 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub3_Sub14 arg2) {
		if ((this.aByteArrayArray34[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9506 >> this.aClass137_Sub1_9.anInt9731;
		@Pc(27) Class14_Sub3_Sub14_Sub1 local27 = (Class14_Sub3_Sub14_Sub1) arg2;
		@Pc(37) Class14_Sub3_Sub14_Sub1 local37;
		if (local27 != null && local27.method6751(local24, local24)) {
			local37 = local27;
			local27.method6750();
		} else {
			local37 = new Class14_Sub3_Sub14_Sub1(this.aClass137_Sub1_9, local24, local24);
		}
		local37.method6746(local24, 0, local24, 0);
		this.method5485(arg0, local37, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!qm;[I)V")
	@Override
	public void method7859(@OriginalArg(0) Class14_Sub37 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass262_38.method6314(new Class14_Sub39(this.aClass137_Sub1_9, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7863(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6765 <= 0) {
			return;
		}
		@Pc(19) Interface4 local19 = this.aClass137_Sub1_9.method8005(this.anInt6760);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method5680();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass137_Sub1_9.method8079(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt9511 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray15[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
										local44.a(local90);
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9511;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray15[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 > local25) {
											local25 = local90;
										}
										local44.e(local90);
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
				}
				local44.b();
				if (local19.method5682()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass137_Sub1_9.method7973();
		this.aClass137_Sub1_9.method7989(false);
		this.aClass137_Sub1_9.method8077(false);
		this.aClass137_Sub1_9.method8065(false);
		this.aClass137_Sub1_9.method8022(false);
		this.aClass137_Sub1_9.method7990(0);
		this.aClass137_Sub1_9.method7962(false, -2, false);
		this.aClass137_Sub1_9.method8007((Interface15) null);
		@Pc(277) Class26_Sub1 local277 = this.aClass137_Sub1_9.method8006();
		@Pc(282) float[] local282 = this.aClass137_Sub1_9.method8025();
		local282[8] = 0.0F;
		local282[9] = 0.0F;
		local282[3] = 0.0F;
		local282[10] = 1.0F / (this.aFloat156 - this.aFloat155);
		local282[7] = 0.0F;
		local282[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass137_Sub1_9.anInt9683;
		local282[6] = 0.0F;
		local282[15] = 1.0F;
		local282[11] = 0.0F;
		local282[0] = (float) 1024 / ((float) super.anInt9506 * 128.0F * (float) this.aClass137_Sub1_9.anInt9683);
		local282[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass137_Sub1_9.anInt9590;
		local282[5] = (float) 1024 / ((float) this.aClass137_Sub1_9.anInt9590 * (float) super.anInt9506 * 128.0F);
		local282[1] = 0.0F;
		local282[14] = -this.aFloat155 / (this.aFloat156 - this.aFloat155);
		local282[4] = 0.0F;
		local282[2] = 0.0F;
		local277.method784(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass137_Sub1_9.method8068();
		this.aClass137_Sub1_9.method8036();
		if ((this.anInt6747 & 0x7) == 0) {
			this.aClass137_Sub1_9.method8077(false);
		} else {
			this.aClass137_Sub1_9.method8077(true);
			this.aClass137_Sub1_9.method7976();
		}
		this.aClass137_Sub1_9.method8008(false);
		this.aClass137_Sub1_9.method8067(0, this.anInterface10_9);
		this.aClass137_Sub1_9.method8067(1, this.anInterface10_10);
		this.aClass137_Sub1_9.method8000(this.aClass201_16);
		this.aClass137_Sub1_9.method7980(local21 / 3, local19, local23, 0, local25 + 1 - local23, Static620.aClass54_6);
		this.aClass137_Sub1_9.method8008(true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5486(arg4, arg2, arg0, arg1, arg6, arg5, arg3);
	}

	@OriginalMember(owner = "client!mf", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass362_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass137_Sub1_9.anInt9740 * arg2 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			@Pc(37) int local37 = arg3 - (this.aClass137_Sub1_9.anInt9717 * arg2 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			this.aClass362_1.method8797(local37, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6765 <= 0) {
			this.aClass362_1 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9511 + 1][super.anInt9512 + 1];
			for (@Pc(24) int local24 = 1; local24 < super.anInt9511; local24++) {
				for (@Pc(28) int local28 = 1; super.anInt9512 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray35[local24][local28] >> 1) + (this.aByteArrayArray35[local24 - 1][local28] >> 2) + (this.aByteArrayArray35[local24 - -1][local28] >> 3) + (this.aByteArrayArray35[local24][local28 + -1] >> 2) + (this.aByteArrayArray35[local24][local28 + 1] >> 3));
				}
			}
			@Pc(108) Class14_Sub45[] local108 = new Class14_Sub45[this.aClass187_45.method4080()];
			this.aClass187_45.method4087(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method6877(this.anInt6765);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local136 += 4;
			}
			if ((this.anInt6747 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass137_Sub1_9.aNativeHeap6.a(this.anInt6765 * 4, false);
			@Pc(169) NativeHeapBuffer local169 = this.aClass137_Sub1_9.aNativeHeap6.a(this.anInt6765 * local136, false);
			@Pc(174) Stream local174 = new Stream(local169);
			@Pc(179) Stream local179 = new Stream(local159);
			@Pc(183) Class14_Sub45[] local183 = new Class14_Sub45[this.anInt6765];
			@Pc(190) int local190 = Static133.method2141(this.anInt6765 / 4);
			if (local190 < 1) {
				local190 = 1;
			}
			@Pc(200) Class187 local200 = new Class187(local190);
			@Pc(204) Class14_Sub45[] local204 = new Class14_Sub45[this.anInt6764];
			@Pc(210) int local210;
			for (@Pc(206) int local206 = 0; local206 < super.anInt9511; local206++) {
				for (local210 = 0; super.anInt9512 > local210; local210++) {
					if (this.anIntArrayArrayArray5[local206][local210] != null) {
						@Pc(226) Class14_Sub45[] local226 = this.aClass14_Sub45ArrayArrayArray1[local206][local210];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray8[local206][local210];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray9[local206][local210];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray10[local206][local210];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray5[local206][local210];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local206][local210];
						if (local247 == null) {
							local247 = local254;
						}
						@Pc(282) int[] local282 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local206][local210];
						@Pc(289) float local289 = this.aFloatArrayArray4[local206][local210];
						@Pc(296) float local296 = this.aFloatArrayArray3[local206][local210];
						@Pc(303) float local303 = this.aFloatArrayArray5[local206][local210];
						@Pc(312) float local312 = this.aFloatArrayArray4[local206][local210 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray3[local206][local210 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray5[local206][local210 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray4[local206 + 1][local210 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray3[local206 + 1][local210 + 1];
						@Pc(363) float local363 = this.aFloatArrayArray5[local206 + 1][local210 + 1];
						@Pc(372) float local372 = this.aFloatArrayArray4[local206 + 1][local210];
						@Pc(381) float local381 = this.aFloatArrayArray3[local206 + 1][local210];
						@Pc(390) float local390 = this.aFloatArrayArray5[local206 + 1][local210];
						@Pc(398) int local398 = local22[local206][local210] & 0xFF;
						@Pc(408) int local408 = local22[local206][local210 + 1] & 0xFF;
						@Pc(420) int local420 = local22[local206 + 1][local210 + 1] & 0xFF;
						@Pc(430) int local430 = local22[local206 + 1][local210] & 0xFF;
						@Pc(432) int local432 = 0;
						@Pc(442) int local442;
						label357: for (@Pc(434) int local434 = 0; local434 < local254.length; local434++) {
							@Pc(440) Class14_Sub45 local440 = local226[local434];
							for (local442 = 0; local442 < local432; local442++) {
								if (local440 == local204[local442]) {
									continue label357;
								}
							}
							local204[local432++] = local440;
						}
						@Pc(483) short[] local483 = this.aShortArrayArray15[local206 + super.anInt9511 * local210] = new short[local254.length];
						for (local442 = 0; local442 < local254.length; local442++) {
							@Pc(497) int local497 = (local206 << super.anInt9507) + local233[local442];
							@Pc(507) int local507 = (local210 << super.anInt9507) + local240[local442];
							@Pc(512) int local512 = local497 >> this.anInt6762;
							@Pc(517) int local517 = local507 >> this.anInt6762;
							@Pc(521) int local521 = local254[local442];
							@Pc(525) int local525 = local247[local442];
							@Pc(533) int local533 = local266 == null ? 0 : local266[local442];
							@Pc(551) long local551 = (long) local525 << 48 | (long) local521 << 32 | (long) (local512 << 16) | (long) local517;
							@Pc(555) int local555 = local233[local442];
							@Pc(559) int local559 = local240[local442];
							@Pc(561) byte local561 = 74;
							@Pc(563) int local563 = 0;
							@Pc(580) float local580;
							@Pc(572) float local572;
							@Pc(578) float local578;
							@Pc(672) float local672;
							@Pc(576) int local576;
							if (local555 == 0 && local559 == 0) {
								local572 = local296;
								local576 = local561 - local398;
								local578 = local303;
								local580 = local289;
							} else if (local555 == 0 && local559 == super.anInt9506) {
								local576 = local561 - local408;
								local572 = local321;
								local580 = local312;
								local578 = local330;
							} else if (local555 == super.anInt9506 && super.anInt9506 == local559) {
								local580 = local341;
								local572 = local352;
								local578 = local363;
								local576 = local561 - local420;
							} else if (super.anInt9506 == local555 && local559 == 0) {
								local576 = local561 - local430;
								local578 = local390;
								local580 = local372;
								local572 = local381;
							} else {
								@Pc(648) float local648 = (float) local555 / (float) super.anInt9506;
								@Pc(655) float local655 = (float) local559 / (float) super.anInt9506;
								@Pc(663) float local663 = local289 + local648 * (local372 - local289);
								local672 = (local381 - local296) * local648 + local296;
								@Pc(681) float local681 = (local390 - local303) * local648 + local303;
								@Pc(690) float local690 = local312 + local648 * (local341 - local312);
								@Pc(699) float local699 = local648 * (local352 - local321) + local321;
								local580 = local663 + (local690 - local663) * local655;
								@Pc(717) float local717 = local648 * (local363 - local330) + local330;
								local572 = local655 * (local699 - local672) + local672;
								local578 = local655 * (local717 - local681) + local681;
								@Pc(747) int local747 = local398 + (local555 * (local430 - local398) >> super.anInt9507);
								@Pc(760) int local760 = local408 + ((local420 - local408) * local555 >> super.anInt9507);
								local576 = local561 - (local559 * (local760 - local747) >> super.anInt9507) - local747;
							}
							@Pc(775) float local775 = 1.0F;
							if (local521 != -1) {
								@Pc(787) int local787 = (local521 & 0x7F) * local576 >> 7;
								if (local787 < 2) {
									local787 = 2;
								} else if (local787 > 126) {
									local787 = 126;
								}
								if ((this.anInt6747 & 0x7) == 0) {
									local775 = this.aClass137_Sub1_9.aFloatArray72[0] * local580 + this.aClass137_Sub1_9.aFloatArray72[1] * local572 + this.aClass137_Sub1_9.aFloatArray72[2] * local578;
									local775 = (local775 > 0.0F ? this.aClass137_Sub1_9.aFloat238 : this.aClass137_Sub1_9.aFloat251) * local775 + this.aClass137_Sub1_9.aFloat235;
								}
								local563 = Static659.anIntArray816[local521 & 0xFF80 | local787];
							}
							@Pc(861) Class14 local861 = null;
							if ((local497 & this.anInt6746 - 1) == 0 && (this.anInt6746 - 1 & local507) == 0) {
								local861 = local200.method4078(local551);
							}
							@Pc(894) int local894;
							@Pc(929) int local929;
							if (local861 == null) {
								if (local521 == local525) {
									local929 = local563;
								} else {
									@Pc(939) int local939 = local576 * (local525 & 0x7F) >> 7;
									if (local939 < 2) {
										local939 = 2;
									} else if (local939 > 126) {
										local939 = 126;
									}
									local929 = Static659.anIntArray816[local525 & 0xFF80 | local939];
									if ((this.anInt6747 & 0x7) == 0) {
										@Pc(987) float local987 = this.aClass137_Sub1_9.aFloatArray72[0] * local580 + this.aClass137_Sub1_9.aFloatArray72[1] * local572 + this.aClass137_Sub1_9.aFloatArray72[2] * local578;
										local672 = (local775 > 0.0F ? this.aClass137_Sub1_9.aFloat238 : this.aClass137_Sub1_9.aFloat251) * local775 + this.aClass137_Sub1_9.aFloat235;
										@Pc(1012) int local1012 = local929 >> 16 & 0xFF;
										@Pc(1018) int local1018 = local929 >> 8 & 0xFF;
										@Pc(1022) int local1022 = local929 & 0xFF;
										local1012 = (int) ((float) local1012 * local672);
										if (local1012 < 0) {
											local1012 = 0;
										} else if (local1012 > 255) {
											local1012 = 255;
										}
										local1018 = (int) ((float) local1018 * local672);
										local1022 = (int) ((float) local1022 * local672);
										if (local1018 < 0) {
											local1018 = 0;
										} else if (local1018 > 255) {
											local1018 = 255;
										}
										if (local1022 < 0) {
											local1022 = 0;
										} else if (local1022 > 255) {
											local1022 = 255;
										}
										local929 = local1012 << 16 | local1018 << 8 | local1022;
									}
								}
								if (Stream.c()) {
									local174.b((float) local497);
									local174.b((float) (local533 + this.method7866(local497, local507)));
									local174.b((float) local507);
									local174.b((float) local497);
									local174.b((float) local507);
									if (this.anIntArrayArrayArray6 != null) {
										local174.b((float) (local282 == null ? 0 : local282[local442] - 1));
									}
									if ((this.anInt6747 & 0x7) != 0) {
										local174.b(local580);
										local174.b(local572);
										local174.b(local578);
									}
								} else {
									local174.a((float) local497);
									local174.a((float) (local533 + this.method7866(local497, local507)));
									local174.a((float) local507);
									local174.a((float) local497);
									local174.a((float) local507);
									if (this.anIntArrayArrayArray6 != null) {
										local174.a((float) (local282 == null ? 0 : local282[local442] - 1));
									}
									if ((this.anInt6747 & 0x7) != 0) {
										local174.a(local580);
										local174.a(local572);
										local174.a(local578);
									}
								}
								if (this.aClass137_Sub1_9.anInt9724 == 0) {
									local179.c(local929 | 0xFF000000);
								} else {
									local179.d(local929 | 0xFF000000);
								}
								local894 = this.anInt6752++;
								local483[local442] = (short) local894;
								if (local521 != -1) {
									local183[local894] = local226[local442];
								}
								local200.method4077(local551, new Class14_Sub49(local483[local442]));
							} else {
								local483[local442] = ((Class14_Sub49) local861).aShort95;
								local894 = local483[local442] & 0xFFFF;
								if (local521 != -1 && local226[local442].aLong305 < local183[local894].aLong305) {
									local183[local894] = local226[local442];
								}
							}
							for (local929 = 0; local929 < local432; local929++) {
								local204[local929].method6874(local894, local775, local576, local563);
							}
							this.anInt6760++;
						}
					}
				}
			}
			for (local210 = 0; local210 < this.anInt6752; local210++) {
				@Pc(1321) Class14_Sub45 local1321 = local183[local210];
				if (local1321 != null) {
					local1321.method6878(local210);
				}
			}
			@Pc(1342) int local1342;
			@Pc(1360) int local1360;
			for (@Pc(1338) int local1338 = 0; super.anInt9511 > local1338; local1338++) {
				for (local1342 = 0; local1342 < super.anInt9512; local1342++) {
					@Pc(1354) short[] local1354 = this.aShortArrayArray15[super.anInt9511 * local1342 + local1338];
					if (local1354 != null) {
						@Pc(1358) int local1358 = 0;
						local1360 = 0;
						while (local1360 < local1354.length) {
							@Pc(1369) int local1369 = local1354[local1360++] & 0xFFFF;
							@Pc(1376) int local1376 = local1354[local1360++] & 0xFFFF;
							@Pc(1383) int local1383 = local1354[local1360++] & 0xFFFF;
							@Pc(1387) Class14_Sub45 local1387 = local183[local1369];
							@Pc(1391) Class14_Sub45 local1391 = local183[local1376];
							@Pc(1395) Class14_Sub45 local1395 = local183[local1383];
							@Pc(1397) Class14_Sub45 local1397 = null;
							if (local1387 != null) {
								local1397 = local1387;
								local1387.method6870(local1338, local1342, local1358);
							}
							if (local1391 != null) {
								local1391.method6870(local1338, local1342, local1358);
								if (local1397 == null || local1391.aLong305 < local1397.aLong305) {
									local1397 = local1391;
								}
							}
							if (local1395 != null) {
								local1395.method6870(local1338, local1342, local1358);
								if (local1397 == null || local1397.aLong305 > local1395.aLong305) {
									local1397 = local1395;
								}
							}
							if (local1397 != null) {
								if (local1387 != null) {
									local1397.method6878(local1369);
								}
								if (local1391 != null) {
									local1397.method6878(local1376);
								}
								if (local1395 != null) {
									local1397.method6878(local1383);
								}
								local1397.method6870(local1338, local1342, local1358);
							}
							local1358++;
						}
					}
				}
			}
			local174.b();
			local179.b();
			this.anInterface10_10 = this.aClass137_Sub1_9.method7963(false);
			this.anInterface10_10.method3993(4, local159, this.anInt6752 * 4);
			this.anInterface10_9 = this.aClass137_Sub1_9.method7963(false);
			this.anInterface10_9.method3993(local136, local169, this.anInt6752 * local136);
			if ((this.anInt6747 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass201_16 = this.aClass137_Sub1_9.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5 }), new Class388(Static256.aClass170_3) });
				} else {
					this.aClass201_16 = this.aClass137_Sub1_9.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5, Static256.aClass170_4 }), new Class388(Static256.aClass170_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass201_16 = this.aClass137_Sub1_9.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5, Static256.aClass170_2 }), new Class388(Static256.aClass170_3) });
			} else {
				this.aClass201_16 = this.aClass137_Sub1_9.method8040(new Class388[] { new Class388(new Class170[] { Static256.aClass170_1, Static256.aClass170_5, Static256.aClass170_4, Static256.aClass170_2 }), new Class388(Static256.aClass170_3) });
			}
			local1342 = 0;
			for (@Pc(1697) int local1697 = 0; local1697 < local108.length; local1697++) {
				if (local108[local1697].anInt8260 > 0) {
					local108[local1342++] = local108[local1697];
				}
			}
			this.aClass14_Sub45Array1 = new Class14_Sub45[local1342];
			@Pc(1726) long[] local1726 = new long[local1342];
			for (local1360 = 0; local1360 < local1342; local1360++) {
				@Pc(1734) Class14_Sub45 local1734 = local108[local1360];
				local1726[local1360] = local1734.aLong305;
				this.aClass14_Sub45Array1[local1360] = local1734;
				local1734.method6879(this.anInt6752);
			}
			Static184.method2920(local1726, this.aClass14_Sub45Array1);
			if (this.aClass362_1 != null) {
				this.aClass362_1.method8795();
			}
		}
		this.aClass14_Sub45ArrayArrayArray1 = null;
		this.aClass187_45 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray35 = null;
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray5 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7858(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass362_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass137_Sub1_9.anInt9740 * arg2 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass137_Sub1_9.anInt9717 >> 8) >> this.aClass137_Sub1_9.anInt9731;
			return this.aClass362_1.method8796(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5486(arg4, arg2, arg0, arg1, arg5, -1, arg3);
	}

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface3 local9 = this.aClass137_Sub1_9.anInterface3_11;
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9511][super.anInt9512][];
		}
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt9511][super.anInt9512][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(92) Class14_Sub45[] local92 = this.aClass14_Sub45ArrayArrayArray1[arg0][arg1] = new Class14_Sub45[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6747 & 0x20) != 0 && local100 != -1 && local9.method6177(local100).aBoolean453) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(148) long local148 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(154) Class14 local154;
			for (local154 = this.aClass187_45.method4078(local148); local154 != null; local154 = this.aClass187_45.method4086()) {
				@Pc(159) Class14_Sub45 local159 = (Class14_Sub45) local154;
				if (local159.anInt8258 == local100 && (float) local104 == local159.aFloat189 && local159.anInt8255 == arg10 && local159.anInt8254 == arg11 && arg12 == local159.anInt8256) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class14_Sub45(this, local100, local104, arg10, arg11, arg12);
				this.aClass187_45.method4077(local148, local92[local94]);
			} else {
				local92[local94] = (Class14_Sub45) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray34[arg0][arg1] = (byte) (this.aByteArrayArray34[arg0][arg1] | 0x1);
		}
		if (this.anInt6764 < arg6.length) {
			this.anInt6764 = arg6.length;
		}
		this.anInt6765 += arg6.length;
	}
}
