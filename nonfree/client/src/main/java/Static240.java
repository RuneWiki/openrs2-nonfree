import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_40 = new Class305(57, -1);

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_41 = new Class305(46, 15);

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "[I")
	public static final int[] anIntArray235 = new int[8];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)J")
	public static long method3767() {
		return Static282.aClass23_1.method6159();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
	public static void method3769(@OriginalArg(1) int arg0) {
		if (Static489.anInt8199 == arg0) {
			return;
		}
		Static201.anInt3834 = Static626.anInt10238 = Static231.anIntArray213[arg0];
		Static282.method4537();
		Static396.anIntArrayArrayArray33 = new int[4][Static201.anInt3834 >> 3][Static626.anInt10238 >> 3];
		Static500.anIntArrayArray43 = new int[Static201.anInt3834][Static626.anInt10238];
		Static89.anIntArrayArray5 = new int[Static201.anInt3834][Static626.anInt10238];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static275.aClass106Array1[local44] = Static449.method6487(Static626.anInt10238, Static201.anInt3834);
		}
		Static104.aByteArrayArrayArray5 = new byte[4][Static201.anInt3834][Static626.anInt10238];
		Static373.method5594(Static201.anInt3834, Static626.anInt10238);
		Static159.method572(Static208.aClass65_7, Static201.anInt3834 >> 3, Static626.anInt10238 >> 3);
		Static489.anInt8199 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Lclient!gh;")
	public static Class131 method3770(@OriginalArg(1) int arg0) {
		@Pc(6) Class131[] local6 = Static409.method6019();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (arg0 == local6[local8].anInt3770) {
				return local6[local8];
			}
		}
		return null;
	}
}
