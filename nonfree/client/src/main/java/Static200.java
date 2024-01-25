import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!hh;")
	public static Class109 aClass109_53;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[6][];

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method3101() {
		for (@Pc(15) Class1_Sub1_Sub18 local15 = (Class1_Sub1_Sub18) Static111.aClass142_14.method3199(); local15 != null; local15 = (Class1_Sub1_Sub18) Static111.aClass142_14.method3198()) {
			@Pc(20) Class47_Sub1_Sub3 local20 = local15.aClass47_Sub1_Sub3_1;
			if (local20.aBoolean120) {
				local15.method5965();
				local20.method1125();
			} else if (Static123.anInt2333 >= local20.anInt1421) {
				local20.method1129(Static384.anInt6843);
				if (local20.aBoolean120) {
					local15.method5965();
				} else {
					Static97.method1543(local20, true);
				}
			}
		}
	}
}
