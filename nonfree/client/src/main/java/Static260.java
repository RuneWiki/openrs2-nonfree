import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_128 = new Class363(40, 2);

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!rc;ILclient!ct;IIIIIII)V")
	public static void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static305.anInt5435 = arg0;
		Static168.aClass62_5 = arg3;
		Static378.anInt6703 = arg1;
		Static63.anInt1460 = arg4;
		Static432.anInt7309 = arg9;
		Static95.anInt2025 = arg5;
		Static289.anInt5286 = arg10;
		Static499.aClass13_3 = null;
		Static164.anInt3481 = arg6;
		Static205.aClass13_2 = null;
		Static33.anInt856 = arg7;
		Static45.aClass13_1 = null;
		Static21.aClass279_4 = arg2;
		Static506.anInt8462 = arg8;
		Static259.method4034();
		Static212.aBoolean333 = true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Z")
	public static boolean method4038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}
