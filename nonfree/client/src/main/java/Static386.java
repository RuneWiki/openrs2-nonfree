import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "Lclient!lb;")
	public static Class221 aClass221_79;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
	public static int anInt4765 = 0;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_86 = new Class186(17, 8);

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)Lclient!rba;")
	public static Class3_Sub28 method3990() {
		@Pc(8) Class3_Sub28 local8 = Static582.method8679();
		local8.method5319(0L);
		local8.method5283(Static321.aString95);
		local8.method5319(Static669.aLong366);
		local8.method5319(Static31.aLong261);
		local8.method5310(Static19.aBigInteger1, Static691.aBigInteger5);
		return local8;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method3991(@OriginalArg(0) Class67 arg0) {
		if (Static106.anInt1679 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 && (Static584.aClass262ArrayArrayArray2 != null && Static685.method9029(arg0, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146))) {
			Static106.anInt1679 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146;
		}
	}

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "(I)V")
	public static void method3992() {
		if (Static556.anInt9262 == 0) {
			return;
		}
		try {
			if (++Static89.anInt1480 > 2000) {
				Static532.aClass400_2.method9229();
				if (Static209.anInt3622 >= 2) {
					Static556.anInt9262 = 0;
					Static605.anInt9840 = -5;
					return;
				}
				Static60.aClass314_1.method7592();
				Static89.anInt1480 = 0;
				Static209.anInt3622++;
				Static556.anInt9262 = 1;
			}
			if (Static556.anInt9262 == 1) {
				Static532.aClass400_2.aClass201_9 = Static60.aClass314_1.method7595(Static310.aClass47_4);
				Static556.anInt9262 = 2;
			}
			if (Static556.anInt9262 == 2) {
				if (Static532.aClass400_2.aClass201_9.anInt5729 == 2) {
					throw new IOException();
				}
				if (Static532.aClass400_2.aClass201_9.anInt5729 != 1) {
					return;
				}
				Static532.aClass400_2.aClass255_2 = Static557.method7807((Socket) Static532.aClass400_2.aClass201_9.anObject16);
				Static532.aClass400_2.aClass201_9 = null;
				Static532.aClass400_2.method9227();
				Static556.anInt9262 = 4;
			}
			if (Static556.anInt9262 == 4 && Static532.aClass400_2.aClass255_2.method6264(1)) {
				Static532.aClass400_2.aClass255_2.method6260(1, Static532.aClass400_2.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				@Pc(139) int local139 = Static532.aClass400_2.aClass3_Sub28_Sub2_2.aByteArray50[0] & 0xFF;
				Static605.anInt9840 = local139;
				Static556.anInt9262 = 0;
				Static532.aClass400_2.method9229();
			}
		} catch (@Pc(148) IOException local148) {
			Static532.aClass400_2.method9229();
			if (Static209.anInt3622 < 2) {
				Static60.aClass314_1.method7592();
				Static209.anInt3622++;
				Static556.anInt9262 = 1;
				Static89.anInt1480 = 0;
			} else {
				Static605.anInt9840 = -4;
				Static556.anInt9262 = 0;
			}
		}
	}
}
