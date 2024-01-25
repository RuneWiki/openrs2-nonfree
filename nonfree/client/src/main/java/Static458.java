import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_34 = new Class280(16);

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	public static int anInt8066 = 0;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "[S")
	private static final short[] aShortArray118 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "[S")
	private static final short[] aShortArray119 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "Z")
	public static boolean aBoolean561 = false;

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "[S")
	private static final short[] aShortArray120 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "[[S")
	public static final short[][] aShortArrayArray13 = new short[][] { aShortArray118, aShortArray120, aShortArray119 };

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)B")
	public static byte method7005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)I")
	public static int method7006(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = Static234.anInt4427;
		if (local12 == 0) {
			return arg0 ? 0 : Static631.anInt10100;
		} else if (local12 == 1) {
			return Static631.anInt10100;
		} else if (local12 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
