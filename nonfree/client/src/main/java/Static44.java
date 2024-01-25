import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!pe;")
	public static Class254 aClass254_17;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Lclient!aj;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_4 = new Class183();

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I")
	public static int method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > arg2) {
			return arg1;
		} else if (arg0 < arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class302 local13 = local7.aClass302_1; local13 != null; local13 = local13.aClass302_2) {
			@Pc(17) Class2_Sub2 local17 = local13.aClass2_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort120 == arg1 && local17.aShort122 == arg2) {
				Static499.method7533(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
	public static int method1171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
