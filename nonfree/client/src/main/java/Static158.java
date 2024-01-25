import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	public static int anInt3437;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString33 = null;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IB)V")
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static3.anIntArray16[local3] = Static3.anIntArray16[local3 - 1];
			Static135.anIntArray265[local3] = Static135.anIntArray265[local3 - 1];
			Static277.aStringArray59[local3] = Static277.aStringArray59[local3 - 1];
			Static328.aStringArray62[local3] = Static328.aStringArray62[local3 - 1];
			Static271.aStringArray57[local3] = Static271.aStringArray57[local3 - 1];
			Static180.aStringArray37[local3] = Static180.aStringArray37[local3 - 1];
			Static82.anIntArray202[local3] = Static82.anIntArray202[local3 - 1];
		}
		Static3.anIntArray16[0] = arg4;
		Static277.aStringArray59[0] = arg5;
		Static135.anIntArray265[0] = arg6;
		Static328.aStringArray62[0] = arg3;
		Static271.aStringArray57[0] = arg1;
		Static82.anIntArray202[0] = arg0;
		Static89.anInt2233 = Static314.anInt6116;
		Static180.aStringArray37[0] = arg2;
		Static312.anInt4575++;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
	public static void method3157() {
		@Pc(5) Class87 local5 = Static332.aClass87_60;
		synchronized (Static332.aClass87_60) {
			Static332.aClass87_60.method2477();
		}
		local5 = Static124.aClass87_24;
		synchronized (Static124.aClass87_24) {
			Static124.aClass87_24.method2477();
		}
		local5 = Static77.aClass87_16;
		synchronized (Static77.aClass87_16) {
			Static77.aClass87_16.method2477();
		}
	}
}
