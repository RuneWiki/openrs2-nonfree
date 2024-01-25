import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_42 = new Class160(76, 3);

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
	public static final int[] anIntArray325 = new int[4096];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZLclient!l;I)V")
	public static void method2336(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub31 arg2) {
		@Pc(8) int local8 = arg2.anInt4563;
		@Pc(12) int local12 = (int) arg2.aLong249;
		arg2.method7849();
		if (arg0) {
			Static26.method400(local8);
		}
		Static476.method6637(local8);
		@Pc(35) Class97 local35 = Static133.method4068(local12);
		if (local35 != null) {
			Static390.method5794(local35);
		}
		Static83.method1317();
		if (!arg1 && Static487.anInt8139 != -1) {
			Static529.method7376(1, Static487.anInt8139);
		}
		@Pc(57) Class243 local57 = new Class243(Static564.aClass212_39);
		for (@Pc(62) Class6_Sub31 local62 = (Class6_Sub31) local57.method5554(); local62 != null; local62 = (Class6_Sub31) local57.method5555()) {
			if (!local62.method7848()) {
				local62 = (Class6_Sub31) local57.method5554();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt4562 == 3) {
				@Pc(86) int local86 = (int) local62.aLong249;
				if (local8 == local86 >>> 16) {
					method2336(true, arg1, local62);
				}
			}
		}
	}
}
