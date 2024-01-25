import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)I")
	public static int method4992() {
		return Static555.anInt9458;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method4993() {
		@Pc(1) Class112 local1 = Static185.aClass112_20;
		synchronized (Static185.aClass112_20) {
			Static185.aClass112_20.method3638();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg1 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg4 + 7) / 8);
		for (@Pc(44) int local44 = local32; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local19;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}
}
