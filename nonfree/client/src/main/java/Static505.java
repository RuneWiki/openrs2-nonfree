import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_128 = new Class171(47, 10);

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "[I")
	public static int[] anIntArray429 = new int[1];

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V")
	public static void method6597() {
		Static178.method2799();
		Static532.aBoolean580 = false;
		Static499.method6547(Static204.anInt3590, Static517.anInt8133, Static532.anInt8336, Static508.anInt8006);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!dt;I)Lclient!tw;")
	public static Class21_Sub3 method6598(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) Class21 local7 = Static471.method6272(arg0);
		@Pc(11) int local11 = arg0.method7895();
		@Pc(23) int local23 = arg0.method7895();
		@Pc(27) int local27 = arg0.method7951();
		return new Class21_Sub3(local7.aClass266_12, local7.aClass131_23, local7.anInt9576, local7.anInt9573, local7.anInt9572, local7.anInt9574, local7.anInt9575, local7.anInt9570, local7.anInt9571, local11, local23, local27);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6599(@OriginalArg(1) String arg0) {
		return Static590.method7802(arg0, 10);
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(III)Z")
	public static boolean method6600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
