import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public static int anInt7097;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_48 = new Class313(8);

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "[I")
	public static final int[] anIntArray684 = new int[3];

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_97 = new Class306("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "[I")
	public static final int[] anIntArray685 = new int[8];

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)Z")
	public static boolean method5943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static124.anInt2511; local1++) {
			@Pc(6) Class260 local6 = Static251.aClass260Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt7441 == 1) {
				local15 = local6.anInt7437 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt7447 + (local6.anInt7452 * local15 >> 8);
					local37 = local6.anInt7439 + (local6.anInt7443 * local15 >> 8);
					local47 = local6.anInt7450 + (local6.anInt7445 * local15 >> 8);
					local57 = local6.anInt7453 + (local6.anInt7449 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7441 == 2) {
				local15 = arg0 - local6.anInt7437;
				if (local15 > 0) {
					local27 = local6.anInt7447 + (local6.anInt7452 * local15 >> 8);
					local37 = local6.anInt7439 + (local6.anInt7443 * local15 >> 8);
					local47 = local6.anInt7450 + (local6.anInt7445 * local15 >> 8);
					local57 = local6.anInt7453 + (local6.anInt7449 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7441 == 3) {
				local15 = local6.anInt7447 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt7437 + (local6.anInt7442 * local15 >> 8);
					local37 = local6.anInt7448 + (local6.anInt7438 * local15 >> 8);
					local47 = local6.anInt7450 + (local6.anInt7445 * local15 >> 8);
					local57 = local6.anInt7453 + (local6.anInt7449 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7441 == 4) {
				local15 = arg2 - local6.anInt7447;
				if (local15 > 0) {
					local27 = local6.anInt7437 + (local6.anInt7442 * local15 >> 8);
					local37 = local6.anInt7448 + (local6.anInt7438 * local15 >> 8);
					local47 = local6.anInt7450 + (local6.anInt7445 * local15 >> 8);
					local57 = local6.anInt7453 + (local6.anInt7449 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7441 == 5) {
				local15 = arg1 - local6.anInt7450;
				if (local15 > 0) {
					local27 = local6.anInt7437 + (local6.anInt7442 * local15 >> 8);
					local37 = local6.anInt7448 + (local6.anInt7438 * local15 >> 8);
					local47 = local6.anInt7447 + (local6.anInt7452 * local15 >> 8);
					local57 = local6.anInt7439 + (local6.anInt7443 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)Z")
	public static boolean method5944(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)Lclient!rn;")
	public static Class45 method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(38) long local38 = (long) arg3 * 97549L ^ (long) arg5 * 67481L ^ (long) arg4 * 475427L ^ (long) arg0 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg2 * 76724863L;
		@Pc(44) Class45 local44 = (Class45) aClass313_48.method7406(local38);
		if (local44 == null) {
			local44 = Static487.aClass122_8.method7227(arg5, arg3, arg4, arg0, arg1, arg2);
			aClass313_48.method7399(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}
}
