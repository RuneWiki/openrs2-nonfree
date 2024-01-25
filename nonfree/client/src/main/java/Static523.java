import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[Lclient!wea;")
	public static Class28_Sub1[] aClass28_Sub1Array24;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	public static int anInt8394 = -1;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "Lclient!ss;")
	public static final Class326 aClass326_5 = new Class326();

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	public static int anInt8396 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	public static void method7309(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static7.anInt93 = 0;
		Static84.anInt1667 = arg1;
		Static115.anInt2377 = arg0;
		Static374.anInt5986 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public static void method7310() {
		if (Static501.method7146(Static406.anInt6454) || Static661.method9136(Static406.anInt6454)) {
			Static208.method3664(Static509.anInt8222 >> 12, 5000, Static652.anInt10382 >> 12);
		} else {
			@Pc(16) int local16 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] >> 3;
			@Pc(23) int local23 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] >> 3;
			if (local16 >= 0 && local16 < Static158.anInt927 >> 3 && local23 >= 0 && local23 < Static515.anInt8292 >> 3) {
				Static208.method3664(local16, 5000, local23);
			} else {
				Static208.method3664(Static158.anInt927 >> 4, 0, Static515.anInt8292 >> 4);
			}
		}
		Static431.method6192();
		Static663.method9154();
		Static429.method6179();
		Static213.method3716();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method7311(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[BZI)I")
	public static int method7313(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = local7 >>> 8 ^ Class331.anIntArray788[(local7 ^ arg1[local14]) & 0xFF];
		}
		return ~local7;
	}
}
