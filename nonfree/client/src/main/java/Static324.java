import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_189 = new Class214(57, 4);

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_204 = new Class137(47, 3);

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "[Lclient!sl;")
	public static final Class222_Sub1[] aClass222_Sub1Array1 = new Class222_Sub1[30];

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_190 = new Class214(109, 8);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIII)V")
	public static void method4162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static159.aClass82ArrayArrayArray2 == null) {
			return;
		}
		@Pc(27) long local27 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(33) Class1_Sub19 local33 = (Class1_Sub19) Static194.aClass257_13.method5503(local27);
		if (local33 == null) {
			Static171.method2327(arg0, arg1, arg2);
			return;
		}
		@Pc(47) Class1_Sub13 local47 = (Class1_Sub13) local33.aClass254_15.method5437();
		if (local47 == null) {
			Static171.method2327(arg0, arg1, arg2);
			return;
		}
		@Pc(61) Class20_Sub5_Sub1 local61 = (Class20_Sub5_Sub1) Static171.method2327(arg0, arg1, arg2);
		if (local61 == null) {
			local61 = new Class20_Sub5_Sub1();
		} else {
			local61.anInt3636 = local61.anInt3638 = -1;
		}
		local61.anInt3630 = local47.anInt1503;
		local61.anInt3639 = local47.anInt1501;
		label44: while (true) {
			@Pc(89) Class1_Sub13 local89 = (Class1_Sub13) local33.aClass254_15.method5433();
			if (local89 == null) {
				break;
			}
			if (local61.anInt3639 != local89.anInt1501) {
				local61.anInt3636 = local89.anInt1501;
				local61.anInt3634 = local89.anInt1503;
				while (true) {
					@Pc(114) Class1_Sub13 local114 = (Class1_Sub13) local33.aClass254_15.method5433();
					if (local114 == null) {
						break label44;
					}
					if (local61.anInt3639 != local114.anInt1501 && local114.anInt1501 != local61.anInt3636) {
						local61.anInt3638 = local114.anInt1501;
						local61.anInt3629 = local114.anInt1503;
					}
				}
			}
		}
		@Pc(158) int local158 = Static183.method4175((arg2 << 7) + 64, (arg1 << 7) - -64, arg0);
		Static334.method4278(arg0, arg1, arg2, local158, local61);
	}
}
