import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt3187;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public static int anInt3202;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1801 = Static28.method504("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!we", name = "E", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1804 = Static28.method504("Existing User");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1802 = aClass39_1804;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1803 = Static28.method504("Please reload this page)3");

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array23 = new Class39[200];

	@OriginalMember(owner = "client!we", name = "x", descriptor = "J")
	public static volatile long aLong158 = 0L;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public static int anInt3205 = 0;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	public static int anInt3206 = 0;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!we", name = "C", descriptor = "[I")
	public static int[] anIntArray367 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1805 = aClass39_1803;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2229() {
		anIntArray367 = null;
		aClass39_1804 = null;
		aClass39_1801 = null;
		aClass39_1805 = null;
		aBooleanArray19 = null;
		aByteArrayArrayArray7 = null;
		aClass39_1802 = null;
		aClass39_1803 = null;
		aClass39Array23 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILclient!ka;I[B[Lclient!we;BII)V")
	public static void method2230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class81[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class4_Sub16 local12 = new Class4_Sub16(arg6);
		while (true) {
			@Pc(21) int local21 = local12.method1450();
			if (local21 == 0) {
				return;
			}
			local7 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local12.method1450();
				if (local36 == 0) {
					break;
				}
				@Pc(45) int local45 = local12.method1474();
				local32 += local36 - 1;
				@Pc(55) int local55 = local32 & 0x3F;
				@Pc(59) int local59 = local32 >> 12;
				@Pc(65) int local65 = local32 >> 6 & 0x3F;
				@Pc(69) int local69 = local45 >> 2;
				@Pc(73) int local73 = local45 & 0x3;
				if (arg3 == local59 && arg9 <= local65 && local65 < arg9 + 8 && local55 >= arg2 && local55 < arg2 + 8) {
					@Pc(118) Class4_Sub2_Sub10 local118 = Static73.method1207(local7);
					@Pc(136) int local136 = arg5 + Static60.method1070(local65 & 0x7, local118.anInt1410, arg0, local73, local55 & 0x7, local118.anInt1413);
					@Pc(155) int local155 = Static98.method680(local65 & 0x7, local118.anInt1410, local118.anInt1413, local55 & 0x7, local73, arg0) + arg1;
					if (local136 > 0 && local155 > 0 && local136 < 103 && local155 < 103) {
						@Pc(174) int local174 = arg8;
						if ((aByteArrayArrayArray7[1][local136][local155] & 0x2) == 2) {
							local174 = arg8 - 1;
						}
						@Pc(188) Class81 local188 = null;
						if (local174 >= 0) {
							local188 = arg7[local174];
						}
						Static23.method430(arg8, local188, local155, local136, local73 + arg0 & 0x3, local7, arg4, local69);
					}
				}
			}
		}
	}
}
