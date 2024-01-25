import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	public static int anInt1000;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array2;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	public static int anInt1001;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
	public static int anInt1006;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_6 = new Class236(27, 11);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method914(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) long local11 = (long) 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			local11 = (local11 << 5) - (local11 - (long) arg0.charAt(local13));
		}
		return local11;
	}
}
