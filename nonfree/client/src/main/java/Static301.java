import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!kd", name = "me", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray3;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Z")
	public static boolean aBoolean679 = false;

	@OriginalMember(owner = "client!kd", name = "Bc", descriptor = "I")
	public static int anInt9106 = 0;

	@OriginalMember(owner = "client!kd", name = "tf", descriptor = "Lclient!um;")
	public static final Class354 aClass354_19 = new Class354("", 19);

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "(I)V")
	public static void method7741() {
		Static262.aClass5_Sub5_Sub19_4 = new Class5_Sub5_Sub19(Static582.aClass335_6.method8349(Static323.anInt5795), "", Static446.anInt7686, 1008, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "(B)V")
	public static void method7798() {
		Static86.anInt1451 = -1;
		Static170.anInt2914 = 0;
		Static669.anInt10711 = -1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII[[[BIIIILclient!ha;II)V")
	public static void method7828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class57 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg8 = 1;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg2 = arg2 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg8 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg9.Q(arg4, arg6, arg0, arg3, arg11, arg10, arg5[arg8 - 1][arg2], arg7, arg1);
	}
}
