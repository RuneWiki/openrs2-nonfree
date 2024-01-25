import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "I")
	public static int anInt3372;

	@OriginalMember(owner = "client!gda", name = "t", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_33 = new Class77(34, -1);

	@OriginalMember(owner = "client!gda", name = "F", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gda", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BIII)V")
	public static void method3047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 << 3;
		@Pc(19) int local19 = arg0 << 3;
		Static500.aFloat186 = local15;
		if (Static242.anInt4993 == 2) {
			Static507.anInt9125 = 0;
			Static519.anInt9341 = local19;
			Static248.anInt5104 = local15;
		}
		Static49.aFloat10 = local19;
		Static184.method3617();
		Static497.aBoolean640 = true;
	}
}
