import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wja", name = "B", descriptor = "I")
	public static int anInt10683;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
	public static void method9188() {
		for (@Pc(10) Class8_Sub3 local10 = (Class8_Sub3) Static571.aClass98_7.method1784(); local10 != null; local10 = (Class8_Sub3) Static571.aClass98_7.method1784()) {
			Static508.method7444(local10);
		}
		@Pc(44) int local44;
		@Pc(43) int local43;
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 1) {
			local44 = 0;
			local43 = 3;
		} else {
			local43 = Static559.anInt9430;
			local44 = Static559.anInt9430;
		}
		Static81.method1255();
		for (@Pc(53) int local53 = local44; local53 <= local43; local53++) {
			Static81.method1244();
			Static81.method1251(local53);
			Static81.method1262(local53);
		}
		Static81.method1246();
		Static81.method1247();
	}

	@OriginalMember(owner = "client!wja", name = "h", descriptor = "(I)V")
	public static void method9191() {
		Static432.aClass391_39.method9276(0);
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)Z")
	public static boolean method9192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static349.method5252(arg1, arg0) | (arg0 & 0x70000) != 0 || Static62.method872(arg0, arg1);
	}

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(I)V")
	public static void method9194() {
		Static32.anInt566 = 0;
		Static213.anInt3473 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static171.anInt2921; local19++) {
			@Pc(25) int local25 = local19 * Static3.anInt23;
			for (@Pc(27) int local27 = 0; local27 < Static3.anInt23; local27++) {
				@Pc(33) int local33 = local27 + local25;
				Static376.anInterface6Array1[local33].method9031(Static324.anInt10471 * local27, Static625.anInt10198 * local19, Static324.anInt10471, Static625.anInt10198, true);
			}
		}
	}
}
