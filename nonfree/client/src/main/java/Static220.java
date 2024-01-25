import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	public static int anInt4683 = 1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ps;Z)Lclient!ps;")
	public static Class163 method4064(@OriginalArg(0) Class163 arg0) {
		if (arg0.anInt4918 != -1) {
			return Static248.method22(arg0.anInt4918);
		}
		@Pc(20) int local20 = arg0.anInt4947 >>> 16;
		@Pc(25) Class103 local25 = new Class103(Static298.aClass207_35);
		for (@Pc(30) Class1_Sub26 local30 = (Class1_Sub26) local25.method2002(); local30 != null; local30 = (Class1_Sub26) local25.method2003()) {
			if (local20 == local30.anInt3825) {
				return Static248.method22((int) local30.aLong214);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIII)V")
	public static void method4065(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static165.anInt3409 = arg0;
		Static41.anInt1131 = 0;
		Static60.anInt1399 = 0;
		Static138.anInt6334 = arg1;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ii;Lclient!lm;)V")
	public static void method4066(@OriginalArg(1) Class105 arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(10) Class201[] local10 = Static369.method5470(arg1, Static269.anInt5547);
		Static352.aClass8Array16 = new Class8[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static352.aClass8Array16[local16] = arg0.method4238(local10[local16]);
		}
		local10 = Static369.method5470(arg1, Static295.anInt5959);
		Static211.aClass8Array11 = new Class8[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static211.aClass8Array11[local43] = arg0.method4238(local10[local43]);
		}
		local10 = Static369.method5470(arg1, Static136.anInt2692);
		Static188.aClass8Array9 = new Class8[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static188.aClass8Array9[local70] = arg0.method4238(local10[local70]);
		}
		local10 = Static369.method5470(arg1, Static317.anInt6315);
		Static180.aClass8Array8 = new Class8[local10.length];
		for (@Pc(97) int local97 = 0; local97 < local10.length; local97++) {
			Static180.aClass8Array8[local97] = arg0.method4238(local10[local97]);
		}
		local10 = Static369.method5470(arg1, Static314.anInt6245);
		Static28.aClass8Array2 = new Class8[local10.length];
		for (@Pc(124) int local124 = 0; local124 < local10.length; local124++) {
			Static28.aClass8Array2[local124] = arg0.method4238(local10[local124]);
		}
		local10 = Static369.method5470(arg1, Static296.anInt5984);
		Static54.aClass8Array3 = new Class8[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static54.aClass8Array3[local155] = arg0.method4238(local10[local155]);
		}
		local10 = Static369.method5470(arg1, Static153.anInt3153);
		Static344.aClass8Array15 = new Class8[local10.length];
		for (@Pc(186) int local186 = 0; local186 < local10.length; local186++) {
			Static344.aClass8Array15[local186] = arg0.method4238(local10[local186]);
		}
		local10 = Static369.method5470(arg1, Static170.anInt3580);
		Static189.aClass8Array14 = new Class8[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static189.aClass8Array14[local213] = arg0.method4238(local10[local213]);
		}
		local10 = Static369.method5470(arg1, Static254.anInt5238);
		Static304.aClass8Array13 = new Class8[local10.length];
		for (@Pc(244) int local244 = 0; local244 < local10.length; local244++) {
			Static304.aClass8Array13[local244] = arg0.method4238(local10[local244]);
		}
		local10 = Static369.method5470(arg1, Static167.anInt3455);
		Static83.aClass8Array5 = new Class8[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static83.aClass8Array5[local275] = arg0.method4238(local10[local275]);
		}
		local10 = Static369.method5470(arg1, Static41.anInt1122);
		Static214.aClass8Array12 = new Class8[local10.length];
		for (@Pc(302) int local302 = 0; local302 < local10.length; local302++) {
			Static214.aClass8Array12[local302] = arg0.method4238(local10[local302]);
		}
		local10 = Static369.method5470(arg1, Static64.anInt1440);
		Static19.aClass8Array1 = new Class8[local10.length];
		for (@Pc(329) int local329 = 0; local329 < local10.length; local329++) {
			Static19.aClass8Array1[local329] = arg0.method4238(local10[local329]);
		}
		local10 = Static369.method5470(arg1, Static347.anInt6681);
		Static173.aClass8Array7 = new Class8[local10.length];
		for (@Pc(356) int local356 = 0; local356 < local10.length; local356++) {
			Static173.aClass8Array7[local356] = arg0.method4238(local10[local356]);
		}
		Static20.aClass8_2 = arg0.method4238(Static369.method5469(arg1, Static231.anInt4826, 0));
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method4067() {
		if (Static18.anInt357 != -1) {
			Static10.method171(false, -1, -1, Static18.anInt357);
			Static18.anInt357 = -1;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public static void method4068() {
		Static9.aClass37_1.method919();
		Static302.aClass37_99.method919();
	}
}
