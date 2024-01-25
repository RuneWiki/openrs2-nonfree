import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Component;IIILclient!pq;)Lclient!oba;")
	public static Class15 method3819(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class229 arg3) {
		if (Static411.anInt9206 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class15 local36 = (Class15) Class.forName("Class15_Sub1").getDeclaredConstructor().newInstance();
			local36.anIntArray297 = new int[(Static121.aBoolean214 ? 2 : 1) * 256];
			local36.anInt3855 = arg1;
			local36.method3556(arg0);
			local36.anInt3850 = (arg1 & 0xFFFFFC00) + 1024;
			if (local36.anInt3850 > 16384) {
				local36.anInt3850 = 16384;
			}
			local36.method3562(local36.anInt3850);
			if (Static367.anInt6638 > 0 && Static252.aClass3_1 == null) {
				Static252.aClass3_1 = new Class3();
				Static252.aClass3_1.aClass229_1 = arg3;
				arg3.method6060(Static367.anInt6638, Static252.aClass3_1);
			}
			if (Static252.aClass3_1 != null) {
				if (Static252.aClass3_1.aClass15Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static252.aClass3_1.aClass15Array1[arg2] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class15_Sub2 local114 = new Class15_Sub2(arg3, arg2);
				local114.anInt3855 = arg1;
				local114.anIntArray297 = new int[(Static121.aBoolean214 ? 2 : 1) * 256];
				local114.method3556(arg0);
				local114.anInt3850 = 16384;
				local114.method3562(local114.anInt3850);
				if (Static367.anInt6638 > 0 && Static252.aClass3_1 == null) {
					Static252.aClass3_1 = new Class3();
					Static252.aClass3_1.aClass229_1 = arg3;
					arg3.method6060(Static367.anInt6638, Static252.aClass3_1);
				}
				if (Static252.aClass3_1 != null) {
					if (Static252.aClass3_1.aClass15Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static252.aClass3_1.aClass15Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(181) Throwable local181) {
				return new Class15();
			}
		}
	}
}
