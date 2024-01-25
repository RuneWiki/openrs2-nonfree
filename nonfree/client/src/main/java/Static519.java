import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "Lclient!kga;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "Z")
	public static boolean aBoolean664 = false;

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "Lclient!el;")
	public static final Class109 aClass109_184 = new Class109(63, -2);

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "[I")
	public static final int[] anIntArray506 = new int[14];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
	public static void method7525(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static629.aFloat202 = 3.0F;
		} else if (arg0 == 50) {
			Static629.aFloat202 = 4.0F;
		} else if (arg0 == 75) {
			Static629.aFloat202 = 6.0F;
		} else if (arg0 == 100) {
			Static629.aFloat202 = 8.0F;
		} else if (arg0 == 200) {
			Static629.aFloat202 = 16.0F;
		}
		Static652.anInt10539 = -1;
		Static652.anInt10539 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(B)[Lclient!pi;")
	public static Class277[] method7526() {
		if (Static462.aClass277Array1 == null) {
			@Pc(14) Class277[] local14 = Static513.method7490(Static294.aClass230_3);
			@Pc(18) Class277[] local18 = new Class277[local14.length];
			@Pc(20) int local20 = 0;
			@Pc(25) int local25 = Static637.aClass5_Sub20_31.aClass24_Sub27_1.method8302();
			@Pc(108) int local108;
			@Pc(114) Class277 local114;
			label69: for (@Pc(27) int local27 = 0; local27 < local14.length; local27++) {
				@Pc(35) Class277 local35 = local14[local27];
				if ((local35.anInt7754 <= 0 || local35.anInt7754 >= 24) && local35.anInt7756 >= 800 && local35.anInt7753 >= 600 && (local25 != 2 || local35.anInt7756 <= 800 && local35.anInt7753 <= 600) && (local25 != 1 || local35.anInt7756 <= 1024 && local35.anInt7753 <= 768)) {
					for (local108 = 0; local108 < local20; local108++) {
						local114 = local18[local108];
						if (local114.anInt7756 == local35.anInt7756 && local35.anInt7753 == local114.anInt7753) {
							if (local35.anInt7754 > local114.anInt7754) {
								local18[local108] = local35;
							}
							continue label69;
						}
					}
					local18[local20] = local35;
					local20++;
				}
			}
			Static462.aClass277Array1 = new Class277[local20];
			Static682.method797(local18, 0, Static462.aClass277Array1, 0, local20);
			@Pc(192) int[] local192 = new int[Static462.aClass277Array1.length];
			for (local108 = 0; local108 < Static462.aClass277Array1.length; local108++) {
				local114 = Static462.aClass277Array1[local108];
				local192[local108] = local114.anInt7756 * local114.anInt7753;
			}
			Static272.method4041(local192, Static462.aClass277Array1);
		}
		return Static462.aClass277Array1;
	}
}
