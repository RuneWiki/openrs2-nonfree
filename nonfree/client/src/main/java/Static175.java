import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
	public static int anInt3631;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Lclient!ir;")
	public static Class100 aClass100_74;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_28 = new Class198(30);

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString136 = "slide:";

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
	public static int anInt3635 = 0;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	public static void method2871() {
		@Pc(1) Class198 local1 = Static62.aClass198_17;
		synchronized (Static62.aClass198_17) {
			Static62.aClass198_17.method5243(5);
		}
		local1 = Static190.aClass198_34;
		synchronized (Static190.aClass198_34) {
			Static190.aClass198_34.method5243(5);
		}
		@Pc(38) Class214 local38 = Static196.aClass214_1;
		synchronized (Static196.aClass214_1) {
			Static196.aClass214_1.method5656();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	public static boolean method2872() {
		return Static113.anInt6411 != 0 || Static350.anInt6800 >= 2;
	}
}
