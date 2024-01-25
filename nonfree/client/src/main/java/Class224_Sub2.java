import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class224_Sub2 extends Class224 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "[Lclient!in;")
	private Class119[] aClass119Array3;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "[Lclient!ca;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "B")
	private byte aByte101;

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
	private int anInt7068;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "Lclient!lp;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!uc", name = "gb", descriptor = "[Lclient!gq;")
	private Class94[] aClass94Array3;

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
	private int anInt7071;

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!uc", name = "rb", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!uc", name = "sb", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!uc", name = "tb", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!uc", name = "zb", descriptor = "I")
	private int anInt7081;

	@OriginalMember(owner = "client!uc", name = "Bb", descriptor = "[Lclient!gi;")
	private Class89[] aClass89Array1;

	@OriginalMember(owner = "client!uc", name = "Eb", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!uc", name = "Mb", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!uc", name = "Nb", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!uc", name = "Ob", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!uc", name = "Pb", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!uc", name = "Qb", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!uc", name = "Vb", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!uc", name = "ac", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!uc", name = "cc", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!uc", name = "dc", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!uc", name = "ec", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!uc", name = "gc", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!uc", name = "hc", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!uc", name = "ic", descriptor = "[I")
	private int[] anIntArray492;

	@OriginalMember(owner = "client!uc", name = "rc", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!uc", name = "sc", descriptor = "Lclient!re;")
	private Class211 aClass211_1;

	@OriginalMember(owner = "client!uc", name = "uc", descriptor = "Lclient!ms;")
	private Interface5 anInterface5_7;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
	private int anInt7063 = 0;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Z")
	private boolean aBoolean454 = true;

	@OriginalMember(owner = "client!uc", name = "bc", descriptor = "I")
	private int anInt7098 = 0;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
	private int anInt7069 = 0;

	@OriginalMember(owner = "client!uc", name = "yb", descriptor = "I")
	private int anInt7080 = 0;

	@OriginalMember(owner = "client!uc", name = "jc", descriptor = "I")
	private int anInt7100 = 0;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_40;

	@OriginalMember(owner = "client!uc", name = "Hb", descriptor = "Lclient!bh;")
	private Class23 aClass23_16;

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "Lclient!bh;")
	private Class23 aClass23_15;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "Lclient!bh;")
	private Class23 aClass23_14;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Lclient!bh;")
	private Class23 aClass23_13;

	@OriginalMember(owner = "client!uc", name = "tc", descriptor = "Lclient!os;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class224_Sub2(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_40 = arg0;
		this.aClass23_16 = new Class23(this.aClass66_Sub2_40, null, 5126, 3, 0);
		this.aClass23_15 = new Class23(this.aClass66_Sub2_40, null, 5126, 2, 0);
		this.aClass23_14 = new Class23(this.aClass66_Sub2_40, null, 5126, 3, 0);
		this.aClass23_13 = new Class23(this.aClass66_Sub2_40, null, 5121, 4, 0);
		this.aClass186_1 = new Class186();
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!rl;Lclient!fl;IIII)V")
	public Class224_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass66_Sub2_40 = arg0;
		this.anInt7081 = arg5;
		this.anInt7068 = arg2;
		if (Static88.method4159(arg5, arg2)) {
			this.aClass23_16 = new Class23(this.aClass66_Sub2_40, null, 5126, 3, 0);
		}
		if (Static22.method653(arg5, arg2)) {
			this.aClass23_15 = new Class23(this.aClass66_Sub2_40, null, 5126, 2, 0);
		}
		if (Static368.method4872(arg2, arg5)) {
			this.aClass23_14 = new Class23(this.aClass66_Sub2_40, null, 5126, 3, 0);
		}
		if (Static209.method2238(arg2, arg5)) {
			this.aClass23_13 = new Class23(this.aClass66_Sub2_40, null, 5121, 4, 0);
		}
		if (Static214.method3234(arg5, arg2)) {
			this.aClass186_1 = new Class186();
		}
		@Pc(110) Interface8 local110 = arg0.anInterface8_5;
		this.anIntArray490 = new int[arg1.anInt2406 + 1];
		@Pc(121) int[] local121 = new int[arg1.anInt2414];
		for (@Pc(123) int local123 = 0; local123 < arg1.anInt2414; local123++) {
			if ((arg1.aByteArray33 == null || arg1.aByteArray33[local123] != 2) && (arg1.aShortArray34 == null || arg1.aShortArray34[local123] == -1 || !local110.method5566(arg1.aShortArray34[local123] & 0xFFFF).aBoolean331)) {
				local121[this.anInt7063++] = local123;
				this.anIntArray490[arg1.aShortArray32[local123]]++;
				this.anIntArray490[arg1.aShortArray35[local123]]++;
				this.anIntArray490[arg1.aShortArray28[local123]]++;
			}
		}
		this.anInt7080 = this.anInt7063;
		@Pc(214) long[] local214 = new long[this.anInt7063];
		@Pc(223) boolean local223 = (this.anInt7068 & 0x100) != 0;
		@Pc(235) int local235;
		@Pc(246) int local246;
		@Pc(374) int local374;
		label488: for (@Pc(225) int local225 = 0; local225 < this.anInt7063; local225++) {
			@Pc(231) int local231 = local121[local225];
			@Pc(233) Class184 local233 = null;
			local235 = 0;
			@Pc(237) byte local237 = 0;
			@Pc(239) byte local239 = 0;
			@Pc(241) byte local241 = 0;
			if (arg1.aClass43Array1 != null) {
				for (local246 = 0; local246 < arg1.aClass43Array1.length; local246++) {
					@Pc(253) Class43 local253 = arg1.aClass43Array1[local246];
					if (local253.anInt1709 == local231) {
						@Pc(262) Class150 local262 = Static148.method2550(local253.anInt1707);
						if (local262.aBoolean269) {
							local214[local225] = Long.MAX_VALUE;
							this.anInt7080--;
							continue label488;
						}
					}
				}
			}
			@Pc(285) short local285 = -1;
			if (arg1.aShortArray34 != null) {
				local285 = arg1.aShortArray34[local231];
				if (local285 != -1) {
					local233 = local110.method5566(local285 & 0xFFFF);
					local241 = local233.aByte69;
					local239 = local233.aByte72;
				}
			}
			@Pc(330) boolean local330 = arg1.aByteArray32 != null && arg1.aByteArray32[local231] != 0 || local233 != null && !local233.aBoolean324;
			if ((local223 || local330) && arg1.aByteArray31 != null) {
				local235 += arg1.aByteArray31[local231] << 17;
			}
			if (local330) {
				local235 += 65536;
			}
			local235 += (local239 & 0xFF) << 8;
			local235 += local241 & 0xFF;
			local374 = local237 + ((local285 & 0xFFFF) << 16);
			@Pc(380) int local380 = local374 + (local225 & 0xFFFF);
			local214[local225] = ((long) local235 << 32) + ((long) local380);
		}
		Static236.method3642(local121, local214);
		this.anIntArray491 = arg1.anIntArray149;
		this.anIntArray492 = arg1.anIntArray145;
		this.anInt7100 = arg1.anInt2409;
		this.anIntArray489 = arg1.anIntArray151;
		this.anInt7069 = arg1.anInt2406;
		this.aShortArray106 = arg1.aShortArray27;
		this.aClass94Array3 = arg1.aClass94Array1;
		this.aClass119Array3 = arg1.aClass119Array1;
		@Pc(436) Class42[] local436 = new Class42[this.anInt7069];
		@Pc(456) int local456;
		@Pc(470) int local470;
		if (arg1.aClass43Array1 != null) {
			this.anInt7071 = arg1.aClass43Array1.length;
			this.aClass89Array1 = new Class89[this.anInt7071];
			this.aClass33Array1 = new Class33[this.anInt7071];
			for (local456 = 0; local456 < this.anInt7071; local456++) {
				@Pc(463) Class43 local463 = arg1.aClass43Array1[local456];
				@Pc(468) Class150 local468 = Static148.method2550(local463.anInt1707);
				local470 = -1;
				for (@Pc(472) int local472 = 0; local472 < this.anInt7063; local472++) {
					if (local121[local472] == local463.anInt1709) {
						local470 = local472;
						break;
					}
				}
				if (local470 == -1) {
					throw new RuntimeException();
				}
				local246 = Static427.anIntArray525[arg1.aShortArray29[local463.anInt1709] & 0xFFFF] & 0xFFFFFF;
				local246 |= 255 - (arg1.aByteArray32 == null ? 0 : arg1.aByteArray32[local463.anInt1709]) << 24;
				this.aClass33Array1[local456] = new Class33(local470, arg1.aShortArray32[local463.anInt1709], arg1.aShortArray35[local463.anInt1709], arg1.aShortArray28[local463.anInt1709], local468.anInt4051, local468.anInt4062, local468.anInt4060, local468.anInt4055, local468.anInt4050, local468.aBoolean269, local468.aBoolean268, local463.anInt1710);
				this.aClass89Array1[local456] = new Class89(local246);
			}
		}
		local456 = this.anInt7063 * 3;
		this.aShortArray107 = new short[this.anInt7063];
		this.aFloatArray27 = new float[local456];
		this.aShortArray105 = new short[this.anInt7063];
		this.aFloatArray28 = new float[local456];
		this.aShort96 = (short) arg4;
		this.aShortArray108 = new short[local456];
		Static380.aLongArray7 = new long[local456];
		this.aByteArray88 = new byte[local456];
		if (arg1.aShortArray33 != null) {
			this.aShortArray103 = new short[this.anInt7063];
		}
		this.aShortArray110 = new short[this.anInt7063];
		this.aShort90 = (short) arg3;
		this.aShortArray101 = new short[local456];
		this.lb = new short[this.anInt7063];
		this.aShortArray102 = new short[local456];
		this.aByteArray89 = new byte[this.anInt7063];
		this.aShortArray104 = new short[local456];
		this.aShortArray109 = new short[this.anInt7063];
		local235 = 0;
		for (local374 = 0; local374 < arg1.anInt2406; local374++) {
			local470 = this.anIntArray490[local374];
			this.anIntArray490[local374] = local235;
			local235 += local470;
			local436[local374] = new Class42();
		}
		this.anIntArray490[arg1.anInt2406] = local235;
		@Pc(712) int[] local712 = null;
		@Pc(714) int[] local714 = null;
		@Pc(716) int[] local716 = null;
		@Pc(718) float[][] local718 = null;
		@Pc(744) int local744;
		@Pc(786) int local786;
		@Pc(792) int local792;
		@Pc(806) int local806;
		@Pc(808) int local808;
		@Pc(841) int local841;
		@Pc(846) int local846;
		@Pc(1011) float local1011;
		@Pc(1003) float local1003;
		@Pc(995) float local995;
		if (arg1.aByteArray34 != null) {
			@Pc(724) int local724 = arg1.anInt2402;
			@Pc(727) int[] local727 = new int[local724];
			@Pc(730) int[] local730 = new int[local724];
			@Pc(733) int[] local733 = new int[local724];
			@Pc(736) int[] local736 = new int[local724];
			@Pc(739) int[] local739 = new int[local724];
			@Pc(742) int[] local742 = new int[local724];
			for (local744 = 0; local744 < local724; local744++) {
				local727[local744] = Integer.MAX_VALUE;
				local730[local744] = -2147483647;
				local733[local744] = Integer.MAX_VALUE;
				local736[local744] = -2147483647;
				local739[local744] = Integer.MAX_VALUE;
				local742[local744] = -2147483647;
			}
			local716 = new int[local724];
			local712 = new int[local724];
			for (local786 = 0; local786 < this.anInt7063; local786++) {
				local792 = local121[local786];
				if (arg1.aByteArray34[local792] != -1) {
					local806 = arg1.aByteArray34[local792] & 0xFF;
					for (local808 = 0; local808 < 3; local808++) {
						@Pc(817) short local817;
						if (local808 == 0) {
							local817 = arg1.aShortArray32[local792];
						} else if (local808 == 1) {
							local817 = arg1.aShortArray35[local792];
						} else {
							local817 = arg1.aShortArray28[local792];
						}
						local841 = arg1.anIntArray145[local817];
						local846 = arg1.anIntArray149[local817];
						@Pc(851) int local851 = arg1.anIntArray151[local817];
						if (local841 < local727[local806]) {
							local727[local806] = local841;
						}
						if (local841 > local730[local806]) {
							local730[local806] = local841;
						}
						if (local846 < local733[local806]) {
							local733[local806] = local846;
						}
						if (local846 > local736[local806]) {
							local736[local806] = local846;
						}
						if (local851 < local739[local806]) {
							local739[local806] = local851;
						}
						if (local851 > local742[local806]) {
							local742[local806] = local851;
						}
					}
				}
			}
			local718 = new float[local724][];
			local714 = new int[local724];
			for (local792 = 0; local792 < local724; local792++) {
				@Pc(941) byte local941 = arg1.aByteArray35[local792];
				if (local941 > 0) {
					local712[local792] = (local730[local792] + local727[local792]) / 2;
					local714[local792] = (local736[local792] + local733[local792]) / 2;
					local716[local792] = (local742[local792] + local739[local792]) / 2;
					if (local941 == 1) {
						local846 = arg1.anIntArray154[local792];
						local1003 = 64.0F / (float) arg1.anIntArray146[local792];
						if (local846 == 0) {
							local995 = 1.0F;
							local1011 = 1.0F;
						} else if (local846 > 0) {
							local995 = (float) local846 / 1024.0F;
							local1011 = 1.0F;
						} else {
							local995 = 1.0F;
							local1011 = (float) -local846 / 1024.0F;
						}
					} else if (local941 == 2) {
						local995 = 64.0F / (float) arg1.anIntArray153[local792];
						local1003 = 64.0F / (float) arg1.anIntArray146[local792];
						local1011 = 64.0F / (float) arg1.anIntArray154[local792];
					} else {
						local1003 = (float) arg1.anIntArray146[local792] / 1024.0F;
						local995 = (float) arg1.anIntArray153[local792] / 1024.0F;
						local1011 = (float) arg1.anIntArray154[local792] / 1024.0F;
					}
					local718[local792] = Static187.method3013(arg1.aShortArray26[local792], local995, local1003, arg1.aByteArray37[local792] & 0xFF, arg1.aShortArray30[local792], local1011, arg1.aShortArray31[local792]);
				}
			}
		}
		@Pc(1119) Class85[] local1119 = new Class85[arg1.anInt2414];
		@Pc(1138) short local1138;
		@Pc(1149) int local1149;
		@Pc(1160) int local1160;
		@Pc(1220) int local1220;
		for (@Pc(1121) int local1121 = 0; local1121 < arg1.anInt2414; local1121++) {
			@Pc(1128) short local1128 = arg1.aShortArray32[local1121];
			@Pc(1133) short local1133 = arg1.aShortArray35[local1121];
			local1138 = arg1.aShortArray28[local1121];
			local1149 = this.anIntArray492[local1133] - this.anIntArray492[local1128];
			local1160 = this.anIntArray491[local1133] - this.anIntArray491[local1128];
			local744 = this.anIntArray489[local1133] - this.anIntArray489[local1128];
			local786 = this.anIntArray492[local1138] - this.anIntArray492[local1128];
			local792 = this.anIntArray491[local1138] - this.anIntArray491[local1128];
			local806 = this.anIntArray489[local1138] - this.anIntArray489[local1128];
			local808 = local806 * local1160 - local792 * local744;
			local1220 = local744 * local786 - local806 * local1149;
			local841 = local792 * local1149 - local1160 * local786;
			while (local808 > 8192 || local1220 > 8192 || local841 > 8192 || local808 < -8192 || local1220 < -8192 || local841 < -8192) {
				local1220 >>= 0x1;
				local841 >>= 0x1;
				local808 >>= 0x1;
			}
			local846 = (int) Math.sqrt((double) (local1220 * local1220 + local808 * local808 + local841 * local841));
			if (local846 <= 0) {
				local846 = 1;
			}
			local1220 = local1220 * 256 / local846;
			local808 = local808 * 256 / local846;
			local841 = local841 * 256 / local846;
			@Pc(1320) byte local1320 = arg1.aByteArray33 == null ? 0 : arg1.aByteArray33[local1121];
			if (local1320 == 0) {
				@Pc(1351) Class42 local1351 = local436[local1128];
				local1351.anInt1701 += local841;
				local1351.anInt1704 += local808;
				local1351.anInt1703++;
				local1351.anInt1702 += local1220;
				@Pc(1379) Class42 local1379 = local436[local1133];
				local1379.anInt1701 += local841;
				local1379.anInt1702 += local1220;
				local1379.anInt1704 += local808;
				local1379.anInt1703++;
				@Pc(1407) Class42 local1407 = local436[local1138];
				local1407.anInt1701 += local841;
				local1407.anInt1704 += local808;
				local1407.anInt1703++;
				local1407.anInt1702 += local1220;
			} else if (local1320 == 1) {
				@Pc(1336) Class85 local1336 = local1119[local1121] = new Class85();
				local1336.anInt2561 = local808;
				local1336.anInt2562 = local1220;
				local1336.anInt2560 = local841;
			}
		}
		@Pc(1444) int local1444;
		for (@Pc(1438) int local1438 = 0; local1438 < this.anInt7063; local1438++) {
			local1444 = local121[local1438];
			@Pc(1451) int local1451 = arg1.aShortArray29[local1444] & 0xFFFF;
			@Pc(1459) short local1459;
			if (arg1.aShortArray34 == null) {
				local1459 = -1;
			} else {
				local1459 = arg1.aShortArray34[local1444];
			}
			if (arg1.aByteArray34 == null) {
				local1160 = -1;
			} else {
				local1160 = arg1.aByteArray34[local1444];
			}
			if (arg1.aByteArray32 == null) {
				local744 = 0;
			} else {
				local744 = arg1.aByteArray32[local1444] & 0xFF;
			}
			@Pc(1491) float local1491 = 0.0F;
			@Pc(1493) float local1493 = 0.0F;
			@Pc(1495) float local1495 = 0.0F;
			local1011 = 0.0F;
			local1003 = 0.0F;
			local995 = 0.0F;
			@Pc(1503) byte local1503 = 0;
			@Pc(1505) byte local1505 = 0;
			@Pc(1507) int local1507 = 0;
			@Pc(1522) byte local1522;
			@Pc(1539) short local1539;
			@Pc(2285) short local2285;
			@Pc(2290) short local2290;
			if (local1459 != -1) {
				if (local1160 == -1) {
					local1003 = 0.0F;
					local1505 = 2;
					local1495 = 1.0F;
					local1493 = 1.0F;
					local995 = 0.0F;
					local1491 = 0.0F;
					local1503 = 1;
					local1011 = 1.0F;
				} else {
					local1160 &= 0xFF;
					local1522 = arg1.aByteArray35[local1160];
					@Pc(1529) short local1529;
					@Pc(1534) short local1534;
					@Pc(1568) float local1568;
					@Pc(1579) float local1579;
					@Pc(1658) float local1658;
					@Pc(1895) float local1895;
					@Pc(1903) float local1903;
					@Pc(1911) float local1911;
					@Pc(1934) float local1934;
					@Pc(1957) float local1957;
					@Pc(1980) float local1980;
					if (local1522 == 0) {
						local1529 = arg1.aShortArray32[local1444];
						local1534 = arg1.aShortArray35[local1444];
						local1539 = arg1.aShortArray28[local1444];
						local2285 = arg1.aShortArray31[local1160];
						local2290 = arg1.aShortArray30[local1160];
						@Pc(2295) short local2295 = arg1.aShortArray26[local1160];
						@Pc(2301) float local2301 = (float) arg1.anIntArray145[local2285];
						@Pc(2307) float local2307 = (float) arg1.anIntArray149[local2285];
						local1568 = arg1.anIntArray151[local2285];
						local1579 = (float) arg1.anIntArray145[local2290] - local2301;
						local1658 = (float) arg1.anIntArray149[local2290] - local2307;
						@Pc(2338) float local2338 = (float) arg1.anIntArray151[local2290] - local1568;
						@Pc(2347) float local2347 = (float) arg1.anIntArray145[local2295] - local2301;
						@Pc(2356) float local2356 = (float) arg1.anIntArray149[local2295] - local2307;
						@Pc(2364) float local2364 = (float) arg1.anIntArray151[local2295] - local1568;
						@Pc(2373) float local2373 = (float) arg1.anIntArray145[local1529] - local2301;
						@Pc(2382) float local2382 = (float) arg1.anIntArray149[local1529] - local2307;
						@Pc(2391) float local2391 = (float) arg1.anIntArray151[local1529] - local1568;
						@Pc(2399) float local2399 = (float) arg1.anIntArray145[local1534] - local2301;
						@Pc(2408) float local2408 = (float) arg1.anIntArray149[local1534] - local2307;
						local1895 = (float) arg1.anIntArray151[local1534] - local1568;
						local1903 = (float) arg1.anIntArray145[local1539] - local2301;
						local1911 = (float) arg1.anIntArray149[local1539] - local2307;
						local1934 = (float) arg1.anIntArray151[local1539] - local1568;
						local1957 = local2364 * local1658 - local2338 * local2356;
						local1980 = local2347 * local2338 - local2364 * local1579;
						@Pc(2467) float local2467 = local2356 * local1579 - local1658 * local2347;
						@Pc(2475) float local2475 = local2356 * local2467 - local2364 * local1980;
						@Pc(2484) float local2484 = local1957 * local2364 - local2467 * local2347;
						@Pc(2493) float local2493 = local1980 * local2347 - local1957 * local2356;
						@Pc(2507) float local2507 = 1.0F / (local2338 * local2493 + local1579 * local2475 + local1658 * local2484);
						local1003 = (local1934 * local2493 + local1903 * local2475 + local2484 * local1911) * local2507;
						local1491 = local2507 * (local2373 * local2475 + local2382 * local2484 + local2493 * local2391);
						local1495 = local2507 * (local1895 * local2493 + local2475 * local2399 + local2408 * local2484);
						@Pc(2558) float local2558 = local1957 * local2338 - local1579 * local2467;
						@Pc(2566) float local2566 = local1980 * local1579 - local1658 * local1957;
						@Pc(2575) float local2575 = local1658 * local2467 - local1980 * local2338;
						@Pc(2589) float local2589 = 1.0F / (local2364 * local2566 + local2347 * local2575 + local2356 * local2558);
						local1493 = (local2566 * local2391 + local2575 * local2373 + local2558 * local2382) * local2589;
						local1011 = local2589 * (local1895 * local2566 + local2575 * local2399 + local2408 * local2558);
						local995 = (local1934 * local2566 + local1903 * local2575 + local2558 * local1911) * local2589;
					} else {
						local1529 = arg1.aShortArray32[local1444];
						local1534 = arg1.aShortArray35[local1444];
						local1539 = arg1.aShortArray28[local1444];
						@Pc(1543) int local1543 = local712[local1160];
						@Pc(1547) int local1547 = local714[local1160];
						@Pc(1551) int local1551 = local716[local1160];
						@Pc(1555) float[] local1555 = local718[local1160];
						@Pc(1560) byte local1560 = arg1.aByteArray36[local1160];
						local1568 = (float) arg1.anIntArray147[local1160] / 256.0F;
						if (local1522 == 1) {
							local1579 = (float) arg1.anIntArray153[local1160] / 1024.0F;
							Static45.method6530(local1555, local1547, local1543, local1560, local1568, arg1.anIntArray151[local1529], local1551, local1579, arg1.anIntArray149[local1529], arg1.anIntArray145[local1529]);
							local1493 = Static306.aFloat58;
							local1491 = Static180.aFloat33;
							Static45.method6530(local1555, local1547, local1543, local1560, local1568, arg1.anIntArray151[local1534], local1551, local1579, arg1.anIntArray149[local1534], arg1.anIntArray145[local1534]);
							local1495 = Static180.aFloat33;
							local1011 = Static306.aFloat58;
							Static45.method6530(local1555, local1547, local1543, local1560, local1568, arg1.anIntArray151[local1539], local1551, local1579, arg1.anIntArray149[local1539], arg1.anIntArray145[local1539]);
							local1003 = Static180.aFloat33;
							local995 = Static306.aFloat58;
							local1658 = local1579 / 2.0F;
							if ((local1560 & 0x1) == 0) {
								if (local1658 < local1003 - local1491) {
									local1505 = 1;
									local1003 -= local1579;
								} else if (local1658 < local1491 - local1003) {
									local1003 += local1579;
									local1505 = 2;
								}
								if (local1495 - local1491 > local1658) {
									local1503 = 1;
									local1495 -= local1579;
								} else if (local1491 - local1495 > local1658) {
									local1495 += local1579;
									local1503 = 2;
								}
							} else {
								if (local1658 < local1011 - local1493) {
									local1503 = 1;
									local1011 -= local1579;
								} else if (local1493 - local1011 > local1658) {
									local1011 += local1579;
									local1503 = 2;
								}
								if (local1658 < local995 - local1493) {
									local995 -= local1579;
									local1505 = 1;
								} else if (local1493 - local995 > local1658) {
									local995 += local1579;
									local1505 = 2;
								}
							}
						} else if (local1522 == 2) {
							local1579 = (float) arg1.anIntArray144[local1160] / 256.0F;
							local1658 = (float) arg1.anIntArray152[local1160] / 256.0F;
							@Pc(1809) int local1809 = arg1.anIntArray145[local1534] - arg1.anIntArray145[local1529];
							@Pc(1820) int local1820 = arg1.anIntArray149[local1534] - arg1.anIntArray149[local1529];
							@Pc(1831) int local1831 = arg1.anIntArray151[local1534] - arg1.anIntArray151[local1529];
							@Pc(1842) int local1842 = arg1.anIntArray145[local1539] - arg1.anIntArray145[local1529];
							@Pc(1852) int local1852 = arg1.anIntArray149[local1539] - arg1.anIntArray149[local1529];
							@Pc(1862) int local1862 = arg1.anIntArray151[local1539] - arg1.anIntArray151[local1529];
							@Pc(1870) int local1870 = local1820 * local1862 - local1852 * local1831;
							@Pc(1879) int local1879 = local1842 * local1831 - local1809 * local1862;
							@Pc(1887) int local1887 = local1852 * local1809 - local1842 * local1820;
							local1895 = 64.0F / (float) arg1.anIntArray154[local1160];
							local1903 = 64.0F / (float) arg1.anIntArray146[local1160];
							local1911 = 64.0F / (float) arg1.anIntArray153[local1160];
							local1934 = ((float) local1879 * local1555[1] + local1555[0] * (float) local1870 + (float) local1887 * local1555[2]) / local1895;
							local1957 = ((float) local1887 * local1555[5] + (float) local1879 * local1555[4] + local1555[3] * (float) local1870) / local1903;
							local1980 = (local1555[7] * (float) local1879 + local1555[6] * (float) local1870 + (float) local1887 * local1555[8]) / local1911;
							local1507 = Static124.method2125(local1934, local1957, local1980);
							Static334.method4878(local1555, local1579, local1658, local1560, arg1.anIntArray149[local1529], arg1.anIntArray151[local1529], local1507, local1551, local1547, local1543, arg1.anIntArray145[local1529], local1568);
							local1493 = Static333.aFloat63;
							local1491 = Static311.aFloat59;
							Static334.method4878(local1555, local1579, local1658, local1560, arg1.anIntArray149[local1534], arg1.anIntArray151[local1534], local1507, local1551, local1547, local1543, arg1.anIntArray145[local1534], local1568);
							local1495 = Static311.aFloat59;
							local1011 = Static333.aFloat63;
							Static334.method4878(local1555, local1579, local1658, local1560, arg1.anIntArray149[local1539], arg1.anIntArray151[local1539], local1507, local1551, local1547, local1543, arg1.anIntArray145[local1539], local1568);
							local995 = Static333.aFloat63;
							local1003 = Static311.aFloat59;
						} else if (local1522 == 3) {
							Static279.method4202(local1543, local1551, local1560, local1555, local1568, arg1.anIntArray151[local1529], arg1.anIntArray149[local1529], arg1.anIntArray145[local1529], local1547);
							local1491 = Static71.aFloat15;
							local1493 = Static321.aFloat60;
							Static279.method4202(local1543, local1551, local1560, local1555, local1568, arg1.anIntArray151[local1534], arg1.anIntArray149[local1534], arg1.anIntArray145[local1534], local1547);
							local1011 = Static321.aFloat60;
							local1495 = Static71.aFloat15;
							Static279.method4202(local1543, local1551, local1560, local1555, local1568, arg1.anIntArray151[local1539], arg1.anIntArray149[local1539], arg1.anIntArray145[local1539], local1547);
							local1003 = Static71.aFloat15;
							local995 = Static321.aFloat60;
							if ((local1560 & 0x1) == 0) {
								if (local1003 - local1491 > 0.5F) {
									local1003--;
									local1505 = 1;
								} else if (local1491 - local1003 > 0.5F) {
									local1505 = 2;
									local1003++;
								}
								if (local1495 - local1491 > 0.5F) {
									local1503 = 1;
									local1495--;
								} else if (local1491 - local1495 > 0.5F) {
									local1495++;
									local1503 = 2;
								}
							} else {
								if (local1011 - local1493 > 0.5F) {
									local1011--;
									local1503 = 1;
								} else if (local1493 - local1011 > 0.5F) {
									local1503 = 2;
									local1011++;
								}
								if (local995 - local1493 > 0.5F) {
									local995--;
									local1505 = 1;
								} else if (local1493 - local995 > 0.5F) {
									local1505 = 2;
									local995++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray33 == null) {
				local1522 = 0;
			} else {
				local1522 = arg1.aByteArray33[local1444];
			}
			if (local1522 == 0) {
				@Pc(2808) long local2808 = ((long) local744 + (long) (local1451 << 8) + (long) (local1507 << 24) << 32) + (long) (local1160 << 2);
				local1539 = arg1.aShortArray32[local1444];
				local2285 = arg1.aShortArray35[local1444];
				local2290 = arg1.aShortArray28[local1444];
				@Pc(2827) Class42 local2827 = local436[local1539];
				this.aShortArray110[local1438] = this.method5846(local1493, local2827.anInt1703, local2808, local2827.anInt1704, arg1, local1539, local2827.anInt1702, local2827.anInt1701, local1491);
				@Pc(2851) Class42 local2851 = local436[local2285];
				this.aShortArray105[local1438] = this.method5846(local1011, local2851.anInt1703, (long) local1503 + local2808, local2851.anInt1704, arg1, local2285, local2851.anInt1702, local2851.anInt1701, local1495);
				@Pc(2878) Class42 local2878 = local436[local2290];
				this.aShortArray107[local1438] = this.method5846(local995, local2878.anInt1703, local2808 + (long) local1505, local2878.anInt1704, arg1, local2290, local2878.anInt1702, local2878.anInt1701, local1003);
			} else if (local1522 == 1) {
				@Pc(2672) Class85 local2672 = local1119[local1444];
				@Pc(2714) long local2714 = ((long) (local1507 << 24) + (long) (local1451 << 8) + (long) local744 << 32) + (long) ((local2672.anInt2562 + 256 << 12) + (local2672.anInt2561 <= 0 ? 2048 : 1024) + ((local1160 << 2) - -(local2672.anInt2560 + 256 << 22)));
				this.aShortArray110[local1438] = this.method5846(local1493, 0, local2714, local2672.anInt2561, arg1, arg1.aShortArray32[local1444], local2672.anInt2562, local2672.anInt2560, local1491);
				this.aShortArray105[local1438] = this.method5846(local1011, 0, (long) local1503 + local2714, local2672.anInt2561, arg1, arg1.aShortArray35[local1444], local2672.anInt2562, local2672.anInt2560, local1495);
				this.aShortArray107[local1438] = this.method5846(local995, 0, (long) local1505 + local2714, local2672.anInt2561, arg1, arg1.aShortArray28[local1444], local2672.anInt2562, local2672.anInt2560, local1003);
			}
			if (arg1.aShortArray34 == null) {
				this.lb[local1438] = -1;
			} else {
				this.lb[local1438] = arg1.aShortArray34[local1444];
			}
			if (arg1.aByteArray32 != null) {
				this.aByteArray89[local1438] = arg1.aByteArray32[local1444];
			}
			if (arg1.aShortArray33 != null) {
				this.aShortArray103[local1438] = arg1.aShortArray33[local1444];
			}
			this.aShortArray109[local1438] = arg1.aShortArray29[local1444];
		}
		local1444 = 0;
		local1138 = -10000;
		for (local1149 = 0; local1149 < this.anInt7080; local1149++) {
			@Pc(2971) short local2971 = this.lb[local1149];
			if (local2971 != local1138) {
				local1138 = local2971;
				local1444++;
			}
		}
		this.anIntArray488 = new int[local1444 + 1];
		local1444 = 0;
		local1138 = -10000;
		for (local1160 = 0; local1160 < this.anInt7080; local1160++) {
			@Pc(3005) short local3005 = this.lb[local1160];
			if (local1138 != local3005) {
				this.anIntArray488[local1444++] = local1160;
				local1138 = local3005;
			}
		}
		this.anIntArray488[local1444] = this.anInt7080;
		Static380.aLongArray7 = null;
		this.aShortArray102 = Static336.method4885(this.anInt7098, this.aShortArray102);
		this.aShortArray108 = Static336.method4885(this.anInt7098, this.aShortArray108);
		this.aShortArray104 = Static336.method4885(this.anInt7098, this.aShortArray104);
		this.aByteArray88 = Static432.method6293(this.anInt7098, this.aByteArray88);
		this.aFloatArray27 = Static59.method1321(this.anInt7098, this.aFloatArray27);
		this.aFloatArray28 = Static59.method1321(this.anInt7098, this.aFloatArray28);
		if (arg1.anIntArray150 != null && Static120.method2812(arg2, this.anInt7081)) {
			this.anIntArrayArray49 = arg1.method1973();
		}
		if (arg1.aClass43Array1 != null && Static54.method1223(this.anInt7081, arg2)) {
			this.anIntArrayArray50 = arg1.method1976();
		}
		if (arg1.anIntArray148 != null && Static387.method5710(this.anInt7081, arg2)) {
			local744 = 0;
			@Pc(3123) int[] local3123 = new int[256];
			for (local792 = 0; local792 < this.anInt7063; local792++) {
				local806 = arg1.anIntArray148[local121[local792]];
				if (local806 >= 0) {
					@Pc(3143) int local3143 = local3123[local806]++;
					if (local744 < local806) {
						local744 = local806;
					}
				}
			}
			this.anIntArrayArray48 = new int[local744 + 1][];
			for (local806 = 0; local806 <= local744; local806++) {
				this.anIntArrayArray48[local806] = new int[local3123[local806]];
				local3123[local806] = 0;
			}
			for (local808 = 0; local808 < this.anInt7063; local808++) {
				local1220 = arg1.anIntArray148[local121[local808]];
				if (local1220 >= 0) {
					this.anIntArrayArray48[local1220][local3123[local1220]++] = local808;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "()V")
	@Override
	protected void method5810() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7100; local3++) {
			this.anIntArray492[local3] = this.anIntArray492[local3] + 7 >> 4;
			this.anIntArray491[local3] = this.anIntArray491[local3] + 7 >> 4;
			this.anIntArray489[local3] = this.anIntArray489[local3] + 7 >> 4;
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!va;IIIZ)V")
	@Override
	public void method5825(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class224_Sub2 local8 = (Class224_Sub2) arg0;
		if (this.anInt7063 == 0 || local8.anInt7063 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt7069;
		@Pc(21) int[] local21 = local8.anIntArray492;
		@Pc(24) int[] local24 = local8.anIntArray491;
		@Pc(27) int[] local27 = local8.anIntArray489;
		@Pc(30) short[] local30 = local8.aShortArray102;
		@Pc(33) short[] local33 = local8.aShortArray108;
		@Pc(36) short[] local36 = local8.aShortArray104;
		@Pc(39) byte[] local39 = local8.aByteArray88;
		@Pc(46) short[] local46;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(50) byte[] local50;
		if (this.aClass211_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local50 = this.aClass211_1.aByteArray72;
			local44 = this.aClass211_1.aShortArray89;
			local48 = this.aClass211_1.aShortArray88;
			local46 = this.aClass211_1.aShortArray90;
		}
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(77) short[] local77;
		@Pc(73) byte[] local73;
		if (local8.aClass211_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local75 = local8.aClass211_1.aShortArray89;
			local77 = local8.aClass211_1.aShortArray88;
			local79 = local8.aClass211_1.aShortArray90;
			local73 = local8.aClass211_1.aByteArray72;
		}
		@Pc(100) int[] local100 = local8.anIntArray490;
		@Pc(103) short[] local103 = local8.aShortArray101;
		if (!local8.aBoolean455) {
			local8.method5848();
		}
		@Pc(112) short local112 = local8.aShort93;
		@Pc(115) short local115 = local8.aShort92;
		@Pc(118) short local118 = local8.aShort91;
		@Pc(121) short local121 = local8.aShort94;
		@Pc(124) short local124 = local8.aShort97;
		@Pc(127) short local127 = local8.aShort95;
		for (@Pc(129) int local129 = 0; local129 < this.anInt7069; local129++) {
			@Pc(138) int local138 = this.anIntArray491[local129] - arg2;
			if (local138 >= local112 && local115 >= local138) {
				@Pc(158) int local158 = this.anIntArray492[local129] - arg1;
				if (local118 <= local158 && local121 >= local158) {
					@Pc(178) int local178 = this.anIntArray489[local129] - arg3;
					if (local178 >= local124 && local178 <= local127) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray490[local129];
						@Pc(204) int local204 = this.anIntArray490[local129 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray101[local206] - 1;
							if (local192 == -1 || this.aByteArray88[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local18; local235++) {
								if (local21[local235] == local158 && local178 == local27[local235] && local138 == local24[local235]) {
									local197 = local100[local235];
									local204 = local100[local235 + 1];
									@Pc(272) int local272 = -1;
									for (@Pc(274) int local274 = local197; local274 < local204; local274++) {
										local272 = local103[local274] - 1;
										if (local272 == -1 || local39[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local46 == null) {
											this.aClass211_1 = new Class211();
											local46 = this.aClass211_1.aShortArray90 = Static369.method3608(this.aShortArray102);
											local44 = this.aClass211_1.aShortArray89 = Static369.method3608(this.aShortArray108);
											local48 = this.aClass211_1.aShortArray88 = Static369.method3608(this.aShortArray104);
											local50 = this.aClass211_1.aByteArray72 = Static318.method4614(this.aByteArray88);
										}
										if (local79 == null) {
											@Pc(354) Class211 local354 = local8.aClass211_1 = new Class211();
											local79 = local354.aShortArray90 = Static369.method3608(local30);
											local75 = local354.aShortArray89 = Static369.method3608(local33);
											local77 = local354.aShortArray88 = Static369.method3608(local36);
											local73 = local354.aByteArray72 = Static318.method4614(local39);
										}
										@Pc(387) short local387 = this.aShortArray102[local192];
										@Pc(392) short local392 = this.aShortArray108[local192];
										@Pc(397) short local397 = this.aShortArray104[local192];
										local197 = local100[local235];
										@Pc(406) byte local406 = this.aByteArray88[local192];
										local204 = local100[local235 + 1];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local197; local414 < local204; local414++) {
											local422 = local103[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local73[local422] != 0) {
												local79[local422] += local387;
												local75[local422] += local392;
												local77[local422] += local397;
												local73[local422] += local406;
											}
										}
										local392 = local33[local272];
										local197 = this.anIntArray490[local129];
										local406 = local39[local272];
										local204 = this.anIntArray490[local129 + 1];
										local387 = local30[local272];
										local397 = local36[local272];
										for (local422 = local197; local422 < local204; local422++) {
											@Pc(509) int local509 = this.aShortArray101[local422] - 1;
											if (local509 == -1) {
												break;
											}
											if (local50[local509] != 0) {
												local46[local509] += local387;
												local44[local509] += local392;
												local48[local509] += local397;
												local50[local509] += local406;
											}
										}
										if (this.aClass23_14 == null && this.aClass23_13 != null) {
											this.aClass23_13.anInterface5_1 = null;
										}
										if (this.aClass23_14 != null) {
											this.aClass23_14.anInterface5_1 = null;
										}
										if (local8.aClass23_14 == null && local8.aClass23_13 != null) {
											local8.aClass23_13.anInterface5_1 = null;
										}
										if (local8.aClass23_14 != null) {
											local8.aClass23_14.anInterface5_1 = null;
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

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BSBII)I")
	private int method5845(@OriginalArg(1) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23 = Static427.anIntArray525[Static113.method1985(arg3, arg2)];
		if (arg0 != -1) {
			@Pc(36) Class184 local36 = this.aClass66_Sub2_40.anInterface8_5.method5566(arg0 & 0xFFFF);
			@Pc(41) int local41 = local36.aByte73 & 0xFF;
			@Pc(50) int local50;
			@Pc(77) int local77;
			if (local41 != 0) {
				if (arg2 < 0) {
					local50 = 0;
				} else if (arg2 > 127) {
					local50 = 16777215;
				} else {
					local50 = arg2 * 131586;
				}
				if (local41 == 256) {
					local23 = local50;
				} else {
					local77 = 256 - local41;
					local23 = (local77 * (local23 & 0xFF00) + local41 * (local50 & 0xFF00) & 0xFF0000) + ((local23 & 0xFF00FF) * local77 + local41 * (local50 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local50 = local36.aByte74 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(123) int local123 = local50 * (local23 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local77 = (local23 >> 8 & 0xFF) * local50;
				if (local77 > 65535) {
					local77 = 65535;
				}
				@Pc(149) int local149 = local50 * (local23 & 0xFF);
				if (local149 > 65535) {
					local149 = 65535;
				}
				local23 = (local149 >> 8) + ((local123 & 0xD500FF00) << 8) + (local77 & 0xFF00);
			}
		}
		return (local23 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method5827(@OriginalArg(0) int arg0) {
		this.aShort90 = (short) arg0;
		if (this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	@Override
	public void method5829(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145.anIntArray279[arg0];
		@Pc(13) int local13 = Class145.anIntArray280[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7069; local15++) {
			local33 = local9 * this.anIntArray489[local15] + this.anIntArray492[local15] * local13 >> 15;
			this.anIntArray489[local15] = local13 * this.anIntArray489[local15] - this.anIntArray492[local15] * local9 >> 15;
			this.anIntArray492[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7098; local33++) {
			@Pc(87) int local87 = this.aShortArray102[local33] * local13 + this.aShortArray104[local33] * local9 >> 15;
			this.aShortArray104[local33] = (short) (this.aShortArray104[local33] * local13 - local9 * this.aShortArray102[local33] >> 15);
			this.aShortArray102[local33] = (short) local87;
		}
		if (this.aClass23_14 == null && this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
		if (this.aClass23_14 != null) {
			this.aClass23_14.anInterface5_1 = null;
		}
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
		this.aBoolean455 = false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!og;Lclient!og;III)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean455) {
			this.method5848();
		}
		@Pc(16) int local16 = this.aShort91 + arg4;
		@Pc(21) int local21 = this.aShort94 + arg4;
		@Pc(26) int local26 = this.aShort97 + arg6;
		@Pc(31) int local31 = arg6 + this.aShort95;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8047 <= local21 + arg2.anInt8050 >> arg2.anInt8051 || local26 < 0 || arg2.anInt8049 <= local31 + arg2.anInt8050 >> arg2.anInt8051)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt8050 >> arg3.anInt8051 >= arg3.anInt8047 || local26 < 0 || local31 + arg3.anInt8050 >> arg3.anInt8051 >= arg3.anInt8049) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8051;
			local21 = arg2.anInt8050 + local21 - 1 >> arg2.anInt8051;
			local26 >>= arg2.anInt8051;
			local31 = local31 + arg2.anInt8050 - 1 >> arg2.anInt8051;
			if (arg5 == arg2.method6594(local16, local26) && arg2.method6594(local21, local26) == arg5 && arg5 == arg2.method6594(local16, local31) && arg2.method6594(local21, local31) == arg5) {
				return;
			}
		}
		@Pc(193) int local193;
		if (arg0 == 1) {
			for (local193 = 0; local193 < this.anInt7069; local193++) {
				this.anIntArray491[local193] = this.anIntArray491[local193] + arg2.method6590(arg4 + this.anIntArray492[local193], arg6 + this.anIntArray489[local193]) - arg5;
			}
		} else {
			@Pc(251) int local251;
			@Pc(261) int local261;
			if (arg0 == 2) {
				@Pc(458) short local458 = this.aShort93;
				if (local458 == 0) {
					return;
				}
				for (local251 = 0; local251 < this.anInt7069; local251++) {
					local261 = (this.anIntArray491[local251] << 16) / local458;
					if (local261 < arg1) {
						this.anIntArray491[local251] -= -((arg1 - local261) * (-arg5 + arg2.method6590(arg4 + this.anIntArray492[local251], arg6 + this.anIntArray489[local251])) / arg1);
					}
				}
			} else {
				@Pc(269) int local269;
				if (arg0 == 3) {
					local193 = (arg1 & 0xFF) * 4;
					local251 = (arg1 >> 8 & 0xFF) * 4;
					local261 = (arg1 >> 16 & 0xFF) << 6;
					local269 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local193 >> 1) < 0 || arg2.anInt8047 << arg2.anInt8051 <= arg2.anInt8050 + (local193 >> 1) + arg4 || arg6 - (local251 >> 1) < 0 || arg2.anInt8049 << arg2.anInt8051 <= arg2.anInt8050 + arg6 + (local251 >> 1)) {
						return;
					}
					this.method5831(arg6, local251, arg5, arg4, arg2, local269, local261, local193);
				} else if (arg0 == 4) {
					local193 = this.aShort92 - this.aShort93;
					for (local251 = 0; local251 < this.anInt7069; local251++) {
						this.anIntArray491[local251] = local193 + this.anIntArray491[local251] + arg3.method6590(this.anIntArray492[local251] - -arg4, arg6 + this.anIntArray489[local251]) - arg5;
					}
				} else if (arg0 == 5) {
					local193 = this.aShort92 - this.aShort93;
					for (local251 = 0; local251 < this.anInt7069; local251++) {
						local261 = this.anIntArray492[local251] + arg4;
						local269 = this.anIntArray489[local251] + arg6;
						@Pc(274) int local274 = arg2.method6590(local261, local269);
						@Pc(279) int local279 = arg3.method6590(local261, local269);
						@Pc(284) int local284 = local274 - local279;
						this.anIntArray491[local251] = local274 + ((this.anIntArray491[local251] << 8) / local193 * local284 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
		this.aBoolean455 = false;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
	@Override
	public void method5841(@OriginalArg(0) int arg0) {
		if (this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
		this.aShort96 = (short) arg0;
		if (this.aClass23_14 != null) {
			this.aClass23_14.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	@Override
	public void method5840(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145.anIntArray279[arg0];
		@Pc(13) int local13 = Class145.anIntArray280[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7069; local15++) {
			@Pc(33) int local33 = this.anIntArray491[local15] * local9 + this.anIntArray492[local15] * local13 >> 15;
			this.anIntArray491[local15] = local13 * this.anIntArray491[local15] - this.anIntArray492[local15] * local9 >> 15;
			this.anIntArray492[local15] = local33;
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	@Override
	public void method5799() {
		if (this.anInt7098 <= 0 || this.anInt7080 <= 0) {
			return;
		}
		this.method5847(false);
		if ((this.aByte101 & 0x10) == 0 && this.aClass186_1.anInterface4_2 == null) {
			this.method5856(false);
		}
		this.method5857();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
	@Override
	public int method5797() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(FIJILclient!fl;IIIIF)S")
	private short method5846(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray490[arg5];
		@Pc(17) int local17 = this.anIntArray490[arg5 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray101[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg2 == Static380.aLongArray7[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray101[local19] = (short) (this.anInt7098 + 1);
		Static380.aLongArray7[local19] = arg2;
		this.aShortArray102[this.anInt7098] = (short) arg3;
		this.aShortArray108[this.anInt7098] = (short) arg6;
		this.aShortArray104[this.anInt7098] = (short) arg7;
		this.aByteArray88[this.anInt7098] = (byte) arg1;
		this.aFloatArray27[this.anInt7098] = arg8;
		this.aFloatArray28[this.anInt7098] = arg0;
		return (short) this.anInt7098++;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
	private void method5847(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null;
		@Pc(27) boolean local27 = this.aClass23_14 != null && this.aClass23_14.anInterface5_1 == null;
		@Pc(38) boolean local38 = this.aClass23_16 != null && this.aClass23_16.anInterface5_1 == null;
		@Pc(49) boolean local49 = this.aClass23_15 != null && this.aClass23_15.anInterface5_1 == null;
		if (arg0) {
			local16 &= (this.aByte101 & 0x2) != 0;
			local49 &= (this.aByte101 & 0x8) != 0;
			local27 &= (this.aByte101 & 0x4) != 0;
			local38 &= (this.aByte101 & 0x1) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		if (local38) {
			local100 = 12;
		}
		@Pc(117) byte local117 = 0;
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local117 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (Static89.aClass6_Sub1_Sub2_2.aByteArray96.length < local100 * this.anInt7098) {
			Static89.aClass6_Sub1_Sub2_2 = new Class6_Sub1_Sub2(local100 * (this.anInt7098 + 100));
		} else {
			Static89.aClass6_Sub1_Sub2_2.anInt7898 = 0;
		}
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(225) int local225;
		@Pc(234) int local234;
		if (local38) {
			@Pc(204) int local204;
			@Pc(211) int local211;
			@Pc(216) int local216;
			@Pc(223) int local223;
			if (this.aClass66_Sub2_40.aBoolean373) {
				for (local188 = 0; local188 < this.anInt7069; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray492[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray491[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray489[local188]);
					local216 = this.anIntArray490[local188];
					local223 = this.anIntArray490[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.aShortArray101[local225] - 1;
						if (local234 == -1) {
							break;
						}
						Static89.aClass6_Sub1_Sub2_2.anInt7898 = local234 * local100;
						Static89.aClass6_Sub1_Sub2_2.method6461(local197);
						Static89.aClass6_Sub1_Sub2_2.method6461(local204);
						Static89.aClass6_Sub1_Sub2_2.method6461(local211);
					}
				}
			} else {
				for (local188 = 0; local188 < this.anInt7069; local188++) {
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray492[local188]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray491[local188]);
					local211 = NativeStream.floatToRawIntBits((float) this.anIntArray489[local188]);
					local216 = this.anIntArray490[local188];
					local223 = this.anIntArray490[local188 + 1];
					for (local225 = local216; local225 < local223; local225++) {
						local234 = this.aShortArray101[local225] - 1;
						if (local234 == -1) {
							break;
						}
						Static89.aClass6_Sub1_Sub2_2.anInt7898 = local100 * local234;
						Static89.aClass6_Sub1_Sub2_2.method6470(local197);
						Static89.aClass6_Sub1_Sub2_2.method6470(local204);
						Static89.aClass6_Sub1_Sub2_2.method6470(local211);
					}
				}
			}
		}
		@Pc(469) float local469;
		@Pc(375) short[] local375;
		@Pc(371) short[] local371;
		@Pc(367) short[] local367;
		@Pc(363) byte[] local363;
		@Pc(522) float local522;
		if (local16) {
			if (this.aClass23_14 == null) {
				if (this.aClass211_1 == null) {
					local371 = this.aShortArray108;
					local375 = this.aShortArray102;
					local367 = this.aShortArray104;
					local363 = this.aByteArray88;
				} else {
					local363 = this.aClass211_1.aByteArray72;
					local367 = this.aClass211_1.aShortArray88;
					local371 = this.aClass211_1.aShortArray89;
					local375 = this.aClass211_1.aShortArray90;
				}
				@Pc(395) float local395 = this.aClass66_Sub2_40.aFloatArray21[0];
				@Pc(401) float local401 = this.aClass66_Sub2_40.aFloatArray21[1];
				@Pc(407) float local407 = this.aClass66_Sub2_40.aFloatArray21[2];
				@Pc(411) float local411 = this.aClass66_Sub2_40.aFloat77;
				@Pc(421) float local421 = this.aClass66_Sub2_40.aFloat81 * 768.0F / (float) this.aShort96;
				@Pc(431) float local431 = this.aClass66_Sub2_40.aFloat75 * 768.0F / (float) this.aShort96;
				for (@Pc(433) int local433 = 0; local433 < this.anInt7063; local433++) {
					@Pc(453) int local453 = this.method5845(this.lb[local433], this.aByteArray89[local433], this.aShort90, this.aShortArray109[local433]);
					@Pc(458) short local458 = this.aShortArray110[local433];
					local469 = (float) (local453 >> 16 & 0xFF) * this.aClass66_Sub2_40.aFloat76;
					@Pc(478) float local478 = (float) (local453 >>> 24) * this.aClass66_Sub2_40.aFloat74;
					@Pc(489) float local489 = this.aClass66_Sub2_40.aFloat84 * (float) (local453 >> 8 & 0xFF);
					@Pc(494) short local494 = (short) local363[local458];
					if (local494 == 0) {
						local522 = ((float) local367[local458] * local407 + (float) local375[local458] * local395 + local401 * (float) local371[local458]) * 0.0026041667F;
					} else {
						local522 = ((float) local375[local458] * local395 + local401 * (float) local371[local458] + (float) local367[local458] * local407) / (float) (local494 * 256);
					}
					@Pc(562) float local562 = local522 * (local522 < 0.0F ? local431 : local421) + local411;
					@Pc(567) int local567 = (int) (local562 * local478);
					if (local567 < 0) {
						local567 = 0;
					} else if (local567 > 255) {
						local567 = 255;
					}
					@Pc(586) int local586 = (int) (local469 * local562);
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					@Pc(605) int local605 = (int) (local489 * local562);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = local104 + local100 * local458;
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					Static89.aClass6_Sub1_Sub2_2.method6439(local567);
					Static89.aClass6_Sub1_Sub2_2.method6439(local586);
					Static89.aClass6_Sub1_Sub2_2.method6439(local605);
					Static89.aClass6_Sub1_Sub2_2.method6439(255 - (this.aByteArray89[local433] & 0xFF));
					local458 = this.aShortArray105[local433];
					local494 = local363[local458];
					if (local494 == 0) {
						local522 = ((float) local367[local458] * local407 + (float) local375[local458] * local395 + (float) local371[local458] * local401) * 0.0026041667F;
					} else {
						local522 = (local407 * (float) local367[local458] + local401 * (float) local371[local458] + (float) local375[local458] * local395) / (float) (local494 * 256);
					}
					local562 = (local522 < 0.0F ? local431 : local421) * local522 + local411;
					local567 = (int) (local562 * local478);
					local586 = (int) (local469 * local562);
					if (local567 < 0) {
						local567 = 0;
					} else if (local567 > 255) {
						local567 = 255;
					}
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					local605 = (int) (local562 * local489);
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = local104 + local100 * local458;
					Static89.aClass6_Sub1_Sub2_2.method6439(local567);
					Static89.aClass6_Sub1_Sub2_2.method6439(local586);
					Static89.aClass6_Sub1_Sub2_2.method6439(local605);
					Static89.aClass6_Sub1_Sub2_2.method6439(255 - (this.aByteArray89[local433] & 0xFF));
					local458 = this.aShortArray107[local433];
					local494 = local363[local458];
					if (local494 == 0) {
						local522 = (local401 * (float) local371[local458] + (float) local375[local458] * local395 + local407 * (float) local367[local458]) * 0.0026041667F;
					} else {
						local522 = ((float) local367[local458] * local407 + local401 * (float) local371[local458] + (float) local375[local458] * local395) / (float) (local494 * 256);
					}
					local562 = local411 + local522 * (local522 < 0.0F ? local431 : local421);
					local567 = (int) (local478 * local562);
					if (local567 < 0) {
						local567 = 0;
					} else if (local567 > 255) {
						local567 = 255;
					}
					local586 = (int) (local562 * local469);
					local605 = (int) (local562 * local489);
					if (local586 < 0) {
						local586 = 0;
					} else if (local586 > 255) {
						local586 = 255;
					}
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = local104 + local458 * local100;
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					Static89.aClass6_Sub1_Sub2_2.method6439(local567);
					Static89.aClass6_Sub1_Sub2_2.method6439(local586);
					Static89.aClass6_Sub1_Sub2_2.method6439(local605);
					Static89.aClass6_Sub1_Sub2_2.method6439(255 - (this.aByteArray89[local433] & 0xFF));
				}
			} else {
				for (local188 = 0; local188 < this.anInt7063; local188++) {
					local197 = this.method5845(this.lb[local188], this.aByteArray89[local188], this.aShort90, this.aShortArray109[local188]);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = local104 + local100 * this.aShortArray110[local188];
					Static89.aClass6_Sub1_Sub2_2.method6461(local197);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = this.aShortArray105[local188] * local100 + local104;
					Static89.aClass6_Sub1_Sub2_2.method6461(local197);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 = local104 + this.aShortArray107[local188] * local100;
					Static89.aClass6_Sub1_Sub2_2.method6461(local197);
				}
			}
		}
		if (local27) {
			if (this.aClass211_1 == null) {
				local371 = this.aShortArray108;
				local367 = this.aShortArray104;
				local375 = this.aShortArray102;
				local363 = this.aByteArray88;
			} else {
				local371 = this.aClass211_1.aShortArray89;
				local375 = this.aClass211_1.aShortArray90;
				local367 = this.aClass211_1.aShortArray88;
				local363 = this.aClass211_1.aByteArray72;
			}
			@Pc(1089) float local1089 = 3.0F / (float) this.aShort96;
			local522 = 3.0F / (float) (this.aShort96 + this.aShort96 / 2);
			Static89.aClass6_Sub1_Sub2_2.anInt7898 = local106;
			if (this.aClass66_Sub2_40.aBoolean373) {
				for (local225 = 0; local225 < this.anInt7098; local225++) {
					local234 = local363[local225] & 0xFF;
					if (local234 == 0) {
						Static89.aClass6_Sub1_Sub2_2.method6493(local522 * (float) local375[local225]);
						Static89.aClass6_Sub1_Sub2_2.method6493(local522 * (float) local371[local225]);
						Static89.aClass6_Sub1_Sub2_2.method6493((float) local367[local225] * local522);
					} else {
						local469 = local1089 / (float) local234;
						Static89.aClass6_Sub1_Sub2_2.method6493((float) local375[local225] * local469);
						Static89.aClass6_Sub1_Sub2_2.method6493((float) local371[local225] * local469);
						Static89.aClass6_Sub1_Sub2_2.method6493((float) local367[local225] * local469);
					}
					Static89.aClass6_Sub1_Sub2_2.anInt7898 += local100 - 12;
				}
			} else {
				for (local225 = 0; local225 < this.anInt7098; local225++) {
					local234 = local363[local225] & 0xFF;
					if (local234 == 0) {
						Static89.aClass6_Sub1_Sub2_2.method6494(local522 * (float) local375[local225]);
						Static89.aClass6_Sub1_Sub2_2.method6494((float) local371[local225] * local522);
						Static89.aClass6_Sub1_Sub2_2.method6494(local522 * (float) local367[local225]);
					} else {
						local469 = local1089 / (float) local234;
						Static89.aClass6_Sub1_Sub2_2.method6494(local469 * (float) local375[local225]);
						Static89.aClass6_Sub1_Sub2_2.method6494((float) local371[local225] * local469);
						Static89.aClass6_Sub1_Sub2_2.method6494(local469 * (float) local367[local225]);
					}
					Static89.aClass6_Sub1_Sub2_2.anInt7898 += local100 - 12;
				}
			}
		}
		if (local49) {
			Static89.aClass6_Sub1_Sub2_2.anInt7898 = local117;
			if (this.aClass66_Sub2_40.aBoolean373) {
				for (local188 = 0; local188 < this.anInt7098; local188++) {
					Static89.aClass6_Sub1_Sub2_2.method6493(this.aFloatArray27[local188]);
					Static89.aClass6_Sub1_Sub2_2.method6493(this.aFloatArray28[local188]);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 += local100 - 8;
				}
			} else {
				for (local188 = 0; local188 < this.anInt7098; local188++) {
					Static89.aClass6_Sub1_Sub2_2.method6494(this.aFloatArray27[local188]);
					Static89.aClass6_Sub1_Sub2_2.method6494(this.aFloatArray28[local188]);
					Static89.aClass6_Sub1_Sub2_2.anInt7898 += local100 - 8;
				}
			}
		}
		Static89.aClass6_Sub1_Sub2_2.anInt7898 = this.anInt7098 * local100;
		@Pc(1384) Interface5 local1384;
		if (arg0) {
			if (this.anInterface5_7 == null) {
				this.anInterface5_7 = this.aClass66_Sub2_40.method5126(local100, true, Static89.aClass6_Sub1_Sub2_2.anInt7898, Static89.aClass6_Sub1_Sub2_2.aByteArray96);
			} else {
				this.anInterface5_7.method6167(Static89.aClass6_Sub1_Sub2_2.anInt7898, local100, Static89.aClass6_Sub1_Sub2_2.aByteArray96);
			}
			this.aByte101 = 0;
			local1384 = this.anInterface5_7;
		} else {
			local1384 = this.aClass66_Sub2_40.method5126(local100, false, Static89.aClass6_Sub1_Sub2_2.anInt7898, Static89.aClass6_Sub1_Sub2_2.aByteArray96);
			this.aBoolean454 = true;
		}
		if (local38) {
			this.aClass23_16.anInterface5_1 = local1384;
			this.aClass23_16.aByte4 = 0;
		}
		if (local49) {
			this.aClass23_15.anInterface5_1 = local1384;
			this.aClass23_15.aByte4 = local117;
		}
		if (local16) {
			this.aClass23_13.anInterface5_1 = local1384;
			this.aClass23_13.aByte4 = local104;
		}
		if (local27) {
			this.aClass23_14.anInterface5_1 = local1384;
			this.aClass23_14.aByte4 = local106;
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	@Override
	public void method5839(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145.anIntArray279[arg0];
		@Pc(13) int local13 = Class145.anIntArray280[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7069; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray489[local15] + this.anIntArray492[local15] * local13 >> 15;
			this.anIntArray489[local15] = this.anIntArray489[local15] * local13 - this.anIntArray492[local15] * local9 >> 15;
			this.anIntArray492[local15] = local33;
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(SS)V")
	@Override
	public void method5830(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass66_Sub2_40.anInterface8_5;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7063; local11++) {
			if (arg0 == this.lb[local11]) {
				this.lb[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class184 local47 = local9.method5566(arg0 & 0xFFFF);
			local35 = local47.aByte73;
			local37 = local47.aByte74;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class184 local68 = local9.method5566(arg1 & 0xFFFF);
			local55 = local68.aByte73;
			local57 = local68.aByte74;
		}
		if (!(local55 != local35 | local37 != local57)) {
			return;
		}
		if (this.aClass33Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt7071; local101++) {
				@Pc(108) Class33 local108 = this.aClass33Array1[local101];
				@Pc(113) Class89 local113 = this.aClass89Array1[local101];
				local113.anInt2772 = Static427.anIntArray525[this.aShortArray109[local108.anInt1179] & 0xFFFF] & 0xFFFFFF | local113.anInt2772 & 0xFF000000;
			}
		}
		if (this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIII)V")
	@Override
	protected void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static86.anInt1028 = 0;
			Static33.anInt1051 = 0;
			local13 = 0;
			Static289.anInt5180 = 0;
			for (local17 = 0; local17 < this.anInt7069; local17++) {
				Static86.anInt1028 += this.anIntArray492[local17];
				Static289.anInt5180 += this.anIntArray491[local17];
				Static33.anInt1051 += this.anIntArray489[local17];
				local13++;
			}
			if (local13 > 0) {
				Static289.anInt5180 = arg2 + Static289.anInt5180 / local13;
				Static33.anInt1051 = Static33.anInt1051 / local13 + arg3;
				Static86.anInt1028 = arg1 + Static86.anInt1028 / local13;
			} else {
				Static289.anInt5180 = arg2;
				Static33.anInt1051 = arg3;
				Static86.anInt1028 = arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt7069; local13++) {
				this.anIntArray492[local13] += arg1;
				this.anIntArray491[local13] += arg2;
				this.anIntArray489[local13] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt7069; local13++) {
					this.anIntArray492[local13] -= Static86.anInt1028;
					this.anIntArray491[local13] -= Static289.anInt5180;
					this.anIntArray489[local13] -= Static33.anInt1051;
					if (arg3 != 0) {
						local17 = Class145.anIntArray279[arg3];
						local163 = Class145.anIntArray280[arg3];
						local181 = local163 * this.anIntArray492[local13] + this.anIntArray491[local13] * local17 + 32767 >> 15;
						this.anIntArray491[local13] = this.anIntArray491[local13] * local163 + 32767 - this.anIntArray492[local13] * local17 >> 15;
						this.anIntArray492[local13] = local181;
					}
					if (arg1 != 0) {
						local17 = Class145.anIntArray279[arg1];
						local163 = Class145.anIntArray280[arg1];
						local181 = this.anIntArray491[local13] * local163 + 32767 - this.anIntArray489[local13] * local17 >> 15;
						this.anIntArray489[local13] = local17 * this.anIntArray491[local13] + local163 * this.anIntArray489[local13] + 32767 >> 15;
						this.anIntArray491[local13] = local181;
					}
					if (arg2 != 0) {
						local17 = Class145.anIntArray279[arg2];
						local163 = Class145.anIntArray280[arg2];
						local181 = this.anIntArray489[local13] * local17 + this.anIntArray492[local13] * local163 + 32767 >> 15;
						this.anIntArray489[local13] = this.anIntArray489[local13] * local163 + 32767 - this.anIntArray492[local13] * local17 >> 15;
						this.anIntArray492[local13] = local181;
					}
					this.anIntArray492[local13] += Static86.anInt1028;
					this.anIntArray491[local13] += Static289.anInt5180;
					this.anIntArray489[local13] += Static33.anInt1051;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt7069; local13++) {
					this.anIntArray492[local13] -= Static86.anInt1028;
					this.anIntArray491[local13] -= Static289.anInt5180;
					this.anIntArray489[local13] -= Static33.anInt1051;
					this.anIntArray492[local13] = arg1 * this.anIntArray492[local13] / 128;
					this.anIntArray491[local13] = arg2 * this.anIntArray491[local13] / 128;
					this.anIntArray489[local13] = arg3 * this.anIntArray489[local13] / 128;
					this.anIntArray492[local13] += Static86.anInt1028;
					this.anIntArray491[local13] += Static289.anInt5180;
					this.anIntArray489[local13] += Static33.anInt1051;
				}
			} else {
				@Pc(519) Class33 local519;
				@Pc(524) Class89 local524;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt7063; local13++) {
						local17 = (this.aByteArray89[local13] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray89[local13] = (byte) local17;
					}
					if (this.aClass23_13 != null) {
						this.aClass23_13.anInterface5_1 = null;
					}
					if (this.aClass33Array1 != null) {
						for (local17 = 0; local17 < this.anInt7071; local17++) {
							local519 = this.aClass33Array1[local17];
							local524 = this.aClass89Array1[local17];
							local524.anInt2772 = 255 - (this.aByteArray89[local519.anInt1179] & 0xFF) << 24 | local524.anInt2772 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt7063; local13++) {
						local17 = this.aShortArray109[local13] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(581) int local581 = local17 & 0x7F;
						@Pc(587) int local587 = arg1 + local163 & 0x3F;
						local181 += arg2 / 4;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local581 += arg3;
						if (local581 < 0) {
							local581 = 0;
						} else if (local581 > 127) {
							local581 = 127;
						}
						this.aShortArray109[local13] = (short) (local581 | local587 << 10 | local181 << 7);
					}
					if (this.aClass23_13 != null) {
						this.aClass23_13.anInterface5_1 = null;
					}
					if (this.aClass33Array1 != null) {
						for (local17 = 0; local17 < this.anInt7071; local17++) {
							local519 = this.aClass33Array1[local17];
							local524 = this.aClass89Array1[local17];
							local524.anInt2772 = Static427.anIntArray525[this.aShortArray109[local519.anInt1179] & 0xFFFF] & 0xFFFFFF | local524.anInt2772 & 0xFF000000;
						}
					}
				} else {
					@Pc(709) Class89 local709;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt7071; local13++) {
							local709 = this.aClass89Array1[local13];
							local709.anInt2775 += arg1;
							local709.anInt2780 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt7071; local13++) {
							local709 = this.aClass89Array1[local13];
							local709.anInt2774 = arg1 * local709.anInt2774 >> 7;
							local709.anInt2777 = arg2 * local709.anInt2777 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt7071; local13++) {
							local709 = this.aClass89Array1[local13];
							local709.anInt2773 = arg1 + local709.anInt2773 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "()I")
	@Override
	public int method5813() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(SS)V")
	@Override
	public void method5824(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7063; local3++) {
			if (arg0 == this.aShortArray109[local3]) {
				this.aShortArray109[local3] = arg1;
			}
		}
		if (this.aClass33Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7071; local34++) {
				@Pc(41) Class33 local41 = this.aClass33Array1[local34];
				@Pc(46) Class89 local46 = this.aClass89Array1[local34];
				local46.anInt2772 = Static427.anIntArray525[this.aShortArray109[local41.anInt1179] & 0xFFFF] & 0xFFFFFF | local46.anInt2772 & 0xFF000000;
			}
		}
		if (this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
	@Override
	public void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7069; local3++) {
			if (arg0 != 128) {
				this.anIntArray492[local3] = this.anIntArray492[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray491[local3] = this.anIntArray491[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray489[local3] = arg2 * this.anIntArray489[local3] >> 7;
			}
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
	private void method5848() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7069; local23++) {
			@Pc(30) int local30 = this.anIntArray492[local23];
			@Pc(35) int local35 = this.anIntArray491[local23];
			@Pc(40) int local40 = this.anIntArray489[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local17 < local40) {
				local17 = local40;
			}
			@Pc(82) int local82 = local40 * local40 + local30 * local30;
			if (local82 > local19) {
				local19 = local82;
			}
			local82 = local35 * local35 + local30 * local30 + local40 * local40;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort94 = (short) local13;
		this.aShort91 = (short) local7;
		this.aShort92 = (short) local15;
		this.aShort95 = (short) local17;
		this.aShort97 = (short) local11;
		this.aShort93 = (short) local9;
		this.aShort98 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean455 = true;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
	@Override
	public void method5803() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7069; local7++) {
			this.anIntArray489[local7] = -this.anIntArray489[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7098; local29++) {
			this.aShortArray104[local29] = (short) -this.aShortArray104[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt7063; local52++) {
			@Pc(59) short local59 = this.aShortArray110[local52];
			this.aShortArray110[local52] = this.aShortArray107[local52];
			this.aShortArray107[local52] = local59;
		}
		if (this.aClass23_14 == null && this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
		if (this.aClass23_14 != null) {
			this.aClass23_14.anInterface5_1 = null;
		}
		this.aBoolean455 = false;
		if (this.aClass186_1 != null) {
			this.aClass186_1.anInterface4_2 = null;
		}
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gs;Lclient!la;II)V")
	@Override
	public void method5796(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class57_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7098 == 0) {
			return;
		}
		@Pc(16) Class5_Sub2 local16 = this.aClass66_Sub2_40.aClass5_Sub2_3;
		if (!this.aBoolean455) {
			this.method5848();
		}
		@Pc(25) Class5_Sub2 local25 = (Class5_Sub2) arg0;
		Static402.aFloat97 = local25.aFloat42 * local16.aFloat48 + local25.aFloat46 * local16.aFloat42 + local16.aFloat49 * local25.aFloat44;
		Static108.aFloat21 = local16.aFloat42 * local25.aFloat41 + local25.aFloat47 * local16.aFloat49 + local16.aFloat48 * local25.aFloat40 + local16.aFloat40;
		@Pc(72) float local72 = Static108.aFloat21 + Static402.aFloat97 * (float) this.aShort93;
		@Pc(80) float local80 = Static402.aFloat97 * (float) this.aShort92 + Static108.aFloat21;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort98 + local72;
			local97 = (float) -this.aShort98 + local80;
		} else {
			local97 = (float) -this.aShort98 + local72;
			local90 = local80 + (float) this.aShort98;
		}
		if (local97 >= this.aClass66_Sub2_40.aFloat66 || local90 <= (float) this.aClass66_Sub2_40.anInt6178) {
			return;
		}
		Static81.aFloat17 = local16.aFloat39 * local25.aFloat42 + local25.aFloat46 * local16.aFloat44 + local25.aFloat44 * local16.aFloat38;
		Static331.aFloat62 = local16.aFloat47 + local25.aFloat41 * local16.aFloat44 + local16.aFloat38 * local25.aFloat47 + local16.aFloat39 * local25.aFloat40;
		@Pc(174) float local174 = (float) this.aShort93 * Static81.aFloat17 + Static331.aFloat62;
		@Pc(182) float local182 = Static81.aFloat17 * (float) this.aShort92 + Static331.aFloat62;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = (local174 + (float) this.aShort98) * (float) this.aClass66_Sub2_40.anInt6149;
			local208 = (float) this.aClass66_Sub2_40.anInt6149 * (local182 - (float) this.aShort98);
		} else {
			local197 = ((float) this.aShort98 + local182) * (float) this.aClass66_Sub2_40.anInt6149;
			local208 = (float) this.aClass66_Sub2_40.anInt6149 * (local174 - (float) this.aShort98);
		}
		if (this.aClass66_Sub2_40.aFloat85 <= local208 / (float) arg2 || this.aClass66_Sub2_40.aFloat73 >= local197 / (float) arg2) {
			return;
		}
		Static69.aFloat14 = local25.aFloat46 * local16.aFloat46 + local25.aFloat44 * local16.aFloat43 + local16.aFloat45 * local25.aFloat42;
		Static373.aFloat95 = local16.aFloat46 * local25.aFloat41 + local25.aFloat47 * local16.aFloat43 + local16.aFloat45 * local25.aFloat40 + local16.aFloat41;
		@Pc(299) float local299 = Static69.aFloat14 * (float) this.aShort93 + Static373.aFloat95;
		@Pc(307) float local307 = Static373.aFloat95 + Static69.aFloat14 * (float) this.aShort92;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local307 < local299) {
			local323 = (local307 - (float) this.aShort98) * (float) this.aClass66_Sub2_40.anInt6163;
			local334 = (float) this.aClass66_Sub2_40.anInt6163 * ((float) this.aShort98 + local299);
		} else {
			local323 = ((float) -this.aShort98 + local299) * (float) this.aClass66_Sub2_40.anInt6163;
			local334 = (float) this.aClass66_Sub2_40.anInt6163 * (local307 + (float) this.aShort98);
		}
		if (local323 / (float) arg2 >= this.aClass66_Sub2_40.aFloat83 || local334 / (float) arg2 <= this.aClass66_Sub2_40.aFloat67) {
			return;
		}
		if (arg1 != null || this.aClass33Array1 != null) {
			Static115.aFloat23 = local16.aFloat44 * local25.aFloat45 + local25.aFloat39 * local16.aFloat38 + local16.aFloat39 * local25.aFloat48;
			Static427.aFloat99 = local25.aFloat39 * local16.aFloat43 + local25.aFloat45 * local16.aFloat46 + local25.aFloat48 * local16.aFloat45;
			Static97.aFloat19 = local25.aFloat49 * local16.aFloat45 + local16.aFloat46 * local25.aFloat43 + local25.aFloat38 * local16.aFloat43;
			Static288.aFloat56 = local25.aFloat49 * local16.aFloat48 + local25.aFloat43 * local16.aFloat42 + local16.aFloat49 * local25.aFloat38;
			Static19.aFloat3 = local25.aFloat45 * local16.aFloat42 + local16.aFloat49 * local25.aFloat39 + local25.aFloat48 * local16.aFloat48;
			Static302.aFloat57 = local25.aFloat38 * local16.aFloat38 + local25.aFloat43 * local16.aFloat44 + local16.aFloat39 * local25.aFloat49;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort94 + this.aShort91 >> 1;
			@Pc(509) int local509 = this.aShort95 + this.aShort97 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static115.aFloat23 + (float) local501 * Static302.aFloat57 + Static331.aFloat62 + (float) this.aShort93 * Static81.aFloat17);
			@Pc(547) int local547 = (int) (Static373.aFloat95 + Static97.aFloat19 * (float) local501 + Static69.aFloat14 * (float) this.aShort93 + Static427.aFloat99 * (float) local509);
			@Pc(566) int local566 = (int) ((float) local509 * Static19.aFloat3 + (float) this.aShort93 * Static402.aFloat97 + Static108.aFloat21 + Static288.aFloat56 * (float) local501);
			@Pc(585) int local585 = (int) (Static331.aFloat62 + (float) local501 * Static302.aFloat57 + (float) this.aShort92 * Static81.aFloat17 + (float) local509 * Static115.aFloat23);
			@Pc(604) int local604 = (int) (Static427.aFloat99 * (float) local509 + (float) local501 * Static97.aFloat19 + Static373.aFloat95 + (float) this.aShort92 * Static69.aFloat14);
			@Pc(623) int local623 = (int) ((float) local509 * Static19.aFloat3 + Static402.aFloat97 * (float) this.aShort92 + Static108.aFloat21 + (float) local501 * Static288.aFloat56);
			arg1.anInt4037 = this.aClass66_Sub2_40.anInt6170 + this.aClass66_Sub2_40.anInt6149 * local528 / arg2;
			arg1.anInt4038 = this.aClass66_Sub2_40.anInt6160 + this.aClass66_Sub2_40.anInt6163 * local547 / arg2;
			arg1.anInt4040 = this.aClass66_Sub2_40.anInt6163 * local604 / arg2 + this.aClass66_Sub2_40.anInt6160;
			arg1.anInt4041 = this.aClass66_Sub2_40.anInt6170 + this.aClass66_Sub2_40.anInt6149 * local585 / arg2;
			if (local566 < this.aClass66_Sub2_40.anInt6178 && this.aClass66_Sub2_40.anInt6178 > local623) {
				arg1.anInt4039 = this.aClass66_Sub2_40.anInt6149 * (this.aShort98 + local528) / arg2 + this.aClass66_Sub2_40.anInt6170 - arg1.anInt4037;
				arg1.aBoolean267 = true;
			}
		}
		this.aClass66_Sub2_40.method5076((float) arg2);
		this.aClass66_Sub2_40.method5138();
		this.aClass66_Sub2_40.method5143(local25);
		this.method5851();
		this.aClass66_Sub2_40.method5092();
		this.method5849();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7063; local3++) {
			local12 = this.aShortArray109[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += arg3 * (arg2 - local56) >> 7;
			}
			this.aShortArray109[local3] = (short) (local56 | local24 << 7 | local18 << 10);
		}
		if (this.aClass33Array1 != null) {
			for (local12 = 0; local12 < this.anInt7071; local12++) {
				@Pc(105) Class33 local105 = this.aClass33Array1[local12];
				@Pc(110) Class89 local110 = this.aClass89Array1[local12];
				local110.anInt2772 = local110.anInt2772 & 0xFF000000 | Static427.anIntArray525[this.aShortArray109[local105.anInt1179] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass23_13 != null) {
			this.aClass23_13.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ss;)Lclient!ss;")
	@Override
	public Class6_Sub2_Sub10 method5837(@OriginalArg(0) Class6_Sub2_Sub10 arg0) {
		if (this.anInt7098 == 0) {
			return null;
		}
		if (!this.aBoolean455) {
			this.method5848();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass66_Sub2_40.anInt6183 <= 0) {
			local40 = this.aShort91 - (this.aClass66_Sub2_40.anInt6183 * this.aShort93 >> 8) >> this.aClass66_Sub2_40.anInt6141;
			local57 = this.aShort94 - (this.aShort92 * this.aClass66_Sub2_40.anInt6183 >> 8) >> this.aClass66_Sub2_40.anInt6141;
		} else {
			local40 = this.aShort91 - (this.aShort92 * this.aClass66_Sub2_40.anInt6183 >> 8) >> this.aClass66_Sub2_40.anInt6141;
			local57 = this.aShort94 - (this.aClass66_Sub2_40.anInt6183 * this.aShort93 >> 8) >> this.aClass66_Sub2_40.anInt6141;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass66_Sub2_40.anInt6153 <= 0) {
			local114 = this.aShort97 - (this.aShort93 * this.aClass66_Sub2_40.anInt6153 >> 8) >> this.aClass66_Sub2_40.anInt6141;
			local131 = this.aShort95 - (this.aShort92 * this.aClass66_Sub2_40.anInt6153 >> 8) >> this.aClass66_Sub2_40.anInt6141;
		} else {
			local114 = this.aShort97 - (this.aShort92 * this.aClass66_Sub2_40.anInt6153 >> 8) >> this.aClass66_Sub2_40.anInt6141;
			local131 = this.aShort95 - (this.aClass66_Sub2_40.anInt6153 * this.aShort93 >> 8) >> this.aClass66_Sub2_40.anInt6141;
		}
		@Pc(174) int local174 = local57 + 1 - local40;
		@Pc(181) int local181 = local131 + 1 - local114;
		@Pc(184) Class6_Sub2_Sub10_Sub1 local184 = (Class6_Sub2_Sub10_Sub1) arg0;
		@Pc(194) Class6_Sub2_Sub10_Sub1 local194;
		if (local184 != null && local184.method3617(local181, local174)) {
			local194 = local184;
			local184.method3615();
		} else {
			local194 = new Class6_Sub2_Sub10_Sub1(this.aClass66_Sub2_40, local174, local181);
		}
		local194.method3618(local131, local114, local40, local57);
		this.method5850(local194);
		return local194;
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
	private void method5849() {
		if (this.aClass33Array1 == null) {
			return;
		}
		@Pc(13) Class5_Sub2 local13 = this.aClass66_Sub2_40.aClass5_Sub2_2;
		@Pc(17) float local17 = this.aClass66_Sub2_40.method5015();
		@Pc(21) float local21 = this.aClass66_Sub2_40.method5024();
		this.aClass66_Sub2_40.method5085();
		this.aClass66_Sub2_40.method5007(false);
		this.aClass66_Sub2_40.method5110(false);
		this.aClass66_Sub2_40.method5087(null, this.aClass66_Sub2_40.aClass23_9, null, this.aClass66_Sub2_40.aClass23_10);
		for (@Pc(48) int local48 = 0; local48 < this.anInt7071; local48++) {
			@Pc(55) Class33 local55 = this.aClass33Array1[local48];
			@Pc(60) Class89 local60 = this.aClass89Array1[local48];
			if (!local55.aBoolean95 || !this.aClass66_Sub2_40.method5056()) {
				@Pc(89) float local89 = (float) (this.anIntArray492[local55.anInt1182] + this.anIntArray492[local55.anInt1178] + this.anIntArray492[local55.anInt1180]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray491[local55.anInt1178] + this.anIntArray491[local55.anInt1182] + this.anIntArray491[local55.anInt1180]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray489[local55.anInt1182] + this.anIntArray489[local55.anInt1178] + this.anIntArray489[local55.anInt1180]) * 0.3333333F;
				@Pc(146) float local146 = local132 * Static115.aFloat23 + local89 * Static302.aFloat57 + Static81.aFloat17 * local111 + Static331.aFloat62;
				@Pc(160) float local160 = local111 * Static69.aFloat14 + local89 * Static97.aFloat19 + local132 * Static427.aFloat99 + Static373.aFloat95;
				@Pc(174) float local174 = Static402.aFloat97 * local111 + local89 * Static288.aFloat56 + Static19.aFloat3 * local132 + Static108.aFloat21;
				local13.method3855(local146 + (float) local60.anInt2775, -local160 + (float) local60.anInt2780, -local174, local60.anInt2774 * local55.aShort20 >> 7, local60.anInt2777 * local55.aShort18 >> 7, local60.anInt2773);
				this.aClass66_Sub2_40.method5113(local13);
				this.aClass66_Sub2_40.method5055(local21, local17 - (float) local55.anInt1176 * 1.5F);
				@Pc(228) int local228 = local60.anInt2772;
				OpenGL.glColor4ub((byte) (local228 >> 16), (byte) (local228 >> 8), (byte) local228, (byte) (local228 >> 24));
				this.aClass66_Sub2_40.method5093(local55.aShort19);
				this.aClass66_Sub2_40.method5078(local55.aByte15);
				this.aClass66_Sub2_40.method5140(local55.aByte14);
				this.aClass66_Sub2_40.method5124(4);
			}
		}
		this.aClass66_Sub2_40.method5055(local21, local17);
		this.aClass66_Sub2_40.method5007(true);
		this.aClass66_Sub2_40.method5092();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()Z")
	@Override
	protected boolean method5805() {
		if (this.anIntArrayArray49 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7100; local12++) {
			this.anIntArray492[local12] <<= 0x4;
			this.anIntArray491[local12] <<= 0x4;
			this.anIntArray489[local12] <<= 0x4;
		}
		Static289.anInt5180 = 0;
		Static86.anInt1028 = 0;
		Static33.anInt1051 = 0;
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!gs;Z)Z")
	@Override
	public boolean method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class5_Sub2 local8 = (Class5_Sub2) arg2;
		@Pc(12) Class5_Sub2 local12 = this.aClass66_Sub2_40.aClass5_Sub2_3;
		@Pc(33) float local33 = local8.aFloat40 * local12.aFloat39 + local12.aFloat38 * local8.aFloat47 + local8.aFloat41 * local12.aFloat44 + local12.aFloat47;
		@Pc(54) float local54 = local12.aFloat46 * local8.aFloat41 + local12.aFloat43 * local8.aFloat47 + local12.aFloat45 * local8.aFloat40 + local12.aFloat41;
		Static115.aFloat23 = local8.aFloat48 * local12.aFloat39 + local8.aFloat45 * local12.aFloat44 + local12.aFloat38 * local8.aFloat39;
		Static427.aFloat99 = local12.aFloat46 * local8.aFloat45 + local12.aFloat43 * local8.aFloat39 + local8.aFloat48 * local12.aFloat45;
		Static288.aFloat56 = local8.aFloat49 * local12.aFloat48 + local8.aFloat43 * local12.aFloat42 + local8.aFloat38 * local12.aFloat49;
		Static402.aFloat97 = local12.aFloat48 * local8.aFloat42 + local8.aFloat46 * local12.aFloat42 + local8.aFloat44 * local12.aFloat49;
		Static81.aFloat17 = local8.aFloat44 * local12.aFloat38 + local8.aFloat46 * local12.aFloat44 + local12.aFloat39 * local8.aFloat42;
		@Pc(165) float local165 = local12.aFloat40 + local12.aFloat48 * local8.aFloat40 + local12.aFloat42 * local8.aFloat41 + local8.aFloat47 * local12.aFloat49;
		Static302.aFloat57 = local8.aFloat49 * local12.aFloat39 + local8.aFloat43 * local12.aFloat44 + local8.aFloat38 * local12.aFloat38;
		Static97.aFloat19 = local12.aFloat45 * local8.aFloat49 + local12.aFloat43 * local8.aFloat38 + local12.aFloat46 * local8.aFloat43;
		Static19.aFloat3 = local8.aFloat48 * local12.aFloat48 + local8.aFloat45 * local12.aFloat42 + local8.aFloat39 * local12.aFloat49;
		Static69.aFloat14 = local12.aFloat45 * local8.aFloat42 + local12.aFloat46 * local8.aFloat46 + local12.aFloat43 * local8.aFloat44;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass66_Sub2_40.anInt6149;
		@Pc(255) int local255 = this.aClass66_Sub2_40.anInt6163;
		if (!this.aBoolean455) {
			this.method5848();
		}
		Static163.anIntArray194[0] = this.aShort91;
		Static131.anIntArray164[0] = this.aShort93;
		Static163.anIntArray194[1] = this.aShort94;
		Static276.anIntArray330[0] = this.aShort97;
		Static131.anIntArray164[1] = this.aShort93;
		Static163.anIntArray194[2] = this.aShort91;
		Static276.anIntArray330[1] = this.aShort97;
		Static131.anIntArray164[2] = this.aShort92;
		Static163.anIntArray194[3] = this.aShort94;
		Static276.anIntArray330[2] = this.aShort97;
		Static131.anIntArray164[3] = this.aShort92;
		Static163.anIntArray194[4] = this.aShort91;
		Static276.anIntArray330[3] = this.aShort97;
		Static131.anIntArray164[4] = this.aShort93;
		Static163.anIntArray194[5] = this.aShort94;
		Static276.anIntArray330[4] = this.aShort95;
		Static131.anIntArray164[5] = this.aShort93;
		Static163.anIntArray194[6] = this.aShort91;
		Static276.anIntArray330[5] = this.aShort95;
		Static131.anIntArray164[6] = this.aShort92;
		Static276.anIntArray330[6] = this.aShort95;
		Static163.anIntArray194[7] = this.aShort94;
		Static131.anIntArray164[7] = this.aShort92;
		Static276.anIntArray330[7] = this.aShort95;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static276.anIntArray330[local383];
			local395 = Static131.anIntArray164[local383];
			local400 = Static163.anIntArray194[local383];
			local414 = local33 + Static302.aFloat57 * local400 + local395 * Static81.aFloat17 + Static115.aFloat23 * local390;
			local428 = local165 + local390 * Static19.aFloat3 + Static402.aFloat97 * local395 + Static288.aFloat56 * local400;
			local442 = local54 + Static427.aFloat99 * local390 + Static97.aFloat19 * local400 + local395 * Static69.aFloat14;
			if ((float) this.aClass66_Sub2_40.anInt6178 <= local428) {
				@Pc(461) float local461 = (float) this.aClass66_Sub2_40.anInt6170 + (float) local251 * local414 / local428;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass66_Sub2_40.anInt6160 + (float) local255 * local442 / local428;
				local239 = true;
				if (local245 > local485) {
					local245 = local485;
				}
				if (local247 < local485) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static120.anIntArray212.length < this.anInt7098) {
				Static55.anIntArray90 = new int[this.anInt7098];
				Static120.anIntArray212 = new int[this.anInt7098];
			}
			@Pc(630) int local630;
			for (@Pc(548) int local548 = 0; local548 < this.anInt7069; local548++) {
				local395 = this.anIntArray491[local548];
				local390 = this.anIntArray489[local548];
				local400 = this.anIntArray492[local548];
				local442 = local54 + local390 * Static427.aFloat99 + Static97.aFloat19 * local400 + local395 * Static69.aFloat14;
				local428 = local165 + Static288.aFloat56 * local400 + local395 * Static402.aFloat97 + local390 * Static19.aFloat3;
				local414 = local33 + local390 * Static115.aFloat23 + Static81.aFloat17 * local395 + local400 * Static302.aFloat57;
				@Pc(643) int local643;
				@Pc(648) int local648;
				@Pc(655) int local655;
				if (local428 >= (float) this.aClass66_Sub2_40.anInt6178) {
					local630 = (int) ((float) this.aClass66_Sub2_40.anInt6170 + (float) local251 * local414 / local428);
					local643 = (int) ((float) this.aClass66_Sub2_40.anInt6160 + local442 * (float) local255 / local428);
					local648 = this.anIntArray490[local548];
					local655 = this.anIntArray490[local548 + 1];
					for (@Pc(657) int local657 = local648; local657 < local655; local657++) {
						@Pc(666) int local666 = this.aShortArray101[local657] - 1;
						if (local666 == -1) {
							break;
						}
						Static120.anIntArray212[local666] = local630;
						Static55.anIntArray90[local666] = local643;
					}
				} else {
					local630 = this.anIntArray490[local548];
					local643 = this.anIntArray490[local548 + 1];
					for (local648 = local630; local648 < local643; local648++) {
						local655 = this.aShortArray101[local648] - 1;
						if (local655 == -1) {
							break;
						}
						Static120.anIntArray212[this.aShortArray101[local648] - 1] = -999999;
					}
				}
			}
			for (local630 = 0; local630 < this.anInt7063; local630++) {
				if (Static120.anIntArray212[this.aShortArray110[local630]] != -999999 && Static120.anIntArray212[this.aShortArray105[local630]] != -999999 && Static120.anIntArray212[this.aShortArray107[local630]] != -999999 && this.method5853(Static55.anIntArray90[this.aShortArray110[local630]], arg1, Static55.anIntArray90[this.aShortArray105[local630]], Static120.anIntArray212[this.aShortArray105[local630]], Static120.anIntArray212[this.aShortArray110[local630]], arg0, Static55.anIntArray90[this.aShortArray107[local630]], Static120.anIntArray212[this.aShortArray107[local630]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "()[Lclient!gq;")
	@Override
	public Class94[] method5807() {
		return this.aClass94Array3;
	}

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "()I")
	@Override
	public int method5815() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "()Z")
	@Override
	public boolean method5826() {
		if (this.lb == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb.length; local12++) {
			if (this.lb[local12] != -1 && !this.aClass66_Sub2_40.anInterface8_5.method5562(this.lb[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "()I")
	@Override
	public int method5834() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	@Override
	public void method5817(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145.anIntArray279[arg0];
		@Pc(13) int local13 = Class145.anIntArray280[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7069; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray491[local15] - this.anIntArray489[local15] * local9 >> 15;
			this.anIntArray489[local15] = this.anIntArray489[local15] * local13 + this.anIntArray491[local15] * local9 >> 15;
			this.anIntArray491[local15] = local34;
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ln;Z)V")
	private void method5850(@OriginalArg(0) Class6_Sub2_Sub10_Sub1 arg0) {
		if (this.anInt7098 > Static120.anIntArray212.length) {
			Static55.anIntArray90 = new int[this.anInt7098];
			Static120.anIntArray212 = new int[this.anInt7098];
		}
		@Pc(51) int local51;
		@Pc(89) int local89;
		@Pc(98) int local98;
		for (@Pc(24) int local24 = 0; local24 < this.anInt7069; local24++) {
			local51 = (this.anIntArray492[local24] - (this.anIntArray491[local24] * this.aClass66_Sub2_40.anInt6183 >> 8) >> this.aClass66_Sub2_40.anInt6141) - arg0.anInt4265;
			@Pc(75) int local75 = (this.anIntArray489[local24] - (this.anIntArray491[local24] * this.aClass66_Sub2_40.anInt6153 >> 8) >> this.aClass66_Sub2_40.anInt6141) - arg0.anInt4269;
			@Pc(80) int local80 = this.anIntArray490[local24];
			@Pc(87) int local87 = this.anIntArray490[local24 + 1];
			for (local89 = local80; local89 < local87; local89++) {
				local98 = this.aShortArray101[local89] - 1;
				if (local98 == -1) {
					break;
				}
				Static120.anIntArray212[local98] = local51;
				Static55.anIntArray90[local98] = local75;
			}
		}
		for (local51 = 0; local51 < this.anInt7080; local51++) {
			if (this.aByteArray89 == null || this.aByteArray89[local51] <= 128) {
				@Pc(137) short local137 = this.aShortArray110[local51];
				@Pc(142) short local142 = this.aShortArray105[local51];
				@Pc(147) short local147 = this.aShortArray107[local51];
				local89 = Static120.anIntArray212[local137];
				local98 = Static120.anIntArray212[local142];
				@Pc(159) int local159 = Static120.anIntArray212[local147];
				@Pc(163) int local163 = Static55.anIntArray90[local137];
				@Pc(167) int local167 = Static55.anIntArray90[local142];
				@Pc(171) int local171 = Static55.anIntArray90[local147];
				if (-((local167 - local163) * (local159 - local98)) + (local89 - local98) * (local167 - local171) > 0) {
					arg0.method3614(local159, local89, local167, local98, local171, local163);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gs;Lclient!la;I)V")
	@Override
	public void method5798(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class57_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7098 == 0) {
			return;
		}
		@Pc(13) Class5_Sub2 local13 = this.aClass66_Sub2_40.aClass5_Sub2_3;
		if (!this.aBoolean455) {
			this.method5848();
		}
		@Pc(22) Class5_Sub2 local22 = (Class5_Sub2) arg0;
		this.method5854(local22);
		Static402.aFloat97 = local22.aFloat46 * local13.aFloat42 + local13.aFloat49 * local22.aFloat44 + local13.aFloat48 * local22.aFloat42;
		Static108.aFloat21 = local22.aFloat40 * local13.aFloat48 + local13.aFloat49 * local22.aFloat47 + local13.aFloat42 * local22.aFloat41 + local13.aFloat40;
		@Pc(73) float local73 = Static108.aFloat21 + Static402.aFloat97 * (float) this.aShort93;
		@Pc(81) float local81 = (float) this.aShort92 * Static402.aFloat97 + Static108.aFloat21;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = local73 + (float) this.aShort98;
			local98 = (float) -this.aShort98 + local81;
		} else {
			local98 = local73 - (float) this.aShort98;
			local91 = (float) this.aShort98 + local81;
		}
		if (local98 >= this.aClass66_Sub2_40.aFloat68 || local91 <= (float) this.aClass66_Sub2_40.anInt6178) {
			return;
		}
		Static81.aFloat17 = local13.aFloat38 * local22.aFloat44 + local22.aFloat46 * local13.aFloat44 + local22.aFloat42 * local13.aFloat39;
		Static331.aFloat62 = local13.aFloat39 * local22.aFloat40 + local22.aFloat47 * local13.aFloat38 + local22.aFloat41 * local13.aFloat44 + local13.aFloat47;
		@Pc(174) float local174 = Static331.aFloat62 + Static81.aFloat17 * (float) this.aShort93;
		@Pc(182) float local182 = Static331.aFloat62 + Static81.aFloat17 * (float) this.aShort92;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local209 = (local182 - (float) this.aShort98) * (float) this.aClass66_Sub2_40.anInt6149;
			local197 = (local174 + (float) this.aShort98) * (float) this.aClass66_Sub2_40.anInt6149;
		} else {
			local197 = (float) this.aClass66_Sub2_40.anInt6149 * ((float) this.aShort98 + local182);
			local209 = (float) this.aClass66_Sub2_40.anInt6149 * ((float) -this.aShort98 + local174);
		}
		if (this.aClass66_Sub2_40.aFloat85 <= local209 / local91 || local197 / local91 <= this.aClass66_Sub2_40.aFloat73) {
			return;
		}
		Static373.aFloat95 = local13.aFloat41 + local22.aFloat40 * local13.aFloat45 + local13.aFloat43 * local22.aFloat47 + local22.aFloat41 * local13.aFloat46;
		Static69.aFloat14 = local22.aFloat42 * local13.aFloat45 + local13.aFloat43 * local22.aFloat44 + local13.aFloat46 * local22.aFloat46;
		@Pc(298) float local298 = Static373.aFloat95 + (float) this.aShort93 * Static69.aFloat14;
		@Pc(306) float local306 = (float) this.aShort92 * Static69.aFloat14 + Static373.aFloat95;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local306 < local298) {
			local321 = ((float) this.aShort98 + local298) * (float) this.aClass66_Sub2_40.anInt6163;
			local333 = ((float) -this.aShort98 + local306) * (float) this.aClass66_Sub2_40.anInt6163;
		} else {
			local321 = ((float) this.aShort98 + local306) * (float) this.aClass66_Sub2_40.anInt6163;
			local333 = ((float) -this.aShort98 + local298) * (float) this.aClass66_Sub2_40.anInt6163;
		}
		if (local333 / local91 >= this.aClass66_Sub2_40.aFloat83 || this.aClass66_Sub2_40.aFloat67 >= local321 / local91) {
			return;
		}
		if (arg1 != null || this.aClass33Array1 != null) {
			Static97.aFloat19 = local22.aFloat49 * local13.aFloat45 + local22.aFloat38 * local13.aFloat43 + local13.aFloat46 * local22.aFloat43;
			Static427.aFloat99 = local22.aFloat39 * local13.aFloat43 + local22.aFloat45 * local13.aFloat46 + local13.aFloat45 * local22.aFloat48;
			Static302.aFloat57 = local22.aFloat49 * local13.aFloat39 + local13.aFloat44 * local22.aFloat43 + local13.aFloat38 * local22.aFloat38;
			Static115.aFloat23 = local22.aFloat48 * local13.aFloat39 + local13.aFloat38 * local22.aFloat39 + local22.aFloat45 * local13.aFloat44;
			Static19.aFloat3 = local13.aFloat48 * local22.aFloat48 + local22.aFloat39 * local13.aFloat49 + local13.aFloat42 * local22.aFloat45;
			Static288.aFloat56 = local13.aFloat48 * local22.aFloat49 + local22.aFloat38 * local13.aFloat49 + local13.aFloat42 * local22.aFloat43;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort91 + this.aShort94 >> 1;
			@Pc(511) int local511 = this.aShort95 + this.aShort97 >> 1;
			@Pc(530) int local530 = (int) ((float) local503 * Static302.aFloat57 + Static331.aFloat62 + Static81.aFloat17 * (float) this.aShort93 + Static115.aFloat23 * (float) local511);
			@Pc(549) int local549 = (int) (Static373.aFloat95 + (float) local503 * Static97.aFloat19 + (float) this.aShort93 * Static69.aFloat14 + (float) local511 * Static427.aFloat99);
			@Pc(568) int local568 = (int) (Static402.aFloat97 * (float) this.aShort93 + Static288.aFloat56 * (float) local503 + Static108.aFloat21 + Static19.aFloat3 * (float) local511);
			if (local568 >= this.aClass66_Sub2_40.anInt6178) {
				arg1.anInt4038 = this.aClass66_Sub2_40.anInt6160 + this.aClass66_Sub2_40.anInt6163 * local549 / local568;
				arg1.anInt4037 = local530 * this.aClass66_Sub2_40.anInt6149 / local568 + this.aClass66_Sub2_40.anInt6170;
			} else {
				local493 = true;
			}
			@Pc(623) int local623 = (int) (Static302.aFloat57 * (float) local503 + Static331.aFloat62 + (float) this.aShort92 * Static81.aFloat17 + Static115.aFloat23 * (float) local511);
			@Pc(642) int local642 = (int) ((float) this.aShort92 * Static69.aFloat14 + Static373.aFloat95 + Static97.aFloat19 * (float) local503 + (float) local511 * Static427.aFloat99);
			@Pc(661) int local661 = (int) (Static19.aFloat3 * (float) local511 + Static402.aFloat97 * (float) this.aShort92 + (float) local503 * Static288.aFloat56 + Static108.aFloat21);
			if (local661 >= this.aClass66_Sub2_40.anInt6178) {
				arg1.anInt4041 = this.aClass66_Sub2_40.anInt6149 * local623 / local661 + this.aClass66_Sub2_40.anInt6170;
				arg1.anInt4040 = this.aClass66_Sub2_40.anInt6160 + this.aClass66_Sub2_40.anInt6163 * local642 / local661;
			} else {
				local493 = true;
			}
			if (local493) {
				if (this.aClass66_Sub2_40.anInt6178 > local568 && this.aClass66_Sub2_40.anInt6178 > local661) {
					local495 = false;
				} else {
					@Pc(738) int local738;
					@Pc(749) int local749;
					@Pc(760) int local760;
					if (local568 < this.aClass66_Sub2_40.anInt6178) {
						local738 = (local661 - this.aClass66_Sub2_40.anInt6178 << 16) / (local661 - local568);
						local749 = (local738 * (local623 - local530) >> 16) + local623;
						local760 = ((local642 - local549) * local738 >> 16) + local642;
						arg1.anInt4037 = this.aClass66_Sub2_40.anInt6149 * local749 / this.aClass66_Sub2_40.anInt6178 + this.aClass66_Sub2_40.anInt6170;
						arg1.anInt4038 = local760 * this.aClass66_Sub2_40.anInt6163 / this.aClass66_Sub2_40.anInt6178 + this.aClass66_Sub2_40.anInt6160;
					} else if (this.aClass66_Sub2_40.anInt6178 > local661) {
						local738 = (local568 - this.aClass66_Sub2_40.anInt6178 << 16) / (local568 - local661);
						local749 = ((local530 - local623) * local738 >> 16) + local530;
						local760 = local549 + (local738 * (local549 - local642) >> 16);
						arg1.anInt4037 = local749 * this.aClass66_Sub2_40.anInt6149 / this.aClass66_Sub2_40.anInt6178 + this.aClass66_Sub2_40.anInt6170;
						arg1.anInt4038 = this.aClass66_Sub2_40.anInt6160 + this.aClass66_Sub2_40.anInt6163 * local760 / this.aClass66_Sub2_40.anInt6178;
					}
				}
			}
			if (local495) {
				if (local661 < local568) {
					arg1.anInt4039 = this.aClass66_Sub2_40.anInt6170 + (local530 + this.aShort98) * this.aClass66_Sub2_40.anInt6149 / local568 - arg1.anInt4037;
				} else {
					arg1.anInt4039 = (this.aShort98 + local623) * this.aClass66_Sub2_40.anInt6149 / local661 + this.aClass66_Sub2_40.anInt6170 - arg1.anInt4041;
				}
				arg1.aBoolean267 = true;
			}
		}
		this.aClass66_Sub2_40.method5117();
		this.aClass66_Sub2_40.method5143(local22);
		this.method5851();
		this.aClass66_Sub2_40.method5092();
		this.method5849();
	}

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)V")
	private void method5851() {
		if (this.anInt7080 == 0) {
			return;
		}
		if (this.aByte101 != 0) {
			this.method5847(true);
		}
		this.method5847(false);
		if (this.aClass186_1 != null) {
			if (this.aClass186_1.anInterface4_2 == null) {
				this.method5856((this.aByte101 & 0x10) != 0);
			}
			if (this.aClass186_1.anInterface4_2 != null) {
				this.aClass66_Sub2_40.method5110(this.aClass23_14 != null);
				this.aClass66_Sub2_40.method5087(this.aClass23_13, this.aClass23_16, this.aClass23_14, this.aClass23_15);
				@Pc(78) int local78 = this.anIntArray488.length - 1;
				for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
					@Pc(87) int local87 = this.anIntArray488[local80];
					@Pc(94) int local94 = this.anIntArray488[local80 + 1];
					@Pc(101) int local101 = this.lb[local87] & 0xFFFF;
					if (local101 == 65535) {
						local101 = -1;
					}
					this.aClass66_Sub2_40.method5146(local101, this.aClass23_14 != null);
					this.aClass66_Sub2_40.method5155((local94 - local87) * 3, local87 * 3, this.aClass186_1.anInterface4_2);
				}
			}
		}
		this.method5857();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIZLclient!uc;Lclient!uc;)Lclient!va;")
	private Class224 method5852(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class224_Sub2 arg3, @OriginalArg(5) Class224_Sub2 arg4) {
		arg4.anInt7068 = arg1;
		arg4.aShort90 = this.aShort90;
		arg4.anInt7071 = this.anInt7071;
		arg4.anInt7063 = this.anInt7063;
		arg4.anInt7069 = this.anInt7069;
		arg4.anInt7080 = this.anInt7080;
		arg4.anInt7081 = this.anInt7081;
		arg4.aByte101 = 0;
		arg4.anInt7100 = this.anInt7100;
		arg4.anInt7098 = this.anInt7098;
		arg4.aShort96 = this.aShort96;
		@Pc(55) boolean local55 = Static55.method1240(this.anInt7081, arg1);
		@Pc(61) boolean local61 = Static136.method2409(arg1, this.anInt7081);
		@Pc(67) boolean local67 = Static271.method4044(arg1, this.anInt7081);
		@Pc(73) boolean local73 = local61 | local55 | local67;
		@Pc(174) int local174;
		if (local73) {
			if (!local55) {
				arg4.anIntArray492 = this.anIntArray492;
			} else if (arg3.anIntArray492 == null || this.anInt7100 > arg3.anIntArray492.length) {
				arg4.anIntArray492 = arg3.anIntArray492 = new int[this.anInt7100];
			} else {
				arg4.anIntArray492 = arg3.anIntArray492;
			}
			if (!local61) {
				arg4.anIntArray491 = this.anIntArray491;
			} else if (arg3.anIntArray491 == null || arg3.anIntArray491.length < this.anInt7100) {
				arg4.anIntArray491 = arg3.anIntArray491 = new int[this.anInt7100];
			} else {
				arg4.anIntArray491 = arg3.anIntArray491;
			}
			if (!local67) {
				arg4.anIntArray489 = this.anIntArray489;
			} else if (arg3.anIntArray489 == null || this.anInt7100 > arg3.anIntArray489.length) {
				arg4.anIntArray489 = arg3.anIntArray489 = new int[this.anInt7100];
			} else {
				arg4.anIntArray489 = arg3.anIntArray489;
			}
			for (local174 = 0; local174 < this.anInt7100; local174++) {
				if (local55) {
					arg4.anIntArray492[local174] = this.anIntArray492[local174];
				}
				if (local61) {
					arg4.anIntArray491[local174] = this.anIntArray491[local174];
				}
				if (local67) {
					arg4.anIntArray489[local174] = this.anIntArray489[local174];
				}
			}
		} else {
			arg4.anIntArray491 = this.anIntArray491;
			arg4.anIntArray489 = this.anIntArray489;
			arg4.anIntArray492 = this.anIntArray492;
		}
		if (Static193.method3053(arg1, this.anInt7081)) {
			if (arg2) {
				arg4.aByte101 = (byte) (arg4.aByte101 | 0x1);
			}
			arg4.aClass23_16 = arg3.aClass23_16;
			arg4.aClass23_16.anInterface5_1 = this.aClass23_16.anInterface5_1;
			arg4.aClass23_16.aByte4 = this.aClass23_16.aByte4;
		} else if (Static88.method4159(this.anInt7081, arg1)) {
			arg4.aClass23_16 = this.aClass23_16;
		} else {
			arg4.aClass23_16 = null;
		}
		if (Static231.method6542(this.anInt7081, arg1)) {
			if (arg3.aShortArray109 == null || arg3.aShortArray109.length < this.anInt7063) {
				arg4.aShortArray109 = arg3.aShortArray109 = new short[this.anInt7063];
			} else {
				arg4.aShortArray109 = arg3.aShortArray109;
			}
			for (local174 = 0; local174 < this.anInt7063; local174++) {
				arg4.aShortArray109[local174] = this.aShortArray109[local174];
			}
		} else {
			arg4.aShortArray109 = this.aShortArray109;
		}
		if (Static32.method5526(this.anInt7081, arg1)) {
			if (arg3.aByteArray89 == null || this.anInt7063 > arg3.aByteArray89.length) {
				arg4.aByteArray89 = arg3.aByteArray89 = new byte[this.anInt7063];
			} else {
				arg4.aByteArray89 = arg3.aByteArray89;
			}
			for (local174 = 0; local174 < this.anInt7063; local174++) {
				arg4.aByteArray89[local174] = this.aByteArray89[local174];
			}
		} else {
			arg4.aByteArray89 = this.aByteArray89;
		}
		if (Static173.method2864(this.anInt7081, arg1)) {
			if (arg2) {
				arg4.aByte101 = (byte) (arg4.aByte101 | 0x2);
			}
			arg4.aClass23_13 = arg3.aClass23_13;
			arg4.aClass23_13.anInterface5_1 = this.aClass23_13.anInterface5_1;
			arg4.aClass23_13.aByte4 = this.aClass23_13.aByte4;
		} else if (Static209.method2238(arg1, this.anInt7081)) {
			arg4.aClass23_13 = this.aClass23_13;
		} else {
			arg4.aClass23_13 = null;
		}
		@Pc(580) int local580;
		if (Static22.method654(this.anInt7081, arg1)) {
			if (arg3.aShortArray102 == null || arg3.aShortArray102.length < this.anInt7098) {
				local174 = this.anInt7098;
				arg4.aShortArray104 = arg3.aShortArray104 = new short[local174];
				arg4.aShortArray102 = arg3.aShortArray102 = new short[local174];
				arg4.aShortArray108 = arg3.aShortArray108 = new short[local174];
			} else {
				arg4.aShortArray104 = arg3.aShortArray104;
				arg4.aShortArray108 = arg3.aShortArray108;
				arg4.aShortArray102 = arg3.aShortArray102;
			}
			if (this.aClass211_1 == null) {
				for (local174 = 0; local174 < this.anInt7098; local174++) {
					arg4.aShortArray102[local174] = this.aShortArray102[local174];
					arg4.aShortArray108[local174] = this.aShortArray108[local174];
					arg4.aShortArray104[local174] = this.aShortArray104[local174];
				}
			} else {
				if (arg3.aClass211_1 == null) {
					arg3.aClass211_1 = new Class211();
				}
				@Pc(564) Class211 local564 = arg4.aClass211_1 = arg3.aClass211_1;
				if (local564.aShortArray90 == null || this.anInt7098 > local564.aShortArray90.length) {
					local580 = this.anInt7098;
					local564.aShortArray88 = new short[local580];
					local564.aShortArray90 = new short[local580];
					local564.aShortArray89 = new short[local580];
					local564.aByteArray72 = new byte[local580];
				}
				for (local580 = 0; local580 < this.anInt7098; local580++) {
					arg4.aShortArray102[local580] = this.aShortArray102[local580];
					arg4.aShortArray108[local580] = this.aShortArray108[local580];
					arg4.aShortArray104[local580] = this.aShortArray104[local580];
					local564.aShortArray90[local580] = this.aClass211_1.aShortArray90[local580];
					local564.aShortArray89[local580] = this.aClass211_1.aShortArray89[local580];
					local564.aShortArray88[local580] = this.aClass211_1.aShortArray88[local580];
					local564.aByteArray72[local580] = this.aClass211_1.aByteArray72[local580];
				}
			}
			arg4.aByteArray88 = this.aByteArray88;
		} else {
			arg4.aClass211_1 = this.aClass211_1;
			arg4.aShortArray104 = this.aShortArray104;
			arg4.aShortArray108 = this.aShortArray108;
			arg4.aShortArray102 = this.aShortArray102;
			arg4.aByteArray88 = this.aByteArray88;
		}
		if (Static19.method503(this.anInt7081, arg1)) {
			arg4.aClass23_14 = arg3.aClass23_14;
			if (arg2) {
				arg4.aByte101 = (byte) (arg4.aByte101 | 0x4);
			}
			arg4.aClass23_14.aByte4 = this.aClass23_14.aByte4;
			arg4.aClass23_14.anInterface5_1 = this.aClass23_14.anInterface5_1;
		} else if (Static368.method4872(arg1, this.anInt7081)) {
			arg4.aClass23_14 = this.aClass23_14;
		} else {
			arg4.aClass23_14 = null;
		}
		if (Static22.method651(arg1, this.anInt7081)) {
			if (arg3.aFloatArray27 == null || arg3.aFloatArray27.length < this.anInt7063) {
				local174 = this.anInt7098;
				arg4.aFloatArray28 = arg3.aFloatArray28 = new float[local174];
				arg4.aFloatArray27 = arg3.aFloatArray27 = new float[local174];
			} else {
				arg4.aFloatArray27 = arg3.aFloatArray27;
				arg4.aFloatArray28 = arg3.aFloatArray28;
			}
			for (local174 = 0; local174 < this.anInt7098; local174++) {
				arg4.aFloatArray27[local174] = this.aFloatArray27[local174];
				arg4.aFloatArray28[local174] = this.aFloatArray28[local174];
			}
		} else {
			arg4.aFloatArray28 = this.aFloatArray28;
			arg4.aFloatArray27 = this.aFloatArray27;
		}
		if (Static397.method5858(this.anInt7081, arg1)) {
			if (arg2) {
				arg4.aByte101 = (byte) (arg4.aByte101 | 0x8);
			}
			arg4.aClass23_15 = arg3.aClass23_15;
			arg4.aClass23_15.aByte4 = this.aClass23_15.aByte4;
			arg4.aClass23_15.anInterface5_1 = this.aClass23_15.anInterface5_1;
		} else if (Static22.method653(this.anInt7081, arg1)) {
			arg4.aClass23_15 = this.aClass23_15;
		} else {
			arg4.aClass23_15 = null;
		}
		if (Static240.method3702(arg1, this.anInt7081)) {
			if (arg3.aShortArray110 == null || this.anInt7063 > arg3.aShortArray110.length) {
				local174 = this.anInt7063;
				arg4.aShortArray110 = arg3.aShortArray110 = new short[local174];
				arg4.aShortArray105 = arg3.aShortArray105 = new short[local174];
				arg4.aShortArray107 = arg3.aShortArray107 = new short[local174];
			} else {
				arg4.aShortArray105 = arg3.aShortArray105;
				arg4.aShortArray110 = arg3.aShortArray110;
				arg4.aShortArray107 = arg3.aShortArray107;
			}
			for (local174 = 0; local174 < this.anInt7063; local174++) {
				arg4.aShortArray110[local174] = this.aShortArray110[local174];
				arg4.aShortArray105[local174] = this.aShortArray105[local174];
				arg4.aShortArray107[local174] = this.aShortArray107[local174];
			}
		} else {
			arg4.aShortArray107 = this.aShortArray107;
			arg4.aShortArray105 = this.aShortArray105;
			arg4.aShortArray110 = this.aShortArray110;
		}
		if (Static144.method2459(arg1, this.anInt7081)) {
			arg4.aClass186_1 = arg3.aClass186_1;
			if (arg2) {
				arg4.aByte101 = (byte) (arg4.aByte101 | 0x10);
			}
			arg4.aClass186_1.anInterface4_2 = this.aClass186_1.anInterface4_2;
		} else if (Static214.method3234(this.anInt7081, arg1)) {
			arg4.aClass186_1 = this.aClass186_1;
		} else {
			arg4.aClass186_1 = null;
		}
		if (Static2.method5318(arg1, this.anInt7081)) {
			if (arg3.lb == null || arg3.lb.length < this.anInt7063) {
				local174 = this.anInt7063;
				arg4.lb = arg3.lb = new short[local174];
			} else {
				arg4.lb = arg3.lb;
			}
			for (local174 = 0; local174 < this.anInt7063; local174++) {
				arg4.lb[local174] = this.lb[local174];
			}
		} else {
			arg4.lb = this.lb;
		}
		if (!Static412.method6085(this.anInt7081, arg1)) {
			arg4.aClass89Array1 = this.aClass89Array1;
		} else if (arg3.aClass89Array1 == null || this.anInt7071 > arg3.aClass89Array1.length) {
			local174 = this.anInt7071;
			arg4.aClass89Array1 = arg3.aClass89Array1 = new Class89[local174];
			for (local580 = 0; local580 < this.anInt7071; local580++) {
				arg4.aClass89Array1[local580] = this.aClass89Array1[local580].method2315();
			}
		} else {
			arg4.aClass89Array1 = arg3.aClass89Array1;
			for (local174 = 0; local174 < this.anInt7071; local174++) {
				arg4.aClass89Array1[local174].method2314(this.aClass89Array1[local174]);
			}
		}
		arg4.anIntArrayArray50 = this.anIntArrayArray50;
		if (this.aBoolean455) {
			arg4.aShort95 = this.aShort95;
			arg4.aShort97 = this.aShort97;
			arg4.aBoolean455 = true;
			arg4.aShort98 = this.aShort98;
			arg4.aShort94 = this.aShort94;
			arg4.aShort92 = this.aShort92;
			arg4.aShort93 = this.aShort93;
			arg4.aShort91 = this.aShort91;
		} else {
			arg4.aBoolean455 = false;
		}
		arg4.aShortArray106 = this.aShortArray106;
		arg4.anIntArrayArray48 = this.anIntArrayArray48;
		arg4.anIntArray490 = this.anIntArray490;
		arg4.anIntArrayArray49 = this.anIntArrayArray49;
		arg4.aShortArray103 = this.aShortArray103;
		arg4.anIntArray488 = this.anIntArray488;
		arg4.aClass33Array1 = this.aClass33Array1;
		arg4.aClass94Array3 = this.aClass94Array3;
		arg4.aClass119Array3 = this.aClass119Array3;
		arg4.aShortArray101 = this.aShortArray101;
		return arg4;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIZ)Lclient!va;")
	@Override
	public Class224 method5808(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class224_Sub2 local21;
		@Pc(17) Class224_Sub2 local17;
		if (arg0 == 1) {
			local21 = this.aClass66_Sub2_40.aClass224_Sub2_3;
			local17 = this.aClass66_Sub2_40.aClass224_Sub2_10;
		} else if (arg0 == 2) {
			local17 = this.aClass66_Sub2_40.aClass224_Sub2_2;
			local21 = this.aClass66_Sub2_40.aClass224_Sub2_4;
		} else if (arg0 == 3) {
			local17 = this.aClass66_Sub2_40.aClass224_Sub2_5;
			local21 = this.aClass66_Sub2_40.aClass224_Sub2_6;
		} else if (arg0 == 4) {
			local21 = this.aClass66_Sub2_40.aClass224_Sub2_9;
			local17 = this.aClass66_Sub2_40.aClass224_Sub2_8;
		} else if (arg0 == 5) {
			local17 = this.aClass66_Sub2_40.aClass224_Sub2_7;
			local21 = this.aClass66_Sub2_40.aClass224_Sub2_1;
		} else {
			local21 = local17 = new Class224_Sub2(this.aClass66_Sub2_40);
		}
		return this.method5852(arg2, arg1, arg0 != 0, local17, local21);
	}

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "()I")
	@Override
	public int method5812() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "()I")
	@Override
	public int method5843() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0) {
		this.anInt7068 = arg0;
		if (this.aClass211_1 != null && (this.anInt7068 & 0x10000) == 0) {
			this.aShortArray108 = this.aClass211_1.aShortArray89;
			this.aByteArray88 = this.aClass211_1.aByteArray72;
			this.aShortArray102 = this.aClass211_1.aShortArray90;
			this.aShortArray104 = this.aClass211_1.aShortArray88;
			this.aClass211_1 = null;
		}
		this.aBoolean454 = true;
		this.method5857();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static33.anInt1051 = 0;
			Static86.anInt1028 = 0;
			Static289.anInt5180 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray49.length > local38) {
					local48 = this.anIntArrayArray49[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray106 == null || (this.aShortArray106[local56] & arg6) != 0) {
							Static86.anInt1028 += this.anIntArray492[local56];
							Static289.anInt5180 += this.anIntArray491[local56];
							Static33.anInt1051 += this.anIntArray489[local56];
							local24++;
						}
					}
				}
			}
			if (local24 > 0) {
				Static289.anInt5180 = Static289.anInt5180 / local24 + arg3;
				Static400.aBoolean458 = true;
				Static33.anInt1051 = arg4 + Static33.anInt1051 / local24;
				Static86.anInt1028 = Static86.anInt1028 / local24 + arg2;
			} else {
				Static289.anInt5180 = arg3;
				Static86.anInt1028 = arg2;
				Static33.anInt1051 = arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg2 * arg7[0] + arg3 * arg7[1] + arg7[2] * arg4 + 16384 >> 15;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg7[8] * arg4 + arg2 * arg7[6] + arg7[7] * arg3 + 16384 >> 15;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray49.length > local32) {
					local248 = this.anIntArrayArray49[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray106 == null || (arg6 & this.aShortArray106[local50]) != 0) {
							this.anIntArray492[local50] += arg2;
							this.anIntArray491[local50] += arg3;
							this.anIntArray489[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(374) int local374;
		@Pc(396) int local396;
		@Pc(422) int local422;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(465) int local465;
		@Pc(473) int local473;
		@Pc(481) int local481;
		@Pc(637) int local637;
		@Pc(664) int local664;
		@Pc(668) int local668;
		@Pc(676) int local676;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(689) int local689;
		@Pc(691) int local691;
		@Pc(823) int[] local823;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(835) int local835;
		@Pc(963) int local963;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray49.length > local32) {
						local248 = this.anIntArrayArray49[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray106 == null || (this.aShortArray106[local50] & arg6) != 0) {
								this.anIntArray492[local50] -= Static86.anInt1028;
								this.anIntArray491[local50] -= Static289.anInt5180;
								this.anIntArray489[local50] -= Static33.anInt1051;
								if (arg4 != 0) {
									local56 = Class145.anIntArray279[arg4];
									local374 = Class145.anIntArray280[arg4];
									local396 = this.anIntArray491[local50] * local56 + this.anIntArray492[local50] * local374 + 32767 >> 15;
									this.anIntArray491[local50] = this.anIntArray491[local50] * local374 + 32767 - this.anIntArray492[local50] * local56 >> 15;
									this.anIntArray492[local50] = local396;
								}
								if (arg2 != 0) {
									local56 = Class145.anIntArray279[arg2];
									local374 = Class145.anIntArray280[arg2];
									local396 = this.anIntArray491[local50] * local374 + 32767 - local56 * this.anIntArray489[local50] >> 15;
									this.anIntArray489[local50] = local56 * this.anIntArray491[local50] + local374 * this.anIntArray489[local50] + 32767 >> 15;
									this.anIntArray491[local50] = local396;
								}
								if (arg3 != 0) {
									local56 = Class145.anIntArray279[arg3];
									local374 = Class145.anIntArray280[arg3];
									local396 = this.anIntArray492[local50] * local374 + local56 * this.anIntArray489[local50] + 32767 >> 15;
									this.anIntArray489[local50] = local374 * this.anIntArray489[local50] + 32767 - local56 * this.anIntArray492[local50] >> 15;
									this.anIntArray492[local50] = local396;
								}
								this.anIntArray492[local50] += Static86.anInt1028;
								this.anIntArray491[local50] += Static289.anInt5180;
								this.anIntArray489[local50] += Static33.anInt1051;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray49.length > local38) {
							local48 = this.anIntArrayArray49[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray106 == null || (arg6 & this.aShortArray106[local56]) != 0) {
									local374 = this.anIntArray490[local56];
									local396 = this.anIntArray490[local56 + 1];
									for (local422 = local374; local422 < local396; local422++) {
										local453 = this.aShortArray101[local422] - 1;
										if (local453 == -1) {
											break;
										}
										if (arg4 != 0) {
											local457 = Class145.anIntArray279[arg4];
											local461 = Class145.anIntArray280[arg4];
											local465 = local457 * this.aShortArray108[local453] + local461 * this.aShortArray102[local453] + 32767 >> 15;
											this.aShortArray108[local453] = (short) (local461 * this.aShortArray108[local453] + 32767 - this.aShortArray102[local453] * local457 >> 15);
											this.aShortArray102[local453] = (short) local465;
										}
										if (arg2 != 0) {
											local457 = Class145.anIntArray279[arg2];
											local461 = Class145.anIntArray280[arg2];
											local465 = this.aShortArray108[local453] * local461 + 32767 - local457 * this.aShortArray104[local453] >> 15;
											this.aShortArray104[local453] = (short) (local461 * this.aShortArray104[local453] + local457 * this.aShortArray108[local453] + 32767 >> 15);
											this.aShortArray108[local453] = (short) local465;
										}
										if (arg3 != 0) {
											local457 = Class145.anIntArray279[arg3];
											local461 = Class145.anIntArray280[arg3];
											local465 = this.aShortArray102[local453] * local461 + local457 * this.aShortArray104[local453] + 32767 >> 15;
											this.aShortArray104[local453] = (short) (this.aShortArray104[local453] * local461 + 32767 - local457 * this.aShortArray102[local453] >> 15);
											this.aShortArray102[local453] = (short) local465;
										}
									}
								}
							}
						}
					}
					if (this.aClass23_14 == null && this.aClass23_13 != null) {
						this.aClass23_13.anInterface5_1 = null;
					}
					if (this.aClass23_14 != null) {
						this.aClass23_14.anInterface5_1 = null;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static400.aBoolean458) {
					local374 = arg7[6] * Static33.anInt1051 + Static86.anInt1028 * arg7[0] + arg7[3] * Static289.anInt5180 + 16384 >> 15;
					local396 = arg7[7] * Static33.anInt1051 + Static289.anInt5180 * arg7[4] + arg7[1] * Static86.anInt1028 + 16384 >> 15;
					local374 += local250;
					local422 = arg7[8] * Static33.anInt1051 + arg7[5] * Static289.anInt5180 + Static86.anInt1028 * arg7[2] + 16384 >> 15;
					local396 += local50;
					local422 += local56;
					Static86.anInt1028 = local374;
					Static289.anInt5180 = local396;
					Static33.anInt1051 = local422;
					Static400.aBoolean458 = false;
				}
				@Pc(441) int[] local441 = new int[9];
				local396 = Class145.anIntArray280[arg2];
				local422 = Class145.anIntArray279[arg2];
				local453 = Class145.anIntArray280[arg3];
				local457 = Class145.anIntArray279[arg3];
				local461 = Class145.anIntArray280[arg4];
				local465 = Class145.anIntArray279[arg4];
				local473 = local461 * local422 + 16384 >> 15;
				local481 = local465 * local422 + 16384 >> 15;
				local441[8] = local453 * local396 + 16384 >> 15;
				local441[6] = -local457 * local461 + local481 * local453 + 16384 >> 15;
				local441[7] = local457 * local465 + local473 * local453 + 16384 >> 15;
				local441[0] = local457 * local481 + local461 * local453 + 16384 >> 15;
				local441[3] = local396 * local465 + 16384 >> 15;
				local441[5] = -local422;
				local441[2] = local457 * local396 + 16384 >> 15;
				local441[4] = local461 * local396 + 16384 >> 15;
				local441[1] = -local453 * local465 + local457 * local473 + 16384 >> 15;
				@Pc(611) int local611 = local441[1] * -Static289.anInt5180 + -Static86.anInt1028 * local441[0] + local441[2] * -Static33.anInt1051 + 16384 >> 15;
				local637 = local441[3] * -Static86.anInt1028 + local441[4] * -Static289.anInt5180 + -Static33.anInt1051 * local441[5] + 16384 >> 15;
				local664 = -Static86.anInt1028 * local441[6] + local441[7] * -Static289.anInt5180 + local441[8] * -Static33.anInt1051 + 16384 >> 15;
				local668 = Static86.anInt1028 + local611;
				@Pc(672) int local672 = local637 + Static289.anInt5180;
				local676 = local664 + Static33.anInt1051;
				@Pc(679) int[] local679 = new int[9];
				for (local681 = 0; local681 < 3; local681++) {
					for (local685 = 0; local685 < 3; local685++) {
						local689 = 0;
						for (local691 = 0; local691 < 3; local691++) {
							local689 += arg7[local685 * 3 + local691] * local441[local691 + local681 * 3];
						}
						local679[local685 + local681 * 3] = local689 + 16384 >> 15;
					}
				}
				local685 = local250 * local441[0] + local441[1] * local50 + local56 * local441[2] + 16384 >> 15;
				local689 = local441[3] * local250 + local441[4] * local50 + local56 * local441[5] + 16384 >> 15;
				local689 += local672;
				local691 = local250 * local441[6] + local441[7] * local50 + local441[8] * local56 + 16384 >> 15;
				local685 += local668;
				local691 += local676;
				local823 = new int[9];
				for (local825 = 0; local825 < 3; local825++) {
					for (local829 = 0; local829 < 3; local829++) {
						local833 = 0;
						for (local835 = 0; local835 < 3; local835++) {
							local833 += local679[local829 + local835 * 3] * arg7[local825 * 3 + local835];
						}
						local823[local825 * 3 + local829] = local833 + 16384 >> 15;
					}
				}
				local829 = arg7[1] * local689 + local685 * arg7[0] + local691 * arg7[2] + 16384 >> 15;
				local833 = arg7[3] * local685 + local689 * arg7[4] + arg7[5] * local691 + 16384 >> 15;
				local829 += local24;
				local833 += local32;
				local835 = arg7[8] * local691 + local689 * arg7[7] + local685 * arg7[6] + 16384 >> 15;
				local835 += local38;
				for (local963 = 0; local963 < local8; local963++) {
					@Pc(969) int local969 = arg1[local963];
					if (local969 < this.anIntArrayArray49.length) {
						@Pc(979) int[] local979 = this.anIntArrayArray49[local969];
						for (@Pc(981) int local981 = 0; local981 < local979.length; local981++) {
							@Pc(987) int local987 = local979[local981];
							if (this.aShortArray106 == null || (arg6 & this.aShortArray106[local987]) != 0) {
								@Pc(1029) int local1029 = this.anIntArray492[local987] * local823[0] + this.anIntArray491[local987] * local823[1] + local823[2] * this.anIntArray489[local987] + 16384 >> 15;
								@Pc(1060) int local1060 = local823[5] * this.anIntArray489[local987] + this.anIntArray492[local987] * local823[3] + this.anIntArray491[local987] * local823[4] + 16384 >> 15;
								@Pc(1064) int local1064 = local1060 + local833;
								@Pc(1068) int local1068 = local1029 + local829;
								@Pc(1101) int local1101 = this.anIntArray492[local987] * local823[6] + this.anIntArray491[local987] * local823[7] + local823[8] * this.anIntArray489[local987] + 16384 >> 15;
								@Pc(1105) int local1105 = local1101 + local835;
								this.anIntArray492[local987] = local1068;
								this.anIntArray491[local987] = local1064;
								this.anIntArray489[local987] = local1105;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2571) Class33 local2571;
			@Pc(2576) Class89 local2576;
			if (arg0 == 5) {
				if (this.anIntArrayArray48 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray48.length > local32) {
							local248 = this.anIntArrayArray48[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local50 = local248[local250];
								if (this.aShortArray103 == null || (arg6 & this.aShortArray103[local50]) != 0) {
									local56 = arg2 * 8 + (this.aByteArray89[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray89[local50] = (byte) local56;
									if (this.aClass23_13 != null) {
										this.aClass23_13.anInterface5_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass33Array1 != null) {
						for (local32 = 0; local32 < this.anInt7071; local32++) {
							local2571 = this.aClass33Array1[local32];
							local2576 = this.aClass89Array1[local32];
							local2576.anInt2772 = 255 - (this.aByteArray89[local2571.anInt1179] & 0xFF) << 24 | local2576.anInt2772 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2825) Class89 local2825;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray50.length) {
								local248 = this.anIntArrayArray50[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2825 = this.aClass89Array1[local248[local250]];
									local2825.anInt2780 += arg3;
									local2825.anInt2775 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray50.length) {
								local248 = this.anIntArrayArray50[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2825 = this.aClass89Array1[local248[local250]];
									local2825.anInt2777 = local2825.anInt2777 * arg3 >> 7;
									local2825.anInt2774 = local2825.anInt2774 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray50.length) {
							local248 = this.anIntArrayArray50[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2825 = this.aClass89Array1[local248[local250]];
								local2825.anInt2773 = arg2 + local2825.anInt2773 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray48 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray48.length > local32) {
						local248 = this.anIntArrayArray48[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local50 = local248[local250];
							if (this.aShortArray103 == null || (this.aShortArray103[local50] & arg6) != 0) {
								local56 = this.aShortArray109[local50] & 0xFFFF;
								local374 = local56 >> 10 & 0x3F;
								local396 = local56 >> 7 & 0x7;
								@Pc(2675) int local2675 = arg2 + local374 & 0x3F;
								local422 = local56 & 0x7F;
								local396 += arg3 / 4;
								if (local396 < 0) {
									local396 = 0;
								} else if (local396 > 7) {
									local396 = 7;
								}
								local422 += arg4;
								if (local422 < 0) {
									local422 = 0;
								} else if (local422 > 127) {
									local422 = 127;
								}
								this.aShortArray109[local50] = (short) (local396 << 7 | local2675 << 10 | local422);
								if (this.aClass23_13 != null) {
									this.aClass23_13.anInterface5_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass33Array1 != null) {
					for (local32 = 0; local32 < this.anInt7071; local32++) {
						local2571 = this.aClass33Array1[local32];
						local2576 = this.aClass89Array1[local32];
						local2576.anInt2772 = local2576.anInt2772 & 0xFF000000 | Static427.anIntArray525[this.aShortArray109[local2571.anInt1179] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray49.length > local32) {
					local248 = this.anIntArrayArray49[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local50 = local248[local250];
						if (this.aShortArray106 == null || (this.aShortArray106[local50] & arg6) != 0) {
							this.anIntArray492[local50] -= Static86.anInt1028;
							this.anIntArray491[local50] -= Static289.anInt5180;
							this.anIntArray489[local50] -= Static33.anInt1051;
							this.anIntArray492[local50] = this.anIntArray492[local50] * arg2 >> 7;
							this.anIntArray491[local50] = this.anIntArray491[local50] * arg3 >> 7;
							this.anIntArray489[local50] = this.anIntArray489[local50] * arg4 >> 7;
							this.anIntArray492[local50] += Static86.anInt1028;
							this.anIntArray491[local50] += Static289.anInt5180;
							this.anIntArray489[local50] += Static33.anInt1051;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static400.aBoolean458) {
				local374 = Static33.anInt1051 * arg7[6] + arg7[0] * Static86.anInt1028 + arg7[3] * Static289.anInt5180 + 16384 >> 15;
				local396 = Static86.anInt1028 * arg7[1] + arg7[4] * Static289.anInt5180 + arg7[7] * Static33.anInt1051 + 16384 >> 15;
				local396 += local50;
				local422 = arg7[8] * Static33.anInt1051 + Static289.anInt5180 * arg7[5] + arg7[2] * Static86.anInt1028 + 16384 >> 15;
				local374 += local250;
				Static86.anInt1028 = local374;
				Static289.anInt5180 = local396;
				local422 += local56;
				Static33.anInt1051 = local422;
				Static400.aBoolean458 = false;
			}
			local374 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local422 = arg4 << 15 >> 7;
			local453 = -Static86.anInt1028 * local374 + 16384 >> 15;
			local457 = local396 * -Static289.anInt5180 + 16384 >> 15;
			local461 = -Static33.anInt1051 * local422 + 16384 >> 15;
			local465 = local453 + Static86.anInt1028;
			local473 = local457 + Static289.anInt5180;
			local481 = local461 + Static33.anInt1051;
			@Pc(1869) int[] local1869 = new int[] { arg7[0] * local374 + 16384 >> 15, arg7[3] * local374 + 16384 >> 15, arg7[6] * local374 + 16384 >> 15, local396 * arg7[1] + 16384 >> 15, arg7[4] * local396 + 16384 >> 15, arg7[7] * local396 + 16384 >> 15, local422 * arg7[2] + 16384 >> 15, local422 * arg7[5] + 16384 >> 15, arg7[8] * local422 + 16384 >> 15 };
			local637 = local374 * local250 + 16384 >> 15;
			local664 = local50 * local396 + 16384 >> 15;
			@Pc(1997) int local1997 = local664 + local473;
			local668 = local422 * local56 + 16384 >> 15;
			@Pc(2009) int local2009 = local637 + local465;
			@Pc(2013) int local2013 = local668 + local481;
			@Pc(2016) int[] local2016 = new int[9];
			@Pc(2022) int local2022;
			for (local676 = 0; local676 < 3; local676++) {
				for (local2022 = 0; local2022 < 3; local2022++) {
					local681 = 0;
					for (local685 = 0; local685 < 3; local685++) {
						local681 += arg7[local685 + local676 * 3] * local1869[local685 * 3 + local2022];
					}
					local2016[local2022 + local676 * 3] = local681 + 16384 >> 15;
				}
			}
			local2022 = local2013 * arg7[2] + local1997 * arg7[1] + local2009 * arg7[0] + 16384 >> 15;
			local681 = local1997 * arg7[4] + arg7[3] * local2009 + local2013 * arg7[5] + 16384 >> 15;
			local681 += local32;
			local685 = local2009 * arg7[6] + arg7[7] * local1997 + local2013 * arg7[8] + 16384 >> 15;
			local2022 += local24;
			local685 += local38;
			for (local689 = 0; local689 < local8; local689++) {
				local691 = arg1[local689];
				if (this.anIntArrayArray49.length > local691) {
					local823 = this.anIntArrayArray49[local691];
					for (local825 = 0; local825 < local823.length; local825++) {
						local829 = local823[local825];
						if (this.aShortArray106 == null || (arg6 & this.aShortArray106[local829]) != 0) {
							local833 = local2016[1] * this.anIntArray491[local829] + this.anIntArray492[local829] * local2016[0] + local2016[2] * this.anIntArray489[local829] + 16384 >> 15;
							local835 = this.anIntArray489[local829] * local2016[5] + local2016[4] * this.anIntArray491[local829] + local2016[3] * this.anIntArray492[local829] + 16384 >> 15;
							local963 = local2016[7] * this.anIntArray491[local829] + this.anIntArray492[local829] * local2016[6] + this.anIntArray489[local829] * local2016[8] + 16384 >> 15;
							@Pc(2293) int local2293 = local835 + local681;
							@Pc(2297) int local2297 = local833 + local2022;
							@Pc(2301) int local2301 = local963 + local685;
							this.anIntArray492[local829] = local2297;
							this.anIntArray491[local829] = local2293;
							this.anIntArray489[local829] = local2301;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			Static86.anInt1028 = 0;
			local26 = 0;
			Static33.anInt1051 = 0;
			Static289.anInt5180 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray49.length) {
					local48 = this.anIntArrayArray49[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static86.anInt1028 += this.anIntArray492[local56];
						Static289.anInt5180 += this.anIntArray491[local56];
						local26++;
						Static33.anInt1051 += this.anIntArray489[local56];
					}
				}
			}
			if (local26 > 0) {
				Static86.anInt1028 = local18 + Static86.anInt1028 / local26;
				Static289.anInt5180 = local14 + Static289.anInt5180 / local26;
				Static33.anInt1051 = Static33.anInt1051 / local26 + local22;
			} else {
				Static289.anInt5180 = local14;
				Static86.anInt1028 = local18;
				Static33.anInt1051 = local22;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			local14 = arg3 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray49.length) {
					local158 = this.anIntArrayArray49[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray492[local50] += local18;
						this.anIntArray491[local50] += local14;
						this.anIntArray489[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(744) int local744;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray49.length) {
					local158 = this.anIntArrayArray49[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray492[local50] -= Static86.anInt1028;
							this.anIntArray491[local50] -= Static289.anInt5180;
							this.anIntArray489[local50] -= Static33.anInt1051;
							if (arg4 != 0) {
								local56 = Class145.anIntArray279[arg4];
								local271 = Class145.anIntArray280[arg4];
								local289 = this.anIntArray492[local50] * local271 + this.anIntArray491[local50] * local56 + 32767 >> 15;
								this.anIntArray491[local50] = local271 * this.anIntArray491[local50] + 32767 - local56 * this.anIntArray492[local50] >> 15;
								this.anIntArray492[local50] = local289;
							}
							if (arg2 != 0) {
								local56 = Class145.anIntArray279[arg2];
								local271 = Class145.anIntArray280[arg2];
								local289 = local271 * this.anIntArray491[local50] + 32767 - this.anIntArray489[local50] * local56 >> 15;
								this.anIntArray489[local50] = local271 * this.anIntArray489[local50] + local56 * this.anIntArray491[local50] + 32767 >> 15;
								this.anIntArray491[local50] = local289;
							}
							if (arg3 != 0) {
								local56 = Class145.anIntArray279[arg3];
								local271 = Class145.anIntArray280[arg3];
								local289 = this.anIntArray492[local50] * local271 + this.anIntArray489[local50] * local56 + 32767 >> 15;
								this.anIntArray489[local50] = this.anIntArray489[local50] * local271 + 32767 - this.anIntArray492[local50] * local56 >> 15;
								this.anIntArray492[local50] = local289;
							}
							this.anIntArray492[local50] += Static86.anInt1028;
							this.anIntArray491[local50] += Static289.anInt5180;
							this.anIntArray489[local50] += Static33.anInt1051;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray492[local50] -= Static86.anInt1028;
							this.anIntArray491[local50] -= Static289.anInt5180;
							this.anIntArray489[local50] -= Static33.anInt1051;
							if (arg2 != 0) {
								local56 = Class145.anIntArray279[arg2];
								local271 = Class145.anIntArray280[arg2];
								local289 = local271 * this.anIntArray491[local50] + 32767 - local56 * this.anIntArray489[local50] >> 15;
								this.anIntArray489[local50] = local271 * this.anIntArray489[local50] + local56 * this.anIntArray491[local50] + 32767 >> 15;
								this.anIntArray491[local50] = local289;
							}
							if (arg4 != 0) {
								local56 = Class145.anIntArray279[arg4];
								local271 = Class145.anIntArray280[arg4];
								local289 = local271 * this.anIntArray492[local50] + this.anIntArray491[local50] * local56 + 32767 >> 15;
								this.anIntArray491[local50] = local271 * this.anIntArray491[local50] + 32767 - local56 * this.anIntArray492[local50] >> 15;
								this.anIntArray492[local50] = local289;
							}
							if (arg3 != 0) {
								local56 = Class145.anIntArray279[arg3];
								local271 = Class145.anIntArray280[arg3];
								local289 = this.anIntArray489[local50] * local56 + local271 * this.anIntArray492[local50] + 32767 >> 15;
								this.anIntArray489[local50] = local271 * this.anIntArray489[local50] + 32767 - local56 * this.anIntArray492[local50] >> 15;
								this.anIntArray492[local50] = local289;
							}
							this.anIntArray492[local50] += Static86.anInt1028;
							this.anIntArray491[local50] += Static289.anInt5180;
							this.anIntArray489[local50] += Static33.anInt1051;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray49.length > local38) {
						local48 = this.anIntArrayArray49[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local271 = this.anIntArray490[local56];
							local289 = this.anIntArray490[local56 + 1];
							for (local744 = local271; local744 < local289; local744++) {
								@Pc(753) int local753 = this.aShortArray101[local744] - 1;
								if (local753 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(787) int local787;
								if (arg4 != 0) {
									local765 = Class145.anIntArray279[arg4];
									local769 = Class145.anIntArray280[arg4];
									local787 = local765 * this.aShortArray108[local753] + this.aShortArray102[local753] * local769 + 32767 >> 15;
									this.aShortArray108[local753] = (short) (this.aShortArray108[local753] * local769 + 32767 - local765 * this.aShortArray102[local753] >> 15);
									this.aShortArray102[local753] = (short) local787;
								}
								if (arg2 != 0) {
									local765 = Class145.anIntArray279[arg2];
									local769 = Class145.anIntArray280[arg2];
									local787 = this.aShortArray108[local753] * local769 + 32767 - this.aShortArray104[local753] * local765 >> 15;
									this.aShortArray104[local753] = (short) (this.aShortArray108[local753] * local765 + local769 * this.aShortArray104[local753] + 32767 >> 15);
									this.aShortArray108[local753] = (short) local787;
								}
								if (arg3 != 0) {
									local765 = Class145.anIntArray279[arg3];
									local769 = Class145.anIntArray280[arg3];
									local787 = this.aShortArray104[local753] * local765 + local769 * this.aShortArray102[local753] + 32767 >> 15;
									this.aShortArray104[local753] = (short) (local769 * this.aShortArray104[local753] + 32767 - local765 * this.aShortArray102[local753] >> 15);
									this.aShortArray102[local753] = (short) local787;
								}
							}
						}
					}
				}
				if (this.aClass23_14 == null && this.aClass23_13 != null) {
					this.aClass23_13.anInterface5_1 = null;
				}
				if (this.aClass23_14 != null) {
					this.aClass23_14.anInterface5_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray49.length) {
					local158 = this.anIntArrayArray49[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray492[local50] -= Static86.anInt1028;
						this.anIntArray491[local50] -= Static289.anInt5180;
						this.anIntArray489[local50] -= Static33.anInt1051;
						this.anIntArray492[local50] = arg2 * this.anIntArray492[local50] >> 7;
						this.anIntArray491[local50] = arg3 * this.anIntArray491[local50] >> 7;
						this.anIntArray489[local50] = arg4 * this.anIntArray489[local50] >> 7;
						this.anIntArray492[local50] += Static86.anInt1028;
						this.anIntArray491[local50] += Static289.anInt5180;
						this.anIntArray489[local50] += Static33.anInt1051;
					}
				}
			}
		} else {
			@Pc(1212) Class33 local1212;
			@Pc(1217) Class89 local1217;
			if (arg0 == 5) {
				if (this.anIntArrayArray48 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray48.length) {
							local158 = this.anIntArrayArray48[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local50 = local158[local160];
								local56 = (this.aByteArray89[local50] & 0xFF) + (arg2 * 8);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray89[local50] = (byte) local56;
							}
							if (local158.length > 0 && this.aClass23_13 != null) {
								this.aClass23_13.anInterface5_1 = null;
							}
						}
					}
					if (this.aClass33Array1 != null) {
						for (local32 = 0; local32 < this.anInt7071; local32++) {
							local1212 = this.aClass33Array1[local32];
							local1217 = this.aClass89Array1[local32];
							local1217.anInt2772 = local1217.anInt2772 & 0xFFFFFF | 255 - (this.aByteArray89[local1212.anInt1179] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1462) Class89 local1462;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray50.length) {
								local158 = this.anIntArrayArray50[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1462 = this.aClass89Array1[local158[local160]];
									local1462.anInt2780 += arg3;
									local1462.anInt2775 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray50.length > local32) {
								local158 = this.anIntArrayArray50[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1462 = this.aClass89Array1[local158[local160]];
									local1462.anInt2777 = local1462.anInt2777 * arg3 >> 7;
									local1462.anInt2774 = arg2 * local1462.anInt2774 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray50.length) {
							local158 = this.anIntArrayArray50[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1462 = this.aClass89Array1[local158[local160]];
								local1462.anInt2773 = arg2 + local1462.anInt2773 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray48 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray48.length > local32) {
						local158 = this.anIntArrayArray48[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							local56 = this.aShortArray109[local50] & 0xFFFF;
							local271 = local56 >> 10 & 0x3F;
							local289 = local56 >> 7 & 0x7;
							local289 += arg3 / 4;
							local744 = local56 & 0x7F;
							@Pc(1315) int local1315 = arg2 + local271 & 0x3F;
							local744 += arg4;
							if (local289 < 0) {
								local289 = 0;
							} else if (local289 > 7) {
								local289 = 7;
							}
							if (local744 < 0) {
								local744 = 0;
							} else if (local744 > 127) {
								local744 = 127;
							}
							this.aShortArray109[local50] = (short) (local289 << 7 | local1315 << 10 | local744);
						}
						if (local158.length > 0 && this.aClass23_13 != null) {
							this.aClass23_13.anInterface5_1 = null;
						}
					}
				}
				if (this.aClass33Array1 != null) {
					for (local32 = 0; local32 < this.anInt7071; local32++) {
						local1212 = this.aClass33Array1[local32];
						local1217 = this.aClass89Array1[local32];
						local1217.anInt2772 = local1217.anInt2772 & 0xFF000000 | Static427.anIntArray525[this.aShortArray109[local1212.anInt1179] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "()I")
	@Override
	public int method5811() {
		return this.anInt7068;
	}

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "()I")
	@Override
	public int method5820() {
		return this.aShort90;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method5853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg0 && arg1 < arg2 && arg1 < arg6) {
			return false;
		} else if (arg0 < arg1 && arg2 < arg1 && arg1 > arg6) {
			return false;
		} else if (arg5 < arg4 && arg5 < arg3 && arg7 > arg5) {
			return false;
		} else {
			return arg5 <= arg4 || arg5 <= arg3 || arg5 <= arg7;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()[Lclient!in;")
	@Override
	public Class119[] method5794() {
		return this.aClass119Array3;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ml;I)V")
	private void method5854(@OriginalArg(0) Class5_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass119Array3 != null) {
			for (local6 = 0; local6 < this.aClass119Array3.length; local6++) {
				@Pc(13) Class119 local13 = this.aClass119Array3[local6];
				@Pc(15) Class119 local15 = local13;
				if (local13.aClass119_1 != null) {
					local15 = local13.aClass119_1;
				}
				local15.anInt3444 = (int) ((float) this.anIntArray489[local13.anInt3446] * arg0.aFloat39 + (float) this.anIntArray492[local13.anInt3446] * arg0.aFloat38 + arg0.aFloat44 * (float) this.anIntArray491[local13.anInt3446] + arg0.aFloat47);
				local15.anInt3443 = (int) (arg0.aFloat41 + (float) this.anIntArray491[local13.anInt3446] * arg0.aFloat46 + (float) this.anIntArray492[local13.anInt3446] * arg0.aFloat43 + arg0.aFloat45 * (float) this.anIntArray489[local13.anInt3446]);
				local15.anInt3455 = (int) (arg0.aFloat40 + (float) this.anIntArray489[local13.anInt3446] * arg0.aFloat48 + (float) this.anIntArray491[local13.anInt3446] * arg0.aFloat42 + (float) this.anIntArray492[local13.anInt3446] * arg0.aFloat49);
				local15.anInt3453 = (int) (arg0.aFloat47 + arg0.aFloat39 * (float) this.anIntArray489[local13.anInt3458] + (float) this.anIntArray492[local13.anInt3458] * arg0.aFloat38 + (float) this.anIntArray491[local13.anInt3458] * arg0.aFloat44);
				local15.anInt3445 = (int) (arg0.aFloat41 + (float) this.anIntArray489[local13.anInt3458] * arg0.aFloat45 + (float) this.anIntArray492[local13.anInt3458] * arg0.aFloat43 + arg0.aFloat46 * (float) this.anIntArray491[local13.anInt3458]);
				local15.anInt3449 = (int) (arg0.aFloat40 + (float) this.anIntArray489[local13.anInt3458] * arg0.aFloat48 + arg0.aFloat49 * (float) this.anIntArray492[local13.anInt3458] + (float) this.anIntArray491[local13.anInt3458] * arg0.aFloat42);
				local15.anInt3447 = (int) (arg0.aFloat38 * (float) this.anIntArray492[local13.anInt3459] + (float) this.anIntArray491[local13.anInt3459] * arg0.aFloat44 + (float) this.anIntArray489[local13.anInt3459] * arg0.aFloat39 + arg0.aFloat47);
				local15.anInt3451 = (int) (arg0.aFloat41 + arg0.aFloat46 * (float) this.anIntArray491[local13.anInt3459] + (float) this.anIntArray492[local13.anInt3459] * arg0.aFloat43 + arg0.aFloat45 * (float) this.anIntArray489[local13.anInt3459]);
				local15.anInt3457 = (int) (arg0.aFloat40 + (float) this.anIntArray491[local13.anInt3459] * arg0.aFloat42 + (float) this.anIntArray492[local13.anInt3459] * arg0.aFloat49 + arg0.aFloat48 * (float) this.anIntArray489[local13.anInt3459]);
			}
		}
		if (this.aClass94Array3 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass94Array3.length; local6++) {
			@Pc(358) Class94 local358 = this.aClass94Array3[local6];
			@Pc(360) Class94 local360 = local358;
			if (local358.aClass94_1 != null) {
				local360 = local358.aClass94_1;
			}
			if (local358.aClass5_1 == null) {
				local358.aClass5_1 = arg0.method3851();
			} else {
				local358.aClass5_1.method3834(arg0);
			}
			local360.anInt2885 = (int) (arg0.aFloat47 + arg0.aFloat39 * (float) this.anIntArray489[local358.anInt2880] + (float) this.anIntArray492[local358.anInt2880] * arg0.aFloat38 + arg0.aFloat44 * (float) this.anIntArray491[local358.anInt2880]);
			local360.anInt2886 = (int) (arg0.aFloat41 + arg0.aFloat43 * (float) this.anIntArray492[local358.anInt2880] + (float) this.anIntArray491[local358.anInt2880] * arg0.aFloat46 + (float) this.anIntArray489[local358.anInt2880] * arg0.aFloat45);
			local360.anInt2883 = (int) (arg0.aFloat40 + (float) this.anIntArray492[local358.anInt2880] * arg0.aFloat49 + (float) this.anIntArray491[local358.anInt2880] * arg0.aFloat42 + arg0.aFloat48 * (float) this.anIntArray489[local358.anInt2880]);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
	@Override
	public int method5795() {
		return this.aShort96;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	@Override
	public void method5806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7069; local3++) {
			if (arg0 != 0) {
				this.anIntArray492[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray491[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray489[local3] += arg2;
			}
		}
		this.aBoolean455 = false;
		if (this.aClass23_16 != null) {
			this.aClass23_16.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "()I")
	@Override
	public int method5838() {
		if (!this.aBoolean455) {
			this.method5848();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
	private void method5856(@OriginalArg(1) boolean arg0) {
		if (this.anInt7080 * 6 <= Static89.aClass6_Sub1_Sub2_2.aByteArray96.length) {
			Static89.aClass6_Sub1_Sub2_2.anInt7898 = 0;
		} else {
			Static89.aClass6_Sub1_Sub2_2 = new Class6_Sub1_Sub2(this.anInt7080 * 6 + 600);
		}
		@Pc(44) int local44;
		if (this.aClass66_Sub2_40.aBoolean373) {
			for (local44 = 0; local44 < this.anInt7080; local44++) {
				Static89.aClass6_Sub1_Sub2_2.method6453(this.aShortArray110[local44]);
				Static89.aClass6_Sub1_Sub2_2.method6453(this.aShortArray105[local44]);
				Static89.aClass6_Sub1_Sub2_2.method6453(this.aShortArray107[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt7080; local44++) {
				Static89.aClass6_Sub1_Sub2_2.method6480(this.aShortArray110[local44]);
				Static89.aClass6_Sub1_Sub2_2.method6480(this.aShortArray105[local44]);
				Static89.aClass6_Sub1_Sub2_2.method6480(this.aShortArray107[local44]);
			}
		}
		if (Static89.aClass6_Sub1_Sub2_2.anInt7898 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface4_5 == null) {
				this.anInterface4_5 = this.aClass66_Sub2_40.method5136(true, Static89.aClass6_Sub1_Sub2_2.aByteArray96, Static89.aClass6_Sub1_Sub2_2.anInt7898);
			} else {
				this.anInterface4_5.method4586(Static89.aClass6_Sub1_Sub2_2.aByteArray96, Static89.aClass6_Sub1_Sub2_2.anInt7898);
			}
			this.aClass186_1.anInterface4_2 = this.anInterface4_5;
		} else {
			this.aClass186_1.anInterface4_2 = this.aClass66_Sub2_40.method5136(false, Static89.aClass6_Sub1_Sub2_2.aByteArray96, Static89.aClass6_Sub1_Sub2_2.anInt7898);
		}
		if (!arg0) {
			this.aBoolean454 = true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
	private void method5857() {
		if (!this.aBoolean454) {
			return;
		}
		this.aBoolean454 = false;
		if (this.aClass119Array3 == null && this.aClass94Array3 == null && this.aClass33Array1 == null) {
			if (this.anIntArray492 != null && !Static178.method6354(this.anInt7081, this.anInt7068)) {
				if (this.aClass23_16 != null && this.aClass23_16.anInterface5_1 == null) {
					this.aBoolean454 = true;
				} else {
					if (!this.aBoolean455) {
						this.method5848();
					}
					this.anIntArray492 = null;
				}
			}
			if (this.anIntArray491 != null && !Static36.method906(this.anInt7068, this.anInt7081)) {
				if (this.aClass23_16 != null && this.aClass23_16.anInterface5_1 == null) {
					this.aBoolean454 = true;
				} else {
					if (!this.aBoolean455) {
						this.method5848();
					}
					this.anIntArray491 = null;
				}
			}
			if (this.anIntArray489 != null && !Static271.method4042(this.anInt7068, this.anInt7081)) {
				if (this.aClass23_16 != null && this.aClass23_16.anInterface5_1 == null) {
					this.aBoolean454 = true;
				} else {
					if (!this.aBoolean455) {
						this.method5848();
					}
					this.anIntArray489 = null;
				}
			}
		}
		if (this.aShortArray101 != null && this.anIntArray492 == null && this.anIntArray491 == null && this.anIntArray489 == null) {
			this.anIntArray490 = null;
			this.aShortArray101 = null;
		}
		if (this.aByteArray88 != null && !Static134.method2369(this.anInt7068, this.anInt7081)) {
			if (this.aClass23_14 == null) {
				if (this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null) {
					this.aBoolean454 = true;
				} else {
					this.aByteArray88 = null;
					this.aShortArray102 = this.aShortArray108 = this.aShortArray104 = null;
				}
			} else if (this.aClass23_14.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.aShortArray102 = this.aShortArray108 = this.aShortArray104 = null;
				this.aByteArray88 = null;
			}
		}
		if (this.aShortArray109 != null && !Static214.method3235(this.anInt7081, this.anInt7068)) {
			if (this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.aShortArray109 = null;
			}
		}
		if (this.aByteArray89 != null && !Static122.method2103(this.anInt7068, this.anInt7081)) {
			if (this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.aByteArray89 = null;
			}
		}
		if (this.aFloatArray27 != null && !Static451.method6578(this.anInt7081, this.anInt7068)) {
			if (this.aClass23_15 != null && this.aClass23_15.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.aFloatArray27 = this.aFloatArray28 = null;
			}
		}
		if (this.lb != null && !Static117.method2023(this.anInt7068, this.anInt7081)) {
			if (this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.lb = null;
			}
		}
		if (this.aShortArray110 != null && !Static67.method1385(this.anInt7068, this.anInt7081)) {
			if (this.aClass186_1 != null && this.aClass186_1.anInterface4_2 == null || this.aClass23_13 != null && this.aClass23_13.anInterface5_1 == null) {
				this.aBoolean454 = true;
			} else {
				this.aShortArray110 = this.aShortArray105 = this.aShortArray107 = null;
			}
		}
		if (this.anIntArrayArray48 != null && !Static387.method5710(this.anInt7081, this.anInt7068)) {
			this.aShortArray103 = null;
			this.anIntArrayArray48 = null;
		}
		if (this.anIntArrayArray49 != null && !Static120.method2812(this.anInt7068, this.anInt7081)) {
			this.aShortArray106 = null;
			this.anIntArrayArray49 = null;
		}
		if (this.anIntArrayArray50 != null && !Static54.method1223(this.anInt7081, this.anInt7068)) {
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArray488 != null && (this.anInt7068 & 0x800) == 0 && (this.anInt7068 & 0x40000) == 0) {
			this.anIntArray488 = null;
		}
	}
}
