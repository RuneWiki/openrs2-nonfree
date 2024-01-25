import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public static final int anInt6275 = Static344.method5361(1600);

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public static int anInt6278 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public static void method5207() {
		Static319.aClass5_Sub47_2 = new Class5_Sub47(Static217.aClass40_64.method1063(Static194.anInt3737), "", Static92.anInt2142, 1006, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLjava/lang/String;ILclient!gp;)Lclient!mj;")
	public static Class197 method5208(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class117 arg2) {
		@Pc(10) int local10 = arg2.method2982(arg1);
		if (local10 == -1) {
			return new Class197(0);
		}
		@Pc(23) int[] local23 = arg2.method2963(local10);
		@Pc(29) Class197 local29 = new Class197(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local31 < local29.anInt6065) {
				@Pc(47) Class5_Sub3 local47 = new Class5_Sub3(arg2.method2962(local23[local33++], local10));
				@Pc(51) int local51 = local47.method4230();
				@Pc(55) int local55 = local47.method4227();
				@Pc(59) int local59 = local47.method4220();
				if (!arg0 && local59 == 1) {
					local29.anInt6065--;
				} else {
					local29.anIntArray418[local31] = local51;
					local29.anIntArray417[local31] = local55;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public static void method5209(@OriginalArg(0) int arg0) {
		Static179.anInt3489 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static374.anInt6925; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static430.anInt7565; local6++) {
				if (Static152.aClass37ArrayArrayArray1[arg0][local3][local6] == null) {
					Static152.aClass37ArrayArrayArray1[arg0][local3][local6] = new Class37(arg0, local3, local6);
				}
			}
		}
	}
}
