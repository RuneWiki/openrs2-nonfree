import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_125 = new Class254(36, -1);

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_126 = new Class254(4, -2);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)Z")
	public static boolean method5841() {
		try {
			return Static277.method4598();
		} catch (@Pc(14) IOException local14) {
			Static439.method6698();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static180.aClass254_74 == null ? -1 : Static180.aClass254_74.method6299()) + "," + (Static467.aClass254_148 == null ? -1 : Static467.aClass254_148.method6299()) + "," + (Static555.aClass254_173 == null ? -1 : Static555.aClass254_173.method6299()) + " - " + Static462.anInt8534 + "," + (Static191.anInt4147 + Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0]) + "," + (Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] + Static247.anInt5049) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static462.anInt8534 && local79 < 50; local79++) {
				local77 = local77 + Static345.aClass6_Sub26_Sub2_1.aByteArray65[local79] + ",";
			}
			Static5.method211(local19, local77);
			Static366.method5845(false);
			return true;
		}
	}
}
