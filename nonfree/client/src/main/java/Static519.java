import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "[I")
	public static int[] anIntArray693;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!cc;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_3;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Lclient!uf;")
	public static Class283 aClass283_5;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!mba;")
	public static final Class184 aClass184_12 = new Class184();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZ)Lclient!wca;")
	public static Class310 method7538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class310 local7 = Static111.method2143(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass310Array2 == null || arg1 >= local7.aClass310Array2.length) {
			return null;
		} else {
			return local7.aClass310Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!wca;II)I")
	public static int method7539(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1) {
		if (!Static67.method1257(arg0).method6277(arg1) && arg0.anObjectArray27 == null) {
			return -1;
		} else if (arg0.anIntArray710 == null || arg0.anIntArray710.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray710[arg1];
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Lclient!sk;")
	public static Class262 method7540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static399.aClass262ArrayArrayArray2[0][arg1][arg2] != null && Static399.aClass262ArrayArrayArray2[0][arg1][arg2].aClass262_1 != null;
			if (local28 && arg0 >= Static323.anInt6015 - 1) {
				return null;
			}
			Static11.method3919(arg0, arg1, arg2);
		}
		return Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I[BIIBIII[B)V")
	public static void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg7[local31] = (byte) (arg7[local31] - arg1[arg4++]);
				@Pc(44) int local44 = arg5++;
				arg7[local44] = (byte) (arg7[local44] - arg1[arg4++]);
				@Pc(57) int local57 = arg5++;
				arg7[local57] = (byte) (arg7[local57] - arg1[arg4++]);
				@Pc(70) int local70 = arg5++;
				arg7[local70] = (byte) (arg7[local70] - arg1[arg4++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg5++;
				arg7[local31] = (byte) (arg7[local31] - arg1[arg4++]);
			}
			arg5 += arg0;
			arg4 += arg6;
		}
	}
}
