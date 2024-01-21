import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!p;")
	public static Class45 aClass45_26;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_482 = Static13.method257("Username: ");

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_483 = Static13.method257("You have not yet set*6nany contact details)3");

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_484 = Static13.method257("Continue");

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt1669 = 0;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_485 = Static13.method257("To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y");

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!o;")
	private static Class40 aClass40_489 = Static13.method257("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_486 = aClass40_489;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_487 = Static13.method257("backvmid2");

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_488 = Static13.method257("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int anInt1675 = 0;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
	public static int[] anIntArray339 = new int[2000];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1096() {
		aClass40_486 = null;
		aClass40_488 = null;
		aClass40_482 = null;
		anIntArray339 = null;
		aClass40_487 = null;
		aClass40_484 = null;
		aClass45_26 = null;
		aClass40_485 = null;
		aClass40_483 = null;
		aClass40_489 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1097(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static81.aClass62_1);
		arg0.addMouseMotionListener(Static81.aClass62_1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
	public static void method1098(@OriginalArg(0) boolean arg0) {
		Static91.anInt2146++;
		if (Static91.anInt2146 < 50 && !arg0) {
			return;
		}
		Static91.anInt2146 = 0;
		if (Static76.aBoolean164 || Static70.aClass25_36 == null) {
			return;
		}
		Static80.aClass2_Sub3_Sub1_4.method1736(217);
		try {
			Static70.aClass25_36.method731(Static80.aClass2_Sub3_Sub1_4.aByteArray24, Static80.aClass2_Sub3_Sub1_4.anInt2546);
			Static80.aClass2_Sub3_Sub1_4.anInt2546 = 0;
		} catch (@Pc(40) IOException local40) {
			Static76.aBoolean164 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1099() {
		if (Static91.anInt2139 == 2) {
			Static104.method1667(Static80.anInt1917 * 2, (Static16.anInt410 - Static87.anInt2058 << 7) + Static19.anInt441, Static58.anInt1493 + (-Static30.anInt725 + Static83.anInt1952 << 7));
			if (Static17.anInt426 > -1 && Static107.anInt2511 % 20 < 10) {
				Static101.aClass2_Sub2_Sub2_Sub4Array10[0].method1624(Static17.anInt426 - 12, Static20.anInt477 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)I")
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method1101() {
		@Pc(7) Class30 local7 = Static73.aClass30_1;
		synchronized (Static73.aClass30_1) {
			Static45.anInt1094 = Static19.anInt437;
			@Pc(20) int local20;
			if (Static37.anInt949 >= 0) {
				while (Static37.anInt949 != Static96.anInt2342) {
					local20 = Static76.anIntArray470[Static96.anInt2342];
					Static96.anInt2342 = Static96.anInt2342 + 1 & 0x7F;
					if (local20 >= 0) {
						Static100.aBooleanArray37[local20] = true;
					} else {
						Static100.aBooleanArray37[~local20] = false;
					}
				}
			} else {
				for (local20 = 0; local20 < 112; local20++) {
					Static100.aBooleanArray37[local20] = false;
				}
				Static37.anInt949 = Static96.anInt2342;
			}
			Static19.anInt437 = Static95.anInt2226;
		}
	}
}
