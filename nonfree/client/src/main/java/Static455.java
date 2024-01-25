import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "[Lclient!dh;")
	public static final Class64[] aClass64Array1 = new Class64[4];

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZII)Z")
	public static boolean method7005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static284.method6790(arg0, arg1) | (arg0 & 0x70000) != 0 || Static312.method5229(arg1, arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	public static void method7006(@OriginalArg(0) int arg0) {
		Static128.aLong70 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
	public static boolean method7007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static362.method5754(arg1, arg0) | (arg1 & 0x800) != 0 || Static216.method3668(arg1, arg0);
	}
}
