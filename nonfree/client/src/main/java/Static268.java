import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "[Lclient!vba;")
	public static final Class351[] aClass351Array1 = new Class351[16];

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
	public static int anInt5697 = -1;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!jt;IZ)Lclient!vga;")
	public static Class8_Sub5_Sub20 method4644(@OriginalArg(0) int arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1.anInt5652 | arg2 << 10;
		@Pc(24) Class8_Sub5_Sub20 local24 = (Class8_Sub5_Sub20) Static8.aClass159_1.method4551((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(40) byte[] local40 = Static112.aClass237_30.method6305(Static112.aClass237_30.method6313(local15));
		if (local40 == null) {
			local15 = arg0 + 65536 << 10 | arg1.anInt5652;
			local24 = (Class8_Sub5_Sub20) Static8.aClass159_1.method4551((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local40 = Static112.aClass237_30.method6305(Static112.aClass237_30.method6313(local15));
			if (local40 == null) {
				local15 = arg1.anInt5652 | 0x3FFFC00;
				local24 = (Class8_Sub5_Sub20) Static8.aClass159_1.method4551((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local40 = Static112.aClass237_30.method6305(Static112.aClass237_30.method6313(local15));
				if (local40 == null) {
					return null;
				} else if (local40.length <= 1) {
					return null;
				} else {
					try {
						local24 = Static43.method1350(local40);
					} catch (@Pc(202) Exception local202) {
						throw new RuntimeException(local202.getMessage() + " S: " + local15);
					}
					local24.aClass165_12 = arg1;
					Static8.aClass159_1.method4549((long) local15 << 16, local24);
					return local24;
				}
			} else if (local40.length <= 1) {
				return null;
			} else {
				try {
					local24 = Static43.method1350(local40);
				} catch (@Pc(134) Exception local134) {
					throw new RuntimeException(local134.getMessage() + " S: " + local15);
				}
				local24.aClass165_12 = arg1;
				Static8.aClass159_1.method4549((long) local15 << 16, local24);
				return local24;
			}
		} else if (local40.length <= 1) {
			return null;
		} else {
			try {
				local24 = Static43.method1350(local40);
			} catch (@Pc(56) Exception local56) {
				throw new RuntimeException(local56.getMessage() + " S: " + local15);
			}
			local24.aClass165_12 = arg1;
			Static8.aClass159_1.method4549((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)I")
	public static int method4645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = ((arg0 & 0xFF00) * local12 & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return local30 + ((local35 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local35 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
