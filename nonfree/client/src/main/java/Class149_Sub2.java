import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class149_Sub2 extends Class149 {

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sca", name = "r", descriptor = "[Lclient!uh;")
	private Class354[] aClass354Array1;

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!sca", name = "u", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!sca", name = "w", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!sca", name = "y", descriptor = "[Lclient!rea;")
	private Class305[] aClass305Array4;

	@OriginalMember(owner = "client!sca", name = "z", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!sca", name = "A", descriptor = "Lclient!vv;")
	private Interface27 anInterface27_4;

	@OriginalMember(owner = "client!sca", name = "E", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!sca", name = "F", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!sca", name = "G", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!sca", name = "I", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!sca", name = "J", descriptor = "B")
	private byte aByte122;

	@OriginalMember(owner = "client!sca", name = "M", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!sca", name = "N", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!sca", name = "R", descriptor = "I")
	private int anInt8421;

	@OriginalMember(owner = "client!sca", name = "ib", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!sca", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!sca", name = "vb", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!sca", name = "xb", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!sca", name = "yb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!sca", name = "zb", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!sca", name = "Bb", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!sca", name = "Db", descriptor = "[Lclient!vja;")
	private Class373[] aClass373Array4;

	@OriginalMember(owner = "client!sca", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sca", name = "Fb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!sca", name = "Lb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!sca", name = "Nb", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!sca", name = "Qb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!sca", name = "Rb", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!sca", name = "Sb", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!sca", name = "Tb", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!sca", name = "Vb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!sca", name = "Zb", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!sca", name = "bc", descriptor = "Lclient!ot;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!sca", name = "gc", descriptor = "Lclient!jia;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!sca", name = "rc", descriptor = "I")
	private int anInt8469;

	@OriginalMember(owner = "client!sca", name = "sc", descriptor = "I")
	private int anInt8470;

	@OriginalMember(owner = "client!sca", name = "vc", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!sca", name = "Bc", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!sca", name = "Cc", descriptor = "[Lclient!en;")
	private Class107[] aClass107Array1;

	@OriginalMember(owner = "client!sca", name = "Ec", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!sca", name = "ob", descriptor = "Z")
	private boolean aBoolean584 = true;

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
	private int anInt8410 = 0;

	@OriginalMember(owner = "client!sca", name = "sb", descriptor = "I")
	private int anInt8444 = 0;

	@OriginalMember(owner = "client!sca", name = "Jb", descriptor = "Z")
	private boolean aBoolean585 = false;

	@OriginalMember(owner = "client!sca", name = "ac", descriptor = "I")
	private int anInt8456 = 0;

	@OriginalMember(owner = "client!sca", name = "Wb", descriptor = "I")
	private int anInt8453 = 0;

	@OriginalMember(owner = "client!sca", name = "Y", descriptor = "Z")
	private boolean aBoolean583 = false;

	@OriginalMember(owner = "client!sca", name = "ic", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!sca", name = "oc", descriptor = "I")
	private int anInt8466 = 0;

	@OriginalMember(owner = "client!sca", name = "Dc", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_36;

	@OriginalMember(owner = "client!sca", name = "jc", descriptor = "Lclient!ut;")
	private Class364 aClass364_13;

	@OriginalMember(owner = "client!sca", name = "Ob", descriptor = "Lclient!ut;")
	private Class364 aClass364_12;

	@OriginalMember(owner = "client!sca", name = "tb", descriptor = "Lclient!ut;")
	private Class364 aClass364_10;

	@OriginalMember(owner = "client!sca", name = "Mb", descriptor = "Lclient!ut;")
	private Class364 aClass364_11;

	@OriginalMember(owner = "client!sca", name = "Ub", descriptor = "Lclient!mt;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class149_Sub2(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_36 = arg0;
		this.aClass364_13 = new Class364((Interface21) null, 5126, 3, 0);
		this.aClass364_12 = new Class364((Interface21) null, 5126, 2, 0);
		this.aClass364_10 = new Class364((Interface21) null, 5126, 3, 0);
		this.aClass364_11 = new Class364((Interface21) null, 5121, 4, 0);
		this.aClass238_1 = new Class238();
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!lf;Lclient!gl;IIII)V")
	public Class149_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8470 = arg5;
		this.aClass95_Sub3_36 = arg0;
		this.anInt8421 = arg2;
		if (Static614.method8321(arg2, arg5)) {
			this.aClass364_13 = new Class364((Interface21) null, 5126, 3, 0);
		}
		if (Static435.method5966(arg5, arg2)) {
			this.aClass364_12 = new Class364((Interface21) null, 5126, 2, 0);
		}
		if (Static96.method1615(arg5, arg2)) {
			this.aClass364_10 = new Class364((Interface21) null, 5126, 3, 0);
		}
		if (Static408.method5610(arg5, arg2)) {
			this.aClass364_11 = new Class364((Interface21) null, 5121, 4, 0);
		}
		if (Static488.method6444(arg2, arg5)) {
			this.aClass238_1 = new Class238();
		}
		@Pc(108) Interface2 local108 = arg0.anInterface2_12;
		@Pc(112) int[] local112 = new int[arg1.anInt3576];
		this.anIntArray461 = new int[arg1.anInt3583 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt3576; local121++) {
			if (arg1.aByteArray26 == null || arg1.aByteArray26[local121] != 2) {
				if (arg1.aShortArray43 != null && arg1.aShortArray43[local121] != -1) {
					@Pc(153) Class250 local153 = local108.method8330(arg1.aShortArray43[local121] & 0xFFFF);
					if (((this.anInt8470 & 0x40) == 0 || !local153.aBoolean466) && local153.aBoolean465) {
						continue;
					}
				}
				local112[this.anInt8466++] = local121;
				this.anIntArray461[arg1.aShortArray42[local121]]++;
				this.anIntArray461[arg1.aShortArray35[local121]]++;
				this.anIntArray461[arg1.aShortArray37[local121]]++;
			}
		}
		this.anInt8444 = this.anInt8466;
		@Pc(229) long[] local229 = new long[this.anInt8466];
		@Pc(241) boolean local241 = (this.anInt8421 & 0x100) != 0;
		@Pc(253) int local253;
		@Pc(266) int local266;
		@Pc(443) int local443;
		for (@Pc(243) int local243 = 0; local243 < this.anInt8466; local243++) {
			@Pc(249) int local249 = local112[local243];
			@Pc(251) Class250 local251 = null;
			local253 = 0;
			@Pc(255) byte local255 = 0;
			@Pc(257) byte local257 = 0;
			@Pc(259) byte local259 = 0;
			if (arg1.aClass145Array1 != null) {
				@Pc(264) boolean local264 = false;
				for (local266 = 0; local266 < arg1.aClass145Array1.length; local266++) {
					@Pc(273) Class145 local273 = arg1.aClass145Array1[local266];
					if (local273.anInt3834 == local249) {
						@Pc(282) Class258 local282 = Static538.method6887(local273.anInt3835);
						if (local282.aBoolean472) {
							local264 = true;
						}
						if (local282.anInt6708 != -1) {
							@Pc(297) Class250 local297 = local108.method8330(local282.anInt6708);
							if (local297.anInt6666 == 2) {
								this.aBoolean583 = true;
							}
						}
					}
				}
				if (local264) {
					local229[local243] = Long.MAX_VALUE;
					this.anInt8444--;
					continue;
				}
			}
			@Pc(328) short local328 = -1;
			if (arg1.aShortArray43 != null) {
				local328 = arg1.aShortArray43[local249];
				if (local328 != -1) {
					local251 = local108.method8330(local328 & 0xFFFF);
					if ((this.anInt8470 & 0x40) != 0 && local251.aBoolean466) {
						local251 = null;
						local328 = -1;
					} else {
						local259 = local251.aByte97;
						if (local251.aByte95 != 0 || local251.aByte92 != 0) {
							this.aBoolean586 = true;
						}
						local257 = local251.aByte93;
					}
				}
			}
			@Pc(405) boolean local405 = arg1.aByteArray29 != null && arg1.aByteArray29[local249] != 0 || local251 != null && local251.anInt6666 != 0;
			if ((local241 || local405) && arg1.aByteArray30 != null) {
				local253 += arg1.aByteArray30[local249] << 17;
			}
			if (local405) {
				local253 += 65536;
			}
			local253 += (local257 & 0xFF) << 8;
			local443 = local255 + ((local328 & 0xFFFF) << 16);
			local253 += local259 & 0xFF;
			@Pc(455) int local455 = local443 + (local243 & 0xFFFF);
			local229[local243] = ((long) local253 << 32) + ((long) local455);
			this.aBoolean583 |= local405;
			this.aBoolean586 |= local251 != null && (local251.aByte95 != 0 || local251.aByte92 != 0);
		}
		Static438.method5985(local229, local112);
		this.anIntArray463 = arg1.anIntArray192;
		this.anIntArray462 = arg1.anIntArray196;
		this.anIntArray464 = arg1.anIntArray197;
		this.anInt8410 = arg1.anInt3583;
		this.anInt8453 = arg1.anInt3575;
		this.aShortArray110 = arg1.aShortArray44;
		this.aClass305Array4 = arg1.aClass305Array1;
		@Pc(536) Class345[] local536 = new Class345[this.anInt8410];
		this.aClass373Array4 = arg1.aClass373Array1;
		@Pc(560) int local560;
		@Pc(574) int local574;
		@Pc(612) int local612;
		if (arg1.aClass145Array1 != null) {
			this.anInt8469 = arg1.aClass145Array1.length;
			this.aClass354Array1 = new Class354[this.anInt8469];
			this.aClass107Array1 = new Class107[this.anInt8469];
			for (local560 = 0; local560 < this.anInt8469; local560++) {
				@Pc(567) Class145 local567 = arg1.aClass145Array1[local560];
				@Pc(572) Class258 local572 = Static538.method6887(local567.anInt3835);
				local574 = -1;
				for (@Pc(576) int local576 = 0; local576 < this.anInt8466; local576++) {
					if (local112[local576] == local567.anInt3834) {
						local574 = local576;
						break;
					}
				}
				if (local574 == -1) {
					throw new RuntimeException();
				}
				local612 = Static537.anIntArray457[arg1.aShortArray38[local567.anInt3834] & 0xFFFF] & 0xFFFFFF;
				@Pc(630) int local630 = local612 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local567.anInt3834]) << 24;
				this.aClass354Array1[local560] = new Class354(local574, arg1.aShortArray42[local567.anInt3834], arg1.aShortArray35[local567.anInt3834], arg1.aShortArray37[local567.anInt3834], local572.anInt6712, local572.anInt6711, local572.anInt6708, local572.anInt6713, local572.anInt6709, local572.aBoolean472, local572.aBoolean473, local567.anInt3833);
				this.aClass107Array1[local560] = new Class107(local630);
			}
		}
		local560 = this.anInt8466 * 3;
		this.aShortArray115 = new short[this.anInt8466];
		this.aShortArray109 = new short[local560];
		this.aShortArray113 = new short[local560];
		Static639.aLongArray21 = new long[local560];
		if (arg1.aShortArray41 != null) {
			this.aShortArray112 = new short[this.anInt8466];
		}
		this.aShortArray116 = new short[local560];
		this.aByteArray71 = new byte[local560];
		this.aShortArray111 = new short[this.anInt8466];
		this.aShortArray114 = new short[this.anInt8466];
		this.aByteArray70 = new byte[this.anInt8466];
		this.aFloatArray44 = new float[local560];
		this.aShort86 = (short) arg4;
		this.aFloatArray45 = new float[local560];
		this.aShortArray107 = new short[local560];
		this.aShortArray108 = new short[this.anInt8466];
		this.aShortArray106 = new short[this.anInt8466];
		this.aShort84 = (short) arg3;
		local253 = 0;
		for (local443 = 0; local443 < arg1.anInt3583; local443++) {
			local574 = this.anIntArray461[local443];
			this.anIntArray461[local443] = local253;
			local253 += local574;
			local536[local443] = new Class345();
		}
		this.anIntArray461[arg1.anInt3583] = local253;
		@Pc(808) Class44 local808 = Static87.method1483(arg1, local112, this.anInt8466);
		@Pc(812) Class69[] local812 = new Class69[arg1.anInt3576];
		@Pc(853) int local853;
		@Pc(863) int local863;
		@Pc(884) int local884;
		@Pc(895) int local895;
		@Pc(904) int local904;
		@Pc(913) int local913;
		@Pc(831) short local831;
		@Pc(842) int local842;
		for (local612 = 0; local612 < arg1.anInt3576; local612++) {
			@Pc(821) short local821 = arg1.aShortArray42[local612];
			@Pc(826) short local826 = arg1.aShortArray35[local612];
			local831 = arg1.aShortArray37[local612];
			local842 = this.anIntArray464[local826] - this.anIntArray464[local821];
			local853 = this.anIntArray463[local826] - this.anIntArray463[local821];
			local863 = this.anIntArray462[local826] - this.anIntArray462[local821];
			@Pc(874) int local874 = this.anIntArray464[local831] - this.anIntArray464[local821];
			local884 = this.anIntArray463[local831] - this.anIntArray463[local821];
			local895 = this.anIntArray462[local831] - this.anIntArray462[local821];
			local904 = local853 * local895 - local884 * local863;
			local913 = local863 * local874 - local842 * local895;
			@Pc(922) int local922;
			for (local922 = local842 * local884 - local874 * local853; local904 > 8192 || local913 > 8192 || local922 > 8192 || local904 < -8192 || local913 < -8192 || local922 < -8192; local922 >>= 0x1) {
				local904 >>= 0x1;
				local913 >>= 0x1;
			}
			@Pc(977) int local977 = (int) Math.sqrt((double) (local922 * local922 + local913 * local913 + local904 * local904));
			if (local977 <= 0) {
				local977 = 1;
			}
			local913 = local913 * 256 / local977;
			local904 = local904 * 256 / local977;
			local922 = local922 * 256 / local977;
			@Pc(1012) byte local1012 = arg1.aByteArray26 == null ? 0 : arg1.aByteArray26[local612];
			if (local1012 == 0) {
				@Pc(1018) Class345 local1018 = local536[local821];
				local1018.anInt9564 += local904;
				local1018.anInt9561 += local922;
				local1018.anInt9565 += local913;
				local1018.anInt9560++;
				@Pc(1046) Class345 local1046 = local536[local826];
				local1046.anInt9560++;
				local1046.anInt9565 += local913;
				local1046.anInt9561 += local922;
				local1046.anInt9564 += local904;
				@Pc(1074) Class345 local1074 = local536[local831];
				local1074.anInt9561 += local922;
				local1074.anInt9565 += local913;
				local1074.anInt9564 += local904;
				local1074.anInt9560++;
			} else if (local1012 == 1) {
				@Pc(1113) Class69 local1113 = local812[local612] = new Class69();
				local1113.anInt1935 = local922;
				local1113.anInt1938 = local904;
				local1113.anInt1934 = local913;
			}
		}
		@Pc(1139) int local1139;
		@Pc(1182) short local1182;
		for (local266 = 0; local266 < this.anInt8466; local266++) {
			local1139 = local112[local266];
			@Pc(1146) int local1146 = arg1.aShortArray38[local1139] & 0xFFFF;
			if (arg1.aByteArray28 == null) {
				local842 = -1;
			} else {
				local842 = arg1.aByteArray28[local1139];
			}
			if (arg1.aByteArray29 == null) {
				local853 = 0;
			} else {
				local853 = arg1.aByteArray29[local1139] & 0xFF;
			}
			local1182 = arg1.aShortArray43 == null ? -1 : arg1.aShortArray43[local1139];
			if (local1182 != -1 && (this.anInt8470 & 0x40) != 0) {
				@Pc(1201) Class250 local1201 = local108.method8330(local1182 & 0xFFFF);
				if (local1201.aBoolean466) {
					local1182 = -1;
				}
			}
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) float local1214 = 0.0F;
			@Pc(1216) float local1216 = 0.0F;
			@Pc(1218) float local1218 = 0.0F;
			@Pc(1220) byte local1220 = 0;
			@Pc(1222) byte local1222 = 0;
			@Pc(1224) int local1224 = 0;
			@Pc(1257) byte local1257;
			@Pc(1277) short local1277;
			@Pc(1282) short local1282;
			@Pc(1287) short local1287;
			if (local1182 != -1) {
				if (local842 == -1) {
					local1222 = 2;
					local1212 = 1.0F;
					local1210 = 1.0F;
					local1208 = 0.0F;
					local1218 = 0.0F;
					local1220 = 1;
					local1216 = 0.0F;
					local1214 = 1.0F;
				} else {
					local842 &= 0xFF;
					local1257 = arg1.aByteArray25[local842];
					@Pc(1267) short local1267;
					@Pc(1272) short local1272;
					@Pc(1310) float local1310;
					@Pc(1319) float local1319;
					@Pc(1328) float local1328;
					@Pc(1410) float local1410;
					@Pc(1419) float local1419;
					@Pc(1428) float local1428;
					@Pc(1437) float local1437;
					@Pc(1445) float local1445;
					@Pc(1454) float local1454;
					if (local1257 == 0) {
						local1267 = arg1.aShortArray42[local1139];
						local1272 = arg1.aShortArray35[local1139];
						local1277 = arg1.aShortArray37[local1139];
						local1282 = arg1.aShortArray36[local842];
						local1287 = arg1.aShortArray40[local842];
						@Pc(1292) short local1292 = arg1.aShortArray39[local842];
						@Pc(1298) float local1298 = (float) arg1.anIntArray197[local1282];
						@Pc(1304) float local1304 = (float) arg1.anIntArray192[local1282];
						local1310 = (float) arg1.anIntArray196[local1282];
						local1319 = (float) arg1.anIntArray197[local1287] - local1298;
						local1328 = (float) arg1.anIntArray192[local1287] - local1304;
						@Pc(1336) float local1336 = (float) arg1.anIntArray196[local1287] - local1310;
						@Pc(1344) float local1344 = (float) arg1.anIntArray197[local1292] - local1298;
						@Pc(1352) float local1352 = (float) arg1.anIntArray192[local1292] - local1304;
						@Pc(1360) float local1360 = (float) arg1.anIntArray196[local1292] - local1310;
						@Pc(1369) float local1369 = (float) arg1.anIntArray197[local1267] - local1298;
						@Pc(1377) float local1377 = (float) arg1.anIntArray192[local1267] - local1304;
						@Pc(1385) float local1385 = (float) arg1.anIntArray196[local1267] - local1310;
						@Pc(1393) float local1393 = (float) arg1.anIntArray197[local1272] - local1298;
						@Pc(1401) float local1401 = (float) arg1.anIntArray192[local1272] - local1304;
						local1410 = (float) arg1.anIntArray196[local1272] - local1310;
						local1419 = (float) arg1.anIntArray197[local1277] - local1298;
						local1428 = (float) arg1.anIntArray192[local1277] - local1304;
						local1437 = (float) arg1.anIntArray196[local1277] - local1310;
						local1445 = local1360 * local1328 - local1336 * local1352;
						local1454 = local1336 * local1344 - local1360 * local1319;
						@Pc(1463) float local1463 = local1352 * local1319 - local1344 * local1328;
						@Pc(1471) float local1471 = local1352 * local1463 - local1360 * local1454;
						@Pc(1480) float local1480 = local1445 * local1360 - local1344 * local1463;
						@Pc(1489) float local1489 = local1454 * local1344 - local1445 * local1352;
						@Pc(1503) float local1503 = 1.0F / (local1489 * local1336 + local1471 * local1319 + local1328 * local1480);
						local1208 = local1503 * (local1385 * local1489 + local1471 * local1369 + local1480 * local1377);
						local1216 = local1503 * (local1437 * local1489 + local1471 * local1419 + local1480 * local1428);
						local1212 = (local1393 * local1471 + local1480 * local1401 + local1489 * local1410) * local1503;
						@Pc(1553) float local1553 = local1319 * local1454 - local1445 * local1328;
						@Pc(1561) float local1561 = local1463 * local1328 - local1336 * local1454;
						@Pc(1570) float local1570 = local1336 * local1445 - local1319 * local1463;
						@Pc(1584) float local1584 = 1.0F / (local1360 * local1553 + local1570 * local1352 + local1344 * local1561);
						local1214 = local1584 * (local1410 * local1553 + local1561 * local1393 + local1570 * local1401);
						local1218 = (local1437 * local1553 + local1561 * local1419 + local1570 * local1428) * local1584;
						local1210 = local1584 * (local1385 * local1553 + local1369 * local1561 + local1377 * local1570);
					} else {
						local1267 = arg1.aShortArray42[local1139];
						local1272 = arg1.aShortArray35[local1139];
						local1277 = arg1.aShortArray37[local1139];
						@Pc(1648) int local1648 = local808.anIntArray64[local842];
						@Pc(1653) int local1653 = local808.anIntArray66[local842];
						@Pc(1658) int local1658 = local808.anIntArray65[local842];
						@Pc(1663) float[] local1663 = local808.aFloatArrayArray5[local842];
						@Pc(1668) byte local1668 = arg1.aByteArray31[local842];
						local1310 = (float) arg1.anIntArray195[local842] / 256.0F;
						if (local1257 == 1) {
							local1319 = (float) arg1.anIntArray189[local842] / 1024.0F;
							Static618.method8344(arg1.anIntArray192[local1267], local1663, arg1.anIntArray197[local1267], local1668, local1310, local1319, Static141.aFloatArray19, local1653, local1658, arg1.anIntArray196[local1267], local1648);
							local1208 = Static141.aFloatArray19[0];
							local1210 = Static141.aFloatArray19[1];
							Static618.method8344(arg1.anIntArray192[local1272], local1663, arg1.anIntArray197[local1272], local1668, local1310, local1319, Static141.aFloatArray19, local1653, local1658, arg1.anIntArray196[local1272], local1648);
							local1212 = Static141.aFloatArray19[0];
							local1214 = Static141.aFloatArray19[1];
							Static618.method8344(arg1.anIntArray192[local1277], local1663, arg1.anIntArray197[local1277], local1668, local1310, local1319, Static141.aFloatArray19, local1653, local1658, arg1.anIntArray196[local1277], local1648);
							local1218 = Static141.aFloatArray19[1];
							local1216 = Static141.aFloatArray19[0];
							local1328 = local1319 / 2.0F;
							if ((local1668 & 0x1) == 0) {
								if (local1216 - local1208 > local1328) {
									local1222 = 1;
									local1216 -= local1319;
								} else if (local1328 < local1208 - local1216) {
									local1222 = 2;
									local1216 += local1319;
								}
								if (local1328 < local1212 - local1208) {
									local1220 = 1;
									local1212 -= local1319;
								} else if (local1328 < local1208 - local1212) {
									local1212 += local1319;
									local1220 = 2;
								}
							} else {
								if (local1328 < local1218 - local1210) {
									local1218 -= local1319;
									local1222 = 1;
								} else if (local1210 - local1218 > local1328) {
									local1218 += local1319;
									local1222 = 2;
								}
								if (local1214 - local1210 > local1328) {
									local1214 -= local1319;
									local1220 = 1;
								} else if (local1210 - local1214 > local1328) {
									local1214 += local1319;
									local1220 = 2;
								}
							}
						} else if (local1257 == 2) {
							local1319 = (float) arg1.anIntArray191[local842] / 256.0F;
							local1328 = (float) arg1.anIntArray199[local842] / 256.0F;
							@Pc(1927) int local1927 = arg1.anIntArray197[local1272] - arg1.anIntArray197[local1267];
							@Pc(1937) int local1937 = arg1.anIntArray192[local1272] - arg1.anIntArray192[local1267];
							@Pc(1948) int local1948 = arg1.anIntArray196[local1272] - arg1.anIntArray196[local1267];
							@Pc(1959) int local1959 = arg1.anIntArray197[local1277] - arg1.anIntArray197[local1267];
							@Pc(1970) int local1970 = arg1.anIntArray192[local1277] - arg1.anIntArray192[local1267];
							@Pc(1981) int local1981 = arg1.anIntArray196[local1277] - arg1.anIntArray196[local1267];
							@Pc(1990) int local1990 = local1937 * local1981 - local1970 * local1948;
							@Pc(1999) int local1999 = local1959 * local1948 - local1927 * local1981;
							@Pc(2008) int local2008 = local1970 * local1927 - local1937 * local1959;
							local1410 = 64.0F / (float) arg1.anIntArray190[local842];
							local1419 = 64.0F / (float) arg1.anIntArray193[local842];
							local1428 = 64.0F / (float) arg1.anIntArray189[local842];
							local1437 = (local1663[1] * (float) local1999 + (float) local1990 * local1663[0] + (float) local2008 * local1663[2]) / local1410;
							local1445 = (local1663[3] * (float) local1990 + (float) local1999 * local1663[4] + local1663[5] * (float) local2008) / local1419;
							local1454 = (local1663[6] * (float) local1990 + local1663[7] * (float) local1999 + (float) local2008 * local1663[8]) / local1428;
							local1224 = Static475.method6320(local1454, local1445, local1437);
							Static106.method1694(local1653, arg1.anIntArray197[local1267], local1648, local1224, arg1.anIntArray192[local1267], local1328, local1663, local1668, arg1.anIntArray196[local1267], local1319, local1310, local1658, Static141.aFloatArray19);
							local1210 = Static141.aFloatArray19[1];
							local1208 = Static141.aFloatArray19[0];
							Static106.method1694(local1653, arg1.anIntArray197[local1272], local1648, local1224, arg1.anIntArray192[local1272], local1328, local1663, local1668, arg1.anIntArray196[local1272], local1319, local1310, local1658, Static141.aFloatArray19);
							local1214 = Static141.aFloatArray19[1];
							local1212 = Static141.aFloatArray19[0];
							Static106.method1694(local1653, arg1.anIntArray197[local1277], local1648, local1224, arg1.anIntArray192[local1277], local1328, local1663, local1668, arg1.anIntArray196[local1277], local1319, local1310, local1658, Static141.aFloatArray19);
							local1218 = Static141.aFloatArray19[1];
							local1216 = Static141.aFloatArray19[0];
						} else if (local1257 == 3) {
							Static5.method86(arg1.anIntArray192[local1267], local1310, local1658, arg1.anIntArray196[local1267], Static141.aFloatArray19, local1653, local1648, local1663, local1668, arg1.anIntArray197[local1267]);
							local1208 = Static141.aFloatArray19[0];
							local1210 = Static141.aFloatArray19[1];
							Static5.method86(arg1.anIntArray192[local1272], local1310, local1658, arg1.anIntArray196[local1272], Static141.aFloatArray19, local1653, local1648, local1663, local1668, arg1.anIntArray197[local1272]);
							local1212 = Static141.aFloatArray19[0];
							local1214 = Static141.aFloatArray19[1];
							Static5.method86(arg1.anIntArray192[local1277], local1310, local1658, arg1.anIntArray196[local1277], Static141.aFloatArray19, local1653, local1648, local1663, local1668, arg1.anIntArray197[local1277]);
							local1216 = Static141.aFloatArray19[0];
							local1218 = Static141.aFloatArray19[1];
							if ((local1668 & 0x1) == 0) {
								if (local1216 - local1208 > 0.5F) {
									local1216--;
									local1222 = 1;
								} else if (local1208 - local1216 > 0.5F) {
									local1222 = 2;
									local1216++;
								}
								if (local1212 - local1208 > 0.5F) {
									local1220 = 1;
									local1212--;
								} else if (local1208 - local1212 > 0.5F) {
									local1220 = 2;
									local1212++;
								}
							} else {
								if (local1218 - local1210 > 0.5F) {
									local1222 = 1;
									local1218--;
								} else if (local1210 - local1218 > 0.5F) {
									local1218++;
									local1222 = 2;
								}
								if (local1214 - local1210 > 0.5F) {
									local1214--;
									local1220 = 1;
								} else if (local1210 - local1214 > 0.5F) {
									local1220 = 2;
									local1214++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray26 == null) {
				local1257 = 0;
			} else {
				local1257 = arg1.aByteArray26[local1139];
			}
			if (local1257 == 0) {
				@Pc(2576) long local2576 = (long) (local842 << 2) + ((long) (local1146 << 8) + (long) (local1224 << 24) + (long) local853 << 32);
				local1277 = arg1.aShortArray42[local1139];
				local1282 = arg1.aShortArray35[local1139];
				local1287 = arg1.aShortArray37[local1139];
				@Pc(2595) Class345 local2595 = local536[local1277];
				this.aShortArray115[local266] = this.method6948(local2595.anInt9564, arg1, local2595.anInt9565, local2576, local1277, local2595.anInt9561, local1210, local1208, local2595.anInt9560);
				@Pc(2619) Class345 local2619 = local536[local1282];
				this.aShortArray108[local266] = this.method6948(local2619.anInt9564, arg1, local2619.anInt9565, local2576 + (long) local1220, local1282, local2619.anInt9561, local1214, local1212, local2619.anInt9560);
				@Pc(2646) Class345 local2646 = local536[local1287];
				this.aShortArray111[local266] = this.method6948(local2646.anInt9564, arg1, local2646.anInt9565, local2576 + (long) local1222, local1287, local2646.anInt9561, local1218, local1216, local2646.anInt9560);
			} else if (local1257 == 1) {
				@Pc(2438) Class69 local2438 = local812[local1139];
				@Pc(2480) long local2480 = (long) ((local2438.anInt1938 <= 0 ? 2048 : 1024) + ((local842 << 2) + (local2438.anInt1934 + 256 << 12)) + (local2438.anInt1935 + 256 << 22)) + ((long) local853 + (long) (local1146 << 8) + (long) (local1224 << 24) << 32);
				this.aShortArray115[local266] = this.method6948(local2438.anInt1938, arg1, local2438.anInt1934, local2480, arg1.aShortArray42[local1139], local2438.anInt1935, local1210, local1208, 0);
				this.aShortArray108[local266] = this.method6948(local2438.anInt1938, arg1, local2438.anInt1934, local2480 + (long) local1220, arg1.aShortArray35[local1139], local2438.anInt1935, local1214, local1212, 0);
				this.aShortArray111[local266] = this.method6948(local2438.anInt1938, arg1, local2438.anInt1934, local2480 + (long) local1222, arg1.aShortArray37[local1139], local2438.anInt1935, local1218, local1216, 0);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray70[local266] = arg1.aByteArray29[local1139];
			}
			if (arg1.aShortArray41 != null) {
				this.aShortArray112[local266] = arg1.aShortArray41[local1139];
			}
			this.aShortArray106[local266] = arg1.aShortArray38[local1139];
			this.aShortArray114[local266] = local1182;
		}
		local1139 = 0;
		local831 = -10000;
		for (local842 = 0; local842 < this.anInt8444; local842++) {
			@Pc(2722) short local2722 = this.aShortArray114[local842];
			if (local2722 != local831) {
				local831 = local2722;
				local1139++;
			}
		}
		this.anIntArray460 = new int[local1139 + 1];
		local1139 = 0;
		local831 = -10000;
		for (local853 = 0; local853 < this.anInt8444; local853++) {
			local1182 = this.aShortArray114[local853];
			if (local1182 != local831) {
				local831 = local1182;
				this.anIntArray460[local1139++] = local853;
			}
		}
		this.anIntArray460[local1139] = this.anInt8444;
		Static639.aLongArray21 = null;
		this.aShortArray113 = Static642.method8649(this.anInt8456, this.aShortArray113);
		this.aShortArray116 = Static642.method8649(this.anInt8456, this.aShortArray116);
		this.aShortArray109 = Static642.method8649(this.anInt8456, this.aShortArray109);
		this.aByteArray71 = Static309.method4448(this.aByteArray71, this.anInt8456);
		this.aFloatArray44 = Static434.method5949(this.anInt8456, this.aFloatArray44);
		this.aFloatArray45 = Static434.method5949(this.anInt8456, this.aFloatArray45);
		if (arg1.anIntArray194 != null && Static349.method5062(arg2, this.anInt8470)) {
			this.anIntArrayArray51 = arg1.method3053(false);
		}
		if (arg1.aClass145Array1 != null && Static277.method4053(this.anInt8470, arg2)) {
			this.anIntArrayArray53 = arg1.method3056();
		}
		if (arg1.anIntArray198 != null && Static210.method3125(arg2, this.anInt8470)) {
			local863 = 0;
			@Pc(2879) int[] local2879 = new int[256];
			for (local884 = 0; local884 < this.anInt8466; local884++) {
				local895 = arg1.anIntArray198[local112[local884]];
				if (local895 >= 0) {
					if (local895 > local863) {
						local863 = local895;
					}
					@Pc(2908) int local2908 = local2879[local895]++;
				}
			}
			this.anIntArrayArray52 = new int[local863 + 1][];
			for (local895 = 0; local895 <= local863; local895++) {
				this.anIntArrayArray52[local895] = new int[local2879[local895]];
				local2879[local895] = 0;
			}
			for (local904 = 0; local904 < this.anInt8466; local904++) {
				local913 = arg1.anIntArray198[local112[local904]];
				if (local913 >= 0) {
					this.anIntArrayArray52[local913][local2879[local913]++] = local904;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)V")
	private void method6945(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass364_11 != null && this.aClass364_11.anInterface21_6 == null;
		@Pc(27) boolean local27 = this.aClass364_10 != null && this.aClass364_10.anInterface21_6 == null;
		@Pc(38) boolean local38 = this.aClass364_13 != null && this.aClass364_13.anInterface21_6 == null;
		@Pc(49) boolean local49 = this.aClass364_12 != null && this.aClass364_12.anInterface21_6 == null;
		if (arg0) {
			local49 &= (this.aByte122 & 0x8) != 0;
			local38 &= (this.aByte122 & 0x1) != 0;
			local16 &= (this.aByte122 & 0x2) != 0;
			local27 &= (this.aByte122 & 0x4) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1.aByteArray90.length >= local103 * this.anInt8456) {
			this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1.anInt9739 = 0;
		} else {
			this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2((this.anInt8456 + 100) * local103);
		}
		@Pc(191) Class3_Sub4_Sub2 local191 = this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(236) int local236;
		@Pc(245) int local245;
		if (local38) {
			@Pc(215) int local215;
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(234) int local234;
			if (this.aClass95_Sub3_36.aBoolean369) {
				for (local199 = 0; local199 < this.anInt8410; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray464[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray463[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray462[local199]);
					local227 = this.anIntArray461[local199];
					local234 = this.anIntArray461[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray107[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt9739 = local245 * local103;
						local191.method7909(local208);
						local191.method7909(local215);
						local191.method7909(local222);
					}
				}
			} else {
				for (local199 = 0; local199 < this.anInt8410; local199++) {
					local208 = Stream.floatToRawIntBits((float) this.anIntArray464[local199]);
					local215 = Stream.floatToRawIntBits((float) this.anIntArray463[local199]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray462[local199]);
					local227 = this.anIntArray461[local199];
					local234 = this.anIntArray461[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray107[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local191.anInt9739 = local103 * local245;
						local191.method7919(local208);
						local191.method7919(local215);
						local191.method7919(local222);
					}
				}
			}
		}
		@Pc(580) float local580;
		@Pc(457) short[] local457;
		@Pc(454) short[] local454;
		@Pc(451) short[] local451;
		@Pc(460) byte[] local460;
		@Pc(616) float local616;
		if (local16) {
			if (this.aClass364_10 == null) {
				if (this.aClass181_1 == null) {
					local451 = this.aShortArray109;
					local454 = this.aShortArray113;
					local457 = this.aShortArray116;
					local460 = this.aByteArray71;
				} else {
					local451 = this.aClass181_1.aShortArray62;
					local457 = this.aClass181_1.aShortArray61;
					local454 = this.aClass181_1.aShortArray63;
					local460 = this.aClass181_1.aByteArray41;
				}
				@Pc(484) float local484 = this.aClass95_Sub3_36.aFloatArray33[0];
				@Pc(490) float local490 = this.aClass95_Sub3_36.aFloatArray33[1];
				@Pc(496) float local496 = this.aClass95_Sub3_36.aFloatArray33[2];
				@Pc(500) float local500 = this.aClass95_Sub3_36.aFloat84;
				@Pc(510) float local510 = this.aClass95_Sub3_36.aFloat102 * 768.0F / (float) this.aShort86;
				@Pc(520) float local520 = this.aClass95_Sub3_36.aFloat91 * 768.0F / (float) this.aShort86;
				for (@Pc(522) int local522 = 0; local522 < this.anInt8466; local522++) {
					@Pc(544) int local544 = this.method6952(this.aByteArray70[local522], this.aShortArray106[local522], this.aShortArray114[local522], this.aShort84);
					@Pc(555) float local555 = (float) (local544 >> 8 & 0xFF) * this.aClass95_Sub3_36.aFloat99;
					@Pc(560) short local560 = this.aShortArray115[local522];
					@Pc(569) float local569 = (float) (local544 >>> 24) * this.aClass95_Sub3_36.aFloat101;
					local580 = (float) (local544 >> 16 & 0xFF) * this.aClass95_Sub3_36.aFloat85;
					@Pc(585) short local585 = (short) local460[local560];
					if (local585 == 0) {
						local616 = (local496 * (float) local451[local560] + local484 * (float) local454[local560] + (float) local457[local560] * local490) * 0.0026041667F;
					} else {
						local616 = ((float) local451[local560] * local496 + (float) local454[local560] * local484 + local490 * (float) local457[local560]) / (float) (local585 * 256);
					}
					@Pc(653) float local653 = local500 + (local616 < 0.0F ? local520 : local510) * local616;
					@Pc(658) int local658 = (int) (local653 * local569);
					@Pc(663) int local663 = (int) (local580 * local653);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					@Pc(697) int local697 = (int) (local653 * local555);
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local191.anInt9739 = local103 * local560 + local107;
					local191.method7948(local658);
					local191.method7948(local663);
					local191.method7948(local697);
					local191.method7948(255 - (this.aByteArray70[local522] & 0xFF));
					local560 = this.aShortArray108[local522];
					local585 = (short) local460[local560];
					if (local585 == 0) {
						local616 = ((float) local451[local560] * local496 + local484 * (float) local454[local560] + (float) local457[local560] * local490) * 0.0026041667F;
					} else {
						local616 = (local490 * (float) local457[local560] + (float) local454[local560] * local484 + (float) local451[local560] * local496) / (float) (local585 * 256);
					}
					local653 = local500 + (local616 < 0.0F ? local520 : local510) * local616;
					local658 = (int) (local653 * local569);
					local663 = (int) (local653 * local580);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local697 = (int) (local555 * local653);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local191.anInt9739 = local107 + local103 * local560;
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local191.method7948(local658);
					local191.method7948(local663);
					local191.method7948(local697);
					local191.method7948(255 - (this.aByteArray70[local522] & 0xFF));
					local560 = this.aShortArray111[local522];
					local585 = (short) local460[local560];
					if (local585 == 0) {
						local616 = ((float) local451[local560] * local496 + local490 * (float) local457[local560] + local484 * (float) local454[local560]) * 0.0026041667F;
					} else {
						local616 = ((float) local457[local560] * local490 + local484 * (float) local454[local560] + local496 * (float) local451[local560]) / (float) (local585 * 256);
					}
					local653 = (local616 < 0.0F ? local520 : local510) * local616 + local500;
					local658 = (int) (local569 * local653);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local663 = (int) (local580 * local653);
					local697 = (int) (local653 * local555);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local191.anInt9739 = local560 * local103 + local107;
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local191.method7948(local658);
					local191.method7948(local663);
					local191.method7948(local697);
					local191.method7948(255 - (this.aByteArray70[local522] & 0xFF));
				}
			} else {
				for (local199 = 0; local199 < this.anInt8466; local199++) {
					local208 = this.method6952(this.aByteArray70[local199], this.aShortArray106[local199], this.aShortArray114[local199], this.aShort84);
					local191.anInt9739 = local107 + local103 * this.aShortArray115[local199];
					local191.method7909(local208);
					local191.anInt9739 = local103 * this.aShortArray108[local199] + local107;
					local191.method7909(local208);
					local191.anInt9739 = local103 * this.aShortArray111[local199] + local107;
					local191.method7909(local208);
				}
			}
		}
		if (local27) {
			if (this.aClass181_1 == null) {
				local460 = this.aByteArray71;
				local457 = this.aShortArray116;
				local454 = this.aShortArray113;
				local451 = this.aShortArray109;
			} else {
				local457 = this.aClass181_1.aShortArray61;
				local451 = this.aClass181_1.aShortArray62;
				local454 = this.aClass181_1.aShortArray63;
				local460 = this.aClass181_1.aByteArray41;
			}
			@Pc(1128) float local1128 = 3.0F / (float) this.aShort86;
			local191.anInt9739 = local109;
			local616 = 3.0F / (float) (this.aShort86 / 2 + this.aShort86);
			if (this.aClass95_Sub3_36.aBoolean369) {
				for (local236 = 0; local236 < this.anInt8456; local236++) {
					local245 = local460[local236] & 0xFF;
					if (local245 == 0) {
						local191.method7962(local616 * (float) local454[local236]);
						local191.method7962(local616 * (float) local457[local236]);
						local191.method7962(local616 * (float) local451[local236]);
					} else {
						local580 = local1128 / (float) local245;
						local191.method7962(local580 * (float) local454[local236]);
						local191.method7962((float) local457[local236] * local580);
						local191.method7962(local580 * (float) local451[local236]);
					}
					local191.anInt9739 += local103 - 12;
				}
			} else {
				for (local236 = 0; local236 < this.anInt8456; local236++) {
					local245 = local460[local236] & 0xFF;
					if (local245 == 0) {
						local191.method7963(local616 * (float) local454[local236]);
						local191.method7963(local616 * (float) local457[local236]);
						local191.method7963((float) local451[local236] * local616);
					} else {
						local580 = local1128 / (float) local245;
						local191.method7963(local580 * (float) local454[local236]);
						local191.method7963((float) local457[local236] * local580);
						local191.method7963((float) local451[local236] * local580);
					}
					local191.anInt9739 += local103 - 12;
				}
			}
		}
		if (local49) {
			local191.anInt9739 = local111;
			if (this.aClass95_Sub3_36.aBoolean369) {
				for (local199 = 0; local199 < this.anInt8456; local199++) {
					local191.method7962(this.aFloatArray44[local199]);
					local191.method7962(this.aFloatArray45[local199]);
					local191.anInt9739 += local103 - 8;
				}
			} else {
				for (local199 = 0; local199 < this.anInt8456; local199++) {
					local191.method7963(this.aFloatArray44[local199]);
					local191.method7963(this.aFloatArray45[local199]);
					local191.anInt9739 += local103 - 8;
				}
			}
		}
		local191.anInt9739 = local103 * this.anInt8456;
		@Pc(1420) Interface21 local1420;
		if (arg0) {
			if (this.anInterface21_5 == null) {
				this.anInterface21_5 = this.aClass95_Sub3_36.method4847(local191.anInt9739, true, local191.aByteArray90, local103);
			} else {
				this.anInterface21_5.method8698(local191.aByteArray90, local103, local191.anInt9739);
			}
			local1420 = this.anInterface21_5;
			this.aByte122 = 0;
		} else {
			local1420 = this.aClass95_Sub3_36.method4847(local191.anInt9739, false, local191.aByteArray90, local103);
			this.aBoolean584 = true;
		}
		if (local38) {
			this.aClass364_13.aByte141 = 0;
			this.aClass364_13.anInterface21_6 = local1420;
		}
		if (local49) {
			this.aClass364_12.anInterface21_6 = local1420;
			this.aClass364_12.aByte141 = local111;
		}
		if (local16) {
			this.aClass364_11.aByte141 = local107;
			this.aClass364_11.anInterface21_6 = local1420;
		}
		if (local27) {
			this.aClass364_10.aByte141 = local109;
			this.aClass364_10.anInterface21_6 = local1420;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8847(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class149_Sub2 local8 = (Class149_Sub2) arg0;
		if (this.anInt8466 == 0 || local8.anInt8466 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt8410;
		@Pc(24) int[] local24 = local8.anIntArray464;
		@Pc(27) int[] local27 = local8.anIntArray463;
		@Pc(30) int[] local30 = local8.anIntArray462;
		@Pc(33) short[] local33 = local8.aShortArray113;
		@Pc(36) short[] local36 = local8.aShortArray116;
		@Pc(39) short[] local39 = local8.aShortArray109;
		@Pc(42) byte[] local42 = local8.aByteArray71;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(57) short[] local57;
		@Pc(61) byte[] local61;
		if (this.aClass181_1 == null) {
			local53 = null;
			local57 = null;
			local61 = null;
			local49 = null;
		} else {
			local49 = this.aClass181_1.aShortArray63;
			local53 = this.aClass181_1.aShortArray61;
			local57 = this.aClass181_1.aShortArray62;
			local61 = this.aClass181_1.aByteArray41;
		}
		@Pc(80) short[] local80;
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) byte[] local76;
		if (local8.aClass181_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass181_1.aShortArray63;
			local76 = local8.aClass181_1.aByteArray41;
			local82 = local8.aClass181_1.aShortArray62;
			local78 = local8.aClass181_1.aShortArray61;
		}
		@Pc(103) int[] local103 = local8.anIntArray461;
		@Pc(106) short[] local106 = local8.aShortArray107;
		if (!local8.aBoolean585) {
			local8.method6949();
		}
		@Pc(115) short local115 = local8.aShort81;
		@Pc(118) short local118 = local8.aShort87;
		@Pc(121) short local121 = local8.lb;
		@Pc(124) short local124 = local8.aShort85;
		@Pc(127) short local127 = local8.aShort88;
		@Pc(130) short local130 = local8.aShort83;
		for (@Pc(132) int local132 = 0; local132 < this.anInt8410; local132++) {
			@Pc(142) int local142 = this.anIntArray463[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray464[local132] - arg1;
				if (local162 >= local121 && local124 >= local162) {
					@Pc(182) int local182 = this.anIntArray462[local132] - arg3;
					if (local182 >= local127 && local182 <= local130) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray461[local132];
						@Pc(208) int local208 = this.anIntArray461[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray107[local210] - 1;
							if (local196 == -1 || this.aByteArray71[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(239) int local239 = 0; local239 < local21; local239++) {
								if (local24[local239] == local162 && local30[local239] == local182 && local142 == local27[local239]) {
									local208 = local103[local239 + 1];
									local201 = local103[local239];
									@Pc(272) int local272 = -1;
									for (@Pc(274) int local274 = local201; local274 < local208; local274++) {
										local272 = local106[local274] - 1;
										if (local272 == -1 || local42[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local49 == null) {
											this.aClass181_1 = new Class181();
											local49 = this.aClass181_1.aShortArray63 = Static65.method1162(this.aShortArray113);
											local53 = this.aClass181_1.aShortArray61 = Static65.method1162(this.aShortArray116);
											local57 = this.aClass181_1.aShortArray62 = Static65.method1162(this.aShortArray109);
											local61 = this.aClass181_1.aByteArray41 = Static170.method2690(this.aByteArray71);
										}
										if (local80 == null) {
											@Pc(357) Class181 local357 = local8.aClass181_1 = new Class181();
											local80 = local357.aShortArray63 = Static65.method1162(local33);
											local78 = local357.aShortArray61 = Static65.method1162(local36);
											local82 = local357.aShortArray62 = Static65.method1162(local39);
											local76 = local357.aByteArray41 = Static170.method2690(local42);
										}
										@Pc(390) short local390 = this.aShortArray113[local196];
										@Pc(395) short local395 = this.aShortArray116[local196];
										@Pc(400) short local400 = this.aShortArray109[local196];
										local201 = local103[local239];
										@Pc(409) byte local409 = this.aByteArray71[local196];
										local208 = local103[local239 + 1];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local201; local417 < local208; local417++) {
											local425 = local106[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local76[local425] != 0) {
												local80[local425] += local390;
												local78[local425] += local395;
												local82[local425] += local400;
												local76[local425] += local409;
											}
										}
										local390 = local33[local272];
										local201 = this.anIntArray461[local132];
										local400 = local39[local272];
										local409 = local42[local272];
										local208 = this.anIntArray461[local132 + 1];
										local395 = local36[local272];
										for (local425 = local201; local425 < local208; local425++) {
											@Pc(511) int local511 = this.aShortArray107[local425] - 1;
											if (local511 == -1) {
												break;
											}
											if (local61[local511] != 0) {
												local49[local511] += local390;
												local53[local511] += local395;
												local57[local511] += local400;
												local61[local511] += local409;
											}
										}
										if (this.aClass364_10 == null && this.aClass364_11 != null) {
											this.aClass364_11.anInterface21_6 = null;
										}
										if (this.aClass364_10 != null) {
											this.aClass364_10.anInterface21_6 = null;
										}
										if (local8.aClass364_10 == null && local8.aClass364_11 != null) {
											local8.aClass364_11.anInterface21_6 = null;
										}
										if (local8.aClass364_10 != null) {
											local8.aClass364_10.anInterface21_6 = null;
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

	@OriginalMember(owner = "client!sca", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8410; local15++) {
			local33 = this.anIntArray462[local15] * local9 + this.anIntArray464[local15] * local13 >> 14;
			this.anIntArray462[local15] = this.anIntArray462[local15] * local13 - this.anIntArray464[local15] * local9 >> 14;
			this.anIntArray464[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8456; local33++) {
			@Pc(82) int local82 = local13 * this.aShortArray113[local33] + this.aShortArray109[local33] * local9 >> 14;
			this.aShortArray109[local33] = (short) (local13 * this.aShortArray109[local33] - local9 * this.aShortArray113[local33] >> 14);
			this.aShortArray113[local33] = (short) local82;
		}
		if (this.aClass364_10 == null && this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
		if (this.aClass364_10 != null) {
			this.aClass364_10.anInterface21_6 = null;
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray51 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8453; local12++) {
			this.anIntArray464[local12] <<= 0x4;
			this.anIntArray463[local12] <<= 0x4;
			this.anIntArray462[local12] <<= 0x4;
		}
		Static258.anInt4528 = 0;
		Static51.anInt1124 = 0;
		Static130.anInt9950 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V")
	private void method6946() {
		if (this.anInt8444 == 0) {
			return;
		}
		if (this.aByte122 != 0) {
			this.method6945(true);
		}
		this.method6945(false);
		if (this.aClass238_1 != null) {
			if (this.aClass238_1.anInterface27_2 == null) {
				this.method6958((this.aByte122 & 0x10) != 0);
			}
			if (this.aClass238_1.anInterface27_2 != null) {
				this.aClass95_Sub3_36.method4908(this.aClass364_10 != null);
				this.aClass95_Sub3_36.method4903(this.aClass364_12, this.aClass364_13, this.aClass364_11, this.aClass364_10);
				@Pc(75) int local75 = this.anIntArray460.length - 1;
				for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
					@Pc(84) int local84 = this.anIntArray460[local77];
					@Pc(91) int local91 = this.anIntArray460[local77 + 1];
					@Pc(98) int local98 = this.aShortArray114[local84] & 0xFFFF;
					if (local98 == 65535) {
						local98 = -1;
					}
					this.aClass95_Sub3_36.method4897(this.aClass364_10 != null, local98);
					this.aClass95_Sub3_36.method4837(local84 * 3, (local91 - local84) * 3, this.aClass238_1.anInterface27_2);
				}
			}
		}
		this.method6950();
	}

	@OriginalMember(owner = "client!sca", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8410; local15++) {
			@Pc(33) int local33 = this.anIntArray464[local15] * local13 + this.anIntArray463[local15] * local9 >> 14;
			this.anIntArray463[local15] = local13 * this.anIntArray463[local15] - local9 * this.anIntArray464[local15] >> 14;
			this.anIntArray464[local15] = local33;
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!sca;Lclient!sca;ZZBI)Lclient!ka;")
	private Class149 method6947(@OriginalArg(0) Class149_Sub2 arg0, @OriginalArg(1) Class149_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		arg0.aShort86 = this.aShort86;
		arg0.aByte122 = 0;
		arg0.anInt8456 = this.anInt8456;
		arg0.aShort84 = this.aShort84;
		if ((arg4 & 0x100) == 0) {
			arg0.aBoolean583 = this.aBoolean583;
		} else {
			arg0.aBoolean583 = true;
		}
		arg0.anInt8453 = this.anInt8453;
		arg0.anInt8444 = this.anInt8444;
		arg0.anInt8470 = this.anInt8470;
		arg0.anInt8469 = this.anInt8469;
		arg0.aBoolean586 = this.aBoolean586;
		arg0.anInt8421 = arg4;
		arg0.anInt8410 = this.anInt8410;
		arg0.anInt8466 = this.anInt8466;
		@Pc(73) boolean local73 = Static516.method6724(this.anInt8470, arg4);
		@Pc(79) boolean local79 = Static278.method4065(this.anInt8470, arg4);
		@Pc(85) boolean local85 = Static67.method1221(this.anInt8470, arg4);
		@Pc(91) boolean local91 = local85 | local73 | local79;
		@Pc(210) int local210;
		if (local91) {
			if (!local73) {
				arg0.anIntArray464 = this.anIntArray464;
			} else if (arg1.anIntArray464 == null || this.anInt8453 > arg1.anIntArray464.length) {
				arg0.anIntArray464 = arg1.anIntArray464 = new int[this.anInt8453];
			} else {
				arg0.anIntArray464 = arg1.anIntArray464;
			}
			if (!local79) {
				arg0.anIntArray463 = this.anIntArray463;
			} else if (arg1.anIntArray463 == null || arg1.anIntArray463.length < this.anInt8453) {
				arg0.anIntArray463 = arg1.anIntArray463 = new int[this.anInt8453];
			} else {
				arg0.anIntArray463 = arg1.anIntArray463;
			}
			if (!local85) {
				arg0.anIntArray462 = this.anIntArray462;
			} else if (arg1.anIntArray462 == null || arg1.anIntArray462.length < this.anInt8453) {
				arg0.anIntArray462 = arg1.anIntArray462 = new int[this.anInt8453];
			} else {
				arg0.anIntArray462 = arg1.anIntArray462;
			}
			for (local210 = 0; local210 < this.anInt8453; local210++) {
				if (local73) {
					arg0.anIntArray464[local210] = this.anIntArray464[local210];
				}
				if (local79) {
					arg0.anIntArray463[local210] = this.anIntArray463[local210];
				}
				if (local85) {
					arg0.anIntArray462[local210] = this.anIntArray462[local210];
				}
			}
		} else {
			arg0.anIntArray464 = this.anIntArray464;
			arg0.anIntArray462 = this.anIntArray462;
			arg0.anIntArray463 = this.anIntArray463;
		}
		if (Static669.method8386(this.anInt8470, arg4)) {
			arg0.aClass364_13 = arg1.aClass364_13;
			if (arg3) {
				arg0.aByte122 = (byte) (arg0.aByte122 | 0x1);
			}
			arg0.aClass364_13.anInterface21_6 = this.aClass364_13.anInterface21_6;
			arg0.aClass364_13.aByte141 = this.aClass364_13.aByte141;
		} else if (Static614.method8321(arg4, this.anInt8470)) {
			arg0.aClass364_13 = this.aClass364_13;
		} else {
			arg0.aClass364_13 = null;
		}
		if (Static505.method6600(arg4, this.anInt8470)) {
			if (arg1.aShortArray106 == null || arg1.aShortArray106.length < this.anInt8466) {
				arg0.aShortArray106 = arg1.aShortArray106 = new short[this.anInt8466];
			} else {
				arg0.aShortArray106 = arg1.aShortArray106;
			}
			for (local210 = 0; local210 < this.anInt8466; local210++) {
				arg0.aShortArray106[local210] = this.aShortArray106[local210];
			}
		} else {
			arg0.aShortArray106 = this.aShortArray106;
		}
		if (Static226.method3387(this.anInt8470, arg4)) {
			if (arg1.aByteArray70 == null || this.anInt8466 > arg1.aByteArray70.length) {
				arg0.aByteArray70 = arg1.aByteArray70 = new byte[this.anInt8466];
			} else {
				arg0.aByteArray70 = arg1.aByteArray70;
			}
			for (local210 = 0; local210 < this.anInt8466; local210++) {
				arg0.aByteArray70[local210] = this.aByteArray70[local210];
			}
		} else {
			arg0.aByteArray70 = this.aByteArray70;
		}
		if (Static506.method6604(this.anInt8470, arg4)) {
			arg0.aClass364_11 = arg1.aClass364_11;
			if (arg3) {
				arg0.aByte122 = (byte) (arg0.aByte122 | 0x2);
			}
			arg0.aClass364_11.aByte141 = this.aClass364_11.aByte141;
			arg0.aClass364_11.anInterface21_6 = this.aClass364_11.anInterface21_6;
		} else if (Static408.method5610(this.anInt8470, arg4)) {
			arg0.aClass364_11 = this.aClass364_11;
		} else {
			arg0.aClass364_11 = null;
		}
		@Pc(594) int local594;
		if (Static382.method5376(arg4, this.anInt8470)) {
			if (arg1.aShortArray113 == null || arg1.aShortArray113.length < this.anInt8456) {
				local210 = this.anInt8456;
				arg0.aShortArray113 = arg1.aShortArray113 = new short[local210];
				arg0.aShortArray116 = arg1.aShortArray116 = new short[local210];
				arg0.aShortArray109 = arg1.aShortArray109 = new short[local210];
			} else {
				arg0.aShortArray116 = arg1.aShortArray116;
				arg0.aShortArray109 = arg1.aShortArray109;
				arg0.aShortArray113 = arg1.aShortArray113;
			}
			if (this.aClass181_1 == null) {
				for (local210 = 0; local210 < this.anInt8456; local210++) {
					arg0.aShortArray113[local210] = this.aShortArray113[local210];
					arg0.aShortArray116[local210] = this.aShortArray116[local210];
					arg0.aShortArray109[local210] = this.aShortArray109[local210];
				}
			} else {
				if (arg1.aClass181_1 == null) {
					arg1.aClass181_1 = new Class181();
				}
				@Pc(582) Class181 local582 = arg0.aClass181_1 = arg1.aClass181_1;
				if (local582.aShortArray63 == null || this.anInt8456 > local582.aShortArray63.length) {
					local594 = this.anInt8456;
					local582.aShortArray62 = new short[local594];
					local582.aShortArray61 = new short[local594];
					local582.aShortArray63 = new short[local594];
					local582.aByteArray41 = new byte[local594];
				}
				for (local594 = 0; local594 < this.anInt8456; local594++) {
					arg0.aShortArray113[local594] = this.aShortArray113[local594];
					arg0.aShortArray116[local594] = this.aShortArray116[local594];
					arg0.aShortArray109[local594] = this.aShortArray109[local594];
					local582.aShortArray63[local594] = this.aClass181_1.aShortArray63[local594];
					local582.aShortArray61[local594] = this.aClass181_1.aShortArray61[local594];
					local582.aShortArray62[local594] = this.aClass181_1.aShortArray62[local594];
					local582.aByteArray41[local594] = this.aClass181_1.aByteArray41[local594];
				}
			}
			arg0.aByteArray71 = this.aByteArray71;
		} else {
			arg0.aByteArray71 = this.aByteArray71;
			arg0.aShortArray116 = this.aShortArray116;
			arg0.aClass181_1 = this.aClass181_1;
			arg0.aShortArray109 = this.aShortArray109;
			arg0.aShortArray113 = this.aShortArray113;
		}
		if (Static58.method7704(arg4, this.anInt8470)) {
			if (arg3) {
				arg0.aByte122 = (byte) (arg0.aByte122 | 0x4);
			}
			arg0.aClass364_10 = arg1.aClass364_10;
			arg0.aClass364_10.aByte141 = this.aClass364_10.aByte141;
			arg0.aClass364_10.anInterface21_6 = this.aClass364_10.anInterface21_6;
		} else if (Static96.method1615(this.anInt8470, arg4)) {
			arg0.aClass364_10 = this.aClass364_10;
		} else {
			arg0.aClass364_10 = null;
		}
		if (Static65.method1164(arg4, this.anInt8470)) {
			if (arg1.aFloatArray44 == null || this.anInt8466 > arg1.aFloatArray44.length) {
				local210 = this.anInt8456;
				arg0.aFloatArray45 = arg1.aFloatArray45 = new float[local210];
				arg0.aFloatArray44 = arg1.aFloatArray44 = new float[local210];
			} else {
				arg0.aFloatArray45 = arg1.aFloatArray45;
				arg0.aFloatArray44 = arg1.aFloatArray44;
			}
			for (local210 = 0; local210 < this.anInt8456; local210++) {
				arg0.aFloatArray44[local210] = this.aFloatArray44[local210];
				arg0.aFloatArray45[local210] = this.aFloatArray45[local210];
			}
		} else {
			arg0.aFloatArray44 = this.aFloatArray44;
			arg0.aFloatArray45 = this.aFloatArray45;
		}
		if (Static430.method5939(arg4, this.anInt8470)) {
			if (arg3) {
				arg0.aByte122 = (byte) (arg0.aByte122 | 0x8);
			}
			arg0.aClass364_12 = arg1.aClass364_12;
			arg0.aClass364_12.aByte141 = this.aClass364_12.aByte141;
			arg0.aClass364_12.anInterface21_6 = this.aClass364_12.anInterface21_6;
		} else if (Static435.method5966(this.anInt8470, arg4)) {
			arg0.aClass364_12 = this.aClass364_12;
		} else {
			arg0.aClass364_12 = null;
		}
		if (Static512.method6691(arg4, this.anInt8470)) {
			if (arg1.aShortArray115 == null || arg1.aShortArray115.length < this.anInt8466) {
				local210 = this.anInt8466;
				arg0.aShortArray115 = arg1.aShortArray115 = new short[local210];
				arg0.aShortArray108 = arg1.aShortArray108 = new short[local210];
				arg0.aShortArray111 = arg1.aShortArray111 = new short[local210];
			} else {
				arg0.aShortArray108 = arg1.aShortArray108;
				arg0.aShortArray111 = arg1.aShortArray111;
				arg0.aShortArray115 = arg1.aShortArray115;
			}
			for (local210 = 0; local210 < this.anInt8466; local210++) {
				arg0.aShortArray115[local210] = this.aShortArray115[local210];
				arg0.aShortArray108[local210] = this.aShortArray108[local210];
				arg0.aShortArray111[local210] = this.aShortArray111[local210];
			}
		} else {
			arg0.aShortArray115 = this.aShortArray115;
			arg0.aShortArray111 = this.aShortArray111;
			arg0.aShortArray108 = this.aShortArray108;
		}
		if (Static193.method2999(arg4, this.anInt8470)) {
			if (arg3) {
				arg0.aByte122 = (byte) (arg0.aByte122 | 0x10);
			}
			arg0.aClass238_1 = arg1.aClass238_1;
			arg0.aClass238_1.anInterface27_2 = this.aClass238_1.anInterface27_2;
		} else if (Static488.method6444(arg4, this.anInt8470)) {
			arg0.aClass238_1 = this.aClass238_1;
		} else {
			arg0.aClass238_1 = null;
		}
		if (Static91.method1514(this.anInt8470, arg4)) {
			if (arg1.aShortArray114 == null || this.anInt8466 > arg1.aShortArray114.length) {
				local210 = this.anInt8466;
				arg0.aShortArray114 = arg1.aShortArray114 = new short[local210];
			} else {
				arg0.aShortArray114 = arg1.aShortArray114;
			}
			for (local210 = 0; local210 < this.anInt8466; local210++) {
				arg0.aShortArray114[local210] = this.aShortArray114[local210];
			}
		} else {
			arg0.aShortArray114 = this.aShortArray114;
		}
		if (!Static120.method1817(this.anInt8470, arg4)) {
			arg0.aClass107Array1 = this.aClass107Array1;
		} else if (arg1.aClass107Array1 == null || arg1.aClass107Array1.length < this.anInt8469) {
			local210 = this.anInt8469;
			arg0.aClass107Array1 = arg1.aClass107Array1 = new Class107[local210];
			for (local594 = 0; local594 < this.anInt8469; local594++) {
				arg0.aClass107Array1[local594] = this.aClass107Array1[local594].method2350();
			}
		} else {
			arg0.aClass107Array1 = arg1.aClass107Array1;
			for (local210 = 0; local210 < this.anInt8469; local210++) {
				arg0.aClass107Array1[local210].method2351(this.aClass107Array1[local210]);
			}
		}
		arg0.aClass354Array1 = this.aClass354Array1;
		arg0.anIntArrayArray52 = this.anIntArrayArray52;
		arg0.anIntArray461 = this.anIntArray461;
		arg0.aShortArray112 = this.aShortArray112;
		arg0.aShortArray110 = this.aShortArray110;
		arg0.anIntArray460 = this.anIntArray460;
		arg0.aShortArray107 = this.aShortArray107;
		arg0.aClass373Array4 = this.aClass373Array4;
		if (this.aBoolean585) {
			arg0.aShort87 = this.aShort87;
			arg0.aBoolean585 = true;
			arg0.aShort81 = this.aShort81;
			arg0.aShort83 = this.aShort83;
			arg0.aShort89 = this.aShort89;
			arg0.aShort85 = this.aShort85;
			arg0.lb = this.lb;
			arg0.aShort88 = this.aShort88;
			arg0.aShort82 = this.aShort82;
		} else {
			arg0.aBoolean585 = false;
		}
		arg0.anIntArrayArray51 = this.anIntArrayArray51;
		arg0.anIntArrayArray53 = this.anIntArrayArray53;
		arg0.aClass305Array4 = this.aClass305Array4;
		return arg0;
	}

	@OriginalMember(owner = "client!sca", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort83;
	}

	@OriginalMember(owner = "client!sca", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub5_Sub11 ba(@OriginalArg(0) Class3_Sub5_Sub11 arg0) {
		if (this.anInt8456 == 0) {
			return null;
		}
		if (!this.aBoolean585) {
			this.method6949();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass95_Sub3_36.anInt5760 <= 0) {
			local37 = this.lb - (this.aShort81 * this.aClass95_Sub3_36.anInt5760 >> 8) >> this.aClass95_Sub3_36.anInt5750;
			local54 = this.aShort85 - (this.aShort87 * this.aClass95_Sub3_36.anInt5760 >> 8) >> this.aClass95_Sub3_36.anInt5750;
		} else {
			local37 = this.lb - (this.aClass95_Sub3_36.anInt5760 * this.aShort87 >> 8) >> this.aClass95_Sub3_36.anInt5750;
			local54 = this.aShort85 - (this.aShort81 * this.aClass95_Sub3_36.anInt5760 >> 8) >> this.aClass95_Sub3_36.anInt5750;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass95_Sub3_36.anInt5762 <= 0) {
			local114 = this.aShort88 - (this.aClass95_Sub3_36.anInt5762 * this.aShort81 >> 8) >> this.aClass95_Sub3_36.anInt5750;
			local131 = this.aShort83 - (this.aClass95_Sub3_36.anInt5762 * this.aShort87 >> 8) >> this.aClass95_Sub3_36.anInt5750;
		} else {
			local114 = this.aShort88 - (this.aClass95_Sub3_36.anInt5762 * this.aShort87 >> 8) >> this.aClass95_Sub3_36.anInt5750;
			local131 = this.aShort83 - (this.aShort81 * this.aClass95_Sub3_36.anInt5762 >> 8) >> this.aClass95_Sub3_36.anInt5750;
		}
		@Pc(174) int local174 = local54 + 1 - local37;
		@Pc(180) int local180 = local131 + 1 - local114;
		@Pc(183) Class3_Sub5_Sub11_Sub1 local183 = (Class3_Sub5_Sub11_Sub1) arg0;
		@Pc(199) Class3_Sub5_Sub11_Sub1 local199;
		if (local183 != null && local183.method4403(local174, local180)) {
			local199 = local183;
			local183.method4404();
		} else {
			local199 = new Class3_Sub5_Sub11_Sub1(this.aClass95_Sub3_36, local174, local180);
		}
		local199.method4399(local131, local37, local114, local54);
		this.method6956(local199);
		return local199;
	}

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "()[Lclient!vja;")
	@Override
	public Class373[] method8867() {
		return this.aClass373Array4;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8466; local7++) {
			local16 = this.aShortArray106[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local46 += arg3 * (arg2 - local46) >> 7;
			}
			this.aShortArray106[local7] = (short) (local46 | local22 << 10 | local28 << 7);
		}
		if (this.aClass354Array1 != null) {
			for (local16 = 0; local16 < this.anInt8469; local16++) {
				@Pc(110) Class354 local110 = this.aClass354Array1[local16];
				@Pc(115) Class107 local115 = this.aClass107Array1[local16];
				local115.anInt2696 = Static537.anIntArray457[this.aShortArray106[local110.anInt10126] & 0xFFFF] & 0xFFFFFF | local115.anInt2696 & 0xFF000000;
			}
		}
		if (this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort86 = (short) arg0;
		if (this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
		if (this.aClass364_10 != null) {
			this.aClass364_10.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "()V")
	@Override
	public void method8870() {
		if (this.anInt8456 <= 0 || this.anInt8444 <= 0) {
			return;
		}
		this.method6945(false);
		if ((this.aByte122 & 0x10) == 0 && this.aClass238_1.anInterface27_2 == null) {
			this.method6958(false);
		}
		this.method6950();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILclient!gl;IBJIIFFI)S")
	private short method6948(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray461[arg4];
		@Pc(17) int local17 = this.anIntArray461[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray107[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg3 == Static639.aLongArray21[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray107[local19] = (short) (this.anInt8456 + 1);
		Static639.aLongArray21[local19] = arg3;
		this.aShortArray113[this.anInt8456] = (short) arg0;
		this.aShortArray116[this.anInt8456] = (short) arg2;
		this.aShortArray109[this.anInt8456] = (short) arg5;
		this.aByteArray71[this.anInt8456] = (byte) arg8;
		this.aFloatArray44[this.anInt8456] = arg7;
		this.aFloatArray45[this.anInt8456] = arg6;
		return (short) this.anInt8456++;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "()V")
	@Override
	protected void method8859() {
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!al;Lclient!ju;II)V")
	@Override
	public void method8869(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8456 == 0) {
			return;
		}
		@Pc(13) Class17_Sub3 local13 = this.aClass95_Sub3_36.aClass17_Sub3_3;
		if (!this.aBoolean585) {
			this.method6949();
		}
		@Pc(22) Class17_Sub3 local22 = (Class17_Sub3) arg0;
		Static47.aFloat10 = local13.aFloat150 + local22.aFloat150 * local13.aFloat149 + local13.aFloat148 * local22.aFloat147 + local22.aFloat144 * local13.aFloat151;
		Static552.aFloat175 = local22.aFloat151 * local13.aFloat149 + local13.aFloat151 * local22.aFloat140 + local22.aFloat146 * local13.aFloat148;
		@Pc(69) float local69 = Static47.aFloat10 + (float) this.aShort81 * Static552.aFloat175;
		@Pc(77) float local77 = Static47.aFloat10 + (float) this.aShort87 * Static552.aFloat175;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort82;
			local94 = (float) -this.aShort82 + local77;
		} else {
			local87 = local77 + (float) this.aShort82;
			local94 = (float) -this.aShort82 + local69;
		}
		if (this.aClass95_Sub3_36.aFloat82 <= local94 || (float) this.aClass95_Sub3_36.anInt5782 >= local87) {
			return;
		}
		Static116.aFloat20 = local13.aFloat147 + local13.aFloat143 * local22.aFloat150 + local13.aFloat146 * local22.aFloat144 + local22.aFloat147 * local13.aFloat145;
		Static477.aFloat152 = local22.aFloat146 * local13.aFloat145 + local13.aFloat146 * local22.aFloat140 + local13.aFloat143 * local22.aFloat151;
		@Pc(171) float local171 = Static116.aFloat20 + (float) this.aShort81 * Static477.aFloat152;
		@Pc(179) float local179 = Static477.aFloat152 * (float) this.aShort87 + Static116.aFloat20;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (local171 + (float) this.aShort82) * (float) this.aClass95_Sub3_36.anInt5785;
			local206 = ((float) -this.aShort82 + local179) * (float) this.aClass95_Sub3_36.anInt5785;
		} else {
			local194 = ((float) this.aShort82 + local179) * (float) this.aClass95_Sub3_36.anInt5785;
			local206 = (float) this.aClass95_Sub3_36.anInt5785 * (local171 - (float) this.aShort82);
		}
		if (local206 / (float) arg2 >= this.aClass95_Sub3_36.aFloat96 || this.aClass95_Sub3_36.aFloat92 >= local194 / (float) arg2) {
			return;
		}
		Static99.aFloat19 = local13.aFloat144 + local13.aFloat141 * local22.aFloat147 + local13.aFloat140 * local22.aFloat144 + local22.aFloat150 * local13.aFloat142;
		Static398.aFloat124 = local22.aFloat151 * local13.aFloat142 + local13.aFloat141 * local22.aFloat146 + local22.aFloat140 * local13.aFloat140;
		@Pc(297) float local297 = Static99.aFloat19 + (float) this.aShort81 * Static398.aFloat124;
		@Pc(305) float local305 = (float) this.aShort87 * Static398.aFloat124 + Static99.aFloat19;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local305 < local297) {
			local321 = (float) this.aClass95_Sub3_36.anInt5781 * ((float) -this.aShort82 + local305);
			local332 = (float) this.aClass95_Sub3_36.anInt5781 * (local297 + (float) this.aShort82);
		} else {
			local332 = ((float) this.aShort82 + local305) * (float) this.aClass95_Sub3_36.anInt5781;
			local321 = (float) this.aClass95_Sub3_36.anInt5781 * (local297 - (float) this.aShort82);
		}
		if (local321 / (float) arg2 >= this.aClass95_Sub3_36.aFloat93 || this.aClass95_Sub3_36.aFloat86 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass354Array1 != null) {
			Static64.aFloat13 = local22.aFloat148 * local13.aFloat142 + local13.aFloat140 * local22.aFloat141 + local22.aFloat145 * local13.aFloat141;
			Static394.aFloat123 = local22.aFloat149 * local13.aFloat149 + local22.aFloat142 * local13.aFloat151 + local22.aFloat143 * local13.aFloat148;
			Static307.aFloat80 = local13.aFloat143 * local22.aFloat148 + local22.aFloat145 * local13.aFloat145 + local22.aFloat141 * local13.aFloat146;
			Static596.aFloat138 = local22.aFloat143 * local13.aFloat145 + local22.aFloat142 * local13.aFloat146 + local22.aFloat149 * local13.aFloat143;
			Static351.aFloat118 = local22.aFloat149 * local13.aFloat142 + local13.aFloat140 * local22.aFloat142 + local13.aFloat141 * local22.aFloat143;
			Static397.aFloat186 = local22.aFloat141 * local13.aFloat151 + local22.aFloat145 * local13.aFloat148 + local22.aFloat148 * local13.aFloat149;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.lb + this.aShort85 >> 1;
			@Pc(507) int local507 = this.aShort83 + this.aShort88 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static596.aFloat138 + (float) this.aShort81 * Static477.aFloat152 + Static307.aFloat80 * (float) local499 + Static116.aFloat20);
			@Pc(545) int local545 = (int) (Static99.aFloat19 + Static64.aFloat13 * (float) local499 + Static398.aFloat124 * (float) this.aShort81 + Static351.aFloat118 * (float) local507);
			@Pc(564) int local564 = (int) (Static552.aFloat175 * (float) this.aShort81 + Static47.aFloat10 + Static397.aFloat186 * (float) local499 + (float) local507 * Static394.aFloat123);
			@Pc(583) int local583 = (int) (Static596.aFloat138 * (float) local507 + Static307.aFloat80 * (float) local499 + Static116.aFloat20 + (float) this.aShort87 * Static477.aFloat152);
			@Pc(602) int local602 = (int) (Static351.aFloat118 * (float) local507 + Static398.aFloat124 * (float) this.aShort87 + Static99.aFloat19 + Static64.aFloat13 * (float) local499);
			@Pc(621) int local621 = (int) (Static397.aFloat186 * (float) local499 + Static47.aFloat10 + (float) this.aShort87 * Static552.aFloat175 + (float) local507 * Static394.aFloat123);
			arg1.anInt4989 = local526 * this.aClass95_Sub3_36.anInt5785 / arg2 + this.aClass95_Sub3_36.anInt5784;
			arg1.anInt4991 = this.aClass95_Sub3_36.anInt5781 * local602 / arg2 + this.aClass95_Sub3_36.anInt5772;
			arg1.anInt4990 = local583 * this.aClass95_Sub3_36.anInt5785 / arg2 + this.aClass95_Sub3_36.anInt5784;
			arg1.anInt4988 = this.aClass95_Sub3_36.anInt5781 * local545 / arg2 + this.aClass95_Sub3_36.anInt5772;
			if (local564 >= this.aClass95_Sub3_36.anInt5782 || this.aClass95_Sub3_36.anInt5782 <= local621) {
				arg1.aBoolean332 = true;
				arg1.anInt4992 = this.aClass95_Sub3_36.anInt5784 + (local526 + this.aShort82) * this.aClass95_Sub3_36.anInt5785 / arg2 - arg1.anInt4989;
			}
		}
		this.aClass95_Sub3_36.method4891((float) arg2);
		this.aClass95_Sub3_36.method4881();
		this.aClass95_Sub3_36.method4892(local22);
		this.method6946();
		this.aClass95_Sub3_36.method4874();
		this.method6955();
	}

	@OriginalMember(owner = "client!sca", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static51.anInt1124 = 0;
			local29 = 0;
			Static130.anInt9950 = 0;
			Static258.anInt4528 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray51.length > local41) {
					local55 = this.anIntArrayArray51[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray110 == null || (this.aShortArray110[local63] & arg6) != 0) {
							Static51.anInt1124 += this.anIntArray464[local63];
							Static258.anInt4528 += this.anIntArray463[local63];
							local29++;
							Static130.anInt9950 += this.anIntArray462[local63];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static258.anInt4528 = arg3;
				Static130.anInt9950 = arg4;
				Static51.anInt1124 = arg2;
			} else {
				Static258.anInt4528 = Static258.anInt4528 / local29 + arg3;
				Static676.aBoolean756 = true;
				Static51.anInt1124 = Static51.anInt1124 / local29 + arg2;
				Static130.anInt9950 = arg4 + Static130.anInt9950 / local29;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg7[1] * arg3 + arg2 * arg7[0] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local41;
				arg2 = local29;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray51.length > local35) {
					local250 = this.anIntArrayArray51[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local57]) != 0) {
							this.anIntArray464[local57] += arg2;
							this.anIntArray463[local57] += arg3;
							this.anIntArray462[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(407) int local407;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(679) int local679;
		@Pc(1021) int local1021;
		@Pc(1029) int local1029;
		@Pc(1184) int local1184;
		@Pc(1209) int local1209;
		@Pc(1214) int local1214;
		@Pc(1223) int local1223;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1236) int local1236;
		@Pc(1238) int local1238;
		@Pc(1367) int[] local1367;
		@Pc(1369) int local1369;
		@Pc(1373) int local1373;
		@Pc(1377) int local1377;
		@Pc(1379) int local1379;
		@Pc(1503) int local1503;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray51.length) {
						local250 = this.anIntArrayArray51[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray110 == null || (this.aShortArray110[local57] & arg6) != 0) {
								this.anIntArray464[local57] -= Static51.anInt1124;
								this.anIntArray463[local57] -= Static258.anInt4528;
								this.anIntArray462[local57] -= Static130.anInt9950;
								if (arg4 != 0) {
									local63 = Class94.anIntArray561[arg4];
									local389 = Class94.anIntArray560[arg4];
									local407 = local389 * this.anIntArray464[local57] + local63 * this.anIntArray463[local57] + 16383 >> 14;
									this.anIntArray463[local57] = this.anIntArray463[local57] * local389 + 16383 - this.anIntArray464[local57] * local63 >> 14;
									this.anIntArray464[local57] = local407;
								}
								if (arg2 != 0) {
									local63 = Class94.anIntArray561[arg2];
									local389 = Class94.anIntArray560[arg2];
									local407 = this.anIntArray463[local57] * local389 + 16383 - this.anIntArray462[local57] * local63 >> 14;
									this.anIntArray462[local57] = this.anIntArray462[local57] * local389 + this.anIntArray463[local57] * local63 + 16383 >> 14;
									this.anIntArray463[local57] = local407;
								}
								if (arg3 != 0) {
									local63 = Class94.anIntArray561[arg3];
									local389 = Class94.anIntArray560[arg3];
									local407 = this.anIntArray462[local57] * local63 + local389 * this.anIntArray464[local57] + 16383 >> 14;
									this.anIntArray462[local57] = this.anIntArray462[local57] * local389 + 16383 - local63 * this.anIntArray464[local57] >> 14;
									this.anIntArray464[local57] = local407;
								}
								this.anIntArray464[local57] += Static51.anInt1124;
								this.anIntArray463[local57] += Static258.anInt4528;
								this.anIntArray462[local57] += Static130.anInt9950;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray51.length > local41) {
							local55 = this.anIntArrayArray51[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray110 == null || (this.aShortArray110[local63] & arg6) != 0) {
									local389 = this.anIntArray461[local63];
									local407 = this.anIntArray461[local63 + 1];
									for (local636 = local389; local636 < local407; local636++) {
										local645 = this.aShortArray107[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local657 = Class94.anIntArray561[arg4];
											local661 = Class94.anIntArray560[arg4];
											local679 = this.aShortArray113[local645] * local661 + this.aShortArray116[local645] * local657 + 16383 >> 14;
											this.aShortArray116[local645] = (short) (this.aShortArray116[local645] * local661 + 16383 - this.aShortArray113[local645] * local657 >> 14);
											this.aShortArray113[local645] = (short) local679;
										}
										if (arg2 != 0) {
											local657 = Class94.anIntArray561[arg2];
											local661 = Class94.anIntArray560[arg2];
											local679 = this.aShortArray116[local645] * local661 + 16383 - local657 * this.aShortArray109[local645] >> 14;
											this.aShortArray109[local645] = (short) (this.aShortArray116[local645] * local657 + this.aShortArray109[local645] * local661 + 16383 >> 14);
											this.aShortArray116[local645] = (short) local679;
										}
										if (arg3 != 0) {
											local657 = Class94.anIntArray561[arg3];
											local661 = Class94.anIntArray560[arg3];
											local679 = local657 * this.aShortArray109[local645] + this.aShortArray113[local645] * local661 + 16383 >> 14;
											this.aShortArray109[local645] = (short) (local661 * this.aShortArray109[local645] + 16383 - local657 * this.aShortArray113[local645] >> 14);
											this.aShortArray113[local645] = (short) local679;
										}
									}
								}
							}
						}
					}
					if (this.aClass364_10 == null && this.aClass364_11 != null) {
						this.aClass364_11.anInterface21_6 = null;
					}
					if (this.aClass364_10 != null) {
						this.aClass364_10.anInterface21_6 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static676.aBoolean756) {
					local389 = Static258.anInt4528 * arg7[3] + arg7[0] * Static51.anInt1124 + arg7[6] * Static130.anInt9950 + 8192 >> 14;
					local407 = arg7[4] * Static258.anInt4528 + Static51.anInt1124 * arg7[1] + Static130.anInt9950 * arg7[7] + 8192 >> 14;
					local407 += local57;
					local389 += local252;
					local636 = arg7[8] * Static130.anInt9950 + Static258.anInt4528 * arg7[5] + Static51.anInt1124 * arg7[2] + 8192 >> 14;
					local636 += local63;
					Static258.anInt4528 = local407;
					Static51.anInt1124 = local389;
					Static130.anInt9950 = local636;
					Static676.aBoolean756 = false;
				}
				@Pc(989) int[] local989 = new int[9];
				local407 = Class94.anIntArray560[arg2];
				local636 = Class94.anIntArray561[arg2];
				local645 = Class94.anIntArray560[arg3];
				local657 = Class94.anIntArray561[arg3];
				local661 = Class94.anIntArray560[arg4];
				local679 = Class94.anIntArray561[arg4];
				local1021 = local661 * local636 + 8192 >> 14;
				local1029 = local636 * local679 + 8192 >> 14;
				local989[5] = -local636;
				local989[0] = local657 * local1029 + local645 * local661 + 8192 >> 14;
				local989[8] = local645 * local407 + 8192 >> 14;
				local989[4] = local661 * local407 + 8192 >> 14;
				local989[7] = local1021 * local645 + local679 * local657 + 8192 >> 14;
				local989[6] = local1029 * local645 + -local657 * local661 + 8192 >> 14;
				local989[1] = local679 * -local645 + local657 * local1021 + 8192 >> 14;
				local989[3] = local679 * local407 + 8192 >> 14;
				local989[2] = local657 * local407 + 8192 >> 14;
				@Pc(1158) int local1158 = -Static51.anInt1124 * local989[0] + local989[1] * -Static258.anInt4528 + local989[2] * -Static130.anInt9950 + 8192 >> 14;
				local1184 = -Static258.anInt4528 * local989[4] + -Static51.anInt1124 * local989[3] + -Static130.anInt9950 * local989[5] + 8192 >> 14;
				local1209 = -Static130.anInt9950 * local989[8] + local989[7] * -Static258.anInt4528 + local989[6] * -Static51.anInt1124 + 8192 >> 14;
				local1214 = local1158 + Static51.anInt1124;
				@Pc(1218) int local1218 = local1184 + Static258.anInt4528;
				local1223 = local1209 + Static130.anInt9950;
				@Pc(1226) int[] local1226 = new int[9];
				for (local1228 = 0; local1228 < 3; local1228++) {
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1236 = 0;
						for (local1238 = 0; local1238 < 3; local1238++) {
							local1236 += local989[local1238 + local1228 * 3] * arg7[local1232 * 3 + local1238];
						}
						local1226[local1232 + local1228 * 3] = local1236 + 8192 >> 14;
					}
				}
				local1232 = local57 * local989[1] + local252 * local989[0] + local63 * local989[2] + 8192 >> 14;
				local1236 = local989[5] * local63 + local252 * local989[3] + local989[4] * local57 + 8192 >> 14;
				local1232 += local1214;
				local1238 = local989[8] * local63 + local57 * local989[7] + local252 * local989[6] + 8192 >> 14;
				local1236 += local1218;
				local1238 += local1223;
				local1367 = new int[9];
				for (local1369 = 0; local1369 < 3; local1369++) {
					for (local1373 = 0; local1373 < 3; local1373++) {
						local1377 = 0;
						for (local1379 = 0; local1379 < 3; local1379++) {
							local1377 += arg7[local1379 + local1369 * 3] * local1226[local1373 + local1379 * 3];
						}
						local1367[local1369 * 3 + local1373] = local1377 + 8192 >> 14;
					}
				}
				local1373 = local1236 * arg7[1] + local1232 * arg7[0] + arg7[2] * local1238 + 8192 >> 14;
				local1377 = arg7[5] * local1238 + local1236 * arg7[4] + local1232 * arg7[3] + 8192 >> 14;
				local1379 = local1236 * arg7[7] + local1232 * arg7[6] + local1238 * arg7[8] + 8192 >> 14;
				local1377 += local35;
				local1373 += local29;
				local1379 += local41;
				for (local1503 = 0; local1503 < local8; local1503++) {
					@Pc(1509) int local1509 = arg1[local1503];
					if (this.anIntArrayArray51.length > local1509) {
						@Pc(1523) int[] local1523 = this.anIntArrayArray51[local1509];
						for (@Pc(1525) int local1525 = 0; local1525 < local1523.length; local1525++) {
							@Pc(1531) int local1531 = local1523[local1525];
							if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local1531]) != 0) {
								@Pc(1576) int local1576 = this.anIntArray464[local1531] * local1367[0] + this.anIntArray463[local1531] * local1367[1] + local1367[2] * this.anIntArray462[local1531] + 8192 >> 14;
								@Pc(1607) int local1607 = local1367[5] * this.anIntArray462[local1531] + local1367[4] * this.anIntArray463[local1531] + this.anIntArray464[local1531] * local1367[3] + 8192 >> 14;
								@Pc(1639) int local1639 = this.anIntArray464[local1531] * local1367[6] + this.anIntArray463[local1531] * local1367[7] + local1367[8] * this.anIntArray462[local1531] + 8192 >> 14;
								@Pc(1643) int local1643 = local1576 + local1373;
								@Pc(1647) int local1647 = local1607 + local1377;
								@Pc(1651) int local1651 = local1639 + local1379;
								this.anIntArray464[local1531] = local1643;
								this.anIntArray463[local1531] = local1647;
								this.anIntArray462[local1531] = local1651;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2568) Class354 local2568;
			@Pc(2573) Class107 local2573;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray52.length) {
							local250 = this.anIntArrayArray52[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local57 = local250[local252];
								if (this.aShortArray112 == null || (this.aShortArray112[local57] & arg6) != 0) {
									local63 = arg2 * 8 + (this.aByteArray70[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray70[local57] = (byte) local63;
									if (this.aClass364_11 != null) {
										this.aClass364_11.anInterface21_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass354Array1 != null) {
						for (local35 = 0; local35 < this.anInt8469; local35++) {
							local2568 = this.aClass354Array1[local35];
							local2573 = this.aClass107Array1[local35];
							local2573.anInt2696 = local2573.anInt2696 & 0xFFFFFF | 255 - (this.aByteArray70[local2568.anInt10126] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2825) Class107 local2825;
				if (arg0 == 8) {
					if (this.anIntArrayArray53 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray53.length > local35) {
								local250 = this.anIntArrayArray53[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2825 = this.aClass107Array1[local250[local252]];
									local2825.anInt2688 += arg3;
									local2825.anInt2695 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray53 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray53.length) {
								local250 = this.anIntArrayArray53[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2825 = this.aClass107Array1[local250[local252]];
									local2825.anInt2691 = local2825.anInt2691 * arg3 >> 7;
									local2825.anInt2689 = arg2 * local2825.anInt2689 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray53 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray53.length > local35) {
							local250 = this.anIntArrayArray53[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2825 = this.aClass107Array1[local250[local252]];
								local2825.anInt2693 = local2825.anInt2693 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray52.length) {
						local250 = this.anIntArrayArray52[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray112 == null || (this.aShortArray112[local57] & arg6) != 0) {
								local63 = this.aShortArray106[local57] & 0xFFFF;
								local389 = local63 >> 10 & 0x3F;
								local407 = local63 >> 7 & 0x7;
								local636 = local63 & 0x7F;
								local407 += arg3 / 4;
								@Pc(2678) int local2678 = arg2 + local389 & 0x3F;
								local636 += arg4;
								if (local407 < 0) {
									local407 = 0;
								} else if (local407 > 7) {
									local407 = 7;
								}
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 127) {
									local636 = 127;
								}
								this.aShortArray106[local57] = (short) (local407 << 7 | local2678 << 10 | local636);
								if (this.aClass364_11 != null) {
									this.aClass364_11.anInterface21_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass354Array1 != null) {
					for (local35 = 0; local35 < this.anInt8469; local35++) {
						local2568 = this.aClass354Array1[local35];
						local2573 = this.aClass107Array1[local35];
						local2573.anInt2696 = local2573.anInt2696 & 0xFF000000 | Static537.anIntArray457[this.aShortArray106[local2568.anInt10126] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray51.length) {
					local250 = this.anIntArrayArray51[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray110 == null || (arg6 & this.aShortArray110[local57]) != 0) {
							this.anIntArray464[local57] -= Static51.anInt1124;
							this.anIntArray463[local57] -= Static258.anInt4528;
							this.anIntArray462[local57] -= Static130.anInt9950;
							this.anIntArray464[local57] = this.anIntArray464[local57] * arg2 >> 7;
							this.anIntArray463[local57] = this.anIntArray463[local57] * arg3 >> 7;
							this.anIntArray462[local57] = this.anIntArray462[local57] * arg4 >> 7;
							this.anIntArray464[local57] += Static51.anInt1124;
							this.anIntArray463[local57] += Static258.anInt4528;
							this.anIntArray462[local57] += Static130.anInt9950;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static676.aBoolean756) {
				local389 = arg7[3] * Static258.anInt4528 + arg7[0] * Static51.anInt1124 + arg7[6] * Static130.anInt9950 + 8192 >> 14;
				local407 = arg7[4] * Static258.anInt4528 + Static51.anInt1124 * arg7[1] + Static130.anInt9950 * arg7[7] + 8192 >> 14;
				local636 = arg7[8] * Static130.anInt9950 + Static258.anInt4528 * arg7[5] + Static51.anInt1124 * arg7[2] + 8192 >> 14;
				local407 += local57;
				local389 += local252;
				Static258.anInt4528 = local407;
				Static51.anInt1124 = local389;
				local636 += local63;
				Static130.anInt9950 = local636;
				Static676.aBoolean756 = false;
			}
			local389 = arg2 << 15 >> 7;
			local407 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = -Static51.anInt1124 * local389 + 8192 >> 14;
			local657 = -Static258.anInt4528 * local407 + 8192 >> 14;
			local661 = local636 * -Static130.anInt9950 + 8192 >> 14;
			local679 = Static51.anInt1124 + local645;
			local1021 = local657 + Static258.anInt4528;
			local1029 = local661 + Static130.anInt9950;
			@Pc(1869) int[] local1869 = new int[] { local389 * arg7[0] + 8192 >> 14, local389 * arg7[3] + 8192 >> 14, arg7[6] * local389 + 8192 >> 14, arg7[1] * local407 + 8192 >> 14, arg7[4] * local407 + 8192 >> 14, local407 * arg7[7] + 8192 >> 14, arg7[2] * local636 + 8192 >> 14, local636 * arg7[5] + 8192 >> 14, arg7[8] * local636 + 8192 >> 14 };
			local1184 = local252 * local389 + 8192 >> 14;
			local1209 = local57 * local407 + 8192 >> 14;
			@Pc(1997) int local1997 = local1209 + local1021;
			@Pc(2001) int local2001 = local1184 + local679;
			local1214 = local63 * local636 + 8192 >> 14;
			@Pc(2013) int local2013 = local1214 + local1029;
			@Pc(2016) int[] local2016 = new int[9];
			@Pc(2022) int local2022;
			for (local1223 = 0; local1223 < 3; local1223++) {
				for (local2022 = 0; local2022 < 3; local2022++) {
					local1228 = 0;
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1228 += arg7[local1232 + local1223 * 3] * local1869[local1232 * 3 + local2022];
					}
					local2016[local2022 + local1223 * 3] = local1228 + 8192 >> 14;
				}
			}
			local2022 = local2001 * arg7[0] + arg7[1] * local1997 + arg7[2] * local2013 + 8192 >> 14;
			local1228 = arg7[5] * local2013 + local1997 * arg7[4] + arg7[3] * local2001 + 8192 >> 14;
			local1232 = local2001 * arg7[6] + arg7[7] * local1997 + arg7[8] * local2013 + 8192 >> 14;
			local1228 += local35;
			local2022 += local29;
			local1232 += local41;
			for (local1236 = 0; local1236 < local8; local1236++) {
				local1238 = arg1[local1236];
				if (this.anIntArrayArray51.length > local1238) {
					local1367 = this.anIntArrayArray51[local1238];
					for (local1369 = 0; local1369 < local1367.length; local1369++) {
						local1373 = local1367[local1369];
						if (this.aShortArray110 == null || (this.aShortArray110[local1373] & arg6) != 0) {
							local1377 = local2016[2] * this.anIntArray462[local1373] + local2016[1] * this.anIntArray463[local1373] + local2016[0] * this.anIntArray464[local1373] + 8192 >> 14;
							local1379 = this.anIntArray462[local1373] * local2016[5] + local2016[4] * this.anIntArray463[local1373] + this.anIntArray464[local1373] * local2016[3] + 8192 >> 14;
							@Pc(2257) int local2257 = local1377 + local2022;
							local1503 = local2016[8] * this.anIntArray462[local1373] + this.anIntArray464[local1373] * local2016[6] + this.anIntArray463[local1373] * local2016[7] + 8192 >> 14;
							@Pc(2293) int local2293 = local1379 + local1228;
							this.anIntArray464[local1373] = local2257;
							@Pc(2302) int local2302 = local1503 + local1232;
							this.anIntArray463[local1373] = local2293;
							this.anIntArray462[local1373] = local2302;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8410; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray463[local15] - local9 * this.anIntArray462[local15] >> 14;
			this.anIntArray462[local15] = this.anIntArray462[local15] * local13 + this.anIntArray463[local15] * local9 >> 14;
			this.anIntArray463[local15] = local34;
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
	private void method6949() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt8410; local23++) {
			@Pc(30) int local30 = this.anIntArray464[local23];
			@Pc(35) int local35 = this.anIntArray463[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			@Pc(76) int local76 = this.anIntArray462[local23];
			if (local76 > local17) {
				local17 = local76;
			}
			if (local76 < local11) {
				local11 = local76;
			}
			@Pc(102) int local102 = local76 * local76 + local30 * local30;
			if (local102 > local19) {
				local19 = local102;
			}
			local102 = local35 * local35 + local76 * local76 + local30 * local30;
			if (local21 < local102) {
				local21 = local102;
			}
		}
		this.lb = (short) local7;
		this.aShort85 = (short) local13;
		this.aShort81 = (short) local9;
		this.aShort83 = (short) local17;
		this.aShort88 = (short) local11;
		this.aShort87 = (short) local15;
		this.aShort82 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort89 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean585 = true;
	}

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "(I)V")
	private void method6950() {
		if (!this.aBoolean584) {
			return;
		}
		this.aBoolean584 = false;
		if (this.aClass373Array4 == null && this.aClass305Array4 == null && this.aClass354Array1 == null) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray464 != null && !Static359.method5204(this.anInt8421, this.anInt8470)) {
				if (this.aClass364_13 != null && this.aClass364_13.anInterface21_6 == null) {
					this.aBoolean584 = true;
				} else {
					if (!this.aBoolean585) {
						this.method6949();
					}
					local23 = true;
				}
			}
			if (this.anIntArray463 != null && !Static412.method5625(this.anInt8470, this.anInt8421)) {
				if (this.aClass364_13 != null && this.aClass364_13.anInterface21_6 == null) {
					this.aBoolean584 = true;
				} else {
					if (!this.aBoolean585) {
						this.method6949();
					}
					local25 = true;
				}
			}
			if (this.anIntArray462 != null && !Static513.method6708(this.anInt8470, this.anInt8421)) {
				if (this.aClass364_13 != null && this.aClass364_13.anInterface21_6 == null) {
					this.aBoolean584 = true;
				} else {
					local27 = true;
					if (!this.aBoolean585) {
						this.method6949();
					}
				}
			}
			if (local23) {
				this.anIntArray464 = null;
			}
			if (local27) {
				this.anIntArray462 = null;
			}
			if (local25) {
				this.anIntArray463 = null;
			}
		}
		if (this.aShortArray107 != null && this.anIntArray464 == null && this.anIntArray463 == null && this.anIntArray462 == null) {
			this.anIntArray461 = null;
			this.aShortArray107 = null;
		}
		if (this.aByteArray71 != null && !Static674.method8989(this.anInt8421, this.anInt8470)) {
			if (this.aClass364_10 == null) {
				if (this.aClass364_11 != null && this.aClass364_11.anInterface21_6 == null) {
					this.aBoolean584 = true;
				} else {
					this.aShortArray113 = this.aShortArray116 = this.aShortArray109 = null;
					this.aByteArray71 = null;
				}
			} else if (this.aClass364_10.anInterface21_6 == null) {
				this.aBoolean584 = true;
			} else {
				this.aShortArray113 = this.aShortArray116 = this.aShortArray109 = null;
				this.aByteArray71 = null;
			}
		}
		if (this.aShortArray106 != null && !Static577.method7588(this.anInt8421, this.anInt8470)) {
			if (this.aClass364_11 != null && this.aClass364_11.anInterface21_6 == null) {
				this.aBoolean584 = true;
			} else {
				this.aShortArray106 = null;
			}
		}
		if (this.aByteArray70 != null && !Static206.method3083(this.anInt8470, this.anInt8421)) {
			if (this.aClass364_11 != null && this.aClass364_11.anInterface21_6 == null) {
				this.aBoolean584 = true;
			} else {
				this.aByteArray70 = null;
			}
		}
		if (this.aFloatArray44 != null && !Static263.method1780(this.anInt8421, this.anInt8470)) {
			if (this.aClass364_12 != null && this.aClass364_12.anInterface21_6 == null) {
				this.aBoolean584 = true;
			} else {
				this.aFloatArray44 = this.aFloatArray45 = null;
			}
		}
		if (this.aShortArray114 != null && !Static315.method4527(this.anInt8421, this.anInt8470)) {
			if (this.aClass364_11 != null && this.aClass364_11.anInterface21_6 == null) {
				this.aBoolean584 = true;
			} else {
				this.aShortArray114 = null;
			}
		}
		if (this.aShortArray115 != null && !Static452.method6106(this.anInt8421, this.anInt8470)) {
			if ((this.aClass238_1 == null || this.aClass238_1.anInterface27_2 != null) && (this.aClass364_11 == null || this.aClass364_11.anInterface21_6 != null)) {
				this.aShortArray115 = this.aShortArray108 = this.aShortArray111 = null;
			} else {
				this.aBoolean584 = true;
			}
		}
		if (this.anIntArrayArray52 != null && !Static210.method3125(this.anInt8421, this.anInt8470)) {
			this.aShortArray112 = null;
			this.anIntArrayArray52 = null;
		}
		if (this.anIntArrayArray51 != null && !Static349.method5062(this.anInt8421, this.anInt8470)) {
			this.aShortArray110 = null;
			this.anIntArrayArray51 = null;
		}
		if (this.anIntArrayArray53 != null && !Static277.method4053(this.anInt8470, this.anInt8421)) {
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArray460 != null && (this.anInt8421 & 0x800) == 0 && (this.anInt8421 & 0x40000) == 0) {
			this.anIntArray460 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!al;ZII)Z")
	@Override
	public boolean method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6954(arg5, arg0, arg4, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8453; local7++) {
			this.anIntArray464[local7] = this.anIntArray464[local7] + 7 >> 4;
			this.anIntArray463[local7] = this.anIntArray463[local7] + 7 >> 4;
			this.anIntArray462[local7] = this.anIntArray462[local7] + 7 >> 4;
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass95_Sub3_36.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8466; local11++) {
			if (arg0 == this.aShortArray114[local11]) {
				this.aShortArray114[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class250 local48 = local9.method8330(arg0 & 0xFFFF);
			local37 = local48.aByte94;
			local35 = local48.aByte96;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class250 local69 = local9.method8330(arg1 & 0xFFFF);
			if (local69.aByte95 != 0 || local69.aByte92 != 0) {
				this.aBoolean586 = true;
			}
			local56 = local69.aByte96;
			local58 = local69.aByte94;
		}
		if (!(local37 != local58 | local56 != local35)) {
			return;
		}
		if (this.aClass354Array1 != null) {
			for (@Pc(114) int local114 = 0; local114 < this.anInt8469; local114++) {
				@Pc(121) Class354 local121 = this.aClass354Array1[local114];
				@Pc(126) Class107 local126 = this.aClass107Array1[local114];
				local126.anInt2696 = local126.anInt2696 & 0xFF000000 | Static537.anIntArray457[this.aShortArray106[local121.anInt10126] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIISI)I")
	private int method6952(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static537.anIntArray457[Static410.method5614(arg1, arg3)];
		if (arg2 != -1) {
			@Pc(31) Class250 local31 = this.aClass95_Sub3_36.anInterface2_12.method8330(arg2 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte96 & 0xFF;
			@Pc(45) int local45;
			@Pc(72) int local72;
			if (local36 != 0) {
				if (arg3 < 0) {
					local45 = 0;
				} else if (arg3 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg3 * 131586;
				}
				if (local36 == 256) {
					local17 = local45;
				} else {
					local72 = 256 - local36;
					local17 = (local72 * (local17 & 0xFF00FF) + (local45 & 0xFF00FF) * local36 & 0xFF00FF00) + (local36 * (local45 & 0xFF00) + (local17 & 0xFF00) * local72 & 0xFF0000) >> 8;
				}
			}
			local45 = local31.aByte94 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(126) int local126 = (local17 >> 16 & 0xFF) * local45;
				if (local126 > 65535) {
					local126 = 65535;
				}
				local72 = local45 * (local17 >> 8 & 0xFF);
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(154) int local154 = local45 * (local17 & 0xFF);
				if (local154 > 65535) {
					local154 = 65535;
				}
				local17 = ((local126 & 0xFF00) << 8) + ((local72 & 0xFF00) + (local154 >> 8));
			}
		}
		return (local17 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8410; local3++) {
			this.anIntArray462[local3] = -this.anIntArray462[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt8456; local25++) {
			this.aShortArray109[local25] = (short) -this.aShortArray109[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt8466; local48++) {
			@Pc(55) short local55 = this.aShortArray115[local48];
			this.aShortArray115[local48] = this.aShortArray111[local48];
			this.aShortArray111[local48] = local55;
		}
		if (this.aClass364_10 == null && this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
		if (this.aClass364_10 != null) {
			this.aClass364_10.anInterface21_6 = null;
		}
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
		if (this.aClass238_1 != null) {
			this.aClass238_1.anInterface27_2 = null;
		}
		this.aBoolean585 = false;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method8848(@OriginalArg(0) Class17 arg0) {
		@Pc(8) Class17_Sub3 local8 = (Class17_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass373Array4 != null) {
			for (local13 = 0; local13 < this.aClass373Array4.length; local13++) {
				@Pc(20) Class373 local20 = this.aClass373Array4[local13];
				@Pc(22) Class373 local22 = local20;
				if (local20.aClass373_2 != null) {
					local22 = local20.aClass373_2;
				}
				local22.anInt10560 = (int) (local8.aFloat147 + local8.aFloat143 * (float) this.anIntArray462[local20.anInt10557] + local8.aFloat146 * (float) this.anIntArray463[local20.anInt10557] + local8.aFloat145 * (float) this.anIntArray464[local20.anInt10557]);
				local22.anInt10545 = (int) (local8.aFloat144 + local8.aFloat141 * (float) this.anIntArray464[local20.anInt10557] + local8.aFloat140 * (float) this.anIntArray463[local20.anInt10557] + (float) this.anIntArray462[local20.anInt10557] * local8.aFloat142);
				local22.anInt10547 = (int) (local8.aFloat148 * (float) this.anIntArray464[local20.anInt10557] + local8.aFloat151 * (float) this.anIntArray463[local20.anInt10557] + local8.aFloat149 * (float) this.anIntArray462[local20.anInt10557] + local8.aFloat150);
				local22.anInt10551 = (int) ((float) this.anIntArray463[local20.anInt10559] * local8.aFloat146 + (float) this.anIntArray464[local20.anInt10559] * local8.aFloat145 + local8.aFloat143 * (float) this.anIntArray462[local20.anInt10559] + local8.aFloat147);
				local22.anInt10561 = (int) (local8.aFloat141 * (float) this.anIntArray464[local20.anInt10559] + (float) this.anIntArray463[local20.anInt10559] * local8.aFloat140 + (float) this.anIntArray462[local20.anInt10559] * local8.aFloat142 + local8.aFloat144);
				local22.anInt10550 = (int) (local8.aFloat150 + (float) this.anIntArray464[local20.anInt10559] * local8.aFloat148 + local8.aFloat151 * (float) this.anIntArray463[local20.anInt10559] + local8.aFloat149 * (float) this.anIntArray462[local20.anInt10559]);
				local22.anInt10563 = (int) (local8.aFloat146 * (float) this.anIntArray463[local20.anInt10548] + local8.aFloat145 * (float) this.anIntArray464[local20.anInt10548] + local8.aFloat143 * (float) this.anIntArray462[local20.anInt10548] + local8.aFloat147);
				local22.anInt10554 = (int) (local8.aFloat140 * (float) this.anIntArray463[local20.anInt10548] + (float) this.anIntArray464[local20.anInt10548] * local8.aFloat141 + (float) this.anIntArray462[local20.anInt10548] * local8.aFloat142 + local8.aFloat144);
				local22.anInt10546 = (int) (local8.aFloat150 + (float) this.anIntArray462[local20.anInt10548] * local8.aFloat149 + (float) this.anIntArray463[local20.anInt10548] * local8.aFloat151 + local8.aFloat148 * (float) this.anIntArray464[local20.anInt10548]);
			}
		}
		if (this.aClass305Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass305Array4.length; local13++) {
			@Pc(361) Class305 local361 = this.aClass305Array4[local13];
			@Pc(363) Class305 local363 = local361;
			if (local361.aClass305_1 != null) {
				local363 = local361.aClass305_1;
			}
			if (local361.aClass17_7 == null) {
				local361.aClass17_7 = local8.method6230();
			} else {
				local361.aClass17_7.method6233(local8);
			}
			local363.anInt8120 = (int) (local8.aFloat146 * (float) this.anIntArray463[local361.anInt8121] + local8.aFloat145 * (float) this.anIntArray464[local361.anInt8121] + local8.aFloat143 * (float) this.anIntArray462[local361.anInt8121] + local8.aFloat147);
			local363.anInt8115 = (int) (local8.aFloat140 * (float) this.anIntArray463[local361.anInt8121] + local8.aFloat141 * (float) this.anIntArray464[local361.anInt8121] + (float) this.anIntArray462[local361.anInt8121] * local8.aFloat142 + local8.aFloat144);
			local363.anInt8114 = (int) (local8.aFloat150 + local8.aFloat149 * (float) this.anIntArray462[local361.anInt8121] + (float) this.anIntArray463[local361.anInt8121] * local8.aFloat151 + local8.aFloat148 * (float) this.anIntArray464[local361.anInt8121]);
		}
	}

	@OriginalMember(owner = "client!sca", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "()[Lclient!rea;")
	@Override
	public Class305[] method8861() {
		return this.aClass305Array4;
	}

	@OriginalMember(owner = "client!sca", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean583;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "()V")
	@Override
	protected void method8849() {
	}

	@OriginalMember(owner = "client!sca", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8410; local3++) {
			if (arg0 != 0) {
				this.anIntArray464[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray463[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray462[local3] += arg2;
			}
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static258.anInt4528 = 0;
			Static51.anInt1124 = 0;
			Static130.anInt9950 = 0;
			for (local17 = 0; local17 < this.anInt8410; local17++) {
				Static51.anInt1124 += this.anIntArray464[local17];
				Static258.anInt4528 += this.anIntArray463[local17];
				Static130.anInt9950 += this.anIntArray462[local17];
				local9++;
			}
			if (local9 > 0) {
				Static51.anInt1124 = Static51.anInt1124 / local9 + arg1;
				Static130.anInt9950 = arg3 + Static130.anInt9950 / local9;
				Static258.anInt4528 = arg2 + Static258.anInt4528 / local9;
			} else {
				Static51.anInt1124 = arg1;
				Static130.anInt9950 = arg3;
				Static258.anInt4528 = arg2;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt8410; local9++) {
				this.anIntArray464[local9] += arg1;
				this.anIntArray463[local9] += arg2;
				this.anIntArray462[local9] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt8410; local9++) {
					this.anIntArray464[local9] -= Static51.anInt1124;
					this.anIntArray463[local9] -= Static258.anInt4528;
					this.anIntArray462[local9] -= Static130.anInt9950;
					if (arg3 != 0) {
						local17 = Class94.anIntArray561[arg3];
						local161 = Class94.anIntArray560[arg3];
						local180 = this.anIntArray463[local9] * local17 + local161 * this.anIntArray464[local9] + 16383 >> 14;
						this.anIntArray463[local9] = local161 * this.anIntArray463[local9] + 16383 - local17 * this.anIntArray464[local9] >> 14;
						this.anIntArray464[local9] = local180;
					}
					if (arg1 != 0) {
						local17 = Class94.anIntArray561[arg1];
						local161 = Class94.anIntArray560[arg1];
						local180 = this.anIntArray463[local9] * local161 + 16383 - this.anIntArray462[local9] * local17 >> 14;
						this.anIntArray462[local9] = this.anIntArray462[local9] * local161 + this.anIntArray463[local9] * local17 + 16383 >> 14;
						this.anIntArray463[local9] = local180;
					}
					if (arg2 != 0) {
						local17 = Class94.anIntArray561[arg2];
						local161 = Class94.anIntArray560[arg2];
						local180 = this.anIntArray462[local9] * local17 + this.anIntArray464[local9] * local161 + 16383 >> 14;
						this.anIntArray462[local9] = this.anIntArray462[local9] * local161 + 16383 - local17 * this.anIntArray464[local9] >> 14;
						this.anIntArray464[local9] = local180;
					}
					this.anIntArray464[local9] += Static51.anInt1124;
					this.anIntArray463[local9] += Static258.anInt4528;
					this.anIntArray462[local9] += Static130.anInt9950;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt8410; local9++) {
					this.anIntArray464[local9] -= Static51.anInt1124;
					this.anIntArray463[local9] -= Static258.anInt4528;
					this.anIntArray462[local9] -= Static130.anInt9950;
					this.anIntArray464[local9] = this.anIntArray464[local9] * arg1 / 128;
					this.anIntArray463[local9] = this.anIntArray463[local9] * arg2 / 128;
					this.anIntArray462[local9] = this.anIntArray462[local9] * arg3 / 128;
					this.anIntArray464[local9] += Static51.anInt1124;
					this.anIntArray463[local9] += Static258.anInt4528;
					this.anIntArray462[local9] += Static130.anInt9950;
				}
			} else {
				@Pc(517) Class354 local517;
				@Pc(522) Class107 local522;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt8466; local9++) {
						local17 = arg1 * 8 + (this.aByteArray70[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray70[local9] = (byte) local17;
					}
					if (this.aClass364_11 != null) {
						this.aClass364_11.anInterface21_6 = null;
					}
					if (this.aClass354Array1 != null) {
						for (local17 = 0; local17 < this.anInt8469; local17++) {
							local517 = this.aClass354Array1[local17];
							local522 = this.aClass107Array1[local17];
							local522.anInt2696 = local522.anInt2696 & 0xFFFFFF | 255 - (this.aByteArray70[local517.anInt10126] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt8466; local9++) {
						local17 = this.aShortArray106[local9] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						local180 += arg2 / 4;
						@Pc(586) int local586 = local161 + arg1 & 0x3F;
						@Pc(590) int local590 = local17 & 0x7F;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						local590 += arg3;
						if (local590 < 0) {
							local590 = 0;
						} else if (local590 > 127) {
							local590 = 127;
						}
						this.aShortArray106[local9] = (short) (local586 << 10 | local180 << 7 | local590);
					}
					if (this.aClass364_11 != null) {
						this.aClass364_11.anInterface21_6 = null;
					}
					if (this.aClass354Array1 != null) {
						for (local17 = 0; local17 < this.anInt8469; local17++) {
							local517 = this.aClass354Array1[local17];
							local522 = this.aClass107Array1[local17];
							local522.anInt2696 = local522.anInt2696 & 0xFF000000 | Static537.anIntArray457[this.aShortArray106[local517.anInt10126] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(704) Class107 local704;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt8469; local9++) {
							local704 = this.aClass107Array1[local9];
							local704.anInt2688 += arg2;
							local704.anInt2695 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt8469; local9++) {
							local704 = this.aClass107Array1[local9];
							local704.anInt2689 = local704.anInt2689 * arg1 >> 7;
							local704.anInt2691 = local704.anInt2691 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt8469; local9++) {
							local704 = this.aClass107Array1[local9];
							local704.anInt2693 = arg1 + local704.anInt2693 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!al;ZI)Z")
	@Override
	public boolean method8866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6954(-1, arg0, arg4, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean586;
	}

	@OriginalMember(owner = "client!sca", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!sca", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt8421 = arg0;
		if (this.aClass181_1 != null && (this.anInt8421 & 0x10000) == 0) {
			this.aByteArray71 = this.aClass181_1.aByteArray41;
			this.aShortArray113 = this.aClass181_1.aShortArray63;
			this.aShortArray109 = this.aClass181_1.aShortArray62;
			this.aShortArray116 = this.aClass181_1.aShortArray61;
			this.aClass181_1 = null;
		}
		this.aBoolean584 = true;
		this.method6950();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8871(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static51.anInt1124 = 0;
			Static258.anInt4528 = 0;
			Static130.anInt9950 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray51.length) {
					local48 = this.anIntArrayArray51[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static51.anInt1124 += this.anIntArray464[local56];
						Static258.anInt4528 += this.anIntArray463[local56];
						local30++;
						Static130.anInt9950 += this.anIntArray462[local56];
					}
				}
			}
			if (local30 > 0) {
				Static258.anInt4528 = Static258.anInt4528 / local30 + local14;
				Static51.anInt1124 = local18 + Static51.anInt1124 / local30;
				Static130.anInt9950 = Static130.anInt9950 / local30 + local22;
			} else {
				Static51.anInt1124 = local18;
				Static130.anInt9950 = local22;
				Static258.anInt4528 = local14;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			local14 = arg3 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray51.length > local32) {
					local154 = this.anIntArrayArray51[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray464[local50] += local18;
						this.anIntArray463[local50] += local14;
						this.anIntArray462[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(280) int local280;
		@Pc(299) int local299;
		@Pc(749) int local749;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray51.length) {
					local154 = this.anIntArrayArray51[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray464[local50] -= Static51.anInt1124;
							this.anIntArray463[local50] -= Static258.anInt4528;
							this.anIntArray462[local50] -= Static130.anInt9950;
							if (arg4 != 0) {
								local56 = Class94.anIntArray561[arg4];
								local280 = Class94.anIntArray560[arg4];
								local299 = this.anIntArray464[local50] * local280 + local56 * this.anIntArray463[local50] + 16383 >> 14;
								this.anIntArray463[local50] = local280 * this.anIntArray463[local50] + 16383 - local56 * this.anIntArray464[local50] >> 14;
								this.anIntArray464[local50] = local299;
							}
							if (arg2 != 0) {
								local56 = Class94.anIntArray561[arg2];
								local280 = Class94.anIntArray560[arg2];
								local299 = this.anIntArray463[local50] * local280 + 16383 - local56 * this.anIntArray462[local50] >> 14;
								this.anIntArray462[local50] = local56 * this.anIntArray463[local50] + local280 * this.anIntArray462[local50] + 16383 >> 14;
								this.anIntArray463[local50] = local299;
							}
							if (arg3 != 0) {
								local56 = Class94.anIntArray561[arg3];
								local280 = Class94.anIntArray560[arg3];
								local299 = this.anIntArray464[local50] * local280 + local56 * this.anIntArray462[local50] + 16383 >> 14;
								this.anIntArray462[local50] = this.anIntArray462[local50] * local280 + 16383 - local56 * this.anIntArray464[local50] >> 14;
								this.anIntArray464[local50] = local299;
							}
							this.anIntArray464[local50] += Static51.anInt1124;
							this.anIntArray463[local50] += Static258.anInt4528;
							this.anIntArray462[local50] += Static130.anInt9950;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray464[local50] -= Static51.anInt1124;
							this.anIntArray463[local50] -= Static258.anInt4528;
							this.anIntArray462[local50] -= Static130.anInt9950;
							if (arg2 != 0) {
								local56 = Class94.anIntArray561[arg2];
								local280 = Class94.anIntArray560[arg2];
								local299 = this.anIntArray463[local50] * local280 + 16383 - this.anIntArray462[local50] * local56 >> 14;
								this.anIntArray462[local50] = this.anIntArray463[local50] * local56 + this.anIntArray462[local50] * local280 + 16383 >> 14;
								this.anIntArray463[local50] = local299;
							}
							if (arg4 != 0) {
								local56 = Class94.anIntArray561[arg4];
								local280 = Class94.anIntArray560[arg4];
								local299 = this.anIntArray463[local50] * local56 + local280 * this.anIntArray464[local50] + 16383 >> 14;
								this.anIntArray463[local50] = this.anIntArray463[local50] * local280 + 16383 - local56 * this.anIntArray464[local50] >> 14;
								this.anIntArray464[local50] = local299;
							}
							if (arg3 != 0) {
								local56 = Class94.anIntArray561[arg3];
								local280 = Class94.anIntArray560[arg3];
								local299 = local280 * this.anIntArray464[local50] + this.anIntArray462[local50] * local56 + 16383 >> 14;
								this.anIntArray462[local50] = this.anIntArray462[local50] * local280 + 16383 - local56 * this.anIntArray464[local50] >> 14;
								this.anIntArray464[local50] = local299;
							}
							this.anIntArray464[local50] += Static51.anInt1124;
							this.anIntArray463[local50] += Static258.anInt4528;
							this.anIntArray462[local50] += Static130.anInt9950;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray51.length > local38) {
						local48 = this.anIntArrayArray51[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local280 = this.anIntArray461[local56];
							local299 = this.anIntArray461[local56 + 1];
							for (local749 = local280; local749 < local299; local749++) {
								@Pc(758) int local758 = this.aShortArray107[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local771 = Class94.anIntArray561[arg4];
									local775 = Class94.anIntArray560[arg4];
									local793 = this.aShortArray113[local758] * local775 + this.aShortArray116[local758] * local771 + 16383 >> 14;
									this.aShortArray116[local758] = (short) (local775 * this.aShortArray116[local758] + 16383 - this.aShortArray113[local758] * local771 >> 14);
									this.aShortArray113[local758] = (short) local793;
								}
								if (arg2 != 0) {
									local771 = Class94.anIntArray561[arg2];
									local775 = Class94.anIntArray560[arg2];
									local793 = this.aShortArray116[local758] * local775 + 16383 - local771 * this.aShortArray109[local758] >> 14;
									this.aShortArray109[local758] = (short) (this.aShortArray116[local758] * local771 + this.aShortArray109[local758] * local775 + 16383 >> 14);
									this.aShortArray116[local758] = (short) local793;
								}
								if (arg3 != 0) {
									local771 = Class94.anIntArray561[arg3];
									local775 = Class94.anIntArray560[arg3];
									local793 = local771 * this.aShortArray109[local758] + local775 * this.aShortArray113[local758] + 16383 >> 14;
									this.aShortArray109[local758] = (short) (this.aShortArray109[local758] * local775 + 16383 - local771 * this.aShortArray113[local758] >> 14);
									this.aShortArray113[local758] = (short) local793;
								}
							}
						}
					}
				}
				if (this.aClass364_10 == null && this.aClass364_11 != null) {
					this.aClass364_11.anInterface21_6 = null;
				}
				if (this.aClass364_10 != null) {
					this.aClass364_10.anInterface21_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray51.length > local32) {
					local154 = this.anIntArrayArray51[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray464[local50] -= Static51.anInt1124;
						this.anIntArray463[local50] -= Static258.anInt4528;
						this.anIntArray462[local50] -= Static130.anInt9950;
						this.anIntArray464[local50] = arg2 * this.anIntArray464[local50] >> 7;
						this.anIntArray463[local50] = this.anIntArray463[local50] * arg3 >> 7;
						this.anIntArray462[local50] = this.anIntArray462[local50] * arg4 >> 7;
						this.anIntArray464[local50] += Static51.anInt1124;
						this.anIntArray463[local50] += Static258.anInt4528;
						this.anIntArray462[local50] += Static130.anInt9950;
					}
				}
			}
		} else {
			@Pc(1212) Class354 local1212;
			@Pc(1217) Class107 local1217;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray52.length > local32) {
							local154 = this.anIntArrayArray52[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local50 = local154[local156];
								local56 = arg2 * 8 + (this.aByteArray70[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray70[local50] = (byte) local56;
							}
							if (local154.length > 0 && this.aClass364_11 != null) {
								this.aClass364_11.anInterface21_6 = null;
							}
						}
					}
					if (this.aClass354Array1 != null) {
						for (local32 = 0; local32 < this.anInt8469; local32++) {
							local1212 = this.aClass354Array1[local32];
							local1217 = this.aClass107Array1[local32];
							local1217.anInt2696 = local1217.anInt2696 & 0xFFFFFF | 255 - (this.aByteArray70[local1212.anInt10126] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1460) Class107 local1460;
				if (arg0 == 8) {
					if (this.anIntArrayArray53 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray53.length) {
								local154 = this.anIntArrayArray53[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1460 = this.aClass107Array1[local154[local156]];
									local1460.anInt2695 += arg2;
									local1460.anInt2688 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray53 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray53.length) {
								local154 = this.anIntArrayArray53[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1460 = this.aClass107Array1[local154[local156]];
									local1460.anInt2689 = arg2 * local1460.anInt2689 >> 7;
									local1460.anInt2691 = arg3 * local1460.anInt2691 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray53 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray53.length) {
							local154 = this.anIntArrayArray53[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1460 = this.aClass107Array1[local154[local156]];
								local1460.anInt2693 = local1460.anInt2693 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray52.length > local32) {
						local154 = this.anIntArrayArray52[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							local56 = this.aShortArray106[local50] & 0xFFFF;
							local280 = local56 >> 10 & 0x3F;
							local299 = local56 >> 7 & 0x7;
							@Pc(1304) int local1304 = local280 + arg2 & 0x3F;
							local299 += arg3 / 4;
							local749 = local56 & 0x7F;
							local749 += arg4;
							if (local299 < 0) {
								local299 = 0;
							} else if (local299 > 7) {
								local299 = 7;
							}
							if (local749 < 0) {
								local749 = 0;
							} else if (local749 > 127) {
								local749 = 127;
							}
							this.aShortArray106[local50] = (short) (local1304 << 10 | local299 << 7 | local749);
						}
						if (local154.length > 0 && this.aClass364_11 != null) {
							this.aClass364_11.anInterface21_6 = null;
						}
					}
				}
				if (this.aClass354Array1 != null) {
					for (local32 = 0; local32 < this.anInt8469; local32++) {
						local1212 = this.aClass354Array1[local32];
						local1217 = this.aClass107Array1[local32];
						local1217.anInt2696 = local1217.anInt2696 & 0xFF000000 | Static537.anIntArray457[this.aShortArray106[local1212.anInt10126] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIBIZLclient!al;I)Z")
	private boolean method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class17 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class17_Sub3 local8 = (Class17_Sub3) arg4;
		@Pc(12) Class17_Sub3 local12 = this.aClass95_Sub3_36.aClass17_Sub3_3;
		@Pc(33) float local33 = local8.aFloat144 * local12.aFloat146 + local12.aFloat145 * local8.aFloat147 + local8.aFloat150 * local12.aFloat143 + local12.aFloat147;
		@Pc(54) float local54 = local12.aFloat140 * local8.aFloat144 + local12.aFloat141 * local8.aFloat147 + local8.aFloat150 * local12.aFloat142 + local12.aFloat144;
		Static596.aFloat138 = local8.aFloat142 * local12.aFloat146 + local12.aFloat145 * local8.aFloat143 + local8.aFloat149 * local12.aFloat143;
		Static64.aFloat13 = local12.aFloat142 * local8.aFloat148 + local8.aFloat145 * local12.aFloat141 + local12.aFloat140 * local8.aFloat141;
		Static307.aFloat80 = local12.aFloat143 * local8.aFloat148 + local12.aFloat145 * local8.aFloat145 + local8.aFloat141 * local12.aFloat146;
		Static397.aFloat186 = local12.aFloat151 * local8.aFloat141 + local8.aFloat145 * local12.aFloat148 + local8.aFloat148 * local12.aFloat149;
		Static552.aFloat175 = local12.aFloat151 * local8.aFloat140 + local12.aFloat148 * local8.aFloat146 + local8.aFloat151 * local12.aFloat149;
		Static477.aFloat152 = local8.aFloat140 * local12.aFloat146 + local12.aFloat145 * local8.aFloat146 + local12.aFloat143 * local8.aFloat151;
		Static398.aFloat124 = local12.aFloat142 * local8.aFloat151 + local12.aFloat140 * local8.aFloat140 + local12.aFloat141 * local8.aFloat146;
		Static351.aFloat118 = local12.aFloat142 * local8.aFloat149 + local8.aFloat143 * local12.aFloat141 + local8.aFloat142 * local12.aFloat140;
		Static394.aFloat123 = local8.aFloat142 * local12.aFloat151 + local12.aFloat148 * local8.aFloat143 + local8.aFloat149 * local12.aFloat149;
		@Pc(237) float local237 = local12.aFloat150 + local8.aFloat147 * local12.aFloat148 + local12.aFloat151 * local8.aFloat144 + local8.aFloat150 * local12.aFloat149;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass95_Sub3_36.anInt5785;
		@Pc(255) int local255 = this.aClass95_Sub3_36.anInt5781;
		if (!this.aBoolean585) {
			this.method6949();
		}
		@Pc(269) int local269 = this.aShort85 - this.lb >> 1;
		@Pc(278) int local278 = this.aShort87 - this.aShort81 >> 1;
		@Pc(287) int local287 = this.aShort83 - this.aShort88 >> 1;
		@Pc(293) int local293 = this.lb + local269;
		@Pc(298) int local298 = local278 + this.aShort81;
		@Pc(303) int local303 = this.aShort88 + local287;
		@Pc(310) int local310 = local293 - (local269 << arg2);
		@Pc(317) int local317 = local298 - (local278 << arg2);
		@Pc(324) int local324 = local303 - (local287 << arg2);
		@Pc(330) int local330 = (local269 << arg2) + local293;
		@Pc(336) int local336 = local298 + (local278 << arg2);
		@Pc(342) int local342 = (local287 << arg2) + local303;
		Static129.anIntArray562[0] = local310;
		Static275.anIntArray274[0] = local317;
		Static469.anIntArray406[0] = local324;
		Static129.anIntArray562[1] = local330;
		Static275.anIntArray274[1] = local317;
		Static129.anIntArray562[2] = local310;
		Static469.anIntArray406[1] = local324;
		Static275.anIntArray274[2] = local336;
		Static469.anIntArray406[2] = local324;
		Static129.anIntArray562[3] = local330;
		Static275.anIntArray274[3] = local336;
		Static129.anIntArray562[4] = local310;
		Static469.anIntArray406[3] = local324;
		Static275.anIntArray274[4] = local317;
		Static469.anIntArray406[4] = local342;
		Static129.anIntArray562[5] = local330;
		Static275.anIntArray274[5] = local317;
		Static129.anIntArray562[6] = local310;
		Static469.anIntArray406[5] = local342;
		Static275.anIntArray274[6] = local336;
		Static129.anIntArray562[7] = local330;
		Static469.anIntArray406[6] = local342;
		Static275.anIntArray274[7] = local336;
		Static469.anIntArray406[7] = local342;
		@Pc(490) float local490;
		@Pc(504) float local504;
		@Pc(476) float local476;
		@Pc(457) float local457;
		@Pc(462) float local462;
		@Pc(452) float local452;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = (float) Static469.anIntArray406[local445];
			local457 = (float) Static129.anIntArray562[local445];
			local462 = (float) Static275.anIntArray274[local445];
			local476 = local237 + local462 * Static552.aFloat175 + Static397.aFloat186 * local457 + local452 * Static394.aFloat123;
			local490 = local457 * Static307.aFloat80 + local462 * Static477.aFloat152 + Static596.aFloat138 * local452 + local33;
			local504 = Static351.aFloat118 * local452 + local462 * Static398.aFloat124 + local457 * Static64.aFloat13 + local54;
			if (local476 >= (float) this.aClass95_Sub3_36.anInt5782) {
				if (arg0 > 0) {
					local476 = (float) arg0;
				}
				@Pc(528) float local528 = (float) local251 * local490 / local476 + (float) this.aClass95_Sub3_36.anInt5784;
				@Pc(540) float local540 = (float) this.aClass95_Sub3_36.anInt5772 + local504 * (float) local255 / local476;
				if (local528 > local243) {
					local243 = local528;
				}
				if (local241 > local528) {
					local241 = local528;
				}
				if (local540 > local247) {
					local247 = local540;
				}
				local239 = true;
				if (local540 < local245) {
					local245 = local540;
				}
			}
		}
		if (local239 && local241 < (float) arg1 && local243 > (float) arg1 && (float) arg5 > local245 && (float) arg5 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt8456 > this.aClass95_Sub3_36.anIntArray313.length) {
				this.aClass95_Sub3_36.anIntArray312 = new int[this.anInt8456];
				this.aClass95_Sub3_36.anIntArray313 = new int[this.anInt8456];
			}
			@Pc(621) int[] local621 = this.aClass95_Sub3_36.anIntArray313;
			@Pc(625) int[] local625 = this.aClass95_Sub3_36.anIntArray312;
			@Pc(717) int local717;
			for (@Pc(627) int local627 = 0; local627 < this.anInt8410; local627++) {
				local452 = (float) this.anIntArray462[local627];
				local462 = (float) this.anIntArray463[local627];
				local457 = (float) this.anIntArray464[local627];
				local504 = local54 + local462 * Static398.aFloat124 + local457 * Static64.aFloat13 + local452 * Static351.aFloat118;
				local490 = local33 + Static596.aFloat138 * local452 + Static477.aFloat152 * local462 + local457 * Static307.aFloat80;
				local476 = local237 + local462 * Static552.aFloat175 + Static397.aFloat186 * local457 + Static394.aFloat123 * local452;
				@Pc(730) int local730;
				@Pc(735) int local735;
				@Pc(742) int local742;
				if (local476 >= (float) this.aClass95_Sub3_36.anInt5782) {
					if (arg0 > 0) {
						local476 = (float) arg0;
					}
					local717 = (int) ((float) this.aClass95_Sub3_36.anInt5784 + (float) local251 * local490 / local476);
					local730 = (int) ((float) this.aClass95_Sub3_36.anInt5772 + (float) local255 * local504 / local476);
					local735 = this.anIntArray461[local627];
					local742 = this.anIntArray461[local627 + 1];
					for (@Pc(744) int local744 = local735; local744 < local742; local744++) {
						@Pc(753) int local753 = this.aShortArray107[local744] - 1;
						if (local753 == -1) {
							break;
						}
						local621[local753] = local717;
						local625[local753] = local730;
					}
				} else {
					local717 = this.anIntArray461[local627];
					local730 = this.anIntArray461[local627 + 1];
					for (local735 = local717; local735 < local730; local735++) {
						local742 = this.aShortArray107[local735] - 1;
						if (local742 == -1) {
							break;
						}
						local621[this.aShortArray107[local735] - 1] = -999999;
					}
				}
			}
			for (local717 = 0; local717 < this.anInt8466; local717++) {
				if (local621[this.aShortArray115[local717]] != -999999 && local621[this.aShortArray108[local717]] != -999999 && local621[this.aShortArray111[local717]] != -999999 && this.method6957(arg5, local625[this.aShortArray111[local717]], local625[this.aShortArray108[local717]], local621[this.aShortArray115[local717]], local621[this.aShortArray111[local717]], arg1, local621[this.aShortArray108[local717]], local625[this.aShortArray115[local717]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V")
	private void method6955() {
		if (this.aClass354Array1 == null) {
			return;
		}
		@Pc(8) Class17_Sub3 local8 = this.aClass95_Sub3_36.aClass17_Sub3_2;
		this.aClass95_Sub3_36.method4889();
		this.aClass95_Sub3_36.C(!this.aBoolean583);
		this.aClass95_Sub3_36.method4908(false);
		this.aClass95_Sub3_36.method4903(this.aClass95_Sub3_36.aClass364_5, this.aClass95_Sub3_36.aClass364_6, (Class364) null, (Class364) null);
		for (@Pc(40) int local40 = 0; local40 < this.anInt8469; local40++) {
			@Pc(47) Class354 local47 = this.aClass354Array1[local40];
			@Pc(52) Class107 local52 = this.aClass107Array1[local40];
			if (!local47.aBoolean712 || !this.aClass95_Sub3_36.method8011()) {
				@Pc(80) float local80 = (float) (this.anIntArray464[local47.anInt10128] + this.anIntArray464[local47.anInt10129] + this.anIntArray464[local47.anInt10130]) * 0.3333333F;
				@Pc(102) float local102 = (float) (this.anIntArray463[local47.anInt10130] + this.anIntArray463[local47.anInt10129] + this.anIntArray463[local47.anInt10128]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray462[local47.anInt10129] + this.anIntArray462[local47.anInt10130] + this.anIntArray462[local47.anInt10128]) * 0.3333333F;
				@Pc(138) float local138 = Static116.aFloat20 + Static596.aFloat138 * local124 + Static307.aFloat80 * local80 + local102 * Static477.aFloat152;
				@Pc(152) float local152 = local124 * Static351.aFloat118 + local80 * Static64.aFloat13 + local102 * Static398.aFloat124 + Static99.aFloat19;
				@Pc(166) float local166 = Static47.aFloat10 + Static394.aFloat123 * local124 + local80 * Static397.aFloat186 + Static552.aFloat175 * local102;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local152 * local152 + local138 * local138 + local166 * local166))) * (float) local47.anInt10127;
				local8.method6249(local52.anInt2693, (float) local52.anInt2688 + local187 * local152 - local152, local187 * local166 + -local166, local52.anInt2691 * local47.aShort101 >> 7, (float) local52.anInt2695 + local138 - local187 * local138, local47.aShort102 * local52.anInt2689 >> 7);
				this.aClass95_Sub3_36.method4868(local8);
				@Pc(240) int local240 = local52.anInt2696;
				OpenGL.glColor4ub((byte) (local240 >> 16), (byte) (local240 >> 8), (byte) local240, (byte) (local240 >> 24));
				this.aClass95_Sub3_36.method4849(local47.aShort100);
				this.aClass95_Sub3_36.method4833(local47.aByte139);
				this.aClass95_Sub3_36.method4832(4);
			}
		}
		this.aClass95_Sub3_36.C(true);
		this.aClass95_Sub3_36.method4874();
	}

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean585) {
			this.method6949();
		}
		@Pc(17) int local17 = arg4 + this.lb;
		@Pc(22) int local22 = this.aShort85 + arg4;
		@Pc(27) int local27 = this.aShort88 + arg6;
		@Pc(32) int local32 = this.aShort83 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt9149 <= arg2.anInt9152 + local22 >> arg2.anInt9154 || local27 < 0 || local32 + arg2.anInt9152 >> arg2.anInt9154 >= arg2.anInt9148)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9149 <= local22 + arg3.anInt9152 >> arg3.anInt9154 || local27 < 0 || arg3.anInt9148 <= arg3.anInt9152 + local32 >> arg3.anInt9154) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9154;
			local22 = arg2.anInt9152 + local22 - 1 >> arg2.anInt9154;
			local27 >>= arg2.anInt9154;
			local32 = arg2.anInt9152 + local32 - 1 >> arg2.anInt9154;
			if (arg5 == arg2.method7461(local27, local17) && arg2.method7461(local27, local22) == arg5 && arg2.method7461(local32, local17) == arg5 && arg5 == arg2.method7461(local32, local22)) {
				return;
			}
		}
		@Pc(183) int local183;
		if (arg0 == 1) {
			for (local183 = 0; local183 < this.anInt8410; local183++) {
				this.anIntArray463[local183] = this.anIntArray463[local183] + arg2.method7452(arg4 + this.anIntArray464[local183], arg6 + this.anIntArray462[local183]) - arg5;
			}
		} else {
			@Pc(240) int local240;
			@Pc(248) int local248;
			if (arg0 == 2) {
				@Pc(456) short local456 = this.aShort81;
				if (local456 == 0) {
					return;
				}
				for (local240 = 0; local240 < this.anInt8410; local240++) {
					local248 = (this.anIntArray463[local240] << 16) / local456;
					if (local248 < arg1) {
						this.anIntArray463[local240] -= -((arg1 - local248) * (-arg5 + arg2.method7452(arg4 + this.anIntArray464[local240], this.anIntArray462[local240] - -arg6)) / arg1);
					}
				}
			} else {
				@Pc(256) int local256;
				if (arg0 == 3) {
					local183 = (arg1 & 0xFF) * 4;
					local240 = (arg1 >> 8 & 0xFF) * 4;
					local248 = (arg1 >> 16 & 0xFF) << 6;
					local256 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local183 >> 1) < 0 || arg2.anInt9149 << arg2.anInt9154 <= (local183 >> 1) + arg4 + arg2.anInt9152 || arg6 - (local240 >> 1) < 0 || arg6 + (local240 >> 1) + arg2.anInt9152 >= arg2.anInt9148 << arg2.anInt9154) {
						return;
					}
					this.method8864(arg4, local240, arg6, arg2, local248, arg5, local256, local183);
				} else if (arg0 == 4) {
					local183 = this.aShort87 - this.aShort81;
					for (local240 = 0; local240 < this.anInt8410; local240++) {
						this.anIntArray463[local240] = local183 + this.anIntArray463[local240] + arg3.method7452(arg4 + this.anIntArray464[local240], arg6 + this.anIntArray462[local240]) - arg5;
					}
				} else if (arg0 == 5) {
					local183 = this.aShort87 - this.aShort81;
					for (local240 = 0; local240 < this.anInt8410; local240++) {
						local248 = arg4 + this.anIntArray464[local240];
						local256 = arg6 + this.anIntArray462[local240];
						@Pc(360) int local360 = arg2.method7452(local248, local256);
						@Pc(366) int local366 = arg3.method7452(local248, local256);
						@Pc(374) int local374 = local360 - arg1 - local366;
						this.anIntArray463[local240] = local360 + ((this.anIntArray463[local240] << 8) / local183 * local374 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class149 method8858(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class149_Sub2 local18;
		@Pc(14) Class149_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass95_Sub3_36.aClass149_Sub2_7;
			local18 = this.aClass95_Sub3_36.aClass149_Sub2_2;
		} else if (arg0 == 2) {
			local14 = this.aClass95_Sub3_36.aClass149_Sub2_9;
			local18 = this.aClass95_Sub3_36.aClass149_Sub2_5;
		} else if (arg0 == 3) {
			local14 = this.aClass95_Sub3_36.aClass149_Sub2_3;
			local18 = this.aClass95_Sub3_36.aClass149_Sub2_10;
		} else if (arg0 == 4) {
			local14 = this.aClass95_Sub3_36.aClass149_Sub2_8;
			local18 = this.aClass95_Sub3_36.aClass149_Sub2_4;
		} else if (arg0 == 5) {
			local14 = this.aClass95_Sub3_36.aClass149_Sub2_1;
			local18 = this.aClass95_Sub3_36.aClass149_Sub2_6;
		} else {
			local18 = local14 = new Class149_Sub2(this.aClass95_Sub3_36);
		}
		return this.method6947(local18, local14, arg2, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt8421;
	}

	@OriginalMember(owner = "client!sca", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()Z")
	@Override
	public boolean method8846() {
		if (this.aShortArray114 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray114.length; local12++) {
			if (this.aShortArray114[local12] != -1 && !this.aClass95_Sub3_36.anInterface2_12.method8328(this.aShortArray114[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!kea;B)V")
	private void method6956(@OriginalArg(0) Class3_Sub5_Sub11_Sub1 arg0) {
		if (this.aClass95_Sub3_36.anIntArray313.length < this.anInt8456) {
			this.aClass95_Sub3_36.anIntArray313 = new int[this.anInt8456];
			this.aClass95_Sub3_36.anIntArray312 = new int[this.anInt8456];
		}
		@Pc(32) int[] local32 = this.aClass95_Sub3_36.anIntArray313;
		@Pc(36) int[] local36 = this.aClass95_Sub3_36.anIntArray312;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt8410; local38++) {
			local65 = (this.anIntArray464[local38] - (this.aClass95_Sub3_36.anInt5760 * this.anIntArray463[local38] >> 8) >> this.aClass95_Sub3_36.anInt5750) - arg0.anInt5116;
			@Pc(90) int local90 = (this.anIntArray462[local38] - (this.aClass95_Sub3_36.anInt5762 * this.anIntArray463[local38] >> 8) >> this.aClass95_Sub3_36.anInt5750) - arg0.anInt5112;
			@Pc(95) int local95 = this.anIntArray461[local38];
			@Pc(102) int local102 = this.anIntArray461[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray107[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt8444; local65++) {
			if (this.aByteArray70 == null || this.aByteArray70[local65] <= 128) {
				@Pc(156) short local156 = this.aShortArray115[local65];
				@Pc(161) short local161 = this.aShortArray108[local65];
				@Pc(166) short local166 = this.aShortArray111[local65];
				local104 = local32[local156];
				local113 = local32[local161];
				@Pc(178) int local178 = local32[local166];
				@Pc(182) int local182 = local36[local156];
				@Pc(186) int local186 = local36[local161];
				@Pc(190) int local190 = local36[local166];
				if ((local104 - local113) * (local186 - local190) - (local178 - local113) * (local186 - local182) > 0) {
					arg0.method4400(local182, local113, local190, local186, local104, local178);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg0 && arg2 > arg0 && arg0 < arg1) {
			return false;
		} else if (arg7 < arg0 && arg2 < arg0 && arg1 < arg0) {
			return false;
		} else if (arg5 < arg3 && arg5 < arg6 && arg4 > arg5) {
			return false;
		} else {
			return arg5 <= arg3 || arg6 >= arg5 || arg5 <= arg4;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!al;Lclient!ju;I)V")
	@Override
	public void method8857(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8456 == 0) {
			return;
		}
		@Pc(16) Class17_Sub3 local16 = this.aClass95_Sub3_36.aClass17_Sub3_3;
		@Pc(19) Class17_Sub3 local19 = (Class17_Sub3) arg0;
		if (!this.aBoolean585) {
			this.method6949();
		}
		Static552.aFloat175 = local19.aFloat151 * local16.aFloat149 + local19.aFloat146 * local16.aFloat148 + local19.aFloat140 * local16.aFloat151;
		Static47.aFloat10 = local19.aFloat150 * local16.aFloat149 + local16.aFloat151 * local19.aFloat144 + local19.aFloat147 * local16.aFloat148 + local16.aFloat150;
		@Pc(72) float local72 = Static47.aFloat10 + (float) this.aShort81 * Static552.aFloat175;
		@Pc(80) float local80 = Static552.aFloat175 * (float) this.aShort87 + Static47.aFloat10;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.aShort82 + local72;
			local97 = local80 - (float) this.aShort82;
		} else {
			local90 = local80 + (float) this.aShort82;
			local97 = (float) -this.aShort82 + local72;
		}
		if (this.aClass95_Sub3_36.aFloat90 <= local97 || local90 <= (float) this.aClass95_Sub3_36.anInt5782) {
			return;
		}
		Static116.aFloat20 = local16.aFloat145 * local19.aFloat147 + local19.aFloat144 * local16.aFloat146 + local16.aFloat143 * local19.aFloat150 + local16.aFloat147;
		Static477.aFloat152 = local16.aFloat143 * local19.aFloat151 + local16.aFloat145 * local19.aFloat146 + local16.aFloat146 * local19.aFloat140;
		@Pc(173) float local173 = (float) this.aShort81 * Static477.aFloat152 + Static116.aFloat20;
		@Pc(181) float local181 = (float) this.aShort87 * Static477.aFloat152 + Static116.aFloat20;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local181 < local173) {
			local196 = (float) this.aClass95_Sub3_36.anInt5785 * ((float) -this.aShort82 + local181);
			local207 = ((float) this.aShort82 + local173) * (float) this.aClass95_Sub3_36.anInt5785;
		} else {
			local196 = (float) this.aClass95_Sub3_36.anInt5785 * (local173 - (float) this.aShort82);
			local207 = (float) this.aClass95_Sub3_36.anInt5785 * (local181 + (float) this.aShort82);
		}
		if (local196 / local90 >= this.aClass95_Sub3_36.aFloat96 || local207 / local90 <= this.aClass95_Sub3_36.aFloat92) {
			return;
		}
		Static398.aFloat124 = local16.aFloat141 * local19.aFloat146 + local16.aFloat140 * local19.aFloat140 + local19.aFloat151 * local16.aFloat142;
		Static99.aFloat19 = local16.aFloat144 + local16.aFloat140 * local19.aFloat144 + local16.aFloat141 * local19.aFloat147 + local19.aFloat150 * local16.aFloat142;
		@Pc(297) float local297 = Static99.aFloat19 + Static398.aFloat124 * (float) this.aShort81;
		@Pc(305) float local305 = Static99.aFloat19 + (float) this.aShort87 * Static398.aFloat124;
		@Pc(331) float local331;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = ((float) this.aShort82 + local297) * (float) this.aClass95_Sub3_36.anInt5781;
			local331 = (float) this.aClass95_Sub3_36.anInt5781 * ((float) -this.aShort82 + local305);
		} else {
			local320 = (local305 + (float) this.aShort82) * (float) this.aClass95_Sub3_36.anInt5781;
			local331 = (float) this.aClass95_Sub3_36.anInt5781 * (local297 - (float) this.aShort82);
		}
		if (this.aClass95_Sub3_36.aFloat93 <= local331 / local90 || this.aClass95_Sub3_36.aFloat86 >= local320 / local90) {
			return;
		}
		if (arg1 != null || this.aClass354Array1 != null) {
			Static351.aFloat118 = local19.aFloat142 * local16.aFloat140 + local19.aFloat143 * local16.aFloat141 + local16.aFloat142 * local19.aFloat149;
			Static307.aFloat80 = local19.aFloat148 * local16.aFloat143 + local19.aFloat145 * local16.aFloat145 + local19.aFloat141 * local16.aFloat146;
			Static596.aFloat138 = local16.aFloat143 * local19.aFloat149 + local16.aFloat145 * local19.aFloat143 + local16.aFloat146 * local19.aFloat142;
			Static397.aFloat186 = local16.aFloat148 * local19.aFloat145 + local19.aFloat141 * local16.aFloat151 + local16.aFloat149 * local19.aFloat148;
			Static64.aFloat13 = local19.aFloat145 * local16.aFloat141 + local16.aFloat140 * local19.aFloat141 + local19.aFloat148 * local16.aFloat142;
			Static394.aFloat123 = local19.aFloat149 * local16.aFloat149 + local16.aFloat151 * local19.aFloat142 + local16.aFloat148 * local19.aFloat143;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort85 + this.lb >> 1;
			@Pc(509) int local509 = this.aShort83 + this.aShort88 >> 1;
			@Pc(528) int local528 = (int) ((float) local501 * Static307.aFloat80 + Static116.aFloat20 + Static477.aFloat152 * (float) this.aShort81 + Static596.aFloat138 * (float) local509);
			@Pc(547) int local547 = (int) ((float) local501 * Static64.aFloat13 + Static99.aFloat19 + Static398.aFloat124 * (float) this.aShort81 + (float) local509 * Static351.aFloat118);
			@Pc(566) int local566 = (int) ((float) local509 * Static394.aFloat123 + (float) this.aShort81 * Static552.aFloat175 + Static47.aFloat10 + Static397.aFloat186 * (float) local501);
			if (local566 >= this.aClass95_Sub3_36.anInt5782) {
				arg1.anInt4989 = this.aClass95_Sub3_36.anInt5784 + this.aClass95_Sub3_36.anInt5785 * local528 / local566;
				arg1.anInt4988 = this.aClass95_Sub3_36.anInt5772 + this.aClass95_Sub3_36.anInt5781 * local547 / local566;
			} else {
				local491 = true;
			}
			@Pc(621) int local621 = (int) ((float) local509 * Static596.aFloat138 + (float) local501 * Static307.aFloat80 + Static116.aFloat20 + Static477.aFloat152 * (float) this.aShort87);
			@Pc(640) int local640 = (int) (Static64.aFloat13 * (float) local501 + Static99.aFloat19 + (float) this.aShort87 * Static398.aFloat124 + Static351.aFloat118 * (float) local509);
			@Pc(659) int local659 = (int) ((float) local509 * Static394.aFloat123 + Static552.aFloat175 * (float) this.aShort87 + Static47.aFloat10 + Static397.aFloat186 * (float) local501);
			if (local659 >= this.aClass95_Sub3_36.anInt5782) {
				arg1.anInt4990 = this.aClass95_Sub3_36.anInt5784 + this.aClass95_Sub3_36.anInt5785 * local621 / local659;
				arg1.anInt4991 = local640 * this.aClass95_Sub3_36.anInt5781 / local659 + this.aClass95_Sub3_36.anInt5772;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass95_Sub3_36.anInt5782 > local566 && local659 < this.aClass95_Sub3_36.anInt5782) {
					local493 = false;
				} else {
					@Pc(734) int local734;
					@Pc(746) int local746;
					@Pc(772) int local772;
					if (local566 < this.aClass95_Sub3_36.anInt5782) {
						local734 = (local659 - this.aClass95_Sub3_36.anInt5782 << 16) / (local659 - local566);
						local746 = local621 + ((local621 - local528) * local734 >> 16);
						arg1.anInt4989 = this.aClass95_Sub3_36.anInt5785 * local746 / this.aClass95_Sub3_36.anInt5782 + this.aClass95_Sub3_36.anInt5784;
						local772 = local640 + ((local640 - local547) * local734 >> 16);
						arg1.anInt4988 = local772 * this.aClass95_Sub3_36.anInt5781 / this.aClass95_Sub3_36.anInt5782 + this.aClass95_Sub3_36.anInt5772;
					} else if (local659 < this.aClass95_Sub3_36.anInt5782) {
						local734 = (local566 - this.aClass95_Sub3_36.anInt5782 << 16) / (local566 - local659);
						local746 = (local734 * (local528 - local621) >> 16) + local528;
						local772 = local547 + ((local547 - local640) * local734 >> 16);
						arg1.anInt4989 = this.aClass95_Sub3_36.anInt5785 * local746 / this.aClass95_Sub3_36.anInt5782 + this.aClass95_Sub3_36.anInt5784;
						arg1.anInt4988 = this.aClass95_Sub3_36.anInt5772 + local772 * this.aClass95_Sub3_36.anInt5781 / this.aClass95_Sub3_36.anInt5782;
					}
				}
			}
			if (local493) {
				arg1.aBoolean332 = true;
				if (local659 < local566) {
					arg1.anInt4992 = this.aClass95_Sub3_36.anInt5785 * (local528 + this.aShort82) / local566 + this.aClass95_Sub3_36.anInt5784 - arg1.anInt4989;
				} else {
					arg1.anInt4992 = this.aClass95_Sub3_36.anInt5784 + (local621 + this.aShort82) * this.aClass95_Sub3_36.anInt5785 / local659 - arg1.anInt4990;
				}
			}
		}
		this.aClass95_Sub3_36.method4873();
		this.aClass95_Sub3_36.method4892(local19);
		this.method6946();
		this.aClass95_Sub3_36.method4874();
		this.method6955();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class94.anIntArray561[arg0];
		@Pc(13) int local13 = Class94.anIntArray560[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8410; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray464[local15] + local9 * this.anIntArray462[local15] >> 14;
			this.anIntArray462[local15] = this.anIntArray462[local15] * local13 - local9 * this.anIntArray464[local15] >> 14;
			this.anIntArray464[local15] = local33;
		}
		this.aBoolean585 = false;
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8410; local7++) {
			if (arg0 != 128) {
				this.anIntArray464[local7] = arg0 * this.anIntArray464[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray463[local7] = arg1 * this.anIntArray463[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray462[local7] = this.anIntArray462[local7] * arg2 >> 7;
			}
		}
		if (this.aClass364_13 != null) {
			this.aClass364_13.anInterface21_6 = null;
		}
		this.aBoolean585 = false;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!al;IZ)V")
	@Override
	public void method8852(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray110 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8410; local14++) {
			if ((arg1 & this.aShortArray110[local14]) != 0) {
				if (arg2) {
					arg0.method6232(this.anIntArray464[local14], this.anIntArray463[local14], this.anIntArray462[local14], local12);
				} else {
					arg0.method6237(this.anIntArray464[local14], this.anIntArray463[local14], this.anIntArray462[local14], local12);
				}
				this.anIntArray464[local14] = local12[0];
				this.anIntArray463[local14] = local12[1];
				this.anIntArray462[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		if (this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!sca", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort86;
	}

	@OriginalMember(owner = "client!sca", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!sca", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8466; local3++) {
			if (this.aShortArray106[local3] == arg0) {
				this.aShortArray106[local3] = arg1;
			}
		}
		if (this.aClass354Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt8469; local34++) {
				@Pc(41) Class354 local41 = this.aClass354Array1[local34];
				@Pc(46) Class107 local46 = this.aClass107Array1[local34];
				local46.anInt2696 = Static537.anIntArray457[this.aShortArray106[local41.anInt10126] & 0xFFFF] & 0xFFFFFF | local46.anInt2696 & 0xFF000000;
			}
		}
		if (this.aClass364_11 != null) {
			this.aClass364_11.anInterface21_6 = null;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZ)V")
	private void method6958(@OriginalArg(1) boolean arg0) {
		if (this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1.aByteArray90.length >= this.anInt8444 * 6) {
			this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1.anInt9739 = 0;
		} else {
			this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2(this.anInt8444 * 6 + 600);
		}
		@Pc(42) Class3_Sub4_Sub2 local42 = this.aClass95_Sub3_36.aClass3_Sub4_Sub2_1;
		@Pc(48) int local48;
		if (this.aClass95_Sub3_36.aBoolean369) {
			for (local48 = 0; local48 < this.anInt8444; local48++) {
				local42.method7956(this.aShortArray115[local48]);
				local42.method7956(this.aShortArray108[local48]);
				local42.method7956(this.aShortArray111[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt8444; local48++) {
				local42.method7942(this.aShortArray115[local48]);
				local42.method7942(this.aShortArray108[local48]);
				local42.method7942(this.aShortArray111[local48]);
			}
		}
		if (local42.anInt9739 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface27_4 == null) {
				this.anInterface27_4 = this.aClass95_Sub3_36.method4884(local42.aByteArray90, true, local42.anInt9739);
			} else {
				this.anInterface27_4.method7795(local42.anInt9739, local42.aByteArray90);
			}
			this.aClass238_1.anInterface27_2 = this.anInterface27_4;
		} else {
			this.aClass238_1.anInterface27_2 = this.aClass95_Sub3_36.method4884(local42.aByteArray90, false, local42.anInt9739);
		}
		if (!arg0) {
			this.aBoolean584 = true;
		}
	}

	@OriginalMember(owner = "client!sca", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean585) {
			this.method6949();
		}
		return this.aShort89;
	}
}
