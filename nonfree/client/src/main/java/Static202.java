import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Lclient!eb;")
	public static Class23 aClass23_3;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[5][5000];

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Lclient!ba;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)J")
	public static long method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1677; local13++) {
			@Pc(19) Class54 local19 = local7.aClass54Array2[local13];
			if ((local19.aLong83 >> 29 & 0x3L) == 2L && local19.anInt2639 == arg1 && local19.anInt2632 == arg2) {
				return local19.aLong83;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
	public static int method1712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static106.aByteArrayArrayArray67[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static106.aByteArrayArrayArray67[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[B)Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 method1747(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(25) Class1_Sub2_Sub5_Sub4_Sub1 local25 = new Class1_Sub2_Sub5_Sub4_Sub1(arg0, Static111.anIntArray308, Static127.anIntArray364, Static138.anIntArray384, Static160.anIntArray328, Static61.anIntArray154, Static153.aByteArrayArray33);
			Static84.method1458();
			return local25;
		}
	}
}
