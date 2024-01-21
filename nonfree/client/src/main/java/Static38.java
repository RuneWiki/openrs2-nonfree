import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	public static int anInt1005;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!fd;")
	public static Class24 aClass24_11;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!fd;")
	public static Class24 aClass24_12;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
	public static int[] anIntArray98 = new int[500];

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_531 = Static69.method1231("::fpsoff");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
	public static int[] anIntArray99 = new int[] { 0, 8, 0, 0, 0, 0, 0, 0, -2, 0, 7, 0, 0, 0, 6, 6, -2, 0, -2, 0, 5, 5, 5, 0, 4, 24, 4, 0, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, -2, 0, 0, 15, 4, 14, 0, 0, -2, 0, 0, 10, 3, 0, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, -2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, -1, 0, 0, 0, 2, 0, 6, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 6, 0, 0, 8, 0, 11, 0, 0, 3, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 7, 12, 0, -2, 0, 0, 0, 0, 0, 0, 6, 6, 0, 5, 0, 0, -1, 0, 3, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 0, 1, -2, 2, 0, 0, -1, 0, 2, 0, 0, 4, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 4, 0, 0, 0 };

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!je;")
	public static Class40 aClass40_532 = Static69.method1231("mapscene");

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_5 = null;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method682() {
		Static40.anIntArray108 = new int[104];
		Static68.anIntArray182 = new int[104];
		Static64.anIntArrayArrayArray5 = new int[4][105][105];
		Static48.aByteArrayArrayArray8 = new byte[4][104][104];
		Static33.aByteArrayArrayArray11 = new byte[4][104][104];
		Static84.anIntArray245 = new int[104];
		Static34.anIntArray94 = new int[104];
		Static63.aByteArrayArrayArray2 = new byte[4][104][104];
		Static133.anIntArray377 = new int[104];
		Static64.anIntArrayArray19 = new int[105][105];
		Static21.aByteArrayArrayArray5 = new byte[4][104][104];
		Static1.anInt13 = 99;
		Static87.aByteArrayArrayArray9 = new byte[4][105][105];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I")
	public static int method683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(25) int local25 = method683(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local25 *= arg0;
			}
			return local25;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public static void method684(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray266.length; local21++) {
				local12.anIntArray266[local21] = -1;
				local12.anIntArray265[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method685() {
		aClass24_12 = null;
		anIntArray99 = null;
		aClass24_11 = null;
		aClass40_532 = null;
		aClass40_531 = null;
		anIntArray98 = null;
		aClass2_Sub13_5 = null;
		aClass2_Sub1_Sub2_Sub1_7 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lclient!cc;")
	public static Class2_Sub1_Sub3 method686(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub3 local10 = (Class2_Sub1_Sub3) Static75.aClass55_54.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static19.aClass24_7.method1931(arg0, 1);
		local10 = new Class2_Sub1_Sub3();
		if (local20 != null) {
			local10.method231(new Class2_Sub9(local20), arg0);
		}
		local10.method236();
		Static75.aClass55_54.method1411((long) arg0, local10);
		return local10;
	}
}
