import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
	public static int anInt1350;

	@OriginalMember(owner = "client!cha", name = "s", descriptor = "I")
	public static int anInt1357;

	@OriginalMember(owner = "client!cha", name = "x", descriptor = "I")
	public static int anInt1361;

	@OriginalMember(owner = "client!cha", name = "w", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_24 = new Class180(52, 3);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BII)Z")
	public static boolean method1376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static259.method4252(arg1, arg0) || Static81.method1578(arg1, arg0);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!jp;I)V")
	public static void method1379(@OriginalArg(0) Class3_Sub25 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static252.anInt4527; local10++) {
			@Pc(15) int local15 = arg0.method8604();
			@Pc(19) int local19 = arg0.method8593();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static33.aClass98_Sub1Array4[local15] != null) {
				Static33.aClass98_Sub1Array4[local15].anInt5505 = local19;
			}
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V")
	public static void method1380() {
		if (Static98.aClass127_3 != null) {
			Static98.aClass127_3.method7564();
		}
		if (Static433.aClass127_9 != null) {
			Static433.aClass127_9.method7564();
		}
	}
}
