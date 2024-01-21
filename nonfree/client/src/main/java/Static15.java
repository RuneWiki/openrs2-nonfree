import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!de;")
	public static Class8_Sub3_Sub1 aClass8_Sub3_Sub1_1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public static int anInt388;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!vd;")
	public static Class92 aClass92_135 = null;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_136 = Static187.method3089("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public static void method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public static int method260(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(20) int local20 = (local10 >>> 2 & 0x73333333) + (local10 & 0x33333333);
		@Pc(40) int local40 = local20 + (local20 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)Lclient!vd;")
	public static Class92 method261(@OriginalArg(1) String arg0) {
		@Pc(12) byte[] local12;
		try {
			local12 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(14) UnsupportedEncodingException local14) {
			local12 = arg0.getBytes();
		}
		@Pc(21) Class92 local21 = new Class92();
		local21.aByteArray52 = local12;
		local21.anInt4244 = 0;
		for (@Pc(29) int local29 = 0; local29 < local12.length; local29++) {
			if (local12[local29] != 0) {
				local12[local21.anInt4244++] = local12[local29];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)I")
	public static int method262(@OriginalArg(0) int arg0) {
		if (Static93.anInt1976 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}
}
