import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!gv;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_11 = new Class134(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!as", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method233(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static208.aClass54_60.anInt1425 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static384.aClass164_2.anInt4231; local18++) {
			@Pc(27) Class208 local27 = Static384.aClass164_2.method3458(local18);
			if ((!arg1 || local27.aBoolean421) && local27.anInt5683 == -1 && local27.anInt5680 == -1 && local27.anInt5650 == 0 && local27.lb.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static321.aShortArray59 = null;
					Static167.anInt2873 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static321.aShortArray59 = local14;
		Static385.anInt6343 = 0;
		Static167.anInt2873 = local16;
		@Pc(121) String[] local121 = new String[Static167.anInt2873];
		for (@Pc(123) int local123 = 0; local123 < Static167.anInt2873; local123++) {
			local121[local123] = Static384.aClass164_2.method3458(local14[local123]).lb;
		}
		Static367.method4817(local121, Static321.aShortArray59);
		Static208.aClass54_60.method1117();
		Static208.aClass54_60.anInt1425 = 2;
	}
}
