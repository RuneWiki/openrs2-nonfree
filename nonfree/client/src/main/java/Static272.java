import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lclient!ok;")
	public static Class176 aClass176_3;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "Lclient!of;")
	public static final Class174 aClass174_131 = new Class174("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method3770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
	public static void method3777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class23_Sub7 local6 = (Class23_Sub7) Static125.aClass194_3.method4577(); local6 != null; local6 = (Class23_Sub7) Static125.aClass194_3.method4580()) {
			if (Static172.anInt3107 >= local6.anInt6966) {
				local6.method5853();
			} else {
				Static31.method578(arg0 >> 1, local6.anInt6973, (local6.anInt6970 << 7) + 64, local6.anInt6968 * 2, (local6.anInt6977 << 7) + 64, arg3 >> 1);
				Static266.aClass18_2.method5169(local6.aString64, local6.anInt6974 | 0xFF000000, arg1 + Static90.anIntArray75[1], 0, Static90.anIntArray75[0] + arg2);
			}
		}
	}
}
