import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!lr;I)I")
	public static int method820(@OriginalArg(0) Class2_Sub7_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method4535(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.method4535(5);
		} else if (local10 == 2) {
			local22 = arg0.method4535(8);
		} else {
			local22 = arg0.method4535(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!mv;B)I")
	public static int method824(@OriginalArg(0) Class229 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4954(Static249.anInt4135)) {
			local5++;
		}
		if (arg0.method4954(Static92.anInt1637)) {
			local5++;
		}
		if (arg0.method4954(Static394.anInt6517)) {
			local5++;
		}
		if (arg0.method4954(Static162.anInt2513)) {
			local5++;
		}
		if (arg0.method4954(Static386.anInt6383)) {
			local5++;
		}
		if (arg0.method4954(Static203.anInt2985)) {
			local5++;
		}
		if (arg0.method4954(Static178.anInt2663)) {
			local5++;
		}
		if (arg0.method4954(Static482.anInt7692)) {
			local5++;
		}
		if (arg0.method4954(Static528.anInt8478)) {
			local5++;
		}
		if (arg0.method4954(Static288.anInt4884)) {
			local5++;
		}
		if (arg0.method4954(Static489.anInt7750)) {
			local5++;
		}
		if (arg0.method4954(Static359.anInt3111)) {
			local5++;
		}
		if (arg0.method4954(Static350.anInt5992)) {
			local5++;
		}
		if (arg0.method4954(Static314.anInt7786)) {
			local5++;
		}
		if (arg0.method4954(Static176.anInt2649)) {
			local5++;
		}
		if (arg0.method4954(Static375.anInt6286)) {
			local5++;
		}
		return local5;
	}
}
