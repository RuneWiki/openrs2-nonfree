import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "J")
	public static long aLong108;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_19 = new Class110(1, 4);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method3098(@OriginalArg(0) int arg0) {
		Static216.anInt4414 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static223.anInt4520; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static416.anInt10065; local6++) {
				if (Static580.aClass125ArrayArrayArray3[arg0][local3][local6] == null) {
					Static580.aClass125ArrayArrayArray3[arg0][local3][local6] = new Class125(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)[Lclient!en;")
	public static Class87[] method3101() {
		return new Class87[] { Static587.aClass87_7, Static185.aClass87_6, Static120.aClass87_4 };
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public static void method3102() {
		for (@Pc(9) Class55_Sub1 local9 = (Class55_Sub1) Static220.aClass134_6.method3234(); local9 != null; local9 = (Class55_Sub1) Static220.aClass134_6.method3234()) {
			Static391.method6250(local9);
		}
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823)) {
			local31 = 0;
			local33 = 3;
		} else {
			local33 = Static96.anInt2320;
			local31 = Static96.anInt2320;
		}
		Static68.method1701();
		for (@Pc(41) int local41 = local31; local41 <= local33; local41++) {
			Static68.method1700();
			Static68.method1698(local41);
			Static68.method1708(local41);
		}
		Static68.method1699();
		Static68.method1707();
	}
}
