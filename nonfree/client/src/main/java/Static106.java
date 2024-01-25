import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	public static int anInt2280;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "[B")
	public static byte[] aByteArray21;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)Z")
	public static boolean method2114(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static145.aCharArray8[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!dja;I)Lclient!b;")
	public static Class3_Sub7_Sub1 method2116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2) {
		@Pc(10) int local10 = arg2.anInt2377 | arg0 << 10;
		@Pc(19) Class3_Sub7_Sub1 local19 = (Class3_Sub7_Sub1) Static604.aClass214_3.method4927((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static259.aClass182_68.method3961(Static259.aClass182_68.method3984(local10));
		if (local32 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt2377;
			local19 = (Class3_Sub7_Sub1) Static604.aClass214_3.method4927((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static259.aClass182_68.method3961(Static259.aClass182_68.method3984(local10));
			if (local32 == null) {
				local10 = arg2.anInt2377 | 0x3FFFC00;
				local19 = (Class3_Sub7_Sub1) Static604.aClass214_3.method4927((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static259.aClass182_68.method3961(Static259.aClass182_68.method3984(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static536.method7118(local32);
					} catch (@Pc(212) Exception local212) {
						throw new RuntimeException(local212.getMessage() + " S: " + local10);
					}
					local19.aClass78_1 = arg2;
					Static604.aClass214_3.method4928(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static536.method7118(local32);
				} catch (@Pc(136) Exception local136) {
					throw new RuntimeException(local136.getMessage() + " S: " + local10);
				}
				local19.aClass78_1 = arg2;
				Static604.aClass214_3.method4928(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static536.method7118(local32);
			} catch (@Pc(49) Exception local49) {
				throw new RuntimeException(local49.getMessage() + " S: " + local10);
			}
			local19.aClass78_1 = arg2;
			Static604.aClass214_3.method4928(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)Z")
	public static boolean method2118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
