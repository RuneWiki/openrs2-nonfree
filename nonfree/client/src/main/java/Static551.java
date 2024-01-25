import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!paa;")
	public static Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!ts;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "[I")
	public static final int[] anIntArray477 = new int[250];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
	public static boolean method7974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static446.aByteArrayArrayArray12[1].length && Static446.aByteArrayArrayArray12[1][arg0].length > arg1) {
			return (Static446.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
	public static void method7977(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 20);
		local9.method4001();
	}
}
