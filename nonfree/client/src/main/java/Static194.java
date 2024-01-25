import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!rk;")
	public static Class180 aClass180_21;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt1874 = 64;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public static void method1512() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Long local22 = (Long) local12.invoke(local16, (Object[]) null);
					anInt1874 = (int) (local22 / 1048576L) + 1;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)V")
	public static void method1513(@OriginalArg(0) int arg0) {
		for (@Pc(3) Class7 local3 = Static247.aClass10_41.method157(); local3 != null; local3 = Static247.aClass10_41.method155()) {
			if ((long) arg0 == (local3.aLong232 >> 48 & 0xFFFFL)) {
				local3.method5648();
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public static void method1515(@OriginalArg(1) int arg0) {
		Static41.anInt1072 = 1000 / arg0;
	}
}
