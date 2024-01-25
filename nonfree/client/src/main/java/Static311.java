import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	public static int anInt5991;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	public static int anInt5995;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!b;")
	public static Class16 aClass16_24;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public static int anInt5998;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	public static int anInt5989 = -1;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
	public static final int[] anIntArray750 = new int[14];

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString238 = " has logged out.";

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	public static int anInt5994 = 2;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public static int anInt5996 = 0;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method5241() {
		if (Static34.aClass2_6.method3274()) {
			Static174.method3444();
			Static34.aClass2_6.method3287(Static261.aCanvas4);
			Static228.method4134();
		} else {
			Static263.method4608(Static258.anInt5029);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!aa;I[Lclient!ie;IZI[B)V")
	public static void method5242(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(15) Class1_Sub7 local15 = new Class1_Sub7(arg5);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method3110();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method3145();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(64) int local64 = local15.method3141();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(76) int local76 = arg4 + local54;
				@Pc(81) int local81 = local48 + arg1;
				if (local76 > 0 && local81 > 0 && local76 < Static48.anInt1107 - 1 && Static337.anInt6402 - 1 > local81) {
					@Pc(97) Class91 local97 = null;
					if (!arg3) {
						@Pc(101) int local101 = local58;
						if ((Static183.aByteArrayArrayArray7[1][local76][local81] & 0x2) == 2) {
							local101 = local58 - 1;
						}
						if (local101 >= 0) {
							local97 = arg2[local101];
						}
					}
					Static293.method5028(local97, local72, -1, true, arg0, local81, local58, local76, arg3, local68, local58, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method5243() {
		@Pc(5) Class140 local5 = Static344.aClass140_169;
		synchronized (Static344.aClass140_169) {
			Static344.aClass140_169.method3824(5);
		}
		local5 = Static249.aClass140_129;
		synchronized (Static249.aClass140_129) {
			Static249.aClass140_129.method3824(5);
		}
		local5 = Static152.aClass140_78;
		synchronized (Static152.aClass140_78) {
			Static152.aClass140_78.method3824(5);
		}
		local5 = Static210.aClass140_111;
		synchronized (Static210.aClass140_111) {
			Static210.aClass140_111.method3824(5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z")
	public static boolean method5244() {
		if (Static4.aBoolean16) {
			try {
				if ((Boolean) Static365.method4929(Static180.aClass110_6.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public static void method5245(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(10, arg0);
		local8.method167();
	}
}
