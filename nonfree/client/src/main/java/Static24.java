import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!oa;")
	public static Class7 aClass7_26;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!pa;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static final int anInt733 = 32;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_421 = Static38.method736("Chat panel redrawn");

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
	public static int[] anIntArray88 = new int[128];

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_422 = Static38.method736(" (X");

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
	public static int[] anIntArray89 = new int[1000];

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_423 = Static38.method736("@red@");

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array8 = new Class71[500];

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt738 = 0;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_424 = Static38.method736("An");

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public static int anInt739 = 0;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_425 = Static38.method736(" x");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLclient!ie;)V")
	public static void method552(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class35 arg1) {
		if (Static116.aClass35_3 != null) {
			try {
				Static116.aClass35_3.method961();
			} catch (@Pc(12) Exception local12) {
			}
			Static116.aClass35_3 = null;
		}
		Static116.aClass35_3 = arg1;
		Static1.method13(arg0);
		Static20.aClass5_Sub11_2 = null;
		Static5.aClass5_Sub1_Sub6_1 = null;
		Static34.aClass5_Sub11_3.anInt2233 = 0;
		Static109.anInt2627 = 0;
		while (true) {
			@Pc(33) Class5_Sub1_Sub6 local33 = (Class5_Sub1_Sub6) Static86.aClass57_17.method1579();
			if (local33 == null) {
				while (true) {
					local33 = (Class5_Sub1_Sub6) Static61.aClass57_9.method1579();
					if (local33 == null) {
						if (Static34.aByte3 != 0) {
							try {
								@Pc(85) Class5_Sub11 local85 = new Class5_Sub11(4);
								local85.method1545(4);
								local85.method1545(Static34.aByte3);
								local85.method1501(0);
								Static116.aClass35_3.method967(4, local85.aByteArray23);
							} catch (@Pc(106) IOException local106) {
								try {
									Static116.aClass35_3.method961();
								} catch (@Pc(111) Exception local111) {
								}
								Static20.anInt674++;
								Static116.aClass35_3 = null;
							}
						}
						Static112.anInt2653 = 0;
						Static83.aLong73 = Static50.method959();
						return;
					}
					Static26.aClass6_2.method158(local33);
					Static38.aClass57_4.method1581(local33.aLong118, local33);
					Static8.anInt281++;
					Static65.anInt1634--;
				}
			}
			Static99.aClass57_14.method1581(local33.aLong118, local33);
			Static115.anInt2697++;
			Static108.anInt2619--;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method553() {
		aClass71_424 = null;
		aClass51_1 = null;
		aClass71_422 = null;
		aClass71_425 = null;
		aClass71_423 = null;
		anIntArray89 = null;
		aClass71_421 = null;
		anIntArray88 = null;
		aClass71Array8 = null;
		aClass7_26 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method554(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static41.aClass48_1);
		arg0.addMouseMotionListener(Static41.aClass48_1);
		arg0.addFocusListener(Static41.aClass48_1);
	}
}
