import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	public static int anInt2255;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_37 = new Class244(71, 4);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static21.anInt261 = arg0;
		Static20.aString2 = arg2;
		Static27.aString6 = arg1;
		if (Static27.aString6.equals("") || Static20.aString2.equals("")) {
			Static158.anInt2849 = 3;
		} else if (Static41.anInt765 == -1) {
			Static158.anInt2849 = -3;
			Static245.anInt4418 = 0;
			Static329.anInt5569 = 1;
			Static138.anInt2623 = 0;
			@Pc(40) Class3_Sub5 local40 = new Class3_Sub5(128);
			local40.method2791(10);
			local40.method2782((int) (Math.random() * 9.9999999E7D));
			local40.method2760(Static21.method260(Static27.aString6));
			local40.method2782((int) (Math.random() * 9.9999999E7D));
			local40.method2768(Static20.aString2);
			local40.method2782((int) (Math.random() * 9.9999999E7D));
			local40.method2769(Static102.aBigInteger3, Static318.aBigInteger4);
			Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
			Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_10.anInt1930);
			Static23.aClass3_Sub5_Sub1_1.method2791(local40.anInt3121 + 2);
			Static23.aClass3_Sub5_Sub1_1.method2749(577);
			Static23.aClass3_Sub5_Sub1_1.method2742(local40.aByteArray42, local40.anInt3121);
		} else {
			Static114.method1850();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public static void method1903(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(4, arg0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method1904() {
		Static186.aClass139_39.method3075();
	}
}
