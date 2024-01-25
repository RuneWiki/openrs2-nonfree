import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBLclient!ml;)Lclient!tg;")
	public static Class3_Sub11_Sub16 method4873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class223 arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg2.anInt6054;
		@Pc(19) Class3_Sub11_Sub16 local19 = (Class3_Sub11_Sub16) Static535.aClass179_4.method4558((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static532.aClass15_135.method536(Static532.aClass15_135.method522(local10));
		if (local31 == null) {
			local10 = arg0 + 65536 << 10 | arg2.anInt6054;
			local19 = (Class3_Sub11_Sub16) Static535.aClass179_4.method4558((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static532.aClass15_135.method536(Static532.aClass15_135.method522(local10));
			if (local31 == null) {
				local10 = arg2.anInt6054 | 0x3FFFC00;
				local19 = (Class3_Sub11_Sub16) Static535.aClass179_4.method4558((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static532.aClass15_135.method536(Static532.aClass15_135.method522(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static22.method2354(local31);
					} catch (@Pc(199) Exception local199) {
						throw new RuntimeException(local199.getMessage() + " S: " + local10);
					}
					local19.aClass223_14 = arg2;
					Static535.aClass179_4.method4562(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static22.method2354(local31);
				} catch (@Pc(129) Exception local129) {
					throw new RuntimeException(local129.getMessage() + " S: " + local10);
				}
				local19.aClass223_14 = arg2;
				Static535.aClass179_4.method4562(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static22.method2354(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass223_14 = arg2;
			Static535.aClass179_4.method4562(local19, (long) local10 << 16);
			return local19;
		}
	}
}
