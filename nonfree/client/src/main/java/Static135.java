import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!go", name = "C", descriptor = "I")
	public static int anInt2831;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!go", name = "M", descriptor = "[B")
	public static final byte[] aByteArray34 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!go", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BILclient!kf;IZII)V")
	public static void method2140(@OriginalArg(1) int arg0, @OriginalArg(2) Class128 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static319.anInt1933 >= 50 || (arg1 == null || arg1.anIntArrayArray26 == null || arg0 >= arg1.anIntArrayArray26.length || arg1.anIntArrayArray26[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray26[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(46) int local46 = local32 & 0x1F;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray26[arg0].length > 1) {
			local65 = (int) ((double) arg1.anIntArrayArray26[arg0].length * Math.random());
			if (local65 > 0) {
				local36 = arg1.anIntArrayArray26[arg0][local65];
			}
		}
		if (local46 == 0) {
			if (arg3) {
				Static442.method5816(0, 255, local36, local42);
			}
		} else if (Static374.aClass20_Sub1_1.anInt2349 != 0) {
			local65 = arg4 - 64 >> 7;
			@Pc(111) int local111 = arg2 - 64 >> 7;
			Static25.aClass219Array1[Static319.anInt1933++] = new Class219((byte) 1, local36, local42, 0, 255, local46 + (local65 << 16) + (arg5 << 24) + (local111 << 8));
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!ag;)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub1 arg3) {
		@Pc(4) Class118 local4 = Static450.method5835(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass7_Sub1_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!bu;)V")
	public static void method2144(@OriginalArg(1) Class32 arg0) {
		Static367.anInt6181 = arg0.method807("p11_full");
		Static387.anInt6464 = arg0.method807("p12_full");
		Static230.anInt4275 = arg0.method807("b12_full");
		Static60.anInt1568 = arg0.method807("hitmarks");
		Static272.anInt6025 = arg0.method807("hitbar_default");
		Static56.anInt1518 = arg0.method807("timerbar_default");
		Static123.anInt2626 = arg0.method807("headicons_pk");
		Static31.anInt6065 = arg0.method807("headicons_prayer");
		Static247.anInt4704 = arg0.method807("hint_headicons");
		Static90.anInt2163 = arg0.method807("hint_mapmarkers");
		Static165.anInt3381 = arg0.method807("mapflag");
		Static399.anInt6607 = arg0.method807("cross");
		Static249.anInt4739 = arg0.method807("mapdots");
		Static19.anInt480 = arg0.method807("scrollbar");
		Static246.anInt4692 = arg0.method807("name_icons");
		Static138.anInt2892 = arg0.method807("floorshadows");
		Static332.anInt5708 = arg0.method807("compass");
		Static52.anInt1375 = arg0.method807("otherlevel");
		Static257.anInt4899 = arg0.method807("hint_mapedge");
	}
}
