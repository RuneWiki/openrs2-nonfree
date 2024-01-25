import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_92 = new Class337(50, 6);

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)[Lclient!bu;")
	public static Class43[] method4509() {
		return new Class43[] { Static535.aClass43_3, Static376.aClass43_1, Static586.aClass43_4 };
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IBILclient!la;)Lclient!pia;")
	public static Class272 method4512(@OriginalArg(0) int arg0, @OriginalArg(3) Class207 arg1) {
		@Pc(17) byte[] local17 = arg1.method4681(arg0, 0);
		return local17 == null ? null : new Class272(local17);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)V")
	public static void method4513(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(16, arg0);
		local8.method8961();
	}
}
