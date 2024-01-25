import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "[Lclient!nr;")
	public static Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "Lclient!jm;")
	public static Class174 aClass174_3;

	@OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
	public static int anInt5408;

	@OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
	public static int anInt5413;

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
	public static int anInt5405 = 0;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V")
	public static void method4615() {
		for (@Pc(11) int local11 = 0; local11 < Static176.aClass278ArrayArray1.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static176.aClass278ArrayArray1[local11].length; local15++) {
				Static176.aClass278ArrayArray1[local11][local15] = Static433.aClass278_1;
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4616(@OriginalArg(0) String arg0) {
		return Static13.method437(lh.class, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4617(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = Static366.method5367(arg0.charAt(local17)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
