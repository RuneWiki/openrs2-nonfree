import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	public static int anInt4370;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "Lclient!dn;")
	public static Class56 aClass56_57;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "Lclient!dn;")
	public static Class56 aClass56_58;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	public static final int anInt4377 = 1407;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	public static int anInt4383 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lclient!us;")
	public static Class1_Sub4 method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub4 local14 = local7.aClass1_Sub4_1;
			local7.aClass1_Sub4_1 = null;
			return local14;
		}
	}
}
