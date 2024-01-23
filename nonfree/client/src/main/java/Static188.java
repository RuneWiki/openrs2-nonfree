import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "Lclient!th;")
	public static Class168 aClass168_139;

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
	public static int anInt4156;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "Lclient!th;")
	public static Class168 aClass168_140;

	@OriginalMember(owner = "client!nk", name = "X", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
	public static int anInt4159 = 0;

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
	public static int anInt4164 = 0;

	@OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V")
	public static void method3048() {
		Static1.method4721(0, 0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method3049(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static58.anInt1268; local15++) {
			@Pc(22) Class57 local22 = Static56.method1050(local15);
			if ((!arg1 || local22.aBoolean123) && local22.anInt1777 == -1 && local22.anInt1768 == -1 && local22.anInt1775 == 0 && local22.aString102.toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 250) {
					Static11.anInt310 = -1;
					Static174.aShortArray95 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(75) short[] local75 = new short[local11.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local13; local77++) {
						local75[local77] = local11[local77];
					}
					local11 = local75;
				}
				local11[local13++] = (short) local15;
			}
		}
		Static11.anInt310 = local13;
		Static195.anInt4269 = 0;
		Static174.aShortArray95 = local11;
		@Pc(116) String[] local116 = new String[Static11.anInt310];
		for (@Pc(118) int local118 = 0; local118 < Static11.anInt310; local118++) {
			local116[local118] = Static56.method1050(local11[local118]).aString102;
		}
		Static275.method4161(Static174.aShortArray95, local116);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBII)V")
	public static void method3050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static206.anInt4449 <= arg3 && arg3 <= Static90.anInt2088) {
			@Pc(25) int local25 = Static131.method2259(Static310.anInt6206, arg0, Static170.anInt3814);
			@Pc(33) int local33 = Static131.method2259(Static310.anInt6206, arg2, Static170.anInt3814);
			Static135.method2293(arg3, local33, local25, arg1);
		}
	}
}
