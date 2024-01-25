import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public static int anInt3904;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!he;")
	public static Class100 aClass100_40;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_73 = new Class92(49, 6);

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Lclient!it;")
	public static Class122 aClass122_4 = null;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)Lclient!jq;")
	public static Class6_Sub2_Sub7 method3218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub2_Sub7 local20 = (Class6_Sub2_Sub7) Static179.aClass74_19.method1883((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class6_Sub2_Sub7(arg1, arg0);
			Static179.aClass74_19.method1890(local20.aLong229, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3219(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lclient!ne;")
	public static Class84 method3220() {
		try {
			return (Class84) Class.forName("Class84_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
