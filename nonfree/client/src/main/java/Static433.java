import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	public static int anInt7353;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Lclient!f;")
	public static Class22 aClass22_20;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
	public static int[] anIntArray558;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!cp;")
	public static final Class3_Sub9 aClass3_Sub9_1 = new Class3_Sub9(0, 0);

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public static int anInt7360 = 10;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5745(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(3, arg0);
		local13.method1570();
		local13.aString16 = arg1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z")
	public static boolean method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
