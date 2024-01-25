import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
	public static int anInt6235;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!ns;")
	public static final Class228 aClass228_12 = new Class228();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZBLclient!pp;I)V")
	public static void method5333(@OriginalArg(0) int arg0, @OriginalArg(3) Class4_Sub1_Sub1_Sub2 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray521[0];
		@Pc(15) int local15 = arg1.anIntArray522[0];
		if (local10 < 0 || local10 >= Static473.anInt8075 || local15 < 0 || Static165.anInt6749 <= local15 || (arg0 < 0 || arg0 >= Static473.anInt8075 || arg2 < 0 || arg2 >= Static165.anInt6749)) {
			return;
		}
		@Pc(73) int local73 = Static333.method5196(true, local15, Static579.aClass189Array4[arg1.aByte108], -4, 0, 0, local10, arg2, arg0, arg1.method5892(), Static524.anIntArray647, 0, 0, Static295.anIntArray408);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(85) int local85 = 0; local85 < local73 - 1; local85++) {
				arg1.method5917((byte) 2, Static295.anIntArray408[local85], Static524.anIntArray647[local85]);
			}
		}
	}
}
