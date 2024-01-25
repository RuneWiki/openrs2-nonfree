import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	public static int anInt6004;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_127 = new Class362(15, 4);

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	public static int anInt6005 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)Z")
	public static boolean method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class101 local8 = Static204.aClass139_8.method3309(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method2699(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)Z")
	public static boolean method5126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
