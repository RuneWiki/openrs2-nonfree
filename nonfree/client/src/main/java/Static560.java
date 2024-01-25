import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
	public static int anInt9308 = 0;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
	public static int anInt9310 = 0;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	public static void method7957() {
		for (@Pc(14) Class3_Sub7_Sub1 local14 = (Class3_Sub7_Sub1) Static536.aClass216_64.method5457(); local14 != null; local14 = (Class3_Sub7_Sub1) Static536.aClass216_64.method5458()) {
			@Pc(19) Class9_Sub2_Sub1_Sub4 local19 = local14.aClass9_Sub2_Sub1_Sub4_1;
			if (local19.aBoolean355) {
				local14.method8682();
				local19.method4164();
			} else if (Static304.anInt8391 >= local19.anInt4866) {
				local19.method4163(Static487.anInt8277);
				if (local19.aBoolean355) {
					local14.method8682();
				} else {
					Static627.method8508(local19, true);
				}
			}
		}
	}
}
