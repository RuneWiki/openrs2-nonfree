import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_13;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "[S")
	private static final short[] aShortArray132 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "[S")
	private static final short[] aShortArray133 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "[S")
	private static final short[] aShortArray134 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "[[S")
	public static final short[][] aShortArrayArray29 = new short[][] { aShortArray133, aShortArray132, aShortArray134 };

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)I")
	public static int method7638(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	public static void method7640() {
		Static605.method8554();
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	public static void method7641() {
		for (@Pc(3) int local3 = 0; local3 < Static199.anInt3915; local3++) {
			@Pc(14) Class182 local14 = Static240.aClass182Array1[local3];
			if (local14.aByte70 == 3) {
				if (local14.aClass3_Sub1_Sub1_3 == null) {
					local14.anInt4975 = Integer.MIN_VALUE;
				} else {
					Static313.aClass3_Sub1_Sub2_1.method931(local14.aClass3_Sub1_Sub1_3);
				}
			}
		}
	}
}
