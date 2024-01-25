import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
	public static int anInt8388;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject56;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!tf;")
	public static final Class319 aClass319_7 = new Class319();

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "Lclient!jv;")
	public static final Class174 aClass174_31 = new Class174();

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject55 = null;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "[Lclient!as;")
	public static final Class17[] aClass17Array5 = new Class17[14];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)Z")
	public static boolean method7032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static26.method7436(arg0, arg1) | Static427.method6070(arg0, arg1)) & Static174.method3023(arg1, arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIBI)V")
	public static void method7033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg3, 8);
		local8.method839();
		local8.anInt1088 = arg1;
		local8.anInt1091 = arg0;
		local8.anInt1086 = arg2;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIII)V")
	public static void method7034(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 < arg3) {
			Static337.method5150(arg3, arg1, arg2, Static176.anIntArrayArray28[arg0]);
		} else {
			Static337.method5150(arg2, arg1, arg3, Static176.anIntArrayArray28[arg0]);
		}
	}
}
