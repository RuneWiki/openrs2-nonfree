import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!of;")
	public static Class150 aClass150_1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_3 = new Class116();

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
	public static final int[] anIntArray45 = new int[50];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method747(@OriginalArg(1) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method748() {
		Static15.aClass4_Sub39_2 = new Class4_Sub39(Static283.aClass159_303.method4311(Static180.anInt3835), "", Static273.anInt5438, 1011, 0L, 0, 0);
	}
}
