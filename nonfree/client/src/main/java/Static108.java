import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	public static int anInt2042;

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Lclient!la;")
	public static Class207 aClass207_25;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "[Lclient!bg;")
	public static Class34[] aClass34Array3;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!ib;")
	public static final Class155 aClass155_1 = new Class155(true);

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_37 = new Class337(81, -2);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1679(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (local13 << 5) - (local13 - arg0.charAt(local15));
		}
		return local13;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)I")
	public static int method1681(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Lclient!hs;")
	public static Class5_Sub25 method1682() {
		@Pc(7) Class79 local7 = null;
		@Pc(13) Class5_Sub25 local13 = new Class5_Sub25(Static156.aClass63_2, 0);
		try {
			@Pc(19) Class91 local19 = Static470.aClass100_14.method2085("");
			while (local19.anInt2271 == 0) {
				Static314.method4821(1L);
			}
			if (local19.anInt2271 == 1) {
				local7 = (Class79) local19.anObject2;
				@Pc(53) byte[] local53 = new byte[(int) local7.method1665()];
				@Pc(68) int local68;
				for (@Pc(55) int local55 = 0; local55 < local53.length; local55 += local68) {
					local68 = local7.method1661(local53.length - local55, local55, local53);
					if (local68 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class5_Sub25(new Class5_Sub22(local53), Static156.aClass63_2, 0);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (local7 != null) {
				local7.method1662();
			}
		} catch (@Pc(103) Exception local103) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIIIII)V")
	public static void method1683(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class5_Sub38 local20 = (Class5_Sub38) Static447.aClass273_30.method6581(local14);
		if (local20 == null) {
			local20 = new Class5_Sub38();
			Static447.aClass273_30.method6585(local14, local20);
		}
		if (local20.anIntArray364.length <= arg1) {
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(52) int[] local52 = new int[arg1 + 1];
			for (@Pc(54) int local54 = 0; local54 < local20.anIntArray364.length; local54++) {
				local47[local54] = local20.anIntArray364[local54];
				local52[local54] = local20.anIntArray363[local54];
			}
			for (@Pc(84) int local84 = local20.anIntArray364.length; local84 < arg1; local84++) {
				local47[local84] = -1;
				local52[local84] = 0;
			}
			local20.anIntArray364 = local47;
			local20.anIntArray363 = local52;
		}
		local20.anIntArray364[arg1] = arg2;
		local20.anIntArray363[arg1] = arg4;
	}
}
