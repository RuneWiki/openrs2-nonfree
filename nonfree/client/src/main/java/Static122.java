import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_4 = new Class68(8, 0, 4, 1);

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!au;")
	public static final Class22 aClass22_18 = new Class22();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 4);
		local8.method2303();
		local8.anInt2865 = arg3;
		local8.anInt2871 = arg2;
		local8.anInt2872 = arg1;
	}
}
