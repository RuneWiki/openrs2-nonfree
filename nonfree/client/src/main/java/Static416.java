import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_75 = new Class303(10, 15);

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
	public static int anInt7067 = -1;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
	public static int anInt7068 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method5934() {
		if (Static20.anInt349 != -1) {
			Static288.method4272(-1, Static20.anInt349, -1, false);
			Static20.anInt349 = -1;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLclient!tf;I)Lclient!ef;")
	public static Class84 method5935(@OriginalArg(2) Class322 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method6802(arg1, 0);
		return local9 == null ? null : new Class84(local9);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5936(@OriginalArg(1) String arg0) {
		if (Class3_Sub6_Sub27.aString65.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class3_Sub6_Sub27.aString65.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class3_Sub6_Sub27.aString65.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
