import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[Lclient!ta;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_112 = new Class56(17, 2);

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean226 = true;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "J")
	public static long aLong85 = -1L;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	public static int anInt3059 = -1;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)Lclient!e;")
	public static Class8_Sub5 method2325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub5_2;
	}
}
