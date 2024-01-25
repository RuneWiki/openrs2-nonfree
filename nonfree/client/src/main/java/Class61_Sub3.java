import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class61_Sub3 extends Class61 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "[F")
	private float[] aFloatArray72;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "[Lclient!fk;")
	private Class101[] aClass101Array5;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "[Lclient!mp;")
	private Class219[] aClass219Array5;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "S")
	private short aShort113;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lclient!en;")
	private Class89[] aClass89Array1;

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "S")
	private short aShort114;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "S")
	private short aShort115;

	@OriginalMember(owner = "client!vp", name = "S", descriptor = "B")
	private byte aByte120;

	@OriginalMember(owner = "client!vp", name = "V", descriptor = "[Lclient!cn;")
	private Class54[] aClass54Array1;

	@OriginalMember(owner = "client!vp", name = "Z", descriptor = "S")
	private short aShort116;

	@OriginalMember(owner = "client!vp", name = "bb", descriptor = "I")
	private int anInt9195;

	@OriginalMember(owner = "client!vp", name = "eb", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!vp", name = "gb", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!vp", name = "ib", descriptor = "S")
	private short aShort117;

	@OriginalMember(owner = "client!vp", name = "jb", descriptor = "S")
	private short aShort118;

	@OriginalMember(owner = "client!vp", name = "ob", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!vp", name = "rb", descriptor = "[I")
	private int[] anIntArray615;

	@OriginalMember(owner = "client!vp", name = "xb", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!vp", name = "zb", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!vp", name = "Ab", descriptor = "I")
	private int anInt9208;

	@OriginalMember(owner = "client!vp", name = "Db", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!vp", name = "Eb", descriptor = "S")
	private short aShort119;

	@OriginalMember(owner = "client!vp", name = "Gb", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!vp", name = "Rb", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!vp", name = "Sb", descriptor = "Lclient!eca;")
	private Class83 aClass83_1;

	@OriginalMember(owner = "client!vp", name = "Yb", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vp", name = "Zb", descriptor = "[F")
	private float[] aFloatArray73;

	@OriginalMember(owner = "client!vp", name = "bc", descriptor = "I")
	private int anInt9227;

	@OriginalMember(owner = "client!vp", name = "dc", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!vp", name = "ec", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!vp", name = "ic", descriptor = "Lclient!cw;")
	private Interface1 anInterface1_6;

	@OriginalMember(owner = "client!vp", name = "kc", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!vp", name = "lc", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!vp", name = "mc", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!vp", name = "nc", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!vp", name = "sc", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vp", name = "Ac", descriptor = "Lclient!vh;")
	private Interface23 anInterface23_4;

	@OriginalMember(owner = "client!vp", name = "ab", descriptor = "Z")
	private boolean aBoolean672 = true;

	@OriginalMember(owner = "client!vp", name = "tb", descriptor = "I")
	private int anInt9205 = 0;

	@OriginalMember(owner = "client!vp", name = "yb", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!vp", name = "Q", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "client!vp", name = "hb", descriptor = "I")
	private int anInt9199 = 0;

	@OriginalMember(owner = "client!vp", name = "fc", descriptor = "I")
	private int anInt9228 = 0;

	@OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
	private int anInt9189 = 0;

	@OriginalMember(owner = "client!vp", name = "yc", descriptor = "I")
	private int anInt9238 = 0;

	@OriginalMember(owner = "client!vp", name = "sb", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_39;

	@OriginalMember(owner = "client!vp", name = "pc", descriptor = "Lclient!fe;")
	private Class97 aClass97_14;

	@OriginalMember(owner = "client!vp", name = "cc", descriptor = "Lclient!fe;")
	private Class97 aClass97_13;

	@OriginalMember(owner = "client!vp", name = "vb", descriptor = "Lclient!fe;")
	private Class97 aClass97_11;

	@OriginalMember(owner = "client!vp", name = "Wb", descriptor = "Lclient!fe;")
	private Class97 aClass97_12;

	@OriginalMember(owner = "client!vp", name = "uc", descriptor = "Lclient!paa;")
	private Class248 aClass248_1;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class61_Sub3(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_39 = arg0;
		this.aClass97_14 = new Class97(null, 5126, 3, 0);
		this.aClass97_13 = new Class97(null, 5126, 2, 0);
		this.aClass97_11 = new Class97(null, 5126, 3, 0);
		this.aClass97_12 = new Class97(null, 5121, 4, 0);
		this.aClass248_1 = new Class248();
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ag;Lclient!cca;IIII)V")
	public Class61_Sub3(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9208 = arg2;
		this.anInt9227 = arg5;
		this.aClass12_Sub1_39 = arg0;
		if (Static492.method6897(arg5, arg2)) {
			this.aClass97_14 = new Class97(null, 5126, 3, 0);
		}
		if (Static374.method5446(arg2, arg5)) {
			this.aClass97_13 = new Class97(null, 5126, 2, 0);
		}
		if (Static171.method2608(arg5, arg2)) {
			this.aClass97_11 = new Class97(null, 5126, 3, 0);
		}
		if (Static404.method5707(arg5, arg2)) {
			this.aClass97_12 = new Class97(null, 5121, 4, 0);
		}
		if (Static545.method7406(arg2, arg5)) {
			this.aClass248_1 = new Class248();
		}
		@Pc(105) Interface5 local105 = arg0.anInterface5_10;
		@Pc(109) int[] local109 = new int[arg1.anInt1492];
		this.anIntArray617 = new int[arg1.anInt1497 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt1492; local118++) {
			if ((arg1.aByteArray8 == null || arg1.aByteArray8[local118] != 2) && (arg1.aShortArray15 == null || arg1.aShortArray15[local118] == -1 || !local105.method4043(arg1.aShortArray15[local118] & 0xFFFF).aBoolean123)) {
				local109[this.anInt9238++] = local118;
				this.anIntArray617[arg1.aShortArray16[local118]]++;
				this.anIntArray617[arg1.aShortArray7[local118]]++;
				this.anIntArray617[arg1.aShortArray9[local118]]++;
			}
		}
		this.anInt9205 = this.anInt9238;
		@Pc(205) long[] local205 = new long[this.anInt9238];
		@Pc(214) boolean local214 = (this.anInt9208 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(373) int local373;
		label497: for (@Pc(216) int local216 = 0; local216 < this.anInt9238; local216++) {
			@Pc(222) int local222 = local109[local216];
			@Pc(224) Class45 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass347Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass347Array1.length; local237++) {
					@Pc(244) Class347 local244 = arg1.aClass347Array1[local237];
					if (local222 == local244.anInt9257) {
						@Pc(257) Class107 local257 = Static119.method2026(local244.anInt9253);
						if (local257.aBoolean204) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt9205--;
							continue label497;
						}
					}
				}
			}
			@Pc(284) short local284 = -1;
			if (arg1.aShortArray15 != null) {
				local284 = arg1.aShortArray15[local222];
				if (local284 != -1) {
					local224 = local105.method4043(local284 & 0xFFFF);
					local230 = local224.aByte25;
					local232 = local224.aByte23;
				}
			}
			@Pc(335) boolean local335 = arg1.aByteArray5 != null && arg1.aByteArray5[local222] != 0 || local224 != null && local224.aBoolean121 | !local224.aBoolean119;
			if ((local214 || local335) && arg1.aByteArray9 != null) {
				local226 += arg1.aByteArray9[local222] << 17;
			}
			if (local335) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local373 = local228 + ((local284 & 0xFFFF) << 16);
			local226 += local232 & 0xFF;
			@Pc(385) int local385 = local373 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + ((long) local385);
			this.aBoolean673 |= local335;
		}
		Static63.method1404(local205, local109);
		this.anIntArray615 = arg1.anIntArray74;
		this.anInt9189 = arg1.anInt1493;
		this.aShortArray123 = arg1.aShortArray10;
		this.anIntArray613 = arg1.anIntArray79;
		this.anIntArray616 = arg1.anIntArray72;
		this.anInt9199 = arg1.anInt1497;
		@Pc(439) Class332[] local439 = new Class332[this.anInt9199];
		this.aClass219Array5 = arg1.aClass219Array1;
		this.aClass101Array5 = arg1.aClass101Array1;
		@Pc(467) int local467;
		@Pc(481) int local481;
		if (arg1.aClass347Array1 != null) {
			this.anInt9195 = arg1.aClass347Array1.length;
			this.aClass54Array1 = new Class54[this.anInt9195];
			this.aClass89Array1 = new Class89[this.anInt9195];
			for (local467 = 0; local467 < this.anInt9195; local467++) {
				@Pc(474) Class347 local474 = arg1.aClass347Array1[local467];
				@Pc(479) Class107 local479 = Static119.method2026(local474.anInt9253);
				local481 = -1;
				for (@Pc(483) int local483 = 0; local483 < this.anInt9238; local483++) {
					if (local109[local483] == local474.anInt9257) {
						local481 = local483;
						break;
					}
				}
				if (local481 == -1) {
					throw new RuntimeException();
				}
				local237 = Static279.anIntArray313[arg1.aShortArray13[local474.anInt9257] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray5 == null ? 0 : arg1.aByteArray5[local474.anInt9257]) << 24;
				this.aClass89Array1[local467] = new Class89(local481, arg1.aShortArray16[local474.anInt9257], arg1.aShortArray7[local474.anInt9257], arg1.aShortArray9[local474.anInt9257], local479.anInt2862, local479.anInt2861, local479.anInt2865, local479.anInt2867, local479.anInt2866, local479.aBoolean204, local479.aBoolean203, local474.anInt9258);
				this.aClass54Array1[local467] = new Class54(local237);
			}
		}
		local467 = this.anInt9238 * 3;
		this.aByteArray100 = new byte[local467];
		this.aShortArray119 = new short[local467];
		this.aShort113 = (short) arg3;
		this.aShortArray118 = new short[this.anInt9238];
		this.aShort115 = (short) arg4;
		this.aShortArray117 = new short[local467];
		this.aShortArray121 = new short[local467];
		if (arg1.aShortArray12 != null) {
			this.aShortArray120 = new short[this.anInt9238];
		}
		this.aShortArray124 = new short[this.anInt9238];
		this.aFloatArray73 = new float[local467];
		this.aByteArray99 = new byte[this.anInt9238];
		this.aFloatArray72 = new float[local467];
		this.aShortArray116 = new short[this.anInt9238];
		Static15.aLongArray1 = new long[local467];
		this.aShortArray122 = new short[local467];
		this.aShortArray115 = new short[this.anInt9238];
		this.aShortArray114 = new short[this.anInt9238];
		local226 = 0;
		for (local373 = 0; local373 < arg1.anInt1497; local373++) {
			local481 = this.anIntArray617[local373];
			this.anIntArray617[local373] = local226;
			local439[local373] = new Class332();
			local226 += local481;
		}
		this.anIntArray617[arg1.anInt1497] = local226;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) float[][] local724 = null;
		@Pc(750) int local750;
		@Pc(789) int local789;
		@Pc(795) int local795;
		@Pc(808) int local808;
		@Pc(810) int local810;
		@Pc(844) int local844;
		@Pc(849) int local849;
		@Pc(1011) float local1011;
		@Pc(1019) float local1019;
		@Pc(1003) float local1003;
		if (arg1.aByteArray10 != null) {
			@Pc(730) int local730 = arg1.anInt1483;
			@Pc(733) int[] local733 = new int[local730];
			@Pc(736) int[] local736 = new int[local730];
			@Pc(739) int[] local739 = new int[local730];
			@Pc(742) int[] local742 = new int[local730];
			@Pc(745) int[] local745 = new int[local730];
			@Pc(748) int[] local748 = new int[local730];
			for (local750 = 0; local750 < local730; local750++) {
				local733[local750] = Integer.MAX_VALUE;
				local736[local750] = -2147483647;
				local739[local750] = Integer.MAX_VALUE;
				local742[local750] = -2147483647;
				local745[local750] = Integer.MAX_VALUE;
				local748[local750] = -2147483647;
			}
			local722 = new int[local730];
			for (local789 = 0; local789 < this.anInt9238; local789++) {
				local795 = local109[local789];
				if (arg1.aByteArray10[local795] != -1) {
					local808 = arg1.aByteArray10[local795] & 0xFF;
					for (local810 = 0; local810 < 3; local810++) {
						@Pc(825) short local825;
						if (local810 == 0) {
							local825 = arg1.aShortArray16[local795];
						} else if (local810 == 1) {
							local825 = arg1.aShortArray7[local795];
						} else {
							local825 = arg1.aShortArray9[local795];
						}
						local844 = arg1.anIntArray74[local825];
						local849 = arg1.anIntArray72[local825];
						@Pc(854) int local854 = arg1.anIntArray79[local825];
						if (local844 < local733[local808]) {
							local733[local808] = local844;
						}
						if (local736[local808] < local844) {
							local736[local808] = local844;
						}
						if (local849 < local739[local808]) {
							local739[local808] = local849;
						}
						if (local742[local808] < local849) {
							local742[local808] = local849;
						}
						if (local745[local808] > local854) {
							local745[local808] = local854;
						}
						if (local854 > local748[local808]) {
							local748[local808] = local854;
						}
					}
				}
			}
			local720 = new int[local730];
			local718 = new int[local730];
			local724 = new float[local730][];
			for (local795 = 0; local795 < local730; local795++) {
				@Pc(945) byte local945 = arg1.aByteArray6[local795];
				if (local945 > 0) {
					local718[local795] = (local736[local795] + local733[local795]) / 2;
					local720[local795] = (local742[local795] + local739[local795]) / 2;
					local722[local795] = (local745[local795] + local748[local795]) / 2;
					if (local945 == 1) {
						local849 = arg1.anIntArray78[local795];
						if (local849 == 0) {
							local1019 = 1.0F;
							local1011 = 1.0F;
						} else if (local849 > 0) {
							local1019 = (float) local849 / 1024.0F;
							local1011 = 1.0F;
						} else {
							local1011 = (float) -local849 / 1024.0F;
							local1019 = 1.0F;
						}
						local1003 = 64.0F / (float) arg1.anIntArray80[local795];
					} else if (local945 == 2) {
						local1019 = 64.0F / (float) arg1.anIntArray71[local795];
						local1011 = 64.0F / (float) arg1.anIntArray78[local795];
						local1003 = 64.0F / (float) arg1.anIntArray80[local795];
					} else {
						local1003 = (float) arg1.anIntArray80[local795] / 1024.0F;
						local1011 = (float) arg1.anIntArray78[local795] / 1024.0F;
						local1019 = (float) arg1.anIntArray71[local795] / 1024.0F;
					}
					local724[local795] = Static331.method4979(arg1.aShortArray11[local795], arg1.aByteArray11[local795] & 0xFF, local1003, local1011, local1019, arg1.aShortArray14[local795], arg1.aShortArray8[local795]);
				}
			}
		}
		@Pc(1127) Class338[] local1127 = new Class338[arg1.anInt1492];
		@Pc(1146) short local1146;
		@Pc(1157) int local1157;
		@Pc(1168) int local1168;
		@Pc(1228) int local1228;
		for (@Pc(1129) int local1129 = 0; local1129 < arg1.anInt1492; local1129++) {
			@Pc(1136) short local1136 = arg1.aShortArray16[local1129];
			@Pc(1141) short local1141 = arg1.aShortArray7[local1129];
			local1146 = arg1.aShortArray9[local1129];
			local1157 = this.anIntArray615[local1141] - this.anIntArray615[local1136];
			local1168 = this.anIntArray616[local1141] - this.anIntArray616[local1136];
			local750 = this.anIntArray613[local1141] - this.anIntArray613[local1136];
			local789 = this.anIntArray615[local1146] - this.anIntArray615[local1136];
			local795 = this.anIntArray616[local1146] - this.anIntArray616[local1136];
			local808 = this.anIntArray613[local1146] - this.anIntArray613[local1136];
			local810 = local808 * local1168 - local750 * local795;
			local1228 = local789 * local750 - local1157 * local808;
			local844 = local1157 * local795 - local1168 * local789;
			while (local810 > 8192 || local1228 > 8192 || local844 > 8192 || local810 < -8192 || local1228 < -8192 || local844 < -8192) {
				local844 >>= 0x1;
				local1228 >>= 0x1;
				local810 >>= 0x1;
			}
			local849 = (int) Math.sqrt((double) (local844 * local844 + local1228 * local1228 + local810 * local810));
			if (local849 <= 0) {
				local849 = 1;
			}
			local810 = local810 * 256 / local849;
			local844 = local844 * 256 / local849;
			local1228 = local1228 * 256 / local849;
			@Pc(1321) byte local1321 = arg1.aByteArray8 == null ? 0 : arg1.aByteArray8[local1129];
			if (local1321 == 0) {
				@Pc(1351) Class332 local1351 = local439[local1136];
				local1351.anInt8882++;
				local1351.anInt8883 += local844;
				local1351.anInt8887 += local1228;
				local1351.anInt8886 += local810;
				@Pc(1379) Class332 local1379 = local439[local1141];
				local1379.anInt8882++;
				local1379.anInt8887 += local1228;
				local1379.anInt8883 += local844;
				local1379.anInt8886 += local810;
				@Pc(1407) Class332 local1407 = local439[local1146];
				local1407.anInt8882++;
				local1407.anInt8886 += local810;
				local1407.anInt8883 += local844;
				local1407.anInt8887 += local1228;
			} else if (local1321 == 1) {
				@Pc(1336) Class338 local1336 = local1127[local1129] = new Class338();
				local1336.anInt9034 = local1228;
				local1336.anInt9036 = local810;
				local1336.anInt9032 = local844;
			}
		}
		@Pc(1444) int local1444;
		for (@Pc(1438) int local1438 = 0; local1438 < this.anInt9238; local1438++) {
			local1444 = local109[local1438];
			@Pc(1451) int local1451 = arg1.aShortArray13[local1444] & 0xFFFF;
			@Pc(1459) short local1459;
			if (arg1.aShortArray15 == null) {
				local1459 = -1;
			} else {
				local1459 = arg1.aShortArray15[local1444];
			}
			if (arg1.aByteArray10 == null) {
				local1168 = -1;
			} else {
				local1168 = arg1.aByteArray10[local1444];
			}
			if (arg1.aByteArray5 == null) {
				local750 = 0;
			} else {
				local750 = arg1.aByteArray5[local1444] & 0xFF;
			}
			@Pc(1491) float local1491 = 0.0F;
			@Pc(1493) float local1493 = 0.0F;
			@Pc(1495) float local1495 = 0.0F;
			local1011 = 0.0F;
			local1003 = 0.0F;
			local1019 = 0.0F;
			@Pc(1503) byte local1503 = 0;
			@Pc(1505) byte local1505 = 0;
			@Pc(1507) int local1507 = 0;
			@Pc(1540) byte local1540;
			@Pc(1560) short local1560;
			@Pc(2301) short local2301;
			@Pc(2306) short local2306;
			if (local1459 != -1) {
				if (local1168 == -1) {
					local1505 = 2;
					local1003 = 0.0F;
					local1495 = 1.0F;
					local1491 = 0.0F;
					local1493 = 1.0F;
					local1503 = 1;
					local1019 = 0.0F;
					local1011 = 1.0F;
				} else {
					local1168 &= 0xFF;
					local1540 = arg1.aByteArray6[local1168];
					@Pc(1550) short local1550;
					@Pc(1555) short local1555;
					@Pc(1589) float local1589;
					@Pc(1600) float local1600;
					@Pc(1679) float local1679;
					@Pc(1913) float local1913;
					@Pc(1921) float local1921;
					@Pc(1929) float local1929;
					@Pc(1952) float local1952;
					@Pc(1975) float local1975;
					@Pc(1998) float local1998;
					if (local1540 == 0) {
						local1550 = arg1.aShortArray16[local1444];
						local1555 = arg1.aShortArray7[local1444];
						local1560 = arg1.aShortArray9[local1444];
						local2301 = arg1.aShortArray11[local1168];
						local2306 = arg1.aShortArray14[local1168];
						@Pc(2311) short local2311 = arg1.aShortArray8[local1168];
						@Pc(2317) float local2317 = (float) arg1.anIntArray74[local2301];
						@Pc(2323) float local2323 = (float) arg1.anIntArray72[local2301];
						local1589 = arg1.anIntArray79[local2301];
						local1600 = (float) arg1.anIntArray74[local2306] - local2317;
						local1679 = (float) arg1.anIntArray72[local2306] - local2323;
						@Pc(2354) float local2354 = (float) arg1.anIntArray79[local2306] - local1589;
						@Pc(2363) float local2363 = (float) arg1.anIntArray74[local2311] - local2317;
						@Pc(2372) float local2372 = (float) arg1.anIntArray72[local2311] - local2323;
						@Pc(2381) float local2381 = (float) arg1.anIntArray79[local2311] - local1589;
						@Pc(2390) float local2390 = (float) arg1.anIntArray74[local1550] - local2317;
						@Pc(2398) float local2398 = (float) arg1.anIntArray72[local1550] - local2323;
						@Pc(2407) float local2407 = (float) arg1.anIntArray79[local1550] - local1589;
						@Pc(2415) float local2415 = (float) arg1.anIntArray74[local1555] - local2317;
						@Pc(2423) float local2423 = (float) arg1.anIntArray72[local1555] - local2323;
						local1913 = (float) arg1.anIntArray79[local1555] - local1589;
						local1921 = (float) arg1.anIntArray74[local1560] - local2317;
						local1929 = (float) arg1.anIntArray72[local1560] - local2323;
						local1952 = (float) arg1.anIntArray79[local1560] - local1589;
						local1975 = local2381 * local1679 - local2372 * local2354;
						local1998 = local2354 * local2363 - local2381 * local1600;
						@Pc(2482) float local2482 = local1600 * local2372 - local2363 * local1679;
						@Pc(2490) float local2490 = local2482 * local2372 - local1998 * local2381;
						@Pc(2499) float local2499 = local2381 * local1975 - local2363 * local2482;
						@Pc(2508) float local2508 = local1998 * local2363 - local1975 * local2372;
						@Pc(2522) float local2522 = 1.0F / (local2499 * local1679 + local2490 * local1600 + local2354 * local2508);
						local1495 = local2522 * (local1913 * local2508 + local2499 * local2423 + local2415 * local2490);
						local1491 = (local2508 * local2407 + local2398 * local2499 + local2390 * local2490) * local2522;
						local1003 = (local1952 * local2508 + local1921 * local2490 + local2499 * local1929) * local2522;
						@Pc(2572) float local2572 = local2354 * local1975 - local1600 * local2482;
						@Pc(2581) float local2581 = local1998 * local1600 - local1679 * local1975;
						@Pc(2590) float local2590 = local1679 * local2482 - local2354 * local1998;
						@Pc(2604) float local2604 = 1.0F / (local2381 * local2581 + local2363 * local2590 + local2572 * local2372);
						local1011 = local2604 * (local2590 * local2415 + local2423 * local2572 + local2581 * local1913);
						local1493 = local2604 * (local2581 * local2407 + local2398 * local2572 + local2590 * local2390);
						local1019 = local2604 * (local2581 * local1952 + local1921 * local2590 + local2572 * local1929);
					} else {
						local1550 = arg1.aShortArray16[local1444];
						local1555 = arg1.aShortArray7[local1444];
						local1560 = arg1.aShortArray9[local1444];
						@Pc(1564) int local1564 = local718[local1168];
						@Pc(1568) int local1568 = local720[local1168];
						@Pc(1572) int local1572 = local722[local1168];
						@Pc(1576) float[] local1576 = local724[local1168];
						@Pc(1581) byte local1581 = arg1.aByteArray7[local1168];
						local1589 = (float) arg1.anIntArray76[local1168] / 256.0F;
						if (local1540 == 1) {
							local1600 = (float) arg1.anIntArray71[local1168] / 1024.0F;
							Static45.method1033(local1600, local1581, local1576, local1572, arg1.anIntArray72[local1550], local1568, local1564, local1589, arg1.anIntArray79[local1550], arg1.anIntArray74[local1550]);
							local1491 = Static289.aFloat119;
							local1493 = Static336.aFloat152;
							Static45.method1033(local1600, local1581, local1576, local1572, arg1.anIntArray72[local1555], local1568, local1564, local1589, arg1.anIntArray79[local1555], arg1.anIntArray74[local1555]);
							local1495 = Static289.aFloat119;
							local1011 = Static336.aFloat152;
							Static45.method1033(local1600, local1581, local1576, local1572, arg1.anIntArray72[local1560], local1568, local1564, local1589, arg1.anIntArray79[local1560], arg1.anIntArray74[local1560]);
							local1003 = Static289.aFloat119;
							local1019 = Static336.aFloat152;
							local1679 = local1600 / 2.0F;
							if ((local1581 & 0x1) == 0) {
								if (local1495 - local1491 > local1679) {
									local1503 = 1;
									local1495 -= local1600;
								} else if (local1679 < local1491 - local1495) {
									local1495 += local1600;
									local1503 = 2;
								}
								if (local1679 < local1003 - local1491) {
									local1003 -= local1600;
									local1505 = 1;
								} else if (local1679 < local1491 - local1003) {
									local1505 = 2;
									local1003 += local1600;
								}
							} else {
								if (local1019 - local1493 > local1679) {
									local1505 = 1;
									local1019 -= local1600;
								} else if (local1493 - local1019 > local1679) {
									local1505 = 2;
									local1019 += local1600;
								}
								if (local1679 < local1011 - local1493) {
									local1011 -= local1600;
									local1503 = 1;
								} else if (local1493 - local1011 > local1679) {
									local1503 = 2;
									local1011 += local1600;
								}
							}
						} else if (local1540 == 2) {
							local1600 = (float) arg1.anIntArray81[local1168] / 256.0F;
							local1679 = (float) arg1.anIntArray73[local1168] / 256.0F;
							@Pc(1825) int local1825 = arg1.anIntArray74[local1555] - arg1.anIntArray74[local1550];
							@Pc(1836) int local1836 = arg1.anIntArray72[local1555] - arg1.anIntArray72[local1550];
							@Pc(1847) int local1847 = arg1.anIntArray79[local1555] - arg1.anIntArray79[local1550];
							@Pc(1857) int local1857 = arg1.anIntArray74[local1560] - arg1.anIntArray74[local1550];
							@Pc(1868) int local1868 = arg1.anIntArray72[local1560] - arg1.anIntArray72[local1550];
							@Pc(1879) int local1879 = arg1.anIntArray79[local1560] - arg1.anIntArray79[local1550];
							@Pc(1888) int local1888 = local1879 * local1836 - local1847 * local1868;
							@Pc(1896) int local1896 = local1857 * local1847 - local1825 * local1879;
							@Pc(1905) int local1905 = local1868 * local1825 - local1836 * local1857;
							local1913 = 64.0F / (float) arg1.anIntArray78[local1168];
							local1921 = 64.0F / (float) arg1.anIntArray80[local1168];
							local1929 = 64.0F / (float) arg1.anIntArray71[local1168];
							local1952 = ((float) local1905 * local1576[2] + (float) local1888 * local1576[0] + local1576[1] * (float) local1896) / local1913;
							local1975 = (local1576[5] * (float) local1905 + local1576[4] * (float) local1896 + local1576[3] * (float) local1888) / local1921;
							local1998 = (local1576[8] * (float) local1905 + (float) local1896 * local1576[7] + local1576[6] * (float) local1888) / local1929;
							local1507 = Static100.method1840(local1998, local1952, local1975);
							Static456.method6390(local1564, arg1.anIntArray79[local1550], local1589, local1600, local1576, local1568, local1507, arg1.anIntArray72[local1550], arg1.anIntArray74[local1550], local1572, local1679, local1581);
							local1491 = Static411.aFloat177;
							local1493 = Static302.aFloat64;
							Static456.method6390(local1564, arg1.anIntArray79[local1555], local1589, local1600, local1576, local1568, local1507, arg1.anIntArray72[local1555], arg1.anIntArray74[local1555], local1572, local1679, local1581);
							local1011 = Static302.aFloat64;
							local1495 = Static411.aFloat177;
							Static456.method6390(local1564, arg1.anIntArray79[local1560], local1589, local1600, local1576, local1568, local1507, arg1.anIntArray72[local1560], arg1.anIntArray74[local1560], local1572, local1679, local1581);
							local1019 = Static302.aFloat64;
							local1003 = Static411.aFloat177;
						} else if (local1540 == 3) {
							Static420.method6361(local1576, local1568, arg1.anIntArray72[local1550], arg1.anIntArray74[local1550], arg1.anIntArray79[local1550], local1564, local1581, local1572, local1589);
							local1493 = Static120.aFloat45;
							local1491 = Static97.aFloat154;
							Static420.method6361(local1576, local1568, arg1.anIntArray72[local1555], arg1.anIntArray74[local1555], arg1.anIntArray79[local1555], local1564, local1581, local1572, local1589);
							local1011 = Static120.aFloat45;
							local1495 = Static97.aFloat154;
							Static420.method6361(local1576, local1568, arg1.anIntArray72[local1560], arg1.anIntArray74[local1560], arg1.anIntArray79[local1560], local1564, local1581, local1572, local1589);
							local1003 = Static97.aFloat154;
							local1019 = Static120.aFloat45;
							if ((local1581 & 0x1) == 0) {
								if (local1003 - local1491 > 0.5F) {
									local1003--;
									local1505 = 1;
								} else if (local1491 - local1003 > 0.5F) {
									local1505 = 2;
									local1003++;
								}
								if (local1495 - local1491 > 0.5F) {
									local1495--;
									local1503 = 1;
								} else if (local1491 - local1495 > 0.5F) {
									local1495++;
									local1503 = 2;
								}
							} else {
								if (local1011 - local1493 > 0.5F) {
									local1011--;
									local1503 = 1;
								} else if (local1493 - local1011 > 0.5F) {
									local1011++;
									local1503 = 2;
								}
								if (local1019 - local1493 > 0.5F) {
									local1019--;
									local1505 = 1;
								} else if (local1493 - local1019 > 0.5F) {
									local1019++;
									local1505 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray8 == null) {
				local1540 = 0;
			} else {
				local1540 = arg1.aByteArray8[local1444];
			}
			if (local1540 == 0) {
				@Pc(2807) long local2807 = ((long) local750 + (long) (local1507 << 24) + (long) (local1451 << 8) << 32) + (long) (local1168 << 2);
				local1560 = arg1.aShortArray16[local1444];
				local2301 = arg1.aShortArray7[local1444];
				local2306 = arg1.aShortArray9[local1444];
				@Pc(2826) Class332 local2826 = local439[local1560];
				this.aShortArray124[local1438] = this.method7615(local1560, arg1, local2826.anInt8882, local1493, local2826.anInt8883, local1491, local2826.anInt8887, local2826.anInt8886, local2807);
				@Pc(2850) Class332 local2850 = local439[local2301];
				this.aShortArray116[local1438] = this.method7615(local2301, arg1, local2850.anInt8882, local1011, local2850.anInt8883, local1495, local2850.anInt8887, local2850.anInt8886, local2807 + (long) local1503);
				@Pc(2877) Class332 local2877 = local439[local2306];
				this.aShortArray118[local1438] = this.method7615(local2306, arg1, local2877.anInt8882, local1019, local2877.anInt8883, local1003, local2877.anInt8887, local2877.anInt8886, (long) local1505 + local2807);
			} else if (local1540 == 1) {
				@Pc(2670) Class338 local2670 = local1127[local1444];
				@Pc(2713) long local2713 = (long) ((local2670.anInt9032 + 256 << 22) + (local1168 << 2) + (local2670.anInt9036 <= 0 ? 2048 : 1024) + (local2670.anInt9034 + 256 << 12)) + ((long) local750 + (long) (local1451 << 8) + (long) (local1507 << 24) << 32);
				this.aShortArray124[local1438] = this.method7615(arg1.aShortArray16[local1444], arg1, 0, local1493, local2670.anInt9032, local1491, local2670.anInt9034, local2670.anInt9036, local2713);
				this.aShortArray116[local1438] = this.method7615(arg1.aShortArray7[local1444], arg1, 0, local1011, local2670.anInt9032, local1495, local2670.anInt9034, local2670.anInt9036, (long) local1503 + local2713);
				this.aShortArray118[local1438] = this.method7615(arg1.aShortArray9[local1444], arg1, 0, local1019, local2670.anInt9032, local1003, local2670.anInt9034, local2670.anInt9036, local2713 + (long) local1505);
			}
			if (arg1.aShortArray15 == null) {
				this.aShortArray115[local1438] = -1;
			} else {
				this.aShortArray115[local1438] = arg1.aShortArray15[local1444];
			}
			if (arg1.aByteArray5 != null) {
				this.aByteArray99[local1438] = arg1.aByteArray5[local1444];
			}
			if (arg1.aShortArray12 != null) {
				this.aShortArray120[local1438] = arg1.aShortArray12[local1444];
			}
			this.aShortArray114[local1438] = arg1.aShortArray13[local1444];
		}
		local1444 = 0;
		local1146 = -10000;
		for (local1157 = 0; local1157 < this.anInt9205; local1157++) {
			@Pc(2966) short local2966 = this.aShortArray115[local1157];
			if (local1146 != local2966) {
				local1146 = local2966;
				local1444++;
			}
		}
		this.anIntArray614 = new int[local1444 + 1];
		local1444 = 0;
		local1146 = -10000;
		for (local1168 = 0; local1168 < this.anInt9205; local1168++) {
			@Pc(2996) short local2996 = this.aShortArray115[local1168];
			if (local1146 != local2996) {
				local1146 = local2996;
				this.anIntArray614[local1444++] = local1168;
			}
		}
		this.anIntArray614[local1444] = this.anInt9205;
		Static15.aLongArray1 = null;
		this.aShortArray121 = Static407.method5754(this.aShortArray121, this.anInt9228);
		this.aShortArray119 = Static407.method5754(this.aShortArray119, this.anInt9228);
		this.aShortArray122 = Static407.method5754(this.aShortArray122, this.anInt9228);
		this.aByteArray100 = Static278.method4292(this.aByteArray100, this.anInt9228);
		this.aFloatArray72 = Static491.method1544(this.aFloatArray72, this.anInt9228);
		this.aFloatArray73 = Static491.method1544(this.aFloatArray73, this.anInt9228);
		if (arg1.anIntArray77 != null && Static82.method7595(arg2, this.anInt9227)) {
			this.anIntArrayArray58 = arg1.method1369(false);
		}
		if (arg1.aClass347Array1 != null && Static340.method5068(this.anInt9227, arg2)) {
			this.anIntArrayArray60 = arg1.method1367();
		}
		if (arg1.anIntArray75 != null && Static41.method998(arg2, this.anInt9227)) {
			local750 = 0;
			@Pc(3115) int[] local3115 = new int[256];
			for (local795 = 0; local795 < this.anInt9238; local795++) {
				local808 = arg1.anIntArray75[local109[local795]];
				if (local808 >= 0) {
					if (local808 > local750) {
						local750 = local808;
					}
					@Pc(3137) int local3137 = local3115[local808]++;
				}
			}
			this.anIntArrayArray59 = new int[local750 + 1][];
			for (local808 = 0; local808 <= local750; local808++) {
				this.anIntArrayArray59[local808] = new int[local3115[local808]];
				local3115[local808] = 0;
			}
			for (local810 = 0; local810 < this.anInt9238; local810++) {
				local1228 = arg1.anIntArray75[local109[local810]];
				if (local1228 >= 0) {
					this.anIntArrayArray59[local1228][local3115[local1228]++] = local810;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt9208 = arg0;
		this.aBoolean672 = true;
		if (this.aClass83_1 != null && (this.anInt9208 & 0x10000) == 0) {
			this.aShortArray121 = this.aClass83_1.aShortArray34;
			this.aByteArray100 = this.aClass83_1.aByteArray20;
			this.aShortArray122 = this.aClass83_1.aShortArray35;
			this.aShortArray119 = this.aClass83_1.aShortArray33;
			this.aClass83_1 = null;
		}
		this.method7619();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7625(arg3, arg0, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!vp", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt9208;
	}

	@OriginalMember(owner = "client!vp", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9199; local7++) {
			if (arg0 != 0) {
				this.anIntArray615[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray616[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray613[local7] += arg2;
			}
		}
		this.aBoolean670 = false;
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "()V")
	@Override
	protected void method7603() {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
	private void method7612(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null;
		@Pc(27) boolean local27 = this.aClass97_11 != null && this.aClass97_11.anInterface1_4 == null;
		@Pc(38) boolean local38 = this.aClass97_14 != null && this.aClass97_14.anInterface1_4 == null;
		@Pc(49) boolean local49 = this.aClass97_13 != null && this.aClass97_13.anInterface1_4 == null;
		if (arg0) {
			local49 &= (this.aByte120 & 0x8) != 0;
			local16 &= (this.aByte120 & 0x2) != 0;
			local27 &= (this.aByte120 & 0x4) != 0;
			local38 &= (this.aByte120 & 0x1) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local114 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local116 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1.aByteArray52.length >= this.anInt9228 * local103) {
			this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1.anInt5238 = 0;
		} else {
			this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1 = new Class1_Sub20_Sub2(local103 * (this.anInt9228 + 100));
		}
		@Pc(192) Class1_Sub20_Sub2 local192 = this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1;
		@Pc(200) int local200;
		@Pc(209) int local209;
		@Pc(237) int local237;
		@Pc(246) int local246;
		if (local38) {
			@Pc(216) int local216;
			@Pc(223) int local223;
			@Pc(228) int local228;
			@Pc(235) int local235;
			if (this.aClass12_Sub1_39.aBoolean23) {
				for (local200 = 0; local200 < this.anInt9199; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray615[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray616[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray613[local200]);
					local228 = this.anIntArray617[local200];
					local235 = this.anIntArray617[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray117[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt5238 = local246 * local103;
						local192.method4421(local209);
						local192.method4421(local216);
						local192.method4421(local223);
					}
				}
			} else {
				for (local200 = 0; local200 < this.anInt9199; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray615[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray616[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray613[local200]);
					local228 = this.anIntArray617[local200];
					local235 = this.anIntArray617[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray117[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt5238 = local246 * local103;
						local192.method4385(local209);
						local192.method4385(local216);
						local192.method4385(local223);
					}
				}
			}
		}
		@Pc(480) float local480;
		@Pc(381) short[] local381;
		@Pc(387) short[] local387;
		@Pc(384) short[] local384;
		@Pc(378) byte[] local378;
		@Pc(538) float local538;
		if (local16) {
			if (this.aClass97_11 == null) {
				if (this.aClass83_1 == null) {
					local378 = this.aByteArray100;
					local381 = this.aShortArray121;
					local384 = this.aShortArray122;
					local387 = this.aShortArray119;
				} else {
					local387 = this.aClass83_1.aShortArray33;
					local384 = this.aClass83_1.aShortArray35;
					local378 = this.aClass83_1.aByteArray20;
					local381 = this.aClass83_1.aShortArray34;
				}
				@Pc(411) float local411 = this.aClass12_Sub1_39.aFloatArray2[0];
				@Pc(417) float local417 = this.aClass12_Sub1_39.aFloatArray2[1];
				@Pc(423) float local423 = this.aClass12_Sub1_39.aFloatArray2[2];
				@Pc(427) float local427 = this.aClass12_Sub1_39.aFloat13;
				@Pc(437) float local437 = this.aClass12_Sub1_39.aFloat19 * 768.0F / (float) this.aShort115;
				@Pc(447) float local447 = this.aClass12_Sub1_39.aFloat18 * 768.0F / (float) this.aShort115;
				for (@Pc(449) int local449 = 0; local449 < this.anInt9238; local449++) {
					@Pc(469) int local469 = this.method7623(this.aShort113, this.aByteArray99[local449], this.aShortArray115[local449], this.aShortArray114[local449]);
					local480 = (float) (local469 >> 16 & 0xFF) * this.aClass12_Sub1_39.aFloat12;
					@Pc(491) float local491 = this.aClass12_Sub1_39.aFloat1 * (float) (local469 >> 8 & 0xFF);
					@Pc(500) float local500 = (float) (local469 >>> 24) * this.aClass12_Sub1_39.aFloat14;
					@Pc(505) short local505 = this.aShortArray124[local449];
					@Pc(510) short local510 = (short) local378[local505];
					if (local510 == 0) {
						local538 = (local423 * (float) local384[local505] + local411 * (float) local381[local505] + (float) local387[local505] * local417) * 0.0026041667F;
					} else {
						local538 = (local411 * (float) local381[local505] + local417 * (float) local387[local505] + local423 * (float) local384[local505]) / (float) (local510 * 256);
					}
					@Pc(578) float local578 = local427 + local538 * (local538 < 0.0F ? local447 : local437);
					@Pc(583) int local583 = (int) (local500 * local578);
					@Pc(588) int local588 = (int) (local480 * local578);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					@Pc(604) int local604 = (int) (local578 * local491);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local192.anInt5238 = local103 * local505 + local107;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.method4378(local583);
					local192.method4378(local588);
					local192.method4378(local604);
					local192.method4378(255 - (this.aByteArray99[local449] & 0xFF));
					local505 = this.aShortArray116[local449];
					local510 = local378[local505];
					if (local510 == 0) {
						local538 = ((float) local384[local505] * local423 + (float) local381[local505] * local411 + local417 * (float) local387[local505]) * 0.0026041667F;
					} else {
						local538 = ((float) local387[local505] * local417 + local411 * (float) local381[local505] + (float) local384[local505] * local423) / (float) (local510 * 256);
					}
					local578 = local427 + (local538 < 0.0F ? local447 : local437) * local538;
					local583 = (int) (local578 * local500);
					if (local583 < 0) {
						local583 = 0;
					} else if (local583 > 255) {
						local583 = 255;
					}
					local588 = (int) (local578 * local480);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local604 = (int) (local578 * local491);
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.anInt5238 = local107 + local505 * local103;
					local192.method4378(local583);
					local192.method4378(local588);
					local192.method4378(local604);
					local192.method4378(255 - (this.aByteArray99[local449] & 0xFF));
					local505 = this.aShortArray118[local449];
					local510 = local378[local505];
					if (local510 == 0) {
						local538 = ((float) local384[local505] * local423 + (float) local387[local505] * local417 + local411 * (float) local381[local505]) * 0.0026041667F;
					} else {
						local538 = ((float) local384[local505] * local423 + local417 * (float) local387[local505] + local411 * (float) local381[local505]) / (float) (local510 * 256);
					}
					local578 = (local538 < 0.0F ? local447 : local437) * local538 + local427;
					local583 = (int) (local578 * local500);
					local588 = (int) (local480 * local578);
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
					local604 = (int) (local578 * local491);
					local192.anInt5238 = local107 + local505 * local103;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.method4378(local583);
					local192.method4378(local588);
					local192.method4378(local604);
					local192.method4378(255 - (this.aByteArray99[local449] & 0xFF));
				}
			} else {
				for (local200 = 0; local200 < this.anInt9238; local200++) {
					local209 = this.method7623(this.aShort113, this.aByteArray99[local200], this.aShortArray115[local200], this.aShortArray114[local200]);
					local192.anInt5238 = local103 * this.aShortArray124[local200] + local107;
					local192.method4421(local209);
					local192.anInt5238 = local103 * this.aShortArray116[local200] + local107;
					local192.method4421(local209);
					local192.anInt5238 = local103 * this.aShortArray118[local200] + local107;
					local192.method4421(local209);
				}
			}
		}
		if (local27) {
			if (this.aClass83_1 == null) {
				local381 = this.aShortArray121;
				local384 = this.aShortArray122;
				local378 = this.aByteArray100;
				local387 = this.aShortArray119;
			} else {
				local387 = this.aClass83_1.aShortArray33;
				local384 = this.aClass83_1.aShortArray35;
				local381 = this.aClass83_1.aShortArray34;
				local378 = this.aClass83_1.aByteArray20;
			}
			@Pc(1116) float local1116 = 3.0F / (float) this.aShort115;
			local192.anInt5238 = local114;
			local538 = 3.0F / (float) (this.aShort115 / 2 + this.aShort115);
			if (this.aClass12_Sub1_39.aBoolean23) {
				for (local237 = 0; local237 < this.anInt9228; local237++) {
					local246 = local378[local237] & 0xFF;
					if (local246 == 0) {
						local192.method4440((float) local381[local237] * local538);
						local192.method4440((float) local387[local237] * local538);
						local192.method4440((float) local384[local237] * local538);
					} else {
						local480 = local1116 / (float) local246;
						local192.method4440((float) local381[local237] * local480);
						local192.method4440((float) local387[local237] * local480);
						local192.method4440(local480 * (float) local384[local237]);
					}
					local192.anInt5238 += local103 - 12;
				}
			} else {
				for (local237 = 0; local237 < this.anInt9228; local237++) {
					local246 = local378[local237] & 0xFF;
					if (local246 == 0) {
						local192.method4438(local538 * (float) local381[local237]);
						local192.method4438(local538 * (float) local387[local237]);
						local192.method4438(local538 * (float) local384[local237]);
					} else {
						local480 = local1116 / (float) local246;
						local192.method4438(local480 * (float) local381[local237]);
						local192.method4438(local480 * (float) local387[local237]);
						local192.method4438(local480 * (float) local384[local237]);
					}
					local192.anInt5238 += local103 - 12;
				}
			}
		}
		if (local49) {
			local192.anInt5238 = local116;
			if (this.aClass12_Sub1_39.aBoolean23) {
				for (local200 = 0; local200 < this.anInt9228; local200++) {
					local192.method4440(this.aFloatArray72[local200]);
					local192.method4440(this.aFloatArray73[local200]);
					local192.anInt5238 += local103 - 8;
				}
			} else {
				for (local200 = 0; local200 < this.anInt9228; local200++) {
					local192.method4438(this.aFloatArray72[local200]);
					local192.method4438(this.aFloatArray73[local200]);
					local192.anInt5238 += local103 - 8;
				}
			}
		}
		local192.anInt5238 = this.anInt9228 * local103;
		@Pc(1436) Interface1 local1436;
		if (arg0) {
			if (this.anInterface1_6 == null) {
				this.anInterface1_6 = this.aClass12_Sub1_39.method409(local192.aByteArray52, local192.anInt5238, true, local103);
			} else {
				this.anInterface1_6.method1699(local192.anInt5238, local192.aByteArray52, local103);
			}
			local1436 = this.anInterface1_6;
			this.aByte120 = 0;
		} else {
			local1436 = this.aClass12_Sub1_39.method409(local192.aByteArray52, local192.anInt5238, false, local103);
			this.aBoolean672 = true;
		}
		if (local38) {
			this.aClass97_14.aByte38 = 0;
			this.aClass97_14.anInterface1_4 = local1436;
		}
		if (local49) {
			this.aClass97_13.anInterface1_4 = local1436;
			this.aClass97_13.aByte38 = local116;
		}
		if (local16) {
			this.aClass97_12.anInterface1_4 = local1436;
			this.aClass97_12.aByte38 = local107;
		}
		if (local27) {
			this.aClass97_11.anInterface1_4 = local1436;
			this.aClass97_11.aByte38 = local114;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	private void method7614() {
		if (this.aClass89Array1 == null) {
			return;
		}
		@Pc(12) Class209_Sub3 local12 = this.aClass12_Sub1_39.aClass209_Sub3_2;
		this.aClass12_Sub1_39.method453();
		this.aClass12_Sub1_39.ZA(false);
		this.aClass12_Sub1_39.method454(false);
		this.aClass12_Sub1_39.method428(this.aClass12_Sub1_39.aClass97_2, null, null, this.aClass12_Sub1_39.aClass97_1);
		for (@Pc(39) int local39 = 0; local39 < this.anInt9195; local39++) {
			@Pc(46) Class89 local46 = this.aClass89Array1[local39];
			@Pc(51) Class54 local51 = this.aClass54Array1[local39];
			if (!local46.aBoolean188 || !this.aClass12_Sub1_39.method6451()) {
				@Pc(79) float local79 = (float) (this.anIntArray615[local46.anInt2510] + this.anIntArray615[local46.anInt2511] + this.anIntArray615[local46.anInt2515]) * 0.3333333F;
				@Pc(100) float local100 = (float) (this.anIntArray616[local46.anInt2510] + this.anIntArray616[local46.anInt2511] + this.anIntArray616[local46.anInt2515]) * 0.3333333F;
				@Pc(121) float local121 = (float) (this.anIntArray613[local46.anInt2510] + this.anIntArray613[local46.anInt2511] + this.anIntArray613[local46.anInt2515]) * 0.3333333F;
				@Pc(135) float local135 = Static300.aFloat123 + Static386.aFloat173 * local121 + local79 * Static452.aFloat205 + Static167.aFloat66 * local100;
				@Pc(149) float local149 = Static593.aFloat214 + Static280.aFloat117 * local121 + Static96.aFloat40 * local79 + Static146.aFloat62 * local100;
				@Pc(163) float local163 = Static469.aFloat207 * local121 + Static349.aFloat156 * local79 + local100 * Static479.aFloat209 + Static108.aFloat181;
				local12.method5488((float) local51.anInt1805 - local149, -local163 + (float) local46.anInt2512, local51.anInt1809, local135 + (float) local51.anInt1810, local46.aShort31 * local51.anInt1813 >> 7, local51.anInt1815 * local46.aShort32 >> 7);
				this.aClass12_Sub1_39.method414(local12);
				@Pc(206) int local206 = local51.anInt1811;
				OpenGL.glColor4ub((byte) (local206 >> 16), (byte) (local206 >> 8), (byte) local206, (byte) (local206 >> 24));
				this.aClass12_Sub1_39.method444(local46.aShort33);
				this.aClass12_Sub1_39.method395(local46.aByte37);
				this.aClass12_Sub1_39.method442(4);
			}
		}
		this.aClass12_Sub1_39.ZA(true);
		this.aClass12_Sub1_39.method402();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7588(@OriginalArg(0) Class209 arg0) {
		@Pc(8) Class209_Sub3 local8 = (Class209_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass219Array5 != null) {
			for (local13 = 0; local13 < this.aClass219Array5.length; local13++) {
				@Pc(20) Class219 local20 = this.aClass219Array5[local13];
				@Pc(22) Class219 local22 = local20;
				if (local20.aClass219_1 != null) {
					local22 = local20.aClass219_1;
				}
				local22.anInt5917 = (int) (local8.aFloat162 + (float) this.anIntArray613[local20.anInt5927] * local8.aFloat167 + (float) this.anIntArray616[local20.anInt5927] * local8.aFloat163 + local8.aFloat164 * (float) this.anIntArray615[local20.anInt5927]);
				local22.anInt5910 = (int) (local8.aFloat171 + (float) this.anIntArray613[local20.anInt5927] * local8.aFloat168 + local8.aFloat165 * (float) this.anIntArray615[local20.anInt5927] + (float) this.anIntArray616[local20.anInt5927] * local8.aFloat161);
				local22.anInt5926 = (int) (local8.aFloat170 + local8.aFloat172 * (float) this.anIntArray613[local20.anInt5927] + (float) this.anIntArray616[local20.anInt5927] * local8.aFloat166 + (float) this.anIntArray615[local20.anInt5927] * local8.aFloat169);
				local22.anInt5912 = (int) ((float) this.anIntArray613[local20.anInt5924] * local8.aFloat167 + local8.aFloat163 * (float) this.anIntArray616[local20.anInt5924] + local8.aFloat164 * (float) this.anIntArray615[local20.anInt5924] + local8.aFloat162);
				local22.anInt5919 = (int) (local8.aFloat171 + (float) this.anIntArray616[local20.anInt5924] * local8.aFloat161 + local8.aFloat165 * (float) this.anIntArray615[local20.anInt5924] + (float) this.anIntArray613[local20.anInt5924] * local8.aFloat168);
				local22.anInt5918 = (int) (local8.aFloat166 * (float) this.anIntArray616[local20.anInt5924] + local8.aFloat169 * (float) this.anIntArray615[local20.anInt5924] + local8.aFloat172 * (float) this.anIntArray613[local20.anInt5924] + local8.aFloat170);
				local22.anInt5915 = (int) (local8.aFloat167 * (float) this.anIntArray613[local20.anInt5916] + (float) this.anIntArray616[local20.anInt5916] * local8.aFloat163 + local8.aFloat164 * (float) this.anIntArray615[local20.anInt5916] + local8.aFloat162);
				local22.anInt5914 = (int) (local8.aFloat171 + local8.aFloat168 * (float) this.anIntArray613[local20.anInt5916] + local8.aFloat161 * (float) this.anIntArray616[local20.anInt5916] + local8.aFloat165 * (float) this.anIntArray615[local20.anInt5916]);
				local22.anInt5925 = (int) (local8.aFloat166 * (float) this.anIntArray616[local20.anInt5916] + local8.aFloat169 * (float) this.anIntArray615[local20.anInt5916] + local8.aFloat172 * (float) this.anIntArray613[local20.anInt5916] + local8.aFloat170);
			}
		}
		if (this.aClass101Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass101Array5.length; local13++) {
			@Pc(365) Class101 local365 = this.aClass101Array5[local13];
			@Pc(367) Class101 local367 = local365;
			if (local365.aClass101_1 != null) {
				local367 = local365.aClass101_1;
			}
			if (local365.aClass209_2 == null) {
				local365.aClass209_2 = local8.method6362();
			} else {
				local365.aClass209_2.M(local8);
			}
			local367.anInt2801 = (int) (local8.aFloat163 * (float) this.anIntArray616[local365.anInt2803] + local8.aFloat164 * (float) this.anIntArray615[local365.anInt2803] + local8.aFloat167 * (float) this.anIntArray613[local365.anInt2803] + local8.aFloat162);
			local367.anInt2805 = (int) (local8.aFloat171 + (float) this.anIntArray615[local365.anInt2803] * local8.aFloat165 + local8.aFloat161 * (float) this.anIntArray616[local365.anInt2803] + local8.aFloat168 * (float) this.anIntArray613[local365.anInt2803]);
			local367.anInt2802 = (int) (local8.aFloat172 * (float) this.anIntArray613[local365.anInt2803] + local8.aFloat169 * (float) this.anIntArray615[local365.anInt2803] + local8.aFloat166 * (float) this.anIntArray616[local365.anInt2803] + local8.aFloat170);
		}
	}

	@OriginalMember(owner = "client!vp", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9199; local3++) {
			if (arg0 != 128) {
				this.anIntArray615[local3] = arg0 * this.anIntArray615[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray616[local3] = this.anIntArray616[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray613[local3] = this.anIntArray613[local3] * arg2 >> 7;
			}
		}
		this.aBoolean670 = false;
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9199; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray613[local15] + local13 * this.anIntArray615[local15] >> 14;
			this.anIntArray613[local15] = local13 * this.anIntArray613[local15] - this.anIntArray615[local15] * local9 >> 14;
			this.anIntArray615[local15] = local34;
		}
		this.aBoolean670 = false;
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort112;
	}

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static107.anInt2175 = 0;
			local29 = 0;
			Static307.anInt5539 = 0;
			Static71.anInt1683 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray58.length > local41) {
					local55 = this.anIntArrayArray58[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray123 == null || (this.aShortArray123[local63] & arg6) != 0) {
							Static307.anInt5539 += this.anIntArray615[local63];
							Static71.anInt1683 += this.anIntArray616[local63];
							local29++;
							Static107.anInt2175 += this.anIntArray613[local63];
						}
					}
				}
			}
			if (local29 > 0) {
				Static93.aBoolean164 = true;
				Static107.anInt2175 = Static107.anInt2175 / local29 + arg4;
				Static307.anInt5539 = Static307.anInt5539 / local29 + arg2;
				Static71.anInt1683 = Static71.anInt1683 / local29 + arg3;
			} else {
				Static307.anInt5539 = arg2;
				Static107.anInt2175 = arg4;
				Static71.anInt1683 = arg3;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[2] * arg4 + arg2 * arg7[0] + arg7[1] * arg3 + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg2 * arg7[6] + arg7[7] * arg3 + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local29;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray58.length > local35) {
					local248 = this.anIntArrayArray58[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local57 = local248[local250];
						if (this.aShortArray123 == null || (arg6 & this.aShortArray123[local57]) != 0) {
							this.anIntArray615[local57] += arg2;
							this.anIntArray616[local57] += arg3;
							this.anIntArray613[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(400) int local400;
		@Pc(627) int local627;
		@Pc(636) int local636;
		@Pc(649) int local649;
		@Pc(653) int local653;
		@Pc(671) int local671;
		@Pc(1015) int local1015;
		@Pc(1023) int local1023;
		@Pc(1179) int local1179;
		@Pc(1205) int local1205;
		@Pc(1210) int local1210;
		@Pc(1219) int local1219;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1234) int local1234;
		@Pc(1363) int[] local1363;
		@Pc(1365) int local1365;
		@Pc(1369) int local1369;
		@Pc(1373) int local1373;
		@Pc(1375) int local1375;
		@Pc(1505) int local1505;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray58.length) {
						local248 = this.anIntArrayArray58[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local57 = local248[local250];
							if (this.aShortArray123 == null || (arg6 & this.aShortArray123[local57]) != 0) {
								this.anIntArray615[local57] -= Static307.anInt5539;
								this.anIntArray616[local57] -= Static71.anInt1683;
								this.anIntArray613[local57] -= Static107.anInt2175;
								if (arg4 != 0) {
									local63 = Class151.anIntArray244[arg4];
									local382 = Class151.anIntArray245[arg4];
									local400 = this.anIntArray616[local57] * local63 + this.anIntArray615[local57] * local382 + 16383 >> 14;
									this.anIntArray616[local57] = this.anIntArray616[local57] * local382 + 16383 - local63 * this.anIntArray615[local57] >> 14;
									this.anIntArray615[local57] = local400;
								}
								if (arg2 != 0) {
									local63 = Class151.anIntArray244[arg2];
									local382 = Class151.anIntArray245[arg2];
									local400 = this.anIntArray616[local57] * local382 + 16383 - local63 * this.anIntArray613[local57] >> 14;
									this.anIntArray613[local57] = this.anIntArray616[local57] * local63 + local382 * this.anIntArray613[local57] + 16383 >> 14;
									this.anIntArray616[local57] = local400;
								}
								if (arg3 != 0) {
									local63 = Class151.anIntArray244[arg3];
									local382 = Class151.anIntArray245[arg3];
									local400 = local382 * this.anIntArray615[local57] + this.anIntArray613[local57] * local63 + 16383 >> 14;
									this.anIntArray613[local57] = this.anIntArray613[local57] * local382 + 16383 - this.anIntArray615[local57] * local63 >> 14;
									this.anIntArray615[local57] = local400;
								}
								this.anIntArray615[local57] += Static307.anInt5539;
								this.anIntArray616[local57] += Static71.anInt1683;
								this.anIntArray613[local57] += Static107.anInt2175;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray58.length) {
							local55 = this.anIntArrayArray58[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray123 == null || (this.aShortArray123[local63] & arg6) != 0) {
									local382 = this.anIntArray617[local63];
									local400 = this.anIntArray617[local63 + 1];
									for (local627 = local382; local627 < local400; local627++) {
										local636 = this.aShortArray117[local627] - 1;
										if (local636 == -1) {
											break;
										}
										if (arg4 != 0) {
											local649 = Class151.anIntArray244[arg4];
											local653 = Class151.anIntArray245[arg4];
											local671 = this.aShortArray121[local636] * local653 + local649 * this.aShortArray119[local636] + 16383 >> 14;
											this.aShortArray119[local636] = (short) (local653 * this.aShortArray119[local636] + 16383 - local649 * this.aShortArray121[local636] >> 14);
											this.aShortArray121[local636] = (short) local671;
										}
										if (arg2 != 0) {
											local649 = Class151.anIntArray244[arg2];
											local653 = Class151.anIntArray245[arg2];
											local671 = local653 * this.aShortArray119[local636] + 16383 - local649 * this.aShortArray122[local636] >> 14;
											this.aShortArray122[local636] = (short) (this.aShortArray119[local636] * local649 + this.aShortArray122[local636] * local653 + 16383 >> 14);
											this.aShortArray119[local636] = (short) local671;
										}
										if (arg3 != 0) {
											local649 = Class151.anIntArray244[arg3];
											local653 = Class151.anIntArray245[arg3];
											local671 = this.aShortArray121[local636] * local653 + this.aShortArray122[local636] * local649 + 16383 >> 14;
											this.aShortArray122[local636] = (short) (local653 * this.aShortArray122[local636] + 16383 - local649 * this.aShortArray121[local636] >> 14);
											this.aShortArray121[local636] = (short) local671;
										}
									}
								}
							}
						}
					}
					if (this.aClass97_11 == null && this.aClass97_12 != null) {
						this.aClass97_12.anInterface1_4 = null;
					}
					if (this.aClass97_11 != null) {
						this.aClass97_11.anInterface1_4 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static93.aBoolean164) {
					local382 = Static307.anInt5539 * arg7[0] + Static71.anInt1683 * arg7[3] + arg7[6] * Static107.anInt2175 + 8192 >> 14;
					local400 = arg7[7] * Static107.anInt2175 + Static307.anInt5539 * arg7[1] + arg7[4] * Static71.anInt1683 + 8192 >> 14;
					local382 += local250;
					local400 += local57;
					local627 = arg7[2] * Static307.anInt5539 + arg7[5] * Static71.anInt1683 + Static107.anInt2175 * arg7[8] + 8192 >> 14;
					Static307.anInt5539 = local382;
					local627 += local63;
					Static71.anInt1683 = local400;
					Static93.aBoolean164 = false;
					Static107.anInt2175 = local627;
				}
				@Pc(983) int[] local983 = new int[9];
				local400 = Class151.anIntArray245[arg2];
				local627 = Class151.anIntArray244[arg2];
				local636 = Class151.anIntArray245[arg3];
				local649 = Class151.anIntArray244[arg3];
				local653 = Class151.anIntArray245[arg4];
				local671 = Class151.anIntArray244[arg4];
				local1015 = local653 * local627 + 8192 >> 14;
				local1023 = local627 * local671 + 8192 >> 14;
				local983[7] = local636 * local1015 + local671 * local649 + 8192 >> 14;
				local983[8] = local400 * local636 + 8192 >> 14;
				local983[5] = -local627;
				local983[3] = local671 * local400 + 8192 >> 14;
				local983[6] = -local649 * local653 + local1023 * local636 + 8192 >> 14;
				local983[2] = local400 * local649 + 8192 >> 14;
				local983[0] = local636 * local653 + local649 * local1023 + 8192 >> 14;
				local983[4] = local400 * local653 + 8192 >> 14;
				local983[1] = -local636 * local671 + local1015 * local649 + 8192 >> 14;
				@Pc(1153) int local1153 = -Static107.anInt2175 * local983[2] + -Static307.anInt5539 * local983[0] + local983[1] * -Static71.anInt1683 + 8192 >> 14;
				local1179 = local983[4] * -Static71.anInt1683 + local983[3] * -Static307.anInt5539 + local983[5] * -Static107.anInt2175 + 8192 >> 14;
				local1205 = -Static107.anInt2175 * local983[8] + -Static307.anInt5539 * local983[6] + -Static71.anInt1683 * local983[7] + 8192 >> 14;
				local1210 = local1153 + Static307.anInt5539;
				@Pc(1215) int local1215 = local1179 + Static71.anInt1683;
				local1219 = Static107.anInt2175 + local1205;
				@Pc(1222) int[] local1222 = new int[9];
				for (local1224 = 0; local1224 < 3; local1224++) {
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1232 = 0;
						for (local1234 = 0; local1234 < 3; local1234++) {
							local1232 += local983[local1224 * 3 + local1234] * arg7[local1234 + local1228 * 3];
						}
						local1222[local1228 + local1224 * 3] = local1232 + 8192 >> 14;
					}
				}
				local1228 = local983[1] * local57 + local250 * local983[0] + local63 * local983[2] + 8192 >> 14;
				local1232 = local63 * local983[5] + local57 * local983[4] + local983[3] * local250 + 8192 >> 14;
				local1234 = local983[8] * local63 + local983[6] * local250 + local983[7] * local57 + 8192 >> 14;
				local1228 += local1210;
				local1232 += local1215;
				local1234 += local1219;
				local1363 = new int[9];
				for (local1365 = 0; local1365 < 3; local1365++) {
					for (local1369 = 0; local1369 < 3; local1369++) {
						local1373 = 0;
						for (local1375 = 0; local1375 < 3; local1375++) {
							local1373 += arg7[local1365 * 3 + local1375] * local1222[local1375 * 3 + local1369];
						}
						local1363[local1369 + local1365 * 3] = local1373 + 8192 >> 14;
					}
				}
				local1369 = arg7[2] * local1234 + local1228 * arg7[0] + local1232 * arg7[1] + 8192 >> 14;
				local1373 = arg7[4] * local1232 + local1228 * arg7[3] + arg7[5] * local1234 + 8192 >> 14;
				local1369 += local29;
				local1375 = arg7[8] * local1234 + local1232 * arg7[7] + arg7[6] * local1228 + 8192 >> 14;
				local1373 += local35;
				local1375 += local41;
				for (local1505 = 0; local1505 < local8; local1505++) {
					@Pc(1511) int local1511 = arg1[local1505];
					if (local1511 < this.anIntArrayArray58.length) {
						@Pc(1521) int[] local1521 = this.anIntArrayArray58[local1511];
						for (@Pc(1523) int local1523 = 0; local1523 < local1521.length; local1523++) {
							@Pc(1529) int local1529 = local1521[local1523];
							if (this.aShortArray123 == null || (arg6 & this.aShortArray123[local1529]) != 0) {
								@Pc(1570) int local1570 = this.anIntArray613[local1529] * local1363[2] + local1363[1] * this.anIntArray616[local1529] + this.anIntArray615[local1529] * local1363[0] + 8192 >> 14;
								@Pc(1602) int local1602 = local1363[5] * this.anIntArray613[local1529] + this.anIntArray615[local1529] * local1363[3] + this.anIntArray616[local1529] * local1363[4] + 8192 >> 14;
								@Pc(1633) int local1633 = this.anIntArray616[local1529] * local1363[7] + local1363[6] * this.anIntArray615[local1529] + this.anIntArray613[local1529] * local1363[8] + 8192 >> 14;
								@Pc(1637) int local1637 = local1570 + local1369;
								@Pc(1641) int local1641 = local1602 + local1373;
								@Pc(1645) int local1645 = local1633 + local1375;
								this.anIntArray615[local1529] = local1637;
								this.anIntArray616[local1529] = local1641;
								this.anIntArray613[local1529] = local1645;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2574) Class89 local2574;
			@Pc(2579) Class54 local2579;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray59.length) {
							local248 = this.anIntArrayArray59[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local57 = local248[local250];
								if (this.aShortArray120 == null || (arg6 & this.aShortArray120[local57]) != 0) {
									local63 = arg2 * 8 + (this.aByteArray99[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray99[local57] = (byte) local63;
									if (this.aClass97_12 != null) {
										this.aClass97_12.anInterface1_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass89Array1 != null) {
						for (local35 = 0; local35 < this.anInt9195; local35++) {
							local2574 = this.aClass89Array1[local35];
							local2579 = this.aClass54Array1[local35];
							local2579.anInt1811 = local2579.anInt1811 & 0xFFFFFF | 255 - (this.aByteArray99[local2574.anInt2516] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2833) Class54 local2833;
				if (arg0 == 8) {
					if (this.anIntArrayArray60 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray60.length > local35) {
								local248 = this.anIntArrayArray60[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2833 = this.aClass54Array1[local248[local250]];
									local2833.anInt1805 += arg3;
									local2833.anInt1810 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray60 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray60.length) {
								local248 = this.anIntArrayArray60[local35];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2833 = this.aClass54Array1[local248[local250]];
									local2833.anInt1813 = arg2 * local2833.anInt1813 >> 7;
									local2833.anInt1815 = local2833.anInt1815 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray60 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray60.length) {
							local248 = this.anIntArrayArray60[local35];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2833 = this.aClass54Array1[local248[local250]];
								local2833.anInt1809 = local2833.anInt1809 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray59 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray59.length) {
						local248 = this.anIntArrayArray59[local35];
						for (local250 = 0; local250 < local248.length; local250++) {
							local57 = local248[local250];
							if (this.aShortArray120 == null || (arg6 & this.aShortArray120[local57]) != 0) {
								local63 = this.aShortArray114[local57] & 0xFFFF;
								local382 = local63 >> 10 & 0x3F;
								local400 = local63 >> 7 & 0x7;
								local400 += arg3 / 4;
								local627 = local63 & 0x7F;
								@Pc(2688) int local2688 = local382 + arg2 & 0x3F;
								if (local400 < 0) {
									local400 = 0;
								} else if (local400 > 7) {
									local400 = 7;
								}
								local627 += arg4;
								if (local627 < 0) {
									local627 = 0;
								} else if (local627 > 127) {
									local627 = 127;
								}
								this.aShortArray114[local57] = (short) (local627 | local400 << 7 | local2688 << 10);
								if (this.aClass97_12 != null) {
									this.aClass97_12.anInterface1_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass89Array1 != null) {
					for (local35 = 0; local35 < this.anInt9195; local35++) {
						local2574 = this.aClass89Array1[local35];
						local2579 = this.aClass54Array1[local35];
						local2579.anInt1811 = Static279.anIntArray313[this.aShortArray114[local2574.anInt2516] & 0xFFFF] & 0xFFFFFF | local2579.anInt1811 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray58.length > local35) {
					local248 = this.anIntArrayArray58[local35];
					for (local250 = 0; local250 < local248.length; local250++) {
						local57 = local248[local250];
						if (this.aShortArray123 == null || (this.aShortArray123[local57] & arg6) != 0) {
							this.anIntArray615[local57] -= Static307.anInt5539;
							this.anIntArray616[local57] -= Static71.anInt1683;
							this.anIntArray613[local57] -= Static107.anInt2175;
							this.anIntArray615[local57] = arg2 * this.anIntArray615[local57] >> 7;
							this.anIntArray616[local57] = this.anIntArray616[local57] * arg3 >> 7;
							this.anIntArray613[local57] = arg4 * this.anIntArray613[local57] >> 7;
							this.anIntArray615[local57] += Static307.anInt5539;
							this.anIntArray616[local57] += Static71.anInt1683;
							this.anIntArray613[local57] += Static107.anInt2175;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static93.aBoolean164) {
				local382 = arg7[0] * Static307.anInt5539 + Static71.anInt1683 * arg7[3] + Static107.anInt2175 * arg7[6] + 8192 >> 14;
				local400 = arg7[7] * Static107.anInt2175 + Static71.anInt1683 * arg7[4] + Static307.anInt5539 * arg7[1] + 8192 >> 14;
				local382 += local250;
				local627 = arg7[5] * Static71.anInt1683 + Static307.anInt5539 * arg7[2] + arg7[8] * Static107.anInt2175 + 8192 >> 14;
				local400 += local57;
				local627 += local63;
				Static307.anInt5539 = local382;
				Static71.anInt1683 = local400;
				Static107.anInt2175 = local627;
				Static93.aBoolean164 = false;
			}
			local382 = arg2 << 15 >> 7;
			local400 = arg3 << 15 >> 7;
			local627 = arg4 << 15 >> 7;
			local636 = -Static307.anInt5539 * local382 + 8192 >> 14;
			local649 = -Static71.anInt1683 * local400 + 8192 >> 14;
			local653 = local627 * -Static107.anInt2175 + 8192 >> 14;
			local671 = local636 + Static307.anInt5539;
			local1015 = Static71.anInt1683 + local649;
			local1023 = local653 + Static107.anInt2175;
			@Pc(2001) int[] local2001 = new int[] { local382 * arg7[0] + 8192 >> 14, local382 * arg7[3] + 8192 >> 14, local382 * arg7[6] + 8192 >> 14, arg7[1] * local400 + 8192 >> 14, local400 * arg7[4] + 8192 >> 14, arg7[7] * local400 + 8192 >> 14, local627 * arg7[2] + 8192 >> 14, local627 * arg7[5] + 8192 >> 14, arg7[8] * local627 + 8192 >> 14 };
			local1179 = local250 * local382 + 8192 >> 14;
			local1205 = local57 * local400 + 8192 >> 14;
			@Pc(2129) int local2129 = local1179 + local671;
			local1210 = local63 * local627 + 8192 >> 14;
			@Pc(2141) int local2141 = local1205 + local1015;
			@Pc(2145) int local2145 = local1210 + local1023;
			@Pc(2148) int[] local2148 = new int[9];
			@Pc(2154) int local2154;
			for (local1219 = 0; local1219 < 3; local1219++) {
				for (local2154 = 0; local2154 < 3; local2154++) {
					local1224 = 0;
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1224 += arg7[local1219 * 3 + local1228] * local2001[local1228 * 3 + local2154];
					}
					local2148[local1219 * 3 + local2154] = local1224 + 8192 >> 14;
				}
			}
			local2154 = local2129 * arg7[0] + local2141 * arg7[1] + local2145 * arg7[2] + 8192 >> 14;
			local1224 = arg7[3] * local2129 + arg7[4] * local2141 + local2145 * arg7[5] + 8192 >> 14;
			local1228 = arg7[6] * local2129 + arg7[7] * local2141 + local2145 * arg7[8] + 8192 >> 14;
			local1224 += local35;
			local2154 += local29;
			local1228 += local41;
			for (local1232 = 0; local1232 < local8; local1232++) {
				local1234 = arg1[local1232];
				if (local1234 < this.anIntArrayArray58.length) {
					local1363 = this.anIntArrayArray58[local1234];
					for (local1365 = 0; local1365 < local1363.length; local1365++) {
						local1369 = local1363[local1365];
						if (this.aShortArray123 == null || (this.aShortArray123[local1369] & arg6) != 0) {
							local1373 = local2148[2] * this.anIntArray613[local1369] + local2148[0] * this.anIntArray615[local1369] + local2148[1] * this.anIntArray616[local1369] + 8192 >> 14;
							local1375 = local2148[3] * this.anIntArray615[local1369] + this.anIntArray616[local1369] * local2148[4] + this.anIntArray613[local1369] * local2148[5] + 8192 >> 14;
							@Pc(2398) int local2398 = local1373 + local2154;
							@Pc(2402) int local2402 = local1375 + local1224;
							local1505 = local2148[7] * this.anIntArray616[local1369] + this.anIntArray615[local1369] * local2148[6] + this.anIntArray613[local1369] * local2148[8] + 8192 >> 14;
							@Pc(2438) int local2438 = local1505 + local1228;
							this.anIntArray615[local1369] = local2398;
							this.anIntArray616[local1369] = local2402;
							this.anIntArray613[local1369] = local2438;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "()Z")
	@Override
	public boolean method7602() {
		if (this.aShortArray115 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray115.length; local12++) {
			if (this.aShortArray115[local12] != -1 && !this.aClass12_Sub1_39.anInterface5_10.method4045(this.aShortArray115[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9199; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray615[local15] + local9 * this.anIntArray616[local15] >> 14;
			this.anIntArray616[local15] = this.anIntArray616[local15] * local13 - this.anIntArray615[local15] * local9 >> 14;
			this.anIntArray615[local15] = local33;
		}
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
		this.aBoolean670 = false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7609(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class61_Sub3 local8 = (Class61_Sub3) arg0;
		if (this.anInt9238 == 0 || local8.anInt9238 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt9199;
		@Pc(21) int[] local21 = local8.anIntArray615;
		@Pc(24) int[] local24 = local8.anIntArray616;
		@Pc(27) int[] local27 = local8.anIntArray613;
		@Pc(30) short[] local30 = local8.aShortArray121;
		@Pc(33) short[] local33 = local8.aShortArray119;
		@Pc(36) short[] local36 = local8.aShortArray122;
		@Pc(39) byte[] local39 = local8.aByteArray100;
		@Pc(54) short[] local54;
		@Pc(58) short[] local58;
		@Pc(50) short[] local50;
		@Pc(46) byte[] local46;
		if (this.aClass83_1 == null) {
			local50 = null;
			local46 = null;
			local54 = null;
			local58 = null;
		} else {
			local46 = this.aClass83_1.aByteArray20;
			local50 = this.aClass83_1.aShortArray35;
			local54 = this.aClass83_1.aShortArray34;
			local58 = this.aClass83_1.aShortArray33;
		}
		@Pc(77) short[] local77;
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(73) byte[] local73;
		if (local8.aClass83_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local77 = local8.aClass83_1.aShortArray34;
			local73 = local8.aClass83_1.aByteArray20;
			local79 = local8.aClass83_1.aShortArray33;
			local75 = local8.aClass83_1.aShortArray35;
		}
		@Pc(100) int[] local100 = local8.anIntArray617;
		@Pc(103) short[] local103 = local8.aShortArray117;
		if (!local8.aBoolean670) {
			local8.method7616();
		}
		@Pc(112) short local112 = local8.aShort112;
		@Pc(115) short local115 = local8.aShort116;
		@Pc(118) short local118 = local8.aShort118;
		@Pc(121) short local121 = local8.aShort119;
		@Pc(124) short local124 = local8.aShort111;
		@Pc(127) short local127 = local8.aShort117;
		for (@Pc(129) int local129 = 0; local129 < this.anInt9199; local129++) {
			@Pc(138) int local138 = this.anIntArray616[local129] - arg2;
			if (local112 <= local138 && local115 >= local138) {
				@Pc(162) int local162 = this.anIntArray615[local129] - arg1;
				if (local118 <= local162 && local162 <= local121) {
					@Pc(177) int local177 = this.anIntArray613[local129] - arg3;
					if (local124 <= local177 && local177 <= local127) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray617[local129];
						@Pc(203) int local203 = this.anIntArray617[local129 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray117[local205] - 1;
							if (local191 == -1 || this.aByteArray100[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(237) int local237 = 0; local237 < local18; local237++) {
								if (local162 == local21[local237] && local27[local237] == local177 && local138 == local24[local237]) {
									@Pc(260) int local260 = -1;
									local203 = local100[local237 + 1];
									local196 = local100[local237];
									for (@Pc(272) int local272 = local196; local272 < local203; local272++) {
										local260 = local103[local272] - 1;
										if (local260 == -1 || local39[local260] != 0) {
											break;
										}
									}
									if (local260 != -1) {
										if (local54 == null) {
											this.aClass83_1 = new Class83();
											local54 = this.aClass83_1.aShortArray34 = Static420.method6360(this.aShortArray121);
											local58 = this.aClass83_1.aShortArray33 = Static420.method6360(this.aShortArray119);
											local50 = this.aClass83_1.aShortArray35 = Static420.method6360(this.aShortArray122);
											local46 = this.aClass83_1.aByteArray20 = Static121.method2075(this.aByteArray100);
										}
										if (local77 == null) {
											@Pc(354) Class83 local354 = local8.aClass83_1 = new Class83();
											local77 = local354.aShortArray34 = Static420.method6360(local30);
											local79 = local354.aShortArray33 = Static420.method6360(local33);
											local75 = local354.aShortArray35 = Static420.method6360(local36);
											local73 = local354.aByteArray20 = Static121.method2075(local39);
										}
										@Pc(387) short local387 = this.aShortArray121[local191];
										@Pc(392) short local392 = this.aShortArray119[local191];
										@Pc(397) short local397 = this.aShortArray122[local191];
										local203 = local100[local237 + 1];
										local196 = local100[local237];
										@Pc(412) byte local412 = this.aByteArray100[local191];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local196; local414 < local203; local414++) {
											local422 = local103[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local73[local422] != 0) {
												local77[local422] += local387;
												local79[local422] += local392;
												local75[local422] += local397;
												local73[local422] += local412;
											}
										}
										local196 = this.anIntArray617[local129];
										local203 = this.anIntArray617[local129 + 1];
										local387 = local30[local260];
										local397 = local36[local260];
										local412 = local39[local260];
										local392 = local33[local260];
										for (local422 = local196; local422 < local203; local422++) {
											@Pc(508) int local508 = this.aShortArray117[local422] - 1;
											if (local508 == -1) {
												break;
											}
											if (local46[local508] != 0) {
												local54[local508] += local387;
												local58[local508] += local392;
												local50[local508] += local397;
												local46[local508] += local412;
											}
										}
										if (this.aClass97_11 == null && this.aClass97_12 != null) {
											this.aClass97_12.anInterface1_4 = null;
										}
										if (this.aClass97_11 != null) {
											this.aClass97_11.anInterface1_4 = null;
										}
										if (local8.aClass97_11 == null && local8.aClass97_12 != null) {
											local8.aClass97_12.anInterface1_4 = null;
										}
										if (local8.aClass97_11 != null) {
											local8.aClass97_11.anInterface1_4 = null;
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

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!cca;IFIFIIJ)S")
	private short method7615(@OriginalArg(1) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray617[arg0];
		@Pc(17) int local17 = this.anIntArray617[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray117[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static15.aLongArray1[local21] == arg8) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray117[local19] = (short) (this.anInt9228 + 1);
		Static15.aLongArray1[local19] = arg8;
		this.aShortArray121[this.anInt9228] = (short) arg7;
		this.aShortArray119[this.anInt9228] = (short) arg6;
		this.aShortArray122[this.anInt9228] = (short) arg4;
		this.aByteArray100[this.anInt9228] = (byte) arg2;
		this.aFloatArray72[this.anInt9228] = arg5;
		this.aFloatArray73[this.anInt9228] = arg3;
		return (short) this.anInt9228++;
	}

	@OriginalMember(owner = "client!vp", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static307.anInt5539 = 0;
			Static107.anInt2175 = 0;
			Static71.anInt1683 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt9199; local20++) {
				Static307.anInt5539 += this.anIntArray615[local20];
				Static71.anInt1683 += this.anIntArray616[local20];
				Static107.anInt2175 += this.anIntArray613[local20];
				local18++;
			}
			if (local18 <= 0) {
				Static107.anInt2175 = arg3;
				Static307.anInt5539 = arg1;
				Static71.anInt1683 = arg2;
			} else {
				Static71.anInt1683 = arg2 + Static71.anInt1683 / local18;
				Static307.anInt5539 = Static307.anInt5539 / local18 + arg1;
				Static107.anInt2175 = arg3 + Static107.anInt2175 / local18;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt9199; local18++) {
				this.anIntArray615[local18] += arg1;
				this.anIntArray616[local18] += arg2;
				this.anIntArray613[local18] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt9199; local18++) {
					this.anIntArray615[local18] -= Static307.anInt5539;
					this.anIntArray616[local18] -= Static71.anInt1683;
					this.anIntArray613[local18] -= Static107.anInt2175;
					if (arg3 != 0) {
						local20 = Class151.anIntArray244[arg3];
						local164 = Class151.anIntArray245[arg3];
						local182 = this.anIntArray615[local18] * local164 + local20 * this.anIntArray616[local18] + 16383 >> 14;
						this.anIntArray616[local18] = this.anIntArray616[local18] * local164 + 16383 - local20 * this.anIntArray615[local18] >> 14;
						this.anIntArray615[local18] = local182;
					}
					if (arg1 != 0) {
						local20 = Class151.anIntArray244[arg1];
						local164 = Class151.anIntArray245[arg1];
						local182 = this.anIntArray616[local18] * local164 + 16383 - local20 * this.anIntArray613[local18] >> 14;
						this.anIntArray613[local18] = local20 * this.anIntArray616[local18] + local164 * this.anIntArray613[local18] + 16383 >> 14;
						this.anIntArray616[local18] = local182;
					}
					if (arg2 != 0) {
						local20 = Class151.anIntArray244[arg2];
						local164 = Class151.anIntArray245[arg2];
						local182 = local164 * this.anIntArray615[local18] + this.anIntArray613[local18] * local20 + 16383 >> 14;
						this.anIntArray613[local18] = local164 * this.anIntArray613[local18] + 16383 - this.anIntArray615[local18] * local20 >> 14;
						this.anIntArray615[local18] = local182;
					}
					this.anIntArray615[local18] += Static307.anInt5539;
					this.anIntArray616[local18] += Static71.anInt1683;
					this.anIntArray613[local18] += Static107.anInt2175;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt9199; local18++) {
					this.anIntArray615[local18] -= Static307.anInt5539;
					this.anIntArray616[local18] -= Static71.anInt1683;
					this.anIntArray613[local18] -= Static107.anInt2175;
					this.anIntArray615[local18] = this.anIntArray615[local18] * arg1 / 128;
					this.anIntArray616[local18] = arg2 * this.anIntArray616[local18] / 128;
					this.anIntArray613[local18] = this.anIntArray613[local18] * arg3 / 128;
					this.anIntArray615[local18] += Static307.anInt5539;
					this.anIntArray616[local18] += Static71.anInt1683;
					this.anIntArray613[local18] += Static107.anInt2175;
				}
			} else {
				@Pc(514) Class89 local514;
				@Pc(519) Class54 local519;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt9238; local18++) {
						local20 = arg1 * 8 + (this.aByteArray99[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray99[local18] = (byte) local20;
					}
					if (this.aClass97_12 != null) {
						this.aClass97_12.anInterface1_4 = null;
					}
					if (this.aClass89Array1 != null) {
						for (local20 = 0; local20 < this.anInt9195; local20++) {
							local514 = this.aClass89Array1[local20];
							local519 = this.aClass54Array1[local20];
							local519.anInt1811 = local519.anInt1811 & 0xFFFFFF | 255 - (this.aByteArray99[local514.anInt2516] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt9238; local18++) {
						local20 = this.aShortArray114[local18] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						local182 += arg2 / 4;
						@Pc(582) int local582 = local20 & 0x7F;
						@Pc(589) int local589 = local164 + arg1 & 0x3F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local582 += arg3;
						if (local582 < 0) {
							local582 = 0;
						} else if (local582 > 127) {
							local582 = 127;
						}
						this.aShortArray114[local18] = (short) (local182 << 7 | local589 << 10 | local582);
					}
					if (this.aClass97_12 != null) {
						this.aClass97_12.anInterface1_4 = null;
					}
					if (this.aClass89Array1 != null) {
						for (local20 = 0; local20 < this.anInt9195; local20++) {
							local514 = this.aClass89Array1[local20];
							local519 = this.aClass54Array1[local20];
							local519.anInt1811 = local519.anInt1811 & 0xFF000000 | Static279.anIntArray313[this.aShortArray114[local514.anInt2516] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(698) Class54 local698;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt9195; local18++) {
							local698 = this.aClass54Array1[local18];
							local698.anInt1805 += arg2;
							local698.anInt1810 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt9195; local18++) {
							local698 = this.aClass54Array1[local18];
							local698.anInt1815 = arg2 * local698.anInt1815 >> 7;
							local698.anInt1813 = local698.anInt1813 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt9195; local18++) {
							local698 = this.aClass54Array1[local18];
							local698.anInt1809 = arg1 + local698.anInt1809 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "()V")
	@Override
	protected void method7605() {
	}

	@OriginalMember(owner = "client!vp", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort114;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	private void method7616() {
		@Pc(7) int local7 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9199; local29++) {
			@Pc(36) int local36 = this.anIntArray615[local29];
			@Pc(41) int local41 = this.anIntArray616[local29];
			@Pc(46) int local46 = this.anIntArray613[local29];
			if (local19 < local36) {
				local19 = local36;
			}
			if (local15 > local41) {
				local15 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local41 > local21) {
				local21 = local41;
			}
			if (local46 < local17) {
				local17 = local46;
			}
			if (local23 < local46) {
				local23 = local46;
			}
			@Pc(96) int local96 = local36 * local36 + local46 * local46;
			if (local96 > local25) {
				local25 = local96;
			}
			local96 = local41 * local41 + local36 * local36 + local46 * local46;
			if (local27 < local96) {
				local27 = local96;
			}
		}
		this.aShort116 = (short) local21;
		this.aShort112 = (short) local15;
		this.aShort111 = (short) local17;
		this.aShort119 = (short) local19;
		this.aShort118 = (short) local7;
		this.aShort117 = (short) local23;
		this.aShort120 = (short) (Math.sqrt((double) local25) + 0.99D);
		this.aShort114 = (short) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!bd;B)V")
	private void method7617(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0) {
		if (this.aClass12_Sub1_39.anIntArray11.length < this.anInt9228) {
			this.aClass12_Sub1_39.anIntArray12 = new int[this.anInt9228];
			this.aClass12_Sub1_39.anIntArray11 = new int[this.anInt9228];
		}
		@Pc(34) int[] local34 = this.aClass12_Sub1_39.anIntArray11;
		@Pc(38) int[] local38 = this.aClass12_Sub1_39.anIntArray12;
		@Pc(67) int local67;
		@Pc(106) int local106;
		@Pc(115) int local115;
		for (@Pc(40) int local40 = 0; local40 < this.anInt9199; local40++) {
			local67 = (this.anIntArray615[local40] - (this.aClass12_Sub1_39.anInt501 * this.anIntArray616[local40] >> 8) >> this.aClass12_Sub1_39.anInt463) - arg0.anInt960;
			@Pc(92) int local92 = (this.anIntArray613[local40] - (this.aClass12_Sub1_39.anInt496 * this.anIntArray616[local40] >> 8) >> this.aClass12_Sub1_39.anInt463) - arg0.anInt958;
			@Pc(97) int local97 = this.anIntArray617[local40];
			@Pc(104) int local104 = this.anIntArray617[local40 + 1];
			for (local106 = local97; local106 < local104; local106++) {
				local115 = this.aShortArray117[local106] - 1;
				if (local115 == -1) {
					break;
				}
				local34[local115] = local67;
				local38[local115] = local92;
			}
		}
		for (local67 = 0; local67 < this.anInt9205; local67++) {
			if (this.aByteArray99 == null || this.aByteArray99[local67] <= 128) {
				@Pc(159) short local159 = this.aShortArray124[local67];
				@Pc(164) short local164 = this.aShortArray116[local67];
				@Pc(169) short local169 = this.aShortArray118[local67];
				local106 = local34[local159];
				local115 = local34[local164];
				@Pc(181) int local181 = local34[local169];
				@Pc(185) int local185 = local38[local159];
				@Pc(189) int local189 = local38[local164];
				@Pc(193) int local193 = local38[local169];
				if (-((local189 - local185) * (local181 - local115)) + (local106 - local115) * (local189 - local193) > 0) {
					arg0.method847(local189, local185, local115, local106, local193, local181);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass12_Sub1_39.anInterface5_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9238; local11++) {
			if (this.aShortArray115[local11] == arg0) {
				this.aShortArray115[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class45 local51 = local9.method4043(arg0 & 0xFFFF);
			local41 = local51.aByte28;
			local39 = local51.aByte22;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class45 local72 = local9.method4043(arg1 & 0xFFFF);
			local61 = local72.aByte28;
			local59 = local72.aByte22;
		}
		if (!(local61 != local41 | local39 != local59)) {
			return;
		}
		if (this.aClass89Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt9195; local101++) {
				@Pc(108) Class89 local108 = this.aClass89Array1[local101];
				@Pc(113) Class54 local113 = this.aClass54Array1[local101];
				local113.anInt1811 = Static279.anIntArray313[this.aShortArray114[local108.anInt2516] & 0xFFFF] & 0xFFFFFF | local113.anInt1811 & 0xFF000000;
			}
		}
		if (this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!q;Lclient!bc;I)V")
	@Override
	public void method7587(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9228 == 0) {
			return;
		}
		@Pc(16) Class209_Sub3 local16 = this.aClass12_Sub1_39.aClass209_Sub3_3;
		if (!this.aBoolean670) {
			this.method7616();
		}
		@Pc(25) Class209_Sub3 local25 = (Class209_Sub3) arg0;
		Static479.aFloat209 = local25.aFloat163 * local16.aFloat169 + local25.aFloat161 * local16.aFloat166 + local25.aFloat166 * local16.aFloat172;
		Static108.aFloat181 = local16.aFloat170 + local25.aFloat162 * local16.aFloat169 + local25.aFloat171 * local16.aFloat166 + local25.aFloat170 * local16.aFloat172;
		@Pc(72) float local72 = Static108.aFloat181 + (float) this.aShort112 * Static479.aFloat209;
		@Pc(80) float local80 = (float) this.aShort116 * Static479.aFloat209 + Static108.aFloat181;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local96 = local72 + (float) this.aShort120;
			local90 = (float) -this.aShort120 + local80;
		} else {
			local90 = local72 - (float) this.aShort120;
			local96 = local80 + (float) this.aShort120;
		}
		if (local90 >= this.aClass12_Sub1_39.aFloat16 || local96 <= (float) this.aClass12_Sub1_39.anInt476) {
			return;
		}
		Static300.aFloat123 = local16.aFloat162 + local25.aFloat162 * local16.aFloat164 + local25.aFloat171 * local16.aFloat163 + local16.aFloat167 * local25.aFloat170;
		Static167.aFloat66 = local16.aFloat163 * local25.aFloat161 + local25.aFloat163 * local16.aFloat164 + local25.aFloat166 * local16.aFloat167;
		@Pc(173) float local173 = Static300.aFloat123 + Static167.aFloat66 * (float) this.aShort112;
		@Pc(181) float local181 = Static300.aFloat123 + (float) this.aShort116 * Static167.aFloat66;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local196 = (float) this.aClass12_Sub1_39.anInt478 * ((float) -this.aShort120 + local181);
			local207 = (float) this.aClass12_Sub1_39.anInt478 * (local173 + (float) this.aShort120);
		} else {
			local196 = (float) this.aClass12_Sub1_39.anInt478 * (local173 - (float) this.aShort120);
			local207 = (float) this.aClass12_Sub1_39.anInt478 * (local181 + (float) this.aShort120);
		}
		if (local196 / local96 >= this.aClass12_Sub1_39.aFloat5 || this.aClass12_Sub1_39.aFloat10 >= local207 / local96) {
			return;
		}
		Static146.aFloat62 = local25.aFloat161 * local16.aFloat161 + local25.aFloat163 * local16.aFloat165 + local25.aFloat166 * local16.aFloat168;
		Static593.aFloat214 = local16.aFloat168 * local25.aFloat170 + local25.aFloat162 * local16.aFloat165 + local25.aFloat171 * local16.aFloat161 + local16.aFloat171;
		@Pc(297) float local297 = Static593.aFloat214 + Static146.aFloat62 * (float) this.aShort112;
		@Pc(305) float local305 = (float) this.aShort116 * Static146.aFloat62 + Static593.aFloat214;
		@Pc(331) float local331;
		@Pc(320) float local320;
		if (local297 > local305) {
			local320 = (float) this.aClass12_Sub1_39.anInt491 * (local297 + (float) this.aShort120);
			local331 = (local305 - (float) this.aShort120) * (float) this.aClass12_Sub1_39.anInt491;
		} else {
			local320 = (float) this.aClass12_Sub1_39.anInt491 * ((float) this.aShort120 + local305);
			local331 = (local297 - (float) this.aShort120) * (float) this.aClass12_Sub1_39.anInt491;
		}
		if (local331 / local96 >= this.aClass12_Sub1_39.aFloat2 || this.aClass12_Sub1_39.aFloat21 >= local320 / local96) {
			return;
		}
		if (arg1 != null || this.aClass89Array1 != null) {
			Static349.aFloat156 = local16.aFloat172 * local25.aFloat169 + local16.aFloat166 * local25.aFloat165 + local16.aFloat169 * local25.aFloat164;
			Static452.aFloat205 = local25.aFloat169 * local16.aFloat167 + local16.aFloat164 * local25.aFloat164 + local16.aFloat163 * local25.aFloat165;
			Static96.aFloat40 = local16.aFloat168 * local25.aFloat169 + local25.aFloat164 * local16.aFloat165 + local16.aFloat161 * local25.aFloat165;
			Static469.aFloat207 = local16.aFloat172 * local25.aFloat172 + local16.aFloat166 * local25.aFloat168 + local25.aFloat167 * local16.aFloat169;
			Static386.aFloat173 = local25.aFloat167 * local16.aFloat164 + local16.aFloat163 * local25.aFloat168 + local16.aFloat167 * local25.aFloat172;
			Static280.aFloat117 = local25.aFloat172 * local16.aFloat168 + local16.aFloat165 * local25.aFloat167 + local16.aFloat161 * local25.aFloat168;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort118 + this.aShort119 >> 1;
			@Pc(509) int local509 = this.aShort111 + this.aShort117 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static386.aFloat173 + Static452.aFloat205 * (float) local500 + Static300.aFloat123 + Static167.aFloat66 * (float) this.aShort112);
			@Pc(547) int local547 = (int) (Static593.aFloat214 + Static96.aFloat40 * (float) local500 + (float) this.aShort112 * Static146.aFloat62 + Static280.aFloat117 * (float) local509);
			@Pc(566) int local566 = (int) ((float) this.aShort112 * Static479.aFloat209 + Static108.aFloat181 + (float) local500 * Static349.aFloat156 + Static469.aFloat207 * (float) local509);
			if (this.aClass12_Sub1_39.anInt476 > local566) {
				local490 = true;
			} else {
				arg1.anInt904 = this.aClass12_Sub1_39.anInt490 + local528 * this.aClass12_Sub1_39.anInt478 / local566;
				arg1.anInt901 = local547 * this.aClass12_Sub1_39.anInt491 / local566 + this.aClass12_Sub1_39.anInt493;
			}
			@Pc(620) int local620 = (int) (Static167.aFloat66 * (float) this.aShort116 + Static452.aFloat205 * (float) local500 + Static300.aFloat123 + (float) local509 * Static386.aFloat173);
			@Pc(639) int local639 = (int) (Static96.aFloat40 * (float) local500 + Static593.aFloat214 + Static146.aFloat62 * (float) this.aShort116 + Static280.aFloat117 * (float) local509);
			@Pc(658) int local658 = (int) (Static469.aFloat207 * (float) local509 + Static349.aFloat156 * (float) local500 + Static108.aFloat181 + Static479.aFloat209 * (float) this.aShort116);
			if (this.aClass12_Sub1_39.anInt476 <= local658) {
				arg1.anInt905 = this.aClass12_Sub1_39.anInt490 + this.aClass12_Sub1_39.anInt478 * local620 / local658;
				arg1.anInt902 = this.aClass12_Sub1_39.anInt491 * local639 / local658 + this.aClass12_Sub1_39.anInt493;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass12_Sub1_39.anInt476 > local566 && this.aClass12_Sub1_39.anInt476 > local658) {
					local492 = false;
				} else {
					@Pc(740) int local740;
					@Pc(751) int local751;
					@Pc(762) int local762;
					if (local566 < this.aClass12_Sub1_39.anInt476) {
						local740 = (local658 - this.aClass12_Sub1_39.anInt476 << 16) / (local658 - local566);
						local751 = local620 + (local740 * (local620 - local528) >> 16);
						local762 = ((local639 - local547) * local740 >> 16) + local639;
						arg1.anInt904 = this.aClass12_Sub1_39.anInt490 + local751 * this.aClass12_Sub1_39.anInt478 / this.aClass12_Sub1_39.anInt476;
						arg1.anInt901 = this.aClass12_Sub1_39.anInt491 * local762 / this.aClass12_Sub1_39.anInt476 + this.aClass12_Sub1_39.anInt493;
					} else if (local658 < this.aClass12_Sub1_39.anInt476) {
						local740 = (local566 - this.aClass12_Sub1_39.anInt476 << 16) / (local566 - local658);
						local751 = ((local528 - local620) * local740 >> 16) + local528;
						local762 = local547 + (local740 * (local547 - local639) >> 16);
						arg1.anInt904 = local751 * this.aClass12_Sub1_39.anInt478 / this.aClass12_Sub1_39.anInt476 + this.aClass12_Sub1_39.anInt490;
						arg1.anInt901 = this.aClass12_Sub1_39.anInt491 * local762 / this.aClass12_Sub1_39.anInt476 + this.aClass12_Sub1_39.anInt493;
					}
				}
			}
			if (local492) {
				if (local658 < local566) {
					arg1.anInt903 = this.aClass12_Sub1_39.anInt490 + (this.aShort120 + local528) * this.aClass12_Sub1_39.anInt478 / local566 - arg1.anInt904;
				} else {
					arg1.anInt903 = this.aClass12_Sub1_39.anInt490 + (this.aShort120 + local620) * this.aClass12_Sub1_39.anInt478 / local658 - arg1.anInt905;
				}
				arg1.aBoolean78 = true;
			}
		}
		this.aClass12_Sub1_39.method416();
		this.aClass12_Sub1_39.method383(local25);
		this.method7618();
		this.aClass12_Sub1_39.method402();
		this.method7614();
	}

	@OriginalMember(owner = "client!vp", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort113;
	}

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort116;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "()[Lclient!fk;")
	@Override
	public Class101[] method7599() {
		return this.aClass101Array5;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
	private void method7618() {
		if (this.anInt9205 == 0) {
			return;
		}
		if (this.aByte120 != 0) {
			this.method7612(true);
		}
		this.method7612(false);
		if (this.aClass248_1 != null) {
			if (this.aClass248_1.anInterface23_3 == null) {
				this.method7620((this.aByte120 & 0x10) != 0);
			}
			if (this.aClass248_1.anInterface23_3 != null) {
				this.aClass12_Sub1_39.method454(this.aClass97_11 != null);
				this.aClass12_Sub1_39.method428(this.aClass97_14, this.aClass97_11, this.aClass97_12, this.aClass97_13);
				@Pc(73) int local73 = this.anIntArray614.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray614[local75];
					@Pc(89) int local89 = this.anIntArray614[local75 + 1];
					@Pc(96) int local96 = this.aShortArray115[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass12_Sub1_39.method397(local96, this.aClass97_11 != null);
					this.aClass12_Sub1_39.method425(local82 * 3, this.aClass248_1.anInterface23_3, (local89 - local82) * 3);
				}
			}
		}
		this.method7619();
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	private void method7619() {
		if (!this.aBoolean672) {
			return;
		}
		this.aBoolean672 = false;
		if (this.aClass219Array5 == null && this.aClass101Array5 == null && this.aClass89Array1 == null) {
			if (this.anIntArray615 != null && !Static314.method4791(this.anInt9208, this.anInt9227)) {
				if (this.aClass97_14 != null && this.aClass97_14.anInterface1_4 == null) {
					this.aBoolean672 = true;
				} else {
					if (!this.aBoolean670) {
						this.method7616();
					}
					this.anIntArray615 = null;
				}
			}
			if (this.anIntArray616 != null && !Static275.method4276(this.anInt9227, this.anInt9208)) {
				if (this.aClass97_14 != null && this.aClass97_14.anInterface1_4 == null) {
					this.aBoolean672 = true;
				} else {
					if (!this.aBoolean670) {
						this.method7616();
					}
					this.anIntArray616 = null;
				}
			}
			if (this.anIntArray613 != null && !Static561.method5046(this.anInt9208, this.anInt9227)) {
				if (this.aClass97_14 != null && this.aClass97_14.anInterface1_4 == null) {
					this.aBoolean672 = true;
				} else {
					if (!this.aBoolean670) {
						this.method7616();
					}
					this.anIntArray613 = null;
				}
			}
		}
		if (this.aShortArray117 != null && this.anIntArray615 == null && this.anIntArray616 == null && this.anIntArray613 == null) {
			this.anIntArray617 = null;
			this.aShortArray117 = null;
		}
		if (this.aByteArray100 != null && !Static281.method4326(this.anInt9208, this.anInt9227)) {
			if (this.aClass97_11 == null) {
				if (this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null) {
					this.aBoolean672 = true;
				} else {
					this.aByteArray100 = null;
					this.aShortArray121 = this.aShortArray119 = this.aShortArray122 = null;
				}
			} else if (this.aClass97_11.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aByteArray100 = null;
				this.aShortArray121 = this.aShortArray119 = this.aShortArray122 = null;
			}
		}
		if (this.aShortArray114 != null && !Static339.method5065(this.anInt9227, this.anInt9208)) {
			if (this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aShortArray114 = null;
			}
		}
		if (this.aByteArray99 != null && !Static110.method1967(this.anInt9227, this.anInt9208)) {
			if (this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aByteArray99 = null;
			}
		}
		if (this.aFloatArray72 != null && !Static432.method6069(this.anInt9208, this.anInt9227)) {
			if (this.aClass97_13 != null && this.aClass97_13.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aFloatArray72 = this.aFloatArray73 = null;
			}
		}
		if (this.aShortArray115 != null && !Static487.method6811(this.anInt9208, this.anInt9227)) {
			if (this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aShortArray115 = null;
			}
		}
		if (this.aShortArray124 != null && !Static86.method1722(this.anInt9227, this.anInt9208)) {
			if (this.aClass248_1 != null && this.aClass248_1.anInterface23_3 == null || this.aClass97_12 != null && this.aClass97_12.anInterface1_4 == null) {
				this.aBoolean672 = true;
			} else {
				this.aShortArray124 = this.aShortArray116 = this.aShortArray118 = null;
			}
		}
		if (this.anIntArrayArray59 != null && !Static41.method998(this.anInt9208, this.anInt9227)) {
			this.anIntArrayArray59 = null;
			this.aShortArray120 = null;
		}
		if (this.anIntArrayArray58 != null && !Static82.method7595(this.anInt9208, this.anInt9227)) {
			this.aShortArray123 = null;
			this.anIntArrayArray58 = null;
		}
		if (this.anIntArrayArray60 != null && !Static340.method5068(this.anInt9227, this.anInt9208)) {
			this.anIntArrayArray60 = null;
		}
		if (this.anIntArray614 != null && (this.anInt9208 & 0x800) == 0 && (this.anInt9208 & 0x40000) == 0) {
			this.anIntArray614 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		if (this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
		this.aShort113 = (short) arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZZ)V")
	private void method7620(@OriginalArg(1) boolean arg0) {
		if (this.anInt9205 * 6 <= this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1.aByteArray52.length) {
			this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1.anInt5238 = 0;
		} else {
			this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1 = new Class1_Sub20_Sub2(this.anInt9205 * 6 + 600);
		}
		@Pc(42) Class1_Sub20_Sub2 local42 = this.aClass12_Sub1_39.aClass1_Sub20_Sub2_1;
		@Pc(54) int local54;
		if (this.aClass12_Sub1_39.aBoolean23) {
			for (local54 = 0; local54 < this.anInt9205; local54++) {
				local42.method4381(this.aShortArray124[local54]);
				local42.method4381(this.aShortArray116[local54]);
				local42.method4381(this.aShortArray118[local54]);
			}
		} else {
			for (local54 = 0; local54 < this.anInt9205; local54++) {
				local42.method4376(this.aShortArray124[local54]);
				local42.method4376(this.aShortArray116[local54]);
				local42.method4376(this.aShortArray118[local54]);
			}
		}
		if (local42.anInt5238 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface23_4 == null) {
				this.anInterface23_4 = this.aClass12_Sub1_39.method405(true, local42.anInt5238, local42.aByteArray52);
			} else {
				this.anInterface23_4.method7764(local42.anInt5238, local42.aByteArray52);
			}
			this.aClass248_1.anInterface23_3 = this.anInterface23_4;
		} else {
			this.aClass248_1.anInterface23_3 = this.aClass12_Sub1_39.method405(false, local42.anInt5238, local42.aByteArray52);
		}
		if (!arg0) {
			this.aBoolean672 = true;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
	@Override
	public void method7589() {
		if (this.anInt9228 <= 0 || this.anInt9205 <= 0) {
			return;
		}
		this.method7612(false);
		if ((this.aByte120 & 0x10) == 0 && this.aClass248_1.anInterface23_3 == null) {
			this.method7620(false);
		}
		this.method7619();
	}

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9189; local7++) {
			this.anIntArray615[local7] = this.anIntArray615[local7] + 7 >> 4;
			this.anIntArray616[local7] = this.anIntArray616[local7] + 7 >> 4;
			this.anIntArray613[local7] = this.anIntArray613[local7] + 7 >> 4;
		}
		this.aBoolean670 = false;
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort120;
	}

	@OriginalMember(owner = "client!vp", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9199; local3++) {
			this.anIntArray613[local3] = -this.anIntArray613[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt9228; local29++) {
			this.aShortArray122[local29] = (short) -this.aShortArray122[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt9238; local52++) {
			@Pc(59) short local59 = this.aShortArray124[local52];
			this.aShortArray124[local52] = this.aShortArray118[local52];
			this.aShortArray118[local52] = local59;
		}
		if (this.aClass97_11 == null && this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
		if (this.aClass97_11 != null) {
			this.aClass97_11.anInterface1_4 = null;
		}
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
		if (this.aClass248_1 != null) {
			this.aClass248_1.anInterface23_3 = null;
		}
		this.aBoolean670 = false;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9238; local7++) {
			if (this.aShortArray114[local7] == arg0) {
				this.aShortArray114[local7] = arg1;
			}
		}
		if (this.aClass89Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt9195; local34++) {
				@Pc(41) Class89 local41 = this.aClass89Array1[local34];
				@Pc(46) Class54 local46 = this.aClass54Array1[local34];
				local46.anInt1811 = local46.anInt1811 & 0xFF000000 | Static279.anIntArray313[this.aShortArray114[local41.anInt2516] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZLclient!vp;ZLclient!vp;)Lclient!da;")
	private Class61 method7622(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class61_Sub3 arg3, @OriginalArg(5) Class61_Sub3 arg4) {
		arg4.aByte120 = 0;
		arg4.anInt9238 = this.anInt9238;
		arg4.anInt9205 = this.anInt9205;
		arg4.anInt9208 = arg1;
		arg4.anInt9199 = this.anInt9199;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean673 = this.aBoolean673;
		} else {
			arg4.aBoolean673 = true;
		}
		arg4.aShort113 = this.aShort113;
		arg4.anInt9195 = this.anInt9195;
		arg4.aShort115 = this.aShort115;
		arg4.anInt9227 = this.anInt9227;
		arg4.anInt9228 = this.anInt9228;
		arg4.anInt9189 = this.anInt9189;
		@Pc(69) boolean local69 = Static26.method714(arg1, this.anInt9227);
		@Pc(75) boolean local75 = Static541.method7812(arg1, this.anInt9227);
		@Pc(81) boolean local81 = Static213.method3549(this.anInt9227, arg1);
		@Pc(87) boolean local87 = local75 | local69 | local81;
		@Pc(188) int local188;
		if (local87) {
			if (!local69) {
				arg4.anIntArray615 = this.anIntArray615;
			} else if (arg3.anIntArray615 == null || arg3.anIntArray615.length < this.anInt9189) {
				arg4.anIntArray615 = arg3.anIntArray615 = new int[this.anInt9189];
			} else {
				arg4.anIntArray615 = arg3.anIntArray615;
			}
			if (!local75) {
				arg4.anIntArray616 = this.anIntArray616;
			} else if (arg3.anIntArray616 == null || this.anInt9189 > arg3.anIntArray616.length) {
				arg4.anIntArray616 = arg3.anIntArray616 = new int[this.anInt9189];
			} else {
				arg4.anIntArray616 = arg3.anIntArray616;
			}
			if (!local81) {
				arg4.anIntArray613 = this.anIntArray613;
			} else if (arg3.anIntArray613 == null || this.anInt9189 > arg3.anIntArray613.length) {
				arg4.anIntArray613 = arg3.anIntArray613 = new int[this.anInt9189];
			} else {
				arg4.anIntArray613 = arg3.anIntArray613;
			}
			for (local188 = 0; local188 < this.anInt9189; local188++) {
				if (local69) {
					arg4.anIntArray615[local188] = this.anIntArray615[local188];
				}
				if (local75) {
					arg4.anIntArray616[local188] = this.anIntArray616[local188];
				}
				if (local81) {
					arg4.anIntArray613[local188] = this.anIntArray613[local188];
				}
			}
		} else {
			arg4.anIntArray615 = this.anIntArray615;
			arg4.anIntArray613 = this.anIntArray613;
			arg4.anIntArray616 = this.anIntArray616;
		}
		if (Static395.method5608(arg1, this.anInt9227)) {
			if (arg2) {
				arg4.aByte120 = (byte) (arg4.aByte120 | 0x1);
			}
			arg4.aClass97_14 = arg3.aClass97_14;
			arg4.aClass97_14.aByte38 = this.aClass97_14.aByte38;
			arg4.aClass97_14.anInterface1_4 = this.aClass97_14.anInterface1_4;
		} else if (Static492.method6897(this.anInt9227, arg1)) {
			arg4.aClass97_14 = this.aClass97_14;
		} else {
			arg4.aClass97_14 = null;
		}
		if (Static171.method2606(arg1, this.anInt9227)) {
			if (arg3.aShortArray114 == null || arg3.aShortArray114.length < this.anInt9238) {
				arg4.aShortArray114 = arg3.aShortArray114 = new short[this.anInt9238];
			} else {
				arg4.aShortArray114 = arg3.aShortArray114;
			}
			for (local188 = 0; local188 < this.anInt9238; local188++) {
				arg4.aShortArray114[local188] = this.aShortArray114[local188];
			}
		} else {
			arg4.aShortArray114 = this.aShortArray114;
		}
		if (Static29.method752(arg1, this.anInt9227)) {
			if (arg3.aByteArray99 == null || arg3.aByteArray99.length < this.anInt9238) {
				arg4.aByteArray99 = arg3.aByteArray99 = new byte[this.anInt9238];
			} else {
				arg4.aByteArray99 = arg3.aByteArray99;
			}
			for (local188 = 0; local188 < this.anInt9238; local188++) {
				arg4.aByteArray99[local188] = this.aByteArray99[local188];
			}
		} else {
			arg4.aByteArray99 = this.aByteArray99;
		}
		if (Static515.method7050(arg1, this.anInt9227)) {
			if (arg2) {
				arg4.aByte120 = (byte) (arg4.aByte120 | 0x2);
			}
			arg4.aClass97_12 = arg3.aClass97_12;
			arg4.aClass97_12.anInterface1_4 = this.aClass97_12.anInterface1_4;
			arg4.aClass97_12.aByte38 = this.aClass97_12.aByte38;
		} else if (Static404.method5707(this.anInt9227, arg1)) {
			arg4.aClass97_12 = this.aClass97_12;
		} else {
			arg4.aClass97_12 = null;
		}
		@Pc(602) int local602;
		if (Static77.method6754(this.anInt9227, arg1)) {
			if (arg3.aShortArray121 == null || arg3.aShortArray121.length < this.anInt9228) {
				local188 = this.anInt9228;
				arg4.aShortArray122 = arg3.aShortArray122 = new short[local188];
				arg4.aShortArray119 = arg3.aShortArray119 = new short[local188];
				arg4.aShortArray121 = arg3.aShortArray121 = new short[local188];
			} else {
				arg4.aShortArray122 = arg3.aShortArray122;
				arg4.aShortArray121 = arg3.aShortArray121;
				arg4.aShortArray119 = arg3.aShortArray119;
			}
			if (this.aClass83_1 == null) {
				for (local188 = 0; local188 < this.anInt9228; local188++) {
					arg4.aShortArray121[local188] = this.aShortArray121[local188];
					arg4.aShortArray119[local188] = this.aShortArray119[local188];
					arg4.aShortArray122[local188] = this.aShortArray122[local188];
				}
			} else {
				if (arg3.aClass83_1 == null) {
					arg3.aClass83_1 = new Class83();
				}
				@Pc(590) Class83 local590 = arg4.aClass83_1 = arg3.aClass83_1;
				if (local590.aShortArray34 == null || this.anInt9228 > local590.aShortArray34.length) {
					local602 = this.anInt9228;
					local590.aShortArray33 = new short[local602];
					local590.aShortArray35 = new short[local602];
					local590.aShortArray34 = new short[local602];
					local590.aByteArray20 = new byte[local602];
				}
				for (local602 = 0; local602 < this.anInt9228; local602++) {
					arg4.aShortArray121[local602] = this.aShortArray121[local602];
					arg4.aShortArray119[local602] = this.aShortArray119[local602];
					arg4.aShortArray122[local602] = this.aShortArray122[local602];
					local590.aShortArray34[local602] = this.aClass83_1.aShortArray34[local602];
					local590.aShortArray33[local602] = this.aClass83_1.aShortArray33[local602];
					local590.aShortArray35[local602] = this.aClass83_1.aShortArray35[local602];
					local590.aByteArray20[local602] = this.aClass83_1.aByteArray20[local602];
				}
			}
			arg4.aByteArray100 = this.aByteArray100;
		} else {
			arg4.aShortArray121 = this.aShortArray121;
			arg4.aShortArray119 = this.aShortArray119;
			arg4.aClass83_1 = this.aClass83_1;
			arg4.aByteArray100 = this.aByteArray100;
			arg4.aShortArray122 = this.aShortArray122;
		}
		if (Static128.method2206(arg1, this.anInt9227)) {
			if (arg2) {
				arg4.aByte120 = (byte) (arg4.aByte120 | 0x4);
			}
			arg4.aClass97_11 = arg3.aClass97_11;
			arg4.aClass97_11.aByte38 = this.aClass97_11.aByte38;
			arg4.aClass97_11.anInterface1_4 = this.aClass97_11.anInterface1_4;
		} else if (Static171.method2608(this.anInt9227, arg1)) {
			arg4.aClass97_11 = this.aClass97_11;
		} else {
			arg4.aClass97_11 = null;
		}
		if (Static95.method1800(arg1, this.anInt9227)) {
			if (arg3.aFloatArray72 == null || this.anInt9238 > arg3.aFloatArray72.length) {
				local188 = this.anInt9228;
				arg4.aFloatArray73 = arg3.aFloatArray73 = new float[local188];
				arg4.aFloatArray72 = arg3.aFloatArray72 = new float[local188];
			} else {
				arg4.aFloatArray73 = arg3.aFloatArray73;
				arg4.aFloatArray72 = arg3.aFloatArray72;
			}
			for (local188 = 0; local188 < this.anInt9228; local188++) {
				arg4.aFloatArray72[local188] = this.aFloatArray72[local188];
				arg4.aFloatArray73[local188] = this.aFloatArray73[local188];
			}
		} else {
			arg4.aFloatArray72 = this.aFloatArray72;
			arg4.aFloatArray73 = this.aFloatArray73;
		}
		if (Static500.method5655(arg1, this.anInt9227)) {
			if (arg2) {
				arg4.aByte120 = (byte) (arg4.aByte120 | 0x8);
			}
			arg4.aClass97_13 = arg3.aClass97_13;
			arg4.aClass97_13.anInterface1_4 = this.aClass97_13.anInterface1_4;
			arg4.aClass97_13.aByte38 = this.aClass97_13.aByte38;
		} else if (Static374.method5446(arg1, this.anInt9227)) {
			arg4.aClass97_13 = this.aClass97_13;
		} else {
			arg4.aClass97_13 = null;
		}
		if (Static28.method2623(this.anInt9227, arg1)) {
			if (arg3.aShortArray124 == null || arg3.aShortArray124.length < this.anInt9238) {
				local188 = this.anInt9238;
				arg4.aShortArray124 = arg3.aShortArray124 = new short[local188];
				arg4.aShortArray116 = arg3.aShortArray116 = new short[local188];
				arg4.aShortArray118 = arg3.aShortArray118 = new short[local188];
			} else {
				arg4.aShortArray116 = arg3.aShortArray116;
				arg4.aShortArray124 = arg3.aShortArray124;
				arg4.aShortArray118 = arg3.aShortArray118;
			}
			for (local188 = 0; local188 < this.anInt9238; local188++) {
				arg4.aShortArray124[local188] = this.aShortArray124[local188];
				arg4.aShortArray116[local188] = this.aShortArray116[local188];
				arg4.aShortArray118[local188] = this.aShortArray118[local188];
			}
		} else {
			arg4.aShortArray118 = this.aShortArray118;
			arg4.aShortArray124 = this.aShortArray124;
			arg4.aShortArray116 = this.aShortArray116;
		}
		if (Static205.method3505(this.anInt9227, arg1)) {
			arg4.aClass248_1 = arg3.aClass248_1;
			if (arg2) {
				arg4.aByte120 = (byte) (arg4.aByte120 | 0x10);
			}
			arg4.aClass248_1.anInterface23_3 = this.aClass248_1.anInterface23_3;
		} else if (Static545.method7406(arg1, this.anInt9227)) {
			arg4.aClass248_1 = this.aClass248_1;
		} else {
			arg4.aClass248_1 = null;
		}
		if (Static67.method1441(arg1, this.anInt9227)) {
			if (arg3.aShortArray115 == null || this.anInt9238 > arg3.aShortArray115.length) {
				local188 = this.anInt9238;
				arg4.aShortArray115 = arg3.aShortArray115 = new short[local188];
			} else {
				arg4.aShortArray115 = arg3.aShortArray115;
			}
			for (local188 = 0; local188 < this.anInt9238; local188++) {
				arg4.aShortArray115[local188] = this.aShortArray115[local188];
			}
		} else {
			arg4.aShortArray115 = this.aShortArray115;
		}
		if (!Static137.method2292(arg1, this.anInt9227)) {
			arg4.aClass54Array1 = this.aClass54Array1;
		} else if (arg3.aClass54Array1 == null || this.anInt9195 > arg3.aClass54Array1.length) {
			local188 = this.anInt9195;
			arg4.aClass54Array1 = arg3.aClass54Array1 = new Class54[local188];
			for (local602 = 0; local602 < this.anInt9195; local602++) {
				arg4.aClass54Array1[local602] = this.aClass54Array1[local602].method1595();
			}
		} else {
			arg4.aClass54Array1 = arg3.aClass54Array1;
			for (local188 = 0; local188 < this.anInt9195; local188++) {
				arg4.aClass54Array1[local188].method1594(this.aClass54Array1[local188]);
			}
		}
		arg4.anIntArrayArray58 = this.anIntArrayArray58;
		arg4.anIntArrayArray60 = this.anIntArrayArray60;
		arg4.aClass89Array1 = this.aClass89Array1;
		arg4.aClass101Array5 = this.aClass101Array5;
		arg4.aShortArray123 = this.aShortArray123;
		arg4.aShortArray117 = this.aShortArray117;
		arg4.anIntArrayArray59 = this.anIntArrayArray59;
		arg4.anIntArray614 = this.anIntArray614;
		arg4.anIntArray617 = this.anIntArray617;
		arg4.aClass219Array5 = this.aClass219Array5;
		arg4.aShortArray120 = this.aShortArray120;
		if (this.aBoolean670) {
			arg4.aBoolean670 = true;
			arg4.aShort117 = this.aShort117;
			arg4.aShort116 = this.aShort116;
			arg4.aShort118 = this.aShort118;
			arg4.aShort114 = this.aShort114;
			arg4.aShort112 = this.aShort112;
			arg4.aShort120 = this.aShort120;
			arg4.aShort119 = this.aShort119;
			arg4.aShort111 = this.aShort111;
		} else {
			arg4.aBoolean670 = false;
		}
		return arg4;
	}

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray58 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9189; local12++) {
			this.anIntArray615[local12] <<= 0x4;
			this.anIntArray616[local12] <<= 0x4;
			this.anIntArray613[local12] <<= 0x4;
		}
		Static71.anInt1683 = 0;
		Static307.anInt5539 = 0;
		Static107.anInt2175 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBBSI)I")
	private int method7623(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static279.anIntArray313[Static536.method7308(arg0, arg3)];
		if (arg2 != -1) {
			@Pc(31) Class45 local31 = this.aClass12_Sub1_39.anInterface5_10.method4043(arg2 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte22 & 0xFF;
			@Pc(45) int local45;
			@Pc(72) int local72;
			if (local36 != 0) {
				if (arg0 < 0) {
					local45 = 0;
				} else if (arg0 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg0 * 131586;
				}
				if (local36 == 256) {
					local17 = local45;
				} else {
					local72 = 256 - local36;
					local17 = ((local17 & 0xFF00) * local72 + (local45 & 0xFF00) * local36 & 0xFF0000) + (local36 * (local45 & 0xFF00FF) + ((local17 & 0xFF00FF) * local72) & 0xFF00FF00) >> 8;
				}
			}
			local45 = local31.aByte28 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(119) int local119 = (local17 >> 16 & 0xFF) * local45;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local72 = local45 * (local17 >> 8 & 0xFF);
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(145) int local145 = local45 * (local17 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				local17 = (local145 >> 8) + (local72 & 0xFF00) + (local119 << 8 & 0xFF00F7);
			}
		}
		return (local17 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!vp", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort115;
	}

	@OriginalMember(owner = "client!vp", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9199; local15++) {
			@Pc(34) int local34 = this.anIntArray616[local15] * local13 - this.anIntArray613[local15] * local9 >> 14;
			this.anIntArray613[local15] = local13 * this.anIntArray613[local15] + this.anIntArray616[local15] * local9 >> 14;
			this.anIntArray616[local15] = local34;
		}
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
		this.aBoolean670 = false;
	}

	@OriginalMember(owner = "client!vp", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class151.anIntArray244[arg0];
		@Pc(13) int local13 = Class151.anIntArray245[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9199; local15++) {
			local34 = local9 * this.anIntArray613[local15] + local13 * this.anIntArray615[local15] >> 14;
			this.anIntArray613[local15] = this.anIntArray613[local15] * local13 - this.anIntArray615[local15] * local9 >> 14;
			this.anIntArray615[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt9228; local34++) {
			@Pc(84) int local84 = local9 * this.aShortArray122[local34] + local13 * this.aShortArray121[local34] >> 14;
			this.aShortArray122[local34] = (short) (local13 * this.aShortArray122[local34] - this.aShortArray121[local34] * local9 >> 14);
			this.aShortArray121[local34] = (short) local84;
		}
		if (this.aClass97_11 == null && this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
		if (this.aClass97_11 != null) {
			this.aClass97_11.anInterface1_4 = null;
		}
		this.aBoolean670 = false;
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean670) {
			this.method7616();
		}
		@Pc(16) int local16 = this.aShort118 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort119;
		@Pc(26) int local26 = arg6 + this.aShort111;
		@Pc(31) int local31 = this.aShort117 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7983 <= local21 + arg2.anInt7986 >> arg2.anInt7988 || local26 < 0 || arg2.anInt7984 <= arg2.anInt7986 + local31 >> arg2.anInt7988)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt7986 >> arg3.anInt7988 >= arg3.anInt7983 || local26 < 0 || arg3.anInt7984 <= local31 + arg3.anInt7986 >> arg3.anInt7988) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7988;
			local21 = local21 + arg2.anInt7986 - 1 >> arg2.anInt7988;
			local26 >>= arg2.anInt7988;
			local31 = local31 + arg2.anInt7986 - 1 >> arg2.anInt7988;
			if (arg2.method6642(local16, local26) == arg5 && arg2.method6642(local21, local26) == arg5 && arg2.method6642(local16, local31) == arg5 && arg2.method6642(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(269) int local269;
		if (arg0 == 1) {
			for (local269 = 0; local269 < this.anInt9199; local269++) {
				this.anIntArray616[local269] = this.anIntArray616[local269] + arg2.method6637(arg4 + this.anIntArray615[local269], arg6 + this.anIntArray613[local269]) - arg5;
			}
		} else {
			@Pc(199) int local199;
			@Pc(210) int local210;
			if (arg0 == 2) {
				@Pc(194) short local194 = this.aShort112;
				if (local194 == 0) {
					return;
				}
				for (local199 = 0; local199 < this.anInt9199; local199++) {
					local210 = (this.anIntArray616[local199] << 16) / local194;
					if (arg1 > local210) {
						this.anIntArray616[local199] -= -((arg1 - local210) * (-arg5 + arg2.method6637(this.anIntArray615[local199] + arg4, arg6 + this.anIntArray613[local199])) / arg1);
					}
				}
			} else {
				@Pc(338) int local338;
				if (arg0 == 3) {
					local269 = (arg1 & 0xFF) * 4;
					local199 = (arg1 >> 8 & 0xFF) * 4;
					local210 = (arg1 >> 16 & 0xFF) << 6;
					local338 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local269 >> 1) < 0 || arg2.anInt7986 + arg4 + (local269 >> 1) >= arg2.anInt7983 << arg2.anInt7988 || arg6 - (local199 >> 1) < 0 || (local199 >> 1) + arg6 + arg2.anInt7986 >= arg2.anInt7984 << arg2.anInt7988) {
						return;
					}
					this.method7604(local199, arg2, arg6, local210, arg5, arg4, local269, local338);
				} else if (arg0 == 4) {
					local269 = this.aShort116 - this.aShort112;
					for (local199 = 0; local199 < this.anInt9199; local199++) {
						this.anIntArray616[local199] = local269 + this.anIntArray616[local199] + arg3.method6637(this.anIntArray615[local199] - -arg4, this.anIntArray613[local199] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local269 = this.aShort116 - this.aShort112;
					for (local199 = 0; local199 < this.anInt9199; local199++) {
						local210 = arg4 + this.anIntArray615[local199];
						local338 = this.anIntArray613[local199] + arg6;
						@Pc(344) int local344 = arg2.method6637(local210, local338);
						@Pc(350) int local350 = arg3.method6637(local210, local338);
						@Pc(357) int local357 = local344 - local350 - arg1;
						this.anIntArray616[local199] = local344 + (local357 * ((this.anIntArray616[local199] << 8) / local269) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass97_14 != null) {
			this.aClass97_14.anInterface1_4 = null;
		}
		this.aBoolean670 = false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			Static71.anInt1683 = 0;
			local26 = 0;
			Static107.anInt2175 = 0;
			Static307.anInt5539 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray58.length > local38) {
					local52 = this.anIntArrayArray58[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static307.anInt5539 += this.anIntArray615[local60];
						Static71.anInt1683 += this.anIntArray616[local60];
						Static107.anInt2175 += this.anIntArray613[local60];
						local26++;
					}
				}
			}
			if (local26 <= 0) {
				Static307.anInt5539 = local18;
				Static107.anInt2175 = local14;
				Static71.anInt1683 = local22;
			} else {
				Static71.anInt1683 = Static71.anInt1683 / local26 + local22;
				Static307.anInt5539 = local18 + Static307.anInt5539 / local26;
				Static107.anInt2175 = Static107.anInt2175 / local26 + local14;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local18 = arg2 << 4;
			local14 = arg4 << 4;
			local22 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray58.length > local32) {
					local161 = this.anIntArrayArray58[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local54 = local161[local163];
						this.anIntArray615[local54] += local18;
						this.anIntArray616[local54] += local22;
						this.anIntArray613[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(762) int local762;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray58.length > local32) {
					local161 = this.anIntArrayArray58[local32];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							this.anIntArray615[local54] -= Static307.anInt5539;
							this.anIntArray616[local54] -= Static71.anInt1683;
							this.anIntArray613[local54] -= Static107.anInt2175;
							if (arg4 != 0) {
								local60 = Class151.anIntArray244[arg4];
								local278 = Class151.anIntArray245[arg4];
								local297 = local278 * this.anIntArray615[local54] + this.anIntArray616[local54] * local60 + 16383 >> 14;
								this.anIntArray616[local54] = local278 * this.anIntArray616[local54] + 16383 - this.anIntArray615[local54] * local60 >> 14;
								this.anIntArray615[local54] = local297;
							}
							if (arg2 != 0) {
								local60 = Class151.anIntArray244[arg2];
								local278 = Class151.anIntArray245[arg2];
								local297 = this.anIntArray616[local54] * local278 + 16383 - local60 * this.anIntArray613[local54] >> 14;
								this.anIntArray613[local54] = this.anIntArray616[local54] * local60 + this.anIntArray613[local54] * local278 + 16383 >> 14;
								this.anIntArray616[local54] = local297;
							}
							if (arg3 != 0) {
								local60 = Class151.anIntArray244[arg3];
								local278 = Class151.anIntArray245[arg3];
								local297 = local60 * this.anIntArray613[local54] + local278 * this.anIntArray615[local54] + 16383 >> 14;
								this.anIntArray613[local54] = local278 * this.anIntArray613[local54] + 16383 - local60 * this.anIntArray615[local54] >> 14;
								this.anIntArray615[local54] = local297;
							}
							this.anIntArray615[local54] += Static307.anInt5539;
							this.anIntArray616[local54] += Static71.anInt1683;
							this.anIntArray613[local54] += Static107.anInt2175;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							this.anIntArray615[local54] -= Static307.anInt5539;
							this.anIntArray616[local54] -= Static71.anInt1683;
							this.anIntArray613[local54] -= Static107.anInt2175;
							if (arg2 != 0) {
								local60 = Class151.anIntArray244[arg2];
								local278 = Class151.anIntArray245[arg2];
								local297 = local278 * this.anIntArray616[local54] + 16383 - local60 * this.anIntArray613[local54] >> 14;
								this.anIntArray613[local54] = local278 * this.anIntArray613[local54] + local60 * this.anIntArray616[local54] + 16383 >> 14;
								this.anIntArray616[local54] = local297;
							}
							if (arg4 != 0) {
								local60 = Class151.anIntArray244[arg4];
								local278 = Class151.anIntArray245[arg4];
								local297 = this.anIntArray616[local54] * local60 + local278 * this.anIntArray615[local54] + 16383 >> 14;
								this.anIntArray616[local54] = this.anIntArray616[local54] * local278 + 16383 - this.anIntArray615[local54] * local60 >> 14;
								this.anIntArray615[local54] = local297;
							}
							if (arg3 != 0) {
								local60 = Class151.anIntArray244[arg3];
								local278 = Class151.anIntArray245[arg3];
								local297 = local278 * this.anIntArray615[local54] + local60 * this.anIntArray613[local54] + 16383 >> 14;
								this.anIntArray613[local54] = local278 * this.anIntArray613[local54] + 16383 - this.anIntArray615[local54] * local60 >> 14;
								this.anIntArray615[local54] = local297;
							}
							this.anIntArray615[local54] += Static307.anInt5539;
							this.anIntArray616[local54] += Static71.anInt1683;
							this.anIntArray613[local54] += Static107.anInt2175;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray58.length > local38) {
						local52 = this.anIntArrayArray58[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local278 = this.anIntArray617[local60];
							local297 = this.anIntArray617[local60 + 1];
							for (local762 = local278; local762 < local297; local762++) {
								@Pc(771) int local771 = this.aShortArray117[local762] - 1;
								if (local771 == -1) {
									break;
								}
								@Pc(780) int local780;
								@Pc(784) int local784;
								@Pc(803) int local803;
								if (arg4 != 0) {
									local780 = Class151.anIntArray244[arg4];
									local784 = Class151.anIntArray245[arg4];
									local803 = this.aShortArray119[local771] * local780 + local784 * this.aShortArray121[local771] + 16383 >> 14;
									this.aShortArray119[local771] = (short) (local784 * this.aShortArray119[local771] + 16383 - this.aShortArray121[local771] * local780 >> 14);
									this.aShortArray121[local771] = (short) local803;
								}
								if (arg2 != 0) {
									local780 = Class151.anIntArray244[arg2];
									local784 = Class151.anIntArray245[arg2];
									local803 = local784 * this.aShortArray119[local771] + 16383 - this.aShortArray122[local771] * local780 >> 14;
									this.aShortArray122[local771] = (short) (this.aShortArray122[local771] * local784 + this.aShortArray119[local771] * local780 + 16383 >> 14);
									this.aShortArray119[local771] = (short) local803;
								}
								if (arg3 != 0) {
									local780 = Class151.anIntArray244[arg3];
									local784 = Class151.anIntArray245[arg3];
									local803 = this.aShortArray122[local771] * local780 + local784 * this.aShortArray121[local771] + 16383 >> 14;
									this.aShortArray122[local771] = (short) (local784 * this.aShortArray122[local771] + 16383 - local780 * this.aShortArray121[local771] >> 14);
									this.aShortArray121[local771] = (short) local803;
								}
							}
						}
					}
				}
				if (this.aClass97_11 == null && this.aClass97_12 != null) {
					this.aClass97_12.anInterface1_4 = null;
				}
				if (this.aClass97_11 != null) {
					this.aClass97_11.anInterface1_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray58.length) {
					local161 = this.anIntArrayArray58[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local54 = local161[local163];
						this.anIntArray615[local54] -= Static307.anInt5539;
						this.anIntArray616[local54] -= Static71.anInt1683;
						this.anIntArray613[local54] -= Static107.anInt2175;
						this.anIntArray615[local54] = this.anIntArray615[local54] * arg2 >> 7;
						this.anIntArray616[local54] = arg3 * this.anIntArray616[local54] >> 7;
						this.anIntArray613[local54] = this.anIntArray613[local54] * arg4 >> 7;
						this.anIntArray615[local54] += Static307.anInt5539;
						this.anIntArray616[local54] += Static71.anInt1683;
						this.anIntArray613[local54] += Static107.anInt2175;
					}
				}
			}
		} else {
			@Pc(1221) Class89 local1221;
			@Pc(1226) Class54 local1226;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray59.length) {
							local161 = this.anIntArrayArray59[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local54 = local161[local163];
								local60 = arg2 * 8 + (this.aByteArray99[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray99[local54] = (byte) local60;
							}
							if (local161.length > 0 && this.aClass97_12 != null) {
								this.aClass97_12.anInterface1_4 = null;
							}
						}
					}
					if (this.aClass89Array1 != null) {
						for (local32 = 0; local32 < this.anInt9195; local32++) {
							local1221 = this.aClass89Array1[local32];
							local1226 = this.aClass54Array1[local32];
							local1226.anInt1811 = 255 - (this.aByteArray99[local1221.anInt2516] & 0xFF) << 24 | local1226.anInt1811 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1480) Class54 local1480;
				if (arg0 == 8) {
					if (this.anIntArrayArray60 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray60.length) {
								local161 = this.anIntArrayArray60[local32];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1480 = this.aClass54Array1[local161[local163]];
									local1480.anInt1810 += arg2;
									local1480.anInt1805 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray60 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray60.length) {
								local161 = this.anIntArrayArray60[local32];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1480 = this.aClass54Array1[local161[local163]];
									local1480.anInt1815 = local1480.anInt1815 * arg3 >> 7;
									local1480.anInt1813 = local1480.anInt1813 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray60 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray60.length > local32) {
							local161 = this.anIntArrayArray60[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1480 = this.aClass54Array1[local161[local163]];
								local1480.anInt1809 = local1480.anInt1809 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray59 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray59.length) {
						local161 = this.anIntArrayArray59[local32];
						for (local163 = 0; local163 < local161.length; local163++) {
							local54 = local161[local163];
							local60 = this.aShortArray114[local54] & 0xFFFF;
							local278 = local60 >> 10 & 0x3F;
							local297 = local60 >> 7 & 0x7;
							@Pc(1316) int local1316 = local278 + arg2 & 0x3F;
							local297 += arg3 / 4;
							local762 = local60 & 0x7F;
							local762 += arg4;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							if (local762 < 0) {
								local762 = 0;
							} else if (local762 > 127) {
								local762 = 127;
							}
							this.aShortArray114[local54] = (short) (local762 | local297 << 7 | local1316 << 10);
						}
						if (local161.length > 0 && this.aClass97_12 != null) {
							this.aClass97_12.anInterface1_4 = null;
						}
					}
				}
				if (this.aClass89Array1 != null) {
					for (local32 = 0; local32 < this.anInt9195; local32++) {
						local1221 = this.aClass89Array1[local32];
						local1226 = this.aClass54Array1[local32];
						local1226.anInt1811 = Static279.anIntArray313[this.aShortArray114[local1221.anInt2516] & 0xFFFF] & 0xFFFFFF | local1226.anInt1811 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort119;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!q;Lclient!bc;II)V")
	@Override
	public void method7592(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9228 == 0) {
			return;
		}
		@Pc(13) Class209_Sub3 local13 = this.aClass12_Sub1_39.aClass209_Sub3_3;
		if (!this.aBoolean670) {
			this.method7616();
		}
		@Pc(22) Class209_Sub3 local22 = (Class209_Sub3) arg0;
		Static108.aFloat181 = local22.aFloat170 * local13.aFloat172 + local13.aFloat169 * local22.aFloat162 + local13.aFloat166 * local22.aFloat171 + local13.aFloat170;
		Static479.aFloat209 = local13.aFloat166 * local22.aFloat161 + local13.aFloat169 * local22.aFloat163 + local13.aFloat172 * local22.aFloat166;
		@Pc(69) float local69 = Static108.aFloat181 + Static479.aFloat209 * (float) this.aShort112;
		@Pc(77) float local77 = Static108.aFloat181 + Static479.aFloat209 * (float) this.aShort116;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort120;
			local93 = local77 - (float) this.aShort120;
		} else {
			local87 = local77 + (float) this.aShort120;
			local93 = local69 - (float) this.aShort120;
		}
		if (local93 >= this.aClass12_Sub1_39.aFloat8 || (float) this.aClass12_Sub1_39.anInt476 >= local87) {
			return;
		}
		Static300.aFloat123 = local22.aFloat171 * local13.aFloat163 + local22.aFloat162 * local13.aFloat164 + local13.aFloat167 * local22.aFloat170 + local13.aFloat162;
		Static167.aFloat66 = local22.aFloat163 * local13.aFloat164 + local22.aFloat161 * local13.aFloat163 + local13.aFloat167 * local22.aFloat166;
		@Pc(169) float local169 = (float) this.aShort112 * Static167.aFloat66 + Static300.aFloat123;
		@Pc(177) float local177 = Static300.aFloat123 + Static167.aFloat66 * (float) this.aShort116;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = ((float) this.aShort120 + local169) * (float) this.aClass12_Sub1_39.anInt478;
			local203 = (local177 - (float) this.aShort120) * (float) this.aClass12_Sub1_39.anInt478;
		} else {
			local192 = (float) this.aClass12_Sub1_39.anInt478 * ((float) this.aShort120 + local177);
			local203 = (float) this.aClass12_Sub1_39.anInt478 * (local169 - (float) this.aShort120);
		}
		if (this.aClass12_Sub1_39.aFloat5 <= local203 / (float) arg2 || local192 / (float) arg2 <= this.aClass12_Sub1_39.aFloat10) {
			return;
		}
		Static146.aFloat62 = local13.aFloat168 * local22.aFloat166 + local22.aFloat163 * local13.aFloat165 + local13.aFloat161 * local22.aFloat161;
		Static593.aFloat214 = local13.aFloat171 + local13.aFloat168 * local22.aFloat170 + local13.aFloat161 * local22.aFloat171 + local13.aFloat165 * local22.aFloat162;
		@Pc(294) float local294 = (float) this.aShort112 * Static146.aFloat62 + Static593.aFloat214;
		@Pc(302) float local302 = Static593.aFloat214 + Static146.aFloat62 * (float) this.aShort116;
		@Pc(317) float local317;
		@Pc(328) float local328;
		if (local302 < local294) {
			local317 = (local302 - (float) this.aShort120) * (float) this.aClass12_Sub1_39.anInt491;
			local328 = (float) this.aClass12_Sub1_39.anInt491 * (local294 + (float) this.aShort120);
		} else {
			local328 = (float) this.aClass12_Sub1_39.anInt491 * (local302 + (float) this.aShort120);
			local317 = (local294 - (float) this.aShort120) * (float) this.aClass12_Sub1_39.anInt491;
		}
		if (this.aClass12_Sub1_39.aFloat2 <= local317 / (float) arg2 || local328 / (float) arg2 <= this.aClass12_Sub1_39.aFloat21) {
			return;
		}
		if (arg1 != null || this.aClass89Array1 != null) {
			Static469.aFloat207 = local22.aFloat167 * local13.aFloat169 + local22.aFloat168 * local13.aFloat166 + local13.aFloat172 * local22.aFloat172;
			Static280.aFloat117 = local13.aFloat161 * local22.aFloat168 + local22.aFloat167 * local13.aFloat165 + local22.aFloat172 * local13.aFloat168;
			Static349.aFloat156 = local22.aFloat164 * local13.aFloat169 + local22.aFloat165 * local13.aFloat166 + local22.aFloat169 * local13.aFloat172;
			Static96.aFloat40 = local13.aFloat168 * local22.aFloat169 + local22.aFloat164 * local13.aFloat165 + local13.aFloat161 * local22.aFloat165;
			Static452.aFloat205 = local13.aFloat164 * local22.aFloat164 + local13.aFloat163 * local22.aFloat165 + local22.aFloat169 * local13.aFloat167;
			Static386.aFloat173 = local22.aFloat172 * local13.aFloat167 + local22.aFloat168 * local13.aFloat163 + local13.aFloat164 * local22.aFloat167;
		}
		if (arg1 != null) {
			@Pc(495) int local495 = this.aShort118 + this.aShort119 >> 1;
			@Pc(504) int local504 = this.aShort111 + this.aShort117 >> 1;
			@Pc(523) int local523 = (int) (Static167.aFloat66 * (float) this.aShort112 + (float) local495 * Static452.aFloat205 + Static300.aFloat123 + (float) local504 * Static386.aFloat173);
			@Pc(542) int local542 = (int) ((float) this.aShort112 * Static146.aFloat62 + Static593.aFloat214 + (float) local495 * Static96.aFloat40 + Static280.aFloat117 * (float) local504);
			@Pc(561) int local561 = (int) (Static469.aFloat207 * (float) local504 + (float) local495 * Static349.aFloat156 + Static108.aFloat181 + (float) this.aShort112 * Static479.aFloat209);
			@Pc(580) int local580 = (int) ((float) local504 * Static386.aFloat173 + Static167.aFloat66 * (float) this.aShort116 + Static300.aFloat123 + Static452.aFloat205 * (float) local495);
			@Pc(599) int local599 = (int) (Static280.aFloat117 * (float) local504 + Static146.aFloat62 * (float) this.aShort116 + Static96.aFloat40 * (float) local495 + Static593.aFloat214);
			arg1.anInt905 = local580 * this.aClass12_Sub1_39.anInt478 / arg2 + this.aClass12_Sub1_39.anInt490;
			@Pc(631) int local631 = (int) ((float) local495 * Static349.aFloat156 + Static108.aFloat181 + Static479.aFloat209 * (float) this.aShort116 + Static469.aFloat207 * (float) local504);
			arg1.anInt901 = this.aClass12_Sub1_39.anInt491 * local542 / arg2 + this.aClass12_Sub1_39.anInt493;
			arg1.anInt902 = this.aClass12_Sub1_39.anInt493 + this.aClass12_Sub1_39.anInt491 * local599 / arg2;
			arg1.anInt904 = this.aClass12_Sub1_39.anInt490 + local523 * this.aClass12_Sub1_39.anInt478 / arg2;
			if (local561 >= this.aClass12_Sub1_39.anInt476 || local631 >= this.aClass12_Sub1_39.anInt476) {
				arg1.anInt903 = this.aClass12_Sub1_39.anInt490 + (local523 + this.aShort120) * this.aClass12_Sub1_39.anInt478 / arg2 - arg1.anInt904;
				arg1.aBoolean78 = true;
			}
		}
		this.aClass12_Sub1_39.method379((float) arg2);
		this.aClass12_Sub1_39.method411();
		this.aClass12_Sub1_39.method383(local22);
		this.method7618();
		this.aClass12_Sub1_39.method402();
		this.method7614();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class61 method7591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class61_Sub3 local16;
		@Pc(12) Class61_Sub3 local12;
		if (arg0 == 1) {
			local12 = this.aClass12_Sub1_39.aClass61_Sub3_9;
			local16 = this.aClass12_Sub1_39.aClass61_Sub3_1;
		} else if (arg0 == 2) {
			local16 = this.aClass12_Sub1_39.aClass61_Sub3_3;
			local12 = this.aClass12_Sub1_39.aClass61_Sub3_8;
		} else if (arg0 == 3) {
			local16 = this.aClass12_Sub1_39.aClass61_Sub3_4;
			local12 = this.aClass12_Sub1_39.aClass61_Sub3_7;
		} else if (arg0 == 4) {
			local12 = this.aClass12_Sub1_39.aClass61_Sub3_2;
			local16 = this.aClass12_Sub1_39.aClass61_Sub3_10;
		} else if (arg0 == 5) {
			local12 = this.aClass12_Sub1_39.aClass61_Sub3_6;
			local16 = this.aClass12_Sub1_39.aClass61_Sub3_5;
		} else {
			local16 = local12 = new Class61_Sub3(this.aClass12_Sub1_39);
		}
		return this.method7622(arg2, arg1, arg0 != 0, local12, local16);
	}

	@OriginalMember(owner = "client!vp", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort118;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt9238; local7++) {
			local16 = this.aShortArray114[local7] & 0xFFFF;
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
				local32 -= -((arg2 - local32) * arg3 >> 7);
			}
			this.aShortArray114[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass89Array1 != null) {
			for (local16 = 0; local16 < this.anInt9195; local16++) {
				@Pc(108) Class89 local108 = this.aClass89Array1[local16];
				@Pc(113) Class54 local113 = this.aClass54Array1[local16];
				local113.anInt1811 = local113.anInt1811 & 0xFF000000 | Static279.anIntArray313[this.aShortArray114[local108.anInt2516] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "()[Lclient!mp;")
	@Override
	public Class219[] method7597() {
		return this.aClass219Array5;
	}

	@OriginalMember(owner = "client!vp", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort115 = (short) arg0;
		if (this.aClass97_12 != null) {
			this.aClass97_12.anInterface1_4 = null;
		}
		if (this.aClass97_11 != null) {
			this.aClass97_11.anInterface1_4 = null;
		}
	}

	@OriginalMember(owner = "client!vp", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub3_Sub4 S(@OriginalArg(0) Class1_Sub3_Sub4 arg0) {
		if (this.anInt9228 == 0) {
			return null;
		}
		if (!this.aBoolean670) {
			this.method7616();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass12_Sub1_39.anInt501 <= 0) {
			local40 = this.aShort118 - (this.aShort112 * this.aClass12_Sub1_39.anInt501 >> 8) >> this.aClass12_Sub1_39.anInt463;
			local57 = this.aShort119 - (this.aShort116 * this.aClass12_Sub1_39.anInt501 >> 8) >> this.aClass12_Sub1_39.anInt463;
		} else {
			local40 = this.aShort118 - (this.aClass12_Sub1_39.anInt501 * this.aShort116 >> 8) >> this.aClass12_Sub1_39.anInt463;
			local57 = this.aShort119 - (this.aClass12_Sub1_39.anInt501 * this.aShort112 >> 8) >> this.aClass12_Sub1_39.anInt463;
		}
		@Pc(114) int local114;
		@Pc(130) int local130;
		if (this.aClass12_Sub1_39.anInt496 <= 0) {
			local114 = this.aShort111 - (this.aClass12_Sub1_39.anInt496 * this.aShort112 >> 8) >> this.aClass12_Sub1_39.anInt463;
			local130 = this.aShort117 - (this.aShort116 * this.aClass12_Sub1_39.anInt496 >> 8) >> this.aClass12_Sub1_39.anInt463;
		} else {
			local114 = this.aShort111 - (this.aClass12_Sub1_39.anInt496 * this.aShort116 >> 8) >> this.aClass12_Sub1_39.anInt463;
			local130 = this.aShort117 - (this.aClass12_Sub1_39.anInt496 * this.aShort112 >> 8) >> this.aClass12_Sub1_39.anInt463;
		}
		@Pc(171) int local171 = local57 + 1 - local40;
		@Pc(178) int local178 = local130 + 1 - local114;
		@Pc(181) Class1_Sub3_Sub4_Sub1 local181 = (Class1_Sub3_Sub4_Sub1) arg0;
		@Pc(191) Class1_Sub3_Sub4_Sub1 local191;
		if (local181 != null && local181.method846(local171, local178)) {
			local191 = local181;
			local181.method848();
		} else {
			local191 = new Class1_Sub3_Sub4_Sub1(this.aClass12_Sub1_39, local171, local178);
		}
		local191.method845(local114, local57, local40, local130);
		this.method7617(local191);
		return local191;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3) {
		return this.method7625(arg3, arg0, arg1, -1, arg2);
	}

	@OriginalMember(owner = "client!vp", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort111;
	}

	@OriginalMember(owner = "client!vp", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean673;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBIIIIIII)Z")
	private boolean method7624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg3 && arg4 > arg6 && arg6 < arg5) {
			return false;
		} else if (arg3 < arg6 && arg6 > arg4 && arg6 > arg5) {
			return false;
		} else if (arg7 > arg0 && arg0 < arg2 && arg1 > arg0) {
			return false;
		} else {
			return arg0 <= arg7 || arg2 >= arg0 || arg1 >= arg0;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIIIILclient!q;)Z")
	private boolean method7625(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class209 arg4) {
		@Pc(8) Class209_Sub3 local8 = (Class209_Sub3) arg4;
		@Pc(12) Class209_Sub3 local12 = this.aClass12_Sub1_39.aClass209_Sub3_3;
		@Pc(33) float local33 = local8.aFloat162 * local12.aFloat164 + local12.aFloat163 * local8.aFloat171 + local8.aFloat170 * local12.aFloat167 + local12.aFloat162;
		@Pc(54) float local54 = local8.aFloat162 * local12.aFloat165 + local12.aFloat161 * local8.aFloat171 + local8.aFloat170 * local12.aFloat168 + local12.aFloat171;
		Static146.aFloat62 = local8.aFloat161 * local12.aFloat161 + local12.aFloat165 * local8.aFloat163 + local8.aFloat166 * local12.aFloat168;
		Static452.aFloat205 = local12.aFloat167 * local8.aFloat169 + local8.aFloat165 * local12.aFloat163 + local12.aFloat164 * local8.aFloat164;
		@Pc(111) float local111 = local12.aFloat169 * local8.aFloat162 + local8.aFloat171 * local12.aFloat166 + local12.aFloat172 * local8.aFloat170 + local12.aFloat170;
		Static386.aFloat173 = local12.aFloat163 * local8.aFloat168 + local8.aFloat167 * local12.aFloat164 + local8.aFloat172 * local12.aFloat167;
		Static479.aFloat209 = local8.aFloat163 * local12.aFloat169 + local8.aFloat161 * local12.aFloat166 + local12.aFloat172 * local8.aFloat166;
		Static349.aFloat156 = local12.aFloat166 * local8.aFloat165 + local12.aFloat169 * local8.aFloat164 + local12.aFloat172 * local8.aFloat169;
		Static280.aFloat117 = local8.aFloat172 * local12.aFloat168 + local8.aFloat167 * local12.aFloat165 + local8.aFloat168 * local12.aFloat161;
		Static167.aFloat66 = local12.aFloat163 * local8.aFloat161 + local12.aFloat164 * local8.aFloat163 + local8.aFloat166 * local12.aFloat167;
		Static96.aFloat40 = local12.aFloat161 * local8.aFloat165 + local8.aFloat164 * local12.aFloat165 + local8.aFloat169 * local12.aFloat168;
		Static469.aFloat207 = local12.aFloat166 * local8.aFloat168 + local8.aFloat167 * local12.aFloat169 + local12.aFloat172 * local8.aFloat172;
		@Pc(244) boolean local244 = false;
		@Pc(246) float local246 = Float.MAX_VALUE;
		@Pc(248) float local248 = -3.4028235E38F;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass12_Sub1_39.anInt478;
		@Pc(260) int local260 = this.aClass12_Sub1_39.anInt491;
		if (!this.aBoolean670) {
			this.method7616();
		}
		Static56.anIntArray68[0] = this.aShort118;
		Static401.anIntArray475[0] = this.aShort112;
		Static541.anIntArray629[0] = this.aShort111;
		Static56.anIntArray68[1] = this.aShort119;
		Static401.anIntArray475[1] = this.aShort112;
		Static541.anIntArray629[1] = this.aShort111;
		Static56.anIntArray68[2] = this.aShort118;
		Static401.anIntArray475[2] = this.aShort116;
		Static56.anIntArray68[3] = this.aShort119;
		Static541.anIntArray629[2] = this.aShort111;
		Static401.anIntArray475[3] = this.aShort116;
		Static56.anIntArray68[4] = this.aShort118;
		Static541.anIntArray629[3] = this.aShort111;
		Static401.anIntArray475[4] = this.aShort112;
		Static541.anIntArray629[4] = this.aShort117;
		Static56.anIntArray68[5] = this.aShort119;
		Static401.anIntArray475[5] = this.aShort112;
		Static541.anIntArray629[5] = this.aShort117;
		Static56.anIntArray68[6] = this.aShort118;
		Static401.anIntArray475[6] = this.aShort116;
		Static56.anIntArray68[7] = this.aShort119;
		Static541.anIntArray629[6] = this.aShort117;
		Static401.anIntArray475[7] = this.aShort116;
		Static541.anIntArray629[7] = this.aShort117;
		@Pc(419) float local419;
		@Pc(433) float local433;
		@Pc(447) float local447;
		@Pc(405) float local405;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static401.anIntArray475[local388];
			local400 = Static541.anIntArray629[local388];
			local405 = Static56.anIntArray68[local388];
			local419 = Static167.aFloat66 * local395 + Static452.aFloat205 * local405 + Static386.aFloat173 * local400 + local33;
			local433 = local54 + Static280.aFloat117 * local400 + Static146.aFloat62 * local395 + Static96.aFloat40 * local405;
			local447 = local400 * Static469.aFloat207 + Static349.aFloat156 * local405 + local395 * Static479.aFloat209 + local111;
			if (local447 >= (float) this.aClass12_Sub1_39.anInt476) {
				if (arg3 > 0) {
					local447 = arg3;
				}
				@Pc(474) float local474 = (float) local256 * local419 / local447 + (float) this.aClass12_Sub1_39.anInt490;
				@Pc(486) float local486 = (float) local260 * local433 / local447 + (float) this.aClass12_Sub1_39.anInt493;
				if (local248 < local474) {
					local248 = local474;
				}
				if (local246 > local474) {
					local246 = local474;
				}
				local244 = true;
				if (local486 > local252) {
					local252 = local486;
				}
				if (local250 > local486) {
					local250 = local486;
				}
			}
		}
		if (local244 && (float) arg1 > local246 && local248 > (float) arg1 && local250 < (float) arg2 && (float) arg2 < local252) {
			if (arg0) {
				return true;
			}
			if (this.aClass12_Sub1_39.anIntArray11.length < this.anInt9228) {
				this.aClass12_Sub1_39.anIntArray12 = new int[this.anInt9228];
				this.aClass12_Sub1_39.anIntArray11 = new int[this.anInt9228];
			}
			@Pc(565) int[] local565 = this.aClass12_Sub1_39.anIntArray11;
			@Pc(569) int[] local569 = this.aClass12_Sub1_39.anIntArray12;
			@Pc(661) int local661;
			for (@Pc(571) int local571 = 0; local571 < this.anInt9199; local571++) {
				local405 = this.anIntArray615[local571];
				local400 = this.anIntArray613[local571];
				local395 = this.anIntArray616[local571];
				local433 = local405 * Static96.aFloat40 + local395 * Static146.aFloat62 + local400 * Static280.aFloat117 + local54;
				local447 = local111 + Static469.aFloat207 * local400 + local395 * Static479.aFloat209 + local405 * Static349.aFloat156;
				local419 = local33 + Static386.aFloat173 * local400 + local395 * Static167.aFloat66 + local405 * Static452.aFloat205;
				@Pc(674) int local674;
				@Pc(679) int local679;
				@Pc(686) int local686;
				if (local447 >= (float) this.aClass12_Sub1_39.anInt476) {
					if (arg3 > 0) {
						local447 = arg3;
					}
					local661 = (int) (local419 * (float) local256 / local447 + (float) this.aClass12_Sub1_39.anInt490);
					local674 = (int) ((float) local260 * local433 / local447 + (float) this.aClass12_Sub1_39.anInt493);
					local679 = this.anIntArray617[local571];
					local686 = this.anIntArray617[local571 + 1];
					for (@Pc(688) int local688 = local679; local688 < local686; local688++) {
						@Pc(697) int local697 = this.aShortArray117[local688] - 1;
						if (local697 == -1) {
							break;
						}
						local565[local697] = local661;
						local569[local697] = local674;
					}
				} else {
					local661 = this.anIntArray617[local571];
					local674 = this.anIntArray617[local571 + 1];
					for (local679 = local661; local679 < local674; local679++) {
						local686 = this.aShortArray117[local679] - 1;
						if (local686 == -1) {
							break;
						}
						local565[this.aShortArray117[local679] - 1] = -999999;
					}
				}
			}
			for (local661 = 0; local661 < this.anInt9238; local661++) {
				if (local565[this.aShortArray124[local661]] != -999999 && local565[this.aShortArray116[local661]] != -999999 && local565[this.aShortArray118[local661]] != -999999 && this.method7624(arg1, local565[this.aShortArray118[local661]], local565[this.aShortArray116[local661]], local569[this.aShortArray124[local661]], local569[this.aShortArray116[local661]], local569[this.aShortArray118[local661]], arg2, local565[this.aShortArray124[local661]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean670) {
			this.method7616();
		}
		return this.aShort117;
	}
}
