import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public static int anInt8743;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_69 = new Class211();

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Z")
	public static boolean aBoolean650 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!e;Lclient!jo;)V")
	public static void method7303(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class168 arg1) {
		Static251.aClass168_63 = arg1;
		Static523.anInterface2_14 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
	public static void method7304(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(6, arg0);
		local8.method3828();
	}
}
