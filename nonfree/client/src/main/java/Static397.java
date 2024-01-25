import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	public static int anInt6873;

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "Lclient!vn;")
	public static Class2_Sub44 aClass2_Sub44_2 = null;

	@OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
	public static int anInt6875 = 0;

	@OriginalMember(owner = "client!tp", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray168 = new int[128][128];

	@OriginalMember(owner = "client!tp", name = "V", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!mn;Lclient!mn;ILclient!mn;Lclient!mn;)V")
	public static void method5501(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(3) Class171 arg2, @OriginalArg(4) Class171 arg3) {
		Static166.aClass171_41 = arg1;
		Static234.aClass171_52 = arg3;
		Static371.aClass171_86 = arg2;
		Static62.aClass171_14 = arg0;
		Static188.aClass93ArrayArray4 = new Class93[Static166.aClass171_41.method3677()][];
		Static219.aBooleanArray19 = new boolean[Static166.aClass171_41.method3677()];
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
	public static void method5502() {
		if (Static280.anInt5044 < 0) {
			return;
		}
		@Pc(7) long local7 = Static432.method5870();
		Static280.anInt5044 = (int) ((long) Static280.anInt5044 + Static335.aLong308 - local7);
		if (Static280.anInt5044 <= 0) {
			Static85.aFloat11 = Static239.aClass226_1.aFloat85;
			Static79.anInt1288 = Static239.aClass226_1.anInt6541;
			Static103.anInt5363 = Static239.aClass226_1.anInt6546;
			Static22.aFloat6 = Static239.aClass226_1.aFloat83;
			Static218.aClass141_2 = Static239.aClass226_1.aClass141_3;
			Static290.aFloat75 = Static239.aClass226_1.aFloat84;
			Static289.aFloat74 = Static239.aClass226_1.aFloat86;
			Static280.aFloat71 = Static239.aClass226_1.aFloat82;
			Static280.anInt5044 = -1;
			Static326.anInt5851 = Static239.aClass226_1.anInt6540;
			Static304.aFloat77 = Static239.aClass226_1.aFloat81;
		} else {
			@Pc(58) int local58 = (Static280.anInt5044 << 8) / Static44.anInt715;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			Static326.anInt5851 = ((Static239.aClass226_1.anInt6540 & 0xFF00) * local63 + (Static270.anInt4855 & 0xFF00) * local58 & 0xFF0000) + (local58 * (Static270.anInt4855 & 0xFF00FF) + (local63 * (Static239.aClass226_1.anInt6540 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			@Pc(106) float local106 = 1.0F - local68;
			Static280.aFloat71 = Static428.aFloat94 + (Static239.aClass226_1.aFloat82 - Static428.aFloat94) * local106;
			Static304.aFloat77 = Static161.aFloat20 + local106 * (Static239.aClass226_1.aFloat81 - Static161.aFloat20);
			Static79.anInt1288 = ((Static301.anInt4204 & 0xFF00) * local58 + (Static239.aClass226_1.anInt6541 & 0xFF00) * local63 & 0xFF0000) + (local58 * (Static301.anInt4204 & 0xFF00FF) + ((Static239.aClass226_1.anInt6541 & 0xFF00FF) * local63) & 0xFF00FF00) >>> 8;
			Static290.aFloat75 = (Static239.aClass226_1.aFloat84 - Static206.aFloat25) * local106 + Static206.aFloat25;
			Static22.aFloat6 = Static12.aFloat3 + local106 * (Static239.aClass226_1.aFloat83 - Static12.aFloat3);
			Static103.anInt5363 = local63 * Static239.aClass226_1.anInt6546 + local58 * Static162.anInt2916 >> 8;
			Static85.aFloat11 = Static241.aFloat33 + (Static239.aClass226_1.aFloat85 - Static241.aFloat33) * local106;
			Static289.aFloat74 = local106 * (Static239.aClass226_1.aFloat86 - Static308.aFloat78) + Static308.aFloat78;
			if (Static239.aClass226_1.aClass141_3 != Static121.aClass141_1) {
				Static218.aClass141_2 = Static28.aClass75_3.method6005(Static121.aClass141_1, Static239.aClass226_1.aClass141_3, local106, Static218.aClass141_2);
			}
		}
		Static335.aLong308 = local7;
	}
}
