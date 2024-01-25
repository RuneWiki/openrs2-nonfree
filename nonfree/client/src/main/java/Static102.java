import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!vs;III)V")
	public static void method2108(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static130.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7556 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass12_Sub7Array6[arg0.anInt7556++] = Static485.aClass97Array1[local21 - 1].aClass12_Sub7_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt7556; local21 < 4; local21++) {
			arg0.aClass12_Sub7Array6[local21] = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLclient!mg;BZ)V")
	public static void method2109(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub34 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt5831;
		@Pc(12) int local12 = (int) arg1.aLong248;
		arg1.method7967();
		if (arg0) {
			Static419.method6486(local8);
		}
		Static321.method5081(local8);
		@Pc(27) Class198 local27 = Static104.method2137(local12);
		if (local27 != null) {
			Static331.method5282(local27);
		}
		Static86.method1909();
		if (!arg2 && Static406.anInt7660 != -1) {
			Static376.method7936(1, Static406.anInt7660);
		}
		@Pc(57) Class135 local57 = new Class135(Static456.aClass68_67);
		for (@Pc(62) Class12_Sub34 local62 = (Class12_Sub34) local57.method3650(); local62 != null; local62 = (Class12_Sub34) local57.method3654()) {
			if (!local62.method7970()) {
				local62 = (Class12_Sub34) local57.method3650();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt5829 == 3) {
				@Pc(84) int local84 = (int) local62.aLong248;
				if (local8 == local84 >>> 16) {
					method2109(true, local62, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(III)Z")
	public static boolean method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static474.method7144(arg0, arg1) || Static58.method1436(arg0, arg1);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBLclient!daa;)Ljava/lang/String;")
	public static String method2111(@OriginalArg(2) Class12_Sub8 arg0) {
		try {
			@Pc(12) int local12 = arg0.method5218();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt6217 += Static114.aClass317_1.method7927(local20, 0, arg0.anInt6217, local12, arg0.aByteArray82);
			return Static157.method3075(0, local12, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}
