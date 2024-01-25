import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array12;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!mk;")
	public static final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static final int anInt4528 = 1338;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!kp;")
	public static Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_121 = new Class77(23, 8);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lclient!pi;")
	public static Class12_Sub2 method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_2;
	}
}
