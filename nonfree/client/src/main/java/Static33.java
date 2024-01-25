import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt592;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_11;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!wd;")
	public static final Class210 aClass210_2 = new Class210();

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[S")
	public static final short[] aShortArray34 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
	public static int method465() {
		if (Static115.aBoolean144) {
			return 0;
		} else if (Static283.method4712()) {
			return Static147.aBoolean182 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;BLclient!nq;)Lclient!uh;")
	public static Class199 method467(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(10) int local10 = arg2.method3902(arg1);
		if (local10 == -1) {
			return new Class199(0);
		}
		@Pc(23) int[] local23 = arg2.method3901(local10);
		@Pc(29) Class199 local29 = new Class199(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(40) int local40 = 0;
		while (true) {
			while (local29.anInt6201 > local31) {
				@Pc(54) Class11_Sub25 local54 = new Class11_Sub25(arg2.method3896(local23[local40++], local10));
				@Pc(58) int local58 = local54.method5198();
				@Pc(64) int local64 = local54.method5187();
				@Pc(68) int local68 = local54.method5185();
				if (!arg0 && local68 == 1) {
					local29.anInt6201--;
				} else {
					local29.anIntArray513[local31] = local58;
					local29.anIntArray512[local31] = local64;
					local31++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
	public static int method468(@OriginalArg(1) int arg0) {
		if (Static291.aClass156_103 != null) {
			Static291.aClass156_103.method4190();
			Static291.aClass156_103 = null;
		}
		Static217.anInt4438++;
		if (Static217.anInt4438 > 4) {
			Static217.anInt4438 = 0;
			Static59.anInt1131 = 0;
			return arg0;
		}
		Static59.anInt1131 = 0;
		if (Static137.anInt2556 == Static68.anInt1253) {
			Static68.anInt1253 = Static122.anInt2278;
		} else {
			Static68.anInt1253 = Static137.anInt2556;
		}
		return -1;
	}
}
