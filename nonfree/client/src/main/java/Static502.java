import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tw", name = "M", descriptor = "I")
	public static int anInt8936;

	@OriginalMember(owner = "client!tw", name = "K", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_7 = new Class271(6, 1);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V")
	public static void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static448.anIntArrayArray53 != null) {
			Static448.anIntArrayArray53[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static571.aShortArrayArray11 != null) {
			Static571.aShortArrayArray11[arg0][arg1] = (short) arg3;
		}
		if (Static270.aByteArrayArray18 != null) {
			Static270.aByteArrayArray18[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZ)V")
	public static void method7496() {
		@Pc(5) Class245 local5 = Static428.aClass245_59;
		synchronized (Static428.aClass245_59) {
			Static428.aClass245_59.method6083(5);
		}
		local5 = Static180.aClass245_33;
		synchronized (Static180.aClass245_33) {
			Static180.aClass245_33.method6083(5);
		}
	}
}
