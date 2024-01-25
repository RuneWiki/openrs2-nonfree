import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "Lclient!fda;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
	public static void method2121() {
		Static461.aClass391_59.method9276(0);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IJZJLjava/lang/String;IZLjava/lang/String;IBIZI)V")
	public static void method2122(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) String arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static526.aBoolean669 && Static481.anInt8130 < 500) {
			@Pc(22) int local22 = arg8 == -1 ? Static446.anInt7686 : arg8;
			@Pc(46) Class5_Sub5_Sub19 local46 = new Class5_Sub5_Sub19(arg4, arg7, local22, arg9, arg11, arg3, arg0, arg5, arg10, arg2, arg1, arg6);
			Static298.method4400(local46);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIZLclient!la;)V")
	public static void method2123(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) Class208 arg2) {
		Static496.anInt8290 = 1;
		Static508.anInt8709 = arg0;
		Static659.aClass208_145 = arg2;
		Static212.anInt3461 = 2;
		Static144.anInt2320 = 0;
		Static609.anInt10105 = arg1;
		Static622.aClass5_Sub16_Sub4_8 = null;
		Static389.aBoolean509 = false;
	}
}
