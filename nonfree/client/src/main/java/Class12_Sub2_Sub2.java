import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!tl;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!va;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!nm;")
	private Class118 aClass118_1;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!tl;")
	private Class165 aClass165_2;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Lclient!tl;")
	private Class165 aClass165_3;

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Lclient!hl;")
	private Class62 aClass62_2;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Lclient!tl;")
	private Class165 aClass165_4;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!tl;")
	private Class165 aClass165_5;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
	private int anInt3965 = 0;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
	private int anInt3966 = 0;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
	public int anInt3964 = 0;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!pn;IIZ)V")
	public Class12_Sub2_Sub2(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt4096];
		this.anIntArray345 = new int[arg0.anInt4094 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt4096; local35++) {
			if ((arg0.aByteArray50 == null || arg0.aByteArray50[local35] != 2) && (arg0.aShortArray68 == null || arg0.aShortArray68[local35] == -1 || !Static204.anInterface2_1.method1978(arg0.aShortArray68[local35] & 0xFFFF))) {
				local26[this.anInt3966++] = local35;
				this.anIntArray345[arg0.anIntArray372[local35]]++;
				this.anIntArray345[arg0.anIntArray365[local35]]++;
				this.anIntArray345[arg0.anIntArray367[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt3966];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt3966; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray68 != null) {
				local138 = arg0.aShortArray68[local128];
				if (local138 != -1) {
					local134 = Static204.anInterface2_1.method1983(local138 & 0xFFFF);
					local136 = Static204.anInterface2_1.method1970(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray52 != null && arg0.aByteArray52[local128] != 0 || local138 != -1 && !Static204.anInterface2_1.method1980(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray53 != null) {
				local130 += arg0.aByteArray53[local128] << 17;
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
		Static179.method2817(local118, local26);
		this.anInt3964 = arg0.anInt4094;
		this.anInt3967 = arg0.anInt4097;
		this.anIntArray344 = arg0.anIntArray371;
		this.anIntArray340 = arg0.anIntArray369;
		this.anIntArray343 = arg0.anIntArray363;
		this.anIntArray342 = arg0.anIntArray361;
		this.aShortArray62 = arg0.aShortArray65;
		local120 = this.anInt3966 * 3;
		this.aShortArray53 = new short[local120];
		this.aShortArray60 = new short[local120];
		this.aShortArray51 = new short[local120];
		this.aShortArray59 = new short[local120];
		this.aFloatArray24 = new float[local120];
		this.aFloatArray23 = new float[local120];
		this.aShortArray52 = new short[this.anInt3966];
		this.aByteArray46 = new byte[this.anInt3966];
		this.aShortArray54 = new short[this.anInt3966];
		this.aShortArray58 = new short[this.anInt3966];
		this.aShortArray57 = new short[this.anInt3966];
		this.aShortArray55 = new short[this.anInt3966];
		if (arg0.anIntArray368 != null) {
			this.aByteArray47 = new byte[this.anInt3966];
		}
		if (arg0.aShortArray69 != null) {
			this.aShortArray56 = new short[this.anInt3966];
		}
		this.aClass174_1 = new Class174();
		this.aClass165_1 = new Class165();
		this.aClass165_3 = new Class165();
		if (Static298.aBoolean357) {
			this.aClass165_2 = new Class165();
		}
		this.aClass165_4 = new Class165();
		this.aClass165_5 = new Class165();
		this.aShort20 = (short) arg1;
		this.aShort19 = (short) arg2;
		this.aShortArray61 = new short[local120];
		Static203.aLongArray12 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt3967; local130++) {
			local229 = this.anIntArray345[local130];
			this.anIntArray345[local130] = local128;
			local128 += local229;
		}
		this.anIntArray345[this.anInt3967] = local128;
		@Pc(433) int[] local433 = null;
		@Pc(435) int[] local435 = null;
		@Pc(437) int[] local437 = null;
		@Pc(440) float[][] local440 = null;
		@Pc(560) int local560;
		@Pc(446) int local446;
		@Pc(690) float local690;
		@Pc(721) float local721;
		@Pc(692) float local692;
		if (arg0.aByteArray55 != null) {
			local446 = arg0.anInt4095;
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
			for (local466 = 0; local466 < this.anInt3966; local466++) {
				@Pc(505) int local505 = local26[local466];
				if (arg0.aByteArray55[local505] != -1) {
					@Pc(518) int local518 = arg0.aByteArray55[local505] & 0xFF;
					for (@Pc(520) int local520 = 0; local520 < 3; local520++) {
						@Pc(530) int local530;
						if (local520 == 0) {
							local530 = arg0.anIntArray372[local505];
						} else if (local520 == 1) {
							local530 = arg0.anIntArray365[local505];
						} else {
							local530 = arg0.anIntArray367[local505];
						}
						@Pc(550) int local550 = arg0.anIntArray371[local530];
						@Pc(555) int local555 = arg0.anIntArray369[local530];
						local560 = arg0.anIntArray363[local530];
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
				@Pc(640) byte local640 = arg0.aByteArray57[local466];
				if (local640 > 0) {
					local433[local466] = (local449[local466] + local452[local466]) / 2;
					local435[local466] = (local455[local466] + local458[local466]) / 2;
					local437[local466] = (local461[local466] + local464[local466]) / 2;
					if (local640 == 1) {
						@Pc(686) short local686 = arg0.aShortArray66[local466];
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
						local721 = 64.0F / (float) (arg0.aShortArray72[local466] & 0xFFFF);
					} else if (local640 == 2) {
						local690 = 64.0F / (float) (arg0.aShortArray66[local466] & 0xFFFF);
						local721 = 64.0F / (float) (arg0.aShortArray72[local466] & 0xFFFF);
						local692 = 64.0F / (float) (arg0.aShortArray70[local466] & 0xFFFF);
					} else {
						local690 = (float) arg0.aShortArray66[local466] / 1024.0F;
						local721 = (float) arg0.aShortArray72[local466] / 1024.0F;
						local692 = (float) arg0.aShortArray70[local466] / 1024.0F;
					}
					local440[local466] = Static203.method3170(arg0.aShortArray67[local466], arg0.aShortArray64[local466], arg0.aShortArray71[local466], arg0.aByteArray58[local466] & 0xFF, local690, local721, local692);
				}
			}
		}
		@Pc(824) int local824;
		@Pc(829) short local829;
		for (local446 = 0; local446 < this.anInt3966; local446++) {
			@Pc(817) int local817 = local26[local446];
			local824 = arg0.aShortArray63[local817] & 0xFFFF;
			if (arg0.aShortArray68 == null) {
				local829 = -1;
			} else {
				local829 = arg0.aShortArray68[local817];
			}
			@Pc(840) int local840;
			if (arg0.aByteArray55 == null) {
				local840 = -1;
			} else {
				local840 = arg0.aByteArray55[local817];
			}
			@Pc(851) int local851;
			if (arg0.aByteArray52 == null) {
				local851 = 0;
			} else {
				local851 = arg0.aByteArray52[local817] & 0xFF;
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
					local909 = arg0.aByteArray57[local840];
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
						local916 = arg0.anIntArray372[local817];
						local921 = arg0.anIntArray365[local817];
						local926 = arg0.anIntArray367[local817];
						@Pc(931) short local931 = arg0.aShortArray67[local840];
						@Pc(936) short local936 = arg0.aShortArray64[local840];
						@Pc(941) short local941 = arg0.aShortArray71[local840];
						@Pc(947) float local947 = (float) arg0.anIntArray371[local931];
						@Pc(953) float local953 = (float) arg0.anIntArray369[local931];
						local959 = arg0.anIntArray363[local931];
						local967 = (float) arg0.anIntArray371[local936] - local947;
						local975 = (float) arg0.anIntArray369[local936] - local953;
						@Pc(983) float local983 = (float) arg0.anIntArray363[local936] - local959;
						@Pc(991) float local991 = (float) arg0.anIntArray371[local941] - local947;
						@Pc(999) float local999 = (float) arg0.anIntArray369[local941] - local953;
						@Pc(1007) float local1007 = (float) arg0.anIntArray363[local941] - local959;
						@Pc(1015) float local1015 = (float) arg0.anIntArray371[local916] - local947;
						@Pc(1023) float local1023 = (float) arg0.anIntArray369[local916] - local953;
						@Pc(1031) float local1031 = (float) arg0.anIntArray363[local916] - local959;
						@Pc(1039) float local1039 = (float) arg0.anIntArray371[local921] - local947;
						@Pc(1047) float local1047 = (float) arg0.anIntArray369[local921] - local953;
						local1055 = (float) arg0.anIntArray363[local921] - local959;
						local1063 = (float) arg0.anIntArray371[local926] - local947;
						local1071 = (float) arg0.anIntArray369[local926] - local953;
						local1079 = (float) arg0.anIntArray363[local926] - local959;
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
						local916 = arg0.anIntArray372[local817];
						local921 = arg0.anIntArray365[local817];
						local926 = arg0.anIntArray367[local817];
						@Pc(1283) int local1283 = local433[local840];
						local1287 = local435[local840];
						@Pc(1291) int local1291 = local437[local840];
						@Pc(1295) float[] local1295 = local440[local840];
						@Pc(1300) byte local1300 = arg0.aByteArray56[local840];
						local959 = (float) arg0.aByteArray49[local840] / 256.0F;
						if (local909 == 1) {
							local967 = (float) (arg0.aShortArray70[local840] & 0xFFFF) / 1024.0F;
							Static203.method3191(arg0.anIntArray371[local916], arg0.anIntArray369[local916], arg0.anIntArray363[local916], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local861 = Static203.aFloat41;
							local863 = Static203.aFloat40;
							Static203.method3191(arg0.anIntArray371[local921], arg0.anIntArray369[local921], arg0.anIntArray363[local921], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local865 = Static203.aFloat41;
							local690 = Static203.aFloat40;
							Static203.method3191(arg0.anIntArray371[local926], arg0.anIntArray369[local926], arg0.anIntArray363[local926], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local721 = Static203.aFloat41;
							local692 = Static203.aFloat40;
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
							local967 = (float) arg0.aByteArray54[local840] / 256.0F;
							local975 = (float) arg0.aByteArray51[local840] / 256.0F;
							@Pc(1532) int local1532 = arg0.anIntArray371[local921] - arg0.anIntArray371[local916];
							@Pc(1542) int local1542 = arg0.anIntArray369[local921] - arg0.anIntArray369[local916];
							@Pc(1552) int local1552 = arg0.anIntArray363[local921] - arg0.anIntArray363[local916];
							@Pc(1562) int local1562 = arg0.anIntArray371[local926] - arg0.anIntArray371[local916];
							@Pc(1572) int local1572 = arg0.anIntArray369[local926] - arg0.anIntArray369[local916];
							@Pc(1582) int local1582 = arg0.anIntArray363[local926] - arg0.anIntArray363[local916];
							@Pc(1590) int local1590 = local1542 * local1582 - local1572 * local1552;
							@Pc(1598) int local1598 = local1552 * local1562 - local1582 * local1532;
							@Pc(1606) int local1606 = local1532 * local1572 - local1562 * local1542;
							local1055 = 64.0F / (float) (arg0.aShortArray66[local840] & 0xFFFF);
							local1063 = 64.0F / (float) (arg0.aShortArray72[local840] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray70[local840] & 0xFFFF);
							local1079 = ((float) local1590 * local1295[0] + (float) local1598 * local1295[1] + (float) local1606 * local1295[2]) / local1055;
							local1087 = ((float) local1590 * local1295[3] + (float) local1598 * local1295[4] + (float) local1606 * local1295[5]) / local1063;
							local1095 = ((float) local1590 * local1295[6] + (float) local1598 * local1295[7] + (float) local1606 * local1295[8]) / local1071;
							local560 = Static203.method3175(local1079, local1087, local1095);
							Static203.method3200(arg0.anIntArray371[local916], arg0.anIntArray369[local916], arg0.anIntArray363[local916], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local861 = Static203.aFloat38;
							local863 = Static203.aFloat36;
							Static203.method3200(arg0.anIntArray371[local921], arg0.anIntArray369[local921], arg0.anIntArray363[local921], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local865 = Static203.aFloat38;
							local690 = Static203.aFloat36;
							Static203.method3200(arg0.anIntArray371[local926], arg0.anIntArray369[local926], arg0.anIntArray363[local926], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local721 = Static203.aFloat38;
							local692 = Static203.aFloat36;
						} else if (local909 == 3) {
							Static203.method3171(arg0.anIntArray371[local916], arg0.anIntArray369[local916], arg0.anIntArray363[local916], local1283, local1287, local1291, local1295, local1300, local959);
							local861 = Static203.aFloat39;
							local863 = Static203.aFloat37;
							Static203.method3171(arg0.anIntArray371[local921], arg0.anIntArray369[local921], arg0.anIntArray363[local921], local1283, local1287, local1291, local1295, local1300, local959);
							local865 = Static203.aFloat39;
							local690 = Static203.aFloat37;
							Static203.method3171(arg0.anIntArray371[local926], arg0.anIntArray369[local926], arg0.anIntArray363[local926], local1283, local1287, local1291, local1295, local1300, local959);
							local721 = Static203.aFloat39;
							local692 = Static203.aFloat37;
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
			arg0.method3336();
			if (arg0.aByteArray50 == null) {
				local909 = 0;
			} else {
				local909 = arg0.aByteArray50[local817];
			}
			if (local909 == 0) {
				@Pc(2001) long local2001 = (long) (local840 << 2) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				local926 = arg0.anIntArray372[local817];
				@Pc(2011) Class124 local2011 = arg0.aClass124Array2[local926];
				this.aShortArray54[local446] = this.method3201(arg0, local926, local2001, local2011.anInt3795, local2011.anInt3798, local2011.anInt3799, local2011.anInt3797, local861, local863);
				local1287 = arg0.anIntArray365[local817];
				@Pc(2040) Class124 local2040 = arg0.aClass124Array2[local1287];
				this.aShortArray58[local446] = this.method3201(arg0, local1287, local2001 + (long) local873, local2040.anInt3795, local2040.anInt3798, local2040.anInt3799, local2040.anInt3797, local865, local690);
				@Pc(2067) int local2067 = arg0.anIntArray367[local817];
				@Pc(2072) Class124 local2072 = arg0.aClass124Array2[local2067];
				this.aShortArray57[local446] = this.method3201(arg0, local2067, local2001 + (long) local875, local2072.anInt3795, local2072.anInt3798, local2072.anInt3799, local2072.anInt3797, local721, local692);
			} else if (local909 == 1) {
				@Pc(2103) Class36 local2103 = arg0.aClass36Array1[local817];
				@Pc(2144) long local2144 = (long) ((local840 << 2) + (local2103.anInt1080 > 0 ? 1024 : 2048) + (local2103.anInt1081 + 256 << 12) + (local2103.anInt1086 + 256 << 22)) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				this.aShortArray54[local446] = this.method3201(arg0, arg0.anIntArray372[local817], local2144, local2103.anInt1080, local2103.anInt1081, local2103.anInt1086, 0, local861, local863);
				this.aShortArray58[local446] = this.method3201(arg0, arg0.anIntArray365[local817], local2144 + (long) local873, local2103.anInt1080, local2103.anInt1081, local2103.anInt1086, 0, local865, local690);
				this.aShortArray57[local446] = this.method3201(arg0, arg0.anIntArray367[local817], local2144 + (long) local875, local2103.anInt1080, local2103.anInt1081, local2103.anInt1086, 0, local721, local692);
			}
			if (arg0.aShortArray68 == null) {
				this.aShortArray55[local446] = -1;
			} else {
				this.aShortArray55[local446] = arg0.aShortArray68[local817];
			}
			if (this.aByteArray47 != null) {
				this.aByteArray47[local446] = (byte) arg0.anIntArray368[local817];
			}
			this.aShortArray52[local446] = arg0.aShortArray63[local817];
			if (arg0.aByteArray52 != null) {
				this.aByteArray46[local446] = arg0.aByteArray52[local817];
			}
			if (arg0.aShortArray69 != null) {
				this.aShortArray56[local446] = arg0.aShortArray69[local817];
			}
		}
		local446 = 0;
		@Pc(2278) short local2278 = -10000;
		for (local824 = 0; local824 < this.anInt3966; local824++) {
			local829 = this.aShortArray55[local824];
			if (local829 != local2278) {
				local446++;
				local2278 = local829;
			}
		}
		this.anIntArray341 = new int[local446 + 1];
		local446 = 0;
		local2278 = -10000;
		for (local824 = 0; local824 < this.anInt3966; local824++) {
			local829 = this.aShortArray55[local824];
			if (local829 != local2278) {
				this.anIntArray341[local446++] = local824;
				local2278 = local829;
			}
		}
		this.anIntArray341[local446] = this.anInt3966;
		Static203.aLongArray12 = null;
		this.aShortArray53 = Static203.method3198(this.aShortArray53, this.anInt3965);
		this.aShortArray60 = Static203.method3198(this.aShortArray60, this.anInt3965);
		this.aShortArray51 = Static203.method3198(this.aShortArray51, this.anInt3965);
		this.aShortArray59 = Static203.method3198(this.aShortArray59, this.anInt3965);
		this.aFloatArray24 = Static203.method3192(this.aFloatArray24, this.anInt3965);
		this.aFloatArray23 = Static203.method3192(this.aFloatArray23, this.anInt3965);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
	@Override
	protected void method3139() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			this.anIntArray344[local1] = this.anIntArray344[local1] + 7 >> 4;
			this.anIntArray340[local1] = this.anIntArray340[local1] + 7 >> 4;
			this.anIntArray343[local1] = this.anIntArray343[local1] + 7 >> 4;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "()V")
	public void method3169() {
		if (this.aShortArray53 == null) {
			this.method3141();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3964; local7++) {
			@Pc(16) int local16 = this.anIntArray344[local7];
			this.anIntArray344[local7] = this.anIntArray343[local7];
			this.anIntArray343[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt3965; local7++) {
			@Pc(43) short local43 = this.aShortArray53[local7];
			this.aShortArray53[local7] = this.aShortArray51[local7];
			this.aShortArray51[local7] = (short) -local43;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt3965 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static178.aGL1;
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
		this.method3184();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(III)V")
	@Override
	public void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			this.anIntArray344[local1] += arg0;
			this.anIntArray340[local1] += arg1;
			this.anIntArray343[local1] += arg2;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()V")
	@Override
	public void method3140() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			@Pc(10) int local10 = this.anIntArray343[local1];
			this.anIntArray343[local1] = this.anIntArray344[local1];
			this.anIntArray344[local1] = -local10;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!en;")
	@Override
	public Class12 method3359() {
		this.aBoolean256 = false;
		if (this.aClass118_1 != null) {
			this.aShortArray53 = this.aClass118_1.aShortArray38;
			this.aShortArray60 = this.aClass118_1.aShortArray36;
			this.aShortArray51 = this.aClass118_1.aShortArray35;
			this.aShortArray59 = this.aClass118_1.aShortArray37;
			this.aClass118_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "()V")
	public void method3172() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray342 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3964; local9++) {
				local20 = this.anIntArray342[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray31 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray31[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt3964) {
				local20 = this.anIntArray342[local9] & 0xFF;
				this.anIntArrayArray31[local20][local5[local20]++] = local9++;
			}
			this.anIntArray342 = null;
		}
		if (this.aByteArray47 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3966; local9++) {
			local20 = this.aByteArray47[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray30 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray30[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt3966) {
			local20 = this.aByteArray47[local9] & 0xFF;
			this.anIntArrayArray30[local20][local5[local20]++] = local9++;
		}
		this.aByteArray47 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z")
	@Override
	public boolean method3351() {
		return this.aBoolean256 && this.anIntArray344 != null && this.aShortArray53 != null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(SS)V")
	public void method3173(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3966; local1++) {
			if (this.aShortArray55[local1] == arg0) {
				this.aShortArray55[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static204.anInterface2_1.method1981(arg0 & 0xFFFF);
			local22 = Static204.anInterface2_1.method1982(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static204.anInterface2_1.method1981(arg1 & 0xFFFF);
			local43 = Static204.anInterface2_1.method1982(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass165_3.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public void method3174(@OriginalArg(0) int arg0) {
		this.aShort20 = (short) arg0;
		this.aClass165_3.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3167(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3186(arg0, arg1, arg2, Static203.aClass12_Sub2_Sub2_6, Static203.aClass12_Sub2_Sub2_5);
	}

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "()I")
	@Override
	public int method3153() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort39;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()I")
	@Override
	public int method3142() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort37;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	@Override
	public void method3144(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3964; local9++) {
			@Pc(29) int local29 = this.anIntArray343[local9] * local3 + this.anIntArray344[local9] * local7 >> 16;
			this.anIntArray343[local9] = this.anIntArray343[local9] * local7 - this.anIntArray344[local9] * local3 >> 16;
			this.anIntArray344[local9] = local29;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "()I")
	@Override
	public int method3160() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort36;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	@Override
	public void method3158(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3964; local9++) {
			@Pc(29) int local29 = this.anIntArray340[local9] * local7 - this.anIntArray343[local9] * local3 >> 16;
			this.anIntArray343[local9] = this.anIntArray340[local9] * local3 + this.anIntArray343[local9] * local7 >> 16;
			this.anIntArray340[local9] = local29;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static203.anInt3970 = 0;
			Static203.anInt3969 = 0;
			Static203.anInt3968 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray31.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray31[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local53]) != 0) {
							Static203.anInt3970 += this.anIntArray344[local53];
							Static203.anInt3969 += this.anIntArray340[local53];
							Static203.anInt3968 += this.anIntArray343[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static203.anInt3970 = Static203.anInt3970 / local18 + arg2;
				Static203.anInt3969 = Static203.anInt3969 / local18 + arg3;
				Static203.anInt3968 = Static203.anInt3968 / local18 + arg4;
				Static203.aBoolean257 = true;
			} else {
				Static203.anInt3970 = arg2;
				Static203.anInt3969 = arg3;
				Static203.anInt3968 = arg4;
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
				if (local26 < this.anIntArrayArray31.length) {
					local228 = this.anIntArrayArray31[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local45]) != 0) {
							this.anIntArray344[local45] += arg2;
							this.anIntArray340[local45] += arg3;
							this.anIntArray343[local45] += arg4;
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
					if (local26 < this.anIntArrayArray31.length) {
						local228 = this.anIntArrayArray31[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local45]) != 0) {
								this.anIntArray344[local45] -= Static203.anInt3970;
								this.anIntArray340[local45] -= Static203.anInt3969;
								this.anIntArray343[local45] -= Static203.anInt3968;
								if (arg4 != 0) {
									local53 = Class131.anIntArray355[arg4];
									local343 = Class131.anIntArray353[arg4];
									local365 = this.anIntArray340[local45] * local53 + this.anIntArray344[local45] * local343 + 32767 >> 16;
									this.anIntArray340[local45] = this.anIntArray340[local45] * local343 + 32767 - this.anIntArray344[local45] * local53 >> 16;
									this.anIntArray344[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class131.anIntArray355[arg2];
									local343 = Class131.anIntArray353[arg2];
									local365 = this.anIntArray340[local45] * local343 + 32767 - this.anIntArray343[local45] * local53 >> 16;
									this.anIntArray343[local45] = this.anIntArray340[local45] * local53 + this.anIntArray343[local45] * local343 + 32767 >> 16;
									this.anIntArray340[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class131.anIntArray355[arg3];
									local343 = Class131.anIntArray353[arg3];
									local365 = this.anIntArray343[local45] * local53 + this.anIntArray344[local45] * local343 + 32767 >> 16;
									this.anIntArray343[local45] = this.anIntArray343[local45] * local343 + 32767 - this.anIntArray344[local45] * local53 >> 16;
									this.anIntArray344[local45] = local365;
								}
								this.anIntArray344[local45] += Static203.anInt3970;
								this.anIntArray340[local45] += Static203.anInt3969;
								this.anIntArray343[local45] += Static203.anInt3968;
							}
						}
					}
				}
				if (arg5 && this.aShortArray53 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray31.length) {
							local228 = this.anIntArrayArray31[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local45]) != 0) {
									local53 = this.anIntArray345[local45];
									local343 = this.anIntArray345[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray61[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class131.anIntArray355[arg4];
											local434 = Class131.anIntArray353[arg4];
											local440 = this.aShortArray60[local387] * local428 + this.aShortArray53[local387] * local434 + 32767 >> 16;
											this.aShortArray60[local387] = (short) (this.aShortArray60[local387] * local434 + 32767 - this.aShortArray53[local387] * local428 >> 16);
											this.aShortArray53[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class131.anIntArray355[arg2];
											local434 = Class131.anIntArray353[arg2];
											local440 = this.aShortArray60[local387] * local434 + 32767 - this.aShortArray51[local387] * local428 >> 16;
											this.aShortArray51[local387] = (short) (this.aShortArray60[local387] * local428 + this.aShortArray51[local387] * local434 + 32767 >> 16);
											this.aShortArray60[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class131.anIntArray355[arg3];
											local434 = Class131.anIntArray353[arg3];
											local440 = this.aShortArray51[local387] * local428 + this.aShortArray53[local387] * local434 + 32767 >> 16;
											this.aShortArray51[local387] = (short) (this.aShortArray51[local387] * local434 + 32767 - this.aShortArray53[local387] * local428 >> 16);
											this.aShortArray53[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass165_2 != null) {
						this.aClass165_2.aBoolean323 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static203.aBoolean257) {
					local343 = arg7[0] * Static203.anInt3970 + arg7[3] * Static203.anInt3969 + arg7[6] * Static203.anInt3968 + 16384 >> 15;
					local365 = arg7[1] * Static203.anInt3970 + arg7[4] * Static203.anInt3969 + arg7[7] * Static203.anInt3968 + 16384 >> 15;
					local387 = arg7[2] * Static203.anInt3970 + arg7[5] * Static203.anInt3969 + arg7[8] * Static203.anInt3968 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static203.anInt3970 = local343;
					Static203.anInt3969 = local365;
					Static203.anInt3968 = local387;
					Static203.aBoolean257 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class131.anIntArray353[arg2] >> 1;
				local387 = Class131.anIntArray355[arg2] >> 1;
				local428 = Class131.anIntArray353[arg3] >> 1;
				local434 = Class131.anIntArray355[arg3] >> 1;
				local440 = Class131.anIntArray353[arg4] >> 1;
				local446 = Class131.anIntArray355[arg4] >> 1;
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
				@Pc(590) int local590 = local410[0] * -Static203.anInt3970 + local410[1] * -Static203.anInt3969 + local410[2] * -Static203.anInt3968 + 16384 >> 15;
				local615 = local410[3] * -Static203.anInt3970 + local410[4] * -Static203.anInt3969 + local410[5] * -Static203.anInt3968 + 16384 >> 15;
				local640 = local410[6] * -Static203.anInt3970 + local410[7] * -Static203.anInt3969 + local410[8] * -Static203.anInt3968 + 16384 >> 15;
				local644 = local590 + Static203.anInt3970;
				@Pc(648) int local648 = local615 + Static203.anInt3969;
				local652 = local640 + Static203.anInt3968;
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
					if (local929 < this.anIntArrayArray31.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray31[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray344[local949] + local789[1] * this.anIntArray340[local949] + local789[2] * this.anIntArray343[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray344[local949] + local789[4] * this.anIntArray340[local949] + local789[5] * this.anIntArray343[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray344[local949] + local789[7] * this.anIntArray340[local949] + local789[8] * this.anIntArray343[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray344[local949] = local1057;
								this.anIntArray340[local949] = local1061;
								this.anIntArray343[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray31.length) {
						local228 = this.anIntArrayArray31[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local45]) != 0) {
								this.anIntArray344[local45] -= Static203.anInt3970;
								this.anIntArray340[local45] -= Static203.anInt3969;
								this.anIntArray343[local45] -= Static203.anInt3968;
								this.anIntArray344[local45] = this.anIntArray344[local45] * arg2 >> 7;
								this.anIntArray340[local45] = this.anIntArray340[local45] * arg3 >> 7;
								this.anIntArray343[local45] = this.anIntArray343[local45] * arg4 >> 7;
								this.anIntArray344[local45] += Static203.anInt3970;
								this.anIntArray340[local45] += Static203.anInt3969;
								this.anIntArray343[local45] += Static203.anInt3968;
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
				if (Static203.aBoolean257) {
					local343 = arg7[0] * Static203.anInt3970 + arg7[3] * Static203.anInt3969 + arg7[6] * Static203.anInt3968 + 16384 >> 15;
					local365 = arg7[1] * Static203.anInt3970 + arg7[4] * Static203.anInt3969 + arg7[7] * Static203.anInt3968 + 16384 >> 15;
					local387 = arg7[2] * Static203.anInt3970 + arg7[5] * Static203.anInt3969 + arg7[8] * Static203.anInt3968 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static203.anInt3970 = local343;
					Static203.anInt3969 = local365;
					Static203.anInt3968 = local387;
					Static203.aBoolean257 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static203.anInt3970 + 16384 >> 15;
				local434 = local365 * -Static203.anInt3969 + 16384 >> 15;
				local440 = local387 * -Static203.anInt3968 + 16384 >> 15;
				local446 = local428 + Static203.anInt3970;
				local454 = local434 + Static203.anInt3969;
				local462 = local440 + Static203.anInt3968;
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
					if (local667 < this.anIntArrayArray31.length) {
						local789 = this.anIntArrayArray31[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray344[local796] + local1930[1] * this.anIntArray340[local796] + local1930[2] * this.anIntArray343[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray344[local796] + local1930[4] * this.anIntArray340[local796] + local1930[5] * this.anIntArray343[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray344[local796] + local1930[7] * this.anIntArray340[local796] + local1930[8] * this.anIntArray343[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray344[local796] = local2198;
								this.anIntArray340[local796] = local2202;
								this.anIntArray343[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray46 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray30.length) {
						local228 = this.anIntArrayArray30[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local45]) != 0) {
								local53 = (this.aByteArray46[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray46[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass165_3.aBoolean323 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray30.length) {
					local228 = this.anIntArrayArray30[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local45]) != 0) {
							local53 = this.aShortArray52[local45] & 0xFFFF;
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
							this.aShortArray52[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass165_3.aBoolean323 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "()V")
	public void method3176() {
		if (this.aShortArray53 == null) {
			this.method3164();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3964; local7++) {
			this.anIntArray344[local7] = -this.anIntArray344[local7];
			this.anIntArray343[local7] = -this.anIntArray343[local7];
		}
		for (local7 = 0; local7 < this.anInt3965; local7++) {
			this.aShortArray53[local7] = (short) -this.aShortArray53[local7];
			this.aShortArray51[local7] = (short) -this.aShortArray51[local7];
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "()V")
	@Override
	public void method3164() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			this.anIntArray344[local1] = -this.anIntArray344[local1];
			this.anIntArray343[local1] = -this.anIntArray343[local1];
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(SS)V")
	public void method3177(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3966; local1++) {
			if (this.aShortArray52[local1] == arg0) {
				this.aShortArray52[local1] = arg1;
			}
		}
		this.aClass165_3.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort33;
	}

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "()V")
	public void method3178() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3964; local1++) {
			this.anIntArray343[local1] = -this.anIntArray343[local1];
		}
		if (this.aShortArray51 != null) {
			for (local1 = 0; local1 < this.anInt3965; local1++) {
				this.aShortArray51[local1] = (short) -this.aShortArray51[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt3966; local1++) {
			@Pc(48) short local48 = this.aShortArray54[local1];
			this.aShortArray54[local1] = this.aShortArray57[local1];
			this.aShortArray57[local1] = local48;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
		this.aClass165_5.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3156(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3186(arg0, arg1, arg2, Static203.aClass12_Sub2_Sub2_4, Static203.aClass12_Sub2_Sub2_3);
	}

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "()V")
	public void method3179() {
		if (this.aShortArray53 == null) {
			this.method3140();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3964; local7++) {
			@Pc(16) int local16 = this.anIntArray343[local7];
			this.anIntArray343[local7] = this.anIntArray344[local7];
			this.anIntArray344[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt3965; local7++) {
			@Pc(43) short local43 = this.aShortArray51[local7];
			this.aShortArray51[local7] = this.aShortArray53[local7];
			this.aShortArray53[local7] = (short) -local43;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static203.anInt3970 = 0;
			Static203.anInt3969 = 0;
			Static203.anInt3968 = 0;
			for (local11 = 0; local11 < this.anInt3964; local11++) {
				Static203.anInt3970 += this.anIntArray344[local11];
				Static203.anInt3969 += this.anIntArray340[local11];
				Static203.anInt3968 += this.anIntArray343[local11];
				local3++;
			}
			if (local3 > 0) {
				Static203.anInt3970 = Static203.anInt3970 / local3 + arg1;
				Static203.anInt3969 = Static203.anInt3969 / local3 + arg2;
				Static203.anInt3968 = Static203.anInt3968 / local3 + arg3;
			} else {
				Static203.anInt3970 = arg1;
				Static203.anInt3969 = arg2;
				Static203.anInt3968 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt3964; local3++) {
				this.anIntArray344[local3] += arg1;
				this.anIntArray340[local3] += arg2;
				this.anIntArray343[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt3964; local3++) {
					this.anIntArray344[local3] -= Static203.anInt3970;
					this.anIntArray340[local3] -= Static203.anInt3969;
					this.anIntArray343[local3] -= Static203.anInt3968;
					if (arg3 != 0) {
						local11 = Class131.anIntArray355[arg3];
						local146 = Class131.anIntArray353[arg3];
						local164 = this.anIntArray340[local3] * local11 + this.anIntArray344[local3] * local146 + 32767 >> 16;
						this.anIntArray340[local3] = this.anIntArray340[local3] * local146 + 32767 - this.anIntArray344[local3] * local11 >> 16;
						this.anIntArray344[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class131.anIntArray355[arg1];
						local146 = Class131.anIntArray353[arg1];
						local164 = this.anIntArray340[local3] * local146 + 32767 - this.anIntArray343[local3] * local11 >> 16;
						this.anIntArray343[local3] = this.anIntArray340[local3] * local11 + this.anIntArray343[local3] * local146 + 32767 >> 16;
						this.anIntArray340[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class131.anIntArray355[arg2];
						local146 = Class131.anIntArray353[arg2];
						local164 = this.anIntArray343[local3] * local11 + this.anIntArray344[local3] * local146 + 32767 >> 16;
						this.anIntArray343[local3] = this.anIntArray343[local3] * local146 + 32767 - this.anIntArray344[local3] * local11 >> 16;
						this.anIntArray344[local3] = local164;
					}
					this.anIntArray344[local3] += Static203.anInt3970;
					this.anIntArray340[local3] += Static203.anInt3969;
					this.anIntArray343[local3] += Static203.anInt3968;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt3964; local3++) {
					this.anIntArray344[local3] -= Static203.anInt3970;
					this.anIntArray340[local3] -= Static203.anInt3969;
					this.anIntArray343[local3] -= Static203.anInt3968;
					this.anIntArray344[local3] = this.anIntArray344[local3] * arg1 / 128;
					this.anIntArray340[local3] = this.anIntArray340[local3] * arg2 / 128;
					this.anIntArray343[local3] = this.anIntArray343[local3] * arg3 / 128;
					this.anIntArray344[local3] += Static203.anInt3970;
					this.anIntArray340[local3] += Static203.anInt3969;
					this.anIntArray343[local3] += Static203.anInt3968;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt3966; local3++) {
					local11 = (this.aByteArray46[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray46[local3] = (byte) local11;
				}
				this.aClass165_3.aBoolean323 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt3966; local3++) {
					local11 = this.aShortArray52[local3] & 0xFFFF;
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
					this.aShortArray52[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass165_3.aBoolean323 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!en;IIIZ)V")
	@Override
	public void method3356(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class12_Sub2_Sub2 local2 = (Class12_Sub2_Sub2) arg0;
		if (this.anInt3966 == 0 || local2.anInt3966 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt3967;
		@Pc(15) int[] local15 = local2.anIntArray344;
		@Pc(18) int[] local18 = local2.anIntArray340;
		@Pc(21) int[] local21 = local2.anIntArray343;
		@Pc(24) short[] local24 = local2.aShortArray53;
		@Pc(27) short[] local27 = local2.aShortArray60;
		@Pc(30) short[] local30 = local2.aShortArray51;
		@Pc(33) short[] local33 = local2.aShortArray59;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass118_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass118_1.aShortArray38;
			local44 = this.aClass118_1.aShortArray36;
			local48 = this.aClass118_1.aShortArray35;
			local52 = this.aClass118_1.aShortArray37;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass118_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass118_1.aShortArray38;
			local72 = local2.aClass118_1.aShortArray36;
			local76 = local2.aClass118_1.aShortArray35;
			local80 = local2.aClass118_1.aShortArray37;
		}
		@Pc(92) int[] local92 = local2.anIntArray345;
		@Pc(95) short[] local95 = local2.aShortArray61;
		if (!local2.aClass174_1.aBoolean339) {
			local2.method3193();
		}
		@Pc(105) short local105 = local2.aClass174_1.aShort33;
		@Pc(109) short local109 = local2.aClass174_1.aShort36;
		@Pc(113) short local113 = local2.aClass174_1.aShort38;
		@Pc(117) short local117 = local2.aClass174_1.aShort35;
		@Pc(121) short local121 = local2.aClass174_1.aShort34;
		@Pc(125) short local125 = local2.aClass174_1.aShort39;
		for (@Pc(127) int local127 = 0; local127 < this.anInt3967; local127++) {
			@Pc(138) int local138 = this.anIntArray340[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray344[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray343[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray345[local127];
						@Pc(187) int local187 = this.anIntArray345[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray61[local189] - 1;
							if (local175 == -1 || this.aShortArray59[local175] != 0) {
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
											this.aClass118_1 = new Class118();
											local40 = this.aClass118_1.aShortArray38 = Static38.method623(this.aShortArray53);
											local44 = this.aClass118_1.aShortArray36 = Static38.method623(this.aShortArray60);
											local48 = this.aClass118_1.aShortArray35 = Static38.method623(this.aShortArray51);
											local52 = this.aClass118_1.aShortArray37 = Static38.method623(this.aShortArray59);
										}
										if (local68 == null) {
											@Pc(325) Class118 local325 = local2.aClass118_1 = new Class118();
											local68 = local325.aShortArray38 = Static38.method623(local24);
											local72 = local325.aShortArray36 = Static38.method623(local27);
											local76 = local325.aShortArray35 = Static38.method623(local30);
											local80 = local325.aShortArray37 = Static38.method623(local33);
										}
										@Pc(358) short local358 = this.aShortArray53[local175];
										@Pc(363) short local363 = this.aShortArray60[local175];
										@Pc(368) short local368 = this.aShortArray51[local175];
										@Pc(373) short local373 = this.aShortArray59[local175];
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
										local180 = this.anIntArray345[local127];
										local187 = this.anIntArray345[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray61[local385] - 1;
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

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public void method3182() {
		if (this.aShortArray53 == null) {
			this.method3144(256);
			return;
		}
		@Pc(10) int local10 = Class131.anIntArray355[256];
		@Pc(14) int local14 = Class131.anIntArray353[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt3964; local16++) {
			local36 = this.anIntArray343[local16] * local10 + this.anIntArray344[local16] * local14 >> 16;
			this.anIntArray343[local16] = this.anIntArray343[local16] * local14 - this.anIntArray344[local16] * local10 >> 16;
			this.anIntArray344[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt3965; local16++) {
			local36 = this.aShortArray51[local16] * local10 + this.aShortArray53[local16] * local14 >> 16;
			this.aShortArray51[local16] = (short) (this.aShortArray51[local16] * local14 - this.aShortArray53[local16] * local10 >> 16);
			this.aShortArray53[local16] = (short) local36;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "()V")
	private void method3184() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (this.anInt3966 == 0) {
			return;
		}
		if (this.aByte16 != 0) {
			this.method3199(true, !this.aClass165_1.aBoolean323 && (this.aByte16 & 0x1) != 0, !this.aClass165_3.aBoolean323 && (this.aByte16 & 0x2) != 0, this.aClass165_2 != null && !this.aClass165_2.aBoolean323 && (this.aByte16 & 0x4) != 0, false);
		}
		this.method3199(false, !this.aClass165_1.aBoolean323, !this.aClass165_3.aBoolean323, this.aClass165_2 != null && !this.aClass165_2.aBoolean323, !this.aClass165_4.aBoolean323);
		if (!this.aClass165_5.aBoolean323) {
			this.method3190();
		}
		if (this.aByte15 != 0) {
			if ((this.aByte15 & 0x1) != 0) {
				this.anIntArray344 = null;
				this.anIntArray340 = null;
				this.anIntArray343 = null;
				this.aShortArray61 = null;
				this.anIntArray345 = null;
			}
			if ((this.aByte15 & 0x2) != 0) {
				this.aShortArray52 = null;
				this.aByteArray46 = null;
			}
			if ((this.aByte15 & 0x4) != 0) {
				this.aShortArray53 = null;
				this.aShortArray60 = null;
				this.aShortArray51 = null;
				this.aShortArray59 = null;
			}
			if ((this.aByte15 & 0x8) != 0) {
				this.aFloatArray24 = null;
				this.aFloatArray23 = null;
			}
			if ((this.aByte15 & 0x10) != 0) {
				this.aShortArray54 = null;
				this.aShortArray58 = null;
				this.aShortArray57 = null;
			}
			this.aByte15 = 0;
		}
		@Pc(172) Class62 local172 = null;
		if (this.aClass165_1.aClass62_3 != null) {
			this.aClass165_1.aClass62_3.method1659();
			local172 = this.aClass165_1.aClass62_3;
			local1.glVertexPointer(3, 5126, this.aClass165_1.anInt4954, (long) this.aClass165_1.anInt4960);
		}
		if (this.aClass165_3.aClass62_3 != null) {
			if (local172 != this.aClass165_3.aClass62_3) {
				this.aClass165_3.aClass62_3.method1659();
				local172 = this.aClass165_3.aClass62_3;
			}
			local1.glColorPointer(4, 5121, this.aClass165_3.anInt4954, (long) this.aClass165_3.anInt4960);
		}
		if (Static298.aBoolean357 && this.aClass165_2.aClass62_3 != null) {
			if (local172 != this.aClass165_2.aClass62_3) {
				this.aClass165_2.aClass62_3.method1659();
				local172 = this.aClass165_2.aClass62_3;
			}
			local1.glNormalPointer(5126, this.aClass165_2.anInt4954, (long) this.aClass165_2.anInt4960);
		}
		if (this.aClass165_4.aClass62_3 != null) {
			if (local172 != this.aClass165_4.aClass62_3) {
				this.aClass165_4.aClass62_3.method1659();
				local172 = this.aClass165_4.aClass62_3;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass165_4.anInt4954, (long) this.aClass165_4.anInt4960);
		}
		if (this.aClass165_5.aClass62_3 != null) {
			this.aClass165_5.aClass62_3.method1658();
		}
		if (this.aClass165_1.aClass62_3 == null || this.aClass165_3.aClass62_3 == null || Static298.aBoolean357 && this.aClass165_2.aClass62_3 == null || this.aClass165_4.aClass62_3 == null) {
			if (Static178.aBoolean225) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass165_1.aClass62_3 == null) {
				this.aClass165_1.aByteBuffer10.position(this.aClass165_1.anInt4960);
				local1.glVertexPointer(3, 5126, this.aClass165_1.anInt4954, this.aClass165_1.aByteBuffer10);
			}
			if (this.aClass165_3.aClass62_3 == null) {
				this.aClass165_3.aByteBuffer10.position(this.aClass165_3.anInt4960);
				local1.glColorPointer(4, 5121, this.aClass165_3.anInt4954, this.aClass165_3.aByteBuffer10);
			}
			if (Static298.aBoolean357 && this.aClass165_2.aClass62_3 == null) {
				this.aClass165_2.aByteBuffer10.position(this.aClass165_2.anInt4960);
				local1.glNormalPointer(5126, this.aClass165_2.anInt4954, this.aClass165_2.aByteBuffer10);
			}
			if (this.aClass165_4.aClass62_3 == null) {
				this.aClass165_4.aByteBuffer10.position(this.aClass165_4.anInt4960);
				local1.glTexCoordPointer(2, 5126, this.aClass165_4.anInt4954, this.aClass165_4.aByteBuffer10);
			}
		}
		if (this.aClass165_5.aClass62_3 == null && Static178.aBoolean225) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray341.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray341[local419];
			@Pc(434) int local434 = this.anIntArray341[local419 + 1];
			@Pc(439) short local439 = this.aShortArray55[local427];
			if (local439 == -1) {
				Static178.method2763(-1);
				Static32.method479(0, 0);
			} else {
				Static204.anInterface2_1.method1973(local439 & 0xFFFF);
			}
			if (this.aClass165_5.aClass62_3 == null) {
				this.aClass165_5.aByteBuffer10.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass165_5.aByteBuffer10);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public void method3185(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		if (this.aClass165_2 != null) {
			this.aClass165_2.aBoolean323 = false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZ)Lclient!uc;")
	@Override
	public Class12_Sub2 method3154(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3186(arg0, arg1, arg2, Static203.aClass12_Sub2_Sub2_2, Static203.aClass12_Sub2_Sub2_1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZLclient!pe;Lclient!pe;)Lclient!uc;")
	private Class12_Sub2 method3186(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12_Sub2_Sub2 arg3, @OriginalArg(4) Class12_Sub2_Sub2 arg4) {
		arg3.anInt3964 = this.anInt3964;
		arg3.anInt3967 = this.anInt3967;
		arg3.anInt3965 = this.anInt3965;
		arg3.anInt3966 = this.anInt3966;
		arg3.aShort20 = this.aShort20;
		arg3.aShort19 = this.aShort19;
		arg3.aByte16 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray344 == null || arg3.anIntArray344.length < this.anInt3964) {
			arg3.anIntArray344 = new int[this.anInt3964 + 100];
			arg3.anIntArray340 = new int[this.anInt3964 + 100];
			arg3.anIntArray343 = new int[this.anInt3964 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt3964; local73++) {
			arg3.anIntArray344[local73] = this.anIntArray344[local73];
			arg3.anIntArray340[local73] = this.anIntArray340[local73];
			arg3.anIntArray343[local73] = this.anIntArray343[local73];
		}
		if (arg3.aClass165_1 == null) {
			arg3.aClass165_1 = new Class165();
		}
		arg3.aClass165_1.aBoolean323 = false;
		if (arg3.aClass174_1 == null) {
			arg3.aClass174_1 = new Class174();
		}
		arg3.aClass174_1.aBoolean339 = false;
		if (arg0) {
			arg3.aByteArray46 = this.aByteArray46;
		} else {
			if (arg4.aByteArray46 == null || arg4.aByteArray46.length < this.anInt3966) {
				arg4.aByteArray46 = new byte[this.anInt3966 + 100];
			}
			arg3.aByteArray46 = arg4.aByteArray46;
			for (local73 = 0; local73 < this.anInt3966; local73++) {
				arg3.aByteArray46[local73] = this.aByteArray46[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray52 = this.aShortArray52;
		} else {
			if (arg4.aShortArray52 == null || arg4.aShortArray52.length < this.anInt3966) {
				arg4.aShortArray52 = new short[this.anInt3966 + 100];
			}
			arg3.aShortArray52 = arg4.aShortArray52;
			for (local73 = 0; local73 < this.anInt3966; local73++) {
				arg3.aShortArray52[local73] = this.aShortArray52[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass165_3 = this.aClass165_3;
		} else {
			if (arg4.aClass165_3 == null) {
				arg4.aClass165_3 = new Class165();
			}
			arg3.aClass165_3 = arg4.aClass165_3;
			arg3.aClass165_3.aBoolean323 = false;
		}
		if (arg2 || this.aShortArray53 == null) {
			arg3.aShortArray53 = this.aShortArray53;
			arg3.aShortArray60 = this.aShortArray60;
			arg3.aShortArray51 = this.aShortArray51;
			arg3.aShortArray59 = this.aShortArray59;
			arg3.aClass165_2 = this.aClass165_2;
		} else {
			if (arg4.aShortArray53 == null || arg4.aShortArray53.length < this.anInt3965) {
				arg4.aShortArray53 = new short[this.anInt3965 + 100];
				arg4.aShortArray60 = new short[this.anInt3965 + 100];
				arg4.aShortArray51 = new short[this.anInt3965 + 100];
				arg4.aShortArray59 = new short[this.anInt3965 + 100];
			}
			arg3.aShortArray53 = arg4.aShortArray53;
			arg3.aShortArray60 = arg4.aShortArray60;
			arg3.aShortArray51 = arg4.aShortArray51;
			arg3.aShortArray59 = arg4.aShortArray59;
			for (local73 = 0; local73 < this.anInt3965; local73++) {
				arg3.aShortArray53[local73] = this.aShortArray53[local73];
				arg3.aShortArray60[local73] = this.aShortArray60[local73];
				arg3.aShortArray51[local73] = this.aShortArray51[local73];
				arg3.aShortArray59[local73] = this.aShortArray59[local73];
			}
			if (Static298.aBoolean357) {
				if (arg4.aClass165_2 == null) {
					arg4.aClass165_2 = new Class165();
				}
				arg3.aClass165_2 = arg4.aClass165_2;
				arg3.aClass165_2.aBoolean323 = false;
			} else {
				arg3.aClass165_2 = null;
			}
		}
		arg3.aFloatArray24 = this.aFloatArray24;
		arg3.aFloatArray23 = this.aFloatArray23;
		arg3.anIntArray342 = this.anIntArray342;
		arg3.anIntArrayArray31 = this.anIntArrayArray31;
		arg3.aShortArray54 = this.aShortArray54;
		arg3.aShortArray58 = this.aShortArray58;
		arg3.aShortArray57 = this.aShortArray57;
		arg3.aShortArray55 = this.aShortArray55;
		arg3.aByteArray47 = this.aByteArray47;
		arg3.anIntArrayArray30 = this.anIntArrayArray30;
		arg3.aClass165_4 = this.aClass165_4;
		arg3.aClass165_5 = this.aClass165_5;
		arg3.anIntArray341 = this.anIntArray341;
		arg3.aShortArray61 = this.aShortArray61;
		arg3.anIntArray345 = this.anIntArray345;
		arg3.aBoolean255 = this.aBoolean255;
		arg3.aShortArray62 = this.aShortArray62;
		arg3.aShortArray56 = this.aShortArray56;
		return arg3;
	}

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "()I")
	@Override
	public int method3147() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort34;
	}

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "()I")
	public int method3187() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!tb;)Lclient!tb;")
	public Class59_Sub2 method3188(@OriginalArg(0) Class59_Sub2 arg0) {
		if (this.anInt3965 == 0) {
			return null;
		}
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static291.anInt5431 > 0) {
			local26 = this.aClass174_1.aShort38 - (this.aClass174_1.aShort36 * Static291.anInt5431 >> 8) >> 3;
			local40 = this.aClass174_1.aShort35 - (this.aClass174_1.aShort33 * Static291.anInt5431 >> 8) >> 3;
		} else {
			local26 = this.aClass174_1.aShort38 - (this.aClass174_1.aShort33 * Static291.anInt5431 >> 8) >> 3;
			local40 = this.aClass174_1.aShort35 - (this.aClass174_1.aShort36 * Static291.anInt5431 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static291.anInt5433 > 0) {
			local85 = this.aClass174_1.aShort34 - (this.aClass174_1.aShort36 * Static291.anInt5433 >> 8) >> 3;
			local99 = this.aClass174_1.aShort39 - (this.aClass174_1.aShort33 * Static291.anInt5433 >> 8) >> 3;
		} else {
			local85 = this.aClass174_1.aShort34 - (this.aClass174_1.aShort33 * Static291.anInt5433 >> 8) >> 3;
			local99 = this.aClass174_1.aShort39 - (this.aClass174_1.aShort36 * Static291.anInt5433 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class59_Sub2 local151;
		if (arg0 == null || arg0.aByteArray65.length < local134 * local140) {
			local151 = new Class59_Sub2(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt4747 = arg0.anInt4748 = local134;
			arg0.anInt4749 = arg0.anInt4753 = local140;
			arg0.method3798();
		}
		local151.anInt4752 = local26;
		local151.anInt4755 = local85;
		if (Static203.anIntArray346.length < this.anInt3965) {
			Static203.anIntArray346 = new int[this.anInt3965];
			Static203.anIntArray347 = new int[this.anInt3965];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt3967; local194++) {
			@Pc(216) int local216 = (this.anIntArray344[local194] - (this.anIntArray340[local194] * Static291.anInt5431 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray343[local194] - (this.anIntArray340[local194] * Static291.anInt5433 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray345[local194];
			local246 = this.anIntArray345[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray61[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static203.anIntArray346[local258] = local216;
				Static203.anIntArray347[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt3966; local194++) {
			if (this.aByteArray46[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray54[local194];
				@Pc(297) short local297 = this.aShortArray58[local194];
				@Pc(302) short local302 = this.aShortArray57[local194];
				local246 = Static203.anIntArray346[local292];
				local248 = Static203.anIntArray346[local297];
				local258 = Static203.anIntArray346[local302];
				@Pc(318) int local318 = Static203.anIntArray347[local292];
				@Pc(322) int local322 = Static203.anIntArray347[local297];
				@Pc(326) int local326 = Static203.anIntArray347[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static204.method3228(local151.aByteArray65, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "()I")
	@Override
	public int method3146() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort35;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!pe;[[I[[IIII)V")
	public void method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub2_Sub2 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass174_1.aBoolean339) {
			arg2.method3193();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass174_1.aShort38;
		@Pc(17) int local17 = arg5 + arg2.aClass174_1.aShort35;
		@Pc(23) int local23 = arg7 + arg2.aClass174_1.aShort34;
		@Pc(29) int local29 = arg7 + arg2.aClass174_1.aShort39;
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
			for (local150 = 0; local150 < this.anInt3967; local150++) {
				local161 = this.anIntArray344[local150] + arg5;
				local168 = this.anIntArray343[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray340[local150] = this.anIntArray340[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass174_1.aShort33;
				for (local161 = 0; local161 < this.anInt3967; local161++) {
					local168 = (this.anIntArray340[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray344[local161] + arg5;
						local176 = this.anIntArray343[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray340[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method3168(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass174_1.aShort36 - arg2.aClass174_1.aShort33;
				for (local161 = 0; local161 < this.anInt3967; local161++) {
					local168 = this.anIntArray344[local161] + arg5;
					local172 = this.anIntArray343[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray340[local161] = this.anIntArray340[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass174_1.aShort36 - arg2.aClass174_1.aShort33;
				for (local161 = 0; local161 < this.anInt3967; local161++) {
					local168 = this.anIntArray344[local161] + arg5;
					local172 = this.anIntArray343[local161] + arg7;
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
					this.anIntArray340[local161] = ((this.anIntArray340[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass165_1.aBoolean323 = false;
		this.aClass174_1.aBoolean339 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			Static203.anInt3970 = 0;
			Static203.anInt3969 = 0;
			Static203.anInt3968 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray31.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray31[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static203.anInt3970 += this.anIntArray344[local53];
						Static203.anInt3969 += this.anIntArray340[local53];
						Static203.anInt3968 += this.anIntArray343[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static203.anInt3970 = Static203.anInt3970 / local18 + local8;
				Static203.anInt3969 = Static203.anInt3969 / local18 + local12;
				Static203.anInt3968 = Static203.anInt3968 / local18 + local16;
			} else {
				Static203.anInt3970 = local8;
				Static203.anInt3969 = local12;
				Static203.anInt3968 = local16;
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
				if (local26 < this.anIntArrayArray31.length) {
					local141 = this.anIntArrayArray31[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray344[local45] += local8;
						this.anIntArray340[local45] += local12;
						this.anIntArray343[local45] += local16;
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
				if (local26 < this.anIntArrayArray31.length) {
					local141 = this.anIntArrayArray31[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray344[local45] -= Static203.anInt3970;
						this.anIntArray340[local45] -= Static203.anInt3969;
						this.anIntArray343[local45] -= Static203.anInt3968;
						if (arg4 != 0) {
							local53 = Class131.anIntArray355[arg4];
							local246 = Class131.anIntArray353[arg4];
							local264 = this.anIntArray340[local45] * local53 + this.anIntArray344[local45] * local246 + 32767 >> 16;
							this.anIntArray340[local45] = this.anIntArray340[local45] * local246 + 32767 - this.anIntArray344[local45] * local53 >> 16;
							this.anIntArray344[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class131.anIntArray355[arg2];
							local246 = Class131.anIntArray353[arg2];
							local264 = this.anIntArray340[local45] * local246 + 32767 - this.anIntArray343[local45] * local53 >> 16;
							this.anIntArray343[local45] = this.anIntArray340[local45] * local53 + this.anIntArray343[local45] * local246 + 32767 >> 16;
							this.anIntArray340[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class131.anIntArray355[arg3];
							local246 = Class131.anIntArray353[arg3];
							local264 = this.anIntArray343[local45] * local53 + this.anIntArray344[local45] * local246 + 32767 >> 16;
							this.anIntArray343[local45] = this.anIntArray343[local45] * local246 + 32767 - this.anIntArray344[local45] * local53 >> 16;
							this.anIntArray344[local45] = local264;
						}
						this.anIntArray344[local45] += Static203.anInt3970;
						this.anIntArray340[local45] += Static203.anInt3969;
						this.anIntArray343[local45] += Static203.anInt3968;
					}
				}
			}
			if (arg5 && this.aShortArray53 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray31.length) {
						local141 = this.anIntArrayArray31[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray345[local45];
							local246 = this.anIntArray345[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray61[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class131.anIntArray355[arg4];
									local498 = Class131.anIntArray353[arg4];
									local516 = this.aShortArray60[local484] * local494 + this.aShortArray53[local484] * local498 + 32767 >> 16;
									this.aShortArray60[local484] = (short) (this.aShortArray60[local484] * local498 + 32767 - this.aShortArray53[local484] * local494 >> 16);
									this.aShortArray53[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class131.anIntArray355[arg2];
									local498 = Class131.anIntArray353[arg2];
									local516 = this.aShortArray60[local484] * local498 + 32767 - this.aShortArray51[local484] * local494 >> 16;
									this.aShortArray51[local484] = (short) (this.aShortArray60[local484] * local494 + this.aShortArray51[local484] * local498 + 32767 >> 16);
									this.aShortArray60[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class131.anIntArray355[arg3];
									local498 = Class131.anIntArray353[arg3];
									local516 = this.aShortArray51[local484] * local494 + this.aShortArray53[local484] * local498 + 32767 >> 16;
									this.aShortArray51[local484] = (short) (this.aShortArray51[local484] * local498 + 32767 - this.aShortArray53[local484] * local494 >> 16);
									this.aShortArray53[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass165_2 != null) {
					this.aClass165_2.aBoolean323 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray31.length) {
					local141 = this.anIntArrayArray31[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray344[local45] -= Static203.anInt3970;
						this.anIntArray340[local45] -= Static203.anInt3969;
						this.anIntArray343[local45] -= Static203.anInt3968;
						this.anIntArray344[local45] = this.anIntArray344[local45] * arg2 >> 7;
						this.anIntArray340[local45] = this.anIntArray340[local45] * arg3 >> 7;
						this.anIntArray343[local45] = this.anIntArray343[local45] * arg4 >> 7;
						this.anIntArray344[local45] += Static203.anInt3970;
						this.anIntArray340[local45] += Static203.anInt3969;
						this.anIntArray343[local45] += Static203.anInt3968;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray30 != null && this.aByteArray46 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray30.length) {
						local141 = this.anIntArrayArray30[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray46[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray46[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass165_3.aBoolean323 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray30 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray30.length) {
					local141 = this.anIntArrayArray30[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray52[local45] & 0xFFFF;
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
						this.aShortArray52[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass165_3.aBoolean323 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "()V")
	private void method3190() {
		if (Static203.aClass4_Sub17_7.aByteArray30.length < this.anInt3966 * 12) {
			Static203.aClass4_Sub17_7 = new Class4_Sub17((this.anInt3966 + 100) * 12);
		} else {
			Static203.aClass4_Sub17_7.anInt2400 = 0;
		}
		@Pc(25) int local25;
		if (Static178.aBoolean232) {
			for (local25 = 0; local25 < this.anInt3966; local25++) {
				Static203.aClass4_Sub17_7.method1854(this.aShortArray54[local25]);
				Static203.aClass4_Sub17_7.method1854(this.aShortArray58[local25]);
				Static203.aClass4_Sub17_7.method1854(this.aShortArray57[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt3966; local25++) {
				Static203.aClass4_Sub17_7.method1848(this.aShortArray54[local25]);
				Static203.aClass4_Sub17_7.method1848(this.aShortArray58[local25]);
				Static203.aClass4_Sub17_7.method1848(this.aShortArray57[local25]);
			}
		}
		if (!Static178.aBoolean225) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static203.aClass4_Sub17_7.anInt2400);
			local115.put(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
			local115.flip();
			this.aClass165_5.aBoolean323 = true;
			this.aClass165_5.aByteBuffer10 = local115;
			this.aClass165_5.aClass62_3 = null;
			return;
		}
		@Pc(88) Class62 local88 = new Class62();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
		local88.method1655(local95);
		this.aClass165_5.aBoolean323 = true;
		this.aClass165_5.aByteBuffer10 = null;
		this.aClass165_5.aClass62_3 = local88;
	}

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "()V")
	private void method3193() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3967; local17++) {
			@Pc(26) int local26 = this.anIntArray344[local17];
			@Pc(31) int local31 = this.anIntArray340[local17];
			@Pc(36) int local36 = this.anIntArray343[local17];
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
		this.aClass174_1.aShort38 = (short) local1;
		this.aClass174_1.aShort35 = (short) local7;
		this.aClass174_1.aShort33 = (short) local3;
		this.aClass174_1.aShort36 = (short) local9;
		this.aClass174_1.aShort34 = (short) local5;
		this.aClass174_1.aShort39 = (short) local11;
		this.aClass174_1.aShort37 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass174_1.aBoolean339 = true;
	}

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "()I")
	@Override
	public int method3148() {
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		return this.aClass174_1.aShort38;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!pe;")
	public Class12_Sub2_Sub2 method3194(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class12_Sub2_Sub2 local3 = new Class12_Sub2_Sub2();
		local3.anInt3964 = this.anInt3964;
		local3.anInt3967 = this.anInt3967;
		local3.anInt3965 = this.anInt3965;
		local3.anInt3966 = this.anInt3966;
		if (arg0) {
			local3.anIntArray344 = this.anIntArray344;
			local3.anIntArray343 = this.anIntArray343;
		} else {
			local3.anIntArray344 = Static10.method176(this.anIntArray344);
			local3.anIntArray343 = Static10.method176(this.anIntArray343);
		}
		if (arg1) {
			local3.anIntArray340 = this.anIntArray340;
		} else {
			local3.anIntArray340 = Static10.method176(this.anIntArray340);
		}
		if (arg0 && arg1) {
			local3.aClass165_1 = this.aClass165_1;
			local3.aClass174_1 = this.aClass174_1;
		} else {
			local3.aClass165_1 = new Class165();
			local3.aClass174_1 = new Class174();
		}
		if (arg2) {
			local3.aShortArray52 = this.aShortArray52;
		} else {
			local3.aShortArray52 = Static38.method623(this.aShortArray52);
		}
		local3.aByteArray46 = this.aByteArray46;
		if (arg2 && arg3 && (arg6 && arg4 || Static298.aBoolean357)) {
			local3.aClass165_3 = this.aClass165_3;
		} else {
			local3.aClass165_3 = new Class165();
		}
		if (arg4) {
			local3.aShortArray53 = this.aShortArray53;
			local3.aShortArray60 = this.aShortArray60;
			local3.aShortArray51 = this.aShortArray51;
			local3.aShortArray59 = this.aShortArray59;
		} else {
			local3.aShortArray53 = Static38.method623(this.aShortArray53);
			local3.aShortArray60 = Static38.method623(this.aShortArray60);
			local3.aShortArray51 = Static38.method623(this.aShortArray51);
			local3.aShortArray59 = Static38.method623(this.aShortArray59);
		}
		if (!Static298.aBoolean357) {
			local3.aClass165_2 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass165_2 = this.aClass165_2;
		} else {
			local3.aClass165_2 = new Class165();
		}
		local3.aFloatArray24 = this.aFloatArray24;
		local3.aFloatArray23 = this.aFloatArray23;
		local3.aClass165_4 = this.aClass165_4;
		if (arg7) {
			local3.aShortArray54 = this.aShortArray54;
			local3.aShortArray58 = this.aShortArray58;
			local3.aShortArray57 = this.aShortArray57;
			local3.aClass165_5 = this.aClass165_5;
		} else {
			local3.aShortArray54 = Static38.method623(this.aShortArray54);
			local3.aShortArray58 = Static38.method623(this.aShortArray58);
			local3.aShortArray57 = Static38.method623(this.aShortArray57);
			local3.aClass165_5 = new Class165();
		}
		if (arg8) {
			local3.aShortArray55 = this.aShortArray55;
		} else {
			local3.aShortArray55 = Static38.method623(this.aShortArray55);
		}
		local3.anIntArray342 = this.anIntArray342;
		local3.anIntArrayArray31 = this.anIntArrayArray31;
		local3.aByteArray47 = this.aByteArray47;
		local3.anIntArrayArray30 = this.anIntArrayArray30;
		local3.anIntArray341 = this.anIntArray341;
		local3.aShortArray61 = this.aShortArray61;
		local3.anIntArray345 = this.anIntArray345;
		local3.aShort20 = this.aShort20;
		local3.aShort19 = this.aShort19;
		local3.aShortArray62 = this.aShortArray62;
		local3.aShortArray56 = this.aShortArray56;
		return local3;
	}

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "()I")
	public int method3195() {
		return this.aShort20;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method3197(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte16 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt3965 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass165_3.aBoolean323 && (arg1 || arg2 && !Static298.aBoolean357);
				this.method3199(false, !this.aClass165_1.aBoolean323 && arg0, local26, this.aClass165_2 != null && !this.aClass165_2.aBoolean323 && arg2, !this.aClass165_4.aBoolean323);
				if (!this.aClass165_5.aBoolean323 && arg3 && arg1) {
					this.method3190();
				}
			}
			if (arg0) {
				if (this.aClass165_1.aBoolean323) {
					if (!this.aClass174_1.aBoolean339) {
						this.method3193();
					}
					this.anIntArray344 = null;
					this.anIntArray340 = null;
					this.anIntArray343 = null;
					this.aShortArray61 = null;
					this.anIntArray345 = null;
				} else {
					this.aByte15 = (byte) (this.aByte15 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass165_3.aBoolean323) {
					this.aShortArray52 = null;
					this.aByteArray46 = null;
				} else {
					this.aByte15 = (byte) (this.aByte15 | 0x2);
				}
			}
			if (arg2 && Static298.aBoolean357) {
				if (this.aClass165_2.aBoolean323) {
					this.aShortArray53 = null;
					this.aShortArray60 = null;
					this.aShortArray51 = null;
					this.aShortArray59 = null;
				} else {
					this.aByte15 = (byte) (this.aByte15 | 0x4);
				}
			}
			if (this.aClass165_4.aBoolean323) {
				this.aFloatArray24 = null;
				this.aFloatArray23 = null;
			} else {
				this.aByte15 = (byte) (this.aByte15 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass165_5.aBoolean323 && this.aClass165_3.aBoolean323) {
					this.aShortArray54 = null;
					this.aShortArray58 = null;
					this.aShortArray57 = null;
				} else {
					this.aByte15 = (byte) (this.aByte15 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray342 = null;
				this.aByteArray47 = null;
				this.anIntArrayArray31 = null;
				this.anIntArrayArray30 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	@Override
	public void method3162(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class131.anIntArray355[arg0];
		@Pc(7) int local7 = Class131.anIntArray353[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3964; local9++) {
			@Pc(29) int local29 = this.anIntArray340[local9] * local3 + this.anIntArray344[local9] * local7 >> 16;
			this.anIntArray340[local9] = this.anIntArray340[local9] * local7 - this.anIntArray344[local9] * local3 >> 16;
			this.anIntArray344[local9] = local29;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZ)V")
	private void method3199(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass165_1.anInt4960 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass165_3.anInt4960 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass165_2.anInt4960 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass165_4.anInt4960 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static203.aClass4_Sub17_7.aByteArray30.length < this.anInt3965 * local1) {
			Static203.aClass4_Sub17_7 = new Class4_Sub17((this.anInt3965 + 100) * local1);
		} else {
			Static203.aClass4_Sub17_7.anInt2400 = 0;
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
			if (Static178.aBoolean232) {
				for (local60 = 0; local60 < this.anInt3967; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray344[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray340[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray343[local60]);
					local90 = this.anIntArray345[local60];
					local97 = this.anIntArray345[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray61[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static203.aClass4_Sub17_7.anInt2400 = local109 * local1;
						Static203.aClass4_Sub17_7.method1854(local71);
						Static203.aClass4_Sub17_7.method1854(local78);
						Static203.aClass4_Sub17_7.method1854(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt3967; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray344[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray340[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray343[local60]);
					local90 = this.anIntArray345[local60];
					local97 = this.anIntArray345[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray61[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static203.aClass4_Sub17_7.anInt2400 = local109 * local1;
						Static203.aClass4_Sub17_7.method1848(local71);
						Static203.aClass4_Sub17_7.method1848(local78);
						Static203.aClass4_Sub17_7.method1848(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static298.aBoolean357) {
				for (local60 = 0; local60 < this.anInt3966; local60++) {
					local71 = Static203.method3180(this.aShortArray52[local60], this.aShortArray55[local60], this.aShort20, this.aByteArray46[local60]);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + this.aShortArray54[local60] * local1;
					Static203.aClass4_Sub17_7.method1854(local71);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + this.aShortArray58[local60] * local1;
					Static203.aClass4_Sub17_7.method1854(local71);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + this.aShortArray57[local60] * local1;
					Static203.aClass4_Sub17_7.method1854(local71);
				}
			} else {
				local60 = (int) Static291.aFloatArray31[0];
				local71 = (int) Static291.aFloatArray31[1];
				local78 = (int) Static291.aFloatArray31[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort20 * 1.3F);
				local97 = this.aShort19 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt3966; local99++) {
					@Pc(270) short local270 = this.aShortArray54[local99];
					@Pc(275) short local275 = this.aShortArray59[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray53[local270] + local71 * this.aShortArray60[local270] + local78 * this.aShortArray51[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray53[local270] + local71 * this.aShortArray60[local270] + local78 * this.aShortArray51[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray59[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray58[local99];
					@Pc(369) short local369 = this.aShortArray59[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray53[local364] + local71 * this.aShortArray60[local364] + local78 * this.aShortArray51[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray53[local364] + local71 * this.aShortArray60[local364] + local78 * this.aShortArray51[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray59[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray57[local99];
					@Pc(463) short local463 = this.aShortArray59[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray53[local458] + local71 * this.aShortArray60[local458] + local78 * this.aShortArray51[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray53[local458] + local71 * this.aShortArray60[local458] + local78 * this.aShortArray51[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray59[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static203.method3180(this.aShortArray52[local99], this.aShortArray55[local99], local281, this.aByteArray46[local99]);
					@Pc(577) int local577 = Static203.method3180(this.aShortArray52[local99], this.aShortArray55[local99], local375, this.aByteArray46[local99]);
					@Pc(592) int local592 = Static203.method3180(this.aShortArray52[local99], this.aShortArray55[local99], local469, this.aByteArray46[local99]);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + local270 * local1;
					Static203.aClass4_Sub17_7.method1854(local562);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + local364 * local1;
					Static203.aClass4_Sub17_7.method1854(local577);
					Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_3.anInt4960 + local458 * local1;
					Static203.aClass4_Sub17_7.method1854(local592);
				}
				this.aShortArray53 = null;
				this.aShortArray60 = null;
				this.aShortArray51 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort19;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort19 + this.aShort19 / 2);
			Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_2.anInt4960;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static178.aBoolean232) {
				for (local78 = 0; local78 < this.anInt3965; local78++) {
					local752 = this.aShortArray59[local78];
					if (local752 == 0) {
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray53[local78] * local734);
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray60[local78] * local734);
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray51[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray53[local78] * local790);
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray60[local78] * local790);
						Static203.aClass4_Sub17_7.method1886((float) this.aShortArray51[local78] * local790);
					}
					Static203.aClass4_Sub17_7.anInt2400 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt3965; local78++) {
					local752 = this.aShortArray59[local78];
					if (local752 == 0) {
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray53[local78] * local734);
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray60[local78] * local734);
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray51[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray53[local78] * local790);
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray60[local78] * local790);
						Static203.aClass4_Sub17_7.method1895((float) this.aShortArray51[local78] * local790);
					}
					Static203.aClass4_Sub17_7.anInt2400 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static203.aClass4_Sub17_7.anInt2400 = this.aClass165_4.anInt4960;
			if (Static178.aBoolean232) {
				for (local60 = 0; local60 < this.anInt3965; local60++) {
					Static203.aClass4_Sub17_7.method1886(this.aFloatArray24[local60]);
					Static203.aClass4_Sub17_7.method1886(this.aFloatArray23[local60]);
					Static203.aClass4_Sub17_7.anInt2400 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt3965; local60++) {
					Static203.aClass4_Sub17_7.method1895(this.aFloatArray24[local60]);
					Static203.aClass4_Sub17_7.method1895(this.aFloatArray23[local60]);
					Static203.aClass4_Sub17_7.anInt2400 += local1 - 8;
				}
			}
		}
		Static203.aClass4_Sub17_7.anInt2400 = local1 * this.anInt3965;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static178.aBoolean231) {
				local1007 = ByteBuffer.wrap(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
				if (this.aClass62_2 == null) {
					this.aClass62_2 = new Class62(true);
					this.aClass62_2.method1655(local1007);
				} else {
					this.aClass62_2.method1657(local1007);
				}
				if (arg1) {
					this.aClass165_1.aBoolean323 = true;
					this.aClass165_1.aByteBuffer10 = null;
					this.aClass165_1.aClass62_3 = this.aClass62_2;
					this.aClass165_1.anInt4954 = local1;
				}
				if (arg2) {
					this.aClass165_3.aBoolean323 = true;
					this.aClass165_3.aByteBuffer10 = null;
					this.aClass165_3.aClass62_3 = this.aClass62_2;
					this.aClass165_3.anInt4954 = local1;
				}
				if (arg3) {
					this.aClass165_2.aBoolean323 = true;
					this.aClass165_2.aByteBuffer10 = null;
					this.aClass165_2.aClass62_3 = this.aClass62_2;
					this.aClass165_2.anInt4954 = local1;
				}
				if (arg4) {
					this.aClass165_4.aBoolean323 = true;
					this.aClass165_4.aByteBuffer10 = null;
					this.aClass165_4.aClass62_3 = this.aClass62_2;
					this.aClass165_4.anInt4954 = local1;
				}
			} else {
				if (Static203.aByteBuffer9 == null || Static203.aByteBuffer9.capacity() < Static203.aClass4_Sub17_7.anInt2400) {
					Static203.aByteBuffer9 = ByteBuffer.allocateDirect(Static203.aClass4_Sub17_7.anInt2400 + local1 * 100);
				} else {
					Static203.aByteBuffer9.clear();
				}
				Static203.aByteBuffer9.put(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
				Static203.aByteBuffer9.flip();
				if (arg1) {
					this.aClass165_1.aBoolean323 = true;
					this.aClass165_1.aByteBuffer10 = Static203.aByteBuffer9;
					this.aClass165_1.aClass62_3 = null;
					this.aClass165_1.anInt4954 = local1;
				}
				if (arg2) {
					this.aClass165_3.aBoolean323 = true;
					this.aClass165_3.aByteBuffer10 = Static203.aByteBuffer9;
					this.aClass165_1.aClass62_3 = null;
					this.aClass165_3.anInt4954 = local1;
				}
				if (arg3) {
					this.aClass165_2.aBoolean323 = true;
					this.aClass165_2.aByteBuffer10 = Static203.aByteBuffer9;
					this.aClass165_2.aClass62_3 = null;
					this.aClass165_2.anInt4954 = local1;
				}
				if (arg4) {
					this.aClass165_4.aBoolean323 = true;
					this.aClass165_4.aByteBuffer10 = Static203.aByteBuffer9;
					this.aClass165_4.aClass62_3 = null;
					this.aClass165_4.anInt4954 = local1;
				}
			}
		} else if (Static178.aBoolean225) {
			@Pc(1211) Class62 local1211 = new Class62();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
			local1211.method1655(local1218);
			if (arg1) {
				this.aClass165_1.aBoolean323 = true;
				this.aClass165_1.aByteBuffer10 = null;
				this.aClass165_1.aClass62_3 = local1211;
				this.aClass165_1.anInt4954 = local1;
			}
			if (arg2) {
				this.aClass165_3.aBoolean323 = true;
				this.aClass165_3.aByteBuffer10 = null;
				this.aClass165_3.aClass62_3 = local1211;
				this.aClass165_3.anInt4954 = local1;
			}
			if (arg3) {
				this.aClass165_2.aBoolean323 = true;
				this.aClass165_2.aByteBuffer10 = null;
				this.aClass165_2.aClass62_3 = local1211;
				this.aClass165_2.anInt4954 = local1;
			}
			if (arg4) {
				this.aClass165_4.aBoolean323 = true;
				this.aClass165_4.aByteBuffer10 = null;
				this.aClass165_4.aClass62_3 = local1211;
				this.aClass165_4.anInt4954 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static203.aClass4_Sub17_7.anInt2400);
			local1007.put(Static203.aClass4_Sub17_7.aByteArray30, 0, Static203.aClass4_Sub17_7.anInt2400);
			local1007.flip();
			if (arg1) {
				this.aClass165_1.aBoolean323 = true;
				this.aClass165_1.aByteBuffer10 = local1007;
				this.aClass165_1.aClass62_3 = null;
				this.aClass165_1.anInt4954 = local1;
			}
			if (arg2) {
				this.aClass165_3.aBoolean323 = true;
				this.aClass165_3.aByteBuffer10 = local1007;
				this.aClass165_1.aClass62_3 = null;
				this.aClass165_3.anInt4954 = local1;
			}
			if (arg3) {
				this.aClass165_2.aBoolean323 = true;
				this.aClass165_2.aByteBuffer10 = local1007;
				this.aClass165_2.aClass62_3 = null;
				this.aClass165_2.anInt4954 = local1;
			}
			if (arg4) {
				this.aClass165_4.aBoolean323 = true;
				this.aClass165_4.aByteBuffer10 = local1007;
				this.aClass165_4.aClass62_3 = null;
				this.aClass165_4.anInt4954 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "()Z")
	@Override
	protected boolean method3143() {
		if (this.anIntArrayArray31 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt3964; local6++) {
			this.anIntArray344[local6] <<= 0x4;
			this.anIntArray340[local6] <<= 0x4;
			this.anIntArray343[local6] <<= 0x4;
		}
		Static203.anInt3970 = 0;
		Static203.anInt3969 = 0;
		Static203.anInt3968 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		if (this.anInt3965 == 0) {
			return;
		}
		if (!this.aClass174_1.aBoolean339) {
			this.method3193();
		}
		@Pc(13) short local13 = this.aClass174_1.aShort37;
		@Pc(17) short local17 = this.aClass174_1.aShort33;
		@Pc(21) short local21 = this.aClass174_1.aShort36;
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
		if (local90 / local53 <= Static61.anInt1159) {
			return;
		}
		@Pc(102) int local102 = local84 - local13 << 9;
		if (local102 / local53 >= Static60.anInt1151) {
			return;
		}
		@Pc(118) int local118 = arg6 * arg2 - local31 * arg1 >> 16;
		@Pc(132) int local132 = local118 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local132 / local53 <= Static93.anInt1922) {
			return;
		}
		@Pc(153) int local153 = local118 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local153 / local53 >= Static26.anInt481) {
			return;
		}
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 0;
		if (arg0 != 0) {
			local161 = Class131.anIntArray355[arg0];
			local163 = Class131.anIntArray353[arg0];
		}
		if (arg8 > 0L && Static241.aBoolean301 && local70 > 0) {
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
			if (Static202.anInt3932 >= local187 && Static202.anInt3932 <= local191 && Static238.anInt4596 >= local206 && Static238.anInt4596 <= local210) {
				local187 = 999999;
				local191 = -999999;
				local206 = 999999;
				local210 = -999999;
				@Pc(243) short local243 = this.aClass174_1.aShort38;
				@Pc(247) short local247 = this.aClass174_1.aShort35;
				@Pc(251) short local251 = this.aClass174_1.aShort34;
				@Pc(255) short local255 = this.aClass174_1.aShort39;
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
				if (Static202.anInt3932 >= local187 && Static202.anInt3932 <= local191 && Static238.anInt4596 >= local206 && Static238.anInt4596 <= local210) {
					if (this.aBoolean255) {
						Static110.aLongArray5[Static81.anInt4025++] = arg8;
					} else {
						if (Static203.anIntArray346.length < this.anInt3965) {
							Static203.anIntArray346 = new int[this.anInt3965];
							Static203.anIntArray347 = new int[this.anInt3965];
						}
						local362 = 0;
						label118: while (true) {
							if (local362 >= this.anInt3967) {
								local362 = 0;
								while (true) {
									if (local362 >= this.anInt3966) {
										break label118;
									}
									@Pc(698) short local698 = this.aShortArray54[local362];
									@Pc(703) short local703 = this.aShortArray58[local362];
									@Pc(708) short local708 = this.aShortArray57[local362];
									if (this.method3196(Static202.anInt3932, Static238.anInt4596, Static203.anIntArray347[local698], Static203.anIntArray347[local703], Static203.anIntArray347[local708], Static203.anIntArray346[local698], Static203.anIntArray346[local703], Static203.anIntArray346[local708])) {
										Static110.aLongArray5[Static81.anInt4025++] = arg8;
										break label118;
									}
									local362++;
								}
							}
							local369 = this.anIntArray344[local362];
							local373 = this.anIntArray340[local362];
							local377 = this.anIntArray343[local362];
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
							@Pc(652) int local652 = this.anIntArray345[local362];
							@Pc(659) int local659 = this.anIntArray345[local362 + 1];
							for (@Pc(661) int local661 = local652; local661 < local659; local661++) {
								@Pc(671) int local671 = this.aShortArray61[local661] - 1;
								if (local671 == -1) {
									break;
								}
								Static203.anIntArray346[local671] = local465;
								Static203.anIntArray347[local671] = local471;
							}
							local362++;
						}
					}
				}
			}
		}
		@Pc(744) GL local744 = Static178.aGL1;
		local744.glPushMatrix();
		local744.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local744.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method3184();
		local744.glPopMatrix();
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
	@Override
	public void method3141() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			@Pc(10) int local10 = this.anIntArray344[local1];
			this.anIntArray344[local1] = this.anIntArray343[local1];
			this.anIntArray343[local1] = -local10;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pn;IJIIIIFF)S")
	private short method3201(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray345[arg1];
		@Pc(11) int local11 = this.anIntArray345[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray61[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static203.aLongArray12[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray61[local13] = (short) (this.anInt3965 + 1);
		Static203.aLongArray12[local13] = arg2;
		this.aShortArray53[this.anInt3965] = (short) arg3;
		this.aShortArray60[this.anInt3965] = (short) arg4;
		this.aShortArray51[this.anInt3965] = (short) arg5;
		this.aShortArray59[this.anInt3965] = (short) arg6;
		this.aFloatArray24[this.anInt3965] = arg7;
		this.aFloatArray23[this.anInt3965] = arg8;
		return (short) this.anInt3965++;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V")
	@Override
	public void method3151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3964; local1++) {
			this.anIntArray344[local1] = this.anIntArray344[local1] * arg0 >> 7;
			this.anIntArray340[local1] = this.anIntArray340[local1] * arg1 >> 7;
			this.anIntArray343[local1] = this.anIntArray343[local1] * arg2 >> 7;
		}
		this.aClass174_1.aBoolean339 = false;
		this.aClass165_1.aBoolean323 = false;
	}
}
