import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!jd;")
	public static Class167 aClass167_9;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
	public static short[] aShortArray117 = new short[256];

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	public static int anInt8096 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lclient!tc;B)V")
	public static void method6665(@OriginalArg(0) int arg0, @OriginalArg(1) Class305[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(20) Class305 local20 = arg1[local15];
			if (local20 != null) {
				if (local20.anInt9211 == 0) {
					if (local20.aClass305Array2 != null) {
						method6665(arg0, local20.aClass305Array2);
					}
					@Pc(44) Class3_Sub18 local44 = (Class3_Sub18) Static283.aClass25_23.method946((long) local20.anInt9167);
					if (local44 != null) {
						Static474.method7273(arg0, local44.anInt3962);
					}
				}
				@Pc(63) Class3_Sub38 local63;
				if (arg0 == 0 && local20.anObjectArray32 != null) {
					local63 = new Class3_Sub38();
					local63.aClass305_11 = local20;
					local63.anObjectArray4 = local20.anObjectArray32;
					Static597.method8423(local63);
				}
				if (arg0 == 1 && local20.anObjectArray12 != null) {
					if (local20.anInt9159 >= 0) {
						@Pc(88) Class305 local88 = Static220.method3786(local20.anInt9167);
						if (local88 == null || local88.aClass305Array2 == null || local88.aClass305Array2.length <= local20.anInt9159 || local20 != local88.aClass305Array2[local20.anInt9159]) {
							continue;
						}
					}
					local63 = new Class3_Sub38();
					local63.aClass305_11 = local20;
					local63.anObjectArray4 = local20.anObjectArray12;
					Static597.method8423(local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method6667(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		if (local14 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local14 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local14 <= local25 - 2 || Static57.method1332(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local25 - 1 >= local14 || Static57.method1332(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(70) byte[] local70 = new byte[local31];
		Static422.method6759(local70, 0, arg0);
		return local70;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method6678() {
		if (Static480.aClass326_3.aBoolean802 && Static528.aClass329_7.anInt9698 != -1) {
			Static175.method3125(Static528.aClass329_7.aString124, Static528.aClass329_7.anInt9698);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!pe;ZII)V")
	public static void method6679(@OriginalArg(0) int arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(5) int arg2) {
		Static207.anInt4266 = 10000;
		Static340.anInt6985 = arg2;
		Static178.anInt3592 = 1;
		Static274.anInt5814 = arg0;
		Static93.aBoolean180 = false;
		Static273.anInt5808 = 0;
		Static568.aClass254_136 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6680(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + arg0.charAt(local10) - local8;
		}
		return local8;
	}
}
