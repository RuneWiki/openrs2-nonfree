import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!au", name = "o", descriptor = "Lclient!oo;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "I")
	public static int anInt402;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "F")
	public static float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "Lclient!st;")
	public static final Class314 aClass314_8 = new Class314(29, 3);

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[I")
	public static final int[] anIntArray33 = new int[2048];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([BBZ)V")
	public static void method373(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static479.aClass3_Sub9_7 == null) {
			Static479.aClass3_Sub9_7 = new Class3_Sub9(20000);
		}
		Static479.aClass3_Sub9_7.method5625(arg0, arg0.length, 0);
		if (!arg1) {
			return;
		}
		Static557.method7911(Static479.aClass3_Sub9_7.aByteArray51);
		Static456.aClass354_Sub1Array2 = new Class354_Sub1[Static645.anInt10266];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static597.anInt9711; local33 <= Static527.anInt8945; local33++) {
			@Pc(41) Class354_Sub1 local41 = Static536.method7772(local33);
			if (local41 != null) {
				Static456.aClass354_Sub1Array2[local31++] = local41;
			}
		}
		Static322.aBoolean452 = false;
		Static490.aLong218 = Static191.method3071();
		Static479.aClass3_Sub9_7 = null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Z")
	public static boolean method374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
