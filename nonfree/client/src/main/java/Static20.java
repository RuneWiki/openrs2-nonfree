import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!fc;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_1 = new Class159(0, 3);

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "[Lclient!ib;")
	public static final Class2_Sub1_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub1_Sub3_Sub1Array1 = new Class2_Sub1_Sub1_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)V")
	public static void method479(@OriginalArg(0) int arg0) {
		Static368.anInt6287 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static209.anInt3602; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static245.anInt4308; local6++) {
				if (Static441.aClass351ArrayArrayArray1[arg0][local3][local6] == null) {
					Static441.aClass351ArrayArrayArray1[arg0][local3][local6] = new Class351(arg0);
				}
			}
		}
	}
}
