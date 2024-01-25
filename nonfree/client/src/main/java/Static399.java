import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "[Lclient!ms;")
	public static Class232[] aClass232Array1;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
	public static int anInt6858;

	@OriginalMember(owner = "client!oba", name = "t", descriptor = "I")
	public static int anInt6860;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "Lclient!eha;")
	public static final Class97 aClass97_12 = new Class97();

	@OriginalMember(owner = "client!oba", name = "v", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	public static void method5958() {
		@Pc(5) Class19[] local5 = Class2_Sub24.aClass19Array1;
		synchronized (Class2_Sub24.aClass19Array1) {
			for (@Pc(14) int local14 = 0; local14 < Class2_Sub24.aClass19Array1.length; local14++) {
				Class2_Sub24.aClass19Array1[local14] = new Class19();
				Static161.anIntArray215[local14] = 0;
			}
		}
	}
}
