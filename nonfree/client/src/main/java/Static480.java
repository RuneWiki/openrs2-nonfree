import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!rca", name = "Cb", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!rca", name = "Lb", descriptor = "I")
	public static int anInt8253 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)V")
	public static void method6929(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) Class2_Sub22 local13 = Static284.method8371(arg1, arg0);
		if (local13 != null) {
			local13.method8599();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z")
	public static boolean method6932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(IIZ)Z")
	public static boolean method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static296.method4637(arg1, arg0) | Static391.method5863(arg0, arg1)) & Static305.method4707(arg1, arg0);
	}
}
