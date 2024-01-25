import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject26;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Lclient!ae;")
	public static Class8 aClass8_135;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	public static int anInt9757 = -1;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method8243(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static679.method1563(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)Lclient!ah;")
	public static Class13 method8246() {
		try {
			return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class13_Sub2();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III)B")
	public static byte method8249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z")
	public static boolean method8250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(22) Class308 local22 = Static411.aClass88_3.method2024(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local22.method7300(arg1);
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(III)Z")
	public static boolean method8251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
