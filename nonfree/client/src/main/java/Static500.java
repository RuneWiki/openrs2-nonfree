import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
	public static int anInt8795;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_60 = new Class295();

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "Z")
	public static boolean aBoolean661 = false;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method7680(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}
}
