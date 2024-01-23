import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!og;")
	public static Class127 aClass127_6;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt1935;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Lclient!gf;")
	public static Class62 aClass62_4;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString61 = "Started 3d Library";

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public static int anInt1939 = -1;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString62 = " has logged in.";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!og;)Z")
	public static boolean method1652(@OriginalArg(1) Class127 arg0) {
		if (arg0.anIntArray412 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray412.length; local13++) {
			@Pc(23) int local23 = Static129.method3069(arg0, local13);
			@Pc(28) int local28 = arg0.anIntArray421[local13];
			if (arg0.anIntArray412[local13] == 2) {
				if (local23 >= local28) {
					return false;
				}
			} else if (arg0.anIntArray412[local13] == 3) {
				if (local23 <= local28) {
					return false;
				}
			} else if (arg0.anIntArray412[local13] == 4) {
				if (local28 == local23) {
					return false;
				}
			} else if (local23 != local28) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method1653() {
		if (Static98.anInt1878 == 10 && Static240.aBoolean369) {
			Static299.method4554(28);
		}
		if (Static98.anInt1878 == 30) {
			Static299.method4554(25);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILclient!og;ILclient!bf;I)V")
	public static void method1654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub2_Sub2 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(15) int local15 = (int) Static177.aFloat97 + Static35.anInt746 & 0x7FF;
		@Pc(27) int local27 = Math.max(arg2.anInt3567 / 2, arg2.anInt3595 / 2) + 10;
		@Pc(35) int local35 = arg1 * arg1 + arg0 * arg0;
		if (local27 * local27 < local35) {
			return;
		}
		@Pc(50) int local50 = Class135.anIntArray472[local15];
		@Pc(58) int local58 = local50 * 256 / (Static155.anInt2868 + 256);
		@Pc(62) int local62 = Class135.anIntArray474[local15];
		@Pc(70) int local70 = local62 * 256 / (Static155.anInt2868 + 256);
		@Pc(81) int local81 = local58 * arg1 + local70 * arg0 >> 16;
		@Pc(92) int local92 = arg1 * local70 - local58 * arg0 >> 16;
		if (Static240.aBoolean369) {
			((Class1_Sub2_Sub2_Sub2) arg4).method3189(arg2.anInt3567 / 2 + arg3 + local81 - arg4.anInt5109 / 2, -(arg4.anInt5113 / 2) + arg2.anInt3595 / 2 + arg5 + -local92, (Class1_Sub2_Sub2_Sub2) arg2.method2850(false));
		} else {
			((Class1_Sub2_Sub2_Sub1) arg4).method3940(arg2.anInt3567 / 2 + arg3 + local81 - arg4.anInt5109 / 2, arg2.anInt3595 / 2 + (arg5 - local92 - arg4.anInt5113 / 2), arg2.anIntArray417, arg2.anIntArray425);
		}
	}
}
