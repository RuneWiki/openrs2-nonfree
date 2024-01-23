import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!o", name = "w", descriptor = "I")
	public static int anInt3656;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!cc;")
	public static Class26 aClass26_37 = new Class26(100);

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
	public static int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method3069() {
		Static189.aClass4_Sub10_Sub1_2.method4679();
		@Pc(13) int local13 = Static189.aClass4_Sub10_Sub1_2.method4689(8);
		@Pc(23) int local23;
		if (local13 < Static236.anInt4452) {
			for (local23 = local13; local23 < Static236.anInt4452; local23++) {
				Static68.anIntArray99[Static213.anInt4195++] = Static278.anIntArray595[local23];
			}
		}
		if (local13 > Static236.anInt4452) {
			throw new RuntimeException("gnpov1");
		}
		Static236.anInt4452 = 0;
		for (local23 = 0; local23 < local13; local23++) {
			@Pc(73) int local73 = Static278.anIntArray595[local23];
			@Pc(77) Class53_Sub1_Sub2 local77 = Static110.aClass53_Sub1_Sub2Array1[local73];
			@Pc(82) int local82 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			if (local82 == 0) {
				Static278.anIntArray595[Static236.anInt4452++] = local73;
				local77.anInt3990 = Static50.anInt954;
			} else {
				@Pc(106) int local106 = Static189.aClass4_Sub10_Sub1_2.method4689(2);
				if (local106 == 0) {
					Static278.anIntArray595[Static236.anInt4452++] = local73;
					local77.anInt3990 = Static50.anInt954;
					Static275.anIntArray587[Static250.anInt4761++] = local73;
				} else {
					@Pc(151) int local151;
					@Pc(161) int local161;
					if (local106 == 1) {
						Static278.anIntArray595[Static236.anInt4452++] = local73;
						local77.anInt3990 = Static50.anInt954;
						local151 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
						local77.method3321(local151, 1);
						local161 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
						if (local161 == 1) {
							Static275.anIntArray587[Static250.anInt4761++] = local73;
						}
					} else if (local106 == 2) {
						Static278.anIntArray595[Static236.anInt4452++] = local73;
						local77.anInt3990 = Static50.anInt954;
						if (Static189.aClass4_Sub10_Sub1_2.method4689(1) == 1) {
							local151 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local77.method3321(local151, 2);
							local161 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local77.method3321(local161, 2);
						} else {
							local151 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
							local77.method3321(local151, 0);
						}
						local151 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
						if (local151 == 1) {
							Static275.anIntArray587[Static250.anInt4761++] = local73;
						}
					} else if (local106 == 3) {
						Static68.anIntArray99[Static213.anInt4195++] = local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method3072(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(13) String local13 = "";
			if (arg0 != null) {
				local13 = Static48.method744(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local13 = local13 + " | ";
				}
				local13 = local13 + arg1;
			}
			Static164.method2664(local13);
			local13 = Static241.method3773(local13, "%3a", ":");
			local13 = Static241.method3773(local13, "%40", "@");
			local13 = Static241.method3773(local13, "%26", "&");
			local13 = Static241.method3773(local13, "%23", "#");
			if (Static179.aClass139_3.anApplet1 == null) {
				return;
			}
			@Pc(115) Class185 local115 = Static179.aClass139_3.method3507(new URL(Static179.aClass139_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static277.anInt5283 + "&u=" + Static28.aLong23 + "&v1=" + Static215.aString256 + "&v2=" + Static215.aString253 + "&e=" + local13));
			while (local115.anInt5623 == 0) {
				Static303.method4677(1L);
			}
			if (local115.anInt5623 == 1) {
				@Pc(133) DataInputStream local133 = (DataInputStream) local115.anObject7;
				local133.read();
				local133.close();
			}
		} catch (@Pc(140) Exception local140) {
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method3074() {
		Static113.aClass26_22.method517(5);
		Static13.aClass26_2.method517(5);
		Static195.aClass26_39.method517(5);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lclient!co;")
	public static Class33 method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(22) Class33 local22 = local7.aClass33Array3[local13];
			if ((local22.aLong38 >> 29 & 0x3L) == 2L && local22.anInt824 == arg1 && local22.anInt826 == arg2) {
				return local22;
			}
		}
		return null;
	}
}
