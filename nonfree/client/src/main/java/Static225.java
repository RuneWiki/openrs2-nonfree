import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!hh;")
	public static Class109 aClass109_57;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_12 = new Class222(14, 0, 4, 1);

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { 21, 12, 23, 50, 45, 59, 3, 13 };

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public static int anInt3905 = 0;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString52 = null;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
	public static void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static241.aString60 = arg1;
		Static214.anInt6459 = arg0;
		Static392.aString83 = arg2;
		if (Static392.aString83.equals("") || Static241.aString60.equals("")) {
			Static195.anInt3545 = 3;
		} else if (Static20.anInt299 == -1) {
			Static178.anInt3353 = 1;
			Static277.anInt4670 = 0;
			Static195.anInt3545 = -3;
			Static305.anInt5157 = 0;
			@Pc(46) Class1_Sub14 local46 = new Class1_Sub14(128);
			local46.method4553(10);
			local46.method4522((int) (Math.random() * 9.9999999E7D));
			local46.method4502(Static112.method1763(Static392.aString83));
			local46.method4522((int) (Math.random() * 9.9999999E7D));
			local46.method4512(Static241.aString60);
			local46.method4522((int) (Math.random() * 9.9999999E7D));
			local46.method4543(Static233.aBigInteger1, Static321.aBigInteger2);
			Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
			Static201.aClass1_Sub14_Sub2_2.method4553(Static121.aClass44_10.anInt793);
			Static201.aClass1_Sub14_Sub2_2.method4553(local46.anInt5695 + 2);
			Static201.aClass1_Sub14_Sub2_2.method4504(588);
			Static201.aClass1_Sub14_Sub2_2.method4506(local46.aByteArray65, local46.anInt5695);
		} else {
			Static168.method2629();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
	public static void method3278(@OriginalArg(0) boolean arg0) {
		Static186.anInt3458 = 0;
		Static218.anInt3861 = 0;
		Static328.method4744();
		Static430.method5800(arg0);
		Static324.method4565();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static218.anInt3861; local23++) {
			local29 = Static402.anIntArray554[local23];
			if (Static307.aClass47_Sub1_Sub5_Sub1Array1[local29].anInt5343 != Static123.anInt2333) {
				if (Static307.aClass47_Sub1_Sub5_Sub1Array1[local29].aClass196_1.method4406()) {
					Static315.method4338(Static307.aClass47_Sub1_Sub5_Sub1Array1[local29]);
				}
				Static307.aClass47_Sub1_Sub5_Sub1Array1[local29].method3157(null);
				Static307.aClass47_Sub1_Sub5_Sub1Array1[local29] = null;
			}
		}
		if (Static116.aClass1_Sub14_Sub2_1.anInt5695 != Static282.anInt4732) {
			throw new RuntimeException("gnp1 pos:" + Static116.aClass1_Sub14_Sub2_1.anInt5695 + " psize:" + Static282.anInt4732);
		}
		for (local29 = 0; local29 < Static47.anInt760; local29++) {
			if (Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local29]] == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static47.anInt760);
			}
		}
	}
}
