import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public class Class210 {

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "[I")
	private final int[] anIntArray332 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
	private final int[] anIntArray331 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	protected final int anInt6933;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Lclient!cfa;")
	private final Class46 aClass46_2;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public final int anInt6938;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	protected final int anInt6934;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!kf;")
	private final Class167 aClass167_3;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!sm", name = "D", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIZLclient!cfa;Lclient!kf;)V")
	protected Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) Class167 arg5) {
		this.anInt6933 = arg2;
		this.aClass46_2 = arg4;
		this.anInt6938 = arg0;
		this.aBoolean553 = arg3;
		this.anInt6934 = arg1;
		this.aClass167_3 = arg5;
		this.anIntArrayArrayArray6 = new int[this.anInt6938][this.anInt6934 + 1][this.anInt6933 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt6938][this.anInt6934][this.anInt6933];
		this.aByteArrayArrayArray11 = new byte[this.anInt6938][this.anInt6934 + 1][this.anInt6933 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt6938][this.anInt6934][this.anInt6933];
		this.aByteArrayArrayArray10 = new byte[this.anInt6938][this.anInt6934][this.anInt6933];
		this.aByteArrayArrayArray14 = new byte[this.anInt6938][this.anInt6934][this.anInt6933];
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIII)V")
	public final void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 < arg3 + arg4; local7++) {
			for (local11 = arg2; local11 < arg2 + arg0; local11++) {
				if (local11 >= 0 && local11 < this.anInt6934 && local7 >= 0 && local7 < this.anInt6933) {
					this.anIntArrayArrayArray6[arg1][local11][local7] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray6[arg1 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt6934) {
			for (local11 = arg4 + 1; local11 < arg3 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt6933) {
					this.anIntArrayArrayArray6[arg1][arg2][local11] = this.anIntArrayArrayArray6[arg1][arg2 - 1][local11];
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt6933) {
			for (local11 = arg2 + 1; local11 < arg2 + arg0; local11++) {
				if (local11 >= 0 && local11 < this.anInt6934) {
					this.anIntArrayArrayArray6[arg1][local11][arg4] = this.anIntArrayArrayArray6[arg1][local11][arg4 - 1];
				}
			}
		}
		if (arg2 < 0 || arg4 < 0 || this.anInt6934 <= arg2 || this.anInt6933 <= arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray6[arg1][arg2][arg4 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2][arg4 - 1];
				return;
			}
			if (arg2 > 0 && arg4 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg4] != this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray6[arg1][arg2][arg4 - 1] != this.anIntArrayArrayArray6[arg1 - 1][arg2][arg4 - 1]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2][arg4 - 1];
			return;
		}
		if (arg2 > 0 && arg4 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4 - 1] != this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg4 - 1]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg4] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!s;BLclient!s;Lclient!ha;)V")
	public final void method5792(@OriginalArg(0) Class245 arg0, @OriginalArg(2) Class245 arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt6934][this.anInt6933];
		if (Static265.anIntArray237 == null || Static265.anIntArray237.length != this.anInt6933) {
			Static538.anIntArray483 = new int[this.anInt6933];
			Static265.anIntArray237 = new int[this.anInt6933];
			Static514.anIntArray465 = new int[this.anInt6933];
			Static282.anIntArray263 = new int[this.anInt6933];
			Static177.anIntArray485 = new int[this.anInt6933];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt6938; local40++) {
			for (local44 = 0; local44 < this.anInt6933; local44++) {
				Static265.anIntArray237[local44] = 0;
				Static514.anIntArray465[local44] = 0;
				Static282.anIntArray263[local44] = 0;
				Static538.anIntArray483[local44] = 0;
				Static177.anIntArray485[local44] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt6934; local73++) {
				@Pc(83) int local83;
				@Pc(102) int local102;
				@Pc(171) int local171;
				for (@Pc(77) int local77 = 0; local77 < this.anInt6933; local77++) {
					local83 = local73 + 5;
					@Pc(151) int local151;
					if (this.anInt6934 > local83) {
						local102 = this.aByteArrayArrayArray10[local40][local83][local77] & 0xFF;
						if (local102 > 0) {
							@Pc(115) Class87 local115 = this.aClass167_3.method5016(local102 - 1);
							Static265.anIntArray237[local77] += local115.anInt3218;
							Static514.anIntArray465[local77] += local115.anInt3223;
							Static282.anIntArray263[local77] += local115.anInt3224;
							Static538.anIntArray483[local77] += local115.anInt3221;
							local151 = Static177.anIntArray485[local77]++;
						}
					}
					local102 = local73 - 5;
					if (local102 >= 0) {
						local171 = this.aByteArrayArrayArray10[local40][local102][local77] & 0xFF;
						if (local171 > 0) {
							@Pc(181) Class87 local181 = this.aClass167_3.method5016(local171 - 1);
							Static265.anIntArray237[local77] -= local181.anInt3218;
							Static514.anIntArray465[local77] -= local181.anInt3223;
							Static282.anIntArray263[local77] -= local181.anInt3224;
							Static538.anIntArray483[local77] -= local181.anInt3221;
							local151 = Static177.anIntArray485[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local102 = 0;
					local171 = 0;
					@Pc(238) int local238 = 0;
					@Pc(240) int local240 = 0;
					for (@Pc(242) int local242 = -5; local242 < this.anInt6933; local242++) {
						@Pc(248) int local248 = local242 + 5;
						if (local248 < this.anInt6933) {
							local83 += Static265.anIntArray237[local248];
							local238 += Static538.anIntArray483[local248];
							local171 += Static282.anIntArray263[local248];
							local240 += Static177.anIntArray485[local248];
							local102 += Static514.anIntArray465[local248];
						}
						@Pc(286) int local286 = local242 - 5;
						if (local286 >= 0) {
							local240 -= Static177.anIntArray485[local286];
							local102 -= Static514.anIntArray465[local286];
							local83 -= Static265.anIntArray237[local286];
							local238 -= Static538.anIntArray483[local286];
							local171 -= Static282.anIntArray263[local286];
						}
						if (local242 >= 0 && local238 > 0 && local240 > 0) {
							local11[local73][local242] = Static149.method2959(local102 / local240, local83 * 256 / local238, local171 / local240);
						}
					}
				}
			}
			if (Static551.aBoolean747) {
				this.method5802(local40 == 0 ? arg1 : null, arg2, Static148.aClass245Array1[local40], local11, local40 == 0 ? arg0 : null, local40);
			} else {
				this.method5800(arg2, local40 == 0 ? arg0 : null, local11, local40 == 0 ? arg1 : null, Static148.aClass245Array1[local40], local40);
			}
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray9[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
		}
		if (!this.aBoolean553) {
			if (Static119.anInt3026 != 0) {
				Static618.method8477();
			}
			if (Static173.aBoolean311) {
				Static283.method7063();
			}
		}
		for (local44 = 0; local44 < this.anInt6938; local44++) {
			Static148.aClass245Array1[local44].YA();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZIII)V")
	public final void method5793(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6938; local7++) {
			this.method5791(64, local7, arg1, 64, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!ha;B[[BILclient!el;II[Z[[B[[BLclient!nba;I)V")
	private void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class215 arg11, @OriginalArg(13) int arg12) {
		@Pc(26) boolean[] local26 = arg11 != null && arg11.aBoolean556 ? Static301.aBooleanArrayArray4[arg7] : Static207.aBooleanArrayArray2[arg7];
		@Pc(48) int local48;
		@Pc(58) Class215 local58;
		@Pc(75) byte local75;
		@Pc(92) int local92;
		@Pc(97) int local97;
		if (arg6 > 0) {
			if (arg0 > 0) {
				local48 = arg3[arg0 - 1][arg6 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass46_2.method2007(local48 - 1);
					if (local58.anInt7040 != -1 && local58.aBoolean556) {
						local75 = arg9[arg0 - 1][arg6 - 1];
						local92 = arg10[arg0 - 1][arg6 - 1] * 2 + 4 & 0x7;
						local97 = Static210.method3779(local58, arg2);
						if (Static541.aBooleanArrayArray6[local75][local92]) {
							Static54.anIntArray50[0] = local58.anInt7040;
							Static490.anIntArray222[0] = local97;
							Static260.anIntArray232[0] = local58.anInt7046;
							Static475.anIntArray432[0] = local58.anInt7031;
							Static169.anIntArray166[0] = local58.anInt7038;
							Static484.anIntArray441[0] = 256;
						}
					}
				}
			}
			if (arg0 < arg1 - 1) {
				local48 = arg3[arg0 + 1][arg6 - 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass46_2.method2007(local48 - 1);
					if (local58.anInt7040 != -1 && local58.aBoolean556) {
						local75 = arg9[arg0 + 1][arg6 - 1];
						local92 = arg10[arg0 + 1][arg6 - 1] * 2 + 6 & 0x7;
						local97 = Static210.method3779(local58, arg2);
						if (Static541.aBooleanArrayArray6[local75][local92]) {
							Static54.anIntArray50[2] = local58.anInt7040;
							Static490.anIntArray222[2] = local97;
							Static260.anIntArray232[2] = local58.anInt7046;
							Static475.anIntArray432[2] = local58.anInt7031;
							Static169.anIntArray166[2] = local58.anInt7038;
							Static484.anIntArray441[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 - 1 > arg6) {
			if (arg0 > 0) {
				local48 = arg3[arg0 - 1][arg6 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass46_2.method2007(local48 - 1);
					if (local58.anInt7040 != -1 && local58.aBoolean556) {
						local75 = arg9[arg0 - 1][arg6 + 1];
						local92 = arg10[arg0 - 1][arg6 + 1] * 2 + 2 & 0x7;
						local97 = Static210.method3779(local58, arg2);
						if (Static541.aBooleanArrayArray6[local75][local92]) {
							Static54.anIntArray50[6] = local58.anInt7040;
							Static490.anIntArray222[6] = local97;
							Static260.anIntArray232[6] = local58.anInt7046;
							Static475.anIntArray432[6] = local58.anInt7031;
							Static169.anIntArray166[6] = local58.anInt7038;
							Static484.anIntArray441[6] = 64;
						}
					}
				}
			}
			if (arg0 < arg1 - 1) {
				local48 = arg3[arg0 + 1][arg6 + 1] & 0xFF;
				if (local48 > 0) {
					local58 = this.aClass46_2.method2007(local48 - 1);
					if (local58.anInt7040 != -1 && local58.aBoolean556) {
						local75 = arg9[arg0 + 1][arg6 + 1];
						local92 = --(arg10[arg0 + 1][arg6 + 1] * 2) & 0x7;
						local97 = Static210.method3779(local58, arg2);
						if (Static541.aBooleanArrayArray6[local75][local92]) {
							Static54.anIntArray50[4] = local58.anInt7040;
							Static490.anIntArray222[4] = local97;
							Static260.anIntArray232[4] = local58.anInt7046;
							Static475.anIntArray432[4] = local58.anInt7031;
							Static169.anIntArray166[4] = local58.anInt7038;
							Static484.anIntArray441[4] = 128;
						}
					}
				}
			}
		}
		@Pc(515) int local515;
		@Pc(520) int local520;
		@Pc(522) int local522;
		@Pc(484) byte local484;
		if (arg6 > 0) {
			local48 = arg3[arg0][arg6 - 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass46_2.method2007(local48 - 1);
				if (local58.anInt7040 != -1) {
					local75 = arg9[arg0][arg6 - 1];
					local484 = arg10[arg0][arg6 - 1];
					if (local58.aBoolean556) {
						local97 = 2;
						local515 = local484 * 2 + 4;
						local520 = Static210.method3779(local58, arg2);
						for (local522 = 0; local522 < 3; local522++) {
							local515 &= 0x7;
							local97 &= 0x7;
							if (Static541.aBooleanArrayArray6[local75][local515] && Static169.anIntArray166[local97] <= local58.anInt7038) {
								Static54.anIntArray50[local97] = local58.anInt7040;
								Static490.anIntArray222[local97] = local520;
								Static260.anIntArray232[local97] = local58.anInt7046;
								Static475.anIntArray432[local97] = local58.anInt7031;
								if (local58.anInt7038 == Static169.anIntArray166[local97]) {
									Static484.anIntArray441[local97] |= 0x20;
								} else {
									Static484.anIntArray441[local97] = 32;
								}
								Static169.anIntArray166[local97] = local58.anInt7038;
							}
							local515++;
							local97--;
						}
						if (!local26[arg4 & 0x3]) {
							arg8[0] = Static301.aBooleanArrayArray4[local75][local484 + 2 & 0x3];
						}
					} else if (!local26[arg4 & 0x3]) {
						arg8[0] = Static207.aBooleanArrayArray2[local75][local484 + 2 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg6) {
			local48 = arg3[arg0][arg6 + 1] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass46_2.method2007(local48 - 1);
				if (local58.anInt7040 != -1) {
					local75 = arg9[arg0][arg6 + 1];
					local484 = arg10[arg0][arg6 + 1];
					if (local58.aBoolean556) {
						local97 = 4;
						local515 = local484 * 2 + 2;
						local520 = Static210.method3779(local58, arg2);
						for (local522 = 0; local522 < 3; local522++) {
							local515 &= 0x7;
							local97 &= 0x7;
							if (Static541.aBooleanArrayArray6[local75][local515] && local58.anInt7038 >= Static169.anIntArray166[local97]) {
								Static54.anIntArray50[local97] = local58.anInt7040;
								Static490.anIntArray222[local97] = local520;
								Static260.anIntArray232[local97] = local58.anInt7046;
								Static475.anIntArray432[local97] = local58.anInt7031;
								if (Static169.anIntArray166[local97] == local58.anInt7038) {
									Static484.anIntArray441[local97] |= 0x10;
								} else {
									Static484.anIntArray441[local97] = 16;
								}
								Static169.anIntArray166[local97] = local58.anInt7038;
							}
							local515--;
							local97++;
						}
						if (!local26[arg4 + 2 & 0x3]) {
							arg8[2] = Static301.aBooleanArrayArray4[local75][local484 & 0x3];
						}
					} else if (!local26[arg4 + 2 & 0x3]) {
						arg8[2] = Static207.aBooleanArrayArray2[local75][--local484 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local48 = arg3[arg0 - 1][arg6] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass46_2.method2007(local48 - 1);
				if (local58.anInt7040 != -1) {
					local75 = arg9[arg0 - 1][arg6];
					local484 = arg10[arg0 - 1][arg6];
					if (local58.aBoolean556) {
						local97 = 6;
						local515 = local484 * 2 + 4;
						local520 = Static210.method3779(local58, arg2);
						for (local522 = 0; local522 < 3; local522++) {
							local97 &= 0x7;
							local515 &= 0x7;
							if (Static541.aBooleanArrayArray6[local75][local515] && local58.anInt7038 >= Static169.anIntArray166[local97]) {
								Static54.anIntArray50[local97] = local58.anInt7040;
								Static490.anIntArray222[local97] = local520;
								Static260.anIntArray232[local97] = local58.anInt7046;
								Static475.anIntArray432[local97] = local58.anInt7031;
								if (local58.anInt7038 == Static169.anIntArray166[local97]) {
									Static484.anIntArray441[local97] |= 0x8;
								} else {
									Static484.anIntArray441[local97] = 8;
								}
								Static169.anIntArray166[local97] = local58.anInt7038;
							}
							local515--;
							local97++;
						}
						if (!local26[arg4 + 3 & 0x3]) {
							arg8[3] = Static301.aBooleanArrayArray4[local75][local484 + 1 & 0x3];
						}
					} else if (!local26[arg4 + 3 & 0x3]) {
						arg8[3] = Static207.aBooleanArrayArray2[local75][local484 + 1 & 0x3];
					}
				}
			}
		}
		if (arg1 - 1 > arg0) {
			local48 = arg3[arg0 + 1][arg6] & 0xFF;
			if (local48 > 0) {
				local58 = this.aClass46_2.method2007(local48 - 1);
				if (local58.anInt7040 != -1) {
					local75 = arg9[arg0 + 1][arg6];
					local484 = arg10[arg0 + 1][arg6];
					if (local58.aBoolean556) {
						local97 = 4;
						local515 = local484 * 2 + 6;
						local520 = Static210.method3779(local58, arg2);
						for (local522 = 0; local522 < 3; local522++) {
							local97 &= 0x7;
							local515 &= 0x7;
							if (Static541.aBooleanArrayArray6[local75][local515] && local58.anInt7038 >= Static169.anIntArray166[local97]) {
								Static54.anIntArray50[local97] = local58.anInt7040;
								Static490.anIntArray222[local97] = local520;
								Static260.anIntArray232[local97] = local58.anInt7046;
								Static475.anIntArray432[local97] = local58.anInt7031;
								if (local58.anInt7038 == Static169.anIntArray166[local97]) {
									Static484.anIntArray441[local97] |= 0x4;
								} else {
									Static484.anIntArray441[local97] = 4;
								}
								Static169.anIntArray166[local97] = local58.anInt7038;
							}
							local515++;
							local97--;
						}
						if (!local26[arg4 + 1 & 0x3]) {
							arg8[1] = Static301.aBooleanArrayArray4[local75][local484 + 3 & 0x3];
						}
					} else if (!local26[arg4 + 1 & 0x3]) {
						arg8[1] = Static207.aBooleanArrayArray2[local75][local484 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local48 = Static210.method3779(arg11, arg2);
		if (!arg11.aBoolean556) {
			return;
		}
		for (@Pc(1177) int local1177 = 0; local1177 < 8; local1177++) {
			@Pc(1188) int local1188 = local1177 - arg4 * 2 & 0x7;
			if (Static541.aBooleanArrayArray6[arg7][local1177] && Static169.anIntArray166[local1188] <= arg11.anInt7038) {
				Static54.anIntArray50[local1188] = arg11.anInt7040;
				Static490.anIntArray222[local1188] = local48;
				Static260.anIntArray232[local1188] = arg11.anInt7046;
				Static475.anIntArray432[local1188] = arg11.anInt7031;
				if (arg11.anInt7038 == Static169.anIntArray166[local1188]) {
					Static484.anIntArray441[local1188] |= 0x2;
				} else {
					Static484.anIntArray441[local1188] = 2;
				}
				Static169.anIntArray166[local1188] = arg11.anInt7038;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIILclient!ji;I[Lclient!pfa;)V")
	public final void method5798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class258[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean553) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class258 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg4;
						@Pc(28) int local28 = arg0 + local18;
						if (local24 >= 0 && local24 < this.anInt6934 && local28 >= 0 && local28 < this.anInt6933) {
							local12.method6639(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg4 + arg2;
		@Pc(75) int local75 = arg1 + arg0;
		for (local14 = 0; local14 < this.anInt6938; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method5805(arg0 + local24, false, 0, local18 + local6, local75 + local24, arg4 + local18, 0, 0, local14, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!ji;IIIII[Lclient!pfa;I)V")
	public final void method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class258[] arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(17) int local17 = (arg0 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean553) {
			@Pc(24) Class258 local24 = arg7[arg8];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg5 + Static194.method3521(local26 & 0x7, local30 & 0x7, arg3);
					local56 = Static439.method6718(local26 & 0x7, local30 & 0x7, arg3) + arg1;
					if (local44 > 0 && local44 < this.anInt6934 - 1 && local56 > 0 && local56 < this.anInt6933 - 1) {
						local24.method6639(local56, local44);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg6 & 0xFFFFFFF8) << 3;
		local26 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (arg3 == 1) {
			local111 = 1;
		} else if (arg3 == 2) {
			local111 = 1;
			local109 = 1;
		} else if (arg3 == 3) {
			local109 = 1;
		}
		for (local56 = 0; local56 < this.anInt6938; local56++) {
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					if (local56 == arg4 && local11 <= local142 && local142 <= local11 + 8 && local146 >= local17 && local146 <= local17 + 8) {
						@Pc(205) int local205;
						@Pc(197) int local197;
						if (local11 + 8 == local142 || local17 + 8 == local146) {
							if (arg3 == 0) {
								local197 = local146 + arg1 - local17;
								local205 = local142 + arg5 - local11;
							} else if (arg3 == 1) {
								local197 = local11 + arg1 + 8 - local142;
								local205 = arg5 + local146 - local17;
							} else if (arg3 == 2) {
								local197 = local17 + arg1 + 8 - local146;
								local205 = local11 + arg5 + 8 - local142;
							} else {
								local205 = arg5 + local17 + 8 - local146;
								local197 = arg1 + local142 - local11;
							}
							this.method5805(local197, true, 0, local142 + local101, local146 + local26, local205, 0, 0, arg8, arg2);
						} else {
							local205 = Static194.method3521(local142 & 0x7, local146 & 0x7, arg3) + arg5;
							local197 = arg1 + Static439.method6718(local142 & 0x7, local146 & 0x7, arg3);
							this.method5805(local197, false, arg3, local142 + local101, local146 + local26, local205, local111, local109, arg8, arg2);
						}
						if (local142 == 63 || local146 == 63) {
							@Pc(338) byte local338 = 1;
							if (local142 == 63 && local146 == 63) {
								local338 = 3;
							}
							for (@Pc(350) int local350 = 0; local350 < local338; local350++) {
								@Pc(354) int local354 = local142;
								@Pc(356) int local356 = local146;
								if (local350 == 0) {
									local354 = local142 == 63 ? 64 : local142;
									local356 = local146 == 63 ? 64 : local146;
								} else if (local350 == 1) {
									local354 = 64;
								} else if (local350 == 2) {
									local356 = 64;
								}
								@Pc(400) int local400;
								@Pc(407) int local407;
								if (arg3 == 0) {
									local400 = local354 + arg5 - local11;
									local407 = local356 + arg1 - local17;
								} else if (arg3 == 1) {
									local400 = local356 + arg5 - local17;
									local407 = local11 + arg1 + 8 - local354;
								} else if (arg3 == 2) {
									local400 = local11 + arg5 + 8 - local354;
									local407 = arg1 + local17 + 8 - local356;
								} else {
									local407 = arg1 + local354 - local11;
									local400 = arg5 + local17 + 8 - local356;
								}
								if (local400 >= 0 && local400 < this.anInt6934 && local407 >= 0 && local407 < this.anInt6933) {
									this.anIntArrayArrayArray6[arg8][local400][local407] = this.anIntArrayArrayArray6[arg8][local205 + local109][local111 + local197];
								}
							}
						}
					} else {
						this.method5805(-1, false, 0, 0, 0, -1, 0, 0, 0, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;Lclient!s;[[ILclient!s;Lclient!s;IB)V")
	private void method5800(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(5) int arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6934; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt6933; local15++) {
				if (Static208.anInt4501 == -1 || Static514.method7364(local15, arg5, local11, Static208.anInt4501)) {
					@Pc(38) byte local38 = this.aByteArrayArrayArray13[arg5][local11][local15];
					@Pc(47) byte local47 = this.aByteArrayArrayArray14[arg5][local11][local15];
					@Pc(58) int local58 = this.aByteArrayArrayArray9[arg5][local11][local15] & 0xFF;
					@Pc(69) int local69 = this.aByteArrayArrayArray10[arg5][local11][local15] & 0xFF;
					@Pc(84) Class215 local84 = local58 == 0 ? null : this.aClass46_2.method2007(local58 - 1);
					if (local38 == 0 && local84 == null) {
						local38 = 12;
					}
					@Pc(102) Class87 local102 = local69 == 0 ? null : this.aClass167_3.method5016(local69 - 1);
					@Pc(104) Class215 local104 = local84;
					if (local84 != null && local84.anInt7040 == -1 && local84.anInt7042 == -1) {
						local104 = local84;
						local84 = null;
					}
					if (local84 != null || local102 != null) {
						@Pc(127) int local127 = Static621.anIntArray557[local38];
						@Pc(131) int local131 = Static554.anIntArray505[local38];
						@Pc(143) int local143 = (local102 == null ? 0 : local127) + (local84 == null ? 0 : local131);
						@Pc(145) int local145 = 0;
						@Pc(147) int local147 = 0;
						@Pc(154) int local154 = local84 == null ? -1 : local84.anInt7046;
						@Pc(161) int local161 = local102 == null ? -1 : local102.anInt3216;
						@Pc(164) int[] local164 = new int[local143];
						@Pc(167) int[] local167 = new int[local143];
						@Pc(170) int[] local170 = new int[local143];
						@Pc(173) int[] local173 = new int[local143];
						@Pc(176) int[] local176 = new int[local143];
						@Pc(179) int[] local179 = new int[local143];
						@Pc(191) int[] local191 = local84 == null || local84.anInt7042 == -1 ? null : new int[local143];
						@Pc(195) int local195;
						if (local84 == null) {
							local147 = local131;
						} else {
							for (local195 = 0; local195 < local131; local195++) {
								local164[local145] = Static612.anIntArrayArray64[local38][local147];
								local167[local145] = Static548.anIntArrayArray56[local38][local147];
								local170[local145] = Static243.anIntArrayArray22[local38][local147];
								local176[local145] = local154;
								local179[local145] = local84.anInt7031;
								local173[local145] = local84.anInt7040;
								if (local191 != null) {
									local191[local145] = local84.anInt7042;
								}
								local145++;
								local147++;
							}
							if (!this.aBoolean553 && arg5 == 0) {
								Static501.method7249(local11, local15, local84.anInt7035, local84.anInt7032 * 8, local84.anInt7036);
							}
						}
						if (local102 != null) {
							for (local195 = 0; local195 < local127; local195++) {
								local164[local145] = Static612.anIntArrayArray64[local38][local147];
								local167[local145] = Static548.anIntArrayArray56[local38][local147];
								local170[local145] = Static243.anIntArrayArray22[local38][local147];
								local176[local145] = local161;
								local179[local145] = local102.anInt3215;
								local173[local145] = arg2[local11][local15];
								if (local191 != null) {
									local191[local145] = local173[local145];
								}
								local147++;
								local145++;
							}
						}
						local195 = this.anIntArray331.length;
						@Pc(346) int[] local346 = new int[local195];
						@Pc(349) int[] local349 = new int[local195];
						@Pc(356) int[] local356 = arg1 == null ? null : new int[local195];
						@Pc(365) int[] local365 = arg1 == null && arg3 == null ? null : new int[local195];
						@Pc(374) int local374;
						@Pc(379) int local379;
						@Pc(466) int local466;
						@Pc(474) int local474;
						for (@Pc(367) int local367 = 0; local367 < local195; local367++) {
							local374 = this.anIntArray331[local367];
							local379 = this.anIntArray332[local367];
							if (local47 == 0) {
								local346[local367] = local374;
								local349[local367] = local379;
							} else if (local47 == 1) {
								local346[local367] = local379;
								local349[local367] = 512 - local374;
							} else if (local47 == 2) {
								local346[local367] = 512 - local374;
								local349[local367] = 512 - local379;
							} else if (local47 == 3) {
								local346[local367] = 512 - local379;
								local349[local367] = local374;
							}
							if (local356 != null && Static541.aBooleanArrayArray6[local38][local367]) {
								local466 = (local11 << 9) + local346[local367];
								local474 = (local15 << 9) + local349[local367];
								local356[local367] = arg1.method7580(local466, local474) - arg4.method7580(local466, local474);
							}
							if (local365 != null) {
								if (arg1 != null && !Static541.aBooleanArrayArray6[local38][local367]) {
									local466 = (local11 << 9) + local346[local367];
									local474 = (local15 << 9) + local349[local367];
									local365[local367] = arg4.method7580(local466, local474) - arg1.method7580(local466, local474);
								} else if (arg3 != null && !Static420.aBooleanArrayArray5[local38][local367]) {
									local466 = local346[local367] + (local11 << 9);
									local474 = (local15 << 9) + local349[local367];
									local365[local367] = arg3.method7580(local466, local474) - arg4.method7580(local466, local474);
								}
							}
						}
						local374 = arg4.method7583(local15, local11);
						local379 = arg4.method7583(local15, local11 + 1);
						local466 = arg4.method7583(local15 + 1, local11 + 1);
						local474 = arg4.method7583(local15 + 1, local11);
						@Pc(617) boolean local617 = Static3.method52(local15, local11);
						if (local617 && arg5 > 1 || !local617 && arg5 > 0) {
							@Pc(631) boolean local631 = true;
							if (local102 != null && !local102.aBoolean250) {
								local631 = false;
							} else if (local69 == 0 && local38 != 0) {
								local631 = false;
							} else if (local58 > 0 && local104 != null && !local104.aBoolean557) {
								local631 = false;
							}
							if (local631 && local374 == local379 && local466 == local374 && local474 == local374) {
								this.aByteArrayArrayArray11[arg5][local11][local15] = (byte) (this.aByteArrayArrayArray11[arg5][local11][local15] | 0x4);
							}
						}
						@Pc(699) int local699 = 0;
						@Pc(701) int local701 = 0;
						@Pc(703) int local703 = 0;
						if (this.aBoolean553) {
							local699 = Static543.method7672(local11, local15);
							local701 = Static631.method8609(local11, local15);
							local703 = Static363.method7755(local11, local15);
						}
						arg4.method7587(local11, local15, local346, local356, local349, local365, local164, local167, local170, local173, local191, local176, local179, local699, local701, local703);
						Static274.method4877(arg5, local11, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[[I)V")
	public final void method5801(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray6[0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6934 + 1; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt6933 + 1; local24++) {
				local10[local20][local24] += arg0[local20][local24];
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;[[ILclient!s;II)V")
	private void method5802(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Class245 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray9[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6934; local27++) {
			@Pc(41) int local41 = local27 >= this.anInt6934 - 1 ? local27 : local27 + 1;
			for (@Pc(43) int local43 = 0; local43 < this.anInt6933; local43++) {
				@Pc(57) int local57 = this.anInt6933 - 1 <= local43 ? local43 : local43 + 1;
				if (Static208.anInt4501 == -1 || Static514.method7364(local43, arg5, local27, Static208.anInt4501)) {
					@Pc(72) boolean local72 = false;
					@Pc(74) boolean local74 = false;
					@Pc(77) boolean[] local77 = new boolean[4];
					@Pc(83) int local83 = local10[local27][local43];
					@Pc(89) int local89 = local15[local27][local43];
					@Pc(97) int local97 = local25[local27][local43] & 0xFF;
					@Pc(105) int local105 = local20[local27][local43] & 0xFF;
					@Pc(113) int local113 = local20[local27][local57] & 0xFF;
					@Pc(121) int local121 = local20[local41][local57] & 0xFF;
					@Pc(129) int local129 = local20[local41][local43] & 0xFF;
					if (local97 != 0 || local105 != 0) {
						@Pc(150) Class215 local150 = local97 == 0 ? null : this.aClass46_2.method2007(local97 - 1);
						if (local83 == 0 && local150 == null) {
							local83 = 12;
						}
						@Pc(168) Class87 local168 = local105 == 0 ? null : this.aClass167_3.method5016(local105 - 1);
						@Pc(170) Class215 local170 = local150;
						if (local150 != null) {
							if (local150.anInt7040 == -1 && local150.anInt7042 == -1) {
								local170 = local150;
								local150 = null;
							} else if (local168 != null && local83 != 0) {
								local74 = local150.aBoolean556;
							}
						}
						@Pc(271) int local271;
						@Pc(305) int local305;
						@Pc(369) int local369;
						@Pc(379) int local379;
						if ((local83 == 0 || local83 == 12) && local27 > 0 && local43 > 0 && this.anInt6934 > local27 && this.anInt6933 > local43) {
							@Pc(250) int local250 = local20[local41][local57] == local105 ? 1 : -1;
							local271 = local20[local27 - 1][local43 - 1] == local105 ? 1 : -1;
							@Pc(286) int local286 = local20[local41][local43 - 1] == local105 ? 1 : -1;
							local305 = local20[local27 - 1][local57] == local105 ? 1 : -1;
							if (local105 == local20[local27][local43 - 1]) {
								local286++;
								local271++;
							} else {
								local271--;
								local286--;
							}
							if (local20[local41][local43] == local105) {
								local250++;
								local286++;
							} else {
								local286--;
								local250--;
							}
							if (local105 == local20[local27][local57]) {
								local305++;
								local250++;
							} else {
								local305--;
								local250--;
							}
							if (local20[local27 - 1][local43] == local105) {
								local271++;
								local305++;
							} else {
								local271--;
								local305--;
							}
							local369 = local271 - local250;
							if (local369 < 0) {
								local369 = -local369;
							}
							local379 = local286 - local305;
							if (local379 < 0) {
								local379 = -local379;
							}
							if (local379 == local369) {
								local369 = arg2.method7583(local43, local27) - arg2.method7583(local57, local41);
								local379 = arg2.method7583(local43, local41) - arg2.method7583(local57, local27);
								if (local369 < 0) {
									local369 = -local369;
								}
								if (local379 < 0) {
									local379 = -local379;
								}
							}
							local89 = local369 < local379 ? 1 : 0;
						}
						for (local271 = 0; local271 < 13; local271++) {
							Static169.anIntArray166[local271] = -1;
							Static484.anIntArray441[local271] = 1;
						}
						@Pc(472) boolean[] local472 = local150 != null && local150.aBoolean556 ? Static301.aBooleanArrayArray4[local83] : Static207.aBooleanArrayArray2[local83];
						this.method5794(local27, this.anInt6934, arg1, local25, local89, local168, local43, local83, local77, local10, local15, local150, this.anInt6933);
						@Pc(505) boolean local505 = local150 != null && local150.anInt7040 != local150.anInt7042;
						if (!local505) {
							for (local305 = 0; local305 < 8; local305++) {
								if (Static169.anIntArray166[local305] >= 0 && Static490.anIntArray222[local305] != Static54.anIntArray50[local305]) {
									local505 = true;
									break;
								}
							}
						}
						if (!local472[local89 + 1 & 0x3]) {
							local77[1] = Static224.method4124(local77[1], (Static484.anIntArray441[4] & Static484.anIntArray441[2]) == 0);
						}
						if (!local472[local89 + 3 & 0x3]) {
							local77[3] = Static224.method4124(local77[3], (Static484.anIntArray441[0] & Static484.anIntArray441[6]) == 0);
						}
						if (!local472[local89 & 0x3]) {
							local77[0] = Static224.method4124(local77[0], (Static484.anIntArray441[2] & Static484.anIntArray441[0]) == 0);
						}
						if (!local472[local89 + 2 & 0x3]) {
							local77[2] = Static224.method4124(local77[2], (Static484.anIntArray441[6] & Static484.anIntArray441[4]) == 0);
						}
						if (!local74 && (local83 == 0 || local83 == 12)) {
							if (local77[0] && !local77[1] && !local77[2] && local77[3]) {
								local89 = 0;
								local83 = local83 == 0 ? 13 : 14;
								local77[0] = local77[3] = false;
							} else if (local77[0] && local77[1] && !local77[2] && !local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local77[0] = local77[1] = false;
								local89 = 3;
							} else if (!local77[0] && local77[1] && local77[2] && !local77[3]) {
								local77[1] = local77[2] = false;
								local83 = local83 == 0 ? 13 : 14;
								local89 = 2;
							} else if (!local77[0] && !local77[1] && local77[2] && local77[3]) {
								local77[2] = local77[3] = false;
								local83 = local83 == 0 ? 13 : 14;
								local89 = 1;
							}
						}
						@Pc(822) boolean local822 = !local74 && !local77[0] && !local77[2] && !local77[1] && !local77[3];
						@Pc(824) int[] local824 = null;
						@Pc(856) int[] local856;
						@Pc(844) int[] local844;
						@Pc(860) int[] local860;
						if (local822) {
							local856 = Static612.anIntArrayArray64[local83];
							local379 = local150 == null ? 0 : Static554.anIntArray505[local83];
							local860 = Static243.anIntArrayArray22[local83];
							local369 = local168 == null ? 0 : Static621.anIntArray557[local83];
							local844 = Static548.anIntArrayArray56[local83];
						} else if (local74) {
							local824 = Static166.anIntArrayArray61[local83];
							local369 = local168 == null ? 0 : Static446.anIntArray420[local83];
							local844 = Static589.anIntArrayArray62[local83];
							local379 = local150 == null ? 0 : Static10.anIntArray12[local83];
							local856 = Static454.anIntArrayArray41[local83];
							local860 = Static367.anIntArrayArray54[local83];
						} else {
							local379 = local150 == null ? 0 : Static140.anIntArray126[local83];
							local856 = Static184.anIntArrayArray17[local83];
							local844 = Static329.anIntArrayArray28[local83];
							local824 = Static12.anIntArrayArray1[local83];
							local860 = Static420.anIntArrayArray37[local83];
							local369 = local168 == null ? 0 : Static248.anIntArray223[local83];
						}
						@Pc(926) int local926 = local369 + local379;
						if (local926 <= 0) {
							Static274.method4877(arg5, local27, local43);
						} else {
							if (local77[0]) {
								local926++;
							}
							if (local77[2]) {
								local926++;
							}
							if (local77[1]) {
								local926++;
							}
							if (local77[3]) {
								local926++;
							}
							@Pc(959) int local959 = 0;
							@Pc(961) int local961 = 0;
							@Pc(965) int local965 = local926 * 3;
							@Pc(972) int[] local972 = local505 ? new int[local965] : null;
							@Pc(975) int[] local975 = new int[local965];
							@Pc(978) int[] local978 = new int[local965];
							@Pc(981) int[] local981 = new int[local965];
							@Pc(984) int[] local984 = new int[local965];
							@Pc(987) int[] local987 = new int[local965];
							@Pc(994) int[] local994 = arg4 == null ? null : new int[local965];
							@Pc(1003) int[] local1003 = arg4 == null && arg0 == null ? null : new int[local965];
							@Pc(1005) int local1005 = -1;
							@Pc(1007) int local1007 = -1;
							@Pc(1009) int local1009 = 256;
							@Pc(1134) byte local1134;
							@Pc(1025) int local1025;
							@Pc(1027) int local1027;
							@Pc(1267) int local1267;
							@Pc(1273) int local1273;
							@Pc(1282) int local1282;
							@Pc(1287) int local1287;
							@Pc(1297) int local1297;
							@Pc(1292) int local1292;
							@Pc(1302) int local1302;
							@Pc(1361) int local1361;
							@Pc(1367) int local1367;
							if (local150 != null) {
								local1005 = local150.anInt7040;
								local1009 = local150.anInt7031;
								local1007 = local150.anInt7046;
								local1025 = Static210.method3779(local150, arg1);
								for (local1027 = 0; local1027 < local379; local1027++) {
									if (local77[-local89 & 0x3] && local824[0] == local959) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 1;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 1;
										Static114.anIntArray111[4] = local844[local959];
										Static114.anIntArray111[5] = local860[local959];
										local1134 = 6;
									} else if (local77[2 - local89 & 0x3] && local824[2] == local959) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 5;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 5;
										Static114.anIntArray111[4] = local844[local959];
										Static114.anIntArray111[5] = local860[local959];
										local1134 = 6;
									} else if (local77[1 - local89 & 0x3] && local959 == local824[1]) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 3;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 3;
										Static114.anIntArray111[4] = local844[local959];
										Static114.anIntArray111[5] = local860[local959];
										local1134 = 6;
									} else if (local77[3 - local89 & 0x3] && local959 == local824[3]) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 7;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 7;
										Static114.anIntArray111[4] = local844[local959];
										Static114.anIntArray111[5] = local860[local959];
										local1134 = 6;
									} else {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = local844[local959];
										local1134 = 3;
										Static114.anIntArray111[2] = local860[local959];
									}
									local959++;
									for (local1267 = 0; local1267 < local1134; local1267++) {
										local1273 = Static114.anIntArray111[local1267];
										local1282 = local1273 - local89 * 2 & 0x7;
										local1287 = this.anIntArray331[local1273];
										local1292 = this.anIntArray332[local1273];
										if (local89 == 1) {
											local1297 = local1292;
											local1302 = 512 - local1287;
										} else if (local89 == 2) {
											local1297 = 512 - local1287;
											local1302 = 512 - local1292;
										} else if (local89 == 3) {
											local1297 = 512 - local1292;
											local1302 = local1287;
										} else {
											local1302 = local1292;
											local1297 = local1287;
										}
										local975[local961] = local1297;
										local978[local961] = local1302;
										if (local994 != null && Static541.aBooleanArrayArray6[local83][local1273]) {
											local1361 = local1297 + (local27 << 9);
											local1367 = local1302 + (local43 << 9);
											local994[local961] = arg4.method7580(local1361, local1367) - arg2.method7580(local1361, local1367);
										}
										if (local1003 != null) {
											if (arg4 != null && !Static541.aBooleanArrayArray6[local83][local1273]) {
												local1361 = (local27 << 9) + local1297;
												local1367 = (local43 << 9) + local1302;
												local1003[local961] = arg2.method7580(local1361, local1367) - arg4.method7580(local1361, local1367);
											} else if (arg0 != null && !Static420.aBooleanArrayArray5[local83][local1273]) {
												local1361 = local1297 + (local27 << 9);
												local1367 = local1302 + (local43 << 9);
												local1003[local961] = arg0.method7580(local1361, local1367) - arg2.method7580(local1361, local1367);
											}
										}
										if (local1273 < 8 && Static169.anIntArray166[local1282] > local150.anInt7038) {
											if (local972 != null) {
												local972[local961] = Static490.anIntArray222[local1282];
											}
											local987[local961] = Static475.anIntArray432[local1282];
											local984[local961] = Static260.anIntArray232[local1282];
											local981[local961] = Static54.anIntArray50[local1282];
										} else {
											if (local972 != null) {
												local972[local961] = local1025;
											}
											local984[local961] = local150.anInt7046;
											local987[local961] = local150.anInt7031;
											local981[local961] = local1005;
										}
										local961++;
									}
								}
								if (!this.aBoolean553 && arg5 == 0) {
									Static501.method7249(local27, local43, local150.anInt7035, local150.anInt7032 * 8, local150.anInt7036);
								}
								if (local83 != 12 && local150.anInt7040 != -1 && local150.aBoolean558) {
									local72 = true;
								}
							} else if (local822) {
								local959 = Static554.anIntArray505[local83];
							} else if (local74) {
								local959 = Static10.anIntArray12[local83];
							} else {
								local959 = Static140.anIntArray126[local83];
							}
							if (local168 != null) {
								if (local121 == 0) {
									local121 = local105;
								}
								if (local129 == 0) {
									local129 = local105;
								}
								if (local113 == 0) {
									local113 = local105;
								}
								@Pc(1604) Class87 local1604 = this.aClass167_3.method5016(local105 - 1);
								@Pc(1612) Class87 local1612 = this.aClass167_3.method5016(local113 - 1);
								@Pc(1622) Class87 local1622 = this.aClass167_3.method5016(local121 - 1);
								@Pc(1632) Class87 local1632 = this.aClass167_3.method5016(local129 - 1);
								for (local1282 = 0; local1282 < local369; local1282++) {
									if (local77[-local89 & 0x3] && local824[0] == local959) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 1;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 1;
										Static114.anIntArray111[4] = local844[local959];
										local1134 = 6;
										Static114.anIntArray111[5] = local860[local959];
									} else if (local77[2 - local89 & 0x3] && local959 == local824[2]) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 5;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 5;
										Static114.anIntArray111[4] = local844[local959];
										local1134 = 6;
										Static114.anIntArray111[5] = local860[local959];
									} else if (local77[1 - local89 & 0x3] && local959 == local824[1]) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 3;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 3;
										Static114.anIntArray111[4] = local844[local959];
										Static114.anIntArray111[5] = local860[local959];
										local1134 = 6;
									} else if (local77[3 - local89 & 0x3] && local959 == local824[3]) {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = 7;
										Static114.anIntArray111[2] = local860[local959];
										Static114.anIntArray111[3] = 7;
										Static114.anIntArray111[4] = local844[local959];
										local1134 = 6;
										Static114.anIntArray111[5] = local860[local959];
									} else {
										Static114.anIntArray111[0] = local856[local959];
										Static114.anIntArray111[1] = local844[local959];
										local1134 = 3;
										Static114.anIntArray111[2] = local860[local959];
									}
									local959++;
									for (local1287 = 0; local1287 < local1134; local1287++) {
										local1297 = Static114.anIntArray111[local1287];
										local1292 = local1297 - local89 * 2 & 0x7;
										local1302 = this.anIntArray331[local1297];
										local1367 = this.anIntArray332[local1297];
										@Pc(1903) int local1903;
										if (local89 == 1) {
											local1903 = 512 - local1302;
											local1361 = local1367;
										} else if (local89 == 2) {
											local1903 = 512 - local1367;
											local1361 = 512 - local1302;
										} else if (local89 == 3) {
											local1903 = local1302;
											local1361 = 512 - local1367;
										} else {
											local1903 = local1367;
											local1361 = local1302;
										}
										local975[local961] = local1361;
										local978[local961] = local1903;
										@Pc(1956) int local1956;
										@Pc(1963) int local1963;
										if (local994 != null && Static541.aBooleanArrayArray6[local83][local1297]) {
											local1956 = local1361 + (local27 << 9);
											local1963 = (local43 << 9) + local1903;
											local994[local961] = arg4.method7580(local1956, local1963) - arg2.method7580(local1956, local1963);
										}
										if (local1003 != null) {
											if (arg4 != null && !Static541.aBooleanArrayArray6[local83][local1297]) {
												local1956 = (local27 << 9) + local1361;
												local1963 = local1903 + (local43 << 9);
												local1003[local961] = arg2.method7580(local1956, local1963) - arg4.method7580(local1956, local1963);
											} else if (arg0 != null && !Static420.aBooleanArrayArray5[local83][local1297]) {
												local1956 = local1361 + (local27 << 9);
												local1963 = local1903 + (local43 << 9);
												local1003[local961] = arg0.method7580(local1956, local1963) - arg2.method7580(local1956, local1963);
											}
										}
										if (local1297 < 8 && Static169.anIntArray166[local1292] >= 0) {
											if (local972 != null) {
												local972[local961] = Static490.anIntArray222[local1292];
											}
											local987[local961] = Static475.anIntArray432[local1292];
											local984[local961] = Static260.anIntArray232[local1292];
											local981[local961] = Static54.anIntArray50[local1292];
										} else {
											if (local74 && Static541.aBooleanArrayArray6[local83][local1297]) {
												local984[local961] = local1007;
												local987[local961] = local1009;
												local981[local961] = local1005;
											} else if (local1361 == 0 && local1903 == 0) {
												local981[local961] = arg3[local27][local43];
												local984[local961] = local1604.anInt3216;
												local987[local961] = local1604.anInt3215;
											} else if (local1361 == 0 && local1903 == 512) {
												local981[local961] = arg3[local27][local57];
												local984[local961] = local1612.anInt3216;
												local987[local961] = local1612.anInt3215;
											} else if (local1361 == 512 && local1903 == 512) {
												local981[local961] = arg3[local41][local57];
												local984[local961] = local1622.anInt3216;
												local987[local961] = local1622.anInt3215;
											} else if (local1361 == 512 && local1903 == 0) {
												local981[local961] = arg3[local41][local43];
												local984[local961] = local1632.anInt3216;
												local987[local961] = local1632.anInt3215;
											} else {
												if (local1361 >= 256) {
													if (local1903 < 256) {
														local984[local961] = local1632.anInt3216;
														local987[local961] = local1632.anInt3215;
													} else {
														local984[local961] = local1622.anInt3216;
														local987[local961] = local1622.anInt3215;
													}
												} else if (local1903 < 256) {
													local984[local961] = local1604.anInt3216;
													local987[local961] = local1604.anInt3215;
												} else {
													local984[local961] = local1612.anInt3216;
													local987[local961] = local1612.anInt3215;
												}
												local1956 = Static363.method7753(local1361 << 7 >> 9, arg3[local27][local43], arg3[local41][local43]);
												local1963 = Static363.method7753(local1361 << 7 >> 9, arg3[local27][local57], arg3[local41][local57]);
												local981[local961] = Static363.method7753(local1903 << 7 >> 9, local1956, local1963);
											}
											if (local972 != null) {
												local972[local961] = local981[local961];
											}
										}
										local961++;
									}
								}
								if (local83 != 0 && local168.aBoolean251) {
									local72 = true;
								}
							}
							local1025 = arg2.method7583(local43, local27);
							local1027 = arg2.method7583(local43, local41);
							local1267 = arg2.method7583(local57, local41);
							local1273 = arg2.method7583(local57, local27);
							@Pc(2397) boolean local2397 = Static3.method52(local43, local27);
							if (local2397 && arg5 > 1 || !local2397 && arg5 > 0) {
								@Pc(2413) boolean local2413 = true;
								if (local168 != null && !local168.aBoolean250) {
									local2413 = false;
								} else if (local105 == 0 && local83 != 0) {
									local2413 = false;
								} else if (local97 > 0 && local170 != null && !local170.aBoolean557) {
									local2413 = false;
								}
								if (local2413 && local1027 == local1025 && local1025 == local1267 && local1025 == local1273) {
									this.aByteArrayArrayArray11[arg5][local27][local43] = (byte) (this.aByteArrayArrayArray11[arg5][local27][local43] | 0x4);
								}
							}
							local1287 = 0;
							local1297 = 0;
							local1292 = 0;
							if (this.aBoolean553) {
								local1287 = Static543.method7672(local27, local43);
								local1297 = Static631.method8609(local27, local43);
								local1292 = Static363.method7755(local27, local43);
							}
							arg2.U(local27, local43, local975, local994, local978, local1003, local981, local972, local984, local987, local1287, local1297, local1292, local72);
							Static274.method4877(arg5, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Lclient!pfa;Lclient!ha;[[[I)V")
	public final void method5803(@OriginalArg(1) Class258[] arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean553) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt6934; local10++) {
					for (local14 = 0; local14 < this.anInt6933; local14++) {
						if ((Static495.aByteArrayArrayArray17[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static495.aByteArrayArrayArray17[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method6636(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt6938; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean553) {
				if (Static145.aBoolean266) {
					local14 = 8;
				}
				if (Static173.aBoolean311) {
					local10 = 2;
				}
				if (Static119.anInt3026 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static370.aBoolean560) {
						local14 |= 0x10;
					}
				}
			}
			if (Static173.aBoolean311) {
				local14 |= 0x7;
			}
			if (!Static628.aBoolean832) {
				local14 |= 0x20;
			}
			@Pc(147) int[][] local147 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray6[local6] : arg2[local6];
			Static265.method4757(local6, arg1.method6108(this.anInt6934, this.anInt6933, this.anIntArrayArrayArray6[local6], local147, local10, local14));
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZIIIIBIIILclient!ji;)V")
	private void method5805(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6_Sub8 arg9) {
		if (arg2 == 1) {
			arg6 = 1;
		} else if (arg2 == 2) {
			arg6 = 1;
			arg7 = 1;
		} else if (arg2 == 3) {
			arg7 = 1;
		}
		@Pc(80) int local80;
		if (arg5 < 0 || this.anInt6934 <= arg5 || arg0 < 0 || this.anInt6933 <= arg0) {
			while (true) {
				local80 = arg9.method8246();
				if (local80 == 0) {
					return;
				}
				if (local80 == 1) {
					arg9.method8246();
					return;
				}
				if (local80 <= 49) {
					arg9.method8246();
				}
			}
			return;
		}
		if (!this.aBoolean553 && !arg1) {
			Static495.aByteArrayArrayArray17[arg8][arg5][arg0] = 0;
		}
		while (true) {
			local80 = arg9.method8246();
			if (local80 == 0) {
				if (this.aBoolean553) {
					this.anIntArrayArrayArray6[0][arg5 + arg7][arg6 + arg0] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray6[0][arg7 + arg5][arg6 + arg0] = -Static498.method7232(arg4 + 556238, arg3 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray6[arg8][arg7 + arg5][arg0 + arg6] = this.anIntArrayArrayArray6[arg8 - 1][arg7 + arg5][arg6 + arg0] - 960;
					return;
				}
			}
			if (local80 == 1) {
				@Pc(175) int local175 = arg9.method8246();
				if (!this.aBoolean553) {
					if (local175 == 1) {
						local175 = 0;
					}
					if (arg8 != 0) {
						this.anIntArrayArrayArray6[arg8][arg5 + arg7][arg0 + arg6] = this.anIntArrayArrayArray6[arg8 - 1][arg5 + arg7][arg6 + arg0] - (local175 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray6[0][arg5 + arg7][arg0 + arg6] = -local175 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray6[0][arg7 + arg5][arg6 + arg0] = local175 * 8 << 2;
				return;
			}
			if (local80 <= 49) {
				if (arg1) {
					arg9.method8246();
				} else {
					this.aByteArrayArrayArray9[arg8][arg5][arg0] = arg9.method8208();
					this.aByteArrayArrayArray13[arg8][arg5][arg0] = (byte) ((local80 - 2) / 4);
					this.aByteArrayArrayArray14[arg8][arg5][arg0] = (byte) (arg2 + local80 - 2 & 0x3);
				}
			} else if (local80 <= 81) {
				if (!this.aBoolean553 && !arg1) {
					Static495.aByteArrayArrayArray17[arg8][arg5][arg0] = (byte) (local80 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray10[arg8][arg5][arg0] = (byte) (local80 - 81);
			}
		}
	}
}
