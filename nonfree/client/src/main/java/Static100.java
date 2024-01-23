import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_5;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
	public static int anInt2282;

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "Lclient!th;")
	public static Class168 aClass168_78;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
	public static int[] anIntArray223 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "[I")
	public static int[] anIntArray224 = new int[1024];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;CB)I")
	public static int method1681(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			if (arg0.charAt(local18) == arg1) {
				local16++;
			}
		}
		return local16;
	}
}
