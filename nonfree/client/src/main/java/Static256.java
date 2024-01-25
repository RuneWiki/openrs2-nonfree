import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
	public static int anInt4375;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "B")
	public static byte aByte44;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[1];

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	public static int anInt4374 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public static void method3946() {
		@Pc(7) Class142 local7 = null;
		try {
			@Pc(12) Class249 local12 = Static165.aClass103_3.method2363("2");
			while (local12.anInt6929 == 0) {
				Static170.method1617(1L);
			}
			if (local12.anInt6929 == 1) {
				local7 = (Class142) local12.anObject10;
				@Pc(39) byte[] local39 = new byte[(int) local7.method3270()];
				@Pc(54) int local54;
				for (@Pc(41) int local41 = 0; local41 < local39.length; local41 += local54) {
					local54 = local7.method3266(local39, local41, local39.length - local41);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static234.method3676(new Class6_Sub15(local39));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method3267();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V")
	public static void method3947() {
		Static434.aClass220_56.method4987();
		Static253.aClass220_38.method4987();
		Static260.aClass220_39.method4987();
		Static141.aClass220_17.method4987();
		Static93.aClass220_11.method4987();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BIII)I")
	public static int method3949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg2;
		} else if (local15 == 1) {
			return arg0;
		} else if (local15 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
