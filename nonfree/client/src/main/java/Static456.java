import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
	public static int anInt7444;

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_134 = new Class225(141, -2);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_22 = new Class118(0);

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_9 = new Class286("", 20);

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_23 = new Class118(16);

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V")
	public static void method6634() {
		Static718.anInt10954 = 0;
		@Pc(10) Class2_Sub20_Sub2 local10 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		@Pc(14) int local14 = local10.method8559();
		@Pc(24) boolean local24 = local10.method8588() == 1;
		@Pc(28) int local28 = local10.method8559();
		@Pc(34) int local34 = local10.method8581(-17416);
		Static715.method9514();
		Static618.method8402(local34);
		@Pc(52) int local52 = (Static487.aClass221_2.anInt5773 - local10.anInt9723) / 16;
		Static152.anIntArrayArray15 = new int[local52][4];
		@Pc(62) int local62;
		for (@Pc(58) int local58 = 0; local58 < local52; local58++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static152.anIntArrayArray15[local58][local62] = local10.method8555(-9372);
			}
		}
		Static336.aByteArrayArray10 = new byte[local52][];
		Static495.aByteArrayArray17 = null;
		Static608.anIntArray687 = null;
		Static148.anIntArray187 = new int[local52];
		Static9.anIntArray32 = new int[local52];
		Static100.aByteArrayArray1 = new byte[local52][];
		Static453.aByteArrayArray13 = new byte[local52][];
		Static523.anIntArray462 = new int[local52];
		Static453.anIntArray534 = new int[local52];
		Static398.anIntArray452 = new int[local52];
		Static671.aByteArrayArray26 = new byte[local52][];
		local52 = 0;
		for (local62 = (local14 - (Static426.anInt6942 >> 4)) / 8; local62 <= (local14 + (Static426.anInt6942 >> 4)) / 8; local62++) {
			for (@Pc(146) int local146 = (local28 - (Static280.anInt6752 >> 4)) / 8; local146 <= (local28 + (Static280.anInt6752 >> 4)) / 8; local146++) {
				Static148.anIntArray187[local52] = (local62 << 8) + local146;
				Static398.anIntArray452[local52] = Static311.aClass254_96.method6077("m" + local62 + "_" + local146);
				Static9.anIntArray32[local52] = Static311.aClass254_96.method6077("l" + local62 + "_" + local146);
				Static523.anIntArray462[local52] = Static311.aClass254_96.method6077("um" + local62 + "_" + local146);
				Static453.anIntArray534[local52] = Static311.aClass254_96.method6077("ul" + local62 + "_" + local146);
				local52++;
			}
		}
		Static63.method951(local14, 12, local24, local28);
	}
}
