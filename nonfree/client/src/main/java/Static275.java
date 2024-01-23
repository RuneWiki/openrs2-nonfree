import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!hl;")
	public static Class68 aClass68_7;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "[I")
	public static int[] anIntArray440 = new int[2048];

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public static int anInt4968 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIIII)V")
	public static void method4269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class66 local8 = Static296.method4522(arg3, arg2);
		if (local8 != null && local8.anObjectArray23 != null) {
			@Pc(18) Class1_Sub10 local18 = new Class1_Sub10();
			local18.aClass66_10 = local8;
			local18.anObjectArray1 = local8.anObjectArray23;
			Static194.method3152(local18);
		}
		Static41.anInt850 = arg5;
		Static196.anInt3698 = arg4;
		Static312.anInt5732 = arg2;
		Static277.anInt4994 = arg1;
		Static104.anInt2090 = arg3;
		Static102.anInt2065 = arg0;
		Static133.aBoolean168 = true;
		Static103.method1865(local8);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 method4270() {
		@Pc(13) int local13 = Static160.anIntArray267[0] * Static235.anIntArray468[0];
		@Pc(17) byte[] local17 = Static69.aByteArrayArray15[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static83.anIntArray144[local17[local22] & 0xFF];
		}
		@Pc(69) Class1_Sub2_Sub1_Sub2 local69 = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], local20);
		Static117.method2101();
		return local69;
	}
}
