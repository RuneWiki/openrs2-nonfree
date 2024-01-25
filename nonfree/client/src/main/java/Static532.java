import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
	private static final short[] aShortArray131 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!se", name = "k", descriptor = "[S")
	private static final short[] aShortArray132 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!se", name = "o", descriptor = "[S")
	private static final short[] aShortArray133 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray133, aShortArray132, aShortArray131 };

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7397(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static417.method6237(Static138.method2061(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
