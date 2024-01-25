import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!uaa;B)V")
	public static void method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class345 arg2) {
		@Pc(13) Class1 local13 = arg2.method8063(Static208.aClass65_7);
		if (local13 == null) {
			return;
		}
		Static208.aClass65_7.KA(arg0, arg1, arg2.anInt9649 + arg0, arg2.anInt9606 + arg1);
		if (Static595.anInt9783 < 3) {
			Static4.aClass50_1.method6004((float) arg2.anInt9649 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt9606 / 2.0F, ((int) -Static157.aFloat83 & 0x3FFF) << 2, local13, arg0, arg1);
		} else {
			Static208.aClass65_7.A(-16777216, local13, arg0, arg1);
		}
	}
}
