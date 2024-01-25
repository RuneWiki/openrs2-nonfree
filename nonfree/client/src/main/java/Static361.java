import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "Lclient!kq;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array23;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)V")
	public static void method5175() {
		Static372.method5397();
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)Z")
	public static boolean method5177(@OriginalArg(1) int arg0) {
		return arg0 == 57 || arg0 == 2 || arg0 == 30 || arg0 == 16 || arg0 == 47 || arg0 == 17 || arg0 == 50;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
	public static void method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class19_Sub1_Sub1 local14 = local7.aClass19_Sub1_Sub1_2;
		@Pc(17) Class19_Sub1_Sub1 local17 = local7.aClass19_Sub1_Sub1_1;
		if (local14 != null) {
			local14.aShort111 = (short) (local14.aShort111 * arg3 / (0x10 << Static394.anInt7067 - 7));
			local14.aShort110 = (short) (local14.aShort110 * arg3 / (0x10 << Static394.anInt7067 - 7));
		}
		if (local17 != null) {
			local17.aShort111 = (short) (local17.aShort111 * arg3 / (0x10 << Static394.anInt7067 - 7));
			local17.aShort110 = (short) (local17.aShort110 * arg3 / (0x10 << Static394.anInt7067 - 7));
		}
	}
}
