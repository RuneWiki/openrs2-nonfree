import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static65.anInt1203; local7++) {
			@Pc(13) Rectangle local13 = Class6_Sub1_Sub7.aRectangleArray2[local7];
			if (local13.width + local13.x > arg3 && arg0 + arg3 > local13.x && local13.y + local13.height > arg2 && local13.y < arg2 + arg1) {
				Static504.aBooleanArray24[local7] = true;
			}
		}
		Static629.method8681(arg0 + arg3, arg2, arg1 + arg2, arg3);
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Lclient!hv;")
	public static Class6_Sub24 method1676() {
		if (Static528.aClass362_26 == null || Static324.aClass364_1 == null) {
			return null;
		}
		for (@Pc(18) Class6_Sub24 local18 = (Class6_Sub24) Static324.aClass364_1.method8572(); local18 != null; local18 = (Class6_Sub24) Static324.aClass364_1.method8572()) {
			@Pc(33) Class318 local33 = Static528.aClass280_3.method6911(local18.anInt3909);
			if (local33 != null && local33.aBoolean617 && local33.method7386(Static528.anInterface19_2)) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!pja;I)Ljava/lang/String;")
	public static String method1677(@OriginalArg(0) Class6_Sub4_Sub12 arg0) {
		if (arg0.aString99 == null || arg0.aString99.length() == 0) {
			return arg0.aString98 == null || arg0.aString98.length() <= 0 ? arg0.aString100 : arg0.aString100 + Static52.aClass41_32.method1007(Static616.anInt10077) + arg0.aString98;
		} else if (arg0.aString98 == null || arg0.aString98.length() <= 0) {
			return arg0.aString100 + Static52.aClass41_32.method1007(Static616.anInt10077) + arg0.aString99;
		} else {
			return arg0.aString100 + Static52.aClass41_32.method1007(Static616.anInt10077) + arg0.aString98 + Static52.aClass41_32.method1007(Static616.anInt10077) + arg0.aString99;
		}
	}
}
