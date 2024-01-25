import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!er", name = "H", descriptor = "Lclient!wi;")
	private Class217 aClass217_5;

	@OriginalMember(owner = "client!er", name = "J", descriptor = "Lclient!wi;")
	public Class217 aClass217_6;

	@OriginalMember(owner = "client!er", name = "K", descriptor = "Lclient!wi;")
	public Class217 aClass217_7;

	@OriginalMember(owner = "client!er", name = "L", descriptor = "I")
	private int anInt2111;

	@OriginalMember(owner = "client!er", name = "M", descriptor = "Lclient!wi;")
	public Class217 aClass217_8;

	@OriginalMember(owner = "client!er", name = "P", descriptor = "[Lclient!qs;")
	private Class4_Sub37[] aClass4_Sub37Array1;

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
	private int anInt2112;

	@OriginalMember(owner = "client!er", name = "R", descriptor = "Lclient!mp;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!kn;")
	private final Class116 aClass116_10 = new Class116();

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!ig;")
	public final Class47_Sub2 aClass47_Sub2_11;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "[[I")
	private final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!er", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!er", name = "w", descriptor = "I")
	public final int anInt2108;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	public final int anInt2106;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "[[[Lclient!qs;")
	private Class4_Sub37[][][] aClass4_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!er", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "[[B")
	private final byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!er", name = "T", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!er", name = "S", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!er", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!er", name = "N", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!er", name = "I", descriptor = "Lclient!dj;")
	private Class43 aClass43_12;

	@OriginalMember(owner = "client!er", name = "C", descriptor = "Lclient!wd;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ig;IIII[[I[[II)V")
	public Class60_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass47_Sub2_11 = arg0;
		this.anIntArrayArray55 = arg5;
		this.anIntArrayArray56 = arg6;
		this.anInt2108 = arg2;
		while (arg7 > 1) {
			this.anInt2110++;
			arg7 >>= 0x1;
		}
		this.anInt2106 = 0x1 << this.anInt2110;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aClass4_Sub37ArrayArrayArray1 = new Class4_Sub37[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray55[local124 + 1][local119] - this.anIntArrayArray55[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray55[local124][local119 + 1] - this.anIntArrayArray55[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray2[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray3[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray1[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass43_12 = new Class43(128);
		if ((this.anInt2108 & 0x10) != 0) {
			this.aClass213_2 = new Class213(this.aClass47_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
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
		this.method2260(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		@Pc(45) Class4_Sub37[] local45 = this.aClass4_Sub37ArrayArrayArray1[arg0][arg1] = new Class4_Sub37[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class4 local79 = this.aClass43_12.method1273(local73);
			if (local79 == null) {
				local45[local47] = new Class4_Sub37(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass43_12.method1276(local45[local47], local73);
			} else {
				local45[local47] = (Class4_Sub37) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt2111) {
			this.anInt2111 = arg5.length;
		}
		this.anInt2112 += arg5.length;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!o;)Lclient!o;")
	@Override
	public Class4_Sub4_Sub4 method2274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub4 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt2106 >> this.aClass47_Sub2_11.anInt3060;
		@Pc(20) Class4_Sub4_Sub4_Sub1 local20 = (Class4_Sub4_Sub4_Sub1) arg2;
		@Pc(30) Class4_Sub4_Sub4_Sub1 local30;
		if (local20 != null && local20.method2484(local17, local17)) {
			local30 = local20;
			local20.method2483();
		} else {
			local30 = new Class4_Sub4_Sub4_Sub1(this.aClass47_Sub2_11, local17, local17);
		}
		local30.method2480(0, local17, local17, 0);
		this.method1990(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!o;IIIIZ)V")
	@Override
	public void method2265(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass213_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass47_Sub2_11.anInt3070 >> 8) >> this.aClass47_Sub2_11.anInt3060;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass47_Sub2_11.anInt3084 >> 8) >> this.aClass47_Sub2_11.anInt3060;
			this.aClass213_2.method5523(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!pc;[I)V")
	@Override
	public void method2262(@OriginalArg(0) Class4_Sub33 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass116_10.method3274(new Class4_Sub40(this.aClass47_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2273(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2112 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass47_Sub2_11.anOpengl2;
		this.aClass47_Sub2_11.method2816();
		this.aClass47_Sub2_11.method2798(false);
		this.aClass47_Sub2_11.method2825(false);
		this.aClass47_Sub2_11.method2794(false);
		this.aClass47_Sub2_11.method2810(false);
		this.aClass47_Sub2_11.method2811(0);
		this.aClass47_Sub2_11.method2814();
		this.aClass47_Sub2_11.method2772(null);
		Static79.aFloatArray6[0] = (float) 1024 / ((float) this.anInt2106 * 128.0F * (float) this.aClass47_Sub2_11.anInt3063);
		Static79.aFloatArray6[1] = 0.0F;
		Static79.aFloatArray6[2] = 0.0F;
		Static79.aFloatArray6[3] = 0.0F;
		Static79.aFloatArray6[4] = 0.0F;
		Static79.aFloatArray6[5] = (float) 1024 / ((float) this.anInt2106 * 128.0F * (float) this.aClass47_Sub2_11.anInt3064);
		Static79.aFloatArray6[6] = 0.0F;
		Static79.aFloatArray6[7] = 0.0F;
		Static79.aFloatArray6[8] = 0.0F;
		Static79.aFloatArray6[9] = 0.0F;
		Static79.aFloatArray6[10] = 0.0F;
		Static79.aFloatArray6[11] = 0.0F;
		Static79.aFloatArray6[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass47_Sub2_11.anInt3063;
		Static79.aFloatArray6[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass47_Sub2_11.anInt3064;
		Static79.aFloatArray6[14] = 0.0F;
		Static79.aFloatArray6[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static79.aFloatArray6, 0);
		Static79.aFloatArray6[0] = 1.0F;
		Static79.aFloatArray6[1] = 0.0F;
		Static79.aFloatArray6[2] = 0.0F;
		Static79.aFloatArray6[3] = 0.0F;
		Static79.aFloatArray6[4] = 0.0F;
		Static79.aFloatArray6[5] = 0.0F;
		Static79.aFloatArray6[6] = 1.0F;
		Static79.aFloatArray6[7] = 0.0F;
		Static79.aFloatArray6[8] = 0.0F;
		Static79.aFloatArray6[9] = 1.0F;
		Static79.aFloatArray6[10] = 0.0F;
		Static79.aFloatArray6[11] = 0.0F;
		Static79.aFloatArray6[12] = 0.0F;
		Static79.aFloatArray6[13] = 0.0F;
		Static79.aFloatArray6[14] = 0.0F;
		Static79.aFloatArray6[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static79.aFloatArray6, 0);
		if ((this.anInt2108 & 0x7) == 0) {
			this.aClass47_Sub2_11.method2825(false);
		} else {
			this.aClass47_Sub2_11.method2825(true);
			this.aClass47_Sub2_11.method2827();
		}
		this.aClass47_Sub2_11.method2805(this.aClass217_7, this.aClass217_8, this.aClass217_5, this.aClass217_6);
		if (Static79.aClass4_Sub11_6.aByteArray55.length < this.anInt2105 * 2) {
			Static79.aClass4_Sub11_6 = new Class4_Sub11(this.anInt2105 * 2);
		} else {
			Static79.aClass4_Sub11_6.anInt3768 = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass47_Sub2_11.aBoolean235) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt2567 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray2[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static79.aClass4_Sub11_6.method3402(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt2567 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray2[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static79.aClass4_Sub11_6.method3430(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class66_Sub2 local418 = new Class66_Sub2(this.aClass47_Sub2_11, 5123, Static79.aClass4_Sub11_6.aByteArray55, Static79.aClass4_Sub11_6.anInt3768);
			this.aClass47_Sub2_11.method2818(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()V")
	@Override
	public void method2257() {
		if (this.anInt2112 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt2567 + 1][this.anInt2564 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt2567; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt2564; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray10[local14 - 1][local20] >> 2) + (this.aByteArrayArray10[local14 + 1][local20] >> 3) + (this.aByteArrayArray10[local14][local20 - 1] >> 2) + (this.aByteArrayArray10[local14][local20 + 1] >> 3) + (this.aByteArrayArray10[local14][local20] >> 1));
				}
			}
			this.aClass4_Sub37Array1 = new Class4_Sub37[this.aClass43_12.method1275()];
			this.aClass43_12.method1284(this.aClass4_Sub37Array1);
			for (local14 = 0; local14 < this.aClass4_Sub37Array1.length; local14++) {
				this.aClass4_Sub37Array1[local14].method4611(this.anInt2112);
			}
			local14 = 24;
			if (this.anIntArrayArray56 != null) {
				local14 += 4;
			}
			if ((this.anInt2108 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt2112 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class4_Sub37[] local141 = new Class4_Sub37[this.anInt2112];
			@Pc(149) Class43 local149 = new Class43(Static45.method916(this.anInt2112));
			@Pc(153) Class4_Sub37[] local153 = new Class4_Sub37[this.anInt2111];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt2567; local155++) {
				for (local161 = 0; local161 < this.anInt2564; local161++) {
					if (this.anIntArrayArrayArray10[local155][local161] != null) {
						@Pc(180) Class4_Sub37[] local180 = this.aClass4_Sub37ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray9[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray6[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray10[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray2[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray3[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray1[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray2[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray1[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray2[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray1[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray2[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray1[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray56 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray56[local155][local161];
							local388 = this.anIntArrayArray56[local155][local161 + 1];
							local400 = this.anIntArrayArray56[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray56[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label304: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class4_Sub37 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label304;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray2[local161 * this.anInt2567 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt2110) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt2110) + local201[local467];
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
							} else if (local527 == 0 && local531 == this.anInt2106) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt2106 && local531 == this.anInt2106) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt2106 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt2106;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt2106;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt2110);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt2110);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt2110);
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
								local535 = Static26.anIntArray24[local493 & 0xFF80 | local769];
								if ((this.anInt2108 & 0x7) == 0) {
									local537 = this.aClass47_Sub2_11.aFloatArray15[0] * local543 + this.aClass47_Sub2_11.aFloatArray15[1] * local545 + this.aClass47_Sub2_11.aFloatArray15[2] * local547;
									local537 = this.aClass47_Sub2_11.aFloat55 + local537 * (local537 > 0.0F ? this.aClass47_Sub2_11.aFloat37 : this.aClass47_Sub2_11.aFloat39);
								}
							}
							@Pc(840) Class4 local840 = local149.method1273(local523);
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
									local872 = Static26.anIntArray24[local497 & 0xFF80 | local853];
									if ((this.anInt2108 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass47_Sub2_11.aFloatArray15[0] * local543 + this.aClass47_Sub2_11.aFloatArray15[1] * local545 + this.aClass47_Sub2_11.aFloatArray15[2] * local547;
										local643 = this.aClass47_Sub2_11.aFloat55 + local537 * (local537 > 0.0F ? this.aClass47_Sub2_11.aFloat37 : this.aClass47_Sub2_11.aFloat39);
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
								local137.putFloat((float) (this.method2270(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								if (this.anIntArrayArray56 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								if ((this.anInt2108 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								local433 = this.anInt2107++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method1276(new Class4_Sub38(local465[local467]), local523);
							} else {
								local465[local467] = ((Class4_Sub38) local840).aShort87;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong223 < local141[local433].aLong223) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method4606(local537, local433, local553, local535);
							}
							this.anInt2105++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt2107; local155++) {
				@Pc(1178) Class4_Sub37 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method4607(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt2567; local155++) {
				for (local161 = 0; local161 < this.anInt2564; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray2[local161 * this.anInt2567 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class4_Sub37 local1243 = local141[local1225];
							@Pc(1247) Class4_Sub37 local1247 = local141[local1232];
							@Pc(1251) Class4_Sub37 local1251 = local141[local1239];
							@Pc(1253) Class4_Sub37 local1253 = null;
							if (local1243 != null) {
								local1243.method4608(local1212, local161, local155);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method4608(local1212, local161, local155);
								if (local1253 == null || local1247.aLong223 < local1253.aLong223) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method4608(local1212, local161, local155);
								if (local1253 == null || local1251.aLong223 < local1253.aLong223) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method4607(local1225);
								}
								if (local1247 != null) {
									local1253.method4607(local1232);
								}
								if (local1251 != null) {
									local1253.method4607(local1239);
								}
								local1253.method4608(local1212, local161, local155);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface8_2 = this.aClass47_Sub2_11.method2787(local14, local137);
			this.aClass217_7 = new Class217(this.aClass47_Sub2_11, this.anInterface8_2, 5126, 3, 0);
			this.aClass217_5 = new Class217(this.aClass47_Sub2_11, this.anInterface8_2, 5121, 4, 12);
			@Pc(1383) byte local1383;
			if (this.anIntArrayArray56 == null) {
				this.aClass217_6 = new Class217(this.aClass47_Sub2_11, this.anInterface8_2, 5126, 2, 16);
				local1383 = 24;
			} else {
				this.aClass217_6 = new Class217(this.aClass47_Sub2_11, this.anInterface8_2, 5126, 3, 16);
				local1383 = 28;
			}
			if ((this.anInt2108 & 0x7) != 0) {
				this.aClass217_8 = new Class217(this.aClass47_Sub2_11, this.anInterface8_2, 5126, 3, local1383);
				local155 = local1383 + 12;
			}
			@Pc(1421) long[] local1421 = new long[this.aClass4_Sub37Array1.length];
			for (@Pc(1423) int local1423 = 0; local1423 < this.aClass4_Sub37Array1.length; local1423++) {
				@Pc(1433) Class4_Sub37 local1433 = this.aClass4_Sub37Array1[local1423];
				local1421[local1423] = local1433.aLong223;
				local1433.method4609(this.anInt2107);
			}
			Static24.method401(this.aClass4_Sub37Array1, local1421);
			if (this.aClass213_2 != null) {
				this.aClass213_2.method5519();
			}
		} else {
			this.aClass213_2 = null;
		}
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass4_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray10 = null;
		this.aByteArrayArray10 = null;
		this.aClass43_12 = null;
		this.anIntArrayArray56 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!hh;II)V")
	private void method1990(@OriginalArg(0) Class4_Sub4_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static79.anIntArray157.length < local16) {
			Static79.anIntArray157 = new int[local16];
			Static79.anIntArray158 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static79.anIntArray157[local28] = (local6[local28] & 0xFF) >> this.aClass47_Sub2_11.anInt3060;
			Static79.anIntArray158[local28] = (local13[local28] & 0xFF) >> this.aClass47_Sub2_11.anInt3060;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static79.anIntArray157[local28];
			@Pc(71) int local71 = Static79.anIntArray158[local28++];
			@Pc(75) int local75 = Static79.anIntArray157[local28];
			@Pc(80) int local80 = Static79.anIntArray158[local28++];
			@Pc(84) int local84 = Static79.anIntArray157[local28];
			@Pc(89) int local89 = Static79.anIntArray158[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method2482(local89, local71, local84, local75, local66, local80);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!o;IIIIZ)V")
	@Override
	public void method2259(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass213_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass47_Sub2_11.anInt3070 >> 8) >> this.aClass47_Sub2_11.anInt3060;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass47_Sub2_11.anInt3084 >> 8) >> this.aClass47_Sub2_11.anInt3060;
			this.aClass213_2.method5515(local33, arg0, local19);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass4_Sub37Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass47_Sub2_11.aFloat42;
		@Pc(10) float local10 = this.aClass47_Sub2_11.aFloat38;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static79.anIntArray159.length < local20) {
			Static79.anIntArray159 = new int[local20];
		}
		if (Static79.aClass4_Sub11_6.aByteArray55.length < this.anInt2105 * 2) {
			Static79.aClass4_Sub11_6 = new Class4_Sub11(this.anInt2105 * 2);
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
		if (local67 > this.anInt2567 - 1) {
			local67 = this.anInt2567 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt2564 - 1) {
			local82 = this.anInt2564 - 1;
		}
		Static79.anInt2109 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static79.anIntArray159[Static79.anInt2109++] = local108 * this.anInt2567 + local97;
				}
			}
		}
		this.aClass47_Sub2_11.method2785();
		this.aClass47_Sub2_11.method2825((this.anInt2108 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass4_Sub37Array1.length; local97++) {
			this.aClass4_Sub37Array1[local97].method4610(Static79.anIntArray159, Static79.anInt2109);
		}
		if (!this.aClass116_10.method3277()) {
			local97 = this.aClass47_Sub2_11.anInt3086;
			@Pc(180) int local180 = this.aClass47_Sub2_11.anInt3090;
			this.aClass47_Sub2_11.method2703(0, local180);
			this.aClass47_Sub2_11.method2701(local10, local6 - 4.0F);
			this.aClass47_Sub2_11.method2825(false);
			this.aClass47_Sub2_11.method2810(false);
			this.aClass47_Sub2_11.method2811(130);
			this.aClass47_Sub2_11.method2814();
			this.aClass47_Sub2_11.method2772(this.aClass47_Sub2_11.aClass52_Sub1_7);
			this.aClass47_Sub2_11.method2790(8448, 7681);
			this.aClass47_Sub2_11.method2801(0, 34166, 770);
			this.aClass47_Sub2_11.method2804(0, 34167);
			for (@Pc(236) Class4 local236 = this.aClass116_10.method3270(); local236 != null; local236 = this.aClass116_10.method3272()) {
				@Pc(241) Class4_Sub40 local241 = (Class4_Sub40) local236;
				local241.method5108(arg2, arg3, arg1, arg0);
			}
			this.aClass47_Sub2_11.method2801(0, 5890, 768);
			this.aClass47_Sub2_11.method2804(0, 5890);
			this.aClass47_Sub2_11.method2772(null);
			this.aClass47_Sub2_11.method2703(local97, local180);
		}
		if (this.aClass213_2 != null) {
			this.aClass47_Sub2_11.method2701(local10, local6 - 8.0F);
			this.aClass47_Sub2_11.method2785();
			this.aClass47_Sub2_11.method2805(this.aClass217_7, null, null, this.aClass217_6);
			this.aClass213_2.method5520(arg4, arg0, arg3, arg2, arg1);
		}
		this.aClass47_Sub2_11.method2701(local10, local6);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	@Override
	public int method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray55[arg0][arg1];
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I")
	@Override
	public int method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt2110;
		@Pc(9) int local9 = arg1 >> this.anInt2110;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt2567 - 1 || local9 > this.anInt2564 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt2106 - 1;
		@Pc(41) int local41 = arg1 & this.anInt2106 - 1;
		@Pc(67) int local67 = this.anIntArrayArray55[local4][local9] * (this.anInt2106 - local34) + this.anIntArrayArray55[local4 + 1][local9] * local34 >> this.anInt2110;
		@Pc(97) int local97 = this.anIntArrayArray55[local4][local9 + 1] * (this.anInt2106 - local34) + this.anIntArrayArray55[local4 + 1][local9 + 1] * local34 >> this.anInt2110;
		return local67 * (this.anInt2106 - local41) + local97 * local41 >> this.anInt2110;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(Lclient!o;IIIIZ)Z")
	@Override
	public boolean method2266(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass213_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass47_Sub2_11.anInt3070 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass47_Sub2_11.anInt3084 >> 8) >> 3;
			return this.aClass213_2.method5516(local18, arg0, local30);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)V")
	@Override
	public void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
