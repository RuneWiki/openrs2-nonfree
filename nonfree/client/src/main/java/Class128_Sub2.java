import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class128_Sub2 extends Class128 {

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[Lclient!al;")
	private Class18[] aClass18Array2;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "Lclient!jb;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "[F")
	private float[] aFloatArray46;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	private int anInt4953;

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "Lclient!un;")
	private Class342 aClass342_1;

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!hn", name = "Y", descriptor = "B")
	private byte aByte54;

	@OriginalMember(owner = "client!hn", name = "eb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!hn", name = "fb", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!hn", name = "hb", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!hn", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!hn", name = "jb", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!hn", name = "kb", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!hn", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!hn", name = "mb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!hn", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!hn", name = "ub", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!hn", name = "zb", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!hn", name = "Db", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!hn", name = "Gb", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!hn", name = "Ib", descriptor = "[Lclient!pca;")
	private Class257[] aClass257Array1;

	@OriginalMember(owner = "client!hn", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!hn", name = "Kb", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!hn", name = "Nb", descriptor = "[Lclient!nia;")
	private Class231[] aClass231Array1;

	@OriginalMember(owner = "client!hn", name = "Ob", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!hn", name = "Ub", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!hn", name = "Xb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!hn", name = "Yb", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!hn", name = "cc", descriptor = "[Lclient!mi;")
	private Class215[] aClass215Array2;

	@OriginalMember(owner = "client!hn", name = "ec", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!hn", name = "lc", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!hn", name = "sc", descriptor = "I")
	private int anInt5001;

	@OriginalMember(owner = "client!hn", name = "tc", descriptor = "I")
	private int anInt5002;

	@OriginalMember(owner = "client!hn", name = "wc", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!hn", name = "zc", descriptor = "Lclient!ur;")
	private Interface27 anInterface27_4;

	@OriginalMember(owner = "client!hn", name = "Bc", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!hn", name = "Fc", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!hn", name = "Gc", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!hn", name = "cb", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!hn", name = "Cb", descriptor = "I")
	private int anInt4977 = 0;

	@OriginalMember(owner = "client!hn", name = "sb", descriptor = "Z")
	private boolean aBoolean436 = true;

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
	private int anInt4963 = 0;

	@OriginalMember(owner = "client!hn", name = "yb", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!hn", name = "Dc", descriptor = "I")
	private int anInt5009 = 0;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!hn", name = "qc", descriptor = "I")
	private int anInt4999 = 0;

	@OriginalMember(owner = "client!hn", name = "Hc", descriptor = "I")
	private int anInt5011 = 0;

	@OriginalMember(owner = "client!hn", name = "ic", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_20;

	@OriginalMember(owner = "client!hn", name = "fc", descriptor = "Lclient!qe;")
	private Class270 aClass270_9;

	@OriginalMember(owner = "client!hn", name = "Tb", descriptor = "Lclient!qe;")
	private Class270 aClass270_8;

	@OriginalMember(owner = "client!hn", name = "N", descriptor = "Lclient!qe;")
	private Class270 aClass270_6;

	@OriginalMember(owner = "client!hn", name = "Fb", descriptor = "Lclient!qe;")
	private Class270 aClass270_7;

	@OriginalMember(owner = "client!hn", name = "Rb", descriptor = "Lclient!ek;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class128_Sub2(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_20 = arg0;
		this.aClass270_9 = new Class270(null, 5126, 3, 0);
		this.aClass270_8 = new Class270(null, 5126, 2, 0);
		this.aClass270_6 = new Class270(null, 5126, 3, 0);
		this.aClass270_7 = new Class270(null, 5121, 4, 0);
		this.aClass81_1 = new Class81();
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!eq;Lclient!id;IIII)V")
	public Class128_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub3_20 = arg0;
		this.anInt4953 = arg5;
		this.anInt5001 = arg2;
		if (Static485.method7122(arg5, arg2)) {
			this.aClass270_9 = new Class270(null, 5126, 3, 0);
		}
		if (Static11.method118(arg2, arg5)) {
			this.aClass270_8 = new Class270(null, 5126, 2, 0);
		}
		if (Static350.method5749(arg2, arg5)) {
			this.aClass270_6 = new Class270(null, 5126, 3, 0);
		}
		if (Static469.method6993(arg2, arg5)) {
			this.aClass270_7 = new Class270(null, 5121, 4, 0);
		}
		if (Static438.method6670(arg2, arg5)) {
			this.aClass81_1 = new Class81();
		}
		@Pc(108) Interface5 local108 = arg0.anInterface5_11;
		@Pc(112) int[] local112 = new int[arg1.anInt5154];
		this.anIntArray283 = new int[arg1.anInt5152 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt5154; local121++) {
			if (arg1.aByteArray54 == null || arg1.aByteArray54[local121] != 2) {
				if (arg1.aShortArray75 != null && arg1.aShortArray75[local121] != -1) {
					@Pc(154) Class156 local154 = local108.method6869(arg1.aShortArray75[local121] & 0xFFFF);
					if (((this.anInt4953 & 0x40) == 0 || !local154.aBoolean497) && local154.aBoolean496) {
						continue;
					}
				}
				local112[this.anInt5011++] = local121;
				this.anIntArray283[arg1.aShortArray68[local121]]++;
				this.anIntArray283[arg1.aShortArray74[local121]]++;
				this.anIntArray283[arg1.aShortArray73[local121]]++;
			}
		}
		this.anInt4963 = this.anInt5011;
		@Pc(227) long[] local227 = new long[this.anInt5011];
		@Pc(236) boolean local236 = (this.anInt5001 & 0x100) != 0;
		@Pc(248) int local248;
		@Pc(261) int local261;
		@Pc(443) int local443;
		for (@Pc(238) int local238 = 0; local238 < this.anInt5011; local238++) {
			@Pc(244) int local244 = local112[local238];
			@Pc(246) Class156 local246 = null;
			local248 = 0;
			@Pc(250) byte local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			if (arg1.aClass223Array1 != null) {
				@Pc(259) boolean local259 = false;
				for (local261 = 0; local261 < arg1.aClass223Array1.length; local261++) {
					@Pc(268) Class223 local268 = arg1.aClass223Array1[local261];
					if (local268.anInt6988 == local244) {
						@Pc(281) Class346 local281 = Static328.method5503(local268.anInt6992);
						if (local281.aBoolean809) {
							local259 = true;
						}
						if (local281.anInt9795 != -1) {
							@Pc(296) Class156 local296 = local108.method6869(local281.anInt9795);
							if (local296.anInt5679 == 2) {
								this.aBoolean434 = true;
							}
						}
					}
				}
				if (local259) {
					local227[local238] = Long.MAX_VALUE;
					this.anInt4963--;
					continue;
				}
			}
			@Pc(327) short local327 = -1;
			if (arg1.aShortArray75 != null) {
				local327 = arg1.aShortArray75[local244];
				if (local327 != -1) {
					local246 = local108.method6869(local327 & 0xFFFF);
					if ((this.anInt4953 & 0x40) != 0 && local246.aBoolean497) {
						local327 = -1;
						local246 = null;
					} else {
						local252 = local246.aByte69;
						if (local246.aByte68 != 0 || local246.aByte73 != 0) {
							this.aBoolean435 = true;
						}
						local254 = local246.aByte72;
					}
				}
			}
			@Pc(399) boolean local399 = arg1.aByteArray51 != null && arg1.aByteArray51[local244] != 0 || local246 != null && local246.anInt5679 != 0;
			if ((local236 || local399) && arg1.aByteArray53 != null) {
				local248 += arg1.aByteArray53[local244] << 17;
			}
			if (local399) {
				local248 += 65536;
			}
			local248 += (local252 & 0xFF) << 8;
			local248 += local254 & 0xFF;
			local443 = local250 + ((local327 & 0xFFFF) << 16);
			@Pc(449) int local449 = local443 + (local238 & 0xFFFF);
			local227[local238] = ((long) local248 << 32) + (long) local449;
			this.aBoolean434 |= local399;
			this.aBoolean435 |= local246 != null && (local246.aByte68 != 0 || local246.aByte73 != 0);
		}
		Static542.method7686(local112, local227);
		this.anInt4977 = arg1.anInt5171;
		this.anIntArray282 = arg1.anIntArray301;
		this.aShortArray64 = arg1.aShortArray72;
		this.anInt4999 = arg1.anInt5152;
		this.lb = arg1.anIntArray299;
		this.anIntArray284 = arg1.anIntArray293;
		this.aClass18Array2 = arg1.aClass18Array4;
		@Pc(529) Class130[] local529 = new Class130[this.anInt4999];
		this.aClass215Array2 = arg1.aClass215Array4;
		@Pc(553) int local553;
		@Pc(567) int local567;
		@Pc(605) int local605;
		if (arg1.aClass223Array1 != null) {
			this.anInt5002 = arg1.aClass223Array1.length;
			this.aClass257Array1 = new Class257[this.anInt5002];
			this.aClass231Array1 = new Class231[this.anInt5002];
			for (local553 = 0; local553 < this.anInt5002; local553++) {
				@Pc(560) Class223 local560 = arg1.aClass223Array1[local553];
				@Pc(565) Class346 local565 = Static328.method5503(local560.anInt6992);
				local567 = -1;
				for (@Pc(569) int local569 = 0; local569 < this.anInt5011; local569++) {
					if (local560.anInt6988 == local112[local569]) {
						local567 = local569;
						break;
					}
				}
				if (local567 == -1) {
					throw new RuntimeException();
				}
				local605 = Static120.anIntArray152[arg1.aShortArray70[local560.anInt6988] & 0xFFFF] & 0xFFFFFF;
				@Pc(622) int local622 = local605 | 255 - (arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local560.anInt6988]) << 24;
				this.aClass257Array1[local553] = new Class257(local567, arg1.aShortArray68[local560.anInt6988], arg1.aShortArray74[local560.anInt6988], arg1.aShortArray73[local560.anInt6988], local565.anInt9796, local565.anInt9797, local565.anInt9795, local565.anInt9794, local565.anInt9798, local565.aBoolean809, local565.aBoolean808, local560.anInt6994);
				this.aClass231Array1[local553] = new Class231(local622);
			}
		}
		local553 = this.anInt5011 * 3;
		this.aByteArray49 = new byte[local553];
		this.aShortArray56 = new short[this.anInt5011];
		Static627.aLongArray16 = new long[local553];
		if (arg1.aShortArray71 != null) {
			this.aShortArray65 = new short[this.anInt5011];
		}
		this.aShortArray57 = new short[local553];
		this.aShortArray63 = new short[this.anInt5011];
		this.aByteArray50 = new byte[this.anInt5011];
		this.aFloatArray47 = new float[local553];
		this.aShortArray55 = new short[local553];
		this.aShort62 = (short) arg4;
		this.aShortArray59 = new short[local553];
		this.aShortArray58 = new short[this.anInt5011];
		this.aShortArray61 = new short[local553];
		this.aShortArray60 = new short[this.anInt5011];
		this.aFloatArray46 = new float[local553];
		this.aShort58 = (short) arg3;
		this.aShortArray62 = new short[this.anInt5011];
		local248 = 0;
		for (local443 = 0; local443 < arg1.anInt5152; local443++) {
			local567 = this.anIntArray283[local443];
			this.anIntArray283[local443] = local248;
			local529[local443] = new Class130();
			local248 += local567;
		}
		this.anIntArray283[arg1.anInt5152] = local248;
		@Pc(800) Class382 local800 = Static243.method4636(local112, this.anInt5011, arg1);
		@Pc(804) Class201[] local804 = new Class201[arg1.anInt5154];
		@Pc(843) int local843;
		@Pc(854) int local854;
		@Pc(875) int local875;
		@Pc(886) int local886;
		@Pc(895) int local895;
		@Pc(904) int local904;
		@Pc(823) short local823;
		@Pc(833) int local833;
		for (local605 = 0; local605 < arg1.anInt5154; local605++) {
			@Pc(813) short local813 = arg1.aShortArray68[local605];
			@Pc(818) short local818 = arg1.aShortArray74[local605];
			local823 = arg1.aShortArray73[local605];
			local833 = this.anIntArray282[local818] - this.anIntArray282[local813];
			local843 = this.anIntArray284[local818] - this.anIntArray284[local813];
			local854 = this.lb[local818] - this.lb[local813];
			@Pc(864) int local864 = this.anIntArray282[local823] - this.anIntArray282[local813];
			local875 = this.anIntArray284[local823] - this.anIntArray284[local813];
			local886 = this.lb[local823] - this.lb[local813];
			local895 = local886 * local843 - local875 * local854;
			local904 = local864 * local854 - local833 * local886;
			@Pc(912) int local912 = local875 * local833 - local843 * local864;
			while (local895 > 8192 || local904 > 8192 || local912 > 8192 || local895 < -8192 || local904 < -8192 || local912 < -8192) {
				local912 >>= 0x1;
				local904 >>= 0x1;
				local895 >>= 0x1;
			}
			@Pc(966) int local966 = (int) Math.sqrt((double) (local912 * local912 + local895 * local895 + local904 * local904));
			if (local966 <= 0) {
				local966 = 1;
			}
			local895 = local895 * 256 / local966;
			local904 = local904 * 256 / local966;
			local912 = local912 * 256 / local966;
			@Pc(998) byte local998 = arg1.aByteArray54 == null ? 0 : arg1.aByteArray54[local605];
			if (local998 == 0) {
				@Pc(1007) Class130 local1007 = local529[local813];
				local1007.anInt4813++;
				local1007.anInt4814 += local895;
				local1007.anInt4811 += local904;
				local1007.anInt4810 += local912;
				@Pc(1035) Class130 local1035 = local529[local818];
				local1035.anInt4813++;
				local1035.anInt4811 += local904;
				local1035.anInt4810 += local912;
				local1035.anInt4814 += local895;
				@Pc(1063) Class130 local1063 = local529[local823];
				local1063.anInt4811 += local904;
				local1063.anInt4814 += local895;
				local1063.anInt4810 += local912;
				local1063.anInt4813++;
			} else if (local998 == 1) {
				@Pc(1100) Class201 local1100 = local804[local605] = new Class201();
				local1100.anInt6480 = local895;
				local1100.anInt6485 = local912;
				local1100.anInt6484 = local904;
			}
		}
		@Pc(1122) int local1122;
		@Pc(1165) short local1165;
		for (local261 = 0; local261 < this.anInt5011; local261++) {
			local1122 = local112[local261];
			@Pc(1129) int local1129 = arg1.aShortArray70[local1122] & 0xFFFF;
			if (arg1.aByteArray56 == null) {
				local833 = -1;
			} else {
				local833 = arg1.aByteArray56[local1122];
			}
			if (arg1.aByteArray51 == null) {
				local843 = 0;
			} else {
				local843 = arg1.aByteArray51[local1122] & 0xFF;
			}
			local1165 = arg1.aShortArray75 == null ? -1 : arg1.aShortArray75[local1122];
			if (local1165 != -1 && (this.anInt4953 & 0x40) != 0) {
				@Pc(1181) Class156 local1181 = local108.method6869(local1165 & 0xFFFF);
				if (local1181.aBoolean497) {
					local1165 = -1;
				}
			}
			@Pc(1188) float local1188 = 0.0F;
			@Pc(1190) float local1190 = 0.0F;
			@Pc(1192) float local1192 = 0.0F;
			@Pc(1194) float local1194 = 0.0F;
			@Pc(1196) float local1196 = 0.0F;
			@Pc(1198) float local1198 = 0.0F;
			@Pc(1200) byte local1200 = 0;
			@Pc(1202) byte local1202 = 0;
			@Pc(1204) int local1204 = 0;
			@Pc(1238) byte local1238;
			@Pc(1255) short local1255;
			@Pc(2052) short local2052;
			@Pc(2057) short local2057;
			if (local1165 != -1) {
				if (local833 == -1) {
					local1188 = 0.0F;
					local1196 = 0.0F;
					local1202 = 2;
					local1194 = 1.0F;
					local1198 = 0.0F;
					local1190 = 1.0F;
					local1192 = 1.0F;
					local1200 = 1;
				} else {
					local833 &= 0xFF;
					local1238 = arg1.aByteArray52[local833];
					@Pc(1245) short local1245;
					@Pc(1250) short local1250;
					@Pc(1288) float local1288;
					@Pc(1306) float local1306;
					@Pc(1314) float local1314;
					@Pc(1413) float local1413;
					@Pc(1421) float local1421;
					@Pc(1429) float local1429;
					@Pc(1452) float local1452;
					@Pc(1475) float local1475;
					@Pc(1498) float local1498;
					if (local1238 == 0) {
						local1245 = arg1.aShortArray68[local1122];
						local1250 = arg1.aShortArray74[local1122];
						local1255 = arg1.aShortArray73[local1122];
						local2052 = arg1.aShortArray67[local833];
						local2057 = arg1.aShortArray66[local833];
						@Pc(2062) short local2062 = arg1.aShortArray69[local833];
						@Pc(2068) float local2068 = (float) arg1.anIntArray301[local2052];
						@Pc(2074) float local2074 = (float) arg1.anIntArray293[local2052];
						local1288 = arg1.anIntArray299[local2052];
						local1306 = (float) arg1.anIntArray301[local2057] - local2068;
						local1314 = (float) arg1.anIntArray293[local2057] - local2074;
						@Pc(2105) float local2105 = (float) arg1.anIntArray299[local2057] - local1288;
						@Pc(2113) float local2113 = (float) arg1.anIntArray301[local2062] - local2068;
						@Pc(2122) float local2122 = (float) arg1.anIntArray293[local2062] - local2074;
						@Pc(2130) float local2130 = (float) arg1.anIntArray299[local2062] - local1288;
						@Pc(2138) float local2138 = (float) arg1.anIntArray301[local1245] - local2068;
						@Pc(2146) float local2146 = (float) arg1.anIntArray293[local1245] - local2074;
						@Pc(2155) float local2155 = (float) arg1.anIntArray299[local1245] - local1288;
						@Pc(2163) float local2163 = (float) arg1.anIntArray301[local1250] - local2068;
						@Pc(2172) float local2172 = (float) arg1.anIntArray293[local1250] - local2074;
						local1413 = (float) arg1.anIntArray299[local1250] - local1288;
						local1421 = (float) arg1.anIntArray301[local1255] - local2068;
						local1429 = (float) arg1.anIntArray293[local1255] - local2074;
						local1452 = (float) arg1.anIntArray299[local1255] - local1288;
						local1475 = local1314 * local2130 - local2105 * local2122;
						local1498 = local2113 * local2105 - local1306 * local2130;
						@Pc(2230) float local2230 = local2122 * local1306 - local1314 * local2113;
						@Pc(2238) float local2238 = local2230 * local2122 - local2130 * local1498;
						@Pc(2247) float local2247 = local1475 * local2130 - local2113 * local2230;
						@Pc(2255) float local2255 = local1498 * local2113 - local1475 * local2122;
						@Pc(2269) float local2269 = 1.0F / (local2247 * local1314 + local1306 * local2238 + local2105 * local2255);
						local1196 = local2269 * (local1452 * local2255 + local2238 * local1421 + local1429 * local2247);
						local1188 = (local2155 * local2255 + local2247 * local2146 + local2138 * local2238) * local2269;
						local1192 = (local1413 * local2255 + local2172 * local2247 + local2238 * local2163) * local2269;
						@Pc(2319) float local2319 = local2105 * local1475 - local1306 * local2230;
						@Pc(2328) float local2328 = local2230 * local1314 - local2105 * local1498;
						@Pc(2336) float local2336 = local1306 * local1498 - local1314 * local1475;
						@Pc(2350) float local2350 = 1.0F / (local2122 * local2319 + local2113 * local2328 + local2336 * local2130);
						local1190 = local2350 * (local2146 * local2319 + local2138 * local2328 + local2155 * local2336);
						local1198 = (local2336 * local1452 + local2319 * local1429 + local1421 * local2328) * local2350;
						local1194 = (local1413 * local2336 + local2328 * local2163 + local2172 * local2319) * local2350;
					} else {
						local1245 = arg1.aShortArray68[local1122];
						local1250 = arg1.aShortArray74[local1122];
						local1255 = arg1.aShortArray73[local1122];
						@Pc(1260) int local1260 = local800.anIntArray631[local833];
						@Pc(1265) int local1265 = local800.anIntArray630[local833];
						@Pc(1270) int local1270 = local800.anIntArray629[local833];
						@Pc(1275) float[] local1275 = local800.aFloatArrayArray18[local833];
						@Pc(1280) byte local1280 = arg1.aByteArray55[local833];
						local1288 = (float) arg1.anIntArray295[local833] / 256.0F;
						if (local1238 == 1) {
							local1306 = (float) arg1.anIntArray303[local833] / 1024.0F;
							Static430.method6593(arg1.anIntArray293[local1245], local1306, local1288, local1275, local1260, local1270, local1265, arg1.anIntArray299[local1245], arg1.anIntArray301[local1245], local1280, Static46.aFloatArray12);
							local1190 = Static46.aFloatArray12[1];
							local1188 = Static46.aFloatArray12[0];
							Static430.method6593(arg1.anIntArray293[local1250], local1306, local1288, local1275, local1260, local1270, local1265, arg1.anIntArray299[local1250], arg1.anIntArray301[local1250], local1280, Static46.aFloatArray12);
							local1192 = Static46.aFloatArray12[0];
							local1194 = Static46.aFloatArray12[1];
							Static430.method6593(arg1.anIntArray293[local1255], local1306, local1288, local1275, local1260, local1270, local1265, arg1.anIntArray299[local1255], arg1.anIntArray301[local1255], local1280, Static46.aFloatArray12);
							local1198 = Static46.aFloatArray12[1];
							local1196 = Static46.aFloatArray12[0];
							local1314 = local1306 / 2.0F;
							if ((local1280 & 0x1) == 0) {
								if (local1314 < local1192 - local1188) {
									local1200 = 1;
									local1192 -= local1306;
								} else if (local1188 - local1192 > local1314) {
									local1200 = 2;
									local1192 += local1306;
								}
								if (local1196 - local1188 > local1314) {
									local1196 -= local1306;
									local1202 = 1;
								} else if (local1314 < local1188 - local1196) {
									local1202 = 2;
									local1196 += local1306;
								}
							} else {
								if (local1314 < local1194 - local1190) {
									local1200 = 1;
									local1194 -= local1306;
								} else if (local1190 - local1194 > local1314) {
									local1194 += local1306;
									local1200 = 2;
								}
								if (local1198 - local1190 > local1314) {
									local1202 = 1;
									local1198 -= local1306;
								} else if (local1314 < local1190 - local1198) {
									local1202 = 2;
									local1198 += local1306;
								}
							}
						} else if (local1238 == 2) {
							local1306 = (float) arg1.anIntArray300[local833] / 256.0F;
							local1314 = (float) arg1.anIntArray296[local833] / 256.0F;
							@Pc(1324) int local1324 = arg1.anIntArray301[local1250] - arg1.anIntArray301[local1245];
							@Pc(1334) int local1334 = arg1.anIntArray293[local1250] - arg1.anIntArray293[local1245];
							@Pc(1345) int local1345 = arg1.anIntArray299[local1250] - arg1.anIntArray299[local1245];
							@Pc(1356) int local1356 = arg1.anIntArray301[local1255] - arg1.anIntArray301[local1245];
							@Pc(1367) int local1367 = arg1.anIntArray293[local1255] - arg1.anIntArray293[local1245];
							@Pc(1378) int local1378 = arg1.anIntArray299[local1255] - arg1.anIntArray299[local1245];
							@Pc(1387) int local1387 = local1378 * local1334 - local1345 * local1367;
							@Pc(1396) int local1396 = local1356 * local1345 - local1378 * local1324;
							@Pc(1405) int local1405 = local1367 * local1324 - local1356 * local1334;
							local1413 = 64.0F / (float) arg1.anIntArray302[local833];
							local1421 = 64.0F / (float) arg1.anIntArray294[local833];
							local1429 = 64.0F / (float) arg1.anIntArray303[local833];
							local1452 = (local1275[2] * (float) local1405 + local1275[0] * (float) local1387 + (float) local1396 * local1275[1]) / local1413;
							local1475 = (local1275[5] * (float) local1405 + (float) local1396 * local1275[4] + (float) local1387 * local1275[3]) / local1421;
							local1498 = (local1275[6] * (float) local1387 + local1275[7] * (float) local1396 + local1275[8] * (float) local1405) / local1429;
							local1204 = Static394.method6308(local1452, local1498, local1475);
							Static622.method7869(local1280, local1270, local1288, local1204, local1314, Static46.aFloatArray12, arg1.anIntArray293[local1245], local1260, local1265, local1275, arg1.anIntArray299[local1245], arg1.anIntArray301[local1245], local1306);
							local1190 = Static46.aFloatArray12[1];
							local1188 = Static46.aFloatArray12[0];
							Static622.method7869(local1280, local1270, local1288, local1204, local1314, Static46.aFloatArray12, arg1.anIntArray293[local1250], local1260, local1265, local1275, arg1.anIntArray299[local1250], arg1.anIntArray301[local1250], local1306);
							local1192 = Static46.aFloatArray12[0];
							local1194 = Static46.aFloatArray12[1];
							Static622.method7869(local1280, local1270, local1288, local1204, local1314, Static46.aFloatArray12, arg1.anIntArray293[local1255], local1260, local1265, local1275, arg1.anIntArray299[local1255], arg1.anIntArray301[local1255], local1306);
							local1196 = Static46.aFloatArray12[0];
							local1198 = Static46.aFloatArray12[1];
						} else if (local1238 == 3) {
							Static35.method700(Static46.aFloatArray12, arg1.anIntArray293[local1245], local1280, local1275, local1288, local1265, arg1.anIntArray299[local1245], local1260, arg1.anIntArray301[local1245], local1270);
							local1188 = Static46.aFloatArray12[0];
							local1190 = Static46.aFloatArray12[1];
							Static35.method700(Static46.aFloatArray12, arg1.anIntArray293[local1250], local1280, local1275, local1288, local1265, arg1.anIntArray299[local1250], local1260, arg1.anIntArray301[local1250], local1270);
							local1192 = Static46.aFloatArray12[0];
							local1194 = Static46.aFloatArray12[1];
							Static35.method700(Static46.aFloatArray12, arg1.anIntArray293[local1255], local1280, local1275, local1288, local1265, arg1.anIntArray299[local1255], local1260, arg1.anIntArray301[local1255], local1270);
							local1198 = Static46.aFloatArray12[1];
							local1196 = Static46.aFloatArray12[0];
							if ((local1280 & 0x1) == 0) {
								if (local1192 - local1188 > 0.5F) {
									local1200 = 1;
									local1192--;
								} else if (local1188 - local1192 > 0.5F) {
									local1200 = 2;
									local1192++;
								}
								if (local1196 - local1188 > 0.5F) {
									local1202 = 1;
									local1196--;
								} else if (local1188 - local1196 > 0.5F) {
									local1196++;
									local1202 = 2;
								}
							} else {
								if (local1198 - local1190 > 0.5F) {
									local1198--;
									local1202 = 1;
								} else if (local1190 - local1198 > 0.5F) {
									local1198++;
									local1202 = 2;
								}
								if (local1194 - local1190 > 0.5F) {
									local1194--;
									local1200 = 1;
								} else if (local1190 - local1194 > 0.5F) {
									local1194++;
									local1200 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray54 == null) {
				local1238 = 0;
			} else {
				local1238 = arg1.aByteArray54[local1122];
			}
			if (local1238 == 0) {
				@Pc(2554) long local2554 = (long) (local833 << 2) + ((long) local843 + (long) (local1129 << 8) + (long) (local1204 << 24) << 32);
				local1255 = arg1.aShortArray68[local1122];
				local2052 = arg1.aShortArray74[local1122];
				local2057 = arg1.aShortArray73[local1122];
				@Pc(2573) Class130 local2573 = local529[local1255];
				this.aShortArray58[local261] = this.method4209(arg1, local2573.anInt4810, local2573.anInt4814, local1190, local2573.anInt4811, local2554, local2573.anInt4813, local1188, local1255);
				@Pc(2597) Class130 local2597 = local529[local2052];
				this.aShortArray62[local261] = this.method4209(arg1, local2597.anInt4810, local2597.anInt4814, local1194, local2597.anInt4811, local2554 + (long) local1200, local2597.anInt4813, local1192, local2052);
				@Pc(2624) Class130 local2624 = local529[local2057];
				this.aShortArray60[local261] = this.method4209(arg1, local2624.anInt4810, local2624.anInt4814, local1198, local2624.anInt4811, local2554 + (long) local1202, local2624.anInt4813, local1196, local2057);
			} else if (local1238 == 1) {
				@Pc(2415) Class201 local2415 = local804[local1122];
				@Pc(2459) long local2459 = (long) ((local2415.anInt6485 + 256 << 22) + ((local833 << 2) - (-(local2415.anInt6480 <= 0 ? 2048 : 1024) - (local2415.anInt6484 + 256 << 12)))) + ((long) local843 + (long) (local1129 << 8) + (long) (local1204 << 24) << 32);
				this.aShortArray58[local261] = this.method4209(arg1, local2415.anInt6485, local2415.anInt6480, local1190, local2415.anInt6484, local2459, 0, local1188, arg1.aShortArray68[local1122]);
				this.aShortArray62[local261] = this.method4209(arg1, local2415.anInt6485, local2415.anInt6480, local1194, local2415.anInt6484, local2459 + (long) local1200, 0, local1192, arg1.aShortArray74[local1122]);
				this.aShortArray60[local261] = this.method4209(arg1, local2415.anInt6485, local2415.anInt6480, local1198, local2415.anInt6484, (long) local1202 + local2459, 0, local1196, arg1.aShortArray73[local1122]);
			}
			if (arg1.aByteArray51 != null) {
				this.aByteArray50[local261] = arg1.aByteArray51[local1122];
			}
			if (arg1.aShortArray71 != null) {
				this.aShortArray65[local261] = arg1.aShortArray71[local1122];
			}
			this.aShortArray63[local261] = arg1.aShortArray70[local1122];
			this.aShortArray56[local261] = local1165;
		}
		local1122 = 0;
		local823 = -10000;
		for (local833 = 0; local833 < this.anInt4963; local833++) {
			@Pc(2700) short local2700 = this.aShortArray56[local833];
			if (local2700 != local823) {
				local1122++;
				local823 = local2700;
			}
		}
		this.anIntArray285 = new int[local1122 + 1];
		local823 = -10000;
		local1122 = 0;
		for (local843 = 0; local843 < this.anInt4963; local843++) {
			local1165 = this.aShortArray56[local843];
			if (local1165 != local823) {
				this.anIntArray285[local1122++] = local843;
				local823 = local1165;
			}
		}
		this.anIntArray285[local1122] = this.anInt4963;
		Static627.aLongArray16 = null;
		this.aShortArray57 = Static97.method2491(this.anInt5009, this.aShortArray57);
		this.aShortArray61 = Static97.method2491(this.anInt5009, this.aShortArray61);
		this.aShortArray55 = Static97.method2491(this.anInt5009, this.aShortArray55);
		this.aByteArray49 = Static14.method8603(this.aByteArray49, this.anInt5009);
		this.aFloatArray47 = Static261.method4863(this.aFloatArray47, this.anInt5009);
		this.aFloatArray46 = Static261.method4863(this.aFloatArray46, this.anInt5009);
		if (arg1.anIntArray297 != null && Static388.method6122(arg2, this.anInt4953)) {
			this.anIntArrayArray46 = arg1.method4363(false);
		}
		if (arg1.aClass223Array1 != null && Static507.method7378(arg2, this.anInt4953)) {
			this.anIntArrayArray47 = arg1.method4364();
		}
		if (arg1.anIntArray298 != null && Static73.method1847(arg2, this.anInt4953)) {
			local854 = 0;
			@Pc(2861) int[] local2861 = new int[256];
			for (local875 = 0; local875 < this.anInt5011; local875++) {
				local886 = arg1.anIntArray298[local112[local875]];
				if (local886 >= 0) {
					@Pc(2878) int local2878 = local2861[local886]++;
					if (local854 < local886) {
						local854 = local886;
					}
				}
			}
			this.anIntArrayArray45 = new int[local854 + 1][];
			for (local886 = 0; local886 <= local854; local886++) {
				this.anIntArrayArray45[local886] = new int[local2861[local886]];
				local2861[local886] = 0;
			}
			for (local895 = 0; local895 < this.anInt5011; local895++) {
				local904 = arg1.anIntArray298[local112[local895]];
				if (local904 >= 0) {
					this.anIntArrayArray45[local904][local2861[local904]++] = local895;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!id;IIFIJIFBI)S")
	private short method4209(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray283[arg8];
		@Pc(17) int local17 = this.anIntArray283[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray59[local27];
			if (local34 == 0) {
				local19 = local27;
				break;
			}
			if (Static627.aLongArray16[local27] == arg5) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray59[local19] = (short) (this.anInt5009 + 1);
		Static627.aLongArray16[local19] = arg5;
		this.aShortArray57[this.anInt5009] = (short) arg2;
		this.aShortArray61[this.anInt5009] = (short) arg4;
		this.aShortArray55[this.anInt5009] = (short) arg1;
		this.aByteArray49[this.anInt5009] = (byte) arg6;
		this.aFloatArray47[this.anInt5009] = arg7;
		this.aFloatArray46[this.anInt5009] = arg3;
		return (short) this.anInt5009++;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()[Lclient!al;")
	@Override
	public Class18[] method6277() {
		return this.aClass18Array2;
	}

	@OriginalMember(owner = "client!hn", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class128 method6279(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class128_Sub2 local14;
		@Pc(18) Class128_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass33_Sub3_20.aClass128_Sub2_3;
			local18 = this.aClass33_Sub3_20.aClass128_Sub2_10;
		} else if (arg0 == 2) {
			local18 = this.aClass33_Sub3_20.aClass128_Sub2_1;
			local14 = this.aClass33_Sub3_20.aClass128_Sub2_5;
		} else if (arg0 == 3) {
			local18 = this.aClass33_Sub3_20.aClass128_Sub2_9;
			local14 = this.aClass33_Sub3_20.aClass128_Sub2_6;
		} else if (arg0 == 4) {
			local14 = this.aClass33_Sub3_20.aClass128_Sub2_4;
			local18 = this.aClass33_Sub3_20.aClass128_Sub2_8;
		} else if (arg0 == 5) {
			local18 = this.aClass33_Sub3_20.aClass128_Sub2_7;
			local14 = this.aClass33_Sub3_20.aClass128_Sub2_2;
		} else {
			local14 = local18 = new Class128_Sub2(this.aClass33_Sub3_20);
		}
		return this.method4218(arg1, arg0 != 0, local14, local18, arg2);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(ZI)V")
	private void method4210(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass270_7 != null && this.aClass270_7.anInterface27_6 == null;
		@Pc(27) boolean local27 = this.aClass270_6 != null && this.aClass270_6.anInterface27_6 == null;
		@Pc(38) boolean local38 = this.aClass270_9 != null && this.aClass270_9.anInterface27_6 == null;
		@Pc(49) boolean local49 = this.aClass270_8 != null && this.aClass270_8.anInterface27_6 == null;
		if (arg0) {
			local16 &= (this.aByte54 & 0x2) != 0;
			local38 &= (this.aByte54 & 0x1) != 0;
			local27 &= (this.aByte54 & 0x4) != 0;
			local49 &= (this.aByte54 & 0x8) != 0;
		}
		@Pc(97) byte local97 = 0;
		@Pc(101) byte local101 = 0;
		@Pc(103) byte local103 = 0;
		if (local38) {
			local97 = 12;
		}
		@Pc(120) byte local120 = 0;
		if (local16) {
			local101 = local97;
			local97 = (byte) (local97 + 4);
		}
		if (local27) {
			local103 = local97;
			local97 = (byte) (local97 + 12);
		}
		if (local49) {
			local120 = local97;
			local97 = (byte) (local97 + 8);
		}
		if (local97 == 0) {
			return;
		}
		if (this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2.aByteArray106.length < local97 * this.anInt5009) {
			this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2((this.anInt5009 + 100) * local97);
		} else {
			this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2.anInt10282 = 0;
		}
		@Pc(183) Class3_Sub15_Sub2 local183 = this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass33_Sub3_20.aBoolean264) {
				for (local191 = 0; local191 < this.anInt4999; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray282[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray284[local191]);
					local214 = Stream.floatToRawIntBits((float) this.lb[local191]);
					local219 = this.anIntArray283[local191];
					local226 = this.anIntArray283[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray59[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10282 = local237 * local97;
						local183.method8419(local200);
						local183.method8419(local207);
						local183.method8419(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt4999; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray282[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray284[local191]);
					local214 = Stream.floatToRawIntBits((float) this.lb[local191]);
					local219 = this.anIntArray283[local191];
					local226 = this.anIntArray283[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray59[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt10282 = local237 * local97;
						local183.method8462(local200);
						local183.method8462(local207);
						local183.method8462(local214);
					}
				}
			}
		}
		@Pc(480) float local480;
		@Pc(376) short[] local376;
		@Pc(370) short[] local370;
		@Pc(367) short[] local367;
		@Pc(373) byte[] local373;
		@Pc(524) float local524;
		if (local16) {
			if (this.aClass270_6 == null) {
				if (this.aClass342_1 == null) {
					local367 = this.aShortArray55;
					local370 = this.aShortArray61;
					local373 = this.aByteArray49;
					local376 = this.aShortArray57;
				} else {
					local370 = this.aClass342_1.aShortArray139;
					local373 = this.aClass342_1.aByteArray97;
					local376 = this.aClass342_1.aShortArray141;
					local367 = this.aClass342_1.aShortArray140;
				}
				@Pc(400) float local400 = this.aClass33_Sub3_20.aFloatArray42[0];
				@Pc(406) float local406 = this.aClass33_Sub3_20.aFloatArray42[1];
				@Pc(412) float local412 = this.aClass33_Sub3_20.aFloatArray42[2];
				@Pc(416) float local416 = this.aClass33_Sub3_20.aFloat114;
				@Pc(426) float local426 = this.aClass33_Sub3_20.aFloat103 * 768.0F / (float) this.aShort62;
				@Pc(436) float local436 = this.aClass33_Sub3_20.aFloat122 * 768.0F / (float) this.aShort62;
				for (@Pc(438) int local438 = 0; local438 < this.anInt5011; local438++) {
					@Pc(458) int local458 = this.method4211(this.aShort58, this.aShortArray56[local438], this.aShortArray63[local438], this.aByteArray50[local438]);
					@Pc(469) float local469 = this.aClass33_Sub3_20.aFloat109 * (float) (local458 >> 8 & 0xFF);
					local480 = this.aClass33_Sub3_20.aFloat110 * (float) (local458 >> 16 & 0xFF);
					@Pc(485) short local485 = this.aShortArray58[local438];
					@Pc(494) float local494 = this.aClass33_Sub3_20.aFloat123 * (float) (local458 >>> 24);
					@Pc(499) short local499 = (short) local373[local485];
					if (local499 == 0) {
						local524 = ((float) local376[local485] * local400 + local406 * (float) local370[local485] + (float) local367[local485] * local412) * 0.0026041667F;
					} else {
						local524 = (local406 * (float) local370[local485] + local400 * (float) local376[local485] + local412 * (float) local367[local485]) / (float) (local499 * 256);
					}
					@Pc(564) float local564 = (local524 < 0.0F ? local436 : local426) * local524 + local416;
					@Pc(569) int local569 = (int) (local564 * local494);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					@Pc(588) int local588 = (int) (local480 * local564);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					@Pc(604) int local604 = (int) (local564 * local469);
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.anInt10282 = local485 * local97 + local101;
					local183.method8448(local569);
					local183.method8448(local588);
					local183.method8448(local604);
					local183.method8448(255 - (this.aByteArray50[local438] & 0xFF));
					local485 = this.aShortArray62[local438];
					local499 = local373[local485];
					if (local499 == 0) {
						local524 = ((float) local370[local485] * local406 + local400 * (float) local376[local485] + (float) local367[local485] * local412) * 0.0026041667F;
					} else {
						local524 = ((float) local367[local485] * local412 + (float) local370[local485] * local406 + local400 * (float) local376[local485]) / (float) (local499 * 256);
					}
					local564 = local416 + (local524 < 0.0F ? local436 : local426) * local524;
					local569 = (int) (local564 * local494);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					local588 = (int) (local564 * local480);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local604 = (int) (local564 * local469);
					local183.anInt10282 = local485 * local97 + local101;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.method8448(local569);
					local183.method8448(local588);
					local183.method8448(local604);
					local183.method8448(255 - (this.aByteArray50[local438] & 0xFF));
					local485 = this.aShortArray60[local438];
					local499 = local373[local485];
					if (local499 == 0) {
						local524 = ((float) local367[local485] * local412 + local400 * (float) local376[local485] + local406 * (float) local370[local485]) * 0.0026041667F;
					} else {
						local524 = (local412 * (float) local367[local485] + local406 * (float) local370[local485] + local400 * (float) local376[local485]) / (float) (local499 * 256);
					}
					local564 = local416 + local524 * (local524 < 0.0F ? local436 : local426);
					local569 = (int) (local564 * local494);
					local588 = (int) (local480 * local564);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					local604 = (int) (local469 * local564);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local183.anInt10282 = local485 * local97 + local101;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.method8448(local569);
					local183.method8448(local588);
					local183.method8448(local604);
					local183.method8448(255 - (this.aByteArray50[local438] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt5011; local191++) {
					local200 = this.method4211(this.aShort58, this.aShortArray56[local191], this.aShortArray63[local191], this.aByteArray50[local191]);
					local183.anInt10282 = this.aShortArray58[local191] * local97 + local101;
					local183.method8419(local200);
					local183.anInt10282 = this.aShortArray62[local191] * local97 + local101;
					local183.method8419(local200);
					local183.anInt10282 = local101 + local97 * this.aShortArray60[local191];
					local183.method8419(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass342_1 == null) {
				local376 = this.aShortArray57;
				local373 = this.aByteArray49;
				local367 = this.aShortArray55;
				local370 = this.aShortArray61;
			} else {
				local367 = this.aClass342_1.aShortArray140;
				local373 = this.aClass342_1.aByteArray97;
				local376 = this.aClass342_1.aShortArray141;
				local370 = this.aClass342_1.aShortArray139;
			}
			@Pc(1118) float local1118 = 3.0F / (float) this.aShort62;
			local183.anInt10282 = local103;
			local524 = 3.0F / (float) (this.aShort62 / 2 + this.aShort62);
			if (this.aClass33_Sub3_20.aBoolean264) {
				for (local228 = 0; local228 < this.anInt5009; local228++) {
					local237 = local373[local228] & 0xFF;
					if (local237 == 0) {
						local183.method8469((float) local376[local228] * local524);
						local183.method8469((float) local370[local228] * local524);
						local183.method8469(local524 * (float) local367[local228]);
					} else {
						local480 = local1118 / (float) local237;
						local183.method8469((float) local376[local228] * local480);
						local183.method8469((float) local370[local228] * local480);
						local183.method8469(local480 * (float) local367[local228]);
					}
					local183.anInt10282 += local97 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt5009; local228++) {
					local237 = local373[local228] & 0xFF;
					if (local237 == 0) {
						local183.method8470((float) local376[local228] * local524);
						local183.method8470((float) local370[local228] * local524);
						local183.method8470(local524 * (float) local367[local228]);
					} else {
						local480 = local1118 / (float) local237;
						local183.method8470((float) local376[local228] * local480);
						local183.method8470(local480 * (float) local370[local228]);
						local183.method8470(local480 * (float) local367[local228]);
					}
					local183.anInt10282 += local97 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt10282 = local120;
			if (this.aClass33_Sub3_20.aBoolean264) {
				for (local191 = 0; local191 < this.anInt5009; local191++) {
					local183.method8469(this.aFloatArray47[local191]);
					local183.method8469(this.aFloatArray46[local191]);
					local183.anInt10282 += local97 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt5009; local191++) {
					local183.method8470(this.aFloatArray47[local191]);
					local183.method8470(this.aFloatArray46[local191]);
					local183.anInt10282 += local97 - 8;
				}
			}
		}
		local183.anInt10282 = local97 * this.anInt5009;
		@Pc(1419) Interface27 local1419;
		if (arg0) {
			if (this.anInterface27_4 == null) {
				this.anInterface27_4 = this.aClass33_Sub3_20.method3072(local97, local183.anInt10282, local183.aByteArray106, true);
			} else {
				this.anInterface27_4.method8092(local183.aByteArray106, local183.anInt10282, local97);
			}
			local1419 = this.anInterface27_4;
			this.aByte54 = 0;
		} else {
			local1419 = this.aClass33_Sub3_20.method3072(local97, local183.anInt10282, local183.aByteArray106, false);
			this.aBoolean436 = true;
		}
		if (local38) {
			this.aClass270_9.aByte99 = 0;
			this.aClass270_9.anInterface27_6 = local1419;
		}
		if (local49) {
			this.aClass270_8.anInterface27_6 = local1419;
			this.aClass270_8.aByte99 = local120;
		}
		if (local16) {
			this.aClass270_7.aByte99 = local101;
			this.aClass270_7.anInterface27_6 = local1419;
		}
		if (local27) {
			this.aClass270_6.anInterface27_6 = local1419;
			this.aClass270_6.aByte99 = local103;
		}
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "()V")
	@Override
	protected void method6291() {
	}

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort58 = (short) arg0;
		if (this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ISIIB)I")
	private int method4211(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static120.anIntArray152[Static506.method7376(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(31) Class156 local31 = this.aClass33_Sub3_20.anInterface5_11.method6869(arg1 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte71 & 0xFF;
			@Pc(50) int local50;
			@Pc(71) int local71;
			if (local36 != 0) {
				if (arg0 < 0) {
					local50 = 0;
				} else if (arg0 > 127) {
					local50 = 16777215;
				} else {
					local50 = arg0 * 131586;
				}
				if (local36 == 256) {
					local12 = local50;
				} else {
					local71 = 256 - local36;
					local12 = (local36 * (local50 & 0xFF00) + local71 * (local12 & 0xFF00) & 0xFF0000) + (local36 * (local50 & 0xFF00FF) + local71 * (local12 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local50 = local31.aByte74 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(121) int local121 = local50 * (local12 >> 16 & 0xFF);
				if (local121 > 65535) {
					local121 = 65535;
				}
				local71 = local50 * (local12 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(147) int local147 = (local12 & 0xFF) * local50;
				if (local147 > 65535) {
					local147 = 65535;
				}
				local12 = (local71 & 0xFF00) + (local121 << 8 & 0xFF003C) + (local147 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!hn", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!hn", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!wc;ZIIIZ)Z")
	private boolean method4212(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class47_Sub2 local8 = (Class47_Sub2) arg1;
		@Pc(12) Class47_Sub2 local12 = this.aClass33_Sub3_20.aClass47_Sub2_3;
		@Pc(33) float local33 = local12.aFloat135 * local8.aFloat142 + local8.aFloat140 * local12.aFloat132 + local12.aFloat138 * local8.aFloat139 + local12.aFloat142;
		@Pc(54) float local54 = local12.aFloat140 + local12.aFloat134 * local8.aFloat139 + local12.aFloat131 * local8.aFloat142 + local12.aFloat137 * local8.aFloat140;
		Static83.aFloat196 = local12.aFloat131 * local8.aFloat135 + local8.aFloat131 * local12.aFloat137 + local8.aFloat141 * local12.aFloat134;
		@Pc(93) float local93 = local12.aFloat139 + local12.aFloat136 * local8.aFloat140 + local8.aFloat142 * local12.aFloat141 + local12.aFloat133 * local8.aFloat139;
		Static122.aFloat100 = local8.aFloat132 * local12.aFloat131 + local12.aFloat137 * local8.aFloat137 + local8.aFloat136 * local12.aFloat134;
		Static445.aFloat223 = local12.aFloat132 * local8.aFloat131 + local12.aFloat135 * local8.aFloat135 + local8.aFloat141 * local12.aFloat138;
		Static397.aFloat205 = local8.aFloat133 * local12.aFloat138 + local12.aFloat132 * local8.aFloat134 + local12.aFloat135 * local8.aFloat138;
		Static342.aFloat191 = local8.aFloat136 * local12.aFloat133 + local12.aFloat136 * local8.aFloat137 + local8.aFloat132 * local12.aFloat141;
		Static600.aFloat222 = local12.aFloat133 * local8.aFloat133 + local12.aFloat141 * local8.aFloat138 + local8.aFloat134 * local12.aFloat136;
		Static321.aFloat162 = local12.aFloat138 * local8.aFloat136 + local8.aFloat132 * local12.aFloat135 + local8.aFloat137 * local12.aFloat132;
		Static646.aFloat285 = local12.aFloat136 * local8.aFloat131 + local12.aFloat141 * local8.aFloat135 + local12.aFloat133 * local8.aFloat141;
		Static267.aFloat169 = local12.aFloat134 * local8.aFloat133 + local12.aFloat131 * local8.aFloat138 + local12.aFloat137 * local8.aFloat134;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass33_Sub3_20.anInt3443;
		@Pc(255) int local255 = this.aClass33_Sub3_20.anInt3428;
		if (!this.aBoolean437) {
			this.method4214();
		}
		@Pc(274) int local274 = this.aShort60 - this.aShort61 >> 1;
		@Pc(282) int local282 = this.aShort63 - this.aShort59 >> 1;
		@Pc(290) int local290 = this.aShort57 - this.aShort54 >> 1;
		@Pc(296) int local296 = this.aShort61 + local274;
		@Pc(301) int local301 = local282 + this.aShort59;
		@Pc(306) int local306 = local290 + this.aShort54;
		@Pc(313) int local313 = local296 - (local274 << arg2);
		@Pc(319) int local319 = local301 - (local282 << arg2);
		@Pc(326) int local326 = local306 - (local290 << arg2);
		@Pc(332) int local332 = local296 + (local274 << arg2);
		@Pc(338) int local338 = local301 + (local282 << arg2);
		@Pc(345) int local345 = local306 + (local290 << arg2);
		Static227.anIntArray292[0] = local313;
		Static415.anIntArray478[0] = local319;
		Static533.anIntArray572[0] = local326;
		Static227.anIntArray292[1] = local332;
		Static415.anIntArray478[1] = local319;
		Static227.anIntArray292[2] = local313;
		Static533.anIntArray572[1] = local326;
		Static415.anIntArray478[2] = local338;
		Static227.anIntArray292[3] = local332;
		Static533.anIntArray572[2] = local326;
		Static415.anIntArray478[3] = local338;
		Static227.anIntArray292[4] = local313;
		Static533.anIntArray572[3] = local326;
		Static415.anIntArray478[4] = local319;
		Static227.anIntArray292[5] = local332;
		Static533.anIntArray572[4] = local345;
		Static415.anIntArray478[5] = local319;
		Static533.anIntArray572[5] = local345;
		Static227.anIntArray292[6] = local313;
		Static415.anIntArray478[6] = local338;
		Static533.anIntArray572[6] = local345;
		Static227.anIntArray292[7] = local332;
		Static415.anIntArray478[7] = local338;
		Static533.anIntArray572[7] = local345;
		@Pc(474) float local474;
		@Pc(488) float local488;
		@Pc(502) float local502;
		@Pc(455) float local455;
		@Pc(460) float local460;
		@Pc(450) float local450;
		for (@Pc(443) int local443 = 0; local443 < 8; local443++) {
			local450 = Static533.anIntArray572[local443];
			local455 = Static227.anIntArray292[local443];
			local460 = Static415.anIntArray478[local443];
			local474 = local33 + local450 * Static397.aFloat205 + local455 * Static445.aFloat223 + local460 * Static321.aFloat162;
			local488 = Static122.aFloat100 * local460 + Static83.aFloat196 * local455 + local450 * Static267.aFloat169 + local54;
			local502 = local450 * Static600.aFloat222 + Static646.aFloat285 * local455 + Static342.aFloat191 * local460 + local93;
			if (local502 >= (float) this.aClass33_Sub3_20.anInt3446) {
				if (arg4 > 0) {
					local502 = arg4;
				}
				@Pc(526) float local526 = local474 * (float) local251 / local502 + (float) this.aClass33_Sub3_20.anInt3448;
				if (local526 < local241) {
					local241 = local526;
				}
				@Pc(544) float local544 = local488 * (float) local255 / local502 + (float) this.aClass33_Sub3_20.anInt3433;
				if (local526 > local243) {
					local243 = local526;
				}
				local239 = true;
				if (local544 > local247) {
					local247 = local544;
				}
				if (local245 > local544) {
					local245 = local544;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && (float) arg3 < local243 && local245 < (float) arg0 && local247 > (float) arg0) {
			if (arg5) {
				return true;
			}
			if (this.anInt5009 > this.aClass33_Sub3_20.anIntArray162.length) {
				this.aClass33_Sub3_20.anIntArray162 = new int[this.anInt5009];
				this.aClass33_Sub3_20.anIntArray161 = new int[this.anInt5009];
			}
			@Pc(617) int[] local617 = this.aClass33_Sub3_20.anIntArray162;
			@Pc(621) int[] local621 = this.aClass33_Sub3_20.anIntArray161;
			@Pc(697) int local697;
			for (@Pc(623) int local623 = 0; local623 < this.anInt4999; local623++) {
				local455 = this.anIntArray282[local623];
				local460 = this.anIntArray284[local623];
				local450 = this.lb[local623];
				local502 = local93 + Static342.aFloat191 * local460 + Static646.aFloat285 * local455 + Static600.aFloat222 * local450;
				local488 = local54 + Static267.aFloat169 * local450 + local460 * Static122.aFloat100 + local455 * Static83.aFloat196;
				local474 = Static445.aFloat223 * local455 + Static321.aFloat162 * local460 + local450 * Static397.aFloat205 + local33;
				@Pc(704) int local704;
				@Pc(706) int local706;
				@Pc(715) int local715;
				if ((float) this.aClass33_Sub3_20.anInt3446 <= local502) {
					if (arg4 > 0) {
						local502 = arg4;
					}
					local697 = (int) ((float) local251 * local474 / local502 + (float) this.aClass33_Sub3_20.anInt3448);
					local704 = (int) ((float) this.aClass33_Sub3_20.anInt3433 + (float) local255 * local488 / local502);
					local706 = this.anIntArray283[local623];
					local715 = this.anIntArray283[local623 + 1];
					for (@Pc(779) int local779 = local706; local779 < local715; local779++) {
						@Pc(788) int local788 = this.aShortArray59[local779] - 1;
						if (local788 == -1) {
							break;
						}
						local617[local788] = local697;
						local621[local788] = local704;
					}
				} else {
					local697 = this.anIntArray283[local623];
					local704 = this.anIntArray283[local623 + 1];
					for (local706 = local697; local706 < local704; local706++) {
						local715 = this.aShortArray59[local706] - 1;
						if (local715 == -1) {
							break;
						}
						local617[this.aShortArray59[local706] - 1] = -999999;
					}
				}
			}
			for (local697 = 0; local697 < this.anInt5011; local697++) {
				if (local617[this.aShortArray58[local697]] != -999999 && local617[this.aShortArray62[local697]] != -999999 && local617[this.aShortArray60[local697]] != -999999 && this.method4216(local621[this.aShortArray58[local697]], arg3, local617[this.aShortArray62[local697]], local617[this.aShortArray60[local697]], local621[this.aShortArray62[local697]], arg0, local621[this.aShortArray60[local697]], local617[this.aShortArray58[local697]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()[Lclient!mi;")
	@Override
	public Class215[] method6278() {
		return this.aClass215Array2;
	}

	@OriginalMember(owner = "client!hn", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4977; local7++) {
			this.anIntArray282[local7] = this.anIntArray282[local7] + 7 >> 4;
			this.anIntArray284[local7] = this.anIntArray284[local7] + 7 >> 4;
			this.lb[local7] = this.lb[local7] + 7 >> 4;
		}
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6274(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class128_Sub2 local8 = (Class128_Sub2) arg0;
		if (this.anInt5011 == 0 || local8.anInt5011 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt4999;
		@Pc(21) int[] local21 = local8.anIntArray282;
		@Pc(24) int[] local24 = local8.anIntArray284;
		@Pc(27) int[] local27 = local8.lb;
		@Pc(30) short[] local30 = local8.aShortArray57;
		@Pc(33) short[] local33 = local8.aShortArray61;
		@Pc(36) short[] local36 = local8.aShortArray55;
		@Pc(39) byte[] local39 = local8.aByteArray49;
		@Pc(44) short[] local44;
		@Pc(50) short[] local50;
		@Pc(48) short[] local48;
		@Pc(46) byte[] local46;
		if (this.aClass342_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local48 = this.aClass342_1.aShortArray140;
			local44 = this.aClass342_1.aShortArray141;
			local46 = this.aClass342_1.aByteArray97;
			local50 = this.aClass342_1.aShortArray139;
		}
		@Pc(79) short[] local79;
		@Pc(73) short[] local73;
		@Pc(77) short[] local77;
		@Pc(75) byte[] local75;
		if (local8.aClass342_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local73 = local8.aClass342_1.aShortArray139;
			local75 = local8.aClass342_1.aByteArray97;
			local77 = local8.aClass342_1.aShortArray140;
			local79 = local8.aClass342_1.aShortArray141;
		}
		@Pc(100) int[] local100 = local8.anIntArray283;
		@Pc(103) short[] local103 = local8.aShortArray59;
		if (!local8.aBoolean437) {
			local8.method4214();
		}
		@Pc(112) short local112 = local8.aShort59;
		@Pc(115) short local115 = local8.aShort63;
		@Pc(118) short local118 = local8.aShort61;
		@Pc(121) short local121 = local8.aShort60;
		@Pc(124) short local124 = local8.aShort54;
		@Pc(127) short local127 = local8.aShort57;
		for (@Pc(129) int local129 = 0; local129 < this.anInt4999; local129++) {
			@Pc(139) int local139 = this.anIntArray284[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(162) int local162 = this.anIntArray282[local129] - arg1;
				if (local162 >= local118 && local162 <= local121) {
					@Pc(186) int local186 = this.lb[local129] - arg3;
					if (local124 <= local186 && local186 <= local127) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray283[local129];
						@Pc(212) int local212 = this.anIntArray283[local129 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.aShortArray59[local214] - 1;
							if (local200 == -1 || this.aByteArray49[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local18; local247++) {
								if (local21[local247] == local162 && local186 == local27[local247] && local24[local247] == local139) {
									local205 = local100[local247];
									local212 = local100[local247 + 1];
									@Pc(284) int local284 = -1;
									for (@Pc(286) int local286 = local205; local286 < local212; local286++) {
										local284 = local103[local286] - 1;
										if (local284 == -1 || local39[local284] != 0) {
											break;
										}
									}
									if (local284 != -1) {
										if (local44 == null) {
											this.aClass342_1 = new Class342();
											local44 = this.aClass342_1.aShortArray141 = Static537.method7639(this.aShortArray57);
											local50 = this.aClass342_1.aShortArray139 = Static537.method7639(this.aShortArray61);
											local48 = this.aClass342_1.aShortArray140 = Static537.method7639(this.aShortArray55);
											local46 = this.aClass342_1.aByteArray97 = Static322.method5435(this.aByteArray49);
										}
										if (local79 == null) {
											@Pc(365) Class342 local365 = local8.aClass342_1 = new Class342();
											local79 = local365.aShortArray141 = Static537.method7639(local30);
											local73 = local365.aShortArray139 = Static537.method7639(local33);
											local77 = local365.aShortArray140 = Static537.method7639(local36);
											local75 = local365.aByteArray97 = Static322.method5435(local39);
										}
										@Pc(398) short local398 = this.aShortArray57[local200];
										@Pc(403) short local403 = this.aShortArray61[local200];
										@Pc(408) short local408 = this.aShortArray55[local200];
										local212 = local100[local247 + 1];
										@Pc(419) byte local419 = this.aByteArray49[local200];
										local205 = local100[local247];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local205; local425 < local212; local425++) {
											local433 = local103[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local75[local433] != 0) {
												local79[local433] += local398;
												local73[local433] += local403;
												local77[local433] += local408;
												local75[local433] += local419;
											}
										}
										local212 = this.anIntArray283[local129 + 1];
										local205 = this.anIntArray283[local129];
										local419 = local39[local284];
										local403 = local33[local284];
										local398 = local30[local284];
										local408 = local36[local284];
										for (local433 = local205; local433 < local212; local433++) {
											@Pc(515) int local515 = this.aShortArray59[local433] - 1;
											if (local515 == -1) {
												break;
											}
											if (local46[local515] != 0) {
												local44[local515] += local398;
												local50[local515] += local403;
												local48[local515] += local408;
												local46[local515] += local419;
											}
										}
										if (this.aClass270_6 == null && this.aClass270_7 != null) {
											this.aClass270_7.anInterface27_6 = null;
										}
										if (this.aClass270_6 != null) {
											this.aClass270_6.anInterface27_6 = null;
										}
										if (local8.aClass270_6 == null && local8.aClass270_7 != null) {
											local8.aClass270_7.anInterface27_6 = null;
										}
										if (local8.aClass270_6 != null) {
											local8.aClass270_6.anInterface27_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static613.anInt10156 = 0;
			Static620.anInt10298 = 0;
			local13 = 0;
			Static632.anInt10405 = 0;
			for (local17 = 0; local17 < this.anInt4999; local17++) {
				Static632.anInt10405 += this.anIntArray282[local17];
				Static620.anInt10298 += this.anIntArray284[local17];
				local13++;
				Static613.anInt10156 += this.lb[local17];
			}
			if (local13 > 0) {
				Static632.anInt10405 = arg1 + Static632.anInt10405 / local13;
				Static613.anInt10156 = arg3 + Static613.anInt10156 / local13;
				Static620.anInt10298 = Static620.anInt10298 / local13 + arg2;
			} else {
				Static620.anInt10298 = arg2;
				Static613.anInt10156 = arg3;
				Static632.anInt10405 = arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt4999; local13++) {
				this.anIntArray282[local13] += arg1;
				this.anIntArray284[local13] += arg2;
				this.lb[local13] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt4999; local13++) {
					this.anIntArray282[local13] -= Static632.anInt10405;
					this.anIntArray284[local13] -= Static620.anInt10298;
					this.lb[local13] -= Static613.anInt10156;
					if (arg3 != 0) {
						local17 = Class3_Sub1_Sub2.anIntArray84[arg3];
						local161 = Class3_Sub1_Sub2.anIntArray85[arg3];
						local179 = this.anIntArray282[local13] * local161 + local17 * this.anIntArray284[local13] + 16383 >> 14;
						this.anIntArray284[local13] = this.anIntArray284[local13] * local161 + 16383 - local17 * this.anIntArray282[local13] >> 14;
						this.anIntArray282[local13] = local179;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub1_Sub2.anIntArray84[arg1];
						local161 = Class3_Sub1_Sub2.anIntArray85[arg1];
						local179 = local161 * this.anIntArray284[local13] + 16383 - this.lb[local13] * local17 >> 14;
						this.lb[local13] = this.anIntArray284[local13] * local17 + this.lb[local13] * local161 + 16383 >> 14;
						this.anIntArray284[local13] = local179;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub1_Sub2.anIntArray84[arg2];
						local161 = Class3_Sub1_Sub2.anIntArray85[arg2];
						local179 = this.lb[local13] * local17 + this.anIntArray282[local13] * local161 + 16383 >> 14;
						this.lb[local13] = local161 * this.lb[local13] + 16383 - local17 * this.anIntArray282[local13] >> 14;
						this.anIntArray282[local13] = local179;
					}
					this.anIntArray282[local13] += Static632.anInt10405;
					this.anIntArray284[local13] += Static620.anInt10298;
					this.lb[local13] += Static613.anInt10156;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt4999; local13++) {
					this.anIntArray282[local13] -= Static632.anInt10405;
					this.anIntArray284[local13] -= Static620.anInt10298;
					this.lb[local13] -= Static613.anInt10156;
					this.anIntArray282[local13] = arg1 * this.anIntArray282[local13] / 128;
					this.anIntArray284[local13] = arg2 * this.anIntArray284[local13] / 128;
					this.lb[local13] = arg3 * this.lb[local13] / 128;
					this.anIntArray282[local13] += Static632.anInt10405;
					this.anIntArray284[local13] += Static620.anInt10298;
					this.lb[local13] += Static613.anInt10156;
				}
			} else {
				@Pc(522) Class257 local522;
				@Pc(527) Class231 local527;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt5011; local13++) {
						local17 = (this.aByteArray50[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray50[local13] = (byte) local17;
					}
					if (this.aClass270_7 != null) {
						this.aClass270_7.anInterface27_6 = null;
					}
					if (this.aClass257Array1 != null) {
						for (local17 = 0; local17 < this.anInt5002; local17++) {
							local522 = this.aClass257Array1[local17];
							local527 = this.aClass231Array1[local17];
							local527.anInt7112 = 255 - (this.aByteArray50[local522.anInt7825] & 0xFF) << 24 | local527.anInt7112 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt5011; local13++) {
						local17 = this.aShortArray63[local13] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(588) int local588 = local17 & 0x7F;
						@Pc(595) int local595 = local161 + arg1 & 0x3F;
						local179 += arg2 / 4;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						local588 += arg3;
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray63[local13] = (short) (local179 << 7 | local595 << 10 | local588);
					}
					if (this.aClass270_7 != null) {
						this.aClass270_7.anInterface27_6 = null;
					}
					if (this.aClass257Array1 != null) {
						for (local17 = 0; local17 < this.anInt5002; local17++) {
							local522 = this.aClass257Array1[local17];
							local527 = this.aClass231Array1[local17];
							local527.anInt7112 = Static120.anIntArray152[this.aShortArray63[local522.anInt7825] & 0xFFFF] & 0xFFFFFF | local527.anInt7112 & 0xFF000000;
						}
					}
				} else {
					@Pc(709) Class231 local709;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt5002; local13++) {
							local709 = this.aClass231Array1[local13];
							local709.anInt7109 += arg1;
							local709.anInt7110 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt5002; local13++) {
							local709 = this.aClass231Array1[local13];
							local709.anInt7113 = arg2 * local709.anInt7113 >> 7;
							local709.anInt7104 = local709.anInt7104 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt5002; local13++) {
							local709 = this.aClass231Array1[local13];
							local709.anInt7107 = local709.anInt7107 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method6287(@OriginalArg(0) Class47 arg0) {
		@Pc(8) Class47_Sub2 local8 = (Class47_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass18Array2 != null) {
			for (local13 = 0; local13 < this.aClass18Array2.length; local13++) {
				@Pc(20) Class18 local20 = this.aClass18Array2[local13];
				@Pc(22) Class18 local22 = local20;
				if (local20.aClass18_1 != null) {
					local22 = local20.aClass18_1;
				}
				local22.anInt198 = (int) (local8.aFloat138 * (float) this.lb[local20.anInt196] + (float) this.anIntArray284[local20.anInt196] * local8.aFloat132 + local8.aFloat135 * (float) this.anIntArray282[local20.anInt196] + local8.aFloat142);
				local22.anInt199 = (int) (local8.aFloat140 + (float) this.anIntArray284[local20.anInt196] * local8.aFloat137 + local8.aFloat131 * (float) this.anIntArray282[local20.anInt196] + local8.aFloat134 * (float) this.lb[local20.anInt196]);
				local22.anInt204 = (int) (local8.aFloat133 * (float) this.lb[local20.anInt196] + (float) this.anIntArray284[local20.anInt196] * local8.aFloat136 + (float) this.anIntArray282[local20.anInt196] * local8.aFloat141 + local8.aFloat139);
				local22.anInt194 = (int) (local8.aFloat138 * (float) this.lb[local20.anInt197] + local8.aFloat135 * (float) this.anIntArray282[local20.anInt197] + local8.aFloat132 * (float) this.anIntArray284[local20.anInt197] + local8.aFloat142);
				local22.anInt201 = (int) (local8.aFloat134 * (float) this.lb[local20.anInt197] + local8.aFloat137 * (float) this.anIntArray284[local20.anInt197] + (float) this.anIntArray282[local20.anInt197] * local8.aFloat131 + local8.aFloat140);
				local22.anInt200 = (int) (local8.aFloat133 * (float) this.lb[local20.anInt197] + local8.aFloat136 * (float) this.anIntArray284[local20.anInt197] + (float) this.anIntArray282[local20.anInt197] * local8.aFloat141 + local8.aFloat139);
				local22.anInt208 = (int) (local8.aFloat142 + local8.aFloat135 * (float) this.anIntArray282[local20.anInt203] + (float) this.anIntArray284[local20.anInt203] * local8.aFloat132 + (float) this.lb[local20.anInt203] * local8.aFloat138);
				local22.anInt207 = (int) ((float) this.lb[local20.anInt203] * local8.aFloat134 + (float) this.anIntArray284[local20.anInt203] * local8.aFloat137 + (float) this.anIntArray282[local20.anInt203] * local8.aFloat131 + local8.aFloat140);
				local22.anInt206 = (int) (local8.aFloat139 + local8.aFloat133 * (float) this.lb[local20.anInt203] + local8.aFloat136 * (float) this.anIntArray284[local20.anInt203] + (float) this.anIntArray282[local20.anInt203] * local8.aFloat141);
			}
		}
		if (this.aClass215Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass215Array2.length; local13++) {
			@Pc(365) Class215 local365 = this.aClass215Array2[local13];
			@Pc(367) Class215 local367 = local365;
			if (local365.aClass215_1 != null) {
				local367 = local365.aClass215_1;
			}
			if (local365.aClass47_3 == null) {
				local365.aClass47_3 = local8.method7867();
			} else {
				local365.aClass47_3.method7877(local8);
			}
			local367.anInt6806 = (int) (local8.aFloat142 + local8.aFloat135 * (float) this.anIntArray282[local365.anInt6805] + local8.aFloat132 * (float) this.anIntArray284[local365.anInt6805] + local8.aFloat138 * (float) this.lb[local365.anInt6805]);
			local367.anInt6804 = (int) ((float) this.lb[local365.anInt6805] * local8.aFloat134 + (float) this.anIntArray282[local365.anInt6805] * local8.aFloat131 + (float) this.anIntArray284[local365.anInt6805] * local8.aFloat137 + local8.aFloat140);
			local367.anInt6810 = (int) (local8.aFloat139 + (float) this.lb[local365.anInt6805] * local8.aFloat133 + local8.aFloat141 * (float) this.anIntArray282[local365.anInt6805] + local8.aFloat136 * (float) this.anIntArray284[local365.anInt6805]);
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	private void method4213() {
		if (this.anInt4963 == 0) {
			return;
		}
		if (this.aByte54 != 0) {
			this.method4210(true);
		}
		this.method4210(false);
		if (this.aClass81_1 != null) {
			if (this.aClass81_1.anInterface12_1 == null) {
				this.method4221((this.aByte54 & 0x10) != 0);
			}
			if (this.aClass81_1.anInterface12_1 != null) {
				this.aClass33_Sub3_20.method3080(this.aClass270_6 != null);
				this.aClass33_Sub3_20.method3073(this.aClass270_6, this.aClass270_9, this.aClass270_7, this.aClass270_8);
				@Pc(76) int local76 = this.anIntArray285.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray285[local78];
					@Pc(92) int local92 = this.anIntArray285[local78 + 1];
					@Pc(99) int local99 = this.aShortArray56[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass33_Sub3_20.method3052(local99, this.aClass270_6 != null);
					this.aClass33_Sub3_20.method3075((local92 - local85) * 3, local85 * 3, this.aClass81_1.anInterface12_1);
				}
			}
		}
		this.method4220();
	}

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4999; local3++) {
			if (arg0 != 128) {
				this.anIntArray282[local3] = this.anIntArray282[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray284[local3] = arg1 * this.anIntArray284[local3] >> 7;
			}
			if (arg2 != 128) {
				this.lb[local3] = arg2 * this.lb[local3] >> 7;
			}
		}
		this.aBoolean437 = false;
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4999; local15++) {
			@Pc(33) int local33 = local9 * this.lb[local15] + this.anIntArray282[local15] * local13 >> 14;
			this.lb[local15] = local13 * this.lb[local15] - local9 * this.anIntArray282[local15] >> 14;
			this.anIntArray282[local15] = local33;
		}
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4999; local15++) {
			local33 = local13 * this.anIntArray282[local15] + this.lb[local15] * local9 >> 14;
			this.lb[local15] = local13 * this.lb[local15] - this.anIntArray282[local15] * local9 >> 14;
			this.anIntArray282[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5009; local33++) {
			@Pc(86) int local86 = this.aShortArray55[local33] * local9 + local13 * this.aShortArray57[local33] >> 14;
			this.aShortArray55[local33] = (short) (local13 * this.aShortArray55[local33] - this.aShortArray57[local33] * local9 >> 14);
			this.aShortArray57[local33] = (short) local86;
		}
		if (this.aClass270_6 == null && this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
		if (this.aClass270_6 != null) {
			this.aClass270_6.anInterface27_6 = null;
		}
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!wc;IZ)V")
	@Override
	public void method6272(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray64 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4999; local14++) {
			if ((arg1 & this.aShortArray64[local14]) != 0) {
				if (arg2) {
					arg0.method7864(this.anIntArray282[local14], this.anIntArray284[local14], this.lb[local14], local12);
				} else {
					arg0.method7868(this.anIntArray282[local14], this.anIntArray284[local14], this.lb[local14], local12);
				}
				this.anIntArray282[local14] = local12[0];
				this.anIntArray284[local14] = local12[1];
				this.lb[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!wc;Lclient!fda;II)V")
	@Override
	public void method6294(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5009 == 0) {
			return;
		}
		@Pc(13) Class47_Sub2 local13 = this.aClass33_Sub3_20.aClass47_Sub2_3;
		@Pc(16) Class47_Sub2 local16 = (Class47_Sub2) arg0;
		if (!this.aBoolean437) {
			this.method4214();
		}
		Static342.aFloat191 = local13.aFloat133 * local16.aFloat136 + local13.aFloat141 * local16.aFloat132 + local16.aFloat137 * local13.aFloat136;
		Static312.aFloat283 = local13.aFloat139 + local16.aFloat139 * local13.aFloat133 + local13.aFloat141 * local16.aFloat142 + local16.aFloat140 * local13.aFloat136;
		@Pc(69) float local69 = Static342.aFloat191 * (float) this.aShort59 + Static312.aFloat283;
		@Pc(77) float local77 = Static312.aFloat283 + Static342.aFloat191 * (float) this.aShort63;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local93 = (float) -this.aShort56 + local77;
			local87 = local69 + (float) this.aShort56;
		} else {
			local87 = (float) this.aShort56 + local77;
			local93 = local69 - (float) this.aShort56;
		}
		if (local93 >= this.aClass33_Sub3_20.aFloat106 || local87 <= (float) this.aClass33_Sub3_20.anInt3446) {
			return;
		}
		Static345.aFloat193 = local13.aFloat142 + local16.aFloat142 * local13.aFloat135 + local16.aFloat140 * local13.aFloat132 + local16.aFloat139 * local13.aFloat138;
		Static321.aFloat162 = local16.aFloat132 * local13.aFloat135 + local16.aFloat137 * local13.aFloat132 + local16.aFloat136 * local13.aFloat138;
		@Pc(170) float local170 = Static345.aFloat193 + (float) this.aShort59 * Static321.aFloat162;
		@Pc(178) float local178 = Static345.aFloat193 + Static321.aFloat162 * (float) this.aShort63;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local170 > local178) {
			local193 = (local178 - (float) this.aShort56) * (float) this.aClass33_Sub3_20.anInt3443;
			local204 = ((float) this.aShort56 + local170) * (float) this.aClass33_Sub3_20.anInt3443;
		} else {
			local193 = (float) this.aClass33_Sub3_20.anInt3443 * (local170 - (float) this.aShort56);
			local204 = ((float) this.aShort56 + local178) * (float) this.aClass33_Sub3_20.anInt3443;
		}
		if (this.aClass33_Sub3_20.aFloat121 <= local193 / (float) arg2 || local204 / (float) arg2 <= this.aClass33_Sub3_20.aFloat118) {
			return;
		}
		Static67.aFloat37 = local13.aFloat140 + local13.aFloat134 * local16.aFloat139 + local13.aFloat137 * local16.aFloat140 + local16.aFloat142 * local13.aFloat131;
		Static122.aFloat100 = local16.aFloat137 * local13.aFloat137 + local16.aFloat132 * local13.aFloat131 + local13.aFloat134 * local16.aFloat136;
		@Pc(295) float local295 = (float) this.aShort59 * Static122.aFloat100 + Static67.aFloat37;
		@Pc(303) float local303 = Static122.aFloat100 * (float) this.aShort63 + Static67.aFloat37;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local318 = (float) this.aClass33_Sub3_20.anInt3428 * (local295 + (float) this.aShort56);
			local329 = (local303 - (float) this.aShort56) * (float) this.aClass33_Sub3_20.anInt3428;
		} else {
			local318 = ((float) this.aShort56 + local303) * (float) this.aClass33_Sub3_20.anInt3428;
			local329 = (float) this.aClass33_Sub3_20.anInt3428 * (local295 - (float) this.aShort56);
		}
		if (this.aClass33_Sub3_20.aFloat111 <= local329 / (float) arg2 || this.aClass33_Sub3_20.aFloat104 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass257Array1 != null) {
			Static267.aFloat169 = local13.aFloat134 * local16.aFloat133 + local13.aFloat137 * local16.aFloat134 + local13.aFloat131 * local16.aFloat138;
			Static646.aFloat285 = local16.aFloat141 * local13.aFloat133 + local13.aFloat141 * local16.aFloat135 + local13.aFloat136 * local16.aFloat131;
			Static445.aFloat223 = local13.aFloat132 * local16.aFloat131 + local16.aFloat135 * local13.aFloat135 + local13.aFloat138 * local16.aFloat141;
			Static83.aFloat196 = local13.aFloat137 * local16.aFloat131 + local16.aFloat135 * local13.aFloat131 + local16.aFloat141 * local13.aFloat134;
			Static600.aFloat222 = local16.aFloat133 * local13.aFloat133 + local16.aFloat134 * local13.aFloat136 + local16.aFloat138 * local13.aFloat141;
			Static397.aFloat205 = local13.aFloat138 * local16.aFloat133 + local16.aFloat138 * local13.aFloat135 + local13.aFloat132 * local16.aFloat134;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.aShort60 + this.aShort61 >> 1;
			@Pc(505) int local505 = this.aShort54 + this.aShort57 >> 1;
			@Pc(524) int local524 = (int) (Static345.aFloat193 + Static445.aFloat223 * (float) local496 + Static321.aFloat162 * (float) this.aShort59 + Static397.aFloat205 * (float) local505);
			@Pc(543) int local543 = (int) (Static122.aFloat100 * (float) this.aShort59 + Static67.aFloat37 + Static83.aFloat196 * (float) local496 + (float) local505 * Static267.aFloat169);
			@Pc(562) int local562 = (int) (Static600.aFloat222 * (float) local505 + Static342.aFloat191 * (float) this.aShort59 + Static312.aFloat283 + Static646.aFloat285 * (float) local496);
			@Pc(581) int local581 = (int) (Static445.aFloat223 * (float) local496 + Static345.aFloat193 + Static321.aFloat162 * (float) this.aShort63 + (float) local505 * Static397.aFloat205);
			@Pc(600) int local600 = (int) (Static267.aFloat169 * (float) local505 + Static67.aFloat37 + Static83.aFloat196 * (float) local496 + Static122.aFloat100 * (float) this.aShort63);
			arg1.anInt3617 = this.aClass33_Sub3_20.anInt3448 + this.aClass33_Sub3_20.anInt3443 * local524 / arg2;
			arg1.anInt3615 = this.aClass33_Sub3_20.anInt3443 * local581 / arg2 + this.aClass33_Sub3_20.anInt3448;
			arg1.anInt3614 = local600 * this.aClass33_Sub3_20.anInt3428 / arg2 + this.aClass33_Sub3_20.anInt3433;
			arg1.anInt3613 = this.aClass33_Sub3_20.anInt3428 * local543 / arg2 + this.aClass33_Sub3_20.anInt3433;
			@Pc(671) int local671 = (int) (Static646.aFloat285 * (float) local496 + Static312.aFloat283 + Static342.aFloat191 * (float) this.aShort63 + (float) local505 * Static600.aFloat222);
			if (local562 >= this.aClass33_Sub3_20.anInt3446 || local671 >= this.aClass33_Sub3_20.anInt3446) {
				arg1.anInt3616 = this.aClass33_Sub3_20.anInt3448 + this.aClass33_Sub3_20.anInt3443 * (local524 + this.aShort56) / arg2 - arg1.anInt3617;
				arg1.aBoolean303 = true;
			}
		}
		this.aClass33_Sub3_20.method3039((float) arg2);
		this.aClass33_Sub3_20.method3056();
		this.aClass33_Sub3_20.method3063(local16);
		this.method4213();
		this.aClass33_Sub3_20.method3049();
		this.method4219();
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	private void method4214() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4999; local23++) {
			@Pc(30) int local30 = this.anIntArray282[local23];
			@Pc(35) int local35 = this.anIntArray284[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(50) int local50 = this.lb[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local50 > local17) {
				local17 = local50;
			}
			if (local11 > local50) {
				local11 = local50;
			}
			@Pc(82) int local82 = local50 * local50 + local30 * local30;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local30 * local30 + local50 * local50 + local35 * local35;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort61 = (short) local7;
		this.aShort57 = (short) local17;
		this.aShort54 = (short) local11;
		this.aShort59 = (short) local9;
		this.aShort60 = (short) local13;
		this.aShort63 = (short) local15;
		this.aShort56 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort55 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean437 = true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5011; local3++) {
			local12 = this.aShortArray63[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray63[local3] = (short) (local28 | local18 << 10 | local24 << 7);
		}
		if (this.aClass257Array1 != null) {
			for (local12 = 0; local12 < this.anInt5002; local12++) {
				@Pc(107) Class257 local107 = this.aClass257Array1[local12];
				@Pc(112) Class231 local112 = this.aClass231Array1[local12];
				local112.anInt7112 = local112.anInt7112 & 0xFF000000 | Static120.anIntArray152[this.aShortArray63[local107.anInt7825] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean435;
	}

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean437) {
			this.method4214();
		}
		@Pc(16) int local16 = this.aShort61 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort60;
		@Pc(26) int local26 = arg6 + this.aShort54;
		@Pc(31) int local31 = this.aShort57 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9722 >> arg2.anInt9727 >= arg2.anInt9726 || local26 < 0 || arg2.anInt9723 <= arg2.anInt9722 + local31 >> arg2.anInt9727)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9726 <= local21 + arg3.anInt9722 >> arg3.anInt9727 || local26 < 0 || arg3.anInt9723 <= arg3.anInt9722 + local31 >> arg3.anInt9727) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9727;
			local21 = local21 + arg2.anInt9722 - 1 >> arg2.anInt9727;
			local26 >>= arg2.anInt9727;
			local31 = local31 + arg2.anInt9722 - 1 >> arg2.anInt9727;
			if (arg5 == arg2.method8041(local16, local26) && arg5 == arg2.method8041(local21, local26) && arg5 == arg2.method8041(local16, local31) && arg2.method8041(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt4999; local191++) {
				this.anIntArray284[local191] = this.anIntArray284[local191] + arg2.method8043(arg6 + this.lb[local191], arg4 + this.anIntArray282[local191]) - arg5;
			}
		} else {
			@Pc(240) int local240;
			@Pc(251) int local251;
			if (arg0 == 2) {
				@Pc(235) short local235 = this.aShort59;
				if (local235 == 0) {
					return;
				}
				for (local240 = 0; local240 < this.anInt4999; local240++) {
					local251 = (this.anIntArray284[local240] << 16) / local235;
					if (local251 < arg1) {
						this.anIntArray284[local240] -= -((arg1 - local251) * (-arg5 + arg2.method8043(this.lb[local240] - -arg6, arg4 + this.anIntArray282[local240])) / arg1);
					}
				}
			} else {
				@Pc(329) int local329;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local240 = (arg1 >> 8 & 0xFF) * 4;
					local251 = (arg1 >> 16 & 0xFF) << 6;
					local329 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || arg2.anInt9726 << arg2.anInt9727 <= arg2.anInt9722 + (local191 >> 1) + arg4 || arg6 - (local240 >> 1) < 0 || arg2.anInt9723 << arg2.anInt9727 <= arg2.anInt9722 + arg6 + (local240 >> 1)) {
						return;
					}
					this.method6276(arg2, arg4, arg5, local329, local251, arg6, local191, local240);
				} else if (arg0 == 4) {
					local191 = this.aShort63 - this.aShort59;
					for (local240 = 0; local240 < this.anInt4999; local240++) {
						this.anIntArray284[local240] -= arg5 - arg3.method8043(this.lb[local240] + arg6, arg4 + this.anIntArray282[local240]) - local191;
					}
				} else if (arg0 == 5) {
					local191 = this.aShort63 - this.aShort59;
					for (local240 = 0; local240 < this.anInt4999; local240++) {
						local251 = this.anIntArray282[local240] + arg4;
						local329 = arg6 + this.lb[local240];
						@Pc(429) int local429 = arg2.method8043(local329, local251);
						@Pc(435) int local435 = arg3.method8043(local329, local251);
						@Pc(443) int local443 = local429 - local435 - arg1;
						this.anIntArray284[local240] = local429 + ((this.anIntArray284[local240] << 8) / local191 * local443 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static613.anInt10156 = 0;
			Static620.anInt10298 = 0;
			local28 = 0;
			Static632.anInt10405 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray46.length) {
					local52 = this.anIntArrayArray46[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static632.anInt10405 += this.anIntArray282[local60];
						Static620.anInt10298 += this.anIntArray284[local60];
						Static613.anInt10156 += this.lb[local60];
						local28++;
					}
				}
			}
			if (local28 > 0) {
				Static632.anInt10405 = Static632.anInt10405 / local28 + local14;
				Static620.anInt10298 = local22 + Static620.anInt10298 / local28;
				Static613.anInt10156 = Static613.anInt10156 / local28 + local18;
			} else {
				Static632.anInt10405 = local14;
				Static620.anInt10298 = local22;
				Static613.anInt10156 = local18;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local22 = arg3 << 4;
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray46.length) {
					local162 = this.anIntArrayArray46[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray282[local54] += local14;
						this.anIntArray284[local54] += local22;
						this.lb[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(302) int local302;
		@Pc(763) int local763;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray46.length > local32) {
					local162 = this.anIntArrayArray46[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray282[local54] -= Static632.anInt10405;
							this.anIntArray284[local54] -= Static620.anInt10298;
							this.lb[local54] -= Static613.anInt10156;
							if (arg4 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg4];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg4];
								local302 = this.anIntArray284[local54] * local60 + local283 * this.anIntArray282[local54] + 16383 >> 14;
								this.anIntArray284[local54] = local283 * this.anIntArray284[local54] + 16383 - this.anIntArray282[local54] * local60 >> 14;
								this.anIntArray282[local54] = local302;
							}
							if (arg2 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg2];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg2];
								local302 = this.anIntArray284[local54] * local283 + 16383 - local60 * this.lb[local54] >> 14;
								this.lb[local54] = this.lb[local54] * local283 + this.anIntArray284[local54] * local60 + 16383 >> 14;
								this.anIntArray284[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg3];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg3];
								local302 = this.lb[local54] * local60 + local283 * this.anIntArray282[local54] + 16383 >> 14;
								this.lb[local54] = local283 * this.lb[local54] + 16383 - local60 * this.anIntArray282[local54] >> 14;
								this.anIntArray282[local54] = local302;
							}
							this.anIntArray282[local54] += Static632.anInt10405;
							this.anIntArray284[local54] += Static620.anInt10298;
							this.lb[local54] += Static613.anInt10156;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray282[local54] -= Static632.anInt10405;
							this.anIntArray284[local54] -= Static620.anInt10298;
							this.lb[local54] -= Static613.anInt10156;
							if (arg2 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg2];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg2];
								local302 = this.anIntArray284[local54] * local283 + 16383 - this.lb[local54] * local60 >> 14;
								this.lb[local54] = local283 * this.lb[local54] + local60 * this.anIntArray284[local54] + 16383 >> 14;
								this.anIntArray284[local54] = local302;
							}
							if (arg4 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg4];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg4];
								local302 = local60 * this.anIntArray284[local54] + local283 * this.anIntArray282[local54] + 16383 >> 14;
								this.anIntArray284[local54] = local283 * this.anIntArray284[local54] + 16383 - this.anIntArray282[local54] * local60 >> 14;
								this.anIntArray282[local54] = local302;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub1_Sub2.anIntArray84[arg3];
								local283 = Class3_Sub1_Sub2.anIntArray85[arg3];
								local302 = this.lb[local54] * local60 + local283 * this.anIntArray282[local54] + 16383 >> 14;
								this.lb[local54] = this.lb[local54] * local283 + 16383 - this.anIntArray282[local54] * local60 >> 14;
								this.anIntArray282[local54] = local302;
							}
							this.anIntArray282[local54] += Static632.anInt10405;
							this.anIntArray284[local54] += Static620.anInt10298;
							this.lb[local54] += Static613.anInt10156;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray46.length) {
						local52 = this.anIntArrayArray46[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local283 = this.anIntArray283[local60];
							local302 = this.anIntArray283[local60 + 1];
							for (local763 = local283; local763 < local302; local763++) {
								@Pc(772) int local772 = this.aShortArray59[local763] - 1;
								if (local772 == -1) {
									break;
								}
								@Pc(782) int local782;
								@Pc(786) int local786;
								@Pc(804) int local804;
								if (arg4 != 0) {
									local782 = Class3_Sub1_Sub2.anIntArray84[arg4];
									local786 = Class3_Sub1_Sub2.anIntArray85[arg4];
									local804 = local782 * this.aShortArray61[local772] + local786 * this.aShortArray57[local772] + 16383 >> 14;
									this.aShortArray61[local772] = (short) (this.aShortArray61[local772] * local786 + 16383 - local782 * this.aShortArray57[local772] >> 14);
									this.aShortArray57[local772] = (short) local804;
								}
								if (arg2 != 0) {
									local782 = Class3_Sub1_Sub2.anIntArray84[arg2];
									local786 = Class3_Sub1_Sub2.anIntArray85[arg2];
									local804 = this.aShortArray61[local772] * local786 + 16383 - local782 * this.aShortArray55[local772] >> 14;
									this.aShortArray55[local772] = (short) (local782 * this.aShortArray61[local772] + local786 * this.aShortArray55[local772] + 16383 >> 14);
									this.aShortArray61[local772] = (short) local804;
								}
								if (arg3 != 0) {
									local782 = Class3_Sub1_Sub2.anIntArray84[arg3];
									local786 = Class3_Sub1_Sub2.anIntArray85[arg3];
									local804 = local786 * this.aShortArray57[local772] + local782 * this.aShortArray55[local772] + 16383 >> 14;
									this.aShortArray55[local772] = (short) (this.aShortArray55[local772] * local786 + 16383 - local782 * this.aShortArray57[local772] >> 14);
									this.aShortArray57[local772] = (short) local804;
								}
							}
						}
					}
				}
				if (this.aClass270_6 == null && this.aClass270_7 != null) {
					this.aClass270_7.anInterface27_6 = null;
				}
				if (this.aClass270_6 != null) {
					this.aClass270_6.anInterface27_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray46.length > local32) {
					local162 = this.anIntArrayArray46[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray282[local54] -= Static632.anInt10405;
						this.anIntArray284[local54] -= Static620.anInt10298;
						this.lb[local54] -= Static613.anInt10156;
						this.anIntArray282[local54] = this.anIntArray282[local54] * arg2 >> 7;
						this.anIntArray284[local54] = arg3 * this.anIntArray284[local54] >> 7;
						this.lb[local54] = arg4 * this.lb[local54] >> 7;
						this.anIntArray282[local54] += Static632.anInt10405;
						this.anIntArray284[local54] += Static620.anInt10298;
						this.lb[local54] += Static613.anInt10156;
					}
				}
			}
		} else {
			@Pc(1230) Class257 local1230;
			@Pc(1235) Class231 local1235;
			if (arg0 == 5) {
				if (this.anIntArrayArray45 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray45.length > local32) {
							local162 = this.anIntArrayArray45[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local54 = local162[local164];
								local60 = (this.aByteArray50[local54] & 0xFF) + (arg2 * 8);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray50[local54] = (byte) local60;
							}
							if (local162.length > 0 && this.aClass270_7 != null) {
								this.aClass270_7.anInterface27_6 = null;
							}
						}
					}
					if (this.aClass257Array1 != null) {
						for (local32 = 0; local32 < this.anInt5002; local32++) {
							local1230 = this.aClass257Array1[local32];
							local1235 = this.aClass231Array1[local32];
							local1235.anInt7112 = local1235.anInt7112 & 0xFFFFFF | 255 - (this.aByteArray50[local1230.anInt7825] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1484) Class231 local1484;
				if (arg0 == 8) {
					if (this.anIntArrayArray47 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray47.length > local32) {
								local162 = this.anIntArrayArray47[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1484 = this.aClass231Array1[local162[local164]];
									local1484.anInt7109 += arg2;
									local1484.anInt7110 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray47 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray47.length > local32) {
								local162 = this.anIntArrayArray47[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1484 = this.aClass231Array1[local162[local164]];
									local1484.anInt7113 = arg3 * local1484.anInt7113 >> 7;
									local1484.anInt7104 = arg2 * local1484.anInt7104 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray47 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray47.length > local32) {
							local162 = this.anIntArrayArray47[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1484 = this.aClass231Array1[local162[local164]];
								local1484.anInt7107 = arg2 + local1484.anInt7107 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray45 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray45.length > local32) {
						local162 = this.anIntArrayArray45[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							local60 = this.aShortArray63[local54] & 0xFFFF;
							local283 = local60 >> 10 & 0x3F;
							local302 = local60 >> 7 & 0x7;
							local302 += arg3 / 4;
							@Pc(1329) int local1329 = local283 + arg2 & 0x3F;
							local763 = local60 & 0x7F;
							if (local302 < 0) {
								local302 = 0;
							} else if (local302 > 7) {
								local302 = 7;
							}
							local763 += arg4;
							if (local763 < 0) {
								local763 = 0;
							} else if (local763 > 127) {
								local763 = 127;
							}
							this.aShortArray63[local54] = (short) (local763 | local302 << 7 | local1329 << 10);
						}
						if (local162.length > 0 && this.aClass270_7 != null) {
							this.aClass270_7.anInterface27_6 = null;
						}
					}
				}
				if (this.aClass257Array1 != null) {
					for (local32 = 0; local32 < this.anInt5002; local32++) {
						local1230 = this.aClass257Array1[local32];
						local1235 = this.aClass231Array1[local32];
						local1235.anInt7112 = local1235.anInt7112 & 0xFF000000 | Static120.anIntArray152[this.aShortArray63[local1230.anInt7825] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub1_Sub6 ba(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		if (this.anInt5009 == 0) {
			return null;
		}
		if (!this.aBoolean437) {
			this.method4214();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass33_Sub3_20.anInt3440 > 0) {
			local40 = this.aShort61 - (this.aShort63 * this.aClass33_Sub3_20.anInt3440 >> 8) >> this.aClass33_Sub3_20.anInt3416;
			local57 = this.aShort60 - (this.aShort59 * this.aClass33_Sub3_20.anInt3440 >> 8) >> this.aClass33_Sub3_20.anInt3416;
		} else {
			local40 = this.aShort61 - (this.aShort59 * this.aClass33_Sub3_20.anInt3440 >> 8) >> this.aClass33_Sub3_20.anInt3416;
			local57 = this.aShort60 - (this.aShort63 * this.aClass33_Sub3_20.anInt3440 >> 8) >> this.aClass33_Sub3_20.anInt3416;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass33_Sub3_20.anInt3435 > 0) {
			local114 = this.aShort54 - (this.aClass33_Sub3_20.anInt3435 * this.aShort63 >> 8) >> this.aClass33_Sub3_20.anInt3416;
			local131 = this.aShort57 - (this.aClass33_Sub3_20.anInt3435 * this.aShort59 >> 8) >> this.aClass33_Sub3_20.anInt3416;
		} else {
			local114 = this.aShort54 - (this.aClass33_Sub3_20.anInt3435 * this.aShort59 >> 8) >> this.aClass33_Sub3_20.anInt3416;
			local131 = this.aShort57 - (this.aShort63 * this.aClass33_Sub3_20.anInt3435 >> 8) >> this.aClass33_Sub3_20.anInt3416;
		}
		@Pc(172) int local172 = local57 + 1 - local40;
		@Pc(178) int local178 = local131 + 1 - local114;
		@Pc(181) Class3_Sub1_Sub6_Sub2 local181 = (Class3_Sub1_Sub6_Sub2) arg0;
		@Pc(197) Class3_Sub1_Sub6_Sub2 local197;
		if (local181 != null && local181.method5191(local172, local178)) {
			local197 = local181;
			local181.method5195();
		} else {
			local197 = new Class3_Sub1_Sub6_Sub2(this.aClass33_Sub3_20, local172, local178);
		}
		local197.method5192(local131, local114, local40, local57);
		this.method4215(local197);
		return local197;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!kw;)V")
	private void method4215(@OriginalArg(1) Class3_Sub1_Sub6_Sub2 arg0) {
		if (this.aClass33_Sub3_20.anIntArray162.length < this.anInt5009) {
			this.aClass33_Sub3_20.anIntArray162 = new int[this.anInt5009];
			this.aClass33_Sub3_20.anIntArray161 = new int[this.anInt5009];
		}
		@Pc(32) int[] local32 = this.aClass33_Sub3_20.anIntArray162;
		@Pc(36) int[] local36 = this.aClass33_Sub3_20.anIntArray161;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt4999; local38++) {
			local65 = (this.anIntArray282[local38] - (this.anIntArray284[local38] * this.aClass33_Sub3_20.anInt3440 >> 8) >> this.aClass33_Sub3_20.anInt3416) - arg0.anInt6107;
			@Pc(89) int local89 = (this.lb[local38] - (this.anIntArray284[local38] * this.aClass33_Sub3_20.anInt3435 >> 8) >> this.aClass33_Sub3_20.anInt3416) - arg0.anInt6108;
			@Pc(94) int local94 = this.anIntArray283[local38];
			@Pc(101) int local101 = this.anIntArray283[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray59[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local65;
				local36[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt4963; local65++) {
			if (this.aByteArray50 == null || this.aByteArray50[local65] <= 128) {
				@Pc(150) short local150 = this.aShortArray58[local65];
				@Pc(155) short local155 = this.aShortArray62[local65];
				@Pc(160) short local160 = this.aShortArray60[local65];
				local103 = local32[local150];
				local112 = local32[local155];
				@Pc(172) int local172 = local32[local160];
				@Pc(176) int local176 = local36[local150];
				@Pc(180) int local180 = local36[local155];
				@Pc(184) int local184 = local36[local160];
				if ((local103 - local112) * (-local184 + local180) - (local180 - local176) * (-local112 + local172) > 0) {
					arg0.method5194(local180, local176, local112, local103, local172, local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()V")
	@Override
	protected void method6288() {
	}

	@OriginalMember(owner = "client!hn", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5001;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIIIII)Z")
	private boolean method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg5 && arg4 > arg5 && arg6 > arg5) {
			return false;
		} else if (arg0 < arg5 && arg4 < arg5 && arg5 > arg6) {
			return false;
		} else if (arg1 < arg7 && arg2 > arg1 && arg3 > arg1) {
			return false;
		} else {
			return arg1 <= arg7 || arg1 <= arg2 || arg3 >= arg1;
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "()V")
	@Override
	public void method6295() {
		if (this.anInt5009 <= 0 || this.anInt4963 <= 0) {
			return;
		}
		this.method4210(false);
		if ((this.aByte54 & 0x10) == 0 && this.aClass81_1.anInterface12_1 == null) {
			this.method4221(false);
		}
		this.method4220();
	}

	@OriginalMember(owner = "client!hn", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort62;
	}

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static632.anInt10405 = 0;
			Static620.anInt10298 = 0;
			local31 = 0;
			Static613.anInt10156 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray46.length) {
					local55 = this.anIntArrayArray46[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray64 == null || (this.aShortArray64[local63] & arg6) != 0) {
							Static632.anInt10405 += this.anIntArray282[local63];
							Static620.anInt10298 += this.anIntArray284[local63];
							local31++;
							Static613.anInt10156 += this.lb[local63];
						}
					}
				}
			}
			if (local31 <= 0) {
				Static613.anInt10156 = arg4;
				Static620.anInt10298 = arg3;
				Static632.anInt10405 = arg2;
			} else {
				Static632.anInt10405 = arg2 + Static632.anInt10405 / local31;
				Static613.anInt10156 = arg4 + Static613.anInt10156 / local31;
				Static332.aBoolean562 = true;
				Static620.anInt10298 = arg3 + Static620.anInt10298 / local31;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg3 * arg7[1] + arg2 * arg7[0] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg7[6] * arg2 + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local31;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray46.length > local35) {
					local253 = this.anIntArrayArray46[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray64 == null || (this.aShortArray64[local57] & arg6) != 0) {
							this.anIntArray282[local57] += arg2;
							this.anIntArray284[local57] += arg3;
							this.lb[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(374) int local374;
		@Pc(396) int local396;
		@Pc(418) int local418;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(481) int local481;
		@Pc(636) int local636;
		@Pc(661) int local661;
		@Pc(665) int local665;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(682) int local682;
		@Pc(686) int local686;
		@Pc(688) int local688;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(834) int local834;
		@Pc(963) int local963;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray46.length) {
						local253 = this.anIntArrayArray46[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local57]) != 0) {
								this.anIntArray282[local57] -= Static632.anInt10405;
								this.anIntArray284[local57] -= Static620.anInt10298;
								this.lb[local57] -= Static613.anInt10156;
								if (arg4 != 0) {
									local63 = Class3_Sub1_Sub2.anIntArray84[arg4];
									local374 = Class3_Sub1_Sub2.anIntArray85[arg4];
									local396 = this.anIntArray282[local57] * local374 + this.anIntArray284[local57] * local63 + 16383 >> 14;
									this.anIntArray284[local57] = this.anIntArray284[local57] * local374 + 16383 - this.anIntArray282[local57] * local63 >> 14;
									this.anIntArray282[local57] = local396;
								}
								if (arg2 != 0) {
									local63 = Class3_Sub1_Sub2.anIntArray84[arg2];
									local374 = Class3_Sub1_Sub2.anIntArray85[arg2];
									local396 = local374 * this.anIntArray284[local57] + 16383 - this.lb[local57] * local63 >> 14;
									this.lb[local57] = local374 * this.lb[local57] + local63 * this.anIntArray284[local57] + 16383 >> 14;
									this.anIntArray284[local57] = local396;
								}
								if (arg3 != 0) {
									local63 = Class3_Sub1_Sub2.anIntArray84[arg3];
									local374 = Class3_Sub1_Sub2.anIntArray85[arg3];
									local396 = this.lb[local57] * local63 + this.anIntArray282[local57] * local374 + 16383 >> 14;
									this.lb[local57] = local374 * this.lb[local57] + 16383 - this.anIntArray282[local57] * local63 >> 14;
									this.anIntArray282[local57] = local396;
								}
								this.anIntArray282[local57] += Static632.anInt10405;
								this.anIntArray284[local57] += Static620.anInt10298;
								this.lb[local57] += Static613.anInt10156;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray46.length) {
							local55 = this.anIntArrayArray46[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray64 == null || (this.aShortArray64[local63] & arg6) != 0) {
									local374 = this.anIntArray283[local63];
									local396 = this.anIntArray283[local63 + 1];
									for (local418 = local374; local418 < local396; local418++) {
										local453 = this.aShortArray59[local418] - 1;
										if (local453 == -1) {
											break;
										}
										if (arg4 != 0) {
											local457 = Class3_Sub1_Sub2.anIntArray84[arg4];
											local461 = Class3_Sub1_Sub2.anIntArray85[arg4];
											local465 = this.aShortArray61[local453] * local457 + this.aShortArray57[local453] * local461 + 16383 >> 14;
											this.aShortArray61[local453] = (short) (local461 * this.aShortArray61[local453] + 16383 - this.aShortArray57[local453] * local457 >> 14);
											this.aShortArray57[local453] = (short) local465;
										}
										if (arg2 != 0) {
											local457 = Class3_Sub1_Sub2.anIntArray84[arg2];
											local461 = Class3_Sub1_Sub2.anIntArray85[arg2];
											local465 = this.aShortArray61[local453] * local461 + 16383 - this.aShortArray55[local453] * local457 >> 14;
											this.aShortArray55[local453] = (short) (local461 * this.aShortArray55[local453] + local457 * this.aShortArray61[local453] + 16383 >> 14);
											this.aShortArray61[local453] = (short) local465;
										}
										if (arg3 != 0) {
											local457 = Class3_Sub1_Sub2.anIntArray84[arg3];
											local461 = Class3_Sub1_Sub2.anIntArray85[arg3];
											local465 = this.aShortArray55[local453] * local457 + local461 * this.aShortArray57[local453] + 16383 >> 14;
											this.aShortArray55[local453] = (short) (this.aShortArray55[local453] * local461 + 16383 - this.aShortArray57[local453] * local457 >> 14);
											this.aShortArray57[local453] = (short) local465;
										}
									}
								}
							}
						}
					}
					if (this.aClass270_6 == null && this.aClass270_7 != null) {
						this.aClass270_7.anInterface27_6 = null;
					}
					if (this.aClass270_6 != null) {
						this.aClass270_6.anInterface27_6 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static332.aBoolean562) {
					local374 = arg7[3] * Static620.anInt10298 + Static632.anInt10405 * arg7[0] + Static613.anInt10156 * arg7[6] + 8192 >> 14;
					local396 = arg7[1] * Static632.anInt10405 + Static620.anInt10298 * arg7[4] + Static613.anInt10156 * arg7[7] + 8192 >> 14;
					local418 = Static613.anInt10156 * arg7[8] + arg7[2] * Static632.anInt10405 + arg7[5] * Static620.anInt10298 + 8192 >> 14;
					local374 += local255;
					local396 += local57;
					local418 += local63;
					Static620.anInt10298 = local396;
					Static632.anInt10405 = local374;
					Static613.anInt10156 = local418;
					Static332.aBoolean562 = false;
				}
				@Pc(441) int[] local441 = new int[9];
				local396 = Class3_Sub1_Sub2.anIntArray85[arg2];
				local418 = Class3_Sub1_Sub2.anIntArray84[arg2];
				local453 = Class3_Sub1_Sub2.anIntArray85[arg3];
				local457 = Class3_Sub1_Sub2.anIntArray84[arg3];
				local461 = Class3_Sub1_Sub2.anIntArray85[arg4];
				local465 = Class3_Sub1_Sub2.anIntArray84[arg4];
				local473 = local461 * local418 + 8192 >> 14;
				local481 = local465 * local418 + 8192 >> 14;
				local441[3] = local396 * local465 + 8192 >> 14;
				local441[1] = local465 * -local453 + local457 * local473 + 8192 >> 14;
				local441[8] = local396 * local453 + 8192 >> 14;
				local441[4] = local461 * local396 + 8192 >> 14;
				local441[0] = local461 * local453 + local457 * local481 + 8192 >> 14;
				local441[2] = local396 * local457 + 8192 >> 14;
				local441[7] = local457 * local465 + local453 * local473 + 8192 >> 14;
				local441[6] = -local457 * local461 + local453 * local481 + 8192 >> 14;
				local441[5] = -local418;
				@Pc(611) int local611 = -Static632.anInt10405 * local441[0] + -Static620.anInt10298 * local441[1] + -Static613.anInt10156 * local441[2] + 8192 >> 14;
				local636 = local441[5] * -Static613.anInt10156 + -Static620.anInt10298 * local441[4] + -Static632.anInt10405 * local441[3] + 8192 >> 14;
				local661 = local441[8] * -Static613.anInt10156 + -Static632.anInt10405 * local441[6] + local441[7] * -Static620.anInt10298 + 8192 >> 14;
				local665 = local611 + Static632.anInt10405;
				@Pc(669) int local669 = Static620.anInt10298 + local636;
				local673 = Static613.anInt10156 + local661;
				@Pc(676) int[] local676 = new int[9];
				for (local678 = 0; local678 < 3; local678++) {
					for (local682 = 0; local682 < 3; local682++) {
						local686 = 0;
						for (local688 = 0; local688 < 3; local688++) {
							local686 += arg7[local682 * 3 + local688] * local441[local688 + local678 * 3];
						}
						local676[local682 + local678 * 3] = local686 + 8192 >> 14;
					}
				}
				local682 = local63 * local441[2] + local255 * local441[0] + local441[1] * local57 + 8192 >> 14;
				local686 = local63 * local441[5] + local255 * local441[3] + local441[4] * local57 + 8192 >> 14;
				local688 = local441[8] * local63 + local441[6] * local255 + local57 * local441[7] + 8192 >> 14;
				local686 += local669;
				local682 += local665;
				local688 += local673;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local828 = 0; local828 < 3; local828++) {
						local832 = 0;
						for (local834 = 0; local834 < 3; local834++) {
							local832 += local676[local828 + local834 * 3] * arg7[local824 * 3 + local834];
						}
						local822[local824 * 3 + local828] = local832 + 8192 >> 14;
					}
				}
				local828 = local688 * arg7[2] + arg7[0] * local682 + local686 * arg7[1] + 8192 >> 14;
				local832 = arg7[4] * local686 + local682 * arg7[3] + arg7[5] * local688 + 8192 >> 14;
				local828 += local31;
				local832 += local35;
				local834 = arg7[8] * local688 + local682 * arg7[6] + arg7[7] * local686 + 8192 >> 14;
				local834 += local41;
				for (local963 = 0; local963 < local8; local963++) {
					@Pc(969) int local969 = arg1[local963];
					if (this.anIntArrayArray46.length > local969) {
						@Pc(983) int[] local983 = this.anIntArrayArray46[local969];
						for (@Pc(985) int local985 = 0; local985 < local983.length; local985++) {
							@Pc(991) int local991 = local983[local985];
							if (this.aShortArray64 == null || (this.aShortArray64[local991] & arg6) != 0) {
								@Pc(1035) int local1035 = this.lb[local991] * local822[2] + local822[0] * this.anIntArray282[local991] + this.anIntArray284[local991] * local822[1] + 8192 >> 14;
								@Pc(1066) int local1066 = this.lb[local991] * local822[5] + local822[4] * this.anIntArray284[local991] + this.anIntArray282[local991] * local822[3] + 8192 >> 14;
								@Pc(1070) int local1070 = local1035 + local828;
								@Pc(1101) int local1101 = this.lb[local991] * local822[8] + this.anIntArray284[local991] * local822[7] + local822[6] * this.anIntArray282[local991] + 8192 >> 14;
								@Pc(1105) int local1105 = local1066 + local832;
								@Pc(1109) int local1109 = local1101 + local834;
								this.anIntArray282[local991] = local1070;
								this.anIntArray284[local991] = local1105;
								this.lb[local991] = local1109;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2600) Class257 local2600;
			@Pc(2605) Class231 local2605;
			if (arg0 == 5) {
				if (this.anIntArrayArray45 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray45.length) {
							local253 = this.anIntArrayArray45[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local57 = local253[local255];
								if (this.aShortArray65 == null || (this.aShortArray65[local57] & arg6) != 0) {
									local63 = arg2 * 8 + (this.aByteArray50[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray50[local57] = (byte) local63;
									if (this.aClass270_7 != null) {
										this.aClass270_7.anInterface27_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass257Array1 != null) {
						for (local35 = 0; local35 < this.anInt5002; local35++) {
							local2600 = this.aClass257Array1[local35];
							local2605 = this.aClass231Array1[local35];
							local2605.anInt7112 = 255 - (this.aByteArray50[local2600.anInt7825] & 0xFF) << 24 | local2605.anInt7112 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2860) Class231 local2860;
				if (arg0 == 8) {
					if (this.anIntArrayArray47 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray47.length > local35) {
								local253 = this.anIntArrayArray47[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2860 = this.aClass231Array1[local253[local255]];
									local2860.anInt7109 += arg2;
									local2860.anInt7110 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray47 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray47.length > local35) {
								local253 = this.anIntArrayArray47[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2860 = this.aClass231Array1[local253[local255]];
									local2860.anInt7104 = local2860.anInt7104 * arg2 >> 7;
									local2860.anInt7113 = local2860.anInt7113 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray47 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray47.length) {
							local253 = this.anIntArrayArray47[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2860 = this.aClass231Array1[local253[local255]];
								local2860.anInt7107 = arg2 + local2860.anInt7107 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray45 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray45.length) {
						local253 = this.anIntArrayArray45[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local57 = local253[local255];
							if (this.aShortArray65 == null || (arg6 & this.aShortArray65[local57]) != 0) {
								local63 = this.aShortArray63[local57] & 0xFFFF;
								local374 = local63 >> 10 & 0x3F;
								local396 = local63 >> 7 & 0x7;
								@Pc(2705) int local2705 = arg2 + local374 & 0x3F;
								local418 = local63 & 0x7F;
								local396 += arg3 / 4;
								if (local396 < 0) {
									local396 = 0;
								} else if (local396 > 7) {
									local396 = 7;
								}
								local418 += arg4;
								if (local418 < 0) {
									local418 = 0;
								} else if (local418 > 127) {
									local418 = 127;
								}
								this.aShortArray63[local57] = (short) (local418 | local396 << 7 | local2705 << 10);
								if (this.aClass270_7 != null) {
									this.aClass270_7.anInterface27_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass257Array1 != null) {
					for (local35 = 0; local35 < this.anInt5002; local35++) {
						local2600 = this.aClass257Array1[local35];
						local2605 = this.aClass231Array1[local35];
						local2605.anInt7112 = local2605.anInt7112 & 0xFF000000 | Static120.anIntArray152[this.aShortArray63[local2600.anInt7825] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray46.length) {
					local253 = this.anIntArrayArray46[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local57 = local253[local255];
						if (this.aShortArray64 == null || (this.aShortArray64[local57] & arg6) != 0) {
							this.anIntArray282[local57] -= Static632.anInt10405;
							this.anIntArray284[local57] -= Static620.anInt10298;
							this.lb[local57] -= Static613.anInt10156;
							this.anIntArray282[local57] = this.anIntArray282[local57] * arg2 >> 7;
							this.anIntArray284[local57] = arg3 * this.anIntArray284[local57] >> 7;
							this.lb[local57] = arg4 * this.lb[local57] >> 7;
							this.anIntArray282[local57] += Static632.anInt10405;
							this.anIntArray284[local57] += Static620.anInt10298;
							this.lb[local57] += Static613.anInt10156;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static332.aBoolean562) {
				local374 = Static613.anInt10156 * arg7[6] + Static632.anInt10405 * arg7[0] + Static620.anInt10298 * arg7[3] + 8192 >> 14;
				local396 = Static613.anInt10156 * arg7[7] + arg7[1] * Static632.anInt10405 + Static620.anInt10298 * arg7[4] + 8192 >> 14;
				local374 += local255;
				local396 += local57;
				local418 = Static632.anInt10405 * arg7[2] + Static620.anInt10298 * arg7[5] + arg7[8] * Static613.anInt10156 + 8192 >> 14;
				local418 += local63;
				Static632.anInt10405 = local374;
				Static620.anInt10298 = local396;
				Static613.anInt10156 = local418;
				Static332.aBoolean562 = false;
			}
			local374 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local418 = arg4 << 15 >> 7;
			local453 = local374 * -Static632.anInt10405 + 8192 >> 14;
			local457 = -Static620.anInt10298 * local396 + 8192 >> 14;
			local461 = -Static613.anInt10156 * local418 + 8192 >> 14;
			local465 = local453 + Static632.anInt10405;
			local473 = local457 + Static620.anInt10298;
			local481 = local461 + Static613.anInt10156;
			@Pc(1885) int[] local1885 = new int[] { arg7[0] * local374 + 8192 >> 14, arg7[3] * local374 + 8192 >> 14, arg7[6] * local374 + 8192 >> 14, local396 * arg7[1] + 8192 >> 14, local396 * arg7[4] + 8192 >> 14, local396 * arg7[7] + 8192 >> 14, arg7[2] * local418 + 8192 >> 14, local418 * arg7[5] + 8192 >> 14, arg7[8] * local418 + 8192 >> 14 };
			local636 = local374 * local255 + 8192 >> 14;
			local661 = local57 * local396 + 8192 >> 14;
			@Pc(2013) int local2013 = local636 + local465;
			@Pc(2017) int local2017 = local661 + local473;
			local665 = local63 * local418 + 8192 >> 14;
			@Pc(2029) int local2029 = local665 + local481;
			@Pc(2032) int[] local2032 = new int[9];
			@Pc(2038) int local2038;
			for (local673 = 0; local673 < 3; local673++) {
				for (local2038 = 0; local2038 < 3; local2038++) {
					local678 = 0;
					for (local682 = 0; local682 < 3; local682++) {
						local678 += local1885[local2038 + local682 * 3] * arg7[local673 * 3 + local682];
					}
					local2032[local2038 + local673 * 3] = local678 + 8192 >> 14;
				}
			}
			local2038 = local2017 * arg7[1] + arg7[0] * local2013 + arg7[2] * local2029 + 8192 >> 14;
			local678 = arg7[3] * local2013 + arg7[4] * local2017 + arg7[5] * local2029 + 8192 >> 14;
			local682 = local2017 * arg7[7] + local2013 * arg7[6] + local2029 * arg7[8] + 8192 >> 14;
			local2038 += local31;
			local678 += local35;
			local682 += local41;
			for (local686 = 0; local686 < local8; local686++) {
				local688 = arg1[local686];
				if (local688 < this.anIntArrayArray46.length) {
					local822 = this.anIntArrayArray46[local688];
					for (local824 = 0; local824 < local822.length; local824++) {
						local828 = local822[local824];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local828]) != 0) {
							local832 = this.lb[local828] * local2032[2] + this.anIntArray284[local828] * local2032[1] + local2032[0] * this.anIntArray282[local828] + 8192 >> 14;
							local834 = this.anIntArray284[local828] * local2032[4] + this.anIntArray282[local828] * local2032[3] + this.lb[local828] * local2032[5] + 8192 >> 14;
							local963 = local2032[8] * this.lb[local828] + local2032[7] * this.anIntArray284[local828] + this.anIntArray282[local828] * local2032[6] + 8192 >> 14;
							@Pc(2314) int local2314 = local832 + local2038;
							@Pc(2318) int local2318 = local834 + local678;
							@Pc(2322) int local2322 = local963 + local682;
							this.anIntArray282[local828] = local2314;
							this.anIntArray284[local828] = local2318;
							this.lb[local828] = local2322;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!wc;Lclient!fda;I)V")
	@Override
	public void method6281(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5009 == 0) {
			return;
		}
		@Pc(16) Class47_Sub2 local16 = this.aClass33_Sub3_20.aClass47_Sub2_3;
		@Pc(19) Class47_Sub2 local19 = (Class47_Sub2) arg0;
		if (!this.aBoolean437) {
			this.method4214();
		}
		Static312.aFloat283 = local19.aFloat139 * local16.aFloat133 + local16.aFloat136 * local19.aFloat140 + local19.aFloat142 * local16.aFloat141 + local16.aFloat139;
		Static342.aFloat191 = local19.aFloat137 * local16.aFloat136 + local19.aFloat132 * local16.aFloat141 + local16.aFloat133 * local19.aFloat136;
		@Pc(72) float local72 = Static312.aFloat283 + Static342.aFloat191 * (float) this.aShort59;
		@Pc(80) float local80 = Static312.aFloat283 + Static342.aFloat191 * (float) this.aShort63;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.aShort56 + local72;
			local96 = local80 - (float) this.aShort56;
		} else {
			local90 = local80 + (float) this.aShort56;
			local96 = (float) -this.aShort56 + local72;
		}
		if (this.aClass33_Sub3_20.aFloat119 <= local96 || local90 <= (float) this.aClass33_Sub3_20.anInt3446) {
			return;
		}
		Static345.aFloat193 = local16.aFloat135 * local19.aFloat142 + local19.aFloat140 * local16.aFloat132 + local19.aFloat139 * local16.aFloat138 + local16.aFloat142;
		Static321.aFloat162 = local16.aFloat138 * local19.aFloat136 + local16.aFloat135 * local19.aFloat132 + local16.aFloat132 * local19.aFloat137;
		@Pc(173) float local173 = Static321.aFloat162 * (float) this.aShort59 + Static345.aFloat193;
		@Pc(181) float local181 = Static345.aFloat193 + (float) this.aShort63 * Static321.aFloat162;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local197 = ((float) -this.aShort56 + local181) * (float) this.aClass33_Sub3_20.anInt3443;
			local208 = (local173 + (float) this.aShort56) * (float) this.aClass33_Sub3_20.anInt3443;
		} else {
			local197 = (float) this.aClass33_Sub3_20.anInt3443 * ((float) -this.aShort56 + local173);
			local208 = (float) this.aClass33_Sub3_20.anInt3443 * (local181 + (float) this.aShort56);
		}
		if (this.aClass33_Sub3_20.aFloat121 <= local197 / local90 || local208 / local90 <= this.aClass33_Sub3_20.aFloat118) {
			return;
		}
		Static67.aFloat37 = local16.aFloat140 + local16.aFloat134 * local19.aFloat139 + local19.aFloat140 * local16.aFloat137 + local19.aFloat142 * local16.aFloat131;
		Static122.aFloat100 = local16.aFloat134 * local19.aFloat136 + local19.aFloat137 * local16.aFloat137 + local19.aFloat132 * local16.aFloat131;
		@Pc(298) float local298 = Static67.aFloat37 + Static122.aFloat100 * (float) this.aShort59;
		@Pc(306) float local306 = Static67.aFloat37 + Static122.aFloat100 * (float) this.aShort63;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = ((float) -this.aShort56 + local306) * (float) this.aClass33_Sub3_20.anInt3428;
			local332 = (float) this.aClass33_Sub3_20.anInt3428 * ((float) this.aShort56 + local298);
		} else {
			local321 = (float) this.aClass33_Sub3_20.anInt3428 * (local298 - (float) this.aShort56);
			local332 = (local306 + (float) this.aShort56) * (float) this.aClass33_Sub3_20.anInt3428;
		}
		if (this.aClass33_Sub3_20.aFloat111 <= local321 / local90 || local332 / local90 <= this.aClass33_Sub3_20.aFloat104) {
			return;
		}
		if (arg1 != null || this.aClass257Array1 != null) {
			Static600.aFloat222 = local19.aFloat134 * local16.aFloat136 + local16.aFloat141 * local19.aFloat138 + local19.aFloat133 * local16.aFloat133;
			Static397.aFloat205 = local16.aFloat138 * local19.aFloat133 + local19.aFloat138 * local16.aFloat135 + local16.aFloat132 * local19.aFloat134;
			Static646.aFloat285 = local16.aFloat133 * local19.aFloat141 + local16.aFloat141 * local19.aFloat135 + local16.aFloat136 * local19.aFloat131;
			Static83.aFloat196 = local19.aFloat141 * local16.aFloat134 + local16.aFloat137 * local19.aFloat131 + local16.aFloat131 * local19.aFloat135;
			Static445.aFloat223 = local19.aFloat131 * local16.aFloat132 + local16.aFloat135 * local19.aFloat135 + local19.aFloat141 * local16.aFloat138;
			Static267.aFloat169 = local16.aFloat134 * local19.aFloat133 + local19.aFloat138 * local16.aFloat131 + local19.aFloat134 * local16.aFloat137;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.aShort60 + this.aShort61 >> 1;
			@Pc(511) int local511 = this.aShort54 + this.aShort57 >> 1;
			@Pc(530) int local530 = (int) (Static321.aFloat162 * (float) this.aShort59 + (float) local502 * Static445.aFloat223 + Static345.aFloat193 + Static397.aFloat205 * (float) local511);
			@Pc(549) int local549 = (int) (Static267.aFloat169 * (float) local511 + (float) this.aShort59 * Static122.aFloat100 + (float) local502 * Static83.aFloat196 + Static67.aFloat37);
			@Pc(568) int local568 = (int) (Static600.aFloat222 * (float) local511 + (float) this.aShort59 * Static342.aFloat191 + Static312.aFloat283 + (float) local502 * Static646.aFloat285);
			if (this.aClass33_Sub3_20.anInt3446 <= local568) {
				arg1.anInt3617 = local530 * this.aClass33_Sub3_20.anInt3443 / local568 + this.aClass33_Sub3_20.anInt3448;
				arg1.anInt3613 = this.aClass33_Sub3_20.anInt3433 + this.aClass33_Sub3_20.anInt3428 * local549 / local568;
			} else {
				local492 = true;
			}
			@Pc(627) int local627 = (int) ((float) local502 * Static445.aFloat223 + Static345.aFloat193 + (float) this.aShort63 * Static321.aFloat162 + (float) local511 * Static397.aFloat205);
			@Pc(646) int local646 = (int) (Static122.aFloat100 * (float) this.aShort63 + (float) local502 * Static83.aFloat196 + Static67.aFloat37 + (float) local511 * Static267.aFloat169);
			@Pc(665) int local665 = (int) ((float) this.aShort63 * Static342.aFloat191 + Static312.aFloat283 + Static646.aFloat285 * (float) local502 + (float) local511 * Static600.aFloat222);
			if (local665 < this.aClass33_Sub3_20.anInt3446) {
				local492 = true;
			} else {
				arg1.anInt3615 = this.aClass33_Sub3_20.anInt3443 * local627 / local665 + this.aClass33_Sub3_20.anInt3448;
				arg1.anInt3614 = this.aClass33_Sub3_20.anInt3433 + local646 * this.aClass33_Sub3_20.anInt3428 / local665;
			}
			if (local492) {
				if (local568 < this.aClass33_Sub3_20.anInt3446 && this.aClass33_Sub3_20.anInt3446 > local665) {
					local494 = false;
				} else {
					@Pc(740) int local740;
					@Pc(752) int local752;
					@Pc(763) int local763;
					if (this.aClass33_Sub3_20.anInt3446 > local568) {
						local740 = (local665 - this.aClass33_Sub3_20.anInt3446 << 16) / (local665 - local568);
						local752 = ((local627 - local530) * local740 >> 16) + local627;
						arg1.anInt3617 = this.aClass33_Sub3_20.anInt3448 + this.aClass33_Sub3_20.anInt3443 * local752 / this.aClass33_Sub3_20.anInt3446;
						local763 = ((local646 - local549) * local740 >> 16) + local646;
						arg1.anInt3613 = this.aClass33_Sub3_20.anInt3433 + local763 * this.aClass33_Sub3_20.anInt3428 / this.aClass33_Sub3_20.anInt3446;
					} else if (local665 < this.aClass33_Sub3_20.anInt3446) {
						local740 = (local568 - this.aClass33_Sub3_20.anInt3446 << 16) / (local568 - local665);
						local752 = local530 + ((local530 - local627) * local740 >> 16);
						local763 = ((local549 - local646) * local740 >> 16) + local549;
						arg1.anInt3617 = this.aClass33_Sub3_20.anInt3443 * local752 / this.aClass33_Sub3_20.anInt3446 + this.aClass33_Sub3_20.anInt3448;
						arg1.anInt3613 = this.aClass33_Sub3_20.anInt3428 * local763 / this.aClass33_Sub3_20.anInt3446 + this.aClass33_Sub3_20.anInt3433;
					}
				}
			}
			if (local494) {
				arg1.aBoolean303 = true;
				if (local665 < local568) {
					arg1.anInt3616 = this.aClass33_Sub3_20.anInt3448 + (this.aShort56 + local530) * this.aClass33_Sub3_20.anInt3443 / local568 - arg1.anInt3617;
				} else {
					arg1.anInt3616 = this.aClass33_Sub3_20.anInt3448 + (this.aShort56 + local627) * this.aClass33_Sub3_20.anInt3443 / local665 - arg1.anInt3615;
				}
			}
		}
		this.aClass33_Sub3_20.method3018();
		this.aClass33_Sub3_20.method3063(local19);
		this.method4213();
		this.aClass33_Sub3_20.method3049();
		this.method4219();
	}

	@OriginalMember(owner = "client!hn", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass33_Sub3_20.anInterface5_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5011; local11++) {
			if (arg0 == this.aShortArray56[local11]) {
				this.aShortArray56[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class156 local48 = local9.method6869(arg0 & 0xFFFF);
			local35 = local48.aByte71;
			local37 = local48.aByte74;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class156 local68 = local9.method6869(arg1 & 0xFFFF);
			if (local68.aByte68 != 0 || local68.aByte73 != 0) {
				this.aBoolean435 = true;
			}
			local58 = local68.aByte74;
			local56 = local68.aByte71;
		}
		if (!(local37 != local58 | local35 != local56)) {
			return;
		}
		if (this.aClass257Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt5002; local109++) {
				@Pc(116) Class257 local116 = this.aClass257Array1[local109];
				@Pc(121) Class231 local121 = this.aClass231Array1[local109];
				local121.anInt7112 = local121.anInt7112 & 0xFF000000 | Static120.anIntArray152[this.aShortArray63[local116.anInt7825] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!hn", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort56;
	}

	@OriginalMember(owner = "client!hn", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort55;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZLclient!hn;Lclient!hn;ZI)Lclient!ka;")
	private Class128 method4218(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class128_Sub2 arg2, @OriginalArg(3) Class128_Sub2 arg3, @OriginalArg(4) boolean arg4) {
		arg2.anInt4953 = this.anInt4953;
		arg2.anInt5009 = this.anInt5009;
		arg2.anInt5001 = arg0;
		arg2.anInt4977 = this.anInt4977;
		arg2.anInt4963 = this.anInt4963;
		arg2.anInt4999 = this.anInt4999;
		if ((arg0 & 0x100) == 0) {
			arg2.aBoolean434 = this.aBoolean434;
		} else {
			arg2.aBoolean434 = true;
		}
		arg2.aBoolean435 = this.aBoolean435;
		arg2.aShort58 = this.aShort58;
		arg2.aByte54 = 0;
		arg2.anInt5011 = this.anInt5011;
		arg2.aShort62 = this.aShort62;
		arg2.anInt5002 = this.anInt5002;
		@Pc(73) boolean local73 = Static219.method4263(arg0, this.anInt4953);
		@Pc(79) boolean local79 = Static500.method7312(this.anInt4953, arg0);
		@Pc(85) boolean local85 = Static554.method7815(arg0, this.anInt4953);
		@Pc(91) boolean local91 = local73 | local79 | local85;
		@Pc(188) int local188;
		if (local91) {
			if (!local73) {
				arg2.anIntArray282 = this.anIntArray282;
			} else if (arg3.anIntArray282 == null || this.anInt4977 > arg3.anIntArray282.length) {
				arg2.anIntArray282 = arg3.anIntArray282 = new int[this.anInt4977];
			} else {
				arg2.anIntArray282 = arg3.anIntArray282;
			}
			if (!local79) {
				arg2.anIntArray284 = this.anIntArray284;
			} else if (arg3.anIntArray284 == null || arg3.anIntArray284.length < this.anInt4977) {
				arg2.anIntArray284 = arg3.anIntArray284 = new int[this.anInt4977];
			} else {
				arg2.anIntArray284 = arg3.anIntArray284;
			}
			if (!local85) {
				arg2.lb = this.lb;
			} else if (arg3.lb == null || arg3.lb.length < this.anInt4977) {
				arg2.lb = arg3.lb = new int[this.anInt4977];
			} else {
				arg2.lb = arg3.lb;
			}
			for (local188 = 0; local188 < this.anInt4977; local188++) {
				if (local73) {
					arg2.anIntArray282[local188] = this.anIntArray282[local188];
				}
				if (local79) {
					arg2.anIntArray284[local188] = this.anIntArray284[local188];
				}
				if (local85) {
					arg2.lb[local188] = this.lb[local188];
				}
			}
		} else {
			arg2.anIntArray284 = this.anIntArray284;
			arg2.anIntArray282 = this.anIntArray282;
			arg2.lb = this.lb;
		}
		if (Static30.method570(this.anInt4953, arg0)) {
			if (arg1) {
				arg2.aByte54 = (byte) (arg2.aByte54 | 0x1);
			}
			arg2.aClass270_9 = arg3.aClass270_9;
			arg2.aClass270_9.anInterface27_6 = this.aClass270_9.anInterface27_6;
			arg2.aClass270_9.aByte99 = this.aClass270_9.aByte99;
		} else if (Static485.method7122(this.anInt4953, arg0)) {
			arg2.aClass270_9 = this.aClass270_9;
		} else {
			arg2.aClass270_9 = null;
		}
		if (Static523.method7473(arg0, this.anInt4953)) {
			if (arg3.aShortArray63 == null || arg3.aShortArray63.length < this.anInt5011) {
				arg2.aShortArray63 = arg3.aShortArray63 = new short[this.anInt5011];
			} else {
				arg2.aShortArray63 = arg3.aShortArray63;
			}
			for (local188 = 0; local188 < this.anInt5011; local188++) {
				arg2.aShortArray63[local188] = this.aShortArray63[local188];
			}
		} else {
			arg2.aShortArray63 = this.aShortArray63;
		}
		if (Static132.method3076(arg0, this.anInt4953)) {
			if (arg3.aByteArray50 == null || this.anInt5011 > arg3.aByteArray50.length) {
				arg2.aByteArray50 = arg3.aByteArray50 = new byte[this.anInt5011];
			} else {
				arg2.aByteArray50 = arg3.aByteArray50;
			}
			for (local188 = 0; local188 < this.anInt5011; local188++) {
				arg2.aByteArray50[local188] = this.aByteArray50[local188];
			}
		} else {
			arg2.aByteArray50 = this.aByteArray50;
		}
		if (Static289.method4998(this.anInt4953, arg0)) {
			arg2.aClass270_7 = arg3.aClass270_7;
			if (arg1) {
				arg2.aByte54 = (byte) (arg2.aByte54 | 0x2);
			}
			arg2.aClass270_7.aByte99 = this.aClass270_7.aByte99;
			arg2.aClass270_7.anInterface27_6 = this.aClass270_7.anInterface27_6;
		} else if (Static469.method6993(arg0, this.anInt4953)) {
			arg2.aClass270_7 = this.aClass270_7;
		} else {
			arg2.aClass270_7 = null;
		}
		@Pc(574) int local574;
		if (Static469.method6991(this.anInt4953, arg0)) {
			if (arg3.aShortArray57 == null || this.anInt5009 > arg3.aShortArray57.length) {
				local188 = this.anInt5009;
				arg2.aShortArray57 = arg3.aShortArray57 = new short[local188];
				arg2.aShortArray55 = arg3.aShortArray55 = new short[local188];
				arg2.aShortArray61 = arg3.aShortArray61 = new short[local188];
			} else {
				arg2.aShortArray57 = arg3.aShortArray57;
				arg2.aShortArray61 = arg3.aShortArray61;
				arg2.aShortArray55 = arg3.aShortArray55;
			}
			if (this.aClass342_1 == null) {
				for (local188 = 0; local188 < this.anInt5009; local188++) {
					arg2.aShortArray57[local188] = this.aShortArray57[local188];
					arg2.aShortArray61[local188] = this.aShortArray61[local188];
					arg2.aShortArray55[local188] = this.aShortArray55[local188];
				}
			} else {
				if (arg3.aClass342_1 == null) {
					arg3.aClass342_1 = new Class342();
				}
				@Pc(558) Class342 local558 = arg2.aClass342_1 = arg3.aClass342_1;
				if (local558.aShortArray141 == null || this.anInt5009 > local558.aShortArray141.length) {
					local574 = this.anInt5009;
					local558.aByteArray97 = new byte[local574];
					local558.aShortArray140 = new short[local574];
					local558.aShortArray141 = new short[local574];
					local558.aShortArray139 = new short[local574];
				}
				for (local574 = 0; local574 < this.anInt5009; local574++) {
					arg2.aShortArray57[local574] = this.aShortArray57[local574];
					arg2.aShortArray61[local574] = this.aShortArray61[local574];
					arg2.aShortArray55[local574] = this.aShortArray55[local574];
					local558.aShortArray141[local574] = this.aClass342_1.aShortArray141[local574];
					local558.aShortArray139[local574] = this.aClass342_1.aShortArray139[local574];
					local558.aShortArray140[local574] = this.aClass342_1.aShortArray140[local574];
					local558.aByteArray97[local574] = this.aClass342_1.aByteArray97[local574];
				}
			}
			arg2.aByteArray49 = this.aByteArray49;
		} else {
			arg2.aShortArray57 = this.aShortArray57;
			arg2.aClass342_1 = this.aClass342_1;
			arg2.aByteArray49 = this.aByteArray49;
			arg2.aShortArray61 = this.aShortArray61;
			arg2.aShortArray55 = this.aShortArray55;
		}
		if (Static126.method2895(this.anInt4953, arg0)) {
			if (arg1) {
				arg2.aByte54 = (byte) (arg2.aByte54 | 0x4);
			}
			arg2.aClass270_6 = arg3.aClass270_6;
			arg2.aClass270_6.aByte99 = this.aClass270_6.aByte99;
			arg2.aClass270_6.anInterface27_6 = this.aClass270_6.anInterface27_6;
		} else if (Static350.method5749(arg0, this.anInt4953)) {
			arg2.aClass270_6 = this.aClass270_6;
		} else {
			arg2.aClass270_6 = null;
		}
		if (Static578.method8021(this.anInt4953, arg0)) {
			if (arg3.aFloatArray47 == null || this.anInt5011 > arg3.aFloatArray47.length) {
				local188 = this.anInt5009;
				arg2.aFloatArray47 = arg3.aFloatArray47 = new float[local188];
				arg2.aFloatArray46 = arg3.aFloatArray46 = new float[local188];
			} else {
				arg2.aFloatArray46 = arg3.aFloatArray46;
				arg2.aFloatArray47 = arg3.aFloatArray47;
			}
			for (local188 = 0; local188 < this.anInt5009; local188++) {
				arg2.aFloatArray47[local188] = this.aFloatArray47[local188];
				arg2.aFloatArray46[local188] = this.aFloatArray46[local188];
			}
		} else {
			arg2.aFloatArray46 = this.aFloatArray46;
			arg2.aFloatArray47 = this.aFloatArray47;
		}
		if (Static626.method8491(arg0, this.anInt4953)) {
			arg2.aClass270_8 = arg3.aClass270_8;
			if (arg1) {
				arg2.aByte54 = (byte) (arg2.aByte54 | 0x8);
			}
			arg2.aClass270_8.aByte99 = this.aClass270_8.aByte99;
			arg2.aClass270_8.anInterface27_6 = this.aClass270_8.anInterface27_6;
		} else if (Static11.method118(arg0, this.anInt4953)) {
			arg2.aClass270_8 = this.aClass270_8;
		} else {
			arg2.aClass270_8 = null;
		}
		if (Static502.method7318(this.anInt4953, arg0)) {
			if (arg3.aShortArray58 == null || arg3.aShortArray58.length < this.anInt5011) {
				local188 = this.anInt5011;
				arg2.aShortArray58 = arg3.aShortArray58 = new short[local188];
				arg2.aShortArray60 = arg3.aShortArray60 = new short[local188];
				arg2.aShortArray62 = arg3.aShortArray62 = new short[local188];
			} else {
				arg2.aShortArray60 = arg3.aShortArray60;
				arg2.aShortArray62 = arg3.aShortArray62;
				arg2.aShortArray58 = arg3.aShortArray58;
			}
			for (local188 = 0; local188 < this.anInt5011; local188++) {
				arg2.aShortArray58[local188] = this.aShortArray58[local188];
				arg2.aShortArray62[local188] = this.aShortArray62[local188];
				arg2.aShortArray60[local188] = this.aShortArray60[local188];
			}
		} else {
			arg2.aShortArray58 = this.aShortArray58;
			arg2.aShortArray62 = this.aShortArray62;
			arg2.aShortArray60 = this.aShortArray60;
		}
		if (Static31.method594(this.anInt4953, arg0)) {
			if (arg1) {
				arg2.aByte54 = (byte) (arg2.aByte54 | 0x10);
			}
			arg2.aClass81_1 = arg3.aClass81_1;
			arg2.aClass81_1.anInterface12_1 = this.aClass81_1.anInterface12_1;
		} else if (Static438.method6670(arg0, this.anInt4953)) {
			arg2.aClass81_1 = this.aClass81_1;
		} else {
			arg2.aClass81_1 = null;
		}
		if (Static161.method3406(arg0, this.anInt4953)) {
			if (arg3.aShortArray56 == null || arg3.aShortArray56.length < this.anInt5011) {
				local188 = this.anInt5011;
				arg2.aShortArray56 = arg3.aShortArray56 = new short[local188];
			} else {
				arg2.aShortArray56 = arg3.aShortArray56;
			}
			for (local188 = 0; local188 < this.anInt5011; local188++) {
				arg2.aShortArray56[local188] = this.aShortArray56[local188];
			}
		} else {
			arg2.aShortArray56 = this.aShortArray56;
		}
		if (!Static328.method5504(arg0, this.anInt4953)) {
			arg2.aClass231Array1 = this.aClass231Array1;
		} else if (arg3.aClass231Array1 == null || arg3.aClass231Array1.length < this.anInt5002) {
			local188 = this.anInt5002;
			arg2.aClass231Array1 = arg3.aClass231Array1 = new Class231[local188];
			for (local574 = 0; local574 < this.anInt5002; local574++) {
				arg2.aClass231Array1[local574] = this.aClass231Array1[local574].method5970();
			}
		} else {
			arg2.aClass231Array1 = arg3.aClass231Array1;
			for (local188 = 0; local188 < this.anInt5002; local188++) {
				arg2.aClass231Array1[local188].method5968(this.aClass231Array1[local188]);
			}
		}
		arg2.anIntArrayArray46 = this.anIntArrayArray46;
		arg2.aShortArray65 = this.aShortArray65;
		arg2.aClass18Array2 = this.aClass18Array2;
		arg2.aClass257Array1 = this.aClass257Array1;
		arg2.anIntArray283 = this.anIntArray283;
		arg2.aShortArray64 = this.aShortArray64;
		arg2.anIntArrayArray47 = this.anIntArrayArray47;
		arg2.anIntArrayArray45 = this.anIntArrayArray45;
		arg2.anIntArray285 = this.anIntArray285;
		if (this.aBoolean437) {
			arg2.aShort59 = this.aShort59;
			arg2.aShort56 = this.aShort56;
			arg2.aShort54 = this.aShort54;
			arg2.aShort57 = this.aShort57;
			arg2.aShort55 = this.aShort55;
			arg2.aShort63 = this.aShort63;
			arg2.aShort60 = this.aShort60;
			arg2.aBoolean437 = true;
			arg2.aShort61 = this.aShort61;
		} else {
			arg2.aBoolean437 = false;
		}
		arg2.aClass215Array2 = this.aClass215Array2;
		arg2.aShortArray59 = this.aShortArray59;
		return arg2;
	}

	@OriginalMember(owner = "client!hn", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4999; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray284[local15] + local13 * this.anIntArray282[local15] >> 14;
			this.anIntArray284[local15] = this.anIntArray284[local15] * local13 - local9 * this.anIntArray282[local15] >> 14;
			this.anIntArray282[local15] = local33;
		}
		this.aBoolean437 = false;
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	private void method4219() {
		if (this.aClass257Array1 == null) {
			return;
		}
		@Pc(16) Class47_Sub2 local16 = this.aClass33_Sub3_20.aClass47_Sub2_2;
		this.aClass33_Sub3_20.method3062();
		this.aClass33_Sub3_20.C(!this.aBoolean434);
		this.aClass33_Sub3_20.method3080(false);
		this.aClass33_Sub3_20.method3073(null, this.aClass33_Sub3_20.aClass270_4, null, this.aClass33_Sub3_20.aClass270_5);
		for (@Pc(50) int local50 = 0; local50 < this.anInt5002; local50++) {
			@Pc(57) Class257 local57 = this.aClass257Array1[local50];
			@Pc(62) Class231 local62 = this.aClass231Array1[local50];
			if (!local57.aBoolean667 || !this.aClass33_Sub3_20.method6185()) {
				@Pc(91) float local91 = (float) (this.anIntArray282[local57.anInt7823] + this.anIntArray282[local57.anInt7828] + this.anIntArray282[local57.anInt7822]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray284[local57.anInt7823] + this.anIntArray284[local57.anInt7822] + this.anIntArray284[local57.anInt7828]) * 0.3333333F;
				@Pc(135) float local135 = (float) (this.lb[local57.anInt7828] + this.lb[local57.anInt7822] + this.lb[local57.anInt7823]) * 0.3333333F;
				@Pc(149) float local149 = local135 * Static397.aFloat205 + Static445.aFloat223 * local91 + Static321.aFloat162 * local112 + Static345.aFloat193;
				@Pc(163) float local163 = Static67.aFloat37 + local112 * Static122.aFloat100 + local91 * Static83.aFloat196 + Static267.aFloat169 * local135;
				@Pc(177) float local177 = local135 * Static600.aFloat222 + Static646.aFloat285 * local91 + local112 * Static342.aFloat191 + Static312.aFloat283;
				@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local149 * local149 + local163 * local163))) * (float) local57.anInt7826;
				local16.method3503((float) local62.anInt7110 + local163 * local198 - local163, local57.aShort102 * local62.anInt7104 >> 7, (float) local62.anInt7109 + local149 - local198 * local149, local177 * local198 + -local177, local62.anInt7107, local62.anInt7113 * local57.aShort103 >> 7);
				this.aClass33_Sub3_20.method3086(local16);
				@Pc(253) int local253 = local62.anInt7112;
				OpenGL.glColor4ub((byte) (local253 >> 16), (byte) (local253 >> 8), (byte) local253, (byte) (local253 >> 24));
				this.aClass33_Sub3_20.method3032(local57.aShort100);
				this.aClass33_Sub3_20.method3087(local57.aByte96);
				this.aClass33_Sub3_20.method3025(4);
			}
		}
		this.aClass33_Sub3_20.C(true);
		this.aClass33_Sub3_20.method3049();
	}

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt5001 = arg0;
		if (this.aClass342_1 != null && (this.anInt5001 & 0x10000) == 0) {
			this.aByteArray49 = this.aClass342_1.aByteArray97;
			this.aShortArray61 = this.aClass342_1.aShortArray139;
			this.aShortArray57 = this.aClass342_1.aShortArray141;
			this.aShortArray55 = this.aClass342_1.aShortArray140;
			this.aClass342_1 = null;
		}
		this.aBoolean436 = true;
		this.method4220();
	}

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4999; local7++) {
			if (arg0 != 0) {
				this.anIntArray282[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray284[local7] += arg1;
			}
			if (arg2 != 0) {
				this.lb[local7] += arg2;
			}
		}
		this.aBoolean437 = false;
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort57;
	}

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4999; local3++) {
			this.lb[local3] = -this.lb[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5009; local25++) {
			this.aShortArray55[local25] = (short) -this.aShortArray55[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5011; local48++) {
			@Pc(55) short local55 = this.aShortArray58[local48];
			this.aShortArray58[local48] = this.aShortArray60[local48];
			this.aShortArray60[local48] = local55;
		}
		if (this.aClass270_6 == null && this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
		if (this.aClass270_6 != null) {
			this.aClass270_6.anInterface27_6 = null;
		}
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
		if (this.aClass81_1 != null) {
			this.aClass81_1.anInterface12_1 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!hn", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5011; local3++) {
			if (arg0 == this.aShortArray63[local3]) {
				this.aShortArray63[local3] = arg1;
			}
		}
		if (this.aClass257Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5002; local30++) {
				@Pc(37) Class257 local37 = this.aClass257Array1[local30];
				@Pc(42) Class231 local42 = this.aClass231Array1[local30];
				local42.anInt7112 = Static120.anIntArray152[this.aShortArray63[local37.anInt7825] & 0xFFFF] & 0xFFFFFF | local42.anInt7112 & 0xFF000000;
			}
		}
		if (this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()Z")
	@Override
	public boolean method6270() {
		if (this.aShortArray56 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray56.length; local12++) {
			if (this.aShortArray56[local12] != -1 && !this.aClass33_Sub3_20.anInterface5_11.method6867(this.aShortArray56[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort62 = (short) arg0;
		if (this.aClass270_7 != null) {
			this.aClass270_7.anInterface27_6 = null;
		}
		if (this.aClass270_6 != null) {
			this.aClass270_6.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V")
	private void method4220() {
		if (!this.aBoolean436) {
			return;
		}
		this.aBoolean436 = false;
		if (this.aClass18Array2 == null && this.aClass215Array2 == null && this.aClass257Array1 == null) {
			if (this.anIntArray282 != null && !Static160.method3403(this.anInt4953, this.anInt5001)) {
				if (this.aClass270_9 != null && this.aClass270_9.anInterface27_6 == null) {
					this.aBoolean436 = true;
				} else {
					if (!this.aBoolean437) {
						this.method4214();
					}
					this.anIntArray282 = null;
				}
			}
			if (this.anIntArray284 != null && !Static117.method2791(this.anInt4953, this.anInt5001)) {
				if (this.aClass270_9 != null && this.aClass270_9.anInterface27_6 == null) {
					this.aBoolean436 = true;
				} else {
					if (!this.aBoolean437) {
						this.method4214();
					}
					this.anIntArray284 = null;
				}
			}
			if (this.lb != null && !Static414.method6480(this.anInt4953, this.anInt5001)) {
				if (this.aClass270_9 != null && this.aClass270_9.anInterface27_6 == null) {
					this.aBoolean436 = true;
				} else {
					if (!this.aBoolean437) {
						this.method4214();
					}
					this.lb = null;
				}
			}
		}
		if (this.aShortArray59 != null && this.anIntArray282 == null && this.anIntArray284 == null && this.lb == null) {
			this.aShortArray59 = null;
			this.anIntArray283 = null;
		}
		if (this.aByteArray49 != null && !Static71.method1837(this.anInt4953, this.anInt5001)) {
			if (this.aClass270_6 == null) {
				if (this.aClass270_7 != null && this.aClass270_7.anInterface27_6 == null) {
					this.aBoolean436 = true;
				} else {
					this.aShortArray57 = this.aShortArray61 = this.aShortArray55 = null;
					this.aByteArray49 = null;
				}
			} else if (this.aClass270_6.anInterface27_6 == null) {
				this.aBoolean436 = true;
			} else {
				this.aByteArray49 = null;
				this.aShortArray57 = this.aShortArray61 = this.aShortArray55 = null;
			}
		}
		if (this.aShortArray63 != null && !Static180.method3689(this.anInt5001, this.anInt4953)) {
			if (this.aClass270_7 != null && this.aClass270_7.anInterface27_6 == null) {
				this.aBoolean436 = true;
			} else {
				this.aShortArray63 = null;
			}
		}
		if (this.aByteArray50 != null && !Static291.method5018(this.anInt5001, this.anInt4953)) {
			if (this.aClass270_7 != null && this.aClass270_7.anInterface27_6 == null) {
				this.aBoolean436 = true;
			} else {
				this.aByteArray50 = null;
			}
		}
		if (this.aFloatArray47 != null && !Static299.method7323(this.anInt5001, this.anInt4953)) {
			if (this.aClass270_8 != null && this.aClass270_8.anInterface27_6 == null) {
				this.aBoolean436 = true;
			} else {
				this.aFloatArray47 = this.aFloatArray46 = null;
			}
		}
		if (this.aShortArray56 != null && !Static474.method7020(this.anInt4953, this.anInt5001)) {
			if (this.aClass270_7 != null && this.aClass270_7.anInterface27_6 == null) {
				this.aBoolean436 = true;
			} else {
				this.aShortArray56 = null;
			}
		}
		if (this.aShortArray58 != null && !Static607.method8245(this.anInt4953, this.anInt5001)) {
			if ((this.aClass81_1 == null || this.aClass81_1.anInterface12_1 != null) && (this.aClass270_7 == null || this.aClass270_7.anInterface27_6 != null)) {
				this.aShortArray58 = this.aShortArray62 = this.aShortArray60 = null;
			} else {
				this.aBoolean436 = true;
			}
		}
		if (this.anIntArrayArray45 != null && !Static73.method1847(this.anInt5001, this.anInt4953)) {
			this.anIntArrayArray45 = null;
			this.aShortArray65 = null;
		}
		if (this.anIntArrayArray46 != null && !Static388.method6122(this.anInt5001, this.anInt4953)) {
			this.anIntArrayArray46 = null;
			this.aShortArray64 = null;
		}
		if (this.anIntArrayArray47 != null && !Static507.method7378(this.anInt5001, this.anInt4953)) {
			this.anIntArrayArray47 = null;
		}
		if (this.anIntArray285 != null && (this.anInt5001 & 0x800) == 0 && (this.anInt5001 & 0x40000) == 0) {
			this.anIntArray285 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!wc;ZI)Z")
	@Override
	public boolean method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4212(arg1, arg2, arg4, arg0, -1, arg3);
	}

	@OriginalMember(owner = "client!hn", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!hn", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean437) {
			this.method4214();
		}
		return this.aShort54;
	}

	@OriginalMember(owner = "client!hn", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray46 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4977; local12++) {
			this.anIntArray282[local12] <<= 0x4;
			this.anIntArray284[local12] <<= 0x4;
			this.lb[local12] <<= 0x4;
		}
		Static632.anInt10405 = 0;
		Static620.anInt10298 = 0;
		Static613.anInt10156 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4999; local15++) {
			@Pc(34) int local34 = this.anIntArray284[local15] * local13 - this.lb[local15] * local9 >> 14;
			this.lb[local15] = this.anIntArray284[local15] * local9 + local13 * this.lb[local15] >> 14;
			this.anIntArray284[local15] = local34;
		}
		this.aBoolean437 = false;
		if (this.aClass270_9 != null) {
			this.aClass270_9.anInterface27_6 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZZ)V")
	private void method4221(@OriginalArg(0) boolean arg0) {
		if (this.anInt4963 * 6 > this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2.aByteArray106.length) {
			this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2 = new Class3_Sub15_Sub2((this.anInt4963 + 100) * 6);
		} else {
			this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2.anInt10282 = 0;
		}
		@Pc(42) Class3_Sub15_Sub2 local42 = this.aClass33_Sub3_20.aClass3_Sub15_Sub2_2;
		@Pc(48) int local48;
		if (this.aClass33_Sub3_20.aBoolean264) {
			for (local48 = 0; local48 < this.anInt4963; local48++) {
				local42.method8464(this.aShortArray58[local48]);
				local42.method8464(this.aShortArray62[local48]);
				local42.method8464(this.aShortArray60[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt4963; local48++) {
				local42.method8405(this.aShortArray58[local48]);
				local42.method8405(this.aShortArray62[local48]);
				local42.method8405(this.aShortArray60[local48]);
			}
		}
		if (local42.anInt10282 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.aClass33_Sub3_20.method3064(local42.aByteArray106, true, local42.anInt10282);
			} else {
				this.anInterface12_3.method3814(local42.aByteArray106, local42.anInt10282);
			}
			this.aClass81_1.anInterface12_1 = this.anInterface12_3;
		} else {
			this.aClass81_1.anInterface12_1 = this.aClass33_Sub3_20.method3064(local42.aByteArray106, false, local42.anInt10282);
		}
		if (!arg0) {
			this.aBoolean436 = true;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!wc;ZII)Z")
	@Override
	public boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method4212(arg1, arg2, arg4, arg0, arg5, arg3);
	}
}
