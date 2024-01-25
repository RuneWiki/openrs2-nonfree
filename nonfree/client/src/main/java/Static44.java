import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array2;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!bh;")
	public static final Class14 aClass14_1 = Static79.method1277();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
	public static void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class4_Sub2_Sub17 local15 = Static34.method1709(8, arg2);
		local15.method5529();
		local15.anInt6873 = arg3;
		local15.anInt6871 = arg0;
		local15.anInt6869 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZB)V")
	public static void method582(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static50.anInt812 = 3;
		Static11.anInt178 = arg0;
		Static355.method4690(Static122.aClass220_2.anInt5746, Static122.aClass220_2.aString62);
		if (arg1) {
			Static62.method867("", "");
		} else {
			Static66.method1087();
			Static62.method867(Static276.aString38, Static150.aString22);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public static void method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass8_Sub5_2 != null) {
			local7.aClass8_Sub5_2 = null;
		}
		if (local7.aClass8_Sub5_1 != null) {
			local7.aClass8_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	public static void method584(@OriginalArg(1) int arg0) {
		if (Static131.method1881(arg0)) {
			Static320.method4236(-1, Static412.aClass110ArrayArray2[arg0]);
		}
	}
}
