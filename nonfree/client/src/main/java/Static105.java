import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Ljava/awt/Font;")
	public static Font aFont32;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array42;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Lclient!r;")
	private static Class61 aClass61_1082 = Static129.method2060("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	public static int anInt3346 = 0;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
	public static int[] anIntArray443 = new int[] { 17, 30, 20, 13, 9, 37, 39, 32 };

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_1083 = aClass61_1082;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "Lclient!r;")
	public static Class61 aClass61_1084 = Static129.method2060("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_1085 = Static129.method2060("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
	public static int anInt3354 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ke;I)Z")
	public static boolean method2171(@OriginalArg(0) Class5_Sub11 arg0) {
		if (arg0.anIntArray240 == null) {
			return false;
		}
		for (@Pc(15) int local15 = 0; local15 < arg0.anIntArray240.length; local15++) {
			@Pc(21) int local21 = Static41.method1509(arg0, local15);
			@Pc(26) int local26 = arg0.anIntArray238[local15];
			if (arg0.anIntArray240[local15] == 2) {
				if (local21 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray240[local15] == 3) {
				if (local21 <= local26) {
					return false;
				}
			} else if (arg0.anIntArray240[local15] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local21 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!r;Lclient!r;ILclient!ff;Lclient!ff;)Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 method2173(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class26 arg3) {
		@Pc(8) int local8 = arg3.method1044(arg0);
		@Pc(22) int local22 = arg3.method1039(arg1, local8);
		return Static58.method1013(local8, local22, arg3, arg2);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIII)V")
	public static void method2174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static30.anInt924 == 0 || arg2 == 0 || Static95.anInt2449 >= 50) {
			return;
		}
		Static108.anIntArray20[Static95.anInt2449] = arg1;
		Static67.anIntArray249[Static95.anInt2449] = arg2;
		Static121.anIntArray363[Static95.anInt2449] = arg0;
		Static45.aClass53Array1[Static95.anInt2449] = null;
		Static10.anIntArray52[Static95.anInt2449] = 0;
		Static95.anInt2449++;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public static void method2175() {
		aClass5_Sub2_Sub1_Sub3Array42 = null;
		aClass61_1082 = null;
		aClass61_1084 = null;
		aClass61_1085 = null;
		anIntArray443 = null;
		aClass61_1083 = null;
		aFont32 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 method2176() {
		@Pc(9) Class5_Sub2_Sub1_Sub4 local9 = new Class5_Sub2_Sub1_Sub4();
		local9.anInt3194 = Static58.anIntArray212[0];
		local9.anInt3191 = Static129.anIntArray393[0];
		local9.anInt3193 = Static48.anIntArray190[0];
		local9.anInt3192 = Static50.anIntArray191[0];
		local9.anInt3195 = Static92.anInt2249;
		local9.anInt3196 = Static93.anInt2432;
		@Pc(47) byte[] local47 = Static67.aByteArrayArray7[0];
		@Pc(53) int local53 = local9.anInt3194 * local9.anInt3192;
		local9.anIntArray386 = new int[local53];
		for (@Pc(59) int local59 = 0; local59 < local53; local59++) {
			local9.anIntArray386[local59] = Static108.anIntArray19[local47[local59] & 0xFF];
		}
		Static87.method1546();
		return local9;
	}
}
