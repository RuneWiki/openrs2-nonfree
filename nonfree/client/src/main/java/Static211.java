import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ph", name = "X", descriptor = "Lclient!lo;")
	public static Class4_Sub6_Sub3 aClass4_Sub6_Sub3_2;

	@OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
	public static int anInt4158;

	@OriginalMember(owner = "client!ph", name = "db", descriptor = "Lclient!gl;")
	public static Class4_Sub3_Sub5 aClass4_Sub3_Sub5_3;

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
	public static int anInt4156 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vg;IIBII)Lclient!vg;")
	public static Class53_Sub4 method3440(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = (long) arg3;
		@Pc(24) Class53_Sub4 local24 = (Class53_Sub4) Static164.aClass26_30.method518(local18);
		if (local24 == null) {
			@Pc(32) Class53_Sub3 local32 = Static176.method2765(Static161.aClass58_69, arg3);
			if (local32 == null) {
				return null;
			}
			local24 = local32.method2774(64, 768, -50, -10, -50);
			Static164.aClass26_30.method510(local24, local18);
		}
		@Pc(53) int local53 = arg1.method3866();
		@Pc(56) int local56 = arg1.method3875();
		@Pc(59) int local59 = arg1.method3855();
		@Pc(62) int local62 = arg1.method3878();
		local24 = local24.method3873(true, true, true);
		if (arg0 != 0) {
			local24.method3852(arg0);
		}
		@Pc(108) int local108;
		if (Static94.aBoolean138) {
			@Pc(148) Class53_Sub4_Sub2 local148 = (Class53_Sub4_Sub2) local24;
			if (Static33.method522(arg2 + local59, arg5 - -local53, Static281.anInt5335) != arg4 || arg4 != Static33.method522(arg2 + local62, local56 + arg5, Static281.anInt5335)) {
				for (local108 = 0; local108 < local148.anInt4690; local108++) {
					local148.anIntArray504[local108] += Static33.method522(arg2 + local148.anIntArray502[local108], arg5 + local148.anIntArray507[local108], Static281.anInt5335) - arg4;
				}
				local148.aClass15_1.aBoolean15 = false;
				local148.aClass57_1.aBoolean103 = false;
			}
		} else {
			@Pc(78) Class53_Sub4_Sub1 local78 = (Class53_Sub4_Sub1) local24;
			if (arg4 != Static33.method522(arg2 + local59, local53 + arg5, Static281.anInt5335) || Static33.method522(local62 + arg2, local56 + arg5, Static281.anInt5335) != arg4) {
				for (local108 = 0; local108 < local78.anInt3440; local108++) {
					local78.anIntArray344[local108] += Static33.method522(local78.anIntArray340[local108] + arg2, arg5 + local78.anIntArray347[local108], Static281.anInt5335) - arg4;
				}
				local78.aBoolean244 = false;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(IIIIII)V")
	public static void method3442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static48.anInt902 <= arg0 && arg2 <= Static131.anInt2553 && Static156.anInt3086 <= arg3 && arg1 <= Static218.anInt4231) {
			Static83.method1477(arg3, arg0, arg1, arg4, arg2);
		} else {
			Static141.method4738(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
	public static void method3443() {
		@Pc(7) int local7 = Static255.anInt4860;
		@Pc(9) int local9 = Static300.anInt5626;
		@Pc(16) int local16 = Static228.anInt4381 - Static40.anInt690 - local9;
		@Pc(24) int local24 = Static73.anInt1635 - Static31.anInt526 - local7;
		if (local7 <= 0 && local24 <= 0 && local9 <= 0 && local16 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static122.aFrame1 != null) {
				local47 = Static122.aFrame1;
			} else if (Static172.aFrame2 == null) {
				local47 = Static276.aClass139_4.anApplet1;
			} else {
				local47 = Static172.aFrame2;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local47 == Static172.aFrame2) {
				@Pc(66) Insets local66 = Static172.aFrame2.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local47.getGraphics();
			local75.setColor(Color.black);
			if (local7 > 0) {
				local75.fillRect(local58, local60, local7, Static228.anInt4381);
			}
			if (local9 > 0) {
				local75.fillRect(local58, local60, Static73.anInt1635, local9);
			}
			if (local24 > 0) {
				local75.fillRect(local58 + Static73.anInt1635 - local24, local60, local24, Static228.anInt4381);
			}
			if (local16 > 0) {
				local75.fillRect(local58, local60 + Static228.anInt4381 - local16, Static73.anInt1635, local16);
			}
		} catch (@Pc(127) Exception local127) {
		}
	}
}
