import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
	public static int anInt10184;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	public static int anInt10181 = 0;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!uf", name = "Q", descriptor = "Z")
	public static final boolean aBoolean697 = true;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(III)Z")
	public static boolean method8485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	public static void method8486() {
		Static69.anInt2216 = 0;
		@Pc(11) int local11 = Static627.aClass2_Sub11_Sub2_6.method8338();
		@Pc(15) int local15 = Static627.aClass2_Sub11_Sub2_6.method8354();
		@Pc(19) int local19 = Static627.aClass2_Sub11_Sub2_6.method8369();
		@Pc(30) boolean local30 = Static627.aClass2_Sub11_Sub2_6.method8325() == 1;
		Static8.method208();
		Static520.method7890(local11);
		@Pc(43) int local43 = (Static541.anInt9723 - Static627.aClass2_Sub11_Sub2_6.anInt10066) / 16;
		Static296.anIntArrayArray31 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static296.anIntArrayArray31[local49][local53] = Static627.aClass2_Sub11_Sub2_6.method8381();
			}
		}
		Static268.aByteArrayArray14 = new byte[local43][];
		Static377.aByteArrayArray17 = new byte[local43][];
		Static9.anIntArray11 = new int[local43];
		Static557.aByteArrayArray24 = new byte[local43][];
		Static300.anIntArray106 = new int[local43];
		Static85.aByteArrayArray5 = null;
		Static475.anIntArray654 = new int[local43];
		Static8.anIntArray10 = null;
		Static123.aByteArrayArray10 = new byte[local43][];
		Static619.anIntArray701 = new int[local43];
		Static431.anIntArray533 = new int[local43];
		local43 = 0;
		for (local53 = (local19 - (Static47.anInt1794 >> 4)) / 8; local53 <= (local19 + (Static47.anInt1794 >> 4)) / 8; local53++) {
			for (@Pc(128) int local128 = (local15 - (Static209.anInt4742 >> 4)) / 8; local128 <= ((Static209.anInt4742 >> 4) + local15) / 8; local128++) {
				Static431.anIntArray533[local43] = local128 + (local53 << 8);
				Static9.anIntArray11[local43] = Static316.aClass157_158.method4571("m" + local53 + "_" + local128);
				Static300.anIntArray106[local43] = Static316.aClass157_158.method4571("l" + local53 + "_" + local128);
				Static619.anIntArray701[local43] = Static316.aClass157_158.method4571("um" + local53 + "_" + local128);
				Static475.anIntArray654[local43] = Static316.aClass157_158.method4571("ul" + local53 + "_" + local128);
				local43++;
			}
		}
		Static562.method8437(local15, local19, 11, local30);
	}
}
