import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public static int anInt2872;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	public static int anInt2886;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!hq;")
	public static final Class101 aClass101_8 = new Class101("", 10);

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
	public static boolean aBoolean214 = true;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2880 = 0;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_66 = new Class205(93, 6);

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I")
	public static int method2688(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub1 local19 = Static72.method4067(arg0, false);
		if (local19 == null) {
			return Static345.aClass180_2.method3969(arg0).anInt4544;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray14.length; local31++) {
			if (local19.anIntArray14[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static345.aClass180_2.method3969(arg0).anInt4544 - local19.anIntArray14.length;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!vc;Z)V")
	public static void method2700(@OriginalArg(0) Class63 arg0) {
		if (Static269.aBoolean349) {
			Static20.method4716(arg0);
		} else {
			Static55.method921(arg0);
		}
	}
}
