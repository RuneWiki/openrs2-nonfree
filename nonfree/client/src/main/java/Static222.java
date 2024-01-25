import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_109 = new Class160(62, 6);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZZ)V")
	public static void method3816(@OriginalArg(0) boolean arg0) {
		Static314.aClass263_6.method8437(Static22.aClass144_1.method6943());
		@Pc(10) int[] local10 = Static22.aClass144_1.Y();
		Static260.anInt4871 = local10[0];
		Static332.anInt5721 = local10[1];
		Static6.anInt75 = local10[2];
		Static223.anInt4350 = local10[3];
		if (arg0) {
			Static22.aClass144_1.DA(Static207.anInt3639, Static458.anInt7635, Static346.anInt5880, Static469.anInt11069);
			Static464.method6835(Static210.aDouble11);
		} else {
			Static22.aClass144_1.DA(Static686.anInt11144, Static585.anInt9689, Static523.anInt9004, Static464.anInt7770);
			Static464.method6835(Static231.aDouble13);
		}
	}
}
