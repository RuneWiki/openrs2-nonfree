import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class75_Sub3 extends Class75 {

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
	private int anInt5686;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!nba", name = "H", descriptor = "I")
	private int anInt5699;

	@OriginalMember(owner = "client!nba", name = "T", descriptor = "Lclient!lq;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!nba", name = "U", descriptor = "Lclient!af;")
	private Class11 aClass11_8;

	@OriginalMember(owner = "client!nba", name = "W", descriptor = "Lclient!af;")
	public Class11 aClass11_9;

	@OriginalMember(owner = "client!nba", name = "Z", descriptor = "I")
	private int anInt5708;

	@OriginalMember(owner = "client!nba", name = "bb", descriptor = "Lclient!af;")
	public Class11 aClass11_10;

	@OriginalMember(owner = "client!nba", name = "eb", descriptor = "I")
	private int anInt5710;

	@OriginalMember(owner = "client!nba", name = "gb", descriptor = "[Lclient!pg;")
	private Class2_Sub38[] aClass2_Sub38Array1;

	@OriginalMember(owner = "client!nba", name = "hb", descriptor = "Lclient!af;")
	public Class11 aClass11_11;

	@OriginalMember(owner = "client!nba", name = "E", descriptor = "Lclient!rk;")
	private final Class249 aClass249_32 = new Class249();

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
	private final int anInt5690 = this.anInt7996 - 2;

	@OriginalMember(owner = "client!nba", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "Lclient!os;")
	public final Class39_Sub3 aClass39_Sub3_27;

	@OriginalMember(owner = "client!nba", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!nba", name = "D", descriptor = "[[[Lclient!pg;")
	private Class2_Sub38[][][] aClass2_Sub38ArrayArrayArray1;

	@OriginalMember(owner = "client!nba", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!nba", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!nba", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!nba", name = "J", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!nba", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!nba", name = "x", descriptor = "[[B")
	private final byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!nba", name = "K", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!nba", name = "S", descriptor = "I")
	private final int anInt5706;

	@OriginalMember(owner = "client!nba", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!nba", name = "ib", descriptor = "Lclient!ica;")
	private Class127 aClass127_34;

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "Lclient!rw;")
	private Class256 aClass256_2;

	static {
		new Class202("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!os;IIII[[I[[II)V")
	public Class75_Sub3(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray54 = arg5;
		this.aClass39_Sub3_27 = arg0;
		this.aFloatArrayArray7 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.aClass2_Sub38ArrayArrayArray1 = new Class2_Sub38[arg3][arg4][];
		this.aFloatArrayArray9 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8 = new float[super.anInt7998 + 1][super.anInt7995 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aShortArrayArray8 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray18 = new byte[arg3][arg4];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt5692 = arg2;
		this.anInt5706 = 0x1 << this.anInt5690;
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt7995 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt7998 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * 4 * arg7)));
				this.aFloatArrayArray8[local121][local117] = local176 * (float) local139;
				this.aFloatArrayArray9[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray7[local121][local117] = (float) local156 * local176;
			}
		}
		this.aClass127_34 = new Class127(128);
		if ((this.anInt5692 & 0x10) != 0) {
			this.aClass256_2 = new Class256(this.aClass39_Sub3_27, this);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5710 <= 0) {
			return;
		}
		this.aClass39_Sub3_27.method5741();
		this.aClass39_Sub3_27.method5695(false);
		this.aClass39_Sub3_27.method5736(false);
		this.aClass39_Sub3_27.method5744(false);
		this.aClass39_Sub3_27.method5708(false);
		this.aClass39_Sub3_27.method5704(0);
		this.aClass39_Sub3_27.method5686(-2);
		this.aClass39_Sub3_27.method5719(null);
		Static480.aFloatArray71[3] = 0.0F;
		Static480.aFloatArray71[5] = (float) 1024 / ((float) this.aClass39_Sub3_27.anInt6701 * 128.0F * (float) super.anInt7994);
		Static480.aFloatArray71[14] = 0.0F;
		Static480.aFloatArray71[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass39_Sub3_27.anInt6678;
		Static480.aFloatArray71[9] = 0.0F;
		Static480.aFloatArray71[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass39_Sub3_27.anInt6701;
		Static480.aFloatArray71[4] = 0.0F;
		Static480.aFloatArray71[6] = 0.0F;
		Static480.aFloatArray71[7] = 0.0F;
		Static480.aFloatArray71[11] = 0.0F;
		Static480.aFloatArray71[15] = 1.0F;
		Static480.aFloatArray71[10] = 0.0F;
		Static480.aFloatArray71[2] = 0.0F;
		Static480.aFloatArray71[8] = 0.0F;
		Static480.aFloatArray71[0] = (float) 1024 / ((float) this.aClass39_Sub3_27.anInt6678 * (float) super.anInt7994 * 128.0F);
		Static480.aFloatArray71[1] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static480.aFloatArray71, 0);
		Static480.aFloatArray71[4] = 0.0F;
		Static480.aFloatArray71[2] = 0.0F;
		Static480.aFloatArray71[12] = 0.0F;
		Static480.aFloatArray71[9] = 1.0F;
		Static480.aFloatArray71[13] = 0.0F;
		Static480.aFloatArray71[3] = 0.0F;
		Static480.aFloatArray71[6] = 1.0F;
		Static480.aFloatArray71[11] = 0.0F;
		Static480.aFloatArray71[10] = 0.0F;
		Static480.aFloatArray71[8] = 0.0F;
		Static480.aFloatArray71[15] = 1.0F;
		Static480.aFloatArray71[0] = 1.0F;
		Static480.aFloatArray71[14] = 0.0F;
		Static480.aFloatArray71[7] = 0.0F;
		Static480.aFloatArray71[5] = 0.0F;
		Static480.aFloatArray71[1] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static480.aFloatArray71, 0);
		if ((this.anInt5692 & 0x7) == 0) {
			this.aClass39_Sub3_27.method5736(false);
		} else {
			this.aClass39_Sub3_27.method5736(true);
			this.aClass39_Sub3_27.method5717();
		}
		this.aClass39_Sub3_27.method5754(this.aClass11_9, this.aClass11_8, this.aClass11_10, this.aClass11_11);
		if (this.anInt5699 * 2 <= this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2.aByteArray96.length) {
			this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2.anInt6132 = 0;
		} else {
			this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2 = new Class2_Sub29_Sub1(this.anInt5699 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class2_Sub29_Sub1 local317 = this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2;
		@Pc(323) int local323;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass39_Sub3_27.aBoolean485) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + local323 * super.anInt7998;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray8[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local313++;
								local317.method5217(local353[local357] & 0xFFFF);
							}
						}
					}
					local332++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + super.anInt7998 * local323;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray8[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local317.method5199(local353[local357] & 0xFFFF);
								local313++;
							}
						}
					}
					local332++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(480) Class45_Sub2 local480 = new Class45_Sub2(this.aClass39_Sub3_27, 5123, local317.aByteArray96, local317.anInt6132);
			this.aClass39_Sub3_27.method5755(local480, local313, 0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([[ZIIBIIZ)V")
	private void method4851(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass2_Sub38Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass39_Sub3_27.aFloat172;
		@Pc(12) float local12 = this.aClass39_Sub3_27.aFloat156;
		@Pc(19) int local19 = arg2 + arg2 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (this.aClass39_Sub3_27.anIntArray517.length < local23) {
			this.aClass39_Sub3_27.anIntArray517 = new int[local23];
		}
		if (this.anInt5699 * 2 > this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2.aByteArray96.length) {
			this.aClass39_Sub3_27.aClass2_Sub29_Sub1_2 = new Class2_Sub29_Sub1(this.anInt5699 * 2);
		}
		@Pc(62) int local62 = arg3 - arg2;
		@Pc(64) int local64 = local62;
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(75) int local75 = arg1 - arg2;
		@Pc(77) int local77 = local75;
		if (local75 < 0) {
			local75 = 0;
		}
		@Pc(86) int local86 = arg3 + arg2;
		if (local86 > super.anInt7998 - 1) {
			local86 = super.anInt7998 - 1;
		}
		@Pc(105) int local105 = arg2 + arg1;
		if (local105 > super.anInt7995 - 1) {
			local105 = super.anInt7995 - 1;
		}
		@Pc(118) int local118 = 0;
		@Pc(122) int[] local122 = this.aClass39_Sub3_27.anIntArray517;
		@Pc(135) int local135;
		for (@Pc(124) int local124 = local62; local124 <= local86; local124++) {
			@Pc(133) boolean[] local133 = arg0[local124 - local64];
			for (local135 = local75; local135 <= local105; local135++) {
				if (local133[local135 - local77]) {
					local122[local118++] = local124 + super.anInt7998 * local135;
				}
			}
		}
		this.aClass39_Sub3_27.method5712();
		this.aClass39_Sub3_27.method5736((this.anInt5692 & 0x7) != 0);
		for (@Pc(198) int local198 = 0; local198 < this.aClass2_Sub38Array1.length; local198++) {
			this.aClass2_Sub38Array1[local198].method5885(local122, local118);
		}
		if (!this.aClass249_32.method6519()) {
			local135 = this.aClass39_Sub3_27.anInt6737;
			@Pc(227) int local227 = this.aClass39_Sub3_27.anInt6756;
			this.aClass39_Sub3_27.E(0, local227, this.aClass39_Sub3_27.anInt6732);
			this.aClass39_Sub3_27.la(local12, local8 - 4.0F);
			this.aClass39_Sub3_27.method5736(false);
			this.aClass39_Sub3_27.method5708(false);
			this.aClass39_Sub3_27.method5704(128);
			this.aClass39_Sub3_27.method5686(-2);
			this.aClass39_Sub3_27.method5719(this.aClass39_Sub3_27.aClass19_Sub2_5);
			this.aClass39_Sub3_27.method5760(8448, 7681);
			this.aClass39_Sub3_27.method5709(34166, 0, 770);
			this.aClass39_Sub3_27.method5680(34167, 0);
			for (@Pc(294) Class2 local294 = this.aClass249_32.method6527(); local294 != null; local294 = this.aClass249_32.method6525()) {
				@Pc(299) Class2_Sub42 local299 = (Class2_Sub42) local294;
				local299.method6756(arg2, arg1, arg3, arg0);
			}
			this.aClass39_Sub3_27.method5709(5890, 0, 768);
			this.aClass39_Sub3_27.method5680(5890, 0);
			this.aClass39_Sub3_27.method5719(null);
			this.aClass39_Sub3_27.E(local135, local227, this.aClass39_Sub3_27.anInt6732);
		}
		if (this.aClass256_2 != null) {
			this.aClass39_Sub3_27.la(local12, local8 - 8.0F);
			this.aClass39_Sub3_27.method5712();
			this.aClass39_Sub3_27.method5754(this.aClass11_9, null, this.aClass11_10, null);
			this.aClass256_2.method6589(arg4, arg3, arg1, arg2, arg0);
		}
		this.aClass39_Sub3_27.la(local12, local8);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nba", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt7998][super.anInt7995][];
		}
		if (arg5 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt7998][super.anInt7995][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray14[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub38[] local88 = this.aClass2_Sub38ArrayArrayArray1[arg0][arg1] = new Class2_Sub38[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[local90];
			@Pc(125) Class2 local125;
			for (local125 = this.aClass127_34.method3205(local119); local125 != null; local125 = this.aClass127_34.method3210()) {
				@Pc(130) Class2_Sub38 local130 = (Class2_Sub38) local125;
				if (arg8[local90] == local130.anInt6908 && (float) arg9[local90] == local130.aFloat180 && local130.anInt6917 == arg10 && local130.anInt6913 == arg11 && local130.anInt6909 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub38(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass127_34.method3213(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub38) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray18[arg0][arg1] = (byte) (this.aByteArrayArray18[arg0][arg1] | 0x1);
		}
		if (this.anInt5708 < arg6.length) {
			this.anInt5708 = arg6.length;
		}
		this.anInt5710 += arg6.length;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6703(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass256_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass39_Sub3_27.anInt6742 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			@Pc(40) int local40 = arg3 - (this.aClass39_Sub3_27.anInt6758 * arg2 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			return this.aClass256_2.method6590(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!nba", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!nba", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass256_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass39_Sub3_27.anInt6742 * arg2 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			@Pc(39) int local39 = arg3 - (this.aClass39_Sub3_27.anInt6758 * arg2 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			this.aClass256_2.method6595(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!nba", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class2_Sub13_Sub6 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub6 arg2) {
		if ((this.aByteArrayArray18[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7994 >> this.aClass39_Sub3_27.anInt6716;
		@Pc(24) Class2_Sub13_Sub6_Sub1 local24 = (Class2_Sub13_Sub6_Sub1) arg2;
		@Pc(34) Class2_Sub13_Sub6_Sub1 local34;
		if (local24 != null && local24.method3166(local21, local21)) {
			local34 = local24;
			local24.method3164();
		} else {
			local34 = new Class2_Sub13_Sub6_Sub1(this.aClass39_Sub3_27, local21, local21);
		}
		local34.method3167(0, local21, 0, local21);
		this.method4853(local34, arg0, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!nba", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7996;
		@Pc(13) int local13 = arg1 >> super.anInt7996;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt7998 - 1 || local13 > super.anInt7995 - 1) {
			return 0;
		}
		@Pc(49) int local49 = super.anInt7994 - 1 & arg0;
		@Pc(56) int local56 = arg1 & super.anInt7994 - 1;
		@Pc(82) int local82 = (super.anInt7994 - local49) * this.anIntArrayArray54[local8][local13] + local49 * this.anIntArrayArray54[local8 + 1][local13] >> super.anInt7996;
		@Pc(113) int local113 = this.anIntArrayArray54[local8 + 1][local13 + 1] * local49 + (super.anInt7994 - local49) * this.anIntArrayArray54[local8][local13 + 1] >> super.anInt7996;
		return local82 * (super.anInt7994 - local56) + local113 * local56 >> super.anInt7996;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!at;[I)V")
	@Override
	public void method6706(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass249_32.method6523(new Class2_Sub42(this.aClass39_Sub3_27, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!iaa;BII)V")
	private void method4853(@OriginalArg(0) Class2_Sub13_Sub6_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int[] local16 = this.anIntArrayArrayArray16[arg1][arg2];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray14[arg1][arg2];
		@Pc(26) int local26 = local16.length;
		if (local26 > this.aClass39_Sub3_27.anIntArray516.length) {
			this.aClass39_Sub3_27.anIntArray515 = new int[local26];
			this.aClass39_Sub3_27.anIntArray516 = new int[local26];
		}
		@Pc(46) int[] local46 = this.aClass39_Sub3_27.anIntArray516;
		@Pc(50) int[] local50 = this.aClass39_Sub3_27.anIntArray515;
		for (@Pc(52) int local52 = 0; local52 < local26; local52++) {
			local46[local52] = local16[local52] >> this.aClass39_Sub3_27.anInt6716;
			local50[local52] = local23[local52] >> this.aClass39_Sub3_27.anInt6716;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local26) {
			@Pc(86) int local86 = local46[local80];
			@Pc(91) int local91 = local50[local80++];
			@Pc(95) int local95 = local46[local80];
			@Pc(100) int local100 = local50[local80++];
			@Pc(104) int local104 = local46[local80];
			@Pc(109) int local109 = local50[local80++];
			if ((local86 - local95) * (local100 - local109) - (local104 - local95) * (-local91 + local100) > 0) {
				arg0.method3169(local104, local95, local109, local100, local86, local91);
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass256_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass39_Sub3_27.anInt6742 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			@Pc(39) int local39 = arg3 - (this.aClass39_Sub3_27.anInt6758 * arg2 >> 8) >> this.aClass39_Sub3_27.anInt6716;
			this.aClass256_2.method6592(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4851(arg3, arg1, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!nba", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray54[arg0][arg1];
	}

	@OriginalMember(owner = "client!nba", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt5710 <= 0) {
			this.aClass256_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt7998 + 1][super.anInt7995 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; local24 < super.anInt7998; local24++) {
				for (local28 = 1; local28 < super.anInt7995; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray19[local24][local28] >> 1) + (this.aByteArrayArray19[local24][local28 + 1] >> 3) + (this.aByteArrayArray19[local24 + -1][local28] >> 2) + (this.aByteArrayArray19[local24 + 1][local28] >> 3) + (this.aByteArrayArray19[local24][local28 + -1] >> 2));
				}
			}
			this.aClass2_Sub38Array1 = new Class2_Sub38[this.aClass127_34.method3209()];
			this.aClass127_34.method3207(this.aClass2_Sub38Array1);
			for (local28 = 0; local28 < this.aClass2_Sub38Array1.length; local28++) {
				this.aClass2_Sub38Array1[local28].method5883(this.anInt5710);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray13 != null) {
				local140 += 4;
			}
			if ((this.anInt5692 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass39_Sub3_27.aNativeHeap4.a(local140 * this.anInt5710, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class2_Sub38[] local169 = new Class2_Sub38[this.anInt5710];
			@Pc(176) int local176 = Static266.method4292(this.anInt5710 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(188) Class127 local188 = new Class127(local176);
			@Pc(192) Class2_Sub38[] local192 = new Class2_Sub38[this.anInt5708];
			@Pc(198) int local198;
			for (@Pc(194) int local194 = 0; super.anInt7998 > local194; local194++) {
				for (local198 = 0; super.anInt7995 > local198; local198++) {
					if (this.anIntArrayArrayArray15[local194][local198] != null) {
						@Pc(214) Class2_Sub38[] local214 = this.aClass2_Sub38ArrayArrayArray1[local194][local198];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray16[local194][local198];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray14[local194][local198];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray12[local194][local198];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray15[local194][local198];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local194][local198];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local194][local198];
						if (local235 == null) {
							local235 = local242;
						}
						@Pc(277) float local277 = this.aFloatArrayArray8[local194][local198];
						@Pc(284) float local284 = this.aFloatArrayArray9[local194][local198];
						@Pc(291) float local291 = this.aFloatArrayArray7[local194][local198];
						@Pc(300) float local300 = this.aFloatArrayArray8[local194][local198 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray9[local194][local198 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray7[local194][local198 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray8[local194 + 1][local198 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray9[local194 + 1][local198 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray7[local194 + 1][local198 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray8[local194 + 1][local198];
						@Pc(369) float local369 = this.aFloatArrayArray9[local194 + 1][local198];
						@Pc(378) float local378 = this.aFloatArrayArray7[local194 + 1][local198];
						@Pc(386) int local386 = local22[local194][local198] & 0xFF;
						@Pc(396) int local396 = local22[local194][local198 + 1] & 0xFF;
						@Pc(408) int local408 = local22[local194 + 1][local198 + 1] & 0xFF;
						@Pc(418) int local418 = local22[local194 + 1][local198] & 0xFF;
						@Pc(420) int local420 = 0;
						@Pc(430) int local430;
						label337: for (@Pc(422) int local422 = 0; local422 < local242.length; local422++) {
							@Pc(428) Class2_Sub38 local428 = local214[local422];
							for (local430 = 0; local430 < local420; local430++) {
								if (local192[local430] == local428) {
									continue label337;
								}
							}
							local192[local420++] = local428;
						}
						@Pc(475) short[] local475 = this.aShortArrayArray8[super.anInt7998 * local198 + local194] = new short[local242.length];
						for (local430 = 0; local430 < local242.length; local430++) {
							@Pc(488) int local488 = (local194 << super.anInt7996) + local221[local430];
							@Pc(497) int local497 = (local198 << super.anInt7996) + local228[local430];
							@Pc(502) int local502 = local488 >> this.anInt5690;
							@Pc(507) int local507 = local497 >> this.anInt5690;
							@Pc(511) int local511 = local242[local430];
							@Pc(515) int local515 = local235[local430];
							@Pc(523) int local523 = local254 == null ? 0 : local254[local430];
							@Pc(541) long local541 = (long) local507 | (long) (local502 << 16) | (long) local511 << 32 | (long) local515 << 48;
							@Pc(545) int local545 = local221[local430];
							@Pc(549) int local549 = local228[local430];
							@Pc(551) byte local551 = 74;
							@Pc(553) int local553 = 0;
							@Pc(555) float local555 = 1.0F;
							@Pc(563) float local563;
							@Pc(569) float local569;
							@Pc(561) float local561;
							@Pc(648) float local648;
							@Pc(567) int local567;
							if (local545 == 0 && local549 == 0) {
								local561 = local291;
								local563 = local277;
								local567 = local551 - local386;
								local569 = local284;
							} else if (local545 == 0 && local549 == super.anInt7994) {
								local561 = local318;
								local569 = local309;
								local567 = local551 - local396;
								local563 = local300;
							} else if (local545 == super.anInt7994 && super.anInt7994 == local549) {
								local561 = local351;
								local563 = local329;
								local569 = local340;
								local567 = local551 - local408;
							} else if (local545 == super.anInt7994 && local549 == 0) {
								local561 = local378;
								local563 = local360;
								local569 = local369;
								local567 = local551 - local418;
							} else {
								@Pc(624) float local624 = (float) local545 / (float) super.anInt7994;
								@Pc(631) float local631 = (float) local549 / (float) super.anInt7994;
								@Pc(640) float local640 = local624 * (local360 - local277) + local277;
								local648 = (local369 - local284) * local624 + local284;
								@Pc(657) float local657 = (local378 - local291) * local624 + local291;
								@Pc(665) float local665 = local300 + (local329 - local300) * local624;
								@Pc(674) float local674 = (local340 - local309) * local624 + local309;
								@Pc(683) float local683 = local318 + (local351 - local318) * local624;
								local569 = (local674 - local648) * local631 + local648;
								local563 = local640 + (local665 - local640) * local631;
								local561 = local657 + (local683 - local657) * local631;
								@Pc(719) int local719 = ((local418 - local386) * local545 >> super.anInt7996) + local386;
								@Pc(730) int local730 = local396 + (local545 * (local408 - local396) >> super.anInt7996);
								local567 = local551 - local719 - ((local730 - local719) * local549 >> super.anInt7996);
							}
							if (local511 != -1) {
								@Pc(780) int local780 = local567 * (local511 & 0x7F) >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								if ((this.anInt5692 & 0x7) == 0) {
									local555 = local561 * this.aClass39_Sub3_27.aFloatArray53[2] + this.aClass39_Sub3_27.aFloatArray53[1] * local569 + this.aClass39_Sub3_27.aFloatArray53[0] * local563;
									local555 = this.aClass39_Sub3_27.aFloat159 + (local555 > 0.0F ? this.aClass39_Sub3_27.aFloat167 : this.aClass39_Sub3_27.aFloat168) * local555;
								}
								local553 = Static445.anIntArray614[local780 | local511 & 0xFF80];
							}
							@Pc(854) Class2 local854 = null;
							if ((local488 & this.anInt5706 - 1) == 0 && (this.anInt5706 - 1 & local497) == 0) {
								local854 = local188.method3205(local541);
							}
							@Pc(893) int local893;
							@Pc(923) int local923;
							if (local854 == null) {
								if (local511 == local515) {
									local923 = local553;
								} else {
									@Pc(933) int local933 = local567 * (local515 & 0x7F) >> 7;
									if (local933 < 2) {
										local933 = 2;
									} else if (local933 > 126) {
										local933 = 126;
									}
									local923 = Static445.anIntArray614[local515 & 0xFF80 | local933];
									if ((this.anInt5692 & 0x7) == 0) {
										local648 = this.aClass39_Sub3_27.aFloatArray53[2] * local561 + local569 * this.aClass39_Sub3_27.aFloatArray53[1] + local563 * this.aClass39_Sub3_27.aFloatArray53[0];
										local648 = (local555 > 0.0F ? this.aClass39_Sub3_27.aFloat167 : this.aClass39_Sub3_27.aFloat168) * local555 + this.aClass39_Sub3_27.aFloat159;
										@Pc(1006) int local1006 = local923 >> 16 & 0xFF;
										@Pc(1012) int local1012 = local923 >> 8 & 0xFF;
										@Pc(1016) int local1016 = local923 & 0xFF;
										local1006 = (int) ((float) local1006 * local648);
										local1012 = (int) ((float) local1012 * local648);
										if (local1006 < 0) {
											local1006 = 0;
										} else if (local1006 > 255) {
											local1006 = 255;
										}
										local1016 = (int) ((float) local1016 * local648);
										if (local1012 < 0) {
											local1012 = 0;
										} else if (local1012 > 255) {
											local1012 = 255;
										}
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										local923 = local1012 << 8 | local1006 << 16 | local1016;
									}
								}
								if (this.aClass39_Sub3_27.aBoolean485) {
									local165.a((float) local488);
									local165.a((float) (local523 + this.aa(local488, local497)));
									local165.a((float) local497);
									local165.b((byte) (local923 >> 16));
									local165.b((byte) (local923 >> 8));
									local165.b((byte) local923);
									local165.b(-1);
									local165.a((float) local488);
									local165.a((float) local497);
									if (this.anIntArrayArrayArray13 != null) {
										local165.a((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt5692 & 0x7) != 0) {
										local165.a(local563);
										local165.a(local569);
										local165.a(local561);
									}
								} else {
									local165.b((float) local488);
									local165.b((float) (local523 + this.aa(local488, local497)));
									local165.b((float) local497);
									local165.b((byte) (local923 >> 16));
									local165.b((byte) (local923 >> 8));
									local165.b((byte) local923);
									local165.b(-1);
									local165.b((float) local488);
									local165.b((float) local497);
									if (this.anIntArrayArrayArray13 != null) {
										local165.b((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt5692 & 0x7) != 0) {
										local165.b(local563);
										local165.b(local569);
										local165.b(local561);
									}
								}
								local893 = this.anInt5686++;
								local475[local430] = (short) local893;
								if (local511 != -1) {
									local169[local893] = local214[local430];
								}
								local188.method3213(new Class2_Sub15(local475[local430]), local541);
							} else {
								local475[local430] = ((Class2_Sub15) local854).aShort24;
								local893 = local475[local430] & 0xFFFF;
								if (local511 != -1 && local214[local430].aLong241 < local169[local893].aLong241) {
									local169[local893] = local214[local430];
								}
							}
							for (local923 = 0; local923 < local420; local923++) {
								local192[local923].method5884(local555, local553, local893, local567);
							}
							this.anInt5699++;
						}
					}
				}
			}
			for (local198 = 0; local198 < this.anInt5686; local198++) {
				@Pc(1324) Class2_Sub38 local1324 = local169[local198];
				if (local1324 != null) {
					local1324.method5882(local198);
				}
			}
			@Pc(1357) int local1357;
			for (@Pc(1337) int local1337 = 0; super.anInt7998 > local1337; local1337++) {
				for (@Pc(1341) int local1341 = 0; super.anInt7995 > local1341; local1341++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray8[local1337 + super.anInt7998 * local1341];
					if (local1353 != null) {
						local1357 = 0;
						@Pc(1359) int local1359 = 0;
						while (local1353.length > local1359) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class2_Sub38 local1386 = local169[local1368];
							@Pc(1390) Class2_Sub38 local1390 = local169[local1375];
							@Pc(1394) Class2_Sub38 local1394 = local169[local1382];
							@Pc(1396) Class2_Sub38 local1396 = null;
							if (local1386 != null) {
								local1396 = local1386;
								local1386.method5879(local1357, local1341, local1337);
							}
							if (local1390 != null) {
								local1390.method5879(local1357, local1341, local1337);
								if (local1396 == null || local1396.aLong241 > local1390.aLong241) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method5879(local1357, local1341, local1337);
								if (local1396 == null || local1396.aLong241 > local1394.aLong241) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method5882(local1368);
								}
								if (local1390 != null) {
									local1396.method5882(local1375);
								}
								if (local1394 != null) {
									local1396.method5882(local1382);
								}
								local1396.method5879(local1357, local1341, local1337);
							}
							local1357++;
						}
					}
				}
			}
			local165.c();
			this.anInterface10_4 = this.aClass39_Sub3_27.method5738(local140, local160, local165.b());
			this.aClass11_9 = new Class11(this.anInterface10_4, 5126, 3, 0);
			this.aClass11_8 = new Class11(this.anInterface10_4, 5121, 4, 12);
			@Pc(1533) byte local1533;
			if (this.anIntArrayArrayArray13 == null) {
				local1533 = 24;
				this.aClass11_10 = new Class11(this.anInterface10_4, 5126, 2, 16);
			} else {
				this.aClass11_10 = new Class11(this.anInterface10_4, 5126, 3, 16);
				local1533 = 28;
			}
			if ((this.anInt5692 & 0x7) != 0) {
				this.aClass11_11 = new Class11(this.anInterface10_4, 5126, 3, local1533);
			}
			@Pc(1577) long[] local1577 = new long[this.aClass2_Sub38Array1.length];
			for (local1357 = 0; local1357 < this.aClass2_Sub38Array1.length; local1357++) {
				@Pc(1586) Class2_Sub38 local1586 = this.aClass2_Sub38Array1[local1357];
				local1577[local1357] = local1586.aLong241;
				local1586.method5880(this.anInt5686);
			}
			Static410.method6417(local1577, this.aClass2_Sub38Array1);
			if (this.aClass256_2 != null) {
				this.aClass256_2.method6597();
			}
		}
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray14 = null;
		this.aClass127_34 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass2_Sub38ArrayArrayArray1 = null;
		this.aByteArrayArray19 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray13 = null;
	}
}
