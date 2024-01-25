import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!pq;")
	public static Class251 aClass251_144;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public static int anInt8716;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_18 = new Class165(7, 1);

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static final int anInt8717 = 52;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
	public static int anInt8718 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
	public static void method7095() {
		@Pc(5) Class332 local5 = Static189.aClass332_83;
		synchronized (Static189.aClass332_83) {
			Static189.aClass332_83.method7497(5);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!hc;)Lclient!dh;")
	public static Class66 method7111(@OriginalArg(1) int arg0, @OriginalArg(2) Class29_Sub2 arg1) {
		@Pc(7) Class66 local7;
		if (Static110.aClass66_3 == null) {
			local7 = new Class66();
		} else {
			local7 = Static110.aClass66_3;
			Static110.aClass66_3 = Static110.aClass66_3.aClass66_2;
			local7.aClass66_2 = null;
			Static299.anInt4836--;
		}
		local7.anInt1518 = arg0;
		local7.aClass29_Sub2_1 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!pq;ILjava/awt/Canvas;Lclient!e;)Lclient!oa;")
	public static synchronized Class121 method7144(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface7 arg4) {
		if (arg2 == 0) {
			return Static274.method2855(false, arg4, arg3);
		} else if (arg2 == 2) {
			return Static364.method5383(arg3, arg4);
		} else if (arg2 == 4) {
			return Static274.method2855(true, arg4, arg3);
		} else if (arg2 == 1) {
			return Static32.method461(arg0, arg3, arg4);
		} else if (arg2 == 5) {
			return Static244.method3523(arg0, arg3, arg4, arg1);
		} else if (arg2 == 3) {
			return Static584.method2961(arg1, arg3, arg0, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	public static void method7153(@OriginalArg(0) int arg0) {
		if (Static466.anInt7907 == 1) {
			Static350.anInt6170 = arg0;
		} else if (Static466.anInt7907 == 2 || Static466.anInt7907 == 3) {
			Static350.anInt6166 = arg0;
		}
	}
}
