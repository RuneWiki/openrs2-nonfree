import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!jga", name = "q", descriptor = "J")
	public static long aLong285;

	@OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
	public static int anInt10133;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
	public static void method7879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static328.method5066(arg1, arg0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!qe;)V")
	public static void method7882(@OriginalArg(1) Class21_Sub9 arg0) {
		arg0.aClass21_Sub1_Sub1_Sub1_1 = null;
		if (Static94.anInt2373 < 20) {
			Static88.aClass158_7.method3720(arg0);
			Static94.anInt2373++;
		}
	}
}
