import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!eb;")
	public static final Class89 aClass89_3 = new Class89(true);

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "[I")
	public static final int[] anIntArray503 = new int[5];

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
	public static int anInt9137 = 0;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public static void method7676() {
		Static566.anInt9293 = 0;
		@Pc(11) int local11 = Static386.aClass5_Sub15_Sub2_2.method3662();
		@Pc(20) boolean local20 = Static386.aClass5_Sub15_Sub2_2.method3667() == 1;
		@Pc(24) int local24 = Static386.aClass5_Sub15_Sub2_2.method3698();
		@Pc(28) int local28 = Static386.aClass5_Sub15_Sub2_2.method3655();
		Static11.method175();
		Static544.method7522(local28);
		@Pc(43) int local43 = (Static139.anInt2291 - Static386.aClass5_Sub15_Sub2_2.anInt4144) / 16;
		Static636.anIntArrayArray87 = new int[local43][4];
		@Pc(52) int local52;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static636.anIntArrayArray87[local49][local52] = Static386.aClass5_Sub15_Sub2_2.method3671();
			}
		}
		Static336.aByteArrayArray11 = new byte[local43][];
		Static286.anIntArray263 = new int[local43];
		Static373.aByteArrayArray15 = new byte[local43][];
		Static620.aByteArrayArray22 = new byte[local43][];
		Static235.anIntArray236 = new int[local43];
		Static155.aByteArrayArray8 = new byte[local43][];
		Static249.anIntArray245 = new int[local43];
		Static655.anIntArray596 = null;
		Static490.aByteArrayArray19 = null;
		Static640.anIntArray588 = new int[local43];
		Static517.anIntArray477 = new int[local43];
		local43 = 0;
		for (local52 = (local24 - (Static124.anInt2150 >> 4)) / 8; local52 <= ((Static124.anInt2150 >> 4) + local24) / 8; local52++) {
			for (@Pc(129) int local129 = (local11 - (Static64.anInt1015 >> 4)) / 8; local129 <= ((Static64.anInt1015 >> 4) + local11) / 8; local129++) {
				Static249.anIntArray245[local43] = (local52 << 8) + local129;
				Static640.anIntArray588[local43] = Static570.aClass50_162.method900("m" + local52 + "_" + local129);
				Static235.anIntArray236[local43] = Static570.aClass50_162.method900("l" + local52 + "_" + local129);
				Static517.anIntArray477[local43] = Static570.aClass50_162.method900("um" + local52 + "_" + local129);
				Static286.anIntArray263[local43] = Static570.aClass50_162.method900("ul" + local52 + "_" + local129);
				local43++;
			}
		}
		Static505.method7281(local20, local11, 11, local24);
	}
}
