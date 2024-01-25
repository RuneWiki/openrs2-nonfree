import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "[Lclient!ef;")
	public static final Class84[] aClass84Array1 = new Class84[4];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z")
	public static boolean method3792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIBI)V")
	public static void method3793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub7_Sub18 local12 = Static543.method7218(10, arg3);
		local12.method7326();
		local12.anInt8798 = arg1;
		local12.anInt8806 = arg0;
		local12.anInt8802 = arg2;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z")
	public static boolean method3794(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 18 || arg0 == 48 || arg0 == 13 || arg0 == 6) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 1006;
		}
	}
}
