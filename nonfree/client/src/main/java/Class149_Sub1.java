import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!to", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	private int anInt6296;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	private int anInt6298;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "I")
	private int anInt6301;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "I")
	private int anInt6302;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "Lclient!eb;")
	private Interface2 anInterface2_6;

	@OriginalMember(owner = "client!to", name = "E", descriptor = "Lclient!fh;")
	public Class75 aClass75_10;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "[Lclient!us;")
	private Class2_Sub40[] aClass2_Sub40Array1;

	@OriginalMember(owner = "client!to", name = "L", descriptor = "Lclient!fh;")
	public Class75 aClass75_11;

	@OriginalMember(owner = "client!to", name = "N", descriptor = "Lclient!fh;")
	private Class75 aClass75_12;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "Lclient!fh;")
	public Class75 aClass75_13;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Lclient!vf;")
	private final Class238 aClass238_40 = new Class238();

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Lclient!ic;")
	public final Class48_Sub2 aClass48_Sub2_34;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "[[I")
	private final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "I")
	public final int anInt6300;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public int anInt6297;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "I")
	public final int anInt6299;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "[[[Lclient!us;")
	private Class2_Sub40[][][] aClass2_Sub40ArrayArrayArray1;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[[S")
	public final short[][] aShortArrayArray26;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!to", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "Lclient!wb;")
	private Class243 aClass243_31;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!vb;")
	private Class236 aClass236_2;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ic;IIII[[I[[II)V")
	public Class149_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass48_Sub2_34 = arg0;
		this.anIntArrayArray55 = arg5;
		this.anInt6300 = arg2;
		while (arg7 > 1) {
			this.anInt6297++;
			arg7 >>= 0x1;
		}
		this.anInt6299 = 0x1 << this.anInt6297;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aClass2_Sub40ArrayArrayArray1 = new Class2_Sub40[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aShortArrayArray26 = new short[arg3 * arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray6 = new float[this.anInt6741 + 1][this.anInt6740 + 1];
		this.aFloatArrayArray8 = new float[this.anInt6741 + 1][this.anInt6740 + 1];
		this.aFloatArrayArray7 = new float[this.anInt6741 + 1][this.anInt6740 + 1];
		for (@Pc(122) int local122 = 1; local122 < this.anInt6740; local122++) {
			for (@Pc(128) int local128 = 1; local128 < this.anInt6741; local128++) {
				@Pc(148) int local148 = arg6[local128 + 1][local122] - arg6[local128 - 1][local122];
				@Pc(164) int local164 = arg6[local128][local122 + 1] - arg6[local128][local122 - 1];
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local164 * local164 + 65536)));
				this.aFloatArrayArray6[local128][local122] = (float) local148 * local179;
				this.aFloatArrayArray8[local128][local122] = -256.0F * local179;
				this.aFloatArrayArray7[local128][local122] = (float) local164 * local179;
			}
		}
		this.aClass243_31 = new Class243(128);
		if ((this.anInt6300 & 0x10) != 0) {
			this.aClass236_2 = new Class236(this.aClass48_Sub2_34, this);
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)I")
	@Override
	public int method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6297;
		@Pc(9) int local9 = arg1 >> this.anInt6297;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt6741 - 1 || local9 > this.anInt6740 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6299 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6299 - 1;
		@Pc(67) int local67 = this.anIntArrayArray55[local4][local9] * (this.anInt6299 - local34) + this.anIntArrayArray55[local4 + 1][local9] * local34 >> this.anInt6297;
		@Pc(97) int local97 = this.anIntArrayArray55[local4][local9 + 1] * (this.anInt6299 - local34) + this.anIntArrayArray55[local4 + 1][local9 + 1] * local34 >> this.anInt6297;
		return local67 * (this.anInt6299 - local41) + local97 * local41 >> this.anInt6297;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ph;IIIIZ)V")
	@Override
	public void method5840(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass48_Sub2_34.anInt3087 >> 8) >> this.aClass48_Sub2_34.anInt3051;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass48_Sub2_34.anInt3074 >> 8) >> this.aClass48_Sub2_34.anInt3051;
			this.aClass236_2.method5704(local19, local33, arg0);
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(II)V")
	@Override
	public void method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!kl;II)V")
	private void method5477(@OriginalArg(0) Class2_Sub7_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray10[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray15[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static341.anIntArray537.length < local16) {
			Static341.anIntArray537 = new int[local16];
			Static341.anIntArray538 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static341.anIntArray537[local28] = (local6[local28] & 0xFF) >> this.aClass48_Sub2_34.anInt3051;
			Static341.anIntArray538[local28] = (local13[local28] & 0xFF) >> this.aClass48_Sub2_34.anInt3051;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static341.anIntArray537[local28];
			@Pc(71) int local71 = Static341.anIntArray538[local28++];
			@Pc(75) int local75 = Static341.anIntArray537[local28];
			@Pc(80) int local80 = Static341.anIntArray538[local28++];
			@Pc(84) int local84 = Static341.anIntArray537[local28];
			@Pc(89) int local89 = Static341.anIntArray538[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method3362(local89, local66, local71, local75, local80, local84);
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
	@Override
	public int method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray55[arg0][arg1];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5831(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6302 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass48_Sub2_34.anOpengl2;
		this.aClass48_Sub2_34.method2578();
		this.aClass48_Sub2_34.method2600(false);
		this.aClass48_Sub2_34.method2558(false);
		this.aClass48_Sub2_34.method2582(false);
		this.aClass48_Sub2_34.method2603(false);
		this.aClass48_Sub2_34.method2569(0);
		this.aClass48_Sub2_34.method2589();
		this.aClass48_Sub2_34.method2573(null);
		Static341.aFloatArray28[0] = (float) 1024 / ((float) this.anInt6299 * 128.0F * (float) this.aClass48_Sub2_34.anInt3052);
		Static341.aFloatArray28[1] = 0.0F;
		Static341.aFloatArray28[2] = 0.0F;
		Static341.aFloatArray28[3] = 0.0F;
		Static341.aFloatArray28[4] = 0.0F;
		Static341.aFloatArray28[5] = (float) 1024 / ((float) this.anInt6299 * 128.0F * (float) this.aClass48_Sub2_34.anInt3044);
		Static341.aFloatArray28[6] = 0.0F;
		Static341.aFloatArray28[7] = 0.0F;
		Static341.aFloatArray28[8] = 0.0F;
		Static341.aFloatArray28[9] = 0.0F;
		Static341.aFloatArray28[10] = 0.0F;
		Static341.aFloatArray28[11] = 0.0F;
		Static341.aFloatArray28[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass48_Sub2_34.anInt3052;
		Static341.aFloatArray28[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass48_Sub2_34.anInt3044;
		Static341.aFloatArray28[14] = 0.0F;
		Static341.aFloatArray28[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static341.aFloatArray28, 0);
		Static341.aFloatArray28[0] = 1.0F;
		Static341.aFloatArray28[1] = 0.0F;
		Static341.aFloatArray28[2] = 0.0F;
		Static341.aFloatArray28[3] = 0.0F;
		Static341.aFloatArray28[4] = 0.0F;
		Static341.aFloatArray28[5] = 0.0F;
		Static341.aFloatArray28[6] = 1.0F;
		Static341.aFloatArray28[7] = 0.0F;
		Static341.aFloatArray28[8] = 0.0F;
		Static341.aFloatArray28[9] = 1.0F;
		Static341.aFloatArray28[10] = 0.0F;
		Static341.aFloatArray28[11] = 0.0F;
		Static341.aFloatArray28[12] = 0.0F;
		Static341.aFloatArray28[13] = 0.0F;
		Static341.aFloatArray28[14] = 0.0F;
		Static341.aFloatArray28[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static341.aFloatArray28, 0);
		if ((this.anInt6300 & 0x7) == 0) {
			this.aClass48_Sub2_34.method2558(false);
		} else {
			this.aClass48_Sub2_34.method2558(true);
			this.aClass48_Sub2_34.method2625();
		}
		this.aClass48_Sub2_34.method2586(this.aClass75_11, this.aClass75_13, this.aClass75_12, this.aClass75_10);
		if (Static341.aClass2_Sub24_5.aByteArray100.length < this.anInt6298 * 2) {
			Static341.aClass2_Sub24_5 = new Class2_Sub24(this.anInt6298 * 2);
		} else {
			Static341.aClass2_Sub24_5.anInt6669 = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass48_Sub2_34.aBoolean218) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt6741 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray26[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static341.aClass2_Sub24_5.method5721(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt6741 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray26[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static341.aClass2_Sub24_5.method5717(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class99_Sub2 local418 = new Class99_Sub2(this.aClass48_Sub2_34, 5123, Static341.aClass2_Sub24_5.aByteArray100, Static341.aClass2_Sub24_5.anInt6669);
			this.aClass48_Sub2_34.method2580(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	@Override
	public void method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ph;IIIIZ)V")
	@Override
	public void method5832(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass48_Sub2_34.anInt3087 >> 8) >> this.aClass48_Sub2_34.anInt3051;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass48_Sub2_34.anInt3074 >> 8) >> this.aClass48_Sub2_34.anInt3051;
			this.aClass236_2.method5697(local19, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[this.anInt6741][this.anInt6740][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt6741][this.anInt6740][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray14[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(82) Class2_Sub40[] local82 = this.aClass2_Sub40ArrayArrayArray1[arg0][arg1] = new Class2_Sub40[arg6.length];
		for (@Pc(84) int local84 = 0; local84 < arg6.length; local84++) {
			@Pc(115) long local115 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local84] << 14) | (long) arg8[local84];
			@Pc(121) Class2 local121;
			for (local121 = this.aClass243_31.method5967(local115); local121 != null; local121 = this.aClass243_31.method5971()) {
				@Pc(126) Class2_Sub40 local126 = (Class2_Sub40) local121;
				if (local126.anInt6598 == arg8[local84] && local126.aFloat75 == (float) arg9[local84] && local126.anInt6595 == arg10 && local126.anInt6597 == arg11 && local126.anInt6596 == arg12) {
					break;
				}
			}
			if (local121 == null) {
				local82[local84] = new Class2_Sub40(this, arg8[local84], arg9[local84], arg10, arg11, arg12);
				this.aClass243_31.method5968(local115, local82[local84]);
			} else {
				local82[local84] = (Class2_Sub40) local121;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6301) {
			this.anInt6301 = arg6.length;
		}
		this.anInt6302 += arg6.length;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!hq;[I)V")
	@Override
	public void method5830(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass238_40.method5796(new Class2_Sub29(this.aClass48_Sub2_34, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass2_Sub40Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass48_Sub2_34.aFloat21;
		@Pc(10) float local10 = this.aClass48_Sub2_34.aFloat22;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static341.anIntArray536.length < local20) {
			Static341.anIntArray536 = new int[local20];
		}
		if (Static341.aClass2_Sub24_5.aByteArray100.length < this.anInt6298 * 2) {
			Static341.aClass2_Sub24_5 = new Class2_Sub24(this.anInt6298 * 2);
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
		if (local67 > this.anInt6741 - 1) {
			local67 = this.anInt6741 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt6740 - 1) {
			local82 = this.anInt6740 - 1;
		}
		Static341.anInt6303 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static341.anIntArray536[Static341.anInt6303++] = local108 * this.anInt6741 + local97;
				}
			}
		}
		this.aClass48_Sub2_34.method2592();
		this.aClass48_Sub2_34.method2558((this.anInt6300 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass2_Sub40Array1.length; local97++) {
			this.aClass2_Sub40Array1[local97].method5685(Static341.anIntArray536, Static341.anInt6303);
		}
		if (!this.aClass238_40.method5805()) {
			local97 = this.aClass48_Sub2_34.anInt3088;
			@Pc(180) int local180 = this.aClass48_Sub2_34.anInt3072;
			this.aClass48_Sub2_34.method2475(0, local180);
			this.aClass48_Sub2_34.method2460(local10, local6 - 4.0F);
			this.aClass48_Sub2_34.method2558(false);
			this.aClass48_Sub2_34.method2603(false);
			this.aClass48_Sub2_34.method2569(130);
			this.aClass48_Sub2_34.method2589();
			this.aClass48_Sub2_34.method2573(this.aClass48_Sub2_34.aClass81_Sub2_1);
			this.aClass48_Sub2_34.method2563(8448, 7681);
			this.aClass48_Sub2_34.method2611(0, 34166, 770);
			this.aClass48_Sub2_34.method2575(0, 34167);
			for (@Pc(236) Class2 local236 = this.aClass238_40.method5795(); local236 != null; local236 = this.aClass238_40.method5799()) {
				@Pc(241) Class2_Sub29 local241 = (Class2_Sub29) local236;
				local241.method4125(arg0, arg3, arg1, arg2);
			}
			this.aClass48_Sub2_34.method2611(0, 5890, 768);
			this.aClass48_Sub2_34.method2575(0, 5890);
			this.aClass48_Sub2_34.method2573(null);
			this.aClass48_Sub2_34.method2475(local97, local180);
		}
		if (this.aClass236_2 != null) {
			this.aClass48_Sub2_34.method2460(local10, local6 - 8.0F);
			this.aClass48_Sub2_34.method2592();
			this.aClass48_Sub2_34.method2586(this.aClass75_11, null, null, this.aClass75_10);
			this.aClass236_2.method5699(arg1, arg3, arg4, arg2, arg0);
		}
		this.aClass48_Sub2_34.method2460(local10, local6);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
	@Override
	public void method5836() {
		if (this.anInt6302 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt6741 + 1][this.anInt6740 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt6741; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt6740; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray20[local14 - 1][local20] >> 2) + (this.aByteArrayArray20[local14 + 1][local20] >> 3) + (this.aByteArrayArray20[local14][local20 - 1] >> 2) + (this.aByteArrayArray20[local14][local20 + 1] >> 3) + (this.aByteArrayArray20[local14][local20] >> 1));
				}
			}
			this.aClass2_Sub40Array1 = new Class2_Sub40[this.aClass243_31.method5964()];
			this.aClass243_31.method5977(this.aClass2_Sub40Array1);
			for (local14 = 0; local14 < this.aClass2_Sub40Array1.length; local14++) {
				this.aClass2_Sub40Array1[local14].method5683(this.anInt6302);
			}
			local14 = 24;
			if (this.anIntArrayArrayArray12 != null) {
				local14 += 4;
			}
			if ((this.anInt6300 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt6302 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class2_Sub40[] local141 = new Class2_Sub40[this.anInt6302];
			@Pc(149) Class243 local149 = new Class243(Static65.method1195(this.anInt6302));
			@Pc(153) Class2_Sub40[] local153 = new Class2_Sub40[this.anInt6301];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt6741; local155++) {
				for (local161 = 0; local161 < this.anInt6740; local161++) {
					if (this.anIntArrayArrayArray14[local155][local161] != null) {
						@Pc(180) Class2_Sub40[] local180 = this.aClass2_Sub40ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray10[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray15[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray13[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray14[local155][local161];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local155][local161];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local155][local161];
						if (local201 == null) {
							local201 = local208;
						}
						@Pc(243) float local243 = this.aFloatArrayArray6[local155][local161];
						@Pc(250) float local250 = this.aFloatArrayArray8[local155][local161];
						@Pc(257) float local257 = this.aFloatArrayArray7[local155][local161];
						@Pc(266) float local266 = this.aFloatArrayArray6[local155][local161 + 1];
						@Pc(275) float local275 = this.aFloatArrayArray8[local155][local161 + 1];
						@Pc(284) float local284 = this.aFloatArrayArray7[local155][local161 + 1];
						@Pc(295) float local295 = this.aFloatArrayArray6[local155 + 1][local161 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray8[local155 + 1][local161 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray7[local155 + 1][local161 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray6[local155 + 1][local161];
						@Pc(335) float local335 = this.aFloatArrayArray8[local155 + 1][local161];
						@Pc(344) float local344 = this.aFloatArrayArray7[local155 + 1][local161];
						@Pc(352) int local352 = local12[local155][local161] & 0xFF;
						@Pc(362) int local362 = local12[local155][local161 + 1] & 0xFF;
						@Pc(374) int local374 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(384) int local384 = local12[local155 + 1][local161] & 0xFF;
						@Pc(386) int local386 = 0;
						@Pc(398) int local398;
						label314: for (@Pc(388) int local388 = 0; local388 < local208.length; local388++) {
							@Pc(396) Class2_Sub40 local396 = local180[local388];
							for (local398 = 0; local398 < local386; local398++) {
								if (local153[local398] == local396) {
									continue label314;
								}
							}
							local153[local386++] = local396;
						}
						@Pc(430) short[] local430 = this.aShortArrayArray26[local161 * this.anInt6741 + local155] = new short[local208.length];
						for (@Pc(432) int local432 = 0; local432 < local208.length; local432++) {
							@Pc(445) int local445 = (local155 << this.anInt6297) + local187[local432];
							@Pc(454) int local454 = (local161 << this.anInt6297) + local194[local432];
							@Pc(458) int local458 = local208[local432];
							@Pc(462) int local462 = local201[local432];
							@Pc(470) int local470 = local220 == null ? 0 : local220[local432];
							@Pc(488) long local488 = (long) local462 << 48 | (long) local458 << 32 | (long) (local445 << 16) | (long) local454;
							@Pc(492) int local492 = local187[local432];
							@Pc(496) int local496 = local194[local432];
							@Pc(500) int local500 = 0;
							@Pc(502) float local502 = 1.0F;
							@Pc(516) int local516;
							@Pc(508) float local508;
							@Pc(510) float local510;
							@Pc(512) float local512;
							@Pc(600) float local600;
							if (local492 == 0 && local496 == 0) {
								local508 = local243;
								local510 = local250;
								local512 = local257;
								local516 = 74 - local352;
							} else if (local492 == 0 && local496 == this.anInt6299) {
								local508 = local266;
								local510 = local275;
								local512 = local284;
								local516 = 74 - local362;
							} else if (local492 == this.anInt6299 && local496 == this.anInt6299) {
								local508 = local295;
								local510 = local306;
								local512 = local317;
								local516 = 74 - local374;
							} else if (local492 == this.anInt6299 && local496 == 0) {
								local508 = local326;
								local510 = local335;
								local512 = local344;
								local516 = 74 - local384;
							} else {
								@Pc(577) float local577 = (float) local492 / (float) this.anInt6299;
								@Pc(584) float local584 = (float) local496 / (float) this.anInt6299;
								@Pc(592) float local592 = local243 + (local326 - local243) * local577;
								local600 = local250 + (local335 - local250) * local577;
								@Pc(608) float local608 = local257 + (local344 - local257) * local577;
								@Pc(616) float local616 = local266 + (local295 - local266) * local577;
								@Pc(624) float local624 = local275 + (local306 - local275) * local577;
								@Pc(632) float local632 = local284 + (local317 - local284) * local577;
								local508 = local592 + (local616 - local592) * local584;
								local510 = local600 + (local624 - local600) * local584;
								local512 = local608 + (local632 - local608) * local584;
								@Pc(667) int local667 = local352 + ((local384 - local352) * local492 >> this.anInt6297);
								@Pc(678) int local678 = local362 + ((local374 - local362) * local492 >> this.anInt6297);
								local516 = 74 - local667 - ((local678 - local667) * local496 >> this.anInt6297);
							}
							if (local458 != -1) {
								@Pc(702) int local702 = (local458 & 0x7F) * local516 >> 7;
								if (local702 < 2) {
									local702 = 2;
								} else if (local702 > 126) {
									local702 = 126;
								}
								local500 = Static261.anIntArray406[local458 & 0xFF80 | local702];
								if ((this.anInt6300 & 0x7) == 0) {
									local502 = this.aClass48_Sub2_34.lb[0] * local508 + this.aClass48_Sub2_34.lb[1] * local510 + this.aClass48_Sub2_34.lb[2] * local512;
									local502 = this.aClass48_Sub2_34.aFloat29 + local502 * (local502 > 0.0F ? this.aClass48_Sub2_34.aFloat10 : this.aClass48_Sub2_34.aFloat17);
								}
							}
							@Pc(773) Class2 local773 = local149.method5967(local488);
							@Pc(805) int local805;
							if (local773 == null) {
								if (local462 == local458) {
									local805 = local500;
								} else {
									@Pc(786) int local786 = (local462 & 0x7F) * local516 >> 7;
									if (local786 < 2) {
										local786 = 2;
									} else if (local786 > 126) {
										local786 = 126;
									}
									local805 = Static261.anIntArray406[local462 & 0xFF80 | local786];
									if ((this.anInt6300 & 0x7) == 0) {
										@Pc(833) float local833 = this.aClass48_Sub2_34.lb[0] * local508 + this.aClass48_Sub2_34.lb[1] * local510 + this.aClass48_Sub2_34.lb[2] * local512;
										local600 = this.aClass48_Sub2_34.aFloat29 + local502 * (local502 > 0.0F ? this.aClass48_Sub2_34.aFloat10 : this.aClass48_Sub2_34.aFloat17);
										@Pc(858) int local858 = local805 >> 16 & 0xFF;
										@Pc(864) int local864 = local805 >> 8 & 0xFF;
										@Pc(868) int local868 = local805 & 0xFF;
										local858 = (int) ((float) local858 * local600);
										if (local858 < 0) {
											local858 = 0;
										} else if (local858 > 255) {
											local858 = 255;
										}
										local864 = (int) ((float) local864 * local600);
										if (local864 < 0) {
											local864 = 0;
										} else if (local864 > 255) {
											local864 = 255;
										}
										local868 = (int) ((float) local868 * local600);
										if (local868 < 0) {
											local868 = 0;
										} else if (local868 > 255) {
											local868 = 255;
										}
										local805 = local858 << 16 | local864 << 8 | local868;
									}
								}
								local137.putFloat((float) local445);
								local137.putFloat((float) (this.method5839(local445, local454) + local470));
								local137.putFloat((float) local454);
								local137.put((byte) (local805 >> 16));
								local137.put((byte) (local805 >> 8));
								local137.put((byte) local805);
								local137.put((byte) -1);
								local137.putFloat((float) local445);
								local137.putFloat((float) local454);
								if (this.anIntArrayArrayArray12 != null) {
									local137.putFloat(local232 == null ? 0.0F : (float) local232[local432]);
								}
								if ((this.anInt6300 & 0x7) != 0) {
									local137.putFloat(local508);
									local137.putFloat(local510);
									local137.putFloat(local512);
								}
								local398 = this.anInt6296++;
								local430[local432] = (short) local398;
								if (local458 != -1) {
									local141[local398] = local180[local432];
								}
								local149.method5968(local488, new Class2_Sub3(local430[local432]));
							} else {
								local430[local432] = ((Class2_Sub3) local773).aShort4;
								local398 = local430[local432] & 0xFFFF;
								if (local458 != -1 && local180[local432].aLong213 < local141[local398].aLong213) {
									local141[local398] = local180[local432];
								}
							}
							for (local805 = 0; local805 < local386; local805++) {
								local153[local805].method5684(local516, local500, local398, local502);
							}
							this.anInt6298++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt6296; local155++) {
				@Pc(1115) Class2_Sub40 local1115 = local141[local155];
				if (local1115 != null) {
					local1115.method5680(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt6741; local155++) {
				for (local161 = 0; local161 < this.anInt6740; local161++) {
					@Pc(1145) short[] local1145 = this.aShortArrayArray26[local161 * this.anInt6741 + local155];
					if (local1145 != null) {
						@Pc(1149) int local1149 = 0;
						@Pc(1151) int local1151 = 0;
						while (local1151 < local1145.length) {
							@Pc(1162) int local1162 = local1145[local1151++] & 0xFFFF;
							@Pc(1169) int local1169 = local1145[local1151++] & 0xFFFF;
							@Pc(1176) int local1176 = local1145[local1151++] & 0xFFFF;
							@Pc(1180) Class2_Sub40 local1180 = local141[local1162];
							@Pc(1184) Class2_Sub40 local1184 = local141[local1169];
							@Pc(1188) Class2_Sub40 local1188 = local141[local1176];
							@Pc(1190) Class2_Sub40 local1190 = null;
							if (local1180 != null) {
								local1180.method5681(local155, local161, local1149);
								local1190 = local1180;
							}
							if (local1184 != null) {
								local1184.method5681(local155, local161, local1149);
								if (local1190 == null || local1184.aLong213 < local1190.aLong213) {
									local1190 = local1184;
								}
							}
							if (local1188 != null) {
								local1188.method5681(local155, local161, local1149);
								if (local1190 == null || local1188.aLong213 < local1190.aLong213) {
									local1190 = local1188;
								}
							}
							if (local1190 != null) {
								if (local1180 != null) {
									local1190.method5680(local1162);
								}
								if (local1184 != null) {
									local1190.method5680(local1169);
								}
								if (local1188 != null) {
									local1190.method5680(local1176);
								}
								local1190.method5681(local155, local161, local1149);
							}
							local1149++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface2_6 = this.aClass48_Sub2_34.method2557(local14, local137);
			this.aClass75_11 = new Class75(this.aClass48_Sub2_34, this.anInterface2_6, 5126, 3, 0);
			this.aClass75_12 = new Class75(this.aClass48_Sub2_34, this.anInterface2_6, 5121, 4, 12);
			@Pc(1320) byte local1320;
			if (this.anIntArrayArrayArray12 == null) {
				this.aClass75_10 = new Class75(this.aClass48_Sub2_34, this.anInterface2_6, 5126, 2, 16);
				local1320 = 24;
			} else {
				this.aClass75_10 = new Class75(this.aClass48_Sub2_34, this.anInterface2_6, 5126, 3, 16);
				local1320 = 28;
			}
			if ((this.anInt6300 & 0x7) != 0) {
				this.aClass75_13 = new Class75(this.aClass48_Sub2_34, this.anInterface2_6, 5126, 3, local1320);
			}
			@Pc(1357) long[] local1357 = new long[this.aClass2_Sub40Array1.length];
			for (@Pc(1359) int local1359 = 0; local1359 < this.aClass2_Sub40Array1.length; local1359++) {
				@Pc(1369) Class2_Sub40 local1369 = this.aClass2_Sub40Array1[local1359];
				local1357[local1359] = local1369.aLong213;
				local1369.method5682(this.anInt6296);
			}
			Static97.method1696(local1357, this.aClass2_Sub40Array1);
			if (this.aClass236_2 != null) {
				this.aClass236_2.method5696();
			}
		} else {
			this.aClass236_2 = null;
		}
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass2_Sub40ArrayArrayArray1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aByteArrayArray20 = null;
		this.aClass243_31 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!ph;)Lclient!ph;")
	@Override
	public Class2_Sub7_Sub11 method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub11 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt6299 >> this.aClass48_Sub2_34.anInt3051;
		@Pc(20) Class2_Sub7_Sub11_Sub1 local20 = (Class2_Sub7_Sub11_Sub1) arg2;
		@Pc(30) Class2_Sub7_Sub11_Sub1 local30;
		if (local20 != null && local20.method3359(local17, local17)) {
			local30 = local20;
			local20.method3363();
		} else {
			local30 = new Class2_Sub7_Sub11_Sub1(this.aClass48_Sub2_34, local17, local17);
		}
		local30.method3361(0, 0, local17, local17);
		this.method5477(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method5842(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(Lclient!ph;IIIIZ)Z")
	@Override
	public boolean method5841(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass236_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass48_Sub2_34.anInt3087 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass48_Sub2_34.anInt3074 >> 8) >> 3;
			return this.aClass236_2.method5700(local18, local30, arg0);
		}
	}
}
