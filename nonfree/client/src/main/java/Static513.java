import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7221(@OriginalArg(1) String arg0) {
		if (Static561.aClass345Array1 != null) {
			@Pc(21) Class2_Sub50 local21 = Static595.method8194(Static610.aClass310_2, Static376.aClass269_67);
			local21.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0));
			local21.aClass2_Sub34_Sub2_2.method6918(arg0);
			Static311.method4754(local21);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
	public static boolean method7222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static336.method5206(arg1, arg0) : Static633.method8493(arg0, arg1);
		return local25 | Static480.method6932(arg1, arg0) | (arg1 & 0x10000) != 0;
	}
}
