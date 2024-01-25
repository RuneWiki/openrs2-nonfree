import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "J")
	public static long aLong105;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!ij;")
	public static Class93 aClass93_60;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public static int anInt2978 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method2737() {
		for (@Pc(5) int local5 = 0; local5 < Static160.anInt3179; local5++) {
			@Pc(10) Class202 local10 = Static313.method5470(local5);
			if (local10 != null && local10.anInt6578 == 0) {
				Static251.anIntArray486[local5] = 0;
				Static134.anIntArray205[local5] = 0;
			}
		}
		Static276.aClass190_30 = new Class190(128);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	public static void method2739() {
		@Pc(5) Class120 local5 = Static311.aClass120_2;
		synchronized (Static311.aClass120_2) {
			Static311.aClass120_2.method3170();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method2740(@OriginalArg(1) int arg0) {
		Static167.anInt3342 = arg0;
		@Pc(7) Class109 local7 = Static289.aClass109_51;
		synchronized (Static289.aClass109_51) {
			Static289.aClass109_51.method2858();
		}
		local7 = Static78.aClass109_21;
		synchronized (Static78.aClass109_21) {
			Static78.aClass109_21.method2858();
		}
		local7 = Static321.aClass109_58;
		synchronized (Static321.aClass109_58) {
			Static321.aClass109_58.method2858();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method2741(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(14) byte[] local14 = new byte[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local14[local16] = (byte) local21;
			} else if (local21 == '€') {
				local14[local16] = -128;
			} else if (local21 == '‚') {
				local14[local16] = -126;
			} else if (local21 == 'ƒ') {
				local14[local16] = -125;
			} else if (local21 == '„') {
				local14[local16] = -124;
			} else if (local21 == '…') {
				local14[local16] = -123;
			} else if (local21 == '†') {
				local14[local16] = -122;
			} else if (local21 == '‡') {
				local14[local16] = -121;
			} else if (local21 == 'ˆ') {
				local14[local16] = -120;
			} else if (local21 == '‰') {
				local14[local16] = -119;
			} else if (local21 == 'Š') {
				local14[local16] = -118;
			} else if (local21 == '‹') {
				local14[local16] = -117;
			} else if (local21 == 'Œ') {
				local14[local16] = -116;
			} else if (local21 == 'Ž') {
				local14[local16] = -114;
			} else if (local21 == '‘') {
				local14[local16] = -111;
			} else if (local21 == '’') {
				local14[local16] = -110;
			} else if (local21 == '“') {
				local14[local16] = -109;
			} else if (local21 == '”') {
				local14[local16] = -108;
			} else if (local21 == '•') {
				local14[local16] = -107;
			} else if (local21 == '–') {
				local14[local16] = -106;
			} else if (local21 == '—') {
				local14[local16] = -105;
			} else if (local21 == '˜') {
				local14[local16] = -104;
			} else if (local21 == '™') {
				local14[local16] = -103;
			} else if (local21 == 'š') {
				local14[local16] = -102;
			} else if (local21 == '›') {
				local14[local16] = -101;
			} else if (local21 == 'œ') {
				local14[local16] = -100;
			} else if (local21 == 'ž') {
				local14[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local14[local16] = -97;
			} else {
				local14[local16] = 63;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;BC)I")
	public static int method2742(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (arg0.charAt(local18) == arg1) {
				local5++;
			}
		}
		return local5;
	}
}
