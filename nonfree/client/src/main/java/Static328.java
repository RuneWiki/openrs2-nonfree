import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public static int anInt5676 = -60;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "J")
	public static long aLong190 = 0L;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Lclient!hh;")
	public static Class14 method4424() {
		try {
			return (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
	public static int method4425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static411.anIntArray514[arg0 & 0x3] : 256;
	}
}
