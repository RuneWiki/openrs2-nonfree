import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!s", name = "u", descriptor = "[I")
	public static final int[] anIntArray613 = new int[8];

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
	public static void method5066() {
		Static367.anInt6719 = 0;
		@Pc(11) int local11 = Static5.aClass1_Sub3_Sub1_1.method1177();
		@Pc(15) int local15 = Static5.aClass1_Sub3_Sub1_1.method1171();
		@Pc(19) int local19 = Static5.aClass1_Sub3_Sub1_1.method1177();
		@Pc(30) boolean local30 = Static5.aClass1_Sub3_Sub1_1.method1218() == 1;
		Static23.method493();
		Static76.method1407(local15);
		@Pc(43) int local43 = (Static350.anInt6510 - Static5.aClass1_Sub3_Sub1_1.anInt1710) / 16;
		Static337.anIntArrayArray48 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static337.anIntArrayArray48[local49][local53] = Static5.aClass1_Sub3_Sub1_1.method1188();
			}
		}
		Static311.aByteArrayArray18 = new byte[local43][];
		Static339.aByteArrayArray20 = null;
		Static106.aByteArrayArray8 = new byte[local43][];
		Static257.anIntArray473 = new int[local43];
		Static135.anIntArray311 = new int[local43];
		Static225.anIntArray431 = null;
		Static243.anIntArray443 = new int[local43];
		Static168.anIntArray147 = new int[local43];
		Static155.anIntArray345 = new int[local43];
		Static299.aByteArrayArray5 = new byte[local43][];
		Static237.aByteArrayArray15 = new byte[local43][];
		local43 = 0;
		for (local53 = (local19 - (Static209.anInt4283 >> 4)) / 8; local53 <= ((Static209.anInt4283 >> 4) + local19) / 8; local53++) {
			for (@Pc(128) int local128 = (local11 - (Static211.anInt4295 >> 4)) / 8; local128 <= (local11 + (Static211.anInt4295 >> 4)) / 8; local128++) {
				Static168.anIntArray147[local43] = (local53 << 8) + local128;
				Static155.anIntArray345[local43] = Static136.aClass211_36.method4759("m" + local53 + "_" + local128);
				Static257.anIntArray473[local43] = Static136.aClass211_36.method4759("l" + local53 + "_" + local128);
				Static243.anIntArray443[local43] = Static136.aClass211_36.method4759("um" + local53 + "_" + local128);
				Static135.anIntArray311[local43] = Static136.aClass211_36.method4759("ul" + local53 + "_" + local128);
				local43++;
			}
		}
		Static149.method2372(10, local30, local11, local19);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
	public static void method5067(@OriginalArg(0) boolean arg0) {
		if (Static72.aString16.length() == 0) {
			return;
		}
		Static336.method4727("--> " + Static72.aString16);
		Static221.method3429(Static72.aString16, false, arg0);
		Static392.anInt7118 = 0;
		Static257.anInt5000 = 0;
		Static72.aString16 = "";
	}
}
