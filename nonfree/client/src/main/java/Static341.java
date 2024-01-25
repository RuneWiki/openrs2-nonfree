import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!fb;")
	public static Class75 aClass75_4;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt5832;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public static int anInt5831 = 0;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!wc;")
	public static final Class262 aClass262_11 = new Class262();

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt5837 = 0;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public static void method4570() {
		Static47.anImage1 = null;
		Static317.aFont1 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILclient!fo;)Lclient!gf;")
	public static Class89 method4571(@OriginalArg(1) int arg0, @OriginalArg(3) Class82 arg1) {
		@Pc(19) byte[] local19 = arg1.method1817(arg0, 0);
		return local19 == null ? null : new Class89(local19);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method4573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static427.anInt7214 <= arg1 && Static434.anInt7302 >= arg4 && arg2 >= Static289.anInt5053 && arg0 <= Static93.anInt1676) {
			Static389.method5095(arg0, arg2, arg1, arg3, arg4);
		} else {
			Static18.method275(arg4, arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
	public static void method4574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 14);
		local8.method2661();
		local8.anInt3213 = arg1;
	}
}
