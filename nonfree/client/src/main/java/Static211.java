import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray37;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	public static int[] anIntArray728;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
	public static int[] anIntArray729;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
	public static int anInt10621 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZ)I")
	public static int method8988(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static106.anInt2134;
		if (local5 == 0) {
			return arg0 ? 0 : Static426.anInt6744;
		} else if (local5 == 1) {
			return Static426.anInt6744;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method8989(@OriginalArg(0) String arg0) {
		return Static259.method3757(16, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method8992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(18) String local18 = arg2[arg0];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg1 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg0; local33 < local29; local33++) {
				@Pc(39) String local39 = arg2[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(64) int local64 = arg0; local64 < local29; local64++) {
				@Pc(70) String local70 = arg2[local64];
				if (local70 == null) {
					local62.append("null");
				} else {
					local62.append(local70);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
	public static boolean method8993(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
