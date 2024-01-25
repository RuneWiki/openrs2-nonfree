import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public static int anInt9890;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
	public static int[] anIntArray640;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public static int anInt9891;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_143 = new Class376(74, 6);

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!im;")
	public static final Class181 aClass181_164 = new Class181("game4", 3);

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray73 = new String[200];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ha;II)Lclient!nf;")
	public static Class102 method8424(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub54 local17 = (Class3_Sub54) Static623.aClass62_45.method1682((long) arg1);
		if (local17 != null) {
			@Pc(24) Class3_Sub5_Sub1 local24 = local17.aClass133_Sub1_1.method2970();
			local17.aBoolean752 = true;
			if (local24 != null) {
				return local24.method1143(arg0);
			}
		}
		return null;
	}
}
