import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!op;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[Lclient!va;")
	public static Class355[] aClass355Array2;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_13 = new Class46(81, 3);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!uw;II)Z")
	public static boolean method767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static437.aBoolean537 || !Static631.aBoolean753) {
			return false;
		} else if (Static192.anInt3358 < 100) {
			return false;
		} else if (Static463.method6855(arg2, arg0, arg3)) {
			@Pc(26) int local26 = arg0 << Static115.anInt2156;
			@Pc(40) int local40 = arg3 << Static115.anInt2156;
			@Pc(52) int local52 = Static11.aClass61Array1[arg2].method8580(arg3, arg0) - 1;
			@Pc(58) int local58 = arg1.method8734() + local52;
			if (arg1.aShort89 == 1) {
				if (!Static606.method8668(local52, local26, local40, local58, local26, local58, local26, local40 + Static302.anInt5267, local40)) {
					return false;
				} else if (Static606.method8668(local52, local26, local40, local52, local26, local58, local26, Static302.anInt5267 + local40, Static302.anInt5267 + local40)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 2) {
				if (!Static606.method8668(local52, local26 + Static302.anInt5267, Static302.anInt5267 + local40, local58, local26, local58, local26, Static302.anInt5267 + local40, local40 - -Static302.anInt5267)) {
					return false;
				} else if (Static606.method8668(local52, local26 + Static302.anInt5267, local40 + Static302.anInt5267, local58, local26 + Static302.anInt5267, local52, local26, Static302.anInt5267 + local40, local40 - -Static302.anInt5267)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 4) {
				if (!Static606.method8668(local52, local26 + Static302.anInt5267, local40, local58, Static302.anInt5267 + local26, local58, Static302.anInt5267 + local26, local40 + Static302.anInt5267, local40)) {
					return false;
				} else if (Static606.method8668(local52, Static302.anInt5267 + local26, local40, local52, local26 + Static302.anInt5267, local58, local26 + Static302.anInt5267, Static302.anInt5267 + local40, Static302.anInt5267 + local40)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 8) {
				if (!Static606.method8668(local52, local26 + Static302.anInt5267, local40, local58, local26, local58, local26, local40, local40)) {
					return false;
				} else if (Static606.method8668(local52, local26 + Static302.anInt5267, local40, local58, Static302.anInt5267 + local26, local52, local26, local40, local40)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 16) {
				if (Static475.method7024(Static147.anInt2575, Static147.anInt2575 + local40, local52, Static147.anInt2575, local26, local58)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 32) {
				if (Static475.method7024(Static147.anInt2575, Static147.anInt2575 + local40, local52, Static147.anInt2575, local26 + Static147.anInt2575, local58)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 == 64) {
				if (Static475.method7024(Static147.anInt2575, local40, local52, Static147.anInt2575, local26 + Static147.anInt2575, local58)) {
					Static139.anInt2426++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort89 != 128) {
				return true;
			} else if (Static475.method7024(Static147.anInt2575, local40, local52, Static147.anInt2575, local26, local58)) {
				Static139.anInt2426++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
