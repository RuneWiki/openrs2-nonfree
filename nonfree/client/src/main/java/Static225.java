import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_44 = new Class103(64);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
	public static final int[] anIntArray605 = new int[32];

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	public static int anInt4490 = -1;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;ZLclient!rk;)Lclient!lq;")
	public static Class134 method3957(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class180 arg2) {
		@Pc(8) int local8 = arg2.method4570(arg0);
		if (local8 == -1) {
			return new Class134(0);
		}
		@Pc(23) int[] local23 = arg2.method4568(local8);
		@Pc(29) Class134 local29 = new Class134(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local29.anInt3827 > local31) {
				@Pc(46) Class7_Sub3 local46 = new Class7_Sub3(arg2.method4560(local23[local33++], local8));
				@Pc(50) int local50 = local46.method2767();
				@Pc(54) int local54 = local46.method2764();
				@Pc(58) int local58 = local46.method2772();
				if (!arg1 && local58 == 1) {
					local29.anInt3827--;
				} else {
					local29.anIntArray523[local31] = local50;
					local29.anIntArray522[local31] = local54;
					local31++;
				}
			}
			return local29;
		}
	}
}
