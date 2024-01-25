import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
	public static int anInt6180;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	public static int anInt6183;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "Lclient!po;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	public static int anInt6184;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
	public static int anInt6185 = 0;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	public static int anInt6186 = 0;

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
	public static int anInt6187 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILjava/lang/String;)I")
	public static int method5335(@OriginalArg(2) String arg0) {
		return Static137.method4967(16, arg0);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method5336() {
		if (aClass125_2 != null) {
			aClass125_2.method5311();
		}
		if (Static205.aClass125_1 != null) {
			Static205.aClass125_1.method5311();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	public static void method5338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) float local14 = (float) Static150.anInt2636 / (float) Static150.anInt2639;
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = arg3;
		if (local14 < 1.0F) {
			local18 = (int) (local14 * (float) arg1);
		} else {
			local16 = (int) ((float) arg3 / local14);
		}
		@Pc(45) int local45 = arg2 - (arg1 - local16) / 2;
		@Pc(54) int local54 = arg0 - (arg3 - local18) / 2;
		Static22.anInt428 = local45 * Static150.anInt2639 / local16;
		Static282.anInt3502 = -1;
		Static24.anInt439 = Static150.anInt2636 - local54 * Static150.anInt2636 / local18;
		Static288.anInt5766 = -1;
		Static173.method3116();
	}
}
