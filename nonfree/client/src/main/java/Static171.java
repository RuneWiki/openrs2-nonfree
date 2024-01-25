import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_16 = new Class391(3000000, 200);

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIBI)V")
	public static void method2491(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static220.aByteArrayArrayArray14 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2492(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(22) String local22 = arg1[arg0];
			return local22 == null ? "null" : local22.toString();
		} else {
			@Pc(37) int local37 = arg2 + arg0;
			@Pc(39) int local39 = 0;
			for (@Pc(41) int local41 = arg0; local41 < local37; local41++) {
				@Pc(47) String local47 = arg1[local41];
				if (local47 == null) {
					local39 += 4;
				} else {
					local39 += local47.length();
				}
			}
			@Pc(72) StringBuffer local72 = new StringBuffer(local39);
			for (@Pc(81) int local81 = arg0; local81 < local37; local81++) {
				@Pc(89) String local89 = arg1[local81];
				if (local89 == null) {
					local72.append("null");
				} else {
					local72.append(local89);
				}
			}
			return local72.toString();
		}
	}
}
