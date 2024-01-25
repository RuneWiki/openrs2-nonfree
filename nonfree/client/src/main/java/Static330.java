import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!fea;")
	public static Class99 aClass99_53 = new Class99();

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)I")
	public static int method5211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg1, 9);
		local8.method1327();
		local8.anInt1433 = arg0;
		local8.anInt1437 = arg2;
	}
}
