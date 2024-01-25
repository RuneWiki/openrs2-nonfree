import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_215 = new Class151(131, 2);

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
	public static int anInt9834 = 0;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[BIIBI)V")
	public static void method8412(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(15) int local15 = arg2 - arg3 >> 2;
		arg1 += arg3;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg2 - arg3 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(24) int local24 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			arg1 = local34 + 1;
			arg0[local34] = 1;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLclient!es;)Lclient!ew;")
	public static Class103_Sub1 method8414(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(15) Class103 local15 = Static488.method6659(arg0);
		@Pc(19) int local19 = arg0.method8850();
		@Pc(23) int local23 = arg0.method8850();
		return new Class103_Sub1(local15.aClass291_14, local15.aClass125_16, local15.anInt8643, local15.anInt8650, local15.anInt8646, local15.anInt8653, local15.anInt8648, local15.anInt8641, local15.anInt8644, local19, local23);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method8415(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg2.length() > 320 || !Static379.method4946()) {
			return;
		}
		Static217.method3242();
		Static141.anInt2583 = arg1;
		Static602.aString115 = arg0;
		Static163.aString26 = arg2;
		Static53.method1256(6);
	}
}
