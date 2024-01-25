import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Lclient!nn;")
	public static Class259 aClass259_2;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	public static int anInt9047;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "[Lclient!dr;")
	public static Class79[] aClass79Array4;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_93 = new Class286(29, 3);

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(II)Z")
	public static boolean method7558(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7559(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			local16 = Static181.method2791(arg0.charAt(local18)) + (local16 << 5) - local16;
		}
		return local16;
	}
}
