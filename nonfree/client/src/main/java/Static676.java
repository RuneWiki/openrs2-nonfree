import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public static int anInt11214 = 0;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_278 = new Class251(28, 15);

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!oga;")
	public static final Class269 aClass269_181 = new Class269();

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZII)I")
	public static int method9509(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class14_Sub14 local8 = Static495.method7455(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray106.length) {
			return local8.anIntArray106[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([Ljava/lang/Object;II[II)V")
	public static void method9510(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(9) int local9 = (arg1 + arg3) / 2;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg2[local9];
		arg2[local9] = arg2[arg3];
		arg2[arg3] = local15;
		@Pc(29) Object local29 = arg0[local9];
		arg0[local9] = arg0[arg3];
		arg0[arg3] = local29;
		@Pc(47) int local47 = local15 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg1; local49 < arg3; local49++) {
			if (local15 + (local49 & local47) > arg2[local49]) {
				@Pc(64) int local64 = arg2[local49];
				arg2[local49] = arg2[local11];
				arg2[local11] = local64;
				@Pc(78) Object local78 = arg0[local49];
				arg0[local49] = arg0[local11];
				arg0[local11++] = local78;
			}
		}
		arg2[arg3] = arg2[local11];
		arg2[local11] = local15;
		arg0[arg3] = arg0[local11];
		arg0[local11] = local29;
		method9510(arg0, arg1, arg2, local11 - 1);
		method9510(arg0, local11 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIZIII)V")
	public static void method9511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static181.aClass14_Sub26_9.aClass43_Sub11_4.method3829() : Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829()) != 0 && arg0 != 0 && Static208.anInt7849 < 50 && arg3 != -1) {
			Static314.aClass106Array1[Static208.anInt7849++] = new Class106((byte) (arg2 ? 3 : 2), arg3, arg0, arg5, arg1, 0, arg4, (Class4_Sub3) null);
		}
	}
}
