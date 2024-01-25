import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "Lclient!kl;")
	public static Class191 aClass191_2;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "Lclient!ci;")
	public static final Class42 aClass42_2 = new Class42("stellardawn", 1);

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "J")
	public static long aLong56 = 0L;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!sea;Z)V")
	public static void method1521(@OriginalArg(0) Class308 arg0) {
		Static68.aClass308_29 = arg0;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)Z")
	public static boolean method1522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static333.method4913(arg1, arg0) & (Static185.method3006(arg0, arg1) | (arg0 & 0x2000) != 0 | Static149.method2491(arg0, arg1));
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1524(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class1_Sub9 local17 = Static123.method2194(Static469.aClass235_2, Static265.aClass208_62);
			local17.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0));
			local17.aClass1_Sub3_Sub1_1.method7920(arg0);
			Static42.method746(local17);
		}
	}
}
