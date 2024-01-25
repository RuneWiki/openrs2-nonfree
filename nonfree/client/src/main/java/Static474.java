import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
	public static int[] anIntArray457;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "Lclient!dw;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public static int anInt7340;

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "Lclient!ho;")
	public static Class9 aClass9_30;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_104 = new Class289(44, 11);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!aa;ILclient!ho;Lclient!sha;IBII)V")
	public static void method6310(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) Class321 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static407.anInt6820 == 4) {
			local14 = (int) Static228.aFloat26 & 0x3FFF;
		} else {
			local14 = Static553.anInt9285 + (int) Static228.aFloat26 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt9103 / 2, arg3.anInt9077 / 2) + 10;
		@Pc(44) int local44 = arg5 * arg5 + arg1 * arg1;
		if (local44 > local35 * local35) {
			return;
		}
		@Pc(59) int local59 = Class6_Sub1_Sub3.anIntArray56[local14];
		@Pc(63) int local63 = Class6_Sub1_Sub3.anIntArray58[local14];
		if (Static407.anInt6820 != 4) {
			local59 = local59 * 256 / (Static605.anInt9842 + 256);
			local63 = local63 * 256 / (Static605.anInt9842 + 256);
		}
		@Pc(95) int local95 = local59 * arg1 + arg5 * local63 >> 14;
		@Pc(106) int local106 = arg1 * local63 - arg5 * local59 >> 14;
		arg2.method8933(arg4 + arg3.anInt9103 / 2 + local95 - arg2.method8937() / 2, -local106 + (arg3.anInt9077 / 2 + arg6 - arg2.method8930() / 2), arg0, arg4, arg6);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III[B)[B")
	public static byte[] method6311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) byte[] local13;
		if (arg1 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg2[arg1 + local15];
			}
		} else {
			local13 = arg2;
		}
		@Pc(37) Class111 local37 = new Class111();
		local37.method2223();
		local37.method2222((long) (arg0 * 8), local13);
		@Pc(56) byte[] local56 = new byte[64];
		local37.method2219(local56);
		return local56;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)V")
	public static void method6313() {
		@Pc(5) Class10 local5 = Static278.aClass10_58;
		synchronized (Static278.aClass10_58) {
			Static278.aClass10_58.method369(5);
		}
	}
}
