import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_66 = new Class267("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "[I")
	public static int[] anIntArray336 = new int[2];

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public static int anInt5012 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[BIII)V")
	public static void method4208(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(21) int local21 = arg1 - arg2 >> 2;
		arg3 += arg2;
		while (true) {
			local21--;
			if (local21 < 0) {
				local21 = arg1 - arg2 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(30) int local30 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg0[local35] = 1;
			arg3 = local40 + 1;
			arg0[local40] = 1;
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method4210() {
		if (Static352.aClass2_2 != null) {
			Static352.aClass2_2.method360();
		}
		if (Static116.aClass2_1 != null) {
			Static116.aClass2_1.method360();
		}
	}
}
