import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	private int anInt6446;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "Lclient!ob;")
	private Interface19 anInterface19_4;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!ln", name = "Z", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!ln", name = "bb", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!ln", name = "cb", descriptor = "[Lclient!oaa;")
	private Class235[] aClass235Array1;

	@OriginalMember(owner = "client!ln", name = "db", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!ln", name = "fb", descriptor = "[Lclient!cia;")
	private Class49[] aClass49Array3;

	@OriginalMember(owner = "client!ln", name = "hb", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
	private int anInt6478;

	@OriginalMember(owner = "client!ln", name = "ub", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!ln", name = "wb", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!ln", name = "xb", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!ln", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ln", name = "Db", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!ln", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ln", name = "Ib", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!ln", name = "Kb", descriptor = "[Lclient!pk;")
	private Class263[] aClass263Array1;

	@OriginalMember(owner = "client!ln", name = "Lb", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!ln", name = "Ob", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!ln", name = "Ub", descriptor = "Lclient!dw;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!ln", name = "Vb", descriptor = "[Lclient!fk;")
	private Class103[] aClass103Array3;

	@OriginalMember(owner = "client!ln", name = "Wb", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!ln", name = "Zb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!ln", name = "ac", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!ln", name = "cc", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!ln", name = "dc", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!ln", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ln", name = "jc", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!ln", name = "lc", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!ln", name = "mc", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!ln", name = "tc", descriptor = "I")
	private int anInt6506;

	@OriginalMember(owner = "client!ln", name = "wc", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!ln", name = "Ec", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!ln", name = "Fc", descriptor = "Lclient!bb;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
	private int anInt6454 = 0;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!ln", name = "Cb", descriptor = "Z")
	private boolean aBoolean508 = true;

	@OriginalMember(owner = "client!ln", name = "Xb", descriptor = "I")
	private int anInt6493 = 0;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!ln", name = "sc", descriptor = "I")
	private int anInt6505 = 0;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	private int anInt6464 = 0;

	@OriginalMember(owner = "client!ln", name = "Cc", descriptor = "I")
	private int anInt6514 = 0;

	@OriginalMember(owner = "client!ln", name = "lb", descriptor = "Lclient!ac;")
	private final Class5_Sub1 lb;

	@OriginalMember(owner = "client!ln", name = "ic", descriptor = "Lclient!gk;")
	private Class121 aClass121_7;

	@OriginalMember(owner = "client!ln", name = "Gb", descriptor = "Lclient!gk;")
	private Class121 aClass121_6;

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "Lclient!gk;")
	private Class121 aClass121_5;

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "Lclient!gk;")
	private Class121 aClass121_4;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Lclient!tr;")
	private Class329 aClass329_1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class92_Sub2(@OriginalArg(0) Class5_Sub1 arg0) {
		this.lb = arg0;
		this.aClass121_7 = new Class121((Interface19) null, 5126, 3, 0);
		this.aClass121_6 = new Class121((Interface19) null, 5126, 2, 0);
		this.aClass121_5 = new Class121((Interface19) null, 5126, 3, 0);
		this.aClass121_4 = new Class121((Interface19) null, 5121, 4, 0);
		this.aClass329_1 = new Class329();
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ac;Lclient!lv;IIII)V")
	public Class92_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.lb = arg0;
		this.anInt6506 = arg2;
		this.anInt6446 = arg5;
		if (Static52.method1638(arg2, arg5)) {
			this.aClass121_7 = new Class121((Interface19) null, 5126, 3, 0);
		}
		if (Static238.method4327(arg2, arg5)) {
			this.aClass121_6 = new Class121((Interface19) null, 5126, 2, 0);
		}
		if (Static560.method7884(arg5, arg2)) {
			this.aClass121_5 = new Class121((Interface19) null, 5126, 3, 0);
		}
		if (Static160.method3123(arg5, arg2)) {
			this.aClass121_4 = new Class121((Interface19) null, 5121, 4, 0);
		}
		if (Static556.method7797(arg5, arg2)) {
			this.aClass329_1 = new Class329();
		}
		@Pc(108) Interface7 local108 = arg0.anInterface7_10;
		this.anIntArray302 = new int[arg1.anInt6641 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt6635];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt6635; local121++) {
			if (arg1.aByteArray52 == null || arg1.aByteArray52[local121] != 2) {
				if (arg1.aShortArray108 != null && arg1.aShortArray108[local121] != -1) {
					@Pc(152) Class254 local152 = local108.method6931(arg1.aShortArray108[local121] & 0xFFFF);
					if (((this.anInt6446 & 0x40) == 0 || !local152.aBoolean618) && local152.aBoolean621) {
						continue;
					}
				}
				local119[this.anInt6464++] = local121;
				this.anIntArray302[arg1.aShortArray104[local121]]++;
				this.anIntArray302[arg1.aShortArray109[local121]]++;
				this.anIntArray302[arg1.aShortArray103[local121]]++;
			}
		}
		this.anInt6514 = this.anInt6464;
		@Pc(225) long[] local225 = new long[this.anInt6464];
		@Pc(237) boolean local237 = (this.anInt6506 & 0x100) != 0;
		@Pc(249) int local249;
		@Pc(262) int local262;
		@Pc(445) int local445;
		for (@Pc(239) int local239 = 0; local239 < this.anInt6464; local239++) {
			@Pc(245) int local245 = local119[local239];
			@Pc(247) Class254 local247 = null;
			local249 = 0;
			@Pc(251) byte local251 = 0;
			@Pc(253) byte local253 = 0;
			@Pc(255) byte local255 = 0;
			if (arg1.aClass123Array1 != null) {
				@Pc(260) boolean local260 = false;
				for (local262 = 0; local262 < arg1.aClass123Array1.length; local262++) {
					@Pc(269) Class123 local269 = arg1.aClass123Array1[local262];
					if (local269.anInt4150 == local245) {
						@Pc(278) Class191 local278 = Static129.method2652(local269.anInt4149);
						if (local278.aBoolean521) {
							local260 = true;
						}
						if (local278.anInt6623 != -1) {
							@Pc(294) Class254 local294 = local108.method6931(local278.anInt6623);
							if (local294.anInt7796 == 2) {
								this.aBoolean507 = true;
							}
						}
					}
				}
				if (local260) {
					local225[local239] = Long.MAX_VALUE;
					this.anInt6514--;
					continue;
				}
			}
			@Pc(327) short local327 = -1;
			if (arg1.aShortArray108 != null) {
				local327 = arg1.aShortArray108[local245];
				if (local327 != -1) {
					local247 = local108.method6931(local327 & 0xFFFF);
					if ((this.anInt6446 & 0x40) != 0 && local247.aBoolean618) {
						local247 = null;
						local327 = -1;
					} else {
						local253 = local247.aByte95;
						local255 = local247.aByte94;
						if (local247.aByte96 != 0 || local247.aByte100 != 0) {
							this.aBoolean506 = true;
						}
					}
				}
			}
			@Pc(401) boolean local401 = arg1.aByteArray51 != null && arg1.aByteArray51[local245] != 0 || local247 != null && local247.anInt7796 != 0;
			if ((local237 || local401) && arg1.aByteArray50 != null) {
				local249 += arg1.aByteArray50[local245] << 17;
			}
			if (local401) {
				local249 += 65536;
			}
			local249 += (local253 & 0xFF) << 8;
			local249 += local255 & 0xFF;
			local445 = local251 + ((local327 & 0xFFFF) << 16);
			@Pc(451) int local451 = local445 + (local239 & 0xFFFF);
			local225[local239] = (long) local451 + ((long) local249 << 32);
			this.aBoolean506 |= local247 != null && (local247.aByte96 != 0 || local247.aByte100 != 0);
			this.aBoolean507 |= local401;
		}
		Static163.method3150(local119, local225);
		this.anIntArray300 = arg1.anIntArray319;
		this.anInt6505 = arg1.anInt6644;
		this.aShortArray90 = arg1.aShortArray107;
		this.anIntArray305 = arg1.anIntArray317;
		this.anIntArray303 = arg1.anIntArray314;
		this.anInt6493 = arg1.anInt6641;
		this.aClass103Array3 = arg1.aClass103Array4;
		this.aClass49Array3 = arg1.aClass49Array4;
		@Pc(532) Class296[] local532 = new Class296[this.anInt6493];
		@Pc(552) int local552;
		@Pc(566) int local566;
		@Pc(612) int local612;
		if (arg1.aClass123Array1 != null) {
			this.anInt6478 = arg1.aClass123Array1.length;
			this.aClass263Array1 = new Class263[this.anInt6478];
			this.aClass235Array1 = new Class235[this.anInt6478];
			for (local552 = 0; local552 < this.anInt6478; local552++) {
				@Pc(559) Class123 local559 = arg1.aClass123Array1[local552];
				@Pc(564) Class191 local564 = Static129.method2652(local559.anInt4149);
				local566 = -1;
				for (@Pc(568) int local568 = 0; local568 < this.anInt6464; local568++) {
					if (local119[local568] == local559.anInt4150) {
						local566 = local568;
						break;
					}
				}
				if (local566 == -1) {
					throw new RuntimeException();
				}
				local612 = Static376.anIntArray336[arg1.aShortArray110[local559.anInt4150] & 0xFFFF] & 0xFFFFFF;
				@Pc(629) int local629 = local612 | 255 - (arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local559.anInt4150]) << 24;
				this.aClass263Array1[local552] = new Class263(local566, arg1.aShortArray104[local559.anInt4150], arg1.aShortArray109[local559.anInt4150], arg1.aShortArray103[local559.anInt4150], local564.anInt6625, local564.anInt6628, local564.anInt6623, local564.anInt6631, local564.anInt6627, local564.aBoolean521, local564.aBoolean522, local559.anInt4151);
				this.aClass235Array1[local552] = new Class235(local629);
			}
		}
		local552 = this.anInt6464 * 3;
		this.aShortArray91 = new short[this.anInt6464];
		this.aShortArray96 = new short[this.anInt6464];
		this.aShortArray100 = new short[this.anInt6464];
		this.aShortArray93 = new short[this.anInt6464];
		Static19.aLongArray1 = new long[local552];
		this.aFloatArray61 = new float[local552];
		this.aShortArray97 = new short[this.anInt6464];
		if (arg1.aShortArray105 != null) {
			this.aShortArray95 = new short[this.anInt6464];
		}
		this.aShort70 = (short) arg4;
		this.aShort68 = (short) arg3;
		this.aShortArray92 = new short[local552];
		this.aByteArray47 = new byte[this.anInt6464];
		this.aFloatArray60 = new float[local552];
		this.aShortArray98 = new short[local552];
		this.aByteArray46 = new byte[local552];
		this.aShortArray99 = new short[local552];
		this.aShortArray94 = new short[local552];
		local249 = 0;
		for (local445 = 0; local445 < arg1.anInt6641; local445++) {
			local566 = this.anIntArray302[local445];
			this.anIntArray302[local445] = local249;
			local249 += local566;
			local532[local445] = new Class296();
		}
		this.anIntArray302[arg1.anInt6641] = local249;
		@Pc(811) Class264 local811 = Static239.method4874(local119, arg1, this.anInt6464);
		@Pc(815) Class376[] local815 = new Class376[arg1.anInt6635];
		@Pc(855) int local855;
		@Pc(866) int local866;
		@Pc(888) int local888;
		@Pc(899) int local899;
		@Pc(907) int local907;
		@Pc(915) int local915;
		@Pc(834) short local834;
		@Pc(844) int local844;
		for (local612 = 0; local612 < arg1.anInt6635; local612++) {
			@Pc(824) short local824 = arg1.aShortArray104[local612];
			@Pc(829) short local829 = arg1.aShortArray109[local612];
			local834 = arg1.aShortArray103[local612];
			local844 = this.anIntArray305[local829] - this.anIntArray305[local824];
			local855 = this.anIntArray303[local829] - this.anIntArray303[local824];
			local866 = this.anIntArray300[local829] - this.anIntArray300[local824];
			@Pc(877) int local877 = this.anIntArray305[local834] - this.anIntArray305[local824];
			local888 = this.anIntArray303[local834] - this.anIntArray303[local824];
			local899 = this.anIntArray300[local834] - this.anIntArray300[local824];
			local907 = local899 * local855 - local888 * local866;
			local915 = local877 * local866 - local844 * local899;
			@Pc(924) int local924 = local888 * local844 - local855 * local877;
			while (local907 > 8192 || local915 > 8192 || local924 > 8192 || local907 < -8192 || local915 < -8192 || local924 < -8192) {
				local915 >>= 0x1;
				local924 >>= 0x1;
				local907 >>= 0x1;
			}
			@Pc(979) int local979 = (int) Math.sqrt((double) (local924 * local924 + local907 * local907 + local915 * local915));
			if (local979 <= 0) {
				local979 = 1;
			}
			local915 = local915 * 256 / local979;
			local924 = local924 * 256 / local979;
			local907 = local907 * 256 / local979;
			@Pc(1011) byte local1011 = arg1.aByteArray52 == null ? 0 : arg1.aByteArray52[local612];
			if (local1011 == 0) {
				@Pc(1041) Class296 local1041 = local532[local824];
				local1041.anInt8728++;
				local1041.anInt8731 += local915;
				local1041.anInt8730 += local924;
				local1041.anInt8726 += local907;
				@Pc(1069) Class296 local1069 = local532[local829];
				local1069.anInt8728++;
				local1069.anInt8726 += local907;
				local1069.anInt8731 += local915;
				local1069.anInt8730 += local924;
				@Pc(1097) Class296 local1097 = local532[local834];
				local1097.anInt8728++;
				local1097.anInt8726 += local907;
				local1097.anInt8730 += local924;
				local1097.anInt8731 += local915;
			} else if (local1011 == 1) {
				@Pc(1026) Class376 local1026 = local815[local612] = new Class376();
				local1026.anInt10664 = local915;
				local1026.anInt10661 = local907;
				local1026.anInt10662 = local924;
			}
		}
		@Pc(1134) int local1134;
		@Pc(1177) short local1177;
		for (local262 = 0; local262 < this.anInt6464; local262++) {
			local1134 = local119[local262];
			@Pc(1141) int local1141 = arg1.aShortArray110[local1134] & 0xFFFF;
			if (arg1.aByteArray53 == null) {
				local844 = -1;
			} else {
				local844 = arg1.aByteArray53[local1134];
			}
			if (arg1.aByteArray51 == null) {
				local855 = 0;
			} else {
				local855 = arg1.aByteArray51[local1134] & 0xFF;
			}
			local1177 = arg1.aShortArray108 == null ? -1 : arg1.aShortArray108[local1134];
			if (local1177 != -1 && (this.anInt6446 & 0x40) != 0) {
				@Pc(1195) Class254 local1195 = local108.method6931(local1177 & 0xFFFF);
				if (local1195.aBoolean618) {
					local1177 = -1;
				}
			}
			@Pc(1202) float local1202 = 0.0F;
			@Pc(1204) float local1204 = 0.0F;
			@Pc(1206) float local1206 = 0.0F;
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) byte local1214 = 0;
			@Pc(1216) byte local1216 = 0;
			@Pc(1218) int local1218 = 0;
			@Pc(1252) byte local1252;
			@Pc(1269) short local1269;
			@Pc(1274) short local1274;
			@Pc(1279) short local1279;
			if (local1177 != -1) {
				if (local844 == -1) {
					local1210 = 0.0F;
					local1204 = 1.0F;
					local1206 = 1.0F;
					local1202 = 0.0F;
					local1208 = 1.0F;
					local1216 = 2;
					local1212 = 0.0F;
					local1214 = 1;
				} else {
					local844 &= 0xFF;
					local1252 = arg1.aByteArray48[local844];
					@Pc(1259) short local1259;
					@Pc(1264) short local1264;
					@Pc(1302) float local1302;
					@Pc(1311) float local1311;
					@Pc(1320) float local1320;
					@Pc(1402) float local1402;
					@Pc(1411) float local1411;
					@Pc(1419) float local1419;
					@Pc(1428) float local1428;
					@Pc(1437) float local1437;
					@Pc(1446) float local1446;
					if (local1252 == 0) {
						local1259 = arg1.aShortArray104[local1134];
						local1264 = arg1.aShortArray109[local1134];
						local1269 = arg1.aShortArray103[local1134];
						local1274 = arg1.aShortArray106[local844];
						local1279 = arg1.aShortArray111[local844];
						@Pc(1284) short local1284 = arg1.aShortArray102[local844];
						@Pc(1290) float local1290 = (float) arg1.anIntArray317[local1274];
						@Pc(1296) float local1296 = (float) arg1.anIntArray314[local1274];
						local1302 = (float) arg1.anIntArray319[local1274];
						local1311 = (float) arg1.anIntArray317[local1279] - local1290;
						local1320 = (float) arg1.anIntArray314[local1279] - local1296;
						@Pc(1328) float local1328 = (float) arg1.anIntArray319[local1279] - local1302;
						@Pc(1336) float local1336 = (float) arg1.anIntArray317[local1284] - local1290;
						@Pc(1344) float local1344 = (float) arg1.anIntArray314[local1284] - local1296;
						@Pc(1352) float local1352 = (float) arg1.anIntArray319[local1284] - local1302;
						@Pc(1360) float local1360 = (float) arg1.anIntArray317[local1259] - local1290;
						@Pc(1369) float local1369 = (float) arg1.anIntArray314[local1259] - local1296;
						@Pc(1377) float local1377 = (float) arg1.anIntArray319[local1259] - local1302;
						@Pc(1385) float local1385 = (float) arg1.anIntArray317[local1264] - local1290;
						@Pc(1393) float local1393 = (float) arg1.anIntArray314[local1264] - local1296;
						local1402 = (float) arg1.anIntArray319[local1264] - local1302;
						local1411 = (float) arg1.anIntArray317[local1269] - local1290;
						local1419 = (float) arg1.anIntArray314[local1269] - local1296;
						local1428 = (float) arg1.anIntArray319[local1269] - local1302;
						local1437 = local1352 * local1320 - local1328 * local1344;
						local1446 = local1336 * local1328 - local1311 * local1352;
						@Pc(1455) float local1455 = local1311 * local1344 - local1336 * local1320;
						@Pc(1463) float local1463 = local1344 * local1455 - local1352 * local1446;
						@Pc(1471) float local1471 = local1352 * local1437 - local1455 * local1336;
						@Pc(1479) float local1479 = local1446 * local1336 - local1344 * local1437;
						@Pc(1493) float local1493 = 1.0F / (local1479 * local1328 + local1311 * local1463 + local1320 * local1471);
						local1202 = (local1377 * local1479 + local1471 * local1369 + local1463 * local1360) * local1493;
						local1210 = local1493 * (local1463 * local1411 + local1471 * local1419 + local1428 * local1479);
						local1206 = local1493 * (local1479 * local1402 + local1393 * local1471 + local1385 * local1463);
						@Pc(1543) float local1543 = local1328 * local1437 - local1311 * local1455;
						@Pc(1552) float local1552 = local1311 * local1446 - local1320 * local1437;
						@Pc(1560) float local1560 = local1320 * local1455 - local1328 * local1446;
						@Pc(1574) float local1574 = 1.0F / (local1352 * local1552 + local1336 * local1560 + local1344 * local1543);
						local1212 = local1574 * (local1552 * local1428 + local1419 * local1543 + local1560 * local1411);
						local1204 = (local1360 * local1560 + local1369 * local1543 + local1377 * local1552) * local1574;
						local1208 = (local1393 * local1543 + local1560 * local1385 + local1402 * local1552) * local1574;
					} else {
						local1259 = arg1.aShortArray104[local1134];
						local1264 = arg1.aShortArray109[local1134];
						local1269 = arg1.aShortArray103[local1134];
						@Pc(1638) int local1638 = local811.anIntArray415[local844];
						@Pc(1643) int local1643 = local811.anIntArray417[local844];
						@Pc(1648) int local1648 = local811.anIntArray416[local844];
						@Pc(1653) float[] local1653 = local811.aFloatArrayArray11[local844];
						@Pc(1658) byte local1658 = arg1.aByteArray49[local844];
						local1302 = (float) arg1.anIntArray316[local844] / 256.0F;
						if (local1252 == 1) {
							local1311 = (float) arg1.anIntArray311[local844] / 1024.0F;
							Static443.method6756(arg1.anIntArray317[local1259], local1648, arg1.anIntArray319[local1259], local1643, arg1.anIntArray314[local1259], local1653, local1311, local1658, local1638, local1302, Static58.aFloatArray26);
							local1204 = Static58.aFloatArray26[1];
							local1202 = Static58.aFloatArray26[0];
							Static443.method6756(arg1.anIntArray317[local1264], local1648, arg1.anIntArray319[local1264], local1643, arg1.anIntArray314[local1264], local1653, local1311, local1658, local1638, local1302, Static58.aFloatArray26);
							local1208 = Static58.aFloatArray26[1];
							local1206 = Static58.aFloatArray26[0];
							Static443.method6756(arg1.anIntArray317[local1269], local1648, arg1.anIntArray319[local1269], local1643, arg1.anIntArray314[local1269], local1653, local1311, local1658, local1638, local1302, Static58.aFloatArray26);
							local1210 = Static58.aFloatArray26[0];
							local1212 = Static58.aFloatArray26[1];
							local1320 = local1311 / 2.0F;
							if ((local1658 & 0x1) == 0) {
								if (local1206 - local1202 > local1320) {
									local1214 = 1;
									local1206 -= local1311;
								} else if (local1202 - local1206 > local1320) {
									local1206 += local1311;
									local1214 = 2;
								}
								if (local1210 - local1202 > local1320) {
									local1216 = 1;
									local1210 -= local1311;
								} else if (local1202 - local1210 > local1320) {
									local1216 = 2;
									local1210 += local1311;
								}
							} else {
								if (local1212 - local1204 > local1320) {
									local1212 -= local1311;
									local1216 = 1;
								} else if (local1320 < local1204 - local1212) {
									local1216 = 2;
									local1212 += local1311;
								}
								if (local1208 - local1204 > local1320) {
									local1208 -= local1311;
									local1214 = 1;
								} else if (local1320 < local1204 - local1208) {
									local1214 = 2;
									local1208 += local1311;
								}
							}
						} else if (local1252 == 2) {
							local1311 = (float) arg1.anIntArray313[local844] / 256.0F;
							local1320 = (float) arg1.anIntArray309[local844] / 256.0F;
							@Pc(2128) int local2128 = arg1.anIntArray317[local1264] - arg1.anIntArray317[local1259];
							@Pc(2139) int local2139 = arg1.anIntArray314[local1264] - arg1.anIntArray314[local1259];
							@Pc(2150) int local2150 = arg1.anIntArray319[local1264] - arg1.anIntArray319[local1259];
							@Pc(2161) int local2161 = arg1.anIntArray317[local1269] - arg1.anIntArray317[local1259];
							@Pc(2172) int local2172 = arg1.anIntArray314[local1269] - arg1.anIntArray314[local1259];
							@Pc(2183) int local2183 = arg1.anIntArray319[local1269] - arg1.anIntArray319[local1259];
							@Pc(2192) int local2192 = local2183 * local2139 - local2150 * local2172;
							@Pc(2201) int local2201 = local2150 * local2161 - local2128 * local2183;
							@Pc(2210) int local2210 = local2128 * local2172 - local2139 * local2161;
							local1402 = 64.0F / (float) arg1.anIntArray310[local844];
							local1411 = 64.0F / (float) arg1.anIntArray315[local844];
							local1419 = 64.0F / (float) arg1.anIntArray311[local844];
							local1428 = ((float) local2210 * local1653[2] + (float) local2192 * local1653[0] + local1653[1] * (float) local2201) / local1402;
							local1437 = ((float) local2192 * local1653[3] + local1653[4] * (float) local2201 + (float) local2210 * local1653[5]) / local1411;
							local1446 = (local1653[7] * (float) local2201 + (float) local2192 * local1653[6] + (float) local2210 * local1653[8]) / local1419;
							local1218 = Static130.method8097(local1428, local1446, local1437);
							Static46.method1556(arg1.anIntArray314[local1259], local1320, local1658, local1643, local1302, local1311, local1653, local1218, Static58.aFloatArray26, local1648, arg1.anIntArray319[local1259], local1638, arg1.anIntArray317[local1259]);
							local1202 = Static58.aFloatArray26[0];
							local1204 = Static58.aFloatArray26[1];
							Static46.method1556(arg1.anIntArray314[local1264], local1320, local1658, local1643, local1302, local1311, local1653, local1218, Static58.aFloatArray26, local1648, arg1.anIntArray319[local1264], local1638, arg1.anIntArray317[local1264]);
							local1206 = Static58.aFloatArray26[0];
							local1208 = Static58.aFloatArray26[1];
							Static46.method1556(arg1.anIntArray314[local1269], local1320, local1658, local1643, local1302, local1311, local1653, local1218, Static58.aFloatArray26, local1648, arg1.anIntArray319[local1269], local1638, arg1.anIntArray317[local1269]);
							local1210 = Static58.aFloatArray26[0];
							local1212 = Static58.aFloatArray26[1];
						} else if (local1252 == 3) {
							Static430.method6638(Static58.aFloatArray26, arg1.anIntArray314[local1259], local1658, local1648, local1653, arg1.anIntArray319[local1259], local1643, local1302, arg1.anIntArray317[local1259], local1638);
							local1202 = Static58.aFloatArray26[0];
							local1204 = Static58.aFloatArray26[1];
							Static430.method6638(Static58.aFloatArray26, arg1.anIntArray314[local1264], local1658, local1648, local1653, arg1.anIntArray319[local1264], local1643, local1302, arg1.anIntArray317[local1264], local1638);
							local1206 = Static58.aFloatArray26[0];
							local1208 = Static58.aFloatArray26[1];
							Static430.method6638(Static58.aFloatArray26, arg1.anIntArray314[local1269], local1658, local1648, local1653, arg1.anIntArray319[local1269], local1643, local1302, arg1.anIntArray317[local1269], local1638);
							local1212 = Static58.aFloatArray26[1];
							local1210 = Static58.aFloatArray26[0];
							if ((local1658 & 0x1) == 0) {
								if (local1206 - local1202 > 0.5F) {
									local1214 = 1;
									local1206--;
								} else if (local1202 - local1206 > 0.5F) {
									local1214 = 2;
									local1206++;
								}
								if (local1210 - local1202 > 0.5F) {
									local1210--;
									local1216 = 1;
								} else if (local1202 - local1210 > 0.5F) {
									local1216 = 2;
									local1210++;
								}
							} else {
								if (local1212 - local1204 > 0.5F) {
									local1216 = 1;
									local1212--;
								} else if (local1204 - local1212 > 0.5F) {
									local1212++;
									local1216 = 2;
								}
								if (local1208 - local1204 > 0.5F) {
									local1214 = 1;
									local1208--;
								} else if (local1204 - local1208 > 0.5F) {
									local1214 = 2;
									local1208++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray52 == null) {
				local1252 = 0;
			} else {
				local1252 = arg1.aByteArray52[local1134];
			}
			if (local1252 == 0) {
				@Pc(2440) long local2440 = ((long) (local1218 << 24) + (long) (local1141 << 8) + (long) local855 << 32) + (long) (local844 << 2);
				local1269 = arg1.aShortArray104[local1134];
				local1274 = arg1.aShortArray109[local1134];
				local1279 = arg1.aShortArray103[local1134];
				@Pc(2459) Class296 local2459 = local532[local1269];
				this.aShortArray100[local262] = this.method5437(local1204, local1269, local2459.anInt8728, local2459.anInt8726, local2440, local1202, local2459.anInt8731, arg1, local2459.anInt8730);
				@Pc(2483) Class296 local2483 = local532[local1274];
				this.aShortArray93[local262] = this.method5437(local1208, local1274, local2483.anInt8728, local2483.anInt8726, local2440 + (long) local1214, local1206, local2483.anInt8731, arg1, local2483.anInt8730);
				@Pc(2510) Class296 local2510 = local532[local1279];
				this.aShortArray97[local262] = this.method5437(local1212, local1279, local2510.anInt8728, local2510.anInt8726, local2440 + (long) local1216, local1210, local2510.anInt8731, arg1, local2510.anInt8730);
			} else if (local1252 == 1) {
				@Pc(2544) Class376 local2544 = local815[local1134];
				@Pc(2586) long local2586 = (long) ((local2544.anInt10662 + 256 << 22) + (local2544.anInt10664 + 256 << 12) + (local2544.anInt10661 <= 0 ? 2048 : 1024) + (local844 << 2)) + ((long) local855 + (long) (local1218 << 24) + (long) (local1141 << 8) << 32);
				this.aShortArray100[local262] = this.method5437(local1204, arg1.aShortArray104[local1134], 0, local2544.anInt10661, local2586, local1202, local2544.anInt10664, arg1, local2544.anInt10662);
				this.aShortArray93[local262] = this.method5437(local1208, arg1.aShortArray109[local1134], 0, local2544.anInt10661, local2586 + (long) local1214, local1206, local2544.anInt10664, arg1, local2544.anInt10662);
				this.aShortArray97[local262] = this.method5437(local1212, arg1.aShortArray103[local1134], 0, local2544.anInt10661, (long) local1216 + local2586, local1210, local2544.anInt10664, arg1, local2544.anInt10662);
			}
			if (arg1.aByteArray51 != null) {
				this.aByteArray47[local262] = arg1.aByteArray51[local1134];
			}
			if (arg1.aShortArray105 != null) {
				this.aShortArray95[local262] = arg1.aShortArray105[local1134];
			}
			this.aShortArray91[local262] = arg1.aShortArray110[local1134];
			this.aShortArray96[local262] = local1177;
		}
		local1134 = 0;
		local834 = -10000;
		for (local844 = 0; local844 < this.anInt6514; local844++) {
			@Pc(2711) short local2711 = this.aShortArray96[local844];
			if (local2711 != local834) {
				local834 = local2711;
				local1134++;
			}
		}
		this.anIntArray301 = new int[local1134 + 1];
		local1134 = 0;
		local834 = -10000;
		for (local855 = 0; local855 < this.anInt6514; local855++) {
			local1177 = this.aShortArray96[local855];
			if (local834 != local1177) {
				local834 = local1177;
				this.anIntArray301[local1134++] = local855;
			}
		}
		this.anIntArray301[local1134] = this.anInt6514;
		Static19.aLongArray1 = null;
		this.aShortArray94 = Static235.method1735(this.anInt6454, this.aShortArray94);
		this.aShortArray98 = Static235.method1735(this.anInt6454, this.aShortArray98);
		this.aShortArray92 = Static235.method1735(this.anInt6454, this.aShortArray92);
		this.aByteArray46 = Static345.method5705(this.aByteArray46, this.anInt6454);
		this.aFloatArray61 = Static116.method2527(this.anInt6454, this.aFloatArray61);
		this.aFloatArray60 = Static116.method2527(this.anInt6454, this.aFloatArray60);
		if (arg1.anIntArray318 != null && Static204.method6285(this.anInt6446, arg2)) {
			this.anIntArrayArray27 = arg1.method5552(false);
		}
		if (arg1.aClass123Array1 != null && Static124.method8576(this.anInt6446, arg2)) {
			this.anIntArrayArray26 = arg1.method5553();
		}
		if (arg1.anIntArray312 != null && Static145.method2838(arg2, this.anInt6446)) {
			local866 = 0;
			@Pc(2864) int[] local2864 = new int[256];
			for (local888 = 0; local888 < this.anInt6464; local888++) {
				local899 = arg1.anIntArray312[local119[local888]];
				if (local899 >= 0) {
					if (local899 > local866) {
						local866 = local899;
					}
					@Pc(2886) int local2886 = local2864[local899]++;
				}
			}
			this.anIntArrayArray25 = new int[local866 + 1][];
			for (local899 = 0; local899 <= local866; local899++) {
				this.anIntArrayArray25[local899] = new int[local2864[local899]];
				local2864[local899] = 0;
			}
			for (local907 = 0; local907 < this.anInt6464; local907++) {
				local915 = arg1.anIntArray312[local119[local907]];
				if (local915 >= 0) {
					this.anIntArrayArray25[local915][local2864[local915]++] = local907;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg6 && arg1 > arg2 && arg2 < arg0) {
			return false;
		} else if (arg6 < arg2 && arg1 < arg2 && arg2 > arg0) {
			return false;
		} else if (arg5 > arg7 && arg7 < arg4 && arg7 < arg3) {
			return false;
		} else {
			return arg7 <= arg5 || arg4 >= arg7 || arg3 >= arg7;
		}
	}

	@OriginalMember(owner = "client!ln", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!ln", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!ln", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6506;
	}

	@OriginalMember(owner = "client!ln", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.lb.anInterface7_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6464; local11++) {
			if (arg0 == this.aShortArray96[local11]) {
				this.aShortArray96[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class254 local47 = local9.method6931(arg0 & 0xFFFF);
			local35 = local47.aByte98;
			local37 = local47.aByte97;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class254 local67 = local9.method6931(arg1 & 0xFFFF);
			local57 = local67.aByte97;
			local55 = local67.aByte98;
			if (local67.aByte96 != 0 || local67.aByte100 != 0) {
				this.aBoolean506 = true;
			}
		}
		if (!(local55 != local35 | local57 != local37)) {
			return;
		}
		if (this.aClass263Array1 != null) {
			for (@Pc(105) int local105 = 0; local105 < this.anInt6478; local105++) {
				@Pc(112) Class263 local112 = this.aClass263Array1[local105];
				@Pc(117) Class235 local117 = this.aClass235Array1[local105];
				local117.anInt7327 = Static376.anIntArray336[this.aShortArray91[local112.anInt7960] & 0xFFFF] & 0xFFFFFF | local117.anInt7327 & 0xFF000000;
			}
		}
		if (this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZZILclient!ln;Lclient!ln;)Lclient!ka;")
	private Class92 method5435(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92_Sub2 arg3, @OriginalArg(5) Class92_Sub2 arg4) {
		arg3.anInt6454 = this.anInt6454;
		arg3.anInt6505 = this.anInt6505;
		arg3.anInt6493 = this.anInt6493;
		arg3.anInt6514 = this.anInt6514;
		if ((arg2 & 0x100) == 0) {
			arg3.aBoolean507 = this.aBoolean507;
		} else {
			arg3.aBoolean507 = true;
		}
		arg3.anInt6446 = this.anInt6446;
		arg3.anInt6478 = this.anInt6478;
		arg3.aShort70 = this.aShort70;
		arg3.anInt6464 = this.anInt6464;
		arg3.aShort68 = this.aShort68;
		arg3.aByte74 = 0;
		arg3.aBoolean506 = this.aBoolean506;
		arg3.anInt6506 = arg2;
		@Pc(73) boolean local73 = Static82.method2207(this.anInt6446, arg2);
		@Pc(79) boolean local79 = Static178.method8794(arg2, this.anInt6446);
		@Pc(85) boolean local85 = Static359.method5820(arg2, this.anInt6446);
		@Pc(91) boolean local91 = local73 | local79 | local85;
		@Pc(200) int local200;
		if (local91) {
			if (!local73) {
				arg3.anIntArray305 = this.anIntArray305;
			} else if (arg4.anIntArray305 == null || arg4.anIntArray305.length < this.anInt6505) {
				arg3.anIntArray305 = arg4.anIntArray305 = new int[this.anInt6505];
			} else {
				arg3.anIntArray305 = arg4.anIntArray305;
			}
			if (!local79) {
				arg3.anIntArray303 = this.anIntArray303;
			} else if (arg4.anIntArray303 == null || arg4.anIntArray303.length < this.anInt6505) {
				arg3.anIntArray303 = arg4.anIntArray303 = new int[this.anInt6505];
			} else {
				arg3.anIntArray303 = arg4.anIntArray303;
			}
			if (!local85) {
				arg3.anIntArray300 = this.anIntArray300;
			} else if (arg4.anIntArray300 == null || arg4.anIntArray300.length < this.anInt6505) {
				arg3.anIntArray300 = arg4.anIntArray300 = new int[this.anInt6505];
			} else {
				arg3.anIntArray300 = arg4.anIntArray300;
			}
			for (local200 = 0; local200 < this.anInt6505; local200++) {
				if (local73) {
					arg3.anIntArray305[local200] = this.anIntArray305[local200];
				}
				if (local79) {
					arg3.anIntArray303[local200] = this.anIntArray303[local200];
				}
				if (local85) {
					arg3.anIntArray300[local200] = this.anIntArray300[local200];
				}
			}
		} else {
			arg3.anIntArray305 = this.anIntArray305;
			arg3.anIntArray300 = this.anIntArray300;
			arg3.anIntArray303 = this.anIntArray303;
		}
		if (Static296.method5063(arg2, this.anInt6446)) {
			if (arg1) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x1);
			}
			arg3.aClass121_7 = arg4.aClass121_7;
			arg3.aClass121_7.aByte34 = this.aClass121_7.aByte34;
			arg3.aClass121_7.anInterface19_3 = this.aClass121_7.anInterface19_3;
		} else if (Static52.method1638(arg2, this.anInt6446)) {
			arg3.aClass121_7 = this.aClass121_7;
		} else {
			arg3.aClass121_7 = null;
		}
		if (Static246.method4413(this.anInt6446, arg2)) {
			if (arg4.aShortArray91 == null || this.anInt6464 > arg4.aShortArray91.length) {
				arg3.aShortArray91 = arg4.aShortArray91 = new short[this.anInt6464];
			} else {
				arg3.aShortArray91 = arg4.aShortArray91;
			}
			for (local200 = 0; local200 < this.anInt6464; local200++) {
				arg3.aShortArray91[local200] = this.aShortArray91[local200];
			}
		} else {
			arg3.aShortArray91 = this.aShortArray91;
		}
		if (Static151.method3035(arg2, this.anInt6446)) {
			if (arg4.aByteArray47 == null || arg4.aByteArray47.length < this.anInt6464) {
				arg3.aByteArray47 = arg4.aByteArray47 = new byte[this.anInt6464];
			} else {
				arg3.aByteArray47 = arg4.aByteArray47;
			}
			for (local200 = 0; local200 < this.anInt6464; local200++) {
				arg3.aByteArray47[local200] = this.aByteArray47[local200];
			}
		} else {
			arg3.aByteArray47 = this.aByteArray47;
		}
		if (Static405.method6339(arg2, this.anInt6446)) {
			arg3.aClass121_4 = arg4.aClass121_4;
			if (arg1) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x2);
			}
			arg3.aClass121_4.anInterface19_3 = this.aClass121_4.anInterface19_3;
			arg3.aClass121_4.aByte34 = this.aClass121_4.aByte34;
		} else if (Static160.method3123(this.anInt6446, arg2)) {
			arg3.aClass121_4 = this.aClass121_4;
		} else {
			arg3.aClass121_4 = null;
		}
		@Pc(592) int local592;
		if (Static27.method743(arg2, this.anInt6446)) {
			if (arg4.aShortArray94 == null || this.anInt6454 > arg4.aShortArray94.length) {
				local200 = this.anInt6454;
				arg3.aShortArray94 = arg4.aShortArray94 = new short[local200];
				arg3.aShortArray92 = arg4.aShortArray92 = new short[local200];
				arg3.aShortArray98 = arg4.aShortArray98 = new short[local200];
			} else {
				arg3.aShortArray98 = arg4.aShortArray98;
				arg3.aShortArray92 = arg4.aShortArray92;
				arg3.aShortArray94 = arg4.aShortArray94;
			}
			if (this.aClass22_1 == null) {
				for (local200 = 0; local200 < this.anInt6454; local200++) {
					arg3.aShortArray94[local200] = this.aShortArray94[local200];
					arg3.aShortArray98[local200] = this.aShortArray98[local200];
					arg3.aShortArray92[local200] = this.aShortArray92[local200];
				}
			} else {
				if (arg4.aClass22_1 == null) {
					arg4.aClass22_1 = new Class22();
				}
				@Pc(576) Class22 local576 = arg3.aClass22_1 = arg4.aClass22_1;
				if (local576.aShortArray17 == null || local576.aShortArray17.length < this.anInt6454) {
					local592 = this.anInt6454;
					local576.aShortArray18 = new short[local592];
					local576.aShortArray17 = new short[local592];
					local576.aShortArray16 = new short[local592];
					local576.aByteArray4 = new byte[local592];
				}
				for (local592 = 0; local592 < this.anInt6454; local592++) {
					arg3.aShortArray94[local592] = this.aShortArray94[local592];
					arg3.aShortArray98[local592] = this.aShortArray98[local592];
					arg3.aShortArray92[local592] = this.aShortArray92[local592];
					local576.aShortArray17[local592] = this.aClass22_1.aShortArray17[local592];
					local576.aShortArray16[local592] = this.aClass22_1.aShortArray16[local592];
					local576.aShortArray18[local592] = this.aClass22_1.aShortArray18[local592];
					local576.aByteArray4[local592] = this.aClass22_1.aByteArray4[local592];
				}
			}
			arg3.aByteArray46 = this.aByteArray46;
		} else {
			arg3.aClass22_1 = this.aClass22_1;
			arg3.aByteArray46 = this.aByteArray46;
			arg3.aShortArray92 = this.aShortArray92;
			arg3.aShortArray94 = this.aShortArray94;
			arg3.aShortArray98 = this.aShortArray98;
		}
		if (Static612.method8392(arg2, this.anInt6446)) {
			arg3.aClass121_5 = arg4.aClass121_5;
			if (arg1) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x4);
			}
			arg3.aClass121_5.aByte34 = this.aClass121_5.aByte34;
			arg3.aClass121_5.anInterface19_3 = this.aClass121_5.anInterface19_3;
		} else if (Static560.method7884(this.anInt6446, arg2)) {
			arg3.aClass121_5 = this.aClass121_5;
		} else {
			arg3.aClass121_5 = null;
		}
		if (Static406.method6372(arg2, this.anInt6446)) {
			if (arg4.aFloatArray61 == null || arg4.aFloatArray61.length < this.anInt6464) {
				local200 = this.anInt6454;
				arg3.aFloatArray61 = arg4.aFloatArray61 = new float[local200];
				arg3.aFloatArray60 = arg4.aFloatArray60 = new float[local200];
			} else {
				arg3.aFloatArray61 = arg4.aFloatArray61;
				arg3.aFloatArray60 = arg4.aFloatArray60;
			}
			for (local200 = 0; local200 < this.anInt6454; local200++) {
				arg3.aFloatArray61[local200] = this.aFloatArray61[local200];
				arg3.aFloatArray60[local200] = this.aFloatArray60[local200];
			}
		} else {
			arg3.aFloatArray60 = this.aFloatArray60;
			arg3.aFloatArray61 = this.aFloatArray61;
		}
		if (Static481.method7100(this.anInt6446, arg2)) {
			arg3.aClass121_6 = arg4.aClass121_6;
			if (arg1) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x8);
			}
			arg3.aClass121_6.aByte34 = this.aClass121_6.aByte34;
			arg3.aClass121_6.anInterface19_3 = this.aClass121_6.anInterface19_3;
		} else if (Static238.method4327(arg2, this.anInt6446)) {
			arg3.aClass121_6 = this.aClass121_6;
		} else {
			arg3.aClass121_6 = null;
		}
		if (Static301.method5133(arg2, this.anInt6446)) {
			if (arg4.aShortArray100 == null || this.anInt6464 > arg4.aShortArray100.length) {
				local200 = this.anInt6464;
				arg3.aShortArray93 = arg4.aShortArray93 = new short[local200];
				arg3.aShortArray97 = arg4.aShortArray97 = new short[local200];
				arg3.aShortArray100 = arg4.aShortArray100 = new short[local200];
			} else {
				arg3.aShortArray97 = arg4.aShortArray97;
				arg3.aShortArray93 = arg4.aShortArray93;
				arg3.aShortArray100 = arg4.aShortArray100;
			}
			for (local200 = 0; local200 < this.anInt6464; local200++) {
				arg3.aShortArray100[local200] = this.aShortArray100[local200];
				arg3.aShortArray93[local200] = this.aShortArray93[local200];
				arg3.aShortArray97[local200] = this.aShortArray97[local200];
			}
		} else {
			arg3.aShortArray100 = this.aShortArray100;
			arg3.aShortArray93 = this.aShortArray93;
			arg3.aShortArray97 = this.aShortArray97;
		}
		if (Static385.method6056(this.anInt6446, arg2)) {
			arg3.aClass329_1 = arg4.aClass329_1;
			if (arg1) {
				arg3.aByte74 = (byte) (arg3.aByte74 | 0x10);
			}
			arg3.aClass329_1.anInterface9_5 = this.aClass329_1.anInterface9_5;
		} else if (Static556.method7797(this.anInt6446, arg2)) {
			arg3.aClass329_1 = this.aClass329_1;
		} else {
			arg3.aClass329_1 = null;
		}
		if (Static613.method8396(arg2, this.anInt6446)) {
			if (arg4.aShortArray96 == null || arg4.aShortArray96.length < this.anInt6464) {
				local200 = this.anInt6464;
				arg3.aShortArray96 = arg4.aShortArray96 = new short[local200];
			} else {
				arg3.aShortArray96 = arg4.aShortArray96;
			}
			for (local200 = 0; local200 < this.anInt6464; local200++) {
				arg3.aShortArray96[local200] = this.aShortArray96[local200];
			}
		} else {
			arg3.aShortArray96 = this.aShortArray96;
		}
		if (!Static539.method7627(this.anInt6446, arg2)) {
			arg3.aClass235Array1 = this.aClass235Array1;
		} else if (arg4.aClass235Array1 == null || this.anInt6478 > arg4.aClass235Array1.length) {
			local200 = this.anInt6478;
			arg3.aClass235Array1 = arg4.aClass235Array1 = new Class235[local200];
			for (local592 = 0; local592 < this.anInt6478; local592++) {
				arg3.aClass235Array1[local592] = this.aClass235Array1[local592].method6197();
			}
		} else {
			arg3.aClass235Array1 = arg4.aClass235Array1;
			for (local200 = 0; local200 < this.anInt6478; local200++) {
				arg3.aClass235Array1[local200].method6196(this.aClass235Array1[local200]);
			}
		}
		arg3.anIntArrayArray27 = this.anIntArrayArray27;
		arg3.anIntArray301 = this.anIntArray301;
		if (this.aBoolean505) {
			arg3.aBoolean505 = true;
			arg3.aShort71 = this.aShort71;
			arg3.aShort69 = this.aShort69;
			arg3.aShort65 = this.aShort65;
			arg3.aShort74 = this.aShort74;
			arg3.aShort66 = this.aShort66;
			arg3.aShort72 = this.aShort72;
			arg3.aShort73 = this.aShort73;
			arg3.aShort67 = this.aShort67;
		} else {
			arg3.aBoolean505 = false;
		}
		arg3.anIntArrayArray26 = this.anIntArrayArray26;
		arg3.anIntArray302 = this.anIntArray302;
		arg3.aShortArray99 = this.aShortArray99;
		arg3.aShortArray95 = this.aShortArray95;
		arg3.aClass103Array3 = this.aClass103Array3;
		arg3.aClass49Array3 = this.aClass49Array3;
		arg3.aClass263Array1 = this.aClass263Array1;
		arg3.anIntArrayArray25 = this.anIntArrayArray25;
		arg3.aShortArray90 = this.aShortArray90;
		return arg3;
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6493; local15++) {
			local33 = this.anIntArray305[local15] * local13 + local9 * this.anIntArray300[local15] >> 14;
			this.anIntArray300[local15] = local13 * this.anIntArray300[local15] - this.anIntArray305[local15] * local9 >> 14;
			this.anIntArray305[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6454; local33++) {
			@Pc(84) int local84 = local9 * this.aShortArray92[local33] + local13 * this.aShortArray94[local33] >> 14;
			this.aShortArray92[local33] = (short) (this.aShortArray92[local33] * local13 - this.aShortArray94[local33] * local9 >> 14);
			this.aShortArray94[local33] = (short) local84;
		}
		if (this.aClass121_5 == null && this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
		if (this.aClass121_5 != null) {
			this.aClass121_5.anInterface19_3 = null;
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6493; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray305[local15] + this.anIntArray300[local15] * local9 >> 14;
			this.anIntArray300[local15] = this.anIntArray300[local15] * local13 - local9 * this.anIntArray305[local15] >> 14;
			this.anIntArray305[local15] = local33;
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z")
	@Override
	public boolean method7052() {
		if (this.aShortArray96 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray96.length; local12++) {
			if (this.aShortArray96[local12] != -1 && !this.lb.anInterface7_10.method6928(this.aShortArray96[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	private void method5436() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6493; local23++) {
			@Pc(38) int local38 = this.anIntArray305[local23];
			@Pc(43) int local43 = this.anIntArray303[local23];
			if (local9 > local43) {
				local9 = local43;
			}
			@Pc(53) int local53 = this.anIntArray300[local23];
			if (local38 > local13) {
				local13 = local38;
			}
			if (local7 > local38) {
				local7 = local38;
			}
			if (local43 > local15) {
				local15 = local43;
			}
			if (local11 > local53) {
				local11 = local53;
			}
			if (local53 > local17) {
				local17 = local53;
			}
			@Pc(99) int local99 = local38 * local38 + local53 * local53;
			if (local19 < local99) {
				local19 = local99;
			}
			local99 = local43 * local43 + local53 * local53 + local38 * local38;
			if (local99 > local21) {
				local21 = local99;
			}
		}
		this.aShort66 = (short) local7;
		this.aShort72 = (short) local15;
		this.aShort69 = (short) local9;
		this.aShort67 = (short) local13;
		this.aShort73 = (short) local17;
		this.aShort74 = (short) local11;
		this.aShort71 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort65 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method7071(@OriginalArg(0) Class115 arg0) {
		@Pc(8) Class115_Sub1 local8 = (Class115_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass103Array3 != null) {
			for (local13 = 0; local13 < this.aClass103Array3.length; local13++) {
				@Pc(20) Class103 local20 = this.aClass103Array3[local13];
				@Pc(22) Class103 local22 = local20;
				if (local20.aClass103_1 != null) {
					local22 = local20.aClass103_1;
				}
				local22.anInt3656 = (int) (local8.aFloat77 + local8.aFloat83 * (float) this.anIntArray300[local20.anInt3652] + (float) this.anIntArray305[local20.anInt3652] * local8.aFloat86 + (float) this.anIntArray303[local20.anInt3652] * local8.aFloat82);
				local22.anInt3653 = (int) (local8.aFloat81 * (float) this.anIntArray305[local20.anInt3652] + local8.aFloat78 * (float) this.anIntArray303[local20.anInt3652] + local8.aFloat87 * (float) this.anIntArray300[local20.anInt3652] + local8.aFloat84);
				local22.anInt3657 = (int) ((float) this.anIntArray303[local20.anInt3652] * local8.aFloat79 + local8.aFloat85 * (float) this.anIntArray305[local20.anInt3652] + (float) this.anIntArray300[local20.anInt3652] * local8.aFloat76 + local8.aFloat80);
				local22.anInt3649 = (int) (local8.aFloat86 * (float) this.anIntArray305[local20.anInt3647] + (float) this.anIntArray303[local20.anInt3647] * local8.aFloat82 + (float) this.anIntArray300[local20.anInt3647] * local8.aFloat83 + local8.aFloat77);
				local22.anInt3650 = (int) ((float) this.anIntArray303[local20.anInt3647] * local8.aFloat78 + (float) this.anIntArray305[local20.anInt3647] * local8.aFloat81 + (float) this.anIntArray300[local20.anInt3647] * local8.aFloat87 + local8.aFloat84);
				local22.anInt3643 = (int) (local8.aFloat80 + (float) this.anIntArray303[local20.anInt3647] * local8.aFloat79 + local8.aFloat85 * (float) this.anIntArray305[local20.anInt3647] + local8.aFloat76 * (float) this.anIntArray300[local20.anInt3647]);
				local22.anInt3645 = (int) ((float) this.anIntArray305[local20.anInt3660] * local8.aFloat86 + local8.aFloat82 * (float) this.anIntArray303[local20.anInt3660] + (float) this.anIntArray300[local20.anInt3660] * local8.aFloat83 + local8.aFloat77);
				local22.anInt3655 = (int) (local8.aFloat81 * (float) this.anIntArray305[local20.anInt3660] + local8.aFloat78 * (float) this.anIntArray303[local20.anInt3660] + (float) this.anIntArray300[local20.anInt3660] * local8.aFloat87 + local8.aFloat84);
				local22.anInt3648 = (int) (local8.aFloat80 + (float) this.anIntArray300[local20.anInt3660] * local8.aFloat76 + (float) this.anIntArray305[local20.anInt3660] * local8.aFloat85 + (float) this.anIntArray303[local20.anInt3660] * local8.aFloat79);
			}
		}
		if (this.aClass49Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass49Array3.length; local13++) {
			@Pc(365) Class49 local365 = this.aClass49Array3[local13];
			@Pc(367) Class49 local367 = local365;
			if (local365.aClass49_1 != null) {
				local367 = local365.aClass49_1;
			}
			if (local365.aClass115_1 == null) {
				local365.aClass115_1 = local8.method6292();
			} else {
				local365.aClass115_1.method6282(local8);
			}
			local367.anInt2384 = (int) (local8.aFloat77 + local8.aFloat83 * (float) this.anIntArray300[local365.anInt2379] + (float) this.anIntArray305[local365.anInt2379] * local8.aFloat86 + (float) this.anIntArray303[local365.anInt2379] * local8.aFloat82);
			local367.anInt2381 = (int) (local8.aFloat78 * (float) this.anIntArray303[local365.anInt2379] + local8.aFloat81 * (float) this.anIntArray305[local365.anInt2379] + (float) this.anIntArray300[local365.anInt2379] * local8.aFloat87 + local8.aFloat84);
			local367.anInt2388 = (int) (local8.aFloat80 + local8.aFloat79 * (float) this.anIntArray303[local365.anInt2379] + (float) this.anIntArray305[local365.anInt2379] * local8.aFloat85 + (float) this.anIntArray300[local365.anInt2379] * local8.aFloat76);
		}
	}

	@OriginalMember(owner = "client!ln", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6493; local15++) {
			@Pc(33) int local33 = this.anIntArray305[local15] * local13 + local9 * this.anIntArray303[local15] >> 14;
			this.anIntArray303[local15] = this.anIntArray303[local15] * local13 - local9 * this.anIntArray305[local15] >> 14;
			this.anIntArray305[local15] = local33;
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
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
			Static148.anInt3475 = 0;
			local26 = 0;
			Static457.anInt8208 = 0;
			Static635.anInt10683 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray27.length) {
					local48 = this.anIntArrayArray27[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static635.anInt10683 += this.anIntArray305[local56];
						Static457.anInt8208 += this.anIntArray303[local56];
						local26++;
						Static148.anInt3475 += this.anIntArray300[local56];
					}
				}
			}
			if (local26 <= 0) {
				Static635.anInt10683 = local18;
				Static457.anInt8208 = local14;
				Static148.anInt3475 = local22;
			} else {
				Static457.anInt8208 = Static457.anInt8208 / local26 + local14;
				Static148.anInt3475 = Static148.anInt3475 / local26 + local22;
				Static635.anInt10683 = Static635.anInt10683 / local26 + local18;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray27.length) {
					local154 = this.anIntArrayArray27[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray305[local50] += local18;
						this.anIntArray303[local50] += local14;
						this.anIntArray300[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(738) int local738;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray27.length > local32) {
					local154 = this.anIntArrayArray27[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray305[local50] -= Static635.anInt10683;
							this.anIntArray303[local50] -= Static457.anInt8208;
							this.anIntArray300[local50] -= Static148.anInt3475;
							if (arg4 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg4];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg4];
								local289 = local271 * this.anIntArray305[local50] + this.anIntArray303[local50] * local56 + 16383 >> 14;
								this.anIntArray303[local50] = local271 * this.anIntArray303[local50] + 16383 - local56 * this.anIntArray305[local50] >> 14;
								this.anIntArray305[local50] = local289;
							}
							if (arg2 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg2];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg2];
								local289 = local271 * this.anIntArray303[local50] + 16383 - this.anIntArray300[local50] * local56 >> 14;
								this.anIntArray300[local50] = local56 * this.anIntArray303[local50] + local271 * this.anIntArray300[local50] + 16383 >> 14;
								this.anIntArray303[local50] = local289;
							}
							if (arg3 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg3];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg3];
								local289 = this.anIntArray305[local50] * local271 + local56 * this.anIntArray300[local50] + 16383 >> 14;
								this.anIntArray300[local50] = this.anIntArray300[local50] * local271 + 16383 - local56 * this.anIntArray305[local50] >> 14;
								this.anIntArray305[local50] = local289;
							}
							this.anIntArray305[local50] += Static635.anInt10683;
							this.anIntArray303[local50] += Static457.anInt8208;
							this.anIntArray300[local50] += Static148.anInt3475;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray305[local50] -= Static635.anInt10683;
							this.anIntArray303[local50] -= Static457.anInt8208;
							this.anIntArray300[local50] -= Static148.anInt3475;
							if (arg2 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg2];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg2];
								local289 = this.anIntArray303[local50] * local271 + 16383 - local56 * this.anIntArray300[local50] >> 14;
								this.anIntArray300[local50] = this.anIntArray303[local50] * local56 + this.anIntArray300[local50] * local271 + 16383 >> 14;
								this.anIntArray303[local50] = local289;
							}
							if (arg4 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg4];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg4];
								local289 = this.anIntArray303[local50] * local56 + this.anIntArray305[local50] * local271 + 16383 >> 14;
								this.anIntArray303[local50] = this.anIntArray303[local50] * local271 + 16383 - this.anIntArray305[local50] * local56 >> 14;
								this.anIntArray305[local50] = local289;
							}
							if (arg3 != 0) {
								local56 = Class78_Sub2_Sub2.anIntArray270[arg3];
								local271 = Class78_Sub2_Sub2.anIntArray271[arg3];
								local289 = local271 * this.anIntArray305[local50] + local56 * this.anIntArray300[local50] + 16383 >> 14;
								this.anIntArray300[local50] = this.anIntArray300[local50] * local271 + 16383 - this.anIntArray305[local50] * local56 >> 14;
								this.anIntArray305[local50] = local289;
							}
							this.anIntArray305[local50] += Static635.anInt10683;
							this.anIntArray303[local50] += Static457.anInt8208;
							this.anIntArray300[local50] += Static148.anInt3475;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray27.length) {
						local48 = this.anIntArrayArray27[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local271 = this.anIntArray302[local56];
							local289 = this.anIntArray302[local56 + 1];
							for (local738 = local271; local738 < local289; local738++) {
								@Pc(747) int local747 = this.aShortArray99[local738] - 1;
								if (local747 == -1) {
									break;
								}
								@Pc(757) int local757;
								@Pc(761) int local761;
								@Pc(779) int local779;
								if (arg4 != 0) {
									local757 = Class78_Sub2_Sub2.anIntArray270[arg4];
									local761 = Class78_Sub2_Sub2.anIntArray271[arg4];
									local779 = this.aShortArray98[local747] * local757 + this.aShortArray94[local747] * local761 + 16383 >> 14;
									this.aShortArray98[local747] = (short) (this.aShortArray98[local747] * local761 + 16383 - this.aShortArray94[local747] * local757 >> 14);
									this.aShortArray94[local747] = (short) local779;
								}
								if (arg2 != 0) {
									local757 = Class78_Sub2_Sub2.anIntArray270[arg2];
									local761 = Class78_Sub2_Sub2.anIntArray271[arg2];
									local779 = local761 * this.aShortArray98[local747] + 16383 - local757 * this.aShortArray92[local747] >> 14;
									this.aShortArray92[local747] = (short) (this.aShortArray92[local747] * local761 + this.aShortArray98[local747] * local757 + 16383 >> 14);
									this.aShortArray98[local747] = (short) local779;
								}
								if (arg3 != 0) {
									local757 = Class78_Sub2_Sub2.anIntArray270[arg3];
									local761 = Class78_Sub2_Sub2.anIntArray271[arg3];
									local779 = this.aShortArray92[local747] * local757 + this.aShortArray94[local747] * local761 + 16383 >> 14;
									this.aShortArray92[local747] = (short) (local761 * this.aShortArray92[local747] + 16383 - this.aShortArray94[local747] * local757 >> 14);
									this.aShortArray94[local747] = (short) local779;
								}
							}
						}
					}
				}
				if (this.aClass121_5 == null && this.aClass121_4 != null) {
					this.aClass121_4.anInterface19_3 = null;
				}
				if (this.aClass121_5 != null) {
					this.aClass121_5.anInterface19_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray27.length) {
					local154 = this.anIntArrayArray27[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray305[local50] -= Static635.anInt10683;
						this.anIntArray303[local50] -= Static457.anInt8208;
						this.anIntArray300[local50] -= Static148.anInt3475;
						this.anIntArray305[local50] = arg2 * this.anIntArray305[local50] >> 7;
						this.anIntArray303[local50] = arg3 * this.anIntArray303[local50] >> 7;
						this.anIntArray300[local50] = this.anIntArray300[local50] * arg4 >> 7;
						this.anIntArray305[local50] += Static635.anInt10683;
						this.anIntArray303[local50] += Static457.anInt8208;
						this.anIntArray300[local50] += Static148.anInt3475;
					}
				}
			}
		} else {
			@Pc(1200) Class263 local1200;
			@Pc(1205) Class235 local1205;
			if (arg0 == 5) {
				if (this.anIntArrayArray25 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray25.length) {
							local154 = this.anIntArrayArray25[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local50 = local154[local156];
								local56 = arg2 * 8 + (this.aByteArray47[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray47[local50] = (byte) local56;
							}
							if (local154.length > 0 && this.aClass121_4 != null) {
								this.aClass121_4.anInterface19_3 = null;
							}
						}
					}
					if (this.aClass263Array1 != null) {
						for (local32 = 0; local32 < this.anInt6478; local32++) {
							local1200 = this.aClass263Array1[local32];
							local1205 = this.aClass235Array1[local32];
							local1205.anInt7327 = local1205.anInt7327 & 0xFFFFFF | 255 - (this.aByteArray47[local1200.anInt7960] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1448) Class235 local1448;
				if (arg0 == 8) {
					if (this.anIntArrayArray26 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray26.length > local32) {
								local154 = this.anIntArrayArray26[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1448 = this.aClass235Array1[local154[local156]];
									local1448.anInt7328 += arg3;
									local1448.anInt7324 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray26 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray26.length) {
								local154 = this.anIntArrayArray26[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1448 = this.aClass235Array1[local154[local156]];
									local1448.anInt7323 = arg2 * local1448.anInt7323 >> 7;
									local1448.anInt7329 = local1448.anInt7329 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray26 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray26.length) {
							local154 = this.anIntArrayArray26[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1448 = this.aClass235Array1[local154[local156]];
								local1448.anInt7325 = arg2 + local1448.anInt7325 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray25 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray25.length > local32) {
						local154 = this.anIntArrayArray25[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							local56 = this.aShortArray91[local50] & 0xFFFF;
							local271 = local56 >> 10 & 0x3F;
							local289 = local56 >> 7 & 0x7;
							local738 = local56 & 0x7F;
							local289 += arg3 / 4;
							@Pc(1300) int local1300 = arg2 + local271 & 0x3F;
							local738 += arg4;
							if (local289 < 0) {
								local289 = 0;
							} else if (local289 > 7) {
								local289 = 7;
							}
							if (local738 < 0) {
								local738 = 0;
							} else if (local738 > 127) {
								local738 = 127;
							}
							this.aShortArray91[local50] = (short) (local738 | local1300 << 10 | local289 << 7);
						}
						if (local154.length > 0 && this.aClass121_4 != null) {
							this.aClass121_4.anInterface19_3 = null;
						}
					}
				}
				if (this.aClass263Array1 != null) {
					for (local32 = 0; local32 < this.anInt6478; local32++) {
						local1200 = this.aClass263Array1[local32];
						local1205 = this.aClass235Array1[local32];
						local1205.anInt7327 = local1205.anInt7327 & 0xFF000000 | Static376.anIntArray336[this.aShortArray91[local1200.anInt7960] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hba;IZ)V")
	@Override
	public void method7059(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray90 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6493; local14++) {
			if ((arg1 & this.aShortArray90[local14]) != 0) {
				if (arg2) {
					arg0.method6286(this.anIntArray305[local14], this.anIntArray303[local14], this.anIntArray300[local14], local12);
				} else {
					arg0.method6293(this.anIntArray305[local14], this.anIntArray303[local14], this.anIntArray300[local14], local12);
				}
				this.anIntArray305[local14] = local12[0];
				this.anIntArray303[local14] = local12[1];
				this.anIntArray300[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray27 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6505; local12++) {
			this.anIntArray305[local12] <<= 0x4;
			this.anIntArray303[local12] <<= 0x4;
			this.anIntArray300[local12] <<= 0x4;
		}
		Static457.anInt8208 = 0;
		Static148.anInt3475 = 0;
		Static635.anInt10683 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6493; local7++) {
			if (arg0 != 128) {
				this.anIntArray305[local7] = this.anIntArray305[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray303[local7] = this.anIntArray303[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray300[local7] = this.anIntArray300[local7] * arg2 >> 7;
			}
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ln", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub5_Sub10 ba(@OriginalArg(0) Class6_Sub5_Sub10 arg0) {
		if (this.anInt6454 == 0) {
			return null;
		}
		if (!this.aBoolean505) {
			this.method5436();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.lb.anInt384 <= 0) {
			local43 = this.aShort66 - (this.aShort69 * this.lb.anInt384 >> 8) >> this.lb.anInt360;
			local59 = this.aShort67 - (this.aShort72 * this.lb.anInt384 >> 8) >> this.lb.anInt360;
		} else {
			local43 = this.aShort66 - (this.aShort72 * this.lb.anInt384 >> 8) >> this.lb.anInt360;
			local59 = this.aShort67 - (this.aShort69 * this.lb.anInt384 >> 8) >> this.lb.anInt360;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.lb.anInt375 <= 0) {
			local118 = this.aShort74 - (this.lb.anInt375 * this.aShort69 >> 8) >> this.lb.anInt360;
			local135 = this.aShort73 - (this.lb.anInt375 * this.aShort72 >> 8) >> this.lb.anInt360;
		} else {
			local118 = this.aShort74 - (this.aShort72 * this.lb.anInt375 >> 8) >> this.lb.anInt360;
			local135 = this.aShort73 - (this.aShort69 * this.lb.anInt375 >> 8) >> this.lb.anInt360;
		}
		@Pc(177) int local177 = local59 + 1 - local43;
		@Pc(184) int local184 = local135 + 1 - local118;
		@Pc(187) Class6_Sub5_Sub10_Sub1 local187 = (Class6_Sub5_Sub10_Sub1) arg0;
		@Pc(203) Class6_Sub5_Sub10_Sub1 local203;
		if (local187 != null && local187.method2726(local184, local177)) {
			local203 = local187;
			local187.method2725();
		} else {
			local203 = new Class6_Sub5_Sub10_Sub1(this.lb, local177, local184);
		}
		local203.method2722(local43, local135, local59, local118);
		this.method5442(local203);
		return local203;
	}

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static635.anInt10683 = 0;
			Static148.anInt3475 = 0;
			local28 = 0;
			Static457.anInt8208 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray27.length) {
					local48 = this.anIntArrayArray27[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local56]) != 0) {
							Static635.anInt10683 += this.anIntArray305[local56];
							Static457.anInt8208 += this.anIntArray303[local56];
							local28++;
							Static148.anInt3475 += this.anIntArray300[local56];
						}
					}
				}
			}
			if (local28 <= 0) {
				Static635.anInt10683 = arg2;
				Static457.anInt8208 = arg3;
				Static148.anInt3475 = arg4;
			} else {
				Static457.anInt8208 = arg3 + Static457.anInt8208 / local28;
				Static635.anInt10683 = arg2 + Static635.anInt10683 / local28;
				Static645.aBoolean850 = true;
				Static148.anInt3475 = Static148.anInt3475 / local28 + arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg4 * arg7[2] + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local28;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray27.length) {
					local248 = this.anIntArrayArray27[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray90 == null || (this.aShortArray90[local50] & arg6) != 0) {
							this.anIntArray305[local50] += arg2;
							this.anIntArray303[local50] += arg3;
							this.anIntArray300[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(369) int local369;
		@Pc(391) int local391;
		@Pc(417) int local417;
		@Pc(448) int local448;
		@Pc(452) int local452;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(468) int local468;
		@Pc(476) int local476;
		@Pc(630) int local630;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(678) int local678;
		@Pc(682) int local682;
		@Pc(684) int local684;
		@Pc(816) int[] local816;
		@Pc(818) int local818;
		@Pc(822) int local822;
		@Pc(826) int local826;
		@Pc(828) int local828;
		@Pc(957) int local957;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray27.length > local32) {
						local248 = this.anIntArrayArray27[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local50]) != 0) {
								this.anIntArray305[local50] -= Static635.anInt10683;
								this.anIntArray303[local50] -= Static457.anInt8208;
								this.anIntArray300[local50] -= Static148.anInt3475;
								if (arg4 != 0) {
									local56 = Class78_Sub2_Sub2.anIntArray270[arg4];
									local369 = Class78_Sub2_Sub2.anIntArray271[arg4];
									local391 = this.anIntArray303[local50] * local56 + this.anIntArray305[local50] * local369 + 16383 >> 14;
									this.anIntArray303[local50] = this.anIntArray303[local50] * local369 + 16383 - local56 * this.anIntArray305[local50] >> 14;
									this.anIntArray305[local50] = local391;
								}
								if (arg2 != 0) {
									local56 = Class78_Sub2_Sub2.anIntArray270[arg2];
									local369 = Class78_Sub2_Sub2.anIntArray271[arg2];
									local391 = local369 * this.anIntArray303[local50] + 16383 - local56 * this.anIntArray300[local50] >> 14;
									this.anIntArray300[local50] = local56 * this.anIntArray303[local50] + local369 * this.anIntArray300[local50] + 16383 >> 14;
									this.anIntArray303[local50] = local391;
								}
								if (arg3 != 0) {
									local56 = Class78_Sub2_Sub2.anIntArray270[arg3];
									local369 = Class78_Sub2_Sub2.anIntArray271[arg3];
									local391 = local56 * this.anIntArray300[local50] + this.anIntArray305[local50] * local369 + 16383 >> 14;
									this.anIntArray300[local50] = local369 * this.anIntArray300[local50] + 16383 - local56 * this.anIntArray305[local50] >> 14;
									this.anIntArray305[local50] = local391;
								}
								this.anIntArray305[local50] += Static635.anInt10683;
								this.anIntArray303[local50] += Static457.anInt8208;
								this.anIntArray300[local50] += Static148.anInt3475;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray27.length) {
							local48 = this.anIntArrayArray27[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray90 == null || (this.aShortArray90[local56] & arg6) != 0) {
									local369 = this.anIntArray302[local56];
									local391 = this.anIntArray302[local56 + 1];
									for (local417 = local369; local417 < local391; local417++) {
										local448 = this.aShortArray99[local417] - 1;
										if (local448 == -1) {
											break;
										}
										if (arg4 != 0) {
											local452 = Class78_Sub2_Sub2.anIntArray270[arg4];
											local456 = Class78_Sub2_Sub2.anIntArray271[arg4];
											local460 = local456 * this.aShortArray94[local448] + local452 * this.aShortArray98[local448] + 16383 >> 14;
											this.aShortArray98[local448] = (short) (local456 * this.aShortArray98[local448] + 16383 - this.aShortArray94[local448] * local452 >> 14);
											this.aShortArray94[local448] = (short) local460;
										}
										if (arg2 != 0) {
											local452 = Class78_Sub2_Sub2.anIntArray270[arg2];
											local456 = Class78_Sub2_Sub2.anIntArray271[arg2];
											local460 = this.aShortArray98[local448] * local456 + 16383 - this.aShortArray92[local448] * local452 >> 14;
											this.aShortArray92[local448] = (short) (this.aShortArray98[local448] * local452 + local456 * this.aShortArray92[local448] + 16383 >> 14);
											this.aShortArray98[local448] = (short) local460;
										}
										if (arg3 != 0) {
											local452 = Class78_Sub2_Sub2.anIntArray270[arg3];
											local456 = Class78_Sub2_Sub2.anIntArray271[arg3];
											local460 = this.aShortArray92[local448] * local452 + local456 * this.aShortArray94[local448] + 16383 >> 14;
											this.aShortArray92[local448] = (short) (local456 * this.aShortArray92[local448] + 16383 - this.aShortArray94[local448] * local452 >> 14);
											this.aShortArray94[local448] = (short) local460;
										}
									}
								}
							}
						}
					}
					if (this.aClass121_5 == null && this.aClass121_4 != null) {
						this.aClass121_4.anInterface19_3 = null;
					}
					if (this.aClass121_5 != null) {
						this.aClass121_5.anInterface19_3 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static645.aBoolean850) {
					local369 = arg7[6] * Static148.anInt3475 + Static457.anInt8208 * arg7[3] + Static635.anInt10683 * arg7[0] + 8192 >> 14;
					local391 = arg7[7] * Static148.anInt3475 + arg7[4] * Static457.anInt8208 + arg7[1] * Static635.anInt10683 + 8192 >> 14;
					local391 += local50;
					local417 = arg7[8] * Static148.anInt3475 + arg7[5] * Static457.anInt8208 + arg7[2] * Static635.anInt10683 + 8192 >> 14;
					local369 += local250;
					Static635.anInt10683 = local369;
					Static457.anInt8208 = local391;
					local417 += local56;
					Static645.aBoolean850 = false;
					Static148.anInt3475 = local417;
				}
				@Pc(436) int[] local436 = new int[9];
				local391 = Class78_Sub2_Sub2.anIntArray271[arg2];
				local417 = Class78_Sub2_Sub2.anIntArray270[arg2];
				local448 = Class78_Sub2_Sub2.anIntArray271[arg3];
				local452 = Class78_Sub2_Sub2.anIntArray270[arg3];
				local456 = Class78_Sub2_Sub2.anIntArray271[arg4];
				local460 = Class78_Sub2_Sub2.anIntArray270[arg4];
				local468 = local417 * local456 + 8192 >> 14;
				local476 = local417 * local460 + 8192 >> 14;
				local436[1] = local468 * local452 + -local448 * local460 + 8192 >> 14;
				local436[4] = local456 * local391 + 8192 >> 14;
				local436[8] = local391 * local448 + 8192 >> 14;
				local436[7] = local468 * local448 + local460 * local452 + 8192 >> 14;
				local436[5] = -local417;
				local436[2] = local452 * local391 + 8192 >> 14;
				local436[6] = local448 * local476 + -local452 * local456 + 8192 >> 14;
				local436[3] = local460 * local391 + 8192 >> 14;
				local436[0] = local452 * local476 + local456 * local448 + 8192 >> 14;
				@Pc(604) int local604 = -Static148.anInt3475 * local436[2] + -Static635.anInt10683 * local436[0] + local436[1] * -Static457.anInt8208 + 8192 >> 14;
				local630 = local436[3] * -Static635.anInt10683 + -Static457.anInt8208 * local436[4] + -Static148.anInt3475 * local436[5] + 8192 >> 14;
				local657 = local436[6] * -Static635.anInt10683 + -Static457.anInt8208 * local436[7] + local436[8] * -Static148.anInt3475 + 8192 >> 14;
				local661 = local604 + Static635.anInt10683;
				@Pc(665) int local665 = Static457.anInt8208 + local630;
				local669 = Static148.anInt3475 + local657;
				@Pc(672) int[] local672 = new int[9];
				for (local674 = 0; local674 < 3; local674++) {
					for (local678 = 0; local678 < 3; local678++) {
						local682 = 0;
						for (local684 = 0; local684 < 3; local684++) {
							local682 += arg7[local684 + local678 * 3] * local436[local684 + local674 * 3];
						}
						local672[local678 + local674 * 3] = local682 + 8192 >> 14;
					}
				}
				local678 = local436[0] * local250 + local50 * local436[1] + local436[2] * local56 + 8192 >> 14;
				local682 = local56 * local436[5] + local436[3] * local250 + local50 * local436[4] + 8192 >> 14;
				local684 = local50 * local436[7] + local250 * local436[6] + local436[8] * local56 + 8192 >> 14;
				local678 += local661;
				local682 += local665;
				local684 += local669;
				local816 = new int[9];
				for (local818 = 0; local818 < 3; local818++) {
					for (local822 = 0; local822 < 3; local822++) {
						local826 = 0;
						for (local828 = 0; local828 < 3; local828++) {
							local826 += arg7[local828 + local818 * 3] * local672[local828 * 3 + local822];
						}
						local816[local822 + local818 * 3] = local826 + 8192 >> 14;
					}
				}
				local822 = arg7[0] * local678 + arg7[1] * local682 + arg7[2] * local684 + 8192 >> 14;
				local826 = local684 * arg7[5] + arg7[3] * local678 + local682 * arg7[4] + 8192 >> 14;
				local822 += local28;
				local826 += local32;
				local828 = local684 * arg7[8] + local682 * arg7[7] + local678 * arg7[6] + 8192 >> 14;
				local828 += local38;
				for (local957 = 0; local957 < local8; local957++) {
					@Pc(963) int local963 = arg1[local957];
					if (local963 < this.anIntArrayArray27.length) {
						@Pc(977) int[] local977 = this.anIntArrayArray27[local963];
						for (@Pc(979) int local979 = 0; local979 < local977.length; local979++) {
							@Pc(985) int local985 = local977[local979];
							if (this.aShortArray90 == null || (this.aShortArray90[local985] & arg6) != 0) {
								@Pc(1029) int local1029 = local816[2] * this.anIntArray300[local985] + local816[1] * this.anIntArray303[local985] + this.anIntArray305[local985] * local816[0] + 8192 >> 14;
								@Pc(1061) int local1061 = this.anIntArray300[local985] * local816[5] + this.anIntArray305[local985] * local816[3] + this.anIntArray303[local985] * local816[4] + 8192 >> 14;
								@Pc(1092) int local1092 = local816[8] * this.anIntArray300[local985] + this.anIntArray303[local985] * local816[7] + this.anIntArray305[local985] * local816[6] + 8192 >> 14;
								@Pc(1096) int local1096 = local1061 + local826;
								@Pc(1100) int local1100 = local1029 + local822;
								@Pc(1104) int local1104 = local1092 + local828;
								this.anIntArray305[local985] = local1100;
								this.anIntArray303[local985] = local1096;
								this.anIntArray300[local985] = local1104;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2598) Class263 local2598;
			@Pc(2603) Class235 local2603;
			if (arg0 == 5) {
				if (this.anIntArrayArray25 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray25.length > local32) {
							local248 = this.anIntArrayArray25[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local50 = local248[local250];
								if (this.aShortArray95 == null || (this.aShortArray95[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray47[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray47[local50] = (byte) local56;
									if (this.aClass121_4 != null) {
										this.aClass121_4.anInterface19_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass263Array1 != null) {
						for (local32 = 0; local32 < this.anInt6478; local32++) {
							local2598 = this.aClass263Array1[local32];
							local2603 = this.aClass235Array1[local32];
							local2603.anInt7327 = 255 - (this.aByteArray47[local2598.anInt7960] & 0xFF) << 24 | local2603.anInt7327 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2863) Class235 local2863;
				if (arg0 == 8) {
					if (this.anIntArrayArray26 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray26.length) {
								local248 = this.anIntArrayArray26[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2863 = this.aClass235Array1[local248[local250]];
									local2863.anInt7328 += arg3;
									local2863.anInt7324 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray26 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray26.length > local32) {
								local248 = this.anIntArrayArray26[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2863 = this.aClass235Array1[local248[local250]];
									local2863.anInt7323 = arg2 * local2863.anInt7323 >> 7;
									local2863.anInt7329 = local2863.anInt7329 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray26 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray26.length > local32) {
							local248 = this.anIntArrayArray26[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2863 = this.aClass235Array1[local248[local250]];
								local2863.anInt7325 = arg2 + local2863.anInt7325 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray25 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray25.length > local32) {
						local248 = this.anIntArrayArray25[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray95 == null || (arg6 & this.aShortArray95[local50]) != 0) {
								local56 = this.aShortArray91[local50] & 0xFFFF;
								local369 = local56 >> 10 & 0x3F;
								local391 = local56 >> 7 & 0x7;
								@Pc(2704) int local2704 = arg2 + local369 & 0x3F;
								local417 = local56 & 0x7F;
								local391 += arg3 / 4;
								if (local391 < 0) {
									local391 = 0;
								} else if (local391 > 7) {
									local391 = 7;
								}
								local417 += arg4;
								if (local417 < 0) {
									local417 = 0;
								} else if (local417 > 127) {
									local417 = 127;
								}
								this.aShortArray91[local50] = (short) (local391 << 7 | local2704 << 10 | local417);
								if (this.aClass121_4 != null) {
									this.aClass121_4.anInterface19_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass263Array1 != null) {
					for (local32 = 0; local32 < this.anInt6478; local32++) {
						local2598 = this.aClass263Array1[local32];
						local2603 = this.aClass235Array1[local32];
						local2603.anInt7327 = local2603.anInt7327 & 0xFF000000 | Static376.anIntArray336[this.aShortArray91[local2598.anInt7960] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray27.length > local32) {
					local248 = this.anIntArrayArray27[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local50]) != 0) {
							this.anIntArray305[local50] -= Static635.anInt10683;
							this.anIntArray303[local50] -= Static457.anInt8208;
							this.anIntArray300[local50] -= Static148.anInt3475;
							this.anIntArray305[local50] = this.anIntArray305[local50] * arg2 >> 7;
							this.anIntArray303[local50] = this.anIntArray303[local50] * arg3 >> 7;
							this.anIntArray300[local50] = arg4 * this.anIntArray300[local50] >> 7;
							this.anIntArray305[local50] += Static635.anInt10683;
							this.anIntArray303[local50] += Static457.anInt8208;
							this.anIntArray300[local50] += Static148.anInt3475;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static645.aBoolean850) {
				local369 = arg7[0] * Static635.anInt10683 + arg7[3] * Static457.anInt8208 + arg7[6] * Static148.anInt3475 + 8192 >> 14;
				local391 = Static148.anInt3475 * arg7[7] + Static635.anInt10683 * arg7[1] + arg7[4] * Static457.anInt8208 + 8192 >> 14;
				local369 += local250;
				local417 = arg7[5] * Static457.anInt8208 + arg7[2] * Static635.anInt10683 + arg7[8] * Static148.anInt3475 + 8192 >> 14;
				local391 += local50;
				local417 += local56;
				Static635.anInt10683 = local369;
				Static457.anInt8208 = local391;
				Static148.anInt3475 = local417;
				Static645.aBoolean850 = false;
			}
			local369 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local417 = arg4 << 15 >> 7;
			local448 = local369 * -Static635.anInt10683 + 8192 >> 14;
			local452 = local391 * -Static457.anInt8208 + 8192 >> 14;
			local456 = -Static148.anInt3475 * local417 + 8192 >> 14;
			local460 = local448 + Static635.anInt10683;
			local468 = Static457.anInt8208 + local452;
			local476 = local456 + Static148.anInt3475;
			@Pc(2023) int[] local2023 = new int[] { arg7[0] * local369 + 8192 >> 14, arg7[3] * local369 + 8192 >> 14, local369 * arg7[6] + 8192 >> 14, arg7[1] * local391 + 8192 >> 14, arg7[4] * local391 + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local417 * arg7[2] + 8192 >> 14, local417 * arg7[5] + 8192 >> 14, local417 * arg7[8] + 8192 >> 14 };
			local630 = local369 * local250 + 8192 >> 14;
			local657 = local391 * local50 + 8192 >> 14;
			local661 = local56 * local417 + 8192 >> 14;
			@Pc(2159) int local2159 = local657 + local468;
			@Pc(2163) int local2163 = local630 + local460;
			@Pc(2167) int local2167 = local661 + local476;
			@Pc(2170) int[] local2170 = new int[9];
			@Pc(2176) int local2176;
			for (local669 = 0; local669 < 3; local669++) {
				for (local2176 = 0; local2176 < 3; local2176++) {
					local674 = 0;
					for (local678 = 0; local678 < 3; local678++) {
						local674 += local2023[local678 * 3 + local2176] * arg7[local669 * 3 + local678];
					}
					local2170[local669 * 3 + local2176] = local674 + 8192 >> 14;
				}
			}
			local2176 = local2159 * arg7[1] + arg7[0] * local2163 + local2167 * arg7[2] + 8192 >> 14;
			local674 = arg7[3] * local2163 + arg7[4] * local2159 + local2167 * arg7[5] + 8192 >> 14;
			local678 = local2159 * arg7[7] + local2163 * arg7[6] + arg7[8] * local2167 + 8192 >> 14;
			local2176 += local28;
			local674 += local32;
			local678 += local38;
			for (local682 = 0; local682 < local8; local682++) {
				local684 = arg1[local682];
				if (this.anIntArrayArray27.length > local684) {
					local816 = this.anIntArrayArray27[local684];
					for (local818 = 0; local818 < local816.length; local818++) {
						local822 = local816[local818];
						if (this.aShortArray90 == null || (arg6 & this.aShortArray90[local822]) != 0) {
							local826 = local2170[2] * this.anIntArray300[local822] + this.anIntArray305[local822] * local2170[0] + this.anIntArray303[local822] * local2170[1] + 8192 >> 14;
							local828 = this.anIntArray300[local822] * local2170[5] + this.anIntArray305[local822] * local2170[3] + this.anIntArray303[local822] * local2170[4] + 8192 >> 14;
							local957 = this.anIntArray303[local822] * local2170[7] + this.anIntArray305[local822] * local2170[6] + local2170[8] * this.anIntArray300[local822] + 8192 >> 14;
							@Pc(2449) int local2449 = local826 + local2176;
							@Pc(2453) int local2453 = local828 + local674;
							@Pc(2457) int local2457 = local957 + local678;
							this.anIntArray305[local822] = local2449;
							this.anIntArray303[local822] = local2453;
							this.anIntArray300[local822] = local2457;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BFIIIJFILclient!lv;I)S")
	private short method5437(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class192 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray302[arg1];
		@Pc(17) int local17 = this.anIntArray302[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray99[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static19.aLongArray1[local21] == arg4) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray99[local19] = (short) (this.anInt6454 + 1);
		Static19.aLongArray1[local19] = arg4;
		this.aShortArray94[this.anInt6454] = (short) arg3;
		this.aShortArray98[this.anInt6454] = (short) arg6;
		this.aShortArray92[this.anInt6454] = (short) arg8;
		this.aByteArray46[this.anInt6454] = (byte) arg2;
		this.aFloatArray61[this.anInt6454] = arg5;
		this.aFloatArray60[this.anInt6454] = arg0;
		return (short) this.anInt6454++;
	}

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort68 = (short) arg0;
		if (this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static635.anInt10683 = 0;
			Static148.anInt3475 = 0;
			Static457.anInt8208 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt6493; local17++) {
				Static635.anInt10683 += this.anIntArray305[local17];
				Static457.anInt8208 += this.anIntArray303[local17];
				Static148.anInt3475 += this.anIntArray300[local17];
				local15++;
			}
			if (local15 > 0) {
				Static635.anInt10683 = Static635.anInt10683 / local15 + arg1;
				Static148.anInt3475 = arg3 + Static148.anInt3475 / local15;
				Static457.anInt8208 = Static457.anInt8208 / local15 + arg2;
			} else {
				Static148.anInt3475 = arg3;
				Static635.anInt10683 = arg1;
				Static457.anInt8208 = arg2;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt6493; local15++) {
				this.anIntArray305[local15] += arg1;
				this.anIntArray303[local15] += arg2;
				this.anIntArray300[local15] += arg3;
			}
		} else {
			@Pc(169) int local169;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt6493; local15++) {
					this.anIntArray305[local15] -= Static635.anInt10683;
					this.anIntArray303[local15] -= Static457.anInt8208;
					this.anIntArray300[local15] -= Static148.anInt3475;
					if (arg3 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg3];
						local169 = Class78_Sub2_Sub2.anIntArray271[arg3];
						local187 = this.anIntArray305[local15] * local169 + local17 * this.anIntArray303[local15] + 16383 >> 14;
						this.anIntArray303[local15] = local169 * this.anIntArray303[local15] + 16383 - this.anIntArray305[local15] * local17 >> 14;
						this.anIntArray305[local15] = local187;
					}
					if (arg1 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg1];
						local169 = Class78_Sub2_Sub2.anIntArray271[arg1];
						local187 = this.anIntArray303[local15] * local169 + 16383 - this.anIntArray300[local15] * local17 >> 14;
						this.anIntArray300[local15] = local17 * this.anIntArray303[local15] + this.anIntArray300[local15] * local169 + 16383 >> 14;
						this.anIntArray303[local15] = local187;
					}
					if (arg2 != 0) {
						local17 = Class78_Sub2_Sub2.anIntArray270[arg2];
						local169 = Class78_Sub2_Sub2.anIntArray271[arg2];
						local187 = local17 * this.anIntArray300[local15] + this.anIntArray305[local15] * local169 + 16383 >> 14;
						this.anIntArray300[local15] = this.anIntArray300[local15] * local169 + 16383 - local17 * this.anIntArray305[local15] >> 14;
						this.anIntArray305[local15] = local187;
					}
					this.anIntArray305[local15] += Static635.anInt10683;
					this.anIntArray303[local15] += Static457.anInt8208;
					this.anIntArray300[local15] += Static148.anInt3475;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt6493; local15++) {
					this.anIntArray305[local15] -= Static635.anInt10683;
					this.anIntArray303[local15] -= Static457.anInt8208;
					this.anIntArray300[local15] -= Static148.anInt3475;
					this.anIntArray305[local15] = this.anIntArray305[local15] * arg1 / 128;
					this.anIntArray303[local15] = this.anIntArray303[local15] * arg2 / 128;
					this.anIntArray300[local15] = arg3 * this.anIntArray300[local15] / 128;
					this.anIntArray305[local15] += Static635.anInt10683;
					this.anIntArray303[local15] += Static457.anInt8208;
					this.anIntArray300[local15] += Static148.anInt3475;
				}
			} else {
				@Pc(531) Class263 local531;
				@Pc(536) Class235 local536;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt6464; local15++) {
						local17 = arg1 * 8 + (this.aByteArray47[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray47[local15] = (byte) local17;
					}
					if (this.aClass121_4 != null) {
						this.aClass121_4.anInterface19_3 = null;
					}
					if (this.aClass263Array1 != null) {
						for (local17 = 0; local17 < this.anInt6478; local17++) {
							local531 = this.aClass263Array1[local17];
							local536 = this.aClass235Array1[local17];
							local536.anInt7327 = 255 - (this.aByteArray47[local531.anInt7960] & 0xFF) << 24 | local536.anInt7327 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt6464; local15++) {
						local17 = this.aShortArray91[local15] & 0xFFFF;
						local169 = local17 >> 10 & 0x3F;
						local187 = local17 >> 7 & 0x7;
						@Pc(595) int local595 = arg1 + local169 & 0x3F;
						local187 += arg2 / 4;
						@Pc(605) int local605 = local17 & 0x7F;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						local605 += arg3;
						if (local605 < 0) {
							local605 = 0;
						} else if (local605 > 127) {
							local605 = 127;
						}
						this.aShortArray91[local15] = (short) (local595 << 10 | local187 << 7 | local605);
					}
					if (this.aClass121_4 != null) {
						this.aClass121_4.anInterface19_3 = null;
					}
					if (this.aClass263Array1 != null) {
						for (local17 = 0; local17 < this.anInt6478; local17++) {
							local531 = this.aClass263Array1[local17];
							local536 = this.aClass235Array1[local17];
							local536.anInt7327 = local536.anInt7327 & 0xFF000000 | Static376.anIntArray336[this.aShortArray91[local531.anInt7960] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(718) Class235 local718;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt6478; local15++) {
							local718 = this.aClass235Array1[local15];
							local718.anInt7328 += arg2;
							local718.anInt7324 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt6478; local15++) {
							local718 = this.aClass235Array1[local15];
							local718.anInt7323 = arg1 * local718.anInt7323 >> 7;
							local718.anInt7329 = arg2 * local718.anInt7329 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt6478; local15++) {
							local718 = this.aClass235Array1[local15];
							local718.anInt7325 = arg1 + local718.anInt7325 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()[Lclient!fk;")
	@Override
	public Class103[] method7048() {
		return this.aClass103Array3;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	private void method5438() {
		if (this.anInt6514 == 0) {
			return;
		}
		if (this.aByte74 != 0) {
			this.method5446(true);
		}
		this.method5446(false);
		if (this.aClass329_1 != null) {
			if (this.aClass329_1.anInterface9_5 == null) {
				this.method5444((this.aByte74 & 0x10) != 0);
			}
			if (this.aClass329_1.anInterface9_5 != null) {
				this.lb.method340(this.aClass121_5 != null);
				this.lb.method357(this.aClass121_4, this.aClass121_5, this.aClass121_6, this.aClass121_7);
				@Pc(79) int local79 = this.anIntArray301.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray301[local81];
					@Pc(95) int local95 = this.anIntArray301[local81 + 1];
					@Pc(102) int local102 = this.aShortArray96[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.lb.method397(this.aClass121_5 != null, local102);
					this.lb.method354((local95 - local88) * 3, this.aClass329_1.anInterface9_5, local88 * 3);
				}
			}
		}
		this.method5439();
	}

	@OriginalMember(owner = "client!ln", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort70 = (short) arg0;
		if (this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
		if (this.aClass121_5 != null) {
			this.aClass121_5.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	private void method5439() {
		if (!this.aBoolean508) {
			return;
		}
		this.aBoolean508 = false;
		if (this.aClass103Array3 == null && this.aClass49Array3 == null && this.aClass263Array1 == null) {
			if (this.anIntArray305 != null && !Static324.method5394(this.anInt6506, this.anInt6446)) {
				if (this.aClass121_7 != null && this.aClass121_7.anInterface19_3 == null) {
					this.aBoolean508 = true;
				} else {
					if (!this.aBoolean505) {
						this.method5436();
					}
					this.anIntArray305 = null;
				}
			}
			if (this.anIntArray303 != null && !Static502.method6027(this.anInt6506, this.anInt6446)) {
				if (this.aClass121_7 != null && this.aClass121_7.anInterface19_3 == null) {
					this.aBoolean508 = true;
				} else {
					if (!this.aBoolean505) {
						this.method5436();
					}
					this.anIntArray303 = null;
				}
			}
			if (this.anIntArray300 != null && !Static167.method3174(this.anInt6446, this.anInt6506)) {
				if (this.aClass121_7 != null && this.aClass121_7.anInterface19_3 == null) {
					this.aBoolean508 = true;
				} else {
					if (!this.aBoolean505) {
						this.method5436();
					}
					this.anIntArray300 = null;
				}
			}
		}
		if (this.aShortArray99 != null && this.anIntArray305 == null && this.anIntArray303 == null && this.anIntArray300 == null) {
			this.aShortArray99 = null;
			this.anIntArray302 = null;
		}
		if (this.aByteArray46 != null && !Static350.method5733(this.anInt6506, this.anInt6446)) {
			if (this.aClass121_5 == null) {
				if (this.aClass121_4 != null && this.aClass121_4.anInterface19_3 == null) {
					this.aBoolean508 = true;
				} else {
					this.aByteArray46 = null;
					this.aShortArray94 = this.aShortArray98 = this.aShortArray92 = null;
				}
			} else if (this.aClass121_5.anInterface19_3 == null) {
				this.aBoolean508 = true;
			} else {
				this.aByteArray46 = null;
				this.aShortArray94 = this.aShortArray98 = this.aShortArray92 = null;
			}
		}
		if (this.aShortArray91 != null && !Static61.method1763(this.anInt6446, this.anInt6506)) {
			if (this.aClass121_4 != null && this.aClass121_4.anInterface19_3 == null) {
				this.aBoolean508 = true;
			} else {
				this.aShortArray91 = null;
			}
		}
		if (this.aByteArray47 != null && !Static240.method4373(this.anInt6506, this.anInt6446)) {
			if (this.aClass121_4 != null && this.aClass121_4.anInterface19_3 == null) {
				this.aBoolean508 = true;
			} else {
				this.aByteArray47 = null;
			}
		}
		if (this.aFloatArray61 != null && !Static209.method3769(this.anInt6446, this.anInt6506)) {
			if (this.aClass121_6 != null && this.aClass121_6.anInterface19_3 == null) {
				this.aBoolean508 = true;
			} else {
				this.aFloatArray61 = this.aFloatArray60 = null;
			}
		}
		if (this.aShortArray96 != null && !Static116.method2525(this.anInt6506, this.anInt6446)) {
			if (this.aClass121_4 != null && this.aClass121_4.anInterface19_3 == null) {
				this.aBoolean508 = true;
			} else {
				this.aShortArray96 = null;
			}
		}
		if (this.aShortArray100 != null && !Static460.method6927(this.anInt6506, this.anInt6446)) {
			if ((this.aClass329_1 == null || this.aClass329_1.anInterface9_5 != null) && (this.aClass121_4 == null || this.aClass121_4.anInterface19_3 != null)) {
				this.aShortArray100 = this.aShortArray93 = this.aShortArray97 = null;
			} else {
				this.aBoolean508 = true;
			}
		}
		if (this.anIntArrayArray25 != null && !Static145.method2838(this.anInt6506, this.anInt6446)) {
			this.aShortArray95 = null;
			this.anIntArrayArray25 = null;
		}
		if (this.anIntArrayArray27 != null && !Static204.method6285(this.anInt6446, this.anInt6506)) {
			this.aShortArray90 = null;
			this.anIntArrayArray27 = null;
		}
		if (this.anIntArrayArray26 != null && !Static124.method8576(this.anInt6446, this.anInt6506)) {
			this.anIntArrayArray26 = null;
		}
		if (this.anIntArray301 != null && (this.anInt6506 & 0x800) == 0 && (this.anInt6506 & 0x40000) == 0) {
			this.anIntArray301 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!hba;ZI)Z")
	@Override
	public boolean method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5445(arg4, arg1, arg0, arg2, -1, arg3);
	}

	@OriginalMember(owner = "client!ln", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hba;Lclient!lda;I)V")
	@Override
	public void method7053(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6454 == 0) {
			return;
		}
		@Pc(16) Class115_Sub1 local16 = this.lb.aClass115_Sub1_3;
		if (!this.aBoolean505) {
			this.method5436();
		}
		@Pc(25) Class115_Sub1 local25 = (Class115_Sub1) arg0;
		Static317.aFloat128 = local16.aFloat85 * local25.aFloat82 + local16.aFloat79 * local25.aFloat78 + local25.aFloat79 * local16.aFloat76;
		Static46.aFloat58 = local25.aFloat84 * local16.aFloat79 + local16.aFloat85 * local25.aFloat77 + local25.aFloat80 * local16.aFloat76 + local16.aFloat80;
		@Pc(72) float local72 = Static317.aFloat128 * (float) this.aShort69 + Static46.aFloat58;
		@Pc(80) float local80 = Static46.aFloat58 + Static317.aFloat128 * (float) this.aShort72;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = local80 - (float) this.aShort71;
			local96 = local72 + (float) this.aShort71;
		} else {
			local90 = local72 - (float) this.aShort71;
			local96 = local80 + (float) this.aShort71;
		}
		if (this.lb.aFloat10 <= local90 || (float) this.lb.anInt386 >= local96) {
			return;
		}
		Static103.aFloat71 = local16.aFloat86 * local25.aFloat77 + local16.aFloat82 * local25.aFloat84 + local25.aFloat80 * local16.aFloat83 + local16.aFloat77;
		Static501.aFloat164 = local25.aFloat79 * local16.aFloat83 + local16.aFloat86 * local25.aFloat82 + local16.aFloat82 * local25.aFloat78;
		@Pc(172) float local172 = Static103.aFloat71 + Static501.aFloat164 * (float) this.aShort69;
		@Pc(180) float local180 = (float) this.aShort72 * Static501.aFloat164 + Static103.aFloat71;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local207 = (float) this.lb.anInt394 * ((float) -this.aShort71 + local180);
			local195 = (float) this.lb.anInt394 * (local172 + (float) this.aShort71);
		} else {
			local195 = (float) this.lb.anInt394 * (local180 + (float) this.aShort71);
			local207 = (float) this.lb.anInt394 * ((float) -this.aShort71 + local172);
		}
		if (this.lb.aFloat3 <= local207 / local96 || local195 / local96 <= this.lb.aFloat15) {
			return;
		}
		Static641.aFloat191 = local16.aFloat84 + local25.aFloat84 * local16.aFloat78 + local16.aFloat81 * local25.aFloat77 + local25.aFloat80 * local16.aFloat87;
		Static84.aFloat68 = local16.aFloat81 * local25.aFloat82 + local25.aFloat78 * local16.aFloat78 + local16.aFloat87 * local25.aFloat79;
		@Pc(297) float local297 = (float) this.aShort69 * Static84.aFloat68 + Static641.aFloat191;
		@Pc(305) float local305 = Static84.aFloat68 * (float) this.aShort72 + Static641.aFloat191;
		@Pc(331) float local331;
		@Pc(320) float local320;
		if (local297 > local305) {
			local331 = (local305 - (float) this.aShort71) * (float) this.lb.anInt376;
			local320 = (float) this.lb.anInt376 * ((float) this.aShort71 + local297);
		} else {
			local320 = (local305 + (float) this.aShort71) * (float) this.lb.anInt376;
			local331 = (float) this.lb.anInt376 * (local297 - (float) this.aShort71);
		}
		if (this.lb.aFloat19 <= local331 / local96 || this.lb.aFloat2 >= local320 / local96) {
			return;
		}
		if (arg1 != null || this.aClass263Array1 != null) {
			Static634.aFloat190 = local25.aFloat86 * local16.aFloat85 + local16.aFloat79 * local25.aFloat81 + local25.aFloat85 * local16.aFloat76;
			Static381.aFloat140 = local25.aFloat87 * local16.aFloat79 + local25.aFloat83 * local16.aFloat85 + local25.aFloat76 * local16.aFloat76;
			Static628.aFloat188 = local25.aFloat81 * local16.aFloat82 + local25.aFloat86 * local16.aFloat86 + local25.aFloat85 * local16.aFloat83;
			Static366.aFloat138 = local25.aFloat76 * local16.aFloat83 + local25.aFloat87 * local16.aFloat82 + local25.aFloat83 * local16.aFloat86;
			Static458.aFloat160 = local16.aFloat81 * local25.aFloat86 + local25.aFloat81 * local16.aFloat78 + local25.aFloat85 * local16.aFloat87;
			Static644.aFloat192 = local16.aFloat78 * local25.aFloat87 + local25.aFloat83 * local16.aFloat81 + local25.aFloat76 * local16.aFloat87;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(501) int local501 = this.aShort66 + this.aShort67 >> 1;
			@Pc(509) int local509 = this.aShort74 + this.aShort73 >> 1;
			@Pc(528) int local528 = (int) (Static103.aFloat71 + Static628.aFloat188 * (float) local501 + Static501.aFloat164 * (float) this.aShort69 + (float) local509 * Static366.aFloat138);
			@Pc(547) int local547 = (int) (Static644.aFloat192 * (float) local509 + Static641.aFloat191 + Static458.aFloat160 * (float) local501 + Static84.aFloat68 * (float) this.aShort69);
			@Pc(566) int local566 = (int) (Static381.aFloat140 * (float) local509 + (float) this.aShort69 * Static317.aFloat128 + Static46.aFloat58 + Static634.aFloat190 * (float) local501);
			if (local566 >= this.lb.anInt386) {
				arg1.anInt6273 = local547 * this.lb.anInt376 / local566 + this.lb.anInt382;
				arg1.anInt6271 = this.lb.anInt394 * local528 / local566 + this.lb.anInt401;
			} else {
				local490 = true;
			}
			@Pc(620) int local620 = (int) ((float) local509 * Static366.aFloat138 + Static501.aFloat164 * (float) this.aShort72 + Static628.aFloat188 * (float) local501 + Static103.aFloat71);
			@Pc(639) int local639 = (int) (Static84.aFloat68 * (float) this.aShort72 + (float) local501 * Static458.aFloat160 + Static641.aFloat191 + (float) local509 * Static644.aFloat192);
			@Pc(658) int local658 = (int) (Static46.aFloat58 + Static634.aFloat190 * (float) local501 + Static317.aFloat128 * (float) this.aShort72 + (float) local509 * Static381.aFloat140);
			if (local658 >= this.lb.anInt386) {
				arg1.anInt6270 = this.lb.anInt401 + this.lb.anInt394 * local620 / local658;
				arg1.anInt6272 = this.lb.anInt382 + local639 * this.lb.anInt376 / local658;
			} else {
				local490 = true;
			}
			if (local490) {
				if (local566 < this.lb.anInt386 && this.lb.anInt386 > local658) {
					local492 = false;
				} else {
					@Pc(741) int local741;
					@Pc(751) int local751;
					@Pc(763) int local763;
					if (this.lb.anInt386 > local566) {
						local741 = (local658 - this.lb.anInt386 << 16) / (local658 - local566);
						local751 = local620 + ((local620 - local528) * local741 >> 16);
						local763 = (local741 * (local639 - local547) >> 16) + local639;
						arg1.anInt6271 = this.lb.anInt401 + local751 * this.lb.anInt394 / this.lb.anInt386;
						arg1.anInt6273 = local763 * this.lb.anInt376 / this.lb.anInt386 + this.lb.anInt382;
					} else if (this.lb.anInt386 > local658) {
						local741 = (local566 - this.lb.anInt386 << 16) / (local566 - local658);
						local751 = local528 + ((local528 - local620) * local741 >> 16);
						local763 = local547 + ((local547 - local639) * local741 >> 16);
						arg1.anInt6271 = this.lb.anInt394 * local751 / this.lb.anInt386 + this.lb.anInt401;
						arg1.anInt6273 = this.lb.anInt376 * local763 / this.lb.anInt386 + this.lb.anInt382;
					}
				}
			}
			if (local492) {
				if (local658 < local566) {
					arg1.anInt6269 = this.lb.anInt401 + (local528 + this.aShort71) * this.lb.anInt394 / local566 - arg1.anInt6271;
				} else {
					arg1.anInt6269 = this.lb.anInt394 * (local620 + this.aShort71) / local658 + this.lb.anInt401 - arg1.anInt6270;
				}
				arg1.aBoolean490 = true;
			}
		}
		this.lb.method350();
		this.lb.method372(local25);
		this.method5438();
		this.lb.method391();
		this.method5443();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBSIB)I")
	private int method5441(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = Static376.anIntArray336[Static633.method8695(arg0, arg3)];
		if (arg2 != -1) {
			@Pc(30) Class254 local30 = this.lb.anInterface7_10.method6931(arg2 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte98 & 0xFF;
			@Pc(54) int local54;
			@Pc(76) int local76;
			if (local35 != 0) {
				if (arg3 < 0) {
					local54 = 0;
				} else if (arg3 <= 127) {
					local54 = arg3 * 131586;
				} else {
					local54 = 16777215;
				}
				if (local35 == 256) {
					local17 = local54;
				} else {
					local76 = 256 - local35;
					local17 = (local35 * (local54 & 0xFF00) + (local17 & 0xFF00) * local76 & 0xFF0000) + ((local17 & 0xFF00FF) * local76 + local35 * (local54 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local54 = local30.aByte97 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(125) int local125 = (local17 >> 16 & 0xFF) * local54;
				if (local125 > 65535) {
					local125 = 65535;
				}
				local76 = (local17 >> 8 & 0xFF) * local54;
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(151) int local151 = local54 * (local17 & 0xFF);
				if (local151 > 65535) {
					local151 = 65535;
				}
				local17 = (local151 >> 8) + (local125 << 8 & 0xFF0092) + (local76 & 0xFF00);
			}
		}
		return (local17 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!ln", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6464; local3++) {
			if (arg0 == this.aShortArray91[local3]) {
				this.aShortArray91[local3] = arg1;
			}
		}
		if (this.aClass263Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6478; local34++) {
				@Pc(41) Class263 local41 = this.aClass263Array1[local34];
				@Pc(46) Class235 local46 = this.aClass235Array1[local34];
				local46.anInt7327 = Static376.anIntArray336[this.aShortArray91[local41.anInt7960] & 0xFFFF] & 0xFFFFFF | local46.anInt7327 & 0xFF000000;
			}
		}
		if (this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!en;I)V")
	private void method5442(@OriginalArg(0) Class6_Sub5_Sub10_Sub1 arg0) {
		if (this.lb.anIntArray9.length < this.anInt6454) {
			this.lb.anIntArray9 = new int[this.anInt6454];
			this.lb.anIntArray8 = new int[this.anInt6454];
		}
		@Pc(28) int[] local28 = this.lb.anIntArray9;
		@Pc(32) int[] local32 = this.lb.anIntArray8;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt6493; local34++) {
			local60 = (this.anIntArray305[local34] - (this.lb.anInt384 * this.anIntArray303[local34] >> 8) >> this.lb.anInt360) - arg0.anInt3265;
			@Pc(85) int local85 = (this.anIntArray300[local34] - (this.lb.anInt375 * this.anIntArray303[local34] >> 8) >> this.lb.anInt360) - arg0.anInt3260;
			@Pc(90) int local90 = this.anIntArray302[local34];
			@Pc(97) int local97 = this.anIntArray302[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray99[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local60;
				local32[local108] = local85;
			}
		}
		for (local60 = 0; local60 < this.anInt6514; local60++) {
			if (this.aByteArray47 == null || this.aByteArray47[local60] <= 128) {
				@Pc(151) short local151 = this.aShortArray100[local60];
				@Pc(156) short local156 = this.aShortArray93[local60];
				@Pc(161) short local161 = this.aShortArray97[local60];
				local99 = local28[local151];
				local108 = local28[local156];
				@Pc(173) int local173 = local28[local161];
				@Pc(177) int local177 = local32[local151];
				@Pc(181) int local181 = local32[local156];
				@Pc(185) int local185 = local32[local161];
				if (-((local181 - local177) * (local173 - local108)) + (local99 - local108) * (local181 - local185) > 0) {
					arg0.method2727(local177, local108, local99, local185, local181, local173);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean506;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	private void method5443() {
		if (this.aClass263Array1 == null) {
			return;
		}
		@Pc(18) Class115_Sub1 local18 = this.lb.aClass115_Sub1_2;
		this.lb.method330();
		this.lb.C(!this.aBoolean507);
		this.lb.method340(false);
		this.lb.method357((Class121) null, (Class121) null, this.lb.aClass121_2, this.lb.aClass121_1);
		for (@Pc(50) int local50 = 0; local50 < this.anInt6478; local50++) {
			@Pc(57) Class263 local57 = this.aClass263Array1[local50];
			@Pc(62) Class235 local62 = this.aClass235Array1[local50];
			if (!local57.aBoolean634 || !this.lb.method6131()) {
				@Pc(91) float local91 = (float) (this.anIntArray305[local57.anInt7958] + this.anIntArray305[local57.anInt7963] + this.anIntArray305[local57.anInt7961]) * 0.3333333F;
				@Pc(113) float local113 = (float) (this.anIntArray303[local57.anInt7958] + this.anIntArray303[local57.anInt7963] + this.anIntArray303[local57.anInt7961]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray300[local57.anInt7963] + this.anIntArray300[local57.anInt7958] + this.anIntArray300[local57.anInt7961]) * 0.3333333F;
				@Pc(148) float local148 = Static103.aFloat71 + local134 * Static366.aFloat138 + Static628.aFloat188 * local91 + Static501.aFloat164 * local113;
				@Pc(162) float local162 = local134 * Static644.aFloat192 + Static84.aFloat68 * local113 + Static458.aFloat160 * local91 + Static641.aFloat191;
				@Pc(176) float local176 = Static381.aFloat140 * local134 + Static317.aFloat128 * local113 + local91 * Static634.aFloat190 + Static46.aFloat58;
				@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local162 * local162 + local176 * local176))) * (float) local57.anInt7957;
				local18.method3374((float) local62.anInt7328 + local197 * local162 - local162, local62.anInt7329 * local57.aShort93 >> 7, local62.anInt7325, local176 * local197 - local176, local62.anInt7323 * local57.aShort95 >> 7, local148 + (float) local62.anInt7324 - local148 * local197);
				this.lb.method398(local18);
				@Pc(249) int local249 = local62.anInt7327;
				OpenGL.glColor4ub((byte) (local249 >> 16), (byte) (local249 >> 8), (byte) local249, (byte) (local249 >> 24));
				this.lb.method323(local57.aShort94);
				this.lb.method359(local57.aByte101);
				this.lb.method399(4);
			}
		}
		this.lb.C(true);
		this.lb.method391();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	private void method5444(@OriginalArg(0) boolean arg0) {
		if (this.anInt6514 * 6 > this.lb.aClass6_Sub8_Sub2_1.aByteArray102.length) {
			this.lb.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(this.anInt6514 * 6 + 600);
		} else {
			this.lb.aClass6_Sub8_Sub2_1.anInt10061 = 0;
		}
		@Pc(42) Class6_Sub8_Sub2 local42 = this.lb.aClass6_Sub8_Sub2_1;
		@Pc(48) int local48;
		if (this.lb.aBoolean24) {
			for (local48 = 0; local48 < this.anInt6514; local48++) {
				local42.method8241(this.aShortArray100[local48]);
				local42.method8241(this.aShortArray93[local48]);
				local42.method8241(this.aShortArray97[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt6514; local48++) {
				local42.method8264(this.aShortArray100[local48]);
				local42.method8264(this.aShortArray93[local48]);
				local42.method8264(this.aShortArray97[local48]);
			}
		}
		if (local42.anInt10061 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface9_3 == null) {
				this.anInterface9_3 = this.lb.method327(local42.aByteArray102, true, local42.anInt10061);
			} else {
				this.anInterface9_3.method7036(local42.aByteArray102, local42.anInt10061);
			}
			this.aClass329_1.anInterface9_5 = this.anInterface9_3;
		} else {
			this.aClass329_1.anInterface9_5 = this.lb.method327(local42.aByteArray102, false, local42.anInt10061);
		}
		if (!arg0) {
			this.aBoolean508 = true;
		}
	}

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean505) {
			this.method5436();
		}
		@Pc(16) int local16 = arg4 + this.aShort66;
		@Pc(22) int local22 = arg4 + this.aShort67;
		@Pc(27) int local27 = this.aShort74 + arg6;
		@Pc(32) int local32 = this.aShort73 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local22 + arg2.anInt9291 >> arg2.anInt9286 >= arg2.anInt9289 || local27 < 0 || local32 + arg2.anInt9291 >> arg2.anInt9286 >= arg2.anInt9290)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9289 <= local22 + arg3.anInt9291 >> arg3.anInt9286 || local27 < 0 || arg3.anInt9290 <= arg3.anInt9291 + local32 >> arg3.anInt9286) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9286;
			local22 = arg2.anInt9291 + local22 - 1 >> arg2.anInt9286;
			local27 >>= arg2.anInt9286;
			local32 = local32 + arg2.anInt9291 - 1 >> arg2.anInt9286;
			if (arg5 == arg2.method7583(local27, local16) && arg5 == arg2.method7583(local27, local22) && arg2.method7583(local32, local16) == arg5 && arg5 == arg2.method7583(local32, local22)) {
				return;
			}
		}
		@Pc(295) int local295;
		if (arg0 == 1) {
			for (local295 = 0; local295 < this.anInt6493; local295++) {
				this.anIntArray303[local295] = this.anIntArray303[local295] + arg2.method7580(arg4 + this.anIntArray305[local295], this.anIntArray300[local295] + arg6) - arg5;
			}
		} else {
			@Pc(221) int local221;
			@Pc(232) int local232;
			if (arg0 == 2) {
				@Pc(213) short local213 = this.aShort69;
				if (local213 == 0) {
					return;
				}
				for (local221 = 0; local221 < this.anInt6493; local221++) {
					local232 = (this.anIntArray303[local221] << 16) / local213;
					if (arg1 > local232) {
						this.anIntArray303[local221] -= -((arg1 - local232) * (arg2.method7580(this.anIntArray305[local221] + arg4, arg6 + this.anIntArray300[local221]) - arg5) / arg1);
					}
				}
			} else {
				@Pc(364) int local364;
				if (arg0 == 3) {
					local295 = (arg1 & 0xFF) * 4;
					local221 = (arg1 >> 8 & 0xFF) * 4;
					local232 = (arg1 >> 16 & 0xFF) << 6;
					local364 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local295 >> 1) < 0 || arg2.anInt9289 << arg2.anInt9286 <= arg2.anInt9291 + (local295 >> 1) + arg4 || arg6 - (local221 >> 1) < 0 || (local221 >> 1) + arg6 + arg2.anInt9291 >= arg2.anInt9290 << arg2.anInt9286) {
						return;
					}
					this.method7064(local221, local295, arg2, arg5, arg4, arg6, local232, local364);
				} else if (arg0 == 4) {
					local295 = this.aShort72 - this.aShort69;
					for (local221 = 0; local221 < this.anInt6493; local221++) {
						this.anIntArray303[local221] = local295 + this.anIntArray303[local221] + arg3.method7580(this.anIntArray305[local221] + arg4, this.anIntArray300[local221] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local295 = this.aShort72 - this.aShort69;
					for (local221 = 0; local221 < this.anInt6493; local221++) {
						local232 = arg4 + this.anIntArray305[local221];
						local364 = this.anIntArray300[local221] + arg6;
						@Pc(370) int local370 = arg2.method7580(local232, local364);
						@Pc(376) int local376 = arg3.method7580(local232, local364);
						@Pc(384) int local384 = local370 - arg1 - local376;
						this.anIntArray303[local221] = local370 + ((this.anIntArray303[local221] << 8) / local295 * local384 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean505 = false;
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIILclient!hba;ZIZ)Z")
	private boolean method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class115_Sub1 local8 = (Class115_Sub1) arg3;
		@Pc(12) Class115_Sub1 local12 = this.lb.aClass115_Sub1_3;
		@Pc(33) float local33 = local12.aFloat83 * local8.aFloat80 + local12.aFloat86 * local8.aFloat77 + local8.aFloat84 * local12.aFloat82 + local12.aFloat77;
		@Pc(54) float local54 = local12.aFloat84 + local12.aFloat87 * local8.aFloat80 + local12.aFloat78 * local8.aFloat84 + local12.aFloat81 * local8.aFloat77;
		Static381.aFloat140 = local8.aFloat87 * local12.aFloat79 + local12.aFloat85 * local8.aFloat83 + local8.aFloat76 * local12.aFloat76;
		Static634.aFloat190 = local8.aFloat85 * local12.aFloat76 + local8.aFloat81 * local12.aFloat79 + local12.aFloat85 * local8.aFloat86;
		Static366.aFloat138 = local8.aFloat83 * local12.aFloat86 + local8.aFloat87 * local12.aFloat82 + local8.aFloat76 * local12.aFloat83;
		Static458.aFloat160 = local12.aFloat81 * local8.aFloat86 + local12.aFloat78 * local8.aFloat81 + local12.aFloat87 * local8.aFloat85;
		@Pc(147) float local147 = local12.aFloat85 * local8.aFloat77 + local8.aFloat84 * local12.aFloat79 + local12.aFloat76 * local8.aFloat80 + local12.aFloat80;
		Static84.aFloat68 = local8.aFloat79 * local12.aFloat87 + local8.aFloat82 * local12.aFloat81 + local12.aFloat78 * local8.aFloat78;
		Static501.aFloat164 = local8.aFloat79 * local12.aFloat83 + local12.aFloat86 * local8.aFloat82 + local8.aFloat78 * local12.aFloat82;
		Static628.aFloat188 = local8.aFloat85 * local12.aFloat83 + local12.aFloat86 * local8.aFloat86 + local8.aFloat81 * local12.aFloat82;
		Static317.aFloat128 = local12.aFloat76 * local8.aFloat79 + local12.aFloat79 * local8.aFloat78 + local8.aFloat82 * local12.aFloat85;
		Static644.aFloat192 = local8.aFloat76 * local12.aFloat87 + local12.aFloat78 * local8.aFloat87 + local12.aFloat81 * local8.aFloat83;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.lb.anInt394;
		@Pc(255) int local255 = this.lb.anInt376;
		if (!this.aBoolean505) {
			this.method5436();
		}
		@Pc(270) int local270 = this.aShort67 - this.aShort66 >> 1;
		@Pc(278) int local278 = this.aShort72 - this.aShort69 >> 1;
		@Pc(287) int local287 = this.aShort73 - this.aShort74 >> 1;
		@Pc(293) int local293 = this.aShort66 + local270;
		@Pc(298) int local298 = this.aShort69 + local278;
		@Pc(304) int local304 = this.aShort74 + local287;
		@Pc(311) int local311 = local293 - (local270 << arg0);
		@Pc(318) int local318 = local298 - (local278 << arg0);
		@Pc(324) int local324 = local304 - (local287 << arg0);
		@Pc(331) int local331 = local293 + (local270 << arg0);
		@Pc(337) int local337 = (local278 << arg0) + local298;
		@Pc(343) int local343 = local304 + (local287 << arg0);
		Static581.anIntArray524[0] = local311;
		Static57.anIntArray51[0] = local318;
		Static529.anIntArray330[0] = local324;
		Static581.anIntArray524[1] = local331;
		Static57.anIntArray51[1] = local318;
		Static529.anIntArray330[1] = local324;
		Static581.anIntArray524[2] = local311;
		Static57.anIntArray51[2] = local337;
		Static529.anIntArray330[2] = local324;
		Static581.anIntArray524[3] = local331;
		Static57.anIntArray51[3] = local337;
		Static529.anIntArray330[3] = local324;
		Static581.anIntArray524[4] = local311;
		Static57.anIntArray51[4] = local318;
		Static581.anIntArray524[5] = local331;
		Static529.anIntArray330[4] = local343;
		Static57.anIntArray51[5] = local318;
		Static529.anIntArray330[5] = local343;
		Static581.anIntArray524[6] = local311;
		Static57.anIntArray51[6] = local337;
		Static581.anIntArray524[7] = local331;
		Static529.anIntArray330[6] = local343;
		Static57.anIntArray51[7] = local337;
		Static529.anIntArray330[7] = local343;
		@Pc(500) float local500;
		@Pc(486) float local486;
		@Pc(472) float local472;
		@Pc(458) float local458;
		@Pc(453) float local453;
		@Pc(448) float local448;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local448 = (float) Static529.anIntArray330[local441];
			local453 = (float) Static57.anIntArray51[local441];
			local458 = (float) Static581.anIntArray524[local441];
			local472 = local147 + local453 * Static317.aFloat128 + Static634.aFloat190 * local458 + Static381.aFloat140 * local448;
			local486 = local54 + Static644.aFloat192 * local448 + Static458.aFloat160 * local458 + Static84.aFloat68 * local453;
			local500 = Static628.aFloat188 * local458 + Static501.aFloat164 * local453 + Static366.aFloat138 * local448 + local33;
			if ((float) this.lb.anInt386 <= local472) {
				if (arg4 > 0) {
					local472 = (float) arg4;
				}
				@Pc(524) float local524 = (float) this.lb.anInt401 + local500 * (float) local251 / local472;
				if (local243 < local524) {
					local243 = local524;
				}
				@Pc(542) float local542 = (float) local255 * local486 / local472 + (float) this.lb.anInt382;
				if (local241 > local524) {
					local241 = local524;
				}
				if (local542 < local245) {
					local245 = local542;
				}
				if (local247 < local542) {
					local247 = local542;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg2 > local241 && (float) arg2 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg5) {
				return true;
			}
			if (this.anInt6454 > this.lb.anIntArray9.length) {
				this.lb.anIntArray9 = new int[this.anInt6454];
				this.lb.anIntArray8 = new int[this.anInt6454];
			}
			@Pc(621) int[] local621 = this.lb.anIntArray9;
			@Pc(625) int[] local625 = this.lb.anIntArray8;
			@Pc(701) int local701;
			for (@Pc(627) int local627 = 0; local627 < this.anInt6493; local627++) {
				local453 = (float) this.anIntArray303[local627];
				local458 = (float) this.anIntArray305[local627];
				local448 = (float) this.anIntArray300[local627];
				local500 = Static501.aFloat164 * local453 + local458 * Static628.aFloat188 + Static366.aFloat138 * local448 + local33;
				local486 = Static644.aFloat192 * local448 + Static458.aFloat160 * local458 + Static84.aFloat68 * local453 + local54;
				local472 = local458 * Static634.aFloat190 + Static317.aFloat128 * local453 + Static381.aFloat140 * local448 + local147;
				@Pc(708) int local708;
				@Pc(710) int local710;
				@Pc(719) int local719;
				if (local472 >= (float) this.lb.anInt386) {
					if (arg4 > 0) {
						local472 = (float) arg4;
					}
					local701 = (int) ((float) local251 * local500 / local472 + (float) this.lb.anInt401);
					local708 = (int) (local486 * (float) local255 / local472 + (float) this.lb.anInt382);
					local710 = this.anIntArray302[local627];
					local719 = this.anIntArray302[local627 + 1];
					for (@Pc(786) int local786 = local710; local786 < local719; local786++) {
						@Pc(795) int local795 = this.aShortArray99[local786] - 1;
						if (local795 == -1) {
							break;
						}
						local621[local795] = local701;
						local625[local795] = local708;
					}
				} else {
					local701 = this.anIntArray302[local627];
					local708 = this.anIntArray302[local627 + 1];
					for (local710 = local701; local710 < local708; local710++) {
						local719 = this.aShortArray99[local710] - 1;
						if (local719 == -1) {
							break;
						}
						local621[this.aShortArray99[local710] - 1] = -999999;
					}
				}
			}
			for (local701 = 0; local701 < this.anInt6464; local701++) {
				if (local621[this.aShortArray100[local701]] != -999999 && local621[this.aShortArray93[local701]] != -999999 && local621[this.aShortArray97[local701]] != -999999 && this.method5433(local625[this.aShortArray97[local701]], local625[this.aShortArray93[local701]], arg1, local621[this.aShortArray97[local701]], local621[this.aShortArray93[local701]], local621[this.aShortArray100[local701]], local625[this.aShortArray100[local701]], arg2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class78_Sub2_Sub2.anIntArray270[arg0];
		@Pc(13) int local13 = Class78_Sub2_Sub2.anIntArray271[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6493; local15++) {
			@Pc(34) int local34 = this.anIntArray303[local15] * local13 - this.anIntArray300[local15] * local9 >> 14;
			this.anIntArray300[local15] = this.anIntArray300[local15] * local13 + this.anIntArray303[local15] * local9 >> 14;
			this.anIntArray303[local15] = local34;
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6464; local3++) {
			local12 = this.aShortArray91[local3] & 0xFFFF;
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
			this.aShortArray91[local3] = (short) (local18 << 10 | local24 << 7 | local42);
		}
		if (this.aClass263Array1 != null) {
			for (local12 = 0; local12 < this.anInt6478; local12++) {
				@Pc(111) Class263 local111 = this.aClass263Array1[local12];
				@Pc(116) Class235 local116 = this.aClass235Array1[local12];
				local116.anInt7327 = local116.anInt7327 & 0xFF000000 | Static376.anIntArray336[this.aShortArray91[local111.anInt7960] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort68;
	}

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6493; local7++) {
			if (arg0 != 0) {
				this.anIntArray305[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray303[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray300[local7] += arg2;
			}
		}
		this.aBoolean505 = false;
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean507;
	}

	@OriginalMember(owner = "client!ln", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hba;Lclient!lda;II)V")
	@Override
	public void method7057(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6454 == 0) {
			return;
		}
		@Pc(13) Class115_Sub1 local13 = this.lb.aClass115_Sub1_3;
		@Pc(16) Class115_Sub1 local16 = (Class115_Sub1) arg0;
		if (!this.aBoolean505) {
			this.method5436();
		}
		Static46.aFloat58 = local16.aFloat80 * local13.aFloat76 + local13.aFloat85 * local16.aFloat77 + local13.aFloat79 * local16.aFloat84 + local13.aFloat80;
		Static317.aFloat128 = local16.aFloat82 * local13.aFloat85 + local13.aFloat79 * local16.aFloat78 + local13.aFloat76 * local16.aFloat79;
		@Pc(69) float local69 = Static46.aFloat58 + Static317.aFloat128 * (float) this.aShort69;
		@Pc(77) float local77 = Static317.aFloat128 * (float) this.aShort72 + Static46.aFloat58;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.aShort71;
			local93 = (float) this.aShort71 + local69;
		} else {
			local93 = (float) this.aShort71 + local77;
			local87 = (float) -this.aShort71 + local69;
		}
		if (this.lb.aFloat6 <= local87 || (float) this.lb.anInt386 >= local93) {
			return;
		}
		Static103.aFloat71 = local13.aFloat77 + local13.aFloat86 * local16.aFloat77 + local13.aFloat82 * local16.aFloat84 + local13.aFloat83 * local16.aFloat80;
		Static501.aFloat164 = local13.aFloat86 * local16.aFloat82 + local16.aFloat78 * local13.aFloat82 + local16.aFloat79 * local13.aFloat83;
		@Pc(170) float local170 = (float) this.aShort69 * Static501.aFloat164 + Static103.aFloat71;
		@Pc(178) float local178 = (float) this.aShort72 * Static501.aFloat164 + Static103.aFloat71;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (local170 + (float) this.aShort71) * (float) this.lb.anInt394;
			local204 = (local178 - (float) this.aShort71) * (float) this.lb.anInt394;
		} else {
			local193 = (local178 + (float) this.aShort71) * (float) this.lb.anInt394;
			local204 = (local170 - (float) this.aShort71) * (float) this.lb.anInt394;
		}
		if (this.lb.aFloat3 <= local204 / (float) arg2 || this.lb.aFloat15 >= local193 / (float) arg2) {
			return;
		}
		Static84.aFloat68 = local16.aFloat79 * local13.aFloat87 + local16.aFloat78 * local13.aFloat78 + local13.aFloat81 * local16.aFloat82;
		Static641.aFloat191 = local13.aFloat84 + local16.aFloat80 * local13.aFloat87 + local13.aFloat78 * local16.aFloat84 + local16.aFloat77 * local13.aFloat81;
		@Pc(295) float local295 = Static641.aFloat191 + (float) this.aShort69 * Static84.aFloat68;
		@Pc(303) float local303 = Static641.aFloat191 + Static84.aFloat68 * (float) this.aShort72;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local329 = (float) this.lb.anInt376 * (local303 - (float) this.aShort71);
			local318 = ((float) this.aShort71 + local295) * (float) this.lb.anInt376;
		} else {
			local318 = (local303 + (float) this.aShort71) * (float) this.lb.anInt376;
			local329 = (float) this.lb.anInt376 * (local295 - (float) this.aShort71);
		}
		if (local329 / (float) arg2 >= this.lb.aFloat19 || local318 / (float) arg2 <= this.lb.aFloat2) {
			return;
		}
		if (arg1 != null || this.aClass263Array1 != null) {
			Static366.aFloat138 = local13.aFloat86 * local16.aFloat83 + local13.aFloat82 * local16.aFloat87 + local16.aFloat76 * local13.aFloat83;
			Static458.aFloat160 = local16.aFloat86 * local13.aFloat81 + local16.aFloat81 * local13.aFloat78 + local13.aFloat87 * local16.aFloat85;
			Static381.aFloat140 = local16.aFloat87 * local13.aFloat79 + local16.aFloat83 * local13.aFloat85 + local16.aFloat76 * local13.aFloat76;
			Static634.aFloat190 = local13.aFloat76 * local16.aFloat85 + local16.aFloat86 * local13.aFloat85 + local13.aFloat79 * local16.aFloat81;
			Static628.aFloat188 = local13.aFloat86 * local16.aFloat86 + local16.aFloat81 * local13.aFloat82 + local16.aFloat85 * local13.aFloat83;
			Static644.aFloat192 = local16.aFloat76 * local13.aFloat87 + local16.aFloat87 * local13.aFloat78 + local13.aFloat81 * local16.aFloat83;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.aShort66 + this.aShort67 >> 1;
			@Pc(506) int local506 = this.aShort74 + this.aShort73 >> 1;
			@Pc(525) int local525 = (int) (Static366.aFloat138 * (float) local506 + Static501.aFloat164 * (float) this.aShort69 + Static628.aFloat188 * (float) local497 + Static103.aFloat71);
			@Pc(544) int local544 = (int) ((float) local506 * Static644.aFloat192 + (float) local497 * Static458.aFloat160 + Static641.aFloat191 + Static84.aFloat68 * (float) this.aShort69);
			@Pc(563) int local563 = (int) (Static381.aFloat140 * (float) local506 + Static46.aFloat58 + (float) local497 * Static634.aFloat190 + Static317.aFloat128 * (float) this.aShort69);
			@Pc(582) int local582 = (int) ((float) local506 * Static366.aFloat138 + Static628.aFloat188 * (float) local497 + Static103.aFloat71 + (float) this.aShort72 * Static501.aFloat164);
			@Pc(601) int local601 = (int) (Static641.aFloat191 + Static458.aFloat160 * (float) local497 + (float) this.aShort72 * Static84.aFloat68 + (float) local506 * Static644.aFloat192);
			@Pc(620) int local620 = (int) (Static317.aFloat128 * (float) this.aShort72 + Static634.aFloat190 * (float) local497 + Static46.aFloat58 + Static381.aFloat140 * (float) local506);
			arg1.anInt6272 = this.lb.anInt376 * local601 / arg2 + this.lb.anInt382;
			arg1.anInt6270 = this.lb.anInt401 + this.lb.anInt394 * local582 / arg2;
			arg1.anInt6273 = this.lb.anInt382 + this.lb.anInt376 * local544 / arg2;
			arg1.anInt6271 = this.lb.anInt401 + local525 * this.lb.anInt394 / arg2;
			if (this.lb.anInt386 <= local563 || local620 >= this.lb.anInt386) {
				arg1.aBoolean490 = true;
				arg1.anInt6269 = this.lb.anInt401 + this.lb.anInt394 * (this.aShort71 + local525) / arg2 - arg1.anInt6271;
			}
		}
		this.lb.method379((float) arg2);
		this.lb.method390();
		this.lb.method372(local16);
		this.method5438();
		this.lb.method391();
		this.method5443();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!hba;ZII)Z")
	@Override
	public boolean method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5445(arg4, arg1, arg0, arg2, arg5, arg3);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "()V")
	@Override
	protected void method7070() {
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "()V")
	@Override
	protected void method7055() {
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()[Lclient!cia;")
	@Override
	public Class49[] method7050() {
		return this.aClass49Array3;
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt6506 = arg0;
		if (this.aClass22_1 != null && (this.anInt6506 & 0x10000) == 0) {
			this.aByteArray46 = this.aClass22_1.aByteArray4;
			this.aShortArray94 = this.aClass22_1.aShortArray17;
			this.aShortArray98 = this.aClass22_1.aShortArray16;
			this.aShortArray92 = this.aClass22_1.aShortArray18;
			this.aClass22_1 = null;
		}
		this.aBoolean508 = true;
		this.method5439();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
	private void method5446(@OriginalArg(1) boolean arg0) {
		@Pc(20) boolean local20 = this.aClass121_4 != null && this.aClass121_4.anInterface19_3 == null;
		@Pc(31) boolean local31 = this.aClass121_5 != null && this.aClass121_5.anInterface19_3 == null;
		@Pc(42) boolean local42 = this.aClass121_7 != null && this.aClass121_7.anInterface19_3 == null;
		@Pc(53) boolean local53 = this.aClass121_6 != null && this.aClass121_6.anInterface19_3 == null;
		if (arg0) {
			local53 &= (this.aByte74 & 0x8) != 0;
			local20 &= (this.aByte74 & 0x2) != 0;
			local31 &= (this.aByte74 & 0x4) != 0;
			local42 &= (this.aByte74 & 0x1) != 0;
		}
		@Pc(107) byte local107 = 0;
		@Pc(111) byte local111 = 0;
		@Pc(113) byte local113 = 0;
		if (local42) {
			local107 = 12;
		}
		@Pc(124) byte local124 = 0;
		if (local20) {
			local111 = local107;
			local107 = (byte) (local107 + 4);
		}
		if (local31) {
			local113 = local107;
			local107 = (byte) (local107 + 12);
		}
		if (local53) {
			local124 = local107;
			local107 = (byte) (local107 + 8);
		}
		if (local107 == 0) {
			return;
		}
		if (this.anInt6454 * local107 > this.lb.aClass6_Sub8_Sub2_1.aByteArray102.length) {
			this.lb.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(local107 * (this.anInt6454 + 100));
		} else {
			this.lb.aClass6_Sub8_Sub2_1.anInt10061 = 0;
		}
		@Pc(194) Class6_Sub8_Sub2 local194 = this.lb.aClass6_Sub8_Sub2_1;
		@Pc(202) int local202;
		@Pc(211) int local211;
		@Pc(239) int local239;
		@Pc(248) int local248;
		if (local42) {
			@Pc(218) int local218;
			@Pc(225) int local225;
			@Pc(230) int local230;
			@Pc(237) int local237;
			if (this.lb.aBoolean24) {
				for (local202 = 0; local202 < this.anInt6493; local202++) {
					local211 = Stream.floatToRawIntBits((float) this.anIntArray305[local202]);
					local218 = Stream.floatToRawIntBits((float) this.anIntArray303[local202]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray300[local202]);
					local230 = this.anIntArray302[local202];
					local237 = this.anIntArray302[local202 + 1];
					for (local239 = local230; local239 < local237; local239++) {
						local248 = this.aShortArray99[local239] - 1;
						if (local248 == -1) {
							break;
						}
						local194.anInt10061 = local248 * local107;
						local194.method8202(local211);
						local194.method8202(local218);
						local194.method8202(local225);
					}
				}
			} else {
				for (local202 = 0; local202 < this.anInt6493; local202++) {
					local211 = Stream.floatToRawIntBits((float) this.anIntArray305[local202]);
					local218 = Stream.floatToRawIntBits((float) this.anIntArray303[local202]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray300[local202]);
					local230 = this.anIntArray302[local202];
					local237 = this.anIntArray302[local202 + 1];
					for (local239 = local230; local239 < local237; local239++) {
						local248 = this.aShortArray99[local239] - 1;
						if (local248 == -1) {
							break;
						}
						local194.anInt10061 = local248 * local107;
						local194.method8235(local211);
						local194.method8235(local218);
						local194.method8235(local225);
					}
				}
			}
		}
		@Pc(553) float local553;
		@Pc(460) short[] local460;
		@Pc(457) short[] local457;
		@Pc(451) short[] local451;
		@Pc(454) byte[] local454;
		@Pc(611) float local611;
		if (local20) {
			if (this.aClass121_5 == null) {
				if (this.aClass22_1 == null) {
					local451 = this.aShortArray92;
					local454 = this.aByteArray46;
					local457 = this.aShortArray94;
					local460 = this.aShortArray98;
				} else {
					local460 = this.aClass22_1.aShortArray16;
					local454 = this.aClass22_1.aByteArray4;
					local451 = this.aClass22_1.aShortArray18;
					local457 = this.aClass22_1.aShortArray17;
				}
				@Pc(484) float local484 = this.lb.aFloatArray3[0];
				@Pc(490) float local490 = this.lb.aFloatArray3[1];
				@Pc(496) float local496 = this.lb.aFloatArray3[2];
				@Pc(500) float local500 = this.lb.aFloat12;
				@Pc(510) float local510 = this.lb.aFloat18 * 768.0F / (float) this.aShort70;
				@Pc(520) float local520 = this.lb.aFloat11 * 768.0F / (float) this.aShort70;
				for (@Pc(522) int local522 = 0; local522 < this.anInt6464; local522++) {
					@Pc(542) int local542 = this.method5441(this.aShortArray91[local522], this.aByteArray47[local522], this.aShortArray96[local522], this.aShort68);
					local553 = (float) (local542 >> 16 & 0xFF) * this.lb.aFloat14;
					@Pc(558) short local558 = this.aShortArray100[local522];
					@Pc(569) float local569 = (float) (local542 >> 8 & 0xFF) * this.lb.aFloat21;
					@Pc(578) float local578 = this.lb.aFloat17 * (float) (local542 >>> 24);
					@Pc(583) short local583 = (short) local454[local558];
					if (local583 == 0) {
						local611 = ((float) local460[local558] * local490 + local484 * (float) local457[local558] + local496 * (float) local451[local558]) * 0.0026041667F;
					} else {
						local611 = ((float) local457[local558] * local484 + local490 * (float) local460[local558] + (float) local451[local558] * local496) / (float) (local583 * 256);
					}
					@Pc(651) float local651 = local500 + (local611 < 0.0F ? local520 : local510) * local611;
					@Pc(656) int local656 = (int) (local578 * local651);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					@Pc(677) int local677 = (int) (local651 * local553);
					@Pc(682) int local682 = (int) (local651 * local569);
					if (local677 < 0) {
						local677 = 0;
					} else if (local677 > 255) {
						local677 = 255;
					}
					local194.anInt10061 = local111 + local107 * local558;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local194.method8211(local656);
					local194.method8211(local677);
					local194.method8211(local682);
					local194.method8211(255 - (this.aByteArray47[local522] & 0xFF));
					local558 = this.aShortArray93[local522];
					local583 = (short) local454[local558];
					if (local583 == 0) {
						local611 = (local490 * (float) local460[local558] + local484 * (float) local457[local558] + (float) local451[local558] * local496) * 0.0026041667F;
					} else {
						local611 = ((float) local451[local558] * local496 + (float) local457[local558] * local484 + local490 * (float) local460[local558]) / (float) (local583 * 256);
					}
					local651 = local500 + (local611 < 0.0F ? local520 : local510) * local611;
					local656 = (int) (local651 * local578);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					local677 = (int) (local651 * local553);
					local682 = (int) (local569 * local651);
					if (local677 < 0) {
						local677 = 0;
					} else if (local677 > 255) {
						local677 = 255;
					}
					local194.anInt10061 = local111 + local107 * local558;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local194.method8211(local656);
					local194.method8211(local677);
					local194.method8211(local682);
					local194.method8211(255 - (this.aByteArray47[local522] & 0xFF));
					local558 = this.aShortArray97[local522];
					local583 = (short) local454[local558];
					if (local583 == 0) {
						local611 = (local496 * (float) local451[local558] + local490 * (float) local460[local558] + (float) local457[local558] * local484) * 0.0026041667F;
					} else {
						local611 = ((float) local451[local558] * local496 + (float) local460[local558] * local490 + local484 * (float) local457[local558]) / (float) (local583 * 256);
					}
					local651 = local500 + local611 * (local611 < 0.0F ? local520 : local510);
					local656 = (int) (local651 * local578);
					local677 = (int) (local553 * local651);
					if (local656 < 0) {
						local656 = 0;
					} else if (local656 > 255) {
						local656 = 255;
					}
					local682 = (int) (local569 * local651);
					if (local677 < 0) {
						local677 = 0;
					} else if (local677 > 255) {
						local677 = 255;
					}
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local194.anInt10061 = local111 + local107 * local558;
					local194.method8211(local656);
					local194.method8211(local677);
					local194.method8211(local682);
					local194.method8211(255 - (this.aByteArray47[local522] & 0xFF));
				}
			} else {
				for (local202 = 0; local202 < this.anInt6464; local202++) {
					local211 = this.method5441(this.aShortArray91[local202], this.aByteArray47[local202], this.aShortArray96[local202], this.aShort68);
					local194.anInt10061 = this.aShortArray100[local202] * local107 + local111;
					local194.method8202(local211);
					local194.anInt10061 = local107 * this.aShortArray93[local202] + local111;
					local194.method8202(local211);
					local194.anInt10061 = this.aShortArray97[local202] * local107 + local111;
					local194.method8202(local211);
				}
			}
		}
		if (local31) {
			if (this.aClass22_1 == null) {
				local454 = this.aByteArray46;
				local457 = this.aShortArray94;
				local460 = this.aShortArray98;
				local451 = this.aShortArray92;
			} else {
				local454 = this.aClass22_1.aByteArray4;
				local451 = this.aClass22_1.aShortArray18;
				local457 = this.aClass22_1.aShortArray17;
				local460 = this.aClass22_1.aShortArray16;
			}
			@Pc(1114) float local1114 = 3.0F / (float) this.aShort70;
			local194.anInt10061 = local113;
			local611 = 3.0F / (float) (this.aShort70 + this.aShort70 / 2);
			if (this.lb.aBoolean24) {
				for (local239 = 0; local239 < this.anInt6454; local239++) {
					local248 = local454[local239] & 0xFF;
					if (local248 == 0) {
						local194.method8270(local611 * (float) local457[local239]);
						local194.method8270((float) local460[local239] * local611);
						local194.method8270((float) local451[local239] * local611);
					} else {
						local553 = local1114 / (float) local248;
						local194.method8270((float) local457[local239] * local553);
						local194.method8270(local553 * (float) local460[local239]);
						local194.method8270((float) local451[local239] * local553);
					}
					local194.anInt10061 += local107 - 12;
				}
			} else {
				for (local239 = 0; local239 < this.anInt6454; local239++) {
					local248 = local454[local239] & 0xFF;
					if (local248 == 0) {
						local194.method8271((float) local457[local239] * local611);
						local194.method8271((float) local460[local239] * local611);
						local194.method8271((float) local451[local239] * local611);
					} else {
						local553 = local1114 / (float) local248;
						local194.method8271(local553 * (float) local457[local239]);
						local194.method8271((float) local460[local239] * local553);
						local194.method8271((float) local451[local239] * local553);
					}
					local194.anInt10061 += local107 - 12;
				}
			}
		}
		if (local53) {
			local194.anInt10061 = local124;
			if (this.lb.aBoolean24) {
				for (local202 = 0; local202 < this.anInt6454; local202++) {
					local194.method8270(this.aFloatArray61[local202]);
					local194.method8270(this.aFloatArray60[local202]);
					local194.anInt10061 += local107 - 8;
				}
			} else {
				for (local202 = 0; local202 < this.anInt6454; local202++) {
					local194.method8271(this.aFloatArray61[local202]);
					local194.method8271(this.aFloatArray60[local202]);
					local194.anInt10061 += local107 - 8;
				}
			}
		}
		local194.anInt10061 = local107 * this.anInt6454;
		@Pc(1404) Interface19 local1404;
		if (arg0) {
			if (this.anInterface19_4 == null) {
				this.anInterface19_4 = this.lb.method367(local194.anInt10061, true, local107, local194.aByteArray102);
			} else {
				this.anInterface19_4.method7395(local194.anInt10061, local194.aByteArray102, local107);
			}
			local1404 = this.anInterface19_4;
			this.aByte74 = 0;
		} else {
			local1404 = this.lb.method367(local194.anInt10061, false, local107, local194.aByteArray102);
			this.aBoolean508 = true;
		}
		if (local42) {
			this.aClass121_7.aByte34 = 0;
			this.aClass121_7.anInterface19_3 = local1404;
		}
		if (local53) {
			this.aClass121_6.aByte34 = local124;
			this.aClass121_6.anInterface19_3 = local1404;
		}
		if (local20) {
			this.aClass121_4.aByte34 = local111;
			this.aClass121_4.anInterface19_3 = local1404;
		}
		if (local31) {
			this.aClass121_5.anInterface19_3 = local1404;
			this.aClass121_5.aByte34 = local113;
		}
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
	@Override
	public void method7054() {
		if (this.anInt6454 <= 0 || this.anInt6514 <= 0) {
			return;
		}
		this.method5446(false);
		if ((this.aByte74 & 0x10) == 0 && this.aClass329_1.anInterface9_5 == null) {
			this.method5444(false);
		}
		this.method5439();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class92 method7069(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class92_Sub2 local21;
		@Pc(17) Class92_Sub2 local17;
		if (arg0 == 1) {
			local21 = this.lb.aClass92_Sub2_7;
			local17 = this.lb.aClass92_Sub2_3;
		} else if (arg0 == 2) {
			local17 = this.lb.aClass92_Sub2_9;
			local21 = this.lb.aClass92_Sub2_6;
		} else if (arg0 == 3) {
			local21 = this.lb.aClass92_Sub2_10;
			local17 = this.lb.aClass92_Sub2_2;
		} else if (arg0 == 4) {
			local21 = this.lb.aClass92_Sub2_8;
			local17 = this.lb.aClass92_Sub2_1;
		} else if (arg0 == 5) {
			local17 = this.lb.aClass92_Sub2_4;
			local21 = this.lb.aClass92_Sub2_5;
		} else {
			local21 = local17 = new Class92_Sub2(this.lb);
		}
		return this.method5435(arg2, arg0 != 0, arg1, local21, local17);
	}

	@OriginalMember(owner = "client!ln", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6505; local7++) {
			this.anIntArray305[local7] = this.anIntArray305[local7] + 7 >> 4;
			this.anIntArray303[local7] = this.anIntArray303[local7] + 7 >> 4;
			this.anIntArray300[local7] = this.anIntArray300[local7] + 7 >> 4;
		}
		this.aBoolean505 = false;
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7060(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class92_Sub2 local8 = (Class92_Sub2) arg0;
		if (this.anInt6464 == 0 || local8.anInt6464 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6493;
		@Pc(27) int[] local27 = local8.anIntArray305;
		@Pc(30) int[] local30 = local8.anIntArray303;
		@Pc(33) int[] local33 = local8.anIntArray300;
		@Pc(36) short[] local36 = local8.aShortArray94;
		@Pc(39) short[] local39 = local8.aShortArray98;
		@Pc(42) short[] local42 = local8.aShortArray92;
		@Pc(45) byte[] local45 = local8.aByteArray46;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(64) short[] local64;
		@Pc(60) byte[] local60;
		if (this.aClass22_1 == null) {
			local56 = null;
			local52 = null;
			local64 = null;
			local60 = null;
		} else {
			local52 = this.aClass22_1.aShortArray16;
			local56 = this.aClass22_1.aShortArray17;
			local60 = this.aClass22_1.aByteArray4;
			local64 = this.aClass22_1.aShortArray18;
		}
		@Pc(79) short[] local79;
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(83) byte[] local83;
		if (local8.aClass22_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass22_1.aByteArray4;
			local85 = local8.aClass22_1.aShortArray16;
			local81 = local8.aClass22_1.aShortArray18;
			local79 = local8.aClass22_1.aShortArray17;
		}
		@Pc(106) int[] local106 = local8.anIntArray302;
		@Pc(109) short[] local109 = local8.aShortArray99;
		if (!local8.aBoolean505) {
			local8.method5436();
		}
		@Pc(118) short local118 = local8.aShort69;
		@Pc(121) short local121 = local8.aShort72;
		@Pc(124) short local124 = local8.aShort66;
		@Pc(127) short local127 = local8.aShort67;
		@Pc(130) short local130 = local8.aShort74;
		@Pc(133) short local133 = local8.aShort73;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6493; local135++) {
			@Pc(144) int local144 = this.anIntArray303[local135] - arg2;
			if (local144 >= local118 && local121 >= local144) {
				@Pc(164) int local164 = this.anIntArray305[local135] - arg1;
				if (local124 <= local164 && local164 <= local127) {
					@Pc(180) int local180 = this.anIntArray300[local135] - arg3;
					if (local130 <= local180 && local180 <= local133) {
						@Pc(190) int local190 = -1;
						@Pc(195) int local195 = this.anIntArray302[local135];
						@Pc(202) int local202 = this.anIntArray302[local135 + 1];
						for (@Pc(204) int local204 = local195; local204 < local202; local204++) {
							local190 = this.aShortArray99[local204] - 1;
							if (local190 == -1 || this.aByteArray46[local190] != 0) {
								break;
							}
						}
						if (local190 != -1) {
							for (@Pc(236) int local236 = 0; local236 < local24; local236++) {
								if (local164 == local27[local236] && local180 == local33[local236] && local30[local236] == local144) {
									local195 = local106[local236];
									@Pc(259) int local259 = -1;
									local202 = local106[local236 + 1];
									for (@Pc(267) int local267 = local195; local267 < local202; local267++) {
										local259 = local109[local267] - 1;
										if (local259 == -1 || local45[local259] != 0) {
											break;
										}
									}
									if (local259 != -1) {
										if (local56 == null) {
											this.aClass22_1 = new Class22();
											local56 = this.aClass22_1.aShortArray17 = Static273.method4871(this.aShortArray94);
											local52 = this.aClass22_1.aShortArray16 = Static273.method4871(this.aShortArray98);
											local64 = this.aClass22_1.aShortArray18 = Static273.method4871(this.aShortArray92);
											local60 = this.aClass22_1.aByteArray4 = Static395.method6252(this.aByteArray46);
										}
										if (local79 == null) {
											@Pc(344) Class22 local344 = local8.aClass22_1 = new Class22();
											local79 = local344.aShortArray17 = Static273.method4871(local36);
											local85 = local344.aShortArray16 = Static273.method4871(local39);
											local81 = local344.aShortArray18 = Static273.method4871(local42);
											local83 = local344.aByteArray4 = Static395.method6252(local45);
										}
										@Pc(377) short local377 = this.aShortArray94[local190];
										@Pc(382) short local382 = this.aShortArray98[local190];
										@Pc(387) short local387 = this.aShortArray92[local190];
										local202 = local106[local236 + 1];
										local195 = local106[local236];
										@Pc(402) byte local402 = this.aByteArray46[local190];
										@Pc(412) int local412;
										for (@Pc(404) int local404 = local195; local404 < local202; local404++) {
											local412 = local109[local404] - 1;
											if (local412 == -1) {
												break;
											}
											if (local83[local412] != 0) {
												local79[local412] += local377;
												local85[local412] += local382;
												local81[local412] += local387;
												local83[local412] += local402;
											}
										}
										local387 = local42[local259];
										local377 = local36[local259];
										local195 = this.anIntArray302[local135];
										local402 = local45[local259];
										local382 = local39[local259];
										local202 = this.anIntArray302[local135 + 1];
										for (local412 = local195; local412 < local202; local412++) {
											@Pc(498) int local498 = this.aShortArray99[local412] - 1;
											if (local498 == -1) {
												break;
											}
											if (local60[local498] != 0) {
												local56[local498] += local377;
												local52[local498] += local382;
												local64[local498] += local387;
												local60[local498] += local402;
											}
										}
										if (this.aClass121_5 == null && this.aClass121_4 != null) {
											this.aClass121_4.anInterface19_3 = null;
										}
										if (this.aClass121_5 != null) {
											this.aClass121_5.anInterface19_3 = null;
										}
										if (local8.aClass121_5 == null && local8.aClass121_4 != null) {
											local8.aClass121_4.anInterface19_3 = null;
										}
										if (local8.aClass121_5 != null) {
											local8.aClass121_5.anInterface19_3 = null;
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

	@OriginalMember(owner = "client!ln", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort70;
	}

	@OriginalMember(owner = "client!ln", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean505) {
			this.method5436();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6493; local7++) {
			this.anIntArray300[local7] = -this.anIntArray300[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6454; local25++) {
			this.aShortArray92[local25] = (short) -this.aShortArray92[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt6464; local44++) {
			@Pc(51) short local51 = this.aShortArray100[local44];
			this.aShortArray100[local44] = this.aShortArray97[local44];
			this.aShortArray97[local44] = local51;
		}
		if (this.aClass121_5 == null && this.aClass121_4 != null) {
			this.aClass121_4.anInterface19_3 = null;
		}
		if (this.aClass121_5 != null) {
			this.aClass121_5.anInterface19_3 = null;
		}
		if (this.aClass121_7 != null) {
			this.aClass121_7.anInterface19_3 = null;
		}
		if (this.aClass329_1 != null) {
			this.aClass329_1.anInterface9_5 = null;
		}
		this.aBoolean505 = false;
	}
}
