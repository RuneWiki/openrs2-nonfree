import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!pfa;")
	public static final Class253 aClass253_11 = new Class253(512);

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public static final int anInt3569 = 1400;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	public static boolean method2946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2948(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}
}
