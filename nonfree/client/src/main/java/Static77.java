import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_3 = new Class55(9, 3);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1651(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static388.method5733(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static388.method5733(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(62) byte[] local62 = new byte[local26];
		Static28.method8903(0, local62, arg0);
		return local62;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIILclient!kv;)V")
	public static void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16_Sub1_Sub5 arg4) {
		@Pc(4) Class84 local4 = Static111.method2006(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8037 = (arg1 << Static326.anInt5713) + Static620.anInt10145;
		arg4.anInt8036 = arg3;
		arg4.anInt8034 = (arg2 << Static326.anInt5713) + Static620.anInt10145;
		local4.aClass16_Sub1_Sub5_1 = arg4;
		@Pc(33) int local33 = Static511.aClass91Array3 == Static332.aClass91Array2 ? 1 : 0;
		if (arg4.method6990()) {
			if (arg4.method6974()) {
				arg4.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local33];
				Static451.aClass16_Sub1Array3[local33] = arg4;
				return;
			}
			arg4.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local33];
			Static524.aClass16_Sub1Array5[local33] = arg4;
			Static578.aBoolean673 = true;
			return;
		}
		arg4.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local33];
		Static518.aClass16_Sub1Array4[local33] = arg4;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
	public static void method1654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static280.anInt5122 = arg0 - Static371.anInt9385;
		Static285.anInt5179 = arg1 - Static371.anInt9384;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII[Lclient!ria;II)V")
	public static void method1657(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class303[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg3.length; local5++) {
			@Pc(13) Class303 local13 = arg3[local5];
			if (local13 != null && arg2 == local13.anInt7985) {
				Static409.method6033(local13, arg4, arg0, arg1);
				Static124.method2239(arg4, local13, arg1);
				if (local13.anInt7943 - local13.anInt7914 < local13.anInt7920) {
					local13.anInt7920 = local13.anInt7943 - local13.anInt7914;
				}
				if (local13.anInt7982 > local13.anInt7936 - local13.anInt7971) {
					local13.anInt7982 = local13.anInt7936 - local13.anInt7971;
				}
				if (local13.anInt7920 < 0) {
					local13.anInt7920 = 0;
				}
				if (local13.anInt7982 < 0) {
					local13.anInt7982 = 0;
				}
				if (local13.anInt7935 == 0) {
					Static103.method1958(local13, arg0);
				}
			}
		}
	}
}
