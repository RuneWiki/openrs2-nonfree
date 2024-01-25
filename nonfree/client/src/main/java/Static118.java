import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_7 = new Class212(4, 3);

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public static int anInt2542 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	public static boolean method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static65.anInt1248; local1++) {
			@Pc(6) Class160 local6 = Static325.aClass160Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4413 == 1) {
				local15 = local6.anInt4404 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4408 + (local6.anInt4418 * local15 >> 8);
					local37 = local6.anInt4405 + (local6.anInt4403 * local15 >> 8);
					local47 = local6.anInt4411 + (local6.anInt4421 * local15 >> 8);
					local57 = local6.anInt4412 + (local6.anInt4422 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4413 == 2) {
				local15 = arg0 - local6.anInt4404;
				if (local15 > 0) {
					local27 = local6.anInt4408 + (local6.anInt4418 * local15 >> 8);
					local37 = local6.anInt4405 + (local6.anInt4403 * local15 >> 8);
					local47 = local6.anInt4411 + (local6.anInt4421 * local15 >> 8);
					local57 = local6.anInt4412 + (local6.anInt4422 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4413 == 3) {
				local15 = local6.anInt4408 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4417 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4414 * local15 >> 8);
					local47 = local6.anInt4411 + (local6.anInt4421 * local15 >> 8);
					local57 = local6.anInt4412 + (local6.anInt4422 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4413 == 4) {
				local15 = arg2 - local6.anInt4408;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4417 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4414 * local15 >> 8);
					local47 = local6.anInt4411 + (local6.anInt4421 * local15 >> 8);
					local57 = local6.anInt4412 + (local6.anInt4422 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4413 == 5) {
				local15 = arg1 - local6.anInt4411;
				if (local15 > 0) {
					local27 = local6.anInt4404 + (local6.anInt4417 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4414 * local15 >> 8);
					local47 = local6.anInt4408 + (local6.anInt4418 * local15 >> 8);
					local57 = local6.anInt4405 + (local6.anInt4403 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
