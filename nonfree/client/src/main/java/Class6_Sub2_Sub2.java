import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "Lclient!ma;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "Lclient!fd;")
	private Class52 aClass52_5;

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Lclient!kj;")
	public Class96 aClass96_1;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "Lclient!ma;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "Lclient!ma;")
	public Class110 aClass110_3;

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "Lclient!ma;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
	private int[] anIntArray299;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!jm", name = "O", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!jm", name = "P", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!jm", name = "R", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "Lclient!ma;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!jm", name = "T", descriptor = "Lclient!kl;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!jm", name = "U", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!jm", name = "V", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!jm", name = "Z", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!jm", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jm", name = "bb", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!jm", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!jm", name = "eb", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	private int anInt2525 = 0;

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
	private int anInt2528 = 0;

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
	public int anInt2527 = 0;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
	private int anInt2526 = 0;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!jm", name = "db", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!gd;IIZ)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt1640];
		this.anIntArray296 = new int[arg0.anInt1644 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt1640; local35++) {
			if ((arg0.aByteArray34 == null || arg0.aByteArray34[local35] != 2) && (arg0.aShortArray32 == null || arg0.aShortArray32[local35] == -1 || !Static208.anInterface4_1.method987(arg0.aShortArray32[local35] & 0xFFFF))) {
				local26[this.anInt2526++] = local35;
				this.anIntArray296[arg0.anIntArray211[local35]]++;
				this.anIntArray296[arg0.anIntArray213[local35]]++;
				this.anIntArray296[arg0.anIntArray215[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt2526];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt2526; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray32 != null) {
				local138 = arg0.aShortArray32[local128];
				if (local138 != -1) {
					local134 = Static208.anInterface4_1.method995(local138 & 0xFFFF);
					local136 = Static208.anInterface4_1.method985(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray32 != null && arg0.aByteArray32[local128] != 0 || local138 != -1 && !Static208.anInterface4_1.method983(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray28 != null) {
				local130 += arg0.aByteArray28[local128] << 17;
			}
			if (local185) {
				local130 += 65536;
			}
			local130 += (local134 & 0xFF) << 8;
			local130 += local136 & 0xFF;
			local229 = local132 + ((local138 & 0xFFFF) << 16);
			@Pc(235) int local235 = local229 + (local120 & 0xFFFF);
			local118[local120] = ((long) local130 << 32) + (long) local235;
		}
		Static235.method3739(local118, local26);
		this.anInt2527 = arg0.anInt1644;
		this.anInt2525 = arg0.anInt1642;
		this.anIntArray295 = arg0.anIntArray216;
		this.anIntArray300 = arg0.anIntArray209;
		this.anIntArray298 = arg0.anIntArray217;
		this.anIntArray297 = arg0.anIntArray219;
		this.aShortArray60 = arg0.aShortArray28;
		local120 = this.anInt2526 * 3;
		this.aShortArray63 = new short[local120];
		this.aShortArray54 = new short[local120];
		this.aShortArray59 = new short[local120];
		this.aShortArray55 = new short[local120];
		this.aFloatArray19 = new float[local120];
		this.aFloatArray20 = new float[local120];
		this.aShortArray53 = new short[this.anInt2526];
		this.aByteArray48 = new byte[this.anInt2526];
		this.aShortArray56 = new short[this.anInt2526];
		this.aShortArray62 = new short[this.anInt2526];
		this.aShortArray58 = new short[this.anInt2526];
		this.aShortArray61 = new short[this.anInt2526];
		if (arg0.anIntArray210 != null) {
			this.aByteArray49 = new byte[this.anInt2526];
		}
		if (arg0.aShortArray26 != null) {
			this.aShortArray57 = new short[this.anInt2526];
		}
		this.aClass96_1 = new Class96();
		this.aClass110_3 = new Class110();
		this.aClass110_4 = new Class110();
		if (Static294.aBoolean445) {
			this.aClass110_1 = new Class110();
		}
		this.aClass110_5 = new Class110();
		this.aClass110_2 = new Class110();
		this.aShort23 = (short) arg1;
		this.aShort22 = (short) arg2;
		this.aShortArray52 = new short[local120];
		Static132.aLongArray7 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt2525; local130++) {
			local229 = this.anIntArray296[local130];
			this.anIntArray296[local130] = local128;
			local128 += local229;
		}
		this.anIntArray296[this.anInt2525] = local128;
		@Pc(433) int[] local433 = null;
		@Pc(435) int[] local435 = null;
		@Pc(437) int[] local437 = null;
		@Pc(440) float[][] local440 = null;
		@Pc(560) int local560;
		@Pc(446) int local446;
		@Pc(690) float local690;
		@Pc(721) float local721;
		@Pc(692) float local692;
		if (arg0.aByteArray27 != null) {
			local446 = arg0.anInt1643;
			@Pc(449) int[] local449 = new int[local446];
			@Pc(452) int[] local452 = new int[local446];
			@Pc(455) int[] local455 = new int[local446];
			@Pc(458) int[] local458 = new int[local446];
			@Pc(461) int[] local461 = new int[local446];
			@Pc(464) int[] local464 = new int[local446];
			@Pc(466) int local466;
			for (local466 = 0; local466 < local446; local466++) {
				local449[local466] = Integer.MAX_VALUE;
				local452[local466] = -2147483647;
				local455[local466] = Integer.MAX_VALUE;
				local458[local466] = -2147483647;
				local461[local466] = Integer.MAX_VALUE;
				local464[local466] = -2147483647;
			}
			for (local466 = 0; local466 < this.anInt2526; local466++) {
				@Pc(505) int local505 = local26[local466];
				if (arg0.aByteArray27[local505] != -1) {
					@Pc(518) int local518 = arg0.aByteArray27[local505] & 0xFF;
					for (@Pc(520) int local520 = 0; local520 < 3; local520++) {
						@Pc(530) int local530;
						if (local520 == 0) {
							local530 = arg0.anIntArray211[local505];
						} else if (local520 == 1) {
							local530 = arg0.anIntArray213[local505];
						} else {
							local530 = arg0.anIntArray215[local505];
						}
						@Pc(550) int local550 = arg0.anIntArray216[local530];
						@Pc(555) int local555 = arg0.anIntArray209[local530];
						local560 = arg0.anIntArray217[local530];
						if (local550 < local449[local518]) {
							local449[local518] = local550;
						}
						if (local550 > local452[local518]) {
							local452[local518] = local550;
						}
						if (local555 < local455[local518]) {
							local455[local518] = local555;
						}
						if (local555 > local458[local518]) {
							local458[local518] = local555;
						}
						if (local560 < local461[local518]) {
							local461[local518] = local560;
						}
						if (local560 > local464[local518]) {
							local464[local518] = local560;
						}
					}
				}
			}
			local433 = new int[local446];
			local435 = new int[local446];
			local437 = new int[local446];
			local440 = new float[local446][];
			for (local466 = 0; local466 < local446; local466++) {
				@Pc(640) byte local640 = arg0.aByteArray33[local466];
				if (local640 > 0) {
					local433[local466] = (local449[local466] + local452[local466]) / 2;
					local435[local466] = (local455[local466] + local458[local466]) / 2;
					local437[local466] = (local461[local466] + local464[local466]) / 2;
					if (local640 == 1) {
						@Pc(686) short local686 = arg0.aShortArray31[local466];
						if (local686 == 0) {
							local690 = 1.0F;
							local692 = 1.0F;
						} else if (local686 > 0) {
							local690 = 1.0F;
							local692 = (float) local686 / 1024.0F;
						} else {
							local692 = 1.0F;
							local690 = (float) -local686 / 1024.0F;
						}
						local721 = 64.0F / (float) (arg0.aShortArray30[local466] & 0xFFFF);
					} else if (local640 == 2) {
						local690 = 64.0F / (float) (arg0.aShortArray31[local466] & 0xFFFF);
						local721 = 64.0F / (float) (arg0.aShortArray30[local466] & 0xFFFF);
						local692 = 64.0F / (float) (arg0.aShortArray35[local466] & 0xFFFF);
					} else {
						local690 = (float) arg0.aShortArray31[local466] / 1024.0F;
						local721 = (float) arg0.aShortArray30[local466] / 1024.0F;
						local692 = (float) arg0.aShortArray35[local466] / 1024.0F;
					}
					local440[local466] = Static132.method2112(arg0.aShortArray27[local466], arg0.aShortArray33[local466], arg0.aShortArray29[local466], arg0.aByteArray29[local466] & 0xFF, local690, local721, local692);
				}
			}
		}
		@Pc(824) int local824;
		@Pc(829) short local829;
		for (local446 = 0; local446 < this.anInt2526; local446++) {
			@Pc(817) int local817 = local26[local446];
			local824 = arg0.aShortArray34[local817] & 0xFFFF;
			if (arg0.aShortArray32 == null) {
				local829 = -1;
			} else {
				local829 = arg0.aShortArray32[local817];
			}
			@Pc(840) int local840;
			if (arg0.aByteArray27 == null) {
				local840 = -1;
			} else {
				local840 = arg0.aByteArray27[local817];
			}
			@Pc(851) int local851;
			if (arg0.aByteArray32 == null) {
				local851 = 0;
			} else {
				local851 = arg0.aByteArray32[local817] & 0xFF;
			}
			@Pc(861) float local861 = 0.0F;
			@Pc(863) float local863 = 0.0F;
			@Pc(865) float local865 = 0.0F;
			local690 = 0.0F;
			local721 = 0.0F;
			local692 = 0.0F;
			@Pc(873) byte local873 = 0;
			@Pc(875) byte local875 = 0;
			local560 = 0;
			@Pc(909) byte local909;
			@Pc(926) int local926;
			@Pc(1287) int local1287;
			if (local829 != -1) {
				if (local840 == -1) {
					local861 = 0.0F;
					local863 = 1.0F;
					local865 = 1.0F;
					local690 = 1.0F;
					local873 = 1;
					local721 = 0.0F;
					local692 = 0.0F;
					local875 = 2;
				} else {
					local840 &= 0xFF;
					local909 = arg0.aByteArray33[local840];
					@Pc(916) int local916;
					@Pc(921) int local921;
					@Pc(959) float local959;
					@Pc(967) float local967;
					@Pc(975) float local975;
					@Pc(1055) float local1055;
					@Pc(1063) float local1063;
					@Pc(1071) float local1071;
					@Pc(1079) float local1079;
					@Pc(1087) float local1087;
					@Pc(1095) float local1095;
					if (local909 == 0) {
						local916 = arg0.anIntArray211[local817];
						local921 = arg0.anIntArray213[local817];
						local926 = arg0.anIntArray215[local817];
						@Pc(931) short local931 = arg0.aShortArray27[local840];
						@Pc(936) short local936 = arg0.aShortArray33[local840];
						@Pc(941) short local941 = arg0.aShortArray29[local840];
						@Pc(947) float local947 = (float) arg0.anIntArray216[local931];
						@Pc(953) float local953 = (float) arg0.anIntArray209[local931];
						local959 = arg0.anIntArray217[local931];
						local967 = (float) arg0.anIntArray216[local936] - local947;
						local975 = (float) arg0.anIntArray209[local936] - local953;
						@Pc(983) float local983 = (float) arg0.anIntArray217[local936] - local959;
						@Pc(991) float local991 = (float) arg0.anIntArray216[local941] - local947;
						@Pc(999) float local999 = (float) arg0.anIntArray209[local941] - local953;
						@Pc(1007) float local1007 = (float) arg0.anIntArray217[local941] - local959;
						@Pc(1015) float local1015 = (float) arg0.anIntArray216[local916] - local947;
						@Pc(1023) float local1023 = (float) arg0.anIntArray209[local916] - local953;
						@Pc(1031) float local1031 = (float) arg0.anIntArray217[local916] - local959;
						@Pc(1039) float local1039 = (float) arg0.anIntArray216[local921] - local947;
						@Pc(1047) float local1047 = (float) arg0.anIntArray209[local921] - local953;
						local1055 = (float) arg0.anIntArray217[local921] - local959;
						local1063 = (float) arg0.anIntArray216[local926] - local947;
						local1071 = (float) arg0.anIntArray209[local926] - local953;
						local1079 = (float) arg0.anIntArray217[local926] - local959;
						local1087 = local975 * local1007 - local983 * local999;
						local1095 = local983 * local991 - local967 * local1007;
						@Pc(1103) float local1103 = local967 * local999 - local975 * local991;
						@Pc(1111) float local1111 = local999 * local1103 - local1007 * local1095;
						@Pc(1119) float local1119 = local1007 * local1087 - local991 * local1103;
						@Pc(1127) float local1127 = local991 * local1095 - local999 * local1087;
						@Pc(1141) float local1141 = 1.0F / (local1111 * local967 + local1119 * local975 + local1127 * local983);
						local861 = (local1111 * local1015 + local1119 * local1023 + local1127 * local1031) * local1141;
						local865 = (local1111 * local1039 + local1119 * local1047 + local1127 * local1055) * local1141;
						local721 = (local1111 * local1063 + local1119 * local1071 + local1127 * local1079) * local1141;
						@Pc(1191) float local1191 = local975 * local1103 - local983 * local1095;
						@Pc(1199) float local1199 = local983 * local1087 - local967 * local1103;
						@Pc(1207) float local1207 = local967 * local1095 - local975 * local1087;
						@Pc(1221) float local1221 = 1.0F / (local1191 * local991 + local1199 * local999 + local1207 * local1007);
						local863 = (local1191 * local1015 + local1199 * local1023 + local1207 * local1031) * local1221;
						local690 = (local1191 * local1039 + local1199 * local1047 + local1207 * local1055) * local1221;
						local692 = (local1191 * local1063 + local1199 * local1071 + local1207 * local1079) * local1221;
					} else {
						local916 = arg0.anIntArray211[local817];
						local921 = arg0.anIntArray213[local817];
						local926 = arg0.anIntArray215[local817];
						@Pc(1283) int local1283 = local433[local840];
						local1287 = local435[local840];
						@Pc(1291) int local1291 = local437[local840];
						@Pc(1295) float[] local1295 = local440[local840];
						@Pc(1300) byte local1300 = arg0.aByteArray30[local840];
						local959 = (float) arg0.aByteArray31[local840] / 256.0F;
						if (local909 == 1) {
							local967 = (float) (arg0.aShortArray35[local840] & 0xFFFF) / 1024.0F;
							Static132.method2105(arg0.anIntArray216[local916], arg0.anIntArray209[local916], arg0.anIntArray217[local916], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local861 = Static132.aFloat69;
							local863 = Static132.aFloat74;
							Static132.method2105(arg0.anIntArray216[local921], arg0.anIntArray209[local921], arg0.anIntArray217[local921], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local865 = Static132.aFloat69;
							local690 = Static132.aFloat74;
							Static132.method2105(arg0.anIntArray216[local926], arg0.anIntArray209[local926], arg0.anIntArray217[local926], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local721 = Static132.aFloat69;
							local692 = Static132.aFloat74;
							local975 = local967 / 2.0F;
							if ((local1300 & 0x1) == 0) {
								if (local865 - local861 > local975) {
									local865 -= local967;
									local873 = 1;
								} else if (local861 - local865 > local975) {
									local865 += local967;
									local873 = 2;
								}
								if (local721 - local861 > local975) {
									local721 -= local967;
									local875 = 1;
								} else if (local861 - local721 > local975) {
									local721 += local967;
									local875 = 2;
								}
							} else {
								if (local690 - local863 > local975) {
									local690 -= local967;
									local873 = 1;
								} else if (local863 - local690 > local975) {
									local690 += local967;
									local873 = 2;
								}
								if (local692 - local863 > local975) {
									local692 -= local967;
									local875 = 1;
								} else if (local863 - local692 > local975) {
									local692 += local967;
									local875 = 2;
								}
							}
						} else if (local909 == 2) {
							local967 = (float) arg0.aByteArray25[local840] / 256.0F;
							local975 = (float) arg0.aByteArray26[local840] / 256.0F;
							@Pc(1532) int local1532 = arg0.anIntArray216[local921] - arg0.anIntArray216[local916];
							@Pc(1542) int local1542 = arg0.anIntArray209[local921] - arg0.anIntArray209[local916];
							@Pc(1552) int local1552 = arg0.anIntArray217[local921] - arg0.anIntArray217[local916];
							@Pc(1562) int local1562 = arg0.anIntArray216[local926] - arg0.anIntArray216[local916];
							@Pc(1572) int local1572 = arg0.anIntArray209[local926] - arg0.anIntArray209[local916];
							@Pc(1582) int local1582 = arg0.anIntArray217[local926] - arg0.anIntArray217[local916];
							@Pc(1590) int local1590 = local1542 * local1582 - local1572 * local1552;
							@Pc(1598) int local1598 = local1552 * local1562 - local1582 * local1532;
							@Pc(1606) int local1606 = local1532 * local1572 - local1562 * local1542;
							local1055 = 64.0F / (float) (arg0.aShortArray31[local840] & 0xFFFF);
							local1063 = 64.0F / (float) (arg0.aShortArray30[local840] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray35[local840] & 0xFFFF);
							local1079 = ((float) local1590 * local1295[0] + (float) local1598 * local1295[1] + (float) local1606 * local1295[2]) / local1055;
							local1087 = ((float) local1590 * local1295[3] + (float) local1598 * local1295[4] + (float) local1606 * local1295[5]) / local1063;
							local1095 = ((float) local1590 * local1295[6] + (float) local1598 * local1295[7] + (float) local1606 * local1295[8]) / local1071;
							local560 = Static132.method2104(local1079, local1087, local1095);
							Static132.method2110(arg0.anIntArray216[local916], arg0.anIntArray209[local916], arg0.anIntArray217[local916], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local861 = Static132.aFloat70;
							local863 = Static132.aFloat71;
							Static132.method2110(arg0.anIntArray216[local921], arg0.anIntArray209[local921], arg0.anIntArray217[local921], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local865 = Static132.aFloat70;
							local690 = Static132.aFloat71;
							Static132.method2110(arg0.anIntArray216[local926], arg0.anIntArray209[local926], arg0.anIntArray217[local926], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local721 = Static132.aFloat70;
							local692 = Static132.aFloat71;
						} else if (local909 == 3) {
							Static132.method2102(arg0.anIntArray216[local916], arg0.anIntArray209[local916], arg0.anIntArray217[local916], local1283, local1287, local1291, local1295, local1300, local959);
							local861 = Static132.aFloat73;
							local863 = Static132.aFloat72;
							Static132.method2102(arg0.anIntArray216[local921], arg0.anIntArray209[local921], arg0.anIntArray217[local921], local1283, local1287, local1291, local1295, local1300, local959);
							local865 = Static132.aFloat73;
							local690 = Static132.aFloat72;
							Static132.method2102(arg0.anIntArray216[local926], arg0.anIntArray209[local926], arg0.anIntArray217[local926], local1283, local1287, local1291, local1295, local1300, local959);
							local721 = Static132.aFloat73;
							local692 = Static132.aFloat72;
							if ((local1300 & 0x1) == 0) {
								if (local865 - local861 > 0.5F) {
									local865--;
									local873 = 1;
								} else if (local861 - local865 > 0.5F) {
									local865++;
									local873 = 2;
								}
								if (local721 - local861 > 0.5F) {
									local721--;
									local875 = 1;
								} else if (local861 - local721 > 0.5F) {
									local721++;
									local875 = 2;
								}
							} else {
								if (local690 - local863 > 0.5F) {
									local690--;
									local873 = 1;
								} else if (local863 - local690 > 0.5F) {
									local690++;
									local873 = 2;
								}
								if (local692 - local863 > 0.5F) {
									local692--;
									local875 = 1;
								} else if (local863 - local692 > 0.5F) {
									local692++;
									local875 = 2;
								}
							}
						}
					}
				}
			}
			arg0.method1436();
			if (arg0.aByteArray34 == null) {
				local909 = 0;
			} else {
				local909 = arg0.aByteArray34[local817];
			}
			if (local909 == 0) {
				@Pc(2001) long local2001 = (long) (local840 << 2) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				local926 = arg0.anIntArray211[local817];
				@Pc(2011) Class12 local2011 = arg0.aClass12Array1[local926];
				this.aShortArray56[local446] = this.method2103(arg0, local926, local2001, local2011.anInt422, local2011.anInt419, local2011.anInt421, local2011.anInt423, local861, local863);
				local1287 = arg0.anIntArray213[local817];
				@Pc(2040) Class12 local2040 = arg0.aClass12Array1[local1287];
				this.aShortArray62[local446] = this.method2103(arg0, local1287, local2001 + (long) local873, local2040.anInt422, local2040.anInt419, local2040.anInt421, local2040.anInt423, local865, local690);
				@Pc(2067) int local2067 = arg0.anIntArray215[local817];
				@Pc(2072) Class12 local2072 = arg0.aClass12Array1[local2067];
				this.aShortArray58[local446] = this.method2103(arg0, local2067, local2001 + (long) local875, local2072.anInt422, local2072.anInt419, local2072.anInt421, local2072.anInt423, local721, local692);
			} else if (local909 == 1) {
				@Pc(2103) Class134 local2103 = arg0.aClass134Array1[local817];
				@Pc(2144) long local2144 = (long) ((local840 << 2) + (local2103.anInt4124 > 0 ? 1024 : 2048) + (local2103.anInt4119 + 256 << 12) + (local2103.anInt4121 + 256 << 22)) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				this.aShortArray56[local446] = this.method2103(arg0, arg0.anIntArray211[local817], local2144, local2103.anInt4124, local2103.anInt4119, local2103.anInt4121, 0, local861, local863);
				this.aShortArray62[local446] = this.method2103(arg0, arg0.anIntArray213[local817], local2144 + (long) local873, local2103.anInt4124, local2103.anInt4119, local2103.anInt4121, 0, local865, local690);
				this.aShortArray58[local446] = this.method2103(arg0, arg0.anIntArray215[local817], local2144 + (long) local875, local2103.anInt4124, local2103.anInt4119, local2103.anInt4121, 0, local721, local692);
			}
			if (arg0.aShortArray32 == null) {
				this.aShortArray61[local446] = -1;
			} else {
				this.aShortArray61[local446] = arg0.aShortArray32[local817];
			}
			if (this.aByteArray49 != null) {
				this.aByteArray49[local446] = (byte) arg0.anIntArray210[local817];
			}
			this.aShortArray53[local446] = arg0.aShortArray34[local817];
			if (arg0.aByteArray32 != null) {
				this.aByteArray48[local446] = arg0.aByteArray32[local817];
			}
			if (arg0.aShortArray26 != null) {
				this.aShortArray57[local446] = arg0.aShortArray26[local817];
			}
		}
		local446 = 0;
		@Pc(2278) short local2278 = -10000;
		for (local824 = 0; local824 < this.anInt2526; local824++) {
			local829 = this.aShortArray61[local824];
			if (local829 != local2278) {
				local446++;
				local2278 = local829;
			}
		}
		this.anIntArray299 = new int[local446 + 1];
		local446 = 0;
		local2278 = -10000;
		for (local824 = 0; local824 < this.anInt2526; local824++) {
			local829 = this.aShortArray61[local824];
			if (local829 != local2278) {
				this.anIntArray299[local446++] = local824;
				local2278 = local829;
			}
		}
		this.anIntArray299[local446] = this.anInt2526;
		Static132.aLongArray7 = null;
		this.aShortArray63 = Static132.method2124(this.aShortArray63, this.anInt2528);
		this.aShortArray54 = Static132.method2124(this.aShortArray54, this.anInt2528);
		this.aShortArray59 = Static132.method2124(this.aShortArray59, this.anInt2528);
		this.aShortArray55 = Static132.method2124(this.aShortArray55, this.anInt2528);
		this.aFloatArray19 = Static132.method2120(this.aFloatArray19, this.anInt2528);
		this.aFloatArray20 = Static132.method2120(this.aFloatArray20, this.anInt2528);
	}

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "()V")
	public void method2098() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2527; local1++) {
			this.anIntArray298[local1] = -this.anIntArray298[local1];
		}
		if (this.aShortArray59 != null) {
			for (local1 = 0; local1 < this.anInt2528; local1++) {
				this.aShortArray59[local1] = (short) -this.aShortArray59[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt2526; local1++) {
			@Pc(48) short local48 = this.aShortArray56[local1];
			this.aShortArray56[local1] = this.aShortArray58[local1];
			this.aShortArray58[local1] = local48;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
		this.aClass110_2.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method2099(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte11 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt2528 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass110_4.aBoolean224 && (arg1 || arg2 && !Static294.aBoolean445);
				this.method2129(false, !this.aClass110_3.aBoolean224 && arg0, local26, this.aClass110_1 != null && !this.aClass110_1.aBoolean224 && arg2, !this.aClass110_5.aBoolean224);
				if (!this.aClass110_2.aBoolean224 && arg3 && arg1) {
					this.method2115();
				}
			}
			if (arg0) {
				if (this.aClass110_3.aBoolean224) {
					if (!this.aClass96_1.aBoolean187) {
						this.method2111();
					}
					this.anIntArray295 = null;
					this.anIntArray300 = null;
					this.anIntArray298 = null;
					this.aShortArray52 = null;
					this.anIntArray296 = null;
				} else {
					this.aByte12 = (byte) (this.aByte12 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass110_4.aBoolean224) {
					this.aShortArray53 = null;
					this.aByteArray48 = null;
				} else {
					this.aByte12 = (byte) (this.aByte12 | 0x2);
				}
			}
			if (arg2 && Static294.aBoolean445) {
				if (this.aClass110_1.aBoolean224) {
					this.aShortArray63 = null;
					this.aShortArray54 = null;
					this.aShortArray59 = null;
					this.aShortArray55 = null;
				} else {
					this.aByte12 = (byte) (this.aByte12 | 0x4);
				}
			}
			if (this.aClass110_5.aBoolean224) {
				this.aFloatArray19 = null;
				this.aFloatArray20 = null;
			} else {
				this.aByte12 = (byte) (this.aByte12 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass110_2.aBoolean224 && this.aClass110_4.aBoolean224) {
					this.aShortArray56 = null;
					this.aShortArray62 = null;
					this.aShortArray58 = null;
				} else {
					this.aByte12 = (byte) (this.aByte12 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray297 = null;
				this.aByteArray49 = null;
				this.anIntArrayArray22 = null;
				this.anIntArrayArray21 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "()V")
	public void method2100() {
		if (this.aShortArray63 == null) {
			this.method2069();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2527; local7++) {
			@Pc(16) int local16 = this.anIntArray298[local7];
			this.anIntArray298[local7] = this.anIntArray295[local7];
			this.anIntArray295[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt2528; local7++) {
			@Pc(43) short local43 = this.aShortArray59[local7];
			this.aShortArray59[local7] = this.aShortArray63[local7];
			this.aShortArray63[local7] = (short) -local43;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "()I")
	@Override
	public int method2083() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort29;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!gd;IJIIIIFF)S")
	private short method2103(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray296[arg1];
		@Pc(11) int local11 = this.anIntArray296[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray52[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static132.aLongArray7[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray52[local13] = (short) (this.anInt2528 + 1);
		Static132.aLongArray7[local13] = arg2;
		this.aShortArray63[this.anInt2528] = (short) arg3;
		this.aShortArray54[this.anInt2528] = (short) arg4;
		this.aShortArray59[this.anInt2528] = (short) arg5;
		this.aShortArray55[this.anInt2528] = (short) arg6;
		this.aFloatArray19[this.anInt2528] = arg7;
		this.aFloatArray20[this.anInt2528] = arg8;
		return (short) this.anInt2528++;
	}

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "()V")
	public void method2106() {
		if (this.aShortArray63 == null) {
			this.method2089();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2527; local7++) {
			this.anIntArray295[local7] = -this.anIntArray295[local7];
			this.anIntArray298[local7] = -this.anIntArray298[local7];
		}
		for (local7 = 0; local7 < this.anInt2528; local7++) {
			this.aShortArray63[local7] = (short) -this.aShortArray63[local7];
			this.aShortArray59[local7] = (short) -this.aShortArray59[local7];
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "()I")
	@Override
	public int method2093() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort27;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	@Override
	public void method2072(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2527; local9++) {
			@Pc(29) int local29 = this.anIntArray298[local9] * local3 + this.anIntArray295[local9] * local7 >> 16;
			this.anIntArray298[local9] = this.anIntArray298[local9] * local7 - this.anIntArray295[local9] * local3 >> 16;
			this.anIntArray295[local9] = local29;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "()V")
	@Override
	protected void method2080() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			this.anIntArray295[local1] = this.anIntArray295[local1] + 7 >> 4;
			this.anIntArray300[local1] = this.anIntArray300[local1] + 7 >> 4;
			this.anIntArray298[local1] = this.anIntArray298[local1] + 7 >> 4;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "()I")
	public int method2107() {
		return this.aShort23;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public void method2108(@OriginalArg(0) int arg0) {
		this.aShort22 = (short) arg0;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	@Override
	public void method2070(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2527; local9++) {
			@Pc(29) int local29 = this.anIntArray300[local9] * local7 - this.anIntArray298[local9] * local3 >> 16;
			this.anIntArray298[local9] = this.anIntArray300[local9] * local3 + this.anIntArray298[local9] * local7 >> 16;
			this.anIntArray300[local9] = local29;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2077(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2128(arg0, arg1, arg2, Static132.aClass6_Sub2_Sub2_6, Static132.aClass6_Sub2_Sub2_5);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!j;IIIZ)V")
	@Override
	public void method3840(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class6_Sub2_Sub2 local2 = (Class6_Sub2_Sub2) arg0;
		if (this.anInt2526 == 0 || local2.anInt2526 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt2525;
		@Pc(15) int[] local15 = local2.anIntArray295;
		@Pc(18) int[] local18 = local2.anIntArray300;
		@Pc(21) int[] local21 = local2.anIntArray298;
		@Pc(24) short[] local24 = local2.aShortArray63;
		@Pc(27) short[] local27 = local2.aShortArray54;
		@Pc(30) short[] local30 = local2.aShortArray59;
		@Pc(33) short[] local33 = local2.aShortArray55;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass98_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass98_1.aShortArray66;
			local44 = this.aClass98_1.aShortArray64;
			local48 = this.aClass98_1.aShortArray65;
			local52 = this.aClass98_1.aShortArray67;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass98_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass98_1.aShortArray66;
			local72 = local2.aClass98_1.aShortArray64;
			local76 = local2.aClass98_1.aShortArray65;
			local80 = local2.aClass98_1.aShortArray67;
		}
		@Pc(92) int[] local92 = local2.anIntArray296;
		@Pc(95) short[] local95 = local2.aShortArray52;
		if (!local2.aClass96_1.aBoolean187) {
			local2.method2111();
		}
		@Pc(105) short local105 = local2.aClass96_1.aShort25;
		@Pc(109) short local109 = local2.aClass96_1.aShort28;
		@Pc(113) short local113 = local2.aClass96_1.aShort24;
		@Pc(117) short local117 = local2.aClass96_1.aShort26;
		@Pc(121) short local121 = local2.aClass96_1.aShort29;
		@Pc(125) short local125 = local2.aClass96_1.aShort27;
		for (@Pc(127) int local127 = 0; local127 < this.anInt2525; local127++) {
			@Pc(138) int local138 = this.anIntArray300[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray295[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray298[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray296[local127];
						@Pc(187) int local187 = this.anIntArray296[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray52[local189] - 1;
							if (local175 == -1 || this.aShortArray55[local175] != 0) {
								break;
							}
						}
						if (local175 != -1) {
							for (local189 = 0; local189 < local12; local189++) {
								if (local152 == local15[local189] && local166 == local21[local189] && local138 == local18[local189]) {
									@Pc(237) int local237 = -1;
									local180 = local92[local189];
									local187 = local92[local189 + 1];
									for (@Pc(249) int local249 = local180; local249 < local187; local249++) {
										local237 = local95[local249] - 1;
										if (local237 == -1 || local33[local237] != 0) {
											break;
										}
									}
									if (local237 != -1) {
										if (local40 == null) {
											this.aClass98_1 = new Class98();
											local40 = this.aClass98_1.aShortArray66 = Static16.method304(this.aShortArray63);
											local44 = this.aClass98_1.aShortArray64 = Static16.method304(this.aShortArray54);
											local48 = this.aClass98_1.aShortArray65 = Static16.method304(this.aShortArray59);
											local52 = this.aClass98_1.aShortArray67 = Static16.method304(this.aShortArray55);
										}
										if (local68 == null) {
											@Pc(325) Class98 local325 = local2.aClass98_1 = new Class98();
											local68 = local325.aShortArray66 = Static16.method304(local24);
											local72 = local325.aShortArray64 = Static16.method304(local27);
											local76 = local325.aShortArray65 = Static16.method304(local30);
											local80 = local325.aShortArray67 = Static16.method304(local33);
										}
										@Pc(358) short local358 = this.aShortArray63[local175];
										@Pc(363) short local363 = this.aShortArray54[local175];
										@Pc(368) short local368 = this.aShortArray59[local175];
										@Pc(373) short local373 = this.aShortArray55[local175];
										local180 = local92[local189];
										local187 = local92[local189 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local180; local385 < local187; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local237];
										local363 = local27[local237];
										local368 = local30[local237];
										local373 = local33[local237];
										local180 = this.anIntArray296[local127];
										local187 = this.anIntArray296[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray52[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
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
	}

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "()V")
	private void method2111() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2525; local17++) {
			@Pc(26) int local26 = this.anIntArray295[local17];
			@Pc(31) int local31 = this.anIntArray300[local17];
			@Pc(36) int local36 = this.anIntArray298[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aClass96_1.aShort24 = (short) local1;
		this.aClass96_1.aShort26 = (short) local7;
		this.aClass96_1.aShort25 = (short) local3;
		this.aClass96_1.aShort28 = (short) local9;
		this.aClass96_1.aShort29 = (short) local5;
		this.aClass96_1.aShort27 = (short) local11;
		this.aClass96_1.aShort30 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass96_1.aBoolean187 = true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		if (this.anInt2528 == 0) {
			return;
		}
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		@Pc(13) short local13 = this.aClass96_1.aShort30;
		@Pc(17) short local17 = this.aClass96_1.aShort25;
		@Pc(21) short local21 = this.aClass96_1.aShort28;
		@Pc(31) int local31 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(41) int local41 = arg6 * arg1 + local31 * arg2 >> 16;
		@Pc(53) int local53 = local41 + (local13 * arg2 + local21 * arg1 >> 16);
		if (local53 <= 50) {
			return;
		}
		@Pc(70) int local70 = local41 + (-local13 * arg2 + local17 * arg1 >> 16);
		if (local70 >= 3584) {
			return;
		}
		@Pc(84) int local84 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(90) int local90 = local84 + local13 << 9;
		if (local90 / local53 <= Static77.anInt1560) {
			return;
		}
		@Pc(102) int local102 = local84 - local13 << 9;
		if (local102 / local53 >= Static211.anInt958) {
			return;
		}
		@Pc(118) int local118 = arg6 * arg2 - local31 * arg1 >> 16;
		@Pc(132) int local132 = local118 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local132 / local53 <= Static17.anInt409) {
			return;
		}
		@Pc(153) int local153 = local118 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local153 / local53 >= Static150.anInt2786) {
			return;
		}
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 0;
		if (arg0 != 0) {
			local161 = Class135.anIntArray472[arg0];
			local163 = Class135.anIntArray474[arg0];
		}
		if (arg8 > 0L && Static14.aBoolean29 && local70 > 0) {
			@Pc(187) int local187;
			@Pc(191) int local191;
			if (local84 > 0) {
				local187 = local102 / local53;
				local191 = local90 / local70;
			} else {
				local187 = local102 / local70;
				local191 = local90 / local53;
			}
			@Pc(206) int local206;
			@Pc(210) int local210;
			if (local118 > 0) {
				local206 = local153 / local53;
				local210 = local132 / local70;
			} else {
				local206 = local153 / local70;
				local210 = local132 / local53;
			}
			if (Static134.anInt2546 >= local187 && Static134.anInt2546 <= local191 && Static67.anInt1387 >= local206 && Static67.anInt1387 <= local210) {
				local187 = 999999;
				local191 = -999999;
				local206 = 999999;
				local210 = -999999;
				@Pc(243) short local243 = this.aClass96_1.aShort24;
				@Pc(247) short local247 = this.aClass96_1.aShort26;
				@Pc(251) short local251 = this.aClass96_1.aShort29;
				@Pc(255) short local255 = this.aClass96_1.aShort27;
				@Pc(290) int[] local290 = new int[] { local243, local247, local243, local247, local243, local247, local243, local247 };
				@Pc(325) int[] local325 = new int[] { local251, local251, local255, local255, local251, local251, local255, local255 };
				@Pc(360) int[] local360 = new int[] { local17, local17, local17, local17, local21, local21, local21, local21 };
				@Pc(362) int local362;
				@Pc(369) int local369;
				@Pc(373) int local373;
				@Pc(377) int local377;
				@Pc(389) int local389;
				@Pc(465) int local465;
				@Pc(471) int local471;
				for (local362 = 0; local362 < 8; local362++) {
					local369 = local290[local362];
					local373 = local360[local362];
					local377 = local325[local362];
					if (arg0 != 0) {
						local389 = local377 * local161 + local369 * local163 >> 16;
						local377 = local377 * local163 - local369 * local161 >> 16;
						local369 = local389;
					}
					local369 += arg5;
					local373 += arg6;
					local377 += arg7;
					local389 = local377 * arg3 + local369 * arg4 >> 16;
					local377 = local377 * arg4 - local369 * arg3 >> 16;
					local369 = local389;
					local389 = local373 * arg2 - local377 * arg1 >> 16;
					local377 = local373 * arg1 + local377 * arg2 >> 16;
					if (local377 > 0) {
						local465 = (local369 << 9) / local377;
						local471 = (local389 << 9) / local377;
						if (local465 < local187) {
							local187 = local465;
						}
						if (local465 > local191) {
							local191 = local465;
						}
						if (local471 < local206) {
							local206 = local471;
						}
						if (local471 > local210) {
							local210 = local471;
						}
					}
				}
				if (Static134.anInt2546 >= local187 && Static134.anInt2546 <= local191 && Static67.anInt1387 >= local206 && Static67.anInt1387 <= local210) {
					if (this.aBoolean176) {
						Static158.aLongArray8[Static270.anInt5412++] = arg8;
					} else {
						if (Static132.anIntArray302.length < this.anInt2528) {
							Static132.anIntArray302 = new int[this.anInt2528];
							Static132.anIntArray301 = new int[this.anInt2528];
						}
						local362 = 0;
						label118: while (true) {
							if (local362 >= this.anInt2525) {
								local362 = 0;
								while (true) {
									if (local362 >= this.anInt2526) {
										break label118;
									}
									@Pc(698) short local698 = this.aShortArray56[local362];
									@Pc(703) short local703 = this.aShortArray62[local362];
									@Pc(708) short local708 = this.aShortArray58[local362];
									if (this.method2119(Static134.anInt2546, Static67.anInt1387, Static132.anIntArray301[local698], Static132.anIntArray301[local703], Static132.anIntArray301[local708], Static132.anIntArray302[local698], Static132.anIntArray302[local703], Static132.anIntArray302[local708])) {
										Static158.aLongArray8[Static270.anInt5412++] = arg8;
										break label118;
									}
									local362++;
								}
							}
							local369 = this.anIntArray295[local362];
							local373 = this.anIntArray300[local362];
							local377 = this.anIntArray298[local362];
							if (arg0 != 0) {
								local389 = local377 * local161 + local369 * local163 >> 16;
								local377 = local377 * local163 - local369 * local161 >> 16;
								local369 = local389;
							}
							local369 += arg5;
							local373 += arg6;
							local377 += arg7;
							local389 = local377 * arg3 + local369 * arg4 >> 16;
							local377 = local377 * arg4 - local369 * arg3 >> 16;
							local369 = local389;
							local389 = local373 * arg2 - local377 * arg1 >> 16;
							local377 = local373 * arg1 + local377 * arg2 >> 16;
							if (local377 < 50) {
								break;
							}
							local465 = (local369 << 9) / local377;
							local471 = (local389 << 9) / local377;
							@Pc(652) int local652 = this.anIntArray296[local362];
							@Pc(659) int local659 = this.anIntArray296[local362 + 1];
							for (@Pc(661) int local661 = local652; local661 < local659; local661++) {
								@Pc(671) int local671 = this.aShortArray52[local661] - 1;
								if (local671 == -1) {
									break;
								}
								Static132.anIntArray302[local671] = local465;
								Static132.anIntArray301[local671] = local471;
							}
							local362++;
						}
					}
				}
			}
		}
		@Pc(744) GL local744 = Static240.aGL1;
		local744.glPushMatrix();
		local744.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local744.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method2127();
		local744.glPopMatrix();
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "()V")
	@Override
	public void method2071() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			@Pc(10) int local10 = this.anIntArray295[local1];
			this.anIntArray295[local1] = this.anIntArray298[local1];
			this.anIntArray298[local1] = -local10;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort25;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V")
	public void method2113(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.aClass110_4.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt2528 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static240.aGL1;
		local5.glPushMatrix();
		if (arg2 != 0) {
			local5.glRotatef((float) arg2 * 0.17578125F, 1.0F, 0.0F, 0.0F);
		}
		local5.glTranslatef((float) arg3, (float) arg4, (float) arg5);
		if (arg0 != 0) {
			local5.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		}
		if (arg1 != 0) {
			local5.glRotatef((float) -arg1 * 0.17578125F, 0.0F, 0.0F, 1.0F);
		}
		this.method2127();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "()V")
	private void method2115() {
		if (Static132.aClass1_Sub18_3.aByteArray71.length < this.anInt2526 * 12) {
			Static132.aClass1_Sub18_3 = new Class1_Sub18((this.anInt2526 + 100) * 12);
		} else {
			Static132.aClass1_Sub18_3.anInt3911 = 0;
		}
		@Pc(25) int local25;
		if (Static240.aBoolean379) {
			for (local25 = 0; local25 < this.anInt2526; local25++) {
				Static132.aClass1_Sub18_3.method3119(this.aShortArray56[local25]);
				Static132.aClass1_Sub18_3.method3119(this.aShortArray62[local25]);
				Static132.aClass1_Sub18_3.method3119(this.aShortArray58[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt2526; local25++) {
				Static132.aClass1_Sub18_3.method3094(this.aShortArray56[local25]);
				Static132.aClass1_Sub18_3.method3094(this.aShortArray62[local25]);
				Static132.aClass1_Sub18_3.method3094(this.aShortArray58[local25]);
			}
		}
		if (!Static240.aBoolean372) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static132.aClass1_Sub18_3.anInt3911);
			local115.put(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
			local115.flip();
			this.aClass110_2.aBoolean224 = true;
			this.aClass110_2.aByteBuffer10 = local115;
			this.aClass110_2.aClass52_6 = null;
			return;
		}
		@Pc(88) Class52 local88 = new Class52();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
		local88.method1195(local95);
		this.aClass110_2.aBoolean224 = true;
		this.aClass110_2.aByteBuffer10 = null;
		this.aClass110_2.aClass52_6 = local88;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!jm;[[I[[IIII)V")
	public void method2116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub2 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass96_1.aBoolean187) {
			arg2.method2111();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass96_1.aShort24;
		@Pc(17) int local17 = arg5 + arg2.aClass96_1.aShort26;
		@Pc(23) int local23 = arg7 + arg2.aClass96_1.aShort29;
		@Pc(29) int local29 = arg7 + arg2.aClass96_1.aShort27;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local11 < 0 || local17 + 128 >> 7 >= arg3.length || local23 < 0 || local29 + 128 >> 7 >= arg3[0].length)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg4 == null) {
				return;
			}
			if (local11 < 0 || local17 + 128 >> 7 >= arg4.length || local23 < 0 || local29 + 128 >> 7 >= arg4[0].length) {
				return;
			}
		} else {
			local11 >>= 0x7;
			local17 = local17 + 127 >> 7;
			local23 >>= 0x7;
			local29 = local29 + 127 >> 7;
			if (arg3[local11][local23] == arg6 && arg3[local17][local23] == arg6 && arg3[local11][local29] == arg6 && arg3[local17][local29] == arg6) {
				return;
			}
		}
		@Pc(150) int local150;
		@Pc(161) int local161;
		@Pc(168) int local168;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(206) int local206;
		@Pc(232) int local232;
		@Pc(244) int local244;
		if (arg0 == 1) {
			for (local150 = 0; local150 < this.anInt2525; local150++) {
				local161 = this.anIntArray295[local150] + arg5;
				local168 = this.anIntArray298[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray300[local150] = this.anIntArray300[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass96_1.aShort25;
				for (local161 = 0; local161 < this.anInt2525; local161++) {
					local168 = (this.anIntArray300[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray295[local161] + arg5;
						local176 = this.anIntArray298[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray300[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method2095(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass96_1.aShort28 - arg2.aClass96_1.aShort25;
				for (local161 = 0; local161 < this.anInt2525; local161++) {
					local168 = this.anIntArray295[local161] + arg5;
					local172 = this.anIntArray298[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray300[local161] = this.anIntArray300[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass96_1.aShort28 - arg2.aClass96_1.aShort25;
				for (local161 = 0; local161 < this.anInt2525; local161++) {
					local168 = this.anIntArray295[local161] + arg5;
					local172 = this.anIntArray298[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg3[local184][local206] * (128 - local176) + arg3[local184 + 1][local206] * local176 >> 7;
					local244 = arg3[local184][local206 + 1] * (128 - local176) + arg3[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local374 = local232 * (128 - local180) + local244 * local180 >> 7;
					@Pc(716) int local716 = local362 - local374;
					this.anIntArray300[local161] = ((this.anIntArray300[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass110_3.aBoolean224 = false;
		this.aClass96_1.aBoolean187 = false;
	}

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "()V")
	public void method2117() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray297 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2527; local9++) {
				local20 = this.anIntArray297[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray22 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray22[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt2527) {
				local20 = this.anIntArray297[local9] & 0xFF;
				this.anIntArrayArray22[local20][local5[local20]++] = local9++;
			}
			this.anIntArray297 = null;
		}
		if (this.aByteArray49 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2526; local9++) {
			local20 = this.aByteArray49[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray21 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray21[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt2526) {
			local20 = this.aByteArray49[local9] & 0xFF;
			this.anIntArrayArray21[local20][local5[local20]++] = local9++;
		}
		this.aByteArray49 = null;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "()V")
	@Override
	public void method2069() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			@Pc(10) int local10 = this.anIntArray298[local1];
			this.anIntArray298[local1] = this.anIntArray295[local1];
			this.anIntArray295[local1] = -local10;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "()I")
	public int method2118() {
		return this.aShort22;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static132.anInt2529 = 0;
			Static132.anInt2530 = 0;
			Static132.anInt2531 = 0;
			for (local11 = 0; local11 < this.anInt2527; local11++) {
				Static132.anInt2529 += this.anIntArray295[local11];
				Static132.anInt2530 += this.anIntArray300[local11];
				Static132.anInt2531 += this.anIntArray298[local11];
				local3++;
			}
			if (local3 > 0) {
				Static132.anInt2529 = Static132.anInt2529 / local3 + arg1;
				Static132.anInt2530 = Static132.anInt2530 / local3 + arg2;
				Static132.anInt2531 = Static132.anInt2531 / local3 + arg3;
			} else {
				Static132.anInt2529 = arg1;
				Static132.anInt2530 = arg2;
				Static132.anInt2531 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt2527; local3++) {
				this.anIntArray295[local3] += arg1;
				this.anIntArray300[local3] += arg2;
				this.anIntArray298[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt2527; local3++) {
					this.anIntArray295[local3] -= Static132.anInt2529;
					this.anIntArray300[local3] -= Static132.anInt2530;
					this.anIntArray298[local3] -= Static132.anInt2531;
					if (arg3 != 0) {
						local11 = Class135.anIntArray472[arg3];
						local146 = Class135.anIntArray474[arg3];
						local164 = this.anIntArray300[local3] * local11 + this.anIntArray295[local3] * local146 + 32767 >> 16;
						this.anIntArray300[local3] = this.anIntArray300[local3] * local146 + 32767 - this.anIntArray295[local3] * local11 >> 16;
						this.anIntArray295[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class135.anIntArray472[arg1];
						local146 = Class135.anIntArray474[arg1];
						local164 = this.anIntArray300[local3] * local146 + 32767 - this.anIntArray298[local3] * local11 >> 16;
						this.anIntArray298[local3] = this.anIntArray300[local3] * local11 + this.anIntArray298[local3] * local146 + 32767 >> 16;
						this.anIntArray300[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class135.anIntArray472[arg2];
						local146 = Class135.anIntArray474[arg2];
						local164 = this.anIntArray298[local3] * local11 + this.anIntArray295[local3] * local146 + 32767 >> 16;
						this.anIntArray298[local3] = this.anIntArray298[local3] * local146 + 32767 - this.anIntArray295[local3] * local11 >> 16;
						this.anIntArray295[local3] = local164;
					}
					this.anIntArray295[local3] += Static132.anInt2529;
					this.anIntArray300[local3] += Static132.anInt2530;
					this.anIntArray298[local3] += Static132.anInt2531;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt2527; local3++) {
					this.anIntArray295[local3] -= Static132.anInt2529;
					this.anIntArray300[local3] -= Static132.anInt2530;
					this.anIntArray298[local3] -= Static132.anInt2531;
					this.anIntArray295[local3] = this.anIntArray295[local3] * arg1 / 128;
					this.anIntArray300[local3] = this.anIntArray300[local3] * arg2 / 128;
					this.anIntArray298[local3] = this.anIntArray298[local3] * arg3 / 128;
					this.anIntArray295[local3] += Static132.anInt2529;
					this.anIntArray300[local3] += Static132.anInt2530;
					this.anIntArray298[local3] += Static132.anInt2531;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt2526; local3++) {
					local11 = (this.aByteArray48[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray48[local3] = (byte) local11;
				}
				this.aClass110_4.aBoolean224 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt2526; local3++) {
					local11 = this.aShortArray53[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(496) int local496 = local11 & 0x7F;
					@Pc(502) int local502 = local146 + arg1 & 0x3F;
					local164 += arg2 / 4;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local496 += arg3;
					if (local496 < 0) {
						local496 = 0;
					} else if (local496 > 127) {
						local496 = 127;
					}
					this.aShortArray53[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass110_4.aBoolean224 = false;
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "()I")
	@Override
	public int method2097() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort26;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(SS)V")
	public void method2121(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2526; local1++) {
			if (this.aShortArray61[local1] == arg0) {
				this.aShortArray61[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static208.anInterface4_1.method994(arg0 & 0xFFFF);
			local22 = Static208.anInterface4_1.method993(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static208.anInterface4_1.method994(arg1 & 0xFFFF);
			local43 = Static208.anInterface4_1.method993(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass110_4.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!jm;")
	public Class6_Sub2_Sub2 method2122(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class6_Sub2_Sub2 local3 = new Class6_Sub2_Sub2();
		local3.anInt2527 = this.anInt2527;
		local3.anInt2525 = this.anInt2525;
		local3.anInt2528 = this.anInt2528;
		local3.anInt2526 = this.anInt2526;
		if (arg0) {
			local3.anIntArray295 = this.anIntArray295;
			local3.anIntArray298 = this.anIntArray298;
		} else {
			local3.anIntArray295 = Static188.method2836(this.anIntArray295);
			local3.anIntArray298 = Static188.method2836(this.anIntArray298);
		}
		if (arg1) {
			local3.anIntArray300 = this.anIntArray300;
		} else {
			local3.anIntArray300 = Static188.method2836(this.anIntArray300);
		}
		if (arg0 && arg1) {
			local3.aClass110_3 = this.aClass110_3;
			local3.aClass96_1 = this.aClass96_1;
		} else {
			local3.aClass110_3 = new Class110();
			local3.aClass96_1 = new Class96();
		}
		if (arg2) {
			local3.aShortArray53 = this.aShortArray53;
		} else {
			local3.aShortArray53 = Static16.method304(this.aShortArray53);
		}
		local3.aByteArray48 = this.aByteArray48;
		if (arg2 && arg3 && (arg6 && arg4 || Static294.aBoolean445)) {
			local3.aClass110_4 = this.aClass110_4;
		} else {
			local3.aClass110_4 = new Class110();
		}
		if (arg4) {
			local3.aShortArray63 = this.aShortArray63;
			local3.aShortArray54 = this.aShortArray54;
			local3.aShortArray59 = this.aShortArray59;
			local3.aShortArray55 = this.aShortArray55;
		} else {
			local3.aShortArray63 = Static16.method304(this.aShortArray63);
			local3.aShortArray54 = Static16.method304(this.aShortArray54);
			local3.aShortArray59 = Static16.method304(this.aShortArray59);
			local3.aShortArray55 = Static16.method304(this.aShortArray55);
		}
		if (!Static294.aBoolean445) {
			local3.aClass110_1 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass110_1 = this.aClass110_1;
		} else {
			local3.aClass110_1 = new Class110();
		}
		local3.aFloatArray19 = this.aFloatArray19;
		local3.aFloatArray20 = this.aFloatArray20;
		local3.aClass110_5 = this.aClass110_5;
		if (arg7) {
			local3.aShortArray56 = this.aShortArray56;
			local3.aShortArray62 = this.aShortArray62;
			local3.aShortArray58 = this.aShortArray58;
			local3.aClass110_2 = this.aClass110_2;
		} else {
			local3.aShortArray56 = Static16.method304(this.aShortArray56);
			local3.aShortArray62 = Static16.method304(this.aShortArray62);
			local3.aShortArray58 = Static16.method304(this.aShortArray58);
			local3.aClass110_2 = new Class110();
		}
		if (arg8) {
			local3.aShortArray61 = this.aShortArray61;
		} else {
			local3.aShortArray61 = Static16.method304(this.aShortArray61);
		}
		local3.anIntArray297 = this.anIntArray297;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.aByteArray49 = this.aByteArray49;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.anIntArray299 = this.anIntArray299;
		local3.aShortArray52 = this.aShortArray52;
		local3.anIntArray296 = this.anIntArray296;
		local3.aShort23 = this.aShort23;
		local3.aShort22 = this.aShort22;
		local3.aShortArray60 = this.aShortArray60;
		local3.aShortArray57 = this.aShortArray57;
		return local3;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lclient!j;")
	@Override
	public Class6 method3834() {
		this.aBoolean177 = false;
		if (this.aClass98_1 != null) {
			this.aShortArray63 = this.aClass98_1.aShortArray66;
			this.aShortArray54 = this.aClass98_1.aShortArray64;
			this.aShortArray59 = this.aClass98_1.aShortArray65;
			this.aShortArray55 = this.aClass98_1.aShortArray67;
			this.aClass98_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "()I")
	@Override
	public int method2082() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort30;
	}

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "()V")
	public void method2123() {
		if (this.aShortArray63 == null) {
			this.method2071();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2527; local7++) {
			@Pc(16) int local16 = this.anIntArray295[local7];
			this.anIntArray295[local7] = this.anIntArray298[local7];
			this.anIntArray298[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt2528; local7++) {
			@Pc(43) short local43 = this.aShortArray63[local7];
			this.aShortArray63[local7] = this.aShortArray59[local7];
			this.aShortArray59[local7] = (short) -local43;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
	@Override
	public void method2085(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray472[arg0];
		@Pc(7) int local7 = Class135.anIntArray474[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2527; local9++) {
			@Pc(29) int local29 = this.anIntArray300[local9] * local3 + this.anIntArray295[local9] * local7 >> 16;
			this.anIntArray300[local9] = this.anIntArray300[local9] * local7 - this.anIntArray295[local9] * local3 >> 16;
			this.anIntArray295[local9] = local29;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "()I")
	@Override
	public int method2092() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort24;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(33) int local33;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			Static132.anInt2529 = 0;
			Static132.anInt2530 = 0;
			Static132.anInt2531 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray22.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray22[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local53]) != 0) {
							Static132.anInt2529 += this.anIntArray295[local53];
							Static132.anInt2530 += this.anIntArray300[local53];
							Static132.anInt2531 += this.anIntArray298[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static132.anInt2529 = Static132.anInt2529 / local18 + arg2;
				Static132.anInt2530 = Static132.anInt2530 / local18 + arg3;
				Static132.anInt2531 = Static132.anInt2531 / local18 + arg4;
				Static132.aBoolean178 = true;
			} else {
				Static132.anInt2529 = arg2;
				Static132.anInt2530 = arg3;
				Static132.anInt2531 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local228 = this.anIntArrayArray22[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
							this.anIntArray295[local45] += arg2;
							this.anIntArray300[local45] += arg3;
							this.anIntArray298[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(428) int local428;
		@Pc(434) int local434;
		@Pc(440) int local440;
		@Pc(446) int local446;
		@Pc(454) int local454;
		@Pc(462) int local462;
		@Pc(615) int local615;
		@Pc(640) int local640;
		@Pc(644) int local644;
		@Pc(652) int local652;
		@Pc(657) int local657;
		@Pc(662) int local662;
		@Pc(667) int local667;
		@Pc(789) int[] local789;
		@Pc(791) int local791;
		@Pc(796) int local796;
		@Pc(801) int local801;
		@Pc(803) int local803;
		@Pc(929) int local929;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray22.length) {
						local228 = this.anIntArrayArray22[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
								this.anIntArray295[local45] -= Static132.anInt2529;
								this.anIntArray300[local45] -= Static132.anInt2530;
								this.anIntArray298[local45] -= Static132.anInt2531;
								if (arg4 != 0) {
									local53 = Class135.anIntArray472[arg4];
									local343 = Class135.anIntArray474[arg4];
									local365 = this.anIntArray300[local45] * local53 + this.anIntArray295[local45] * local343 + 32767 >> 16;
									this.anIntArray300[local45] = this.anIntArray300[local45] * local343 + 32767 - this.anIntArray295[local45] * local53 >> 16;
									this.anIntArray295[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class135.anIntArray472[arg2];
									local343 = Class135.anIntArray474[arg2];
									local365 = this.anIntArray300[local45] * local343 + 32767 - this.anIntArray298[local45] * local53 >> 16;
									this.anIntArray298[local45] = this.anIntArray300[local45] * local53 + this.anIntArray298[local45] * local343 + 32767 >> 16;
									this.anIntArray300[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class135.anIntArray472[arg3];
									local343 = Class135.anIntArray474[arg3];
									local365 = this.anIntArray298[local45] * local53 + this.anIntArray295[local45] * local343 + 32767 >> 16;
									this.anIntArray298[local45] = this.anIntArray298[local45] * local343 + 32767 - this.anIntArray295[local45] * local53 >> 16;
									this.anIntArray295[local45] = local365;
								}
								this.anIntArray295[local45] += Static132.anInt2529;
								this.anIntArray300[local45] += Static132.anInt2530;
								this.anIntArray298[local45] += Static132.anInt2531;
							}
						}
					}
				}
				if (arg5 && this.aShortArray63 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray22.length) {
							local228 = this.anIntArrayArray22[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
									local53 = this.anIntArray296[local45];
									local343 = this.anIntArray296[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray52[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class135.anIntArray472[arg4];
											local434 = Class135.anIntArray474[arg4];
											local440 = this.aShortArray54[local387] * local428 + this.aShortArray63[local387] * local434 + 32767 >> 16;
											this.aShortArray54[local387] = (short) (this.aShortArray54[local387] * local434 + 32767 - this.aShortArray63[local387] * local428 >> 16);
											this.aShortArray63[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class135.anIntArray472[arg2];
											local434 = Class135.anIntArray474[arg2];
											local440 = this.aShortArray54[local387] * local434 + 32767 - this.aShortArray59[local387] * local428 >> 16;
											this.aShortArray59[local387] = (short) (this.aShortArray54[local387] * local428 + this.aShortArray59[local387] * local434 + 32767 >> 16);
											this.aShortArray54[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class135.anIntArray472[arg3];
											local434 = Class135.anIntArray474[arg3];
											local440 = this.aShortArray59[local387] * local428 + this.aShortArray63[local387] * local434 + 32767 >> 16;
											this.aShortArray59[local387] = (short) (this.aShortArray59[local387] * local434 + 32767 - this.aShortArray63[local387] * local428 >> 16);
											this.aShortArray63[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass110_1 != null) {
						this.aClass110_1.aBoolean224 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static132.aBoolean178) {
					local343 = arg7[0] * Static132.anInt2529 + arg7[3] * Static132.anInt2530 + arg7[6] * Static132.anInt2531 + 16384 >> 15;
					local365 = arg7[1] * Static132.anInt2529 + arg7[4] * Static132.anInt2530 + arg7[7] * Static132.anInt2531 + 16384 >> 15;
					local387 = arg7[2] * Static132.anInt2529 + arg7[5] * Static132.anInt2530 + arg7[8] * Static132.anInt2531 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static132.anInt2529 = local343;
					Static132.anInt2530 = local365;
					Static132.anInt2531 = local387;
					Static132.aBoolean178 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class135.anIntArray474[arg2] >> 1;
				local387 = Class135.anIntArray472[arg2] >> 1;
				local428 = Class135.anIntArray474[arg3] >> 1;
				local434 = Class135.anIntArray472[arg3] >> 1;
				local440 = Class135.anIntArray474[arg4] >> 1;
				local446 = Class135.anIntArray472[arg4] >> 1;
				local454 = local387 * local440 + 16384 >> 15;
				local462 = local387 * local446 + 16384 >> 15;
				local410[0] = local428 * local440 + local434 * local462 + 16384 >> 15;
				local410[1] = -local428 * local446 + local434 * local454 + 16384 >> 15;
				local410[2] = local434 * local365 + 16384 >> 15;
				local410[3] = local365 * local446 + 16384 >> 15;
				local410[4] = local365 * local440 + 16384 >> 15;
				local410[5] = -local387;
				local410[6] = -local434 * local440 + local428 * local462 + 16384 >> 15;
				local410[7] = local434 * local446 + local428 * local454 + 16384 >> 15;
				local410[8] = local428 * local365 + 16384 >> 15;
				@Pc(590) int local590 = local410[0] * -Static132.anInt2529 + local410[1] * -Static132.anInt2530 + local410[2] * -Static132.anInt2531 + 16384 >> 15;
				local615 = local410[3] * -Static132.anInt2529 + local410[4] * -Static132.anInt2530 + local410[5] * -Static132.anInt2531 + 16384 >> 15;
				local640 = local410[6] * -Static132.anInt2529 + local410[7] * -Static132.anInt2530 + local410[8] * -Static132.anInt2531 + 16384 >> 15;
				local644 = local590 + Static132.anInt2529;
				@Pc(648) int local648 = local615 + Static132.anInt2530;
				local652 = local640 + Static132.anInt2531;
				@Pc(655) int[] local655 = new int[9];
				for (local657 = 0; local657 < 3; local657++) {
					for (local662 = 0; local662 < 3; local662++) {
						local667 = 0;
						for (@Pc(669) int local669 = 0; local669 < 3; local669++) {
							local667 += local410[local657 * 3 + local669] * arg7[local662 * 3 + local669];
						}
						local655[local657 * 3 + local662] = local667 + 16384 >> 15;
					}
				}
				local657 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 16384 >> 15;
				local662 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 16384 >> 15;
				local667 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 16384 >> 15;
				local657 += local644;
				local662 += local648;
				local667 += local652;
				local789 = new int[9];
				for (local791 = 0; local791 < 3; local791++) {
					for (local796 = 0; local796 < 3; local796++) {
						local801 = 0;
						for (local803 = 0; local803 < 3; local803++) {
							local801 += arg7[local791 * 3 + local803] * local655[local796 + local803 * 3];
						}
						local789[local791 * 3 + local796] = local801 + 16384 >> 15;
					}
				}
				local791 = arg7[0] * local657 + arg7[1] * local662 + arg7[2] * local667 + 16384 >> 15;
				local796 = arg7[3] * local657 + arg7[4] * local662 + arg7[5] * local667 + 16384 >> 15;
				local801 = arg7[6] * local657 + arg7[7] * local662 + arg7[8] * local667 + 16384 >> 15;
				local791 += local18;
				local796 += local26;
				local801 += local33;
				for (local803 = 0; local803 < local2; local803++) {
					local929 = arg1[local803];
					if (local929 < this.anIntArrayArray22.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray22[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray295[local949] + local789[1] * this.anIntArray300[local949] + local789[2] * this.anIntArray298[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray295[local949] + local789[4] * this.anIntArray300[local949] + local789[5] * this.anIntArray298[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray295[local949] + local789[7] * this.anIntArray300[local949] + local789[8] * this.anIntArray298[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray295[local949] = local1057;
								this.anIntArray300[local949] = local1061;
								this.anIntArray298[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray22.length) {
						local228 = this.anIntArrayArray22[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
								this.anIntArray295[local45] -= Static132.anInt2529;
								this.anIntArray300[local45] -= Static132.anInt2530;
								this.anIntArray298[local45] -= Static132.anInt2531;
								this.anIntArray295[local45] = this.anIntArray295[local45] * arg2 >> 7;
								this.anIntArray300[local45] = this.anIntArray300[local45] * arg3 >> 7;
								this.anIntArray298[local45] = this.anIntArray298[local45] * arg4 >> 7;
								this.anIntArray295[local45] += Static132.anInt2529;
								this.anIntArray300[local45] += Static132.anInt2530;
								this.anIntArray298[local45] += Static132.anInt2531;
							}
						}
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static132.aBoolean178) {
					local343 = arg7[0] * Static132.anInt2529 + arg7[3] * Static132.anInt2530 + arg7[6] * Static132.anInt2531 + 16384 >> 15;
					local365 = arg7[1] * Static132.anInt2529 + arg7[4] * Static132.anInt2530 + arg7[7] * Static132.anInt2531 + 16384 >> 15;
					local387 = arg7[2] * Static132.anInt2529 + arg7[5] * Static132.anInt2530 + arg7[8] * Static132.anInt2531 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static132.anInt2529 = local343;
					Static132.anInt2530 = local365;
					Static132.anInt2531 = local387;
					Static132.aBoolean178 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static132.anInt2529 + 16384 >> 15;
				local434 = local365 * -Static132.anInt2530 + 16384 >> 15;
				local440 = local387 * -Static132.anInt2531 + 16384 >> 15;
				local446 = local428 + Static132.anInt2529;
				local454 = local434 + Static132.anInt2530;
				local462 = local440 + Static132.anInt2531;
				@Pc(1783) int[] local1783 = new int[] { local343 * arg7[0] + 16384 >> 15, local343 * arg7[3] + 16384 >> 15, local343 * arg7[6] + 16384 >> 15, local365 * arg7[1] + 16384 >> 15, local365 * arg7[4] + 16384 >> 15, local365 * arg7[7] + 16384 >> 15, local387 * arg7[2] + 16384 >> 15, local387 * arg7[5] + 16384 >> 15, local387 * arg7[8] + 16384 >> 15 };
				local615 = local343 * local230 + 16384 >> 15;
				local640 = local365 * local45 + 16384 >> 15;
				local644 = local387 * local53 + 16384 >> 15;
				@Pc(1919) int local1919 = local615 + local446;
				@Pc(1923) int local1923 = local640 + local454;
				@Pc(1927) int local1927 = local644 + local462;
				@Pc(1930) int[] local1930 = new int[9];
				@Pc(1937) int local1937;
				for (local652 = 0; local652 < 3; local652++) {
					for (local1937 = 0; local1937 < 3; local1937++) {
						local657 = 0;
						for (local662 = 0; local662 < 3; local662++) {
							local657 += arg7[local652 * 3 + local662] * local1783[local1937 + local662 * 3];
						}
						local1930[local652 * 3 + local1937] = local657 + 16384 >> 15;
					}
				}
				local652 = arg7[0] * local1919 + arg7[1] * local1923 + arg7[2] * local1927 + 16384 >> 15;
				local1937 = arg7[3] * local1919 + arg7[4] * local1923 + arg7[5] * local1927 + 16384 >> 15;
				local657 = arg7[6] * local1919 + arg7[7] * local1923 + arg7[8] * local1927 + 16384 >> 15;
				local652 += local18;
				local1937 += local26;
				local657 += local33;
				for (local662 = 0; local662 < local2; local662++) {
					local667 = arg1[local662];
					if (local667 < this.anIntArrayArray22.length) {
						local789 = this.anIntArrayArray22[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray295[local796] + local1930[1] * this.anIntArray300[local796] + local1930[2] * this.anIntArray298[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray295[local796] + local1930[4] * this.anIntArray300[local796] + local1930[5] * this.anIntArray298[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray295[local796] + local1930[7] * this.anIntArray300[local796] + local1930[8] * this.anIntArray298[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray295[local796] = local2198;
								this.anIntArray300[local796] = local2202;
								this.anIntArray298[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray21 != null && this.aByteArray48 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray21.length) {
						local228 = this.anIntArrayArray21[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local45]) != 0) {
								local53 = (this.aByteArray48[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray48[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass110_4.aBoolean224 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray21 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray21.length) {
					local228 = this.anIntArrayArray21[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local45]) != 0) {
							local53 = this.aShortArray53[local45] & 0xFFFF;
							local343 = local53 >> 10 & 0x3F;
							local365 = local53 >> 7 & 0x7;
							local387 = local53 & 0x7F;
							@Pc(2518) int local2518 = local343 + arg2 & 0x3F;
							local365 += arg3 / 4;
							if (local365 < 0) {
								local365 = 0;
							} else if (local365 > 7) {
								local365 = 7;
							}
							local387 += arg4;
							if (local387 < 0) {
								local387 = 0;
							} else if (local387 > 127) {
								local387 = 127;
							}
							this.aShortArray53[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass110_4.aBoolean224 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)V")
	@Override
	public void method2073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			this.anIntArray295[local1] += arg0;
			this.anIntArray300[local1] += arg1;
			this.anIntArray298[local1] += arg2;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "()V")
	@Override
	public void method2089() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			this.anIntArray295[local1] = -this.anIntArray295[local1];
			this.anIntArray298[local1] = -this.anIntArray298[local1];
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2094(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2128(arg0, arg1, arg2, Static132.aClass6_Sub2_Sub2_4, Static132.aClass6_Sub2_Sub2_3);
	}

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "()Z")
	@Override
	protected boolean method2088() {
		if (this.anIntArrayArray22 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2527; local6++) {
			this.anIntArray295[local6] <<= 0x4;
			this.anIntArray300[local6] <<= 0x4;
			this.anIntArray298[local6] <<= 0x4;
		}
		Static132.anInt2529 = 0;
		Static132.anInt2530 = 0;
		Static132.anInt2531 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V")
	public void method2125() {
		if (this.aShortArray63 == null) {
			this.method2072(256);
			return;
		}
		@Pc(10) int local10 = Class135.anIntArray472[256];
		@Pc(14) int local14 = Class135.anIntArray474[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt2527; local16++) {
			local36 = this.anIntArray298[local16] * local10 + this.anIntArray295[local16] * local14 >> 16;
			this.anIntArray298[local16] = this.anIntArray298[local16] * local14 - this.anIntArray295[local16] * local10 >> 16;
			this.anIntArray295[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt2528; local16++) {
			local36 = this.aShortArray59[local16] * local10 + this.aShortArray63[local16] * local14 >> 16;
			this.aShortArray59[local16] = (short) (this.aShortArray59[local16] * local14 - this.aShortArray63[local16] * local10 >> 16);
			this.aShortArray63[local16] = (short) local36;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
		if (this.aClass110_1 != null) {
			this.aClass110_1.aBoolean224 = false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZ)Lclient!ei;")
	@Override
	public Class6_Sub2 method2068(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2128(arg0, arg1, arg2, Static132.aClass6_Sub2_Sub2_2, Static132.aClass6_Sub2_Sub2_1);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)V")
	@Override
	public void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2527; local1++) {
			this.anIntArray295[local1] = this.anIntArray295[local1] * arg0 >> 7;
			this.anIntArray300[local1] = this.anIntArray300[local1] * arg1 >> 7;
			this.anIntArray298[local1] = this.anIntArray298[local1] * arg2 >> 7;
		}
		this.aClass96_1.aBoolean187 = false;
		this.aClass110_3.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()Z")
	@Override
	public boolean method3835() {
		return this.aBoolean177 && this.anIntArray295 != null && this.aShortArray63 != null;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(SS)V")
	public void method2126(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2526; local1++) {
			if (this.aShortArray53[local1] == arg0) {
				this.aShortArray53[local1] = arg1;
			}
		}
		this.aClass110_4.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "()I")
	@Override
	public int method2096() {
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		return this.aClass96_1.aShort28;
	}

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "()V")
	private void method2127() {
		@Pc(1) GL local1 = Static240.aGL1;
		if (this.anInt2526 == 0) {
			return;
		}
		if (this.aByte11 != 0) {
			this.method2129(true, !this.aClass110_3.aBoolean224 && (this.aByte11 & 0x1) != 0, !this.aClass110_4.aBoolean224 && (this.aByte11 & 0x2) != 0, this.aClass110_1 != null && !this.aClass110_1.aBoolean224 && (this.aByte11 & 0x4) != 0, false);
		}
		this.method2129(false, !this.aClass110_3.aBoolean224, !this.aClass110_4.aBoolean224, this.aClass110_1 != null && !this.aClass110_1.aBoolean224, !this.aClass110_5.aBoolean224);
		if (!this.aClass110_2.aBoolean224) {
			this.method2115();
		}
		if (this.aByte12 != 0) {
			if ((this.aByte12 & 0x1) != 0) {
				this.anIntArray295 = null;
				this.anIntArray300 = null;
				this.anIntArray298 = null;
				this.aShortArray52 = null;
				this.anIntArray296 = null;
			}
			if ((this.aByte12 & 0x2) != 0) {
				this.aShortArray53 = null;
				this.aByteArray48 = null;
			}
			if ((this.aByte12 & 0x4) != 0) {
				this.aShortArray63 = null;
				this.aShortArray54 = null;
				this.aShortArray59 = null;
				this.aShortArray55 = null;
			}
			if ((this.aByte12 & 0x8) != 0) {
				this.aFloatArray19 = null;
				this.aFloatArray20 = null;
			}
			if ((this.aByte12 & 0x10) != 0) {
				this.aShortArray56 = null;
				this.aShortArray62 = null;
				this.aShortArray58 = null;
			}
			this.aByte12 = 0;
		}
		@Pc(172) Class52 local172 = null;
		if (this.aClass110_3.aClass52_6 != null) {
			this.aClass110_3.aClass52_6.method1197();
			local172 = this.aClass110_3.aClass52_6;
			local1.glVertexPointer(3, 5126, this.aClass110_3.anInt2986, (long) this.aClass110_3.anInt2982);
		}
		if (this.aClass110_4.aClass52_6 != null) {
			if (local172 != this.aClass110_4.aClass52_6) {
				this.aClass110_4.aClass52_6.method1197();
				local172 = this.aClass110_4.aClass52_6;
			}
			local1.glColorPointer(4, 5121, this.aClass110_4.anInt2986, (long) this.aClass110_4.anInt2982);
		}
		if (Static294.aBoolean445 && this.aClass110_1.aClass52_6 != null) {
			if (local172 != this.aClass110_1.aClass52_6) {
				this.aClass110_1.aClass52_6.method1197();
				local172 = this.aClass110_1.aClass52_6;
			}
			local1.glNormalPointer(5126, this.aClass110_1.anInt2986, (long) this.aClass110_1.anInt2982);
		}
		if (this.aClass110_5.aClass52_6 != null) {
			if (local172 != this.aClass110_5.aClass52_6) {
				this.aClass110_5.aClass52_6.method1197();
				local172 = this.aClass110_5.aClass52_6;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass110_5.anInt2986, (long) this.aClass110_5.anInt2982);
		}
		if (this.aClass110_2.aClass52_6 != null) {
			this.aClass110_2.aClass52_6.method1193();
		}
		if (this.aClass110_3.aClass52_6 == null || this.aClass110_4.aClass52_6 == null || Static294.aBoolean445 && this.aClass110_1.aClass52_6 == null || this.aClass110_5.aClass52_6 == null) {
			if (Static240.aBoolean372) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass110_3.aClass52_6 == null) {
				this.aClass110_3.aByteBuffer10.position(this.aClass110_3.anInt2982);
				local1.glVertexPointer(3, 5126, this.aClass110_3.anInt2986, this.aClass110_3.aByteBuffer10);
			}
			if (this.aClass110_4.aClass52_6 == null) {
				this.aClass110_4.aByteBuffer10.position(this.aClass110_4.anInt2982);
				local1.glColorPointer(4, 5121, this.aClass110_4.anInt2986, this.aClass110_4.aByteBuffer10);
			}
			if (Static294.aBoolean445 && this.aClass110_1.aClass52_6 == null) {
				this.aClass110_1.aByteBuffer10.position(this.aClass110_1.anInt2982);
				local1.glNormalPointer(5126, this.aClass110_1.anInt2986, this.aClass110_1.aByteBuffer10);
			}
			if (this.aClass110_5.aClass52_6 == null) {
				this.aClass110_5.aByteBuffer10.position(this.aClass110_5.anInt2982);
				local1.glTexCoordPointer(2, 5126, this.aClass110_5.anInt2986, this.aClass110_5.aByteBuffer10);
			}
		}
		if (this.aClass110_2.aClass52_6 == null && Static240.aBoolean372) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray299.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray299[local419];
			@Pc(434) int local434 = this.anIntArray299[local419 + 1];
			@Pc(439) short local439 = this.aShortArray61[local427];
			if (local439 == -1) {
				Static240.method3789(-1);
				Static122.method1910(0, 0);
			} else {
				Static208.anInterface4_1.method982(local439 & 0xFFFF);
			}
			if (this.aClass110_2.aClass52_6 == null) {
				this.aClass110_2.aByteBuffer10.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass110_2.aByteBuffer10);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZLclient!jm;Lclient!jm;)Lclient!ei;")
	private Class6_Sub2 method2128(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class6_Sub2_Sub2 arg3, @OriginalArg(4) Class6_Sub2_Sub2 arg4) {
		arg3.anInt2527 = this.anInt2527;
		arg3.anInt2525 = this.anInt2525;
		arg3.anInt2528 = this.anInt2528;
		arg3.anInt2526 = this.anInt2526;
		arg3.aShort23 = this.aShort23;
		arg3.aShort22 = this.aShort22;
		arg3.aByte11 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray295 == null || arg3.anIntArray295.length < this.anInt2527) {
			arg3.anIntArray295 = new int[this.anInt2527 + 100];
			arg3.anIntArray300 = new int[this.anInt2527 + 100];
			arg3.anIntArray298 = new int[this.anInt2527 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt2527; local73++) {
			arg3.anIntArray295[local73] = this.anIntArray295[local73];
			arg3.anIntArray300[local73] = this.anIntArray300[local73];
			arg3.anIntArray298[local73] = this.anIntArray298[local73];
		}
		if (arg3.aClass110_3 == null) {
			arg3.aClass110_3 = new Class110();
		}
		arg3.aClass110_3.aBoolean224 = false;
		if (arg3.aClass96_1 == null) {
			arg3.aClass96_1 = new Class96();
		}
		arg3.aClass96_1.aBoolean187 = false;
		if (arg0) {
			arg3.aByteArray48 = this.aByteArray48;
		} else {
			if (arg4.aByteArray48 == null || arg4.aByteArray48.length < this.anInt2526) {
				arg4.aByteArray48 = new byte[this.anInt2526 + 100];
			}
			arg3.aByteArray48 = arg4.aByteArray48;
			for (local73 = 0; local73 < this.anInt2526; local73++) {
				arg3.aByteArray48[local73] = this.aByteArray48[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray53 = this.aShortArray53;
		} else {
			if (arg4.aShortArray53 == null || arg4.aShortArray53.length < this.anInt2526) {
				arg4.aShortArray53 = new short[this.anInt2526 + 100];
			}
			arg3.aShortArray53 = arg4.aShortArray53;
			for (local73 = 0; local73 < this.anInt2526; local73++) {
				arg3.aShortArray53[local73] = this.aShortArray53[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass110_4 = this.aClass110_4;
		} else {
			if (arg4.aClass110_4 == null) {
				arg4.aClass110_4 = new Class110();
			}
			arg3.aClass110_4 = arg4.aClass110_4;
			arg3.aClass110_4.aBoolean224 = false;
		}
		if (arg2 || this.aShortArray63 == null) {
			arg3.aShortArray63 = this.aShortArray63;
			arg3.aShortArray54 = this.aShortArray54;
			arg3.aShortArray59 = this.aShortArray59;
			arg3.aShortArray55 = this.aShortArray55;
			arg3.aClass110_1 = this.aClass110_1;
		} else {
			if (arg4.aShortArray63 == null || arg4.aShortArray63.length < this.anInt2528) {
				arg4.aShortArray63 = new short[this.anInt2528 + 100];
				arg4.aShortArray54 = new short[this.anInt2528 + 100];
				arg4.aShortArray59 = new short[this.anInt2528 + 100];
				arg4.aShortArray55 = new short[this.anInt2528 + 100];
			}
			arg3.aShortArray63 = arg4.aShortArray63;
			arg3.aShortArray54 = arg4.aShortArray54;
			arg3.aShortArray59 = arg4.aShortArray59;
			arg3.aShortArray55 = arg4.aShortArray55;
			for (local73 = 0; local73 < this.anInt2528; local73++) {
				arg3.aShortArray63[local73] = this.aShortArray63[local73];
				arg3.aShortArray54[local73] = this.aShortArray54[local73];
				arg3.aShortArray59[local73] = this.aShortArray59[local73];
				arg3.aShortArray55[local73] = this.aShortArray55[local73];
			}
			if (Static294.aBoolean445) {
				if (arg4.aClass110_1 == null) {
					arg4.aClass110_1 = new Class110();
				}
				arg3.aClass110_1 = arg4.aClass110_1;
				arg3.aClass110_1.aBoolean224 = false;
			} else {
				arg3.aClass110_1 = null;
			}
		}
		arg3.aFloatArray19 = this.aFloatArray19;
		arg3.aFloatArray20 = this.aFloatArray20;
		arg3.anIntArray297 = this.anIntArray297;
		arg3.anIntArrayArray22 = this.anIntArrayArray22;
		arg3.aShortArray56 = this.aShortArray56;
		arg3.aShortArray62 = this.aShortArray62;
		arg3.aShortArray58 = this.aShortArray58;
		arg3.aShortArray61 = this.aShortArray61;
		arg3.aByteArray49 = this.aByteArray49;
		arg3.anIntArrayArray21 = this.anIntArrayArray21;
		arg3.aClass110_5 = this.aClass110_5;
		arg3.aClass110_2 = this.aClass110_2;
		arg3.anIntArray299 = this.anIntArray299;
		arg3.aShortArray52 = this.aShortArray52;
		arg3.anIntArray296 = this.anIntArray296;
		arg3.aBoolean176 = this.aBoolean176;
		arg3.aShortArray60 = this.aShortArray60;
		arg3.aShortArray57 = this.aShortArray57;
		return arg3;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZ)V")
	private void method2129(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass110_3.anInt2982 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass110_4.anInt2982 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass110_1.anInt2982 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass110_5.anInt2982 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static132.aClass1_Sub18_3.aByteArray71.length < this.anInt2528 * local1) {
			Static132.aClass1_Sub18_3 = new Class1_Sub18((this.anInt2528 + 100) * local1);
		} else {
			Static132.aClass1_Sub18_3.anInt3911 = 0;
		}
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(99) int local99;
		if (arg1) {
			@Pc(109) int local109;
			if (Static240.aBoolean379) {
				for (local60 = 0; local60 < this.anInt2525; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray295[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray300[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray298[local60]);
					local90 = this.anIntArray296[local60];
					local97 = this.anIntArray296[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray52[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static132.aClass1_Sub18_3.anInt3911 = local109 * local1;
						Static132.aClass1_Sub18_3.method3119(local71);
						Static132.aClass1_Sub18_3.method3119(local78);
						Static132.aClass1_Sub18_3.method3119(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt2525; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray295[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray300[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray298[local60]);
					local90 = this.anIntArray296[local60];
					local97 = this.anIntArray296[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray52[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static132.aClass1_Sub18_3.anInt3911 = local109 * local1;
						Static132.aClass1_Sub18_3.method3094(local71);
						Static132.aClass1_Sub18_3.method3094(local78);
						Static132.aClass1_Sub18_3.method3094(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static294.aBoolean445) {
				for (local60 = 0; local60 < this.anInt2526; local60++) {
					local71 = Static132.method2101(this.aShortArray53[local60], this.aShortArray61[local60], this.aShort23, this.aByteArray48[local60]);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + this.aShortArray56[local60] * local1;
					Static132.aClass1_Sub18_3.method3119(local71);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + this.aShortArray62[local60] * local1;
					Static132.aClass1_Sub18_3.method3119(local71);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + this.aShortArray58[local60] * local1;
					Static132.aClass1_Sub18_3.method3119(local71);
				}
			} else {
				local60 = (int) Static34.aFloatArray10[0];
				local71 = (int) Static34.aFloatArray10[1];
				local78 = (int) Static34.aFloatArray10[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort23 * 1.3F);
				local97 = this.aShort22 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt2526; local99++) {
					@Pc(270) short local270 = this.aShortArray56[local99];
					@Pc(275) short local275 = this.aShortArray55[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray63[local270] + local71 * this.aShortArray54[local270] + local78 * this.aShortArray59[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray63[local270] + local71 * this.aShortArray54[local270] + local78 * this.aShortArray59[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray55[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray62[local99];
					@Pc(369) short local369 = this.aShortArray55[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray63[local364] + local71 * this.aShortArray54[local364] + local78 * this.aShortArray59[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray63[local364] + local71 * this.aShortArray54[local364] + local78 * this.aShortArray59[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray55[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray58[local99];
					@Pc(463) short local463 = this.aShortArray55[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray63[local458] + local71 * this.aShortArray54[local458] + local78 * this.aShortArray59[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray63[local458] + local71 * this.aShortArray54[local458] + local78 * this.aShortArray59[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray55[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static132.method2101(this.aShortArray53[local99], this.aShortArray61[local99], local281, this.aByteArray48[local99]);
					@Pc(577) int local577 = Static132.method2101(this.aShortArray53[local99], this.aShortArray61[local99], local375, this.aByteArray48[local99]);
					@Pc(592) int local592 = Static132.method2101(this.aShortArray53[local99], this.aShortArray61[local99], local469, this.aByteArray48[local99]);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + local270 * local1;
					Static132.aClass1_Sub18_3.method3119(local562);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + local364 * local1;
					Static132.aClass1_Sub18_3.method3119(local577);
					Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_4.anInt2982 + local458 * local1;
					Static132.aClass1_Sub18_3.method3119(local592);
				}
				this.aShortArray63 = null;
				this.aShortArray54 = null;
				this.aShortArray59 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort22;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort22 + this.aShort22 / 2);
			Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_1.anInt2982;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static240.aBoolean379) {
				for (local78 = 0; local78 < this.anInt2528; local78++) {
					local752 = this.aShortArray55[local78];
					if (local752 == 0) {
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray63[local78] * local734);
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray54[local78] * local734);
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray59[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray63[local78] * local790);
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray54[local78] * local790);
						Static132.aClass1_Sub18_3.method3066((float) this.aShortArray59[local78] * local790);
					}
					Static132.aClass1_Sub18_3.anInt3911 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt2528; local78++) {
					local752 = this.aShortArray55[local78];
					if (local752 == 0) {
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray63[local78] * local734);
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray54[local78] * local734);
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray59[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray63[local78] * local790);
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray54[local78] * local790);
						Static132.aClass1_Sub18_3.method3088((float) this.aShortArray59[local78] * local790);
					}
					Static132.aClass1_Sub18_3.anInt3911 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static132.aClass1_Sub18_3.anInt3911 = this.aClass110_5.anInt2982;
			if (Static240.aBoolean379) {
				for (local60 = 0; local60 < this.anInt2528; local60++) {
					Static132.aClass1_Sub18_3.method3066(this.aFloatArray19[local60]);
					Static132.aClass1_Sub18_3.method3066(this.aFloatArray20[local60]);
					Static132.aClass1_Sub18_3.anInt3911 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt2528; local60++) {
					Static132.aClass1_Sub18_3.method3088(this.aFloatArray19[local60]);
					Static132.aClass1_Sub18_3.method3088(this.aFloatArray20[local60]);
					Static132.aClass1_Sub18_3.anInt3911 += local1 - 8;
				}
			}
		}
		Static132.aClass1_Sub18_3.anInt3911 = local1 * this.anInt2528;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static240.aBoolean381) {
				local1007 = ByteBuffer.wrap(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
				if (this.aClass52_5 == null) {
					this.aClass52_5 = new Class52(true);
					this.aClass52_5.method1195(local1007);
				} else {
					this.aClass52_5.method1196(local1007);
				}
				if (arg1) {
					this.aClass110_3.aBoolean224 = true;
					this.aClass110_3.aByteBuffer10 = null;
					this.aClass110_3.aClass52_6 = this.aClass52_5;
					this.aClass110_3.anInt2986 = local1;
				}
				if (arg2) {
					this.aClass110_4.aBoolean224 = true;
					this.aClass110_4.aByteBuffer10 = null;
					this.aClass110_4.aClass52_6 = this.aClass52_5;
					this.aClass110_4.anInt2986 = local1;
				}
				if (arg3) {
					this.aClass110_1.aBoolean224 = true;
					this.aClass110_1.aByteBuffer10 = null;
					this.aClass110_1.aClass52_6 = this.aClass52_5;
					this.aClass110_1.anInt2986 = local1;
				}
				if (arg4) {
					this.aClass110_5.aBoolean224 = true;
					this.aClass110_5.aByteBuffer10 = null;
					this.aClass110_5.aClass52_6 = this.aClass52_5;
					this.aClass110_5.anInt2986 = local1;
				}
			} else {
				if (Static132.aByteBuffer7 == null || Static132.aByteBuffer7.capacity() < Static132.aClass1_Sub18_3.anInt3911) {
					Static132.aByteBuffer7 = ByteBuffer.allocateDirect(Static132.aClass1_Sub18_3.anInt3911 + local1 * 100);
				} else {
					Static132.aByteBuffer7.clear();
				}
				Static132.aByteBuffer7.put(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
				Static132.aByteBuffer7.flip();
				if (arg1) {
					this.aClass110_3.aBoolean224 = true;
					this.aClass110_3.aByteBuffer10 = Static132.aByteBuffer7;
					this.aClass110_3.aClass52_6 = null;
					this.aClass110_3.anInt2986 = local1;
				}
				if (arg2) {
					this.aClass110_4.aBoolean224 = true;
					this.aClass110_4.aByteBuffer10 = Static132.aByteBuffer7;
					this.aClass110_3.aClass52_6 = null;
					this.aClass110_4.anInt2986 = local1;
				}
				if (arg3) {
					this.aClass110_1.aBoolean224 = true;
					this.aClass110_1.aByteBuffer10 = Static132.aByteBuffer7;
					this.aClass110_1.aClass52_6 = null;
					this.aClass110_1.anInt2986 = local1;
				}
				if (arg4) {
					this.aClass110_5.aBoolean224 = true;
					this.aClass110_5.aByteBuffer10 = Static132.aByteBuffer7;
					this.aClass110_5.aClass52_6 = null;
					this.aClass110_5.anInt2986 = local1;
				}
			}
		} else if (Static240.aBoolean372) {
			@Pc(1211) Class52 local1211 = new Class52();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
			local1211.method1195(local1218);
			if (arg1) {
				this.aClass110_3.aBoolean224 = true;
				this.aClass110_3.aByteBuffer10 = null;
				this.aClass110_3.aClass52_6 = local1211;
				this.aClass110_3.anInt2986 = local1;
			}
			if (arg2) {
				this.aClass110_4.aBoolean224 = true;
				this.aClass110_4.aByteBuffer10 = null;
				this.aClass110_4.aClass52_6 = local1211;
				this.aClass110_4.anInt2986 = local1;
			}
			if (arg3) {
				this.aClass110_1.aBoolean224 = true;
				this.aClass110_1.aByteBuffer10 = null;
				this.aClass110_1.aClass52_6 = local1211;
				this.aClass110_1.anInt2986 = local1;
			}
			if (arg4) {
				this.aClass110_5.aBoolean224 = true;
				this.aClass110_5.aByteBuffer10 = null;
				this.aClass110_5.aClass52_6 = local1211;
				this.aClass110_5.anInt2986 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static132.aClass1_Sub18_3.anInt3911);
			local1007.put(Static132.aClass1_Sub18_3.aByteArray71, 0, Static132.aClass1_Sub18_3.anInt3911);
			local1007.flip();
			if (arg1) {
				this.aClass110_3.aBoolean224 = true;
				this.aClass110_3.aByteBuffer10 = local1007;
				this.aClass110_3.aClass52_6 = null;
				this.aClass110_3.anInt2986 = local1;
			}
			if (arg2) {
				this.aClass110_4.aBoolean224 = true;
				this.aClass110_4.aByteBuffer10 = local1007;
				this.aClass110_3.aClass52_6 = null;
				this.aClass110_4.anInt2986 = local1;
			}
			if (arg3) {
				this.aClass110_1.aBoolean224 = true;
				this.aClass110_1.aByteBuffer10 = local1007;
				this.aClass110_1.aClass52_6 = null;
				this.aClass110_1.anInt2986 = local1;
			}
			if (arg4) {
				this.aClass110_5.aBoolean224 = true;
				this.aClass110_5.aByteBuffer10 = local1007;
				this.aClass110_5.aClass52_6 = null;
				this.aClass110_5.anInt2986 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			Static132.anInt2529 = 0;
			Static132.anInt2530 = 0;
			Static132.anInt2531 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray22.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray22[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static132.anInt2529 += this.anIntArray295[local53];
						Static132.anInt2530 += this.anIntArray300[local53];
						Static132.anInt2531 += this.anIntArray298[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static132.anInt2529 = Static132.anInt2529 / local18 + local8;
				Static132.anInt2530 = Static132.anInt2530 / local18 + local12;
				Static132.anInt2531 = Static132.anInt2531 / local18 + local16;
			} else {
				Static132.anInt2529 = local8;
				Static132.anInt2530 = local12;
				Static132.anInt2531 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local141 = this.anIntArrayArray22[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray295[local45] += local8;
						this.anIntArray300[local45] += local12;
						this.anIntArray298[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(246) int local246;
		@Pc(264) int local264;
		@Pc(484) int local484;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local141 = this.anIntArrayArray22[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray295[local45] -= Static132.anInt2529;
						this.anIntArray300[local45] -= Static132.anInt2530;
						this.anIntArray298[local45] -= Static132.anInt2531;
						if (arg4 != 0) {
							local53 = Class135.anIntArray472[arg4];
							local246 = Class135.anIntArray474[arg4];
							local264 = this.anIntArray300[local45] * local53 + this.anIntArray295[local45] * local246 + 32767 >> 16;
							this.anIntArray300[local45] = this.anIntArray300[local45] * local246 + 32767 - this.anIntArray295[local45] * local53 >> 16;
							this.anIntArray295[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class135.anIntArray472[arg2];
							local246 = Class135.anIntArray474[arg2];
							local264 = this.anIntArray300[local45] * local246 + 32767 - this.anIntArray298[local45] * local53 >> 16;
							this.anIntArray298[local45] = this.anIntArray300[local45] * local53 + this.anIntArray298[local45] * local246 + 32767 >> 16;
							this.anIntArray300[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class135.anIntArray472[arg3];
							local246 = Class135.anIntArray474[arg3];
							local264 = this.anIntArray298[local45] * local53 + this.anIntArray295[local45] * local246 + 32767 >> 16;
							this.anIntArray298[local45] = this.anIntArray298[local45] * local246 + 32767 - this.anIntArray295[local45] * local53 >> 16;
							this.anIntArray295[local45] = local264;
						}
						this.anIntArray295[local45] += Static132.anInt2529;
						this.anIntArray300[local45] += Static132.anInt2530;
						this.anIntArray298[local45] += Static132.anInt2531;
					}
				}
			}
			if (arg5 && this.aShortArray63 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray22.length) {
						local141 = this.anIntArrayArray22[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray296[local45];
							local246 = this.anIntArray296[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray52[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class135.anIntArray472[arg4];
									local498 = Class135.anIntArray474[arg4];
									local516 = this.aShortArray54[local484] * local494 + this.aShortArray63[local484] * local498 + 32767 >> 16;
									this.aShortArray54[local484] = (short) (this.aShortArray54[local484] * local498 + 32767 - this.aShortArray63[local484] * local494 >> 16);
									this.aShortArray63[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class135.anIntArray472[arg2];
									local498 = Class135.anIntArray474[arg2];
									local516 = this.aShortArray54[local484] * local498 + 32767 - this.aShortArray59[local484] * local494 >> 16;
									this.aShortArray59[local484] = (short) (this.aShortArray54[local484] * local494 + this.aShortArray59[local484] * local498 + 32767 >> 16);
									this.aShortArray54[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class135.anIntArray472[arg3];
									local498 = Class135.anIntArray474[arg3];
									local516 = this.aShortArray59[local484] * local494 + this.aShortArray63[local484] * local498 + 32767 >> 16;
									this.aShortArray59[local484] = (short) (this.aShortArray59[local484] * local498 + 32767 - this.aShortArray63[local484] * local494 >> 16);
									this.aShortArray63[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass110_1 != null) {
					this.aClass110_1.aBoolean224 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local141 = this.anIntArrayArray22[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray295[local45] -= Static132.anInt2529;
						this.anIntArray300[local45] -= Static132.anInt2530;
						this.anIntArray298[local45] -= Static132.anInt2531;
						this.anIntArray295[local45] = this.anIntArray295[local45] * arg2 >> 7;
						this.anIntArray300[local45] = this.anIntArray300[local45] * arg3 >> 7;
						this.anIntArray298[local45] = this.anIntArray298[local45] * arg4 >> 7;
						this.anIntArray295[local45] += Static132.anInt2529;
						this.anIntArray300[local45] += Static132.anInt2530;
						this.anIntArray298[local45] += Static132.anInt2531;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray21 != null && this.aByteArray48 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray21.length) {
						local141 = this.anIntArrayArray21[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray48[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray48[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass110_4.aBoolean224 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray21 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray21.length) {
					local141 = this.anIntArrayArray21[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray53[local45] & 0xFFFF;
						local246 = local53 >> 10 & 0x3F;
						local264 = local53 >> 7 & 0x7;
						local484 = local53 & 0x7F;
						@Pc(932) int local932 = local246 + arg2 & 0x3F;
						local264 += arg3 / 4;
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 > 7) {
							local264 = 7;
						}
						local484 += arg4;
						if (local484 < 0) {
							local484 = 0;
						} else if (local484 > 127) {
							local484 = 127;
						}
						this.aShortArray53[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass110_4.aBoolean224 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!rg;)Lclient!rg;")
	public Class48_Sub2 method2130(@OriginalArg(0) Class48_Sub2 arg0) {
		if (this.anInt2528 == 0) {
			return null;
		}
		if (!this.aClass96_1.aBoolean187) {
			this.method2111();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static34.anInt733 > 0) {
			local26 = this.aClass96_1.aShort24 - (this.aClass96_1.aShort28 * Static34.anInt733 >> 8) >> 3;
			local40 = this.aClass96_1.aShort26 - (this.aClass96_1.aShort25 * Static34.anInt733 >> 8) >> 3;
		} else {
			local26 = this.aClass96_1.aShort24 - (this.aClass96_1.aShort25 * Static34.anInt733 >> 8) >> 3;
			local40 = this.aClass96_1.aShort26 - (this.aClass96_1.aShort28 * Static34.anInt733 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static34.anInt732 > 0) {
			local85 = this.aClass96_1.aShort29 - (this.aClass96_1.aShort28 * Static34.anInt732 >> 8) >> 3;
			local99 = this.aClass96_1.aShort27 - (this.aClass96_1.aShort25 * Static34.anInt732 >> 8) >> 3;
		} else {
			local85 = this.aClass96_1.aShort29 - (this.aClass96_1.aShort25 * Static34.anInt732 >> 8) >> 3;
			local99 = this.aClass96_1.aShort27 - (this.aClass96_1.aShort28 * Static34.anInt732 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class48_Sub2 local151;
		if (arg0 == null || arg0.aByteArray77.length < local134 * local140) {
			local151 = new Class48_Sub2(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt4745 = arg0.anInt4754 = local134;
			arg0.anInt4749 = arg0.anInt4746 = local140;
			arg0.method3626();
		}
		local151.anInt4752 = local26;
		local151.anInt4748 = local85;
		if (Static132.anIntArray302.length < this.anInt2528) {
			Static132.anIntArray302 = new int[this.anInt2528];
			Static132.anIntArray301 = new int[this.anInt2528];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt2525; local194++) {
			@Pc(216) int local216 = (this.anIntArray295[local194] - (this.anIntArray300[local194] * Static34.anInt733 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray298[local194] - (this.anIntArray300[local194] * Static34.anInt732 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray296[local194];
			local246 = this.anIntArray296[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray52[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static132.anIntArray302[local258] = local216;
				Static132.anIntArray301[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt2526; local194++) {
			if (this.aByteArray48[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray56[local194];
				@Pc(297) short local297 = this.aShortArray62[local194];
				@Pc(302) short local302 = this.aShortArray58[local194];
				local246 = Static132.anIntArray302[local292];
				local248 = Static132.anIntArray302[local297];
				local258 = Static132.anIntArray302[local302];
				@Pc(318) int local318 = Static132.anIntArray301[local292];
				@Pc(322) int local322 = Static132.anIntArray301[local297];
				@Pc(326) int local326 = Static132.anIntArray301[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static208.method3233(local151.aByteArray77, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}
}
