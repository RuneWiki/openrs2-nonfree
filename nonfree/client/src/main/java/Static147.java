import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt3008;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
	public static int anInt3019 = 0;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "[I")
	public static final int[] anIntArray131 = new int[8];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2668(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static604.method8266(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(24) int local24;
			for (local24 = local19; arg1.charAt(local24) != arg0; local24++) {
			}
			local15[local17++] = arg1.substring(local19, local24);
			local19 = local24 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z")
	public static boolean method2673() {
		@Pc(12) Class5_Sub12 local12 = (Class5_Sub12) Static475.aClass114_56.method2805();
		if (local12 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < local12.anInt1099; local18++) {
			if (local12.aClass331Array2[local18] != null && local12.aClass331Array2[local18].anInt9108 == 0) {
				return false;
			}
			if (local12.aClass331Array1[local18] != null && local12.aClass331Array1[local18].anInt9108 == 0) {
				return false;
			}
		}
		return true;
	}
}
