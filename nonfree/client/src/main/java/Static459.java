import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public static void method6830() {
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub6_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub6_2);
		Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub12_2);
		Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub12_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub20_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub10_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub7_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub21_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub26_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub16_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub29_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub17_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub25_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub2_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_2);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub9_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub28_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub3_1);
		Static136.method2007();
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub27_1);
		Static97.aClass5_Sub25_8.method3683(3, Static97.aClass5_Sub25_8.aClass6_Sub1_1);
		Static542.method7940();
		Static507.method7588();
		Static532.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method6832(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(10) byte[] local10 = new byte[arg0];
			Static101.method1630(arg1, local10, arg0);
			return local10;
		} catch (@Pc(20) IOException local20) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIIII)V")
	public static void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static62.anInt1300 < arg1 || Static554.anInt9362 > arg4) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg0 < Static275.anInt4919) {
			arg0 = Static275.anInt4919;
			local31 = false;
		} else if (Static529.anInt9089 >= arg0) {
			local31 = true;
		} else {
			local31 = false;
			arg0 = Static529.anInt9089;
		}
		@Pc(48) boolean local48;
		if (Static275.anInt4919 > arg2) {
			local48 = false;
			arg2 = Static275.anInt4919;
		} else if (Static529.anInt9089 >= arg2) {
			local48 = true;
		} else {
			local48 = false;
			arg2 = Static529.anInt9089;
		}
		if (arg1 >= Static554.anInt9362) {
			Static491.method7219(Static249.anIntArrayArray23[arg1++], arg0, arg3, arg2);
		} else {
			arg1 = Static554.anInt9362;
		}
		if (arg4 > Static62.anInt1300) {
			arg4 = Static62.anInt1300;
		} else {
			Static491.method7219(Static249.anIntArrayArray23[arg4--], arg0, arg3, arg2);
		}
		@Pc(109) int local109;
		if (local31 && local48) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				@Pc(115) int[] local115 = Static249.anIntArrayArray23[local109];
				local115[arg0] = local115[arg2] = arg3;
			}
		} else if (local31) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static249.anIntArrayArray23[local109][arg0] = arg3;
			}
		} else if (local48) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static249.anIntArrayArray23[local109][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)Lclient!pha;")
	public static Class5_Sub5_Sub16 method6834() {
		return Static620.aClass5_Sub5_Sub16_2;
	}
}
