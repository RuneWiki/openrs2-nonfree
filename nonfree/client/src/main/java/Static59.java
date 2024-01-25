import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	public static int anInt1655;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_9 = new Class316(4);

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
	public static int anInt1653 = -1;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "[I")
	public static final int[] anIntArray155 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "[I")
	public static final int[] anIntArray156 = new int[1000];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)Z")
	public static boolean method1636(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Canvas;ZLclient!n;)Lclient!qa;")
	public static Class9 method1639(@OriginalArg(1) Canvas arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface8 arg2) {
		return arg1 ? new Class9_Sub2_Sub2(arg0, arg2) : new Class9_Sub2_Sub1(arg0, arg2);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!qa;Lclient!jj;IILclient!bc;B)Z")
	public static boolean method1640(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class1_Sub25 arg1, @OriginalArg(4) Class24 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(16) int local16 = Integer.MIN_VALUE;
		if (arg2.anIntArray117 != null) {
			local5 = (arg2.anInt1161 + arg1.anInt4561 - Static451.anInt3561) * (Static451.anInt3557 - Static451.anInt3556) / (Static451.anInt3560 - Static451.anInt3561) + Static451.anInt3556;
			local7 = (arg1.anInt4561 + arg2.anInt1174 - Static451.anInt3561) * (Static451.anInt3557 - Static451.anInt3556) / (Static451.anInt3560 - Static451.anInt3561) + Static451.anInt3556;
			local16 = Static451.anInt3554 - (arg2.anInt1162 + arg1.anInt4557 - Static451.anInt3559) * (-Static451.anInt3552 + Static451.anInt3554) / (Static451.anInt3562 - Static451.anInt3559);
			local14 = Static451.anInt3554 - (Static451.anInt3554 - Static451.anInt3552) * (-Static451.anInt3559 + arg1.anInt4557 + arg2.anInt1156) / (Static451.anInt3562 - Static451.anInt3559);
		}
		@Pc(107) Class12 local107 = null;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (arg2.anInt1173 != -1) {
			if (arg1.aBoolean277 && arg2.anInt1166 != -1) {
				local107 = arg2.method1188(true, arg0);
			} else {
				local107 = arg2.method1188(false, arg0);
			}
			if (local107 != null) {
				local109 = arg1.anInt4559 - (local107.EA() + 1 >> 1);
				if (local109 < local5) {
					local5 = local109;
				}
				local111 = arg1.anInt4559 + (local107.EA() + 1 >> 1);
				local113 = arg1.anInt4558 - (local107.ma() + 1 >> 1);
				if (local111 > local7) {
					local7 = local111;
				}
				local115 = arg1.anInt4558 + (local107.ma() + 1 >> 1);
				if (local113 < local14) {
					local14 = local113;
				}
				if (local16 < local115) {
					local16 = local115;
				}
			}
		}
		@Pc(211) Class210 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(273) int local273;
		@Pc(299) int local299;
		if (arg2.aString3 != null) {
			local211 = Static504.method7229(arg2.anInt1155);
			if (local211 != null) {
				local213 = Static179.aClass177_4.method4667(null, Static294.aStringArray22, null, arg2.aString3);
				local215 = arg1.anInt4558;
				if (local107 == null) {
					local215 -= local211.method5453() * local213 / 2;
				} else {
					local215 -= (local107.ma() >> 1) + local211.method5452() * local213;
				}
				for (local273 = 0; local273 < local213; local273++) {
					@Pc(278) String local278 = Static294.aStringArray22[local273];
					if (local213 - 1 > local273) {
						local278 = local278.substring(0, local278.length() - 4);
					}
					local299 = local211.method5456(local278);
					if (local299 > local217) {
						local217 = local299;
					}
				}
				local219 = arg1.anInt4559 - local217 / 2;
				if (local219 < local5) {
					local5 = local219;
				}
				local221 = arg1.anInt4559 + local217 / 2;
				local223 = local215;
				if (local7 < local221) {
					local7 = local221;
				}
				if (local14 > local223) {
					local14 = local223;
				}
				local225 = local211.method5452() * local213 + local215;
				if (local225 > local16) {
					local16 = local225;
				}
			}
		}
		if (local7 < Static451.anInt3556 || Static451.anInt3557 < local5 || Static451.anInt3552 > local16 || Static451.anInt3554 < local14) {
			return true;
		}
		@Pc(414) int local414;
		if (arg2.anIntArray117 != null) {
			@Pc(412) int[] local412 = new int[arg2.anIntArray117.length];
			for (local414 = 0; local414 < local412.length / 2; local414++) {
				local299 = arg2.anIntArray117[local414 * 2] + arg1.anInt4561;
				@Pc(437) int local437 = arg1.anInt4557 + arg2.anIntArray117[local414 * 2 + 1];
				local412[local414 * 2] = (local299 - Static451.anInt3561) * (Static451.anInt3557 - Static451.anInt3556) / (Static451.anInt3560 - Static451.anInt3561) + Static451.anInt3556;
				local412[local414 * 2 + 1] = Static451.anInt3554 - (local437 - Static451.anInt3559) * (-Static451.anInt3552 + Static451.anInt3554) / (Static451.anInt3562 - Static451.anInt3559);
			}
			Static498.method7135(arg0, local412, arg2.anInt1177);
			for (local299 = 0; local299 < local412.length / 2 - 1; local299++) {
				arg0.method7618(local412[local299 * 2 + 1], local412[local299 * 2 + 2 + 1], local412[(local299 + 1) * 2], arg2.anInt1144, local412[local299 * 2]);
			}
			arg0.method7618(local412[local412.length - 1], local412[1], local412[0], arg2.anInt1144, local412[local412.length - 2]);
		}
		if (local107 != null) {
			if (Static173.anInt3748 > 0 && (Static116.anInt2817 != -1 && Static116.anInt2817 == arg1.anInt4556 || Static388.anInt6745 != -1 && Static388.anInt6745 == arg2.anInt1169)) {
				if (Static527.anInt8941 <= 50) {
					local273 = Static527.anInt8941 * 2;
				} else {
					local273 = 200 - Static527.anInt8941 * 2;
				}
				local414 = local273 << 24 | 0xFFFF00;
				arg0.method7633(local107.c() / 2 + 7, local414, arg1.anInt4559, arg1.anInt4558);
				arg0.method7633(local107.c() / 2 + 5, local414, arg1.anInt4559, arg1.anInt4558);
				arg0.method7633(local107.c() / 2 + 3, local414, arg1.anInt4559, arg1.anInt4558);
				arg0.method7633(local107.c() / 2 + 1, local414, arg1.anInt4559, arg1.anInt4558);
				arg0.method7633(local107.c() / 2, local414, arg1.anInt4559, arg1.anInt4558);
			}
			local107.method7191(arg1.anInt4559 - (local107.EA() >> 1), arg1.anInt4558 - (local107.ma() >> 1));
		}
		if (arg2.aString3 != null && local211 != null) {
			Static85.method2081(arg0, local211, local217, arg1, local215, arg2, local213);
		}
		if (arg2.anInt1173 != -1 || arg2.aString3 != null) {
			@Pc(720) Class1_Sub18 local720 = new Class1_Sub18(arg1);
			local720.anInt3225 = local111;
			local720.anInt3218 = local113;
			local720.anInt3220 = local221;
			local720.anInt3224 = local115;
			local720.anInt3228 = local219;
			local720.anInt3227 = local223;
			local720.anInt3219 = local225;
			local720.anInt3229 = local109;
			Static263.aClass38_39.method1426(local720);
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ica;I)V")
	public static void method1643(@OriginalArg(0) Class47_Sub2_Sub3_Sub1 arg0) {
		for (@Pc(8) Class1_Sub9 local8 = (Class1_Sub9) Static94.aClass38_20.method1419(); local8 != null; local8 = (Class1_Sub9) Static94.aClass38_20.method1415()) {
			if (arg0 == local8.aClass47_Sub2_Sub3_Sub1_1) {
				if (local8.aClass1_Sub12_Sub1_2 != null) {
					Static445.aClass1_Sub12_Sub3_2.method6363(local8.aClass1_Sub12_Sub1_2);
					local8.aClass1_Sub12_Sub1_2 = null;
				}
				local8.method7983();
				return;
			}
		}
	}
}
