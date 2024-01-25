import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "[Lclient!cq;")
	public static final Class6_Sub1_Sub5[] aClass6_Sub1_Sub5Array1 = new Class6_Sub1_Sub5[14];

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	public static final int anInt85 = 205;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
	public static int anInt86 = 0;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "S")
	public static short aShort2 = 256;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public static int anInt92 = 0;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lclient!kh;")
	public static Class55 method90() {
		try {
			return new Class55_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class55) Class.forName("Class55_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class55_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Lclient!od;")
	public static Class6_Sub24 method91() {
		if (Static36.aClass88_24 == null || Static383.aClass236_1 == null) {
			return null;
		}
		Static383.aClass236_1.method5316(Static36.aClass88_24);
		@Pc(24) Class6_Sub24 local24 = (Class6_Sub24) Static383.aClass236_1.method5317();
		if (local24 == null) {
			return null;
		} else {
			@Pc(34) Class94 local34 = Static36.aClass254_5.method5834(local24.anInt4802);
			return local34 != null && local34.aBoolean163 && local34.method2000(Static36.anInterface4_2) ? local24 : Static374.method5185();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method93(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
