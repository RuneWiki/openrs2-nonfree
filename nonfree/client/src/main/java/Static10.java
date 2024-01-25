import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public static int anInt143;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!vea;")
	public static Class2_Sub7_Sub21 aClass2_Sub7_Sub21_1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
	public static void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static348.aClass84ArrayArrayArray5[0][arg1][arg2] != null && Static348.aClass84ArrayArrayArray5[0][arg1][arg2].aClass84_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static348.aClass84ArrayArrayArray5[local22][arg1][arg2] == null) {
				@Pc(44) Class84 local44 = Static348.aClass84ArrayArrayArray5[local22][arg1][arg2] = new Class84(local22);
				if (local20) {
					local44.aByte42++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIZLclient!ha;)Lclient!da;")
	public static Class37 method116(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(17) Class332 local17 = Static56.method1302(arg0, arg1, arg2);
		return local17 == null ? null : local17.aClass37_10;
	}
}
