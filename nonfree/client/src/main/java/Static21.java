import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!bd;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_1 = new Class103(16);

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Connecting to update server";

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_2 = new Class103(200);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIII)V")
	public static void method361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(11, arg1);
		local13.method4790();
		local13.anInt5696 = arg2;
		local13.anInt5687 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method363() {
		Static139.aClass52Array8 = null;
		Static35.aClass52Array3 = null;
		Static36.aClass94_9 = null;
		Static44.aClass52Array4 = null;
		Static350.aClass52Array16 = null;
		Static245.aClass52Array13 = null;
		Static264.aClass52Array14 = null;
		Static313.aClass52Array15 = null;
		Static341.aClass94_32 = null;
		Static102.aClass52Array6 = null;
		Static86.aClass52Array5 = null;
		Static14.aClass52Array2 = null;
		Static130.aClass52Array7 = null;
		Static149.aClass94_19 = null;
		Static160.aClass52Array10 = null;
		Static294.aClass52_30 = null;
		Static143.aClass52Array11 = null;
	}
}
