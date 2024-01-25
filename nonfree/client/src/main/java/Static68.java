import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!to;")
	public static final Class191 aClass191_3 = new Class191();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILclient!p;)V")
	public static void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class156 arg3) {
		for (@Pc(14) Class5_Sub7 local14 = (Class5_Sub7) Static296.aClass103_138.method2756(); local14 != null; local14 = (Class5_Sub7) Static296.aClass103_138.method2748()) {
			if (local14.anInt432 == arg1 && local14.anInt442 == arg0 * 128 && local14.anInt443 == arg2 * 128 && arg3.lb == local14.aClass156_1.lb) {
				if (local14.aClass5_Sub16_Sub3_1 != null) {
					Static114.aClass5_Sub16_Sub4_1.method5798(local14.aClass5_Sub16_Sub3_1);
					local14.aClass5_Sub16_Sub3_1 = null;
				}
				if (local14.aClass5_Sub16_Sub3_2 != null) {
					Static114.aClass5_Sub16_Sub4_1.method5798(local14.aClass5_Sub16_Sub3_2);
					local14.aClass5_Sub16_Sub3_2 = null;
				}
				local14.method6005();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[J[II)V")
	public static void method4998(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg0; local42++) {
			if (arg1[local42] < (long) (local42 & 0x1) + local16) {
				@Pc(59) long local59 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local59;
				@Pc(73) int local73 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local73;
			}
		}
		arg1[arg0] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method4998(local12 - 1, arg1, arg2, arg3);
		method4998(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z[J[Ljava/lang/Object;II)V")
	public static void method5001(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg0[local46]) {
				@Pc(64) long local64 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local64;
				@Pc(78) Object local78 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local78;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method5001(arg0, arg1, arg2, local16 - 1);
		method5001(arg0, arg1, local16 + 1, arg3);
	}
}
