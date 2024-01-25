import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "Lclient!qj;")
	public static Class165 aClass165_26;

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "Lclient!qj;")
	public static Class165 aClass165_27;

	@OriginalMember(owner = "client!eo", name = "V", descriptor = "Lclient!qj;")
	public static Class165 aClass165_28;

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "[I")
	public static int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!eo", name = "X", descriptor = "I")
	public static int anInt1642 = -2;

	@OriginalMember(owner = "client!eo", name = "Y", descriptor = "[I")
	public static final int[] anIntArray193 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!eo", name = "Z", descriptor = "I")
	public static int anInt1643 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1585(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static290.anInt5612; local19++) {
			if (arg0.equalsIgnoreCase(Static257.aStringArray33[local19])) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)I")
	public static int method1586(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(II)V")
	public static void method1588(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub38 local17 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local17 != null) {
			local17.method5710();
		}
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V")
	public static void method1589() {
		@Pc(5) Class33 local5 = Static234.aClass33_1;
		synchronized (Static234.aClass33_1) {
			Static234.aClass33_1.method1155();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static23.anIntArrayArray1 != null) {
			Static23.anIntArrayArray1[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V")
	public static void method1591(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub1_Sub2 local14 = Static42.method1000(2, arg0);
		local14.method167();
	}
}
