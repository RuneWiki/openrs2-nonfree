import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class170_Sub3 extends Class170 {

	@OriginalMember(owner = "client!tt", name = "Yb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!tt", name = "hb", descriptor = "Lclient!ww;")
	private Interface27 anInterface27_5;

	@OriginalMember(owner = "client!tt", name = "xb", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!tt", name = "U", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!tt", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!tt", name = "gc", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!tt", name = "Bb", descriptor = "[F")
	private float[] aFloatArray67;

	@OriginalMember(owner = "client!tt", name = "Cc", descriptor = "[Lclient!lk;")
	private Class232[] aClass232Array5;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "Lclient!lo;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "[Lclient!iia;")
	private Class179[] aClass179Array1;

	@OriginalMember(owner = "client!tt", name = "Sb", descriptor = "[I")
	private int[] anIntArray706;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!tt", name = "nc", descriptor = "[Lclient!ip;")
	private Class184[] aClass184Array5;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "[I")
	private int[] anIntArray707;

	@OriginalMember(owner = "client!tt", name = "vb", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!tt", name = "Eb", descriptor = "I")
	private int anInt9801;

	@OriginalMember(owner = "client!tt", name = "Fb", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "[I")
	private int[] anIntArray708;

	@OriginalMember(owner = "client!tt", name = "sc", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!tt", name = "wc", descriptor = "I")
	private int anInt9812;

	@OriginalMember(owner = "client!tt", name = "bc", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!tt", name = "Db", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!tt", name = "zb", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!tt", name = "Vb", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!tt", name = "Qb", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!tt", name = "lc", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "[F")
	private float[] aFloatArray68;

	@OriginalMember(owner = "client!tt", name = "Zb", descriptor = "S")
	private short aShort113;

	@OriginalMember(owner = "client!tt", name = "vc", descriptor = "Lclient!lm;")
	private Interface13 anInterface13_6;

	@OriginalMember(owner = "client!tt", name = "Ib", descriptor = "[Lclient!wj;")
	private Class404[] aClass404Array1;

	@OriginalMember(owner = "client!tt", name = "wb", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "[I")
	private int[] anIntArray709;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!tt", name = "Ac", descriptor = "I")
	private int anInt9834;

	@OriginalMember(owner = "client!tt", name = "rb", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!tt", name = "Lb", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!tt", name = "db", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "B")
	private byte aByte136;

	@OriginalMember(owner = "client!tt", name = "Bc", descriptor = "[I")
	private int[] anIntArray710;

	@OriginalMember(owner = "client!tt", name = "Tb", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "client!tt", name = "yb", descriptor = "Z")
	private boolean aBoolean662 = true;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	private int anInt9800 = 0;

	@OriginalMember(owner = "client!tt", name = "ic", descriptor = "I")
	private int anInt9825 = 0;

	@OriginalMember(owner = "client!tt", name = "Ub", descriptor = "I")
	private int anInt9802 = 0;

	@OriginalMember(owner = "client!tt", name = "Nb", descriptor = "I")
	private int anInt9784 = 0;

	@OriginalMember(owner = "client!tt", name = "Mb", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "client!tt", name = "bb", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
	private int anInt9826 = 0;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_39;

	@OriginalMember(owner = "client!tt", name = "fc", descriptor = "Lclient!pe;")
	private Class287 aClass287_12;

	@OriginalMember(owner = "client!tt", name = "tc", descriptor = "Lclient!pe;")
	private Class287 aClass287_10;

	@OriginalMember(owner = "client!tt", name = "pb", descriptor = "Lclient!pe;")
	private Class287 aClass287_11;

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "Lclient!pe;")
	private Class287 aClass287_9;

	@OriginalMember(owner = "client!tt", name = "Ab", descriptor = "Lclient!haa;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class170_Sub3(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_39 = arg0;
		this.aClass287_12 = new Class287((Interface13) null, 5126, 3, 0);
		this.aClass287_10 = new Class287((Interface13) null, 5126, 2, 0);
		this.aClass287_11 = new Class287((Interface13) null, 5126, 3, 0);
		this.aClass287_9 = new Class287((Interface13) null, 5121, 4, 0);
		this.aClass148_1 = new Class148();
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!aq;Lclient!gt;IIII)V")
	public Class170_Sub3(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9801 = arg2;
		this.aClass22_Sub1_39 = arg0;
		this.anInt9812 = arg5;
		if (Static2.method22(arg2, arg5)) {
			this.aClass287_12 = new Class287((Interface13) null, 5126, 3, 0);
		}
		if (Static630.method8286(arg5, arg2)) {
			this.aClass287_10 = new Class287((Interface13) null, 5126, 2, 0);
		}
		if (Static48.method1239(arg2, arg5)) {
			this.aClass287_11 = new Class287((Interface13) null, 5126, 3, 0);
		}
		if (Static242.method3456(arg5, arg2)) {
			this.aClass287_9 = new Class287((Interface13) null, 5121, 4, 0);
		}
		if (Static284.method4012(arg2, arg5)) {
			this.aClass148_1 = new Class148();
		}
		@Pc(116) Interface4 local116 = arg0.anInterface4_14;
		@Pc(120) int[] local120 = new int[arg1.anInt3646];
		this.anIntArray707 = new int[arg1.anInt3636 + 1];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt3646; local129++) {
			if (arg1.aByteArray29 == null || arg1.aByteArray29[local129] != 2) {
				if (arg1.aShortArray38 != null && arg1.aShortArray38[local129] != -1) {
					@Pc(168) Class406 local168 = local116.method5761(arg1.aShortArray38[local129] & 0xFFFF);
					if (((this.anInt9812 & 0x40) == 0 || !local168.aBoolean761) && local168.aBoolean765) {
						continue;
					}
				}
				local120[this.anInt9802++] = local129;
				this.anIntArray707[arg1.aShortArray30[local129]]++;
				this.anIntArray707[arg1.aShortArray33[local129]]++;
				this.anIntArray707[arg1.aShortArray36[local129]]++;
			}
		}
		this.anInt9784 = this.anInt9802;
		@Pc(252) long[] local252 = new long[this.anInt9802];
		@Pc(267) boolean local267 = (this.anInt9801 & 0x100) != 0;
		@Pc(281) int local281;
		@Pc(294) int local294;
		@Pc(488) int local488;
		for (@Pc(269) int local269 = 0; local269 < this.anInt9802; local269++) {
			@Pc(277) int local277 = local120[local269];
			@Pc(279) Class406 local279 = null;
			local281 = 0;
			@Pc(283) byte local283 = 0;
			@Pc(285) byte local285 = 0;
			@Pc(287) byte local287 = 0;
			if (arg1.aClass60Array1 != null) {
				@Pc(292) boolean local292 = false;
				for (local294 = 0; local294 < arg1.aClass60Array1.length; local294++) {
					@Pc(301) Class60 local301 = arg1.aClass60Array1[local294];
					if (local277 == local301.anInt2027) {
						@Pc(310) Class343 local310 = Static692.method9171(local301.anInt2032);
						if (local310.aBoolean605) {
							local292 = true;
						}
						if (local310.anInt9034 != -1) {
							@Pc(325) Class406 local325 = local116.method5761(local310.anInt9034);
							if (local325.anInt11143 == 2) {
								this.aBoolean663 = true;
							}
						}
					}
				}
				if (local292) {
					local252[local269] = Long.MAX_VALUE;
					this.anInt9784--;
					continue;
				}
			}
			@Pc(360) short local360 = -1;
			if (arg1.aShortArray38 != null) {
				local360 = arg1.aShortArray38[local277];
				if (local360 != -1) {
					local279 = local116.method5761(local360 & 0xFFFF);
					if ((this.anInt9812 & 0x40) != 0 && local279.aBoolean761) {
						local279 = null;
						local360 = -1;
					} else {
						local285 = local279.aByte149;
						local287 = local279.aByte147;
						if (local279.aByte145 != 0 || local279.aByte150 != 0) {
							this.aBoolean664 = true;
						}
					}
				}
			}
			@Pc(440) boolean local440 = arg1.aByteArray27 != null && arg1.aByteArray27[local277] != 0 || local279 != null && local279.anInt11143 != 0;
			if ((local267 || local440) && arg1.aByteArray28 != null) {
				local281 += arg1.aByteArray28[local277] << 17;
			}
			if (local440) {
				local281 += 65536;
			}
			local281 += (local285 & 0xFF) << 8;
			local281 += local287 & 0xFF;
			local488 = local283 + ((local360 & 0xFFFF) << 16);
			@Pc(494) int local494 = local488 + (local269 & 0xFFFF);
			local252[local269] = (long) local494 + ((long) local281 << 32);
			this.aBoolean664 |= local279 != null && (local279.aByte145 != 0 || local279.aByte150 != 0);
			this.aBoolean663 |= local440;
		}
		Static695.method6729(local120, local252);
		this.anIntArray706 = arg1.anIntArray253;
		this.anInt9825 = arg1.anInt3636;
		this.anIntArray710 = arg1.anIntArray251;
		this.anIntArray708 = arg1.anIntArray257;
		this.anInt9826 = arg1.anInt3635;
		this.aShortArray124 = arg1.aShortArray32;
		this.aClass184Array5 = arg1.aClass184Array1;
		this.aClass232Array5 = arg1.aClass232Array1;
		@Pc(587) Class389[] local587 = new Class389[this.anInt9825];
		@Pc(607) int local607;
		@Pc(623) int local623;
		@Pc(674) int local674;
		if (arg1.aClass60Array1 != null) {
			this.anInt9834 = arg1.aClass60Array1.length;
			this.aClass404Array1 = new Class404[this.anInt9834];
			this.aClass179Array1 = new Class179[this.anInt9834];
			for (local607 = 0; local607 < this.anInt9834; local607++) {
				@Pc(616) Class60 local616 = arg1.aClass60Array1[local607];
				@Pc(621) Class343 local621 = Static692.method9171(local616.anInt2032);
				local623 = -1;
				for (@Pc(625) int local625 = 0; local625 < this.anInt9802; local625++) {
					if (local616.anInt2027 == local120[local625]) {
						local623 = local625;
						break;
					}
				}
				if (local623 == -1) {
					throw new RuntimeException();
				}
				local674 = Static537.anIntArray601[arg1.aShortArray35[local616.anInt2027] & 0xFFFF] & 0xFFFFFF;
				@Pc(692) int local692 = local674 | 255 - (arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local616.anInt2027]) << 24;
				this.aClass404Array1[local607] = new Class404(local623, arg1.aShortArray30[local616.anInt2027], arg1.aShortArray33[local616.anInt2027], arg1.aShortArray36[local616.anInt2027], local621.anInt9031, local621.anInt9033, local621.anInt9034, local621.anInt9030, local621.anInt9028, local621.aBoolean605, local621.aBoolean604, local616.anInt2033);
				this.aClass179Array1[local607] = new Class179(local692);
			}
		}
		local607 = this.anInt9802 * 3;
		this.aFloatArray68 = new float[local607];
		this.aShortArray130 = new short[local607];
		this.aShortArray129 = new short[local607];
		this.aFloatArray67 = new float[local607];
		this.aShortArray120 = new short[this.anInt9802];
		if (arg1.aShortArray29 != null) {
			this.aShortArray127 = new short[this.anInt9802];
		}
		this.aShortArray122 = new short[this.anInt9802];
		this.aShortArray125 = new short[this.anInt9802];
		this.aShortArray126 = new short[local607];
		this.aShortArray128 = new short[this.anInt9802];
		this.aShortArray123 = new short[local607];
		this.aByteArray94 = new byte[this.anInt9802];
		this.aByteArray95 = new byte[local607];
		this.aShort106 = (short) arg3;
		this.aShort108 = (short) arg4;
		Static139.aLongArray9 = new long[local607];
		this.aShortArray121 = new short[this.anInt9802];
		local281 = 0;
		for (local488 = 0; local488 < arg1.anInt3636; local488++) {
			local623 = this.anIntArray707[local488];
			this.anIntArray707[local488] = local281;
			local587[local488] = new Class389();
			local281 += local623;
		}
		this.anIntArray707[arg1.anInt3636] = local281;
		@Pc(882) Class384 local882 = Static131.method2342(arg1, local120, this.anInt9802);
		@Pc(886) Class341[] local886 = new Class341[arg1.anInt3646];
		@Pc(927) int local927;
		@Pc(938) int local938;
		@Pc(960) int local960;
		@Pc(971) int local971;
		@Pc(980) int local980;
		@Pc(989) int local989;
		@Pc(907) short local907;
		@Pc(917) int local917;
		for (local674 = 0; local674 < arg1.anInt3646; local674++) {
			@Pc(897) short local897 = arg1.aShortArray30[local674];
			@Pc(902) short local902 = arg1.aShortArray33[local674];
			local907 = arg1.aShortArray36[local674];
			local917 = this.anIntArray706[local902] - this.anIntArray706[local897];
			local927 = this.anIntArray708[local902] - this.anIntArray708[local897];
			local938 = this.anIntArray710[local902] - this.anIntArray710[local897];
			@Pc(949) int local949 = this.anIntArray706[local907] - this.anIntArray706[local897];
			local960 = this.anIntArray708[local907] - this.anIntArray708[local897];
			local971 = this.anIntArray710[local907] - this.anIntArray710[local897];
			local980 = local971 * local927 - local960 * local938;
			local989 = local938 * local949 - local917 * local971;
			@Pc(998) int local998 = local917 * local960 - local927 * local949;
			while (local980 > 8192 || local989 > 8192 || local998 > 8192 || local980 < -8192 || local989 < -8192 || local998 < -8192) {
				local998 >>= 0x1;
				local980 >>= 0x1;
				local989 >>= 0x1;
			}
			@Pc(1057) int local1057 = (int) Math.sqrt((double) (local998 * local998 + local980 * local980 + local989 * local989));
			if (local1057 <= 0) {
				local1057 = 1;
			}
			local989 = local989 * 256 / local1057;
			local980 = local980 * 256 / local1057;
			local998 = local998 * 256 / local1057;
			@Pc(1090) byte local1090 = arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local674];
			if (local1090 == 0) {
				@Pc(1122) Class389 local1122 = local587[local897];
				local1122.anInt10624 += local989;
				local1122.anInt10623 += local998;
				local1122.anInt10625 += local980;
				local1122.anInt10622++;
				@Pc(1150) Class389 local1150 = local587[local902];
				local1150.anInt10625 += local980;
				local1150.anInt10623 += local998;
				local1150.anInt10624 += local989;
				local1150.anInt10622++;
				@Pc(1178) Class389 local1178 = local587[local907];
				local1178.anInt10624 += local989;
				local1178.anInt10625 += local980;
				local1178.anInt10623 += local998;
				local1178.anInt10622++;
			} else if (local1090 == 1) {
				@Pc(1107) Class341 local1107 = local886[local674] = new Class341();
				local1107.anInt8976 = local980;
				local1107.anInt8981 = local989;
				local1107.anInt8979 = local998;
			}
		}
		@Pc(1221) int local1221;
		@Pc(1265) short local1265;
		for (local294 = 0; local294 < this.anInt9802; local294++) {
			local1221 = local120[local294];
			@Pc(1228) int local1228 = arg1.aShortArray35[local1221] & 0xFFFF;
			if (arg1.aByteArray30 == null) {
				local917 = -1;
			} else {
				local917 = arg1.aByteArray30[local1221];
			}
			if (arg1.aByteArray27 == null) {
				local927 = 0;
			} else {
				local927 = arg1.aByteArray27[local1221] & 0xFF;
			}
			local1265 = arg1.aShortArray38 == null ? -1 : arg1.aShortArray38[local1221];
			if (local1265 != -1 && (this.anInt9812 & 0x40) != 0) {
				@Pc(1286) Class406 local1286 = local116.method5761(local1265 & 0xFFFF);
				if (local1286.aBoolean761) {
					local1265 = -1;
				}
			}
			@Pc(1293) float local1293 = 0.0F;
			@Pc(1295) float local1295 = 0.0F;
			@Pc(1297) float local1297 = 0.0F;
			@Pc(1299) float local1299 = 0.0F;
			@Pc(1301) float local1301 = 0.0F;
			@Pc(1303) float local1303 = 0.0F;
			@Pc(1305) byte local1305 = 0;
			@Pc(1307) byte local1307 = 0;
			@Pc(1309) int local1309 = 0;
			@Pc(1344) byte local1344;
			@Pc(1361) short local1361;
			@Pc(1366) short local1366;
			@Pc(1371) short local1371;
			if (local1265 != -1) {
				if (local917 == -1) {
					local1301 = 0.0F;
					local1299 = 1.0F;
					local1307 = 2;
					local1293 = 0.0F;
					local1305 = 1;
					local1297 = 1.0F;
					local1295 = 1.0F;
					local1303 = 0.0F;
				} else {
					local917 &= 0xFF;
					local1344 = arg1.aByteArray31[local917];
					@Pc(1351) short local1351;
					@Pc(1356) short local1356;
					@Pc(1394) float local1394;
					@Pc(1403) float local1403;
					@Pc(1412) float local1412;
					@Pc(1498) float local1498;
					@Pc(1507) float local1507;
					@Pc(1515) float local1515;
					@Pc(1523) float local1523;
					@Pc(1532) float local1532;
					@Pc(1541) float local1541;
					if (local1344 == 0) {
						local1351 = arg1.aShortArray30[local1221];
						local1356 = arg1.aShortArray33[local1221];
						local1361 = arg1.aShortArray36[local1221];
						local1366 = arg1.aShortArray37[local917];
						local1371 = arg1.aShortArray31[local917];
						@Pc(1376) short local1376 = arg1.aShortArray34[local917];
						@Pc(1382) float local1382 = (float) arg1.anIntArray253[local1366];
						@Pc(1388) float local1388 = (float) arg1.anIntArray257[local1366];
						local1394 = (float) arg1.anIntArray251[local1366];
						local1403 = (float) arg1.anIntArray253[local1371] - local1382;
						local1412 = (float) arg1.anIntArray257[local1371] - local1388;
						@Pc(1421) float local1421 = (float) arg1.anIntArray251[local1371] - local1394;
						@Pc(1430) float local1430 = (float) arg1.anIntArray253[local1376] - local1382;
						@Pc(1439) float local1439 = (float) arg1.anIntArray257[local1376] - local1388;
						@Pc(1447) float local1447 = (float) arg1.anIntArray251[local1376] - local1394;
						@Pc(1455) float local1455 = (float) arg1.anIntArray253[local1351] - local1382;
						@Pc(1464) float local1464 = (float) arg1.anIntArray257[local1351] - local1388;
						@Pc(1472) float local1472 = (float) arg1.anIntArray251[local1351] - local1394;
						@Pc(1481) float local1481 = (float) arg1.anIntArray253[local1356] - local1382;
						@Pc(1489) float local1489 = (float) arg1.anIntArray257[local1356] - local1388;
						local1498 = (float) arg1.anIntArray251[local1356] - local1394;
						local1507 = (float) arg1.anIntArray253[local1361] - local1382;
						local1515 = (float) arg1.anIntArray257[local1361] - local1388;
						local1523 = (float) arg1.anIntArray251[local1361] - local1394;
						local1532 = local1447 * local1412 - local1439 * local1421;
						local1541 = local1421 * local1430 - local1403 * local1447;
						@Pc(1549) float local1549 = local1403 * local1439 - local1430 * local1412;
						@Pc(1557) float local1557 = local1439 * local1549 - local1447 * local1541;
						@Pc(1566) float local1566 = local1532 * local1447 - local1430 * local1549;
						@Pc(1574) float local1574 = local1541 * local1430 - local1439 * local1532;
						@Pc(1588) float local1588 = 1.0F / (local1403 * local1557 + local1566 * local1412 + local1574 * local1421);
						local1301 = local1588 * (local1566 * local1515 + local1557 * local1507 + local1574 * local1523);
						local1297 = local1588 * (local1489 * local1566 + local1481 * local1557 + local1574 * local1498);
						local1293 = (local1464 * local1566 + local1455 * local1557 + local1472 * local1574) * local1588;
						@Pc(1639) float local1639 = local1421 * local1532 - local1549 * local1403;
						@Pc(1648) float local1648 = local1412 * local1549 - local1541 * local1421;
						@Pc(1657) float local1657 = local1403 * local1541 - local1532 * local1412;
						@Pc(1671) float local1671 = 1.0F / (local1430 * local1648 + local1639 * local1439 + local1657 * local1447);
						local1303 = local1671 * (local1639 * local1515 + local1648 * local1507 + local1657 * local1523);
						local1299 = local1671 * (local1489 * local1639 + local1481 * local1648 + local1657 * local1498);
						local1295 = (local1472 * local1657 + local1464 * local1639 + local1455 * local1648) * local1671;
					} else {
						local1351 = arg1.aShortArray30[local1221];
						local1356 = arg1.aShortArray33[local1221];
						local1361 = arg1.aShortArray36[local1221];
						@Pc(1735) int local1735 = local882.anIntArray755[local917];
						@Pc(1740) int local1740 = local882.anIntArray756[local917];
						@Pc(1745) int local1745 = local882.anIntArray757[local917];
						@Pc(1750) float[] local1750 = local882.aFloatArrayArray15[local917];
						@Pc(1755) byte local1755 = arg1.aByteArray33[local917];
						local1394 = (float) arg1.anIntArray261[local917] / 256.0F;
						if (local1344 == 1) {
							local1403 = (float) arg1.anIntArray255[local917] / 1024.0F;
							Static158.method2582(local1750, arg1.anIntArray257[local1351], arg1.anIntArray253[local1351], local1735, arg1.anIntArray251[local1351], local1403, local1394, local1740, Static190.aFloatArray83, local1755, local1745);
							local1295 = Static190.aFloatArray83[1];
							local1293 = Static190.aFloatArray83[0];
							Static158.method2582(local1750, arg1.anIntArray257[local1356], arg1.anIntArray253[local1356], local1735, arg1.anIntArray251[local1356], local1403, local1394, local1740, Static190.aFloatArray83, local1755, local1745);
							local1299 = Static190.aFloatArray83[1];
							local1297 = Static190.aFloatArray83[0];
							Static158.method2582(local1750, arg1.anIntArray257[local1361], arg1.anIntArray253[local1361], local1735, arg1.anIntArray251[local1361], local1403, local1394, local1740, Static190.aFloatArray83, local1755, local1745);
							local1303 = Static190.aFloatArray83[1];
							local1301 = Static190.aFloatArray83[0];
							local1412 = local1403 / 2.0F;
							if ((local1755 & 0x1) == 0) {
								if (local1301 - local1293 > local1412) {
									local1301 -= local1403;
									local1307 = 1;
								} else if (local1412 < local1293 - local1301) {
									local1307 = 2;
									local1301 += local1403;
								}
								if (local1412 < local1297 - local1293) {
									local1297 -= local1403;
									local1305 = 1;
								} else if (local1412 < local1293 - local1297) {
									local1297 += local1403;
									local1305 = 2;
								}
							} else {
								if (local1412 < local1299 - local1295) {
									local1299 -= local1403;
									local1305 = 1;
								} else if (local1295 - local1299 > local1412) {
									local1299 += local1403;
									local1305 = 2;
								}
								if (local1303 - local1295 > local1412) {
									local1303 -= local1403;
									local1307 = 1;
								} else if (local1412 < local1295 - local1303) {
									local1303 += local1403;
									local1307 = 2;
								}
							}
						} else if (local1344 == 2) {
							local1403 = (float) arg1.anIntArray260[local917] / 256.0F;
							local1412 = (float) arg1.anIntArray256[local917] / 256.0F;
							@Pc(2019) int local2019 = arg1.anIntArray253[local1356] - arg1.anIntArray253[local1351];
							@Pc(2029) int local2029 = arg1.anIntArray257[local1356] - arg1.anIntArray257[local1351];
							@Pc(2040) int local2040 = arg1.anIntArray251[local1356] - arg1.anIntArray251[local1351];
							@Pc(2050) int local2050 = arg1.anIntArray253[local1361] - arg1.anIntArray253[local1351];
							@Pc(2061) int local2061 = arg1.anIntArray257[local1361] - arg1.anIntArray257[local1351];
							@Pc(2072) int local2072 = arg1.anIntArray251[local1361] - arg1.anIntArray251[local1351];
							@Pc(2080) int local2080 = local2072 * local2029 - local2061 * local2040;
							@Pc(2089) int local2089 = local2050 * local2040 - local2019 * local2072;
							@Pc(2097) int local2097 = local2019 * local2061 - local2029 * local2050;
							local1498 = 64.0F / (float) arg1.anIntArray252[local917];
							local1507 = 64.0F / (float) arg1.anIntArray254[local917];
							local1515 = 64.0F / (float) arg1.anIntArray255[local917];
							local1523 = (local1750[2] * (float) local2097 + local1750[1] * (float) local2089 + local1750[0] * (float) local2080) / local1498;
							local1532 = (local1750[4] * (float) local2089 + local1750[3] * (float) local2080 + (float) local2097 * local1750[5]) / local1507;
							local1541 = ((float) local2080 * local1750[6] + local1750[7] * (float) local2089 + (float) local2097 * local1750[8]) / local1515;
							local1309 = Static257.method3552(local1532, local1541, local1523);
							Static43.method1173(local1750, Static190.aFloatArray83, local1403, local1309, local1394, local1735, local1740, arg1.anIntArray257[local1351], arg1.anIntArray253[local1351], local1745, local1412, arg1.anIntArray251[local1351], local1755);
							local1295 = Static190.aFloatArray83[1];
							local1293 = Static190.aFloatArray83[0];
							Static43.method1173(local1750, Static190.aFloatArray83, local1403, local1309, local1394, local1735, local1740, arg1.anIntArray257[local1356], arg1.anIntArray253[local1356], local1745, local1412, arg1.anIntArray251[local1356], local1755);
							local1299 = Static190.aFloatArray83[1];
							local1297 = Static190.aFloatArray83[0];
							Static43.method1173(local1750, Static190.aFloatArray83, local1403, local1309, local1394, local1735, local1740, arg1.anIntArray257[local1361], arg1.anIntArray253[local1361], local1745, local1412, arg1.anIntArray251[local1361], local1755);
							local1301 = Static190.aFloatArray83[0];
							local1303 = Static190.aFloatArray83[1];
						} else if (local1344 == 3) {
							Static387.method5219(arg1.anIntArray251[local1351], local1394, local1755, local1750, local1735, arg1.anIntArray253[local1351], arg1.anIntArray257[local1351], Static190.aFloatArray83, local1740, local1745);
							local1293 = Static190.aFloatArray83[0];
							local1295 = Static190.aFloatArray83[1];
							Static387.method5219(arg1.anIntArray251[local1356], local1394, local1755, local1750, local1735, arg1.anIntArray253[local1356], arg1.anIntArray257[local1356], Static190.aFloatArray83, local1740, local1745);
							local1297 = Static190.aFloatArray83[0];
							local1299 = Static190.aFloatArray83[1];
							Static387.method5219(arg1.anIntArray251[local1361], local1394, local1755, local1750, local1735, arg1.anIntArray253[local1361], arg1.anIntArray257[local1361], Static190.aFloatArray83, local1740, local1745);
							local1301 = Static190.aFloatArray83[0];
							local1303 = Static190.aFloatArray83[1];
							if ((local1755 & 0x1) == 0) {
								if (local1301 - local1293 > 0.5F) {
									local1307 = 1;
									local1301--;
								} else if (local1293 - local1301 > 0.5F) {
									local1307 = 2;
									local1301++;
								}
								if (local1297 - local1293 > 0.5F) {
									local1305 = 1;
									local1297--;
								} else if (local1293 - local1297 > 0.5F) {
									local1297++;
									local1305 = 2;
								}
							} else {
								if (local1299 - local1295 > 0.5F) {
									local1305 = 1;
									local1299--;
								} else if (local1295 - local1299 > 0.5F) {
									local1305 = 2;
									local1299++;
								}
								if (local1303 - local1295 > 0.5F) {
									local1303--;
									local1307 = 1;
								} else if (local1295 - local1303 > 0.5F) {
									local1303++;
									local1307 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray29 == null) {
				local1344 = 0;
			} else {
				local1344 = arg1.aByteArray29[local1221];
			}
			if (local1344 == 0) {
				@Pc(2561) long local2561 = ((long) local927 + (long) (local1309 << 24) + (long) (local1228 << 8) << 32) + (long) (local917 << 2);
				local1361 = arg1.aShortArray30[local1221];
				local1366 = arg1.aShortArray33[local1221];
				local1371 = arg1.aShortArray36[local1221];
				@Pc(2580) Class389 local2580 = local587[local1361];
				this.aShortArray125[local294] = this.method8384(local2580.anInt10625, local1295, local1293, local2580.anInt10624, local2580.anInt10622, local1361, local2580.anInt10623, local2561, arg1);
				@Pc(2604) Class389 local2604 = local587[local1366];
				this.aShortArray122[local294] = this.method8384(local2604.anInt10625, local1299, local1297, local2604.anInt10624, local2604.anInt10622, local1366, local2604.anInt10623, (long) local1305 + local2561, arg1);
				@Pc(2631) Class389 local2631 = local587[local1371];
				this.aShortArray128[local294] = this.method8384(local2631.anInt10625, local1303, local1301, local2631.anInt10624, local2631.anInt10622, local1371, local2631.anInt10623, local2561 + (long) local1307, arg1);
			} else if (local1344 == 1) {
				@Pc(2665) Class341 local2665 = local886[local1221];
				@Pc(2707) long local2707 = (long) ((local2665.anInt8981 + 256 << 12) + (local2665.anInt8976 <= 0 ? 2048 : 1024) + (local917 << 2) + (local2665.anInt8979 + 256 << 22)) + ((long) local927 + (long) (local1228 << 8) + (long) (local1309 << 24) << 32);
				this.aShortArray125[local294] = this.method8384(local2665.anInt8976, local1295, local1293, local2665.anInt8981, 0, arg1.aShortArray30[local1221], local2665.anInt8979, local2707, arg1);
				this.aShortArray122[local294] = this.method8384(local2665.anInt8976, local1299, local1297, local2665.anInt8981, 0, arg1.aShortArray33[local1221], local2665.anInt8979, local2707 + (long) local1305, arg1);
				this.aShortArray128[local294] = this.method8384(local2665.anInt8976, local1303, local1301, local2665.anInt8981, 0, arg1.aShortArray36[local1221], local2665.anInt8979, (long) local1307 + local2707, arg1);
			}
			if (arg1.aByteArray27 != null) {
				this.aByteArray94[local294] = arg1.aByteArray27[local1221];
			}
			if (arg1.aShortArray29 != null) {
				this.aShortArray127[local294] = arg1.aShortArray29[local1221];
			}
			this.aShortArray121[local294] = arg1.aShortArray35[local1221];
			this.aShortArray120[local294] = local1265;
		}
		local1221 = 0;
		local907 = -10000;
		for (local917 = 0; local917 < this.anInt9784; local917++) {
			@Pc(2842) short local2842 = this.aShortArray120[local917];
			if (local907 != local2842) {
				local1221++;
				local907 = local2842;
			}
		}
		this.anIntArray709 = new int[local1221 + 1];
		local907 = -10000;
		local1221 = 0;
		for (local927 = 0; local927 < this.anInt9784; local927++) {
			local1265 = this.aShortArray120[local927];
			if (local1265 != local907) {
				local907 = local1265;
				this.anIntArray709[local1221++] = local927;
			}
		}
		this.anIntArray709[local1221] = this.anInt9784;
		Static139.aLongArray9 = null;
		this.aShortArray123 = Static136.method2379(this.anInt9800, this.aShortArray123);
		this.aShortArray130 = Static136.method2379(this.anInt9800, this.aShortArray130);
		this.aShortArray126 = Static136.method2379(this.anInt9800, this.aShortArray126);
		this.aByteArray95 = Static271.method3835(this.anInt9800, this.aByteArray95);
		this.aFloatArray67 = Static252.method6529(this.aFloatArray67, this.anInt9800);
		this.aFloatArray68 = Static252.method6529(this.aFloatArray68, this.anInt9800);
		if (arg1.anIntArray259 != null && Static663.method8644(arg2, -1, this.anInt9812)) {
			this.anIntArrayArray53 = arg1.method3293(false);
		}
		if (arg1.aClass60Array1 != null && Static13.method498(this.anInt9812, arg2)) {
			this.anIntArrayArray54 = arg1.method3294();
		}
		if (arg1.anIntArray258 != null && Static658.method8605(this.anInt9812, arg2)) {
			local938 = 0;
			@Pc(3017) int[] local3017 = new int[256];
			for (local960 = 0; local960 < this.anInt9802; local960++) {
				local971 = arg1.anIntArray258[local120[local960]];
				if (local971 >= 0) {
					@Pc(3037) int local3037 = local3017[local971]++;
					if (local971 > local938) {
						local938 = local971;
					}
				}
			}
			this.anIntArrayArray55 = new int[local938 + 1][];
			for (local971 = 0; local971 <= local938; local971++) {
				this.anIntArrayArray55[local971] = new int[local3017[local971]];
				local3017[local971] = 0;
			}
			for (local980 = 0; local980 < this.anInt9802; local980++) {
				local989 = arg1.anIntArray258[local120[local980]];
				if (local989 >= 0) {
					this.anIntArrayArray55[local989][local3017[local989]++] = local980;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0) {
		if (this.anInt9800 == 0) {
			return null;
		}
		if (!this.aBoolean661) {
			this.method8382();
		}
		@Pc(46) int local46;
		@Pc(63) int local63;
		if (this.aClass22_Sub1_39.anInt1007 > 0) {
			local46 = this.aShort111 - (this.aShort109 * this.aClass22_Sub1_39.anInt1007 >> 8) >> this.aClass22_Sub1_39.anInt994;
			local63 = this.aShort113 - (this.aShort104 * this.aClass22_Sub1_39.anInt1007 >> 8) >> this.aClass22_Sub1_39.anInt994;
		} else {
			local46 = this.aShort111 - (this.aClass22_Sub1_39.anInt1007 * this.aShort104 >> 8) >> this.aClass22_Sub1_39.anInt994;
			local63 = this.aShort113 - (this.aShort109 * this.aClass22_Sub1_39.anInt1007 >> 8) >> this.aClass22_Sub1_39.anInt994;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass22_Sub1_39.anInt1021 > 0) {
			local119 = this.aShort107 - (this.aShort109 * this.aClass22_Sub1_39.anInt1021 >> 8) >> this.aClass22_Sub1_39.anInt994;
			local136 = this.aShort105 - (this.aShort104 * this.aClass22_Sub1_39.anInt1021 >> 8) >> this.aClass22_Sub1_39.anInt994;
		} else {
			local119 = this.aShort107 - (this.aClass22_Sub1_39.anInt1021 * this.aShort104 >> 8) >> this.aClass22_Sub1_39.anInt994;
			local136 = this.aShort105 - (this.aClass22_Sub1_39.anInt1021 * this.aShort109 >> 8) >> this.aClass22_Sub1_39.anInt994;
		}
		@Pc(178) int local178 = local63 + 1 - local46;
		@Pc(184) int local184 = local136 + 1 - local119;
		@Pc(187) Class3_Sub7_Sub17_Sub2 local187 = (Class3_Sub7_Sub17_Sub2) arg0;
		@Pc(205) Class3_Sub7_Sub17_Sub2 local205;
		if (local187 != null && local187.method8475(local184, local178)) {
			local205 = local187;
			local187.method8473();
		} else {
			local205 = new Class3_Sub7_Sub17_Sub2(this.aClass22_Sub1_39, local178, local184);
		}
		local205.method8471(local136, local119, local46, local63);
		this.method8373(local205);
		return local205;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "()[Lclient!ip;")
	@Override
	public Class184[] method8354() {
		return this.aClass184Array5;
	}

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean663;
	}

	@OriginalMember(owner = "client!tt", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort108;
	}

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
		this.aShort106 = (short) arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!cl;ZII)Z")
	@Override
	public boolean method8351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8375(arg0, arg5, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tt", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort111;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!uc;)V")
	private void method8373(@OriginalArg(1) Class3_Sub7_Sub17_Sub2 arg0) {
		if (this.anInt9800 > this.aClass22_Sub1_39.anIntArray55.length) {
			this.aClass22_Sub1_39.anIntArray53 = new int[this.anInt9800];
			this.aClass22_Sub1_39.anIntArray55 = new int[this.anInt9800];
		}
		@Pc(34) int[] local34 = this.aClass22_Sub1_39.anIntArray55;
		@Pc(38) int[] local38 = this.aClass22_Sub1_39.anIntArray53;
		@Pc(74) int local74;
		@Pc(112) int local112;
		@Pc(121) int local121;
		for (@Pc(40) int local40 = 0; local40 < this.anInt9825; local40++) {
			local74 = (this.anIntArray706[local40] - (this.aClass22_Sub1_39.anInt1007 * this.anIntArray708[local40] >> 8) >> this.aClass22_Sub1_39.anInt994) - arg0.anInt9949;
			@Pc(98) int local98 = (this.anIntArray710[local40] - (this.aClass22_Sub1_39.anInt1021 * this.anIntArray708[local40] >> 8) >> this.aClass22_Sub1_39.anInt994) - arg0.anInt9951;
			@Pc(103) int local103 = this.anIntArray707[local40];
			@Pc(110) int local110 = this.anIntArray707[local40 + 1];
			for (local112 = local103; local112 < local110; local112++) {
				local121 = this.aShortArray129[local112] - 1;
				if (local121 == -1) {
					break;
				}
				local34[local121] = local74;
				local38[local121] = local98;
			}
		}
		for (local74 = 0; local74 < this.anInt9784; local74++) {
			if (this.aByteArray94 == null || this.aByteArray94[local74] <= 128) {
				@Pc(176) short local176 = this.aShortArray125[local74];
				@Pc(181) short local181 = this.aShortArray122[local74];
				@Pc(186) short local186 = this.aShortArray128[local74];
				local112 = local34[local176];
				local121 = local34[local181];
				@Pc(198) int local198 = local34[local186];
				@Pc(202) int local202 = local38[local176];
				@Pc(206) int local206 = local38[local181];
				@Pc(210) int local210 = local38[local186];
				if (-((local206 - local202) * (local198 + -local121)) + (local206 - local210) * (local112 + -local121) > 0) {
					arg0.method8472(local206, local202, local198, local112, local121, local210);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	private void method8374() {
		if (this.anInt9784 == 0) {
			return;
		}
		if (this.aByte136 != 0) {
			this.method8378(true);
		}
		this.method8378(false);
		if (this.aClass148_1 != null) {
			if (this.aClass148_1.anInterface27_3 == null) {
				this.method8381((this.aByte136 & 0x10) != 0);
			}
			if (this.aClass148_1.anInterface27_3 != null) {
				this.aClass22_Sub1_39.method949(this.aClass287_11 != null);
				this.aClass22_Sub1_39.method919(this.aClass287_12, this.aClass287_11, this.aClass287_10, this.aClass287_9);
				@Pc(89) int local89 = this.anIntArray709.length - 1;
				for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
					@Pc(98) int local98 = this.anIntArray709[local91];
					@Pc(105) int local105 = this.anIntArray709[local91 + 1];
					@Pc(112) int local112 = this.aShortArray120[local98] & 0xFFFF;
					if (local112 == 65535) {
						local112 = -1;
					}
					this.aClass22_Sub1_39.method899(local112, this.aClass287_11 != null);
					this.aClass22_Sub1_39.method957(local98 * 3, this.aClass148_1.anInterface27_3, (local105 - local98) * 3);
				}
			}
		}
		this.method8379();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8355(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class170_Sub3 local8 = (Class170_Sub3) arg0;
		if (this.anInt9802 == 0 || local8.anInt9802 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt9825;
		@Pc(27) int[] local27 = local8.anIntArray706;
		@Pc(30) int[] local30 = local8.anIntArray708;
		@Pc(33) int[] local33 = local8.anIntArray710;
		@Pc(36) short[] local36 = local8.aShortArray123;
		@Pc(39) short[] local39 = local8.aShortArray130;
		@Pc(42) short[] local42 = local8.aShortArray126;
		@Pc(45) byte[] local45 = local8.aByteArray95;
		@Pc(54) short[] local54;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(50) byte[] local50;
		if (this.aClass235_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass235_1.aShortArray73;
			local52 = this.aClass235_1.aShortArray72;
			local50 = this.aClass235_1.aByteArray57;
			local54 = this.aClass235_1.aShortArray74;
		}
		@Pc(85) short[] local85;
		@Pc(89) short[] local89;
		@Pc(93) short[] local93;
		@Pc(81) byte[] local81;
		if (local8.aClass235_1 == null) {
			local93 = null;
			local89 = null;
			local85 = null;
			local81 = null;
		} else {
			local81 = local8.aClass235_1.aByteArray57;
			local85 = local8.aClass235_1.aShortArray74;
			local89 = local8.aClass235_1.aShortArray73;
			local93 = local8.aClass235_1.aShortArray72;
		}
		@Pc(106) int[] local106 = local8.anIntArray707;
		@Pc(109) short[] local109 = local8.aShortArray129;
		if (!local8.aBoolean661) {
			local8.method8382();
		}
		@Pc(120) short local120 = local8.aShort104;
		@Pc(123) short local123 = local8.aShort109;
		@Pc(126) short local126 = local8.aShort111;
		@Pc(129) short local129 = local8.aShort113;
		@Pc(132) short local132 = local8.aShort107;
		@Pc(135) short local135 = local8.aShort105;
		for (@Pc(137) int local137 = 0; local137 < this.anInt9825; local137++) {
			@Pc(147) int local147 = this.anIntArray708[local137] - arg2;
			if (local147 >= local120 && local123 >= local147) {
				@Pc(175) int local175 = this.anIntArray706[local137] - arg1;
				if (local126 <= local175 && local175 <= local129) {
					@Pc(199) int local199 = this.anIntArray710[local137] - arg3;
					if (local199 >= local132 && local135 >= local199) {
						@Pc(217) int local217 = -1;
						@Pc(222) int local222 = this.anIntArray707[local137];
						@Pc(229) int local229 = this.anIntArray707[local137 + 1];
						for (@Pc(231) int local231 = local222; local231 < local229; local231++) {
							local217 = this.aShortArray129[local231] - 1;
							if (local217 == -1 || this.aByteArray95[local217] != 0) {
								break;
							}
						}
						if (local217 != -1) {
							for (@Pc(268) int local268 = 0; local268 < local24; local268++) {
								if (local27[local268] == local175 && local33[local268] == local199 && local147 == local30[local268]) {
									local229 = local106[local268 + 1];
									local222 = local106[local268];
									@Pc(307) int local307 = -1;
									for (@Pc(309) int local309 = local222; local309 < local229; local309++) {
										local307 = local109[local309] - 1;
										if (local307 == -1 || local45[local307] != 0) {
											break;
										}
									}
									if (local307 != -1) {
										if (local54 == null) {
											this.aClass235_1 = new Class235();
											local54 = this.aClass235_1.aShortArray74 = Static638.method8410(this.aShortArray123);
											local56 = this.aClass235_1.aShortArray73 = Static638.method8410(this.aShortArray130);
											local52 = this.aClass235_1.aShortArray72 = Static638.method8410(this.aShortArray126);
											local50 = this.aClass235_1.aByteArray57 = Static532.method7079(this.aByteArray95);
										}
										if (local85 == null) {
											@Pc(403) Class235 local403 = local8.aClass235_1 = new Class235();
											local85 = local403.aShortArray74 = Static638.method8410(local36);
											local89 = local403.aShortArray73 = Static638.method8410(local39);
											local93 = local403.aShortArray72 = Static638.method8410(local42);
											local81 = local403.aByteArray57 = Static532.method7079(local45);
										}
										@Pc(436) short local436 = this.aShortArray123[local217];
										@Pc(441) short local441 = this.aShortArray130[local217];
										@Pc(446) short local446 = this.aShortArray126[local217];
										local222 = local106[local268];
										local229 = local106[local268 + 1];
										@Pc(461) byte local461 = this.aByteArray95[local217];
										@Pc(471) int local471;
										for (@Pc(463) int local463 = local222; local463 < local229; local463++) {
											local471 = local109[local463] - 1;
											if (local471 == -1) {
												break;
											}
											if (local81[local471] != 0) {
												local85[local471] += local436;
												local89[local471] += local441;
												local93[local471] += local446;
												local81[local471] += local461;
											}
										}
										local222 = this.anIntArray707[local137];
										local229 = this.anIntArray707[local137 + 1];
										local436 = local36[local307];
										local441 = local39[local307];
										local461 = local45[local307];
										local446 = local42[local307];
										for (local471 = local222; local471 < local229; local471++) {
											@Pc(562) int local562 = this.aShortArray129[local471] - 1;
											if (local562 == -1) {
												break;
											}
											if (local50[local562] != 0) {
												local54[local562] += local436;
												local56[local562] += local441;
												local52[local562] += local446;
												local50[local562] += local461;
											}
										}
										if (this.aClass287_11 == null && this.aClass287_9 != null) {
											this.aClass287_9.anInterface13_5 = null;
										}
										if (this.aClass287_11 != null) {
											this.aClass287_11.anInterface13_5 = null;
										}
										if (local8.aClass287_11 == null && local8.aClass287_9 != null) {
											local8.aClass287_9.anInterface13_5 = null;
										}
										if (local8.aClass287_11 != null) {
											local8.aClass287_11.anInterface13_5 = null;
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

	@OriginalMember(owner = "client!tt", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort108 = (short) arg0;
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
		if (this.aClass287_11 != null) {
			this.aClass287_11.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILclient!cl;ZZI)Z")
	private boolean method8375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class58 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class58_Sub3 local8 = (Class58_Sub3) arg3;
		@Pc(12) Class58_Sub3 local12 = this.aClass22_Sub1_39.aClass58_Sub3_3;
		@Pc(33) float local33 = local12.aFloat201 * local8.aFloat205 + local12.aFloat199 * local8.aFloat208 + local8.aFloat209 * local12.aFloat198 + local12.aFloat209;
		@Pc(54) float local54 = local8.aFloat209 * local12.aFloat206 + local12.aFloat202 * local8.aFloat208 + local12.aFloat203 * local8.aFloat205 + local12.aFloat208;
		Static245.aFloat62 = local8.aFloat204 * local12.aFloat201 + local8.aFloat198 * local12.aFloat198 + local8.aFloat206 * local12.aFloat199;
		Static33.aFloat33 = local12.aFloat199 * local8.aFloat203 + local8.aFloat201 * local12.aFloat198 + local12.aFloat201 * local8.aFloat200;
		Static339.aFloat97 = local8.aFloat207 * local12.aFloat201 + local12.aFloat198 * local8.aFloat199 + local8.aFloat202 * local12.aFloat199;
		Static336.aFloat90 = local12.aFloat200 * local8.aFloat200 + local8.aFloat203 * local12.aFloat207 + local8.aFloat201 * local12.aFloat204;
		Static594.aFloat125 = local8.aFloat202 * local12.aFloat202 + local8.aFloat199 * local12.aFloat206 + local8.aFloat207 * local12.aFloat203;
		Static532.aFloat128 = local12.aFloat203 * local8.aFloat200 + local8.aFloat203 * local12.aFloat202 + local12.aFloat206 * local8.aFloat201;
		@Pc(183) float local183 = local12.aFloat205 + local12.aFloat207 * local8.aFloat208 + local8.aFloat209 * local12.aFloat204 + local12.aFloat200 * local8.aFloat205;
		Static282.aFloat42 = local12.aFloat203 * local8.aFloat204 + local12.aFloat206 * local8.aFloat198 + local8.aFloat206 * local12.aFloat202;
		Static65.aFloat135 = local12.aFloat200 * local8.aFloat204 + local8.aFloat198 * local12.aFloat204 + local8.aFloat206 * local12.aFloat207;
		Static555.aFloat124 = local12.aFloat207 * local8.aFloat202 + local12.aFloat204 * local8.aFloat199 + local12.aFloat200 * local8.aFloat207;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass22_Sub1_39.anInt1031;
		@Pc(255) int local255 = this.aClass22_Sub1_39.anInt1030;
		if (!this.aBoolean661) {
			this.method8382();
		}
		@Pc(272) int local272 = this.aShort113 - this.aShort111 >> 1;
		@Pc(281) int local281 = this.aShort109 - this.aShort104 >> 1;
		@Pc(290) int local290 = this.aShort105 - this.aShort107 >> 1;
		@Pc(295) int local295 = local272 + this.aShort111;
		@Pc(300) int local300 = local281 + this.aShort104;
		@Pc(306) int local306 = this.aShort107 + local290;
		@Pc(313) int local313 = local295 - (local272 << arg5);
		@Pc(319) int local319 = local300 - (local281 << arg5);
		@Pc(325) int local325 = local306 - (local290 << arg5);
		@Pc(331) int local331 = (local272 << arg5) + local295;
		@Pc(338) int local338 = local300 + (local281 << arg5);
		Static418.anIntArray491[0] = local313;
		@Pc(348) int local348 = (local290 << arg5) + local306;
		Static588.anIntArray652[0] = local319;
		Static418.anIntArray491[1] = local331;
		Static723.anIntArray795[0] = local325;
		Static588.anIntArray652[1] = local319;
		Static723.anIntArray795[1] = local325;
		Static418.anIntArray491[2] = local313;
		Static588.anIntArray652[2] = local338;
		Static723.anIntArray795[2] = local325;
		Static418.anIntArray491[3] = local331;
		Static588.anIntArray652[3] = local338;
		Static418.anIntArray491[4] = local313;
		Static723.anIntArray795[3] = local325;
		Static588.anIntArray652[4] = local319;
		Static723.anIntArray795[4] = local348;
		Static418.anIntArray491[5] = local331;
		Static588.anIntArray652[5] = local319;
		Static418.anIntArray491[6] = local313;
		Static723.anIntArray795[5] = local348;
		Static588.anIntArray652[6] = local338;
		Static418.anIntArray491[7] = local331;
		Static723.anIntArray795[6] = local348;
		Static588.anIntArray652[7] = local338;
		Static723.anIntArray795[7] = local348;
		@Pc(489) float local489;
		@Pc(503) float local503;
		@Pc(475) float local475;
		@Pc(461) float local461;
		@Pc(451) float local451;
		@Pc(456) float local456;
		for (@Pc(442) int local442 = 0; local442 < 8; local442++) {
			local451 = (float) Static588.anIntArray652[local442];
			local456 = (float) Static723.anIntArray795[local442];
			local461 = (float) Static418.anIntArray491[local442];
			local475 = Static336.aFloat90 * local456 + Static555.aFloat124 * local451 + Static65.aFloat135 * local461 + local183;
			local489 = local33 + Static33.aFloat33 * local456 + local451 * Static339.aFloat97 + local461 * Static245.aFloat62;
			local503 = local54 + Static282.aFloat42 * local461 + local451 * Static594.aFloat125 + local456 * Static532.aFloat128;
			if ((float) this.aClass22_Sub1_39.anInt1006 <= local475) {
				if (arg1 > 0) {
					local475 = (float) arg1;
				}
				@Pc(529) float local529 = (float) local251 * local489 / local475 + (float) this.aClass22_Sub1_39.anInt1035;
				if (local241 > local529) {
					local241 = local529;
				}
				if (local529 > local243) {
					local243 = local529;
				}
				@Pc(553) float local553 = local503 * (float) local255 / local475 + (float) this.aClass22_Sub1_39.anInt1023;
				local239 = true;
				if (local553 < local245) {
					local245 = local553;
				}
				if (local247 < local553) {
					local247 = local553;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg4) {
				return true;
			}
			if (this.anInt9800 > this.aClass22_Sub1_39.anIntArray55.length) {
				this.aClass22_Sub1_39.anIntArray55 = new int[this.anInt9800];
				this.aClass22_Sub1_39.anIntArray53 = new int[this.anInt9800];
			}
			@Pc(641) int[] local641 = this.aClass22_Sub1_39.anIntArray55;
			@Pc(645) int[] local645 = this.aClass22_Sub1_39.anIntArray53;
			@Pc(738) int local738;
			for (@Pc(647) int local647 = 0; local647 < this.anInt9825; local647++) {
				local461 = (float) this.anIntArray706[local647];
				local451 = (float) this.anIntArray708[local647];
				local456 = (float) this.anIntArray710[local647];
				local489 = local33 + Static33.aFloat33 * local456 + Static245.aFloat62 * local461 + Static339.aFloat97 * local451;
				local475 = Static336.aFloat90 * local456 + Static555.aFloat124 * local451 + local461 * Static65.aFloat135 + local183;
				local503 = local54 + Static594.aFloat125 * local451 + local461 * Static282.aFloat42 + Static532.aFloat128 * local456;
				@Pc(751) int local751;
				@Pc(756) int local756;
				@Pc(763) int local763;
				if ((float) this.aClass22_Sub1_39.anInt1006 <= local475) {
					if (arg1 > 0) {
						local475 = (float) arg1;
					}
					local738 = (int) ((float) local251 * local489 / local475 + (float) this.aClass22_Sub1_39.anInt1035);
					local751 = (int) ((float) this.aClass22_Sub1_39.anInt1023 + (float) local255 * local503 / local475);
					local756 = this.anIntArray707[local647];
					local763 = this.anIntArray707[local647 + 1];
					for (@Pc(765) int local765 = local756; local765 < local763; local765++) {
						@Pc(774) int local774 = this.aShortArray129[local765] - 1;
						if (local774 == -1) {
							break;
						}
						local641[local774] = local738;
						local645[local774] = local751;
					}
				} else {
					local738 = this.anIntArray707[local647];
					local751 = this.anIntArray707[local647 + 1];
					for (local756 = local738; local756 < local751; local756++) {
						local763 = this.aShortArray129[local756] - 1;
						if (local763 == -1) {
							break;
						}
						local641[this.aShortArray129[local756] - 1] = -999999;
					}
				}
			}
			for (local738 = 0; local738 < this.anInt9802; local738++) {
				if (local641[this.aShortArray125[local738]] != -999999 && local641[this.aShortArray122[local738]] != -999999 && local641[this.aShortArray128[local738]] != -999999 && this.method8377(local641[this.aShortArray125[local738]], local641[this.aShortArray122[local738]], local641[this.aShortArray128[local738]], local645[this.aShortArray122[local738]], local645[this.aShortArray125[local738]], arg0, arg2, local645[this.aShortArray128[local738]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt9802; local7++) {
			local16 = this.aShortArray121[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			@Pc(62) int local62 = local16 & 0x7F;
			if (arg2 != -1) {
				local62 += arg3 * (arg2 - local62) >> 7;
			}
			this.aShortArray121[local7] = (short) (local28 << 7 | local22 << 10 | local62);
		}
		if (this.aClass404Array1 != null) {
			for (local16 = 0; local16 < this.anInt9834; local16++) {
				@Pc(113) Class404 local113 = this.aClass404Array1[local16];
				@Pc(118) Class179 local118 = this.aClass179Array1[local16];
				local118.anInt4267 = Static537.anIntArray601[this.aShortArray121[local113.anInt11136] & 0xFFFF] & 0xFFFFFF | local118.anInt4267 & 0xFF000000;
			}
		}
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort110;
	}

	@OriginalMember(owner = "client!tt", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9802; local3++) {
			if (this.aShortArray121[local3] == arg0) {
				this.aShortArray121[local3] = arg1;
			}
		}
		if (this.aClass404Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.anInt9834; local46++) {
				@Pc(53) Class404 local53 = this.aClass404Array1[local46];
				@Pc(58) Class179 local58 = this.aClass179Array1[local46];
				local58.anInt4267 = local58.anInt4267 & 0xFF000000 | Static537.anIntArray601[this.aShortArray121[local53.anInt11136] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(43) int local43;
		@Pc(55) int local55;
		@Pc(53) int[] local53;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local27 = 0;
			Static2.anInt11 = 0;
			Static487.anInt7666 = 0;
			Static535.anInt10663 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray53.length > local43) {
					local53 = this.anIntArrayArray53[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						if (this.aShortArray124 == null || (this.aShortArray124[local61] & arg6) != 0) {
							Static2.anInt11 += this.anIntArray706[local61];
							Static487.anInt7666 += this.anIntArray708[local61];
							local27++;
							Static535.anInt10663 += this.anIntArray710[local61];
						}
					}
				}
			}
			if (local27 > 0) {
				Static2.anInt11 = Static2.anInt11 / local27 + arg2;
				Static570.aBoolean581 = true;
				Static535.anInt10663 = Static535.anInt10663 / local27 + arg4;
				Static487.anInt7666 = arg3 + Static487.anInt7666 / local27;
			} else {
				Static535.anInt10663 = arg4;
				Static487.anInt7666 = arg3;
				Static2.anInt11 = arg2;
			}
			return;
		}
		@Pc(260) int[] local260;
		@Pc(262) int local262;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg4 * arg7[2] + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local43 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg2 = local27;
				arg4 = local43;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray53.length > local35) {
					local260 = this.anIntArrayArray53[local35];
					for (local262 = 0; local262 < local260.length; local262++) {
						local55 = local260[local262];
						if (this.aShortArray124 == null || (this.aShortArray124[local55] & arg6) != 0) {
							this.anIntArray706[local55] += arg2;
							this.anIntArray708[local55] += arg3;
							this.anIntArray710[local55] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(397) int local397;
		@Pc(420) int local420;
		@Pc(442) int local442;
		@Pc(477) int local477;
		@Pc(481) int local481;
		@Pc(485) int local485;
		@Pc(489) int local489;
		@Pc(497) int local497;
		@Pc(505) int local505;
		@Pc(661) int local661;
		@Pc(687) int local687;
		@Pc(691) int local691;
		@Pc(700) int local700;
		@Pc(705) int local705;
		@Pc(709) int local709;
		@Pc(713) int local713;
		@Pc(715) int local715;
		@Pc(850) int[] local850;
		@Pc(852) int local852;
		@Pc(858) int local858;
		@Pc(862) int local862;
		@Pc(864) int local864;
		@Pc(998) int local998;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray53.length) {
						local260 = this.anIntArrayArray53[local35];
						for (local262 = 0; local262 < local260.length; local262++) {
							local55 = local260[local262];
							if (this.aShortArray124 == null || (this.aShortArray124[local55] & arg6) != 0) {
								this.anIntArray706[local55] -= Static2.anInt11;
								this.anIntArray708[local55] -= Static487.anInt7666;
								this.anIntArray710[local55] -= Static535.anInt10663;
								if (arg4 != 0) {
									local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
									local397 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
									local420 = local61 * this.anIntArray708[local55] + local397 * this.anIntArray706[local55] + 16383 >> 14;
									this.anIntArray708[local55] = this.anIntArray708[local55] * local397 + 16383 - local61 * this.anIntArray706[local55] >> 14;
									this.anIntArray706[local55] = local420;
								}
								if (arg2 != 0) {
									local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
									local397 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
									local420 = this.anIntArray708[local55] * local397 + 16383 - this.anIntArray710[local55] * local61 >> 14;
									this.anIntArray710[local55] = local397 * this.anIntArray710[local55] + local61 * this.anIntArray708[local55] + 16383 >> 14;
									this.anIntArray708[local55] = local420;
								}
								if (arg3 != 0) {
									local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
									local397 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
									local420 = this.anIntArray710[local55] * local61 + local397 * this.anIntArray706[local55] + 16383 >> 14;
									this.anIntArray710[local55] = this.anIntArray710[local55] * local397 + 16383 - this.anIntArray706[local55] * local61 >> 14;
									this.anIntArray706[local55] = local420;
								}
								this.anIntArray706[local55] += Static2.anInt11;
								this.anIntArray708[local55] += Static487.anInt7666;
								this.anIntArray710[local55] += Static535.anInt10663;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray53.length) {
							local53 = this.anIntArrayArray53[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray124 == null || (this.aShortArray124[local61] & arg6) != 0) {
									local397 = this.anIntArray707[local61];
									local420 = this.anIntArray707[local61 + 1];
									for (local442 = local397; local442 < local420; local442++) {
										local477 = this.aShortArray129[local442] - 1;
										if (local477 == -1) {
											break;
										}
										if (arg4 != 0) {
											local481 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
											local485 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
											local489 = this.aShortArray130[local477] * local481 + local485 * this.aShortArray123[local477] + 16383 >> 14;
											this.aShortArray130[local477] = (short) (this.aShortArray130[local477] * local485 + 16383 - this.aShortArray123[local477] * local481 >> 14);
											this.aShortArray123[local477] = (short) local489;
										}
										if (arg2 != 0) {
											local481 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
											local485 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
											local489 = this.aShortArray130[local477] * local485 + 16383 - this.aShortArray126[local477] * local481 >> 14;
											this.aShortArray126[local477] = (short) (this.aShortArray126[local477] * local485 + local481 * this.aShortArray130[local477] + 16383 >> 14);
											this.aShortArray130[local477] = (short) local489;
										}
										if (arg3 != 0) {
											local481 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
											local485 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
											local489 = this.aShortArray123[local477] * local485 + local481 * this.aShortArray126[local477] + 16383 >> 14;
											this.aShortArray126[local477] = (short) (local485 * this.aShortArray126[local477] + 16383 - local481 * this.aShortArray123[local477] >> 14);
											this.aShortArray123[local477] = (short) local489;
										}
									}
								}
							}
						}
					}
					if (this.aClass287_11 == null && this.aClass287_9 != null) {
						this.aClass287_9.anInterface13_5 = null;
					}
					if (this.aClass287_11 != null) {
						this.aClass287_11.anInterface13_5 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local262 = arg7[12] << 4;
				local55 = arg7[13] << 4;
				local61 = arg7[14] << 4;
				if (Static570.aBoolean581) {
					local397 = arg7[6] * Static535.anInt10663 + Static487.anInt7666 * arg7[3] + arg7[0] * Static2.anInt11 + 8192 >> 14;
					local420 = Static487.anInt7666 * arg7[4] + arg7[1] * Static2.anInt11 + Static535.anInt10663 * arg7[7] + 8192 >> 14;
					local442 = arg7[8] * Static535.anInt10663 + Static487.anInt7666 * arg7[5] + arg7[2] * Static2.anInt11 + 8192 >> 14;
					local397 += local262;
					local420 += local55;
					Static2.anInt11 = local397;
					Static487.anInt7666 = local420;
					local442 += local61;
					Static570.aBoolean581 = false;
					Static535.anInt10663 = local442;
				}
				@Pc(465) int[] local465 = new int[9];
				local420 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
				local442 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
				local477 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
				local481 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
				local485 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
				local489 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
				local497 = local442 * local485 + 8192 >> 14;
				local505 = local442 * local489 + 8192 >> 14;
				local465[0] = local485 * local477 + local505 * local481 + 8192 >> 14;
				local465[8] = local420 * local477 + 8192 >> 14;
				local465[3] = local489 * local420 + 8192 >> 14;
				local465[5] = -local442;
				local465[2] = local481 * local420 + 8192 >> 14;
				local465[1] = local489 * -local477 + local497 * local481 + 8192 >> 14;
				local465[6] = local485 * -local481 + local477 * local505 + 8192 >> 14;
				local465[7] = local497 * local477 + local481 * local489 + 8192 >> 14;
				local465[4] = local485 * local420 + 8192 >> 14;
				@Pc(636) int local636 = local465[2] * -Static535.anInt10663 + -Static487.anInt7666 * local465[1] + local465[0] * -Static2.anInt11 + 8192 >> 14;
				local661 = -Static487.anInt7666 * local465[4] + local465[3] * -Static2.anInt11 + local465[5] * -Static535.anInt10663 + 8192 >> 14;
				local687 = -Static2.anInt11 * local465[6] + -Static487.anInt7666 * local465[7] + local465[8] * -Static535.anInt10663 + 8192 >> 14;
				local691 = local636 + Static2.anInt11;
				@Pc(696) int local696 = local661 + Static487.anInt7666;
				local700 = Static535.anInt10663 + local687;
				@Pc(703) int[] local703 = new int[9];
				for (local705 = 0; local705 < 3; local705++) {
					for (local709 = 0; local709 < 3; local709++) {
						local713 = 0;
						for (local715 = 0; local715 < 3; local715++) {
							local713 += local465[local715 + local705 * 3] * arg7[local715 + local709 * 3];
						}
						local703[local705 * 3 + local709] = local713 + 8192 >> 14;
					}
				}
				local709 = local55 * local465[1] + local262 * local465[0] + local61 * local465[2] + 8192 >> 14;
				local713 = local55 * local465[4] + local465[3] * local262 + local465[5] * local61 + 8192 >> 14;
				local709 += local691;
				local713 += local696;
				local715 = local262 * local465[6] + local55 * local465[7] + local61 * local465[8] + 8192 >> 14;
				local715 += local700;
				local850 = new int[9];
				for (local852 = 0; local852 < 3; local852++) {
					for (local858 = 0; local858 < 3; local858++) {
						local862 = 0;
						for (local864 = 0; local864 < 3; local864++) {
							local862 += local703[local858 + local864 * 3] * arg7[local852 * 3 + local864];
						}
						local850[local852 * 3 + local858] = local862 + 8192 >> 14;
					}
				}
				local858 = local709 * arg7[0] + local713 * arg7[1] + arg7[2] * local715 + 8192 >> 14;
				local862 = arg7[3] * local709 + local713 * arg7[4] + local715 * arg7[5] + 8192 >> 14;
				local862 += local35;
				local864 = local715 * arg7[8] + local713 * arg7[7] + arg7[6] * local709 + 8192 >> 14;
				local858 += local27;
				local864 += local43;
				for (local998 = 0; local998 < local8; local998++) {
					@Pc(1006) int local1006 = arg1[local998];
					if (local1006 < this.anIntArrayArray53.length) {
						@Pc(1016) int[] local1016 = this.anIntArrayArray53[local1006];
						for (@Pc(1018) int local1018 = 0; local1018 < local1016.length; local1018++) {
							@Pc(1024) int local1024 = local1016[local1018];
							if (this.aShortArray124 == null || (this.aShortArray124[local1024] & arg6) != 0) {
								@Pc(1067) int local1067 = local850[2] * this.anIntArray710[local1024] + local850[0] * this.anIntArray706[local1024] + local850[1] * this.anIntArray708[local1024] + 8192 >> 14;
								@Pc(1098) int local1098 = this.anIntArray710[local1024] * local850[5] + this.anIntArray706[local1024] * local850[3] + this.anIntArray708[local1024] * local850[4] + 8192 >> 14;
								@Pc(1129) int local1129 = this.anIntArray706[local1024] * local850[6] + this.anIntArray708[local1024] * local850[7] + this.anIntArray710[local1024] * local850[8] + 8192 >> 14;
								@Pc(1133) int local1133 = local1067 + local858;
								@Pc(1137) int local1137 = local1098 + local862;
								@Pc(1141) int local1141 = local1129 + local864;
								this.anIntArray706[local1024] = local1133;
								this.anIntArray708[local1024] = local1137;
								this.anIntArray710[local1024] = local1141;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2681) Class404 local2681;
			@Pc(2686) Class179 local2686;
			if (arg0 == 5) {
				if (this.anIntArrayArray55 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray55.length > local35) {
							local260 = this.anIntArrayArray55[local35];
							for (local262 = 0; local262 < local260.length; local262++) {
								local55 = local260[local262];
								if (this.aShortArray127 == null || (this.aShortArray127[local55] & arg6) != 0) {
									local61 = (this.aByteArray94[local55] & 0xFF) + arg2 * 8;
									if (local61 < 0) {
										local61 = 0;
									} else if (local61 > 255) {
										local61 = 255;
									}
									this.aByteArray94[local55] = (byte) local61;
									if (this.aClass287_9 != null) {
										this.aClass287_9.anInterface13_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass404Array1 != null) {
						for (local35 = 0; local35 < this.anInt9834; local35++) {
							local2681 = this.aClass404Array1[local35];
							local2686 = this.aClass179Array1[local35];
							local2686.anInt4267 = local2686.anInt4267 & 0xFFFFFF | 255 - (this.aByteArray94[local2681.anInt11136] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2970) Class179 local2970;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray54.length > local35) {
								local260 = this.anIntArrayArray54[local35];
								for (local262 = 0; local262 < local260.length; local262++) {
									local2970 = this.aClass179Array1[local260[local262]];
									local2970.anInt4269 += arg2;
									local2970.anInt4268 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray54.length) {
								local260 = this.anIntArrayArray54[local35];
								for (local262 = 0; local262 < local260.length; local262++) {
									local2970 = this.aClass179Array1[local260[local262]];
									local2970.anInt4266 = arg3 * local2970.anInt4266 >> 7;
									local2970.anInt4271 = arg2 * local2970.anInt4271 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray54.length) {
							local260 = this.anIntArrayArray54[local35];
							for (local262 = 0; local262 < local260.length; local262++) {
								local2970 = this.aClass179Array1[local260[local262]];
								local2970.anInt4265 = arg2 + local2970.anInt4265 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray55 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray55.length) {
						local260 = this.anIntArrayArray55[local35];
						for (local262 = 0; local262 < local260.length; local262++) {
							local55 = local260[local262];
							if (this.aShortArray127 == null || (this.aShortArray127[local55] & arg6) != 0) {
								local61 = this.aShortArray121[local55] & 0xFFFF;
								local397 = local61 >> 10 & 0x3F;
								local420 = local61 >> 7 & 0x7;
								local420 += arg3 / 4;
								@Pc(2801) int local2801 = local397 + arg2 & 0x3F;
								local442 = local61 & 0x7F;
								local442 += arg4;
								if (local420 < 0) {
									local420 = 0;
								} else if (local420 > 7) {
									local420 = 7;
								}
								if (local442 < 0) {
									local442 = 0;
								} else if (local442 > 127) {
									local442 = 127;
								}
								this.aShortArray121[local55] = (short) (local442 | local2801 << 10 | local420 << 7);
								if (this.aClass287_9 != null) {
									this.aClass287_9.anInterface13_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass404Array1 != null) {
					for (local35 = 0; local35 < this.anInt9834; local35++) {
						local2681 = this.aClass404Array1[local35];
						local2686 = this.aClass179Array1[local35];
						local2686.anInt4267 = local2686.anInt4267 & 0xFF000000 | Static537.anIntArray601[this.aShortArray121[local2681.anInt11136] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray53.length > local35) {
					local260 = this.anIntArrayArray53[local35];
					for (local262 = 0; local262 < local260.length; local262++) {
						local55 = local260[local262];
						if (this.aShortArray124 == null || (this.aShortArray124[local55] & arg6) != 0) {
							this.anIntArray706[local55] -= Static2.anInt11;
							this.anIntArray708[local55] -= Static487.anInt7666;
							this.anIntArray710[local55] -= Static535.anInt10663;
							this.anIntArray706[local55] = arg2 * this.anIntArray706[local55] >> 7;
							this.anIntArray708[local55] = arg3 * this.anIntArray708[local55] >> 7;
							this.anIntArray710[local55] = arg4 * this.anIntArray710[local55] >> 7;
							this.anIntArray706[local55] += Static2.anInt11;
							this.anIntArray708[local55] += Static487.anInt7666;
							this.anIntArray710[local55] += Static535.anInt10663;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local262 = arg7[12] << 4;
			local55 = arg7[13] << 4;
			local61 = arg7[14] << 4;
			if (Static570.aBoolean581) {
				local397 = arg7[6] * Static535.anInt10663 + Static2.anInt11 * arg7[0] + arg7[3] * Static487.anInt7666 + 8192 >> 14;
				local420 = arg7[1] * Static2.anInt11 + Static487.anInt7666 * arg7[4] + arg7[7] * Static535.anInt10663 + 8192 >> 14;
				local397 += local262;
				local420 += local55;
				local442 = Static2.anInt11 * arg7[2] + arg7[5] * Static487.anInt7666 + arg7[8] * Static535.anInt10663 + 8192 >> 14;
				local442 += local61;
				Static2.anInt11 = local397;
				Static487.anInt7666 = local420;
				Static570.aBoolean581 = false;
				Static535.anInt10663 = local442;
			}
			local397 = arg2 << 15 >> 7;
			local420 = arg3 << 15 >> 7;
			local442 = arg4 << 15 >> 7;
			local477 = -Static2.anInt11 * local397 + 8192 >> 14;
			local481 = local420 * -Static487.anInt7666 + 8192 >> 14;
			local485 = local442 * -Static535.anInt10663 + 8192 >> 14;
			local489 = local477 + Static2.anInt11;
			local497 = Static487.anInt7666 + local481;
			local505 = Static535.anInt10663 + local485;
			@Pc(1941) int[] local1941 = new int[] { arg7[0] * local397 + 8192 >> 14, local397 * arg7[3] + 8192 >> 14, local397 * arg7[6] + 8192 >> 14, local420 * arg7[1] + 8192 >> 14, arg7[4] * local420 + 8192 >> 14, arg7[7] * local420 + 8192 >> 14, arg7[2] * local442 + 8192 >> 14, local442 * arg7[5] + 8192 >> 14, local442 * arg7[8] + 8192 >> 14 };
			local661 = local397 * local262 + 8192 >> 14;
			local687 = local55 * local420 + 8192 >> 14;
			@Pc(2069) int local2069 = local661 + local489;
			local691 = local61 * local442 + 8192 >> 14;
			@Pc(2081) int local2081 = local687 + local497;
			@Pc(2085) int local2085 = local691 + local505;
			@Pc(2088) int[] local2088 = new int[9];
			@Pc(2094) int local2094;
			for (local700 = 0; local700 < 3; local700++) {
				for (local2094 = 0; local2094 < 3; local2094++) {
					local705 = 0;
					for (local709 = 0; local709 < 3; local709++) {
						local705 += local1941[local709 * 3 + local2094] * arg7[local700 * 3 + local709];
					}
					local2088[local700 * 3 + local2094] = local705 + 8192 >> 14;
				}
			}
			local2094 = local2085 * arg7[2] + local2081 * arg7[1] + arg7[0] * local2069 + 8192 >> 14;
			local705 = local2085 * arg7[5] + local2081 * arg7[4] + arg7[3] * local2069 + 8192 >> 14;
			local2094 += local27;
			local705 += local35;
			local709 = arg7[7] * local2081 + arg7[6] * local2069 + local2085 * arg7[8] + 8192 >> 14;
			local709 += local43;
			for (local713 = 0; local713 < local8; local713++) {
				local715 = arg1[local713];
				if (this.anIntArrayArray53.length > local715) {
					local850 = this.anIntArrayArray53[local715];
					for (local852 = 0; local852 < local850.length; local852++) {
						local858 = local850[local852];
						if (this.aShortArray124 == null || (this.aShortArray124[local858] & arg6) != 0) {
							local862 = this.anIntArray708[local858] * local2088[1] + this.anIntArray706[local858] * local2088[0] + this.anIntArray710[local858] * local2088[2] + 8192 >> 14;
							local864 = local2088[3] * this.anIntArray706[local858] + this.anIntArray708[local858] * local2088[4] + this.anIntArray710[local858] * local2088[5] + 8192 >> 14;
							local998 = this.anIntArray708[local858] * local2088[7] + local2088[6] * this.anIntArray706[local858] + local2088[8] * this.anIntArray710[local858] + 8192 >> 14;
							@Pc(2375) int local2375 = local864 + local705;
							@Pc(2379) int local2379 = local862 + local2094;
							@Pc(2383) int local2383 = local998 + local709;
							this.anIntArray706[local858] = local2379;
							this.anIntArray708[local858] = local2375;
							this.anIntArray710[local858] = local2383;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean664;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "()V")
	@Override
	protected void method8365() {
	}

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9825; local3++) {
			if (arg0 != 128) {
				this.anIntArray706[local3] = this.anIntArray706[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray708[local3] = arg1 * this.anIntArray708[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray710[local3] = this.anIntArray710[local3] * arg2 >> 7;
			}
		}
		this.aBoolean661 = false;
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9825; local3++) {
			if (arg0 != 0) {
				this.anIntArray706[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray708[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray710[local3] += arg2;
			}
		}
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "()V")
	@Override
	protected void method8370() {
	}

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static487.anInt7666 = 0;
			Static535.anInt10663 = 0;
			Static2.anInt11 = 0;
			for (local17 = 0; local17 < this.anInt9825; local17++) {
				Static2.anInt11 += this.anIntArray706[local17];
				Static487.anInt7666 += this.anIntArray708[local17];
				local9++;
				Static535.anInt10663 += this.anIntArray710[local17];
			}
			if (local9 <= 0) {
				Static2.anInt11 = arg1;
				Static487.anInt7666 = arg2;
				Static535.anInt10663 = arg3;
			} else {
				Static487.anInt7666 = Static487.anInt7666 / local9 + arg2;
				Static535.anInt10663 = arg3 + Static535.anInt10663 / local9;
				Static2.anInt11 = arg1 + Static2.anInt11 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt9825; local9++) {
				this.anIntArray706[local9] += arg1;
				this.anIntArray708[local9] += arg2;
				this.anIntArray710[local9] += arg3;
			}
		} else {
			@Pc(180) int local180;
			@Pc(199) int local199;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt9825; local9++) {
					this.anIntArray706[local9] -= Static2.anInt11;
					this.anIntArray708[local9] -= Static487.anInt7666;
					this.anIntArray710[local9] -= Static535.anInt10663;
					if (arg3 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
						local180 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
						local199 = local17 * this.anIntArray708[local9] + this.anIntArray706[local9] * local180 + 16383 >> 14;
						this.anIntArray708[local9] = this.anIntArray708[local9] * local180 + 16383 - this.anIntArray706[local9] * local17 >> 14;
						this.anIntArray706[local9] = local199;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg1];
						local180 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg1];
						local199 = local180 * this.anIntArray708[local9] + 16383 - this.anIntArray710[local9] * local17 >> 14;
						this.anIntArray710[local9] = this.anIntArray708[local9] * local17 + local180 * this.anIntArray710[local9] + 16383 >> 14;
						this.anIntArray708[local9] = local199;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
						local180 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
						local199 = this.anIntArray706[local9] * local180 + this.anIntArray710[local9] * local17 + 16383 >> 14;
						this.anIntArray710[local9] = local180 * this.anIntArray710[local9] + 16383 - this.anIntArray706[local9] * local17 >> 14;
						this.anIntArray706[local9] = local199;
					}
					this.anIntArray706[local9] += Static2.anInt11;
					this.anIntArray708[local9] += Static487.anInt7666;
					this.anIntArray710[local9] += Static535.anInt10663;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt9825; local9++) {
					this.anIntArray706[local9] -= Static2.anInt11;
					this.anIntArray708[local9] -= Static487.anInt7666;
					this.anIntArray710[local9] -= Static535.anInt10663;
					this.anIntArray706[local9] = this.anIntArray706[local9] * arg1 / 128;
					this.anIntArray708[local9] = arg2 * this.anIntArray708[local9] / 128;
					this.anIntArray710[local9] = this.anIntArray710[local9] * arg3 / 128;
					this.anIntArray706[local9] += Static2.anInt11;
					this.anIntArray708[local9] += Static487.anInt7666;
					this.anIntArray710[local9] += Static535.anInt10663;
				}
			} else {
				@Pc(557) Class404 local557;
				@Pc(562) Class179 local562;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt9802; local9++) {
						local17 = (this.aByteArray94[local9] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray94[local9] = (byte) local17;
					}
					if (this.aClass287_9 != null) {
						this.aClass287_9.anInterface13_5 = null;
					}
					if (this.aClass404Array1 != null) {
						for (local17 = 0; local17 < this.anInt9834; local17++) {
							local557 = this.aClass404Array1[local17];
							local562 = this.aClass179Array1[local17];
							local562.anInt4267 = 255 - (this.aByteArray94[local557.anInt11136] & 0xFF) << 24 | local562.anInt4267 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt9802; local9++) {
						local17 = this.aShortArray121[local9] & 0xFFFF;
						local180 = local17 >> 10 & 0x3F;
						local199 = local17 >> 7 & 0x7;
						@Pc(624) int local624 = local17 & 0x7F;
						@Pc(630) int local630 = arg1 + local180 & 0x3F;
						local199 += arg2 / 4;
						if (local199 < 0) {
							local199 = 0;
						} else if (local199 > 7) {
							local199 = 7;
						}
						local624 += arg3;
						if (local624 < 0) {
							local624 = 0;
						} else if (local624 > 127) {
							local624 = 127;
						}
						this.aShortArray121[local9] = (short) (local199 << 7 | local630 << 10 | local624);
					}
					if (this.aClass287_9 != null) {
						this.aClass287_9.anInterface13_5 = null;
					}
					if (this.aClass404Array1 != null) {
						for (local17 = 0; local17 < this.anInt9834; local17++) {
							local557 = this.aClass404Array1[local17];
							local562 = this.aClass179Array1[local17];
							local562.anInt4267 = Static537.anIntArray601[this.aShortArray121[local557.anInt11136] & 0xFFFF] & 0xFFFFFF | local562.anInt4267 & 0xFF000000;
						}
					}
				} else {
					@Pc(759) Class179 local759;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt9834; local9++) {
							local759 = this.aClass179Array1[local9];
							local759.anInt4268 += arg2;
							local759.anInt4269 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt9834; local9++) {
							local759 = this.aClass179Array1[local9];
							local759.anInt4266 = local759.anInt4266 * arg2 >> 7;
							local759.anInt4271 = arg1 * local759.anInt4271 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt9834; local9++) {
							local759 = this.aClass179Array1[local9];
							local759.anInt4265 = arg1 + local759.anInt4265 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9826; local3++) {
			this.anIntArray706[local3] = this.anIntArray706[local3] + 7 >> 4;
			this.anIntArray708[local3] = this.anIntArray708[local3] + 7 >> 4;
			this.anIntArray710[local3] = this.anIntArray710[local3] + 7 >> 4;
		}
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!tt", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9825; local15++) {
			@Pc(35) int local35 = this.anIntArray708[local15] * local13 - this.anIntArray710[local15] * local9 >> 14;
			this.anIntArray710[local15] = local13 * this.anIntArray710[local15] + this.anIntArray708[local15] * local9 >> 14;
			this.anIntArray708[local15] = local35;
		}
		this.aBoolean661 = false;
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt9801 = arg0;
		if (this.aClass235_1 != null && (this.anInt9801 & 0x10000) == 0) {
			this.aShortArray126 = this.aClass235_1.aShortArray72;
			this.aShortArray123 = this.aClass235_1.aShortArray74;
			this.aByteArray95 = this.aClass235_1.aByteArray57;
			this.aShortArray130 = this.aClass235_1.aShortArray73;
			this.aClass235_1 = null;
		}
		this.aBoolean662 = true;
		this.method8379();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()[Lclient!lk;")
	@Override
	public Class232[] method8352() {
		return this.aClass232Array5;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9825; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray710[local15] + this.anIntArray706[local15] * local13 >> 14;
			this.anIntArray710[local15] = this.anIntArray710[local15] * local13 - this.anIntArray706[local15] * local9 >> 14;
			this.anIntArray706[local15] = local33;
		}
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!tt", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray53 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt9826; local13++) {
			this.anIntArray706[local13] <<= 0x4;
			this.anIntArray708[local13] <<= 0x4;
			this.anIntArray710[local13] <<= 0x4;
		}
		Static2.anInt11 = 0;
		Static535.anInt10663 = 0;
		Static487.anInt7666 = 0;
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V")
	private void method8376() {
		if (this.aClass404Array1 == null) {
			return;
		}
		@Pc(16) Class58_Sub3 local16 = this.aClass22_Sub1_39.aClass58_Sub3_2;
		this.aClass22_Sub1_39.method952();
		this.aClass22_Sub1_39.C(!this.aBoolean663);
		this.aClass22_Sub1_39.method949(false);
		this.aClass22_Sub1_39.method919(this.aClass22_Sub1_39.aClass287_2, (Class287) null, this.aClass22_Sub1_39.aClass287_1, (Class287) null);
		for (@Pc(51) int local51 = 0; local51 < this.anInt9834; local51++) {
			@Pc(60) Class404 local60 = this.aClass404Array1[local51];
			@Pc(65) Class179 local65 = this.aClass179Array1[local51];
			if (!local60.aBoolean754 || !this.aClass22_Sub1_39.method9332()) {
				@Pc(95) float local95 = (float) (this.anIntArray706[local60.anInt11139] + this.anIntArray706[local60.anInt11138] + this.anIntArray706[local60.anInt11140]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray708[local60.anInt11140] + this.anIntArray708[local60.anInt11138] + this.anIntArray708[local60.anInt11139]) * 0.3333333F;
				@Pc(138) float local138 = (float) (this.anIntArray710[local60.anInt11140] + this.anIntArray710[local60.anInt11139] + this.anIntArray710[local60.anInt11138]) * 0.3333333F;
				@Pc(152) float local152 = local95 * Static245.aFloat62 + Static339.aFloat97 * local117 + local138 * Static33.aFloat33 + Static659.aFloat175;
				@Pc(166) float local166 = Static272.aFloat122 + local95 * Static282.aFloat42 + local117 * Static594.aFloat125 + local138 * Static532.aFloat128;
				@Pc(180) float local180 = Static549.aFloat89 + Static336.aFloat90 * local138 + Static555.aFloat124 * local117 + local95 * Static65.aFloat135;
				@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local152 * local152 + local166 * local166 + local180 * local180))) * (float) local60.anInt11137;
				local16.method9527(local65.anInt4265, local65.anInt4266 * local60.aShort126 >> 7, local201 * local180 - local180, local166 * local201 + ((float) local65.anInt4268 - local166), local152 + (float) local65.anInt4269 - local152 * local201, local60.aShort125 * local65.anInt4271 >> 7);
				this.aClass22_Sub1_39.method905(local16);
				@Pc(257) int local257 = local65.anInt4267;
				OpenGL.glColor4ub((byte) (local257 >> 16), (byte) (local257 >> 8), (byte) local257, (byte) (local257 >> 24));
				this.aClass22_Sub1_39.method939(local60.aShort124);
				this.aClass22_Sub1_39.method964(local60.aByte143);
				this.aClass22_Sub1_39.method927(4);
			}
		}
		this.aClass22_Sub1_39.C(true);
		this.aClass22_Sub1_39.method925();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!cl;Lclient!ve;II)V")
	@Override
	public void method8350(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9800 == 0) {
			return;
		}
		@Pc(17) Class58_Sub3 local17 = this.aClass22_Sub1_39.aClass58_Sub3_3;
		@Pc(20) Class58_Sub3 local20 = (Class58_Sub3) arg0;
		if (!this.aBoolean661) {
			this.method8382();
		}
		Static555.aFloat124 = local17.aFloat200 * local20.aFloat207 + local17.aFloat204 * local20.aFloat199 + local20.aFloat202 * local17.aFloat207;
		Static549.aFloat89 = local17.aFloat204 * local20.aFloat209 + local20.aFloat208 * local17.aFloat207 + local17.aFloat200 * local20.aFloat205 + local17.aFloat205;
		@Pc(75) float local75 = Static555.aFloat124 * (float) this.aShort104 + Static549.aFloat89;
		@Pc(83) float local83 = Static555.aFloat124 * (float) this.aShort109 + Static549.aFloat89;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local75 > local83) {
			local94 = (float) -this.aShort110 + local83;
			local100 = (float) this.aShort110 + local75;
		} else {
			local94 = local75 - (float) this.aShort110;
			local100 = (float) this.aShort110 + local83;
		}
		if (this.aClass22_Sub1_39.aFloat13 <= local94 || (float) this.aClass22_Sub1_39.anInt1006 >= local100) {
			return;
		}
		Static339.aFloat97 = local20.aFloat207 * local17.aFloat201 + local20.aFloat202 * local17.aFloat199 + local20.aFloat199 * local17.aFloat198;
		Static659.aFloat175 = local17.aFloat209 + local20.aFloat209 * local17.aFloat198 + local17.aFloat199 * local20.aFloat208 + local17.aFloat201 * local20.aFloat205;
		@Pc(178) float local178 = Static659.aFloat175 + Static339.aFloat97 * (float) this.aShort104;
		@Pc(186) float local186 = Static659.aFloat175 + (float) this.aShort109 * Static339.aFloat97;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local178 > local186) {
			local201 = (float) this.aClass22_Sub1_39.anInt1031 * ((float) this.aShort110 + local178);
			local212 = (float) this.aClass22_Sub1_39.anInt1031 * (local186 - (float) this.aShort110);
		} else {
			local201 = (local186 + (float) this.aShort110) * (float) this.aClass22_Sub1_39.anInt1031;
			local212 = ((float) -this.aShort110 + local178) * (float) this.aClass22_Sub1_39.anInt1031;
		}
		if (this.aClass22_Sub1_39.aFloat9 <= local212 / (float) arg2 || this.aClass22_Sub1_39.aFloat14 >= local201 / (float) arg2) {
			return;
		}
		Static594.aFloat125 = local17.aFloat203 * local20.aFloat207 + local17.aFloat206 * local20.aFloat199 + local20.aFloat202 * local17.aFloat202;
		Static272.aFloat122 = local17.aFloat208 + local20.aFloat205 * local17.aFloat203 + local20.aFloat209 * local17.aFloat206 + local17.aFloat202 * local20.aFloat208;
		@Pc(306) float local306 = (float) this.aShort104 * Static594.aFloat125 + Static272.aFloat122;
		@Pc(314) float local314 = Static594.aFloat125 * (float) this.aShort109 + Static272.aFloat122;
		@Pc(329) float local329;
		@Pc(340) float local340;
		if (local306 > local314) {
			local329 = (float) this.aClass22_Sub1_39.anInt1030 * (local314 - (float) this.aShort110);
			local340 = (float) this.aClass22_Sub1_39.anInt1030 * (local306 + (float) this.aShort110);
		} else {
			local340 = ((float) this.aShort110 + local314) * (float) this.aClass22_Sub1_39.anInt1030;
			local329 = (float) this.aClass22_Sub1_39.anInt1030 * ((float) -this.aShort110 + local306);
		}
		if (this.aClass22_Sub1_39.aFloat17 <= local329 / (float) arg2 || local340 / (float) arg2 <= this.aClass22_Sub1_39.aFloat12) {
			return;
		}
		if (arg1 != null || this.aClass404Array1 != null) {
			Static532.aFloat128 = local17.aFloat203 * local20.aFloat200 + local20.aFloat203 * local17.aFloat202 + local17.aFloat206 * local20.aFloat201;
			Static282.aFloat42 = local17.aFloat203 * local20.aFloat204 + local17.aFloat202 * local20.aFloat206 + local20.aFloat198 * local17.aFloat206;
			Static33.aFloat33 = local20.aFloat200 * local17.aFloat201 + local20.aFloat203 * local17.aFloat199 + local17.aFloat198 * local20.aFloat201;
			Static245.aFloat62 = local20.aFloat198 * local17.aFloat198 + local17.aFloat199 * local20.aFloat206 + local17.aFloat201 * local20.aFloat204;
			Static336.aFloat90 = local20.aFloat200 * local17.aFloat200 + local20.aFloat203 * local17.aFloat207 + local20.aFloat201 * local17.aFloat204;
			Static65.aFloat135 = local20.aFloat204 * local17.aFloat200 + local20.aFloat206 * local17.aFloat207 + local17.aFloat204 * local20.aFloat198;
		}
		if (arg1 != null) {
			@Pc(514) int local514 = this.aShort111 + this.aShort113 >> 1;
			@Pc(523) int local523 = this.aShort107 + this.aShort105 >> 1;
			@Pc(542) int local542 = (int) (Static33.aFloat33 * (float) local523 + Static659.aFloat175 + (float) local514 * Static245.aFloat62 + Static339.aFloat97 * (float) this.aShort104);
			@Pc(561) int local561 = (int) ((float) local523 * Static532.aFloat128 + Static272.aFloat122 + Static282.aFloat42 * (float) local514 + Static594.aFloat125 * (float) this.aShort104);
			@Pc(580) int local580 = (int) (Static336.aFloat90 * (float) local523 + (float) this.aShort104 * Static555.aFloat124 + Static65.aFloat135 * (float) local514 + Static549.aFloat89);
			@Pc(599) int local599 = (int) ((float) local523 * Static33.aFloat33 + (float) local514 * Static245.aFloat62 + Static659.aFloat175 + Static339.aFloat97 * (float) this.aShort109);
			@Pc(618) int local618 = (int) (Static532.aFloat128 * (float) local523 + (float) this.aShort109 * Static594.aFloat125 + Static272.aFloat122 + (float) local514 * Static282.aFloat42);
			arg1.anInt10616 = this.aClass22_Sub1_39.anInt1031 * local599 / arg2 + this.aClass22_Sub1_39.anInt1035;
			arg1.anInt10618 = local561 * this.aClass22_Sub1_39.anInt1030 / arg2 + this.aClass22_Sub1_39.anInt1023;
			@Pc(663) int local663 = (int) ((float) this.aShort109 * Static555.aFloat124 + Static65.aFloat135 * (float) local514 + Static549.aFloat89 + (float) local523 * Static336.aFloat90);
			arg1.anInt10617 = this.aClass22_Sub1_39.anInt1023 + this.aClass22_Sub1_39.anInt1030 * local618 / arg2;
			arg1.anInt10619 = this.aClass22_Sub1_39.anInt1035 + this.aClass22_Sub1_39.anInt1031 * local542 / arg2;
			if (local580 >= this.aClass22_Sub1_39.anInt1006 || local663 >= this.aClass22_Sub1_39.anInt1006) {
				arg1.aBoolean719 = true;
				arg1.anInt10620 = (local542 + this.aShort110) * this.aClass22_Sub1_39.anInt1031 / arg2 + this.aClass22_Sub1_39.anInt1035 - arg1.anInt10619;
			}
		}
		this.aClass22_Sub1_39.method950((float) arg2);
		this.aClass22_Sub1_39.method941();
		this.aClass22_Sub1_39.method933(local20);
		this.method8374();
		this.aClass22_Sub1_39.method925();
		this.method8376();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "()Z")
	@Override
	public boolean method8368() {
		if (this.aShortArray120 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray120.length; local13++) {
			if (this.aShortArray120[local13] != -1 && !this.aClass22_Sub1_39.anInterface4_14.method5758(this.aShortArray120[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass22_Sub1_39.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9802; local11++) {
			if (arg0 == this.aShortArray120[local11]) {
				this.aShortArray120[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(54) Class406 local54 = local9.method5761(arg0 & 0xFFFF);
			local41 = local54.aByte146;
			local39 = local54.aByte144;
		}
		@Pc(62) byte local62 = 0;
		@Pc(64) byte local64 = 0;
		if (arg1 != -1) {
			@Pc(74) Class406 local74 = local9.method5761(arg1 & 0xFFFF);
			if (local74.aByte145 != 0 || local74.aByte150 != 0) {
				this.aBoolean664 = true;
			}
			local64 = local74.aByte146;
			local62 = local74.aByte144;
		}
		if (!(local39 != local62 | local64 != local41)) {
			return;
		}
		if (this.aClass404Array1 != null) {
			for (@Pc(123) int local123 = 0; local123 < this.anInt9834; local123++) {
				@Pc(130) Class404 local130 = this.aClass404Array1[local123];
				@Pc(135) Class179 local135 = this.aClass179Array1[local123];
				local135.anInt4267 = Static537.anIntArray601[this.aShortArray121[local130.anInt11136] & 0xFFFF] & 0xFFFFFF | local135.anInt4267 & 0xFF000000;
			}
		}
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "()V")
	@Override
	public void method8362() {
		if (this.anInt9800 <= 0 || this.anInt9784 <= 0) {
			return;
		}
		this.method8378(false);
		if ((this.aByte136 & 0x10) == 0 && this.aClass148_1.anInterface27_3 == null) {
			this.method8381(false);
		}
		this.method8379();
	}

	@OriginalMember(owner = "client!tt", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt9801;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!cl;Lclient!ve;I)V")
	@Override
	public void method8360(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9800 == 0) {
			return;
		}
		@Pc(14) Class58_Sub3 local14 = this.aClass22_Sub1_39.aClass58_Sub3_3;
		@Pc(17) Class58_Sub3 local17 = (Class58_Sub3) arg0;
		if (!this.aBoolean661) {
			this.method8382();
		}
		Static549.aFloat89 = local14.aFloat205 + local14.aFloat207 * local17.aFloat208 + local17.aFloat209 * local14.aFloat204 + local14.aFloat200 * local17.aFloat205;
		Static555.aFloat124 = local17.aFloat202 * local14.aFloat207 + local14.aFloat204 * local17.aFloat199 + local17.aFloat207 * local14.aFloat200;
		@Pc(72) float local72 = (float) this.aShort104 * Static555.aFloat124 + Static549.aFloat89;
		@Pc(80) float local80 = (float) this.aShort109 * Static555.aFloat124 + Static549.aFloat89;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.aShort110 + local72;
			local97 = (float) -this.aShort110 + local80;
		} else {
			local97 = (float) -this.aShort110 + local72;
			local90 = local80 + (float) this.aShort110;
		}
		if (this.aClass22_Sub1_39.aFloat18 <= local97 || local90 <= (float) this.aClass22_Sub1_39.anInt1006) {
			return;
		}
		Static659.aFloat175 = local14.aFloat209 + local14.aFloat201 * local17.aFloat205 + local14.aFloat199 * local17.aFloat208 + local14.aFloat198 * local17.aFloat209;
		Static339.aFloat97 = local14.aFloat201 * local17.aFloat207 + local17.aFloat199 * local14.aFloat198 + local17.aFloat202 * local14.aFloat199;
		@Pc(176) float local176 = (float) this.aShort104 * Static339.aFloat97 + Static659.aFloat175;
		@Pc(184) float local184 = (float) this.aShort109 * Static339.aFloat97 + Static659.aFloat175;
		@Pc(210) float local210;
		@Pc(199) float local199;
		if (local184 < local176) {
			local210 = (float) this.aClass22_Sub1_39.anInt1031 * (local184 - (float) this.aShort110);
			local199 = (float) this.aClass22_Sub1_39.anInt1031 * ((float) this.aShort110 + local176);
		} else {
			local199 = (local184 + (float) this.aShort110) * (float) this.aClass22_Sub1_39.anInt1031;
			local210 = (float) this.aClass22_Sub1_39.anInt1031 * (local176 - (float) this.aShort110);
		}
		if (local210 / local90 >= this.aClass22_Sub1_39.aFloat9 || local199 / local90 <= this.aClass22_Sub1_39.aFloat14) {
			return;
		}
		Static272.aFloat122 = local14.aFloat208 + local17.aFloat208 * local14.aFloat202 + local14.aFloat206 * local17.aFloat209 + local17.aFloat205 * local14.aFloat203;
		Static594.aFloat125 = local14.aFloat203 * local17.aFloat207 + local17.aFloat202 * local14.aFloat202 + local14.aFloat206 * local17.aFloat199;
		@Pc(301) float local301 = Static594.aFloat125 * (float) this.aShort104 + Static272.aFloat122;
		@Pc(309) float local309 = Static272.aFloat122 + (float) this.aShort109 * Static594.aFloat125;
		@Pc(325) float local325;
		@Pc(336) float local336;
		if (local301 > local309) {
			local325 = (float) this.aClass22_Sub1_39.anInt1030 * ((float) -this.aShort110 + local309);
			local336 = (float) this.aClass22_Sub1_39.anInt1030 * ((float) this.aShort110 + local301);
		} else {
			local325 = ((float) -this.aShort110 + local301) * (float) this.aClass22_Sub1_39.anInt1030;
			local336 = ((float) this.aShort110 + local309) * (float) this.aClass22_Sub1_39.anInt1030;
		}
		if (local325 / local90 >= this.aClass22_Sub1_39.aFloat17 || local336 / local90 <= this.aClass22_Sub1_39.aFloat12) {
			return;
		}
		if (arg1 != null || this.aClass404Array1 != null) {
			Static33.aFloat33 = local17.aFloat203 * local14.aFloat199 + local14.aFloat198 * local17.aFloat201 + local17.aFloat200 * local14.aFloat201;
			Static336.aFloat90 = local14.aFloat204 * local17.aFloat201 + local14.aFloat207 * local17.aFloat203 + local17.aFloat200 * local14.aFloat200;
			Static282.aFloat42 = local17.aFloat204 * local14.aFloat203 + local17.aFloat206 * local14.aFloat202 + local17.aFloat198 * local14.aFloat206;
			Static245.aFloat62 = local17.aFloat206 * local14.aFloat199 + local17.aFloat198 * local14.aFloat198 + local17.aFloat204 * local14.aFloat201;
			Static532.aFloat128 = local17.aFloat200 * local14.aFloat203 + local14.aFloat206 * local17.aFloat201 + local14.aFloat202 * local17.aFloat203;
			Static65.aFloat135 = local14.aFloat200 * local17.aFloat204 + local14.aFloat204 * local17.aFloat198 + local14.aFloat207 * local17.aFloat206;
		}
		if (arg1 != null) {
			@Pc(502) boolean local502 = false;
			@Pc(504) boolean local504 = true;
			@Pc(512) int local512 = this.aShort113 + this.aShort111 >> 1;
			@Pc(520) int local520 = this.aShort105 + this.aShort107 >> 1;
			@Pc(539) int local539 = (int) (Static33.aFloat33 * (float) local520 + Static339.aFloat97 * (float) this.aShort104 + Static659.aFloat175 + Static245.aFloat62 * (float) local512);
			@Pc(558) int local558 = (int) ((float) this.aShort104 * Static594.aFloat125 + Static282.aFloat42 * (float) local512 + Static272.aFloat122 + (float) local520 * Static532.aFloat128);
			@Pc(577) int local577 = (int) (Static336.aFloat90 * (float) local520 + (float) this.aShort104 * Static555.aFloat124 + Static549.aFloat89 + Static65.aFloat135 * (float) local512);
			if (this.aClass22_Sub1_39.anInt1006 <= local577) {
				arg1.anInt10619 = this.aClass22_Sub1_39.anInt1031 * local539 / local577 + this.aClass22_Sub1_39.anInt1035;
				arg1.anInt10618 = this.aClass22_Sub1_39.anInt1023 + local558 * this.aClass22_Sub1_39.anInt1030 / local577;
			} else {
				local502 = true;
			}
			@Pc(637) int local637 = (int) ((float) this.aShort109 * Static339.aFloat97 + Static659.aFloat175 + Static245.aFloat62 * (float) local512 + Static33.aFloat33 * (float) local520);
			@Pc(656) int local656 = (int) (Static272.aFloat122 + Static282.aFloat42 * (float) local512 + (float) this.aShort109 * Static594.aFloat125 + Static532.aFloat128 * (float) local520);
			@Pc(675) int local675 = (int) (Static549.aFloat89 + Static65.aFloat135 * (float) local512 + (float) this.aShort109 * Static555.aFloat124 + (float) local520 * Static336.aFloat90);
			if (this.aClass22_Sub1_39.anInt1006 > local675) {
				local502 = true;
			} else {
				arg1.anInt10617 = this.aClass22_Sub1_39.anInt1023 + local656 * this.aClass22_Sub1_39.anInt1030 / local675;
				arg1.anInt10616 = local637 * this.aClass22_Sub1_39.anInt1031 / local675 + this.aClass22_Sub1_39.anInt1035;
			}
			if (local502) {
				if (this.aClass22_Sub1_39.anInt1006 > local577 && local675 < this.aClass22_Sub1_39.anInt1006) {
					local504 = false;
				} else {
					@Pc(761) int local761;
					@Pc(772) int local772;
					@Pc(783) int local783;
					if (this.aClass22_Sub1_39.anInt1006 > local577) {
						local761 = (local675 - this.aClass22_Sub1_39.anInt1006 << 16) / (local675 - local577);
						local772 = (local761 * (local637 - local539) >> 16) + local637;
						arg1.anInt10619 = this.aClass22_Sub1_39.anInt1035 + this.aClass22_Sub1_39.anInt1031 * local772 / this.aClass22_Sub1_39.anInt1006;
						local783 = (local761 * (local656 - local558) >> 16) + local656;
						arg1.anInt10618 = this.aClass22_Sub1_39.anInt1030 * local783 / this.aClass22_Sub1_39.anInt1006 + this.aClass22_Sub1_39.anInt1023;
					} else if (this.aClass22_Sub1_39.anInt1006 > local675) {
						local761 = (local577 - this.aClass22_Sub1_39.anInt1006 << 16) / (local577 - local675);
						local772 = local539 + ((local539 - local637) * local761 >> 16);
						local783 = (local761 * (local558 - local656) >> 16) + local558;
						arg1.anInt10619 = this.aClass22_Sub1_39.anInt1031 * local772 / this.aClass22_Sub1_39.anInt1006 + this.aClass22_Sub1_39.anInt1035;
						arg1.anInt10618 = this.aClass22_Sub1_39.anInt1030 * local783 / this.aClass22_Sub1_39.anInt1006 + this.aClass22_Sub1_39.anInt1023;
					}
				}
			}
			if (local504) {
				if (local577 <= local675) {
					arg1.anInt10620 = this.aClass22_Sub1_39.anInt1035 + this.aClass22_Sub1_39.anInt1031 * (local637 + this.aShort110) / local675 - arg1.anInt10616;
				} else {
					arg1.anInt10620 = (local539 + this.aShort110) * this.aClass22_Sub1_39.anInt1031 / local577 + this.aClass22_Sub1_39.anInt1035 - arg1.anInt10619;
				}
				arg1.aBoolean719 = true;
			}
		}
		this.aClass22_Sub1_39.method956();
		this.aClass22_Sub1_39.method933(local17);
		this.method8374();
		this.aClass22_Sub1_39.method925();
		this.method8376();
	}

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort105;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class170 method8369(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(20) Class170_Sub3 local20;
		@Pc(19) Class170_Sub3 local19;
		if (arg0 > 0 && arg0 <= 7) {
			local20 = this.aClass22_Sub1_39.aClass170_Sub3Array1[arg0 - 1];
			local19 = this.aClass22_Sub1_39.aClass170_Sub3Array2[arg0 - 1];
			local5 = true;
		} else {
			local20 = local19 = new Class170_Sub3(this.aClass22_Sub1_39);
		}
		return this.method8380(arg1, local5, arg2, local19, local20);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method8357(@OriginalArg(0) Class58 arg0) {
		@Pc(8) Class58_Sub3 local8 = (Class58_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass184Array5 != null) {
			for (local13 = 0; local13 < this.aClass184Array5.length; local13++) {
				@Pc(20) Class184 local20 = this.aClass184Array5[local13];
				@Pc(22) Class184 local22 = local20;
				if (local20.aClass184_1 != null) {
					local22 = local20.aClass184_1;
				}
				local22.anInt4429 = (int) (local8.aFloat199 * (float) this.anIntArray708[local20.anInt4428] + local8.aFloat198 * (float) this.anIntArray706[local20.anInt4428] + (float) this.anIntArray710[local20.anInt4428] * local8.aFloat201 + local8.aFloat209);
				local22.anInt4427 = (int) (local8.aFloat208 + (float) this.anIntArray710[local20.anInt4428] * local8.aFloat203 + local8.aFloat202 * (float) this.anIntArray708[local20.anInt4428] + local8.aFloat206 * (float) this.anIntArray706[local20.anInt4428]);
				local22.anInt4424 = (int) (local8.aFloat205 + local8.aFloat200 * (float) this.anIntArray710[local20.anInt4428] + local8.aFloat204 * (float) this.anIntArray706[local20.anInt4428] + local8.aFloat207 * (float) this.anIntArray708[local20.anInt4428]);
				local22.anInt4435 = (int) (local8.aFloat209 + local8.aFloat198 * (float) this.anIntArray706[local20.anInt4426] + (float) this.anIntArray708[local20.anInt4426] * local8.aFloat199 + local8.aFloat201 * (float) this.anIntArray710[local20.anInt4426]);
				local22.anInt4440 = (int) ((float) this.anIntArray710[local20.anInt4426] * local8.aFloat203 + (float) this.anIntArray706[local20.anInt4426] * local8.aFloat206 + local8.aFloat202 * (float) this.anIntArray708[local20.anInt4426] + local8.aFloat208);
				local22.anInt4434 = (int) (local8.aFloat200 * (float) this.anIntArray710[local20.anInt4426] + local8.aFloat204 * (float) this.anIntArray706[local20.anInt4426] + (float) this.anIntArray708[local20.anInt4426] * local8.aFloat207 + local8.aFloat205);
				local22.anInt4430 = (int) (local8.aFloat209 + local8.aFloat201 * (float) this.anIntArray710[local20.anInt4439] + local8.aFloat198 * (float) this.anIntArray706[local20.anInt4439] + (float) this.anIntArray708[local20.anInt4439] * local8.aFloat199);
				local22.anInt4438 = (int) (local8.aFloat208 + (float) this.anIntArray708[local20.anInt4439] * local8.aFloat202 + local8.aFloat206 * (float) this.anIntArray706[local20.anInt4439] + (float) this.anIntArray710[local20.anInt4439] * local8.aFloat203);
				local22.anInt4431 = (int) ((float) this.anIntArray710[local20.anInt4439] * local8.aFloat200 + local8.aFloat204 * (float) this.anIntArray706[local20.anInt4439] + (float) this.anIntArray708[local20.anInt4439] * local8.aFloat207 + local8.aFloat205);
			}
		}
		if (this.aClass232Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass232Array5.length; local13++) {
			@Pc(363) Class232 local363 = this.aClass232Array5[local13];
			@Pc(365) Class232 local365 = local363;
			if (local363.aClass232_1 != null) {
				local365 = local363.aClass232_1;
			}
			if (local363.aClass58_4 == null) {
				local363.aClass58_4 = local8.method9522();
			} else {
				local363.aClass58_4.method9516(local8);
			}
			local365.anInt5884 = (int) (local8.aFloat201 * (float) this.anIntArray710[local363.anInt5881] + (float) this.anIntArray706[local363.anInt5881] * local8.aFloat198 + (float) this.anIntArray708[local363.anInt5881] * local8.aFloat199 + local8.aFloat209);
			local365.anInt5886 = (int) ((float) this.anIntArray710[local363.anInt5881] * local8.aFloat203 + (float) this.anIntArray708[local363.anInt5881] * local8.aFloat202 + local8.aFloat206 * (float) this.anIntArray706[local363.anInt5881] + local8.aFloat208);
			local365.anInt5879 = (int) (local8.aFloat205 + local8.aFloat207 * (float) this.anIntArray708[local363.anInt5881] + (float) this.anIntArray706[local363.anInt5881] * local8.aFloat204 + local8.aFloat200 * (float) this.anIntArray710[local363.anInt5881]);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method8377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > arg6 && arg3 > arg6 && arg6 < arg7) {
			return false;
		} else if (arg6 > arg4 && arg3 < arg6 && arg7 < arg6) {
			return false;
		} else if (arg0 > arg5 && arg5 < arg1 && arg2 > arg5) {
			return false;
		} else {
			return arg0 >= arg5 || arg1 >= arg5 || arg5 <= arg2;
		}
	}

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9825; local3++) {
			this.anIntArray710[local3] = -this.anIntArray710[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt9800; local27++) {
			this.aShortArray126[local27] = (short) -this.aShortArray126[local27];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt9802; local54++) {
			@Pc(65) short local65 = this.aShortArray125[local54];
			this.aShortArray125[local54] = this.aShortArray128[local54];
			this.aShortArray128[local54] = local65;
		}
		if (this.aClass287_11 == null && this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
		if (this.aClass287_11 != null) {
			this.aClass287_11.anInterface13_5 = null;
		}
		if (this.aClass148_1 != null) {
			this.aClass148_1.anInterface27_3 = null;
		}
		this.aBoolean661 = false;
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
	private void method8378(@OriginalArg(0) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass287_9 != null && this.aClass287_9.anInterface13_5 == null;
		@Pc(33) boolean local33 = this.aClass287_11 != null && this.aClass287_11.anInterface13_5 == null;
		@Pc(47) boolean local47 = this.aClass287_12 != null && this.aClass287_12.anInterface13_5 == null;
		@Pc(61) boolean local61 = this.aClass287_10 != null && this.aClass287_10.anInterface13_5 == null;
		if (arg0) {
			local47 &= (this.aByte136 & 0x1) != 0;
			local61 &= (this.aByte136 & 0x8) != 0;
			local33 &= (this.aByte136 & 0x4) != 0;
			local19 &= (this.aByte136 & 0x2) != 0;
		}
		@Pc(121) byte local121 = 0;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (local47) {
			local121 = 12;
		}
		if (local19) {
			local125 = local121;
			local121 = (byte) (local121 + 4);
		}
		if (local33) {
			local127 = local121;
			local121 = (byte) (local121 + 12);
		}
		if (local61) {
			local129 = local121;
			local121 = (byte) (local121 + 8);
		}
		if (local121 == 0) {
			return;
		}
		if (local121 * this.anInt9800 > this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1.aByteArray20.length) {
			this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2(local121 * (this.anInt9800 + 100));
		} else {
			this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1.anInt2178 = 0;
		}
		@Pc(210) Class3_Sub2_Sub2 local210 = this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1;
		@Pc(228) int local228;
		@Pc(237) int local237;
		@Pc(265) int local265;
		@Pc(274) int local274;
		if (local47) {
			@Pc(244) int local244;
			@Pc(251) int local251;
			@Pc(256) int local256;
			@Pc(263) int local263;
			if (this.aClass22_Sub1_39.aBoolean60) {
				for (local228 = 0; local228 < this.anInt9825; local228++) {
					local237 = Stream.floatToRawIntBits((float) this.anIntArray706[local228]);
					local244 = Stream.floatToRawIntBits((float) this.anIntArray708[local228]);
					local251 = Stream.floatToRawIntBits((float) this.anIntArray710[local228]);
					local256 = this.anIntArray707[local228];
					local263 = this.anIntArray707[local228 + 1];
					for (local265 = local256; local265 < local263; local265++) {
						local274 = this.aShortArray129[local265] - 1;
						if (local274 == -1) {
							break;
						}
						local210.anInt2178 = local121 * local274;
						local210.method2018(local237);
						local210.method2018(local244);
						local210.method2018(local251);
					}
				}
			} else {
				for (local228 = 0; local228 < this.anInt9825; local228++) {
					local237 = Stream.floatToRawIntBits((float) this.anIntArray706[local228]);
					local244 = Stream.floatToRawIntBits((float) this.anIntArray708[local228]);
					local251 = Stream.floatToRawIntBits((float) this.anIntArray710[local228]);
					local256 = this.anIntArray707[local228];
					local263 = this.anIntArray707[local228 + 1];
					for (local265 = local256; local265 < local263; local265++) {
						local274 = this.aShortArray129[local265] - 1;
						if (local274 == -1) {
							break;
						}
						local210.anInt2178 = local121 * local274;
						local210.method2041(local237);
						local210.method2041(local244);
						local210.method2041(local251);
					}
				}
			}
		}
		@Pc(528) float local528;
		@Pc(424) short[] local424;
		@Pc(421) short[] local421;
		@Pc(415) short[] local415;
		@Pc(418) byte[] local418;
		@Pc(578) float local578;
		if (local19) {
			if (this.aClass287_11 == null) {
				if (this.aClass235_1 == null) {
					local415 = this.aShortArray126;
					local418 = this.aByteArray95;
					local421 = this.aShortArray130;
					local424 = this.aShortArray123;
				} else {
					local418 = this.aClass235_1.aByteArray57;
					local424 = this.aClass235_1.aShortArray74;
					local415 = this.aClass235_1.aShortArray72;
					local421 = this.aClass235_1.aShortArray73;
				}
				@Pc(448) float local448 = this.aClass22_Sub1_39.aFloatArray4[0];
				@Pc(454) float local454 = this.aClass22_Sub1_39.aFloatArray4[1];
				@Pc(460) float local460 = this.aClass22_Sub1_39.aFloatArray4[2];
				@Pc(464) float local464 = this.aClass22_Sub1_39.aFloat21;
				@Pc(474) float local474 = this.aClass22_Sub1_39.aFloat24 * 768.0F / (float) this.aShort108;
				@Pc(484) float local484 = this.aClass22_Sub1_39.aFloat22 * 768.0F / (float) this.aShort108;
				for (@Pc(486) int local486 = 0; local486 < this.anInt9802; local486++) {
					@Pc(506) int local506 = this.method8383(this.aShortArray120[local486], this.aByteArray94[local486], this.aShortArray121[local486], this.aShort106);
					@Pc(517) float local517 = this.aClass22_Sub1_39.aFloat25 * (float) (local506 >> 8 & 0xFF);
					local528 = this.aClass22_Sub1_39.aFloat28 * (float) (local506 >> 16 & 0xFF);
					@Pc(537) float local537 = this.aClass22_Sub1_39.aFloat19 * (float) (local506 >>> 24);
					@Pc(542) short local542 = this.aShortArray125[local486];
					@Pc(547) short local547 = (short) local418[local542];
					if (local547 == 0) {
						local578 = (local460 * (float) local415[local542] + (float) local421[local542] * local454 + (float) local424[local542] * local448) * 0.0026041667F;
					} else {
						local578 = ((float) local424[local542] * local448 + (float) local421[local542] * local454 + (float) local415[local542] * local460) / (float) (local547 * 256);
					}
					@Pc(616) float local616 = local464 + (local578 < 0.0F ? local484 : local474) * local578;
					@Pc(621) int local621 = (int) (local537 * local616);
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					@Pc(644) int local644 = (int) (local528 * local616);
					@Pc(649) int local649 = (int) (local517 * local616);
					if (local644 < 0) {
						local644 = 0;
					} else if (local644 > 255) {
						local644 = 255;
					}
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					local210.anInt2178 = local121 * local542 + local125;
					local210.method2065(local621);
					local210.method2065(local644);
					local210.method2065(local649);
					local210.method2065(255 - (this.aByteArray94[local486] & 0xFF));
					local542 = this.aShortArray122[local486];
					local547 = (short) local418[local542];
					if (local547 == 0) {
						local578 = (local448 * (float) local424[local542] + (float) local421[local542] * local454 + (float) local415[local542] * local460) * 0.0026041667F;
					} else {
						local578 = ((float) local415[local542] * local460 + local448 * (float) local424[local542] + local454 * (float) local421[local542]) / (float) (local547 * 256);
					}
					local616 = local578 * (local578 < 0.0F ? local484 : local474) + local464;
					local621 = (int) (local537 * local616);
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					local644 = (int) (local616 * local528);
					local649 = (int) (local517 * local616);
					if (local644 < 0) {
						local644 = 0;
					} else if (local644 > 255) {
						local644 = 255;
					}
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					local210.anInt2178 = local125 + local542 * local121;
					local210.method2065(local621);
					local210.method2065(local644);
					local210.method2065(local649);
					local210.method2065(255 - (this.aByteArray94[local486] & 0xFF));
					local542 = this.aShortArray128[local486];
					local547 = (short) local418[local542];
					if (local547 == 0) {
						local578 = ((float) local415[local542] * local460 + local454 * (float) local421[local542] + (float) local424[local542] * local448) * 0.0026041667F;
					} else {
						local578 = (local448 * (float) local424[local542] + local454 * (float) local421[local542] + (float) local415[local542] * local460) / (float) (local547 * 256);
					}
					local616 = (local578 < 0.0F ? local484 : local474) * local578 + local464;
					local621 = (int) (local616 * local537);
					local644 = (int) (local616 * local528);
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					local649 = (int) (local616 * local517);
					if (local644 < 0) {
						local644 = 0;
					} else if (local644 > 255) {
						local644 = 255;
					}
					local210.anInt2178 = local121 * local542 + local125;
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					local210.method2065(local621);
					local210.method2065(local644);
					local210.method2065(local649);
					local210.method2065(255 - (this.aByteArray94[local486] & 0xFF));
				}
			} else {
				for (local228 = 0; local228 < this.anInt9802; local228++) {
					local237 = this.method8383(this.aShortArray120[local228], this.aByteArray94[local228], this.aShortArray121[local228], this.aShort106);
					local210.anInt2178 = this.aShortArray125[local228] * local121 + local125;
					local210.method2018(local237);
					local210.anInt2178 = local125 + this.aShortArray122[local228] * local121;
					local210.method2018(local237);
					local210.anInt2178 = local125 + local121 * this.aShortArray128[local228];
					local210.method2018(local237);
				}
			}
		}
		if (local33) {
			if (this.aClass235_1 == null) {
				local415 = this.aShortArray126;
				local421 = this.aShortArray130;
				local418 = this.aByteArray95;
				local424 = this.aShortArray123;
			} else {
				local424 = this.aClass235_1.aShortArray74;
				local418 = this.aClass235_1.aByteArray57;
				local415 = this.aClass235_1.aShortArray72;
				local421 = this.aClass235_1.aShortArray73;
			}
			@Pc(1169) float local1169 = 3.0F / (float) this.aShort108;
			local578 = 3.0F / (float) (this.aShort108 + this.aShort108 / 2);
			local210.anInt2178 = local127;
			if (this.aClass22_Sub1_39.aBoolean60) {
				for (local265 = 0; local265 < this.anInt9800; local265++) {
					local274 = local418[local265] & 0xFF;
					if (local274 == 0) {
						local210.method2080(local578 * (float) local424[local265]);
						local210.method2080(local578 * (float) local421[local265]);
						local210.method2080((float) local415[local265] * local578);
					} else {
						local528 = local1169 / (float) local274;
						local210.method2080(local528 * (float) local424[local265]);
						local210.method2080((float) local421[local265] * local528);
						local210.method2080(local528 * (float) local415[local265]);
					}
					local210.anInt2178 += local121 - 12;
				}
			} else {
				for (local265 = 0; local265 < this.anInt9800; local265++) {
					local274 = local418[local265] & 0xFF;
					if (local274 == 0) {
						local210.method2079(local578 * (float) local424[local265]);
						local210.method2079(local578 * (float) local421[local265]);
						local210.method2079((float) local415[local265] * local578);
					} else {
						local528 = local1169 / (float) local274;
						local210.method2079(local528 * (float) local424[local265]);
						local210.method2079((float) local421[local265] * local528);
						local210.method2079((float) local415[local265] * local528);
					}
					local210.anInt2178 += local121 - 12;
				}
			}
		}
		if (local61) {
			local210.anInt2178 = local129;
			if (this.aClass22_Sub1_39.aBoolean60) {
				for (local228 = 0; local228 < this.anInt9800; local228++) {
					local210.method2080(this.aFloatArray67[local228]);
					local210.method2080(this.aFloatArray68[local228]);
					local210.anInt2178 += local121 - 8;
				}
			} else {
				for (local228 = 0; local228 < this.anInt9800; local228++) {
					local210.method2079(this.aFloatArray67[local228]);
					local210.method2079(this.aFloatArray68[local228]);
					local210.anInt2178 += local121 - 8;
				}
			}
		}
		local210.anInt2178 = this.anInt9800 * local121;
		@Pc(1513) Interface13 local1513;
		if (arg0) {
			if (this.anInterface13_6 == null) {
				this.anInterface13_6 = this.aClass22_Sub1_39.method901(local210.aByteArray20, local210.anInt2178, true, local121);
			} else {
				this.anInterface13_6.method4053(local210.aByteArray20, local121, local210.anInt2178);
			}
			local1513 = this.anInterface13_6;
			this.aByte136 = 0;
		} else {
			local1513 = this.aClass22_Sub1_39.method901(local210.aByteArray20, local210.anInt2178, false, local121);
			this.aBoolean662 = true;
		}
		if (local47) {
			this.aClass287_12.anInterface13_5 = local1513;
			this.aClass287_12.aByte112 = 0;
		}
		if (local61) {
			this.aClass287_10.anInterface13_5 = local1513;
			this.aClass287_10.aByte112 = local129;
		}
		if (local19) {
			this.aClass287_9.aByte112 = local125;
			this.aClass287_9.anInterface13_5 = local1513;
		}
		if (local33) {
			this.aClass287_11.anInterface13_5 = local1513;
			this.aClass287_11.aByte112 = local127;
		}
	}

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9825; local15++) {
			local33 = local9 * this.anIntArray710[local15] + local13 * this.anIntArray706[local15] >> 14;
			this.anIntArray710[local15] = local13 * this.anIntArray710[local15] - local9 * this.anIntArray706[local15] >> 14;
			this.anIntArray706[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt9800; local33++) {
			@Pc(87) int local87 = this.aShortArray123[local33] * local13 + this.aShortArray126[local33] * local9 >> 14;
			this.aShortArray126[local33] = (short) (local13 * this.aShortArray126[local33] - this.aShortArray123[local33] * local9 >> 14);
			this.aShortArray123[local33] = (short) local87;
		}
		if (this.aClass287_11 == null && this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
		if (this.aClass287_11 != null) {
			this.aClass287_11.anInterface13_5 = null;
		}
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
		this.aBoolean661 = false;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
	private void method8379() {
		if (!this.aBoolean662) {
			return;
		}
		this.aBoolean662 = false;
		if (this.aClass184Array5 == null && this.aClass232Array5 == null && this.aClass404Array1 == null && !Static390.method5298(this.anInt9812, this.anInt9801)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray706 != null && !Static350.method4931(this.anInt9801, this.anInt9812)) {
				if (this.aClass287_12 != null && this.aClass287_12.anInterface13_5 == null) {
					this.aBoolean662 = true;
				} else {
					if (!this.aBoolean661) {
						this.method8382();
					}
					local37 = true;
				}
			}
			if (this.anIntArray708 != null && !Static307.method4548(this.anInt9801, this.anInt9812)) {
				if (this.aClass287_12 != null && this.aClass287_12.anInterface13_5 == null) {
					this.aBoolean662 = true;
				} else {
					local39 = true;
					if (!this.aBoolean661) {
						this.method8382();
					}
				}
			}
			if (this.anIntArray710 != null && !Static250.method3521(this.anInt9801, this.anInt9812)) {
				if (this.aClass287_12 != null && this.aClass287_12.anInterface13_5 == null) {
					this.aBoolean662 = true;
				} else {
					if (!this.aBoolean661) {
						this.method8382();
					}
					local41 = true;
				}
			}
			if (local41) {
				this.anIntArray710 = null;
			}
			if (local37) {
				this.anIntArray706 = null;
			}
			if (local39) {
				this.anIntArray708 = null;
			}
		}
		if (this.aShortArray129 != null && this.anIntArray706 == null && this.anIntArray708 == null && this.anIntArray710 == null) {
			this.aShortArray129 = null;
			this.anIntArray707 = null;
		}
		if (this.aByteArray95 != null && !Static591.method7611(this.anInt9801, this.anInt9812)) {
			if (this.aClass287_11 == null) {
				if (this.aClass287_9 != null && this.aClass287_9.anInterface13_5 == null) {
					this.aBoolean662 = true;
				} else {
					this.aByteArray95 = null;
					this.aShortArray123 = this.aShortArray130 = this.aShortArray126 = null;
				}
			} else if (this.aClass287_11.anInterface13_5 == null) {
				this.aBoolean662 = true;
			} else {
				this.aByteArray95 = null;
				this.aShortArray123 = this.aShortArray130 = this.aShortArray126 = null;
			}
		}
		if (this.aShortArray121 != null && !Static645.method8479(this.anInt9801, this.anInt9812)) {
			if (this.aClass287_9 != null && this.aClass287_9.anInterface13_5 == null) {
				this.aBoolean662 = true;
			} else {
				this.aShortArray121 = null;
			}
		}
		if (this.aByteArray94 != null && !Static531.method7072(this.anInt9801, this.anInt9812)) {
			if (this.aClass287_9 != null && this.aClass287_9.anInterface13_5 == null) {
				this.aBoolean662 = true;
			} else {
				this.aByteArray94 = null;
			}
		}
		if (this.aFloatArray67 != null && !Static609.method7807(this.anInt9812, this.anInt9801)) {
			if (this.aClass287_10 != null && this.aClass287_10.anInterface13_5 == null) {
				this.aBoolean662 = true;
			} else {
				this.aFloatArray67 = this.aFloatArray68 = null;
			}
		}
		if (this.aShortArray120 != null && !Static679.method9042(this.anInt9801, this.anInt9812)) {
			if (this.aClass287_9 != null && this.aClass287_9.anInterface13_5 == null) {
				this.aBoolean662 = true;
			} else {
				this.aShortArray120 = null;
			}
		}
		if (this.aShortArray125 != null && !Static134.method2373(this.anInt9801, this.anInt9812)) {
			if ((this.aClass148_1 == null || this.aClass148_1.anInterface27_3 != null) && (this.aClass287_9 == null || this.aClass287_9.anInterface13_5 != null)) {
				this.aShortArray125 = this.aShortArray122 = this.aShortArray128 = null;
			} else {
				this.aBoolean662 = true;
			}
		}
		if (this.anIntArrayArray55 != null && !Static658.method8605(this.anInt9812, this.anInt9801)) {
			this.anIntArrayArray55 = null;
			this.aShortArray127 = null;
		}
		if (this.anIntArrayArray53 != null && !Static663.method8644(this.anInt9801, -1, this.anInt9812)) {
			this.anIntArrayArray53 = null;
			this.aShortArray124 = null;
		}
		if (this.anIntArrayArray54 != null && !Static13.method498(this.anInt9812, this.anInt9801)) {
			this.anIntArrayArray54 = null;
		}
		if (this.anIntArray709 != null && (this.anInt9801 & 0x800) == 0 && (this.anInt9801 & 0x40000) == 0) {
			this.anIntArray709 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort106;
	}

	@OriginalMember(owner = "client!tt", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort113;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "()[B")
	@Override
	public byte[] method8366() {
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBZZLclient!tt;Lclient!tt;)Lclient!ka;")
	private Class170 method8380(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class170_Sub3 arg3, @OriginalArg(5) Class170_Sub3 arg4) {
		arg4.anInt9826 = this.anInt9826;
		arg4.anInt9834 = this.anInt9834;
		arg4.anInt9825 = this.anInt9825;
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean663 = this.aBoolean663;
		} else {
			arg4.aBoolean663 = true;
		}
		arg4.aShort108 = this.aShort108;
		arg4.anInt9802 = this.anInt9802;
		arg4.aBoolean664 = this.aBoolean664;
		arg4.anInt9801 = arg0;
		arg4.aShort106 = this.aShort106;
		arg4.aByte136 = 0;
		arg4.anInt9800 = this.anInt9800;
		arg4.anInt9784 = this.anInt9784;
		arg4.anInt9812 = this.anInt9812;
		@Pc(82) boolean local82 = Static688.method9111(this.anInt9812, arg0);
		@Pc(88) boolean local88 = Static183.method2902(arg0, this.anInt9812);
		@Pc(94) boolean local94 = Static474.method6454(this.anInt9812, arg0);
		@Pc(100) boolean local100 = local88 | local82 | local94;
		@Pc(241) int local241;
		if (local100) {
			if (!local82) {
				arg4.anIntArray706 = this.anIntArray706;
			} else if (arg3.anIntArray706 == null || arg3.anIntArray706.length < this.anInt9826) {
				arg4.anIntArray706 = arg3.anIntArray706 = new int[this.anInt9826];
			} else {
				arg4.anIntArray706 = arg3.anIntArray706;
			}
			if (!local88) {
				arg4.anIntArray708 = this.anIntArray708;
			} else if (arg3.anIntArray708 == null || this.anInt9826 > arg3.anIntArray708.length) {
				arg4.anIntArray708 = arg3.anIntArray708 = new int[this.anInt9826];
			} else {
				arg4.anIntArray708 = arg3.anIntArray708;
			}
			if (!local94) {
				arg4.anIntArray710 = this.anIntArray710;
			} else if (arg3.anIntArray710 == null || this.anInt9826 > arg3.anIntArray710.length) {
				arg4.anIntArray710 = arg3.anIntArray710 = new int[this.anInt9826];
			} else {
				arg4.anIntArray710 = arg3.anIntArray710;
			}
			for (local241 = 0; local241 < this.anInt9826; local241++) {
				if (local82) {
					arg4.anIntArray706[local241] = this.anIntArray706[local241];
				}
				if (local88) {
					arg4.anIntArray708[local241] = this.anIntArray708[local241];
				}
				if (local94) {
					arg4.anIntArray710[local241] = this.anIntArray710[local241];
				}
			}
		} else {
			arg4.anIntArray710 = this.anIntArray710;
			arg4.anIntArray706 = this.anIntArray706;
			arg4.anIntArray708 = this.anIntArray708;
		}
		if (Static401.method5419(this.anInt9812, arg0)) {
			arg4.aClass287_12 = arg3.aClass287_12;
			if (arg1) {
				arg4.aByte136 = (byte) (arg4.aByte136 | 0x1);
			}
			arg4.aClass287_12.aByte112 = this.aClass287_12.aByte112;
			arg4.aClass287_12.anInterface13_5 = this.aClass287_12.anInterface13_5;
		} else if (Static2.method22(arg0, this.anInt9812)) {
			arg4.aClass287_12 = this.aClass287_12;
		} else {
			arg4.aClass287_12 = null;
		}
		if (Static397.method5358(this.anInt9812, arg0)) {
			if (arg3.aShortArray121 == null || this.anInt9802 > arg3.aShortArray121.length) {
				arg4.aShortArray121 = arg3.aShortArray121 = new short[this.anInt9802];
			} else {
				arg4.aShortArray121 = arg3.aShortArray121;
			}
			for (local241 = 0; local241 < this.anInt9802; local241++) {
				arg4.aShortArray121[local241] = this.aShortArray121[local241];
			}
		} else {
			arg4.aShortArray121 = this.aShortArray121;
		}
		if (Static338.method4837(arg0, this.anInt9812)) {
			if (arg3.aByteArray94 == null || this.anInt9802 > arg3.aByteArray94.length) {
				arg4.aByteArray94 = arg3.aByteArray94 = new byte[this.anInt9802];
			} else {
				arg4.aByteArray94 = arg3.aByteArray94;
			}
			for (local241 = 0; local241 < this.anInt9802; local241++) {
				arg4.aByteArray94[local241] = this.aByteArray94[local241];
			}
		} else {
			arg4.aByteArray94 = this.aByteArray94;
		}
		if (Static571.method7409(arg0, this.anInt9812)) {
			if (arg1) {
				arg4.aByte136 = (byte) (arg4.aByte136 | 0x2);
			}
			arg4.aClass287_9 = arg3.aClass287_9;
			arg4.aClass287_9.aByte112 = this.aClass287_9.aByte112;
			arg4.aClass287_9.anInterface13_5 = this.aClass287_9.anInterface13_5;
		} else if (Static242.method3456(this.anInt9812, arg0)) {
			arg4.aClass287_9 = this.aClass287_9;
		} else {
			arg4.aClass287_9 = null;
		}
		@Pc(668) int local668;
		if (Static325.method4735(this.anInt9812, arg0)) {
			if (arg3.aShortArray123 == null || arg3.aShortArray123.length < this.anInt9800) {
				local241 = this.anInt9800;
				arg4.aShortArray123 = arg3.aShortArray123 = new short[local241];
				arg4.aShortArray130 = arg3.aShortArray130 = new short[local241];
				arg4.aShortArray126 = arg3.aShortArray126 = new short[local241];
			} else {
				arg4.aShortArray126 = arg3.aShortArray126;
				arg4.aShortArray130 = arg3.aShortArray130;
				arg4.aShortArray123 = arg3.aShortArray123;
			}
			if (this.aClass235_1 == null) {
				for (local241 = 0; local241 < this.anInt9800; local241++) {
					arg4.aShortArray123[local241] = this.aShortArray123[local241];
					arg4.aShortArray130[local241] = this.aShortArray130[local241];
					arg4.aShortArray126[local241] = this.aShortArray126[local241];
				}
			} else {
				if (arg3.aClass235_1 == null) {
					arg3.aClass235_1 = new Class235();
				}
				@Pc(650) Class235 local650 = arg4.aClass235_1 = arg3.aClass235_1;
				if (local650.aShortArray74 == null || local650.aShortArray74.length < this.anInt9800) {
					local668 = this.anInt9800;
					local650.aShortArray74 = new short[local668];
					local650.aByteArray57 = new byte[local668];
					local650.aShortArray72 = new short[local668];
					local650.aShortArray73 = new short[local668];
				}
				for (local668 = 0; local668 < this.anInt9800; local668++) {
					arg4.aShortArray123[local668] = this.aShortArray123[local668];
					arg4.aShortArray130[local668] = this.aShortArray130[local668];
					arg4.aShortArray126[local668] = this.aShortArray126[local668];
					local650.aShortArray74[local668] = this.aClass235_1.aShortArray74[local668];
					local650.aShortArray73[local668] = this.aClass235_1.aShortArray73[local668];
					local650.aShortArray72[local668] = this.aClass235_1.aShortArray72[local668];
					local650.aByteArray57[local668] = this.aClass235_1.aByteArray57[local668];
				}
			}
			arg4.aByteArray95 = this.aByteArray95;
		} else {
			arg4.aShortArray126 = this.aShortArray126;
			arg4.aShortArray130 = this.aShortArray130;
			arg4.aClass235_1 = this.aClass235_1;
			arg4.aShortArray123 = this.aShortArray123;
			arg4.aByteArray95 = this.aByteArray95;
		}
		if (Static495.method6772(arg0, this.anInt9812)) {
			if (arg1) {
				arg4.aByte136 = (byte) (arg4.aByte136 | 0x4);
			}
			arg4.aClass287_11 = arg3.aClass287_11;
			arg4.aClass287_11.aByte112 = this.aClass287_11.aByte112;
			arg4.aClass287_11.anInterface13_5 = this.aClass287_11.anInterface13_5;
		} else if (Static48.method1239(arg0, this.anInt9812)) {
			arg4.aClass287_11 = this.aClass287_11;
		} else {
			arg4.aClass287_11 = null;
		}
		if (Static275.method4891(this.anInt9812, arg0)) {
			if (arg3.aFloatArray67 == null || arg3.aFloatArray67.length < this.anInt9802) {
				local241 = this.anInt9800;
				arg4.aFloatArray67 = arg3.aFloatArray67 = new float[local241];
				arg4.aFloatArray68 = arg3.aFloatArray68 = new float[local241];
			} else {
				arg4.aFloatArray67 = arg3.aFloatArray67;
				arg4.aFloatArray68 = arg3.aFloatArray68;
			}
			for (local241 = 0; local241 < this.anInt9800; local241++) {
				arg4.aFloatArray67[local241] = this.aFloatArray67[local241];
				arg4.aFloatArray68[local241] = this.aFloatArray68[local241];
			}
		} else {
			arg4.aFloatArray68 = this.aFloatArray68;
			arg4.aFloatArray67 = this.aFloatArray67;
		}
		if (Static70.method3134(this.anInt9812, arg0)) {
			arg4.aClass287_10 = arg3.aClass287_10;
			if (arg1) {
				arg4.aByte136 = (byte) (arg4.aByte136 | 0x8);
			}
			arg4.aClass287_10.anInterface13_5 = this.aClass287_10.anInterface13_5;
			arg4.aClass287_10.aByte112 = this.aClass287_10.aByte112;
		} else if (Static630.method8286(this.anInt9812, arg0)) {
			arg4.aClass287_10 = this.aClass287_10;
		} else {
			arg4.aClass287_10 = null;
		}
		if (Static414.method5529(this.anInt9812, arg0)) {
			if (arg3.aShortArray125 == null || arg3.aShortArray125.length < this.anInt9802) {
				local241 = this.anInt9802;
				arg4.aShortArray128 = arg3.aShortArray128 = new short[local241];
				arg4.aShortArray125 = arg3.aShortArray125 = new short[local241];
				arg4.aShortArray122 = arg3.aShortArray122 = new short[local241];
			} else {
				arg4.aShortArray125 = arg3.aShortArray125;
				arg4.aShortArray122 = arg3.aShortArray122;
				arg4.aShortArray128 = arg3.aShortArray128;
			}
			for (local241 = 0; local241 < this.anInt9802; local241++) {
				arg4.aShortArray125[local241] = this.aShortArray125[local241];
				arg4.aShortArray122[local241] = this.aShortArray122[local241];
				arg4.aShortArray128[local241] = this.aShortArray128[local241];
			}
		} else {
			arg4.aShortArray128 = this.aShortArray128;
			arg4.aShortArray125 = this.aShortArray125;
			arg4.aShortArray122 = this.aShortArray122;
		}
		if (Static82.method1789(arg0, this.anInt9812)) {
			if (arg1) {
				arg4.aByte136 = (byte) (arg4.aByte136 | 0x10);
			}
			arg4.aClass148_1 = arg3.aClass148_1;
			arg4.aClass148_1.anInterface27_3 = this.aClass148_1.anInterface27_3;
		} else if (Static284.method4012(arg0, this.anInt9812)) {
			arg4.aClass148_1 = this.aClass148_1;
		} else {
			arg4.aClass148_1 = null;
		}
		if (Static546.method7200(arg0, this.anInt9812)) {
			if (arg3.aShortArray120 == null || arg3.aShortArray120.length < this.anInt9802) {
				local241 = this.anInt9802;
				arg4.aShortArray120 = arg3.aShortArray120 = new short[local241];
			} else {
				arg4.aShortArray120 = arg3.aShortArray120;
			}
			for (local241 = 0; local241 < this.anInt9802; local241++) {
				arg4.aShortArray120[local241] = this.aShortArray120[local241];
			}
		} else {
			arg4.aShortArray120 = this.aShortArray120;
		}
		if (!Static725.method9587(arg0, this.anInt9812)) {
			arg4.aClass179Array1 = this.aClass179Array1;
		} else if (arg3.aClass179Array1 == null || arg3.aClass179Array1.length < this.anInt9834) {
			local241 = this.anInt9834;
			arg4.aClass179Array1 = arg3.aClass179Array1 = new Class179[local241];
			for (local668 = 0; local668 < this.anInt9834; local668++) {
				arg4.aClass179Array1[local668] = this.aClass179Array1[local668].method3938();
			}
		} else {
			arg4.aClass179Array1 = arg3.aClass179Array1;
			for (local241 = 0; local241 < this.anInt9834; local241++) {
				arg4.aClass179Array1[local241].method3936(this.aClass179Array1[local241]);
			}
		}
		arg4.aClass184Array5 = this.aClass184Array5;
		arg4.aClass232Array5 = this.aClass232Array5;
		arg4.aShortArray124 = this.aShortArray124;
		arg4.aShortArray129 = this.aShortArray129;
		arg4.anIntArrayArray54 = this.anIntArrayArray54;
		arg4.anIntArrayArray55 = this.anIntArrayArray55;
		arg4.anIntArray709 = this.anIntArray709;
		arg4.anIntArrayArray53 = this.anIntArrayArray53;
		arg4.aClass404Array1 = this.aClass404Array1;
		arg4.anIntArray707 = this.anIntArray707;
		if (this.aBoolean661) {
			arg4.aShort105 = this.aShort105;
			arg4.aShort112 = this.aShort112;
			arg4.aShort104 = this.aShort104;
			arg4.aShort107 = this.aShort107;
			arg4.aShort111 = this.aShort111;
			arg4.aShort109 = this.aShort109;
			arg4.aShort110 = this.aShort110;
			arg4.aShort113 = this.aShort113;
			arg4.aBoolean661 = true;
		} else {
			arg4.aBoolean661 = false;
		}
		arg4.aShortArray127 = this.aShortArray127;
		return arg4;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!cl;ZI)Z")
	@Override
	public boolean method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8375(arg0, -1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BZ)V")
	private void method8381(@OriginalArg(1) boolean arg0) {
		if (this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1.aByteArray20.length < this.anInt9784 * 6) {
			this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2((this.anInt9784 + 100) * 6);
		} else {
			this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1.anInt2178 = 0;
		}
		@Pc(49) Class3_Sub2_Sub2 local49 = this.aClass22_Sub1_39.aClass3_Sub2_Sub2_1;
		@Pc(55) int local55;
		if (this.aClass22_Sub1_39.aBoolean60) {
			for (local55 = 0; local55 < this.anInt9784; local55++) {
				local49.method2032(this.aShortArray125[local55]);
				local49.method2032(this.aShortArray122[local55]);
				local49.method2032(this.aShortArray128[local55]);
			}
		} else {
			for (local55 = 0; local55 < this.anInt9784; local55++) {
				local49.method2070(this.aShortArray125[local55]);
				local49.method2070(this.aShortArray122[local55]);
				local49.method2070(this.aShortArray128[local55]);
			}
		}
		if (local49.anInt2178 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface27_5 == null) {
				this.anInterface27_5 = this.aClass22_Sub1_39.method896(true, local49.aByteArray20, local49.anInt2178);
			} else {
				this.anInterface27_5.method9070(local49.anInt2178, local49.aByteArray20);
			}
			this.aClass148_1.anInterface27_3 = this.anInterface27_5;
		} else {
			this.aClass148_1.anInterface27_3 = this.aClass22_Sub1_39.method896(false, local49.aByteArray20, local49.anInt2178);
		}
		if (!arg0) {
			this.aBoolean662 = true;
		}
	}

	@OriginalMember(owner = "client!tt", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort109;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
	private void method8382() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt9825; local31++) {
			@Pc(40) int local40 = this.anIntArray706[local31];
			@Pc(45) int local45 = this.anIntArray708[local31];
			if (local7 > local40) {
				local7 = local40;
			}
			@Pc(59) int local59 = this.anIntArray710[local31];
			if (local9 > local45) {
				local9 = local45;
			}
			if (local15 < local45) {
				local15 = local45;
			}
			if (local13 < local40) {
				local13 = local40;
			}
			if (local59 > local17) {
				local17 = local59;
			}
			if (local11 > local59) {
				local11 = local59;
			}
			@Pc(104) int local104 = local59 * local59 + local40 * local40;
			if (local104 > local19) {
				local19 = local104;
			}
			local104 = local40 * local40 + local59 * local59 + local45 * local45;
			if (local21 < local104) {
				local21 = local104;
			}
		}
		this.aShort113 = (short) local13;
		this.aShort107 = (short) local11;
		this.aShort104 = (short) local9;
		this.aShort105 = (short) local17;
		this.aShort111 = (short) local7;
		this.aShort109 = (short) local15;
		this.aShort110 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort112 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean661 = true;
	}

	@OriginalMember(owner = "client!tt", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg0];
		@Pc(13) int local13 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9825; local15++) {
			@Pc(35) int local35 = this.anIntArray708[local15] * local9 + local13 * this.anIntArray706[local15] >> 14;
			this.anIntArray708[local15] = this.anIntArray708[local15] * local13 - local9 * this.anIntArray706[local15] >> 14;
			this.anIntArray706[local15] = local35;
		}
		this.aBoolean661 = false;
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(SIBII)I")
	private int method8383(@OriginalArg(0) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static537.anIntArray601[Static618.method9599(arg3, arg2)];
		if (arg0 != -1) {
			@Pc(33) Class406 local33 = this.aClass22_Sub1_39.anInterface4_14.method5761(arg0 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte144 & 0xFF;
			@Pc(49) int local49;
			@Pc(78) int local78;
			if (local38 != 0) {
				if (arg3 < 0) {
					local49 = 0;
				} else if (arg3 <= 127) {
					local49 = arg3 * 131586;
				} else {
					local49 = 16777215;
				}
				if (local38 == 256) {
					local12 = local49;
				} else {
					local78 = 256 - local38;
					local12 = ((local49 & 0xFF00FF) * local38 + local78 * (local12 & 0xFF00FF) & 0xFF00FF00) + (local78 * (local12 & 0xFF00) + (local49 & 0xFF00) * local38 & 0xFF0000) >> 8;
				}
			}
			local49 = local33.aByte146 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(124) int local124 = (local12 >> 16 & 0xFF) * local49;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local78 = local49 * (local12 >> 8 & 0xFF);
				if (local78 > 65535) {
					local78 = 65535;
				}
				@Pc(150) int local150 = local49 * (local12 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local12 = (local150 >> 8) + (local78 & 0xFF00) + ((local124 & 0xAF00FF00) << 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(55) int local55;
		@Pc(53) int[] local53;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static535.anInt10663 = 0;
			Static2.anInt11 = 0;
			local31 = 0;
			Static487.anInt7666 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray53.length) {
					local53 = this.anIntArrayArray53[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static2.anInt11 += this.anIntArray706[local61];
						Static487.anInt7666 += this.anIntArray708[local61];
						Static535.anInt10663 += this.anIntArray710[local61];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static2.anInt11 = local21;
				Static535.anInt10663 = local17;
				Static487.anInt7666 = local25;
			} else {
				Static2.anInt11 = local21 + Static2.anInt11 / local31;
				Static487.anInt7666 = local25 + Static487.anInt7666 / local31;
				Static535.anInt10663 = Static535.anInt10663 / local31 + local17;
			}
			return;
		}
		@Pc(167) int[] local167;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local25 = arg3 << 4;
			local21 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray53.length) {
					local167 = this.anIntArrayArray53[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray706[local55] += local21;
						this.anIntArray708[local55] += local25;
						this.anIntArray710[local55] += local17;
					}
				}
			}
			return;
		}
		@Pc(291) int local291;
		@Pc(310) int local310;
		@Pc(767) int local767;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray53.length) {
					local167 = this.anIntArrayArray53[local35];
					if ((arg5 & 0x1) == 0) {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray706[local55] -= Static2.anInt11;
							this.anIntArray708[local55] -= Static487.anInt7666;
							this.anIntArray710[local55] -= Static535.anInt10663;
							if (arg4 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
								local310 = this.anIntArray708[local55] * local61 + local291 * this.anIntArray706[local55] + 16383 >> 14;
								this.anIntArray708[local55] = local291 * this.anIntArray708[local55] + 16383 - local61 * this.anIntArray706[local55] >> 14;
								this.anIntArray706[local55] = local310;
							}
							if (arg2 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
								local310 = this.anIntArray708[local55] * local291 + 16383 - this.anIntArray710[local55] * local61 >> 14;
								this.anIntArray710[local55] = this.anIntArray710[local55] * local291 + local61 * this.anIntArray708[local55] + 16383 >> 14;
								this.anIntArray708[local55] = local310;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
								local310 = this.anIntArray706[local55] * local291 + this.anIntArray710[local55] * local61 + 16383 >> 14;
								this.anIntArray710[local55] = local291 * this.anIntArray710[local55] + 16383 - local61 * this.anIntArray706[local55] >> 14;
								this.anIntArray706[local55] = local310;
							}
							this.anIntArray706[local55] += Static2.anInt11;
							this.anIntArray708[local55] += Static487.anInt7666;
							this.anIntArray710[local55] += Static535.anInt10663;
						}
					} else {
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							this.anIntArray706[local55] -= Static2.anInt11;
							this.anIntArray708[local55] -= Static487.anInt7666;
							this.anIntArray710[local55] -= Static535.anInt10663;
							if (arg2 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
								local310 = local291 * this.anIntArray708[local55] + 16383 - local61 * this.anIntArray710[local55] >> 14;
								this.anIntArray710[local55] = local61 * this.anIntArray708[local55] + this.anIntArray710[local55] * local291 + 16383 >> 14;
								this.anIntArray708[local55] = local310;
							}
							if (arg4 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
								local310 = local61 * this.anIntArray708[local55] + this.anIntArray706[local55] * local291 + 16383 >> 14;
								this.anIntArray708[local55] = local291 * this.anIntArray708[local55] + 16383 - local61 * this.anIntArray706[local55] >> 14;
								this.anIntArray706[local55] = local310;
							}
							if (arg3 != 0) {
								local61 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
								local291 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
								local310 = local291 * this.anIntArray706[local55] + local61 * this.anIntArray710[local55] + 16383 >> 14;
								this.anIntArray710[local55] = this.anIntArray710[local55] * local291 + 16383 - local61 * this.anIntArray706[local55] >> 14;
								this.anIntArray706[local55] = local310;
							}
							this.anIntArray706[local55] += Static2.anInt11;
							this.anIntArray708[local55] += Static487.anInt7666;
							this.anIntArray710[local55] += Static535.anInt10663;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (local43 < this.anIntArrayArray53.length) {
						local53 = this.anIntArrayArray53[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local291 = this.anIntArray707[local61];
							local310 = this.anIntArray707[local61 + 1];
							for (local767 = local291; local767 < local310; local767++) {
								@Pc(776) int local776 = this.aShortArray129[local767] - 1;
								if (local776 == -1) {
									break;
								}
								@Pc(788) int local788;
								@Pc(792) int local792;
								@Pc(811) int local811;
								if (arg4 != 0) {
									local788 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg4];
									local792 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg4];
									local811 = this.aShortArray130[local776] * local788 + this.aShortArray123[local776] * local792 + 16383 >> 14;
									this.aShortArray130[local776] = (short) (this.aShortArray130[local776] * local792 + 16383 - this.aShortArray123[local776] * local788 >> 14);
									this.aShortArray123[local776] = (short) local811;
								}
								if (arg2 != 0) {
									local788 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg2];
									local792 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg2];
									local811 = this.aShortArray130[local776] * local792 + 16383 - this.aShortArray126[local776] * local788 >> 14;
									this.aShortArray126[local776] = (short) (local788 * this.aShortArray130[local776] + this.aShortArray126[local776] * local792 + 16383 >> 14);
									this.aShortArray130[local776] = (short) local811;
								}
								if (arg3 != 0) {
									local788 = Class3_Sub7_Sub17_Sub1.anIntArray549[arg3];
									local792 = Class3_Sub7_Sub17_Sub1.anIntArray548[arg3];
									local811 = this.aShortArray123[local776] * local792 + this.aShortArray126[local776] * local788 + 16383 >> 14;
									this.aShortArray126[local776] = (short) (local792 * this.aShortArray126[local776] + 16383 - this.aShortArray123[local776] * local788 >> 14);
									this.aShortArray123[local776] = (short) local811;
								}
							}
						}
					}
				}
				if (this.aClass287_11 == null && this.aClass287_9 != null) {
					this.aClass287_9.anInterface13_5 = null;
				}
				if (this.aClass287_11 != null) {
					this.aClass287_11.anInterface13_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray53.length > local35) {
					local167 = this.anIntArrayArray53[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local55 = local167[local169];
						this.anIntArray706[local55] -= Static2.anInt11;
						this.anIntArray708[local55] -= Static487.anInt7666;
						this.anIntArray710[local55] -= Static535.anInt10663;
						this.anIntArray706[local55] = this.anIntArray706[local55] * arg2 >> 7;
						this.anIntArray708[local55] = arg3 * this.anIntArray708[local55] >> 7;
						this.anIntArray710[local55] = arg4 * this.anIntArray710[local55] >> 7;
						this.anIntArray706[local55] += Static2.anInt11;
						this.anIntArray708[local55] += Static487.anInt7666;
						this.anIntArray710[local55] += Static535.anInt10663;
					}
				}
			}
		} else {
			@Pc(1260) Class404 local1260;
			@Pc(1265) Class179 local1265;
			if (arg0 == 5) {
				if (this.anIntArrayArray55 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray55.length > local35) {
							local167 = this.anIntArrayArray55[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local55 = local167[local169];
								local61 = arg2 * 8 + (this.aByteArray94[local55] & 0xFF);
								if (local61 < 0) {
									local61 = 0;
								} else if (local61 > 255) {
									local61 = 255;
								}
								this.aByteArray94[local55] = (byte) local61;
							}
							if (local167.length > 0 && this.aClass287_9 != null) {
								this.aClass287_9.anInterface13_5 = null;
							}
						}
					}
					if (this.aClass404Array1 != null) {
						for (local35 = 0; local35 < this.anInt9834; local35++) {
							local1260 = this.aClass404Array1[local35];
							local1265 = this.aClass179Array1[local35];
							local1265.anInt4267 = 255 - (this.aByteArray94[local1260.anInt11136] & 0xFF) << 24 | local1265.anInt4267 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1543) Class179 local1543;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray54.length) {
								local167 = this.anIntArrayArray54[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1543 = this.aClass179Array1[local167[local169]];
									local1543.anInt4268 += arg3;
									local1543.anInt4269 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray54.length > local35) {
								local167 = this.anIntArrayArray54[local35];
								for (local169 = 0; local169 < local167.length; local169++) {
									local1543 = this.aClass179Array1[local167[local169]];
									local1543.anInt4266 = local1543.anInt4266 * arg3 >> 7;
									local1543.anInt4271 = arg2 * local1543.anInt4271 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray54.length) {
							local167 = this.anIntArrayArray54[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1543 = this.aClass179Array1[local167[local169]];
								local1543.anInt4265 = local1543.anInt4265 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray55 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray55.length > local35) {
						local167 = this.anIntArrayArray55[local35];
						for (local169 = 0; local169 < local167.length; local169++) {
							local55 = local167[local169];
							local61 = this.aShortArray121[local55] & 0xFFFF;
							local291 = local61 >> 10 & 0x3F;
							local310 = local61 >> 7 & 0x7;
							local767 = local61 & 0x7F;
							local310 += arg3 / 4;
							@Pc(1366) int local1366 = local291 + arg2 & 0x3F;
							if (local310 < 0) {
								local310 = 0;
							} else if (local310 > 7) {
								local310 = 7;
							}
							local767 += arg4;
							if (local767 < 0) {
								local767 = 0;
							} else if (local767 > 127) {
								local767 = 127;
							}
							this.aShortArray121[local55] = (short) (local1366 << 10 | local310 << 7 | local767);
						}
						if (local167.length > 0 && this.aClass287_9 != null) {
							this.aClass287_9.anInterface13_5 = null;
						}
					}
				}
				if (this.aClass404Array1 != null) {
					for (local35 = 0; local35 < this.anInt9834; local35++) {
						local1260 = this.aClass404Array1[local35];
						local1265 = this.aClass179Array1[local35];
						local1265.anInt4267 = Static537.anIntArray601[this.aShortArray121[local1260.anInt11136] & 0xFFFF] & 0xFFFFFF | local1265.anInt4267 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort107;
	}

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean661) {
			this.method8382();
		}
		@Pc(18) int local18 = arg4 + this.aShort111;
		@Pc(23) int local23 = this.aShort113 + arg4;
		@Pc(28) int local28 = this.aShort107 + arg6;
		@Pc(33) int local33 = this.aShort105 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt10949 <= arg2.anInt10947 + local23 >> arg2.anInt10943 || local28 < 0 || arg2.anInt10946 <= local33 + arg2.anInt10947 >> arg2.anInt10943)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt10949 <= arg3.anInt10947 + local23 >> arg3.anInt10943 || local28 < 0 || local33 + arg3.anInt10947 >> arg3.anInt10943 >= arg3.anInt10946) {
				return;
			}
		} else {
			local18 >>= arg2.anInt10943;
			local23 = local23 + arg2.anInt10947 - 1 >> arg2.anInt10943;
			local28 >>= arg2.anInt10943;
			local33 = arg2.anInt10947 + local33 - 1 >> arg2.anInt10943;
			if (arg2.method9295(local28, local18) == arg5 && arg5 == arg2.method9295(local28, local23) && arg2.method9295(local33, local18) == arg5 && arg2.method9295(local33, local23) == arg5) {
				return;
			}
		}
		@Pc(263) int local263;
		if (arg0 == 1) {
			for (local263 = 0; local263 < this.anInt9825; local263++) {
				this.anIntArray708[local263] -= arg5 - arg2.method9294(arg6 + this.anIntArray710[local263], this.anIntArray706[local263] + arg4);
			}
		} else {
			@Pc(265) int local265;
			@Pc(274) int local274;
			if (arg0 == 2) {
				@Pc(490) short local490 = this.aShort104;
				if (local490 == 0) {
					return;
				}
				for (local265 = 0; local265 < this.anInt9825; local265++) {
					local274 = (this.anIntArray708[local265] << 16) / local490;
					if (arg1 > local274) {
						this.anIntArray708[local265] += (arg2.method9294(arg6 + this.anIntArray710[local265], arg4 + this.anIntArray706[local265]) - arg5) * (arg1 - local274) / arg1;
					}
				}
			} else {
				@Pc(281) int local281;
				if (arg0 == 3) {
					local263 = (arg1 & 0xFF) * 4;
					local265 = (arg1 >> 8 & 0xFF) * 4;
					local274 = (arg1 >> 16 & 0xFF) << 6;
					local281 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local263 >> 1) < 0 || arg4 + (local263 >> 1) + arg2.anInt10947 >= arg2.anInt10949 << arg2.anInt10943 || arg6 - (local265 >> 1) < 0 || arg2.anInt10946 << arg2.anInt10943 <= arg2.anInt10947 + (local265 >> 1) + arg6) {
						return;
					}
					this.method8346(arg5, local274, arg4, local263, local281, arg2, local265, arg6);
				} else if (arg0 == 4) {
					local263 = this.aShort109 - this.aShort104;
					for (local265 = 0; local265 < this.anInt9825; local265++) {
						this.anIntArray708[local265] = local263 + this.anIntArray708[local265] + arg3.method9294(this.anIntArray710[local265] + arg6, arg4 + this.anIntArray706[local265]) - arg5;
					}
				} else if (arg0 == 5) {
					local263 = this.aShort109 - this.aShort104;
					for (local265 = 0; local265 < this.anInt9825; local265++) {
						local274 = arg4 + this.anIntArray706[local265];
						local281 = this.anIntArray710[local265] + arg6;
						@Pc(287) int local287 = arg2.method9294(local281, local274);
						@Pc(293) int local293 = arg3.method9294(local281, local274);
						@Pc(301) int local301 = local287 - arg1 - local293;
						this.anIntArray708[local265] = (local301 * ((this.anIntArray708[local265] << 8) / local263) >> 8) + local287 - arg5;
					}
				}
			}
		}
		this.aBoolean661 = false;
		if (this.aClass287_12 != null) {
			this.aClass287_12.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IFFIIIIIJLclient!gt;)S")
	private short method8384(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) Class145 arg8) {
		@Pc(25) int local25 = this.anIntArray707[arg5];
		@Pc(32) int local32 = this.anIntArray707[arg5 + 1];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = local25; local36 < local32; local36++) {
			@Pc(45) short local45 = this.aShortArray129[local36];
			if (local45 == 0) {
				local34 = local36;
				break;
			}
			if (arg7 == Static139.aLongArray9[local36]) {
				return (short) (local45 - 1);
			}
		}
		this.aShortArray129[local34] = (short) (this.anInt9800 + 1);
		Static139.aLongArray9[local34] = arg7;
		this.aShortArray123[this.anInt9800] = (short) arg0;
		this.aShortArray130[this.anInt9800] = (short) arg3;
		this.aShortArray126[this.anInt9800] = (short) arg6;
		this.aByteArray95[this.anInt9800] = (byte) arg4;
		this.aFloatArray67[this.anInt9800] = arg2;
		this.aFloatArray68[this.anInt9800] = arg1;
		return (short) this.anInt9800++;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B[B)V")
	@Override
	public void method8363(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5;
		if (arg1 == null) {
			for (local5 = 0; local5 < this.anInt9802; local5++) {
				this.aByteArray94[local5] = arg0;
			}
		} else {
			for (local5 = 0; local5 < this.anInt9802; local5++) {
				@Pc(27) int local27 = 255 - (255 - (arg0 & 0xFF)) * (255 - (arg1[local5] & 0xFF)) / 255;
				this.aByteArray94[local5] = (byte) local27;
			}
		}
		if (this.aClass287_9 != null) {
			this.aClass287_9.anInterface13_5 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean661) {
			this.method8382();
		}
		return this.aShort112;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!cl;IZ)V")
	@Override
	public void method8361(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray124 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9825; local15++) {
			if ((this.aShortArray124[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method9511(this.anIntArray706[local15], this.anIntArray708[local15], this.anIntArray710[local15], local13);
				} else {
					arg0.method9519(this.anIntArray706[local15], this.anIntArray708[local15], this.anIntArray710[local15], local13);
				}
				this.anIntArray706[local15] = local13[0];
				this.anIntArray708[local15] = local13[1];
				this.anIntArray710[local15] = local13[2];
			}
		}
	}
}
