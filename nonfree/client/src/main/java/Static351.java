import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "[Lclient!on;")
	public static Class275[] aClass275Array5;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	public static int anInt11028;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!cg;")
	public static final Class59 aClass59_12 = new Class59("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public static int anInt11020 = 0;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
	public static boolean aBoolean772 = false;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public static int anInt11027 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method9354(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return arg0 ? Static358.method5440(local14) : local14;
		} else if (arg1 instanceof Class191) {
			@Pc(36) Class191 local36 = (Class191) arg1;
			return local36.method7609();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Z")
	public static boolean method9355() {
		if (Static387.anInt9114 == 3) {
			return Static355.anInt6072 == 0 && Static465.anInt7807 == 0;
		} else {
			return false;
		}
	}
}
