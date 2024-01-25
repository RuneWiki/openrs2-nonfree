import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static705 {

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "J")
	public static long aLong376;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!da;")
	public static Class44 aClass44_53;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public static int anInt11025 = 7000;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public static int anInt11029 = anInt11025;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!lb;BZLjava/lang/String;)Lclient!fda;")
	public static Class108 method9211(@OriginalArg(0) Class221 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method5096(arg2);
		if (local10 == -1) {
			return new Class108(0);
		}
		@Pc(31) int[] local31 = arg0.method5085(local10);
		@Pc(37) Class108 local37 = new Class108(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt3129 > local39) {
				@Pc(55) Class3_Sub28 local55 = new Class3_Sub28(arg0.method5089(local31[local41++], local10));
				@Pc(59) int local59 = local55.method5312();
				@Pc(63) int local63 = local55.method5272();
				@Pc(67) int local67 = local55.method5322(-30);
				if (!arg1 && local67 == 1) {
					local37.anInt3129--;
				} else {
					local37.anIntArray156[local39] = local59;
					local37.anIntArray155[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
