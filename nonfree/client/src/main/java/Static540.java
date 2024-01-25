import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "Lclient!pp;")
	public static Class282 aClass282_4;

	@OriginalMember(owner = "client!sf", name = "Fb", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!sf", name = "Yb", descriptor = "I")
	public static int anInt7334;

	@OriginalMember(owner = "client!sf", name = "td", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream3;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "(B)V")
	public static void method6275() {
		@Pc(7) Class123 local7 = null;
		try {
			local7 = Static353.method5289("2");
			@Pc(20) Class3_Sub17 local20 = new Class3_Sub17(Static580.anInt9189 * 6 + 3);
			local20.method4849(1);
			local20.method4876(Static580.anInt9189);
			for (@Pc(30) int local30 = 0; local30 < Static79.anIntArray121.length; local30++) {
				if (Static440.aBooleanArray22[local30]) {
					local20.method4876(local30);
					local20.method4854(Static79.anIntArray121[local30]);
				}
			}
			local7.method2763(0, local20.aByteArray59, local20.lb);
		} catch (@Pc(70) Exception local70) {
		}
		try {
			if (local7 != null) {
				local7.method2764();
			}
		} catch (@Pc(77) Exception local77) {
		}
		Static491.aLong294 = Static131.method2268();
		Static538.aBoolean660 = false;
	}
}
