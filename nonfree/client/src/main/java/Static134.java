import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_19 = new Class24(16);

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
	public static final int[] anIntArray183 = new int[100];

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ro;")
	public static Class5_Sub4 method2239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class160 local14 = local7.aClass160_1; local14 != null; local14 = local14.aClass160_3) {
			@Pc(18) Class5_Sub4 local18 = local14.aClass5_Sub4_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort86 == arg1 && local18.aShort87 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI)V")
	public static void method2241(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static228.method3971(arg0 - 1L);
			Static228.method3971(1L);
		} else {
			Static228.method3971(arg0);
		}
	}
}
