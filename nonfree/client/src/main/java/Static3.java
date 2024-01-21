import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public static int anInt104;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
	public static int anInt110;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
	public static int anInt112;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public static void method73() {
		for (@Pc(14) Class1_Sub6 local14 = (Class1_Sub6) Static2.aClass30_2.method1115(); local14 != null; local14 = (Class1_Sub6) Static2.aClass30_2.method1125()) {
			if (local14.aClass1_Sub10_Sub4_3 != null) {
				Static25.aClass1_Sub10_Sub1_1.method453(local14.aClass1_Sub10_Sub4_3);
				local14.aClass1_Sub10_Sub4_3 = null;
			}
			if (local14.aClass1_Sub10_Sub4_2 != null) {
				Static25.aClass1_Sub10_Sub1_1.method453(local14.aClass1_Sub10_Sub4_2);
				local14.aClass1_Sub10_Sub4_2 = null;
			}
		}
		Static2.aClass30_2.method1118();
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public static void method74() {
		aClass82_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!re;)V")
	public static void method75(@OriginalArg(0) Class75 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3164; local2 <= arg0.anInt3161; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3158; local6 <= arg0.anInt3165; local6++) {
				@Pc(16) Class1_Sub17 local16 = Static167.aClass1_Sub17ArrayArrayArray1[arg0.anInt3155][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1851; local20++) {
						if (local16.aClass75Array2[local20] == arg0) {
							local16.anInt1851--;
							for (local35 = local20; local35 < local16.anInt1851; local35++) {
								local16.aClass75Array2[local35] = local16.aClass75Array2[local35 + 1];
								local16.anIntArray176[local35] = local16.anIntArray176[local35 + 1];
							}
							local16.aClass75Array2[local16.anInt1851] = null;
							break;
						}
					}
					local16.anInt1852 = 0;
					for (local35 = 0; local35 < local16.anInt1851; local35++) {
						local16.anInt1852 |= local16.anIntArray176[local35];
					}
				}
			}
		}
	}
}
