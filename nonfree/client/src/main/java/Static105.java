import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_64 = new Class48(61, 4);

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	public static int anInt1853 = 1;

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "Lclient!ri;")
	public static final Class201 aClass201_1 = new Class201();

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
	public static int anInt1862 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLclient!vg;)I")
	public static int method1492(@OriginalArg(1) Class1_Sub33_Sub2 arg0) {
		@Pc(17) int local17 = arg0.method5191(2);
		@Pc(21) int local21;
		if (local17 == 0) {
			local21 = 0;
		} else if (local17 == 1) {
			local21 = arg0.method5191(5);
		} else if (local17 == 2) {
			local21 = arg0.method5191(8);
		} else {
			local21 = arg0.method5191(11);
		}
		return local21;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static158.anInt2658) {
			Static87.anIntArray211 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static87.anIntArray211[local13] = (local13 << 12) / arg1;
			}
			Static271.anInt4721 = arg1 - 1;
			Static158.anInt2658 = arg1;
			Static362.anInt5842 = arg1 * 32;
		}
		if (arg0 == Static91.anInt1665) {
			return;
		}
		if (Static158.anInt2658 == arg0) {
			Static394.anIntArray751 = Static87.anIntArray211;
		} else {
			Static394.anIntArray751 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static394.anIntArray751[local13] = (local13 << 12) / arg0;
			}
		}
		Static13.anInt189 = arg0 - 1;
		Static91.anInt1665 = arg0;
	}
}
