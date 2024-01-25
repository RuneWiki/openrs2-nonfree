import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_39 = new Class117("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
	public static int anInt1926 = 0;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
	public static int method1587() {
		if (Static29.aFrame1 == null) {
			return Static320.aBoolean408 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)I")
	public static int method1588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V")
	public static void method1589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(12, arg0);
		local8.method3858();
		local8.anInt4390 = arg1;
	}
}
