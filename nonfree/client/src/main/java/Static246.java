import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pn", name = "L", descriptor = "Lclient!rk;")
	public static Class180 aClass180_63;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString305 = "Hidden";

	@OriginalMember(owner = "client!pn", name = "T", descriptor = "Ljava/lang/String;")
	public static final String aString306 = "flash1:";

	@OriginalMember(owner = "client!pn", name = "Y", descriptor = "I")
	public static int anInt4880 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	public static void method4258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class7_Sub9 local15 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg0);
		if (local15 == null) {
			local15 = new Class7_Sub9();
			Static175.aClass10_32.method161((long) arg0, local15);
		}
		if (local15.anIntArray262.length <= arg1) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			for (@Pc(48) int local48 = 0; local48 < local15.anIntArray262.length; local48++) {
				local41[local48] = local15.anIntArray262[local48];
				local46[local48] = local15.anIntArray263[local48];
			}
			for (@Pc(77) int local77 = local15.anIntArray262.length; local77 < arg1; local77++) {
				local41[local77] = -1;
				local46[local77] = 0;
			}
			local15.anIntArray262 = local41;
			local15.anIntArray263 = local46;
		}
		local15.anIntArray262[arg1] = arg2;
		local15.anIntArray263[arg1] = arg3;
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)V")
	public static void method4259() {
		@Pc(5) Class103 local5 = Static193.aClass103_36;
		synchronized (Static193.aClass103_36) {
			Static193.aClass103_36.method2684();
		}
	}
}
