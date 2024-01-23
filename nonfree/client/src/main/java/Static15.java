import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
	public static boolean aBoolean31;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_128 = Static200.method3116("runes");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[Lclient!me;")
	public static Class66[] aClass66Array1 = new Class66[27];

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!kh;")
	private static Class60 aClass60_132 = Static200.method3116("Could not complete login)3");

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_129 = aClass60_132;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_130 = Static200.method3116("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_131 = Static200.method3116("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public static int anInt412 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILclient!ah;II)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg1 * arg1 + arg5 * arg5;
		if (local12 > 360000) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg3.anInt251 / 2, arg3.anInt221 / 2);
		if (local12 <= local32 * local32) {
			Static220.method3531(arg3, arg2, arg5, Static168.aClass1_Sub1_Sub6Array10[arg0], arg1, arg4);
			return;
		}
		local32 -= 10;
		@Pc(55) int local55 = Static12.anInt352 + Static31.anInt799 & 0x7FF;
		@Pc(59) int local59 = Class46.anIntArray226[local55];
		@Pc(67) int local67 = local59 * 256 / (Static154.anInt3449 + 256);
		@Pc(71) int local71 = Class46.anIntArray225[local55];
		@Pc(79) int local79 = local71 * 256 / (Static154.anInt3449 + 256);
		@Pc(89) int local89 = arg1 * local79 + arg5 * local67 >> 16;
		@Pc(100) int local100 = arg5 * local79 - local67 * arg1 >> 16;
		@Pc(106) double local106 = Math.atan2((double) local89, (double) local100);
		@Pc(113) int local113 = (int) (Math.sin(local106) * (double) local32);
		@Pc(120) int local120 = (int) ((double) local32 * Math.cos(local106));
		((Class1_Sub1_Sub6_Sub1) Static157.aClass1_Sub1_Sub6Array9[arg0]).method2184(arg4 + arg3.anInt251 / 2 + local113 - 10, arg2 + arg3.anInt221 / 2 - (local120 + 10), local106);
	}
}
