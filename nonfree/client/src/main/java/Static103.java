import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!md", name = "E", descriptor = "J")
	public static long aLong91;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	public static int anInt2568;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "I")
	public static volatile int anInt2565 = 0;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "[I")
	public static int[] anIntArray236 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1478 = Static107.method1838("<img=1>");

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1479 = Static107.method1838("event_opbase");

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1480 = Static107.method1838("Stufe)2");

	@OriginalMember(owner = "client!md", name = "U", descriptor = "I")
	public static int anInt2571 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)I")
	public static int method1808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(31) int local31 = arg1 & 0x7F;
		@Pc(35) int local35 = arg2 & 0x7F;
		@Pc(37) int local37 = arg0;
		if (arg0 < 3 && (Static49.aByteArrayArrayArray4[1][local3][local11] & 0x2) == 2) {
			local37 = arg0 + 1;
		}
		@Pc(85) int local85 = Static78.anIntArrayArrayArray6[local37][local3 + 1][local11 + 1] * local31 + Static78.anIntArrayArrayArray6[local37][local3][local11 + 1] * (128 - local31) >> 7;
		@Pc(112) int local112 = Static78.anIntArrayArrayArray6[local37][local3 + 1][local11] * local31 + (128 - local31) * Static78.anIntArrayArrayArray6[local37][local3][local11] >> 7;
		return (128 - local35) * local112 + local35 * local85 >> 7;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method1809() {
		aClass28_1480 = null;
		aClass28_1479 = null;
		anIntArray236 = null;
		aClass28_1478 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BZLclient!gg;)V")
	public static void method1810(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(9) Class28 local9 = arg1.method1123();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static145.anInt3284; local16++) {
			@Pc(22) Class2_Sub4_Sub12 local22 = Static58.method1034(local16);
			if ((!arg0 || local22.aBoolean109) && local22.aClass28_1344.method1123().method1124(local9) != -1) {
				if (local14 >= 250) {
					Static137.aShortArray33 = null;
					Static109.anInt2647 = -1;
					return;
				}
				if (local12.length <= local14) {
					@Pc(61) short[] local61 = new short[local12.length * 2];
					for (@Pc(63) int local63 = 0; local63 < local14; local63++) {
						local61[local63] = local12[local63];
					}
					local12 = local61;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static109.anInt2647 = local14;
		Static130.anInt3041 = 0;
		@Pc(98) Class28[] local98 = new Class28[Static109.anInt2647];
		Static137.aShortArray33 = local12;
		for (@Pc(102) int local102 = 0; local102 < Static109.anInt2647; local102++) {
			local98[local102] = Static58.method1034(local12[local102]).aClass28_1344;
		}
		Static38.method707(Static137.aShortArray33, local98);
	}
}
