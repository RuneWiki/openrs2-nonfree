import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_14 = new Class262();

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_20 = new Class264(64);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2550(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
