import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "Lclient!is;")
	public static Class155 aClass155_7 = null;

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
	public static int anInt5983 = 0;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
	public static int anInt5985 = 13156520;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!rca;)Z")
	public static boolean method4718(@OriginalArg(1) Class288 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean606) {
			return false;
		} else if (!arg0.method6627(Static572.anInterface17_2)) {
			return false;
		} else if (Static314.aClass221_20.method5075((long) arg0.anInt8575) == null) {
			return Static438.aClass221_30.method5075((long) arg0.anInt8601) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IB)Z")
	public static boolean method4719(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static101.aCharArray3[local12 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;ZLclient!vo;B)Lclient!bs;")
	public static Class42 method4720(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class348 arg2) {
		@Pc(10) int local10 = arg2.method7966(arg0);
		if (local10 == -1) {
			return new Class42(0);
		}
		@Pc(24) int[] local24 = arg2.method7976(local10);
		@Pc(35) Class42 local35 = new Class42(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt1335 > local37) {
				@Pc(53) Class4_Sub13 local53 = new Class4_Sub13(arg2.method7964(local24[local39++], local10));
				@Pc(57) int local57 = local53.method6990();
				@Pc(61) int local61 = local53.method7054();
				@Pc(65) int local65 = local53.method7004();
				if (!arg1 && local65 == 1) {
					local35.anInt1335--;
				} else {
					local35.anIntArray37[local37] = local57;
					local35.anIntArray36[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method4721(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static144.method2507(arg1.length - 1, arg0, arg1, 0);
	}
}
