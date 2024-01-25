import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public static int anInt4444;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!np", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[520];

	@OriginalMember(owner = "client!np", name = "C", descriptor = "[I")
	public static final int[] anIntArray347 = new int[3];

	@OriginalMember(owner = "client!np", name = "I", descriptor = "I")
	public static final int anInt4458 = 1407;

	@OriginalMember(owner = "client!np", name = "J", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)Lclient!cl;")
	public static Class5_Sub8 method3546() {
		if (Static98.aClass177_19 == null || Static264.aClass142_1 == null) {
			return null;
		}
		Static264.aClass142_1.method2961(Static98.aClass177_19);
		@Pc(23) Class5_Sub8 local23 = (Class5_Sub8) Static264.aClass142_1.method2954();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class6 local33 = Static98.aClass28_3.method670(local23.anInt953);
			return local33 != null && local33.aBoolean26 && local33.method92(Static98.anInterface9_2) ? local23 : Static127.method1774();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Lclient!so;")
	public static Class2_Sub2 method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub2_3;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([BB)[B")
	public static byte[] method3549(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static468.method3858(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3550(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
