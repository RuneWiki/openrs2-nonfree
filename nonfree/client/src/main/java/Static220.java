import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	public static int anInt3792;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
	public static int anInt3794 = 0;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ha;II)Lclient!rc;")
	public static Class298 method3394(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class195 local14 = Static626.method8672(arg0, true, arg1);
		return local14 == null ? null : local14.aClass298_6;
	}
}
