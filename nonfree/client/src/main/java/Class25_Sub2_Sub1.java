import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!je;")
	public Class77 aClass77_1;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Lclient!af;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!rl;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "Lclient!je;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "Lclient!je;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!vg;")
	public Class167 aClass167_1;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!je;")
	private Class77 aClass77_4;

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lclient!je;")
	private Class77 aClass77_5;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt795 = 0;

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
	private int anInt796 = 0;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
	public int anInt794 = 0;

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
	private int anInt797 = 0;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class25_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!le;IIZ)V")
	public Class25_Sub2_Sub1(@OriginalArg(0) Class25_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt3521];
		this.anIntArray80 = new int[arg0.anInt3517 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt3521; local35++) {
			if ((arg0.aByteArray40 == null || arg0.aByteArray40[local35] != 2) && (arg0.aShortArray58 == null || arg0.aShortArray58[local35] == -1 || !Static151.anInterface2_1.method4419(arg0.aShortArray58[local35] & 0xFFFF))) {
				local26[this.anInt796++] = local35;
				this.anIntArray80[arg0.anIntArray316[local35]]++;
				this.anIntArray80[arg0.anIntArray313[local35]]++;
				this.anIntArray80[arg0.anIntArray312[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt796];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt796; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray58 != null) {
				local138 = arg0.aShortArray58[local128];
				if (local138 != -1) {
					local134 = Static151.anInterface2_1.method4422(local138 & 0xFFFF);
					local136 = Static151.anInterface2_1.method4424(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray43 != null && arg0.aByteArray43[local128] != 0 || local138 != -1 && !Static151.anInterface2_1.method4420(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray42 != null) {
				local130 += arg0.aByteArray42[local128] << 17;
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
		Static78.method1417(local118, local26);
		this.anInt794 = arg0.anInt3517;
		this.anInt795 = arg0.anInt3520;
		this.anIntArray81 = arg0.anIntArray308;
		this.anIntArray82 = arg0.anIntArray307;
		this.anIntArray84 = arg0.anIntArray314;
		this.anIntArray83 = arg0.anIntArray317;
		this.aShortArray21 = arg0.aShortArray53;
		local120 = this.anInt796 * 3;
		this.aShortArray16 = new short[local120];
		this.aShortArray22 = new short[local120];
		this.aShortArray15 = new short[local120];
		this.aShortArray20 = new short[local120];
		this.aFloatArray1 = new float[local120];
		this.aFloatArray2 = new float[local120];
		this.aShortArray13 = new short[this.anInt796];
		this.aByteArray8 = new byte[this.anInt796];
		this.aShortArray18 = new short[this.anInt796];
		this.aShortArray11 = new short[this.anInt796];
		this.aShortArray14 = new short[this.anInt796];
		this.aShortArray19 = new short[this.anInt796];
		if (arg0.anIntArray315 != null) {
			this.aByteArray7 = new byte[this.anInt796];
		}
		if (arg0.aShortArray55 != null) {
			this.aShortArray17 = new short[this.anInt796];
		}
		this.aClass167_1 = new Class167();
		this.aClass77_1 = new Class77();
		this.aClass77_4 = new Class77();
		if (Static10.aBoolean12) {
			this.aClass77_5 = new Class77();
		}
		this.aClass77_3 = new Class77();
		this.aClass77_2 = new Class77();
		this.aShort7 = (short) arg1;
		this.aShort6 = (short) arg2;
		this.aShortArray12 = new short[local120];
		Static29.aLongArray4 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt795; local130++) {
			local229 = this.anIntArray80[local130];
			this.anIntArray80[local130] = local128;
			local128 += local229;
		}
		this.anIntArray80[this.anInt795] = local128;
		@Pc(433) int[] local433 = null;
		@Pc(435) int[] local435 = null;
		@Pc(437) int[] local437 = null;
		@Pc(440) float[][] local440 = null;
		@Pc(560) int local560;
		@Pc(446) int local446;
		@Pc(690) float local690;
		@Pc(721) float local721;
		@Pc(692) float local692;
		if (arg0.aByteArray45 != null) {
			local446 = arg0.anInt3518;
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
			for (local466 = 0; local466 < this.anInt796; local466++) {
				@Pc(505) int local505 = local26[local466];
				if (arg0.aByteArray45[local505] != -1) {
					@Pc(518) int local518 = arg0.aByteArray45[local505] & 0xFF;
					for (@Pc(520) int local520 = 0; local520 < 3; local520++) {
						@Pc(530) int local530;
						if (local520 == 0) {
							local530 = arg0.anIntArray316[local505];
						} else if (local520 == 1) {
							local530 = arg0.anIntArray313[local505];
						} else {
							local530 = arg0.anIntArray312[local505];
						}
						@Pc(550) int local550 = arg0.anIntArray308[local530];
						@Pc(555) int local555 = arg0.anIntArray307[local530];
						local560 = arg0.anIntArray314[local530];
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
				@Pc(640) byte local640 = arg0.aByteArray49[local466];
				if (local640 > 0) {
					local433[local466] = (local449[local466] + local452[local466]) / 2;
					local435[local466] = (local455[local466] + local458[local466]) / 2;
					local437[local466] = (local461[local466] + local464[local466]) / 2;
					if (local640 == 1) {
						@Pc(686) short local686 = arg0.aShortArray51[local466];
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
						local721 = 64.0F / (float) (arg0.aShortArray54[local466] & 0xFFFF);
					} else if (local640 == 2) {
						local690 = 64.0F / (float) (arg0.aShortArray51[local466] & 0xFFFF);
						local721 = 64.0F / (float) (arg0.aShortArray54[local466] & 0xFFFF);
						local692 = 64.0F / (float) (arg0.aShortArray52[local466] & 0xFFFF);
					} else {
						local690 = (float) arg0.aShortArray51[local466] / 1024.0F;
						local721 = (float) arg0.aShortArray54[local466] / 1024.0F;
						local692 = (float) arg0.aShortArray52[local466] / 1024.0F;
					}
					local440[local466] = Static29.method636(arg0.aShortArray57[local466], arg0.aShortArray59[local466], arg0.aShortArray56[local466], arg0.aByteArray41[local466] & 0xFF, local690, local721, local692);
				}
			}
		}
		@Pc(824) int local824;
		@Pc(829) short local829;
		for (local446 = 0; local446 < this.anInt796; local446++) {
			@Pc(817) int local817 = local26[local446];
			local824 = arg0.aShortArray60[local817] & 0xFFFF;
			if (arg0.aShortArray58 == null) {
				local829 = -1;
			} else {
				local829 = arg0.aShortArray58[local817];
			}
			@Pc(840) int local840;
			if (arg0.aByteArray45 == null) {
				local840 = -1;
			} else {
				local840 = arg0.aByteArray45[local817];
			}
			@Pc(851) int local851;
			if (arg0.aByteArray43 == null) {
				local851 = 0;
			} else {
				local851 = arg0.aByteArray43[local817] & 0xFF;
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
					local909 = arg0.aByteArray49[local840];
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
						local916 = arg0.anIntArray316[local817];
						local921 = arg0.anIntArray313[local817];
						local926 = arg0.anIntArray312[local817];
						@Pc(931) short local931 = arg0.aShortArray57[local840];
						@Pc(936) short local936 = arg0.aShortArray59[local840];
						@Pc(941) short local941 = arg0.aShortArray56[local840];
						@Pc(947) float local947 = (float) arg0.anIntArray308[local931];
						@Pc(953) float local953 = (float) arg0.anIntArray307[local931];
						local959 = arg0.anIntArray314[local931];
						local967 = (float) arg0.anIntArray308[local936] - local947;
						local975 = (float) arg0.anIntArray307[local936] - local953;
						@Pc(983) float local983 = (float) arg0.anIntArray314[local936] - local959;
						@Pc(991) float local991 = (float) arg0.anIntArray308[local941] - local947;
						@Pc(999) float local999 = (float) arg0.anIntArray307[local941] - local953;
						@Pc(1007) float local1007 = (float) arg0.anIntArray314[local941] - local959;
						@Pc(1015) float local1015 = (float) arg0.anIntArray308[local916] - local947;
						@Pc(1023) float local1023 = (float) arg0.anIntArray307[local916] - local953;
						@Pc(1031) float local1031 = (float) arg0.anIntArray314[local916] - local959;
						@Pc(1039) float local1039 = (float) arg0.anIntArray308[local921] - local947;
						@Pc(1047) float local1047 = (float) arg0.anIntArray307[local921] - local953;
						local1055 = (float) arg0.anIntArray314[local921] - local959;
						local1063 = (float) arg0.anIntArray308[local926] - local947;
						local1071 = (float) arg0.anIntArray307[local926] - local953;
						local1079 = (float) arg0.anIntArray314[local926] - local959;
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
						local916 = arg0.anIntArray316[local817];
						local921 = arg0.anIntArray313[local817];
						local926 = arg0.anIntArray312[local817];
						@Pc(1283) int local1283 = local433[local840];
						local1287 = local435[local840];
						@Pc(1291) int local1291 = local437[local840];
						@Pc(1295) float[] local1295 = local440[local840];
						@Pc(1300) byte local1300 = arg0.aByteArray46[local840];
						local959 = (float) arg0.aByteArray48[local840] / 256.0F;
						if (local909 == 1) {
							local967 = (float) (arg0.aShortArray52[local840] & 0xFFFF) / 1024.0F;
							Static29.method632(arg0.anIntArray308[local916], arg0.anIntArray307[local916], arg0.anIntArray314[local916], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local861 = Static29.aFloat28;
							local863 = Static29.aFloat24;
							Static29.method632(arg0.anIntArray308[local921], arg0.anIntArray307[local921], arg0.anIntArray314[local921], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local865 = Static29.aFloat28;
							local690 = Static29.aFloat24;
							Static29.method632(arg0.anIntArray308[local926], arg0.anIntArray307[local926], arg0.anIntArray314[local926], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local721 = Static29.aFloat28;
							local692 = Static29.aFloat24;
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
							local967 = (float) arg0.aByteArray47[local840] / 256.0F;
							local975 = (float) arg0.aByteArray44[local840] / 256.0F;
							@Pc(1532) int local1532 = arg0.anIntArray308[local921] - arg0.anIntArray308[local916];
							@Pc(1542) int local1542 = arg0.anIntArray307[local921] - arg0.anIntArray307[local916];
							@Pc(1552) int local1552 = arg0.anIntArray314[local921] - arg0.anIntArray314[local916];
							@Pc(1562) int local1562 = arg0.anIntArray308[local926] - arg0.anIntArray308[local916];
							@Pc(1572) int local1572 = arg0.anIntArray307[local926] - arg0.anIntArray307[local916];
							@Pc(1582) int local1582 = arg0.anIntArray314[local926] - arg0.anIntArray314[local916];
							@Pc(1590) int local1590 = local1542 * local1582 - local1572 * local1552;
							@Pc(1598) int local1598 = local1552 * local1562 - local1582 * local1532;
							@Pc(1606) int local1606 = local1532 * local1572 - local1562 * local1542;
							local1055 = 64.0F / (float) (arg0.aShortArray51[local840] & 0xFFFF);
							local1063 = 64.0F / (float) (arg0.aShortArray54[local840] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray52[local840] & 0xFFFF);
							local1079 = ((float) local1590 * local1295[0] + (float) local1598 * local1295[1] + (float) local1606 * local1295[2]) / local1055;
							local1087 = ((float) local1590 * local1295[3] + (float) local1598 * local1295[4] + (float) local1606 * local1295[5]) / local1063;
							local1095 = ((float) local1590 * local1295[6] + (float) local1598 * local1295[7] + (float) local1606 * local1295[8]) / local1071;
							local560 = Static29.method655(local1079, local1087, local1095);
							Static29.method644(arg0.anIntArray308[local916], arg0.anIntArray307[local916], arg0.anIntArray314[local916], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local861 = Static29.aFloat29;
							local863 = Static29.aFloat25;
							Static29.method644(arg0.anIntArray308[local921], arg0.anIntArray307[local921], arg0.anIntArray314[local921], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local865 = Static29.aFloat29;
							local690 = Static29.aFloat25;
							Static29.method644(arg0.anIntArray308[local926], arg0.anIntArray307[local926], arg0.anIntArray314[local926], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local721 = Static29.aFloat29;
							local692 = Static29.aFloat25;
						} else if (local909 == 3) {
							Static29.method633(arg0.anIntArray308[local916], arg0.anIntArray307[local916], arg0.anIntArray314[local916], local1283, local1287, local1291, local1295, local1300, local959);
							local861 = Static29.aFloat26;
							local863 = Static29.aFloat27;
							Static29.method633(arg0.anIntArray308[local921], arg0.anIntArray307[local921], arg0.anIntArray314[local921], local1283, local1287, local1291, local1295, local1300, local959);
							local865 = Static29.aFloat26;
							local690 = Static29.aFloat27;
							Static29.method633(arg0.anIntArray308[local926], arg0.anIntArray307[local926], arg0.anIntArray314[local926], local1283, local1287, local1291, local1295, local1300, local959);
							local721 = Static29.aFloat26;
							local692 = Static29.aFloat27;
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
			arg0.method2809();
			if (arg0.aByteArray40 == null) {
				local909 = 0;
			} else {
				local909 = arg0.aByteArray40[local817];
			}
			if (local909 == 0) {
				@Pc(2001) long local2001 = (long) (local840 << 2) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				local926 = arg0.anIntArray316[local817];
				@Pc(2011) Class106 local2011 = arg0.aClass106Array1[local926];
				this.aShortArray18[local446] = this.method646(arg0, local926, local2001, local2011.anInt3979, local2011.anInt3980, local2011.anInt3973, local2011.anInt3977, local861, local863);
				local1287 = arg0.anIntArray313[local817];
				@Pc(2040) Class106 local2040 = arg0.aClass106Array1[local1287];
				this.aShortArray11[local446] = this.method646(arg0, local1287, local2001 + (long) local873, local2040.anInt3979, local2040.anInt3980, local2040.anInt3973, local2040.anInt3977, local865, local690);
				@Pc(2067) int local2067 = arg0.anIntArray312[local817];
				@Pc(2072) Class106 local2072 = arg0.aClass106Array1[local2067];
				this.aShortArray14[local446] = this.method646(arg0, local2067, local2001 + (long) local875, local2072.anInt3979, local2072.anInt3980, local2072.anInt3973, local2072.anInt3977, local721, local692);
			} else if (local909 == 1) {
				@Pc(2103) Class110 local2103 = arg0.aClass110Array1[local817];
				@Pc(2144) long local2144 = (long) ((local840 << 2) + (local2103.anInt4081 > 0 ? 1024 : 2048) + (local2103.anInt4082 + 256 << 12) + (local2103.anInt4083 + 256 << 22)) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				this.aShortArray18[local446] = this.method646(arg0, arg0.anIntArray316[local817], local2144, local2103.anInt4081, local2103.anInt4082, local2103.anInt4083, 0, local861, local863);
				this.aShortArray11[local446] = this.method646(arg0, arg0.anIntArray313[local817], local2144 + (long) local873, local2103.anInt4081, local2103.anInt4082, local2103.anInt4083, 0, local865, local690);
				this.aShortArray14[local446] = this.method646(arg0, arg0.anIntArray312[local817], local2144 + (long) local875, local2103.anInt4081, local2103.anInt4082, local2103.anInt4083, 0, local721, local692);
			}
			if (arg0.aShortArray58 == null) {
				this.aShortArray19[local446] = -1;
			} else {
				this.aShortArray19[local446] = arg0.aShortArray58[local817];
			}
			if (this.aByteArray7 != null) {
				this.aByteArray7[local446] = (byte) arg0.anIntArray315[local817];
			}
			this.aShortArray13[local446] = arg0.aShortArray60[local817];
			if (arg0.aByteArray43 != null) {
				this.aByteArray8[local446] = arg0.aByteArray43[local817];
			}
			if (arg0.aShortArray55 != null) {
				this.aShortArray17[local446] = arg0.aShortArray55[local817];
			}
		}
		local446 = 0;
		@Pc(2278) short local2278 = -10000;
		for (local824 = 0; local824 < this.anInt796; local824++) {
			local829 = this.aShortArray19[local824];
			if (local829 != local2278) {
				local446++;
				local2278 = local829;
			}
		}
		this.anIntArray85 = new int[local446 + 1];
		local446 = 0;
		local2278 = -10000;
		for (local824 = 0; local824 < this.anInt796; local824++) {
			local829 = this.aShortArray19[local824];
			if (local829 != local2278) {
				this.anIntArray85[local446++] = local824;
				local2278 = local829;
			}
		}
		this.anIntArray85[local446] = this.anInt796;
		Static29.aLongArray4 = null;
		this.aShortArray16 = Static29.method654(this.aShortArray16, this.anInt797);
		this.aShortArray22 = Static29.method654(this.aShortArray22, this.anInt797);
		this.aShortArray15 = Static29.method654(this.aShortArray15, this.anInt797);
		this.aShortArray20 = Static29.method654(this.aShortArray20, this.anInt797);
		this.aFloatArray1 = Static29.method628(this.aFloatArray1, this.anInt797);
		this.aFloatArray2 = Static29.method628(this.aFloatArray2, this.anInt797);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(SS)V")
	public void method625(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt796; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static151.anInterface2_1.method4417(arg0 & 0xFFFF);
			local22 = Static151.anInterface2_1.method4415(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static151.anInterface2_1.method4417(arg1 & 0xFFFF);
			local43 = Static151.anInterface2_1.method4415(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass77_4.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lclient!h;")
	@Override
	public Class25 method4771() {
		this.aBoolean45 = false;
		if (this.aClass6_1 != null) {
			this.aShortArray16 = this.aClass6_1.aShortArray3;
			this.aShortArray22 = this.aClass6_1.aShortArray2;
			this.aShortArray15 = this.aClass6_1.aShortArray4;
			this.aShortArray20 = this.aClass6_1.aShortArray1;
			this.aClass6_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public void method626(@OriginalArg(0) int arg0) {
		this.aShort6 = (short) arg0;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "()I")
	public int method627() {
		return this.aShort6;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(SS)V")
	public void method629(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt796; local1++) {
			if (this.aShortArray13[local1] == arg0) {
				this.aShortArray13[local1] = arg1;
			}
		}
		this.aClass77_4.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt797 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static296.aGL1;
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
		this.method642();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "()V")
	public void method630() {
		if (this.aShortArray16 == null) {
			this.method3490();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt794; local7++) {
			this.anIntArray81[local7] = -this.anIntArray81[local7];
			this.anIntArray84[local7] = -this.anIntArray84[local7];
		}
		for (local7 = 0; local7 < this.anInt797; local7++) {
			this.aShortArray16[local7] = (short) -this.aShortArray16[local7];
			this.aShortArray15[local7] = (short) -this.aShortArray15[local7];
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public void method631() {
		if (this.aShortArray16 == null) {
			this.method3480(256);
			return;
		}
		@Pc(10) int local10 = Class91.anIntArray319[256];
		@Pc(14) int local14 = Class91.anIntArray320[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt794; local16++) {
			local36 = this.anIntArray84[local16] * local10 + this.anIntArray81[local16] * local14 >> 16;
			this.anIntArray84[local16] = this.anIntArray84[local16] * local14 - this.anIntArray81[local16] * local10 >> 16;
			this.anIntArray81[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt797; local16++) {
			local36 = this.aShortArray15[local16] * local10 + this.aShortArray16[local16] * local14 >> 16;
			this.aShortArray15[local16] = (short) (this.aShortArray15[local16] * local14 - this.aShortArray16[local16] * local10 >> 16);
			this.aShortArray16[local16] = (short) local36;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
	@Override
	public void method3467() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			@Pc(10) int local10 = this.anIntArray81[local1];
			this.anIntArray81[local1] = this.anIntArray84[local1];
			this.anIntArray84[local1] = -local10;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort48;
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "()I")
	@Override
	public int method3470() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort44;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			Static29.anInt800 = 0;
			Static29.anInt798 = 0;
			Static29.anInt799 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray5.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray5[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static29.anInt800 += this.anIntArray81[local53];
						Static29.anInt798 += this.anIntArray82[local53];
						Static29.anInt799 += this.anIntArray84[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static29.anInt800 = Static29.anInt800 / local18 + local8;
				Static29.anInt798 = Static29.anInt798 / local18 + local12;
				Static29.anInt799 = Static29.anInt799 / local18 + local16;
			} else {
				Static29.anInt800 = local8;
				Static29.anInt798 = local12;
				Static29.anInt799 = local16;
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
				if (local26 < this.anIntArrayArray5.length) {
					local141 = this.anIntArrayArray5[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray81[local45] += local8;
						this.anIntArray82[local45] += local12;
						this.anIntArray84[local45] += local16;
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
				if (local26 < this.anIntArrayArray5.length) {
					local141 = this.anIntArrayArray5[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray81[local45] -= Static29.anInt800;
						this.anIntArray82[local45] -= Static29.anInt798;
						this.anIntArray84[local45] -= Static29.anInt799;
						if (arg4 != 0) {
							local53 = Class91.anIntArray319[arg4];
							local246 = Class91.anIntArray320[arg4];
							local264 = this.anIntArray82[local45] * local53 + this.anIntArray81[local45] * local246 + 32767 >> 16;
							this.anIntArray82[local45] = this.anIntArray82[local45] * local246 + 32767 - this.anIntArray81[local45] * local53 >> 16;
							this.anIntArray81[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class91.anIntArray319[arg2];
							local246 = Class91.anIntArray320[arg2];
							local264 = this.anIntArray82[local45] * local246 + 32767 - this.anIntArray84[local45] * local53 >> 16;
							this.anIntArray84[local45] = this.anIntArray82[local45] * local53 + this.anIntArray84[local45] * local246 + 32767 >> 16;
							this.anIntArray82[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class91.anIntArray319[arg3];
							local246 = Class91.anIntArray320[arg3];
							local264 = this.anIntArray84[local45] * local53 + this.anIntArray81[local45] * local246 + 32767 >> 16;
							this.anIntArray84[local45] = this.anIntArray84[local45] * local246 + 32767 - this.anIntArray81[local45] * local53 >> 16;
							this.anIntArray81[local45] = local264;
						}
						this.anIntArray81[local45] += Static29.anInt800;
						this.anIntArray82[local45] += Static29.anInt798;
						this.anIntArray84[local45] += Static29.anInt799;
					}
				}
			}
			if (arg5 && this.aShortArray16 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local141 = this.anIntArrayArray5[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray80[local45];
							local246 = this.anIntArray80[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray12[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class91.anIntArray319[arg4];
									local498 = Class91.anIntArray320[arg4];
									local516 = this.aShortArray22[local484] * local494 + this.aShortArray16[local484] * local498 + 32767 >> 16;
									this.aShortArray22[local484] = (short) (this.aShortArray22[local484] * local498 + 32767 - this.aShortArray16[local484] * local494 >> 16);
									this.aShortArray16[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class91.anIntArray319[arg2];
									local498 = Class91.anIntArray320[arg2];
									local516 = this.aShortArray22[local484] * local498 + 32767 - this.aShortArray15[local484] * local494 >> 16;
									this.aShortArray15[local484] = (short) (this.aShortArray22[local484] * local494 + this.aShortArray15[local484] * local498 + 32767 >> 16);
									this.aShortArray22[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class91.anIntArray319[arg3];
									local498 = Class91.anIntArray320[arg3];
									local516 = this.aShortArray15[local484] * local494 + this.aShortArray16[local484] * local498 + 32767 >> 16;
									this.aShortArray15[local484] = (short) (this.aShortArray15[local484] * local498 + 32767 - this.aShortArray16[local484] * local494 >> 16);
									this.aShortArray16[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass77_5 != null) {
					this.aClass77_5.aBoolean145 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray5.length) {
					local141 = this.anIntArrayArray5[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray81[local45] -= Static29.anInt800;
						this.anIntArray82[local45] -= Static29.anInt798;
						this.anIntArray84[local45] -= Static29.anInt799;
						this.anIntArray81[local45] = this.anIntArray81[local45] * arg2 >> 7;
						this.anIntArray82[local45] = this.anIntArray82[local45] * arg3 >> 7;
						this.anIntArray84[local45] = this.anIntArray84[local45] * arg4 >> 7;
						this.anIntArray81[local45] += Static29.anInt800;
						this.anIntArray82[local45] += Static29.anInt798;
						this.anIntArray84[local45] += Static29.anInt799;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray6 != null && this.aByteArray8 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray6.length) {
						local141 = this.anIntArrayArray6[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray8[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray8[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass77_4.aBoolean145 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray6 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray6.length) {
					local141 = this.anIntArrayArray6[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray13[local45] & 0xFFFF;
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
						this.aShortArray13[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass77_4.aBoolean145 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3463(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method648(arg0, arg1, arg2, Static29.aClass25_Sub2_Sub1_4, Static29.aClass25_Sub2_Sub1_3);
	}

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "()V")
	public void method634() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray83 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt794; local9++) {
				local20 = this.anIntArray83[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray5 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray5[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt794) {
				local20 = this.anIntArray83[local9] & 0xFF;
				this.anIntArrayArray5[local20][local5[local20]++] = local9++;
			}
			this.anIntArray83 = null;
		}
		if (this.aByteArray7 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt796; local9++) {
			local20 = this.aByteArray7[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray6 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray6[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt796) {
			local20 = this.aByteArray7[local9] & 0xFF;
			this.anIntArrayArray6[local20][local5[local20]++] = local9++;
		}
		this.aByteArray7 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
	@Override
	public boolean method4766() {
		return this.aBoolean45 && this.anIntArray81 != null && this.aShortArray16 != null;
	}

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "()Z")
	@Override
	protected boolean method3488() {
		if (this.anIntArrayArray5 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt794; local6++) {
			this.anIntArray81[local6] <<= 0x4;
			this.anIntArray82[local6] <<= 0x4;
			this.anIntArray84[local6] <<= 0x4;
		}
		Static29.anInt800 = 0;
		Static29.anInt798 = 0;
		Static29.anInt799 = 0;
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		if (this.anInt797 == 0) {
			return;
		}
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		@Pc(13) short local13 = this.aClass167_1.aShort43;
		@Pc(17) short local17 = this.aClass167_1.aShort48;
		@Pc(21) short local21 = this.aClass167_1.aShort47;
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
		if (local90 / local53 <= Static9.anInt271) {
			return;
		}
		@Pc(102) int local102 = local84 - local13 << 9;
		if (local102 / local53 >= Static148.anInt3502) {
			return;
		}
		@Pc(118) int local118 = arg6 * arg2 - local31 * arg1 >> 16;
		@Pc(132) int local132 = local118 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local132 / local53 <= Static91.anInt2137) {
			return;
		}
		@Pc(153) int local153 = local118 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local153 / local53 >= Static234.anInt5157) {
			return;
		}
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 0;
		if (arg0 != 0) {
			local161 = Class91.anIntArray319[arg0];
			local163 = Class91.anIntArray320[arg0];
		}
		if (arg8 > 0L && Static212.aBoolean252 && local70 > 0) {
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
			if (Static24.anInt490 >= local187 && Static24.anInt490 <= local191 && Static45.anInt1287 >= local206 && Static45.anInt1287 <= local210) {
				local187 = 999999;
				local191 = -999999;
				local206 = 999999;
				local210 = -999999;
				@Pc(243) short local243 = this.aClass167_1.aShort46;
				@Pc(247) short local247 = this.aClass167_1.aShort49;
				@Pc(251) short local251 = this.aClass167_1.aShort45;
				@Pc(255) short local255 = this.aClass167_1.aShort44;
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
				if (Static24.anInt490 >= local187 && Static24.anInt490 <= local191 && Static45.anInt1287 >= local206 && Static45.anInt1287 <= local210) {
					if (this.aBoolean232) {
						Static174.aLongArray9[Static129.anInt2873++] = arg8;
					} else {
						if (Static29.anIntArray87.length < this.anInt797) {
							Static29.anIntArray87 = new int[this.anInt797];
							Static29.anIntArray86 = new int[this.anInt797];
						}
						local362 = 0;
						label118: while (true) {
							if (local362 >= this.anInt795) {
								local362 = 0;
								while (true) {
									if (local362 >= this.anInt796) {
										break label118;
									}
									@Pc(698) short local698 = this.aShortArray18[local362];
									@Pc(703) short local703 = this.aShortArray11[local362];
									@Pc(708) short local708 = this.aShortArray14[local362];
									if (this.method637(Static24.anInt490, Static45.anInt1287, Static29.anIntArray86[local698], Static29.anIntArray86[local703], Static29.anIntArray86[local708], Static29.anIntArray87[local698], Static29.anIntArray87[local703], Static29.anIntArray87[local708])) {
										Static174.aLongArray9[Static129.anInt2873++] = arg8;
										break label118;
									}
									local362++;
								}
							}
							local369 = this.anIntArray81[local362];
							local373 = this.anIntArray82[local362];
							local377 = this.anIntArray84[local362];
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
							@Pc(652) int local652 = this.anIntArray80[local362];
							@Pc(659) int local659 = this.anIntArray80[local362 + 1];
							for (@Pc(661) int local661 = local652; local661 < local659; local661++) {
								@Pc(671) int local671 = this.aShortArray12[local661] - 1;
								if (local671 == -1) {
									break;
								}
								Static29.anIntArray87[local671] = local465;
								Static29.anIntArray86[local671] = local471;
							}
							local362++;
						}
					}
				}
			}
		}
		@Pc(744) GL local744 = Static296.aGL1;
		local744.glPushMatrix();
		local744.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local744.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method642();
		local744.glPopMatrix();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static29.anInt800 = 0;
			Static29.anInt798 = 0;
			Static29.anInt799 = 0;
			for (local11 = 0; local11 < this.anInt794; local11++) {
				Static29.anInt800 += this.anIntArray81[local11];
				Static29.anInt798 += this.anIntArray82[local11];
				Static29.anInt799 += this.anIntArray84[local11];
				local3++;
			}
			if (local3 > 0) {
				Static29.anInt800 = Static29.anInt800 / local3 + arg1;
				Static29.anInt798 = Static29.anInt798 / local3 + arg2;
				Static29.anInt799 = Static29.anInt799 / local3 + arg3;
			} else {
				Static29.anInt800 = arg1;
				Static29.anInt798 = arg2;
				Static29.anInt799 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt794; local3++) {
				this.anIntArray81[local3] += arg1;
				this.anIntArray82[local3] += arg2;
				this.anIntArray84[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt794; local3++) {
					this.anIntArray81[local3] -= Static29.anInt800;
					this.anIntArray82[local3] -= Static29.anInt798;
					this.anIntArray84[local3] -= Static29.anInt799;
					if (arg3 != 0) {
						local11 = Class91.anIntArray319[arg3];
						local146 = Class91.anIntArray320[arg3];
						local164 = this.anIntArray82[local3] * local11 + this.anIntArray81[local3] * local146 + 32767 >> 16;
						this.anIntArray82[local3] = this.anIntArray82[local3] * local146 + 32767 - this.anIntArray81[local3] * local11 >> 16;
						this.anIntArray81[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class91.anIntArray319[arg1];
						local146 = Class91.anIntArray320[arg1];
						local164 = this.anIntArray82[local3] * local146 + 32767 - this.anIntArray84[local3] * local11 >> 16;
						this.anIntArray84[local3] = this.anIntArray82[local3] * local11 + this.anIntArray84[local3] * local146 + 32767 >> 16;
						this.anIntArray82[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class91.anIntArray319[arg2];
						local146 = Class91.anIntArray320[arg2];
						local164 = this.anIntArray84[local3] * local11 + this.anIntArray81[local3] * local146 + 32767 >> 16;
						this.anIntArray84[local3] = this.anIntArray84[local3] * local146 + 32767 - this.anIntArray81[local3] * local11 >> 16;
						this.anIntArray81[local3] = local164;
					}
					this.anIntArray81[local3] += Static29.anInt800;
					this.anIntArray82[local3] += Static29.anInt798;
					this.anIntArray84[local3] += Static29.anInt799;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt794; local3++) {
					this.anIntArray81[local3] -= Static29.anInt800;
					this.anIntArray82[local3] -= Static29.anInt798;
					this.anIntArray84[local3] -= Static29.anInt799;
					this.anIntArray81[local3] = this.anIntArray81[local3] * arg1 / 128;
					this.anIntArray82[local3] = this.anIntArray82[local3] * arg2 / 128;
					this.anIntArray84[local3] = this.anIntArray84[local3] * arg3 / 128;
					this.anIntArray81[local3] += Static29.anInt800;
					this.anIntArray82[local3] += Static29.anInt798;
					this.anIntArray84[local3] += Static29.anInt799;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt796; local3++) {
					local11 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray8[local3] = (byte) local11;
				}
				this.aClass77_4.aBoolean145 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt796; local3++) {
					local11 = this.aShortArray13[local3] & 0xFFFF;
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
					this.aShortArray13[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass77_4.aBoolean145 = false;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "()I")
	@Override
	public int method3489() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort45;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	@Override
	public void method3464(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt794; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local3 + this.anIntArray81[local9] * local7 >> 16;
			this.anIntArray82[local9] = this.anIntArray82[local9] * local7 - this.anIntArray81[local9] * local3 >> 16;
			this.anIntArray81[local9] = local29;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!cd;")
	public Class25_Sub2_Sub1 method638(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class25_Sub2_Sub1 local3 = new Class25_Sub2_Sub1();
		local3.anInt794 = this.anInt794;
		local3.anInt795 = this.anInt795;
		local3.anInt797 = this.anInt797;
		local3.anInt796 = this.anInt796;
		if (arg0) {
			local3.anIntArray81 = this.anIntArray81;
			local3.anIntArray84 = this.anIntArray84;
		} else {
			local3.anIntArray81 = Static261.method4462(this.anIntArray81);
			local3.anIntArray84 = Static261.method4462(this.anIntArray84);
		}
		if (arg1) {
			local3.anIntArray82 = this.anIntArray82;
		} else {
			local3.anIntArray82 = Static261.method4462(this.anIntArray82);
		}
		if (arg0 && arg1) {
			local3.aClass77_1 = this.aClass77_1;
			local3.aClass167_1 = this.aClass167_1;
		} else {
			local3.aClass77_1 = new Class77();
			local3.aClass167_1 = new Class167();
		}
		if (arg2) {
			local3.aShortArray13 = this.aShortArray13;
		} else {
			local3.aShortArray13 = Static54.method1104(this.aShortArray13);
		}
		local3.aByteArray8 = this.aByteArray8;
		if (arg2 && arg3 && (arg6 && arg4 || Static10.aBoolean12)) {
			local3.aClass77_4 = this.aClass77_4;
		} else {
			local3.aClass77_4 = new Class77();
		}
		if (arg4) {
			local3.aShortArray16 = this.aShortArray16;
			local3.aShortArray22 = this.aShortArray22;
			local3.aShortArray15 = this.aShortArray15;
			local3.aShortArray20 = this.aShortArray20;
		} else {
			local3.aShortArray16 = Static54.method1104(this.aShortArray16);
			local3.aShortArray22 = Static54.method1104(this.aShortArray22);
			local3.aShortArray15 = Static54.method1104(this.aShortArray15);
			local3.aShortArray20 = Static54.method1104(this.aShortArray20);
		}
		if (!Static10.aBoolean12) {
			local3.aClass77_5 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass77_5 = this.aClass77_5;
		} else {
			local3.aClass77_5 = new Class77();
		}
		local3.aFloatArray1 = this.aFloatArray1;
		local3.aFloatArray2 = this.aFloatArray2;
		local3.aClass77_3 = this.aClass77_3;
		if (arg7) {
			local3.aShortArray18 = this.aShortArray18;
			local3.aShortArray11 = this.aShortArray11;
			local3.aShortArray14 = this.aShortArray14;
			local3.aClass77_2 = this.aClass77_2;
		} else {
			local3.aShortArray18 = Static54.method1104(this.aShortArray18);
			local3.aShortArray11 = Static54.method1104(this.aShortArray11);
			local3.aShortArray14 = Static54.method1104(this.aShortArray14);
			local3.aClass77_2 = new Class77();
		}
		if (arg8) {
			local3.aShortArray19 = this.aShortArray19;
		} else {
			local3.aShortArray19 = Static54.method1104(this.aShortArray19);
		}
		local3.anIntArray83 = this.anIntArray83;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.aByteArray7 = this.aByteArray7;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.anIntArray85 = this.anIntArray85;
		local3.aShortArray12 = this.aShortArray12;
		local3.anIntArray80 = this.anIntArray80;
		local3.aShort7 = this.aShort7;
		local3.aShort6 = this.aShort6;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray17 = this.aShortArray17;
		return local3;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "()V")
	@Override
	protected void method3469() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] + 7 >> 4;
			this.anIntArray82[local1] = this.anIntArray82[local1] + 7 >> 4;
			this.anIntArray84[local1] = this.anIntArray84[local1] + 7 >> 4;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
	@Override
	public void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			this.anIntArray81[local1] += arg0;
			this.anIntArray82[local1] += arg1;
			this.anIntArray84[local1] += arg2;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	@Override
	public void method3471(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt794; local9++) {
			@Pc(29) int local29 = this.anIntArray82[local9] * local7 - this.anIntArray84[local9] * local3 >> 16;
			this.anIntArray84[local9] = this.anIntArray82[local9] * local3 + this.anIntArray84[local9] * local7 >> 16;
			this.anIntArray82[local9] = local29;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()I")
	@Override
	public int method3462() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort47;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public void method639(@OriginalArg(0) int arg0) {
		this.aShort7 = (short) arg0;
		this.aClass77_4.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "()V")
	public void method640() {
		if (this.aShortArray16 == null) {
			this.method3467();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt794; local7++) {
			@Pc(16) int local16 = this.anIntArray81[local7];
			this.anIntArray81[local7] = this.anIntArray84[local7];
			this.anIntArray84[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt797; local7++) {
			@Pc(43) short local43 = this.aShortArray16[local7];
			this.aShortArray16[local7] = this.aShortArray15[local7];
			this.aShortArray15[local7] = (short) -local43;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "()V")
	@Override
	public void method3483() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			@Pc(10) int local10 = this.anIntArray84[local1];
			this.anIntArray84[local1] = this.anIntArray81[local1];
			this.anIntArray81[local1] = -local10;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "()I")
	@Override
	public int method3475() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort46;
	}

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "()I")
	public int method641() {
		return this.aShort7;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3482(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method648(arg0, arg1, arg2, Static29.aClass25_Sub2_Sub1_6, Static29.aClass25_Sub2_Sub1_5);
	}

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "()V")
	private void method642() {
		@Pc(1) GL local1 = Static296.aGL1;
		if (this.anInt796 == 0) {
			return;
		}
		if (this.aByte3 != 0) {
			this.method650(true, !this.aClass77_1.aBoolean145 && (this.aByte3 & 0x1) != 0, !this.aClass77_4.aBoolean145 && (this.aByte3 & 0x2) != 0, this.aClass77_5 != null && !this.aClass77_5.aBoolean145 && (this.aByte3 & 0x4) != 0, false);
		}
		this.method650(false, !this.aClass77_1.aBoolean145, !this.aClass77_4.aBoolean145, this.aClass77_5 != null && !this.aClass77_5.aBoolean145, !this.aClass77_3.aBoolean145);
		if (!this.aClass77_2.aBoolean145) {
			this.method653();
		}
		if (this.aByte4 != 0) {
			if ((this.aByte4 & 0x1) != 0) {
				this.anIntArray81 = null;
				this.anIntArray82 = null;
				this.anIntArray84 = null;
				this.aShortArray12 = null;
				this.anIntArray80 = null;
			}
			if ((this.aByte4 & 0x2) != 0) {
				this.aShortArray13 = null;
				this.aByteArray8 = null;
			}
			if ((this.aByte4 & 0x4) != 0) {
				this.aShortArray16 = null;
				this.aShortArray22 = null;
				this.aShortArray15 = null;
				this.aShortArray20 = null;
			}
			if ((this.aByte4 & 0x8) != 0) {
				this.aFloatArray1 = null;
				this.aFloatArray2 = null;
			}
			if ((this.aByte4 & 0x10) != 0) {
				this.aShortArray18 = null;
				this.aShortArray11 = null;
				this.aShortArray14 = null;
			}
			this.aByte4 = 0;
		}
		@Pc(172) Class141 local172 = null;
		if (this.aClass77_1.aClass141_2 != null) {
			this.aClass77_1.aClass141_2.method4040();
			local172 = this.aClass77_1.aClass141_2;
			local1.glVertexPointer(3, 5126, this.aClass77_1.anInt2815, (long) this.aClass77_1.anInt2811);
		}
		if (this.aClass77_4.aClass141_2 != null) {
			if (local172 != this.aClass77_4.aClass141_2) {
				this.aClass77_4.aClass141_2.method4040();
				local172 = this.aClass77_4.aClass141_2;
			}
			local1.glColorPointer(4, 5121, this.aClass77_4.anInt2815, (long) this.aClass77_4.anInt2811);
		}
		if (Static10.aBoolean12 && this.aClass77_5.aClass141_2 != null) {
			if (local172 != this.aClass77_5.aClass141_2) {
				this.aClass77_5.aClass141_2.method4040();
				local172 = this.aClass77_5.aClass141_2;
			}
			local1.glNormalPointer(5126, this.aClass77_5.anInt2815, (long) this.aClass77_5.anInt2811);
		}
		if (this.aClass77_3.aClass141_2 != null) {
			if (local172 != this.aClass77_3.aClass141_2) {
				this.aClass77_3.aClass141_2.method4040();
				local172 = this.aClass77_3.aClass141_2;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass77_3.anInt2815, (long) this.aClass77_3.anInt2811);
		}
		if (this.aClass77_2.aClass141_2 != null) {
			this.aClass77_2.aClass141_2.method4039();
		}
		if (this.aClass77_1.aClass141_2 == null || this.aClass77_4.aClass141_2 == null || Static10.aBoolean12 && this.aClass77_5.aClass141_2 == null || this.aClass77_3.aClass141_2 == null) {
			if (Static296.aBoolean347) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass77_1.aClass141_2 == null) {
				this.aClass77_1.aByteBuffer5.position(this.aClass77_1.anInt2811);
				local1.glVertexPointer(3, 5126, this.aClass77_1.anInt2815, this.aClass77_1.aByteBuffer5);
			}
			if (this.aClass77_4.aClass141_2 == null) {
				this.aClass77_4.aByteBuffer5.position(this.aClass77_4.anInt2811);
				local1.glColorPointer(4, 5121, this.aClass77_4.anInt2815, this.aClass77_4.aByteBuffer5);
			}
			if (Static10.aBoolean12 && this.aClass77_5.aClass141_2 == null) {
				this.aClass77_5.aByteBuffer5.position(this.aClass77_5.anInt2811);
				local1.glNormalPointer(5126, this.aClass77_5.anInt2815, this.aClass77_5.aByteBuffer5);
			}
			if (this.aClass77_3.aClass141_2 == null) {
				this.aClass77_3.aByteBuffer5.position(this.aClass77_3.anInt2811);
				local1.glTexCoordPointer(2, 5126, this.aClass77_3.anInt2815, this.aClass77_3.aByteBuffer5);
			}
		}
		if (this.aClass77_2.aClass141_2 == null && Static296.aBoolean347) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray85.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray85[local419];
			@Pc(434) int local434 = this.anIntArray85[local419 + 1];
			@Pc(439) short local439 = this.aShortArray19[local427];
			if (local439 == -1) {
				Static296.method4812(-1);
				Static141.method2524(0, 0);
			} else {
				Static151.anInterface2_1.method4421(local439 & 0xFFFF);
			}
			if (this.aClass77_2.aClass141_2 == null) {
				this.aClass77_2.aByteBuffer5.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass77_2.aByteBuffer5);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "()V")
	public void method643() {
		if (this.aShortArray16 == null) {
			this.method3483();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt794; local7++) {
			@Pc(16) int local16 = this.anIntArray84[local7];
			this.anIntArray84[local7] = this.anIntArray81[local7];
			this.anIntArray81[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt797; local7++) {
			@Pc(43) short local43 = this.aShortArray15[local7];
			this.aShortArray15[local7] = this.aShortArray16[local7];
			this.aShortArray16[local7] = (short) -local43;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	@Override
	public void method3480(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class91.anIntArray319[arg0];
		@Pc(7) int local7 = Class91.anIntArray320[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt794; local9++) {
			@Pc(29) int local29 = this.anIntArray84[local9] * local3 + this.anIntArray81[local9] * local7 >> 16;
			this.anIntArray84[local9] = this.anIntArray84[local9] * local7 - this.anIntArray81[local9] * local3 >> 16;
			this.anIntArray81[local9] = local29;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)V")
	@Override
	public void method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			this.anIntArray81[local1] = this.anIntArray81[local1] * arg0 >> 7;
			this.anIntArray82[local1] = this.anIntArray82[local1] * arg1 >> 7;
			this.anIntArray84[local1] = this.anIntArray84[local1] * arg2 >> 7;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "()V")
	@Override
	public void method3490() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt794; local1++) {
			this.anIntArray81[local1] = -this.anIntArray81[local1];
			this.anIntArray84[local1] = -this.anIntArray84[local1];
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()I")
	@Override
	public int method3466() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort49;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!le;IJIIIIFF)S")
	private short method646(@OriginalArg(0) Class25_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray80[arg1];
		@Pc(11) int local11 = this.anIntArray80[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray12[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static29.aLongArray4[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray12[local13] = (short) (this.anInt797 + 1);
		Static29.aLongArray4[local13] = arg2;
		this.aShortArray16[this.anInt797] = (short) arg3;
		this.aShortArray22[this.anInt797] = (short) arg4;
		this.aShortArray15[this.anInt797] = (short) arg5;
		this.aShortArray20[this.anInt797] = (short) arg6;
		this.aFloatArray1[this.anInt797] = arg7;
		this.aFloatArray2[this.anInt797] = arg8;
		return (short) this.anInt797++;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!cd;[[I[[IIII)V")
	public void method647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub2_Sub1 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass167_1.aBoolean320) {
			arg2.method651();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass167_1.aShort46;
		@Pc(17) int local17 = arg5 + arg2.aClass167_1.aShort49;
		@Pc(23) int local23 = arg7 + arg2.aClass167_1.aShort45;
		@Pc(29) int local29 = arg7 + arg2.aClass167_1.aShort44;
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
			for (local150 = 0; local150 < this.anInt795; local150++) {
				local161 = this.anIntArray81[local150] + arg5;
				local168 = this.anIntArray84[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray82[local150] = this.anIntArray82[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass167_1.aShort48;
				for (local161 = 0; local161 < this.anInt795; local161++) {
					local168 = (this.anIntArray82[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray81[local161] + arg5;
						local176 = this.anIntArray84[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray82[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method3481(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass167_1.aShort47 - arg2.aClass167_1.aShort48;
				for (local161 = 0; local161 < this.anInt795; local161++) {
					local168 = this.anIntArray81[local161] + arg5;
					local172 = this.anIntArray84[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray82[local161] = this.anIntArray82[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass167_1.aShort47 - arg2.aClass167_1.aShort48;
				for (local161 = 0; local161 < this.anInt795; local161++) {
					local168 = this.anIntArray81[local161] + arg5;
					local172 = this.anIntArray84[local161] + arg7;
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
					this.anIntArray82[local161] = ((this.anIntArray82[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass77_1.aBoolean145 = false;
		this.aClass167_1.aBoolean320 = false;
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "()I")
	@Override
	public int method3476() {
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		return this.aClass167_1.aShort43;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZLclient!cd;Lclient!cd;)Lclient!lf;")
	private Class25_Sub2 method648(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class25_Sub2_Sub1 arg3, @OriginalArg(4) Class25_Sub2_Sub1 arg4) {
		arg3.anInt794 = this.anInt794;
		arg3.anInt795 = this.anInt795;
		arg3.anInt797 = this.anInt797;
		arg3.anInt796 = this.anInt796;
		arg3.aShort7 = this.aShort7;
		arg3.aShort6 = this.aShort6;
		arg3.aByte3 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray81 == null || arg3.anIntArray81.length < this.anInt794) {
			arg3.anIntArray81 = new int[this.anInt794 + 100];
			arg3.anIntArray82 = new int[this.anInt794 + 100];
			arg3.anIntArray84 = new int[this.anInt794 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt794; local73++) {
			arg3.anIntArray81[local73] = this.anIntArray81[local73];
			arg3.anIntArray82[local73] = this.anIntArray82[local73];
			arg3.anIntArray84[local73] = this.anIntArray84[local73];
		}
		if (arg3.aClass77_1 == null) {
			arg3.aClass77_1 = new Class77();
		}
		arg3.aClass77_1.aBoolean145 = false;
		if (arg3.aClass167_1 == null) {
			arg3.aClass167_1 = new Class167();
		}
		arg3.aClass167_1.aBoolean320 = false;
		if (arg0) {
			arg3.aByteArray8 = this.aByteArray8;
		} else {
			if (arg4.aByteArray8 == null || arg4.aByteArray8.length < this.anInt796) {
				arg4.aByteArray8 = new byte[this.anInt796 + 100];
			}
			arg3.aByteArray8 = arg4.aByteArray8;
			for (local73 = 0; local73 < this.anInt796; local73++) {
				arg3.aByteArray8[local73] = this.aByteArray8[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray13 = this.aShortArray13;
		} else {
			if (arg4.aShortArray13 == null || arg4.aShortArray13.length < this.anInt796) {
				arg4.aShortArray13 = new short[this.anInt796 + 100];
			}
			arg3.aShortArray13 = arg4.aShortArray13;
			for (local73 = 0; local73 < this.anInt796; local73++) {
				arg3.aShortArray13[local73] = this.aShortArray13[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass77_4 = this.aClass77_4;
		} else {
			if (arg4.aClass77_4 == null) {
				arg4.aClass77_4 = new Class77();
			}
			arg3.aClass77_4 = arg4.aClass77_4;
			arg3.aClass77_4.aBoolean145 = false;
		}
		if (arg2 || this.aShortArray16 == null) {
			arg3.aShortArray16 = this.aShortArray16;
			arg3.aShortArray22 = this.aShortArray22;
			arg3.aShortArray15 = this.aShortArray15;
			arg3.aShortArray20 = this.aShortArray20;
			arg3.aClass77_5 = this.aClass77_5;
		} else {
			if (arg4.aShortArray16 == null || arg4.aShortArray16.length < this.anInt797) {
				arg4.aShortArray16 = new short[this.anInt797 + 100];
				arg4.aShortArray22 = new short[this.anInt797 + 100];
				arg4.aShortArray15 = new short[this.anInt797 + 100];
				arg4.aShortArray20 = new short[this.anInt797 + 100];
			}
			arg3.aShortArray16 = arg4.aShortArray16;
			arg3.aShortArray22 = arg4.aShortArray22;
			arg3.aShortArray15 = arg4.aShortArray15;
			arg3.aShortArray20 = arg4.aShortArray20;
			for (local73 = 0; local73 < this.anInt797; local73++) {
				arg3.aShortArray16[local73] = this.aShortArray16[local73];
				arg3.aShortArray22[local73] = this.aShortArray22[local73];
				arg3.aShortArray15[local73] = this.aShortArray15[local73];
				arg3.aShortArray20[local73] = this.aShortArray20[local73];
			}
			if (Static10.aBoolean12) {
				if (arg4.aClass77_5 == null) {
					arg4.aClass77_5 = new Class77();
				}
				arg3.aClass77_5 = arg4.aClass77_5;
				arg3.aClass77_5.aBoolean145 = false;
			} else {
				arg3.aClass77_5 = null;
			}
		}
		arg3.aFloatArray1 = this.aFloatArray1;
		arg3.aFloatArray2 = this.aFloatArray2;
		arg3.anIntArray83 = this.anIntArray83;
		arg3.anIntArrayArray5 = this.anIntArrayArray5;
		arg3.aShortArray18 = this.aShortArray18;
		arg3.aShortArray11 = this.aShortArray11;
		arg3.aShortArray14 = this.aShortArray14;
		arg3.aShortArray19 = this.aShortArray19;
		arg3.aByteArray7 = this.aByteArray7;
		arg3.anIntArrayArray6 = this.anIntArrayArray6;
		arg3.aClass77_3 = this.aClass77_3;
		arg3.aClass77_2 = this.aClass77_2;
		arg3.anIntArray85 = this.anIntArray85;
		arg3.aShortArray12 = this.aShortArray12;
		arg3.anIntArray80 = this.anIntArray80;
		arg3.aBoolean232 = this.aBoolean232;
		arg3.aShortArray21 = this.aShortArray21;
		arg3.aShortArray17 = this.aShortArray17;
		return arg3;
	}

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "()V")
	public void method649() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt794; local1++) {
			this.anIntArray84[local1] = -this.anIntArray84[local1];
		}
		if (this.aShortArray15 != null) {
			for (local1 = 0; local1 < this.anInt797; local1++) {
				this.aShortArray15[local1] = (short) -this.aShortArray15[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt796; local1++) {
			@Pc(48) short local48 = this.aShortArray18[local1];
			this.aShortArray18[local1] = this.aShortArray14[local1];
			this.aShortArray14[local1] = local48;
		}
		this.aClass167_1.aBoolean320 = false;
		this.aClass77_1.aBoolean145 = false;
		if (this.aClass77_5 != null) {
			this.aClass77_5.aBoolean145 = false;
		}
		this.aClass77_2.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZ)V")
	private void method650(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass77_1.anInt2811 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass77_4.anInt2811 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass77_5.anInt2811 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass77_3.anInt2811 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static29.aClass1_Sub16_1.aByteArray39.length < this.anInt797 * local1) {
			Static29.aClass1_Sub16_1 = new Class1_Sub16((this.anInt797 + 100) * local1);
		} else {
			Static29.aClass1_Sub16_1.anInt3328 = 0;
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
			if (Static296.aBoolean344) {
				for (local60 = 0; local60 < this.anInt795; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray81[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray82[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray84[local60]);
					local90 = this.anIntArray80[local60];
					local97 = this.anIntArray80[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray12[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static29.aClass1_Sub16_1.anInt3328 = local109 * local1;
						Static29.aClass1_Sub16_1.method2606(local71);
						Static29.aClass1_Sub16_1.method2606(local78);
						Static29.aClass1_Sub16_1.method2606(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt795; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray81[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray82[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray84[local60]);
					local90 = this.anIntArray80[local60];
					local97 = this.anIntArray80[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray12[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static29.aClass1_Sub16_1.anInt3328 = local109 * local1;
						Static29.aClass1_Sub16_1.method2656(local71);
						Static29.aClass1_Sub16_1.method2656(local78);
						Static29.aClass1_Sub16_1.method2656(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static10.aBoolean12) {
				for (local60 = 0; local60 < this.anInt796; local60++) {
					local71 = Static29.method624(this.aShortArray13[local60], this.aShortArray19[local60], this.aShort7, this.aByteArray8[local60]);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + this.aShortArray18[local60] * local1;
					Static29.aClass1_Sub16_1.method2606(local71);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + this.aShortArray11[local60] * local1;
					Static29.aClass1_Sub16_1.method2606(local71);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + this.aShortArray14[local60] * local1;
					Static29.aClass1_Sub16_1.method2606(local71);
				}
			} else {
				local60 = (int) Static201.aFloatArray27[0];
				local71 = (int) Static201.aFloatArray27[1];
				local78 = (int) Static201.aFloatArray27[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort7 * 1.3F);
				local97 = this.aShort6 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt796; local99++) {
					@Pc(270) short local270 = this.aShortArray18[local99];
					@Pc(275) short local275 = this.aShortArray20[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray16[local270] + local71 * this.aShortArray22[local270] + local78 * this.aShortArray15[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray16[local270] + local71 * this.aShortArray22[local270] + local78 * this.aShortArray15[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray20[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray11[local99];
					@Pc(369) short local369 = this.aShortArray20[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray16[local364] + local71 * this.aShortArray22[local364] + local78 * this.aShortArray15[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray16[local364] + local71 * this.aShortArray22[local364] + local78 * this.aShortArray15[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray20[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray14[local99];
					@Pc(463) short local463 = this.aShortArray20[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray16[local458] + local71 * this.aShortArray22[local458] + local78 * this.aShortArray15[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray16[local458] + local71 * this.aShortArray22[local458] + local78 * this.aShortArray15[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray20[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static29.method624(this.aShortArray13[local99], this.aShortArray19[local99], local281, this.aByteArray8[local99]);
					@Pc(577) int local577 = Static29.method624(this.aShortArray13[local99], this.aShortArray19[local99], local375, this.aByteArray8[local99]);
					@Pc(592) int local592 = Static29.method624(this.aShortArray13[local99], this.aShortArray19[local99], local469, this.aByteArray8[local99]);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + local270 * local1;
					Static29.aClass1_Sub16_1.method2606(local562);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + local364 * local1;
					Static29.aClass1_Sub16_1.method2606(local577);
					Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_4.anInt2811 + local458 * local1;
					Static29.aClass1_Sub16_1.method2606(local592);
				}
				this.aShortArray16 = null;
				this.aShortArray22 = null;
				this.aShortArray15 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort6;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort6 + this.aShort6 / 2);
			Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_5.anInt2811;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static296.aBoolean344) {
				for (local78 = 0; local78 < this.anInt797; local78++) {
					local752 = this.aShortArray20[local78];
					if (local752 == 0) {
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray16[local78] * local734);
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray22[local78] * local734);
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray15[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray16[local78] * local790);
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray22[local78] * local790);
						Static29.aClass1_Sub16_1.method2601((float) this.aShortArray15[local78] * local790);
					}
					Static29.aClass1_Sub16_1.anInt3328 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt797; local78++) {
					local752 = this.aShortArray20[local78];
					if (local752 == 0) {
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray16[local78] * local734);
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray22[local78] * local734);
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray15[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray16[local78] * local790);
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray22[local78] * local790);
						Static29.aClass1_Sub16_1.method2629((float) this.aShortArray15[local78] * local790);
					}
					Static29.aClass1_Sub16_1.anInt3328 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static29.aClass1_Sub16_1.anInt3328 = this.aClass77_3.anInt2811;
			if (Static296.aBoolean344) {
				for (local60 = 0; local60 < this.anInt797; local60++) {
					Static29.aClass1_Sub16_1.method2601(this.aFloatArray1[local60]);
					Static29.aClass1_Sub16_1.method2601(this.aFloatArray2[local60]);
					Static29.aClass1_Sub16_1.anInt3328 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt797; local60++) {
					Static29.aClass1_Sub16_1.method2629(this.aFloatArray1[local60]);
					Static29.aClass1_Sub16_1.method2629(this.aFloatArray2[local60]);
					Static29.aClass1_Sub16_1.anInt3328 += local1 - 8;
				}
			}
		}
		Static29.aClass1_Sub16_1.anInt3328 = local1 * this.anInt797;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static296.aBoolean332) {
				local1007 = ByteBuffer.wrap(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
				if (this.aClass141_1 == null) {
					this.aClass141_1 = new Class141(true);
					this.aClass141_1.method4041(local1007);
				} else {
					this.aClass141_1.method4038(local1007);
				}
				if (arg1) {
					this.aClass77_1.aBoolean145 = true;
					this.aClass77_1.aByteBuffer5 = null;
					this.aClass77_1.aClass141_2 = this.aClass141_1;
					this.aClass77_1.anInt2815 = local1;
				}
				if (arg2) {
					this.aClass77_4.aBoolean145 = true;
					this.aClass77_4.aByteBuffer5 = null;
					this.aClass77_4.aClass141_2 = this.aClass141_1;
					this.aClass77_4.anInt2815 = local1;
				}
				if (arg3) {
					this.aClass77_5.aBoolean145 = true;
					this.aClass77_5.aByteBuffer5 = null;
					this.aClass77_5.aClass141_2 = this.aClass141_1;
					this.aClass77_5.anInt2815 = local1;
				}
				if (arg4) {
					this.aClass77_3.aBoolean145 = true;
					this.aClass77_3.aByteBuffer5 = null;
					this.aClass77_3.aClass141_2 = this.aClass141_1;
					this.aClass77_3.anInt2815 = local1;
				}
			} else {
				if (Static29.aByteBuffer1 == null || Static29.aByteBuffer1.capacity() < Static29.aClass1_Sub16_1.anInt3328) {
					Static29.aByteBuffer1 = ByteBuffer.allocateDirect(Static29.aClass1_Sub16_1.anInt3328 + local1 * 100);
				} else {
					Static29.aByteBuffer1.clear();
				}
				Static29.aByteBuffer1.put(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
				Static29.aByteBuffer1.flip();
				if (arg1) {
					this.aClass77_1.aBoolean145 = true;
					this.aClass77_1.aByteBuffer5 = Static29.aByteBuffer1;
					this.aClass77_1.aClass141_2 = null;
					this.aClass77_1.anInt2815 = local1;
				}
				if (arg2) {
					this.aClass77_4.aBoolean145 = true;
					this.aClass77_4.aByteBuffer5 = Static29.aByteBuffer1;
					this.aClass77_1.aClass141_2 = null;
					this.aClass77_4.anInt2815 = local1;
				}
				if (arg3) {
					this.aClass77_5.aBoolean145 = true;
					this.aClass77_5.aByteBuffer5 = Static29.aByteBuffer1;
					this.aClass77_5.aClass141_2 = null;
					this.aClass77_5.anInt2815 = local1;
				}
				if (arg4) {
					this.aClass77_3.aBoolean145 = true;
					this.aClass77_3.aByteBuffer5 = Static29.aByteBuffer1;
					this.aClass77_3.aClass141_2 = null;
					this.aClass77_3.anInt2815 = local1;
				}
			}
		} else if (Static296.aBoolean347) {
			@Pc(1211) Class141 local1211 = new Class141();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
			local1211.method4041(local1218);
			if (arg1) {
				this.aClass77_1.aBoolean145 = true;
				this.aClass77_1.aByteBuffer5 = null;
				this.aClass77_1.aClass141_2 = local1211;
				this.aClass77_1.anInt2815 = local1;
			}
			if (arg2) {
				this.aClass77_4.aBoolean145 = true;
				this.aClass77_4.aByteBuffer5 = null;
				this.aClass77_4.aClass141_2 = local1211;
				this.aClass77_4.anInt2815 = local1;
			}
			if (arg3) {
				this.aClass77_5.aBoolean145 = true;
				this.aClass77_5.aByteBuffer5 = null;
				this.aClass77_5.aClass141_2 = local1211;
				this.aClass77_5.anInt2815 = local1;
			}
			if (arg4) {
				this.aClass77_3.aBoolean145 = true;
				this.aClass77_3.aByteBuffer5 = null;
				this.aClass77_3.aClass141_2 = local1211;
				this.aClass77_3.anInt2815 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static29.aClass1_Sub16_1.anInt3328);
			local1007.put(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
			local1007.flip();
			if (arg1) {
				this.aClass77_1.aBoolean145 = true;
				this.aClass77_1.aByteBuffer5 = local1007;
				this.aClass77_1.aClass141_2 = null;
				this.aClass77_1.anInt2815 = local1;
			}
			if (arg2) {
				this.aClass77_4.aBoolean145 = true;
				this.aClass77_4.aByteBuffer5 = local1007;
				this.aClass77_1.aClass141_2 = null;
				this.aClass77_4.anInt2815 = local1;
			}
			if (arg3) {
				this.aClass77_5.aBoolean145 = true;
				this.aClass77_5.aByteBuffer5 = local1007;
				this.aClass77_5.aClass141_2 = null;
				this.aClass77_5.anInt2815 = local1;
			}
			if (arg4) {
				this.aClass77_3.aBoolean145 = true;
				this.aClass77_3.aByteBuffer5 = local1007;
				this.aClass77_3.aClass141_2 = null;
				this.aClass77_3.anInt2815 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(ZZZ)Lclient!lf;")
	@Override
	public Class25_Sub2 method3468(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method648(arg0, arg1, arg2, Static29.aClass25_Sub2_Sub1_2, Static29.aClass25_Sub2_Sub1_1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static29.anInt800 = 0;
			Static29.anInt798 = 0;
			Static29.anInt799 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray5.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray5[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local53]) != 0) {
							Static29.anInt800 += this.anIntArray81[local53];
							Static29.anInt798 += this.anIntArray82[local53];
							Static29.anInt799 += this.anIntArray84[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static29.anInt800 = Static29.anInt800 / local18 + arg2;
				Static29.anInt798 = Static29.anInt798 / local18 + arg3;
				Static29.anInt799 = Static29.anInt799 / local18 + arg4;
				Static29.aBoolean46 = true;
			} else {
				Static29.anInt800 = arg2;
				Static29.anInt798 = arg3;
				Static29.anInt799 = arg4;
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
				if (local26 < this.anIntArrayArray5.length) {
					local228 = this.anIntArrayArray5[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local45]) != 0) {
							this.anIntArray81[local45] += arg2;
							this.anIntArray82[local45] += arg3;
							this.anIntArray84[local45] += arg4;
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
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local45]) != 0) {
								this.anIntArray81[local45] -= Static29.anInt800;
								this.anIntArray82[local45] -= Static29.anInt798;
								this.anIntArray84[local45] -= Static29.anInt799;
								if (arg4 != 0) {
									local53 = Class91.anIntArray319[arg4];
									local343 = Class91.anIntArray320[arg4];
									local365 = this.anIntArray82[local45] * local53 + this.anIntArray81[local45] * local343 + 32767 >> 16;
									this.anIntArray82[local45] = this.anIntArray82[local45] * local343 + 32767 - this.anIntArray81[local45] * local53 >> 16;
									this.anIntArray81[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class91.anIntArray319[arg2];
									local343 = Class91.anIntArray320[arg2];
									local365 = this.anIntArray82[local45] * local343 + 32767 - this.anIntArray84[local45] * local53 >> 16;
									this.anIntArray84[local45] = this.anIntArray82[local45] * local53 + this.anIntArray84[local45] * local343 + 32767 >> 16;
									this.anIntArray82[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class91.anIntArray319[arg3];
									local343 = Class91.anIntArray320[arg3];
									local365 = this.anIntArray84[local45] * local53 + this.anIntArray81[local45] * local343 + 32767 >> 16;
									this.anIntArray84[local45] = this.anIntArray84[local45] * local343 + 32767 - this.anIntArray81[local45] * local53 >> 16;
									this.anIntArray81[local45] = local365;
								}
								this.anIntArray81[local45] += Static29.anInt800;
								this.anIntArray82[local45] += Static29.anInt798;
								this.anIntArray84[local45] += Static29.anInt799;
							}
						}
					}
				}
				if (arg5 && this.aShortArray16 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local45]) != 0) {
									local53 = this.anIntArray80[local45];
									local343 = this.anIntArray80[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray12[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class91.anIntArray319[arg4];
											local434 = Class91.anIntArray320[arg4];
											local440 = this.aShortArray22[local387] * local428 + this.aShortArray16[local387] * local434 + 32767 >> 16;
											this.aShortArray22[local387] = (short) (this.aShortArray22[local387] * local434 + 32767 - this.aShortArray16[local387] * local428 >> 16);
											this.aShortArray16[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class91.anIntArray319[arg2];
											local434 = Class91.anIntArray320[arg2];
											local440 = this.aShortArray22[local387] * local434 + 32767 - this.aShortArray15[local387] * local428 >> 16;
											this.aShortArray15[local387] = (short) (this.aShortArray22[local387] * local428 + this.aShortArray15[local387] * local434 + 32767 >> 16);
											this.aShortArray22[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class91.anIntArray319[arg3];
											local434 = Class91.anIntArray320[arg3];
											local440 = this.aShortArray15[local387] * local428 + this.aShortArray16[local387] * local434 + 32767 >> 16;
											this.aShortArray15[local387] = (short) (this.aShortArray15[local387] * local434 + 32767 - this.aShortArray16[local387] * local428 >> 16);
											this.aShortArray16[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass77_5 != null) {
						this.aClass77_5.aBoolean145 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static29.aBoolean46) {
					local343 = arg7[0] * Static29.anInt800 + arg7[3] * Static29.anInt798 + arg7[6] * Static29.anInt799 + 16384 >> 15;
					local365 = arg7[1] * Static29.anInt800 + arg7[4] * Static29.anInt798 + arg7[7] * Static29.anInt799 + 16384 >> 15;
					local387 = arg7[2] * Static29.anInt800 + arg7[5] * Static29.anInt798 + arg7[8] * Static29.anInt799 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static29.anInt800 = local343;
					Static29.anInt798 = local365;
					Static29.anInt799 = local387;
					Static29.aBoolean46 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class91.anIntArray320[arg2] >> 1;
				local387 = Class91.anIntArray319[arg2] >> 1;
				local428 = Class91.anIntArray320[arg3] >> 1;
				local434 = Class91.anIntArray319[arg3] >> 1;
				local440 = Class91.anIntArray320[arg4] >> 1;
				local446 = Class91.anIntArray319[arg4] >> 1;
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
				@Pc(590) int local590 = local410[0] * -Static29.anInt800 + local410[1] * -Static29.anInt798 + local410[2] * -Static29.anInt799 + 16384 >> 15;
				local615 = local410[3] * -Static29.anInt800 + local410[4] * -Static29.anInt798 + local410[5] * -Static29.anInt799 + 16384 >> 15;
				local640 = local410[6] * -Static29.anInt800 + local410[7] * -Static29.anInt798 + local410[8] * -Static29.anInt799 + 16384 >> 15;
				local644 = local590 + Static29.anInt800;
				@Pc(648) int local648 = local615 + Static29.anInt798;
				local652 = local640 + Static29.anInt799;
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
					if (local929 < this.anIntArrayArray5.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray5[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray81[local949] + local789[1] * this.anIntArray82[local949] + local789[2] * this.anIntArray84[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray81[local949] + local789[4] * this.anIntArray82[local949] + local789[5] * this.anIntArray84[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray81[local949] + local789[7] * this.anIntArray82[local949] + local789[8] * this.anIntArray84[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray81[local949] = local1057;
								this.anIntArray82[local949] = local1061;
								this.anIntArray84[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local45]) != 0) {
								this.anIntArray81[local45] -= Static29.anInt800;
								this.anIntArray82[local45] -= Static29.anInt798;
								this.anIntArray84[local45] -= Static29.anInt799;
								this.anIntArray81[local45] = this.anIntArray81[local45] * arg2 >> 7;
								this.anIntArray82[local45] = this.anIntArray82[local45] * arg3 >> 7;
								this.anIntArray84[local45] = this.anIntArray84[local45] * arg4 >> 7;
								this.anIntArray81[local45] += Static29.anInt800;
								this.anIntArray82[local45] += Static29.anInt798;
								this.anIntArray84[local45] += Static29.anInt799;
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
				if (Static29.aBoolean46) {
					local343 = arg7[0] * Static29.anInt800 + arg7[3] * Static29.anInt798 + arg7[6] * Static29.anInt799 + 16384 >> 15;
					local365 = arg7[1] * Static29.anInt800 + arg7[4] * Static29.anInt798 + arg7[7] * Static29.anInt799 + 16384 >> 15;
					local387 = arg7[2] * Static29.anInt800 + arg7[5] * Static29.anInt798 + arg7[8] * Static29.anInt799 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static29.anInt800 = local343;
					Static29.anInt798 = local365;
					Static29.anInt799 = local387;
					Static29.aBoolean46 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static29.anInt800 + 16384 >> 15;
				local434 = local365 * -Static29.anInt798 + 16384 >> 15;
				local440 = local387 * -Static29.anInt799 + 16384 >> 15;
				local446 = local428 + Static29.anInt800;
				local454 = local434 + Static29.anInt798;
				local462 = local440 + Static29.anInt799;
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
					if (local667 < this.anIntArrayArray5.length) {
						local789 = this.anIntArrayArray5[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray81[local796] + local1930[1] * this.anIntArray82[local796] + local1930[2] * this.anIntArray84[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray81[local796] + local1930[4] * this.anIntArray82[local796] + local1930[5] * this.anIntArray84[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray81[local796] + local1930[7] * this.anIntArray82[local796] + local1930[8] * this.anIntArray84[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray81[local796] = local2198;
								this.anIntArray82[local796] = local2202;
								this.anIntArray84[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray6 != null && this.aByteArray8 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray6.length) {
						local228 = this.anIntArrayArray6[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
								local53 = (this.aByteArray8[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray8[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass77_4.aBoolean145 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray6 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray6.length) {
					local228 = this.anIntArrayArray6[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
							local53 = this.aShortArray13[local45] & 0xFFFF;
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
							this.aShortArray13[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass77_4.aBoolean145 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "()V")
	private void method651() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt795; local17++) {
			@Pc(26) int local26 = this.anIntArray81[local17];
			@Pc(31) int local31 = this.anIntArray82[local17];
			@Pc(36) int local36 = this.anIntArray84[local17];
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
		this.aClass167_1.aShort46 = (short) local1;
		this.aClass167_1.aShort49 = (short) local7;
		this.aClass167_1.aShort48 = (short) local3;
		this.aClass167_1.aShort47 = (short) local9;
		this.aClass167_1.aShort45 = (short) local5;
		this.aClass167_1.aShort44 = (short) local11;
		this.aClass167_1.aShort43 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass167_1.aBoolean320 = true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ag;)Lclient!ag;")
	public Class7_Sub1 method652(@OriginalArg(0) Class7_Sub1 arg0) {
		if (this.anInt797 == 0) {
			return null;
		}
		if (!this.aClass167_1.aBoolean320) {
			this.method651();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static201.anInt4494 > 0) {
			local26 = this.aClass167_1.aShort46 - (this.aClass167_1.aShort47 * Static201.anInt4494 >> 8) >> 3;
			local40 = this.aClass167_1.aShort49 - (this.aClass167_1.aShort48 * Static201.anInt4494 >> 8) >> 3;
		} else {
			local26 = this.aClass167_1.aShort46 - (this.aClass167_1.aShort48 * Static201.anInt4494 >> 8) >> 3;
			local40 = this.aClass167_1.aShort49 - (this.aClass167_1.aShort47 * Static201.anInt4494 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static201.anInt4496 > 0) {
			local85 = this.aClass167_1.aShort45 - (this.aClass167_1.aShort47 * Static201.anInt4496 >> 8) >> 3;
			local99 = this.aClass167_1.aShort44 - (this.aClass167_1.aShort48 * Static201.anInt4496 >> 8) >> 3;
		} else {
			local85 = this.aClass167_1.aShort45 - (this.aClass167_1.aShort48 * Static201.anInt4496 >> 8) >> 3;
			local99 = this.aClass167_1.aShort44 - (this.aClass167_1.aShort47 * Static201.anInt4496 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class7_Sub1 local151;
		if (arg0 == null || arg0.aByteArray1.length < local134 * local140) {
			local151 = new Class7_Sub1(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt5424 = arg0.anInt5432 = local134;
			arg0.anInt5425 = arg0.anInt5433 = local140;
			arg0.method123();
		}
		local151.anInt5429 = local26;
		local151.anInt5426 = local85;
		if (Static29.anIntArray87.length < this.anInt797) {
			Static29.anIntArray87 = new int[this.anInt797];
			Static29.anIntArray86 = new int[this.anInt797];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt795; local194++) {
			@Pc(216) int local216 = (this.anIntArray81[local194] - (this.anIntArray82[local194] * Static201.anInt4494 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray84[local194] - (this.anIntArray82[local194] * Static201.anInt4496 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray80[local194];
			local246 = this.anIntArray80[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray12[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static29.anIntArray87[local258] = local216;
				Static29.anIntArray86[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt796; local194++) {
			if (this.aByteArray8[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray18[local194];
				@Pc(297) short local297 = this.aShortArray11[local194];
				@Pc(302) short local302 = this.aShortArray14[local194];
				local246 = Static29.anIntArray87[local292];
				local248 = Static29.anIntArray87[local297];
				local258 = Static29.anIntArray87[local302];
				@Pc(318) int local318 = Static29.anIntArray86[local292];
				@Pc(322) int local322 = Static29.anIntArray86[local297];
				@Pc(326) int local326 = Static29.anIntArray86[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static151.method2839(local151.aByteArray1, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "()V")
	private void method653() {
		if (Static29.aClass1_Sub16_1.aByteArray39.length < this.anInt796 * 12) {
			Static29.aClass1_Sub16_1 = new Class1_Sub16((this.anInt796 + 100) * 12);
		} else {
			Static29.aClass1_Sub16_1.anInt3328 = 0;
		}
		@Pc(25) int local25;
		if (Static296.aBoolean344) {
			for (local25 = 0; local25 < this.anInt796; local25++) {
				Static29.aClass1_Sub16_1.method2606(this.aShortArray18[local25]);
				Static29.aClass1_Sub16_1.method2606(this.aShortArray11[local25]);
				Static29.aClass1_Sub16_1.method2606(this.aShortArray14[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt796; local25++) {
				Static29.aClass1_Sub16_1.method2656(this.aShortArray18[local25]);
				Static29.aClass1_Sub16_1.method2656(this.aShortArray11[local25]);
				Static29.aClass1_Sub16_1.method2656(this.aShortArray14[local25]);
			}
		}
		if (!Static296.aBoolean347) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static29.aClass1_Sub16_1.anInt3328);
			local115.put(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
			local115.flip();
			this.aClass77_2.aBoolean145 = true;
			this.aClass77_2.aByteBuffer5 = local115;
			this.aClass77_2.aClass141_2 = null;
			return;
		}
		@Pc(88) Class141 local88 = new Class141();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static29.aClass1_Sub16_1.aByteArray39, 0, Static29.aClass1_Sub16_1.anInt3328);
		local88.method4041(local95);
		this.aClass77_2.aBoolean145 = true;
		this.aClass77_2.aByteBuffer5 = null;
		this.aClass77_2.aClass141_2 = local88;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte3 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt797 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass77_4.aBoolean145 && (arg1 || arg2 && !Static10.aBoolean12);
				this.method650(false, !this.aClass77_1.aBoolean145 && arg0, local26, this.aClass77_5 != null && !this.aClass77_5.aBoolean145 && arg2, !this.aClass77_3.aBoolean145);
				if (!this.aClass77_2.aBoolean145 && arg3 && arg1) {
					this.method653();
				}
			}
			if (arg0) {
				if (this.aClass77_1.aBoolean145) {
					if (!this.aClass167_1.aBoolean320) {
						this.method651();
					}
					this.anIntArray81 = null;
					this.anIntArray82 = null;
					this.anIntArray84 = null;
					this.aShortArray12 = null;
					this.anIntArray80 = null;
				} else {
					this.aByte4 = (byte) (this.aByte4 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass77_4.aBoolean145) {
					this.aShortArray13 = null;
					this.aByteArray8 = null;
				} else {
					this.aByte4 = (byte) (this.aByte4 | 0x2);
				}
			}
			if (arg2 && Static10.aBoolean12) {
				if (this.aClass77_5.aBoolean145) {
					this.aShortArray16 = null;
					this.aShortArray22 = null;
					this.aShortArray15 = null;
					this.aShortArray20 = null;
				} else {
					this.aByte4 = (byte) (this.aByte4 | 0x4);
				}
			}
			if (this.aClass77_3.aBoolean145) {
				this.aFloatArray1 = null;
				this.aFloatArray2 = null;
			} else {
				this.aByte4 = (byte) (this.aByte4 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass77_2.aBoolean145 && this.aClass77_4.aBoolean145) {
					this.aShortArray18 = null;
					this.aShortArray11 = null;
					this.aShortArray14 = null;
				} else {
					this.aByte4 = (byte) (this.aByte4 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray83 = null;
				this.aByteArray7 = null;
				this.anIntArrayArray5 = null;
				this.anIntArrayArray6 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!h;IIIZ)V")
	@Override
	public void method4770(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class25_Sub2_Sub1 local2 = (Class25_Sub2_Sub1) arg0;
		if (this.anInt796 == 0 || local2.anInt796 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt795;
		@Pc(15) int[] local15 = local2.anIntArray81;
		@Pc(18) int[] local18 = local2.anIntArray82;
		@Pc(21) int[] local21 = local2.anIntArray84;
		@Pc(24) short[] local24 = local2.aShortArray16;
		@Pc(27) short[] local27 = local2.aShortArray22;
		@Pc(30) short[] local30 = local2.aShortArray15;
		@Pc(33) short[] local33 = local2.aShortArray20;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass6_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass6_1.aShortArray3;
			local44 = this.aClass6_1.aShortArray2;
			local48 = this.aClass6_1.aShortArray4;
			local52 = this.aClass6_1.aShortArray1;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass6_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass6_1.aShortArray3;
			local72 = local2.aClass6_1.aShortArray2;
			local76 = local2.aClass6_1.aShortArray4;
			local80 = local2.aClass6_1.aShortArray1;
		}
		@Pc(92) int[] local92 = local2.anIntArray80;
		@Pc(95) short[] local95 = local2.aShortArray12;
		if (!local2.aClass167_1.aBoolean320) {
			local2.method651();
		}
		@Pc(105) short local105 = local2.aClass167_1.aShort48;
		@Pc(109) short local109 = local2.aClass167_1.aShort47;
		@Pc(113) short local113 = local2.aClass167_1.aShort46;
		@Pc(117) short local117 = local2.aClass167_1.aShort49;
		@Pc(121) short local121 = local2.aClass167_1.aShort45;
		@Pc(125) short local125 = local2.aClass167_1.aShort44;
		for (@Pc(127) int local127 = 0; local127 < this.anInt795; local127++) {
			@Pc(138) int local138 = this.anIntArray82[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray81[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray84[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray80[local127];
						@Pc(187) int local187 = this.anIntArray80[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray12[local189] - 1;
							if (local175 == -1 || this.aShortArray20[local175] != 0) {
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
											this.aClass6_1 = new Class6();
											local40 = this.aClass6_1.aShortArray3 = Static54.method1104(this.aShortArray16);
											local44 = this.aClass6_1.aShortArray2 = Static54.method1104(this.aShortArray22);
											local48 = this.aClass6_1.aShortArray4 = Static54.method1104(this.aShortArray15);
											local52 = this.aClass6_1.aShortArray1 = Static54.method1104(this.aShortArray20);
										}
										if (local68 == null) {
											@Pc(325) Class6 local325 = local2.aClass6_1 = new Class6();
											local68 = local325.aShortArray3 = Static54.method1104(local24);
											local72 = local325.aShortArray2 = Static54.method1104(local27);
											local76 = local325.aShortArray4 = Static54.method1104(local30);
											local80 = local325.aShortArray1 = Static54.method1104(local33);
										}
										@Pc(358) short local358 = this.aShortArray16[local175];
										@Pc(363) short local363 = this.aShortArray22[local175];
										@Pc(368) short local368 = this.aShortArray15[local175];
										@Pc(373) short local373 = this.aShortArray20[local175];
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
										local180 = this.anIntArray80[local127];
										local187 = this.anIntArray80[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray12[local385] - 1;
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
}
