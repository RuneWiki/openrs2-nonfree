import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "J")
	public static volatile long aLong231 = 0L;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString50 = "";

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_33 = new Class313(8);

	@OriginalMember(owner = "client!mm", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "Lclient!g;")
	public static Class101 aClass101_1 = null;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	public static void method4805(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1 local5 = Static528.aClass17_40.method735(); local5 != null; local5 = Static528.aClass17_40.method740()) {
			if ((long) arg0 == (local5.aLong392 >> 48 & 0xFFFFL)) {
				local5.method7525();
			}
		}
	}
}
