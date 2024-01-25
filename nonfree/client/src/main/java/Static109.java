import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_25 = new Class186(91, 7);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1805(@OriginalArg(1) String arg0) {
		Static84.method1521(arg0, 0, "", 0, "");
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method1806() {
		if (Static275.anInt4710 > 0) {
			Static44.method825();
		} else {
			Static419.aClass30_4 = Static103.aClass30_1;
			Static103.aClass30_1 = null;
			Static260.method4007(40);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLjava/lang/String;)I")
	public static int method1807(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1808(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = Static358.method5047(arg1, arg0);
		@Pc(17) String[] local17 = new String[local12 + 1];
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12; local23++) {
			@Pc(27) int local27;
			for (local27 = local21; arg0 != arg1.charAt(local27); local27++) {
			}
			local17[local19++] = arg1.substring(local21, local27);
			local21 = local27 + 1;
		}
		local17[local12] = arg1.substring(local21);
		return local17;
	}
}
