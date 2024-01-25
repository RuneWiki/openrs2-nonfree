import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_62 = new Class102(3000000, 200);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt9850 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method8439() {
		for (@Pc(6) Class3_Sub22 local6 = (Class3_Sub22) Static511.aClass223_55.method5874(); local6 != null; local6 = (Class3_Sub22) Static511.aClass223_55.method5870()) {
			if (local6.aBoolean205) {
				local6.method2846();
			}
		}
		for (@Pc(37) Class3_Sub22 local37 = (Class3_Sub22) Static456.aClass223_48.method5874(); local37 != null; local37 = (Class3_Sub22) Static456.aClass223_48.method5870()) {
			if (local37.aBoolean205) {
				local37.method2846();
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
