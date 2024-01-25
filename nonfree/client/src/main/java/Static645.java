import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "[I")
	public static int[] anIntArray593;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	public static int anInt10469 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([IB[Ljava/lang/String;II)V")
	public static void method8708(@OriginalArg(0) int[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg2) / 2;
		@Pc(18) int local18 = arg2;
		@Pc(22) String local22 = arg1[local16];
		arg1[local16] = arg1[arg3];
		arg1[arg3] = local22;
		@Pc(36) int local36 = arg0[local16];
		arg0[local16] = arg0[arg3];
		arg0[arg3] = local36;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (local22 == null || arg1[local48] != null && arg1[local48].compareTo(local22) < (local48 & 0x1)) {
				@Pc(72) String local72 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18] = local72;
				@Pc(86) int local86 = arg0[local48];
				arg0[local48] = arg0[local18];
				arg0[local18++] = local86;
			}
		}
		arg1[arg3] = arg1[local18];
		arg1[local18] = local22;
		arg0[arg3] = arg0[local18];
		arg0[local18] = local36;
		method8708(arg0, arg1, arg2, local18 - 1);
		method8708(arg0, arg1, local18 + 1, arg3);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
	public static void method8709() {
		if (Static208.aClass65_7.method6908()) {
			Static208.aClass65_7.method6941(Static141.aCanvas7);
			Static446.method6474();
			if (Static66.aBoolean570) {
				Static584.method8022(Static141.aCanvas7);
			} else {
				@Pc(24) Dimension local24 = Static141.aCanvas7.getSize();
				Static208.aClass65_7.method6928(Static141.aCanvas7, local24.width, local24.height);
			}
			Static208.aClass65_7.method6946(Static141.aCanvas7);
		} else {
			Static428.method6321(Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616(), false);
		}
		Static283.method4543();
		Static375.aBoolean591 = true;
	}
}
