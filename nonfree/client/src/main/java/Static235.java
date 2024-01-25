import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "Lclient!wp;")
	public static Class376 aClass376_17;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "[Lclient!mk;")
	public static Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
	public static int[] anIntArray309 = new int[1];

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Lclient!kh;")
	public static final Class180 aClass180_4 = new Class180();

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)I")
	public static int method4528() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = ts.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local17.length; local26++) {
			@Pc(32) Field local32 = local17[local26];
			if (fe.class.isAssignableFrom(local32.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Lclient!wl;")
	public static Class206 method4529() {
		try {
			return (Class206) Class.forName("Class206_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class206_Sub1();
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	public static void method4530() {
		for (@Pc(6) Class3_Sub24 local6 = (Class3_Sub24) Static493.aClass307_47.method7421(); local6 != null; local6 = (Class3_Sub24) Static493.aClass307_47.method7428()) {
			Static3.method8622(local6.anInt4636);
		}
	}
}
