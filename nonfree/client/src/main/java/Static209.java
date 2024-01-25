import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!um;")
	public static Class4_Sub43 aClass4_Sub43_2;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!vj;")
	public static Class58 aClass58_27;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt4333 = -1;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt4334 = 0;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString48 = null;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wq;")
	public static RuntimeException_Sub1 method3881(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString66 = local12.aString66 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
	public static void method3882(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(14) Class2_Sub7 local14 = (Class2_Sub7) Static283.aClass32_10.method850(); local14 != null; local14 = (Class2_Sub7) Static283.aClass32_10.method846()) {
			if (Static199.anInt4137 >= local14.anInt5777) {
				local14.method5419();
			} else {
				Static194.method3668((local14.anInt5776 << 7) + 64, arg0 >> 1, local14.anInt5774 * 2, arg1 >> 1, (local14.anInt5775 << 7) + 64);
				Static282.aClass51_4.method4233(local14.anInt5778 | 0xFF000000, arg3 + Static185.anIntArray328[1], local14.aString61, 0, Static185.anIntArray328[0] + arg2);
			}
		}
	}
}
