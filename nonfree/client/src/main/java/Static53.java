import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
	public static int anInt1661;

	@OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
	public static int anInt1668;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "[S")
	public static final short[] aShortArray30 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_382 = Static158.method3034("hint_mapmarkers");

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
	public static int anInt1659 = -1;

	@OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
	public static int anInt1666 = -1;

	@OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
	public static int anInt1670 = 0;

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_383 = Static158.method3034("T");

	@OriginalMember(owner = "client!fc", name = "Jb", descriptor = "I")
	public static int anInt1685 = -1;

	@OriginalMember(owner = "client!fc", name = "Pb", descriptor = "I")
	public static final int anInt1690 = 0;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	public static void method1249() {
		if (Static155.anIntArray438 != null && Static122.anIntArray389 != null) {
			return;
		}
		Static122.anIntArray389 = new int[256];
		Static155.anIntArray438 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static155.anIntArray438[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static122.anIntArray389[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	public static void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class47[] local11 = Static177.aClass47Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class47 local19 = local11[local13];
			if (local19 != null && local19.anInt2856 == 2) {
				Static112.method2466(local19.anInt2854 * 2, (local19.anInt2855 - Static76.anInt2317 << 7) + local19.anInt2859, local19.anInt2862 + (-Static76.anInt2319 + local19.anInt2857 << 7));
				if (Static15.anInt507 > -1 && Static20.anInt580 % 20 < 10) {
					Static63.aClass2_Sub1_Sub7_Sub4Array5[local19.anInt2860].method2151(Static15.anInt507 + arg1 - 12, Static108.anInt3083 + arg0 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
	public static int method1255(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
