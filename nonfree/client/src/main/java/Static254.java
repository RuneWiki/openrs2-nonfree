import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_120 = new Class131(4, 2);

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "[Lclient!an;")
	public static Class12[] aClass12Array1 = new Class12[50];

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ip;I)V")
	public static void method3736(@OriginalArg(0) Class39_Sub4 arg0) {
		arg0.aClass26_1 = null;
		@Pc(12) int local12 = arg0.aClass39_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass39_Sub7Array1[local14].aBoolean325 = false;
		}
		@Pc(28) Class188[] local28 = Class127.aClass188Array1;
		synchronized (Class127.aClass188Array1) {
			if (local12 < Class127.aClass188Array1.length && Static393.anIntArray565[local12] < 200) {
				Class127.aClass188Array1[local12].method4538(arg0);
				@Pc(51) int local51 = Static393.anIntArray565[local12]++;
			}
		}
	}
}
