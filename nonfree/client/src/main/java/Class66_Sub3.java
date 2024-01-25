import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
	private int anInt9042;

	@OriginalMember(owner = "client!vaa", name = "u", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!vaa", name = "w", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!vaa", name = "B", descriptor = "[Lclient!rda;")
	private Class281[] aClass281Array1;

	@OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
	private int anInt9053;

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "[Lclient!ik;")
	private Class161[] aClass161Array1;

	@OriginalMember(owner = "client!vaa", name = "G", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!vaa", name = "N", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!vaa", name = "O", descriptor = "Lclient!nl;")
	private Interface18 anInterface18_7;

	@OriginalMember(owner = "client!vaa", name = "P", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!vaa", name = "R", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!vaa", name = "V", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!vaa", name = "X", descriptor = "[I")
	private int[] anIntArray656;

	@OriginalMember(owner = "client!vaa", name = "Y", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!vaa", name = "Z", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!vaa", name = "cb", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!vaa", name = "eb", descriptor = "B")
	private byte aByte113;

	@OriginalMember(owner = "client!vaa", name = "kb", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!vaa", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!vaa", name = "ob", descriptor = "I")
	private int anInt9071;

	@OriginalMember(owner = "client!vaa", name = "pb", descriptor = "[Lclient!hi;")
	private Class139[] aClass139Array5;

	@OriginalMember(owner = "client!vaa", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!vaa", name = "ub", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!vaa", name = "wb", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!vaa", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vaa", name = "zb", descriptor = "[F")
	private float[] aFloatArray68;

	@OriginalMember(owner = "client!vaa", name = "Ab", descriptor = "[I")
	private int[] anIntArray657;

	@OriginalMember(owner = "client!vaa", name = "Cb", descriptor = "[Lclient!qg;")
	private Class270[] aClass270Array5;

	@OriginalMember(owner = "client!vaa", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vaa", name = "Hb", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!vaa", name = "Ib", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!vaa", name = "Pb", descriptor = "Lclient!iq;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!vaa", name = "Wb", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!vaa", name = "Xb", descriptor = "[I")
	private int[] anIntArray658;

	@OriginalMember(owner = "client!vaa", name = "Zb", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!vaa", name = "gc", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!vaa", name = "lc", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!vaa", name = "nc", descriptor = "[I")
	private int[] anIntArray659;

	@OriginalMember(owner = "client!vaa", name = "oc", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!vaa", name = "rc", descriptor = "[I")
	private int[] anIntArray660;

	@OriginalMember(owner = "client!vaa", name = "sc", descriptor = "Lclient!dw;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!vaa", name = "uc", descriptor = "[F")
	private float[] aFloatArray69;

	@OriginalMember(owner = "client!vaa", name = "xc", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!vaa", name = "J", descriptor = "Z")
	private boolean aBoolean692 = true;

	@OriginalMember(owner = "client!vaa", name = "W", descriptor = "I")
	private int anInt9062 = 0;

	@OriginalMember(owner = "client!vaa", name = "ac", descriptor = "Z")
	private boolean aBoolean693 = false;

	@OriginalMember(owner = "client!vaa", name = "bc", descriptor = "I")
	private int anInt9091 = 0;

	@OriginalMember(owner = "client!vaa", name = "mc", descriptor = "I")
	private int anInt9100 = 0;

	@OriginalMember(owner = "client!vaa", name = "qc", descriptor = "I")
	private int anInt9102 = 0;

	@OriginalMember(owner = "client!vaa", name = "vc", descriptor = "I")
	private int anInt9103 = 0;

	@OriginalMember(owner = "client!vaa", name = "yc", descriptor = "Z")
	private boolean aBoolean694 = false;

	@OriginalMember(owner = "client!vaa", name = "ib", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_40;

	@OriginalMember(owner = "client!vaa", name = "K", descriptor = "Lclient!gv;")
	private Class131 aClass131_13;

	@OriginalMember(owner = "client!vaa", name = "vb", descriptor = "Lclient!gv;")
	private Class131 aClass131_15;

	@OriginalMember(owner = "client!vaa", name = "Fb", descriptor = "Lclient!gv;")
	private Class131 aClass131_16;

	@OriginalMember(owner = "client!vaa", name = "db", descriptor = "Lclient!gv;")
	private Class131 aClass131_14;

	@OriginalMember(owner = "client!vaa", name = "tc", descriptor = "Lclient!eh;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class66_Sub3(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_40 = arg0;
		this.aClass131_13 = new Class131(null, 5126, 3, 0);
		this.aClass131_15 = new Class131(null, 5126, 2, 0);
		this.aClass131_16 = new Class131(null, 5126, 3, 0);
		this.aClass131_14 = new Class131(null, 5121, 4, 0);
		this.aClass95_1 = new Class95();
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!qj;Lclient!eg;IIII)V")
	public Class66_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass100_Sub3_40 = arg0;
		this.anInt9071 = arg2;
		this.anInt9042 = arg5;
		if (Static149.method2444(arg2, arg5)) {
			this.aClass131_13 = new Class131(null, 5126, 3, 0);
		}
		if (Static59.method959(arg5, arg2)) {
			this.aClass131_15 = new Class131(null, 5126, 2, 0);
		}
		if (Static512.method7100(arg5, arg2)) {
			this.aClass131_16 = new Class131(null, 5126, 3, 0);
		}
		if (Static530.method7283(arg5, arg2)) {
			this.aClass131_14 = new Class131(null, 5121, 4, 0);
		}
		if (Static419.method5470(arg2, arg5)) {
			this.aClass95_1 = new Class95();
		}
		@Pc(105) Interface5 local105 = arg0.anInterface5_10;
		this.anIntArray660 = new int[arg1.anInt2343 + 1];
		@Pc(116) int[] local116 = new int[arg1.anInt2351];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt2351; local118++) {
			if ((arg1.aByteArray31 == null || arg1.aByteArray31[local118] != 2) && (arg1.aShortArray33 == null || arg1.aShortArray33[local118] == -1 || !local105.method917(arg1.aShortArray33[local118] & 0xFFFF).aBoolean705)) {
				local116[this.anInt9091++] = local118;
				this.anIntArray660[arg1.aShortArray35[local118]]++;
				this.anIntArray660[arg1.aShortArray31[local118]]++;
				this.anIntArray660[arg1.aShortArray27[local118]]++;
			}
		}
		this.anInt9103 = this.anInt9091;
		@Pc(205) long[] local205 = new long[this.anInt9091];
		@Pc(214) boolean local214 = (this.anInt9071 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(369) int local369;
		label497: for (@Pc(216) int local216 = 0; local216 < this.anInt9091; local216++) {
			@Pc(222) int local222 = local116[local216];
			@Pc(224) Class343 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass214Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass214Array1.length; local237++) {
					@Pc(244) Class214 local244 = arg1.aClass214Array1[local237];
					if (local244.anInt5956 == local222) {
						@Pc(257) Class55 local257 = Static276.method3098(local244.anInt5958);
						if (local257.aBoolean108) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt9103--;
							continue label497;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray33 != null) {
				local280 = arg1.aShortArray33[local222];
				if (local280 != -1) {
					local224 = local105.method917(local280 & 0xFFFF);
					local230 = local224.aByte117;
					local232 = local224.aByte120;
				}
			}
			@Pc(331) boolean local331 = arg1.aByteArray27 != null && arg1.aByteArray27[local222] != 0 || local224 != null && local224.aBoolean702 | !local224.aBoolean696;
			if ((local214 || local331) && arg1.aByteArray28 != null) {
				local226 += arg1.aByteArray28[local222] << 17;
			}
			if (local331) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local369 = local228 + ((local280 & 0xFFFF) << 16);
			local226 += local232 & 0xFF;
			@Pc(381) int local381 = local369 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + (long) local381;
			this.aBoolean694 |= local331;
		}
		Static438.method6351(local205, local116);
		this.anIntArray658 = arg1.anIntArray155;
		this.anInt9062 = arg1.anInt2348;
		this.anInt9102 = arg1.anInt2343;
		this.aShortArray130 = arg1.aShortArray28;
		this.anIntArray659 = arg1.anIntArray148;
		this.anIntArray657 = arg1.anIntArray152;
		@Pc(438) Class189[] local438 = new Class189[this.anInt9102];
		this.aClass139Array5 = arg1.aClass139Array1;
		this.aClass270Array5 = arg1.aClass270Array1;
		@Pc(466) int local466;
		@Pc(480) int local480;
		if (arg1.aClass214Array1 != null) {
			this.anInt9053 = arg1.aClass214Array1.length;
			this.aClass281Array1 = new Class281[this.anInt9053];
			this.aClass161Array1 = new Class161[this.anInt9053];
			for (local466 = 0; local466 < this.anInt9053; local466++) {
				@Pc(473) Class214 local473 = arg1.aClass214Array1[local466];
				@Pc(478) Class55 local478 = Static276.method3098(local473.anInt5958);
				local480 = -1;
				for (@Pc(482) int local482 = 0; local482 < this.anInt9091; local482++) {
					if (local116[local482] == local473.anInt5956) {
						local480 = local482;
						break;
					}
				}
				if (local480 == -1) {
					throw new RuntimeException();
				}
				local237 = Static250.anIntArray314[arg1.aShortArray36[local473.anInt5956] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local473.anInt5956]) << 24;
				this.aClass161Array1[local466] = new Class161(local480, arg1.aShortArray35[local473.anInt5956], arg1.aShortArray31[local473.anInt5956], arg1.aShortArray27[local473.anInt5956], local478.anInt1474, local478.anInt1480, local478.anInt1476, local478.anInt1473, local478.anInt1479, local478.aBoolean108, local478.aBoolean107, local473.anInt5954);
				this.aClass281Array1[local466] = new Class281(local237);
			}
		}
		local466 = this.anInt9091 * 3;
		this.aShortArray134 = new short[local466];
		this.aFloatArray68 = new float[local466];
		this.aFloatArray69 = new float[local466];
		this.aByteArray95 = new byte[local466];
		Static395.aLongArray11 = new long[local466];
		this.aShortArray127 = new short[local466];
		this.aShort99 = (short) arg3;
		this.aShortArray135 = new short[this.anInt9091];
		if (arg1.aShortArray34 != null) {
			this.aShortArray129 = new short[this.anInt9091];
		}
		this.aShort103 = (short) arg4;
		this.aByteArray94 = new byte[this.anInt9091];
		this.aShortArray132 = new short[local466];
		this.aShortArray128 = new short[this.anInt9091];
		this.aShortArray136 = new short[local466];
		this.lb = new short[this.anInt9091];
		this.aShortArray133 = new short[this.anInt9091];
		this.aShortArray131 = new short[this.anInt9091];
		local226 = 0;
		for (local369 = 0; local369 < arg1.anInt2343; local369++) {
			local480 = this.anIntArray660[local369];
			this.anIntArray660[local369] = local226;
			local226 += local480;
			local438[local369] = new Class189();
		}
		this.anIntArray660[arg1.anInt2343] = local226;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) float[][] local724 = null;
		@Pc(750) int local750;
		@Pc(794) int local794;
		@Pc(800) int local800;
		@Pc(814) int local814;
		@Pc(816) int local816;
		@Pc(850) int local850;
		@Pc(855) int local855;
		@Pc(1011) float local1011;
		@Pc(1013) float local1013;
		@Pc(1042) float local1042;
		if (arg1.aByteArray26 != null) {
			@Pc(730) int local730 = arg1.anInt2356;
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
			local718 = new int[local730];
			local722 = new int[local730];
			local724 = new float[local730][];
			local720 = new int[local730];
			for (local794 = 0; local794 < this.anInt9091; local794++) {
				local800 = local116[local794];
				if (arg1.aByteArray26[local800] != -1) {
					local814 = arg1.aByteArray26[local800] & 0xFF;
					for (local816 = 0; local816 < 3; local816++) {
						@Pc(828) short local828;
						if (local816 == 0) {
							local828 = arg1.aShortArray35[local800];
						} else if (local816 == 1) {
							local828 = arg1.aShortArray31[local800];
						} else {
							local828 = arg1.aShortArray27[local800];
						}
						local850 = arg1.anIntArray148[local828];
						local855 = arg1.anIntArray155[local828];
						@Pc(860) int local860 = arg1.anIntArray152[local828];
						if (local850 < local733[local814]) {
							local733[local814] = local850;
						}
						if (local850 > local736[local814]) {
							local736[local814] = local850;
						}
						if (local855 < local739[local814]) {
							local739[local814] = local855;
						}
						if (local742[local814] < local855) {
							local742[local814] = local855;
						}
						if (local860 < local745[local814]) {
							local745[local814] = local860;
						}
						if (local748[local814] < local860) {
							local748[local814] = local860;
						}
					}
				}
			}
			for (local800 = 0; local800 < local730; local800++) {
				@Pc(956) byte local956 = arg1.aByteArray30[local800];
				if (local956 > 0) {
					local718[local800] = (local736[local800] + local733[local800]) / 2;
					local720[local800] = (local742[local800] + local739[local800]) / 2;
					local722[local800] = (local748[local800] + local745[local800]) / 2;
					if (local956 == 1) {
						local855 = arg1.anIntArray153[local800];
						if (local855 == 0) {
							local1011 = 1.0F;
							local1013 = 1.0F;
						} else if (local855 > 0) {
							local1013 = (float) local855 / 1024.0F;
							local1011 = 1.0F;
						} else {
							local1011 = (float) -local855 / 1024.0F;
							local1013 = 1.0F;
						}
						local1042 = 64.0F / (float) arg1.anIntArray146[local800];
					} else if (local956 == 2) {
						local1042 = 64.0F / (float) arg1.anIntArray146[local800];
						local1011 = 64.0F / (float) arg1.anIntArray153[local800];
						local1013 = 64.0F / (float) arg1.anIntArray150[local800];
					} else {
						local1013 = (float) arg1.anIntArray150[local800] / 1024.0F;
						local1011 = (float) arg1.anIntArray153[local800] / 1024.0F;
						local1042 = (float) arg1.anIntArray146[local800] / 1024.0F;
					}
					local724[local800] = Static375.method5570(local1013, arg1.aShortArray29[local800], arg1.aShortArray32[local800], local1011, arg1.aShortArray30[local800], local1042, arg1.aByteArray32[local800] & 0xFF);
				}
			}
		}
		@Pc(1133) Class317[] local1133 = new Class317[arg1.anInt2351];
		@Pc(1152) short local1152;
		@Pc(1163) int local1163;
		@Pc(1173) int local1173;
		@Pc(1232) int local1232;
		for (@Pc(1135) int local1135 = 0; local1135 < arg1.anInt2351; local1135++) {
			@Pc(1142) short local1142 = arg1.aShortArray35[local1135];
			@Pc(1147) short local1147 = arg1.aShortArray31[local1135];
			local1152 = arg1.aShortArray27[local1135];
			local1163 = this.anIntArray659[local1147] - this.anIntArray659[local1142];
			local1173 = this.anIntArray658[local1147] - this.anIntArray658[local1142];
			local750 = this.anIntArray657[local1147] - this.anIntArray657[local1142];
			local794 = this.anIntArray659[local1152] - this.anIntArray659[local1142];
			local800 = this.anIntArray658[local1152] - this.anIntArray658[local1142];
			local814 = this.anIntArray657[local1152] - this.anIntArray657[local1142];
			local816 = local1173 * local814 - local750 * local800;
			local1232 = local750 * local794 - local1163 * local814;
			local850 = local800 * local1163 - local1173 * local794;
			while (local816 > 8192 || local1232 > 8192 || local850 > 8192 || local816 < -8192 || local1232 < -8192 || local850 < -8192) {
				local850 >>= 0x1;
				local816 >>= 0x1;
				local1232 >>= 0x1;
			}
			local855 = (int) Math.sqrt((double) (local850 * local850 + local1232 * local1232 + local816 * local816));
			if (local855 <= 0) {
				local855 = 1;
			}
			local816 = local816 * 256 / local855;
			local850 = local850 * 256 / local855;
			local1232 = local1232 * 256 / local855;
			@Pc(1325) byte local1325 = arg1.aByteArray31 == null ? 0 : arg1.aByteArray31[local1135];
			if (local1325 == 0) {
				@Pc(1331) Class189 local1331 = local438[local1142];
				local1331.anInt5018 += local816;
				local1331.anInt5017 += local850;
				local1331.anInt5019 += local1232;
				local1331.anInt5020++;
				@Pc(1359) Class189 local1359 = local438[local1147];
				local1359.anInt5019 += local1232;
				local1359.anInt5020++;
				local1359.anInt5017 += local850;
				local1359.anInt5018 += local816;
				@Pc(1387) Class189 local1387 = local438[local1152];
				local1387.anInt5017 += local850;
				local1387.anInt5020++;
				local1387.anInt5019 += local1232;
				local1387.anInt5018 += local816;
			} else if (local1325 == 1) {
				@Pc(1426) Class317 local1426 = local1133[local1135] = new Class317();
				local1426.anInt8467 = local1232;
				local1426.anInt8466 = local816;
				local1426.anInt8465 = local850;
			}
		}
		@Pc(1448) int local1448;
		for (@Pc(1442) int local1442 = 0; local1442 < this.anInt9091; local1442++) {
			local1448 = local116[local1442];
			@Pc(1455) int local1455 = arg1.aShortArray36[local1448] & 0xFFFF;
			@Pc(1460) short local1460;
			if (arg1.aShortArray33 == null) {
				local1460 = -1;
			} else {
				local1460 = arg1.aShortArray33[local1448];
			}
			if (arg1.aByteArray26 == null) {
				local1173 = -1;
			} else {
				local1173 = arg1.aByteArray26[local1448];
			}
			if (arg1.aByteArray27 == null) {
				local750 = 0;
			} else {
				local750 = arg1.aByteArray27[local1448] & 0xFF;
			}
			@Pc(1495) float local1495 = 0.0F;
			@Pc(1497) float local1497 = 0.0F;
			@Pc(1499) float local1499 = 0.0F;
			local1011 = 0.0F;
			local1042 = 0.0F;
			local1013 = 0.0F;
			@Pc(1507) byte local1507 = 0;
			@Pc(1509) byte local1509 = 0;
			@Pc(1511) int local1511 = 0;
			@Pc(1527) byte local1527;
			@Pc(1544) short local1544;
			@Pc(2286) short local2286;
			@Pc(2291) short local2291;
			if (local1460 != -1) {
				if (local1173 == -1) {
					local1509 = 2;
					local1011 = 1.0F;
					local1042 = 0.0F;
					local1495 = 0.0F;
					local1507 = 1;
					local1013 = 0.0F;
					local1497 = 1.0F;
					local1499 = 1.0F;
				} else {
					local1173 &= 0xFF;
					local1527 = arg1.aByteArray30[local1173];
					@Pc(1534) short local1534;
					@Pc(1539) short local1539;
					@Pc(1573) float local1573;
					@Pc(1584) float local1584;
					@Pc(1663) float local1663;
					@Pc(1901) float local1901;
					@Pc(1909) float local1909;
					@Pc(1917) float local1917;
					@Pc(1940) float local1940;
					@Pc(1963) float local1963;
					@Pc(1986) float local1986;
					if (local1527 == 0) {
						local1534 = arg1.aShortArray35[local1448];
						local1539 = arg1.aShortArray31[local1448];
						local1544 = arg1.aShortArray27[local1448];
						local2286 = arg1.aShortArray30[local1173];
						local2291 = arg1.aShortArray29[local1173];
						@Pc(2296) short local2296 = arg1.aShortArray32[local1173];
						@Pc(2302) float local2302 = (float) arg1.anIntArray148[local2286];
						@Pc(2308) float local2308 = (float) arg1.anIntArray155[local2286];
						local1573 = arg1.anIntArray152[local2286];
						local1584 = (float) arg1.anIntArray148[local2291] - local2302;
						local1663 = (float) arg1.anIntArray155[local2291] - local2308;
						@Pc(2340) float local2340 = (float) arg1.anIntArray152[local2291] - local1573;
						@Pc(2349) float local2349 = (float) arg1.anIntArray148[local2296] - local2302;
						@Pc(2358) float local2358 = (float) arg1.anIntArray155[local2296] - local2308;
						@Pc(2367) float local2367 = (float) arg1.anIntArray152[local2296] - local1573;
						@Pc(2375) float local2375 = (float) arg1.anIntArray148[local1534] - local2302;
						@Pc(2383) float local2383 = (float) arg1.anIntArray155[local1534] - local2308;
						@Pc(2391) float local2391 = (float) arg1.anIntArray152[local1534] - local1573;
						@Pc(2400) float local2400 = (float) arg1.anIntArray148[local1539] - local2302;
						@Pc(2409) float local2409 = (float) arg1.anIntArray155[local1539] - local2308;
						local1901 = (float) arg1.anIntArray152[local1539] - local1573;
						local1909 = (float) arg1.anIntArray148[local1544] - local2302;
						local1917 = (float) arg1.anIntArray155[local1544] - local2308;
						local1940 = (float) arg1.anIntArray152[local1544] - local1573;
						local1963 = local2367 * local1663 - local2358 * local2340;
						local1986 = local2340 * local2349 - local1584 * local2367;
						@Pc(2469) float local2469 = local1584 * local2358 - local1663 * local2349;
						@Pc(2477) float local2477 = local2469 * local2358 - local1986 * local2367;
						@Pc(2485) float local2485 = local2367 * local1963 - local2349 * local2469;
						@Pc(2493) float local2493 = local1986 * local2349 - local1963 * local2358;
						@Pc(2507) float local2507 = 1.0F / (local2485 * local1663 + local1584 * local2477 + local2493 * local2340);
						local1499 = local2507 * (local2477 * local2400 + local2409 * local2485 + local1901 * local2493);
						local1042 = (local1940 * local2493 + local1909 * local2477 + local1917 * local2485) * local2507;
						local1495 = (local2477 * local2375 + local2383 * local2485 + local2493 * local2391) * local2507;
						@Pc(2557) float local2557 = local1584 * local1986 - local1963 * local1663;
						@Pc(2566) float local2566 = local1663 * local2469 - local2340 * local1986;
						@Pc(2574) float local2574 = local1963 * local2340 - local1584 * local2469;
						@Pc(2588) float local2588 = 1.0F / (local2557 * local2367 + local2349 * local2566 + local2574 * local2358);
						local1013 = local2588 * (local1909 * local2566 + local2574 * local1917 + local1940 * local2557);
						local1497 = (local2391 * local2557 + local2383 * local2574 + local2375 * local2566) * local2588;
						local1011 = local2588 * (local2557 * local1901 + local2400 * local2566 + local2409 * local2574);
					} else {
						local1534 = arg1.aShortArray35[local1448];
						local1539 = arg1.aShortArray31[local1448];
						local1544 = arg1.aShortArray27[local1448];
						@Pc(1548) int local1548 = local718[local1173];
						@Pc(1552) int local1552 = local720[local1173];
						@Pc(1556) int local1556 = local722[local1173];
						@Pc(1560) float[] local1560 = local724[local1173];
						@Pc(1565) byte local1565 = arg1.aByteArray29[local1173];
						local1573 = (float) arg1.anIntArray154[local1173] / 256.0F;
						if (local1527 == 1) {
							local1584 = (float) arg1.anIntArray150[local1173] / 1024.0F;
							Static389.method5720(local1573, local1552, local1565, arg1.anIntArray152[local1534], local1548, local1556, local1584, local1560, arg1.anIntArray148[local1534], arg1.anIntArray155[local1534]);
							local1497 = Static314.aFloat257;
							local1495 = Static325.aFloat267;
							Static389.method5720(local1573, local1552, local1565, arg1.anIntArray152[local1539], local1548, local1556, local1584, local1560, arg1.anIntArray148[local1539], arg1.anIntArray155[local1539]);
							local1011 = Static314.aFloat257;
							local1499 = Static325.aFloat267;
							Static389.method5720(local1573, local1552, local1565, arg1.anIntArray152[local1544], local1548, local1556, local1584, local1560, arg1.anIntArray148[local1544], arg1.anIntArray155[local1544]);
							local1013 = Static314.aFloat257;
							local1042 = Static325.aFloat267;
							local1663 = local1584 / 2.0F;
							if ((local1565 & 0x1) == 0) {
								if (local1042 - local1495 > local1663) {
									local1042 -= local1584;
									local1509 = 1;
								} else if (local1495 - local1042 > local1663) {
									local1042 += local1584;
									local1509 = 2;
								}
								if (local1499 - local1495 > local1663) {
									local1507 = 1;
									local1499 -= local1584;
								} else if (local1663 < local1495 - local1499) {
									local1499 += local1584;
									local1507 = 2;
								}
							} else {
								if (local1663 < local1013 - local1497) {
									local1013 -= local1584;
									local1509 = 1;
								} else if (local1663 < local1497 - local1013) {
									local1013 += local1584;
									local1509 = 2;
								}
								if (local1663 < local1011 - local1497) {
									local1507 = 1;
									local1011 -= local1584;
								} else if (local1663 < local1497 - local1011) {
									local1507 = 2;
									local1011 += local1584;
								}
							}
						} else if (local1527 == 2) {
							local1584 = (float) arg1.anIntArray147[local1173] / 256.0F;
							local1663 = (float) arg1.anIntArray145[local1173] / 256.0F;
							@Pc(1811) int local1811 = arg1.anIntArray148[local1539] - arg1.anIntArray148[local1534];
							@Pc(1822) int local1822 = arg1.anIntArray155[local1539] - arg1.anIntArray155[local1534];
							@Pc(1833) int local1833 = arg1.anIntArray152[local1539] - arg1.anIntArray152[local1534];
							@Pc(1844) int local1844 = arg1.anIntArray148[local1544] - arg1.anIntArray148[local1534];
							@Pc(1855) int local1855 = arg1.anIntArray155[local1544] - arg1.anIntArray155[local1534];
							@Pc(1866) int local1866 = arg1.anIntArray152[local1544] - arg1.anIntArray152[local1534];
							@Pc(1875) int local1875 = local1822 * local1866 - local1855 * local1833;
							@Pc(1884) int local1884 = local1833 * local1844 - local1866 * local1811;
							@Pc(1893) int local1893 = local1855 * local1811 - local1822 * local1844;
							local1901 = 64.0F / (float) arg1.anIntArray153[local1173];
							local1909 = 64.0F / (float) arg1.anIntArray146[local1173];
							local1917 = 64.0F / (float) arg1.anIntArray150[local1173];
							local1940 = ((float) local1893 * local1560[2] + local1560[1] * (float) local1884 + (float) local1875 * local1560[0]) / local1901;
							local1963 = (local1560[3] * (float) local1875 + local1560[4] * (float) local1884 + local1560[5] * (float) local1893) / local1909;
							local1986 = (local1560[6] * (float) local1875 + local1560[7] * (float) local1884 + (float) local1893 * local1560[8]) / local1917;
							local1511 = Static142.method2406(local1940, local1963, local1986);
							Static466.method6569(local1511, local1556, arg1.anIntArray152[local1534], local1565, local1663, arg1.anIntArray148[local1534], arg1.anIntArray155[local1534], local1584, local1548, local1573, local1552, local1560);
							local1495 = Static85.aFloat51;
							local1497 = Static351.aFloat194;
							Static466.method6569(local1511, local1556, arg1.anIntArray152[local1539], local1565, local1663, arg1.anIntArray148[local1539], arg1.anIntArray155[local1539], local1584, local1548, local1573, local1552, local1560);
							local1011 = Static351.aFloat194;
							local1499 = Static85.aFloat51;
							Static466.method6569(local1511, local1556, arg1.anIntArray152[local1544], local1565, local1663, arg1.anIntArray148[local1544], arg1.anIntArray155[local1544], local1584, local1548, local1573, local1552, local1560);
							local1042 = Static85.aFloat51;
							local1013 = Static351.aFloat194;
						} else if (local1527 == 3) {
							Static174.method2990(local1560, local1548, arg1.anIntArray152[local1534], arg1.anIntArray148[local1534], local1565, local1573, local1556, arg1.anIntArray155[local1534], local1552);
							local1495 = Static592.aFloat134;
							local1497 = Static134.aFloat94;
							Static174.method2990(local1560, local1548, arg1.anIntArray152[local1539], arg1.anIntArray148[local1539], local1565, local1573, local1556, arg1.anIntArray155[local1539], local1552);
							local1499 = Static592.aFloat134;
							local1011 = Static134.aFloat94;
							Static174.method2990(local1560, local1548, arg1.anIntArray152[local1544], arg1.anIntArray148[local1544], local1565, local1573, local1556, arg1.anIntArray155[local1544], local1552);
							local1042 = Static592.aFloat134;
							local1013 = Static134.aFloat94;
							if ((local1565 & 0x1) == 0) {
								if (local1042 - local1495 > 0.5F) {
									local1509 = 1;
									local1042--;
								} else if (local1495 - local1042 > 0.5F) {
									local1042++;
									local1509 = 2;
								}
								if (local1499 - local1495 > 0.5F) {
									local1499--;
									local1507 = 1;
								} else if (local1495 - local1499 > 0.5F) {
									local1499++;
									local1507 = 2;
								}
							} else {
								if (local1013 - local1497 > 0.5F) {
									local1013--;
									local1509 = 1;
								} else if (local1497 - local1013 > 0.5F) {
									local1013++;
									local1509 = 2;
								}
								if (local1011 - local1497 > 0.5F) {
									local1011--;
									local1507 = 1;
								} else if (local1497 - local1011 > 0.5F) {
									local1507 = 2;
									local1011++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray31 == null) {
				local1527 = 0;
			} else {
				local1527 = arg1.aByteArray31[local1448];
			}
			if (local1527 == 0) {
				@Pc(2812) long local2812 = ((long) (local1455 << 8) + (long) (local1511 << 24) + (long) local750 << 32) + (long) (local1173 << 2);
				local1544 = arg1.aShortArray35[local1448];
				local2286 = arg1.aShortArray31[local1448];
				local2291 = arg1.aShortArray27[local1448];
				@Pc(2831) Class189 local2831 = local438[local1544];
				this.aShortArray128[local1442] = this.method7572(local2831.anInt5019, local2831.anInt5020, local2831.anInt5017, local1495, local2812, local1497, local2831.anInt5018, arg1, local1544);
				@Pc(2855) Class189 local2855 = local438[local2286];
				this.aShortArray135[local1442] = this.method7572(local2855.anInt5019, local2855.anInt5020, local2855.anInt5017, local1499, local2812 + (long) local1507, local1011, local2855.anInt5018, arg1, local2286);
				@Pc(2882) Class189 local2882 = local438[local2291];
				this.lb[local1442] = this.method7572(local2882.anInt5019, local2882.anInt5020, local2882.anInt5017, local1042, (long) local1509 + local2812, local1013, local2882.anInt5018, arg1, local2291);
			} else if (local1527 == 1) {
				@Pc(2672) Class317 local2672 = local1133[local1448];
				@Pc(2717) long local2717 = (long) ((local2672.anInt8466 <= 0 ? 2048 : 1024) + (local1173 << 2) + (local2672.anInt8467 + 256 << 12) + (local2672.anInt8465 + 256 << 22)) + ((long) local750 + (long) (local1455 << 8) + (long) (local1511 << 24) << 32);
				this.aShortArray128[local1442] = this.method7572(local2672.anInt8467, 0, local2672.anInt8465, local1495, local2717, local1497, local2672.anInt8466, arg1, arg1.aShortArray35[local1448]);
				this.aShortArray135[local1442] = this.method7572(local2672.anInt8467, 0, local2672.anInt8465, local1499, (long) local1507 + local2717, local1011, local2672.anInt8466, arg1, arg1.aShortArray31[local1448]);
				this.lb[local1442] = this.method7572(local2672.anInt8467, 0, local2672.anInt8465, local1042, local2717 + (long) local1509, local1013, local2672.anInt8466, arg1, arg1.aShortArray27[local1448]);
			}
			if (arg1.aShortArray33 == null) {
				this.aShortArray133[local1442] = -1;
			} else {
				this.aShortArray133[local1442] = arg1.aShortArray33[local1448];
			}
			if (arg1.aByteArray27 != null) {
				this.aByteArray94[local1442] = arg1.aByteArray27[local1448];
			}
			if (arg1.aShortArray34 != null) {
				this.aShortArray129[local1442] = arg1.aShortArray34[local1448];
			}
			this.aShortArray131[local1442] = arg1.aShortArray36[local1448];
		}
		local1448 = 0;
		local1152 = -10000;
		for (local1163 = 0; local1163 < this.anInt9103; local1163++) {
			@Pc(2971) short local2971 = this.aShortArray133[local1163];
			if (local2971 != local1152) {
				local1448++;
				local1152 = local2971;
			}
		}
		this.anIntArray656 = new int[local1448 + 1];
		local1152 = -10000;
		local1448 = 0;
		for (local1173 = 0; local1173 < this.anInt9103; local1173++) {
			@Pc(3005) short local3005 = this.aShortArray133[local1173];
			if (local3005 != local1152) {
				this.anIntArray656[local1448++] = local1173;
				local1152 = local3005;
			}
		}
		this.anIntArray656[local1448] = this.anInt9103;
		Static395.aLongArray11 = null;
		this.aShortArray136 = Static324.method5006(this.anInt9100, this.aShortArray136);
		this.aShortArray134 = Static324.method5006(this.anInt9100, this.aShortArray134);
		this.aShortArray132 = Static324.method5006(this.anInt9100, this.aShortArray132);
		this.aByteArray95 = Static75.method1183(this.aByteArray95, this.anInt9100);
		this.aFloatArray68 = Static169.method2929(this.aFloatArray68, this.anInt9100);
		this.aFloatArray69 = Static169.method2929(this.aFloatArray69, this.anInt9100);
		if (arg1.anIntArray151 != null && Static299.method4535(arg2, this.anInt9042)) {
			this.anIntArrayArray63 = arg1.method1757(false);
		}
		if (arg1.aClass214Array1 != null && Static145.method2410(this.anInt9042, arg2)) {
			this.anIntArrayArray65 = arg1.method1768();
		}
		if (arg1.anIntArray149 != null && Static450.method6451(this.anInt9042, arg2)) {
			local750 = 0;
			@Pc(3120) int[] local3120 = new int[256];
			for (local800 = 0; local800 < this.anInt9091; local800++) {
				local814 = arg1.anIntArray149[local116[local800]];
				if (local814 >= 0) {
					if (local814 > local750) {
						local750 = local814;
					}
					@Pc(3149) int local3149 = local3120[local814]++;
				}
			}
			this.anIntArrayArray64 = new int[local750 + 1][];
			for (local814 = 0; local814 <= local750; local814++) {
				this.anIntArrayArray64[local814] = new int[local3120[local814]];
				local3120[local814] = 0;
			}
			for (local816 = 0; local816 < this.anInt9091; local816++) {
				local1232 = arg1.anIntArray149[local116[local816]];
				if (local1232 >= 0) {
					this.anIntArrayArray64[local1232][local3120[local1232]++] = local816;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7549() {
		if (this.aShortArray133 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray133.length; local12++) {
			if (this.aShortArray133[local12] != -1 && !this.aClass100_Sub3_40.anInterface5_10.method914(this.aShortArray133[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7552(@OriginalArg(0) Class68 arg0) {
		@Pc(8) Class68_Sub1 local8 = (Class68_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass139Array5 != null) {
			for (local13 = 0; local13 < this.aClass139Array5.length; local13++) {
				@Pc(20) Class139 local20 = this.aClass139Array5[local13];
				@Pc(22) Class139 local22 = local20;
				if (local20.aClass139_2 != null) {
					local22 = local20.aClass139_2;
				}
				local22.anInt3916 = (int) (local8.aFloat40 * (float) this.anIntArray657[local20.anInt3911] + local8.aFloat41 * (float) this.anIntArray659[local20.anInt3911] + (float) this.anIntArray658[local20.anInt3911] * local8.aFloat42 + local8.aFloat43);
				local22.anInt3908 = (int) ((float) this.anIntArray658[local20.anInt3911] * local8.aFloat36 + (float) this.anIntArray659[local20.anInt3911] * local8.aFloat37 + local8.aFloat34 * (float) this.anIntArray657[local20.anInt3911] + local8.aFloat39);
				local22.anInt3917 = (int) (local8.aFloat35 + (float) this.anIntArray657[local20.anInt3911] * local8.aFloat44 + local8.aFloat38 * (float) this.anIntArray659[local20.anInt3911] + (float) this.anIntArray658[local20.anInt3911] * local8.aFloat33);
				local22.anInt3909 = (int) (local8.aFloat43 + local8.aFloat40 * (float) this.anIntArray657[local20.anInt3913] + local8.aFloat41 * (float) this.anIntArray659[local20.anInt3913] + (float) this.anIntArray658[local20.anInt3913] * local8.aFloat42);
				local22.anInt3910 = (int) (local8.aFloat39 + (float) this.anIntArray657[local20.anInt3913] * local8.aFloat34 + local8.aFloat36 * (float) this.anIntArray658[local20.anInt3913] + (float) this.anIntArray659[local20.anInt3913] * local8.aFloat37);
				local22.anInt3918 = (int) (local8.aFloat35 + local8.aFloat38 * (float) this.anIntArray659[local20.anInt3913] + local8.aFloat33 * (float) this.anIntArray658[local20.anInt3913] + local8.aFloat44 * (float) this.anIntArray657[local20.anInt3913]);
				local22.anInt3923 = (int) (local8.aFloat43 + local8.aFloat42 * (float) this.anIntArray658[local20.anInt3912] + local8.aFloat41 * (float) this.anIntArray659[local20.anInt3912] + (float) this.anIntArray657[local20.anInt3912] * local8.aFloat40);
				local22.anInt3920 = (int) ((float) this.anIntArray658[local20.anInt3912] * local8.aFloat36 + local8.aFloat37 * (float) this.anIntArray659[local20.anInt3912] + (float) this.anIntArray657[local20.anInt3912] * local8.aFloat34 + local8.aFloat39);
				local22.anInt3919 = (int) (local8.aFloat44 * (float) this.anIntArray657[local20.anInt3912] + (float) this.anIntArray658[local20.anInt3912] * local8.aFloat33 + local8.aFloat38 * (float) this.anIntArray659[local20.anInt3912] + local8.aFloat35);
			}
		}
		if (this.aClass270Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass270Array5.length; local13++) {
			@Pc(361) Class270 local361 = this.aClass270Array5[local13];
			@Pc(363) Class270 local363 = local361;
			if (local361.aClass270_2 != null) {
				local363 = local361.aClass270_2;
			}
			if (local361.aClass68_6 == null) {
				local361.aClass68_6 = local8.method6462();
			} else {
				local361.aClass68_6.M(local8);
			}
			local363.anInt7321 = (int) (local8.aFloat43 + (float) this.anIntArray659[local361.anInt7311] * local8.aFloat41 + (float) this.anIntArray658[local361.anInt7311] * local8.aFloat42 + (float) this.anIntArray657[local361.anInt7311] * local8.aFloat40);
			local363.anInt7314 = (int) ((float) this.anIntArray659[local361.anInt7311] * local8.aFloat37 + (float) this.anIntArray658[local361.anInt7311] * local8.aFloat36 + (float) this.anIntArray657[local361.anInt7311] * local8.aFloat34 + local8.aFloat39);
			local363.anInt7320 = (int) (local8.aFloat44 * (float) this.anIntArray657[local361.anInt7311] + local8.aFloat33 * (float) this.anIntArray658[local361.anInt7311] + (float) this.anIntArray659[local361.anInt7311] * local8.aFloat38 + local8.aFloat35);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt9071 = arg0;
		if (this.aClass163_1 != null && (this.anInt9071 & 0x10000) == 0) {
			this.aShortArray132 = this.aClass163_1.aShortArray70;
			this.aShortArray134 = this.aClass163_1.aShortArray71;
			this.aByteArray95 = this.aClass163_1.aByteArray50;
			this.aShortArray136 = this.aClass163_1.aShortArray72;
			this.aClass163_1 = null;
		}
		this.aBoolean692 = true;
		this.method7571();
	}

	@OriginalMember(owner = "client!vaa", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9102; local15++) {
			@Pc(33) int local33 = this.anIntArray659[local15] * local13 + this.anIntArray657[local15] * local9 >> 14;
			this.anIntArray657[local15] = local13 * this.anIntArray657[local15] - local9 * this.anIntArray659[local15] >> 14;
			this.anIntArray659[local15] = local33;
		}
		this.aBoolean693 = false;
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7553(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class66_Sub3 local8 = (Class66_Sub3) arg0;
		if (this.anInt9091 == 0 || local8.anInt9091 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt9102;
		@Pc(24) int[] local24 = local8.anIntArray659;
		@Pc(27) int[] local27 = local8.anIntArray658;
		@Pc(30) int[] local30 = local8.anIntArray657;
		@Pc(33) short[] local33 = local8.aShortArray136;
		@Pc(36) short[] local36 = local8.aShortArray134;
		@Pc(39) short[] local39 = local8.aShortArray132;
		@Pc(42) byte[] local42 = local8.aByteArray95;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(51) byte[] local51;
		if (this.aClass163_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass163_1.aShortArray70;
			local51 = this.aClass163_1.aByteArray50;
			local53 = this.aClass163_1.aShortArray72;
			local47 = this.aClass163_1.aShortArray71;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(80) short[] local80;
		@Pc(76) byte[] local76;
		if (local8.aClass163_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass163_1.aShortArray71;
			local80 = local8.aClass163_1.aShortArray70;
			local76 = local8.aClass163_1.aByteArray50;
			local78 = local8.aClass163_1.aShortArray72;
		}
		@Pc(103) int[] local103 = local8.anIntArray660;
		@Pc(106) short[] local106 = local8.aShortArray127;
		if (!local8.aBoolean693) {
			local8.method7575();
		}
		@Pc(115) short local115 = local8.aShort101;
		@Pc(118) short local118 = local8.aShort102;
		@Pc(121) short local121 = local8.aShort105;
		@Pc(124) short local124 = local8.aShort107;
		@Pc(127) short local127 = local8.aShort100;
		@Pc(130) short local130 = local8.aShort106;
		for (@Pc(132) int local132 = 0; local132 < this.anInt9102; local132++) {
			@Pc(142) int local142 = this.anIntArray658[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray659[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(178) int local178 = this.anIntArray657[local132] - arg3;
					if (local127 <= local178 && local178 <= local130) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray660[local132];
						@Pc(204) int local204 = this.anIntArray660[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray127[local206] - 1;
							if (local192 == -1 || this.aByteArray95[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local21; local235++) {
								if (local24[local235] == local162 && local178 == local30[local235] && local142 == local27[local235]) {
									local197 = local103[local235];
									@Pc(266) int local266 = -1;
									local204 = local103[local235 + 1];
									for (@Pc(274) int local274 = local197; local274 < local204; local274++) {
										local266 = local106[local274] - 1;
										if (local266 == -1 || local42[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local53 == null) {
											this.aClass163_1 = new Class163();
											local53 = this.aClass163_1.aShortArray72 = Static325.method7942(this.aShortArray136);
											local47 = this.aClass163_1.aShortArray71 = Static325.method7942(this.aShortArray134);
											local49 = this.aClass163_1.aShortArray70 = Static325.method7942(this.aShortArray132);
											local51 = this.aClass163_1.aByteArray50 = Static54.method924(this.aByteArray95);
										}
										if (local78 == null) {
											@Pc(354) Class163 local354 = local8.aClass163_1 = new Class163();
											local78 = local354.aShortArray72 = Static325.method7942(local33);
											local82 = local354.aShortArray71 = Static325.method7942(local36);
											local80 = local354.aShortArray70 = Static325.method7942(local39);
											local76 = local354.aByteArray50 = Static54.method924(local42);
										}
										@Pc(387) short local387 = this.aShortArray136[local192];
										@Pc(392) short local392 = this.aShortArray134[local192];
										@Pc(397) short local397 = this.aShortArray132[local192];
										local197 = local103[local235];
										local204 = local103[local235 + 1];
										@Pc(412) byte local412 = this.aByteArray95[local192];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local197; local414 < local204; local414++) {
											local422 = local106[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local76[local422] != 0) {
												local78[local422] += local387;
												local82[local422] += local392;
												local80[local422] += local397;
												local76[local422] += local412;
											}
										}
										local387 = local33[local266];
										local204 = this.anIntArray660[local132 + 1];
										local197 = this.anIntArray660[local132];
										local392 = local36[local266];
										local412 = local42[local266];
										local397 = local39[local266];
										for (local422 = local197; local422 < local204; local422++) {
											@Pc(508) int local508 = this.aShortArray127[local422] - 1;
											if (local508 == -1) {
												break;
											}
											if (local51[local508] != 0) {
												local53[local508] += local387;
												local47[local508] += local392;
												local49[local508] += local397;
												local51[local508] += local412;
											}
										}
										if (this.aClass131_16 == null && this.aClass131_14 != null) {
											this.aClass131_14.anInterface18_3 = null;
										}
										if (this.aClass131_16 != null) {
											this.aClass131_16.anInterface18_3 = null;
										}
										if (local8.aClass131_16 == null && local8.aClass131_14 != null) {
											local8.aClass131_14.anInterface18_3 = null;
										}
										if (local8.aClass131_16 != null) {
											local8.aClass131_16.anInterface18_3 = null;
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

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZILclient!q;IIZ)Z")
	private boolean method7565(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class68_Sub1 local8 = (Class68_Sub1) arg2;
		@Pc(12) Class68_Sub1 local12 = this.aClass100_Sub3_40.aClass68_Sub1_3;
		@Pc(39) float local39 = local12.aFloat43 + local8.aFloat35 * local12.aFloat40 + local12.aFloat42 * local8.aFloat39 + local12.aFloat41 * local8.aFloat43;
		@Pc(60) float local60 = local12.aFloat37 * local8.aFloat43 + local8.aFloat39 * local12.aFloat36 + local8.aFloat35 * local12.aFloat34 + local12.aFloat39;
		@Pc(81) float local81 = local12.aFloat33 * local8.aFloat39 + local12.aFloat38 * local8.aFloat43 + local8.aFloat35 * local12.aFloat44 + local12.aFloat35;
		Static412.aFloat12 = local12.aFloat37 * local8.aFloat42 + local12.aFloat36 * local8.aFloat36 + local8.aFloat33 * local12.aFloat34;
		Static331.aFloat179 = local12.aFloat40 * local8.aFloat33 + local8.aFloat42 * local12.aFloat41 + local8.aFloat36 * local12.aFloat42;
		Static163.aFloat118 = local12.aFloat38 * local8.aFloat41 + local12.aFloat33 * local8.aFloat37 + local12.aFloat44 * local8.aFloat38;
		Static340.aFloat192 = local12.aFloat44 * local8.aFloat44 + local8.aFloat34 * local12.aFloat33 + local8.aFloat40 * local12.aFloat38;
		Static55.aFloat121 = local12.aFloat37 * local8.aFloat41 + local8.aFloat37 * local12.aFloat36 + local12.aFloat34 * local8.aFloat38;
		Static317.aFloat168 = local8.aFloat44 * local12.aFloat40 + local12.aFloat42 * local8.aFloat34 + local12.aFloat41 * local8.aFloat40;
		Static35.aFloat19 = local12.aFloat40 * local8.aFloat38 + local8.aFloat37 * local12.aFloat42 + local12.aFloat41 * local8.aFloat41;
		Static343.aFloat146 = local8.aFloat40 * local12.aFloat37 + local12.aFloat36 * local8.aFloat34 + local12.aFloat34 * local8.aFloat44;
		Static244.aFloat136 = local8.aFloat42 * local12.aFloat38 + local12.aFloat33 * local8.aFloat36 + local12.aFloat44 * local8.aFloat33;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass100_Sub3_40.anInt7694;
		@Pc(261) int local261 = this.aClass100_Sub3_40.anInt7695;
		if (!this.aBoolean693) {
			this.method7575();
		}
		Static457.anIntArray522[0] = this.aShort105;
		Static474.anIntArray577[0] = this.aShort101;
		Static247.anIntArray311[0] = this.aShort100;
		Static457.anIntArray522[1] = this.aShort107;
		Static474.anIntArray577[1] = this.aShort101;
		Static247.anIntArray311[1] = this.aShort100;
		Static457.anIntArray522[2] = this.aShort105;
		Static474.anIntArray577[2] = this.aShort102;
		Static457.anIntArray522[3] = this.aShort107;
		Static247.anIntArray311[2] = this.aShort100;
		Static474.anIntArray577[3] = this.aShort102;
		Static247.anIntArray311[3] = this.aShort100;
		Static457.anIntArray522[4] = this.aShort105;
		Static474.anIntArray577[4] = this.aShort101;
		Static457.anIntArray522[5] = this.aShort107;
		Static247.anIntArray311[4] = this.aShort106;
		Static474.anIntArray577[5] = this.aShort101;
		Static247.anIntArray311[5] = this.aShort106;
		Static457.anIntArray522[6] = this.aShort105;
		Static474.anIntArray577[6] = this.aShort102;
		Static247.anIntArray311[6] = this.aShort106;
		Static457.anIntArray522[7] = this.aShort107;
		Static474.anIntArray577[7] = this.aShort102;
		Static247.anIntArray311[7] = this.aShort106;
		@Pc(420) float local420;
		@Pc(448) float local448;
		@Pc(434) float local434;
		@Pc(406) float local406;
		@Pc(401) float local401;
		@Pc(396) float local396;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static247.anIntArray311[local389];
			local401 = Static474.anIntArray577[local389];
			local406 = Static457.anIntArray522[local389];
			local420 = local39 + local396 * Static317.aFloat168 + Static35.aFloat19 * local406 + Static331.aFloat179 * local401;
			local434 = Static244.aFloat136 * local401 + local406 * Static163.aFloat118 + local396 * Static340.aFloat192 + local81;
			local448 = local60 + local396 * Static343.aFloat146 + Static412.aFloat12 * local401 + Static55.aFloat121 * local406;
			if ((float) this.aClass100_Sub3_40.anInt7688 <= local434) {
				if (arg1 > 0) {
					local434 = arg1;
				}
				@Pc(475) float local475 = local420 * (float) local257 / local434 + (float) this.aClass100_Sub3_40.anInt7697;
				@Pc(487) float local487 = local448 * (float) local261 / local434 + (float) this.aClass100_Sub3_40.anInt7693;
				if (local249 < local475) {
					local249 = local475;
				}
				if (local247 > local475) {
					local247 = local475;
				}
				if (local251 > local487) {
					local251 = local487;
				}
				if (local487 > local253) {
					local253 = local487;
				}
				local245 = true;
			}
		}
		if (local245 && local247 < (float) arg4 && (float) arg4 < local249 && local251 < (float) arg3 && local253 > (float) arg3) {
			if (arg0) {
				return true;
			}
			if (this.anInt9100 > this.aClass100_Sub3_40.anIntArray513.length) {
				this.aClass100_Sub3_40.anIntArray513 = new int[this.anInt9100];
				this.aClass100_Sub3_40.anIntArray511 = new int[this.anInt9100];
			}
			@Pc(570) int[] local570 = this.aClass100_Sub3_40.anIntArray513;
			@Pc(574) int[] local574 = this.aClass100_Sub3_40.anIntArray511;
			@Pc(663) int local663;
			for (@Pc(576) int local576 = 0; local576 < this.anInt9102; local576++) {
				local401 = this.anIntArray658[local576];
				local396 = this.anIntArray657[local576];
				local406 = this.anIntArray659[local576];
				local448 = local60 + local396 * Static343.aFloat146 + Static55.aFloat121 * local406 + local401 * Static412.aFloat12;
				local434 = local396 * Static340.aFloat192 + Static244.aFloat136 * local401 + local406 * Static163.aFloat118 + local81;
				local420 = local39 + local396 * Static317.aFloat168 + Static35.aFloat19 * local406 + Static331.aFloat179 * local401;
				@Pc(676) int local676;
				@Pc(681) int local681;
				@Pc(688) int local688;
				if (local434 >= (float) this.aClass100_Sub3_40.anInt7688) {
					if (arg1 > 0) {
						local434 = arg1;
					}
					local663 = (int) ((float) this.aClass100_Sub3_40.anInt7697 + local420 * (float) local257 / local434);
					local676 = (int) ((float) this.aClass100_Sub3_40.anInt7693 + (float) local261 * local448 / local434);
					local681 = this.anIntArray660[local576];
					local688 = this.anIntArray660[local576 + 1];
					for (@Pc(690) int local690 = local681; local690 < local688; local690++) {
						@Pc(699) int local699 = this.aShortArray127[local690] - 1;
						if (local699 == -1) {
							break;
						}
						local570[local699] = local663;
						local574[local699] = local676;
					}
				} else {
					local663 = this.anIntArray660[local576];
					local676 = this.anIntArray660[local576 + 1];
					for (local681 = local663; local681 < local676; local681++) {
						local688 = this.aShortArray127[local681] - 1;
						if (local688 == -1) {
							break;
						}
						local570[this.aShortArray127[local681] - 1] = -999999;
					}
				}
			}
			for (local663 = 0; local663 < this.anInt9091; local663++) {
				if (local570[this.aShortArray128[local663]] != -999999 && local570[this.aShortArray135[local663]] != -999999 && local570[this.lb[local663]] != -999999 && this.method7577(arg3, arg4, local574[this.aShortArray135[local663]], local574[this.aShortArray128[local663]], local570[this.aShortArray135[local663]], local570[this.lb[local663]], local574[this.lb[local663]], local570[this.aShortArray128[local663]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIISB)I")
	private int method7566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3) {
		@Pc(17) int local17 = Static250.anIntArray314[Static168.method2920(arg1, arg0)];
		if (arg2 != -1) {
			@Pc(30) Class343 local30 = this.aClass100_Sub3_40.anInterface5_10.method917(arg2 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte119 & 0xFF;
			@Pc(54) int local54;
			@Pc(74) int local74;
			if (local35 != 0) {
				if (arg0 < 0) {
					local54 = 0;
				} else if (arg0 <= 127) {
					local54 = arg0 * 131586;
				} else {
					local54 = 16777215;
				}
				if (local35 == 256) {
					local17 = local54;
				} else {
					local74 = 256 - local35;
					local17 = ((local54 & 0xFF00) * local35 + (local17 & 0xFF00) * local74 & 0xFF0000) + (local35 * (local54 & 0xFF00FF) + (local17 & 0xFF00FF) * local74 & 0xFF00FF00) >> 8;
				}
			}
			local54 = local30.aByte115 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(124) int local124 = (local17 >> 16 & 0xFF) * local54;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local74 = (local17 >> 8 & 0xFF) * local54;
				if (local74 > 65535) {
					local74 = 65535;
				}
				@Pc(152) int local152 = (local17 & 0xFF) * local54;
				if (local152 > 65535) {
					local152 = 65535;
				}
				local17 = (local152 >> 8) + (local124 << 8 & 0xFF00C4) + (local74 & 0xFF00);
			}
		}
		return (local17 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class139[] method7550() {
		return this.aClass139Array5;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
	private void method7567() {
		if (this.aClass161Array1 == null) {
			return;
		}
		@Pc(12) Class68_Sub1 local12 = this.aClass100_Sub3_40.aClass68_Sub1_2;
		this.aClass100_Sub3_40.method6306();
		this.aClass100_Sub3_40.ZA(false);
		this.aClass100_Sub3_40.method6327(false);
		this.aClass100_Sub3_40.method6302(this.aClass100_Sub3_40.aClass131_9, null, this.aClass100_Sub3_40.aClass131_8, null);
		for (@Pc(39) int local39 = 0; local39 < this.anInt9053; local39++) {
			@Pc(46) Class161 local46 = this.aClass161Array1[local39];
			@Pc(51) Class281 local51 = this.aClass281Array1[local39];
			if (!local46.aBoolean342 || !this.aClass100_Sub3_40.method6248()) {
				@Pc(79) float local79 = (float) (this.anIntArray659[local46.anInt4202] + this.anIntArray659[local46.anInt4197] + this.anIntArray659[local46.anInt4200]) * 0.3333333F;
				@Pc(100) float local100 = (float) (this.anIntArray658[local46.anInt4202] + this.anIntArray658[local46.anInt4197] + this.anIntArray658[local46.anInt4200]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray657[local46.anInt4197] + this.anIntArray657[local46.anInt4200] + this.anIntArray657[local46.anInt4202]) * 0.3333333F;
				@Pc(136) float local136 = Static138.aFloat95 + Static317.aFloat168 * local122 + local79 * Static35.aFloat19 + local100 * Static331.aFloat179;
				@Pc(150) float local150 = Static412.aFloat14 + local79 * Static55.aFloat121 + local100 * Static412.aFloat12 + Static343.aFloat146 * local122;
				@Pc(164) float local164 = Static163.aFloat118 * local79 + local100 * Static244.aFloat136 + local122 * Static340.aFloat192 + Static445.aFloat232;
				local12.method1270(local51.anInt7884 * local46.aShort47 >> 7, local136 + (float) local51.anInt7878, local51.anInt7883, (float) local51.anInt7875 - local150, (float) local46.anInt4198 + -local164, local46.aShort46 * local51.anInt7880 >> 7);
				this.aClass100_Sub3_40.method6314(local12);
				@Pc(208) int local208 = local51.anInt7879;
				OpenGL.glColor4ub((byte) (local208 >> 16), (byte) (local208 >> 8), (byte) local208, (byte) (local208 >> 24));
				this.aClass100_Sub3_40.method6278(local46.aShort45);
				this.aClass100_Sub3_40.method6334(local46.aByte54);
				this.aClass100_Sub3_40.method6321(4);
			}
		}
		this.aClass100_Sub3_40.ZA(true);
		this.aClass100_Sub3_40.method6291();
	}

	@OriginalMember(owner = "client!vaa", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass100_Sub3_40.anInterface5_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9091; local11++) {
			if (this.aShortArray133[local11] == arg0) {
				this.aShortArray133[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class343 local47 = local9.method917(arg0 & 0xFFFF);
			local37 = local47.aByte115;
			local35 = local47.aByte119;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class343 local67 = local9.method917(arg1 & 0xFFFF);
			local57 = local67.aByte115;
			local55 = local67.aByte119;
		}
		if (!(local55 != local35 | local37 != local57)) {
			return;
		}
		if (this.aClass161Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt9053; local92++) {
				@Pc(99) Class161 local99 = this.aClass161Array1[local92];
				@Pc(104) Class281 local104 = this.aClass281Array1[local92];
				local104.anInt7879 = Static250.anIntArray314[this.aShortArray131[local99.anInt4195] & 0xFFFF] & 0xFFFFFF | local104.anInt7879 & 0xFF000000;
			}
		}
		if (this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
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
			local24 = 0;
			Static541.anInt8831 = 0;
			Static211.anInt8103 = 0;
			Static538.anInt8792 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray63.length) {
					local48 = this.anIntArrayArray63[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static538.anInt8792 += this.anIntArray659[local56];
						Static541.anInt8831 += this.anIntArray658[local56];
						Static211.anInt8103 += this.anIntArray657[local56];
						local24++;
					}
				}
			}
			if (local24 <= 0) {
				Static538.anInt8792 = local18;
				Static541.anInt8831 = local14;
				Static211.anInt8103 = local22;
			} else {
				Static541.anInt8831 = Static541.anInt8831 / local24 + local14;
				Static211.anInt8103 = Static211.anInt8103 / local24 + local22;
				Static538.anInt8792 = local18 + Static538.anInt8792 / local24;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray63.length) {
					local156 = this.anIntArrayArray63[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray659[local50] += local18;
						this.anIntArray658[local50] += local14;
						this.anIntArray657[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(269) int local269;
		@Pc(288) int local288;
		@Pc(735) int local735;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray63.length) {
					local156 = this.anIntArrayArray63[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray659[local50] -= Static538.anInt8792;
							this.anIntArray658[local50] -= Static541.anInt8831;
							this.anIntArray657[local50] -= Static211.anInt8103;
							if (arg4 != 0) {
								local56 = Class363.anIntArray697[arg4];
								local269 = Class363.anIntArray698[arg4];
								local288 = local269 * this.anIntArray659[local50] + local56 * this.anIntArray658[local50] + 16383 >> 14;
								this.anIntArray658[local50] = local269 * this.anIntArray658[local50] + 16383 - local56 * this.anIntArray659[local50] >> 14;
								this.anIntArray659[local50] = local288;
							}
							if (arg2 != 0) {
								local56 = Class363.anIntArray697[arg2];
								local269 = Class363.anIntArray698[arg2];
								local288 = this.anIntArray658[local50] * local269 + 16383 - this.anIntArray657[local50] * local56 >> 14;
								this.anIntArray657[local50] = this.anIntArray657[local50] * local269 + this.anIntArray658[local50] * local56 + 16383 >> 14;
								this.anIntArray658[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class363.anIntArray697[arg3];
								local269 = Class363.anIntArray698[arg3];
								local288 = this.anIntArray657[local50] * local56 + local269 * this.anIntArray659[local50] + 16383 >> 14;
								this.anIntArray657[local50] = local269 * this.anIntArray657[local50] + 16383 - local56 * this.anIntArray659[local50] >> 14;
								this.anIntArray659[local50] = local288;
							}
							this.anIntArray659[local50] += Static538.anInt8792;
							this.anIntArray658[local50] += Static541.anInt8831;
							this.anIntArray657[local50] += Static211.anInt8103;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray659[local50] -= Static538.anInt8792;
							this.anIntArray658[local50] -= Static541.anInt8831;
							this.anIntArray657[local50] -= Static211.anInt8103;
							if (arg2 != 0) {
								local56 = Class363.anIntArray697[arg2];
								local269 = Class363.anIntArray698[arg2];
								local288 = local269 * this.anIntArray658[local50] + 16383 - local56 * this.anIntArray657[local50] >> 14;
								this.anIntArray657[local50] = this.anIntArray658[local50] * local56 + this.anIntArray657[local50] * local269 + 16383 >> 14;
								this.anIntArray658[local50] = local288;
							}
							if (arg4 != 0) {
								local56 = Class363.anIntArray697[arg4];
								local269 = Class363.anIntArray698[arg4];
								local288 = this.anIntArray659[local50] * local269 + local56 * this.anIntArray658[local50] + 16383 >> 14;
								this.anIntArray658[local50] = local269 * this.anIntArray658[local50] + 16383 - local56 * this.anIntArray659[local50] >> 14;
								this.anIntArray659[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class363.anIntArray697[arg3];
								local269 = Class363.anIntArray698[arg3];
								local288 = this.anIntArray659[local50] * local269 + local56 * this.anIntArray657[local50] + 16383 >> 14;
								this.anIntArray657[local50] = local269 * this.anIntArray657[local50] + 16383 - this.anIntArray659[local50] * local56 >> 14;
								this.anIntArray659[local50] = local288;
							}
							this.anIntArray659[local50] += Static538.anInt8792;
							this.anIntArray658[local50] += Static541.anInt8831;
							this.anIntArray657[local50] += Static211.anInt8103;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray63.length > local38) {
						local48 = this.anIntArrayArray63[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local269 = this.anIntArray660[local56];
							local288 = this.anIntArray660[local56 + 1];
							for (local735 = local269; local735 < local288; local735++) {
								@Pc(744) int local744 = this.aShortArray127[local735] - 1;
								if (local744 == -1) {
									break;
								}
								@Pc(757) int local757;
								@Pc(761) int local761;
								@Pc(780) int local780;
								if (arg4 != 0) {
									local757 = Class363.anIntArray697[arg4];
									local761 = Class363.anIntArray698[arg4];
									local780 = local757 * this.aShortArray134[local744] + local761 * this.aShortArray136[local744] + 16383 >> 14;
									this.aShortArray134[local744] = (short) (this.aShortArray134[local744] * local761 + 16383 - this.aShortArray136[local744] * local757 >> 14);
									this.aShortArray136[local744] = (short) local780;
								}
								if (arg2 != 0) {
									local757 = Class363.anIntArray697[arg2];
									local761 = Class363.anIntArray698[arg2];
									local780 = this.aShortArray134[local744] * local761 + 16383 - local757 * this.aShortArray132[local744] >> 14;
									this.aShortArray132[local744] = (short) (this.aShortArray132[local744] * local761 + local757 * this.aShortArray134[local744] + 16383 >> 14);
									this.aShortArray134[local744] = (short) local780;
								}
								if (arg3 != 0) {
									local757 = Class363.anIntArray697[arg3];
									local761 = Class363.anIntArray698[arg3];
									local780 = local757 * this.aShortArray132[local744] + local761 * this.aShortArray136[local744] + 16383 >> 14;
									this.aShortArray132[local744] = (short) (this.aShortArray132[local744] * local761 + 16383 - this.aShortArray136[local744] * local757 >> 14);
									this.aShortArray136[local744] = (short) local780;
								}
							}
						}
					}
				}
				if (this.aClass131_16 == null && this.aClass131_14 != null) {
					this.aClass131_14.anInterface18_3 = null;
				}
				if (this.aClass131_16 != null) {
					this.aClass131_16.anInterface18_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray63.length) {
					local156 = this.anIntArrayArray63[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray659[local50] -= Static538.anInt8792;
						this.anIntArray658[local50] -= Static541.anInt8831;
						this.anIntArray657[local50] -= Static211.anInt8103;
						this.anIntArray659[local50] = this.anIntArray659[local50] * arg2 >> 7;
						this.anIntArray658[local50] = arg3 * this.anIntArray658[local50] >> 7;
						this.anIntArray657[local50] = arg4 * this.anIntArray657[local50] >> 7;
						this.anIntArray659[local50] += Static538.anInt8792;
						this.anIntArray658[local50] += Static541.anInt8831;
						this.anIntArray657[local50] += Static211.anInt8103;
					}
				}
			}
		} else {
			@Pc(1202) Class161 local1202;
			@Pc(1207) Class281 local1207;
			if (arg0 == 5) {
				if (this.anIntArrayArray64 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray64.length) {
							local156 = this.anIntArrayArray64[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local50 = local156[local158];
								local56 = arg2 * 8 + (this.aByteArray94[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray94[local50] = (byte) local56;
							}
							if (local156.length > 0 && this.aClass131_14 != null) {
								this.aClass131_14.anInterface18_3 = null;
							}
						}
					}
					if (this.aClass161Array1 != null) {
						for (local32 = 0; local32 < this.anInt9053; local32++) {
							local1202 = this.aClass161Array1[local32];
							local1207 = this.aClass281Array1[local32];
							local1207.anInt7879 = local1207.anInt7879 & 0xFFFFFF | 255 - (this.aByteArray94[local1202.anInt4195] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1455) Class281 local1455;
				if (arg0 == 8) {
					if (this.anIntArrayArray65 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray65.length) {
								local156 = this.anIntArrayArray65[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1455 = this.aClass281Array1[local156[local158]];
									local1455.anInt7878 += arg2;
									local1455.anInt7875 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray65 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray65.length) {
								local156 = this.anIntArrayArray65[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1455 = this.aClass281Array1[local156[local158]];
									local1455.anInt7880 = local1455.anInt7880 * arg3 >> 7;
									local1455.anInt7884 = arg2 * local1455.anInt7884 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray65 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray65.length > local32) {
							local156 = this.anIntArrayArray65[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1455 = this.aClass281Array1[local156[local158]];
								local1455.anInt7883 = arg2 + local1455.anInt7883 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray64 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray64.length) {
						local156 = this.anIntArrayArray64[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							local56 = this.aShortArray131[local50] & 0xFFFF;
							local269 = local56 >> 10 & 0x3F;
							local288 = local56 >> 7 & 0x7;
							local288 += arg3 / 4;
							@Pc(1300) int local1300 = local269 + arg2 & 0x3F;
							local735 = local56 & 0x7F;
							local735 += arg4;
							if (local288 < 0) {
								local288 = 0;
							} else if (local288 > 7) {
								local288 = 7;
							}
							if (local735 < 0) {
								local735 = 0;
							} else if (local735 > 127) {
								local735 = 127;
							}
							this.aShortArray131[local50] = (short) (local735 | local1300 << 10 | local288 << 7);
						}
						if (local156.length > 0 && this.aClass131_14 != null) {
							this.aClass131_14.anInterface18_3 = null;
						}
					}
				}
				if (this.aClass161Array1 != null) {
					for (local32 = 0; local32 < this.anInt9053; local32++) {
						local1202 = this.aClass161Array1[local32];
						local1207 = this.aClass281Array1[local32];
						local1207.anInt7879 = local1207.anInt7879 & 0xFF000000 | Static250.anIntArray314[this.aShortArray131[local1202.anInt4195] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
	private void method7569() {
		if (this.anInt9103 == 0) {
			return;
		}
		if (this.aByte113 != 0) {
			this.method7570(true);
		}
		this.method7570(false);
		if (this.aClass95_1 != null) {
			if (this.aClass95_1.anInterface3_2 == null) {
				this.method7576((this.aByte113 & 0x10) != 0);
			}
			if (this.aClass95_1.anInterface3_2 != null) {
				this.aClass100_Sub3_40.method6327(this.aClass131_16 != null);
				this.aClass100_Sub3_40.method6302(this.aClass131_13, this.aClass131_14, this.aClass131_15, this.aClass131_16);
				@Pc(76) int local76 = this.anIntArray656.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray656[local78];
					@Pc(92) int local92 = this.anIntArray656[local78 + 1];
					@Pc(99) int local99 = this.aShortArray133[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass100_Sub3_40.method6266(local99, this.aClass131_16 != null);
					this.aClass100_Sub3_40.method6295((local92 - local85) * 3, local85 * 3, this.aClass95_1.anInterface3_2);
				}
			}
		}
		this.method7571();
	}

	@OriginalMember(owner = "client!vaa", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9102; local7++) {
			if (arg0 != 128) {
				this.anIntArray659[local7] = this.anIntArray659[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray658[local7] = arg1 * this.anIntArray658[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray657[local7] = arg2 * this.anIntArray657[local7] >> 7;
			}
		}
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9102; local7++) {
			if (arg0 != 0) {
				this.anIntArray659[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray658[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray657[local7] += arg2;
			}
		}
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray63 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9062; local12++) {
			this.anIntArray659[local12] <<= 0x4;
			this.anIntArray658[local12] <<= 0x4;
			this.anIntArray657[local12] <<= 0x4;
		}
		Static211.anInt8103 = 0;
		Static541.anInt8831 = 0;
		Static538.anInt8792 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vaa", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!vaa", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort106;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3) {
		return this.method7565(arg3, -1, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort99;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	private void method7570(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null;
		@Pc(27) boolean local27 = this.aClass131_16 != null && this.aClass131_16.anInterface18_3 == null;
		@Pc(38) boolean local38 = this.aClass131_13 != null && this.aClass131_13.anInterface18_3 == null;
		@Pc(55) boolean local55 = this.aClass131_15 != null && this.aClass131_15.anInterface18_3 == null;
		if (arg0) {
			local55 &= (this.aByte113 & 0x8) != 0;
			local38 &= (this.aByte113 & 0x1) != 0;
			local16 &= (this.aByte113 & 0x2) != 0;
			local27 &= (this.aByte113 & 0x4) != 0;
		}
		@Pc(112) byte local112 = 0;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (local38) {
			local112 = 12;
		}
		if (local16) {
			local116 = local112;
			local112 = (byte) (local112 + 4);
		}
		if (local27) {
			local118 = local112;
			local112 = (byte) (local112 + 12);
		}
		if (local55) {
			local120 = local112;
			local112 = (byte) (local112 + 8);
		}
		if (local112 == 0) {
			return;
		}
		if (this.anInt9100 * local112 <= this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2.aByteArray62.length) {
			this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2.anInt5241 = 0;
		} else {
			this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2 = new Class2_Sub15_Sub1((this.anInt9100 + 100) * local112);
		}
		@Pc(196) Class2_Sub15_Sub1 local196 = this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2;
		@Pc(204) int local204;
		@Pc(213) int local213;
		@Pc(241) int local241;
		@Pc(250) int local250;
		if (local38) {
			@Pc(220) int local220;
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(239) int local239;
			if (this.aClass100_Sub3_40.aBoolean595) {
				for (local204 = 0; local204 < this.anInt9102; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray659[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray658[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray657[local204]);
					local232 = this.anIntArray660[local204];
					local239 = this.anIntArray660[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray127[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt5241 = local250 * local112;
						local196.method4288(local213);
						local196.method4288(local220);
						local196.method4288(local227);
					}
				}
			} else {
				for (local204 = 0; local204 < this.anInt9102; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray659[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray658[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray657[local204]);
					local232 = this.anIntArray660[local204];
					local239 = this.anIntArray660[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray127[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt5241 = local112 * local250;
						local196.method4347(local213);
						local196.method4347(local220);
						local196.method4347(local227);
					}
				}
			}
		}
		@Pc(583) float local583;
		@Pc(462) short[] local462;
		@Pc(459) short[] local459;
		@Pc(456) short[] local456;
		@Pc(465) byte[] local465;
		@Pc(616) float local616;
		if (local16) {
			if (this.aClass131_16 == null) {
				if (this.aClass163_1 == null) {
					local456 = this.aShortArray132;
					local459 = this.aShortArray136;
					local462 = this.aShortArray134;
					local465 = this.aByteArray95;
				} else {
					local462 = this.aClass163_1.aShortArray71;
					local459 = this.aClass163_1.aShortArray72;
					local465 = this.aClass163_1.aByteArray50;
					local456 = this.aClass163_1.aShortArray70;
				}
				@Pc(489) float local489 = this.aClass100_Sub3_40.aFloatArray62[0];
				@Pc(495) float local495 = this.aClass100_Sub3_40.aFloatArray62[1];
				@Pc(501) float local501 = this.aClass100_Sub3_40.aFloatArray62[2];
				@Pc(505) float local505 = this.aClass100_Sub3_40.aFloat223;
				@Pc(515) float local515 = this.aClass100_Sub3_40.aFloat214 * 768.0F / (float) this.aShort103;
				@Pc(525) float local525 = this.aClass100_Sub3_40.aFloat221 * 768.0F / (float) this.aShort103;
				for (@Pc(527) int local527 = 0; local527 < this.anInt9091; local527++) {
					@Pc(547) int local547 = this.method7566(this.aShort99, this.aShortArray131[local527], this.aShortArray133[local527], this.aByteArray94[local527]);
					@Pc(558) float local558 = this.aClass100_Sub3_40.aFloat215 * (float) (local547 >> 8 & 0xFF);
					@Pc(563) short local563 = this.aShortArray128[local527];
					@Pc(572) float local572 = (float) (local547 >>> 24) * this.aClass100_Sub3_40.aFloat217;
					local583 = this.aClass100_Sub3_40.aFloat230 * (float) (local547 >> 16 & 0xFF);
					@Pc(588) short local588 = (short) local465[local563];
					if (local588 == 0) {
						local616 = (local495 * (float) local462[local563] + local489 * (float) local459[local563] + (float) local456[local563] * local501) * 0.0026041667F;
					} else {
						local616 = ((float) local456[local563] * local501 + (float) local462[local563] * local495 + local489 * (float) local459[local563]) / (float) (local588 * 256);
					}
					@Pc(653) float local653 = local505 + (local616 < 0.0F ? local525 : local515) * local616;
					@Pc(658) int local658 = (int) (local572 * local653);
					@Pc(663) int local663 = (int) (local583 * local653);
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
					@Pc(697) int local697 = (int) (local653 * local558);
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local196.anInt5241 = local112 * local563 + local116;
					local196.method4333(local658);
					local196.method4333(local663);
					local196.method4333(local697);
					local196.method4333(255 - (this.aByteArray94[local527] & 0xFF));
					local563 = this.aShortArray135[local527];
					local588 = local465[local563];
					if (local588 == 0) {
						local616 = (local501 * (float) local456[local563] + (float) local459[local563] * local489 + local495 * (float) local462[local563]) * 0.0026041667F;
					} else {
						local616 = (local501 * (float) local456[local563] + (float) local459[local563] * local489 + local495 * (float) local462[local563]) / (float) (local588 * 256);
					}
					local653 = local505 + local616 * (local616 < 0.0F ? local525 : local515);
					local658 = (int) (local572 * local653);
					local663 = (int) (local583 * local653);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local697 = (int) (local558 * local653);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local196.anInt5241 = local563 * local112 + local116;
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local196.method4333(local658);
					local196.method4333(local663);
					local196.method4333(local697);
					local196.method4333(255 - (this.aByteArray94[local527] & 0xFF));
					local563 = this.lb[local527];
					local588 = local465[local563];
					if (local588 == 0) {
						local616 = (local501 * (float) local456[local563] + (float) local459[local563] * local489 + (float) local462[local563] * local495) * 0.0026041667F;
					} else {
						local616 = (local501 * (float) local456[local563] + (float) local459[local563] * local489 + (float) local462[local563] * local495) / (float) (local588 * 256);
					}
					local653 = local505 + (local616 < 0.0F ? local525 : local515) * local616;
					local658 = (int) (local653 * local572);
					local663 = (int) (local583 * local653);
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local697 = (int) (local558 * local653);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					if (local697 < 0) {
						local697 = 0;
					} else if (local697 > 255) {
						local697 = 255;
					}
					local196.anInt5241 = local112 * local563 + local116;
					local196.method4333(local658);
					local196.method4333(local663);
					local196.method4333(local697);
					local196.method4333(255 - (this.aByteArray94[local527] & 0xFF));
				}
			} else {
				for (local204 = 0; local204 < this.anInt9091; local204++) {
					local213 = this.method7566(this.aShort99, this.aShortArray131[local204], this.aShortArray133[local204], this.aByteArray94[local204]);
					local196.anInt5241 = this.aShortArray128[local204] * local112 + local116;
					local196.method4288(local213);
					local196.anInt5241 = this.aShortArray135[local204] * local112 + local116;
					local196.method4288(local213);
					local196.anInt5241 = this.lb[local204] * local112 + local116;
					local196.method4288(local213);
				}
			}
		}
		if (local27) {
			if (this.aClass163_1 == null) {
				local462 = this.aShortArray134;
				local465 = this.aByteArray95;
				local459 = this.aShortArray136;
				local456 = this.aShortArray132;
			} else {
				local456 = this.aClass163_1.aShortArray70;
				local465 = this.aClass163_1.aByteArray50;
				local462 = this.aClass163_1.aShortArray71;
				local459 = this.aClass163_1.aShortArray72;
			}
			@Pc(1118) float local1118 = 3.0F / (float) this.aShort103;
			local196.anInt5241 = local118;
			local616 = 3.0F / (float) (this.aShort103 / 2 + this.aShort103);
			if (this.aClass100_Sub3_40.aBoolean595) {
				for (local241 = 0; local241 < this.anInt9100; local241++) {
					local250 = local465[local241] & 0xFF;
					if (local250 == 0) {
						local196.method2575(local616 * (float) local459[local241]);
						local196.method2575(local616 * (float) local462[local241]);
						local196.method2575((float) local456[local241] * local616);
					} else {
						local583 = local1118 / (float) local250;
						local196.method2575((float) local459[local241] * local583);
						local196.method2575(local583 * (float) local462[local241]);
						local196.method2575((float) local456[local241] * local583);
					}
					local196.anInt5241 += local112 - 12;
				}
			} else {
				for (local241 = 0; local241 < this.anInt9100; local241++) {
					local250 = local465[local241] & 0xFF;
					if (local250 == 0) {
						local196.method2573((float) local459[local241] * local616);
						local196.method2573((float) local462[local241] * local616);
						local196.method2573(local616 * (float) local456[local241]);
					} else {
						local583 = local1118 / (float) local250;
						local196.method2573((float) local459[local241] * local583);
						local196.method2573((float) local462[local241] * local583);
						local196.method2573(local583 * (float) local456[local241]);
					}
					local196.anInt5241 += local112 - 12;
				}
			}
		}
		if (local55) {
			local196.anInt5241 = local120;
			if (this.aClass100_Sub3_40.aBoolean595) {
				for (local204 = 0; local204 < this.anInt9100; local204++) {
					local196.method2575(this.aFloatArray68[local204]);
					local196.method2575(this.aFloatArray69[local204]);
					local196.anInt5241 += local112 - 8;
				}
			} else {
				for (local204 = 0; local204 < this.anInt9100; local204++) {
					local196.method2573(this.aFloatArray68[local204]);
					local196.method2573(this.aFloatArray69[local204]);
					local196.anInt5241 += local112 - 8;
				}
			}
		}
		local196.anInt5241 = local112 * this.anInt9100;
		@Pc(1409) Interface18 local1409;
		if (arg0) {
			if (this.anInterface18_7 == null) {
				this.anInterface18_7 = this.aClass100_Sub3_40.method6341(local196.aByteArray62, local196.anInt5241, true, local112);
			} else {
				this.anInterface18_7.method3532(local196.aByteArray62, local196.anInt5241, local112);
			}
			this.aByte113 = 0;
			local1409 = this.anInterface18_7;
		} else {
			local1409 = this.aClass100_Sub3_40.method6341(local196.aByteArray62, local196.anInt5241, false, local112);
			this.aBoolean692 = true;
		}
		if (local38) {
			this.aClass131_13.aByte46 = 0;
			this.aClass131_13.anInterface18_3 = local1409;
		}
		if (local55) {
			this.aClass131_15.anInterface18_3 = local1409;
			this.aClass131_15.aByte46 = local120;
		}
		if (local16) {
			this.aClass131_14.aByte46 = local116;
			this.aClass131_14.anInterface18_3 = local1409;
		}
		if (local27) {
			this.aClass131_16.anInterface18_3 = local1409;
			this.aClass131_16.aByte46 = local118;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	private void method7571() {
		if (!this.aBoolean692) {
			return;
		}
		this.aBoolean692 = false;
		if (this.aClass139Array5 == null && this.aClass270Array5 == null && this.aClass161Array1 == null) {
			if (this.anIntArray659 != null && !Static476.method6768(this.anInt9071, this.anInt9042)) {
				if (this.aClass131_13 != null && this.aClass131_13.anInterface18_3 == null) {
					this.aBoolean692 = true;
				} else {
					if (!this.aBoolean693) {
						this.method7575();
					}
					this.anIntArray659 = null;
				}
			}
			if (this.anIntArray658 != null && !Static198.method3258(this.anInt9042, this.anInt9071)) {
				if (this.aClass131_13 != null && this.aClass131_13.anInterface18_3 == null) {
					this.aBoolean692 = true;
				} else {
					if (!this.aBoolean693) {
						this.method7575();
					}
					this.anIntArray658 = null;
				}
			}
			if (this.anIntArray657 != null && !Static81.method1275(this.anInt9071, this.anInt9042)) {
				if (this.aClass131_13 != null && this.aClass131_13.anInterface18_3 == null) {
					this.aBoolean692 = true;
				} else {
					if (!this.aBoolean693) {
						this.method7575();
					}
					this.anIntArray657 = null;
				}
			}
		}
		if (this.aShortArray127 != null && this.anIntArray659 == null && this.anIntArray658 == null && this.anIntArray657 == null) {
			this.anIntArray660 = null;
			this.aShortArray127 = null;
		}
		if (this.aByteArray95 != null && !Static111.method1661(this.anInt9071, this.anInt9042)) {
			if (this.aClass131_16 == null) {
				if (this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null) {
					this.aBoolean692 = true;
				} else {
					this.aShortArray136 = this.aShortArray134 = this.aShortArray132 = null;
					this.aByteArray95 = null;
				}
			} else if (this.aClass131_16.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aByteArray95 = null;
				this.aShortArray136 = this.aShortArray134 = this.aShortArray132 = null;
			}
		}
		if (this.aShortArray131 != null && !Static123.method1795(this.anInt9071, this.anInt9042)) {
			if (this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aShortArray131 = null;
			}
		}
		if (this.aByteArray94 != null && !Static277.method4188(this.anInt9071, this.anInt9042)) {
			if (this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aByteArray94 = null;
			}
		}
		if (this.aFloatArray68 != null && !Static22.method427(this.anInt9042, this.anInt9071)) {
			if (this.aClass131_15 != null && this.aClass131_15.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aFloatArray68 = this.aFloatArray69 = null;
			}
		}
		if (this.aShortArray133 != null && !Static291.method4372(this.anInt9071, this.anInt9042)) {
			if (this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aShortArray133 = null;
			}
		}
		if (this.aShortArray128 != null && !Static494.method6898(this.anInt9071, this.anInt9042)) {
			if (this.aClass95_1 != null && this.aClass95_1.anInterface3_2 == null || this.aClass131_14 != null && this.aClass131_14.anInterface18_3 == null) {
				this.aBoolean692 = true;
			} else {
				this.aShortArray128 = this.aShortArray135 = this.lb = null;
			}
		}
		if (this.anIntArrayArray64 != null && !Static450.method6451(this.anInt9042, this.anInt9071)) {
			this.aShortArray129 = null;
			this.anIntArrayArray64 = null;
		}
		if (this.anIntArrayArray63 != null && !Static299.method4535(this.anInt9071, this.anInt9042)) {
			this.anIntArrayArray63 = null;
			this.aShortArray130 = null;
		}
		if (this.anIntArrayArray65 != null && !Static145.method2410(this.anInt9042, this.anInt9071)) {
			this.anIntArrayArray65 = null;
		}
		if (this.anIntArray656 != null && (this.anInt9071 & 0x800) == 0 && (this.anInt9071 & 0x40000) == 0) {
			this.anIntArray656 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIFIJFILclient!eg;I)S")
	private short method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) long arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class93 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray660[arg8];
		@Pc(17) int local17 = this.anIntArray660[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = local10; local28 < local17; local28++) {
			@Pc(35) short local35 = this.aShortArray127[local28];
			if (local35 == 0) {
				local19 = local28;
				break;
			}
			if (arg4 == Static395.aLongArray11[local28]) {
				return (short) (local35 - 1);
			}
		}
		this.aShortArray127[local19] = (short) (this.anInt9100 + 1);
		Static395.aLongArray11[local19] = arg4;
		this.aShortArray136[this.anInt9100] = (short) arg6;
		this.aShortArray134[this.anInt9100] = (short) arg0;
		this.aShortArray132[this.anInt9100] = (short) arg2;
		this.aByteArray95[this.anInt9100] = (byte) arg1;
		this.aFloatArray68[this.anInt9100] = arg3;
		this.aFloatArray69[this.anInt9100] = arg5;
		return (short) this.anInt9100++;
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "()V")
	@Override
	protected void method7555() {
	}

	@OriginalMember(owner = "client!vaa", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class66 method7551(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class66_Sub3 local19;
		@Pc(15) Class66_Sub3 local15;
		if (arg0 == 1) {
			local15 = this.aClass100_Sub3_40.aClass66_Sub3_2;
			local19 = this.aClass100_Sub3_40.aClass66_Sub3_8;
		} else if (arg0 == 2) {
			local15 = this.aClass100_Sub3_40.aClass66_Sub3_9;
			local19 = this.aClass100_Sub3_40.aClass66_Sub3_5;
		} else if (arg0 == 3) {
			local15 = this.aClass100_Sub3_40.aClass66_Sub3_10;
			local19 = this.aClass100_Sub3_40.aClass66_Sub3_4;
		} else if (arg0 == 4) {
			local15 = this.aClass100_Sub3_40.aClass66_Sub3_3;
			local19 = this.aClass100_Sub3_40.aClass66_Sub3_7;
		} else if (arg0 == 5) {
			local15 = this.aClass100_Sub3_40.aClass66_Sub3_6;
			local19 = this.aClass100_Sub3_40.aClass66_Sub3_1;
		} else {
			local19 = local15 = new Class66_Sub3(this.aClass100_Sub3_40);
		}
		return this.method7578(local15, arg2, local19, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!vaa", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean693) {
			this.method7575();
		}
		@Pc(16) int local16 = this.aShort105 + arg4;
		@Pc(21) int local21 = this.aShort107 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort100;
		@Pc(32) int local32 = this.aShort106 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8111 <= arg2.anInt8104 + local21 >> arg2.anInt8108 || local27 < 0 || arg2.anInt8104 + local32 >> arg2.anInt8108 >= arg2.anInt8110)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8104 + local21 >> arg3.anInt8108 >= arg3.anInt8111 || local27 < 0 || arg3.anInt8104 + local32 >> arg3.anInt8108 >= arg3.anInt8110) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8108;
			local21 = arg2.anInt8104 + local21 - 1 >> arg2.anInt8108;
			local27 >>= arg2.anInt8108;
			local32 = local32 + arg2.anInt8104 - 1 >> arg2.anInt8108;
			if (arg2.method6707(local27, local16) == arg5 && arg5 == arg2.method6707(local27, local21) && arg5 == arg2.method6707(local32, local16) && arg2.method6707(local32, local21) == arg5) {
				return;
			}
		}
		@Pc(281) int local281;
		if (arg0 == 1) {
			for (local281 = 0; local281 < this.anInt9102; local281++) {
				this.anIntArray658[local281] = this.anIntArray658[local281] + arg2.method6711(this.anIntArray657[local281] + arg6, this.anIntArray659[local281] - -arg4) - arg5;
			}
		} else {
			@Pc(206) int local206;
			@Pc(217) int local217;
			if (arg0 == 2) {
				@Pc(198) short local198 = this.aShort101;
				if (local198 == 0) {
					return;
				}
				for (local206 = 0; local206 < this.anInt9102; local206++) {
					local217 = (this.anIntArray658[local206] << 16) / local198;
					if (arg1 > local217) {
						this.anIntArray658[local206] += (arg1 - local217) * (-arg5 + arg2.method6711(arg6 + this.anIntArray657[local206], this.anIntArray659[local206] + arg4)) / arg1;
					}
				}
			} else {
				@Pc(300) int local300;
				if (arg0 == 3) {
					local281 = (arg1 & 0xFF) * 4;
					local206 = (arg1 >> 8 & 0xFF) * 4;
					local217 = (arg1 >> 16 & 0xFF) << 6;
					local300 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local281 >> 1) < 0 || (local281 >> 1) + arg4 + arg2.anInt8104 >= arg2.anInt8111 << arg2.anInt8108 || arg6 - (local206 >> 1) < 0 || arg2.anInt8104 + (local206 >> 1) + arg6 >= arg2.anInt8110 << arg2.anInt8108) {
						return;
					}
					this.method7540(local206, arg2, arg4, local217, local281, arg5, local300, arg6);
				} else if (arg0 == 4) {
					local281 = this.aShort102 - this.aShort101;
					for (local206 = 0; local206 < this.anInt9102; local206++) {
						this.anIntArray658[local206] = local281 + this.anIntArray658[local206] + arg3.method6711(arg6 + this.anIntArray657[local206], arg4 + this.anIntArray659[local206]) - arg5;
					}
				} else if (arg0 == 5) {
					local281 = this.aShort102 - this.aShort101;
					for (local206 = 0; local206 < this.anInt9102; local206++) {
						local217 = this.anIntArray659[local206] + arg4;
						local300 = this.anIntArray657[local206] + arg6;
						@Pc(306) int local306 = arg2.method6711(local300, local217);
						@Pc(312) int local312 = arg3.method6711(local300, local217);
						@Pc(320) int local320 = local306 - arg1 - local312;
						this.anIntArray658[local206] = ((this.anIntArray658[local206] << 8) / local281 * local320 >> 8) + local306 - arg5;
					}
				}
			}
		}
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9102; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray658[local15] - local9 * this.anIntArray657[local15] >> 14;
			this.anIntArray657[local15] = this.anIntArray658[local15] * local9 + local13 * this.anIntArray657[local15] >> 14;
			this.anIntArray658[local15] = local34;
		}
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9102; local3++) {
			this.anIntArray657[local3] = -this.anIntArray657[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt9100; local29++) {
			this.aShortArray132[local29] = (short) -this.aShortArray132[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt9091; local52++) {
			@Pc(59) short local59 = this.aShortArray128[local52];
			this.aShortArray128[local52] = this.lb[local52];
			this.lb[local52] = local59;
		}
		if (this.aClass131_16 == null && this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
		if (this.aClass131_16 != null) {
			this.aClass131_16.anInterface18_3 = null;
		}
		if (this.aClass95_1 != null) {
			this.aClass95_1.anInterface3_2 = null;
		}
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method7565(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!vg;Z)V")
	private void method7574(@OriginalArg(0) Class2_Sub3_Sub6_Sub2 arg0) {
		if (this.aClass100_Sub3_40.anIntArray513.length < this.anInt9100) {
			this.aClass100_Sub3_40.anIntArray511 = new int[this.anInt9100];
			this.aClass100_Sub3_40.anIntArray513 = new int[this.anInt9100];
		}
		@Pc(32) int[] local32 = this.aClass100_Sub3_40.anIntArray513;
		@Pc(36) int[] local36 = this.aClass100_Sub3_40.anIntArray511;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt9102; local38++) {
			local65 = (this.anIntArray659[local38] - (this.aClass100_Sub3_40.anInt7701 * this.anIntArray658[local38] >> 8) >> this.aClass100_Sub3_40.anInt7665) - arg0.anInt9185;
			@Pc(90) int local90 = (this.anIntArray657[local38] - (this.aClass100_Sub3_40.anInt7702 * this.anIntArray658[local38] >> 8) >> this.aClass100_Sub3_40.anInt7665) - arg0.anInt9194;
			@Pc(95) int local95 = this.anIntArray660[local38];
			@Pc(102) int local102 = this.anIntArray660[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray127[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt9103; local65++) {
			if (this.aByteArray94 == null || this.aByteArray94[local65] <= 128) {
				@Pc(157) short local157 = this.aShortArray128[local65];
				@Pc(162) short local162 = this.aShortArray135[local65];
				@Pc(167) short local167 = this.lb[local65];
				local104 = local32[local157];
				local113 = local32[local162];
				@Pc(179) int local179 = local32[local167];
				@Pc(183) int local183 = local36[local157];
				@Pc(187) int local187 = local36[local162];
				@Pc(191) int local191 = local36[local167];
				if (-((local187 - local183) * (-local113 + local179)) + (local104 - local113) * (local187 - local191) > 0) {
					arg0.method7631(local191, local104, local179, local113, local183, local187);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort103;
	}

	@OriginalMember(owner = "client!vaa", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt9071;
	}

	@OriginalMember(owner = "client!vaa", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static211.anInt8103 = 0;
			Static538.anInt8792 = 0;
			Static541.anInt8831 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt9102; local20++) {
				Static538.anInt8792 += this.anIntArray659[local20];
				Static541.anInt8831 += this.anIntArray658[local20];
				Static211.anInt8103 += this.anIntArray657[local20];
				local18++;
			}
			if (local18 > 0) {
				Static211.anInt8103 = arg3 + Static211.anInt8103 / local18;
				Static541.anInt8831 = Static541.anInt8831 / local18 + arg2;
				Static538.anInt8792 = Static538.anInt8792 / local18 + arg1;
			} else {
				Static538.anInt8792 = arg1;
				Static211.anInt8103 = arg3;
				Static541.anInt8831 = arg2;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt9102; local18++) {
				this.anIntArray659[local18] += arg1;
				this.anIntArray658[local18] += arg2;
				this.anIntArray657[local18] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt9102; local18++) {
					this.anIntArray659[local18] -= Static538.anInt8792;
					this.anIntArray658[local18] -= Static541.anInt8831;
					this.anIntArray657[local18] -= Static211.anInt8103;
					if (arg3 != 0) {
						local20 = Class363.anIntArray697[arg3];
						local163 = Class363.anIntArray698[arg3];
						local181 = local163 * this.anIntArray659[local18] + local20 * this.anIntArray658[local18] + 16383 >> 14;
						this.anIntArray658[local18] = local163 * this.anIntArray658[local18] + 16383 - local20 * this.anIntArray659[local18] >> 14;
						this.anIntArray659[local18] = local181;
					}
					if (arg1 != 0) {
						local20 = Class363.anIntArray697[arg1];
						local163 = Class363.anIntArray698[arg1];
						local181 = this.anIntArray658[local18] * local163 + 16383 - local20 * this.anIntArray657[local18] >> 14;
						this.anIntArray657[local18] = local20 * this.anIntArray658[local18] + this.anIntArray657[local18] * local163 + 16383 >> 14;
						this.anIntArray658[local18] = local181;
					}
					if (arg2 != 0) {
						local20 = Class363.anIntArray697[arg2];
						local163 = Class363.anIntArray698[arg2];
						local181 = local20 * this.anIntArray657[local18] + local163 * this.anIntArray659[local18] + 16383 >> 14;
						this.anIntArray657[local18] = local163 * this.anIntArray657[local18] + 16383 - local20 * this.anIntArray659[local18] >> 14;
						this.anIntArray659[local18] = local181;
					}
					this.anIntArray659[local18] += Static538.anInt8792;
					this.anIntArray658[local18] += Static541.anInt8831;
					this.anIntArray657[local18] += Static211.anInt8103;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt9102; local18++) {
					this.anIntArray659[local18] -= Static538.anInt8792;
					this.anIntArray658[local18] -= Static541.anInt8831;
					this.anIntArray657[local18] -= Static211.anInt8103;
					this.anIntArray659[local18] = arg1 * this.anIntArray659[local18] / 128;
					this.anIntArray658[local18] = this.anIntArray658[local18] * arg2 / 128;
					this.anIntArray657[local18] = arg3 * this.anIntArray657[local18] / 128;
					this.anIntArray659[local18] += Static538.anInt8792;
					this.anIntArray658[local18] += Static541.anInt8831;
					this.anIntArray657[local18] += Static211.anInt8103;
				}
			} else {
				@Pc(515) Class161 local515;
				@Pc(520) Class281 local520;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt9091; local18++) {
						local20 = (this.aByteArray94[local18] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray94[local18] = (byte) local20;
					}
					if (this.aClass131_14 != null) {
						this.aClass131_14.anInterface18_3 = null;
					}
					if (this.aClass161Array1 != null) {
						for (local20 = 0; local20 < this.anInt9053; local20++) {
							local515 = this.aClass161Array1[local20];
							local520 = this.aClass281Array1[local20];
							local520.anInt7879 = local520.anInt7879 & 0xFFFFFF | 255 - (this.aByteArray94[local515.anInt4195] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt9091; local18++) {
						local20 = this.aShortArray131[local18] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local181 = local20 >> 7 & 0x7;
						@Pc(583) int local583 = local163 + arg1 & 0x3F;
						@Pc(587) int local587 = local20 & 0x7F;
						local181 += arg2 / 4;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local587 += arg3;
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray131[local18] = (short) (local587 | local181 << 7 | local583 << 10);
					}
					if (this.aClass131_14 != null) {
						this.aClass131_14.anInterface18_3 = null;
					}
					if (this.aClass161Array1 != null) {
						for (local20 = 0; local20 < this.anInt9053; local20++) {
							local515 = this.aClass161Array1[local20];
							local520 = this.aClass281Array1[local20];
							local520.anInt7879 = Static250.anIntArray314[this.aShortArray131[local515.anInt4195] & 0xFFFF] & 0xFFFFFF | local520.anInt7879 & 0xFF000000;
						}
					}
				} else {
					@Pc(710) Class281 local710;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt9053; local18++) {
							local710 = this.aClass281Array1[local18];
							local710.anInt7875 += arg2;
							local710.anInt7878 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt9053; local18++) {
							local710 = this.aClass281Array1[local18];
							local710.anInt7884 = local710.anInt7884 * arg1 >> 7;
							local710.anInt7880 = arg2 * local710.anInt7880 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt9053; local18++) {
							local710 = this.aClass281Array1[local18];
							local710.anInt7883 = local710.anInt7883 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	private void method7575() {
		@Pc(7) int local7 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9102; local29++) {
			@Pc(36) int local36 = this.anIntArray659[local29];
			@Pc(41) int local41 = this.anIntArray658[local29];
			@Pc(46) int local46 = this.anIntArray657[local29];
			if (local15 > local41) {
				local15 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			if (local21 < local41) {
				local21 = local41;
			}
			if (local36 > local19) {
				local19 = local36;
			}
			if (local17 > local46) {
				local17 = local46;
			}
			if (local23 < local46) {
				local23 = local46;
			}
			@Pc(92) int local92 = local46 * local46 + local36 * local36;
			if (local92 > local25) {
				local25 = local92;
			}
			local92 = local46 * local46 + local36 * local36 + local41 * local41;
			if (local27 < local92) {
				local27 = local92;
			}
		}
		this.aShort106 = (short) local23;
		this.aShort100 = (short) local17;
		this.aShort105 = (short) local7;
		this.aShort102 = (short) local21;
		this.aShort107 = (short) local19;
		this.aShort101 = (short) local15;
		this.aShort104 = (short) (Math.sqrt((double) local25) + 0.99D);
		this.aShort108 = (short) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean693 = true;
	}

	@OriginalMember(owner = "client!vaa", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort105;
	}

	@OriginalMember(owner = "client!vaa", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9102; local15++) {
			@Pc(33) int local33 = this.anIntArray659[local15] * local13 + this.anIntArray658[local15] * local9 >> 14;
			this.anIntArray658[local15] = this.anIntArray658[local15] * local13 - local9 * this.anIntArray659[local15] >> 14;
			this.anIntArray659[local15] = local33;
		}
		this.aBoolean693 = false;
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZ)V")
	private void method7576(@OriginalArg(1) boolean arg0) {
		if (this.anInt9103 * 6 <= this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2.aByteArray62.length) {
			this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2.anInt5241 = 0;
		} else {
			this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2 = new Class2_Sub15_Sub1((this.anInt9103 + 100) * 6);
		}
		@Pc(46) Class2_Sub15_Sub1 local46 = this.aClass100_Sub3_40.aClass2_Sub15_Sub1_2;
		@Pc(52) int local52;
		if (this.aClass100_Sub3_40.aBoolean595) {
			for (local52 = 0; local52 < this.anInt9103; local52++) {
				local46.method4350(this.aShortArray128[local52]);
				local46.method4350(this.aShortArray135[local52]);
				local46.method4350(this.lb[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt9103; local52++) {
				local46.method4308(this.aShortArray128[local52]);
				local46.method4308(this.aShortArray135[local52]);
				local46.method4308(this.lb[local52]);
			}
		}
		if (local46.anInt5241 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface3_5 == null) {
				this.anInterface3_5 = this.aClass100_Sub3_40.method6301(local46.anInt5241, local46.aByteArray62, true);
			} else {
				this.anInterface3_5.method7927(local46.anInt5241, local46.aByteArray62);
			}
			this.aClass95_1.anInterface3_2 = this.anInterface3_5;
		} else {
			this.aClass95_1.anInterface3_2 = this.aClass100_Sub3_40.method6301(local46.anInt5241, local46.aByteArray62, false);
		}
		if (!arg0) {
			this.aBoolean692 = true;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort107;
	}

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9091; local3++) {
			if (arg0 == this.aShortArray131[local3]) {
				this.aShortArray131[local3] = arg1;
			}
		}
		if (this.aClass161Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt9053; local38++) {
				@Pc(45) Class161 local45 = this.aClass161Array1[local38];
				@Pc(50) Class281 local50 = this.aClass281Array1[local38];
				local50.anInt7879 = local50.anInt7879 & 0xFF000000 | Static250.anIntArray314[this.aShortArray131[local45.anInt4195] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method7577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg3 && arg0 < arg2 && arg0 < arg6) {
			return false;
		} else if (arg0 > arg3 && arg2 < arg0 && arg0 > arg6) {
			return false;
		} else if (arg7 > arg1 && arg1 < arg4 && arg5 > arg1) {
			return false;
		} else {
			return arg7 >= arg1 || arg4 >= arg1 || arg5 >= arg1;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!vaa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort108;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!q;Lclient!pba;I)V")
	@Override
	public void method7558(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9100 == 0) {
			return;
		}
		@Pc(13) Class68_Sub1 local13 = this.aClass100_Sub3_40.aClass68_Sub1_3;
		if (!this.aBoolean693) {
			this.method7575();
		}
		@Pc(22) Class68_Sub1 local22 = (Class68_Sub1) arg0;
		Static445.aFloat232 = local13.aFloat35 + local13.aFloat44 * local22.aFloat35 + local13.aFloat33 * local22.aFloat39 + local22.aFloat43 * local13.aFloat38;
		Static244.aFloat136 = local22.aFloat36 * local13.aFloat33 + local22.aFloat42 * local13.aFloat38 + local13.aFloat44 * local22.aFloat33;
		@Pc(69) float local69 = Static445.aFloat232 + (float) this.aShort101 * Static244.aFloat136;
		@Pc(77) float local77 = Static244.aFloat136 * (float) this.aShort102 + Static445.aFloat232;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local94 = local69 + (float) this.aShort104;
			local88 = local77 - (float) this.aShort104;
		} else {
			local88 = (float) -this.aShort104 + local69;
			local94 = local77 + (float) this.aShort104;
		}
		if (this.aClass100_Sub3_40.aFloat212 <= local88 || (float) this.aClass100_Sub3_40.anInt7688 >= local94) {
			return;
		}
		Static138.aFloat95 = local13.aFloat43 + local13.aFloat40 * local22.aFloat35 + local22.aFloat39 * local13.aFloat42 + local13.aFloat41 * local22.aFloat43;
		Static331.aFloat179 = local22.aFloat33 * local13.aFloat40 + local13.aFloat42 * local22.aFloat36 + local13.aFloat41 * local22.aFloat42;
		@Pc(170) float local170 = (float) this.aShort101 * Static331.aFloat179 + Static138.aFloat95;
		@Pc(178) float local178 = Static138.aFloat95 + (float) this.aShort102 * Static331.aFloat179;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local170 > local178) {
			local193 = ((float) -this.aShort104 + local178) * (float) this.aClass100_Sub3_40.anInt7694;
			local204 = (local170 + (float) this.aShort104) * (float) this.aClass100_Sub3_40.anInt7694;
		} else {
			local193 = (float) this.aClass100_Sub3_40.anInt7694 * (local170 - (float) this.aShort104);
			local204 = ((float) this.aShort104 + local178) * (float) this.aClass100_Sub3_40.anInt7694;
		}
		if (local193 / local94 >= this.aClass100_Sub3_40.aFloat225 || this.aClass100_Sub3_40.aFloat231 >= local204 / local94) {
			return;
		}
		Static412.aFloat12 = local13.aFloat36 * local22.aFloat36 + local22.aFloat42 * local13.aFloat37 + local22.aFloat33 * local13.aFloat34;
		Static412.aFloat14 = local13.aFloat39 + local13.aFloat34 * local22.aFloat35 + local22.aFloat39 * local13.aFloat36 + local13.aFloat37 * local22.aFloat43;
		@Pc(294) float local294 = (float) this.aShort101 * Static412.aFloat12 + Static412.aFloat14;
		@Pc(302) float local302 = Static412.aFloat14 + Static412.aFloat12 * (float) this.aShort102;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local302 < local294) {
			local318 = (float) this.aClass100_Sub3_40.anInt7695 * ((float) -this.aShort104 + local302);
			local329 = (float) this.aClass100_Sub3_40.anInt7695 * (local294 + (float) this.aShort104);
		} else {
			local329 = (float) this.aClass100_Sub3_40.anInt7695 * ((float) this.aShort104 + local302);
			local318 = (local294 - (float) this.aShort104) * (float) this.aClass100_Sub3_40.anInt7695;
		}
		if (local318 / local94 >= this.aClass100_Sub3_40.aFloat222 || local329 / local94 <= this.aClass100_Sub3_40.aFloat224) {
			return;
		}
		if (arg1 != null || this.aClass161Array1 != null) {
			Static35.aFloat19 = local13.aFloat40 * local22.aFloat38 + local13.aFloat42 * local22.aFloat37 + local22.aFloat41 * local13.aFloat41;
			Static343.aFloat146 = local13.aFloat36 * local22.aFloat34 + local22.aFloat40 * local13.aFloat37 + local13.aFloat34 * local22.aFloat44;
			Static317.aFloat168 = local13.aFloat40 * local22.aFloat44 + local13.aFloat41 * local22.aFloat40 + local22.aFloat34 * local13.aFloat42;
			Static340.aFloat192 = local13.aFloat38 * local22.aFloat40 + local13.aFloat33 * local22.aFloat34 + local22.aFloat44 * local13.aFloat44;
			Static163.aFloat118 = local22.aFloat41 * local13.aFloat38 + local22.aFloat37 * local13.aFloat33 + local22.aFloat38 * local13.aFloat44;
			Static55.aFloat121 = local22.aFloat38 * local13.aFloat34 + local22.aFloat41 * local13.aFloat37 + local22.aFloat37 * local13.aFloat36;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.aShort105 + this.aShort107 >> 1;
			@Pc(507) int local507 = this.aShort100 + this.aShort106 >> 1;
			@Pc(526) int local526 = (int) ((float) this.aShort101 * Static331.aFloat179 + Static138.aFloat95 + (float) local498 * Static35.aFloat19 + (float) local507 * Static317.aFloat168);
			@Pc(545) int local545 = (int) ((float) local498 * Static55.aFloat121 + Static412.aFloat14 + (float) this.aShort101 * Static412.aFloat12 + (float) local507 * Static343.aFloat146);
			@Pc(564) int local564 = (int) (Static340.aFloat192 * (float) local507 + Static244.aFloat136 * (float) this.aShort101 + Static163.aFloat118 * (float) local498 + Static445.aFloat232);
			if (this.aClass100_Sub3_40.anInt7688 <= local564) {
				arg1.anInt6925 = this.aClass100_Sub3_40.anInt7697 + this.aClass100_Sub3_40.anInt7694 * local526 / local564;
				arg1.anInt6922 = local545 * this.aClass100_Sub3_40.anInt7695 / local564 + this.aClass100_Sub3_40.anInt7693;
			} else {
				local488 = true;
			}
			@Pc(622) int local622 = (int) (Static331.aFloat179 * (float) this.aShort102 + Static138.aFloat95 + Static35.aFloat19 * (float) local498 + (float) local507 * Static317.aFloat168);
			@Pc(641) int local641 = (int) ((float) this.aShort102 * Static412.aFloat12 + Static412.aFloat14 + Static55.aFloat121 * (float) local498 + (float) local507 * Static343.aFloat146);
			@Pc(660) int local660 = (int) (Static445.aFloat232 + (float) local498 * Static163.aFloat118 + (float) this.aShort102 * Static244.aFloat136 + Static340.aFloat192 * (float) local507);
			if (this.aClass100_Sub3_40.anInt7688 <= local660) {
				arg1.anInt6926 = this.aClass100_Sub3_40.anInt7697 + local622 * this.aClass100_Sub3_40.anInt7694 / local660;
				arg1.anInt6923 = this.aClass100_Sub3_40.anInt7693 + local641 * this.aClass100_Sub3_40.anInt7695 / local660;
			} else {
				local488 = true;
			}
			if (local488) {
				if (local564 < this.aClass100_Sub3_40.anInt7688 && this.aClass100_Sub3_40.anInt7688 > local660) {
					local490 = false;
				} else {
					@Pc(739) int local739;
					@Pc(751) int local751;
					@Pc(763) int local763;
					if (local564 < this.aClass100_Sub3_40.anInt7688) {
						local739 = (local660 - this.aClass100_Sub3_40.anInt7688 << 16) / (local660 - local564);
						local751 = local622 + ((local622 - local526) * local739 >> 16);
						local763 = local641 + ((local641 - local545) * local739 >> 16);
						arg1.anInt6925 = this.aClass100_Sub3_40.anInt7697 + local751 * this.aClass100_Sub3_40.anInt7694 / this.aClass100_Sub3_40.anInt7688;
						arg1.anInt6922 = local763 * this.aClass100_Sub3_40.anInt7695 / this.aClass100_Sub3_40.anInt7688 + this.aClass100_Sub3_40.anInt7693;
					} else if (local660 < this.aClass100_Sub3_40.anInt7688) {
						local739 = (local564 - this.aClass100_Sub3_40.anInt7688 << 16) / (local564 - local660);
						local751 = local526 + (local739 * (local526 - local622) >> 16);
						local763 = local545 + (local739 * (local545 - local641) >> 16);
						arg1.anInt6925 = this.aClass100_Sub3_40.anInt7694 * local751 / this.aClass100_Sub3_40.anInt7688 + this.aClass100_Sub3_40.anInt7697;
						arg1.anInt6922 = local763 * this.aClass100_Sub3_40.anInt7695 / this.aClass100_Sub3_40.anInt7688 + this.aClass100_Sub3_40.anInt7693;
					}
				}
			}
			if (local490) {
				arg1.aBoolean539 = true;
				if (local660 < local564) {
					arg1.anInt6924 = this.aClass100_Sub3_40.anInt7697 + this.aClass100_Sub3_40.anInt7694 * (this.aShort104 + local526) / local564 - arg1.anInt6925;
				} else {
					arg1.anInt6924 = this.aClass100_Sub3_40.anInt7697 + (this.aShort104 + local622) * this.aClass100_Sub3_40.anInt7694 / local660 - arg1.anInt6926;
				}
			}
		}
		this.aClass100_Sub3_40.method6305();
		this.aClass100_Sub3_40.method6329(local22);
		this.method7569();
		this.aClass100_Sub3_40.method6291();
		this.method7567();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V")
	@Override
	public void method7546() {
		if (this.anInt9100 <= 0 || this.anInt9103 <= 0) {
			return;
		}
		this.method7570(false);
		if ((this.aByte113 & 0x10) == 0 && this.aClass95_1.anInterface3_2 == null) {
			this.method7576(false);
		}
		this.method7571();
	}

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "()V")
	@Override
	protected void method7557() {
	}

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "()[Lclient!qg;")
	@Override
	public Class270[] method7561() {
		return this.aClass270Array5;
	}

	@OriginalMember(owner = "client!vaa", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static538.anInt8792 = 0;
			Static211.anInt8103 = 0;
			local31 = 0;
			Static541.anInt8831 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray63.length > local41) {
					local51 = this.anIntArrayArray63[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray130 == null || (arg6 & this.aShortArray130[local59]) != 0) {
							Static538.anInt8792 += this.anIntArray659[local59];
							Static541.anInt8831 += this.anIntArray658[local59];
							local31++;
							Static211.anInt8103 += this.anIntArray657[local59];
						}
					}
				}
			}
			if (local31 > 0) {
				Static211.anInt8103 = arg4 + Static211.anInt8103 / local31;
				Static541.anInt8831 = Static541.anInt8831 / local31 + arg3;
				Static538.anInt8792 = Static538.anInt8792 / local31 + arg2;
				Static541.aBoolean680 = true;
			} else {
				Static541.anInt8831 = arg3;
				Static538.anInt8792 = arg2;
				Static211.anInt8103 = arg4;
			}
			return;
		}
		@Pc(257) int[] local257;
		@Pc(259) int local259;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg4 * arg7[2] + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local31;
				arg3 = local35;
				arg4 = local41;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray63.length > local35) {
					local257 = this.anIntArrayArray63[local35];
					for (local259 = 0; local259 < local257.length; local259++) {
						local53 = local257[local259];
						if (this.aShortArray130 == null || (this.aShortArray130[local53] & arg6) != 0) {
							this.anIntArray659[local53] += arg2;
							this.anIntArray658[local53] += arg3;
							this.anIntArray657[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(402) int local402;
		@Pc(420) int local420;
		@Pc(653) int local653;
		@Pc(662) int local662;
		@Pc(674) int local674;
		@Pc(678) int local678;
		@Pc(696) int local696;
		@Pc(1034) int local1034;
		@Pc(1042) int local1042;
		@Pc(1195) int local1195;
		@Pc(1220) int local1220;
		@Pc(1225) int local1225;
		@Pc(1235) int local1235;
		@Pc(1240) int local1240;
		@Pc(1244) int local1244;
		@Pc(1248) int local1248;
		@Pc(1250) int local1250;
		@Pc(1381) int[] local1381;
		@Pc(1383) int local1383;
		@Pc(1387) int local1387;
		@Pc(1391) int local1391;
		@Pc(1393) int local1393;
		@Pc(1519) int local1519;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray63.length > local35) {
						local257 = this.anIntArrayArray63[local35];
						for (local259 = 0; local259 < local257.length; local259++) {
							local53 = local257[local259];
							if (this.aShortArray130 == null || (arg6 & this.aShortArray130[local53]) != 0) {
								this.anIntArray659[local53] -= Static538.anInt8792;
								this.anIntArray658[local53] -= Static541.anInt8831;
								this.anIntArray657[local53] -= Static211.anInt8103;
								if (arg4 != 0) {
									local59 = Class363.anIntArray697[arg4];
									local402 = Class363.anIntArray698[arg4];
									local420 = local402 * this.anIntArray659[local53] + this.anIntArray658[local53] * local59 + 16383 >> 14;
									this.anIntArray658[local53] = local402 * this.anIntArray658[local53] + 16383 - this.anIntArray659[local53] * local59 >> 14;
									this.anIntArray659[local53] = local420;
								}
								if (arg2 != 0) {
									local59 = Class363.anIntArray697[arg2];
									local402 = Class363.anIntArray698[arg2];
									local420 = local402 * this.anIntArray658[local53] + 16383 - local59 * this.anIntArray657[local53] >> 14;
									this.anIntArray657[local53] = this.anIntArray657[local53] * local402 + this.anIntArray658[local53] * local59 + 16383 >> 14;
									this.anIntArray658[local53] = local420;
								}
								if (arg3 != 0) {
									local59 = Class363.anIntArray697[arg3];
									local402 = Class363.anIntArray698[arg3];
									local420 = local59 * this.anIntArray657[local53] + local402 * this.anIntArray659[local53] + 16383 >> 14;
									this.anIntArray657[local53] = local402 * this.anIntArray657[local53] + 16383 - local59 * this.anIntArray659[local53] >> 14;
									this.anIntArray659[local53] = local420;
								}
								this.anIntArray659[local53] += Static538.anInt8792;
								this.anIntArray658[local53] += Static541.anInt8831;
								this.anIntArray657[local53] += Static211.anInt8103;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray63.length) {
							local51 = this.anIntArrayArray63[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray130 == null || (arg6 & this.aShortArray130[local59]) != 0) {
									local402 = this.anIntArray660[local59];
									local420 = this.anIntArray660[local59 + 1];
									for (local653 = local402; local653 < local420; local653++) {
										local662 = this.aShortArray127[local653] - 1;
										if (local662 == -1) {
											break;
										}
										if (arg4 != 0) {
											local674 = Class363.anIntArray697[arg4];
											local678 = Class363.anIntArray698[arg4];
											local696 = this.aShortArray134[local662] * local674 + this.aShortArray136[local662] * local678 + 16383 >> 14;
											this.aShortArray134[local662] = (short) (this.aShortArray134[local662] * local678 + 16383 - this.aShortArray136[local662] * local674 >> 14);
											this.aShortArray136[local662] = (short) local696;
										}
										if (arg2 != 0) {
											local674 = Class363.anIntArray697[arg2];
											local678 = Class363.anIntArray698[arg2];
											local696 = local678 * this.aShortArray134[local662] + 16383 - local674 * this.aShortArray132[local662] >> 14;
											this.aShortArray132[local662] = (short) (this.aShortArray132[local662] * local678 + local674 * this.aShortArray134[local662] + 16383 >> 14);
											this.aShortArray134[local662] = (short) local696;
										}
										if (arg3 != 0) {
											local674 = Class363.anIntArray697[arg3];
											local678 = Class363.anIntArray698[arg3];
											local696 = local678 * this.aShortArray136[local662] + this.aShortArray132[local662] * local674 + 16383 >> 14;
											this.aShortArray132[local662] = (short) (this.aShortArray132[local662] * local678 + 16383 - this.aShortArray136[local662] * local674 >> 14);
											this.aShortArray136[local662] = (short) local696;
										}
									}
								}
							}
						}
					}
					if (this.aClass131_16 == null && this.aClass131_14 != null) {
						this.aClass131_14.anInterface18_3 = null;
					}
					if (this.aClass131_16 != null) {
						this.aClass131_16.anInterface18_3 = null;
						return;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local259 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static541.aBoolean680) {
					local402 = Static541.anInt8831 * arg7[3] + arg7[0] * Static538.anInt8792 + arg7[6] * Static211.anInt8103 + 8192 >> 14;
					local420 = Static538.anInt8792 * arg7[1] + Static541.anInt8831 * arg7[4] + arg7[7] * Static211.anInt8103 + 8192 >> 14;
					local420 += local53;
					local653 = arg7[8] * Static211.anInt8103 + Static538.anInt8792 * arg7[2] + Static541.anInt8831 * arg7[5] + 8192 >> 14;
					local402 += local259;
					Static538.anInt8792 = local402;
					Static541.anInt8831 = local420;
					local653 += local59;
					Static211.anInt8103 = local653;
					Static541.aBoolean680 = false;
				}
				@Pc(1002) int[] local1002 = new int[9];
				local420 = Class363.anIntArray698[arg2];
				local653 = Class363.anIntArray697[arg2];
				local662 = Class363.anIntArray698[arg3];
				local674 = Class363.anIntArray697[arg3];
				local678 = Class363.anIntArray698[arg4];
				local696 = Class363.anIntArray697[arg4];
				local1034 = local678 * local653 + 8192 >> 14;
				local1042 = local653 * local696 + 8192 >> 14;
				local1002[7] = local696 * local674 + local1034 * local662 + 8192 >> 14;
				local1002[0] = local1042 * local674 + local662 * local678 + 8192 >> 14;
				local1002[3] = local420 * local696 + 8192 >> 14;
				local1002[6] = local662 * local1042 + local678 * -local674 + 8192 >> 14;
				local1002[2] = local420 * local674 + 8192 >> 14;
				local1002[1] = -local662 * local696 + local1034 * local674 + 8192 >> 14;
				local1002[8] = local420 * local662 + 8192 >> 14;
				local1002[5] = -local653;
				local1002[4] = local420 * local678 + 8192 >> 14;
				@Pc(1170) int local1170 = -Static211.anInt8103 * local1002[2] + -Static541.anInt8831 * local1002[1] + -Static538.anInt8792 * local1002[0] + 8192 >> 14;
				local1195 = -Static211.anInt8103 * local1002[5] + -Static538.anInt8792 * local1002[3] + local1002[4] * -Static541.anInt8831 + 8192 >> 14;
				local1220 = local1002[8] * -Static211.anInt8103 + -Static541.anInt8831 * local1002[7] + -Static538.anInt8792 * local1002[6] + 8192 >> 14;
				local1225 = local1170 + Static538.anInt8792;
				@Pc(1230) int local1230 = local1195 + Static541.anInt8831;
				local1235 = local1220 + Static211.anInt8103;
				@Pc(1238) int[] local1238 = new int[9];
				for (local1240 = 0; local1240 < 3; local1240++) {
					for (local1244 = 0; local1244 < 3; local1244++) {
						local1248 = 0;
						for (local1250 = 0; local1250 < 3; local1250++) {
							local1248 += arg7[local1244 * 3 + local1250] * local1002[local1240 * 3 + local1250];
						}
						local1238[local1244 + local1240 * 3] = local1248 + 8192 >> 14;
					}
				}
				local1244 = local1002[1] * local53 + local1002[0] * local259 + local59 * local1002[2] + 8192 >> 14;
				local1248 = local1002[4] * local53 + local1002[3] * local259 + local59 * local1002[5] + 8192 >> 14;
				local1250 = local1002[6] * local259 + local53 * local1002[7] + local1002[8] * local59 + 8192 >> 14;
				local1248 += local1230;
				local1244 += local1225;
				local1250 += local1235;
				local1381 = new int[9];
				for (local1383 = 0; local1383 < 3; local1383++) {
					for (local1387 = 0; local1387 < 3; local1387++) {
						local1391 = 0;
						for (local1393 = 0; local1393 < 3; local1393++) {
							local1391 += arg7[local1393 + local1383 * 3] * local1238[local1393 * 3 + local1387];
						}
						local1381[local1387 + local1383 * 3] = local1391 + 8192 >> 14;
					}
				}
				local1387 = local1250 * arg7[2] + arg7[1] * local1248 + local1244 * arg7[0] + 8192 >> 14;
				local1391 = arg7[5] * local1250 + arg7[4] * local1248 + arg7[3] * local1244 + 8192 >> 14;
				local1387 += local31;
				local1393 = arg7[8] * local1250 + local1248 * arg7[7] + arg7[6] * local1244 + 8192 >> 14;
				local1391 += local35;
				local1393 += local41;
				for (local1519 = 0; local1519 < local8; local1519++) {
					@Pc(1525) int local1525 = arg1[local1519];
					if (local1525 < this.anIntArrayArray63.length) {
						@Pc(1539) int[] local1539 = this.anIntArrayArray63[local1525];
						for (@Pc(1541) int local1541 = 0; local1541 < local1539.length; local1541++) {
							@Pc(1547) int local1547 = local1539[local1541];
							if (this.aShortArray130 == null || (arg6 & this.aShortArray130[local1547]) != 0) {
								@Pc(1591) int local1591 = this.anIntArray657[local1547] * local1381[2] + this.anIntArray658[local1547] * local1381[1] + this.anIntArray659[local1547] * local1381[0] + 8192 >> 14;
								@Pc(1622) int local1622 = this.anIntArray657[local1547] * local1381[5] + this.anIntArray658[local1547] * local1381[4] + local1381[3] * this.anIntArray659[local1547] + 8192 >> 14;
								@Pc(1626) int local1626 = local1622 + local1391;
								@Pc(1657) int local1657 = local1381[8] * this.anIntArray657[local1547] + this.anIntArray659[local1547] * local1381[6] + this.anIntArray658[local1547] * local1381[7] + 8192 >> 14;
								@Pc(1661) int local1661 = local1591 + local1387;
								@Pc(1665) int local1665 = local1657 + local1393;
								this.anIntArray659[local1547] = local1661;
								this.anIntArray658[local1547] = local1626;
								this.anIntArray657[local1547] = local1665;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2591) Class161 local2591;
			@Pc(2596) Class281 local2596;
			if (arg0 == 5) {
				if (this.anIntArrayArray64 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray64.length) {
							local257 = this.anIntArrayArray64[local35];
							for (local259 = 0; local259 < local257.length; local259++) {
								local53 = local257[local259];
								if (this.aShortArray129 == null || (arg6 & this.aShortArray129[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray94[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray94[local53] = (byte) local59;
									if (this.aClass131_14 != null) {
										this.aClass131_14.anInterface18_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass161Array1 != null) {
						for (local35 = 0; local35 < this.anInt9053; local35++) {
							local2591 = this.aClass161Array1[local35];
							local2596 = this.aClass281Array1[local35];
							local2596.anInt7879 = 255 - (this.aByteArray94[local2591.anInt4195] & 0xFF) << 24 | local2596.anInt7879 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2852) Class281 local2852;
				if (arg0 == 8) {
					if (this.anIntArrayArray65 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray65.length > local35) {
								local257 = this.anIntArrayArray65[local35];
								for (local259 = 0; local259 < local257.length; local259++) {
									local2852 = this.aClass281Array1[local257[local259]];
									local2852.anInt7878 += arg2;
									local2852.anInt7875 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray65 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray65.length > local35) {
								local257 = this.anIntArrayArray65[local35];
								for (local259 = 0; local259 < local257.length; local259++) {
									local2852 = this.aClass281Array1[local257[local259]];
									local2852.anInt7880 = arg3 * local2852.anInt7880 >> 7;
									local2852.anInt7884 = arg2 * local2852.anInt7884 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray65 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray65.length) {
							local257 = this.anIntArrayArray65[local35];
							for (local259 = 0; local259 < local257.length; local259++) {
								local2852 = this.aClass281Array1[local257[local259]];
								local2852.anInt7883 = arg2 + local2852.anInt7883 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray64 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray64.length) {
						local257 = this.anIntArrayArray64[local35];
						for (local259 = 0; local259 < local257.length; local259++) {
							local53 = local257[local259];
							if (this.aShortArray129 == null || (this.aShortArray129[local53] & arg6) != 0) {
								local59 = this.aShortArray131[local53] & 0xFFFF;
								local402 = local59 >> 10 & 0x3F;
								local420 = local59 >> 7 & 0x7;
								@Pc(2697) int local2697 = arg2 + local402 & 0x3F;
								local420 += arg3 / 4;
								local653 = local59 & 0x7F;
								if (local420 < 0) {
									local420 = 0;
								} else if (local420 > 7) {
									local420 = 7;
								}
								local653 += arg4;
								if (local653 < 0) {
									local653 = 0;
								} else if (local653 > 127) {
									local653 = 127;
								}
								this.aShortArray131[local53] = (short) (local2697 << 10 | local420 << 7 | local653);
								if (this.aClass131_14 != null) {
									this.aClass131_14.anInterface18_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass161Array1 != null) {
					for (local35 = 0; local35 < this.anInt9053; local35++) {
						local2591 = this.aClass161Array1[local35];
						local2596 = this.aClass281Array1[local35];
						local2596.anInt7879 = local2596.anInt7879 & 0xFF000000 | Static250.anIntArray314[this.aShortArray131[local2591.anInt4195] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray63.length > local35) {
					local257 = this.anIntArrayArray63[local35];
					for (local259 = 0; local259 < local257.length; local259++) {
						local53 = local257[local259];
						if (this.aShortArray130 == null || (arg6 & this.aShortArray130[local53]) != 0) {
							this.anIntArray659[local53] -= Static538.anInt8792;
							this.anIntArray658[local53] -= Static541.anInt8831;
							this.anIntArray657[local53] -= Static211.anInt8103;
							this.anIntArray659[local53] = this.anIntArray659[local53] * arg2 >> 7;
							this.anIntArray658[local53] = this.anIntArray658[local53] * arg3 >> 7;
							this.anIntArray657[local53] = arg4 * this.anIntArray657[local53] >> 7;
							this.anIntArray659[local53] += Static538.anInt8792;
							this.anIntArray658[local53] += Static541.anInt8831;
							this.anIntArray657[local53] += Static211.anInt8103;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local259 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static541.aBoolean680) {
				local402 = arg7[3] * Static541.anInt8831 + Static538.anInt8792 * arg7[0] + Static211.anInt8103 * arg7[6] + 8192 >> 14;
				local420 = Static538.anInt8792 * arg7[1] + arg7[4] * Static541.anInt8831 + Static211.anInt8103 * arg7[7] + 8192 >> 14;
				local420 += local53;
				local402 += local259;
				local653 = Static541.anInt8831 * arg7[5] + Static538.anInt8792 * arg7[2] + Static211.anInt8103 * arg7[8] + 8192 >> 14;
				local653 += local59;
				Static538.anInt8792 = local402;
				Static541.anInt8831 = local420;
				Static541.aBoolean680 = false;
				Static211.anInt8103 = local653;
			}
			local402 = arg2 << 15 >> 7;
			local420 = arg3 << 15 >> 7;
			local653 = arg4 << 15 >> 7;
			local662 = local402 * -Static538.anInt8792 + 8192 >> 14;
			local674 = -Static541.anInt8831 * local420 + 8192 >> 14;
			local678 = local653 * -Static211.anInt8103 + 8192 >> 14;
			local696 = Static538.anInt8792 + local662;
			local1034 = Static541.anInt8831 + local674;
			local1042 = Static211.anInt8103 + local678;
			@Pc(1886) int[] local1886 = new int[] { local402 * arg7[0] + 8192 >> 14, arg7[3] * local402 + 8192 >> 14, arg7[6] * local402 + 8192 >> 14, arg7[1] * local420 + 8192 >> 14, local420 * arg7[4] + 8192 >> 14, local420 * arg7[7] + 8192 >> 14, arg7[2] * local653 + 8192 >> 14, arg7[5] * local653 + 8192 >> 14, local653 * arg7[8] + 8192 >> 14 };
			local1195 = local259 * local402 + 8192 >> 14;
			local1220 = local53 * local420 + 8192 >> 14;
			@Pc(2014) int local2014 = local1220 + local1034;
			local1225 = local59 * local653 + 8192 >> 14;
			@Pc(2026) int local2026 = local1195 + local696;
			@Pc(2030) int local2030 = local1225 + local1042;
			@Pc(2033) int[] local2033 = new int[9];
			@Pc(2039) int local2039;
			for (local1235 = 0; local1235 < 3; local1235++) {
				for (local2039 = 0; local2039 < 3; local2039++) {
					local1240 = 0;
					for (local1244 = 0; local1244 < 3; local1244++) {
						local1240 += local1886[local1244 * 3 + local2039] * arg7[local1244 + local1235 * 3];
					}
					local2033[local1235 * 3 + local2039] = local1240 + 8192 >> 14;
				}
			}
			local2039 = local2026 * arg7[0] + local2014 * arg7[1] + arg7[2] * local2030 + 8192 >> 14;
			local1240 = arg7[3] * local2026 + arg7[4] * local2014 + local2030 * arg7[5] + 8192 >> 14;
			local2039 += local31;
			local1240 += local35;
			local1244 = local2030 * arg7[8] + local2026 * arg7[6] + arg7[7] * local2014 + 8192 >> 14;
			local1244 += local41;
			for (local1248 = 0; local1248 < local8; local1248++) {
				local1250 = arg1[local1248];
				if (this.anIntArrayArray63.length > local1250) {
					local1381 = this.anIntArrayArray63[local1250];
					for (local1383 = 0; local1383 < local1381.length; local1383++) {
						local1387 = local1381[local1383];
						if (this.aShortArray130 == null || (this.aShortArray130[local1387] & arg6) != 0) {
							local1391 = local2033[2] * this.anIntArray657[local1387] + this.anIntArray659[local1387] * local2033[0] + local2033[1] * this.anIntArray658[local1387] + 8192 >> 14;
							local1393 = this.anIntArray657[local1387] * local2033[5] + local2033[3] * this.anIntArray659[local1387] + local2033[4] * this.anIntArray658[local1387] + 8192 >> 14;
							@Pc(2275) int local2275 = local1391 + local2039;
							local1519 = this.anIntArray658[local1387] * local2033[7] + local2033[6] * this.anIntArray659[local1387] + local2033[8] * this.anIntArray657[local1387] + 8192 >> 14;
							@Pc(2311) int local2311 = local1393 + local1240;
							@Pc(2315) int local2315 = local1519 + local1244;
							this.anIntArray659[local1387] = local2275;
							this.anIntArray658[local1387] = local2311;
							this.anIntArray657[local1387] = local2315;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9062; local7++) {
			this.anIntArray659[local7] = this.anIntArray659[local7] + 7 >> 4;
			this.anIntArray658[local7] = this.anIntArray658[local7] + 7 >> 4;
			this.anIntArray657[local7] = this.anIntArray657[local7] + 7 >> 4;
		}
		this.aBoolean693 = false;
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort103 = (short) arg0;
		if (this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
		if (this.aClass131_16 != null) {
			this.aClass131_16.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class363.anIntArray697[arg0];
		@Pc(13) int local13 = Class363.anIntArray698[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9102; local15++) {
			local34 = this.anIntArray657[local15] * local9 + local13 * this.anIntArray659[local15] >> 14;
			this.anIntArray657[local15] = this.anIntArray657[local15] * local13 - local9 * this.anIntArray659[local15] >> 14;
			this.anIntArray659[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt9100; local34++) {
			@Pc(84) int local84 = local13 * this.aShortArray136[local34] + this.aShortArray132[local34] * local9 >> 14;
			this.aShortArray132[local34] = (short) (this.aShortArray132[local34] * local13 - local9 * this.aShortArray136[local34] >> 14);
			this.aShortArray136[local34] = (short) local84;
		}
		if (this.aClass131_16 == null && this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
		if (this.aClass131_16 != null) {
			this.aClass131_16.anInterface18_3 = null;
		}
		this.aBoolean693 = false;
		if (this.aClass131_13 != null) {
			this.aClass131_13.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt9091; local3++) {
			local12 = this.aShortArray131[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local42 += arg3 * (arg2 - local42) >> 7;
			}
			this.aShortArray131[local3] = (short) (local42 | local18 << 10 | local24 << 7);
		}
		if (this.aClass161Array1 != null) {
			for (local12 = 0; local12 < this.anInt9053; local12++) {
				@Pc(105) Class161 local105 = this.aClass161Array1[local12];
				@Pc(110) Class281 local110 = this.aClass281Array1[local12];
				local110.anInt7879 = local110.anInt7879 & 0xFF000000 | Static250.anIntArray314[this.aShortArray131[local105.anInt4195] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!vaa;BZLclient!vaa;IZ)Lclient!da;")
	private Class66 method7578(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class66_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg2.aByte113 = 0;
		arg2.anInt9053 = this.anInt9053;
		arg2.anInt9103 = this.anInt9103;
		arg2.anInt9062 = this.anInt9062;
		arg2.aShort99 = this.aShort99;
		arg2.anInt9102 = this.anInt9102;
		arg2.anInt9091 = this.anInt9091;
		arg2.anInt9042 = this.anInt9042;
		arg2.anInt9100 = this.anInt9100;
		arg2.aShort103 = this.aShort103;
		arg2.anInt9071 = arg3;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean694 = this.aBoolean694;
		} else {
			arg2.aBoolean694 = true;
		}
		@Pc(69) boolean local69 = Static95.method1481(arg3, this.anInt9042);
		@Pc(75) boolean local75 = Static80.method1266(this.anInt9042, arg3);
		@Pc(81) boolean local81 = Static91.method1445(arg3, this.anInt9042);
		@Pc(87) boolean local87 = local81 | local69 | local75;
		@Pc(188) int local188;
		if (local87) {
			if (!local69) {
				arg2.anIntArray659 = this.anIntArray659;
			} else if (arg0.anIntArray659 == null || arg0.anIntArray659.length < this.anInt9062) {
				arg2.anIntArray659 = arg0.anIntArray659 = new int[this.anInt9062];
			} else {
				arg2.anIntArray659 = arg0.anIntArray659;
			}
			if (!local75) {
				arg2.anIntArray658 = this.anIntArray658;
			} else if (arg0.anIntArray658 == null || arg0.anIntArray658.length < this.anInt9062) {
				arg2.anIntArray658 = arg0.anIntArray658 = new int[this.anInt9062];
			} else {
				arg2.anIntArray658 = arg0.anIntArray658;
			}
			if (!local81) {
				arg2.anIntArray657 = this.anIntArray657;
			} else if (arg0.anIntArray657 == null || this.anInt9062 > arg0.anIntArray657.length) {
				arg2.anIntArray657 = arg0.anIntArray657 = new int[this.anInt9062];
			} else {
				arg2.anIntArray657 = arg0.anIntArray657;
			}
			for (local188 = 0; local188 < this.anInt9062; local188++) {
				if (local69) {
					arg2.anIntArray659[local188] = this.anIntArray659[local188];
				}
				if (local75) {
					arg2.anIntArray658[local188] = this.anIntArray658[local188];
				}
				if (local81) {
					arg2.anIntArray657[local188] = this.anIntArray657[local188];
				}
			}
		} else {
			arg2.anIntArray658 = this.anIntArray658;
			arg2.anIntArray657 = this.anIntArray657;
			arg2.anIntArray659 = this.anIntArray659;
		}
		if (Static222.method3494(arg3, this.anInt9042)) {
			if (arg4) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x1);
			}
			arg2.aClass131_13 = arg0.aClass131_13;
			arg2.aClass131_13.aByte46 = this.aClass131_13.aByte46;
			arg2.aClass131_13.anInterface18_3 = this.aClass131_13.anInterface18_3;
		} else if (Static149.method2444(arg3, this.anInt9042)) {
			arg2.aClass131_13 = this.aClass131_13;
		} else {
			arg2.aClass131_13 = null;
		}
		if (Static513.method7130(arg3, this.anInt9042)) {
			if (arg0.aShortArray131 == null || this.anInt9091 > arg0.aShortArray131.length) {
				arg2.aShortArray131 = arg0.aShortArray131 = new short[this.anInt9091];
			} else {
				arg2.aShortArray131 = arg0.aShortArray131;
			}
			for (local188 = 0; local188 < this.anInt9091; local188++) {
				arg2.aShortArray131[local188] = this.aShortArray131[local188];
			}
		} else {
			arg2.aShortArray131 = this.aShortArray131;
		}
		if (Static24.method442(this.anInt9042, arg3)) {
			if (arg0.aByteArray94 == null || arg0.aByteArray94.length < this.anInt9091) {
				arg2.aByteArray94 = arg0.aByteArray94 = new byte[this.anInt9091];
			} else {
				arg2.aByteArray94 = arg0.aByteArray94;
			}
			for (local188 = 0; local188 < this.anInt9091; local188++) {
				arg2.aByteArray94[local188] = this.aByteArray94[local188];
			}
		} else {
			arg2.aByteArray94 = this.aByteArray94;
		}
		if (Static282.method4203(arg3, this.anInt9042)) {
			arg2.aClass131_14 = arg0.aClass131_14;
			if (arg4) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x2);
			}
			arg2.aClass131_14.aByte46 = this.aClass131_14.aByte46;
			arg2.aClass131_14.anInterface18_3 = this.aClass131_14.anInterface18_3;
		} else if (Static530.method7283(this.anInt9042, arg3)) {
			arg2.aClass131_14 = this.aClass131_14;
		} else {
			arg2.aClass131_14 = null;
		}
		@Pc(539) int local539;
		if (Static421.method6463(this.anInt9042, arg3)) {
			if (arg0.aShortArray136 == null || this.anInt9100 > arg0.aShortArray136.length) {
				local188 = this.anInt9100;
				arg2.aShortArray136 = arg0.aShortArray136 = new short[local188];
				arg2.aShortArray134 = arg0.aShortArray134 = new short[local188];
				arg2.aShortArray132 = arg0.aShortArray132 = new short[local188];
			} else {
				arg2.aShortArray136 = arg0.aShortArray136;
				arg2.aShortArray134 = arg0.aShortArray134;
				arg2.aShortArray132 = arg0.aShortArray132;
			}
			if (this.aClass163_1 == null) {
				for (local188 = 0; local188 < this.anInt9100; local188++) {
					arg2.aShortArray136[local188] = this.aShortArray136[local188];
					arg2.aShortArray134[local188] = this.aShortArray134[local188];
					arg2.aShortArray132[local188] = this.aShortArray132[local188];
				}
			} else {
				if (arg0.aClass163_1 == null) {
					arg0.aClass163_1 = new Class163();
				}
				@Pc(523) Class163 local523 = arg2.aClass163_1 = arg0.aClass163_1;
				if (local523.aShortArray72 == null || this.anInt9100 > local523.aShortArray72.length) {
					local539 = this.anInt9100;
					local523.aShortArray70 = new short[local539];
					local523.aByteArray50 = new byte[local539];
					local523.aShortArray71 = new short[local539];
					local523.aShortArray72 = new short[local539];
				}
				for (local539 = 0; local539 < this.anInt9100; local539++) {
					arg2.aShortArray136[local539] = this.aShortArray136[local539];
					arg2.aShortArray134[local539] = this.aShortArray134[local539];
					arg2.aShortArray132[local539] = this.aShortArray132[local539];
					local523.aShortArray72[local539] = this.aClass163_1.aShortArray72[local539];
					local523.aShortArray71[local539] = this.aClass163_1.aShortArray71[local539];
					local523.aShortArray70[local539] = this.aClass163_1.aShortArray70[local539];
					local523.aByteArray50[local539] = this.aClass163_1.aByteArray50[local539];
				}
			}
			arg2.aByteArray95 = this.aByteArray95;
		} else {
			arg2.aShortArray134 = this.aShortArray134;
			arg2.aShortArray136 = this.aShortArray136;
			arg2.aClass163_1 = this.aClass163_1;
			arg2.aShortArray132 = this.aShortArray132;
			arg2.aByteArray95 = this.aByteArray95;
		}
		if (Static128.method2156(arg3, this.anInt9042)) {
			arg2.aClass131_16 = arg0.aClass131_16;
			if (arg4) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x4);
			}
			arg2.aClass131_16.aByte46 = this.aClass131_16.aByte46;
			arg2.aClass131_16.anInterface18_3 = this.aClass131_16.anInterface18_3;
		} else if (Static512.method7100(this.anInt9042, arg3)) {
			arg2.aClass131_16 = this.aClass131_16;
		} else {
			arg2.aClass131_16 = null;
		}
		if (Static110.method1655(arg3, this.anInt9042)) {
			if (arg0.aFloatArray68 == null || this.anInt9091 > arg0.aFloatArray68.length) {
				local188 = this.anInt9100;
				arg2.aFloatArray68 = arg0.aFloatArray68 = new float[local188];
				arg2.aFloatArray69 = arg0.aFloatArray69 = new float[local188];
			} else {
				arg2.aFloatArray68 = arg0.aFloatArray68;
				arg2.aFloatArray69 = arg0.aFloatArray69;
			}
			for (local188 = 0; local188 < this.anInt9100; local188++) {
				arg2.aFloatArray68[local188] = this.aFloatArray68[local188];
				arg2.aFloatArray69[local188] = this.aFloatArray69[local188];
			}
		} else {
			arg2.aFloatArray68 = this.aFloatArray68;
			arg2.aFloatArray69 = this.aFloatArray69;
		}
		if (Static357.method5304(this.anInt9042, arg3)) {
			if (arg4) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x8);
			}
			arg2.aClass131_15 = arg0.aClass131_15;
			arg2.aClass131_15.aByte46 = this.aClass131_15.aByte46;
			arg2.aClass131_15.anInterface18_3 = this.aClass131_15.anInterface18_3;
		} else if (Static59.method959(this.anInt9042, arg3)) {
			arg2.aClass131_15 = this.aClass131_15;
		} else {
			arg2.aClass131_15 = null;
		}
		if (Static222.method3495(arg3, this.anInt9042)) {
			if (arg0.aShortArray128 == null || this.anInt9091 > arg0.aShortArray128.length) {
				local188 = this.anInt9091;
				arg2.lb = arg0.lb = new short[local188];
				arg2.aShortArray135 = arg0.aShortArray135 = new short[local188];
				arg2.aShortArray128 = arg0.aShortArray128 = new short[local188];
			} else {
				arg2.aShortArray128 = arg0.aShortArray128;
				arg2.lb = arg0.lb;
				arg2.aShortArray135 = arg0.aShortArray135;
			}
			for (local188 = 0; local188 < this.anInt9091; local188++) {
				arg2.aShortArray128[local188] = this.aShortArray128[local188];
				arg2.aShortArray135[local188] = this.aShortArray135[local188];
				arg2.lb[local188] = this.lb[local188];
			}
		} else {
			arg2.lb = this.lb;
			arg2.aShortArray135 = this.aShortArray135;
			arg2.aShortArray128 = this.aShortArray128;
		}
		if (Static433.method6129(this.anInt9042, arg3)) {
			arg2.aClass95_1 = arg0.aClass95_1;
			if (arg4) {
				arg2.aByte113 = (byte) (arg2.aByte113 | 0x10);
			}
			arg2.aClass95_1.anInterface3_2 = this.aClass95_1.anInterface3_2;
		} else if (Static419.method5470(arg3, this.anInt9042)) {
			arg2.aClass95_1 = this.aClass95_1;
		} else {
			arg2.aClass95_1 = null;
		}
		if (Static101.method1511(arg3, this.anInt9042)) {
			if (arg0.aShortArray133 == null || this.anInt9091 > arg0.aShortArray133.length) {
				local188 = this.anInt9091;
				arg2.aShortArray133 = arg0.aShortArray133 = new short[local188];
			} else {
				arg2.aShortArray133 = arg0.aShortArray133;
			}
			for (local188 = 0; local188 < this.anInt9091; local188++) {
				arg2.aShortArray133[local188] = this.aShortArray133[local188];
			}
		} else {
			arg2.aShortArray133 = this.aShortArray133;
		}
		if (!Static260.method4038(arg3, this.anInt9042)) {
			arg2.aClass281Array1 = this.aClass281Array1;
		} else if (arg0.aClass281Array1 == null || this.anInt9053 > arg0.aClass281Array1.length) {
			local188 = this.anInt9053;
			arg2.aClass281Array1 = arg0.aClass281Array1 = new Class281[local188];
			for (local539 = 0; local539 < this.anInt9053; local539++) {
				arg2.aClass281Array1[local539] = this.aClass281Array1[local539].method6469();
			}
		} else {
			arg2.aClass281Array1 = arg0.aClass281Array1;
			for (local188 = 0; local188 < this.anInt9053; local188++) {
				arg2.aClass281Array1[local188].method6471(this.aClass281Array1[local188]);
			}
		}
		arg2.anIntArrayArray65 = this.anIntArrayArray65;
		if (this.aBoolean693) {
			arg2.aShort106 = this.aShort106;
			arg2.aShort105 = this.aShort105;
			arg2.aShort102 = this.aShort102;
			arg2.aShort104 = this.aShort104;
			arg2.aShort101 = this.aShort101;
			arg2.aShort107 = this.aShort107;
			arg2.aShort108 = this.aShort108;
			arg2.aBoolean693 = true;
			arg2.aShort100 = this.aShort100;
		} else {
			arg2.aBoolean693 = false;
		}
		arg2.anIntArray660 = this.anIntArray660;
		arg2.aClass139Array5 = this.aClass139Array5;
		arg2.aShortArray127 = this.aShortArray127;
		arg2.aShortArray130 = this.aShortArray130;
		arg2.anIntArrayArray63 = this.anIntArrayArray63;
		arg2.aClass270Array5 = this.aClass270Array5;
		arg2.anIntArray656 = this.anIntArray656;
		arg2.aShortArray129 = this.aShortArray129;
		arg2.aClass161Array1 = this.aClass161Array1;
		arg2.anIntArrayArray64 = this.anIntArrayArray64;
		return arg2;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!q;Lclient!pba;II)V")
	@Override
	public void method7556(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9100 == 0) {
			return;
		}
		@Pc(13) Class68_Sub1 local13 = this.aClass100_Sub3_40.aClass68_Sub1_3;
		if (!this.aBoolean693) {
			this.method7575();
		}
		@Pc(22) Class68_Sub1 local22 = (Class68_Sub1) arg0;
		Static244.aFloat136 = local22.aFloat36 * local13.aFloat33 + local22.aFloat42 * local13.aFloat38 + local13.aFloat44 * local22.aFloat33;
		Static445.aFloat232 = local22.aFloat35 * local13.aFloat44 + local13.aFloat33 * local22.aFloat39 + local22.aFloat43 * local13.aFloat38 + local13.aFloat35;
		@Pc(69) float local69 = Static244.aFloat136 * (float) this.aShort101 + Static445.aFloat232;
		@Pc(77) float local77 = (float) this.aShort102 * Static244.aFloat136 + Static445.aFloat232;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local93 = (float) -this.aShort104 + local77;
			local87 = (float) this.aShort104 + local69;
		} else {
			local87 = (float) this.aShort104 + local77;
			local93 = local69 - (float) this.aShort104;
		}
		if (local93 >= this.aClass100_Sub3_40.aFloat227 || local87 <= (float) this.aClass100_Sub3_40.anInt7688) {
			return;
		}
		Static331.aFloat179 = local22.aFloat42 * local13.aFloat41 + local22.aFloat36 * local13.aFloat42 + local22.aFloat33 * local13.aFloat40;
		Static138.aFloat95 = local13.aFloat43 + local22.aFloat35 * local13.aFloat40 + local13.aFloat41 * local22.aFloat43 + local22.aFloat39 * local13.aFloat42;
		@Pc(170) float local170 = (float) this.aShort101 * Static331.aFloat179 + Static138.aFloat95;
		@Pc(178) float local178 = (float) this.aShort102 * Static331.aFloat179 + Static138.aFloat95;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = ((float) this.aShort104 + local170) * (float) this.aClass100_Sub3_40.anInt7694;
			local204 = (float) this.aClass100_Sub3_40.anInt7694 * (local178 - (float) this.aShort104);
		} else {
			local204 = (float) this.aClass100_Sub3_40.anInt7694 * ((float) -this.aShort104 + local170);
			local193 = ((float) this.aShort104 + local178) * (float) this.aClass100_Sub3_40.anInt7694;
		}
		if (local204 / (float) arg2 >= this.aClass100_Sub3_40.aFloat225 || this.aClass100_Sub3_40.aFloat231 >= local193 / (float) arg2) {
			return;
		}
		Static412.aFloat12 = local13.aFloat36 * local22.aFloat36 + local13.aFloat37 * local22.aFloat42 + local22.aFloat33 * local13.aFloat34;
		Static412.aFloat14 = local22.aFloat39 * local13.aFloat36 + local13.aFloat37 * local22.aFloat43 + local22.aFloat35 * local13.aFloat34 + local13.aFloat39;
		@Pc(296) float local296 = (float) this.aShort101 * Static412.aFloat12 + Static412.aFloat14;
		@Pc(304) float local304 = Static412.aFloat14 + Static412.aFloat12 * (float) this.aShort102;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local331 = (float) this.aClass100_Sub3_40.anInt7695 * (local304 - (float) this.aShort104);
			local319 = ((float) this.aShort104 + local296) * (float) this.aClass100_Sub3_40.anInt7695;
		} else {
			local319 = (float) this.aClass100_Sub3_40.anInt7695 * (local304 + (float) this.aShort104);
			local331 = (float) this.aClass100_Sub3_40.anInt7695 * ((float) -this.aShort104 + local296);
		}
		if (this.aClass100_Sub3_40.aFloat222 <= local331 / (float) arg2 || local319 / (float) arg2 <= this.aClass100_Sub3_40.aFloat224) {
			return;
		}
		if (arg1 != null || this.aClass161Array1 != null) {
			Static317.aFloat168 = local22.aFloat40 * local13.aFloat41 + local13.aFloat42 * local22.aFloat34 + local13.aFloat40 * local22.aFloat44;
			Static343.aFloat146 = local13.aFloat37 * local22.aFloat40 + local22.aFloat34 * local13.aFloat36 + local13.aFloat34 * local22.aFloat44;
			Static55.aFloat121 = local22.aFloat37 * local13.aFloat36 + local22.aFloat41 * local13.aFloat37 + local22.aFloat38 * local13.aFloat34;
			Static163.aFloat118 = local22.aFloat41 * local13.aFloat38 + local13.aFloat33 * local22.aFloat37 + local22.aFloat38 * local13.aFloat44;
			Static340.aFloat192 = local13.aFloat44 * local22.aFloat44 + local22.aFloat40 * local13.aFloat38 + local22.aFloat34 * local13.aFloat33;
			Static35.aFloat19 = local13.aFloat40 * local22.aFloat38 + local13.aFloat41 * local22.aFloat41 + local22.aFloat37 * local13.aFloat42;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort107 + this.aShort105 >> 1;
			@Pc(506) int local506 = this.aShort106 + this.aShort100 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static317.aFloat168 + Static331.aFloat179 * (float) this.aShort101 + Static35.aFloat19 * (float) local498 + Static138.aFloat95);
			@Pc(544) int local544 = (int) ((float) local506 * Static343.aFloat146 + (float) local498 * Static55.aFloat121 + Static412.aFloat14 + Static412.aFloat12 * (float) this.aShort101);
			@Pc(563) int local563 = (int) (Static340.aFloat192 * (float) local506 + (float) this.aShort101 * Static244.aFloat136 + Static445.aFloat232 + Static163.aFloat118 * (float) local498);
			@Pc(582) int local582 = (int) ((float) this.aShort102 * Static331.aFloat179 + Static35.aFloat19 * (float) local498 + Static138.aFloat95 + (float) local506 * Static317.aFloat168);
			@Pc(601) int local601 = (int) (Static343.aFloat146 * (float) local506 + Static412.aFloat14 + Static55.aFloat121 * (float) local498 + Static412.aFloat12 * (float) this.aShort102);
			arg1.anInt6923 = this.aClass100_Sub3_40.anInt7695 * local601 / arg2 + this.aClass100_Sub3_40.anInt7693;
			arg1.anInt6922 = local544 * this.aClass100_Sub3_40.anInt7695 / arg2 + this.aClass100_Sub3_40.anInt7693;
			arg1.anInt6925 = this.aClass100_Sub3_40.anInt7694 * local525 / arg2 + this.aClass100_Sub3_40.anInt7697;
			@Pc(659) int local659 = (int) (Static445.aFloat232 + Static163.aFloat118 * (float) local498 + (float) this.aShort102 * Static244.aFloat136 + Static340.aFloat192 * (float) local506);
			arg1.anInt6926 = this.aClass100_Sub3_40.anInt7697 + local582 * this.aClass100_Sub3_40.anInt7694 / arg2;
			if (this.aClass100_Sub3_40.anInt7688 <= local563 || local659 >= this.aClass100_Sub3_40.anInt7688) {
				arg1.aBoolean539 = true;
				arg1.anInt6924 = this.aClass100_Sub3_40.anInt7694 * (this.aShort104 + local525) / arg2 + this.aClass100_Sub3_40.anInt7697 - arg1.anInt6925;
			}
		}
		this.aClass100_Sub3_40.method6294((float) arg2);
		this.aClass100_Sub3_40.method6267();
		this.aClass100_Sub3_40.method6329(local22);
		this.method7569();
		this.aClass100_Sub3_40.method6291();
		this.method7567();
	}

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean693) {
			this.method7575();
		}
		return this.aShort102;
	}

	@OriginalMember(owner = "client!vaa", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort99 = (short) arg0;
		if (this.aClass131_14 != null) {
			this.aClass131_14.anInterface18_3 = null;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub3_Sub6 S(@OriginalArg(0) Class2_Sub3_Sub6 arg0) {
		if (this.anInt9100 == 0) {
			return null;
		}
		if (!this.aBoolean693) {
			this.method7575();
		}
		@Pc(39) int local39;
		@Pc(55) int local55;
		if (this.aClass100_Sub3_40.anInt7701 > 0) {
			local39 = this.aShort105 - (this.aShort102 * this.aClass100_Sub3_40.anInt7701 >> 8) >> this.aClass100_Sub3_40.anInt7665;
			local55 = this.aShort107 - (this.aClass100_Sub3_40.anInt7701 * this.aShort101 >> 8) >> this.aClass100_Sub3_40.anInt7665;
		} else {
			local39 = this.aShort105 - (this.aClass100_Sub3_40.anInt7701 * this.aShort101 >> 8) >> this.aClass100_Sub3_40.anInt7665;
			local55 = this.aShort107 - (this.aShort102 * this.aClass100_Sub3_40.anInt7701 >> 8) >> this.aClass100_Sub3_40.anInt7665;
		}
		@Pc(111) int local111;
		@Pc(128) int local128;
		if (this.aClass100_Sub3_40.anInt7702 > 0) {
			local111 = this.aShort100 - (this.aClass100_Sub3_40.anInt7702 * this.aShort102 >> 8) >> this.aClass100_Sub3_40.anInt7665;
			local128 = this.aShort106 - (this.aClass100_Sub3_40.anInt7702 * this.aShort101 >> 8) >> this.aClass100_Sub3_40.anInt7665;
		} else {
			local111 = this.aShort100 - (this.aShort101 * this.aClass100_Sub3_40.anInt7702 >> 8) >> this.aClass100_Sub3_40.anInt7665;
			local128 = this.aShort106 - (this.aClass100_Sub3_40.anInt7702 * this.aShort102 >> 8) >> this.aClass100_Sub3_40.anInt7665;
		}
		@Pc(171) int local171 = local55 + 1 - local39;
		@Pc(178) int local178 = local128 + 1 - local111;
		@Pc(181) Class2_Sub3_Sub6_Sub2 local181 = (Class2_Sub3_Sub6_Sub2) arg0;
		@Pc(197) Class2_Sub3_Sub6_Sub2 local197;
		if (local181 != null && local181.method7632(local178, local171)) {
			local197 = local181;
			local181.method7629();
		} else {
			local197 = new Class2_Sub3_Sub6_Sub2(this.aClass100_Sub3_40, local171, local178);
		}
		local197.method7628(local39, local111, local128, local55);
		this.method7574(local197);
		return local197;
	}
}
