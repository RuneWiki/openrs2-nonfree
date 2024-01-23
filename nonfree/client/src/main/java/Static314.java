import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt5911;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public static int anInt5908 = 1;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "[S")
	public static short[] aShortArray93 = new short[256];

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static volatile int anInt5910 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!co;")
	public static Class1_Sub1_Sub7 method4650(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static59.aClass58_2.method1233((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static157.aClass138_47.method3346(5, arg0);
		local10 = new Class1_Sub1_Sub7();
		if (local29 != null) {
			local10.method700(new Class1_Sub14(local29));
		}
		Static59.aClass58_2.method1229((long) arg0, local10);
		return local10;
	}
}
