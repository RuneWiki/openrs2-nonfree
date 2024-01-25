import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public static int anInt4220;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[Lclient!uf;")
	public static Class84_Sub1[] aClass84_Sub1Array2;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_79 = new Class36(74, 7);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3199(@OriginalArg(0) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3200(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
