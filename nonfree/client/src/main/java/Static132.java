import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!og;")
	public static final Class238 aClass238_3 = new Class238();

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public static int anInt2524 = 0;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_48 = new Class268(46, 6);

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_49 = new Class268(36, 3);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
	public static boolean method2133(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method2134() {
		@Pc(7) client local7 = Static119.aClient1;
		synchronized (Static119.aClient1) {
			if (Static476.aFrame6 == null) {
				@Pc(18) Container local18;
				if (Static70.aFrame3 != null) {
					local18 = Static70.aFrame3;
				} else if (Static42.anApplet1 == null) {
					local18 = Static4.anApplet_Sub1_5;
				} else {
					local18 = Static42.anApplet1;
				}
				Static26.anInt535 = local18.getSize().width;
				Static539.anInt9304 = local18.getSize().height;
				@Pc(42) Insets local42;
				if (Static70.aFrame3 == local18) {
					local42 = Static70.aFrame3.getInsets();
					Static539.anInt9304 -= local42.bottom + local42.top;
					Static26.anInt535 -= local42.left + local42.right;
				}
				if (Static323.method5374() == 1) {
					Static321.anInt6137 = Static507.anInt8741;
					Static356.anInt6630 = Static106.anInt2101;
					Static44.anInt873 = 0;
					Static312.anInt5970 = (Static26.anInt535 - Static507.anInt8741) / 2;
				} else {
					Static340.method5775();
				}
				if (Static212.aClass35_2 != Static418.aClass35_3) {
					@Pc(98) boolean local98;
					if (Static321.anInt6137 < 1024 && Static356.anInt6630 < 768) {
						local98 = true;
					} else {
						local98 = false;
					}
				}
				Static271.aCanvas6.setSize(Static321.anInt6137, Static356.anInt6630);
				if (Static162.aClass100_7 != null) {
					if (Static389.aBoolean497) {
						Static636.method8949(Static271.aCanvas6);
					} else {
						Static162.aClass100_7.method8769(Static271.aCanvas6, Static321.anInt6137, Static356.anInt6630);
					}
				}
				if (local18 == Static70.aFrame3) {
					local42 = Static70.aFrame3.getInsets();
					Static271.aCanvas6.setLocation(local42.left + Static312.anInt5970, local42.top - -Static44.anInt873);
				} else {
					Static271.aCanvas6.setLocation(Static312.anInt5970, Static44.anInt873);
				}
				if (Static554.anInt1822 != -1) {
					Static71.method1267(true);
				}
				Static27.method485();
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Lclient!hb;")
	public static Class6_Sub22 method2135() {
		@Pc(7) Class171 local7 = null;
		@Pc(13) Class6_Sub22 local13 = new Class6_Sub22(Static630.aClass271_17, 0);
		try {
			@Pc(19) Class328 local19 = Static529.aClass112_6.method3241("");
			while (local19.anInt9389 == 0) {
				Static179.method3254(1L);
			}
			if (local19.anInt9389 == 1) {
				local7 = (Class171) local19.anObject21;
				@Pc(43) byte[] local43 = new byte[(int) local7.method4935()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method4930(local43, local45, local43.length - local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class6_Sub22(new Class6_Sub40(local43), Static630.aClass271_17, 0);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(99) Exception local99) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(13, arg1);
		local8.method3723();
		local8.anInt4294 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	public static int method2137() {
		return Static606.method7458(false);
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public static void method2138() throws Exception_Sub1 {
		if (Static469.anInt8256 == 1) {
			Static117.aClass100_5.method8800(Static240.anInt4801, Static617.anInt10193);
		} else {
			Static117.aClass100_5.method8800(0, 0);
		}
	}
}
