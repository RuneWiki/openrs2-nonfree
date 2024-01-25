import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class153_Sub2 extends Class153 {

	@OriginalMember(owner = "client!to", name = "s", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "[Lclient!ld;")
	private Class209[] aClass209Array4;

	@OriginalMember(owner = "client!to", name = "O", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "[I")
	private int[] anIntArray518;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!to", name = "cb", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!to", name = "jb", descriptor = "[Lclient!mb;")
	private Class223[] aClass223Array1;

	@OriginalMember(owner = "client!to", name = "kb", descriptor = "I")
	private int anInt9442;

	@OriginalMember(owner = "client!to", name = "mb", descriptor = "B")
	private byte aByte129;

	@OriginalMember(owner = "client!to", name = "ob", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!to", name = "sb", descriptor = "Lclient!pm;")
	private Interface23 anInterface23_5;

	@OriginalMember(owner = "client!to", name = "ub", descriptor = "[Lclient!sba;")
	private Class313[] aClass313Array4;

	@OriginalMember(owner = "client!to", name = "vb", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!to", name = "wb", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!to", name = "xb", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!to", name = "Kb", descriptor = "I")
	private int anInt9455;

	@OriginalMember(owner = "client!to", name = "Mb", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!to", name = "Pb", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!to", name = "Wb", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!to", name = "Yb", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!to", name = "ac", descriptor = "I")
	private int anInt9465;

	@OriginalMember(owner = "client!to", name = "dc", descriptor = "[I")
	private int[] anIntArray520;

	@OriginalMember(owner = "client!to", name = "fc", descriptor = "[F")
	private float[] aFloatArray89;

	@OriginalMember(owner = "client!to", name = "hc", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!to", name = "ic", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!to", name = "lc", descriptor = "Lclient!qm;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!to", name = "nc", descriptor = "[F")
	private float[] aFloatArray90;

	@OriginalMember(owner = "client!to", name = "oc", descriptor = "[I")
	private int[] anIntArray521;

	@OriginalMember(owner = "client!to", name = "pc", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!to", name = "qc", descriptor = "[Lclient!dc;")
	private Class76[] aClass76Array1;

	@OriginalMember(owner = "client!to", name = "rc", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!to", name = "tc", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!to", name = "vc", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_6;

	@OriginalMember(owner = "client!to", name = "wc", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!to", name = "yc", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!to", name = "Ac", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!to", name = "Bc", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!to", name = "Hc", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!to", name = "eb", descriptor = "Z")
	private boolean aBoolean797 = false;

	@OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!to", name = "qb", descriptor = "Z")
	private boolean aBoolean798 = false;

	@OriginalMember(owner = "client!to", name = "Rb", descriptor = "Z")
	private boolean aBoolean799 = true;

	@OriginalMember(owner = "client!to", name = "Hb", descriptor = "I")
	private int anInt9452 = 0;

	@OriginalMember(owner = "client!to", name = "bc", descriptor = "I")
	private int anInt9466 = 0;

	@OriginalMember(owner = "client!to", name = "Vb", descriptor = "Z")
	private boolean aBoolean800 = false;

	@OriginalMember(owner = "client!to", name = "Zb", descriptor = "I")
	private int anInt9464 = 0;

	@OriginalMember(owner = "client!to", name = "xc", descriptor = "I")
	private int anInt9474 = 0;

	@OriginalMember(owner = "client!to", name = "uc", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_34;

	@OriginalMember(owner = "client!to", name = "zb", descriptor = "Lclient!dea;")
	private Class79 aClass79_11;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "Lclient!dea;")
	private Class79 aClass79_9;

	@OriginalMember(owner = "client!to", name = "Db", descriptor = "Lclient!dea;")
	private Class79 aClass79_12;

	@OriginalMember(owner = "client!to", name = "tb", descriptor = "Lclient!dea;")
	private Class79 aClass79_10;

	@OriginalMember(owner = "client!to", name = "Bb", descriptor = "Lclient!bja;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class153_Sub2(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_34 = arg0;
		this.aClass79_11 = new Class79((Interface17) null, 5126, 3, 0);
		this.aClass79_9 = new Class79((Interface17) null, 5126, 2, 0);
		this.aClass79_12 = new Class79((Interface17) null, 5126, 3, 0);
		this.aClass79_10 = new Class79((Interface17) null, 5121, 4, 0);
		this.aClass42_1 = new Class42();
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ck;Lclient!su;IIII)V")
	public Class153_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class329 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9465 = arg5;
		this.aClass65_Sub1_34 = arg0;
		this.anInt9455 = arg2;
		if (Static260.method4075(arg2, arg5)) {
			this.aClass79_11 = new Class79((Interface17) null, 5126, 3, 0);
		}
		if (Static646.method8667(arg5, arg2)) {
			this.aClass79_9 = new Class79((Interface17) null, 5126, 2, 0);
		}
		if (Static585.method8038(arg5, arg2)) {
			this.aClass79_12 = new Class79((Interface17) null, 5126, 3, 0);
		}
		if (Static214.method3395(arg5, arg2)) {
			this.aClass79_10 = new Class79((Interface17) null, 5121, 4, 0);
		}
		if (Static371.method5567(arg2, arg5)) {
			this.aClass42_1 = new Class42();
		}
		@Pc(108) Interface4 local108 = arg0.anInterface4_11;
		this.anIntArray520 = new int[arg1.anInt9031 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt9034];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt9034; local121++) {
			if (arg1.aByteArray90 == null || arg1.aByteArray90[local121] != 2) {
				if (arg1.aShortArray118 != null && arg1.aShortArray118[local121] != -1) {
					@Pc(154) Class136 local154 = local108.method358(arg1.aShortArray118[local121] & 0xFFFF);
					if (((this.anInt9465 & 0x40) == 0 || !local154.aBoolean315) && local154.aBoolean311) {
						continue;
					}
				}
				local119[this.anInt9474++] = local121;
				this.anIntArray520[arg1.aShortArray115[local121]]++;
				this.anIntArray520[arg1.aShortArray116[local121]]++;
				this.anIntArray520[arg1.aShortArray113[local121]]++;
			}
		}
		this.lb = this.anInt9474;
		@Pc(230) long[] local230 = new long[this.anInt9474];
		@Pc(242) boolean local242 = (this.anInt9455 & 0x100) != 0;
		@Pc(254) int local254;
		@Pc(267) int local267;
		@Pc(441) int local441;
		for (@Pc(244) int local244 = 0; local244 < this.anInt9474; local244++) {
			@Pc(250) int local250 = local119[local244];
			@Pc(252) Class136 local252 = null;
			local254 = 0;
			@Pc(256) byte local256 = 0;
			@Pc(258) byte local258 = 0;
			@Pc(260) byte local260 = 0;
			if (arg1.aClass356Array1 != null) {
				@Pc(265) boolean local265 = false;
				for (local267 = 0; local267 < arg1.aClass356Array1.length; local267++) {
					@Pc(274) Class356 local274 = arg1.aClass356Array1[local267];
					if (local250 == local274.anInt9980) {
						@Pc(283) Class353 local283 = Static580.method8010(local274.anInt9985);
						if (local283.aBoolean841) {
							local265 = true;
						}
						if (local283.anInt9931 != -1) {
							@Pc(299) Class136 local299 = local108.method358(local283.anInt9931);
							if (local299.anInt3869 == 2) {
								this.aBoolean797 = true;
							}
						}
					}
				}
				if (local265) {
					local230[local244] = Long.MAX_VALUE;
					this.lb--;
					continue;
				}
			}
			@Pc(330) short local330 = -1;
			if (arg1.aShortArray118 != null) {
				local330 = arg1.aShortArray118[local250];
				if (local330 != -1) {
					local252 = local108.method358(local330 & 0xFFFF);
					if ((this.anInt9465 & 0x40) != 0 && local252.aBoolean315) {
						local252 = null;
						local330 = -1;
					} else {
						if (local252.aByte52 != 0 || local252.aByte53 != 0) {
							this.aBoolean800 = true;
						}
						local260 = local252.aByte57;
						local258 = local252.aByte56;
					}
				}
			}
			@Pc(403) boolean local403 = arg1.aByteArray87 != null && arg1.aByteArray87[local250] != 0 || local252 != null && local252.anInt3869 != 0;
			if ((local242 || local403) && arg1.aByteArray91 != null) {
				local254 += arg1.aByteArray91[local250] << 17;
			}
			if (local403) {
				local254 += 65536;
			}
			local254 += (local258 & 0xFF) << 8;
			local441 = local256 + ((local330 & 0xFFFF) << 16);
			local254 += local260 & 0xFF;
			@Pc(453) int local453 = local441 + (local244 & 0xFFFF);
			local230[local244] = (long) local453 + ((long) local254 << 32);
			this.aBoolean800 |= local252 != null && (local252.aByte52 != 0 || local252.aByte53 != 0);
			this.aBoolean797 |= local403;
		}
		Static427.method6308(local119, local230);
		this.aShortArray134 = arg1.aShortArray110;
		this.anIntArray519 = arg1.anIntArray508;
		this.anIntArray517 = arg1.anIntArray503;
		this.anInt9466 = arg1.anInt9031;
		this.anIntArray521 = arg1.anIntArray506;
		this.anInt9464 = arg1.anInt9041;
		this.aClass209Array4 = arg1.aClass209Array3;
		this.aClass313Array4 = arg1.aClass313Array3;
		@Pc(534) Class230[] local534 = new Class230[this.anInt9466];
		@Pc(554) int local554;
		@Pc(568) int local568;
		@Pc(606) int local606;
		if (arg1.aClass356Array1 != null) {
			this.anInt9442 = arg1.aClass356Array1.length;
			this.aClass223Array1 = new Class223[this.anInt9442];
			this.aClass76Array1 = new Class76[this.anInt9442];
			for (local554 = 0; local554 < this.anInt9442; local554++) {
				@Pc(561) Class356 local561 = arg1.aClass356Array1[local554];
				@Pc(566) Class353 local566 = Static580.method8010(local561.anInt9985);
				local568 = -1;
				for (@Pc(570) int local570 = 0; local570 < this.anInt9474; local570++) {
					if (local119[local570] == local561.anInt9980) {
						local568 = local570;
						break;
					}
				}
				if (local568 == -1) {
					throw new RuntimeException();
				}
				local606 = Static336.anIntArray357[arg1.aShortArray112[local561.anInt9980] & 0xFFFF] & 0xFFFFFF;
				@Pc(623) int local623 = local606 | 255 - (arg1.aByteArray87 == null ? 0 : arg1.aByteArray87[local561.anInt9980]) << 24;
				this.aClass223Array1[local554] = new Class223(local568, arg1.aShortArray115[local561.anInt9980], arg1.aShortArray116[local561.anInt9980], arg1.aShortArray113[local561.anInt9980], local566.anInt9935, local566.anInt9939, local566.anInt9931, local566.anInt9936, local566.anInt9937, local566.aBoolean841, local566.aBoolean842, local561.anInt9979);
				this.aClass76Array1[local554] = new Class76(local623);
			}
		}
		local554 = this.anInt9474 * 3;
		this.aShort98 = (short) arg3;
		this.aShortArray126 = new short[local554];
		this.aByteArray95 = new byte[this.anInt9474];
		this.aShortArray128 = new short[local554];
		this.aShortArray125 = new short[local554];
		this.aShortArray132 = new short[this.anInt9474];
		this.aFloatArray90 = new float[local554];
		this.aByteArray94 = new byte[local554];
		this.aShortArray127 = new short[local554];
		Static213.aLongArray23 = new long[local554];
		this.aShortArray131 = new short[this.anInt9474];
		if (arg1.aShortArray114 != null) {
			this.aShortArray124 = new short[this.anInt9474];
		}
		this.aShort104 = (short) arg4;
		this.aFloatArray89 = new float[local554];
		this.aShortArray133 = new short[this.anInt9474];
		this.aShortArray129 = new short[this.anInt9474];
		this.aShortArray130 = new short[this.anInt9474];
		local254 = 0;
		for (local441 = 0; local441 < arg1.anInt9031; local441++) {
			local568 = this.anIntArray520[local441];
			this.anIntArray520[local441] = local254;
			local254 += local568;
			local534[local441] = new Class230();
		}
		this.anIntArray520[arg1.anInt9031] = local254;
		@Pc(805) Class292 local805 = Static23.method293(local119, this.anInt9474, arg1);
		@Pc(809) Class43[] local809 = new Class43[arg1.anInt9034];
		@Pc(849) int local849;
		@Pc(860) int local860;
		@Pc(881) int local881;
		@Pc(891) int local891;
		@Pc(900) int local900;
		@Pc(909) int local909;
		@Pc(828) short local828;
		@Pc(838) int local838;
		for (local606 = 0; local606 < arg1.anInt9034; local606++) {
			@Pc(818) short local818 = arg1.aShortArray115[local606];
			@Pc(823) short local823 = arg1.aShortArray116[local606];
			local828 = arg1.aShortArray113[local606];
			local838 = this.anIntArray519[local823] - this.anIntArray519[local818];
			local849 = this.anIntArray517[local823] - this.anIntArray517[local818];
			local860 = this.anIntArray521[local823] - this.anIntArray521[local818];
			@Pc(870) int local870 = this.anIntArray519[local828] - this.anIntArray519[local818];
			local881 = this.anIntArray517[local828] - this.anIntArray517[local818];
			local891 = this.anIntArray521[local828] - this.anIntArray521[local818];
			local900 = local891 * local849 - local860 * local881;
			local909 = local870 * local860 - local891 * local838;
			@Pc(918) int local918;
			for (local918 = local838 * local881 - local870 * local849; local900 > 8192 || local909 > 8192 || local918 > 8192 || local900 < -8192 || local909 < -8192 || local918 < -8192; local918 >>= 0x1) {
				local909 >>= 0x1;
				local900 >>= 0x1;
			}
			@Pc(979) int local979 = (int) Math.sqrt((double) (local900 * local900 + local909 * local909 + local918 * local918));
			if (local979 <= 0) {
				local979 = 1;
			}
			local909 = local909 * 256 / local979;
			local900 = local900 * 256 / local979;
			local918 = local918 * 256 / local979;
			@Pc(1014) byte local1014 = arg1.aByteArray90 == null ? 0 : arg1.aByteArray90[local606];
			if (local1014 == 0) {
				@Pc(1042) Class230 local1042 = local534[local818];
				local1042.anInt6726 += local918;
				local1042.anInt6727 += local900;
				local1042.anInt6725 += local909;
				local1042.anInt6723++;
				@Pc(1070) Class230 local1070 = local534[local823];
				local1070.anInt6723++;
				local1070.anInt6727 += local900;
				local1070.anInt6725 += local909;
				local1070.anInt6726 += local918;
				@Pc(1098) Class230 local1098 = local534[local828];
				local1098.anInt6725 += local909;
				local1098.anInt6723++;
				local1098.anInt6726 += local918;
				local1098.anInt6727 += local900;
			} else if (local1014 == 1) {
				@Pc(1027) Class43 local1027 = local809[local606] = new Class43();
				local1027.anInt704 = local909;
				local1027.anInt707 = local900;
				local1027.anInt706 = local918;
			}
		}
		@Pc(1135) int local1135;
		@Pc(1178) short local1178;
		for (local267 = 0; local267 < this.anInt9474; local267++) {
			local1135 = local119[local267];
			@Pc(1142) int local1142 = arg1.aShortArray112[local1135] & 0xFFFF;
			if (arg1.aByteArray86 == null) {
				local838 = -1;
			} else {
				local838 = arg1.aByteArray86[local1135];
			}
			if (arg1.aByteArray87 == null) {
				local849 = 0;
			} else {
				local849 = arg1.aByteArray87[local1135] & 0xFF;
			}
			local1178 = arg1.aShortArray118 == null ? -1 : arg1.aShortArray118[local1135];
			if (local1178 != -1 && (this.anInt9465 & 0x40) != 0) {
				@Pc(1196) Class136 local1196 = local108.method358(local1178 & 0xFFFF);
				if (local1196.aBoolean315) {
					local1178 = -1;
				}
			}
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) float local1211 = 0.0F;
			@Pc(1213) float local1213 = 0.0F;
			@Pc(1215) byte local1215 = 0;
			@Pc(1217) byte local1217 = 0;
			@Pc(1219) int local1219 = 0;
			@Pc(1235) byte local1235;
			@Pc(1252) short local1252;
			@Pc(2050) short local2050;
			@Pc(2055) short local2055;
			if (local1178 != -1) {
				if (local838 == -1) {
					local1211 = 0.0F;
					local1209 = 1.0F;
					local1213 = 0.0F;
					local1215 = 1;
					local1203 = 0.0F;
					local1205 = 1.0F;
					local1217 = 2;
					local1207 = 1.0F;
				} else {
					local838 &= 0xFF;
					local1235 = arg1.aByteArray92[local838];
					@Pc(1242) short local1242;
					@Pc(1247) short local1247;
					@Pc(1285) float local1285;
					@Pc(1512) float local1512;
					@Pc(1520) float local1520;
					@Pc(1621) float local1621;
					@Pc(1629) float local1629;
					@Pc(1637) float local1637;
					@Pc(1660) float local1660;
					@Pc(1683) float local1683;
					@Pc(1706) float local1706;
					if (local1235 == 0) {
						local1242 = arg1.aShortArray115[local1135];
						local1247 = arg1.aShortArray116[local1135];
						local1252 = arg1.aShortArray113[local1135];
						local2050 = arg1.aShortArray117[local838];
						local2055 = arg1.aShortArray111[local838];
						@Pc(2060) short local2060 = arg1.aShortArray119[local838];
						@Pc(2066) float local2066 = (float) arg1.anIntArray508[local2050];
						@Pc(2072) float local2072 = (float) arg1.anIntArray503[local2050];
						local1285 = (float) arg1.anIntArray506[local2050];
						local1512 = (float) arg1.anIntArray508[local2055] - local2066;
						local1520 = (float) arg1.anIntArray503[local2055] - local2072;
						@Pc(2105) float local2105 = (float) arg1.anIntArray506[local2055] - local1285;
						@Pc(2113) float local2113 = (float) arg1.anIntArray508[local2060] - local2066;
						@Pc(2121) float local2121 = (float) arg1.anIntArray503[local2060] - local2072;
						@Pc(2129) float local2129 = (float) arg1.anIntArray506[local2060] - local1285;
						@Pc(2138) float local2138 = (float) arg1.anIntArray508[local1242] - local2066;
						@Pc(2146) float local2146 = (float) arg1.anIntArray503[local1242] - local2072;
						@Pc(2154) float local2154 = (float) arg1.anIntArray506[local1242] - local1285;
						@Pc(2163) float local2163 = (float) arg1.anIntArray508[local1247] - local2066;
						@Pc(2172) float local2172 = (float) arg1.anIntArray503[local1247] - local2072;
						local1621 = (float) arg1.anIntArray506[local1247] - local1285;
						local1629 = (float) arg1.anIntArray508[local1252] - local2066;
						local1637 = (float) arg1.anIntArray503[local1252] - local2072;
						local1660 = (float) arg1.anIntArray506[local1252] - local1285;
						local1683 = local2129 * local1520 - local2105 * local2121;
						local1706 = local2113 * local2105 - local1512 * local2129;
						@Pc(2232) float local2232 = local1512 * local2121 - local1520 * local2113;
						@Pc(2241) float local2241 = local2232 * local2121 - local2129 * local1706;
						@Pc(2249) float local2249 = local1683 * local2129 - local2113 * local2232;
						@Pc(2257) float local2257 = local1706 * local2113 - local1683 * local2121;
						@Pc(2271) float local2271 = 1.0F / (local2241 * local1512 + local2249 * local1520 + local2105 * local2257);
						local1211 = local2271 * (local1637 * local2249 + local1629 * local2241 + local1660 * local2257);
						local1203 = local2271 * (local2138 * local2241 + local2146 * local2249 + local2257 * local2154);
						local1207 = (local2172 * local2249 + local2241 * local2163 + local2257 * local1621) * local2271;
						@Pc(2321) float local2321 = local2232 * local1520 - local2105 * local1706;
						@Pc(2329) float local2329 = local2105 * local1683 - local1512 * local2232;
						@Pc(2338) float local2338 = local1706 * local1512 - local1520 * local1683;
						@Pc(2352) float local2352 = 1.0F / (local2113 * local2321 + local2121 * local2329 + local2338 * local2129);
						local1213 = (local1660 * local2338 + local2321 * local1629 + local1637 * local2329) * local2352;
						local1205 = local2352 * (local2138 * local2321 + local2146 * local2329 + local2338 * local2154);
						local1209 = (local2163 * local2321 + local2329 * local2172 + local2338 * local1621) * local2352;
					} else {
						local1242 = arg1.aShortArray115[local1135];
						local1247 = arg1.aShortArray116[local1135];
						local1252 = arg1.aShortArray113[local1135];
						@Pc(1257) int local1257 = local805.anIntArray453[local838];
						@Pc(1262) int local1262 = local805.anIntArray454[local838];
						@Pc(1267) int local1267 = local805.anIntArray452[local838];
						@Pc(1272) float[] local1272 = local805.aFloatArrayArray9[local838];
						@Pc(1277) byte local1277 = arg1.aByteArray88[local838];
						local1285 = (float) arg1.anIntArray500[local838] / 256.0F;
						if (local1235 == 1) {
							local1512 = (float) arg1.anIntArray505[local838] / 1024.0F;
							Static296.method4760(local1277, local1272, Static269.aFloatArray38, arg1.anIntArray506[local1242], local1512, local1257, local1262, arg1.anIntArray508[local1242], local1285, local1267, arg1.anIntArray503[local1242]);
							local1205 = Static269.aFloatArray38[1];
							local1203 = Static269.aFloatArray38[0];
							Static296.method4760(local1277, local1272, Static269.aFloatArray38, arg1.anIntArray506[local1247], local1512, local1257, local1262, arg1.anIntArray508[local1247], local1285, local1267, arg1.anIntArray503[local1247]);
							local1207 = Static269.aFloatArray38[0];
							local1209 = Static269.aFloatArray38[1];
							Static296.method4760(local1277, local1272, Static269.aFloatArray38, arg1.anIntArray506[local1252], local1512, local1257, local1262, arg1.anIntArray508[local1252], local1285, local1267, arg1.anIntArray503[local1252]);
							local1213 = Static269.aFloatArray38[1];
							local1211 = Static269.aFloatArray38[0];
							local1520 = local1512 / 2.0F;
							if ((local1277 & 0x1) == 0) {
								if (local1520 < local1207 - local1203) {
									local1207 -= local1512;
									local1215 = 1;
								} else if (local1520 < local1203 - local1207) {
									local1215 = 2;
									local1207 += local1512;
								}
								if (local1520 < local1211 - local1203) {
									local1211 -= local1512;
									local1217 = 1;
								} else if (local1203 - local1211 > local1520) {
									local1211 += local1512;
									local1217 = 2;
								}
							} else {
								if (local1520 < local1213 - local1205) {
									local1213 -= local1512;
									local1217 = 1;
								} else if (local1520 < local1205 - local1213) {
									local1213 += local1512;
									local1217 = 2;
								}
								if (local1209 - local1205 > local1520) {
									local1209 -= local1512;
									local1215 = 1;
								} else if (local1205 - local1209 > local1520) {
									local1215 = 2;
									local1209 += local1512;
								}
							}
						} else if (local1235 == 2) {
							local1512 = (float) arg1.anIntArray499[local838] / 256.0F;
							local1520 = (float) arg1.anIntArray509[local838] / 256.0F;
							@Pc(1531) int local1531 = arg1.anIntArray508[local1247] - arg1.anIntArray508[local1242];
							@Pc(1542) int local1542 = arg1.anIntArray503[local1247] - arg1.anIntArray503[local1242];
							@Pc(1553) int local1553 = arg1.anIntArray506[local1247] - arg1.anIntArray506[local1242];
							@Pc(1564) int local1564 = arg1.anIntArray508[local1252] - arg1.anIntArray508[local1242];
							@Pc(1575) int local1575 = arg1.anIntArray503[local1252] - arg1.anIntArray503[local1242];
							@Pc(1586) int local1586 = arg1.anIntArray506[local1252] - arg1.anIntArray506[local1242];
							@Pc(1595) int local1595 = local1542 * local1586 - local1575 * local1553;
							@Pc(1604) int local1604 = local1553 * local1564 - local1531 * local1586;
							@Pc(1613) int local1613 = local1531 * local1575 - local1542 * local1564;
							local1621 = 64.0F / (float) arg1.anIntArray504[local838];
							local1629 = 64.0F / (float) arg1.anIntArray501[local838];
							local1637 = 64.0F / (float) arg1.anIntArray505[local838];
							local1660 = (local1272[2] * (float) local1613 + local1272[1] * (float) local1604 + local1272[0] * (float) local1595) / local1621;
							local1683 = ((float) local1613 * local1272[5] + local1272[3] * (float) local1595 + (float) local1604 * local1272[4]) / local1629;
							local1706 = ((float) local1595 * local1272[6] + (float) local1604 * local1272[7] + (float) local1613 * local1272[8]) / local1637;
							local1219 = Static426.method6301(local1660, local1683, local1706);
							Static231.method3570(local1267, local1285, local1262, arg1.anIntArray508[local1242], local1272, local1219, arg1.anIntArray503[local1242], local1277, local1520, Static269.aFloatArray38, local1257, local1512, arg1.anIntArray506[local1242]);
							local1205 = Static269.aFloatArray38[1];
							local1203 = Static269.aFloatArray38[0];
							Static231.method3570(local1267, local1285, local1262, arg1.anIntArray508[local1247], local1272, local1219, arg1.anIntArray503[local1247], local1277, local1520, Static269.aFloatArray38, local1257, local1512, arg1.anIntArray506[local1247]);
							local1207 = Static269.aFloatArray38[0];
							local1209 = Static269.aFloatArray38[1];
							Static231.method3570(local1267, local1285, local1262, arg1.anIntArray508[local1252], local1272, local1219, arg1.anIntArray503[local1252], local1277, local1520, Static269.aFloatArray38, local1257, local1512, arg1.anIntArray506[local1252]);
							local1211 = Static269.aFloatArray38[0];
							local1213 = Static269.aFloatArray38[1];
						} else if (local1235 == 3) {
							Static215.method6906(local1277, local1285, local1262, local1267, arg1.anIntArray506[local1242], Static269.aFloatArray38, arg1.anIntArray508[local1242], local1257, arg1.anIntArray503[local1242], local1272);
							local1203 = Static269.aFloatArray38[0];
							local1205 = Static269.aFloatArray38[1];
							Static215.method6906(local1277, local1285, local1262, local1267, arg1.anIntArray506[local1247], Static269.aFloatArray38, arg1.anIntArray508[local1247], local1257, arg1.anIntArray503[local1247], local1272);
							local1209 = Static269.aFloatArray38[1];
							local1207 = Static269.aFloatArray38[0];
							Static215.method6906(local1277, local1285, local1262, local1267, arg1.anIntArray506[local1252], Static269.aFloatArray38, arg1.anIntArray508[local1252], local1257, arg1.anIntArray503[local1252], local1272);
							local1213 = Static269.aFloatArray38[1];
							local1211 = Static269.aFloatArray38[0];
							if ((local1277 & 0x1) == 0) {
								if (local1211 - local1203 > 0.5F) {
									local1211--;
									local1217 = 1;
								} else if (local1203 - local1211 > 0.5F) {
									local1217 = 2;
									local1211++;
								}
								if (local1207 - local1203 > 0.5F) {
									local1207--;
									local1215 = 1;
								} else if (local1203 - local1207 > 0.5F) {
									local1215 = 2;
									local1207++;
								}
							} else {
								if (local1209 - local1205 > 0.5F) {
									local1215 = 1;
									local1209--;
								} else if (local1205 - local1209 > 0.5F) {
									local1215 = 2;
									local1209++;
								}
								if (local1213 - local1205 > 0.5F) {
									local1217 = 1;
									local1213--;
								} else if (local1205 - local1213 > 0.5F) {
									local1217 = 2;
									local1213++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray90 == null) {
				local1235 = 0;
			} else {
				local1235 = arg1.aByteArray90[local1135];
			}
			if (local1235 == 0) {
				@Pc(2576) long local2576 = (long) (local838 << 2) + ((long) (local1219 << 24) + (long) (local1142 << 8) + (long) local849 << 32);
				local1252 = arg1.aShortArray115[local1135];
				local2050 = arg1.aShortArray116[local1135];
				local2055 = arg1.aShortArray113[local1135];
				@Pc(2595) Class230 local2595 = local534[local1252];
				this.aShortArray133[local267] = this.method7972(local2595.anInt6726, local1203, local2595.anInt6725, local2595.anInt6727, local1252, arg1, local1205, local2595.anInt6723, local2576);
				@Pc(2619) Class230 local2619 = local534[local2050];
				this.aShortArray130[local267] = this.method7972(local2619.anInt6726, local1207, local2619.anInt6725, local2619.anInt6727, local2050, arg1, local1209, local2619.anInt6723, local2576 + (long) local1215);
				@Pc(2646) Class230 local2646 = local534[local2055];
				this.aShortArray131[local267] = this.method7972(local2646.anInt6726, local1211, local2646.anInt6725, local2646.anInt6727, local2055, arg1, local1213, local2646.anInt6723, (long) local1217 + local2576);
			} else if (local1235 == 1) {
				@Pc(2436) Class43 local2436 = local809[local1135];
				@Pc(2481) long local2481 = (long) ((local2436.anInt704 + 256 << 12) + ((local838 << 2) + (local2436.anInt707 <= 0 ? 2048 : 1024) + (local2436.anInt706 - -256 << 22))) + ((long) local849 + (long) (local1219 << 24) + (long) (local1142 << 8) << 32);
				this.aShortArray133[local267] = this.method7972(local2436.anInt706, local1203, local2436.anInt704, local2436.anInt707, arg1.aShortArray115[local1135], arg1, local1205, 0, local2481);
				this.aShortArray130[local267] = this.method7972(local2436.anInt706, local1207, local2436.anInt704, local2436.anInt707, arg1.aShortArray116[local1135], arg1, local1209, 0, local2481 + (long) local1215);
				this.aShortArray131[local267] = this.method7972(local2436.anInt706, local1211, local2436.anInt704, local2436.anInt707, arg1.aShortArray113[local1135], arg1, local1213, 0, (long) local1217 + local2481);
			}
			if (arg1.aByteArray87 != null) {
				this.aByteArray95[local267] = arg1.aByteArray87[local1135];
			}
			if (arg1.aShortArray114 != null) {
				this.aShortArray124[local267] = arg1.aShortArray114[local1135];
			}
			this.aShortArray129[local267] = arg1.aShortArray112[local1135];
			this.aShortArray132[local267] = local1178;
		}
		local1135 = 0;
		local828 = -10000;
		for (local838 = 0; local838 < this.lb; local838++) {
			@Pc(2722) short local2722 = this.aShortArray132[local838];
			if (local828 != local2722) {
				local828 = local2722;
				local1135++;
			}
		}
		this.anIntArray518 = new int[local1135 + 1];
		local1135 = 0;
		local828 = -10000;
		for (local849 = 0; local849 < this.lb; local849++) {
			local1178 = this.aShortArray132[local849];
			if (local1178 != local828) {
				this.anIntArray518[local1135++] = local849;
				local828 = local1178;
			}
		}
		this.anIntArray518[local1135] = this.lb;
		Static213.aLongArray23 = null;
		this.aShortArray127 = Static275.method4487(this.aShortArray127, this.anInt9452);
		this.aShortArray126 = Static275.method4487(this.aShortArray126, this.anInt9452);
		this.aShortArray128 = Static275.method4487(this.aShortArray128, this.anInt9452);
		this.aByteArray94 = Static516.method7317(this.anInt9452, this.aByteArray94);
		this.aFloatArray89 = Static74.method982(this.aFloatArray89, this.anInt9452);
		this.aFloatArray90 = Static74.method982(this.aFloatArray90, this.anInt9452);
		if (arg1.anIntArray502 != null && Static381.method9023(this.anInt9465, arg2)) {
			this.anIntArrayArray52 = arg1.method7681(false);
		}
		if (arg1.aClass356Array1 != null && Static96.method1939(this.anInt9465, arg2)) {
			this.anIntArrayArray54 = arg1.method7678();
		}
		if (arg1.anIntArray507 != null && Static185.method3087(this.anInt9465, arg2)) {
			local860 = 0;
			@Pc(2875) int[] local2875 = new int[256];
			for (local881 = 0; local881 < this.anInt9474; local881++) {
				local891 = arg1.anIntArray507[local119[local881]];
				if (local891 >= 0) {
					if (local891 > local860) {
						local860 = local891;
					}
					@Pc(2901) int local2901 = local2875[local891]++;
				}
			}
			this.anIntArrayArray53 = new int[local860 + 1][];
			for (local891 = 0; local891 <= local860; local891++) {
				this.anIntArrayArray53[local891] = new int[local2875[local891]];
				local2875[local891] = 0;
			}
			for (local900 = 0; local900 < this.anInt9474; local900++) {
				local909 = arg1.anIntArray507[local119[local900]];
				if (local909 >= 0) {
					this.anIntArrayArray53[local909][local2875[local909]++] = local900;
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oha;Lclient!vu;I)V")
	@Override
	public void method8585(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9452 == 0) {
			return;
		}
		@Pc(13) Class254_Sub1 local13 = this.aClass65_Sub1_34.bf;
		@Pc(16) Class254_Sub1 local16 = (Class254_Sub1) arg0;
		if (!this.aBoolean798) {
			this.method7976();
		}
		Static413.aFloat142 = local16.aFloat140 * local13.aFloat141 + local13.aFloat139 * local16.aFloat136 + local13.aFloat130 * local16.aFloat141;
		Static582.aFloat217 = local16.aFloat131 * local13.aFloat141 + local13.aFloat139 * local16.aFloat137 + local16.aFloat132 * local13.aFloat130 + local13.aFloat132;
		@Pc(69) float local69 = Static582.aFloat217 + (float) this.aShort99 * Static413.aFloat142;
		@Pc(77) float local77 = (float) this.aShort101 * Static413.aFloat142 + Static582.aFloat217;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort95;
			local94 = (float) -this.aShort95 + local77;
		} else {
			local94 = local69 - (float) this.aShort95;
			local87 = local77 + (float) this.aShort95;
		}
		if (this.aClass65_Sub1_34.aFloat18 <= local94 || (float) this.aClass65_Sub1_34.anInt1404 >= local87) {
			return;
		}
		Static672.aFloat216 = local13.aFloat138 * local16.aFloat141 + local13.aFloat136 * local16.aFloat140 + local13.aFloat134 * local16.aFloat136;
		Static553.aFloat191 = local13.aFloat137 + local13.aFloat138 * local16.aFloat132 + local13.aFloat134 * local16.aFloat137 + local13.aFloat136 * local16.aFloat131;
		@Pc(170) float local170 = Static553.aFloat191 + Static672.aFloat216 * (float) this.aShort99;
		@Pc(178) float local178 = Static672.aFloat216 * (float) this.aShort101 + Static553.aFloat191;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local194 = (local178 - (float) this.aShort95) * (float) this.aClass65_Sub1_34.anInt1398;
			local205 = ((float) this.aShort95 + local170) * (float) this.aClass65_Sub1_34.anInt1398;
		} else {
			local194 = (float) this.aClass65_Sub1_34.anInt1398 * ((float) -this.aShort95 + local170);
			local205 = (float) this.aClass65_Sub1_34.anInt1398 * ((float) this.aShort95 + local178);
		}
		if (this.aClass65_Sub1_34.aFloat20 <= local194 / local87 || local205 / local87 <= this.aClass65_Sub1_34.aFloat30) {
			return;
		}
		Static163.aFloat84 = local16.aFloat140 * local13.aFloat140 + local13.aFloat135 * local16.aFloat136 + local13.aFloat133 * local16.aFloat141;
		Static548.aFloat189 = local16.aFloat131 * local13.aFloat140 + local16.aFloat137 * local13.aFloat135 + local16.aFloat132 * local13.aFloat133 + local13.aFloat131;
		@Pc(294) float local294 = (float) this.aShort99 * Static163.aFloat84 + Static548.aFloat189;
		@Pc(302) float local302 = Static548.aFloat189 + (float) this.aShort101 * Static163.aFloat84;
		@Pc(317) float local317;
		@Pc(328) float local328;
		if (local294 > local302) {
			local317 = (float) this.aClass65_Sub1_34.anInt1396 * (local302 - (float) this.aShort95);
			local328 = (float) this.aClass65_Sub1_34.anInt1396 * (local294 + (float) this.aShort95);
		} else {
			local328 = (float) this.aClass65_Sub1_34.anInt1396 * ((float) this.aShort95 + local302);
			local317 = (local294 - (float) this.aShort95) * (float) this.aClass65_Sub1_34.anInt1396;
		}
		if (local317 / local87 >= this.aClass65_Sub1_34.aFloat32 || local328 / local87 <= this.aClass65_Sub1_34.aFloat12) {
			return;
		}
		if (arg1 != null || this.aClass223Array1 != null) {
			Static204.aFloat88 = local16.aFloat130 * local13.aFloat138 + local13.aFloat136 * local16.aFloat133 + local13.aFloat134 * local16.aFloat138;
			Static643.aFloat212 = local16.aFloat130 * local13.aFloat130 + local16.aFloat133 * local13.aFloat141 + local16.aFloat138 * local13.aFloat139;
			Static384.aFloat127 = local16.aFloat130 * local13.aFloat133 + local16.aFloat133 * local13.aFloat140 + local13.aFloat135 * local16.aFloat138;
			Static238.aFloat92 = local16.aFloat139 * local13.aFloat133 + local16.aFloat135 * local13.aFloat140 + local16.aFloat134 * local13.aFloat135;
			Static36.aFloat4 = local16.aFloat139 * local13.aFloat130 + local16.aFloat135 * local13.aFloat141 + local16.aFloat134 * local13.aFloat139;
			Static388.aFloat129 = local16.aFloat134 * local13.aFloat134 + local16.aFloat135 * local13.aFloat136 + local13.aFloat138 * local16.aFloat139;
		}
		if (arg1 != null) {
			@Pc(487) boolean local487 = false;
			@Pc(489) boolean local489 = true;
			@Pc(497) int local497 = this.aShort102 + this.aShort97 >> 1;
			@Pc(505) int local505 = this.aShort100 + this.aShort96 >> 1;
			@Pc(524) int local524 = (int) ((float) local497 * Static388.aFloat129 + Static553.aFloat191 + Static672.aFloat216 * (float) this.aShort99 + (float) local505 * Static204.aFloat88);
			@Pc(543) int local543 = (int) ((float) local505 * Static384.aFloat127 + Static163.aFloat84 * (float) this.aShort99 + Static548.aFloat189 + Static238.aFloat92 * (float) local497);
			@Pc(562) int local562 = (int) ((float) local505 * Static643.aFloat212 + Static36.aFloat4 * (float) local497 + Static582.aFloat217 + (float) this.aShort99 * Static413.aFloat142);
			if (this.aClass65_Sub1_34.anInt1404 > local562) {
				local487 = true;
			} else {
				arg1.anInt10431 = this.aClass65_Sub1_34.anInt1398 * local524 / local562 + this.aClass65_Sub1_34.anInt1406;
				arg1.anInt10433 = this.aClass65_Sub1_34.anInt1424 + local543 * this.aClass65_Sub1_34.anInt1396 / local562;
			}
			@Pc(620) int local620 = (int) (Static388.aFloat129 * (float) local497 + Static553.aFloat191 + (float) this.aShort101 * Static672.aFloat216 + Static204.aFloat88 * (float) local505);
			@Pc(639) int local639 = (int) ((float) local505 * Static384.aFloat127 + (float) this.aShort101 * Static163.aFloat84 + Static238.aFloat92 * (float) local497 + Static548.aFloat189);
			@Pc(658) int local658 = (int) ((float) local505 * Static643.aFloat212 + Static36.aFloat4 * (float) local497 + Static582.aFloat217 + Static413.aFloat142 * (float) this.aShort101);
			if (local658 < this.aClass65_Sub1_34.anInt1404) {
				local487 = true;
			} else {
				arg1.anInt10430 = local639 * this.aClass65_Sub1_34.anInt1396 / local658 + this.aClass65_Sub1_34.anInt1424;
				arg1.anInt10432 = this.aClass65_Sub1_34.anInt1398 * local620 / local658 + this.aClass65_Sub1_34.anInt1406;
			}
			if (local487) {
				if (this.aClass65_Sub1_34.anInt1404 > local562 && local658 < this.aClass65_Sub1_34.anInt1404) {
					local489 = false;
				} else {
					@Pc(736) int local736;
					@Pc(747) int local747;
					@Pc(758) int local758;
					if (local562 < this.aClass65_Sub1_34.anInt1404) {
						local736 = (local658 - this.aClass65_Sub1_34.anInt1404 << 16) / (local658 - local562);
						local747 = ((local620 - local524) * local736 >> 16) + local620;
						arg1.anInt10431 = this.aClass65_Sub1_34.anInt1406 + this.aClass65_Sub1_34.anInt1398 * local747 / this.aClass65_Sub1_34.anInt1404;
						local758 = local639 + ((local639 - local543) * local736 >> 16);
						arg1.anInt10433 = this.aClass65_Sub1_34.anInt1396 * local758 / this.aClass65_Sub1_34.anInt1404 + this.aClass65_Sub1_34.anInt1424;
					} else if (this.aClass65_Sub1_34.anInt1404 > local658) {
						local736 = (local562 - this.aClass65_Sub1_34.anInt1404 << 16) / (local562 - local658);
						local747 = local524 + (local736 * (local524 - local620) >> 16);
						local758 = ((local543 - local639) * local736 >> 16) + local543;
						arg1.anInt10431 = this.aClass65_Sub1_34.anInt1406 + this.aClass65_Sub1_34.anInt1398 * local747 / this.aClass65_Sub1_34.anInt1404;
						arg1.anInt10433 = this.aClass65_Sub1_34.anInt1424 + this.aClass65_Sub1_34.anInt1396 * local758 / this.aClass65_Sub1_34.anInt1404;
					}
				}
			}
			if (local489) {
				arg1.aBoolean890 = true;
				if (local562 <= local658) {
					arg1.anInt10434 = this.aClass65_Sub1_34.anInt1398 * (local620 + this.aShort95) / local658 + this.aClass65_Sub1_34.anInt1406 - arg1.anInt10432;
				} else {
					arg1.anInt10434 = this.aClass65_Sub1_34.anInt1406 + (local524 + this.aShort95) * this.aClass65_Sub1_34.anInt1398 / local562 - arg1.anInt10431;
				}
			}
		}
		this.aClass65_Sub1_34.method1261();
		this.aClass65_Sub1_34.method1243(local16);
		this.method7978();
		this.aClass65_Sub1_34.method1283();
		this.method7973();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oha;IZ)V")
	@Override
	public void method8578(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray134 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9466; local14++) {
			if ((this.aShortArray134[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method7349(this.anIntArray519[local14], this.anIntArray517[local14], this.anIntArray521[local14], local12);
				} else {
					arg0.method7355(this.anIntArray519[local14], this.anIntArray517[local14], this.anIntArray521[local14], local12);
				}
				this.anIntArray519[local14] = local12[0];
				this.anIntArray517[local14] = local12[1];
				this.anIntArray521[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZIIILclient!oha;)Z")
	private boolean method7968(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class254 arg5) {
		@Pc(8) Class254_Sub1 local8 = (Class254_Sub1) arg5;
		@Pc(12) Class254_Sub1 local12 = this.aClass65_Sub1_34.bf;
		@Pc(33) float local33 = local12.aFloat137 + local8.aFloat132 * local12.aFloat138 + local12.aFloat136 * local8.aFloat131 + local8.aFloat137 * local12.aFloat134;
		@Pc(54) float local54 = local8.aFloat132 * local12.aFloat133 + local12.aFloat140 * local8.aFloat131 + local12.aFloat135 * local8.aFloat137 + local12.aFloat131;
		Static204.aFloat88 = local8.aFloat130 * local12.aFloat138 + local12.aFloat134 * local8.aFloat138 + local8.aFloat133 * local12.aFloat136;
		Static672.aFloat216 = local8.aFloat136 * local12.aFloat134 + local8.aFloat140 * local12.aFloat136 + local8.aFloat141 * local12.aFloat138;
		Static384.aFloat127 = local8.aFloat130 * local12.aFloat133 + local12.aFloat140 * local8.aFloat133 + local8.aFloat138 * local12.aFloat135;
		Static36.aFloat4 = local8.aFloat139 * local12.aFloat130 + local8.aFloat134 * local12.aFloat139 + local8.aFloat135 * local12.aFloat141;
		@Pc(147) float local147 = local8.aFloat132 * local12.aFloat130 + local12.aFloat139 * local8.aFloat137 + local8.aFloat131 * local12.aFloat141 + local12.aFloat132;
		Static413.aFloat142 = local8.aFloat140 * local12.aFloat141 + local12.aFloat139 * local8.aFloat136 + local12.aFloat130 * local8.aFloat141;
		Static238.aFloat92 = local12.aFloat133 * local8.aFloat139 + local12.aFloat140 * local8.aFloat135 + local12.aFloat135 * local8.aFloat134;
		Static643.aFloat212 = local12.aFloat130 * local8.aFloat130 + local12.aFloat141 * local8.aFloat133 + local8.aFloat138 * local12.aFloat139;
		Static163.aFloat84 = local8.aFloat141 * local12.aFloat133 + local12.aFloat135 * local8.aFloat136 + local8.aFloat140 * local12.aFloat140;
		Static388.aFloat129 = local8.aFloat139 * local12.aFloat138 + local12.aFloat134 * local8.aFloat134 + local8.aFloat135 * local12.aFloat136;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass65_Sub1_34.anInt1398;
		@Pc(255) int local255 = this.aClass65_Sub1_34.anInt1396;
		if (!this.aBoolean798) {
			this.method7976();
		}
		@Pc(270) int local270 = this.aShort97 - this.aShort102 >> 1;
		@Pc(279) int local279 = this.aShort101 - this.aShort99 >> 1;
		@Pc(287) int local287 = this.aShort96 - this.aShort100 >> 1;
		@Pc(292) int local292 = local270 + this.aShort102;
		@Pc(297) int local297 = this.aShort99 + local279;
		@Pc(303) int local303 = this.aShort100 + local287;
		@Pc(309) int local309 = local292 - (local270 << arg0);
		@Pc(316) int local316 = local297 - (local279 << arg0);
		@Pc(323) int local323 = local303 - (local287 << arg0);
		@Pc(335) int local335 = (local270 << arg0) + local292;
		@Pc(341) int local341 = (local279 << arg0) + local297;
		Static477.anIntArray447[0] = local309;
		@Pc(351) int local351 = local303 + (local287 << arg0);
		Static147.anIntArray131[0] = local316;
		Static477.anIntArray447[1] = local335;
		Static303.anIntArray324[0] = local323;
		Static147.anIntArray131[1] = local316;
		Static477.anIntArray447[2] = local309;
		Static303.anIntArray324[1] = local323;
		Static147.anIntArray131[2] = local341;
		Static303.anIntArray324[2] = local323;
		Static477.anIntArray447[3] = local335;
		Static147.anIntArray131[3] = local341;
		Static477.anIntArray447[4] = local309;
		Static303.anIntArray324[3] = local323;
		Static147.anIntArray131[4] = local316;
		Static303.anIntArray324[4] = local351;
		Static477.anIntArray447[5] = local335;
		Static147.anIntArray131[5] = local316;
		Static303.anIntArray324[5] = local351;
		Static477.anIntArray447[6] = local309;
		Static147.anIntArray131[6] = local341;
		Static477.anIntArray447[7] = local335;
		Static303.anIntArray324[6] = local351;
		Static147.anIntArray131[7] = local341;
		Static303.anIntArray324[7] = local351;
		@Pc(476) float local476;
		@Pc(490) float local490;
		@Pc(504) float local504;
		@Pc(452) float local452;
		@Pc(457) float local457;
		@Pc(462) float local462;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = (float) Static477.anIntArray447[local445];
			local457 = (float) Static147.anIntArray131[local445];
			local462 = (float) Static303.anIntArray324[local445];
			local476 = Static388.aFloat129 * local452 + local457 * Static672.aFloat216 + local462 * Static204.aFloat88 + local33;
			local490 = Static384.aFloat127 * local462 + Static238.aFloat92 * local452 + Static163.aFloat84 * local457 + local54;
			local504 = local462 * Static643.aFloat212 + Static36.aFloat4 * local452 + Static413.aFloat142 * local457 + local147;
			if ((float) this.aClass65_Sub1_34.anInt1404 <= local504) {
				if (arg3 > 0) {
					local504 = (float) arg3;
				}
				@Pc(531) float local531 = (float) local251 * local476 / local504 + (float) this.aClass65_Sub1_34.anInt1406;
				@Pc(543) float local543 = (float) this.aClass65_Sub1_34.anInt1424 + (float) local255 * local490 / local504;
				if (local241 > local531) {
					local241 = local531;
				}
				if (local243 < local531) {
					local243 = local531;
				}
				if (local543 > local247) {
					local247 = local543;
				}
				local239 = true;
				if (local245 > local543) {
					local245 = local543;
				}
			}
		}
		if (local239 && local241 < (float) arg4 && local243 > (float) arg4 && local245 < (float) arg2 && (float) arg2 < local247) {
			if (arg1) {
				return true;
			}
			if (this.aClass65_Sub1_34.anIntArray69.length < this.anInt9452) {
				this.aClass65_Sub1_34.anIntArray69 = new int[this.anInt9452];
				this.aClass65_Sub1_34.anIntArray68 = new int[this.anInt9452];
			}
			@Pc(628) int[] local628 = this.aClass65_Sub1_34.anIntArray69;
			@Pc(632) int[] local632 = this.aClass65_Sub1_34.anIntArray68;
			@Pc(721) int local721;
			for (@Pc(634) int local634 = 0; local634 < this.anInt9466; local634++) {
				local452 = (float) this.anIntArray519[local634];
				local462 = (float) this.anIntArray521[local634];
				local457 = (float) this.anIntArray517[local634];
				local490 = local457 * Static163.aFloat84 + local452 * Static238.aFloat92 + local462 * Static384.aFloat127 + local54;
				local504 = local462 * Static643.aFloat212 + local457 * Static413.aFloat142 + local452 * Static36.aFloat4 + local147;
				local476 = local33 + Static204.aFloat88 * local462 + local457 * Static672.aFloat216 + local452 * Static388.aFloat129;
				@Pc(734) int local734;
				@Pc(739) int local739;
				@Pc(746) int local746;
				if ((float) this.aClass65_Sub1_34.anInt1404 <= local504) {
					if (arg3 > 0) {
						local504 = (float) arg3;
					}
					local721 = (int) ((float) local251 * local476 / local504 + (float) this.aClass65_Sub1_34.anInt1406);
					local734 = (int) ((float) local255 * local490 / local504 + (float) this.aClass65_Sub1_34.anInt1424);
					local739 = this.anIntArray520[local634];
					local746 = this.anIntArray520[local634 + 1];
					for (@Pc(748) int local748 = local739; local748 < local746; local748++) {
						@Pc(757) int local757 = this.aShortArray125[local748] - 1;
						if (local757 == -1) {
							break;
						}
						local628[local757] = local721;
						local632[local757] = local734;
					}
				} else {
					local721 = this.anIntArray520[local634];
					local734 = this.anIntArray520[local634 + 1];
					for (local739 = local721; local739 < local734; local739++) {
						local746 = this.aShortArray125[local739] - 1;
						if (local746 == -1) {
							break;
						}
						local628[this.aShortArray125[local739] - 1] = -999999;
					}
				}
			}
			for (local721 = 0; local721 < this.anInt9474; local721++) {
				if (local628[this.aShortArray133[local721]] != -999999 && local628[this.aShortArray130[local721]] != -999999 && local628[this.aShortArray131[local721]] != -999999 && this.method7974(local632[this.aShortArray130[local721]], arg4, local632[this.aShortArray133[local721]], local632[this.aShortArray131[local721]], local628[this.aShortArray131[local721]], local628[this.aShortArray130[local721]], local628[this.aShortArray133[local721]], arg2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!to", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class153 method8580(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class153_Sub2 local21;
		@Pc(17) Class153_Sub2 local17;
		if (arg0 == 1) {
			local17 = this.aClass65_Sub1_34.aClass153_Sub2_2;
			local21 = this.aClass65_Sub1_34.aClass153_Sub2_6;
		} else if (arg0 == 2) {
			local17 = this.aClass65_Sub1_34.aClass153_Sub2_10;
			local21 = this.aClass65_Sub1_34.aClass153_Sub2_8;
		} else if (arg0 == 3) {
			local21 = this.aClass65_Sub1_34.aClass153_Sub2_5;
			local17 = this.aClass65_Sub1_34.aClass153_Sub2_3;
		} else if (arg0 == 4) {
			local17 = this.aClass65_Sub1_34.aClass153_Sub2_4;
			local21 = this.aClass65_Sub1_34.aClass153_Sub2_7;
		} else if (arg0 == 5) {
			local21 = this.aClass65_Sub1_34.aClass153_Sub2_1;
			local17 = this.aClass65_Sub1_34.aClass153_Sub2_9;
		} else {
			local21 = local17 = new Class153_Sub2(this.aClass65_Sub1_34);
		}
		return this.method7969(arg1, arg2, local17, arg0 != 0, local21);
	}

	@OriginalMember(owner = "client!to", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub3_Sub7 ba(@OriginalArg(0) Class5_Sub3_Sub7 arg0) {
		if (this.anInt9452 == 0) {
			return null;
		}
		if (!this.aBoolean798) {
			this.method7976();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass65_Sub1_34.anInt1403 > 0) {
			local40 = this.aShort102 - (this.aShort101 * this.aClass65_Sub1_34.anInt1403 >> 8) >> this.aClass65_Sub1_34.anInt1381;
			local57 = this.aShort97 - (this.aShort99 * this.aClass65_Sub1_34.anInt1403 >> 8) >> this.aClass65_Sub1_34.anInt1381;
		} else {
			local40 = this.aShort102 - (this.aShort99 * this.aClass65_Sub1_34.anInt1403 >> 8) >> this.aClass65_Sub1_34.anInt1381;
			local57 = this.aShort97 - (this.aShort101 * this.aClass65_Sub1_34.anInt1403 >> 8) >> this.aClass65_Sub1_34.anInt1381;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass65_Sub1_34.anInt1421 > 0) {
			local116 = this.aShort100 - (this.aClass65_Sub1_34.anInt1421 * this.aShort101 >> 8) >> this.aClass65_Sub1_34.anInt1381;
			local132 = this.aShort96 - (this.aClass65_Sub1_34.anInt1421 * this.aShort99 >> 8) >> this.aClass65_Sub1_34.anInt1381;
		} else {
			local116 = this.aShort100 - (this.aClass65_Sub1_34.anInt1421 * this.aShort99 >> 8) >> this.aClass65_Sub1_34.anInt1381;
			local132 = this.aShort96 - (this.aShort101 * this.aClass65_Sub1_34.anInt1421 >> 8) >> this.aClass65_Sub1_34.anInt1381;
		}
		@Pc(175) int local175 = local57 + 1 - local40;
		@Pc(182) int local182 = local132 + 1 - local116;
		@Pc(185) Class5_Sub3_Sub7_Sub2 local185 = (Class5_Sub3_Sub7_Sub2) arg0;
		@Pc(195) Class5_Sub3_Sub7_Sub2 local195;
		if (local185 != null && local185.method6130(local182, local175)) {
			local195 = local185;
			local185.method6126();
		} else {
			local195 = new Class5_Sub3_Sub7_Sub2(this.aClass65_Sub1_34, local175, local182);
		}
		local195.method6127(local40, local116, local132, local57);
		this.method7981(local195);
		return local195;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()[Lclient!ld;")
	@Override
	public Class209[] method8587() {
		return this.aClass209Array4;
	}

	@OriginalMember(owner = "client!to", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort98;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZLclient!to;ZLclient!to;)Lclient!ka;")
	private Class153 method7969(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class153_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class153_Sub2 arg4) {
		arg4.anInt9452 = this.anInt9452;
		arg4.lb = this.lb;
		arg4.anInt9442 = this.anInt9442;
		arg4.anInt9474 = this.anInt9474;
		arg4.aShort98 = this.aShort98;
		arg4.aShort104 = this.aShort104;
		arg4.aBoolean800 = this.aBoolean800;
		arg4.anInt9466 = this.anInt9466;
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean797 = this.aBoolean797;
		} else {
			arg4.aBoolean797 = true;
		}
		arg4.anInt9465 = this.anInt9465;
		arg4.anInt9464 = this.anInt9464;
		arg4.anInt9455 = arg0;
		arg4.aByte129 = 0;
		@Pc(81) boolean local81 = Static312.method4927(this.anInt9465, arg0);
		@Pc(87) boolean local87 = Static316.method4963(this.anInt9465, arg0);
		@Pc(93) boolean local93 = Static537.method3393(this.anInt9465, arg0);
		@Pc(99) boolean local99 = local93 | local87 | local81;
		@Pc(218) int local218;
		if (local99) {
			if (!local81) {
				arg4.anIntArray519 = this.anIntArray519;
			} else if (arg2.anIntArray519 == null || arg2.anIntArray519.length < this.anInt9464) {
				arg4.anIntArray519 = arg2.anIntArray519 = new int[this.anInt9464];
			} else {
				arg4.anIntArray519 = arg2.anIntArray519;
			}
			if (!local87) {
				arg4.anIntArray517 = this.anIntArray517;
			} else if (arg2.anIntArray517 == null || this.anInt9464 > arg2.anIntArray517.length) {
				arg4.anIntArray517 = arg2.anIntArray517 = new int[this.anInt9464];
			} else {
				arg4.anIntArray517 = arg2.anIntArray517;
			}
			if (!local93) {
				arg4.anIntArray521 = this.anIntArray521;
			} else if (arg2.anIntArray521 == null || this.anInt9464 > arg2.anIntArray521.length) {
				arg4.anIntArray521 = arg2.anIntArray521 = new int[this.anInt9464];
			} else {
				arg4.anIntArray521 = arg2.anIntArray521;
			}
			for (local218 = 0; local218 < this.anInt9464; local218++) {
				if (local81) {
					arg4.anIntArray519[local218] = this.anIntArray519[local218];
				}
				if (local87) {
					arg4.anIntArray517[local218] = this.anIntArray517[local218];
				}
				if (local93) {
					arg4.anIntArray521[local218] = this.anIntArray521[local218];
				}
			}
		} else {
			arg4.anIntArray519 = this.anIntArray519;
			arg4.anIntArray521 = this.anIntArray521;
			arg4.anIntArray517 = this.anIntArray517;
		}
		if (Static112.method2102(arg0, this.anInt9465)) {
			arg4.aClass79_11 = arg2.aClass79_11;
			if (arg3) {
				arg4.aByte129 = (byte) (arg4.aByte129 | 0x1);
			}
			arg4.aClass79_11.aByte17 = this.aClass79_11.aByte17;
			arg4.aClass79_11.anInterface17_4 = this.aClass79_11.anInterface17_4;
		} else if (Static260.method4075(arg0, this.anInt9465)) {
			arg4.aClass79_11 = this.aClass79_11;
		} else {
			arg4.aClass79_11 = null;
		}
		if (Static532.method7471(this.anInt9465, arg0)) {
			if (arg2.aShortArray129 == null || this.anInt9474 > arg2.aShortArray129.length) {
				arg4.aShortArray129 = arg2.aShortArray129 = new short[this.anInt9474];
			} else {
				arg4.aShortArray129 = arg2.aShortArray129;
			}
			for (local218 = 0; local218 < this.anInt9474; local218++) {
				arg4.aShortArray129[local218] = this.aShortArray129[local218];
			}
		} else {
			arg4.aShortArray129 = this.aShortArray129;
		}
		if (Static86.method1835(arg0, this.anInt9465)) {
			if (arg2.aByteArray95 == null || arg2.aByteArray95.length < this.anInt9474) {
				arg4.aByteArray95 = arg2.aByteArray95 = new byte[this.anInt9474];
			} else {
				arg4.aByteArray95 = arg2.aByteArray95;
			}
			for (local218 = 0; local218 < this.anInt9474; local218++) {
				arg4.aByteArray95[local218] = this.aByteArray95[local218];
			}
		} else {
			arg4.aByteArray95 = this.aByteArray95;
		}
		if (Static457.method6552(arg0, this.anInt9465)) {
			arg4.aClass79_10 = arg2.aClass79_10;
			if (arg3) {
				arg4.aByte129 = (byte) (arg4.aByte129 | 0x2);
			}
			arg4.aClass79_10.anInterface17_4 = this.aClass79_10.anInterface17_4;
			arg4.aClass79_10.aByte17 = this.aClass79_10.aByte17;
		} else if (Static214.method3395(this.anInt9465, arg0)) {
			arg4.aClass79_10 = this.aClass79_10;
		} else {
			arg4.aClass79_10 = null;
		}
		@Pc(563) int local563;
		if (Static653.method8768(this.anInt9465, arg0)) {
			if (arg2.aShortArray127 == null || this.anInt9452 > arg2.aShortArray127.length) {
				local218 = this.anInt9452;
				arg4.aShortArray127 = arg2.aShortArray127 = new short[local218];
				arg4.aShortArray128 = arg2.aShortArray128 = new short[local218];
				arg4.aShortArray126 = arg2.aShortArray126 = new short[local218];
			} else {
				arg4.aShortArray128 = arg2.aShortArray128;
				arg4.aShortArray126 = arg2.aShortArray126;
				arg4.aShortArray127 = arg2.aShortArray127;
			}
			if (this.aClass291_1 == null) {
				for (local218 = 0; local218 < this.anInt9452; local218++) {
					arg4.aShortArray127[local218] = this.aShortArray127[local218];
					arg4.aShortArray126[local218] = this.aShortArray126[local218];
					arg4.aShortArray128[local218] = this.aShortArray128[local218];
				}
			} else {
				if (arg2.aClass291_1 == null) {
					arg2.aClass291_1 = new Class291();
				}
				@Pc(547) Class291 local547 = arg4.aClass291_1 = arg2.aClass291_1;
				if (local547.aShortArray88 == null || local547.aShortArray88.length < this.anInt9452) {
					local563 = this.anInt9452;
					local547.aShortArray88 = new short[local563];
					local547.aShortArray89 = new short[local563];
					local547.aByteArray77 = new byte[local563];
					local547.aShortArray90 = new short[local563];
				}
				for (local563 = 0; local563 < this.anInt9452; local563++) {
					arg4.aShortArray127[local563] = this.aShortArray127[local563];
					arg4.aShortArray126[local563] = this.aShortArray126[local563];
					arg4.aShortArray128[local563] = this.aShortArray128[local563];
					local547.aShortArray88[local563] = this.aClass291_1.aShortArray88[local563];
					local547.aShortArray90[local563] = this.aClass291_1.aShortArray90[local563];
					local547.aShortArray89[local563] = this.aClass291_1.aShortArray89[local563];
					local547.aByteArray77[local563] = this.aClass291_1.aByteArray77[local563];
				}
			}
			arg4.aByteArray94 = this.aByteArray94;
		} else {
			arg4.aShortArray126 = this.aShortArray126;
			arg4.aByteArray94 = this.aByteArray94;
			arg4.aShortArray128 = this.aShortArray128;
			arg4.aShortArray127 = this.aShortArray127;
			arg4.aClass291_1 = this.aClass291_1;
		}
		if (Static242.method3781(arg0, this.anInt9465)) {
			if (arg3) {
				arg4.aByte129 = (byte) (arg4.aByte129 | 0x4);
			}
			arg4.aClass79_12 = arg2.aClass79_12;
			arg4.aClass79_12.aByte17 = this.aClass79_12.aByte17;
			arg4.aClass79_12.anInterface17_4 = this.aClass79_12.anInterface17_4;
		} else if (Static585.method8038(this.anInt9465, arg0)) {
			arg4.aClass79_12 = this.aClass79_12;
		} else {
			arg4.aClass79_12 = null;
		}
		if (Static187.method5797(this.anInt9465, arg0)) {
			if (arg2.aFloatArray89 == null || arg2.aFloatArray89.length < this.anInt9474) {
				local218 = this.anInt9452;
				arg4.aFloatArray89 = arg2.aFloatArray89 = new float[local218];
				arg4.aFloatArray90 = arg2.aFloatArray90 = new float[local218];
			} else {
				arg4.aFloatArray90 = arg2.aFloatArray90;
				arg4.aFloatArray89 = arg2.aFloatArray89;
			}
			for (local218 = 0; local218 < this.anInt9452; local218++) {
				arg4.aFloatArray89[local218] = this.aFloatArray89[local218];
				arg4.aFloatArray90[local218] = this.aFloatArray90[local218];
			}
		} else {
			arg4.aFloatArray90 = this.aFloatArray90;
			arg4.aFloatArray89 = this.aFloatArray89;
		}
		if (Static443.method6451(this.anInt9465, arg0)) {
			arg4.aClass79_9 = arg2.aClass79_9;
			if (arg3) {
				arg4.aByte129 = (byte) (arg4.aByte129 | 0x8);
			}
			arg4.aClass79_9.anInterface17_4 = this.aClass79_9.anInterface17_4;
			arg4.aClass79_9.aByte17 = this.aClass79_9.aByte17;
		} else if (Static646.method8667(this.anInt9465, arg0)) {
			arg4.aClass79_9 = this.aClass79_9;
		} else {
			arg4.aClass79_9 = null;
		}
		if (Static439.method6409(arg0, this.anInt9465)) {
			if (arg2.aShortArray133 == null || this.anInt9474 > arg2.aShortArray133.length) {
				local218 = this.anInt9474;
				arg4.aShortArray130 = arg2.aShortArray130 = new short[local218];
				arg4.aShortArray133 = arg2.aShortArray133 = new short[local218];
				arg4.aShortArray131 = arg2.aShortArray131 = new short[local218];
			} else {
				arg4.aShortArray133 = arg2.aShortArray133;
				arg4.aShortArray131 = arg2.aShortArray131;
				arg4.aShortArray130 = arg2.aShortArray130;
			}
			for (local218 = 0; local218 < this.anInt9474; local218++) {
				arg4.aShortArray133[local218] = this.aShortArray133[local218];
				arg4.aShortArray130[local218] = this.aShortArray130[local218];
				arg4.aShortArray131[local218] = this.aShortArray131[local218];
			}
		} else {
			arg4.aShortArray133 = this.aShortArray133;
			arg4.aShortArray130 = this.aShortArray130;
			arg4.aShortArray131 = this.aShortArray131;
		}
		if (Static538.method7533(arg0, this.anInt9465)) {
			arg4.aClass42_1 = arg2.aClass42_1;
			if (arg3) {
				arg4.aByte129 = (byte) (arg4.aByte129 | 0x10);
			}
			arg4.aClass42_1.anInterface23_2 = this.aClass42_1.anInterface23_2;
		} else if (Static371.method5567(arg0, this.anInt9465)) {
			arg4.aClass42_1 = this.aClass42_1;
		} else {
			arg4.aClass42_1 = null;
		}
		if (Static287.method4653(this.anInt9465, arg0)) {
			if (arg2.aShortArray132 == null || this.anInt9474 > arg2.aShortArray132.length) {
				local218 = this.anInt9474;
				arg4.aShortArray132 = arg2.aShortArray132 = new short[local218];
			} else {
				arg4.aShortArray132 = arg2.aShortArray132;
			}
			for (local218 = 0; local218 < this.anInt9474; local218++) {
				arg4.aShortArray132[local218] = this.aShortArray132[local218];
			}
		} else {
			arg4.aShortArray132 = this.aShortArray132;
		}
		if (!Static238.method3726(this.anInt9465, arg0)) {
			arg4.aClass76Array1 = this.aClass76Array1;
		} else if (arg2.aClass76Array1 == null || this.anInt9442 > arg2.aClass76Array1.length) {
			local218 = this.anInt9442;
			arg4.aClass76Array1 = arg2.aClass76Array1 = new Class76[local218];
			for (local563 = 0; local563 < this.anInt9442; local563++) {
				arg4.aClass76Array1[local563] = this.aClass76Array1[local563].method1952();
			}
		} else {
			arg4.aClass76Array1 = arg2.aClass76Array1;
			for (local218 = 0; local218 < this.anInt9442; local218++) {
				arg4.aClass76Array1[local218].method1953(this.aClass76Array1[local218]);
			}
		}
		arg4.anIntArrayArray53 = this.anIntArrayArray53;
		arg4.aShortArray125 = this.aShortArray125;
		arg4.aClass209Array4 = this.aClass209Array4;
		if (this.aBoolean798) {
			arg4.aShort96 = this.aShort96;
			arg4.aShort95 = this.aShort95;
			arg4.aShort103 = this.aShort103;
			arg4.aShort97 = this.aShort97;
			arg4.aShort101 = this.aShort101;
			arg4.aShort102 = this.aShort102;
			arg4.aBoolean798 = true;
			arg4.aShort99 = this.aShort99;
			arg4.aShort100 = this.aShort100;
		} else {
			arg4.aBoolean798 = false;
		}
		arg4.aClass313Array4 = this.aClass313Array4;
		arg4.anIntArray520 = this.anIntArray520;
		arg4.aClass223Array1 = this.aClass223Array1;
		arg4.anIntArrayArray52 = this.anIntArrayArray52;
		arg4.anIntArray518 = this.anIntArray518;
		arg4.aShortArray124 = this.aShortArray124;
		arg4.aShortArray134 = this.aShortArray134;
		arg4.anIntArrayArray54 = this.anIntArrayArray54;
		return arg4;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!oha;ZII)Z")
	@Override
	public boolean method8590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7968(arg4, arg3, arg1, arg5, arg0, arg2);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8582(@OriginalArg(0) Class153 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class153_Sub2 local8 = (Class153_Sub2) arg0;
		if (this.anInt9474 == 0 || local8.anInt9474 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt9466;
		@Pc(24) int[] local24 = local8.anIntArray519;
		@Pc(27) int[] local27 = local8.anIntArray517;
		@Pc(30) int[] local30 = local8.anIntArray521;
		@Pc(33) short[] local33 = local8.aShortArray127;
		@Pc(36) short[] local36 = local8.aShortArray126;
		@Pc(39) short[] local39 = local8.aShortArray128;
		@Pc(42) byte[] local42 = local8.aByteArray94;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(47) short[] local47;
		@Pc(51) byte[] local51;
		if (this.aClass291_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass291_1.aShortArray89;
			local51 = this.aClass291_1.aByteArray77;
			local49 = this.aClass291_1.aShortArray90;
			local53 = this.aClass291_1.aShortArray88;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local8.aClass291_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass291_1.aByteArray77;
			local76 = local8.aClass291_1.aShortArray89;
			local78 = local8.aClass291_1.aShortArray88;
			local82 = local8.aClass291_1.aShortArray90;
		}
		@Pc(103) int[] local103 = local8.anIntArray520;
		@Pc(106) short[] local106 = local8.aShortArray125;
		if (!local8.aBoolean798) {
			local8.method7976();
		}
		@Pc(115) short local115 = local8.aShort99;
		@Pc(118) short local118 = local8.aShort101;
		@Pc(121) short local121 = local8.aShort102;
		@Pc(124) short local124 = local8.aShort97;
		@Pc(127) short local127 = local8.aShort100;
		@Pc(130) short local130 = local8.aShort96;
		for (@Pc(132) int local132 = 0; local132 < this.anInt9466; local132++) {
			@Pc(141) int local141 = this.anIntArray517[local132] - arg2;
			if (local115 <= local141 && local141 <= local118) {
				@Pc(157) int local157 = this.anIntArray519[local132] - arg1;
				if (local121 <= local157 && local124 >= local157) {
					@Pc(173) int local173 = this.anIntArray521[local132] - arg3;
					if (local127 <= local173 && local130 >= local173) {
						@Pc(187) int local187 = -1;
						@Pc(192) int local192 = this.anIntArray520[local132];
						@Pc(199) int local199 = this.anIntArray520[local132 + 1];
						for (@Pc(201) int local201 = local192; local201 < local199; local201++) {
							local187 = this.aShortArray125[local201] - 1;
							if (local187 == -1 || this.aByteArray94[local187] != 0) {
								break;
							}
						}
						if (local187 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local21; local235++) {
								if (local157 == local24[local235] && local173 == local30[local235] && local27[local235] == local141) {
									local199 = local103[local235 + 1];
									local192 = local103[local235];
									@Pc(272) int local272 = -1;
									for (@Pc(274) int local274 = local192; local274 < local199; local274++) {
										local272 = local106[local274] - 1;
										if (local272 == -1 || local42[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local53 == null) {
											this.aClass291_1 = new Class291();
											local53 = this.aClass291_1.aShortArray88 = Static599.method8201(this.aShortArray127);
											local49 = this.aClass291_1.aShortArray90 = Static599.method8201(this.aShortArray126);
											local47 = this.aClass291_1.aShortArray89 = Static599.method8201(this.aShortArray128);
											local51 = this.aClass291_1.aByteArray77 = Static540.method7551(this.aByteArray94);
										}
										if (local78 == null) {
											@Pc(356) Class291 local356 = local8.aClass291_1 = new Class291();
											local78 = local356.aShortArray88 = Static599.method8201(local33);
											local82 = local356.aShortArray90 = Static599.method8201(local36);
											local76 = local356.aShortArray89 = Static599.method8201(local39);
											local80 = local356.aByteArray77 = Static540.method7551(local42);
										}
										@Pc(389) short local389 = this.aShortArray127[local187];
										@Pc(394) short local394 = this.aShortArray126[local187];
										@Pc(399) short local399 = this.aShortArray128[local187];
										local192 = local103[local235];
										local199 = local103[local235 + 1];
										@Pc(414) byte local414 = this.aByteArray94[local187];
										@Pc(424) int local424;
										for (@Pc(416) int local416 = local192; local416 < local199; local416++) {
											local424 = local106[local416] - 1;
											if (local424 == -1) {
												break;
											}
											if (local80[local424] != 0) {
												local78[local424] += local389;
												local82[local424] += local394;
												local76[local424] += local399;
												local80[local424] += local414;
											}
										}
										local394 = local36[local272];
										local414 = local42[local272];
										local192 = this.anIntArray520[local132];
										local199 = this.anIntArray520[local132 + 1];
										local389 = local33[local272];
										local399 = local39[local272];
										for (local424 = local192; local424 < local199; local424++) {
											@Pc(511) int local511 = this.aShortArray125[local424] - 1;
											if (local511 == -1) {
												break;
											}
											if (local51[local511] != 0) {
												local53[local511] += local389;
												local49[local511] += local394;
												local47[local511] += local399;
												local51[local511] += local414;
											}
										}
										if (this.aClass79_12 == null && this.aClass79_10 != null) {
											this.aClass79_10.anInterface17_4 = null;
										}
										if (this.aClass79_12 != null) {
											this.aClass79_12.anInterface17_4 = null;
										}
										if (local8.aClass79_12 == null && local8.aClass79_10 != null) {
											local8.aClass79_10.anInterface17_4 = null;
										}
										if (local8.aClass79_12 != null) {
											local8.aClass79_12.anInterface17_4 = null;
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

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()Z")
	@Override
	public boolean method8576() {
		if (this.aShortArray132 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray132.length; local12++) {
			if (this.aShortArray132[local12] != -1 && !this.aClass65_Sub1_34.anInterface4_11.method359(this.aShortArray132[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IFIIIBLclient!su;FIJ)S")
	private short method7972(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class329 arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray520[arg4];
		@Pc(17) int local17 = this.anIntArray520[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = local10; local29 < local17; local29++) {
			@Pc(36) short local36 = this.aShortArray125[local29];
			if (local36 == 0) {
				local19 = local29;
				break;
			}
			if (Static213.aLongArray23[local29] == arg8) {
				return (short) (local36 - 1);
			}
		}
		this.aShortArray125[local19] = (short) (this.anInt9452 + 1);
		Static213.aLongArray23[local19] = arg8;
		this.aShortArray127[this.anInt9452] = (short) arg3;
		this.aShortArray126[this.anInt9452] = (short) arg2;
		this.aShortArray128[this.anInt9452] = (short) arg0;
		this.aByteArray94[this.anInt9452] = (byte) arg7;
		this.aFloatArray89[this.anInt9452] = arg1;
		this.aFloatArray90[this.anInt9452] = arg6;
		return (short) this.anInt9452++;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt9474; local3++) {
			local12 = this.aShortArray129[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(43) int local43 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local43 += (arg2 - local43) * arg3 >> 7;
			}
			this.aShortArray129[local3] = (short) (local43 | local24 << 7 | local18 << 10);
		}
		if (this.aClass223Array1 != null) {
			for (local12 = 0; local12 < this.anInt9442; local12++) {
				@Pc(110) Class223 local110 = this.aClass223Array1[local12];
				@Pc(115) Class76 local115 = this.aClass76Array1[local12];
				local115.anInt2165 = local115.anInt2165 & 0xFF000000 | Static336.anIntArray357[this.aShortArray129[local110.anInt6523] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
	private void method7973() {
		if (this.aClass223Array1 == null) {
			return;
		}
		@Pc(18) Class254_Sub1 local18 = this.aClass65_Sub1_34.aClass254_Sub1_2;
		this.aClass65_Sub1_34.method1250();
		this.aClass65_Sub1_34.C(!this.aBoolean797);
		this.aClass65_Sub1_34.method1285(false);
		this.aClass65_Sub1_34.method1258(this.aClass65_Sub1_34.aClass79_4, this.aClass65_Sub1_34.aClass79_3, (Class79) null, (Class79) null);
		for (@Pc(52) int local52 = 0; local52 < this.anInt9442; local52++) {
			@Pc(59) Class223 local59 = this.aClass223Array1[local52];
			@Pc(64) Class76 local64 = this.aClass76Array1[local52];
			if (!local59.aBoolean580 || !this.aClass65_Sub1_34.method6934()) {
				@Pc(92) float local92 = (float) (this.anIntArray519[local59.anInt6524] + this.anIntArray519[local59.anInt6521] + this.anIntArray519[local59.anInt6526]) * 0.3333333F;
				@Pc(113) float local113 = (float) (this.anIntArray517[local59.anInt6521] + this.anIntArray517[local59.anInt6526] + this.anIntArray517[local59.anInt6524]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray521[local59.anInt6524] + this.anIntArray521[local59.anInt6521] + this.anIntArray521[local59.anInt6526]) * 0.3333333F;
				@Pc(148) float local148 = Static553.aFloat191 + local134 * Static204.aFloat88 + local113 * Static672.aFloat216 + Static388.aFloat129 * local92;
				@Pc(162) float local162 = Static548.aFloat189 + Static384.aFloat127 * local134 + Static238.aFloat92 * local92 + local113 * Static163.aFloat84;
				@Pc(176) float local176 = Static643.aFloat212 * local134 + local92 * Static36.aFloat4 + local113 * Static413.aFloat142 + Static582.aFloat217;
				@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local162 * local162 + local176 * local176))) * (float) local59.anInt6527;
				local18.method5930(local64.anInt2164 * local59.aShort64 >> 7, local148 + (float) local64.anInt2162 - local148 * local197, local197 * local176 + -local176, local59.aShort63 * local64.anInt2168 >> 7, (float) local64.anInt2167 + local162 * local197 - local162, local64.anInt2163);
				this.aClass65_Sub1_34.method1288(local18);
				@Pc(248) int local248 = local64.anInt2165;
				OpenGL.glColor4ub((byte) (local248 >> 16), (byte) (local248 >> 8), (byte) local248, (byte) (local248 >> 24));
				this.aClass65_Sub1_34.method1246(local59.aShort62);
				this.aClass65_Sub1_34.method1231(local59.aByte99);
				this.aClass65_Sub1_34.method1298(4);
			}
		}
		this.aClass65_Sub1_34.C(true);
		this.aClass65_Sub1_34.method1283();
	}

	@OriginalMember(owner = "client!to", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9466; local15++) {
			@Pc(33) int local33 = this.anIntArray517[local15] * local13 - local9 * this.anIntArray521[local15] >> 14;
			this.anIntArray521[local15] = this.anIntArray521[local15] * local13 + this.anIntArray517[local15] * local9 >> 14;
			this.anIntArray517[local15] = local33;
		}
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
	}

	@OriginalMember(owner = "client!to", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!to", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean800;
	}

	@OriginalMember(owner = "client!to", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass65_Sub1_34.anInterface4_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9474; local11++) {
			if (this.aShortArray132[local11] == arg0) {
				this.aShortArray132[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class136 local52 = local9.method358(arg0 & 0xFFFF);
			local39 = local52.aByte55;
			local41 = local52.aByte51;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class136 local73 = local9.method358(arg1 & 0xFFFF);
			local60 = local73.aByte55;
			local62 = local73.aByte51;
			if (local73.aByte52 != 0 || local73.aByte53 != 0) {
				this.aBoolean800 = true;
			}
		}
		if (!(local60 != local39 | local62 != local41)) {
			return;
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(111) int local111 = 0; local111 < this.anInt9442; local111++) {
				@Pc(118) Class223 local118 = this.aClass223Array1[local111];
				@Pc(123) Class76 local123 = this.aClass76Array1[local111];
				local123.anInt2165 = Static336.anIntArray357[this.aShortArray129[local118.anInt6523] & 0xFFFF] & 0xFFFFFF | local123.anInt2165 & 0xFF000000;
			}
		}
		if (this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIZI)Z")
	private boolean method7974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg7 && arg7 < arg0 && arg7 < arg3) {
			return false;
		} else if (arg2 < arg7 && arg7 > arg0 && arg7 > arg3) {
			return false;
		} else if (arg1 < arg6 && arg1 < arg5 && arg4 > arg1) {
			return false;
		} else {
			return arg6 >= arg1 || arg1 <= arg5 || arg1 <= arg4;
		}
	}

	@OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
		this.aShort98 = (short) arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static401.anInt7136 = 0;
			Static486.anInt8172 = 0;
			Static41.anInt674 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray52.length > local38) {
					local52 = this.anIntArrayArray52[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static401.anInt7136 += this.anIntArray519[local60];
						Static41.anInt674 += this.anIntArray517[local60];
						Static486.anInt8172 += this.anIntArray521[local60];
						local30++;
					}
				}
			}
			if (local30 <= 0) {
				Static486.anInt8172 = local22;
				Static401.anInt7136 = local18;
				Static41.anInt674 = local14;
			} else {
				Static486.anInt8172 = Static486.anInt8172 / local30 + local22;
				Static401.anInt7136 = local18 + Static401.anInt7136 / local30;
				Static41.anInt674 = Static41.anInt674 / local30 + local14;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray52.length > local32) {
					local162 = this.anIntArrayArray52[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray519[local54] += local18;
						this.anIntArray517[local54] += local14;
						this.anIntArray521[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray52.length) {
					local162 = this.anIntArrayArray52[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray519[local54] -= Static401.anInt7136;
							this.anIntArray517[local54] -= Static41.anInt674;
							this.anIntArray521[local54] -= Static486.anInt8172;
							if (arg4 != 0) {
								local60 = Class200.anIntArray337[arg4];
								local277 = Class200.anIntArray338[arg4];
								local295 = local60 * this.anIntArray517[local54] + this.anIntArray519[local54] * local277 + 16383 >> 14;
								this.anIntArray517[local54] = this.anIntArray517[local54] * local277 + 16383 - this.anIntArray519[local54] * local60 >> 14;
								this.anIntArray519[local54] = local295;
							}
							if (arg2 != 0) {
								local60 = Class200.anIntArray337[arg2];
								local277 = Class200.anIntArray338[arg2];
								local295 = this.anIntArray517[local54] * local277 + 16383 - local60 * this.anIntArray521[local54] >> 14;
								this.anIntArray521[local54] = this.anIntArray517[local54] * local60 + this.anIntArray521[local54] * local277 + 16383 >> 14;
								this.anIntArray517[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class200.anIntArray337[arg3];
								local277 = Class200.anIntArray338[arg3];
								local295 = this.anIntArray521[local54] * local60 + local277 * this.anIntArray519[local54] + 16383 >> 14;
								this.anIntArray521[local54] = local277 * this.anIntArray521[local54] + 16383 - local60 * this.anIntArray519[local54] >> 14;
								this.anIntArray519[local54] = local295;
							}
							this.anIntArray519[local54] += Static401.anInt7136;
							this.anIntArray517[local54] += Static41.anInt674;
							this.anIntArray521[local54] += Static486.anInt8172;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray519[local54] -= Static401.anInt7136;
							this.anIntArray517[local54] -= Static41.anInt674;
							this.anIntArray521[local54] -= Static486.anInt8172;
							if (arg2 != 0) {
								local60 = Class200.anIntArray337[arg2];
								local277 = Class200.anIntArray338[arg2];
								local295 = local277 * this.anIntArray517[local54] + 16383 - this.anIntArray521[local54] * local60 >> 14;
								this.anIntArray521[local54] = this.anIntArray521[local54] * local277 + local60 * this.anIntArray517[local54] + 16383 >> 14;
								this.anIntArray517[local54] = local295;
							}
							if (arg4 != 0) {
								local60 = Class200.anIntArray337[arg4];
								local277 = Class200.anIntArray338[arg4];
								local295 = this.anIntArray517[local54] * local60 + this.anIntArray519[local54] * local277 + 16383 >> 14;
								this.anIntArray517[local54] = local277 * this.anIntArray517[local54] + 16383 - local60 * this.anIntArray519[local54] >> 14;
								this.anIntArray519[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class200.anIntArray337[arg3];
								local277 = Class200.anIntArray338[arg3];
								local295 = local60 * this.anIntArray521[local54] + local277 * this.anIntArray519[local54] + 16383 >> 14;
								this.anIntArray521[local54] = local277 * this.anIntArray521[local54] + 16383 - local60 * this.anIntArray519[local54] >> 14;
								this.anIntArray519[local54] = local295;
							}
							this.anIntArray519[local54] += Static401.anInt7136;
							this.anIntArray517[local54] += Static41.anInt674;
							this.anIntArray521[local54] += Static486.anInt8172;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray52.length) {
						local52 = this.anIntArrayArray52[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local277 = this.anIntArray520[local60];
							local295 = this.anIntArray520[local60 + 1];
							for (local752 = local277; local752 < local295; local752++) {
								@Pc(761) int local761 = this.aShortArray125[local752] - 1;
								if (local761 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class200.anIntArray337[arg4];
									local774 = Class200.anIntArray338[arg4];
									local792 = local774 * this.aShortArray127[local761] + local770 * this.aShortArray126[local761] + 16383 >> 14;
									this.aShortArray126[local761] = (short) (this.aShortArray126[local761] * local774 + 16383 - local770 * this.aShortArray127[local761] >> 14);
									this.aShortArray127[local761] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class200.anIntArray337[arg2];
									local774 = Class200.anIntArray338[arg2];
									local792 = this.aShortArray126[local761] * local774 + 16383 - local770 * this.aShortArray128[local761] >> 14;
									this.aShortArray128[local761] = (short) (local774 * this.aShortArray128[local761] + this.aShortArray126[local761] * local770 + 16383 >> 14);
									this.aShortArray126[local761] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class200.anIntArray337[arg3];
									local774 = Class200.anIntArray338[arg3];
									local792 = this.aShortArray127[local761] * local774 + this.aShortArray128[local761] * local770 + 16383 >> 14;
									this.aShortArray128[local761] = (short) (this.aShortArray128[local761] * local774 + 16383 - local770 * this.aShortArray127[local761] >> 14);
									this.aShortArray127[local761] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass79_12 == null && this.aClass79_10 != null) {
					this.aClass79_10.anInterface17_4 = null;
				}
				if (this.aClass79_12 != null) {
					this.aClass79_12.anInterface17_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray52.length) {
					local162 = this.anIntArrayArray52[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray519[local54] -= Static401.anInt7136;
						this.anIntArray517[local54] -= Static41.anInt674;
						this.anIntArray521[local54] -= Static486.anInt8172;
						this.anIntArray519[local54] = this.anIntArray519[local54] * arg2 >> 7;
						this.anIntArray517[local54] = arg3 * this.anIntArray517[local54] >> 7;
						this.anIntArray521[local54] = this.anIntArray521[local54] * arg4 >> 7;
						this.anIntArray519[local54] += Static401.anInt7136;
						this.anIntArray517[local54] += Static41.anInt674;
						this.anIntArray521[local54] += Static486.anInt8172;
					}
				}
			}
		} else {
			@Pc(1201) Class223 local1201;
			@Pc(1206) Class76 local1206;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray53.length) {
							local162 = this.anIntArrayArray53[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local54 = local162[local164];
								local60 = (this.aByteArray95[local54] & 0xFF) + arg2 * 8;
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray95[local54] = (byte) local60;
							}
							if (local162.length > 0 && this.aClass79_10 != null) {
								this.aClass79_10.anInterface17_4 = null;
							}
						}
					}
					if (this.aClass223Array1 != null) {
						for (local32 = 0; local32 < this.anInt9442; local32++) {
							local1201 = this.aClass223Array1[local32];
							local1206 = this.aClass76Array1[local32];
							local1206.anInt2165 = local1206.anInt2165 & 0xFFFFFF | 255 - (this.aByteArray95[local1201.anInt6523] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1455) Class76 local1455;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray54.length > local32) {
								local162 = this.anIntArrayArray54[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1455 = this.aClass76Array1[local162[local164]];
									local1455.anInt2162 += arg2;
									local1455.anInt2167 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray54.length > local32) {
								local162 = this.anIntArrayArray54[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1455 = this.aClass76Array1[local162[local164]];
									local1455.anInt2164 = local1455.anInt2164 * arg2 >> 7;
									local1455.anInt2168 = local1455.anInt2168 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray54.length) {
							local162 = this.anIntArrayArray54[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1455 = this.aClass76Array1[local162[local164]];
								local1455.anInt2163 = arg2 + local1455.anInt2163 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray53 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray53.length) {
						local162 = this.anIntArrayArray53[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							local60 = this.aShortArray129[local54] & 0xFFFF;
							local277 = local60 >> 10 & 0x3F;
							local295 = local60 >> 7 & 0x7;
							@Pc(1294) int local1294 = arg2 + local277 & 0x3F;
							local295 += arg3 / 4;
							local752 = local60 & 0x7F;
							local752 += arg4;
							if (local295 < 0) {
								local295 = 0;
							} else if (local295 > 7) {
								local295 = 7;
							}
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray129[local54] = (short) (local752 | local1294 << 10 | local295 << 7);
						}
						if (local162.length > 0 && this.aClass79_10 != null) {
							this.aClass79_10.anInterface17_4 = null;
						}
					}
				}
				if (this.aClass223Array1 != null) {
					for (local32 = 0; local32 < this.anInt9442; local32++) {
						local1201 = this.aClass223Array1[local32];
						local1206 = this.aClass76Array1[local32];
						local1206.anInt2165 = local1206.anInt2165 & 0xFF000000 | Static336.anIntArray357[this.aShortArray129[local1201.anInt6523] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
	private void method7975(@OriginalArg(0) boolean arg0) {
		if (this.lb * 6 <= this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2.aByteArray93.length) {
			this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2.anInt9230 = 0;
		} else {
			this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2 = new Class5_Sub41_Sub1((this.lb + 100) * 6);
		}
		@Pc(38) Class5_Sub41_Sub1 local38 = this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass65_Sub1_34.aBoolean97) {
			for (local44 = 0; local44 < this.lb; local44++) {
				local38.method7848(this.aShortArray133[local44]);
				local38.method7848(this.aShortArray130[local44]);
				local38.method7848(this.aShortArray131[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.lb; local44++) {
				local38.method7821(this.aShortArray133[local44]);
				local38.method7821(this.aShortArray130[local44]);
				local38.method7821(this.aShortArray131[local44]);
			}
		}
		if (local38.anInt9230 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface23_5 == null) {
				this.anInterface23_5 = this.aClass65_Sub1_34.method1292(local38.anInt9230, true, local38.aByteArray93);
			} else {
				this.anInterface23_5.method9043(local38.anInt9230, local38.aByteArray93);
			}
			this.aClass42_1.anInterface23_2 = this.anInterface23_5;
		} else {
			this.aClass42_1.anInterface23_2 = this.aClass65_Sub1_34.method1292(local38.anInt9230, false, local38.aByteArray93);
		}
		if (!arg0) {
			this.aBoolean799 = true;
		}
	}

	@OriginalMember(owner = "client!to", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static401.anInt7136 = 0;
			Static41.anInt674 = 0;
			Static486.anInt8172 = 0;
			for (local20 = 0; local20 < this.anInt9466; local20++) {
				Static401.anInt7136 += this.anIntArray519[local20];
				Static41.anInt674 += this.anIntArray517[local20];
				local12++;
				Static486.anInt8172 += this.anIntArray521[local20];
			}
			if (local12 > 0) {
				Static41.anInt674 = Static41.anInt674 / local12 + arg2;
				Static486.anInt8172 = arg3 + Static486.anInt8172 / local12;
				Static401.anInt7136 = Static401.anInt7136 / local12 + arg1;
			} else {
				Static401.anInt7136 = arg1;
				Static486.anInt8172 = arg3;
				Static41.anInt674 = arg2;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt9466; local12++) {
				this.anIntArray519[local12] += arg1;
				this.anIntArray517[local12] += arg2;
				this.anIntArray521[local12] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt9466; local12++) {
					this.anIntArray519[local12] -= Static401.anInt7136;
					this.anIntArray517[local12] -= Static41.anInt674;
					this.anIntArray521[local12] -= Static486.anInt8172;
					if (arg3 != 0) {
						local20 = Class200.anIntArray337[arg3];
						local164 = Class200.anIntArray338[arg3];
						local182 = this.anIntArray517[local12] * local20 + local164 * this.anIntArray519[local12] + 16383 >> 14;
						this.anIntArray517[local12] = local164 * this.anIntArray517[local12] + 16383 - local20 * this.anIntArray519[local12] >> 14;
						this.anIntArray519[local12] = local182;
					}
					if (arg1 != 0) {
						local20 = Class200.anIntArray337[arg1];
						local164 = Class200.anIntArray338[arg1];
						local182 = this.anIntArray517[local12] * local164 + 16383 - local20 * this.anIntArray521[local12] >> 14;
						this.anIntArray521[local12] = this.anIntArray517[local12] * local20 + this.anIntArray521[local12] * local164 + 16383 >> 14;
						this.anIntArray517[local12] = local182;
					}
					if (arg2 != 0) {
						local20 = Class200.anIntArray337[arg2];
						local164 = Class200.anIntArray338[arg2];
						local182 = local164 * this.anIntArray519[local12] + local20 * this.anIntArray521[local12] + 16383 >> 14;
						this.anIntArray521[local12] = this.anIntArray521[local12] * local164 + 16383 - this.anIntArray519[local12] * local20 >> 14;
						this.anIntArray519[local12] = local182;
					}
					this.anIntArray519[local12] += Static401.anInt7136;
					this.anIntArray517[local12] += Static41.anInt674;
					this.anIntArray521[local12] += Static486.anInt8172;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt9466; local12++) {
					this.anIntArray519[local12] -= Static401.anInt7136;
					this.anIntArray517[local12] -= Static41.anInt674;
					this.anIntArray521[local12] -= Static486.anInt8172;
					this.anIntArray519[local12] = arg1 * this.anIntArray519[local12] / 128;
					this.anIntArray517[local12] = arg2 * this.anIntArray517[local12] / 128;
					this.anIntArray521[local12] = this.anIntArray521[local12] * arg3 / 128;
					this.anIntArray519[local12] += Static401.anInt7136;
					this.anIntArray517[local12] += Static41.anInt674;
					this.anIntArray521[local12] += Static486.anInt8172;
				}
			} else {
				@Pc(518) Class223 local518;
				@Pc(523) Class76 local523;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt9474; local12++) {
						local20 = arg1 * 8 + (this.aByteArray95[local12] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray95[local12] = (byte) local20;
					}
					if (this.aClass79_10 != null) {
						this.aClass79_10.anInterface17_4 = null;
					}
					if (this.aClass223Array1 != null) {
						for (local20 = 0; local20 < this.anInt9442; local20++) {
							local518 = this.aClass223Array1[local20];
							local523 = this.aClass76Array1[local20];
							local523.anInt2165 = local523.anInt2165 & 0xFFFFFF | 255 - (this.aByteArray95[local518.anInt6523] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt9474; local12++) {
						local20 = this.aShortArray129[local12] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						@Pc(584) int local584 = arg1 + local164 & 0x3F;
						local182 += arg2 / 4;
						@Pc(594) int local594 = local20 & 0x7F;
						local594 += arg3;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						if (local594 < 0) {
							local594 = 0;
						} else if (local594 > 127) {
							local594 = 127;
						}
						this.aShortArray129[local12] = (short) (local182 << 7 | local584 << 10 | local594);
					}
					if (this.aClass79_10 != null) {
						this.aClass79_10.anInterface17_4 = null;
					}
					if (this.aClass223Array1 != null) {
						for (local20 = 0; local20 < this.anInt9442; local20++) {
							local518 = this.aClass223Array1[local20];
							local523 = this.aClass76Array1[local20];
							local523.anInt2165 = Static336.anIntArray357[this.aShortArray129[local518.anInt6523] & 0xFFFF] & 0xFFFFFF | local523.anInt2165 & 0xFF000000;
						}
					}
				} else {
					@Pc(716) Class76 local716;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt9442; local12++) {
							local716 = this.aClass76Array1[local12];
							local716.anInt2167 += arg2;
							local716.anInt2162 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt9442; local12++) {
							local716 = this.aClass76Array1[local12];
							local716.anInt2168 = arg2 * local716.anInt2168 >> 7;
							local716.anInt2164 = arg1 * local716.anInt2164 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt9442; local12++) {
							local716 = this.aClass76Array1[local12];
							local716.anInt2163 = local716.anInt2163 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!oha;ZI)Z")
	@Override
	public boolean method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7968(arg4, arg3, arg1, -1, arg0, arg2);
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	private void method7976() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt9466; local23++) {
			@Pc(30) int local30 = this.anIntArray519[local23];
			@Pc(35) int local35 = this.anIntArray517[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			@Pc(63) int local63 = this.anIntArray521[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local63 < local11) {
				local11 = local63;
			}
			if (local63 > local17) {
				local17 = local63;
			}
			@Pc(98) int local98 = local30 * local30 + local63 * local63;
			if (local98 > local19) {
				local19 = local98;
			}
			local98 = local63 * local63 + local30 * local30 + local35 * local35;
			if (local98 > local21) {
				local21 = local98;
			}
		}
		this.aShort102 = (short) local7;
		this.aShort100 = (short) local11;
		this.aShort101 = (short) local15;
		this.aShort96 = (short) local17;
		this.aShort97 = (short) local13;
		this.aShort99 = (short) local9;
		this.aShort95 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort103 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean798 = true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZ)V")
	private void method7977(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null;
		@Pc(27) boolean local27 = this.aClass79_12 != null && this.aClass79_12.anInterface17_4 == null;
		@Pc(38) boolean local38 = this.aClass79_11 != null && this.aClass79_11.anInterface17_4 == null;
		@Pc(49) boolean local49 = this.aClass79_9 != null && this.aClass79_9.anInterface17_4 == null;
		if (arg0) {
			local16 &= (this.aByte129 & 0x2) != 0;
			local49 &= (this.aByte129 & 0x8) != 0;
			local38 &= (this.aByte129 & 0x1) != 0;
			local27 &= (this.aByte129 & 0x4) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local112 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local114 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local116 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2.aByteArray93.length < local100 * this.anInt9452) {
			this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2 = new Class5_Sub41_Sub1(local100 * (this.anInt9452 + 100));
		} else {
			this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2.anInt9230 = 0;
		}
		@Pc(192) Class5_Sub41_Sub1 local192 = this.aClass65_Sub1_34.aClass5_Sub41_Sub1_2;
		@Pc(200) int local200;
		@Pc(209) int local209;
		@Pc(237) int local237;
		@Pc(246) int local246;
		if (local38) {
			@Pc(216) int local216;
			@Pc(223) int local223;
			@Pc(228) int local228;
			@Pc(235) int local235;
			if (this.aClass65_Sub1_34.aBoolean97) {
				for (local200 = 0; local200 < this.anInt9466; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray519[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray517[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray521[local200]);
					local228 = this.anIntArray520[local200];
					local235 = this.anIntArray520[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray125[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt9230 = local246 * local100;
						local192.method7803(local209);
						local192.method7803(local216);
						local192.method7803(local223);
					}
				}
			} else {
				for (local200 = 0; local200 < this.anInt9466; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray519[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray517[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray521[local200]);
					local228 = this.anIntArray520[local200];
					local235 = this.anIntArray520[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray125[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt9230 = local100 * local246;
						local192.method7856(local209);
						local192.method7856(local216);
						local192.method7856(local223);
					}
				}
			}
		}
		@Pc(505) float local505;
		@Pc(387) short[] local387;
		@Pc(383) short[] local383;
		@Pc(391) short[] local391;
		@Pc(379) byte[] local379;
		@Pc(541) float local541;
		if (local16) {
			if (this.aClass79_12 == null) {
				if (this.aClass291_1 == null) {
					local379 = this.aByteArray94;
					local387 = this.aShortArray127;
					local383 = this.aShortArray126;
					local391 = this.aShortArray128;
				} else {
					local379 = this.aClass291_1.aByteArray77;
					local383 = this.aClass291_1.aShortArray90;
					local387 = this.aClass291_1.aShortArray88;
					local391 = this.aClass291_1.aShortArray89;
				}
				@Pc(411) float local411 = this.aClass65_Sub1_34.aFloatArray5[0];
				@Pc(417) float local417 = this.aClass65_Sub1_34.aFloatArray5[1];
				@Pc(423) float local423 = this.aClass65_Sub1_34.aFloatArray5[2];
				@Pc(427) float local427 = this.aClass65_Sub1_34.aFloat13;
				@Pc(437) float local437 = this.aClass65_Sub1_34.aFloat26 * 768.0F / (float) this.aShort104;
				@Pc(447) float local447 = this.aClass65_Sub1_34.aFloat28 * 768.0F / (float) this.aShort104;
				for (@Pc(449) int local449 = 0; local449 < this.anInt9474; local449++) {
					@Pc(469) int local469 = this.method7980(this.aShort98, this.aShortArray132[local449], this.aShortArray129[local449], this.aByteArray95[local449]);
					@Pc(478) float local478 = (float) (local469 >>> 24) * this.aClass65_Sub1_34.aFloat23;
					@Pc(489) float local489 = this.aClass65_Sub1_34.aFloat24 * (float) (local469 >> 8 & 0xFF);
					@Pc(494) short local494 = this.aShortArray133[local449];
					local505 = (float) (local469 >> 16 & 0xFF) * this.aClass65_Sub1_34.aFloat22;
					@Pc(510) short local510 = (short) local379[local494];
					if (local510 == 0) {
						local541 = (local411 * (float) local387[local494] + local417 * (float) local383[local494] + (float) local391[local494] * local423) * 0.0026041667F;
					} else {
						local541 = ((float) local387[local494] * local411 + (float) local383[local494] * local417 + local423 * (float) local391[local494]) / (float) (local510 * 256);
					}
					@Pc(578) float local578 = (local541 < 0.0F ? local447 : local437) * local541 + local427;
					@Pc(583) int local583 = (int) (local578 * local478);
					@Pc(588) int local588 = (int) (local578 * local505);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					@Pc(620) int local620 = (int) (local578 * local489);
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local192.anInt9230 = local112 + local494 * local100;
					local192.method7798(local583);
					local192.method7798(local588);
					local192.method7798(local620);
					local192.method7798(255 - (this.aByteArray95[local449] & 0xFF));
					local494 = this.aShortArray130[local449];
					local510 = (short) local379[local494];
					if (local510 == 0) {
						local541 = (local423 * (float) local391[local494] + local411 * (float) local387[local494] + local417 * (float) local383[local494]) * 0.0026041667F;
					} else {
						local541 = (local411 * (float) local387[local494] + local417 * (float) local383[local494] + (float) local391[local494] * local423) / (float) (local510 * 256);
					}
					local578 = local427 + local541 * (local541 < 0.0F ? local447 : local437);
					local583 = (int) (local578 * local478);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					local588 = (int) (local578 * local505);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local620 = (int) (local578 * local489);
					local192.anInt9230 = local100 * local494 + local112;
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local192.method7798(local583);
					local192.method7798(local588);
					local192.method7798(local620);
					local192.method7798(255 - (this.aByteArray95[local449] & 0xFF));
					local494 = this.aShortArray131[local449];
					local510 = (short) local379[local494];
					if (local510 == 0) {
						local541 = ((float) local391[local494] * local423 + local411 * (float) local387[local494] + local417 * (float) local383[local494]) * 0.0026041667F;
					} else {
						local541 = ((float) local391[local494] * local423 + (float) local383[local494] * local417 + local411 * (float) local387[local494]) / (float) (local510 * 256);
					}
					local578 = local541 * (local541 < 0.0F ? local447 : local437) + local427;
					local583 = (int) (local578 * local478);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					local588 = (int) (local578 * local505);
					local620 = (int) (local578 * local489);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local192.anInt9230 = local112 + local494 * local100;
					if (local620 < 0) {
						local620 = 0;
					} else if (local620 > 255) {
						local620 = 255;
					}
					local192.method7798(local583);
					local192.method7798(local588);
					local192.method7798(local620);
					local192.method7798(255 - (this.aByteArray95[local449] & 0xFF));
				}
			} else {
				for (local200 = 0; local200 < this.anInt9474; local200++) {
					local209 = this.method7980(this.aShort98, this.aShortArray132[local200], this.aShortArray129[local200], this.aByteArray95[local200]);
					local192.anInt9230 = local100 * this.aShortArray133[local200] + local112;
					local192.method7803(local209);
					local192.anInt9230 = local100 * this.aShortArray130[local200] + local112;
					local192.method7803(local209);
					local192.anInt9230 = this.aShortArray131[local200] * local100 + local112;
					local192.method7803(local209);
				}
			}
		}
		if (local27) {
			if (this.aClass291_1 == null) {
				local379 = this.aByteArray94;
				local383 = this.aShortArray126;
				local391 = this.aShortArray128;
				local387 = this.aShortArray127;
			} else {
				local391 = this.aClass291_1.aShortArray89;
				local383 = this.aClass291_1.aShortArray90;
				local387 = this.aClass291_1.aShortArray88;
				local379 = this.aClass291_1.aByteArray77;
			}
			@Pc(1116) float local1116 = 3.0F / (float) this.aShort104;
			local192.anInt9230 = local114;
			local541 = 3.0F / (float) (this.aShort104 / 2 + this.aShort104);
			if (this.aClass65_Sub1_34.aBoolean97) {
				for (local237 = 0; local237 < this.anInt9452; local237++) {
					local246 = local379[local237] & 0xFF;
					if (local246 == 0) {
						local192.method6771((float) local387[local237] * local541);
						local192.method6771((float) local383[local237] * local541);
						local192.method6771((float) local391[local237] * local541);
					} else {
						local505 = local1116 / (float) local246;
						local192.method6771(local505 * (float) local387[local237]);
						local192.method6771(local505 * (float) local383[local237]);
						local192.method6771(local505 * (float) local391[local237]);
					}
					local192.anInt9230 += local100 - 12;
				}
			} else {
				for (local237 = 0; local237 < this.anInt9452; local237++) {
					local246 = local379[local237] & 0xFF;
					if (local246 == 0) {
						local192.method6768(local541 * (float) local387[local237]);
						local192.method6768((float) local383[local237] * local541);
						local192.method6768((float) local391[local237] * local541);
					} else {
						local505 = local1116 / (float) local246;
						local192.method6768(local505 * (float) local387[local237]);
						local192.method6768((float) local383[local237] * local505);
						local192.method6768(local505 * (float) local391[local237]);
					}
					local192.anInt9230 += local100 - 12;
				}
			}
		}
		if (local49) {
			local192.anInt9230 = local116;
			if (this.aClass65_Sub1_34.aBoolean97) {
				for (local200 = 0; local200 < this.anInt9452; local200++) {
					local192.method6771(this.aFloatArray89[local200]);
					local192.method6771(this.aFloatArray90[local200]);
					local192.anInt9230 += local100 - 8;
				}
			} else {
				for (local200 = 0; local200 < this.anInt9452; local200++) {
					local192.method6768(this.aFloatArray89[local200]);
					local192.method6768(this.aFloatArray90[local200]);
					local192.anInt9230 += local100 - 8;
				}
			}
		}
		local192.anInt9230 = local100 * this.anInt9452;
		@Pc(1435) Interface17 local1435;
		if (arg0) {
			if (this.anInterface17_6 == null) {
				this.anInterface17_6 = this.aClass65_Sub1_34.method1223(local192.aByteArray93, true, local192.anInt9230, local100);
			} else {
				this.anInterface17_6.method6469(local192.aByteArray93, local192.anInt9230, local100);
			}
			this.aByte129 = 0;
			local1435 = this.anInterface17_6;
		} else {
			local1435 = this.aClass65_Sub1_34.method1223(local192.aByteArray93, false, local192.anInt9230, local100);
			this.aBoolean799 = true;
		}
		if (local38) {
			this.aClass79_11.anInterface17_4 = local1435;
			this.aClass79_11.aByte17 = 0;
		}
		if (local49) {
			this.aClass79_9.aByte17 = local116;
			this.aClass79_9.anInterface17_4 = local1435;
		}
		if (local16) {
			this.aClass79_10.aByte17 = local112;
			this.aClass79_10.anInterface17_4 = local1435;
		}
		if (local27) {
			this.aClass79_12.anInterface17_4 = local1435;
			this.aClass79_12.aByte17 = local114;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9466; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray521[local15] + local13 * this.anIntArray519[local15] >> 14;
			this.anIntArray521[local15] = local13 * this.anIntArray521[local15] - this.anIntArray519[local15] * local9 >> 14;
			this.anIntArray519[local15] = local34;
		}
		this.aBoolean798 = false;
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "()V")
	@Override
	protected void method8592() {
	}

	@OriginalMember(owner = "client!to", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9466; local15++) {
			local33 = this.anIntArray519[local15] * local13 + this.anIntArray521[local15] * local9 >> 14;
			this.anIntArray521[local15] = local13 * this.anIntArray521[local15] - this.anIntArray519[local15] * local9 >> 14;
			this.anIntArray519[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt9452; local33++) {
			@Pc(87) int local87 = this.aShortArray127[local33] * local13 + this.aShortArray128[local33] * local9 >> 14;
			this.aShortArray128[local33] = (short) (local13 * this.aShortArray128[local33] - local9 * this.aShortArray127[local33] >> 14);
			this.aShortArray127[local33] = (short) local87;
		}
		if (this.aClass79_12 == null && this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
		if (this.aClass79_12 != null) {
			this.aClass79_12.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!to", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9464; local3++) {
			this.anIntArray519[local3] = this.anIntArray519[local3] + 7 >> 4;
			this.anIntArray517[local3] = this.anIntArray517[local3] + 7 >> 4;
			this.anIntArray521[local3] = this.anIntArray521[local3] + 7 >> 4;
		}
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
	}

	@OriginalMember(owner = "client!to", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!to", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()[Lclient!sba;")
	@Override
	public Class313[] method8575() {
		return this.aClass313Array4;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method8589(@OriginalArg(0) Class254 arg0) {
		@Pc(8) Class254_Sub1 local8 = (Class254_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass313Array4 != null) {
			for (local13 = 0; local13 < this.aClass313Array4.length; local13++) {
				@Pc(20) Class313 local20 = this.aClass313Array4[local13];
				@Pc(22) Class313 local22 = local20;
				if (local20.aClass313_1 != null) {
					local22 = local20.aClass313_1;
				}
				local22.anInt8778 = (int) ((float) this.anIntArray517[local20.anInt8781] * local8.aFloat136 + (float) this.anIntArray519[local20.anInt8781] * local8.aFloat134 + local8.aFloat138 * (float) this.anIntArray521[local20.anInt8781] + local8.aFloat137);
				local22.anInt8790 = (int) (local8.aFloat131 + (float) this.anIntArray521[local20.anInt8781] * local8.aFloat133 + local8.aFloat140 * (float) this.anIntArray517[local20.anInt8781] + local8.aFloat135 * (float) this.anIntArray519[local20.anInt8781]);
				local22.anInt8779 = (int) (local8.aFloat132 + local8.aFloat130 * (float) this.anIntArray521[local20.anInt8781] + (float) this.anIntArray519[local20.anInt8781] * local8.aFloat139 + local8.aFloat141 * (float) this.anIntArray517[local20.anInt8781]);
				local22.anInt8788 = (int) (local8.aFloat137 + (float) this.anIntArray521[local20.anInt8793] * local8.aFloat138 + local8.aFloat134 * (float) this.anIntArray519[local20.anInt8793] + (float) this.anIntArray517[local20.anInt8793] * local8.aFloat136);
				local22.anInt8777 = (int) (local8.aFloat131 + (float) this.anIntArray519[local20.anInt8793] * local8.aFloat135 + (float) this.anIntArray517[local20.anInt8793] * local8.aFloat140 + local8.aFloat133 * (float) this.anIntArray521[local20.anInt8793]);
				local22.anInt8783 = (int) (local8.aFloat141 * (float) this.anIntArray517[local20.anInt8793] + local8.aFloat139 * (float) this.anIntArray519[local20.anInt8793] + (float) this.anIntArray521[local20.anInt8793] * local8.aFloat130 + local8.aFloat132);
				local22.anInt8784 = (int) (local8.aFloat137 + local8.aFloat136 * (float) this.anIntArray517[local20.anInt8786] + (float) this.anIntArray519[local20.anInt8786] * local8.aFloat134 + local8.aFloat138 * (float) this.anIntArray521[local20.anInt8786]);
				local22.anInt8789 = (int) ((float) this.anIntArray521[local20.anInt8786] * local8.aFloat133 + local8.aFloat135 * (float) this.anIntArray519[local20.anInt8786] + local8.aFloat140 * (float) this.anIntArray517[local20.anInt8786] + local8.aFloat131);
				local22.anInt8780 = (int) (local8.aFloat132 + local8.aFloat130 * (float) this.anIntArray521[local20.anInt8786] + local8.aFloat139 * (float) this.anIntArray519[local20.anInt8786] + (float) this.anIntArray517[local20.anInt8786] * local8.aFloat141);
			}
		}
		if (this.aClass209Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass209Array4.length; local13++) {
			@Pc(365) Class209 local365 = this.aClass209Array4[local13];
			@Pc(367) Class209 local367 = local365;
			if (local365.aClass209_1 != null) {
				local367 = local365.aClass209_1;
			}
			if (local365.aClass254_4 == null) {
				local365.aClass254_4 = local8.method7353();
			} else {
				local365.aClass254_4.method7356(local8);
			}
			local367.anInt6176 = (int) ((float) this.anIntArray519[local365.anInt6178] * local8.aFloat134 + local8.aFloat136 * (float) this.anIntArray517[local365.anInt6178] + local8.aFloat138 * (float) this.anIntArray521[local365.anInt6178] + local8.aFloat137);
			local367.anInt6174 = (int) (local8.aFloat140 * (float) this.anIntArray517[local365.anInt6178] + local8.aFloat135 * (float) this.anIntArray519[local365.anInt6178] + local8.aFloat133 * (float) this.anIntArray521[local365.anInt6178] + local8.aFloat131);
			local367.anInt6182 = (int) (local8.aFloat132 + local8.aFloat141 * (float) this.anIntArray517[local365.anInt6178] + (float) this.anIntArray519[local365.anInt6178] * local8.aFloat139 + local8.aFloat130 * (float) this.anIntArray521[local365.anInt6178]);
		}
	}

	@OriginalMember(owner = "client!to", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort104 = (short) arg0;
		if (this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
		if (this.aClass79_12 != null) {
			this.aClass79_12.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oha;Lclient!vu;II)V")
	@Override
	public void method8594(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9452 == 0) {
			return;
		}
		@Pc(16) Class254_Sub1 local16 = this.aClass65_Sub1_34.bf;
		if (!this.aBoolean798) {
			this.method7976();
		}
		@Pc(25) Class254_Sub1 local25 = (Class254_Sub1) arg0;
		Static582.aFloat217 = local25.aFloat131 * local16.aFloat141 + local25.aFloat137 * local16.aFloat139 + local16.aFloat130 * local25.aFloat132 + local16.aFloat132;
		Static413.aFloat142 = local25.aFloat136 * local16.aFloat139 + local16.aFloat141 * local25.aFloat140 + local25.aFloat141 * local16.aFloat130;
		@Pc(72) float local72 = (float) this.aShort99 * Static413.aFloat142 + Static582.aFloat217;
		@Pc(80) float local80 = Static582.aFloat217 + Static413.aFloat142 * (float) this.aShort101;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.aShort95;
			local96 = (float) this.aShort95 + local72;
		} else {
			local96 = (float) this.aShort95 + local80;
			local90 = (float) -this.aShort95 + local72;
		}
		if (local90 >= this.aClass65_Sub1_34.aFloat25 || local96 <= (float) this.aClass65_Sub1_34.anInt1404) {
			return;
		}
		Static672.aFloat216 = local25.aFloat141 * local16.aFloat138 + local25.aFloat140 * local16.aFloat136 + local16.aFloat134 * local25.aFloat136;
		Static553.aFloat191 = local16.aFloat136 * local25.aFloat131 + local25.aFloat137 * local16.aFloat134 + local16.aFloat138 * local25.aFloat132 + local16.aFloat137;
		@Pc(173) float local173 = Static672.aFloat216 * (float) this.aShort99 + Static553.aFloat191;
		@Pc(181) float local181 = Static553.aFloat191 + Static672.aFloat216 * (float) this.aShort101;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local207 = (float) this.aClass65_Sub1_34.anInt1398 * (local181 - (float) this.aShort95);
			local196 = (float) this.aClass65_Sub1_34.anInt1398 * ((float) this.aShort95 + local173);
		} else {
			local196 = (local181 + (float) this.aShort95) * (float) this.aClass65_Sub1_34.anInt1398;
			local207 = (local173 - (float) this.aShort95) * (float) this.aClass65_Sub1_34.anInt1398;
		}
		if (this.aClass65_Sub1_34.aFloat20 <= local207 / (float) arg2 || local196 / (float) arg2 <= this.aClass65_Sub1_34.aFloat30) {
			return;
		}
		Static163.aFloat84 = local25.aFloat141 * local16.aFloat133 + local16.aFloat135 * local25.aFloat136 + local25.aFloat140 * local16.aFloat140;
		Static548.aFloat189 = local16.aFloat131 + local16.aFloat135 * local25.aFloat137 + local25.aFloat131 * local16.aFloat140 + local16.aFloat133 * local25.aFloat132;
		@Pc(298) float local298 = (float) this.aShort99 * Static163.aFloat84 + Static548.aFloat189;
		@Pc(306) float local306 = Static163.aFloat84 * (float) this.aShort101 + Static548.aFloat189;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local306 < local298) {
			local333 = (local298 + (float) this.aShort95) * (float) this.aClass65_Sub1_34.anInt1396;
			local322 = (float) this.aClass65_Sub1_34.anInt1396 * ((float) -this.aShort95 + local306);
		} else {
			local322 = ((float) -this.aShort95 + local298) * (float) this.aClass65_Sub1_34.anInt1396;
			local333 = ((float) this.aShort95 + local306) * (float) this.aClass65_Sub1_34.anInt1396;
		}
		if (local322 / (float) arg2 >= this.aClass65_Sub1_34.aFloat32 || this.aClass65_Sub1_34.aFloat12 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass223Array1 != null) {
			Static238.aFloat92 = local25.aFloat139 * local16.aFloat133 + local16.aFloat135 * local25.aFloat134 + local25.aFloat135 * local16.aFloat140;
			Static36.aFloat4 = local16.aFloat130 * local25.aFloat139 + local25.aFloat135 * local16.aFloat141 + local16.aFloat139 * local25.aFloat134;
			Static384.aFloat127 = local16.aFloat135 * local25.aFloat138 + local25.aFloat133 * local16.aFloat140 + local25.aFloat130 * local16.aFloat133;
			Static388.aFloat129 = local25.aFloat135 * local16.aFloat136 + local25.aFloat134 * local16.aFloat134 + local16.aFloat138 * local25.aFloat139;
			Static643.aFloat212 = local16.aFloat130 * local25.aFloat130 + local25.aFloat138 * local16.aFloat139 + local16.aFloat141 * local25.aFloat133;
			Static204.aFloat88 = local16.aFloat136 * local25.aFloat133 + local25.aFloat138 * local16.aFloat134 + local25.aFloat130 * local16.aFloat138;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort97 + this.aShort102 >> 1;
			@Pc(509) int local509 = this.aShort100 + this.aShort96 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static204.aFloat88 + Static553.aFloat191 + Static388.aFloat129 * (float) local501 + Static672.aFloat216 * (float) this.aShort99);
			@Pc(547) int local547 = (int) (Static548.aFloat189 + Static238.aFloat92 * (float) local501 + Static163.aFloat84 * (float) this.aShort99 + Static384.aFloat127 * (float) local509);
			@Pc(566) int local566 = (int) ((float) local509 * Static643.aFloat212 + Static582.aFloat217 + (float) local501 * Static36.aFloat4 + Static413.aFloat142 * (float) this.aShort99);
			@Pc(585) int local585 = (int) (Static388.aFloat129 * (float) local501 + Static553.aFloat191 + Static672.aFloat216 * (float) this.aShort101 + (float) local509 * Static204.aFloat88);
			@Pc(604) int local604 = (int) (Static384.aFloat127 * (float) local509 + (float) local501 * Static238.aFloat92 + Static548.aFloat189 + Static163.aFloat84 * (float) this.aShort101);
			arg1.anInt10431 = local528 * this.aClass65_Sub1_34.anInt1398 / arg2 + this.aClass65_Sub1_34.anInt1406;
			arg1.anInt10432 = this.aClass65_Sub1_34.anInt1406 + local585 * this.aClass65_Sub1_34.anInt1398 / arg2;
			arg1.anInt10430 = local604 * this.aClass65_Sub1_34.anInt1396 / arg2 + this.aClass65_Sub1_34.anInt1424;
			@Pc(662) int local662 = (int) (Static643.aFloat212 * (float) local509 + (float) this.aShort101 * Static413.aFloat142 + Static36.aFloat4 * (float) local501 + Static582.aFloat217);
			arg1.anInt10433 = local547 * this.aClass65_Sub1_34.anInt1396 / arg2 + this.aClass65_Sub1_34.anInt1424;
			if (local566 >= this.aClass65_Sub1_34.anInt1404 || this.aClass65_Sub1_34.anInt1404 <= local662) {
				arg1.aBoolean890 = true;
				arg1.anInt10434 = this.aClass65_Sub1_34.anInt1406 + (local528 + this.aShort95) * this.aClass65_Sub1_34.anInt1398 / arg2 - arg1.anInt10431;
			}
		}
		this.aClass65_Sub1_34.method1279((float) arg2);
		this.aClass65_Sub1_34.method1220();
		this.aClass65_Sub1_34.method1243(local25);
		this.method7978();
		this.aClass65_Sub1_34.method1283();
		this.method7973();
	}

	@OriginalMember(owner = "client!to", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9474; local3++) {
			if (arg0 == this.aShortArray129[local3]) {
				this.aShortArray129[local3] = arg1;
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt9442; local34++) {
				@Pc(41) Class223 local41 = this.aClass223Array1[local34];
				@Pc(46) Class76 local46 = this.aClass76Array1[local34];
				local46.anInt2165 = Static336.anIntArray357[this.aShortArray129[local41.anInt6523] & 0xFFFF] & 0xFFFFFF | local46.anInt2165 & 0xFF000000;
			}
		}
		if (this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	private void method7978() {
		if (this.lb == 0) {
			return;
		}
		if (this.aByte129 != 0) {
			this.method7977(true);
		}
		this.method7977(false);
		if (this.aClass42_1 != null) {
			if (this.aClass42_1.anInterface23_2 == null) {
				this.method7975((this.aByte129 & 0x10) != 0);
			}
			if (this.aClass42_1.anInterface23_2 != null) {
				this.aClass65_Sub1_34.method1285(this.aClass79_12 != null);
				this.aClass65_Sub1_34.method1258(this.aClass79_11, this.aClass79_9, this.aClass79_10, this.aClass79_12);
				@Pc(80) int local80 = this.anIntArray518.length - 1;
				for (@Pc(82) int local82 = 0; local82 < local80; local82++) {
					@Pc(89) int local89 = this.anIntArray518[local82];
					@Pc(96) int local96 = this.anIntArray518[local82 + 1];
					@Pc(103) int local103 = this.aShortArray132[local89] & 0xFFFF;
					if (local103 == 65535) {
						local103 = -1;
					}
					this.aClass65_Sub1_34.method1271(this.aClass79_12 != null, local103);
					this.aClass65_Sub1_34.method1291(this.aClass42_1.anInterface23_2, (local96 - local89) * 3, local89 * 3);
				}
			}
		}
		this.method7982();
	}

	@OriginalMember(owner = "client!to", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9466; local3++) {
			this.anIntArray521[local3] = -this.anIntArray521[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt9452; local25++) {
			this.aShortArray128[local25] = (short) -this.aShortArray128[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt9474; local48++) {
			@Pc(55) short local55 = this.aShortArray133[local48];
			this.aShortArray133[local48] = this.aShortArray131[local48];
			this.aShortArray131[local48] = local55;
		}
		if (this.aClass79_12 == null && this.aClass79_10 != null) {
			this.aClass79_10.anInterface17_4 = null;
		}
		if (this.aClass79_12 != null) {
			this.aClass79_12.anInterface17_4 = null;
		}
		if (this.aClass42_1 != null) {
			this.aClass42_1.anInterface23_2 = null;
		}
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
	}

	@OriginalMember(owner = "client!to", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9466; local3++) {
			if (arg0 != 128) {
				this.anIntArray519[local3] = arg0 * this.anIntArray519[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray517[local3] = arg1 * this.anIntArray517[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray521[local3] = arg2 * this.anIntArray521[local3] >> 7;
			}
		}
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ISIIB)I")
	private int method7980(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(14) int local14 = Static336.anIntArray357[Static494.method7075(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(28) Class136 local28 = this.aClass65_Sub1_34.anInterface4_11.method358(arg1 & 0xFFFF);
			@Pc(33) int local33 = local28.aByte55 & 0xFF;
			@Pc(39) int local39;
			@Pc(70) int local70;
			if (local33 != 0) {
				if (arg0 < 0) {
					local39 = 0;
				} else if (arg0 > 127) {
					local39 = 16777215;
				} else {
					local39 = arg0 * 131586;
				}
				if (local33 == 256) {
					local14 = local39;
				} else {
					local70 = 256 - local33;
					local14 = (local70 * (local14 & 0xFF00) + (local39 & 0xFF00) * local33 & 0xFF0000) + (local33 * (local39 & 0xFF00FF) + ((local14 & 0xFF00FF) * local70) & 0xFF00FF00) >> 8;
				}
			}
			local39 = local28.aByte51 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(117) int local117 = local39 * (local14 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local70 = (local14 >> 8 & 0xFF) * local39;
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(141) int local141 = local39 * (local14 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local14 = (local141 >> 8) + (local70 & 0xFF00) + ((local117 & 0xAB00FF00) << 8);
			}
		}
		return (local14 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!to", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static41.anInt674 = 0;
			local26 = 0;
			Static401.anInt7136 = 0;
			Static486.anInt8172 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray52.length > local38) {
					local48 = this.anIntArrayArray52[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray134 == null || (this.aShortArray134[local56] & arg6) != 0) {
							Static401.anInt7136 += this.anIntArray519[local56];
							Static41.anInt674 += this.anIntArray517[local56];
							local26++;
							Static486.anInt8172 += this.anIntArray521[local56];
						}
					}
				}
			}
			if (local26 <= 0) {
				Static486.anInt8172 = arg4;
				Static401.anInt7136 = arg2;
				Static41.anInt674 = arg3;
			} else {
				Static41.anInt674 = arg3 + Static41.anInt674 / local26;
				Static486.anInt8172 = arg4 + Static486.anInt8172 / local26;
				Static401.anInt7136 = Static401.anInt7136 / local26 + arg2;
				Static667.aBoolean904 = true;
			}
			return;
		}
		@Pc(244) int[] local244;
		@Pc(246) int local246;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg7[4] * arg3 + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray52.length) {
					local244 = this.anIntArrayArray52[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.aShortArray134 == null || (arg6 & this.aShortArray134[local50]) != 0) {
							this.anIntArray519[local50] += arg2;
							this.anIntArray517[local50] += arg3;
							this.anIntArray521[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(402) int local402;
		@Pc(631) int local631;
		@Pc(640) int local640;
		@Pc(649) int local649;
		@Pc(653) int local653;
		@Pc(671) int local671;
		@Pc(1022) int local1022;
		@Pc(1030) int local1030;
		@Pc(1184) int local1184;
		@Pc(1210) int local1210;
		@Pc(1215) int local1215;
		@Pc(1223) int local1223;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1236) int local1236;
		@Pc(1238) int local1238;
		@Pc(1368) int[] local1368;
		@Pc(1370) int local1370;
		@Pc(1374) int local1374;
		@Pc(1378) int local1378;
		@Pc(1380) int local1380;
		@Pc(1508) int local1508;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray52.length) {
						local244 = this.anIntArrayArray52[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.aShortArray134 == null || (this.aShortArray134[local50] & arg6) != 0) {
								this.anIntArray519[local50] -= Static401.anInt7136;
								this.anIntArray517[local50] -= Static41.anInt674;
								this.anIntArray521[local50] -= Static486.anInt8172;
								if (arg4 != 0) {
									local56 = Class200.anIntArray337[arg4];
									local383 = Class200.anIntArray338[arg4];
									local402 = this.anIntArray517[local50] * local56 + this.anIntArray519[local50] * local383 + 16383 >> 14;
									this.anIntArray517[local50] = local383 * this.anIntArray517[local50] + 16383 - this.anIntArray519[local50] * local56 >> 14;
									this.anIntArray519[local50] = local402;
								}
								if (arg2 != 0) {
									local56 = Class200.anIntArray337[arg2];
									local383 = Class200.anIntArray338[arg2];
									local402 = local383 * this.anIntArray517[local50] + 16383 - local56 * this.anIntArray521[local50] >> 14;
									this.anIntArray521[local50] = this.anIntArray521[local50] * local383 + this.anIntArray517[local50] * local56 + 16383 >> 14;
									this.anIntArray517[local50] = local402;
								}
								if (arg3 != 0) {
									local56 = Class200.anIntArray337[arg3];
									local383 = Class200.anIntArray338[arg3];
									local402 = this.anIntArray521[local50] * local56 + this.anIntArray519[local50] * local383 + 16383 >> 14;
									this.anIntArray521[local50] = this.anIntArray521[local50] * local383 + 16383 - local56 * this.anIntArray519[local50] >> 14;
									this.anIntArray519[local50] = local402;
								}
								this.anIntArray519[local50] += Static401.anInt7136;
								this.anIntArray517[local50] += Static41.anInt674;
								this.anIntArray521[local50] += Static486.anInt8172;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray52.length > local38) {
							local48 = this.anIntArrayArray52[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray134 == null || (arg6 & this.aShortArray134[local56]) != 0) {
									local383 = this.anIntArray520[local56];
									local402 = this.anIntArray520[local56 + 1];
									for (local631 = local383; local631 < local402; local631++) {
										local640 = this.aShortArray125[local631] - 1;
										if (local640 == -1) {
											break;
										}
										if (arg4 != 0) {
											local649 = Class200.anIntArray337[arg4];
											local653 = Class200.anIntArray338[arg4];
											local671 = this.aShortArray127[local640] * local653 + local649 * this.aShortArray126[local640] + 16383 >> 14;
											this.aShortArray126[local640] = (short) (this.aShortArray126[local640] * local653 + 16383 - this.aShortArray127[local640] * local649 >> 14);
											this.aShortArray127[local640] = (short) local671;
										}
										if (arg2 != 0) {
											local649 = Class200.anIntArray337[arg2];
											local653 = Class200.anIntArray338[arg2];
											local671 = local653 * this.aShortArray126[local640] + 16383 - local649 * this.aShortArray128[local640] >> 14;
											this.aShortArray128[local640] = (short) (local653 * this.aShortArray128[local640] + local649 * this.aShortArray126[local640] + 16383 >> 14);
											this.aShortArray126[local640] = (short) local671;
										}
										if (arg3 != 0) {
											local649 = Class200.anIntArray337[arg3];
											local653 = Class200.anIntArray338[arg3];
											local671 = local653 * this.aShortArray127[local640] + this.aShortArray128[local640] * local649 + 16383 >> 14;
											this.aShortArray128[local640] = (short) (local653 * this.aShortArray128[local640] + 16383 - local649 * this.aShortArray127[local640] >> 14);
											this.aShortArray127[local640] = (short) local671;
										}
									}
								}
							}
						}
					}
					if (this.aClass79_12 == null && this.aClass79_10 != null) {
						this.aClass79_10.anInterface17_4 = null;
					}
					if (this.aClass79_12 != null) {
						this.aClass79_12.anInterface17_4 = null;
						return;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local246 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static667.aBoolean904) {
					local383 = arg7[6] * Static486.anInt8172 + Static401.anInt7136 * arg7[0] + Static41.anInt674 * arg7[3] + 8192 >> 14;
					local402 = arg7[4] * Static41.anInt674 + Static401.anInt7136 * arg7[1] + arg7[7] * Static486.anInt8172 + 8192 >> 14;
					local383 += local246;
					local631 = arg7[2] * Static401.anInt7136 + Static41.anInt674 * arg7[5] + arg7[8] * Static486.anInt8172 + 8192 >> 14;
					local402 += local50;
					local631 += local56;
					Static41.anInt674 = local402;
					Static401.anInt7136 = local383;
					Static486.anInt8172 = local631;
					Static667.aBoolean904 = false;
				}
				@Pc(990) int[] local990 = new int[9];
				local402 = Class200.anIntArray338[arg2];
				local631 = Class200.anIntArray337[arg2];
				local640 = Class200.anIntArray338[arg3];
				local649 = Class200.anIntArray337[arg3];
				local653 = Class200.anIntArray338[arg4];
				local671 = Class200.anIntArray337[arg4];
				local1022 = local631 * local653 + 8192 >> 14;
				local1030 = local631 * local671 + 8192 >> 14;
				local990[6] = local1030 * local640 + -local649 * local653 + 8192 >> 14;
				local990[1] = local649 * local1022 + local671 * -local640 + 8192 >> 14;
				local990[5] = -local631;
				local990[8] = local640 * local402 + 8192 >> 14;
				local990[3] = local402 * local671 + 8192 >> 14;
				local990[4] = local653 * local402 + 8192 >> 14;
				local990[7] = local649 * local671 + local1022 * local640 + 8192 >> 14;
				local990[0] = local640 * local653 + local1030 * local649 + 8192 >> 14;
				local990[2] = local402 * local649 + 8192 >> 14;
				@Pc(1159) int local1159 = -Static401.anInt7136 * local990[0] + -Static41.anInt674 * local990[1] + -Static486.anInt8172 * local990[2] + 8192 >> 14;
				local1184 = -Static401.anInt7136 * local990[3] + -Static41.anInt674 * local990[4] + -Static486.anInt8172 * local990[5] + 8192 >> 14;
				local1210 = local990[7] * -Static41.anInt674 + -Static401.anInt7136 * local990[6] + -Static486.anInt8172 * local990[8] + 8192 >> 14;
				local1215 = local1159 + Static401.anInt7136;
				@Pc(1219) int local1219 = local1184 + Static41.anInt674;
				local1223 = Static486.anInt8172 + local1210;
				@Pc(1226) int[] local1226 = new int[9];
				for (local1228 = 0; local1228 < 3; local1228++) {
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1236 = 0;
						for (local1238 = 0; local1238 < 3; local1238++) {
							local1236 += local990[local1228 * 3 + local1238] * arg7[local1232 * 3 + local1238];
						}
						local1226[local1228 * 3 + local1232] = local1236 + 8192 >> 14;
					}
				}
				local1232 = local990[1] * local50 + local246 * local990[0] + local990[2] * local56 + 8192 >> 14;
				local1236 = local56 * local990[5] + local246 * local990[3] + local990[4] * local50 + 8192 >> 14;
				local1232 += local1215;
				local1236 += local1219;
				local1238 = local246 * local990[6] + local50 * local990[7] + local56 * local990[8] + 8192 >> 14;
				local1238 += local1223;
				local1368 = new int[9];
				for (local1370 = 0; local1370 < 3; local1370++) {
					for (local1374 = 0; local1374 < 3; local1374++) {
						local1378 = 0;
						for (local1380 = 0; local1380 < 3; local1380++) {
							local1378 += local1226[local1380 * 3 + local1374] * arg7[local1380 + local1370 * 3];
						}
						local1368[local1370 * 3 + local1374] = local1378 + 8192 >> 14;
					}
				}
				local1374 = arg7[2] * local1238 + local1232 * arg7[0] + arg7[1] * local1236 + 8192 >> 14;
				local1378 = local1238 * arg7[5] + arg7[3] * local1232 + local1236 * arg7[4] + 8192 >> 14;
				local1380 = local1238 * arg7[8] + arg7[7] * local1236 + arg7[6] * local1232 + 8192 >> 14;
				local1378 += local32;
				local1374 += local26;
				local1380 += local38;
				for (local1508 = 0; local1508 < local8; local1508++) {
					@Pc(1514) int local1514 = arg1[local1508];
					if (local1514 < this.anIntArrayArray52.length) {
						@Pc(1528) int[] local1528 = this.anIntArrayArray52[local1514];
						for (@Pc(1530) int local1530 = 0; local1530 < local1528.length; local1530++) {
							@Pc(1536) int local1536 = local1528[local1530];
							if (this.aShortArray134 == null || (this.aShortArray134[local1536] & arg6) != 0) {
								@Pc(1581) int local1581 = local1368[0] * this.anIntArray519[local1536] + this.anIntArray517[local1536] * local1368[1] + this.anIntArray521[local1536] * local1368[2] + 8192 >> 14;
								@Pc(1613) int local1613 = local1368[4] * this.anIntArray517[local1536] + local1368[3] * this.anIntArray519[local1536] + local1368[5] * this.anIntArray521[local1536] + 8192 >> 14;
								@Pc(1646) int local1646 = local1368[6] * this.anIntArray519[local1536] + local1368[7] * this.anIntArray517[local1536] + this.anIntArray521[local1536] * local1368[8] + 8192 >> 14;
								@Pc(1650) int local1650 = local1581 + local1374;
								@Pc(1654) int local1654 = local1613 + local1378;
								@Pc(1658) int local1658 = local1646 + local1380;
								this.anIntArray519[local1536] = local1650;
								this.anIntArray517[local1536] = local1654;
								this.anIntArray521[local1536] = local1658;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2598) Class223 local2598;
			@Pc(2603) Class76 local2603;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray53.length) {
							local244 = this.anIntArrayArray53[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local50 = local244[local246];
								if (this.aShortArray124 == null || (arg6 & this.aShortArray124[local50]) != 0) {
									local56 = arg2 * 8 + (this.aByteArray95[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray95[local50] = (byte) local56;
									if (this.aClass79_10 != null) {
										this.aClass79_10.anInterface17_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass223Array1 != null) {
						for (local32 = 0; local32 < this.anInt9442; local32++) {
							local2598 = this.aClass223Array1[local32];
							local2603 = this.aClass76Array1[local32];
							local2603.anInt2165 = 255 - (this.aByteArray95[local2598.anInt6523] & 0xFF) << 24 | local2603.anInt2165 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2859) Class76 local2859;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray54.length > local32) {
								local244 = this.anIntArrayArray54[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2859 = this.aClass76Array1[local244[local246]];
									local2859.anInt2162 += arg2;
									local2859.anInt2167 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray54.length > local32) {
								local244 = this.anIntArrayArray54[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2859 = this.aClass76Array1[local244[local246]];
									local2859.anInt2168 = arg3 * local2859.anInt2168 >> 7;
									local2859.anInt2164 = local2859.anInt2164 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray54.length > local32) {
							local244 = this.anIntArrayArray54[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2859 = this.aClass76Array1[local244[local246]];
								local2859.anInt2163 = local2859.anInt2163 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray53 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray53.length > local32) {
						local244 = this.anIntArrayArray53[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.aShortArray124 == null || (arg6 & this.aShortArray124[local50]) != 0) {
								local56 = this.aShortArray129[local50] & 0xFFFF;
								local383 = local56 >> 10 & 0x3F;
								local402 = local56 >> 7 & 0x7;
								local402 += arg3 / 4;
								@Pc(2705) int local2705 = arg2 + local383 & 0x3F;
								local631 = local56 & 0x7F;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								local631 += arg4;
								if (local631 < 0) {
									local631 = 0;
								} else if (local631 > 127) {
									local631 = 127;
								}
								this.aShortArray129[local50] = (short) (local631 | local402 << 7 | local2705 << 10);
								if (this.aClass79_10 != null) {
									this.aClass79_10.anInterface17_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass223Array1 != null) {
					for (local32 = 0; local32 < this.anInt9442; local32++) {
						local2598 = this.aClass223Array1[local32];
						local2603 = this.aClass76Array1[local32];
						local2603.anInt2165 = Static336.anIntArray357[this.aShortArray129[local2598.anInt6523] & 0xFFFF] & 0xFFFFFF | local2603.anInt2165 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray52.length) {
					local244 = this.anIntArrayArray52[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.aShortArray134 == null || (arg6 & this.aShortArray134[local50]) != 0) {
							this.anIntArray519[local50] -= Static401.anInt7136;
							this.anIntArray517[local50] -= Static41.anInt674;
							this.anIntArray521[local50] -= Static486.anInt8172;
							this.anIntArray519[local50] = this.anIntArray519[local50] * arg2 >> 7;
							this.anIntArray517[local50] = this.anIntArray517[local50] * arg3 >> 7;
							this.anIntArray521[local50] = arg4 * this.anIntArray521[local50] >> 7;
							this.anIntArray519[local50] += Static401.anInt7136;
							this.anIntArray517[local50] += Static41.anInt674;
							this.anIntArray521[local50] += Static486.anInt8172;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local246 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static667.aBoolean904) {
				local383 = arg7[0] * Static401.anInt7136 + arg7[3] * Static41.anInt674 + arg7[6] * Static486.anInt8172 + 8192 >> 14;
				local402 = Static401.anInt7136 * arg7[1] + arg7[4] * Static41.anInt674 + Static486.anInt8172 * arg7[7] + 8192 >> 14;
				local631 = arg7[8] * Static486.anInt8172 + arg7[2] * Static401.anInt7136 + Static41.anInt674 * arg7[5] + 8192 >> 14;
				local383 += local246;
				local402 += local50;
				Static401.anInt7136 = local383;
				local631 += local56;
				Static41.anInt674 = local402;
				Static667.aBoolean904 = false;
				Static486.anInt8172 = local631;
			}
			local383 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local631 = arg4 << 15 >> 7;
			local640 = -Static401.anInt7136 * local383 + 8192 >> 14;
			local649 = local402 * -Static41.anInt674 + 8192 >> 14;
			local653 = local631 * -Static486.anInt8172 + 8192 >> 14;
			local671 = local640 + Static401.anInt7136;
			local1022 = Static41.anInt674 + local649;
			local1030 = Static486.anInt8172 + local653;
			@Pc(1883) int[] local1883 = new int[] { local383 * arg7[0] + 8192 >> 14, arg7[3] * local383 + 8192 >> 14, local383 * arg7[6] + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, local402 * arg7[4] + 8192 >> 14, local402 * arg7[7] + 8192 >> 14, arg7[2] * local631 + 8192 >> 14, local631 * arg7[5] + 8192 >> 14, arg7[8] * local631 + 8192 >> 14 };
			local1184 = local383 * local246 + 8192 >> 14;
			local1210 = local50 * local402 + 8192 >> 14;
			local1215 = local631 * local56 + 8192 >> 14;
			@Pc(2019) int local2019 = local1210 + local1022;
			@Pc(2023) int local2023 = local1184 + local671;
			@Pc(2027) int local2027 = local1215 + local1030;
			@Pc(2030) int[] local2030 = new int[9];
			@Pc(2036) int local2036;
			for (local1223 = 0; local1223 < 3; local1223++) {
				for (local2036 = 0; local2036 < 3; local2036++) {
					local1228 = 0;
					for (local1232 = 0; local1232 < 3; local1232++) {
						local1228 += arg7[local1232 + local1223 * 3] * local1883[local1232 * 3 + local2036];
					}
					local2030[local2036 + local1223 * 3] = local1228 + 8192 >> 14;
				}
			}
			local2036 = local2019 * arg7[1] + arg7[0] * local2023 + arg7[2] * local2027 + 8192 >> 14;
			local1228 = local2023 * arg7[3] + arg7[4] * local2019 + arg7[5] * local2027 + 8192 >> 14;
			local2036 += local26;
			local1228 += local32;
			local1232 = arg7[8] * local2027 + local2019 * arg7[7] + local2023 * arg7[6] + 8192 >> 14;
			local1232 += local38;
			for (local1236 = 0; local1236 < local8; local1236++) {
				local1238 = arg1[local1236];
				if (local1238 < this.anIntArrayArray52.length) {
					local1368 = this.anIntArrayArray52[local1238];
					for (local1370 = 0; local1370 < local1368.length; local1370++) {
						local1374 = local1368[local1370];
						if (this.aShortArray134 == null || (arg6 & this.aShortArray134[local1374]) != 0) {
							local1378 = local2030[0] * this.anIntArray519[local1374] + this.anIntArray517[local1374] * local2030[1] + this.anIntArray521[local1374] * local2030[2] + 8192 >> 14;
							local1380 = this.anIntArray521[local1374] * local2030[5] + local2030[4] * this.anIntArray517[local1374] + this.anIntArray519[local1374] * local2030[3] + 8192 >> 14;
							@Pc(2277) int local2277 = local1378 + local2036;
							@Pc(2281) int local2281 = local1380 + local1228;
							local1508 = this.anIntArray521[local1374] * local2030[8] + this.anIntArray519[local1374] * local2030[6] + local2030[7] * this.anIntArray517[local1374] + 8192 >> 14;
							@Pc(2316) int local2316 = local1508 + local1232;
							this.anIntArray519[local1374] = local2277;
							this.anIntArray517[local1374] = local2281;
							this.anIntArray521[local1374] = local2316;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
	@Override
	public void method8584() {
		if (this.anInt9452 <= 0 || this.lb <= 0) {
			return;
		}
		this.method7977(false);
		if ((this.aByte129 & 0x10) == 0 && this.aClass42_1.anInterface23_2 == null) {
			this.method7975(false);
		}
		this.method7982();
	}

	@OriginalMember(owner = "client!to", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9466; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray519[local15] + this.anIntArray517[local15] * local9 >> 14;
			this.anIntArray517[local15] = this.anIntArray517[local15] * local13 - this.anIntArray519[local15] * local9 >> 14;
			this.anIntArray519[local15] = local33;
		}
		this.aBoolean798 = false;
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean797;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oaa;I)V")
	private void method7981(@OriginalArg(0) Class5_Sub3_Sub7_Sub2 arg0) {
		if (this.aClass65_Sub1_34.anIntArray69.length < this.anInt9452) {
			this.aClass65_Sub1_34.anIntArray68 = new int[this.anInt9452];
			this.aClass65_Sub1_34.anIntArray69 = new int[this.anInt9452];
		}
		@Pc(32) int[] local32 = this.aClass65_Sub1_34.anIntArray69;
		@Pc(36) int[] local36 = this.aClass65_Sub1_34.anIntArray68;
		@Pc(68) int local68;
		@Pc(106) int local106;
		@Pc(115) int local115;
		for (@Pc(42) int local42 = 0; local42 < this.anInt9466; local42++) {
			local68 = (this.anIntArray519[local42] - (this.anIntArray517[local42] * this.aClass65_Sub1_34.anInt1403 >> 8) >> this.aClass65_Sub1_34.anInt1381) - arg0.anInt7310;
			@Pc(92) int local92 = (this.anIntArray521[local42] - (this.aClass65_Sub1_34.anInt1421 * this.anIntArray517[local42] >> 8) >> this.aClass65_Sub1_34.anInt1381) - arg0.anInt7303;
			@Pc(97) int local97 = this.anIntArray520[local42];
			@Pc(104) int local104 = this.anIntArray520[local42 + 1];
			for (local106 = local97; local106 < local104; local106++) {
				local115 = this.aShortArray125[local106] - 1;
				if (local115 == -1) {
					break;
				}
				local32[local115] = local68;
				local36[local115] = local92;
			}
		}
		for (local68 = 0; local68 < this.lb; local68++) {
			if (this.aByteArray95 == null || this.aByteArray95[local68] <= 128) {
				@Pc(154) short local154 = this.aShortArray133[local68];
				@Pc(159) short local159 = this.aShortArray130[local68];
				@Pc(164) short local164 = this.aShortArray131[local68];
				local106 = local32[local154];
				local115 = local32[local159];
				@Pc(176) int local176 = local32[local164];
				@Pc(180) int local180 = local36[local154];
				@Pc(184) int local184 = local36[local159];
				@Pc(188) int local188 = local36[local164];
				if ((local184 - local188) * (local106 - local115) - (local184 - local180) * (local176 - local115) > 0) {
					arg0.method6131(local180, local106, local188, local184, local176, local115);
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray52 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9464; local12++) {
			this.anIntArray519[local12] <<= 0x4;
			this.anIntArray517[local12] <<= 0x4;
			this.anIntArray521[local12] <<= 0x4;
		}
		Static486.anInt8172 = 0;
		Static41.anInt674 = 0;
		Static401.anInt7136 = 0;
		return true;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	private void method7982() {
		if (!this.aBoolean799) {
			return;
		}
		this.aBoolean799 = false;
		if (this.aClass313Array4 == null && this.aClass209Array4 == null && this.aClass223Array1 == null && !Static460.method6582(this.anInt9465, this.anInt9455)) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			if (this.anIntArray519 != null && !Static453.method6520(this.anInt9465, this.anInt9455)) {
				if (this.aClass79_11 != null && this.aClass79_11.anInterface17_4 == null) {
					this.aBoolean799 = true;
				} else {
					local30 = true;
					if (!this.aBoolean798) {
						this.method7976();
					}
				}
			}
			@Pc(64) boolean local64 = false;
			if (this.anIntArray517 != null && !Static310.method4900(this.anInt9465, this.anInt9455)) {
				if (this.aClass79_11 != null && this.aClass79_11.anInterface17_4 == null) {
					this.aBoolean799 = true;
				} else {
					local32 = true;
					if (!this.aBoolean798) {
						this.method7976();
					}
				}
			}
			if (this.anIntArray521 != null && !Static595.method8162(this.anInt9465, this.anInt9455)) {
				if (this.aClass79_11 != null && this.aClass79_11.anInterface17_4 == null) {
					this.aBoolean799 = true;
				} else {
					if (!this.aBoolean798) {
						this.method7976();
					}
					local64 = true;
				}
			}
			if (local32) {
				this.anIntArray517 = null;
			}
			if (local30) {
				this.anIntArray519 = null;
			}
			if (local64) {
				this.anIntArray521 = null;
			}
		}
		if (this.aShortArray125 != null && this.anIntArray519 == null && this.anIntArray517 == null && this.anIntArray521 == null) {
			this.aShortArray125 = null;
			this.anIntArray520 = null;
		}
		if (this.aByteArray94 != null && !Static366.method5552(this.anInt9455, this.anInt9465)) {
			if (this.aClass79_12 == null) {
				if (this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null) {
					this.aBoolean799 = true;
				} else {
					this.aShortArray127 = this.aShortArray126 = this.aShortArray128 = null;
					this.aByteArray94 = null;
				}
			} else if (this.aClass79_12.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aShortArray127 = this.aShortArray126 = this.aShortArray128 = null;
				this.aByteArray94 = null;
			}
		}
		if (this.aShortArray129 != null && !Static392.method5758(this.anInt9465, this.anInt9455)) {
			if (this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aShortArray129 = null;
			}
		}
		if (this.aByteArray95 != null && !Static20.method280(this.anInt9455, this.anInt9465)) {
			if (this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aByteArray95 = null;
			}
		}
		if (this.aFloatArray89 != null && !Static138.method2415(this.anInt9465, this.anInt9455)) {
			if (this.aClass79_9 != null && this.aClass79_9.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aFloatArray89 = this.aFloatArray90 = null;
			}
		}
		if (this.aShortArray132 != null && !Static163.method2890(this.anInt9455, this.anInt9465)) {
			if (this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aShortArray132 = null;
			}
		}
		if (this.aShortArray133 != null && !Static295.method4758(this.anInt9455, this.anInt9465)) {
			if (this.aClass42_1 != null && this.aClass42_1.anInterface23_2 == null || this.aClass79_10 != null && this.aClass79_10.anInterface17_4 == null) {
				this.aBoolean799 = true;
			} else {
				this.aShortArray133 = this.aShortArray130 = this.aShortArray131 = null;
			}
		}
		if (this.anIntArrayArray53 != null && !Static185.method3087(this.anInt9465, this.anInt9455)) {
			this.aShortArray124 = null;
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArrayArray52 != null && !Static381.method9023(this.anInt9465, this.anInt9455)) {
			this.anIntArrayArray52 = null;
			this.aShortArray134 = null;
		}
		if (this.anIntArrayArray54 != null && !Static96.method1939(this.anInt9465, this.anInt9455)) {
			this.anIntArrayArray54 = null;
		}
		if (this.anIntArray518 != null && (this.anInt9455 & 0x800) == 0 && (this.anInt9455 & 0x40000) == 0) {
			this.anIntArray518 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort104;
	}

	@OriginalMember(owner = "client!to", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9466; local3++) {
			if (arg0 != 0) {
				this.anIntArray519[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray517[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray521[local3] += arg2;
			}
		}
		this.aBoolean798 = false;
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
	}

	@OriginalMember(owner = "client!to", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt9455 = arg0;
		if (this.aClass291_1 != null && (this.anInt9455 & 0x10000) == 0) {
			this.aShortArray126 = this.aClass291_1.aShortArray90;
			this.aShortArray127 = this.aClass291_1.aShortArray88;
			this.aShortArray128 = this.aClass291_1.aShortArray89;
			this.aByteArray94 = this.aClass291_1.aByteArray77;
			this.aClass291_1 = null;
		}
		this.aBoolean799 = true;
		this.method7982();
	}

	@OriginalMember(owner = "client!to", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort102;
	}

	@OriginalMember(owner = "client!to", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean798) {
			this.method7976();
		}
		@Pc(16) int local16 = this.aShort102 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort97;
		@Pc(26) int local26 = this.aShort100 + arg6;
		@Pc(31) int local31 = this.aShort96 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9063 >> arg2.anInt9066 >= arg2.anInt9061 || local26 < 0 || arg2.anInt9063 + local31 >> arg2.anInt9066 >= arg2.anInt9065)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9061 <= local21 + arg3.anInt9063 >> arg3.anInt9066 || local26 < 0 || arg3.anInt9065 <= arg3.anInt9063 + local31 >> arg3.anInt9066) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9066;
			local21 = arg2.anInt9063 + local21 - 1 >> arg2.anInt9066;
			local26 >>= arg2.anInt9066;
			local31 = arg2.anInt9063 + local31 - 1 >> arg2.anInt9066;
			if (arg2.method7695(local26, local16) == arg5 && arg2.method7695(local26, local21) == arg5 && arg2.method7695(local31, local16) == arg5 && arg2.method7695(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(282) int local282;
		if (arg0 == 1) {
			for (local282 = 0; local282 < this.anInt9466; local282++) {
				this.anIntArray517[local282] = this.anIntArray517[local282] + arg2.method7702(arg4 + this.anIntArray519[local282], arg6 + this.anIntArray521[local282]) - arg5;
			}
		} else {
			@Pc(202) int local202;
			@Pc(213) int local213;
			if (arg0 == 2) {
				@Pc(197) short local197 = this.aShort99;
				if (local197 == 0) {
					return;
				}
				for (local202 = 0; local202 < this.anInt9466; local202++) {
					local213 = (this.anIntArray517[local202] << 16) / local197;
					if (arg1 > local213) {
						this.anIntArray517[local202] -= -((arg1 - local213) * (-arg5 + arg2.method7702(this.anIntArray519[local202] + arg4, this.anIntArray521[local202] + arg6)) / arg1);
					}
				}
			} else {
				@Pc(300) int local300;
				if (arg0 == 3) {
					local282 = (arg1 & 0xFF) * 4;
					local202 = (arg1 >> 8 & 0xFF) * 4;
					local213 = (arg1 >> 16 & 0xFF) << 6;
					local300 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local282 >> 1) < 0 || arg2.anInt9061 << arg2.anInt9066 <= arg2.anInt9063 + (local282 >> 1) + arg4 || arg6 - (local202 >> 1) < 0 || arg6 + (local202 >> 1) + arg2.anInt9063 >= arg2.anInt9065 << arg2.anInt9066) {
						return;
					}
					this.method8595(local213, arg5, arg2, local300, local202, arg4, local282, arg6);
				} else if (arg0 == 4) {
					local282 = this.aShort101 - this.aShort99;
					for (local202 = 0; local202 < this.anInt9466; local202++) {
						this.anIntArray517[local202] = this.anIntArray517[local202] + arg3.method7702(arg4 + this.anIntArray519[local202], arg6 + this.anIntArray521[local202]) + local282 - arg5;
					}
				} else if (arg0 == 5) {
					local282 = this.aShort101 - this.aShort99;
					for (local202 = 0; local202 < this.anInt9466; local202++) {
						local213 = arg4 + this.anIntArray519[local202];
						local300 = this.anIntArray521[local202] + arg6;
						@Pc(306) int local306 = arg2.method7702(local213, local300);
						@Pc(312) int local312 = arg3.method7702(local213, local300);
						@Pc(319) int local319 = local306 - local312 - arg1;
						this.anIntArray517[local202] = (local319 * ((this.anIntArray517[local202] << 8) / local282) >> 8) + local306 - arg5;
					}
				}
			}
		}
		if (this.aClass79_11 != null) {
			this.aClass79_11.anInterface17_4 = null;
		}
		this.aBoolean798 = false;
	}

	@OriginalMember(owner = "client!to", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt9455;
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "()V")
	@Override
	protected void method8602() {
	}

	@OriginalMember(owner = "client!to", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean798) {
			this.method7976();
		}
		return this.aShort103;
	}
}
