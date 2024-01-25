import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static final int anInt8055 = 1405;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public static final int anInt8059 = 2;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[B)I")
	public static int method6981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg1; local17 < arg0; local17++) {
			local7 = local7 >>> 8 ^ Class5_Sub2_Sub31.anIntArray684[(arg2[local17] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBLclient!d;Lclient!wu;ILjava/awt/Canvas;)Lclient!ha;")
	public static synchronized Class126 method6999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) Class384 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Canvas arg6) {
		if (arg5 == 0) {
			return Static364.method5694(arg0, arg3, arg1, arg6);
		} else if (arg5 == 2) {
			return Static507.method8443(arg0, arg1, arg6, arg3);
		} else if (arg5 == 1) {
			return Static425.method6397(arg3, arg2, arg6);
		} else if (arg5 == 5) {
			return Static345.method5280(arg4, arg3, arg6, arg2);
		} else if (arg5 == 3) {
			return Static659.method8526(arg2, arg6, arg3, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method7027() {
		Static637.method8778(Static629.aClass357_15);
		Static389.anInt6784++;
		if (Static226.aBoolean324 && Static523.aBoolean713) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static144.aBoolean196) {
				local26 = Static577.method8147();
				local28 = Static601.method8395();
			}
			@Pc(43) int local43 = Static81.aClass13_1.method6355() + local26;
			@Pc(49) int local49 = local28 + Static81.aClass13_1.method6347();
			local43 -= Static254.anInt4284;
			local49 -= Static466.anInt7864;
			if (local43 < Static645.anInt10431) {
				local43 = Static645.anInt10431;
			}
			if (Static645.anInt10431 + Static536.aClass357_10.anInt9852 < local43 + Static629.aClass357_15.anInt9852) {
				local43 = Static645.anInt10431 + Static536.aClass357_10.anInt9852 - Static629.aClass357_15.anInt9852;
			}
			if (local49 < Static511.anInt8568) {
				local49 = Static511.anInt8568;
			}
			if (Static511.anInt8568 + Static536.aClass357_10.anInt9797 < local49 + Static629.aClass357_15.anInt9797) {
				local49 = Static536.aClass357_10.anInt9797 + Static511.anInt8568 - Static629.aClass357_15.anInt9797;
			}
			@Pc(131) int local131 = local43 + Static536.aClass357_10.anInt9814 - Static645.anInt10431;
			@Pc(140) int local140 = local49 + Static536.aClass357_10.anInt9819 - Static511.anInt8568;
			@Pc(155) Class5_Sub9 local155;
			if (Static81.aClass13_1.method6346()) {
				if (Static629.aClass357_15.anInt9789 < Static389.anInt6784) {
					@Pc(228) int local228 = local43 - Static161.anInt2819;
					@Pc(232) int local232 = local49 - Static599.anInt9774;
					if (local228 > Static629.aClass357_15.anInt9805 || local228 < -Static629.aClass357_15.anInt9805 || Static629.aClass357_15.anInt9805 < local232 || -Static629.aClass357_15.anInt9805 > local232) {
						Static243.aBoolean334 = true;
					}
				}
				if (Static629.aClass357_15.anObjectArray22 != null && Static243.aBoolean334) {
					local155 = new Class5_Sub9();
					local155.aClass357_2 = Static629.aClass357_15;
					local155.anInt916 = local131;
					local155.anInt911 = local140;
					local155.anObjectArray1 = Static629.aClass357_15.anObjectArray22;
					Static82.method1317(local155);
				}
			} else {
				if (Static243.aBoolean334) {
					Static2.method24();
					if (Static629.aClass357_15.anObjectArray29 != null) {
						local155 = new Class5_Sub9();
						local155.anInt916 = local131;
						local155.aClass357_2 = Static629.aClass357_15;
						local155.anInt911 = local140;
						local155.anObjectArray1 = Static629.aClass357_15.anObjectArray29;
						local155.aClass357_3 = Static501.aClass357_11;
						Static82.method1317(local155);
					}
					if (Static501.aClass357_11 != null && Static74.method1223(Static629.aClass357_15) != null) {
						Static18.method450(Static629.aClass357_15, Static501.aClass357_11);
					}
				} else if ((Static559.anInt9207 == 1 || Static357.method5620()) && Static642.anInt10370 > 2) {
					Static145.method6157(Static599.anInt9774 + Static466.anInt7864, Static254.anInt4284 + Static161.anInt2819);
				} else if (Static579.method8156()) {
					Static145.method6157(Static466.anInt7864 + Static599.anInt9774, Static161.anInt2819 + Static254.anInt4284);
				}
				Static629.aClass357_15 = null;
			}
		} else if (Static389.anInt6784 > 1) {
			Static629.aClass357_15 = null;
		}
	}
}
