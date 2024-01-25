import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_4 = new Class221(6, 3);

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
	public static void method2978() {
		if (!Static468.method7068()) {
			return;
		}
		if (Static177.aStringArray14 == null) {
			Static558.method7884();
		}
		Static687.aBoolean733 = true;
		Static360.anInt6079 = 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIIII)I")
	public static int method2979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(22) int local22 = local7 < 8 ? arg3 : arg1;
		@Pc(44) int local44 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg2) : arg1;
		return ((local7 & 0x1) == 0 ? local22 : -local22) + ((local7 & 0x2) == 0 ? local44 : -local44);
	}
}
