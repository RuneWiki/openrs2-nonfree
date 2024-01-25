import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!o;")
	public static Class85 aClass85_6;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_13 = new Class242(63, 2);

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IJ)V")
	public static void method681(@OriginalArg(1) long arg0) {
		if (Static259.aClass216ArrayArrayArray3 != null) {
			if (Static139.anInt2147 == 1 || Static139.anInt2147 == 5) {
				Static130.method1645(arg0);
			} else if (Static139.anInt2147 == 4) {
				Static89.method1061(arg0);
			}
		}
		Static244.method232((long) Static98.anInt1304, Static186.aClass117_3);
		if (Static118.anInt1785 != -1) {
			Static425.method5421(Static118.anInt1785);
		}
		for (@Pc(43) int local43 = 0; local43 < Static88.anInt1187; local43++) {
			if (Static179.aBooleanArray69[local43]) {
				Static150.aBooleanArray107[local43] = true;
			}
			Static106.aBooleanArray162[local43] = Static179.aBooleanArray69[local43];
			Static179.aBooleanArray69[local43] = false;
		}
		Static378.anInt6079 = Static98.anInt1304;
		if (Static186.aClass117_3.method5689()) {
			Static223.aBoolean510 = true;
		}
		if (Static118.anInt1785 != -1) {
			Static88.anInt1187 = 0;
			Static224.method3209();
		}
		Static186.aClass117_3.va();
		Static156.method2075(Static186.aClass117_3);
		@Pc(93) int local93 = Static82.method1006();
		if (local93 == -1) {
			local93 = Static211.anInt5191;
		}
		if (local93 == -1) {
			local93 = Static379.anInt122;
		}
		Static462.method5972(local93);
		Static125.method1540(Static71.anInt1041, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
		Static71.anInt1041 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)I")
	public static int method682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static278.aByteArrayArrayArray16[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static278.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method684(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg1, 3);
		local8.method384();
		local8.aString4 = arg0;
	}
}
