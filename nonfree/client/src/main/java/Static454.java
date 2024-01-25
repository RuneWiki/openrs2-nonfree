import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	public static int anInt7690;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public static int anInt7692;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_278 = new Class184(82, -1);

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "Z")
	public static final boolean aBoolean527 = false;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	public static int anInt7691 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method6065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0];
		@Pc(13) int local13 = Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0];
		if (local8 < 0 || local8 >= Static399.anInt6923 || local13 < 0 || Static127.anInt2696 <= local13) {
			return false;
		} else if (arg5 >= 0 && Static399.anInt6923 > arg5 && arg4 >= 0 && arg4 < Static127.anInt2696) {
			@Pc(66) int local66 = Static183.method3360(Static113.aClass1_Sub3_Sub3_Sub1_4.method4831(), Static271.anIntArray429, arg2, arg5, local8, Static222.anIntArray325, Static389.aClass23Array1[Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77], arg1, arg7, local13, arg3, arg0, arg4, arg6);
			if (local66 < 1) {
				return false;
			}
			Static388.anInt6735 = Static271.anIntArray429[local66 - 1];
			Static116.anInt6680 = Static222.anIntArray325[local66 - 1];
			Static196.aBoolean301 = false;
			Static279.method5819();
			return true;
		} else {
			return false;
		}
	}
}
