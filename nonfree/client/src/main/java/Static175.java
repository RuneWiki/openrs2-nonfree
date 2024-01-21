import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_94;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!ub;")
	public static Class4_Sub2_Sub4 aClass4_Sub2_Sub4_2;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1429 = Static177.method3050("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1430 = Static177.method3050("<col=ffffff>");

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1433 = Static177.method3050("Unable to find ");

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1431 = aClass46_1433;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1432 = Static177.method3050("T");

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public static int anInt3926 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZILclient!fd;)V")
	public static void method3010(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class27 arg1) {
		if (Static110.aClass27_5 != null) {
			try {
				Static110.aClass27_5.method952();
			} catch (@Pc(8) Exception local8) {
			}
			Static110.aClass27_5 = null;
		}
		Static110.aClass27_5 = arg1;
		Static43.method728(arg0);
		Static42.anInt1069 = 0;
		Static104.aClass4_Sub11_4 = null;
		Static182.aClass4_Sub1_Sub16_1 = null;
		Static14.aClass4_Sub11_1.anInt1597 = 0;
		while (true) {
			@Pc(38) Class4_Sub1_Sub16 local38 = (Class4_Sub1_Sub16) Static167.aClass20_13.method504();
			if (local38 == null) {
				while (true) {
					local38 = (Class4_Sub1_Sub16) Static113.aClass20_6.method504();
					if (local38 == null) {
						if (Static131.aByte7 != 0) {
							try {
								@Pc(90) Class4_Sub11 local90 = new Class4_Sub11(4);
								local90.method1238(4);
								local90.method1238(Static131.aByte7);
								local90.method1268(0);
								Static110.aClass27_5.method957(local90.aByteArray19, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									Static110.aClass27_5.method952();
								} catch (@Pc(116) Exception local116) {
								}
								Static39.anInt1037++;
								Static110.aClass27_5 = null;
							}
						}
						Static164.anInt3611 = 0;
						Static159.aLong127 = Static149.method2559();
						return;
					}
					Static140.aClass78_2.method2671(local38);
					Static146.aClass20_9.method499(local38.aLong148, local38);
					Static160.anInt3574--;
					Static66.anInt1813++;
				}
			}
			Static91.aClass20_3.method499(local38.aLong148, local38);
			Static116.anInt2857--;
			Static182.anInt4081++;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Lclient!tf;")
	public static Class86 method3013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1040; local13++) {
			@Pc(19) Class86 local19 = local7.aClass86Array1[local13];
			if ((local19.aLong129 >> 29 & 0x3L) == 2L && local19.anInt3583 == arg1 && local19.anInt3581 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
