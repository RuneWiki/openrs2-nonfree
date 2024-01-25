import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	public static int anInt3798;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public static void method3280(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub7 local13 = Static144.method2728(arg0, 12);
		local13.method1324();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZII)V")
	public static void method3281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class5_Sub2_Sub7 local16 = Static144.method2728(arg1, 11);
		local16.method1327();
		local16.anInt1433 = arg2;
		local16.anInt1437 = arg0;
	}
}
