import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method3956() {
		@Pc(10) int local10 = 0;
		if (Static479.aClass1_Sub7_Sub1_1 != null) {
			local10 = Static479.aClass1_Sub7_Sub1_1.method2632(Static375.anInt6609);
		}
		@Pc(29) int local29;
		@Pc(38) int local38;
		if (local10 == 2) {
			local29 = Static309.anInt5589 > 800 ? 800 : Static309.anInt5589;
			Static443.anInt7718 = local29;
			local38 = Static20.anInt611 > 600 ? 600 : Static20.anInt611;
			Static393.anInt6807 = (Static309.anInt5589 - local29) / 2;
			Static377.anInt6644 = 0;
			Static300.anInt5516 = local38;
		} else if (local10 == 1) {
			local29 = Static309.anInt5589 <= 1024 ? Static309.anInt5589 : 1024;
			local38 = Static20.anInt611 > 768 ? 768 : Static20.anInt611;
			Static393.anInt6807 = (Static309.anInt5589 - local29) / 2;
			Static443.anInt7718 = local29;
			Static377.anInt6644 = 0;
			Static300.anInt5516 = local38;
		} else {
			Static443.anInt7718 = Static309.anInt5589;
			Static377.anInt6644 = 0;
			Static300.anInt5516 = Static20.anInt611;
			Static393.anInt6807 = 0;
		}
	}
}
