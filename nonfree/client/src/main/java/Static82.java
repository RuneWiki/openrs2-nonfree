import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_11 = new Class230(62, 8);

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_11 = new Class276(111, 6);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
	public static boolean method1134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static130.method2554(arg1, arg0) | (arg1 & 0x40000) != 0 || Static251.method4498(arg1, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method1137() {
		Static262.method4617();
		Static129.method8413();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIZ)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(4, arg3);
		local8.method1898();
		local8.anInt1946 = arg2;
		local8.anInt1951 = arg0;
		local8.anInt1945 = arg1;
	}
}
