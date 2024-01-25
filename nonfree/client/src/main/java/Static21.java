import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public static int anInt279;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	public static int anInt277 = -1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIII)V")
	public static void method243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static398.anInt6878 <= arg3 && arg0 <= Static8.anInt136 && arg1 >= Static605.anInt9561 && Static223.anInt4380 >= arg2) {
			Static194.method3668(arg2, arg1, arg0, arg4, arg3);
		} else {
			Static104.method2008(arg3, arg1, arg0, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!jc;Lclient!pga;B)Lclient!vq;")
	public static Class383 method245(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) Class282 arg1) {
		@Pc(19) Class383 local19 = new Class383(arg1);
		@Pc(23) int local23 = arg0.method3030();
		@Pc(32) boolean local32 = (local23 & 0x1) != 0;
		@Pc(44) boolean local44 = (local23 & 0x2) != 0;
		@Pc(53) boolean local53 = (local23 & 0x4) != 0;
		if (local32) {
			local19.anIntArray680[0] = arg0.method3044();
			local19.anIntArray683[0] = arg0.method3044();
			if (arg1.anInt7932 != -1 || arg1.anInt7893 != -1) {
				local19.anIntArray680[1] = arg0.method3044();
				local19.anIntArray683[1] = arg0.method3044();
			}
			if (arg1.anInt7918 != -1 || arg1.anInt7889 != -1) {
				local19.anIntArray680[2] = arg0.method3044();
				local19.anIntArray683[2] = arg0.method3044();
			}
		}
		@Pc(136) boolean local136 = (local23 & 0x8) != 0;
		if (local44) {
			local19.anIntArray682[0] = arg0.method3044();
			local19.anIntArray681[0] = arg0.method3044();
			if (arg1.anInt7926 != -1 || arg1.anInt7885 != -1) {
				local19.anIntArray682[1] = arg0.method3044();
				local19.anIntArray681[1] = arg0.method3044();
			}
		}
		@Pc(186) int local186;
		@Pc(189) int[] local189;
		@Pc(221) int local221;
		if (local53) {
			local186 = arg0.method3018();
			local189 = new int[] { local186 & 0xF, local186 >> 4 & 0xF, (local186 & 0xF89) >> 8, local186 >> 12 & 0xF };
			for (local221 = 0; local221 < 4; local221++) {
				if (local189[local221] != 15) {
					local19.aShortArray158[local189[local221]] = (short) arg0.method3018();
				}
			}
		}
		if (local136) {
			local186 = arg0.method3030();
			local189 = new int[] { local186 & 0xF, local186 >> 4 & 0xF };
			for (local221 = 0; local221 < 2; local221++) {
				if (local189[local221] != 15) {
					local19.aShortArray157[local189[local221]] = (short) arg0.method3018();
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!lga;Lclient!ft;B)V")
	public static void method248(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class122 arg1) {
		Static318.aString62 = "";
		Static168.aClass223_31 = arg0;
		Static606.aClass122_36 = arg1;
		if (Class278.aString85.startsWith("win")) {
			Static318.aString62 = Static318.aString62 + "windows/";
		} else if (Class278.aString85.startsWith("linux")) {
			Static318.aString62 = Static318.aString62 + "linux/";
		} else if (Class278.aString85.startsWith("mac")) {
			Static318.aString62 = Static318.aString62 + "macos/";
		}
		if (Static606.aClass122_36.aBoolean282) {
			Static318.aString62 = Static318.aString62 + "msjava/";
		} else if (Class278.aString86.startsWith("amd64") || Class278.aString86.startsWith("x86_64")) {
			Static318.aString62 = Static318.aString62 + "x86_64/";
		} else if (Class278.aString86.startsWith("i386") || Class278.aString86.startsWith("i486") || Class278.aString86.startsWith("i586") || Class278.aString86.startsWith("x86")) {
			Static318.aString62 = Static318.aString62 + "x86/";
		} else if (Class278.aString86.startsWith("ppc")) {
			Static318.aString62 = Static318.aString62 + "ppc/";
		} else {
			Static318.aString62 = Static318.aString62 + "universal/";
		}
	}
}
