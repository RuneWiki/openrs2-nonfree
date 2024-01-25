import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!gt;")
	public static Class89 aClass89_10;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_85 = new Class215(38, 8);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
	public static void method5086(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub1_Sub11 local12 = Static405.method5222(arg0, 4);
		local12.method2608();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
	public static void method5090() {
		if (Static354.anInt6183 == 0) {
			return;
		}
		try {
			if (++Static348.anInt5976 > 2000) {
				if (Static125.aClass11_5 != null) {
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
				}
				if (Static119.anInt2524 >= 1) {
					Static354.anInt6183 = 0;
					Static249.anInt4623 = -5;
					return;
				}
				Static354.anInt6183 = 1;
				Static348.anInt5976 = 0;
				if (Static313.anInt5436 == Static407.anInt6723) {
					Static407.anInt6723 = Static97.anInt1949;
				} else {
					Static407.anInt6723 = Static313.anInt5436;
				}
				Static119.anInt2524++;
			}
			if (Static354.anInt6183 == 1) {
				Static36.aClass199_3 = Static206.aClass66_4.method1728(Static321.aString54, Static407.anInt6723);
				Static354.anInt6183 = 2;
			}
			@Pc(120) int local120;
			if (Static354.anInt6183 == 2) {
				if (Static36.aClass199_3.anInt5760 == 2) {
					throw new IOException();
				}
				if (Static36.aClass199_3.anInt5760 != 1) {
					return;
				}
				Static125.aClass11_5 = new Class11((Socket) Static36.aClass199_3.anObject29, Static206.aClass66_4);
				Static36.aClass199_3 = null;
				Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static329.method4427();
				local120 = Static125.aClass11_5.method139();
				Static329.method4427();
				if (local120 != 21) {
					Static249.anInt4623 = local120;
					Static354.anInt6183 = 0;
					Static125.aClass11_5.method138();
					Static125.aClass11_5 = null;
					return;
				}
				Static354.anInt6183 = 3;
			}
			if (Static354.anInt6183 == 3) {
				if (Static125.aClass11_5.method133() < 1) {
					return;
				}
				Static206.aStringArray16 = new String[Static125.aClass11_5.method139()];
				Static354.anInt6183 = 4;
			}
			if (Static354.anInt6183 == 4 && Static125.aClass11_5.method133() >= Static206.aStringArray16.length * 8) {
				Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
				Static125.aClass11_5.method131(0, Static206.aStringArray16.length * 8, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
				for (local120 = 0; local120 < Static206.aStringArray16.length; local120++) {
					Static206.aStringArray16[local120] = Static44.method763(Static146.aClass4_Sub12_Sub1_3.method2501());
				}
				Static249.anInt4623 = 21;
				Static354.anInt6183 = 0;
				Static125.aClass11_5.method138();
				Static125.aClass11_5 = null;
			}
		} catch (@Pc(214) IOException local214) {
			if (Static125.aClass11_5 != null) {
				Static125.aClass11_5.method138();
				Static125.aClass11_5 = null;
			}
			if (Static119.anInt2524 >= 1) {
				Static354.anInt6183 = 0;
				Static249.anInt4623 = -4;
			} else {
				Static354.anInt6183 = 1;
				if (Static407.anInt6723 == Static313.anInt5436) {
					Static407.anInt6723 = Static97.anInt1949;
				} else {
					Static407.anInt6723 = Static313.anInt5436;
				}
				Static119.anInt2524++;
				Static348.anInt5976 = 0;
			}
		}
	}
}
