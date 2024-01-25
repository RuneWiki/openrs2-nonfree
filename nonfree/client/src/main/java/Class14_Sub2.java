import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "B")
	private byte aByte113;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "[Lclient!gfa;")
	private Class123[] aClass123Array4;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
	private int anInt8527;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	private int anInt8529;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "[Lclient!pm;")
	private Class285[] aClass285Array1;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "Lclient!at;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
	private int anInt8540;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lclient!tj;")
	private Interface20 anInterface20_3;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!qb", name = "Eb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!qb", name = "Hb", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!qb", name = "Nb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!qb", name = "Ob", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!qb", name = "Sb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!qb", name = "cc", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!qb", name = "ec", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!qb", name = "fc", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!qb", name = "gc", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!qb", name = "jc", descriptor = "[Lclient!qn;")
	private Class303[] aClass303Array1;

	@OriginalMember(owner = "client!qb", name = "lc", descriptor = "Lclient!cq;")
	private Interface2 anInterface2_7;

	@OriginalMember(owner = "client!qb", name = "oc", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!qb", name = "qc", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!qb", name = "sc", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!qb", name = "Bc", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[Lclient!pi;")
	private Class283[] aClass283Array4;

	@OriginalMember(owner = "client!qb", name = "Fc", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
	private int anInt8538 = 0;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
	private int anInt8525 = 0;

	@OriginalMember(owner = "client!qb", name = "Ib", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
	private int anInt8534 = 0;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!qb", name = "mc", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
	private int anInt8583 = 0;

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "Z")
	private boolean aBoolean624 = true;

	@OriginalMember(owner = "client!qb", name = "kc", descriptor = "I")
	private int anInt8573 = 0;

	@OriginalMember(owner = "client!qb", name = "uc", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_29;

	@OriginalMember(owner = "client!qb", name = "Db", descriptor = "Lclient!pc;")
	private Class274 aClass274_15;

	@OriginalMember(owner = "client!qb", name = "kb", descriptor = "Lclient!pc;")
	private Class274 aClass274_14;

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!pc;")
	private Class274 aClass274_13;

	@OriginalMember(owner = "client!qb", name = "Gb", descriptor = "Lclient!pc;")
	private Class274 aClass274_16;

	@OriginalMember(owner = "client!qb", name = "Cc", descriptor = "Lclient!rea;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class14_Sub2(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_29 = arg0;
		this.aClass274_15 = new Class274((Interface2) null, 5126, 3, 0);
		this.aClass274_14 = new Class274((Interface2) null, 5126, 2, 0);
		this.aClass274_13 = new Class274((Interface2) null, 5126, 3, 0);
		this.aClass274_16 = new Class274((Interface2) null, 5121, 4, 0);
		this.aClass311_1 = new Class311();
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!lea;Lclient!ida;IIII)V")
	public Class14_Sub2(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass101_Sub2_29 = arg0;
		this.anInt8540 = arg2;
		this.anInt8529 = arg5;
		if (Static185.method3573(arg5, arg2)) {
			this.aClass274_15 = new Class274((Interface2) null, 5126, 3, 0);
		}
		if (Static401.method6613(arg2, arg5)) {
			this.aClass274_14 = new Class274((Interface2) null, 5126, 2, 0);
		}
		if (Static592.method9189(arg2, arg5)) {
			this.aClass274_13 = new Class274((Interface2) null, 5126, 3, 0);
		}
		if (Static564.method8558(arg5, arg2)) {
			this.aClass274_16 = new Class274((Interface2) null, 5121, 4, 0);
		}
		if (Static52.method1059(arg2, arg5)) {
			this.aClass311_1 = new Class311();
		}
		@Pc(108) Interface3 local108 = arg0.anInterface3_12;
		@Pc(112) int[] local112 = new int[arg1.anInt4810];
		this.anIntArray435 = new int[arg1.anInt4817 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt4810; local121++) {
			if (arg1.aByteArray38 == null || arg1.aByteArray38[local121] != 2) {
				if (arg1.aShortArray66 != null && arg1.aShortArray66[local121] != -1) {
					@Pc(153) Class136 local153 = local108.method1941(arg1.aShortArray66[local121] & 0xFFFF);
					if (((this.anInt8529 & 0x40) == 0 || !local153.aBoolean329) && local153.aBoolean332) {
						continue;
					}
				}
				local112[this.anInt8534++] = local121;
				this.anIntArray435[arg1.aShortArray68[local121]]++;
				this.anIntArray435[arg1.aShortArray69[local121]]++;
				this.anIntArray435[arg1.aShortArray64[local121]]++;
			}
		}
		this.anInt8573 = this.anInt8534;
		@Pc(229) long[] local229 = new long[this.anInt8534];
		@Pc(241) boolean local241 = (this.anInt8540 & 0x100) != 0;
		@Pc(253) int local253;
		@Pc(266) int local266;
		@Pc(445) int local445;
		for (@Pc(243) int local243 = 0; local243 < this.anInt8534; local243++) {
			@Pc(249) int local249 = local112[local243];
			@Pc(251) Class136 local251 = null;
			local253 = 0;
			@Pc(255) byte local255 = 0;
			@Pc(257) byte local257 = 0;
			@Pc(259) byte local259 = 0;
			if (arg1.aClass161Array1 != null) {
				@Pc(264) boolean local264 = false;
				for (local266 = 0; local266 < arg1.aClass161Array1.length; local266++) {
					@Pc(273) Class161 local273 = arg1.aClass161Array1[local266];
					if (local249 == local273.anInt4867) {
						@Pc(286) Class250 local286 = Static346.method5998(local273.anInt4866);
						if (local286.aBoolean561) {
							local264 = true;
						}
						if (local286.anInt7541 != -1) {
							@Pc(301) Class136 local301 = local108.method1941(local286.anInt7541);
							if (local301.anInt4370 == 2) {
								this.aBoolean626 = true;
							}
						}
					}
				}
				if (local264) {
					local229[local243] = Long.MAX_VALUE;
					this.anInt8573--;
					continue;
				}
			}
			@Pc(330) short local330 = -1;
			if (arg1.aShortArray66 != null) {
				local330 = arg1.aShortArray66[local249];
				if (local330 != -1) {
					local251 = local108.method1941(local330 & 0xFFFF);
					if ((this.anInt8529 & 0x40) != 0 && local251.aBoolean329) {
						local330 = -1;
						local251 = null;
					} else {
						local259 = local251.aByte64;
						if (local251.aByte61 != 0 || local251.aByte65 != 0) {
							this.aBoolean625 = true;
						}
						local257 = local251.aByte62;
					}
				}
			}
			@Pc(401) boolean local401 = arg1.aByteArray42 != null && arg1.aByteArray42[local249] != 0 || local251 != null && local251.anInt4370 != 0;
			if ((local241 || local401) && arg1.aByteArray43 != null) {
				local253 += arg1.aByteArray43[local249] << 17;
			}
			if (local401) {
				local253 += 65536;
			}
			local253 += (local257 & 0xFF) << 8;
			local253 += local259 & 0xFF;
			local445 = local255 + ((local330 & 0xFFFF) << 16);
			@Pc(451) int local451 = local445 + (local243 & 0xFFFF);
			local229[local243] = (long) local451 + ((long) local253 << 32);
			this.aBoolean626 |= local401;
			this.aBoolean625 |= local251 != null && (local251.aByte61 != 0 || local251.aByte65 != 0);
		}
		Static552.method8466(local229, local112);
		this.aShortArray110 = arg1.aShortArray65;
		this.anIntArray438 = arg1.anIntArray234;
		this.anIntArray434 = arg1.anIntArray229;
		this.anInt8538 = arg1.anInt4817;
		this.anInt8525 = arg1.anInt4804;
		this.anIntArray436 = arg1.anIntArray235;
		this.aClass123Array4 = arg1.aClass123Array3;
		@Pc(524) Class332[] local524 = new Class332[this.anInt8538];
		this.aClass283Array4 = arg1.aClass283Array3;
		@Pc(548) int local548;
		@Pc(562) int local562;
		@Pc(608) int local608;
		if (arg1.aClass161Array1 != null) {
			this.anInt8527 = arg1.aClass161Array1.length;
			this.aClass303Array1 = new Class303[this.anInt8527];
			this.aClass285Array1 = new Class285[this.anInt8527];
			for (local548 = 0; local548 < this.anInt8527; local548++) {
				@Pc(555) Class161 local555 = arg1.aClass161Array1[local548];
				@Pc(560) Class250 local560 = Static346.method5998(local555.anInt4866);
				local562 = -1;
				for (@Pc(564) int local564 = 0; local564 < this.anInt8534; local564++) {
					if (local112[local564] == local555.anInt4867) {
						local562 = local564;
						break;
					}
				}
				if (local562 == -1) {
					throw new RuntimeException();
				}
				local608 = Static101.anIntArray92[arg1.aShortArray67[local555.anInt4867] & 0xFFFF] & 0xFFFFFF;
				@Pc(626) int local626 = local608 | 255 - (arg1.aByteArray42 == null ? 0 : arg1.aByteArray42[local555.anInt4867]) << 24;
				this.aClass285Array1[local548] = new Class285(local562, arg1.aShortArray68[local555.anInt4867], arg1.aShortArray69[local555.anInt4867], arg1.aShortArray64[local555.anInt4867], local560.anInt7543, local560.anInt7544, local560.anInt7541, local560.anInt7542, local560.anInt7547, local560.aBoolean561, local560.aBoolean562, local555.anInt4868);
				this.aClass303Array1[local548] = new Class303(local626);
			}
		}
		local548 = this.anInt8534 * 3;
		this.aShortArray106 = new short[this.anInt8534];
		this.aShortArray113 = new short[local548];
		if (arg1.aShortArray70 != null) {
			this.aShortArray107 = new short[this.anInt8534];
		}
		Static198.aLongArray10 = new long[local548];
		this.aShort91 = (short) arg4;
		this.lb = new short[local548];
		this.aShortArray111 = new short[this.anInt8534];
		this.aFloatArray55 = new float[local548];
		this.aShortArray114 = new short[this.anInt8534];
		this.aShort92 = (short) arg3;
		this.aByteArray75 = new byte[local548];
		this.aShortArray112 = new short[local548];
		this.aByteArray76 = new byte[this.anInt8534];
		this.aShortArray105 = new short[this.anInt8534];
		this.aShortArray109 = new short[this.anInt8534];
		this.aFloatArray56 = new float[local548];
		this.aShortArray108 = new short[local548];
		local253 = 0;
		for (local445 = 0; local445 < arg1.anInt4817; local445++) {
			local562 = this.anIntArray435[local445];
			this.anIntArray435[local445] = local253;
			local524[local445] = new Class332();
			local253 += local562;
		}
		this.anIntArray435[arg1.anInt4817] = local253;
		@Pc(812) Class306 local812 = Static156.method3185(this.anInt8534, arg1, local112);
		@Pc(816) Class294[] local816 = new Class294[arg1.anInt4810];
		@Pc(856) int local856;
		@Pc(867) int local867;
		@Pc(889) int local889;
		@Pc(899) int local899;
		@Pc(908) int local908;
		@Pc(917) int local917;
		@Pc(835) short local835;
		@Pc(845) int local845;
		for (local608 = 0; local608 < arg1.anInt4810; local608++) {
			@Pc(825) short local825 = arg1.aShortArray68[local608];
			@Pc(830) short local830 = arg1.aShortArray69[local608];
			local835 = arg1.aShortArray64[local608];
			local845 = this.anIntArray434[local830] - this.anIntArray434[local825];
			local856 = this.anIntArray438[local830] - this.anIntArray438[local825];
			local867 = this.anIntArray436[local830] - this.anIntArray436[local825];
			@Pc(878) int local878 = this.anIntArray434[local835] - this.anIntArray434[local825];
			local889 = this.anIntArray438[local835] - this.anIntArray438[local825];
			local899 = this.anIntArray436[local835] - this.anIntArray436[local825];
			local908 = local856 * local899 - local889 * local867;
			local917 = local867 * local878 - local845 * local899;
			@Pc(926) int local926 = local889 * local845 - local856 * local878;
			while (local908 > 8192 || local917 > 8192 || local926 > 8192 || local908 < -8192 || local917 < -8192 || local926 < -8192) {
				local908 >>= 0x1;
				local926 >>= 0x1;
				local917 >>= 0x1;
			}
			@Pc(977) int local977 = (int) Math.sqrt((double) (local926 * local926 + local917 * local917 + local908 * local908));
			if (local977 <= 0) {
				local977 = 1;
			}
			local917 = local917 * 256 / local977;
			local926 = local926 * 256 / local977;
			local908 = local908 * 256 / local977;
			@Pc(1009) byte local1009 = arg1.aByteArray38 == null ? 0 : arg1.aByteArray38[local608];
			if (local1009 == 0) {
				@Pc(1018) Class332 local1018 = local524[local825];
				local1018.anInt9464 += local917;
				local1018.anInt9461++;
				local1018.anInt9468 += local908;
				local1018.anInt9465 += local926;
				@Pc(1046) Class332 local1046 = local524[local830];
				local1046.anInt9464 += local917;
				local1046.anInt9468 += local908;
				local1046.anInt9461++;
				local1046.anInt9465 += local926;
				@Pc(1074) Class332 local1074 = local524[local835];
				local1074.anInt9461++;
				local1074.anInt9465 += local926;
				local1074.anInt9468 += local908;
				local1074.anInt9464 += local917;
			} else if (local1009 == 1) {
				@Pc(1111) Class294 local1111 = local816[local608] = new Class294();
				local1111.anInt8609 = local917;
				local1111.anInt8610 = local908;
				local1111.anInt8607 = local926;
			}
		}
		@Pc(1133) int local1133;
		@Pc(1176) short local1176;
		for (local266 = 0; local266 < this.anInt8534; local266++) {
			local1133 = local112[local266];
			@Pc(1140) int local1140 = arg1.aShortArray67[local1133] & 0xFFFF;
			if (arg1.aByteArray44 == null) {
				local845 = -1;
			} else {
				local845 = arg1.aByteArray44[local1133];
			}
			if (arg1.aByteArray42 == null) {
				local856 = 0;
			} else {
				local856 = arg1.aByteArray42[local1133] & 0xFF;
			}
			local1176 = arg1.aShortArray66 == null ? -1 : arg1.aShortArray66[local1133];
			if (local1176 != -1 && (this.anInt8529 & 0x40) != 0) {
				@Pc(1192) Class136 local1192 = local108.method1941(local1176 & 0xFFFF);
				if (local1192.aBoolean329) {
					local1176 = -1;
				}
			}
			@Pc(1199) float local1199 = 0.0F;
			@Pc(1201) float local1201 = 0.0F;
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) byte local1211 = 0;
			@Pc(1213) byte local1213 = 0;
			@Pc(1215) int local1215 = 0;
			@Pc(1231) byte local1231;
			@Pc(1251) short local1251;
			@Pc(2046) short local2046;
			@Pc(2051) short local2051;
			if (local1176 != -1) {
				if (local845 == -1) {
					local1201 = 1.0F;
					local1199 = 0.0F;
					local1209 = 0.0F;
					local1205 = 1.0F;
					local1211 = 1;
					local1203 = 1.0F;
					local1213 = 2;
					local1207 = 0.0F;
				} else {
					local845 &= 0xFF;
					local1231 = arg1.aByteArray40[local845];
					@Pc(1241) short local1241;
					@Pc(1246) short local1246;
					@Pc(1284) float local1284;
					@Pc(1300) float local1300;
					@Pc(1308) float local1308;
					@Pc(1408) float local1408;
					@Pc(1416) float local1416;
					@Pc(1424) float local1424;
					@Pc(1447) float local1447;
					@Pc(1470) float local1470;
					@Pc(1493) float local1493;
					if (local1231 == 0) {
						local1241 = arg1.aShortArray68[local1133];
						local1246 = arg1.aShortArray69[local1133];
						local1251 = arg1.aShortArray64[local1133];
						local2046 = arg1.aShortArray63[local845];
						local2051 = arg1.aShortArray61[local845];
						@Pc(2056) short local2056 = arg1.aShortArray62[local845];
						@Pc(2062) float local2062 = (float) arg1.anIntArray229[local2046];
						@Pc(2068) float local2068 = (float) arg1.anIntArray234[local2046];
						local1284 = (float) arg1.anIntArray235[local2046];
						local1300 = (float) arg1.anIntArray229[local2051] - local2062;
						local1308 = (float) arg1.anIntArray234[local2051] - local2068;
						@Pc(2099) float local2099 = (float) arg1.anIntArray235[local2051] - local1284;
						@Pc(2108) float local2108 = (float) arg1.anIntArray229[local2056] - local2062;
						@Pc(2116) float local2116 = (float) arg1.anIntArray234[local2056] - local2068;
						@Pc(2124) float local2124 = (float) arg1.anIntArray235[local2056] - local1284;
						@Pc(2132) float local2132 = (float) arg1.anIntArray229[local1241] - local2062;
						@Pc(2140) float local2140 = (float) arg1.anIntArray234[local1241] - local2068;
						@Pc(2148) float local2148 = (float) arg1.anIntArray235[local1241] - local1284;
						@Pc(2156) float local2156 = (float) arg1.anIntArray229[local1246] - local2062;
						@Pc(2164) float local2164 = (float) arg1.anIntArray234[local1246] - local2068;
						local1408 = (float) arg1.anIntArray235[local1246] - local1284;
						local1416 = (float) arg1.anIntArray229[local1251] - local2062;
						local1424 = (float) arg1.anIntArray234[local1251] - local2068;
						local1447 = (float) arg1.anIntArray235[local1251] - local1284;
						local1470 = local2124 * local1308 - local2116 * local2099;
						local1493 = local2099 * local2108 - local2124 * local1300;
						@Pc(2225) float local2225 = local1300 * local2116 - local2108 * local1308;
						@Pc(2234) float local2234 = local2225 * local2116 - local1493 * local2124;
						@Pc(2243) float local2243 = local1470 * local2124 - local2108 * local2225;
						@Pc(2252) float local2252 = local1493 * local2108 - local2116 * local1470;
						@Pc(2266) float local2266 = 1.0F / (local2252 * local2099 + local1300 * local2234 + local1308 * local2243);
						local1207 = local2266 * (local2243 * local1424 + local2234 * local1416 + local2252 * local1447);
						local1199 = (local2148 * local2252 + local2243 * local2140 + local2234 * local2132) * local2266;
						local1203 = local2266 * (local1408 * local2252 + local2243 * local2164 + local2156 * local2234);
						@Pc(2317) float local2317 = local2225 * local1308 - local2099 * local1493;
						@Pc(2326) float local2326 = local1300 * local1493 - local1308 * local1470;
						@Pc(2334) float local2334 = local2099 * local1470 - local2225 * local1300;
						@Pc(2348) float local2348 = 1.0F / (local2326 * local2124 + local2317 * local2108 + local2334 * local2116);
						local1201 = local2348 * (local2326 * local2148 + local2334 * local2140 + local2132 * local2317);
						local1205 = local2348 * (local2326 * local1408 + local2164 * local2334 + local2156 * local2317);
						local1209 = (local2326 * local1447 + local1416 * local2317 + local2334 * local1424) * local2348;
					} else {
						local1241 = arg1.aShortArray68[local1133];
						local1246 = arg1.aShortArray69[local1133];
						local1251 = arg1.aShortArray64[local1133];
						@Pc(1256) int local1256 = local812.anIntArray444[local845];
						@Pc(1261) int local1261 = local812.anIntArray445[local845];
						@Pc(1266) int local1266 = local812.anIntArray447[local845];
						@Pc(1271) float[] local1271 = local812.aFloatArrayArray14[local845];
						@Pc(1276) byte local1276 = arg1.aByteArray41[local845];
						local1284 = (float) arg1.anIntArray227[local845] / 256.0F;
						if (local1231 == 1) {
							local1300 = (float) arg1.anIntArray228[local845] / 1024.0F;
							Static350.method6051(arg1.anIntArray234[local1241], arg1.anIntArray229[local1241], arg1.anIntArray235[local1241], Static31.aFloatArray1, local1261, local1284, local1276, local1271, local1266, local1300, local1256);
							local1201 = Static31.aFloatArray1[1];
							local1199 = Static31.aFloatArray1[0];
							Static350.method6051(arg1.anIntArray234[local1246], arg1.anIntArray229[local1246], arg1.anIntArray235[local1246], Static31.aFloatArray1, local1261, local1284, local1276, local1271, local1266, local1300, local1256);
							local1205 = Static31.aFloatArray1[1];
							local1203 = Static31.aFloatArray1[0];
							Static350.method6051(arg1.anIntArray234[local1251], arg1.anIntArray229[local1251], arg1.anIntArray235[local1251], Static31.aFloatArray1, local1261, local1284, local1276, local1271, local1266, local1300, local1256);
							local1207 = Static31.aFloatArray1[0];
							local1209 = Static31.aFloatArray1[1];
							local1308 = local1300 / 2.0F;
							if ((local1276 & 0x1) == 0) {
								if (local1203 - local1199 > local1308) {
									local1211 = 1;
									local1203 -= local1300;
								} else if (local1308 < local1199 - local1203) {
									local1211 = 2;
									local1203 += local1300;
								}
								if (local1308 < local1207 - local1199) {
									local1213 = 1;
									local1207 -= local1300;
								} else if (local1199 - local1207 > local1308) {
									local1213 = 2;
									local1207 += local1300;
								}
							} else {
								if (local1209 - local1201 > local1308) {
									local1209 -= local1300;
									local1213 = 1;
								} else if (local1201 - local1209 > local1308) {
									local1209 += local1300;
									local1213 = 2;
								}
								if (local1308 < local1205 - local1201) {
									local1205 -= local1300;
									local1211 = 1;
								} else if (local1201 - local1205 > local1308) {
									local1205 += local1300;
									local1211 = 2;
								}
							}
						} else if (local1231 == 2) {
							local1300 = (float) arg1.anIntArray233[local845] / 256.0F;
							local1308 = (float) arg1.anIntArray230[local845] / 256.0F;
							@Pc(1319) int local1319 = arg1.anIntArray229[local1246] - arg1.anIntArray229[local1241];
							@Pc(1329) int local1329 = arg1.anIntArray234[local1246] - arg1.anIntArray234[local1241];
							@Pc(1340) int local1340 = arg1.anIntArray235[local1246] - arg1.anIntArray235[local1241];
							@Pc(1351) int local1351 = arg1.anIntArray229[local1251] - arg1.anIntArray229[local1241];
							@Pc(1362) int local1362 = arg1.anIntArray234[local1251] - arg1.anIntArray234[local1241];
							@Pc(1373) int local1373 = arg1.anIntArray235[local1251] - arg1.anIntArray235[local1241];
							@Pc(1382) int local1382 = local1373 * local1329 - local1362 * local1340;
							@Pc(1391) int local1391 = local1340 * local1351 - local1319 * local1373;
							@Pc(1400) int local1400 = local1362 * local1319 - local1351 * local1329;
							local1408 = 64.0F / (float) arg1.anIntArray231[local845];
							local1416 = 64.0F / (float) arg1.anIntArray236[local845];
							local1424 = 64.0F / (float) arg1.anIntArray228[local845];
							local1447 = ((float) local1400 * local1271[2] + (float) local1382 * local1271[0] + (float) local1391 * local1271[1]) / local1408;
							local1470 = (local1271[5] * (float) local1400 + (float) local1391 * local1271[4] + local1271[3] * (float) local1382) / local1416;
							local1493 = (local1271[7] * (float) local1391 + local1271[6] * (float) local1382 + (float) local1400 * local1271[8]) / local1424;
							local1215 = Static625.method9290(local1470, local1493, local1447);
							Static621.method9242(arg1.anIntArray229[local1241], local1271, local1266, arg1.anIntArray235[local1241], local1284, local1261, local1276, local1308, local1215, local1256, local1300, Static31.aFloatArray1, arg1.anIntArray234[local1241]);
							local1199 = Static31.aFloatArray1[0];
							local1201 = Static31.aFloatArray1[1];
							Static621.method9242(arg1.anIntArray229[local1246], local1271, local1266, arg1.anIntArray235[local1246], local1284, local1261, local1276, local1308, local1215, local1256, local1300, Static31.aFloatArray1, arg1.anIntArray234[local1246]);
							local1205 = Static31.aFloatArray1[1];
							local1203 = Static31.aFloatArray1[0];
							Static621.method9242(arg1.anIntArray229[local1251], local1271, local1266, arg1.anIntArray235[local1251], local1284, local1261, local1276, local1308, local1215, local1256, local1300, Static31.aFloatArray1, arg1.anIntArray234[local1251]);
							local1209 = Static31.aFloatArray1[1];
							local1207 = Static31.aFloatArray1[0];
						} else if (local1231 == 3) {
							Static652.method9569(local1276, local1284, arg1.anIntArray235[local1241], Static31.aFloatArray1, arg1.anIntArray234[local1241], local1261, arg1.anIntArray229[local1241], local1271, local1266, local1256);
							local1199 = Static31.aFloatArray1[0];
							local1201 = Static31.aFloatArray1[1];
							Static652.method9569(local1276, local1284, arg1.anIntArray235[local1246], Static31.aFloatArray1, arg1.anIntArray234[local1246], local1261, arg1.anIntArray229[local1246], local1271, local1266, local1256);
							local1203 = Static31.aFloatArray1[0];
							local1205 = Static31.aFloatArray1[1];
							Static652.method9569(local1276, local1284, arg1.anIntArray235[local1251], Static31.aFloatArray1, arg1.anIntArray234[local1251], local1261, arg1.anIntArray229[local1251], local1271, local1266, local1256);
							local1209 = Static31.aFloatArray1[1];
							local1207 = Static31.aFloatArray1[0];
							if ((local1276 & 0x1) == 0) {
								if (local1203 - local1199 > 0.5F) {
									local1203--;
									local1211 = 1;
								} else if (local1199 - local1203 > 0.5F) {
									local1203++;
									local1211 = 2;
								}
								if (local1207 - local1199 > 0.5F) {
									local1213 = 1;
									local1207--;
								} else if (local1199 - local1207 > 0.5F) {
									local1213 = 2;
									local1207++;
								}
							} else {
								if (local1209 - local1201 > 0.5F) {
									local1213 = 1;
									local1209--;
								} else if (local1201 - local1209 > 0.5F) {
									local1213 = 2;
									local1209++;
								}
								if (local1205 - local1201 > 0.5F) {
									local1211 = 1;
									local1205--;
								} else if (local1201 - local1205 > 0.5F) {
									local1211 = 2;
									local1205++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray38 == null) {
				local1231 = 0;
			} else {
				local1231 = arg1.aByteArray38[local1133];
			}
			if (local1231 == 0) {
				@Pc(2446) long local2446 = (long) (local845 << 2) + ((long) (local1140 << 8) + (long) (local1215 << 24) + (long) local856 << 32);
				local1251 = arg1.aShortArray68[local1133];
				local2046 = arg1.aShortArray69[local1133];
				local2051 = arg1.aShortArray64[local1133];
				@Pc(2465) Class332 local2465 = local524[local1251];
				this.aShortArray109[local266] = this.method7608(local2465.anInt9461, local1251, local2465.anInt9464, arg1, local2465.anInt9465, local1201, local2465.anInt9468, local2446, local1199);
				@Pc(2489) Class332 local2489 = local524[local2046];
				this.aShortArray111[local266] = this.method7608(local2489.anInt9461, local2046, local2489.anInt9464, arg1, local2489.anInt9465, local1205, local2489.anInt9468, local2446 + (long) local1211, local1203);
				@Pc(2516) Class332 local2516 = local524[local2051];
				this.aShortArray105[local266] = this.method7608(local2516.anInt9461, local2051, local2516.anInt9464, arg1, local2516.anInt9465, local1209, local2516.anInt9468, (long) local1213 + local2446, local1207);
			} else if (local1231 == 1) {
				@Pc(2550) Class294 local2550 = local816[local1133];
				@Pc(2593) long local2593 = (long) ((local2550.anInt8609 + 256 << 12) + (local845 << 2) + (local2550.anInt8610 <= 0 ? 2048 : 1024) + (local2550.anInt8607 + 256 << 22)) + ((long) (local1140 << 8) + (long) (local1215 << 24) + (long) local856 << 32);
				this.aShortArray109[local266] = this.method7608(0, arg1.aShortArray68[local1133], local2550.anInt8609, arg1, local2550.anInt8607, local1201, local2550.anInt8610, local2593, local1199);
				this.aShortArray111[local266] = this.method7608(0, arg1.aShortArray69[local1133], local2550.anInt8609, arg1, local2550.anInt8607, local1205, local2550.anInt8610, (long) local1211 + local2593, local1203);
				this.aShortArray105[local266] = this.method7608(0, arg1.aShortArray64[local1133], local2550.anInt8609, arg1, local2550.anInt8607, local1209, local2550.anInt8610, local2593 + (long) local1213, local1207);
			}
			if (arg1.aByteArray42 != null) {
				this.aByteArray76[local266] = arg1.aByteArray42[local1133];
			}
			if (arg1.aShortArray70 != null) {
				this.aShortArray107[local266] = arg1.aShortArray70[local1133];
			}
			this.aShortArray114[local266] = arg1.aShortArray67[local1133];
			this.aShortArray106[local266] = local1176;
		}
		local1133 = 0;
		local835 = -10000;
		for (local845 = 0; local845 < this.anInt8573; local845++) {
			@Pc(2722) short local2722 = this.aShortArray106[local845];
			if (local2722 != local835) {
				local1133++;
				local835 = local2722;
			}
		}
		this.anIntArray437 = new int[local1133 + 1];
		local1133 = 0;
		local835 = -10000;
		for (local856 = 0; local856 < this.anInt8573; local856++) {
			local1176 = this.aShortArray106[local856];
			if (local835 != local1176) {
				this.anIntArray437[local1133++] = local856;
				local835 = local1176;
			}
		}
		this.anIntArray437[local1133] = this.anInt8573;
		Static198.aLongArray10 = null;
		this.aShortArray112 = Static97.method1660(this.anInt8583, this.aShortArray112);
		this.lb = Static97.method1660(this.anInt8583, this.lb);
		this.aShortArray113 = Static97.method1660(this.anInt8583, this.aShortArray113);
		this.aByteArray75 = Static93.method9379(this.anInt8583, this.aByteArray75);
		this.aFloatArray56 = Static141.method2459(this.anInt8583, this.aFloatArray56);
		this.aFloatArray55 = Static141.method2459(this.anInt8583, this.aFloatArray55);
		if (arg1.anIntArray226 != null && Static472.method7523(arg2, this.anInt8529)) {
			this.anIntArrayArray40 = arg1.method4365(false);
		}
		if (arg1.aClass161Array1 != null && Static63.method1171(this.anInt8529, arg2)) {
			this.anIntArrayArray39 = arg1.method4353();
		}
		if (arg1.anIntArray232 != null && Static76.method1371(this.anInt8529, arg2)) {
			local867 = 0;
			@Pc(2875) int[] local2875 = new int[256];
			for (local889 = 0; local889 < this.anInt8534; local889++) {
				local899 = arg1.anIntArray232[local112[local889]];
				if (local899 >= 0) {
					@Pc(2892) int local2892 = local2875[local899]++;
					if (local867 < local899) {
						local867 = local899;
					}
				}
			}
			this.anIntArrayArray41 = new int[local867 + 1][];
			for (local899 = 0; local899 <= local867; local899++) {
				this.anIntArrayArray41[local899] = new int[local2875[local899]];
				local2875[local899] = 0;
			}
			for (local908 = 0; local908 < this.anInt8534; local908++) {
				local917 = arg1.anIntArray232[local112[local908]];
				if (local917 >= 0) {
					this.anIntArrayArray41[local917][local2875[local917]++] = local908;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt8540;
	}

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8538; local15++) {
			local34 = local9 * this.anIntArray436[local15] + this.anIntArray434[local15] * local13 >> 14;
			this.anIntArray436[local15] = local13 * this.anIntArray436[local15] - this.anIntArray434[local15] * local9 >> 14;
			this.anIntArray434[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt8583; local34++) {
			@Pc(88) int local88 = this.aShortArray112[local34] * local13 + local9 * this.aShortArray113[local34] >> 14;
			this.aShortArray113[local34] = (short) (this.aShortArray113[local34] * local13 - local9 * this.aShortArray112[local34] >> 14);
			this.aShortArray112[local34] = (short) local88;
		}
		if (this.aClass274_13 == null && this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
		if (this.aClass274_13 != null) {
			this.aClass274_13.anInterface2_6 = null;
		}
		this.aBoolean623 = false;
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8538; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray434[local15] + this.anIntArray436[local15] * local9 >> 14;
			this.anIntArray436[local15] = local13 * this.anIntArray436[local15] - this.anIntArray434[local15] * local9 >> 14;
			this.anIntArray434[local15] = local33;
		}
		this.aBoolean623 = false;
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean623) {
			this.method7600();
		}
		@Pc(16) int local16 = arg4 + this.aShort90;
		@Pc(21) int local21 = this.aShort84 + arg4;
		@Pc(26) int local26 = this.aShort89 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort93;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9741 <= local21 + arg2.anInt9739 >> arg2.anInt9740 || local26 < 0 || arg2.anInt9742 <= local32 + arg2.anInt9739 >> arg2.anInt9740)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9741 <= local21 + arg3.anInt9739 >> arg3.anInt9740 || local26 < 0 || local32 + arg3.anInt9739 >> arg3.anInt9740 >= arg3.anInt9742) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9740;
			local21 = arg2.anInt9739 + local21 - 1 >> arg2.anInt9740;
			local26 >>= arg2.anInt9740;
			local32 = arg2.anInt9739 + local32 - 1 >> arg2.anInt9740;
			if (arg2.method8537(local26, local16) == arg5 && arg2.method8537(local26, local21) == arg5 && arg2.method8537(local32, local16) == arg5 && arg2.method8537(local32, local21) == arg5) {
				return;
			}
		}
		@Pc(208) int local208;
		if (arg0 == 1) {
			for (local208 = 0; local208 < this.anInt8538; local208++) {
				this.anIntArray438[local208] = this.anIntArray438[local208] + arg2.method8542(arg6 + this.anIntArray436[local208], arg4 + this.anIntArray434[local208]) - arg5;
			}
		} else {
			@Pc(271) int local271;
			@Pc(280) int local280;
			if (arg0 == 2) {
				@Pc(478) short local478 = this.aShort88;
				if (local478 == 0) {
					return;
				}
				for (local271 = 0; local271 < this.anInt8538; local271++) {
					local280 = (this.anIntArray438[local271] << 16) / local478;
					if (arg1 > local280) {
						this.anIntArray438[local271] += (arg1 - local280) * (arg2.method8542(arg6 + this.anIntArray436[local271], arg4 + this.anIntArray434[local271]) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(287) int local287;
				if (arg0 == 3) {
					local208 = (arg1 & 0xFF) * 4;
					local271 = (arg1 >> 8 & 0xFF) * 4;
					local280 = (arg1 >> 16 & 0xFF) << 6;
					local287 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local208 >> 1) < 0 || arg2.anInt9741 << arg2.anInt9740 <= arg4 + (local208 >> 1) + arg2.anInt9739 || arg6 - (local271 >> 1) < 0 || (local271 >> 1) + arg6 + arg2.anInt9739 >= arg2.anInt9742 << arg2.anInt9740) {
						return;
					}
					this.method8637(local287, arg5, local208, local271, local280, arg4, arg6, arg2);
				} else if (arg0 == 4) {
					local208 = this.aShort87 - this.aShort88;
					for (local271 = 0; local271 < this.anInt8538; local271++) {
						this.anIntArray438[local271] = local208 + this.anIntArray438[local271] + arg3.method8542(this.anIntArray436[local271] + arg6, arg4 + this.anIntArray434[local271]) - arg5;
					}
				} else if (arg0 == 5) {
					local208 = this.aShort87 - this.aShort88;
					for (local271 = 0; local271 < this.anInt8538; local271++) {
						local280 = this.anIntArray434[local271] + arg4;
						local287 = arg6 + this.anIntArray436[local271];
						@Pc(293) int local293 = arg2.method8542(local287, local280);
						@Pc(299) int local299 = arg3.method8542(local287, local280);
						@Pc(306) int local306 = local293 - local299 - arg1;
						this.anIntArray438[local271] = local293 + (local306 * ((this.anIntArray438[local271] << 8) / local208) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!qb", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8538; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray434[local15] + local9 * this.anIntArray438[local15] >> 14;
			this.anIntArray438[local15] = this.anIntArray438[local15] * local13 - local9 * this.anIntArray434[local15] >> 14;
			this.anIntArray434[local15] = local33;
		}
		this.aBoolean623 = false;
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()Z")
	@Override
	public boolean method8635() {
		if (this.aShortArray106 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray106.length; local12++) {
			if (this.aShortArray106[local12] != -1 && !this.aClass101_Sub2_29.anInterface3_12.method1940(this.aShortArray106[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dm;Lclient!et;II)V")
	@Override
	public void method8623(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8583 == 0) {
			return;
		}
		@Pc(13) Class76_Sub1 local13 = this.aClass101_Sub2_29.aClass76_Sub1_3;
		if (!this.aBoolean623) {
			this.method7600();
		}
		@Pc(22) Class76_Sub1 local22 = (Class76_Sub1) arg0;
		Static114.aFloat31 = local22.aFloat97 * local13.aFloat95 + local22.aFloat96 * local13.aFloat103 + local22.aFloat95 * local13.aFloat102;
		Static102.aFloat28 = local13.aFloat102 * local22.aFloat93 + local13.aFloat103 * local22.aFloat94 + local13.aFloat95 * local22.aFloat104 + local13.aFloat93;
		@Pc(69) float local69 = Static114.aFloat31 * (float) this.aShort88 + Static102.aFloat28;
		@Pc(77) float local77 = Static102.aFloat28 + Static114.aFloat31 * (float) this.aShort87;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort85 + local77;
			local94 = (float) this.aShort85 + local69;
		} else {
			local88 = local69 - (float) this.aShort85;
			local94 = (float) this.aShort85 + local77;
		}
		if (local88 >= this.aClass101_Sub2_29.aFloat136 || local94 <= (float) this.aClass101_Sub2_29.anInt6338) {
			return;
		}
		Static385.aFloat161 = local22.aFloat96 * local13.aFloat98 + local22.aFloat97 * local13.aFloat96 + local22.aFloat95 * local13.aFloat99;
		Static315.aFloat115 = local22.aFloat93 * local13.aFloat99 + local13.aFloat98 * local22.aFloat94 + local13.aFloat96 * local22.aFloat104 + local13.aFloat94;
		@Pc(170) float local170 = Static385.aFloat161 * (float) this.aShort88 + Static315.aFloat115;
		@Pc(178) float local178 = Static315.aFloat115 + Static385.aFloat161 * (float) this.aShort87;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local170 > local178) {
			local193 = (float) this.aClass101_Sub2_29.anInt6347 * (local178 - (float) this.aShort85);
			local204 = (float) this.aClass101_Sub2_29.anInt6347 * (local170 + (float) this.aShort85);
		} else {
			local193 = (local170 - (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6347;
			local204 = (float) this.aClass101_Sub2_29.anInt6347 * (local178 + (float) this.aShort85);
		}
		if (this.aClass101_Sub2_29.aFloat138 <= local193 / (float) arg2 || this.aClass101_Sub2_29.aFloat135 >= local204 / (float) arg2) {
			return;
		}
		Static172.aFloat77 = local22.aFloat93 * local13.aFloat100 + local22.aFloat94 * local13.aFloat101 + local13.aFloat97 * local22.aFloat104 + local13.aFloat104;
		Static256.aFloat191 = local13.aFloat97 * local22.aFloat97 + local22.aFloat96 * local13.aFloat101 + local22.aFloat95 * local13.aFloat100;
		@Pc(295) float local295 = Static172.aFloat77 + Static256.aFloat191 * (float) this.aShort88;
		@Pc(303) float local303 = Static256.aFloat191 * (float) this.aShort87 + Static172.aFloat77;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local295 > local303) {
			local318 = (local303 - (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6336;
			local329 = (float) this.aClass101_Sub2_29.anInt6336 * (local295 + (float) this.aShort85);
		} else {
			local329 = (float) this.aClass101_Sub2_29.anInt6336 * (local303 + (float) this.aShort85);
			local318 = (float) this.aClass101_Sub2_29.anInt6336 * (local295 - (float) this.aShort85);
		}
		if (this.aClass101_Sub2_29.aFloat139 <= local318 / (float) arg2 || this.aClass101_Sub2_29.aFloat134 >= local329 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass285Array1 != null) {
			Static616.aFloat203 = local22.aFloat102 * local13.aFloat100 + local13.aFloat101 * local22.aFloat99 + local13.aFloat97 * local22.aFloat100;
			Static22.aFloat2 = local22.aFloat98 * local13.aFloat103 + local22.aFloat101 * local13.aFloat95 + local13.aFloat102 * local22.aFloat103;
			Static619.aFloat199 = local22.aFloat100 * local13.aFloat95 + local13.aFloat103 * local22.aFloat99 + local22.aFloat102 * local13.aFloat102;
			Static528.aFloat180 = local22.aFloat101 * local13.aFloat97 + local22.aFloat98 * local13.aFloat101 + local22.aFloat103 * local13.aFloat100;
			Static181.aFloat80 = local22.aFloat101 * local13.aFloat96 + local13.aFloat98 * local22.aFloat98 + local22.aFloat103 * local13.aFloat99;
			Static40.aFloat4 = local22.aFloat99 * local13.aFloat98 + local13.aFloat96 * local22.aFloat100 + local13.aFloat99 * local22.aFloat102;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.aShort84 + this.aShort90 >> 1;
			@Pc(505) int local505 = this.aShort89 + this.aShort93 >> 1;
			@Pc(524) int local524 = (int) (Static40.aFloat4 * (float) local505 + (float) this.aShort88 * Static385.aFloat161 + Static315.aFloat115 + (float) local496 * Static181.aFloat80);
			@Pc(543) int local543 = (int) (Static616.aFloat203 * (float) local505 + (float) local496 * Static528.aFloat180 + Static172.aFloat77 + Static256.aFloat191 * (float) this.aShort88);
			@Pc(562) int local562 = (int) (Static619.aFloat199 * (float) local505 + Static102.aFloat28 + Static22.aFloat2 * (float) local496 + Static114.aFloat31 * (float) this.aShort88);
			@Pc(581) int local581 = (int) (Static385.aFloat161 * (float) this.aShort87 + Static315.aFloat115 + (float) local496 * Static181.aFloat80 + Static40.aFloat4 * (float) local505);
			@Pc(600) int local600 = (int) (Static256.aFloat191 * (float) this.aShort87 + Static528.aFloat180 * (float) local496 + Static172.aFloat77 + Static616.aFloat203 * (float) local505);
			arg1.anInt2725 = this.aClass101_Sub2_29.anInt6326 + local600 * this.aClass101_Sub2_29.anInt6336 / arg2;
			arg1.anInt2727 = this.aClass101_Sub2_29.anInt6347 * local524 / arg2 + this.aClass101_Sub2_29.anInt6340;
			arg1.anInt2728 = local543 * this.aClass101_Sub2_29.anInt6336 / arg2 + this.aClass101_Sub2_29.anInt6326;
			arg1.anInt2726 = this.aClass101_Sub2_29.anInt6340 + this.aClass101_Sub2_29.anInt6347 * local581 / arg2;
			@Pc(672) int local672 = (int) ((float) local505 * Static619.aFloat199 + Static114.aFloat31 * (float) this.aShort87 + Static102.aFloat28 + Static22.aFloat2 * (float) local496);
			if (local562 >= this.aClass101_Sub2_29.anInt6338 || local672 >= this.aClass101_Sub2_29.anInt6338) {
				arg1.aBoolean200 = true;
				arg1.anInt2724 = this.aClass101_Sub2_29.anInt6347 * (local524 + this.aShort85) / arg2 + this.aClass101_Sub2_29.anInt6340 - arg1.anInt2727;
			}
		}
		this.aClass101_Sub2_29.method5625((float) arg2);
		this.aClass101_Sub2_29.method5666();
		this.aClass101_Sub2_29.method5617(local22);
		this.method7601();
		this.aClass101_Sub2_29.method5616();
		this.method7607();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static312.anInt5631 = 0;
			local29 = 0;
			Static546.anInt9529 = 0;
			Static584.anInt4547 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray40.length > local41) {
					local51 = this.anIntArrayArray40[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static584.anInt4547 += this.anIntArray434[local59];
						Static546.anInt9529 += this.anIntArray438[local59];
						Static312.anInt5631 += this.anIntArray436[local59];
						local29++;
					}
				}
			}
			if (local29 <= 0) {
				Static312.anInt5631 = local21;
				Static546.anInt9529 = local25;
				Static584.anInt4547 = local17;
			} else {
				Static584.anInt4547 = Static584.anInt4547 / local29 + local17;
				Static312.anInt5631 = local21 + Static312.anInt5631 / local29;
				Static546.anInt9529 = Static546.anInt9529 / local29 + local25;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local17 = arg2 << 4;
			local25 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray40.length > local35) {
					local161 = this.anIntArrayArray40[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local53 = local161[local163];
						this.anIntArray434[local53] += local17;
						this.anIntArray438[local53] += local25;
						this.anIntArray436[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(300) int local300;
		@Pc(765) int local765;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray40.length > local35) {
					local161 = this.anIntArrayArray40[local35];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							this.anIntArray434[local53] -= Static584.anInt4547;
							this.anIntArray438[local53] -= Static546.anInt9529;
							this.anIntArray436[local53] -= Static312.anInt5631;
							if (arg4 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg4];
								local282 = Class12_Sub2.anIntArray203[arg4];
								local300 = this.anIntArray434[local53] * local282 + this.anIntArray438[local53] * local59 + 16383 >> 14;
								this.anIntArray438[local53] = local282 * this.anIntArray438[local53] + 16383 - this.anIntArray434[local53] * local59 >> 14;
								this.anIntArray434[local53] = local300;
							}
							if (arg2 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg2];
								local282 = Class12_Sub2.anIntArray203[arg2];
								local300 = local282 * this.anIntArray438[local53] + 16383 - local59 * this.anIntArray436[local53] >> 14;
								this.anIntArray436[local53] = this.anIntArray436[local53] * local282 + local59 * this.anIntArray438[local53] + 16383 >> 14;
								this.anIntArray438[local53] = local300;
							}
							if (arg3 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg3];
								local282 = Class12_Sub2.anIntArray203[arg3];
								local300 = local282 * this.anIntArray434[local53] + this.anIntArray436[local53] * local59 + 16383 >> 14;
								this.anIntArray436[local53] = this.anIntArray436[local53] * local282 + 16383 - this.anIntArray434[local53] * local59 >> 14;
								this.anIntArray434[local53] = local300;
							}
							this.anIntArray434[local53] += Static584.anInt4547;
							this.anIntArray438[local53] += Static546.anInt9529;
							this.anIntArray436[local53] += Static312.anInt5631;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							this.anIntArray434[local53] -= Static584.anInt4547;
							this.anIntArray438[local53] -= Static546.anInt9529;
							this.anIntArray436[local53] -= Static312.anInt5631;
							if (arg2 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg2];
								local282 = Class12_Sub2.anIntArray203[arg2];
								local300 = this.anIntArray438[local53] * local282 + 16383 - local59 * this.anIntArray436[local53] >> 14;
								this.anIntArray436[local53] = local282 * this.anIntArray436[local53] + local59 * this.anIntArray438[local53] + 16383 >> 14;
								this.anIntArray438[local53] = local300;
							}
							if (arg4 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg4];
								local282 = Class12_Sub2.anIntArray203[arg4];
								local300 = local59 * this.anIntArray438[local53] + local282 * this.anIntArray434[local53] + 16383 >> 14;
								this.anIntArray438[local53] = local282 * this.anIntArray438[local53] + 16383 - local59 * this.anIntArray434[local53] >> 14;
								this.anIntArray434[local53] = local300;
							}
							if (arg3 != 0) {
								local59 = Class12_Sub2.anIntArray204[arg3];
								local282 = Class12_Sub2.anIntArray203[arg3];
								local300 = local282 * this.anIntArray434[local53] + local59 * this.anIntArray436[local53] + 16383 >> 14;
								this.anIntArray436[local53] = local282 * this.anIntArray436[local53] + 16383 - this.anIntArray434[local53] * local59 >> 14;
								this.anIntArray434[local53] = local300;
							}
							this.anIntArray434[local53] += Static584.anInt4547;
							this.anIntArray438[local53] += Static546.anInt9529;
							this.anIntArray436[local53] += Static312.anInt5631;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray40.length > local41) {
						local51 = this.anIntArrayArray40[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local282 = this.anIntArray435[local59];
							local300 = this.anIntArray435[local59 + 1];
							for (local765 = local282; local765 < local300; local765++) {
								@Pc(774) int local774 = this.aShortArray108[local765] - 1;
								if (local774 == -1) {
									break;
								}
								@Pc(786) int local786;
								@Pc(790) int local790;
								@Pc(808) int local808;
								if (arg4 != 0) {
									local786 = Class12_Sub2.anIntArray204[arg4];
									local790 = Class12_Sub2.anIntArray203[arg4];
									local808 = local790 * this.aShortArray112[local774] + this.lb[local774] * local786 + 16383 >> 14;
									this.lb[local774] = (short) (local790 * this.lb[local774] + 16383 - this.aShortArray112[local774] * local786 >> 14);
									this.aShortArray112[local774] = (short) local808;
								}
								if (arg2 != 0) {
									local786 = Class12_Sub2.anIntArray204[arg2];
									local790 = Class12_Sub2.anIntArray203[arg2];
									local808 = this.lb[local774] * local790 + 16383 - local786 * this.aShortArray113[local774] >> 14;
									this.aShortArray113[local774] = (short) (local786 * this.lb[local774] + this.aShortArray113[local774] * local790 + 16383 >> 14);
									this.lb[local774] = (short) local808;
								}
								if (arg3 != 0) {
									local786 = Class12_Sub2.anIntArray204[arg3];
									local790 = Class12_Sub2.anIntArray203[arg3];
									local808 = local790 * this.aShortArray112[local774] + this.aShortArray113[local774] * local786 + 16383 >> 14;
									this.aShortArray113[local774] = (short) (local790 * this.aShortArray113[local774] + 16383 - local786 * this.aShortArray112[local774] >> 14);
									this.aShortArray112[local774] = (short) local808;
								}
							}
						}
					}
				}
				if (this.aClass274_13 == null && this.aClass274_16 != null) {
					this.aClass274_16.anInterface2_6 = null;
				}
				if (this.aClass274_13 != null) {
					this.aClass274_13.anInterface2_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray40.length) {
					local161 = this.anIntArrayArray40[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local53 = local161[local163];
						this.anIntArray434[local53] -= Static584.anInt4547;
						this.anIntArray438[local53] -= Static546.anInt9529;
						this.anIntArray436[local53] -= Static312.anInt5631;
						this.anIntArray434[local53] = this.anIntArray434[local53] * arg2 >> 7;
						this.anIntArray438[local53] = arg3 * this.anIntArray438[local53] >> 7;
						this.anIntArray436[local53] = this.anIntArray436[local53] * arg4 >> 7;
						this.anIntArray434[local53] += Static584.anInt4547;
						this.anIntArray438[local53] += Static546.anInt9529;
						this.anIntArray436[local53] += Static312.anInt5631;
					}
				}
			}
		} else {
			@Pc(1223) Class285 local1223;
			@Pc(1228) Class303 local1228;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray41.length > local35) {
							local161 = this.anIntArrayArray41[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local53 = local161[local163];
								local59 = arg2 * 8 + (this.aByteArray76[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray76[local53] = (byte) local59;
							}
							if (local161.length > 0 && this.aClass274_16 != null) {
								this.aClass274_16.anInterface2_6 = null;
							}
						}
					}
					if (this.aClass285Array1 != null) {
						for (local35 = 0; local35 < this.anInt8527; local35++) {
							local1223 = this.aClass285Array1[local35];
							local1228 = this.aClass303Array1[local35];
							local1228.anInt8816 = local1228.anInt8816 & 0xFFFFFF | 255 - (this.aByteArray76[local1223.anInt8317] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1477) Class303 local1477;
				if (arg0 == 8) {
					if (this.anIntArrayArray39 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray39.length) {
								local161 = this.anIntArrayArray39[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1477 = this.aClass303Array1[local161[local163]];
									local1477.anInt8819 += arg3;
									local1477.anInt8814 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray39 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray39.length) {
								local161 = this.anIntArrayArray39[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1477 = this.aClass303Array1[local161[local163]];
									local1477.anInt8821 = arg2 * local1477.anInt8821 >> 7;
									local1477.anInt8812 = local1477.anInt8812 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray39.length > local35) {
							local161 = this.anIntArrayArray39[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1477 = this.aClass303Array1[local161[local163]];
								local1477.anInt8817 = arg2 + local1477.anInt8817 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray41.length > local35) {
						local161 = this.anIntArrayArray41[local35];
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							local59 = this.aShortArray114[local53] & 0xFFFF;
							local282 = local59 >> 10 & 0x3F;
							local300 = local59 >> 7 & 0x7;
							local300 += arg3 / 4;
							local765 = local59 & 0x7F;
							@Pc(1329) int local1329 = local282 + arg2 & 0x3F;
							local765 += arg4;
							if (local300 < 0) {
								local300 = 0;
							} else if (local300 > 7) {
								local300 = 7;
							}
							if (local765 < 0) {
								local765 = 0;
							} else if (local765 > 127) {
								local765 = 127;
							}
							this.aShortArray114[local53] = (short) (local300 << 7 | local1329 << 10 | local765);
						}
						if (local161.length > 0 && this.aClass274_16 != null) {
							this.aClass274_16.anInterface2_6 = null;
						}
					}
				}
				if (this.aClass285Array1 != null) {
					for (local35 = 0; local35 < this.anInt8527; local35++) {
						local1223 = this.aClass285Array1[local35];
						local1228 = this.aClass303Array1[local35];
						local1228.anInt8816 = Static101.anIntArray92[this.aShortArray114[local1223.anInt8317] & 0xFFFF] & 0xFFFFFF | local1228.anInt8816 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8538; local7++) {
			if (arg0 != 0) {
				this.anIntArray434[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray438[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray436[local7] += arg2;
			}
		}
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!qb", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8534; local3++) {
			if (this.aShortArray114[local3] == arg0) {
				this.aShortArray114[local3] = arg1;
			}
		}
		if (this.aClass285Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt8527; local34++) {
				@Pc(41) Class285 local41 = this.aClass285Array1[local34];
				@Pc(46) Class303 local46 = this.aClass303Array1[local34];
				local46.anInt8816 = local46.anInt8816 & 0xFF000000 | Static101.anIntArray92[this.aShortArray114[local41.anInt8317] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	private void method7596() {
		if (!this.aBoolean624) {
			return;
		}
		this.aBoolean624 = false;
		if (this.aClass283Array4 == null && this.aClass123Array4 == null && this.aClass285Array1 == null) {
			if (this.anIntArray434 != null && !Static620.method9240(this.anInt8529, this.anInt8540)) {
				if (this.aClass274_15 != null && this.aClass274_15.anInterface2_6 == null) {
					this.aBoolean624 = true;
				} else {
					if (!this.aBoolean623) {
						this.method7600();
					}
					this.anIntArray434 = null;
				}
			}
			if (this.anIntArray438 != null && !Static485.method7681(this.anInt8540, this.anInt8529)) {
				if (this.aClass274_15 != null && this.aClass274_15.anInterface2_6 == null) {
					this.aBoolean624 = true;
				} else {
					if (!this.aBoolean623) {
						this.method7600();
					}
					this.anIntArray438 = null;
				}
			}
			if (this.anIntArray436 != null && !Static499.method7860(this.anInt8529, this.anInt8540)) {
				if (this.aClass274_15 != null && this.aClass274_15.anInterface2_6 == null) {
					this.aBoolean624 = true;
				} else {
					if (!this.aBoolean623) {
						this.method7600();
					}
					this.anIntArray436 = null;
				}
			}
		}
		if (this.aShortArray108 != null && this.anIntArray434 == null && this.anIntArray438 == null && this.anIntArray436 == null) {
			this.anIntArray435 = null;
			this.aShortArray108 = null;
		}
		if (this.aByteArray75 != null && !Static12.method169(this.anInt8540, this.anInt8529)) {
			if (this.aClass274_13 == null) {
				if (this.aClass274_16 != null && this.aClass274_16.anInterface2_6 == null) {
					this.aBoolean624 = true;
				} else {
					this.aShortArray112 = this.lb = this.aShortArray113 = null;
					this.aByteArray75 = null;
				}
			} else if (this.aClass274_13.anInterface2_6 == null) {
				this.aBoolean624 = true;
			} else {
				this.aShortArray112 = this.lb = this.aShortArray113 = null;
				this.aByteArray75 = null;
			}
		}
		if (this.aShortArray114 != null && !Static343.method5740(this.anInt8540, this.anInt8529)) {
			if (this.aClass274_16 != null && this.aClass274_16.anInterface2_6 == null) {
				this.aBoolean624 = true;
			} else {
				this.aShortArray114 = null;
			}
		}
		if (this.aByteArray76 != null && !Static417.method6896(this.anInt8529, this.anInt8540)) {
			if (this.aClass274_16 != null && this.aClass274_16.anInterface2_6 == null) {
				this.aBoolean624 = true;
			} else {
				this.aByteArray76 = null;
			}
		}
		if (this.aFloatArray56 != null && !Static471.method7521(this.anInt8540, this.anInt8529)) {
			if (this.aClass274_14 != null && this.aClass274_14.anInterface2_6 == null) {
				this.aBoolean624 = true;
			} else {
				this.aFloatArray56 = this.aFloatArray55 = null;
			}
		}
		if (this.aShortArray106 != null && !Static472.method7524(this.anInt8540, this.anInt8529)) {
			if (this.aClass274_16 != null && this.aClass274_16.anInterface2_6 == null) {
				this.aBoolean624 = true;
			} else {
				this.aShortArray106 = null;
			}
		}
		if (this.aShortArray109 != null && !Static535.method8257(this.anInt8540, this.anInt8529)) {
			if ((this.aClass311_1 == null || this.aClass311_1.anInterface20_4 != null) && (this.aClass274_16 == null || this.aClass274_16.anInterface2_6 != null)) {
				this.aShortArray109 = this.aShortArray111 = this.aShortArray105 = null;
			} else {
				this.aBoolean624 = true;
			}
		}
		if (this.anIntArrayArray41 != null && !Static76.method1371(this.anInt8529, this.anInt8540)) {
			this.anIntArrayArray41 = null;
			this.aShortArray107 = null;
		}
		if (this.anIntArrayArray40 != null && !Static472.method7523(this.anInt8540, this.anInt8529)) {
			this.aShortArray110 = null;
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArrayArray39 != null && !Static63.method1171(this.anInt8529, this.anInt8540)) {
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArray437 != null && (this.anInt8540 & 0x800) == 0 && (this.anInt8540 & 0x40000) == 0) {
			this.anIntArray437 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!kw;B)V")
	private void method7597(@OriginalArg(0) Class2_Sub1_Sub11_Sub1 arg0) {
		if (this.anInt8583 > this.aClass101_Sub2_29.anIntArray304.length) {
			this.aClass101_Sub2_29.anIntArray305 = new int[this.anInt8583];
			this.aClass101_Sub2_29.anIntArray304 = new int[this.anInt8583];
		}
		@Pc(38) int[] local38 = this.aClass101_Sub2_29.anIntArray304;
		@Pc(42) int[] local42 = this.aClass101_Sub2_29.anIntArray305;
		@Pc(71) int local71;
		@Pc(109) int local109;
		@Pc(118) int local118;
		for (@Pc(44) int local44 = 0; local44 < this.anInt8538; local44++) {
			local71 = (this.anIntArray434[local44] - (this.anIntArray438[local44] * this.aClass101_Sub2_29.anInt6341 >> 8) >> this.aClass101_Sub2_29.anInt6315) - arg0.anInt5983;
			@Pc(95) int local95 = (this.anIntArray436[local44] - (this.aClass101_Sub2_29.anInt6337 * this.anIntArray438[local44] >> 8) >> this.aClass101_Sub2_29.anInt6315) - arg0.anInt5982;
			@Pc(100) int local100 = this.anIntArray435[local44];
			@Pc(107) int local107 = this.anIntArray435[local44 + 1];
			for (local109 = local100; local109 < local107; local109++) {
				local118 = this.aShortArray108[local109] - 1;
				if (local118 == -1) {
					break;
				}
				local38[local118] = local71;
				local42[local118] = local95;
			}
		}
		for (local71 = 0; local71 < this.anInt8573; local71++) {
			if (this.aByteArray76 == null || this.aByteArray76[local71] <= 128) {
				@Pc(164) short local164 = this.aShortArray109[local71];
				@Pc(169) short local169 = this.aShortArray111[local71];
				@Pc(174) short local174 = this.aShortArray105[local71];
				local109 = local38[local164];
				local118 = local38[local169];
				@Pc(186) int local186 = local38[local174];
				@Pc(190) int local190 = local42[local164];
				@Pc(194) int local194 = local42[local169];
				@Pc(198) int local198 = local42[local174];
				if (-((local194 - local190) * (local186 + -local118)) + (local194 - local198) * (local109 - local118) > 0) {
					arg0.method5410(local194, local190, local186, local109, local198, local118);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()V")
	@Override
	protected void method8639() {
	}

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean626;
	}

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8538; local3++) {
			if (arg0 != 128) {
				this.anIntArray434[local3] = arg0 * this.anIntArray434[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray438[local3] = this.anIntArray438[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray436[local3] = arg2 * this.anIntArray436[local3] >> 7;
			}
		}
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBSB)I")
	private int method7599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3) {
		@Pc(12) int local12 = Static101.anIntArray92[Static239.method4275(arg0, arg1)];
		if (arg3 != -1) {
			@Pc(31) Class136 local31 = this.aClass101_Sub2_29.anInterface3_12.method1941(arg3 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte67 & 0xFF;
			@Pc(53) int local53;
			@Pc(76) int local76;
			if (local36 != 0) {
				if (arg1 < 0) {
					local53 = 0;
				} else if (arg1 > 127) {
					local53 = 16777215;
				} else {
					local53 = arg1 * 131586;
				}
				if (local36 == 256) {
					local12 = local53;
				} else {
					local76 = 256 - local36;
					local12 = ((local12 & 0xFF00FF) * local76 + (local53 & 0xFF00FF) * local36 & 0xFF00FF00) + (local36 * (local53 & 0xFF00) + (local76 * (local12 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local53 = local31.aByte66 & 0xFF;
			if (local53 != 0) {
				local53 += 256;
				@Pc(127) int local127 = (local12 >> 16 & 0xFF) * local53;
				if (local127 > 65535) {
					local127 = 65535;
				}
				local76 = (local12 >> 8 & 0xFF) * local53;
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(153) int local153 = local53 * (local12 & 0xFF);
				if (local153 > 65535) {
					local153 = 65535;
				}
				local12 = ((local127 & 0x5600FF00) << 8) + (local76 & 0xFF00) + (local153 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()[Lclient!gfa;")
	@Override
	public Class123[] method8634() {
		return this.aClass123Array4;
	}

	@OriginalMember(owner = "client!qb", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray40 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8525; local12++) {
			this.anIntArray434[local12] <<= 0x4;
			this.anIntArray438[local12] <<= 0x4;
			this.anIntArray436[local12] <<= 0x4;
		}
		Static312.anInt5631 = 0;
		Static584.anInt4547 = 0;
		Static546.anInt9529 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	private void method7600() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(34) int local34 = 0; local34 < this.anInt8538; local34++) {
			@Pc(41) int local41 = this.anIntArray434[local34];
			@Pc(46) int local46 = this.anIntArray438[local34];
			if (local46 < local9) {
				local9 = local46;
			}
			@Pc(56) int local56 = this.anIntArray436[local34];
			if (local41 > local13) {
				local13 = local41;
			}
			if (local7 > local41) {
				local7 = local41;
			}
			if (local15 < local46) {
				local15 = local46;
			}
			if (local17 < local56) {
				local17 = local56;
			}
			if (local11 > local56) {
				local11 = local56;
			}
			@Pc(101) int local101 = local56 * local56 + local41 * local41;
			if (local19 < local101) {
				local19 = local101;
			}
			local101 = local46 * local46 + local56 * local56 + local41 * local41;
			if (local21 < local101) {
				local21 = local101;
			}
		}
		this.aShort93 = (short) local17;
		this.aShort89 = (short) local11;
		this.aShort90 = (short) local7;
		this.aShort87 = (short) local15;
		this.aShort88 = (short) local9;
		this.aShort84 = (short) local13;
		this.aShort85 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort86 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean623 = true;
	}

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8538; local7++) {
			this.anIntArray436[local7] = -this.anIntArray436[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8583; local25++) {
			this.aShortArray113[local25] = (short) -this.aShortArray113[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt8534; local48++) {
			@Pc(55) short local55 = this.aShortArray109[local48];
			this.aShortArray109[local48] = this.aShortArray105[local48];
			this.aShortArray105[local48] = local55;
		}
		if (this.aClass274_13 == null && this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
		if (this.aClass274_13 != null) {
			this.aClass274_13.anInterface2_6 = null;
		}
		if (this.aClass311_1 != null) {
			this.aClass311_1.anInterface20_4 = null;
		}
		this.aBoolean623 = false;
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8631(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class14_Sub2 local8 = (Class14_Sub2) arg0;
		if (this.anInt8534 == 0 || local8.anInt8534 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt8538;
		@Pc(27) int[] local27 = local8.anIntArray434;
		@Pc(30) int[] local30 = local8.anIntArray438;
		@Pc(33) int[] local33 = local8.anIntArray436;
		@Pc(36) short[] local36 = local8.aShortArray112;
		@Pc(39) short[] local39 = local8.lb;
		@Pc(42) short[] local42 = local8.aShortArray113;
		@Pc(45) byte[] local45 = local8.aByteArray75;
		@Pc(60) short[] local60;
		@Pc(64) short[] local64;
		@Pc(56) short[] local56;
		@Pc(52) byte[] local52;
		if (this.aClass23_1 == null) {
			local56 = null;
			local64 = null;
			local52 = null;
			local60 = null;
		} else {
			local52 = this.aClass23_1.aByteArray10;
			local56 = this.aClass23_1.aShortArray16;
			local60 = this.aClass23_1.aShortArray15;
			local64 = this.aClass23_1.aShortArray17;
		}
		@Pc(79) short[] local79;
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(83) byte[] local83;
		if (local8.aClass23_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass23_1.aShortArray15;
			local85 = local8.aClass23_1.aShortArray17;
			local81 = local8.aClass23_1.aShortArray16;
			local83 = local8.aClass23_1.aByteArray10;
		}
		@Pc(106) int[] local106 = local8.anIntArray435;
		@Pc(109) short[] local109 = local8.aShortArray108;
		if (!local8.aBoolean623) {
			local8.method7600();
		}
		@Pc(118) short local118 = local8.aShort88;
		@Pc(121) short local121 = local8.aShort87;
		@Pc(124) short local124 = local8.aShort90;
		@Pc(127) short local127 = local8.aShort84;
		@Pc(130) short local130 = local8.aShort89;
		@Pc(133) short local133 = local8.aShort93;
		for (@Pc(135) int local135 = 0; local135 < this.anInt8538; local135++) {
			@Pc(145) int local145 = this.anIntArray438[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(169) int local169 = this.anIntArray434[local135] - arg1;
				if (local169 >= local124 && local127 >= local169) {
					@Pc(189) int local189 = this.anIntArray436[local135] - arg3;
					if (local130 <= local189 && local133 >= local189) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray435[local135];
						@Pc(215) int local215 = this.anIntArray435[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray108[local217] - 1;
							if (local203 == -1 || this.aByteArray75[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local24; local249++) {
								if (local169 == local27[local249] && local33[local249] == local189 && local30[local249] == local145) {
									local215 = local106[local249 + 1];
									local208 = local106[local249];
									@Pc(282) int local282 = -1;
									for (@Pc(284) int local284 = local208; local284 < local215; local284++) {
										local282 = local109[local284] - 1;
										if (local282 == -1 || local45[local282] != 0) {
											break;
										}
									}
									if (local282 != -1) {
										if (local60 == null) {
											this.aClass23_1 = new Class23();
											local60 = this.aClass23_1.aShortArray15 = Static102.method1767(this.aShortArray112);
											local64 = this.aClass23_1.aShortArray17 = Static102.method1767(this.lb);
											local56 = this.aClass23_1.aShortArray16 = Static102.method1767(this.aShortArray113);
											local52 = this.aClass23_1.aByteArray10 = Static491.method7784(this.aByteArray75);
										}
										if (local79 == null) {
											@Pc(361) Class23 local361 = local8.aClass23_1 = new Class23();
											local79 = local361.aShortArray15 = Static102.method1767(local36);
											local85 = local361.aShortArray17 = Static102.method1767(local39);
											local81 = local361.aShortArray16 = Static102.method1767(local42);
											local83 = local361.aByteArray10 = Static491.method7784(local45);
										}
										@Pc(394) short local394 = this.aShortArray112[local203];
										@Pc(399) short local399 = this.lb[local203];
										@Pc(404) short local404 = this.aShortArray113[local203];
										@Pc(409) byte local409 = this.aByteArray75[local203];
										local208 = local106[local249];
										local215 = local106[local249 + 1];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local208; local421 < local215; local421++) {
											local429 = local109[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local83[local429] != 0) {
												local79[local429] += local394;
												local85[local429] += local399;
												local81[local429] += local404;
												local83[local429] += local409;
											}
										}
										local409 = local45[local282];
										local215 = this.anIntArray435[local135 + 1];
										local399 = local39[local282];
										local404 = local42[local282];
										local208 = this.anIntArray435[local135];
										local394 = local36[local282];
										for (local429 = local208; local429 < local215; local429++) {
											@Pc(519) int local519 = this.aShortArray108[local429] - 1;
											if (local519 == -1) {
												break;
											}
											if (local52[local519] != 0) {
												local60[local519] += local394;
												local64[local519] += local399;
												local56[local519] += local404;
												local52[local519] += local409;
											}
										}
										if (this.aClass274_13 == null && this.aClass274_16 != null) {
											this.aClass274_16.anInterface2_6 = null;
										}
										if (this.aClass274_13 != null) {
											this.aClass274_13.anInterface2_6 = null;
										}
										if (local8.aClass274_13 == null && local8.aClass274_16 != null) {
											local8.aClass274_16.anInterface2_6 = null;
										}
										if (local8.aClass274_13 != null) {
											local8.aClass274_13.anInterface2_6 = null;
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

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	private void method7601() {
		if (this.anInt8573 == 0) {
			return;
		}
		if (this.aByte113 != 0) {
			this.method7610(true);
		}
		this.method7610(false);
		if (this.aClass311_1 != null) {
			if (this.aClass311_1.anInterface20_4 == null) {
				this.method7606((this.aByte113 & 0x10) != 0);
			}
			if (this.aClass311_1.anInterface20_4 != null) {
				this.aClass101_Sub2_29.method5691(this.aClass274_13 != null);
				this.aClass101_Sub2_29.method5650(this.aClass274_13, this.aClass274_15, this.aClass274_16, this.aClass274_14);
				@Pc(82) int local82 = this.anIntArray437.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray437[local84];
					@Pc(98) int local98 = this.anIntArray437[local84 + 1];
					@Pc(105) int local105 = this.aShortArray106[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass101_Sub2_29.method5692(this.aClass274_13 != null, local105);
					this.aClass101_Sub2_29.method5645((local98 - local91) * 3, local91 * 3, this.aClass311_1.anInterface20_4);
				}
			}
		}
		this.method7596();
	}

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean625;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!dm;ZI)Z")
	@Override
	public boolean method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7609(arg3, arg2, -1, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	@Override
	public void method8620() {
		if (this.anInt8583 <= 0 || this.anInt8573 <= 0) {
			return;
		}
		this.method7610(false);
		if ((this.aByte113 & 0x10) == 0 && this.aClass311_1.anInterface20_4 == null) {
			this.method7606(false);
		}
		this.method7596();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZLclient!qb;ILclient!qb;I)Lclient!ka;")
	private Class14 method7602(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class14_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14_Sub2 arg4) {
		arg2.aByte113 = 0;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean626 = this.aBoolean626;
		} else {
			arg2.aBoolean626 = true;
		}
		arg2.aBoolean625 = this.aBoolean625;
		arg2.anInt8540 = arg3;
		arg2.anInt8529 = this.anInt8529;
		arg2.anInt8583 = this.anInt8583;
		arg2.anInt8573 = this.anInt8573;
		arg2.anInt8534 = this.anInt8534;
		arg2.anInt8527 = this.anInt8527;
		arg2.aShort92 = this.aShort92;
		arg2.anInt8525 = this.anInt8525;
		arg2.aShort91 = this.aShort91;
		arg2.anInt8538 = this.anInt8538;
		@Pc(70) boolean local70 = Static326.method5371(this.anInt8529, arg3);
		@Pc(76) boolean local76 = Static544.method8346(arg3, this.anInt8529);
		@Pc(82) boolean local82 = Static388.method6538(arg3, this.anInt8529);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(203) int local203;
		if (local88) {
			if (!local70) {
				arg2.anIntArray434 = this.anIntArray434;
			} else if (arg4.anIntArray434 == null || this.anInt8525 > arg4.anIntArray434.length) {
				arg2.anIntArray434 = arg4.anIntArray434 = new int[this.anInt8525];
			} else {
				arg2.anIntArray434 = arg4.anIntArray434;
			}
			if (!local76) {
				arg2.anIntArray438 = this.anIntArray438;
			} else if (arg4.anIntArray438 == null || arg4.anIntArray438.length < this.anInt8525) {
				arg2.anIntArray438 = arg4.anIntArray438 = new int[this.anInt8525];
			} else {
				arg2.anIntArray438 = arg4.anIntArray438;
			}
			if (!local82) {
				arg2.anIntArray436 = this.anIntArray436;
			} else if (arg4.anIntArray436 == null || arg4.anIntArray436.length < this.anInt8525) {
				arg2.anIntArray436 = arg4.anIntArray436 = new int[this.anInt8525];
			} else {
				arg2.anIntArray436 = arg4.anIntArray436;
			}
			for (local203 = 0; local203 < this.anInt8525; local203++) {
				if (local70) {
					arg2.anIntArray434[local203] = this.anIntArray434[local203];
				}
				if (local76) {
					arg2.anIntArray438[local203] = this.anIntArray438[local203];
				}
				if (local82) {
					arg2.anIntArray436[local203] = this.anIntArray436[local203];
				}
			}
		} else {
			arg2.anIntArray434 = this.anIntArray434;
			arg2.anIntArray436 = this.anIntArray436;
			arg2.anIntArray438 = this.anIntArray438;
		}
		if (Static616.method9601(arg3, this.anInt8529)) {
			arg2.aClass274_15 = arg4.aClass274_15;
			if (arg0) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x1);
			}
			arg2.aClass274_15.aByte108 = this.aClass274_15.aByte108;
			arg2.aClass274_15.anInterface2_6 = this.aClass274_15.anInterface2_6;
		} else if (Static185.method3573(this.anInt8529, arg3)) {
			arg2.aClass274_15 = this.aClass274_15;
		} else {
			arg2.aClass274_15 = null;
		}
		if (Static69.method1292(arg3, this.anInt8529)) {
			if (arg4.aShortArray114 == null || this.anInt8534 > arg4.aShortArray114.length) {
				arg2.aShortArray114 = arg4.aShortArray114 = new short[this.anInt8534];
			} else {
				arg2.aShortArray114 = arg4.aShortArray114;
			}
			for (local203 = 0; local203 < this.anInt8534; local203++) {
				arg2.aShortArray114[local203] = this.aShortArray114[local203];
			}
		} else {
			arg2.aShortArray114 = this.aShortArray114;
		}
		if (Static573.method8708(this.anInt8529, arg3)) {
			if (arg4.aByteArray76 == null || arg4.aByteArray76.length < this.anInt8534) {
				arg2.aByteArray76 = arg4.aByteArray76 = new byte[this.anInt8534];
			} else {
				arg2.aByteArray76 = arg4.aByteArray76;
			}
			for (local203 = 0; local203 < this.anInt8534; local203++) {
				arg2.aByteArray76[local203] = this.aByteArray76[local203];
			}
		} else {
			arg2.aByteArray76 = this.aByteArray76;
		}
		if (Static318.method5257(arg3, this.anInt8529)) {
			if (arg0) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x2);
			}
			arg2.aClass274_16 = arg4.aClass274_16;
			arg2.aClass274_16.anInterface2_6 = this.aClass274_16.anInterface2_6;
			arg2.aClass274_16.aByte108 = this.aClass274_16.aByte108;
		} else if (Static564.method8558(this.anInt8529, arg3)) {
			arg2.aClass274_16 = this.aClass274_16;
		} else {
			arg2.aClass274_16 = null;
		}
		@Pc(559) int local559;
		if (Static140.method7796(this.anInt8529, arg3)) {
			if (arg4.aShortArray112 == null || arg4.aShortArray112.length < this.anInt8583) {
				local203 = this.anInt8583;
				arg2.aShortArray113 = arg4.aShortArray113 = new short[local203];
				arg2.aShortArray112 = arg4.aShortArray112 = new short[local203];
				arg2.lb = arg4.lb = new short[local203];
			} else {
				arg2.lb = arg4.lb;
				arg2.aShortArray113 = arg4.aShortArray113;
				arg2.aShortArray112 = arg4.aShortArray112;
			}
			if (this.aClass23_1 == null) {
				for (local203 = 0; local203 < this.anInt8583; local203++) {
					arg2.aShortArray112[local203] = this.aShortArray112[local203];
					arg2.lb[local203] = this.lb[local203];
					arg2.aShortArray113[local203] = this.aShortArray113[local203];
				}
			} else {
				if (arg4.aClass23_1 == null) {
					arg4.aClass23_1 = new Class23();
				}
				@Pc(547) Class23 local547 = arg2.aClass23_1 = arg4.aClass23_1;
				if (local547.aShortArray15 == null || this.anInt8583 > local547.aShortArray15.length) {
					local559 = this.anInt8583;
					local547.aByteArray10 = new byte[local559];
					local547.aShortArray16 = new short[local559];
					local547.aShortArray17 = new short[local559];
					local547.aShortArray15 = new short[local559];
				}
				for (local559 = 0; local559 < this.anInt8583; local559++) {
					arg2.aShortArray112[local559] = this.aShortArray112[local559];
					arg2.lb[local559] = this.lb[local559];
					arg2.aShortArray113[local559] = this.aShortArray113[local559];
					local547.aShortArray15[local559] = this.aClass23_1.aShortArray15[local559];
					local547.aShortArray17[local559] = this.aClass23_1.aShortArray17[local559];
					local547.aShortArray16[local559] = this.aClass23_1.aShortArray16[local559];
					local547.aByteArray10[local559] = this.aClass23_1.aByteArray10[local559];
				}
			}
			arg2.aByteArray75 = this.aByteArray75;
		} else {
			arg2.aByteArray75 = this.aByteArray75;
			arg2.aShortArray113 = this.aShortArray113;
			arg2.aShortArray112 = this.aShortArray112;
			arg2.lb = this.lb;
			arg2.aClass23_1 = this.aClass23_1;
		}
		if (Static612.method9197(this.anInt8529, arg3)) {
			arg2.aClass274_13 = arg4.aClass274_13;
			if (arg0) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x4);
			}
			arg2.aClass274_13.aByte108 = this.aClass274_13.aByte108;
			arg2.aClass274_13.anInterface2_6 = this.aClass274_13.anInterface2_6;
		} else if (Static592.method9189(arg3, this.anInt8529)) {
			arg2.aClass274_13 = this.aClass274_13;
		} else {
			arg2.aClass274_13 = null;
		}
		if (Static404.method6624(this.anInt8529, arg3)) {
			if (arg4.aFloatArray56 == null || this.anInt8534 > arg4.aFloatArray56.length) {
				local203 = this.anInt8583;
				arg2.aFloatArray55 = arg4.aFloatArray55 = new float[local203];
				arg2.aFloatArray56 = arg4.aFloatArray56 = new float[local203];
			} else {
				arg2.aFloatArray55 = arg4.aFloatArray55;
				arg2.aFloatArray56 = arg4.aFloatArray56;
			}
			for (local203 = 0; local203 < this.anInt8583; local203++) {
				arg2.aFloatArray56[local203] = this.aFloatArray56[local203];
				arg2.aFloatArray55[local203] = this.aFloatArray55[local203];
			}
		} else {
			arg2.aFloatArray56 = this.aFloatArray56;
			arg2.aFloatArray55 = this.aFloatArray55;
		}
		if (Static174.method3414(this.anInt8529, arg3)) {
			arg2.aClass274_14 = arg4.aClass274_14;
			if (arg0) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x8);
			}
			arg2.aClass274_14.anInterface2_6 = this.aClass274_14.anInterface2_6;
			arg2.aClass274_14.aByte108 = this.aClass274_14.aByte108;
		} else if (Static401.method6613(arg3, this.anInt8529)) {
			arg2.aClass274_14 = this.aClass274_14;
		} else {
			arg2.aClass274_14 = null;
		}
		if (Static345.method5979(arg3, this.anInt8529)) {
			if (arg4.aShortArray109 == null || this.anInt8534 > arg4.aShortArray109.length) {
				local203 = this.anInt8534;
				arg2.aShortArray109 = arg4.aShortArray109 = new short[local203];
				arg2.aShortArray105 = arg4.aShortArray105 = new short[local203];
				arg2.aShortArray111 = arg4.aShortArray111 = new short[local203];
			} else {
				arg2.aShortArray105 = arg4.aShortArray105;
				arg2.aShortArray109 = arg4.aShortArray109;
				arg2.aShortArray111 = arg4.aShortArray111;
			}
			for (local203 = 0; local203 < this.anInt8534; local203++) {
				arg2.aShortArray109[local203] = this.aShortArray109[local203];
				arg2.aShortArray111[local203] = this.aShortArray111[local203];
				arg2.aShortArray105[local203] = this.aShortArray105[local203];
			}
		} else {
			arg2.aShortArray109 = this.aShortArray109;
			arg2.aShortArray105 = this.aShortArray105;
			arg2.aShortArray111 = this.aShortArray111;
		}
		if (Static329.method5444(this.anInt8529, arg3)) {
			if (arg0) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x10);
			}
			arg2.aClass311_1 = arg4.aClass311_1;
			arg2.aClass311_1.anInterface20_4 = this.aClass311_1.anInterface20_4;
		} else if (Static52.method1059(arg3, this.anInt8529)) {
			arg2.aClass311_1 = this.aClass311_1;
		} else {
			arg2.aClass311_1 = null;
		}
		if (Static404.method6631(this.anInt8529, arg3)) {
			if (arg4.aShortArray106 == null || this.anInt8534 > arg4.aShortArray106.length) {
				local203 = this.anInt8534;
				arg2.aShortArray106 = arg4.aShortArray106 = new short[local203];
			} else {
				arg2.aShortArray106 = arg4.aShortArray106;
			}
			for (local203 = 0; local203 < this.anInt8534; local203++) {
				arg2.aShortArray106[local203] = this.aShortArray106[local203];
			}
		} else {
			arg2.aShortArray106 = this.aShortArray106;
		}
		if (!Static11.method159(this.anInt8529, arg3)) {
			arg2.aClass303Array1 = this.aClass303Array1;
		} else if (arg4.aClass303Array1 == null || this.anInt8527 > arg4.aClass303Array1.length) {
			local203 = this.anInt8527;
			arg2.aClass303Array1 = arg4.aClass303Array1 = new Class303[local203];
			for (local559 = 0; local559 < this.anInt8527; local559++) {
				arg2.aClass303Array1[local559] = this.aClass303Array1[local559].method7793();
			}
		} else {
			arg2.aClass303Array1 = arg4.aClass303Array1;
			for (local203 = 0; local203 < this.anInt8527; local203++) {
				arg2.aClass303Array1[local203].method7794(this.aClass303Array1[local203]);
			}
		}
		arg2.aClass123Array4 = this.aClass123Array4;
		arg2.anIntArray435 = this.anIntArray435;
		if (this.aBoolean623) {
			arg2.aShort88 = this.aShort88;
			arg2.aShort86 = this.aShort86;
			arg2.aShort90 = this.aShort90;
			arg2.aShort84 = this.aShort84;
			arg2.aShort87 = this.aShort87;
			arg2.aShort89 = this.aShort89;
			arg2.aShort85 = this.aShort85;
			arg2.aShort93 = this.aShort93;
			arg2.aBoolean623 = true;
		} else {
			arg2.aBoolean623 = false;
		}
		arg2.anIntArrayArray40 = this.anIntArrayArray40;
		arg2.anIntArrayArray39 = this.anIntArrayArray39;
		arg2.aClass283Array4 = this.aClass283Array4;
		arg2.anIntArrayArray41 = this.anIntArrayArray41;
		arg2.aShortArray107 = this.aShortArray107;
		arg2.aShortArray110 = this.aShortArray110;
		arg2.anIntArray437 = this.anIntArray437;
		arg2.aShortArray108 = this.aShortArray108;
		arg2.aClass285Array1 = this.aClass285Array1;
		return arg2;
	}

	@OriginalMember(owner = "client!qb", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort91;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class14 method8622(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(24) Class14_Sub2 local24;
		@Pc(20) Class14_Sub2 local20;
		if (arg0 == 1) {
			local20 = this.aClass101_Sub2_29.aClass14_Sub2_2;
			local24 = this.aClass101_Sub2_29.aClass14_Sub2_7;
		} else if (arg0 == 2) {
			local24 = this.aClass101_Sub2_29.aClass14_Sub2_3;
			local20 = this.aClass101_Sub2_29.aClass14_Sub2_8;
		} else if (arg0 == 3) {
			local20 = this.aClass101_Sub2_29.aClass14_Sub2_9;
			local24 = this.aClass101_Sub2_29.aClass14_Sub2_10;
		} else if (arg0 == 4) {
			local24 = this.aClass101_Sub2_29.aClass14_Sub2_6;
			local20 = this.aClass101_Sub2_29.aClass14_Sub2_4;
		} else if (arg0 == 5) {
			local20 = this.aClass101_Sub2_29.aClass14_Sub2_1;
			local24 = this.aClass101_Sub2_29.aClass14_Sub2_5;
		} else {
			local24 = local20 = new Class14_Sub2(this.aClass101_Sub2_29);
		}
		return this.method7602(arg0 != 0, arg2, local24, arg1, local20);
	}

	@OriginalMember(owner = "client!qb", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dm;IZ)V")
	@Override
	public void method8621(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray110 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8538; local14++) {
			if ((this.aShortArray110[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method9644(this.anIntArray434[local14], this.anIntArray438[local14], this.anIntArray436[local14], local12);
				} else {
					arg0.method9642(this.anIntArray434[local14], this.anIntArray438[local14], this.anIntArray436[local14], local12);
				}
				this.anIntArray434[local14] = local12[0];
				this.anIntArray438[local14] = local12[1];
				this.anIntArray436[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V")
	private void method7606(@OriginalArg(1) boolean arg0) {
		if (this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2.lb.length < this.anInt8573 * 6) {
			this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1((this.anInt8573 + 100) * 6);
		} else {
			this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2.anInt5725 = 0;
		}
		@Pc(42) Class2_Sub8_Sub1 local42 = this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2;
		@Pc(48) int local48;
		if (this.aClass101_Sub2_29.aBoolean470) {
			for (local48 = 0; local48 < this.anInt8573; local48++) {
				local42.method5192(this.aShortArray109[local48]);
				local42.method5192(this.aShortArray111[local48]);
				local42.method5192(this.aShortArray105[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt8573; local48++) {
				local42.method5228(this.aShortArray109[local48]);
				local42.method5228(this.aShortArray111[local48]);
				local42.method5228(this.aShortArray105[local48]);
			}
		}
		if (local42.anInt5725 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface20_3 == null) {
				this.anInterface20_3 = this.aClass101_Sub2_29.method5639(local42.lb, true, local42.anInt5725);
			} else {
				this.anInterface20_3.method6705(local42.lb, local42.anInt5725);
			}
			this.aClass311_1.anInterface20_4 = this.anInterface20_3;
		} else {
			this.aClass311_1.anInterface20_4 = this.aClass101_Sub2_29.method5639(local42.lb, false, local42.anInt5725);
		}
		if (!arg0) {
			this.aBoolean624 = true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort92;
	}

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!qb", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8538; local15++) {
			@Pc(33) int local33 = this.anIntArray438[local15] * local13 - this.anIntArray436[local15] * local9 >> 14;
			this.anIntArray436[local15] = this.anIntArray438[local15] * local9 + this.anIntArray436[local15] * local13 >> 14;
			this.anIntArray438[local15] = local33;
		}
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
		this.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!qb", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub1_Sub11 ba(@OriginalArg(0) Class2_Sub1_Sub11 arg0) {
		if (this.anInt8583 == 0) {
			return null;
		}
		if (!this.aBoolean623) {
			this.method7600();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass101_Sub2_29.anInt6341 > 0) {
			local40 = this.aShort90 - (this.aShort87 * this.aClass101_Sub2_29.anInt6341 >> 8) >> this.aClass101_Sub2_29.anInt6315;
			local57 = this.aShort84 - (this.aShort88 * this.aClass101_Sub2_29.anInt6341 >> 8) >> this.aClass101_Sub2_29.anInt6315;
		} else {
			local40 = this.aShort90 - (this.aClass101_Sub2_29.anInt6341 * this.aShort88 >> 8) >> this.aClass101_Sub2_29.anInt6315;
			local57 = this.aShort84 - (this.aClass101_Sub2_29.anInt6341 * this.aShort87 >> 8) >> this.aClass101_Sub2_29.anInt6315;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass101_Sub2_29.anInt6337 > 0) {
			local116 = this.aShort89 - (this.aShort87 * this.aClass101_Sub2_29.anInt6337 >> 8) >> this.aClass101_Sub2_29.anInt6315;
			local132 = this.aShort93 - (this.aClass101_Sub2_29.anInt6337 * this.aShort88 >> 8) >> this.aClass101_Sub2_29.anInt6315;
		} else {
			local116 = this.aShort89 - (this.aShort88 * this.aClass101_Sub2_29.anInt6337 >> 8) >> this.aClass101_Sub2_29.anInt6315;
			local132 = this.aShort93 - (this.aClass101_Sub2_29.anInt6337 * this.aShort87 >> 8) >> this.aClass101_Sub2_29.anInt6315;
		}
		@Pc(175) int local175 = local57 + 1 - local40;
		@Pc(181) int local181 = local132 + 1 - local116;
		@Pc(184) Class2_Sub1_Sub11_Sub1 local184 = (Class2_Sub1_Sub11_Sub1) arg0;
		@Pc(200) Class2_Sub1_Sub11_Sub1 local200;
		if (local184 != null && local184.method5411(local181, local175)) {
			local200 = local184;
			local184.method5409();
		} else {
			local200 = new Class2_Sub1_Sub11_Sub1(this.aClass101_Sub2_29, local175, local181);
		}
		local200.method5407(local132, local57, local116, local40);
		this.method7597(local200);
		return local200;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	private void method7607() {
		if (this.aClass285Array1 == null) {
			return;
		}
		@Pc(8) Class76_Sub1 local8 = this.aClass101_Sub2_29.aClass76_Sub1_2;
		this.aClass101_Sub2_29.method5652();
		this.aClass101_Sub2_29.C(!this.aBoolean626);
		this.aClass101_Sub2_29.method5691(false);
		this.aClass101_Sub2_29.method5650((Class274) null, this.aClass101_Sub2_29.aClass274_8, (Class274) null, this.aClass101_Sub2_29.aClass274_9);
		for (@Pc(40) int local40 = 0; local40 < this.anInt8527; local40++) {
			@Pc(47) Class285 local47 = this.aClass285Array1[local40];
			@Pc(52) Class303 local52 = this.aClass303Array1[local40];
			if (!local47.aBoolean612 || !this.aClass101_Sub2_29.method8101()) {
				@Pc(80) float local80 = (float) (this.anIntArray434[local47.anInt8318] + this.anIntArray434[local47.anInt8321] + this.anIntArray434[local47.anInt8319]) * 0.3333333F;
				@Pc(102) float local102 = (float) (this.anIntArray438[local47.anInt8318] + this.anIntArray438[local47.anInt8319] + this.anIntArray438[local47.anInt8321]) * 0.3333333F;
				@Pc(123) float local123 = (float) (this.anIntArray436[local47.anInt8318] + this.anIntArray436[local47.anInt8321] + this.anIntArray436[local47.anInt8319]) * 0.3333333F;
				@Pc(137) float local137 = Static315.aFloat115 + Static40.aFloat4 * local123 + Static385.aFloat161 * local102 + Static181.aFloat80 * local80;
				@Pc(151) float local151 = local102 * Static256.aFloat191 + Static528.aFloat180 * local80 + local123 * Static616.aFloat203 + Static172.aFloat77;
				@Pc(165) float local165 = local102 * Static114.aFloat31 + Static22.aFloat2 * local80 + Static619.aFloat199 * local123 + Static102.aFloat28;
				@Pc(186) float local186 = (float) (1.0D / Math.sqrt((double) (local165 * local165 + local137 * local137 + local151 * local151))) * (float) local47.anInt8316;
				local8.method4549(local186 * local165 - local165, -(local186 * local137) + local137 + (float) local52.anInt8814, local47.aShort79 * local52.anInt8821 >> 7, local52.anInt8817, local52.anInt8812 * local47.aShort77 >> 7, (float) local52.anInt8819 + local186 * local151 - local151);
				this.aClass101_Sub2_29.method5664(local8);
				@Pc(239) int local239 = local52.anInt8816;
				OpenGL.glColor4ub((byte) (local239 >> 16), (byte) (local239 >> 8), (byte) local239, (byte) (local239 >> 24));
				this.aClass101_Sub2_29.method5670(local47.aShort78);
				this.aClass101_Sub2_29.method5614(local47.aByte111);
				this.aClass101_Sub2_29.method5648(4);
			}
		}
		this.aClass101_Sub2_29.C(true);
		this.aClass101_Sub2_29.method5616();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dm;Lclient!et;I)V")
	@Override
	public void method8641(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8583 == 0) {
			return;
		}
		@Pc(13) Class76_Sub1 local13 = this.aClass101_Sub2_29.aClass76_Sub1_3;
		@Pc(16) Class76_Sub1 local16 = (Class76_Sub1) arg0;
		if (!this.aBoolean623) {
			this.method7600();
		}
		Static114.aFloat31 = local16.aFloat97 * local13.aFloat95 + local16.aFloat96 * local13.aFloat103 + local13.aFloat102 * local16.aFloat95;
		Static102.aFloat28 = local13.aFloat102 * local16.aFloat93 + local13.aFloat103 * local16.aFloat94 + local16.aFloat104 * local13.aFloat95 + local13.aFloat93;
		@Pc(69) float local69 = Static102.aFloat28 + Static114.aFloat31 * (float) this.aShort88;
		@Pc(77) float local77 = Static102.aFloat28 + Static114.aFloat31 * (float) this.aShort87;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local94 = (float) -this.aShort85 + local77;
			local87 = local69 + (float) this.aShort85;
		} else {
			local87 = local77 + (float) this.aShort85;
			local94 = (float) -this.aShort85 + local69;
		}
		if (local94 >= this.aClass101_Sub2_29.aFloat123 || local87 <= (float) this.aClass101_Sub2_29.anInt6338) {
			return;
		}
		Static315.aFloat115 = local13.aFloat98 * local16.aFloat94 + local13.aFloat96 * local16.aFloat104 + local13.aFloat99 * local16.aFloat93 + local13.aFloat94;
		Static385.aFloat161 = local16.aFloat95 * local13.aFloat99 + local16.aFloat97 * local13.aFloat96 + local13.aFloat98 * local16.aFloat96;
		@Pc(171) float local171 = Static315.aFloat115 + Static385.aFloat161 * (float) this.aShort88;
		@Pc(179) float local179 = Static315.aFloat115 + (float) this.aShort87 * Static385.aFloat161;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (float) this.aClass101_Sub2_29.anInt6347 * ((float) this.aShort85 + local171);
			local206 = (float) this.aClass101_Sub2_29.anInt6347 * ((float) -this.aShort85 + local179);
		} else {
			local206 = (float) this.aClass101_Sub2_29.anInt6347 * (local171 - (float) this.aShort85);
			local194 = (local179 + (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6347;
		}
		if (local206 / local87 >= this.aClass101_Sub2_29.aFloat138 || local194 / local87 <= this.aClass101_Sub2_29.aFloat135) {
			return;
		}
		Static256.aFloat191 = local13.aFloat100 * local16.aFloat95 + local13.aFloat97 * local16.aFloat97 + local13.aFloat101 * local16.aFloat96;
		Static172.aFloat77 = local16.aFloat93 * local13.aFloat100 + local13.aFloat101 * local16.aFloat94 + local16.aFloat104 * local13.aFloat97 + local13.aFloat104;
		@Pc(295) float local295 = Static172.aFloat77 + (float) this.aShort88 * Static256.aFloat191;
		@Pc(303) float local303 = Static172.aFloat77 + (float) this.aShort87 * Static256.aFloat191;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local303 < local295) {
			local318 = (local303 - (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6336;
			local329 = (local295 + (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6336;
		} else {
			local318 = (local295 - (float) this.aShort85) * (float) this.aClass101_Sub2_29.anInt6336;
			local329 = (float) this.aClass101_Sub2_29.anInt6336 * (local303 + (float) this.aShort85);
		}
		if (this.aClass101_Sub2_29.aFloat139 <= local318 / local87 || local329 / local87 <= this.aClass101_Sub2_29.aFloat134) {
			return;
		}
		if (arg1 != null || this.aClass285Array1 != null) {
			Static181.aFloat80 = local16.aFloat103 * local13.aFloat99 + local13.aFloat98 * local16.aFloat98 + local16.aFloat101 * local13.aFloat96;
			Static616.aFloat203 = local13.aFloat100 * local16.aFloat102 + local16.aFloat100 * local13.aFloat97 + local16.aFloat99 * local13.aFloat101;
			Static528.aFloat180 = local13.aFloat97 * local16.aFloat101 + local13.aFloat101 * local16.aFloat98 + local13.aFloat100 * local16.aFloat103;
			Static40.aFloat4 = local13.aFloat98 * local16.aFloat99 + local13.aFloat96 * local16.aFloat100 + local16.aFloat102 * local13.aFloat99;
			Static619.aFloat199 = local16.aFloat102 * local13.aFloat102 + local13.aFloat95 * local16.aFloat100 + local16.aFloat99 * local13.aFloat103;
			Static22.aFloat2 = local16.aFloat103 * local13.aFloat102 + local13.aFloat95 * local16.aFloat101 + local13.aFloat103 * local16.aFloat98;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.aShort90 + this.aShort84 >> 1;
			@Pc(508) int local508 = this.aShort89 + this.aShort93 >> 1;
			@Pc(527) int local527 = (int) (Static181.aFloat80 * (float) local499 + Static315.aFloat115 + Static385.aFloat161 * (float) this.aShort88 + Static40.aFloat4 * (float) local508);
			@Pc(546) int local546 = (int) (Static616.aFloat203 * (float) local508 + (float) this.aShort88 * Static256.aFloat191 + (float) local499 * Static528.aFloat180 + Static172.aFloat77);
			@Pc(565) int local565 = (int) ((float) local508 * Static619.aFloat199 + Static114.aFloat31 * (float) this.aShort88 + (float) local499 * Static22.aFloat2 + Static102.aFloat28);
			if (local565 < this.aClass101_Sub2_29.anInt6338) {
				local488 = true;
			} else {
				arg1.anInt2728 = this.aClass101_Sub2_29.anInt6326 + local546 * this.aClass101_Sub2_29.anInt6336 / local565;
				arg1.anInt2727 = this.aClass101_Sub2_29.anInt6340 + this.aClass101_Sub2_29.anInt6347 * local527 / local565;
			}
			@Pc(619) int local619 = (int) ((float) local508 * Static40.aFloat4 + (float) this.aShort87 * Static385.aFloat161 + Static181.aFloat80 * (float) local499 + Static315.aFloat115);
			@Pc(638) int local638 = (int) (Static172.aFloat77 + Static528.aFloat180 * (float) local499 + (float) this.aShort87 * Static256.aFloat191 + Static616.aFloat203 * (float) local508);
			@Pc(657) int local657 = (int) ((float) this.aShort87 * Static114.aFloat31 + Static102.aFloat28 + (float) local499 * Static22.aFloat2 + Static619.aFloat199 * (float) local508);
			if (this.aClass101_Sub2_29.anInt6338 > local657) {
				local488 = true;
			} else {
				arg1.anInt2725 = local638 * this.aClass101_Sub2_29.anInt6336 / local657 + this.aClass101_Sub2_29.anInt6326;
				arg1.anInt2726 = local619 * this.aClass101_Sub2_29.anInt6347 / local657 + this.aClass101_Sub2_29.anInt6340;
			}
			if (local488) {
				if (this.aClass101_Sub2_29.anInt6338 > local565 && local657 < this.aClass101_Sub2_29.anInt6338) {
					local490 = false;
				} else {
					@Pc(733) int local733;
					@Pc(744) int local744;
					@Pc(755) int local755;
					if (this.aClass101_Sub2_29.anInt6338 > local565) {
						local733 = (local657 - this.aClass101_Sub2_29.anInt6338 << 16) / (local657 - local565);
						local744 = (local733 * (local619 - local527) >> 16) + local619;
						local755 = local638 + ((local638 - local546) * local733 >> 16);
						arg1.anInt2727 = this.aClass101_Sub2_29.anInt6347 * local744 / this.aClass101_Sub2_29.anInt6338 + this.aClass101_Sub2_29.anInt6340;
						arg1.anInt2728 = this.aClass101_Sub2_29.anInt6326 + this.aClass101_Sub2_29.anInt6336 * local755 / this.aClass101_Sub2_29.anInt6338;
					} else if (local657 < this.aClass101_Sub2_29.anInt6338) {
						local733 = (local565 - this.aClass101_Sub2_29.anInt6338 << 16) / (local565 - local657);
						local744 = (local733 * (local527 - local619) >> 16) + local527;
						arg1.anInt2727 = local744 * this.aClass101_Sub2_29.anInt6347 / this.aClass101_Sub2_29.anInt6338 + this.aClass101_Sub2_29.anInt6340;
						local755 = (local733 * (local546 - local638) >> 16) + local546;
						arg1.anInt2728 = this.aClass101_Sub2_29.anInt6326 + local755 * this.aClass101_Sub2_29.anInt6336 / this.aClass101_Sub2_29.anInt6338;
					}
				}
			}
			if (local490) {
				if (local565 <= local657) {
					arg1.anInt2724 = (this.aShort85 + local619) * this.aClass101_Sub2_29.anInt6347 / local657 + this.aClass101_Sub2_29.anInt6340 - arg1.anInt2726;
				} else {
					arg1.anInt2724 = (this.aShort85 + local527) * this.aClass101_Sub2_29.anInt6347 / local565 + this.aClass101_Sub2_29.anInt6340 - arg1.anInt2727;
				}
				arg1.aBoolean200 = true;
			}
		}
		this.aClass101_Sub2_29.method5620();
		this.aClass101_Sub2_29.method5617(local16);
		this.method7601();
		this.aClass101_Sub2_29.method5616();
		this.method7607();
	}

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
		this.aShort92 = (short) arg0;
	}

	@OriginalMember(owner = "client!qb", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8525; local3++) {
			this.anIntArray434[local3] = this.anIntArray434[local3] + 7 >> 4;
			this.anIntArray438[local3] = this.anIntArray438[local3] + 7 >> 4;
			this.anIntArray436[local3] = this.anIntArray436[local3] + 7 >> 4;
		}
		this.aBoolean623 = false;
		if (this.aClass274_15 != null) {
			this.aClass274_15.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static546.anInt9529 = 0;
			Static312.anInt5631 = 0;
			local28 = 0;
			Static584.anInt4547 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray40.length) {
					local52 = this.anIntArrayArray40[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local60]) != 0) {
							Static584.anInt4547 += this.anIntArray434[local60];
							Static546.anInt9529 += this.anIntArray438[local60];
							local28++;
							Static312.anInt5631 += this.anIntArray436[local60];
						}
					}
				}
			}
			if (local28 > 0) {
				Static546.anInt9529 = Static546.anInt9529 / local28 + arg3;
				Static584.anInt4547 = Static584.anInt4547 / local28 + arg2;
				Static312.anInt5631 = arg4 + Static312.anInt5631 / local28;
				Static515.aBoolean667 = true;
			} else {
				Static584.anInt4547 = arg2;
				Static312.anInt5631 = arg4;
				Static546.anInt9529 = arg3;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local28;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray40.length) {
					local246 = this.anIntArrayArray40[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local54 = local246[local248];
						if (this.aShortArray110 == null || (this.aShortArray110[local54] & arg6) != 0) {
							this.anIntArray434[local54] += arg2;
							this.anIntArray438[local54] += arg3;
							this.anIntArray436[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(369) int local369;
		@Pc(391) int local391;
		@Pc(414) int local414;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(634) int local634;
		@Pc(659) int local659;
		@Pc(663) int local663;
		@Pc(671) int local671;
		@Pc(676) int local676;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(686) int local686;
		@Pc(815) int[] local815;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(827) int local827;
		@Pc(955) int local955;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray40.length > local32) {
						local246 = this.anIntArrayArray40[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local54 = local246[local248];
							if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local54]) != 0) {
								this.anIntArray434[local54] -= Static584.anInt4547;
								this.anIntArray438[local54] -= Static546.anInt9529;
								this.anIntArray436[local54] -= Static312.anInt5631;
								if (arg4 != 0) {
									local60 = Class12_Sub2.anIntArray204[arg4];
									local369 = Class12_Sub2.anIntArray203[arg4];
									local391 = this.anIntArray434[local54] * local369 + this.anIntArray438[local54] * local60 + 16383 >> 14;
									this.anIntArray438[local54] = local369 * this.anIntArray438[local54] + 16383 - local60 * this.anIntArray434[local54] >> 14;
									this.anIntArray434[local54] = local391;
								}
								if (arg2 != 0) {
									local60 = Class12_Sub2.anIntArray204[arg2];
									local369 = Class12_Sub2.anIntArray203[arg2];
									local391 = local369 * this.anIntArray438[local54] + 16383 - this.anIntArray436[local54] * local60 >> 14;
									this.anIntArray436[local54] = this.anIntArray436[local54] * local369 + local60 * this.anIntArray438[local54] + 16383 >> 14;
									this.anIntArray438[local54] = local391;
								}
								if (arg3 != 0) {
									local60 = Class12_Sub2.anIntArray204[arg3];
									local369 = Class12_Sub2.anIntArray203[arg3];
									local391 = this.anIntArray436[local54] * local60 + local369 * this.anIntArray434[local54] + 16383 >> 14;
									this.anIntArray436[local54] = this.anIntArray436[local54] * local369 + 16383 - this.anIntArray434[local54] * local60 >> 14;
									this.anIntArray434[local54] = local391;
								}
								this.anIntArray434[local54] += Static584.anInt4547;
								this.anIntArray438[local54] += Static546.anInt9529;
								this.anIntArray436[local54] += Static312.anInt5631;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray40.length) {
							local52 = this.anIntArrayArray40[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray110 == null || (this.aShortArray110[local60] & arg6) != 0) {
									local369 = this.anIntArray435[local60];
									local391 = this.anIntArray435[local60 + 1];
									for (local414 = local369; local414 < local391; local414++) {
										local449 = this.aShortArray108[local414] - 1;
										if (local449 == -1) {
											break;
										}
										if (arg4 != 0) {
											local453 = Class12_Sub2.anIntArray204[arg4];
											local457 = Class12_Sub2.anIntArray203[arg4];
											local461 = local453 * this.lb[local449] + this.aShortArray112[local449] * local457 + 16383 >> 14;
											this.lb[local449] = (short) (local457 * this.lb[local449] + 16383 - this.aShortArray112[local449] * local453 >> 14);
											this.aShortArray112[local449] = (short) local461;
										}
										if (arg2 != 0) {
											local453 = Class12_Sub2.anIntArray204[arg2];
											local457 = Class12_Sub2.anIntArray203[arg2];
											local461 = local457 * this.lb[local449] + 16383 - local453 * this.aShortArray113[local449] >> 14;
											this.aShortArray113[local449] = (short) (this.aShortArray113[local449] * local457 + this.lb[local449] * local453 + 16383 >> 14);
											this.lb[local449] = (short) local461;
										}
										if (arg3 != 0) {
											local453 = Class12_Sub2.anIntArray204[arg3];
											local457 = Class12_Sub2.anIntArray203[arg3];
											local461 = local453 * this.aShortArray113[local449] + this.aShortArray112[local449] * local457 + 16383 >> 14;
											this.aShortArray113[local449] = (short) (this.aShortArray113[local449] * local457 + 16383 - local453 * this.aShortArray112[local449] >> 14);
											this.aShortArray112[local449] = (short) local461;
										}
									}
								}
							}
						}
					}
					if (this.aClass274_13 == null && this.aClass274_16 != null) {
						this.aClass274_16.anInterface2_6 = null;
					}
					if (this.aClass274_13 != null) {
						this.aClass274_13.anInterface2_6 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static515.aBoolean667) {
					local369 = arg7[0] * Static584.anInt4547 + Static546.anInt9529 * arg7[3] + arg7[6] * Static312.anInt5631 + 8192 >> 14;
					local391 = Static584.anInt4547 * arg7[1] + Static546.anInt9529 * arg7[4] + Static312.anInt5631 * arg7[7] + 8192 >> 14;
					local414 = arg7[5] * Static546.anInt9529 + arg7[2] * Static584.anInt4547 + Static312.anInt5631 * arg7[8] + 8192 >> 14;
					local369 += local248;
					local391 += local54;
					Static546.anInt9529 = local391;
					local414 += local60;
					Static584.anInt4547 = local369;
					Static312.anInt5631 = local414;
					Static515.aBoolean667 = false;
				}
				@Pc(437) int[] local437 = new int[9];
				local391 = Class12_Sub2.anIntArray203[arg2];
				local414 = Class12_Sub2.anIntArray204[arg2];
				local449 = Class12_Sub2.anIntArray203[arg3];
				local453 = Class12_Sub2.anIntArray204[arg3];
				local457 = Class12_Sub2.anIntArray203[arg4];
				local461 = Class12_Sub2.anIntArray204[arg4];
				local469 = local414 * local457 + 8192 >> 14;
				local477 = local414 * local461 + 8192 >> 14;
				local437[0] = local457 * local449 + local477 * local453 + 8192 >> 14;
				local437[4] = local457 * local391 + 8192 >> 14;
				local437[8] = local391 * local449 + 8192 >> 14;
				local437[6] = -local453 * local457 + local477 * local449 + 8192 >> 14;
				local437[5] = -local414;
				local437[1] = local453 * local469 + local461 * -local449 + 8192 >> 14;
				local437[3] = local391 * local461 + 8192 >> 14;
				local437[7] = local461 * local453 + local469 * local449 + 8192 >> 14;
				local437[2] = local453 * local391 + 8192 >> 14;
				@Pc(608) int local608 = local437[1] * -Static546.anInt9529 + local437[0] * -Static584.anInt4547 + local437[2] * -Static312.anInt5631 + 8192 >> 14;
				local634 = local437[5] * -Static312.anInt5631 + local437[3] * -Static584.anInt4547 + local437[4] * -Static546.anInt9529 + 8192 >> 14;
				local659 = local437[8] * -Static312.anInt5631 + local437[7] * -Static546.anInt9529 + local437[6] * -Static584.anInt4547 + 8192 >> 14;
				local663 = Static584.anInt4547 + local608;
				@Pc(667) int local667 = local634 + Static546.anInt9529;
				local671 = Static312.anInt5631 + local659;
				@Pc(674) int[] local674 = new int[9];
				for (local676 = 0; local676 < 3; local676++) {
					for (local680 = 0; local680 < 3; local680++) {
						local684 = 0;
						for (local686 = 0; local686 < 3; local686++) {
							local684 += arg7[local686 + local680 * 3] * local437[local686 + local676 * 3];
						}
						local674[local680 + local676 * 3] = local684 + 8192 >> 14;
					}
				}
				local680 = local437[2] * local60 + local54 * local437[1] + local248 * local437[0] + 8192 >> 14;
				local684 = local437[5] * local60 + local437[4] * local54 + local437[3] * local248 + 8192 >> 14;
				local686 = local437[8] * local60 + local437[7] * local54 + local437[6] * local248 + 8192 >> 14;
				local680 += local663;
				local684 += local667;
				local686 += local671;
				local815 = new int[9];
				for (local817 = 0; local817 < 3; local817++) {
					for (local821 = 0; local821 < 3; local821++) {
						local825 = 0;
						for (local827 = 0; local827 < 3; local827++) {
							local825 += arg7[local827 + local817 * 3] * local674[local827 * 3 + local821];
						}
						local815[local821 + local817 * 3] = local825 + 8192 >> 14;
					}
				}
				local821 = arg7[2] * local686 + arg7[0] * local680 + arg7[1] * local684 + 8192 >> 14;
				local825 = arg7[5] * local686 + arg7[3] * local680 + local684 * arg7[4] + 8192 >> 14;
				local827 = local680 * arg7[6] + local684 * arg7[7] + arg7[8] * local686 + 8192 >> 14;
				local821 += local28;
				local825 += local32;
				local827 += local38;
				for (local955 = 0; local955 < local8; local955++) {
					@Pc(961) int local961 = arg1[local955];
					if (local961 < this.anIntArrayArray40.length) {
						@Pc(971) int[] local971 = this.anIntArrayArray40[local961];
						for (@Pc(973) int local973 = 0; local973 < local971.length; local973++) {
							@Pc(979) int local979 = local971[local973];
							if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local979]) != 0) {
								@Pc(1023) int local1023 = local815[2] * this.anIntArray436[local979] + this.anIntArray438[local979] * local815[1] + local815[0] * this.anIntArray434[local979] + 8192 >> 14;
								@Pc(1054) int local1054 = local815[5] * this.anIntArray436[local979] + local815[4] * this.anIntArray438[local979] + local815[3] * this.anIntArray434[local979] + 8192 >> 14;
								@Pc(1085) int local1085 = local815[8] * this.anIntArray436[local979] + this.anIntArray438[local979] * local815[7] + local815[6] * this.anIntArray434[local979] + 8192 >> 14;
								@Pc(1089) int local1089 = local1054 + local825;
								@Pc(1093) int local1093 = local1023 + local821;
								@Pc(1097) int local1097 = local1085 + local827;
								this.anIntArray434[local979] = local1093;
								this.anIntArray438[local979] = local1089;
								this.anIntArray436[local979] = local1097;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2568) Class285 local2568;
			@Pc(2573) Class303 local2573;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray41.length > local32) {
							local246 = this.anIntArrayArray41[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local54 = local246[local248];
								if (this.aShortArray107 == null || (arg6 & this.aShortArray107[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray76[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray76[local54] = (byte) local60;
									if (this.aClass274_16 != null) {
										this.aClass274_16.anInterface2_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass285Array1 != null) {
						for (local32 = 0; local32 < this.anInt8527; local32++) {
							local2568 = this.aClass285Array1[local32];
							local2573 = this.aClass303Array1[local32];
							local2573.anInt8816 = 255 - (this.aByteArray76[local2568.anInt8317] & 0xFF) << 24 | local2573.anInt8816 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2843) Class303 local2843;
				if (arg0 == 8) {
					if (this.anIntArrayArray39 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray39.length) {
								local246 = this.anIntArrayArray39[local32];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2843 = this.aClass303Array1[local246[local248]];
									local2843.anInt8814 += arg2;
									local2843.anInt8819 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray39 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray39.length) {
								local246 = this.anIntArrayArray39[local32];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2843 = this.aClass303Array1[local246[local248]];
									local2843.anInt8821 = arg2 * local2843.anInt8821 >> 7;
									local2843.anInt8812 = arg3 * local2843.anInt8812 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray39 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray39.length > local32) {
							local246 = this.anIntArrayArray39[local32];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2843 = this.aClass303Array1[local246[local248]];
								local2843.anInt8817 = local2843.anInt8817 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray41.length > local32) {
						local246 = this.anIntArrayArray41[local32];
						for (local248 = 0; local248 < local246.length; local248++) {
							local54 = local246[local248];
							if (this.aShortArray107 == null || (arg6 & this.aShortArray107[local54]) != 0) {
								local60 = this.aShortArray114[local54] & 0xFFFF;
								local369 = local60 >> 10 & 0x3F;
								local391 = local60 >> 7 & 0x7;
								@Pc(2678) int local2678 = local369 + arg2 & 0x3F;
								local414 = local60 & 0x7F;
								local391 += arg3 / 4;
								if (local391 < 0) {
									local391 = 0;
								} else if (local391 > 7) {
									local391 = 7;
								}
								local414 += arg4;
								if (local414 < 0) {
									local414 = 0;
								} else if (local414 > 127) {
									local414 = 127;
								}
								this.aShortArray114[local54] = (short) (local414 | local391 << 7 | local2678 << 10);
								if (this.aClass274_16 != null) {
									this.aClass274_16.anInterface2_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass285Array1 != null) {
					for (local32 = 0; local32 < this.anInt8527; local32++) {
						local2568 = this.aClass285Array1[local32];
						local2573 = this.aClass303Array1[local32];
						local2573.anInt8816 = local2573.anInt8816 & 0xFF000000 | Static101.anIntArray92[this.aShortArray114[local2568.anInt8317] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray40.length) {
					local246 = this.anIntArrayArray40[local32];
					for (local248 = 0; local248 < local246.length; local248++) {
						local54 = local246[local248];
						if (this.aShortArray110 == null || (this.aShortArray110[local54] & arg6) != 0) {
							this.anIntArray434[local54] -= Static584.anInt4547;
							this.anIntArray438[local54] -= Static546.anInt9529;
							this.anIntArray436[local54] -= Static312.anInt5631;
							this.anIntArray434[local54] = this.anIntArray434[local54] * arg2 >> 7;
							this.anIntArray438[local54] = arg3 * this.anIntArray438[local54] >> 7;
							this.anIntArray436[local54] = arg4 * this.anIntArray436[local54] >> 7;
							this.anIntArray434[local54] += Static584.anInt4547;
							this.anIntArray438[local54] += Static546.anInt9529;
							this.anIntArray436[local54] += Static312.anInt5631;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static515.aBoolean667) {
				local369 = arg7[0] * Static584.anInt4547 + Static546.anInt9529 * arg7[3] + arg7[6] * Static312.anInt5631 + 8192 >> 14;
				local391 = Static584.anInt4547 * arg7[1] + Static546.anInt9529 * arg7[4] + Static312.anInt5631 * arg7[7] + 8192 >> 14;
				local369 += local248;
				local391 += local54;
				local414 = arg7[8] * Static312.anInt5631 + arg7[5] * Static546.anInt9529 + arg7[2] * Static584.anInt4547 + 8192 >> 14;
				Static546.anInt9529 = local391;
				Static584.anInt4547 = local369;
				local414 += local60;
				Static515.aBoolean667 = false;
				Static312.anInt5631 = local414;
			}
			local369 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local414 = arg4 << 15 >> 7;
			local449 = -Static584.anInt4547 * local369 + 8192 >> 14;
			local453 = -Static546.anInt9529 * local391 + 8192 >> 14;
			local457 = local414 * -Static312.anInt5631 + 8192 >> 14;
			local461 = local449 + Static584.anInt4547;
			local469 = Static546.anInt9529 + local453;
			local477 = Static312.anInt5631 + local457;
			@Pc(1857) int[] local1857 = new int[] { local369 * arg7[0] + 8192 >> 14, arg7[3] * local369 + 8192 >> 14, local369 * arg7[6] + 8192 >> 14, arg7[1] * local391 + 8192 >> 14, arg7[4] * local391 + 8192 >> 14, arg7[7] * local391 + 8192 >> 14, local414 * arg7[2] + 8192 >> 14, local414 * arg7[5] + 8192 >> 14, local414 * arg7[8] + 8192 >> 14 };
			local634 = local248 * local369 + 8192 >> 14;
			local659 = local54 * local391 + 8192 >> 14;
			@Pc(1985) int local1985 = local659 + local469;
			@Pc(1989) int local1989 = local634 + local461;
			local663 = local414 * local60 + 8192 >> 14;
			@Pc(2001) int local2001 = local663 + local477;
			@Pc(2004) int[] local2004 = new int[9];
			@Pc(2010) int local2010;
			for (local671 = 0; local671 < 3; local671++) {
				for (local2010 = 0; local2010 < 3; local2010++) {
					local676 = 0;
					for (local680 = 0; local680 < 3; local680++) {
						local676 += arg7[local671 * 3 + local680] * local1857[local680 * 3 + local2010];
					}
					local2004[local671 * 3 + local2010] = local676 + 8192 >> 14;
				}
			}
			local2010 = arg7[1] * local1985 + local1989 * arg7[0] + local2001 * arg7[2] + 8192 >> 14;
			local676 = local1985 * arg7[4] + local1989 * arg7[3] + arg7[5] * local2001 + 8192 >> 14;
			local676 += local32;
			local2010 += local28;
			local680 = local2001 * arg7[8] + arg7[6] * local1989 + local1985 * arg7[7] + 8192 >> 14;
			local680 += local38;
			for (local684 = 0; local684 < local8; local684++) {
				local686 = arg1[local684];
				if (this.anIntArrayArray40.length > local686) {
					local815 = this.anIntArrayArray40[local686];
					for (local817 = 0; local817 < local815.length; local817++) {
						local821 = local815[local817];
						if (this.aShortArray110 == null || (this.aShortArray110[local821] & arg6) != 0) {
							local825 = this.anIntArray436[local821] * local2004[2] + local2004[0] * this.anIntArray434[local821] + this.anIntArray438[local821] * local2004[1] + 8192 >> 14;
							local827 = this.anIntArray436[local821] * local2004[5] + this.anIntArray438[local821] * local2004[4] + this.anIntArray434[local821] * local2004[3] + 8192 >> 14;
							@Pc(2247) int local2247 = local825 + local2010;
							local955 = this.anIntArray434[local821] * local2004[6] + this.anIntArray438[local821] * local2004[7] + local2004[8] * this.anIntArray436[local821] + 8192 >> 14;
							@Pc(2284) int local2284 = local827 + local676;
							@Pc(2288) int local2288 = local955 + local680;
							this.anIntArray434[local821] = local2247;
							this.anIntArray438[local821] = local2284;
							this.anIntArray436[local821] = local2288;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILclient!ida;IIFIJF)S")
	private short method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray435[arg1];
		@Pc(17) int local17 = this.anIntArray435[arg1 + 1];
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = local10; local28 < local17; local28++) {
			@Pc(35) short local35 = this.aShortArray108[local28];
			if (local35 == 0) {
				local26 = local28;
				break;
			}
			if (Static198.aLongArray10[local28] == arg7) {
				return (short) (local35 - 1);
			}
		}
		this.aShortArray108[local26] = (short) (this.anInt8583 + 1);
		Static198.aLongArray10[local26] = arg7;
		this.aShortArray112[this.anInt8583] = (short) arg6;
		this.lb[this.anInt8583] = (short) arg2;
		this.aShortArray113[this.anInt8583] = (short) arg4;
		this.aByteArray75[this.anInt8583] = (byte) arg0;
		this.aFloatArray56[this.anInt8583] = arg8;
		this.aFloatArray55[this.anInt8583] = arg5;
		return (short) this.anInt8583++;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	@Override
	protected void method8618() {
	}

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static312.anInt5631 = 0;
			local14 = 0;
			Static546.anInt9529 = 0;
			Static584.anInt4547 = 0;
			for (local20 = 0; local20 < this.anInt8538; local20++) {
				Static584.anInt4547 += this.anIntArray434[local20];
				Static546.anInt9529 += this.anIntArray438[local20];
				Static312.anInt5631 += this.anIntArray436[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static312.anInt5631 = arg3;
				Static584.anInt4547 = arg1;
				Static546.anInt9529 = arg2;
			} else {
				Static312.anInt5631 = Static312.anInt5631 / local14 + arg3;
				Static546.anInt9529 = Static546.anInt9529 / local14 + arg2;
				Static584.anInt4547 = Static584.anInt4547 / local14 + arg1;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt8538; local14++) {
				this.anIntArray434[local14] += arg1;
				this.anIntArray438[local14] += arg2;
				this.anIntArray436[local14] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt8538; local14++) {
					this.anIntArray434[local14] -= Static584.anInt4547;
					this.anIntArray438[local14] -= Static546.anInt9529;
					this.anIntArray436[local14] -= Static312.anInt5631;
					if (arg3 != 0) {
						local20 = Class12_Sub2.anIntArray204[arg3];
						local167 = Class12_Sub2.anIntArray203[arg3];
						local185 = local20 * this.anIntArray438[local14] + this.anIntArray434[local14] * local167 + 16383 >> 14;
						this.anIntArray438[local14] = local167 * this.anIntArray438[local14] + 16383 - local20 * this.anIntArray434[local14] >> 14;
						this.anIntArray434[local14] = local185;
					}
					if (arg1 != 0) {
						local20 = Class12_Sub2.anIntArray204[arg1];
						local167 = Class12_Sub2.anIntArray203[arg1];
						local185 = this.anIntArray438[local14] * local167 + 16383 - this.anIntArray436[local14] * local20 >> 14;
						this.anIntArray436[local14] = local167 * this.anIntArray436[local14] + this.anIntArray438[local14] * local20 + 16383 >> 14;
						this.anIntArray438[local14] = local185;
					}
					if (arg2 != 0) {
						local20 = Class12_Sub2.anIntArray204[arg2];
						local167 = Class12_Sub2.anIntArray203[arg2];
						local185 = local167 * this.anIntArray434[local14] + this.anIntArray436[local14] * local20 + 16383 >> 14;
						this.anIntArray436[local14] = this.anIntArray436[local14] * local167 + 16383 - this.anIntArray434[local14] * local20 >> 14;
						this.anIntArray434[local14] = local185;
					}
					this.anIntArray434[local14] += Static584.anInt4547;
					this.anIntArray438[local14] += Static546.anInt9529;
					this.anIntArray436[local14] += Static312.anInt5631;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt8538; local14++) {
					this.anIntArray434[local14] -= Static584.anInt4547;
					this.anIntArray438[local14] -= Static546.anInt9529;
					this.anIntArray436[local14] -= Static312.anInt5631;
					this.anIntArray434[local14] = this.anIntArray434[local14] * arg1 / 128;
					this.anIntArray438[local14] = this.anIntArray438[local14] * arg2 / 128;
					this.anIntArray436[local14] = this.anIntArray436[local14] * arg3 / 128;
					this.anIntArray434[local14] += Static584.anInt4547;
					this.anIntArray438[local14] += Static546.anInt9529;
					this.anIntArray436[local14] += Static312.anInt5631;
				}
			} else {
				@Pc(530) Class285 local530;
				@Pc(535) Class303 local535;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt8534; local14++) {
						local20 = (this.aByteArray76[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray76[local14] = (byte) local20;
					}
					if (this.aClass274_16 != null) {
						this.aClass274_16.anInterface2_6 = null;
					}
					if (this.aClass285Array1 != null) {
						for (local20 = 0; local20 < this.anInt8527; local20++) {
							local530 = this.aClass285Array1[local20];
							local535 = this.aClass303Array1[local20];
							local535.anInt8816 = local535.anInt8816 & 0xFFFFFF | 255 - (this.aByteArray76[local530.anInt8317] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt8534; local14++) {
						local20 = this.aShortArray114[local14] & 0xFFFF;
						local167 = local20 >> 10 & 0x3F;
						local185 = local20 >> 7 & 0x7;
						local185 += arg2 / 4;
						@Pc(600) int local600 = local20 & 0x7F;
						@Pc(607) int local607 = local167 + arg1 & 0x3F;
						local600 += arg3;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						if (local600 < 0) {
							local600 = 0;
						} else if (local600 > 127) {
							local600 = 127;
						}
						this.aShortArray114[local14] = (short) (local607 << 10 | local185 << 7 | local600);
					}
					if (this.aClass274_16 != null) {
						this.aClass274_16.anInterface2_6 = null;
					}
					if (this.aClass285Array1 != null) {
						for (local20 = 0; local20 < this.anInt8527; local20++) {
							local530 = this.aClass285Array1[local20];
							local535 = this.aClass303Array1[local20];
							local535.anInt8816 = local535.anInt8816 & 0xFF000000 | Static101.anIntArray92[this.aShortArray114[local530.anInt8317] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(721) Class303 local721;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt8527; local14++) {
							local721 = this.aClass303Array1[local14];
							local721.anInt8814 += arg1;
							local721.anInt8819 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt8527; local14++) {
							local721 = this.aClass303Array1[local14];
							local721.anInt8821 = local721.anInt8821 * arg1 >> 7;
							local721.anInt8812 = local721.anInt8812 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt8527; local14++) {
							local721 = this.aClass303Array1[local14];
							local721.anInt8817 = arg1 + local721.anInt8817 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!dm;ZII)Z")
	@Override
	public boolean method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7609(arg3, arg2, arg5, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!qb", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort91 = (short) arg0;
		if (this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
		if (this.aClass274_13 != null) {
			this.aClass274_13.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8632(@OriginalArg(0) Class76 arg0) {
		@Pc(8) Class76_Sub1 local8 = (Class76_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass283Array4 != null) {
			for (local13 = 0; local13 < this.aClass283Array4.length; local13++) {
				@Pc(20) Class283 local20 = this.aClass283Array4[local13];
				@Pc(22) Class283 local22 = local20;
				if (local20.aClass283_1 != null) {
					local22 = local20.aClass283_1;
				}
				local22.anInt8255 = (int) (local8.aFloat94 + local8.aFloat99 * (float) this.anIntArray436[local20.anInt8258] + local8.aFloat98 * (float) this.anIntArray434[local20.anInt8258] + local8.aFloat96 * (float) this.anIntArray438[local20.anInt8258]);
				local22.anInt8249 = (int) (local8.aFloat104 + (float) this.anIntArray434[local20.anInt8258] * local8.aFloat101 + local8.aFloat97 * (float) this.anIntArray438[local20.anInt8258] + (float) this.anIntArray436[local20.anInt8258] * local8.aFloat100);
				local22.anInt8246 = (int) ((float) this.anIntArray436[local20.anInt8258] * local8.aFloat102 + (float) this.anIntArray438[local20.anInt8258] * local8.aFloat95 + (float) this.anIntArray434[local20.anInt8258] * local8.aFloat103 + local8.aFloat93);
				local22.anInt8245 = (int) (local8.aFloat94 + (float) this.anIntArray436[local20.anInt8262] * local8.aFloat99 + local8.aFloat96 * (float) this.anIntArray438[local20.anInt8262] + (float) this.anIntArray434[local20.anInt8262] * local8.aFloat98);
				local22.anInt8254 = (int) (local8.aFloat100 * (float) this.anIntArray436[local20.anInt8262] + local8.aFloat101 * (float) this.anIntArray434[local20.anInt8262] + local8.aFloat97 * (float) this.anIntArray438[local20.anInt8262] + local8.aFloat104);
				local22.anInt8263 = (int) (local8.aFloat93 + (float) this.anIntArray434[local20.anInt8262] * local8.aFloat103 + local8.aFloat95 * (float) this.anIntArray438[local20.anInt8262] + local8.aFloat102 * (float) this.anIntArray436[local20.anInt8262]);
				local22.anInt8251 = (int) (local8.aFloat96 * (float) this.anIntArray438[local20.anInt8247] + local8.aFloat98 * (float) this.anIntArray434[local20.anInt8247] + local8.aFloat99 * (float) this.anIntArray436[local20.anInt8247] + local8.aFloat94);
				local22.anInt8257 = (int) (local8.aFloat104 + local8.aFloat97 * (float) this.anIntArray438[local20.anInt8247] + local8.aFloat101 * (float) this.anIntArray434[local20.anInt8247] + (float) this.anIntArray436[local20.anInt8247] * local8.aFloat100);
				local22.anInt8244 = (int) (local8.aFloat93 + (float) this.anIntArray434[local20.anInt8247] * local8.aFloat103 + local8.aFloat95 * (float) this.anIntArray438[local20.anInt8247] + local8.aFloat102 * (float) this.anIntArray436[local20.anInt8247]);
			}
		}
		if (this.aClass123Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass123Array4.length; local13++) {
			@Pc(365) Class123 local365 = this.aClass123Array4[local13];
			@Pc(367) Class123 local367 = local365;
			if (local365.aClass123_2 != null) {
				local367 = local365.aClass123_2;
			}
			if (local365.aClass76_6 == null) {
				local365.aClass76_6 = local8.method9643();
			} else {
				local365.aClass76_6.method9629(local8);
			}
			local367.anInt3874 = (int) ((float) this.anIntArray436[local365.anInt3872] * local8.aFloat99 + (float) this.anIntArray438[local365.anInt3872] * local8.aFloat96 + (float) this.anIntArray434[local365.anInt3872] * local8.aFloat98 + local8.aFloat94);
			local367.anInt3870 = (int) (local8.aFloat104 + local8.aFloat97 * (float) this.anIntArray438[local365.anInt3872] + (float) this.anIntArray434[local365.anInt3872] * local8.aFloat101 + (float) this.anIntArray436[local365.anInt3872] * local8.aFloat100);
			local367.anInt3869 = (int) (local8.aFloat93 + (float) this.anIntArray438[local365.anInt3872] * local8.aFloat95 + (float) this.anIntArray434[local365.anInt3872] * local8.aFloat103 + local8.aFloat102 * (float) this.anIntArray436[local365.anInt3872]);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8534; local7++) {
			local16 = this.aShortArray114[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray114[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass285Array1 != null) {
			for (local16 = 0; local16 < this.anInt8527; local16++) {
				@Pc(110) Class285 local110 = this.aClass285Array1[local16];
				@Pc(115) Class303 local115 = this.aClass303Array1[local16];
				local115.anInt8816 = Static101.anIntArray92[this.aShortArray114[local110.anInt8317] & 0xFFFF] & 0xFFFFFF | local115.anInt8816 & 0xFF000000;
			}
		}
		if (this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!dm;IBIII)Z")
	private boolean method7609(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class76_Sub1 local8 = (Class76_Sub1) arg1;
		@Pc(12) Class76_Sub1 local12 = this.aClass101_Sub2_29.aClass76_Sub1_3;
		@Pc(33) float local33 = local12.aFloat99 * local8.aFloat93 + local8.aFloat94 * local12.aFloat98 + local8.aFloat104 * local12.aFloat96 + local12.aFloat94;
		@Pc(54) float local54 = local12.aFloat104 + local8.aFloat93 * local12.aFloat100 + local12.aFloat97 * local8.aFloat104 + local12.aFloat101 * local8.aFloat94;
		Static22.aFloat2 = local8.aFloat103 * local12.aFloat102 + local8.aFloat98 * local12.aFloat103 + local8.aFloat101 * local12.aFloat95;
		@Pc(93) float local93 = local8.aFloat104 * local12.aFloat95 + local12.aFloat103 * local8.aFloat94 + local8.aFloat93 * local12.aFloat102 + local12.aFloat93;
		Static616.aFloat203 = local12.aFloat100 * local8.aFloat102 + local12.aFloat97 * local8.aFloat100 + local12.aFloat101 * local8.aFloat99;
		Static40.aFloat4 = local8.aFloat99 * local12.aFloat98 + local12.aFloat96 * local8.aFloat100 + local8.aFloat102 * local12.aFloat99;
		Static114.aFloat31 = local8.aFloat95 * local12.aFloat102 + local12.aFloat103 * local8.aFloat96 + local12.aFloat95 * local8.aFloat97;
		Static181.aFloat80 = local8.aFloat103 * local12.aFloat99 + local12.aFloat96 * local8.aFloat101 + local8.aFloat98 * local12.aFloat98;
		Static385.aFloat161 = local8.aFloat95 * local12.aFloat99 + local8.aFloat96 * local12.aFloat98 + local12.aFloat96 * local8.aFloat97;
		Static256.aFloat191 = local8.aFloat97 * local12.aFloat97 + local8.aFloat96 * local12.aFloat101 + local12.aFloat100 * local8.aFloat95;
		Static528.aFloat180 = local12.aFloat100 * local8.aFloat103 + local8.aFloat98 * local12.aFloat101 + local8.aFloat101 * local12.aFloat97;
		Static619.aFloat199 = local12.aFloat102 * local8.aFloat102 + local12.aFloat95 * local8.aFloat100 + local12.aFloat103 * local8.aFloat99;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass101_Sub2_29.anInt6347;
		@Pc(255) int local255 = this.aClass101_Sub2_29.anInt6336;
		if (!this.aBoolean623) {
			this.method7600();
		}
		@Pc(270) int local270 = this.aShort84 - this.aShort90 >> 1;
		@Pc(279) int local279 = this.aShort87 - this.aShort88 >> 1;
		@Pc(288) int local288 = this.aShort93 - this.aShort89 >> 1;
		@Pc(294) int local294 = this.aShort90 + local270;
		@Pc(300) int local300 = this.aShort88 + local279;
		@Pc(305) int local305 = local288 + this.aShort89;
		@Pc(312) int local312 = local294 - (local270 << arg4);
		@Pc(319) int local319 = local300 - (local279 << arg4);
		@Pc(326) int local326 = local305 - (local288 << arg4);
		@Pc(340) int local340 = (local270 << arg4) + local294;
		@Pc(346) int local346 = (local279 << arg4) + local300;
		Static582.anIntArray515[0] = local312;
		@Pc(356) int local356 = local305 + (local288 << arg4);
		Static86.anIntArray81[0] = local319;
		Static598.anIntArray542[0] = local326;
		Static582.anIntArray515[1] = local340;
		Static86.anIntArray81[1] = local319;
		Static598.anIntArray542[1] = local326;
		Static582.anIntArray515[2] = local312;
		Static86.anIntArray81[2] = local346;
		Static582.anIntArray515[3] = local340;
		Static598.anIntArray542[2] = local326;
		Static86.anIntArray81[3] = local346;
		Static598.anIntArray542[3] = local326;
		Static582.anIntArray515[4] = local312;
		Static86.anIntArray81[4] = local319;
		Static598.anIntArray542[4] = local356;
		Static582.anIntArray515[5] = local340;
		Static86.anIntArray81[5] = local319;
		Static598.anIntArray542[5] = local356;
		Static582.anIntArray515[6] = local312;
		Static86.anIntArray81[6] = local346;
		Static582.anIntArray515[7] = local340;
		Static598.anIntArray542[6] = local356;
		Static86.anIntArray81[7] = local346;
		Static598.anIntArray542[7] = local356;
		@Pc(509) float local509;
		@Pc(481) float local481;
		@Pc(495) float local495;
		@Pc(457) float local457;
		@Pc(467) float local467;
		@Pc(462) float local462;
		for (@Pc(450) int local450 = 0; local450 < 8; local450++) {
			local457 = (float) Static582.anIntArray515[local450];
			local462 = (float) Static598.anIntArray542[local450];
			local467 = (float) Static86.anIntArray81[local450];
			local481 = Static528.aFloat180 * local457 + Static256.aFloat191 * local467 + local462 * Static616.aFloat203 + local54;
			local495 = local462 * Static619.aFloat199 + local467 * Static114.aFloat31 + local457 * Static22.aFloat2 + local93;
			local509 = Static40.aFloat4 * local462 + local467 * Static385.aFloat161 + Static181.aFloat80 * local457 + local33;
			if ((float) this.aClass101_Sub2_29.anInt6338 <= local495) {
				if (arg2 > 0) {
					local495 = (float) arg2;
				}
				@Pc(533) float local533 = (float) local251 * local509 / local495 + (float) this.aClass101_Sub2_29.anInt6340;
				if (local533 > local243) {
					local243 = local533;
				}
				@Pc(551) float local551 = (float) local255 * local481 / local495 + (float) this.aClass101_Sub2_29.anInt6326;
				if (local241 > local533) {
					local241 = local533;
				}
				if (local551 < local245) {
					local245 = local551;
				}
				if (local551 > local247) {
					local247 = local551;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg3 > local241 && local243 > (float) arg3 && local245 < (float) arg5 && (float) arg5 < local247) {
			if (arg0) {
				return true;
			}
			if (this.anInt8583 > this.aClass101_Sub2_29.anIntArray304.length) {
				this.aClass101_Sub2_29.anIntArray305 = new int[this.anInt8583];
				this.aClass101_Sub2_29.anIntArray304 = new int[this.anInt8583];
			}
			@Pc(630) int[] local630 = this.aClass101_Sub2_29.anIntArray304;
			@Pc(634) int[] local634 = this.aClass101_Sub2_29.anIntArray305;
			@Pc(710) int local710;
			for (@Pc(636) int local636 = 0; local636 < this.anInt8538; local636++) {
				local467 = (float) this.anIntArray438[local636];
				local462 = (float) this.anIntArray436[local636];
				local457 = (float) this.anIntArray434[local636];
				local509 = local33 + Static40.aFloat4 * local462 + local467 * Static385.aFloat161 + local457 * Static181.aFloat80;
				local495 = local93 + Static22.aFloat2 * local457 + local467 * Static114.aFloat31 + local462 * Static619.aFloat199;
				local481 = local54 + Static616.aFloat203 * local462 + Static256.aFloat191 * local467 + local457 * Static528.aFloat180;
				@Pc(717) int local717;
				@Pc(719) int local719;
				@Pc(728) int local728;
				if ((float) this.aClass101_Sub2_29.anInt6338 <= local495) {
					if (arg2 > 0) {
						local495 = (float) arg2;
					}
					local710 = (int) (local509 * (float) local251 / local495 + (float) this.aClass101_Sub2_29.anInt6340);
					local717 = (int) ((float) local255 * local481 / local495 + (float) this.aClass101_Sub2_29.anInt6326);
					local719 = this.anIntArray435[local636];
					local728 = this.anIntArray435[local636 + 1];
					for (@Pc(795) int local795 = local719; local795 < local728; local795++) {
						@Pc(804) int local804 = this.aShortArray108[local795] - 1;
						if (local804 == -1) {
							break;
						}
						local630[local804] = local710;
						local634[local804] = local717;
					}
				} else {
					local710 = this.anIntArray435[local636];
					local717 = this.anIntArray435[local636 + 1];
					for (local719 = local710; local719 < local717; local719++) {
						local728 = this.aShortArray108[local719] - 1;
						if (local728 == -1) {
							break;
						}
						local630[this.aShortArray108[local719] - 1] = -999999;
					}
				}
			}
			for (local710 = 0; local710 < this.anInt8534; local710++) {
				if (local630[this.aShortArray109[local710]] != -999999 && local630[this.aShortArray111[local710]] != -999999 && local630[this.aShortArray105[local710]] != -999999 && this.method7611(local630[this.aShortArray109[local710]], local630[this.aShortArray111[local710]], arg3, arg5, local630[this.aShortArray105[local710]], local634[this.aShortArray109[local710]], local634[this.aShortArray111[local710]], local634[this.aShortArray105[local710]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
	private void method7610(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass274_16 != null && this.aClass274_16.anInterface2_6 == null;
		@Pc(27) boolean local27 = this.aClass274_13 != null && this.aClass274_13.anInterface2_6 == null;
		@Pc(38) boolean local38 = this.aClass274_15 != null && this.aClass274_15.anInterface2_6 == null;
		@Pc(49) boolean local49 = this.aClass274_14 != null && this.aClass274_14.anInterface2_6 == null;
		if (arg0) {
			local49 &= (this.aByte113 & 0x8) != 0;
			local16 &= (this.aByte113 & 0x2) != 0;
			local38 &= (this.aByte113 & 0x1) != 0;
			local27 &= (this.aByte113 & 0x4) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (local38) {
			local106 = 12;
		}
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local118 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local120 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2.lb.length >= local106 * this.anInt8583) {
			this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2.anInt5725 = 0;
		} else {
			this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1(local106 * (this.anInt8583 + 100));
		}
		@Pc(196) Class2_Sub8_Sub1 local196 = this.aClass101_Sub2_29.aClass2_Sub8_Sub1_2;
		@Pc(204) int local204;
		@Pc(213) int local213;
		@Pc(241) int local241;
		@Pc(250) int local250;
		if (local38) {
			@Pc(220) int local220;
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(239) int local239;
			if (this.aClass101_Sub2_29.aBoolean470) {
				for (local204 = 0; local204 < this.anInt8538; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray434[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray438[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray436[local204]);
					local232 = this.anIntArray435[local204];
					local239 = this.anIntArray435[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray108[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt5725 = local106 * local250;
						local196.method5194(local213);
						local196.method5194(local220);
						local196.method5194(local227);
					}
				}
			} else {
				for (local204 = 0; local204 < this.anInt8538; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray434[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray438[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray436[local204]);
					local232 = this.anIntArray435[local204];
					local239 = this.anIntArray435[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray108[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt5725 = local250 * local106;
						local196.method5185(local213);
						local196.method5185(local220);
						local196.method5185(local227);
					}
				}
			}
		}
		@Pc(499) float local499;
		@Pc(386) short[] local386;
		@Pc(382) short[] local382;
		@Pc(378) short[] local378;
		@Pc(390) byte[] local390;
		@Pc(537) float local537;
		if (local16) {
			if (this.aClass274_13 == null) {
				if (this.aClass23_1 == null) {
					local386 = this.aShortArray112;
					local390 = this.aByteArray75;
					local378 = this.aShortArray113;
					local382 = this.lb;
				} else {
					local378 = this.aClass23_1.aShortArray16;
					local382 = this.aClass23_1.aShortArray17;
					local386 = this.aClass23_1.aShortArray15;
					local390 = this.aClass23_1.aByteArray10;
				}
				@Pc(410) float local410 = this.aClass101_Sub2_29.aFloatArray38[0];
				@Pc(416) float local416 = this.aClass101_Sub2_29.aFloatArray38[1];
				@Pc(422) float local422 = this.aClass101_Sub2_29.aFloatArray38[2];
				@Pc(426) float local426 = this.aClass101_Sub2_29.aFloat133;
				@Pc(436) float local436 = this.aClass101_Sub2_29.aFloat122 * 768.0F / (float) this.aShort91;
				@Pc(446) float local446 = this.aClass101_Sub2_29.aFloat137 * 768.0F / (float) this.aShort91;
				for (@Pc(448) int local448 = 0; local448 < this.anInt8534; local448++) {
					@Pc(468) int local468 = this.method7599(this.aShortArray114[local448], this.aShort92, this.aByteArray76[local448], this.aShortArray106[local448]);
					@Pc(477) float local477 = (float) (local468 >>> 24) * this.aClass101_Sub2_29.aFloat141;
					@Pc(488) float local488 = this.aClass101_Sub2_29.aFloat125 * (float) (local468 >> 8 & 0xFF);
					local499 = (float) (local468 >> 16 & 0xFF) * this.aClass101_Sub2_29.aFloat127;
					@Pc(504) short local504 = this.aShortArray109[local448];
					@Pc(509) short local509 = (short) local390[local504];
					if (local509 == 0) {
						local537 = (local422 * (float) local378[local504] + local416 * (float) local382[local504] + (float) local386[local504] * local410) * 0.0026041667F;
					} else {
						local537 = ((float) local386[local504] * local410 + local416 * (float) local382[local504] + (float) local378[local504] * local422) / (float) (local509 * 256);
					}
					@Pc(577) float local577 = (local537 < 0.0F ? local446 : local436) * local537 + local426;
					@Pc(582) int local582 = (int) (local577 * local477);
					@Pc(587) int local587 = (int) (local499 * local577);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					@Pc(617) int local617 = (int) (local488 * local577);
					local196.anInt5725 = local110 + local504 * local106;
					if (local617 < 0) {
						local617 = 0;
					} else if (local617 > 255) {
						local617 = 255;
					}
					local196.method5170(local582);
					local196.method5170(local587);
					local196.method5170(local617);
					local196.method5170(255 - (this.aByteArray76[local448] & 0xFF));
					local504 = this.aShortArray111[local448];
					local509 = (short) local390[local504];
					if (local509 == 0) {
						local537 = ((float) local382[local504] * local416 + local410 * (float) local386[local504] + local422 * (float) local378[local504]) * 0.0026041667F;
					} else {
						local537 = (local416 * (float) local382[local504] + (float) local386[local504] * local410 + local422 * (float) local378[local504]) / (float) (local509 * 256);
					}
					local577 = local426 + (local537 < 0.0F ? local446 : local436) * local537;
					local582 = (int) (local577 * local477);
					local587 = (int) (local577 * local499);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local617 = (int) (local488 * local577);
					if (local617 < 0) {
						local617 = 0;
					} else if (local617 > 255) {
						local617 = 255;
					}
					local196.anInt5725 = local504 * local106 + local110;
					local196.method5170(local582);
					local196.method5170(local587);
					local196.method5170(local617);
					local196.method5170(255 - (this.aByteArray76[local448] & 0xFF));
					local504 = this.aShortArray105[local448];
					local509 = (short) local390[local504];
					if (local509 == 0) {
						local537 = (local422 * (float) local378[local504] + (float) local386[local504] * local410 + local416 * (float) local382[local504]) * 0.0026041667F;
					} else {
						local537 = ((float) local386[local504] * local410 + local416 * (float) local382[local504] + local422 * (float) local378[local504]) / (float) (local509 * 256);
					}
					local577 = local426 + (local537 < 0.0F ? local446 : local436) * local537;
					local582 = (int) (local577 * local477);
					local587 = (int) (local499 * local577);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local617 = (int) (local577 * local488);
					if (local617 < 0) {
						local617 = 0;
					} else if (local617 > 255) {
						local617 = 255;
					}
					local196.anInt5725 = local504 * local106 + local110;
					local196.method5170(local582);
					local196.method5170(local587);
					local196.method5170(local617);
					local196.method5170(255 - (this.aByteArray76[local448] & 0xFF));
				}
			} else {
				for (local204 = 0; local204 < this.anInt8534; local204++) {
					local213 = this.method7599(this.aShortArray114[local204], this.aShort92, this.aByteArray76[local204], this.aShortArray106[local204]);
					local196.anInt5725 = local110 + this.aShortArray109[local204] * local106;
					local196.method5194(local213);
					local196.anInt5725 = this.aShortArray111[local204] * local106 + local110;
					local196.method5194(local213);
					local196.anInt5725 = local110 + local106 * this.aShortArray105[local204];
					local196.method5194(local213);
				}
			}
		}
		if (local27) {
			if (this.aClass23_1 == null) {
				local390 = this.aByteArray75;
				local378 = this.aShortArray113;
				local386 = this.aShortArray112;
				local382 = this.lb;
			} else {
				local378 = this.aClass23_1.aShortArray16;
				local390 = this.aClass23_1.aByteArray10;
				local382 = this.aClass23_1.aShortArray17;
				local386 = this.aClass23_1.aShortArray15;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort91;
			local537 = 3.0F / (float) (this.aShort91 + this.aShort91 / 2);
			local196.anInt5725 = local118;
			if (this.aClass101_Sub2_29.aBoolean470) {
				for (local241 = 0; local241 < this.anInt8583; local241++) {
					local250 = local390[local241] & 0xFF;
					if (local250 == 0) {
						local196.method789(local537 * (float) local386[local241]);
						local196.method789((float) local382[local241] * local537);
						local196.method789((float) local378[local241] * local537);
					} else {
						local499 = local1115 / (float) local250;
						local196.method789((float) local386[local241] * local499);
						local196.method789(local499 * (float) local382[local241]);
						local196.method789(local499 * (float) local378[local241]);
					}
					local196.anInt5725 += local106 - 12;
				}
			} else {
				for (local241 = 0; local241 < this.anInt8583; local241++) {
					local250 = local390[local241] & 0xFF;
					if (local250 == 0) {
						local196.method788((float) local386[local241] * local537);
						local196.method788(local537 * (float) local382[local241]);
						local196.method788(local537 * (float) local378[local241]);
					} else {
						local499 = local1115 / (float) local250;
						local196.method788(local499 * (float) local386[local241]);
						local196.method788(local499 * (float) local382[local241]);
						local196.method788(local499 * (float) local378[local241]);
					}
					local196.anInt5725 += local106 - 12;
				}
			}
		}
		if (local49) {
			local196.anInt5725 = local120;
			if (this.aClass101_Sub2_29.aBoolean470) {
				for (local204 = 0; local204 < this.anInt8583; local204++) {
					local196.method789(this.aFloatArray56[local204]);
					local196.method789(this.aFloatArray55[local204]);
					local196.anInt5725 += local106 - 8;
				}
			} else {
				for (local204 = 0; local204 < this.anInt8583; local204++) {
					local196.method788(this.aFloatArray56[local204]);
					local196.method788(this.aFloatArray55[local204]);
					local196.anInt5725 += local106 - 8;
				}
			}
		}
		local196.anInt5725 = local106 * this.anInt8583;
		@Pc(1408) Interface2 local1408;
		if (arg0) {
			if (this.anInterface2_7 == null) {
				this.anInterface2_7 = this.aClass101_Sub2_29.method5642(local196.lb, local106, local196.anInt5725, true);
			} else {
				this.anInterface2_7.method6366(local196.lb, local196.anInt5725, local106);
			}
			local1408 = this.anInterface2_7;
			this.aByte113 = 0;
		} else {
			local1408 = this.aClass101_Sub2_29.method5642(local196.lb, local106, local196.anInt5725, false);
			this.aBoolean624 = true;
		}
		if (local38) {
			this.aClass274_15.aByte108 = 0;
			this.aClass274_15.anInterface2_6 = local1408;
		}
		if (local49) {
			this.aClass274_14.aByte108 = local120;
			this.aClass274_14.anInterface2_6 = local1408;
		}
		if (local16) {
			this.aClass274_16.anInterface2_6 = local1408;
			this.aClass274_16.aByte108 = local110;
		}
		if (local27) {
			this.aClass274_13.anInterface2_6 = local1408;
			this.aClass274_13.aByte108 = local118;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()[Lclient!pi;")
	@Override
	public Class283[] method8630() {
		return this.aClass283Array4;
	}

	@OriginalMember(owner = "client!qb", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean623) {
			this.method7600();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt8540 = arg0;
		if (this.aClass23_1 != null && (this.anInt8540 & 0x10000) == 0) {
			this.aByteArray75 = this.aClass23_1.aByteArray10;
			this.lb = this.aClass23_1.aShortArray17;
			this.aShortArray112 = this.aClass23_1.aShortArray15;
			this.aShortArray113 = this.aClass23_1.aShortArray16;
			this.aClass23_1 = null;
		}
		this.aBoolean624 = true;
		this.method7596();
	}

	@OriginalMember(owner = "client!qb", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass101_Sub2_29.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8534; local11++) {
			if (arg0 == this.aShortArray106[local11]) {
				this.aShortArray106[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class136 local48 = local9.method1941(arg0 & 0xFFFF);
			local35 = local48.aByte67;
			local37 = local48.aByte66;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class136 local69 = local9.method1941(arg1 & 0xFFFF);
			if (local69.aByte61 != 0 || local69.aByte65 != 0) {
				this.aBoolean625 = true;
			}
			local56 = local69.aByte67;
			local58 = local69.aByte66;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass285Array1 != null) {
			for (@Pc(110) int local110 = 0; local110 < this.anInt8527; local110++) {
				@Pc(117) Class285 local117 = this.aClass285Array1[local110];
				@Pc(122) Class303 local122 = this.aClass303Array1[local110];
				local122.anInt8816 = local122.anInt8816 & 0xFF000000 | Static101.anIntArray92[this.aShortArray114[local117.anInt8317] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass274_16 != null) {
			this.aClass274_16.anInterface2_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method7611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg5 && arg3 < arg6 && arg3 < arg7) {
			return false;
		} else if (arg5 < arg3 && arg6 < arg3 && arg7 < arg3) {
			return false;
		} else if (arg2 < arg0 && arg1 > arg2 && arg2 < arg4) {
			return false;
		} else {
			return arg0 >= arg2 || arg2 <= arg1 || arg2 <= arg4;
		}
	}
}
