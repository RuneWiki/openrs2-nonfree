import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_18 = new Class221(10, 2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_19 = new Class221(5, 7);

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public static int anInt9040 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)[Lclient!sha;")
	public static Class328[] method7904() {
		if (Static9.aClass328Array1 == null) {
			@Pc(14) Class328[] local14 = Static200.method3727(Static651.aClass122_38);
			@Pc(18) Class328[] local18 = new Class328[local14.length];
			@Pc(20) int local20 = 0;
			@Pc(25) int local25 = Static687.aClass6_Sub44_33.aClass7_Sub10_1.method2536();
			@Pc(115) int local115;
			@Pc(121) Class328 local121;
			label69: for (@Pc(27) int local27 = 0; local27 < local14.length; local27++) {
				@Pc(35) Class328 local35 = local14[local27];
				if ((local35.anInt9011 <= 0 || local35.anInt9011 >= 24) && local35.anInt9013 >= 800 && local35.anInt9016 >= 600 && (local25 != 2 || local35.anInt9013 <= 800 && local35.anInt9016 <= 600) && (local25 != 1 || local35.anInt9013 <= 1024 && local35.anInt9016 <= 768)) {
					for (local115 = 0; local115 < local20; local115++) {
						local121 = local18[local115];
						if (local35.anInt9013 == local121.anInt9013 && local35.anInt9016 == local121.anInt9016) {
							if (local121.anInt9011 < local35.anInt9011) {
								local18[local115] = local35;
							}
							continue label69;
						}
					}
					local18[local20] = local35;
					local20++;
				}
			}
			Static9.aClass328Array1 = new Class328[local20];
			Static695.method5647(local18, 0, Static9.aClass328Array1, 0, local20);
			@Pc(195) int[] local195 = new int[Static9.aClass328Array1.length];
			for (local115 = 0; local115 < Static9.aClass328Array1.length; local115++) {
				local121 = Static9.aClass328Array1[local115];
				local195[local115] = local121.anInt9013 * local121.anInt9016;
			}
			Static87.method8282(local195, Static9.aClass328Array1);
		}
		return Static9.aClass328Array1;
	}
}
