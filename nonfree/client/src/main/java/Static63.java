import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_24 = new Class57(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static final int anInt1280 = 0;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!o;")
	public static final Class171 aClass171_1 = new Class171("WTWIP", 3);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1103(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static318.method1784(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}
