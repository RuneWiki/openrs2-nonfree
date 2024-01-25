import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
	public static boolean aBoolean549;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	public static int anInt6168;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_193 = new Class157(23, 4);

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_42 = new Class180();

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString65 = "";

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "[I")
	public static final int[] anIntArray474 = new int[3];

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIB)V")
	public static void method5193(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub21 local13 = Static238.method4329(arg0, arg1);
		if (local13 != null) {
			local13.method5723();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
	public static void method5195() {
		Static258.aClass107_37.method3011(5);
	}
}
