import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!r;")
	public static Class197 aClass197_61;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!lh;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V", line = 48)
	public static void method3983() {
		@Pc(18) int local18 = Static203.aClass177_Sub1_2.method4493(Class2_Sub10.anInt1760);
		if (local18 == 0) {
			Static213.aByteArrayArrayArray13 = null;
			Static127.method6078(0);
		} else if (local18 == 1) {
			Static283.method5251((byte) 0);
			Static127.method6078(512);
			if (Static334.aByteArrayArrayArray16 != null) {
				Static32.method4208();
			}
		} else {
			Static283.method5251((byte) (Class2_Sub2_Sub10_Sub1.anInt3082 - 4 & 0xFF));
			Static127.method6078(2);
		}
		Class2_Sub3_Sub25.anInt5012 = Static330.anInt6573;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V", line = 84)
	public static void method3984(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub7 local10 = Static293.method5414(1, arg0);
		local10.method2314();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 176)
	public static void method3985(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static17.method4212(arg0, arg1, 0, arg1.length - 1);
	}
}
