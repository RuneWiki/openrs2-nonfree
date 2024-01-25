import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bfa", name = "E", descriptor = "[I")
	public static final int[] anIntArray45 = new int[3];

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIILclient!lg;)V")
	public static void method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23_Sub2_Sub3 arg3) {
		@Pc(4) Class247 local4 = Static554.method7252(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass23_Sub2_Sub3_1 = arg3;
		@Pc(16) int local16 = Static343.aClass104Array2 == Static605.aClass104Array3 ? 1 : 0;
		if (arg3.method8608()) {
			if (arg3.method8594()) {
				arg3.aClass23_Sub2_23 = Static496.aClass23_Sub2Array3[local16];
				Static496.aClass23_Sub2Array3[local16] = arg3;
				return;
			}
			arg3.aClass23_Sub2_23 = Static249.aClass23_Sub2Array2[local16];
			Static249.aClass23_Sub2Array2[local16] = arg3;
			Static674.aBoolean763 = true;
			return;
		}
		arg3.aClass23_Sub2_23 = Static188.aClass23_Sub2Array1[local16];
		Static188.aClass23_Sub2Array1[local16] = arg3;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)V")
	public static void method1220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 1);
		local9.method1712();
		local9.anInt1790 = arg1;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method1222(@OriginalArg(0) File arg0) {
		return Static223.method3476(arg0, (int) arg0.length());
	}
}
