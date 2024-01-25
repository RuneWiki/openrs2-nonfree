import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!lm;")
	public static Class159 aClass159_1;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_97 = new Class15("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_98 = new Class15("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	public static final int anInt5412 = 52;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4387(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBZ)V")
	public static void method4388(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class4_Sub25 local10 = Static242.method3222(arg1, arg0);
		if (local10 != null) {
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray345.length; local23++) {
				local10.anIntArray345[local23] = -1;
				local10.anIntArray344[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public static void method4389(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(9, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZLclient!wg;)I")
	public static int method4391(@OriginalArg(1) Class8_Sub3_Sub1_Sub2 arg0) {
		@Pc(8) Class78 local8 = arg0.aClass78_1;
		if (local8.anIntArray145 != null) {
			local8 = local8.method1547(Static52.aClass81_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt1882;
		@Pc(32) Class42 local32 = arg0.method5892();
		if (arg0.aBoolean519) {
			local23 = local8.anInt1915;
		} else if (local32.anInt1010 == arg0.anInt7389 || arg0.anInt7389 == local32.anInt1027 || local32.anInt1029 == arg0.anInt7389 || local32.anInt1015 == arg0.anInt7389) {
			local23 = local8.anInt1901;
		} else if (arg0.anInt7389 == local32.anInt1009 || arg0.anInt7389 == local32.anInt1037 || local32.anInt1025 == arg0.anInt7389 || arg0.anInt7389 == local32.anInt1048) {
			local23 = local8.anInt1907;
		}
		return local23;
	}
}
