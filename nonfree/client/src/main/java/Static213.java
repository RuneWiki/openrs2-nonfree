import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
	public static final int[] anIntArray282 = new int[100];

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_136 = new Class67(80, 12);

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_51 = new Class142("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZBLclient!hm;)V")
	public static void method3088(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class107 arg1) {
		@Pc(20) int local20 = arg1.lb == 0 ? arg1.anInt2648 : arg1.lb;
		@Pc(29) int local29 = arg1.anInt2597 == 0 ? arg1.anInt2606 : arg1.anInt2597;
		Static390.method5057(Static45.aClass107ArrayArray1[arg1.anInt2660 >> 16], arg1.anInt2660, local29, local20, arg0);
		if (arg1.aClass107Array2 != null) {
			Static390.method5057(arg1.aClass107Array2, arg1.anInt2660, local29, local20, arg0);
		}
		@Pc(64) Class1_Sub37 local64 = (Class1_Sub37) Static462.aClass208_42.method4405((long) arg1.anInt2660);
		if (local64 != null) {
			Static447.method5755(local29, local20, arg0, local64.anInt5481);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(JLjava/lang/String;ILjava/lang/String;IIZIIZI)V")
	public static void method3090(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static170.aBoolean282 && Static76.anInt1078 < 500) {
			@Pc(18) int local18 = arg4 == -1 ? Static211.anInt5191 : arg4;
			@Pc(32) Class1_Sub10 local32 = new Class1_Sub10(arg1, arg2, local18, arg7, arg9, arg0, arg3, arg6, arg8, arg5);
			Static57.aClass14_3.method205(local32);
			Static76.anInt1078++;
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)I")
	public static int method3092(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(30) int local30 = (local10 & 0x33333333) + ((local10 & 0xCCCCCCCE) >>> 2);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
