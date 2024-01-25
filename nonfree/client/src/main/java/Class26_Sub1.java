import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
	private int anInt2236;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	private int anInt2237;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	private int anInt2242;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "[Lclient!oi;")
	private Class4_Sub33[] aClass4_Sub33Array1;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!bb;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	private int anInt2243;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "Lclient!bb;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Lclient!ip;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!bb;")
	public Class19 aClass19_3;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!bb;")
	public Class19 aClass19_4;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!bb;")
	private Class19 aClass19_5;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!mk;")
	private final Class130 aClass130_40 = new Class130();

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!ql;")
	public final Class92_Sub2 aClass92_Sub2_11;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[[I")
	private final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	public final int anInt2240;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public int anInt2239;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public final int anInt2238;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[[[Lclient!oi;")
	private Class4_Sub33[][][] aClass4_Sub33ArrayArrayArray1;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[[B")
	private final byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lclient!uc;")
	private Class198 aClass198_12;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!sr;")
	private Class193 aClass193_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ql;IIII[[I[[II)V")
	public Class26_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass92_Sub2_11 = arg0;
		this.anIntArrayArray26 = arg5;
		this.anIntArrayArray27 = arg6;
		this.anInt2240 = arg2;
		while (arg7 > 1) {
			this.anInt2239++;
			arg7 >>= 0x1;
		}
		this.anInt2238 = 0x1 << this.anInt2239;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass4_Sub33ArrayArrayArray1 = new Class4_Sub33[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.aByteArrayArray5 = new byte[arg3][arg4];
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray26[local124 + 1][local119] - this.anIntArrayArray26[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray26[local124][local119 + 1] - this.anIntArrayArray26[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray4[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray3[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray5[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass198_12 = new Class198(128);
		if ((this.anInt2240 & 0x10) != 0) {
			this.aClass193_1 = new Class193(this.aClass92_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lclient!ve;IIIIZ)Z")
	@Override
	public boolean method5003(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass193_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass92_Sub2_11.anInt5418 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass92_Sub2_11.anInt5393 >> 8) >> 3;
			return this.aClass193_1.method5053(arg0, local30, local18);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!fs;[I)V")
	@Override
	public void method4995(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass130_40.method3510(new Class4_Sub43(this.aClass92_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!ve;IIIIZ)V")
	@Override
	public void method4998(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass193_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass92_Sub2_11.anInt5418 >> 8) >> this.aClass92_Sub2_11.anInt5383;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass92_Sub2_11.anInt5393 >> 8) >> this.aClass92_Sub2_11.anInt5383;
			this.aClass193_1.method5055(local33, arg0, local19);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	@Override
	public void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray6[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass4_Sub33Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass92_Sub2_11.aFloat61;
		@Pc(10) float local10 = this.aClass92_Sub2_11.aFloat59;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static99.anIntArray222.length < local20) {
			Static99.anIntArray222 = new int[local20];
		}
		if (Static99.aClass4_Sub7_1.aByteArray42.length < this.anInt2236 * 2) {
			Static99.aClass4_Sub7_1 = new Class4_Sub7(this.anInt2236 * 2);
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
		if (local67 > this.anInt5941 - 1) {
			local67 = this.anInt5941 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt5936 - 1) {
			local82 = this.anInt5936 - 1;
		}
		Static99.anInt2241 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static99.anIntArray222[Static99.anInt2241++] = local108 * this.anInt5941 + local97;
				}
			}
		}
		this.aClass92_Sub2_11.method4551();
		for (local97 = 0; local97 < this.aClass4_Sub33Array1.length; local97++) {
			this.aClass4_Sub33Array1[local97].method3904(Static99.anIntArray222, Static99.anInt2241);
		}
		if (!this.aClass130_40.method3508()) {
			local97 = this.aClass92_Sub2_11.anInt5414;
			@Pc(169) int local169 = this.aClass92_Sub2_11.anInt5411;
			this.aClass92_Sub2_11.method4488(0, local169);
			this.aClass92_Sub2_11.method4539(local10, local6 - 4.0F);
			this.aClass92_Sub2_11.method4607(false);
			this.aClass92_Sub2_11.method4593(false);
			this.aClass92_Sub2_11.method4560(130);
			this.aClass92_Sub2_11.method4604();
			this.aClass92_Sub2_11.method4548(this.aClass92_Sub2_11.aClass70_Sub4_5);
			this.aClass92_Sub2_11.method4569(8448, 7681);
			this.aClass92_Sub2_11.method4578(0, 34166, 770);
			this.aClass92_Sub2_11.method4556(0, 34167);
			for (@Pc(225) Class4 local225 = this.aClass130_40.method3499(); local225 != null; local225 = this.aClass130_40.method3512()) {
				@Pc(230) Class4_Sub43 local230 = (Class4_Sub43) local225;
				local230.method5663(arg1, arg2, arg0, arg3);
			}
			this.aClass92_Sub2_11.method4578(0, 5890, 768);
			this.aClass92_Sub2_11.method4556(0, 5890);
			this.aClass92_Sub2_11.method4548(null);
			this.aClass92_Sub2_11.method4488(local97, local169);
		}
		if (this.aClass193_1 != null) {
			this.aClass92_Sub2_11.method4539(local10, local6 - 8.0F);
			this.aClass92_Sub2_11.method4551();
			this.aClass92_Sub2_11.method4553(this.aClass19_1);
			this.aClass92_Sub2_11.method4618(0, this.aClass19_3);
			this.aClass92_Sub2_11.method4601();
			this.aClass193_1.method5054(arg1, arg0, arg2, arg4, arg3);
		}
		this.aClass92_Sub2_11.method4539(local10, local6);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ac;II)V")
	private void method1819(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray11[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static99.anIntArray221.length < local16) {
			Static99.anIntArray221 = new int[local16];
			Static99.anIntArray220 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static99.anIntArray221[local28] = (local6[local28] & 0xFF) >> this.aClass92_Sub2_11.anInt5383;
			Static99.anIntArray220[local28] = (local13[local28] & 0xFF) >> this.aClass92_Sub2_11.anInt5383;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static99.anIntArray221[local28];
			@Pc(71) int local71 = Static99.anIntArray220[local28++];
			@Pc(75) int local75 = Static99.anIntArray221[local28];
			@Pc(80) int local80 = Static99.anIntArray220[local28++];
			@Pc(84) int local84 = Static99.anIntArray221[local28];
			@Pc(89) int local89 = Static99.anIntArray220[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method83(local71, local89, local66, local75, local80, local84);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ve;IIIIZ)V")
	@Override
	public void method4991(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass193_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass92_Sub2_11.anInt5418 >> 8) >> this.aClass92_Sub2_11.anInt5383;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass92_Sub2_11.anInt5393 >> 8) >> this.aClass92_Sub2_11.anInt5383;
			this.aClass193_1.method5048(local19, local33, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
	@Override
	public int method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt2239;
		@Pc(9) int local9 = arg1 >> this.anInt2239;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt5941 - 1 || local9 > this.anInt5936 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt2238 - 1;
		@Pc(41) int local41 = arg1 & this.anInt2238 - 1;
		@Pc(67) int local67 = this.anIntArrayArray26[local4][local9] * (this.anInt2238 - local34) + this.anIntArrayArray26[local4 + 1][local9] * local34 >> this.anInt2239;
		@Pc(97) int local97 = this.anIntArrayArray26[local4][local9 + 1] * (this.anInt2238 - local34) + this.anIntArrayArray26[local4 + 1][local9 + 1] * local34 >> this.anInt2239;
		return local67 * (this.anInt2238 - local41) + local97 * local41 >> this.anInt2239;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I")
	@Override
	public int method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray26[arg0][arg1];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!ve;)Lclient!ve;")
	@Override
	public Class4_Sub1_Sub1 method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt2238 >> this.aClass92_Sub2_11.anInt5383;
		@Pc(20) Class4_Sub1_Sub1_Sub1 local20 = (Class4_Sub1_Sub1_Sub1) arg2;
		@Pc(30) Class4_Sub1_Sub1_Sub1 local30;
		if (local20 != null && local20.method81(local17, local17)) {
			local30 = local20;
			local20.method79();
		} else {
			local30 = new Class4_Sub1_Sub1_Sub1(this.aClass92_Sub2_11, local17, local17);
		}
		local30.method80(0, local17, 0, local17);
		this.method1819(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
	@Override
	public void method5005() {
		if (this.anInt2243 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt5941 + 1][this.anInt5936 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt5941; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt5936; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray6[local14 - 1][local20] >> 2) + (this.aByteArrayArray6[local14 + 1][local20] >> 3) + (this.aByteArrayArray6[local14][local20 - 1] >> 2) + (this.aByteArrayArray6[local14][local20 + 1] >> 3) + (this.aByteArrayArray6[local14][local20] >> 1));
				}
			}
			this.aClass4_Sub33Array1 = new Class4_Sub33[this.aClass198_12.method5264()];
			this.aClass198_12.method5271(this.aClass4_Sub33Array1);
			for (local14 = 0; local14 < this.aClass4_Sub33Array1.length; local14++) {
				this.aClass4_Sub33Array1[local14].method3901(this.anInt2243);
			}
			local14 = 24;
			if (this.anIntArrayArray27 != null) {
				local14 += 4;
			}
			if ((this.anInt2240 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt2243 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class4_Sub33[] local141 = new Class4_Sub33[this.anInt2243];
			@Pc(149) Class198 local149 = new Class198(Static90.method1611(this.anInt2243));
			@Pc(153) Class4_Sub33[] local153 = new Class4_Sub33[this.anInt2242];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt5941; local155++) {
				for (local161 = 0; local161 < this.anInt5936; local161++) {
					if (this.anIntArrayArrayArray9[local155][local161] != null) {
						@Pc(180) Class4_Sub33[] local180 = this.aClass4_Sub33ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray10[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray11[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray9[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray4[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray3[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray5[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray4[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray4[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray4[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray27 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray27[local155][local161];
							local388 = this.anIntArrayArray27[local155][local161 + 1];
							local400 = this.anIntArrayArray27[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray27[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label303: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class4_Sub33 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label303;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray4[local161 * this.anInt5941 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt2239) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt2239) + local201[local467];
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
							} else if (local527 == 0 && local531 == this.anInt2238) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt2238 && local531 == this.anInt2238) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt2238 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt2238;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt2238;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt2239);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt2239);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt2239);
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
								local535 = Static133.anIntArray277[local493 & 0xFF80 | local769];
								if ((this.anInt2240 & 0x7) == 0) {
									local537 = this.aClass92_Sub2_11.aFloatArray16[0] * local543 + this.aClass92_Sub2_11.aFloatArray16[1] * local545 + this.aClass92_Sub2_11.aFloatArray16[2] * local547;
									local537 = this.aClass92_Sub2_11.aFloat67 + local537 * (local537 > 0.0F ? this.aClass92_Sub2_11.lb : this.aClass92_Sub2_11.aFloat57);
								}
							}
							@Pc(840) Class4 local840 = local149.method5261(local523);
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
									local872 = Static133.anIntArray277[local497 & 0xFF80 | local853];
									if ((this.anInt2240 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass92_Sub2_11.aFloatArray16[0] * local543 + this.aClass92_Sub2_11.aFloatArray16[1] * local545 + this.aClass92_Sub2_11.aFloatArray16[2] * local547;
										local643 = this.aClass92_Sub2_11.aFloat67 + local537 * (local537 > 0.0F ? this.aClass92_Sub2_11.lb : this.aClass92_Sub2_11.aFloat57);
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
								local137.putFloat((float) (this.method4990(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								if ((this.anInt2240 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								if (this.anIntArrayArray27 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								local433 = this.anInt2237++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method5267(local523, new Class4_Sub11(local465[local467]));
							} else {
								local465[local467] = ((Class4_Sub11) local840).aShort39;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong259 < local141[local433].aLong259) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method3900(local535, local553, local537, local433);
							}
							this.anInt2236++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt2237; local155++) {
				@Pc(1178) Class4_Sub33 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method3905(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt5941; local155++) {
				for (local161 = 0; local161 < this.anInt5936; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray4[local161 * this.anInt5941 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class4_Sub33 local1243 = local141[local1225];
							@Pc(1247) Class4_Sub33 local1247 = local141[local1232];
							@Pc(1251) Class4_Sub33 local1251 = local141[local1239];
							@Pc(1253) Class4_Sub33 local1253 = null;
							if (local1243 != null) {
								local1243.method3903(local1212, local155, local161);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method3903(local1212, local155, local161);
								if (local1253 == null || local1247.aLong259 < local1253.aLong259) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method3903(local1212, local155, local161);
								if (local1253 == null || local1251.aLong259 < local1253.aLong259) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method3905(local1225);
								}
								if (local1247 != null) {
									local1253.method3905(local1232);
								}
								if (local1251 != null) {
									local1253.method3905(local1239);
								}
								local1253.method3903(local1212, local155, local161);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface6_2 = this.aClass92_Sub2_11.method4552(local14, local137);
			local155 = 24;
			this.aClass19_1 = new Class19(this.aClass92_Sub2_11, this.anInterface6_2, 5126, 3, 0);
			this.aClass19_3 = new Class19(this.aClass92_Sub2_11, this.anInterface6_2, 5126, 2, 12);
			this.aClass19_5 = new Class19(this.aClass92_Sub2_11, this.anInterface6_2, 5121, 4, 20);
			if ((this.anInt2240 & 0x7) != 0) {
				this.aClass19_2 = new Class19(this.aClass92_Sub2_11, this.anInterface6_2, 5126, 3, 24);
				local155 += 12;
			}
			if (this.anIntArrayArray27 != null) {
				this.aClass19_4 = new Class19(this.aClass92_Sub2_11, this.anInterface6_2, 5126, 1, local155);
				local155 += 4;
			}
			@Pc(1419) long[] local1419 = new long[this.aClass4_Sub33Array1.length];
			for (@Pc(1421) int local1421 = 0; local1421 < this.aClass4_Sub33Array1.length; local1421++) {
				@Pc(1431) Class4_Sub33 local1431 = this.aClass4_Sub33Array1[local1421];
				local1419[local1421] = local1431.aLong259;
				local1431.method3902(this.anInt2237);
			}
			Static325.method5348(local1419, this.aClass4_Sub33Array1);
			if (this.aClass193_1 != null) {
				this.aClass193_1.method5050();
			}
		} else {
			this.aClass193_1 = null;
		}
		this.anIntArrayArrayArray11 = this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass4_Sub33ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray6 = null;
		this.aClass198_12 = null;
		this.anIntArrayArray27 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		@Pc(45) Class4_Sub33[] local45 = this.aClass4_Sub33ArrayArrayArray1[arg0][arg1] = new Class4_Sub33[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class4 local79 = this.aClass198_12.method5261(local73);
			if (local79 == null) {
				local45[local47] = new Class4_Sub33(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass198_12.method5267(local73, local45[local47]);
			} else {
				local45[local47] = (Class4_Sub33) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray5[arg0][arg1] = (byte) (this.aByteArrayArray5[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt2242) {
			this.anInt2242 = arg5.length;
		}
		this.anInt2243 += arg5.length;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
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
		this.method5000(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5004(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2243 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass92_Sub2_11.anOpengl2;
		this.aClass92_Sub2_11.method4563();
		this.aClass92_Sub2_11.method4588(false);
		this.aClass92_Sub2_11.method4607(false);
		this.aClass92_Sub2_11.method4606(false);
		this.aClass92_Sub2_11.method4593(false);
		this.aClass92_Sub2_11.method4560(0);
		this.aClass92_Sub2_11.method4604();
		this.aClass92_Sub2_11.method4548(null);
		Static99.aFloatArray3[0] = (float) 1024 / ((float) this.anInt2238 * 128.0F * (float) this.aClass92_Sub2_11.anInt5379);
		Static99.aFloatArray3[1] = 0.0F;
		Static99.aFloatArray3[2] = 0.0F;
		Static99.aFloatArray3[3] = 0.0F;
		Static99.aFloatArray3[4] = 0.0F;
		Static99.aFloatArray3[5] = (float) 1024 / ((float) this.anInt2238 * 128.0F * (float) this.aClass92_Sub2_11.anInt5377);
		Static99.aFloatArray3[6] = 0.0F;
		Static99.aFloatArray3[7] = 0.0F;
		Static99.aFloatArray3[8] = 0.0F;
		Static99.aFloatArray3[9] = 0.0F;
		Static99.aFloatArray3[10] = 0.0F;
		Static99.aFloatArray3[11] = 0.0F;
		Static99.aFloatArray3[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass92_Sub2_11.anInt5379;
		Static99.aFloatArray3[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass92_Sub2_11.anInt5377;
		Static99.aFloatArray3[14] = 0.0F;
		Static99.aFloatArray3[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static99.aFloatArray3, 0);
		Static99.aFloatArray3[0] = 1.0F;
		Static99.aFloatArray3[1] = 0.0F;
		Static99.aFloatArray3[2] = 0.0F;
		Static99.aFloatArray3[3] = 0.0F;
		Static99.aFloatArray3[4] = 0.0F;
		Static99.aFloatArray3[5] = 0.0F;
		Static99.aFloatArray3[6] = 1.0F;
		Static99.aFloatArray3[7] = 0.0F;
		Static99.aFloatArray3[8] = 0.0F;
		Static99.aFloatArray3[9] = 1.0F;
		Static99.aFloatArray3[10] = 0.0F;
		Static99.aFloatArray3[11] = 0.0F;
		Static99.aFloatArray3[12] = 0.0F;
		Static99.aFloatArray3[13] = 0.0F;
		Static99.aFloatArray3[14] = 0.0F;
		Static99.aFloatArray3[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static99.aFloatArray3, 0);
		this.aClass92_Sub2_11.method4608();
		this.aClass92_Sub2_11.method4595(this.aClass19_5);
		this.aClass92_Sub2_11.method4553(this.aClass19_1);
		this.aClass92_Sub2_11.method4618(0, this.aClass19_3);
		if ((this.anInt2240 & 0x7) == 0) {
			this.aClass92_Sub2_11.method4607(false);
		} else {
			this.aClass92_Sub2_11.method4584(this.aClass19_2);
			this.aClass92_Sub2_11.method4607(true);
		}
		this.aClass92_Sub2_11.method4601();
		if (Static99.aClass4_Sub7_1.aByteArray42.length < this.anInt2236 * 2) {
			Static99.aClass4_Sub7_1 = new Class4_Sub7(this.anInt2236 * 2);
		} else {
			Static99.aClass4_Sub7_1.anInt2667 = 0;
		}
		@Pc(301) int local301 = 0;
		@Pc(307) int local307;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(337) short[] local337;
		@Pc(341) int local341;
		if (this.aClass92_Sub2_11.aBoolean459) {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt5941 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray4[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static99.aClass4_Sub7_1.method2376(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		} else {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt5941 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray4[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static99.aClass4_Sub7_1.method2400(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		}
		if (local301 > 0) {
			this.aClass92_Sub2_11.anInterface3_4.method4363(Static99.aClass4_Sub7_1.aByteArray42, Static99.aClass4_Sub7_1.anInt2667);
			this.aClass92_Sub2_11.method4557(this.aClass92_Sub2_11.anInterface3_4, 0, local301);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	@Override
	public void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
