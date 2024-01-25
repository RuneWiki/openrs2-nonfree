import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_304 = new Class194(62, 3);

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
	public static int anInt10059 = 0;

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "Z")
	public static boolean aBoolean762 = false;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILclient!ha;ILjava/lang/String;III)V")
	public static void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static324.aClass103_33 == null || Static448.aClass103_31 == null) {
			if (Static419.aClass343_200.method8138(Static450.anInt7670) && Static419.aClass343_200.method8138(Static24.anInt344)) {
				Static324.aClass103_33 = arg2.method6106(Static656.method6331(Static419.aClass343_200, Static450.anInt7670, 0), true);
				@Pc(44) Class251 local44 = Static656.method6331(Static419.aClass343_200, Static24.anInt344, 0);
				Static448.aClass103_31 = arg2.method6106(local44, true);
				local44.method6332();
				Static74.aClass103_5 = arg2.method6106(local44, true);
			} else {
				arg2.aa(arg5, arg1, arg4, 20, Static493.anInt8371 | 255 - Static541.anInt9076 << 24, 1);
			}
		}
		if (Static324.aClass103_33 != null && Static448.aClass103_31 != null) {
			@Pc(74) int local74 = (arg4 - Static448.aClass103_31.method7445() * 2) / Static324.aClass103_33.method7445();
			for (@Pc(76) int local76 = 0; local76 < local74; local76++) {
				Static324.aClass103_33.method7462(Static448.aClass103_31.method7445() + arg5 + Static324.aClass103_33.method7445() * local76, arg1);
			}
			Static448.aClass103_31.method7462(arg5, arg1);
			Static74.aClass103_5.method7462(arg5 + arg4 - Static74.aClass103_5.method7445(), arg1);
		}
		Static374.aClass63_9.method7751(arg5 + 3, -1, arg3, Static514.anInt8691 | 0xFF000000, arg1 + 14);
		arg2.aa(arg5, arg1 + 20, arg4, arg0 - 20, -Static541.anInt9076 + 255 << 24 | Static493.anInt8371, 1);
	}
}
