import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private int anInt1518;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!ok;")
	private Class256 aClass256_1;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!ag;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt1531;

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Lclient!ep;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "Lclient!ep;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!de", name = "Hb", descriptor = "Lclient!ep;")
	private Class94 aClass94_3;

	@OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!de", name = "Pb", descriptor = "I")
	private int anInt1558;

	@OriginalMember(owner = "client!de", name = "Rb", descriptor = "I")
	private int anInt1560;

	@OriginalMember(owner = "client!de", name = "Tb", descriptor = "I")
	private int anInt1561;

	@OriginalMember(owner = "client!de", name = "Wb", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_4;

	@OriginalMember(owner = "client!de", name = "Zb", descriptor = "I")
	private int anInt1566;

	@OriginalMember(owner = "client!de", name = "dc", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!de", name = "qc", descriptor = "Lclient!ep;")
	private Class94 aClass94_4;

	@OriginalMember(owner = "client!de", name = "tc", descriptor = "I")
	private int anInt1579;

	@OriginalMember(owner = "client!de", name = "Tc", descriptor = "I")
	private int anInt1597;

	@OriginalMember(owner = "client!de", name = "Nb", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!de", name = "kc", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!de", name = "Kb", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!de", name = "Lc", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	private int anInt1514;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!de", name = "Ec", descriptor = "I")
	private int anInt1587;

	@OriginalMember(owner = "client!de", name = "hc", descriptor = "[Lclient!il;")
	private Class163[] aClass163Array3;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "[Lclient!rca;")
	private Class293[] aClass293Array3;

	@OriginalMember(owner = "client!de", name = "xc", descriptor = "I")
	private int anInt1583;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "[Lclient!mga;")
	private Class224[] aClass224Array1;

	@OriginalMember(owner = "client!de", name = "rc", descriptor = "[Lclient!nga;")
	private Class238[] aClass238Array1;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!de", name = "mb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!de", name = "yc", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!de", name = "zc", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!de", name = "Sb", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!de", name = "ec", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!de", name = "Dc", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!de", name = "Gc", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!de", name = "Bb", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!de", name = "mc", descriptor = "[F")
	private float[] aFloatArray4;

	@OriginalMember(owner = "client!de", name = "Eb", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!de", name = "Mb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!de", name = "Cb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!de", name = "Jb", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!de", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!de", name = "Mc", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!um;Lclient!ak;IIII)V")
	public Class33_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface9 local11 = arg0.anInterface9_10;
		this.anIntArray144 = new int[arg1.anInt325 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt315];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt315; local24++) {
			if ((arg1.aByteArray10 == null || arg1.aByteArray10[local24] != 2) && (arg1.aShortArray22 == null || arg1.aShortArray22[local24] == -1 || !local11.method1074(arg1.aShortArray22[local24] & 0xFFFF).aBoolean598)) {
				local22[this.anInt1573++] = local24;
				this.anIntArray144[arg1.aShortArray26[local24]]++;
				this.anIntArray144[arg1.aShortArray20[local24]]++;
				this.anIntArray144[arg1.aShortArray18[local24]]++;
			}
		}
		this.anInt1520 = this.anInt1573;
		@Pc(111) long[] local111 = new long[this.anInt1573];
		@Pc(123) boolean local123 = (this.anInt1558 & 0x100) != 0;
		@Pc(135) int local135;
		@Pc(298) int local298;
		for (@Pc(125) int local125 = 0; local125 < this.anInt1573; local125++) {
			@Pc(131) int local131 = local22[local125];
			@Pc(133) Class291 local133 = null;
			local135 = 0;
			@Pc(137) byte local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			if (arg1.aClass122Array1 != null) {
				@Pc(146) boolean local146 = false;
				for (@Pc(148) int local148 = 0; local148 < arg1.aClass122Array1.length; local148++) {
					@Pc(155) Class122 local155 = arg1.aClass122Array1[local148];
					if (local155.anInt2551 == local131) {
						@Pc(164) Class280 local164 = Static304.method4382(local155.anInt2553);
						if (local164.aBoolean569) {
							local146 = true;
						}
						if (local164.anInt6951 != -1) {
							@Pc(180) Class291 local180 = local11.method1074(local164.anInt6951);
							if (local180.aBoolean599) {
								this.aBoolean99 = true;
							}
						}
					}
				}
				if (local146) {
					local111[local125] = Long.MAX_VALUE;
					this.anInt1520--;
					continue;
				}
			}
			@Pc(208) short local208 = -1;
			if (arg1.aShortArray22 != null) {
				local208 = arg1.aShortArray22[local131];
				if (local208 != -1) {
					local133 = local11.method1074(local208 & 0xFFFF);
					local141 = local133.aByte95;
					local139 = local133.aByte96;
				}
			}
			@Pc(260) boolean local260 = arg1.aByteArray11 != null && arg1.aByteArray11[local131] != 0 || local133 != null && local133.aBoolean599 | !local133.aBoolean601;
			if ((local123 || local260) && arg1.aByteArray12 != null) {
				local135 += arg1.aByteArray12[local131] << 17;
			}
			if (local260) {
				local135 += 65536;
			}
			local135 += (local139 & 0xFF) << 8;
			local298 = local137 + ((local208 & 0xFFFF) << 16);
			local135 += local141 & 0xFF;
			@Pc(310) int local310 = local298 + (local125 & 0xFFFF);
			local111[local125] = (long) local310 + ((long) local135 << 32);
			this.aBoolean99 |= local260;
		}
		Static271.method3963(local22, local111);
		this.anIntArray141 = arg1.anIntArray35;
		this.anIntArray145 = arg1.anIntArray32;
		this.anInt1514 = arg1.anInt325;
		this.aShortArray42 = arg1.aShortArray25;
		this.anIntArray142 = arg1.anIntArray33;
		this.anInt1587 = arg1.anInt327;
		this.aClass163Array3 = arg1.aClass163Array1;
		this.aClass293Array3 = arg1.aClass293Array1;
		@Pc(371) Class45[] local371 = new Class45[this.anInt1514];
		@Pc(391) int local391;
		@Pc(405) int local405;
		if (arg1.aClass122Array1 != null) {
			this.anInt1583 = arg1.aClass122Array1.length;
			this.aClass224Array1 = new Class224[this.anInt1583];
			this.aClass238Array1 = new Class238[this.anInt1583];
			for (local391 = 0; local391 < this.anInt1583; local391++) {
				@Pc(398) Class122 local398 = arg1.aClass122Array1[local391];
				@Pc(403) Class280 local403 = Static304.method4382(local398.anInt2553);
				local405 = -1;
				for (@Pc(407) int local407 = 0; local407 < this.anInt1573; local407++) {
					if (local22[local407] == local398.anInt2551) {
						local405 = local407;
						break;
					}
				}
				if (local405 == -1) {
					throw new RuntimeException();
				}
				@Pc(452) int local452 = Static142.anIntArray365[arg1.aShortArray21[local398.anInt2551] & 0xFFFF] & 0xFFFFFF;
				@Pc(470) int local470 = local452 | 255 - (arg1.aByteArray11 == null ? 0 : arg1.aByteArray11[local398.anInt2551]) << 24;
				this.aClass224Array1[local391] = new Class224(local405, arg1.aShortArray26[local398.anInt2551], arg1.aShortArray20[local398.anInt2551], arg1.aShortArray18[local398.anInt2551], local403.anInt6954, local403.anInt6949, local403.anInt6951, local403.anInt6955, local403.anInt6956, local403.aBoolean569, local403.aBoolean570, local398.anInt2554);
				this.aClass238Array1[local391] = new Class238(local470);
			}
		}
		local391 = this.anInt1573 * 3;
		this.aShortArray40 = new short[this.anInt1573];
		this.aShortArray41 = new short[local391];
		this.aShortArray43 = new short[local391];
		if (arg1.aShortArray23 != null) {
			this.aShortArray39 = new short[this.anInt1573];
		}
		this.aShortArray47 = new short[this.anInt1573];
		this.aByteArray31 = new byte[this.anInt1573];
		this.aShort19 = (short) arg4;
		this.aFloatArray3 = new float[local391];
		this.aShortArray38 = new short[local391];
		this.aByteArray32 = new byte[local391];
		this.aShortArray48 = new short[local391];
		this.aShortArray44 = new short[this.anInt1573];
		Static466.aLongArray15 = new long[local391];
		this.aFloatArray4 = new float[local391];
		this.aShortArray45 = new short[this.anInt1573];
		this.aShortArray37 = new short[local391];
		this.aShortArray46 = new short[this.anInt1573];
		this.lb = new short[local391];
		this.aShort18 = (short) arg3;
		local135 = 0;
		for (local298 = 0; local298 < arg1.anInt325; local298++) {
			local405 = this.anIntArray144[local298];
			this.anIntArray144[local298] = local135;
			local371[local298] = new Class45();
			local135 += local405;
		}
		this.anIntArray144[arg1.anInt325] = local135;
		@Pc(651) int[] local651 = null;
		@Pc(653) int[] local653 = null;
		@Pc(655) int[] local655 = null;
		@Pc(657) float[][] local657 = null;
		@Pc(675) int[] local675;
		@Pc(683) int local683;
		@Pc(728) int local728;
		@Pc(734) int local734;
		@Pc(747) int local747;
		@Pc(749) int local749;
		@Pc(785) int local785;
		@Pc(790) int local790;
		@Pc(966) float local966;
		@Pc(957) float local957;
		@Pc(964) float local964;
		if (arg1.aByteArray7 != null) {
			@Pc(663) int local663 = arg1.anInt316;
			@Pc(666) int[] local666 = new int[local663];
			@Pc(669) int[] local669 = new int[local663];
			@Pc(672) int[] local672 = new int[local663];
			local675 = new int[local663];
			@Pc(678) int[] local678 = new int[local663];
			@Pc(681) int[] local681 = new int[local663];
			for (local683 = 0; local683 < local663; local683++) {
				local666[local683] = Integer.MAX_VALUE;
				local669[local683] = -2147483647;
				local672[local683] = Integer.MAX_VALUE;
				local675[local683] = -2147483647;
				local678[local683] = Integer.MAX_VALUE;
				local681[local683] = -2147483647;
			}
			local657 = new float[local663][];
			local651 = new int[local663];
			local653 = new int[local663];
			for (local728 = 0; local728 < this.anInt1573; local728++) {
				local734 = local22[local728];
				if (arg1.aByteArray7[local734] != -1) {
					local747 = arg1.aByteArray7[local734] & 0xFF;
					for (local749 = 0; local749 < 3; local749++) {
						@Pc(761) short local761;
						if (local749 == 0) {
							local761 = arg1.aShortArray26[local734];
						} else if (local749 == 1) {
							local761 = arg1.aShortArray20[local734];
						} else {
							local761 = arg1.aShortArray18[local734];
						}
						local785 = arg1.anIntArray33[local761];
						local790 = arg1.anIntArray32[local761];
						@Pc(795) int local795 = arg1.anIntArray35[local761];
						if (local785 < local666[local747]) {
							local666[local747] = local785;
						}
						if (local669[local747] < local785) {
							local669[local747] = local785;
						}
						if (local790 < local672[local747]) {
							local672[local747] = local790;
						}
						if (local790 > local675[local747]) {
							local675[local747] = local790;
						}
						if (local795 < local678[local747]) {
							local678[local747] = local795;
						}
						if (local795 > local681[local747]) {
							local681[local747] = local795;
						}
					}
				}
			}
			local655 = new int[local663];
			for (local734 = 0; local734 < local663; local734++) {
				@Pc(900) byte local900 = arg1.aByteArray9[local734];
				if (local900 > 0) {
					local651[local734] = (local666[local734] + local669[local734]) / 2;
					local653[local734] = (local675[local734] + local672[local734]) / 2;
					local655[local734] = (local681[local734] + local678[local734]) / 2;
					if (local900 == 1) {
						local790 = arg1.anIntArray41[local734];
						local957 = 64.0F / (float) arg1.anIntArray39[local734];
						if (local790 == 0) {
							local964 = 1.0F;
							local966 = 1.0F;
						} else if (local790 > 0) {
							local964 = (float) local790 / 1024.0F;
							local966 = 1.0F;
						} else {
							local964 = 1.0F;
							local966 = (float) -local790 / 1024.0F;
						}
					} else if (local900 == 2) {
						local966 = 64.0F / (float) arg1.anIntArray41[local734];
						local964 = 64.0F / (float) arg1.anIntArray38[local734];
						local957 = 64.0F / (float) arg1.anIntArray39[local734];
					} else {
						local957 = (float) arg1.anIntArray39[local734] / 1024.0F;
						local966 = (float) arg1.anIntArray41[local734] / 1024.0F;
						local964 = (float) arg1.anIntArray38[local734] / 1024.0F;
					}
					local657[local734] = Static459.method5948(local964, local966, arg1.aShortArray24[local734], local957, arg1.aShortArray19[local734], arg1.aShortArray27[local734], arg1.aByteArray8[local734] & 0xFF);
				}
			}
		}
		@Pc(1076) Class149[] local1076 = new Class149[arg1.anInt315];
		@Pc(1095) short local1095;
		@Pc(1106) int local1106;
		@Pc(1117) int local1117;
		for (@Pc(1078) int local1078 = 0; local1078 < arg1.anInt315; local1078++) {
			@Pc(1085) short local1085 = arg1.aShortArray26[local1078];
			@Pc(1090) short local1090 = arg1.aShortArray20[local1078];
			local1095 = arg1.aShortArray18[local1078];
			local1106 = this.anIntArray142[local1090] - this.anIntArray142[local1085];
			local1117 = this.anIntArray145[local1090] - this.anIntArray145[local1085];
			local683 = this.anIntArray141[local1090] - this.anIntArray141[local1085];
			local728 = this.anIntArray142[local1095] - this.anIntArray142[local1085];
			local734 = this.anIntArray145[local1095] - this.anIntArray145[local1085];
			local747 = this.anIntArray141[local1095] - this.anIntArray141[local1085];
			local749 = local1117 * local747 - local734 * local683;
			@Pc(1176) int local1176 = local683 * local728 - local1106 * local747;
			local785 = local734 * local1106 - local728 * local1117;
			while (local749 > 8192 || local1176 > 8192 || local785 > 8192 || local749 < -8192 || local1176 < -8192 || local785 < -8192) {
				local785 >>= 0x1;
				local1176 >>= 0x1;
				local749 >>= 0x1;
			}
			local790 = (int) Math.sqrt((double) (local1176 * local1176 + local749 * local749 + local785 * local785));
			if (local790 <= 0) {
				local790 = 1;
			}
			local785 = local785 * 256 / local790;
			local749 = local749 * 256 / local790;
			local1176 = local1176 * 256 / local790;
			@Pc(1275) byte local1275 = arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local1078];
			if (local1275 == 0) {
				@Pc(1305) Class45 local1305 = local371[local1085];
				local1305.anInt918 += local1176;
				local1305.anInt917 += local749;
				local1305.anInt915 += local785;
				local1305.anInt916++;
				@Pc(1333) Class45 local1333 = local371[local1090];
				local1333.anInt917 += local749;
				local1333.anInt918 += local1176;
				local1333.anInt915 += local785;
				local1333.anInt916++;
				@Pc(1361) Class45 local1361 = local371[local1095];
				local1361.anInt916++;
				local1361.anInt917 += local749;
				local1361.anInt915 += local785;
				local1361.anInt918 += local1176;
			} else if (local1275 == 1) {
				@Pc(1290) Class149 local1290 = local1076[local1078] = new Class149();
				local1290.anInt3067 = local785;
				local1290.anInt3065 = local1176;
				local1290.anInt3066 = local749;
			}
		}
		@Pc(1402) int local1402;
		for (@Pc(1396) int local1396 = 0; local1396 < this.anInt1573; local1396++) {
			local1402 = local22[local1396];
			@Pc(1409) int local1409 = arg1.aShortArray21[local1402] & 0xFFFF;
			@Pc(1417) short local1417;
			if (arg1.aShortArray22 == null) {
				local1417 = -1;
			} else {
				local1417 = arg1.aShortArray22[local1402];
			}
			if (arg1.aByteArray7 == null) {
				local1117 = -1;
			} else {
				local1117 = arg1.aByteArray7[local1402];
			}
			if (arg1.aByteArray11 == null) {
				local683 = 0;
			} else {
				local683 = arg1.aByteArray11[local1402] & 0xFF;
			}
			@Pc(1449) float local1449 = 0.0F;
			@Pc(1451) float local1451 = 0.0F;
			@Pc(1453) float local1453 = 0.0F;
			local966 = 0.0F;
			local957 = 0.0F;
			local964 = 0.0F;
			@Pc(1461) byte local1461 = 0;
			@Pc(1463) byte local1463 = 0;
			@Pc(1465) int local1465 = 0;
			@Pc(1500) byte local1500;
			@Pc(1517) short local1517;
			@Pc(2259) short local2259;
			@Pc(2264) short local2264;
			if (local1417 != -1) {
				if (local1117 == -1) {
					local1463 = 2;
					local966 = 1.0F;
					local1461 = 1;
					local964 = 0.0F;
					local1449 = 0.0F;
					local957 = 0.0F;
					local1453 = 1.0F;
					local1451 = 1.0F;
				} else {
					local1117 &= 0xFF;
					local1500 = arg1.aByteArray9[local1117];
					@Pc(1507) short local1507;
					@Pc(1512) short local1512;
					@Pc(1546) float local1546;
					@Pc(1759) float local1759;
					@Pc(1767) float local1767;
					@Pc(1864) float local1864;
					@Pc(1872) float local1872;
					@Pc(1880) float local1880;
					@Pc(1903) float local1903;
					@Pc(1926) float local1926;
					@Pc(1949) float local1949;
					if (local1500 == 0) {
						local1507 = arg1.aShortArray26[local1402];
						local1512 = arg1.aShortArray20[local1402];
						local1517 = arg1.aShortArray18[local1402];
						local2259 = arg1.aShortArray19[local1117];
						local2264 = arg1.aShortArray24[local1117];
						@Pc(2269) short local2269 = arg1.aShortArray27[local1117];
						@Pc(2275) float local2275 = (float) arg1.anIntArray33[local2259];
						@Pc(2281) float local2281 = (float) arg1.anIntArray32[local2259];
						local1546 = arg1.anIntArray35[local2259];
						local1759 = (float) arg1.anIntArray33[local2264] - local2275;
						local1767 = (float) arg1.anIntArray32[local2264] - local2281;
						@Pc(2314) float local2314 = (float) arg1.anIntArray35[local2264] - local1546;
						@Pc(2322) float local2322 = (float) arg1.anIntArray33[local2269] - local2275;
						@Pc(2331) float local2331 = (float) arg1.anIntArray32[local2269] - local2281;
						@Pc(2340) float local2340 = (float) arg1.anIntArray35[local2269] - local1546;
						@Pc(2348) float local2348 = (float) arg1.anIntArray33[local1507] - local2275;
						@Pc(2356) float local2356 = (float) arg1.anIntArray32[local1507] - local2281;
						@Pc(2365) float local2365 = (float) arg1.anIntArray35[local1507] - local1546;
						@Pc(2374) float local2374 = (float) arg1.anIntArray33[local1512] - local2275;
						@Pc(2383) float local2383 = (float) arg1.anIntArray32[local1512] - local2281;
						local1864 = (float) arg1.anIntArray35[local1512] - local1546;
						local1872 = (float) arg1.anIntArray33[local1517] - local2275;
						local1880 = (float) arg1.anIntArray32[local1517] - local2281;
						local1903 = (float) arg1.anIntArray35[local1517] - local1546;
						local1926 = local2340 * local1767 - local2314 * local2331;
						local1949 = local2314 * local2322 - local2340 * local1759;
						@Pc(2441) float local2441 = local1759 * local2331 - local2322 * local1767;
						@Pc(2450) float local2450 = local2441 * local2331 - local2340 * local1949;
						@Pc(2458) float local2458 = local1926 * local2340 - local2441 * local2322;
						@Pc(2466) float local2466 = local1949 * local2322 - local2331 * local1926;
						@Pc(2480) float local2480 = 1.0F / (local2466 * local2314 + local2450 * local1759 + local1767 * local2458);
						local1453 = local2480 * (local1864 * local2466 + local2374 * local2450 + local2458 * local2383);
						local957 = local2480 * (local2458 * local1880 + local2450 * local1872 + local1903 * local2466);
						local1449 = (local2356 * local2458 + local2348 * local2450 + local2365 * local2466) * local2480;
						@Pc(2530) float local2530 = local2314 * local1926 - local2441 * local1759;
						@Pc(2539) float local2539 = local1767 * local2441 - local2314 * local1949;
						@Pc(2548) float local2548 = local1949 * local1759 - local1926 * local1767;
						@Pc(2562) float local2562 = 1.0F / (local2340 * local2548 + local2331 * local2530 + local2539 * local2322);
						local1451 = (local2356 * local2530 + local2539 * local2348 + local2548 * local2365) * local2562;
						local964 = local2562 * (local2539 * local1872 + local2530 * local1880 + local2548 * local1903);
						local966 = local2562 * (local2548 * local1864 + local2539 * local2374 + local2383 * local2530);
					} else {
						local1507 = arg1.aShortArray26[local1402];
						local1512 = arg1.aShortArray20[local1402];
						local1517 = arg1.aShortArray18[local1402];
						@Pc(1521) int local1521 = local651[local1117];
						@Pc(1525) int local1525 = local653[local1117];
						@Pc(1529) int local1529 = local655[local1117];
						@Pc(1533) float[] local1533 = local657[local1117];
						@Pc(1538) byte local1538 = arg1.aByteArray6[local1117];
						local1546 = (float) arg1.anIntArray40[local1117] / 256.0F;
						if (local1500 == 1) {
							local1759 = (float) arg1.anIntArray38[local1117] / 1024.0F;
							Static459.method5949(local1533, arg1.anIntArray33[local1507], arg1.anIntArray35[local1507], local1521, local1546, local1759, local1529, local1538, local1525, arg1.anIntArray32[local1507]);
							local1451 = Static538.aFloat233;
							local1449 = Static21.aFloat9;
							Static459.method5949(local1533, arg1.anIntArray33[local1512], arg1.anIntArray35[local1512], local1521, local1546, local1759, local1529, local1538, local1525, arg1.anIntArray32[local1512]);
							local1453 = Static21.aFloat9;
							local966 = Static538.aFloat233;
							Static459.method5949(local1533, arg1.anIntArray33[local1517], arg1.anIntArray35[local1517], local1521, local1546, local1759, local1529, local1538, local1525, arg1.anIntArray32[local1517]);
							local964 = Static538.aFloat233;
							local957 = Static21.aFloat9;
							local1767 = local1759 / 2.0F;
							if ((local1538 & 0x1) == 0) {
								if (local1767 < local957 - local1449) {
									local1463 = 1;
									local957 -= local1759;
								} else if (local1767 < local1449 - local957) {
									local1463 = 2;
									local957 += local1759;
								}
								if (local1453 - local1449 > local1767) {
									local1453 -= local1759;
									local1461 = 1;
								} else if (local1767 < local1449 - local1453) {
									local1461 = 2;
									local1453 += local1759;
								}
							} else {
								if (local966 - local1451 > local1767) {
									local1461 = 1;
									local966 -= local1759;
								} else if (local1767 < local1451 - local966) {
									local1461 = 2;
									local966 += local1759;
								}
								if (local1767 < local964 - local1451) {
									local1463 = 1;
									local964 -= local1759;
								} else if (local1767 < local1451 - local964) {
									local1463 = 2;
									local964 += local1759;
								}
							}
						} else if (local1500 == 2) {
							local1759 = (float) arg1.anIntArray31[local1117] / 256.0F;
							local1767 = (float) arg1.anIntArray36[local1117] / 256.0F;
							@Pc(1778) int local1778 = arg1.anIntArray33[local1512] - arg1.anIntArray33[local1507];
							@Pc(1789) int local1789 = arg1.anIntArray32[local1512] - arg1.anIntArray32[local1507];
							@Pc(1799) int local1799 = arg1.anIntArray35[local1512] - arg1.anIntArray35[local1507];
							@Pc(1809) int local1809 = arg1.anIntArray33[local1517] - arg1.anIntArray33[local1507];
							@Pc(1820) int local1820 = arg1.anIntArray32[local1517] - arg1.anIntArray32[local1507];
							@Pc(1830) int local1830 = arg1.anIntArray35[local1517] - arg1.anIntArray35[local1507];
							@Pc(1838) int local1838 = local1830 * local1789 - local1820 * local1799;
							@Pc(1847) int local1847 = local1799 * local1809 - local1830 * local1778;
							@Pc(1856) int local1856 = local1778 * local1820 - local1809 * local1789;
							local1864 = 64.0F / (float) arg1.anIntArray41[local1117];
							local1872 = 64.0F / (float) arg1.anIntArray39[local1117];
							local1880 = 64.0F / (float) arg1.anIntArray38[local1117];
							local1903 = (local1533[1] * (float) local1847 + local1533[0] * (float) local1838 + local1533[2] * (float) local1856) / local1864;
							local1926 = ((float) local1856 * local1533[5] + (float) local1838 * local1533[3] + local1533[4] * (float) local1847) / local1872;
							local1949 = ((float) local1856 * local1533[8] + (float) local1847 * local1533[7] + (float) local1838 * local1533[6]) / local1880;
							local1465 = Static594.method7732(local1926, local1903, local1949);
							Static499.method6466(local1759, local1538, arg1.anIntArray33[local1507], arg1.anIntArray32[local1507], local1521, local1529, local1546, arg1.anIntArray35[local1507], local1767, local1533, local1465, local1525);
							local1449 = Static543.aFloat234;
							local1451 = Static341.aFloat161;
							Static499.method6466(local1759, local1538, arg1.anIntArray33[local1512], arg1.anIntArray32[local1512], local1521, local1529, local1546, arg1.anIntArray35[local1512], local1767, local1533, local1465, local1525);
							local1453 = Static543.aFloat234;
							local966 = Static341.aFloat161;
							Static499.method6466(local1759, local1538, arg1.anIntArray33[local1517], arg1.anIntArray32[local1517], local1521, local1529, local1546, arg1.anIntArray35[local1517], local1767, local1533, local1465, local1525);
							local964 = Static341.aFloat161;
							local957 = Static543.aFloat234;
						} else if (local1500 == 3) {
							Static497.method6441(local1521, local1525, local1529, arg1.anIntArray35[local1507], local1546, arg1.anIntArray32[local1507], arg1.anIntArray33[local1507], local1538, local1533);
							local1449 = Static78.aFloat32;
							local1451 = Static584.aFloat242;
							Static497.method6441(local1521, local1525, local1529, arg1.anIntArray35[local1512], local1546, arg1.anIntArray32[local1512], arg1.anIntArray33[local1512], local1538, local1533);
							local1453 = Static78.aFloat32;
							local966 = Static584.aFloat242;
							Static497.method6441(local1521, local1525, local1529, arg1.anIntArray35[local1517], local1546, arg1.anIntArray32[local1517], arg1.anIntArray33[local1517], local1538, local1533);
							local957 = Static78.aFloat32;
							local964 = Static584.aFloat242;
							if ((local1538 & 0x1) == 0) {
								if (local957 - local1449 > 0.5F) {
									local957--;
									local1463 = 1;
								} else if (local1449 - local957 > 0.5F) {
									local957++;
									local1463 = 2;
								}
								if (local1453 - local1449 > 0.5F) {
									local1461 = 1;
									local1453--;
								} else if (local1449 - local1453 > 0.5F) {
									local1453++;
									local1461 = 2;
								}
							} else {
								if (local964 - local1451 > 0.5F) {
									local1463 = 1;
									local964--;
								} else if (local1451 - local964 > 0.5F) {
									local964++;
									local1463 = 2;
								}
								if (local966 - local1451 > 0.5F) {
									local1461 = 1;
									local966--;
								} else if (local1451 - local966 > 0.5F) {
									local966++;
									local1461 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray10 == null) {
				local1500 = 0;
			} else {
				local1500 = arg1.aByteArray10[local1402];
			}
			if (local1500 == 0) {
				@Pc(2770) long local2770 = ((long) local683 + (long) (local1409 << 8) + (long) (local1465 << 24) << 32) + (long) (local1117 << 2);
				local1517 = arg1.aShortArray26[local1402];
				local2259 = arg1.aShortArray20[local1402];
				local2264 = arg1.aShortArray18[local1402];
				@Pc(2789) Class45 local2789 = local371[local1517];
				this.aShortArray46[local1396] = this.method1348(local1449, local2789.anInt918, arg1, local2789.anInt915, local1396, local2789.anInt917, local2770, local1517, local2789.anInt916, local1451);
				@Pc(2814) Class45 local2814 = local371[local2259];
				this.aShortArray40[local1396] = this.method1348(local1453, local2814.anInt918, arg1, local2814.anInt915, local1396, local2814.anInt917, local2770 + (long) local1461, local2259, local2814.anInt916, local966);
				@Pc(2842) Class45 local2842 = local371[local2264];
				this.aShortArray45[local1396] = this.method1348(local957, local2842.anInt918, arg1, local2842.anInt915, local1396, local2842.anInt917, local2770 + (long) local1463, local2264, local2842.anInt916, local964);
			} else if (local1500 == 1) {
				@Pc(2630) Class149 local2630 = local1076[local1402];
				@Pc(2673) long local2673 = (long) ((local2630.anInt3067 + 256 << 22) + (local2630.anInt3066 > 0 ? 1024 : 2048) + (local1117 << 2) + (local2630.anInt3065 + 256 << 12)) + ((long) (local1409 << 8) + (long) (local1465 << 24) + (long) local683 << 32);
				this.aShortArray46[local1396] = this.method1348(local1449, local2630.anInt3065, arg1, local2630.anInt3067, local1396, local2630.anInt3066, local2673, arg1.aShortArray26[local1402], 0, local1451);
				this.aShortArray40[local1396] = this.method1348(local1453, local2630.anInt3065, arg1, local2630.anInt3067, local1396, local2630.anInt3066, local2673 + (long) local1461, arg1.aShortArray20[local1402], 0, local966);
				this.aShortArray45[local1396] = this.method1348(local957, local2630.anInt3065, arg1, local2630.anInt3067, local1396, local2630.anInt3066, local2673 + (long) local1463, arg1.aShortArray18[local1402], 0, local964);
			}
			if (arg1.aShortArray22 == null) {
				this.aShortArray47[local1396] = -1;
			} else {
				this.aShortArray47[local1396] = arg1.aShortArray22[local1402];
			}
			if (arg1.aByteArray11 != null) {
				this.aByteArray31[local1396] = arg1.aByteArray11[local1402];
			}
			if (arg1.aShortArray23 != null) {
				this.aShortArray39[local1396] = arg1.aShortArray23[local1402];
			}
			this.aShortArray44[local1396] = arg1.aShortArray21[local1402];
		}
		if (this.anInt1520 > 0) {
			local1402 = 1;
			local1095 = this.aShortArray47[0];
			for (local1106 = 0; local1106 < this.anInt1520; local1106++) {
				@Pc(2945) short local2945 = this.aShortArray47[local1106];
				if (local1095 != local2945) {
					local1095 = local2945;
					local1402++;
				}
			}
			this.anIntArray143 = new int[local1402];
			this.anIntArray139 = new int[local1402];
			this.anIntArray140 = new int[local1402 + 1];
			this.anIntArray140[0] = 0;
			local1117 = this.anInt1518;
			@Pc(2984) short local2984 = 0;
			local1095 = this.aShortArray47[0];
			local1402 = 0;
			for (local728 = 0; local728 < this.anInt1520; local728++) {
				@Pc(3000) short local3000 = this.aShortArray47[local728];
				if (local3000 != local1095) {
					this.anIntArray139[local1402] = local1117;
					this.anIntArray143[local1402] = local2984 + 1 - local1117;
					local1402++;
					this.anIntArray140[local1402] = local728;
					local1117 = this.anInt1518;
					local2984 = 0;
					local1095 = local3000;
				}
				@Pc(3040) short local3040 = this.aShortArray46[local728];
				if (local2984 < local3040) {
					local2984 = local3040;
				}
				if (local1117 > local3040) {
					local1117 = local3040;
				}
				local3040 = this.aShortArray40[local728];
				if (local3040 > local2984) {
					local2984 = local3040;
				}
				if (local1117 > local3040) {
					local1117 = local3040;
				}
				local3040 = this.aShortArray45[local728];
				if (local2984 < local3040) {
					local2984 = local3040;
				}
				if (local1117 > local3040) {
					local1117 = local3040;
				}
			}
			this.anIntArray139[local1402] = local1117;
			this.anIntArray143[local1402] = local2984 + 1 - local1117;
			local1402++;
			this.anIntArray140[local1402] = this.anInt1520;
		}
		Static466.aLongArray15 = null;
		this.aShortArray43 = Static568.method7411(this.aShortArray43, this.anInt1518);
		this.aShortArray41 = Static568.method7411(this.aShortArray41, this.anInt1518);
		this.aShortArray48 = Static568.method7411(this.aShortArray48, this.anInt1518);
		this.aShortArray38 = Static568.method7411(this.aShortArray38, this.anInt1518);
		this.lb = Static568.method7411(this.lb, this.anInt1518);
		this.aByteArray32 = Static171.method2238(this.aByteArray32, this.anInt1518);
		this.aFloatArray4 = Static398.method5464(this.aFloatArray4, this.anInt1518);
		this.aFloatArray3 = Static398.method5464(this.aFloatArray3, this.anInt1518);
		if (arg1.anIntArray34 != null && Static582.method7552(this.anInt1557, arg2)) {
			this.anIntArrayArray25 = arg1.method243(false);
		}
		if (arg1.aClass122Array1 != null && Static533.method7006(this.anInt1557, arg2)) {
			this.anIntArrayArray26 = arg1.method236();
		}
		if (arg1.anIntArray37 != null && Static206.method2569(this.anInt1557, arg2)) {
			local1402 = 0;
			local675 = new int[256];
			for (local1106 = 0; local1106 < this.anInt1573; local1106++) {
				local1117 = arg1.anIntArray37[local22[local1106]];
				if (local1117 >= 0) {
					@Pc(3240) int local3240 = local675[local1117]++;
					if (local1402 < local1117) {
						local1402 = local1117;
					}
				}
			}
			this.anIntArrayArray24 = new int[local1402 + 1][];
			for (local1117 = 0; local1117 <= local1402; local1117++) {
				this.anIntArrayArray24[local1117] = new int[local675[local1117]];
				local675[local1117] = 0;
			}
			for (local683 = 0; local683 < this.anInt1573; local683++) {
				local728 = arg1.anIntArray37[local22[local683]];
				if (local728 >= 0) {
					this.anIntArrayArray24[local728][local675[local728]++] = local683;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!um;IIZZ)V")
	public Class33_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1518 = 0;
		this.anInt1514 = 0;
		this.aBoolean98 = true;
		this.anInt1520 = 0;
		this.aBoolean97 = false;
		this.aBoolean99 = false;
		this.anInt1573 = 0;
		this.anInt1587 = 0;
		this.aBoolean100 = false;
		this.aBoolean100 = arg4;
		this.aClass162_Sub1_4 = arg0;
		this.anInt1557 = arg2;
		this.anInt1558 = arg1;
		if (arg3 || Static449.method5855(this.anInt1558, this.anInt1557)) {
			this.aClass94_2 = new Class94(Static511.method7272(this.anInt1557, this.anInt1558));
		}
		if (arg3 || Static75.method1209(this.anInt1557, this.anInt1558)) {
			this.aClass94_3 = new Class94(Static444.method5804(this.anInt1558, this.anInt1557));
		}
		if (arg3 || Static543.method7105(this.anInt1558, this.anInt1557)) {
			this.aClass94_1 = new Class94(Static582.method7550(this.anInt1557, this.anInt1558));
		}
		if (arg3 || Static157.method2132(this.anInt1558, this.anInt1557)) {
			this.aClass94_4 = new Class94(Static310.method4443(this.anInt1557, this.anInt1558));
		}
		if (arg3 || Static433.method5700(this.anInt1557, this.anInt1558)) {
			this.aClass256_1 = new Class256(Static377.method5258(this.anInt1558, this.anInt1557));
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3) {
		return this.method1339(-1, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort18 = (short) arg0;
		this.method1331();
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()[Lclient!rca;")
	@Override
	public Class293[] method7196() {
		return this.aClass293Array3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7202(@OriginalArg(0) Class25 arg0) {
		@Pc(8) Class25_Sub2 local8 = (Class25_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass293Array3 != null) {
			for (local13 = 0; local13 < this.aClass293Array3.length; local13++) {
				@Pc(20) Class293 local20 = this.aClass293Array3[local13];
				@Pc(22) Class293 local22 = local20;
				if (local20.aClass293_1 != null) {
					local22 = local20.aClass293_1;
				}
				local22.anInt7306 = (int) (local8.aFloat79 + local8.aFloat82 * (float) this.anIntArray141[local20.anInt7304] + local8.aFloat81 * (float) this.anIntArray142[local20.anInt7304] + (float) this.anIntArray145[local20.anInt7304] * local8.aFloat76);
				local22.anInt7310 = (int) (local8.aFloat71 + (float) this.anIntArray141[local20.anInt7304] * local8.aFloat74 + (float) this.anIntArray145[local20.anInt7304] * local8.aFloat75 + (float) this.anIntArray142[local20.anInt7304] * local8.aFloat77);
				local22.anInt7317 = (int) (local8.aFloat80 * (float) this.anIntArray142[local20.anInt7304] + (float) this.anIntArray145[local20.anInt7304] * local8.aFloat73 + local8.aFloat78 * (float) this.anIntArray141[local20.anInt7304] + local8.aFloat72);
				local22.anInt7318 = (int) (local8.aFloat82 * (float) this.anIntArray141[local20.anInt7308] + (float) this.anIntArray142[local20.anInt7308] * local8.aFloat81 + (float) this.anIntArray145[local20.anInt7308] * local8.aFloat76 + local8.aFloat79);
				local22.anInt7315 = (int) (local8.aFloat71 + (float) this.anIntArray141[local20.anInt7308] * local8.aFloat74 + (float) this.anIntArray145[local20.anInt7308] * local8.aFloat75 + local8.aFloat77 * (float) this.anIntArray142[local20.anInt7308]);
				local22.anInt7316 = (int) (local8.aFloat78 * (float) this.anIntArray141[local20.anInt7308] + local8.aFloat80 * (float) this.anIntArray142[local20.anInt7308] + (float) this.anIntArray145[local20.anInt7308] * local8.aFloat73 + local8.aFloat72);
				local22.anInt7305 = (int) (local8.aFloat79 + local8.aFloat82 * (float) this.anIntArray141[local20.anInt7313] + local8.aFloat76 * (float) this.anIntArray145[local20.anInt7313] + local8.aFloat81 * (float) this.anIntArray142[local20.anInt7313]);
				local22.anInt7302 = (int) (local8.aFloat75 * (float) this.anIntArray145[local20.anInt7313] + local8.aFloat77 * (float) this.anIntArray142[local20.anInt7313] + (float) this.anIntArray141[local20.anInt7313] * local8.aFloat74 + local8.aFloat71);
				local22.anInt7312 = (int) (local8.aFloat78 * (float) this.anIntArray141[local20.anInt7313] + (float) this.anIntArray142[local20.anInt7313] * local8.aFloat80 + (float) this.anIntArray145[local20.anInt7313] * local8.aFloat73 + local8.aFloat72);
			}
		}
		if (this.aClass163Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass163Array3.length; local13++) {
			@Pc(361) Class163 local361 = this.aClass163Array3[local13];
			@Pc(363) Class163 local363 = local361;
			if (local361.aClass163_1 != null) {
				local363 = local361.aClass163_1;
			}
			if (local361.aClass25_1 == null) {
				local361.aClass25_1 = local8.method5883();
			} else {
				local361.aClass25_1.M(local8);
			}
			local363.anInt3823 = (int) (local8.aFloat79 + local8.aFloat82 * (float) this.anIntArray141[local361.anInt3821] + local8.aFloat76 * (float) this.anIntArray145[local361.anInt3821] + local8.aFloat81 * (float) this.anIntArray142[local361.anInt3821]);
			local363.anInt3825 = (int) (local8.aFloat74 * (float) this.anIntArray141[local361.anInt3821] + (float) this.anIntArray145[local361.anInt3821] * local8.aFloat75 + local8.aFloat77 * (float) this.anIntArray142[local361.anInt3821] + local8.aFloat71);
			local363.anInt3824 = (int) (local8.aFloat72 + (float) this.anIntArray141[local361.anInt3821] * local8.aFloat78 + (float) this.anIntArray142[local361.anInt3821] * local8.aFloat80 + (float) this.anIntArray145[local361.anInt3821] * local8.aFloat73);
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	private void method1331() {
		if (this.aClass94_1 != null) {
			this.aClass94_1.aBoolean140 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1543;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	private void method1332() {
		if (this.anInt1520 == 0) {
			return;
		}
		if (this.method1343() && this.method1347()) {
			this.aClass162_Sub1_4.method3954(this.aClass94_2.anInterface8_1, 0);
			this.aClass162_Sub1_4.method3954(this.aClass94_1.anInterface8_1, 1);
			this.aClass162_Sub1_4.method3954(this.aClass94_3.anInterface8_1, 2);
			@Pc(48) boolean local48;
			if ((this.anInt1557 & 0x37) == 0) {
				local48 = false;
				this.aClass162_Sub1_4.method3836(false);
				this.aClass162_Sub1_4.method3882(this.aClass162_Sub1_4.aClass59_16);
			} else {
				local48 = true;
				this.aClass162_Sub1_4.method3836(true);
				this.aClass162_Sub1_4.method3954(this.aClass94_4.anInterface8_1, 3);
				this.aClass162_Sub1_4.method3882(this.aClass162_Sub1_4.aClass59_14);
			}
			for (@Pc(86) int local86 = 0; local86 < this.anIntArray139.length; local86++) {
				@Pc(93) int local93 = this.anIntArray140[local86];
				@Pc(100) int local100 = this.anIntArray140[local86 + 1];
				@Pc(107) int local107 = this.aShortArray47[local93] & 0xFFFF;
				if (local107 == 65535) {
					local107 = -1;
				}
				this.aClass162_Sub1_4.method3943(true, local107, local48);
				this.aClass162_Sub1_4.method3892(local93 * 3, this.anIntArray143[local86], Static523.aClass155_6, local100 - local93, this.aClass256_1.anInterface13_5, this.anIntArray139[local86]);
			}
		}
		this.method1340();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1339(arg4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1560;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!sw;)V")
	private void method1333(@OriginalArg(1) Class2_Sub2_Sub8_Sub1 arg0) {
		if (Static253.anIntArray304.length < this.anInt1518) {
			Static517.anIntArray554 = new int[this.anInt1518];
			Static253.anIntArray304 = new int[this.anInt1518];
		}
		@Pc(56) int local56;
		@Pc(94) int local94;
		@Pc(103) int local103;
		for (@Pc(30) int local30 = 0; local30 < this.anInt1514; local30++) {
			local56 = (this.anIntArray142[local30] - (this.anIntArray145[local30] * this.aClass162_Sub1_4.anInt4609 >> 8) >> this.aClass162_Sub1_4.anInt4621) - arg0.anInt7953;
			@Pc(80) int local80 = (this.anIntArray141[local30] - (this.anIntArray145[local30] * this.aClass162_Sub1_4.anInt4597 >> 8) >> this.aClass162_Sub1_4.anInt4621) - arg0.anInt7947;
			@Pc(85) int local85 = this.anIntArray144[local30];
			@Pc(92) int local92 = this.anIntArray144[local30 + 1];
			for (local94 = local85; local94 < local92; local94++) {
				local103 = this.aShortArray37[local94] - 1;
				if (local103 == -1) {
					break;
				}
				Static253.anIntArray304[local103] = local56;
				Static517.anIntArray554[local103] = local80;
			}
		}
		for (local56 = 0; local56 < this.anInt1520; local56++) {
			if (this.aByteArray31 == null || this.aByteArray31[local56] <= 128) {
				@Pc(147) short local147 = this.aShortArray46[local56];
				@Pc(152) short local152 = this.aShortArray40[local56];
				@Pc(157) short local157 = this.aShortArray45[local56];
				local94 = Static253.anIntArray304[local147];
				local103 = Static253.anIntArray304[local152];
				@Pc(169) int local169 = Static253.anIntArray304[local157];
				@Pc(173) int local173 = Static517.anIntArray554[local147];
				@Pc(177) int local177 = Static517.anIntArray554[local152];
				@Pc(181) int local181 = Static517.anIntArray554[local157];
				if ((local177 - local181) * (local94 - local103) - (local169 - local103) * (-local173 + local177) > 0) {
					arg0.method6467(local173, local103, local169, local94, local181, local177);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean97) {
			this.method1341();
		}
		@Pc(16) int local16 = this.anInt1566 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt1513;
		@Pc(26) int local26 = arg6 + this.anInt1561;
		@Pc(32) int local32 = arg6 + this.anInt1597;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9572 <= arg2.anInt9573 + local21 >> arg2.anInt9568 || local26 < 0 || local32 + arg2.anInt9573 >> arg2.anInt9568 >= arg2.anInt9574)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9572 <= arg3.anInt9573 + local21 >> arg3.anInt9568 || local26 < 0 || local32 + arg3.anInt9573 >> arg3.anInt9568 >= arg3.anInt9574) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9568;
			local21 = local21 + arg2.anInt9573 - 1 >> arg2.anInt9568;
			local26 >>= arg2.anInt9568;
			local32 = local32 + arg2.anInt9573 - 1 >> arg2.anInt9568;
			if (arg2.method7676(local26, local16) == arg5 && arg2.method7676(local26, local21) == arg5 && arg5 == arg2.method7676(local32, local16) && arg2.method7676(local32, local21) == arg5) {
				return;
			}
		}
		@Pc(212) int local212;
		if (arg0 == 1) {
			for (local212 = 0; local212 < this.anInt1514; local212++) {
				this.anIntArray145[local212] = this.anIntArray145[local212] + arg2.method7680(arg4 + this.anIntArray142[local212], this.anIntArray141[local212] - -arg6) - arg5;
			}
		} else {
			@Pc(214) int local214;
			@Pc(271) int local271;
			if (arg0 == 2) {
				local212 = this.anInt1543;
				if (local212 == 0) {
					return;
				}
				for (local214 = 0; local214 < this.anInt1514; local214++) {
					local271 = (this.anIntArray145[local214] << 16) / local212;
					if (arg1 > local271) {
						this.anIntArray145[local214] += (arg2.method7680(arg4 + this.anIntArray142[local214], this.anIntArray141[local214] - -arg6) - arg5) * (-local271 + arg1) / arg1;
					}
				}
			} else {
				@Pc(279) int local279;
				if (arg0 == 3) {
					local212 = (arg1 & 0xFF) * 4;
					local214 = (arg1 >> 8 & 0xFF) * 4;
					local271 = (arg1 >> 16 & 0xFF) << 6;
					local279 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local212 >> 1) < 0 || arg4 + (local212 >> 1) + arg2.anInt9573 >= arg2.anInt9572 << arg2.anInt9568 || arg6 - (local214 >> 1) < 0 || arg2.anInt9573 + (local214 >> 1) + arg6 >= arg2.anInt9574 << arg2.anInt9568) {
						return;
					}
					this.method7179(arg6, local212, local271, arg4, local279, arg5, arg2, local214);
				} else if (arg0 == 4) {
					local212 = this.anInt1579 - this.anInt1543;
					for (local214 = 0; local214 < this.anInt1514; local214++) {
						this.anIntArray145[local214] = this.anIntArray145[local214] + arg3.method7680(arg4 + this.anIntArray142[local214], this.anIntArray141[local214] + arg6) + local212 - arg5;
					}
				} else if (arg0 == 5) {
					local212 = this.anInt1579 - this.anInt1543;
					for (local214 = 0; local214 < this.anInt1514; local214++) {
						local271 = arg4 + this.anIntArray142[local214];
						local279 = this.anIntArray141[local214] + arg6;
						@Pc(285) int local285 = arg2.method7680(local271, local279);
						@Pc(291) int local291 = arg3.method7680(local271, local279);
						@Pc(299) int local299 = local285 - local291 - arg1;
						this.anIntArray145[local214] = ((this.anIntArray145[local214] << 8) / local212 * local299 >> 8) + local285 - arg5;
					}
				}
			}
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZLclient!de;Lclient!de;ZI)Lclient!da;")
	private Class33 method1334(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class33_Sub2 arg1, @OriginalArg(3) Class33_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.anInt1557 = this.anInt1557;
		arg2.anInt1514 = this.anInt1514;
		arg2.aShort18 = this.aShort18;
		arg2.anInt1558 = arg4;
		arg2.anInt1587 = this.anInt1587;
		arg2.anInt1518 = this.anInt1518;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean99 = this.aBoolean99;
		} else {
			arg2.aBoolean99 = true;
		}
		arg2.anInt1520 = this.anInt1520;
		arg2.anInt1573 = this.anInt1573;
		arg2.anInt1583 = this.anInt1583;
		arg2.aShort19 = this.aShort19;
		@Pc(68) boolean local68 = Static172.method2259(arg4, this.anInt1557);
		@Pc(74) boolean local74 = Static228.method2765(this.anInt1557, arg4);
		@Pc(80) boolean local80 = Static200.method2514(arg4, this.anInt1557);
		@Pc(86) boolean local86 = local80 | local68 | local74;
		@Pc(187) int local187;
		if (local86) {
			if (!local68) {
				arg2.anIntArray142 = this.anIntArray142;
			} else if (arg1.anIntArray142 == null || this.anInt1587 > arg1.anIntArray142.length) {
				arg2.anIntArray142 = arg1.anIntArray142 = new int[this.anInt1587];
			} else {
				arg2.anIntArray142 = arg1.anIntArray142;
			}
			if (!local74) {
				arg2.anIntArray145 = this.anIntArray145;
			} else if (arg1.anIntArray145 == null || arg1.anIntArray145.length < this.anInt1587) {
				arg2.anIntArray145 = arg1.anIntArray145 = new int[this.anInt1587];
			} else {
				arg2.anIntArray145 = arg1.anIntArray145;
			}
			if (!local80) {
				arg2.anIntArray141 = this.anIntArray141;
			} else if (arg1.anIntArray141 == null || arg1.anIntArray141.length < this.anInt1587) {
				arg2.anIntArray141 = arg1.anIntArray141 = new int[this.anInt1587];
			} else {
				arg2.anIntArray141 = arg1.anIntArray141;
			}
			for (local187 = 0; local187 < this.anInt1587; local187++) {
				if (local68) {
					arg2.anIntArray142[local187] = this.anIntArray142[local187];
				}
				if (local74) {
					arg2.anIntArray145[local187] = this.anIntArray145[local187];
				}
				if (local80) {
					arg2.anIntArray141[local187] = this.anIntArray141[local187];
				}
			}
		} else {
			arg2.anIntArray142 = this.anIntArray142;
			arg2.anIntArray141 = this.anIntArray141;
			arg2.anIntArray145 = this.anIntArray145;
		}
		if (Static511.method7272(this.anInt1557, arg4)) {
			arg2.aClass94_2 = arg1.aClass94_2;
			arg2.aClass94_2.aBoolean141 = true;
			arg2.aClass94_2.anInterface8_1 = this.aClass94_2.anInterface8_1;
			arg2.aClass94_2.aBoolean140 = this.aClass94_2.aBoolean140;
		} else if (Static449.method5855(arg4, this.anInt1557)) {
			arg2.aClass94_2 = this.aClass94_2;
		} else {
			arg2.aClass94_2 = null;
		}
		if (Static176.method2283(arg4, this.anInt1557)) {
			if (arg1.aShortArray44 == null || arg1.aShortArray44.length < this.anInt1573) {
				arg2.aShortArray44 = arg1.aShortArray44 = new short[this.anInt1573];
			} else {
				arg2.aShortArray44 = arg1.aShortArray44;
			}
			for (local187 = 0; local187 < this.anInt1573; local187++) {
				arg2.aShortArray44[local187] = this.aShortArray44[local187];
			}
		} else {
			arg2.aShortArray44 = this.aShortArray44;
		}
		if (Static220.method2684(this.anInt1557, arg4)) {
			if (arg1.aByteArray31 == null || this.anInt1573 > arg1.aByteArray31.length) {
				arg2.aByteArray31 = arg1.aByteArray31 = new byte[this.anInt1573];
			} else {
				arg2.aByteArray31 = arg1.aByteArray31;
			}
			for (local187 = 0; local187 < this.anInt1573; local187++) {
				arg2.aByteArray31[local187] = this.aByteArray31[local187];
			}
		} else {
			arg2.aByteArray31 = this.aByteArray31;
		}
		if (Static582.method7550(this.anInt1557, arg4)) {
			arg2.aClass94_1 = arg1.aClass94_1;
			arg2.aClass94_1.aBoolean140 = this.aClass94_1.aBoolean140;
			arg2.aClass94_1.aBoolean141 = true;
			arg2.aClass94_1.anInterface8_1 = this.aClass94_1.anInterface8_1;
		} else if (Static543.method7105(arg4, this.anInt1557)) {
			arg2.aClass94_1 = this.aClass94_1;
		} else {
			arg2.aClass94_1 = null;
		}
		@Pc(582) int local582;
		if (Static503.method6531(this.anInt1557, arg4)) {
			if (arg1.aShortArray48 == null || this.anInt1518 > arg1.aShortArray48.length) {
				local187 = this.anInt1518;
				arg2.aShortArray38 = arg1.aShortArray38 = new short[local187];
				arg2.lb = arg1.lb = new short[local187];
				arg2.aShortArray48 = arg1.aShortArray48 = new short[local187];
			} else {
				arg2.lb = arg1.lb;
				arg2.aShortArray38 = arg1.aShortArray38;
				arg2.aShortArray48 = arg1.aShortArray48;
			}
			if (this.aClass8_1 == null) {
				arg2.aClass8_1 = null;
				for (local187 = 0; local187 < this.anInt1518; local187++) {
					arg2.aShortArray48[local187] = this.aShortArray48[local187];
					arg2.aShortArray38[local187] = this.aShortArray38[local187];
					arg2.lb[local187] = this.lb[local187];
				}
			} else {
				if (arg1.aClass8_1 == null) {
					arg1.aClass8_1 = new Class8();
				}
				@Pc(566) Class8 local566 = arg2.aClass8_1 = arg1.aClass8_1;
				if (local566.aShortArray11 == null || local566.aShortArray11.length < this.anInt1518) {
					local582 = this.anInt1518;
					local566.aShortArray11 = new short[local582];
					local566.aByteArray1 = new byte[local582];
					local566.aShortArray10 = new short[local582];
					local566.aShortArray9 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt1518; local582++) {
					arg2.aShortArray48[local582] = this.aShortArray48[local582];
					arg2.aShortArray38[local582] = this.aShortArray38[local582];
					arg2.lb[local582] = this.lb[local582];
					local566.aShortArray11[local582] = this.aClass8_1.aShortArray11[local582];
					local566.aShortArray9[local582] = this.aClass8_1.aShortArray9[local582];
					local566.aShortArray10[local582] = this.aClass8_1.aShortArray10[local582];
					local566.aByteArray1[local582] = this.aClass8_1.aByteArray1[local582];
				}
			}
			arg2.aByteArray32 = this.aByteArray32;
		} else {
			arg2.lb = this.lb;
			arg2.aShortArray48 = this.aShortArray48;
			arg2.aShortArray38 = this.aShortArray38;
			arg2.aClass8_1 = this.aClass8_1;
			arg2.aByteArray32 = this.aByteArray32;
		}
		if (Static310.method4443(this.anInt1557, arg4)) {
			arg2.aClass94_4 = arg1.aClass94_4;
			arg2.aClass94_4.aBoolean140 = this.aClass94_4.aBoolean140;
			arg2.aClass94_4.aBoolean141 = true;
			arg2.aClass94_4.anInterface8_1 = this.aClass94_4.anInterface8_1;
		} else if (Static157.method2132(arg4, this.anInt1557)) {
			arg2.aClass94_4 = this.aClass94_4;
		} else {
			arg2.aClass94_4 = null;
		}
		if (Static484.method6236(arg4, this.anInt1557)) {
			if (arg1.aFloatArray4 == null || arg1.aFloatArray4.length < this.anInt1573) {
				local187 = this.anInt1518;
				arg2.aFloatArray4 = arg1.aFloatArray4 = new float[local187];
				arg2.aFloatArray3 = arg1.aFloatArray3 = new float[local187];
			} else {
				arg2.aFloatArray4 = arg1.aFloatArray4;
				arg2.aFloatArray3 = arg1.aFloatArray3;
			}
			for (local187 = 0; local187 < this.anInt1518; local187++) {
				arg2.aFloatArray4[local187] = this.aFloatArray4[local187];
				arg2.aFloatArray3[local187] = this.aFloatArray3[local187];
			}
		} else {
			arg2.aFloatArray4 = this.aFloatArray4;
			arg2.aFloatArray3 = this.aFloatArray3;
		}
		if (Static444.method5804(arg4, this.anInt1557)) {
			arg2.aClass94_3 = arg1.aClass94_3;
			arg2.aClass94_3.aBoolean140 = this.aClass94_3.aBoolean140;
			arg2.aClass94_3.aBoolean141 = true;
			arg2.aClass94_3.anInterface8_1 = this.aClass94_3.anInterface8_1;
		} else if (Static75.method1209(this.anInt1557, arg4)) {
			arg2.aClass94_3 = this.aClass94_3;
		} else {
			arg2.aClass94_3 = null;
		}
		if (Static301.method4359(arg4, this.anInt1557)) {
			if (arg1.aShortArray46 == null || this.anInt1573 > arg1.aShortArray46.length) {
				local187 = this.anInt1573;
				arg2.aShortArray46 = arg1.aShortArray46 = new short[local187];
				arg2.aShortArray40 = arg1.aShortArray40 = new short[local187];
				arg2.aShortArray45 = arg1.aShortArray45 = new short[local187];
			} else {
				arg2.aShortArray45 = arg1.aShortArray45;
				arg2.aShortArray46 = arg1.aShortArray46;
				arg2.aShortArray40 = arg1.aShortArray40;
			}
			for (local187 = 0; local187 < this.anInt1573; local187++) {
				arg2.aShortArray46[local187] = this.aShortArray46[local187];
				arg2.aShortArray40[local187] = this.aShortArray40[local187];
				arg2.aShortArray45[local187] = this.aShortArray45[local187];
			}
		} else {
			arg2.aShortArray46 = this.aShortArray46;
			arg2.aShortArray40 = this.aShortArray40;
			arg2.aShortArray45 = this.aShortArray45;
		}
		if (Static377.method5258(arg4, this.anInt1557)) {
			arg2.aClass256_1 = arg1.aClass256_1;
			arg2.aClass256_1.aBoolean504 = true;
			arg2.aClass256_1.aBoolean503 = this.aClass256_1.aBoolean503;
			arg2.aClass256_1.anInterface13_5 = this.aClass256_1.anInterface13_5;
		} else if (Static433.method5700(this.anInt1557, arg4)) {
			arg2.aClass256_1 = this.aClass256_1;
		} else {
			arg2.aClass256_1 = null;
		}
		if (Static413.method5563(this.anInt1557, arg4)) {
			if (arg1.aShortArray47 == null || arg1.aShortArray47.length < this.anInt1573) {
				local187 = this.anInt1573;
				arg2.aShortArray47 = arg1.aShortArray47 = new short[local187];
			} else {
				arg2.aShortArray47 = arg1.aShortArray47;
			}
			for (local187 = 0; local187 < this.anInt1573; local187++) {
				arg2.aShortArray47[local187] = this.aShortArray47[local187];
			}
		} else {
			arg2.aShortArray47 = this.aShortArray47;
		}
		if (!Static524.method6736(this.anInt1557, arg4)) {
			arg2.aClass238Array1 = this.aClass238Array1;
		} else if (arg1.aClass238Array1 == null || this.anInt1583 > arg1.aClass238Array1.length) {
			local187 = this.anInt1583;
			arg2.aClass238Array1 = arg1.aClass238Array1 = new Class238[local187];
			for (local582 = 0; local582 < this.anInt1583; local582++) {
				arg2.aClass238Array1[local582] = this.aClass238Array1[local582].method5076();
			}
		} else {
			arg2.aClass238Array1 = arg1.aClass238Array1;
			for (local187 = 0; local187 < this.anInt1583; local187++) {
				arg2.aClass238Array1[local187].method5077(this.aClass238Array1[local187]);
			}
		}
		arg2.anIntArrayArray25 = this.anIntArrayArray25;
		arg2.anIntArray139 = this.anIntArray139;
		arg2.aClass224Array1 = this.aClass224Array1;
		arg2.aShortArray39 = this.aShortArray39;
		arg2.anIntArrayArray26 = this.anIntArrayArray26;
		arg2.aClass293Array3 = this.aClass293Array3;
		arg2.aShortArray43 = this.aShortArray43;
		arg2.aClass163Array3 = this.aClass163Array3;
		arg2.aShortArray42 = this.aShortArray42;
		arg2.aShortArray41 = this.aShortArray41;
		arg2.aShortArray37 = this.aShortArray37;
		if (this.aBoolean97) {
			arg2.anInt1561 = this.anInt1561;
			arg2.aBoolean97 = true;
			arg2.anInt1560 = this.anInt1560;
			arg2.anInt1531 = this.anInt1531;
			arg2.anInt1513 = this.anInt1513;
			arg2.anInt1579 = this.anInt1579;
			arg2.anInt1566 = this.anInt1566;
			arg2.anInt1543 = this.anInt1543;
			arg2.anInt1597 = this.anInt1597;
		} else {
			arg2.aBoolean97 = false;
		}
		arg2.anIntArray144 = this.anIntArray144;
		arg2.anIntArrayArray24 = this.anIntArrayArray24;
		arg2.anIntArray140 = this.anIntArray140;
		arg2.anIntArray143 = this.anIntArray143;
		return arg2;
	}

	@OriginalMember(owner = "client!de", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub2_Sub8 S(@OriginalArg(0) Class2_Sub2_Sub8 arg0) {
		if (this.anInt1518 == 0) {
			return null;
		}
		if (!this.aBoolean97) {
			this.method1341();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass162_Sub1_4.anInt4609 <= 0) {
			local43 = this.anInt1566 - (this.aClass162_Sub1_4.anInt4609 * this.anInt1543 >> 8) >> this.aClass162_Sub1_4.anInt4621;
			local60 = this.anInt1513 - (this.anInt1579 * this.aClass162_Sub1_4.anInt4609 >> 8) >> this.aClass162_Sub1_4.anInt4621;
		} else {
			local43 = this.anInt1566 - (this.anInt1579 * this.aClass162_Sub1_4.anInt4609 >> 8) >> this.aClass162_Sub1_4.anInt4621;
			local60 = this.anInt1513 - (this.anInt1543 * this.aClass162_Sub1_4.anInt4609 >> 8) >> this.aClass162_Sub1_4.anInt4621;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass162_Sub1_4.anInt4597 <= 0) {
			local116 = this.anInt1561 - (this.aClass162_Sub1_4.anInt4597 * this.anInt1543 >> 8) >> this.aClass162_Sub1_4.anInt4621;
			local133 = this.anInt1597 - (this.aClass162_Sub1_4.anInt4597 * this.anInt1579 >> 8) >> this.aClass162_Sub1_4.anInt4621;
		} else {
			local116 = this.anInt1561 - (this.anInt1579 * this.aClass162_Sub1_4.anInt4597 >> 8) >> this.aClass162_Sub1_4.anInt4621;
			local133 = this.anInt1597 - (this.aClass162_Sub1_4.anInt4597 * this.anInt1543 >> 8) >> this.aClass162_Sub1_4.anInt4621;
		}
		@Pc(176) int local176 = local60 + 1 - local43;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class2_Sub2_Sub8_Sub1 local186 = (Class2_Sub2_Sub8_Sub1) arg0;
		@Pc(196) Class2_Sub2_Sub8_Sub1 local196;
		if (local186 != null && local186.method6468(local183, local176)) {
			local196 = local186;
			local186.method6472();
		} else {
			local196 = new Class2_Sub2_Sub8_Sub1(this.aClass162_Sub1_4, local176, local183);
		}
		local196.method6465(local133, local43, local60, local116);
		this.method1333(local196);
		return local196;
	}

	@OriginalMember(owner = "client!de", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!de", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt1558;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class33 method7200(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class33_Sub2 local14;
		@Pc(18) Class33_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass162_Sub1_4.aClass33_Sub2_21;
			local18 = this.aClass162_Sub1_4.aClass33_Sub2_29;
		} else if (arg0 == 2) {
			local14 = this.aClass162_Sub1_4.aClass33_Sub2_28;
			local18 = this.aClass162_Sub1_4.aClass33_Sub2_25;
		} else if (arg0 == 3) {
			local18 = this.aClass162_Sub1_4.aClass33_Sub2_27;
			local14 = this.aClass162_Sub1_4.aClass33_Sub2_22;
		} else if (arg0 == 4) {
			local14 = this.aClass162_Sub1_4.aClass33_Sub2_30;
			local18 = this.aClass162_Sub1_4.aClass33_Sub2_23;
		} else if (arg0 == 5) {
			local18 = this.aClass162_Sub1_4.aClass33_Sub2_26;
			local14 = this.aClass162_Sub1_4.aClass33_Sub2_24;
		} else {
			local14 = local18 = new Class33_Sub2(this.aClass162_Sub1_4, 0, 0, true, false);
		}
		return this.method1334(arg2, local18, local14, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!q;Lclient!qh;II)V")
	@Override
	public void method7183(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1518 == 0) {
			return;
		}
		@Pc(13) Class25_Sub2 local13 = this.aClass162_Sub1_4.aClass25_Sub2_16;
		if (!this.aBoolean97) {
			this.method1341();
		}
		@Pc(22) Class25_Sub2 local22 = (Class25_Sub2) arg0;
		Static37.aFloat24 = local13.aFloat78 * local22.aFloat73 + local22.aFloat75 * local13.aFloat73 + local13.aFloat80 * local22.aFloat76;
		Static109.aFloat48 = local13.aFloat73 * local22.aFloat71 + local22.aFloat79 * local13.aFloat80 + local22.aFloat72 * local13.aFloat78 + local13.aFloat72;
		@Pc(69) float local69 = Static109.aFloat48 + (float) this.anInt1543 * Static37.aFloat24;
		@Pc(77) float local77 = Static37.aFloat24 * (float) this.anInt1579 + Static109.aFloat48;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.anInt1560;
			local93 = (float) this.anInt1560 + local69;
		} else {
			local93 = local77 + (float) this.anInt1560;
			local87 = (float) -this.anInt1560 + local69;
		}
		if (local87 >= this.aClass162_Sub1_4.aFloat132 || (float) this.aClass162_Sub1_4.anInt4605 >= local93) {
			return;
		}
		Static272.aFloat146 = local22.aFloat71 * local13.aFloat76 + local22.aFloat79 * local13.aFloat81 + local22.aFloat72 * local13.aFloat82 + local13.aFloat79;
		Static29.aFloat23 = local22.aFloat73 * local13.aFloat82 + local13.aFloat81 * local22.aFloat76 + local13.aFloat76 * local22.aFloat75;
		@Pc(170) float local170 = Static29.aFloat23 * (float) this.anInt1543 + Static272.aFloat146;
		@Pc(178) float local178 = (float) this.anInt1579 * Static29.aFloat23 + Static272.aFloat146;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local194 = ((float) -this.anInt1560 + local178) * (float) this.aClass162_Sub1_4.anInt4588;
			local205 = (float) this.aClass162_Sub1_4.anInt4588 * ((float) this.anInt1560 + local170);
		} else {
			local194 = ((float) -this.anInt1560 + local170) * (float) this.aClass162_Sub1_4.anInt4588;
			local205 = (float) this.aClass162_Sub1_4.anInt4588 * (local178 + (float) this.anInt1560);
		}
		if (local194 / (float) arg2 >= this.aClass162_Sub1_4.aFloat141 || local205 / (float) arg2 <= this.aClass162_Sub1_4.aFloat130) {
			return;
		}
		Static427.aFloat188 = local13.aFloat71 + local22.aFloat72 * local13.aFloat74 + local13.aFloat75 * local22.aFloat71 + local22.aFloat79 * local13.aFloat77;
		Static512.aFloat206 = local22.aFloat73 * local13.aFloat74 + local13.aFloat75 * local22.aFloat75 + local22.aFloat76 * local13.aFloat77;
		@Pc(297) float local297 = Static427.aFloat188 + (float) this.anInt1543 * Static512.aFloat206;
		@Pc(305) float local305 = Static427.aFloat188 + (float) this.anInt1579 * Static512.aFloat206;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = (float) this.aClass162_Sub1_4.anInt4590 * (local297 + (float) this.anInt1560);
			local332 = (float) this.aClass162_Sub1_4.anInt4590 * ((float) -this.anInt1560 + local305);
		} else {
			local320 = ((float) this.anInt1560 + local305) * (float) this.aClass162_Sub1_4.anInt4590;
			local332 = (float) this.aClass162_Sub1_4.anInt4590 * ((float) -this.anInt1560 + local297);
		}
		if (local332 / (float) arg2 >= this.aClass162_Sub1_4.aFloat133 || this.aClass162_Sub1_4.aFloat137 >= local320 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass224Array1 != null) {
			Static23.aFloat10 = local22.aFloat80 * local13.aFloat74 + local22.aFloat81 * local13.aFloat77 + local13.aFloat75 * local22.aFloat77;
			Static437.aFloat190 = local22.aFloat74 * local13.aFloat76 + local22.aFloat82 * local13.aFloat81 + local22.aFloat78 * local13.aFloat82;
			Static590.aFloat245 = local22.aFloat82 * local13.aFloat80 + local22.aFloat74 * local13.aFloat73 + local13.aFloat78 * local22.aFloat78;
			Static477.aFloat199 = local13.aFloat78 * local22.aFloat80 + local13.aFloat73 * local22.aFloat77 + local22.aFloat81 * local13.aFloat80;
			Static247.aFloat124 = local22.aFloat74 * local13.aFloat75 + local13.aFloat77 * local22.aFloat82 + local13.aFloat74 * local22.aFloat78;
			Static485.aFloat202 = local22.aFloat80 * local13.aFloat82 + local13.aFloat76 * local22.aFloat77 + local22.aFloat81 * local13.aFloat81;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt1566 + this.anInt1513 >> 1;
			@Pc(509) int local509 = this.anInt1561 + this.anInt1597 >> 1;
			@Pc(528) int local528 = (int) ((float) this.anInt1543 * Static29.aFloat23 + (float) local500 * Static485.aFloat202 + Static272.aFloat146 + Static437.aFloat190 * (float) local509);
			@Pc(547) int local547 = (int) (Static512.aFloat206 * (float) this.anInt1543 + (float) local500 * Static23.aFloat10 + Static427.aFloat188 + Static247.aFloat124 * (float) local509);
			@Pc(566) int local566 = (int) ((float) this.anInt1543 * Static37.aFloat24 + Static109.aFloat48 + (float) local500 * Static477.aFloat199 + Static590.aFloat245 * (float) local509);
			@Pc(585) int local585 = (int) (Static437.aFloat190 * (float) local509 + (float) local500 * Static485.aFloat202 + Static272.aFloat146 + Static29.aFloat23 * (float) this.anInt1579);
			@Pc(604) int local604 = (int) (Static247.aFloat124 * (float) local509 + (float) this.anInt1579 * Static512.aFloat206 + Static23.aFloat10 * (float) local500 + Static427.aFloat188);
			arg1.anInt7027 = this.aClass162_Sub1_4.anInt4588 * local585 / arg2 + this.aClass162_Sub1_4.anInt4619;
			@Pc(636) int local636 = (int) ((float) local500 * Static477.aFloat199 + Static109.aFloat48 + (float) this.anInt1579 * Static37.aFloat24 + (float) local509 * Static590.aFloat245);
			arg1.anInt7026 = this.aClass162_Sub1_4.anInt4615 + local547 * this.aClass162_Sub1_4.anInt4590 / arg2;
			arg1.anInt7028 = local604 * this.aClass162_Sub1_4.anInt4590 / arg2 + this.aClass162_Sub1_4.anInt4615;
			arg1.anInt7029 = this.aClass162_Sub1_4.anInt4619 + this.aClass162_Sub1_4.anInt4588 * local528 / arg2;
			if (this.aClass162_Sub1_4.anInt4605 <= local566 || local636 >= this.aClass162_Sub1_4.anInt4605) {
				arg1.aBoolean576 = true;
				arg1.anInt7030 = (this.anInt1560 + local528) * this.aClass162_Sub1_4.anInt4588 / arg2 + this.aClass162_Sub1_4.anInt4619 - arg1.anInt7029;
			}
		}
		this.aClass162_Sub1_4.method3905((float) arg2);
		this.aClass162_Sub1_4.method3914();
		this.aClass162_Sub1_4.method3859(local22);
		this.method1332();
		this.method1350();
	}

	@OriginalMember(owner = "client!de", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass94_2 != null) {
			this.aClass94_2.aBoolean141 = Static511.method7272(this.anInt1557, arg0);
		}
		if (this.aClass94_3 != null) {
			this.aClass94_3.aBoolean141 = Static444.method5804(arg0, this.anInt1557);
		}
		if (this.aClass94_1 != null) {
			this.aClass94_1.aBoolean141 = Static582.method7550(this.anInt1557, arg0);
		}
		if (this.aClass94_4 != null) {
			this.aClass94_4.aBoolean141 = Static310.method4443(this.anInt1557, arg0);
		}
		this.anInt1558 = arg0;
		if (this.aClass8_1 != null && (this.anInt1558 & 0x10000) == 0) {
			this.lb = this.aClass8_1.aShortArray10;
			this.aByteArray32 = this.aClass8_1.aByteArray1;
			this.aShortArray48 = this.aClass8_1.aShortArray11;
			this.aShortArray38 = this.aClass8_1.aShortArray9;
			this.aClass8_1 = null;
		}
		this.aBoolean98 = true;
		this.method1340();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
	@Override
	public void method7182() {
		if (this.anInt1518 > 0 && this.anInt1520 > 0) {
			this.method1343();
			this.method1347();
			this.method1340();
		}
	}

	@OriginalMember(owner = "client!de", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1513;
	}

	@OriginalMember(owner = "client!de", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort18;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!q;Lclient!qh;I)V")
	@Override
	public void method7192(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1518 == 0) {
			return;
		}
		@Pc(16) Class25_Sub2 local16 = this.aClass162_Sub1_4.aClass25_Sub2_16;
		@Pc(19) Class25_Sub2 local19 = (Class25_Sub2) arg0;
		if (!this.aBoolean97) {
			this.method1341();
		}
		Static109.aFloat48 = local16.aFloat72 + local19.aFloat71 * local16.aFloat73 + local19.aFloat79 * local16.aFloat80 + local19.aFloat72 * local16.aFloat78;
		Static37.aFloat24 = local19.aFloat73 * local16.aFloat78 + local19.aFloat75 * local16.aFloat73 + local19.aFloat76 * local16.aFloat80;
		@Pc(72) float local72 = Static109.aFloat48 + Static37.aFloat24 * (float) this.anInt1543;
		@Pc(80) float local80 = Static109.aFloat48 + (float) this.anInt1579 * Static37.aFloat24;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt1560;
			local96 = (float) this.anInt1560 + local72;
		} else {
			local96 = local80 + (float) this.anInt1560;
			local90 = local72 - (float) this.anInt1560;
		}
		if (this.aClass162_Sub1_4.aFloat129 <= local90 || local96 <= (float) this.aClass162_Sub1_4.anInt4605) {
			return;
		}
		Static29.aFloat23 = local19.aFloat75 * local16.aFloat76 + local19.aFloat76 * local16.aFloat81 + local19.aFloat73 * local16.aFloat82;
		Static272.aFloat146 = local16.aFloat79 + local16.aFloat81 * local19.aFloat79 + local16.aFloat76 * local19.aFloat71 + local19.aFloat72 * local16.aFloat82;
		@Pc(172) float local172 = Static272.aFloat146 + (float) this.anInt1543 * Static29.aFloat23;
		@Pc(180) float local180 = Static272.aFloat146 + (float) this.anInt1579 * Static29.aFloat23;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local172 > local180) {
			local196 = (local180 - (float) this.anInt1560) * (float) this.aClass162_Sub1_4.anInt4588;
			local207 = ((float) this.anInt1560 + local172) * (float) this.aClass162_Sub1_4.anInt4588;
		} else {
			local196 = ((float) -this.anInt1560 + local172) * (float) this.aClass162_Sub1_4.anInt4588;
			local207 = (local180 + (float) this.anInt1560) * (float) this.aClass162_Sub1_4.anInt4588;
		}
		if (local196 / local96 >= this.aClass162_Sub1_4.aFloat141 || this.aClass162_Sub1_4.aFloat130 >= local207 / local96) {
			return;
		}
		Static427.aFloat188 = local16.aFloat71 + local19.aFloat72 * local16.aFloat74 + local16.aFloat75 * local19.aFloat71 + local19.aFloat79 * local16.aFloat77;
		Static512.aFloat206 = local19.aFloat75 * local16.aFloat75 + local19.aFloat76 * local16.aFloat77 + local19.aFloat73 * local16.aFloat74;
		@Pc(296) float local296 = (float) this.anInt1543 * Static512.aFloat206 + Static427.aFloat188;
		@Pc(304) float local304 = Static512.aFloat206 * (float) this.anInt1579 + Static427.aFloat188;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local319 = ((float) this.anInt1560 + local296) * (float) this.aClass162_Sub1_4.anInt4590;
			local331 = ((float) -this.anInt1560 + local304) * (float) this.aClass162_Sub1_4.anInt4590;
		} else {
			local319 = (float) this.aClass162_Sub1_4.anInt4590 * ((float) this.anInt1560 + local304);
			local331 = (float) this.aClass162_Sub1_4.anInt4590 * ((float) -this.anInt1560 + local296);
		}
		if (local331 / local96 >= this.aClass162_Sub1_4.aFloat133 || local319 / local96 <= this.aClass162_Sub1_4.aFloat137) {
			return;
		}
		if (arg1 != null || this.aClass224Array1 != null) {
			Static247.aFloat124 = local16.aFloat77 * local19.aFloat82 + local19.aFloat74 * local16.aFloat75 + local16.aFloat74 * local19.aFloat78;
			Static485.aFloat202 = local16.aFloat82 * local19.aFloat80 + local19.aFloat77 * local16.aFloat76 + local16.aFloat81 * local19.aFloat81;
			Static23.aFloat10 = local16.aFloat74 * local19.aFloat80 + local19.aFloat77 * local16.aFloat75 + local16.aFloat77 * local19.aFloat81;
			Static590.aFloat245 = local16.aFloat80 * local19.aFloat82 + local19.aFloat74 * local16.aFloat73 + local16.aFloat78 * local19.aFloat78;
			Static477.aFloat199 = local16.aFloat78 * local19.aFloat80 + local16.aFloat80 * local19.aFloat81 + local19.aFloat77 * local16.aFloat73;
			Static437.aFloat190 = local19.aFloat78 * local16.aFloat82 + local19.aFloat82 * local16.aFloat81 + local16.aFloat76 * local19.aFloat74;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt1513 + this.anInt1566 >> 1;
			@Pc(509) int local509 = this.anInt1561 + this.anInt1597 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static437.aFloat190 + (float) this.anInt1543 * Static29.aFloat23 + Static485.aFloat202 * (float) local501 + Static272.aFloat146);
			@Pc(547) int local547 = (int) (Static427.aFloat188 + Static23.aFloat10 * (float) local501 + (float) this.anInt1543 * Static512.aFloat206 + Static247.aFloat124 * (float) local509);
			@Pc(566) int local566 = (int) (Static109.aFloat48 + Static477.aFloat199 * (float) local501 + (float) this.anInt1543 * Static37.aFloat24 + Static590.aFloat245 * (float) local509);
			if (this.aClass162_Sub1_4.anInt4605 > local566) {
				local491 = true;
			} else {
				arg1.anInt7026 = local547 * this.aClass162_Sub1_4.anInt4590 / local566 + this.aClass162_Sub1_4.anInt4615;
				arg1.anInt7029 = this.aClass162_Sub1_4.anInt4588 * local528 / local566 + this.aClass162_Sub1_4.anInt4619;
			}
			@Pc(624) int local624 = (int) ((float) local509 * Static437.aFloat190 + Static29.aFloat23 * (float) this.anInt1579 + Static272.aFloat146 + Static485.aFloat202 * (float) local501);
			@Pc(643) int local643 = (int) ((float) local509 * Static247.aFloat124 + Static512.aFloat206 * (float) this.anInt1579 + Static23.aFloat10 * (float) local501 + Static427.aFloat188);
			@Pc(662) int local662 = (int) ((float) this.anInt1579 * Static37.aFloat24 + Static109.aFloat48 + Static477.aFloat199 * (float) local501 + Static590.aFloat245 * (float) local509);
			if (this.aClass162_Sub1_4.anInt4605 <= local662) {
				arg1.anInt7028 = local643 * this.aClass162_Sub1_4.anInt4590 / local662 + this.aClass162_Sub1_4.anInt4615;
				arg1.anInt7027 = this.aClass162_Sub1_4.anInt4588 * local624 / local662 + this.aClass162_Sub1_4.anInt4619;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local566 < this.aClass162_Sub1_4.anInt4605 && local662 < this.aClass162_Sub1_4.anInt4605) {
					local493 = false;
				} else {
					@Pc(742) int local742;
					@Pc(752) int local752;
					@Pc(763) int local763;
					if (this.aClass162_Sub1_4.anInt4605 > local566) {
						local742 = (local662 - this.aClass162_Sub1_4.anInt4605 << 16) / (local662 - local566);
						local752 = local624 + (local742 * (local624 - local528) >> 16);
						local763 = (local742 * (local643 - local547) >> 16) + local643;
						arg1.anInt7029 = local752 * this.aClass162_Sub1_4.anInt4588 / this.aClass162_Sub1_4.anInt4605 + this.aClass162_Sub1_4.anInt4619;
						arg1.anInt7026 = this.aClass162_Sub1_4.anInt4590 * local763 / this.aClass162_Sub1_4.anInt4605 + this.aClass162_Sub1_4.anInt4615;
					} else if (local662 < this.aClass162_Sub1_4.anInt4605) {
						local742 = (local566 - this.aClass162_Sub1_4.anInt4605 << 16) / (local566 - local662);
						local752 = local528 + ((local528 - local624) * local742 >> 16);
						local763 = local547 + ((local547 - local643) * local742 >> 16);
						arg1.anInt7029 = this.aClass162_Sub1_4.anInt4588 * local752 / this.aClass162_Sub1_4.anInt4605 + this.aClass162_Sub1_4.anInt4619;
						arg1.anInt7026 = this.aClass162_Sub1_4.anInt4615 + this.aClass162_Sub1_4.anInt4590 * local763 / this.aClass162_Sub1_4.anInt4605;
					}
				}
			}
			if (local493) {
				if (local662 >= local566) {
					arg1.anInt7030 = this.aClass162_Sub1_4.anInt4588 * (this.anInt1560 + local624) / local662 + this.aClass162_Sub1_4.anInt4619 - arg1.anInt7027;
				} else {
					arg1.anInt7030 = this.aClass162_Sub1_4.anInt4588 * (this.anInt1560 + local528) / local566 + this.aClass162_Sub1_4.anInt4619 - arg1.anInt7029;
				}
				arg1.aBoolean576 = true;
			}
		}
		this.aClass162_Sub1_4.method3832();
		this.aClass162_Sub1_4.method3859(local19);
		this.method1332();
		this.method1350();
	}

	@OriginalMember(owner = "client!de", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1514; local15++) {
			local33 = local13 * this.anIntArray142[local15] + this.anIntArray141[local15] * local9 >> 14;
			this.anIntArray141[local15] = this.anIntArray141[local15] * local13 - this.anIntArray142[local15] * local9 >> 14;
			this.anIntArray142[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1518; local33++) {
			@Pc(83) int local83 = this.aShortArray48[local33] * local13 + local9 * this.lb[local33] >> 14;
			this.lb[local33] = (short) (this.lb[local33] * local13 - this.aShortArray48[local33] * local9 >> 14);
			this.aShortArray48[local33] = (short) local83;
		}
		this.method1353();
		this.method1352();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIIIIII)Z")
	private boolean method1336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg5 && arg0 > arg1 && arg1 < arg7) {
			return false;
		} else if (arg5 < arg1 && arg1 > arg0 && arg7 < arg1) {
			return false;
		} else if (arg4 > arg2 && arg2 < arg6 && arg2 < arg3) {
			return false;
		} else {
			return arg2 <= arg4 || arg2 <= arg6 || arg3 >= arg2;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
	@Override
	protected void method7190() {
	}

	@OriginalMember(owner = "client!de", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1514; local3++) {
			if (arg0 != 128) {
				this.anIntArray142[local3] = arg0 * this.anIntArray142[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray145[local3] = this.anIntArray145[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray141[local3] = this.anIntArray141[local3] * arg2 >> 7;
			}
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!q;ZIBI)Z")
	private boolean method1339(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class25_Sub2 local13 = (Class25_Sub2) arg1;
		@Pc(17) Class25_Sub2 local17 = this.aClass162_Sub1_4.aClass25_Sub2_16;
		@Pc(38) float local38 = local13.aFloat72 * local17.aFloat82 + local13.aFloat71 * local17.aFloat76 + local17.aFloat81 * local13.aFloat79 + local17.aFloat79;
		@Pc(59) float local59 = local17.aFloat71 + local17.aFloat75 * local13.aFloat71 + local13.aFloat79 * local17.aFloat77 + local13.aFloat72 * local17.aFloat74;
		Static247.aFloat124 = local13.aFloat82 * local17.aFloat77 + local13.aFloat74 * local17.aFloat75 + local17.aFloat74 * local13.aFloat78;
		Static23.aFloat10 = local13.aFloat81 * local17.aFloat77 + local17.aFloat75 * local13.aFloat77 + local13.aFloat80 * local17.aFloat74;
		Static590.aFloat245 = local17.aFloat78 * local13.aFloat78 + local13.aFloat82 * local17.aFloat80 + local13.aFloat74 * local17.aFloat73;
		Static485.aFloat202 = local17.aFloat82 * local13.aFloat80 + local13.aFloat81 * local17.aFloat81 + local13.aFloat77 * local17.aFloat76;
		@Pc(152) float local152 = local17.aFloat78 * local13.aFloat72 + local17.aFloat80 * local13.aFloat79 + local17.aFloat73 * local13.aFloat71 + local17.aFloat72;
		Static512.aFloat206 = local13.aFloat76 * local17.aFloat77 + local17.aFloat75 * local13.aFloat75 + local17.aFloat74 * local13.aFloat73;
		Static37.aFloat24 = local13.aFloat76 * local17.aFloat80 + local17.aFloat73 * local13.aFloat75 + local17.aFloat78 * local13.aFloat73;
		Static437.aFloat190 = local13.aFloat78 * local17.aFloat82 + local17.aFloat81 * local13.aFloat82 + local17.aFloat76 * local13.aFloat74;
		Static477.aFloat199 = local13.aFloat80 * local17.aFloat78 + local13.aFloat81 * local17.aFloat80 + local17.aFloat73 * local13.aFloat77;
		Static29.aFloat23 = local13.aFloat76 * local17.aFloat81 + local13.aFloat75 * local17.aFloat76 + local13.aFloat73 * local17.aFloat82;
		@Pc(244) boolean local244 = false;
		@Pc(246) float local246 = Float.MAX_VALUE;
		@Pc(248) float local248 = -3.4028235E38F;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass162_Sub1_4.anInt4588;
		@Pc(260) int local260 = this.aClass162_Sub1_4.anInt4590;
		if (!this.aBoolean97) {
			this.method1341();
		}
		Static422.anIntArray449[0] = this.anInt1566;
		Static2.anIntArray1[0] = this.anInt1543;
		Static422.anIntArray449[1] = this.anInt1513;
		Static563.anIntArray599[0] = this.anInt1561;
		Static2.anIntArray1[1] = this.anInt1543;
		Static563.anIntArray599[1] = this.anInt1561;
		Static422.anIntArray449[2] = this.anInt1566;
		Static2.anIntArray1[2] = this.anInt1579;
		Static563.anIntArray599[2] = this.anInt1561;
		Static422.anIntArray449[3] = this.anInt1513;
		Static2.anIntArray1[3] = this.anInt1579;
		Static563.anIntArray599[3] = this.anInt1561;
		Static422.anIntArray449[4] = this.anInt1566;
		Static2.anIntArray1[4] = this.anInt1543;
		Static422.anIntArray449[5] = this.anInt1513;
		Static563.anIntArray599[4] = this.anInt1597;
		Static2.anIntArray1[5] = this.anInt1543;
		Static422.anIntArray449[6] = this.anInt1566;
		Static563.anIntArray599[5] = this.anInt1597;
		Static2.anIntArray1[6] = this.anInt1579;
		Static563.anIntArray599[6] = this.anInt1597;
		Static422.anIntArray449[7] = this.anInt1513;
		Static2.anIntArray1[7] = this.anInt1579;
		Static563.anIntArray599[7] = this.anInt1597;
		@Pc(433) float local433;
		@Pc(447) float local447;
		@Pc(419) float local419;
		@Pc(400) float local400;
		@Pc(405) float local405;
		@Pc(395) float local395;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static563.anIntArray599[local388];
			local400 = Static422.anIntArray449[local388];
			local405 = Static2.anIntArray1[local388];
			local419 = local152 + local405 * Static37.aFloat24 + Static477.aFloat199 * local400 + local395 * Static590.aFloat245;
			local433 = local38 + local400 * Static485.aFloat202 + local405 * Static29.aFloat23 + local395 * Static437.aFloat190;
			local447 = local59 + Static247.aFloat124 * local395 + local400 * Static23.aFloat10 + Static512.aFloat206 * local405;
			if ((float) this.aClass162_Sub1_4.anInt4605 <= local419) {
				if (arg0 > 0) {
					local419 = arg0;
				}
				@Pc(474) float local474 = local433 * (float) local256 / local419 + (float) this.aClass162_Sub1_4.anInt4619;
				if (local474 < local246) {
					local246 = local474;
				}
				if (local248 < local474) {
					local248 = local474;
				}
				@Pc(498) float local498 = (float) this.aClass162_Sub1_4.anInt4615 + local447 * (float) local260 / local419;
				if (local498 < local250) {
					local250 = local498;
				}
				if (local252 < local498) {
					local252 = local498;
				}
				local244 = true;
			}
		}
		if (local244 && local246 < (float) arg3 && local248 > (float) arg3 && (float) arg4 > local250 && local252 > (float) arg4) {
			if (arg2) {
				return true;
			}
			if (this.anInt1518 > Static253.anIntArray304.length) {
				Static253.anIntArray304 = new int[this.anInt1518];
				Static517.anIntArray554 = new int[this.anInt1518];
			}
			@Pc(633) int local633;
			for (@Pc(559) int local559 = 0; local559 < this.anInt1514; local559++) {
				local400 = this.anIntArray142[local559];
				local405 = this.anIntArray145[local559];
				local395 = this.anIntArray141[local559];
				local447 = local59 + Static23.aFloat10 * local400 + Static512.aFloat206 * local405 + local395 * Static247.aFloat124;
				local433 = Static437.aFloat190 * local395 + local400 * Static485.aFloat202 + Static29.aFloat23 * local405 + local38;
				local419 = local152 + Static37.aFloat24 * local405 + local400 * Static477.aFloat199 + Static590.aFloat245 * local395;
				@Pc(640) int local640;
				@Pc(642) int local642;
				@Pc(651) int local651;
				if (local419 >= (float) this.aClass162_Sub1_4.anInt4605) {
					if (arg0 > 0) {
						local419 = arg0;
					}
					local633 = (int) ((float) this.aClass162_Sub1_4.anInt4619 + (float) local256 * local433 / local419);
					local640 = (int) ((float) this.aClass162_Sub1_4.anInt4615 + local447 * (float) local260 / local419);
					local642 = this.anIntArray144[local559];
					local651 = this.anIntArray144[local559 + 1];
					for (@Pc(717) int local717 = local642; local717 < local651; local717++) {
						@Pc(726) int local726 = this.aShortArray37[local717] - 1;
						if (local726 == -1) {
							break;
						}
						Static253.anIntArray304[local726] = local633;
						Static517.anIntArray554[local726] = local640;
					}
				} else {
					local633 = this.anIntArray144[local559];
					local640 = this.anIntArray144[local559 + 1];
					for (local642 = local633; local642 < local640; local642++) {
						local651 = this.aShortArray37[local642] - 1;
						if (local651 == -1) {
							break;
						}
						Static253.anIntArray304[this.aShortArray37[local642] - 1] = -999999;
					}
				}
			}
			for (local633 = 0; local633 < this.anInt1573; local633++) {
				if (Static253.anIntArray304[this.aShortArray46[local633]] != -999999 && Static253.anIntArray304[this.aShortArray40[local633]] != -999999 && Static253.anIntArray304[this.aShortArray45[local633]] != -999999 && this.method1336(Static517.anIntArray554[this.aShortArray40[local633]], arg4, arg3, Static253.anIntArray304[this.aShortArray45[local633]], Static253.anIntArray304[this.aShortArray46[local633]], Static517.anIntArray554[this.aShortArray46[local633]], Static253.anIntArray304[this.aShortArray40[local633]], Static517.anIntArray554[this.aShortArray45[local633]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1579;
	}

	@OriginalMember(owner = "client!de", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.method1353();
		this.method1352();
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	private void method1340() {
		if (!this.aBoolean98) {
			return;
		}
		this.aBoolean98 = false;
		if (this.aClass293Array3 == null && this.aClass163Array3 == null && this.aClass224Array1 == null) {
			if (this.anIntArray142 != null && !Static19.method291(this.anInt1557, this.anInt1558)) {
				if (this.aClass94_2 == null || this.aClass94_2.method1731()) {
					if (!this.aBoolean97) {
						this.method1341();
					}
					this.anIntArray142 = null;
				} else {
					this.aBoolean98 = true;
				}
			}
			if (this.anIntArray145 != null && !Static345.method5014(this.anInt1558, this.anInt1557)) {
				if (this.aClass94_2 == null || this.aClass94_2.method1731()) {
					if (!this.aBoolean97) {
						this.method1341();
					}
					this.anIntArray145 = null;
				} else {
					this.aBoolean98 = true;
				}
			}
			if (this.anIntArray141 != null && !Static480.method6208(this.anInt1557, this.anInt1558)) {
				if (this.aClass94_2 == null || this.aClass94_2.method1731()) {
					if (!this.aBoolean97) {
						this.method1341();
					}
					this.anIntArray141 = null;
				} else {
					this.aBoolean98 = true;
				}
			}
		}
		if (this.aShortArray37 != null && this.anIntArray142 == null && this.anIntArray145 == null && this.anIntArray141 == null) {
			this.anIntArray144 = null;
			this.aShortArray37 = null;
		}
		if (this.aByteArray32 != null && !Static555.method7261(this.anInt1558, this.anInt1557)) {
			label195: {
				label194: {
					@Pc(168) boolean local168;
					if ((this.anInt1557 & 0x37) == 0) {
						if (this.aClass94_1 == null || this.aClass94_1.method1731()) {
							break label194;
						}
						local168 = false;
					} else {
						if (this.aClass94_4 == null || this.aClass94_4.method1731()) {
							break label194;
						}
						local168 = false;
					}
					if (!local168) {
						this.aBoolean98 = true;
						break label195;
					}
				}
				this.aShortArray48 = this.aShortArray38 = this.lb = null;
				this.aByteArray32 = null;
			}
		}
		if (this.aShortArray44 != null && !Static565.method7387(this.anInt1558, this.anInt1557)) {
			if (this.aClass94_1 == null || this.aClass94_1.method1731()) {
				this.aShortArray44 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aByteArray31 != null && !Static171.method2241(this.anInt1557, this.anInt1558)) {
			if (this.aClass94_1 == null || this.aClass94_1.method1731()) {
				this.aByteArray31 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aFloatArray4 != null && !Static446.method5836(this.anInt1558, this.anInt1557)) {
			if (this.aClass94_3 == null || this.aClass94_3.method1731()) {
				this.aFloatArray4 = this.aFloatArray3 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aShortArray47 != null && !Static285.method1874(this.anInt1557, this.anInt1558)) {
			if (this.aClass94_1 == null || this.aClass94_1.method1731()) {
				this.aShortArray47 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aShortArray46 != null && !Static519.method1518(this.anInt1558, this.anInt1557)) {
			if ((this.aClass256_1 == null || this.aClass256_1.method5354()) && (this.aClass94_1 == null || this.aClass94_1.method1731())) {
				this.aShortArray46 = this.aShortArray40 = this.aShortArray45 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aShortArray43 != null) {
			if (this.aClass94_2 == null || this.aClass94_2.method1731()) {
				this.aShortArray43 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.aShortArray41 != null) {
			if (this.aClass94_1 == null || this.aClass94_1.method1731()) {
				this.aShortArray41 = null;
			} else {
				this.aBoolean98 = true;
			}
		}
		if (this.anIntArrayArray24 != null && !Static206.method2569(this.anInt1557, this.anInt1558)) {
			this.anIntArrayArray24 = null;
			this.aShortArray39 = null;
		}
		if (this.anIntArrayArray25 != null && !Static582.method7552(this.anInt1557, this.anInt1558)) {
			this.anIntArrayArray25 = null;
			this.aShortArray42 = null;
		}
		if (this.anIntArrayArray26 != null && !Static533.method7006(this.anInt1557, this.anInt1558)) {
			this.anIntArrayArray26 = null;
		}
		if (this.anIntArray140 != null && (this.anInt1558 & 0x800) == 0 && (this.anInt1558 & 0x40000) == 0) {
			this.anIntArray143 = null;
			this.anIntArray139 = null;
			this.anIntArray140 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	private void method1341() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1514; local27++) {
			@Pc(34) int local34 = this.anIntArray142[local27];
			@Pc(39) int local39 = this.anIntArray145[local27];
			if (local34 < local7) {
				local7 = local34;
			}
			if (local34 > local13) {
				local13 = local34;
			}
			@Pc(62) int local62 = this.anIntArray141[local27];
			if (local39 < local9) {
				local9 = local39;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			if (local62 < local11) {
				local11 = local62;
			}
			if (local17 < local62) {
				local17 = local62;
			}
			@Pc(95) int local95 = local34 * local34 + local62 * local62;
			if (local19 < local95) {
				local19 = local95;
			}
			local95 = local39 * local39 + local34 * local34 + local62 * local62;
			if (local21 < local95) {
				local21 = local95;
			}
		}
		this.anInt1561 = local11;
		this.anInt1566 = local7;
		this.anInt1597 = local17;
		this.anInt1543 = local9;
		this.anInt1513 = local13;
		this.anInt1579 = local15;
		this.anInt1560 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt1531 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!de", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1587; local3++) {
			this.anIntArray142[local3] = this.anIntArray142[local3] + 7 >> 4;
			this.anIntArray145[local3] = this.anIntArray145[local3] + 7 >> 4;
			this.anIntArray141[local3] = this.anIntArray141[local3] + 7 >> 4;
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass162_Sub1_4.anInterface9_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1573; local11++) {
			if (this.aShortArray47[local11] == arg0) {
				this.aShortArray47[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class291 local47 = local9.method1074(arg0 & 0xFFFF);
			local35 = local47.aByte98;
			local37 = local47.aByte101;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class291 local68 = local9.method1074(arg1 & 0xFFFF);
			local55 = local68.aByte98;
			local57 = local68.aByte101;
		}
		if (!(local57 != local37 | local55 != local35)) {
			return;
		}
		if (this.aClass224Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt1583; local101++) {
				@Pc(108) Class224 local108 = this.aClass224Array1[local101];
				@Pc(113) Class238 local113 = this.aClass238Array1[local101];
				local113.anInt6055 = local113.anInt6055 & 0xFF000000 | Static142.anIntArray365[this.aShortArray44[local108.anInt5518] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method1331();
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Z")
	private boolean method1343() {
		@Pc(13) boolean local13 = !this.aClass94_1.aBoolean140;
		@Pc(26) boolean local26 = (this.anInt1557 & 0x37) != 0 && !this.aClass94_4.aBoolean140;
		@Pc(34) boolean local34 = !this.aClass94_2.aBoolean140;
		@Pc(42) boolean local42 = !this.aClass94_3.aBoolean140;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface8 local82;
		@Pc(96) Buffer local96;
		if (local34) {
			if (this.aClass94_2.anInterface8_2 == null) {
				this.aClass94_2.anInterface8_2 = this.aClass162_Sub1_4.method3826(this.aBoolean100);
			}
			local82 = this.aClass94_2.anInterface8_2;
			local82.method5367(this.anInt1518 * 12, 12);
			local96 = local82.method5369();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass162_Sub1_4.aNativeInterface3.copyPositions(this.anIntArray142, this.anIntArray145, this.anIntArray141, this.aShortArray43, 0, 12, this.anInt1518, local96.getAddress());
				if (local82.method5368()) {
					this.aClass94_2.anInterface8_1 = local82;
					this.aClass94_2.aBoolean140 = true;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(186) short[] local186;
		@Pc(194) short[] local194;
		@Pc(190) short[] local190;
		@Pc(198) byte[] local198;
		if (local13) {
			if (this.aClass94_1.anInterface8_2 == null) {
				this.aClass94_1.anInterface8_2 = this.aClass162_Sub1_4.method3826(this.aBoolean100);
			}
			local82 = this.aClass94_1.anInterface8_2;
			local82.method5367(this.anInt1518 * 4, 4);
			local96 = local82.method5369();
			if (local96 == null) {
				local63 = false;
			} else {
				if ((this.anInt1557 & 0x37) == 0) {
					if (this.aClass8_1 == null) {
						local186 = this.aShortArray48;
						local194 = this.aShortArray38;
						local190 = this.lb;
						local198 = this.aByteArray32;
					} else {
						local186 = this.aClass8_1.aShortArray11;
						local190 = this.aClass8_1.aShortArray10;
						local194 = this.aClass8_1.aShortArray9;
						local198 = this.aClass8_1.aByteArray1;
					}
					this.aClass162_Sub1_4.aNativeInterface3.copyLighting(this.aShortArray44, this.aByteArray31, this.aShortArray47, local186, local194, local190, local198, this.aShort18, this.aShort19, this.aShortArray41, 0, 4, this.anInt1518, local96.getAddress());
				} else {
					this.aClass162_Sub1_4.aNativeInterface3.copyColours(this.aShortArray44, this.aByteArray31, this.aShortArray47, this.aShort18, this.aShortArray41, 0, 4, this.anInt1518, local96.getAddress());
				}
				if (local82.method5368()) {
					this.aClass94_1.aBoolean140 = true;
					this.aClass94_1.anInterface8_1 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass94_4.anInterface8_2 == null) {
				this.aClass94_4.anInterface8_2 = this.aClass162_Sub1_4.method3826(this.aBoolean100);
			}
			local82 = this.aClass94_4.anInterface8_2;
			local82.method5367(this.anInt1518 * 12, 12);
			local96 = local82.method5369();
			if (local96 == null) {
				local63 = false;
			} else {
				if (this.aClass8_1 == null) {
					local198 = this.aByteArray32;
					local194 = this.aShortArray38;
					local186 = this.aShortArray48;
					local190 = this.lb;
				} else {
					local198 = this.aClass8_1.aByteArray1;
					local194 = this.aClass8_1.aShortArray9;
					local186 = this.aClass8_1.aShortArray11;
					local190 = this.aClass8_1.aShortArray10;
				}
				this.aClass162_Sub1_4.aNativeInterface3.copyNormals(local186, local194, local190, local198, 3.0F / (float) this.aShort19, 3.0F / (float) (this.aShort19 / 2 + this.aShort19), 0, 12, this.anInt1518, local96.getAddress());
				if (local82.method5368()) {
					this.aClass94_4.anInterface8_1 = local82;
					this.aClass94_4.aBoolean140 = true;
				} else {
					local63 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass94_3.anInterface8_2 == null) {
				this.aClass94_3.anInterface8_2 = this.aClass162_Sub1_4.method3826(this.aBoolean100);
			}
			local82 = this.aClass94_3.anInterface8_2;
			local82.method5367(this.anInt1518 * 8, 8);
			local96 = local82.method5369();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass162_Sub1_4.aNativeInterface3.copyTexCoords(this.aFloatArray4, this.aFloatArray3, 0, 8, this.anInt1518, local96.getAddress());
				if (local82.method5368()) {
					this.aClass94_3.anInterface8_1 = local82;
					this.aClass94_3.aBoolean140 = true;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!de", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1566;
	}

	@OriginalMember(owner = "client!de", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1514; local3++) {
			this.anIntArray141[local3] = -this.anIntArray141[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1518; local25++) {
			this.lb[local25] = (short) -this.lb[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1573; local44++) {
			@Pc(51) short local51 = this.aShortArray46[local44];
			this.aShortArray46[local44] = this.aShortArray45[local44];
			this.aShortArray45[local44] = local51;
		}
		this.method1353();
		this.method1352();
		this.method1346();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1573; local3++) {
			if (arg0 == this.aShortArray44[local3]) {
				this.aShortArray44[local3] = arg1;
			}
		}
		if (this.aClass224Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt1583; local38++) {
				@Pc(45) Class224 local45 = this.aClass224Array1[local38];
				@Pc(50) Class238 local50 = this.aClass238Array1[local38];
				local50.anInt6055 = Static142.anIntArray365[this.aShortArray44[local45.anInt5518] & 0xFFFF] & 0xFFFFFF | local50.anInt6055 & 0xFF000000;
			}
		}
		this.method1331();
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
	@Override
	protected void method7205() {
	}

	@OriginalMember(owner = "client!de", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1531;
	}

	@OriginalMember(owner = "client!de", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray25 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1587; local12++) {
			this.anIntArray142[local12] <<= 0x4;
			this.anIntArray145[local12] <<= 0x4;
			this.anIntArray141[local12] <<= 0x4;
		}
		Static304.anInt5060 = 0;
		Static338.anInt5812 = 0;
		Static138.anInt2260 = 0;
		return true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1573; local3++) {
			local12 = this.aShortArray44[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local42 += (arg2 - local42) * arg3 >> 7;
			}
			this.aShortArray44[local3] = (short) (local24 << 7 | local18 << 10 | local42);
		}
		if (this.aClass224Array1 != null) {
			for (local12 = 0; local12 < this.anInt1583; local12++) {
				@Pc(110) Class224 local110 = this.aClass224Array1[local12];
				@Pc(115) Class238 local115 = this.aClass238Array1[local12];
				local115.anInt6055 = Static142.anIntArray365[this.aShortArray44[local110.anInt5518] & 0xFFFF] & 0xFFFFFF | local115.anInt6055 & 0xFF000000;
			}
		}
		this.method1331();
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
	public void method1344() {
		if (this.aClass94_2 != null) {
			this.aClass94_2.method1729();
		}
		if (this.aClass94_3 != null) {
			this.aClass94_3.method1729();
		}
		if (this.aClass94_1 != null) {
			this.aClass94_1.method1729();
		}
		if (this.aClass94_4 != null) {
			this.aClass94_4.method1729();
		}
		if (this.aClass256_1 != null) {
			this.aClass256_1.method5350();
		}
	}

	@OriginalMember(owner = "client!de", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1597;
	}

	@OriginalMember(owner = "client!de", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1514; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray142[local15] + this.anIntArray141[local15] * local9 >> 14;
			this.anIntArray141[local15] = local13 * this.anIntArray141[local15] - this.anIntArray142[local15] * local9 >> 14;
			this.anIntArray142[local15] = local33;
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "h", descriptor = "(I)V")
	private void method1346() {
		if (this.aClass256_1 != null) {
			this.aClass256_1.aBoolean503 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static338.anInt5812 = 0;
			local29 = 0;
			Static138.anInt2260 = 0;
			Static304.anInt5060 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray25.length) {
					local51 = this.anIntArrayArray25[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static304.anInt5060 += this.anIntArray142[local59];
						Static338.anInt5812 += this.anIntArray145[local59];
						Static138.anInt2260 += this.anIntArray141[local59];
						local29++;
					}
				}
			}
			if (local29 <= 0) {
				Static304.anInt5060 = local21;
				Static138.anInt2260 = local25;
				Static338.anInt5812 = local17;
			} else {
				Static138.anInt2260 = local25 + Static138.anInt2260 / local29;
				Static304.anInt5060 = local21 + Static304.anInt5060 / local29;
				Static338.anInt5812 = Static338.anInt5812 / local29 + local17;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			local17 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray25.length > local35) {
					local158 = this.anIntArrayArray25[local35];
					for (local160 = 0; local160 < local158.length; local160++) {
						local53 = local158[local160];
						this.anIntArray142[local53] += local21;
						this.anIntArray145[local53] += local17;
						this.anIntArray141[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(280) int local280;
		@Pc(299) int local299;
		@Pc(746) int local746;
		@Pc(755) int local755;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray25.length) {
					local158 = this.anIntArrayArray25[local35];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local53 = local158[local160];
							this.anIntArray142[local53] -= Static304.anInt5060;
							this.anIntArray145[local53] -= Static338.anInt5812;
							this.anIntArray141[local53] -= Static138.anInt2260;
							if (arg4 != 0) {
								local59 = Class285.anIntArray476[arg4];
								local280 = Class285.anIntArray475[arg4];
								local299 = this.anIntArray142[local53] * local280 + local59 * this.anIntArray145[local53] + 16383 >> 14;
								this.anIntArray145[local53] = local280 * this.anIntArray145[local53] + 16383 - local59 * this.anIntArray142[local53] >> 14;
								this.anIntArray142[local53] = local299;
							}
							if (arg2 != 0) {
								local59 = Class285.anIntArray476[arg2];
								local280 = Class285.anIntArray475[arg2];
								local299 = this.anIntArray145[local53] * local280 + 16383 - this.anIntArray141[local53] * local59 >> 14;
								this.anIntArray141[local53] = local280 * this.anIntArray141[local53] + local59 * this.anIntArray145[local53] + 16383 >> 14;
								this.anIntArray145[local53] = local299;
							}
							if (arg3 != 0) {
								local59 = Class285.anIntArray476[arg3];
								local280 = Class285.anIntArray475[arg3];
								local299 = this.anIntArray142[local53] * local280 + this.anIntArray141[local53] * local59 + 16383 >> 14;
								this.anIntArray141[local53] = local280 * this.anIntArray141[local53] + 16383 - local59 * this.anIntArray142[local53] >> 14;
								this.anIntArray142[local53] = local299;
							}
							this.anIntArray142[local53] += Static304.anInt5060;
							this.anIntArray145[local53] += Static338.anInt5812;
							this.anIntArray141[local53] += Static138.anInt2260;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local53 = local158[local160];
							this.anIntArray142[local53] -= Static304.anInt5060;
							this.anIntArray145[local53] -= Static338.anInt5812;
							this.anIntArray141[local53] -= Static138.anInt2260;
							if (arg2 != 0) {
								local59 = Class285.anIntArray476[arg2];
								local280 = Class285.anIntArray475[arg2];
								local299 = local280 * this.anIntArray145[local53] + 16383 - this.anIntArray141[local53] * local59 >> 14;
								this.anIntArray141[local53] = local280 * this.anIntArray141[local53] + this.anIntArray145[local53] * local59 + 16383 >> 14;
								this.anIntArray145[local53] = local299;
							}
							if (arg4 != 0) {
								local59 = Class285.anIntArray476[arg4];
								local280 = Class285.anIntArray475[arg4];
								local299 = this.anIntArray142[local53] * local280 + this.anIntArray145[local53] * local59 + 16383 >> 14;
								this.anIntArray145[local53] = local280 * this.anIntArray145[local53] + 16383 - local59 * this.anIntArray142[local53] >> 14;
								this.anIntArray142[local53] = local299;
							}
							if (arg3 != 0) {
								local59 = Class285.anIntArray476[arg3];
								local280 = Class285.anIntArray475[arg3];
								local299 = this.anIntArray141[local53] * local59 + this.anIntArray142[local53] * local280 + 16383 >> 14;
								this.anIntArray141[local53] = local280 * this.anIntArray141[local53] + 16383 - local59 * this.anIntArray142[local53] >> 14;
								this.anIntArray142[local53] = local299;
							}
							this.anIntArray142[local53] += Static304.anInt5060;
							this.anIntArray145[local53] += Static338.anInt5812;
							this.anIntArray141[local53] += Static138.anInt2260;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray25.length > local41) {
						local51 = this.anIntArrayArray25[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local280 = this.anIntArray144[local59];
							local299 = this.anIntArray144[local59 + 1];
							for (local746 = local280; local746 < local299; local746++) {
								local755 = this.aShortArray37[local746] - 1;
								if (local755 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class285.anIntArray476[arg4];
									local772 = Class285.anIntArray475[arg4];
									local790 = local768 * this.aShortArray38[local755] + local772 * this.aShortArray48[local755] + 16383 >> 14;
									this.aShortArray38[local755] = (short) (local772 * this.aShortArray38[local755] + 16383 - this.aShortArray48[local755] * local768 >> 14);
									this.aShortArray48[local755] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class285.anIntArray476[arg2];
									local772 = Class285.anIntArray475[arg2];
									local790 = this.aShortArray38[local755] * local772 + 16383 - this.lb[local755] * local768 >> 14;
									this.lb[local755] = (short) (this.lb[local755] * local772 + local768 * this.aShortArray38[local755] + 16383 >> 14);
									this.aShortArray38[local755] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class285.anIntArray476[arg3];
									local772 = Class285.anIntArray475[arg3];
									local790 = local768 * this.lb[local755] + this.aShortArray48[local755] * local772 + 16383 >> 14;
									this.lb[local755] = (short) (this.lb[local755] * local772 + 16383 - local768 * this.aShortArray48[local755] >> 14);
									this.aShortArray48[local755] = (short) local790;
								}
							}
						}
					}
				}
				this.method1352();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray25.length > local35) {
					local158 = this.anIntArrayArray25[local35];
					for (local160 = 0; local160 < local158.length; local160++) {
						local53 = local158[local160];
						this.anIntArray142[local53] -= Static304.anInt5060;
						this.anIntArray145[local53] -= Static338.anInt5812;
						this.anIntArray141[local53] -= Static138.anInt2260;
						this.anIntArray142[local53] = this.anIntArray142[local53] * arg2 >> 7;
						this.anIntArray145[local53] = this.anIntArray145[local53] * arg3 >> 7;
						this.anIntArray141[local53] = this.anIntArray141[local53] * arg4 >> 7;
						this.anIntArray142[local53] += Static304.anInt5060;
						this.anIntArray145[local53] += Static338.anInt5812;
						this.anIntArray141[local53] += Static138.anInt2260;
					}
				}
			}
		} else {
			@Pc(1209) Class238 local1209;
			@Pc(1103) boolean local1103;
			@Pc(1204) Class224 local1204;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local1103 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray24.length) {
							local51 = this.anIntArrayArray24[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local280 = (this.aByteArray31[local59] & 0xFF) + (arg2 * 8);
								if (local280 < 0) {
									local280 = 0;
								} else if (local280 > 255) {
									local280 = 255;
								}
								this.aByteArray31[local59] = (byte) local280;
							}
							local1103 |= local51.length > 0;
						}
					}
					if (local1103) {
						if (this.aClass224Array1 != null) {
							for (local41 = 0; local41 < this.anInt1583; local41++) {
								local1204 = this.aClass224Array1[local41];
								local1209 = this.aClass238Array1[local41];
								local1209.anInt6055 = 255 - (this.aByteArray31[local1204.anInt5518] & 0xFF) << 24 | local1209.anInt6055 & 0xFFFFFF;
							}
						}
						this.method1331();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local1103 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray24.length) {
							local51 = this.anIntArrayArray24[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local280 = this.aShortArray44[local59] & 0xFFFF;
								local299 = local280 >> 10 & 0x3F;
								local746 = local280 >> 7 & 0x7;
								local746 += arg3 / 4;
								@Pc(1310) int local1310 = arg2 + local299 & 0x3F;
								local755 = local280 & 0x7F;
								if (local746 < 0) {
									local746 = 0;
								} else if (local746 > 7) {
									local746 = 7;
								}
								local755 += arg4;
								if (local755 < 0) {
									local755 = 0;
								} else if (local755 > 127) {
									local755 = 127;
								}
								this.aShortArray44[local59] = (short) (local1310 << 10 | local746 << 7 | local755);
							}
							local1103 |= local51.length > 0;
						}
					}
					if (local1103) {
						if (this.aClass224Array1 != null) {
							for (local41 = 0; local41 < this.anInt1583; local41++) {
								local1204 = this.aClass224Array1[local41];
								local1209 = this.aClass238Array1[local41];
								local1209.anInt6055 = local1209.anInt6055 & 0xFF000000 | Static142.anIntArray365[this.aShortArray44[local1204.anInt5518] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method1331();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray26 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray26.length) {
							local158 = this.anIntArrayArray26[local35];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1209 = this.aClass238Array1[local158[local160]];
								local1209.anInt6058 += arg2;
								local1209.anInt6051 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray26 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray26.length > local35) {
							local158 = this.anIntArrayArray26[local35];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1209 = this.aClass238Array1[local158[local160]];
								local1209.anInt6054 = local1209.anInt6054 * arg3 >> 7;
								local1209.anInt6052 = local1209.anInt6052 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray26 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray26.length) {
						local158 = this.anIntArrayArray26[local35];
						for (local160 = 0; local160 < local158.length; local160++) {
							local1209 = this.aClass238Array1[local158[local160]];
							local1209.anInt6059 = arg2 + local1209.anInt6059 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "i", descriptor = "(I)Z")
	private boolean method1347() {
		if (this.aClass256_1.aBoolean503) {
			return true;
		}
		if (this.aClass256_1.anInterface13_6 == null) {
			this.aClass256_1.anInterface13_6 = this.aClass162_Sub1_4.method3889(this.aBoolean100);
		}
		@Pc(33) Interface13 local33 = this.aClass256_1.anInterface13_6;
		local33.method7035(this.anInt1520 * 6);
		@Pc(47) Buffer local47 = local33.method7034();
		if (local47 != null) {
			@Pc(55) Stream local55 = this.aClass162_Sub1_4.method3907(local47);
			@Pc(59) int local59;
			if (Stream.b()) {
				for (local59 = 0; local59 < this.anInt1520; local59++) {
					local55.e(this.aShortArray46[local59]);
					local55.e(this.aShortArray40[local59]);
					local55.e(this.aShortArray45[local59]);
				}
			} else {
				for (local59 = 0; local59 < this.anInt1520; local59++) {
					local55.b(this.aShortArray46[local59]);
					local55.b(this.aShortArray40[local59]);
					local55.b(this.aShortArray45[local59]);
				}
			}
			local55.c();
			if (local33.method7033()) {
				this.aClass256_1.aBoolean503 = true;
				this.aClass256_1.anInterface13_5 = local33;
				this.aBoolean98 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FILclient!ak;IIIJIIIF)S")
	private short method1348(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray144[arg7];
		@Pc(17) int local17 = this.anIntArray144[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray37[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg6 == Static466.aLongArray15[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray37[local19] = (short) (this.anInt1518 + 1);
		Static466.aLongArray15[local19] = arg6;
		this.aShortArray41[this.anInt1518] = (short) arg4;
		this.aShortArray43[this.anInt1518] = (short) arg7;
		this.aShortArray48[this.anInt1518] = (short) arg5;
		this.aShortArray38[this.anInt1518] = (short) arg1;
		this.lb[this.anInt1518] = (short) arg3;
		this.aByteArray32[this.anInt1518] = (byte) arg8;
		this.aFloatArray4[this.anInt1518] = arg0;
		this.aFloatArray3[this.anInt1518] = arg9;
		return (short) this.anInt1518++;
	}

	@OriginalMember(owner = "client!de", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean97) {
			this.method1341();
		}
		return this.anInt1561;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7189(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class33_Sub2 local8 = (Class33_Sub2) arg0;
		if (this.anInt1573 == 0 || local8.anInt1573 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt1514;
		@Pc(21) int[] local21 = local8.anIntArray142;
		@Pc(24) int[] local24 = local8.anIntArray145;
		@Pc(27) int[] local27 = local8.anIntArray141;
		@Pc(30) short[] local30 = local8.aShortArray48;
		@Pc(33) short[] local33 = local8.aShortArray38;
		@Pc(36) short[] local36 = local8.lb;
		@Pc(39) byte[] local39 = local8.aByteArray32;
		@Pc(50) short[] local50;
		@Pc(48) short[] local48;
		@Pc(44) short[] local44;
		@Pc(46) byte[] local46;
		if (this.aClass8_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local44 = this.aClass8_1.aShortArray10;
			local48 = this.aClass8_1.aShortArray9;
			local50 = this.aClass8_1.aShortArray11;
			local46 = this.aClass8_1.aByteArray1;
		}
		@Pc(79) short[] local79;
		@Pc(73) short[] local73;
		@Pc(77) short[] local77;
		@Pc(75) byte[] local75;
		if (local8.aClass8_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local75 = local8.aClass8_1.aByteArray1;
			local77 = local8.aClass8_1.aShortArray10;
			local73 = local8.aClass8_1.aShortArray9;
			local79 = local8.aClass8_1.aShortArray11;
		}
		@Pc(100) int[] local100 = local8.anIntArray144;
		@Pc(103) short[] local103 = local8.aShortArray37;
		if (!local8.aBoolean97) {
			local8.method1341();
		}
		@Pc(112) int local112 = local8.anInt1543;
		@Pc(115) int local115 = local8.anInt1579;
		@Pc(118) int local118 = local8.anInt1566;
		@Pc(121) int local121 = local8.anInt1513;
		@Pc(124) int local124 = local8.anInt1561;
		@Pc(127) int local127 = local8.anInt1597;
		for (@Pc(129) int local129 = 0; local129 < this.anInt1514; local129++) {
			@Pc(139) int local139 = this.anIntArray145[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(159) int local159 = this.anIntArray142[local129] - arg1;
				if (local159 >= local118 && local159 <= local121) {
					@Pc(178) int local178 = this.anIntArray141[local129] - arg3;
					if (local124 <= local178 && local178 <= local127) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray144[local129];
						@Pc(204) int local204 = this.anIntArray144[local129 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray37[local206] - 1;
							if (local192 == -1 || this.aByteArray32[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local18; local238++) {
								if (local159 == local21[local238] && local178 == local27[local238] && local24[local238] == local139) {
									@Pc(257) int local257 = -1;
									local197 = local100[local238];
									local204 = local100[local238 + 1];
									for (@Pc(269) int local269 = local197; local269 < local204; local269++) {
										local257 = local103[local269] - 1;
										if (local257 == -1 || local39[local257] != 0) {
											break;
										}
									}
									if (local257 != -1) {
										if (local50 == null) {
											this.aClass8_1 = new Class8();
											local50 = this.aClass8_1.aShortArray11 = Static571.method7440(this.aShortArray48);
											local48 = this.aClass8_1.aShortArray9 = Static571.method7440(this.aShortArray38);
											local44 = this.aClass8_1.aShortArray10 = Static571.method7440(this.lb);
											local46 = this.aClass8_1.aByteArray1 = Static544.method7110(this.aByteArray32);
										}
										if (local79 == null) {
											@Pc(348) Class8 local348 = local8.aClass8_1 = new Class8();
											local79 = local348.aShortArray11 = Static571.method7440(local30);
											local73 = local348.aShortArray9 = Static571.method7440(local33);
											local77 = local348.aShortArray10 = Static571.method7440(local36);
											local75 = local348.aByteArray1 = Static544.method7110(local39);
										}
										@Pc(381) short local381 = this.aShortArray48[local192];
										@Pc(386) short local386 = this.aShortArray38[local192];
										@Pc(391) short local391 = this.lb[local192];
										local204 = local100[local238 + 1];
										@Pc(402) byte local402 = this.aByteArray32[local192];
										local197 = local100[local238];
										@Pc(416) int local416;
										for (@Pc(408) int local408 = local197; local408 < local204; local408++) {
											local416 = local103[local408] - 1;
											if (local416 == -1) {
												break;
											}
											if (local75[local416] != 0) {
												local79[local416] += local381;
												local73[local416] += local386;
												local77[local416] += local391;
												local75[local416] += local402;
											}
										}
										local381 = local30[local257];
										local197 = this.anIntArray144[local129];
										local386 = local33[local257];
										local402 = local39[local257];
										local391 = local36[local257];
										local204 = this.anIntArray144[local129 + 1];
										for (local416 = local197; local416 < local204; local416++) {
											@Pc(502) int local502 = this.aShortArray37[local416] - 1;
											if (local502 == -1) {
												break;
											}
											if (local46[local502] != 0) {
												local50[local502] += local381;
												local48[local502] += local386;
												local44[local502] += local391;
												local46[local502] += local402;
											}
										}
										local8.method1352();
										this.method1352();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7197(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray42 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1514; local14++) {
			if ((arg1 & this.aShortArray42[local14]) != 0) {
				if (arg2) {
					arg0.A(this.anIntArray142[local14], this.anIntArray145[local14], this.anIntArray141[local14], local12);
				} else {
					arg0.method5881(this.anIntArray142[local14], this.anIntArray145[local14], this.anIntArray141[local14], local12);
				}
				this.anIntArray142[local14] = local12[0];
				this.anIntArray145[local14] = local12[1];
				this.anIntArray141[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()Z")
	@Override
	public boolean method7180() {
		if (this.aShortArray47 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray47.length; local12++) {
			if (this.aShortArray47[local12] != -1 && !this.aClass162_Sub1_4.anInterface9_10.method1073(this.aShortArray47[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!de", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1514; local15++) {
			@Pc(33) int local33 = this.anIntArray145[local15] * local9 + local13 * this.anIntArray142[local15] >> 14;
			this.anIntArray145[local15] = this.anIntArray145[local15] * local13 - local9 * this.anIntArray142[local15] >> 14;
			this.anIntArray142[local15] = local33;
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean99;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()[Lclient!il;")
	@Override
	public Class163[] method7191() {
		return this.aClass163Array3;
	}

	@OriginalMember(owner = "client!de", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static138.anInt2260 = 0;
			local11 = 0;
			Static338.anInt5812 = 0;
			Static304.anInt5060 = 0;
			for (local17 = 0; local17 < this.anInt1514; local17++) {
				Static304.anInt5060 += this.anIntArray142[local17];
				Static338.anInt5812 += this.anIntArray145[local17];
				Static138.anInt2260 += this.anIntArray141[local17];
				local11++;
			}
			if (local11 <= 0) {
				Static338.anInt5812 = arg2;
				Static304.anInt5060 = arg1;
				Static138.anInt2260 = arg3;
			} else {
				Static138.anInt2260 = Static138.anInt2260 / local11 + arg3;
				Static338.anInt5812 = Static338.anInt5812 / local11 + arg2;
				Static304.anInt5060 = arg1 + Static304.anInt5060 / local11;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt1514; local11++) {
				this.anIntArray142[local11] += arg1;
				this.anIntArray145[local11] += arg2;
				this.anIntArray141[local11] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt1514; local11++) {
					this.anIntArray142[local11] -= Static304.anInt5060;
					this.anIntArray145[local11] -= Static338.anInt5812;
					this.anIntArray141[local11] -= Static138.anInt2260;
					if (arg3 != 0) {
						local17 = Class285.anIntArray476[arg3];
						local162 = Class285.anIntArray475[arg3];
						local180 = this.anIntArray142[local11] * local162 + local17 * this.anIntArray145[local11] + 16383 >> 14;
						this.anIntArray145[local11] = local162 * this.anIntArray145[local11] + 16383 - local17 * this.anIntArray142[local11] >> 14;
						this.anIntArray142[local11] = local180;
					}
					if (arg1 != 0) {
						local17 = Class285.anIntArray476[arg1];
						local162 = Class285.anIntArray475[arg1];
						local180 = this.anIntArray145[local11] * local162 + 16383 - this.anIntArray141[local11] * local17 >> 14;
						this.anIntArray141[local11] = this.anIntArray141[local11] * local162 + this.anIntArray145[local11] * local17 + 16383 >> 14;
						this.anIntArray145[local11] = local180;
					}
					if (arg2 != 0) {
						local17 = Class285.anIntArray476[arg2];
						local162 = Class285.anIntArray475[arg2];
						local180 = this.anIntArray142[local11] * local162 + local17 * this.anIntArray141[local11] + 16383 >> 14;
						this.anIntArray141[local11] = local162 * this.anIntArray141[local11] + 16383 - this.anIntArray142[local11] * local17 >> 14;
						this.anIntArray142[local11] = local180;
					}
					this.anIntArray142[local11] += Static304.anInt5060;
					this.anIntArray145[local11] += Static338.anInt5812;
					this.anIntArray141[local11] += Static138.anInt2260;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt1514; local11++) {
					this.anIntArray142[local11] -= Static304.anInt5060;
					this.anIntArray145[local11] -= Static338.anInt5812;
					this.anIntArray141[local11] -= Static138.anInt2260;
					this.anIntArray142[local11] = arg1 * this.anIntArray142[local11] / 128;
					this.anIntArray145[local11] = this.anIntArray145[local11] * arg2 / 128;
					this.anIntArray141[local11] = this.anIntArray141[local11] * arg3 / 128;
					this.anIntArray142[local11] += Static304.anInt5060;
					this.anIntArray145[local11] += Static338.anInt5812;
					this.anIntArray141[local11] += Static138.anInt2260;
				}
			} else {
				@Pc(507) Class224 local507;
				@Pc(512) Class238 local512;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt1573; local11++) {
						local17 = (this.aByteArray31[local11] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray31[local11] = (byte) local17;
					}
					if (this.aClass224Array1 != null) {
						for (local17 = 0; local17 < this.anInt1583; local17++) {
							local507 = this.aClass224Array1[local17];
							local512 = this.aClass238Array1[local17];
							local512.anInt6055 = local512.anInt6055 & 0xFFFFFF | 255 - (this.aByteArray31[local507.anInt5518] & 0xFF) << 24;
						}
					}
					this.method1331();
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt1573; local11++) {
						local17 = this.aShortArray44[local11] & 0xFFFF;
						local162 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						@Pc(573) int local573 = local17 & 0x7F;
						local180 += arg2 / 4;
						@Pc(585) int local585 = local162 + arg1 & 0x3F;
						local573 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local573 < 0) {
							local573 = 0;
						} else if (local573 > 127) {
							local573 = 127;
						}
						this.aShortArray44[local11] = (short) (local573 | local180 << 7 | local585 << 10);
					}
					if (this.aClass224Array1 != null) {
						for (local17 = 0; local17 < this.anInt1583; local17++) {
							local507 = this.aClass224Array1[local17];
							local512 = this.aClass238Array1[local17];
							local512.anInt6055 = Static142.anIntArray365[this.aShortArray44[local507.anInt5518] & 0xFFFF] & 0xFFFFFF | local512.anInt6055 & 0xFF000000;
						}
					}
					this.method1331();
				} else {
					@Pc(695) Class238 local695;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt1583; local11++) {
							local695 = this.aClass238Array1[local11];
							local695.anInt6051 += arg2;
							local695.anInt6058 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt1583; local11++) {
							local695 = this.aClass238Array1[local11];
							local695.anInt6052 = local695.anInt6052 * arg1 >> 7;
							local695.anInt6054 = arg2 * local695.anInt6054 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt1583; local11++) {
							local695 = this.aClass238Array1[local11];
							local695.anInt6059 = arg1 + local695.anInt6059 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1514; local3++) {
			if (arg0 != 0) {
				this.anIntArray142[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray145[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray141[local3] += arg2;
			}
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	private void method1350() {
		if (this.aClass224Array1 == null) {
			return;
		}
		this.aClass162_Sub1_4.ZA(!this.aBoolean99);
		this.aClass162_Sub1_4.method3836(false);
		this.aClass162_Sub1_4.method3885(Static504.aClass263_4, 1);
		this.aClass162_Sub1_4.method3877(1, Static504.aClass263_4);
		for (@Pc(32) int local32 = 0; local32 < this.anInt1583; local32++) {
			@Pc(39) Class224 local39 = this.aClass224Array1[local32];
			@Pc(44) Class238 local44 = this.aClass238Array1[local32];
			if (!local39.aBoolean434 || !this.aClass162_Sub1_4.method6880()) {
				@Pc(73) float local73 = (float) (this.anIntArray142[local39.anInt5522] + this.anIntArray142[local39.anInt5516] + this.anIntArray142[local39.anInt5519]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray145[local39.anInt5522] + this.anIntArray145[local39.anInt5516] + this.anIntArray145[local39.anInt5519]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray141[local39.anInt5519] + this.anIntArray141[local39.anInt5522] + this.anIntArray141[local39.anInt5516]) * 0.3333333F;
				@Pc(130) float local130 = local95 * Static29.aFloat23 + local73 * Static485.aFloat202 + Static437.aFloat190 * local116 + Static272.aFloat146;
				@Pc(144) float local144 = Static427.aFloat188 + Static247.aFloat124 * local116 + Static23.aFloat10 * local73 + Static512.aFloat206 * local95;
				@Pc(158) float local158 = Static109.aFloat48 + local116 * Static590.aFloat245 + Static477.aFloat199 * local73 + local95 * Static37.aFloat24;
				@Pc(163) Class25_Sub2 local163 = this.aClass162_Sub1_4.method3868();
				local163.method2698(local44.anInt6059, (float) local44.anInt6058 + local130, local39.aShort69 * local44.anInt6054 >> 7, local144 + (float) local44.anInt6051, local158 - (float) local39.anInt5515, local39.aShort70 * local44.anInt6052 >> 7);
				local163.method2712(this.aClass162_Sub1_4.aClass25_Sub2_17);
				this.aClass162_Sub1_4.method3825();
				@Pc(210) int local210 = local44.anInt6055;
				this.aClass162_Sub1_4.method3943(false, local39.aShort68, false);
				this.aClass162_Sub1_4.method3957(local39.aByte62);
				this.aClass162_Sub1_4.method3891(local210);
				this.aClass162_Sub1_4.method3838();
			}
		}
		this.aClass162_Sub1_4.method3877(1, Static64.aClass263_1);
		this.aClass162_Sub1_4.method3885(Static64.aClass263_1, 1);
		this.aClass162_Sub1_4.ZA(true);
	}

	@OriginalMember(owner = "client!de", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class285.anIntArray476[arg0];
		@Pc(13) int local13 = Class285.anIntArray475[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1514; local15++) {
			@Pc(34) int local34 = this.anIntArray145[local15] * local13 - this.anIntArray141[local15] * local9 >> 14;
			this.anIntArray141[local15] = local13 * this.anIntArray141[local15] + local9 * this.anIntArray145[local15] >> 14;
			this.anIntArray145[local15] = local34;
		}
		this.method1353();
		this.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!de", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static304.anInt5060 = 0;
			Static138.anInt2260 = 0;
			local31 = 0;
			Static338.anInt5812 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray25.length > local41) {
					local55 = this.anIntArrayArray25[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray42 == null || (this.aShortArray42[local63] & arg6) != 0) {
							Static304.anInt5060 += this.anIntArray142[local63];
							Static338.anInt5812 += this.anIntArray145[local63];
							Static138.anInt2260 += this.anIntArray141[local63];
							local31++;
						}
					}
				}
			}
			if (local31 > 0) {
				Static304.anInt5060 = arg2 + Static304.anInt5060 / local31;
				Static138.anInt2260 = Static138.anInt2260 / local31 + arg4;
				Static243.aBoolean301 = true;
				Static338.anInt5812 = arg3 + Static338.anInt5812 / local31;
			} else {
				Static338.anInt5812 = arg3;
				Static304.anInt5060 = arg2;
				Static138.anInt2260 = arg4;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg2 * arg7[0] + arg3 * arg7[1] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg7[4] * arg3 + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local31;
				arg3 = local35;
				arg4 = local41;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray25.length) {
					local246 = this.anIntArrayArray25[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray42 == null || (this.aShortArray42[local57] & arg6) != 0) {
							this.anIntArray142[local57] += arg2;
							this.anIntArray145[local57] += arg3;
							this.anIntArray141[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(390) int local390;
		@Pc(409) int local409;
		@Pc(644) int local644;
		@Pc(653) int local653;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(686) int local686;
		@Pc(1017) int local1017;
		@Pc(1025) int local1025;
		@Pc(1180) int local1180;
		@Pc(1206) int local1206;
		@Pc(1210) int local1210;
		@Pc(1218) int local1218;
		@Pc(1223) int local1223;
		@Pc(1227) int local1227;
		@Pc(1231) int local1231;
		@Pc(1233) int local1233;
		@Pc(1360) int[] local1360;
		@Pc(1362) int local1362;
		@Pc(1366) int local1366;
		@Pc(1370) int local1370;
		@Pc(1372) int local1372;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray25.length) {
						local246 = this.anIntArrayArray25[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local57 = local246[local248];
							if (this.aShortArray42 == null || (this.aShortArray42[local57] & arg6) != 0) {
								this.anIntArray142[local57] -= Static304.anInt5060;
								this.anIntArray145[local57] -= Static338.anInt5812;
								this.anIntArray141[local57] -= Static138.anInt2260;
								if (arg4 != 0) {
									local63 = Class285.anIntArray476[arg4];
									local390 = Class285.anIntArray475[arg4];
									local409 = this.anIntArray145[local57] * local63 + local390 * this.anIntArray142[local57] + 16383 >> 14;
									this.anIntArray145[local57] = this.anIntArray145[local57] * local390 + 16383 - this.anIntArray142[local57] * local63 >> 14;
									this.anIntArray142[local57] = local409;
								}
								if (arg2 != 0) {
									local63 = Class285.anIntArray476[arg2];
									local390 = Class285.anIntArray475[arg2];
									local409 = local390 * this.anIntArray145[local57] + 16383 - local63 * this.anIntArray141[local57] >> 14;
									this.anIntArray141[local57] = local390 * this.anIntArray141[local57] + local63 * this.anIntArray145[local57] + 16383 >> 14;
									this.anIntArray145[local57] = local409;
								}
								if (arg3 != 0) {
									local63 = Class285.anIntArray476[arg3];
									local390 = Class285.anIntArray475[arg3];
									local409 = local63 * this.anIntArray141[local57] + this.anIntArray142[local57] * local390 + 16383 >> 14;
									this.anIntArray141[local57] = this.anIntArray141[local57] * local390 + 16383 - local63 * this.anIntArray142[local57] >> 14;
									this.anIntArray142[local57] = local409;
								}
								this.anIntArray142[local57] += Static304.anInt5060;
								this.anIntArray145[local57] += Static338.anInt5812;
								this.anIntArray141[local57] += Static138.anInt2260;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray25.length > local41) {
							local55 = this.anIntArrayArray25[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray42 == null || (arg6 & this.aShortArray42[local63]) != 0) {
									local390 = this.anIntArray144[local63];
									local409 = this.anIntArray144[local63 + 1];
									for (local644 = local390; local644 < local409; local644++) {
										local653 = this.aShortArray37[local644] - 1;
										if (local653 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class285.anIntArray476[arg4];
											local667 = Class285.anIntArray475[arg4];
											local686 = local663 * this.aShortArray38[local653] + local667 * this.aShortArray48[local653] + 16383 >> 14;
											this.aShortArray38[local653] = (short) (local667 * this.aShortArray38[local653] + 16383 - local663 * this.aShortArray48[local653] >> 14);
											this.aShortArray48[local653] = (short) local686;
										}
										if (arg2 != 0) {
											local663 = Class285.anIntArray476[arg2];
											local667 = Class285.anIntArray475[arg2];
											local686 = this.aShortArray38[local653] * local667 + 16383 - this.lb[local653] * local663 >> 14;
											this.lb[local653] = (short) (local667 * this.lb[local653] + this.aShortArray38[local653] * local663 + 16383 >> 14);
											this.aShortArray38[local653] = (short) local686;
										}
										if (arg3 != 0) {
											local663 = Class285.anIntArray476[arg3];
											local667 = Class285.anIntArray475[arg3];
											local686 = local663 * this.lb[local653] + this.aShortArray48[local653] * local667 + 16383 >> 14;
											this.lb[local653] = (short) (this.lb[local653] * local667 + 16383 - local663 * this.aShortArray48[local653] >> 14);
											this.aShortArray48[local653] = (short) local686;
										}
									}
								}
							}
						}
					}
					this.method1352();
					return;
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static243.aBoolean301) {
					local390 = arg7[0] * Static304.anInt5060 + Static338.anInt5812 * arg7[3] + arg7[6] * Static138.anInt2260 + 8192 >> 14;
					local409 = Static338.anInt5812 * arg7[4] + arg7[1] * Static304.anInt5060 + arg7[7] * Static138.anInt2260 + 8192 >> 14;
					local644 = arg7[8] * Static138.anInt2260 + arg7[2] * Static304.anInt5060 + Static338.anInt5812 * arg7[5] + 8192 >> 14;
					local409 += local57;
					local390 += local248;
					Static338.anInt5812 = local409;
					local644 += local63;
					Static304.anInt5060 = local390;
					Static138.anInt2260 = local644;
					Static243.aBoolean301 = false;
				}
				@Pc(985) int[] local985 = new int[9];
				local409 = Class285.anIntArray475[arg2];
				local644 = Class285.anIntArray476[arg2];
				local653 = Class285.anIntArray475[arg3];
				local663 = Class285.anIntArray476[arg3];
				local667 = Class285.anIntArray475[arg4];
				local686 = Class285.anIntArray476[arg4];
				local1017 = local667 * local644 + 8192 >> 14;
				local1025 = local686 * local644 + 8192 >> 14;
				local985[4] = local667 * local409 + 8192 >> 14;
				local985[2] = local663 * local409 + 8192 >> 14;
				local985[1] = local686 * -local653 + local663 * local1017 + 8192 >> 14;
				local985[6] = local667 * -local663 + local1025 * local653 + 8192 >> 14;
				local985[0] = local663 * local1025 + local667 * local653 + 8192 >> 14;
				local985[3] = local686 * local409 + 8192 >> 14;
				local985[8] = local409 * local653 + 8192 >> 14;
				local985[7] = local686 * local663 + local653 * local1017 + 8192 >> 14;
				local985[5] = -local644;
				@Pc(1155) int local1155 = local985[2] * -Static138.anInt2260 + -Static304.anInt5060 * local985[0] + local985[1] * -Static338.anInt5812 + 8192 >> 14;
				local1180 = local985[5] * -Static138.anInt2260 + local985[3] * -Static304.anInt5060 + local985[4] * -Static338.anInt5812 + 8192 >> 14;
				local1206 = local985[8] * -Static138.anInt2260 + -Static304.anInt5060 * local985[6] + -Static338.anInt5812 * local985[7] + 8192 >> 14;
				local1210 = Static304.anInt5060 + local1155;
				@Pc(1214) int local1214 = Static338.anInt5812 + local1180;
				local1218 = Static138.anInt2260 + local1206;
				@Pc(1221) int[] local1221 = new int[9];
				for (local1223 = 0; local1223 < 3; local1223++) {
					for (local1227 = 0; local1227 < 3; local1227++) {
						local1231 = 0;
						for (local1233 = 0; local1233 < 3; local1233++) {
							local1231 += local985[local1233 + local1223 * 3] * arg7[local1233 + local1227 * 3];
						}
						local1221[local1223 * 3 + local1227] = local1231 + 8192 >> 14;
					}
				}
				local1227 = local63 * local985[2] + local57 * local985[1] + local248 * local985[0] + 8192 >> 14;
				local1231 = local985[4] * local57 + local248 * local985[3] + local985[5] * local63 + 8192 >> 14;
				local1227 += local1210;
				local1231 += local1214;
				local1233 = local63 * local985[8] + local57 * local985[7] + local248 * local985[6] + 8192 >> 14;
				local1233 += local1218;
				local1360 = new int[9];
				for (local1362 = 0; local1362 < 3; local1362++) {
					for (local1366 = 0; local1366 < 3; local1366++) {
						local1370 = 0;
						for (local1372 = 0; local1372 < 3; local1372++) {
							local1370 += local1221[local1372 * 3 + local1366] * arg7[local1372 + local1362 * 3];
						}
						local1360[local1366 + local1362 * 3] = local1370 + 8192 >> 14;
					}
				}
				local1366 = arg7[1] * local1231 + local1227 * arg7[0] + local1233 * arg7[2] + 8192 >> 14;
				local1370 = local1233 * arg7[5] + arg7[4] * local1231 + local1227 * arg7[3] + 8192 >> 14;
				local1372 = local1227 * arg7[6] + arg7[7] * local1231 + arg7[8] * local1233 + 8192 >> 14;
				local1366 += local31;
				local1370 += local35;
				local1372 += local41;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (local1508 < this.anIntArrayArray25.length) {
						@Pc(1522) int[] local1522 = this.anIntArrayArray25[local1508];
						for (@Pc(1524) int local1524 = 0; local1524 < local1522.length; local1524++) {
							@Pc(1530) int local1530 = local1522[local1524];
							if (this.aShortArray42 == null || (this.aShortArray42[local1530] & arg6) != 0) {
								@Pc(1574) int local1574 = local1360[2] * this.anIntArray141[local1530] + local1360[1] * this.anIntArray145[local1530] + local1360[0] * this.anIntArray142[local1530] + 8192 >> 14;
								@Pc(1605) int local1605 = local1360[5] * this.anIntArray141[local1530] + this.anIntArray145[local1530] * local1360[4] + local1360[3] * this.anIntArray142[local1530] + 8192 >> 14;
								@Pc(1609) int local1609 = local1605 + local1370;
								@Pc(1613) int local1613 = local1574 + local1366;
								@Pc(1644) int local1644 = local1360[8] * this.anIntArray141[local1530] + this.anIntArray142[local1530] * local1360[6] + this.anIntArray145[local1530] * local1360[7] + 8192 >> 14;
								this.anIntArray142[local1530] = local1613;
								@Pc(1653) int local1653 = local1644 + local1372;
								this.anIntArray145[local1530] = local1609;
								this.anIntArray141[local1530] = local1653;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2582) Class238 local2582;
			@Pc(2472) boolean local2472;
			@Pc(2577) Class224 local2577;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local2472 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray24.length > local41) {
							local55 = this.anIntArrayArray24[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray39 == null || (this.aShortArray39[local63] & arg6) != 0) {
									local390 = arg2 * 8 + (this.aByteArray31[local63] & 0xFF);
									if (local390 < 0) {
										local390 = 0;
									} else if (local390 > 255) {
										local390 = 255;
									}
									this.aByteArray31[local63] = (byte) local390;
								}
							}
							local2472 |= local55.length > 0;
						}
					}
					if (local2472) {
						if (this.aClass224Array1 != null) {
							for (local41 = 0; local41 < this.anInt1583; local41++) {
								local2577 = this.aClass224Array1[local41];
								local2582 = this.aClass238Array1[local41];
								local2582.anInt6055 = local2582.anInt6055 & 0xFFFFFF | 255 - (this.aByteArray31[local2577.anInt5518] & 0xFF) << 24;
							}
						}
						this.method1331();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local2472 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray24.length) {
							local55 = this.anIntArrayArray24[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray39 == null || (arg6 & this.aShortArray39[local63]) != 0) {
									local390 = this.aShortArray44[local63] & 0xFFFF;
									local409 = local390 >> 10 & 0x3F;
									local644 = local390 >> 7 & 0x7;
									local644 += arg3 / 4;
									@Pc(2689) int local2689 = arg2 + local409 & 0x3F;
									local653 = local390 & 0x7F;
									local653 += arg4;
									if (local644 < 0) {
										local644 = 0;
									} else if (local644 > 7) {
										local644 = 7;
									}
									if (local653 < 0) {
										local653 = 0;
									} else if (local653 > 127) {
										local653 = 127;
									}
									this.aShortArray44[local63] = (short) (local653 | local2689 << 10 | local644 << 7);
								}
							}
							local2472 |= local55.length > 0;
						}
					}
					if (local2472) {
						if (this.aClass224Array1 != null) {
							for (local41 = 0; local41 < this.anInt1583; local41++) {
								local2577 = this.aClass224Array1[local41];
								local2582 = this.aClass238Array1[local41];
								local2582.anInt6055 = Static142.anIntArray365[this.aShortArray44[local2577.anInt5518] & 0xFFFF] & 0xFFFFFF | local2582.anInt6055 & 0xFF000000;
							}
						}
						this.method1331();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray26 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray26.length > local35) {
							local246 = this.anIntArrayArray26[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2582 = this.aClass238Array1[local246[local248]];
								local2582.anInt6051 += arg3;
								local2582.anInt6058 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray26 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray26.length) {
							local246 = this.anIntArrayArray26[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2582 = this.aClass238Array1[local246[local248]];
								local2582.anInt6054 = arg3 * local2582.anInt6054 >> 7;
								local2582.anInt6052 = local2582.anInt6052 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray26 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray26.length) {
						local246 = this.anIntArrayArray26[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local2582 = this.aClass238Array1[local246[local248]];
							local2582.anInt6059 = local2582.anInt6059 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray25.length > local35) {
					local246 = this.anIntArrayArray25[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local57 = local246[local248];
						if (this.aShortArray42 == null || (this.aShortArray42[local57] & arg6) != 0) {
							this.anIntArray142[local57] -= Static304.anInt5060;
							this.anIntArray145[local57] -= Static338.anInt5812;
							this.anIntArray141[local57] -= Static138.anInt2260;
							this.anIntArray142[local57] = arg2 * this.anIntArray142[local57] >> 7;
							this.anIntArray145[local57] = arg3 * this.anIntArray145[local57] >> 7;
							this.anIntArray141[local57] = this.anIntArray141[local57] * arg4 >> 7;
							this.anIntArray142[local57] += Static304.anInt5060;
							this.anIntArray145[local57] += Static338.anInt5812;
							this.anIntArray141[local57] += Static138.anInt2260;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static243.aBoolean301) {
				local390 = arg7[6] * Static138.anInt2260 + arg7[3] * Static338.anInt5812 + Static304.anInt5060 * arg7[0] + 8192 >> 14;
				local409 = arg7[1] * Static304.anInt5060 + Static338.anInt5812 * arg7[4] + arg7[7] * Static138.anInt2260 + 8192 >> 14;
				local390 += local248;
				local644 = Static304.anInt5060 * arg7[2] + arg7[5] * Static338.anInt5812 + arg7[8] * Static138.anInt2260 + 8192 >> 14;
				local409 += local57;
				Static304.anInt5060 = local390;
				Static338.anInt5812 = local409;
				local644 += local63;
				Static243.aBoolean301 = false;
				Static138.anInt2260 = local644;
			}
			local390 = arg2 << 15 >> 7;
			local409 = arg3 << 15 >> 7;
			local644 = arg4 << 15 >> 7;
			local653 = local390 * -Static304.anInt5060 + 8192 >> 14;
			local663 = -Static338.anInt5812 * local409 + 8192 >> 14;
			local667 = local644 * -Static138.anInt2260 + 8192 >> 14;
			local686 = local653 + Static304.anInt5060;
			local1017 = local663 + Static338.anInt5812;
			local1025 = local667 + Static138.anInt2260;
			@Pc(1866) int[] local1866 = new int[] { arg7[0] * local390 + 8192 >> 14, arg7[3] * local390 + 8192 >> 14, arg7[6] * local390 + 8192 >> 14, local409 * arg7[1] + 8192 >> 14, arg7[4] * local409 + 8192 >> 14, arg7[7] * local409 + 8192 >> 14, local644 * arg7[2] + 8192 >> 14, local644 * arg7[5] + 8192 >> 14, arg7[8] * local644 + 8192 >> 14 };
			local1180 = local248 * local390 + 8192 >> 14;
			local1206 = local409 * local57 + 8192 >> 14;
			@Pc(1994) int local1994 = local1206 + local1017;
			local1210 = local63 * local644 + 8192 >> 14;
			@Pc(2006) int local2006 = local1180 + local686;
			@Pc(2010) int local2010 = local1210 + local1025;
			@Pc(2013) int[] local2013 = new int[9];
			@Pc(2019) int local2019;
			for (local1218 = 0; local1218 < 3; local1218++) {
				for (local2019 = 0; local2019 < 3; local2019++) {
					local1223 = 0;
					for (local1227 = 0; local1227 < 3; local1227++) {
						local1223 += local1866[local2019 + local1227 * 3] * arg7[local1227 + local1218 * 3];
					}
					local2013[local2019 + local1218 * 3] = local1223 + 8192 >> 14;
				}
			}
			local2019 = local2010 * arg7[2] + local2006 * arg7[0] + local1994 * arg7[1] + 8192 >> 14;
			local1223 = arg7[4] * local1994 + arg7[3] * local2006 + local2010 * arg7[5] + 8192 >> 14;
			local1223 += local35;
			local2019 += local31;
			local1227 = arg7[6] * local2006 + local1994 * arg7[7] + local2010 * arg7[8] + 8192 >> 14;
			local1227 += local41;
			for (local1231 = 0; local1231 < local8; local1231++) {
				local1233 = arg1[local1231];
				if (this.anIntArrayArray25.length > local1233) {
					local1360 = this.anIntArrayArray25[local1233];
					for (local1362 = 0; local1362 < local1360.length; local1362++) {
						local1366 = local1360[local1362];
						if (this.aShortArray42 == null || (this.aShortArray42[local1366] & arg6) != 0) {
							local1370 = local2013[2] * this.anIntArray141[local1366] + this.anIntArray142[local1366] * local2013[0] + this.anIntArray145[local1366] * local2013[1] + 8192 >> 14;
							local1372 = local2013[5] * this.anIntArray141[local1366] + this.anIntArray142[local1366] * local2013[3] + local2013[4] * this.anIntArray145[local1366] + 8192 >> 14;
							local1502 = this.anIntArray141[local1366] * local2013[8] + local2013[6] * this.anIntArray142[local1366] + this.anIntArray145[local1366] * local2013[7] + 8192 >> 14;
							@Pc(2290) int local2290 = local1372 + local1223;
							@Pc(2294) int local2294 = local1370 + local2019;
							@Pc(2298) int local2298 = local1502 + local1227;
							this.anIntArray142[local1366] = local2294;
							this.anIntArray145[local1366] = local2290;
							this.anIntArray141[local1366] = local2298;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V")
	private void method1352() {
		if ((this.anInt1557 & 0x37) == 0) {
			if (this.aClass94_1 != null) {
				this.aClass94_1.aBoolean140 = false;
			}
		} else if (this.aClass94_4 != null) {
			this.aClass94_4.aBoolean140 = false;
		}
	}

	@OriginalMember(owner = "client!de", name = "j", descriptor = "(I)V")
	private void method1353() {
		if (this.aClass94_2 != null) {
			this.aClass94_2.aBoolean140 = false;
		}
	}
}
