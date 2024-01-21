import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!me", name = "Tc", descriptor = "Lclient!i;")
	public static Class29 aClass29_45 = new Class29(30);

	@OriginalMember(owner = "client!me", name = "Yc", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!me", name = "Zc", descriptor = "Lclient!va;")
	private static Class61 aClass61_700 = Static88.method1421("Loaded textures");

	@OriginalMember(owner = "client!me", name = "ad", descriptor = "Lclient!va;")
	public static Class61 aClass61_701 = aClass61_700;

	@OriginalMember(owner = "client!me", name = "bd", descriptor = "Lclient!va;")
	private static Class61 aClass61_702 = Static88.method1421("Please try using a different world)3");

	@OriginalMember(owner = "client!me", name = "cd", descriptor = "Lclient!va;")
	public static Class61 aClass61_703 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "dd", descriptor = "Lclient!va;")
	public static Class61 aClass61_704 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "ed", descriptor = "Lclient!va;")
	public static Class61 aClass61_705 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "fd", descriptor = "I")
	public static int anInt1710 = 0;

	@OriginalMember(owner = "client!me", name = "gd", descriptor = "Lclient!va;")
	public static Class61 aClass61_706 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "hd", descriptor = "Lclient!va;")
	public static Class61 aClass61_707 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "id", descriptor = "I")
	public static int anInt1711 = 0;

	@OriginalMember(owner = "client!me", name = "jd", descriptor = "Lclient!va;")
	public static Class61 aClass61_708 = aClass61_702;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(IIII)Z")
	public static boolean method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static48.aClass54_1.method1365(Static101.anInt2582, arg2, arg0, arg1);
		@Pc(23) int local23 = arg1 >> 14 & 0x7FFF;
		if (local8 == -1) {
			return false;
		}
		@Pc(33) int local33 = local8 & 0x1F;
		@Pc(39) int local39 = local8 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(52) Class10_Sub1_Sub10 local52 = Static18.method405(local23);
			@Pc(65) int local65;
			@Pc(68) int local68;
			if (local39 == 0 || local39 == 2) {
				local65 = local52.anInt1369;
				local68 = local52.anInt1378;
			} else {
				local68 = local52.anInt1369;
				local65 = local52.anInt1378;
			}
			@Pc(79) int local79 = local52.anInt1381;
			if (local39 != 0) {
				local79 = (local79 >> 4 - local39) + (local79 << local39 & 0xF);
			}
			Static95.method1509(true, arg0, local68, local79, 2, 0, local65, arg2, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
		} else {
			Static95.method1509(true, arg0, 0, 0, 2, local39, 0, arg2, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], local33 + 1, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
		}
		Static55.anInt1487 = Static12.anInt333;
		Static9.anInt303 = 2;
		Static80.anInt2157 = Static67.anInt1776;
		Static33.anInt987 = 0;
		return true;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
	public static void method931() {
		aClass61_707 = null;
		aClass61_704 = null;
		aClass61_700 = null;
		aClass61_702 = null;
		aClass61_705 = null;
		aClass61_701 = null;
		aClass61_708 = null;
		aClass29_45 = null;
		aClass61_703 = null;
		aCRC32_2 = null;
		aClass61_706 = null;
	}
}
