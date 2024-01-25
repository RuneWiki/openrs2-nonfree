import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public static int anInt1648;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_14 = new Class44(16);

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_23 = new Class244(62, 4);

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!us;")
	public static final Class234 aClass234_36 = new Class234(35, -2);

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_24 = new Class244(42, 3);

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "S")
	public static short aShort24 = 1;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZZII)I")
	public static int method1334(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class3_Sub18 local12 = Static214.method3324(arg2, false);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(25) int local25 = 0; local25 < local12.anIntArray226.length; local25++) {
			if (local12.anIntArray226[local25] >= 0 && Static176.aClass78_3.anInt1957 > local12.anIntArray226[local25]) {
				@Pc(54) Class51 local54 = Static176.aClass78_3.method1641(local12.anIntArray226[local25]);
				@Pc(66) int local66 = local54.method1017(arg1, Static255.aClass187_2.method4279(arg1).anInt2631);
				if (arg0) {
					local18 += local12.anIntArray227[local25] * local66;
				} else {
					local18 += local66;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)Lclient!dt;")
	public static Class62 method1338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class62 local9 = Static115.method1862(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass62Array1 == null || local9.aClass62Array1.length <= arg1) {
			return null;
		} else {
			return local9.aClass62Array1[arg1];
		}
	}
}
