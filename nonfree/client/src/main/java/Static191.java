import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray38;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "[Lclient!co;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt4244 = 0;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!ue;")
	public static Class158 aClass158_1 = new Class158();

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "[I")
	public static int[] anIntArray383 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!eb;I)V")
	public static void method3398(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) long local9 = 0L;
		if (arg0.anInt1486 == 0) {
			local9 = Static172.method3180(arg0.anInt1470, arg0.anInt1476, arg0.anInt1483);
		}
		if (arg0.anInt1486 == 1) {
			local9 = Static150.method1227(arg0.anInt1470, arg0.anInt1476, arg0.anInt1483);
		}
		if (arg0.anInt1486 == 2) {
			local9 = Static199.method3572(arg0.anInt1470, arg0.anInt1476, arg0.anInt1483);
		}
		if (arg0.anInt1486 == 3) {
			local9 = Static242.method4165(arg0.anInt1470, arg0.anInt1476, arg0.anInt1483);
		}
		@Pc(74) int local74 = 0;
		if (local9 != 0L) {
			local74 = (int) local9 >> 20 & 0x3;
			local7 = (int) local9 >> 14 & 0x1F;
			local5 = (int) (local9 >>> 32) & Integer.MAX_VALUE;
		}
		arg0.anInt1475 = local5;
		arg0.anInt1480 = local74;
		arg0.anInt1484 = local7;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method3400(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static267.aBoolean173) {
			try {
				@Pc(26) Class34 local26 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
				local26.method940(arg0);
				return local26;
			} catch (@Pc(35) Throwable local35) {
				Static267.aBoolean173 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method3401() {
		Static58.aClass117_5.method3440();
		Static18.aClass104_1.method3147();
		Static80.aClass104_6.method3147();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method3402(@OriginalArg(1) Class83 arg0) {
		Static49.aClass83_34 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3403(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static71.method1323(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = 0; local27 < local10; local27++) {
			@Pc(32) int local32;
			for (local32 = local17; arg0 != arg1.charAt(local32); local32++) {
			}
			local15[local19++] = arg1.substring(local17, local32);
			local17 = local32 + 1;
		}
		local15[local10] = arg1.substring(local17);
		return local15;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method3404() {
		Static69.method1307();
		Static207.anInterface1Array1 = new Interface1[9];
		Static207.anInterface1Array1[1] = new Class84();
		Static207.anInterface1Array1[2] = new Class75();
		Static207.anInterface1Array1[3] = new Class119();
		Static207.anInterface1Array1[4] = new Class113();
		Static207.anInterface1Array1[5] = new Class52();
		Static207.anInterface1Array1[6] = new Class51();
		Static207.anInterface1Array1[7] = new Class44();
	}
}
