import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "Lclient!fg;")
	public static Class4_Sub9_Sub2 aClass4_Sub9_Sub2_1;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
	public static int anInt1256 = -1;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Loaded fonts";

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
	public static int anInt1260 = 7759444;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString36 = "purple:";

	@OriginalMember(owner = "client!ek", name = "V", descriptor = "[S")
	public static short[] aShortArray11 = new short[256];

	@OriginalMember(owner = "client!ek", name = "W", descriptor = "[I")
	public static int[] anIntArray139 = new int[32];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIZ)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class4_Sub2_Sub21 local13 = Static39.method4121(arg2, 8);
		local13.method4360();
		local13.anInt5495 = arg1;
		local13.anInt5492 = arg0;
		local13.anInt5502 = arg3;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
	public static void method1039() {
		anIntArray138 = null;
		aString35 = null;
		anIntArray139 = null;
		aShortArray11 = null;
		aClass4_Sub9_Sub2_1 = null;
		aString36 = null;
	}
}
