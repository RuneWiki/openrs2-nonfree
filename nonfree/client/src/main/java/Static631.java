import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public static int anInt9864 = 0;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public static int anInt9865 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!oh;I)Lclient!bo;")
	public static Class4_Sub5_Sub4 method8449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class268 arg2) {
		@Pc(15) int local15 = arg1 << 10 | arg2.anInt6805;
		@Pc(24) Class4_Sub5_Sub4 local24 = (Class4_Sub5_Sub4) Static330.aClass300_2.method6604((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static338.aClass34_73.method1255(Static338.aClass34_73.method1249(local15));
		if (local36 == null) {
			local15 = arg2.anInt6805 | arg0 + 65536 << 10;
			local24 = (Class4_Sub5_Sub4) Static330.aClass300_2.method6604((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static338.aClass34_73.method1255(Static338.aClass34_73.method1249(local15));
			if (local36 == null) {
				local15 = arg2.anInt6805 | 0x3FFFC00;
				local24 = (Class4_Sub5_Sub4) Static330.aClass300_2.method6604((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static338.aClass34_73.method1255(Static338.aClass34_73.method1249(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local24 = Static468.method6480(local36);
					} catch (@Pc(202) Exception local202) {
						throw new RuntimeException(local202.getMessage() + " S: " + local15);
					}
					local24.aClass268_9 = arg2;
					Static330.aClass300_2.method6600((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local24 = Static468.method6480(local36);
				} catch (@Pc(126) Exception local126) {
					throw new RuntimeException(local126.getMessage() + " S: " + local15);
				}
				local24.aClass268_9 = arg2;
				Static330.aClass300_2.method6600((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local24 = Static468.method6480(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local15);
			}
			local24.aClass268_9 = arg2;
			Static330.aClass300_2.method6600((long) local15 << 16, local24);
			return local24;
		}
	}
}
