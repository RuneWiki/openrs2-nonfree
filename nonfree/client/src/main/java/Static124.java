import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
	public static void method1779() throws IOException {
		if (Static155.aClass121_2 == null || Static189.anInt3261 <= 0) {
			return;
		}
		@Pc(7) int local7 = 0;
		while (true) {
			@Pc(12) Class2_Sub40 local12 = (Class2_Sub40) Static436.aClass109_45.method2325();
			if (local12 == null) {
				Static137.anInt2278 += local7;
				Static22.anInt550 = 0;
				break;
			}
			Static155.aClass121_2.method2937(local12.aClass2_Sub22_Sub2_2.aByteArray115, local12.anInt8040);
			local7 += local12.anInt8040;
			Static189.anInt3261 -= local12.anInt8040;
			local12.method8653();
			local12.aClass2_Sub22_Sub2_2.method8510();
			local12.method6820();
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Lclient!g;")
	public static Class113 method1780(@OriginalArg(0) int arg0) {
		@Pc(8) Class113[] local8 = Static21.method420();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			@Pc(23) Class113 local23 = local8[local17];
			if (arg0 == local23.anInt3065) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V")
	public static void method1781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 5);
		local8.method662();
		local8.anInt823 = arg1;
	}
}
