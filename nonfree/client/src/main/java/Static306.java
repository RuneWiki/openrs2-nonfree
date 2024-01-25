import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	public static int anInt6356 = 0;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_5 = new Class350("", 16);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static423.method6817(arg1, arg0) : Static373.method6255(arg1, arg0);
		return local25 | Static588.method8686(arg1, arg0) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)Z")
	public static boolean method5419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
