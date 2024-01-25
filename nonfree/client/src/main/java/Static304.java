import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lk", name = "Hc", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
	public static int anInt5464 = -2;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(18) long local18 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(24) Class3_Sub48 local24 = (Class3_Sub48) Static319.aClass310_24.method6601(local18);
		if (local24 == null) {
			local24 = new Class3_Sub48();
			Static319.aClass310_24.method6603(local24, local18);
		}
		if (arg1 >= local24.anIntArray674.length) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray674.length; local52++) {
				local45[local52] = local24.anIntArray674[local52];
				local50[local52] = local24.anIntArray675[local52];
			}
			for (@Pc(78) int local78 = local24.anIntArray674.length; local78 < arg1; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local24.anIntArray675 = local50;
			local24.anIntArray674 = local45;
		}
		local24.anIntArray674[arg1] = arg0;
		local24.anIntArray675[arg1] = arg2;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static26.method7436(arg1, arg0) || Static534.method7032(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static310.method4847(arg0, arg1);
		}
	}
}
