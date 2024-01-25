import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
	public static int anInt3980 = -1;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Lclient!bfa;")
	public static final Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B[[[Lclient!ch;)V")
	public static void method3415(@OriginalArg(1) Class53[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class53[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class53 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass13_Sub1_Sub2_1 instanceof Interface25) {
							((Interface25) local27.aClass13_Sub1_Sub2_1).method8424();
						}
						if (local27.aClass13_Sub1_Sub3_2 instanceof Interface25) {
							((Interface25) local27.aClass13_Sub1_Sub3_2).method8424();
						}
						if (local27.aClass13_Sub1_Sub3_1 instanceof Interface25) {
							((Interface25) local27.aClass13_Sub1_Sub3_1).method8424();
						}
						if (local27.aClass13_Sub1_Sub4_1 instanceof Interface25) {
							((Interface25) local27.aClass13_Sub1_Sub4_1).method8424();
						}
						if (local27.aClass13_Sub1_Sub4_2 instanceof Interface25) {
							((Interface25) local27.aClass13_Sub1_Sub4_2).method8424();
						}
						for (@Pc(77) Class325 local77 = local27.aClass325_1; local77 != null; local77 = local77.aClass325_3) {
							@Pc(82) Class13_Sub1_Sub1 local82 = local77.aClass13_Sub1_Sub1_1;
							if (local82 instanceof Interface25) {
								((Interface25) local82).method8424();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!rl;")
	public static Class167 method3416(@OriginalArg(1) Component arg0) {
		return new Class167_Sub1(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!paa;ZLclient!paa;)V")
	public static void method3417(@OriginalArg(0) Class261 arg0, @OriginalArg(2) Class261 arg1) {
		@Pc(12) Class2_Sub40 local12 = Static464.method6285(Static251.aClass131_1, Static489.aClass179_24);
		local12.aClass2_Sub22_Sub2_2.method8552(arg1.anInt6614);
		local12.aClass2_Sub22_Sub2_2.method8507(arg0.anInt6629);
		local12.aClass2_Sub22_Sub2_2.method8500(arg1.anInt6585);
		local12.aClass2_Sub22_Sub2_2.method8495(arg0.anInt6585);
		local12.aClass2_Sub22_Sub2_2.method8528(arg1.anInt6629);
		local12.aClass2_Sub22_Sub2_2.method8505(arg0.anInt6614);
		Static528.method7295(local12);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public static void method3418() {
		Static158.aBoolean212 = true;
	}
}
