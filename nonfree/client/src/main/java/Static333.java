import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	public static int anInt6111;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	public static int anInt6107 = 0;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "[I")
	public static final int[] anIntArray574 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "[I")
	public static final int[] anIntArray575 = new int[32];

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
	public static boolean aBoolean386 = false;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Z")
	public static boolean method4690(@OriginalArg(0) int arg0) {
		return arg0 == 18 || arg0 == 51 || arg0 == 1009 || arg0 == 2 || arg0 == 47;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z")
	public static boolean method4696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static96.anInt2298; local1++) {
			@Pc(6) Class230 local6 = Static316.aClass230Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6704 == 1) {
				local15 = local6.anInt6701 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6712 + (local6.anInt6708 * local15 >> 8);
					local37 = local6.anInt6715 + (local6.anInt6700 * local15 >> 8);
					local47 = local6.anInt6720 + (local6.anInt6716 * local15 >> 8);
					local57 = local6.anInt6714 + (local6.anInt6718 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6704 == 2) {
				local15 = arg0 - local6.anInt6701;
				if (local15 > 0) {
					local27 = local6.anInt6712 + (local6.anInt6708 * local15 >> 8);
					local37 = local6.anInt6715 + (local6.anInt6700 * local15 >> 8);
					local47 = local6.anInt6720 + (local6.anInt6716 * local15 >> 8);
					local57 = local6.anInt6714 + (local6.anInt6718 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6704 == 3) {
				local15 = local6.anInt6712 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6701 + (local6.anInt6717 * local15 >> 8);
					local37 = local6.anInt6710 + (local6.anInt6721 * local15 >> 8);
					local47 = local6.anInt6720 + (local6.anInt6716 * local15 >> 8);
					local57 = local6.anInt6714 + (local6.anInt6718 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6704 == 4) {
				local15 = arg2 - local6.anInt6712;
				if (local15 > 0) {
					local27 = local6.anInt6701 + (local6.anInt6717 * local15 >> 8);
					local37 = local6.anInt6710 + (local6.anInt6721 * local15 >> 8);
					local47 = local6.anInt6720 + (local6.anInt6716 * local15 >> 8);
					local57 = local6.anInt6714 + (local6.anInt6718 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6704 == 5) {
				local15 = arg1 - local6.anInt6720;
				if (local15 > 0) {
					local27 = local6.anInt6701 + (local6.anInt6717 * local15 >> 8);
					local37 = local6.anInt6710 + (local6.anInt6721 * local15 >> 8);
					local47 = local6.anInt6712 + (local6.anInt6708 * local15 >> 8);
					local57 = local6.anInt6715 + (local6.anInt6700 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
