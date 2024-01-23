import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class36_Sub2_Sub1 extends Class36_Sub2 {

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Lclient!wc;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "Lclient!wc;")
	public Class176 aClass176_2;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "Lclient!gj;")
	public Class63 aClass63_1;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "Lclient!l;")
	private Class98 aClass98_5;

	@OriginalMember(owner = "client!pl", name = "S", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!pl", name = "V", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!pl", name = "X", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!pl", name = "Y", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!pl", name = "Z", descriptor = "Lclient!wc;")
	private Class176 aClass176_3;

	@OriginalMember(owner = "client!pl", name = "ab", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!pl", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!pl", name = "cb", descriptor = "Lclient!wc;")
	private Class176 aClass176_4;

	@OriginalMember(owner = "client!pl", name = "db", descriptor = "Lclient!vg;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!pl", name = "fb", descriptor = "Lclient!wc;")
	private Class176 aClass176_5;

	@OriginalMember(owner = "client!pl", name = "gb", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
	private int anInt4258 = 0;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	public int anInt4257 = 0;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
	private int anInt4260 = 0;

	@OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
	private int anInt4259 = 0;

	@OriginalMember(owner = "client!pl", name = "T", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!pl", name = "W", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class36_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!vi;IIZ)V")
	public Class36_Sub2_Sub1(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt5547];
		this.anIntArray323 = new int[arg0.anInt5548 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt5547; local35++) {
			if ((arg0.aByteArray64 == null || arg0.aByteArray64[local35] != 2) && (arg0.aShortArray78 == null || arg0.aShortArray78[local35] == -1 || !Static96.anInterface4_1.method1270(arg0.aShortArray78[local35] & 0xFFFF))) {
				local26[this.anInt4259++] = local35;
				this.anIntArray323[arg0.anIntArray479[local35]]++;
				this.anIntArray323[arg0.anIntArray488[local35]]++;
				this.anIntArray323[arg0.anIntArray477[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt4259];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt4259; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray78 != null) {
				local138 = arg0.aShortArray78[local128];
				if (local138 != -1) {
					local134 = Static96.anInterface4_1.method1265(local138 & 0xFFFF);
					local136 = Static96.anInterface4_1.method1268(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray71 != null && arg0.aByteArray71[local128] != 0 || local138 != -1 && !Static96.anInterface4_1.method1266(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray69 != null) {
				local130 += arg0.aByteArray69[local128] << 17;
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
		Static295.method2911(local26, local118);
		this.anInt4257 = arg0.anInt5548;
		this.anInt4260 = arg0.anInt5545;
		this.anIntArray320 = arg0.anIntArray486;
		this.anIntArray324 = arg0.anIntArray483;
		this.anIntArray321 = arg0.anIntArray482;
		this.anIntArray325 = arg0.anIntArray481;
		this.aShortArray35 = arg0.aShortArray76;
		local120 = this.anInt4259 * 3;
		this.aShortArray43 = new short[local120];
		this.aShortArray41 = new short[local120];
		this.aShortArray45 = new short[local120];
		this.aShortArray38 = new short[local120];
		this.aFloatArray18 = new float[local120];
		this.aFloatArray19 = new float[local120];
		this.aShortArray44 = new short[this.anInt4259];
		this.aByteArray37 = new byte[this.anInt4259];
		this.aShortArray37 = new short[this.anInt4259];
		this.aShortArray46 = new short[this.anInt4259];
		this.aShortArray42 = new short[this.anInt4259];
		this.aShortArray40 = new short[this.anInt4259];
		if (arg0.anIntArray487 != null) {
			this.aByteArray38 = new byte[this.anInt4259];
		}
		if (arg0.aShortArray74 != null) {
			this.aShortArray36 = new short[this.anInt4259];
		}
		this.aClass63_1 = new Class63();
		this.aClass176_2 = new Class176();
		this.aClass176_4 = new Class176();
		if (Static76.aBoolean117) {
			this.aClass176_5 = new Class176();
		}
		this.aClass176_3 = new Class176();
		this.aClass176_1 = new Class176();
		this.aShort19 = (short) arg1;
		this.aShort18 = (short) arg2;
		this.aShortArray39 = new short[local120];
		Static205.aLongArray10 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt4260; local130++) {
			local229 = this.anIntArray323[local130];
			this.anIntArray323[local130] = local128;
			local128 += local229;
		}
		this.anIntArray323[this.anInt4260] = local128;
		@Pc(433) int[] local433 = null;
		@Pc(435) int[] local435 = null;
		@Pc(437) int[] local437 = null;
		@Pc(440) float[][] local440 = null;
		@Pc(560) int local560;
		@Pc(446) int local446;
		@Pc(690) float local690;
		@Pc(721) float local721;
		@Pc(692) float local692;
		if (arg0.aByteArray72 != null) {
			local446 = arg0.anInt5546;
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
			for (local466 = 0; local466 < this.anInt4259; local466++) {
				@Pc(505) int local505 = local26[local466];
				if (arg0.aByteArray72[local505] != -1) {
					@Pc(518) int local518 = arg0.aByteArray72[local505] & 0xFF;
					for (@Pc(520) int local520 = 0; local520 < 3; local520++) {
						@Pc(530) int local530;
						if (local520 == 0) {
							local530 = arg0.anIntArray479[local505];
						} else if (local520 == 1) {
							local530 = arg0.anIntArray488[local505];
						} else {
							local530 = arg0.anIntArray477[local505];
						}
						@Pc(550) int local550 = arg0.anIntArray486[local530];
						@Pc(555) int local555 = arg0.anIntArray483[local530];
						local560 = arg0.anIntArray482[local530];
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
				@Pc(640) byte local640 = arg0.aByteArray67[local466];
				if (local640 > 0) {
					local433[local466] = (local449[local466] + local452[local466]) / 2;
					local435[local466] = (local455[local466] + local458[local466]) / 2;
					local437[local466] = (local461[local466] + local464[local466]) / 2;
					if (local640 == 1) {
						@Pc(686) short local686 = arg0.aShortArray71[local466];
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
						local721 = 64.0F / (float) (arg0.aShortArray80[local466] & 0xFFFF);
					} else if (local640 == 2) {
						local690 = 64.0F / (float) (arg0.aShortArray71[local466] & 0xFFFF);
						local721 = 64.0F / (float) (arg0.aShortArray80[local466] & 0xFFFF);
						local692 = 64.0F / (float) (arg0.aShortArray73[local466] & 0xFFFF);
					} else {
						local690 = (float) arg0.aShortArray71[local466] / 1024.0F;
						local721 = (float) arg0.aShortArray80[local466] / 1024.0F;
						local692 = (float) arg0.aShortArray73[local466] / 1024.0F;
					}
					local440[local466] = Static205.method3242(arg0.aShortArray72[local466], arg0.aShortArray77[local466], arg0.aShortArray79[local466], arg0.aByteArray68[local466] & 0xFF, local690, local721, local692);
				}
			}
		}
		@Pc(824) int local824;
		@Pc(829) short local829;
		for (local446 = 0; local446 < this.anInt4259; local446++) {
			@Pc(817) int local817 = local26[local446];
			local824 = arg0.aShortArray75[local817] & 0xFFFF;
			if (arg0.aShortArray78 == null) {
				local829 = -1;
			} else {
				local829 = arg0.aShortArray78[local817];
			}
			@Pc(840) int local840;
			if (arg0.aByteArray72 == null) {
				local840 = -1;
			} else {
				local840 = arg0.aByteArray72[local817];
			}
			@Pc(851) int local851;
			if (arg0.aByteArray71 == null) {
				local851 = 0;
			} else {
				local851 = arg0.aByteArray71[local817] & 0xFF;
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
					local909 = arg0.aByteArray67[local840];
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
						local916 = arg0.anIntArray479[local817];
						local921 = arg0.anIntArray488[local817];
						local926 = arg0.anIntArray477[local817];
						@Pc(931) short local931 = arg0.aShortArray72[local840];
						@Pc(936) short local936 = arg0.aShortArray77[local840];
						@Pc(941) short local941 = arg0.aShortArray79[local840];
						@Pc(947) float local947 = (float) arg0.anIntArray486[local931];
						@Pc(953) float local953 = (float) arg0.anIntArray483[local931];
						local959 = arg0.anIntArray482[local931];
						local967 = (float) arg0.anIntArray486[local936] - local947;
						local975 = (float) arg0.anIntArray483[local936] - local953;
						@Pc(983) float local983 = (float) arg0.anIntArray482[local936] - local959;
						@Pc(991) float local991 = (float) arg0.anIntArray486[local941] - local947;
						@Pc(999) float local999 = (float) arg0.anIntArray483[local941] - local953;
						@Pc(1007) float local1007 = (float) arg0.anIntArray482[local941] - local959;
						@Pc(1015) float local1015 = (float) arg0.anIntArray486[local916] - local947;
						@Pc(1023) float local1023 = (float) arg0.anIntArray483[local916] - local953;
						@Pc(1031) float local1031 = (float) arg0.anIntArray482[local916] - local959;
						@Pc(1039) float local1039 = (float) arg0.anIntArray486[local921] - local947;
						@Pc(1047) float local1047 = (float) arg0.anIntArray483[local921] - local953;
						local1055 = (float) arg0.anIntArray482[local921] - local959;
						local1063 = (float) arg0.anIntArray486[local926] - local947;
						local1071 = (float) arg0.anIntArray483[local926] - local953;
						local1079 = (float) arg0.anIntArray482[local926] - local959;
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
						local916 = arg0.anIntArray479[local817];
						local921 = arg0.anIntArray488[local817];
						local926 = arg0.anIntArray477[local817];
						@Pc(1283) int local1283 = local433[local840];
						local1287 = local435[local840];
						@Pc(1291) int local1291 = local437[local840];
						@Pc(1295) float[] local1295 = local440[local840];
						@Pc(1300) byte local1300 = arg0.aByteArray65[local840];
						local959 = (float) arg0.aByteArray70[local840] / 256.0F;
						if (local909 == 1) {
							local967 = (float) (arg0.aShortArray73[local840] & 0xFFFF) / 1024.0F;
							Static205.method3259(arg0.anIntArray486[local916], arg0.anIntArray483[local916], arg0.anIntArray482[local916], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local861 = Static205.aFloat39;
							local863 = Static205.aFloat43;
							Static205.method3259(arg0.anIntArray486[local921], arg0.anIntArray483[local921], arg0.anIntArray482[local921], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local865 = Static205.aFloat39;
							local690 = Static205.aFloat43;
							Static205.method3259(arg0.anIntArray486[local926], arg0.anIntArray483[local926], arg0.anIntArray482[local926], local1283, local1287, local1291, local1295, local967, local1300, local959);
							local721 = Static205.aFloat39;
							local692 = Static205.aFloat43;
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
							local967 = (float) arg0.aByteArray73[local840] / 256.0F;
							local975 = (float) arg0.aByteArray66[local840] / 256.0F;
							@Pc(1532) int local1532 = arg0.anIntArray486[local921] - arg0.anIntArray486[local916];
							@Pc(1542) int local1542 = arg0.anIntArray483[local921] - arg0.anIntArray483[local916];
							@Pc(1552) int local1552 = arg0.anIntArray482[local921] - arg0.anIntArray482[local916];
							@Pc(1562) int local1562 = arg0.anIntArray486[local926] - arg0.anIntArray486[local916];
							@Pc(1572) int local1572 = arg0.anIntArray483[local926] - arg0.anIntArray483[local916];
							@Pc(1582) int local1582 = arg0.anIntArray482[local926] - arg0.anIntArray482[local916];
							@Pc(1590) int local1590 = local1542 * local1582 - local1572 * local1552;
							@Pc(1598) int local1598 = local1552 * local1562 - local1582 * local1532;
							@Pc(1606) int local1606 = local1532 * local1572 - local1562 * local1542;
							local1055 = 64.0F / (float) (arg0.aShortArray71[local840] & 0xFFFF);
							local1063 = 64.0F / (float) (arg0.aShortArray80[local840] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray73[local840] & 0xFFFF);
							local1079 = ((float) local1590 * local1295[0] + (float) local1598 * local1295[1] + (float) local1606 * local1295[2]) / local1055;
							local1087 = ((float) local1590 * local1295[3] + (float) local1598 * local1295[4] + (float) local1606 * local1295[5]) / local1063;
							local1095 = ((float) local1590 * local1295[6] + (float) local1598 * local1295[7] + (float) local1606 * local1295[8]) / local1071;
							local560 = Static205.method3266(local1079, local1087, local1095);
							Static205.method3261(arg0.anIntArray486[local916], arg0.anIntArray483[local916], arg0.anIntArray482[local916], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local861 = Static205.aFloat38;
							local863 = Static205.aFloat42;
							Static205.method3261(arg0.anIntArray486[local921], arg0.anIntArray483[local921], arg0.anIntArray482[local921], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local865 = Static205.aFloat38;
							local690 = Static205.aFloat42;
							Static205.method3261(arg0.anIntArray486[local926], arg0.anIntArray483[local926], arg0.anIntArray482[local926], local1283, local1287, local1291, local560, local1295, local1300, local959, local967, local975);
							local721 = Static205.aFloat38;
							local692 = Static205.aFloat42;
						} else if (local909 == 3) {
							Static205.method3237(arg0.anIntArray486[local916], arg0.anIntArray483[local916], arg0.anIntArray482[local916], local1283, local1287, local1291, local1295, local1300, local959);
							local861 = Static205.aFloat40;
							local863 = Static205.aFloat41;
							Static205.method3237(arg0.anIntArray486[local921], arg0.anIntArray483[local921], arg0.anIntArray482[local921], local1283, local1287, local1291, local1295, local1300, local959);
							local865 = Static205.aFloat40;
							local690 = Static205.aFloat41;
							Static205.method3237(arg0.anIntArray486[local926], arg0.anIntArray483[local926], arg0.anIntArray482[local926], local1283, local1287, local1291, local1295, local1300, local959);
							local721 = Static205.aFloat40;
							local692 = Static205.aFloat41;
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
			arg0.method4207();
			if (arg0.aByteArray64 == null) {
				local909 = 0;
			} else {
				local909 = arg0.aByteArray64[local817];
			}
			if (local909 == 0) {
				@Pc(2001) long local2001 = (long) (local840 << 2) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				local926 = arg0.anIntArray479[local817];
				@Pc(2011) Class137 local2011 = arg0.aClass137Array2[local926];
				this.aShortArray37[local446] = this.method3249(arg0, local926, local2001, local2011.anInt4382, local2011.anInt4384, local2011.anInt4385, local2011.anInt4383, local861, local863);
				local1287 = arg0.anIntArray488[local817];
				@Pc(2040) Class137 local2040 = arg0.aClass137Array2[local1287];
				this.aShortArray46[local446] = this.method3249(arg0, local1287, local2001 + (long) local873, local2040.anInt4382, local2040.anInt4384, local2040.anInt4385, local2040.anInt4383, local865, local690);
				@Pc(2067) int local2067 = arg0.anIntArray477[local817];
				@Pc(2072) Class137 local2072 = arg0.aClass137Array2[local2067];
				this.aShortArray42[local446] = this.method3249(arg0, local2067, local2001 + (long) local875, local2072.anInt4382, local2072.anInt4384, local2072.anInt4385, local2072.anInt4383, local721, local692);
			} else if (local909 == 1) {
				@Pc(2103) Class180 local2103 = arg0.aClass180Array1[local817];
				@Pc(2144) long local2144 = (long) ((local840 << 2) + (local2103.anInt5702 > 0 ? 1024 : 2048) + (local2103.anInt5703 + 256 << 12) + (local2103.anInt5698 + 256 << 22)) + ((long) (local560 << 24) + (long) (local824 << 8) + (long) local851 << 32);
				this.aShortArray37[local446] = this.method3249(arg0, arg0.anIntArray479[local817], local2144, local2103.anInt5702, local2103.anInt5703, local2103.anInt5698, 0, local861, local863);
				this.aShortArray46[local446] = this.method3249(arg0, arg0.anIntArray488[local817], local2144 + (long) local873, local2103.anInt5702, local2103.anInt5703, local2103.anInt5698, 0, local865, local690);
				this.aShortArray42[local446] = this.method3249(arg0, arg0.anIntArray477[local817], local2144 + (long) local875, local2103.anInt5702, local2103.anInt5703, local2103.anInt5698, 0, local721, local692);
			}
			if (arg0.aShortArray78 == null) {
				this.aShortArray40[local446] = -1;
			} else {
				this.aShortArray40[local446] = arg0.aShortArray78[local817];
			}
			if (this.aByteArray38 != null) {
				this.aByteArray38[local446] = (byte) arg0.anIntArray487[local817];
			}
			this.aShortArray44[local446] = arg0.aShortArray75[local817];
			if (arg0.aByteArray71 != null) {
				this.aByteArray37[local446] = arg0.aByteArray71[local817];
			}
			if (arg0.aShortArray74 != null) {
				this.aShortArray36[local446] = arg0.aShortArray74[local817];
			}
		}
		local446 = 0;
		@Pc(2278) short local2278 = -10000;
		for (local824 = 0; local824 < this.anInt4259; local824++) {
			local829 = this.aShortArray40[local824];
			if (local829 != local2278) {
				local446++;
				local2278 = local829;
			}
		}
		this.anIntArray322 = new int[local446 + 1];
		local446 = 0;
		local2278 = -10000;
		for (local824 = 0; local824 < this.anInt4259; local824++) {
			local829 = this.aShortArray40[local824];
			if (local829 != local2278) {
				this.anIntArray322[local446++] = local824;
				local2278 = local829;
			}
		}
		this.anIntArray322[local446] = this.anInt4259;
		Static205.aLongArray10 = null;
		this.aShortArray43 = Static205.method3239(this.aShortArray43, this.anInt4258);
		this.aShortArray41 = Static205.method3239(this.aShortArray41, this.anInt4258);
		this.aShortArray45 = Static205.method3239(this.aShortArray45, this.anInt4258);
		this.aShortArray38 = Static205.method3239(this.aShortArray38, this.anInt4258);
		this.aFloatArray18 = Static205.method3241(this.aFloatArray18, this.anInt4258);
		this.aFloatArray19 = Static205.method3241(this.aFloatArray19, this.anInt4258);
	}

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "()I")
	@Override
	public int method3951() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort13;
	}

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "()V")
	public void method3234() {
		if (this.aShortArray43 == null) {
			this.method3940();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4257; local7++) {
			@Pc(16) int local16 = this.anIntArray321[local7];
			this.anIntArray321[local7] = this.anIntArray320[local7];
			this.anIntArray320[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt4258; local7++) {
			@Pc(43) short local43 = this.aShortArray45[local7];
			this.aShortArray45[local7] = this.aShortArray43[local7];
			this.aShortArray43[local7] = (short) -local43;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!wk;)Lclient!wk;")
	public Class43_Sub2 method3235(@OriginalArg(0) Class43_Sub2 arg0) {
		if (this.anInt4258 == 0) {
			return null;
		}
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static233.anInt4706 > 0) {
			local26 = this.aClass63_1.aShort8 - (this.aClass63_1.aShort7 * Static233.anInt4706 >> 8) >> 3;
			local40 = this.aClass63_1.aShort11 - (this.aClass63_1.aShort10 * Static233.anInt4706 >> 8) >> 3;
		} else {
			local26 = this.aClass63_1.aShort8 - (this.aClass63_1.aShort10 * Static233.anInt4706 >> 8) >> 3;
			local40 = this.aClass63_1.aShort11 - (this.aClass63_1.aShort7 * Static233.anInt4706 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static233.anInt4707 > 0) {
			local85 = this.aClass63_1.aShort9 - (this.aClass63_1.aShort7 * Static233.anInt4707 >> 8) >> 3;
			local99 = this.aClass63_1.aShort13 - (this.aClass63_1.aShort10 * Static233.anInt4707 >> 8) >> 3;
		} else {
			local85 = this.aClass63_1.aShort9 - (this.aClass63_1.aShort10 * Static233.anInt4707 >> 8) >> 3;
			local99 = this.aClass63_1.aShort13 - (this.aClass63_1.aShort7 * Static233.anInt4707 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class43_Sub2 local151;
		if (arg0 == null || arg0.aByteArray77.length < local134 * local140) {
			local151 = new Class43_Sub2(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt5711 = arg0.anInt5710 = local134;
			arg0.anInt5713 = arg0.anInt5709 = local140;
			arg0.method4309();
		}
		local151.anInt5708 = local26;
		local151.anInt5712 = local85;
		if (Static205.anIntArray326.length < this.anInt4258) {
			Static205.anIntArray326 = new int[this.anInt4258];
			Static205.anIntArray327 = new int[this.anInt4258];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt4260; local194++) {
			@Pc(216) int local216 = (this.anIntArray320[local194] - (this.anIntArray324[local194] * Static233.anInt4706 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray321[local194] - (this.anIntArray324[local194] * Static233.anInt4707 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray323[local194];
			local246 = this.anIntArray323[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray39[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static205.anIntArray326[local258] = local216;
				Static205.anIntArray327[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt4259; local194++) {
			if (this.aByteArray37[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray37[local194];
				@Pc(297) short local297 = this.aShortArray46[local194];
				@Pc(302) short local302 = this.aShortArray42[local194];
				local246 = Static205.anIntArray326[local292];
				local248 = Static205.anIntArray326[local297];
				local258 = Static205.anIntArray326[local302];
				@Pc(318) int local318 = Static205.anIntArray327[local292];
				@Pc(322) int local322 = Static205.anIntArray327[local297];
				@Pc(326) int local326 = Static205.anIntArray327[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static96.method1529(local151.aByteArray77, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "()I")
	public int method3238() {
		return this.aShort18;
	}

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "()V")
	@Override
	public void method3942() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			this.anIntArray320[local1] = -this.anIntArray320[local1];
			this.anIntArray321[local1] = -this.anIntArray321[local1];
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	@Override
	public void method3965(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4257; local9++) {
			@Pc(29) int local29 = this.anIntArray321[local9] * local3 + this.anIntArray320[local9] * local7 >> 16;
			this.anIntArray321[local9] = this.anIntArray321[local9] * local7 - this.anIntArray320[local9] * local3 >> 16;
			this.anIntArray320[local9] = local29;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4257; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local7 - this.anIntArray321[local9] * local3 >> 16;
			this.anIntArray321[local9] = this.anIntArray324[local9] * local3 + this.anIntArray321[local9] * local7 >> 16;
			this.anIntArray324[local9] = local29;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "()V")
	private void method3240() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (this.anInt4259 == 0) {
			return;
		}
		if (this.aByte12 != 0) {
			this.method3256(true, !this.aClass176_2.aBoolean476 && (this.aByte12 & 0x1) != 0, !this.aClass176_4.aBoolean476 && (this.aByte12 & 0x2) != 0, this.aClass176_5 != null && !this.aClass176_5.aBoolean476 && (this.aByte12 & 0x4) != 0, false);
		}
		this.method3256(false, !this.aClass176_2.aBoolean476, !this.aClass176_4.aBoolean476, this.aClass176_5 != null && !this.aClass176_5.aBoolean476, !this.aClass176_3.aBoolean476);
		if (!this.aClass176_1.aBoolean476) {
			this.method3254();
		}
		if (this.aByte11 != 0) {
			if ((this.aByte11 & 0x1) != 0) {
				this.anIntArray320 = null;
				this.anIntArray324 = null;
				this.anIntArray321 = null;
				this.aShortArray39 = null;
				this.anIntArray323 = null;
			}
			if ((this.aByte11 & 0x2) != 0) {
				this.aShortArray44 = null;
				this.aByteArray37 = null;
			}
			if ((this.aByte11 & 0x4) != 0) {
				this.aShortArray43 = null;
				this.aShortArray41 = null;
				this.aShortArray45 = null;
				this.aShortArray38 = null;
			}
			if ((this.aByte11 & 0x8) != 0) {
				this.aFloatArray18 = null;
				this.aFloatArray19 = null;
			}
			if ((this.aByte11 & 0x10) != 0) {
				this.aShortArray37 = null;
				this.aShortArray46 = null;
				this.aShortArray42 = null;
			}
			this.aByte11 = 0;
		}
		@Pc(172) Class98 local172 = null;
		if (this.aClass176_2.aClass98_7 != null) {
			this.aClass176_2.aClass98_7.method2260();
			local172 = this.aClass176_2.aClass98_7;
			local1.glVertexPointer(3, 5126, this.aClass176_2.anInt5653, (long) this.aClass176_2.anInt5655);
		}
		if (this.aClass176_4.aClass98_7 != null) {
			if (local172 != this.aClass176_4.aClass98_7) {
				this.aClass176_4.aClass98_7.method2260();
				local172 = this.aClass176_4.aClass98_7;
			}
			local1.glColorPointer(4, 5121, this.aClass176_4.anInt5653, (long) this.aClass176_4.anInt5655);
		}
		if (Static76.aBoolean117 && this.aClass176_5.aClass98_7 != null) {
			if (local172 != this.aClass176_5.aClass98_7) {
				this.aClass176_5.aClass98_7.method2260();
				local172 = this.aClass176_5.aClass98_7;
			}
			local1.glNormalPointer(5126, this.aClass176_5.anInt5653, (long) this.aClass176_5.anInt5655);
		}
		if (this.aClass176_3.aClass98_7 != null) {
			if (local172 != this.aClass176_3.aClass98_7) {
				this.aClass176_3.aClass98_7.method2260();
				local172 = this.aClass176_3.aClass98_7;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass176_3.anInt5653, (long) this.aClass176_3.anInt5655);
		}
		if (this.aClass176_1.aClass98_7 != null) {
			this.aClass176_1.aClass98_7.method2261();
		}
		if (this.aClass176_2.aClass98_7 == null || this.aClass176_4.aClass98_7 == null || Static76.aBoolean117 && this.aClass176_5.aClass98_7 == null || this.aClass176_3.aClass98_7 == null) {
			if (Static116.aBoolean195) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass176_2.aClass98_7 == null) {
				this.aClass176_2.aByteBuffer14.position(this.aClass176_2.anInt5655);
				local1.glVertexPointer(3, 5126, this.aClass176_2.anInt5653, this.aClass176_2.aByteBuffer14);
			}
			if (this.aClass176_4.aClass98_7 == null) {
				this.aClass176_4.aByteBuffer14.position(this.aClass176_4.anInt5655);
				local1.glColorPointer(4, 5121, this.aClass176_4.anInt5653, this.aClass176_4.aByteBuffer14);
			}
			if (Static76.aBoolean117 && this.aClass176_5.aClass98_7 == null) {
				this.aClass176_5.aByteBuffer14.position(this.aClass176_5.anInt5655);
				local1.glNormalPointer(5126, this.aClass176_5.anInt5653, this.aClass176_5.aByteBuffer14);
			}
			if (this.aClass176_3.aClass98_7 == null) {
				this.aClass176_3.aByteBuffer14.position(this.aClass176_3.anInt5655);
				local1.glTexCoordPointer(2, 5126, this.aClass176_3.anInt5653, this.aClass176_3.aByteBuffer14);
			}
		}
		if (this.aClass176_1.aClass98_7 == null && Static116.aBoolean195) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray322.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray322[local419];
			@Pc(434) int local434 = this.anIntArray322[local419 + 1];
			@Pc(439) short local439 = this.aShortArray40[local427];
			if (local439 == -1) {
				Static116.method1897(-1);
				Static108.method1772(0, 0);
			} else {
				Static96.anInterface4_1.method1267(local439 & 0xFFFF);
			}
			if (this.aClass176_1.aClass98_7 == null) {
				this.aClass176_1.aByteBuffer14.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass176_1.aByteBuffer14);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "()V")
	@Override
	public void method3941() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			@Pc(10) int local10 = this.anIntArray320[local1];
			this.anIntArray320[local1] = this.anIntArray321[local1];
			this.anIntArray321[local1] = -local10;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)V")
	@Override
	public void method3950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			this.anIntArray320[local1] += arg0;
			this.anIntArray324[local1] += arg1;
			this.anIntArray321[local1] += arg2;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static205.anInt4262 = 0;
			Static205.anInt4261 = 0;
			Static205.anInt4263 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray24.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray24[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local53]) != 0) {
							Static205.anInt4262 += this.anIntArray320[local53];
							Static205.anInt4261 += this.anIntArray324[local53];
							Static205.anInt4263 += this.anIntArray321[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static205.anInt4262 = Static205.anInt4262 / local18 + arg2;
				Static205.anInt4261 = Static205.anInt4261 / local18 + arg3;
				Static205.anInt4263 = Static205.anInt4263 / local18 + arg4;
				Static205.aBoolean346 = true;
			} else {
				Static205.anInt4262 = arg2;
				Static205.anInt4261 = arg3;
				Static205.anInt4263 = arg4;
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
				if (local26 < this.anIntArrayArray24.length) {
					local228 = this.anIntArrayArray24[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local45]) != 0) {
							this.anIntArray320[local45] += arg2;
							this.anIntArray324[local45] += arg3;
							this.anIntArray321[local45] += arg4;
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
					if (local26 < this.anIntArrayArray24.length) {
						local228 = this.anIntArrayArray24[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local45]) != 0) {
								this.anIntArray320[local45] -= Static205.anInt4262;
								this.anIntArray324[local45] -= Static205.anInt4261;
								this.anIntArray321[local45] -= Static205.anInt4263;
								if (arg4 != 0) {
									local53 = Class68.anIntArray137[arg4];
									local343 = Class68.anIntArray139[arg4];
									local365 = this.anIntArray324[local45] * local53 + this.anIntArray320[local45] * local343 + 32767 >> 16;
									this.anIntArray324[local45] = this.anIntArray324[local45] * local343 + 32767 - this.anIntArray320[local45] * local53 >> 16;
									this.anIntArray320[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class68.anIntArray137[arg2];
									local343 = Class68.anIntArray139[arg2];
									local365 = this.anIntArray324[local45] * local343 + 32767 - this.anIntArray321[local45] * local53 >> 16;
									this.anIntArray321[local45] = this.anIntArray324[local45] * local53 + this.anIntArray321[local45] * local343 + 32767 >> 16;
									this.anIntArray324[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class68.anIntArray137[arg3];
									local343 = Class68.anIntArray139[arg3];
									local365 = this.anIntArray321[local45] * local53 + this.anIntArray320[local45] * local343 + 32767 >> 16;
									this.anIntArray321[local45] = this.anIntArray321[local45] * local343 + 32767 - this.anIntArray320[local45] * local53 >> 16;
									this.anIntArray320[local45] = local365;
								}
								this.anIntArray320[local45] += Static205.anInt4262;
								this.anIntArray324[local45] += Static205.anInt4261;
								this.anIntArray321[local45] += Static205.anInt4263;
							}
						}
					}
				}
				if (arg5 && this.aShortArray43 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray24.length) {
							local228 = this.anIntArrayArray24[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local45]) != 0) {
									local53 = this.anIntArray323[local45];
									local343 = this.anIntArray323[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray39[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class68.anIntArray137[arg4];
											local434 = Class68.anIntArray139[arg4];
											local440 = this.aShortArray41[local387] * local428 + this.aShortArray43[local387] * local434 + 32767 >> 16;
											this.aShortArray41[local387] = (short) (this.aShortArray41[local387] * local434 + 32767 - this.aShortArray43[local387] * local428 >> 16);
											this.aShortArray43[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class68.anIntArray137[arg2];
											local434 = Class68.anIntArray139[arg2];
											local440 = this.aShortArray41[local387] * local434 + 32767 - this.aShortArray45[local387] * local428 >> 16;
											this.aShortArray45[local387] = (short) (this.aShortArray41[local387] * local428 + this.aShortArray45[local387] * local434 + 32767 >> 16);
											this.aShortArray41[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class68.anIntArray137[arg3];
											local434 = Class68.anIntArray139[arg3];
											local440 = this.aShortArray45[local387] * local428 + this.aShortArray43[local387] * local434 + 32767 >> 16;
											this.aShortArray45[local387] = (short) (this.aShortArray45[local387] * local434 + 32767 - this.aShortArray43[local387] * local428 >> 16);
											this.aShortArray43[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass176_5 != null) {
						this.aClass176_5.aBoolean476 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static205.aBoolean346) {
					local343 = arg7[0] * Static205.anInt4262 + arg7[3] * Static205.anInt4261 + arg7[6] * Static205.anInt4263 + 16384 >> 15;
					local365 = arg7[1] * Static205.anInt4262 + arg7[4] * Static205.anInt4261 + arg7[7] * Static205.anInt4263 + 16384 >> 15;
					local387 = arg7[2] * Static205.anInt4262 + arg7[5] * Static205.anInt4261 + arg7[8] * Static205.anInt4263 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static205.anInt4262 = local343;
					Static205.anInt4261 = local365;
					Static205.anInt4263 = local387;
					Static205.aBoolean346 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class68.anIntArray139[arg2] >> 1;
				local387 = Class68.anIntArray137[arg2] >> 1;
				local428 = Class68.anIntArray139[arg3] >> 1;
				local434 = Class68.anIntArray137[arg3] >> 1;
				local440 = Class68.anIntArray139[arg4] >> 1;
				local446 = Class68.anIntArray137[arg4] >> 1;
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
				@Pc(590) int local590 = local410[0] * -Static205.anInt4262 + local410[1] * -Static205.anInt4261 + local410[2] * -Static205.anInt4263 + 16384 >> 15;
				local615 = local410[3] * -Static205.anInt4262 + local410[4] * -Static205.anInt4261 + local410[5] * -Static205.anInt4263 + 16384 >> 15;
				local640 = local410[6] * -Static205.anInt4262 + local410[7] * -Static205.anInt4261 + local410[8] * -Static205.anInt4263 + 16384 >> 15;
				local644 = local590 + Static205.anInt4262;
				@Pc(648) int local648 = local615 + Static205.anInt4261;
				local652 = local640 + Static205.anInt4263;
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
					if (local929 < this.anIntArrayArray24.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray24[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray320[local949] + local789[1] * this.anIntArray324[local949] + local789[2] * this.anIntArray321[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray320[local949] + local789[4] * this.anIntArray324[local949] + local789[5] * this.anIntArray321[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray320[local949] + local789[7] * this.anIntArray324[local949] + local789[8] * this.anIntArray321[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray320[local949] = local1057;
								this.anIntArray324[local949] = local1061;
								this.anIntArray321[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray24.length) {
						local228 = this.anIntArrayArray24[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local45]) != 0) {
								this.anIntArray320[local45] -= Static205.anInt4262;
								this.anIntArray324[local45] -= Static205.anInt4261;
								this.anIntArray321[local45] -= Static205.anInt4263;
								this.anIntArray320[local45] = this.anIntArray320[local45] * arg2 >> 7;
								this.anIntArray324[local45] = this.anIntArray324[local45] * arg3 >> 7;
								this.anIntArray321[local45] = this.anIntArray321[local45] * arg4 >> 7;
								this.anIntArray320[local45] += Static205.anInt4262;
								this.anIntArray324[local45] += Static205.anInt4261;
								this.anIntArray321[local45] += Static205.anInt4263;
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
				if (Static205.aBoolean346) {
					local343 = arg7[0] * Static205.anInt4262 + arg7[3] * Static205.anInt4261 + arg7[6] * Static205.anInt4263 + 16384 >> 15;
					local365 = arg7[1] * Static205.anInt4262 + arg7[4] * Static205.anInt4261 + arg7[7] * Static205.anInt4263 + 16384 >> 15;
					local387 = arg7[2] * Static205.anInt4262 + arg7[5] * Static205.anInt4261 + arg7[8] * Static205.anInt4263 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static205.anInt4262 = local343;
					Static205.anInt4261 = local365;
					Static205.anInt4263 = local387;
					Static205.aBoolean346 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static205.anInt4262 + 16384 >> 15;
				local434 = local365 * -Static205.anInt4261 + 16384 >> 15;
				local440 = local387 * -Static205.anInt4263 + 16384 >> 15;
				local446 = local428 + Static205.anInt4262;
				local454 = local434 + Static205.anInt4261;
				local462 = local440 + Static205.anInt4263;
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
					if (local667 < this.anIntArrayArray24.length) {
						local789 = this.anIntArrayArray24[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray35 == null || (arg6 & this.aShortArray35[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray320[local796] + local1930[1] * this.anIntArray324[local796] + local1930[2] * this.anIntArray321[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray320[local796] + local1930[4] * this.anIntArray324[local796] + local1930[5] * this.anIntArray321[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray320[local796] + local1930[7] * this.anIntArray324[local796] + local1930[8] * this.anIntArray321[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray320[local796] = local2198;
								this.anIntArray324[local796] = local2202;
								this.anIntArray321[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray25 != null && this.aByteArray37 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray25.length) {
						local228 = this.anIntArrayArray25[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray36 == null || (arg6 & this.aShortArray36[local45]) != 0) {
								local53 = (this.aByteArray37[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray37[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass176_4.aBoolean476 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray25 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray25.length) {
					local228 = this.anIntArrayArray25[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray36 == null || (arg6 & this.aShortArray36[local45]) != 0) {
							local53 = this.aShortArray44[local45] & 0xFFFF;
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
							this.aShortArray44[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass176_4.aBoolean476 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort10;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(SS)V")
	public void method3243(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4259; local1++) {
			if (this.aShortArray40[local1] == arg0) {
				this.aShortArray40[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static96.anInterface4_1.method1258(arg0 & 0xFFFF);
			local22 = Static96.anInterface4_1.method1261(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static96.anInterface4_1.method1258(arg1 & 0xFFFF);
			local43 = Static96.anInterface4_1.method1261(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass176_4.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Lclient!eh;")
	@Override
	public Class36 method4178() {
		this.aBoolean345 = false;
		if (this.aClass171_1 != null) {
			this.aShortArray43 = this.aClass171_1.aShortArray67;
			this.aShortArray41 = this.aClass171_1.aShortArray69;
			this.aShortArray45 = this.aClass171_1.aShortArray70;
			this.aShortArray38 = this.aClass171_1.aShortArray68;
			this.aClass171_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "()I")
	@Override
	public int method3939() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public void method3938(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class68.anIntArray137[arg0];
		@Pc(7) int local7 = Class68.anIntArray139[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4257; local9++) {
			@Pc(29) int local29 = this.anIntArray324[local9] * local3 + this.anIntArray320[local9] * local7 >> 16;
			this.anIntArray324[local9] = this.anIntArray324[local9] * local7 - this.anIntArray320[local9] * local3 >> 16;
			this.anIntArray320[local9] = local29;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "()V")
	private void method3244() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4260; local17++) {
			@Pc(26) int local26 = this.anIntArray320[local17];
			@Pc(31) int local31 = this.anIntArray324[local17];
			@Pc(36) int local36 = this.anIntArray321[local17];
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
		this.aClass63_1.aShort8 = (short) local1;
		this.aClass63_1.aShort11 = (short) local7;
		this.aClass63_1.aShort10 = (short) local3;
		this.aClass63_1.aShort7 = (short) local9;
		this.aClass63_1.aShort9 = (short) local5;
		this.aClass63_1.aShort13 = (short) local11;
		this.aClass63_1.aShort12 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass63_1.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	public void method3245() {
		if (this.aShortArray43 == null) {
			this.method3965(256);
			return;
		}
		@Pc(10) int local10 = Class68.anIntArray137[256];
		@Pc(14) int local14 = Class68.anIntArray139[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt4257; local16++) {
			local36 = this.anIntArray321[local16] * local10 + this.anIntArray320[local16] * local14 >> 16;
			this.anIntArray321[local16] = this.anIntArray321[local16] * local14 - this.anIntArray320[local16] * local10 >> 16;
			this.anIntArray320[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt4258; local16++) {
			local36 = this.aShortArray45[local16] * local10 + this.aShortArray43[local16] * local14 >> 16;
			this.aShortArray45[local16] = (short) (this.aShortArray45[local16] * local14 - this.aShortArray43[local16] * local10 >> 16);
			this.aShortArray43[local16] = (short) local36;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()Z")
	@Override
	public boolean method4174() {
		return this.aBoolean345 && this.anIntArray320 != null && this.aShortArray43 != null;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3957(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3263(arg0, arg1, arg2, Static205.aClass36_Sub2_Sub1_4, Static205.aClass36_Sub2_Sub1_3);
	}

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "()I")
	@Override
	public int method3964() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort9;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3962(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3263(arg0, arg1, arg2, Static205.aClass36_Sub2_Sub1_6, Static205.aClass36_Sub2_Sub1_5);
	}

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "()I")
	@Override
	public int method3946() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort12;
	}

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "()V")
	public void method3246() {
		if (this.aShortArray43 == null) {
			this.method3942();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4257; local7++) {
			this.anIntArray320[local7] = -this.anIntArray320[local7];
			this.anIntArray321[local7] = -this.anIntArray321[local7];
		}
		for (local7 = 0; local7 < this.anInt4258; local7++) {
			this.aShortArray43[local7] = (short) -this.aShortArray43[local7];
			this.aShortArray45[local7] = (short) -this.aShortArray45[local7];
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILclient!pl;[[I[[IIII)V")
	public void method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36_Sub2_Sub1 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass63_1.aBoolean137) {
			arg2.method3244();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass63_1.aShort8;
		@Pc(17) int local17 = arg5 + arg2.aClass63_1.aShort11;
		@Pc(23) int local23 = arg7 + arg2.aClass63_1.aShort9;
		@Pc(29) int local29 = arg7 + arg2.aClass63_1.aShort13;
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
			for (local150 = 0; local150 < this.anInt4260; local150++) {
				local161 = this.anIntArray320[local150] + arg5;
				local168 = this.anIntArray321[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray324[local150] = this.anIntArray324[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass63_1.aShort10;
				for (local161 = 0; local161 < this.anInt4260; local161++) {
					local168 = (this.anIntArray324[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray320[local161] + arg5;
						local176 = this.anIntArray321[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray324[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method3955(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass63_1.aShort7 - arg2.aClass63_1.aShort10;
				for (local161 = 0; local161 < this.anInt4260; local161++) {
					local168 = this.anIntArray320[local161] + arg5;
					local172 = this.anIntArray321[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray324[local161] = this.anIntArray324[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass63_1.aShort7 - arg2.aClass63_1.aShort10;
				for (local161 = 0; local161 < this.anInt4260; local161++) {
					local168 = this.anIntArray320[local161] + arg5;
					local172 = this.anIntArray321[local161] + arg7;
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
					this.anIntArray324[local161] = ((this.anIntArray324[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass176_2.aBoolean476 = false;
		this.aClass63_1.aBoolean137 = false;
	}

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "()I")
	@Override
	public int method3947() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort11;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	public void method3248(@OriginalArg(0) int arg0) {
		this.aShort19 = (short) arg0;
		this.aClass176_4.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!vi;IJIIIIFF)S")
	private short method3249(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray323[arg1];
		@Pc(11) int local11 = this.anIntArray323[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray39[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static205.aLongArray10[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray39[local13] = (short) (this.anInt4258 + 1);
		Static205.aLongArray10[local13] = arg2;
		this.aShortArray43[this.anInt4258] = (short) arg3;
		this.aShortArray41[this.anInt4258] = (short) arg4;
		this.aShortArray45[this.anInt4258] = (short) arg5;
		this.aShortArray38[this.anInt4258] = (short) arg6;
		this.aFloatArray18[this.anInt4258] = arg7;
		this.aFloatArray19[this.anInt4258] = arg8;
		return (short) this.anInt4258++;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!pl;")
	public Class36_Sub2_Sub1 method3250(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class36_Sub2_Sub1 local3 = new Class36_Sub2_Sub1();
		local3.anInt4257 = this.anInt4257;
		local3.anInt4260 = this.anInt4260;
		local3.anInt4258 = this.anInt4258;
		local3.anInt4259 = this.anInt4259;
		if (arg0) {
			local3.anIntArray320 = this.anIntArray320;
			local3.anIntArray321 = this.anIntArray321;
		} else {
			local3.anIntArray320 = Static98.method1570(this.anIntArray320);
			local3.anIntArray321 = Static98.method1570(this.anIntArray321);
		}
		if (arg1) {
			local3.anIntArray324 = this.anIntArray324;
		} else {
			local3.anIntArray324 = Static98.method1570(this.anIntArray324);
		}
		if (arg0 && arg1) {
			local3.aClass176_2 = this.aClass176_2;
			local3.aClass63_1 = this.aClass63_1;
		} else {
			local3.aClass176_2 = new Class176();
			local3.aClass63_1 = new Class63();
		}
		if (arg2) {
			local3.aShortArray44 = this.aShortArray44;
		} else {
			local3.aShortArray44 = Static38.method608(this.aShortArray44);
		}
		local3.aByteArray37 = this.aByteArray37;
		if (arg2 && arg3 && (arg6 && arg4 || Static76.aBoolean117)) {
			local3.aClass176_4 = this.aClass176_4;
		} else {
			local3.aClass176_4 = new Class176();
		}
		if (arg4) {
			local3.aShortArray43 = this.aShortArray43;
			local3.aShortArray41 = this.aShortArray41;
			local3.aShortArray45 = this.aShortArray45;
			local3.aShortArray38 = this.aShortArray38;
		} else {
			local3.aShortArray43 = Static38.method608(this.aShortArray43);
			local3.aShortArray41 = Static38.method608(this.aShortArray41);
			local3.aShortArray45 = Static38.method608(this.aShortArray45);
			local3.aShortArray38 = Static38.method608(this.aShortArray38);
		}
		if (!Static76.aBoolean117) {
			local3.aClass176_5 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass176_5 = this.aClass176_5;
		} else {
			local3.aClass176_5 = new Class176();
		}
		local3.aFloatArray18 = this.aFloatArray18;
		local3.aFloatArray19 = this.aFloatArray19;
		local3.aClass176_3 = this.aClass176_3;
		if (arg7) {
			local3.aShortArray37 = this.aShortArray37;
			local3.aShortArray46 = this.aShortArray46;
			local3.aShortArray42 = this.aShortArray42;
			local3.aClass176_1 = this.aClass176_1;
		} else {
			local3.aShortArray37 = Static38.method608(this.aShortArray37);
			local3.aShortArray46 = Static38.method608(this.aShortArray46);
			local3.aShortArray42 = Static38.method608(this.aShortArray42);
			local3.aClass176_1 = new Class176();
		}
		if (arg8) {
			local3.aShortArray40 = this.aShortArray40;
		} else {
			local3.aShortArray40 = Static38.method608(this.aShortArray40);
		}
		local3.anIntArray325 = this.anIntArray325;
		local3.anIntArrayArray24 = this.anIntArrayArray24;
		local3.aByteArray38 = this.aByteArray38;
		local3.anIntArrayArray25 = this.anIntArrayArray25;
		local3.anIntArray322 = this.anIntArray322;
		local3.aShortArray39 = this.aShortArray39;
		local3.anIntArray323 = this.anIntArray323;
		local3.aShort19 = this.aShort19;
		local3.aShort18 = this.aShort18;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray36 = this.aShortArray36;
		return local3;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method3251(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte12 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt4258 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass176_4.aBoolean476 && (arg1 || arg2 && !Static76.aBoolean117);
				this.method3256(false, !this.aClass176_2.aBoolean476 && arg0, local26, this.aClass176_5 != null && !this.aClass176_5.aBoolean476 && arg2, !this.aClass176_3.aBoolean476);
				if (!this.aClass176_1.aBoolean476 && arg3 && arg1) {
					this.method3254();
				}
			}
			if (arg0) {
				if (this.aClass176_2.aBoolean476) {
					if (!this.aClass63_1.aBoolean137) {
						this.method3244();
					}
					this.anIntArray320 = null;
					this.anIntArray324 = null;
					this.anIntArray321 = null;
					this.aShortArray39 = null;
					this.anIntArray323 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass176_4.aBoolean476) {
					this.aShortArray44 = null;
					this.aByteArray37 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x2);
				}
			}
			if (arg2 && Static76.aBoolean117) {
				if (this.aClass176_5.aBoolean476) {
					this.aShortArray43 = null;
					this.aShortArray41 = null;
					this.aShortArray45 = null;
					this.aShortArray38 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x4);
				}
			}
			if (this.aClass176_3.aBoolean476) {
				this.aFloatArray18 = null;
				this.aFloatArray19 = null;
			} else {
				this.aByte11 = (byte) (this.aByte11 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass176_1.aBoolean476 && this.aClass176_4.aBoolean476) {
					this.aShortArray37 = null;
					this.aShortArray46 = null;
					this.aShortArray42 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray325 = null;
				this.aByteArray38 = null;
				this.anIntArrayArray24 = null;
				this.anIntArrayArray25 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			Static205.anInt4262 = 0;
			Static205.anInt4261 = 0;
			Static205.anInt4263 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray24.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray24[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static205.anInt4262 += this.anIntArray320[local53];
						Static205.anInt4261 += this.anIntArray324[local53];
						Static205.anInt4263 += this.anIntArray321[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static205.anInt4262 = Static205.anInt4262 / local18 + local8;
				Static205.anInt4261 = Static205.anInt4261 / local18 + local12;
				Static205.anInt4263 = Static205.anInt4263 / local18 + local16;
			} else {
				Static205.anInt4262 = local8;
				Static205.anInt4261 = local12;
				Static205.anInt4263 = local16;
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
				if (local26 < this.anIntArrayArray24.length) {
					local141 = this.anIntArrayArray24[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray320[local45] += local8;
						this.anIntArray324[local45] += local12;
						this.anIntArray321[local45] += local16;
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
				if (local26 < this.anIntArrayArray24.length) {
					local141 = this.anIntArrayArray24[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray320[local45] -= Static205.anInt4262;
						this.anIntArray324[local45] -= Static205.anInt4261;
						this.anIntArray321[local45] -= Static205.anInt4263;
						if (arg4 != 0) {
							local53 = Class68.anIntArray137[arg4];
							local246 = Class68.anIntArray139[arg4];
							local264 = this.anIntArray324[local45] * local53 + this.anIntArray320[local45] * local246 + 32767 >> 16;
							this.anIntArray324[local45] = this.anIntArray324[local45] * local246 + 32767 - this.anIntArray320[local45] * local53 >> 16;
							this.anIntArray320[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class68.anIntArray137[arg2];
							local246 = Class68.anIntArray139[arg2];
							local264 = this.anIntArray324[local45] * local246 + 32767 - this.anIntArray321[local45] * local53 >> 16;
							this.anIntArray321[local45] = this.anIntArray324[local45] * local53 + this.anIntArray321[local45] * local246 + 32767 >> 16;
							this.anIntArray324[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class68.anIntArray137[arg3];
							local246 = Class68.anIntArray139[arg3];
							local264 = this.anIntArray321[local45] * local53 + this.anIntArray320[local45] * local246 + 32767 >> 16;
							this.anIntArray321[local45] = this.anIntArray321[local45] * local246 + 32767 - this.anIntArray320[local45] * local53 >> 16;
							this.anIntArray320[local45] = local264;
						}
						this.anIntArray320[local45] += Static205.anInt4262;
						this.anIntArray324[local45] += Static205.anInt4261;
						this.anIntArray321[local45] += Static205.anInt4263;
					}
				}
			}
			if (arg5 && this.aShortArray43 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray24.length) {
						local141 = this.anIntArrayArray24[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray323[local45];
							local246 = this.anIntArray323[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray39[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class68.anIntArray137[arg4];
									local498 = Class68.anIntArray139[arg4];
									local516 = this.aShortArray41[local484] * local494 + this.aShortArray43[local484] * local498 + 32767 >> 16;
									this.aShortArray41[local484] = (short) (this.aShortArray41[local484] * local498 + 32767 - this.aShortArray43[local484] * local494 >> 16);
									this.aShortArray43[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class68.anIntArray137[arg2];
									local498 = Class68.anIntArray139[arg2];
									local516 = this.aShortArray41[local484] * local498 + 32767 - this.aShortArray45[local484] * local494 >> 16;
									this.aShortArray45[local484] = (short) (this.aShortArray41[local484] * local494 + this.aShortArray45[local484] * local498 + 32767 >> 16);
									this.aShortArray41[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class68.anIntArray137[arg3];
									local498 = Class68.anIntArray139[arg3];
									local516 = this.aShortArray45[local484] * local494 + this.aShortArray43[local484] * local498 + 32767 >> 16;
									this.aShortArray45[local484] = (short) (this.aShortArray45[local484] * local498 + 32767 - this.aShortArray43[local484] * local494 >> 16);
									this.aShortArray43[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass176_5 != null) {
					this.aClass176_5.aBoolean476 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray24.length) {
					local141 = this.anIntArrayArray24[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray320[local45] -= Static205.anInt4262;
						this.anIntArray324[local45] -= Static205.anInt4261;
						this.anIntArray321[local45] -= Static205.anInt4263;
						this.anIntArray320[local45] = this.anIntArray320[local45] * arg2 >> 7;
						this.anIntArray324[local45] = this.anIntArray324[local45] * arg3 >> 7;
						this.anIntArray321[local45] = this.anIntArray321[local45] * arg4 >> 7;
						this.anIntArray320[local45] += Static205.anInt4262;
						this.anIntArray324[local45] += Static205.anInt4261;
						this.anIntArray321[local45] += Static205.anInt4263;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray25 != null && this.aByteArray37 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray25.length) {
						local141 = this.anIntArrayArray25[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray37[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray37[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass176_4.aBoolean476 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray25 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray25.length) {
					local141 = this.anIntArrayArray25[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray44[local45] & 0xFFFF;
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
						this.aShortArray44[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass176_4.aBoolean476 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "()I")
	@Override
	public int method3948() {
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		return this.aClass63_1.aShort8;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(SS)V")
	public void method3253(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4259; local1++) {
			if (this.aShortArray44[local1] == arg0) {
				this.aShortArray44[local1] = arg1;
			}
		}
		this.aClass176_4.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "()V")
	private void method3254() {
		if (Static205.aClass8_Sub2_2.aByteArray24.length < this.anInt4259 * 12) {
			Static205.aClass8_Sub2_2 = new Class8_Sub2((this.anInt4259 + 100) * 12);
		} else {
			Static205.aClass8_Sub2_2.anInt2955 = 0;
		}
		@Pc(25) int local25;
		if (Static116.aBoolean189) {
			for (local25 = 0; local25 < this.anInt4259; local25++) {
				Static205.aClass8_Sub2_2.method2330(this.aShortArray37[local25]);
				Static205.aClass8_Sub2_2.method2330(this.aShortArray46[local25]);
				Static205.aClass8_Sub2_2.method2330(this.aShortArray42[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt4259; local25++) {
				Static205.aClass8_Sub2_2.method2332(this.aShortArray37[local25]);
				Static205.aClass8_Sub2_2.method2332(this.aShortArray46[local25]);
				Static205.aClass8_Sub2_2.method2332(this.aShortArray42[local25]);
			}
		}
		if (!Static116.aBoolean195) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static205.aClass8_Sub2_2.anInt2955);
			local115.put(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
			local115.flip();
			this.aClass176_1.aBoolean476 = true;
			this.aClass176_1.aByteBuffer14 = local115;
			this.aClass176_1.aClass98_7 = null;
			return;
		}
		@Pc(88) Class98 local88 = new Class98();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
		local88.method2263(local95);
		this.aClass176_1.aBoolean476 = true;
		this.aClass176_1.aByteBuffer14 = null;
		this.aClass176_1.aClass98_7 = local88;
	}

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "()I")
	public int method3255() {
		return this.aShort19;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!eh;IIIZ)V")
	@Override
	public void method4179(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class36_Sub2_Sub1 local2 = (Class36_Sub2_Sub1) arg0;
		if (this.anInt4259 == 0 || local2.anInt4259 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt4260;
		@Pc(15) int[] local15 = local2.anIntArray320;
		@Pc(18) int[] local18 = local2.anIntArray324;
		@Pc(21) int[] local21 = local2.anIntArray321;
		@Pc(24) short[] local24 = local2.aShortArray43;
		@Pc(27) short[] local27 = local2.aShortArray41;
		@Pc(30) short[] local30 = local2.aShortArray45;
		@Pc(33) short[] local33 = local2.aShortArray38;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass171_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass171_1.aShortArray67;
			local44 = this.aClass171_1.aShortArray69;
			local48 = this.aClass171_1.aShortArray70;
			local52 = this.aClass171_1.aShortArray68;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass171_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass171_1.aShortArray67;
			local72 = local2.aClass171_1.aShortArray69;
			local76 = local2.aClass171_1.aShortArray70;
			local80 = local2.aClass171_1.aShortArray68;
		}
		@Pc(92) int[] local92 = local2.anIntArray323;
		@Pc(95) short[] local95 = local2.aShortArray39;
		if (!local2.aClass63_1.aBoolean137) {
			local2.method3244();
		}
		@Pc(105) short local105 = local2.aClass63_1.aShort10;
		@Pc(109) short local109 = local2.aClass63_1.aShort7;
		@Pc(113) short local113 = local2.aClass63_1.aShort8;
		@Pc(117) short local117 = local2.aClass63_1.aShort11;
		@Pc(121) short local121 = local2.aClass63_1.aShort9;
		@Pc(125) short local125 = local2.aClass63_1.aShort13;
		for (@Pc(127) int local127 = 0; local127 < this.anInt4260; local127++) {
			@Pc(138) int local138 = this.anIntArray324[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray320[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray321[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray323[local127];
						@Pc(187) int local187 = this.anIntArray323[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray39[local189] - 1;
							if (local175 == -1 || this.aShortArray38[local175] != 0) {
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
											this.aClass171_1 = new Class171();
											local40 = this.aClass171_1.aShortArray67 = Static38.method608(this.aShortArray43);
											local44 = this.aClass171_1.aShortArray69 = Static38.method608(this.aShortArray41);
											local48 = this.aClass171_1.aShortArray70 = Static38.method608(this.aShortArray45);
											local52 = this.aClass171_1.aShortArray68 = Static38.method608(this.aShortArray38);
										}
										if (local68 == null) {
											@Pc(325) Class171 local325 = local2.aClass171_1 = new Class171();
											local68 = local325.aShortArray67 = Static38.method608(local24);
											local72 = local325.aShortArray69 = Static38.method608(local27);
											local76 = local325.aShortArray70 = Static38.method608(local30);
											local80 = local325.aShortArray68 = Static38.method608(local33);
										}
										@Pc(358) short local358 = this.aShortArray43[local175];
										@Pc(363) short local363 = this.aShortArray41[local175];
										@Pc(368) short local368 = this.aShortArray45[local175];
										@Pc(373) short local373 = this.aShortArray38[local175];
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
										local180 = this.anIntArray323[local127];
										local187 = this.anIntArray323[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray39[local385] - 1;
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

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZ)V")
	private void method3256(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass176_2.anInt5655 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass176_4.anInt5655 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass176_5.anInt5655 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass176_3.anInt5655 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static205.aClass8_Sub2_2.aByteArray24.length < this.anInt4258 * local1) {
			Static205.aClass8_Sub2_2 = new Class8_Sub2((this.anInt4258 + 100) * local1);
		} else {
			Static205.aClass8_Sub2_2.anInt2955 = 0;
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
			if (Static116.aBoolean189) {
				for (local60 = 0; local60 < this.anInt4260; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray320[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray324[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray321[local60]);
					local90 = this.anIntArray323[local60];
					local97 = this.anIntArray323[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray39[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static205.aClass8_Sub2_2.anInt2955 = local109 * local1;
						Static205.aClass8_Sub2_2.method2330(local71);
						Static205.aClass8_Sub2_2.method2330(local78);
						Static205.aClass8_Sub2_2.method2330(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt4260; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray320[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray324[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray321[local60]);
					local90 = this.anIntArray323[local60];
					local97 = this.anIntArray323[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray39[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static205.aClass8_Sub2_2.anInt2955 = local109 * local1;
						Static205.aClass8_Sub2_2.method2332(local71);
						Static205.aClass8_Sub2_2.method2332(local78);
						Static205.aClass8_Sub2_2.method2332(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static76.aBoolean117) {
				for (local60 = 0; local60 < this.anInt4259; local60++) {
					local71 = Static205.method3262(this.aShortArray44[local60], this.aShortArray40[local60], this.aShort19, this.aByteArray37[local60]);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + this.aShortArray37[local60] * local1;
					Static205.aClass8_Sub2_2.method2330(local71);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + this.aShortArray46[local60] * local1;
					Static205.aClass8_Sub2_2.method2330(local71);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + this.aShortArray42[local60] * local1;
					Static205.aClass8_Sub2_2.method2330(local71);
				}
			} else {
				local60 = (int) Static233.aFloatArray20[0];
				local71 = (int) Static233.aFloatArray20[1];
				local78 = (int) Static233.aFloatArray20[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort19 * 1.3F);
				local97 = this.aShort18 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt4259; local99++) {
					@Pc(270) short local270 = this.aShortArray37[local99];
					@Pc(275) short local275 = this.aShortArray38[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray43[local270] + local71 * this.aShortArray41[local270] + local78 * this.aShortArray45[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray43[local270] + local71 * this.aShortArray41[local270] + local78 * this.aShortArray45[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray38[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray46[local99];
					@Pc(369) short local369 = this.aShortArray38[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray43[local364] + local71 * this.aShortArray41[local364] + local78 * this.aShortArray45[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray43[local364] + local71 * this.aShortArray41[local364] + local78 * this.aShortArray45[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray38[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray42[local99];
					@Pc(463) short local463 = this.aShortArray38[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray43[local458] + local71 * this.aShortArray41[local458] + local78 * this.aShortArray45[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray43[local458] + local71 * this.aShortArray41[local458] + local78 * this.aShortArray45[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray38[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static205.method3262(this.aShortArray44[local99], this.aShortArray40[local99], local281, this.aByteArray37[local99]);
					@Pc(577) int local577 = Static205.method3262(this.aShortArray44[local99], this.aShortArray40[local99], local375, this.aByteArray37[local99]);
					@Pc(592) int local592 = Static205.method3262(this.aShortArray44[local99], this.aShortArray40[local99], local469, this.aByteArray37[local99]);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + local270 * local1;
					Static205.aClass8_Sub2_2.method2330(local562);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + local364 * local1;
					Static205.aClass8_Sub2_2.method2330(local577);
					Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_4.anInt5655 + local458 * local1;
					Static205.aClass8_Sub2_2.method2330(local592);
				}
				this.aShortArray43 = null;
				this.aShortArray41 = null;
				this.aShortArray45 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort18;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort18 + this.aShort18 / 2);
			Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_5.anInt5655;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static116.aBoolean189) {
				for (local78 = 0; local78 < this.anInt4258; local78++) {
					local752 = this.aShortArray38[local78];
					if (local752 == 0) {
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray43[local78] * local734);
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray41[local78] * local734);
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray45[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray43[local78] * local790);
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray41[local78] * local790);
						Static205.aClass8_Sub2_2.method2383((float) this.aShortArray45[local78] * local790);
					}
					Static205.aClass8_Sub2_2.anInt2955 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt4258; local78++) {
					local752 = this.aShortArray38[local78];
					if (local752 == 0) {
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray43[local78] * local734);
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray41[local78] * local734);
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray45[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray43[local78] * local790);
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray41[local78] * local790);
						Static205.aClass8_Sub2_2.method2324((float) this.aShortArray45[local78] * local790);
					}
					Static205.aClass8_Sub2_2.anInt2955 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static205.aClass8_Sub2_2.anInt2955 = this.aClass176_3.anInt5655;
			if (Static116.aBoolean189) {
				for (local60 = 0; local60 < this.anInt4258; local60++) {
					Static205.aClass8_Sub2_2.method2383(this.aFloatArray18[local60]);
					Static205.aClass8_Sub2_2.method2383(this.aFloatArray19[local60]);
					Static205.aClass8_Sub2_2.anInt2955 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt4258; local60++) {
					Static205.aClass8_Sub2_2.method2324(this.aFloatArray18[local60]);
					Static205.aClass8_Sub2_2.method2324(this.aFloatArray19[local60]);
					Static205.aClass8_Sub2_2.anInt2955 += local1 - 8;
				}
			}
		}
		Static205.aClass8_Sub2_2.anInt2955 = local1 * this.anInt4258;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static116.aBoolean196) {
				local1007 = ByteBuffer.wrap(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
				if (this.aClass98_5 == null) {
					this.aClass98_5 = new Class98(true);
					this.aClass98_5.method2263(local1007);
				} else {
					this.aClass98_5.method2264(local1007);
				}
				if (arg1) {
					this.aClass176_2.aBoolean476 = true;
					this.aClass176_2.aByteBuffer14 = null;
					this.aClass176_2.aClass98_7 = this.aClass98_5;
					this.aClass176_2.anInt5653 = local1;
				}
				if (arg2) {
					this.aClass176_4.aBoolean476 = true;
					this.aClass176_4.aByteBuffer14 = null;
					this.aClass176_4.aClass98_7 = this.aClass98_5;
					this.aClass176_4.anInt5653 = local1;
				}
				if (arg3) {
					this.aClass176_5.aBoolean476 = true;
					this.aClass176_5.aByteBuffer14 = null;
					this.aClass176_5.aClass98_7 = this.aClass98_5;
					this.aClass176_5.anInt5653 = local1;
				}
				if (arg4) {
					this.aClass176_3.aBoolean476 = true;
					this.aClass176_3.aByteBuffer14 = null;
					this.aClass176_3.aClass98_7 = this.aClass98_5;
					this.aClass176_3.anInt5653 = local1;
				}
			} else {
				if (Static205.aByteBuffer9 == null || Static205.aByteBuffer9.capacity() < Static205.aClass8_Sub2_2.anInt2955) {
					Static205.aByteBuffer9 = ByteBuffer.allocateDirect(Static205.aClass8_Sub2_2.anInt2955 + local1 * 100);
				} else {
					Static205.aByteBuffer9.clear();
				}
				Static205.aByteBuffer9.put(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
				Static205.aByteBuffer9.flip();
				if (arg1) {
					this.aClass176_2.aBoolean476 = true;
					this.aClass176_2.aByteBuffer14 = Static205.aByteBuffer9;
					this.aClass176_2.aClass98_7 = null;
					this.aClass176_2.anInt5653 = local1;
				}
				if (arg2) {
					this.aClass176_4.aBoolean476 = true;
					this.aClass176_4.aByteBuffer14 = Static205.aByteBuffer9;
					this.aClass176_2.aClass98_7 = null;
					this.aClass176_4.anInt5653 = local1;
				}
				if (arg3) {
					this.aClass176_5.aBoolean476 = true;
					this.aClass176_5.aByteBuffer14 = Static205.aByteBuffer9;
					this.aClass176_5.aClass98_7 = null;
					this.aClass176_5.anInt5653 = local1;
				}
				if (arg4) {
					this.aClass176_3.aBoolean476 = true;
					this.aClass176_3.aByteBuffer14 = Static205.aByteBuffer9;
					this.aClass176_3.aClass98_7 = null;
					this.aClass176_3.anInt5653 = local1;
				}
			}
		} else if (Static116.aBoolean195) {
			@Pc(1211) Class98 local1211 = new Class98();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
			local1211.method2263(local1218);
			if (arg1) {
				this.aClass176_2.aBoolean476 = true;
				this.aClass176_2.aByteBuffer14 = null;
				this.aClass176_2.aClass98_7 = local1211;
				this.aClass176_2.anInt5653 = local1;
			}
			if (arg2) {
				this.aClass176_4.aBoolean476 = true;
				this.aClass176_4.aByteBuffer14 = null;
				this.aClass176_4.aClass98_7 = local1211;
				this.aClass176_4.anInt5653 = local1;
			}
			if (arg3) {
				this.aClass176_5.aBoolean476 = true;
				this.aClass176_5.aByteBuffer14 = null;
				this.aClass176_5.aClass98_7 = local1211;
				this.aClass176_5.anInt5653 = local1;
			}
			if (arg4) {
				this.aClass176_3.aBoolean476 = true;
				this.aClass176_3.aByteBuffer14 = null;
				this.aClass176_3.aClass98_7 = local1211;
				this.aClass176_3.anInt5653 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static205.aClass8_Sub2_2.anInt2955);
			local1007.put(Static205.aClass8_Sub2_2.aByteArray24, 0, Static205.aClass8_Sub2_2.anInt2955);
			local1007.flip();
			if (arg1) {
				this.aClass176_2.aBoolean476 = true;
				this.aClass176_2.aByteBuffer14 = local1007;
				this.aClass176_2.aClass98_7 = null;
				this.aClass176_2.anInt5653 = local1;
			}
			if (arg2) {
				this.aClass176_4.aBoolean476 = true;
				this.aClass176_4.aByteBuffer14 = local1007;
				this.aClass176_2.aClass98_7 = null;
				this.aClass176_4.anInt5653 = local1;
			}
			if (arg3) {
				this.aClass176_5.aBoolean476 = true;
				this.aClass176_5.aByteBuffer14 = local1007;
				this.aClass176_5.aClass98_7 = null;
				this.aClass176_5.anInt5653 = local1;
			}
			if (arg4) {
				this.aClass176_3.aBoolean476 = true;
				this.aClass176_3.aByteBuffer14 = local1007;
				this.aClass176_3.aClass98_7 = null;
				this.aClass176_3.anInt5653 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(III)V")
	@Override
	public void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			this.anIntArray320[local1] = this.anIntArray320[local1] * arg0 >> 7;
			this.anIntArray324[local1] = this.anIntArray324[local1] * arg1 >> 7;
			this.anIntArray321[local1] = this.anIntArray321[local1] * arg2 >> 7;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "()Z")
	@Override
	protected boolean method3960() {
		if (this.anIntArrayArray24 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt4257; local6++) {
			this.anIntArray320[local6] <<= 0x4;
			this.anIntArray324[local6] <<= 0x4;
			this.anIntArray321[local6] <<= 0x4;
		}
		Static205.anInt4262 = 0;
		Static205.anInt4261 = 0;
		Static205.anInt4263 = 0;
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "()V")
	public void method3258() {
		if (this.aShortArray43 == null) {
			this.method3941();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4257; local7++) {
			@Pc(16) int local16 = this.anIntArray320[local7];
			this.anIntArray320[local7] = this.anIntArray321[local7];
			this.anIntArray321[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt4258; local7++) {
			@Pc(43) short local43 = this.aShortArray43[local7];
			this.aShortArray43[local7] = this.aShortArray45[local7];
			this.aShortArray45[local7] = (short) -local43;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "()V")
	public void method3260() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray325 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4257; local9++) {
				local20 = this.anIntArray325[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray24 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray24[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt4257) {
				local20 = this.anIntArray325[local9] & 0xFF;
				this.anIntArrayArray24[local20][local5[local20]++] = local9++;
			}
			this.anIntArray325 = null;
		}
		if (this.aByteArray38 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4259; local9++) {
			local20 = this.aByteArray38[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray25 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray25[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt4259) {
			local20 = this.aByteArray38[local9] & 0xFF;
			this.anIntArrayArray25[local20][local5[local20]++] = local9++;
		}
		this.aByteArray38 = null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZ)Lclient!ie;")
	@Override
	public Class36_Sub2 method3936(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3263(arg0, arg1, arg2, Static205.aClass36_Sub2_Sub1_2, Static205.aClass36_Sub2_Sub1_1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt4258 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static116.aGL1;
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
		this.method3240();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static205.anInt4262 = 0;
			Static205.anInt4261 = 0;
			Static205.anInt4263 = 0;
			for (local11 = 0; local11 < this.anInt4257; local11++) {
				Static205.anInt4262 += this.anIntArray320[local11];
				Static205.anInt4261 += this.anIntArray324[local11];
				Static205.anInt4263 += this.anIntArray321[local11];
				local3++;
			}
			if (local3 > 0) {
				Static205.anInt4262 = Static205.anInt4262 / local3 + arg1;
				Static205.anInt4261 = Static205.anInt4261 / local3 + arg2;
				Static205.anInt4263 = Static205.anInt4263 / local3 + arg3;
			} else {
				Static205.anInt4262 = arg1;
				Static205.anInt4261 = arg2;
				Static205.anInt4263 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt4257; local3++) {
				this.anIntArray320[local3] += arg1;
				this.anIntArray324[local3] += arg2;
				this.anIntArray321[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt4257; local3++) {
					this.anIntArray320[local3] -= Static205.anInt4262;
					this.anIntArray324[local3] -= Static205.anInt4261;
					this.anIntArray321[local3] -= Static205.anInt4263;
					if (arg3 != 0) {
						local11 = Class68.anIntArray137[arg3];
						local146 = Class68.anIntArray139[arg3];
						local164 = this.anIntArray324[local3] * local11 + this.anIntArray320[local3] * local146 + 32767 >> 16;
						this.anIntArray324[local3] = this.anIntArray324[local3] * local146 + 32767 - this.anIntArray320[local3] * local11 >> 16;
						this.anIntArray320[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class68.anIntArray137[arg1];
						local146 = Class68.anIntArray139[arg1];
						local164 = this.anIntArray324[local3] * local146 + 32767 - this.anIntArray321[local3] * local11 >> 16;
						this.anIntArray321[local3] = this.anIntArray324[local3] * local11 + this.anIntArray321[local3] * local146 + 32767 >> 16;
						this.anIntArray324[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class68.anIntArray137[arg2];
						local146 = Class68.anIntArray139[arg2];
						local164 = this.anIntArray321[local3] * local11 + this.anIntArray320[local3] * local146 + 32767 >> 16;
						this.anIntArray321[local3] = this.anIntArray321[local3] * local146 + 32767 - this.anIntArray320[local3] * local11 >> 16;
						this.anIntArray320[local3] = local164;
					}
					this.anIntArray320[local3] += Static205.anInt4262;
					this.anIntArray324[local3] += Static205.anInt4261;
					this.anIntArray321[local3] += Static205.anInt4263;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt4257; local3++) {
					this.anIntArray320[local3] -= Static205.anInt4262;
					this.anIntArray324[local3] -= Static205.anInt4261;
					this.anIntArray321[local3] -= Static205.anInt4263;
					this.anIntArray320[local3] = this.anIntArray320[local3] * arg1 / 128;
					this.anIntArray324[local3] = this.anIntArray324[local3] * arg2 / 128;
					this.anIntArray321[local3] = this.anIntArray321[local3] * arg3 / 128;
					this.anIntArray320[local3] += Static205.anInt4262;
					this.anIntArray324[local3] += Static205.anInt4261;
					this.anIntArray321[local3] += Static205.anInt4263;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt4259; local3++) {
					local11 = (this.aByteArray37[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray37[local3] = (byte) local11;
				}
				this.aClass176_4.aBoolean476 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt4259; local3++) {
					local11 = this.aShortArray44[local3] & 0xFFFF;
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
					this.aShortArray44[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass176_4.aBoolean476 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "()V")
	@Override
	public void method3940() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			@Pc(10) int local10 = this.anIntArray321[local1];
			this.anIntArray321[local1] = this.anIntArray320[local1];
			this.anIntArray320[local1] = -local10;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZLclient!pl;Lclient!pl;)Lclient!ie;")
	private Class36_Sub2 method3263(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class36_Sub2_Sub1 arg3, @OriginalArg(4) Class36_Sub2_Sub1 arg4) {
		arg3.anInt4257 = this.anInt4257;
		arg3.anInt4260 = this.anInt4260;
		arg3.anInt4258 = this.anInt4258;
		arg3.anInt4259 = this.anInt4259;
		arg3.aShort19 = this.aShort19;
		arg3.aShort18 = this.aShort18;
		arg3.aByte12 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray320 == null || arg3.anIntArray320.length < this.anInt4257) {
			arg3.anIntArray320 = new int[this.anInt4257 + 100];
			arg3.anIntArray324 = new int[this.anInt4257 + 100];
			arg3.anIntArray321 = new int[this.anInt4257 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt4257; local73++) {
			arg3.anIntArray320[local73] = this.anIntArray320[local73];
			arg3.anIntArray324[local73] = this.anIntArray324[local73];
			arg3.anIntArray321[local73] = this.anIntArray321[local73];
		}
		if (arg3.aClass176_2 == null) {
			arg3.aClass176_2 = new Class176();
		}
		arg3.aClass176_2.aBoolean476 = false;
		if (arg3.aClass63_1 == null) {
			arg3.aClass63_1 = new Class63();
		}
		arg3.aClass63_1.aBoolean137 = false;
		if (arg0) {
			arg3.aByteArray37 = this.aByteArray37;
		} else {
			if (arg4.aByteArray37 == null || arg4.aByteArray37.length < this.anInt4259) {
				arg4.aByteArray37 = new byte[this.anInt4259 + 100];
			}
			arg3.aByteArray37 = arg4.aByteArray37;
			for (local73 = 0; local73 < this.anInt4259; local73++) {
				arg3.aByteArray37[local73] = this.aByteArray37[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray44 = this.aShortArray44;
		} else {
			if (arg4.aShortArray44 == null || arg4.aShortArray44.length < this.anInt4259) {
				arg4.aShortArray44 = new short[this.anInt4259 + 100];
			}
			arg3.aShortArray44 = arg4.aShortArray44;
			for (local73 = 0; local73 < this.anInt4259; local73++) {
				arg3.aShortArray44[local73] = this.aShortArray44[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass176_4 = this.aClass176_4;
		} else {
			if (arg4.aClass176_4 == null) {
				arg4.aClass176_4 = new Class176();
			}
			arg3.aClass176_4 = arg4.aClass176_4;
			arg3.aClass176_4.aBoolean476 = false;
		}
		if (arg2 || this.aShortArray43 == null) {
			arg3.aShortArray43 = this.aShortArray43;
			arg3.aShortArray41 = this.aShortArray41;
			arg3.aShortArray45 = this.aShortArray45;
			arg3.aShortArray38 = this.aShortArray38;
			arg3.aClass176_5 = this.aClass176_5;
		} else {
			if (arg4.aShortArray43 == null || arg4.aShortArray43.length < this.anInt4258) {
				arg4.aShortArray43 = new short[this.anInt4258 + 100];
				arg4.aShortArray41 = new short[this.anInt4258 + 100];
				arg4.aShortArray45 = new short[this.anInt4258 + 100];
				arg4.aShortArray38 = new short[this.anInt4258 + 100];
			}
			arg3.aShortArray43 = arg4.aShortArray43;
			arg3.aShortArray41 = arg4.aShortArray41;
			arg3.aShortArray45 = arg4.aShortArray45;
			arg3.aShortArray38 = arg4.aShortArray38;
			for (local73 = 0; local73 < this.anInt4258; local73++) {
				arg3.aShortArray43[local73] = this.aShortArray43[local73];
				arg3.aShortArray41[local73] = this.aShortArray41[local73];
				arg3.aShortArray45[local73] = this.aShortArray45[local73];
				arg3.aShortArray38[local73] = this.aShortArray38[local73];
			}
			if (Static76.aBoolean117) {
				if (arg4.aClass176_5 == null) {
					arg4.aClass176_5 = new Class176();
				}
				arg3.aClass176_5 = arg4.aClass176_5;
				arg3.aClass176_5.aBoolean476 = false;
			} else {
				arg3.aClass176_5 = null;
			}
		}
		arg3.aFloatArray18 = this.aFloatArray18;
		arg3.aFloatArray19 = this.aFloatArray19;
		arg3.anIntArray325 = this.anIntArray325;
		arg3.anIntArrayArray24 = this.anIntArrayArray24;
		arg3.aShortArray37 = this.aShortArray37;
		arg3.aShortArray46 = this.aShortArray46;
		arg3.aShortArray42 = this.aShortArray42;
		arg3.aShortArray40 = this.aShortArray40;
		arg3.aByteArray38 = this.aByteArray38;
		arg3.anIntArrayArray25 = this.anIntArrayArray25;
		arg3.aClass176_3 = this.aClass176_3;
		arg3.aClass176_1 = this.aClass176_1;
		arg3.anIntArray322 = this.anIntArray322;
		arg3.aShortArray39 = this.aShortArray39;
		arg3.anIntArray323 = this.anIntArray323;
		arg3.aBoolean435 = this.aBoolean435;
		arg3.aShortArray35 = this.aShortArray35;
		arg3.aShortArray36 = this.aShortArray36;
		return arg3;
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V")
	public void method3264(@OriginalArg(0) int arg0) {
		this.aShort18 = (short) arg0;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "()V")
	@Override
	protected void method3937() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4257; local1++) {
			this.anIntArray320[local1] = this.anIntArray320[local1] + 7 >> 4;
			this.anIntArray324[local1] = this.anIntArray324[local1] + 7 >> 4;
			this.anIntArray321[local1] = this.anIntArray321[local1] + 7 >> 4;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "()V")
	public void method3265() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4257; local1++) {
			this.anIntArray321[local1] = -this.anIntArray321[local1];
		}
		if (this.aShortArray45 != null) {
			for (local1 = 0; local1 < this.anInt4258; local1++) {
				this.aShortArray45[local1] = (short) -this.aShortArray45[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt4259; local1++) {
			@Pc(48) short local48 = this.aShortArray37[local1];
			this.aShortArray37[local1] = this.aShortArray42[local1];
			this.aShortArray42[local1] = local48;
		}
		this.aClass63_1.aBoolean137 = false;
		this.aClass176_2.aBoolean476 = false;
		if (this.aClass176_5 != null) {
			this.aClass176_5.aBoolean476 = false;
		}
		this.aClass176_1.aBoolean476 = false;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		if (this.anInt4258 == 0) {
			return;
		}
		if (!this.aClass63_1.aBoolean137) {
			this.method3244();
		}
		@Pc(13) short local13 = this.aClass63_1.aShort12;
		@Pc(17) short local17 = this.aClass63_1.aShort10;
		@Pc(21) short local21 = this.aClass63_1.aShort7;
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
		if (local90 / local53 <= Static90.anInt1920) {
			return;
		}
		@Pc(102) int local102 = local84 - local13 << 9;
		if (local102 / local53 >= Static65.anInt5541) {
			return;
		}
		@Pc(118) int local118 = arg6 * arg2 - local31 * arg1 >> 16;
		@Pc(132) int local132 = local118 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local132 / local53 <= Static37.anInt3864) {
			return;
		}
		@Pc(153) int local153 = local118 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local153 / local53 >= Static19.anInt523) {
			return;
		}
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 0;
		if (arg0 != 0) {
			local161 = Class68.anIntArray137[arg0];
			local163 = Class68.anIntArray139[arg0];
		}
		if (arg8 > 0L && Static224.aBoolean368 && local70 > 0) {
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
			if (Static198.anInt3919 >= local187 && Static198.anInt3919 <= local191 && Static31.anInt746 >= local206 && Static31.anInt746 <= local210) {
				local187 = 999999;
				local191 = -999999;
				local206 = 999999;
				local210 = -999999;
				@Pc(243) short local243 = this.aClass63_1.aShort8;
				@Pc(247) short local247 = this.aClass63_1.aShort11;
				@Pc(251) short local251 = this.aClass63_1.aShort9;
				@Pc(255) short local255 = this.aClass63_1.aShort13;
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
				if (Static198.anInt3919 >= local187 && Static198.anInt3919 <= local191 && Static31.anInt746 >= local206 && Static31.anInt746 <= local210) {
					if (this.aBoolean435) {
						Static79.aLongArray4[Static88.anInt1896++] = arg8;
					} else {
						if (Static205.anIntArray326.length < this.anInt4258) {
							Static205.anIntArray326 = new int[this.anInt4258];
							Static205.anIntArray327 = new int[this.anInt4258];
						}
						local362 = 0;
						label118: while (true) {
							if (local362 >= this.anInt4260) {
								local362 = 0;
								while (true) {
									if (local362 >= this.anInt4259) {
										break label118;
									}
									@Pc(698) short local698 = this.aShortArray37[local362];
									@Pc(703) short local703 = this.aShortArray46[local362];
									@Pc(708) short local708 = this.aShortArray42[local362];
									if (this.method3236(Static198.anInt3919, Static31.anInt746, Static205.anIntArray327[local698], Static205.anIntArray327[local703], Static205.anIntArray327[local708], Static205.anIntArray326[local698], Static205.anIntArray326[local703], Static205.anIntArray326[local708])) {
										Static79.aLongArray4[Static88.anInt1896++] = arg8;
										break label118;
									}
									local362++;
								}
							}
							local369 = this.anIntArray320[local362];
							local373 = this.anIntArray324[local362];
							local377 = this.anIntArray321[local362];
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
							@Pc(652) int local652 = this.anIntArray323[local362];
							@Pc(659) int local659 = this.anIntArray323[local362 + 1];
							for (@Pc(661) int local661 = local652; local661 < local659; local661++) {
								@Pc(671) int local671 = this.aShortArray39[local661] - 1;
								if (local671 == -1) {
									break;
								}
								Static205.anIntArray326[local671] = local465;
								Static205.anIntArray327[local671] = local471;
							}
							local362++;
						}
					}
				}
			}
		}
		@Pc(744) GL local744 = Static116.aGL1;
		local744.glPushMatrix();
		local744.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local744.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method3240();
		local744.glPopMatrix();
	}
}
