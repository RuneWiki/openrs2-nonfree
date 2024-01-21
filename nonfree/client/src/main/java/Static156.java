import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public static int anInt3584;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public static int anInt3580 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!v;")
	public static final Class91 aClass91_17 = new Class91();

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2072 = Static118.method2249("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2073 = Static118.method2249("3D)2Softwarebibliothek gestartet");

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2074 = Static118.method2249("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public static int anInt3582 = 0;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2075 = aClass65_2074;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2076 = Static118.method2249("::clientdrop");

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!sd;B)V")
	public static void method2721(@OriginalArg(0) Class60 arg0) {
		Static19.aClass60_3 = arg0;
		Static132.anInt3289 = Static19.aClass60_3.method2342(16);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
	public static boolean method2723() {
		try {
			return Static21.method397();
		} catch (@Pc(15) IOException local15) {
			Static16.method304();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(61) String local61 = "T2 - " + Static192.anInt4177 + "," + Static150.anInt3510 + "," + Static21.anInt645 + " - " + Static62.anInt1604 + "," + (Static205.anInt4337 + Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]) + "," + (Static58.anInt1543 + Static201.aClass6_Sub4_Sub1_3.anIntArray455[0]) + " - ";
			for (@Pc(63) int local63 = 0; local63 < Static62.anInt1604 && local63 < 50; local63++) {
				local61 = local61 + Static1.aClass1_Sub14_Sub1_43.aByteArray29[local63] + ",";
			}
			Static107.method1977(local20, local61);
			Static137.method2586();
			return true;
		}
	}
}
