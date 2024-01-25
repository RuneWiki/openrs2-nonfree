import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "[Lclient!ya;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method1874() {
		for (@Pc(7) int local7 = 0; local7 < Static57.aClass226ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static57.aClass226ArrayArray1[local7].length; local11++) {
				Static57.aClass226ArrayArray1[local7][local11] = Static433.aClass226_2;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBIII)Lclient!mt;")
	public static Class141 method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg1 * 67481L ^ (long) arg5 * 97549L ^ (long) arg3 * 475427L ^ (long) arg4 * 986053L ^ (long) arg0 * 32147369L;
		@Pc(39) Class141 local39 = (Class141) Static390.aClass188_54.method4158(local33);
		if (local39 == null) {
			local39 = Static28.aClass75_3.method6009(arg1, arg5, arg3, arg4, arg0, arg2);
			Static390.aClass188_54.method4155(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z")
	public static boolean method1876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static108.method1798(arg1, arg0) || Static181.method2421(arg0, arg1);
	}
}
