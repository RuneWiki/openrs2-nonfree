import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class164_Sub2 extends Class164 {

	@OriginalMember(owner = "client!jb", name = "sc", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
	private int anInt4604;

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "[Lclient!mha;")
	private Class235[] aClass235Array1;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!raa;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!jb", name = "Bb", descriptor = "I")
	private int anInt4609;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[F")
	private float[] aFloatArray37;

	@OriginalMember(owner = "client!jb", name = "Nb", descriptor = "[Lclient!hja;")
	private Class161[] aClass161Array3;

	@OriginalMember(owner = "client!jb", name = "Sb", descriptor = "I")
	private int anInt4621;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!jb", name = "uc", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!jb", name = "Bc", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!jb", name = "Ub", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Lclient!jk;")
	private Class189[] aClass189Array3;

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!tv;")
	private Class338 aClass338_1;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!jb", name = "xc", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!jb", name = "vc", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Lclient!ml;")
	private Interface15 anInterface15_4;

	@OriginalMember(owner = "client!jb", name = "fc", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!jb", name = "bc", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!jb", name = "Ac", descriptor = "[F")
	private float[] aFloatArray38;

	@OriginalMember(owner = "client!jb", name = "ic", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!jb", name = "Ec", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jb", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!jb", name = "nc", descriptor = "[Lclient!sw;")
	private Class329[] aClass329Array1;

	@OriginalMember(owner = "client!jb", name = "gc", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "B")
	private byte aByte67;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!jb", name = "Yb", descriptor = "Z")
	private boolean aBoolean364 = false;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	private int anInt4620 = 0;

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "Z")
	private boolean aBoolean363 = false;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "Z")
	private boolean lb = true;

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
	private int anInt4624 = 0;

	@OriginalMember(owner = "client!jb", name = "ec", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
	private int anInt4622 = 0;

	@OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
	private int anInt4646 = 0;

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
	private int anInt4598 = 0;

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_16;

	@OriginalMember(owner = "client!jb", name = "Ab", descriptor = "Lclient!uo;")
	private Class356 aClass356_10;

	@OriginalMember(owner = "client!jb", name = "Cb", descriptor = "Lclient!uo;")
	private Class356 aClass356_9;

	@OriginalMember(owner = "client!jb", name = "Tb", descriptor = "Lclient!uo;")
	private Class356 aClass356_8;

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!uo;")
	private Class356 aClass356_7;

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "Lclient!fa;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class164_Sub2(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_16 = arg0;
		this.aClass356_10 = new Class356((Interface15) null, 5126, 3, 0);
		this.aClass356_9 = new Class356((Interface15) null, 5126, 2, 0);
		this.aClass356_8 = new Class356((Interface15) null, 5126, 3, 0);
		this.aClass356_7 = new Class356((Interface15) null, 5121, 4, 0);
		this.aClass116_1 = new Class116();
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ffa;Lclient!ju;IIII)V")
	public Class164_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4621 = arg2;
		this.aClass57_Sub2_16 = arg0;
		this.anInt4604 = arg5;
		if (Static608.method8687(arg2, arg5)) {
			this.aClass356_10 = new Class356((Interface15) null, 5126, 3, 0);
		}
		if (Static287.method4313(arg2, arg5)) {
			this.aClass356_9 = new Class356((Interface15) null, 5126, 2, 0);
		}
		if (Static555.method8023(arg2, arg5)) {
			this.aClass356_8 = new Class356((Interface15) null, 5126, 3, 0);
		}
		if (Static680.method9332(arg2, arg5)) {
			this.aClass356_7 = new Class356((Interface15) null, 5121, 4, 0);
		}
		if (Static208.method7683(arg5, arg2)) {
			this.aClass116_1 = new Class116();
		}
		@Pc(116) Interface1 local116 = arg0.anInterface1_11;
		this.anIntArray260 = new int[arg1.anInt5075 + 1];
		@Pc(127) int[] local127 = new int[arg1.anInt5085];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt5085; local129++) {
			if (arg1.aByteArray40 == null || arg1.aByteArray40[local129] != 2) {
				if (arg1.aShortArray74 != null && arg1.aShortArray74[local129] != -1) {
					@Pc(170) Class233 local170 = local116.method2863(arg1.aShortArray74[local129] & 0xFFFF);
					if (((this.anInt4604 & 0x40) == 0 || !local170.aBoolean482) && local170.aBoolean481) {
						continue;
					}
				}
				local127[this.anInt4622++] = local129;
				this.anIntArray260[arg1.aShortArray72[local129]]++;
				this.anIntArray260[arg1.aShortArray77[local129]]++;
				this.anIntArray260[arg1.aShortArray69[local129]]++;
			}
		}
		this.anInt4624 = this.anInt4622;
		@Pc(251) long[] local251 = new long[this.anInt4622];
		@Pc(266) boolean local266 = (this.anInt4621 & 0x100) != 0;
		@Pc(280) int local280;
		@Pc(293) int local293;
		@Pc(496) int local496;
		for (@Pc(268) int local268 = 0; local268 < this.anInt4622; local268++) {
			@Pc(276) int local276 = local127[local268];
			@Pc(278) Class233 local278 = null;
			local280 = 0;
			@Pc(282) byte local282 = 0;
			@Pc(284) byte local284 = 0;
			@Pc(286) byte local286 = 0;
			if (arg1.aClass106Array1 != null) {
				@Pc(291) boolean local291 = false;
				for (local293 = 0; local293 < arg1.aClass106Array1.length; local293++) {
					@Pc(300) Class106 local300 = arg1.aClass106Array1[local293];
					if (local300.anInt2265 == local276) {
						@Pc(313) Class251 local313 = Static107.method1556(local300.anInt2264);
						if (local313.aBoolean527) {
							local291 = true;
						}
						if (local313.anInt6810 != -1) {
							@Pc(328) Class233 local328 = local116.method2863(local313.anInt6810);
							if (local328.anInt6313 == 2) {
								this.aBoolean365 = true;
							}
						}
					}
				}
				if (local291) {
					local251[local268] = Long.MAX_VALUE;
					this.anInt4624--;
					continue;
				}
			}
			@Pc(363) short local363 = -1;
			if (arg1.aShortArray74 != null) {
				local363 = arg1.aShortArray74[local276];
				if (local363 != -1) {
					local278 = local116.method2863(local363 & 0xFFFF);
					if ((this.anInt4604 & 0x40) != 0 && local278.aBoolean482) {
						local278 = null;
						local363 = -1;
					} else {
						local286 = local278.aByte92;
						if (local278.aByte96 != 0 || local278.aByte93 != 0) {
							this.aBoolean364 = true;
						}
						local284 = local278.aByte94;
					}
				}
			}
			@Pc(448) boolean local448 = arg1.aByteArray37 != null && arg1.aByteArray37[local276] != 0 || local278 != null && local278.anInt6313 != 0;
			if ((local266 || local448) && arg1.aByteArray42 != null) {
				local280 += arg1.aByteArray42[local276] << 17;
			}
			if (local448) {
				local280 += 65536;
			}
			local280 += (local284 & 0xFF) << 8;
			local280 += local286 & 0xFF;
			local496 = local282 + ((local363 & 0xFFFF) << 16);
			@Pc(502) int local502 = local496 + (local268 & 0xFFFF);
			local251[local268] = ((long) local280 << 32) + ((long) local502);
			this.aBoolean364 |= local278 != null && (local278.aByte96 != 0 || local278.aByte93 != 0);
			this.aBoolean365 |= local448;
		}
		Static148.method2092(local251, local127);
		this.anInt4620 = arg1.anInt5083;
		this.anIntArray261 = arg1.anIntArray278;
		this.aShortArray65 = arg1.aShortArray78;
		this.anIntArray262 = arg1.anIntArray280;
		this.anInt4598 = arg1.anInt5075;
		this.anIntArray258 = arg1.anIntArray281;
		this.aClass161Array3 = arg1.aClass161Array4;
		this.aClass189Array3 = arg1.aClass189Array4;
		@Pc(593) Class18[] local593 = new Class18[this.anInt4598];
		@Pc(613) int local613;
		@Pc(629) int local629;
		@Pc(676) int local676;
		if (arg1.aClass106Array1 != null) {
			this.anInt4609 = arg1.aClass106Array1.length;
			this.aClass329Array1 = new Class329[this.anInt4609];
			this.aClass235Array1 = new Class235[this.anInt4609];
			for (local613 = 0; local613 < this.anInt4609; local613++) {
				@Pc(622) Class106 local622 = arg1.aClass106Array1[local613];
				@Pc(627) Class251 local627 = Static107.method1556(local622.anInt2264);
				local629 = -1;
				for (@Pc(631) int local631 = 0; local631 < this.anInt4622; local631++) {
					if (local127[local631] == local622.anInt2265) {
						local629 = local631;
						break;
					}
				}
				if (local629 == -1) {
					throw new RuntimeException();
				}
				local676 = Static560.anIntArray534[arg1.aShortArray76[local622.anInt2265] & 0xFFFF] & 0xFFFFFF;
				@Pc(695) int local695 = local676 | 255 - (arg1.aByteArray37 == null ? 0 : arg1.aByteArray37[local622.anInt2265]) << 24;
				this.aClass329Array1[local613] = new Class329(local629, arg1.aShortArray72[local622.anInt2265], arg1.aShortArray77[local622.anInt2265], arg1.aShortArray69[local622.anInt2265], local627.anInt6814, local627.anInt6812, local627.anInt6810, local627.anInt6808, local627.anInt6811, local627.aBoolean527, local627.aBoolean528, local622.anInt2271);
				this.aClass235Array1[local613] = new Class235(local695);
			}
		}
		local613 = this.anInt4622 * 3;
		this.aShortArray68 = new short[local613];
		this.aByteArray33 = new byte[this.anInt4622];
		Static237.aLongArray4 = new long[local613];
		this.aFloatArray38 = new float[local613];
		this.aShort62 = (short) arg3;
		this.aShortArray62 = new short[this.anInt4622];
		this.aShortArray59 = new short[this.anInt4622];
		if (arg1.aShortArray71 != null) {
			this.aShortArray58 = new short[this.anInt4622];
		}
		this.aShortArray60 = new short[local613];
		this.aShortArray64 = new short[this.anInt4622];
		this.aShort66 = (short) arg4;
		this.aShortArray67 = new short[this.anInt4622];
		this.aFloatArray37 = new float[local613];
		this.aByteArray34 = new byte[local613];
		this.aShortArray66 = new short[local613];
		this.aShortArray63 = new short[local613];
		this.aShortArray61 = new short[this.anInt4622];
		local280 = 0;
		for (local496 = 0; local496 < arg1.anInt5075; local496++) {
			local629 = this.anIntArray260[local496];
			this.anIntArray260[local496] = local280;
			local280 += local629;
			local593[local496] = new Class18();
		}
		this.anIntArray260[arg1.anInt5075] = local280;
		@Pc(885) Class330 local885 = Static294.method4360(local127, this.anInt4622, arg1);
		@Pc(889) Class360[] local889 = new Class360[arg1.anInt5085];
		@Pc(931) int local931;
		@Pc(942) int local942;
		@Pc(962) int local962;
		@Pc(973) int local973;
		@Pc(982) int local982;
		@Pc(991) int local991;
		@Pc(910) short local910;
		@Pc(920) int local920;
		for (local676 = 0; local676 < arg1.anInt5085; local676++) {
			@Pc(900) short local900 = arg1.aShortArray72[local676];
			@Pc(905) short local905 = arg1.aShortArray77[local676];
			local910 = arg1.aShortArray69[local676];
			local920 = this.anIntArray261[local905] - this.anIntArray261[local900];
			local931 = this.anIntArray262[local905] - this.anIntArray262[local900];
			local942 = this.anIntArray258[local905] - this.anIntArray258[local900];
			@Pc(952) int local952 = this.anIntArray261[local910] - this.anIntArray261[local900];
			local962 = this.anIntArray262[local910] - this.anIntArray262[local900];
			local973 = this.anIntArray258[local910] - this.anIntArray258[local900];
			local982 = local973 * local931 - local942 * local962;
			local991 = local942 * local952 - local920 * local973;
			@Pc(1000) int local1000 = local920 * local962 - local952 * local931;
			while (local982 > 8192 || local991 > 8192 || local1000 > 8192 || local982 < -8192 || local991 < -8192 || local1000 < -8192) {
				local982 >>= 0x1;
				local1000 >>= 0x1;
				local991 >>= 0x1;
			}
			@Pc(1057) int local1057 = (int) Math.sqrt((double) (local982 * local982 + local991 * local991 + local1000 * local1000));
			if (local1057 <= 0) {
				local1057 = 1;
			}
			local982 = local982 * 256 / local1057;
			local1000 = local1000 * 256 / local1057;
			local991 = local991 * 256 / local1057;
			@Pc(1093) byte local1093 = arg1.aByteArray40 == null ? 0 : arg1.aByteArray40[local676];
			if (local1093 == 0) {
				@Pc(1128) Class18 local1128 = local593[local900];
				local1128.anInt334 += local1000;
				local1128.anInt332 += local991;
				local1128.anInt331++;
				local1128.anInt333 += local982;
				@Pc(1156) Class18 local1156 = local593[local905];
				local1156.anInt334 += local1000;
				local1156.anInt332 += local991;
				local1156.anInt331++;
				local1156.anInt333 += local982;
				@Pc(1184) Class18 local1184 = local593[local910];
				local1184.anInt332 += local991;
				local1184.anInt334 += local1000;
				local1184.anInt333 += local982;
				local1184.anInt331++;
			} else if (local1093 == 1) {
				@Pc(1113) Class360 local1113 = local889[local676] = new Class360();
				local1113.anInt10174 = local1000;
				local1113.anInt10176 = local991;
				local1113.anInt10175 = local982;
			}
		}
		@Pc(1227) int local1227;
		@Pc(1271) short local1271;
		for (local293 = 0; local293 < this.anInt4622; local293++) {
			local1227 = local127[local293];
			@Pc(1234) int local1234 = arg1.aShortArray76[local1227] & 0xFFFF;
			if (arg1.aByteArray41 == null) {
				local920 = -1;
			} else {
				local920 = arg1.aByteArray41[local1227];
			}
			if (arg1.aByteArray37 == null) {
				local931 = 0;
			} else {
				local931 = arg1.aByteArray37[local1227] & 0xFF;
			}
			local1271 = arg1.aShortArray74 == null ? -1 : arg1.aShortArray74[local1227];
			if (local1271 != -1 && (this.anInt4604 & 0x40) != 0) {
				@Pc(1288) Class233 local1288 = local116.method2863(local1271 & 0xFFFF);
				if (local1288.aBoolean482) {
					local1271 = -1;
				}
			}
			@Pc(1295) float local1295 = 0.0F;
			@Pc(1297) float local1297 = 0.0F;
			@Pc(1299) float local1299 = 0.0F;
			@Pc(1301) float local1301 = 0.0F;
			@Pc(1303) float local1303 = 0.0F;
			@Pc(1305) float local1305 = 0.0F;
			@Pc(1307) byte local1307 = 0;
			@Pc(1309) byte local1309 = 0;
			@Pc(1311) int local1311 = 0;
			@Pc(1348) byte local1348;
			@Pc(1368) short local1368;
			@Pc(1373) short local1373;
			@Pc(1378) short local1378;
			if (local1271 != -1) {
				if (local920 == -1) {
					local1301 = 1.0F;
					local1303 = 0.0F;
					local1305 = 0.0F;
					local1297 = 1.0F;
					local1309 = 2;
					local1307 = 1;
					local1299 = 1.0F;
					local1295 = 0.0F;
				} else {
					local920 &= 0xFF;
					local1348 = arg1.aByteArray43[local920];
					@Pc(1358) short local1358;
					@Pc(1363) short local1363;
					@Pc(1401) float local1401;
					@Pc(1409) float local1409;
					@Pc(1418) float local1418;
					@Pc(1502) float local1502;
					@Pc(1510) float local1510;
					@Pc(1519) float local1519;
					@Pc(1528) float local1528;
					@Pc(1536) float local1536;
					@Pc(1545) float local1545;
					if (local1348 == 0) {
						local1358 = arg1.aShortArray72[local1227];
						local1363 = arg1.aShortArray77[local1227];
						local1368 = arg1.aShortArray69[local1227];
						local1373 = arg1.aShortArray75[local920];
						local1378 = arg1.aShortArray70[local920];
						@Pc(1383) short local1383 = arg1.aShortArray73[local920];
						@Pc(1389) float local1389 = (float) arg1.anIntArray278[local1373];
						@Pc(1395) float local1395 = (float) arg1.anIntArray280[local1373];
						local1401 = (float) arg1.anIntArray281[local1373];
						local1409 = (float) arg1.anIntArray278[local1378] - local1389;
						local1418 = (float) arg1.anIntArray280[local1378] - local1395;
						@Pc(1426) float local1426 = (float) arg1.anIntArray281[local1378] - local1401;
						@Pc(1434) float local1434 = (float) arg1.anIntArray278[local1383] - local1389;
						@Pc(1442) float local1442 = (float) arg1.anIntArray280[local1383] - local1395;
						@Pc(1451) float local1451 = (float) arg1.anIntArray281[local1383] - local1401;
						@Pc(1459) float local1459 = (float) arg1.anIntArray278[local1358] - local1389;
						@Pc(1468) float local1468 = (float) arg1.anIntArray280[local1358] - local1395;
						@Pc(1476) float local1476 = (float) arg1.anIntArray281[local1358] - local1401;
						@Pc(1485) float local1485 = (float) arg1.anIntArray278[local1363] - local1389;
						@Pc(1494) float local1494 = (float) arg1.anIntArray280[local1363] - local1395;
						local1502 = (float) arg1.anIntArray281[local1363] - local1401;
						local1510 = (float) arg1.anIntArray278[local1368] - local1389;
						local1519 = (float) arg1.anIntArray280[local1368] - local1395;
						local1528 = (float) arg1.anIntArray281[local1368] - local1401;
						local1536 = local1418 * local1451 - local1442 * local1426;
						local1545 = local1426 * local1434 - local1451 * local1409;
						@Pc(1553) float local1553 = local1409 * local1442 - local1434 * local1418;
						@Pc(1561) float local1561 = local1442 * local1553 - local1545 * local1451;
						@Pc(1570) float local1570 = local1536 * local1451 - local1434 * local1553;
						@Pc(1578) float local1578 = local1545 * local1434 - local1536 * local1442;
						@Pc(1592) float local1592 = 1.0F / (local1426 * local1578 + local1561 * local1409 + local1570 * local1418);
						local1303 = (local1570 * local1519 + local1510 * local1561 + local1578 * local1528) * local1592;
						local1295 = local1592 * (local1476 * local1578 + local1561 * local1459 + local1570 * local1468);
						local1299 = local1592 * (local1561 * local1485 + local1494 * local1570 + local1578 * local1502);
						@Pc(1642) float local1642 = local1409 * local1545 - local1418 * local1536;
						@Pc(1651) float local1651 = local1418 * local1553 - local1426 * local1545;
						@Pc(1660) float local1660 = local1426 * local1536 - local1553 * local1409;
						@Pc(1674) float local1674 = 1.0F / (local1451 * local1642 + local1442 * local1660 + local1651 * local1434);
						local1301 = (local1485 * local1651 + local1660 * local1494 + local1642 * local1502) * local1674;
						local1305 = (local1660 * local1519 + local1651 * local1510 + local1642 * local1528) * local1674;
						local1297 = local1674 * (local1468 * local1660 + local1459 * local1651 + local1476 * local1642);
					} else {
						local1358 = arg1.aShortArray72[local1227];
						local1363 = arg1.aShortArray77[local1227];
						local1368 = arg1.aShortArray69[local1227];
						@Pc(1738) int local1738 = local885.anIntArray530[local920];
						@Pc(1743) int local1743 = local885.anIntArray532[local920];
						@Pc(1748) int local1748 = local885.anIntArray531[local920];
						@Pc(1753) float[] local1753 = local885.aFloatArrayArray15[local920];
						@Pc(1758) byte local1758 = arg1.aByteArray39[local920];
						local1401 = (float) arg1.anIntArray285[local920] / 256.0F;
						if (local1348 == 1) {
							local1409 = (float) arg1.anIntArray277[local920] / 1024.0F;
							Static650.method2004(arg1.anIntArray280[local1358], local1758, local1401, local1748, local1743, arg1.anIntArray278[local1358], local1409, arg1.anIntArray281[local1358], local1738, local1753, Static647.aFloatArray109);
							local1295 = Static647.aFloatArray109[0];
							local1297 = Static647.aFloatArray109[1];
							Static650.method2004(arg1.anIntArray280[local1363], local1758, local1401, local1748, local1743, arg1.anIntArray278[local1363], local1409, arg1.anIntArray281[local1363], local1738, local1753, Static647.aFloatArray109);
							local1299 = Static647.aFloatArray109[0];
							local1301 = Static647.aFloatArray109[1];
							Static650.method2004(arg1.anIntArray280[local1368], local1758, local1401, local1748, local1743, arg1.anIntArray278[local1368], local1409, arg1.anIntArray281[local1368], local1738, local1753, Static647.aFloatArray109);
							local1305 = Static647.aFloatArray109[1];
							local1303 = Static647.aFloatArray109[0];
							local1418 = local1409 / 2.0F;
							if ((local1758 & 0x1) == 0) {
								if (local1418 < local1299 - local1295) {
									local1307 = 1;
									local1299 -= local1409;
								} else if (local1295 - local1299 > local1418) {
									local1307 = 2;
									local1299 += local1409;
								}
								if (local1418 < local1303 - local1295) {
									local1309 = 1;
									local1303 -= local1409;
								} else if (local1418 < local1295 - local1303) {
									local1303 += local1409;
									local1309 = 2;
								}
							} else {
								if (local1301 - local1297 > local1418) {
									local1307 = 1;
									local1301 -= local1409;
								} else if (local1418 < local1297 - local1301) {
									local1307 = 2;
									local1301 += local1409;
								}
								if (local1305 - local1297 > local1418) {
									local1309 = 1;
									local1305 -= local1409;
								} else if (local1297 - local1305 > local1418) {
									local1309 = 2;
									local1305 += local1409;
								}
							}
						} else if (local1348 == 2) {
							local1409 = (float) arg1.anIntArray282[local920] / 256.0F;
							local1418 = (float) arg1.anIntArray286[local920] / 256.0F;
							@Pc(2037) int local2037 = arg1.anIntArray278[local1363] - arg1.anIntArray278[local1358];
							@Pc(2048) int local2048 = arg1.anIntArray280[local1363] - arg1.anIntArray280[local1358];
							@Pc(2059) int local2059 = arg1.anIntArray281[local1363] - arg1.anIntArray281[local1358];
							@Pc(2070) int local2070 = arg1.anIntArray278[local1368] - arg1.anIntArray278[local1358];
							@Pc(2081) int local2081 = arg1.anIntArray280[local1368] - arg1.anIntArray280[local1358];
							@Pc(2092) int local2092 = arg1.anIntArray281[local1368] - arg1.anIntArray281[local1358];
							@Pc(2101) int local2101 = local2092 * local2048 - local2059 * local2081;
							@Pc(2109) int local2109 = local2070 * local2059 - local2037 * local2092;
							@Pc(2118) int local2118 = local2037 * local2081 - local2048 * local2070;
							local1502 = 64.0F / (float) arg1.anIntArray279[local920];
							local1510 = 64.0F / (float) arg1.anIntArray283[local920];
							local1519 = 64.0F / (float) arg1.anIntArray277[local920];
							local1528 = (local1753[1] * (float) local2109 + (float) local2101 * local1753[0] + local1753[2] * (float) local2118) / local1502;
							local1536 = ((float) local2118 * local1753[5] + (float) local2101 * local1753[3] + (float) local2109 * local1753[4]) / local1510;
							local1545 = ((float) local2109 * local1753[7] + (float) local2101 * local1753[6] + local1753[8] * (float) local2118) / local1519;
							local1311 = Static528.method7605(local1536, local1545, local1528);
							Static513.method7489(local1738, arg1.anIntArray280[local1358], local1758, Static647.aFloatArray109, local1311, local1409, arg1.anIntArray281[local1358], local1401, local1753, local1748, local1743, local1418, arg1.anIntArray278[local1358]);
							local1297 = Static647.aFloatArray109[1];
							local1295 = Static647.aFloatArray109[0];
							Static513.method7489(local1738, arg1.anIntArray280[local1363], local1758, Static647.aFloatArray109, local1311, local1409, arg1.anIntArray281[local1363], local1401, local1753, local1748, local1743, local1418, arg1.anIntArray278[local1363]);
							local1301 = Static647.aFloatArray109[1];
							local1299 = Static647.aFloatArray109[0];
							Static513.method7489(local1738, arg1.anIntArray280[local1368], local1758, Static647.aFloatArray109, local1311, local1409, arg1.anIntArray281[local1368], local1401, local1753, local1748, local1743, local1418, arg1.anIntArray278[local1368]);
							local1305 = Static647.aFloatArray109[1];
							local1303 = Static647.aFloatArray109[0];
						} else if (local1348 == 3) {
							Static464.method6791(local1753, local1738, local1743, Static647.aFloatArray109, arg1.anIntArray281[local1358], local1748, local1401, arg1.anIntArray280[local1358], local1758, arg1.anIntArray278[local1358]);
							local1297 = Static647.aFloatArray109[1];
							local1295 = Static647.aFloatArray109[0];
							Static464.method6791(local1753, local1738, local1743, Static647.aFloatArray109, arg1.anIntArray281[local1363], local1748, local1401, arg1.anIntArray280[local1363], local1758, arg1.anIntArray278[local1363]);
							local1299 = Static647.aFloatArray109[0];
							local1301 = Static647.aFloatArray109[1];
							Static464.method6791(local1753, local1738, local1743, Static647.aFloatArray109, arg1.anIntArray281[local1368], local1748, local1401, arg1.anIntArray280[local1368], local1758, arg1.anIntArray278[local1368]);
							local1305 = Static647.aFloatArray109[1];
							local1303 = Static647.aFloatArray109[0];
							if ((local1758 & 0x1) == 0) {
								if (local1303 - local1295 > 0.5F) {
									local1309 = 1;
									local1303--;
								} else if (local1295 - local1303 > 0.5F) {
									local1309 = 2;
									local1303++;
								}
								if (local1299 - local1295 > 0.5F) {
									local1299--;
									local1307 = 1;
								} else if (local1295 - local1299 > 0.5F) {
									local1307 = 2;
									local1299++;
								}
							} else {
								if (local1301 - local1297 > 0.5F) {
									local1301--;
									local1307 = 1;
								} else if (local1297 - local1301 > 0.5F) {
									local1301++;
									local1307 = 2;
								}
								if (local1305 - local1297 > 0.5F) {
									local1305--;
									local1309 = 1;
								} else if (local1297 - local1305 > 0.5F) {
									local1305++;
									local1309 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray40 == null) {
				local1348 = 0;
			} else {
				local1348 = arg1.aByteArray40[local1227];
			}
			if (local1348 == 0) {
				@Pc(2571) long local2571 = (long) (local920 << 2) + ((long) (local1234 << 8) + (long) (local1311 << 24) + (long) local931 << 32);
				local1368 = arg1.aShortArray72[local1227];
				local1373 = arg1.aShortArray77[local1227];
				local1378 = arg1.aShortArray69[local1227];
				@Pc(2590) Class18 local2590 = local593[local1368];
				this.aShortArray61[local293] = this.method3991(local2590.anInt334, arg1, local2590.anInt332, local2571, local2590.anInt333, local1297, local2590.anInt331, local1295, local1368);
				@Pc(2614) Class18 local2614 = local593[local1373];
				this.aShortArray62[local293] = this.method3991(local2614.anInt334, arg1, local2614.anInt332, (long) local1307 + local2571, local2614.anInt333, local1301, local2614.anInt331, local1299, local1373);
				@Pc(2641) Class18 local2641 = local593[local1378];
				this.aShortArray59[local293] = this.method3991(local2641.anInt334, arg1, local2641.anInt332, (long) local1309 + local2571, local2641.anInt333, local1305, local2641.anInt331, local1303, local1378);
			} else if (local1348 == 1) {
				@Pc(2677) Class360 local2677 = local889[local1227];
				@Pc(2722) long local2722 = (long) ((local2677.anInt10174 + 256 << 22) + (local920 << 2) + (local2677.anInt10175 <= 0 ? 2048 : 1024) + (local2677.anInt10176 + 256 << 12)) + ((long) (local1311 << 24) + (long) (local1234 << 8) + (long) local931 << 32);
				this.aShortArray61[local293] = this.method3991(local2677.anInt10174, arg1, local2677.anInt10176, local2722, local2677.anInt10175, local1297, 0, local1295, arg1.aShortArray72[local1227]);
				this.aShortArray62[local293] = this.method3991(local2677.anInt10174, arg1, local2677.anInt10176, (long) local1307 + local2722, local2677.anInt10175, local1301, 0, local1299, arg1.aShortArray77[local1227]);
				this.aShortArray59[local293] = this.method3991(local2677.anInt10174, arg1, local2677.anInt10176, (long) local1309 + local2722, local2677.anInt10175, local1305, 0, local1303, arg1.aShortArray69[local1227]);
			}
			if (arg1.aByteArray37 != null) {
				this.aByteArray33[local293] = arg1.aByteArray37[local1227];
			}
			if (arg1.aShortArray71 != null) {
				this.aShortArray58[local293] = arg1.aShortArray71[local1227];
			}
			this.aShortArray67[local293] = arg1.aShortArray76[local1227];
			this.aShortArray64[local293] = local1271;
		}
		local1227 = 0;
		local910 = -10000;
		for (local920 = 0; local920 < this.anInt4624; local920++) {
			@Pc(2857) short local2857 = this.aShortArray64[local920];
			if (local910 != local2857) {
				local1227++;
				local910 = local2857;
			}
		}
		this.anIntArray259 = new int[local1227 + 1];
		local1227 = 0;
		local910 = -10000;
		for (local931 = 0; local931 < this.anInt4624; local931++) {
			local1271 = this.aShortArray64[local931];
			if (local910 != local1271) {
				local910 = local1271;
				this.anIntArray259[local1227++] = local931;
			}
		}
		this.anIntArray259[local1227] = this.anInt4624;
		Static237.aLongArray4 = null;
		this.aShortArray68 = Static593.method8589(this.anInt4646, this.aShortArray68);
		this.aShortArray63 = Static593.method8589(this.anInt4646, this.aShortArray63);
		this.aShortArray66 = Static593.method8589(this.anInt4646, this.aShortArray66);
		this.aByteArray34 = Static294.method4359(this.aByteArray34, this.anInt4646);
		this.aFloatArray37 = Static280.method4127(this.aFloatArray37, this.anInt4646);
		this.aFloatArray38 = Static280.method4127(this.aFloatArray38, this.anInt4646);
		if (arg1.anIntArray276 != null && Static9.method107(this.anInt4604, 1, arg2)) {
			this.anIntArrayArray32 = arg1.method4329(false);
		}
		if (arg1.aClass106Array1 != null && Static468.method6846(this.anInt4604, arg2)) {
			this.anIntArrayArray31 = arg1.method4323();
		}
		if (arg1.anIntArray284 != null && Static568.method8182(arg2, this.anInt4604)) {
			local942 = 0;
			@Pc(3032) int[] local3032 = new int[256];
			for (local962 = 0; local962 < this.anInt4622; local962++) {
				local973 = arg1.anIntArray284[local127[local962]];
				if (local973 >= 0) {
					@Pc(3052) int local3052 = local3032[local973]++;
					if (local973 > local942) {
						local942 = local973;
					}
				}
			}
			this.anIntArrayArray33 = new int[local942 + 1][];
			for (local973 = 0; local973 <= local942; local973++) {
				this.anIntArrayArray33[local973] = new int[local3032[local973]];
				local3032[local973] = 0;
			}
			for (local982 = 0; local982 < this.anInt4622; local982++) {
				local991 = arg1.anIntArray284[local127[local982]];
				if (local991 >= 0) {
					this.anIntArrayArray33[local991][local3032[local991]++] = local982;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt4621 = arg0;
		this.lb = true;
		if (this.aClass338_1 != null && (this.anInt4621 & 0x10000) == 0) {
			this.aShortArray68 = this.aClass338_1.aShortArray128;
			this.aShortArray63 = this.aClass338_1.aShortArray129;
			this.aByteArray34 = this.aClass338_1.aByteArray98;
			this.aShortArray66 = this.aClass338_1.aShortArray130;
			this.aClass338_1 = null;
		}
		this.method3992();
	}

	@OriginalMember(owner = "client!jb", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!jb", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4620; local3++) {
			this.anIntArray261[local3] = this.anIntArray261[local3] + 7 >> 4;
			this.anIntArray262[local3] = this.anIntArray262[local3] + 7 >> 4;
			this.anIntArray258[local3] = this.anIntArray258[local3] + 7 >> 4;
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg0 && arg1 > arg4 && arg5 > arg4) {
			return false;
		} else if (arg4 > arg0 && arg4 > arg1 && arg4 > arg5) {
			return false;
		} else if (arg7 < arg6 && arg7 < arg2 && arg3 > arg7) {
			return false;
		} else {
			return arg7 <= arg6 || arg2 >= arg7 || arg7 <= arg3;
		}
	}

	@OriginalMember(owner = "client!jb", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub4 ba(@OriginalArg(0) Class5_Sub5_Sub4 arg0) {
		if (this.anInt4646 == 0) {
			return null;
		}
		if (!this.aBoolean363) {
			this.method3997();
		}
		@Pc(46) int local46;
		@Pc(63) int local63;
		if (this.aClass57_Sub2_16.anInt2769 <= 0) {
			local46 = this.aShort64 - (this.aClass57_Sub2_16.anInt2769 * this.aShort61 >> 8) >> this.aClass57_Sub2_16.anInt2749;
			local63 = this.aShort60 - (this.aClass57_Sub2_16.anInt2769 * this.aShort57 >> 8) >> this.aClass57_Sub2_16.anInt2749;
		} else {
			local46 = this.aShort64 - (this.aClass57_Sub2_16.anInt2769 * this.aShort57 >> 8) >> this.aClass57_Sub2_16.anInt2749;
			local63 = this.aShort60 - (this.aClass57_Sub2_16.anInt2769 * this.aShort61 >> 8) >> this.aClass57_Sub2_16.anInt2749;
		}
		@Pc(118) int local118;
		@Pc(134) int local134;
		if (this.aClass57_Sub2_16.anInt2793 <= 0) {
			local118 = this.aShort58 - (this.aShort61 * this.aClass57_Sub2_16.anInt2793 >> 8) >> this.aClass57_Sub2_16.anInt2749;
			local134 = this.aShort63 - (this.aClass57_Sub2_16.anInt2793 * this.aShort57 >> 8) >> this.aClass57_Sub2_16.anInt2749;
		} else {
			local118 = this.aShort58 - (this.aClass57_Sub2_16.anInt2793 * this.aShort57 >> 8) >> this.aClass57_Sub2_16.anInt2749;
			local134 = this.aShort63 - (this.aClass57_Sub2_16.anInt2793 * this.aShort61 >> 8) >> this.aClass57_Sub2_16.anInt2749;
		}
		@Pc(177) int local177 = local63 + 1 - local46;
		@Pc(184) int local184 = local134 + 1 - local118;
		@Pc(187) Class5_Sub5_Sub4_Sub1 local187 = (Class5_Sub5_Sub4_Sub1) arg0;
		@Pc(205) Class5_Sub5_Sub4_Sub1 local205;
		if (local187 != null && local187.method2487(local177, local184)) {
			local205 = local187;
			local187.method2485();
		} else {
			local205 = new Class5_Sub5_Sub4_Sub1(this.aClass57_Sub2_16, local177, local184);
		}
		local205.method2482(local134, local46, local63, local118);
		this.method3998(local205);
		return local205;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ISBII)I")
	private int method3989(@OriginalArg(1) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static560.anIntArray534[Static323.method4943(arg3, arg2)];
		if (arg0 != -1) {
			@Pc(25) Class233 local25 = this.aClass57_Sub2_16.anInterface1_11.method2863(arg0 & 0xFFFF);
			@Pc(30) int local30 = local25.aByte97 & 0xFF;
			@Pc(47) int local47;
			@Pc(71) int local71;
			if (local30 != 0) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local30 == 256) {
					local12 = local47;
				} else {
					local71 = 256 - local30;
					local12 = (local71 * (local12 & 0xFF00FF) + (local47 & 0xFF00FF) * local30 & 0xFF00FF00) + ((local12 & 0xFF00) * local71 + local30 * (local47 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local47 = local25.aByte98 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(118) int local118 = (local12 >> 16 & 0xFF) * local47;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local71 = local47 * (local12 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(142) int local142 = local47 * (local12 & 0xFF);
				if (local142 > 65535) {
					local142 = 65535;
				}
				local12 = ((local118 & 0x7700FF00) << 8) - (-(local71 & 0xFF00) - (local142 >> 8));
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!jb", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V")
	private void method3990(@OriginalArg(1) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass356_7 != null && this.aClass356_7.anInterface15_7 == null;
		@Pc(33) boolean local33 = this.aClass356_8 != null && this.aClass356_8.anInterface15_7 == null;
		@Pc(47) boolean local47 = this.aClass356_10 != null && this.aClass356_10.anInterface15_7 == null;
		@Pc(61) boolean local61 = this.aClass356_9 != null && this.aClass356_9.anInterface15_7 == null;
		if (arg0) {
			local19 &= (this.aByte67 & 0x2) != 0;
			local47 &= (this.aByte67 & 0x1) != 0;
			local61 &= (this.aByte67 & 0x8) != 0;
			local33 &= (this.aByte67 & 0x4) != 0;
		}
		@Pc(115) byte local115 = 0;
		@Pc(119) byte local119 = 0;
		@Pc(121) byte local121 = 0;
		if (local47) {
			local115 = 12;
		}
		@Pc(132) byte local132 = 0;
		if (local19) {
			local119 = local115;
			local115 = (byte) (local115 + 4);
		}
		if (local33) {
			local121 = local115;
			local115 = (byte) (local115 + 12);
		}
		if (local61) {
			local132 = local115;
			local115 = (byte) (local115 + 8);
		}
		if (local115 == 0) {
			return;
		}
		if (this.anInt4646 * local115 > this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1.aByteArray102.length) {
			this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1((this.anInt4646 + 100) * local115);
		} else {
			this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1.anInt9869 = 0;
		}
		@Pc(210) Class5_Sub23_Sub1 local210 = this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1;
		@Pc(220) int local220;
		@Pc(229) int local229;
		@Pc(257) int local257;
		@Pc(266) int local266;
		if (local47) {
			@Pc(236) int local236;
			@Pc(243) int local243;
			@Pc(248) int local248;
			@Pc(255) int local255;
			if (this.aClass57_Sub2_16.aBoolean216) {
				for (local220 = 0; local220 < this.anInt4598; local220++) {
					local229 = Stream.floatToRawIntBits((float) this.anIntArray261[local220]);
					local236 = Stream.floatToRawIntBits((float) this.anIntArray262[local220]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray258[local220]);
					local248 = this.anIntArray260[local220];
					local255 = this.anIntArray260[local220 + 1];
					for (local257 = local248; local257 < local255; local257++) {
						local266 = this.aShortArray60[local257] - 1;
						if (local266 == -1) {
							break;
						}
						local210.anInt9869 = local266 * local115;
						local210.method8486(local229);
						local210.method8486(local236);
						local210.method8486(local243);
					}
				}
			} else {
				for (local220 = 0; local220 < this.anInt4598; local220++) {
					local229 = Stream.floatToRawIntBits((float) this.anIntArray261[local220]);
					local236 = Stream.floatToRawIntBits((float) this.anIntArray262[local220]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray258[local220]);
					local248 = this.anIntArray260[local220];
					local255 = this.anIntArray260[local220 + 1];
					for (local257 = local248; local257 < local255; local257++) {
						local266 = this.aShortArray60[local257] - 1;
						if (local266 == -1) {
							break;
						}
						local210.anInt9869 = local266 * local115;
						local210.method8526(local229);
						local210.method8526(local236);
						local210.method8526(local243);
					}
				}
			}
		}
		@Pc(528) float local528;
		@Pc(424) short[] local424;
		@Pc(421) short[] local421;
		@Pc(430) short[] local430;
		@Pc(427) byte[] local427;
		@Pc(581) float local581;
		if (local19) {
			if (this.aClass356_8 == null) {
				if (this.aClass338_1 == null) {
					local421 = this.aShortArray63;
					local424 = this.aShortArray68;
					local427 = this.aByteArray34;
					local430 = this.aShortArray66;
				} else {
					local427 = this.aClass338_1.aByteArray98;
					local430 = this.aClass338_1.aShortArray130;
					local421 = this.aClass338_1.aShortArray129;
					local424 = this.aClass338_1.aShortArray128;
				}
				@Pc(454) float local454 = this.aClass57_Sub2_16.lb[0];
				@Pc(460) float local460 = this.aClass57_Sub2_16.lb[1];
				@Pc(466) float local466 = this.aClass57_Sub2_16.lb[2];
				@Pc(470) float local470 = this.aClass57_Sub2_16.aFloat43;
				@Pc(480) float local480 = this.aClass57_Sub2_16.aFloat42 * 768.0F / (float) this.aShort66;
				@Pc(490) float local490 = this.aClass57_Sub2_16.aFloat36 * 768.0F / (float) this.aShort66;
				for (@Pc(492) int local492 = 0; local492 < this.anInt4622; local492++) {
					@Pc(512) int local512 = this.method3989(this.aShortArray64[local492], this.aByteArray33[local492], this.aShortArray67[local492], this.aShort62);
					@Pc(517) short local517 = this.aShortArray61[local492];
					local528 = this.aClass57_Sub2_16.aFloat40 * (float) (local512 >> 16 & 0xFF);
					@Pc(539) float local539 = (float) (local512 >> 8 & 0xFF) * this.aClass57_Sub2_16.aFloat48;
					@Pc(548) float local548 = (float) (local512 >>> 24) * this.aClass57_Sub2_16.aFloat38;
					@Pc(553) short local553 = (short) local427[local517];
					if (local553 == 0) {
						local581 = ((float) local430[local517] * local466 + (float) local421[local517] * local460 + local454 * (float) local424[local517]) * 0.0026041667F;
					} else {
						local581 = (local466 * (float) local430[local517] + local454 * (float) local424[local517] + (float) local421[local517] * local460) / (float) (local553 * 256);
					}
					@Pc(619) float local619 = local470 + local581 * (local581 < 0.0F ? local490 : local480);
					@Pc(624) int local624 = (int) (local548 * local619);
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					@Pc(647) int local647 = (int) (local528 * local619);
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					@Pc(670) int local670 = (int) (local619 * local539);
					local210.anInt9869 = local119 + local115 * local517;
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					local210.method8502(local624);
					local210.method8502(local647);
					local210.method8502(local670);
					local210.method8502(255 - (this.aByteArray33[local492] & 0xFF));
					local517 = this.aShortArray62[local492];
					local553 = (short) local427[local517];
					if (local553 == 0) {
						local581 = ((float) local430[local517] * local466 + local460 * (float) local421[local517] + (float) local424[local517] * local454) * 0.0026041667F;
					} else {
						local581 = ((float) local430[local517] * local466 + local460 * (float) local421[local517] + (float) local424[local517] * local454) / (float) (local553 * 256);
					}
					local619 = local470 + (local581 < 0.0F ? local490 : local480) * local581;
					local624 = (int) (local619 * local548);
					local647 = (int) (local528 * local619);
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					local670 = (int) (local619 * local539);
					local210.anInt9869 = local119 + local517 * local115;
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					local210.method8502(local624);
					local210.method8502(local647);
					local210.method8502(local670);
					local210.method8502(255 - (this.aByteArray33[local492] & 0xFF));
					local517 = this.aShortArray59[local492];
					local553 = (short) local427[local517];
					if (local553 == 0) {
						local581 = ((float) local430[local517] * local466 + (float) local424[local517] * local454 + (float) local421[local517] * local460) * 0.0026041667F;
					} else {
						local581 = ((float) local421[local517] * local460 + (float) local424[local517] * local454 + (float) local430[local517] * local466) / (float) (local553 * 256);
					}
					local619 = local470 + (local581 < 0.0F ? local490 : local480) * local581;
					local624 = (int) (local619 * local548);
					if (local624 < 0) {
						local624 = 0;
					} else if (local624 > 255) {
						local624 = 255;
					}
					local647 = (int) (local528 * local619);
					local670 = (int) (local539 * local619);
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					local210.anInt9869 = local517 * local115 + local119;
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					local210.method8502(local624);
					local210.method8502(local647);
					local210.method8502(local670);
					local210.method8502(255 - (this.aByteArray33[local492] & 0xFF));
				}
			} else {
				for (local220 = 0; local220 < this.anInt4622; local220++) {
					local229 = this.method3989(this.aShortArray64[local220], this.aByteArray33[local220], this.aShortArray67[local220], this.aShort62);
					local210.anInt9869 = local115 * this.aShortArray61[local220] + local119;
					local210.method8486(local229);
					local210.anInt9869 = local115 * this.aShortArray62[local220] + local119;
					local210.method8486(local229);
					local210.anInt9869 = this.aShortArray59[local220] * local115 + local119;
					local210.method8486(local229);
				}
			}
		}
		if (local33) {
			if (this.aClass338_1 == null) {
				local424 = this.aShortArray68;
				local427 = this.aByteArray34;
				local430 = this.aShortArray66;
				local421 = this.aShortArray63;
			} else {
				local427 = this.aClass338_1.aByteArray98;
				local430 = this.aClass338_1.aShortArray130;
				local421 = this.aClass338_1.aShortArray129;
				local424 = this.aClass338_1.aShortArray128;
			}
			@Pc(1187) float local1187 = 3.0F / (float) this.aShort66;
			local210.anInt9869 = local121;
			local581 = 3.0F / (float) (this.aShort66 + this.aShort66 / 2);
			if (this.aClass57_Sub2_16.aBoolean216) {
				for (local257 = 0; local257 < this.anInt4646; local257++) {
					local266 = local427[local257] & 0xFF;
					if (local266 == 0) {
						local210.method4302((float) local424[local257] * local581);
						local210.method4302(local581 * (float) local421[local257]);
						local210.method4302(local581 * (float) local430[local257]);
					} else {
						local528 = local1187 / (float) local266;
						local210.method4302((float) local424[local257] * local528);
						local210.method4302(local528 * (float) local421[local257]);
						local210.method4302(local528 * (float) local430[local257]);
					}
					local210.anInt9869 += local115 - 12;
				}
			} else {
				for (local257 = 0; local257 < this.anInt4646; local257++) {
					local266 = local427[local257] & 0xFF;
					if (local266 == 0) {
						local210.method4304(local581 * (float) local424[local257]);
						local210.method4304(local581 * (float) local421[local257]);
						local210.method4304(local581 * (float) local430[local257]);
					} else {
						local528 = local1187 / (float) local266;
						local210.method4304(local528 * (float) local424[local257]);
						local210.method4304(local528 * (float) local421[local257]);
						local210.method4304(local528 * (float) local430[local257]);
					}
					local210.anInt9869 += local115 - 12;
				}
			}
		}
		if (local61) {
			local210.anInt9869 = local132;
			if (this.aClass57_Sub2_16.aBoolean216) {
				for (local220 = 0; local220 < this.anInt4646; local220++) {
					local210.method4302(this.aFloatArray37[local220]);
					local210.method4302(this.aFloatArray38[local220]);
					local210.anInt9869 += local115 - 8;
				}
			} else {
				for (local220 = 0; local220 < this.anInt4646; local220++) {
					local210.method4304(this.aFloatArray37[local220]);
					local210.method4304(this.aFloatArray38[local220]);
					local210.anInt9869 += local115 - 8;
				}
			}
		}
		local210.anInt9869 = this.anInt4646 * local115;
		@Pc(1503) Interface15 local1503;
		if (arg0) {
			if (this.anInterface15_4 == null) {
				this.anInterface15_4 = this.aClass57_Sub2_16.method2311(local210.anInt9869, true, local115, local210.aByteArray102);
			} else {
				this.anInterface15_4.method3618(local115, local210.aByteArray102, local210.anInt9869);
			}
			local1503 = this.anInterface15_4;
			this.aByte67 = 0;
		} else {
			local1503 = this.aClass57_Sub2_16.method2311(local210.anInt9869, false, local115, local210.aByteArray102);
			this.lb = true;
		}
		if (local47) {
			this.aClass356_10.anInterface15_7 = local1503;
			this.aClass356_10.aByte143 = 0;
		}
		if (local61) {
			this.aClass356_9.aByte143 = local132;
			this.aClass356_9.anInterface15_7 = local1503;
		}
		if (local19) {
			this.aClass356_7.aByte143 = local119;
			this.aClass356_7.anInterface15_7 = local1503;
		}
		if (local33) {
			this.aClass356_8.aByte143 = local121;
			this.aClass356_8.anInterface15_7 = local1503;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ju;IJIFIBFI)S")
	private short method3991(@OriginalArg(0) int arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray260[arg8];
		@Pc(17) int local17 = this.anIntArray260[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray60[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (Static237.aLongArray4[local21] == arg3) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray60[local19] = (short) (this.anInt4646 + 1);
		Static237.aLongArray4[local19] = arg3;
		this.aShortArray68[this.anInt4646] = (short) arg4;
		if (124 != 124) {
			return 102;
		}
		this.aShortArray63[this.anInt4646] = (short) arg2;
		this.aShortArray66[this.anInt4646] = (short) arg0;
		this.aByteArray34[this.anInt4646] = (byte) arg6;
		this.aFloatArray37[this.anInt4646] = arg7;
		this.aFloatArray38[this.anInt4646] = arg5;
		return (short) this.anInt4646++;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	private void method3992() {
		if (!this.lb) {
			return;
		}
		this.lb = false;
		if (this.aClass189Array3 == null && this.aClass161Array3 == null && this.aClass329Array1 == null && !Static68.method1104(this.anInt4604, this.anInt4621)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			if (this.anIntArray261 != null && !Static256.method3785(this.anInt4621, this.anInt4604)) {
				if (this.aClass356_10 != null && this.aClass356_10.anInterface15_7 == null) {
					this.lb = true;
				} else {
					local37 = true;
					if (!this.aBoolean363) {
						this.method3997();
					}
				}
			}
			@Pc(81) boolean local81 = false;
			if (this.anIntArray262 != null && !Static668.method9192(this.anInt4621, this.anInt4604)) {
				if (this.aClass356_10 != null && this.aClass356_10.anInterface15_7 == null) {
					this.lb = true;
				} else {
					local39 = true;
					if (!this.aBoolean363) {
						this.method3997();
					}
				}
			}
			if (this.anIntArray258 != null && !Static242.method3550(this.anInt4604, this.anInt4621)) {
				if (this.aClass356_10 != null && this.aClass356_10.anInterface15_7 == null) {
					this.lb = true;
				} else {
					if (!this.aBoolean363) {
						this.method3997();
					}
					local81 = true;
				}
			}
			if (local37) {
				this.anIntArray261 = null;
			}
			if (local81) {
				this.anIntArray258 = null;
			}
			if (local39) {
				this.anIntArray262 = null;
			}
		}
		if (this.aShortArray60 != null && this.anIntArray261 == null && this.anIntArray262 == null && this.anIntArray258 == null) {
			this.anIntArray260 = null;
			this.aShortArray60 = null;
		}
		if (this.aByteArray34 != null && !Static544.method7954(this.anInt4621, this.anInt4604)) {
			if (this.aClass356_8 == null) {
				if (this.aClass356_7 != null && this.aClass356_7.anInterface15_7 == null) {
					this.lb = true;
				} else {
					this.aByteArray34 = null;
					this.aShortArray68 = this.aShortArray63 = this.aShortArray66 = null;
				}
			} else if (this.aClass356_8.anInterface15_7 == null) {
				this.lb = true;
			} else {
				this.aShortArray68 = this.aShortArray63 = this.aShortArray66 = null;
				this.aByteArray34 = null;
			}
		}
		if (this.aShortArray67 != null && !Static264.method3873(this.anInt4604, this.anInt4621)) {
			if (this.aClass356_7 != null && this.aClass356_7.anInterface15_7 == null) {
				this.lb = true;
			} else {
				this.aShortArray67 = null;
			}
		}
		if (this.aByteArray33 != null && !Static637.method8918(this.anInt4621, this.anInt4604)) {
			if (this.aClass356_7 != null && this.aClass356_7.anInterface15_7 == null) {
				this.lb = true;
			} else {
				this.aByteArray33 = null;
			}
		}
		if (this.aFloatArray37 != null && !Static281.method4140(this.anInt4621, this.anInt4604)) {
			if (this.aClass356_9 != null && this.aClass356_9.anInterface15_7 == null) {
				this.lb = true;
			} else {
				this.aFloatArray37 = this.aFloatArray38 = null;
			}
		}
		if (this.aShortArray64 != null && !Static282.method4150(this.anInt4621, this.anInt4604)) {
			if (this.aClass356_7 != null && this.aClass356_7.anInterface15_7 == null) {
				this.lb = true;
			} else {
				this.aShortArray64 = null;
			}
		}
		if (this.aShortArray61 != null && !Static121.method1707(this.anInt4604, this.anInt4621)) {
			if ((this.aClass116_1 == null || this.aClass116_1.anInterface21_2 != null) && (this.aClass356_7 == null || this.aClass356_7.anInterface15_7 != null)) {
				this.aShortArray61 = this.aShortArray62 = this.aShortArray59 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.anIntArrayArray33 != null && !Static568.method8182(this.anInt4621, this.anInt4604)) {
			this.aShortArray58 = null;
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArrayArray32 != null && !Static9.method107(this.anInt4604, 1, this.anInt4621)) {
			this.anIntArrayArray32 = null;
			this.aShortArray65 = null;
		}
		if (this.anIntArrayArray31 != null && !Static468.method6846(this.anInt4604, this.anInt4621)) {
			this.anIntArrayArray31 = null;
		}
		if (this.anIntArray259 != null && (this.anInt4621 & 0x800) == 0 && (this.anInt4621 & 0x40000) == 0) {
			this.anIntArray259 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4622; local7++) {
			if (arg0 == this.aShortArray67[local7]) {
				this.aShortArray67[local7] = arg1;
			}
		}
		if (this.aClass329Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt4609; local38++) {
				@Pc(45) Class329 local45 = this.aClass329Array1[local38];
				@Pc(50) Class235 local50 = this.aClass235Array1[local38];
				local50.anInt6348 = Static560.anIntArray534[this.aShortArray67[local45.anInt9371] & 0xFFFF] & 0xFFFFFF | local50.anInt6348 & 0xFF000000;
			}
		}
		if (this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qq;Lclient!ng;II)V")
	@Override
	public void method9092(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4646 == 0) {
			return;
		}
		@Pc(17) Class203_Sub2 local17 = this.aClass57_Sub2_16.aClass203_Sub2_3;
		if (!this.aBoolean363) {
			this.method3997();
		}
		@Pc(28) Class203_Sub2 local28 = (Class203_Sub2) arg0;
		Static246.aFloat57 = local28.aFloat129 * local17.aFloat130 + local17.aFloat125 * local28.aFloat126 + local28.aFloat131 * local17.aFloat122 + local17.aFloat131;
		Static453.aFloat137 = local28.aFloat130 * local17.aFloat122 + local28.aFloat124 * local17.aFloat125 + local17.aFloat130 * local28.aFloat127;
		@Pc(75) float local75 = (float) this.aShort61 * Static453.aFloat137 + Static246.aFloat57;
		@Pc(83) float local83 = Static453.aFloat137 * (float) this.aShort57 + Static246.aFloat57;
		@Pc(99) float local99;
		@Pc(93) float local93;
		if (local83 < local75) {
			local93 = (float) this.aShort59 + local75;
			local99 = local83 - (float) this.aShort59;
		} else {
			local93 = local83 + (float) this.aShort59;
			local99 = local75 - (float) this.aShort59;
		}
		if (local99 >= this.aClass57_Sub2_16.aFloat39 || (float) this.aClass57_Sub2_16.anInt2782 >= local93) {
			return;
		}
		Static354.aFloat115 = local28.aFloat131 * local17.aFloat128 + local17.aFloat124 * local28.aFloat129 + local28.aFloat126 * local17.aFloat120 + local17.aFloat126;
		Static144.aFloat19 = local17.aFloat128 * local28.aFloat130 + local17.aFloat124 * local28.aFloat127 + local17.aFloat120 * local28.aFloat124;
		@Pc(177) float local177 = Static144.aFloat19 * (float) this.aShort61 + Static354.aFloat115;
		@Pc(185) float local185 = Static354.aFloat115 + (float) this.aShort57 * Static144.aFloat19;
		@Pc(200) float local200;
		@Pc(211) float local211;
		if (local177 > local185) {
			local200 = (float) this.aClass57_Sub2_16.anInt2776 * (local185 - (float) this.aShort59);
			local211 = (local177 + (float) this.aShort59) * (float) this.aClass57_Sub2_16.anInt2776;
		} else {
			local200 = (local177 - (float) this.aShort59) * (float) this.aClass57_Sub2_16.anInt2776;
			local211 = (float) this.aClass57_Sub2_16.anInt2776 * ((float) this.aShort59 + local185);
		}
		if (local200 / (float) arg2 >= this.aClass57_Sub2_16.aFloat34 || this.aClass57_Sub2_16.aFloat50 >= local211 / (float) arg2) {
			return;
		}
		Static85.aFloat11 = local17.aFloat121 * local28.aFloat131 + local28.aFloat126 * local17.aFloat123 + local28.aFloat129 * local17.aFloat127 + local17.aFloat129;
		Static127.aFloat14 = local17.aFloat121 * local28.aFloat130 + local28.aFloat124 * local17.aFloat123 + local17.aFloat127 * local28.aFloat127;
		@Pc(304) float local304 = (float) this.aShort61 * Static127.aFloat14 + Static85.aFloat11;
		@Pc(312) float local312 = Static85.aFloat11 + Static127.aFloat14 * (float) this.aShort57;
		@Pc(339) float local339;
		@Pc(327) float local327;
		if (local304 > local312) {
			local327 = (float) this.aClass57_Sub2_16.anInt2778 * (local304 + (float) this.aShort59);
			local339 = ((float) -this.aShort59 + local312) * (float) this.aClass57_Sub2_16.anInt2778;
		} else {
			local327 = (float) this.aClass57_Sub2_16.anInt2778 * ((float) this.aShort59 + local312);
			local339 = (float) this.aClass57_Sub2_16.anInt2778 * ((float) -this.aShort59 + local304);
		}
		if (this.aClass57_Sub2_16.aFloat44 <= local339 / (float) arg2 || local327 / (float) arg2 <= this.aClass57_Sub2_16.aFloat35) {
			return;
		}
		if (arg1 != null || this.aClass329Array1 != null) {
			Static375.aFloat116 = local17.aFloat128 * local28.aFloat125 + local17.aFloat124 * local28.aFloat123 + local17.aFloat120 * local28.aFloat120;
			Static330.aFloat100 = local17.aFloat123 * local28.aFloat120 + local17.aFloat127 * local28.aFloat123 + local17.aFloat121 * local28.aFloat125;
			Static282.aFloat65 = local28.aFloat121 * local17.aFloat130 + local17.aFloat125 * local28.aFloat128 + local28.aFloat122 * local17.aFloat122;
			Static302.aFloat84 = local28.aFloat125 * local17.aFloat122 + local28.aFloat123 * local17.aFloat130 + local28.aFloat120 * local17.aFloat125;
			Static575.aFloat186 = local28.aFloat121 * local17.aFloat124 + local17.aFloat120 * local28.aFloat128 + local17.aFloat128 * local28.aFloat122;
			Static403.aFloat119 = local28.aFloat122 * local17.aFloat121 + local17.aFloat123 * local28.aFloat128 + local17.aFloat127 * local28.aFloat121;
		}
		if (arg1 != null) {
			@Pc(513) int local513 = this.aShort60 + this.aShort64 >> 1;
			@Pc(521) int local521 = this.aShort63 + this.aShort58 >> 1;
			@Pc(540) int local540 = (int) ((float) local521 * Static575.aFloat186 + (float) this.aShort61 * Static144.aFloat19 + Static354.aFloat115 + Static375.aFloat116 * (float) local513);
			@Pc(559) int local559 = (int) ((float) local513 * Static330.aFloat100 + Static85.aFloat11 + (float) this.aShort61 * Static127.aFloat14 + (float) local521 * Static403.aFloat119);
			@Pc(578) int local578 = (int) ((float) local521 * Static282.aFloat65 + Static246.aFloat57 + Static302.aFloat84 * (float) local513 + (float) this.aShort61 * Static453.aFloat137);
			@Pc(597) int local597 = (int) ((float) local521 * Static575.aFloat186 + (float) this.aShort57 * Static144.aFloat19 + Static375.aFloat116 * (float) local513 + Static354.aFloat115);
			@Pc(616) int local616 = (int) ((float) local521 * Static403.aFloat119 + Static85.aFloat11 + (float) local513 * Static330.aFloat100 + (float) this.aShort57 * Static127.aFloat14);
			arg1.anInt6701 = this.aClass57_Sub2_16.anInt2776 * local597 / arg2 + this.aClass57_Sub2_16.anInt2780;
			arg1.anInt6698 = this.aClass57_Sub2_16.anInt2779 + local559 * this.aClass57_Sub2_16.anInt2778 / arg2;
			@Pc(661) int local661 = (int) ((float) local521 * Static282.aFloat65 + (float) this.aShort57 * Static453.aFloat137 + Static302.aFloat84 * (float) local513 + Static246.aFloat57);
			arg1.anInt6702 = this.aClass57_Sub2_16.anInt2779 + local616 * this.aClass57_Sub2_16.anInt2778 / arg2;
			arg1.anInt6699 = this.aClass57_Sub2_16.anInt2780 + this.aClass57_Sub2_16.anInt2776 * local540 / arg2;
			if (this.aClass57_Sub2_16.anInt2782 <= local578 || local661 >= this.aClass57_Sub2_16.anInt2782) {
				arg1.anInt6700 = (this.aShort59 + local540) * this.aClass57_Sub2_16.anInt2776 / arg2 + this.aClass57_Sub2_16.anInt2780 - arg1.anInt6699;
				arg1.aBoolean519 = true;
			}
		}
		this.aClass57_Sub2_16.method2383((float) arg2);
		this.aClass57_Sub2_16.method2326();
		this.aClass57_Sub2_16.method2318(local28);
		this.method4002();
		this.aClass57_Sub2_16.method2360();
		this.method3999();
	}

	@OriginalMember(owner = "client!jb", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4598; local3++) {
			if (arg0 != 128) {
				this.anIntArray261[local3] = arg0 * this.anIntArray261[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray262[local3] = arg1 * this.anIntArray262[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray258[local3] = this.anIntArray258[local3] * arg2 >> 7;
			}
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4622; local7++) {
			local16 = this.aShortArray67[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray67[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass329Array1 != null) {
			for (local16 = 0; local16 < this.anInt4609; local16++) {
				@Pc(111) Class329 local111 = this.aClass329Array1[local16];
				@Pc(116) Class235 local116 = this.aClass235Array1[local16];
				local116.anInt6348 = local116.anInt6348 & 0xFF000000 | Static560.anIntArray534[this.aShortArray67[local111.anInt9371] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()[Lclient!jk;")
	@Override
	public Class189[] method9081() {
		return this.aClass189Array3;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIIILclient!qq;II)Z")
	private boolean method3993(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class203 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class203_Sub2 local8 = (Class203_Sub2) arg3;
		@Pc(12) Class203_Sub2 local12 = this.aClass57_Sub2_16.aClass203_Sub2_3;
		@Pc(33) float local33 = local8.aFloat131 * local12.aFloat128 + local12.aFloat120 * local8.aFloat126 + local12.aFloat124 * local8.aFloat129 + local12.aFloat126;
		@Pc(54) float local54 = local12.aFloat129 + local8.aFloat129 * local12.aFloat127 + local12.aFloat123 * local8.aFloat126 + local12.aFloat121 * local8.aFloat131;
		Static144.aFloat19 = local8.aFloat130 * local12.aFloat128 + local8.aFloat124 * local12.aFloat120 + local8.aFloat127 * local12.aFloat124;
		Static453.aFloat137 = local12.aFloat125 * local8.aFloat124 + local8.aFloat127 * local12.aFloat130 + local8.aFloat130 * local12.aFloat122;
		@Pc(117) float local117 = local12.aFloat131 + local8.aFloat131 * local12.aFloat122 + local12.aFloat130 * local8.aFloat129 + local12.aFloat125 * local8.aFloat126;
		Static403.aFloat119 = local12.aFloat127 * local8.aFloat121 + local12.aFloat123 * local8.aFloat128 + local12.aFloat121 * local8.aFloat122;
		Static330.aFloat100 = local12.aFloat127 * local8.aFloat123 + local12.aFloat123 * local8.aFloat120 + local12.aFloat121 * local8.aFloat125;
		Static575.aFloat186 = local12.aFloat128 * local8.aFloat122 + local12.aFloat124 * local8.aFloat121 + local12.aFloat120 * local8.aFloat128;
		Static302.aFloat84 = local8.aFloat125 * local12.aFloat122 + local12.aFloat125 * local8.aFloat120 + local12.aFloat130 * local8.aFloat123;
		Static127.aFloat14 = local12.aFloat121 * local8.aFloat130 + local8.aFloat124 * local12.aFloat123 + local8.aFloat127 * local12.aFloat127;
		Static282.aFloat65 = local8.aFloat122 * local12.aFloat122 + local12.aFloat125 * local8.aFloat128 + local8.aFloat121 * local12.aFloat130;
		Static375.aFloat116 = local8.aFloat123 * local12.aFloat124 + local12.aFloat120 * local8.aFloat120 + local8.aFloat125 * local12.aFloat128;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass57_Sub2_16.anInt2776;
		@Pc(261) int local261 = this.aClass57_Sub2_16.anInt2778;
		if (!this.aBoolean363) {
			this.method3997();
		}
		@Pc(278) int local278 = this.aShort60 - this.aShort64 >> 1;
		@Pc(287) int local287 = this.aShort57 - this.aShort61 >> 1;
		@Pc(296) int local296 = this.aShort63 - this.aShort58 >> 1;
		@Pc(301) int local301 = this.aShort64 + local278;
		@Pc(306) int local306 = local287 + this.aShort61;
		@Pc(311) int local311 = local296 + this.aShort58;
		@Pc(317) int local317 = local301 - (local278 << arg4);
		@Pc(324) int local324 = local306 - (local287 << arg4);
		@Pc(331) int local331 = local311 - (local296 << arg4);
		@Pc(337) int local337 = local301 + (local278 << arg4);
		@Pc(343) int local343 = (local287 << arg4) + local306;
		@Pc(350) int local350 = local311 + (local296 << arg4);
		Static523.anIntArray510[0] = local317;
		Static212.anIntArray200[0] = local324;
		Static523.anIntArray510[1] = local337;
		Static8.anIntArray8[0] = local331;
		Static212.anIntArray200[1] = local324;
		Static8.anIntArray8[1] = local331;
		Static523.anIntArray510[2] = local317;
		Static212.anIntArray200[2] = local343;
		Static8.anIntArray8[2] = local331;
		Static523.anIntArray510[3] = local337;
		Static212.anIntArray200[3] = local343;
		Static523.anIntArray510[4] = local317;
		Static8.anIntArray8[3] = local331;
		Static212.anIntArray200[4] = local324;
		Static523.anIntArray510[5] = local337;
		Static8.anIntArray8[4] = local350;
		Static212.anIntArray200[5] = local324;
		Static523.anIntArray510[6] = local317;
		Static8.anIntArray8[5] = local350;
		Static212.anIntArray200[6] = local343;
		Static523.anIntArray510[7] = local337;
		Static8.anIntArray8[6] = local350;
		Static212.anIntArray200[7] = local343;
		Static8.anIntArray8[7] = local350;
		@Pc(481) float local481;
		@Pc(495) float local495;
		@Pc(509) float local509;
		@Pc(467) float local467;
		@Pc(462) float local462;
		@Pc(457) float local457;
		for (@Pc(448) int local448 = 0; local448 < 8; local448++) {
			local457 = (float) Static8.anIntArray8[local448];
			local462 = (float) Static212.anIntArray200[local448];
			local467 = (float) Static523.anIntArray510[local448];
			local481 = local33 + Static375.aFloat116 * local467 + local462 * Static144.aFloat19 + local457 * Static575.aFloat186;
			local495 = local54 + local462 * Static127.aFloat14 + local467 * Static330.aFloat100 + Static403.aFloat119 * local457;
			local509 = local457 * Static282.aFloat65 + Static302.aFloat84 * local467 + local462 * Static453.aFloat137 + local117;
			if (local509 >= (float) this.aClass57_Sub2_16.anInt2782) {
				if (arg1 > 0) {
					local509 = (float) arg1;
				}
				@Pc(538) float local538 = (float) this.aClass57_Sub2_16.anInt2780 + local481 * (float) local257 / local509;
				@Pc(550) float local550 = (float) this.aClass57_Sub2_16.anInt2779 + local495 * (float) local261 / local509;
				if (local249 < local538) {
					local249 = local538;
				}
				if (local538 < local247) {
					local247 = local538;
				}
				if (local251 > local550) {
					local251 = local550;
				}
				local245 = true;
				if (local550 > local253) {
					local253 = local550;
				}
			}
		}
		if (local245 && local247 < (float) arg5 && local249 > (float) arg5 && local251 < (float) arg2 && (float) arg2 < local253) {
			if (arg0) {
				return true;
			}
			if (this.anInt4646 > this.aClass57_Sub2_16.anIntArray145.length) {
				this.aClass57_Sub2_16.anIntArray145 = new int[this.anInt4646];
				this.aClass57_Sub2_16.anIntArray146 = new int[this.anInt4646];
			}
			@Pc(652) int[] local652 = this.aClass57_Sub2_16.anIntArray145;
			@Pc(656) int[] local656 = this.aClass57_Sub2_16.anIntArray146;
			@Pc(752) int local752;
			for (@Pc(658) int local658 = 0; local658 < this.anInt4598; local658++) {
				local467 = (float) this.anIntArray261[local658];
				local462 = (float) this.anIntArray262[local658];
				local457 = (float) this.anIntArray258[local658];
				local495 = Static403.aFloat119 * local457 + local462 * Static127.aFloat14 + local467 * Static330.aFloat100 + local54;
				local481 = local33 + local467 * Static375.aFloat116 + Static144.aFloat19 * local462 + local457 * Static575.aFloat186;
				local509 = local117 + Static282.aFloat65 * local457 + local467 * Static302.aFloat84 + Static453.aFloat137 * local462;
				@Pc(765) int local765;
				@Pc(770) int local770;
				@Pc(777) int local777;
				if ((float) this.aClass57_Sub2_16.anInt2782 <= local509) {
					if (arg1 > 0) {
						local509 = (float) arg1;
					}
					local752 = (int) (local481 * (float) local257 / local509 + (float) this.aClass57_Sub2_16.anInt2780);
					local765 = (int) ((float) this.aClass57_Sub2_16.anInt2779 + local495 * (float) local261 / local509);
					local770 = this.anIntArray260[local658];
					local777 = this.anIntArray260[local658 + 1];
					for (@Pc(779) int local779 = local770; local779 < local777; local779++) {
						@Pc(788) int local788 = this.aShortArray60[local779] - 1;
						if (local788 == -1) {
							break;
						}
						local652[local788] = local752;
						local656[local788] = local765;
					}
				} else {
					local752 = this.anIntArray260[local658];
					local765 = this.anIntArray260[local658 + 1];
					for (local770 = local752; local770 < local765; local770++) {
						local777 = this.aShortArray60[local770] - 1;
						if (local777 == -1) {
							break;
						}
						local652[this.aShortArray60[local770] - 1] = -999999;
					}
				}
			}
			for (local752 = 0; local752 < this.anInt4622; local752++) {
				if (local652[this.aShortArray61[local752]] != -999999 && local652[this.aShortArray62[local752]] != -999999 && local652[this.aShortArray59[local752]] != -999999 && this.method3988(local656[this.aShortArray61[local752]], local656[this.aShortArray62[local752]], local652[this.aShortArray62[local752]], local652[this.aShortArray59[local752]], arg2, local656[this.aShortArray59[local752]], local652[this.aShortArray61[local752]], arg5)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jb;ZZLclient!jb;II)Lclient!ka;")
	private Class164 method3995(@OriginalArg(0) Class164_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class164_Sub2 arg3, @OriginalArg(4) int arg4) {
		arg3.aBoolean364 = this.aBoolean364;
		arg3.anInt4598 = this.anInt4598;
		arg3.aShort66 = this.aShort66;
		arg3.anInt4604 = this.anInt4604;
		arg3.anInt4624 = this.anInt4624;
		arg3.anInt4620 = this.anInt4620;
		arg3.aByte67 = 0;
		arg3.anInt4622 = this.anInt4622;
		arg3.anInt4646 = this.anInt4646;
		arg3.anInt4609 = this.anInt4609;
		arg3.anInt4621 = arg4;
		if ((arg4 & 0x100) == 0) {
			arg3.aBoolean365 = this.aBoolean365;
		} else {
			arg3.aBoolean365 = true;
		}
		arg3.aShort62 = this.aShort62;
		@Pc(77) boolean local77 = Static583.method8399(this.anInt4604, arg4);
		@Pc(83) boolean local83 = Static349.method5252(this.anInt4604, arg4);
		@Pc(89) boolean local89 = Static433.method6424(this.anInt4604, arg4);
		@Pc(95) boolean local95 = local89 | local77 | local83;
		@Pc(228) int local228;
		if (local95) {
			if (!local77) {
				arg3.anIntArray261 = this.anIntArray261;
			} else if (arg0.anIntArray261 == null || this.anInt4620 > arg0.anIntArray261.length) {
				arg3.anIntArray261 = arg0.anIntArray261 = new int[this.anInt4620];
			} else {
				arg3.anIntArray261 = arg0.anIntArray261;
			}
			if (!local83) {
				arg3.anIntArray262 = this.anIntArray262;
			} else if (arg0.anIntArray262 == null || arg0.anIntArray262.length < this.anInt4620) {
				arg3.anIntArray262 = arg0.anIntArray262 = new int[this.anInt4620];
			} else {
				arg3.anIntArray262 = arg0.anIntArray262;
			}
			if (!local89) {
				arg3.anIntArray258 = this.anIntArray258;
			} else if (arg0.anIntArray258 == null || arg0.anIntArray258.length < this.anInt4620) {
				arg3.anIntArray258 = arg0.anIntArray258 = new int[this.anInt4620];
			} else {
				arg3.anIntArray258 = arg0.anIntArray258;
			}
			for (local228 = 0; local228 < this.anInt4620; local228++) {
				if (local77) {
					arg3.anIntArray261[local228] = this.anIntArray261[local228];
				}
				if (local83) {
					arg3.anIntArray262[local228] = this.anIntArray262[local228];
				}
				if (local89) {
					arg3.anIntArray258[local228] = this.anIntArray258[local228];
				}
			}
		} else {
			arg3.anIntArray262 = this.anIntArray262;
			arg3.anIntArray258 = this.anIntArray258;
			arg3.anIntArray261 = this.anIntArray261;
		}
		if (Static62.method872(arg4, this.anInt4604)) {
			arg3.aClass356_10 = arg0.aClass356_10;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x1);
			}
			arg3.aClass356_10.aByte143 = this.aClass356_10.aByte143;
			arg3.aClass356_10.anInterface15_7 = this.aClass356_10.anInterface15_7;
		} else if (Static608.method8687(arg4, this.anInt4604)) {
			arg3.aClass356_10 = this.aClass356_10;
		} else {
			arg3.aClass356_10 = null;
		}
		if (Static135.method1945(arg4, this.anInt4604)) {
			if (arg0.aShortArray67 == null || this.anInt4622 > arg0.aShortArray67.length) {
				arg3.aShortArray67 = arg0.aShortArray67 = new short[this.anInt4622];
			} else {
				arg3.aShortArray67 = arg0.aShortArray67;
			}
			for (local228 = 0; local228 < this.anInt4622; local228++) {
				arg3.aShortArray67[local228] = this.aShortArray67[local228];
			}
		} else {
			arg3.aShortArray67 = this.aShortArray67;
		}
		if (Static233.method3389(this.anInt4604, arg4)) {
			if (arg0.aByteArray33 == null || arg0.aByteArray33.length < this.anInt4622) {
				arg3.aByteArray33 = arg0.aByteArray33 = new byte[this.anInt4622];
			} else {
				arg3.aByteArray33 = arg0.aByteArray33;
			}
			for (local228 = 0; local228 < this.anInt4622; local228++) {
				arg3.aByteArray33[local228] = this.aByteArray33[local228];
			}
		} else {
			arg3.aByteArray33 = this.aByteArray33;
		}
		if (Static395.method5775(arg4, this.anInt4604)) {
			arg3.aClass356_7 = arg0.aClass356_7;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x2);
			}
			arg3.aClass356_7.aByte143 = this.aClass356_7.aByte143;
			arg3.aClass356_7.anInterface15_7 = this.aClass356_7.anInterface15_7;
		} else if (Static680.method9332(arg4, this.anInt4604)) {
			arg3.aClass356_7 = this.aClass356_7;
		} else {
			arg3.aClass356_7 = null;
		}
		@Pc(647) int local647;
		if (Static477.method6966(this.anInt4604, arg4)) {
			if (arg0.aShortArray68 == null || this.anInt4646 > arg0.aShortArray68.length) {
				local228 = this.anInt4646;
				arg3.aShortArray68 = arg0.aShortArray68 = new short[local228];
				arg3.aShortArray63 = arg0.aShortArray63 = new short[local228];
				arg3.aShortArray66 = arg0.aShortArray66 = new short[local228];
			} else {
				arg3.aShortArray66 = arg0.aShortArray66;
				arg3.aShortArray68 = arg0.aShortArray68;
				arg3.aShortArray63 = arg0.aShortArray63;
			}
			if (this.aClass338_1 == null) {
				for (local228 = 0; local228 < this.anInt4646; local228++) {
					arg3.aShortArray68[local228] = this.aShortArray68[local228];
					arg3.aShortArray63[local228] = this.aShortArray63[local228];
					arg3.aShortArray66[local228] = this.aShortArray66[local228];
				}
			} else {
				if (arg0.aClass338_1 == null) {
					arg0.aClass338_1 = new Class338();
				}
				@Pc(633) Class338 local633 = arg3.aClass338_1 = arg0.aClass338_1;
				if (local633.aShortArray128 == null || this.anInt4646 > local633.aShortArray128.length) {
					local647 = this.anInt4646;
					local633.aByteArray98 = new byte[local647];
					local633.aShortArray130 = new short[local647];
					local633.aShortArray129 = new short[local647];
					local633.aShortArray128 = new short[local647];
				}
				for (local647 = 0; local647 < this.anInt4646; local647++) {
					arg3.aShortArray68[local647] = this.aShortArray68[local647];
					arg3.aShortArray63[local647] = this.aShortArray63[local647];
					arg3.aShortArray66[local647] = this.aShortArray66[local647];
					local633.aShortArray128[local647] = this.aClass338_1.aShortArray128[local647];
					local633.aShortArray129[local647] = this.aClass338_1.aShortArray129[local647];
					local633.aShortArray130[local647] = this.aClass338_1.aShortArray130[local647];
					local633.aByteArray98[local647] = this.aClass338_1.aByteArray98[local647];
				}
			}
			arg3.aByteArray34 = this.aByteArray34;
		} else {
			arg3.aShortArray68 = this.aShortArray68;
			arg3.aClass338_1 = this.aClass338_1;
			arg3.aShortArray66 = this.aShortArray66;
			arg3.aByteArray34 = this.aByteArray34;
			arg3.aShortArray63 = this.aShortArray63;
		}
		if (Static581.method8339(this.anInt4604, arg4)) {
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x4);
			}
			arg3.aClass356_8 = arg0.aClass356_8;
			arg3.aClass356_8.anInterface15_7 = this.aClass356_8.anInterface15_7;
			arg3.aClass356_8.aByte143 = this.aClass356_8.aByte143;
		} else if (Static555.method8023(arg4, this.anInt4604)) {
			arg3.aClass356_8 = this.aClass356_8;
		} else {
			arg3.aClass356_8 = null;
		}
		if (Static179.method2591(arg4, this.anInt4604)) {
			if (arg0.aFloatArray37 == null || this.anInt4622 > arg0.aFloatArray37.length) {
				local228 = this.anInt4646;
				arg3.aFloatArray38 = arg0.aFloatArray38 = new float[local228];
				arg3.aFloatArray37 = arg0.aFloatArray37 = new float[local228];
			} else {
				arg3.aFloatArray38 = arg0.aFloatArray38;
				arg3.aFloatArray37 = arg0.aFloatArray37;
			}
			for (local228 = 0; local228 < this.anInt4646; local228++) {
				arg3.aFloatArray37[local228] = this.aFloatArray37[local228];
				arg3.aFloatArray38[local228] = this.aFloatArray38[local228];
			}
		} else {
			arg3.aFloatArray38 = this.aFloatArray38;
			arg3.aFloatArray37 = this.aFloatArray37;
		}
		if (Static275.method4066(this.anInt4604, arg4)) {
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x8);
			}
			arg3.aClass356_9 = arg0.aClass356_9;
			arg3.aClass356_9.aByte143 = this.aClass356_9.aByte143;
			arg3.aClass356_9.anInterface15_7 = this.aClass356_9.anInterface15_7;
		} else if (Static287.method4313(arg4, this.anInt4604)) {
			arg3.aClass356_9 = this.aClass356_9;
		} else {
			arg3.aClass356_9 = null;
		}
		if (Static667.method9176(arg4, this.anInt4604)) {
			if (arg0.aShortArray61 == null || arg0.aShortArray61.length < this.anInt4622) {
				local228 = this.anInt4622;
				arg3.aShortArray59 = arg0.aShortArray59 = new short[local228];
				arg3.aShortArray62 = arg0.aShortArray62 = new short[local228];
				arg3.aShortArray61 = arg0.aShortArray61 = new short[local228];
			} else {
				arg3.aShortArray61 = arg0.aShortArray61;
				arg3.aShortArray59 = arg0.aShortArray59;
				arg3.aShortArray62 = arg0.aShortArray62;
			}
			for (local228 = 0; local228 < this.anInt4622; local228++) {
				arg3.aShortArray61[local228] = this.aShortArray61[local228];
				arg3.aShortArray62[local228] = this.aShortArray62[local228];
				arg3.aShortArray59[local228] = this.aShortArray59[local228];
			}
		} else {
			arg3.aShortArray61 = this.aShortArray61;
			arg3.aShortArray62 = this.aShortArray62;
			arg3.aShortArray59 = this.aShortArray59;
		}
		if (Static441.method6512(-70, arg4, this.anInt4604)) {
			arg3.aClass116_1 = arg0.aClass116_1;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x10);
			}
			arg3.aClass116_1.anInterface21_2 = this.aClass116_1.anInterface21_2;
		} else if (Static208.method7683(this.anInt4604, arg4)) {
			arg3.aClass116_1 = this.aClass116_1;
		} else {
			arg3.aClass116_1 = null;
		}
		if (Static90.method1352(arg4, this.anInt4604)) {
			if (arg0.aShortArray64 == null || this.anInt4622 > arg0.aShortArray64.length) {
				local228 = this.anInt4622;
				arg3.aShortArray64 = arg0.aShortArray64 = new short[local228];
			} else {
				arg3.aShortArray64 = arg0.aShortArray64;
			}
			for (local228 = 0; local228 < this.anInt4622; local228++) {
				arg3.aShortArray64[local228] = this.aShortArray64[local228];
			}
		} else {
			arg3.aShortArray64 = this.aShortArray64;
		}
		if (!Static679.method9324(arg4, this.anInt4604)) {
			arg3.aClass235Array1 = this.aClass235Array1;
		} else if (arg0.aClass235Array1 == null || arg0.aClass235Array1.length < this.anInt4609) {
			local228 = this.anInt4609;
			arg3.aClass235Array1 = arg0.aClass235Array1 = new Class235[local228];
			for (local647 = 0; local647 < this.anInt4609; local647++) {
				arg3.aClass235Array1[local647] = this.aClass235Array1[local647].method5416();
			}
		} else {
			arg3.aClass235Array1 = arg0.aClass235Array1;
			for (local228 = 0; local228 < this.anInt4609; local228++) {
				arg3.aClass235Array1[local228].method5418(this.aClass235Array1[local228]);
			}
		}
		arg3.aClass189Array3 = this.aClass189Array3;
		arg3.aShortArray58 = this.aShortArray58;
		arg3.aShortArray60 = this.aShortArray60;
		if (this.aBoolean363) {
			arg3.aShort60 = this.aShort60;
			arg3.aShort63 = this.aShort63;
			arg3.aShort59 = this.aShort59;
			arg3.aShort57 = this.aShort57;
			arg3.aShort65 = this.aShort65;
			arg3.aBoolean363 = true;
			arg3.aShort58 = this.aShort58;
			arg3.aShort64 = this.aShort64;
			arg3.aShort61 = this.aShort61;
		} else {
			arg3.aBoolean363 = false;
		}
		arg3.anIntArrayArray33 = this.anIntArrayArray33;
		arg3.anIntArray260 = this.anIntArray260;
		arg3.anIntArrayArray32 = this.anIntArrayArray32;
		arg3.anIntArray259 = this.anIntArray259;
		arg3.aShortArray65 = this.aShortArray65;
		arg3.anIntArrayArray31 = this.anIntArrayArray31;
		arg3.aClass329Array1 = this.aClass329Array1;
		arg3.aClass161Array3 = this.aClass161Array3;
		return arg3;
	}

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4598; local3++) {
			this.anIntArray258[local3] = -this.anIntArray258[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt4646; local27++) {
			this.aShortArray66[local27] = (short) -this.aShortArray66[local27];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt4622; local54++) {
			@Pc(65) short local65 = this.aShortArray61[local54];
			this.aShortArray61[local54] = this.aShortArray59[local54];
			this.aShortArray59[local54] = local65;
		}
		if (this.aClass356_8 == null && this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
		if (this.aClass356_8 != null) {
			this.aClass356_8.anInterface15_7 = null;
		}
		if (this.aClass116_1 != null) {
			this.aClass116_1.anInterface21_2 = null;
		}
		this.aBoolean363 = false;
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort57;
	}

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static293.anInt5117 = 0;
			local14 = 0;
			Static327.anInt5848 = 0;
			Static625.anInt10196 = 0;
			for (local20 = 0; local20 < this.anInt4598; local20++) {
				Static293.anInt5117 += this.anIntArray261[local20];
				Static625.anInt10196 += this.anIntArray262[local20];
				local14++;
				Static327.anInt5848 += this.anIntArray258[local20];
			}
			if (local14 > 0) {
				Static327.anInt5848 = Static327.anInt5848 / local14 + arg3;
				Static625.anInt10196 = arg2 + Static625.anInt10196 / local14;
				Static293.anInt5117 = Static293.anInt5117 / local14 + arg1;
			} else {
				Static293.anInt5117 = arg1;
				Static625.anInt10196 = arg2;
				Static327.anInt5848 = arg3;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt4598; local14++) {
				this.anIntArray261[local14] += arg1;
				this.anIntArray262[local14] += arg2;
				this.anIntArray258[local14] += arg3;
			}
		} else {
			@Pc(176) int local176;
			@Pc(194) int local194;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt4598; local14++) {
					this.anIntArray261[local14] -= Static293.anInt5117;
					this.anIntArray262[local14] -= Static625.anInt10196;
					this.anIntArray258[local14] -= Static327.anInt5848;
					if (arg3 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg3];
						local176 = Class5_Sub12.anIntArray543[arg3];
						local194 = local20 * this.anIntArray262[local14] + local176 * this.anIntArray261[local14] + 16383 >> 14;
						this.anIntArray262[local14] = this.anIntArray262[local14] * local176 + 16383 - local20 * this.anIntArray261[local14] >> 14;
						this.anIntArray261[local14] = local194;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg1];
						local176 = Class5_Sub12.anIntArray543[arg1];
						local194 = this.anIntArray262[local14] * local176 + 16383 - local20 * this.anIntArray258[local14] >> 14;
						this.anIntArray258[local14] = local176 * this.anIntArray258[local14] + local20 * this.anIntArray262[local14] + 16383 >> 14;
						this.anIntArray262[local14] = local194;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub12.anIntArray544[arg2];
						local176 = Class5_Sub12.anIntArray543[arg2];
						local194 = this.anIntArray258[local14] * local20 + this.anIntArray261[local14] * local176 + 16383 >> 14;
						this.anIntArray258[local14] = local176 * this.anIntArray258[local14] + 16383 - local20 * this.anIntArray261[local14] >> 14;
						this.anIntArray261[local14] = local194;
					}
					this.anIntArray261[local14] += Static293.anInt5117;
					this.anIntArray262[local14] += Static625.anInt10196;
					this.anIntArray258[local14] += Static327.anInt5848;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt4598; local14++) {
					this.anIntArray261[local14] -= Static293.anInt5117;
					this.anIntArray262[local14] -= Static625.anInt10196;
					this.anIntArray258[local14] -= Static327.anInt5848;
					this.anIntArray261[local14] = arg1 * this.anIntArray261[local14] / 128;
					this.anIntArray262[local14] = this.anIntArray262[local14] * arg2 / 128;
					this.anIntArray258[local14] = arg3 * this.anIntArray258[local14] / 128;
					this.anIntArray261[local14] += Static293.anInt5117;
					this.anIntArray262[local14] += Static625.anInt10196;
					this.anIntArray258[local14] += Static327.anInt5848;
				}
			} else {
				@Pc(560) Class329 local560;
				@Pc(565) Class235 local565;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt4622; local14++) {
						local20 = (this.aByteArray33[local14] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray33[local14] = (byte) local20;
					}
					if (this.aClass356_7 != null) {
						this.aClass356_7.anInterface15_7 = null;
					}
					if (this.aClass329Array1 != null) {
						for (local20 = 0; local20 < this.anInt4609; local20++) {
							local560 = this.aClass329Array1[local20];
							local565 = this.aClass235Array1[local20];
							local565.anInt6348 = local565.anInt6348 & 0xFFFFFF | 255 - (this.aByteArray33[local560.anInt9371] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt4622; local14++) {
						local20 = this.aShortArray67[local14] & 0xFFFF;
						local176 = local20 >> 10 & 0x3F;
						local194 = local20 >> 7 & 0x7;
						@Pc(624) int local624 = local176 + arg1 & 0x3F;
						local194 += arg2 / 4;
						@Pc(634) int local634 = local20 & 0x7F;
						local634 += arg3;
						if (local194 < 0) {
							local194 = 0;
						} else if (local194 > 7) {
							local194 = 7;
						}
						if (local634 < 0) {
							local634 = 0;
						} else if (local634 > 127) {
							local634 = 127;
						}
						this.aShortArray67[local14] = (short) (local194 << 7 | local624 << 10 | local634);
					}
					if (this.aClass356_7 != null) {
						this.aClass356_7.anInterface15_7 = null;
					}
					if (this.aClass329Array1 != null) {
						for (local20 = 0; local20 < this.anInt4609; local20++) {
							local560 = this.aClass329Array1[local20];
							local565 = this.aClass235Array1[local20];
							local565.anInt6348 = Static560.anIntArray534[this.aShortArray67[local560.anInt9371] & 0xFFFF] & 0xFFFFFF | local565.anInt6348 & 0xFF000000;
						}
					}
				} else {
					@Pc(766) Class235 local766;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt4609; local14++) {
							local766 = this.aClass235Array1[local14];
							local766.anInt6345 += arg1;
							local766.anInt6350 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt4609; local14++) {
							local766 = this.aClass235Array1[local14];
							local766.anInt6352 = arg2 * local766.anInt6352 >> 7;
							local766.anInt6349 = arg1 * local766.anInt6349 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt4609; local14++) {
							local766 = this.aClass235Array1[local14];
							local766.anInt6346 = arg1 + local766.anInt6346 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qq;IZ)V")
	@Override
	public void method9084(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray65 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4598; local15++) {
			if ((this.aShortArray65[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method8334(this.anIntArray261[local15], this.anIntArray262[local15], this.anIntArray258[local15], local13);
				} else {
					arg0.method8325(this.anIntArray261[local15], this.anIntArray262[local15], this.anIntArray258[local15], local13);
				}
				this.anIntArray261[local15] = local13[0];
				this.anIntArray262[local15] = local13[1];
				this.anIntArray258[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4598; local3++) {
			if (arg0 != 0) {
				this.anIntArray261[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray262[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray258[local3] += arg2;
			}
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!jb", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort66 = (short) arg0;
		if (this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
		if (this.aClass356_8 != null) {
			this.aClass356_8.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qq;Lclient!ng;I)V")
	@Override
	public void method9073(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4646 == 0) {
			return;
		}
		@Pc(17) Class203_Sub2 local17 = this.aClass57_Sub2_16.aClass203_Sub2_3;
		@Pc(20) Class203_Sub2 local20 = (Class203_Sub2) arg0;
		if (!this.aBoolean363) {
			this.method3997();
		}
		Static246.aFloat57 = local17.aFloat131 + local20.aFloat131 * local17.aFloat122 + local17.aFloat130 * local20.aFloat129 + local17.aFloat125 * local20.aFloat126;
		Static453.aFloat137 = local17.aFloat130 * local20.aFloat127 + local17.aFloat125 * local20.aFloat124 + local20.aFloat130 * local17.aFloat122;
		@Pc(75) float local75 = Static246.aFloat57 + Static453.aFloat137 * (float) this.aShort61;
		@Pc(83) float local83 = (float) this.aShort57 * Static453.aFloat137 + Static246.aFloat57;
		@Pc(100) float local100;
		@Pc(93) float local93;
		if (local83 < local75) {
			local93 = (float) this.aShort59 + local75;
			local100 = (float) -this.aShort59 + local83;
		} else {
			local100 = local75 - (float) this.aShort59;
			local93 = (float) this.aShort59 + local83;
		}
		if (this.aClass57_Sub2_16.aFloat46 <= local100 || (float) this.aClass57_Sub2_16.anInt2782 >= local93) {
			return;
		}
		Static144.aFloat19 = local17.aFloat124 * local20.aFloat127 + local20.aFloat124 * local17.aFloat120 + local17.aFloat128 * local20.aFloat130;
		Static354.aFloat115 = local20.aFloat131 * local17.aFloat128 + local20.aFloat126 * local17.aFloat120 + local20.aFloat129 * local17.aFloat124 + local17.aFloat126;
		@Pc(178) float local178 = Static144.aFloat19 * (float) this.aShort61 + Static354.aFloat115;
		@Pc(186) float local186 = Static354.aFloat115 + (float) this.aShort57 * Static144.aFloat19;
		@Pc(213) float local213;
		@Pc(201) float local201;
		if (local186 < local178) {
			local213 = (float) this.aClass57_Sub2_16.anInt2776 * ((float) -this.aShort59 + local186);
			local201 = ((float) this.aShort59 + local178) * (float) this.aClass57_Sub2_16.anInt2776;
		} else {
			local201 = (float) this.aClass57_Sub2_16.anInt2776 * ((float) this.aShort59 + local186);
			local213 = (float) this.aClass57_Sub2_16.anInt2776 * ((float) -this.aShort59 + local178);
		}
		if (this.aClass57_Sub2_16.aFloat34 <= local213 / local93 || local201 / local93 <= this.aClass57_Sub2_16.aFloat50) {
			return;
		}
		Static127.aFloat14 = local17.aFloat121 * local20.aFloat130 + local17.aFloat127 * local20.aFloat127 + local17.aFloat123 * local20.aFloat124;
		Static85.aFloat11 = local17.aFloat127 * local20.aFloat129 + local17.aFloat123 * local20.aFloat126 + local20.aFloat131 * local17.aFloat121 + local17.aFloat129;
		@Pc(305) float local305 = (float) this.aShort61 * Static127.aFloat14 + Static85.aFloat11;
		@Pc(313) float local313 = Static85.aFloat11 + (float) this.aShort57 * Static127.aFloat14;
		@Pc(328) float local328;
		@Pc(339) float local339;
		if (local305 > local313) {
			local328 = (float) this.aClass57_Sub2_16.anInt2778 * (local313 - (float) this.aShort59);
			local339 = (float) this.aClass57_Sub2_16.anInt2778 * (local305 + (float) this.aShort59);
		} else {
			local339 = (float) this.aClass57_Sub2_16.anInt2778 * ((float) this.aShort59 + local313);
			local328 = (local305 - (float) this.aShort59) * (float) this.aClass57_Sub2_16.anInt2778;
		}
		if (this.aClass57_Sub2_16.aFloat44 <= local328 / local93 || local339 / local93 <= this.aClass57_Sub2_16.aFloat35) {
			return;
		}
		if (arg1 != null || this.aClass329Array1 != null) {
			Static282.aFloat65 = local17.aFloat125 * local20.aFloat128 + local17.aFloat130 * local20.aFloat121 + local20.aFloat122 * local17.aFloat122;
			Static330.aFloat100 = local17.aFloat121 * local20.aFloat125 + local17.aFloat123 * local20.aFloat120 + local20.aFloat123 * local17.aFloat127;
			Static375.aFloat116 = local20.aFloat123 * local17.aFloat124 + local20.aFloat120 * local17.aFloat120 + local17.aFloat128 * local20.aFloat125;
			Static403.aFloat119 = local17.aFloat127 * local20.aFloat121 + local17.aFloat123 * local20.aFloat128 + local20.aFloat122 * local17.aFloat121;
			Static575.aFloat186 = local20.aFloat121 * local17.aFloat124 + local17.aFloat120 * local20.aFloat128 + local17.aFloat128 * local20.aFloat122;
			Static302.aFloat84 = local17.aFloat122 * local20.aFloat125 + local17.aFloat125 * local20.aFloat120 + local20.aFloat123 * local17.aFloat130;
		}
		if (arg1 != null) {
			@Pc(504) boolean local504 = false;
			@Pc(506) boolean local506 = true;
			@Pc(515) int local515 = this.aShort64 + this.aShort60 >> 1;
			@Pc(523) int local523 = this.aShort63 + this.aShort58 >> 1;
			@Pc(542) int local542 = (int) (Static144.aFloat19 * (float) this.aShort61 + Static375.aFloat116 * (float) local515 + Static354.aFloat115 + Static575.aFloat186 * (float) local523);
			@Pc(561) int local561 = (int) (Static330.aFloat100 * (float) local515 + Static85.aFloat11 + (float) this.aShort61 * Static127.aFloat14 + Static403.aFloat119 * (float) local523);
			@Pc(580) int local580 = (int) ((float) local523 * Static282.aFloat65 + Static302.aFloat84 * (float) local515 + Static246.aFloat57 + (float) this.aShort61 * Static453.aFloat137);
			if (local580 < this.aClass57_Sub2_16.anInt2782) {
				local504 = true;
			} else {
				arg1.anInt6699 = this.aClass57_Sub2_16.anInt2776 * local542 / local580 + this.aClass57_Sub2_16.anInt2780;
				arg1.anInt6698 = local561 * this.aClass57_Sub2_16.anInt2778 / local580 + this.aClass57_Sub2_16.anInt2779;
			}
			@Pc(640) int local640 = (int) ((float) local523 * Static575.aFloat186 + Static354.aFloat115 + Static375.aFloat116 * (float) local515 + (float) this.aShort57 * Static144.aFloat19);
			@Pc(659) int local659 = (int) (Static85.aFloat11 + (float) local515 * Static330.aFloat100 + Static127.aFloat14 * (float) this.aShort57 + Static403.aFloat119 * (float) local523);
			@Pc(678) int local678 = (int) (Static282.aFloat65 * (float) local523 + Static246.aFloat57 + Static302.aFloat84 * (float) local515 + (float) this.aShort57 * Static453.aFloat137);
			if (local678 >= this.aClass57_Sub2_16.anInt2782) {
				arg1.anInt6702 = local659 * this.aClass57_Sub2_16.anInt2778 / local678 + this.aClass57_Sub2_16.anInt2779;
				arg1.anInt6701 = this.aClass57_Sub2_16.anInt2780 + local640 * this.aClass57_Sub2_16.anInt2776 / local678;
			} else {
				local504 = true;
			}
			if (local504) {
				if (this.aClass57_Sub2_16.anInt2782 > local580 && local678 < this.aClass57_Sub2_16.anInt2782) {
					local506 = false;
				} else {
					@Pc(770) int local770;
					@Pc(782) int local782;
					@Pc(794) int local794;
					if (this.aClass57_Sub2_16.anInt2782 > local580) {
						local770 = (local678 - this.aClass57_Sub2_16.anInt2782 << 16) / (local678 - local580);
						local782 = ((local640 - local542) * local770 >> 16) + local640;
						arg1.anInt6699 = this.aClass57_Sub2_16.anInt2780 + local782 * this.aClass57_Sub2_16.anInt2776 / this.aClass57_Sub2_16.anInt2782;
						local794 = local659 + (local770 * (local659 - local561) >> 16);
						arg1.anInt6698 = this.aClass57_Sub2_16.anInt2778 * local794 / this.aClass57_Sub2_16.anInt2782 + this.aClass57_Sub2_16.anInt2779;
					} else if (local678 < this.aClass57_Sub2_16.anInt2782) {
						local770 = (local580 - this.aClass57_Sub2_16.anInt2782 << 16) / (local580 - local678);
						local782 = local542 + ((local542 - local640) * local770 >> 16);
						local794 = local561 + (local770 * (local561 - local659) >> 16);
						arg1.anInt6699 = this.aClass57_Sub2_16.anInt2780 + this.aClass57_Sub2_16.anInt2776 * local782 / this.aClass57_Sub2_16.anInt2782;
						arg1.anInt6698 = this.aClass57_Sub2_16.anInt2778 * local794 / this.aClass57_Sub2_16.anInt2782 + this.aClass57_Sub2_16.anInt2779;
					}
				}
			}
			if (local506) {
				if (local580 <= local678) {
					arg1.anInt6700 = (this.aShort59 + local640) * this.aClass57_Sub2_16.anInt2776 / local678 + this.aClass57_Sub2_16.anInt2780 - arg1.anInt6701;
				} else {
					arg1.anInt6700 = (this.aShort59 + local542) * this.aClass57_Sub2_16.anInt2776 / local580 + this.aClass57_Sub2_16.anInt2780 - arg1.anInt6699;
				}
				arg1.aBoolean519 = true;
			}
		}
		this.aClass57_Sub2_16.method2333();
		this.aClass57_Sub2_16.method2318(local20);
		this.method4002();
		this.aClass57_Sub2_16.method2360();
		this.method3999();
	}

	@OriginalMember(owner = "client!jb", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4598; local15++) {
			@Pc(36) int local36 = local13 * this.anIntArray262[local15] - this.anIntArray258[local15] * local9 >> 14;
			this.anIntArray258[local15] = this.anIntArray258[local15] * local13 + local9 * this.anIntArray262[local15] >> 14;
			this.anIntArray262[local15] = local36;
		}
		this.aBoolean363 = false;
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	private void method3997() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4598; local23++) {
			@Pc(30) int local30 = this.anIntArray261[local23];
			@Pc(35) int local35 = this.anIntArray262[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			@Pc(72) int local72 = this.anIntArray258[local23];
			if (local17 < local72) {
				local17 = local72;
			}
			if (local72 < local11) {
				local11 = local72;
			}
			@Pc(98) int local98 = local72 * local72 + local30 * local30;
			if (local98 > local19) {
				local19 = local98;
			}
			local98 = local35 * local35 + local30 * local30 + local72 * local72;
			if (local98 > local21) {
				local21 = local98;
			}
		}
		this.aShort60 = (short) local13;
		this.aShort64 = (short) local7;
		this.aShort63 = (short) local17;
		this.aShort58 = (short) local11;
		this.aShort57 = (short) local15;
		this.aShort61 = (short) local9;
		this.aShort59 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort65 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean363 = true;
	}

	@OriginalMember(owner = "client!jb", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!jb", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort62;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!fi;)V")
	private void method3998(@OriginalArg(1) Class5_Sub5_Sub4_Sub1 arg0) {
		if (this.anInt4646 > this.aClass57_Sub2_16.anIntArray145.length) {
			this.aClass57_Sub2_16.anIntArray145 = new int[this.anInt4646];
			this.aClass57_Sub2_16.anIntArray146 = new int[this.anInt4646];
		}
		@Pc(30) int[] local30 = this.aClass57_Sub2_16.anIntArray145;
		@Pc(34) int[] local34 = this.aClass57_Sub2_16.anIntArray146;
		@Pc(63) int local63;
		@Pc(101) int local101;
		@Pc(110) int local110;
		for (@Pc(36) int local36 = 0; local36 < this.anInt4598; local36++) {
			local63 = (this.anIntArray261[local36] - (this.anIntArray262[local36] * this.aClass57_Sub2_16.anInt2769 >> 8) >> this.aClass57_Sub2_16.anInt2749) - arg0.anInt2903;
			@Pc(87) int local87 = (this.anIntArray258[local36] - (this.anIntArray262[local36] * this.aClass57_Sub2_16.anInt2793 >> 8) >> this.aClass57_Sub2_16.anInt2749) - arg0.anInt2908;
			@Pc(92) int local92 = this.anIntArray260[local36];
			@Pc(99) int local99 = this.anIntArray260[local36 + 1];
			for (local101 = local92; local101 < local99; local101++) {
				local110 = this.aShortArray60[local101] - 1;
				if (local110 == -1) {
					break;
				}
				local30[local110] = local63;
				local34[local110] = local87;
			}
		}
		if (97 < 77) {
			return;
		}
		for (local63 = 0; local63 < this.anInt4624; local63++) {
			if (this.aByteArray33 == null || this.aByteArray33[local63] <= 128) {
				@Pc(170) short local170 = this.aShortArray61[local63];
				@Pc(175) short local175 = this.aShortArray62[local63];
				@Pc(180) short local180 = this.aShortArray59[local63];
				local101 = local30[local170];
				local110 = local30[local175];
				@Pc(192) int local192 = local30[local180];
				@Pc(196) int local196 = local34[local170];
				@Pc(200) int local200 = local34[local175];
				@Pc(204) int local204 = local34[local180];
				if ((local101 - local110) * (-local204 + local200) - (local192 - local110) * (local200 - local196) > 0) {
					arg0.method2483(local200, local192, local204, local196, local101, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!qq;ZII)Z")
	@Override
	public boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3993(arg3, arg5, arg1, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method9086(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class164_Sub2 local8 = (Class164_Sub2) arg0;
		if (this.anInt4622 == 0 || local8.anInt4622 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4598;
		@Pc(27) int[] local27 = local8.anIntArray261;
		@Pc(30) int[] local30 = local8.anIntArray262;
		@Pc(33) int[] local33 = local8.anIntArray258;
		@Pc(36) short[] local36 = local8.aShortArray68;
		@Pc(39) short[] local39 = local8.aShortArray63;
		@Pc(42) short[] local42 = local8.aShortArray66;
		@Pc(45) byte[] local45 = local8.aByteArray34;
		@Pc(52) short[] local52;
		@Pc(54) short[] local54;
		@Pc(56) short[] local56;
		@Pc(50) byte[] local50;
		if (this.aClass338_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass338_1.aShortArray128;
			local54 = this.aClass338_1.aShortArray129;
			local50 = this.aClass338_1.aByteArray98;
			local56 = this.aClass338_1.aShortArray130;
		}
		@Pc(83) short[] local83;
		@Pc(81) short[] local81;
		@Pc(79) short[] local79;
		@Pc(85) byte[] local85;
		if (local8.aClass338_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local81 = local8.aClass338_1.aShortArray129;
			local85 = local8.aClass338_1.aByteArray98;
			local79 = local8.aClass338_1.aShortArray130;
			local83 = local8.aClass338_1.aShortArray128;
		}
		@Pc(106) int[] local106 = local8.anIntArray260;
		@Pc(109) short[] local109 = local8.aShortArray60;
		if (!local8.aBoolean363) {
			local8.method3997();
		}
		@Pc(120) short local120 = local8.aShort61;
		@Pc(123) short local123 = local8.aShort57;
		@Pc(126) short local126 = local8.aShort64;
		@Pc(129) short local129 = local8.aShort60;
		@Pc(132) short local132 = local8.aShort58;
		@Pc(135) short local135 = local8.aShort63;
		for (@Pc(137) int local137 = 0; local137 < this.anInt4598; local137++) {
			@Pc(147) int local147 = this.anIntArray262[local137] - arg2;
			if (local147 >= local120 && local147 <= local123) {
				@Pc(175) int local175 = this.anIntArray261[local137] - arg1;
				if (local126 <= local175 && local129 >= local175) {
					@Pc(198) int local198 = this.anIntArray258[local137] - arg3;
					if (local132 <= local198 && local198 <= local135) {
						@Pc(212) int local212 = -1;
						@Pc(217) int local217 = this.anIntArray260[local137];
						@Pc(224) int local224 = this.anIntArray260[local137 + 1];
						for (@Pc(226) int local226 = local217; local226 < local224; local226++) {
							local212 = this.aShortArray60[local226] - 1;
							if (local212 == -1 || this.aByteArray34[local212] != 0) {
								break;
							}
						}
						if (local212 != -1) {
							for (@Pc(263) int local263 = 0; local263 < local24; local263++) {
								if (local27[local263] == local175 && local198 == local33[local263] && local147 == local30[local263]) {
									local217 = local106[local263];
									@Pc(296) int local296 = -1;
									local224 = local106[local263 + 1];
									for (@Pc(304) int local304 = local217; local304 < local224; local304++) {
										local296 = local109[local304] - 1;
										if (local296 == -1 || local45[local296] != 0) {
											break;
										}
									}
									if (local296 != -1) {
										if (local52 == null) {
											this.aClass338_1 = new Class338();
											local52 = this.aClass338_1.aShortArray128 = Static609.method8689(this.aShortArray68);
											local54 = this.aClass338_1.aShortArray129 = Static609.method8689(this.aShortArray63);
											local56 = this.aClass338_1.aShortArray130 = Static609.method8689(this.aShortArray66);
											local50 = this.aClass338_1.aByteArray98 = Static410.method6187(this.aByteArray34);
										}
										if (local83 == null) {
											@Pc(393) Class338 local393 = local8.aClass338_1 = new Class338();
											local83 = local393.aShortArray128 = Static609.method8689(local36);
											local81 = local393.aShortArray129 = Static609.method8689(local39);
											local79 = local393.aShortArray130 = Static609.method8689(local42);
											local85 = local393.aByteArray98 = Static410.method6187(local45);
										}
										@Pc(426) short local426 = this.aShortArray68[local212];
										@Pc(431) short local431 = this.aShortArray63[local212];
										@Pc(436) short local436 = this.aShortArray66[local212];
										local217 = local106[local263];
										@Pc(445) byte local445 = this.aByteArray34[local212];
										local224 = local106[local263 + 1];
										@Pc(461) int local461;
										for (@Pc(453) int local453 = local217; local453 < local224; local453++) {
											local461 = local109[local453] - 1;
											if (local461 == -1) {
												break;
											}
											if (local85[local461] != 0) {
												local83[local461] += local426;
												local81[local461] += local431;
												local79[local461] += local436;
												local85[local461] += local445;
											}
										}
										local426 = local36[local296];
										local224 = this.anIntArray260[local137 + 1];
										local436 = local42[local296];
										local431 = local39[local296];
										local445 = local45[local296];
										local217 = this.anIntArray260[local137];
										for (local461 = local217; local461 < local224; local461++) {
											@Pc(556) int local556 = this.aShortArray60[local461] - 1;
											if (local556 == -1) {
												break;
											}
											if (local50[local556] != 0) {
												local52[local556] += local426;
												local54[local556] += local431;
												local56[local556] += local436;
												local50[local556] += local445;
											}
										}
										if (this.aClass356_8 == null && this.aClass356_7 != null) {
											this.aClass356_7.anInterface15_7 = null;
										}
										if (this.aClass356_8 != null) {
											this.aClass356_8.anInterface15_7 = null;
										}
										if (local8.aClass356_8 == null && local8.aClass356_7 != null) {
											local8.aClass356_7.anInterface15_7 = null;
										}
										if (local8.aClass356_8 != null) {
											local8.aClass356_8.anInterface15_7 = null;
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

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()[Lclient!hja;")
	@Override
	public Class161[] method9070() {
		return this.aClass161Array3;
	}

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			Static327.anInt5848 = 0;
			Static293.anInt5117 = 0;
			Static625.anInt10196 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray32.length) {
					local53 = this.anIntArrayArray32[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						if (this.aShortArray65 == null || (this.aShortArray65[local61] & arg6) != 0) {
							Static293.anInt5117 += this.anIntArray261[local61];
							Static625.anInt10196 += this.anIntArray262[local61];
							Static327.anInt5848 += this.anIntArray258[local61];
							local27++;
						}
					}
				}
			}
			if (local27 <= 0) {
				Static327.anInt5848 = arg4;
				Static293.anInt5117 = arg2;
				Static625.anInt10196 = arg3;
			} else {
				Static327.anInt5848 = arg4 + Static327.anInt5848 / local27;
				Static329.aBoolean445 = true;
				Static625.anInt10196 = arg3 + Static625.anInt10196 / local27;
				Static293.anInt5117 = Static293.anInt5117 / local27 + arg2;
			}
			return;
		}
		@Pc(265) int[] local265;
		@Pc(267) int local267;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local43 = arg7[8] * arg4 + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local43;
				arg3 = local35;
				arg2 = local27;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray32.length) {
					local265 = this.anIntArrayArray32[local35];
					for (local267 = 0; local267 < local265.length; local267++) {
						local55 = local265[local267];
						if (this.aShortArray65 == null || (this.aShortArray65[local55] & arg6) != 0) {
							this.anIntArray261[local55] += arg2;
							this.anIntArray262[local55] += arg3;
							this.anIntArray258[local55] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(400) int local400;
		@Pc(422) int local422;
		@Pc(454) int local454;
		@Pc(481) int local481;
		@Pc(485) int local485;
		@Pc(489) int local489;
		@Pc(493) int local493;
		@Pc(501) int local501;
		@Pc(509) int local509;
		@Pc(663) int local663;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(700) int local700;
		@Pc(705) int local705;
		@Pc(709) int local709;
		@Pc(713) int local713;
		@Pc(715) int local715;
		@Pc(848) int[] local848;
		@Pc(850) int local850;
		@Pc(856) int local856;
		@Pc(860) int local860;
		@Pc(862) int local862;
		@Pc(994) int local994;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray32.length > local35) {
						local265 = this.anIntArrayArray32[local35];
						for (local267 = 0; local267 < local265.length; local267++) {
							local55 = local265[local267];
							if (this.aShortArray65 == null || (this.aShortArray65[local55] & arg6) != 0) {
								this.anIntArray261[local55] -= Static293.anInt5117;
								this.anIntArray262[local55] -= Static625.anInt10196;
								this.anIntArray258[local55] -= Static327.anInt5848;
								if (arg4 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg4];
									local400 = Class5_Sub12.anIntArray543[arg4];
									local422 = this.anIntArray261[local55] * local400 + local61 * this.anIntArray262[local55] + 16383 >> 14;
									this.anIntArray262[local55] = this.anIntArray262[local55] * local400 + 16383 - this.anIntArray261[local55] * local61 >> 14;
									this.anIntArray261[local55] = local422;
								}
								if (arg2 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg2];
									local400 = Class5_Sub12.anIntArray543[arg2];
									local422 = this.anIntArray262[local55] * local400 + 16383 - local61 * this.anIntArray258[local55] >> 14;
									this.anIntArray258[local55] = local61 * this.anIntArray262[local55] + local400 * this.anIntArray258[local55] + 16383 >> 14;
									this.anIntArray262[local55] = local422;
								}
								if (arg3 != 0) {
									local61 = Class5_Sub12.anIntArray544[arg3];
									local400 = Class5_Sub12.anIntArray543[arg3];
									local422 = local400 * this.anIntArray261[local55] + local61 * this.anIntArray258[local55] + 16383 >> 14;
									this.anIntArray258[local55] = this.anIntArray258[local55] * local400 + 16383 - this.anIntArray261[local55] * local61 >> 14;
									this.anIntArray261[local55] = local422;
								}
								this.anIntArray261[local55] += Static293.anInt5117;
								this.anIntArray262[local55] += Static625.anInt10196;
								this.anIntArray258[local55] += Static327.anInt5848;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray32.length) {
							local53 = this.anIntArrayArray32[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray65 == null || (arg6 & this.aShortArray65[local61]) != 0) {
									local400 = this.anIntArray260[local61];
									local422 = this.anIntArray260[local61 + 1];
									for (local454 = local400; local454 < local422; local454++) {
										local481 = this.aShortArray60[local454] - 1;
										if (local481 == -1) {
											break;
										}
										if (arg4 != 0) {
											local485 = Class5_Sub12.anIntArray544[arg4];
											local489 = Class5_Sub12.anIntArray543[arg4];
											local493 = local485 * this.aShortArray63[local481] + local489 * this.aShortArray68[local481] + 16383 >> 14;
											this.aShortArray63[local481] = (short) (local489 * this.aShortArray63[local481] + 16383 - local485 * this.aShortArray68[local481] >> 14);
											this.aShortArray68[local481] = (short) local493;
										}
										if (arg2 != 0) {
											local485 = Class5_Sub12.anIntArray544[arg2];
											local489 = Class5_Sub12.anIntArray543[arg2];
											local493 = this.aShortArray63[local481] * local489 + 16383 - local485 * this.aShortArray66[local481] >> 14;
											this.aShortArray66[local481] = (short) (local485 * this.aShortArray63[local481] + local489 * this.aShortArray66[local481] + 16383 >> 14);
											this.aShortArray63[local481] = (short) local493;
										}
										if (arg3 != 0) {
											local485 = Class5_Sub12.anIntArray544[arg3];
											local489 = Class5_Sub12.anIntArray543[arg3];
											local493 = this.aShortArray68[local481] * local489 + local485 * this.aShortArray66[local481] + 16383 >> 14;
											this.aShortArray66[local481] = (short) (this.aShortArray66[local481] * local489 + 16383 - local485 * this.aShortArray68[local481] >> 14);
											this.aShortArray68[local481] = (short) local493;
										}
									}
								}
							}
						}
					}
					if (this.aClass356_8 == null && this.aClass356_7 != null) {
						this.aClass356_7.anInterface15_7 = null;
					}
					if (this.aClass356_8 != null) {
						this.aClass356_8.anInterface15_7 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local267 = arg7[12] << 4;
				local55 = arg7[13] << 4;
				local61 = arg7[14] << 4;
				if (Static329.aBoolean445) {
					local400 = arg7[3] * Static625.anInt10196 + Static293.anInt5117 * arg7[0] + Static327.anInt5848 * arg7[6] + 8192 >> 14;
					local422 = Static625.anInt10196 * arg7[4] + arg7[1] * Static293.anInt5117 + Static327.anInt5848 * arg7[7] + 8192 >> 14;
					local400 += local267;
					local422 += local55;
					local454 = arg7[2] * Static293.anInt5117 + arg7[5] * Static625.anInt10196 + Static327.anInt5848 * arg7[8] + 8192 >> 14;
					Static293.anInt5117 = local400;
					local454 += local61;
					Static625.anInt10196 = local422;
					Static327.anInt5848 = local454;
					Static329.aBoolean445 = false;
				}
				@Pc(469) int[] local469 = new int[9];
				local422 = Class5_Sub12.anIntArray543[arg2];
				local454 = Class5_Sub12.anIntArray544[arg2];
				local481 = Class5_Sub12.anIntArray543[arg3];
				local485 = Class5_Sub12.anIntArray544[arg3];
				local489 = Class5_Sub12.anIntArray543[arg4];
				local493 = Class5_Sub12.anIntArray544[arg4];
				local501 = local454 * local489 + 8192 >> 14;
				local509 = local454 * local493 + 8192 >> 14;
				local469[8] = local422 * local481 + 8192 >> 14;
				local469[0] = local481 * local489 + local509 * local485 + 8192 >> 14;
				local469[3] = local422 * local493 + 8192 >> 14;
				local469[2] = local422 * local485 + 8192 >> 14;
				local469[6] = local489 * -local485 + local509 * local481 + 8192 >> 14;
				local469[7] = local485 * local493 + local481 * local501 + 8192 >> 14;
				local469[1] = -local481 * local493 + local485 * local501 + 8192 >> 14;
				local469[4] = local489 * local422 + 8192 >> 14;
				local469[5] = -local454;
				@Pc(638) int local638 = local469[0] * -Static293.anInt5117 + -Static625.anInt10196 * local469[1] + -Static327.anInt5848 * local469[2] + 8192 >> 14;
				local663 = local469[5] * -Static327.anInt5848 + local469[4] * -Static625.anInt10196 + -Static293.anInt5117 * local469[3] + 8192 >> 14;
				local688 = -Static327.anInt5848 * local469[8] + -Static293.anInt5117 * local469[6] + -Static625.anInt10196 * local469[7] + 8192 >> 14;
				local692 = Static293.anInt5117 + local638;
				@Pc(696) int local696 = Static625.anInt10196 + local663;
				local700 = Static327.anInt5848 + local688;
				@Pc(703) int[] local703 = new int[9];
				for (local705 = 0; local705 < 3; local705++) {
					for (local709 = 0; local709 < 3; local709++) {
						local713 = 0;
						for (local715 = 0; local715 < 3; local715++) {
							local713 += local469[local715 + local705 * 3] * arg7[local709 * 3 + local715];
						}
						local703[local705 * 3 + local709] = local713 + 8192 >> 14;
					}
				}
				local709 = local61 * local469[2] + local55 * local469[1] + local469[0] * local267 + 8192 >> 14;
				local713 = local469[4] * local55 + local469[3] * local267 + local469[5] * local61 + 8192 >> 14;
				local709 += local692;
				local715 = local61 * local469[8] + local55 * local469[7] + local267 * local469[6] + 8192 >> 14;
				local713 += local696;
				local715 += local700;
				local848 = new int[9];
				for (local850 = 0; local850 < 3; local850++) {
					for (local856 = 0; local856 < 3; local856++) {
						local860 = 0;
						for (local862 = 0; local862 < 3; local862++) {
							local860 += local703[local862 * 3 + local856] * arg7[local862 + local850 * 3];
						}
						local848[local856 + local850 * 3] = local860 + 8192 >> 14;
					}
				}
				local856 = local713 * arg7[1] + local709 * arg7[0] + arg7[2] * local715 + 8192 >> 14;
				local860 = local715 * arg7[5] + local713 * arg7[4] + arg7[3] * local709 + 8192 >> 14;
				local856 += local27;
				local862 = arg7[7] * local713 + local709 * arg7[6] + local715 * arg7[8] + 8192 >> 14;
				local860 += local35;
				local862 += local43;
				for (local994 = 0; local994 < local8; local994++) {
					@Pc(1002) int local1002 = arg1[local994];
					if (this.anIntArrayArray32.length > local1002) {
						@Pc(1016) int[] local1016 = this.anIntArrayArray32[local1002];
						for (@Pc(1018) int local1018 = 0; local1018 < local1016.length; local1018++) {
							@Pc(1024) int local1024 = local1016[local1018];
							if (this.aShortArray65 == null || (this.aShortArray65[local1024] & arg6) != 0) {
								@Pc(1070) int local1070 = local848[1] * this.anIntArray262[local1024] + local848[0] * this.anIntArray261[local1024] + this.anIntArray258[local1024] * local848[2] + 8192 >> 14;
								@Pc(1101) int local1101 = local848[4] * this.anIntArray262[local1024] + this.anIntArray261[local1024] * local848[3] + this.anIntArray258[local1024] * local848[5] + 8192 >> 14;
								@Pc(1132) int local1132 = local848[6] * this.anIntArray261[local1024] + local848[7] * this.anIntArray262[local1024] + local848[8] * this.anIntArray258[local1024] + 8192 >> 14;
								@Pc(1136) int local1136 = local1101 + local860;
								@Pc(1140) int local1140 = local1070 + local856;
								this.anIntArray261[local1024] = local1140;
								@Pc(1149) int local1149 = local1132 + local862;
								this.anIntArray262[local1024] = local1136;
								this.anIntArray258[local1024] = local1149;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2717) Class329 local2717;
			@Pc(2722) Class235 local2722;
			if (arg0 == 5) {
				if (this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray33.length > local35) {
							local265 = this.anIntArrayArray33[local35];
							for (local267 = 0; local267 < local265.length; local267++) {
								local55 = local265[local267];
								if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local55]) != 0) {
									local61 = arg2 * 8 + (this.aByteArray33[local55] & 0xFF);
									if (local61 < 0) {
										local61 = 0;
									} else if (local61 > 255) {
										local61 = 255;
									}
									this.aByteArray33[local55] = (byte) local61;
									if (this.aClass356_7 != null) {
										this.aClass356_7.anInterface15_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass329Array1 != null) {
						for (local35 = 0; local35 < this.anInt4609; local35++) {
							local2717 = this.aClass329Array1[local35];
							local2722 = this.aClass235Array1[local35];
							local2722.anInt6348 = local2722.anInt6348 & 0xFFFFFF | 255 - (this.aByteArray33[local2717.anInt9371] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2987) Class235 local2987;
				if (arg0 == 8) {
					if (this.anIntArrayArray31 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray31.length > local35) {
								local265 = this.anIntArrayArray31[local35];
								for (local267 = 0; local267 < local265.length; local267++) {
									local2987 = this.aClass235Array1[local265[local267]];
									local2987.anInt6345 += arg2;
									local2987.anInt6350 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray31 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray31.length > local35) {
								local265 = this.anIntArrayArray31[local35];
								for (local267 = 0; local267 < local265.length; local267++) {
									local2987 = this.aClass235Array1[local265[local267]];
									local2987.anInt6352 = local2987.anInt6352 * arg3 >> 7;
									local2987.anInt6349 = arg2 * local2987.anInt6349 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray31 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray31.length) {
							local265 = this.anIntArrayArray31[local35];
							for (local267 = 0; local267 < local265.length; local267++) {
								local2987 = this.aClass235Array1[local265[local267]];
								local2987.anInt6346 = local2987.anInt6346 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray33 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray33.length > local35) {
						local265 = this.anIntArrayArray33[local35];
						for (local267 = 0; local267 < local265.length; local267++) {
							local55 = local265[local267];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local55]) != 0) {
								local61 = this.aShortArray67[local55] & 0xFFFF;
								local400 = local61 >> 10 & 0x3F;
								local422 = local61 >> 7 & 0x7;
								local454 = local61 & 0x7F;
								local422 += arg3 / 4;
								@Pc(2829) int local2829 = arg2 + local400 & 0x3F;
								local454 += arg4;
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 7) {
									local422 = 7;
								}
								if (local454 < 0) {
									local454 = 0;
								} else if (local454 > 127) {
									local454 = 127;
								}
								this.aShortArray67[local55] = (short) (local454 | local422 << 7 | local2829 << 10);
								if (this.aClass356_7 != null) {
									this.aClass356_7.anInterface15_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass329Array1 != null) {
					for (local35 = 0; local35 < this.anInt4609; local35++) {
						local2717 = this.aClass329Array1[local35];
						local2722 = this.aClass235Array1[local35];
						local2722.anInt6348 = Static560.anIntArray534[this.aShortArray67[local2717.anInt9371] & 0xFFFF] & 0xFFFFFF | local2722.anInt6348 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray32.length > local35) {
					local265 = this.anIntArrayArray32[local35];
					for (local267 = 0; local267 < local265.length; local267++) {
						local55 = local265[local267];
						if (this.aShortArray65 == null || (this.aShortArray65[local55] & arg6) != 0) {
							this.anIntArray261[local55] -= Static293.anInt5117;
							this.anIntArray262[local55] -= Static625.anInt10196;
							this.anIntArray258[local55] -= Static327.anInt5848;
							this.anIntArray261[local55] = arg2 * this.anIntArray261[local55] >> 7;
							this.anIntArray262[local55] = arg3 * this.anIntArray262[local55] >> 7;
							this.anIntArray258[local55] = this.anIntArray258[local55] * arg4 >> 7;
							this.anIntArray261[local55] += Static293.anInt5117;
							this.anIntArray262[local55] += Static625.anInt10196;
							this.anIntArray258[local55] += Static327.anInt5848;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local267 = arg7[12] << 4;
			local55 = arg7[13] << 4;
			local61 = arg7[14] << 4;
			if (Static329.aBoolean445) {
				local400 = arg7[0] * Static293.anInt5117 + arg7[3] * Static625.anInt10196 + Static327.anInt5848 * arg7[6] + 8192 >> 14;
				local422 = arg7[7] * Static327.anInt5848 + Static293.anInt5117 * arg7[1] + arg7[4] * Static625.anInt10196 + 8192 >> 14;
				local400 += local267;
				local422 += local55;
				local454 = Static625.anInt10196 * arg7[5] + arg7[2] * Static293.anInt5117 + Static327.anInt5848 * arg7[8] + 8192 >> 14;
				Static625.anInt10196 = local422;
				Static293.anInt5117 = local400;
				local454 += local61;
				Static327.anInt5848 = local454;
				Static329.aBoolean445 = false;
			}
			local400 = arg2 << 15 >> 7;
			local422 = arg3 << 15 >> 7;
			local454 = arg4 << 15 >> 7;
			local481 = -Static293.anInt5117 * local400 + 8192 >> 14;
			local485 = -Static625.anInt10196 * local422 + 8192 >> 14;
			local489 = local454 * -Static327.anInt5848 + 8192 >> 14;
			local493 = Static293.anInt5117 + local481;
			local501 = local485 + Static625.anInt10196;
			local509 = local489 + Static327.anInt5848;
			@Pc(1961) int[] local1961 = new int[] { arg7[0] * local400 + 8192 >> 14, arg7[3] * local400 + 8192 >> 14, local400 * arg7[6] + 8192 >> 14, local422 * arg7[1] + 8192 >> 14, local422 * arg7[4] + 8192 >> 14, arg7[7] * local422 + 8192 >> 14, local454 * arg7[2] + 8192 >> 14, local454 * arg7[5] + 8192 >> 14, local454 * arg7[8] + 8192 >> 14 };
			local663 = local400 * local267 + 8192 >> 14;
			local688 = local422 * local55 + 8192 >> 14;
			@Pc(2089) int local2089 = local663 + local493;
			local692 = local61 * local454 + 8192 >> 14;
			@Pc(2101) int local2101 = local688 + local501;
			@Pc(2105) int local2105 = local692 + local509;
			@Pc(2108) int[] local2108 = new int[9];
			@Pc(2114) int local2114;
			for (local700 = 0; local700 < 3; local700++) {
				for (local2114 = 0; local2114 < 3; local2114++) {
					local705 = 0;
					for (local709 = 0; local709 < 3; local709++) {
						local705 += arg7[local700 * 3 + local709] * local1961[local2114 + local709 * 3];
					}
					local2108[local700 * 3 + local2114] = local705 + 8192 >> 14;
				}
			}
			local2114 = local2105 * arg7[2] + local2089 * arg7[0] + arg7[1] * local2101 + 8192 >> 14;
			local705 = arg7[5] * local2105 + arg7[4] * local2101 + local2089 * arg7[3] + 8192 >> 14;
			local709 = arg7[6] * local2089 + arg7[7] * local2101 + local2105 * arg7[8] + 8192 >> 14;
			local2114 += local27;
			local705 += local35;
			local709 += local43;
			for (local713 = 0; local713 < local8; local713++) {
				local715 = arg1[local713];
				if (this.anIntArrayArray32.length > local715) {
					local848 = this.anIntArrayArray32[local715];
					for (local850 = 0; local850 < local848.length; local850++) {
						local856 = local848[local850];
						if (this.aShortArray65 == null || (this.aShortArray65[local856] & arg6) != 0) {
							local860 = local2108[2] * this.anIntArray258[local856] + local2108[1] * this.anIntArray262[local856] + local2108[0] * this.anIntArray261[local856] + 8192 >> 14;
							local862 = this.anIntArray262[local856] * local2108[4] + this.anIntArray261[local856] * local2108[3] + local2108[5] * this.anIntArray258[local856] + 8192 >> 14;
							local994 = local2108[8] * this.anIntArray258[local856] + this.anIntArray262[local856] * local2108[7] + local2108[6] * this.anIntArray261[local856] + 8192 >> 14;
							@Pc(2399) int local2399 = local860 + local2114;
							@Pc(2403) int local2403 = local862 + local705;
							this.anIntArray261[local856] = local2399;
							@Pc(2412) int local2412 = local994 + local709;
							this.anIntArray262[local856] = local2403;
							this.anIntArray258[local856] = local2412;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()V")
	@Override
	protected void method9079() {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method9090(@OriginalArg(0) Class203 arg0) {
		@Pc(8) Class203_Sub2 local8 = (Class203_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass189Array3 != null) {
			for (local13 = 0; local13 < this.aClass189Array3.length; local13++) {
				@Pc(20) Class189 local20 = this.aClass189Array3[local13];
				@Pc(22) Class189 local22 = local20;
				if (local20.aClass189_2 != null) {
					local22 = local20.aClass189_2;
				}
				local22.anInt4894 = (int) (local8.aFloat126 + local8.aFloat124 * (float) this.anIntArray262[local20.anInt4891] + (float) this.anIntArray261[local20.anInt4891] * local8.aFloat120 + local8.aFloat128 * (float) this.anIntArray258[local20.anInt4891]);
				local22.anInt4883 = (int) ((float) this.anIntArray261[local20.anInt4891] * local8.aFloat123 + (float) this.anIntArray262[local20.anInt4891] * local8.aFloat127 + local8.aFloat121 * (float) this.anIntArray258[local20.anInt4891] + local8.aFloat129);
				local22.anInt4899 = (int) (local8.aFloat130 * (float) this.anIntArray262[local20.anInt4891] + local8.aFloat125 * (float) this.anIntArray261[local20.anInt4891] + local8.aFloat122 * (float) this.anIntArray258[local20.anInt4891] + local8.aFloat131);
				local22.anInt4896 = (int) (local8.aFloat126 + local8.aFloat128 * (float) this.anIntArray258[local20.anInt4885] + (float) this.anIntArray261[local20.anInt4885] * local8.aFloat120 + local8.aFloat124 * (float) this.anIntArray262[local20.anInt4885]);
				local22.anInt4900 = (int) (local8.aFloat121 * (float) this.anIntArray258[local20.anInt4885] + local8.aFloat127 * (float) this.anIntArray262[local20.anInt4885] + (float) this.anIntArray261[local20.anInt4885] * local8.aFloat123 + local8.aFloat129);
				local22.anInt4888 = (int) (local8.aFloat131 + (float) this.anIntArray262[local20.anInt4885] * local8.aFloat130 + local8.aFloat125 * (float) this.anIntArray261[local20.anInt4885] + (float) this.anIntArray258[local20.anInt4885] * local8.aFloat122);
				local22.anInt4895 = (int) (local8.aFloat126 + (float) this.anIntArray262[local20.anInt4901] * local8.aFloat124 + local8.aFloat120 * (float) this.anIntArray261[local20.anInt4901] + (float) this.anIntArray258[local20.anInt4901] * local8.aFloat128);
				local22.anInt4886 = (int) (local8.aFloat129 + local8.aFloat121 * (float) this.anIntArray258[local20.anInt4901] + (float) this.anIntArray262[local20.anInt4901] * local8.aFloat127 + local8.aFloat123 * (float) this.anIntArray261[local20.anInt4901]);
				local22.anInt4898 = (int) ((float) this.anIntArray261[local20.anInt4901] * local8.aFloat125 + local8.aFloat130 * (float) this.anIntArray262[local20.anInt4901] + (float) this.anIntArray258[local20.anInt4901] * local8.aFloat122 + local8.aFloat131);
			}
		}
		if (this.aClass161Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass161Array3.length; local13++) {
			@Pc(367) Class161 local367 = this.aClass161Array3[local13];
			@Pc(369) Class161 local369 = local367;
			if (local367.aClass161_1 != null) {
				local369 = local367.aClass161_1;
			}
			if (local367.aClass203_5 == null) {
				local367.aClass203_5 = local8.method8323();
			} else {
				local367.aClass203_5.method8336(local8);
			}
			local369.anInt3681 = (int) ((float) this.anIntArray261[local367.anInt3680] * local8.aFloat120 + local8.aFloat124 * (float) this.anIntArray262[local367.anInt3680] + local8.aFloat128 * (float) this.anIntArray258[local367.anInt3680] + local8.aFloat126);
			local369.anInt3675 = (int) (local8.aFloat121 * (float) this.anIntArray258[local367.anInt3680] + (float) this.anIntArray261[local367.anInt3680] * local8.aFloat123 + local8.aFloat127 * (float) this.anIntArray262[local367.anInt3680] + local8.aFloat129);
			local369.anInt3678 = (int) ((float) this.anIntArray262[local367.anInt3680] * local8.aFloat130 + (float) this.anIntArray261[local367.anInt3680] * local8.aFloat125 + (float) this.anIntArray258[local367.anInt3680] * local8.aFloat122 + local8.aFloat131);
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	private void method3999() {
		if (this.aClass329Array1 == null) {
			return;
		}
		@Pc(16) Class203_Sub2 local16 = this.aClass57_Sub2_16.aClass203_Sub2_2;
		this.aClass57_Sub2_16.method2385();
		this.aClass57_Sub2_16.C(!this.aBoolean365);
		this.aClass57_Sub2_16.method2335(false);
		this.aClass57_Sub2_16.method2353((Class356) null, this.aClass57_Sub2_16.aClass356_6, (Class356) null, this.aClass57_Sub2_16.aClass356_5);
		for (@Pc(51) int local51 = 0; local51 < this.anInt4609; local51++) {
			@Pc(60) Class329 local60 = this.aClass329Array1[local51];
			@Pc(65) Class235 local65 = this.aClass235Array1[local51];
			if (!local60.aBoolean719 || !this.aClass57_Sub2_16.method7711()) {
				@Pc(95) float local95 = (float) (this.anIntArray261[local60.anInt9365] + this.anIntArray261[local60.anInt9367] + this.anIntArray261[local60.anInt9366]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray262[local60.anInt9367] + this.anIntArray262[local60.anInt9366] + this.anIntArray262[local60.anInt9365]) * 0.3333333F;
				@Pc(137) float local137 = (float) (this.anIntArray258[local60.anInt9365] + this.anIntArray258[local60.anInt9366] + this.anIntArray258[local60.anInt9367]) * 0.3333333F;
				@Pc(151) float local151 = local95 * Static375.aFloat116 + Static144.aFloat19 * local116 + Static575.aFloat186 * local137 + Static354.aFloat115;
				@Pc(165) float local165 = Static403.aFloat119 * local137 + Static330.aFloat100 * local95 + Static127.aFloat14 * local116 + Static85.aFloat11;
				@Pc(179) float local179 = local95 * Static302.aFloat84 + local116 * Static453.aFloat137 + Static282.aFloat65 * local137 + Static246.aFloat57;
				@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local179 * local179 + local165 * local165 + local151 * local151))) * (float) local60.anInt9368;
				local16.method6183(local179 * local200 - local179, -local165 + (float) local65.anInt6350 + local200 * local165, local151 + (float) local65.anInt6345 - local200 * local151, local65.anInt6346, local60.aShort102 * local65.anInt6352 >> 7, local65.anInt6349 * local60.aShort103 >> 7);
				this.aClass57_Sub2_16.method2374(local16);
				@Pc(253) int local253 = local65.anInt6348;
				OpenGL.glColor4ub((byte) (local253 >> 16), (byte) (local253 >> 8), (byte) local253, (byte) (local253 >> 24));
				this.aClass57_Sub2_16.method2358(local60.aShort101);
				this.aClass57_Sub2_16.method2372(local60.aByte131);
				this.aClass57_Sub2_16.method2307(4);
			}
		}
		this.aClass57_Sub2_16.C(true);
		this.aClass57_Sub2_16.method2360();
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4598; local15++) {
			local33 = local13 * this.anIntArray261[local15] + local9 * this.anIntArray258[local15] >> 14;
			this.anIntArray258[local15] = this.anIntArray258[local15] * local13 - this.anIntArray261[local15] * local9 >> 14;
			this.anIntArray261[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4646; local33++) {
			@Pc(86) int local86 = this.aShortArray66[local33] * local9 + this.aShortArray68[local33] * local13 >> 14;
			this.aShortArray66[local33] = (short) (this.aShortArray66[local33] * local13 - local9 * this.aShortArray68[local33] >> 14);
			this.aShortArray68[local33] = (short) local86;
		}
		if (this.aClass356_8 == null && this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
		if (this.aClass356_8 != null) {
			this.aClass356_8.anInterface15_7 = null;
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!qq;ZI)Z")
	@Override
	public boolean method9093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3993(arg3, -1, arg1, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt4621;
	}

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!jb", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4598; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray261[local15] + this.anIntArray262[local15] * local9 >> 14;
			this.anIntArray262[local15] = local13 * this.anIntArray262[local15] - local9 * this.anIntArray261[local15] >> 14;
			this.anIntArray261[local15] = local33;
		}
		this.aBoolean363 = false;
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean363) {
			this.method3997();
		}
		@Pc(18) int local18 = this.aShort64 + arg4;
		@Pc(23) int local23 = arg4 + this.aShort60;
		@Pc(28) int local28 = arg6 + this.aShort58;
		@Pc(33) int local33 = this.aShort63 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9376 <= arg2.anInt9377 + local23 >> arg2.anInt9378 || local28 < 0 || arg2.anInt9375 <= local33 + arg2.anInt9377 >> arg2.anInt9378)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt9376 <= local23 + arg3.anInt9377 >> arg3.anInt9378 || local28 < 0 || local33 + arg3.anInt9377 >> arg3.anInt9378 >= arg3.anInt9375) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9378;
			local23 = arg2.anInt9377 + local23 - 1 >> arg2.anInt9378;
			local28 >>= arg2.anInt9378;
			local33 = local33 + arg2.anInt9377 - 1 >> arg2.anInt9378;
			if (arg2.method8038(local28, local18) == arg5 && arg5 == arg2.method8038(local28, local23) && arg5 == arg2.method8038(local33, local18) && arg2.method8038(local33, local23) == arg5) {
				return;
			}
		}
		@Pc(227) int local227;
		if (arg0 == 1) {
			for (local227 = 0; local227 < this.anInt4598; local227++) {
				this.anIntArray262[local227] = this.anIntArray262[local227] + arg2.method8032(this.anIntArray261[local227] + arg4, arg6 + this.anIntArray258[local227]) - arg5;
			}
		} else {
			@Pc(302) int local302;
			@Pc(370) int local370;
			if (arg0 == 2) {
				@Pc(534) short local534 = this.aShort61;
				if (local534 == 0) {
					return;
				}
				for (local302 = 0; local302 < this.anInt4598; local302++) {
					local370 = (this.anIntArray262[local302] << 16) / local534;
					if (local370 < arg1) {
						this.anIntArray262[local302] -= -((arg2.method8032(arg4 + this.anIntArray261[local302], this.anIntArray258[local302] + arg6) - arg5) * (arg1 - local370) / arg1);
					}
				}
			} else {
				@Pc(377) int local377;
				if (arg0 == 3) {
					local227 = (arg1 & 0xFF) * 4;
					local302 = (arg1 >> 8 & 0xFF) * 4;
					local370 = (arg1 >> 16 & 0xFF) << 6;
					local377 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local227 >> 1) < 0 || arg4 + (local227 >> 1) + arg2.anInt9377 >= arg2.anInt9376 << arg2.anInt9378 || arg6 - (local302 >> 1) < 0 || arg2.anInt9375 << arg2.anInt9378 <= arg2.anInt9377 + arg6 + (local302 >> 1)) {
						return;
					}
					this.method9087(local302, local370, local377, arg6, arg5, local227, arg2, arg4);
				} else if (arg0 == 4) {
					local227 = this.aShort57 - this.aShort61;
					for (local302 = 0; local302 < this.anInt4598; local302++) {
						this.anIntArray262[local302] = this.anIntArray262[local302] + arg3.method8032(arg4 + this.anIntArray261[local302], arg6 + this.anIntArray258[local302]) + local227 - arg5;
					}
				} else if (arg0 == 5) {
					local227 = this.aShort57 - this.aShort61;
					for (local302 = 0; local302 < this.anInt4598; local302++) {
						local370 = arg4 + this.anIntArray261[local302];
						local377 = arg6 + this.anIntArray258[local302];
						@Pc(383) int local383 = arg2.method8032(local370, local377);
						@Pc(389) int local389 = arg3.method8032(local370, local377);
						@Pc(397) int local397 = local383 - arg1 - local389;
						this.anIntArray262[local302] = local383 + (local397 * ((this.anIntArray262[local302] << 8) / local227) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
		}
		this.aShort62 = (short) arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class164 method9072(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class164_Sub2 local23;
		@Pc(19) Class164_Sub2 local19;
		if (arg0 == 1) {
			local23 = this.aClass57_Sub2_16.aClass164_Sub2_4;
			local19 = this.aClass57_Sub2_16.aClass164_Sub2_10;
		} else if (arg0 == 2) {
			local19 = this.aClass57_Sub2_16.aClass164_Sub2_7;
			local23 = this.aClass57_Sub2_16.aClass164_Sub2_6;
		} else if (arg0 == 3) {
			local19 = this.aClass57_Sub2_16.aClass164_Sub2_8;
			local23 = this.aClass57_Sub2_16.aClass164_Sub2_3;
		} else if (arg0 == 4) {
			local23 = this.aClass57_Sub2_16.aClass164_Sub2_9;
			local19 = this.aClass57_Sub2_16.aClass164_Sub2_5;
		} else if (arg0 == 5) {
			local23 = this.aClass57_Sub2_16.aClass164_Sub2_1;
			local19 = this.aClass57_Sub2_16.aClass164_Sub2_2;
		} else {
			local23 = local19 = new Class164_Sub2(this.aClass57_Sub2_16);
		}
		return this.method3995(local19, arg2, arg0 != 0, local23, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method9076(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(40) int local40;
		@Pc(56) int local56;
		@Pc(54) int[] local54;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static327.anInt5848 = 0;
			Static293.anInt5117 = 0;
			Static625.anInt10196 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray32.length) {
					local54 = this.anIntArrayArray32[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						Static293.anInt5117 += this.anIntArray261[local62];
						Static625.anInt10196 += this.anIntArray262[local62];
						local24++;
						Static327.anInt5848 += this.anIntArray258[local62];
					}
				}
			}
			if (local24 <= 0) {
				Static327.anInt5848 = local18;
				Static625.anInt10196 = local14;
				Static293.anInt5117 = local22;
			} else {
				Static625.anInt10196 = Static625.anInt10196 / local24 + local14;
				Static327.anInt5848 = Static327.anInt5848 / local24 + local18;
				Static293.anInt5117 = Static293.anInt5117 / local24 + local22;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local14 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray32.length) {
					local168 = this.anIntArrayArray32[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local56 = local168[local170];
						this.anIntArray261[local56] += local22;
						this.anIntArray262[local56] += local14;
						this.anIntArray258[local56] += local18;
					}
				}
			}
			return;
		}
		@Pc(296) int local296;
		@Pc(314) int local314;
		@Pc(785) int local785;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray32.length) {
					local168 = this.anIntArrayArray32[local32];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local56 = local168[local170];
							this.anIntArray261[local56] -= Static293.anInt5117;
							this.anIntArray262[local56] -= Static625.anInt10196;
							this.anIntArray258[local56] -= Static327.anInt5848;
							if (arg4 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg4];
								local296 = Class5_Sub12.anIntArray543[arg4];
								local314 = this.anIntArray262[local56] * local62 + local296 * this.anIntArray261[local56] + 16383 >> 14;
								this.anIntArray262[local56] = this.anIntArray262[local56] * local296 + 16383 - local62 * this.anIntArray261[local56] >> 14;
								this.anIntArray261[local56] = local314;
							}
							if (arg2 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg2];
								local296 = Class5_Sub12.anIntArray543[arg2];
								local314 = this.anIntArray262[local56] * local296 + 16383 - this.anIntArray258[local56] * local62 >> 14;
								this.anIntArray258[local56] = local296 * this.anIntArray258[local56] + this.anIntArray262[local56] * local62 + 16383 >> 14;
								this.anIntArray262[local56] = local314;
							}
							if (arg3 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg3];
								local296 = Class5_Sub12.anIntArray543[arg3];
								local314 = this.anIntArray261[local56] * local296 + this.anIntArray258[local56] * local62 + 16383 >> 14;
								this.anIntArray258[local56] = local296 * this.anIntArray258[local56] + 16383 - local62 * this.anIntArray261[local56] >> 14;
								this.anIntArray261[local56] = local314;
							}
							this.anIntArray261[local56] += Static293.anInt5117;
							this.anIntArray262[local56] += Static625.anInt10196;
							this.anIntArray258[local56] += Static327.anInt5848;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local56 = local168[local170];
							this.anIntArray261[local56] -= Static293.anInt5117;
							this.anIntArray262[local56] -= Static625.anInt10196;
							this.anIntArray258[local56] -= Static327.anInt5848;
							if (arg2 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg2];
								local296 = Class5_Sub12.anIntArray543[arg2];
								local314 = this.anIntArray262[local56] * local296 + 16383 - this.anIntArray258[local56] * local62 >> 14;
								this.anIntArray258[local56] = this.anIntArray258[local56] * local296 + this.anIntArray262[local56] * local62 + 16383 >> 14;
								this.anIntArray262[local56] = local314;
							}
							if (arg4 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg4];
								local296 = Class5_Sub12.anIntArray543[arg4];
								local314 = local296 * this.anIntArray261[local56] + local62 * this.anIntArray262[local56] + 16383 >> 14;
								this.anIntArray262[local56] = local296 * this.anIntArray262[local56] + 16383 - this.anIntArray261[local56] * local62 >> 14;
								this.anIntArray261[local56] = local314;
							}
							if (arg3 != 0) {
								local62 = Class5_Sub12.anIntArray544[arg3];
								local296 = Class5_Sub12.anIntArray543[arg3];
								local314 = local62 * this.anIntArray258[local56] + local296 * this.anIntArray261[local56] + 16383 >> 14;
								this.anIntArray258[local56] = this.anIntArray258[local56] * local296 + 16383 - this.anIntArray261[local56] * local62 >> 14;
								this.anIntArray261[local56] = local314;
							}
							this.anIntArray261[local56] += Static293.anInt5117;
							this.anIntArray262[local56] += Static625.anInt10196;
							this.anIntArray258[local56] += Static327.anInt5848;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local40 = arg1[local32];
					if (this.anIntArrayArray32.length > local40) {
						local54 = this.anIntArrayArray32[local40];
						for (local56 = 0; local56 < local54.length; local56++) {
							local62 = local54[local56];
							local296 = this.anIntArray260[local62];
							local314 = this.anIntArray260[local62 + 1];
							for (local785 = local296; local785 < local314; local785++) {
								@Pc(794) int local794 = this.aShortArray60[local785] - 1;
								if (local794 == -1) {
									break;
								}
								@Pc(805) int local805;
								@Pc(809) int local809;
								@Pc(827) int local827;
								if (arg4 != 0) {
									local805 = Class5_Sub12.anIntArray544[arg4];
									local809 = Class5_Sub12.anIntArray543[arg4];
									local827 = this.aShortArray68[local794] * local809 + this.aShortArray63[local794] * local805 + 16383 >> 14;
									this.aShortArray63[local794] = (short) (local809 * this.aShortArray63[local794] + 16383 - this.aShortArray68[local794] * local805 >> 14);
									this.aShortArray68[local794] = (short) local827;
								}
								if (arg2 != 0) {
									local805 = Class5_Sub12.anIntArray544[arg2];
									local809 = Class5_Sub12.anIntArray543[arg2];
									local827 = local809 * this.aShortArray63[local794] + 16383 - local805 * this.aShortArray66[local794] >> 14;
									this.aShortArray66[local794] = (short) (local809 * this.aShortArray66[local794] + local805 * this.aShortArray63[local794] + 16383 >> 14);
									this.aShortArray63[local794] = (short) local827;
								}
								if (arg3 != 0) {
									local805 = Class5_Sub12.anIntArray544[arg3];
									local809 = Class5_Sub12.anIntArray543[arg3];
									local827 = this.aShortArray66[local794] * local805 + local809 * this.aShortArray68[local794] + 16383 >> 14;
									this.aShortArray66[local794] = (short) (local809 * this.aShortArray66[local794] + 16383 - this.aShortArray68[local794] * local805 >> 14);
									this.aShortArray68[local794] = (short) local827;
								}
							}
						}
					}
				}
				if (this.aClass356_8 == null && this.aClass356_7 != null) {
					this.aClass356_7.anInterface15_7 = null;
				}
				if (this.aClass356_8 != null) {
					this.aClass356_8.anInterface15_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray32.length) {
					local168 = this.anIntArrayArray32[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local56 = local168[local170];
						this.anIntArray261[local56] -= Static293.anInt5117;
						this.anIntArray262[local56] -= Static625.anInt10196;
						this.anIntArray258[local56] -= Static327.anInt5848;
						this.anIntArray261[local56] = arg2 * this.anIntArray261[local56] >> 7;
						this.anIntArray262[local56] = this.anIntArray262[local56] * arg3 >> 7;
						this.anIntArray258[local56] = this.anIntArray258[local56] * arg4 >> 7;
						this.anIntArray261[local56] += Static293.anInt5117;
						this.anIntArray262[local56] += Static625.anInt10196;
						this.anIntArray258[local56] += Static327.anInt5848;
					}
				}
			}
		} else {
			@Pc(1275) Class329 local1275;
			@Pc(1280) Class235 local1280;
			if (arg0 == 5) {
				if (this.anIntArrayArray33 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray33.length) {
							local168 = this.anIntArrayArray33[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local56 = local168[local170];
								local62 = (this.aByteArray33[local56] & 0xFF) + arg2 * 8;
								if (local62 < 0) {
									local62 = 0;
								} else if (local62 > 255) {
									local62 = 255;
								}
								this.aByteArray33[local56] = (byte) local62;
							}
							if (local168.length > 0 && this.aClass356_7 != null) {
								this.aClass356_7.anInterface15_7 = null;
							}
						}
					}
					if (this.aClass329Array1 != null) {
						for (local32 = 0; local32 < this.anInt4609; local32++) {
							local1275 = this.aClass329Array1[local32];
							local1280 = this.aClass235Array1[local32];
							local1280.anInt6348 = local1280.anInt6348 & 0xFFFFFF | 255 - (this.aByteArray33[local1275.anInt9371] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1550) Class235 local1550;
				if (arg0 == 8) {
					if (this.anIntArrayArray31 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray31.length > local32) {
								local168 = this.anIntArrayArray31[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1550 = this.aClass235Array1[local168[local170]];
									local1550.anInt6345 += arg2;
									local1550.anInt6350 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray31 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray31.length > local32) {
								local168 = this.anIntArrayArray31[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1550 = this.aClass235Array1[local168[local170]];
									local1550.anInt6349 = local1550.anInt6349 * arg2 >> 7;
									local1550.anInt6352 = local1550.anInt6352 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray31 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray31.length) {
							local168 = this.anIntArrayArray31[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1550 = this.aClass235Array1[local168[local170]];
								local1550.anInt6346 = local1550.anInt6346 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray33 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray33.length > local32) {
						local168 = this.anIntArrayArray33[local32];
						for (local170 = 0; local170 < local168.length; local170++) {
							local56 = local168[local170];
							local62 = this.aShortArray67[local56] & 0xFFFF;
							local296 = local62 >> 10 & 0x3F;
							local314 = local62 >> 7 & 0x7;
							local314 += arg3 / 4;
							local785 = local62 & 0x7F;
							@Pc(1378) int local1378 = local296 + arg2 & 0x3F;
							local785 += arg4;
							if (local314 < 0) {
								local314 = 0;
							} else if (local314 > 7) {
								local314 = 7;
							}
							if (local785 < 0) {
								local785 = 0;
							} else if (local785 > 127) {
								local785 = 127;
							}
							this.aShortArray67[local56] = (short) (local785 | local1378 << 10 | local314 << 7);
						}
						if (local168.length > 0 && this.aClass356_7 != null) {
							this.aClass356_7.anInterface15_7 = null;
						}
					}
				}
				if (this.aClass329Array1 != null) {
					for (local32 = 0; local32 < this.anInt4609; local32++) {
						local1275 = this.aClass329Array1[local32];
						local1280 = this.aClass235Array1[local32];
						local1280.anInt6348 = local1280.anInt6348 & 0xFF000000 | Static560.anIntArray534[this.aShortArray67[local1275.anInt9371] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean363) {
			this.method3997();
		}
		return this.aShort58;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()Z")
	@Override
	public boolean method9083() {
		if (this.aShortArray64 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray64.length; local13++) {
			if (this.aShortArray64[local13] != -1 && !this.aClass57_Sub2_16.anInterface1_11.method2860(this.aShortArray64[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12.anIntArray544[arg0];
		@Pc(13) int local13 = Class5_Sub12.anIntArray543[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4598; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray261[local15] + local9 * this.anIntArray258[local15] >> 14;
			this.anIntArray258[local15] = this.anIntArray258[local15] * local13 - local9 * this.anIntArray261[local15] >> 14;
			this.anIntArray261[local15] = local33;
		}
		if (this.aClass356_10 != null) {
			this.aClass356_10.anInterface15_7 = null;
		}
		this.aBoolean363 = false;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	@Override
	public void method9091() {
		if (this.anInt4646 <= 0 || this.anInt4624 <= 0) {
			return;
		}
		this.method3990(false);
		if ((this.aByte67 & 0x10) == 0 && this.aClass116_1.anInterface21_2 == null) {
			this.method4001(false);
		}
		this.method3992();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	private void method4001(@OriginalArg(0) boolean arg0) {
		if (this.anInt4624 * 6 > this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1.aByteArray102.length) {
			this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1(this.anInt4624 * 6 + 600);
		} else {
			this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1.anInt9869 = 0;
		}
		@Pc(50) Class5_Sub23_Sub1 local50 = this.aClass57_Sub2_16.aClass5_Sub23_Sub1_1;
		@Pc(56) int local56;
		if (this.aClass57_Sub2_16.aBoolean216) {
			for (local56 = 0; local56 < this.anInt4624; local56++) {
				local50.method8480(this.aShortArray61[local56]);
				local50.method8480(this.aShortArray62[local56]);
				local50.method8480(this.aShortArray59[local56]);
			}
		} else {
			for (local56 = 0; local56 < this.anInt4624; local56++) {
				local50.method8539(this.aShortArray61[local56]);
				local50.method8539(this.aShortArray62[local56]);
				local50.method8539(this.aShortArray59[local56]);
			}
		}
		if (local50.anInt9869 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface21_4 == null) {
				this.anInterface21_4 = this.aClass57_Sub2_16.method2356(local50.anInt9869, local50.aByteArray102, true);
			} else {
				this.anInterface21_4.method8198(local50.aByteArray102, local50.anInt9869);
			}
			this.aClass116_1.anInterface21_2 = this.anInterface21_4;
		} else {
			this.aClass116_1.anInterface21_2 = this.aClass57_Sub2_16.method2356(local50.anInt9869, local50.aByteArray102, false);
		}
		if (!arg0) {
			this.lb = true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	private void method4002() {
		if (this.anInt4624 == 0) {
			return;
		}
		if (this.aByte67 != 0) {
			this.method3990(true);
		}
		this.method3990(false);
		if (this.aClass116_1 != null) {
			if (this.aClass116_1.anInterface21_2 == null) {
				this.method4001((this.aByte67 & 0x10) != 0);
			}
			if (this.aClass116_1.anInterface21_2 != null) {
				this.aClass57_Sub2_16.method2335(this.aClass356_8 != null);
				this.aClass57_Sub2_16.method2353(this.aClass356_8, this.aClass356_10, this.aClass356_7, this.aClass356_9);
				@Pc(84) int local84 = this.anIntArray259.length - 1;
				for (@Pc(86) int local86 = 0; local86 < local84; local86++) {
					@Pc(93) int local93 = this.anIntArray259[local86];
					@Pc(100) int local100 = this.anIntArray259[local86 + 1];
					@Pc(107) int local107 = this.aShortArray64[local93] & 0xFFFF;
					if (local107 == 65535) {
						local107 = -1;
					}
					this.aClass57_Sub2_16.method2329(this.aClass356_8 != null, local107);
					this.aClass57_Sub2_16.method2323(this.aClass116_1.anInterface21_2, (local100 - local93) * 3, local93 * 3);
				}
			}
		}
		this.method3992();
	}

	@OriginalMember(owner = "client!jb", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface1 local9 = this.aClass57_Sub2_16.anInterface1_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4622; local11++) {
			if (this.aShortArray64[local11] == arg0) {
				this.aShortArray64[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class233 local53 = local9.method2863(arg0 & 0xFFFF);
			local41 = local53.aByte98;
			local39 = local53.aByte97;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(74) Class233 local74 = local9.method2863(arg1 & 0xFFFF);
			local61 = local74.aByte97;
			if (local74.aByte96 != 0 || local74.aByte93 != 0) {
				this.aBoolean364 = true;
			}
			local63 = local74.aByte98;
		}
		if (!(local41 != local63 | local39 != local61)) {
			return;
		}
		if (this.aClass329Array1 != null) {
			for (@Pc(119) int local119 = 0; local119 < this.anInt4609; local119++) {
				@Pc(126) Class329 local126 = this.aClass329Array1[local119];
				@Pc(131) Class235 local131 = this.aClass235Array1[local119];
				local131.anInt6348 = local131.anInt6348 & 0xFF000000 | Static560.anIntArray534[this.aShortArray67[local126.anInt9371] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass356_7 != null) {
			this.aClass356_7.anInterface15_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray32 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt4620; local13++) {
			this.anIntArray261[local13] <<= 0x4;
			this.anIntArray262[local13] <<= 0x4;
			this.anIntArray258[local13] <<= 0x4;
		}
		Static293.anInt5117 = 0;
		Static625.anInt10196 = 0;
		Static327.anInt5848 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean364;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	@Override
	protected void method9088() {
	}
}
