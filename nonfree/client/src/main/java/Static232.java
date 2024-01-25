import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!rg;")
	public static Class177 aClass177_23;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!bh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_4 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	public static final int[] anIntArray788 = new int[4];

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[S")
	public static final short[] aShortArray110 = new short[] { 14, 22, 25, 24, 32, 8, 57, 59 };

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public static int anInt6331 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5538(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static248.aClass1_Sub7_Sub1_2.method728(42);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0));
			Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!lp;")
	public static Class122 method5539(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static278.aClass140_145;
		@Pc(14) Class122 local14;
		synchronized (Static278.aClass140_145) {
			local14 = (Class122) Static278.aClass140_145.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static1.aClass165_3.method4508(Static316.method5329(arg0), Static261.method4597(arg0));
		local14 = new Class122();
		local14.anInt3815 = arg0;
		if (local34 != null) {
			local14.method3567(new Class1_Sub7(local34));
		}
		local14.method3566();
		@Pc(55) Class140 local55 = Static278.aClass140_145;
		synchronized (Static278.aClass140_145) {
			Static278.aClass140_145.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method5544() {
		Static291.aClass148_1 = new Class148(8);
		Static90.anInt1761 = 0;
		for (@Pc(21) Class15_Sub5 local21 = (Class15_Sub5) Static293.aClass175_6.method4669(); local21 != null; local21 = (Class15_Sub5) Static293.aClass175_6.method4673()) {
			local21.method2860();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	public static void method5545() {
		Static234.aClass140_122.method3824(5);
	}
}
