import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Z")
	public static boolean aBoolean556;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt7968 = 0;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_6 = new Class146(4, 1);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
	public static void method6931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static324.anInt8117 != 0) {
			if (arg0 < 0) {
				for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
					Static514.anIntArray550[local18] = arg1;
				}
			} else {
				Static514.anIntArray550[arg0] = arg1;
			}
		}
		Static594.aClass3_Sub7_Sub2_3.method2474(arg1, arg0);
	}
}
