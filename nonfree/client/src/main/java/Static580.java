import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "Lclient!cv;")
	public static final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "Lclient!rj;")
	public static final Class320 aClass320_7 = new Class320();

	@OriginalMember(owner = "client!sfa", name = "m", descriptor = "Lclient!m;")
	public static final Class235 aClass235_45 = new Class235(14);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIII)V")
	public static void method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg3) {
			Static482.method7040(arg2, arg3, Static384.anIntArrayArray38[arg0], arg1);
		} else {
			Static482.method7040(arg2, arg1, Static384.anIntArrayArray38[arg0], arg3);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III[ILclient!nb;[I)Lclient!ef;")
	public static Class1_Sub1 method7997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class67_Sub1 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg3.method5563(Static438.aClass261_14, Static407.aClass145_13)) {
			@Pc(77) int[] local77 = new int[arg0 * arg1];
			for (local23 = 0; local23 < arg1; local23++) {
				local34 = arg4[local23] + local23 * arg0;
				for (local36 = 0; local36 < arg2[local23]; local36++) {
					local77[local34++] = -16777216;
				}
			}
			return new Class1_Sub1(arg3, arg0, arg1, local77);
		}
		@Pc(21) byte[] local21 = new byte[arg1 * arg0];
		for (local23 = 0; local23 < arg1; local23++) {
			local34 = arg0 * local23 + arg4[local23];
			for (local36 = 0; local36 < arg2[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class1_Sub1(arg3, arg0, arg1, local21);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIILclient!bt;ILclient!bs;Lclient!faa;Lclient!ha;I)V")
	public static void method8002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(5) Class3_Sub12 arg4, @OriginalArg(6) Class105 arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg1 - arg7 / 2 - 5;
		@Pc(18) int local18 = arg2 + 2;
		if (arg5.anInt3106 != 0) {
			arg6.method7696(local14, arg0 * arg3.method745() + arg2 + 1 - local18, arg7 + 10, local18, arg5.anInt3106);
		}
		if (arg5.anInt3083 != 0) {
			arg6.method7647(arg5.anInt3083, local14, local18, arg3.method745() * arg0 + arg2 + 1 - local18, arg7 + 10);
		}
		@Pc(77) int local77 = arg5.anInt3076;
		if (arg4.aBoolean76 && arg5.anInt3075 != -1) {
			local77 = arg5.anInt3075;
		}
		for (@Pc(105) int local105 = 0; local105 < arg0; local105++) {
			@Pc(111) String local111 = Static503.aStringArray32[local105];
			if (local105 < arg0 - 1) {
				local111 = local111.substring(0, local111.length() - 4);
			}
			arg3.method744(arg6, local111, arg1, arg2, local77);
			arg2 += arg3.method745();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)V")
	public static void method8003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(16, (long) arg0);
		local9.method630();
		local9.anInt803 = arg1;
	}
}
