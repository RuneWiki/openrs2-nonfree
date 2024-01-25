import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	public static int anInt4167;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "Lclient!nd;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "[I")
	public static final int[] anIntArray198 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!vo;BI)Lclient!fm;")
	public static Class4_Sub16 method3296(@OriginalArg(0) Class348 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method7969(arg1);
		return local8 == null ? null : new Class4_Sub16(local8);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)Lclient!lq;")
	public static Class202 method3297(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static572.aFloat202 == 3.0D) {
				return Static343.aClass202_6;
			}
			if ((double) Static572.aFloat202 == 4.0D) {
				return Static79.aClass202_1;
			}
			if ((double) Static572.aFloat202 == 6.0D) {
				return Static233.aClass202_3;
			}
			if ((double) Static572.aFloat202 >= 8.0D) {
				return Static229.aClass202_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static572.aFloat202 == 3.0D) {
				return Static233.aClass202_3;
			}
			if ((double) Static572.aFloat202 == 4.0D) {
				return Static229.aClass202_2;
			}
			if ((double) Static572.aFloat202 == 6.0D) {
				return Static409.aClass202_8;
			}
			if ((double) Static572.aFloat202 >= 8.0D) {
				return Static280.aClass202_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static572.aFloat202 == 3.0D) {
				return Static409.aClass202_8;
			}
			if ((double) Static572.aFloat202 == 4.0D) {
				return Static280.aClass202_5;
			}
			if ((double) Static572.aFloat202 == 6.0D) {
				return Static270.aClass202_4;
			}
			if ((double) Static572.aFloat202 >= 8.0D) {
				return Static399.aClass202_7;
			}
		}
		return null;
	}
}
