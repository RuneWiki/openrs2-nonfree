import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
	public static int anInt6770;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
	public static int anInt6772 = 0;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V")
	public static void method5852() {
		Static536.aClass22_11.method9405(Static445.aClass58_5);
		Static536.aClass22_11.DA(Static407.anInt6328, Static42.anInt1245, Static260.anInt4028, Static476.anInt7505);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ik;Lclient!ik;Lclient!te;Lclient!lba;BLclient!ik;)Z")
	public static boolean method5854(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class3_Sub33_Sub3 arg2, @OriginalArg(3) Class107 arg3, @OriginalArg(5) Class182 arg4) {
		Static38.aClass182_7 = arg4;
		Static708.aClass3_Sub33_Sub3_4 = arg2;
		Static489.anIntArray780 = new int[16];
		Static294.aClass107_2 = arg3;
		Static465.aClass182_92 = arg0;
		Static202.aClass182_53 = arg1;
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			Static489.anIntArray780[local27] = 255;
		}
		return true;
	}
}
