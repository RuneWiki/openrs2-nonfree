import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
	public static int anInt8491;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	public static final int anInt8494 = -1;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6954(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) int local15 = Static190.anInt3385;
		@Pc(17) int[] local17 = Static502.anIntArray771;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(29) Class49_Sub2_Sub2_Sub1 local29 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local17[local21]];
			if (local29 != null && Static63.aClass49_Sub2_Sub2_Sub1_1 != local29 && local29.aString16 != null && local29.aString16.equalsIgnoreCase(arg1)) {
				local19 = true;
				if (arg0 == 1) {
					Static144.method2331(Static259.aClass296_215);
					Static455.aClass1_Sub6_Sub2_2.method3937(0);
					Static455.aClass1_Sub6_Sub2_2.method3959(local17[local21]);
				} else if (arg0 == 4) {
					Static144.method2331(Static149.aClass296_134);
					Static455.aClass1_Sub6_Sub2_2.method3959(local17[local21]);
					Static455.aClass1_Sub6_Sub2_2.method3957(0);
				} else if (arg0 == 5) {
					Static144.method2331(Static197.aClass296_364);
					Static455.aClass1_Sub6_Sub2_2.method3959(local17[local21]);
					Static455.aClass1_Sub6_Sub2_2.method3957(0);
				} else if (arg0 == 6) {
					Static144.method2331(Static86.aClass296_81);
					Static455.aClass1_Sub6_Sub2_2.method3959(local17[local21]);
					Static455.aClass1_Sub6_Sub2_2.method3938(0);
				} else if (arg0 == 7) {
					Static144.method2331(Static523.aClass296_375);
					Static455.aClass1_Sub6_Sub2_2.method3938(0);
					Static455.aClass1_Sub6_Sub2_2.method3921(local17[local21]);
				}
				break;
			}
		}
		if (!local19) {
			Static324.method5022(Static245.aClass306_58.method7165(Static179.anInt3168) + arg1);
		}
	}
}
