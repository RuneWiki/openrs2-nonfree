import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!wa;")
	public static Class23 aClass23_68;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1353 = Static161.method2452("Loaded sprites");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1352 = aClass20_1353;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "S")
	public static short aShort44 = 256;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_34 = new Class8(64);

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "J")
	public static long aLong218 = 0L;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1354 = Static161.method2452("Konfig geladen)3");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBI)I")
	public static int method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(11) int local11 = arg0 / arg1;
		@Pc(17) int local17 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(35) int local35 = Static78.method1242(local7, local11);
		@Pc(42) int local42 = Static78.method1242(local7, local11 + 1);
		@Pc(49) int local49 = Static78.method1242(local7 + 1, local11);
		@Pc(58) int local58 = Static78.method1242(local7 + 1, local11 + 1);
		@Pc(65) int local65 = Static49.method883(local17, local42, local35, arg1);
		@Pc(72) int local72 = Static49.method883(local17, local58, local49, arg1);
		return Static49.method883(local23, local72, local65, arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Object;ILclient!bi;)V")
	public static void method2766(@OriginalArg(0) Object arg0, @OriginalArg(2) Class12 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static210.method739(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ce;I)Lclient!sh;")
	public static Class54_Sub3 method2768(@OriginalArg(0) Class5_Sub6 arg0) {
		return new Class54_Sub3(arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3072(), arg0.method3062());
	}
}
