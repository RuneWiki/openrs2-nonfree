import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "Lclient!nq;")
	public static Class144 aClass144_105;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	public static int anInt6298;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_111 = new Class117("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public static int anInt6296 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!mc;III[Z)Z")
	public static boolean method5390(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static108.aClass77Array2 != Static79.aClass77Array5) {
			@Pc(11) int local11 = Static129.aClass77Array3[arg1].method4133(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class77 local18 = Static129.aClass77Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4133(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4126(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4127(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5391(@OriginalArg(1) long arg0) {
		Static325.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static325.aCalendar2.get(7);
		@Pc(17) int local17 = Static325.aCalendar2.get(5);
		@Pc(21) int local21 = Static325.aCalendar2.get(2);
		@Pc(25) int local25 = Static325.aCalendar2.get(1);
		@Pc(39) int local39 = Static325.aCalendar2.get(11);
		@Pc(43) int local43 = Static325.aCalendar2.get(12);
		@Pc(47) int local47 = Static325.aCalendar2.get(13);
		return Static96.aStringArray15[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static124.aStringArray22[local21] + "-" + local25 + " " + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + ":" + local47 / 10 + local47 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIII)Z")
	public static boolean method5392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface7 local11 = (Interface7) Static3.method15(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static233.method4160(local11) & true;
		}
		local11 = (Interface7) Static284.method4725(arg1, arg2, arg0, sc.class);
		if (local11 != null) {
			local5 &= Static233.method4160(local11);
		}
		local11 = (Interface7) Static136.method5506(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static233.method4160(local11);
		}
		return local5;
	}
}
