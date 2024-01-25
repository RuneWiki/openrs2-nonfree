import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_84 = new Class140(5);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBII)V")
	public static void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
		Static248.aClass1_Sub7_Sub1_2.method3108(20);
		Static248.aClass1_Sub7_Sub1_2.method3108(arg1);
		Static248.aClass1_Sub7_Sub1_2.method3108(arg0);
		Static248.aClass1_Sub7_Sub1_2.method3128(arg2);
		Static248.aClass1_Sub7_Sub1_2.method3128(arg3);
		Static183.anInt3821 = 0;
		Static350.anInt6501 = 0;
		Static76.anInt1538 = 1;
		Static202.anInt4091 = -3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method2989(@OriginalArg(1) Class165 arg0) {
		Static4.aClass165_4 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2990(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static290.method4940("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method2991() {
		@Pc(5) Class181 local5 = Static74.aClass181_3;
		synchronized (Static74.aClass181_3) {
			Static151.anInt3836 = Static69.anInt1425;
			Static171.anInt3580++;
			Static179.anInt3693 = Static202.anInt4090;
			Static295.anInt5742 = Static34.anInt831;
			Static269.anInt5189 = Static110.anInt2240;
			Static179.anInt3690 = Static70.anInt1452;
			Static178.anInt3687 = Static10.anInt227;
			Static49.aLong44 = Static9.aLong12;
			Static110.anInt2240 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZ)V")
	public static void method2992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static183.aByteArrayArrayArray7 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!eb;)V")
	public static void method2993(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static346.aClass69_7 != null) {
			@Pc(22) int local22;
			try {
				Static346.aClass69_7.method1917(0L);
				Static346.aClass69_7.method1921(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method3146(local8, 24);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!fe;")
	public static Class1_Sub1_Sub9 method2994(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static338.aClass140_174.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static269.aClass165_80.method4508(arg0, 26);
		local10 = new Class1_Sub1_Sub9();
		if (local29 != null) {
			local10.method1709(new Class1_Sub7(local29));
		}
		Static338.aClass140_174.method3817((long) arg0, local10);
		return local10;
	}
}
