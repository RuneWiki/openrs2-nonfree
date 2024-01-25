import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Lclient!wu;")
	public static Class380 aClass380_53;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "[I")
	public static final int[] anIntArray231 = new int[50];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZLclient!kc;)I")
	public static int method2941(@OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt4669;
		@Pc(17) Class334 local17 = arg0.method3964();
		if (arg0.anInt4553 == -1 || arg0.aBoolean319) {
			local13 = arg0.anInt4656;
		} else if (arg0.anInt4553 == local17.anInt8919 || arg0.anInt4553 == local17.anInt8931 || arg0.anInt4553 == local17.anInt8945 || local17.anInt8921 == arg0.anInt4553) {
			local13 = arg0.anInt4668;
		} else if (local17.anInt8943 == arg0.anInt4553 || arg0.anInt4553 == local17.anInt8913 || local17.anInt8930 == arg0.anInt4553 || local17.anInt8926 == arg0.anInt4553) {
			local13 = arg0.anInt4645;
		}
		return local13;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)I")
	public static int method2942(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}
}
