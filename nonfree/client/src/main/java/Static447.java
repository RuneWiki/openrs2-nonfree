import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!mv;")
	public static Class229 aClass229_105;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "[I")
	public static int[] anIntArray484 = new int[2];

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_13 = new Class222("", 15);

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;Z)V")
	public static void method5846(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		Static208.aHashtable1.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!du;Lclient!du;)V")
	public static void method5847(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_285 != null) {
			arg0.method7657();
		}
		arg0.aClass2_285 = arg1.aClass2_285;
		arg0.aClass2_286 = arg1;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}
}
