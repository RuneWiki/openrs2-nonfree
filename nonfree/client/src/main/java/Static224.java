import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_69 = new Class73(88, -2);

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "Lclient!ns;")
	public static final Class231 aClass231_5 = new Class231();

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public static int anInt5037 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class168 local13 = local7.aClass168_3; local13 != null; local13 = local13.aClass168_2) {
			@Pc(17) Class9_Sub4_Sub2 local17 = local13.aClass9_Sub4_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort115 == arg1 && local17.aShort114 == arg2) {
				Static179.method3382(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4124(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
