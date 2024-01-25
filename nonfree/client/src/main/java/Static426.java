import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "Lclient!hq;")
	public static final Class2_Sub20_Sub1 aClass2_Sub20_Sub1_2 = new Class2_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V")
	public static void method5764(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 11);
		local8.method435();
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	public static void method5767() {
		if (Static197.anInt3816 != 3) {
			Static62.anInt1710 = -1;
		}
	}
}
