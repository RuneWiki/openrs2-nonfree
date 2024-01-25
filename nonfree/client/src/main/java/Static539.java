import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(ZI)V")
	public static void method7630(@OriginalArg(1) int arg0) {
		Static475.anInt8512 = 2;
		Static99.anInt2642 = arg0;
		if (Static193.aString58 == null) {
			Static590.method8155(35);
		} else {
			@Pc(25) Class8_Sub8 local25 = new Class8_Sub8(Static609.method7964(Static190.method6073(Static193.aString58)));
			@Pc(29) long local29 = local25.method8549();
			Static34.aLong209 = local25.method8549();
			Static252.method4534(Static418.method6564(local29), true, "");
		}
	}
}
