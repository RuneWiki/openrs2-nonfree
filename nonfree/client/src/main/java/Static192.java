import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt354;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!sc;")
	public static final Class263 aClass263_2 = new Class263();

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_10 = new Class45("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	public static void method545(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub8 local10 = Static271.method4828(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray118.length; local15++) {
				local10.anIntArray118[local15] = -1;
				local10.anIntArray119[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([[BILclient!vk;)V")
	public static void method547(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class102_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class1_Sub17 local30 = new Class1_Sub17(local23);
				local36 = Static378.anIntArray656[local17] >> 8;
				@Pc(42) int local42 = Static378.anIntArray656[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static538.anInt9485;
				@Pc(55) int local55 = local42 * 64 - Static282.anInt5380;
				Static422.method6584();
				arg1.method7842(local48, Static538.anInt9485, Static362.aClass243Array5, local55, local30, Static282.anInt5380);
				arg1.method7853(local48, local12, local30, local55, Static455.aClass4_11);
				if (!arg1.aBoolean681 && Static388.anInt6883 / 8 == local36 && local42 == Static225.anInt4357 / 8 && local12[0] != -1) {
					Static516.aClass62_1 = Static402.aClass2_1.method181(Static435.aClass280_1, local12[0], local12[3], local12[2], local12[1]);
					Static74.anInt1796 = local12[4];
				}
			}
		}
		for (@Pc(124) int local124 = 0; local124 < local15; local124++) {
			@Pc(136) int local136 = (Static378.anIntArray656[local124] >> 8) * 64 - Static538.anInt9485;
			local36 = (Static378.anIntArray656[local124] & 0xFF) * 64 - Static282.anInt5380;
			@Pc(151) byte[] local151 = arg0[local124];
			if (local151 == null && Static225.anInt4357 < 800) {
				Static422.method6584();
				arg1.method7838(local36, local136);
			}
		}
	}
}
