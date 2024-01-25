import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_101 = new Class22(104, 6);

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "S")
	public static short aShort19 = 1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!mu;ZII)V")
	public static void method2057(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static1.aClass155ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method2058(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static255.method3690(arg0, arg1);
		@Pc(23) String[] local23 = new String[local10 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local10] = arg0.substring(local27);
		return local23;
	}
}
