import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!pi", name = "ib", descriptor = "Lclient!ke;")
	public static Class52 aClass52_34;

	@OriginalMember(owner = "client!pi", name = "nb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!pi", name = "rb", descriptor = "Lclient!rc;")
	public static Class82 aClass82_5;

	@OriginalMember(owner = "client!pi", name = "ub", descriptor = "Lclient!v;")
	public static Class3_Sub3_Sub2_Sub4_Sub1 aClass3_Sub3_Sub2_Sub4_Sub1_6;

	@OriginalMember(owner = "client!pi", name = "mb", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_84 = new Class10();

	@OriginalMember(owner = "client!pi", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1511 = Static193.method3027("(Udns");

	@OriginalMember(owner = "client!pi", name = "pb", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_85 = new Class10();

	@OriginalMember(owner = "client!pi", name = "qb", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!pi", name = "sb", descriptor = "I")
	public static int anInt3166 = 127;

	@OriginalMember(owner = "client!pi", name = "tb", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[520];

	@OriginalMember(owner = "client!pi", name = "vb", descriptor = "I")
	public static int anInt3167 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)V")
	public static void method2263(@OriginalArg(0) boolean arg0) {
		if (Static65.anInt1365 == Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7 && Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7 == Static101.anInt2072) {
			Static65.anInt1365 = 0;
		}
		@Pc(29) int local29 = Static80.anInt1607;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(52) Class26_Sub2_Sub1 local52;
			@Pc(46) long local46;
			if (arg0) {
				local52 = Static144.aClass26_Sub2_Sub1_1;
				local46 = 8791798054912L;
			} else {
				local46 = (long) Static76.anIntArray81[local35] << 32;
				local52 = Static146.aClass26_Sub2_Sub1Array1[Static76.anIntArray81[local35]];
			}
			if (local52 != null && local52.method1861()) {
				local52.aBoolean100 = false;
				if ((Static50.aBoolean66 && Static80.anInt1607 > 50 || Static80.anInt1607 > 200) && !arg0 && local52.anInt2596 == local52.anInt2594) {
					local52.aBoolean100 = true;
				}
				@Pc(92) int local92 = local52.anInt2593 >> 7;
				@Pc(97) int local97 = local52.anInt2611 >> 7;
				if (local92 >= 0 && local92 < 104 && local97 >= 0 && local97 < 104) {
					if (local52.aClass26_Sub6_1 == null || Static184.anInt3760 < local52.anInt1953 || local52.anInt1963 <= Static184.anInt3760) {
						if ((local52.anInt2593 & 0x7F) == 64 && (local52.anInt2611 & 0x7F) == 64) {
							if (Static139.anInt4130 == Static118.anIntArrayArray15[local92][local97]) {
								continue;
							}
							Static118.anIntArrayArray15[local92][local97] = Static139.anInt4130;
						}
						local52.anInt2636 = Static107.method2399(local52.anInt2611, local52.anInt2593, Static137.anInt2795);
						Static200.method3182(Static137.anInt2795, local52.anInt2593, local52.anInt2611, local52.anInt2636, 60, local52, local52.anInt2605, local46, local52.aBoolean129);
					} else {
						local52.aBoolean100 = false;
						local52.anInt2636 = Static107.method2399(local52.anInt2611, local52.anInt2593, Static137.anInt2795);
						Static58.method918(Static137.anInt2795, local52.anInt2593, local52.anInt2611, local52.anInt2636, local52, local52.anInt2605, local46, local52.anInt1962, local52.anInt1961, local52.anInt1954, local52.anInt1951);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2264(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static94.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static52.aClass44_1);
		arg0.addFocusListener(Static52.aClass44_1);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)Lclient!ge;")
	public static Class3_Sub3_Sub12 method2266(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub3_Sub12 local6 = (Class3_Sub3_Sub12) Static39.aClass85_4.method2558((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32 = Static109.aClass52_25.method1581(Static87.method3322(arg0), Static14.method278(arg0));
		local6 = new Class3_Sub3_Sub12();
		if (local32 != null) {
			local6.method1007(new Class3_Sub4(local32));
		}
		Static39.aClass85_4.method2560(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Z")
	public static boolean method2267(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(B)V")
	public static void method2268() {
		@Pc(5) int local5 = aClass3_Sub3_Sub2_Sub4_Sub1_6.method3115(Static14.aClass70_142);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static35.anInt770; local11++) {
			local19 = aClass3_Sub3_Sub2_Sub4_Sub1_6.method3115(Static44.method723(local11));
			if (local5 < local19) {
				local5 = local19;
			}
		}
		Static134.aBoolean131 = true;
		local19 = Static35.anInt770 * 15 + 21;
		local5 += 8;
		Static85.anInt1693 = Static35.anInt770 * 15 + 22;
		@Pc(57) int local57 = Static96.anInt2006;
		@Pc(64) int local64 = Static124.anInt3874 - local5 / 2;
		Static36.anInt795 = local5;
		if (Static203.anInt4148 < local19 + local57) {
			local57 = Static203.anInt4148 - local19;
		}
		if (local5 + local64 > Static41.anInt876) {
			local64 = Static41.anInt876 - local5;
		}
		if (local64 < 0) {
			local64 = 0;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		Static36.anInt796 = local57;
		Static199.anInt4049 = local64;
	}
}
