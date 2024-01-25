import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!cea;")
	public static Class48 aClass48_4;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
	public static final int[] anIntArray205 = new int[14];

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public static int anInt4533 = 104;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)I")
	public static int method4083(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
	public static boolean method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) boolean local20 = (arg1 & 0x37) == 0 ? Static39.method9318(arg1, arg0) : Static293.method6715(arg1, arg0);
		return Static340.method5708(arg0, arg1) | (arg0 & 0x10000) != 0 | local20;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)Z")
	public static boolean method4088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static29.method500(arg1, arg0) || Static189.method3618(arg1, arg0);
	}
}
