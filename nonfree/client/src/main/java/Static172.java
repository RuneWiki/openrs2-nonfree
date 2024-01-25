import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public static int anInt2847;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray56;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_39 = new Class142("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!qi;")
	public static final Class208 aClass208_18 = new Class208(32);

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
	public static final int[] anIntArray224 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2281(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static91.method1066(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static316.anInt5221; local33++) {
			@Pc(39) String local39 = Static167.aStringArray18[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static91.method1066(local39);
			if (local39 != null && local39.equals(local20)) {
				Static316.anInt5221--;
				for (@Pc(63) int local63 = local33; local63 < Static316.anInt5221; local63++) {
					Static167.aStringArray18[local63] = Static167.aStringArray18[local63 + 1];
					Static273.aStringArray35[local63] = Static273.aStringArray35[local63 + 1];
					Static100.aStringArray9[local63] = Static100.aStringArray9[local63 + 1];
					Static332.aStringArray44[local63] = Static332.aStringArray44[local63 + 1];
					Static185.aBooleanArray71[local63] = Static185.aBooleanArray71[local63 + 1];
				}
				Static75.anInt1071 = Static163.anInt5780;
				Static178.method2589(Static224.aClass242_61);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg0));
				Static426.aClass1_Sub19_Sub2_2.method2935(arg0);
				return;
			}
		}
	}
}
