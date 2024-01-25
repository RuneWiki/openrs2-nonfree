import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_114 = new Class103(68, 4);

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
	public static int anInt2655 = -1;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
	public static void method2298(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static207.anInt6026 != -1) {
				Static453.method5913(Static207.anInt6026);
			}
			for (@Pc(20) Class1_Sub14 local20 = (Class1_Sub14) Static94.aClass199_54.method4392(); local20 != null; local20 = (Class1_Sub14) Static94.aClass199_54.method4393()) {
				if (!local20.method5914()) {
					local20 = (Class1_Sub14) Static94.aClass199_54.method4392();
					if (local20 == null) {
						break;
					}
				}
				Static452.method5911(false, true, local20);
			}
			Static207.anInt6026 = -1;
			Static94.aClass199_54 = new Class199(8);
			Static326.method4381();
			Static207.anInt6026 = Static443.anInt5161;
			Static336.method4513(false);
			Static65.method1072();
			Static298.method4073(Static207.anInt6026);
		}
		Static145.aBoolean233 = true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZII)V")
	public static void method2299(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub43 local10 = Static346.method4702(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray507.length; local15++) {
				local10.anIntArray507[local15] = -1;
				local10.anIntArray506[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public static boolean method2300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!kh;)I")
	public static int method2301(@OriginalArg(1) Class1_Sub28_Sub1 arg0) {
		@Pc(18) int local18 = arg0.method3084(2);
		@Pc(31) int local31;
		if (local18 == 0) {
			local31 = 0;
		} else if (local18 == 1) {
			local31 = arg0.method3084(5);
		} else if (local18 == 2) {
			local31 = arg0.method3084(8);
		} else {
			local31 = arg0.method3084(11);
		}
		return local31;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)I")
	public static int method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static21.anIntArray19[arg1 & 0x3] : Static333.anIntArray389[arg1 & 0x3];
	}
}
