import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "[Lclient!oq;")
	public static Class272[] aClass272Array40;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!ir;")
	public static final Class86 aClass86_1 = Static282.method4102();

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!gm;")
	public static final Class135 aClass135_12 = new Class135("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I")
	public static int method8394() {
		return Static235.anInt4187++;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method8395(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	public static int method8396() {
		@Pc(32) byte local32;
		if (Static525.anInt8303 >= 96) {
			@Pc(17) int local17 = Static596.method5956();
			if (local17 <= 100) {
				Static443.method6043();
				local32 = 4;
			} else if (local17 <= 500) {
				local32 = 3;
				Static623.method8412();
			} else if (local17 <= 1000) {
				local32 = 2;
				Static386.method5403();
			} else {
				Static677.method9019();
				local32 = 1;
			}
		} else {
			local32 = 1;
			Static677.method9019();
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 0) {
			Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
			Static168.method2665(false, 0);
		}
		Static219.method3247();
		return local32;
	}
}
