import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!pa;")
	public static Class86 aClass86_27;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_16;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[Lclient!qi;")
	public static Class94[] aClass94Array3 = new Class94[100];

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_488 = Static186.method3527("");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IJIZ)Lclient!hh;")
	public static Class50 method1037(@OriginalArg(1) long arg0) {
		@Pc(31) long local31 = arg0 / (long) 10;
		@Pc(33) int local33 = 1;
		while (local31 != 0L) {
			local31 /= 10;
			local33++;
		}
		@Pc(52) int local52 = local33;
		if (arg0 < 0L) {
			local52 = local33 + 1;
		}
		@Pc(62) byte[] local62 = new byte[local52];
		if (arg0 < 0L) {
			local62[0] = 45;
		}
		for (@Pc(82) int local82 = 0; local82 < local33; local82++) {
			@Pc(90) int local90 = (int) (arg0 % (long) 10);
			if (local90 < 0) {
				local90 = -local90;
			}
			if (local90 > 9) {
				local90 += 39;
			}
			local62[local52 - local82 - 1] = (byte) (local90 + 48);
			arg0 /= 10;
		}
		@Pc(126) Class50 local126 = new Class50();
		local126.anInt1705 = local52;
		local126.aByteArray12 = local62;
		return local126;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!pa;)V")
	public static void method1040(@OriginalArg(1) Class86 arg0) {
		Static213.aClass86_77 = arg0;
	}
}
