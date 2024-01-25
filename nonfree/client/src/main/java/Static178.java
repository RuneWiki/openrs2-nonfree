import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!is", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "I")
	public static int anInt5442 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public static void method4310() {
		for (@Pc(10) Class21_Sub4 local10 = (Class21_Sub4) Static313.aClass93_5.method2076(); local10 != null; local10 = (Class21_Sub4) Static313.aClass93_5.method2076()) {
			Static254.method3218(local10);
		}
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (Static2.aClass148_Sub1_1.method3047(Static288.anInt4743)) {
			local31 = 0;
			local33 = 3;
		} else {
			local33 = Static280.anInt4592;
			local31 = Static280.anInt4592;
		}
		Static55.method799();
		for (@Pc(42) int local42 = local31; local42 <= local33; local42++) {
			Static55.method800();
			Static55.method807(local42);
			Static55.method803(local42);
		}
		Static55.method798();
		Static55.method810();
	}
}
