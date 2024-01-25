import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "[I")
	public static int[] anIntArray215;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	public static int anInt3098;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "J")
	public static long aLong115 = 0L;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public static int anInt3097 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I")
	public static int method2893() {
		if ((double) Static186.aFloat99 == 3.0D) {
			return 37;
		} else if ((double) Static186.aFloat99 == 4.0D) {
			return 50;
		} else if ((double) Static186.aFloat99 == 6.0D) {
			return 75;
		} else if ((double) Static186.aFloat99 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public static void method2894() {
		if (Static244.aClass14_2 != null) {
			Static244.aClass14_2.method5472();
		}
		if (Static112.aClass14_1 != null) {
			Static112.aClass14_1.method5472();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2895(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			local16 = Static17.method5328(arg0.charAt(local18)) + (local16 << 5) - local16;
		}
		return local16;
	}
}
