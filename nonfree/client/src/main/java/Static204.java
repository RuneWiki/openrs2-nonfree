import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ol", name = "L", descriptor = "Lclient!ue;")
	public static Class3_Sub15_Sub4 aClass3_Sub15_Sub4_3;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "Lclient!rn;")
	public static Class155 aClass155_86;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!ol", name = "U", descriptor = "Lclient!fk;")
	public static Class56 aClass56_18;

	@OriginalMember(owner = "client!ol", name = "X", descriptor = "Lclient!rg;")
	public static Class151 aClass151_11;

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Loaded fonts";

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
	public static int anInt4020 = 100;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
	public static void method3391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static190.anInt3752 = arg1;
		Static107.anInt1966 = arg0;
		Static305.anInt6003 = arg4;
		Static6.anInt138 = arg2;
		Static31.anInt571 = arg3;
		if (Static31.anInt571 >= 100) {
			@Pc(29) int local29 = Static107.anInt1966 * 128 + 64;
			@Pc(35) int local35 = Static190.anInt3752 * 128 + 64;
			@Pc(43) int local43 = Static122.method2036(local35, local29, Static99.anInt1826) - Static305.anInt6003;
			@Pc(48) int local48 = local29 - Static230.anInt4492;
			@Pc(53) int local53 = local43 - Static224.anInt6075;
			@Pc(57) int local57 = local35 - Static173.anInt3251;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local48 * local48 + local57 * local57));
			Static79.anInt1912 = (int) (Math.atan2((double) local53, (double) local68) * 325.949D) & 0x7FF;
			Static113.anInt2103 = (int) (Math.atan2((double) local48, (double) local57) * -325.949D) & 0x7FF;
			if (Static79.anInt1912 < 128) {
				Static79.anInt1912 = 128;
			}
			if (Static79.anInt1912 > 383) {
				Static79.anInt1912 = 383;
			}
		}
		Static25.anInt467 = 2;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V")
	public static void method3392() {
		Static145.aClass98_19.method2565(5);
		Static166.aClass98_25.method2565(5);
		Static280.aClass98_36.method2565(5);
	}
}
