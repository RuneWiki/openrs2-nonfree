import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
	public static int anInt661;

	@OriginalMember(owner = "client!ck", name = "ob", descriptor = "[Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array5;

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "Z")
	public static boolean aBoolean18 = true;

	@OriginalMember(owner = "client!ck", name = "kb", descriptor = "I")
	public static int anInt665 = 0;

	@OriginalMember(owner = "client!ck", name = "qb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_267 = Static186.method3527("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ck", name = "nb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_266 = aClass50_267;

	@OriginalMember(owner = "client!ck", name = "pb", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
	public static void method508() {
		for (@Pc(3) int local3 = 0; local3 < Static103.anInt2065; local3++) {
			@Pc(9) int local9 = Static21.anIntArray44[local3];
			@Pc(13) Class20_Sub3_Sub2 local13 = Static78.aClass20_Sub3_Sub2Array1[local9];
			if (local13 != null) {
				Static5.method84(local13.aClass105_1.anInt3889, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!pa;I)[Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1[] method509(@OriginalArg(2) Class86 arg0, @OriginalArg(3) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static25.method368() : null;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Lclient!ei;")
	public static Class29 method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class29 local14 = local7.aClass29_1;
			local7.aClass29_1 = null;
			return local14;
		}
	}
}
