import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
	public static int anInt1581;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public static void method1545() {
		@Pc(12) byte[] local12;
		if (Static658.anObject19 == null) {
			@Pc(5) Class148_Sub1_Sub2 local5 = new Class148_Sub1_Sub2();
			local12 = local5.method5655();
			Static658.anObject19 = Static331.method8338(local12);
		}
		if (Static496.anObject17 == null) {
			@Pc(32) Class148_Sub2_Sub1 local32 = new Class148_Sub2_Sub1();
			local12 = local32.method5993();
			Static496.anObject17 = Static331.method8338(local12);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIB)Z")
	public static boolean method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static460.method6619(arg1, arg0) : Static25.method794(arg0, arg1);
		return local25 | (arg1 & 0x10000) != 0 | Static619.method8223(arg0, arg1);
	}
}
