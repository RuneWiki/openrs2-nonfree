import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3 method478() {
		@Pc(7) Class2_Sub2_Sub3_Sub3 local7 = new Class2_Sub2_Sub3_Sub3();
		local7.anInt1448 = Static160.anIntArray642[0];
		local7.anInt1450 = Static15.anInt483;
		local7.aByteArray24 = Static170.aByteArrayArray10[0];
		local7.anInt1449 = Static2.anIntArray15[0];
		local7.anInt1453 = Static37.anIntArray175[0];
		local7.anIntArray229 = Static173.anIntArray623;
		local7.anInt1451 = Static178.anIntArray637[0];
		local7.anInt1452 = Static138.anInt3346;
		Static59.method1102();
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)V")
	public static void method479() {
		Static24.aClass82_14.method2698();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method480(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static95.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static125.aClass9_1);
		arg0.addFocusListener(Static125.aClass9_1);
	}
}
