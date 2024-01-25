import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public class Class153 {

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "[I")
	private final int[] anIntArray197 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "[I")
	private final int[] anIntArray198 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
	protected final int anInt3410;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
	protected int anInt3416;

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "Lclient!qga;")
	private final Class290 aClass290_4;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "Lclient!lja;")
	private final Class218 aClass218_2;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "Z")
	public final boolean aBoolean274;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIZLclient!qga;Lclient!lja;)V")
	protected Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class290 arg4, @OriginalArg(5) Class218 arg5) {
		this.anInt3410 = arg1;
		this.anInt3416 = arg2;
		this.aClass290_4 = arg4;
		this.aClass218_2 = arg5;
		this.anInt3423 = arg0;
		this.aBoolean274 = arg3;
		this.aByteArrayArrayArray10 = new byte[this.anInt3423][this.anInt3410][this.anInt3416];
		this.aByteArrayArrayArray13 = new byte[this.anInt3423][this.anInt3410][this.anInt3416];
		this.aByteArrayArrayArray12 = new byte[this.anInt3423][this.anInt3410 + 1][this.anInt3416 + 1];
		this.anIntArrayArrayArray9 = new int[this.anInt3423][this.anInt3410 + 1][this.anInt3416 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt3423][this.anInt3410][this.anInt3416];
		this.aByteArrayArrayArray8 = new byte[this.anInt3423][this.anInt3410][this.anInt3416];
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!ha;Lclient!s;Lclient!s;ILclient!s;[[I)V")
	private void method3011(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int[][] arg6) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray8[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray9[arg0];
		if (arg4 >= -127) {
			this.aByteArrayArrayArray8 = null;
		}
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg0];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray10[arg0];
		for (@Pc(35) int local35 = 0; local35 < this.anInt3410; local35++) {
			@Pc(56) int local56 = local35 < this.anInt3410 - 1 ? local35 + 1 : local35;
			for (@Pc(58) int local58 = 0; local58 < this.anInt3416; local58++) {
				@Pc(79) int local79 = this.anInt3416 - 1 > local58 ? local58 + 1 : local58;
				if (Static49.anInt6791 == -1 || Static602.method8660(arg0, local58, Static49.anInt6791, local35)) {
					@Pc(97) boolean local97 = false;
					@Pc(99) boolean local99 = false;
					@Pc(102) boolean[] local102 = new boolean[4];
					@Pc(108) int local108 = local10[local35][local58];
					@Pc(114) int local114 = local15[local35][local58];
					@Pc(122) int local122 = local33[local35][local58] & 0xFF;
					@Pc(130) int local130 = local28[local35][local58] & 0xFF;
					@Pc(138) int local138 = local28[local35][local79] & 0xFF;
					@Pc(146) int local146 = local28[local56][local79] & 0xFF;
					@Pc(154) int local154 = local28[local56][local58] & 0xFF;
					if (local122 != 0 || local130 != 0) {
						@Pc(178) Class21 local178 = local122 == 0 ? null : this.aClass290_4.method6974(local122 - 1);
						if (local108 == 0 && local178 == null) {
							local108 = 12;
						}
						@Pc(199) Class274 local199 = local130 == 0 ? null : this.aClass218_2.method5200(local130 - 1);
						@Pc(201) Class21 local201 = local178;
						if (local178 != null) {
							if (local178.anInt355 == -1 && local178.anInt356 == -1) {
								local201 = local178;
								local178 = null;
							} else if (local199 != null && local108 != 0) {
								local99 = local178.aBoolean39;
							}
						}
						@Pc(317) int local317;
						@Pc(355) int local355;
						@Pc(444) int local444;
						@Pc(457) int local457;
						if ((local108 == 0 || local108 == 12) && local35 > 0 && local58 > 0 && local35 < this.anInt3410 && local58 < this.anInt3416) {
							@Pc(295) int local295 = local28[local56][local79] == local130 ? 1 : -1;
							local317 = local28[local35 - 1][local58 - 1] == local130 ? 1 : -1;
							@Pc(335) int local335 = local28[local56][local58 - 1] == local130 ? 1 : -1;
							local355 = local28[local35 - 1][local79] == local130 ? 1 : -1;
							if (local28[local35][local58 - 1] == local130) {
								local317++;
								local335++;
							} else {
								local317--;
								local335--;
							}
							if (local130 == local28[local56][local58]) {
								local335++;
								local295++;
							} else {
								local335--;
								local295--;
							}
							if (local130 == local28[local35][local79]) {
								local355++;
								local295++;
							} else {
								local355--;
								local295--;
							}
							if (local28[local35 - 1][local58] == local130) {
								local355++;
								local317++;
							} else {
								local317--;
								local355--;
							}
							local444 = local317 - local295;
							if (local444 < 0) {
								local444 = -local444;
							}
							local457 = local335 - local355;
							if (local457 < 0) {
								local457 = -local457;
							}
							if (local444 == local457) {
								local444 = arg5.method8038(local58, local35) - arg5.method8038(local79, local56);
								local457 = arg5.method8038(local58, local56) - arg5.method8038(local79, local35);
								if (local444 < 0) {
									local444 = -local444;
								}
								if (local457 < 0) {
									local457 = -local457;
								}
							}
							local114 = local444 >= local457 ? 0 : 1;
						}
						for (local317 = 0; local317 < 13; local317++) {
							Static24.anIntArray28[local317] = -1;
							Static552.anIntArray525[local317] = 1;
						}
						@Pc(562) boolean[] local562 = local178 != null && local178.aBoolean39 ? Static465.aBooleanArrayArray7[local108] : Static644.aBooleanArrayArray10[local108];
						this.method3016(this.anInt3416, local199, local108, local178, arg1, local102, local58, local15, local114, local10, this.anInt3410, local33, local35);
						@Pc(598) boolean local598 = local178 != null && local178.anInt355 != local178.anInt356;
						if (!local598) {
							for (local355 = 0; local355 < 8; local355++) {
								if (Static24.anIntArray28[local355] >= 0 && Static389.anIntArray379[local355] != Static522.anIntArray509[local355]) {
									local598 = true;
									break;
								}
							}
						}
						if (!local562[local114 + 1 & 0x3]) {
							local102[1] = Static160.method2193(local102[1], (Static552.anIntArray525[2] & Static552.anIntArray525[4]) == 0);
						}
						if (!local562[local114 + 3 & 0x3]) {
							local102[3] = Static160.method2193(local102[3], (Static552.anIntArray525[6] & Static552.anIntArray525[0]) == 0);
						}
						if (!local562[local114 & 0x3]) {
							local102[0] = Static160.method2193(local102[0], (Static552.anIntArray525[2] & Static552.anIntArray525[0]) == 0);
						}
						if (!local562[local114 + 2 & 0x3]) {
							local102[2] = Static160.method2193(local102[2], (Static552.anIntArray525[4] & Static552.anIntArray525[6]) == 0);
						}
						if (!local99 && (local108 == 0 || local108 == 12)) {
							if (local102[0] && !local102[1] && !local102[2] && local102[3]) {
								local108 = local108 == 0 ? 13 : 14;
								local102[0] = local102[3] = false;
								local114 = 0;
							} else if (local102[0] && local102[1] && !local102[2] && !local102[3]) {
								local108 = local108 == 0 ? 13 : 14;
								local114 = 3;
								local102[0] = local102[1] = false;
							} else if (!local102[0] && local102[1] && local102[2] && !local102[3]) {
								local102[1] = local102[2] = false;
								local114 = 2;
								local108 = local108 == 0 ? 13 : 14;
							} else if (!local102[0] && !local102[1] && local102[2] && local102[3]) {
								local108 = local108 == 0 ? 13 : 14;
								local102[2] = local102[3] = false;
								local114 = 1;
							}
						}
						@Pc(990) boolean local990 = !local99 && !local102[0] && !local102[2] && !local102[1] && !local102[3];
						@Pc(992) int[] local992 = null;
						@Pc(1023) int[] local1023;
						@Pc(1019) int[] local1019;
						@Pc(1002) int[] local1002;
						if (local990) {
							local457 = local178 == null ? 0 : Static423.anIntArray431[local108];
							local1002 = Static344.anIntArrayArray39[local108];
							local1019 = Static467.anIntArrayArray46[local108];
							local444 = local199 == null ? 0 : Static282.anIntArray273[local108];
							local1023 = Static543.anIntArrayArray49[local108];
						} else if (local99) {
							local1002 = Static121.anIntArrayArray13[local108];
							local992 = Static65.anIntArrayArray6[local108];
							local457 = local178 == null ? 0 : Static418.anIntArray426[local108];
							local1019 = Static311.anIntArrayArray35[local108];
							local1023 = Static329.anIntArrayArray37[local108];
							local444 = local199 == null ? 0 : Static164.anIntArray144[local108];
						} else {
							local1019 = Static620.anIntArrayArray56[local108];
							local1002 = Static152.anIntArrayArray17[local108];
							local992 = Static556.anIntArrayArray51[local108];
							local444 = local199 == null ? 0 : Static427.anIntArray623[local108];
							local1023 = Static107.anIntArrayArray11[local108];
							local457 = local178 == null ? 0 : Static507.anIntArray495[local108];
						}
						@Pc(1103) int local1103 = local457 + local444;
						if (local1103 <= 0) {
							Static529.method7630(arg0, local35, local58);
						} else {
							if (local102[0]) {
								local1103++;
							}
							if (local102[2]) {
								local1103++;
							}
							if (local102[1]) {
								local1103++;
							}
							if (local102[3]) {
								local1103++;
							}
							@Pc(1148) int local1148 = 0;
							@Pc(1150) int local1150 = 0;
							@Pc(1154) int local1154 = local1103 * 3;
							@Pc(1162) int[] local1162 = local598 ? new int[local1154] : null;
							@Pc(1165) int[] local1165 = new int[local1154];
							@Pc(1168) int[] local1168 = new int[local1154];
							@Pc(1171) int[] local1171 = new int[local1154];
							@Pc(1174) int[] local1174 = new int[local1154];
							@Pc(1177) int[] local1177 = new int[local1154];
							@Pc(1185) int[] local1185 = arg3 == null ? null : new int[local1154];
							@Pc(1197) int[] local1197 = arg3 == null && arg2 == null ? null : new int[local1154];
							@Pc(1199) int local1199 = -1;
							@Pc(1201) int local1201 = -1;
							@Pc(1203) int local1203 = 256;
							@Pc(1259) boolean local1259;
							@Pc(1251) int local1251;
							@Pc(1253) int local1253;
							@Pc(1494) int local1494;
							@Pc(1500) int local1500;
							@Pc(1509) int local1509;
							@Pc(1514) int local1514;
							@Pc(1529) int local1529;
							@Pc(1519) int local1519;
							@Pc(1527) int local1527;
							@Pc(1591) int local1591;
							@Pc(1597) int local1597;
							@Pc(1324) byte local1324;
							if (local178 != null) {
								local1201 = local178.anInt358;
								local1203 = local178.anInt359;
								local1199 = local178.anInt355;
								local1251 = Static455.method6708(arg1, local178);
								for (local1253 = 0; local1253 < local457; local1253++) {
									local1259 = false;
									if (local102[-local114 & 0x3] && local992[0] == local1148) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 1;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 1;
										Static662.anIntArray613[4] = local1019[local1148];
										Static662.anIntArray613[5] = local1002[local1148];
										local1324 = 6;
									} else if (local102[2 - local114 & 0x3] && local1148 == local992[2]) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 5;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 5;
										Static662.anIntArray613[4] = local1019[local1148];
										Static662.anIntArray613[5] = local1002[local1148];
										local1324 = 6;
									} else if (local102[1 - local114 & 0x3] && local1148 == local992[1]) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 3;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 3;
										Static662.anIntArray613[4] = local1019[local1148];
										local1324 = 6;
										Static662.anIntArray613[5] = local1002[local1148];
									} else if (local102[3 - local114 & 0x3] && local992[3] == local1148) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 7;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 7;
										Static662.anIntArray613[4] = local1019[local1148];
										local1324 = 6;
										Static662.anIntArray613[5] = local1002[local1148];
									} else {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = local1019[local1148];
										local1324 = 3;
										Static662.anIntArray613[2] = local1002[local1148];
									}
									for (local1494 = 0; local1494 < local1324; local1494++) {
										local1500 = Static662.anIntArray613[local1494];
										local1509 = local1500 - local114 * 2 & 0x7;
										local1514 = this.anIntArray197[local1500];
										local1519 = this.anIntArray198[local1500];
										if (local114 == 1) {
											local1527 = 512 - local1514;
											local1529 = local1519;
										} else if (local114 == 2) {
											local1529 = 512 - local1514;
											local1527 = 512 - local1519;
										} else if (local114 == 3) {
											local1527 = local1514;
											local1529 = 512 - local1519;
										} else {
											local1527 = local1519;
											local1529 = local1514;
										}
										local1165[local1150] = local1529;
										local1168[local1150] = local1527;
										if (local1185 != null && Static36.aBooleanArrayArray3[local108][local1500]) {
											local1591 = local1529 + (local35 << 9);
											local1597 = (local58 << 9) + local1527;
											local1185[local1150] = arg3.method8032(local1591, local1597) - arg5.method8032(local1591, local1597);
										}
										if (local1197 != null) {
											if (arg3 != null && !Static36.aBooleanArrayArray3[local108][local1500]) {
												local1591 = (local35 << 9) + local1529;
												local1597 = local1527 + (local58 << 9);
												local1197[local1150] = arg5.method8032(local1591, local1597) - arg3.method8032(local1591, local1597);
											} else if (arg2 != null && !Static640.aBooleanArrayArray9[local108][local1500]) {
												local1591 = local1529 + (local35 << 9);
												local1597 = (local58 << 9) + local1527;
												local1197[local1150] = arg2.method8032(local1591, local1597) - arg5.method8032(local1591, local1597);
											}
										}
										if (local1500 < 8 && local178.anInt351 < Static24.anIntArray28[local1509]) {
											if (local1162 != null) {
												local1162[local1150] = Static522.anIntArray509[local1509];
											}
											local1177[local1150] = Static417.anIntArray425[local1509];
											local1174[local1150] = Static178.anIntArray165[local1509];
											local1171[local1150] = Static389.anIntArray379[local1509];
										} else {
											if (local1162 != null) {
												local1162[local1150] = local1251;
											}
											local1174[local1150] = local178.anInt358;
											local1177[local1150] = local178.anInt359;
											local1171[local1150] = local1199;
										}
										local1150++;
									}
									local1148++;
								}
								if (!this.aBoolean274 && arg0 == 0) {
									Static198.method2856(local35, local58, local178.anInt350, local178.anInt348 * 8, local178.anInt349);
								}
								if (local108 != 12 && local178.anInt355 != -1 && local178.aBoolean37) {
									local97 = true;
								}
							} else if (local990) {
								local1148 = Static423.anIntArray431[local108];
							} else if (local99) {
								local1148 = Static418.anIntArray426[local108];
							} else {
								local1148 = Static507.anIntArray495[local108];
							}
							if (local199 != null) {
								if (local146 == 0) {
									local146 = local130;
								}
								if (local154 == 0) {
									local154 = local130;
								}
								if (local138 == 0) {
									local138 = local130;
								}
								@Pc(1846) Class274 local1846 = this.aClass218_2.method5200(local130 - 1);
								@Pc(1854) Class274 local1854 = this.aClass218_2.method5200(local138 - 1);
								@Pc(1862) Class274 local1862 = this.aClass218_2.method5200(local146 - 1);
								@Pc(1870) Class274 local1870 = this.aClass218_2.method5200(local154 - 1);
								for (local1509 = 0; local1509 < local444; local1509++) {
									local1259 = false;
									if (local102[-local114 & 0x3] && local992[0] == local1148) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 1;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 1;
										Static662.anIntArray613[4] = local1019[local1148];
										Static662.anIntArray613[5] = local1002[local1148];
										local1324 = 6;
									} else if (local102[2 - local114 & 0x3] && local992[2] == local1148) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 5;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 5;
										Static662.anIntArray613[4] = local1019[local1148];
										local1324 = 6;
										Static662.anIntArray613[5] = local1002[local1148];
									} else if (local102[1 - local114 & 0x3] && local1148 == local992[1]) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 3;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 3;
										Static662.anIntArray613[4] = local1019[local1148];
										Static662.anIntArray613[5] = local1002[local1148];
										local1324 = 6;
									} else if (local102[3 - local114 & 0x3] && local992[3] == local1148) {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = 7;
										Static662.anIntArray613[2] = local1002[local1148];
										Static662.anIntArray613[3] = 7;
										Static662.anIntArray613[4] = local1019[local1148];
										Static662.anIntArray613[5] = local1002[local1148];
										local1324 = 6;
									} else {
										Static662.anIntArray613[0] = local1023[local1148];
										Static662.anIntArray613[1] = local1019[local1148];
										local1324 = 3;
										Static662.anIntArray613[2] = local1002[local1148];
									}
									local1148++;
									for (local1514 = 0; local1514 < local1324; local1514++) {
										local1529 = Static662.anIntArray613[local1514];
										local1519 = local1529 - local114 * 2 & 0x7;
										local1527 = this.anIntArray197[local1529];
										local1597 = this.anIntArray198[local1529];
										@Pc(2157) int local2157;
										if (local114 == 1) {
											local1591 = local1597;
											local2157 = 512 - local1527;
										} else if (local114 == 2) {
											local2157 = 512 - local1597;
											local1591 = 512 - local1527;
										} else if (local114 == 3) {
											local2157 = local1527;
											local1591 = 512 - local1597;
										} else {
											local2157 = local1597;
											local1591 = local1527;
										}
										local1165[local1150] = local1591;
										local1168[local1150] = local2157;
										@Pc(2221) int local2221;
										@Pc(2227) int local2227;
										if (local1185 != null && Static36.aBooleanArrayArray3[local108][local1529]) {
											local2221 = local1591 + (local35 << 9);
											local2227 = local2157 + (local58 << 9);
											local1185[local1150] = arg3.method8032(local2221, local2227) - arg5.method8032(local2221, local2227);
										}
										if (local1197 != null) {
											if (arg3 != null && !Static36.aBooleanArrayArray3[local108][local1529]) {
												local2221 = local1591 + (local35 << 9);
												local2227 = (local58 << 9) + local2157;
												local1197[local1150] = arg5.method8032(local2221, local2227) - arg3.method8032(local2221, local2227);
											} else if (arg2 != null && !Static640.aBooleanArrayArray9[local108][local1529]) {
												local2221 = local1591 + (local35 << 9);
												local2227 = (local58 << 9) + local2157;
												local1197[local1150] = arg2.method8032(local2221, local2227) - arg5.method8032(local2221, local2227);
											}
										}
										if (local1529 < 8 && Static24.anIntArray28[local1519] >= 0) {
											if (local1162 != null) {
												local1162[local1150] = Static522.anIntArray509[local1519];
											}
											local1177[local1150] = Static417.anIntArray425[local1519];
											local1174[local1150] = Static178.anIntArray165[local1519];
											local1171[local1150] = Static389.anIntArray379[local1519];
										} else {
											if (local99 && Static36.aBooleanArrayArray3[local108][local1529]) {
												local1174[local1150] = local1201;
												local1177[local1150] = local1203;
												local1171[local1150] = local1199;
											} else if (local1591 == 0 && local2157 == 0) {
												local1171[local1150] = arg6[local35][local58];
												local1174[local1150] = local1846.anInt7524;
												local1177[local1150] = local1846.anInt7514;
											} else if (local1591 == 0 && local2157 == 512) {
												local1171[local1150] = arg6[local35][local79];
												local1174[local1150] = local1854.anInt7524;
												local1177[local1150] = local1854.anInt7514;
											} else if (local1591 == 512 && local2157 == 512) {
												local1171[local1150] = arg6[local56][local79];
												local1174[local1150] = local1862.anInt7524;
												local1177[local1150] = local1862.anInt7514;
											} else if (local1591 == 512 && local2157 == 0) {
												local1171[local1150] = arg6[local56][local58];
												local1174[local1150] = local1870.anInt7524;
												local1177[local1150] = local1870.anInt7514;
											} else {
												if (local1591 >= 256) {
													if (local2157 < 256) {
														local1174[local1150] = local1870.anInt7524;
														local1177[local1150] = local1870.anInt7514;
													} else {
														local1174[local1150] = local1862.anInt7524;
														local1177[local1150] = local1862.anInt7514;
													}
												} else if (local2157 >= 256) {
													local1174[local1150] = local1854.anInt7524;
													local1177[local1150] = local1854.anInt7514;
												} else {
													local1174[local1150] = local1846.anInt7524;
													local1177[local1150] = local1846.anInt7514;
												}
												local2221 = Static616.method8743(local1591 << 7 >> 9, arg6[local56][local58], arg6[local35][local58]);
												local2227 = Static616.method8743(local1591 << 7 >> 9, arg6[local56][local79], arg6[local35][local79]);
												local1171[local1150] = Static616.method8743(local2157 << 7 >> 9, local2227, local2221);
											}
											if (local1162 != null) {
												local1162[local1150] = local1171[local1150];
											}
										}
										local1150++;
									}
								}
								if (local108 != 0 && local199.aBoolean586) {
									local97 = true;
								}
							}
							local1251 = arg5.method8038(local58, local35);
							local1253 = arg5.method8038(local58, local56);
							local1494 = arg5.method8038(local79, local56);
							local1500 = arg5.method8038(local79, local35);
							@Pc(2709) boolean local2709 = Static90.method1353(1, local58, local35);
							if (local2709 && arg0 > 1 || !local2709 && arg0 > 0) {
								@Pc(2729) boolean local2729 = true;
								if (local199 != null && !local199.aBoolean585) {
									local2729 = false;
								} else if (local130 == 0 && local108 != 0) {
									local2729 = false;
								} else if (local122 > 0 && local201 != null && !local201.aBoolean38) {
									local2729 = false;
								}
								if (local2729 && local1251 == local1253 && local1251 == local1494 && local1500 == local1251) {
									this.aByteArrayArrayArray12[arg0][local35][local58] = (byte) (this.aByteArrayArrayArray12[arg0][local35][local58] | 0x4);
								}
							}
							local1514 = 0;
							local1529 = 0;
							local1519 = 0;
							if (this.aBoolean274) {
								local1514 = Static291.method4315(local35, local58);
								local1529 = Static104.method1524(local35, local58);
								local1519 = Static186.method2704(local35, local58);
							}
							arg5.U(local35, local58, local1165, local1185, local1168, local1197, local1171, local1162, local1174, local1177, local1514, local1529, local1519, local97);
							Static529.method7630(arg0, local35, local58);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!ha;Lclient!s;Lclient!s;)V")
	public final void method3012(@OriginalArg(1) Class57 arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class22 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3410][this.anInt3416];
		if (Static22.anIntArray26 == null || this.anInt3416 != Static22.anIntArray26.length) {
			Static268.anIntArray263 = new int[this.anInt3416];
			Static370.anIntArray579 = new int[this.anInt3416];
			Static177.anIntArray164 = new int[this.anInt3416];
			Static620.anIntArray564 = new int[this.anInt3416];
			Static22.anIntArray26 = new int[this.anInt3416];
		}
		@Pc(58) int local58;
		for (@Pc(52) int local52 = 0; local52 < this.anInt3423; local52++) {
			for (local58 = 0; local58 < this.anInt3416; local58++) {
				Static22.anIntArray26[local58] = 0;
				Static268.anIntArray263[local58] = 0;
				Static177.anIntArray164[local58] = 0;
				Static370.anIntArray579[local58] = 0;
				Static620.anIntArray564[local58] = 0;
			}
			for (@Pc(89) int local89 = -5; local89 < this.anInt3410; local89++) {
				@Pc(105) int local105;
				@Pc(120) int local120;
				@Pc(189) int local189;
				for (@Pc(97) int local97 = 0; local97 < this.anInt3416; local97++) {
					local105 = local89 + 5;
					@Pc(169) int local169;
					if (this.anInt3410 > local105) {
						local120 = this.aByteArrayArrayArray13[local52][local105][local97] & 0xFF;
						if (local120 > 0) {
							@Pc(133) Class274 local133 = this.aClass218_2.method5200(local120 - 1);
							Static22.anIntArray26[local97] += local133.anInt7521;
							Static268.anIntArray263[local97] += local133.anInt7522;
							Static177.anIntArray164[local97] += local133.anInt7518;
							Static370.anIntArray579[local97] += local133.anInt7519;
							local169 = Static620.anIntArray564[local97]++;
						}
					}
					local120 = local89 - 5;
					if (local120 >= 0) {
						local189 = this.aByteArrayArrayArray13[local52][local120][local97] & 0xFF;
						if (local189 > 0) {
							@Pc(199) Class274 local199 = this.aClass218_2.method5200(local189 - 1);
							Static22.anIntArray26[local97] -= local199.anInt7521;
							Static268.anIntArray263[local97] -= local199.anInt7522;
							Static177.anIntArray164[local97] -= local199.anInt7518;
							Static370.anIntArray579[local97] -= local199.anInt7519;
							local169 = Static620.anIntArray564[local97]--;
						}
					}
				}
				if (local89 >= 0) {
					local105 = 0;
					local120 = 0;
					local189 = 0;
					@Pc(257) int local257 = 0;
					@Pc(259) int local259 = 0;
					for (@Pc(261) int local261 = -5; local261 < this.anInt3416; local261++) {
						@Pc(267) int local267 = local261 + 5;
						if (this.anInt3416 > local267) {
							local120 += Static268.anIntArray263[local267];
							local257 += Static370.anIntArray579[local267];
							local105 += Static22.anIntArray26[local267];
							local189 += Static177.anIntArray164[local267];
							local259 += Static620.anIntArray564[local267];
						}
						@Pc(305) int local305 = local261 - 5;
						if (local305 >= 0) {
							local189 -= Static177.anIntArray164[local305];
							local105 -= Static22.anIntArray26[local305];
							local259 -= Static620.anIntArray564[local305];
							local120 -= Static268.anIntArray263[local305];
							local257 -= Static370.anIntArray579[local305];
						}
						if (local261 >= 0 && local257 > 0 && local259 > 0) {
							local11[local89][local261] = Static565.method8894(local105 * 256 / local257, local120 / local259, local189 / local259);
						}
					}
				}
			}
			if (Static42.aBoolean166) {
				this.method3011(local52, arg0, local52 == 0 ? arg1 : null, local52 == 0 ? arg2 : null, -128, Static242.aClass22Array3[local52], local11);
			} else {
				this.method3020(local52 == 0 ? arg2 : null, local52 == 0 ? arg1 : null, Static242.aClass22Array3[local52], local52, arg0, local11);
			}
			this.aByteArrayArrayArray13[local52] = null;
			this.aByteArrayArrayArray10[local52] = null;
			this.aByteArrayArrayArray8[local52] = null;
			this.aByteArrayArrayArray9[local52] = null;
		}
		if (!this.aBoolean274) {
			if (Static361.anInt6292 != 0) {
				Static39.method679();
			}
			if (Static122.aBoolean174) {
				Static4.method79();
			}
		}
		for (local58 = 0; local58 < this.anInt3423; local58++) {
			Static242.aClass22Array3[local58].YA();
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[Lclient!dja;IIBLclient!ib;I)V")
	public final void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) Class88[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class5_Sub23 arg5, @OriginalArg(6) int arg6) {
		if (arg4 != -65) {
			this.anInt3416 = 126;
		}
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (!this.aBoolean274) {
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(24) Class88 local24 = arg1[local18];
				for (local26 = 0; local26 < 64; local26++) {
					for (local30 = 0; local30 < 64; local30++) {
						local36 = arg3 + local26;
						@Pc(40) int local40 = local30 + arg0;
						if (local36 >= 0 && local36 < this.anInt3410 && local40 >= 0 && local40 < this.anInt3416) {
							local24.method1576(local40, local36);
						}
					}
				}
			}
		}
		local18 = arg3 + arg6;
		@Pc(100) int local100 = arg0 + arg2;
		for (local26 = 0; local26 < this.anInt3423; local26++) {
			for (local30 = 0; local30 < 64; local30++) {
				for (local36 = 0; local36 < 64; local36++) {
					this.method3023(arg3 + local30, false, 0, local26, local100 + local36, arg5, 0, local36 + arg0, 0, local18 + local30);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBIIII)V")
	public final void method3015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg3; local3++) {
			for (local9 = arg4; local9 < arg0 + arg4; local9++) {
				if (local9 >= 0 && this.anInt3410 > local9 && local3 >= 0 && local3 < this.anInt3416) {
					this.anIntArrayArrayArray9[arg2][local9][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray9[arg2 - 1][local9][local3] - 960;
				}
			}
		}
		if (arg4 > 0 && this.anInt3410 > arg4) {
			for (local9 = arg1 + 1; local9 < arg1 + arg3; local9++) {
				if (local9 >= 0 && this.anInt3416 > local9) {
					this.anIntArrayArrayArray9[arg2][arg4][local9] = this.anIntArrayArrayArray9[arg2][arg4 - 1][local9];
				}
			}
		}
		if (arg1 > 0 && this.anInt3416 > arg1) {
			for (local9 = arg4 + 1; local9 < arg4 + arg0; local9++) {
				if (local9 >= 0 && local9 < this.anInt3410) {
					this.anIntArrayArrayArray9[arg2][local9][arg1] = this.anIntArrayArrayArray9[arg2][local9][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || arg4 >= this.anInt3410 || arg1 >= this.anInt3416) {
			return;
		}
		if (arg2 != 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1] != this.anIntArrayArrayArray9[arg2 - 1][arg4 - 1][arg1]) {
				this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray9[arg2 - 1][arg4][arg1 - 1] != this.anIntArrayArrayArray9[arg2][arg4][arg1 - 1]) {
				this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1 - 1] != this.anIntArrayArrayArray9[arg2 - 1][arg4 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1] != 0) {
			this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray9[arg2][arg4][arg1 - 1] != 0) {
			this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray9[arg2][arg4][arg1] = this.anIntArrayArrayArray9[arg2][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!pba;ILclient!ap;Lclient!ha;I[ZI[[BI[[BI[[BI)V")
	private void method3016(@OriginalArg(0) int arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(21) boolean[] local21 = arg3 != null && arg3.aBoolean39 ? Static465.aBooleanArrayArray7[arg2] : Static644.aBooleanArrayArray10[arg2];
		@Pc(39) int local39;
		@Pc(51) Class21 local51;
		@Pc(71) byte local71;
		@Pc(88) int local88;
		@Pc(93) int local93;
		if (arg6 > 0) {
			if (arg12 > 0) {
				local39 = arg11[arg12 - 1][arg6 - 1] & 0xFF;
				if (local39 > 0) {
					local51 = this.aClass290_4.method6974(local39 - 1);
					if (local51.anInt355 != -1 && local51.aBoolean39) {
						local71 = arg9[arg12 - 1][arg6 - 1];
						local88 = arg7[arg12 - 1][arg6 - 1] * 2 + 4 & 0x7;
						local93 = Static455.method6708(arg4, local51);
						if (Static36.aBooleanArrayArray3[local71][local88]) {
							Static389.anIntArray379[0] = local51.anInt355;
							Static522.anIntArray509[0] = local93;
							Static178.anIntArray165[0] = local51.anInt358;
							Static417.anIntArray425[0] = local51.anInt359;
							Static24.anIntArray28[0] = local51.anInt351;
							Static552.anIntArray525[0] = 256;
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local39 = arg11[arg12 + 1][arg6 - 1] & 0xFF;
				if (local39 > 0) {
					local51 = this.aClass290_4.method6974(local39 - 1);
					if (local51.anInt355 != -1 && local51.aBoolean39) {
						local71 = arg9[arg12 + 1][arg6 - 1];
						local88 = arg7[arg12 + 1][arg6 - 1] * 2 + 6 & 0x7;
						local93 = Static455.method6708(arg4, local51);
						if (Static36.aBooleanArrayArray3[local71][local88]) {
							Static389.anIntArray379[2] = local51.anInt355;
							Static522.anIntArray509[2] = local93;
							Static178.anIntArray165[2] = local51.anInt358;
							Static417.anIntArray425[2] = local51.anInt359;
							Static24.anIntArray28[2] = local51.anInt351;
							Static552.anIntArray525[2] = 512;
						}
					}
				}
			}
		}
		if (arg0 - 1 > arg6) {
			if (arg12 > 0) {
				local39 = arg11[arg12 - 1][arg6 + 1] & 0xFF;
				if (local39 > 0) {
					local51 = this.aClass290_4.method6974(local39 - 1);
					if (local51.anInt355 != -1 && local51.aBoolean39) {
						local71 = arg9[arg12 - 1][arg6 + 1];
						local88 = arg7[arg12 - 1][arg6 + 1] * 2 + 2 & 0x7;
						local93 = Static455.method6708(arg4, local51);
						if (Static36.aBooleanArrayArray3[local71][local88]) {
							Static389.anIntArray379[6] = local51.anInt355;
							Static522.anIntArray509[6] = local93;
							Static178.anIntArray165[6] = local51.anInt358;
							Static417.anIntArray425[6] = local51.anInt359;
							Static24.anIntArray28[6] = local51.anInt351;
							Static552.anIntArray525[6] = 64;
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local39 = arg11[arg12 + 1][arg6 + 1] & 0xFF;
				if (local39 > 0) {
					local51 = this.aClass290_4.method6974(local39 - 1);
					if (local51.anInt355 != -1 && local51.aBoolean39) {
						local71 = arg9[arg12 + 1][arg6 + 1];
						local88 = arg7[arg12 + 1][arg6 + 1] * 2 & 0x7;
						local93 = Static455.method6708(arg4, local51);
						if (Static36.aBooleanArrayArray3[local71][local88]) {
							Static389.anIntArray379[4] = local51.anInt355;
							Static522.anIntArray509[4] = local93;
							Static178.anIntArray165[4] = local51.anInt358;
							Static417.anIntArray425[4] = local51.anInt359;
							Static24.anIntArray28[4] = local51.anInt351;
							Static552.anIntArray525[4] = 128;
						}
					}
				}
			}
		}
		@Pc(545) int local545;
		@Pc(550) int local550;
		@Pc(552) int local552;
		@Pc(509) byte local509;
		if (arg6 > 0) {
			local39 = arg11[arg12][arg6 - 1] & 0xFF;
			if (local39 > 0) {
				local51 = this.aClass290_4.method6974(local39 - 1);
				if (local51.anInt355 != -1) {
					local71 = arg9[arg12][arg6 - 1];
					local509 = arg7[arg12][arg6 - 1];
					if (local51.aBoolean39) {
						local93 = 2;
						local545 = local509 * 2 + 4;
						local550 = Static455.method6708(arg4, local51);
						for (local552 = 0; local552 < 3; local552++) {
							local93 &= 0x7;
							local545 &= 0x7;
							if (Static36.aBooleanArrayArray3[local71][local545] && Static24.anIntArray28[local93] <= local51.anInt351) {
								Static389.anIntArray379[local93] = local51.anInt355;
								Static522.anIntArray509[local93] = local550;
								Static178.anIntArray165[local93] = local51.anInt358;
								Static417.anIntArray425[local93] = local51.anInt359;
								if (local51.anInt351 == Static24.anIntArray28[local93]) {
									Static552.anIntArray525[local93] |= 0x20;
								} else {
									Static552.anIntArray525[local93] = 32;
								}
								Static24.anIntArray28[local93] = local51.anInt351;
							}
							local545++;
							local93--;
						}
						if (!local21[--arg8 & 0x3]) {
							arg5[0] = Static465.aBooleanArrayArray7[local71][local509 + 2 & 0x3];
						}
					} else if (!local21[arg8 & 0x3]) {
						arg5[0] = Static644.aBooleanArrayArray10[local71][local509 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 - 1 > arg6) {
			local39 = arg11[arg12][arg6 + 1] & 0xFF;
			if (local39 > 0) {
				local51 = this.aClass290_4.method6974(local39 - 1);
				if (local51.anInt355 != -1) {
					local71 = arg9[arg12][arg6 + 1];
					local509 = arg7[arg12][arg6 + 1];
					if (local51.aBoolean39) {
						local93 = 4;
						local545 = local509 * 2 + 2;
						local550 = Static455.method6708(arg4, local51);
						for (local552 = 0; local552 < 3; local552++) {
							local93 &= 0x7;
							local545 &= 0x7;
							if (Static36.aBooleanArrayArray3[local71][local545] && Static24.anIntArray28[local93] <= local51.anInt351) {
								Static389.anIntArray379[local93] = local51.anInt355;
								Static522.anIntArray509[local93] = local550;
								Static178.anIntArray165[local93] = local51.anInt358;
								Static417.anIntArray425[local93] = local51.anInt359;
								if (Static24.anIntArray28[local93] == local51.anInt351) {
									Static552.anIntArray525[local93] |= 0x10;
								} else {
									Static552.anIntArray525[local93] = 16;
								}
								Static24.anIntArray28[local93] = local51.anInt351;
							}
							local545--;
							local93++;
						}
						if (!local21[arg8 + 2 & 0x3]) {
							arg5[2] = Static465.aBooleanArrayArray7[local71][--local509 & 0x3];
						}
					} else if (!local21[arg8 + 2 & 0x3]) {
						arg5[2] = Static644.aBooleanArrayArray10[local71][local509 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local39 = arg11[arg12 - 1][arg6] & 0xFF;
			if (local39 > 0) {
				local51 = this.aClass290_4.method6974(local39 - 1);
				if (local51.anInt355 != -1) {
					local71 = arg9[arg12 - 1][arg6];
					local509 = arg7[arg12 - 1][arg6];
					if (local51.aBoolean39) {
						local93 = 6;
						local545 = local509 * 2 + 4;
						local550 = Static455.method6708(arg4, local51);
						for (local552 = 0; local552 < 3; local552++) {
							local93 &= 0x7;
							local545 &= 0x7;
							if (Static36.aBooleanArrayArray3[local71][local545] && local51.anInt351 >= Static24.anIntArray28[local93]) {
								Static389.anIntArray379[local93] = local51.anInt355;
								Static522.anIntArray509[local93] = local550;
								Static178.anIntArray165[local93] = local51.anInt358;
								Static417.anIntArray425[local93] = local51.anInt359;
								if (Static24.anIntArray28[local93] == local51.anInt351) {
									Static552.anIntArray525[local93] |= 0x8;
								} else {
									Static552.anIntArray525[local93] = 8;
								}
								Static24.anIntArray28[local93] = local51.anInt351;
							}
							local545--;
							local93++;
						}
						if (!local21[arg8 + 3 & 0x3]) {
							arg5[3] = Static465.aBooleanArrayArray7[local71][local509 + 1 & 0x3];
						}
					} else if (!local21[arg8 + 3 & 0x3]) {
						arg5[3] = Static644.aBooleanArrayArray10[local71][local509 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg12) {
			local39 = arg11[arg12 + 1][arg6] & 0xFF;
			if (local39 > 0) {
				local51 = this.aClass290_4.method6974(local39 - 1);
				if (local51.anInt355 != -1) {
					local71 = arg9[arg12 + 1][arg6];
					local509 = arg7[arg12 + 1][arg6];
					if (local51.aBoolean39) {
						local93 = 4;
						local545 = local509 * 2 + 6;
						local550 = Static455.method6708(arg4, local51);
						for (local552 = 0; local552 < 3; local552++) {
							local545 &= 0x7;
							local93 &= 0x7;
							if (Static36.aBooleanArrayArray3[local71][local545] && Static24.anIntArray28[local93] <= local51.anInt351) {
								Static389.anIntArray379[local93] = local51.anInt355;
								Static522.anIntArray509[local93] = local550;
								Static178.anIntArray165[local93] = local51.anInt358;
								Static417.anIntArray425[local93] = local51.anInt359;
								if (local51.anInt351 == Static24.anIntArray28[local93]) {
									Static552.anIntArray525[local93] |= 0x4;
								} else {
									Static552.anIntArray525[local93] = 4;
								}
								Static24.anIntArray28[local93] = local51.anInt351;
							}
							local545++;
							local93--;
						}
						if (!local21[arg8 + 1 & 0x3]) {
							arg5[1] = Static465.aBooleanArrayArray7[local71][local509 + 3 & 0x3];
						}
					} else if (!local21[arg8 + 1 & 0x3]) {
						arg5[1] = Static644.aBooleanArrayArray10[local71][local509 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local39 = Static455.method6708(arg4, arg3);
		if (!arg3.aBoolean39) {
			return;
		}
		for (@Pc(1302) int local1302 = 0; local1302 < 8; local1302++) {
			@Pc(1313) int local1313 = local1302 - arg8 * 2 & 0x7;
			if (Static36.aBooleanArrayArray3[arg2][local1302] && arg3.anInt351 >= Static24.anIntArray28[local1313]) {
				Static389.anIntArray379[local1313] = arg3.anInt355;
				Static522.anIntArray509[local1313] = local39;
				Static178.anIntArray165[local1313] = arg3.anInt358;
				Static417.anIntArray425[local1313] = arg3.anInt359;
				if (Static24.anIntArray28[local1313] == arg3.anInt351) {
					Static552.anIntArray525[local1313] |= 0x2;
				} else {
					Static552.anIntArray525[local1313] = 2;
				}
				Static24.anIntArray28[local1313] = arg3.anInt351;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!ha;[Lclient!dja;B[[[I)V")
	public final void method3017(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class88[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!this.aBoolean274) {
			for (local19 = 0; local19 < 4; local19++) {
				for (local23 = 0; local23 < this.anInt3410; local23++) {
					for (local27 = 0; local27 < this.anInt3416; local27++) {
						if ((Static220.aByteArrayArrayArray14[local19][local23][local27] & 0x1) != 0) {
							@Pc(46) int local46 = local19;
							if ((Static220.aByteArrayArrayArray14[1][local23][local27] & 0x2) != 0) {
								local46 = local19 - 1;
							}
							if (local46 >= 0) {
								arg1[local46].method1572(local27, local23);
							}
						}
					}
				}
			}
		}
		for (local19 = 0; local19 < this.anInt3423; local19++) {
			local23 = 0;
			local27 = 0;
			if (!this.aBoolean274) {
				if (Static122.aBoolean174) {
					local23 = 2;
				}
				if (Static441.aBoolean587) {
					local27 = 8;
				}
				if (Static361.anInt6292 != 0) {
					local23 |= 0x1;
					if (Static554.aBoolean713 | local19 == 0) {
						local27 |= 0x10;
					}
				}
			}
			if (Static122.aBoolean174) {
				local27 |= 0x7;
			}
			if (!Static448.aBoolean589) {
				local27 |= 0x20;
			}
			@Pc(176) int[][] local176 = arg2 == null || local19 >= arg2.length ? this.anIntArrayArrayArray9[local19] : arg2[local19];
			Static187.method2706(local19, arg0.method7648(this.anInt3410, this.anInt3416, this.anIntArrayArrayArray9[local19], local176, local23, local27));
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIIII[Lclient!dja;Lclient!ib;)V")
	public final void method3018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class88[] arg7, @OriginalArg(9) Class5_Sub23 arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(52) int local52;
		if (!this.aBoolean274) {
			@Pc(18) Class88 local18 = arg7[arg2];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(40) int local40 = arg4 + Static289.method9259(local20 & 0x7, arg5, local24 & 0x7);
					local52 = arg1 + Static345.method5214(arg5, local20 & 0x7, local24 & 0x7);
					if (local40 > 0 && local40 < this.anInt3410 - 1 && local52 > 0 && this.anInt3416 - 1 > local52) {
						local18.method1576(local52, local40);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg3 & 0x7) * 8;
		@Pc(109) int local109 = (arg6 & 0x1FFFFFF8) << 3;
		local20 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		@Pc(131) byte local131 = 0;
		if (arg5 == 1) {
			local131 = 1;
		} else if (arg5 == 2) {
			local129 = 1;
			local131 = 1;
		} else if (arg5 == 3) {
			local129 = 1;
		}
		for (local52 = 0; local52 < this.anInt3423; local52++) {
			for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
				for (@Pc(170) int local170 = 0; local170 < 64; local170++) {
					if (arg0 == local52 && local166 >= local11 && local11 + 8 >= local166 && local103 <= local170 && local170 <= local103 + 8) {
						@Pc(239) int local239;
						@Pc(251) int local251;
						if (local11 + 8 == local166 || local170 == local103 + 8) {
							if (arg5 == 0) {
								local251 = local170 + arg1 - local103;
								local239 = arg4 + local166 - local11;
							} else if (arg5 == 1) {
								local251 = arg1 + local11 + 8 - local166;
								local239 = arg4 + local170 - local103;
							} else if (arg5 == 2) {
								local251 = local103 + arg1 + 8 - local170;
								local239 = arg4 + local11 + 8 - local166;
							} else {
								local239 = arg4 + local103 + 8 - local170;
								local251 = arg1 + local166 - local11;
							}
							this.method3023(local239, true, 0, arg2, local20 + local170, arg8, 0, local251, 0, local109 + local166);
						} else {
							local239 = Static289.method9259(local166 & 0x7, arg5, local170 & 0x7) + arg4;
							local251 = Static345.method5214(arg5, local166 & 0x7, local170 & 0x7) + arg1;
							this.method3023(local239, false, local129, arg2, local170 + local20, arg8, arg5, local251, local131, local109 + local166);
						}
						if (local166 == 63 || local170 == 63) {
							@Pc(388) byte local388 = 1;
							if (local166 == 63 && local170 == 63) {
								local388 = 3;
							}
							for (@Pc(400) int local400 = 0; local400 < local388; local400++) {
								@Pc(404) int local404 = local166;
								@Pc(406) int local406 = local170;
								if (local400 == 0) {
									local406 = local170 == 63 ? 64 : local170;
									local404 = local166 == 63 ? 64 : local166;
								} else if (local400 == 1) {
									local404 = 64;
								} else if (local400 == 2) {
									local406 = 64;
								}
								@Pc(482) int local482;
								@Pc(472) int local472;
								if (arg5 == 0) {
									local472 = arg1 + local406 - local103;
									local482 = arg4 + local404 - local11;
								} else if (arg5 == 1) {
									local472 = arg1 + local11 + 8 - local404;
									local482 = arg4 + local406 - local103;
								} else if (arg5 == 2) {
									local472 = arg1 + local103 + 8 - local406;
									local482 = local11 + arg4 + 8 - local404;
								} else {
									local482 = local103 + arg4 + 8 - local406;
									local472 = arg1 + local404 - local11;
								}
								if (local482 >= 0 && local482 < this.anInt3410 && local472 >= 0 && this.anInt3416 > local472) {
									this.anIntArrayArrayArray9[arg2][local482][local472] = this.anIntArrayArrayArray9[arg2][local129 + local239][local251 + local131];
								}
							}
						}
					} else {
						this.method3023(-1, false, 0, 0, 0, arg8, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIII)V")
	public final void method3019(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3423; local3++) {
			this.method3015(64, arg0, local3, 64, arg1);
		}
		if (-20411 != -20411) {
			this.method3014(-62, (Class88[]) null, 55, -9, (byte) -128, (Class5_Sub23) null, -48);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!s;Lclient!s;Lclient!s;ILclient!ha;[[II)V")
	private void method3020(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) int[][] arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3410; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3416; local7++) {
				if (Static49.anInt6791 == -1 || Static602.method8660(arg3, local7, Static49.anInt6791, local3)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray8[arg3][local3][local7];
					@Pc(46) byte local46 = this.aByteArrayArrayArray9[arg3][local3][local7];
					@Pc(57) int local57 = this.aByteArrayArrayArray10[arg3][local3][local7] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray13[arg3][local3][local7] & 0xFF;
					@Pc(81) Class21 local81 = local57 == 0 ? null : this.aClass290_4.method6974(local57 - 1);
					@Pc(94) Class274 local94 = local68 == 0 ? null : this.aClass218_2.method5200(local68 - 1);
					if (local37 == 0 && local81 == null) {
						local37 = 12;
					}
					@Pc(107) Class21 local107 = local81;
					if (local81 != null && local81.anInt355 == -1 && local81.anInt356 == -1) {
						local107 = local81;
						local81 = null;
					}
					if (local81 != null || local94 != null) {
						@Pc(136) int local136 = Static282.anIntArray273[local37];
						@Pc(140) int local140 = Static423.anIntArray431[local37];
						@Pc(155) int local155 = (local81 == null ? 0 : local140) + (local94 == null ? 0 : local136);
						@Pc(157) int local157 = 0;
						@Pc(159) int local159 = 0;
						@Pc(167) int local167 = local81 == null ? -1 : local81.anInt358;
						@Pc(175) int local175 = local94 == null ? -1 : local94.anInt7524;
						@Pc(178) int[] local178 = new int[local155];
						@Pc(181) int[] local181 = new int[local155];
						@Pc(184) int[] local184 = new int[local155];
						@Pc(187) int[] local187 = new int[local155];
						@Pc(190) int[] local190 = new int[local155];
						@Pc(193) int[] local193 = new int[local155];
						@Pc(208) int[] local208 = local81 == null || local81.anInt356 == -1 ? null : new int[local155];
						@Pc(218) int local218;
						if (local81 == null) {
							local159 = local140;
						} else {
							for (local218 = 0; local218 < local140; local218++) {
								local178[local157] = Static543.anIntArrayArray49[local37][local159];
								local181[local157] = Static467.anIntArrayArray46[local37][local159];
								local184[local157] = Static344.anIntArrayArray39[local37][local159];
								local190[local157] = local167;
								local193[local157] = local81.anInt359;
								local187[local157] = local81.anInt355;
								if (local208 != null) {
									local208[local157] = local81.anInt356;
								}
								local159++;
								local157++;
							}
							if (!this.aBoolean274 && arg3 == 0) {
								Static198.method2856(local3, local7, local81.anInt350, local81.anInt348 * 8, local81.anInt349);
							}
						}
						if (local94 != null) {
							for (local218 = 0; local218 < local136; local218++) {
								local178[local157] = Static543.anIntArrayArray49[local37][local159];
								local181[local157] = Static467.anIntArrayArray46[local37][local159];
								local184[local157] = Static344.anIntArrayArray39[local37][local159];
								local190[local157] = local175;
								local193[local157] = local94.anInt7514;
								local187[local157] = arg5[local3][local7];
								if (local208 != null) {
									local208[local157] = local187[local157];
								}
								local159++;
								local157++;
							}
						}
						local218 = this.anIntArray197.length;
						@Pc(378) int[] local378 = new int[local218];
						@Pc(381) int[] local381 = new int[local218];
						@Pc(393) int[] local393 = arg0 == null ? null : new int[local218];
						@Pc(405) int[] local405 = arg0 == null && arg1 == null ? null : new int[local218];
						@Pc(414) int local414;
						@Pc(419) int local419;
						@Pc(517) int local517;
						@Pc(525) int local525;
						for (@Pc(407) int local407 = 0; local407 < local218; local407++) {
							local414 = this.anIntArray197[local407];
							local419 = this.anIntArray198[local407];
							if (local46 == 0) {
								local378[local407] = local414;
								local381[local407] = local419;
							} else if (local46 == 1) {
								local378[local407] = local419;
								local381[local407] = 512 - local414;
							} else if (local46 == 2) {
								local378[local407] = 512 - local414;
								local381[local407] = 512 - local419;
							} else if (local46 == 3) {
								local378[local407] = 512 - local419;
								local381[local407] = local414;
							}
							if (local393 != null && Static36.aBooleanArrayArray3[local37][local407]) {
								local517 = (local3 << 9) + local378[local407];
								local525 = (local7 << 9) + local381[local407];
								local393[local407] = arg0.method8032(local517, local525) - arg2.method8032(local517, local525);
							}
							if (local405 != null) {
								if (arg0 != null && !Static36.aBooleanArrayArray3[local37][local407]) {
									local517 = local378[local407] + (local3 << 9);
									local525 = local381[local407] + (local7 << 9);
									local405[local407] = arg2.method8032(local517, local525) - arg0.method8032(local517, local525);
								} else if (arg1 != null && !Static640.aBooleanArrayArray9[local37][local407]) {
									local517 = (local3 << 9) + local378[local407];
									local525 = local381[local407] + (local7 << 9);
									local405[local407] = arg1.method8032(local517, local525) - arg2.method8032(local517, local525);
								}
							}
						}
						local414 = arg2.method8038(local7, local3);
						local419 = arg2.method8038(local7, local3 + 1);
						local517 = arg2.method8038(local7 + 1, local3 + 1);
						local525 = arg2.method8038(local7 + 1, local3);
						@Pc(671) boolean local671 = Static90.method1353(1, local7, local3);
						if (local671 && arg3 > 1 || !local671 && arg3 > 0) {
							@Pc(692) boolean local692 = true;
							if (local94 != null && !local94.aBoolean585) {
								local692 = false;
							} else if (local68 == 0 && local37 != 0) {
								local692 = false;
							} else if (local57 > 0 && local107 != null && !local107.aBoolean38) {
								local692 = false;
							}
							if (local692 && local414 == local419 && local517 == local414 && local414 == local525) {
								this.aByteArrayArrayArray12[arg3][local3][local7] = (byte) (this.aByteArrayArrayArray12[arg3][local3][local7] | 0x4);
							}
						}
						@Pc(783) int local783 = 0;
						@Pc(785) int local785 = 0;
						@Pc(787) int local787 = 0;
						if (this.aBoolean274) {
							local783 = Static291.method4315(local3, local7);
							local785 = Static104.method1524(local3, local7);
							local787 = Static186.method2704(local3, local7);
						}
						arg2.method8039(local3, local7, local378, local393, local381, local405, local178, local181, local184, local187, local208, local190, local193, local783, local785, local787);
						Static529.method7630(arg3, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I[[IB)V")
	public final void method3022(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray9[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3410 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3416 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
		if (-43 <= -57) {
			this.method3011(-116, (Class57) null, (Class22) null, (Class22) null, 73, (Class22) null, (int[][]) null);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZBIIILclient!ib;IIII)V")
	private void method3023(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg6 == 1) {
			arg8 = 1;
		} else if (arg6 == 2) {
			arg2 = 1;
			arg8 = 1;
		} else if (arg6 == 3) {
			arg2 = 1;
		}
		@Pc(87) int local87;
		if (arg0 < 0 || arg0 >= this.anInt3410 || arg7 < 0 || this.anInt3416 <= arg7) {
			while (true) {
				local87 = arg5.method8529();
				if (local87 == 0) {
					return;
				}
				if (local87 == 1) {
					arg5.method8529();
					return;
				}
				if (local87 <= 49) {
					arg5.method8529();
				}
			}
			return;
		}
		if (!this.aBoolean274 && !arg1) {
			Static220.aByteArrayArrayArray14[arg3][arg0][arg7] = 0;
		}
		while (true) {
			local87 = arg5.method8529();
			if (local87 == 0) {
				if (this.aBoolean274) {
					this.anIntArrayArrayArray9[0][arg0 + arg2][arg7 + arg8] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray9[0][arg0 + arg2][arg8 + arg7] = -Static623.method8763(arg4 + 556238, arg9 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray9[arg3][arg0 + arg2][arg8 + arg7] = this.anIntArrayArrayArray9[arg3 - 1][arg0 + arg2][arg8 + arg7] - 960;
					return;
				}
			}
			if (local87 == 1) {
				@Pc(178) int local178 = arg5.method8529();
				if (this.aBoolean274) {
					this.anIntArrayArrayArray9[0][arg0 + arg2][arg7 + arg8] = local178 * 8 << 2;
					return;
				}
				if (local178 == 1) {
					local178 = 0;
				}
				if (arg3 == 0) {
					this.anIntArrayArrayArray9[0][arg2 + arg0][arg7 + arg8] = -local178 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray9[arg3][arg2 + arg0][arg8 + arg7] = this.anIntArrayArrayArray9[arg3 - 1][arg0 + arg2][arg8 + arg7] - (local178 * 8 << 2);
				return;
			}
			if (local87 <= 49) {
				if (arg1) {
					arg5.method8529();
				} else {
					this.aByteArrayArrayArray10[arg3][arg0][arg7] = arg5.method8488();
					this.aByteArrayArrayArray8[arg3][arg0][arg7] = (byte) ((local87 - 2) / 4);
					this.aByteArrayArrayArray9[arg3][arg0][arg7] = (byte) (local87 + arg6 - 2 & 0x3);
				}
			} else if (local87 <= 81) {
				if (!this.aBoolean274 && !arg1) {
					Static220.aByteArrayArrayArray14[arg3][arg0][arg7] = (byte) (local87 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray13[arg3][arg0][arg7] = (byte) (local87 - 81);
			}
		}
	}
}
