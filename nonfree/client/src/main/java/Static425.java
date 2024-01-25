import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
	public static final int[] anIntArray596 = new int[13];

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_125 = new Class45(1, 8);

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	public static int anInt7891 = 0;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_72 = new Class77(41, -1);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII[BI[BII)V")
	public static void method6544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(15) int local15 = -(arg3 >> 2);
		@Pc(20) int local20 = -(arg3 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg2++;
				arg6[local31] += arg4[arg1++];
				@Pc(43) int local43 = arg2++;
				arg6[local43] += arg4[arg1++];
				@Pc(55) int local55 = arg2++;
				arg6[local55] += arg4[arg1++];
				@Pc(67) int local67 = arg2++;
				arg6[local67] += arg4[arg1++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg2++;
				arg6[local31] += arg4[arg1++];
			}
			arg2 += arg5;
			arg1 += arg0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[S)[S")
	public static short[] method6548(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static554.method3501(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method6549(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static149.aBoolean267) {
			try {
				@Pc(18) Class208 local18 = (Class208) Class.forName("Class208_Sub1").getDeclaredConstructor().newInstance();
				local18.method5036(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static149.aBoolean267 = true;
			}
		}
		return arg0;
	}
}
