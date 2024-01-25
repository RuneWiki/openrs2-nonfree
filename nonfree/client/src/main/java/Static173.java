import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!go", name = "R", descriptor = "I")
	public static int anInt3656;

	@OriginalMember(owner = "client!go", name = "C", descriptor = "I")
	public static int anInt3645 = -1;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	public static int anInt3651 = 0;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_23 = new Class344(53, 8);

	@OriginalMember(owner = "client!go", name = "P", descriptor = "I")
	public static int anInt3654 = 0;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "Lclient!uea;")
	public static final Class326 aClass326_3 = new Class326("WTWIP", 3);

	@OriginalMember(owner = "client!go", name = "U", descriptor = "I")
	public static int anInt3657 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!vj;)V")
	public static void method2881(@OriginalArg(0) Class21_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static137.anIntArray143[local4]; local7++) {
				if (Static48.aClass21_Sub1ArrayArray4[local4][local7] == arg0) {
					Static599.method3061(Static48.aClass21_Sub1ArrayArray4[local4], local7 + 1, Static48.aClass21_Sub1ArrayArray4[local4], local7, Static137.anIntArray143[local4] - local7 - 1);
					local37 = Static137.anIntArray143[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static254.anIntArray281[local4]; local49++) {
				if (Static338.aClass21_Sub1ArrayArray2[local4][local49] == arg0) {
					Static599.method3061(Static338.aClass21_Sub1ArrayArray2[local4], local49 + 1, Static338.aClass21_Sub1ArrayArray2[local4], local49, Static254.anIntArray281[local4] - local49 - 1);
					local37 = Static254.anIntArray281[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static27.anIntArray195[local4]; local91++) {
				if (Static375.aClass21_Sub1ArrayArray3[local4][local91] == arg0) {
					Static599.method3061(Static375.aClass21_Sub1ArrayArray3[local4], local91 + 1, Static375.aClass21_Sub1ArrayArray3[local4], local91, Static27.anIntArray195[local4] - local91 - 1);
					local37 = Static27.anIntArray195[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)Z")
	public static boolean method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!r;Lclient!au;II)V")
	public static void method2886(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class22 arg1) {
		Static308.aClass22_40.method886();
		if (Static137.aBoolean227) {
			return;
		}
		for (@Pc(27) Class4_Sub20 local27 = (Class4_Sub20) arg1.method895(); local27 != null; local27 = (Class4_Sub20) arg1.method889()) {
			@Pc(35) Class288 local35 = Static572.aClass121_4.method2676(local27.anInt3266);
			if (Static292.method4718(local35)) {
				@Pc(47) boolean local47 = Static149.method2567(local27, local35, arg0);
				if (local47) {
					Static29.method959(local35, arg0, local27);
				}
			}
		}
	}
}
