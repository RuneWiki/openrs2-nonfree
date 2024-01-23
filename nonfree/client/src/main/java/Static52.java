import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!de", name = "X", descriptor = "I")
	public static int anInt1108;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "Lclient!ak;")
	public static Class7 aClass7_47;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!gi;")
	public static Class64 aClass64_6 = new Class64(128);

	@OriginalMember(owner = "client!de", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString28 = "M";

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	public static void method904(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class1 local9 = Static244.aClass22_18.method640(); local9 != null; local9 = Static244.aClass22_18.method637()) {
			if ((local9.aLong202 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method4534();
			}
		}
	}
}
