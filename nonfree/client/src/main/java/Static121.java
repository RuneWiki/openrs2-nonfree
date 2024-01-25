import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hl", name = "Jb", descriptor = "Lclient!tj;")
	public static Class193 aClass193_85;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString54 = "";

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!hl", name = "Sb", descriptor = "I")
	public static int anInt4966 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIBI)I")
	public static int method4332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - Class118_Sub1.anIntArray317[arg2 * 8192 / arg3] >> 1;
		return ((65536 - local22) * arg0 >> 16) + (arg1 * local22 >> 16);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!tj;Lclient!tj;I)I")
	public static int method4343(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method5064(Static225.anInt4567)) {
			local5++;
		}
		if (arg0.method5064(Static281.anInt5557)) {
			local5++;
		}
		if (arg0.method5064(Static97.anInt2524)) {
			local5++;
		}
		if (arg1.method5064(Static225.anInt4567)) {
			local5++;
		}
		if (arg1.method5064(Static281.anInt5557)) {
			local5++;
		}
		if (arg1.method5064(Static97.anInt2524)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)V")
	public static void method4345() {
		@Pc(16) int[] local16 = new int[Static2.anInt58];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static2.anInt58; local20++) {
			@Pc(26) Class210 local26 = Static177.method3465(local20);
			if (local26.anInt6512 >= 0 || local26.anInt6471 >= 0) {
				local16[local18++] = local20;
			}
		}
		Static315.anIntArray478 = new int[local18];
		for (@Pc(53) int local53 = 0; local53 < local18; local53++) {
			Static315.anIntArray478[local53] = local16[local53];
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
	public static void method4348() {
		@Pc(13) Class198 local13 = Static86.aClass198_74;
		synchronized (Static86.aClass198_74) {
			Static86.aClass198_74.method5202(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)Z")
	public static boolean method4351() {
		@Pc(13) Class4_Sub39 local13 = (Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251;
		if (local13 == null || Static58.aClass116_7.aClass4_121 == local13) {
			return false;
		} else {
			if (local13.anInt5716 >= 2000) {
				local13.anInt5716 -= 2000;
			}
			return local13.anInt5716 == 1008;
		}
	}
}
