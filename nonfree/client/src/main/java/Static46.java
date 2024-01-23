import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static int anInt938 = 0;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!vh;")
	public static Class187 aClass187_25 = new Class187(4);

	@OriginalMember(owner = "client!de", name = "i", descriptor = "J")
	public static long aLong38 = 0L;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt943 = 0;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
	public static int[] anIntArray57 = new int[100];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
	public static void method892(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub7 local12 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local12 != null) {
			for (@Pc(23) int local23 = 0; local23 < local12.anIntArray23.length; local23++) {
				local12.anIntArray23[local23] = -1;
				local12.anIntArray22[local23] = 0;
			}
		}
	}
}
