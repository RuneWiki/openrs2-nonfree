import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "Lclient!gg;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZBII)V")
	public static void method4946(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static347.anInt6318 == 0) {
			Static164.method2884(false);
		} else {
			Static148.anInt3279 = Static347.anInt6318;
			Static69.method1302(0);
		}
		Static321.anInt5863 = arg2;
		Static454.anInt7691 = arg3;
		Static85.aBoolean525 = arg1;
		Static210.method5884(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I")
	public static int method4948(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!dn;IZ)Lclient!fk;")
	public static Class3_Sub18 method4949(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1391(arg1);
		return local14 == null ? null : new Class3_Sub18(local14);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method4950(@OriginalArg(1) Class75 arg0) {
		if (Static334.aClass229_38.method5324() == 0) {
			return;
		}
		@Pc(55) Class3_Sub45 local55;
		if (Static347.anInt6318 == 0) {
			for (local55 = (Class3_Sub45) Static334.aClass229_38.method5328(); local55 != null; local55 = (Class3_Sub45) Static334.aClass229_38.method5325()) {
				Static89.aClass157_1.method3839(local55.anInt7544, local55.aBoolean520 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null, local55.anInt7545, local55.anInt7539, local55.anInt7546, false, arg0, arg0, Static183.aClass65_3, local55.anInt7540, false);
				local55.method5987();
			}
			Static357.method5085();
			return;
		}
		if (Static302.aClass75_8 == null) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(36, 32);
			Static302.aClass75_8 = Static318.method2582(Static295.aClass103_5, local25, Static239.anInterface7_8, 0, 0);
			Static391.aClass65_6 = Static302.aClass75_8.method2601(Static334.method4856(Static420.aClass56_87, Static31.anInt838), Static460.method3984(Static20.aClass56_10, Static31.anInt838));
		}
		for (local55 = (Class3_Sub45) Static334.aClass229_38.method5328(); local55 != null; local55 = (Class3_Sub45) Static334.aClass229_38.method5325()) {
			Static89.aClass157_1.method3839(local55.anInt7544, local55.aBoolean520 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null, local55.anInt7545, local55.anInt7539, local55.anInt7546, false, Static302.aClass75_8, arg0, Static391.aClass65_6, local55.anInt7540, false);
			local55.method5987();
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)I")
	public static int method4951(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!gf;)V")
	public static void method4952(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg1.anInt6123 > Static290.anInt5325) {
			Static42.method930(arg1);
		} else if (arg1.anInt6108 >= Static290.anInt5325) {
			Static106.method1821(arg1);
		} else {
			Static247.method3785(false, arg1);
			local7 = Static10.anInt269;
			local5 = Static419.anInt7240;
		}
		if (arg1.anInt6053 < 128 || arg1.anInt6055 < 128 || Static399.anInt6923 * 128 - 128 <= arg1.anInt6053 || Static127.anInt2696 * 128 - 128 <= arg1.anInt6055) {
			arg1.anInt6079 = -1;
			arg1.anInt6104 = -1;
			local5 = -1;
			local7 = 0;
			arg1.anInt6092 = -1;
			arg1.anInt6108 = 0;
			arg1.anInt6123 = 0;
			arg1.anInt6053 = arg1.anIntArray453[0] * 128 + arg1.method4831() * 64;
			arg1.anInt6055 = arg1.anIntArray454[0] * 128 + arg1.method4831() * 64;
			arg1.method4845();
		}
		if (Static113.aClass1_Sub3_Sub3_Sub1_4 == arg1 && (arg1.anInt6053 < 1536 || arg1.anInt6055 < 1536 || arg1.anInt6053 >= Static399.anInt6923 * 128 - 1536 || Static127.anInt2696 * 128 - 1536 <= arg1.anInt6055)) {
			arg1.anInt6079 = -1;
			arg1.anInt6123 = 0;
			arg1.anInt6108 = 0;
			arg1.anInt6092 = -1;
			local5 = -1;
			local7 = 0;
			arg1.anInt6104 = -1;
			arg1.anInt6053 = arg1.anIntArray453[0] * 128 + arg1.method4831() * 64;
			arg1.anInt6055 = arg1.anIntArray454[0] * 128 + arg1.method4831() * 64;
			arg1.method4845();
		}
		@Pc(206) int local206 = Static2.method64(arg1);
		Static376.method5787(arg1, local206, local5, local7);
		Static302.method4452(arg1);
	}
}
