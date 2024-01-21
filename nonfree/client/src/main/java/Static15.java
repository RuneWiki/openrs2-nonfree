import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
	public static int[] anIntArray67 = new int[4000];

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_180 = Static169.method2903("<col=ffff00>");

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_181 = Static169.method2903("p11_full");

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_182 = Static169.method2903("<col=ffffff>");

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_183 = Static169.method2903("title)3jpg");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
	public static int method267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ga;BII)[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] method268(@OriginalArg(0) Class30 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static162.method2822(arg1, arg2, arg0) ? Static14.method261() : null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lclient!qh;III[BIBIII)V")
	public static void method269(@OriginalArg(0) Class69[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if (arg6 + local12 > 0 && arg6 + local12 < 103 && local16 + arg8 > 0 && arg8 + local16 < 103) {
					arg0[arg5].anIntArrayArray33[arg6 + local12][local16 + arg8] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(86) Class1_Sub8 local86 = new Class1_Sub8(arg4);
		for (@Pc(88) int local88 = 0; local88 < 4; local88++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					if (arg1 == local88 && arg2 <= local92 && local92 < arg2 + 8 && local96 >= arg3 && local96 < arg3 + 8) {
						Static115.method2046(arg8 + Static82.method1446(local92 & 0x7, arg7, local96 & 0x7), local86, arg7, 0, 0, arg6 + Static71.method1275(local92 & 0x7, local96 & 0x7, arg7), arg5);
					} else {
						Static115.method2046(-1, local86, 0, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method270() {
		aClass23_181 = null;
		aClass23_183 = null;
		aClass23_180 = null;
		aClass23_182 = null;
		anIntArray67 = null;
	}
}
