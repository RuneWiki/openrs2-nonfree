import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "[Lclient!oq;")
	public static Class272[] aClass272Array7;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!dt;I)V")
	public static void method2614(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static34.aClass152_1 != null) {
			@Pc(22) int local22;
			try {
				Static34.aClass152_1.method3506(0L);
				Static34.aClass152_1.method3504(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method7939(local8, 24, 0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILjava/awt/Canvas;)Lclient!lea;")
	public static Class3_Sub1 method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class3_Sub1_Sub1");
			@Pc(15) Class3_Sub1 local15 = (Class3_Sub1) local11.getDeclaredConstructor().newInstance();
			local15.method6778(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub1_Sub2 local28 = new Class3_Sub1_Sub2();
			local28.method6778(arg1, arg0, arg2);
			return local28;
		}
	}
}
