import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!da;")
	public static Class6 aClass6_11;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public static int anInt7394;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_50 = new Class293(64);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)Lclient!jw;")
	public static Class145 method6510() {
		try {
			return new Class145_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class145) Class.forName("Class145_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class145_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!li;I)V")
	public static void method6511(@OriginalArg(0) Class5_Sub4_Sub14 arg0) {
		if (arg0 == null) {
			return;
		}
		Static607.aClass306_63.method7303(arg0);
		Static642.anInt10370++;
		@Pc(39) Class5_Sub4_Sub6 local39;
		if (arg0.aBoolean472 || "".equals(arg0.aString91)) {
			local39 = new Class5_Sub4_Sub6(arg0.aString91);
			Static198.anInt3547++;
		} else {
			@Pc(33) long local33 = arg0.aLong164;
			for (local39 = (Class5_Sub4_Sub6) Static28.aClass81_7.method1599(local33); local39 != null && !local39.aString36.equals(arg0.aString91); local39 = (Class5_Sub4_Sub6) Static28.aClass81_7.method1605()) {
			}
			if (local39 == null) {
				local39 = (Class5_Sub4_Sub6) Static517.aClass293_59.method6921(local33);
				if (local39 != null && !local39.aString36.equals(arg0.aString91)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class5_Sub4_Sub6(arg0.aString91);
				}
				Static28.aClass81_7.method1607(local39, local33);
				Static198.anInt3547++;
			}
		}
		if (local39.method2112(arg0)) {
			Static153.method2233(local39);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBI)Z")
	public static boolean method6512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
