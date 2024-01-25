import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	public static int anInt8011 = -1;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString109 = null;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!qh;)Lclient!fba;")
	public static Class91_Sub1 method6768(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) Class91 local7 = Static12.method129(arg0);
		@Pc(11) int local11 = arg0.method3137();
		return new Class91_Sub1(local7.anInt2863, local7.aClass300_5, local7.aClass140_2, local7.anInt2858, local7.anInt2857, local11);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!r;IB)Lclient!daa;")
	public static Class58 method6773(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class197 local9 = Static88.method1976(true, arg1, arg0);
		return local9 == null ? null : local9.aClass58_9;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	public static boolean method6774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
