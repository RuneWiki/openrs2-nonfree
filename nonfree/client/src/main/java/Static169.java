import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "Lclient!ij;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
	public static int anInt2957;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!b;B)I")
	public static int method2613(@OriginalArg(0) Class20 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method226(Static382.anInt6412)) {
			local5++;
		}
		if (arg0.method226(Static139.anInt2632)) {
			local5++;
		}
		if (arg0.method226(Static92.anInt1898)) {
			local5++;
		}
		if (arg0.method226(Static389.anInt6459)) {
			local5++;
		}
		if (arg0.method226(Static50.anInt1073)) {
			local5++;
		}
		if (arg0.method226(Static229.anInt4044)) {
			local5++;
		}
		if (arg0.method226(Static308.anInt5327)) {
			local5++;
		}
		if (arg0.method226(Static83.anInt1724)) {
			local5++;
		}
		if (arg0.method226(Static308.anInt5330)) {
			local5++;
		}
		if (arg0.method226(Static318.anInt2155)) {
			local5++;
		}
		if (arg0.method226(Static316.anInt5435)) {
			local5++;
		}
		if (arg0.method226(Static289.anInt5034)) {
			local5++;
		}
		if (arg0.method226(Static251.anInt4502)) {
			local5++;
		}
		if (arg0.method226(Static8.anInt6463)) {
			local5++;
		}
		if (arg0.method226(Static366.anInt4864)) {
			local5++;
		}
		if (arg0.method226(Static199.anInt3570)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ck;B)I")
	public static int method2614(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method859(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method859(5);
		} else if (local10 == 2) {
			local17 = arg0.method859(8);
		} else {
			local17 = arg0.method859(11);
		}
		return local17;
	}
}
