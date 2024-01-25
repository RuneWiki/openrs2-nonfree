import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	public static int anInt2797 = -1;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[2][][];

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(III)I")
	public static int method2355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static372.anIntArray484[arg0 & 0x3] : Static329.anIntArray398[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method2357() {
		for (@Pc(10) Class3_Sub4 local10 = (Class3_Sub4) Static101.aClass84_5.method2306(); local10 != null; local10 = (Class3_Sub4) Static101.aClass84_5.method2306()) {
			Static394.method5157(local10);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static323.aClass50_Sub1_1.method2861(Static177.anInt2973)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static317.anInt5523;
			local29 = Static317.anInt5523;
		}
		Static53.method911();
		for (@Pc(40) int local40 = local29; local40 <= local31; local40++) {
			Static53.method909();
			Static53.method902(local40);
			Static53.method896(local40);
		}
		Static53.method907();
		Static53.method904();
	}
}
