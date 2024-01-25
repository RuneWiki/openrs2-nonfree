import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_22 = new Class130(82, 7);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	public static void method1458() {
		for (@Pc(1) int local1 = 0; local1 < Static270.anInt4932; local1++) {
			@Pc(6) Class4_Sub1_Sub2 local6 = Static290.aClass4_Sub1_Sub2Array1[local1];
			Static371.method6017(local6, true);
			Static290.aClass4_Sub1_Sub2Array1[local1] = null;
		}
		Static270.anInt4932 = 0;
	}
}
