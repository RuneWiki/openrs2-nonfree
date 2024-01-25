import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static715 {

	@OriginalMember(owner = "client!wka", name = "Cb", descriptor = "I")
	public static int anInt7772;

	@OriginalMember(owner = "client!wka", name = "Qb", descriptor = "Ljava/lang/String;")
	public static String aString107 = "";

	@OriginalMember(owner = "client!wka", name = "fc", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!wka", name = "O", descriptor = "I")
	public static int anInt7793 = 0;

	@OriginalMember(owner = "client!wka", name = "m", descriptor = "(I)V")
	public static void method6588() {
		Static106.anInt1679 = -1;
		Static412.anInt7313 = 0;
		Static493.anInt8491 = -1;
		Static482.anInt8391 = -1;
	}

	@OriginalMember(owner = "client!wka", name = "k", descriptor = "(I)V")
	public static void method6593() {
		for (@Pc(7) int local7 = 0; local7 < Static337.anInt5854; local7++) {
			@Pc(15) int local15 = Static101.anIntArray95[local7];
			@Pc(22) Class3_Sub13 local22 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local15);
			if (local22 != null) {
				@Pc(27) Class19_Sub1_Sub3_Sub2_Sub1 local27 = local22.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				Static480.method7029(local27, false);
			}
		}
		if (50 <= 24) {
			method6606((Class221) null);
		}
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "([BI)V")
	public static void method6595(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub28 local10 = new Class3_Sub28(arg0);
		while (true) {
			@Pc(16) int local16;
			@Pc(48) int local48;
			@Pc(43) int local43;
			label49: do {
				while (true) {
					while (true) {
						local16 = local10.method5322(-93);
						if (local16 == 0) {
							if (false) {
								anInt7793 = 123;
								return;
							}
							return;
						}
						if (local16 == 1) {
							@Pc(128) int[] local128 = Static159.anIntArray143 = new int[6];
							local128[0] = local10.method5272();
							local128[1] = local10.method5272();
							local128[2] = local10.method5272();
							local128[3] = local10.method5272();
							local128[4] = local10.method5272();
							local128[5] = local10.method5272();
						} else {
							if (local16 != 4) {
								continue label49;
							}
							local43 = local10.method5322(-60);
							Static678.anIntArray619 = new int[local43];
							for (local48 = 0; local48 < local43; local48++) {
								Static678.anIntArray619[local48] = local10.method5272();
								if (Static678.anIntArray619[local48] == 65535) {
									Static678.anIntArray619[local48] = -1;
								}
							}
						}
					}
				}
			} while (local16 != 5);
			local43 = local10.method5322(-35);
			Static220.anIntArray222 = new int[local43];
			for (local48 = 0; local48 < local43; local48++) {
				Static220.anIntArray222[local48] = local10.method5272();
				if (Static220.anIntArray222[local48] == 65535) {
					Static220.anIntArray222[local48] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(ZLclient!lb;)V")
	public static void method6606(@OriginalArg(1) Class221 arg0) {
		Static177.aClass221_108 = arg0;
	}
}
