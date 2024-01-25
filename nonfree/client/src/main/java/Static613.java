import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "J")
	public static long aLong266;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = "";

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z")
	public static boolean method8396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z")
	public static boolean method8400(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!sba;)Lclient!sba;")
	public static Class302 method8401(@OriginalArg(1) Class302 arg0) {
		if (arg0.anInt8857 != -1) {
			return Static299.method5103(arg0.anInt8857);
		}
		@Pc(25) int local25 = arg0.anInt8867 >>> 16;
		@Pc(30) Class76 local30 = new Class76(Static214.aClass380_15);
		for (@Pc(35) Class6_Sub25 local35 = (Class6_Sub25) local30.method2561(); local35 != null; local35 = (Class6_Sub25) local30.method2559()) {
			if (local35.anInt5034 == local25) {
				return Static299.method5103((int) local35.aLong278);
			}
		}
		return null;
	}
}
