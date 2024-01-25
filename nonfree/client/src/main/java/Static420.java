import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/lang/String;ZLclient!ic;)Lclient!bh;")
	public static Class22 method210(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class113 arg2) {
		@Pc(10) int local10 = arg2.method2269(arg0);
		if (local10 == -1) {
			return new Class22(0);
		}
		@Pc(24) int[] local24 = arg2.method2280(local10);
		@Pc(35) Class22 local35 = new Class22(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt545) {
				@Pc(53) Class1_Sub11 local53 = new Class1_Sub11(arg2.method2274(local10, local24[local39++]));
				@Pc(59) int local59 = local53.method4487();
				@Pc(63) int local63 = local53.method4485();
				@Pc(67) int local67 = local53.method4463();
				if (!arg1 && local67 == 1) {
					local35.anInt545--;
				} else {
					local35.anIntArray29[local37] = local59;
					local35.anIntArray27[local37] = local63;
					local37++;
				}
			}
			return local35;
		}
	}
}
