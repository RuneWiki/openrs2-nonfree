import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	public static int method8842() {
		@Pc(12) byte local12;
		if (Static125.anInt2059 < 96) {
			local12 = 1;
			Static421.method8914();
		} else {
			@Pc(20) int local20 = Static286.method7989();
			if (local20 <= 100) {
				local12 = 4;
				Static535.method7633();
			} else if (local20 <= 500) {
				Static327.method5102();
				local12 = 3;
			} else if (local20 > 1000) {
				local12 = 1;
				Static421.method8914();
			} else {
				Static249.method3868();
				local12 = 2;
			}
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 0) {
			Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 0);
			Static590.method8288(false, 0);
		}
		Static499.method7307();
		return local12;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method8844() {
		if (Static68.aClass63_1 != null) {
			Static68.aClass63_1.method3495();
		}
		if (Static299.aClass63_2 != null) {
			Static299.aClass63_2.method3495();
		}
	}
}
