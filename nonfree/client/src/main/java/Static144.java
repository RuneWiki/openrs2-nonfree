import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public static int anInt3273 = 0;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Lclient!qe;")
	public static Class78 aClass78_614 = Static199.method3560(" weitere Optionen");

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_615 = Static199.method3560("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
	public static int anInt3283 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)J")
	public static long method2568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass106_1 == null ? 0L : local7.aClass106_1.aLong176;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	public static void method2569() {
		Static2.aClass103_1.method3662();
		Static127.aClass102_37.method3622();
		Static103.aClass102_21.method3622();
	}
}
