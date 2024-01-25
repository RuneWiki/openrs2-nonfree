import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_6 = new Class267(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
	public static int anInt440 = 0;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
	public static int anInt444 = 0;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIB)Z")
	public static boolean method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(IIII)V")
	public static void method388(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static203.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBI[BII[B)V")
	public static void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg2++;
				arg4[local26] = (byte) (arg4[local26] - arg7[arg5++]);
				@Pc(39) int local39 = arg2++;
				arg4[local39] = (byte) (arg4[local39] - arg7[arg5++]);
				@Pc(52) int local52 = arg2++;
				arg4[local52] = (byte) (arg4[local52] - arg7[arg5++]);
				@Pc(65) int local65 = arg2++;
				arg4[local65] = (byte) (arg4[local65] - arg7[arg5++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg2++;
				arg4[local26] = (byte) (arg4[local26] - arg7[arg5++]);
			}
			arg2 += arg1;
			arg5 += arg0;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIII)V")
	public static void method390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static165.anInt3313 && Static152.anInt3132 >= arg0) {
			@Pc(23) int local23 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg1);
			@Pc(29) int local29 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg2);
			Static326.method4705(local29, arg0, local23, arg3);
		}
	}
}
