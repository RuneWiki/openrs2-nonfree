import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public static int anInt10024;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!hfa;")
	public static final Class141 aClass141_9 = new Class141();

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Lclient!fga;")
	public static final Class105 aClass105_7 = new Class105();

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	public static int anInt10026 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public static void method8337() {
		if (Static191.anInterface17Array1 == null) {
			return;
		}
		@Pc(13) Interface17[] local13 = Static191.anInterface17Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Interface17 local21 = local13[local15];
			local21.method9114();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method8339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static400.method5985(arg1, arg0) || Static603.method8473(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static226.method5385(arg0, arg1);
		}
	}
}
