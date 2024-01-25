import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "[Lclient!jj;")
	private Class7_Sub18[] aClass7_Sub18Array1;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "Lclient!rs;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "Lclient!rs;")
	public Class181 aClass181_2;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Lclient!rs;")
	public Class181 aClass181_3;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!hk;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "Lclient!rs;")
	public Class181 aClass181_4;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "Lclient!rs;")
	public Class181 aClass181_5;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!fi;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "Lclient!hd;")
	public final Class89_Sub1 aClass89_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "[[I")
	private final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
	public final int anInt148;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
	public final int anInt151;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "[[[Lclient!jj;")
	private Class7_Sub18[][][] aClass7_Sub18ArrayArrayArray1;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[[B")
	private final byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!aj;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "Lclient!dm;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!hd;IIII[[I[[II)V")
	public Class8_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass89_Sub1_1 = arg0;
		this.anIntArrayArray2 = arg5;
		this.anIntArrayArray3 = arg6;
		this.anInt148 = arg2;
		while (arg7 > 1) {
			this.anInt147++;
			arg7 >>= 0x1;
		}
		this.anInt151 = 0x1 << this.anInt147;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aClass7_Sub18ArrayArrayArray1 = new Class7_Sub18[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray4 = new byte[arg3][arg4];
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray2[local124 + 1][local119] - this.anIntArrayArray2[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray2[local124][local119 + 1] - this.anIntArrayArray2[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray3[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray2[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray1[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass10_3 = new Class10(128);
		if ((this.anInt148 & 0x10) != 0) {
			this.aClass53_1 = new Class53(this.aClass89_Sub1_1, this);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!bj;II)V")
	private void method141(@OriginalArg(0) Class7_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray3[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static7.anIntArray20.length < local16) {
			Static7.anIntArray20 = new int[local16];
			Static7.anIntArray21 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static7.anIntArray20[local28] = (local6[local28] & 0xFF) >> this.aClass89_Sub1_1.anInt2607;
			Static7.anIntArray21[local28] = (local13[local28] & 0xFF) >> this.aClass89_Sub1_1.anInt2607;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static7.anIntArray20[local28];
			@Pc(71) int local71 = Static7.anIntArray21[local28++];
			@Pc(75) int local75 = Static7.anIntArray20[local28];
			@Pc(80) int local80 = Static7.anIntArray21[local28++];
			@Pc(84) int local84 = Static7.anIntArray20[local28];
			@Pc(89) int local89 = Static7.anIntArray21[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method475(local84, local66, local75, local71, local89, local80);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass7_Sub18Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass89_Sub1_1.aFloat34;
		@Pc(10) float local10 = this.aClass89_Sub1_1.aFloat30;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static7.anIntArray19.length < local20) {
			Static7.anIntArray19 = new int[local20];
		}
		if (Static7.aClass7_Sub3_1.aByteArray33.length < this.anInt150 * 2) {
			Static7.aClass7_Sub3_1 = new Class7_Sub3(this.anInt150 * 2);
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
		if (local67 > this.anInt4755 - 1) {
			local67 = this.anInt4755 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt4760 - 1) {
			local82 = this.anInt4760 - 1;
		}
		Static7.anInt152 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static7.anIntArray19[Static7.anInt152++] = local108 * this.anInt4755 + local97;
				}
			}
		}
		this.aClass89_Sub1_1.method2420();
		for (local97 = 0; local97 < this.aClass7_Sub18Array1.length; local97++) {
			this.aClass7_Sub18Array1[local97].method2986(Static7.anInt152, Static7.anIntArray19);
		}
		if (!this.aClass74_1.method1800()) {
			local97 = this.aClass89_Sub1_1.anInt2617;
			@Pc(169) int local169 = this.aClass89_Sub1_1.anInt2626;
			this.aClass89_Sub1_1.method5479(0, local169);
			this.aClass89_Sub1_1.method5463(local10, local6 - 4.0F);
			this.aClass89_Sub1_1.method2407(false);
			this.aClass89_Sub1_1.method2424(false);
			this.aClass89_Sub1_1.method2403(130);
			this.aClass89_Sub1_1.method2438();
			this.aClass89_Sub1_1.method2445(this.aClass89_Sub1_1.aClass92_Sub4_5);
			this.aClass89_Sub1_1.method2419(8448, 7681);
			this.aClass89_Sub1_1.method2392(0, 34166, 770);
			this.aClass89_Sub1_1.method2451(0, 34167);
			for (@Pc(225) Class7 local225 = this.aClass74_1.method1793(); local225 != null; local225 = this.aClass74_1.method1798()) {
				@Pc(230) Class7_Sub7 local230 = (Class7_Sub7) local225;
				local230.method1400(arg0, arg2, arg1, arg3);
			}
			this.aClass89_Sub1_1.method2392(0, 5890, 768);
			this.aClass89_Sub1_1.method2451(0, 5890);
			this.aClass89_Sub1_1.method2445(null);
			this.aClass89_Sub1_1.method5479(local97, local169);
		}
		if (this.aClass53_1 != null) {
			this.aClass89_Sub1_1.method5463(local10, local6 - 8.0F);
			this.aClass89_Sub1_1.method2420();
			this.aClass89_Sub1_1.method2427(this.aClass181_4);
			this.aClass89_Sub1_1.method2426(0, this.aClass181_5);
			this.aClass89_Sub1_1.method2435();
			this.aClass53_1.method1287(arg1, arg4, arg2, arg3, arg0);
		}
		this.aClass89_Sub1_1.method5463(local10, local6);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lclient!ug;IIIIZ)V")
	@Override
	public void method4159(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass53_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass89_Sub1_1.anInt2622 >> 8) >> this.aClass89_Sub1_1.anInt2607;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass89_Sub1_1.anInt2635 >> 8) >> this.aClass89_Sub1_1.anInt2607;
			this.aClass53_1.method1288(local33, arg0, local19);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg5;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		@Pc(45) Class7_Sub18[] local45 = this.aClass7_Sub18ArrayArrayArray1[arg0][arg1] = new Class7_Sub18[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class7 local79 = this.aClass10_3.method163(local73);
			if (local79 == null) {
				local45[local47] = new Class7_Sub18(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass10_3.method161(local73, local45[local47]);
			} else {
				local45[local47] = (Class7_Sub18) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt153) {
			this.anInt153 = arg5.length;
		}
		this.anInt154 += arg5.length;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray5[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	@Override
	public void method4163() {
		if (this.anInt154 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt4755 + 1][this.anInt4760 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt4755; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt4760; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray5[local14 - 1][local20] >> 2) + (this.aByteArrayArray5[local14 + 1][local20] >> 3) + (this.aByteArrayArray5[local14][local20 - 1] >> 2) + (this.aByteArrayArray5[local14][local20 + 1] >> 3) + (this.aByteArrayArray5[local14][local20] >> 1));
				}
			}
			this.aClass7_Sub18Array1 = new Class7_Sub18[this.aClass10_3.method159()];
			this.aClass10_3.method160(this.aClass7_Sub18Array1);
			for (local14 = 0; local14 < this.aClass7_Sub18Array1.length; local14++) {
				this.aClass7_Sub18Array1[local14].method2983(this.anInt154);
			}
			local14 = 24;
			if (this.anIntArrayArray3 != null) {
				local14 += 4;
			}
			if ((this.anInt148 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt154 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class7_Sub18[] local141 = new Class7_Sub18[this.anInt154];
			@Pc(149) Class10 local149 = new Class10(Static108.method1053(this.anInt154));
			@Pc(153) Class7_Sub18[] local153 = new Class7_Sub18[this.anInt153];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt4755; local155++) {
				for (local161 = 0; local161 < this.anInt4760; local161++) {
					if (this.anIntArrayArrayArray1[local155][local161] != null) {
						@Pc(180) Class7_Sub18[] local180 = this.aClass7_Sub18ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray2[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray3[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray5[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray4[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray1[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray3[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray2[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray1[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray2[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray1[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray2[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray1[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray2[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray1[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray3 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray3[local155][local161];
							local388 = this.anIntArrayArray3[local155][local161 + 1];
							local400 = this.anIntArrayArray3[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray3[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label303: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class7_Sub18 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label303;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray1[local161 * this.anInt4755 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt147) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt147) + local201[local467];
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
							} else if (local527 == 0 && local531 == this.anInt151) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt151 && local531 == this.anInt151) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt151 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt151;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt151;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt147);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt147);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt147);
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
								local535 = Static80.anIntArray288[local493 & 0xFF80 | local769];
								if ((this.anInt148 & 0x7) == 0) {
									local537 = this.aClass89_Sub1_1.aFloatArray10[0] * local543 + this.aClass89_Sub1_1.aFloatArray10[1] * local545 + this.aClass89_Sub1_1.aFloatArray10[2] * local547;
									local537 = this.aClass89_Sub1_1.aFloat39 + local537 * (local537 > 0.0F ? this.aClass89_Sub1_1.aFloat36 : this.aClass89_Sub1_1.aFloat33);
								}
							}
							@Pc(840) Class7 local840 = local149.method163(local523);
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
									local872 = Static80.anIntArray288[local497 & 0xFF80 | local853];
									if ((this.anInt148 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass89_Sub1_1.aFloatArray10[0] * local543 + this.aClass89_Sub1_1.aFloatArray10[1] * local545 + this.aClass89_Sub1_1.aFloatArray10[2] * local547;
										local643 = this.aClass89_Sub1_1.aFloat39 + local537 * (local537 > 0.0F ? this.aClass89_Sub1_1.aFloat36 : this.aClass89_Sub1_1.aFloat33);
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
								local137.putFloat((float) (this.method4169(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								if ((this.anInt148 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								if (this.anIntArrayArray3 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								local433 = this.anInt149++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method161(local523, new Class7_Sub23(local465[local467]));
							} else {
								local465[local467] = ((Class7_Sub23) local840).aShort54;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong232 < local141[local433].aLong232) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method2987(local535, local433, local537, local553);
							}
							this.anInt150++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt149; local155++) {
				@Pc(1178) Class7_Sub18 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method2982(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt4755; local155++) {
				for (local161 = 0; local161 < this.anInt4760; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray1[local161 * this.anInt4755 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class7_Sub18 local1243 = local141[local1225];
							@Pc(1247) Class7_Sub18 local1247 = local141[local1232];
							@Pc(1251) Class7_Sub18 local1251 = local141[local1239];
							@Pc(1253) Class7_Sub18 local1253 = null;
							if (local1243 != null) {
								local1243.method2985(local161, local1212, local155);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method2985(local161, local1212, local155);
								if (local1253 == null || local1247.aLong232 < local1253.aLong232) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method2985(local161, local1212, local155);
								if (local1253 == null || local1251.aLong232 < local1253.aLong232) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method2982(local1225);
								}
								if (local1247 != null) {
									local1253.method2982(local1232);
								}
								if (local1251 != null) {
									local1253.method2982(local1239);
								}
								local1253.method2985(local161, local1212, local155);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface3_1 = this.aClass89_Sub1_1.method2437(local14, local137);
			local155 = 24;
			this.aClass181_4 = new Class181(this.aClass89_Sub1_1, this.anInterface3_1, 5126, 3, 0);
			this.aClass181_5 = new Class181(this.aClass89_Sub1_1, this.anInterface3_1, 5126, 2, 12);
			this.aClass181_1 = new Class181(this.aClass89_Sub1_1, this.anInterface3_1, 5121, 4, 20);
			if ((this.anInt148 & 0x7) != 0) {
				this.aClass181_3 = new Class181(this.aClass89_Sub1_1, this.anInterface3_1, 5126, 3, 24);
				local155 += 12;
			}
			if (this.anIntArrayArray3 != null) {
				this.aClass181_2 = new Class181(this.aClass89_Sub1_1, this.anInterface3_1, 5126, 1, local155);
				local155 += 4;
			}
			@Pc(1419) long[] local1419 = new long[this.aClass7_Sub18Array1.length];
			for (@Pc(1421) int local1421 = 0; local1421 < this.aClass7_Sub18Array1.length; local1421++) {
				@Pc(1431) Class7_Sub18 local1431 = this.aClass7_Sub18Array1[local1421];
				local1419[local1421] = local1431.aLong232;
				local1431.method2984(this.anInt149);
			}
			Static33.method682(local1419, this.aClass7_Sub18Array1);
			if (this.aClass53_1 != null) {
				this.aClass53_1.method1290();
			}
		} else {
			this.aClass53_1 = null;
		}
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass7_Sub18ArrayArrayArray1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aByteArrayArray5 = null;
		this.aClass10_3 = null;
		this.anIntArrayArray3 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!j;[I)V")
	@Override
	public void method4162(@OriginalArg(0) Class7_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass74_1.method1802(new Class7_Sub7(this.aClass89_Sub1_1, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
	@Override
	public int method4169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt147;
		@Pc(9) int local9 = arg1 >> this.anInt147;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt4755 - 1 || local9 > this.anInt4760 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt151 - 1;
		@Pc(41) int local41 = arg1 & this.anInt151 - 1;
		@Pc(67) int local67 = this.anIntArrayArray2[local4][local9] * (this.anInt151 - local34) + this.anIntArrayArray2[local4 + 1][local9] * local34 >> this.anInt147;
		@Pc(97) int local97 = this.anIntArrayArray2[local4][local9 + 1] * (this.anInt151 - local34) + this.anIntArrayArray2[local4 + 1][local9 + 1] * local34 >> this.anInt147;
		return local67 * (this.anInt151 - local41) + local97 * local41 >> this.anInt147;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4171(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt154 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass89_Sub1_1.anOpengl2;
		this.aClass89_Sub1_1.method2449();
		this.aClass89_Sub1_1.method2436(false);
		this.aClass89_Sub1_1.method2407(false);
		this.aClass89_Sub1_1.method2414(false);
		this.aClass89_Sub1_1.method2424(false);
		this.aClass89_Sub1_1.method2403(0);
		this.aClass89_Sub1_1.method2438();
		this.aClass89_Sub1_1.method2445(null);
		Static7.aFloatArray1[0] = (float) 1024 / ((float) this.anInt151 * 128.0F * (float) this.aClass89_Sub1_1.anInt2602);
		Static7.aFloatArray1[1] = 0.0F;
		Static7.aFloatArray1[2] = 0.0F;
		Static7.aFloatArray1[3] = 0.0F;
		Static7.aFloatArray1[4] = 0.0F;
		Static7.aFloatArray1[5] = (float) 1024 / ((float) this.anInt151 * 128.0F * (float) this.aClass89_Sub1_1.anInt2603);
		Static7.aFloatArray1[6] = 0.0F;
		Static7.aFloatArray1[7] = 0.0F;
		Static7.aFloatArray1[8] = 0.0F;
		Static7.aFloatArray1[9] = 0.0F;
		Static7.aFloatArray1[10] = 0.0F;
		Static7.aFloatArray1[11] = 0.0F;
		Static7.aFloatArray1[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass89_Sub1_1.anInt2602;
		Static7.aFloatArray1[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass89_Sub1_1.anInt2603;
		Static7.aFloatArray1[14] = 0.0F;
		Static7.aFloatArray1[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static7.aFloatArray1, 0);
		Static7.aFloatArray1[0] = 1.0F;
		Static7.aFloatArray1[1] = 0.0F;
		Static7.aFloatArray1[2] = 0.0F;
		Static7.aFloatArray1[3] = 0.0F;
		Static7.aFloatArray1[4] = 0.0F;
		Static7.aFloatArray1[5] = 0.0F;
		Static7.aFloatArray1[6] = 1.0F;
		Static7.aFloatArray1[7] = 0.0F;
		Static7.aFloatArray1[8] = 0.0F;
		Static7.aFloatArray1[9] = 1.0F;
		Static7.aFloatArray1[10] = 0.0F;
		Static7.aFloatArray1[11] = 0.0F;
		Static7.aFloatArray1[12] = 0.0F;
		Static7.aFloatArray1[13] = 0.0F;
		Static7.aFloatArray1[14] = 0.0F;
		Static7.aFloatArray1[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static7.aFloatArray1, 0);
		this.aClass89_Sub1_1.method2400();
		this.aClass89_Sub1_1.method2467(this.aClass181_1);
		this.aClass89_Sub1_1.method2427(this.aClass181_4);
		this.aClass89_Sub1_1.method2426(0, this.aClass181_5);
		if ((this.anInt148 & 0x7) == 0) {
			this.aClass89_Sub1_1.method2407(false);
		} else {
			this.aClass89_Sub1_1.method2421(this.aClass181_3);
			this.aClass89_Sub1_1.method2407(true);
		}
		this.aClass89_Sub1_1.method2435();
		if (Static7.aClass7_Sub3_1.aByteArray33.length < this.anInt150 * 2) {
			Static7.aClass7_Sub3_1 = new Class7_Sub3(this.anInt150 * 2);
		} else {
			Static7.aClass7_Sub3_1.anInt3005 = 0;
		}
		@Pc(301) int local301 = 0;
		@Pc(307) int local307;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(337) short[] local337;
		@Pc(341) int local341;
		if (this.aClass89_Sub1_1.aBoolean195) {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt4755 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray1[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static7.aClass7_Sub3_1.method2788(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		} else {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt4755 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray1[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static7.aClass7_Sub3_1.method2753(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		}
		if (local301 > 0) {
			this.aClass89_Sub1_1.anInterface9_3.method5712(Static7.aClass7_Sub3_1.aByteArray33, Static7.aClass7_Sub3_1.anInt3005);
			this.aClass89_Sub1_1.method2398(this.aClass89_Sub1_1.anInterface9_3, 0, local301);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ug;IIIIZ)Z")
	@Override
	public boolean method4158(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass53_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass89_Sub1_1.anInt2622 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass89_Sub1_1.anInt2635 >> 8) >> 3;
			return this.aClass53_1.method1291(local18, arg0, local30);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
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
		this.method4161(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!ug;)Lclient!ug;")
	@Override
	public Class7_Sub1_Sub4 method4165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt151 >> this.aClass89_Sub1_1.anInt2607;
		@Pc(20) Class7_Sub1_Sub4_Sub1 local20 = (Class7_Sub1_Sub4_Sub1) arg2;
		@Pc(30) Class7_Sub1_Sub4_Sub1 local30;
		if (local20 != null && local20.method474(local17, local17)) {
			local30 = local20;
			local20.method478();
		} else {
			local30 = new Class7_Sub1_Sub4_Sub1(this.aClass89_Sub1_1, local17, local17);
		}
		local30.method476(0, local17, 0, local17);
		this.method141(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lclient!ug;IIIIZ)V")
	@Override
	public void method4164(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass53_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass89_Sub1_1.anInt2622 >> 8) >> this.aClass89_Sub1_1.anInt2607;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass89_Sub1_1.anInt2635 >> 8) >> this.aClass89_Sub1_1.anInt2607;
			this.aClass53_1.method1286(local19, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	@Override
	public void method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I")
	@Override
	public int method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray2[arg0][arg1];
	}
}
