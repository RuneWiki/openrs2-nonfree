import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!em;")
	public static final Class83 aClass83_86 = new Class83(54, 2);

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_50 = new Class208(74, 11);

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_51 = new Class208(32, 8);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)Z")
	public static boolean method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface15 local11 = (Interface15) Static316.method4694(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static420.method5963(local11) & true;
		}
		local11 = (Interface15) Static432.method6172(arg1, arg2, arg0, kj.class);
		if (local11 != null) {
			local5 &= Static420.method5963(local11);
		}
		local11 = (Interface15) Static481.method6668(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static420.method5963(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
	public static void method3214(@OriginalArg(0) boolean arg0) {
		Static275.method4012();
		if (!Static186.method3008(Static55.anInt1068)) {
			return;
		}
		Static337.anInt6171++;
		if (Static337.anInt6171 < 50 && !arg0) {
			return;
		}
		Static337.anInt6171 = 0;
		if (!Static303.aBoolean438 && Static485.aClass43_1 != null) {
			@Pc(41) Class1_Sub9 local41 = Static123.method2194(Static469.aClass235_2, Static508.aClass208_101);
			Static42.method746(local41);
			try {
				Static54.method938();
			} catch (@Pc(48) IOException local48) {
				Static303.aBoolean438 = true;
			}
		}
		Static275.method4012();
	}
}
