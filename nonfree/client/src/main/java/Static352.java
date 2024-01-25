import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_117 = new Class268(31, -2);

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
	public static final int[] anIntArray410 = new int[13];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5666(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static337.aClass327_2.anInt9386 : Static337.aClass327_2.anInt9384) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub2_Sub14 local38 = Static337.aClass327_2.method7979(local31);
			if (local38.aBoolean415 && local38.method5406().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static126.anInt2428 = -1;
					Static293.aShortArray76 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(70) short[] local70 = new short[local11.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local13; local72++) {
						local70[local72] = local11[local72];
					}
					local11 = local70;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static3.anInt52 = 0;
		Static126.anInt2428 = local13;
		Static293.aShortArray76 = local11;
		@Pc(109) String[] local109 = new String[Static126.anInt2428];
		for (@Pc(111) int local111 = 0; local111 < Static126.anInt2428; local111++) {
			local109[local111] = Static337.aClass327_2.method7979(local11[local111]).method5406();
		}
		Static232.method4005(local109, Static293.aShortArray76);
	}
}
