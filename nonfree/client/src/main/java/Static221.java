import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ku", name = "A", descriptor = "Lclient!vu;")
	public static Class260 aClass260_3;

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "Lclient!dk;")
	public static Class54 aClass54_67;

	@OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
	public static int anInt3653;

	@OriginalMember(owner = "client!ku", name = "W", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_85 = new Class211(29, 7);

	@OriginalMember(owner = "client!ku", name = "cb", descriptor = "[Lclient!jp;")
	public static final Class128[] aClass128Array2 = new Class128[14];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)Z")
	public static boolean method2935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)V")
	public static void method2939() {
		Static382.aStringArray35 = new String[500];
		Static179.anInt3077 = Static278.aClass141_8.anInt3614 + Static278.aClass141_8.anInt3623 + 2;
		Static74.anInt1417 = Static241.aClass141_5.anInt3623 + Static241.aClass141_5.anInt3614 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static382.aStringArray35.length; local30++) {
			Static382.aStringArray35[local30] = "";
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZLclient!at;II)V")
	public static void method2940(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg2.anInt294;
		if (arg2.aByte1 == 0) {
			arg2.anInt294 = arg2.anInt274;
		} else if (arg2.aByte1 == 1) {
			arg2.anInt294 = arg3 - arg2.anInt274;
		} else if (arg2.aByte1 == 2) {
			arg2.anInt294 = arg3 * arg2.anInt274 >> 14;
		}
		@Pc(51) int local51 = arg2.anInt285;
		if (arg2.aByte2 == 0) {
			arg2.anInt285 = arg2.anInt259;
		} else if (arg2.aByte2 == 1) {
			arg2.anInt285 = arg0 - arg2.anInt259;
		} else if (arg2.aByte2 == 2) {
			arg2.anInt285 = arg2.anInt259 * arg0 >> 14;
		}
		if (arg2.aByte1 == 4) {
			arg2.anInt294 = arg2.anInt285 * arg2.anInt254 / arg2.anInt333;
		}
		if (arg2.aByte2 == 4) {
			arg2.anInt285 = arg2.anInt294 * arg2.anInt333 / arg2.anInt254;
		}
		if (Static95.aBoolean158 && (Static55.method815(arg2).anInt1904 != 0 || arg2.anInt298 == 0)) {
			if (arg2.anInt285 < 5 && arg2.anInt294 < 5) {
				arg2.anInt285 = 5;
				arg2.anInt294 = 5;
			} else {
				if (arg2.anInt294 <= 0) {
					arg2.anInt294 = 5;
				}
				if (arg2.anInt285 <= 0) {
					arg2.anInt285 = 5;
				}
			}
		}
		if (Static129.anInt2329 == arg2.anInt252) {
			Static388.aClass16_15 = arg2;
		}
		if (arg1 && arg2.anObjectArray22 != null && (local13 != arg2.anInt294 || local51 != arg2.anInt285)) {
			@Pc(188) Class2_Sub44 local188 = new Class2_Sub44();
			local188.aClass16_20 = arg2;
			local188.anObjectArray36 = arg2.anObjectArray22;
			Static37.aClass156_54.method3157(local188);
		}
	}
}
