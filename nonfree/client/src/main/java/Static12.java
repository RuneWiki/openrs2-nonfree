import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "Lclient!ra;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "Lclient!wl;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_2 = new Class77(15, 3);

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method349() {
		Static122.anInt2825 = -1;
		Static445.anInt8114 = 1;
		if (Static258.aString53 == null) {
			Static269.method4556(35);
		} else {
			@Pc(29) Class12_Sub8 local29 = new Class12_Sub8(Static204.method3820(Static47.method886(Static258.aString53)));
			@Pc(33) long local33 = local29.method5191();
			Static148.aLong180 = local29.method5191();
			Static331.method5281(true, "", Static104.method2138(local33));
		}
	}
}
