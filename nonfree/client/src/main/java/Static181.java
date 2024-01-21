import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array9;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1215 = Static158.method3034("Sorry invited players only)3");

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1211 = aClass60_1215;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1212 = Static158.method3034("This computers address has been blocked");

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1213 = Static158.method3034("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1214 = aClass60_1213;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1216 = Static158.method3034(" (X");

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1217 = aClass60_1212;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
	public static final int[] anIntArray475 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ue", name = "ib", descriptor = "Lclient!ra;")
	public static Class72 aClass72_13 = null;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_66 = new Class89(5);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg0) {
			Static22.method549(arg5, arg0, arg1, arg4, arg3, arg2);
		} else if (Static64.anInt1962 <= arg1 - arg0 && Static123.anInt3379 >= arg0 + arg1 && Static36.anInt1076 <= arg2 - arg6 && arg6 + arg2 <= Static117.anInt951) {
			Static117.method745(arg0, arg5, arg2, arg3, arg1, arg6, arg4);
		} else {
			Static71.method3260(arg4, arg6, arg0, arg1, arg5, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)Lclient!ra;")
	public static Class72 method3381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class72 local7 = Static173.method3201(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass72Array1 == null || arg0 >= local7.aClass72Array1.length) {
			return null;
		} else {
			return local7.aClass72Array1[arg0];
		}
	}
}
