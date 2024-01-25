import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public static int anInt8472;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!qb;)V")
	public static void method7017(@OriginalArg(1) Class6_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class6_Sub1_Sub2_Sub2) {
			@Pc(5) Class6_Sub1_Sub2_Sub2 local5 = (Class6_Sub1_Sub2_Sub2) arg0;
			if (local5.aClass230_1 != null) {
				Static327.method5232(local5, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local5.aByte100);
			}
		} else if (arg0 instanceof Class6_Sub1_Sub2_Sub1) {
			@Pc(31) Class6_Sub1_Sub2_Sub1 local31 = (Class6_Sub1_Sub2_Sub1) arg0;
			Static320.method5155(Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local31.aByte100, local31);
		}
	}
}
