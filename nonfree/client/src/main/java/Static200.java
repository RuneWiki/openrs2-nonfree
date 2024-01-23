import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public static int anInt4271 = 0;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1460 = method3116("blaugr-Un:");

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	public static int anInt4273 = 100;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1461 = method3116("Mem:");

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1462 = method3116(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
	public static boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method3115(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static155.anInt3458 > 0) {
			local18 = Static158.aByteArrayArray7[--Static155.anInt3458];
			Static158.aByteArrayArray7[Static155.anInt3458] = null;
			return local18;
		} else if (arg0 == 5000 && Static94.anInt2191 > 0) {
			local18 = Static122.aByteArrayArray5[--Static94.anInt2191];
			Static122.aByteArrayArray5[Static94.anInt2191] = null;
			return local18;
		} else if (arg0 == 30000 && Static57.anInt1489 > 0) {
			local18 = Static43.aByteArrayArray3[--Static57.anInt1489];
			Static43.aByteArrayArray3[Static57.anInt1489] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)Lclient!kh;")
	public static Class60 method3116(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(17) int local17 = local6.length;
		@Pc(21) Class60 local21 = new Class60();
		local21.aByteArray34 = new byte[local17];
		@Pc(27) int local27 = 0;
		while (local17 > local27) {
			@Pc(35) int local35 = local6[local27++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local17 <= local27) {
					break;
				}
				@Pc(51) int local51 = local6[local27++] & 0xFF;
				local21.aByteArray34[local21.anInt2439++] = (byte) (local35 * 43 + local51 - 1720 - 48);
			} else if (local35 != 0) {
				local21.aByteArray34[local21.anInt2439++] = (byte) local35;
			}
		}
		local21.method1795();
		return local21.method1809();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!ai;Lclient!ai;)V")
	public static void method3118(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static173.aClass7_34 = arg1;
		Static198.aClass7_37 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILclient!ai;)Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 method3119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		return Static87.method1515(arg0, arg1, arg2) ? Static92.method1614() : null;
	}
}
