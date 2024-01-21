import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public static int anInt1613;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!jd;")
	public static Class11 aClass11_67;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_648 = Static63.method1251("overlay_multiway");

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!mb;")
	private static Class45 aClass45_650 = Static63.method1251(" million");

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_649 = aClass45_650;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[Lclient!jc;")
	public static Class37[] aClass37Array1 = new Class37[4];

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public static int anInt1621 = 0;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class5_Sub6 local16 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg1);
		if (local16 == null) {
			local16 = new Class5_Sub6();
			Static87.aClass66_8.method1811((long) arg1, local16);
		}
		if (arg3 >= local16.anIntArray149.length) {
			@Pc(44) int[] local44 = new int[arg3 + 1];
			@Pc(49) int[] local49 = new int[arg3 + 1];
			for (@Pc(51) int local51 = 0; local51 < local16.anIntArray149.length; local51++) {
				local44[local51] = local16.anIntArray149[local51];
				local49[local51] = local16.anIntArray147[local51];
			}
			for (@Pc(81) int local81 = local16.anIntArray149.length; local81 < arg3; local81++) {
				local44[local81] = -1;
				local49[local81] = 0;
			}
			local16.anIntArray149 = local44;
			local16.anIntArray147 = local49;
		}
		local16.anIntArray149[arg3] = arg0;
		local16.anIntArray147[arg3] = arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method1116() {
		aByteArrayArrayArray4 = null;
		aClass37Array1 = null;
		aClass45_648 = null;
		aClass45_650 = null;
		aClass11_67 = null;
		aClass45_649 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 method1124() {
		@Pc(7) Class5_Sub2_Sub6_Sub3 local7 = new Class5_Sub2_Sub6_Sub3();
		local7.anInt2602 = Static89.anIntArray368[0];
		local7.anInt2600 = Static45.anInt1316;
		local7.anInt2598 = Static111.anIntArray440[0];
		local7.anInt2601 = Static64.anInt1855;
		local7.anInt2599 = Static110.anIntArray438[0];
		@Pc(32) byte[] local32 = Static16.aByteArrayArray2[0];
		local7.anInt2597 = Static104.anIntArray424[0];
		@Pc(43) int local43 = local7.anInt2599 * local7.anInt2597;
		local7.anIntArray377 = new int[local43];
		for (@Pc(56) int local56 = 0; local56 < local43; local56++) {
			local7.anIntArray377[local56] = Static7.anIntArray25[local32[local56] & 0xFF];
		}
		Static96.method1797();
		return local7;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)I")
	public static int method1126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class5_Sub6 local10 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray147.length) {
			return local10.anIntArray147[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	public static int method1127(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
