import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "[Lclient!au;")
	public static Class16[] aClass16Array3;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public static int anInt4659 = -1;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_245 = new Class123(47, 8);

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "F")
	public static float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public static int anInt4661 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	public static int method3929(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ae;)Lclient!g;")
	public static Class7_Sub2 method3931(@OriginalArg(1) Class6_Sub1 arg0) {
		return new Class7_Sub2(arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6428(), arg0.method6435(), arg0.method6435(), arg0.method6433());
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)Lclient!dh;")
	public static Class15 method3934() {
		try {
			return new Class15_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class15_Sub2();
			}
		}
	}
}
