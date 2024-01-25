import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public static int anInt641;

	// $FF: synthetic field
	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/lang/Class;")
	private static Class aClass9;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_19 = new Class225(66, -1);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
	public static void method624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class350[] local7 = Static690.aClass350Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class350 local15 = local7[local9];
			if (local15 != null && local15.anInt9441 == 2) {
				Static531.method7478(arg2 >> 1, local15.anInt9443, arg3 >> 1, local15.anInt9436, local15.anInt9444 * 2, local15.anInt9434);
				if (Static189.anIntArray243[0] > -1 && Static528.anInt8386 % 20 < 10) {
					@Pc(66) Class43 local66 = Static22.aClass43Array3[local15.anInt9437];
					@Pc(74) int local74 = arg0 + Static189.anIntArray243[0] - 12;
					@Pc(82) int local82 = Static189.anIntArray243[1] + arg1 - 28;
					local66.method9588(local74, local82);
					Static5.method72(local66.method9600() + local82, local82, local66.method9587() + local74, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)I")
	public static int method625(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/io/File;ZI)V")
	public static void method627(@OriginalArg(0) File arg0) {
		if (Static654.anObject16 == null) {
			Static534.method7496();
		}
		try {
			@Pc(21) Class local21 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(47) Method local47 = local21.getDeclaredMethod("dumpHeap", aClass9 == null ? (aClass9 = Class38.a("java.lang.String")) : aClass9, Boolean.TYPE);
			local47.invoke(Static654.anObject16, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(67) Exception local67) {
			System.out.println("HeapDump error:");
			local67.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIB)V")
	public static void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(109) Class311 local109 = Static632.aClass311ArrayArrayArray3[arg1][arg2][arg3];
			if (local109 != null) {
				if (arg0 == 1) {
					local109.aShort114 = 0;
				} else if (arg0 == 2) {
					local109.aShort111 = 0;
				}
			}
			Static161.method2381();
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static670.anInt10425; local17++) {
			@Pc(23) Class252 local23 = Static449.aClass252Array4[local17];
			if (local23.aByte84 == arg0 && local23.aShort88 == arg2 && local23.aShort89 == arg3 || arg2 == local23.aShort87 && arg3 == local23.aShort89) {
				if (local17 != Static670.anInt10425) {
					Static728.method269(Static449.aClass252Array4, local17 + 1, Static449.aClass252Array4, local17, Static449.aClass252Array4.length - local17 - 1);
				}
				Static670.anInt10425--;
				return;
			}
		}
	}
}
