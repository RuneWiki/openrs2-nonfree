import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!cg;")
	public static Class22 aClass22_27;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1391;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!cg;")
	public static Class22 aClass22_28;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public static int anInt1393;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!c;")
	public static Class17 aClass17_9 = new Class17();

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt1390 = 0;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString49 = "shake:";

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!lg;IZ)V")
	public static void method1168(@OriginalArg(0) Class97 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(18) int local18 = arg0.anInt3141 == 0 ? arg0.anInt3201 : arg0.anInt3141;
		@Pc(30) int local30 = arg0.anInt3180 == 0 ? arg0.anInt3190 : arg0.anInt3180;
		Static134.method2175(arg0.anInt3162, arg1, local18, Static217.aClass97ArrayArray1[arg0.anInt3162 >> 16], local30);
		if (arg0.aClass97Array1 != null) {
			Static134.method2175(arg0.anInt3162, arg1, local18, arg0.aClass97Array1, local30);
		}
		@Pc(64) Class4_Sub30 local64 = (Class4_Sub30) Static167.aClass163_25.method4188((long) arg0.anInt3162);
		if (local64 != null) {
			Static65.method4578(arg1, local30, local18, local64.anInt5208);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1170(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) int local4 = arg1.length();
		@Pc(7) int local7 = arg2.length();
		@Pc(14) int local14 = arg0.length();
		if (local7 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(29) int local29 = local4;
		@Pc(34) int local34 = local14 - local7;
		if (local34 != 0) {
			@Pc(42) int local42 = 0;
			while (true) {
				local42 = arg1.indexOf(arg2, local42);
				if (local42 < 0) {
					break;
				}
				local29 += local34;
				local42 += local7;
			}
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local29);
		@Pc(68) int local68 = 0;
		while (true) {
			@Pc(73) int local73 = arg1.indexOf(arg2, local68);
			if (local73 < 0) {
				local66.append(arg1.substring(local68));
				return local66.toString();
			}
			local66.append(arg1.substring(local68, local73));
			local66.append(arg0);
			local68 = local7 + local73;
		}
	}
}
