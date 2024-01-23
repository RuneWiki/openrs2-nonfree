import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt5286;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!ek;")
	public static Class42 aClass42_91;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Loading fonts - ";

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	public static int anInt5291 = 3;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLclient!ek;)Lclient!od;")
	public static Class2_Sub22 method4273(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(8) byte[] local8 = arg1.method1259(arg0);
		return local8 == null ? null : new Class2_Sub22(local8);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static void method4275() {
		Static120.aClass157_24.method4027();
		Static159.aClass157_30.method4027();
	}
}
