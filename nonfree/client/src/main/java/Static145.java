import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Lclient!dr;")
	public static Class37 aClass37_8;

	@OriginalMember(owner = "client!is", name = "R", descriptor = "Lclient!bl;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public static int anInt3131 = -1;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "Z")
	public static boolean aBoolean285 = true;

	@OriginalMember(owner = "client!is", name = "L", descriptor = "F")
	public static float aFloat37 = 0.0F;

	@OriginalMember(owner = "client!is", name = "U", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_61 = new Class102("", 15);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIB)I")
	public static int method2831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBI)I")
	public static int method2832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = local21 * (local21 * 15731 * local21 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!iq;II)Lclient!go;")
	public static Class82 method2833(@OriginalArg(1) Class104 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method2756(arg1, 0);
		return local14 == null ? null : new Class82(local14);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
	public static void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local21;
		@Pc(35) Object local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg0; local47++) {
			if (arg1[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(64) long local64 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17] = local64;
				@Pc(78) Object local78 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local78;
			}
		}
		arg1[arg0] = arg1[local17];
		arg1[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method2834(local17 - 1, arg1, arg2, arg3);
		method2834(arg0, arg1, arg2, local17 + 1);
	}
}
