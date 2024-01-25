import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!ae;")
	public static Class4 aClass4_20;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	public static int anInt5584;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_147 = new Class21(64);

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public static int anInt5578 = 0;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_187 = new Class18(37, 2);

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_188 = new Class18(19, 7);

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_148 = new Class21(32);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!ct;I)Lclient!jr;")
	public static Class1_Sub4_Sub15 method5080(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg1.method1161(arg0, arg2));
		@Pc(47) Class1_Sub4_Sub15 local47 = new Class1_Sub4_Sub15(arg0, local14.method2109(), local14.method2109(), local14.method2140(), local14.method2140(), local14.method2132() == 1, local14.method2132(), local14.method2132());
		@Pc(51) int local51 = local14.method2132();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass42_18.method1549(new Class1_Sub33(local14.method2132(), local14.method2161(), local14.method2161(), local14.method2161(), local14.method2161(), local14.method2161(), local14.method2161(), local14.method2161(), local14.method2161()));
		}
		local47.method2975();
		return local47;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V")
	public static void method5081(@OriginalArg(0) int arg0) {
		Static85.anInt1908 = arg0;
		Static324.aClass21_164.method857();
	}
}
