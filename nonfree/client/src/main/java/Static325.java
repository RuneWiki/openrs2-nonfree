import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public static int anInt6336;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([[[Lclient!dc;B)V")
	public static void method5341(@OriginalArg(0) Class51[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class51[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class51 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass1_Sub4_1 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub4_1).method5504();
						}
						if (local23.aClass1_Sub3_2 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub3_2).method5504();
						}
						if (local23.aClass1_Sub3_1 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub3_1).method5504();
						}
						if (local23.aClass1_Sub1_2 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub1_2).method5504();
						}
						if (local23.aClass1_Sub1_1 instanceof Interface8) {
							((Interface8) local23.aClass1_Sub1_1).method5504();
						}
						for (@Pc(73) Class11 local73 = local23.aClass11_2; local73 != null; local73 = local73.aClass11_1) {
							@Pc(78) Class1_Sub2 local78 = local73.aClass1_Sub2_1;
							if (local78 instanceof Interface8) {
								((Interface8) local78).method5504();
							}
						}
					}
				}
			}
		}
	}
}
