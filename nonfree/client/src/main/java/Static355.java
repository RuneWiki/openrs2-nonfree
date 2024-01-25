import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_125 = new Class92(7, -1);

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_126 = new Class92(4, 11);

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
	public static void method5272() {
		for (@Pc(14) Class6_Sub2_Sub13 local14 = (Class6_Sub2_Sub13) Static446.aClass244_47.method5976(); local14 != null; local14 = (Class6_Sub2_Sub13) Static446.aClass244_47.method5964()) {
			@Pc(19) Class3_Sub2_Sub6 local19 = local14.aClass3_Sub2_Sub6_1;
			if (local19.aBoolean461) {
				local14.method6525();
				local19.method5953();
			} else if (Static66.anInt1741 >= local19.anInt7220) {
				local19.method5958(Static254.anInt4641);
				if (local19.aBoolean461) {
					local14.method6525();
				} else {
					Static411.method6066(local19, true);
				}
			}
		}
	}
}
