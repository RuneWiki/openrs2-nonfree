import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
	public static int anInt6224;

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
	public static int anInt6228 = 13156520;

	@OriginalMember(owner = "client!nj", name = "P", descriptor = "Z")
	public static boolean aBoolean446 = true;

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
	public static int anInt6234 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	public static void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class5_Sub5_Sub21 local11 = Static101.method1629(13, arg0);
		local11.method8958();
		local11.anInt10530 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5525(@OriginalArg(1) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(44) int local44 = arg0.indexOf(" ", "directlogin ".length());
			if (local44 >= 0) {
				@Pc(52) int local52 = arg0.length();
				arg0 = arg0.substring(0, local44) + " ";
				for (@Pc(68) int local68 = local44 + 1; local68 < local52; local68++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}
}
