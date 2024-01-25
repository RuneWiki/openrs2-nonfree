import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
	public static final int[] anIntArray427 = new int[1000];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method4426() {
		@Pc(1) Class198 local1 = Static218.aClass198_41;
		synchronized (Static218.aClass198_41) {
			Static218.aClass198_41.method5230();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([[II)V")
	public static void method4428(@OriginalArg(0) int[][] arg0) {
		Static196.anIntArrayArray37 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILclient!rj;ILclient!tj;II)Lclient!l;")
	public static Class57 method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class174 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static256.aClass210_1.anInt6580 = arg4.anInt5595;
		Static256.aClass210_1.anInt6583 = arg6;
		Static256.aClass210_1.anInt6578 = arg0;
		Static256.aClass210_1.anInt6581 = arg1;
		Static256.aClass210_1.anInt6579 = arg5;
		Static256.aClass210_1.aBoolean439 = arg2 != null;
		Static256.aClass210_1.anInt6575 = arg3;
		return (Class57) Static196.aClass214_1.method5650(Static256.aClass210_1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	public static int method4430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method4431() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("maxMemory");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Long local30 = (Long) local20.invoke(local24, (Object[]) null);
					Static26.anInt699 = (int) (local30 / 1048576L) + 1;
				} catch (@Pc(40) Throwable local40) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
