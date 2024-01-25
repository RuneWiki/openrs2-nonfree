import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
	public static int anInt2425;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
	public static int anInt2427;

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!rc;")
	public static Class205 aClass205_56;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public static int anInt2419 = 0;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_55 = new Class205(85, 0);

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "S")
	public static short aShort35 = 32767;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	public static void method2347() {
		Static216.method3597(Static120.aClass11_44);
		Static372.aClass2_Sub16_Sub2_4.method5351(Static48.anInt968);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class2_Sub43 local7 = null;
		for (@Pc(12) Class2_Sub43 local12 = (Class2_Sub43) Static370.aClass30_43.method694(); local12 != null; local12 = (Class2_Sub43) Static370.aClass30_43.method682()) {
			if (local12.anInt6040 == arg5 && local12.anInt6039 == arg0 && local12.anInt6046 == arg4 && local12.anInt6043 == arg6) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub43();
			local7.anInt6040 = arg5;
			local7.anInt6046 = arg4;
			local7.anInt6043 = arg6;
			local7.anInt6039 = arg0;
			Static44.method736(local7);
			Static370.aClass30_43.method685(local7);
		}
		local7.anInt6041 = arg3;
		local7.anInt6034 = arg2;
		local7.anInt6042 = -1;
		local7.anInt6044 = arg1;
		local7.anInt6036 = 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2351(@OriginalArg(0) String arg0) {
		if (Static372.aClass234Array1 != null) {
			Static216.method3597(Static262.aClass11_71);
			Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0));
			Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
		}
	}
}
