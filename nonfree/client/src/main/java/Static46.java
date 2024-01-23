import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	public static int anInt950 = 0;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_342 = Static186.method3527("");

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_343 = Static186.method3527("Cabbage");

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_344 = Static186.method3527("document)3cookie=(R");

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
	public static int anInt954 = 0;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_345 = Static186.method3527("null");

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLclient!jj;)V")
	public static void method700(@OriginalArg(1) Class59 arg0) {
		Static229.aClass59_1 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!pa;ZILclient!pa;)Lclient!ph;")
	public static Class1_Sub1_Sub15 method701(@OriginalArg(1) Class86 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class86 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int[] local17 = arg0.method3308(arg1);
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(29) byte[] local29 = arg0.method3327(local17[local19], arg1);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = local29[1] & 0xFF | (local29[0] & 0xFF) << 8;
				@Pc(57) byte[] local57 = arg2.method3327(0, local49);
				if (local57 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub1_Sub15(arg0, arg2, arg1, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}
}
