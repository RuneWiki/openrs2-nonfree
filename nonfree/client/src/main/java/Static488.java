import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!ria", name = "K", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array16;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
	public static int anInt8666 = 0;

	@OriginalMember(owner = "client!ria", name = "z", descriptor = "Lclient!us;")
	public static final Class344 aClass344_106 = new Class344(64, -1);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZZLclient!ub;I)V")
	public static void method7168(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub50 arg2) {
		@Pc(8) int local8 = arg2.anInt9575;
		@Pc(12) int local12 = (int) arg2.aLong277;
		arg2.method8671();
		if (arg0) {
			Static136.method3118(local8);
		}
		Static286.method4981(local8);
		@Pc(32) Class108 local32 = Static113.method8285(local12);
		if (local32 != null) {
			Static139.method3135(local32);
		}
		Static268.method4902();
		if (!arg1 && Static530.anInt9144 != -1) {
			Static172.method3556(1, Static530.anInt9144);
		}
		@Pc(56) Class162 local56 = new Class162(Static40.aClass307_5);
		for (@Pc(63) Class3_Sub50 local63 = (Class3_Sub50) local56.method4899(); local63 != null; local63 = (Class3_Sub50) local56.method4898()) {
			if (!local63.method8670()) {
				local63 = (Class3_Sub50) local56.method4899();
				if (local63 == null) {
					return;
				}
			}
			if (local63.anInt9574 == 3) {
				@Pc(89) int local89 = (int) local63.aLong277;
				if (local8 == local89 >>> 16) {
					method7168(true, arg1, local63);
				}
			}
		}
	}
}
