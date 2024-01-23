import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!ci;")
	public static Class26 aClass26_55 = new Class26();

	@OriginalMember(owner = "client!um", name = "g", descriptor = "[Lclient!d;")
	public static Class32[] aClass32Array1 = new Class32[14];

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	public static int anInt5740 = 0;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "J")
	public static long aLong224 = 0L;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	public static int anInt5741 = 0;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString410 = "Continue";

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	public static int anInt5742 = 127;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2 method4388() {
		@Pc(9) byte[] local9 = Static34.aByteArrayArray5[0];
		@Pc(17) int local17 = Static50.anIntArray22[0] * Static95.anIntArray212[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(28) int local28 = 0; local28 < local17; local28++) {
			local20[local28] = Static234.anIntArray454[local9[local28] & 0xFF];
		}
		@Pc(67) Class1_Sub3_Sub13_Sub2 local67 = new Class1_Sub3_Sub13_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], local20);
		Static20.method432();
		return local67;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!th;B)V")
	public static void method4389(@OriginalArg(0) Class168 arg0) {
		Static46.aClass168_36 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZI)V")
	public static void method4391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(6, arg0);
		local8.method4468();
		local8.anInt5852 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIZI)V")
	public static void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static229.aLong187 = 0L;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = Static217.method3458();
		if (arg0 > 0 != local6 > 0) {
			local3 = true;
		}
		if (arg0 == 3 || local6 == 3) {
			arg3 = true;
		}
		if (Static179.aString261.startsWith("mac") && arg0 > 0) {
			arg3 = true;
		}
		if (arg3 && arg0 > 0) {
			local3 = true;
		}
		Static199.method4758(local3, arg0, arg2, arg3, local6, arg1);
	}
}
