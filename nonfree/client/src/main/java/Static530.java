import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_76 = new Class208(12, 1);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public static int anInt8592 = 0;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray60 = new String[100];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBII)I")
	public static int method7403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static433.anInt7858 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg0 - Static487.anInt7459;
		@Pc(28) int local28 = arg1 - Static487.anInt7453;
		for (@Pc(35) Class6_Sub45 local35 = (Class6_Sub45) Static487.aClass8_51.method149(); local35 != null; local35 = (Class6_Sub45) Static487.aClass8_51.method155()) {
			if (arg2 == local35.anInt9417) {
				@Pc(48) int local48 = local35.anInt9419;
				@Pc(51) int local51 = local35.anInt9422;
				@Pc(62) int local62 = local48 + Static487.anInt7459 << 14 | local51 + Static487.anInt7453;
				@Pc(81) int local81 = (local24 - local48) * (-local48 + local24) + (local28 - local51) * (local28 - local51);
				if (local17 < 0 || local81 < local19) {
					local17 = local62;
					local19 = local81;
				}
			}
		}
		return local17;
	}
}
