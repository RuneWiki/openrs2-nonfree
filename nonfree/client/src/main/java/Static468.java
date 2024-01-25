import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[Lclient!cf;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!kp;")
	public static final Class167 aClass167_14 = new Class167(4);

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Lclient!kba;")
	public static final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method6981() {
		Static120.aClass125_18.method3521();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method6984(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
