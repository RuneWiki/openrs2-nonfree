import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class75_Sub3 extends Class75 {

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "Lclient!lp;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!qfa", name = "D", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
	private int anInt7809;

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
	private int anInt7812;

	@OriginalMember(owner = "client!qfa", name = "L", descriptor = "I")
	private int anInt7816;

	@OriginalMember(owner = "client!qfa", name = "N", descriptor = "Lclient!te;")
	private Class320 aClass320_1;

	@OriginalMember(owner = "client!qfa", name = "P", descriptor = "I")
	private int anInt7818;

	@OriginalMember(owner = "client!qfa", name = "X", descriptor = "Z")
	private boolean aBoolean564;

	@OriginalMember(owner = "client!qfa", name = "Y", descriptor = "Lclient!lp;")
	private Class209 aClass209_2;

	@OriginalMember(owner = "client!qfa", name = "nb", descriptor = "Lclient!lp;")
	private Class209 aClass209_3;

	@OriginalMember(owner = "client!qfa", name = "rb", descriptor = "I")
	private int anInt7835;

	@OriginalMember(owner = "client!qfa", name = "vb", descriptor = "I")
	private int anInt7838;

	@OriginalMember(owner = "client!qfa", name = "Gb", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_19;

	@OriginalMember(owner = "client!qfa", name = "Qb", descriptor = "I")
	private int anInt7851;

	@OriginalMember(owner = "client!qfa", name = "Rb", descriptor = "Lclient!pk;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!qfa", name = "bc", descriptor = "I")
	private int anInt7859;

	@OriginalMember(owner = "client!qfa", name = "ec", descriptor = "Lclient!lp;")
	private Class209 aClass209_4;

	@OriginalMember(owner = "client!qfa", name = "kc", descriptor = "I")
	private int anInt7863;

	@OriginalMember(owner = "client!qfa", name = "uc", descriptor = "I")
	private int anInt7870;

	@OriginalMember(owner = "client!qfa", name = "Kc", descriptor = "I")
	private int anInt7880;

	@OriginalMember(owner = "client!qfa", name = "ib", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!qfa", name = "Cb", descriptor = "I")
	private int anInt7843;

	@OriginalMember(owner = "client!qfa", name = "kb", descriptor = "I")
	private int anInt7832;

	@OriginalMember(owner = "client!qfa", name = "wc", descriptor = "Z")
	private boolean aBoolean565;

	@OriginalMember(owner = "client!qfa", name = "Cc", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!qfa", name = "Z", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!qfa", name = "Jc", descriptor = "I")
	private int anInt7879;

	@OriginalMember(owner = "client!qfa", name = "Kb", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!qfa", name = "Fc", descriptor = "[I")
	private int[] anIntArray485;

	@OriginalMember(owner = "client!qfa", name = "fc", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!qfa", name = "Nb", descriptor = "I")
	private int anInt7850;

	@OriginalMember(owner = "client!qfa", name = "oc", descriptor = "[Lclient!mv;")
	private Class228[] aClass228Array4;

	@OriginalMember(owner = "client!qfa", name = "Ob", descriptor = "[Lclient!nba;")
	private Class232[] aClass232Array4;

	@OriginalMember(owner = "client!qfa", name = "U", descriptor = "I")
	private int anInt7821;

	@OriginalMember(owner = "client!qfa", name = "ic", descriptor = "[Lclient!cfa;")
	private Class48[] aClass48Array1;

	@OriginalMember(owner = "client!qfa", name = "Ib", descriptor = "[Lclient!ffa;")
	private Class106[] aClass106Array1;

	@OriginalMember(owner = "client!qfa", name = "R", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!qfa", name = "jc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qfa", name = "qb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!qfa", name = "Dc", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!qfa", name = "xc", descriptor = "[F")
	private float[] aFloatArray85;

	@OriginalMember(owner = "client!qfa", name = "Xb", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!qfa", name = "Fb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "[F")
	private float[] aFloatArray84;

	@OriginalMember(owner = "client!qfa", name = "gc", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!qfa", name = "Gc", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!qfa", name = "mc", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qfa", name = "xb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!qfa", name = "Lc", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!qfa", name = "Zb", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!qfa", name = "qc", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!qfa", name = "Pb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!qfa", name = "M", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!qfa", name = "pb", descriptor = "[I")
	private int[] anIntArray482;

	@OriginalMember(owner = "client!qfa", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!qfa", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qfa", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!rl;Lclient!vo;IIII)V")
	public Class75_Sub3(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface5 local11 = arg0.anInterface5_9;
		this.anIntArray481 = new int[arg1.anInt9825 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt9832];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt9832; local24++) {
			if (arg1.aByteArray104 == null || arg1.aByteArray104[local24] != 2) {
				if (arg1.aShortArray155 != null && arg1.aShortArray155[local24] != -1) {
					@Pc(57) Class355 local57 = local11.method4129(arg1.aShortArray155[local24] & 0xFFFF);
					if (((this.anInt7818 & 0x40) == 0 || !local57.aBoolean743) && local57.aBoolean742) {
						continue;
					}
				}
				local22[this.anInt7843++] = local24;
				this.anIntArray481[arg1.aShortArray156[local24]]++;
				this.anIntArray481[arg1.aShortArray149[local24]]++;
				this.anIntArray481[arg1.aShortArray150[local24]]++;
			}
		}
		this.anInt7832 = this.anInt7843;
		@Pc(130) long[] local130 = new long[this.anInt7843];
		@Pc(142) boolean local142 = (this.anInt7835 & 0x100) != 0;
		@Pc(154) int local154;
		@Pc(167) int local167;
		@Pc(328) int local328;
		for (@Pc(144) int local144 = 0; local144 < this.anInt7843; local144++) {
			@Pc(150) int local150 = local22[local144];
			@Pc(152) Class355 local152 = null;
			local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			@Pc(160) byte local160 = 0;
			if (arg1.aClass311Array1 != null) {
				@Pc(165) boolean local165 = false;
				for (local167 = 0; local167 < arg1.aClass311Array1.length; local167++) {
					@Pc(174) Class311 local174 = arg1.aClass311Array1[local167];
					if (local174.anInt8944 == local150) {
						@Pc(187) Class270 local187 = Static305.method5145(local174.anInt8942);
						if (local187.aBoolean548) {
							local165 = true;
						}
						if (local187.anInt7611 != -1) {
							@Pc(203) Class355 local203 = local11.method4129(local187.anInt7611);
							if (local203.anInt9790 == 2) {
								this.aBoolean565 = true;
							}
						}
					}
				}
				if (local165) {
					local130[local144] = Long.MAX_VALUE;
					this.anInt7832--;
					continue;
				}
			}
			@Pc(236) short local236 = -1;
			if (arg1.aShortArray155 != null) {
				local236 = arg1.aShortArray155[local150];
				if (local236 != -1) {
					local152 = local11.method4129(local236 & 0xFFFF);
					if ((this.anInt7818 & 0x40) != 0 && local152.aBoolean743) {
						local236 = -1;
						local152 = null;
					} else {
						local158 = local152.aByte119;
						local160 = local152.aByte120;
					}
				}
			}
			@Pc(290) boolean local290 = arg1.aByteArray99 != null && arg1.aByteArray99[local150] != 0 || local152 != null && local152.anInt9790 != 0;
			if ((local142 || local290) && arg1.aByteArray105 != null) {
				local154 += arg1.aByteArray105[local150] << 17;
			}
			if (local290) {
				local154 += 65536;
			}
			local154 += (local158 & 0xFF) << 8;
			local328 = local156 + ((local236 & 0xFFFF) << 16);
			local154 += local160 & 0xFF;
			@Pc(340) int local340 = local328 + (local144 & 0xFFFF);
			local130[local144] = ((long) local154 << 32) + ((long) local340);
			this.aBoolean565 |= local290;
			this.aBoolean566 |= local152 != null && (local152.aByte125 != 0 || local152.aByte122 != 0);
		}
		Static562.method7965(local22, local130);
		this.aShortArray98 = arg1.aShortArray151;
		this.anInt7879 = arg1.anInt9844;
		this.anIntArray483 = arg1.anIntArray625;
		this.anIntArray485 = arg1.anIntArray627;
		this.anIntArray484 = arg1.anIntArray632;
		this.anInt7850 = arg1.anInt9825;
		this.aClass228Array4 = arg1.aClass228Array5;
		this.aClass232Array4 = arg1.aClass232Array5;
		@Pc(425) Class370[] local425 = new Class370[this.anInt7850];
		@Pc(445) int local445;
		@Pc(459) int local459;
		@Pc(505) int local505;
		if (arg1.aClass311Array1 != null) {
			this.anInt7821 = arg1.aClass311Array1.length;
			this.aClass48Array1 = new Class48[this.anInt7821];
			this.aClass106Array1 = new Class106[this.anInt7821];
			for (local445 = 0; local445 < this.anInt7821; local445++) {
				@Pc(452) Class311 local452 = arg1.aClass311Array1[local445];
				@Pc(457) Class270 local457 = Static305.method5145(local452.anInt8942);
				local459 = -1;
				for (@Pc(461) int local461 = 0; local461 < this.anInt7843; local461++) {
					if (local22[local461] == local452.anInt8944) {
						local459 = local461;
						break;
					}
				}
				if (local459 == -1) {
					throw new RuntimeException();
				}
				local505 = Static205.anIntArray530[arg1.aShortArray148[local452.anInt8944] & 0xFFFF] & 0xFFFFFF;
				@Pc(523) int local523 = local505 | 255 - (arg1.aByteArray99 == null ? 0 : arg1.aByteArray99[local452.anInt8944]) << 24;
				this.aClass48Array1[local445] = new Class48(local459, arg1.aShortArray156[local452.anInt8944], arg1.aShortArray149[local452.anInt8944], arg1.aShortArray150[local452.anInt8944], local457.anInt7610, local457.anInt7609, local457.anInt7611, local457.anInt7601, local457.anInt7607, local457.aBoolean548, local457.aBoolean549, local452.anInt8939);
				this.aClass106Array1[local445] = new Class106(local523);
			}
		}
		local445 = this.anInt7843 * 3;
		this.aShortArray97 = new short[local445];
		this.aShortArray103 = new short[local445];
		this.aShortArray99 = new short[local445];
		this.aShortArray106 = new short[this.anInt7843];
		this.aFloatArray85 = new float[local445];
		this.aByteArray76 = new byte[local445];
		this.aShort90 = (short) arg3;
		this.aByteArray75 = new byte[this.anInt7843];
		Static417.aLongArray14 = new long[local445];
		this.aFloatArray84 = new float[local445];
		this.aShortArray102 = new short[local445];
		this.aShortArray107 = new short[local445];
		this.aShortArray96 = new short[this.anInt7843];
		this.aShortArray104 = new short[this.anInt7843];
		this.aShortArray100 = new short[this.anInt7843];
		this.aShortArray108 = new short[local445];
		this.aShort91 = (short) arg4;
		if (arg1.aShortArray153 != null) {
			this.aShortArray105 = new short[this.anInt7843];
		}
		this.aShortArray101 = new short[this.anInt7843];
		local154 = 0;
		for (local328 = 0; local328 < arg1.anInt9825; local328++) {
			local459 = this.anIntArray481[local328];
			this.anIntArray481[local328] = local154;
			local154 += local459;
			local425[local328] = new Class370();
		}
		this.anIntArray481[arg1.anInt9825] = local154;
		@Pc(713) Class144 local713 = Static24.method332(this.anInt7843, local22, arg1);
		@Pc(717) Class219[] local717 = new Class219[arg1.anInt9832];
		@Pc(757) int local757;
		@Pc(768) int local768;
		@Pc(779) int local779;
		@Pc(736) short local736;
		@Pc(747) int local747;
		for (local505 = 0; local505 < arg1.anInt9832; local505++) {
			@Pc(726) short local726 = arg1.aShortArray156[local505];
			@Pc(731) short local731 = arg1.aShortArray149[local505];
			local736 = arg1.aShortArray150[local505];
			local747 = this.anIntArray483[local731] - this.anIntArray483[local726];
			local757 = this.anIntArray484[local731] - this.anIntArray484[local726];
			local768 = this.anIntArray485[local731] - this.anIntArray485[local726];
			local779 = this.anIntArray483[local736] - this.anIntArray483[local726];
			@Pc(789) int local789 = this.anIntArray484[local736] - this.anIntArray484[local726];
			@Pc(800) int local800 = this.anIntArray485[local736] - this.anIntArray485[local726];
			@Pc(809) int local809 = local757 * local800 - local768 * local789;
			@Pc(818) int local818 = local768 * local779 - local747 * local800;
			@Pc(827) int local827;
			for (local827 = local747 * local789 - local757 * local779; local809 > 8192 || local818 > 8192 || local827 > 8192 || local809 < -8192 || local818 < -8192 || local827 < -8192; local827 >>= 0x1) {
				local818 >>= 0x1;
				local809 >>= 0x1;
			}
			@Pc(882) int local882 = (int) Math.sqrt((double) (local827 * local827 + local818 * local818 + local809 * local809));
			if (local882 <= 0) {
				local882 = 1;
			}
			local818 = local818 * 256 / local882;
			local827 = local827 * 256 / local882;
			local809 = local809 * 256 / local882;
			@Pc(917) byte local917 = arg1.aByteArray104 == null ? 0 : arg1.aByteArray104[local505];
			if (local917 == 0) {
				@Pc(948) Class370 local948 = local425[local726];
				local948.anInt9973++;
				local948.anInt9975 += local818;
				local948.anInt9976 += local809;
				local948.anInt9974 += local827;
				@Pc(976) Class370 local976 = local425[local731];
				local976.anInt9974 += local827;
				local976.anInt9976 += local809;
				local976.anInt9973++;
				local976.anInt9975 += local818;
				@Pc(1004) Class370 local1004 = local425[local736];
				local1004.anInt9974 += local827;
				local1004.anInt9973++;
				local1004.anInt9976 += local809;
				local1004.anInt9975 += local818;
			} else if (local917 == 1) {
				@Pc(933) Class219 local933 = local717[local505] = new Class219();
				local933.anInt6336 = local827;
				local933.anInt6334 = local809;
				local933.anInt6335 = local818;
			}
		}
		@Pc(1041) int local1041;
		@Pc(1084) short local1084;
		for (local167 = 0; local167 < this.anInt7843; local167++) {
			local1041 = local22[local167];
			@Pc(1048) int local1048 = arg1.aShortArray148[local1041] & 0xFFFF;
			if (arg1.aByteArray100 == null) {
				local747 = -1;
			} else {
				local747 = arg1.aByteArray100[local1041];
			}
			if (arg1.aByteArray99 == null) {
				local757 = 0;
			} else {
				local757 = arg1.aByteArray99[local1041] & 0xFF;
			}
			local1084 = arg1.aShortArray155 == null ? -1 : arg1.aShortArray155[local1041];
			if (local1084 != -1 && (this.anInt7818 & 0x40) != 0) {
				@Pc(1100) Class355 local1100 = local11.method4129(local1084 & 0xFFFF);
				if (local1100.aBoolean743) {
					local1084 = -1;
				}
			}
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) float local1109 = 0.0F;
			@Pc(1111) float local1111 = 0.0F;
			@Pc(1113) float local1113 = 0.0F;
			@Pc(1115) float local1115 = 0.0F;
			@Pc(1117) float local1117 = 0.0F;
			@Pc(1119) byte local1119 = 0;
			@Pc(1121) byte local1121 = 0;
			@Pc(1123) int local1123 = 0;
			@Pc(1140) byte local1140;
			@Pc(1157) short local1157;
			@Pc(1162) short local1162;
			@Pc(1167) short local1167;
			if (local1084 != -1) {
				if (local747 == -1) {
					local1115 = 0.0F;
					local1113 = 1.0F;
					local1111 = 1.0F;
					local1109 = 1.0F;
					local1107 = 0.0F;
					local1117 = 0.0F;
					local1121 = 2;
					local1119 = 1;
				} else {
					local747 &= 0xFF;
					local1140 = arg1.aByteArray103[local747];
					@Pc(1147) short local1147;
					@Pc(1152) short local1152;
					@Pc(1190) float local1190;
					@Pc(1198) float local1198;
					@Pc(1207) float local1207;
					@Pc(1289) float local1289;
					@Pc(1297) float local1297;
					@Pc(1305) float local1305;
					@Pc(1314) float local1314;
					@Pc(1323) float local1323;
					@Pc(1331) float local1331;
					if (local1140 == 0) {
						local1147 = arg1.aShortArray156[local1041];
						local1152 = arg1.aShortArray149[local1041];
						local1157 = arg1.aShortArray150[local1041];
						local1162 = arg1.aShortArray154[local747];
						local1167 = arg1.aShortArray147[local747];
						@Pc(1172) short local1172 = arg1.aShortArray152[local747];
						@Pc(1178) float local1178 = (float) arg1.anIntArray625[local1162];
						@Pc(1184) float local1184 = (float) arg1.anIntArray632[local1162];
						local1190 = (float) arg1.anIntArray627[local1162];
						local1198 = (float) arg1.anIntArray625[local1167] - local1178;
						local1207 = (float) arg1.anIntArray632[local1167] - local1184;
						@Pc(1215) float local1215 = (float) arg1.anIntArray627[local1167] - local1190;
						@Pc(1224) float local1224 = (float) arg1.anIntArray625[local1172] - local1178;
						@Pc(1232) float local1232 = (float) arg1.anIntArray632[local1172] - local1184;
						@Pc(1240) float local1240 = (float) arg1.anIntArray627[local1172] - local1190;
						@Pc(1249) float local1249 = (float) arg1.anIntArray625[local1147] - local1178;
						@Pc(1257) float local1257 = (float) arg1.anIntArray632[local1147] - local1184;
						@Pc(1265) float local1265 = (float) arg1.anIntArray627[local1147] - local1190;
						@Pc(1273) float local1273 = (float) arg1.anIntArray625[local1152] - local1178;
						@Pc(1281) float local1281 = (float) arg1.anIntArray632[local1152] - local1184;
						local1289 = (float) arg1.anIntArray627[local1152] - local1190;
						local1297 = (float) arg1.anIntArray625[local1157] - local1178;
						local1305 = (float) arg1.anIntArray632[local1157] - local1184;
						local1314 = (float) arg1.anIntArray627[local1157] - local1190;
						local1323 = local1207 * local1240 - local1232 * local1215;
						local1331 = local1215 * local1224 - local1240 * local1198;
						@Pc(1339) float local1339 = local1232 * local1198 - local1224 * local1207;
						@Pc(1347) float local1347 = local1232 * local1339 - local1331 * local1240;
						@Pc(1355) float local1355 = local1323 * local1240 - local1224 * local1339;
						@Pc(1364) float local1364 = local1331 * local1224 - local1232 * local1323;
						@Pc(1378) float local1378 = 1.0F / (local1355 * local1207 + local1347 * local1198 + local1215 * local1364);
						local1115 = local1378 * (local1314 * local1364 + local1355 * local1305 + local1297 * local1347);
						local1107 = local1378 * (local1257 * local1355 + local1347 * local1249 + local1265 * local1364);
						local1111 = (local1347 * local1273 + local1281 * local1355 + local1289 * local1364) * local1378;
						@Pc(1429) float local1429 = local1331 * local1198 - local1207 * local1323;
						@Pc(1438) float local1438 = local1207 * local1339 - local1331 * local1215;
						@Pc(1446) float local1446 = local1323 * local1215 - local1339 * local1198;
						@Pc(1460) float local1460 = 1.0F / (local1224 * local1438 + local1446 * local1232 + local1429 * local1240);
						local1109 = (local1265 * local1429 + local1257 * local1446 + local1249 * local1438) * local1460;
						local1117 = (local1429 * local1314 + local1446 * local1305 + local1438 * local1297) * local1460;
						local1113 = local1460 * (local1273 * local1438 + local1446 * local1281 + local1289 * local1429);
					} else {
						local1147 = arg1.aShortArray156[local1041];
						local1152 = arg1.aShortArray149[local1041];
						local1157 = arg1.aShortArray150[local1041];
						@Pc(1524) int local1524 = local713.anIntArray229[local747];
						@Pc(1529) int local1529 = local713.anIntArray227[local747];
						@Pc(1534) int local1534 = local713.anIntArray228[local747];
						@Pc(1539) float[] local1539 = local713.aFloatArrayArray7[local747];
						@Pc(1544) byte local1544 = arg1.aByteArray101[local747];
						local1190 = (float) arg1.anIntArray629[local747] / 256.0F;
						if (local1140 == 1) {
							local1198 = (float) arg1.anIntArray622[local747] / 1024.0F;
							Static240.method4049(arg1.anIntArray627[local1147], local1534, local1544, local1529, arg1.anIntArray632[local1147], Static417.aFloatArray78, local1190, local1539, local1198, local1524, arg1.anIntArray625[local1147]);
							local1109 = Static417.aFloatArray78[1];
							local1107 = Static417.aFloatArray78[0];
							Static240.method4049(arg1.anIntArray627[local1152], local1534, local1544, local1529, arg1.anIntArray632[local1152], Static417.aFloatArray78, local1190, local1539, local1198, local1524, arg1.anIntArray625[local1152]);
							local1111 = Static417.aFloatArray78[0];
							local1113 = Static417.aFloatArray78[1];
							Static240.method4049(arg1.anIntArray627[local1157], local1534, local1544, local1529, arg1.anIntArray632[local1157], Static417.aFloatArray78, local1190, local1539, local1198, local1524, arg1.anIntArray625[local1157]);
							local1117 = Static417.aFloatArray78[1];
							local1115 = Static417.aFloatArray78[0];
							local1207 = local1198 / 2.0F;
							if ((local1544 & 0x1) == 0) {
								if (local1115 - local1107 > local1207) {
									local1121 = 1;
									local1115 -= local1198;
								} else if (local1107 - local1115 > local1207) {
									local1115 += local1198;
									local1121 = 2;
								}
								if (local1207 < local1111 - local1107) {
									local1111 -= local1198;
									local1119 = 1;
								} else if (local1107 - local1111 > local1207) {
									local1119 = 2;
									local1111 += local1198;
								}
							} else {
								if (local1113 - local1109 > local1207) {
									local1119 = 1;
									local1113 -= local1198;
								} else if (local1207 < local1109 - local1113) {
									local1113 += local1198;
									local1119 = 2;
								}
								if (local1117 - local1109 > local1207) {
									local1121 = 1;
									local1117 -= local1198;
								} else if (local1109 - local1117 > local1207) {
									local1121 = 2;
									local1117 += local1198;
								}
							}
						} else if (local1140 == 2) {
							local1198 = (float) arg1.anIntArray626[local747] / 256.0F;
							local1207 = (float) arg1.anIntArray623[local747] / 256.0F;
							@Pc(2009) int local2009 = arg1.anIntArray625[local1152] - arg1.anIntArray625[local1147];
							@Pc(2019) int local2019 = arg1.anIntArray632[local1152] - arg1.anIntArray632[local1147];
							@Pc(2029) int local2029 = arg1.anIntArray627[local1152] - arg1.anIntArray627[local1147];
							@Pc(2040) int local2040 = arg1.anIntArray625[local1157] - arg1.anIntArray625[local1147];
							@Pc(2051) int local2051 = arg1.anIntArray632[local1157] - arg1.anIntArray632[local1147];
							@Pc(2062) int local2062 = arg1.anIntArray627[local1157] - arg1.anIntArray627[local1147];
							@Pc(2071) int local2071 = local2019 * local2062 - local2051 * local2029;
							@Pc(2080) int local2080 = local2029 * local2040 - local2062 * local2009;
							@Pc(2088) int local2088 = local2051 * local2009 - local2019 * local2040;
							local1289 = 64.0F / (float) arg1.anIntArray624[local747];
							local1297 = 64.0F / (float) arg1.anIntArray628[local747];
							local1305 = 64.0F / (float) arg1.anIntArray622[local747];
							local1314 = (local1539[1] * (float) local2080 + (float) local2071 * local1539[0] + (float) local2088 * local1539[2]) / local1289;
							local1323 = ((float) local2088 * local1539[5] + (float) local2080 * local1539[4] + (float) local2071 * local1539[3]) / local1297;
							local1331 = ((float) local2071 * local1539[6] + local1539[7] * (float) local2080 + local1539[8] * (float) local2088) / local1305;
							local1123 = Static528.method7684(local1314, local1323, local1331);
							Static542.method7796(local1190, arg1.anIntArray625[local1147], local1123, local1539, local1198, arg1.anIntArray632[local1147], local1207, local1544, local1534, local1529, local1524, Static417.aFloatArray78, arg1.anIntArray627[local1147]);
							local1109 = Static417.aFloatArray78[1];
							local1107 = Static417.aFloatArray78[0];
							Static542.method7796(local1190, arg1.anIntArray625[local1152], local1123, local1539, local1198, arg1.anIntArray632[local1152], local1207, local1544, local1534, local1529, local1524, Static417.aFloatArray78, arg1.anIntArray627[local1152]);
							local1111 = Static417.aFloatArray78[0];
							local1113 = Static417.aFloatArray78[1];
							Static542.method7796(local1190, arg1.anIntArray625[local1157], local1123, local1539, local1198, arg1.anIntArray632[local1157], local1207, local1544, local1534, local1529, local1524, Static417.aFloatArray78, arg1.anIntArray627[local1157]);
							local1115 = Static417.aFloatArray78[0];
							local1117 = Static417.aFloatArray78[1];
						} else if (local1140 == 3) {
							Static488.method7191(local1544, local1529, local1190, local1539, Static417.aFloatArray78, local1524, arg1.anIntArray627[local1147], arg1.anIntArray625[local1147], local1534, arg1.anIntArray632[local1147]);
							local1107 = Static417.aFloatArray78[0];
							local1109 = Static417.aFloatArray78[1];
							Static488.method7191(local1544, local1529, local1190, local1539, Static417.aFloatArray78, local1524, arg1.anIntArray627[local1152], arg1.anIntArray625[local1152], local1534, arg1.anIntArray632[local1152]);
							local1113 = Static417.aFloatArray78[1];
							local1111 = Static417.aFloatArray78[0];
							Static488.method7191(local1544, local1529, local1190, local1539, Static417.aFloatArray78, local1524, arg1.anIntArray627[local1157], arg1.anIntArray625[local1157], local1534, arg1.anIntArray632[local1157]);
							local1115 = Static417.aFloatArray78[0];
							local1117 = Static417.aFloatArray78[1];
							if ((local1544 & 0x1) == 0) {
								if (local1111 - local1107 > 0.5F) {
									local1111--;
									local1119 = 1;
								} else if (local1107 - local1111 > 0.5F) {
									local1119 = 2;
									local1111++;
								}
								if (local1115 - local1107 > 0.5F) {
									local1115--;
									local1121 = 1;
								} else if (local1107 - local1115 > 0.5F) {
									local1115++;
									local1121 = 2;
								}
							} else {
								if (local1113 - local1109 > 0.5F) {
									local1113--;
									local1119 = 1;
								} else if (local1109 - local1113 > 0.5F) {
									local1119 = 2;
									local1113++;
								}
								if (local1117 - local1109 > 0.5F) {
									local1117--;
									local1121 = 1;
								} else if (local1109 - local1117 > 0.5F) {
									local1117++;
									local1121 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray104 == null) {
				local1140 = 0;
			} else {
				local1140 = arg1.aByteArray104[local1041];
			}
			if (local1140 == 0) {
				@Pc(2467) long local2467 = (long) (local747 << 2) + ((long) local757 + (long) (local1048 << 8) + (long) (local1123 << 24) << 32);
				local1157 = arg1.aShortArray156[local1041];
				local1162 = arg1.aShortArray149[local1041];
				local1167 = arg1.aShortArray150[local1041];
				@Pc(2486) Class370 local2486 = local425[local1157];
				this.aShortArray96[local167] = this.method6813(local2486.anInt9973, local2486.anInt9975, local1157, local2486.anInt9974, arg1, local2467, local167, local1107, local2486.anInt9976, local1109);
				@Pc(2511) Class370 local2511 = local425[local1162];
				this.aShortArray104[local167] = this.method6813(local2511.anInt9973, local2511.anInt9975, local1162, local2511.anInt9974, arg1, local2467 + (long) local1119, local167, local1111, local2511.anInt9976, local1113);
				@Pc(2539) Class370 local2539 = local425[local1167];
				this.aShortArray106[local167] = this.method6813(local2539.anInt9973, local2539.anInt9975, local1167, local2539.anInt9974, arg1, (long) local1121 + local2467, local167, local1115, local2539.anInt9976, local1117);
			} else if (local1140 == 1) {
				@Pc(2325) Class219 local2325 = local717[local1041];
				@Pc(2370) long local2370 = ((long) (local1048 << 8) + (long) (local1123 << 24) + (long) local757 << 32) + (long) ((local2325.anInt6336 + 256 << 22) + (local2325.anInt6334 > 0 ? 1024 : 2048) + (local747 << 2) + (local2325.anInt6335 + 256 << 12));
				this.aShortArray96[local167] = this.method6813(0, local2325.anInt6335, arg1.aShortArray156[local1041], local2325.anInt6336, arg1, local2370, local167, local1107, local2325.anInt6334, local1109);
				this.aShortArray104[local167] = this.method6813(0, local2325.anInt6335, arg1.aShortArray149[local1041], local2325.anInt6336, arg1, (long) local1119 + local2370, local167, local1111, local2325.anInt6334, local1113);
				this.aShortArray106[local167] = this.method6813(0, local2325.anInt6335, arg1.aShortArray150[local1041], local2325.anInt6336, arg1, (long) local1121 + local2370, local167, local1115, local2325.anInt6334, local1117);
			}
			if (arg1.aByteArray99 != null) {
				this.aByteArray75[local167] = arg1.aByteArray99[local1041];
			}
			if (arg1.aShortArray153 != null) {
				this.aShortArray105[local167] = arg1.aShortArray153[local1041];
			}
			this.aShortArray100[local167] = arg1.aShortArray148[local1041];
			this.aShortArray101[local167] = local1084;
		}
		if (this.anInt7832 > 0) {
			local1041 = 1;
			local736 = this.aShortArray101[0];
			for (local747 = 0; local747 < this.anInt7832; local747++) {
				@Pc(2625) short local2625 = this.aShortArray101[local747];
				if (local736 != local2625) {
					local736 = local2625;
					local1041++;
				}
			}
			this.anIntArray479 = new int[local1041];
			this.anIntArray480 = new int[local1041 + 1];
			this.anIntArray482 = new int[local1041];
			this.anIntArray480[0] = 0;
			local757 = this.anInt7812;
			local736 = this.aShortArray101[0];
			local1084 = 0;
			local1041 = 0;
			for (local779 = 0; local779 < this.anInt7832; local779++) {
				@Pc(2680) short local2680 = this.aShortArray101[local779];
				if (local2680 != local736) {
					this.anIntArray479[local1041] = local757;
					this.anIntArray482[local1041] = local1084 + 1 - local757;
					local1041++;
					this.anIntArray480[local1041] = local779;
					local1084 = 0;
					local736 = local2680;
					local757 = this.anInt7812;
				}
				@Pc(2720) short local2720 = this.aShortArray96[local779];
				if (local757 > local2720) {
					local757 = local2720;
				}
				if (local2720 > local1084) {
					local1084 = local2720;
				}
				local2720 = this.aShortArray104[local779];
				if (local2720 > local1084) {
					local1084 = local2720;
				}
				if (local2720 < local757) {
					local757 = local2720;
				}
				local2720 = this.aShortArray106[local779];
				if (local757 > local2720) {
					local757 = local2720;
				}
				if (local1084 < local2720) {
					local1084 = local2720;
				}
			}
			this.anIntArray479[local1041] = local757;
			this.anIntArray482[local1041] = local1084 + 1 - local757;
			local1041++;
			this.anIntArray480[local1041] = this.anInt7832;
		}
		Static417.aLongArray14 = null;
		this.aShortArray108 = Static357.method5758(this.anInt7812, this.aShortArray108);
		this.aShortArray103 = Static357.method5758(this.anInt7812, this.aShortArray103);
		this.aShortArray99 = Static357.method5758(this.anInt7812, this.aShortArray99);
		this.aShortArray107 = Static357.method5758(this.anInt7812, this.aShortArray107);
		this.aShortArray102 = Static357.method5758(this.anInt7812, this.aShortArray102);
		this.aByteArray76 = Static104.method1725(this.aByteArray76, this.anInt7812);
		this.aFloatArray84 = Static422.method6657(this.aFloatArray84, this.anInt7812);
		this.aFloatArray85 = Static422.method6657(this.aFloatArray85, this.anInt7812);
		if (arg1.anIntArray630 != null && Static394.method6219(arg2, this.anInt7818)) {
			this.anIntArrayArray46 = arg1.method8355(false);
		}
		if (arg1.aClass311Array1 != null && Static222.method3857(this.anInt7818, arg2)) {
			this.anIntArrayArray45 = arg1.method8353();
		}
		if (arg1.anIntArray631 != null && Static101.method1700(this.anInt7818, arg2)) {
			local1041 = 0;
			@Pc(2904) int[] local2904 = new int[256];
			for (local747 = 0; local747 < this.anInt7843; local747++) {
				local757 = arg1.anIntArray631[local22[local747]];
				if (local757 >= 0) {
					@Pc(2924) int local2924 = local2904[local757]++;
					if (local757 > local1041) {
						local1041 = local757;
					}
				}
			}
			this.anIntArrayArray44 = new int[local1041 + 1][];
			for (local757 = 0; local757 <= local1041; local757++) {
				this.anIntArrayArray44[local757] = new int[local2904[local757]];
				local2904[local757] = 0;
			}
			for (local768 = 0; local768 < this.anInt7843; local768++) {
				local779 = arg1.anIntArray631[local22[local768]];
				if (local779 >= 0) {
					this.anIntArrayArray44[local779][local2904[local779]++] = local768;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!rl;IIZZ)V")
	public Class75_Sub3(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean562 = true;
		this.anInt7850 = 0;
		this.anInt7843 = 0;
		this.aBoolean565 = false;
		this.anInt7812 = 0;
		this.aBoolean566 = false;
		this.anInt7832 = 0;
		this.aBoolean564 = false;
		this.aBoolean563 = false;
		this.anInt7879 = 0;
		this.aBoolean564 = arg4;
		this.aClass82_Sub3_19 = arg0;
		this.anInt7818 = arg2;
		this.anInt7835 = arg1;
		if (arg3 || Static70.method1242(this.anInt7835, this.anInt7818)) {
			this.aClass209_1 = new Class209(Static282.method4597(this.anInt7835, this.anInt7818));
		}
		if (arg3 || Static585.method8123(this.anInt7818, this.anInt7835)) {
			this.aClass209_2 = new Class209(Static395.method6226(this.anInt7835, this.anInt7818));
		}
		if (arg3 || Static471.method6967(this.anInt7835, this.anInt7818)) {
			this.aClass209_4 = new Class209(Static354.method5710(this.anInt7818, this.anInt7835));
		}
		if (arg3 || Static411.method6900(this.anInt7818, this.anInt7835)) {
			this.aClass209_3 = new Class209(Static103.method1721(this.anInt7835, this.anInt7818));
		}
		if (arg3 || Static281.method4576(this.anInt7818, this.anInt7835)) {
			this.aClass269_1 = new Class269(Static610.method8361(this.anInt7818, this.anInt7835));
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!ih;ZI)Z")
	@Override
	public boolean method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6820(-1, arg2, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "()V")
	@Override
	protected void method6791() {
	}

	@OriginalMember(owner = "client!qfa", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort91 = (short) arg0;
		this.method6808();
		this.method6823();
	}

	@OriginalMember(owner = "client!qfa", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static282.anInt5418 = 0;
			Static330.anInt6252 = 0;
			local31 = 0;
			Static75.anInt1456 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray46.length > local41) {
					local51 = this.anIntArrayArray46[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local59]) != 0) {
							Static282.anInt5418 += this.anIntArray483[local59];
							Static75.anInt1456 += this.anIntArray484[local59];
							Static330.anInt6252 += this.anIntArray485[local59];
							local31++;
						}
					}
				}
			}
			if (local31 <= 0) {
				Static330.anInt6252 = arg4;
				Static75.anInt1456 = arg3;
				Static282.anInt5418 = arg2;
			} else {
				Static44.aBoolean35 = true;
				Static330.anInt6252 = arg4 + Static330.anInt6252 / local31;
				Static75.anInt1456 = Static75.anInt1456 / local31 + arg3;
				Static282.anInt5418 = arg2 + Static282.anInt5418 / local31;
			}
			return;
		}
		@Pc(242) int[] local242;
		@Pc(244) int local244;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg3 = local35;
				arg2 = local31;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray46.length > local35) {
					local242 = this.anIntArrayArray46[local35];
					for (local244 = 0; local244 < local242.length; local244++) {
						local53 = local242[local244];
						if (this.aShortArray98 == null || (this.aShortArray98[local53] & arg6) != 0) {
							this.anIntArray483[local53] += arg2;
							this.anIntArray484[local53] += arg3;
							this.anIntArray485[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(407) int local407;
		@Pc(637) int local637;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(659) int local659;
		@Pc(677) int local677;
		@Pc(1008) int local1008;
		@Pc(1016) int local1016;
		@Pc(1171) int local1171;
		@Pc(1198) int local1198;
		@Pc(1202) int local1202;
		@Pc(1211) int local1211;
		@Pc(1216) int local1216;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1226) int local1226;
		@Pc(1356) int[] local1356;
		@Pc(1358) int local1358;
		@Pc(1362) int local1362;
		@Pc(1366) int local1366;
		@Pc(1368) int local1368;
		@Pc(1500) int local1500;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray46.length > local35) {
						local242 = this.anIntArrayArray46[local35];
						for (local244 = 0; local244 < local242.length; local244++) {
							local53 = local242[local244];
							if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local53]) != 0) {
								this.anIntArray483[local53] -= Static282.anInt5418;
								this.anIntArray484[local53] -= Static75.anInt1456;
								this.anIntArray485[local53] -= Static330.anInt6252;
								if (arg4 != 0) {
									local59 = Class3_Sub13.anIntArray147[arg4];
									local389 = Class3_Sub13.anIntArray146[arg4];
									local407 = this.anIntArray484[local53] * local59 + local389 * this.anIntArray483[local53] + 16383 >> 14;
									this.anIntArray484[local53] = this.anIntArray484[local53] * local389 + 16383 - local59 * this.anIntArray483[local53] >> 14;
									this.anIntArray483[local53] = local407;
								}
								if (arg2 != 0) {
									local59 = Class3_Sub13.anIntArray147[arg2];
									local389 = Class3_Sub13.anIntArray146[arg2];
									local407 = local389 * this.anIntArray484[local53] + 16383 - local59 * this.anIntArray485[local53] >> 14;
									this.anIntArray485[local53] = this.anIntArray485[local53] * local389 + local59 * this.anIntArray484[local53] + 16383 >> 14;
									this.anIntArray484[local53] = local407;
								}
								if (arg3 != 0) {
									local59 = Class3_Sub13.anIntArray147[arg3];
									local389 = Class3_Sub13.anIntArray146[arg3];
									local407 = local389 * this.anIntArray483[local53] + local59 * this.anIntArray485[local53] + 16383 >> 14;
									this.anIntArray485[local53] = local389 * this.anIntArray485[local53] + 16383 - local59 * this.anIntArray483[local53] >> 14;
									this.anIntArray483[local53] = local407;
								}
								this.anIntArray483[local53] += Static282.anInt5418;
								this.anIntArray484[local53] += Static75.anInt1456;
								this.anIntArray485[local53] += Static330.anInt6252;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray46.length) {
							local51 = this.anIntArrayArray46[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local59]) != 0) {
									local389 = this.anIntArray481[local59];
									local407 = this.anIntArray481[local59 + 1];
									for (local637 = local389; local637 < local407; local637++) {
										local646 = this.aShortArray97[local637] - 1;
										if (local646 == -1) {
											break;
										}
										if (arg4 != 0) {
											local655 = Class3_Sub13.anIntArray147[arg4];
											local659 = Class3_Sub13.anIntArray146[arg4];
											local677 = this.aShortArray99[local646] * local659 + local655 * this.aShortArray107[local646] + 16383 >> 14;
											this.aShortArray107[local646] = (short) (this.aShortArray107[local646] * local659 + 16383 - local655 * this.aShortArray99[local646] >> 14);
											this.aShortArray99[local646] = (short) local677;
										}
										if (arg2 != 0) {
											local655 = Class3_Sub13.anIntArray147[arg2];
											local659 = Class3_Sub13.anIntArray146[arg2];
											local677 = this.aShortArray107[local646] * local659 + 16383 - this.aShortArray102[local646] * local655 >> 14;
											this.aShortArray102[local646] = (short) (local659 * this.aShortArray102[local646] + this.aShortArray107[local646] * local655 + 16383 >> 14);
											this.aShortArray107[local646] = (short) local677;
										}
										if (arg3 != 0) {
											local655 = Class3_Sub13.anIntArray147[arg3];
											local659 = Class3_Sub13.anIntArray146[arg3];
											local677 = local655 * this.aShortArray102[local646] + local659 * this.aShortArray99[local646] + 16383 >> 14;
											this.aShortArray102[local646] = (short) (local659 * this.aShortArray102[local646] + 16383 - local655 * this.aShortArray99[local646] >> 14);
											this.aShortArray99[local646] = (short) local677;
										}
									}
								}
							}
						}
					}
					this.method6823();
					return;
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local244 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static44.aBoolean35) {
					local389 = arg7[3] * Static75.anInt1456 + Static282.anInt5418 * arg7[0] + Static330.anInt6252 * arg7[6] + 8192 >> 14;
					local407 = arg7[7] * Static330.anInt6252 + arg7[1] * Static282.anInt5418 + Static75.anInt1456 * arg7[4] + 8192 >> 14;
					local637 = Static282.anInt5418 * arg7[2] + Static75.anInt1456 * arg7[5] + arg7[8] * Static330.anInt6252 + 8192 >> 14;
					local407 += local53;
					local389 += local244;
					Static75.anInt1456 = local407;
					Static282.anInt5418 = local389;
					local637 += local59;
					Static330.anInt6252 = local637;
					Static44.aBoolean35 = false;
				}
				@Pc(976) int[] local976 = new int[9];
				local407 = Class3_Sub13.anIntArray146[arg2];
				local637 = Class3_Sub13.anIntArray147[arg2];
				local646 = Class3_Sub13.anIntArray146[arg3];
				local655 = Class3_Sub13.anIntArray147[arg3];
				local659 = Class3_Sub13.anIntArray146[arg4];
				local677 = Class3_Sub13.anIntArray147[arg4];
				local1008 = local637 * local659 + 8192 >> 14;
				local1016 = local637 * local677 + 8192 >> 14;
				local976[2] = local407 * local655 + 8192 >> 14;
				local976[0] = local659 * local646 + local655 * local1016 + 8192 >> 14;
				local976[4] = local407 * local659 + 8192 >> 14;
				local976[6] = local659 * -local655 + local1016 * local646 + 8192 >> 14;
				local976[7] = local677 * local655 + local1008 * local646 + 8192 >> 14;
				local976[3] = local407 * local677 + 8192 >> 14;
				local976[5] = -local637;
				local976[8] = local407 * local646 + 8192 >> 14;
				local976[1] = local677 * -local646 + local655 * local1008 + 8192 >> 14;
				@Pc(1146) int local1146 = -Static282.anInt5418 * local976[0] + -Static75.anInt1456 * local976[1] + -Static330.anInt6252 * local976[2] + 8192 >> 14;
				local1171 = local976[5] * -Static330.anInt6252 + -Static75.anInt1456 * local976[4] + local976[3] * -Static282.anInt5418 + 8192 >> 14;
				local1198 = -Static282.anInt5418 * local976[6] + -Static75.anInt1456 * local976[7] + local976[8] * -Static330.anInt6252 + 8192 >> 14;
				local1202 = local1146 + Static282.anInt5418;
				@Pc(1207) int local1207 = local1171 + Static75.anInt1456;
				local1211 = Static330.anInt6252 + local1198;
				@Pc(1214) int[] local1214 = new int[9];
				for (local1216 = 0; local1216 < 3; local1216++) {
					for (local1220 = 0; local1220 < 3; local1220++) {
						local1224 = 0;
						for (local1226 = 0; local1226 < 3; local1226++) {
							local1224 += local976[local1216 * 3 + local1226] * arg7[local1226 + local1220 * 3];
						}
						local1214[local1216 * 3 + local1220] = local1224 + 8192 >> 14;
					}
				}
				local1220 = local976[0] * local244 + local53 * local976[1] + local976[2] * local59 + 8192 >> 14;
				local1224 = local976[5] * local59 + local244 * local976[3] + local976[4] * local53 + 8192 >> 14;
				local1224 += local1207;
				local1220 += local1202;
				local1226 = local976[8] * local59 + local976[6] * local244 + local976[7] * local53 + 8192 >> 14;
				local1226 += local1211;
				local1356 = new int[9];
				for (local1358 = 0; local1358 < 3; local1358++) {
					for (local1362 = 0; local1362 < 3; local1362++) {
						local1366 = 0;
						for (local1368 = 0; local1368 < 3; local1368++) {
							local1366 += local1214[local1368 * 3 + local1362] * arg7[local1358 * 3 + local1368];
						}
						local1356[local1362 + local1358 * 3] = local1366 + 8192 >> 14;
					}
				}
				local1362 = arg7[0] * local1220 + local1224 * arg7[1] + local1226 * arg7[2] + 8192 >> 14;
				local1366 = arg7[5] * local1226 + arg7[3] * local1220 + arg7[4] * local1224 + 8192 >> 14;
				local1368 = arg7[7] * local1224 + local1220 * arg7[6] + local1226 * arg7[8] + 8192 >> 14;
				local1366 += local35;
				local1362 += local31;
				local1368 += local41;
				for (local1500 = 0; local1500 < local8; local1500++) {
					@Pc(1506) int local1506 = arg1[local1500];
					if (local1506 < this.anIntArrayArray46.length) {
						@Pc(1516) int[] local1516 = this.anIntArrayArray46[local1506];
						for (@Pc(1518) int local1518 = 0; local1518 < local1516.length; local1518++) {
							@Pc(1524) int local1524 = local1516[local1518];
							if (this.aShortArray98 == null || (this.aShortArray98[local1524] & arg6) != 0) {
								@Pc(1565) int local1565 = this.anIntArray485[local1524] * local1356[2] + local1356[0] * this.anIntArray483[local1524] + this.anIntArray484[local1524] * local1356[1] + 8192 >> 14;
								@Pc(1597) int local1597 = this.anIntArray485[local1524] * local1356[5] + local1356[3] * this.anIntArray483[local1524] + local1356[4] * this.anIntArray484[local1524] + 8192 >> 14;
								@Pc(1601) int local1601 = local1565 + local1362;
								@Pc(1632) int local1632 = this.anIntArray485[local1524] * local1356[8] + local1356[6] * this.anIntArray483[local1524] + this.anIntArray484[local1524] * local1356[7] + 8192 >> 14;
								@Pc(1636) int local1636 = local1597 + local1366;
								@Pc(1640) int local1640 = local1632 + local1368;
								this.anIntArray483[local1524] = local1601;
								this.anIntArray484[local1524] = local1636;
								this.anIntArray485[local1524] = local1640;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2562) Class106 local2562;
			@Pc(2455) boolean local2455;
			@Pc(2557) Class48 local2557;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local2455 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray44.length > local41) {
							local51 = this.anIntArrayArray44[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray105 == null || (this.aShortArray105[local59] & arg6) != 0) {
									local389 = (this.aByteArray75[local59] & 0xFF) + (arg2 * 8);
									if (local389 < 0) {
										local389 = 0;
									} else if (local389 > 255) {
										local389 = 255;
									}
									this.aByteArray75[local59] = (byte) local389;
								}
							}
							local2455 |= local51.length > 0;
						}
					}
					if (local2455) {
						if (this.aClass48Array1 != null) {
							for (local41 = 0; local41 < this.anInt7821; local41++) {
								local2557 = this.aClass48Array1[local41];
								local2562 = this.aClass106Array1[local41];
								local2562.anInt3042 = 255 - (this.aByteArray75[local2557.anInt1330] & 0xFF) << 24 | local2562.anInt3042 & 0xFFFFFF;
							}
						}
						this.method6824();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local2455 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local51 = this.anIntArrayArray44[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray105 == null || (arg6 & this.aShortArray105[local59]) != 0) {
									local389 = this.aShortArray100[local59] & 0xFFFF;
									local407 = local389 >> 10 & 0x3F;
									local637 = local389 >> 7 & 0x7;
									@Pc(2663) int local2663 = local407 + arg2 & 0x3F;
									local646 = local389 & 0x7F;
									local637 += arg3 / 4;
									local646 += arg4;
									if (local637 < 0) {
										local637 = 0;
									} else if (local637 > 7) {
										local637 = 7;
									}
									if (local646 < 0) {
										local646 = 0;
									} else if (local646 > 127) {
										local646 = 127;
									}
									this.aShortArray100[local59] = (short) (local637 << 7 | local2663 << 10 | local646);
								}
							}
							local2455 |= local51.length > 0;
						}
					}
					if (local2455) {
						if (this.aClass48Array1 != null) {
							for (local41 = 0; local41 < this.anInt7821; local41++) {
								local2557 = this.aClass48Array1[local41];
								local2562 = this.aClass106Array1[local41];
								local2562.anInt3042 = Static205.anIntArray530[this.aShortArray100[local2557.anInt1330] & 0xFFFF] & 0xFFFFFF | local2562.anInt3042 & 0xFF000000;
							}
						}
						this.method6824();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray45.length > local35) {
							local242 = this.anIntArrayArray45[local35];
							for (local244 = 0; local244 < local242.length; local244++) {
								local2562 = this.aClass106Array1[local242[local244]];
								local2562.anInt3036 += arg2;
								local2562.anInt3037 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray45.length > local35) {
							local242 = this.anIntArrayArray45[local35];
							for (local244 = 0; local244 < local242.length; local244++) {
								local2562 = this.aClass106Array1[local242[local244]];
								local2562.anInt3038 = local2562.anInt3038 * arg2 >> 7;
								local2562.anInt3041 = arg3 * local2562.anInt3041 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray45.length > local35) {
						local242 = this.anIntArrayArray45[local35];
						for (local244 = 0; local244 < local242.length; local244++) {
							local2562 = this.aClass106Array1[local242[local244]];
							local2562.anInt3040 = local2562.anInt3040 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray46.length > local35) {
					local242 = this.anIntArrayArray46[local35];
					for (local244 = 0; local244 < local242.length; local244++) {
						local53 = local242[local244];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local53]) != 0) {
							this.anIntArray483[local53] -= Static282.anInt5418;
							this.anIntArray484[local53] -= Static75.anInt1456;
							this.anIntArray485[local53] -= Static330.anInt6252;
							this.anIntArray483[local53] = arg2 * this.anIntArray483[local53] >> 7;
							this.anIntArray484[local53] = arg3 * this.anIntArray484[local53] >> 7;
							this.anIntArray485[local53] = this.anIntArray485[local53] * arg4 >> 7;
							this.anIntArray483[local53] += Static282.anInt5418;
							this.anIntArray484[local53] += Static75.anInt1456;
							this.anIntArray485[local53] += Static330.anInt6252;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local244 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static44.aBoolean35) {
				local389 = Static282.anInt5418 * arg7[0] + Static75.anInt1456 * arg7[3] + Static330.anInt6252 * arg7[6] + 8192 >> 14;
				local407 = arg7[7] * Static330.anInt6252 + Static75.anInt1456 * arg7[4] + Static282.anInt5418 * arg7[1] + 8192 >> 14;
				local389 += local244;
				local407 += local53;
				local637 = Static75.anInt1456 * arg7[5] + Static282.anInt5418 * arg7[2] + arg7[8] * Static330.anInt6252 + 8192 >> 14;
				local637 += local59;
				Static282.anInt5418 = local389;
				Static75.anInt1456 = local407;
				Static44.aBoolean35 = false;
				Static330.anInt6252 = local637;
			}
			local389 = arg2 << 15 >> 7;
			local407 = arg3 << 15 >> 7;
			local637 = arg4 << 15 >> 7;
			local646 = local389 * -Static282.anInt5418 + 8192 >> 14;
			local655 = -Static75.anInt1456 * local407 + 8192 >> 14;
			local659 = -Static330.anInt6252 * local637 + 8192 >> 14;
			local677 = Static282.anInt5418 + local646;
			local1008 = local655 + Static75.anInt1456;
			local1016 = Static330.anInt6252 + local659;
			@Pc(1990) int[] local1990 = new int[] { local389 * arg7[0] + 8192 >> 14, local389 * arg7[3] + 8192 >> 14, local389 * arg7[6] + 8192 >> 14, local407 * arg7[1] + 8192 >> 14, arg7[4] * local407 + 8192 >> 14, local407 * arg7[7] + 8192 >> 14, local637 * arg7[2] + 8192 >> 14, arg7[5] * local637 + 8192 >> 14, local637 * arg7[8] + 8192 >> 14 };
			local1171 = local244 * local389 + 8192 >> 14;
			local1198 = local53 * local407 + 8192 >> 14;
			local1202 = local637 * local59 + 8192 >> 14;
			@Pc(2126) int local2126 = local1171 + local677;
			@Pc(2130) int local2130 = local1198 + local1008;
			@Pc(2134) int local2134 = local1202 + local1016;
			@Pc(2137) int[] local2137 = new int[9];
			@Pc(2143) int local2143;
			for (local1211 = 0; local1211 < 3; local1211++) {
				for (local2143 = 0; local2143 < 3; local2143++) {
					local1216 = 0;
					for (local1220 = 0; local1220 < 3; local1220++) {
						local1216 += arg7[local1211 * 3 + local1220] * local1990[local2143 + local1220 * 3];
					}
					local2137[local2143 + local1211 * 3] = local1216 + 8192 >> 14;
				}
			}
			local2143 = arg7[2] * local2134 + local2130 * arg7[1] + local2126 * arg7[0] + 8192 >> 14;
			local1216 = arg7[4] * local2130 + local2126 * arg7[3] + arg7[5] * local2134 + 8192 >> 14;
			local1216 += local35;
			local1220 = local2130 * arg7[7] + arg7[6] * local2126 + local2134 * arg7[8] + 8192 >> 14;
			local2143 += local31;
			local1220 += local41;
			for (local1224 = 0; local1224 < local8; local1224++) {
				local1226 = arg1[local1224];
				if (local1226 < this.anIntArrayArray46.length) {
					local1356 = this.anIntArrayArray46[local1226];
					for (local1358 = 0; local1358 < local1356.length; local1358++) {
						local1362 = local1356[local1358];
						if (this.aShortArray98 == null || (this.aShortArray98[local1362] & arg6) != 0) {
							local1366 = this.anIntArray485[local1362] * local2137[2] + this.anIntArray483[local1362] * local2137[0] + local2137[1] * this.anIntArray484[local1362] + 8192 >> 14;
							local1368 = local2137[5] * this.anIntArray485[local1362] + this.anIntArray484[local1362] * local2137[4] + this.anIntArray483[local1362] * local2137[3] + 8192 >> 14;
							local1500 = this.anIntArray485[local1362] * local2137[8] + this.anIntArray484[local1362] * local2137[7] + local2137[6] * this.anIntArray483[local1362] + 8192 >> 14;
							@Pc(2410) int local2410 = local1366 + local2143;
							@Pc(2414) int local2414 = local1368 + local1216;
							@Pc(2418) int local2418 = local1500 + local1220;
							this.anIntArray483[local1362] = local2410;
							this.anIntArray484[local1362] = local2414;
							this.anIntArray485[local1362] = local2418;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort90;
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "()[Lclient!mv;")
	@Override
	public Class228[] method6794() {
		return this.aClass228Array4;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	private void method6808() {
		if (this.aClass209_1 != null) {
			this.aClass209_1.aBoolean458 = false;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
	private void method6809() {
		if (this.aClass269_1 != null) {
			this.aClass269_1.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7835;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ih;IZ)V")
	@Override
	public void method6798(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray98 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7850; local14++) {
			if ((arg1 & this.aShortArray98[local14]) != 0) {
				if (arg2) {
					arg0.method7929(this.anIntArray483[local14], this.anIntArray484[local14], this.anIntArray485[local14], local12);
				} else {
					arg0.method7920(this.anIntArray483[local14], this.anIntArray484[local14], this.anIntArray485[local14], local12);
				}
				this.anIntArray483[local14] = local12[0];
				this.anIntArray484[local14] = local12[1];
				this.anIntArray485[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method6797(@OriginalArg(0) Class31 arg0) {
		@Pc(8) Class31_Sub2 local8 = (Class31_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass228Array4 != null) {
			for (local13 = 0; local13 < this.aClass228Array4.length; local13++) {
				@Pc(20) Class228 local20 = this.aClass228Array4[local13];
				@Pc(22) Class228 local22 = local20;
				if (local20.aClass228_2 != null) {
					local22 = local20.aClass228_2;
				}
				local22.anInt6684 = (int) (local8.aFloat174 * (float) this.anIntArray483[local20.anInt6691] + (float) this.anIntArray484[local20.anInt6691] * local8.aFloat171 + local8.aFloat175 * (float) this.anIntArray485[local20.anInt6691] + local8.aFloat177);
				local22.anInt6696 = (int) (local8.aFloat178 * (float) this.anIntArray485[local20.anInt6691] + (float) this.anIntArray483[local20.anInt6691] * local8.aFloat169 + local8.aFloat167 * (float) this.anIntArray484[local20.anInt6691] + local8.aFloat170);
				local22.anInt6686 = (int) ((float) this.anIntArray483[local20.anInt6691] * local8.aFloat173 + local8.aFloat176 * (float) this.anIntArray484[local20.anInt6691] + (float) this.anIntArray485[local20.anInt6691] * local8.aFloat168 + local8.aFloat172);
				local22.anInt6690 = (int) (local8.aFloat174 * (float) this.anIntArray483[local20.anInt6698] + (float) this.anIntArray484[local20.anInt6698] * local8.aFloat171 + (float) this.anIntArray485[local20.anInt6698] * local8.aFloat175 + local8.aFloat177);
				local22.anInt6694 = (int) (local8.aFloat170 + (float) this.anIntArray483[local20.anInt6698] * local8.aFloat169 + local8.aFloat167 * (float) this.anIntArray484[local20.anInt6698] + local8.aFloat178 * (float) this.anIntArray485[local20.anInt6698]);
				local22.anInt6700 = (int) (local8.aFloat168 * (float) this.anIntArray485[local20.anInt6698] + local8.aFloat176 * (float) this.anIntArray484[local20.anInt6698] + local8.aFloat173 * (float) this.anIntArray483[local20.anInt6698] + local8.aFloat172);
				local22.anInt6693 = (int) ((float) this.anIntArray484[local20.anInt6685] * local8.aFloat171 + (float) this.anIntArray483[local20.anInt6685] * local8.aFloat174 + (float) this.anIntArray485[local20.anInt6685] * local8.aFloat175 + local8.aFloat177);
				local22.anInt6699 = (int) ((float) this.anIntArray485[local20.anInt6685] * local8.aFloat178 + (float) this.anIntArray484[local20.anInt6685] * local8.aFloat167 + local8.aFloat169 * (float) this.anIntArray483[local20.anInt6685] + local8.aFloat170);
				local22.anInt6687 = (int) (local8.aFloat172 + (float) this.anIntArray485[local20.anInt6685] * local8.aFloat168 + (float) this.anIntArray484[local20.anInt6685] * local8.aFloat176 + local8.aFloat173 * (float) this.anIntArray483[local20.anInt6685]);
			}
		}
		if (this.aClass232Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass232Array4.length; local13++) {
			@Pc(365) Class232 local365 = this.aClass232Array4[local13];
			@Pc(367) Class232 local367 = local365;
			if (local365.aClass232_2 != null) {
				local367 = local365.aClass232_2;
			}
			if (local365.aClass31_26 == null) {
				local365.aClass31_26 = local8.method7931();
			} else {
				local365.aClass31_26.method7934(local8);
			}
			local367.anInt6733 = (int) ((float) this.anIntArray483[local365.anInt6734] * local8.aFloat174 + local8.aFloat171 * (float) this.anIntArray484[local365.anInt6734] + (float) this.anIntArray485[local365.anInt6734] * local8.aFloat175 + local8.aFloat177);
			local367.anInt6729 = (int) (local8.aFloat170 + local8.aFloat178 * (float) this.anIntArray485[local365.anInt6734] + local8.aFloat169 * (float) this.anIntArray483[local365.anInt6734] + local8.aFloat167 * (float) this.anIntArray484[local365.anInt6734]);
			local367.anInt6731 = (int) (local8.aFloat172 + (float) this.anIntArray485[local365.anInt6734] * local8.aFloat168 + (float) this.anIntArray483[local365.anInt6734] * local8.aFloat173 + (float) this.anIntArray484[local365.anInt6734] * local8.aFloat176);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean566;
	}

	@OriginalMember(owner = "client!qfa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7816;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!oca;B)V")
	private void method6811(@OriginalArg(0) Class3_Sub7_Sub17_Sub1 arg0) {
		if (Static33.anIntArray39.length < this.anInt7812) {
			Static33.anIntArray39 = new int[this.anInt7812];
			Static639.anIntArray662 = new int[this.anInt7812];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7850; local20++) {
			local47 = (this.anIntArray483[local20] - (this.aClass82_Sub3_19.anInt5841 * this.anIntArray484[local20] >> 8) >> this.aClass82_Sub3_19.anInt5857) - arg0.anInt7076;
			@Pc(72) int local72 = (this.anIntArray485[local20] - (this.anIntArray484[local20] * this.aClass82_Sub3_19.anInt5840 >> 8) >> this.aClass82_Sub3_19.anInt5857) - arg0.anInt7084;
			@Pc(77) int local77 = this.anIntArray481[local20];
			@Pc(84) int local84 = this.anIntArray481[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray97[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static33.anIntArray39[local95] = local47;
				Static639.anIntArray662[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt7832; local47++) {
			if (this.aByteArray75 == null || this.aByteArray75[local47] <= 128) {
				@Pc(142) short local142 = this.aShortArray96[local47];
				@Pc(147) short local147 = this.aShortArray104[local47];
				@Pc(152) short local152 = this.aShortArray106[local47];
				local86 = Static33.anIntArray39[local142];
				local95 = Static33.anIntArray39[local147];
				@Pc(164) int local164 = Static33.anIntArray39[local152];
				@Pc(168) int local168 = Static639.anIntArray662[local142];
				@Pc(172) int local172 = Static639.anIntArray662[local147];
				@Pc(176) int local176 = Static639.anIntArray662[local152];
				if ((local172 - local176) * (local86 - local95) - (local164 - local95) * (local172 - local168) > 0) {
					arg0.method6245(local176, local172, local168, local95, local86, local164);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7838;
	}

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7850; local7++) {
			this.anIntArray485[local7] = -this.anIntArray485[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7812; local29++) {
			this.aShortArray102[local29] = (short) -this.aShortArray102[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7843; local48++) {
			@Pc(55) short local55 = this.aShortArray96[local48];
			this.aShortArray96[local48] = this.aShortArray106[local48];
			this.aShortArray106[local48] = local55;
		}
		this.method6808();
		this.method6823();
		this.method6809();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZZLclient!qfa;ZILclient!qfa;)Lclient!ka;")
	private Class75 method6812(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class75_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75_Sub3 arg4) {
		arg2.anInt7821 = this.anInt7821;
		arg2.anInt7879 = this.anInt7879;
		arg2.anInt7843 = this.anInt7843;
		arg2.aShort91 = this.aShort91;
		arg2.anInt7850 = this.anInt7850;
		arg2.anInt7835 = arg3;
		arg2.anInt7818 = this.anInt7818;
		arg2.aBoolean566 = this.aBoolean566;
		arg2.anInt7832 = this.anInt7832;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean565 = this.aBoolean565;
		} else {
			arg2.aBoolean565 = true;
		}
		arg2.anInt7812 = this.anInt7812;
		arg2.aShort90 = this.aShort90;
		@Pc(75) boolean local75 = Static619.method8432(arg3, this.anInt7818);
		@Pc(81) boolean local81 = Static270.method4507(this.anInt7818, arg3);
		@Pc(87) boolean local87 = Static27.method374(this.anInt7818, arg3);
		@Pc(93) boolean local93 = local75 | local81 | local87;
		@Pc(204) int local204;
		if (local93) {
			if (!local75) {
				arg2.anIntArray483 = this.anIntArray483;
			} else if (arg4.anIntArray483 == null || arg4.anIntArray483.length < this.anInt7879) {
				arg2.anIntArray483 = arg4.anIntArray483 = new int[this.anInt7879];
			} else {
				arg2.anIntArray483 = arg4.anIntArray483;
			}
			if (!local81) {
				arg2.anIntArray484 = this.anIntArray484;
			} else if (arg4.anIntArray484 == null || this.anInt7879 > arg4.anIntArray484.length) {
				arg2.anIntArray484 = arg4.anIntArray484 = new int[this.anInt7879];
			} else {
				arg2.anIntArray484 = arg4.anIntArray484;
			}
			if (!local87) {
				arg2.anIntArray485 = this.anIntArray485;
			} else if (arg4.anIntArray485 == null || arg4.anIntArray485.length < this.anInt7879) {
				arg2.anIntArray485 = arg4.anIntArray485 = new int[this.anInt7879];
			} else {
				arg2.anIntArray485 = arg4.anIntArray485;
			}
			for (local204 = 0; local204 < this.anInt7879; local204++) {
				if (local75) {
					arg2.anIntArray483[local204] = this.anIntArray483[local204];
				}
				if (local81) {
					arg2.anIntArray484[local204] = this.anIntArray484[local204];
				}
				if (local87) {
					arg2.anIntArray485[local204] = this.anIntArray485[local204];
				}
			}
		} else {
			arg2.anIntArray484 = this.anIntArray484;
			arg2.anIntArray485 = this.anIntArray485;
			arg2.anIntArray483 = this.anIntArray483;
		}
		if (Static282.method4597(arg3, this.anInt7818)) {
			arg2.aClass209_1 = arg4.aClass209_1;
			arg2.aClass209_1.aBoolean459 = true;
			arg2.aClass209_1.anInterface22_16 = this.aClass209_1.anInterface22_16;
			arg2.aClass209_1.aBoolean458 = this.aClass209_1.aBoolean458;
		} else if (Static70.method1242(arg3, this.anInt7818)) {
			arg2.aClass209_1 = this.aClass209_1;
		} else {
			arg2.aClass209_1 = null;
		}
		if (Static595.method8233(this.anInt7818, arg3)) {
			if (arg4.aShortArray100 == null || arg4.aShortArray100.length < this.anInt7843) {
				arg2.aShortArray100 = arg4.aShortArray100 = new short[this.anInt7843];
			} else {
				arg2.aShortArray100 = arg4.aShortArray100;
			}
			for (local204 = 0; local204 < this.anInt7843; local204++) {
				arg2.aShortArray100[local204] = this.aShortArray100[local204];
			}
		} else {
			arg2.aShortArray100 = this.aShortArray100;
		}
		if (Static403.method6304(arg3, this.anInt7818)) {
			if (arg4.aByteArray75 == null || this.anInt7843 > arg4.aByteArray75.length) {
				arg2.aByteArray75 = arg4.aByteArray75 = new byte[this.anInt7843];
			} else {
				arg2.aByteArray75 = arg4.aByteArray75;
			}
			for (local204 = 0; local204 < this.anInt7843; local204++) {
				arg2.aByteArray75[local204] = this.aByteArray75[local204];
			}
		} else {
			arg2.aByteArray75 = this.aByteArray75;
		}
		if (Static354.method5710(this.anInt7818, arg3)) {
			arg2.aClass209_4 = arg4.aClass209_4;
			arg2.aClass209_4.aBoolean458 = this.aClass209_4.aBoolean458;
			arg2.aClass209_4.anInterface22_16 = this.aClass209_4.anInterface22_16;
			arg2.aClass209_4.aBoolean459 = true;
		} else if (Static471.method6967(arg3, this.anInt7818)) {
			arg2.aClass209_4 = this.aClass209_4;
		} else {
			arg2.aClass209_4 = null;
		}
		@Pc(533) int local533;
		if (Static270.method4505(this.anInt7818, arg3)) {
			if (arg4.aShortArray99 == null || this.anInt7812 > arg4.aShortArray99.length) {
				local204 = this.anInt7812;
				arg2.aShortArray102 = arg4.aShortArray102 = new short[local204];
				arg2.aShortArray99 = arg4.aShortArray99 = new short[local204];
				arg2.aShortArray107 = arg4.aShortArray107 = new short[local204];
			} else {
				arg2.aShortArray107 = arg4.aShortArray107;
				arg2.aShortArray102 = arg4.aShortArray102;
				arg2.aShortArray99 = arg4.aShortArray99;
			}
			if (this.aClass320_1 == null) {
				arg2.aClass320_1 = null;
				for (local204 = 0; local204 < this.anInt7812; local204++) {
					arg2.aShortArray99[local204] = this.aShortArray99[local204];
					arg2.aShortArray107[local204] = this.aShortArray107[local204];
					arg2.aShortArray102[local204] = this.aShortArray102[local204];
				}
			} else {
				if (arg4.aClass320_1 == null) {
					arg4.aClass320_1 = new Class320();
				}
				@Pc(517) Class320 local517 = arg2.aClass320_1 = arg4.aClass320_1;
				if (local517.aShortArray130 == null || this.anInt7812 > local517.aShortArray130.length) {
					local533 = this.anInt7812;
					local517.aShortArray132 = new short[local533];
					local517.aShortArray130 = new short[local533];
					local517.aByteArray91 = new byte[local533];
					local517.aShortArray131 = new short[local533];
				}
				for (local533 = 0; local533 < this.anInt7812; local533++) {
					arg2.aShortArray99[local533] = this.aShortArray99[local533];
					arg2.aShortArray107[local533] = this.aShortArray107[local533];
					arg2.aShortArray102[local533] = this.aShortArray102[local533];
					local517.aShortArray130[local533] = this.aClass320_1.aShortArray130[local533];
					local517.aShortArray132[local533] = this.aClass320_1.aShortArray132[local533];
					local517.aShortArray131[local533] = this.aClass320_1.aShortArray131[local533];
					local517.aByteArray91[local533] = this.aClass320_1.aByteArray91[local533];
				}
			}
			arg2.aByteArray76 = this.aByteArray76;
		} else {
			arg2.aByteArray76 = this.aByteArray76;
			arg2.aClass320_1 = this.aClass320_1;
			arg2.aShortArray107 = this.aShortArray107;
			arg2.aShortArray99 = this.aShortArray99;
			arg2.aShortArray102 = this.aShortArray102;
		}
		if (Static103.method1721(arg3, this.anInt7818)) {
			arg2.aClass209_3 = arg4.aClass209_3;
			arg2.aClass209_3.anInterface22_16 = this.aClass209_3.anInterface22_16;
			arg2.aClass209_3.aBoolean458 = this.aClass209_3.aBoolean458;
			arg2.aClass209_3.aBoolean459 = true;
		} else if (Static411.method6900(this.anInt7818, arg3)) {
			arg2.aClass209_3 = this.aClass209_3;
		} else {
			arg2.aClass209_3 = null;
		}
		if (Static311.method5228(arg3, this.anInt7818)) {
			if (arg4.aFloatArray84 == null || arg4.aFloatArray84.length < this.anInt7843) {
				local204 = this.anInt7812;
				arg2.aFloatArray85 = arg4.aFloatArray85 = new float[local204];
				arg2.aFloatArray84 = arg4.aFloatArray84 = new float[local204];
			} else {
				arg2.aFloatArray85 = arg4.aFloatArray85;
				arg2.aFloatArray84 = arg4.aFloatArray84;
			}
			for (local204 = 0; local204 < this.anInt7812; local204++) {
				arg2.aFloatArray84[local204] = this.aFloatArray84[local204];
				arg2.aFloatArray85[local204] = this.aFloatArray85[local204];
			}
		} else {
			arg2.aFloatArray84 = this.aFloatArray84;
			arg2.aFloatArray85 = this.aFloatArray85;
		}
		if (Static395.method6226(arg3, this.anInt7818)) {
			arg2.aClass209_2 = arg4.aClass209_2;
			arg2.aClass209_2.aBoolean459 = true;
			arg2.aClass209_2.anInterface22_16 = this.aClass209_2.anInterface22_16;
			arg2.aClass209_2.aBoolean458 = this.aClass209_2.aBoolean458;
		} else if (Static585.method8123(this.anInt7818, arg3)) {
			arg2.aClass209_2 = this.aClass209_2;
		} else {
			arg2.aClass209_2 = null;
		}
		if (Static221.method8615(arg3, this.anInt7818)) {
			if (arg4.aShortArray96 == null || arg4.aShortArray96.length < this.anInt7843) {
				local204 = this.anInt7843;
				arg2.aShortArray106 = arg4.aShortArray106 = new short[local204];
				arg2.aShortArray104 = arg4.aShortArray104 = new short[local204];
				arg2.aShortArray96 = arg4.aShortArray96 = new short[local204];
			} else {
				arg2.aShortArray106 = arg4.aShortArray106;
				arg2.aShortArray104 = arg4.aShortArray104;
				arg2.aShortArray96 = arg4.aShortArray96;
			}
			for (local204 = 0; local204 < this.anInt7843; local204++) {
				arg2.aShortArray96[local204] = this.aShortArray96[local204];
				arg2.aShortArray104[local204] = this.aShortArray104[local204];
				arg2.aShortArray106[local204] = this.aShortArray106[local204];
			}
		} else {
			arg2.aShortArray104 = this.aShortArray104;
			arg2.aShortArray106 = this.aShortArray106;
			arg2.aShortArray96 = this.aShortArray96;
		}
		if (Static610.method8361(this.anInt7818, arg3)) {
			arg2.aClass269_1 = arg4.aClass269_1;
			arg2.aClass269_1.anInterface12_8 = this.aClass269_1.anInterface12_8;
			arg2.aClass269_1.aBoolean546 = this.aClass269_1.aBoolean546;
			arg2.aClass269_1.aBoolean547 = true;
		} else if (Static281.method4576(this.anInt7818, arg3)) {
			arg2.aClass269_1 = this.aClass269_1;
		} else {
			arg2.aClass269_1 = null;
		}
		if (Static7.method111(this.anInt7818, arg3)) {
			if (arg4.aShortArray101 == null || this.anInt7843 > arg4.aShortArray101.length) {
				local204 = this.anInt7843;
				arg2.aShortArray101 = arg4.aShortArray101 = new short[local204];
			} else {
				arg2.aShortArray101 = arg4.aShortArray101;
			}
			for (local204 = 0; local204 < this.anInt7843; local204++) {
				arg2.aShortArray101[local204] = this.aShortArray101[local204];
			}
		} else {
			arg2.aShortArray101 = this.aShortArray101;
		}
		if (!Static551.method7857(arg3, this.anInt7818)) {
			arg2.aClass106Array1 = this.aClass106Array1;
		} else if (arg4.aClass106Array1 == null || arg4.aClass106Array1.length < this.anInt7821) {
			local204 = this.anInt7821;
			arg2.aClass106Array1 = arg4.aClass106Array1 = new Class106[local204];
			for (local533 = 0; local533 < this.anInt7821; local533++) {
				arg2.aClass106Array1[local533] = this.aClass106Array1[local533].method2582();
			}
		} else {
			arg2.aClass106Array1 = arg4.aClass106Array1;
			for (local204 = 0; local204 < this.anInt7821; local204++) {
				arg2.aClass106Array1[local204].method2581(this.aClass106Array1[local204]);
			}
		}
		arg2.anIntArray480 = this.anIntArray480;
		arg2.anIntArray479 = this.anIntArray479;
		arg2.aShortArray105 = this.aShortArray105;
		arg2.anIntArray481 = this.anIntArray481;
		arg2.anIntArrayArray44 = this.anIntArrayArray44;
		arg2.aShortArray108 = this.aShortArray108;
		arg2.aShortArray97 = this.aShortArray97;
		arg2.aClass48Array1 = this.aClass48Array1;
		arg2.aShortArray98 = this.aShortArray98;
		arg2.aShortArray103 = this.aShortArray103;
		arg2.anIntArrayArray45 = this.anIntArrayArray45;
		arg2.anIntArrayArray46 = this.anIntArrayArray46;
		arg2.aClass228Array4 = this.aClass228Array4;
		arg2.aClass232Array4 = this.aClass232Array4;
		if (this.aBoolean563) {
			arg2.anInt7859 = this.anInt7859;
			arg2.anInt7838 = this.anInt7838;
			arg2.anInt7851 = this.anInt7851;
			arg2.aBoolean563 = true;
			arg2.anInt7816 = this.anInt7816;
			arg2.anInt7870 = this.anInt7870;
			arg2.anInt7880 = this.anInt7880;
			arg2.anInt7809 = this.anInt7809;
			arg2.anInt7863 = this.anInt7863;
		} else {
			arg2.aBoolean563 = false;
		}
		arg2.anIntArray482 = this.anIntArray482;
		return arg2;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIILclient!vo;JIFIF)S")
	private short method6813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class359 arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray481[arg2];
		@Pc(17) int local17 = this.anIntArray481[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray97[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static417.aLongArray14[local21] == arg5) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray97[local19] = (short) (this.anInt7812 + 1);
		Static417.aLongArray14[local19] = arg5;
		this.aShortArray103[this.anInt7812] = (short) arg6;
		this.aShortArray108[this.anInt7812] = (short) arg2;
		this.aShortArray99[this.anInt7812] = (short) arg8;
		this.aShortArray107[this.anInt7812] = (short) arg1;
		this.aShortArray102[this.anInt7812] = (short) arg3;
		this.aByteArray76[this.anInt7812] = (byte) arg0;
		this.aFloatArray84[this.anInt7812] = arg7;
		this.aFloatArray85[this.anInt7812] = arg9;
		return (short) this.anInt7812++;
	}

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass209_1 != null) {
			this.aClass209_1.aBoolean459 = Static282.method4597(arg0, this.anInt7818);
		}
		if (this.aClass209_2 != null) {
			this.aClass209_2.aBoolean459 = Static395.method6226(arg0, this.anInt7818);
		}
		if (this.aClass209_4 != null) {
			this.aClass209_4.aBoolean459 = Static354.method5710(this.anInt7818, arg0);
		}
		if (this.aClass209_3 != null) {
			this.aClass209_3.aBoolean459 = Static103.method1721(arg0, this.anInt7818);
		}
		this.anInt7835 = arg0;
		this.aBoolean562 = true;
		if (this.aClass320_1 != null && (this.anInt7835 & 0x10000) == 0) {
			this.aShortArray102 = this.aClass320_1.aShortArray131;
			this.aByteArray76 = this.aClass320_1.aByteArray91;
			this.aShortArray99 = this.aClass320_1.aShortArray130;
			this.aShortArray107 = this.aClass320_1.aShortArray132;
			this.aClass320_1 = null;
		}
		this.method6821();
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "()[Lclient!nba;")
	@Override
	public Class232[] method6801() {
		return this.aClass232Array4;
	}

	@OriginalMember(owner = "client!qfa", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7870;
	}

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7850; local15++) {
			local33 = this.anIntArray485[local15] * local9 + this.anIntArray483[local15] * local13 >> 14;
			this.anIntArray485[local15] = local13 * this.anIntArray485[local15] - local9 * this.anIntArray483[local15] >> 14;
			this.anIntArray483[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7812; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray99[local33] + this.aShortArray102[local33] * local9 >> 14;
			this.aShortArray102[local33] = (short) (this.aShortArray102[local33] * local13 - this.aShortArray99[local33] * local9 >> 14);
			this.aShortArray99[local33] = (short) local87;
		}
		this.method6808();
		this.method6823();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7879; local3++) {
			this.anIntArray483[local3] = this.anIntArray483[local3] + 7 >> 4;
			this.anIntArray484[local3] = this.anIntArray484[local3] + 7 >> 4;
			this.anIntArray485[local3] = this.anIntArray485[local3] + 7 >> 4;
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7850; local7++) {
			if (arg0 != 128) {
				this.anIntArray483[local7] = arg0 * this.anIntArray483[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray484[local7] = arg1 * this.anIntArray484[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray485[local7] = this.anIntArray485[local7] * arg2 >> 7;
			}
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIZIIIII)Z")
	private boolean method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg6 && arg3 > arg4 && arg4 < arg5) {
			return false;
		} else if (arg4 > arg6 && arg4 > arg3 && arg4 > arg5) {
			return false;
		} else if (arg2 > arg7 && arg1 > arg7 && arg0 > arg7) {
			return false;
		} else {
			return arg7 <= arg2 || arg7 <= arg1 || arg7 <= arg0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	private void method6816() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7850; local23++) {
			@Pc(38) int local38 = this.anIntArray483[local23];
			@Pc(43) int local43 = this.anIntArray484[local23];
			if (local7 > local38) {
				local7 = local38;
			}
			if (local43 > local15) {
				local15 = local43;
			}
			if (local9 > local43) {
				local9 = local43;
			}
			if (local13 < local38) {
				local13 = local38;
			}
			@Pc(80) int local80 = this.anIntArray485[local23];
			if (local80 < local11) {
				local11 = local80;
			}
			if (local80 > local17) {
				local17 = local80;
			}
			@Pc(98) int local98 = local80 * local80 + local38 * local38;
			if (local19 < local98) {
				local19 = local98;
			}
			local98 = local43 * local43 + local80 * local80 + local38 * local38;
			if (local21 < local98) {
				local21 = local98;
			}
		}
		this.anInt7880 = local9;
		this.anInt7809 = local13;
		this.anInt7859 = local17;
		this.anInt7838 = local15;
		this.anInt7851 = local11;
		this.anInt7870 = local7;
		this.anInt7816 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt7863 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean563 = true;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ih;Lclient!kia;II)V")
	@Override
	public void method6788(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7812 == 0) {
			return;
		}
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_19.aClass31_Sub2_16;
		@Pc(16) Class31_Sub2 local16 = (Class31_Sub2) arg0;
		if (!this.aBoolean563) {
			this.method6816();
		}
		Static635.aFloat198 = local13.aFloat172 + local16.aFloat177 * local13.aFloat173 + local13.aFloat176 * local16.aFloat170 + local13.aFloat168 * local16.aFloat172;
		Static192.aFloat76 = local13.aFloat168 * local16.aFloat176 + local16.aFloat167 * local13.aFloat176 + local13.aFloat173 * local16.aFloat171;
		@Pc(69) float local69 = Static192.aFloat76 * (float) this.anInt7880 + Static635.aFloat198;
		@Pc(77) float local77 = Static635.aFloat198 + Static192.aFloat76 * (float) this.anInt7838;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local93 = local69 + (float) this.anInt7816;
			local87 = (float) -this.anInt7816 + local77;
		} else {
			local87 = local69 - (float) this.anInt7816;
			local93 = (float) this.anInt7816 + local77;
		}
		if (this.aClass82_Sub3_19.aFloat127 <= local87 || (float) this.aClass82_Sub3_19.anInt5828 >= local93) {
			return;
		}
		Static309.aFloat139 = local16.aFloat176 * local13.aFloat175 + local16.aFloat171 * local13.aFloat174 + local13.aFloat171 * local16.aFloat167;
		Static172.aFloat73 = local13.aFloat177 + local16.aFloat177 * local13.aFloat174 + local13.aFloat171 * local16.aFloat170 + local16.aFloat172 * local13.aFloat175;
		@Pc(170) float local170 = Static172.aFloat73 + Static309.aFloat139 * (float) this.anInt7880;
		@Pc(178) float local178 = Static172.aFloat73 + Static309.aFloat139 * (float) this.anInt7838;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = ((float) this.anInt7816 + local170) * (float) this.aClass82_Sub3_19.anInt5835;
			local205 = ((float) -this.anInt7816 + local178) * (float) this.aClass82_Sub3_19.anInt5835;
		} else {
			local193 = ((float) this.anInt7816 + local178) * (float) this.aClass82_Sub3_19.anInt5835;
			local205 = (local170 - (float) this.anInt7816) * (float) this.aClass82_Sub3_19.anInt5835;
		}
		if (local205 / (float) arg2 >= this.aClass82_Sub3_19.aFloat125 || local193 / (float) arg2 <= this.aClass82_Sub3_19.aFloat133) {
			return;
		}
		Static641.aFloat199 = local16.aFloat176 * local13.aFloat178 + local16.aFloat167 * local13.aFloat167 + local13.aFloat169 * local16.aFloat171;
		Static329.aFloat141 = local13.aFloat170 + local13.aFloat178 * local16.aFloat172 + local13.aFloat167 * local16.aFloat170 + local13.aFloat169 * local16.aFloat177;
		@Pc(296) float local296 = Static329.aFloat141 + (float) this.anInt7880 * Static641.aFloat199;
		@Pc(304) float local304 = Static329.aFloat141 + Static641.aFloat199 * (float) this.anInt7838;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = ((float) this.anInt7816 + local296) * (float) this.aClass82_Sub3_19.anInt5847;
			local331 = ((float) -this.anInt7816 + local304) * (float) this.aClass82_Sub3_19.anInt5847;
		} else {
			local319 = ((float) this.anInt7816 + local304) * (float) this.aClass82_Sub3_19.anInt5847;
			local331 = (float) this.aClass82_Sub3_19.anInt5847 * ((float) -this.anInt7816 + local296);
		}
		if (this.aClass82_Sub3_19.aFloat128 <= local331 / (float) arg2 || this.aClass82_Sub3_19.aFloat134 >= local319 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass48Array1 != null) {
			Static170.aFloat72 = local16.aFloat169 * local13.aFloat167 + local13.aFloat169 * local16.aFloat174 + local13.aFloat178 * local16.aFloat173;
			Static206.aFloat80 = local16.aFloat173 * local13.aFloat175 + local13.aFloat171 * local16.aFloat169 + local16.aFloat174 * local13.aFloat174;
			Static381.aFloat146 = local13.aFloat175 * local16.aFloat168 + local13.aFloat174 * local16.aFloat175 + local16.aFloat178 * local13.aFloat171;
			Static607.aFloat195 = local13.aFloat167 * local16.aFloat178 + local13.aFloat169 * local16.aFloat175 + local13.aFloat178 * local16.aFloat168;
			Static6.aFloat1 = local13.aFloat168 * local16.aFloat168 + local13.aFloat173 * local16.aFloat175 + local16.aFloat178 * local13.aFloat176;
			Static229.aFloat118 = local13.aFloat173 * local16.aFloat174 + local16.aFloat169 * local13.aFloat176 + local13.aFloat168 * local16.aFloat173;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt7809 + this.anInt7870 >> 1;
			@Pc(508) int local508 = this.anInt7851 + this.anInt7859 >> 1;
			@Pc(527) int local527 = (int) (Static381.aFloat146 * (float) local508 + Static206.aFloat80 * (float) local499 + Static172.aFloat73 + (float) this.anInt7880 * Static309.aFloat139);
			@Pc(546) int local546 = (int) (Static607.aFloat195 * (float) local508 + (float) this.anInt7880 * Static641.aFloat199 + (float) local499 * Static170.aFloat72 + Static329.aFloat141);
			@Pc(565) int local565 = (int) (Static229.aFloat118 * (float) local499 + Static635.aFloat198 + Static192.aFloat76 * (float) this.anInt7880 + Static6.aFloat1 * (float) local508);
			@Pc(584) int local584 = (int) ((float) this.anInt7838 * Static309.aFloat139 + (float) local499 * Static206.aFloat80 + Static172.aFloat73 + (float) local508 * Static381.aFloat146);
			@Pc(603) int local603 = (int) (Static607.aFloat195 * (float) local508 + Static170.aFloat72 * (float) local499 + Static329.aFloat141 + Static641.aFloat199 * (float) this.anInt7838);
			@Pc(622) int local622 = (int) ((float) local508 * Static6.aFloat1 + Static635.aFloat198 + (float) local499 * Static229.aFloat118 + (float) this.anInt7838 * Static192.aFloat76);
			arg1.anInt5911 = this.aClass82_Sub3_19.anInt5842 + this.aClass82_Sub3_19.anInt5847 * local603 / arg2;
			arg1.anInt5909 = local546 * this.aClass82_Sub3_19.anInt5847 / arg2 + this.aClass82_Sub3_19.anInt5842;
			arg1.anInt5910 = this.aClass82_Sub3_19.anInt5839 + local527 * this.aClass82_Sub3_19.anInt5835 / arg2;
			arg1.anInt5912 = this.aClass82_Sub3_19.anInt5835 * local584 / arg2 + this.aClass82_Sub3_19.anInt5839;
			if (local565 >= this.aClass82_Sub3_19.anInt5828 || local622 >= this.aClass82_Sub3_19.anInt5828) {
				arg1.aBoolean433 = true;
				arg1.anInt5913 = this.aClass82_Sub3_19.anInt5839 + this.aClass82_Sub3_19.anInt5835 * (this.anInt7816 + local527) / arg2 - arg1.anInt5910;
			}
		}
		this.aClass82_Sub3_19.method5019((float) arg2);
		this.aClass82_Sub3_19.method5020();
		this.aClass82_Sub3_19.method4965(local16);
		this.method6826();
		this.method6819();
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(I)V")
	public void method6817() {
		if (this.aClass209_1 != null) {
			this.aClass209_1.method5403();
		}
		if (this.aClass209_2 != null) {
			this.aClass209_2.method5403();
		}
		if (this.aClass209_4 != null) {
			this.aClass209_4.method5403();
		}
		if (this.aClass209_3 != null) {
			this.aClass209_3.method5403();
		}
		if (this.aClass269_1 != null) {
			this.aClass269_1.method6619();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7809;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)Z")
	private boolean method6818() {
		@Pc(13) boolean local13 = !this.aClass209_4.aBoolean458;
		@Pc(29) boolean local29 = (this.anInt7818 & 0x37) != 0 && !this.aClass209_3.aBoolean458;
		@Pc(37) boolean local37 = !this.aClass209_1.aBoolean458;
		@Pc(45) boolean local45 = !this.aClass209_2.aBoolean458;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(76) Interface22 local76;
		@Pc(90) Buffer local90;
		if (local37) {
			if (this.aClass209_1.anInterface22_17 == null) {
				this.aClass209_1.anInterface22_17 = this.aClass82_Sub3_19.method4925(this.aBoolean564);
			}
			local76 = this.aClass209_1.anInterface22_17;
			local76.method1387(12, this.anInt7812 * 12);
			local90 = local76.method1389();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass82_Sub3_19.aNativeInterface3.copyPositions(this.anIntArray483, this.anIntArray484, this.anIntArray485, this.aShortArray108, 0, 12, this.anInt7812, local90.getAddress());
				if (local76.method1390()) {
					this.aClass209_1.aBoolean458 = true;
					this.aClass209_1.anInterface22_16 = local76;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(210) short[] local210;
		@Pc(207) short[] local207;
		@Pc(216) short[] local216;
		@Pc(213) byte[] local213;
		if (local13) {
			if (this.aClass209_4.anInterface22_17 == null) {
				this.aClass209_4.anInterface22_17 = this.aClass82_Sub3_19.method4925(this.aBoolean564);
			}
			local76 = this.aClass209_4.anInterface22_17;
			local76.method1387(4, this.anInt7812 * 4);
			local90 = local76.method1389();
			if (local90 == null) {
				local57 = false;
			} else {
				if ((this.anInt7818 & 0x37) == 0) {
					if (this.aClass320_1 == null) {
						local207 = this.aShortArray107;
						local210 = this.aShortArray99;
						local213 = this.aByteArray76;
						local216 = this.aShortArray102;
					} else {
						local207 = this.aClass320_1.aShortArray132;
						local210 = this.aClass320_1.aShortArray130;
						local213 = this.aClass320_1.aByteArray91;
						local216 = this.aClass320_1.aShortArray131;
					}
					this.aClass82_Sub3_19.aNativeInterface3.copyLighting(this.aShortArray100, this.aByteArray75, this.aShortArray101, local210, local207, local216, local213, this.aShort90, this.aShort91, this.aShortArray103, 0, 4, this.anInt7812, local90.getAddress());
				} else {
					this.aClass82_Sub3_19.aNativeInterface3.copyColours(this.aShortArray100, this.aByteArray75, this.aShortArray101, this.aShort90, this.aShortArray103, 0, 4, this.anInt7812, local90.getAddress());
				}
				if (local76.method1390()) {
					this.aClass209_4.anInterface22_16 = local76;
					this.aClass209_4.aBoolean458 = true;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass209_3.anInterface22_17 == null) {
				this.aClass209_3.anInterface22_17 = this.aClass82_Sub3_19.method4925(this.aBoolean564);
			}
			local76 = this.aClass209_3.anInterface22_17;
			local76.method1387(12, this.anInt7812 * 12);
			local90 = local76.method1389();
			if (local90 == null) {
				local57 = false;
			} else {
				if (this.aClass320_1 == null) {
					local210 = this.aShortArray99;
					local207 = this.aShortArray107;
					local216 = this.aShortArray102;
					local213 = this.aByteArray76;
				} else {
					local216 = this.aClass320_1.aShortArray131;
					local207 = this.aClass320_1.aShortArray132;
					local213 = this.aClass320_1.aByteArray91;
					local210 = this.aClass320_1.aShortArray130;
				}
				this.aClass82_Sub3_19.aNativeInterface3.copyNormals(local210, local207, local216, local213, 3.0F / (float) this.aShort91, 3.0F / (float) (this.aShort91 / 2 + this.aShort91), 0, 12, this.anInt7812, local90.getAddress());
				if (local76.method1390()) {
					this.aClass209_3.aBoolean458 = true;
					this.aClass209_3.anInterface22_16 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass209_2.anInterface22_17 == null) {
				this.aClass209_2.anInterface22_17 = this.aClass82_Sub3_19.method4925(this.aBoolean564);
			}
			local76 = this.aClass209_2.anInterface22_17;
			local76.method1387(8, this.anInt7812 * 8);
			local90 = local76.method1389();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass82_Sub3_19.aNativeInterface3.copyTexCoords(this.aFloatArray84, this.aFloatArray85, 0, 8, this.anInt7812, local90.getAddress());
				if (local76.method1390()) {
					this.aClass209_2.anInterface22_16 = local76;
					this.aClass209_2.aBoolean458 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!qfa", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean565;
	}

	@OriginalMember(owner = "client!qfa", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0) {
		if (this.anInt7812 == 0) {
			return null;
		}
		if (!this.aBoolean563) {
			this.method6816();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass82_Sub3_19.anInt5841 > 0) {
			local43 = this.anInt7870 - (this.aClass82_Sub3_19.anInt5841 * this.anInt7838 >> 8) >> this.aClass82_Sub3_19.anInt5857;
			local60 = this.anInt7809 - (this.anInt7880 * this.aClass82_Sub3_19.anInt5841 >> 8) >> this.aClass82_Sub3_19.anInt5857;
		} else {
			local43 = this.anInt7870 - (this.aClass82_Sub3_19.anInt5841 * this.anInt7880 >> 8) >> this.aClass82_Sub3_19.anInt5857;
			local60 = this.anInt7809 - (this.aClass82_Sub3_19.anInt5841 * this.anInt7838 >> 8) >> this.aClass82_Sub3_19.anInt5857;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass82_Sub3_19.anInt5840 <= 0) {
			local117 = this.anInt7851 - (this.anInt7880 * this.aClass82_Sub3_19.anInt5840 >> 8) >> this.aClass82_Sub3_19.anInt5857;
			local134 = this.anInt7859 - (this.anInt7838 * this.aClass82_Sub3_19.anInt5840 >> 8) >> this.aClass82_Sub3_19.anInt5857;
		} else {
			local117 = this.anInt7851 - (this.aClass82_Sub3_19.anInt5840 * this.anInt7838 >> 8) >> this.aClass82_Sub3_19.anInt5857;
			local134 = this.anInt7859 - (this.aClass82_Sub3_19.anInt5840 * this.anInt7880 >> 8) >> this.aClass82_Sub3_19.anInt5857;
		}
		@Pc(177) int local177 = local60 + 1 - local43;
		@Pc(183) int local183 = local134 + 1 - local117;
		@Pc(186) Class3_Sub7_Sub17_Sub1 local186 = (Class3_Sub7_Sub17_Sub1) arg0;
		@Pc(202) Class3_Sub7_Sub17_Sub1 local202;
		if (local186 != null && local186.method6243(local177, local183)) {
			local202 = local186;
			local186.method6247();
		} else {
			local202 = new Class3_Sub7_Sub17_Sub1(this.aClass82_Sub3_19, local177, local183);
		}
		local202.method6244(local134, local117, local43, local60);
		this.method6811(local202);
		return local202;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "()V")
	@Override
	protected void method6784() {
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(I)V")
	private void method6819() {
		if (this.aClass48Array1 == null) {
			return;
		}
		this.aClass82_Sub3_19.C(!this.aBoolean565);
		this.aClass82_Sub3_19.method5029(false);
		this.aClass82_Sub3_19.method4928(1, Static302.aClass165_1);
		this.aClass82_Sub3_19.method5028(Static302.aClass165_1, 1);
		for (@Pc(32) int local32 = 0; local32 < this.anInt7821; local32++) {
			@Pc(39) Class48 local39 = this.aClass48Array1[local32];
			@Pc(44) Class106 local44 = this.aClass106Array1[local32];
			if (!local39.aBoolean85 || !this.aClass82_Sub3_19.method6103()) {
				@Pc(73) float local73 = (float) (this.anIntArray483[local39.anInt1333] + this.anIntArray483[local39.anInt1334] + this.anIntArray483[local39.anInt1331]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray484[local39.anInt1334] + this.anIntArray484[local39.anInt1333] + this.anIntArray484[local39.anInt1331]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray485[local39.anInt1331] + this.anIntArray485[local39.anInt1334] + this.anIntArray485[local39.anInt1333]) * 0.3333333F;
				@Pc(130) float local130 = Static172.aFloat73 + Static381.aFloat146 * local116 + Static206.aFloat80 * local73 + Static309.aFloat139 * local95;
				@Pc(144) float local144 = Static641.aFloat199 * local95 + Static170.aFloat72 * local73 + Static607.aFloat195 * local116 + Static329.aFloat141;
				@Pc(158) float local158 = Static635.aFloat198 + local116 * Static6.aFloat1 + local73 * Static229.aFloat118 + Static192.aFloat76 * local95;
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local158 * local158 + local130 * local130 + local144 * local144))) * (float) local39.anInt1335;
				@Pc(184) Class31_Sub2 local184 = this.aClass82_Sub3_19.method4944();
				local184.method7677((float) local44.anInt3036 + local130 - local130 * local179, (float) local44.anInt3037 + local144 - local179 * local144, local44.anInt3038 * local39.aShort20 >> 7, local158 - local179 * local158, local44.anInt3040, local39.aShort18 * local44.anInt3041 >> 7);
				local184.method7674(this.aClass82_Sub3_19.aClass31_Sub2_17);
				this.aClass82_Sub3_19.method4961();
				@Pc(241) int local241 = local44.anInt3042;
				this.aClass82_Sub3_19.method4988(false, false, local39.aShort19);
				this.aClass82_Sub3_19.method4939(local39.aByte33);
				this.aClass82_Sub3_19.method4933(local241);
				this.aClass82_Sub3_19.method4958();
			}
		}
		this.aClass82_Sub3_19.method5028(Static430.aClass165_3, 1);
		this.aClass82_Sub3_19.method4928(1, Static430.aClass165_3);
		this.aClass82_Sub3_19.C(true);
	}

	@OriginalMember(owner = "client!qfa", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7863;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!ih;IIIZ)Z")
	private boolean method6820(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class31_Sub2 local8 = (Class31_Sub2) arg1;
		@Pc(12) Class31_Sub2 local12 = this.aClass82_Sub3_19.aClass31_Sub2_16;
		@Pc(33) float local33 = local8.aFloat177 * local12.aFloat174 + local12.aFloat171 * local8.aFloat170 + local8.aFloat172 * local12.aFloat175 + local12.aFloat177;
		@Pc(54) float local54 = local12.aFloat170 + local8.aFloat177 * local12.aFloat169 + local8.aFloat170 * local12.aFloat167 + local12.aFloat178 * local8.aFloat172;
		Static607.aFloat195 = local8.aFloat175 * local12.aFloat169 + local8.aFloat178 * local12.aFloat167 + local8.aFloat168 * local12.aFloat178;
		Static381.aFloat146 = local8.aFloat168 * local12.aFloat175 + local8.aFloat178 * local12.aFloat171 + local12.aFloat174 * local8.aFloat175;
		Static309.aFloat139 = local8.aFloat171 * local12.aFloat174 + local12.aFloat171 * local8.aFloat167 + local12.aFloat175 * local8.aFloat176;
		Static192.aFloat76 = local12.aFloat168 * local8.aFloat176 + local8.aFloat171 * local12.aFloat173 + local12.aFloat176 * local8.aFloat167;
		Static206.aFloat80 = local12.aFloat175 * local8.aFloat173 + local12.aFloat174 * local8.aFloat174 + local8.aFloat169 * local12.aFloat171;
		Static229.aFloat118 = local8.aFloat173 * local12.aFloat168 + local12.aFloat173 * local8.aFloat174 + local12.aFloat176 * local8.aFloat169;
		Static6.aFloat1 = local8.aFloat178 * local12.aFloat176 + local12.aFloat173 * local8.aFloat175 + local12.aFloat168 * local8.aFloat168;
		@Pc(201) float local201 = local8.aFloat177 * local12.aFloat173 + local8.aFloat170 * local12.aFloat176 + local8.aFloat172 * local12.aFloat168 + local12.aFloat172;
		Static170.aFloat72 = local8.aFloat169 * local12.aFloat167 + local8.aFloat174 * local12.aFloat169 + local8.aFloat173 * local12.aFloat178;
		Static641.aFloat199 = local12.aFloat169 * local8.aFloat171 + local8.aFloat167 * local12.aFloat167 + local12.aFloat178 * local8.aFloat176;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass82_Sub3_19.anInt5835;
		@Pc(255) int local255 = this.aClass82_Sub3_19.anInt5847;
		if (!this.aBoolean563) {
			this.method6816();
		}
		@Pc(269) int local269 = this.anInt7809 - this.anInt7870 >> 1;
		@Pc(278) int local278 = this.anInt7838 - this.anInt7880 >> 1;
		@Pc(287) int local287 = this.anInt7859 - this.anInt7851 >> 1;
		@Pc(293) int local293 = this.anInt7870 + local269;
		@Pc(298) int local298 = this.anInt7880 + local278;
		@Pc(303) int local303 = local287 + this.anInt7851;
		@Pc(309) int local309 = local293 - (local269 << arg4);
		@Pc(316) int local316 = local298 - (local278 << arg4);
		@Pc(323) int local323 = local303 - (local287 << arg4);
		@Pc(330) int local330 = local293 + (local269 << arg4);
		@Pc(336) int local336 = (local278 << arg4) + local298;
		@Pc(342) int local342 = (local287 << arg4) + local303;
		Static43.anIntArray51[0] = local309;
		Static436.anIntArray455[0] = local316;
		Static229.anIntArray253[0] = local323;
		Static43.anIntArray51[1] = local330;
		Static436.anIntArray455[1] = local316;
		Static43.anIntArray51[2] = local309;
		Static229.anIntArray253[1] = local323;
		Static436.anIntArray455[2] = local336;
		Static229.anIntArray253[2] = local323;
		Static43.anIntArray51[3] = local330;
		Static436.anIntArray455[3] = local336;
		Static43.anIntArray51[4] = local309;
		Static229.anIntArray253[3] = local323;
		Static436.anIntArray455[4] = local316;
		Static229.anIntArray253[4] = local342;
		Static43.anIntArray51[5] = local330;
		Static436.anIntArray455[5] = local316;
		Static43.anIntArray51[6] = local309;
		Static229.anIntArray253[5] = local342;
		Static436.anIntArray455[6] = local336;
		Static43.anIntArray51[7] = local330;
		Static229.anIntArray253[6] = local342;
		Static436.anIntArray455[7] = local336;
		Static229.anIntArray253[7] = local342;
		@Pc(491) float local491;
		@Pc(505) float local505;
		@Pc(477) float local477;
		@Pc(458) float local458;
		@Pc(463) float local463;
		@Pc(453) float local453;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = (float) Static229.anIntArray253[local446];
			local458 = (float) Static43.anIntArray51[local446];
			local463 = (float) Static436.anIntArray455[local446];
			local477 = Static6.aFloat1 * local453 + Static229.aFloat118 * local458 + local463 * Static192.aFloat76 + local201;
			local491 = local453 * Static381.aFloat146 + local458 * Static206.aFloat80 + local463 * Static309.aFloat139 + local33;
			local505 = local453 * Static607.aFloat195 + local463 * Static641.aFloat199 + Static170.aFloat72 * local458 + local54;
			if ((float) this.aClass82_Sub3_19.anInt5828 <= local477) {
				if (arg0 > 0) {
					local477 = (float) arg0;
				}
				@Pc(529) float local529 = (float) local251 * local491 / local477 + (float) this.aClass82_Sub3_19.anInt5839;
				@Pc(541) float local541 = (float) this.aClass82_Sub3_19.anInt5842 + (float) local255 * local505 / local477;
				if (local241 > local529) {
					local241 = local529;
				}
				if (local243 < local529) {
					local243 = local529;
				}
				local239 = true;
				if (local247 < local541) {
					local247 = local541;
				}
				if (local245 > local541) {
					local245 = local541;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && local245 < (float) arg3 && (float) arg3 < local247) {
			if (arg5) {
				return true;
			}
			if (Static33.anIntArray39.length < this.anInt7812) {
				Static33.anIntArray39 = new int[this.anInt7812];
				Static639.anIntArray662 = new int[this.anInt7812];
			}
			@Pc(705) int local705;
			for (@Pc(618) int local618 = 0; local618 < this.anInt7850; local618++) {
				local453 = (float) this.anIntArray485[local618];
				local458 = (float) this.anIntArray483[local618];
				local463 = (float) this.anIntArray484[local618];
				local491 = Static309.aFloat139 * local463 + local458 * Static206.aFloat80 + local453 * Static381.aFloat146 + local33;
				local477 = local201 + local463 * Static192.aFloat76 + local458 * Static229.aFloat118 + Static6.aFloat1 * local453;
				local505 = local54 + local453 * Static607.aFloat195 + Static170.aFloat72 * local458 + local463 * Static641.aFloat199;
				@Pc(718) int local718;
				@Pc(723) int local723;
				@Pc(730) int local730;
				if (local477 >= (float) this.aClass82_Sub3_19.anInt5828) {
					if (arg0 > 0) {
						local477 = (float) arg0;
					}
					local705 = (int) (local491 * (float) local251 / local477 + (float) this.aClass82_Sub3_19.anInt5839);
					local718 = (int) ((float) local255 * local505 / local477 + (float) this.aClass82_Sub3_19.anInt5842);
					local723 = this.anIntArray481[local618];
					local730 = this.anIntArray481[local618 + 1];
					for (@Pc(732) int local732 = local723; local732 < local730; local732++) {
						@Pc(741) int local741 = this.aShortArray97[local732] - 1;
						if (local741 == -1) {
							break;
						}
						Static33.anIntArray39[local741] = local705;
						Static639.anIntArray662[local741] = local718;
					}
				} else {
					local705 = this.anIntArray481[local618];
					local718 = this.anIntArray481[local618 + 1];
					for (local723 = local705; local723 < local718; local723++) {
						local730 = this.aShortArray97[local723] - 1;
						if (local730 == -1) {
							break;
						}
						Static33.anIntArray39[this.aShortArray97[local723] - 1] = -999999;
					}
				}
			}
			for (local705 = 0; local705 < this.anInt7843; local705++) {
				if (Static33.anIntArray39[this.aShortArray96[local705]] != -999999 && Static33.anIntArray39[this.aShortArray104[local705]] != -999999 && Static33.anIntArray39[this.aShortArray106[local705]] != -999999 && this.method6815(Static33.anIntArray39[this.aShortArray106[local705]], Static33.anIntArray39[this.aShortArray104[local705]], Static33.anIntArray39[this.aShortArray96[local705]], Static639.anIntArray662[this.aShortArray104[local705]], arg3, Static639.anIntArray662[this.aShortArray106[local705]], Static639.anIntArray662[this.aShortArray96[local705]], arg2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean563) {
			this.method6816();
		}
		@Pc(16) int local16 = this.anInt7870 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt7809;
		@Pc(27) int local27 = arg6 + this.anInt7851;
		@Pc(32) int local32 = this.anInt7859 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8983 <= arg2.anInt8986 + local22 >> arg2.anInt8988 || local27 < 0 || arg2.anInt8985 <= arg2.anInt8986 + local32 >> arg2.anInt8988)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8986 + local22 >> arg3.anInt8988 >= arg3.anInt8983 || local27 < 0 || arg3.anInt8985 <= arg3.anInt8986 + local32 >> arg3.anInt8988) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8988;
			local22 = local22 + arg2.anInt8986 - 1 >> arg2.anInt8988;
			local27 >>= arg2.anInt8988;
			local32 = arg2.anInt8986 + local32 - 1 >> arg2.anInt8988;
			if (arg5 == arg2.method7724(local27, local16) && arg2.method7724(local27, local22) == arg5 && arg2.method7724(local32, local16) == arg5 && arg5 == arg2.method7724(local32, local22)) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt7850; local199++) {
				this.anIntArray484[local199] = this.anIntArray484[local199] + arg2.method7725(this.anIntArray483[local199] + arg4, this.anIntArray485[local199] + arg6) - arg5;
			}
		} else {
			@Pc(260) int local260;
			@Pc(269) int local269;
			if (arg0 == 2) {
				local199 = this.anInt7880;
				if (local199 == 0) {
					return;
				}
				for (local260 = 0; local260 < this.anInt7850; local260++) {
					local269 = (this.anIntArray484[local260] << 16) / local199;
					if (local269 < arg1) {
						this.anIntArray484[local260] += (arg1 - local269) * (arg2.method7725(this.anIntArray483[local260] + arg4, this.anIntArray485[local260] - -arg6) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(277) int local277;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local260 = (arg1 >> 8 & 0xFF) * 4;
					local269 = (arg1 >> 16 & 0xFF) << 6;
					local277 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || (local199 >> 1) + arg4 + arg2.anInt8986 >= arg2.anInt8983 << arg2.anInt8988 || arg6 - (local260 >> 1) < 0 || (local260 >> 1) + arg6 + arg2.anInt8986 >= arg2.anInt8985 << arg2.anInt8988) {
						return;
					}
					this.method6806(local260, local269, arg6, arg4, arg5, arg2, local199, local277);
				} else if (arg0 == 4) {
					local199 = this.anInt7838 - this.anInt7880;
					for (local260 = 0; local260 < this.anInt7850; local260++) {
						this.anIntArray484[local260] = this.anIntArray484[local260] + arg3.method7725(arg4 + this.anIntArray483[local260], arg6 + this.anIntArray485[local260]) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.anInt7838 - this.anInt7880;
					for (local260 = 0; local260 < this.anInt7850; local260++) {
						local269 = this.anIntArray483[local260] + arg4;
						local277 = this.anIntArray485[local260] + arg6;
						@Pc(283) int local283 = arg2.method7725(local269, local277);
						@Pc(289) int local289 = arg3.method7725(local269, local277);
						@Pc(297) int local297 = local283 - local289 - arg1;
						this.anIntArray484[local260] = local283 + ((this.anIntArray484[local260] << 8) / local199 * local297 >> 8) - arg5;
					}
				}
			}
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(I)V")
	private void method6821() {
		if (!this.aBoolean562) {
			return;
		}
		this.aBoolean562 = false;
		if (this.aClass228Array4 == null && this.aClass232Array4 == null && this.aClass48Array1 == null) {
			if (this.anIntArray483 != null && !Static490.method7203(this.anInt7835, this.anInt7818)) {
				if (this.aClass209_1 == null || this.aClass209_1.method5405()) {
					if (!this.aBoolean563) {
						this.method6816();
					}
					this.anIntArray483 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
			if (this.anIntArray484 != null && !Static25.method344(this.anInt7818, this.anInt7835)) {
				if (this.aClass209_1 == null || this.aClass209_1.method5405()) {
					if (!this.aBoolean563) {
						this.method6816();
					}
					this.anIntArray484 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
			if (this.anIntArray485 != null && !Static256.method4303(this.anInt7835, this.anInt7818)) {
				if (this.aClass209_1 == null || this.aClass209_1.method5405()) {
					if (!this.aBoolean563) {
						this.method6816();
					}
					this.anIntArray485 = null;
				} else {
					this.aBoolean562 = true;
				}
			}
		}
		if (this.aShortArray97 != null && this.anIntArray483 == null && this.anIntArray484 == null && this.anIntArray485 == null) {
			this.aShortArray97 = null;
			this.anIntArray481 = null;
		}
		if (this.aByteArray76 != null && !Static8.method152(this.anInt7835, this.anInt7818)) {
			label195: {
				label194: {
					@Pc(170) boolean local170;
					if ((this.anInt7818 & 0x37) == 0) {
						if (this.aClass209_4 == null || this.aClass209_4.method5405()) {
							break label194;
						}
						local170 = false;
					} else {
						if (this.aClass209_3 == null || this.aClass209_3.method5405()) {
							break label194;
						}
						local170 = false;
					}
					if (!local170) {
						this.aBoolean562 = true;
						break label195;
					}
				}
				this.aShortArray99 = this.aShortArray107 = this.aShortArray102 = null;
				this.aByteArray76 = null;
			}
		}
		if (this.aShortArray100 != null && !Static439.method7996(this.anInt7818, this.anInt7835)) {
			if (this.aClass209_4 == null || this.aClass209_4.method5405()) {
				this.aShortArray100 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aByteArray75 != null && !Static576.method8072(this.anInt7835, this.anInt7818)) {
			if (this.aClass209_4 == null || this.aClass209_4.method5405()) {
				this.aByteArray75 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aFloatArray84 != null && !Static601.method8292(this.anInt7818, this.anInt7835)) {
			if (this.aClass209_2 == null || this.aClass209_2.method5405()) {
				this.aFloatArray84 = this.aFloatArray85 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray101 != null && !Static228.method3950(this.anInt7835, this.anInt7818)) {
			if (this.aClass209_4 == null || this.aClass209_4.method5405()) {
				this.aShortArray101 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray96 != null && !Static456.method6761(this.anInt7818, this.anInt7835)) {
			if ((this.aClass269_1 == null || this.aClass269_1.method6620()) && (this.aClass209_4 == null || this.aClass209_4.method5405())) {
				this.aShortArray96 = this.aShortArray104 = this.aShortArray106 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray108 != null) {
			if (this.aClass209_1 == null || this.aClass209_1.method5405()) {
				this.aShortArray108 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.aShortArray103 != null) {
			if (this.aClass209_4 == null || this.aClass209_4.method5405()) {
				this.aShortArray103 = null;
			} else {
				this.aBoolean562 = true;
			}
		}
		if (this.anIntArrayArray44 != null && !Static101.method1700(this.anInt7818, this.anInt7835)) {
			this.anIntArrayArray44 = null;
			this.aShortArray105 = null;
		}
		if (this.anIntArrayArray46 != null && !Static394.method6219(this.anInt7835, this.anInt7818)) {
			this.anIntArrayArray46 = null;
			this.aShortArray98 = null;
		}
		if (this.anIntArrayArray45 != null && !Static222.method3857(this.anInt7818, this.anInt7835)) {
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArray480 != null && (this.anInt7835 & 0x800) == 0 && (this.anInt7835 & 0x40000) == 0) {
			this.anIntArray480 = null;
			this.anIntArray479 = null;
			this.anIntArray482 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7851;
	}

	@OriginalMember(owner = "client!qfa", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static75.anInt1456 = 0;
			local11 = 0;
			Static282.anInt5418 = 0;
			Static330.anInt6252 = 0;
			for (local17 = 0; local17 < this.anInt7850; local17++) {
				Static282.anInt5418 += this.anIntArray483[local17];
				Static75.anInt1456 += this.anIntArray484[local17];
				Static330.anInt6252 += this.anIntArray485[local17];
				local11++;
			}
			if (local11 > 0) {
				Static330.anInt6252 = Static330.anInt6252 / local11 + arg3;
				Static282.anInt5418 = arg1 + Static282.anInt5418 / local11;
				Static75.anInt1456 = Static75.anInt1456 / local11 + arg2;
			} else {
				Static282.anInt5418 = arg1;
				Static330.anInt6252 = arg3;
				Static75.anInt1456 = arg2;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt7850; local11++) {
				this.anIntArray483[local11] += arg1;
				this.anIntArray484[local11] += arg2;
				this.anIntArray485[local11] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(179) int local179;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt7850; local11++) {
					this.anIntArray483[local11] -= Static282.anInt5418;
					this.anIntArray484[local11] -= Static75.anInt1456;
					this.anIntArray485[local11] -= Static330.anInt6252;
					if (arg3 != 0) {
						local17 = Class3_Sub13.anIntArray147[arg3];
						local161 = Class3_Sub13.anIntArray146[arg3];
						local179 = this.anIntArray483[local11] * local161 + local17 * this.anIntArray484[local11] + 16383 >> 14;
						this.anIntArray484[local11] = local161 * this.anIntArray484[local11] + 16383 - local17 * this.anIntArray483[local11] >> 14;
						this.anIntArray483[local11] = local179;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub13.anIntArray147[arg1];
						local161 = Class3_Sub13.anIntArray146[arg1];
						local179 = local161 * this.anIntArray484[local11] + 16383 - local17 * this.anIntArray485[local11] >> 14;
						this.anIntArray485[local11] = this.anIntArray484[local11] * local17 + local161 * this.anIntArray485[local11] + 16383 >> 14;
						this.anIntArray484[local11] = local179;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub13.anIntArray147[arg2];
						local161 = Class3_Sub13.anIntArray146[arg2];
						local179 = local17 * this.anIntArray485[local11] + local161 * this.anIntArray483[local11] + 16383 >> 14;
						this.anIntArray485[local11] = this.anIntArray485[local11] * local161 + 16383 - this.anIntArray483[local11] * local17 >> 14;
						this.anIntArray483[local11] = local179;
					}
					this.anIntArray483[local11] += Static282.anInt5418;
					this.anIntArray484[local11] += Static75.anInt1456;
					this.anIntArray485[local11] += Static330.anInt6252;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt7850; local11++) {
					this.anIntArray483[local11] -= Static282.anInt5418;
					this.anIntArray484[local11] -= Static75.anInt1456;
					this.anIntArray485[local11] -= Static330.anInt6252;
					this.anIntArray483[local11] = this.anIntArray483[local11] * arg1 / 128;
					this.anIntArray484[local11] = arg2 * this.anIntArray484[local11] / 128;
					this.anIntArray485[local11] = arg3 * this.anIntArray485[local11] / 128;
					this.anIntArray483[local11] += Static282.anInt5418;
					this.anIntArray484[local11] += Static75.anInt1456;
					this.anIntArray485[local11] += Static330.anInt6252;
				}
			} else {
				@Pc(514) Class48 local514;
				@Pc(519) Class106 local519;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt7843; local11++) {
						local17 = arg1 * 8 + (this.aByteArray75[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray75[local11] = (byte) local17;
					}
					if (this.aClass48Array1 != null) {
						for (local17 = 0; local17 < this.anInt7821; local17++) {
							local514 = this.aClass48Array1[local17];
							local519 = this.aClass106Array1[local17];
							local519.anInt3042 = local519.anInt3042 & 0xFFFFFF | 255 - (this.aByteArray75[local514.anInt1330] & 0xFF) << 24;
						}
					}
					this.method6824();
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt7843; local11++) {
						local17 = this.aShortArray100[local11] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local179 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = arg1 + local161 & 0x3F;
						local179 += arg2 / 4;
						@Pc(590) int local590 = local17 & 0x7F;
						local590 += arg3;
						if (local179 < 0) {
							local179 = 0;
						} else if (local179 > 7) {
							local179 = 7;
						}
						if (local590 < 0) {
							local590 = 0;
						} else if (local590 > 127) {
							local590 = 127;
						}
						this.aShortArray100[local11] = (short) (local590 | local580 << 10 | local179 << 7);
					}
					if (this.aClass48Array1 != null) {
						for (local17 = 0; local17 < this.anInt7821; local17++) {
							local514 = this.aClass48Array1[local17];
							local519 = this.aClass106Array1[local17];
							local519.anInt3042 = Static205.anIntArray530[this.aShortArray100[local514.anInt1330] & 0xFFFF] & 0xFFFFFF | local519.anInt3042 & 0xFF000000;
						}
					}
					this.method6824();
				} else {
					@Pc(705) Class106 local705;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt7821; local11++) {
							local705 = this.aClass106Array1[local11];
							local705.anInt3036 += arg1;
							local705.anInt3037 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt7821; local11++) {
							local705 = this.aClass106Array1[local11];
							local705.anInt3041 = local705.anInt3041 * arg2 >> 7;
							local705.anInt3038 = arg1 * local705.anInt3038 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt7821; local11++) {
							local705 = this.aClass106Array1[local11];
							local705.anInt3040 = local705.anInt3040 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7850; local15++) {
			@Pc(33) int local33 = this.anIntArray483[local15] * local13 + this.anIntArray485[local15] * local9 >> 14;
			this.anIntArray485[local15] = local13 * this.anIntArray485[local15] - this.anIntArray483[local15] * local9 >> 14;
			this.anIntArray483[local15] = local33;
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "()V")
	@Override
	public void method6785() {
		if (this.anInt7812 > 0 && this.anInt7832 > 0) {
			this.method6818();
			this.method6822();
			this.method6821();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(I)Z")
	private boolean method6822() {
		if (this.aClass269_1.aBoolean546) {
			return true;
		}
		if (this.aClass269_1.anInterface12_7 == null) {
			this.aClass269_1.anInterface12_7 = this.aClass82_Sub3_19.method4985(this.aBoolean564);
		}
		@Pc(34) Interface12 local34 = this.aClass269_1.anInterface12_7;
		local34.method7563(this.anInt7832 * 6);
		@Pc(46) Buffer local46 = local34.method7573();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass82_Sub3_19.method4986(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt7832; local58++) {
					local54.c(this.aShortArray96[local58]);
					local54.c(this.aShortArray104[local58]);
					local54.c(this.aShortArray106[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt7832; local58++) {
					local54.f(this.aShortArray96[local58]);
					local54.f(this.aShortArray104[local58]);
					local54.f(this.aShortArray106[local58]);
				}
			}
			local54.b();
			if (local34.method7574()) {
				this.aClass269_1.aBoolean546 = true;
				this.aClass269_1.anInterface12_8 = local34;
				this.aBoolean562 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7859;
	}

	@OriginalMember(owner = "client!qfa", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean563) {
			this.method6816();
		}
		return this.anInt7880;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class75 method6805(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class75_Sub3 local17;
		@Pc(21) Class75_Sub3 local21;
		if (arg0 == 1) {
			local17 = this.aClass82_Sub3_19.aClass75_Sub3_27;
			local21 = this.aClass82_Sub3_19.aClass75_Sub3_30;
		} else if (arg0 == 2) {
			local17 = this.aClass82_Sub3_19.aClass75_Sub3_22;
			local21 = this.aClass82_Sub3_19.aClass75_Sub3_28;
		} else if (arg0 == 3) {
			local21 = this.aClass82_Sub3_19.aClass75_Sub3_26;
			local17 = this.aClass82_Sub3_19.aClass75_Sub3_21;
		} else if (arg0 == 4) {
			local21 = this.aClass82_Sub3_19.aClass75_Sub3_23;
			local17 = this.aClass82_Sub3_19.aClass75_Sub3_25;
		} else if (arg0 == 5) {
			local17 = this.aClass82_Sub3_19.aClass75_Sub3_24;
			local21 = this.aClass82_Sub3_19.aClass75_Sub3_29;
		} else {
			local17 = local21 = new Class75_Sub3(this.aClass82_Sub3_19, 0, 0, true, false);
		}
		return this.method6812(arg2, arg0 != 0, local17, arg1, local21);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
	private void method6823() {
		if ((this.anInt7818 & 0x37) != 0) {
			if (this.aClass209_3 == null) {
				return;
			}
			this.aClass209_3.aBoolean458 = false;
		} else if (this.aClass209_4 != null) {
			this.aClass209_4.aBoolean458 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7850; local3++) {
			if (arg0 != 0) {
				this.anIntArray483[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray484[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray485[local3] += arg2;
			}
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray46 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7879; local12++) {
			this.anIntArray483[local12] <<= 0x4;
			this.anIntArray484[local12] <<= 0x4;
			this.anIntArray485[local12] <<= 0x4;
		}
		Static330.anInt6252 = 0;
		Static282.anInt5418 = 0;
		Static75.anInt1456 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(B)V")
	private void method6824() {
		if (this.aClass209_4 != null) {
			this.aClass209_4.aBoolean458 = false;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass82_Sub3_19.anInterface5_9;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7843; local11++) {
			if (this.aShortArray101[local11] == arg0) {
				this.aShortArray101[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class355 local44 = local9.method4129(arg0 & 0xFFFF);
			local31 = local44.aByte121;
			local33 = local44.aByte124;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class355 local64 = local9.method4129(arg1 & 0xFFFF);
			local54 = local64.aByte124;
			local52 = local64.aByte121;
			if (local64.aByte125 != 0 || local64.aByte122 != 0) {
				this.aBoolean566 = true;
			}
		}
		if (!(local54 != local33 | local52 != local31)) {
			return;
		}
		if (this.aClass48Array1 != null) {
			for (@Pc(102) int local102 = 0; local102 < this.anInt7821; local102++) {
				@Pc(109) Class48 local109 = this.aClass48Array1[local102];
				@Pc(114) Class106 local114 = this.aClass106Array1[local102];
				local114.anInt3042 = local114.anInt3042 & 0xFF000000 | Static205.anIntArray530[this.aShortArray100[local109.anInt1330] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6824();
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6789() {
		if (this.aShortArray101 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray101.length; local12++) {
			if (this.aShortArray101[local12] != -1 && !this.aClass82_Sub3_19.anInterface5_9.method4130(this.aShortArray101[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(B)V")
	private void method6826() {
		if (this.anInt7832 == 0) {
			return;
		}
		if (this.method6818() && this.method6822()) {
			this.aClass82_Sub3_19.method4995(0, this.aClass209_1.anInterface22_16);
			this.aClass82_Sub3_19.method4995(1, this.aClass209_4.anInterface22_16);
			this.aClass82_Sub3_19.method4995(2, this.aClass209_2.anInterface22_16);
			@Pc(53) boolean local53;
			if ((this.anInt7818 & 0x37) == 0) {
				local53 = false;
				this.aClass82_Sub3_19.method5029(false);
				this.aClass82_Sub3_19.method4960(this.aClass82_Sub3_19.aClass43_18);
			} else {
				this.aClass82_Sub3_19.method5029(true);
				local53 = true;
				this.aClass82_Sub3_19.method4995(3, this.aClass209_3.anInterface22_16);
				this.aClass82_Sub3_19.method4960(this.aClass82_Sub3_19.aClass43_21);
			}
			for (@Pc(93) int local93 = 0; local93 < this.anIntArray479.length; local93++) {
				@Pc(100) int local100 = this.anIntArray480[local93];
				@Pc(107) int local107 = this.anIntArray480[local93 + 1];
				@Pc(114) int local114 = this.aShortArray101[local100] & 0xFFFF;
				if (local114 == 65535) {
					local114 = -1;
				}
				this.aClass82_Sub3_19.method4988(local53, true, local114);
				this.aClass82_Sub3_19.method4993(this.anIntArray482[local93], this.aClass269_1.anInterface12_8, Static525.aClass376_6, local107 - local100, this.anIntArray479[local93], local100 * 3);
			}
		}
		this.method6821();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7843; local3++) {
			local12 = this.aShortArray100[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local42 += (arg2 - local42) * arg3 >> 7;
			}
			this.aShortArray100[local3] = (short) (local18 << 10 | local24 << 7 | local42);
		}
		if (this.aClass48Array1 != null) {
			for (local12 = 0; local12 < this.anInt7821; local12++) {
				@Pc(110) Class48 local110 = this.aClass48Array1[local12];
				@Pc(115) Class106 local115 = this.aClass106Array1[local12];
				local115.anInt3042 = local115.anInt3042 & 0xFF000000 | Static205.anIntArray530[this.aShortArray100[local110.anInt1330] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6824();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ih;Lclient!kia;I)V")
	@Override
	public void method6799(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7812 == 0) {
			return;
		}
		@Pc(13) Class31_Sub2 local13 = this.aClass82_Sub3_19.aClass31_Sub2_16;
		@Pc(16) Class31_Sub2 local16 = (Class31_Sub2) arg0;
		if (!this.aBoolean563) {
			this.method6816();
		}
		Static192.aFloat76 = local16.aFloat176 * local13.aFloat168 + local13.aFloat173 * local16.aFloat171 + local13.aFloat176 * local16.aFloat167;
		Static635.aFloat198 = local16.aFloat172 * local13.aFloat168 + local13.aFloat176 * local16.aFloat170 + local16.aFloat177 * local13.aFloat173 + local13.aFloat172;
		@Pc(69) float local69 = Static635.aFloat198 + (float) this.anInt7880 * Static192.aFloat76;
		@Pc(77) float local77 = Static635.aFloat198 + Static192.aFloat76 * (float) this.anInt7838;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt7816 + local77;
			local94 = local69 + (float) this.anInt7816;
		} else {
			local94 = local77 + (float) this.anInt7816;
			local88 = (float) -this.anInt7816 + local69;
		}
		if (local88 >= this.aClass82_Sub3_19.aFloat126 || (float) this.aClass82_Sub3_19.anInt5828 >= local94) {
			return;
		}
		Static309.aFloat139 = local13.aFloat175 * local16.aFloat176 + local13.aFloat174 * local16.aFloat171 + local13.aFloat171 * local16.aFloat167;
		Static172.aFloat73 = local13.aFloat177 + local16.aFloat172 * local13.aFloat175 + local16.aFloat170 * local13.aFloat171 + local13.aFloat174 * local16.aFloat177;
		@Pc(171) float local171 = Static309.aFloat139 * (float) this.anInt7880 + Static172.aFloat73;
		@Pc(179) float local179 = Static172.aFloat73 + Static309.aFloat139 * (float) this.anInt7838;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local179 < local171) {
			local195 = (float) this.aClass82_Sub3_19.anInt5835 * ((float) -this.anInt7816 + local179);
			local206 = (local171 + (float) this.anInt7816) * (float) this.aClass82_Sub3_19.anInt5835;
		} else {
			local195 = (float) this.aClass82_Sub3_19.anInt5835 * ((float) -this.anInt7816 + local171);
			local206 = (float) this.aClass82_Sub3_19.anInt5835 * ((float) this.anInt7816 + local179);
		}
		if (this.aClass82_Sub3_19.aFloat125 <= local195 / local94 || this.aClass82_Sub3_19.aFloat133 >= local206 / local94) {
			return;
		}
		Static641.aFloat199 = local13.aFloat169 * local16.aFloat171 + local16.aFloat167 * local13.aFloat167 + local13.aFloat178 * local16.aFloat176;
		Static329.aFloat141 = local16.aFloat170 * local13.aFloat167 + local16.aFloat177 * local13.aFloat169 + local16.aFloat172 * local13.aFloat178 + local13.aFloat170;
		@Pc(296) float local296 = Static329.aFloat141 + (float) this.anInt7880 * Static641.aFloat199;
		@Pc(304) float local304 = Static641.aFloat199 * (float) this.anInt7838 + Static329.aFloat141;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = (float) this.aClass82_Sub3_19.anInt5847 * ((float) this.anInt7816 + local296);
			local331 = ((float) -this.anInt7816 + local304) * (float) this.aClass82_Sub3_19.anInt5847;
		} else {
			local319 = (float) this.aClass82_Sub3_19.anInt5847 * (local304 + (float) this.anInt7816);
			local331 = ((float) -this.anInt7816 + local296) * (float) this.aClass82_Sub3_19.anInt5847;
		}
		if (this.aClass82_Sub3_19.aFloat128 <= local331 / local94 || this.aClass82_Sub3_19.aFloat134 >= local319 / local94) {
			return;
		}
		if (arg1 != null || this.aClass48Array1 != null) {
			Static607.aFloat195 = local16.aFloat168 * local13.aFloat178 + local13.aFloat169 * local16.aFloat175 + local13.aFloat167 * local16.aFloat178;
			Static206.aFloat80 = local16.aFloat169 * local13.aFloat171 + local16.aFloat174 * local13.aFloat174 + local13.aFloat175 * local16.aFloat173;
			Static381.aFloat146 = local13.aFloat175 * local16.aFloat168 + local16.aFloat178 * local13.aFloat171 + local16.aFloat175 * local13.aFloat174;
			Static229.aFloat118 = local13.aFloat173 * local16.aFloat174 + local13.aFloat176 * local16.aFloat169 + local13.aFloat168 * local16.aFloat173;
			Static6.aFloat1 = local13.aFloat168 * local16.aFloat168 + local13.aFloat173 * local16.aFloat175 + local16.aFloat178 * local13.aFloat176;
			Static170.aFloat72 = local13.aFloat169 * local16.aFloat174 + local16.aFloat169 * local13.aFloat167 + local16.aFloat173 * local13.aFloat178;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(502) int local502 = this.anInt7870 + this.anInt7809 >> 1;
			@Pc(511) int local511 = this.anInt7851 + this.anInt7859 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static381.aFloat146 + (float) local502 * Static206.aFloat80 + Static172.aFloat73 + (float) this.anInt7880 * Static309.aFloat139);
			@Pc(549) int local549 = (int) ((float) this.anInt7880 * Static641.aFloat199 + Static329.aFloat141 + Static170.aFloat72 * (float) local502 + (float) local511 * Static607.aFloat195);
			@Pc(568) int local568 = (int) (Static635.aFloat198 + Static229.aFloat118 * (float) local502 + (float) this.anInt7880 * Static192.aFloat76 + (float) local511 * Static6.aFloat1);
			if (this.aClass82_Sub3_19.anInt5828 <= local568) {
				arg1.anInt5910 = local530 * this.aClass82_Sub3_19.anInt5835 / local568 + this.aClass82_Sub3_19.anInt5839;
				arg1.anInt5909 = this.aClass82_Sub3_19.anInt5842 + this.aClass82_Sub3_19.anInt5847 * local549 / local568;
			} else {
				local491 = true;
			}
			@Pc(627) int local627 = (int) (Static172.aFloat73 + Static206.aFloat80 * (float) local502 + (float) this.anInt7838 * Static309.aFloat139 + (float) local511 * Static381.aFloat146);
			@Pc(646) int local646 = (int) (Static641.aFloat199 * (float) this.anInt7838 + (float) local502 * Static170.aFloat72 + Static329.aFloat141 + Static607.aFloat195 * (float) local511);
			@Pc(665) int local665 = (int) (Static635.aFloat198 + (float) local502 * Static229.aFloat118 + (float) this.anInt7838 * Static192.aFloat76 + Static6.aFloat1 * (float) local511);
			if (local665 >= this.aClass82_Sub3_19.anInt5828) {
				arg1.anInt5912 = this.aClass82_Sub3_19.anInt5839 + this.aClass82_Sub3_19.anInt5835 * local627 / local665;
				arg1.anInt5911 = this.aClass82_Sub3_19.anInt5842 + local646 * this.aClass82_Sub3_19.anInt5847 / local665;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local568 < this.aClass82_Sub3_19.anInt5828 && local665 < this.aClass82_Sub3_19.anInt5828) {
					local493 = false;
				} else {
					@Pc(752) int local752;
					@Pc(762) int local762;
					@Pc(790) int local790;
					if (local568 < this.aClass82_Sub3_19.anInt5828) {
						local752 = (local665 - this.aClass82_Sub3_19.anInt5828 << 16) / (local665 - local568);
						local762 = local627 + ((local627 - local530) * local752 >> 16);
						local790 = local646 + (local752 * (local646 - local549) >> 16);
						arg1.anInt5910 = this.aClass82_Sub3_19.anInt5839 + this.aClass82_Sub3_19.anInt5835 * local762 / this.aClass82_Sub3_19.anInt5828;
						arg1.anInt5909 = this.aClass82_Sub3_19.anInt5847 * local790 / this.aClass82_Sub3_19.anInt5828 + this.aClass82_Sub3_19.anInt5842;
					} else if (this.aClass82_Sub3_19.anInt5828 > local665) {
						local752 = (local568 - this.aClass82_Sub3_19.anInt5828 << 16) / (local568 - local665);
						local762 = (local752 * (local530 - local627) >> 16) + local530;
						arg1.anInt5910 = this.aClass82_Sub3_19.anInt5839 + local762 * this.aClass82_Sub3_19.anInt5835 / this.aClass82_Sub3_19.anInt5828;
						local790 = local549 + (local752 * (local549 - local646) >> 16);
						arg1.anInt5909 = this.aClass82_Sub3_19.anInt5847 * local790 / this.aClass82_Sub3_19.anInt5828 + this.aClass82_Sub3_19.anInt5842;
					}
				}
			}
			if (local493) {
				arg1.aBoolean433 = true;
				if (local568 <= local665) {
					arg1.anInt5913 = this.aClass82_Sub3_19.anInt5839 + this.aClass82_Sub3_19.anInt5835 * (local627 + this.anInt7816) / local665 - arg1.anInt5912;
				} else {
					arg1.anInt5913 = (this.anInt7816 + local530) * this.aClass82_Sub3_19.anInt5835 / local568 + this.aClass82_Sub3_19.anInt5839 - arg1.anInt5910;
				}
			}
		}
		this.aClass82_Sub3_19.method5002();
		this.aClass82_Sub3_19.method4965(local16);
		this.method6826();
		this.method6819();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6782(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class75_Sub3 local8 = (Class75_Sub3) arg0;
		if (this.anInt7843 == 0 || local8.anInt7843 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7850;
		@Pc(24) int[] local24 = local8.anIntArray483;
		@Pc(27) int[] local27 = local8.anIntArray484;
		@Pc(30) int[] local30 = local8.anIntArray485;
		@Pc(33) short[] local33 = local8.aShortArray99;
		@Pc(36) short[] local36 = local8.aShortArray107;
		@Pc(39) short[] local39 = local8.aShortArray102;
		@Pc(42) byte[] local42 = local8.aByteArray76;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(49) short[] local49;
		@Pc(47) byte[] local47;
		if (this.aClass320_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass320_1.aShortArray130;
			local49 = this.aClass320_1.aShortArray131;
			local51 = this.aClass320_1.aShortArray132;
			local47 = this.aClass320_1.aByteArray91;
		}
		@Pc(80) short[] local80;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(78) byte[] local78;
		if (local8.aClass320_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local76 = local8.aClass320_1.aShortArray131;
			local78 = local8.aClass320_1.aByteArray91;
			local82 = local8.aClass320_1.aShortArray132;
			local80 = local8.aClass320_1.aShortArray130;
		}
		@Pc(103) int[] local103 = local8.anIntArray481;
		@Pc(106) short[] local106 = local8.aShortArray97;
		if (!local8.aBoolean563) {
			local8.method6816();
		}
		@Pc(115) int local115 = local8.anInt7880;
		@Pc(118) int local118 = local8.anInt7838;
		@Pc(121) int local121 = local8.anInt7870;
		@Pc(124) int local124 = local8.anInt7809;
		@Pc(127) int local127 = local8.anInt7851;
		@Pc(130) int local130 = local8.anInt7859;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7850; local132++) {
			@Pc(142) int local142 = this.anIntArray484[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(166) int local166 = this.anIntArray483[local132] - arg1;
				if (local166 >= local121 && local166 <= local124) {
					@Pc(186) int local186 = this.anIntArray485[local132] - arg3;
					if (local186 >= local127 && local130 >= local186) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray481[local132];
						@Pc(208) int local208 = this.anIntArray481[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray97[local210] - 1;
							if (local196 == -1 || this.aByteArray76[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(239) int local239 = 0; local239 < local21; local239++) {
								if (local166 == local24[local239] && local30[local239] == local186 && local142 == local27[local239]) {
									@Pc(258) int local258 = -1;
									local208 = local103[local239 + 1];
									local201 = local103[local239];
									for (@Pc(270) int local270 = local201; local270 < local208; local270++) {
										local258 = local106[local270] - 1;
										if (local258 == -1 || local42[local258] != 0) {
											break;
										}
									}
									if (local258 != -1) {
										if (local53 == null) {
											this.aClass320_1 = new Class320();
											local53 = this.aClass320_1.aShortArray130 = Static605.method8321(this.aShortArray99);
											local51 = this.aClass320_1.aShortArray132 = Static605.method8321(this.aShortArray107);
											local49 = this.aClass320_1.aShortArray131 = Static605.method8321(this.aShortArray102);
											local47 = this.aClass320_1.aByteArray91 = Static234.method4002(this.aByteArray76);
										}
										if (local80 == null) {
											@Pc(349) Class320 local349 = local8.aClass320_1 = new Class320();
											local80 = local349.aShortArray130 = Static605.method8321(local33);
											local82 = local349.aShortArray132 = Static605.method8321(local36);
											local76 = local349.aShortArray131 = Static605.method8321(local39);
											local78 = local349.aByteArray91 = Static234.method4002(local42);
										}
										@Pc(382) short local382 = this.aShortArray99[local196];
										@Pc(387) short local387 = this.aShortArray107[local196];
										@Pc(392) short local392 = this.aShortArray102[local196];
										@Pc(397) byte local397 = this.aByteArray76[local196];
										local201 = local103[local239];
										local208 = local103[local239 + 1];
										@Pc(417) int local417;
										for (@Pc(409) int local409 = local201; local409 < local208; local409++) {
											local417 = local106[local409] - 1;
											if (local417 == -1) {
												break;
											}
											if (local78[local417] != 0) {
												local80[local417] += local382;
												local82[local417] += local387;
												local76[local417] += local392;
												local78[local417] += local397;
											}
										}
										local397 = local42[local258];
										local387 = local36[local258];
										local382 = local33[local258];
										local208 = this.anIntArray481[local132 + 1];
										local201 = this.anIntArray481[local132];
										local392 = local39[local258];
										for (local417 = local201; local417 < local208; local417++) {
											@Pc(503) int local503 = this.aShortArray97[local417] - 1;
											if (local503 == -1) {
												break;
											}
											if (local47[local503] != 0) {
												local53[local503] += local382;
												local51[local503] += local387;
												local49[local503] += local392;
												local47[local503] += local397;
											}
										}
										local8.method6823();
										this.method6823();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort91;
	}

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort90 = (short) arg0;
		this.method6824();
	}

	@OriginalMember(owner = "client!qfa", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7843; local7++) {
			if (arg0 == this.aShortArray100[local7]) {
				this.aShortArray100[local7] = arg1;
			}
		}
		if (this.aClass48Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt7821; local38++) {
				@Pc(45) Class48 local45 = this.aClass48Array1[local38];
				@Pc(50) Class106 local50 = this.aClass106Array1[local38];
				local50.anInt3042 = local50.anInt3042 & 0xFF000000 | Static205.anIntArray530[this.aShortArray100[local45.anInt1330] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6824();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!ih;ZII)Z")
	@Override
	public boolean method6800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6820(arg5, arg2, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!qfa", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7850; local15++) {
			@Pc(34) int local34 = this.anIntArray484[local15] * local13 - this.anIntArray485[local15] * local9 >> 14;
			this.anIntArray485[local15] = this.anIntArray484[local15] * local9 + this.anIntArray485[local15] * local13 >> 14;
			this.anIntArray484[local15] = local34;
		}
		this.method6808();
		this.aBoolean563 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6796(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static282.anInt5418 = 0;
			Static330.anInt6252 = 0;
			Static75.anInt1456 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray46.length) {
					local55 = this.anIntArrayArray46[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static282.anInt5418 += this.anIntArray483[local63];
						Static75.anInt1456 += this.anIntArray484[local63];
						Static330.anInt6252 += this.anIntArray485[local63];
						local33++;
					}
				}
			}
			if (local33 > 0) {
				Static282.anInt5418 = Static282.anInt5418 / local33 + local17;
				Static75.anInt1456 = local25 + Static75.anInt1456 / local33;
				Static330.anInt6252 = Static330.anInt6252 / local33 + local21;
			} else {
				Static282.anInt5418 = local17;
				Static75.anInt1456 = local25;
				Static330.anInt6252 = local21;
			}
			return;
		}
		@Pc(160) int[] local160;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray46.length) {
					local160 = this.anIntArrayArray46[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray483[local57] += local17;
						this.anIntArray484[local57] += local25;
						this.anIntArray485[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(301) int local301;
		@Pc(744) int local744;
		@Pc(753) int local753;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray46.length > local35) {
					local160 = this.anIntArrayArray46[local35];
					if ((arg5 & 0x1) == 0) {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray483[local57] -= Static282.anInt5418;
							this.anIntArray484[local57] -= Static75.anInt1456;
							this.anIntArray485[local57] -= Static330.anInt6252;
							if (arg4 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg4];
								local283 = Class3_Sub13.anIntArray146[arg4];
								local301 = this.anIntArray484[local57] * local63 + this.anIntArray483[local57] * local283 + 16383 >> 14;
								this.anIntArray484[local57] = this.anIntArray484[local57] * local283 + 16383 - this.anIntArray483[local57] * local63 >> 14;
								this.anIntArray483[local57] = local301;
							}
							if (arg2 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg2];
								local283 = Class3_Sub13.anIntArray146[arg2];
								local301 = local283 * this.anIntArray484[local57] + 16383 - local63 * this.anIntArray485[local57] >> 14;
								this.anIntArray485[local57] = this.anIntArray485[local57] * local283 + this.anIntArray484[local57] * local63 + 16383 >> 14;
								this.anIntArray484[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg3];
								local283 = Class3_Sub13.anIntArray146[arg3];
								local301 = this.anIntArray485[local57] * local63 + this.anIntArray483[local57] * local283 + 16383 >> 14;
								this.anIntArray485[local57] = this.anIntArray485[local57] * local283 + 16383 - local63 * this.anIntArray483[local57] >> 14;
								this.anIntArray483[local57] = local301;
							}
							this.anIntArray483[local57] += Static282.anInt5418;
							this.anIntArray484[local57] += Static75.anInt1456;
							this.anIntArray485[local57] += Static330.anInt6252;
						}
					} else {
						for (local162 = 0; local162 < local160.length; local162++) {
							local57 = local160[local162];
							this.anIntArray483[local57] -= Static282.anInt5418;
							this.anIntArray484[local57] -= Static75.anInt1456;
							this.anIntArray485[local57] -= Static330.anInt6252;
							if (arg2 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg2];
								local283 = Class3_Sub13.anIntArray146[arg2];
								local301 = this.anIntArray484[local57] * local283 + 16383 - local63 * this.anIntArray485[local57] >> 14;
								this.anIntArray485[local57] = this.anIntArray484[local57] * local63 + this.anIntArray485[local57] * local283 + 16383 >> 14;
								this.anIntArray484[local57] = local301;
							}
							if (arg4 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg4];
								local283 = Class3_Sub13.anIntArray146[arg4];
								local301 = this.anIntArray483[local57] * local283 + this.anIntArray484[local57] * local63 + 16383 >> 14;
								this.anIntArray484[local57] = this.anIntArray484[local57] * local283 + 16383 - local63 * this.anIntArray483[local57] >> 14;
								this.anIntArray483[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub13.anIntArray147[arg3];
								local283 = Class3_Sub13.anIntArray146[arg3];
								local301 = local283 * this.anIntArray483[local57] + local63 * this.anIntArray485[local57] + 16383 >> 14;
								this.anIntArray485[local57] = local283 * this.anIntArray485[local57] + 16383 - this.anIntArray483[local57] * local63 >> 14;
								this.anIntArray483[local57] = local301;
							}
							this.anIntArray483[local57] += Static282.anInt5418;
							this.anIntArray484[local57] += Static75.anInt1456;
							this.anIntArray485[local57] += Static330.anInt6252;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray46.length > local41) {
						local55 = this.anIntArrayArray46[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local283 = this.anIntArray481[local63];
							local301 = this.anIntArray481[local63 + 1];
							for (local744 = local283; local744 < local301; local744++) {
								local753 = this.aShortArray97[local744] - 1;
								if (local753 == -1) {
									break;
								}
								@Pc(763) int local763;
								@Pc(767) int local767;
								@Pc(785) int local785;
								if (arg4 != 0) {
									local763 = Class3_Sub13.anIntArray147[arg4];
									local767 = Class3_Sub13.anIntArray146[arg4];
									local785 = local767 * this.aShortArray99[local753] + this.aShortArray107[local753] * local763 + 16383 >> 14;
									this.aShortArray107[local753] = (short) (this.aShortArray107[local753] * local767 + 16383 - this.aShortArray99[local753] * local763 >> 14);
									this.aShortArray99[local753] = (short) local785;
								}
								if (arg2 != 0) {
									local763 = Class3_Sub13.anIntArray147[arg2];
									local767 = Class3_Sub13.anIntArray146[arg2];
									local785 = local767 * this.aShortArray107[local753] + 16383 - this.aShortArray102[local753] * local763 >> 14;
									this.aShortArray102[local753] = (short) (local767 * this.aShortArray102[local753] + local763 * this.aShortArray107[local753] + 16383 >> 14);
									this.aShortArray107[local753] = (short) local785;
								}
								if (arg3 != 0) {
									local763 = Class3_Sub13.anIntArray147[arg3];
									local767 = Class3_Sub13.anIntArray146[arg3];
									local785 = local763 * this.aShortArray102[local753] + local767 * this.aShortArray99[local753] + 16383 >> 14;
									this.aShortArray102[local753] = (short) (this.aShortArray102[local753] * local767 + 16383 - this.aShortArray99[local753] * local763 >> 14);
									this.aShortArray99[local753] = (short) local785;
								}
							}
						}
					}
				}
				this.method6823();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray46.length > local35) {
					local160 = this.anIntArrayArray46[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local57 = local160[local162];
						this.anIntArray483[local57] -= Static282.anInt5418;
						this.anIntArray484[local57] -= Static75.anInt1456;
						this.anIntArray485[local57] -= Static330.anInt6252;
						this.anIntArray483[local57] = this.anIntArray483[local57] * arg2 >> 7;
						this.anIntArray484[local57] = this.anIntArray484[local57] * arg3 >> 7;
						this.anIntArray485[local57] = this.anIntArray485[local57] * arg4 >> 7;
						this.anIntArray483[local57] += Static282.anInt5418;
						this.anIntArray484[local57] += Static75.anInt1456;
						this.anIntArray485[local57] += Static330.anInt6252;
					}
				}
			}
		} else {
			@Pc(1199) Class106 local1199;
			@Pc(1092) boolean local1092;
			@Pc(1194) Class48 local1194;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local1092 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local283 = (this.aByteArray75[local63] & 0xFF) + arg2 * 8;
								if (local283 < 0) {
									local283 = 0;
								} else if (local283 > 255) {
									local283 = 255;
								}
								this.aByteArray75[local63] = (byte) local283;
							}
							local1092 |= local55.length > 0;
						}
					}
					if (local1092) {
						if (this.aClass48Array1 != null) {
							for (local41 = 0; local41 < this.anInt7821; local41++) {
								local1194 = this.aClass48Array1[local41];
								local1199 = this.aClass106Array1[local41];
								local1199.anInt3042 = 255 - (this.aByteArray75[local1194.anInt1330] & 0xFF) << 24 | local1199.anInt3042 & 0xFFFFFF;
							}
						}
						this.method6824();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local1092 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local55 = this.anIntArrayArray44[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local283 = this.aShortArray100[local63] & 0xFFFF;
								local301 = local283 >> 10 & 0x3F;
								local744 = local283 >> 7 & 0x7;
								local744 += arg3 / 4;
								@Pc(1298) int local1298 = local301 + arg2 & 0x3F;
								local753 = local283 & 0x7F;
								local753 += arg4;
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 7) {
									local744 = 7;
								}
								if (local753 < 0) {
									local753 = 0;
								} else if (local753 > 127) {
									local753 = 127;
								}
								this.aShortArray100[local63] = (short) (local1298 << 10 | local744 << 7 | local753);
							}
							local1092 |= local55.length > 0;
						}
					}
					if (local1092) {
						if (this.aClass48Array1 != null) {
							for (local41 = 0; local41 < this.anInt7821; local41++) {
								local1194 = this.aClass48Array1[local41];
								local1199 = this.aClass106Array1[local41];
								local1199.anInt3042 = Static205.anIntArray530[this.aShortArray100[local1194.anInt1330] & 0xFFFF] & 0xFFFFFF | local1199.anInt3042 & 0xFF000000;
							}
						}
						this.method6824();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray45.length) {
							local160 = this.anIntArrayArray45[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1199 = this.aClass106Array1[local160[local162]];
								local1199.anInt3037 += arg3;
								local1199.anInt3036 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray45.length) {
							local160 = this.anIntArrayArray45[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1199 = this.aClass106Array1[local160[local162]];
								local1199.anInt3041 = local1199.anInt3041 * arg3 >> 7;
								local1199.anInt3038 = local1199.anInt3038 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray45.length) {
						local160 = this.anIntArrayArray45[local35];
						for (local162 = 0; local162 < local160.length; local162++) {
							local1199 = this.aClass106Array1[local160[local162]];
							local1199.anInt3040 = local1199.anInt3040 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub13.anIntArray147[arg0];
		@Pc(13) int local13 = Class3_Sub13.anIntArray146[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7850; local15++) {
			@Pc(34) int local34 = this.anIntArray484[local15] * local9 + local13 * this.anIntArray483[local15] >> 14;
			this.anIntArray484[local15] = this.anIntArray484[local15] * local13 - this.anIntArray483[local15] * local9 >> 14;
			this.anIntArray483[local15] = local34;
		}
		this.method6808();
		this.aBoolean563 = false;
	}
}
