import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public static int anInt2131;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Lclient!tr;")
	public static Class110 aClass110_6;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
	public static final int anInt2138 = -1;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	public static void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class44 local10 = new Class44(16);
		for (@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) Static384.aClass44_39.method950(); local15 != null; local15 = (Class3_Sub16) Static384.aClass44_39.method949()) {
			local15.method5700();
			@Pc(26) int local26 = (int) (local15.aLong240 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong240 >> 14 & 0x3FFFL) - arg0;
			@Pc(46) int local46 = (int) (local15.aLong240 & 0x3FFFL) - arg1;
			if (local46 >= 0 && local37 >= 0 && Static12.anInt161 > local46 && local37 < Static44.anInt787) {
				local10.method948((long) (local37 << 14 | local26 << 28 | local46), local15);
			}
		}
		Static384.aClass44_39 = local10;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public static void method1776() {
		for (@Pc(3) int local3 = 0; local3 < Static117.anInt2227; local3++) {
			@Pc(16) int local16 = Static336.anIntArray236[local3]--;
			if (Static336.anIntArray236[local3] >= -10) {
				@Pc(91) Class71 local91 = Static205.aClass71Array2[local3];
				if (local91 == null) {
					local91 = Static397.method1481(Static389.aClass20_98, Static127.anIntArray245[local3], 0);
					if (local91 == null) {
						continue;
					}
					Static336.anIntArray236[local3] += local91.method1483();
					Static205.aClass71Array2[local3] = local91;
				}
				if (Static336.anIntArray236[local3] < 0) {
					@Pc(138) int local138;
					if (Static250.anIntArray578[local3] == 0) {
						local138 = Static289.anIntArray561[local3] * Static164.aClass154_Sub1_1.anInt6066 >> 8;
					} else {
						@Pc(148) int local148 = Static250.anIntArray578[local3] >> 24 & 0x3;
						if (Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 == local148) {
							@Pc(160) int local160 = (Static250.anIntArray578[local3] & 0xFF) * 128;
							@Pc(168) int local168 = Static250.anIntArray578[local3] >> 16 & 0xFF;
							@Pc(177) int local177 = local168 * 128 + 64 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774;
							if (local177 < 0) {
								local177 = -local177;
							}
							@Pc(193) int local193 = Static250.anIntArray578[local3] >> 8 & 0xFF;
							@Pc(203) int local203 = local193 * 128 + 64 - Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766;
							if (local203 < 0) {
								local203 = -local203;
							}
							@Pc(214) int local214 = local203 + local177 - 128;
							if (local214 > local160) {
								Static336.anIntArray236[local3] = -100;
								continue;
							}
							if (local214 < 0) {
								local214 = 0;
							}
							local138 = (local160 - local214) * Static164.aClass154_Sub1_1.anInt6055 * Static289.anIntArray561[local3] / local160 >> 8;
						} else {
							local138 = 0;
						}
					}
					if (local138 > 0) {
						@Pc(257) Class3_Sub29_Sub1 local257 = local91.method1484().method3841(Static257.aClass41_1);
						@Pc(262) Class3_Sub8_Sub1 local262 = Static396.method1245(local257, local138);
						local262.method1248(Static138.anIntArray276[local3] - 1);
						Static137.aClass3_Sub8_Sub2_2.method1710(local262);
					}
					Static336.anIntArray236[local3] = -100;
				}
			} else {
				Static117.anInt2227--;
				for (@Pc(30) int local30 = local3; local30 < Static117.anInt2227; local30++) {
					Static127.anIntArray245[local30] = Static127.anIntArray245[local30 + 1];
					Static205.aClass71Array2[local30] = Static205.aClass71Array2[local30 + 1];
					Static138.anIntArray276[local30] = Static138.anIntArray276[local30 + 1];
					Static336.anIntArray236[local30] = Static336.anIntArray236[local30 + 1];
					Static250.anIntArray578[local30] = Static250.anIntArray578[local30 + 1];
					Static289.anIntArray561[local30] = Static289.anIntArray561[local30 + 1];
				}
				local3--;
			}
		}
		if (Static298.aBoolean402 && !Static225.method3724()) {
			if (Static164.aClass154_Sub1_1.anInt6064 != 0 && Static4.anInt110 != -1) {
				Static323.method4975(Static164.aClass154_Sub1_1.anInt6064, Static103.aClass20_26, Static4.anInt110);
			}
			Static298.aBoolean402 = false;
		} else if (Static164.aClass154_Sub1_1.anInt6064 != 0 && Static4.anInt110 != -1 && !Static225.method3724()) {
			Static229.method3783(Static13.aClass244_73);
			Static23.aClass3_Sub5_Sub1_1.method2782(Static4.anInt110);
			Static4.anInt110 = -1;
		}
	}
}
