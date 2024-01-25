import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!saa", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray76 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!saa", name = "r", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_60 = new Class71();

	@OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
	public static final int anInt7979 = 1403;

	@OriginalMember(owner = "client!saa", name = "u", descriptor = "J")
	public static long aLong243 = -1L;

	@OriginalMember(owner = "client!saa", name = "w", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_143 = new Class133(110, 0);

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)V")
	public static void method6607(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 5);
		local8.method6212();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)I")
	public static int method6608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static65.anIntArray178[arg1 & 0x3] : 256;
	}
}
