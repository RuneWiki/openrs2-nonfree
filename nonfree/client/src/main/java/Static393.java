import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!r;")
	public static Class44 aClass44_11;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[Lclient!pga;")
	public static Class261[] aClass261Array1;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
	public static boolean aBoolean519 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method6218() {
		if (aClass44_11 != null) {
			aClass44_11.method5033();
			Static14.aClass58_1 = null;
			aClass44_11 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method6219(@OriginalArg(3) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local31) {
				local73 = -local73;
			}
			@Pc(115) int local115 = local73 + local35 * 10;
			if (local35 != local115 / 10) {
				return false;
			}
			local33 = true;
			local35 = local115;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method6220() {
		if (Static354.anInt6887 == 0) {
			return;
		}
		try {
			if (++Static146.anInt3106 > 2000) {
				if (Static299.aClass241_3 != null) {
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
				}
				if (Static254.anInt4666 >= 2) {
					Static164.anInt3328 = -5;
					Static354.anInt6887 = 0;
					return;
				}
				Static133.aClass342_3.method8062();
				Static146.anInt3106 = 0;
				Static254.anInt4666++;
				Static354.anInt6887 = 1;
			}
			if (Static354.anInt6887 == 1) {
				Static122.aClass234_3 = Static133.aClass342_3.method8058(Static406.aClass354_5);
				Static354.anInt6887 = 2;
			}
			if (Static354.anInt6887 == 2) {
				if (Static122.aClass234_3.anInt6717 == 2) {
					throw new IOException();
				}
				if (Static122.aClass234_3.anInt6717 != 1) {
					return;
				}
				Static299.aClass241_3 = Static41.method506((Socket) Static122.aClass234_3.anObject16);
				Static122.aClass234_3 = null;
				Static367.method5899();
				Static354.anInt6887 = 4;
			}
			@Pc(119) int local119;
			if (Static354.anInt6887 == 4) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				local119 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				if (local119 != 21) {
					Static164.anInt3328 = local119;
					Static354.anInt6887 = 0;
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
					return;
				}
				Static354.anInt6887 = 5;
			}
			if (Static354.anInt6887 == 5) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				Static354.anInt6887 = 6;
				Static406.aStringArray52 = new String[Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF];
			}
			if (Static354.anInt6887 == 6 && Static299.aClass241_3.method7084(Static406.aStringArray52.length * 8)) {
				Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, Static406.aStringArray52.length * 8, 0);
				for (local119 = 0; local119 < Static406.aStringArray52.length; local119++) {
					Static406.aStringArray52[local119] = Static315.method5297(Static319.aClass4_Sub11_Sub1_2.method4903());
				}
				Static354.anInt6887 = 0;
				Static164.anInt3328 = 21;
				Static299.aClass241_3.method7087();
				Static299.aClass241_3 = null;
			}
		} catch (@Pc(221) IOException local221) {
			if (Static299.aClass241_3 != null) {
				Static299.aClass241_3.method7087();
				Static299.aClass241_3 = null;
			}
			if (Static254.anInt4666 >= 2) {
				Static164.anInt3328 = -4;
				Static354.anInt6887 = 0;
			} else {
				Static133.aClass342_3.method8062();
				Static354.anInt6887 = 1;
				Static146.anInt3106 = 0;
				Static254.anInt4666++;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method6221() {
		for (@Pc(10) Class4_Sub51 local10 = (Class4_Sub51) Static377.aClass244_51.method5963(); local10 != null; local10 = (Class4_Sub51) Static377.aClass244_51.method5965()) {
			if (local10.anInt10257 == -1) {
				local10.anInt10254 = 0;
				if (local10.anInt10248 >= 0 && local10.anInt10261 >= 0 && Static428.anInt8046 > local10.anInt10248 && local10.anInt10261 < Static119.anInt2717) {
					Static275.method4771(local10);
				}
			} else {
				local10.method8379();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	public static void method6222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg4 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static103.method2210(arg3, arg4, arg2, arg0);
			}
		} else if (local15 == 0) {
			Static18.method215(arg2, arg1, arg3, arg0);
		} else {
			@Pc(50) int local50 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg3 - (local50 * arg2 >> 12);
			@Pc(64) int local64;
			@Pc(72) int local72;
			if (arg2 < Static486.anInt8866) {
				local64 = Static486.anInt8866;
				local72 = (Static486.anInt8866 * local50 >> 12) + local59;
			} else if (Static214.anInt3975 < arg2) {
				local64 = Static214.anInt3975;
				local72 = (Static214.anInt3975 * local50 >> 12) + local59;
			} else {
				local72 = arg3;
				local64 = arg2;
			}
			@Pc(98) int local98;
			@Pc(106) int local106;
			if (Static486.anInt8866 > arg1) {
				local98 = Static486.anInt8866;
				local106 = (Static486.anInt8866 * local50 >> 12) + local59;
			} else if (Static214.anInt3975 >= arg1) {
				local106 = arg4;
				local98 = arg1;
			} else {
				local106 = local59 + (local50 * Static214.anInt3975 >> 12);
				local98 = Static214.anInt3975;
			}
			if (local72 < Static290.anInt5903) {
				local64 = (Static290.anInt5903 - local59 << 12) / local50;
				local72 = Static290.anInt5903;
			} else if (Static530.anInt9437 < local72) {
				local64 = (Static530.anInt9437 - local59 << 12) / local50;
				local72 = Static530.anInt9437;
			}
			if (local106 < Static290.anInt5903) {
				local98 = (Static290.anInt5903 - local59 << 12) / local50;
				local106 = Static290.anInt5903;
			} else if (Static530.anInt9437 < local106) {
				local106 = Static530.anInt9437;
				local98 = (Static530.anInt9437 - local59 << 12) / local50;
			}
			Static547.method7952(local98, local64, local106, local72, arg0);
		}
	}
}
