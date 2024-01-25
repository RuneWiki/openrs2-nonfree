import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt9933;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!da;")
	public static Class73 aClass73_15;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_97 = new Class305(34, 8);

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public static final int anInt9938 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method8266(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0 == arg1.charAt(local10)) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method8267(@OriginalArg(0) Class390 arg0) {
		Static496.aClass390_96 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBII[B)V")
	public static void method8268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(24) int local24 = arg1 - arg2 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg0 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}
