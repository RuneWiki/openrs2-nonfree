import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "Lclient!hda;")
	public static Class146 aClass146_3;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_3 = new Class344(0, Static476.aClass279_16, Static476.aClass279_16, 0, 1);

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_4 = new Class344(1, Static476.aClass279_16, 2);

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_5 = new Class344(2, Static476.aClass279_16, Static476.aClass279_16, 2, 3);

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_6 = new Class344(3, Static476.aClass279_16, 3);

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_7 = new Class344(4, Static476.aClass279_16, Static476.aClass279_16, 3, 4);

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_8 = new Class344(5, Static476.aClass279_16, 4);

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_9 = new Class344(6, Static476.aClass279_16, 4);

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_10 = new Class344(7, Static476.aClass279_16, Static476.aClass279_16, 4, 5);

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_11 = new Class344(8, Static476.aClass279_16, Static476.aClass279_16, 5, 98, true, true);

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_12 = new Class344(9, Static476.aClass279_16, 99);

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_13 = new Class344(10, Static476.aClass279_16, 100);

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_14 = new Class344(11, Static476.aClass279_17, Static476.aClass279_17, 0, 92, true, true);

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_15 = new Class344(12, Static476.aClass279_17, Static476.aClass279_17, 92, 92);

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "Lclient!sp;")
	private static final Class344 aClass344_16 = new Class344(13, Static476.aClass279_17, Static476.aClass279_17, 92, 93);

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_17 = new Class344(14, Static476.aClass279_17, Static476.aClass279_17, 94, 95);

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_18 = new Class344(15, Static476.aClass279_17, Static476.aClass279_17, 96, 97);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_19 = new Class344(16, Static476.aClass279_17, 97);

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_20 = new Class344(17, Static476.aClass279_17, 97);

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_21 = new Class344(18, Static476.aClass279_17, 100);

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_22 = new Class344(19, Static476.aClass279_17, 100);

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "Lclient!sp;")
	public static final Class344 aClass344_23 = new Class344(20, Static476.aClass279_17, 100);

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "[I")
	public static final int[] anIntArray535 = new int[1000];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!kia;B)V")
	public static void method8151(@OriginalArg(0) Class206 arg0) {
		@Pc(8) Class3_Sub28_Sub2 local8 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		@Pc(15) int local15;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(56) int local56;
		if (Static407.aClass206_13 == arg0) {
			local15 = local8.method5303();
			if (local15 == 65535) {
				local15 = -1;
			}
			local26 = local8.method5308();
			local34 = (local26 >> 4 & 0x7) + Static664.anInt10583;
			local40 = (local26 & 0x7) + Static179.anInt3229;
			local44 = local8.method5293();
			local48 = local44 >> 2;
			local52 = local44 & 0x3;
			local56 = Static501.anIntArray467[local48];
			Static266.method4100(local40, local56, local34, Static214.anInt4161, local52, local48, local15);
		} else if (Static563.aClass206_15 == arg0) {
			local15 = local8.method5308();
			local26 = (local15 & 0x7) + Static179.anInt3229;
			local34 = local26 + Static339.anInt5859;
			local40 = Static664.anInt10583 + (local15 >> 4 & 0x7);
			local44 = local40 + Static714.anInt11156;
			local48 = local8.method5301();
			@Pc(115) Class3_Sub20 local115 = (Class3_Sub20) Static46.aClass136_5.method3503((long) (local44 | local34 << 14 | Static214.anInt4161 << 28));
			if (local115 != null) {
				for (@Pc(123) Class3_Sub50 local123 = (Class3_Sub50) local115.aClass357_9.method8391(); local123 != null; local123 = (Class3_Sub50) local115.aClass357_9.method8392()) {
					if ((local48 & 0x7FFF) == local123.anInt9937) {
						local123.method9446();
						break;
					}
				}
				if (local115.aClass357_9.method8404()) {
					local115.method9446();
				}
				if (local40 >= 0 && local26 >= 0 && Static362.anInt8653 > local40 && local26 < Static206.anInt11291) {
					Static535.method7523(local26, Static214.anInt4161, local40);
				}
			}
		} else {
			@Pc(248) int local248;
			@Pc(257) int local257;
			@Pc(262) int local262;
			@Pc(264) int local264;
			@Pc(348) int local348;
			@Pc(409) int local409;
			@Pc(380) int local380;
			if (arg0 == Static372.aClass206_12) {
				local15 = local8.method5293();
				local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
				local34 = (local15 & 0x7) + Static179.anInt3229;
				local40 = local8.method5301();
				@Pc(232) Class144 local232 = Static70.aClass323_1.method7792(local40);
				local48 = local8.method5308();
				local52 = local8.method5308();
				local56 = local52 >> 2;
				local248 = Static501.anIntArray467[local56];
				if (local56 == 11) {
					local56 = 10;
				}
				local257 = 0;
				if (local232.aByteArray25 != null) {
					local262 = -1;
					for (local264 = 0; local264 < local232.aByteArray25.length; local264++) {
						if (local56 == local232.aByteArray25[local264]) {
							local262 = local264;
							break;
						}
					}
					local257 = local232.anIntArrayArray19[local262].length;
				}
				local262 = 0;
				if (local232.aShortArray69 != null) {
					local262 = local232.aShortArray69.length;
				}
				local264 = 0;
				if (local232.aShortArray68 != null) {
					local264 = local232.aShortArray68.length;
				}
				if ((local48 & 0x1) == 1) {
					Static613.method8359(local26, (Class241) null, local248, Static214.anInt4161, local34);
				} else {
					@Pc(338) int[] local338 = null;
					if ((local48 & 0x2) == 2) {
						local338 = new int[local257];
						for (local348 = 0; local348 < local257; local348++) {
							local338[local348] = local8.method5272();
						}
					}
					@Pc(368) short[] local368 = null;
					if ((local48 & 0x4) == 4) {
						local368 = new short[local262];
						for (local380 = 0; local380 < local262; local380++) {
							local368[local380] = (short) local8.method5272();
						}
					}
					@Pc(397) short[] local397 = null;
					if ((local48 & 0x8) == 8) {
						local397 = new short[local264];
						for (local409 = 0; local409 < local264; local409++) {
							local397[local409] = (short) local8.method5272();
						}
					}
					Static613.method8359(local26, new Class241((long) Static195.aLong243++, local338, local368, local397), local248, Static214.anInt4161, local34);
				}
			} else if (arg0 == Static189.aClass206_6) {
				local15 = local8.method5303();
				local26 = local8.method5305();
				local34 = local8.method5322(-16);
				local40 = (local34 & 0x7) + Static179.anInt3229;
				local44 = Static339.anInt5859 + local40;
				local48 = Static664.anInt10583 + (local34 >> 4 & 0x7);
				local52 = local48 + Static714.anInt11156;
				local56 = local8.method5272();
				if (local26 != Static584.anInt9539) {
					@Pc(527) boolean local527 = local48 >= 0 && local40 >= 0 && Static362.anInt8653 > local48 && local40 < Static206.anInt11291;
					if (local527 || Static285.method4303(Static231.anInt4426)) {
						Static286.method6359(Static214.anInt4161, local52, local44, new Class3_Sub50(local56, local15));
						if (local527) {
							Static535.method7523(local40, Static214.anInt4161, local48);
						}
					}
				}
			} else if (arg0 == Static710.aClass206_18) {
				local15 = local8.method5308();
				local26 = local15 >> 2;
				local34 = local15 & 0x3;
				local40 = Static501.anIntArray467[local26];
				local44 = local8.method5322(-25);
				local48 = Static664.anInt10583 + (local44 >> 4 & 0x7);
				local52 = Static179.anInt3229 + (local44 & 0x7);
				if (Static285.method4303(Static231.anInt4426) || local48 >= 0 && local52 >= 0 && local48 < Static362.anInt8653 && local52 < Static206.anInt11291) {
					Static161.method2560(local34, local52, local26, local40, -1, local48, Static214.anInt4161);
				}
			} else {
				@Pc(730) int local730;
				if (Static686.aClass206_14 == arg0) {
					local15 = local8.method5322(-107);
					local26 = (local15 >> 4 & 0xF) + Static664.anInt10583 * 2;
					local34 = Static179.anInt3229 * 2 + (local15 & 0xF);
					local40 = local8.method5322(-67);
					@Pc(681) boolean local681 = (local40 & 0x1) != 0;
					@Pc(693) boolean local693 = (local40 & 0x2) != 0;
					local52 = local693 ? local40 >> 2 : -1;
					local56 = local8.method5288() + local26;
					local248 = local8.method5288() + local34;
					local257 = local8.method5281();
					local262 = local8.method5281();
					local264 = local8.method5272();
					local730 = local8.method5322(-36);
					if (local693) {
						local730 = (byte) local730;
					} else {
						local730 *= 4;
					}
					local348 = local8.method5322(-82) * 4;
					local380 = local8.method5272();
					local409 = local8.method5272();
					@Pc(759) int local759 = local8.method5322(-17);
					@Pc(763) int local763 = local8.method5272();
					if (local759 == 255) {
						local759 = -1;
					}
					if (local26 >= 0 && local34 >= 0 && local26 < Static362.anInt8653 * 2 && local34 < Static362.anInt8653 * 2 && local56 >= 0 && local248 >= 0 && Static206.anInt11291 * 2 > local56 && local248 < Static206.anInt11291 * 2 && local264 != 65535) {
						local348 <<= 0x2;
						local248 = local248 * 256;
						local730 <<= 0x2;
						local34 *= 256;
						local56 = local56 * 256;
						local26 = local26 * 256;
						local763 <<= 0x2;
						if (local257 != 0 && local52 != -1) {
							@Pc(868) Class19_Sub1_Sub3_Sub2 local868 = null;
							@Pc(878) int local878;
							if (local257 < 0) {
								local878 = -local257 - 1;
								if (Static584.anInt9539 == local878) {
									local868 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2;
								} else {
									local868 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local878];
								}
							} else {
								local878 = local257 - 1;
								@Pc(900) Class3_Sub13 local900 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local878);
								if (local900 != null) {
									local868 = local900.aClass19_Sub1_Sub3_Sub2_Sub1_2;
								}
							}
							if (local868 != null) {
								@Pc(911) Class274 local911 = local868.method6600();
								if (local911.anIntArrayArray44 != null && local911.anIntArrayArray44[local52] != null) {
									local730 -= local911.anIntArrayArray44[local52][1];
								}
								if (local911.anIntArrayArray43 != null && local911.anIntArrayArray43[local52] != null) {
									local730 -= local911.anIntArrayArray43[local52][1];
								}
							}
						}
						@Pc(974) Class19_Sub1_Sub3_Sub1 local974 = new Class19_Sub1_Sub3_Sub1(local264, Static214.anInt4161, Static214.anInt4161, local26, local34, local730, local380 + Static269.anInt4883, local409 - -Static269.anInt4883, local759, local763, local257, local262, local348, local681, local52);
						local974.method2618(Static505.method7237(Static214.anInt4161, local248, local56) - local348, local248, local56, local380 + Static269.anInt4883);
						Static358.aClass357_33.method8401(new Class3_Sub4_Sub14(local974));
					}
				} else if (arg0 == Static605.aClass206_16) {
					local15 = local8.method5272();
					local26 = local8.method5322(-82);
					Static70.aClass323_1.method7792(local15).method3641(local26);
				} else if (Static333.aClass206_10 == arg0) {
					local15 = local8.method5322(-92);
					local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local34 = (local15 & 0x7) + Static179.anInt3229;
					local40 = local8.method5272();
					if (local40 == 65535) {
						local40 = -1;
					}
					local44 = local8.method5322(-92);
					local48 = local44 >> 4 & 0xF;
					local52 = local44 & 0x7;
					local56 = local8.method5322(-88);
					local248 = local8.method5322(-116);
					local257 = local8.method5272();
					if (local26 >= 0 && local34 >= 0 && Static362.anInt8653 > local26 && local34 < Static206.anInt11291) {
						local262 = local48 + 1;
						if (local26 - local262 <= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] && local262 + local26 >= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] && local34 - local262 <= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] <= local262 + local34) {
							Static646.method8722(local40, local248, local56, local257, local52, local48 + (local34 << 8) + (Static214.anInt4161 << 24) + (local26 << 16));
						}
					}
				} else if (Static636.aClass206_17 == arg0) {
					local8.method5322(-39);
					local15 = local8.method5322(-119);
					local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local34 = (local15 & 0x7) + Static179.anInt3229;
					local40 = local8.method5272();
					local44 = local8.method5322(-82);
					local48 = local8.method5307();
					@Pc(1224) String local1224 = local8.method5295();
					Static423.method6238(local1224, Static214.anInt4161, local34, local40, local44, local48, local26);
				} else if (arg0 == Static220.aClass206_7) {
					local15 = local8.method5322(-27);
					local26 = (local15 & 0x7) + Static179.anInt3229;
					local34 = Static339.anInt5859 + local26;
					local40 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local44 = local40 + Static714.anInt11156;
					local48 = local8.method5272();
					local52 = local8.method5272();
					local56 = local8.method5272();
					if (Static46.aClass136_5 != null) {
						@Pc(1293) Class3_Sub20 local1293 = (Class3_Sub20) Static46.aClass136_5.method3503((long) (local44 | local34 << 14 | Static214.anInt4161 << 28));
						if (local1293 != null) {
							for (@Pc(1301) Class3_Sub50 local1301 = (Class3_Sub50) local1293.aClass357_9.method8391(); local1301 != null; local1301 = (Class3_Sub50) local1293.aClass357_9.method8392()) {
								if ((local48 & 0x7FFF) == local1301.anInt9937 && local52 == local1301.anInt9936) {
									local1301.method9446();
									local1301.anInt9936 = local56;
									Static286.method6359(Static214.anInt4161, local44, local34, local1301);
									break;
								}
							}
							if (local40 >= 0 && local26 >= 0 && local40 < Static362.anInt8653 && Static206.anInt11291 > local26) {
								Static535.method7523(local26, Static214.anInt4161, local40);
							}
						}
					}
				} else if (arg0 == Static247.aClass206_8) {
					local15 = local8.method5322(-52);
					local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local34 = (local15 & 0x7) + Static179.anInt3229;
					local40 = local8.method5272();
					if (local40 == 65535) {
						local40 = -1;
					}
					local44 = local8.method5322(-48);
					local48 = local44 >> 4 & 0xF;
					local52 = local44 & 0x7;
					local56 = local8.method5322(-60);
					local248 = local8.method5322(-28);
					local257 = local8.method5272();
					if (local26 >= 0 && local34 >= 0 && local26 < Static362.anInt8653 && Static206.anInt11291 > local34) {
						local262 = local48 + 1;
						if (local26 - local262 <= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] && local26 + local262 >= Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] >= local34 - local262 && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0] <= local262 + local34) {
							Static189.method2878(local257, local56, local52, (local34 << 8) + (Static214.anInt4161 << 24) + (local26 << 16) + local48, local248, local40);
						}
					}
				} else if (Static354.aClass206_11 == arg0) {
					local15 = local8.method5293();
					local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local34 = (local15 & 0x7) + Static179.anInt3229;
					local40 = local8.method5322(-104);
					local44 = local40 >> 2;
					local48 = local40 & 0x3;
					local52 = Static501.anIntArray467[local44];
					local56 = local8.method5272();
					if (Static285.method4303(Static231.anInt4426) || local26 >= 0 && local34 >= 0 && local26 < Static362.anInt8653 && local34 < Static206.anInt11291) {
						Static161.method2560(local48, local34, local44, local52, local56, local26, Static214.anInt4161);
					}
				} else if (Static140.aClass206_4 == arg0) {
					local15 = local8.method5322(-53);
					local26 = Static664.anInt10583 + (local15 >> 4 & 0x7);
					local34 = Static179.anInt3229 + (local15 & 0x7);
					local40 = local8.method5272();
					if (local40 == 65535) {
						local40 = -1;
					}
					local44 = local8.method5322(-15);
					local48 = local8.method5272();
					local52 = local8.method5322(-43);
					if (local26 >= 0 && local34 >= 0 && Static362.anInt8653 > local26 && local34 < Static206.anInt11291) {
						if (local40 == -1) {
							@Pc(1714) Class3_Sub4_Sub9 local1714 = (Class3_Sub4_Sub9) Static59.aClass136_6.method3503((long) (local26 << 16 | local34));
							if (local1714 != null) {
								local1714.aClass19_Sub1_Sub3_Sub4_1.method6650();
								local1714.method9446();
								return;
							}
						} else {
							local56 = local26 * 512 + 256;
							local248 = local34 * 512 + 256;
							local257 = Static214.anInt4161;
							if (local257 < 3 && Static135.method2226(local26, local34)) {
								local257++;
							}
							@Pc(1778) Class19_Sub1_Sub3_Sub4 local1778 = new Class19_Sub1_Sub3_Sub4(local40, local48, Static214.anInt4161, local257, local56, Static505.method7237(Static214.anInt4161, local248, local56) - local44, local248, local26, local26, local34, local34, local52, false);
							Static59.aClass136_6.method3508((long) (local26 << 16 | local34), new Class3_Sub4_Sub9(local1778));
						}
					}
				} else if (arg0 == Static152.aClass206_5) {
					local15 = local8.method5322(-10);
					@Pc(1811) boolean local1811 = (local15 & 0x80) != 0;
					local34 = Static664.anInt10583 + (local15 >> 3 & 0x7);
					local40 = Static179.anInt3229 + (local15 & 0x7);
					local44 = local8.method5288() + local34;
					local48 = local40 + local8.method5288();
					local52 = local8.method5281();
					local56 = local8.method5272();
					local248 = local8.method5322(-18) * 4;
					local257 = local8.method5322(-69) * 4;
					local262 = local8.method5272();
					local264 = local8.method5272();
					local730 = local8.method5322(-68);
					if (local730 == 255) {
						local730 = -1;
					}
					local348 = local8.method5272();
					if (local34 >= 0 && local40 >= 0 && local34 < Static362.anInt8653 && Static206.anInt11291 > local40 && local44 >= 0 && local48 >= 0 && local44 < Static362.anInt8653 && Static206.anInt11291 > local48 && local56 != 65535) {
						local44 = local44 * 512 + 256;
						local248 <<= 0x2;
						local40 = local40 * 512 + 256;
						local257 <<= 0x2;
						local348 <<= 0x2;
						local34 = local34 * 512 + 256;
						local48 = local48 * 512 + 256;
						@Pc(1996) Class19_Sub1_Sub3_Sub1 local1996 = new Class19_Sub1_Sub3_Sub1(local56, Static214.anInt4161, Static214.anInt4161, local34, local40, local248, local262 + Static269.anInt4883, local264 - -Static269.anInt4883, local730, local348, 0, local52, local257, local1811, -1);
						local1996.method2618(Static505.method7237(Static214.anInt4161, local48, local44) - local257, local48, local44, local262 + Static269.anInt4883);
						Static358.aClass357_33.method8401(new Class3_Sub4_Sub14(local1996));
					}
				} else if (arg0 == Static69.aClass206_1) {
					local15 = local8.method5272();
					local26 = local8.method5272();
					local34 = local8.method5334();
					local40 = Static179.anInt3229 + (local34 & 0x7);
					local44 = local40 + Static339.anInt5859;
					local48 = Static664.anInt10583 + (local34 >> 4 & 0x7);
					local52 = Static714.anInt11156 + local48;
					@Pc(2085) boolean local2085 = local48 >= 0 && local40 >= 0 && local48 < Static362.anInt8653 && local40 < Static206.anInt11291;
					if (local2085 || Static285.method4303(Static231.anInt4426)) {
						Static286.method6359(Static214.anInt4161, local52, local44, new Class3_Sub50(local26, local15));
						if (local2085) {
							Static535.method7523(local40, Static214.anInt4161, local48);
						}
					}
				} else {
					Static64.method799("T3 - " + arg0, (Throwable) null);
					Static483.method7049(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!q;Z)I")
	public static int method8152(@OriginalArg(0) Class3_Sub4_Sub17 arg0) {
		@Pc(19) String local19 = Static130.method2165(arg0);
		return Static381.aClass330_7.method7905(Static432.aClass9Array28, local19);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class343 local14 = local7.aClass343_2; local14 != null; local14 = local14.aClass343_4) {
			@Pc(18) Class19_Sub1_Sub3 local18 = local14.aClass19_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort121 == arg1 && local18.aShort124 == arg2) {
				Static458.method6791(local18, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)[Lclient!sp;")
	public static Class344[] method8155() {
		return new Class344[] { aClass344_3, aClass344_4, aClass344_5, aClass344_6, aClass344_7, aClass344_8, aClass344_9, aClass344_10, aClass344_11, aClass344_12, aClass344_13, aClass344_14, aClass344_15, aClass344_16, aClass344_17, aClass344_18, aClass344_19, aClass344_20, aClass344_21, aClass344_22, aClass344_23 };
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method8157(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg1 == null || arg3 == null) {
			return false;
		} else if (arg1.startsWith("#") || arg3.startsWith("#")) {
			return arg1.equals(arg3);
		} else {
			return arg0.equals(arg2);
		}
	}
}
