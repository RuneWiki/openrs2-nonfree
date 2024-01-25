import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public static int anInt10817 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!dt;Z)V")
	public static void method8917(@OriginalArg(0) Class3_Sub4 arg0) {
		if (arg0.aByteArray90.length - arg0.anInt9739 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method7954();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray90.length - arg0.anInt9739 < 2) {
			return;
		}
		@Pc(41) int local41 = arg0.method7951();
		if (arg0.aByteArray90.length - arg0.anInt9739 < local41 * 6) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < local41; local64++) {
			@Pc(70) int local70 = arg0.method7951();
			@Pc(74) int local74 = arg0.method7895();
			if (Static484.anIntArray417.length > local70 && Static373.aBooleanArray21[local70] && (Static357.aClass328_1.method7384(local70).aChar6 != '1' || local74 >= -1 && local74 <= 1)) {
				Static484.anIntArray417[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!pja;II)V")
	public static void method8918(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub37 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass3_Sub4_Sub1_2.method7909(arg2);
		arg1.aClass3_Sub4_Sub1_2.method7920(arg3);
		arg1.aClass3_Sub4_Sub1_2.method7941(arg0);
	}
}
