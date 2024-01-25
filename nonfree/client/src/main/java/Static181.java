import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
	public static int anInt2988;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!gda", name = "k", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_117 = new Class196(116, 6);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZB)V")
	public static void method2652(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static131.anInt2222 != -1) {
				Static46.method622(Static131.anInt2222);
			}
			for (@Pc(17) Class5_Sub4 local17 = (Class5_Sub4) Static131.aClass335_15.method7768(); local17 != null; local17 = (Class5_Sub4) Static131.aClass335_15.method7777()) {
				if (!local17.method8826()) {
					local17 = (Class5_Sub4) Static131.aClass335_15.method7768();
					if (local17 == null) {
						break;
					}
				}
				Static272.method3801(local17, false, true);
			}
			Static131.anInt2222 = -1;
			Static131.aClass335_15 = new Class335(8);
			Static535.method8699();
			Static131.anInt2222 = Static267.anInt4238;
			Static469.method6939(false);
			Static212.method3058();
			Static497.method7209(Static131.anInt2222);
		}
		Static598.aBoolean716 = true;
	}
}
