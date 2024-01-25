import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	public static int anInt5862;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public static int anInt5859 = -1;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean459 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public static void method4876(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub5_Sub19 local10 = Static348.method5721(arg0, 11);
		local10.method5174();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	public static void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static26.aClass186ArrayArrayArray1[0][arg1][arg2] != null && Static26.aClass186ArrayArrayArray1[0][arg1][arg2].aClass186_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static26.aClass186ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class186 local44 = Static26.aClass186ArrayArrayArray1[local22][arg1][arg2] = new Class186(local22);
				if (local20) {
					local44.aByte73++;
				}
			}
		}
	}
}
