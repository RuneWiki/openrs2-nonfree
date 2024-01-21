import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_5;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
	public static long aLong25;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_331 = Static88.method1421("backright1");

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_333 = Static88.method1421("Add ignore");

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!va;")
	public static Class61 aClass61_332 = aClass61_333;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt887 = 0;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!i;")
	public static Class29 aClass29_21 = new Class29(500);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method523() {
		aClass11_Sub1_5 = null;
		aClass61_332 = null;
		aClass61_331 = null;
		aBigInteger1 = null;
		aClass61_333 = null;
		aClass29_21 = null;
		aByteArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!va;ILclient!he;Lclient!va;)Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 method524(@OriginalArg(0) Class61 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(12) int local12 = arg1.method221(arg2);
		@Pc(18) int local18 = arg1.method227(local12, arg0);
		return Static47.method740(local18, arg1, local12);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method525() {
		while (true) {
			@Pc(10) Class9 local10 = Static12.aClass9_2;
			@Pc(17) Class10_Sub11 local17;
			synchronized (Static12.aClass9_2) {
				local17 = (Class10_Sub11) Static41.aClass9_5.method83();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass11_Sub1_12.method233(local17.aByteArray12, false, (int) local17.aLong81, local17.aClass38_3);
		}
	}
}
