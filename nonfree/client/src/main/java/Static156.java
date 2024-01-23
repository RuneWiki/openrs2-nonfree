import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2850(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(2, arg0);
		local12.method2052();
		local12.aString95 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Lclient!kj;")
	public static Class96 method2852(@OriginalArg(1) int arg0) {
		@Pc(18) Class96 local18 = (Class96) Static232.aClass157_39.method4031((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34 = Static256.aClass42_78.method1256(Static126.method3258(arg0), Static255.method4019(arg0));
		local18 = new Class96();
		local18.anInt3388 = arg0;
		if (local34 != null) {
			local18.method2796(new Class2_Sub16(local34));
		}
		Static232.aClass157_39.method4026((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)V")
	public static void method2854(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(6, arg0);
		local12.method2043();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!tk;)V")
	public static void method2855(@OriginalArg(0) Class170 arg0) {
		for (@Pc(2) int local2 = arg0.anInt5433; local2 <= arg0.anInt5435; local2++) {
			for (@Pc(9) int local9 = arg0.anInt5437; local9 <= arg0.anInt5448; local9++) {
				@Pc(22) Class2_Sub13 local22 = Static52.aClass2_Sub13ArrayArrayArray1[arg0.anInt5439][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt1544; local26++) {
						if (local22.aClass170Array1[local26] == arg0) {
							local22.anInt1544--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt1544; local44++) {
								local22.aClass170Array1[local44] = local22.aClass170Array1[local44 + 1];
								local22.anIntArray131[local44] = local22.anIntArray131[local44 + 1];
							}
							local22.aClass170Array1[local22.anInt1544] = null;
							break;
						}
					}
					local22.anInt1550 = 0;
					for (local26 = 0; local26 < local22.anInt1544; local26++) {
						local22.anInt1550 |= local22.anIntArray131[local26];
					}
				}
			}
		}
	}
}
