import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array14;

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "I")
	public static int anInt3681;

	@OriginalMember(owner = "client!lt", name = "C", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array15;

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
	public static int anInt3687;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
	public static int anInt3678 = 0;

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "[S")
	public static final short[] aShortArray81 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!lt", name = "A", descriptor = "J")
	public static long aLong118 = -1L;

	@OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
	public static int anInt3688 = 0;

	@OriginalMember(owner = "client!lt", name = "L", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
	public static int anInt3689 = 0;

	@OriginalMember(owner = "client!lt", name = "N", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!en;")
	public static RuntimeException_Sub1 method2997(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString12 = local9.aString12 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	public static void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub3_2 != null) {
			local7.aClass25_Sub3_2 = null;
		}
		if (local7.aClass25_Sub3_1 != null) {
			local7.aClass25_Sub3_1 = null;
		}
	}
}
