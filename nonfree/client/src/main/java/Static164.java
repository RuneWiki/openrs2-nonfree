import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gm", name = "Fb", descriptor = "Lclient!kk;")
	public static Class178 aClass178_1;

	@OriginalMember(owner = "client!gm", name = "Gb", descriptor = "Lclient!pf;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!gm", name = "Cb", descriptor = "J")
	public static long aLong87 = 20000000L;

	@OriginalMember(owner = "client!gm", name = "Eb", descriptor = "Lclient!ns;")
	public static final Class228 aClass228_9 = new Class228();

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!uda;")
	public static Class155 method3124(@OriginalArg(0) Component arg0) {
		return new Class155_Sub1(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public static void method3125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static208.method3687(arg3 - arg0, arg1, Static454.anIntArrayArray71[arg2], arg3 + arg0);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(54) int[] local54 = Static454.anIntArrayArray71[local9 + arg2];
				@Pc(61) int[] local61 = Static454.anIntArrayArray71[arg2 - local9];
				@Pc(66) int local66 = arg3 + local7;
				@Pc(70) int local70 = arg3 - local7;
				Static208.method3687(local70, arg1, local54, local66);
				Static208.method3687(local70, arg1, local61, local66);
			}
			@Pc(87) int local87 = arg3 + local9;
			@Pc(92) int local92 = arg3 - local9;
			@Pc(98) int[] local98 = Static454.anIntArrayArray71[local7 + arg2];
			@Pc(105) int[] local105 = Static454.anIntArrayArray71[arg2 - local7];
			Static208.method3687(local92, arg1, local98, local87);
			Static208.method3687(local92, arg1, local105, local87);
		}
	}
}
