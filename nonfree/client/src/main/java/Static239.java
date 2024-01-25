import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method3590() {
		@Pc(7) int local7 = Static475.anInt8165;
		@Pc(13) int[] local13 = Static75.anIntArray82;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class2_Sub1_Sub1_Sub3_Sub1 local23 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local13[local15]];
			if (local23 != null) {
				Static550.method7819(local23.method4326(), local23);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
	public static boolean method3592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static213.method3108(arg0, arg1) | (arg0 & 0x60000) != 0 || Static307.method4407(arg0, arg1) || Static202.method3040(arg1, arg0);
	}
}
