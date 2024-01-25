import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public static int anInt300;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!ja;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
	public static boolean aBoolean25;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
	public static final String aString18 = "wave:";

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[S")
	public static final short[] aShortArray1 = new short[] { 35, 12, 36, 57, 21, 25, 60, 3 };

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!b", name = "D", descriptor = "[C")
	public static final char[] aCharArray1 = new char[128];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public static void method280() {
		Static10.method193(Static354.aCanvas5);
		Static104.method2112(Static354.aCanvas5);
		if (Static74.aClass94_1 != null) {
			Static74.aClass94_1.method5164(Static354.aCanvas5);
		}
		aClient1.method733();
		Static354.aCanvas5.setBackground(Color.black);
		Static298.anInt5639 = -1;
		Static9.method163(Static354.aCanvas5);
		Static110.method2222(Static354.aCanvas5);
		if (Static74.aClass94_1 != null) {
			Static74.aClass94_1.method5163(Static354.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILclient!ja;)V")
	public static void method281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class81 arg2) {
		Static139.aClass14ArrayArray1 = new Class14[arg1][arg0];
		aClass81_1 = arg2;
		if (Static321.anIntArray678 != null) {
			Static316.aClass19_3 = Static324.method5382(Static321.anIntArray678[0], Static321.anIntArray678[3], Static321.anIntArray678[2], Static321.anIntArray678[1], Static321.anIntArray678[5], Static321.anIntArray678[4]);
		}
		Static54.aClass14_1 = new Class14();
		Static207.method3711();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Z")
	public static boolean method282() {
		if (Static23.aBoolean27) {
			try {
				Static365.method3241(Static308.aClass206_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	public static void method283() {
		@Pc(5) Class70 local5 = Static319.aClass70_101;
		synchronized (Static319.aClass70_101) {
			Static319.aClass70_101.method1397(5);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)I")
	public static int method284(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	public static void method285() {
		while (true) {
			if (Static142.aClass6_Sub10_Sub1_3.method2888(Static31.anInt578) >= 11) {
				@Pc(17) int local17 = Static142.aClass6_Sub10_Sub1_3.method2883(11);
				if (local17 != 2047) {
					@Pc(24) boolean local24 = false;
					if (Static343.aClass44_Sub4_Sub4_Sub1Array1[local17] == null) {
						Static343.aClass44_Sub4_Sub4_Sub1Array1[local17] = new Class44_Sub4_Sub4_Sub1();
						Static343.aClass44_Sub4_Sub4_Sub1Array1[local17].anInt5127 = local17;
						if (Static132.aClass6_Sub10Array1[local17] != null) {
							Static343.aClass44_Sub4_Sub4_Sub1Array1[local17].method4478(Static132.aClass6_Sub10Array1[local17]);
						}
						local24 = true;
					}
					Static183.anIntArray400[Static200.anInt3712++] = local17;
					@Pc(65) Class44_Sub4_Sub4_Sub1 local65 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local17];
					local65.anInt5105 = Static76.anInt2853;
					@Pc(73) int local73 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
					if (local73 == 1) {
						Static151.anIntArray352[Static15.anInt281++] = local17;
					}
					@Pc(91) int local91 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
					@Pc(96) int local96 = Static142.aClass6_Sub10_Sub1_3.method2883(5);
					if (local96 > 15) {
						local96 -= 32;
					}
					@Pc(105) int local105 = Static142.aClass6_Sub10_Sub1_3.method2883(5);
					if (local105 > 15) {
						local105 -= 32;
					}
					@Pc(116) int local116 = Static310.anIntArray658[Static142.aClass6_Sub10_Sub1_3.method2883(3)];
					if (local24) {
						local65.method4715(local116);
					}
					local65.method4477(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] + local105, local91 == 1, Static343.anInt6225, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] + local96);
					continue;
				}
			}
			Static142.aClass6_Sub10_Sub1_3.method2884();
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZIII)V")
	public static void method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static311.anInt5837 && Static265.anInt4933 >= arg1 && arg0 >= Static327.anInt3039 && arg2 <= Static230.anInt4308) {
			Static242.method4250(arg1, arg3, arg4, arg2, arg0);
		} else {
			Static204.method3691(arg1, arg4, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Z")
	public static boolean method287() {
		return Static13.anInt232 == 0 ? Static43.aBoolean72 : true;
	}
}
