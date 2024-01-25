import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	public static int anInt4601;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public static int anInt4602;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_108 = new Class25(9, 8);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method3680() {
		Static164.method2403(Static349.aClass208_81);
		Static389.aClass2_Sub17_Sub1_2.method6172(0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZI)I")
	public static int method3681(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub12 local8 = Static92.method1397(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray212.length) {
			return local8.anIntArray212[arg0];
		} else {
			return -1;
		}
	}
}
