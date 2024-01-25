import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	public static int anInt6370;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLclient!dt;)Lclient!bi;")
	public static Class33_Sub1 method5356(@OriginalArg(1) Class3_Sub4 arg0) {
		return new Class33_Sub1(arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7945(), arg0.method7954());
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
	public static void method5357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static300.anInt5091 <= arg0 - arg2 && arg0 + arg2 <= Static629.anInt10412 && Static617.anInt6260 <= arg3 - arg2 && arg3 + arg2 <= Static229.anInt4089) {
			Static482.method6365(arg3, arg2, arg1, arg0);
		} else {
			Static554.method7315(arg3, arg2, arg1, arg0);
		}
	}
}
