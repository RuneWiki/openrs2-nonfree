import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!an;")
	public static final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!nk;")
	public static final Class174 aClass174_4 = new Class174("WTI", 5);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public static void method2941(@OriginalArg(1) int arg0) {
		Static44.anInt680 = -1;
		Static39.anInt620 = arg0;
		Static44.anInt680 = -1;
		Static250.method3591();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZ)I")
	public static int method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 << 13 ^ local15;
		@Pc(35) int local35 = local21 * (local21 * local21 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}
}
