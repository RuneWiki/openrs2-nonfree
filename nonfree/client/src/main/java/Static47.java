import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "Lclient!ha;")
	public static Class104 aClass104_20;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_84 = new Class252(62, -1);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public static void method5107() {
		Static238.aBoolean354 = false;
		Static193.method3693(Static336.anInt6244, Static276.anInt8648, Static324.anInt6120, Static513.anInt9093);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Lclient!bq;")
	public static Class20_Sub2 method5108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!dn;Lclient!dn;I)V")
	public static void method5109(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1) {
		Static90.aClass69_24 = arg1;
		Static143.aClass69_31 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5111(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static272.aClass69_54.anInt2003 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static181.aClass316_1.anInt9398; local18++) {
			@Pc(25) Class180 local25 = Static181.aClass316_1.method8107(local18);
			if ((!arg0 || local25.aBoolean409) && local25.anInt5450 == -1 && local25.anInt5397 == -1 && local25.anInt5418 == 0 && local25.aString121.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static517.aShortArray148 = null;
					Static219.anInt4316 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(68) short[] local68 = new short[local14.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local16; local70++) {
						local68[local70] = local14[local70];
					}
					local14 = local68;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static219.anInt4316 = local16;
		Static315.anInt6002 = 0;
		Static517.aShortArray148 = local14;
		@Pc(104) String[] local104 = new String[Static219.anInt4316];
		for (@Pc(106) int local106 = 0; local106 < Static219.anInt4316; local106++) {
			local104[local106] = Static181.aClass316_1.method8107(local14[local106]).aString121;
		}
		Static42.method1219(local104, Static517.aShortArray148);
		Static272.aClass69_54.method1879();
		Static272.aClass69_54.anInt2003 = 2;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V")
	public static void method5114(@OriginalArg(1) int arg0) {
		if (Static434.anInt7518 == 1) {
			Static67.anInt1733 = arg0;
		} else if (Static434.anInt7518 == 2 || Static434.anInt7518 == 3) {
			Static358.anInt6481 = arg0;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5116(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
