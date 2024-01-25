import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!jh;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "Lclient!pi;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!la", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "[Lclient!tf;")
	private Class280[] aClass280Array3;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!la", name = "W", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "[Lclient!dh;")
	private Class64[] aClass64Array1;

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!la", name = "mb", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!la", name = "xb", descriptor = "[F")
	private float[] aFloatArray39;

	@OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
	private int anInt5336;

	@OriginalMember(owner = "client!la", name = "Db", descriptor = "[Lclient!wt;")
	private Class319[] aClass319Array1;

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!la", name = "Fb", descriptor = "B")
	private byte aByte54;

	@OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lclient!gw;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!la", name = "Mb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!la", name = "Nb", descriptor = "[Lclient!on;")
	private Class223[] aClass223Array3;

	@OriginalMember(owner = "client!la", name = "Qb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!la", name = "Tb", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!la", name = "Vb", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!la", name = "Wb", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!la", name = "Xb", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!la", name = "Zb", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!la", name = "ec", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!la", name = "hc", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!la", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!la", name = "jc", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!la", name = "nc", descriptor = "[F")
	private float[] aFloatArray40;

	@OriginalMember(owner = "client!la", name = "qc", descriptor = "I")
	private int anInt5357;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	private int anInt5301 = 0;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	private int anInt5314 = 0;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "I")
	private int anInt5316 = 0;

	@OriginalMember(owner = "client!la", name = "ob", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!la", name = "ac", descriptor = "Z")
	private boolean aBoolean371 = true;

	@OriginalMember(owner = "client!la", name = "db", descriptor = "I")
	private int anInt5323 = 0;

	@OriginalMember(owner = "client!la", name = "kc", descriptor = "I")
	private int anInt5352 = 0;

	@OriginalMember(owner = "client!la", name = "cc", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_17;

	@OriginalMember(owner = "client!la", name = "nb", descriptor = "Lclient!as;")
	private Class19 aClass19_10;

	@OriginalMember(owner = "client!la", name = "yb", descriptor = "Lclient!as;")
	private Class19 aClass19_11;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "Lclient!as;")
	private Class19 aClass19_9;

	@OriginalMember(owner = "client!la", name = "dc", descriptor = "Lclient!as;")
	private Class19 aClass19_12;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "Lclient!jaa;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class36_Sub2(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_17 = arg0;
		this.aClass19_10 = new Class19(null, 5126, 3, 0);
		this.aClass19_11 = new Class19(null, 5126, 2, 0);
		this.aClass19_9 = new Class19(null, 5126, 3, 0);
		this.aClass19_12 = new Class19(null, 5121, 4, 0);
		this.aClass153_1 = new Class153();
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!jj;Lclient!ld;IIII)V")
	public Class36_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5336 = arg2;
		this.aClass62_Sub3_17 = arg0;
		this.anInt5357 = arg5;
		if (Static437.method6223(arg2, arg5)) {
			this.aClass19_10 = new Class19(null, 5126, 3, 0);
		}
		if (Static463.method6457(arg2, arg5)) {
			this.aClass19_11 = new Class19(null, 5126, 2, 0);
		}
		if (Static205.method3345(arg5, arg2)) {
			this.aClass19_9 = new Class19(null, 5126, 3, 0);
		}
		if (Static182.method3093(arg5, arg2)) {
			this.aClass19_12 = new Class19(null, 5121, 4, 0);
		}
		if (Static360.method5529(arg2, arg5)) {
			this.aClass153_1 = new Class153();
		}
		@Pc(102) Interface8 local102 = arg0.anInterface8_145;
		@Pc(106) int[] local106 = new int[arg1.anInt5403];
		this.anIntArray361 = new int[arg1.anInt5399 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5403; local115++) {
			if ((arg1.aByteArray77 == null || arg1.aByteArray77[local115] != 2) && (arg1.aShortArray80 == null || arg1.aShortArray80[local115] == -1 || !local102.method7237(arg1.aShortArray80[local115] & 0xFFFF).aBoolean557)) {
				local106[this.anInt5323++] = local115;
				this.anIntArray361[arg1.aShortArray78[local115]]++;
				this.anIntArray361[arg1.aShortArray74[local115]]++;
				this.anIntArray361[arg1.aShortArray75[local115]]++;
			}
		}
		this.anInt5352 = this.anInt5323;
		@Pc(208) long[] local208 = new long[this.anInt5323];
		@Pc(220) boolean local220 = (this.anInt5336 & 0x100) != 0;
		@Pc(232) int local232;
		@Pc(243) int local243;
		@Pc(372) int local372;
		label495: for (@Pc(222) int local222 = 0; local222 < this.anInt5323; local222++) {
			@Pc(228) int local228 = local106[local222];
			@Pc(230) Class271 local230 = null;
			local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			@Pc(238) byte local238 = 0;
			if (arg1.aClass21Array1 != null) {
				for (local243 = 0; local243 < arg1.aClass21Array1.length; local243++) {
					@Pc(250) Class21 local250 = arg1.aClass21Array1[local243];
					if (local228 == local250.anInt536) {
						@Pc(259) Class147 local259 = Static181.method3084(local250.anInt535);
						if (local259.aBoolean244) {
							local208[local222] = Long.MAX_VALUE;
							this.anInt5352--;
							continue label495;
						}
					}
				}
			}
			@Pc(286) short local286 = -1;
			if (arg1.aShortArray80 != null) {
				local286 = arg1.aShortArray80[local228];
				if (local286 != -1) {
					local230 = local102.method7237(local286 & 0xFFFF);
					local238 = local230.aByte79;
					local236 = local230.aByte78;
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray78 != null && arg1.aByteArray78[local228] != 0 || local230 != null && local230.aBoolean562 | !local230.aBoolean561;
			if ((local220 || local334) && arg1.aByteArray73 != null) {
				local232 += arg1.aByteArray73[local228] << 17;
			}
			if (local334) {
				local232 += 65536;
			}
			local232 += (local236 & 0xFF) << 8;
			local372 = local234 + ((local286 & 0xFFFF) << 16);
			local232 += local238 & 0xFF;
			@Pc(384) int local384 = local372 + (local222 & 0xFFFF);
			local208[local222] = ((long) local232 << 32) + (long) local384;
		}
		Static184.method5423(local106, local208);
		this.anIntArray362 = arg1.anIntArray381;
		this.anIntArray365 = arg1.anIntArray388;
		this.anIntArray366 = arg1.anIntArray379;
		this.aShortArray70 = arg1.aShortArray79;
		this.anInt5314 = arg1.anInt5398;
		this.anInt5316 = arg1.anInt5399;
		this.aClass223Array3 = arg1.aClass223Array4;
		this.aClass280Array3 = arg1.aClass280Array4;
		@Pc(439) Class224[] local439 = new Class224[this.anInt5316];
		@Pc(459) int local459;
		@Pc(473) int local473;
		if (arg1.aClass21Array1 != null) {
			this.anInt5325 = arg1.aClass21Array1.length;
			this.aClass64Array1 = new Class64[this.anInt5325];
			this.aClass319Array1 = new Class319[this.anInt5325];
			for (local459 = 0; local459 < this.anInt5325; local459++) {
				@Pc(466) Class21 local466 = arg1.aClass21Array1[local459];
				@Pc(471) Class147 local471 = Static181.method3084(local466.anInt535);
				local473 = -1;
				for (@Pc(475) int local475 = 0; local475 < this.anInt5323; local475++) {
					if (local466.anInt536 == local106[local475]) {
						local473 = local475;
						break;
					}
				}
				if (local473 == -1) {
					throw new RuntimeException();
				}
				local243 = Static444.anIntArray587[arg1.aShortArray73[local466.anInt536] & 0xFFFF] & 0xFFFFFF;
				local243 |= 255 - (arg1.aByteArray78 == null ? 0 : arg1.aByteArray78[local466.anInt536]) << 24;
				this.aClass319Array1[local459] = new Class319(local473, arg1.aShortArray78[local466.anInt536], arg1.aShortArray74[local466.anInt536], arg1.aShortArray75[local466.anInt536], local471.anInt4022, local471.anInt4025, local471.anInt4021, local471.anInt4017, local471.anInt4023, local471.aBoolean244, local471.aBoolean243, local466.anInt531);
				this.aClass64Array1[local459] = new Class64(local243);
			}
		}
		local459 = this.anInt5323 * 3;
		this.aShortArray67 = new short[local459];
		Static13.aLongArray2 = new long[local459];
		this.aShortArray66 = new short[local459];
		this.aShortArray62 = new short[this.anInt5323];
		this.aShortArray64 = new short[this.anInt5323];
		this.aShort74 = (short) arg4;
		this.aShort77 = (short) arg3;
		this.aShortArray71 = new short[this.anInt5323];
		this.aShortArray72 = new short[this.anInt5323];
		this.aByteArray71 = new byte[local459];
		this.aFloatArray40 = new float[local459];
		if (arg1.aShortArray81 != null) {
			this.aShortArray65 = new short[this.anInt5323];
		}
		this.aShortArray69 = new short[this.anInt5323];
		this.aFloatArray39 = new float[local459];
		this.aShortArray68 = new short[local459];
		this.aShortArray63 = new short[local459];
		this.aByteArray70 = new byte[this.anInt5323];
		local232 = 0;
		for (local372 = 0; local372 < arg1.anInt5399; local372++) {
			local473 = this.anIntArray361[local372];
			this.anIntArray361[local372] = local232;
			local439[local372] = new Class224();
			local232 += local473;
		}
		this.anIntArray361[arg1.anInt5399] = local232;
		@Pc(706) int[] local706 = null;
		@Pc(708) int[] local708 = null;
		@Pc(710) int[] local710 = null;
		@Pc(712) float[][] local712 = null;
		@Pc(738) int local738;
		@Pc(777) int local777;
		@Pc(783) int local783;
		@Pc(797) int local797;
		@Pc(799) int local799;
		@Pc(830) int local830;
		@Pc(835) int local835;
		@Pc(1003) float local1003;
		@Pc(995) float local995;
		@Pc(1011) float local1011;
		if (arg1.aByteArray75 != null) {
			@Pc(718) int local718 = arg1.anInt5408;
			@Pc(721) int[] local721 = new int[local718];
			@Pc(724) int[] local724 = new int[local718];
			@Pc(727) int[] local727 = new int[local718];
			@Pc(730) int[] local730 = new int[local718];
			@Pc(733) int[] local733 = new int[local718];
			@Pc(736) int[] local736 = new int[local718];
			for (local738 = 0; local738 < local718; local738++) {
				local721[local738] = Integer.MAX_VALUE;
				local724[local738] = -2147483647;
				local727[local738] = Integer.MAX_VALUE;
				local730[local738] = -2147483647;
				local733[local738] = Integer.MAX_VALUE;
				local736[local738] = -2147483647;
			}
			local708 = new int[local718];
			for (local777 = 0; local777 < this.anInt5323; local777++) {
				local783 = local106[local777];
				if (arg1.aByteArray75[local783] != -1) {
					local797 = arg1.aByteArray75[local783] & 0xFF;
					for (local799 = 0; local799 < 3; local799++) {
						@Pc(808) short local808;
						if (local799 == 0) {
							local808 = arg1.aShortArray78[local783];
						} else if (local799 == 1) {
							local808 = arg1.aShortArray74[local783];
						} else {
							local808 = arg1.aShortArray75[local783];
						}
						local830 = arg1.anIntArray381[local808];
						local835 = arg1.anIntArray379[local808];
						@Pc(840) int local840 = arg1.anIntArray388[local808];
						if (local830 < local721[local797]) {
							local721[local797] = local830;
						}
						if (local724[local797] < local830) {
							local724[local797] = local830;
						}
						if (local835 < local727[local797]) {
							local727[local797] = local835;
						}
						if (local730[local797] < local835) {
							local730[local797] = local835;
						}
						if (local733[local797] > local840) {
							local733[local797] = local840;
						}
						if (local840 > local736[local797]) {
							local736[local797] = local840;
						}
					}
				}
			}
			local712 = new float[local718][];
			local710 = new int[local718];
			local706 = new int[local718];
			for (local783 = 0; local783 < local718; local783++) {
				@Pc(939) byte local939 = arg1.aByteArray72[local783];
				if (local939 > 0) {
					local706[local783] = (local721[local783] + local724[local783]) / 2;
					local708[local783] = (local727[local783] + local730[local783]) / 2;
					local710[local783] = (local733[local783] + local736[local783]) / 2;
					if (local939 == 1) {
						local835 = arg1.anIntArray384[local783];
						if (local835 == 0) {
							local1003 = 1.0F;
							local995 = 1.0F;
						} else if (local835 > 0) {
							local1003 = 1.0F;
							local995 = (float) local835 / 1024.0F;
						} else {
							local995 = 1.0F;
							local1003 = (float) -local835 / 1024.0F;
						}
						local1011 = 64.0F / (float) arg1.anIntArray380[local783];
					} else if (local939 == 2) {
						local995 = 64.0F / (float) arg1.anIntArray387[local783];
						local1003 = 64.0F / (float) arg1.anIntArray384[local783];
						local1011 = 64.0F / (float) arg1.anIntArray380[local783];
					} else {
						local1011 = (float) arg1.anIntArray380[local783] / 1024.0F;
						local1003 = (float) arg1.anIntArray384[local783] / 1024.0F;
						local995 = (float) arg1.anIntArray387[local783] / 1024.0F;
					}
					local712[local783] = Static397.method5787(arg1.aShortArray82[local783], arg1.aShortArray76[local783], arg1.aByteArray74[local783] & 0xFF, local995, local1003, arg1.aShortArray77[local783], local1011);
				}
			}
		}
		@Pc(1123) Class45[] local1123 = new Class45[arg1.anInt5403];
		@Pc(1142) short local1142;
		@Pc(1153) int local1153;
		@Pc(1164) int local1164;
		@Pc(1226) int local1226;
		for (@Pc(1125) int local1125 = 0; local1125 < arg1.anInt5403; local1125++) {
			@Pc(1132) short local1132 = arg1.aShortArray78[local1125];
			@Pc(1137) short local1137 = arg1.aShortArray74[local1125];
			local1142 = arg1.aShortArray75[local1125];
			local1153 = this.anIntArray362[local1137] - this.anIntArray362[local1132];
			local1164 = this.anIntArray366[local1137] - this.anIntArray366[local1132];
			local738 = this.anIntArray365[local1137] - this.anIntArray365[local1132];
			local777 = this.anIntArray362[local1142] - this.anIntArray362[local1132];
			local783 = this.anIntArray366[local1142] - this.anIntArray366[local1132];
			local797 = this.anIntArray365[local1142] - this.anIntArray365[local1132];
			local799 = local1164 * local797 - local738 * local783;
			local1226 = local738 * local777 - local1153 * local797;
			local830 = local783 * local1153 - local777 * local1164;
			while (local799 > 8192 || local1226 > 8192 || local830 > 8192 || local799 < -8192 || local1226 < -8192 || local830 < -8192) {
				local830 >>= 0x1;
				local799 >>= 0x1;
				local1226 >>= 0x1;
			}
			local835 = (int) Math.sqrt((double) (local830 * local830 + local1226 * local1226 + local799 * local799));
			if (local835 <= 0) {
				local835 = 1;
			}
			local830 = local830 * 256 / local835;
			local1226 = local1226 * 256 / local835;
			local799 = local799 * 256 / local835;
			@Pc(1322) byte local1322 = arg1.aByteArray77 == null ? 0 : arg1.aByteArray77[local1125];
			if (local1322 == 0) {
				@Pc(1352) Class224 local1352 = local439[local1132];
				local1352.anInt6770 += local799;
				local1352.anInt6768 += local830;
				local1352.anInt6769 += local1226;
				local1352.anInt6771++;
				@Pc(1380) Class224 local1380 = local439[local1137];
				local1380.anInt6770 += local799;
				local1380.anInt6769 += local1226;
				local1380.anInt6771++;
				local1380.anInt6768 += local830;
				@Pc(1408) Class224 local1408 = local439[local1142];
				local1408.anInt6768 += local830;
				local1408.anInt6770 += local799;
				local1408.anInt6771++;
				local1408.anInt6769 += local1226;
			} else if (local1322 == 1) {
				@Pc(1337) Class45 local1337 = local1123[local1125] = new Class45();
				local1337.anInt1177 = local1226;
				local1337.anInt1178 = local830;
				local1337.anInt1175 = local799;
			}
		}
		@Pc(1449) int local1449;
		for (@Pc(1443) int local1443 = 0; local1443 < this.anInt5323; local1443++) {
			local1449 = local106[local1443];
			@Pc(1456) int local1456 = arg1.aShortArray73[local1449] & 0xFFFF;
			@Pc(1464) short local1464;
			if (arg1.aShortArray80 == null) {
				local1464 = -1;
			} else {
				local1464 = arg1.aShortArray80[local1449];
			}
			if (arg1.aByteArray75 == null) {
				local1164 = -1;
			} else {
				local1164 = arg1.aByteArray75[local1449];
			}
			if (arg1.aByteArray78 == null) {
				local738 = 0;
			} else {
				local738 = arg1.aByteArray78[local1449] & 0xFF;
			}
			@Pc(1496) float local1496 = 0.0F;
			@Pc(1498) float local1498 = 0.0F;
			@Pc(1500) float local1500 = 0.0F;
			local1003 = 0.0F;
			local1011 = 0.0F;
			local995 = 0.0F;
			@Pc(1508) byte local1508 = 0;
			@Pc(1510) byte local1510 = 0;
			@Pc(1512) int local1512 = 0;
			@Pc(1546) byte local1546;
			@Pc(1563) short local1563;
			@Pc(2307) short local2307;
			@Pc(2312) short local2312;
			if (local1464 != -1) {
				if (local1164 == -1) {
					local1003 = 1.0F;
					local1500 = 1.0F;
					local995 = 0.0F;
					local1498 = 1.0F;
					local1508 = 1;
					local1496 = 0.0F;
					local1510 = 2;
					local1011 = 0.0F;
				} else {
					local1164 &= 0xFF;
					local1546 = arg1.aByteArray72[local1164];
					@Pc(1553) short local1553;
					@Pc(1558) short local1558;
					@Pc(1592) float local1592;
					@Pc(1610) float local1610;
					@Pc(1618) float local1618;
					@Pc(1718) float local1718;
					@Pc(1726) float local1726;
					@Pc(1734) float local1734;
					@Pc(1757) float local1757;
					@Pc(1780) float local1780;
					@Pc(1803) float local1803;
					if (local1546 == 0) {
						local1553 = arg1.aShortArray78[local1449];
						local1558 = arg1.aShortArray74[local1449];
						local1563 = arg1.aShortArray75[local1449];
						local2307 = arg1.aShortArray77[local1164];
						local2312 = arg1.aShortArray76[local1164];
						@Pc(2317) short local2317 = arg1.aShortArray82[local1164];
						@Pc(2323) float local2323 = (float) arg1.anIntArray381[local2307];
						@Pc(2329) float local2329 = (float) arg1.anIntArray379[local2307];
						local1592 = arg1.anIntArray388[local2307];
						local1610 = (float) arg1.anIntArray381[local2312] - local2323;
						local1618 = (float) arg1.anIntArray379[local2312] - local2329;
						@Pc(2362) float local2362 = (float) arg1.anIntArray388[local2312] - local1592;
						@Pc(2371) float local2371 = (float) arg1.anIntArray381[local2317] - local2323;
						@Pc(2379) float local2379 = (float) arg1.anIntArray379[local2317] - local2329;
						@Pc(2388) float local2388 = (float) arg1.anIntArray388[local2317] - local1592;
						@Pc(2396) float local2396 = (float) arg1.anIntArray381[local1553] - local2323;
						@Pc(2405) float local2405 = (float) arg1.anIntArray379[local1553] - local2329;
						@Pc(2413) float local2413 = (float) arg1.anIntArray388[local1553] - local1592;
						@Pc(2421) float local2421 = (float) arg1.anIntArray381[local1558] - local2323;
						@Pc(2429) float local2429 = (float) arg1.anIntArray379[local1558] - local2329;
						local1718 = (float) arg1.anIntArray388[local1558] - local1592;
						local1726 = (float) arg1.anIntArray381[local1563] - local2323;
						local1734 = (float) arg1.anIntArray379[local1563] - local2329;
						local1757 = (float) arg1.anIntArray388[local1563] - local1592;
						local1780 = local1618 * local2388 - local2362 * local2379;
						local1803 = local2362 * local2371 - local1610 * local2388;
						@Pc(2490) float local2490 = local2379 * local1610 - local1618 * local2371;
						@Pc(2499) float local2499 = local2490 * local2379 - local2388 * local1803;
						@Pc(2508) float local2508 = local2388 * local1780 - local2490 * local2371;
						@Pc(2516) float local2516 = local2371 * local1803 - local2379 * local1780;
						@Pc(2530) float local2530 = 1.0F / (local1618 * local2508 + local2499 * local1610 + local2516 * local2362);
						local1011 = local2530 * (local1757 * local2516 + local2499 * local1726 + local1734 * local2508);
						local1496 = local2530 * (local2516 * local2413 + local2396 * local2499 + local2508 * local2405);
						local1500 = local2530 * (local1718 * local2516 + local2508 * local2429 + local2421 * local2499);
						@Pc(2581) float local2581 = local1610 * local1803 - local1618 * local1780;
						@Pc(2590) float local2590 = local1780 * local2362 - local2490 * local1610;
						@Pc(2599) float local2599 = local1618 * local2490 - local2362 * local1803;
						@Pc(2613) float local2613 = 1.0F / (local2388 * local2581 + local2599 * local2371 + local2379 * local2590);
						local1003 = local2613 * (local2429 * local2590 + local2421 * local2599 + local2581 * local1718);
						local995 = local2613 * (local2599 * local1726 + local1734 * local2590 + local1757 * local2581);
						local1498 = (local2590 * local2405 + local2396 * local2599 + local2413 * local2581) * local2613;
					} else {
						local1553 = arg1.aShortArray78[local1449];
						local1558 = arg1.aShortArray74[local1449];
						local1563 = arg1.aShortArray75[local1449];
						@Pc(1567) int local1567 = local706[local1164];
						@Pc(1571) int local1571 = local708[local1164];
						@Pc(1575) int local1575 = local710[local1164];
						@Pc(1579) float[] local1579 = local712[local1164];
						@Pc(1584) byte local1584 = arg1.aByteArray76[local1164];
						local1592 = (float) arg1.anIntArray386[local1164] / 256.0F;
						if (local1546 == 1) {
							local1610 = (float) arg1.anIntArray387[local1164] / 1024.0F;
							Static533.method7273(local1571, local1592, local1610, local1567, arg1.anIntArray388[local1553], arg1.anIntArray379[local1553], arg1.anIntArray381[local1553], local1584, local1579, local1575);
							local1498 = Static456.aFloat330;
							local1496 = Static70.aFloat49;
							Static533.method7273(local1571, local1592, local1610, local1567, arg1.anIntArray388[local1558], arg1.anIntArray379[local1558], arg1.anIntArray381[local1558], local1584, local1579, local1575);
							local1500 = Static70.aFloat49;
							local1003 = Static456.aFloat330;
							Static533.method7273(local1571, local1592, local1610, local1567, arg1.anIntArray388[local1563], arg1.anIntArray379[local1563], arg1.anIntArray381[local1563], local1584, local1579, local1575);
							local995 = Static456.aFloat330;
							local1011 = Static70.aFloat49;
							local1618 = local1610 / 2.0F;
							if ((local1584 & 0x1) == 0) {
								if (local1500 - local1496 > local1618) {
									local1500 -= local1610;
									local1508 = 1;
								} else if (local1496 - local1500 > local1618) {
									local1500 += local1610;
									local1508 = 2;
								}
								if (local1011 - local1496 > local1618) {
									local1510 = 1;
									local1011 -= local1610;
								} else if (local1496 - local1011 > local1618) {
									local1510 = 2;
									local1011 += local1610;
								}
							} else {
								if (local1003 - local1498 > local1618) {
									local1508 = 1;
									local1003 -= local1610;
								} else if (local1618 < local1498 - local1003) {
									local1003 += local1610;
									local1508 = 2;
								}
								if (local995 - local1498 > local1618) {
									local995 -= local1610;
									local1510 = 1;
								} else if (local1618 < local1498 - local995) {
									local995 += local1610;
									local1510 = 2;
								}
							}
						} else if (local1546 == 2) {
							local1610 = (float) arg1.anIntArray385[local1164] / 256.0F;
							local1618 = (float) arg1.anIntArray383[local1164] / 256.0F;
							@Pc(1629) int local1629 = arg1.anIntArray381[local1558] - arg1.anIntArray381[local1553];
							@Pc(1640) int local1640 = arg1.anIntArray379[local1558] - arg1.anIntArray379[local1553];
							@Pc(1651) int local1651 = arg1.anIntArray388[local1558] - arg1.anIntArray388[local1553];
							@Pc(1661) int local1661 = arg1.anIntArray381[local1563] - arg1.anIntArray381[local1553];
							@Pc(1672) int local1672 = arg1.anIntArray379[local1563] - arg1.anIntArray379[local1553];
							@Pc(1683) int local1683 = arg1.anIntArray388[local1563] - arg1.anIntArray388[local1553];
							@Pc(1692) int local1692 = local1683 * local1640 - local1672 * local1651;
							@Pc(1701) int local1701 = local1661 * local1651 - local1683 * local1629;
							@Pc(1710) int local1710 = local1629 * local1672 - local1661 * local1640;
							local1718 = 64.0F / (float) arg1.anIntArray384[local1164];
							local1726 = 64.0F / (float) arg1.anIntArray380[local1164];
							local1734 = 64.0F / (float) arg1.anIntArray387[local1164];
							local1757 = (local1579[2] * (float) local1710 + local1579[0] * (float) local1692 + local1579[1] * (float) local1701) / local1718;
							local1780 = (local1579[4] * (float) local1701 + local1579[3] * (float) local1692 + (float) local1710 * local1579[5]) / local1726;
							local1803 = ((float) local1701 * local1579[7] + local1579[6] * (float) local1692 + (float) local1710 * local1579[8]) / local1734;
							local1512 = Static391.method5715(local1803, local1757, local1780);
							Static142.method2683(local1579, local1618, local1567, local1571, local1592, arg1.anIntArray381[local1553], arg1.anIntArray379[local1553], local1575, local1584, arg1.anIntArray388[local1553], local1512, local1610);
							local1496 = Static230.aFloat183;
							local1498 = Static83.aFloat58;
							Static142.method2683(local1579, local1618, local1567, local1571, local1592, arg1.anIntArray381[local1558], arg1.anIntArray379[local1558], local1575, local1584, arg1.anIntArray388[local1558], local1512, local1610);
							local1003 = Static83.aFloat58;
							local1500 = Static230.aFloat183;
							Static142.method2683(local1579, local1618, local1567, local1571, local1592, arg1.anIntArray381[local1563], arg1.anIntArray379[local1563], local1575, local1584, arg1.anIntArray388[local1563], local1512, local1610);
							local995 = Static83.aFloat58;
							local1011 = Static230.aFloat183;
						} else if (local1546 == 3) {
							Static192.method3218(arg1.anIntArray388[local1553], arg1.anIntArray379[local1553], local1575, local1592, local1567, local1579, arg1.anIntArray381[local1553], local1571, local1584);
							local1496 = Static499.aFloat349;
							local1498 = Static169.aFloat161;
							Static192.method3218(arg1.anIntArray388[local1558], arg1.anIntArray379[local1558], local1575, local1592, local1567, local1579, arg1.anIntArray381[local1558], local1571, local1584);
							local1500 = Static499.aFloat349;
							local1003 = Static169.aFloat161;
							Static192.method3218(arg1.anIntArray388[local1563], arg1.anIntArray379[local1563], local1575, local1592, local1567, local1579, arg1.anIntArray381[local1563], local1571, local1584);
							local995 = Static169.aFloat161;
							local1011 = Static499.aFloat349;
							if ((local1584 & 0x1) == 0) {
								if (local1011 - local1496 > 0.5F) {
									local1011--;
									local1510 = 1;
								} else if (local1496 - local1011 > 0.5F) {
									local1011++;
									local1510 = 2;
								}
								if (local1500 - local1496 > 0.5F) {
									local1500--;
									local1508 = 1;
								} else if (local1496 - local1500 > 0.5F) {
									local1500++;
									local1508 = 2;
								}
							} else {
								if (local995 - local1498 > 0.5F) {
									local995--;
									local1510 = 1;
								} else if (local1498 - local995 > 0.5F) {
									local995++;
									local1510 = 2;
								}
								if (local1003 - local1498 > 0.5F) {
									local1003--;
									local1508 = 1;
								} else if (local1498 - local1003 > 0.5F) {
									local1003++;
									local1508 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray77 == null) {
				local1546 = 0;
			} else {
				local1546 = arg1.aByteArray77[local1449];
			}
			if (local1546 == 0) {
				@Pc(2816) long local2816 = ((long) local738 + (long) (local1456 << 8) + (long) (local1512 << 24) << 32) + (long) (local1164 << 2);
				local1563 = arg1.aShortArray78[local1449];
				local2307 = arg1.aShortArray74[local1449];
				local2312 = arg1.aShortArray75[local1449];
				@Pc(2835) Class224 local2835 = local439[local1563];
				this.aShortArray62[local1443] = this.method4486(local2835.anInt6770, arg1, local1563, local2816, local2835.anInt6771, local1496, local1498, local2835.anInt6769, local2835.anInt6768);
				@Pc(2859) Class224 local2859 = local439[local2307];
				this.aShortArray72[local1443] = this.method4486(local2859.anInt6770, arg1, local2307, (long) local1508 + local2816, local2859.anInt6771, local1500, local1003, local2859.anInt6769, local2859.anInt6768);
				@Pc(2886) Class224 local2886 = local439[local2312];
				this.aShortArray64[local1443] = this.method4486(local2886.anInt6770, arg1, local2312, (long) local1510 + local2816, local2886.anInt6771, local1011, local995, local2886.anInt6769, local2886.anInt6768);
			} else if (local1546 == 1) {
				@Pc(2679) Class45 local2679 = local1123[local1449];
				@Pc(2722) long local2722 = (long) ((local2679.anInt1178 + 256 << 22) + ((local1164 << 2) + (local2679.anInt1175 > 0 ? 1024 : 2048)) + (local2679.anInt1177 + 256 << 12)) + ((long) (local1456 << 8) + (long) (local1512 << 24) + (long) local738 << 32);
				this.aShortArray62[local1443] = this.method4486(local2679.anInt1175, arg1, arg1.aShortArray78[local1449], local2722, 0, local1496, local1498, local2679.anInt1177, local2679.anInt1178);
				this.aShortArray72[local1443] = this.method4486(local2679.anInt1175, arg1, arg1.aShortArray74[local1449], (long) local1508 + local2722, 0, local1500, local1003, local2679.anInt1177, local2679.anInt1178);
				this.aShortArray64[local1443] = this.method4486(local2679.anInt1175, arg1, arg1.aShortArray75[local1449], local2722 + (long) local1510, 0, local1011, local995, local2679.anInt1177, local2679.anInt1178);
			}
			if (arg1.aShortArray80 == null) {
				this.aShortArray71[local1443] = -1;
			} else {
				this.aShortArray71[local1443] = arg1.aShortArray80[local1449];
			}
			if (arg1.aByteArray78 != null) {
				this.aByteArray70[local1443] = arg1.aByteArray78[local1449];
			}
			if (arg1.aShortArray81 != null) {
				this.aShortArray65[local1443] = arg1.aShortArray81[local1449];
			}
			this.aShortArray69[local1443] = arg1.aShortArray73[local1449];
		}
		local1449 = 0;
		local1142 = -10000;
		for (local1153 = 0; local1153 < this.anInt5352; local1153++) {
			@Pc(2979) short local2979 = this.aShortArray71[local1153];
			if (local2979 != local1142) {
				local1142 = local2979;
				local1449++;
			}
		}
		this.anIntArray363 = new int[local1449 + 1];
		local1449 = 0;
		local1142 = -10000;
		for (local1164 = 0; local1164 < this.anInt5352; local1164++) {
			@Pc(3013) short local3013 = this.aShortArray71[local1164];
			if (local1142 != local3013) {
				this.anIntArray363[local1449++] = local1164;
				local1142 = local3013;
			}
		}
		this.anIntArray363[local1449] = this.anInt5352;
		Static13.aLongArray2 = null;
		this.aShortArray63 = Static437.method6225(this.anInt5301, this.aShortArray63);
		this.aShortArray67 = Static437.method6225(this.anInt5301, this.aShortArray67);
		this.aShortArray68 = Static437.method6225(this.anInt5301, this.aShortArray68);
		this.aByteArray71 = Static488.method5186(this.anInt5301, this.aByteArray71);
		this.aFloatArray40 = Static468.method6573(this.aFloatArray40, this.anInt5301);
		this.aFloatArray39 = Static468.method6573(this.aFloatArray39, this.anInt5301);
		if (arg1.anIntArray378 != null && Static484.method7247(arg2, this.anInt5357)) {
			this.anIntArrayArray36 = arg1.method4525(false);
		}
		if (arg1.aClass21Array1 != null && Static339.method5288(arg2, this.anInt5357)) {
			this.anIntArrayArray35 = arg1.method4529();
		}
		if (arg1.anIntArray382 != null && Static361.method5533(this.anInt5357, arg2)) {
			local738 = 0;
			@Pc(3136) int[] local3136 = new int[256];
			for (local783 = 0; local783 < this.anInt5323; local783++) {
				local797 = arg1.anIntArray382[local106[local783]];
				if (local797 >= 0) {
					@Pc(3156) int local3156 = local3136[local797]++;
					if (local738 < local797) {
						local738 = local797;
					}
				}
			}
			this.anIntArrayArray34 = new int[local738 + 1][];
			for (local797 = 0; local797 <= local738; local797++) {
				this.anIntArrayArray34[local797] = new int[local3136[local797]];
				local3136[local797] = 0;
			}
			for (local799 = 0; local799 < this.anInt5323; local799++) {
				local1226 = arg1.anIntArray382[local106[local799]];
				if (local1226 >= 0) {
					this.anIntArrayArray34[local1226][local3136[local1226]++] = local799;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIBII)Z")
	private boolean method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg4 && arg6 > arg2 && arg2 < arg7) {
			return false;
		} else if (arg4 < arg2 && arg2 > arg6 && arg7 < arg2) {
			return false;
		} else if (arg0 < arg1 && arg0 < arg5 && arg3 > arg0) {
			return false;
		} else {
			return arg1 >= arg0 || arg5 >= arg0 || arg3 >= arg0;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()Z")
	@Override
	public boolean method7353() {
		if (this.aShortArray71 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray71.length; local12++) {
			if (this.aShortArray71[local12] != -1 && !this.aClass62_Sub3_17.anInterface8_145.method7236(this.aShortArray71[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5323; local3++) {
			local12 = this.aShortArray69[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 -= -(arg3 * (arg2 - local28) >> 7);
			}
			this.aShortArray69[local3] = (short) (local28 | local18 << 10 | local24 << 7);
		}
		if (this.aClass319Array1 != null) {
			for (local12 = 0; local12 < this.anInt5325; local12++) {
				@Pc(111) Class319 local111 = this.aClass319Array1[local12];
				@Pc(116) Class64 local116 = this.aClass64Array1[local12];
				local116.anInt2121 = Static444.anIntArray587[this.aShortArray69[local111.anInt9132] & 0xFFFF] & 0xFFFFFF | local116.anInt2121 & 0xFF000000;
			}
		}
		if (this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!ec;)V")
	private void method4477(@OriginalArg(1) Class5_Sub2_Sub13_Sub1 arg0) {
		if (this.aClass62_Sub3_17.anIntArray302.length < this.anInt5301) {
			this.aClass62_Sub3_17.anIntArray301 = new int[this.anInt5301];
			this.aClass62_Sub3_17.anIntArray302 = new int[this.anInt5301];
		}
		@Pc(28) int[] local28 = this.aClass62_Sub3_17.anIntArray302;
		@Pc(32) int[] local32 = this.aClass62_Sub3_17.anIntArray301;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(40) int local40 = 0; local40 < this.anInt5316; local40++) {
			local65 = (this.anIntArray362[local40] - (this.aClass62_Sub3_17.anInt4665 * this.anIntArray366[local40] >> 8) >> this.aClass62_Sub3_17.anInt4622) - arg0.anInt2326;
			@Pc(90) int local90 = (this.anIntArray365[local40] - (this.anIntArray366[local40] * this.aClass62_Sub3_17.anInt4643 >> 8) >> this.aClass62_Sub3_17.anInt4622) - arg0.anInt2324;
			@Pc(95) int local95 = this.anIntArray361[local40];
			@Pc(102) int local102 = this.anIntArray361[local40 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray66[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local28[local113] = local65;
				local32[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt5352; local65++) {
			if (this.aByteArray70 == null || this.aByteArray70[local65] <= 128) {
				@Pc(155) short local155 = this.aShortArray62[local65];
				@Pc(160) short local160 = this.aShortArray72[local65];
				@Pc(165) short local165 = this.aShortArray64[local65];
				local104 = local28[local155];
				local113 = local28[local160];
				@Pc(177) int local177 = local28[local165];
				@Pc(181) int local181 = local32[local155];
				@Pc(185) int local185 = local32[local160];
				@Pc(189) int local189 = local32[local165];
				if (-((local185 - local181) * (-local113 + local177)) + (local104 - local113) * (local185 - local189) > 0) {
					arg0.method2144(local113, local104, local185, local189, local177, local181);
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort74;
	}

	@OriginalMember(owner = "client!la", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class5_Sub2_Sub13 EA(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		if (this.anInt5301 == 0) {
			return null;
		}
		if (!this.aBoolean370) {
			this.method4480();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass62_Sub3_17.anInt4665 > 0) {
			local40 = this.aShort71 - (this.aClass62_Sub3_17.anInt4665 * this.aShort75 >> 8) >> this.aClass62_Sub3_17.anInt4622;
			local56 = this.aShort78 - (this.aShort70 * this.aClass62_Sub3_17.anInt4665 >> 8) >> this.aClass62_Sub3_17.anInt4622;
		} else {
			local40 = this.aShort71 - (this.aShort70 * this.aClass62_Sub3_17.anInt4665 >> 8) >> this.aClass62_Sub3_17.anInt4622;
			local56 = this.aShort78 - (this.aShort75 * this.aClass62_Sub3_17.anInt4665 >> 8) >> this.aClass62_Sub3_17.anInt4622;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass62_Sub3_17.anInt4643 <= 0) {
			local113 = this.aShort76 - (this.aShort70 * this.aClass62_Sub3_17.anInt4643 >> 8) >> this.aClass62_Sub3_17.anInt4622;
			local129 = this.aShort72 - (this.aShort75 * this.aClass62_Sub3_17.anInt4643 >> 8) >> this.aClass62_Sub3_17.anInt4622;
		} else {
			local113 = this.aShort76 - (this.aClass62_Sub3_17.anInt4643 * this.aShort75 >> 8) >> this.aClass62_Sub3_17.anInt4622;
			local129 = this.aShort72 - (this.aShort70 * this.aClass62_Sub3_17.anInt4643 >> 8) >> this.aClass62_Sub3_17.anInt4622;
		}
		@Pc(171) int local171 = local56 + 1 - local40;
		@Pc(178) int local178 = local129 + 1 - local113;
		@Pc(181) Class5_Sub2_Sub13_Sub1 local181 = (Class5_Sub2_Sub13_Sub1) arg0;
		@Pc(197) Class5_Sub2_Sub13_Sub1 local197;
		if (local181 != null && local181.method2142(local178, local171)) {
			local197 = local181;
			local181.method2143();
		} else {
			local197 = new Class5_Sub2_Sub13_Sub1(this.aClass62_Sub3_17, local171, local178);
		}
		local197.method2141(local40, local56, local129, local113);
		this.method4477(local197);
		return local197;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class36 method7356(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class36_Sub2 local18;
		@Pc(14) Class36_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass62_Sub3_17.aClass36_Sub2_7;
			local18 = this.aClass62_Sub3_17.aClass36_Sub2_3;
		} else if (arg0 == 2) {
			local18 = this.aClass62_Sub3_17.aClass36_Sub2_2;
			local14 = this.aClass62_Sub3_17.aClass36_Sub2_4;
		} else if (arg0 == 3) {
			local18 = this.aClass62_Sub3_17.aClass36_Sub2_9;
			local14 = this.aClass62_Sub3_17.aClass36_Sub2_6;
		} else if (arg0 == 4) {
			local14 = this.aClass62_Sub3_17.aClass36_Sub2_5;
			local18 = this.aClass62_Sub3_17.aClass36_Sub2_10;
		} else if (arg0 == 5) {
			local18 = this.aClass62_Sub3_17.aClass36_Sub2_8;
			local14 = this.aClass62_Sub3_17.aClass36_Sub2_1;
		} else {
			local18 = local14 = new Class36_Sub2(this.aClass62_Sub3_17);
		}
		return this.method4484(arg2, arg1, arg0 != 0, local14, local18);
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!la", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort77;
	}

	@OriginalMember(owner = "client!la", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5316; local15++) {
			@Pc(33) int local33 = this.anIntArray362[local15] * local13 + local9 * this.anIntArray365[local15] >> 15;
			this.anIntArray365[local15] = this.anIntArray365[local15] * local13 - local9 * this.anIntArray362[local15] >> 15;
			this.anIntArray362[local15] = local33;
		}
		this.aBoolean370 = false;
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	private void method4479() {
		if (this.aClass319Array1 == null) {
			return;
		}
		@Pc(20) Class78_Sub3 local20 = this.aClass62_Sub3_17.aClass78_Sub3_2;
		@Pc(24) float local24 = this.aClass62_Sub3_17.ra();
		@Pc(28) float local28 = this.aClass62_Sub3_17.P();
		this.aClass62_Sub3_17.method3987();
		this.aClass62_Sub3_17.method7022(false);
		this.aClass62_Sub3_17.method3970(false);
		this.aClass62_Sub3_17.method4000(this.aClass62_Sub3_17.aClass19_7, null, null, this.aClass62_Sub3_17.aClass19_8);
		for (@Pc(55) int local55 = 0; local55 < this.anInt5325; local55++) {
			@Pc(62) Class319 local62 = this.aClass319Array1[local55];
			@Pc(67) Class64 local67 = this.aClass64Array1[local55];
			if (!local62.aBoolean670 || !this.aClass62_Sub3_17.method7031()) {
				@Pc(95) float local95 = (float) (this.anIntArray362[local62.anInt9136] + this.anIntArray362[local62.anInt9135] + this.anIntArray362[local62.anInt9129]) * 0.3333333F;
				@Pc(118) float local118 = (float) (this.anIntArray366[local62.anInt9135] + this.anIntArray366[local62.anInt9129] + this.anIntArray366[local62.anInt9136]) * 0.3333333F;
				@Pc(139) float local139 = (float) (this.anIntArray365[local62.anInt9136] + this.anIntArray365[local62.anInt9129] + this.anIntArray365[local62.anInt9135]) * 0.3333333F;
				@Pc(153) float local153 = Static453.aFloat328 + local139 * Static61.aFloat40 + Static161.aFloat157 * local95 + Static419.aFloat314 * local118;
				@Pc(167) float local167 = Static223.aFloat177 * local139 + local95 * Static189.aFloat208 + Static196.aFloat169 * local118 + Static524.aFloat360;
				@Pc(181) float local181 = Static359.aFloat292 + local95 * Static517.aFloat357 + Static281.aFloat225 * local118 + local139 * Static356.aFloat279;
				local20.method5519(local67.anInt2126, local67.anInt2127 * local62.aShort127 >> 7, local62.aShort125 * local67.anInt2120 >> 7, local153 + (float) local67.anInt2118, -local167 + (float) local67.anInt2117, -local181);
				this.aClass62_Sub3_17.method3993(local20);
				this.aClass62_Sub3_17.la(local28, local24 - (float) local62.anInt9131 * 1.5F);
				@Pc(232) int local232 = local67.anInt2121;
				OpenGL.glColor4ub((byte) (local232 >> 16), (byte) (local232 >> 8), (byte) local232, (byte) (local232 >> 24));
				this.aClass62_Sub3_17.method3933(local62.aShort126);
				this.aClass62_Sub3_17.method3979(local62.aByte109);
				this.aClass62_Sub3_17.method3999(local62.aByte108);
				this.aClass62_Sub3_17.method3957(4);
			}
		}
		this.aClass62_Sub3_17.la(local28, local24);
		this.aClass62_Sub3_17.method7022(true);
		this.aClass62_Sub3_17.method3958();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	private void method4480() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5316; local23++) {
			@Pc(30) int local30 = this.anIntArray362[local23];
			@Pc(35) int local35 = this.anIntArray366[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(49) int local49 = this.anIntArray365[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local11 > local49) {
				local11 = local49;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			@Pc(95) int local95 = local30 * local30 + local49 * local49;
			if (local95 > local19) {
				local19 = local95;
			}
			local95 = local35 * local35 + local49 * local49 + local30 * local30;
			if (local21 < local95) {
				local21 = local95;
			}
		}
		this.aShort75 = (short) local15;
		this.aShort71 = (short) local7;
		this.aShort78 = (short) local13;
		this.aShort76 = (short) local11;
		this.aShort72 = (short) local17;
		this.aShort70 = (short) local9;
		this.aShort73 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!la", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()[Lclient!on;")
	@Override
	public Class223[] method7350() {
		return this.aClass223Array3;
	}

	@OriginalMember(owner = "client!la", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static533.anInt8989 = 0;
			local26 = 0;
			Static404.anInt7234 = 0;
			Static503.anInt8596 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray36.length) {
					local48 = this.anIntArrayArray36[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static503.anInt8596 += this.anIntArray362[local56];
						Static533.anInt8989 += this.anIntArray366[local56];
						local26++;
						Static404.anInt7234 += this.anIntArray365[local56];
					}
				}
			}
			if (local26 <= 0) {
				Static533.anInt8989 = local18;
				Static503.anInt8596 = local14;
				Static404.anInt7234 = local22;
			} else {
				Static404.anInt7234 = Static404.anInt7234 / local26 + local22;
				Static503.anInt8596 = local14 + Static503.anInt8596 / local26;
				Static533.anInt8989 = local18 + Static533.anInt8989 / local26;
			}
			return;
		}
		@Pc(160) int[] local160;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local22 = arg4 << 4;
			local18 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray36.length) {
					local160 = this.anIntArrayArray36[local32];
					for (local162 = 0; local162 < local160.length; local162++) {
						local50 = local160[local162];
						this.anIntArray362[local50] += local14;
						this.anIntArray366[local50] += local18;
						this.anIntArray365[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(296) int local296;
		@Pc(754) int local754;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray36.length > local32) {
					local160 = this.anIntArrayArray36[local32];
					if ((arg5 & 0x1) == 0) {
						for (local162 = 0; local162 < local160.length; local162++) {
							local50 = local160[local162];
							this.anIntArray362[local50] -= Static503.anInt8596;
							this.anIntArray366[local50] -= Static533.anInt8989;
							this.anIntArray365[local50] -= Static404.anInt7234;
							if (arg4 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg4];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg4];
								local296 = local56 * this.anIntArray366[local50] + this.anIntArray362[local50] * local277 + 32767 >> 15;
								this.anIntArray366[local50] = local277 * this.anIntArray366[local50] + 32767 - local56 * this.anIntArray362[local50] >> 15;
								this.anIntArray362[local50] = local296;
							}
							if (arg2 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg2];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg2];
								local296 = local277 * this.anIntArray366[local50] + 32767 - this.anIntArray365[local50] * local56 >> 15;
								this.anIntArray365[local50] = this.anIntArray365[local50] * local277 + this.anIntArray366[local50] * local56 + 32767 >> 15;
								this.anIntArray366[local50] = local296;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg3];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg3];
								local296 = this.anIntArray365[local50] * local56 + this.anIntArray362[local50] * local277 + 32767 >> 15;
								this.anIntArray365[local50] = this.anIntArray365[local50] * local277 + 32767 - local56 * this.anIntArray362[local50] >> 15;
								this.anIntArray362[local50] = local296;
							}
							this.anIntArray362[local50] += Static503.anInt8596;
							this.anIntArray366[local50] += Static533.anInt8989;
							this.anIntArray365[local50] += Static404.anInt7234;
						}
					} else {
						for (local162 = 0; local162 < local160.length; local162++) {
							local50 = local160[local162];
							this.anIntArray362[local50] -= Static503.anInt8596;
							this.anIntArray366[local50] -= Static533.anInt8989;
							this.anIntArray365[local50] -= Static404.anInt7234;
							if (arg2 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg2];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg2];
								local296 = local277 * this.anIntArray366[local50] + 32767 - this.anIntArray365[local50] * local56 >> 15;
								this.anIntArray365[local50] = local277 * this.anIntArray365[local50] + local56 * this.anIntArray366[local50] + 32767 >> 15;
								this.anIntArray366[local50] = local296;
							}
							if (arg4 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg4];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg4];
								local296 = this.anIntArray366[local50] * local56 + local277 * this.anIntArray362[local50] + 32767 >> 15;
								this.anIntArray366[local50] = this.anIntArray366[local50] * local277 + 32767 - local56 * this.anIntArray362[local50] >> 15;
								this.anIntArray362[local50] = local296;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub2_Sub16.anIntArray411[arg3];
								local277 = Class5_Sub2_Sub16.anIntArray410[arg3];
								local296 = this.anIntArray365[local50] * local56 + local277 * this.anIntArray362[local50] + 32767 >> 15;
								this.anIntArray365[local50] = this.anIntArray365[local50] * local277 + 32767 - local56 * this.anIntArray362[local50] >> 15;
								this.anIntArray362[local50] = local296;
							}
							this.anIntArray362[local50] += Static503.anInt8596;
							this.anIntArray366[local50] += Static533.anInt8989;
							this.anIntArray365[local50] += Static404.anInt7234;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray36.length > local38) {
						local48 = this.anIntArrayArray36[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local277 = this.anIntArray361[local56];
							local296 = this.anIntArray361[local56 + 1];
							for (local754 = local277; local754 < local296; local754++) {
								@Pc(763) int local763 = this.aShortArray66[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local772 = Class5_Sub2_Sub16.anIntArray411[arg4];
									local776 = Class5_Sub2_Sub16.anIntArray410[arg4];
									local794 = local776 * this.aShortArray63[local763] + local772 * this.aShortArray67[local763] + 32767 >> 15;
									this.aShortArray67[local763] = (short) (local776 * this.aShortArray67[local763] + 32767 - this.aShortArray63[local763] * local772 >> 15);
									this.aShortArray63[local763] = (short) local794;
								}
								if (arg2 != 0) {
									local772 = Class5_Sub2_Sub16.anIntArray411[arg2];
									local776 = Class5_Sub2_Sub16.anIntArray410[arg2];
									local794 = local776 * this.aShortArray67[local763] + 32767 - local772 * this.aShortArray68[local763] >> 15;
									this.aShortArray68[local763] = (short) (this.aShortArray68[local763] * local776 + this.aShortArray67[local763] * local772 + 32767 >> 15);
									this.aShortArray67[local763] = (short) local794;
								}
								if (arg3 != 0) {
									local772 = Class5_Sub2_Sub16.anIntArray411[arg3];
									local776 = Class5_Sub2_Sub16.anIntArray410[arg3];
									local794 = this.aShortArray68[local763] * local772 + local776 * this.aShortArray63[local763] + 32767 >> 15;
									this.aShortArray68[local763] = (short) (this.aShortArray68[local763] * local776 + 32767 - this.aShortArray63[local763] * local772 >> 15);
									this.aShortArray63[local763] = (short) local794;
								}
							}
						}
					}
				}
				if (this.aClass19_9 == null && this.aClass19_12 != null) {
					this.aClass19_12.anInterface11_1 = null;
				}
				if (this.aClass19_9 != null) {
					this.aClass19_9.anInterface11_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray36.length) {
					local160 = this.anIntArrayArray36[local32];
					for (local162 = 0; local162 < local160.length; local162++) {
						local50 = local160[local162];
						this.anIntArray362[local50] -= Static503.anInt8596;
						this.anIntArray366[local50] -= Static533.anInt8989;
						this.anIntArray365[local50] -= Static404.anInt7234;
						this.anIntArray362[local50] = arg2 * this.anIntArray362[local50] >> 7;
						this.anIntArray366[local50] = arg3 * this.anIntArray366[local50] >> 7;
						this.anIntArray365[local50] = arg4 * this.anIntArray365[local50] >> 7;
						this.anIntArray362[local50] += Static503.anInt8596;
						this.anIntArray366[local50] += Static533.anInt8989;
						this.anIntArray365[local50] += Static404.anInt7234;
					}
				}
			}
		} else {
			@Pc(1197) Class319 local1197;
			@Pc(1202) Class64 local1202;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray34.length > local32) {
							local160 = this.anIntArrayArray34[local32];
							for (local162 = 0; local162 < local160.length; local162++) {
								local50 = local160[local162];
								local56 = arg2 * 8 + (this.aByteArray70[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray70[local50] = (byte) local56;
							}
							if (local160.length > 0 && this.aClass19_12 != null) {
								this.aClass19_12.anInterface11_1 = null;
							}
						}
					}
					if (this.aClass319Array1 != null) {
						for (local32 = 0; local32 < this.anInt5325; local32++) {
							local1197 = this.aClass319Array1[local32];
							local1202 = this.aClass64Array1[local32];
							local1202.anInt2121 = local1202.anInt2121 & 0xFFFFFF | 255 - (this.aByteArray70[local1197.anInt9132] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1440) Class64 local1440;
				if (arg0 == 8) {
					if (this.anIntArrayArray35 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray35.length > local32) {
								local160 = this.anIntArrayArray35[local32];
								for (local162 = 0; local162 < local160.length; local162++) {
									local1440 = this.aClass64Array1[local160[local162]];
									local1440.anInt2117 += arg3;
									local1440.anInt2118 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray35 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray35.length > local32) {
								local160 = this.anIntArrayArray35[local32];
								for (local162 = 0; local162 < local160.length; local162++) {
									local1440 = this.aClass64Array1[local160[local162]];
									local1440.anInt2127 = arg3 * local1440.anInt2127 >> 7;
									local1440.anInt2120 = local1440.anInt2120 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray35.length > local32) {
							local160 = this.anIntArrayArray35[local32];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1440 = this.aClass64Array1[local160[local162]];
								local1440.anInt2126 = local1440.anInt2126 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray34.length) {
						local160 = this.anIntArrayArray34[local32];
						for (local162 = 0; local162 < local160.length; local162++) {
							local50 = local160[local162];
							local56 = this.aShortArray69[local50] & 0xFFFF;
							local277 = local56 >> 10 & 0x3F;
							local296 = local56 >> 7 & 0x7;
							local754 = local56 & 0x7F;
							@Pc(1291) int local1291 = local277 + arg2 & 0x3F;
							local296 += arg3 / 4;
							if (local296 < 0) {
								local296 = 0;
							} else if (local296 > 7) {
								local296 = 7;
							}
							local754 += arg4;
							if (local754 < 0) {
								local754 = 0;
							} else if (local754 > 127) {
								local754 = 127;
							}
							this.aShortArray69[local50] = (short) (local296 << 7 | local1291 << 10 | local754);
						}
						if (local160.length > 0 && this.aClass19_12 != null) {
							this.aClass19_12.anInterface11_1 = null;
						}
					}
				}
				if (this.aClass319Array1 != null) {
					for (local32 = 0; local32 < this.anInt5325; local32++) {
						local1197 = this.aClass319Array1[local32];
						local1202 = this.aClass64Array1[local32];
						local1202.anInt2121 = local1202.anInt2121 & 0xFF000000 | Static444.anIntArray587[this.aShortArray69[local1197.anInt9132] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V")
	private void method4481(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass19_12 != null && this.aClass19_12.anInterface11_1 == null;
		@Pc(27) boolean local27 = this.aClass19_9 != null && this.aClass19_9.anInterface11_1 == null;
		@Pc(38) boolean local38 = this.aClass19_10 != null && this.aClass19_10.anInterface11_1 == null;
		@Pc(49) boolean local49 = this.aClass19_11 != null && this.aClass19_11.anInterface11_1 == null;
		if (arg0) {
			local27 &= (this.aByte54 & 0x4) != 0;
			local16 &= (this.aByte54 & 0x2) != 0;
			local49 &= (this.aByte54 & 0x8) != 0;
			local38 &= (this.aByte54 & 0x1) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local123 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3.aByteArray66.length >= local106 * this.anInt5301) {
			this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3.anInt4960 = 0;
		} else {
			this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3 = new Class5_Sub3_Sub2(local106 * (this.anInt5301 + 100));
		}
		@Pc(193) Class5_Sub3_Sub2 local193 = this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local38) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass62_Sub3_17.aBoolean278) {
				for (local201 = 0; local201 < this.anInt5316; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.anIntArray362[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray366[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray365[local201]);
					local229 = this.anIntArray361[local201];
					local236 = this.anIntArray361[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray66[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt4960 = local247 * local106;
						local193.method4184(local210);
						local193.method4184(local217);
						local193.method4184(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt5316; local201++) {
					local210 = Stream.floatToRawIntBits((float) this.anIntArray362[local201]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray366[local201]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray365[local201]);
					local229 = this.anIntArray361[local201];
					local236 = this.anIntArray361[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray66[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt4960 = local106 * local247;
						local193.method4191(local210);
						local193.method4191(local217);
						local193.method4191(local224);
					}
				}
			}
		}
		@Pc(492) float local492;
		@Pc(385) short[] local385;
		@Pc(388) short[] local388;
		@Pc(379) short[] local379;
		@Pc(382) byte[] local382;
		@Pc(539) float local539;
		if (local16) {
			if (this.aClass19_9 == null) {
				if (this.aClass159_1 == null) {
					local379 = this.aShortArray68;
					local382 = this.aByteArray71;
					local385 = this.aShortArray63;
					local388 = this.aShortArray67;
				} else {
					local388 = this.aClass159_1.aShortArray44;
					local382 = this.aClass159_1.aByteArray55;
					local379 = this.aClass159_1.aShortArray43;
					local385 = this.aClass159_1.aShortArray45;
				}
				@Pc(412) float local412 = this.aClass62_Sub3_17.aFloatArray34[0];
				@Pc(418) float local418 = this.aClass62_Sub3_17.aFloatArray34[1];
				@Pc(424) float local424 = this.aClass62_Sub3_17.aFloatArray34[2];
				@Pc(428) float local428 = this.aClass62_Sub3_17.aFloat191;
				@Pc(438) float local438 = this.aClass62_Sub3_17.aFloat206 * 768.0F / (float) this.aShort74;
				@Pc(448) float local448 = this.aClass62_Sub3_17.aFloat200 * 768.0F / (float) this.aShort74;
				for (@Pc(450) int local450 = 0; local450 < this.anInt5323; local450++) {
					@Pc(470) int local470 = this.method4487(this.aShortArray71[local450], this.aShortArray69[local450], this.aShort77, this.aByteArray70[local450]);
					@Pc(481) float local481 = this.aClass62_Sub3_17.aFloat190 * (float) (local470 >> 8 & 0xFF);
					local492 = (float) (local470 >> 16 & 0xFF) * this.aClass62_Sub3_17.aFloat185;
					@Pc(497) short local497 = this.aShortArray62[local450];
					@Pc(506) float local506 = this.aClass62_Sub3_17.aFloat204 * (float) (local470 >>> 24);
					@Pc(511) short local511 = (short) local382[local497];
					if (local511 == 0) {
						local539 = (local412 * (float) local385[local497] + (float) local388[local497] * local418 + local424 * (float) local379[local497]) * 0.0026041667F;
					} else {
						local539 = ((float) local388[local497] * local418 + local412 * (float) local385[local497] + (float) local379[local497] * local424) / (float) (local511 * 256);
					}
					@Pc(576) float local576 = (local539 < 0.0F ? local448 : local438) * local539 + local428;
					@Pc(581) int local581 = (int) (local506 * local576);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					@Pc(602) int local602 = (int) (local576 * local492);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					@Pc(618) int local618 = (int) (local576 * local481);
					local193.anInt4960 = local497 * local106 + local110;
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local193.method4192(local581);
					local193.method4192(local602);
					local193.method4192(local618);
					local193.method4192(255 - (this.aByteArray70[local450] & 0xFF));
					local497 = this.aShortArray72[local450];
					local511 = local382[local497];
					if (local511 == 0) {
						local539 = ((float) local379[local497] * local424 + (float) local385[local497] * local412 + local418 * (float) local388[local497]) * 0.0026041667F;
					} else {
						local539 = (local424 * (float) local379[local497] + (float) local388[local497] * local418 + (float) local385[local497] * local412) / (float) (local511 * 256);
					}
					local576 = (local539 < 0.0F ? local448 : local438) * local539 + local428;
					local581 = (int) (local506 * local576);
					local602 = (int) (local492 * local576);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					local618 = (int) (local576 * local481);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					local193.anInt4960 = local110 + local497 * local106;
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local193.method4192(local581);
					local193.method4192(local602);
					local193.method4192(local618);
					local193.method4192(255 - (this.aByteArray70[local450] & 0xFF));
					local497 = this.aShortArray64[local450];
					local511 = local382[local497];
					if (local511 == 0) {
						local539 = ((float) local379[local497] * local424 + (float) local385[local497] * local412 + (float) local388[local497] * local418) * 0.0026041667F;
					} else {
						local539 = (local418 * (float) local388[local497] + local412 * (float) local385[local497] + local424 * (float) local379[local497]) / (float) (local511 * 256);
					}
					local576 = (local539 < 0.0F ? local448 : local438) * local539 + local428;
					local581 = (int) (local576 * local506);
					local602 = (int) (local576 * local492);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					local618 = (int) (local481 * local576);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					if (local618 < 0) {
						local618 = 0;
					} else if (local618 > 255) {
						local618 = 255;
					}
					local193.anInt4960 = local110 + local106 * local497;
					local193.method4192(local581);
					local193.method4192(local602);
					local193.method4192(local618);
					local193.method4192(255 - (this.aByteArray70[local450] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt5323; local201++) {
					local210 = this.method4487(this.aShortArray71[local201], this.aShortArray69[local201], this.aShort77, this.aByteArray70[local201]);
					local193.anInt4960 = local110 + this.aShortArray62[local201] * local106;
					local193.method4184(local210);
					local193.anInt4960 = local110 + local106 * this.aShortArray72[local201];
					local193.method4184(local210);
					local193.anInt4960 = local110 + local106 * this.aShortArray64[local201];
					local193.method4184(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass159_1 == null) {
				local382 = this.aByteArray71;
				local385 = this.aShortArray63;
				local388 = this.aShortArray67;
				local379 = this.aShortArray68;
			} else {
				local379 = this.aClass159_1.aShortArray43;
				local388 = this.aClass159_1.aShortArray44;
				local385 = this.aClass159_1.aShortArray45;
				local382 = this.aClass159_1.aByteArray55;
			}
			@Pc(1124) float local1124 = 3.0F / (float) this.aShort74;
			local193.anInt4960 = local112;
			local539 = 3.0F / (float) (this.aShort74 / 2 + this.aShort74);
			if (this.aClass62_Sub3_17.aBoolean278) {
				for (local238 = 0; local238 < this.anInt5301; local238++) {
					local247 = local382[local238] & 0xFF;
					if (local247 == 0) {
						local193.method4236(local539 * (float) local385[local238]);
						local193.method4236(local539 * (float) local388[local238]);
						local193.method4236((float) local379[local238] * local539);
					} else {
						local492 = local1124 / (float) local247;
						local193.method4236(local492 * (float) local385[local238]);
						local193.method4236((float) local388[local238] * local492);
						local193.method4236(local492 * (float) local379[local238]);
					}
					local193.anInt4960 += local106 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt5301; local238++) {
					local247 = local382[local238] & 0xFF;
					if (local247 == 0) {
						local193.method4235(local539 * (float) local385[local238]);
						local193.method4235(local539 * (float) local388[local238]);
						local193.method4235(local539 * (float) local379[local238]);
					} else {
						local492 = local1124 / (float) local247;
						local193.method4235(local492 * (float) local385[local238]);
						local193.method4235((float) local388[local238] * local492);
						local193.method4235((float) local379[local238] * local492);
					}
					local193.anInt4960 += local106 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt4960 = local123;
			if (this.aClass62_Sub3_17.aBoolean278) {
				for (local201 = 0; local201 < this.anInt5301; local201++) {
					local193.method4236(this.aFloatArray40[local201]);
					local193.method4236(this.aFloatArray39[local201]);
					local193.anInt4960 += local106 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt5301; local201++) {
					local193.method4235(this.aFloatArray40[local201]);
					local193.method4235(this.aFloatArray39[local201]);
					local193.anInt4960 += local106 - 8;
				}
			}
		}
		local193.anInt4960 = this.anInt5301 * local106;
		@Pc(1433) Interface11 local1433;
		if (arg0) {
			if (this.anInterface11_6 == null) {
				this.anInterface11_6 = this.aClass62_Sub3_17.method3964(local193.aByteArray66, true, local106, local193.anInt4960);
			} else {
				this.anInterface11_6.method5918(local106, local193.aByteArray66, local193.anInt4960);
			}
			local1433 = this.anInterface11_6;
			this.aByte54 = 0;
		} else {
			local1433 = this.aClass62_Sub3_17.method3964(local193.aByteArray66, false, local106, local193.anInt4960);
			this.aBoolean371 = true;
		}
		if (local38) {
			this.aClass19_10.anInterface11_1 = local1433;
			this.aClass19_10.aByte1 = 0;
		}
		if (local49) {
			this.aClass19_11.anInterface11_1 = local1433;
			this.aClass19_11.aByte1 = local123;
		}
		if (local16) {
			this.aClass19_12.anInterface11_1 = local1433;
			this.aClass19_12.aByte1 = local110;
		}
		if (local27) {
			this.aClass19_9.aByte1 = local112;
			this.aClass19_9.anInterface11_1 = local1433;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()[Lclient!tf;")
	@Override
	public Class280[] method7361() {
		return this.aClass280Array3;
	}

	@OriginalMember(owner = "client!la", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5316; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray366[local15] - local9 * this.anIntArray365[local15] >> 15;
			this.anIntArray365[local15] = local13 * this.anIntArray365[local15] + local9 * this.anIntArray366[local15] >> 15;
			this.anIntArray366[local15] = local34;
		}
		this.aBoolean370 = false;
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5316; local3++) {
			this.anIntArray365[local3] = -this.anIntArray365[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5301; local25++) {
			this.aShortArray68[local25] = (short) -this.aShortArray68[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5323; local44++) {
			@Pc(51) short local51 = this.aShortArray62[local44];
			this.aShortArray62[local44] = this.aShortArray64[local44];
			this.aShortArray64[local44] = local51;
		}
		if (this.aClass19_9 == null && this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
		if (this.aClass19_9 != null) {
			this.aClass19_9.anInterface11_1 = null;
		}
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
		this.aBoolean370 = false;
		if (this.aClass153_1 != null) {
			this.aClass153_1.anInterface6_2 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()V")
	@Override
	public void method7357() {
		if (this.anInt5301 <= 0 || this.anInt5352 <= 0) {
			return;
		}
		this.method4481(false);
		if ((this.aByte54 & 0x10) == 0 && this.aClass153_1.anInterface6_2 == null) {
			this.method4485(false);
		}
		this.method4489();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7349(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class36_Sub2 local8 = (Class36_Sub2) arg0;
		if (this.anInt5323 == 0 || local8.anInt5323 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5316;
		@Pc(27) int[] local27 = local8.anIntArray362;
		@Pc(30) int[] local30 = local8.anIntArray366;
		@Pc(33) int[] local33 = local8.anIntArray365;
		@Pc(36) short[] local36 = local8.aShortArray63;
		@Pc(39) short[] local39 = local8.aShortArray67;
		@Pc(42) short[] local42 = local8.aShortArray68;
		@Pc(45) byte[] local45 = local8.aByteArray71;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(60) short[] local60;
		@Pc(52) byte[] local52;
		if (this.aClass159_1 == null) {
			local60 = null;
			local56 = null;
			local52 = null;
			local64 = null;
		} else {
			local52 = this.aClass159_1.aByteArray55;
			local56 = this.aClass159_1.aShortArray45;
			local60 = this.aClass159_1.aShortArray43;
			local64 = this.aClass159_1.aShortArray44;
		}
		@Pc(85) short[] local85;
		@Pc(83) short[] local83;
		@Pc(81) short[] local81;
		@Pc(79) byte[] local79;
		if (local8.aClass159_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass159_1.aByteArray55;
			local85 = local8.aClass159_1.aShortArray45;
			local83 = local8.aClass159_1.aShortArray44;
			local81 = local8.aClass159_1.aShortArray43;
		}
		@Pc(106) int[] local106 = local8.anIntArray361;
		@Pc(109) short[] local109 = local8.aShortArray66;
		if (!local8.aBoolean370) {
			local8.method4480();
		}
		@Pc(118) short local118 = local8.aShort70;
		@Pc(121) short local121 = local8.aShort75;
		@Pc(124) short local124 = local8.aShort71;
		@Pc(127) short local127 = local8.aShort78;
		@Pc(130) short local130 = local8.aShort76;
		@Pc(133) short local133 = local8.aShort72;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5316; local135++) {
			@Pc(145) int local145 = this.anIntArray366[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray362[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(185) int local185 = this.anIntArray365[local135] - arg3;
					if (local130 <= local185 && local133 >= local185) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray361[local135];
						@Pc(215) int local215 = this.anIntArray361[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray66[local217] - 1;
							if (local203 == -1 || this.aByteArray71[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local24; local249++) {
								if (local165 == local27[local249] && local185 == local33[local249] && local30[local249] == local145) {
									local215 = local106[local249 + 1];
									local208 = local106[local249];
									@Pc(286) int local286 = -1;
									for (@Pc(288) int local288 = local208; local288 < local215; local288++) {
										local286 = local109[local288] - 1;
										if (local286 == -1 || local45[local286] != 0) {
											break;
										}
									}
									if (local286 != -1) {
										if (local56 == null) {
											this.aClass159_1 = new Class159();
											local56 = this.aClass159_1.aShortArray45 = Static149.method2769(this.aShortArray63);
											local64 = this.aClass159_1.aShortArray44 = Static149.method2769(this.aShortArray67);
											local60 = this.aClass159_1.aShortArray43 = Static149.method2769(this.aShortArray68);
											local52 = this.aClass159_1.aByteArray55 = Static51.method1070(this.aByteArray71);
										}
										if (local85 == null) {
											@Pc(365) Class159 local365 = local8.aClass159_1 = new Class159();
											local85 = local365.aShortArray45 = Static149.method2769(local36);
											local83 = local365.aShortArray44 = Static149.method2769(local39);
											local81 = local365.aShortArray43 = Static149.method2769(local42);
											local79 = local365.aByteArray55 = Static51.method1070(local45);
										}
										@Pc(398) short local398 = this.aShortArray63[local203];
										@Pc(403) short local403 = this.aShortArray67[local203];
										@Pc(408) short local408 = this.aShortArray68[local203];
										@Pc(413) byte local413 = this.aByteArray71[local203];
										local208 = local106[local249];
										local215 = local106[local249 + 1];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local208; local425 < local215; local425++) {
											local433 = local109[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local79[local433] != 0) {
												local85[local433] += local398;
												local83[local433] += local403;
												local81[local433] += local408;
												local79[local433] += local413;
											}
										}
										local398 = local36[local286];
										local413 = local45[local286];
										local408 = local42[local286];
										local208 = this.anIntArray361[local135];
										local215 = this.anIntArray361[local135 + 1];
										local403 = local39[local286];
										for (local433 = local208; local433 < local215; local433++) {
											@Pc(523) int local523 = this.aShortArray66[local433] - 1;
											if (local523 == -1) {
												break;
											}
											if (local52[local523] != 0) {
												local56[local523] += local398;
												local64[local523] += local403;
												local60[local523] += local408;
												local52[local523] += local413;
											}
										}
										if (this.aClass19_9 == null && this.aClass19_12 != null) {
											this.aClass19_12.anInterface11_1 = null;
										}
										if (this.aClass19_9 != null) {
											this.aClass19_9.anInterface11_1 = null;
										}
										if (local8.aClass19_9 == null && local8.aClass19_12 != null) {
											local8.aClass19_12.anInterface11_1 = null;
										}
										if (local8.aClass19_9 != null) {
											local8.aClass19_9.anInterface11_1 = null;
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

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static533.anInt8989 = 0;
			Static404.anInt7234 = 0;
			Static503.anInt8596 = 0;
			for (local20 = 0; local20 < this.anInt5316; local20++) {
				Static503.anInt8596 += this.anIntArray362[local20];
				Static533.anInt8989 += this.anIntArray366[local20];
				local12++;
				Static404.anInt7234 += this.anIntArray365[local20];
			}
			if (local12 > 0) {
				Static533.anInt8989 = Static533.anInt8989 / local12 + arg2;
				Static503.anInt8596 = arg1 + Static503.anInt8596 / local12;
				Static404.anInt7234 = arg3 + Static404.anInt7234 / local12;
			} else {
				Static533.anInt8989 = arg2;
				Static404.anInt7234 = arg3;
				Static503.anInt8596 = arg1;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt5316; local12++) {
				this.anIntArray362[local12] += arg1;
				this.anIntArray366[local12] += arg2;
				this.anIntArray365[local12] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt5316; local12++) {
					this.anIntArray362[local12] -= Static503.anInt8596;
					this.anIntArray366[local12] -= Static533.anInt8989;
					this.anIntArray365[local12] -= Static404.anInt7234;
					if (arg3 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg3];
						local162 = Class5_Sub2_Sub16.anIntArray410[arg3];
						local180 = this.anIntArray366[local12] * local20 + local162 * this.anIntArray362[local12] + 32767 >> 15;
						this.anIntArray366[local12] = local162 * this.anIntArray366[local12] + 32767 - this.anIntArray362[local12] * local20 >> 15;
						this.anIntArray362[local12] = local180;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg1];
						local162 = Class5_Sub2_Sub16.anIntArray410[arg1];
						local180 = this.anIntArray366[local12] * local162 + 32767 - this.anIntArray365[local12] * local20 >> 15;
						this.anIntArray365[local12] = local162 * this.anIntArray365[local12] + this.anIntArray366[local12] * local20 + 32767 >> 15;
						this.anIntArray366[local12] = local180;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub2_Sub16.anIntArray411[arg2];
						local162 = Class5_Sub2_Sub16.anIntArray410[arg2];
						local180 = this.anIntArray362[local12] * local162 + local20 * this.anIntArray365[local12] + 32767 >> 15;
						this.anIntArray365[local12] = local162 * this.anIntArray365[local12] + 32767 - this.anIntArray362[local12] * local20 >> 15;
						this.anIntArray362[local12] = local180;
					}
					this.anIntArray362[local12] += Static503.anInt8596;
					this.anIntArray366[local12] += Static533.anInt8989;
					this.anIntArray365[local12] += Static404.anInt7234;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt5316; local12++) {
					this.anIntArray362[local12] -= Static503.anInt8596;
					this.anIntArray366[local12] -= Static533.anInt8989;
					this.anIntArray365[local12] -= Static404.anInt7234;
					this.anIntArray362[local12] = this.anIntArray362[local12] * arg1 / 128;
					this.anIntArray366[local12] = arg2 * this.anIntArray366[local12] / 128;
					this.anIntArray365[local12] = this.anIntArray365[local12] * arg3 / 128;
					this.anIntArray362[local12] += Static503.anInt8596;
					this.anIntArray366[local12] += Static533.anInt8989;
					this.anIntArray365[local12] += Static404.anInt7234;
				}
			} else {
				@Pc(518) Class319 local518;
				@Pc(523) Class64 local523;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt5323; local12++) {
						local20 = (this.aByteArray70[local12] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray70[local12] = (byte) local20;
					}
					if (this.aClass19_12 != null) {
						this.aClass19_12.anInterface11_1 = null;
					}
					if (this.aClass319Array1 != null) {
						for (local20 = 0; local20 < this.anInt5325; local20++) {
							local518 = this.aClass319Array1[local20];
							local523 = this.aClass64Array1[local20];
							local523.anInt2121 = local523.anInt2121 & 0xFFFFFF | 255 - (this.aByteArray70[local518.anInt9132] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt5323; local12++) {
						local20 = this.aShortArray69[local12] & 0xFFFF;
						local162 = local20 >> 10 & 0x3F;
						local180 = local20 >> 7 & 0x7;
						local180 += arg2 / 4;
						@Pc(591) int local591 = local162 + arg1 & 0x3F;
						@Pc(595) int local595 = local20 & 0x7F;
						local595 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local595 < 0) {
							local595 = 0;
						} else if (local595 > 127) {
							local595 = 127;
						}
						this.aShortArray69[local12] = (short) (local595 | local591 << 10 | local180 << 7);
					}
					if (this.aClass19_12 != null) {
						this.aClass19_12.anInterface11_1 = null;
					}
					if (this.aClass319Array1 != null) {
						for (local20 = 0; local20 < this.anInt5325; local20++) {
							local518 = this.aClass319Array1[local20];
							local523 = this.aClass64Array1[local20];
							local523.anInt2121 = local523.anInt2121 & 0xFF000000 | Static444.anIntArray587[this.aShortArray69[local518.anInt9132] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(713) Class64 local713;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt5325; local12++) {
							local713 = this.aClass64Array1[local12];
							local713.anInt2117 += arg2;
							local713.anInt2118 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt5325; local12++) {
							local713 = this.aClass64Array1[local12];
							local713.anInt2120 = local713.anInt2120 * arg1 >> 7;
							local713.anInt2127 = arg2 * local713.anInt2127 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt5325; local12++) {
							local713 = this.aClass64Array1[local12];
							local713.anInt2126 = arg1 + local713.anInt2126 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ol;Z)V")
	private void method4482(@OriginalArg(0) Class78_Sub3 arg0) {
		@Pc(16) int local16;
		if (this.aClass223Array3 != null) {
			for (local16 = 0; local16 < this.aClass223Array3.length; local16++) {
				@Pc(23) Class223 local23 = this.aClass223Array3[local16];
				@Pc(25) Class223 local25 = local23;
				if (local23.aClass223_1 != null) {
					local25 = local23.aClass223_1;
				}
				local25.anInt6749 = (int) (arg0.aFloat285 + (float) this.anIntArray365[local23.anInt6756] * arg0.aFloat291 + arg0.aFloat286 * (float) this.anIntArray362[local23.anInt6756] + arg0.aFloat290 * (float) this.anIntArray366[local23.anInt6756]);
				local25.anInt6759 = (int) (arg0.aFloat282 * (float) this.anIntArray362[local23.anInt6756] + (float) this.anIntArray366[local23.anInt6756] * arg0.aFloat283 + arg0.aFloat281 * (float) this.anIntArray365[local23.anInt6756] + arg0.aFloat280);
				local25.anInt6755 = (int) (arg0.aFloat284 + arg0.aFloat287 * (float) this.anIntArray365[local23.anInt6756] + (float) this.anIntArray366[local23.anInt6756] * arg0.aFloat289 + arg0.aFloat288 * (float) this.anIntArray362[local23.anInt6756]);
				local25.anInt6762 = (int) (arg0.aFloat285 + arg0.aFloat290 * (float) this.anIntArray366[local23.anInt6752] + (float) this.anIntArray362[local23.anInt6752] * arg0.aFloat286 + arg0.aFloat291 * (float) this.anIntArray365[local23.anInt6752]);
				local25.anInt6763 = (int) ((float) this.anIntArray365[local23.anInt6752] * arg0.aFloat281 + arg0.aFloat283 * (float) this.anIntArray366[local23.anInt6752] + (float) this.anIntArray362[local23.anInt6752] * arg0.aFloat282 + arg0.aFloat280);
				local25.anInt6750 = (int) ((float) this.anIntArray366[local23.anInt6752] * arg0.aFloat289 + arg0.aFloat288 * (float) this.anIntArray362[local23.anInt6752] + arg0.aFloat287 * (float) this.anIntArray365[local23.anInt6752] + arg0.aFloat284);
				local25.anInt6761 = (int) ((float) this.anIntArray366[local23.anInt6765] * arg0.aFloat290 + arg0.aFloat286 * (float) this.anIntArray362[local23.anInt6765] + (float) this.anIntArray365[local23.anInt6765] * arg0.aFloat291 + arg0.aFloat285);
				local25.anInt6757 = (int) (arg0.aFloat280 + arg0.aFloat281 * (float) this.anIntArray365[local23.anInt6765] + (float) this.anIntArray362[local23.anInt6765] * arg0.aFloat282 + arg0.aFloat283 * (float) this.anIntArray366[local23.anInt6765]);
				local25.anInt6751 = (int) (arg0.aFloat284 + (float) this.anIntArray365[local23.anInt6765] * arg0.aFloat287 + arg0.aFloat289 * (float) this.anIntArray366[local23.anInt6765] + (float) this.anIntArray362[local23.anInt6765] * arg0.aFloat288);
			}
		}
		if (this.aClass280Array3 == null) {
			return;
		}
		for (local16 = 0; local16 < this.aClass280Array3.length; local16++) {
			@Pc(364) Class280 local364 = this.aClass280Array3[local16];
			@Pc(366) Class280 local366 = local364;
			if (local364.aClass280_2 != null) {
				local366 = local364.aClass280_2;
			}
			if (local364.aClass78_6 == null) {
				local364.aClass78_6 = arg0.method5707();
			} else {
				local364.aClass78_6.EA(arg0);
			}
			local366.anInt8075 = (int) (arg0.aFloat285 + (float) this.anIntArray365[local364.anInt8077] * arg0.aFloat291 + arg0.aFloat290 * (float) this.anIntArray366[local364.anInt8077] + arg0.aFloat286 * (float) this.anIntArray362[local364.anInt8077]);
			local366.anInt8068 = (int) ((float) this.anIntArray365[local364.anInt8077] * arg0.aFloat281 + arg0.aFloat283 * (float) this.anIntArray366[local364.anInt8077] + (float) this.anIntArray362[local364.anInt8077] * arg0.aFloat282 + arg0.aFloat280);
			local366.anInt8070 = (int) (arg0.aFloat284 + (float) this.anIntArray365[local364.anInt8077] * arg0.aFloat287 + (float) this.anIntArray366[local364.anInt8077] * arg0.aFloat289 + (float) this.anIntArray362[local364.anInt8077] * arg0.aFloat288);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIBZLclient!la;Lclient!la;)Lclient!r;")
	private Class36 method4484(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class36_Sub2 arg3, @OriginalArg(5) Class36_Sub2 arg4) {
		arg4.aShort77 = this.aShort77;
		arg4.anInt5316 = this.anInt5316;
		arg4.anInt5325 = this.anInt5325;
		arg4.aShort74 = this.aShort74;
		arg4.aByte54 = 0;
		arg4.anInt5301 = this.anInt5301;
		arg4.anInt5352 = this.anInt5352;
		arg4.anInt5336 = arg1;
		arg4.anInt5314 = this.anInt5314;
		arg4.anInt5323 = this.anInt5323;
		arg4.anInt5357 = this.anInt5357;
		@Pc(59) boolean local59 = Static43.method897(arg1, this.anInt5357);
		@Pc(65) boolean local65 = Static146.method2755(this.anInt5357, arg1);
		@Pc(71) boolean local71 = Static293.method4903(this.anInt5357, arg1);
		@Pc(77) boolean local77 = local71 | local65 | local59;
		@Pc(192) int local192;
		if (local77) {
			if (!local59) {
				arg4.anIntArray362 = this.anIntArray362;
			} else if (arg3.anIntArray362 == null || this.anInt5314 > arg3.anIntArray362.length) {
				arg4.anIntArray362 = arg3.anIntArray362 = new int[this.anInt5314];
			} else {
				arg4.anIntArray362 = arg3.anIntArray362;
			}
			if (!local65) {
				arg4.anIntArray366 = this.anIntArray366;
			} else if (arg3.anIntArray366 == null || arg3.anIntArray366.length < this.anInt5314) {
				arg4.anIntArray366 = arg3.anIntArray366 = new int[this.anInt5314];
			} else {
				arg4.anIntArray366 = arg3.anIntArray366;
			}
			if (!local71) {
				arg4.anIntArray365 = this.anIntArray365;
			} else if (arg3.anIntArray365 == null || this.anInt5314 > arg3.anIntArray365.length) {
				arg4.anIntArray365 = arg3.anIntArray365 = new int[this.anInt5314];
			} else {
				arg4.anIntArray365 = arg3.anIntArray365;
			}
			for (local192 = 0; local192 < this.anInt5314; local192++) {
				if (local59) {
					arg4.anIntArray362[local192] = this.anIntArray362[local192];
				}
				if (local65) {
					arg4.anIntArray366[local192] = this.anIntArray366[local192];
				}
				if (local71) {
					arg4.anIntArray365[local192] = this.anIntArray365[local192];
				}
			}
		} else {
			arg4.anIntArray362 = this.anIntArray362;
			arg4.anIntArray365 = this.anIntArray365;
			arg4.anIntArray366 = this.anIntArray366;
		}
		if (Static150.method2772(this.anInt5357, arg1)) {
			if (arg2) {
				arg4.aByte54 = (byte) (arg4.aByte54 | 0x1);
			}
			arg4.aClass19_10 = arg3.aClass19_10;
			arg4.aClass19_10.aByte1 = this.aClass19_10.aByte1;
			arg4.aClass19_10.anInterface11_1 = this.aClass19_10.anInterface11_1;
		} else if (Static437.method6223(arg1, this.anInt5357)) {
			arg4.aClass19_10 = this.aClass19_10;
		} else {
			arg4.aClass19_10 = null;
		}
		if (Static458.method6385(this.anInt5357, arg1)) {
			if (arg3.aShortArray69 == null || this.anInt5323 > arg3.aShortArray69.length) {
				arg4.aShortArray69 = arg3.aShortArray69 = new short[this.anInt5323];
			} else {
				arg4.aShortArray69 = arg3.aShortArray69;
			}
			for (local192 = 0; local192 < this.anInt5323; local192++) {
				arg4.aShortArray69[local192] = this.aShortArray69[local192];
			}
		} else {
			arg4.aShortArray69 = this.aShortArray69;
		}
		if (Static528.method6949(arg1, this.anInt5357)) {
			if (arg3.aByteArray70 == null || this.anInt5323 > arg3.aByteArray70.length) {
				arg4.aByteArray70 = arg3.aByteArray70 = new byte[this.anInt5323];
			} else {
				arg4.aByteArray70 = arg3.aByteArray70;
			}
			for (local192 = 0; local192 < this.anInt5323; local192++) {
				arg4.aByteArray70[local192] = this.aByteArray70[local192];
			}
		} else {
			arg4.aByteArray70 = this.aByteArray70;
		}
		if (Static376.method5638(this.anInt5357, arg1)) {
			arg4.aClass19_12 = arg3.aClass19_12;
			if (arg2) {
				arg4.aByte54 = (byte) (arg4.aByte54 | 0x2);
			}
			arg4.aClass19_12.anInterface11_1 = this.aClass19_12.anInterface11_1;
			arg4.aClass19_12.aByte1 = this.aClass19_12.aByte1;
		} else if (Static182.method3093(this.anInt5357, arg1)) {
			arg4.aClass19_12 = this.aClass19_12;
		} else {
			arg4.aClass19_12 = null;
		}
		@Pc(562) int local562;
		if (Static388.method5701(arg1, this.anInt5357)) {
			if (arg3.aShortArray63 == null || arg3.aShortArray63.length < this.anInt5301) {
				local192 = this.anInt5301;
				arg4.aShortArray67 = arg3.aShortArray67 = new short[local192];
				arg4.aShortArray63 = arg3.aShortArray63 = new short[local192];
				arg4.aShortArray68 = arg3.aShortArray68 = new short[local192];
			} else {
				arg4.aShortArray68 = arg3.aShortArray68;
				arg4.aShortArray63 = arg3.aShortArray63;
				arg4.aShortArray67 = arg3.aShortArray67;
			}
			if (this.aClass159_1 == null) {
				for (local192 = 0; local192 < this.anInt5301; local192++) {
					arg4.aShortArray63[local192] = this.aShortArray63[local192];
					arg4.aShortArray67[local192] = this.aShortArray67[local192];
					arg4.aShortArray68[local192] = this.aShortArray68[local192];
				}
			} else {
				if (arg3.aClass159_1 == null) {
					arg3.aClass159_1 = new Class159();
				}
				@Pc(546) Class159 local546 = arg4.aClass159_1 = arg3.aClass159_1;
				if (local546.aShortArray45 == null || local546.aShortArray45.length < this.anInt5301) {
					local562 = this.anInt5301;
					local546.aShortArray45 = new short[local562];
					local546.aShortArray43 = new short[local562];
					local546.aShortArray44 = new short[local562];
					local546.aByteArray55 = new byte[local562];
				}
				for (local562 = 0; local562 < this.anInt5301; local562++) {
					arg4.aShortArray63[local562] = this.aShortArray63[local562];
					arg4.aShortArray67[local562] = this.aShortArray67[local562];
					arg4.aShortArray68[local562] = this.aShortArray68[local562];
					local546.aShortArray45[local562] = this.aClass159_1.aShortArray45[local562];
					local546.aShortArray44[local562] = this.aClass159_1.aShortArray44[local562];
					local546.aShortArray43[local562] = this.aClass159_1.aShortArray43[local562];
					local546.aByteArray55[local562] = this.aClass159_1.aByteArray55[local562];
				}
			}
			arg4.aByteArray71 = this.aByteArray71;
		} else {
			arg4.aShortArray63 = this.aShortArray63;
			arg4.aShortArray67 = this.aShortArray67;
			arg4.aClass159_1 = this.aClass159_1;
			arg4.aShortArray68 = this.aShortArray68;
			arg4.aByteArray71 = this.aByteArray71;
		}
		if (Static378.method5659(arg1, this.anInt5357)) {
			if (arg2) {
				arg4.aByte54 = (byte) (arg4.aByte54 | 0x4);
			}
			arg4.aClass19_9 = arg3.aClass19_9;
			arg4.aClass19_9.anInterface11_1 = this.aClass19_9.anInterface11_1;
			arg4.aClass19_9.aByte1 = this.aClass19_9.aByte1;
		} else if (Static205.method3345(this.anInt5357, arg1)) {
			arg4.aClass19_9 = this.aClass19_9;
		} else {
			arg4.aClass19_9 = null;
		}
		if (Static124.method2347(arg1, this.anInt5357)) {
			if (arg3.aFloatArray40 == null || this.anInt5323 > arg3.aFloatArray40.length) {
				local192 = this.anInt5301;
				arg4.aFloatArray39 = arg3.aFloatArray39 = new float[local192];
				arg4.aFloatArray40 = arg3.aFloatArray40 = new float[local192];
			} else {
				arg4.aFloatArray39 = arg3.aFloatArray39;
				arg4.aFloatArray40 = arg3.aFloatArray40;
			}
			for (local192 = 0; local192 < this.anInt5301; local192++) {
				arg4.aFloatArray40[local192] = this.aFloatArray40[local192];
				arg4.aFloatArray39[local192] = this.aFloatArray39[local192];
			}
		} else {
			arg4.aFloatArray39 = this.aFloatArray39;
			arg4.aFloatArray40 = this.aFloatArray40;
		}
		if (Static119.method2282(this.anInt5357, arg1)) {
			arg4.aClass19_11 = arg3.aClass19_11;
			if (arg2) {
				arg4.aByte54 = (byte) (arg4.aByte54 | 0x8);
			}
			arg4.aClass19_11.aByte1 = this.aClass19_11.aByte1;
			arg4.aClass19_11.anInterface11_1 = this.aClass19_11.anInterface11_1;
		} else if (Static463.method6457(arg1, this.anInt5357)) {
			arg4.aClass19_11 = this.aClass19_11;
		} else {
			arg4.aClass19_11 = null;
		}
		if (Static136.method2572(arg1, this.anInt5357)) {
			if (arg3.aShortArray62 == null || arg3.aShortArray62.length < this.anInt5323) {
				local192 = this.anInt5323;
				arg4.aShortArray64 = arg3.aShortArray64 = new short[local192];
				arg4.aShortArray72 = arg3.aShortArray72 = new short[local192];
				arg4.aShortArray62 = arg3.aShortArray62 = new short[local192];
			} else {
				arg4.aShortArray62 = arg3.aShortArray62;
				arg4.aShortArray72 = arg3.aShortArray72;
				arg4.aShortArray64 = arg3.aShortArray64;
			}
			for (local192 = 0; local192 < this.anInt5323; local192++) {
				arg4.aShortArray62[local192] = this.aShortArray62[local192];
				arg4.aShortArray72[local192] = this.aShortArray72[local192];
				arg4.aShortArray64[local192] = this.aShortArray64[local192];
			}
		} else {
			arg4.aShortArray72 = this.aShortArray72;
			arg4.aShortArray64 = this.aShortArray64;
			arg4.aShortArray62 = this.aShortArray62;
		}
		if (Static297.method5710(this.anInt5357, arg1)) {
			arg4.aClass153_1 = arg3.aClass153_1;
			if (arg2) {
				arg4.aByte54 = (byte) (arg4.aByte54 | 0x10);
			}
			arg4.aClass153_1.anInterface6_2 = this.aClass153_1.anInterface6_2;
		} else if (Static360.method5529(arg1, this.anInt5357)) {
			arg4.aClass153_1 = this.aClass153_1;
		} else {
			arg4.aClass153_1 = null;
		}
		if (Static278.method4541(arg1, this.anInt5357)) {
			if (arg3.aShortArray71 == null || arg3.aShortArray71.length < this.anInt5323) {
				local192 = this.anInt5323;
				arg4.aShortArray71 = arg3.aShortArray71 = new short[local192];
			} else {
				arg4.aShortArray71 = arg3.aShortArray71;
			}
			for (local192 = 0; local192 < this.anInt5323; local192++) {
				arg4.aShortArray71[local192] = this.aShortArray71[local192];
			}
		} else {
			arg4.aShortArray71 = this.aShortArray71;
		}
		if (!Static301.method4979(this.anInt5357, arg1)) {
			arg4.aClass64Array1 = this.aClass64Array1;
		} else if (arg3.aClass64Array1 == null || arg3.aClass64Array1.length < this.anInt5325) {
			local192 = this.anInt5325;
			arg4.aClass64Array1 = arg3.aClass64Array1 = new Class64[local192];
			for (local562 = 0; local562 < this.anInt5325; local562++) {
				arg4.aClass64Array1[local562] = this.aClass64Array1[local562].method1962();
			}
		} else {
			arg4.aClass64Array1 = arg3.aClass64Array1;
			for (local192 = 0; local192 < this.anInt5325; local192++) {
				arg4.aClass64Array1[local192].method1964(this.aClass64Array1[local192]);
			}
		}
		arg4.anIntArrayArray35 = this.anIntArrayArray35;
		arg4.anIntArray361 = this.anIntArray361;
		arg4.anIntArrayArray34 = this.anIntArrayArray34;
		arg4.aShortArray70 = this.aShortArray70;
		if (this.aBoolean370) {
			arg4.aShort71 = this.aShort71;
			arg4.aShort72 = this.aShort72;
			arg4.aShort70 = this.aShort70;
			arg4.aBoolean370 = true;
			arg4.aShort76 = this.aShort76;
			arg4.aShort73 = this.aShort73;
			arg4.aShort78 = this.aShort78;
			arg4.aShort75 = this.aShort75;
		} else {
			arg4.aBoolean370 = false;
		}
		arg4.anIntArrayArray36 = this.anIntArrayArray36;
		arg4.aShortArray66 = this.aShortArray66;
		arg4.aClass280Array3 = this.aClass280Array3;
		arg4.aClass223Array3 = this.aClass223Array3;
		arg4.aClass319Array1 = this.aClass319Array1;
		arg4.aShortArray65 = this.aShortArray65;
		arg4.anIntArray363 = this.anIntArray363;
		return arg4;
	}

	@OriginalMember(owner = "client!la", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	private void method4485(@OriginalArg(1) boolean arg0) {
		if (this.anInt5352 * 6 > this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3.aByteArray66.length) {
			this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3 = new Class5_Sub3_Sub2((this.anInt5352 + 100) * 6);
		} else {
			this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3.anInt4960 = 0;
		}
		@Pc(46) Class5_Sub3_Sub2 local46 = this.aClass62_Sub3_17.aClass5_Sub3_Sub2_3;
		@Pc(52) int local52;
		if (this.aClass62_Sub3_17.aBoolean278) {
			for (local52 = 0; local52 < this.anInt5352; local52++) {
				local46.method4181(this.aShortArray62[local52]);
				local46.method4181(this.aShortArray72[local52]);
				local46.method4181(this.aShortArray64[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt5352; local52++) {
				local46.method4195(this.aShortArray62[local52]);
				local46.method4195(this.aShortArray72[local52]);
				local46.method4195(this.aShortArray64[local52]);
			}
		}
		if (local46.anInt4960 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface6_5 == null) {
				this.anInterface6_5 = this.aClass62_Sub3_17.method3953(local46.aByteArray66, true, local46.anInt4960);
			} else {
				this.anInterface6_5.method6017(local46.anInt4960, local46.aByteArray66);
			}
			this.aClass153_1.anInterface6_2 = this.anInterface6_5;
		} else {
			this.aClass153_1.anInterface6_2 = this.aClass62_Sub3_17.method3953(local46.aByteArray66, false, local46.anInt4960);
		}
		if (!arg0) {
			this.aBoolean371 = true;
		}
	}

	@OriginalMember(owner = "client!la", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass62_Sub3_17.anInterface8_145;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5323; local11++) {
			if (arg0 == this.aShortArray71[local11]) {
				this.aShortArray71[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class271 local47 = local9.method7237(arg0 & 0xFFFF);
			local35 = local47.aByte80;
			local37 = local47.aByte83;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class271 local68 = local9.method7237(arg1 & 0xFFFF);
			local57 = local68.aByte83;
			local55 = local68.aByte80;
		}
		if (!(local57 != local37 | local35 != local55)) {
			return;
		}
		if (this.aClass319Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt5325; local97++) {
				@Pc(104) Class319 local104 = this.aClass319Array1[local97];
				@Pc(109) Class64 local109 = this.aClass64Array1[local97];
				local109.anInt2121 = local109.anInt2121 & 0xFF000000 | Static444.anIntArray587[this.aShortArray69[local104.anInt9132] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5323; local7++) {
			if (this.aShortArray69[local7] == arg0) {
				this.aShortArray69[local7] = arg1;
			}
		}
		if (this.aClass319Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5325; local30++) {
				@Pc(37) Class319 local37 = this.aClass319Array1[local30];
				@Pc(42) Class64 local42 = this.aClass64Array1[local30];
				local42.anInt2121 = Static444.anIntArray587[this.aShortArray69[local37.anInt9132] & 0xFFFF] & 0xFFFFFF | local42.anInt2121 & 0xFF000000;
			}
		}
		if (this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!m;Lclient!paa;I)V")
	@Override
	public void method7360(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5301 == 0) {
			return;
		}
		@Pc(13) Class78_Sub3 local13 = this.aClass62_Sub3_17.aClass78_Sub3_4;
		@Pc(16) Class78_Sub3 local16 = (Class78_Sub3) arg0;
		if (!this.aBoolean370) {
			this.method4480();
		}
		this.method4482(local16);
		Static281.aFloat225 = local13.aFloat287 * local16.aFloat289 + local13.aFloat289 * local16.aFloat283 + local16.aFloat290 * local13.aFloat288;
		Static359.aFloat292 = local13.aFloat284 + local16.aFloat280 * local13.aFloat289 + local13.aFloat288 * local16.aFloat285 + local16.aFloat284 * local13.aFloat287;
		@Pc(73) float local73 = Static281.aFloat225 * (float) this.aShort70 + Static359.aFloat292;
		@Pc(81) float local81 = Static281.aFloat225 * (float) this.aShort75 + Static359.aFloat292;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local73 > local81) {
			local91 = (float) -this.aShort73 + local81;
			local97 = local73 + (float) this.aShort73;
		} else {
			local91 = local73 - (float) this.aShort73;
			local97 = (float) this.aShort73 + local81;
		}
		if (local91 >= this.aClass62_Sub3_17.aFloat193 || local97 <= (float) this.aClass62_Sub3_17.anInt4656) {
			return;
		}
		Static453.aFloat328 = local13.aFloat285 + local13.aFloat286 * local16.aFloat285 + local16.aFloat280 * local13.aFloat290 + local16.aFloat284 * local13.aFloat291;
		Static419.aFloat314 = local13.aFloat291 * local16.aFloat289 + local13.aFloat290 * local16.aFloat283 + local13.aFloat286 * local16.aFloat290;
		@Pc(174) float local174 = Static453.aFloat328 + (float) this.aShort70 * Static419.aFloat314;
		@Pc(182) float local182 = Static419.aFloat314 * (float) this.aShort75 + Static453.aFloat328;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass62_Sub3_17.anInt4652 * ((float) this.aShort73 + local174);
			local209 = ((float) -this.aShort73 + local182) * (float) this.aClass62_Sub3_17.anInt4652;
		} else {
			local209 = (float) this.aClass62_Sub3_17.anInt4652 * (local174 - (float) this.aShort73);
			local197 = (float) this.aClass62_Sub3_17.anInt4652 * (local182 + (float) this.aShort73);
		}
		if (this.aClass62_Sub3_17.aFloat207 <= local209 / local97 || this.aClass62_Sub3_17.aFloat199 >= local197 / local97) {
			return;
		}
		Static196.aFloat169 = local13.aFloat281 * local16.aFloat289 + local16.aFloat283 * local13.aFloat283 + local16.aFloat290 * local13.aFloat282;
		Static524.aFloat360 = local13.aFloat280 + local13.aFloat281 * local16.aFloat284 + local16.aFloat285 * local13.aFloat282 + local13.aFloat283 * local16.aFloat280;
		@Pc(298) float local298 = Static524.aFloat360 + Static196.aFloat169 * (float) this.aShort70;
		@Pc(306) float local306 = Static196.aFloat169 * (float) this.aShort75 + Static524.aFloat360;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (local306 - (float) this.aShort73) * (float) this.aClass62_Sub3_17.anInt4667;
			local332 = (local298 + (float) this.aShort73) * (float) this.aClass62_Sub3_17.anInt4667;
		} else {
			local321 = (float) this.aClass62_Sub3_17.anInt4667 * ((float) -this.aShort73 + local298);
			local332 = ((float) this.aShort73 + local306) * (float) this.aClass62_Sub3_17.anInt4667;
		}
		if (this.aClass62_Sub3_17.aFloat196 <= local321 / local97 || this.aClass62_Sub3_17.aFloat198 >= local332 / local97) {
			return;
		}
		if (arg1 != null || this.aClass319Array1 != null) {
			Static61.aFloat40 = local13.aFloat286 * local16.aFloat291 + local16.aFloat281 * local13.aFloat290 + local16.aFloat287 * local13.aFloat291;
			Static161.aFloat157 = local16.aFloat288 * local13.aFloat291 + local16.aFloat286 * local13.aFloat286 + local16.aFloat282 * local13.aFloat290;
			Static223.aFloat177 = local13.aFloat281 * local16.aFloat287 + local16.aFloat291 * local13.aFloat282 + local13.aFloat283 * local16.aFloat281;
			Static189.aFloat208 = local16.aFloat288 * local13.aFloat281 + local16.aFloat286 * local13.aFloat282 + local16.aFloat282 * local13.aFloat283;
			Static517.aFloat357 = local16.aFloat288 * local13.aFloat287 + local13.aFloat288 * local16.aFloat286 + local13.aFloat289 * local16.aFloat282;
			Static356.aFloat279 = local13.aFloat289 * local16.aFloat281 + local16.aFloat291 * local13.aFloat288 + local16.aFloat287 * local13.aFloat287;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.aShort71 + this.aShort78 >> 1;
			@Pc(511) int local511 = this.aShort76 + this.aShort72 >> 1;
			@Pc(530) int local530 = (int) ((float) local502 * Static161.aFloat157 + Static453.aFloat328 + (float) this.aShort70 * Static419.aFloat314 + (float) local511 * Static61.aFloat40);
			@Pc(549) int local549 = (int) ((float) local511 * Static223.aFloat177 + Static196.aFloat169 * (float) this.aShort70 + Static189.aFloat208 * (float) local502 + Static524.aFloat360);
			@Pc(568) int local568 = (int) ((float) local502 * Static517.aFloat357 + Static359.aFloat292 + Static281.aFloat225 * (float) this.aShort70 + Static356.aFloat279 * (float) local511);
			if (this.aClass62_Sub3_17.anInt4656 <= local568) {
				arg1.anInt6885 = local549 * this.aClass62_Sub3_17.anInt4667 / local568 + this.aClass62_Sub3_17.anInt4645;
				arg1.anInt6882 = this.aClass62_Sub3_17.anInt4652 * local530 / local568 + this.aClass62_Sub3_17.anInt4666;
			} else {
				local492 = true;
			}
			@Pc(626) int local626 = (int) (Static419.aFloat314 * (float) this.aShort75 + Static453.aFloat328 + Static161.aFloat157 * (float) local502 + Static61.aFloat40 * (float) local511);
			@Pc(645) int local645 = (int) ((float) this.aShort75 * Static196.aFloat169 + (float) local502 * Static189.aFloat208 + Static524.aFloat360 + (float) local511 * Static223.aFloat177);
			@Pc(664) int local664 = (int) (Static281.aFloat225 * (float) this.aShort75 + Static359.aFloat292 + Static517.aFloat357 * (float) local502 + Static356.aFloat279 * (float) local511);
			if (local664 >= this.aClass62_Sub3_17.anInt4656) {
				arg1.anInt6883 = this.aClass62_Sub3_17.anInt4645 + this.aClass62_Sub3_17.anInt4667 * local645 / local664;
				arg1.anInt6884 = this.aClass62_Sub3_17.anInt4652 * local626 / local664 + this.aClass62_Sub3_17.anInt4666;
			} else {
				local492 = true;
			}
			if (local492) {
				if (this.aClass62_Sub3_17.anInt4656 > local568 && this.aClass62_Sub3_17.anInt4656 > local664) {
					local494 = false;
				} else {
					@Pc(743) int local743;
					@Pc(753) int local753;
					@Pc(779) int local779;
					if (local568 < this.aClass62_Sub3_17.anInt4656) {
						local743 = (local664 - this.aClass62_Sub3_17.anInt4656 << 16) / (local664 - local568);
						local753 = local626 + (local743 * (local626 - local530) >> 16);
						local779 = local645 + (local743 * (local645 - local549) >> 16);
						arg1.anInt6882 = local753 * this.aClass62_Sub3_17.anInt4652 / this.aClass62_Sub3_17.anInt4656 + this.aClass62_Sub3_17.anInt4666;
						arg1.anInt6885 = this.aClass62_Sub3_17.anInt4667 * local779 / this.aClass62_Sub3_17.anInt4656 + this.aClass62_Sub3_17.anInt4645;
					} else if (local664 < this.aClass62_Sub3_17.anInt4656) {
						local743 = (local568 - this.aClass62_Sub3_17.anInt4656 << 16) / (local568 - local664);
						local753 = (local743 * (local530 - local626) >> 16) + local530;
						arg1.anInt6882 = this.aClass62_Sub3_17.anInt4652 * local753 / this.aClass62_Sub3_17.anInt4656 + this.aClass62_Sub3_17.anInt4666;
						local779 = local549 + ((local549 - local645) * local743 >> 16);
						arg1.anInt6885 = local779 * this.aClass62_Sub3_17.anInt4667 / this.aClass62_Sub3_17.anInt4656 + this.aClass62_Sub3_17.anInt4645;
					}
				}
			}
			if (local494) {
				arg1.aBoolean481 = true;
				if (local664 >= local568) {
					arg1.anInt6881 = this.aClass62_Sub3_17.anInt4652 * (local626 + this.aShort73) / local664 + this.aClass62_Sub3_17.anInt4666 - arg1.anInt6884;
				} else {
					arg1.anInt6881 = this.aClass62_Sub3_17.anInt4666 + (this.aShort73 + local530) * this.aClass62_Sub3_17.anInt4652 / local568 - arg1.anInt6882;
				}
			}
		}
		this.aClass62_Sub3_17.method3967();
		this.aClass62_Sub3_17.method4006(local16);
		this.method4488();
		this.aClass62_Sub3_17.method3958();
		this.method4479();
	}

	@OriginalMember(owner = "client!la", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5316; local15++) {
			local33 = local13 * this.anIntArray362[local15] + local9 * this.anIntArray365[local15] >> 15;
			this.anIntArray365[local15] = local13 * this.anIntArray365[local15] - local9 * this.anIntArray362[local15] >> 15;
			this.anIntArray362[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5301; local33++) {
			@Pc(83) int local83 = this.aShortArray68[local33] * local9 + this.aShortArray63[local33] * local13 >> 15;
			this.aShortArray68[local33] = (short) (this.aShortArray68[local33] * local13 - local9 * this.aShortArray63[local33] >> 15);
			this.aShortArray63[local33] = (short) local83;
		}
		if (this.aClass19_9 == null && this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
		if (this.aClass19_9 != null) {
			this.aClass19_9.anInterface11_1 = null;
		}
		this.aBoolean370 = false;
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5316; local7++) {
			if (arg0 != 0) {
				this.anIntArray362[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray366[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray365[local7] += arg2;
			}
		}
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
		this.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		if (this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
		this.aShort77 = (short) arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!m;Lclient!paa;II)V")
	@Override
	public void method7346(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5301 == 0) {
			return;
		}
		@Pc(13) Class78_Sub3 local13 = this.aClass62_Sub3_17.aClass78_Sub3_4;
		if (!this.aBoolean370) {
			this.method4480();
		}
		@Pc(22) Class78_Sub3 local22 = (Class78_Sub3) arg0;
		Static281.aFloat225 = local22.aFloat289 * local13.aFloat287 + local13.aFloat288 * local22.aFloat290 + local13.aFloat289 * local22.aFloat283;
		Static359.aFloat292 = local22.aFloat280 * local13.aFloat289 + local13.aFloat288 * local22.aFloat285 + local22.aFloat284 * local13.aFloat287 + local13.aFloat284;
		@Pc(69) float local69 = Static359.aFloat292 + (float) this.aShort70 * Static281.aFloat225;
		@Pc(77) float local77 = (float) this.aShort75 * Static281.aFloat225 + Static359.aFloat292;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.aShort73 + local77;
			local94 = (float) this.aShort73 + local69;
		} else {
			local88 = (float) -this.aShort73 + local69;
			local94 = (float) this.aShort73 + local77;
		}
		if (this.aClass62_Sub3_17.aFloat188 <= local88 || (float) this.aClass62_Sub3_17.anInt4656 >= local94) {
			return;
		}
		Static419.aFloat314 = local13.aFloat286 * local22.aFloat290 + local13.aFloat290 * local22.aFloat283 + local22.aFloat289 * local13.aFloat291;
		Static453.aFloat328 = local13.aFloat285 + local13.aFloat290 * local22.aFloat280 + local22.aFloat285 * local13.aFloat286 + local22.aFloat284 * local13.aFloat291;
		@Pc(171) float local171 = Static419.aFloat314 * (float) this.aShort70 + Static453.aFloat328;
		@Pc(179) float local179 = Static453.aFloat328 + (float) this.aShort75 * Static419.aFloat314;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local179 < local171) {
			local194 = ((float) -this.aShort73 + local179) * (float) this.aClass62_Sub3_17.anInt4652;
			local205 = ((float) this.aShort73 + local171) * (float) this.aClass62_Sub3_17.anInt4652;
		} else {
			local194 = (local171 - (float) this.aShort73) * (float) this.aClass62_Sub3_17.anInt4652;
			local205 = (float) this.aClass62_Sub3_17.anInt4652 * (local179 + (float) this.aShort73);
		}
		if (local194 / (float) arg2 >= this.aClass62_Sub3_17.aFloat207 || local205 / (float) arg2 <= this.aClass62_Sub3_17.aFloat199) {
			return;
		}
		Static524.aFloat360 = local13.aFloat280 + local13.aFloat283 * local22.aFloat280 + local13.aFloat282 * local22.aFloat285 + local13.aFloat281 * local22.aFloat284;
		Static196.aFloat169 = local22.aFloat283 * local13.aFloat283 + local22.aFloat290 * local13.aFloat282 + local22.aFloat289 * local13.aFloat281;
		@Pc(297) float local297 = Static524.aFloat360 + (float) this.aShort70 * Static196.aFloat169;
		@Pc(305) float local305 = Static196.aFloat169 * (float) this.aShort75 + Static524.aFloat360;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local332 = (float) this.aClass62_Sub3_17.anInt4667 * (local305 - (float) this.aShort73);
			local320 = (local297 + (float) this.aShort73) * (float) this.aClass62_Sub3_17.anInt4667;
		} else {
			local320 = (float) this.aClass62_Sub3_17.anInt4667 * (local305 + (float) this.aShort73);
			local332 = (float) this.aClass62_Sub3_17.anInt4667 * ((float) -this.aShort73 + local297);
		}
		if (this.aClass62_Sub3_17.aFloat196 <= local332 / (float) arg2 || this.aClass62_Sub3_17.aFloat198 >= local320 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass319Array1 != null) {
			Static223.aFloat177 = local13.aFloat281 * local22.aFloat287 + local13.aFloat282 * local22.aFloat291 + local13.aFloat283 * local22.aFloat281;
			Static161.aFloat157 = local22.aFloat286 * local13.aFloat286 + local13.aFloat290 * local22.aFloat282 + local13.aFloat291 * local22.aFloat288;
			Static517.aFloat357 = local22.aFloat288 * local13.aFloat287 + local13.aFloat289 * local22.aFloat282 + local13.aFloat288 * local22.aFloat286;
			Static189.aFloat208 = local22.aFloat286 * local13.aFloat282 + local22.aFloat282 * local13.aFloat283 + local22.aFloat288 * local13.aFloat281;
			Static61.aFloat40 = local22.aFloat281 * local13.aFloat290 + local13.aFloat286 * local22.aFloat291 + local22.aFloat287 * local13.aFloat291;
			Static356.aFloat279 = local22.aFloat287 * local13.aFloat287 + local22.aFloat281 * local13.aFloat289 + local22.aFloat291 * local13.aFloat288;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort78 + this.aShort71 >> 1;
			@Pc(507) int local507 = this.aShort72 + this.aShort76 >> 1;
			@Pc(526) int local526 = (int) (Static61.aFloat40 * (float) local507 + Static453.aFloat328 + Static161.aFloat157 * (float) local499 + Static419.aFloat314 * (float) this.aShort70);
			@Pc(545) int local545 = (int) (Static223.aFloat177 * (float) local507 + (float) this.aShort70 * Static196.aFloat169 + Static189.aFloat208 * (float) local499 + Static524.aFloat360);
			@Pc(564) int local564 = (int) ((float) local507 * Static356.aFloat279 + Static517.aFloat357 * (float) local499 + Static359.aFloat292 + (float) this.aShort70 * Static281.aFloat225);
			@Pc(583) int local583 = (int) ((float) this.aShort75 * Static419.aFloat314 + Static161.aFloat157 * (float) local499 + Static453.aFloat328 + Static61.aFloat40 * (float) local507);
			@Pc(602) int local602 = (int) (Static189.aFloat208 * (float) local499 + Static524.aFloat360 + Static196.aFloat169 * (float) this.aShort75 + (float) local507 * Static223.aFloat177);
			arg1.anInt6884 = this.aClass62_Sub3_17.anInt4652 * local583 / arg2 + this.aClass62_Sub3_17.anInt4666;
			arg1.anInt6885 = local545 * this.aClass62_Sub3_17.anInt4667 / arg2 + this.aClass62_Sub3_17.anInt4645;
			arg1.anInt6883 = local602 * this.aClass62_Sub3_17.anInt4667 / arg2 + this.aClass62_Sub3_17.anInt4645;
			@Pc(660) int local660 = (int) ((float) this.aShort75 * Static281.aFloat225 + Static359.aFloat292 + Static517.aFloat357 * (float) local499 + (float) local507 * Static356.aFloat279);
			arg1.anInt6882 = this.aClass62_Sub3_17.anInt4666 + local526 * this.aClass62_Sub3_17.anInt4652 / arg2;
			if (local564 < this.aClass62_Sub3_17.anInt4656 && local660 < this.aClass62_Sub3_17.anInt4656) {
				arg1.aBoolean481 = true;
				arg1.anInt6881 = this.aClass62_Sub3_17.anInt4666 + (local526 + this.aShort73) * this.aClass62_Sub3_17.anInt4652 / arg2 - arg1.anInt6882;
			}
		}
		this.aClass62_Sub3_17.method3965((float) arg2);
		this.aClass62_Sub3_17.method3982();
		this.aClass62_Sub3_17.method4006(local22);
		this.method4488();
		this.aClass62_Sub3_17.method3958();
		this.method4479();
	}

	@OriginalMember(owner = "client!la", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort78;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class78_Sub3 local8 = (Class78_Sub3) arg2;
		@Pc(12) Class78_Sub3 local12 = this.aClass62_Sub3_17.aClass78_Sub3_4;
		@Pc(33) float local33 = local12.aFloat290 * local8.aFloat280 + local8.aFloat285 * local12.aFloat286 + local12.aFloat291 * local8.aFloat284 + local12.aFloat285;
		@Pc(54) float local54 = local12.aFloat280 + local8.aFloat284 * local12.aFloat281 + local8.aFloat280 * local12.aFloat283 + local12.aFloat282 * local8.aFloat285;
		Static61.aFloat40 = local8.aFloat291 * local12.aFloat286 + local12.aFloat290 * local8.aFloat281 + local12.aFloat291 * local8.aFloat287;
		Static223.aFloat177 = local12.aFloat281 * local8.aFloat287 + local12.aFloat282 * local8.aFloat291 + local12.aFloat283 * local8.aFloat281;
		Static196.aFloat169 = local8.aFloat289 * local12.aFloat281 + local8.aFloat283 * local12.aFloat283 + local8.aFloat290 * local12.aFloat282;
		Static517.aFloat357 = local12.aFloat288 * local8.aFloat286 + local12.aFloat289 * local8.aFloat282 + local8.aFloat288 * local12.aFloat287;
		Static281.aFloat225 = local12.aFloat287 * local8.aFloat289 + local8.aFloat290 * local12.aFloat288 + local8.aFloat283 * local12.aFloat289;
		Static189.aFloat208 = local8.aFloat282 * local12.aFloat283 + local12.aFloat282 * local8.aFloat286 + local12.aFloat281 * local8.aFloat288;
		Static419.aFloat314 = local8.aFloat289 * local12.aFloat291 + local12.aFloat286 * local8.aFloat290 + local12.aFloat290 * local8.aFloat283;
		Static161.aFloat157 = local12.aFloat286 * local8.aFloat286 + local8.aFloat282 * local12.aFloat290 + local12.aFloat291 * local8.aFloat288;
		Static356.aFloat279 = local12.aFloat287 * local8.aFloat287 + local12.aFloat289 * local8.aFloat281 + local8.aFloat291 * local12.aFloat288;
		@Pc(237) float local237 = local12.aFloat284 + local12.aFloat287 * local8.aFloat284 + local12.aFloat289 * local8.aFloat280 + local12.aFloat288 * local8.aFloat285;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass62_Sub3_17.anInt4652;
		@Pc(255) int local255 = this.aClass62_Sub3_17.anInt4667;
		if (!this.aBoolean370) {
			this.method4480();
		}
		Static62.anIntArray652[0] = this.aShort71;
		Static453.anIntArray593[0] = this.aShort70;
		Static62.anIntArray652[1] = this.aShort78;
		Static501.anIntArray665[0] = this.aShort76;
		Static453.anIntArray593[1] = this.aShort70;
		Static62.anIntArray652[2] = this.aShort71;
		Static501.anIntArray665[1] = this.aShort76;
		Static453.anIntArray593[2] = this.aShort75;
		Static62.anIntArray652[3] = this.aShort78;
		Static501.anIntArray665[2] = this.aShort76;
		Static453.anIntArray593[3] = this.aShort75;
		Static62.anIntArray652[4] = this.aShort71;
		Static501.anIntArray665[3] = this.aShort76;
		Static453.anIntArray593[4] = this.aShort70;
		Static62.anIntArray652[5] = this.aShort78;
		Static501.anIntArray665[4] = this.aShort72;
		Static453.anIntArray593[5] = this.aShort70;
		Static62.anIntArray652[6] = this.aShort71;
		Static501.anIntArray665[5] = this.aShort72;
		Static453.anIntArray593[6] = this.aShort75;
		Static62.anIntArray652[7] = this.aShort78;
		Static501.anIntArray665[6] = this.aShort72;
		Static453.anIntArray593[7] = this.aShort75;
		Static501.anIntArray665[7] = this.aShort72;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static62.anIntArray652[local383];
			local395 = Static453.anIntArray593[local383];
			local400 = Static501.anIntArray665[local383];
			local414 = Static196.aFloat169 * local395 + Static189.aFloat208 * local390 + local400 * Static223.aFloat177 + local54;
			local428 = local33 + Static419.aFloat314 * local395 + local390 * Static161.aFloat157 + Static61.aFloat40 * local400;
			local442 = local237 + Static356.aFloat279 * local400 + local395 * Static281.aFloat225 + local390 * Static517.aFloat357;
			if ((float) this.aClass62_Sub3_17.anInt4656 <= local442) {
				@Pc(461) float local461 = (float) this.aClass62_Sub3_17.anInt4666 + (float) local251 * local428 / local442;
				@Pc(473) float local473 = (float) this.aClass62_Sub3_17.anInt4645 + local414 * (float) local255 / local442;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				local239 = true;
				if (local473 < local245) {
					local245 = local473;
				}
				if (local473 > local247) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt5301 > this.aClass62_Sub3_17.anIntArray302.length) {
				this.aClass62_Sub3_17.anIntArray301 = new int[this.anInt5301];
				this.aClass62_Sub3_17.anIntArray302 = new int[this.anInt5301];
			}
			@Pc(552) int[] local552 = this.aClass62_Sub3_17.anIntArray302;
			@Pc(556) int[] local556 = this.aClass62_Sub3_17.anIntArray301;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt5316; local558++) {
				local395 = this.anIntArray366[local558];
				local400 = this.anIntArray365[local558];
				local390 = this.anIntArray362[local558];
				local428 = Static419.aFloat314 * local395 + local390 * Static161.aFloat157 + local400 * Static61.aFloat40 + local33;
				local414 = Static196.aFloat169 * local395 + Static189.aFloat208 * local390 + Static223.aFloat177 * local400 + local54;
				local442 = Static517.aFloat357 * local390 + Static281.aFloat225 * local395 + Static356.aFloat279 * local400 + local237;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if (local442 >= (float) this.aClass62_Sub3_17.anInt4656) {
					local632 = (int) ((float) this.aClass62_Sub3_17.anInt4666 + local428 * (float) local251 / local442);
					local639 = (int) (local414 * (float) local255 / local442 + (float) this.aClass62_Sub3_17.anInt4645);
					local641 = this.anIntArray361[local558];
					local650 = this.anIntArray361[local558 + 1];
					for (@Pc(708) int local708 = local641; local708 < local650; local708++) {
						@Pc(717) int local717 = this.aShortArray66[local708] - 1;
						if (local717 == -1) {
							break;
						}
						local552[local717] = local632;
						local556[local717] = local639;
					}
				} else {
					local632 = this.anIntArray361[local558];
					local639 = this.anIntArray361[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray66[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray66[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt5323; local632++) {
				if (local552[this.aShortArray62[local632]] != -999999 && local552[this.aShortArray72[local632]] != -999999 && local552[this.aShortArray64[local632]] != -999999 && this.method4476(arg0, local552[this.aShortArray62[local632]], arg1, local552[this.aShortArray64[local632]], local556[this.aShortArray62[local632]], local552[this.aShortArray72[local632]], local556[this.aShortArray72[local632]], local556[this.aShortArray64[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!la", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5316; local7++) {
			if (arg0 != 128) {
				this.anIntArray362[local7] = this.anIntArray362[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray366[local7] = this.anIntArray366[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray365[local7] = this.anIntArray365[local7] * arg2 >> 7;
			}
		}
		this.aBoolean370 = false;
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLclient!ld;IJIFFII)S")
	private short method4486(@OriginalArg(0) int arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray361[arg2];
		@Pc(17) int local17 = this.anIntArray361[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray66[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static13.aLongArray2[local21] == arg3) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray66[local19] = (short) (this.anInt5301 + 1);
		Static13.aLongArray2[local19] = arg3;
		this.aShortArray63[this.anInt5301] = (short) arg0;
		this.aShortArray67[this.anInt5301] = (short) arg7;
		this.aShortArray68[this.anInt5301] = (short) arg8;
		this.aByteArray71[this.anInt5301] = (byte) arg4;
		this.aFloatArray40[this.anInt5301] = arg5;
		this.aFloatArray39[this.anInt5301] = arg6;
		return (short) this.anInt5301++;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZSIIB)I")
	private int method4487(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static444.anIntArray587[Static330.method5211(arg2, arg1)];
		if (arg0 != -1) {
			@Pc(24) Class271 local24 = this.aClass62_Sub3_17.anInterface8_145.method7237(arg0 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte80 & 0xFF;
			@Pc(38) int local38;
			@Pc(58) int local58;
			if (local29 != 0) {
				if (arg2 < 0) {
					local38 = 0;
				} else if (arg2 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg2 * 131586;
				}
				if (local29 == 256) {
					local12 = local38;
				} else {
					local58 = 256 - local29;
					local12 = (local58 * (local12 & 0xFF00FF) + (local38 & 0xFF00FF) * local29 & 0xFF00FF00) + ((local38 & 0xFF00) * local29 + local58 * (local12 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local38 = local24.aByte83 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(108) int local108 = (local12 >> 16 & 0xFF) * local38;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = (local12 >> 8 & 0xFF) * local38;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(132) int local132 = (local12 & 0xFF) * local38;
				if (local132 > 65535) {
					local132 = 65535;
				}
				local12 = (local132 >> 8) + (local58 & 0xFF00) + (local108 << 8 & 0xFF00CB);
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub2_Sub16.anIntArray411[arg0];
		@Pc(13) int local13 = Class5_Sub2_Sub16.anIntArray410[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5316; local15++) {
			@Pc(33) int local33 = this.anIntArray366[local15] * local9 + this.anIntArray362[local15] * local13 >> 15;
			this.anIntArray366[local15] = local13 * this.anIntArray366[local15] - local9 * this.anIntArray362[local15] >> 15;
			this.anIntArray362[local15] = local33;
		}
		this.aBoolean370 = false;
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		if (this.aClass19_12 != null) {
			this.aClass19_12.anInterface11_1 = null;
		}
		this.aShort74 = (short) arg0;
		if (this.aClass19_9 != null) {
			this.aClass19_9.anInterface11_1 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!la", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean370) {
			this.method4480();
		}
		@Pc(17) int local17 = arg4 + this.aShort71;
		@Pc(22) int local22 = arg4 + this.aShort78;
		@Pc(28) int local28 = arg6 + this.aShort76;
		@Pc(33) int local33 = this.aShort72 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt8873 <= arg2.anInt8874 + local22 >> arg2.anInt8869 || local28 < 0 || local33 + arg2.anInt8874 >> arg2.anInt8869 >= arg2.anInt8871)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt8874 >> arg3.anInt8869 >= arg3.anInt8873 || local28 < 0 || local33 + arg3.anInt8874 >> arg3.anInt8869 >= arg3.anInt8871) {
				return;
			}
		} else {
			local17 >>= arg2.anInt8869;
			local22 = local22 + arg2.anInt8874 - 1 >> arg2.anInt8869;
			local28 >>= arg2.anInt8869;
			local33 = local33 + arg2.anInt8874 - 1 >> arg2.anInt8869;
			if (arg5 == arg2.ba(local17, local28) && arg2.ba(local22, local28) == arg5 && arg2.ba(local17, local33) == arg5 && arg2.ba(local22, local33) == arg5) {
				return;
			}
		}
		@Pc(277) int local277;
		if (arg0 == 1) {
			for (local277 = 0; local277 < this.anInt5316; local277++) {
				this.anIntArray366[local277] = this.anIntArray366[local277] + arg2.aa(this.anIntArray362[local277] + arg4, arg6 + this.anIntArray365[local277]) - arg5;
			}
		} else {
			@Pc(205) int local205;
			@Pc(216) int local216;
			if (arg0 == 2) {
				@Pc(200) short local200 = this.aShort70;
				if (local200 == 0) {
					return;
				}
				for (local205 = 0; local205 < this.anInt5316; local205++) {
					local216 = (this.anIntArray366[local205] << 16) / local200;
					if (arg1 > local216) {
						this.anIntArray366[local205] += (arg1 - local216) * (-arg5 + arg2.aa(this.anIntArray362[local205] - -arg4, arg6 + this.anIntArray365[local205])) / arg1;
					}
				}
			} else {
				@Pc(348) int local348;
				if (arg0 == 3) {
					local277 = (arg1 & 0xFF) * 4;
					local205 = (arg1 >> 8 & 0xFF) * 4;
					local216 = (arg1 >> 16 & 0xFF) << 6;
					local348 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local277 >> 1) < 0 || (local277 >> 1) + arg4 + arg2.anInt8874 >= arg2.anInt8873 << arg2.anInt8869 || arg6 - (local205 >> 1) < 0 || arg2.anInt8871 << arg2.anInt8869 <= arg2.anInt8874 + arg6 + (local205 >> 1)) {
						return;
					}
					this.method7358(local348, arg6, arg4, local205, arg2, local216, arg5, local277);
				} else if (arg0 == 4) {
					local277 = this.aShort75 - this.aShort70;
					for (local205 = 0; local205 < this.anInt5316; local205++) {
						this.anIntArray366[local205] = local277 + this.anIntArray366[local205] + arg3.aa(this.anIntArray362[local205] - -arg4, this.anIntArray365[local205] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local277 = this.aShort75 - this.aShort70;
					for (local205 = 0; local205 < this.anInt5316; local205++) {
						local216 = this.anIntArray362[local205] + arg4;
						local348 = arg6 + this.anIntArray365[local205];
						@Pc(353) int local353 = arg2.aa(local216, local348);
						@Pc(358) int local358 = arg3.aa(local216, local348);
						@Pc(365) int local365 = local353 - local358 - arg1;
						this.anIntArray366[local205] = ((this.anIntArray366[local205] << 8) / local277 * local365 >> 8) - (arg5 - local353);
					}
				}
			}
		}
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
		this.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
	private void method4488() {
		if (this.anInt5352 == 0) {
			return;
		}
		if (this.aByte54 != 0) {
			this.method4481(true);
		}
		this.method4481(false);
		if (this.aClass153_1 != null) {
			if (this.aClass153_1.anInterface6_2 == null) {
				this.method4485((this.aByte54 & 0x10) != 0);
			}
			if (this.aClass153_1.anInterface6_2 != null) {
				this.aClass62_Sub3_17.method3970(this.aClass19_9 != null);
				this.aClass62_Sub3_17.method4000(this.aClass19_11, this.aClass19_9, this.aClass19_12, this.aClass19_10);
				@Pc(76) int local76 = this.anIntArray363.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray363[local78];
					@Pc(92) int local92 = this.anIntArray363[local78 + 1];
					@Pc(99) int local99 = this.aShortArray71[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass62_Sub3_17.method3950(this.aClass19_9 != null, local99);
					this.aClass62_Sub3_17.method3938(this.aClass153_1.anInterface6_2, local85 * 3, (local92 - local85) * 3);
				}
			}
		}
		this.method4489();
	}

	@OriginalMember(owner = "client!la", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt5336;
	}

	@OriginalMember(owner = "client!la", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static503.anInt8596 = 0;
			local29 = 0;
			Static533.anInt8989 = 0;
			Static404.anInt7234 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray36.length) {
					local55 = this.anIntArrayArray36[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local63]) != 0) {
							Static503.anInt8596 += this.anIntArray362[local63];
							Static533.anInt8989 += this.anIntArray366[local63];
							Static404.anInt7234 += this.anIntArray365[local63];
							local29++;
						}
					}
				}
			}
			if (local29 > 0) {
				Static404.anInt7234 = Static404.anInt7234 / local29 + arg4;
				Static533.anInt8989 = arg3 + Static533.anInt8989 / local29;
				Static90.aBoolean138 = true;
				Static503.anInt8596 = arg2 + Static503.anInt8596 / local29;
			} else {
				Static533.anInt8989 = arg3;
				Static404.anInt7234 = arg4;
				Static503.anInt8596 = arg2;
			}
			return;
		}
		@Pc(261) int[] local261;
		@Pc(263) int local263;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg3 * arg7[1] + arg2 * arg7[0] + arg4 * arg7[2] + 16384 >> 15;
				local35 = arg7[3] * arg2 + arg3 * arg7[4] + arg7[5] * arg4 + 16384 >> 15;
				local41 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local29;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray36.length > local35) {
					local261 = this.anIntArrayArray36[local35];
					for (local263 = 0; local263 < local261.length; local263++) {
						local57 = local261[local263];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local57]) != 0) {
							this.anIntArray362[local57] += arg2;
							this.anIntArray366[local57] += arg3;
							this.anIntArray365[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(395) int local395;
		@Pc(414) int local414;
		@Pc(642) int local642;
		@Pc(651) int local651;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(685) int local685;
		@Pc(1023) int local1023;
		@Pc(1031) int local1031;
		@Pc(1187) int local1187;
		@Pc(1213) int local1213;
		@Pc(1217) int local1217;
		@Pc(1225) int local1225;
		@Pc(1230) int local1230;
		@Pc(1234) int local1234;
		@Pc(1238) int local1238;
		@Pc(1240) int local1240;
		@Pc(1370) int[] local1370;
		@Pc(1372) int local1372;
		@Pc(1376) int local1376;
		@Pc(1380) int local1380;
		@Pc(1382) int local1382;
		@Pc(1511) int local1511;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray36.length > local35) {
						local261 = this.anIntArrayArray36[local35];
						for (local263 = 0; local263 < local261.length; local263++) {
							local57 = local261[local263];
							if (this.aShortArray70 == null || (this.aShortArray70[local57] & arg6) != 0) {
								this.anIntArray362[local57] -= Static503.anInt8596;
								this.anIntArray366[local57] -= Static533.anInt8989;
								this.anIntArray365[local57] -= Static404.anInt7234;
								if (arg4 != 0) {
									local63 = Class5_Sub2_Sub16.anIntArray411[arg4];
									local395 = Class5_Sub2_Sub16.anIntArray410[arg4];
									local414 = this.anIntArray366[local57] * local63 + this.anIntArray362[local57] * local395 + 32767 >> 15;
									this.anIntArray366[local57] = local395 * this.anIntArray366[local57] + 32767 - this.anIntArray362[local57] * local63 >> 15;
									this.anIntArray362[local57] = local414;
								}
								if (arg2 != 0) {
									local63 = Class5_Sub2_Sub16.anIntArray411[arg2];
									local395 = Class5_Sub2_Sub16.anIntArray410[arg2];
									local414 = local395 * this.anIntArray366[local57] + 32767 - this.anIntArray365[local57] * local63 >> 15;
									this.anIntArray365[local57] = this.anIntArray365[local57] * local395 + local63 * this.anIntArray366[local57] + 32767 >> 15;
									this.anIntArray366[local57] = local414;
								}
								if (arg3 != 0) {
									local63 = Class5_Sub2_Sub16.anIntArray411[arg3];
									local395 = Class5_Sub2_Sub16.anIntArray410[arg3];
									local414 = this.anIntArray362[local57] * local395 + this.anIntArray365[local57] * local63 + 32767 >> 15;
									this.anIntArray365[local57] = local395 * this.anIntArray365[local57] + 32767 - local63 * this.anIntArray362[local57] >> 15;
									this.anIntArray362[local57] = local414;
								}
								this.anIntArray362[local57] += Static503.anInt8596;
								this.anIntArray366[local57] += Static533.anInt8989;
								this.anIntArray365[local57] += Static404.anInt7234;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray36.length > local41) {
							local55 = this.anIntArrayArray36[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray70 == null || (this.aShortArray70[local63] & arg6) != 0) {
									local395 = this.anIntArray361[local63];
									local414 = this.anIntArray361[local63 + 1];
									for (local642 = local395; local642 < local414; local642++) {
										local651 = this.aShortArray66[local642] - 1;
										if (local651 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class5_Sub2_Sub16.anIntArray411[arg4];
											local667 = Class5_Sub2_Sub16.anIntArray410[arg4];
											local685 = this.aShortArray67[local651] * local663 + local667 * this.aShortArray63[local651] + 32767 >> 15;
											this.aShortArray67[local651] = (short) (local667 * this.aShortArray67[local651] + 32767 - this.aShortArray63[local651] * local663 >> 15);
											this.aShortArray63[local651] = (short) local685;
										}
										if (arg2 != 0) {
											local663 = Class5_Sub2_Sub16.anIntArray411[arg2];
											local667 = Class5_Sub2_Sub16.anIntArray410[arg2];
											local685 = local667 * this.aShortArray67[local651] + 32767 - local663 * this.aShortArray68[local651] >> 15;
											this.aShortArray68[local651] = (short) (this.aShortArray67[local651] * local663 + local667 * this.aShortArray68[local651] + 32767 >> 15);
											this.aShortArray67[local651] = (short) local685;
										}
										if (arg3 != 0) {
											local663 = Class5_Sub2_Sub16.anIntArray411[arg3];
											local667 = Class5_Sub2_Sub16.anIntArray410[arg3];
											local685 = this.aShortArray63[local651] * local667 + this.aShortArray68[local651] * local663 + 32767 >> 15;
											this.aShortArray68[local651] = (short) (local667 * this.aShortArray68[local651] + 32767 - local663 * this.aShortArray63[local651] >> 15);
											this.aShortArray63[local651] = (short) local685;
										}
									}
								}
							}
						}
					}
					if (this.aClass19_9 == null && this.aClass19_12 != null) {
						this.aClass19_12.anInterface11_1 = null;
					}
					if (this.aClass19_9 != null) {
						this.aClass19_9.anInterface11_1 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local263 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static90.aBoolean138) {
					local395 = Static503.anInt8596 * arg7[0] + Static533.anInt8989 * arg7[3] + Static404.anInt7234 * arg7[6] + 16384 >> 15;
					local414 = arg7[7] * Static404.anInt7234 + arg7[1] * Static503.anInt8596 + Static533.anInt8989 * arg7[4] + 16384 >> 15;
					local414 += local57;
					local395 += local263;
					local642 = arg7[5] * Static533.anInt8989 + Static503.anInt8596 * arg7[2] + arg7[8] * Static404.anInt7234 + 16384 >> 15;
					local642 += local63;
					Static533.anInt8989 = local414;
					Static503.anInt8596 = local395;
					Static404.anInt7234 = local642;
					Static90.aBoolean138 = false;
				}
				@Pc(991) int[] local991 = new int[9];
				local414 = Class5_Sub2_Sub16.anIntArray410[arg2];
				local642 = Class5_Sub2_Sub16.anIntArray411[arg2];
				local651 = Class5_Sub2_Sub16.anIntArray410[arg3];
				local663 = Class5_Sub2_Sub16.anIntArray411[arg3];
				local667 = Class5_Sub2_Sub16.anIntArray410[arg4];
				local685 = Class5_Sub2_Sub16.anIntArray411[arg4];
				local1023 = local642 * local667 + 16384 >> 15;
				local1031 = local685 * local642 + 16384 >> 15;
				local991[3] = local685 * local414 + 16384 >> 15;
				local991[4] = local414 * local667 + 16384 >> 15;
				local991[2] = local414 * local663 + 16384 >> 15;
				local991[5] = -local642;
				local991[8] = local414 * local651 + 16384 >> 15;
				local991[1] = local663 * local1023 + -local651 * local685 + 16384 >> 15;
				local991[6] = local1031 * local651 + local667 * -local663 + 16384 >> 15;
				local991[0] = local667 * local651 + local1031 * local663 + 16384 >> 15;
				local991[7] = local685 * local663 + local1023 * local651 + 16384 >> 15;
				@Pc(1161) int local1161 = -Static533.anInt8989 * local991[1] + -Static503.anInt8596 * local991[0] + -Static404.anInt7234 * local991[2] + 16384 >> 15;
				local1187 = -Static533.anInt8989 * local991[4] + -Static503.anInt8596 * local991[3] + local991[5] * -Static404.anInt7234 + 16384 >> 15;
				local1213 = -Static404.anInt7234 * local991[8] + -Static503.anInt8596 * local991[6] + -Static533.anInt8989 * local991[7] + 16384 >> 15;
				local1217 = Static503.anInt8596 + local1161;
				@Pc(1221) int local1221 = local1187 + Static533.anInt8989;
				local1225 = local1213 + Static404.anInt7234;
				@Pc(1228) int[] local1228 = new int[9];
				for (local1230 = 0; local1230 < 3; local1230++) {
					for (local1234 = 0; local1234 < 3; local1234++) {
						local1238 = 0;
						for (local1240 = 0; local1240 < 3; local1240++) {
							local1238 += local991[local1240 + local1230 * 3] * arg7[local1240 + local1234 * 3];
						}
						local1228[local1230 * 3 + local1234] = local1238 + 16384 >> 15;
					}
				}
				local1234 = local63 * local991[2] + local991[1] * local57 + local263 * local991[0] + 16384 >> 15;
				local1238 = local991[5] * local63 + local263 * local991[3] + local991[4] * local57 + 16384 >> 15;
				local1238 += local1221;
				local1234 += local1217;
				local1240 = local991[8] * local63 + local263 * local991[6] + local991[7] * local57 + 16384 >> 15;
				local1240 += local1225;
				local1370 = new int[9];
				for (local1372 = 0; local1372 < 3; local1372++) {
					for (local1376 = 0; local1376 < 3; local1376++) {
						local1380 = 0;
						for (local1382 = 0; local1382 < 3; local1382++) {
							local1380 += arg7[local1382 + local1372 * 3] * local1228[local1382 * 3 + local1376];
						}
						local1370[local1372 * 3 + local1376] = local1380 + 16384 >> 15;
					}
				}
				local1376 = local1240 * arg7[2] + arg7[0] * local1234 + arg7[1] * local1238 + 16384 >> 15;
				local1380 = local1238 * arg7[4] + local1234 * arg7[3] + local1240 * arg7[5] + 16384 >> 15;
				local1382 = local1238 * arg7[7] + arg7[6] * local1234 + local1240 * arg7[8] + 16384 >> 15;
				local1376 += local29;
				local1380 += local35;
				local1382 += local41;
				for (local1511 = 0; local1511 < local8; local1511++) {
					@Pc(1517) int local1517 = arg1[local1511];
					if (this.anIntArrayArray36.length > local1517) {
						@Pc(1527) int[] local1527 = this.anIntArrayArray36[local1517];
						for (@Pc(1529) int local1529 = 0; local1529 < local1527.length; local1529++) {
							@Pc(1535) int local1535 = local1527[local1529];
							if (this.aShortArray70 == null || (this.aShortArray70[local1535] & arg6) != 0) {
								@Pc(1576) int local1576 = this.anIntArray365[local1535] * local1370[2] + local1370[0] * this.anIntArray362[local1535] + this.anIntArray366[local1535] * local1370[1] + 16384 >> 15;
								@Pc(1608) int local1608 = local1370[4] * this.anIntArray366[local1535] + local1370[3] * this.anIntArray362[local1535] + this.anIntArray365[local1535] * local1370[5] + 16384 >> 15;
								@Pc(1612) int local1612 = local1576 + local1376;
								@Pc(1616) int local1616 = local1608 + local1380;
								@Pc(1648) int local1648 = local1370[8] * this.anIntArray365[local1535] + local1370[6] * this.anIntArray362[local1535] + local1370[7] * this.anIntArray366[local1535] + 16384 >> 15;
								this.anIntArray362[local1535] = local1612;
								@Pc(1657) int local1657 = local1648 + local1382;
								this.anIntArray366[local1535] = local1616;
								this.anIntArray365[local1535] = local1657;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2595) Class319 local2595;
			@Pc(2600) Class64 local2600;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray34.length > local35) {
							local261 = this.anIntArrayArray34[local35];
							for (local263 = 0; local263 < local261.length; local263++) {
								local57 = local261[local263];
								if (this.aShortArray65 == null || (this.aShortArray65[local57] & arg6) != 0) {
									local63 = (this.aByteArray70[local57] & 0xFF) + arg2 * 8;
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray70[local57] = (byte) local63;
									if (this.aClass19_12 != null) {
										this.aClass19_12.anInterface11_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass319Array1 != null) {
						for (local35 = 0; local35 < this.anInt5325; local35++) {
							local2595 = this.aClass319Array1[local35];
							local2600 = this.aClass64Array1[local35];
							local2600.anInt2121 = local2600.anInt2121 & 0xFFFFFF | 255 - (this.aByteArray70[local2595.anInt9132] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2860) Class64 local2860;
				if (arg0 == 8) {
					if (this.anIntArrayArray35 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray35.length > local35) {
								local261 = this.anIntArrayArray35[local35];
								for (local263 = 0; local263 < local261.length; local263++) {
									local2860 = this.aClass64Array1[local261[local263]];
									local2860.anInt2117 += arg3;
									local2860.anInt2118 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray35 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray35.length > local35) {
								local261 = this.anIntArrayArray35[local35];
								for (local263 = 0; local263 < local261.length; local263++) {
									local2860 = this.aClass64Array1[local261[local263]];
									local2860.anInt2127 = local2860.anInt2127 * arg3 >> 7;
									local2860.anInt2120 = local2860.anInt2120 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray35.length) {
							local261 = this.anIntArrayArray35[local35];
							for (local263 = 0; local263 < local261.length; local263++) {
								local2860 = this.aClass64Array1[local261[local263]];
								local2860.anInt2126 = local2860.anInt2126 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray34.length) {
						local261 = this.anIntArrayArray34[local35];
						for (local263 = 0; local263 < local261.length; local263++) {
							local57 = local261[local263];
							if (this.aShortArray65 == null || (this.aShortArray65[local57] & arg6) != 0) {
								local63 = this.aShortArray69[local57] & 0xFFFF;
								local395 = local63 >> 10 & 0x3F;
								local414 = local63 >> 7 & 0x7;
								local642 = local63 & 0x7F;
								@Pc(2707) int local2707 = local395 + arg2 & 0x3F;
								local414 += arg3 / 4;
								if (local414 < 0) {
									local414 = 0;
								} else if (local414 > 7) {
									local414 = 7;
								}
								local642 += arg4;
								if (local642 < 0) {
									local642 = 0;
								} else if (local642 > 127) {
									local642 = 127;
								}
								this.aShortArray69[local57] = (short) (local642 | local2707 << 10 | local414 << 7);
								if (this.aClass19_12 != null) {
									this.aClass19_12.anInterface11_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass319Array1 != null) {
					for (local35 = 0; local35 < this.anInt5325; local35++) {
						local2595 = this.aClass319Array1[local35];
						local2600 = this.aClass64Array1[local35];
						local2600.anInt2121 = local2600.anInt2121 & 0xFF000000 | Static444.anIntArray587[this.aShortArray69[local2595.anInt9132] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray36.length > local35) {
					local261 = this.anIntArrayArray36[local35];
					for (local263 = 0; local263 < local261.length; local263++) {
						local57 = local261[local263];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local57]) != 0) {
							this.anIntArray362[local57] -= Static503.anInt8596;
							this.anIntArray366[local57] -= Static533.anInt8989;
							this.anIntArray365[local57] -= Static404.anInt7234;
							this.anIntArray362[local57] = arg2 * this.anIntArray362[local57] >> 7;
							this.anIntArray366[local57] = arg3 * this.anIntArray366[local57] >> 7;
							this.anIntArray365[local57] = this.anIntArray365[local57] * arg4 >> 7;
							this.anIntArray362[local57] += Static503.anInt8596;
							this.anIntArray366[local57] += Static533.anInt8989;
							this.anIntArray365[local57] += Static404.anInt7234;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local263 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static90.aBoolean138) {
				local395 = arg7[0] * Static503.anInt8596 + arg7[3] * Static533.anInt8989 + Static404.anInt7234 * arg7[6] + 16384 >> 15;
				local414 = Static533.anInt8989 * arg7[4] + arg7[1] * Static503.anInt8596 + Static404.anInt7234 * arg7[7] + 16384 >> 15;
				local414 += local57;
				local395 += local263;
				local642 = Static533.anInt8989 * arg7[5] + Static503.anInt8596 * arg7[2] + arg7[8] * Static404.anInt7234 + 16384 >> 15;
				Static503.anInt8596 = local395;
				local642 += local63;
				Static533.anInt8989 = local414;
				Static404.anInt7234 = local642;
				Static90.aBoolean138 = false;
			}
			local395 = arg2 << 15 >> 7;
			local414 = arg3 << 15 >> 7;
			local642 = arg4 << 15 >> 7;
			local651 = -Static503.anInt8596 * local395 + 16384 >> 15;
			local663 = -Static533.anInt8989 * local414 + 16384 >> 15;
			local667 = -Static404.anInt7234 * local642 + 16384 >> 15;
			local685 = local651 + Static503.anInt8596;
			local1023 = local663 + Static533.anInt8989;
			local1031 = Static404.anInt7234 + local667;
			@Pc(1874) int[] local1874 = new int[] { arg7[0] * local395 + 16384 >> 15, local395 * arg7[3] + 16384 >> 15, arg7[6] * local395 + 16384 >> 15, arg7[1] * local414 + 16384 >> 15, arg7[4] * local414 + 16384 >> 15, arg7[7] * local414 + 16384 >> 15, arg7[2] * local642 + 16384 >> 15, arg7[5] * local642 + 16384 >> 15, arg7[8] * local642 + 16384 >> 15 };
			local1187 = local395 * local263 + 16384 >> 15;
			local1213 = local57 * local414 + 16384 >> 15;
			@Pc(2002) int local2002 = local1213 + local1023;
			@Pc(2006) int local2006 = local1187 + local685;
			local1217 = local63 * local642 + 16384 >> 15;
			@Pc(2018) int local2018 = local1217 + local1031;
			@Pc(2021) int[] local2021 = new int[9];
			@Pc(2027) int local2027;
			for (local1225 = 0; local1225 < 3; local1225++) {
				for (local2027 = 0; local2027 < 3; local2027++) {
					local1230 = 0;
					for (local1234 = 0; local1234 < 3; local1234++) {
						local1230 += arg7[local1225 * 3 + local1234] * local1874[local1234 * 3 + local2027];
					}
					local2021[local1225 * 3 + local2027] = local1230 + 16384 >> 15;
				}
			}
			local2027 = local2018 * arg7[2] + local2002 * arg7[1] + local2006 * arg7[0] + 16384 >> 15;
			local1230 = local2006 * arg7[3] + local2002 * arg7[4] + arg7[5] * local2018 + 16384 >> 15;
			local1230 += local35;
			local2027 += local29;
			local1234 = local2006 * arg7[6] + arg7[7] * local2002 + local2018 * arg7[8] + 16384 >> 15;
			local1234 += local41;
			for (local1238 = 0; local1238 < local8; local1238++) {
				local1240 = arg1[local1238];
				if (local1240 < this.anIntArrayArray36.length) {
					local1370 = this.anIntArrayArray36[local1240];
					for (local1372 = 0; local1372 < local1370.length; local1372++) {
						local1376 = local1370[local1372];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local1376]) != 0) {
							local1380 = this.anIntArray362[local1376] * local2021[0] + this.anIntArray366[local1376] * local2021[1] + local2021[2] * this.anIntArray365[local1376] + 16384 >> 15;
							local1382 = local2021[5] * this.anIntArray365[local1376] + local2021[3] * this.anIntArray362[local1376] + local2021[4] * this.anIntArray366[local1376] + 16384 >> 15;
							local1511 = this.anIntArray365[local1376] * local2021[8] + local2021[7] * this.anIntArray366[local1376] + local2021[6] * this.anIntArray362[local1376] + 16384 >> 15;
							@Pc(2298) int local2298 = local1382 + local1230;
							@Pc(2302) int local2302 = local1380 + local2027;
							@Pc(2306) int local2306 = local1511 + local1234;
							this.anIntArray362[local1376] = local2302;
							this.anIntArray366[local1376] = local2298;
							this.anIntArray365[local1376] = local2306;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray36 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5314; local12++) {
			this.anIntArray362[local12] <<= 0x4;
			this.anIntArray366[local12] <<= 0x4;
			this.anIntArray365[local12] <<= 0x4;
		}
		Static503.anInt8596 = 0;
		Static404.anInt7234 = 0;
		Static533.anInt8989 = 0;
		return true;
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!la", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5314; local3++) {
			this.anIntArray362[local3] = this.anIntArray362[local3] + 7 >> 4;
			this.anIntArray366[local3] = this.anIntArray366[local3] + 7 >> 4;
			this.anIntArray365[local3] = this.anIntArray365[local3] + 7 >> 4;
		}
		if (this.aClass19_10 != null) {
			this.aClass19_10.anInterface11_1 = null;
		}
		this.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean370) {
			this.method4480();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt5336 = arg0;
		this.aBoolean371 = true;
		if (this.aClass159_1 != null && (this.anInt5336 & 0x10000) == 0) {
			this.aByteArray71 = this.aClass159_1.aByteArray55;
			this.aShortArray68 = this.aClass159_1.aShortArray43;
			this.aShortArray63 = this.aClass159_1.aShortArray45;
			this.aShortArray67 = this.aClass159_1.aShortArray44;
			this.aClass159_1 = null;
		}
		this.method4489();
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	private void method4489() {
		if (!this.aBoolean371) {
			return;
		}
		this.aBoolean371 = false;
		if (this.aClass223Array3 == null && this.aClass280Array3 == null && this.aClass319Array1 == null) {
			if (this.anIntArray362 != null && !Static202.method3319(this.anInt5357, this.anInt5336)) {
				if (this.aClass19_10 != null && this.aClass19_10.anInterface11_1 == null) {
					this.aBoolean371 = true;
				} else {
					if (!this.aBoolean370) {
						this.method4480();
					}
					this.anIntArray362 = null;
				}
			}
			if (this.anIntArray366 != null && !Static243.method4138(this.anInt5357, this.anInt5336)) {
				if (this.aClass19_10 != null && this.aClass19_10.anInterface11_1 == null) {
					this.aBoolean371 = true;
				} else {
					if (!this.aBoolean370) {
						this.method4480();
					}
					this.anIntArray366 = null;
				}
			}
			if (this.anIntArray365 != null && !Static335.method5241(this.anInt5336, this.anInt5357)) {
				if (this.aClass19_10 != null && this.aClass19_10.anInterface11_1 == null) {
					this.aBoolean371 = true;
				} else {
					if (!this.aBoolean370) {
						this.method4480();
					}
					this.anIntArray365 = null;
				}
			}
		}
		if (this.aShortArray66 != null && this.anIntArray362 == null && this.anIntArray366 == null && this.anIntArray365 == null) {
			this.anIntArray361 = null;
			this.aShortArray66 = null;
		}
		if (this.aByteArray71 != null && !Static486.method6739(this.anInt5357, this.anInt5336)) {
			if (this.aClass19_9 == null) {
				if (this.aClass19_12 != null && this.aClass19_12.anInterface11_1 == null) {
					this.aBoolean371 = true;
				} else {
					this.aShortArray63 = this.aShortArray67 = this.aShortArray68 = null;
					this.aByteArray71 = null;
				}
			} else if (this.aClass19_9.anInterface11_1 == null) {
				this.aBoolean371 = true;
			} else {
				this.aByteArray71 = null;
				this.aShortArray63 = this.aShortArray67 = this.aShortArray68 = null;
			}
		}
		if (this.aShortArray69 != null && !Static511.method7082(this.anInt5357, this.anInt5336)) {
			if (this.aClass19_12 != null && this.aClass19_12.anInterface11_1 == null) {
				this.aBoolean371 = true;
			} else {
				this.aShortArray69 = null;
			}
		}
		if (this.aByteArray70 != null && !Static77.method4911(this.anInt5357, this.anInt5336)) {
			if (this.aClass19_12 != null && this.aClass19_12.anInterface11_1 == null) {
				this.aBoolean371 = true;
			} else {
				this.aByteArray70 = null;
			}
		}
		if (this.aFloatArray40 != null && !Static384.method6005(this.anInt5336, this.anInt5357)) {
			if (this.aClass19_11 != null && this.aClass19_11.anInterface11_1 == null) {
				this.aBoolean371 = true;
			} else {
				this.aFloatArray40 = this.aFloatArray39 = null;
			}
		}
		if (this.aShortArray71 != null && !Static278.method4544(this.anInt5336, this.anInt5357)) {
			if (this.aClass19_12 != null && this.aClass19_12.anInterface11_1 == null) {
				this.aBoolean371 = true;
			} else {
				this.aShortArray71 = null;
			}
		}
		if (this.aShortArray62 != null && !Static14.method530(this.anInt5357, this.anInt5336)) {
			if ((this.aClass153_1 == null || this.aClass153_1.anInterface6_2 != null) && (this.aClass19_12 == null || this.aClass19_12.anInterface11_1 != null)) {
				this.aShortArray62 = this.aShortArray72 = this.aShortArray64 = null;
			} else {
				this.aBoolean371 = true;
			}
		}
		if (this.anIntArrayArray34 != null && !Static361.method5533(this.anInt5357, this.anInt5336)) {
			this.aShortArray65 = null;
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArrayArray36 != null && !Static484.method7247(this.anInt5336, this.anInt5357)) {
			this.aShortArray70 = null;
			this.anIntArrayArray36 = null;
		}
		if (this.anIntArrayArray35 != null && !Static339.method5288(this.anInt5336, this.anInt5357)) {
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArray363 != null && (this.anInt5336 & 0x800) == 0 && (this.anInt5336 & 0x40000) == 0) {
			this.anIntArray363 = null;
		}
	}
}
