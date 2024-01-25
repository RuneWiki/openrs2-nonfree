import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!oh;")
	public static Class237 aClass237_77;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)I")
	public static int method4816() {
		@Pc(12) byte local12;
		if (Static153.anInt3785 < 96) {
			local12 = 1;
			Static169.method3359();
		} else {
			@Pc(20) int local20 = Static341.method5460();
			if (local20 <= 100) {
				local12 = 4;
				Static426.method6634();
			} else if (local20 <= 500) {
				Static139.method2957();
				local12 = 3;
			} else if (local20 <= 1000) {
				Static127.method2816();
				local12 = 2;
			} else {
				Static169.method3359();
				local12 = 1;
			}
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 0) {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 0);
			Static553.method7773(false, 0);
		}
		Static35.method7912();
		return local12;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
	public static int method4817(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	public static void method4818() {
		if (Static609.aClass42_3 != null) {
			Static609.aClass42_3.method1409();
		}
		if (Static156.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static156.aThread1.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}
}
