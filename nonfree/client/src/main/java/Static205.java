import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_78 = new Class151(105, 6);

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_67 = new Class216(83, 4);

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!ut;")
	public static final Class367 aClass367_2 = new Class367();

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	public static int anInt3341 = -1;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_16 = new Class66(16);

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)V")
	public static void method3086() {
		Static124.anInt2310 = 0;
		@Pc(21) boolean local21 = Static159.aClass4_Sub11_Sub1_1.method8862() == 1;
		@Pc(25) int local25 = Static159.aClass4_Sub11_Sub1_1.method8859();
		@Pc(29) int local29 = Static159.aClass4_Sub11_Sub1_1.method8865();
		@Pc(33) int local33 = Static159.aClass4_Sub11_Sub1_1.method8859();
		Static606.method7949();
		Static532.method7158(local29);
		@Pc(46) int local46 = (Static583.anInt8992 - Static159.aClass4_Sub11_Sub1_1.anInt10466) / 16;
		Static80.anIntArrayArray8 = new int[local46][4];
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < local46; local52++) {
			for (local56 = 0; local56 < 4; local56++) {
				Static80.anIntArrayArray8[local52][local56] = Static159.aClass4_Sub11_Sub1_1.method8850();
			}
		}
		Static661.aByteArrayArray28 = new byte[local46][];
		Static142.anIntArray366 = new int[local46];
		Static352.aByteArrayArray21 = new byte[local46][];
		Static146.anIntArray195 = null;
		Static315.aByteArrayArray16 = new byte[local46][];
		Static275.aByteArrayArray12 = null;
		Static311.anIntArray368 = new int[local46];
		Static472.anIntArray505 = new int[local46];
		Static211.anIntArray729 = new int[local46];
		Static572.anIntArray632 = new int[local46];
		Static8.aByteArrayArray1 = new byte[local46][];
		local46 = 0;
		for (local56 = (local25 - (Static224.anInt3557 >> 4)) / 8; local56 <= (local25 + (Static224.anInt3557 >> 4)) / 8; local56++) {
			for (@Pc(128) int local128 = (local33 - (Static267.anInt4309 >> 4)) / 8; local128 <= (local33 + (Static267.anInt4309 >> 4)) / 8; local128++) {
				Static472.anIntArray505[local46] = local128 + (local56 << 8);
				Static311.anIntArray368[local46] = Static151.aClass34_38.method1252("m" + local56 + "_" + local128);
				Static211.anIntArray729[local46] = Static151.aClass34_38.method1252("l" + local56 + "_" + local128);
				Static572.anIntArray632[local46] = Static151.aClass34_38.method1252("um" + local56 + "_" + local128);
				Static142.anIntArray366[local46] = Static151.aClass34_38.method1252("ul" + local56 + "_" + local128);
				local46++;
			}
		}
		Static561.method7434(11, local21, local25, local33);
	}
}
