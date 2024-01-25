import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_6 = new Class208(1, -1);

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "[I")
	public static final int[] anIntArray6 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method220(@OriginalArg(1) Class6_Sub40 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static270.anInt5361; local7++) {
			@Pc(13) int local13 = arg0.method8587();
			@Pc(17) int local17 = arg0.method8571();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static231.aClass51_Sub1Array2[local13] != null) {
				Static231.aClass51_Sub1Array2[local13].anInt1506 = local17;
			}
		}
	}
}
