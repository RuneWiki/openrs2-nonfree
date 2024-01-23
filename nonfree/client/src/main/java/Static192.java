import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
	public static int anInt4156;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "Lclient!ba;")
	public static Class11 aClass11_36;

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lclient!mb;")
	public static Class70 aClass70_40;

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "I")
	public static int anInt4167;

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1430 = Static64.method1101("overlay2)3dat");

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "Lclient!ie;")
	public static Class53 aClass53_25 = new Class53(64);

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
	public static int anInt4159 = 1;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
	public static int anInt4164 = 0;

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
	public static int anInt4165 = 0;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1431 = Static64.method1101(")4g");

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1432 = Static64.method1101("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!ta", name = "vb", descriptor = "I")
	public static int anInt4170 = 0;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "[S")
	public static short[] aShortArray45 = new short[256];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method3222() {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = -1; local3 < Static118.anInt2542; local3++) {
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static79.anIntArray111[local3];
			}
			@Pc(20) Class5_Sub1_Sub1 local20 = Static191.aClass5_Sub1_Sub1Array1[local12];
			if (local20 != null && local20.anInt3594 > 0) {
				local20.anInt3594--;
				if (local20.anInt3594 == 0) {
					local20.aClass51_1249 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static58.anInt1372; local12++) {
			@Pc(56) int local56 = Static202.anIntArray326[local12];
			@Pc(60) Class5_Sub1_Sub2 local60 = Static168.aClass5_Sub1_Sub2Array1[local56];
			if (local60 != null && local60.anInt3594 > 0) {
				local60.anInt3594--;
				if (local60.anInt3594 == 0) {
					local60.aClass51_1249 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBI)V")
	public static void method3223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static225.anInt4729 && arg1 <= Static122.anInt2710) {
			@Pc(23) int local23 = Static28.method525(Static149.anInt3252, arg0, Static160.anInt3454);
			@Pc(29) int local29 = Static28.method525(Static149.anInt3252, arg3, Static160.anInt3454);
			Static183.method3094(local23, arg1, arg2, local29);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[B)I")
	public static int method3226(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static2.method61(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!mb;Lclient!mb;)V")
	public static void method3227(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		Static21.aClass70_8 = arg0;
		Static211.aClass70_42 = arg1;
	}
}
