import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int anInt362;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Z")
	public static boolean aBoolean26 = true;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method332(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static399.method6107(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = 0; local28 < local10; local28++) {
			@Pc(32) int local32;
			for (local32 = local19; arg1.charAt(local32) != arg0; local32++) {
			}
			local15[local17++] = arg1.substring(local19, local32);
			local19 = local32 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZ)Z")
	public static boolean method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
