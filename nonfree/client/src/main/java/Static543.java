import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt9347;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII[BI)V")
	public static void method7946(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		arg0 += arg1;
		@Pc(30) int local30 = arg3 - arg1 >> 2;
		while (true) {
			local30--;
			if (local30 < 0) {
				local30 = arg3 - arg1 & 0x3;
				while (true) {
					local30--;
					if (local30 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(35) int local35 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local40] = 1;
			arg0 = local45 + 1;
			arg2[local45] = 1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Frame;BLclient!ge;)V")
	public static void method7947(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class112 arg1) {
		while (true) {
			@Pc(8) Class328 local8 = arg1.method3225(arg0);
			while (local8.anInt9389 == 0) {
				Static179.method3254(10L);
			}
			if (local8.anInt9389 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static179.method3254(100L);
		}
	}
}
