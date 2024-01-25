import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	public static int anInt6284;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_27 = new Class280(32);

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_90 = new Class130(21, 8);

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	public static final int anInt6285 = 1401;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	public static final int anInt6286 = 1403;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V")
	public static void method5457(@OriginalArg(1) int arg0) {
		Static605.method8439();
		@Pc(11) int local11 = Static92.aClass23_1.method1115(arg0).anInt9684;
		if (local11 == 0) {
			return;
		}
		@Pc(28) int local28 = Static373.aClass150_1.anIntArray227[arg0];
		if (local11 == 5) {
			Static583.anInt9564 = local28;
		}
		if (local11 == 6) {
			Static276.anInt4992 = local28;
		}
	}
}
