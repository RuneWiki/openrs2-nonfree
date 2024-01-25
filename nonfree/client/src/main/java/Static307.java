import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "Lclient!pb;")
	public static Class275 aClass275_4;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Lclient!jb;")
	public static Class171 aClass171_79 = null;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[5];

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
	public static int anInt5275 = 0;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZIII)V")
	public static void method4534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static317.anInt5305 = arg3;
		Static600.anInt9807 = arg0;
		Static253.anInt4467 = arg1;
		Static596.anInt7098 = arg2;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
	public static int method4535() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = rd.class.getDeclaredFields();
		for (@Pc(29) int local29 = 0; local29 < local17.length; local29++) {
			@Pc(35) Field local35 = local17[local29];
			if (me.class.isAssignableFrom(local35.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I")
	public static int method4538(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static594.method7829(arg0);
	}
}
