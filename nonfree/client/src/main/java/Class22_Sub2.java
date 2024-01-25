import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	private int anInt5583;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	private int anInt5584;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "[Lclient!ep;")
	private Class3_Sub16[] aClass3_Sub16Array1;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!kr;")
	private Class117 aClass117_11;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "Lclient!kr;")
	public Class117 aClass117_12;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "Lclient!kr;")
	public Class117 aClass117_13;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "Lclient!kr;")
	public Class117 aClass117_14;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	private int anInt5587;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!kr;")
	public Class117 aClass117_15;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!mp;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!m;")
	private final Class127 aClass127_30 = new Class127();

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!se;")
	public final Class122_Sub2 aClass122_Sub2_38;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "[[I")
	private final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
	public final int anInt5582;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public int anInt5580;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public final int anInt5581;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "[[[Lclient!ep;")
	private Class3_Sub16[][][] aClass3_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "Lclient!bo;")
	private Class24 aClass24_26;

	@OriginalMember(owner = "client!sb", name = "C", descriptor = "Lclient!am;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!se;IIII[[I[[II)V")
	public Class22_Sub2(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass122_Sub2_38 = arg0;
		this.anIntArrayArray51 = arg5;
		this.anIntArrayArray52 = arg6;
		this.anInt5582 = arg2;
		while (arg7 > 1) {
			this.anInt5580++;
			arg7 >>= 0x1;
		}
		this.anInt5581 = 0x1 << this.anInt5580;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aClass3_Sub16ArrayArrayArray1 = new Class3_Sub16[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.aByteArrayArray17 = new byte[arg3][arg4];
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray6 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray51[local124 + 1][local119] - this.anIntArrayArray51[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray51[local124][local119 + 1] - this.anIntArrayArray51[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray5[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray4[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray6[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass24_26 = new Class24(128);
		if ((this.anInt5582 & 0x10) != 0) {
			this.aClass11_2 = new Class11(this.aClass122_Sub2_38, this);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!c;)Lclient!c;")
	@Override
	public Class3_Sub7_Sub3 method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		if ((this.aByteArrayArray17[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt5581 >> this.aClass122_Sub2_38.anInt5611;
		@Pc(20) Class3_Sub7_Sub3_Sub1 local20 = (Class3_Sub7_Sub3_Sub1) arg2;
		@Pc(30) Class3_Sub7_Sub3_Sub1 local30;
		if (local20 != null && local20.method2339(local17, local17)) {
			local30 = local20;
			local20.method2338();
		} else {
			local30 = new Class3_Sub7_Sub3_Sub1(this.aClass122_Sub2_38, local17, local17);
		}
		local30.method2337(local17, local17, 0, 0);
		this.method4682(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!is;II)V")
	private void method4682(@OriginalArg(0) Class3_Sub7_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static280.anIntArray445.length < local16) {
			Static280.anIntArray445 = new int[local16];
			Static280.anIntArray443 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static280.anIntArray445[local28] = (local6[local28] & 0xFF) >> this.aClass122_Sub2_38.anInt5611;
			Static280.anIntArray443[local28] = (local13[local28] & 0xFF) >> this.aClass122_Sub2_38.anInt5611;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static280.anIntArray445[local28];
			@Pc(71) int local71 = Static280.anIntArray443[local28++];
			@Pc(75) int local75 = Static280.anIntArray445[local28];
			@Pc(80) int local80 = Static280.anIntArray443[local28++];
			@Pc(84) int local84 = Static280.anIntArray445[local28];
			@Pc(89) int local89 = Static280.anIntArray443[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method2335(local84, local66, local80, local75, local71, local89);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
	@Override
	public int method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt5580;
		@Pc(9) int local9 = arg1 >> this.anInt5580;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt5574 - 1 || local9 > this.anInt5577 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt5581 - 1;
		@Pc(41) int local41 = arg1 & this.anInt5581 - 1;
		@Pc(67) int local67 = this.anIntArrayArray51[local4][local9] * (this.anInt5581 - local34) + this.anIntArrayArray51[local4 + 1][local9] * local34 >> this.anInt5580;
		@Pc(97) int local97 = this.anIntArrayArray51[local4][local9 + 1] * (this.anInt5581 - local34) + this.anIntArrayArray51[local4 + 1][local9 + 1] * local34 >> this.anInt5580;
		return local67 * (this.anInt5581 - local41) + local97 * local41 >> this.anInt5580;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!dn;[I)V")
	@Override
	public void method4680(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass127_30.method3387(new Class3_Sub21(this.aClass122_Sub2_38, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
	@Override
	public void method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray18[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray18[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	@Override
	public int method4672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray51[arg0][arg1];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass3_Sub16Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass122_Sub2_38.aFloat53;
		@Pc(10) float local10 = this.aClass122_Sub2_38.aFloat64;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static280.anIntArray444.length < local20) {
			Static280.anIntArray444 = new int[local20];
		}
		if (Static280.aClass3_Sub4_8.aByteArray70.length < this.anInt5584 * 2) {
			Static280.aClass3_Sub4_8 = new Class3_Sub4(this.anInt5584 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt5574 - 1) {
			local67 = this.anInt5574 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt5577 - 1) {
			local82 = this.anInt5577 - 1;
		}
		Static280.anInt5585 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static280.anIntArray444[Static280.anInt5585++] = local108 * this.anInt5574 + local97;
				}
			}
		}
		this.aClass122_Sub2_38.method4820();
		for (local97 = 0; local97 < this.aClass3_Sub16Array1.length; local97++) {
			this.aClass3_Sub16Array1[local97].method1312(Static280.anIntArray444, Static280.anInt5585);
		}
		if (!this.aClass127_30.method3390()) {
			local97 = this.aClass122_Sub2_38.anInt5633;
			@Pc(169) int local169 = this.aClass122_Sub2_38.anInt5645;
			this.aClass122_Sub2_38.method4718(0, local169);
			this.aClass122_Sub2_38.method4744(local10, local6 - 4.0F);
			this.aClass122_Sub2_38.method4880(false);
			this.aClass122_Sub2_38.method4841(false);
			this.aClass122_Sub2_38.method4882(130);
			this.aClass122_Sub2_38.method4810();
			this.aClass122_Sub2_38.method4864(this.aClass122_Sub2_38.aClass66_Sub1_6);
			this.aClass122_Sub2_38.method4860(8448, 7681);
			this.aClass122_Sub2_38.method4815(0, 34166, 770);
			this.aClass122_Sub2_38.method4816(0, 34167);
			for (@Pc(225) Class3 local225 = this.aClass127_30.method3402(); local225 != null; local225 = this.aClass127_30.method3400()) {
				@Pc(230) Class3_Sub21 local230 = (Class3_Sub21) local225;
				local230.method1760(arg0, arg1, arg2, arg3);
			}
			this.aClass122_Sub2_38.method4815(0, 5890, 768);
			this.aClass122_Sub2_38.method4816(0, 5890);
			this.aClass122_Sub2_38.method4864(null);
			this.aClass122_Sub2_38.method4718(local97, local169);
		}
		if (this.aClass11_2 != null) {
			this.aClass122_Sub2_38.method4744(local10, local6 - 8.0F);
			this.aClass122_Sub2_38.method4820();
			this.aClass122_Sub2_38.method4832(this.aClass117_13);
			this.aClass122_Sub2_38.method4827(0, this.aClass117_14);
			this.aClass122_Sub2_38.method4879();
			this.aClass11_2.method222(arg2, arg4, arg3, arg0, arg1);
		}
		this.aClass122_Sub2_38.method4744(local10, local6);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(2) int local2 = arg8.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local2; local45++) {
			@Pc(52) int local52 = arg5[local45];
			@Pc(56) int local56 = arg6[local45];
			@Pc(60) int local60 = arg7[local45];
			local7[local43] = arg2[local52];
			local12[local43] = arg4[local52];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local52];
			}
			local43++;
			local7[local43] = arg2[local56];
			local12[local43] = arg4[local56];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local56];
			}
			local43++;
			local7[local43] = arg2[local60];
			local12[local43] = arg4[local60];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local60];
			}
			local43++;
		}
		this.method4674(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	@Override
	public void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!c;IIIIZ)V")
	@Override
	public void method4676(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass11_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass122_Sub2_38.anInt5620 >> 8) >> this.aClass122_Sub2_38.anInt5611;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass122_Sub2_38.anInt5636 >> 8) >> this.aClass122_Sub2_38.anInt5611;
			this.aClass11_2.method229(arg0, local33, local19);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4666(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5587 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass122_Sub2_38.anOpengl2;
		this.aClass122_Sub2_38.method4848();
		this.aClass122_Sub2_38.method4852(false);
		this.aClass122_Sub2_38.method4880(false);
		this.aClass122_Sub2_38.method4871(false);
		this.aClass122_Sub2_38.method4841(false);
		this.aClass122_Sub2_38.method4882(0);
		this.aClass122_Sub2_38.method4810();
		this.aClass122_Sub2_38.method4864(null);
		Static280.aFloatArray21[0] = (float) 1024 / ((float) this.anInt5581 * 128.0F * (float) this.aClass122_Sub2_38.anInt5609);
		Static280.aFloatArray21[1] = 0.0F;
		Static280.aFloatArray21[2] = 0.0F;
		Static280.aFloatArray21[3] = 0.0F;
		Static280.aFloatArray21[4] = 0.0F;
		Static280.aFloatArray21[5] = (float) 1024 / ((float) this.anInt5581 * 128.0F * (float) this.aClass122_Sub2_38.anInt5614);
		Static280.aFloatArray21[6] = 0.0F;
		Static280.aFloatArray21[7] = 0.0F;
		Static280.aFloatArray21[8] = 0.0F;
		Static280.aFloatArray21[9] = 0.0F;
		Static280.aFloatArray21[10] = 0.0F;
		Static280.aFloatArray21[11] = 0.0F;
		Static280.aFloatArray21[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass122_Sub2_38.anInt5609;
		Static280.aFloatArray21[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass122_Sub2_38.anInt5614;
		Static280.aFloatArray21[14] = 0.0F;
		Static280.aFloatArray21[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static280.aFloatArray21, 0);
		Static280.aFloatArray21[0] = 1.0F;
		Static280.aFloatArray21[1] = 0.0F;
		Static280.aFloatArray21[2] = 0.0F;
		Static280.aFloatArray21[3] = 0.0F;
		Static280.aFloatArray21[4] = 0.0F;
		Static280.aFloatArray21[5] = 0.0F;
		Static280.aFloatArray21[6] = 1.0F;
		Static280.aFloatArray21[7] = 0.0F;
		Static280.aFloatArray21[8] = 0.0F;
		Static280.aFloatArray21[9] = 1.0F;
		Static280.aFloatArray21[10] = 0.0F;
		Static280.aFloatArray21[11] = 0.0F;
		Static280.aFloatArray21[12] = 0.0F;
		Static280.aFloatArray21[13] = 0.0F;
		Static280.aFloatArray21[14] = 0.0F;
		Static280.aFloatArray21[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static280.aFloatArray21, 0);
		this.aClass122_Sub2_38.method4824();
		this.aClass122_Sub2_38.method4851(this.aClass117_11);
		this.aClass122_Sub2_38.method4832(this.aClass117_13);
		this.aClass122_Sub2_38.method4827(0, this.aClass117_14);
		if ((this.anInt5582 & 0x7) == 0) {
			this.aClass122_Sub2_38.method4880(false);
		} else {
			this.aClass122_Sub2_38.method4835(this.aClass117_12);
			this.aClass122_Sub2_38.method4880(true);
		}
		this.aClass122_Sub2_38.method4879();
		if (Static280.aClass3_Sub4_8.aByteArray70.length < this.anInt5584 * 2) {
			Static280.aClass3_Sub4_8 = new Class3_Sub4(this.anInt5584 * 2);
		} else {
			Static280.aClass3_Sub4_8.anInt4268 = 0;
		}
		@Pc(301) int local301 = 0;
		@Pc(307) int local307;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(337) short[] local337;
		@Pc(341) int local341;
		if (this.aClass122_Sub2_38.aBoolean363) {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt5574 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray6[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static280.aClass3_Sub4_8.method3660(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		} else {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt5574 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray6[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static280.aClass3_Sub4_8.method3616(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		}
		if (local301 > 0) {
			this.aClass122_Sub2_38.anInterface8_5.method5257(Static280.aClass3_Sub4_8.aByteArray70, Static280.aClass3_Sub4_8.anInt4268);
			this.aClass122_Sub2_38.method4840(this.aClass122_Sub2_38.anInterface8_5, 0, local301);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!c;IIIIZ)V")
	@Override
	public void method4673(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass11_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass122_Sub2_38.anInt5620 >> 8) >> this.aClass122_Sub2_38.anInt5611;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass122_Sub2_38.anInt5636 >> 8) >> this.aClass122_Sub2_38.anInt5611;
			this.aClass11_2.method230(local19, local33, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		@Pc(45) Class3_Sub16[] local45 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1] = new Class3_Sub16[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class3 local79 = this.aClass24_26.method609(local73);
			if (local79 == null) {
				local45[local47] = new Class3_Sub16(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass24_26.method598(local73, local45[local47]);
			} else {
				local45[local47] = (Class3_Sub16) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray17[arg0][arg1] = (byte) (this.aByteArrayArray17[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt5586) {
			this.anInt5586 = arg5.length;
		}
		this.anInt5587 += arg5.length;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	@Override
	public void method4679() {
		if (this.anInt5587 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt5574 + 1][this.anInt5577 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt5574; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt5577; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray18[local14 - 1][local20] >> 2) + (this.aByteArrayArray18[local14 + 1][local20] >> 3) + (this.aByteArrayArray18[local14][local20 - 1] >> 2) + (this.aByteArrayArray18[local14][local20 + 1] >> 3) + (this.aByteArrayArray18[local14][local20] >> 1));
				}
			}
			this.aClass3_Sub16Array1 = new Class3_Sub16[this.aClass24_26.method607()];
			this.aClass24_26.method594(this.aClass3_Sub16Array1);
			for (local14 = 0; local14 < this.aClass3_Sub16Array1.length; local14++) {
				this.aClass3_Sub16Array1[local14].method1311(this.anInt5587);
			}
			local14 = 24;
			if (this.anIntArrayArray52 != null) {
				local14 += 4;
			}
			if ((this.anInt5582 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt5587 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class3_Sub16[] local141 = new Class3_Sub16[this.anInt5587];
			@Pc(149) Class24 local149 = new Class24(Static89.method5618(this.anInt5587));
			@Pc(153) Class3_Sub16[] local153 = new Class3_Sub16[this.anInt5586];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt5574; local155++) {
				for (local161 = 0; local161 < this.anInt5577; local161++) {
					if (this.anIntArrayArrayArray9[local155][local161] != null) {
						@Pc(180) Class3_Sub16[] local180 = this.aClass3_Sub16ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray6[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray10[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray9[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray5[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray4[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray6[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray4[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray6[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray4[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray6[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray4[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray6[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray52 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray52[local155][local161];
							local388 = this.anIntArrayArray52[local155][local161 + 1];
							local400 = this.anIntArrayArray52[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray52[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label303: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class3_Sub16 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label303;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray6[local161 * this.anInt5574 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt5580) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt5580) + local201[local467];
							@Pc(493) int local493 = local215[local467];
							@Pc(497) int local497 = local208[local467];
							@Pc(505) int local505 = local187 == null ? 0 : local187[local467];
							@Pc(523) long local523 = (long) local497 << 48 | (long) local493 << 32 | (long) (local480 << 16) | (long) local489;
							@Pc(527) int local527 = local194[local467];
							@Pc(531) int local531 = local201[local467];
							@Pc(535) int local535 = 0;
							@Pc(537) float local537 = 1.0F;
							@Pc(553) int local553;
							@Pc(543) float local543;
							@Pc(545) float local545;
							@Pc(547) float local547;
							@Pc(549) float local549;
							@Pc(643) float local643;
							if (local527 == 0 && local531 == 0) {
								local543 = local226;
								local545 = local233;
								local547 = local240;
								local549 = local378;
								local553 = 74 - local335;
							} else if (local527 == 0 && local531 == this.anInt5581) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt5581 && local531 == this.anInt5581) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt5581 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt5581;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt5581;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt5580);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt5580);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt5580);
								@Pc(742) float local742 = local378 + (local410 - local378) * local620;
								@Pc(750) float local750 = local388 + (local400 - local388) * local620;
								local549 = local742 + (local750 - local742) * local627;
							}
							if (local493 != -1) {
								@Pc(769) int local769 = (local493 & 0x7F) * local553 >> 7;
								if (local769 < 2) {
									local769 = 2;
								} else if (local769 > 126) {
									local769 = 126;
								}
								local535 = Static295.anIntArray477[local493 & 0xFF80 | local769];
								if ((this.anInt5582 & 0x7) == 0) {
									local537 = this.aClass122_Sub2_38.aFloatArray26[0] * local543 + this.aClass122_Sub2_38.aFloatArray26[1] * local545 + this.aClass122_Sub2_38.aFloatArray26[2] * local547;
									local537 = this.aClass122_Sub2_38.aFloat49 + local537 * (local537 > 0.0F ? this.aClass122_Sub2_38.aFloat56 : this.aClass122_Sub2_38.aFloat62);
								}
							}
							@Pc(840) Class3 local840 = local149.method609(local523);
							@Pc(872) int local872;
							if (local840 == null) {
								if (local497 == local493) {
									local872 = local535;
								} else {
									@Pc(853) int local853 = (local497 & 0x7F) * local553 >> 7;
									if (local853 < 2) {
										local853 = 2;
									} else if (local853 > 126) {
										local853 = 126;
									}
									local872 = Static295.anIntArray477[local497 & 0xFF80 | local853];
									if ((this.anInt5582 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass122_Sub2_38.aFloatArray26[0] * local543 + this.aClass122_Sub2_38.aFloatArray26[1] * local545 + this.aClass122_Sub2_38.aFloatArray26[2] * local547;
										local643 = this.aClass122_Sub2_38.aFloat49 + local537 * (local537 > 0.0F ? this.aClass122_Sub2_38.aFloat56 : this.aClass122_Sub2_38.aFloat62);
										@Pc(925) int local925 = local872 >> 16 & 0xFF;
										@Pc(931) int local931 = local872 >> 8 & 0xFF;
										@Pc(935) int local935 = local872 & 0xFF;
										local925 = (int) ((float) local925 * local643);
										if (local925 < 0) {
											local925 = 0;
										} else if (local925 > 255) {
											local925 = 255;
										}
										local931 = (int) ((float) local931 * local643);
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local935 = (int) ((float) local935 * local643);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local872 = local925 << 16 | local931 << 8 | local935;
									}
								}
								local137.putFloat((float) local480);
								local137.putFloat((float) (this.method4678(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								if ((this.anInt5582 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								if (this.anIntArrayArray52 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								local433 = this.anInt5583++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method598(local523, new Class3_Sub9(local465[local467]));
							} else {
								local465[local467] = ((Class3_Sub9) local840).aShort4;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong211 < local141[local433].aLong211) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method1310(local553, local537, local433, local535);
							}
							this.anInt5584++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt5583; local155++) {
				@Pc(1178) Class3_Sub16 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method1309(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt5574; local155++) {
				for (local161 = 0; local161 < this.anInt5577; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray6[local161 * this.anInt5574 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class3_Sub16 local1243 = local141[local1225];
							@Pc(1247) Class3_Sub16 local1247 = local141[local1232];
							@Pc(1251) Class3_Sub16 local1251 = local141[local1239];
							@Pc(1253) Class3_Sub16 local1253 = null;
							if (local1243 != null) {
								local1243.method1313(local161, local1212, local155);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method1313(local161, local1212, local155);
								if (local1253 == null || local1247.aLong211 < local1253.aLong211) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method1313(local161, local1212, local155);
								if (local1253 == null || local1251.aLong211 < local1253.aLong211) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method1309(local1225);
								}
								if (local1247 != null) {
									local1253.method1309(local1232);
								}
								if (local1251 != null) {
									local1253.method1309(local1239);
								}
								local1253.method1313(local161, local1212, local155);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface6_5 = this.aClass122_Sub2_38.method4853(local14, local137);
			local155 = 24;
			this.aClass117_13 = new Class117(this.aClass122_Sub2_38, this.anInterface6_5, 5126, 3, 0);
			this.aClass117_14 = new Class117(this.aClass122_Sub2_38, this.anInterface6_5, 5126, 2, 12);
			this.aClass117_11 = new Class117(this.aClass122_Sub2_38, this.anInterface6_5, 5121, 4, 20);
			if ((this.anInt5582 & 0x7) != 0) {
				this.aClass117_12 = new Class117(this.aClass122_Sub2_38, this.anInterface6_5, 5126, 3, 24);
				local155 += 12;
			}
			if (this.anIntArrayArray52 != null) {
				this.aClass117_15 = new Class117(this.aClass122_Sub2_38, this.anInterface6_5, 5126, 1, local155);
				local155 += 4;
			}
			@Pc(1419) long[] local1419 = new long[this.aClass3_Sub16Array1.length];
			for (@Pc(1421) int local1421 = 0; local1421 < this.aClass3_Sub16Array1.length; local1421++) {
				@Pc(1431) Class3_Sub16 local1431 = this.aClass3_Sub16Array1[local1421];
				local1419[local1421] = local1431.aLong211;
				local1431.method1314(this.anInt5583);
			}
			Static279.method4664(local1419, this.aClass3_Sub16Array1);
			if (this.aClass11_2 != null) {
				this.aClass11_2.method224();
			}
		} else {
			this.aClass11_2 = null;
		}
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass3_Sub16ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray18 = null;
		this.aClass24_26 = null;
		this.anIntArrayArray52 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lclient!c;IIIIZ)Z")
	@Override
	public boolean method4677(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass11_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass122_Sub2_38.anInt5620 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass122_Sub2_38.anInt5636 >> 8) >> 3;
			return this.aClass11_2.method227(arg0, local30, local18);
		}
	}
}
