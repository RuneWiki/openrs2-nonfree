import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
	public static boolean aBoolean292;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray60 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString143 = "Loaded world list data";

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!mm;")
	public static Class115 aClass115_8 = new Class115();

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!rn;Lclient!rn;Lclient!rn;Lclient!rn;)V")
	public static void method3459(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) Class155 arg3) {
		Static277.aClass155_114 = arg0;
		Static237.aClass155_97 = arg1;
		Static157.aClass155_64 = arg3;
		Static94.aClass155_40 = arg2;
		Static96.aClass151ArrayArray1 = new Class151[Static277.aClass155_114.method4119()][];
		Static230.aBooleanArray107 = new boolean[Static277.aClass155_114.method4119()];
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method3460(@OriginalArg(1) Class155 arg0) {
		Static229.aClass155_93 = arg0;
		Static284.anInt5706 = Static229.aClass155_93.method4131(16);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public static void method3461(@OriginalArg(0) int arg0) {
		Static76.anInt1447 = arg0;
		Static7.method135(3);
		Static7.method135(4);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z")
	public static boolean method3462() {
		return Static283.aBoolean393 ? true : Static104.aBoolean155;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)Lclient!dg;")
	public static Class34 method3463() {
		try {
			return new Class34_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class34) Class.forName("Class34_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class34_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3464(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub7 local16 = Static34.method528(arg1, 3);
		local16.method971();
		local16.aString46 = arg0;
	}
}
