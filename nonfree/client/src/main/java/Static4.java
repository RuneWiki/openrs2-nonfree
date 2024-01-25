import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "O", descriptor = "Lclient!uu;")
	public static Class343 aClass343_7;

	@OriginalMember(owner = "client!aba", name = "J", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_3 = new Class194(74, -2);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method75(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static550.anInt9147 = arg0;
		Static201.anInt3739 = 2;
		Static63.method1054(arg2, false, arg1);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!uu;[ILclient!uu;I)V")
	public static void method76(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class343 arg2) {
		if (arg1 != null) {
			Static65.anIntArray96 = arg1;
		}
		Static258.aClass343_130 = arg2;
		Static347.aClass343_168 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(II)V")
	public static void method77() {
		@Pc(1) Class136 local1 = Static40.aClass136_9;
		synchronized (Static40.aClass136_9) {
			Static40.aClass136_9.method3132(5);
		}
		local1 = Static309.aClass136_36;
		synchronized (Static309.aClass136_36) {
			Static309.aClass136_36.method3132(5);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)Z")
	public static boolean method78(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class330 local16 = Static370.aClass284_3.method6915(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local16.method7893(arg1);
	}
}
