import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public static int anInt9713;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
	public static boolean aBoolean683;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static final int anInt9708 = 52;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt9717 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!gda;II)Lclient!kaa;")
	public static Class196 method8267(@OriginalArg(1) Class126 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3086(0, arg1);
		return local9 == null ? null : new Class196(local9);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Lclient!eb;")
	public static Class36 method8268() {
		try {
			return new Class36_Sub1();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class36) Class.forName("iea").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class36_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V")
	public static void method8269(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg0, 4);
		local16.method7444();
	}
}
