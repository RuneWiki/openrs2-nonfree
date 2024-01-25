import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!jj;")
	public static Interface11 anInterface11_1;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!vi;")
	public static Class357 aClass357_1;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!oh;")
	public static Class237 aClass237_72;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_71 = new Class71(34, -1);

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public static int anInt5723 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z")
	public static boolean method4662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!lga;)V")
	public static void method4664(@OriginalArg(0) Class194 arg0) {
		Static40.aClass194_2 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method4666() {
		for (@Pc(6) Class8_Sub5_Sub7 local6 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local6 != null; local6 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
			if (Static16.method765(local6.anInt3779)) {
				Static505.method7312(local6);
			}
		}
	}
}
