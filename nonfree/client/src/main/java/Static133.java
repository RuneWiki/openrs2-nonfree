import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public static int anInt2549 = -1;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
	public static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZI)V")
	public static void method2180(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(14) Class6_Sub9 local14 = Static560.method8089(Static391.aClass126_1, Static561.aClass208_86);
			local14.aClass6_Sub40_Sub2_1.method8561(arg1);
			Static263.method4681(local14);
		} else {
			Static244.method4200(Static393.aClass240_10, arg1, -1);
		}
	}
}
