import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	public static int anInt8879;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIB)I")
	public static int method7585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static532.anInt8252 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg2 - Static154.anInt437;
		@Pc(29) int local29 = arg0 - Static154.anInt439;
		for (@Pc(36) Class4_Sub30 local36 = (Class4_Sub30) Static154.aClass163_6.method3639(); local36 != null; local36 = (Class4_Sub30) Static154.aClass163_6.method3640()) {
			if (arg1 == local36.anInt4794) {
				@Pc(49) int local49 = local36.anInt4799;
				@Pc(52) int local52 = local36.anInt4798;
				@Pc(63) int local63 = local52 + Static154.anInt439 | Static154.anInt437 + local49 << 14;
				@Pc(82) int local82 = (local29 - local52) * (local29 + -local52) + (local24 - local49) * (local24 - local49);
				if (local17 < 0 || local19 > local82) {
					local17 = local63;
					local19 = local82;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7587(@OriginalArg(0) String arg0) {
		return Static515.aHashtable6.containsKey(arg0);
	}
}
