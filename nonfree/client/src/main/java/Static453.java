import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
	public static int[] anIntArray725;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Lclient!vq;")
	public static final Class305 aClass305_1 = new Class305();

	@OriginalMember(owner = "client!su", name = "d", descriptor = "I")
	public static int anInt7743 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Lclient!ck;")
	public static Class49_Sub1 method6441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_Sub1_3;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(III)Z")
	public static boolean method6442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
