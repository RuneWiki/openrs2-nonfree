import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public static int anInt9304;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!dh;")
	public static Class65 aClass65_5;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public static int anInt9305 = -1;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
	public static final int[] anIntArray691 = new int[50];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;I)V")
	public static void method7707(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static19.method421(-1, arg3, true, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	public static int method7708() {
		return 19;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
	public static String[] method7710(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(18) int local18 = Static565.method7528(arg0, arg1);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1.charAt(local33) != arg0; local33++) {
			}
			local23[local25++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg1.substring(local27);
		return local23;
	}
}
