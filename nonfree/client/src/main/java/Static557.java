import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!pa;")
	public static Class112 aClass112_4;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_97 = new Class344(74, 3);

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt10159 = -50;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
	public static void method7894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg1, 11);
		local13.method2303();
		local13.anInt2865 = arg2;
		local13.anInt2872 = arg0;
	}
}
