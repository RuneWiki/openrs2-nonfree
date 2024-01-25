import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_36 = new Class276();

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public static int anInt5443 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method4610(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static231.anInt5230 = -1;
		Static331.anInt6610 = 1;
		Static192.method3818(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg1, 6);
		local8.method8631();
		local8.anInt10489 = arg0;
	}
}
