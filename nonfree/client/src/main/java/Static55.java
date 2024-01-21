import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!k", name = "r", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_924 = Static106.method1849("::");

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!sc;")
	private static Class66 aClass66_925 = Static106.method1849("OFF");

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_926 = aClass66_925;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!sc;")
	private static Class66 aClass66_927 = Static106.method1849("Please contact customer support)3");

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_928 = aClass66_927;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_929 = Static106.method1849(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!mc;")
	public static Class1_Sub12 aClass1_Sub12_8 = new Class1_Sub12(8);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Lclient!id;")
	public static Class1_Sub1_Sub5 method1238(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) Static109.aClass60_80.method1745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static56.aClass5_51.method107(arg0, 9);
		local10 = new Class1_Sub1_Sub5();
		local10.anInt1488 = arg0;
		if (local20 != null) {
			local10.method1047(new Class1_Sub12(local20));
		}
		local10.method1042();
		Static109.aClass60_80.method1741((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)I")
	public static int method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class1_Sub24 local6 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray502.length) {
			return local6.anIntArray502[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method1240(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static2.aBoolean1) {
			try {
				@Pc(23) Class40 local23 = (Class40) Class.forName("Class40_Sub1").getDeclaredConstructor().newInstance();
				local23.method1294(arg0);
				return local23;
			} catch (@Pc(32) Throwable local32) {
				Static2.aBoolean1 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1241() {
		if (!Static51.aBoolean65) {
			return;
		}
		@Pc(16) Class1_Sub10 local16 = Static127.method2030(Static90.anInt1844, Static24.anInt688);
		if (local16 != null && local16.anObjectArray15 != null) {
			@Pc(25) Class1_Sub5 local25 = new Class1_Sub5();
			local25.aClass1_Sub10_1 = local16;
			local25.anObjectArray3 = local16.anObjectArray15;
			Static38.method2005(local25);
		}
		Static51.aBoolean65 = false;
		Static70.method537(local16);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1242() {
		aClass66_924 = null;
		aClass66_926 = null;
		aClass66_925 = null;
		aClass66_929 = null;
		aClass1_Sub12_8 = null;
		aBigInteger2 = null;
		aClass66_927 = null;
		aClass66_928 = null;
	}
}
