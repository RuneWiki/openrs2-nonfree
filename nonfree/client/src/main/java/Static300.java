import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!m", name = "K", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "I")
	public static int anInt4872 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!pq;Lclient!cr;)V")
	public static void method4183(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Class57 arg1) {
		Static193.aClass251_63 = arg0;
		Static426.aClass57_6 = arg1;
		Static109.aString117 = "";
		if (Static70.aString18.startsWith("win")) {
			Static109.aString117 = Static109.aString117 + "windows/";
		} else if (Static70.aString18.startsWith("linux")) {
			Static109.aString117 = Static109.aString117 + "linux/";
		} else if (Static70.aString18.startsWith("mac")) {
			Static109.aString117 = Static109.aString117 + "macos/";
		}
		if (Static426.aClass57_6.aBoolean75) {
			Static109.aString117 = Static109.aString117 + "msjava/";
		} else if (Static70.aString15.startsWith("amd64") || Static70.aString15.startsWith("x86_64")) {
			Static109.aString117 = Static109.aString117 + "x86_64/";
		} else if (Static70.aString15.startsWith("i386") || Static70.aString15.startsWith("i486") || Static70.aString15.startsWith("i586") || Static70.aString15.startsWith("x86")) {
			Static109.aString117 = Static109.aString117 + "x86/";
		} else if (Static70.aString15.startsWith("ppc")) {
			Static109.aString117 = Static109.aString117 + "ppc/";
		} else {
			Static109.aString117 = Static109.aString117 + "universal/";
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)Z")
	public static boolean method4186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Z")
	public static boolean method4189() {
		try {
			return Static302.method4230();
		} catch (@Pc(14) IOException local14) {
			Static253.method3573();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(79) String local79 = "T2 - " + (Static244.aClass40_99 == null ? -1 : Static244.aClass40_99.method683()) + "," + (Static142.aClass40_65 == null ? -1 : Static142.aClass40_65.method683()) + "," + (Static163.aClass40_71 == null ? -1 : Static163.aClass40_71.method683()) + " - " + Static567.anInt9502 + "," + (Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray661[0] + Static218.anInt3718) + "," + (Static426.aClass29_Sub2_Sub1_Sub2_2.anIntArray660[0] + Static167.anInt3048) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static567.anInt9502 && local81 < 50; local81++) {
				local79 = local79 + Static420.aClass6_Sub14_Sub2_2.aByteArray88[local81] + ",";
			}
			Static169.method2641(local79, local19);
			Static155.method2280(false);
			return true;
		}
	}
}
