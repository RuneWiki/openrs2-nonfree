import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
	public static int anInt9843;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
	public static int anInt9841 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBZ)V")
	public static void method8096(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class3_Sub17 local10 = Static77.method3511(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray99.length; local15++) {
				local10.anIntArray99[local15] = -1;
				local10.anIntArray98[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!et;Z)Ljava/lang/String;")
	public static String method8097(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		if (arg0.aString26 == null || arg0.aString26.length() == 0) {
			return arg0.aString27 == null || arg0.aString27.length() <= 0 ? arg0.aString28 : arg0.aString28 + Static287.aClass176_32.method4986(Static380.anInt7247) + arg0.aString27;
		} else if (arg0.aString27 == null || arg0.aString27.length() <= 0) {
			return arg0.aString28 + Static287.aClass176_32.method4986(Static380.anInt7247) + arg0.aString26;
		} else {
			return arg0.aString28 + Static287.aClass176_32.method4986(Static380.anInt7247) + arg0.aString27 + Static287.aClass176_32.method4986(Static380.anInt7247) + arg0.aString26;
		}
	}
}
