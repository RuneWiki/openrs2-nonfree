import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!et;")
	public static Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public static int anInt182;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!db;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Z")
	public static boolean aBoolean26 = true;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!via;")
	public static final Class386 aClass386_3 = new Class386("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!bi;BII)V")
	public static void method199(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray183[0];
		@Pc(15) int local15 = arg1.anIntArray182[0];
		if (local10 < 0 || local10 >= Static426.anInt6942 || local15 < 0 || Static280.anInt6752 <= local15 || (arg0 < 0 || Static426.anInt6942 <= arg0 || arg2 < 0 || arg2 >= Static280.anInt6752)) {
			return;
		}
		@Pc(86) int local86 = Static322.method4462(0, arg0, true, local15, 0, Static626.aClass226Array1[arg1.aByte133], arg2, Static127.anIntArray158, -4, Static405.anIntArray468, local10, 0, arg1.method2046(), 0);
		if (local86 >= 1 && local86 <= 3) {
			for (@Pc(107) int local107 = 0; local107 < local86 - 1; local107++) {
				arg1.method733(Static127.anIntArray158[local107], (byte) 2, Static405.anIntArray468[local107]);
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)V")
	public static void method200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static39.anInt535 != 0) {
			if (arg1 >= 0) {
				Static160.anIntArray200[arg1] = arg0;
			} else {
				for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
					Static160.anIntArray200[local32] = arg0;
				}
			}
		}
		Static442.aClass2_Sub23_Sub5_3.method7711(arg1, arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!tw;I)V")
	public static void method205(@OriginalArg(1) Class2_Sub20_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static559.anInt8813 = 0;
		Static699.aBoolean920 = false;
		Static139.method2015(arg0);
		Static709.method9456(arg0);
		if (Static699.aBoolean920) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt9723) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt9723 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method206(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static483.method6910(arg1, (String) null, false, arg3, arg2, arg0);
	}
}
