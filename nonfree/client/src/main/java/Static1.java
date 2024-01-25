import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString1 = "glow2:";

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public static int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Z")
	public static final boolean aBoolean4 = false;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt9 = 1;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lclient!ul;")
	public static Class3_Sub7_Sub21 method1(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static355.aClass198_63;
		@Pc(19) Class3_Sub7_Sub21 local19;
		synchronized (Static355.aClass198_63) {
			local19 = (Class3_Sub7_Sub21) Static355.aClass198_63.method5242((long) arg0);
			if (local19 == null) {
				local19 = new Class3_Sub7_Sub21(arg0);
				Static355.aClass198_63.method5231((long) arg0, local19);
			}
		}
		synchronized (local19) {
			return local19.method5288() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)V")
	public static void method4(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static160.aByteArrayArrayArray9 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method6() {
		for (@Pc(7) int local7 = 0; local7 < Static58.aClass184ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static58.aClass184ArrayArray1[local7].length; local11++) {
				Static58.aClass184ArrayArray1[local7][local11] = Static168.aClass184_1;
			}
		}
	}
}
