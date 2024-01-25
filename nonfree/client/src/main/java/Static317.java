import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!q", name = "r", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_118 = new Class119(29, 6);

	@OriginalMember(owner = "client!q", name = "q", descriptor = "I")
	public static int anInt5577 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZLclient!mq;)V")
	public static void method4367(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class156 arg1) {
		@Pc(15) int local15 = arg1.anInt4877 == 0 ? arg1.anInt4853 : arg1.anInt4877;
		@Pc(29) int local29 = arg1.anInt4796 == 0 ? arg1.anInt4823 : arg1.anInt4796;
		Static262.method3816(arg0, local15, local29, arg1.anInt4850, Static178.aClass156ArrayArray2[arg1.anInt4850 >> 16]);
		if (arg1.aClass156Array2 != null) {
			Static262.method3816(arg0, local15, local29, arg1.anInt4850, arg1.aClass156Array2);
		}
		@Pc(62) Class3_Sub9 local62 = (Class3_Sub9) Static318.aClass11_42.method324((long) arg1.anInt4850);
		if (local62 != null) {
			Static88.method1666(local29, local62.anInt1804, local15, arg0);
		}
	}
}
