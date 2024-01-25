import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_79 = new Class6(8, 14);

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!h;")
	public static final Class114 aClass114_99 = new Class114("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_15 = new Class174(64);

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_73 = new Class186(36, 8);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)V")
	public static void method4323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(7, arg0);
		local8.method4919();
		local8.anInt5686 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg1) {
			Static485.method7023(arg3, arg6, arg2, arg4, arg0, arg5);
		} else if (arg2 - arg0 >= Static95.anInt2358 && arg2 + arg0 <= Static299.anInt4491 && arg4 - arg1 >= Static92.anInt2338 && arg1 + arg4 <= Static341.anInt6379) {
			Static211.method3826(arg6, arg0, arg4, arg5, arg3, arg1, arg2);
		} else {
			Static22.method870(arg1, arg2, arg0, arg6, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
	public static void method4326(@OriginalArg(1) int arg0) {
		Static441.aLong195 = 1000000000L / (long) arg0;
	}
}
