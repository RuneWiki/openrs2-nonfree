import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public static int anInt9645;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
	public static int anInt9646;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "[I")
	public static final int[] anIntArray738 = new int[2];

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString101 = null;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public static void method7864() {
		Static15.aClass187_1.method3801();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public static void method7866(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1 local14 = Static353.aClass187_25.method3799(); local14 != null; local14 = Static353.aClass187_25.method3805()) {
			if ((long) arg0 == (local14.aLong301 >> 48 & 0xFFFFL)) {
				local14.method7859();
			}
		}
	}
}
