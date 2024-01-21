import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!ea;")
	public static Class20 aClass20_33;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	public static int anInt1788;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static int anInt1790;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_467 = method1113("scape main");

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!ec;")
	private static Class22 aClass22_468 = method1113("Loading fonts )2 ");

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public static int anInt1787 = 0;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static final int anInt1793 = 5063219;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Lclient!ec;")
	public static Class22 aClass22_469 = aClass22_468;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "[I")
	public static int[] anIntArray173 = new int[128];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method1111(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static96.aBoolean222) {
			try {
				@Pc(28) Class8 local28 = (Class8) Class.forName("Class8_Sub1").getDeclaredConstructor().newInstance();
				local28.method150(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static96.aBoolean222 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!ec;")
	public static Class22 method1113(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class22 local13 = new Class22();
		local13.aByteArray7 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local9 > local19) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(49) int local49 = local6[local19++] & 0xFF;
				local13.aByteArray7[local13.anInt668++] = (byte) (local49 + (local27 + -40) * 43 - 48);
			} else if (local27 != 0) {
				local13.aByteArray7[local13.anInt668++] = (byte) local27;
			}
		}
		local13.method478();
		return local13.method463();
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public static void method1114() {
		aClass22_468 = null;
		aClass20_33 = null;
		aClass22_469 = null;
		anIntArray173 = null;
		aClass22_467 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IJ)V")
	public static void method1116(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method1117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class4_Sub19 local6 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray273.length) {
			return local6.anIntArray273[arg0];
		} else {
			return -1;
		}
	}
}
