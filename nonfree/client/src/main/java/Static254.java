import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "[I")
	public static final int[] anIntArray515 = new int[13];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method4296() {
		@Pc(5) Class313 local5 = Static305.aClass313_35;
		synchronized (Static305.aClass313_35) {
			Static305.aClass313_35.method7398();
		}
		local5 = Static153.aClass313_21;
		synchronized (Static153.aClass313_21) {
			Static153.aClass313_21.method7398();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method4297(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(18) int local18 = Static296.method3874(arg1, arg0);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0 != arg1.charAt(local33); local33++) {
			}
			local23[local25++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg1.substring(local27);
		return local23;
	}
}
