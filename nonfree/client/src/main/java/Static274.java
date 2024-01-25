import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Lclient!ml;")
	public static Class151 aClass151_4;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	public static int anInt1078;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method1027(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static333.aBoolean448) {
			try {
				@Pc(26) Class72 local26 = (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
				local26.method4861(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static333.aBoolean448 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
	public static void method1028() {
		Static265.aClass214_26.method5068();
		Static214.aClass214_23.method5068();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)Z")
	public static boolean method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static30.method725(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static315.anInt5584;
			@Pc(14) int local14 = arg2 << Static315.anInt5584;
			return Static286.method4398(local10 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg2) + arg3, local14 + 1) && Static286.method4398(local10 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg2) + arg3, local14 + 1) && Static286.method4398(local10 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg2 + 1) + arg3, local14 + Static292.anInt5158 - 1) && Static286.method4398(local10 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg2 + 1) + arg3, local14 + Static292.anInt5158 - 1);
		} else {
			return false;
		}
	}
}
