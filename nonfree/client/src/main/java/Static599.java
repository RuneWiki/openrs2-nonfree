import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "Lclient!rf;")
	public static Class311 aClass311_1;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	public static int anInt9215;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "Lclient!bt;")
	public static Class34 aClass34_117;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_202 = new Class151(88, 10);

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)Z")
	public static boolean method7866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static425.method5897(arg0, arg1) : Static678.method8983(arg0, arg1);
		return Static564.method7467(arg1, arg0) | (arg1 & 0x10000) != 0 | local25;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)I")
	public static int method7867() {
		@Pc(12) int local12 = Static6.aClass246_1.method5071();
		if (local12 < Static432.aClass246Array1.length - 1) {
			Static6.aClass246_1 = Static432.aClass246Array1[local12 + 1];
		}
		return 100;
	}
}
