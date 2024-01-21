import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wh", name = "kb", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array11;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "Lclient!bf;")
	public static Class10 aClass10_13 = new Class10(32);

	@OriginalMember(owner = "client!wh", name = "cb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1675 = Static169.method2903("gr-Un:");

	@OriginalMember(owner = "client!wh", name = "gb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1677 = Static169.method2903("Sorry invited players only)3");

	@OriginalMember(owner = "client!wh", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1676 = aClass23_1677;

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1678 = Static169.method2903("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
	public static int anInt4381 = 0;

	@OriginalMember(owner = "client!wh", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1679 = Static169.method2903("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ga;IILclient!ga;I)Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 method3158(@OriginalArg(0) Class30 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) int arg3) {
		return Static162.method2822(arg3, arg1, arg0) ? method3160(arg2.method1301(arg3, arg1)) : null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!ob;)Z")
	public static boolean method3159(@OriginalArg(1) Class60 arg0) {
		@Pc(6) int local6 = arg0.anInt3007;
		if (local6 == 205) {
			Static157.anInt3834 = 250;
			return true;
		}
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (local6 >= 300 && local6 <= 313) {
			local36 = (local6 - 300) / 2;
			local40 = local6 & 0x1;
			Static5.aClass41_35.method1190(local36, local40 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local36 = (local6 - 314) / 2;
			local40 = local6 & 0x1;
			Static5.aClass41_35.method1178(local40 == 1, local36);
		}
		if (local6 == 324) {
			Static5.aClass41_35.method1179(false);
		}
		if (local6 == 325) {
			Static5.aClass41_35.method1179(true);
		}
		if (local6 == 326) {
			Static25.aClass1_Sub8_Sub1_1.method919(63);
			Static5.aClass41_35.method1185(Static25.aClass1_Sub8_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)Lclient!wc;")
	private static Class1_Sub1_Sub12_Sub3_Sub1 method3160(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub1_Sub12_Sub3_Sub1 local18 = new Class1_Sub1_Sub12_Sub3_Sub1(arg0, Static103.anIntArray346, Static59.anIntArray226, Static27.anIntArray109, Static47.anIntArray152, Static14.anIntArray63, Static1.aByteArrayArray1);
			Static54.method996();
			return local18;
		}
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
	public static void method3161() {
		aClass23_1678 = null;
		aClass23_1679 = null;
		aClass23_1677 = null;
		aClass1_Sub1_Sub12_Sub1Array11 = null;
		aClass10_13 = null;
		aClass23_1676 = null;
		aClass23_1675 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method3162(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static42.aBoolean55) {
			try {
				@Pc(20) Class70 local20 = (Class70) Class.forName("Class70_Sub1").getDeclaredConstructor().newInstance();
				local20.method2438(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static42.aBoolean55 = true;
			}
		}
		return arg0;
	}
}
