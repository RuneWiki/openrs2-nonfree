import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_75 = Static169.method2903("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!ed;")
	private static Class23 aClass23_79 = Static169.method2903("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_76 = aClass23_79;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_77 = Static169.method2903("sl_button");

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_78 = Static169.method2903("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lclient!gb;")
	public static Class1_Sub1_Sub9 method111(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static133.aClass79_21.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static77.aClass30_31.method1301(9, arg0);
		local10 = new Class1_Sub1_Sub9();
		local10.anInt1518 = arg0;
		if (local20 != null) {
			local10.method990(new Class1_Sub8(local20));
		}
		local10.method982();
		Static133.aClass79_21.method2658((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ed;ILclient!ed;Lclient!ga;)Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 method112(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(8) int local8 = arg2.method1281(arg1);
		@Pc(19) int local19 = arg2.method1296(arg0, local8);
		return Static181.method3138(local19, arg2, local8);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method115() {
		aClass23_76 = null;
		aClass23_75 = null;
		aClass23_79 = null;
		aClass23_78 = null;
		aClass23_77 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ga;Lclient!ga;Lclient!ga;)V")
	public static void method116(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2) {
		Static148.aClass30_56 = arg1;
		Static66.aClass30_27 = arg0;
		Static58.aClass30_24 = arg2;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)Lclient!eg;")
	public static Class1_Sub1_Sub7 method118(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static52.aClass79_11.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static105.aClass30_36.method1301(10, arg0);
		local10 = new Class1_Sub1_Sub7();
		local10.anInt1165 = arg0;
		if (local20 != null) {
			local10.method697(new Class1_Sub8(local20));
		}
		local10.method704();
		if (local10.anInt1143 != -1) {
			local10.method699(method118(local10.anInt1147), method118(local10.anInt1143));
		}
		if (!Static174.aBoolean208 && local10.aBoolean54) {
			local10.aClass23Array3 = null;
			local10.anInt1135 = 0;
			local10.aBoolean53 = false;
			local10.aClass23_431 = Static162.aClass23_1528;
			local10.aClass23Array4 = null;
		}
		Static52.aClass79_11.method2658((long) arg0, local10);
		return local10;
	}
}
