import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qja", name = "Ab", descriptor = "I")
	public static int anInt7963;

	@OriginalMember(owner = "client!qja", name = "tb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("89825815787b2e9ed901bd716358a5d348b92e91eaf5dc71bd62fc1a7e7604455800a9670ebb6e125190350a810b0fad7362060435e6b20c0322fc9cc37cd0e7", 16);

	@OriginalMember(owner = "client!qja", name = "rb", descriptor = "[I")
	public static final int[] anIntArray460 = new int[50];

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!gda;I)Lclient!hk;")
	public static Class155 method6886(@OriginalArg(1) Class126 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class155 local17 = (Class155) Static365.aClass168_54.method3860((long) arg1);
		if (local17 == null) {
			if (Static545.aBoolean572) {
				local17 = Static273.aClass100_6.method8640(Static692.method8276(arg0, arg1), true);
			} else {
				local17 = Static671.method9118(arg0.method3069(arg1));
			}
			Static365.aClass168_54.method3853((long) arg1, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method6888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 < 512 || arg4 < 512 || arg5 > Static271.anInt4910 * 512 - 1024 || arg4 > Static613.anInt9909 * 512 - 1024) {
			Static663.anIntArray616[0] = Static663.anIntArray616[1] = -1;
			return;
		}
		@Pc(58) int local58 = Static461.method6500(arg5, arg0, arg4) - arg6;
		if (Static377.aBoolean419) {
			Static440.method6336(true);
		} else {
			Static155.aClass10_2.method4225(arg8, 0, 0);
			Static273.aClass100_6.method8590(Static155.aClass10_2);
		}
		if (Static305.aBoolean339) {
			Static273.aClass100_6.HA(arg5, local58, arg4, Static216.anInt1170, Static663.anIntArray616);
		} else {
			Static273.aClass100_6.da(arg5, local58, arg4, Static663.anIntArray616);
		}
		if (Static377.aBoolean419) {
			Static492.method6896(-5);
		} else {
			Static155.aClass10_2.method4225(-arg8, 0, 0);
			Static273.aClass100_6.method8590(Static155.aClass10_2);
		}
	}
}
