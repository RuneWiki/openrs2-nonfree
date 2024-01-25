import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public static int anInt8866 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method7233() {
		@Pc(7) String local7 = "www";
		if (Static465.aClass145_8 == Static296.aClass145_5) {
			local7 = "www-wtrc";
		} else if (Static296.aClass145_5 == Static308.aClass145_6) {
			local7 = "www-wtqa";
		} else if (Static296.aClass145_5 == Static379.aClass145_7) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static450.aString79 != null) {
			local33 = "/p=" + Static450.aString79;
		}
		return "http://" + local7 + "." + Static438.aClass92_4.aString18 + ".com/l=" + Static154.anInt3181 + "/a=" + Static566.anInt9919 + local33 + "/";
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V")
	public static void method7234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg1, 13);
		local8.method7133();
		local8.anInt8736 = arg0;
	}
}
