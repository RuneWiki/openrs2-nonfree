import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
	public static int anInt2868;

	@OriginalMember(owner = "client!ng", name = "vb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_43;

	@OriginalMember(owner = "client!ng", name = "ab", descriptor = "[I")
	public static int[] anIntArray382 = new int[2048];

	@OriginalMember(owner = "client!ng", name = "db", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1102 = Static169.method2903("Continue");

	@OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!ng", name = "ib", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1103 = Static169.method2903("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ng", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1104 = aClass23_1103;

	@OriginalMember(owner = "client!ng", name = "rb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1106 = Static169.method2903("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ng", name = "ob", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1105 = aClass23_1106;

	@OriginalMember(owner = "client!ng", name = "sb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1107 = aClass23_1102;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method1985() {
		anIntArray382 = null;
		aClass23_1105 = null;
		aClass23_1106 = null;
		aClass23_1103 = null;
		aClass23_1107 = null;
		aClass23_1102 = null;
		aClass23_1104 = null;
		aClass30_43 = null;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public static void method1986() {
		Static111.anInt2840 = 0;
		Static179.anInt4266 = 0;
		Static107.anInt2752 = 0;
		Class88.anInt4185 = -1;
		Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
		Static38.anInt1037 = 0;
		Static17.anInt531 = 0;
		Static87.anInt957 = -1;
		Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
		Static164.aBoolean201 = false;
		Static103.anInt2645 = 0;
		Static140.anInt3588 = -1;
		Static15.anInt475 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local35++) {
			if (Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35] != null) {
				Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local35].anInt1865 = -1;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local62++) {
			if (Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62] != null) {
				Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62].anInt1865 = -1;
			}
		}
		Static96.method1665();
		Static32.method567(30);
		for (@Pc(89) int local89 = 0; local89 < 100; local89++) {
			Static98.aBooleanArray12[local89] = true;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!hf;")
	public static Class1_Sub1_Sub10 method1988(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub10 local12 = (Class1_Sub1_Sub10) Class88.aClass79_28.method2657((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static162.aClass30_59.method1301(4, arg0);
		local12 = new Class1_Sub1_Sub10();
		if (local22 != null) {
			local12.method1135(new Class1_Sub8(local22), arg0);
		}
		Class88.aClass79_28.method2658((long) arg0, local12);
		return local12;
	}
}
