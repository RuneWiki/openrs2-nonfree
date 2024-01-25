import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!wj;")
	public static Class388 aClass388_1;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_363 = new Class179(94, 0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V")
	public static void method8805(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static653.method8882(arg0, Static52.aClass41_12.method1007(Static616.anInt10077), arg1);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method8806() {
		for (@Pc(10) Class6_Sub4_Sub21 local10 = (Class6_Sub4_Sub21) Static129.aClass362_11.method8538(); local10 != null; local10 = (Class6_Sub4_Sub21) Static129.aClass362_11.method8530()) {
			@Pc(22) Class2_Sub1_Sub1_Sub1 local22 = local10.aClass2_Sub1_Sub1_Sub1_1;
			if (local22.aBoolean68) {
				local10.method9174();
				local22.method1186();
			} else if (Static90.anInt1698 >= local22.anInt1258) {
				local22.method1184(Static332.anInt7620);
				if (local22.aBoolean68) {
					local10.method9174();
				} else {
					Static23.method582(local22, true);
				}
			}
		}
	}
}
