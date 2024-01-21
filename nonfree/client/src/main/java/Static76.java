import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_17;

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "I")
	public static int anInt1501;

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_5;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
	public static int anInt1503;

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_735 = Static193.method3027("Please use a different world)3");

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lclient!oc;")
	public static Class70 aClass70_732 = aClass70_735;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_733 = Static193.method3027("(U0a )2 via: ");

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_734 = aClass70_735;

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "[I")
	public static final int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "[I")
	public static final int[] anIntArray81 = new int[2048];

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_16 = new Class85(128);

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_736 = Static193.method3027("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_737 = Static193.method3027("<img=1>");

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
	public static int anInt1502 = 0;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
	public static void method1101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static8.anInt186 != 0 && arg0 != -1) {
			Static209.method3300(Static40.aClass52_Sub1_7, Static8.anInt186, arg0);
			Static80.aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public static void method1102() {
		Static67.aClass85_31.method2557();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)Z")
	public static boolean method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static77.anInt1522 + arg0 * Static71.anInt1416 >> 16;
		@Pc(19) int local19 = arg3 * Static71.anInt1416 - arg0 * Static77.anInt1522 >> 16;
		@Pc(29) int local29 = arg1 * Static113.anInt2292 + local19 * Static204.anInt4161 >> 16;
		@Pc(39) int local39 = arg1 * Static204.anInt4161 - local19 * Static113.anInt2292 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static113.anInt2292 + local19 * Static204.anInt4161 >> 16;
		@Pc(76) int local76 = arg2 * Static204.anInt4161 - local19 * Static113.anInt2292 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static163.anInt3325 && local87 < Static163.anInt3325) {
			return false;
		} else if (local50 > Static205.anInt4176 && local87 > Static205.anInt4176) {
			return false;
		} else if (local56 < Static192.anInt3907 && local93 < Static192.anInt3907) {
			return false;
		} else {
			return local56 <= Static8.anInt190 || local93 <= Static8.anInt190;
		}
	}
}
