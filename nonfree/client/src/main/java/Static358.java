import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
	public static long aLong177;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!qd;")
	public static Class190 aClass190_8;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_195 = new Class92(51, 7);

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public static int anInt5917 = 0;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int anInt5918 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method4720(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}
}
