import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dt", name = "Q", descriptor = "Lclient!la;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!dt", name = "K", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_64 = new Class103(22, 8);

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!dt", name = "R", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_65 = new Class103(6, 4);

	@OriginalMember(owner = "client!dt", name = "U", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_66 = new Class103(28, -1);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = local7 * (Static450.aShort114 - Static31.aShort5) / 100 + Static31.aShort5;
		@Pc(39) int local39 = local33 * arg6 >> 8;
		@Pc(46) int local46 = 16384 - arg0 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg3 & 0x3FFF;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = local39;
		if (local46 != 0) {
			local68 = -local39 * Class1_Sub4_Sub8_Sub1.anIntArray50[local46] >> 15;
			local70 = Class1_Sub4_Sub8_Sub1.anIntArray49[local46] * local39 >> 15;
		}
		if (local52 != 0) {
			local66 = Class1_Sub4_Sub8_Sub1.anIntArray50[local52] * local70 >> 15;
			local70 = local70 * Class1_Sub4_Sub8_Sub1.anIntArray49[local52] >> 15;
		}
		Static340.anInt5790 = arg0;
		Static106.anInt2033 = arg3;
		Static391.anInt6529 = arg2 - local68;
		Static73.anInt1361 = 0;
		Static360.anInt6145 = arg5 - local70;
		Static213.anInt258 = arg1 - local66;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(II)V")
	public static void method1318(@OriginalArg(0) int arg0) {
		Static78.anInt3523 = -1;
		Static441.anInt7355 = arg0;
		Static222.anInt3998 = -1;
		Static65.method1075();
	}
}
