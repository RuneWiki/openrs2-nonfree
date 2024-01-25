import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static233 {

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt4273;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_67 = new Class100(38, 15);

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public static int anInt4277 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
	public static void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static220.method3432(arg0)) {
			Static583.method8333(arg1, Static559.aClass230ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public static boolean method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
