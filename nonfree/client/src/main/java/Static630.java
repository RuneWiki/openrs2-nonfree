import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Z")
	public static boolean aBoolean720 = true;

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "S")
	public static short aShort121 = 256;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLclient!kh;)Ljava/lang/String;")
	public static String method8308(@OriginalArg(1) Class208 arg0) {
		if (Static82.method1754(arg0).method40() == 0) {
			return null;
		} else if (arg0.aString68 == null || arg0.aString68.trim().length() == 0) {
			return Static605.aBoolean708 ? "Hidden-use" : null;
		} else {
			return arg0.aString68;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
	public static void method8311() {
		@Pc(12) Class3_Sub44 local12 = Static275.method5689(Static305.aClass376_76, Static540.aClass282_4);
		local12.aClass3_Sub17_Sub2_3.method4849(0);
		Static616.method8089(local12);
	}
}
