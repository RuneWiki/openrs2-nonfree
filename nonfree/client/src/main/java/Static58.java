import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
	public static int anInt1041;

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array4;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
	public static int anInt1052;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_19 = new Class253(90, 8);

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_20 = new Class253(101, -2);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!go;B)Lclient!go;")
	public static Class95 method808(@OriginalArg(0) Class95 arg0) {
		if (arg0.anInt2646 != -1) {
			return Static313.method4088(arg0.anInt2646);
		}
		@Pc(29) int local29 = arg0.anInt2583 >>> 16;
		@Pc(34) Class64 local34 = new Class64(Static23.aClass164_3);
		for (@Pc(39) Class7_Sub44 local39 = (Class7_Sub44) local34.method1553(); local39 != null; local39 = (Class7_Sub44) local34.method1555()) {
			if (local39.anInt7165 == local29) {
				return Static313.method4088((int) local39.aLong230);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Z")
	public static boolean method809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static408.method5123(arg1, arg0) || Static141.method2175(arg1, arg0);
	}
}
