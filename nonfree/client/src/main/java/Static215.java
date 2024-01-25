import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "[I")
	public static final int[] anIntArray585 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
	public static final int[] anIntArray586 = new int[100];

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
	public static void method3800() {
		@Pc(12) Class207 local12 = null;
		try {
			@Pc(16) Class99 local16 = Static116.aClass21_4.method372();
			while (local16.anInt2836 == 0) {
				Static129.method2634(1L);
			}
			if (local16.anInt2836 == 1) {
				local12 = (Class207) local16.anObject2;
				@Pc(40) byte[] local40 = new byte[(int) local12.method5332()];
				@Pc(54) int local54;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local54) {
					local54 = local12.method5333(local40, local40.length - local42, local42);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static130.method2637(new Class7_Sub3(local40));
			}
		} catch (@Pc(78) Exception local78) {
		}
		try {
			if (local12 != null) {
				local12.method5336();
			}
		} catch (@Pc(85) Exception local85) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIZ)Z")
	public static boolean method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static92.aByteArrayArrayArray3[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static92.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x10) == 0) {
			return arg3 == Static286.method4739(arg2, arg0, arg1);
		} else {
			return false;
		}
	}
}
