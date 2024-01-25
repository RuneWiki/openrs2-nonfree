import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "Z")
	public static boolean aBoolean369;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array43;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
	public static int anInt4976 = 0;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	public static int anInt4977 = 0;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Z")
	public static boolean aBoolean370 = true;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	public static final int anInt4978 = 12;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLclient!ab;III)V")
	public static void method4469(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt64;
		@Pc(20) int local20 = arg1.anInt116;
		if (arg1.aByte1 == 0) {
			arg1.anInt64 = arg1.anInt52;
		} else if (arg1.aByte1 == 1) {
			arg1.anInt64 = arg2 - arg1.anInt52;
		} else if (arg1.aByte1 == 2) {
			arg1.anInt64 = arg2 * arg1.anInt52 >> 14;
		}
		if (arg1.aByte3 == 0) {
			arg1.anInt116 = arg1.anInt58;
		} else if (arg1.aByte3 == 1) {
			arg1.anInt116 = arg3 - arg1.anInt58;
		} else if (arg1.aByte3 == 2) {
			arg1.anInt116 = arg3 * arg1.anInt58 >> 14;
		}
		if (arg1.aByte1 == 4) {
			arg1.anInt64 = arg1.anInt116 * arg1.anInt95 / arg1.anInt98;
		}
		if (arg1.aByte3 == 4) {
			arg1.anInt116 = arg1.anInt98 * arg1.anInt64 / arg1.anInt95;
		}
		if (Static119.aBoolean188 && (Static51.method778(arg1).anInt4220 != 0 || arg1.anInt91 == 0)) {
			if (arg1.anInt116 < 5 && arg1.anInt64 < 5) {
				arg1.anInt64 = 5;
				arg1.anInt116 = 5;
			} else {
				if (arg1.anInt64 <= 0) {
					arg1.anInt64 = 5;
				}
				if (arg1.anInt116 <= 0) {
					arg1.anInt116 = 5;
				}
			}
		}
		if (arg1.anInt59 == Static168.anInt3459) {
			Static118.aClass3_14 = arg1;
		}
		if (arg0 && arg1.anObjectArray14 != null && (local8 != arg1.anInt64 || arg1.anInt116 != local20)) {
			@Pc(198) Class2_Sub5 local198 = new Class2_Sub5();
			local198.aClass3_4 = arg1;
			local198.anObjectArray33 = arg1.anObjectArray14;
			Static269.aClass238_30.method5796(local198);
		}
	}
}
