import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!p", name = "F", descriptor = "I")
	public static int anInt3160;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_9 = new Class13();

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1092 = Static151.method2243("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!p", name = "G", descriptor = "I")
	public static int anInt3161 = 0;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1094 = Static151.method2243("Loading title screen )2 ");

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1093 = aClass62_1094;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)I")
	public static int method2209(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + (local13 >>> 2 & 0xB3333333);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method2212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static124.method1934(arg1)) {
			Static114.aClass47Array2 = null;
			Static181.method2624(arg3, arg6, arg0, arg5, arg4, arg2, arg7, -1, Static89.aClass47ArrayArray1[arg1]);
			if (Static114.aClass47Array2 != null) {
				Static181.method2624(arg3, arg6, Static214.anInt4475, Static186.anInt3890, arg4, arg2, arg7, -1412584499, Static114.aClass47Array2);
				Static114.aClass47Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static176.aBooleanArray19[local14] = true;
			}
		} else {
			Static176.aBooleanArray19[arg4] = true;
		}
	}
}
